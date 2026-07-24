package mcframe.clientMABG.MABGP0640;

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

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm = "calc_ctg_nm";
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
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public static final String $ac_slip_typ = "ac_slip_typ";
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public static final String $ac_slip_typ_nm = "ac_slip_typ_nm";
	/**
	 * Priority 優先順位.<p>
	 *
	 */
	public static final String $prio = "prio";
	public static final String $dt_p = "dt_p";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public static final String $ac_rsn_nm = "ac_rsn_nm";
	/**
	 * No accounting reason 会計理由無.<p>
	 *
	 */
	public static final String $ac_rsn_null_flg = "ac_rsn_null_flg";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $tgt_dpt_cd = "tgt_dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $tgt_dpt_nm = "tgt_dpt_nm";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $tgt_loc_cd = "tgt_loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $tgt_loc_nm = "tgt_loc_nm";
	/**
	 * Without Location 場所無.<p>
	 *
	 */
	public static final String $loc_null_flg = "loc_null_flg";
	/**
	 * GR/GI transfer type 入出庫振替区分.<p>
	 *
	 */
	public static final String $io_trans_typ = "io_trans_typ";
	/**
	 * GR/GI transfer type name 入出庫振替区分名.<p>
	 *
	 */
	public static final String $io_trans_typ_nm = "io_trans_typ_nm";
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public static final String $alc_ac_cd = "alc_ac_cd";
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public static final String $alc_ac_nm = "alc_ac_nm";
	/**
	 * Transfer allocation 配賦振替.<p>
	 *
	 */
	public static final String $alc_amt_flg = "alc_amt_flg";
	/**
	 * Allocation WG cd. 配賦ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $alc_wg_cd = "alc_wg_cd";
	/**
	 * Allocation WG name 配賦ワーキンググループ名.<p>
	 *
	 */
	public static final String $alc_wg_nm = "alc_wg_nm";
	/**
	 * Copy dept. 部門引継.<p>
	 *
	 */
	public static final String $dpt_flg = "dpt_flg";
	/**
	 * Allocation destination dept. cd. 配賦先部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Allocation destination dept. name 配賦先部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 * Location copy 場所引継.<p>
	 *
	 */
	public static final String $loc_flg = "loc_flg";
	/**
	 * Allocation destination location cd. 配賦先場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Allocation destination location name 配賦先場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Operation copy 工程引継.<p>
	 *
	 */
	public static final String $oper_flg = "oper_flg";
	/**
	 * Allocation destination operation cd. 配賦先工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Allocation destination operation name 配賦先工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * BP copy 取引先引継.<p>
	 *
	 */
	public static final String $bp_flg = "bp_flg";
	/**
	 * Allocation destination BP cd. 配賦先取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * Allocation destination BP name 配賦先取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * Item category copy 品群引継.<p>
	 *
	 */
	public static final String $ctg_flg = "ctg_flg";
	/**
	 * Allocation destination item category cd. 配賦先品群ＣＤ.<p>
	 *
	 */
	public static final String $ctg_cd = "ctg_cd";
	/**
	 * Allocation destination item category name 配賦先品群名.<p>
	 *
	 */
	public static final String $ctg_nm = "ctg_nm";
	/**
	 * Item copy 品目引継.<p>
	 *
	 */
	public static final String $itm_flg = "itm_flg";
	public static final String $itm_p = "itm_p";
	/**
	 * Lot No. copy ロットＮＯ引継.<p>
	 *
	 */
	public static final String $lot_no_flg = "lot_no_flg";
	/**
	 * Allocation destination lot No. 配賦先ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. copy サブロットＮＯ引継.<p>
	 *
	 */
	public static final String $sublot_no_flg = "sublot_no_flg";
	/**
	 * Allocation destination sublot No. 配賦先サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * Copy SEIBAN No. 1 手配ＮＯ１引継.<p>
	 *
	 */
	public static final String $sno1_flg = "sno1_flg";
	/**
	 * Allocation destination SEIBAN No. 1 配賦先手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * Copy SEIBAN No. 2 手配ＮＯ２引継.<p>
	 *
	 */
	public static final String $sno2_flg = "sno2_flg";
	/**
	 * Allocation destination SEIBAN No. 2 配賦先手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * Copy SEIBAN No. 3 手配ＮＯ３引継.<p>
	 *
	 */
	public static final String $sno3_flg = "sno3_flg";
	/**
	 * Allocation destination SEIBAN No. 3 配賦先手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * Copy SEIBAN No. 4 手配ＮＯ４引継.<p>
	 *
	 */
	public static final String $sno4_flg = "sno4_flg";
	/**
	 * Allocation destination SEIBAN No. 4 配賦先手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Item order No. copy 品目指図ＮＯ引継.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no_flg = "itm_mfg_inst_no_flg";
	/**
	 * Input location type 1 投入場所区分１.<p>
	 *
	 */
	public static final String $inpt_loc_typ1 = "inpt_loc_typ1";
	/**
	 * Input location type 1 name 投入場所区分１名.<p>
	 *
	 */
	public static final String $inpt_loc_typ1_nm = "inpt_loc_typ1_nm";
	/**
	 * Input location type 2 投入場所区分２.<p>
	 *
	 */
	public static final String $inpt_loc_typ2 = "inpt_loc_typ2";
	/**
	 * Input location type 2 name 投入場所区分２名.<p>
	 *
	 */
	public static final String $inpt_loc_typ2_nm = "inpt_loc_typ2_nm";
	/**
	 * Input location type 3 投入場所区分３.<p>
	 *
	 */
	public static final String $inpt_loc_typ3 = "inpt_loc_typ3";
	/**
	 * Input location type 3 name 投入場所区分３名.<p>
	 *
	 */
	public static final String $inpt_loc_typ3_nm = "inpt_loc_typ3_nm";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
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
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";

	public static final String $st_dt_key = $dt_p + ".st_dt_key";
	public static final String $st_dt = $dt_p + ".st_dt";
	public static final String $end_dt = $dt_p + ".end_dt";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta ac_slip_typ_nm_META = createCommonMeta($ac_slip_typ_nm, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP_NM);
	public static final MCMeta prio_META = createCommonMeta($prio, mcframe.commonMA.meta.MA_META.INT4);
	public static final MCMeta dt_p_META = createInnerRowMeta($dt_p, mcframe.clientMAUB.MAUBP5010.DtR.class);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta ac_rsn_null_flg_META = createCommonMeta($ac_rsn_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tgt_dpt_cd_META = createCommonMeta($tgt_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta tgt_dpt_nm_META = createCommonMeta($tgt_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta tgt_loc_cd_META = createCommonMeta($tgt_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta tgt_loc_nm_META = createCommonMeta($tgt_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta loc_null_flg_META = createCommonMeta($loc_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta io_trans_typ_META = createCommonMeta($io_trans_typ, mcframe.commonMA.meta.MA_META.IO_TRANS_TYP);
	public static final MCMeta io_trans_typ_nm_META = createCommonMeta($io_trans_typ_nm, mcframe.commonMA.meta.MA_META.IO_TRANS_TYP_NM);
	public static final MCMeta alc_ac_cd_META = createCommonMeta($alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta alc_ac_nm_META = createCommonMeta($alc_ac_nm, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta alc_amt_flg_META = createCommonMeta($alc_amt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alc_wg_cd_META = createCommonMeta($alc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta alc_wg_nm_META = createCommonMeta($alc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dpt_flg_META = createCommonMeta($dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta loc_flg_META = createCommonMeta($loc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_flg_META = createCommonMeta($oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta bp_flg_META = createCommonMeta($bp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ctg_flg_META = createCommonMeta($ctg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ctg_cd_META = createCommonMeta($ctg_cd, mcframe.commonMA.meta.MA_META.COST_CTG_CD);
	public static final MCMeta ctg_nm_META = createCommonMeta($ctg_nm, mcframe.commonMA.meta.MA_META.COST_CTG_NM);
	public static final MCMeta itm_flg_META = createCommonMeta($itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta lot_no_flg_META = createCommonMeta($lot_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_flg_META = createCommonMeta($sublot_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_flg_META = createCommonMeta($sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_flg_META = createCommonMeta($sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_flg_META = createCommonMeta($sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_flg_META = createCommonMeta($sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta itm_mfg_inst_no_flg_META = createCommonMeta($itm_mfg_inst_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_loc_typ1_META = createCommonMeta($inpt_loc_typ1, mcframe.commonMA.meta.MA_META.INPT_LOC_TYP);
	public static final MCMeta inpt_loc_typ1_nm_META = createCommonMeta($inpt_loc_typ1_nm, mcframe.commonMA.meta.MA_META.INPT_LOC_TYP_NM);
	public static final MCMeta inpt_loc_typ2_META = createCommonMeta($inpt_loc_typ2, mcframe.commonMA.meta.MA_META.INPT_LOC_TYP);
	public static final MCMeta inpt_loc_typ2_nm_META = createCommonMeta($inpt_loc_typ2_nm, mcframe.commonMA.meta.MA_META.INPT_LOC_TYP_NM);
	public static final MCMeta inpt_loc_typ3_META = createCommonMeta($inpt_loc_typ3, mcframe.commonMA.meta.MA_META.INPT_LOC_TYP);
	public static final MCMeta inpt_loc_typ3_nm_META = createCommonMeta($inpt_loc_typ3_nm, mcframe.commonMA.meta.MA_META.INPT_LOC_TYP_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			del_flg_META,
			calc_ctg_cd_META,
			calc_ctg_nm_META,
			wg_cd_META,
			wg_nm_META,
			ac_slip_typ_META,
			ac_slip_typ_nm_META,
			prio_META,
			dt_p_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			ac_rsn_cd_META,
			ac_rsn_nm_META,
			ac_rsn_null_flg_META,
			tgt_dpt_cd_META,
			tgt_dpt_nm_META,
			tgt_loc_cd_META,
			tgt_loc_nm_META,
			loc_null_flg_META,
			io_trans_typ_META,
			io_trans_typ_nm_META,
			alc_ac_cd_META,
			alc_ac_nm_META,
			alc_amt_flg_META,
			alc_wg_cd_META,
			alc_wg_nm_META,
			dpt_flg_META,
			dpt_cd_META,
			dpt_nm_META,
			loc_flg_META,
			loc_cd_META,
			loc_nm_META,
			oper_flg_META,
			oper_cd_META,
			oper_nm_META,
			bp_flg_META,
			bp_cd_META,
			bp_nm_META,
			ctg_flg_META,
			ctg_cd_META,
			ctg_nm_META,
			itm_flg_META,
			itm_p_META,
			lot_no_flg_META,
			lot_no_META,
			sublot_no_flg_META,
			sublot_no_META,
			sno1_flg_META,
			sno1_META,
			sno2_flg_META,
			sno2_META,
			sno3_flg_META,
			sno3_META,
			sno4_flg_META,
			sno4_META,
			itm_mfg_inst_no_flg_META,
			inpt_loc_typ1_META,
			inpt_loc_typ1_nm_META,
			inpt_loc_typ2_META,
			inpt_loc_typ2_nm_META,
			inpt_loc_typ3_META,
			inpt_loc_typ3_nm_META,
			memo1_META,
			memo2_META,
			memo3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META
		},
		new String[][]{
			{
				"st_dt_key",
				"st_dt",
				"end_dt",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm"
			},
			{
				$st_dt_key,
				$st_dt,
				$end_dt,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$calc_ctg_cd,	// calc_ctg_cd
			$wg_cd,	// wg_cd
			$ac_slip_typ,	// ac_slip_typ
			$prio,	// prio
			$dt_p + ".st_dt"	// dt_p.st_dt
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
				{$wg_cd, "wg_nm"},	// wg_cd
				{$tgt_dpt_cd, "dpt_nm"},	// tgt_dpt_cd
				{$tgt_loc_cd, "loc_nm"},	// tgt_loc_cd
				{$alc_wg_cd, "wg_nm"},	// alc_wg_cd
				{$dpt_cd, "dpt_nm"},	// dpt_cd
				{$itm_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_nm;itm_sub3"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_nm"},	// itm_p.itm_sub3
				{$inpt_loc_typ1, "inpt_loc_typ_nm"},	// inpt_loc_typ1
				{$inpt_loc_typ2, "inpt_loc_typ_nm"},	// inpt_loc_typ2
				{$inpt_loc_typ3, "inpt_loc_typ_nm"}	// inpt_loc_typ3
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$wg_cd, "true"},	// wg_cd
				{$tgt_dpt_cd, "st_dt"},	// tgt_dpt_cd
				{$dpt_cd, "st_dt"},	// dpt_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$wg_cd, "wr_flg"},	// wg_cd
				{$tgt_dpt_cd, "ym"},	// tgt_dpt_cd
				{$dpt_cd, "ym"},	// dpt_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$alc_wg_cd, "WG"},	// alc_wg_cd
				{$alc_wg_nm, "WG"},	// alc_wg_nm
				{$sno1_flg, "SNO1"},	// sno1_flg
				{$sno1, "SNO1"},	// sno1
				{$sno2_flg, "SNO2"},	// sno2_flg
				{$sno2, "SNO2"},	// sno2
				{$sno3_flg, "SNO3"},	// sno3_flg
				{$sno3, "SNO3"},	// sno3
				{$sno4_flg, "SNO4"},	// sno4_flg
				{$sno4, "SNO4"}	// sno4
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
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 1, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 1, $del_flg, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 2, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 2, $calc_ctg_cd, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 3, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 3, $calc_ctg_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 4, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 4, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 5, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 5, $wg_nm, value);
	}


	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 6, $ac_slip_typ);
	}

	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 6, $ac_slip_typ, value);
	}


	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public String ac_slip_typ_nm() {
		return getConstString(offset + 7, $ac_slip_typ_nm);
	}

	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public void ac_slip_typ_nm(String value) {
		setConstString(offset + 7, $ac_slip_typ_nm, value);
	}


	/**
	 * Priority 優先順位.<p>
	 *
	 */
	public MCNumber prio() {
		return getConstNumber(offset + 8, $prio);
	}

	/**
	 * Priority 優先順位.<p>
	 *
	 */
	public void prio(MCNumber value) {
		setConstNumber(offset + 8, $prio, value);
	}

	/**
	 * Priority 優先順位.<p>
	 *
	 */
	public void prio(int value) {
		setConstNumber(offset + 8, $prio, value);
	}

	/**
	 * Priority 優先順位.<p>
	 *
	 */
	public void prio(long value) {
		setConstNumber(offset + 8, $prio, value);
	}

	/**
	 * Priority 優先順位.<p>
	 *
	 */
	public void prio(float value) {
		setConstNumber(offset + 8, $prio, value);
	}

	/**
	 * Priority 優先順位.<p>
	 *
	 */
	public void prio(double value) {
		setConstNumber(offset + 8, $prio, value);
	}


	public mcframe.clientMAUB.MAUBP5010.DtR dt_p(){
		return (mcframe.clientMAUB.MAUBP5010.DtR) getConstInnerRow(offset + 9, $dt_p);
	}
	
	public void dt_p(mcframe.clientMAUB.MAUBP5010.DtR row){
		setConstInnerRow(offset + 9, $dt_p, row);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 10, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 10, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 11, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 11, $itm_jnl_nm, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 12, $ac_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 12, $ac_rsn_cd, value);
	}


	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 13, $ac_rsn_nm);
	}

	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 13, $ac_rsn_nm, value);
	}


	/**
	 * No accounting reason 会計理由無.<p>
	 *
	 */
	public boolean ac_rsn_null_flg() {
		return getConstBoolean(offset + 14, $ac_rsn_null_flg);
	}

	/**
	 * No accounting reason 会計理由無.<p>
	 *
	 */
	public void ac_rsn_null_flg(boolean value) {
		setConstBoolean(offset + 14, $ac_rsn_null_flg, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String tgt_dpt_cd() {
		return getConstString(offset + 15, $tgt_dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void tgt_dpt_cd(String value) {
		setConstString(offset + 15, $tgt_dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String tgt_dpt_nm() {
		return getConstString(offset + 16, $tgt_dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void tgt_dpt_nm(String value) {
		setConstString(offset + 16, $tgt_dpt_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String tgt_loc_cd() {
		return getConstString(offset + 17, $tgt_loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void tgt_loc_cd(String value) {
		setConstString(offset + 17, $tgt_loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String tgt_loc_nm() {
		return getConstString(offset + 18, $tgt_loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void tgt_loc_nm(String value) {
		setConstString(offset + 18, $tgt_loc_nm, value);
	}


	/**
	 * Without Location 場所無.<p>
	 *
	 */
	public boolean loc_null_flg() {
		return getConstBoolean(offset + 19, $loc_null_flg);
	}

	/**
	 * Without Location 場所無.<p>
	 *
	 */
	public void loc_null_flg(boolean value) {
		setConstBoolean(offset + 19, $loc_null_flg, value);
	}


	/**
	 * GR/GI transfer type 入出庫振替区分.<p>
	 *
	 */
	public String io_trans_typ() {
		return getConstString(offset + 20, $io_trans_typ);
	}

	/**
	 * GR/GI transfer type 入出庫振替区分.<p>
	 *
	 */
	public void io_trans_typ(String value) {
		setConstString(offset + 20, $io_trans_typ, value);
	}


	/**
	 * GR/GI transfer type name 入出庫振替区分名.<p>
	 *
	 */
	public String io_trans_typ_nm() {
		return getConstString(offset + 21, $io_trans_typ_nm);
	}

	/**
	 * GR/GI transfer type name 入出庫振替区分名.<p>
	 *
	 */
	public void io_trans_typ_nm(String value) {
		setConstString(offset + 21, $io_trans_typ_nm, value);
	}


	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public String alc_ac_cd() {
		return getConstString(offset + 22, $alc_ac_cd);
	}

	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		setConstString(offset + 22, $alc_ac_cd, value);
	}


	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public String alc_ac_nm() {
		return getConstString(offset + 23, $alc_ac_nm);
	}

	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public void alc_ac_nm(String value) {
		setConstString(offset + 23, $alc_ac_nm, value);
	}


	/**
	 * Transfer allocation 配賦振替.<p>
	 *
	 */
	public boolean alc_amt_flg() {
		return getConstBoolean(offset + 24, $alc_amt_flg);
	}

	/**
	 * Transfer allocation 配賦振替.<p>
	 *
	 */
	public void alc_amt_flg(boolean value) {
		setConstBoolean(offset + 24, $alc_amt_flg, value);
	}


	/**
	 * Allocation WG cd. 配賦ワーキンググループＣＤ.<p>
	 *
	 */
	public String alc_wg_cd() {
		return getConstString(offset + 25, $alc_wg_cd);
	}

	/**
	 * Allocation WG cd. 配賦ワーキンググループＣＤ.<p>
	 *
	 */
	public void alc_wg_cd(String value) {
		setConstString(offset + 25, $alc_wg_cd, value);
	}


	/**
	 * Allocation WG name 配賦ワーキンググループ名.<p>
	 *
	 */
	public String alc_wg_nm() {
		return getConstString(offset + 26, $alc_wg_nm);
	}

	/**
	 * Allocation WG name 配賦ワーキンググループ名.<p>
	 *
	 */
	public void alc_wg_nm(String value) {
		setConstString(offset + 26, $alc_wg_nm, value);
	}


	/**
	 * Copy dept. 部門引継.<p>
	 *
	 */
	public boolean dpt_flg() {
		return getConstBoolean(offset + 27, $dpt_flg);
	}

	/**
	 * Copy dept. 部門引継.<p>
	 *
	 */
	public void dpt_flg(boolean value) {
		setConstBoolean(offset + 27, $dpt_flg, value);
	}


	/**
	 * Allocation destination dept. cd. 配賦先部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 28, $dpt_cd);
	}

	/**
	 * Allocation destination dept. cd. 配賦先部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 28, $dpt_cd, value);
	}


	/**
	 * Allocation destination dept. name 配賦先部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 29, $dpt_nm);
	}

	/**
	 * Allocation destination dept. name 配賦先部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 29, $dpt_nm, value);
	}


	/**
	 * Location copy 場所引継.<p>
	 *
	 */
	public boolean loc_flg() {
		return getConstBoolean(offset + 30, $loc_flg);
	}

	/**
	 * Location copy 場所引継.<p>
	 *
	 */
	public void loc_flg(boolean value) {
		setConstBoolean(offset + 30, $loc_flg, value);
	}


	/**
	 * Allocation destination location cd. 配賦先場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 31, $loc_cd);
	}

	/**
	 * Allocation destination location cd. 配賦先場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 31, $loc_cd, value);
	}


	/**
	 * Allocation destination location name 配賦先場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 32, $loc_nm);
	}

	/**
	 * Allocation destination location name 配賦先場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 32, $loc_nm, value);
	}


	/**
	 * Operation copy 工程引継.<p>
	 *
	 */
	public boolean oper_flg() {
		return getConstBoolean(offset + 33, $oper_flg);
	}

	/**
	 * Operation copy 工程引継.<p>
	 *
	 */
	public void oper_flg(boolean value) {
		setConstBoolean(offset + 33, $oper_flg, value);
	}


	/**
	 * Allocation destination operation cd. 配賦先工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 34, $oper_cd);
	}

	/**
	 * Allocation destination operation cd. 配賦先工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 34, $oper_cd, value);
	}


	/**
	 * Allocation destination operation name 配賦先工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 35, $oper_nm);
	}

	/**
	 * Allocation destination operation name 配賦先工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 35, $oper_nm, value);
	}


	/**
	 * BP copy 取引先引継.<p>
	 *
	 */
	public boolean bp_flg() {
		return getConstBoolean(offset + 36, $bp_flg);
	}

	/**
	 * BP copy 取引先引継.<p>
	 *
	 */
	public void bp_flg(boolean value) {
		setConstBoolean(offset + 36, $bp_flg, value);
	}


	/**
	 * Allocation destination BP cd. 配賦先取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 37, $bp_cd);
	}

	/**
	 * Allocation destination BP cd. 配賦先取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 37, $bp_cd, value);
	}


	/**
	 * Allocation destination BP name 配賦先取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 38, $bp_nm);
	}

	/**
	 * Allocation destination BP name 配賦先取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 38, $bp_nm, value);
	}


	/**
	 * Item category copy 品群引継.<p>
	 *
	 */
	public boolean ctg_flg() {
		return getConstBoolean(offset + 39, $ctg_flg);
	}

	/**
	 * Item category copy 品群引継.<p>
	 *
	 */
	public void ctg_flg(boolean value) {
		setConstBoolean(offset + 39, $ctg_flg, value);
	}


	/**
	 * Allocation destination item category cd. 配賦先品群ＣＤ.<p>
	 *
	 */
	public String ctg_cd() {
		return getConstString(offset + 40, $ctg_cd);
	}

	/**
	 * Allocation destination item category cd. 配賦先品群ＣＤ.<p>
	 *
	 */
	public void ctg_cd(String value) {
		setConstString(offset + 40, $ctg_cd, value);
	}


	/**
	 * Allocation destination item category name 配賦先品群名.<p>
	 *
	 */
	public String ctg_nm() {
		return getConstString(offset + 41, $ctg_nm);
	}

	/**
	 * Allocation destination item category name 配賦先品群名.<p>
	 *
	 */
	public void ctg_nm(String value) {
		setConstString(offset + 41, $ctg_nm, value);
	}


	/**
	 * Item copy 品目引継.<p>
	 *
	 */
	public boolean itm_flg() {
		return getConstBoolean(offset + 42, $itm_flg);
	}

	/**
	 * Item copy 品目引継.<p>
	 *
	 */
	public void itm_flg(boolean value) {
		setConstBoolean(offset + 42, $itm_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 43, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 43, $itm_p, row);
	}


	/**
	 * Lot No. copy ロットＮＯ引継.<p>
	 *
	 */
	public boolean lot_no_flg() {
		return getConstBoolean(offset + 44, $lot_no_flg);
	}

	/**
	 * Lot No. copy ロットＮＯ引継.<p>
	 *
	 */
	public void lot_no_flg(boolean value) {
		setConstBoolean(offset + 44, $lot_no_flg, value);
	}


	/**
	 * Allocation destination lot No. 配賦先ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 45, $lot_no);
	}

	/**
	 * Allocation destination lot No. 配賦先ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 45, $lot_no, value);
	}


	/**
	 * Sublot No. copy サブロットＮＯ引継.<p>
	 *
	 */
	public boolean sublot_no_flg() {
		return getConstBoolean(offset + 46, $sublot_no_flg);
	}

	/**
	 * Sublot No. copy サブロットＮＯ引継.<p>
	 *
	 */
	public void sublot_no_flg(boolean value) {
		setConstBoolean(offset + 46, $sublot_no_flg, value);
	}


	/**
	 * Allocation destination sublot No. 配賦先サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 47, $sublot_no);
	}

	/**
	 * Allocation destination sublot No. 配賦先サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 47, $sublot_no, value);
	}


	/**
	 * Copy SEIBAN No. 1 手配ＮＯ１引継.<p>
	 *
	 */
	public boolean sno1_flg() {
		return getConstBoolean(offset + 48, $sno1_flg);
	}

	/**
	 * Copy SEIBAN No. 1 手配ＮＯ１引継.<p>
	 *
	 */
	public void sno1_flg(boolean value) {
		setConstBoolean(offset + 48, $sno1_flg, value);
	}


	/**
	 * Allocation destination SEIBAN No. 1 配賦先手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 49, $sno1);
	}

	/**
	 * Allocation destination SEIBAN No. 1 配賦先手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 49, $sno1, value);
	}


	/**
	 * Copy SEIBAN No. 2 手配ＮＯ２引継.<p>
	 *
	 */
	public boolean sno2_flg() {
		return getConstBoolean(offset + 50, $sno2_flg);
	}

	/**
	 * Copy SEIBAN No. 2 手配ＮＯ２引継.<p>
	 *
	 */
	public void sno2_flg(boolean value) {
		setConstBoolean(offset + 50, $sno2_flg, value);
	}


	/**
	 * Allocation destination SEIBAN No. 2 配賦先手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 51, $sno2);
	}

	/**
	 * Allocation destination SEIBAN No. 2 配賦先手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 51, $sno2, value);
	}


	/**
	 * Copy SEIBAN No. 3 手配ＮＯ３引継.<p>
	 *
	 */
	public boolean sno3_flg() {
		return getConstBoolean(offset + 52, $sno3_flg);
	}

	/**
	 * Copy SEIBAN No. 3 手配ＮＯ３引継.<p>
	 *
	 */
	public void sno3_flg(boolean value) {
		setConstBoolean(offset + 52, $sno3_flg, value);
	}


	/**
	 * Allocation destination SEIBAN No. 3 配賦先手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 53, $sno3);
	}

	/**
	 * Allocation destination SEIBAN No. 3 配賦先手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 53, $sno3, value);
	}


	/**
	 * Copy SEIBAN No. 4 手配ＮＯ４引継.<p>
	 *
	 */
	public boolean sno4_flg() {
		return getConstBoolean(offset + 54, $sno4_flg);
	}

	/**
	 * Copy SEIBAN No. 4 手配ＮＯ４引継.<p>
	 *
	 */
	public void sno4_flg(boolean value) {
		setConstBoolean(offset + 54, $sno4_flg, value);
	}


	/**
	 * Allocation destination SEIBAN No. 4 配賦先手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 55, $sno4);
	}

	/**
	 * Allocation destination SEIBAN No. 4 配賦先手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 55, $sno4, value);
	}


	/**
	 * Item order No. copy 品目指図ＮＯ引継.<p>
	 *
	 */
	public boolean itm_mfg_inst_no_flg() {
		return getConstBoolean(offset + 56, $itm_mfg_inst_no_flg);
	}

	/**
	 * Item order No. copy 品目指図ＮＯ引継.<p>
	 *
	 */
	public void itm_mfg_inst_no_flg(boolean value) {
		setConstBoolean(offset + 56, $itm_mfg_inst_no_flg, value);
	}


	/**
	 * Input location type 1 投入場所区分１.<p>
	 *
	 */
	public String inpt_loc_typ1() {
		return getConstString(offset + 57, $inpt_loc_typ1);
	}

	/**
	 * Input location type 1 投入場所区分１.<p>
	 *
	 */
	public void inpt_loc_typ1(String value) {
		setConstString(offset + 57, $inpt_loc_typ1, value);
	}


	/**
	 * Input location type 1 name 投入場所区分１名.<p>
	 *
	 */
	public String inpt_loc_typ1_nm() {
		return getConstString(offset + 58, $inpt_loc_typ1_nm);
	}

	/**
	 * Input location type 1 name 投入場所区分１名.<p>
	 *
	 */
	public void inpt_loc_typ1_nm(String value) {
		setConstString(offset + 58, $inpt_loc_typ1_nm, value);
	}


	/**
	 * Input location type 2 投入場所区分２.<p>
	 *
	 */
	public String inpt_loc_typ2() {
		return getConstString(offset + 59, $inpt_loc_typ2);
	}

	/**
	 * Input location type 2 投入場所区分２.<p>
	 *
	 */
	public void inpt_loc_typ2(String value) {
		setConstString(offset + 59, $inpt_loc_typ2, value);
	}


	/**
	 * Input location type 2 name 投入場所区分２名.<p>
	 *
	 */
	public String inpt_loc_typ2_nm() {
		return getConstString(offset + 60, $inpt_loc_typ2_nm);
	}

	/**
	 * Input location type 2 name 投入場所区分２名.<p>
	 *
	 */
	public void inpt_loc_typ2_nm(String value) {
		setConstString(offset + 60, $inpt_loc_typ2_nm, value);
	}


	/**
	 * Input location type 3 投入場所区分３.<p>
	 *
	 */
	public String inpt_loc_typ3() {
		return getConstString(offset + 61, $inpt_loc_typ3);
	}

	/**
	 * Input location type 3 投入場所区分３.<p>
	 *
	 */
	public void inpt_loc_typ3(String value) {
		setConstString(offset + 61, $inpt_loc_typ3, value);
	}


	/**
	 * Input location type 3 name 投入場所区分３名.<p>
	 *
	 */
	public String inpt_loc_typ3_nm() {
		return getConstString(offset + 62, $inpt_loc_typ3_nm);
	}

	/**
	 * Input location type 3 name 投入場所区分３名.<p>
	 *
	 */
	public void inpt_loc_typ3_nm(String value) {
		setConstString(offset + 62, $inpt_loc_typ3_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 63, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 63, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 64, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 64, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 65, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 65, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 66, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 66, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 67, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 67, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 68, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 68, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 69, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 69, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 70, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 70, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 71, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 71, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 71, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 71, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 71, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 71, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 72, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 72, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 73, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 73, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 74, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 74, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 75, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 75, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 76, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 76, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 77, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 77, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 78, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 78, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 79, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 79, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 80, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 80, $del_ts, value);
	}


	public String getString(String name) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			return ac_slip_typ_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($tgt_dpt_cd.equalsIgnoreCase(name)) {
			return tgt_dpt_cd();
		}
		if ($tgt_dpt_nm.equalsIgnoreCase(name)) {
			return tgt_dpt_nm();
		}
		if ($tgt_loc_cd.equalsIgnoreCase(name)) {
			return tgt_loc_cd();
		}
		if ($tgt_loc_nm.equalsIgnoreCase(name)) {
			return tgt_loc_nm();
		}
		if ($io_trans_typ.equalsIgnoreCase(name)) {
			return io_trans_typ();
		}
		if ($io_trans_typ_nm.equalsIgnoreCase(name)) {
			return io_trans_typ_nm();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($alc_wg_cd.equalsIgnoreCase(name)) {
			return alc_wg_cd();
		}
		if ($alc_wg_nm.equalsIgnoreCase(name)) {
			return alc_wg_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($inpt_loc_typ1.equalsIgnoreCase(name)) {
			return inpt_loc_typ1();
		}
		if ($inpt_loc_typ1_nm.equalsIgnoreCase(name)) {
			return inpt_loc_typ1_nm();
		}
		if ($inpt_loc_typ2.equalsIgnoreCase(name)) {
			return inpt_loc_typ2();
		}
		if ($inpt_loc_typ2_nm.equalsIgnoreCase(name)) {
			return inpt_loc_typ2_nm();
		}
		if ($inpt_loc_typ3.equalsIgnoreCase(name)) {
			return inpt_loc_typ3();
		}
		if ($inpt_loc_typ3_nm.equalsIgnoreCase(name)) {
			return inpt_loc_typ3_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($ac_rsn_null_flg.equalsIgnoreCase(name)) {
			return ac_rsn_null_flg();
		}
		if ($loc_null_flg.equalsIgnoreCase(name)) {
			return loc_null_flg();
		}
		if ($alc_amt_flg.equalsIgnoreCase(name)) {
			return alc_amt_flg();
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			return dpt_flg();
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			return oper_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($ctg_flg.equalsIgnoreCase(name)) {
			return ctg_flg();
		}
		if ($itm_flg.equalsIgnoreCase(name)) {
			return itm_flg();
		}
		if ($lot_no_flg.equalsIgnoreCase(name)) {
			return lot_no_flg();
		}
		if ($sublot_no_flg.equalsIgnoreCase(name)) {
			return sublot_no_flg();
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			return sno1_flg();
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			return sno2_flg();
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			return sno3_flg();
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			return sno4_flg();
		}
		if ($itm_mfg_inst_no_flg.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			return ac_slip_typ_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($tgt_dpt_cd.equalsIgnoreCase(name)) {
			return tgt_dpt_cd();
		}
		if ($tgt_dpt_nm.equalsIgnoreCase(name)) {
			return tgt_dpt_nm();
		}
		if ($tgt_loc_cd.equalsIgnoreCase(name)) {
			return tgt_loc_cd();
		}
		if ($tgt_loc_nm.equalsIgnoreCase(name)) {
			return tgt_loc_nm();
		}
		if ($io_trans_typ.equalsIgnoreCase(name)) {
			return io_trans_typ();
		}
		if ($io_trans_typ_nm.equalsIgnoreCase(name)) {
			return io_trans_typ_nm();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($alc_wg_cd.equalsIgnoreCase(name)) {
			return alc_wg_cd();
		}
		if ($alc_wg_nm.equalsIgnoreCase(name)) {
			return alc_wg_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($inpt_loc_typ1.equalsIgnoreCase(name)) {
			return inpt_loc_typ1();
		}
		if ($inpt_loc_typ1_nm.equalsIgnoreCase(name)) {
			return inpt_loc_typ1_nm();
		}
		if ($inpt_loc_typ2.equalsIgnoreCase(name)) {
			return inpt_loc_typ2();
		}
		if ($inpt_loc_typ2_nm.equalsIgnoreCase(name)) {
			return inpt_loc_typ2_nm();
		}
		if ($inpt_loc_typ3.equalsIgnoreCase(name)) {
			return inpt_loc_typ3();
		}
		if ($inpt_loc_typ3_nm.equalsIgnoreCase(name)) {
			return inpt_loc_typ3_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($ac_rsn_null_flg.equalsIgnoreCase(name)) {
			return ac_rsn_null_flg();
		}
		if ($loc_null_flg.equalsIgnoreCase(name)) {
			return loc_null_flg();
		}
		if ($alc_amt_flg.equalsIgnoreCase(name)) {
			return alc_amt_flg();
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			return dpt_flg();
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			return oper_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($ctg_flg.equalsIgnoreCase(name)) {
			return ctg_flg();
		}
		if ($itm_flg.equalsIgnoreCase(name)) {
			return itm_flg();
		}
		if ($lot_no_flg.equalsIgnoreCase(name)) {
			return lot_no_flg();
		}
		if ($sublot_no_flg.equalsIgnoreCase(name)) {
			return sublot_no_flg();
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			return sno1_flg();
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			return sno2_flg();
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			return sno3_flg();
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			return sno4_flg();
		}
		if ($itm_mfg_inst_no_flg.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
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
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			ac_slip_typ_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($tgt_dpt_cd.equalsIgnoreCase(name)) {
			tgt_dpt_cd(value);
			return;
		}
		if ($tgt_dpt_nm.equalsIgnoreCase(name)) {
			tgt_dpt_nm(value);
			return;
		}
		if ($tgt_loc_cd.equalsIgnoreCase(name)) {
			tgt_loc_cd(value);
			return;
		}
		if ($tgt_loc_nm.equalsIgnoreCase(name)) {
			tgt_loc_nm(value);
			return;
		}
		if ($io_trans_typ.equalsIgnoreCase(name)) {
			io_trans_typ(value);
			return;
		}
		if ($io_trans_typ_nm.equalsIgnoreCase(name)) {
			io_trans_typ_nm(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($alc_wg_cd.equalsIgnoreCase(name)) {
			alc_wg_cd(value);
			return;
		}
		if ($alc_wg_nm.equalsIgnoreCase(name)) {
			alc_wg_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
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
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($inpt_loc_typ1.equalsIgnoreCase(name)) {
			inpt_loc_typ1(value);
			return;
		}
		if ($inpt_loc_typ1_nm.equalsIgnoreCase(name)) {
			inpt_loc_typ1_nm(value);
			return;
		}
		if ($inpt_loc_typ2.equalsIgnoreCase(name)) {
			inpt_loc_typ2(value);
			return;
		}
		if ($inpt_loc_typ2_nm.equalsIgnoreCase(name)) {
			inpt_loc_typ2_nm(value);
			return;
		}
		if ($inpt_loc_typ3.equalsIgnoreCase(name)) {
			inpt_loc_typ3(value);
			return;
		}
		if ($inpt_loc_typ3_nm.equalsIgnoreCase(name)) {
			inpt_loc_typ3_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($ac_rsn_null_flg.equalsIgnoreCase(name)) {
			ac_rsn_null_flg(value);
			return;
		}
		if ($loc_null_flg.equalsIgnoreCase(name)) {
			loc_null_flg(value);
			return;
		}
		if ($alc_amt_flg.equalsIgnoreCase(name)) {
			alc_amt_flg(value);
			return;
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			dpt_flg(value);
			return;
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			oper_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($ctg_flg.equalsIgnoreCase(name)) {
			ctg_flg(value);
			return;
		}
		if ($itm_flg.equalsIgnoreCase(name)) {
			itm_flg(value);
			return;
		}
		if ($lot_no_flg.equalsIgnoreCase(name)) {
			lot_no_flg(value);
			return;
		}
		if ($sublot_no_flg.equalsIgnoreCase(name)) {
			sublot_no_flg(value);
			return;
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			sno1_flg(value);
			return;
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			sno2_flg(value);
			return;
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			sno3_flg(value);
			return;
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			sno4_flg(value);
			return;
		}
		if ($itm_mfg_inst_no_flg.equalsIgnoreCase(name)) {
			itm_mfg_inst_no_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
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
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			ac_slip_typ_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($tgt_dpt_cd.equalsIgnoreCase(name)) {
			tgt_dpt_cd(value);
			return;
		}
		if ($tgt_dpt_nm.equalsIgnoreCase(name)) {
			tgt_dpt_nm(value);
			return;
		}
		if ($tgt_loc_cd.equalsIgnoreCase(name)) {
			tgt_loc_cd(value);
			return;
		}
		if ($tgt_loc_nm.equalsIgnoreCase(name)) {
			tgt_loc_nm(value);
			return;
		}
		if ($io_trans_typ.equalsIgnoreCase(name)) {
			io_trans_typ(value);
			return;
		}
		if ($io_trans_typ_nm.equalsIgnoreCase(name)) {
			io_trans_typ_nm(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($alc_wg_cd.equalsIgnoreCase(name)) {
			alc_wg_cd(value);
			return;
		}
		if ($alc_wg_nm.equalsIgnoreCase(name)) {
			alc_wg_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
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
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($inpt_loc_typ1.equalsIgnoreCase(name)) {
			inpt_loc_typ1(value);
			return;
		}
		if ($inpt_loc_typ1_nm.equalsIgnoreCase(name)) {
			inpt_loc_typ1_nm(value);
			return;
		}
		if ($inpt_loc_typ2.equalsIgnoreCase(name)) {
			inpt_loc_typ2(value);
			return;
		}
		if ($inpt_loc_typ2_nm.equalsIgnoreCase(name)) {
			inpt_loc_typ2_nm(value);
			return;
		}
		if ($inpt_loc_typ3.equalsIgnoreCase(name)) {
			inpt_loc_typ3(value);
			return;
		}
		if ($inpt_loc_typ3_nm.equalsIgnoreCase(name)) {
			inpt_loc_typ3_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
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
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($ac_rsn_null_flg.equalsIgnoreCase(name)) {
			ac_rsn_null_flg(value);
			return;
		}
		if ($loc_null_flg.equalsIgnoreCase(name)) {
			loc_null_flg(value);
			return;
		}
		if ($alc_amt_flg.equalsIgnoreCase(name)) {
			alc_amt_flg(value);
			return;
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			dpt_flg(value);
			return;
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			oper_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($ctg_flg.equalsIgnoreCase(name)) {
			ctg_flg(value);
			return;
		}
		if ($itm_flg.equalsIgnoreCase(name)) {
			itm_flg(value);
			return;
		}
		if ($lot_no_flg.equalsIgnoreCase(name)) {
			lot_no_flg(value);
			return;
		}
		if ($sublot_no_flg.equalsIgnoreCase(name)) {
			sublot_no_flg(value);
			return;
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			sno1_flg(value);
			return;
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			sno2_flg(value);
			return;
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			sno3_flg(value);
			return;
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			sno4_flg(value);
			return;
		}
		if ($itm_mfg_inst_no_flg.equalsIgnoreCase(name)) {
			itm_mfg_inst_no_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dt_p.equalsIgnoreCase(name)) {
			return dt_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dt_p.equalsIgnoreCase(name)) {
			dt_p(
				((MCContainerMeta) dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5010.DtR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate st_dt_key() {
		return dt_p().st_dt_key();
	}

	public void st_dt_key(MCDate value) {
		dt_p().st_dt_key(value);
	}

	public MCDate st_dt() {
		return dt_p().st_dt();
	}

	public void st_dt(MCDate value) {
		dt_p().st_dt(value);
	}

	public MCDate end_dt() {
		return dt_p().end_dt();
	}

	public void end_dt(MCDate value) {
		dt_p().end_dt(value);
	}

	/**
	 * Allocation destination item cd. 配賦先品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return itm_p().itm_cd();
	}

	/**
	 * Allocation destination item cd. 配賦先品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	/**
	 * Allocation destination branch No. 1 配賦先枝番1.<p>
	 *
	 */
	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	/**
	 * Allocation destination branch No. 1 配賦先枝番1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	/**
	 * Allocation destination branch No. 2 配賦先枝番2.<p>
	 *
	 */
	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	/**
	 * Allocation destination branch No. 2 配賦先枝番2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	/**
	 * Allocation destination branch No. 3 配賦先枝番3.<p>
	 *
	 */
	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	/**
	 * Allocation destination branch No. 3 配賦先枝番3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	/**
	 * Allocation destination item name 配賦先品名.<p>
	 *
	 */
	public String itm_nm() {
		return itm_p().itm_nm();
	}

	/**
	 * Allocation destination item name 配賦先品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

}

