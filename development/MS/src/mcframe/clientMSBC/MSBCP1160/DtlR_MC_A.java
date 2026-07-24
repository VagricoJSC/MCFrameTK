package mcframe.clientMSBC.MSBCP1160;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	public static final String $chd_itm_p = "chd_itm_p";
	public static final String $ver_no_p = "ver_no_p";
	public static final String $par_itm_p = "par_itm_p";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	public static final String $sno_p = "sno_p";
	/**
	 * Version change status type 版切替状況区分.<p>
	 *
	 */
	public static final String $ver_chg_sts_typ = "ver_chg_sts_typ";
	/**
	 * Version change status type name 版切替状況区分名.<p>
	 *
	 */
	public static final String $ver_chg_sts_typ_nm = "ver_chg_sts_typ_nm";
	/**
	 * Completed 完了.<p>
	 *
	 */
	public static final String $cmpl_flg = "cmpl_flg";
	/**
	 * Application start date (Order) 適用開始日（指図）.<p>
	 *
	 */
	public static final String $first_inst_st_dt = "first_inst_st_dt";
	/**
	 * Application start time (Order) 適用開始時刻（指図）.<p>
	 *
	 */
	public static final String $first_inst_st_hm = "first_inst_st_hm";
	/**
	 * Start lot No. (Order) 開始ロットＮＯ（指図）.<p>
	 *
	 */
	public static final String $first_inst_lot_no = "first_inst_lot_no";
	/**
	 * Start sublot No. (Order) 開始サブロットＮＯ（指図）.<p>
	 *
	 */
	public static final String $first_inst_sublot_no = "first_inst_sublot_no";
	/**
	 * Application start date (Result) 適用開始日（実績）.<p>
	 *
	 */
	public static final String $first_act_st_dt = "first_act_st_dt";
	/**
	 * Application start time (Result) 適用開始時刻（実績）.<p>
	 *
	 */
	public static final String $first_act_st_hm = "first_act_st_hm";
	/**
	 * Start lot No. (Result) 開始ロットＮＯ（実績）.<p>
	 *
	 */
	public static final String $first_act_lot_no = "first_act_lot_no";
	/**
	 * Starting sublot No. (Result) 開始サブロットＮＯ（実績）.<p>
	 *
	 */
	public static final String $first_act_sublot_no = "first_act_sublot_no";
	/**
	 * Last start date 最終着手日.<p>
	 *
	 */
	public static final String $last_act_st_dt = "last_act_st_dt";
	/**
	 * Last start time 最終着手時刻.<p>
	 *
	 */
	public static final String $last_act_st_hm = "last_act_st_hm";
	/**
	 * Last lot No. 最終ロットＮＯ.<p>
	 *
	 */
	public static final String $last_act_lot_no = "last_act_lot_no";
	/**
	 * Last sublot No. 最終サブロットＮＯ.<p>
	 *
	 */
	public static final String $last_act_sublot_no = "last_act_sublot_no";
	/**
	 * Change remarks 切替備考.<p>
	 *
	 */
	public static final String $master_rmrks = "master_rmrks";
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
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
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
	 * Purchase application start date 購買適用開始日.<p>
	 *
	 */
	public static final String $purc_st_dt = "purc_st_dt";
	/**
	 * Start mfg. order No. (Order) 開始製造指図ＮＯ（指図）.<p>
	 *
	 */
	public static final String $first_mfg_inst_no = "first_mfg_inst_no";
	/**
	 * Start mfg. order No. (Result) 開始製造指図ＮＯ（実績）.<p>
	 *
	 */
	public static final String $first_act_mfg_inst_no = "first_act_mfg_inst_no";
	/**
	 * First mfg. result No. 開始製造実績ＮＯ.<p>
	 *
	 */
	public static final String $first_mfg_act_no = "first_mfg_act_no";
	/**
	 * Last mfg. order No. 最終製造指図ＮＯ.<p>
	 *
	 */
	public static final String $last_mfg_inst_no = "last_mfg_inst_no";
	/**
	 * Last mfg. result No. 最終製造実績ＮＯ.<p>
	 *
	 */
	public static final String $last_mfg_act_no = "last_mfg_act_no";
	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public static final String $chd_itm_typ = "chd_itm_typ";
	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public static final String $chd_itm_typ_nm = "chd_itm_typ_nm";
	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $chd_itm_typ_d_cd = "chd_itm_typ_d_cd";
	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public static final String $chd_itm_typ_d_nm = "chd_itm_typ_d_nm";
	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public static final String $par_itm_typ = "par_itm_typ";
	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public static final String $par_itm_typ_nm = "par_itm_typ_nm";
	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $par_itm_typ_d_cd = "par_itm_typ_d_cd";
	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public static final String $par_itm_typ_d_nm = "par_itm_typ_d_nm";
	public static final String $chd_itm_grp_p = "chd_itm_grp_p";
	public static final String $par_itm_grp_p = "par_itm_grp_p";
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

	public static final String $chd_itm_cd = $chd_itm_p + ".itm_cd";
	public static final String $chd_itm_sub1 = $chd_itm_p + ".itm_sub1";
	public static final String $chd_itm_sub2 = $chd_itm_p + ".itm_sub2";
	public static final String $chd_itm_sub3 = $chd_itm_p + ".itm_sub3";
	public static final String $chd_itm_nm = $chd_itm_p + ".itm_nm";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $par_itm_cd = $par_itm_p + ".itm_cd";
	public static final String $par_itm_sub1 = $par_itm_p + ".itm_sub1";
	public static final String $par_itm_sub2 = $par_itm_p + ".itm_sub2";
	public static final String $par_itm_sub3 = $par_itm_p + ".itm_sub3";
	public static final String $par_itm_nm = $par_itm_p + ".itm_nm";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4 = $sno_p + ".sno4";
	public static final String $chd_itm_grp_cd1 = $chd_itm_grp_p + ".itm_grp_cd1";
	public static final String $chd_itm_grp_nm1 = $chd_itm_grp_p + ".itm_grp_nm1";
	public static final String $chd_itm_grp_cd2 = $chd_itm_grp_p + ".itm_grp_cd2";
	public static final String $chd_itm_grp_nm2 = $chd_itm_grp_p + ".itm_grp_nm2";
	public static final String $chd_itm_grp_cd3 = $chd_itm_grp_p + ".itm_grp_cd3";
	public static final String $chd_itm_grp_nm3 = $chd_itm_grp_p + ".itm_grp_nm3";
	public static final String $chd_itm_grp_cd4 = $chd_itm_grp_p + ".itm_grp_cd4";
	public static final String $chd_itm_grp_nm4 = $chd_itm_grp_p + ".itm_grp_nm4";
	public static final String $chd_itm_grp_cd5 = $chd_itm_grp_p + ".itm_grp_cd5";
	public static final String $chd_itm_grp_nm5 = $chd_itm_grp_p + ".itm_grp_nm5";
	public static final String $chd_itm_grp_cd6 = $chd_itm_grp_p + ".itm_grp_cd6";
	public static final String $chd_itm_grp_nm6 = $chd_itm_grp_p + ".itm_grp_nm6";
	public static final String $chd_itm_grp_cd7 = $chd_itm_grp_p + ".itm_grp_cd7";
	public static final String $chd_itm_grp_nm7 = $chd_itm_grp_p + ".itm_grp_nm7";
	public static final String $chd_itm_grp_cd8 = $chd_itm_grp_p + ".itm_grp_cd8";
	public static final String $chd_itm_grp_nm8 = $chd_itm_grp_p + ".itm_grp_nm8";
	public static final String $chd_itm_grp_cd9 = $chd_itm_grp_p + ".itm_grp_cd9";
	public static final String $chd_itm_grp_nm9 = $chd_itm_grp_p + ".itm_grp_nm9";
	public static final String $chd_itm_grp_cd10 = $chd_itm_grp_p + ".itm_grp_cd10";
	public static final String $chd_itm_grp_nm10 = $chd_itm_grp_p + ".itm_grp_nm10";
	public static final String $par_itm_grp_cd1 = $par_itm_grp_p + ".itm_grp_cd1";
	public static final String $par_itm_grp_nm1 = $par_itm_grp_p + ".itm_grp_nm1";
	public static final String $par_itm_grp_cd2 = $par_itm_grp_p + ".itm_grp_cd2";
	public static final String $par_itm_grp_nm2 = $par_itm_grp_p + ".itm_grp_nm2";
	public static final String $par_itm_grp_cd3 = $par_itm_grp_p + ".itm_grp_cd3";
	public static final String $par_itm_grp_nm3 = $par_itm_grp_p + ".itm_grp_nm3";
	public static final String $par_itm_grp_cd4 = $par_itm_grp_p + ".itm_grp_cd4";
	public static final String $par_itm_grp_nm4 = $par_itm_grp_p + ".itm_grp_nm4";
	public static final String $par_itm_grp_cd5 = $par_itm_grp_p + ".itm_grp_cd5";
	public static final String $par_itm_grp_nm5 = $par_itm_grp_p + ".itm_grp_nm5";
	public static final String $par_itm_grp_cd6 = $par_itm_grp_p + ".itm_grp_cd6";
	public static final String $par_itm_grp_nm6 = $par_itm_grp_p + ".itm_grp_nm6";
	public static final String $par_itm_grp_cd7 = $par_itm_grp_p + ".itm_grp_cd7";
	public static final String $par_itm_grp_nm7 = $par_itm_grp_p + ".itm_grp_nm7";
	public static final String $par_itm_grp_cd8 = $par_itm_grp_p + ".itm_grp_cd8";
	public static final String $par_itm_grp_nm8 = $par_itm_grp_p + ".itm_grp_nm8";
	public static final String $par_itm_grp_cd9 = $par_itm_grp_p + ".itm_grp_cd9";
	public static final String $par_itm_grp_nm9 = $par_itm_grp_p + ".itm_grp_nm9";
	public static final String $par_itm_grp_cd10 = $par_itm_grp_p + ".itm_grp_cd10";
	public static final String $par_itm_grp_nm10 = $par_itm_grp_p + ".itm_grp_nm10";

	public static final MCMeta chd_itm_p_META = createInnerRowMeta($chd_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta par_itm_p_META = createInnerRowMeta($par_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMAUB.MAUBP5070.SnoR.class);
	public static final MCMeta ver_chg_sts_typ_META = createCommonMeta($ver_chg_sts_typ, mcframe.commonMS.meta.MS_META.VER_CHG_STS_TYP);
	public static final MCMeta ver_chg_sts_typ_nm_META = createCommonMeta($ver_chg_sts_typ_nm, mcframe.commonMS.meta.MS_META.VER_CHG_STS_TYP_NM);
	public static final MCMeta cmpl_flg_META = createCommonMeta($cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta first_inst_st_dt_META = createCommonMeta($first_inst_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta first_inst_st_hm_META = createCommonMeta($first_inst_st_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta first_inst_lot_no_META = createCommonMeta($first_inst_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta first_inst_sublot_no_META = createCommonMeta($first_inst_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta first_act_st_dt_META = createCommonMeta($first_act_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta first_act_st_hm_META = createCommonMeta($first_act_st_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta first_act_lot_no_META = createCommonMeta($first_act_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta first_act_sublot_no_META = createCommonMeta($first_act_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta last_act_st_dt_META = createCommonMeta($last_act_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta last_act_st_hm_META = createCommonMeta($last_act_st_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta last_act_lot_no_META = createCommonMeta($last_act_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta last_act_sublot_no_META = createCommonMeta($last_act_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta master_rmrks_META = createCommonMeta($master_rmrks, mcframe.commonMA.meta.MA_META.ITM_VER_VLD_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.VER_CHG_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.VER_CHG_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.VER_CHG_SUB_CHAR3);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta purc_st_dt_META = createCommonMeta($purc_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta first_mfg_inst_no_META = createCommonMeta($first_mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta first_act_mfg_inst_no_META = createCommonMeta($first_act_mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta first_mfg_act_no_META = createCommonMeta($first_mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta last_mfg_inst_no_META = createCommonMeta($last_mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta last_mfg_act_no_META = createCommonMeta($last_mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta chd_itm_typ_META = createCommonMeta($chd_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta chd_itm_typ_nm_META = createCommonMeta($chd_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta chd_itm_typ_d_cd_META = createCommonMeta($chd_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta chd_itm_typ_d_nm_META = createCommonMeta($chd_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta par_itm_typ_META = createCommonMeta($par_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta par_itm_typ_nm_META = createCommonMeta($par_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta par_itm_typ_d_cd_META = createCommonMeta($par_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta par_itm_typ_d_nm_META = createCommonMeta($par_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta chd_itm_grp_p_META = createInnerRowMeta($chd_itm_grp_p, mcframe.clientMAUB.MAUBP5170.ItmGrpR.class);
	public static final MCMeta par_itm_grp_p_META = createInnerRowMeta($par_itm_grp_p, mcframe.clientMAUB.MAUBP5170.ItmGrpR.class);
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

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			chd_itm_p_META,
			ver_no_p_META,
			par_itm_p_META,
			bom_ptn_META,
			sno_p_META,
			ver_chg_sts_typ_META,
			ver_chg_sts_typ_nm_META,
			cmpl_flg_META,
			first_inst_st_dt_META,
			first_inst_st_hm_META,
			first_inst_lot_no_META,
			first_inst_sublot_no_META,
			first_act_st_dt_META,
			first_act_st_hm_META,
			first_act_lot_no_META,
			first_act_sublot_no_META,
			last_act_st_dt_META,
			last_act_st_hm_META,
			last_act_lot_no_META,
			last_act_sublot_no_META,
			master_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			site_cd_META,
			site_nm_META,
			wg_cd_META,
			wg_nm_META,
			purc_st_dt_META,
			first_mfg_inst_no_META,
			first_act_mfg_inst_no_META,
			first_mfg_act_no_META,
			last_mfg_inst_no_META,
			last_mfg_act_no_META,
			chd_itm_typ_META,
			chd_itm_typ_nm_META,
			chd_itm_typ_d_cd_META,
			chd_itm_typ_d_nm_META,
			par_itm_typ_META,
			par_itm_typ_nm_META,
			par_itm_typ_d_cd_META,
			par_itm_typ_d_nm_META,
			chd_itm_grp_p_META,
			par_itm_grp_p_META,
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
				"chd_itm_cd",
				"chd_itm_sub1",
				"chd_itm_sub2",
				"chd_itm_sub3",
				"chd_itm_nm",
				"ver_no",
				"par_itm_cd",
				"par_itm_sub1",
				"par_itm_sub2",
				"par_itm_sub3",
				"par_itm_nm",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"chd_itm_grp_cd1",
				"chd_itm_grp_nm1",
				"chd_itm_grp_cd2",
				"chd_itm_grp_nm2",
				"chd_itm_grp_cd3",
				"chd_itm_grp_nm3",
				"chd_itm_grp_cd4",
				"chd_itm_grp_nm4",
				"chd_itm_grp_cd5",
				"chd_itm_grp_nm5",
				"chd_itm_grp_cd6",
				"chd_itm_grp_nm6",
				"chd_itm_grp_cd7",
				"chd_itm_grp_nm7",
				"chd_itm_grp_cd8",
				"chd_itm_grp_nm8",
				"chd_itm_grp_cd9",
				"chd_itm_grp_nm9",
				"chd_itm_grp_cd10",
				"chd_itm_grp_nm10",
				"par_itm_grp_cd1",
				"par_itm_grp_nm1",
				"par_itm_grp_cd2",
				"par_itm_grp_nm2",
				"par_itm_grp_cd3",
				"par_itm_grp_nm3",
				"par_itm_grp_cd4",
				"par_itm_grp_nm4",
				"par_itm_grp_cd5",
				"par_itm_grp_nm5",
				"par_itm_grp_cd6",
				"par_itm_grp_nm6",
				"par_itm_grp_cd7",
				"par_itm_grp_nm7",
				"par_itm_grp_cd8",
				"par_itm_grp_nm8",
				"par_itm_grp_cd9",
				"par_itm_grp_nm9",
				"par_itm_grp_cd10",
				"par_itm_grp_nm10"
			},
			{
				$chd_itm_cd,
				$chd_itm_sub1,
				$chd_itm_sub2,
				$chd_itm_sub3,
				$chd_itm_nm,
				$ver_no,
				$par_itm_cd,
				$par_itm_sub1,
				$par_itm_sub2,
				$par_itm_sub3,
				$par_itm_nm,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$chd_itm_grp_cd1,
				$chd_itm_grp_nm1,
				$chd_itm_grp_cd2,
				$chd_itm_grp_nm2,
				$chd_itm_grp_cd3,
				$chd_itm_grp_nm3,
				$chd_itm_grp_cd4,
				$chd_itm_grp_nm4,
				$chd_itm_grp_cd5,
				$chd_itm_grp_nm5,
				$chd_itm_grp_cd6,
				$chd_itm_grp_nm6,
				$chd_itm_grp_cd7,
				$chd_itm_grp_nm7,
				$chd_itm_grp_cd8,
				$chd_itm_grp_nm8,
				$chd_itm_grp_cd9,
				$chd_itm_grp_nm9,
				$chd_itm_grp_cd10,
				$chd_itm_grp_nm10,
				$par_itm_grp_cd1,
				$par_itm_grp_nm1,
				$par_itm_grp_cd2,
				$par_itm_grp_nm2,
				$par_itm_grp_cd3,
				$par_itm_grp_nm3,
				$par_itm_grp_cd4,
				$par_itm_grp_nm4,
				$par_itm_grp_cd5,
				$par_itm_grp_nm5,
				$par_itm_grp_cd6,
				$par_itm_grp_nm6,
				$par_itm_grp_cd7,
				$par_itm_grp_nm7,
				$par_itm_grp_cd8,
				$par_itm_grp_nm8,
				$par_itm_grp_cd9,
				$par_itm_grp_nm9,
				$par_itm_grp_cd10,
				$par_itm_grp_nm10
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

	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$first_inst_st_hm, "TM"},	// first_inst_st_hm
				{$first_act_st_hm, "TM"},	// first_act_st_hm
				{$last_act_st_hm, "TM"},	// last_act_st_hm
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP5030.ItmR chd_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 0, $chd_itm_p);
	}
	
	public void chd_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 0, $chd_itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 1, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 1, $ver_no_p, row);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR par_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 2, $par_itm_p);
	}
	
	public void par_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 2, $par_itm_p, row);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 3, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 3, $bom_ptn, value);
	}


	public mcframe.clientMAUB.MAUBP5070.SnoR sno_p(){
		return (mcframe.clientMAUB.MAUBP5070.SnoR) getConstInnerRow(offset + 4, $sno_p);
	}
	
	public void sno_p(mcframe.clientMAUB.MAUBP5070.SnoR row){
		setConstInnerRow(offset + 4, $sno_p, row);
	}


	/**
	 * Version change status type 版切替状況区分.<p>
	 *
	 */
	public String ver_chg_sts_typ() {
		return getConstString(offset + 5, $ver_chg_sts_typ);
	}

	/**
	 * Version change status type 版切替状況区分.<p>
	 *
	 */
	public void ver_chg_sts_typ(String value) {
		setConstString(offset + 5, $ver_chg_sts_typ, value);
	}


	/**
	 * Version change status type name 版切替状況区分名.<p>
	 *
	 */
	public String ver_chg_sts_typ_nm() {
		return getConstString(offset + 6, $ver_chg_sts_typ_nm);
	}

	/**
	 * Version change status type name 版切替状況区分名.<p>
	 *
	 */
	public void ver_chg_sts_typ_nm(String value) {
		setConstString(offset + 6, $ver_chg_sts_typ_nm, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean cmpl_flg() {
		return getConstBoolean(offset + 7, $cmpl_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void cmpl_flg(boolean value) {
		setConstBoolean(offset + 7, $cmpl_flg, value);
	}


	/**
	 * Application start date (Order) 適用開始日（指図）.<p>
	 *
	 */
	public MCDate first_inst_st_dt() {
		return getConstDate(offset + 8, $first_inst_st_dt);
	}

	/**
	 * Application start date (Order) 適用開始日（指図）.<p>
	 *
	 */
	public void first_inst_st_dt(MCDate value) {
		setConstDate(offset + 8, $first_inst_st_dt, value);
	}


	/**
	 * Application start time (Order) 適用開始時刻（指図）.<p>
	 *
	 */
	public MCDate first_inst_st_hm() {
		return getConstDate(offset + 9, $first_inst_st_hm);
	}

	/**
	 * Application start time (Order) 適用開始時刻（指図）.<p>
	 *
	 */
	public void first_inst_st_hm(MCDate value) {
		setConstDate(offset + 9, $first_inst_st_hm, value);
	}


	/**
	 * Start lot No. (Order) 開始ロットＮＯ（指図）.<p>
	 *
	 */
	public String first_inst_lot_no() {
		return getConstString(offset + 10, $first_inst_lot_no);
	}

	/**
	 * Start lot No. (Order) 開始ロットＮＯ（指図）.<p>
	 *
	 */
	public void first_inst_lot_no(String value) {
		setConstString(offset + 10, $first_inst_lot_no, value);
	}


	/**
	 * Start sublot No. (Order) 開始サブロットＮＯ（指図）.<p>
	 *
	 */
	public String first_inst_sublot_no() {
		return getConstString(offset + 11, $first_inst_sublot_no);
	}

	/**
	 * Start sublot No. (Order) 開始サブロットＮＯ（指図）.<p>
	 *
	 */
	public void first_inst_sublot_no(String value) {
		setConstString(offset + 11, $first_inst_sublot_no, value);
	}


	/**
	 * Application start date (Result) 適用開始日（実績）.<p>
	 *
	 */
	public MCDate first_act_st_dt() {
		return getConstDate(offset + 12, $first_act_st_dt);
	}

	/**
	 * Application start date (Result) 適用開始日（実績）.<p>
	 *
	 */
	public void first_act_st_dt(MCDate value) {
		setConstDate(offset + 12, $first_act_st_dt, value);
	}


	/**
	 * Application start time (Result) 適用開始時刻（実績）.<p>
	 *
	 */
	public MCDate first_act_st_hm() {
		return getConstDate(offset + 13, $first_act_st_hm);
	}

	/**
	 * Application start time (Result) 適用開始時刻（実績）.<p>
	 *
	 */
	public void first_act_st_hm(MCDate value) {
		setConstDate(offset + 13, $first_act_st_hm, value);
	}


	/**
	 * Start lot No. (Result) 開始ロットＮＯ（実績）.<p>
	 *
	 */
	public String first_act_lot_no() {
		return getConstString(offset + 14, $first_act_lot_no);
	}

	/**
	 * Start lot No. (Result) 開始ロットＮＯ（実績）.<p>
	 *
	 */
	public void first_act_lot_no(String value) {
		setConstString(offset + 14, $first_act_lot_no, value);
	}


	/**
	 * Starting sublot No. (Result) 開始サブロットＮＯ（実績）.<p>
	 *
	 */
	public String first_act_sublot_no() {
		return getConstString(offset + 15, $first_act_sublot_no);
	}

	/**
	 * Starting sublot No. (Result) 開始サブロットＮＯ（実績）.<p>
	 *
	 */
	public void first_act_sublot_no(String value) {
		setConstString(offset + 15, $first_act_sublot_no, value);
	}


	/**
	 * Last start date 最終着手日.<p>
	 *
	 */
	public MCDate last_act_st_dt() {
		return getConstDate(offset + 16, $last_act_st_dt);
	}

	/**
	 * Last start date 最終着手日.<p>
	 *
	 */
	public void last_act_st_dt(MCDate value) {
		setConstDate(offset + 16, $last_act_st_dt, value);
	}


	/**
	 * Last start time 最終着手時刻.<p>
	 *
	 */
	public MCDate last_act_st_hm() {
		return getConstDate(offset + 17, $last_act_st_hm);
	}

	/**
	 * Last start time 最終着手時刻.<p>
	 *
	 */
	public void last_act_st_hm(MCDate value) {
		setConstDate(offset + 17, $last_act_st_hm, value);
	}


	/**
	 * Last lot No. 最終ロットＮＯ.<p>
	 *
	 */
	public String last_act_lot_no() {
		return getConstString(offset + 18, $last_act_lot_no);
	}

	/**
	 * Last lot No. 最終ロットＮＯ.<p>
	 *
	 */
	public void last_act_lot_no(String value) {
		setConstString(offset + 18, $last_act_lot_no, value);
	}


	/**
	 * Last sublot No. 最終サブロットＮＯ.<p>
	 *
	 */
	public String last_act_sublot_no() {
		return getConstString(offset + 19, $last_act_sublot_no);
	}

	/**
	 * Last sublot No. 最終サブロットＮＯ.<p>
	 *
	 */
	public void last_act_sublot_no(String value) {
		setConstString(offset + 19, $last_act_sublot_no, value);
	}


	/**
	 * Change remarks 切替備考.<p>
	 *
	 */
	public String master_rmrks() {
		return getConstString(offset + 20, $master_rmrks);
	}

	/**
	 * Change remarks 切替備考.<p>
	 *
	 */
	public void master_rmrks(String value) {
		setConstString(offset + 20, $master_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 21, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 21, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 22, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 22, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 23, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 23, $sub_char3, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 24, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 24, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 25, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 25, $site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 26, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 26, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 27, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 27, $wg_nm, value);
	}


	/**
	 * Purchase application start date 購買適用開始日.<p>
	 *
	 */
	public MCDate purc_st_dt() {
		return getConstDate(offset + 28, $purc_st_dt);
	}

	/**
	 * Purchase application start date 購買適用開始日.<p>
	 *
	 */
	public void purc_st_dt(MCDate value) {
		setConstDate(offset + 28, $purc_st_dt, value);
	}


	/**
	 * Start mfg. order No. (Order) 開始製造指図ＮＯ（指図）.<p>
	 *
	 */
	public String first_mfg_inst_no() {
		return getConstString(offset + 29, $first_mfg_inst_no);
	}

	/**
	 * Start mfg. order No. (Order) 開始製造指図ＮＯ（指図）.<p>
	 *
	 */
	public void first_mfg_inst_no(String value) {
		setConstString(offset + 29, $first_mfg_inst_no, value);
	}


	/**
	 * Start mfg. order No. (Result) 開始製造指図ＮＯ（実績）.<p>
	 *
	 */
	public String first_act_mfg_inst_no() {
		return getConstString(offset + 30, $first_act_mfg_inst_no);
	}

	/**
	 * Start mfg. order No. (Result) 開始製造指図ＮＯ（実績）.<p>
	 *
	 */
	public void first_act_mfg_inst_no(String value) {
		setConstString(offset + 30, $first_act_mfg_inst_no, value);
	}


	/**
	 * First mfg. result No. 開始製造実績ＮＯ.<p>
	 *
	 */
	public String first_mfg_act_no() {
		return getConstString(offset + 31, $first_mfg_act_no);
	}

	/**
	 * First mfg. result No. 開始製造実績ＮＯ.<p>
	 *
	 */
	public void first_mfg_act_no(String value) {
		setConstString(offset + 31, $first_mfg_act_no, value);
	}


	/**
	 * Last mfg. order No. 最終製造指図ＮＯ.<p>
	 *
	 */
	public String last_mfg_inst_no() {
		return getConstString(offset + 32, $last_mfg_inst_no);
	}

	/**
	 * Last mfg. order No. 最終製造指図ＮＯ.<p>
	 *
	 */
	public void last_mfg_inst_no(String value) {
		setConstString(offset + 32, $last_mfg_inst_no, value);
	}


	/**
	 * Last mfg. result No. 最終製造実績ＮＯ.<p>
	 *
	 */
	public String last_mfg_act_no() {
		return getConstString(offset + 33, $last_mfg_act_no);
	}

	/**
	 * Last mfg. result No. 最終製造実績ＮＯ.<p>
	 *
	 */
	public void last_mfg_act_no(String value) {
		setConstString(offset + 33, $last_mfg_act_no, value);
	}


	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public String chd_itm_typ() {
		return getConstString(offset + 34, $chd_itm_typ);
	}

	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public void chd_itm_typ(String value) {
		setConstString(offset + 34, $chd_itm_typ, value);
	}


	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public String chd_itm_typ_nm() {
		return getConstString(offset + 35, $chd_itm_typ_nm);
	}

	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public void chd_itm_typ_nm(String value) {
		setConstString(offset + 35, $chd_itm_typ_nm, value);
	}


	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public String chd_itm_typ_d_cd() {
		return getConstString(offset + 36, $chd_itm_typ_d_cd);
	}

	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public void chd_itm_typ_d_cd(String value) {
		setConstString(offset + 36, $chd_itm_typ_d_cd, value);
	}


	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public String chd_itm_typ_d_nm() {
		return getConstString(offset + 37, $chd_itm_typ_d_nm);
	}

	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public void chd_itm_typ_d_nm(String value) {
		setConstString(offset + 37, $chd_itm_typ_d_nm, value);
	}


	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public String par_itm_typ() {
		return getConstString(offset + 38, $par_itm_typ);
	}

	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public void par_itm_typ(String value) {
		setConstString(offset + 38, $par_itm_typ, value);
	}


	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public String par_itm_typ_nm() {
		return getConstString(offset + 39, $par_itm_typ_nm);
	}

	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public void par_itm_typ_nm(String value) {
		setConstString(offset + 39, $par_itm_typ_nm, value);
	}


	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public String par_itm_typ_d_cd() {
		return getConstString(offset + 40, $par_itm_typ_d_cd);
	}

	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public void par_itm_typ_d_cd(String value) {
		setConstString(offset + 40, $par_itm_typ_d_cd, value);
	}


	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public String par_itm_typ_d_nm() {
		return getConstString(offset + 41, $par_itm_typ_d_nm);
	}

	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public void par_itm_typ_d_nm(String value) {
		setConstString(offset + 41, $par_itm_typ_d_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR chd_itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 42, $chd_itm_grp_p);
	}
	
	public void chd_itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 42, $chd_itm_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR par_itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 43, $par_itm_grp_p);
	}
	
	public void par_itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 43, $par_itm_grp_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 44, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 44, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 45, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 45, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 46, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 46, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 47, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 47, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 48, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 48, $ins_ts, value);
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


	public String getString(String name) {
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($ver_chg_sts_typ.equalsIgnoreCase(name)) {
			return ver_chg_sts_typ();
		}
		if ($ver_chg_sts_typ_nm.equalsIgnoreCase(name)) {
			return ver_chg_sts_typ_nm();
		}
		if ($first_inst_lot_no.equalsIgnoreCase(name)) {
			return first_inst_lot_no();
		}
		if ($first_inst_sublot_no.equalsIgnoreCase(name)) {
			return first_inst_sublot_no();
		}
		if ($first_act_lot_no.equalsIgnoreCase(name)) {
			return first_act_lot_no();
		}
		if ($first_act_sublot_no.equalsIgnoreCase(name)) {
			return first_act_sublot_no();
		}
		if ($last_act_lot_no.equalsIgnoreCase(name)) {
			return last_act_lot_no();
		}
		if ($last_act_sublot_no.equalsIgnoreCase(name)) {
			return last_act_sublot_no();
		}
		if ($master_rmrks.equalsIgnoreCase(name)) {
			return master_rmrks();
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
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($first_mfg_inst_no.equalsIgnoreCase(name)) {
			return first_mfg_inst_no();
		}
		if ($first_act_mfg_inst_no.equalsIgnoreCase(name)) {
			return first_act_mfg_inst_no();
		}
		if ($first_mfg_act_no.equalsIgnoreCase(name)) {
			return first_mfg_act_no();
		}
		if ($last_mfg_inst_no.equalsIgnoreCase(name)) {
			return last_mfg_inst_no();
		}
		if ($last_mfg_act_no.equalsIgnoreCase(name)) {
			return last_mfg_act_no();
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			return chd_itm_typ();
		}
		if ($chd_itm_typ_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_nm();
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_cd();
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_nm();
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			return par_itm_typ();
		}
		if ($par_itm_typ_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_nm();
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return par_itm_typ_d_cd();
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_d_nm();
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
	public MCDate getDate(String name) {
		if ($first_inst_st_dt.equalsIgnoreCase(name)) {
			return first_inst_st_dt();
		}
		if ($first_inst_st_hm.equalsIgnoreCase(name)) {
			return first_inst_st_hm();
		}
		if ($first_act_st_dt.equalsIgnoreCase(name)) {
			return first_act_st_dt();
		}
		if ($first_act_st_hm.equalsIgnoreCase(name)) {
			return first_act_st_hm();
		}
		if ($last_act_st_dt.equalsIgnoreCase(name)) {
			return last_act_st_dt();
		}
		if ($last_act_st_hm.equalsIgnoreCase(name)) {
			return last_act_st_hm();
		}
		if ($purc_st_dt.equalsIgnoreCase(name)) {
			return purc_st_dt();
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
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($ver_chg_sts_typ.equalsIgnoreCase(name)) {
			return ver_chg_sts_typ();
		}
		if ($ver_chg_sts_typ_nm.equalsIgnoreCase(name)) {
			return ver_chg_sts_typ_nm();
		}
		if ($first_inst_lot_no.equalsIgnoreCase(name)) {
			return first_inst_lot_no();
		}
		if ($first_inst_sublot_no.equalsIgnoreCase(name)) {
			return first_inst_sublot_no();
		}
		if ($first_act_lot_no.equalsIgnoreCase(name)) {
			return first_act_lot_no();
		}
		if ($first_act_sublot_no.equalsIgnoreCase(name)) {
			return first_act_sublot_no();
		}
		if ($last_act_lot_no.equalsIgnoreCase(name)) {
			return last_act_lot_no();
		}
		if ($last_act_sublot_no.equalsIgnoreCase(name)) {
			return last_act_sublot_no();
		}
		if ($master_rmrks.equalsIgnoreCase(name)) {
			return master_rmrks();
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
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($first_mfg_inst_no.equalsIgnoreCase(name)) {
			return first_mfg_inst_no();
		}
		if ($first_act_mfg_inst_no.equalsIgnoreCase(name)) {
			return first_act_mfg_inst_no();
		}
		if ($first_mfg_act_no.equalsIgnoreCase(name)) {
			return first_mfg_act_no();
		}
		if ($last_mfg_inst_no.equalsIgnoreCase(name)) {
			return last_mfg_inst_no();
		}
		if ($last_mfg_act_no.equalsIgnoreCase(name)) {
			return last_mfg_act_no();
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			return chd_itm_typ();
		}
		if ($chd_itm_typ_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_nm();
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_cd();
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_nm();
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			return par_itm_typ();
		}
		if ($par_itm_typ_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_nm();
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return par_itm_typ_d_cd();
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_d_nm();
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
	public MCDate getDateNE(String name) {
		if ($first_inst_st_dt.equalsIgnoreCase(name)) {
			return first_inst_st_dt();
		}
		if ($first_inst_st_hm.equalsIgnoreCase(name)) {
			return first_inst_st_hm();
		}
		if ($first_act_st_dt.equalsIgnoreCase(name)) {
			return first_act_st_dt();
		}
		if ($first_act_st_hm.equalsIgnoreCase(name)) {
			return first_act_st_hm();
		}
		if ($last_act_st_dt.equalsIgnoreCase(name)) {
			return last_act_st_dt();
		}
		if ($last_act_st_hm.equalsIgnoreCase(name)) {
			return last_act_st_hm();
		}
		if ($purc_st_dt.equalsIgnoreCase(name)) {
			return purc_st_dt();
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
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($ver_chg_sts_typ.equalsIgnoreCase(name)) {
			ver_chg_sts_typ(value);
			return;
		}
		if ($ver_chg_sts_typ_nm.equalsIgnoreCase(name)) {
			ver_chg_sts_typ_nm(value);
			return;
		}
		if ($first_inst_lot_no.equalsIgnoreCase(name)) {
			first_inst_lot_no(value);
			return;
		}
		if ($first_inst_sublot_no.equalsIgnoreCase(name)) {
			first_inst_sublot_no(value);
			return;
		}
		if ($first_act_lot_no.equalsIgnoreCase(name)) {
			first_act_lot_no(value);
			return;
		}
		if ($first_act_sublot_no.equalsIgnoreCase(name)) {
			first_act_sublot_no(value);
			return;
		}
		if ($last_act_lot_no.equalsIgnoreCase(name)) {
			last_act_lot_no(value);
			return;
		}
		if ($last_act_sublot_no.equalsIgnoreCase(name)) {
			last_act_sublot_no(value);
			return;
		}
		if ($master_rmrks.equalsIgnoreCase(name)) {
			master_rmrks(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($first_mfg_inst_no.equalsIgnoreCase(name)) {
			first_mfg_inst_no(value);
			return;
		}
		if ($first_act_mfg_inst_no.equalsIgnoreCase(name)) {
			first_act_mfg_inst_no(value);
			return;
		}
		if ($first_mfg_act_no.equalsIgnoreCase(name)) {
			first_mfg_act_no(value);
			return;
		}
		if ($last_mfg_inst_no.equalsIgnoreCase(name)) {
			last_mfg_inst_no(value);
			return;
		}
		if ($last_mfg_act_no.equalsIgnoreCase(name)) {
			last_mfg_act_no(value);
			return;
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			chd_itm_typ(value);
			return;
		}
		if ($chd_itm_typ_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_nm(value);
			return;
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			chd_itm_typ_d_cd(value);
			return;
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_d_nm(value);
			return;
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			par_itm_typ(value);
			return;
		}
		if ($par_itm_typ_nm.equalsIgnoreCase(name)) {
			par_itm_typ_nm(value);
			return;
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			par_itm_typ_d_cd(value);
			return;
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			par_itm_typ_d_nm(value);
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
	public void setDate(String name, MCDate value) {
		if ($first_inst_st_dt.equalsIgnoreCase(name)) {
			first_inst_st_dt(value);
			return;
		}
		if ($first_inst_st_hm.equalsIgnoreCase(name)) {
			first_inst_st_hm(value);
			return;
		}
		if ($first_act_st_dt.equalsIgnoreCase(name)) {
			first_act_st_dt(value);
			return;
		}
		if ($first_act_st_hm.equalsIgnoreCase(name)) {
			first_act_st_hm(value);
			return;
		}
		if ($last_act_st_dt.equalsIgnoreCase(name)) {
			last_act_st_dt(value);
			return;
		}
		if ($last_act_st_hm.equalsIgnoreCase(name)) {
			last_act_st_hm(value);
			return;
		}
		if ($purc_st_dt.equalsIgnoreCase(name)) {
			purc_st_dt(value);
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
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($ver_chg_sts_typ.equalsIgnoreCase(name)) {
			ver_chg_sts_typ(value);
			return;
		}
		if ($ver_chg_sts_typ_nm.equalsIgnoreCase(name)) {
			ver_chg_sts_typ_nm(value);
			return;
		}
		if ($first_inst_lot_no.equalsIgnoreCase(name)) {
			first_inst_lot_no(value);
			return;
		}
		if ($first_inst_sublot_no.equalsIgnoreCase(name)) {
			first_inst_sublot_no(value);
			return;
		}
		if ($first_act_lot_no.equalsIgnoreCase(name)) {
			first_act_lot_no(value);
			return;
		}
		if ($first_act_sublot_no.equalsIgnoreCase(name)) {
			first_act_sublot_no(value);
			return;
		}
		if ($last_act_lot_no.equalsIgnoreCase(name)) {
			last_act_lot_no(value);
			return;
		}
		if ($last_act_sublot_no.equalsIgnoreCase(name)) {
			last_act_sublot_no(value);
			return;
		}
		if ($master_rmrks.equalsIgnoreCase(name)) {
			master_rmrks(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($first_mfg_inst_no.equalsIgnoreCase(name)) {
			first_mfg_inst_no(value);
			return;
		}
		if ($first_act_mfg_inst_no.equalsIgnoreCase(name)) {
			first_act_mfg_inst_no(value);
			return;
		}
		if ($first_mfg_act_no.equalsIgnoreCase(name)) {
			first_mfg_act_no(value);
			return;
		}
		if ($last_mfg_inst_no.equalsIgnoreCase(name)) {
			last_mfg_inst_no(value);
			return;
		}
		if ($last_mfg_act_no.equalsIgnoreCase(name)) {
			last_mfg_act_no(value);
			return;
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			chd_itm_typ(value);
			return;
		}
		if ($chd_itm_typ_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_nm(value);
			return;
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			chd_itm_typ_d_cd(value);
			return;
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_d_nm(value);
			return;
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			par_itm_typ(value);
			return;
		}
		if ($par_itm_typ_nm.equalsIgnoreCase(name)) {
			par_itm_typ_nm(value);
			return;
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			par_itm_typ_d_cd(value);
			return;
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			par_itm_typ_d_nm(value);
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
	public void setDateNE(String name, MCDate value) {
		if ($first_inst_st_dt.equalsIgnoreCase(name)) {
			first_inst_st_dt(value);
			return;
		}
		if ($first_inst_st_hm.equalsIgnoreCase(name)) {
			first_inst_st_hm(value);
			return;
		}
		if ($first_act_st_dt.equalsIgnoreCase(name)) {
			first_act_st_dt(value);
			return;
		}
		if ($first_act_st_hm.equalsIgnoreCase(name)) {
			first_act_st_hm(value);
			return;
		}
		if ($last_act_st_dt.equalsIgnoreCase(name)) {
			last_act_st_dt(value);
			return;
		}
		if ($last_act_st_hm.equalsIgnoreCase(name)) {
			last_act_st_hm(value);
			return;
		}
		if ($purc_st_dt.equalsIgnoreCase(name)) {
			purc_st_dt(value);
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
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($chd_itm_p.equalsIgnoreCase(name)) {
			return chd_itm_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($par_itm_p.equalsIgnoreCase(name)) {
			return par_itm_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($chd_itm_grp_p.equalsIgnoreCase(name)) {
			return chd_itm_grp_p();
		}
		if ($par_itm_grp_p.equalsIgnoreCase(name)) {
			return par_itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($chd_itm_p.equalsIgnoreCase(name)) {
			chd_itm_p(
				((MCContainerMeta) chd_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5250.VerNoR.class, value)
			);
			return;
		}
		if ($par_itm_p.equalsIgnoreCase(name)) {
			par_itm_p(
				((MCContainerMeta) par_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5070.SnoR.class, value)
			);
			return;
		}
		if ($chd_itm_grp_p.equalsIgnoreCase(name)) {
			chd_itm_grp_p(
				((MCContainerMeta) chd_itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5170.ItmGrpR.class, value)
			);
			return;
		}
		if ($par_itm_grp_p.equalsIgnoreCase(name)) {
			par_itm_grp_p(
				((MCContainerMeta) par_itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5170.ItmGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public String chd_itm_cd() {
		return chd_itm_p().itm_cd();
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		chd_itm_p().itm_cd(value);
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return chd_itm_p().itm_sub1();
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		chd_itm_p().itm_sub1(value);
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return chd_itm_p().itm_sub2();
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		chd_itm_p().itm_sub2(value);
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return chd_itm_p().itm_sub3();
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		chd_itm_p().itm_sub3(value);
	}

	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public String chd_itm_nm() {
		return chd_itm_p().itm_nm();
	}

	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public void chd_itm_nm(String value) {
		chd_itm_p().itm_nm(value);
	}

	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return par_itm_p().itm_cd();
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		par_itm_p().itm_cd(value);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return par_itm_p().itm_sub1();
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		par_itm_p().itm_sub1(value);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return par_itm_p().itm_sub2();
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		par_itm_p().itm_sub2(value);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return par_itm_p().itm_sub3();
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		par_itm_p().itm_sub3(value);
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return par_itm_p().itm_nm();
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		par_itm_p().itm_nm(value);
	}

	public String sno1() {
		return sno_p().sno1();
	}

	public void sno1(String value) {
		sno_p().sno1(value);
	}

	public String sno2() {
		return sno_p().sno2();
	}

	public void sno2(String value) {
		sno_p().sno2(value);
	}

	public String sno3() {
		return sno_p().sno3();
	}

	public void sno3(String value) {
		sno_p().sno3(value);
	}

	public String sno4() {
		return sno_p().sno4();
	}

	public void sno4(String value) {
		sno_p().sno4(value);
	}

	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public String chd_itm_grp_cd1() {
		return chd_itm_grp_p().itm_grp_cd1();
	}

	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public void chd_itm_grp_cd1(String value) {
		chd_itm_grp_p().itm_grp_cd1(value);
	}

	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public String chd_itm_grp_nm1() {
		return chd_itm_grp_p().itm_grp_nm1();
	}

	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public void chd_itm_grp_nm1(String value) {
		chd_itm_grp_p().itm_grp_nm1(value);
	}

	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public String chd_itm_grp_cd2() {
		return chd_itm_grp_p().itm_grp_cd2();
	}

	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public void chd_itm_grp_cd2(String value) {
		chd_itm_grp_p().itm_grp_cd2(value);
	}

	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public String chd_itm_grp_nm2() {
		return chd_itm_grp_p().itm_grp_nm2();
	}

	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public void chd_itm_grp_nm2(String value) {
		chd_itm_grp_p().itm_grp_nm2(value);
	}

	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public String chd_itm_grp_cd3() {
		return chd_itm_grp_p().itm_grp_cd3();
	}

	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public void chd_itm_grp_cd3(String value) {
		chd_itm_grp_p().itm_grp_cd3(value);
	}

	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public String chd_itm_grp_nm3() {
		return chd_itm_grp_p().itm_grp_nm3();
	}

	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public void chd_itm_grp_nm3(String value) {
		chd_itm_grp_p().itm_grp_nm3(value);
	}

	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public String chd_itm_grp_cd4() {
		return chd_itm_grp_p().itm_grp_cd4();
	}

	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public void chd_itm_grp_cd4(String value) {
		chd_itm_grp_p().itm_grp_cd4(value);
	}

	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public String chd_itm_grp_nm4() {
		return chd_itm_grp_p().itm_grp_nm4();
	}

	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public void chd_itm_grp_nm4(String value) {
		chd_itm_grp_p().itm_grp_nm4(value);
	}

	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public String chd_itm_grp_cd5() {
		return chd_itm_grp_p().itm_grp_cd5();
	}

	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public void chd_itm_grp_cd5(String value) {
		chd_itm_grp_p().itm_grp_cd5(value);
	}

	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public String chd_itm_grp_nm5() {
		return chd_itm_grp_p().itm_grp_nm5();
	}

	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public void chd_itm_grp_nm5(String value) {
		chd_itm_grp_p().itm_grp_nm5(value);
	}

	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public String chd_itm_grp_cd6() {
		return chd_itm_grp_p().itm_grp_cd6();
	}

	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public void chd_itm_grp_cd6(String value) {
		chd_itm_grp_p().itm_grp_cd6(value);
	}

	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public String chd_itm_grp_nm6() {
		return chd_itm_grp_p().itm_grp_nm6();
	}

	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public void chd_itm_grp_nm6(String value) {
		chd_itm_grp_p().itm_grp_nm6(value);
	}

	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public String chd_itm_grp_cd7() {
		return chd_itm_grp_p().itm_grp_cd7();
	}

	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public void chd_itm_grp_cd7(String value) {
		chd_itm_grp_p().itm_grp_cd7(value);
	}

	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public String chd_itm_grp_nm7() {
		return chd_itm_grp_p().itm_grp_nm7();
	}

	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public void chd_itm_grp_nm7(String value) {
		chd_itm_grp_p().itm_grp_nm7(value);
	}

	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public String chd_itm_grp_cd8() {
		return chd_itm_grp_p().itm_grp_cd8();
	}

	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public void chd_itm_grp_cd8(String value) {
		chd_itm_grp_p().itm_grp_cd8(value);
	}

	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public String chd_itm_grp_nm8() {
		return chd_itm_grp_p().itm_grp_nm8();
	}

	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public void chd_itm_grp_nm8(String value) {
		chd_itm_grp_p().itm_grp_nm8(value);
	}

	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public String chd_itm_grp_cd9() {
		return chd_itm_grp_p().itm_grp_cd9();
	}

	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public void chd_itm_grp_cd9(String value) {
		chd_itm_grp_p().itm_grp_cd9(value);
	}

	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public String chd_itm_grp_nm9() {
		return chd_itm_grp_p().itm_grp_nm9();
	}

	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public void chd_itm_grp_nm9(String value) {
		chd_itm_grp_p().itm_grp_nm9(value);
	}

	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public String chd_itm_grp_cd10() {
		return chd_itm_grp_p().itm_grp_cd10();
	}

	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public void chd_itm_grp_cd10(String value) {
		chd_itm_grp_p().itm_grp_cd10(value);
	}

	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public String chd_itm_grp_nm10() {
		return chd_itm_grp_p().itm_grp_nm10();
	}

	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public void chd_itm_grp_nm10(String value) {
		chd_itm_grp_p().itm_grp_nm10(value);
	}

	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public String par_itm_grp_cd1() {
		return par_itm_grp_p().itm_grp_cd1();
	}

	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public void par_itm_grp_cd1(String value) {
		par_itm_grp_p().itm_grp_cd1(value);
	}

	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public String par_itm_grp_nm1() {
		return par_itm_grp_p().itm_grp_nm1();
	}

	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public void par_itm_grp_nm1(String value) {
		par_itm_grp_p().itm_grp_nm1(value);
	}

	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public String par_itm_grp_cd2() {
		return par_itm_grp_p().itm_grp_cd2();
	}

	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public void par_itm_grp_cd2(String value) {
		par_itm_grp_p().itm_grp_cd2(value);
	}

	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public String par_itm_grp_nm2() {
		return par_itm_grp_p().itm_grp_nm2();
	}

	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public void par_itm_grp_nm2(String value) {
		par_itm_grp_p().itm_grp_nm2(value);
	}

	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public String par_itm_grp_cd3() {
		return par_itm_grp_p().itm_grp_cd3();
	}

	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public void par_itm_grp_cd3(String value) {
		par_itm_grp_p().itm_grp_cd3(value);
	}

	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public String par_itm_grp_nm3() {
		return par_itm_grp_p().itm_grp_nm3();
	}

	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public void par_itm_grp_nm3(String value) {
		par_itm_grp_p().itm_grp_nm3(value);
	}

	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public String par_itm_grp_cd4() {
		return par_itm_grp_p().itm_grp_cd4();
	}

	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public void par_itm_grp_cd4(String value) {
		par_itm_grp_p().itm_grp_cd4(value);
	}

	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public String par_itm_grp_nm4() {
		return par_itm_grp_p().itm_grp_nm4();
	}

	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public void par_itm_grp_nm4(String value) {
		par_itm_grp_p().itm_grp_nm4(value);
	}

	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public String par_itm_grp_cd5() {
		return par_itm_grp_p().itm_grp_cd5();
	}

	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public void par_itm_grp_cd5(String value) {
		par_itm_grp_p().itm_grp_cd5(value);
	}

	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public String par_itm_grp_nm5() {
		return par_itm_grp_p().itm_grp_nm5();
	}

	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public void par_itm_grp_nm5(String value) {
		par_itm_grp_p().itm_grp_nm5(value);
	}

	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public String par_itm_grp_cd6() {
		return par_itm_grp_p().itm_grp_cd6();
	}

	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public void par_itm_grp_cd6(String value) {
		par_itm_grp_p().itm_grp_cd6(value);
	}

	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public String par_itm_grp_nm6() {
		return par_itm_grp_p().itm_grp_nm6();
	}

	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public void par_itm_grp_nm6(String value) {
		par_itm_grp_p().itm_grp_nm6(value);
	}

	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public String par_itm_grp_cd7() {
		return par_itm_grp_p().itm_grp_cd7();
	}

	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public void par_itm_grp_cd7(String value) {
		par_itm_grp_p().itm_grp_cd7(value);
	}

	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public String par_itm_grp_nm7() {
		return par_itm_grp_p().itm_grp_nm7();
	}

	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public void par_itm_grp_nm7(String value) {
		par_itm_grp_p().itm_grp_nm7(value);
	}

	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public String par_itm_grp_cd8() {
		return par_itm_grp_p().itm_grp_cd8();
	}

	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public void par_itm_grp_cd8(String value) {
		par_itm_grp_p().itm_grp_cd8(value);
	}

	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public String par_itm_grp_nm8() {
		return par_itm_grp_p().itm_grp_nm8();
	}

	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public void par_itm_grp_nm8(String value) {
		par_itm_grp_p().itm_grp_nm8(value);
	}

	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public String par_itm_grp_cd9() {
		return par_itm_grp_p().itm_grp_cd9();
	}

	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public void par_itm_grp_cd9(String value) {
		par_itm_grp_p().itm_grp_cd9(value);
	}

	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public String par_itm_grp_nm9() {
		return par_itm_grp_p().itm_grp_nm9();
	}

	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public void par_itm_grp_nm9(String value) {
		par_itm_grp_p().itm_grp_nm9(value);
	}

	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public String par_itm_grp_cd10() {
		return par_itm_grp_p().itm_grp_cd10();
	}

	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public void par_itm_grp_cd10(String value) {
		par_itm_grp_p().itm_grp_cd10(value);
	}

	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public String par_itm_grp_nm10() {
		return par_itm_grp_p().itm_grp_nm10();
	}

	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public void par_itm_grp_nm10(String value) {
		par_itm_grp_p().itm_grp_nm10(value);
	}

}

