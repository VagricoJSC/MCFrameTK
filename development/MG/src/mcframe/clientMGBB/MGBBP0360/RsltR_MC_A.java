package mcframe.clientMGBB.MGBBP0360;

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
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public static final String $mng_dpt_cd = "mng_dpt_cd";
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public static final String $mng_dpt_nm = "mng_dpt_nm";
	public static final String $itm_p = "itm_p";
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
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
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
	 * Counterpart WG cd. 相手ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $other_wg_cd = "other_wg_cd";
	/**
	 * Counterpart WG name 相手ワーキンググループ名.<p>
	 *
	 */
	public static final String $other_wg_nm = "other_wg_nm";
	/**
	 * Counterpart dept. cd. 相手部門ＣＤ.<p>
	 *
	 */
	public static final String $other_dpt_cd = "other_dpt_cd";
	/**
	 * Counterpart dept. name 相手部門名.<p>
	 *
	 */
	public static final String $other_dpt_nm = "other_dpt_nm";
	/**
	 * Mfg. result group 製造実績グループ.<p>
	 *
	 */
	public static final String $mfg_act_grp = "mfg_act_grp";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * Company holding inventory cd. 在庫先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * Company holding inventory 在庫先名.<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public static final String $asst_typ_nm = "asst_typ_nm";
	public static final String $qty_p = "qty_p";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_amt_dec_place = "trd_amt_dec_place";
	public static final String $trd_amt_p = "trd_amt_p";
	public static final String $xrate_p = "xrate_p";
	public static final String $amt_p = "amt_p";
	/**
	 * Transfer group 振替グループ.<p>
	 *
	 */
	public static final String $trd_grp = "trd_grp";
	/**
	 * Transfer ratio 振替比率.<p>
	 *
	 */
	public static final String $trd_ratio = "trd_ratio";
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
	 * Allocation destination dept. cd. 配賦先部門ＣＤ.<p>
	 *
	 */
	public static final String $alc_dpt_cd = "alc_dpt_cd";
	/**
	 * Allocation destination dept. name 配賦先部門名.<p>
	 *
	 */
	public static final String $alc_dpt_nm = "alc_dpt_nm";
	/**
	 * Allocation destination location cd. 配賦先場所ＣＤ.<p>
	 *
	 */
	public static final String $alc_loc_cd = "alc_loc_cd";
	/**
	 * Allocation destination location name 配賦先場所名.<p>
	 *
	 */
	public static final String $alc_loc_nm = "alc_loc_nm";
	/**
	 * Allocation destination operation cd. 配賦先工程ＣＤ.<p>
	 *
	 */
	public static final String $alc_oper_cd = "alc_oper_cd";
	/**
	 * Allocation destination operation name 配賦先工程名.<p>
	 *
	 */
	public static final String $alc_oper_nm = "alc_oper_nm";
	/**
	 * Allocation destination BP cd. 配賦先取引先ＣＤ.<p>
	 *
	 */
	public static final String $alc_bp_cd = "alc_bp_cd";
	/**
	 * Allocation destination BP name 配賦先取引先名.<p>
	 *
	 */
	public static final String $alc_bp_nm = "alc_bp_nm";
	/**
	 * Allocation destination item category cd. 配賦先品群ＣＤ.<p>
	 *
	 */
	public static final String $alc_ctg_cd = "alc_ctg_cd";
	/**
	 * Allocation destination item category name 配賦先品群名.<p>
	 *
	 */
	public static final String $alc_ctg_nm = "alc_ctg_nm";
	public static final String $alc_itm_p = "alc_itm_p";
	/**
	 * Allocation destination item type 配賦先品目区分.<p>
	 *
	 */
	public static final String $alc_itm_typ = "alc_itm_typ";
	/**
	 * Allocation destination item type name 配賦先品目区分名.<p>
	 *
	 */
	public static final String $alc_itm_typ_nm = "alc_itm_typ_nm";
	/**
	 * Allocation destination item type details cd. 配賦先品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $alc_itm_typ_d_cd = "alc_itm_typ_d_cd";
	/**
	 * Allocation destination item type details name 配賦先品目区分詳細名.<p>
	 *
	 */
	public static final String $alc_itm_typ_d_nm = "alc_itm_typ_d_nm";
	/**
	 * Allocation destination item journal cd. 配賦先品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $alc_itm_jnl_cd = "alc_itm_jnl_cd";
	/**
	 * Allocation destination item journal name 配賦先品目仕訳名.<p>
	 *
	 */
	public static final String $alc_itm_jnl_nm = "alc_itm_jnl_nm";
	/**
	 * Allocation destination lot No. 配賦先ロットＮＯ.<p>
	 *
	 */
	public static final String $alc_lot_no = "alc_lot_no";
	/**
	 * Allocation destination sublot No. 配賦先サブロットＮＯ.<p>
	 *
	 */
	public static final String $alc_sublot_no = "alc_sublot_no";
	/**
	 * Allocation destination SEIBAN No. 1 配賦先手配ＮＯ１.<p>
	 *
	 */
	public static final String $alc_sno1 = "alc_sno1";
	/**
	 * Allocation destination SEIBAN No. 2 配賦先手配ＮＯ２.<p>
	 *
	 */
	public static final String $alc_sno2 = "alc_sno2";
	/**
	 * Allocation destination SEIBAN No. 3 配賦先手配ＮＯ３.<p>
	 *
	 */
	public static final String $alc_sno3 = "alc_sno3";
	/**
	 * Allocation destination SEIBAN No. 4 配賦先手配ＮＯ４.<p>
	 *
	 */
	public static final String $alc_sno4 = "alc_sno4";
	/**
	 * Allocation destination item mfg. order No. 配賦先品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $alc_itm_mfg_inst_no = "alc_itm_mfg_inst_no";
	/**
	 * Individual evaluation type 個別評価区分.<p>
	 *
	 */
	public static final String $rec_eval_typ = "rec_eval_typ";
	/**
	 * Individual evaluation type name 個別評価区分名.<p>
	 *
	 */
	public static final String $rec_eval_typ_nm = "rec_eval_typ_nm";
	/**
	 * Not to plan 計画対象外.<p>
	 *
	 */
	public static final String $no_pln_flg = "no_pln_flg";
	/**
	 * Not for item info. 品目情報対象外.<p>
	 *
	 */
	public static final String $no_itm_info_flg = "no_itm_info_flg";
	/**
	 * Zero evaluation ゼロ評価.<p>
	 *
	 */
	public static final String $zero_effect_flg = "zero_effect_flg";
	/**
	 * Slip No. 伝票ＮＯ.<p>
	 *
	 */
	public static final String $slip_no = "slip_no";
	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public static final String $slip_seq_no = "slip_seq_no";
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public static final String $rmrks = "rmrks";
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
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public static final String $data_lno = "data_lno";
	public static final String $rts_msg_p = "rts_msg_p";
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
	public static final String $qty = $qty_p + ".qty";
	public static final String $trd_cur_amt = $trd_amt_p + ".amt";
	public static final String $xrate = $xrate_p + ".xrate";
	public static final String $amt = $amt_p + ".amt";
	public static final String $alc_itm_cd = $alc_itm_p + ".itm_cd";
	public static final String $alc_itm_sub1 = $alc_itm_p + ".itm_sub1";
	public static final String $alc_itm_sub2 = $alc_itm_p + ".itm_sub2";
	public static final String $alc_itm_sub3 = $alc_itm_p + ".itm_sub3";
	public static final String $alc_itm_nm = $alc_itm_p + ".itm_nm";
	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta ac_slip_typ_nm_META = createCommonMeta($ac_slip_typ_nm, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP_NM);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta other_wg_cd_META = createCommonMeta($other_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta other_wg_nm_META = createCommonMeta($other_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta other_dpt_cd_META = createCommonMeta($other_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta other_dpt_nm_META = createCommonMeta($other_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta mfg_act_grp_META = createCommonMeta($mfg_act_grp, mcframe.commonMG.meta.MG_META.MFG_ACT_GRP);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta qty_p_META = createInnerRowMeta($qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_amt_dec_place_META = createCommonMeta($trd_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_amt_p_META = createInnerRowMeta($trd_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xrate_p_META = createInnerRowMeta($xrate_p, mcframe.clientMAUB.MAUBP5390.XrateR.class);
	public static final MCMeta amt_p_META = createInnerRowMeta($amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta trd_grp_META = createCommonMeta($trd_grp, mcframe.commonMA.meta.MA_META.TRD_GRP);
	public static final MCMeta trd_ratio_META = createCommonMeta($trd_ratio, mcframe.commonMG.meta.MG_META.TRD_RATIO);
	public static final MCMeta alc_ac_cd_META = createCommonMeta($alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta alc_ac_nm_META = createCommonMeta($alc_ac_nm, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta alc_amt_flg_META = createCommonMeta($alc_amt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alc_wg_cd_META = createCommonMeta($alc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta alc_wg_nm_META = createCommonMeta($alc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta alc_dpt_cd_META = createCommonMeta($alc_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta alc_dpt_nm_META = createCommonMeta($alc_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta alc_loc_cd_META = createCommonMeta($alc_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta alc_loc_nm_META = createCommonMeta($alc_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta alc_oper_cd_META = createCommonMeta($alc_oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta alc_oper_nm_META = createCommonMeta($alc_oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta alc_bp_cd_META = createCommonMeta($alc_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta alc_bp_nm_META = createCommonMeta($alc_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta alc_ctg_cd_META = createCommonMeta($alc_ctg_cd, mcframe.commonMA.meta.MA_META.COST_CTG_CD);
	public static final MCMeta alc_ctg_nm_META = createCommonMeta($alc_ctg_nm, mcframe.commonMA.meta.MA_META.COST_CTG_NM);
	public static final MCMeta alc_itm_p_META = createInnerRowMeta($alc_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta alc_itm_typ_META = createCommonMeta($alc_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta alc_itm_typ_nm_META = createCommonMeta($alc_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta alc_itm_typ_d_cd_META = createCommonMeta($alc_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta alc_itm_typ_d_nm_META = createCommonMeta($alc_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta alc_itm_jnl_cd_META = createCommonMeta($alc_itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta alc_itm_jnl_nm_META = createCommonMeta($alc_itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta alc_lot_no_META = createCommonMeta($alc_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta alc_sublot_no_META = createCommonMeta($alc_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta alc_sno1_META = createCommonMeta($alc_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta alc_sno2_META = createCommonMeta($alc_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta alc_sno3_META = createCommonMeta($alc_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta alc_sno4_META = createCommonMeta($alc_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta alc_itm_mfg_inst_no_META = createCommonMeta($alc_itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta rec_eval_typ_META = createCommonMeta($rec_eval_typ, mcframe.commonMG.meta.MG_META.REC_EVAL_TYP);
	public static final MCMeta rec_eval_typ_nm_META = createCommonMeta($rec_eval_typ_nm, mcframe.commonMG.meta.MG_META.REC_EVAL_TYP_NM);
	public static final MCMeta no_pln_flg_META = createCommonMeta($no_pln_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_itm_info_flg_META = createCommonMeta($no_itm_info_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta zero_effect_flg_META = createCommonMeta($zero_effect_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slip_no_META = createCommonMeta($slip_no, mcframe.commonMA.meta.MA_META.SLIP_NO);
	public static final MCMeta slip_seq_no_META = createCommonMeta($slip_seq_no, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta rmrks_META = createCommonMeta($rmrks, mcframe.commonMG.meta.MG_META.ACT_IO_IF_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMG.meta.MG_META.ACT_IO_IF_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMG.meta.MG_META.ACT_IO_IF_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMG.meta.MG_META.ACT_IO_IF_SUB_CHAR3);
	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
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
			calc_ctg_cd_META,
			calc_ctg_nm_META,
			wg_cd_META,
			wg_nm_META,
			ym_META,
			ac_dt_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			itm_p_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			ac_slip_typ_META,
			ac_slip_typ_nm_META,
			ac_rsn_cd_META,
			ac_rsn_nm_META,
			other_wg_cd_META,
			other_wg_nm_META,
			other_dpt_cd_META,
			other_dpt_nm_META,
			mfg_act_grp_META,
			bp_cd_META,
			bp_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			qty_p_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_amt_dec_place_META,
			trd_amt_p_META,
			xrate_p_META,
			amt_p_META,
			trd_grp_META,
			trd_ratio_META,
			alc_ac_cd_META,
			alc_ac_nm_META,
			alc_amt_flg_META,
			alc_wg_cd_META,
			alc_wg_nm_META,
			alc_dpt_cd_META,
			alc_dpt_nm_META,
			alc_loc_cd_META,
			alc_loc_nm_META,
			alc_oper_cd_META,
			alc_oper_nm_META,
			alc_bp_cd_META,
			alc_bp_nm_META,
			alc_ctg_cd_META,
			alc_ctg_nm_META,
			alc_itm_p_META,
			alc_itm_typ_META,
			alc_itm_typ_nm_META,
			alc_itm_typ_d_cd_META,
			alc_itm_typ_d_nm_META,
			alc_itm_jnl_cd_META,
			alc_itm_jnl_nm_META,
			alc_lot_no_META,
			alc_sublot_no_META,
			alc_sno1_META,
			alc_sno2_META,
			alc_sno3_META,
			alc_sno4_META,
			alc_itm_mfg_inst_no_META,
			rec_eval_typ_META,
			rec_eval_typ_nm_META,
			no_pln_flg_META,
			no_itm_info_flg_META,
			zero_effect_flg_META,
			slip_no_META,
			slip_seq_no_META,
			rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			data_lno_META,
			rts_msg_p_META,
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
				"qty",
				"trd_cur_amt",
				"xrate",
				"amt",
				"alc_itm_cd",
				"alc_itm_sub1",
				"alc_itm_sub2",
				"alc_itm_sub3",
				"alc_itm_nm",
				"rtn_sts_typ"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$qty,
				$trd_cur_amt,
				$xrate,
				$amt,
				$alc_itm_cd,
				$alc_itm_sub1,
				$alc_itm_sub2,
				$alc_itm_sub3,
				$alc_itm_nm,
				$rtn_sts_typ
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
				{$mng_dpt_cd, "dpt_nm"},	// mng_dpt_cd
				{$other_wg_cd, "wg_nm"},	// other_wg_cd
				{$other_dpt_cd, "dpt_nm"},	// other_dpt_cd
				{$stk_bp_cd, "bp_nm"},	// stk_bp_cd
				{$trd_cur_cd, "cur_nm;amt_dec_place"},	// trd_cur_cd
				{$alc_wg_cd, "wg_nm"},	// alc_wg_cd
				{$alc_dpt_cd, "dpt_nm"},	// alc_dpt_cd
				{$alc_loc_cd, "loc_nm"},	// alc_loc_cd
				{$alc_oper_cd, "oper_nm"},	// alc_oper_cd
				{$alc_bp_cd, "bp_nm"},	// alc_bp_cd
				{$alc_ctg_cd, "ctg_nm"},	// alc_ctg_cd
				{$alc_itm_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3;itm_jnl_cd;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm"},	// alc_itm_p.itm_cd
				{$alc_itm_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3;itm_jnl_cd;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm"},	// alc_itm_p.itm_sub1
				{$alc_itm_p + ".itm_sub2", "itm_nm;itm_sub3;itm_jnl_cd;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm"},	// alc_itm_p.itm_sub2
				{$alc_itm_p + ".itm_sub3", "itm_nm;itm_jnl_cd;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm"},	// alc_itm_p.itm_sub3
				{$alc_itm_jnl_cd, "itm_jnl_nm"}	// alc_itm_jnl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$wg_cd, "true"},	// wg_cd
				{$mng_dpt_cd, "ym"},	// mng_dpt_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.ASSET1"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.ASSET1;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.ASSET1;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.ASSET1;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$other_wg_cd, "true"},	// other_wg_cd
				{$other_dpt_cd, "ym"},	// other_dpt_cd
				{$bp_cd, "MAC_BP_IS_SRCH_TYP.COMM"},	// bp_cd
				{$stk_bp_cd, "MAC_BP_IS_SRCH_TYP.COMM"},	// stk_bp_cd
				{$alc_wg_cd, "true"},	// alc_wg_cd
				{$alc_dpt_cd, "ym"},	// alc_dpt_cd
				{$alc_loc_cd, "MAC_LOC_IS_SRCH_TYP.MFG_WG_ALL"},	// alc_loc_cd
				{$alc_bp_cd, "MAC_BP_IS_SRCH_TYP.COMM"},	// alc_bp_cd
				{$alc_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.ASSET1"},	// alc_itm_p.itm_cd
				{$alc_itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.ASSET1;alc_itm_cd"},	// alc_itm_p.itm_sub1
				{$alc_itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.ASSET1;alc_itm_cd;alc_itm_sub1"},	// alc_itm_p.itm_sub2
				{$alc_itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.ASSET1;alc_itm_cd;alc_itm_sub1;alc_itm_sub2"}	// alc_itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$wg_cd, "wr_flg"},	// wg_cd
				{$mng_dpt_cd, "ym"},	// mng_dpt_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$other_wg_cd, "wr_flg"},	// other_wg_cd
				{$other_dpt_cd, "ym"},	// other_dpt_cd
				{$bp_cd, "bp_is_srch_typ"},	// bp_cd
				{$stk_bp_cd, "bp_is_srch_typ"},	// stk_bp_cd
				{$alc_wg_cd, "wr_flg"},	// alc_wg_cd
				{$alc_dpt_cd, "ym"},	// alc_dpt_cd
				{$alc_loc_cd, "loc_is_srch_typ"},	// alc_loc_cd
				{$alc_bp_cd, "bp_is_srch_typ"},	// alc_bp_cd
				{$alc_itm_p + ".itm_cd", "itm_is_srch_typ"},	// alc_itm_p.itm_cd
				{$alc_itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// alc_itm_p.itm_sub1
				{$alc_itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// alc_itm_p.itm_sub2
				{$alc_itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// alc_itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$sno1, "SNO1"},	// sno1
				{$sno2, "SNO2"},	// sno2
				{$sno3, "SNO3"},	// sno3
				{$sno4, "SNO4"},	// sno4
				{$other_wg_cd, "WG"},	// other_wg_cd
				{$other_wg_nm, "WG"},	// other_wg_nm
				{$alc_wg_cd, "WG"},	// alc_wg_cd
				{$alc_wg_nm, "WG"},	// alc_wg_nm
				{$alc_sno1, "SNO1"},	// alc_sno1
				{$alc_sno2, "SNO2"},	// alc_sno2
				{$alc_sno3, "SNO3"},	// alc_sno3
				{$alc_sno4, "SNO4"}	// alc_sno4
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
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 1, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 1, $calc_ctg_cd, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 2, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 2, $calc_ctg_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 3, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 3, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 4, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 4, $wg_nm, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 5, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 5, $ym, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 6, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 6, $ac_dt, value);
	}


	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 7, $mng_dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 7, $mng_dpt_cd, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 8, $mng_dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 8, $mng_dpt_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 9, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 9, $itm_p, row);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 10, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 10, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 11, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 11, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 12, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 12, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 13, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 13, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 14, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 14, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 15, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 15, $itm_jnl_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 16, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 16, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 17, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 17, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 18, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 18, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 19, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 19, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 20, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 20, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 21, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 21, $sno4, value);
	}


	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 22, $ac_slip_typ);
	}

	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 22, $ac_slip_typ, value);
	}


	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public String ac_slip_typ_nm() {
		return getConstString(offset + 23, $ac_slip_typ_nm);
	}

	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public void ac_slip_typ_nm(String value) {
		setConstString(offset + 23, $ac_slip_typ_nm, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 24, $ac_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 24, $ac_rsn_cd, value);
	}


	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 25, $ac_rsn_nm);
	}

	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 25, $ac_rsn_nm, value);
	}


	/**
	 * Counterpart WG cd. 相手ワーキンググループＣＤ.<p>
	 *
	 */
	public String other_wg_cd() {
		return getConstString(offset + 26, $other_wg_cd);
	}

	/**
	 * Counterpart WG cd. 相手ワーキンググループＣＤ.<p>
	 *
	 */
	public void other_wg_cd(String value) {
		setConstString(offset + 26, $other_wg_cd, value);
	}


	/**
	 * Counterpart WG name 相手ワーキンググループ名.<p>
	 *
	 */
	public String other_wg_nm() {
		return getConstString(offset + 27, $other_wg_nm);
	}

	/**
	 * Counterpart WG name 相手ワーキンググループ名.<p>
	 *
	 */
	public void other_wg_nm(String value) {
		setConstString(offset + 27, $other_wg_nm, value);
	}


	/**
	 * Counterpart dept. cd. 相手部門ＣＤ.<p>
	 *
	 */
	public String other_dpt_cd() {
		return getConstString(offset + 28, $other_dpt_cd);
	}

	/**
	 * Counterpart dept. cd. 相手部門ＣＤ.<p>
	 *
	 */
	public void other_dpt_cd(String value) {
		setConstString(offset + 28, $other_dpt_cd, value);
	}


	/**
	 * Counterpart dept. name 相手部門名.<p>
	 *
	 */
	public String other_dpt_nm() {
		return getConstString(offset + 29, $other_dpt_nm);
	}

	/**
	 * Counterpart dept. name 相手部門名.<p>
	 *
	 */
	public void other_dpt_nm(String value) {
		setConstString(offset + 29, $other_dpt_nm, value);
	}


	/**
	 * Mfg. result group 製造実績グループ.<p>
	 *
	 */
	public String mfg_act_grp() {
		return getConstString(offset + 30, $mfg_act_grp);
	}

	/**
	 * Mfg. result group 製造実績グループ.<p>
	 *
	 */
	public void mfg_act_grp(String value) {
		setConstString(offset + 30, $mfg_act_grp, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 31, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 31, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 32, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 32, $bp_nm, value);
	}


	/**
	 * Company holding inventory cd. 在庫先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 33, $stk_bp_cd);
	}

	/**
	 * Company holding inventory cd. 在庫先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 33, $stk_bp_cd, value);
	}


	/**
	 * Company holding inventory 在庫先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 34, $stk_bp_nm);
	}

	/**
	 * Company holding inventory 在庫先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 34, $stk_bp_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 35, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 35, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 36, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 36, $asst_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 37, $qty_p);
	}
	
	public void qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 37, $qty_p, row);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 38, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 38, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 39, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 39, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 40, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 40, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 40, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 40, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 40, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 40, $dec_place, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 41, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 41, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 42, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 42, $trd_cur_nm, value);
	}


	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_amt_dec_place() {
		return getConstNumber(offset + 43, $trd_amt_dec_place);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 43, $trd_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(int value) {
		setConstNumber(offset + 43, $trd_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(long value) {
		setConstNumber(offset + 43, $trd_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(float value) {
		setConstNumber(offset + 43, $trd_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(double value) {
		setConstNumber(offset + 43, $trd_amt_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 44, $trd_amt_p);
	}
	
	public void trd_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 44, $trd_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5390.XrateR xrate_p(){
		return (mcframe.clientMAUB.MAUBP5390.XrateR) getConstInnerRow(offset + 45, $xrate_p);
	}
	
	public void xrate_p(mcframe.clientMAUB.MAUBP5390.XrateR row){
		setConstInnerRow(offset + 45, $xrate_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 46, $amt_p);
	}
	
	public void amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 46, $amt_p, row);
	}


	/**
	 * Transfer group 振替グループ.<p>
	 *
	 */
	public String trd_grp() {
		return getConstString(offset + 47, $trd_grp);
	}

	/**
	 * Transfer group 振替グループ.<p>
	 *
	 */
	public void trd_grp(String value) {
		setConstString(offset + 47, $trd_grp, value);
	}


	/**
	 * Transfer ratio 振替比率.<p>
	 *
	 */
	public MCNumber trd_ratio() {
		return getConstNumber(offset + 48, $trd_ratio);
	}

	/**
	 * Transfer ratio 振替比率.<p>
	 *
	 */
	public void trd_ratio(MCNumber value) {
		setConstNumber(offset + 48, $trd_ratio, value);
	}

	/**
	 * Transfer ratio 振替比率.<p>
	 *
	 */
	public void trd_ratio(int value) {
		setConstNumber(offset + 48, $trd_ratio, value);
	}

	/**
	 * Transfer ratio 振替比率.<p>
	 *
	 */
	public void trd_ratio(long value) {
		setConstNumber(offset + 48, $trd_ratio, value);
	}

	/**
	 * Transfer ratio 振替比率.<p>
	 *
	 */
	public void trd_ratio(float value) {
		setConstNumber(offset + 48, $trd_ratio, value);
	}

	/**
	 * Transfer ratio 振替比率.<p>
	 *
	 */
	public void trd_ratio(double value) {
		setConstNumber(offset + 48, $trd_ratio, value);
	}


	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public String alc_ac_cd() {
		return getConstString(offset + 49, $alc_ac_cd);
	}

	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		setConstString(offset + 49, $alc_ac_cd, value);
	}


	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public String alc_ac_nm() {
		return getConstString(offset + 50, $alc_ac_nm);
	}

	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public void alc_ac_nm(String value) {
		setConstString(offset + 50, $alc_ac_nm, value);
	}


	/**
	 * Transfer allocation 配賦振替.<p>
	 *
	 */
	public boolean alc_amt_flg() {
		return getConstBoolean(offset + 51, $alc_amt_flg);
	}

	/**
	 * Transfer allocation 配賦振替.<p>
	 *
	 */
	public void alc_amt_flg(boolean value) {
		setConstBoolean(offset + 51, $alc_amt_flg, value);
	}


	/**
	 * Allocation WG cd. 配賦ワーキンググループＣＤ.<p>
	 *
	 */
	public String alc_wg_cd() {
		return getConstString(offset + 52, $alc_wg_cd);
	}

	/**
	 * Allocation WG cd. 配賦ワーキンググループＣＤ.<p>
	 *
	 */
	public void alc_wg_cd(String value) {
		setConstString(offset + 52, $alc_wg_cd, value);
	}


	/**
	 * Allocation WG name 配賦ワーキンググループ名.<p>
	 *
	 */
	public String alc_wg_nm() {
		return getConstString(offset + 53, $alc_wg_nm);
	}

	/**
	 * Allocation WG name 配賦ワーキンググループ名.<p>
	 *
	 */
	public void alc_wg_nm(String value) {
		setConstString(offset + 53, $alc_wg_nm, value);
	}


	/**
	 * Allocation destination dept. cd. 配賦先部門ＣＤ.<p>
	 *
	 */
	public String alc_dpt_cd() {
		return getConstString(offset + 54, $alc_dpt_cd);
	}

	/**
	 * Allocation destination dept. cd. 配賦先部門ＣＤ.<p>
	 *
	 */
	public void alc_dpt_cd(String value) {
		setConstString(offset + 54, $alc_dpt_cd, value);
	}


	/**
	 * Allocation destination dept. name 配賦先部門名.<p>
	 *
	 */
	public String alc_dpt_nm() {
		return getConstString(offset + 55, $alc_dpt_nm);
	}

	/**
	 * Allocation destination dept. name 配賦先部門名.<p>
	 *
	 */
	public void alc_dpt_nm(String value) {
		setConstString(offset + 55, $alc_dpt_nm, value);
	}


	/**
	 * Allocation destination location cd. 配賦先場所ＣＤ.<p>
	 *
	 */
	public String alc_loc_cd() {
		return getConstString(offset + 56, $alc_loc_cd);
	}

	/**
	 * Allocation destination location cd. 配賦先場所ＣＤ.<p>
	 *
	 */
	public void alc_loc_cd(String value) {
		setConstString(offset + 56, $alc_loc_cd, value);
	}


	/**
	 * Allocation destination location name 配賦先場所名.<p>
	 *
	 */
	public String alc_loc_nm() {
		return getConstString(offset + 57, $alc_loc_nm);
	}

	/**
	 * Allocation destination location name 配賦先場所名.<p>
	 *
	 */
	public void alc_loc_nm(String value) {
		setConstString(offset + 57, $alc_loc_nm, value);
	}


	/**
	 * Allocation destination operation cd. 配賦先工程ＣＤ.<p>
	 *
	 */
	public String alc_oper_cd() {
		return getConstString(offset + 58, $alc_oper_cd);
	}

	/**
	 * Allocation destination operation cd. 配賦先工程ＣＤ.<p>
	 *
	 */
	public void alc_oper_cd(String value) {
		setConstString(offset + 58, $alc_oper_cd, value);
	}


	/**
	 * Allocation destination operation name 配賦先工程名.<p>
	 *
	 */
	public String alc_oper_nm() {
		return getConstString(offset + 59, $alc_oper_nm);
	}

	/**
	 * Allocation destination operation name 配賦先工程名.<p>
	 *
	 */
	public void alc_oper_nm(String value) {
		setConstString(offset + 59, $alc_oper_nm, value);
	}


	/**
	 * Allocation destination BP cd. 配賦先取引先ＣＤ.<p>
	 *
	 */
	public String alc_bp_cd() {
		return getConstString(offset + 60, $alc_bp_cd);
	}

	/**
	 * Allocation destination BP cd. 配賦先取引先ＣＤ.<p>
	 *
	 */
	public void alc_bp_cd(String value) {
		setConstString(offset + 60, $alc_bp_cd, value);
	}


	/**
	 * Allocation destination BP name 配賦先取引先名.<p>
	 *
	 */
	public String alc_bp_nm() {
		return getConstString(offset + 61, $alc_bp_nm);
	}

	/**
	 * Allocation destination BP name 配賦先取引先名.<p>
	 *
	 */
	public void alc_bp_nm(String value) {
		setConstString(offset + 61, $alc_bp_nm, value);
	}


	/**
	 * Allocation destination item category cd. 配賦先品群ＣＤ.<p>
	 *
	 */
	public String alc_ctg_cd() {
		return getConstString(offset + 62, $alc_ctg_cd);
	}

	/**
	 * Allocation destination item category cd. 配賦先品群ＣＤ.<p>
	 *
	 */
	public void alc_ctg_cd(String value) {
		setConstString(offset + 62, $alc_ctg_cd, value);
	}


	/**
	 * Allocation destination item category name 配賦先品群名.<p>
	 *
	 */
	public String alc_ctg_nm() {
		return getConstString(offset + 63, $alc_ctg_nm);
	}

	/**
	 * Allocation destination item category name 配賦先品群名.<p>
	 *
	 */
	public void alc_ctg_nm(String value) {
		setConstString(offset + 63, $alc_ctg_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR alc_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 64, $alc_itm_p);
	}
	
	public void alc_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 64, $alc_itm_p, row);
	}


	/**
	 * Allocation destination item type 配賦先品目区分.<p>
	 *
	 */
	public String alc_itm_typ() {
		return getConstString(offset + 65, $alc_itm_typ);
	}

	/**
	 * Allocation destination item type 配賦先品目区分.<p>
	 *
	 */
	public void alc_itm_typ(String value) {
		setConstString(offset + 65, $alc_itm_typ, value);
	}


	/**
	 * Allocation destination item type name 配賦先品目区分名.<p>
	 *
	 */
	public String alc_itm_typ_nm() {
		return getConstString(offset + 66, $alc_itm_typ_nm);
	}

	/**
	 * Allocation destination item type name 配賦先品目区分名.<p>
	 *
	 */
	public void alc_itm_typ_nm(String value) {
		setConstString(offset + 66, $alc_itm_typ_nm, value);
	}


	/**
	 * Allocation destination item type details cd. 配賦先品目区分詳細ＣＤ.<p>
	 *
	 */
	public String alc_itm_typ_d_cd() {
		return getConstString(offset + 67, $alc_itm_typ_d_cd);
	}

	/**
	 * Allocation destination item type details cd. 配賦先品目区分詳細ＣＤ.<p>
	 *
	 */
	public void alc_itm_typ_d_cd(String value) {
		setConstString(offset + 67, $alc_itm_typ_d_cd, value);
	}


	/**
	 * Allocation destination item type details name 配賦先品目区分詳細名.<p>
	 *
	 */
	public String alc_itm_typ_d_nm() {
		return getConstString(offset + 68, $alc_itm_typ_d_nm);
	}

	/**
	 * Allocation destination item type details name 配賦先品目区分詳細名.<p>
	 *
	 */
	public void alc_itm_typ_d_nm(String value) {
		setConstString(offset + 68, $alc_itm_typ_d_nm, value);
	}


	/**
	 * Allocation destination item journal cd. 配賦先品目仕訳ＣＤ.<p>
	 *
	 */
	public String alc_itm_jnl_cd() {
		return getConstString(offset + 69, $alc_itm_jnl_cd);
	}

	/**
	 * Allocation destination item journal cd. 配賦先品目仕訳ＣＤ.<p>
	 *
	 */
	public void alc_itm_jnl_cd(String value) {
		setConstString(offset + 69, $alc_itm_jnl_cd, value);
	}


	/**
	 * Allocation destination item journal name 配賦先品目仕訳名.<p>
	 *
	 */
	public String alc_itm_jnl_nm() {
		return getConstString(offset + 70, $alc_itm_jnl_nm);
	}

	/**
	 * Allocation destination item journal name 配賦先品目仕訳名.<p>
	 *
	 */
	public void alc_itm_jnl_nm(String value) {
		setConstString(offset + 70, $alc_itm_jnl_nm, value);
	}


	/**
	 * Allocation destination lot No. 配賦先ロットＮＯ.<p>
	 *
	 */
	public String alc_lot_no() {
		return getConstString(offset + 71, $alc_lot_no);
	}

	/**
	 * Allocation destination lot No. 配賦先ロットＮＯ.<p>
	 *
	 */
	public void alc_lot_no(String value) {
		setConstString(offset + 71, $alc_lot_no, value);
	}


	/**
	 * Allocation destination sublot No. 配賦先サブロットＮＯ.<p>
	 *
	 */
	public String alc_sublot_no() {
		return getConstString(offset + 72, $alc_sublot_no);
	}

	/**
	 * Allocation destination sublot No. 配賦先サブロットＮＯ.<p>
	 *
	 */
	public void alc_sublot_no(String value) {
		setConstString(offset + 72, $alc_sublot_no, value);
	}


	/**
	 * Allocation destination SEIBAN No. 1 配賦先手配ＮＯ１.<p>
	 *
	 */
	public String alc_sno1() {
		return getConstString(offset + 73, $alc_sno1);
	}

	/**
	 * Allocation destination SEIBAN No. 1 配賦先手配ＮＯ１.<p>
	 *
	 */
	public void alc_sno1(String value) {
		setConstString(offset + 73, $alc_sno1, value);
	}


	/**
	 * Allocation destination SEIBAN No. 2 配賦先手配ＮＯ２.<p>
	 *
	 */
	public String alc_sno2() {
		return getConstString(offset + 74, $alc_sno2);
	}

	/**
	 * Allocation destination SEIBAN No. 2 配賦先手配ＮＯ２.<p>
	 *
	 */
	public void alc_sno2(String value) {
		setConstString(offset + 74, $alc_sno2, value);
	}


	/**
	 * Allocation destination SEIBAN No. 3 配賦先手配ＮＯ３.<p>
	 *
	 */
	public String alc_sno3() {
		return getConstString(offset + 75, $alc_sno3);
	}

	/**
	 * Allocation destination SEIBAN No. 3 配賦先手配ＮＯ３.<p>
	 *
	 */
	public void alc_sno3(String value) {
		setConstString(offset + 75, $alc_sno3, value);
	}


	/**
	 * Allocation destination SEIBAN No. 4 配賦先手配ＮＯ４.<p>
	 *
	 */
	public String alc_sno4() {
		return getConstString(offset + 76, $alc_sno4);
	}

	/**
	 * Allocation destination SEIBAN No. 4 配賦先手配ＮＯ４.<p>
	 *
	 */
	public void alc_sno4(String value) {
		setConstString(offset + 76, $alc_sno4, value);
	}


	/**
	 * Allocation destination item mfg. order No. 配賦先品目製造指図ＮＯ.<p>
	 *
	 */
	public String alc_itm_mfg_inst_no() {
		return getConstString(offset + 77, $alc_itm_mfg_inst_no);
	}

	/**
	 * Allocation destination item mfg. order No. 配賦先品目製造指図ＮＯ.<p>
	 *
	 */
	public void alc_itm_mfg_inst_no(String value) {
		setConstString(offset + 77, $alc_itm_mfg_inst_no, value);
	}


	/**
	 * Individual evaluation type 個別評価区分.<p>
	 *
	 */
	public String rec_eval_typ() {
		return getConstString(offset + 78, $rec_eval_typ);
	}

	/**
	 * Individual evaluation type 個別評価区分.<p>
	 *
	 */
	public void rec_eval_typ(String value) {
		setConstString(offset + 78, $rec_eval_typ, value);
	}


	/**
	 * Individual evaluation type name 個別評価区分名.<p>
	 *
	 */
	public String rec_eval_typ_nm() {
		return getConstString(offset + 79, $rec_eval_typ_nm);
	}

	/**
	 * Individual evaluation type name 個別評価区分名.<p>
	 *
	 */
	public void rec_eval_typ_nm(String value) {
		setConstString(offset + 79, $rec_eval_typ_nm, value);
	}


	/**
	 * Not to plan 計画対象外.<p>
	 *
	 */
	public boolean no_pln_flg() {
		return getConstBoolean(offset + 80, $no_pln_flg);
	}

	/**
	 * Not to plan 計画対象外.<p>
	 *
	 */
	public void no_pln_flg(boolean value) {
		setConstBoolean(offset + 80, $no_pln_flg, value);
	}


	/**
	 * Not for item info. 品目情報対象外.<p>
	 *
	 */
	public boolean no_itm_info_flg() {
		return getConstBoolean(offset + 81, $no_itm_info_flg);
	}

	/**
	 * Not for item info. 品目情報対象外.<p>
	 *
	 */
	public void no_itm_info_flg(boolean value) {
		setConstBoolean(offset + 81, $no_itm_info_flg, value);
	}


	/**
	 * Zero evaluation ゼロ評価.<p>
	 *
	 */
	public boolean zero_effect_flg() {
		return getConstBoolean(offset + 82, $zero_effect_flg);
	}

	/**
	 * Zero evaluation ゼロ評価.<p>
	 *
	 */
	public void zero_effect_flg(boolean value) {
		setConstBoolean(offset + 82, $zero_effect_flg, value);
	}


	/**
	 * Slip No. 伝票ＮＯ.<p>
	 *
	 */
	public String slip_no() {
		return getConstString(offset + 83, $slip_no);
	}

	/**
	 * Slip No. 伝票ＮＯ.<p>
	 *
	 */
	public void slip_no(String value) {
		setConstString(offset + 83, $slip_no, value);
	}


	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public MCNumber slip_seq_no() {
		return getConstNumber(offset + 84, $slip_seq_no);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(MCNumber value) {
		setConstNumber(offset + 84, $slip_seq_no, value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(int value) {
		setConstNumber(offset + 84, $slip_seq_no, value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(long value) {
		setConstNumber(offset + 84, $slip_seq_no, value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(float value) {
		setConstNumber(offset + 84, $slip_seq_no, value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(double value) {
		setConstNumber(offset + 84, $slip_seq_no, value);
	}


	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String rmrks() {
		return getConstString(offset + 85, $rmrks);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void rmrks(String value) {
		setConstString(offset + 85, $rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 86, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 86, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 87, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 87, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 88, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 88, $sub_char3, value);
	}


	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return getConstNumber(offset + 89, $data_lno);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		setConstNumber(offset + 89, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		setConstNumber(offset + 89, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		setConstNumber(offset + 89, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		setConstNumber(offset + 89, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		setConstNumber(offset + 89, $data_lno, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 90, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 90, $rts_msg_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 91, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 91, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 92, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 92, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 93, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 93, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 94, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 94, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 95, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 95, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 96, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 96, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 97, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 97, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 98, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 98, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 99, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 99, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 100, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 100, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 101, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 101, $upd_srv_req_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 102, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 102, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 102, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 102, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 102, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 102, $upd_cntr, value);
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
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
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
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			return ac_slip_typ_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($other_wg_cd.equalsIgnoreCase(name)) {
			return other_wg_cd();
		}
		if ($other_wg_nm.equalsIgnoreCase(name)) {
			return other_wg_nm();
		}
		if ($other_dpt_cd.equalsIgnoreCase(name)) {
			return other_dpt_cd();
		}
		if ($other_dpt_nm.equalsIgnoreCase(name)) {
			return other_dpt_nm();
		}
		if ($mfg_act_grp.equalsIgnoreCase(name)) {
			return mfg_act_grp();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($trd_grp.equalsIgnoreCase(name)) {
			return trd_grp();
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
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			return alc_dpt_cd();
		}
		if ($alc_dpt_nm.equalsIgnoreCase(name)) {
			return alc_dpt_nm();
		}
		if ($alc_loc_cd.equalsIgnoreCase(name)) {
			return alc_loc_cd();
		}
		if ($alc_loc_nm.equalsIgnoreCase(name)) {
			return alc_loc_nm();
		}
		if ($alc_oper_cd.equalsIgnoreCase(name)) {
			return alc_oper_cd();
		}
		if ($alc_oper_nm.equalsIgnoreCase(name)) {
			return alc_oper_nm();
		}
		if ($alc_bp_cd.equalsIgnoreCase(name)) {
			return alc_bp_cd();
		}
		if ($alc_bp_nm.equalsIgnoreCase(name)) {
			return alc_bp_nm();
		}
		if ($alc_ctg_cd.equalsIgnoreCase(name)) {
			return alc_ctg_cd();
		}
		if ($alc_ctg_nm.equalsIgnoreCase(name)) {
			return alc_ctg_nm();
		}
		if ($alc_itm_typ.equalsIgnoreCase(name)) {
			return alc_itm_typ();
		}
		if ($alc_itm_typ_nm.equalsIgnoreCase(name)) {
			return alc_itm_typ_nm();
		}
		if ($alc_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return alc_itm_typ_d_cd();
		}
		if ($alc_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return alc_itm_typ_d_nm();
		}
		if ($alc_itm_jnl_cd.equalsIgnoreCase(name)) {
			return alc_itm_jnl_cd();
		}
		if ($alc_itm_jnl_nm.equalsIgnoreCase(name)) {
			return alc_itm_jnl_nm();
		}
		if ($alc_lot_no.equalsIgnoreCase(name)) {
			return alc_lot_no();
		}
		if ($alc_sublot_no.equalsIgnoreCase(name)) {
			return alc_sublot_no();
		}
		if ($alc_sno1.equalsIgnoreCase(name)) {
			return alc_sno1();
		}
		if ($alc_sno2.equalsIgnoreCase(name)) {
			return alc_sno2();
		}
		if ($alc_sno3.equalsIgnoreCase(name)) {
			return alc_sno3();
		}
		if ($alc_sno4.equalsIgnoreCase(name)) {
			return alc_sno4();
		}
		if ($alc_itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return alc_itm_mfg_inst_no();
		}
		if ($rec_eval_typ.equalsIgnoreCase(name)) {
			return rec_eval_typ();
		}
		if ($rec_eval_typ_nm.equalsIgnoreCase(name)) {
			return rec_eval_typ_nm();
		}
		if ($slip_no.equalsIgnoreCase(name)) {
			return slip_no();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
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
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_amt_dec_place();
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			return trd_ratio();
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			return slip_seq_no();
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
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
		if ($alc_amt_flg.equalsIgnoreCase(name)) {
			return alc_amt_flg();
		}
		if ($no_pln_flg.equalsIgnoreCase(name)) {
			return no_pln_flg();
		}
		if ($no_itm_info_flg.equalsIgnoreCase(name)) {
			return no_itm_info_flg();
		}
		if ($zero_effect_flg.equalsIgnoreCase(name)) {
			return zero_effect_flg();
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
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
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
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			return ac_slip_typ_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($other_wg_cd.equalsIgnoreCase(name)) {
			return other_wg_cd();
		}
		if ($other_wg_nm.equalsIgnoreCase(name)) {
			return other_wg_nm();
		}
		if ($other_dpt_cd.equalsIgnoreCase(name)) {
			return other_dpt_cd();
		}
		if ($other_dpt_nm.equalsIgnoreCase(name)) {
			return other_dpt_nm();
		}
		if ($mfg_act_grp.equalsIgnoreCase(name)) {
			return mfg_act_grp();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($trd_grp.equalsIgnoreCase(name)) {
			return trd_grp();
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
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			return alc_dpt_cd();
		}
		if ($alc_dpt_nm.equalsIgnoreCase(name)) {
			return alc_dpt_nm();
		}
		if ($alc_loc_cd.equalsIgnoreCase(name)) {
			return alc_loc_cd();
		}
		if ($alc_loc_nm.equalsIgnoreCase(name)) {
			return alc_loc_nm();
		}
		if ($alc_oper_cd.equalsIgnoreCase(name)) {
			return alc_oper_cd();
		}
		if ($alc_oper_nm.equalsIgnoreCase(name)) {
			return alc_oper_nm();
		}
		if ($alc_bp_cd.equalsIgnoreCase(name)) {
			return alc_bp_cd();
		}
		if ($alc_bp_nm.equalsIgnoreCase(name)) {
			return alc_bp_nm();
		}
		if ($alc_ctg_cd.equalsIgnoreCase(name)) {
			return alc_ctg_cd();
		}
		if ($alc_ctg_nm.equalsIgnoreCase(name)) {
			return alc_ctg_nm();
		}
		if ($alc_itm_typ.equalsIgnoreCase(name)) {
			return alc_itm_typ();
		}
		if ($alc_itm_typ_nm.equalsIgnoreCase(name)) {
			return alc_itm_typ_nm();
		}
		if ($alc_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return alc_itm_typ_d_cd();
		}
		if ($alc_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return alc_itm_typ_d_nm();
		}
		if ($alc_itm_jnl_cd.equalsIgnoreCase(name)) {
			return alc_itm_jnl_cd();
		}
		if ($alc_itm_jnl_nm.equalsIgnoreCase(name)) {
			return alc_itm_jnl_nm();
		}
		if ($alc_lot_no.equalsIgnoreCase(name)) {
			return alc_lot_no();
		}
		if ($alc_sublot_no.equalsIgnoreCase(name)) {
			return alc_sublot_no();
		}
		if ($alc_sno1.equalsIgnoreCase(name)) {
			return alc_sno1();
		}
		if ($alc_sno2.equalsIgnoreCase(name)) {
			return alc_sno2();
		}
		if ($alc_sno3.equalsIgnoreCase(name)) {
			return alc_sno3();
		}
		if ($alc_sno4.equalsIgnoreCase(name)) {
			return alc_sno4();
		}
		if ($alc_itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return alc_itm_mfg_inst_no();
		}
		if ($rec_eval_typ.equalsIgnoreCase(name)) {
			return rec_eval_typ();
		}
		if ($rec_eval_typ_nm.equalsIgnoreCase(name)) {
			return rec_eval_typ_nm();
		}
		if ($slip_no.equalsIgnoreCase(name)) {
			return slip_no();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
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
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_amt_dec_place();
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			return trd_ratio();
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			return slip_seq_no();
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
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
		if ($alc_amt_flg.equalsIgnoreCase(name)) {
			return alc_amt_flg();
		}
		if ($no_pln_flg.equalsIgnoreCase(name)) {
			return no_pln_flg();
		}
		if ($no_itm_info_flg.equalsIgnoreCase(name)) {
			return no_itm_info_flg();
		}
		if ($zero_effect_flg.equalsIgnoreCase(name)) {
			return zero_effect_flg();
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
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
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
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			ac_slip_typ_nm(value);
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
		if ($other_wg_cd.equalsIgnoreCase(name)) {
			other_wg_cd(value);
			return;
		}
		if ($other_wg_nm.equalsIgnoreCase(name)) {
			other_wg_nm(value);
			return;
		}
		if ($other_dpt_cd.equalsIgnoreCase(name)) {
			other_dpt_cd(value);
			return;
		}
		if ($other_dpt_nm.equalsIgnoreCase(name)) {
			other_dpt_nm(value);
			return;
		}
		if ($mfg_act_grp.equalsIgnoreCase(name)) {
			mfg_act_grp(value);
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
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($trd_grp.equalsIgnoreCase(name)) {
			trd_grp(value);
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
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			alc_dpt_cd(value);
			return;
		}
		if ($alc_dpt_nm.equalsIgnoreCase(name)) {
			alc_dpt_nm(value);
			return;
		}
		if ($alc_loc_cd.equalsIgnoreCase(name)) {
			alc_loc_cd(value);
			return;
		}
		if ($alc_loc_nm.equalsIgnoreCase(name)) {
			alc_loc_nm(value);
			return;
		}
		if ($alc_oper_cd.equalsIgnoreCase(name)) {
			alc_oper_cd(value);
			return;
		}
		if ($alc_oper_nm.equalsIgnoreCase(name)) {
			alc_oper_nm(value);
			return;
		}
		if ($alc_bp_cd.equalsIgnoreCase(name)) {
			alc_bp_cd(value);
			return;
		}
		if ($alc_bp_nm.equalsIgnoreCase(name)) {
			alc_bp_nm(value);
			return;
		}
		if ($alc_ctg_cd.equalsIgnoreCase(name)) {
			alc_ctg_cd(value);
			return;
		}
		if ($alc_ctg_nm.equalsIgnoreCase(name)) {
			alc_ctg_nm(value);
			return;
		}
		if ($alc_itm_typ.equalsIgnoreCase(name)) {
			alc_itm_typ(value);
			return;
		}
		if ($alc_itm_typ_nm.equalsIgnoreCase(name)) {
			alc_itm_typ_nm(value);
			return;
		}
		if ($alc_itm_typ_d_cd.equalsIgnoreCase(name)) {
			alc_itm_typ_d_cd(value);
			return;
		}
		if ($alc_itm_typ_d_nm.equalsIgnoreCase(name)) {
			alc_itm_typ_d_nm(value);
			return;
		}
		if ($alc_itm_jnl_cd.equalsIgnoreCase(name)) {
			alc_itm_jnl_cd(value);
			return;
		}
		if ($alc_itm_jnl_nm.equalsIgnoreCase(name)) {
			alc_itm_jnl_nm(value);
			return;
		}
		if ($alc_lot_no.equalsIgnoreCase(name)) {
			alc_lot_no(value);
			return;
		}
		if ($alc_sublot_no.equalsIgnoreCase(name)) {
			alc_sublot_no(value);
			return;
		}
		if ($alc_sno1.equalsIgnoreCase(name)) {
			alc_sno1(value);
			return;
		}
		if ($alc_sno2.equalsIgnoreCase(name)) {
			alc_sno2(value);
			return;
		}
		if ($alc_sno3.equalsIgnoreCase(name)) {
			alc_sno3(value);
			return;
		}
		if ($alc_sno4.equalsIgnoreCase(name)) {
			alc_sno4(value);
			return;
		}
		if ($alc_itm_mfg_inst_no.equalsIgnoreCase(name)) {
			alc_itm_mfg_inst_no(value);
			return;
		}
		if ($rec_eval_typ.equalsIgnoreCase(name)) {
			rec_eval_typ(value);
			return;
		}
		if ($rec_eval_typ_nm.equalsIgnoreCase(name)) {
			rec_eval_typ_nm(value);
			return;
		}
		if ($slip_no.equalsIgnoreCase(name)) {
			slip_no(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
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
		if ($alc_amt_flg.equalsIgnoreCase(name)) {
			alc_amt_flg(value);
			return;
		}
		if ($no_pln_flg.equalsIgnoreCase(name)) {
			no_pln_flg(value);
			return;
		}
		if ($no_itm_info_flg.equalsIgnoreCase(name)) {
			no_itm_info_flg(value);
			return;
		}
		if ($zero_effect_flg.equalsIgnoreCase(name)) {
			zero_effect_flg(value);
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
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
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
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			ac_slip_typ_nm(value);
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
		if ($other_wg_cd.equalsIgnoreCase(name)) {
			other_wg_cd(value);
			return;
		}
		if ($other_wg_nm.equalsIgnoreCase(name)) {
			other_wg_nm(value);
			return;
		}
		if ($other_dpt_cd.equalsIgnoreCase(name)) {
			other_dpt_cd(value);
			return;
		}
		if ($other_dpt_nm.equalsIgnoreCase(name)) {
			other_dpt_nm(value);
			return;
		}
		if ($mfg_act_grp.equalsIgnoreCase(name)) {
			mfg_act_grp(value);
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
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($trd_grp.equalsIgnoreCase(name)) {
			trd_grp(value);
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
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			alc_dpt_cd(value);
			return;
		}
		if ($alc_dpt_nm.equalsIgnoreCase(name)) {
			alc_dpt_nm(value);
			return;
		}
		if ($alc_loc_cd.equalsIgnoreCase(name)) {
			alc_loc_cd(value);
			return;
		}
		if ($alc_loc_nm.equalsIgnoreCase(name)) {
			alc_loc_nm(value);
			return;
		}
		if ($alc_oper_cd.equalsIgnoreCase(name)) {
			alc_oper_cd(value);
			return;
		}
		if ($alc_oper_nm.equalsIgnoreCase(name)) {
			alc_oper_nm(value);
			return;
		}
		if ($alc_bp_cd.equalsIgnoreCase(name)) {
			alc_bp_cd(value);
			return;
		}
		if ($alc_bp_nm.equalsIgnoreCase(name)) {
			alc_bp_nm(value);
			return;
		}
		if ($alc_ctg_cd.equalsIgnoreCase(name)) {
			alc_ctg_cd(value);
			return;
		}
		if ($alc_ctg_nm.equalsIgnoreCase(name)) {
			alc_ctg_nm(value);
			return;
		}
		if ($alc_itm_typ.equalsIgnoreCase(name)) {
			alc_itm_typ(value);
			return;
		}
		if ($alc_itm_typ_nm.equalsIgnoreCase(name)) {
			alc_itm_typ_nm(value);
			return;
		}
		if ($alc_itm_typ_d_cd.equalsIgnoreCase(name)) {
			alc_itm_typ_d_cd(value);
			return;
		}
		if ($alc_itm_typ_d_nm.equalsIgnoreCase(name)) {
			alc_itm_typ_d_nm(value);
			return;
		}
		if ($alc_itm_jnl_cd.equalsIgnoreCase(name)) {
			alc_itm_jnl_cd(value);
			return;
		}
		if ($alc_itm_jnl_nm.equalsIgnoreCase(name)) {
			alc_itm_jnl_nm(value);
			return;
		}
		if ($alc_lot_no.equalsIgnoreCase(name)) {
			alc_lot_no(value);
			return;
		}
		if ($alc_sublot_no.equalsIgnoreCase(name)) {
			alc_sublot_no(value);
			return;
		}
		if ($alc_sno1.equalsIgnoreCase(name)) {
			alc_sno1(value);
			return;
		}
		if ($alc_sno2.equalsIgnoreCase(name)) {
			alc_sno2(value);
			return;
		}
		if ($alc_sno3.equalsIgnoreCase(name)) {
			alc_sno3(value);
			return;
		}
		if ($alc_sno4.equalsIgnoreCase(name)) {
			alc_sno4(value);
			return;
		}
		if ($alc_itm_mfg_inst_no.equalsIgnoreCase(name)) {
			alc_itm_mfg_inst_no(value);
			return;
		}
		if ($rec_eval_typ.equalsIgnoreCase(name)) {
			rec_eval_typ(value);
			return;
		}
		if ($rec_eval_typ_nm.equalsIgnoreCase(name)) {
			rec_eval_typ_nm(value);
			return;
		}
		if ($slip_no.equalsIgnoreCase(name)) {
			slip_no(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
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
		if ($alc_amt_flg.equalsIgnoreCase(name)) {
			alc_amt_flg(value);
			return;
		}
		if ($no_pln_flg.equalsIgnoreCase(name)) {
			no_pln_flg(value);
			return;
		}
		if ($no_itm_info_flg.equalsIgnoreCase(name)) {
			no_itm_info_flg(value);
			return;
		}
		if ($zero_effect_flg.equalsIgnoreCase(name)) {
			zero_effect_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($qty_p.equalsIgnoreCase(name)) {
			return qty_p();
		}
		if ($trd_amt_p.equalsIgnoreCase(name)) {
			return trd_amt_p();
		}
		if ($xrate_p.equalsIgnoreCase(name)) {
			return xrate_p();
		}
		if ($amt_p.equalsIgnoreCase(name)) {
			return amt_p();
		}
		if ($alc_itm_p.equalsIgnoreCase(name)) {
			return alc_itm_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
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
		if ($qty_p.equalsIgnoreCase(name)) {
			qty_p(
				((MCContainerMeta) qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($trd_amt_p.equalsIgnoreCase(name)) {
			trd_amt_p(
				((MCContainerMeta) trd_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xrate_p.equalsIgnoreCase(name)) {
			xrate_p(
				((MCContainerMeta) xrate_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5390.XrateR.class, value)
			);
			return;
		}
		if ($amt_p.equalsIgnoreCase(name)) {
			amt_p(
				((MCContainerMeta) amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($alc_itm_p.equalsIgnoreCase(name)) {
			alc_itm_p(
				((MCContainerMeta) alc_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
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
		return qty_p().qty();
	}

	public void qty(MCNumber value) {
		qty_p().qty(value);
	}

	public void qty(int value) {
		qty_p().qty(value);
	}

	public void qty(long value) {
		qty_p().qty(value);
	}

	public void qty(float value) {
		qty_p().qty(value);
	}

	public void qty(double value) {
		qty_p().qty(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return trd_amt_p().amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		trd_amt_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		trd_amt_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		trd_amt_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		trd_amt_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		trd_amt_p().amt(value);
	}

	public MCNumber xrate() {
		return xrate_p().xrate();
	}

	public void xrate(MCNumber value) {
		xrate_p().xrate(value);
	}

	public void xrate(int value) {
		xrate_p().xrate(value);
	}

	public void xrate(long value) {
		xrate_p().xrate(value);
	}

	public void xrate(float value) {
		xrate_p().xrate(value);
	}

	public void xrate(double value) {
		xrate_p().xrate(value);
	}

	public MCNumber amt() {
		return amt_p().amt();
	}

	public void amt(MCNumber value) {
		amt_p().amt(value);
	}

	public void amt(int value) {
		amt_p().amt(value);
	}

	public void amt(long value) {
		amt_p().amt(value);
	}

	public void amt(float value) {
		amt_p().amt(value);
	}

	public void amt(double value) {
		amt_p().amt(value);
	}

	/**
	 * Allocation destination item cd. 配賦先品目ＣＤ.<p>
	 *
	 */
	public String alc_itm_cd() {
		return alc_itm_p().itm_cd();
	}

	/**
	 * Allocation destination item cd. 配賦先品目ＣＤ.<p>
	 *
	 */
	public void alc_itm_cd(String value) {
		alc_itm_p().itm_cd(value);
	}

	/**
	 * Allocation destination branch No. 1 配賦先枝番１.<p>
	 *
	 */
	public String alc_itm_sub1() {
		return alc_itm_p().itm_sub1();
	}

	/**
	 * Allocation destination branch No. 1 配賦先枝番１.<p>
	 *
	 */
	public void alc_itm_sub1(String value) {
		alc_itm_p().itm_sub1(value);
	}

	/**
	 * Allocation destination branch No. 2 配賦先枝番２.<p>
	 *
	 */
	public String alc_itm_sub2() {
		return alc_itm_p().itm_sub2();
	}

	/**
	 * Allocation destination branch No. 2 配賦先枝番２.<p>
	 *
	 */
	public void alc_itm_sub2(String value) {
		alc_itm_p().itm_sub2(value);
	}

	/**
	 * Allocation destination branch No. 3 配賦先枝番３.<p>
	 *
	 */
	public String alc_itm_sub3() {
		return alc_itm_p().itm_sub3();
	}

	/**
	 * Allocation destination branch No. 3 配賦先枝番３.<p>
	 *
	 */
	public void alc_itm_sub3(String value) {
		alc_itm_p().itm_sub3(value);
	}

	/**
	 * Allocation destination item name 配賦先品名.<p>
	 *
	 */
	public String alc_itm_nm() {
		return alc_itm_p().itm_nm();
	}

	/**
	 * Allocation destination item name 配賦先品名.<p>
	 *
	 */
	public void alc_itm_nm(String value) {
		alc_itm_p().itm_nm(value);
	}

	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
	}

}

