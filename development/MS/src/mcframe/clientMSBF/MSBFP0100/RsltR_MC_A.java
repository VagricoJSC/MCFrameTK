package mcframe.clientMSBF.MSBFP0100;

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
	 * Allow shipping 出荷許可.<p>
	 *
	 */
	public static final String $acpt_flg = "acpt_flg";
	/**
	 * Prohibit shipping 出荷禁止.<p>
	 *
	 */
	public static final String $not_acpt_flg = "not_acpt_flg";
	/**
	 * Market release decision No. 市場出荷判定ＮＯ.<p>
	 *
	 */
	public static final String $mrkt_judg_no = "mrkt_judg_no";
	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ = "mrkt_judg_sts_typ";
	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ_nm = "mrkt_judg_sts_typ_nm";
	public static final String $itm_p = "itm_p";
	/**
	 * Notification name 届出名.<p>
	 *
	 */
	public static final String $ntfy_nm = "ntfy_nm";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	public static final String $lot_no_p = "lot_no_p";
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
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	public static final String $qty_p = "qty_p";
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 * Update date 更新日.<p>
	 *
	 */
	public static final String $upd_dt = "upd_dt";
	public static final String $mrkt_upd_usr_dpt_p = "mrkt_upd_usr_dpt_p";
	/**
	 * Main PIC (Decision) 主担当（判定）.<p>
	 *
	 */
	public static final String $main_flg = "main_flg";
	/**
	 * Record sheet of market release decision issued flg. 市場出荷判定記録書発行済ＦＬＧ.<p>
	 *
	 */
	public static final String $mrkt_judg_prnt_flg = "mrkt_judg_prnt_flg";
	/**
	 * Record sheet of market release decision issued date and time 市場出荷判定記録書発行日時.<p>
	 *
	 */
	public static final String $mrkt_judg_prnt_tm = "mrkt_judg_prnt_tm";
	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public static final String $judg_dt = "judg_dt";
	public static final String $usr_dpt_p = "usr_dpt_p";
	public static final String $judg_rsn_p = "judg_rsn_p";
	/**
	 * Shipping approval result from mfg. site 製造所からの出荷承認結果.<p>
	 *
	 */
	public static final String $mfg_so_aprv_typ = "mfg_so_aprv_typ";
	/**
	 * Shipping approval result name from mfg. site 製造所からの出荷承認結果名.<p>
	 *
	 */
	public static final String $mfg_so_aprv_typ_nm = "mfg_so_aprv_typ_nm";
	/**
	 * Inspection result 品質管理結果.<p>
	 *
	 */
	public static final String $quality_mng_typ = "quality_mng_typ";
	/**
	 * Inspection result name 品質管理結果名.<p>
	 *
	 */
	public static final String $quality_mng_typ_nm = "quality_mng_typ_nm";
	/**
	 * Mfg. management result 製造管理結果.<p>
	 *
	 */
	public static final String $mfg_mng_typ = "mfg_mng_typ";
	/**
	 * Mfg. management result name 製造管理結果名.<p>
	 *
	 */
	public static final String $mfg_mng_typ_nm = "mfg_mng_typ_nm";
	/**
	 * Existence of deviation 逸脱有無.<p>
	 *
	 */
	public static final String $deviant_typ = "deviant_typ";
	/**
	 * Existence of deviation name 逸脱有無名.<p>
	 *
	 */
	public static final String $deviant_typ_nm = "deviant_typ_nm";
	/**
	 * Deviation measure 逸脱措置.<p>
	 *
	 */
	public static final String $deviant_msr_typ = "deviant_msr_typ";
	/**
	 * Deviation measure name 逸脱措置名.<p>
	 *
	 */
	public static final String $deviant_msr_typ_nm = "deviant_msr_typ_nm";
	/**
	 * Product info. of quality/validity/safety 製品の品質・有効性・安全性の情報.<p>
	 *
	 */
	public static final String $prod_itm_info_typ = "prod_itm_info_typ";
	/**
	 * Product info. name of quality/validity/safety 製品の品質・有効性・安全性の情報名.<p>
	 *
	 */
	public static final String $prod_itm_info_typ_nm = "prod_itm_info_typ_nm";
	/**
	 * Raw material quality/validity/safety info. 原材料の品質・有効性・安全性の情報.<p>
	 *
	 */
	public static final String $chd_itm_info_typ = "chd_itm_info_typ";
	/**
	 * Raw material quality/validity/safety info. name 原材料の品質・有効性・安全性の情報名.<p>
	 *
	 */
	public static final String $chd_itm_info_typ_nm = "chd_itm_info_typ_nm";
	/**
	 * Remarks 特記事項.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Input completed 入力済.<p>
	 *
	 */
	public static final String $input_flg = "input_flg";
	/**
	 * Add 追加.<p>
	 *
	 */
	public static final String $add_flg = "add_flg";
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
	 * Immediate issue flg. 即時発行ＦＬＧ.<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $crt_lot_flg = $lot_no_p + ".crt_lot_flg";
	public static final String $lot_no = $lot_no_p + ".lot_no";
	public static final String $sublot_no = $lot_no_p + ".sublot_no";
	public static final String $base_unit_qty = $qty_p + ".qty";
	public static final String $mrkt_upd_usr_cd = $mrkt_upd_usr_dpt_p + ".usr_cd";
	public static final String $mrkt_upd_usr_nm = $mrkt_upd_usr_dpt_p + ".usr_nm";
	public static final String $mrkt_upd_usr_dpt_cd = $mrkt_upd_usr_dpt_p + ".dpt_cd";
	public static final String $mrkt_upd_usr_dpt_nm = $mrkt_upd_usr_dpt_p + ".dpt_nm";
	public static final String $judg_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $judg_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $judg_usr_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $judg_usr_dpt_nm = $usr_dpt_p + ".dpt_nm";
	public static final String $judg_rsn = $judg_rsn_p + ".txt";
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

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acpt_flg_META = createCommonMeta($acpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_acpt_flg_META = createCommonMeta($not_acpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_no_META = createCommonMeta($mrkt_judg_no, mcframe.commonMA.meta.MA_META.MRKT_JUDG_NO);
	public static final MCMeta mrkt_judg_sts_typ_META = createCommonMeta($mrkt_judg_sts_typ, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP);
	public static final MCMeta mrkt_judg_sts_typ_nm_META = createCommonMeta($mrkt_judg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta ntfy_nm_META = createCommonMeta($ntfy_nm, mcframe.commonMA.meta.MA_META.NTFY_NM);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta lot_no_p_META = createInnerRowMeta($lot_no_p, mcframe.clientMSUB.MSUBP5030.LotNoR.class);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta qty_p_META = createInnerRowMeta($qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta upd_dt_META = createCommonMeta($upd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrkt_upd_usr_dpt_p_META = createInnerRowMeta($mrkt_upd_usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta main_flg_META = createCommonMeta($main_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_prnt_flg_META = createCommonMeta($mrkt_judg_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_prnt_tm_META = createCommonMeta($mrkt_judg_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta judg_dt_META = createCommonMeta($judg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta judg_rsn_p_META = createInnerRowMeta($judg_rsn_p, mcframe.clientMAUB.MAUBP5370.TxtR.class);
	public static final MCMeta mfg_so_aprv_typ_META = createCommonMeta($mfg_so_aprv_typ, mcframe.commonMS.meta.MS_META.MFG_SO_APRV_TYP);
	public static final MCMeta mfg_so_aprv_typ_nm_META = createCommonMeta($mfg_so_aprv_typ_nm, mcframe.commonMS.meta.MS_META.MFG_SO_APRV_TYP_NM);
	public static final MCMeta quality_mng_typ_META = createCommonMeta($quality_mng_typ, mcframe.commonMS.meta.MS_META.QUALITY_MNG_TYP);
	public static final MCMeta quality_mng_typ_nm_META = createCommonMeta($quality_mng_typ_nm, mcframe.commonMS.meta.MS_META.QUALITY_MNG_TYP_NM);
	public static final MCMeta mfg_mng_typ_META = createCommonMeta($mfg_mng_typ, mcframe.commonMS.meta.MS_META.MFG_MNG_TYP);
	public static final MCMeta mfg_mng_typ_nm_META = createCommonMeta($mfg_mng_typ_nm, mcframe.commonMS.meta.MS_META.MFG_MNG_TYP_NM);
	public static final MCMeta deviant_typ_META = createCommonMeta($deviant_typ, mcframe.commonMS.meta.MS_META.DEVIANT_TYP);
	public static final MCMeta deviant_typ_nm_META = createCommonMeta($deviant_typ_nm, mcframe.commonMS.meta.MS_META.DEVIANT_TYP_NM);
	public static final MCMeta deviant_msr_typ_META = createCommonMeta($deviant_msr_typ, mcframe.commonMS.meta.MS_META.DEVIANT_MSR_TYP);
	public static final MCMeta deviant_msr_typ_nm_META = createCommonMeta($deviant_msr_typ_nm, mcframe.commonMS.meta.MS_META.DEVIANT_MSR_TYP_NM);
	public static final MCMeta prod_itm_info_typ_META = createCommonMeta($prod_itm_info_typ, mcframe.commonMS.meta.MS_META.PROD_ITM_INFO_TYP);
	public static final MCMeta prod_itm_info_typ_nm_META = createCommonMeta($prod_itm_info_typ_nm, mcframe.commonMS.meta.MS_META.PROD_ITM_INFO_TYP_NM);
	public static final MCMeta chd_itm_info_typ_META = createCommonMeta($chd_itm_info_typ, mcframe.commonMS.meta.MS_META.CHD_ITM_INFO_TYP);
	public static final MCMeta chd_itm_info_typ_nm_META = createCommonMeta($chd_itm_info_typ_nm, mcframe.commonMS.meta.MS_META.CHD_ITM_INFO_TYP_NM);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.MRKT_JUDG_INTR_RMRKS);
	public static final MCMeta input_flg_META = createCommonMeta($input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta add_flg_META = createCommonMeta($add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.MRKT_JUDG_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.MRKT_JUDG_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.MRKT_JUDG_SUB_CHAR3);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
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
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			acpt_flg_META,
			not_acpt_flg_META,
			mrkt_judg_no_META,
			mrkt_judg_sts_typ_META,
			mrkt_judg_sts_typ_nm_META,
			itm_p_META,
			ntfy_nm_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			lot_no_p_META,
			site_cd_META,
			site_nm_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			qty_p_META,
			vld_dt_META,
			upd_dt_META,
			mrkt_upd_usr_dpt_p_META,
			main_flg_META,
			mrkt_judg_prnt_flg_META,
			mrkt_judg_prnt_tm_META,
			judg_dt_META,
			usr_dpt_p_META,
			judg_rsn_p_META,
			mfg_so_aprv_typ_META,
			mfg_so_aprv_typ_nm_META,
			quality_mng_typ_META,
			quality_mng_typ_nm_META,
			mfg_mng_typ_META,
			mfg_mng_typ_nm_META,
			deviant_typ_META,
			deviant_typ_nm_META,
			deviant_msr_typ_META,
			deviant_msr_typ_nm_META,
			prod_itm_info_typ_META,
			prod_itm_info_typ_nm_META,
			chd_itm_info_typ_META,
			chd_itm_info_typ_nm_META,
			intr_rmrks_META,
			input_flg_META,
			add_flg_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			rts_msg_p_META,
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
			prnt_flg_META,
			data_crud_typ_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"crt_lot_flg",
				"lot_no",
				"sublot_no",
				"base_unit_qty",
				"mrkt_upd_usr_cd",
				"mrkt_upd_usr_nm",
				"mrkt_upd_usr_dpt_cd",
				"mrkt_upd_usr_dpt_nm",
				"judg_usr_cd",
				"judg_usr_nm",
				"judg_usr_dpt_cd",
				"judg_usr_dpt_nm",
				"judg_rsn",
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
				"itm_grp_nm10"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$crt_lot_flg,
				$lot_no,
				$sublot_no,
				$base_unit_qty,
				$mrkt_upd_usr_cd,
				$mrkt_upd_usr_nm,
				$mrkt_upd_usr_dpt_cd,
				$mrkt_upd_usr_dpt_nm,
				$judg_usr_cd,
				$judg_usr_nm,
				$judg_usr_dpt_cd,
				$judg_usr_dpt_nm,
				$judg_rsn,
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
				{$itm_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3;unit_cd;unit_nm;dec_place;lot_mng_typ;sublot_mng_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3;unit_cd;unit_nm;dec_place;lot_mng_typ;sublot_mng_typ"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_nm;itm_sub3;unit_cd;unit_nm;dec_place;lot_mng_typ;sublot_mng_typ"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_nm;unit_cd;unit_nm;dec_place;lot_mng_typ;sublot_mng_typ"},	// itm_p.itm_sub3
				{$mrkt_upd_usr_dpt_p + ".dpt_cd", "dpt_nm"},	// mrkt_upd_usr_dpt_p.dpt_cd
				{$usr_dpt_p + ".dpt_cd", "dpt_nm"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.LOT"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.LOT;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.LOT;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.LOT;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$mrkt_upd_usr_dpt_p + ".dpt_cd", "upd_dt;mrkt_upd_usr_cd;MAC_DPT_IS_SRCH_TYP.INSP"},	// mrkt_upd_usr_dpt_p.dpt_cd
				{$usr_dpt_p + ".dpt_cd", "judg_dt;judg_usr_cd;MAC_DPT_IS_SRCH_TYP.INSP"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$mrkt_upd_usr_dpt_p + ".dpt_cd", "dt;usr_cd;dpt_is_srch_typ"},	// mrkt_upd_usr_dpt_p.dpt_cd
				{$usr_dpt_p + ".dpt_cd", "dt;usr_cd;dpt_is_srch_typ"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"}	// site_nm
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
	 * Allow shipping 出荷許可.<p>
	 *
	 */
	public boolean acpt_flg() {
		return getConstBoolean(offset + 1, $acpt_flg);
	}

	/**
	 * Allow shipping 出荷許可.<p>
	 *
	 */
	public void acpt_flg(boolean value) {
		setConstBoolean(offset + 1, $acpt_flg, value);
	}


	/**
	 * Prohibit shipping 出荷禁止.<p>
	 *
	 */
	public boolean not_acpt_flg() {
		return getConstBoolean(offset + 2, $not_acpt_flg);
	}

	/**
	 * Prohibit shipping 出荷禁止.<p>
	 *
	 */
	public void not_acpt_flg(boolean value) {
		setConstBoolean(offset + 2, $not_acpt_flg, value);
	}


	/**
	 * Market release decision No. 市場出荷判定ＮＯ.<p>
	 *
	 */
	public String mrkt_judg_no() {
		return getConstString(offset + 3, $mrkt_judg_no);
	}

	/**
	 * Market release decision No. 市場出荷判定ＮＯ.<p>
	 *
	 */
	public void mrkt_judg_no(String value) {
		setConstString(offset + 3, $mrkt_judg_no, value);
	}


	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public String mrkt_judg_sts_typ() {
		return getConstString(offset + 4, $mrkt_judg_sts_typ);
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public void mrkt_judg_sts_typ(String value) {
		setConstString(offset + 4, $mrkt_judg_sts_typ, value);
	}


	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public String mrkt_judg_sts_typ_nm() {
		return getConstString(offset + 5, $mrkt_judg_sts_typ_nm);
	}

	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_nm(String value) {
		setConstString(offset + 5, $mrkt_judg_sts_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 6, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 6, $itm_p, row);
	}


	/**
	 * Notification name 届出名.<p>
	 *
	 */
	public String ntfy_nm() {
		return getConstString(offset + 7, $ntfy_nm);
	}

	/**
	 * Notification name 届出名.<p>
	 *
	 */
	public void ntfy_nm(String value) {
		setConstString(offset + 7, $ntfy_nm, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 8, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 8, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 9, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 9, $sublot_mng_typ, value);
	}


	public mcframe.clientMSUB.MSUBP5030.LotNoR lot_no_p(){
		return (mcframe.clientMSUB.MSUBP5030.LotNoR) getConstInnerRow(offset + 10, $lot_no_p);
	}
	
	public void lot_no_p(mcframe.clientMSUB.MSUBP5030.LotNoR row){
		setConstInnerRow(offset + 10, $lot_no_p, row);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 11, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 11, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 12, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 12, $site_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 13, $base_unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 13, $base_unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 14, $base_unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 14, $base_unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 15, $base_unit_dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 15, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 15, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 15, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 15, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 15, $base_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 16, $qty_p);
	}
	
	public void qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 16, $qty_p, row);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 17, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 17, $vld_dt, value);
	}


	/**
	 * Update date 更新日.<p>
	 *
	 */
	public MCDate upd_dt() {
		return getConstDate(offset + 18, $upd_dt);
	}

	/**
	 * Update date 更新日.<p>
	 *
	 */
	public void upd_dt(MCDate value) {
		setConstDate(offset + 18, $upd_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR mrkt_upd_usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 19, $mrkt_upd_usr_dpt_p);
	}
	
	public void mrkt_upd_usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 19, $mrkt_upd_usr_dpt_p, row);
	}


	/**
	 * Main PIC (Decision) 主担当（判定）.<p>
	 *
	 */
	public boolean main_flg() {
		return getConstBoolean(offset + 20, $main_flg);
	}

	/**
	 * Main PIC (Decision) 主担当（判定）.<p>
	 *
	 */
	public void main_flg(boolean value) {
		setConstBoolean(offset + 20, $main_flg, value);
	}


	/**
	 * Record sheet of market release decision issued flg. 市場出荷判定記録書発行済ＦＬＧ.<p>
	 *
	 */
	public boolean mrkt_judg_prnt_flg() {
		return getConstBoolean(offset + 21, $mrkt_judg_prnt_flg);
	}

	/**
	 * Record sheet of market release decision issued flg. 市場出荷判定記録書発行済ＦＬＧ.<p>
	 *
	 */
	public void mrkt_judg_prnt_flg(boolean value) {
		setConstBoolean(offset + 21, $mrkt_judg_prnt_flg, value);
	}


	/**
	 * Record sheet of market release decision issued date and time 市場出荷判定記録書発行日時.<p>
	 *
	 */
	public MCDate mrkt_judg_prnt_tm() {
		return getConstDate(offset + 22, $mrkt_judg_prnt_tm);
	}

	/**
	 * Record sheet of market release decision issued date and time 市場出荷判定記録書発行日時.<p>
	 *
	 */
	public void mrkt_judg_prnt_tm(MCDate value) {
		setConstDate(offset + 22, $mrkt_judg_prnt_tm, value);
	}


	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public MCDate judg_dt() {
		return getConstDate(offset + 23, $judg_dt);
	}

	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public void judg_dt(MCDate value) {
		setConstDate(offset + 23, $judg_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 24, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 24, $usr_dpt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5370.TxtR judg_rsn_p(){
		return (mcframe.clientMAUB.MAUBP5370.TxtR) getConstInnerRow(offset + 25, $judg_rsn_p);
	}
	
	public void judg_rsn_p(mcframe.clientMAUB.MAUBP5370.TxtR row){
		setConstInnerRow(offset + 25, $judg_rsn_p, row);
	}


	/**
	 * Shipping approval result from mfg. site 製造所からの出荷承認結果.<p>
	 *
	 */
	public String mfg_so_aprv_typ() {
		return getConstString(offset + 26, $mfg_so_aprv_typ);
	}

	/**
	 * Shipping approval result from mfg. site 製造所からの出荷承認結果.<p>
	 *
	 */
	public void mfg_so_aprv_typ(String value) {
		setConstString(offset + 26, $mfg_so_aprv_typ, value);
	}


	/**
	 * Shipping approval result name from mfg. site 製造所からの出荷承認結果名.<p>
	 *
	 */
	public String mfg_so_aprv_typ_nm() {
		return getConstString(offset + 27, $mfg_so_aprv_typ_nm);
	}

	/**
	 * Shipping approval result name from mfg. site 製造所からの出荷承認結果名.<p>
	 *
	 */
	public void mfg_so_aprv_typ_nm(String value) {
		setConstString(offset + 27, $mfg_so_aprv_typ_nm, value);
	}


	/**
	 * Inspection result 品質管理結果.<p>
	 *
	 */
	public String quality_mng_typ() {
		return getConstString(offset + 28, $quality_mng_typ);
	}

	/**
	 * Inspection result 品質管理結果.<p>
	 *
	 */
	public void quality_mng_typ(String value) {
		setConstString(offset + 28, $quality_mng_typ, value);
	}


	/**
	 * Inspection result name 品質管理結果名.<p>
	 *
	 */
	public String quality_mng_typ_nm() {
		return getConstString(offset + 29, $quality_mng_typ_nm);
	}

	/**
	 * Inspection result name 品質管理結果名.<p>
	 *
	 */
	public void quality_mng_typ_nm(String value) {
		setConstString(offset + 29, $quality_mng_typ_nm, value);
	}


	/**
	 * Mfg. management result 製造管理結果.<p>
	 *
	 */
	public String mfg_mng_typ() {
		return getConstString(offset + 30, $mfg_mng_typ);
	}

	/**
	 * Mfg. management result 製造管理結果.<p>
	 *
	 */
	public void mfg_mng_typ(String value) {
		setConstString(offset + 30, $mfg_mng_typ, value);
	}


	/**
	 * Mfg. management result name 製造管理結果名.<p>
	 *
	 */
	public String mfg_mng_typ_nm() {
		return getConstString(offset + 31, $mfg_mng_typ_nm);
	}

	/**
	 * Mfg. management result name 製造管理結果名.<p>
	 *
	 */
	public void mfg_mng_typ_nm(String value) {
		setConstString(offset + 31, $mfg_mng_typ_nm, value);
	}


	/**
	 * Existence of deviation 逸脱有無.<p>
	 *
	 */
	public String deviant_typ() {
		return getConstString(offset + 32, $deviant_typ);
	}

	/**
	 * Existence of deviation 逸脱有無.<p>
	 *
	 */
	public void deviant_typ(String value) {
		setConstString(offset + 32, $deviant_typ, value);
	}


	/**
	 * Existence of deviation name 逸脱有無名.<p>
	 *
	 */
	public String deviant_typ_nm() {
		return getConstString(offset + 33, $deviant_typ_nm);
	}

	/**
	 * Existence of deviation name 逸脱有無名.<p>
	 *
	 */
	public void deviant_typ_nm(String value) {
		setConstString(offset + 33, $deviant_typ_nm, value);
	}


	/**
	 * Deviation measure 逸脱措置.<p>
	 *
	 */
	public String deviant_msr_typ() {
		return getConstString(offset + 34, $deviant_msr_typ);
	}

	/**
	 * Deviation measure 逸脱措置.<p>
	 *
	 */
	public void deviant_msr_typ(String value) {
		setConstString(offset + 34, $deviant_msr_typ, value);
	}


	/**
	 * Deviation measure name 逸脱措置名.<p>
	 *
	 */
	public String deviant_msr_typ_nm() {
		return getConstString(offset + 35, $deviant_msr_typ_nm);
	}

	/**
	 * Deviation measure name 逸脱措置名.<p>
	 *
	 */
	public void deviant_msr_typ_nm(String value) {
		setConstString(offset + 35, $deviant_msr_typ_nm, value);
	}


	/**
	 * Product info. of quality/validity/safety 製品の品質・有効性・安全性の情報.<p>
	 *
	 */
	public String prod_itm_info_typ() {
		return getConstString(offset + 36, $prod_itm_info_typ);
	}

	/**
	 * Product info. of quality/validity/safety 製品の品質・有効性・安全性の情報.<p>
	 *
	 */
	public void prod_itm_info_typ(String value) {
		setConstString(offset + 36, $prod_itm_info_typ, value);
	}


	/**
	 * Product info. name of quality/validity/safety 製品の品質・有効性・安全性の情報名.<p>
	 *
	 */
	public String prod_itm_info_typ_nm() {
		return getConstString(offset + 37, $prod_itm_info_typ_nm);
	}

	/**
	 * Product info. name of quality/validity/safety 製品の品質・有効性・安全性の情報名.<p>
	 *
	 */
	public void prod_itm_info_typ_nm(String value) {
		setConstString(offset + 37, $prod_itm_info_typ_nm, value);
	}


	/**
	 * Raw material quality/validity/safety info. 原材料の品質・有効性・安全性の情報.<p>
	 *
	 */
	public String chd_itm_info_typ() {
		return getConstString(offset + 38, $chd_itm_info_typ);
	}

	/**
	 * Raw material quality/validity/safety info. 原材料の品質・有効性・安全性の情報.<p>
	 *
	 */
	public void chd_itm_info_typ(String value) {
		setConstString(offset + 38, $chd_itm_info_typ, value);
	}


	/**
	 * Raw material quality/validity/safety info. name 原材料の品質・有効性・安全性の情報名.<p>
	 *
	 */
	public String chd_itm_info_typ_nm() {
		return getConstString(offset + 39, $chd_itm_info_typ_nm);
	}

	/**
	 * Raw material quality/validity/safety info. name 原材料の品質・有効性・安全性の情報名.<p>
	 *
	 */
	public void chd_itm_info_typ_nm(String value) {
		setConstString(offset + 39, $chd_itm_info_typ_nm, value);
	}


	/**
	 * Remarks 特記事項.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 40, $intr_rmrks);
	}

	/**
	 * Remarks 特記事項.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 40, $intr_rmrks, value);
	}


	/**
	 * Input completed 入力済.<p>
	 *
	 */
	public boolean input_flg() {
		return getConstBoolean(offset + 41, $input_flg);
	}

	/**
	 * Input completed 入力済.<p>
	 *
	 */
	public void input_flg(boolean value) {
		setConstBoolean(offset + 41, $input_flg, value);
	}


	/**
	 * Add 追加.<p>
	 *
	 */
	public boolean add_flg() {
		return getConstBoolean(offset + 42, $add_flg);
	}

	/**
	 * Add 追加.<p>
	 *
	 */
	public void add_flg(boolean value) {
		setConstBoolean(offset + 42, $add_flg, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 43, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 43, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 44, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 44, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 45, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 45, $sub_char3, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 46, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 46, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 47, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 47, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 48, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 48, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 49, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 49, $itm_typ_d_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 50, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 50, $rts_msg_p, row);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 51, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 51, $itm_grp_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 52, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 52, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 53, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 53, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 54, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 54, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 55, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 55, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 56, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 56, $ins_ts, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 57, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 57, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 57, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 57, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 57, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 57, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 58, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 58, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 59, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 59, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 60, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 60, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 61, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 61, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 62, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 62, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 63, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 63, $upd_srv_req_no, value);
	}


	/**
	 * Immediate issue flg. 即時発行ＦＬＧ.<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 64, $prnt_flg);
	}

	/**
	 * Immediate issue flg. 即時発行ＦＬＧ.<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 64, $prnt_flg, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 65, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 65, $data_crud_typ, value);
	}


	public String getString(String name) {
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			return mrkt_judg_no();
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
		}
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			return ntfy_nm();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			return mfg_so_aprv_typ();
		}
		if ($mfg_so_aprv_typ_nm.equalsIgnoreCase(name)) {
			return mfg_so_aprv_typ_nm();
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			return quality_mng_typ();
		}
		if ($quality_mng_typ_nm.equalsIgnoreCase(name)) {
			return quality_mng_typ_nm();
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			return mfg_mng_typ();
		}
		if ($mfg_mng_typ_nm.equalsIgnoreCase(name)) {
			return mfg_mng_typ_nm();
		}
		if ($deviant_typ.equalsIgnoreCase(name)) {
			return deviant_typ();
		}
		if ($deviant_typ_nm.equalsIgnoreCase(name)) {
			return deviant_typ_nm();
		}
		if ($deviant_msr_typ.equalsIgnoreCase(name)) {
			return deviant_msr_typ();
		}
		if ($deviant_msr_typ_nm.equalsIgnoreCase(name)) {
			return deviant_msr_typ_nm();
		}
		if ($prod_itm_info_typ.equalsIgnoreCase(name)) {
			return prod_itm_info_typ();
		}
		if ($prod_itm_info_typ_nm.equalsIgnoreCase(name)) {
			return prod_itm_info_typ_nm();
		}
		if ($chd_itm_info_typ.equalsIgnoreCase(name)) {
			return chd_itm_info_typ();
		}
		if ($chd_itm_info_typ_nm.equalsIgnoreCase(name)) {
			return chd_itm_info_typ_nm();
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($upd_dt.equalsIgnoreCase(name)) {
			return upd_dt();
		}
		if ($mrkt_judg_prnt_tm.equalsIgnoreCase(name)) {
			return mrkt_judg_prnt_tm();
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
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
		if ($acpt_flg.equalsIgnoreCase(name)) {
			return acpt_flg();
		}
		if ($not_acpt_flg.equalsIgnoreCase(name)) {
			return not_acpt_flg();
		}
		if ($main_flg.equalsIgnoreCase(name)) {
			return main_flg();
		}
		if ($mrkt_judg_prnt_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_prnt_flg();
		}
		if ($input_flg.equalsIgnoreCase(name)) {
			return input_flg();
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			return add_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			return mrkt_judg_no();
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
		}
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			return ntfy_nm();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			return mfg_so_aprv_typ();
		}
		if ($mfg_so_aprv_typ_nm.equalsIgnoreCase(name)) {
			return mfg_so_aprv_typ_nm();
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			return quality_mng_typ();
		}
		if ($quality_mng_typ_nm.equalsIgnoreCase(name)) {
			return quality_mng_typ_nm();
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			return mfg_mng_typ();
		}
		if ($mfg_mng_typ_nm.equalsIgnoreCase(name)) {
			return mfg_mng_typ_nm();
		}
		if ($deviant_typ.equalsIgnoreCase(name)) {
			return deviant_typ();
		}
		if ($deviant_typ_nm.equalsIgnoreCase(name)) {
			return deviant_typ_nm();
		}
		if ($deviant_msr_typ.equalsIgnoreCase(name)) {
			return deviant_msr_typ();
		}
		if ($deviant_msr_typ_nm.equalsIgnoreCase(name)) {
			return deviant_msr_typ_nm();
		}
		if ($prod_itm_info_typ.equalsIgnoreCase(name)) {
			return prod_itm_info_typ();
		}
		if ($prod_itm_info_typ_nm.equalsIgnoreCase(name)) {
			return prod_itm_info_typ_nm();
		}
		if ($chd_itm_info_typ.equalsIgnoreCase(name)) {
			return chd_itm_info_typ();
		}
		if ($chd_itm_info_typ_nm.equalsIgnoreCase(name)) {
			return chd_itm_info_typ_nm();
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($upd_dt.equalsIgnoreCase(name)) {
			return upd_dt();
		}
		if ($mrkt_judg_prnt_tm.equalsIgnoreCase(name)) {
			return mrkt_judg_prnt_tm();
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
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
		if ($acpt_flg.equalsIgnoreCase(name)) {
			return acpt_flg();
		}
		if ($not_acpt_flg.equalsIgnoreCase(name)) {
			return not_acpt_flg();
		}
		if ($main_flg.equalsIgnoreCase(name)) {
			return main_flg();
		}
		if ($mrkt_judg_prnt_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_prnt_flg();
		}
		if ($input_flg.equalsIgnoreCase(name)) {
			return input_flg();
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			return add_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			mrkt_judg_no(value);
			return;
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_nm(value);
			return;
		}
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			ntfy_nm(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			mfg_so_aprv_typ(value);
			return;
		}
		if ($mfg_so_aprv_typ_nm.equalsIgnoreCase(name)) {
			mfg_so_aprv_typ_nm(value);
			return;
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			quality_mng_typ(value);
			return;
		}
		if ($quality_mng_typ_nm.equalsIgnoreCase(name)) {
			quality_mng_typ_nm(value);
			return;
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			mfg_mng_typ(value);
			return;
		}
		if ($mfg_mng_typ_nm.equalsIgnoreCase(name)) {
			mfg_mng_typ_nm(value);
			return;
		}
		if ($deviant_typ.equalsIgnoreCase(name)) {
			deviant_typ(value);
			return;
		}
		if ($deviant_typ_nm.equalsIgnoreCase(name)) {
			deviant_typ_nm(value);
			return;
		}
		if ($deviant_msr_typ.equalsIgnoreCase(name)) {
			deviant_msr_typ(value);
			return;
		}
		if ($deviant_msr_typ_nm.equalsIgnoreCase(name)) {
			deviant_msr_typ_nm(value);
			return;
		}
		if ($prod_itm_info_typ.equalsIgnoreCase(name)) {
			prod_itm_info_typ(value);
			return;
		}
		if ($prod_itm_info_typ_nm.equalsIgnoreCase(name)) {
			prod_itm_info_typ_nm(value);
			return;
		}
		if ($chd_itm_info_typ.equalsIgnoreCase(name)) {
			chd_itm_info_typ(value);
			return;
		}
		if ($chd_itm_info_typ_nm.equalsIgnoreCase(name)) {
			chd_itm_info_typ_nm(value);
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
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
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($upd_dt.equalsIgnoreCase(name)) {
			upd_dt(value);
			return;
		}
		if ($mrkt_judg_prnt_tm.equalsIgnoreCase(name)) {
			mrkt_judg_prnt_tm(value);
			return;
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
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
		if ($acpt_flg.equalsIgnoreCase(name)) {
			acpt_flg(value);
			return;
		}
		if ($not_acpt_flg.equalsIgnoreCase(name)) {
			not_acpt_flg(value);
			return;
		}
		if ($main_flg.equalsIgnoreCase(name)) {
			main_flg(value);
			return;
		}
		if ($mrkt_judg_prnt_flg.equalsIgnoreCase(name)) {
			mrkt_judg_prnt_flg(value);
			return;
		}
		if ($input_flg.equalsIgnoreCase(name)) {
			input_flg(value);
			return;
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			add_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			mrkt_judg_no(value);
			return;
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_nm(value);
			return;
		}
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			ntfy_nm(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			mfg_so_aprv_typ(value);
			return;
		}
		if ($mfg_so_aprv_typ_nm.equalsIgnoreCase(name)) {
			mfg_so_aprv_typ_nm(value);
			return;
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			quality_mng_typ(value);
			return;
		}
		if ($quality_mng_typ_nm.equalsIgnoreCase(name)) {
			quality_mng_typ_nm(value);
			return;
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			mfg_mng_typ(value);
			return;
		}
		if ($mfg_mng_typ_nm.equalsIgnoreCase(name)) {
			mfg_mng_typ_nm(value);
			return;
		}
		if ($deviant_typ.equalsIgnoreCase(name)) {
			deviant_typ(value);
			return;
		}
		if ($deviant_typ_nm.equalsIgnoreCase(name)) {
			deviant_typ_nm(value);
			return;
		}
		if ($deviant_msr_typ.equalsIgnoreCase(name)) {
			deviant_msr_typ(value);
			return;
		}
		if ($deviant_msr_typ_nm.equalsIgnoreCase(name)) {
			deviant_msr_typ_nm(value);
			return;
		}
		if ($prod_itm_info_typ.equalsIgnoreCase(name)) {
			prod_itm_info_typ(value);
			return;
		}
		if ($prod_itm_info_typ_nm.equalsIgnoreCase(name)) {
			prod_itm_info_typ_nm(value);
			return;
		}
		if ($chd_itm_info_typ.equalsIgnoreCase(name)) {
			chd_itm_info_typ(value);
			return;
		}
		if ($chd_itm_info_typ_nm.equalsIgnoreCase(name)) {
			chd_itm_info_typ_nm(value);
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
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
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($upd_dt.equalsIgnoreCase(name)) {
			upd_dt(value);
			return;
		}
		if ($mrkt_judg_prnt_tm.equalsIgnoreCase(name)) {
			mrkt_judg_prnt_tm(value);
			return;
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
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
		if ($acpt_flg.equalsIgnoreCase(name)) {
			acpt_flg(value);
			return;
		}
		if ($not_acpt_flg.equalsIgnoreCase(name)) {
			not_acpt_flg(value);
			return;
		}
		if ($main_flg.equalsIgnoreCase(name)) {
			main_flg(value);
			return;
		}
		if ($mrkt_judg_prnt_flg.equalsIgnoreCase(name)) {
			mrkt_judg_prnt_flg(value);
			return;
		}
		if ($input_flg.equalsIgnoreCase(name)) {
			input_flg(value);
			return;
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			add_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($lot_no_p.equalsIgnoreCase(name)) {
			return lot_no_p();
		}
		if ($qty_p.equalsIgnoreCase(name)) {
			return qty_p();
		}
		if ($mrkt_upd_usr_dpt_p.equalsIgnoreCase(name)) {
			return mrkt_upd_usr_dpt_p();
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		if ($judg_rsn_p.equalsIgnoreCase(name)) {
			return judg_rsn_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
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
		if ($lot_no_p.equalsIgnoreCase(name)) {
			lot_no_p(
				((MCContainerMeta) lot_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5030.LotNoR.class, value)
			);
			return;
		}
		if ($qty_p.equalsIgnoreCase(name)) {
			qty_p(
				((MCContainerMeta) qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($mrkt_upd_usr_dpt_p.equalsIgnoreCase(name)) {
			mrkt_upd_usr_dpt_p(
				((MCContainerMeta) mrkt_upd_usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			usr_dpt_p(
				((MCContainerMeta) usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		if ($judg_rsn_p.equalsIgnoreCase(name)) {
			judg_rsn_p(
				((MCContainerMeta) judg_rsn_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5370.TxtR.class, value)
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

	public boolean crt_lot_flg() {
		return lot_no_p().crt_lot_flg();
	}

	public void crt_lot_flg(boolean value) {
		lot_no_p().crt_lot_flg(value);
	}

	public String lot_no() {
		return lot_no_p().lot_no();
	}

	public void lot_no(String value) {
		lot_no_p().lot_no(value);
	}

	public String sublot_no() {
		return lot_no_p().sublot_no();
	}

	public void sublot_no(String value) {
		lot_no_p().sublot_no(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return qty_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		qty_p().qty(value);
	}

	/**
	 * Updater cd. 更新者ＣＤ.<p>
	 *
	 */
	public String mrkt_upd_usr_cd() {
		return mrkt_upd_usr_dpt_p().usr_cd();
	}

	/**
	 * Updater cd. 更新者ＣＤ.<p>
	 *
	 */
	public void mrkt_upd_usr_cd(String value) {
		mrkt_upd_usr_dpt_p().usr_cd(value);
	}

	/**
	 * Update user name 更新者名.<p>
	 *
	 */
	public String mrkt_upd_usr_nm() {
		return mrkt_upd_usr_dpt_p().usr_nm();
	}

	/**
	 * Update user name 更新者名.<p>
	 *
	 */
	public void mrkt_upd_usr_nm(String value) {
		mrkt_upd_usr_dpt_p().usr_nm(value);
	}

	/**
	 * Update dept. cd. 更新部門ＣＤ.<p>
	 *
	 */
	public String mrkt_upd_usr_dpt_cd() {
		return mrkt_upd_usr_dpt_p().dpt_cd();
	}

	/**
	 * Update dept. cd. 更新部門ＣＤ.<p>
	 *
	 */
	public void mrkt_upd_usr_dpt_cd(String value) {
		mrkt_upd_usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Update dept. name 更新部門名.<p>
	 *
	 */
	public String mrkt_upd_usr_dpt_nm() {
		return mrkt_upd_usr_dpt_p().dpt_nm();
	}

	/**
	 * Update dept. name 更新部門名.<p>
	 *
	 */
	public void mrkt_upd_usr_dpt_nm(String value) {
		mrkt_upd_usr_dpt_p().dpt_nm(value);
	}

	/**
	 * Decision PIC cd. 判定者ＣＤ.<p>
	 *
	 */
	public String judg_usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * Decision PIC cd. 判定者ＣＤ.<p>
	 *
	 */
	public void judg_usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * Decision PIC name 判定者名.<p>
	 *
	 */
	public String judg_usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * Decision PIC name 判定者名.<p>
	 *
	 */
	public void judg_usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Decision dept. cd. 判定部門ＣＤ.<p>
	 *
	 */
	public String judg_usr_dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Decision dept. cd. 判定部門ＣＤ.<p>
	 *
	 */
	public void judg_usr_dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Decision dept. name 判定部門名.<p>
	 *
	 */
	public String judg_usr_dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Decision dept. name 判定部門名.<p>
	 *
	 */
	public void judg_usr_dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
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

}

