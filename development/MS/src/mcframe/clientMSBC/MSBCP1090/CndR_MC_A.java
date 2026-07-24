package mcframe.clientMSBC.MSBCP1090;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * SCHD,Schedule,SCHD;ACT,Result,ACT SCHD,予定,SCHD;ACT,実績,ACT.<p>
	 *
	 */
	public static final String $srch_mode1 = "srch_mode1";
	/**
	 * INPT,Input,INPT;LOSS,Loss,LOSS INPT,投入,INPT;LOSS,ロス,LOSS.<p>
	 *
	 */
	public static final String $srch_mode2 = "srch_mode2";
	/**
	 * Save order 指図保存.<p>
	 *
	 */
	public static final String $oper_sav_flg = "oper_sav_flg";
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public static final String $oper_ord_flg = "oper_ord_flg";
	/**
	 * In process 着手中.<p>
	 *
	 */
	public static final String $oper_stt_flg = "oper_stt_flg";
	/**
	 * Completed 完了.<p>
	 *
	 */
	public static final String $oper_cmpl_flg = "oper_cmpl_flg";
	/**
	 * Save order 指図保存.<p>
	 *
	 */
	public static final String $inpt_sav_flg = "inpt_sav_flg";
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public static final String $inpt_ord_flg = "inpt_ord_flg";
	/**
	 * In process 着手中.<p>
	 *
	 */
	public static final String $inpt_stt_flg = "inpt_stt_flg";
	/**
	 * Completed 完了.<p>
	 *
	 */
	public static final String $inpt_cmpl_flg = "inpt_cmpl_flg";
	/**
	 * No scheduled 予定無し.<p>
	 *
	 */
	public static final String $inpt_no_schd_flg = "inpt_no_schd_flg";
	public static final String $inpt_schd_dt_p = "inpt_schd_dt_p";
	public static final String $inpt_act_dt_p = "inpt_act_dt_p";
	/**
	 * Input recording date FROM 投入計上日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $inpt_ac_dt_fr = "inpt_ac_dt_fr";
	/**
	 * Input recording date TO 投入計上日ＴＯ.<p>
	 *
	 */
	public static final String $inpt_ac_dt_to = "inpt_ac_dt_to";
	/**
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public static final String $bkf_typ = "bkf_typ";
	/**
	 * Input item backflush type name 投入品バックフラッシュ区分名.<p>
	 *
	 */
	public static final String $bkf_typ_nm = "bkf_typ_nm";
	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public static final String $pr_rate_fr = "pr_rate_fr";
	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public static final String $pr_rate_to = "pr_rate_to";
	/**
	 * Consider loss in progress 進捗率にロスを加味する.<p>
	 *
	 */
	public static final String $pr_rate_inc_loss_flg = "pr_rate_inc_loss_flg";
	/**
	 * Unallocated only 未引当のみ.<p>
	 *
	 */
	public static final String $not_alloc_srch_flg = "not_alloc_srch_flg";
	/**
	 * Child item for yield calculation only 収率計算用子品目のみ.<p>
	 *
	 */
	public static final String $yield_calc_flg = "yield_calc_flg";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_site_cd = "mfg_loc_site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $mfg_loc_site_nm = "mfg_loc_site_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_wg_cd = "mfg_loc_wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $mfg_loc_wg_nm = "mfg_loc_wg_nm";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_grp_cd = "mfg_loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $mfg_loc_grp_nm = "mfg_loc_grp_nm";
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
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $mfg_str_ln_cd = "mfg_str_ln_cd";
	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public static final String $mfg_str_ln_nm = "mfg_str_ln_nm";
	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public static final String $inpt_loc_cd = "inpt_loc_cd";
	/**
	 * Input location name 投入場所名.<p>
	 *
	 */
	public static final String $inpt_loc_nm = "inpt_loc_nm";
	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $inpt_str_ln_cd = "inpt_str_ln_cd";
	/**
	 * Input rack/line name 投入棚・ライン名.<p>
	 *
	 */
	public static final String $inpt_str_ln_nm = "inpt_str_ln_nm";
	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public static final String $oper_loc_cd = "oper_loc_cd";
	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public static final String $oper_loc_nm = "oper_loc_nm";
	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $oper_str_ln_cd = "oper_str_ln_cd";
	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public static final String $oper_str_ln_nm = "oper_str_ln_nm";
	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public static final String $mfg_mtd_typ = "mfg_mtd_typ";
	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public static final String $mfg_mtd_typ_nm = "mfg_mtd_typ_nm";
	public static final String $chd_itm_typ_p = "chd_itm_typ_p";
	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public static final String $inpt_ctl_typ = "inpt_ctl_typ";
	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public static final String $inpt_ctl_typ_nm = "inpt_ctl_typ_nm";
	public static final String $chd_itm_p = "chd_itm_p";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $chd_lot_no = "chd_lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $chd_sublot_no = "chd_sublot_no";
	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public static final String $loss_rsn_cd = "loss_rsn_cd";
	/**
	 * Loss reason name ロス理由名.<p>
	 *
	 */
	public static final String $loss_rsn_nm = "loss_rsn_nm";
	public static final String $par_itm_typ_p = "par_itm_typ_p";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	public static final String $par_itm_p = "par_itm_p";
	public static final String $par_sno_p = "par_sno_p";
	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public static final String $inpt_rsn_cd = "inpt_rsn_cd";
	/**
	 * Input reason name 投入理由名.<p>
	 *
	 */
	public static final String $inpt_rsn_nm = "inpt_rsn_nm";
	/**
	 * Operation PIC cd. 工程担当者ＣＤ.<p>
	 *
	 */
	public static final String $oper_usr_cd = "oper_usr_cd";
	/**
	 * Operation PIC name 工程担当者名.<p>
	 *
	 */
	public static final String $oper_usr_nm = "oper_usr_nm";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public static final String $inpt_schd_no = "inpt_schd_no";
	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public static final String $inpt_act_no = "inpt_act_no";
	/**
	 * Loss result No. ロス実績ＮＯ.<p>
	 *
	 */
	public static final String $loss_act_no = "loss_act_no";
	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public static final String $mes_id = "mes_id";
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";
	/**
	 * External input result No. 外部投入実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_inpt_act_no = "ext_inpt_act_no";
	/**
	 * Input schedule order sheet remarks 投入予定指図書備考.<p>
	 *
	 */
	public static final String $inpt_schd_inst_rpt_rmrks = "inpt_schd_inst_rpt_rmrks";
	/**
	 * Input schedule internal remarks 投入予定内部備考.<p>
	 *
	 */
	public static final String $inpt_schd_intr_rmrks = "inpt_schd_intr_rmrks";
	/**
	 * Input schedule spare 1 投入予定予備１.<p>
	 *
	 */
	public static final String $inpt_schd_sub_char1 = "inpt_schd_sub_char1";
	/**
	 * Input schedule spare 2 投入予定予備２.<p>
	 *
	 */
	public static final String $inpt_schd_sub_char2 = "inpt_schd_sub_char2";
	/**
	 * Input schedule spare 3 投入予定予備３.<p>
	 *
	 */
	public static final String $inpt_schd_sub_char3 = "inpt_schd_sub_char3";
	/**
	 * Input result record sheet remarks 投入実績記録書備考.<p>
	 *
	 */
	public static final String $inpt_act_rpt_rmrks = "inpt_act_rpt_rmrks";
	/**
	 * Input result internal remarks 投入実績内部備考.<p>
	 *
	 */
	public static final String $inpt_act_intr_rmrks = "inpt_act_intr_rmrks";
	/**
	 * Input result transaction remarks 投入実績取引備考.<p>
	 *
	 */
	public static final String $inpt_act_trd_rmrks = "inpt_act_trd_rmrks";
	/**
	 * Input result spare 1 投入実績予備１.<p>
	 *
	 */
	public static final String $inpt_act_sub_char1 = "inpt_act_sub_char1";
	/**
	 * Input result spare 2 投入実績予備２.<p>
	 *
	 */
	public static final String $inpt_act_sub_char2 = "inpt_act_sub_char2";
	/**
	 * Input result spare 3 投入実績予備３.<p>
	 *
	 */
	public static final String $inpt_act_sub_char3 = "inpt_act_sub_char3";
	/**
	 * Mfg. record sheet remarks 製造記録書備考.<p>
	 *
	 */
	public static final String $mfg_act_rpt_rmrks = "mfg_act_rpt_rmrks";
	/**
	 * Mfg. internal remarks 製造内部備考.<p>
	 *
	 */
	public static final String $mfg_act_intr_rmrks = "mfg_act_intr_rmrks";
	/**
	 * Mfg. result spare 1 製造実績予備１.<p>
	 *
	 */
	public static final String $mfg_act_sub_char1 = "mfg_act_sub_char1";
	/**
	 * Mfg. result spare 2 製造実績予備２.<p>
	 *
	 */
	public static final String $mfg_act_sub_char2 = "mfg_act_sub_char2";
	/**
	 * Mfg. result spare 3 製造実績予備３.<p>
	 *
	 */
	public static final String $mfg_act_sub_char3 = "mfg_act_sub_char3";
	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public static final String $oper_act_intr_rmrks = "oper_act_intr_rmrks";
	/**
	 * Operation record sheet remarks 工程記録書備考.<p>
	 *
	 */
	public static final String $oper_act_rpt_rmrks = "oper_act_rpt_rmrks";
	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public static final String $oper_act_sub_char1 = "oper_act_sub_char1";
	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public static final String $oper_act_sub_char2 = "oper_act_sub_char2";
	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public static final String $oper_act_sub_char3 = "oper_act_sub_char3";
	public static final String $chd_itm_grp_p = "chd_itm_grp_p";
	public static final String $par_itm_grp_p = "par_itm_grp_p";

	public static final String $inpt_schd_dt_fr = $inpt_schd_dt_p + ".ymd_fr";
	public static final String $inpt_schd_hm_fr = $inpt_schd_dt_p + ".hm_fr";
	public static final String $inpt_schd_dt_to = $inpt_schd_dt_p + ".ymd_to";
	public static final String $inpt_schd_hm_to = $inpt_schd_dt_p + ".hm_to";
	public static final String $inpt_act_dt_fr = $inpt_act_dt_p + ".ymd_fr";
	public static final String $inpt_act_hm_fr = $inpt_act_dt_p + ".hm_fr";
	public static final String $inpt_act_dt_to = $inpt_act_dt_p + ".ymd_to";
	public static final String $inpt_act_hm_to = $inpt_act_dt_p + ".hm_to";
	public static final String $chd_itm_typ = $chd_itm_typ_p + ".itm_typ";
	public static final String $chd_itm_typ_nm = $chd_itm_typ_p + ".itm_typ_nm";
	public static final String $chd_itm_typ_d_cd = $chd_itm_typ_p + ".itm_typ_d_cd";
	public static final String $chd_itm_typ_d_nm = $chd_itm_typ_p + ".itm_typ_d_nm";
	public static final String $chd_itm_cd = $chd_itm_p + ".itm_cd";
	public static final String $chd_itm_sub1 = $chd_itm_p + ".itm_sub1";
	public static final String $chd_itm_sub2 = $chd_itm_p + ".itm_sub2";
	public static final String $chd_itm_sub3 = $chd_itm_p + ".itm_sub3";
	public static final String $chd_itm_nm = $chd_itm_p + ".itm_nm";
	public static final String $par_itm_typ = $par_itm_typ_p + ".itm_typ";
	public static final String $par_itm_typ_nm = $par_itm_typ_p + ".itm_typ_nm";
	public static final String $par_itm_typ_d_cd = $par_itm_typ_p + ".itm_typ_d_cd";
	public static final String $par_itm_typ_d_nm = $par_itm_typ_p + ".itm_typ_d_nm";
	public static final String $par_itm_cd = $par_itm_p + ".itm_cd";
	public static final String $par_itm_sub1 = $par_itm_p + ".itm_sub1";
	public static final String $par_itm_sub2 = $par_itm_p + ".itm_sub2";
	public static final String $par_itm_sub3 = $par_itm_p + ".itm_sub3";
	public static final String $par_itm_nm = $par_itm_p + ".itm_nm";
	public static final String $par_sno1 = $par_sno_p + ".sno1";
	public static final String $par_sno2 = $par_sno_p + ".sno2";
	public static final String $par_sno3 = $par_sno_p + ".sno3";
	public static final String $par_sno4 = $par_sno_p + ".sno4";
	public static final String $wrk_no = $par_sno_p + ".wrk_no";
	public static final String $wrk_nm = $par_sno_p + ".wrk_nm";
	public static final String $chd_itm_grp_lab1 = $chd_itm_grp_p + ".itm_grp_lab1";
	public static final String $chd_itm_grp_flg1 = $chd_itm_grp_p + ".itm_grp_flg1";
	public static final String $chd_itm_grp_cd1 = $chd_itm_grp_p + ".itm_grp_cd1";
	public static final String $chd_itm_grp_nm1 = $chd_itm_grp_p + ".itm_grp_nm1";
	public static final String $chd_itm_grp_lab2 = $chd_itm_grp_p + ".itm_grp_lab2";
	public static final String $chd_itm_grp_flg2 = $chd_itm_grp_p + ".itm_grp_flg2";
	public static final String $chd_itm_grp_cd2 = $chd_itm_grp_p + ".itm_grp_cd2";
	public static final String $chd_itm_grp_nm2 = $chd_itm_grp_p + ".itm_grp_nm2";
	public static final String $chd_itm_grp_lab3 = $chd_itm_grp_p + ".itm_grp_lab3";
	public static final String $chd_itm_grp_flg3 = $chd_itm_grp_p + ".itm_grp_flg3";
	public static final String $chd_itm_grp_cd3 = $chd_itm_grp_p + ".itm_grp_cd3";
	public static final String $chd_itm_grp_nm3 = $chd_itm_grp_p + ".itm_grp_nm3";
	public static final String $chd_itm_grp_lab4 = $chd_itm_grp_p + ".itm_grp_lab4";
	public static final String $chd_itm_grp_flg4 = $chd_itm_grp_p + ".itm_grp_flg4";
	public static final String $chd_itm_grp_cd4 = $chd_itm_grp_p + ".itm_grp_cd4";
	public static final String $chd_itm_grp_nm4 = $chd_itm_grp_p + ".itm_grp_nm4";
	public static final String $chd_itm_grp_lab5 = $chd_itm_grp_p + ".itm_grp_lab5";
	public static final String $chd_itm_grp_flg5 = $chd_itm_grp_p + ".itm_grp_flg5";
	public static final String $chd_itm_grp_cd5 = $chd_itm_grp_p + ".itm_grp_cd5";
	public static final String $chd_itm_grp_nm5 = $chd_itm_grp_p + ".itm_grp_nm5";
	public static final String $chd_itm_grp_lab6 = $chd_itm_grp_p + ".itm_grp_lab6";
	public static final String $chd_itm_grp_flg6 = $chd_itm_grp_p + ".itm_grp_flg6";
	public static final String $chd_itm_grp_cd6 = $chd_itm_grp_p + ".itm_grp_cd6";
	public static final String $chd_itm_grp_nm6 = $chd_itm_grp_p + ".itm_grp_nm6";
	public static final String $chd_itm_grp_lab7 = $chd_itm_grp_p + ".itm_grp_lab7";
	public static final String $chd_itm_grp_flg7 = $chd_itm_grp_p + ".itm_grp_flg7";
	public static final String $chd_itm_grp_cd7 = $chd_itm_grp_p + ".itm_grp_cd7";
	public static final String $chd_itm_grp_nm7 = $chd_itm_grp_p + ".itm_grp_nm7";
	public static final String $chd_itm_grp_lab8 = $chd_itm_grp_p + ".itm_grp_lab8";
	public static final String $chd_itm_grp_flg8 = $chd_itm_grp_p + ".itm_grp_flg8";
	public static final String $chd_itm_grp_cd8 = $chd_itm_grp_p + ".itm_grp_cd8";
	public static final String $chd_itm_grp_nm8 = $chd_itm_grp_p + ".itm_grp_nm8";
	public static final String $chd_itm_grp_lab9 = $chd_itm_grp_p + ".itm_grp_lab9";
	public static final String $chd_itm_grp_flg9 = $chd_itm_grp_p + ".itm_grp_flg9";
	public static final String $chd_itm_grp_cd9 = $chd_itm_grp_p + ".itm_grp_cd9";
	public static final String $chd_itm_grp_nm9 = $chd_itm_grp_p + ".itm_grp_nm9";
	public static final String $chd_itm_grp_lab10 = $chd_itm_grp_p + ".itm_grp_lab10";
	public static final String $chd_itm_grp_flg10 = $chd_itm_grp_p + ".itm_grp_flg10";
	public static final String $chd_itm_grp_cd10 = $chd_itm_grp_p + ".itm_grp_cd10";
	public static final String $chd_itm_grp_nm10 = $chd_itm_grp_p + ".itm_grp_nm10";
	public static final String $par_itm_grp_lab1 = $par_itm_grp_p + ".itm_grp_lab1";
	public static final String $par_itm_grp_flg1 = $par_itm_grp_p + ".itm_grp_flg1";
	public static final String $par_itm_grp_cd1 = $par_itm_grp_p + ".itm_grp_cd1";
	public static final String $par_itm_grp_nm1 = $par_itm_grp_p + ".itm_grp_nm1";
	public static final String $par_itm_grp_lab2 = $par_itm_grp_p + ".itm_grp_lab2";
	public static final String $par_itm_grp_flg2 = $par_itm_grp_p + ".itm_grp_flg2";
	public static final String $par_itm_grp_cd2 = $par_itm_grp_p + ".itm_grp_cd2";
	public static final String $par_itm_grp_nm2 = $par_itm_grp_p + ".itm_grp_nm2";
	public static final String $par_itm_grp_lab3 = $par_itm_grp_p + ".itm_grp_lab3";
	public static final String $par_itm_grp_flg3 = $par_itm_grp_p + ".itm_grp_flg3";
	public static final String $par_itm_grp_cd3 = $par_itm_grp_p + ".itm_grp_cd3";
	public static final String $par_itm_grp_nm3 = $par_itm_grp_p + ".itm_grp_nm3";
	public static final String $par_itm_grp_lab4 = $par_itm_grp_p + ".itm_grp_lab4";
	public static final String $par_itm_grp_flg4 = $par_itm_grp_p + ".itm_grp_flg4";
	public static final String $par_itm_grp_cd4 = $par_itm_grp_p + ".itm_grp_cd4";
	public static final String $par_itm_grp_nm4 = $par_itm_grp_p + ".itm_grp_nm4";
	public static final String $par_itm_grp_lab5 = $par_itm_grp_p + ".itm_grp_lab5";
	public static final String $par_itm_grp_flg5 = $par_itm_grp_p + ".itm_grp_flg5";
	public static final String $par_itm_grp_cd5 = $par_itm_grp_p + ".itm_grp_cd5";
	public static final String $par_itm_grp_nm5 = $par_itm_grp_p + ".itm_grp_nm5";
	public static final String $par_itm_grp_lab6 = $par_itm_grp_p + ".itm_grp_lab6";
	public static final String $par_itm_grp_flg6 = $par_itm_grp_p + ".itm_grp_flg6";
	public static final String $par_itm_grp_cd6 = $par_itm_grp_p + ".itm_grp_cd6";
	public static final String $par_itm_grp_nm6 = $par_itm_grp_p + ".itm_grp_nm6";
	public static final String $par_itm_grp_lab7 = $par_itm_grp_p + ".itm_grp_lab7";
	public static final String $par_itm_grp_flg7 = $par_itm_grp_p + ".itm_grp_flg7";
	public static final String $par_itm_grp_cd7 = $par_itm_grp_p + ".itm_grp_cd7";
	public static final String $par_itm_grp_nm7 = $par_itm_grp_p + ".itm_grp_nm7";
	public static final String $par_itm_grp_lab8 = $par_itm_grp_p + ".itm_grp_lab8";
	public static final String $par_itm_grp_flg8 = $par_itm_grp_p + ".itm_grp_flg8";
	public static final String $par_itm_grp_cd8 = $par_itm_grp_p + ".itm_grp_cd8";
	public static final String $par_itm_grp_nm8 = $par_itm_grp_p + ".itm_grp_nm8";
	public static final String $par_itm_grp_lab9 = $par_itm_grp_p + ".itm_grp_lab9";
	public static final String $par_itm_grp_flg9 = $par_itm_grp_p + ".itm_grp_flg9";
	public static final String $par_itm_grp_cd9 = $par_itm_grp_p + ".itm_grp_cd9";
	public static final String $par_itm_grp_nm9 = $par_itm_grp_p + ".itm_grp_nm9";
	public static final String $par_itm_grp_lab10 = $par_itm_grp_p + ".itm_grp_lab10";
	public static final String $par_itm_grp_flg10 = $par_itm_grp_p + ".itm_grp_flg10";
	public static final String $par_itm_grp_cd10 = $par_itm_grp_p + ".itm_grp_cd10";
	public static final String $par_itm_grp_nm10 = $par_itm_grp_p + ".itm_grp_nm10";

	public static final MCMeta srch_mode1_META = createStringMeta($srch_mode1);
	public static final MCMeta srch_mode2_META = createStringMeta($srch_mode2);
	public static final MCMeta oper_sav_flg_META = createCommonMeta($oper_sav_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_ord_flg_META = createCommonMeta($oper_ord_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_stt_flg_META = createCommonMeta($oper_stt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_cmpl_flg_META = createCommonMeta($oper_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_sav_flg_META = createCommonMeta($inpt_sav_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_ord_flg_META = createCommonMeta($inpt_ord_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_stt_flg_META = createCommonMeta($inpt_stt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_cmpl_flg_META = createCommonMeta($inpt_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_no_schd_flg_META = createCommonMeta($inpt_no_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_schd_dt_p_META = createInnerRowMeta($inpt_schd_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta inpt_act_dt_p_META = createInnerRowMeta($inpt_act_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta inpt_ac_dt_fr_META = createCommonMeta($inpt_ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inpt_ac_dt_to_META = createCommonMeta($inpt_ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bkf_typ_META = createCommonMeta($bkf_typ, mcframe.commonMA.meta.MA_META.BKF_TYP);
	public static final MCMeta bkf_typ_nm_META = createCommonMeta($bkf_typ_nm, mcframe.commonMA.meta.MA_META.BKF_TYP_NM);
	public static final MCMeta pr_rate_fr_META = createCommonMeta($pr_rate_fr, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta pr_rate_to_META = createCommonMeta($pr_rate_to, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta pr_rate_inc_loss_flg_META = createCommonMeta($pr_rate_inc_loss_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_alloc_srch_flg_META = createCommonMeta($not_alloc_srch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yield_calc_flg_META = createCommonMeta($yield_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_loc_site_cd_META = createCommonMeta($mfg_loc_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta mfg_loc_site_nm_META = createCommonMeta($mfg_loc_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta mfg_loc_wg_cd_META = createCommonMeta($mfg_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta mfg_loc_wg_nm_META = createCommonMeta($mfg_loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta mfg_loc_grp_cd_META = createCommonMeta($mfg_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta mfg_loc_grp_nm_META = createCommonMeta($mfg_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_str_ln_cd_META = createCommonMeta($mfg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta mfg_str_ln_nm_META = createCommonMeta($mfg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta inpt_loc_cd_META = createCommonMeta($inpt_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inpt_loc_nm_META = createCommonMeta($inpt_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta inpt_str_ln_cd_META = createCommonMeta($inpt_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta inpt_str_ln_nm_META = createCommonMeta($inpt_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_loc_cd_META = createCommonMeta($oper_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_loc_nm_META = createCommonMeta($oper_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_str_ln_cd_META = createCommonMeta($oper_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta oper_str_ln_nm_META = createCommonMeta($oper_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta mfg_mtd_typ_META = createCommonMeta($mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta mfg_mtd_typ_nm_META = createCommonMeta($mfg_mtd_typ_nm, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP_NM);
	public static final MCMeta chd_itm_typ_p_META = createInnerRowMeta($chd_itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta inpt_ctl_typ_META = createCommonMeta($inpt_ctl_typ, mcframe.commonMA.meta.MA_META.INPT_CTL_TYP);
	public static final MCMeta inpt_ctl_typ_nm_META = createCommonMeta($inpt_ctl_typ_nm, mcframe.commonMA.meta.MA_META.INPT_CTL_TYP_NM);
	public static final MCMeta chd_itm_p_META = createInnerRowMeta($chd_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta chd_lot_no_META = createCommonMeta($chd_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta chd_sublot_no_META = createCommonMeta($chd_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta loss_rsn_cd_META = createCommonMeta($loss_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta loss_rsn_nm_META = createCommonMeta($loss_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta par_itm_typ_p_META = createInnerRowMeta($par_itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta par_itm_p_META = createInnerRowMeta($par_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta par_sno_p_META = createInnerRowMeta($par_sno_p, mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class);
	public static final MCMeta inpt_rsn_cd_META = createCommonMeta($inpt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta inpt_rsn_nm_META = createCommonMeta($inpt_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta oper_usr_cd_META = createCommonMeta($oper_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta oper_usr_nm_META = createCommonMeta($oper_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta inpt_schd_no_META = createCommonMeta($inpt_schd_no, mcframe.commonMA.meta.MA_META.INPT_SCHD_NO);
	public static final MCMeta inpt_act_no_META = createCommonMeta($inpt_act_no, mcframe.commonMA.meta.MA_META.INPT_ACT_NO);
	public static final MCMeta loss_act_no_META = createCommonMeta($loss_act_no, mcframe.commonMA.meta.MA_META.LOSS_ACT_NO);
	public static final MCMeta mes_id_META = createCommonMeta($mes_id, mcframe.commonMS.meta.MS_META.MES_ID);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta ext_inpt_act_no_META = createCommonMeta($ext_inpt_act_no, mcframe.commonMA.meta.MA_META.EXT_INPT_ACT_NO);
	public static final MCMeta inpt_schd_inst_rpt_rmrks_META = createCommonMeta($inpt_schd_inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.INPT_SCHD_RPT_RMRKS);
	public static final MCMeta inpt_schd_intr_rmrks_META = createCommonMeta($inpt_schd_intr_rmrks, mcframe.commonMS.meta.MS_META.INPT_SCHD_INTR_RMRKS);
	public static final MCMeta inpt_schd_sub_char1_META = createCommonMeta($inpt_schd_sub_char1, mcframe.commonMS.meta.MS_META.INPT_SCHD_SUB_CHAR1);
	public static final MCMeta inpt_schd_sub_char2_META = createCommonMeta($inpt_schd_sub_char2, mcframe.commonMS.meta.MS_META.INPT_SCHD_SUB_CHAR2);
	public static final MCMeta inpt_schd_sub_char3_META = createCommonMeta($inpt_schd_sub_char3, mcframe.commonMS.meta.MS_META.INPT_SCHD_SUB_CHAR3);
	public static final MCMeta inpt_act_rpt_rmrks_META = createCommonMeta($inpt_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.INPT_ACT_RPT_RMRKS);
	public static final MCMeta inpt_act_intr_rmrks_META = createCommonMeta($inpt_act_intr_rmrks, mcframe.commonMS.meta.MS_META.INPT_ACT_INTR_RMRKS);
	public static final MCMeta inpt_act_trd_rmrks_META = createCommonMeta($inpt_act_trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta inpt_act_sub_char1_META = createCommonMeta($inpt_act_sub_char1, mcframe.commonMS.meta.MS_META.INPT_ACT_SUB_CHAR1);
	public static final MCMeta inpt_act_sub_char2_META = createCommonMeta($inpt_act_sub_char2, mcframe.commonMS.meta.MS_META.INPT_ACT_SUB_CHAR2);
	public static final MCMeta inpt_act_sub_char3_META = createCommonMeta($inpt_act_sub_char3, mcframe.commonMS.meta.MS_META.INPT_ACT_SUB_CHAR3);
	public static final MCMeta mfg_act_rpt_rmrks_META = createCommonMeta($mfg_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.MFG_ACT_RPT_RMRKS);
	public static final MCMeta mfg_act_intr_rmrks_META = createCommonMeta($mfg_act_intr_rmrks, mcframe.commonMS.meta.MS_META.MFG_ACT_INTR_RMRKS);
	public static final MCMeta mfg_act_sub_char1_META = createCommonMeta($mfg_act_sub_char1, mcframe.commonMS.meta.MS_META.MFG_ACT_SUB_CHAR1);
	public static final MCMeta mfg_act_sub_char2_META = createCommonMeta($mfg_act_sub_char2, mcframe.commonMS.meta.MS_META.MFG_ACT_SUB_CHAR2);
	public static final MCMeta mfg_act_sub_char3_META = createCommonMeta($mfg_act_sub_char3, mcframe.commonMS.meta.MS_META.MFG_ACT_SUB_CHAR3);
	public static final MCMeta oper_act_intr_rmrks_META = createCommonMeta($oper_act_intr_rmrks, mcframe.commonMS.meta.MS_META.OPER_ACT_INTR_RMRKS);
	public static final MCMeta oper_act_rpt_rmrks_META = createCommonMeta($oper_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.OPER_ACT_RPT_RMRKS);
	public static final MCMeta oper_act_sub_char1_META = createCommonMeta($oper_act_sub_char1, mcframe.commonMS.meta.MS_META.OPER_ACT_SUB_CHAR1);
	public static final MCMeta oper_act_sub_char2_META = createCommonMeta($oper_act_sub_char2, mcframe.commonMS.meta.MS_META.OPER_ACT_SUB_CHAR2);
	public static final MCMeta oper_act_sub_char3_META = createCommonMeta($oper_act_sub_char3, mcframe.commonMS.meta.MS_META.OPER_ACT_SUB_CHAR3);
	public static final MCMeta chd_itm_grp_p_META = createInnerRowMeta($chd_itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);
	public static final MCMeta par_itm_grp_p_META = createInnerRowMeta($par_itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			srch_mode1_META,
			srch_mode2_META,
			oper_sav_flg_META,
			oper_ord_flg_META,
			oper_stt_flg_META,
			oper_cmpl_flg_META,
			inpt_sav_flg_META,
			inpt_ord_flg_META,
			inpt_stt_flg_META,
			inpt_cmpl_flg_META,
			inpt_no_schd_flg_META,
			inpt_schd_dt_p_META,
			inpt_act_dt_p_META,
			inpt_ac_dt_fr_META,
			inpt_ac_dt_to_META,
			bkf_typ_META,
			bkf_typ_nm_META,
			pr_rate_fr_META,
			pr_rate_to_META,
			pr_rate_inc_loss_flg_META,
			not_alloc_srch_flg_META,
			yield_calc_flg_META,
			mfg_loc_site_cd_META,
			mfg_loc_site_nm_META,
			mfg_loc_wg_cd_META,
			mfg_loc_wg_nm_META,
			mfg_loc_grp_cd_META,
			mfg_loc_grp_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			mfg_str_ln_cd_META,
			mfg_str_ln_nm_META,
			inpt_loc_cd_META,
			inpt_loc_nm_META,
			inpt_str_ln_cd_META,
			inpt_str_ln_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			oper_cd_META,
			oper_nm_META,
			oper_loc_cd_META,
			oper_loc_nm_META,
			oper_str_ln_cd_META,
			oper_str_ln_nm_META,
			mfg_mtd_typ_META,
			mfg_mtd_typ_nm_META,
			chd_itm_typ_p_META,
			inpt_ctl_typ_META,
			inpt_ctl_typ_nm_META,
			chd_itm_p_META,
			chd_lot_no_META,
			chd_sublot_no_META,
			loss_rsn_cd_META,
			loss_rsn_nm_META,
			par_itm_typ_p_META,
			mfg_inst_no_META,
			par_itm_p_META,
			par_sno_p_META,
			inpt_rsn_cd_META,
			inpt_rsn_nm_META,
			oper_usr_cd_META,
			oper_usr_nm_META,
			itm_ord_no_META,
			po_d_no_META,
			oper_inst_no_META,
			mfg_act_no_META,
			oper_act_no_META,
			inpt_schd_no_META,
			inpt_act_no_META,
			loss_act_no_META,
			mes_id_META,
			data_no_META,
			ext_inpt_act_no_META,
			inpt_schd_inst_rpt_rmrks_META,
			inpt_schd_intr_rmrks_META,
			inpt_schd_sub_char1_META,
			inpt_schd_sub_char2_META,
			inpt_schd_sub_char3_META,
			inpt_act_rpt_rmrks_META,
			inpt_act_intr_rmrks_META,
			inpt_act_trd_rmrks_META,
			inpt_act_sub_char1_META,
			inpt_act_sub_char2_META,
			inpt_act_sub_char3_META,
			mfg_act_rpt_rmrks_META,
			mfg_act_intr_rmrks_META,
			mfg_act_sub_char1_META,
			mfg_act_sub_char2_META,
			mfg_act_sub_char3_META,
			oper_act_intr_rmrks_META,
			oper_act_rpt_rmrks_META,
			oper_act_sub_char1_META,
			oper_act_sub_char2_META,
			oper_act_sub_char3_META,
			chd_itm_grp_p_META,
			par_itm_grp_p_META
		},
		new String[][]{
			{
				"inpt_schd_dt_fr",
				"inpt_schd_hm_fr",
				"inpt_schd_dt_to",
				"inpt_schd_hm_to",
				"inpt_act_dt_fr",
				"inpt_act_hm_fr",
				"inpt_act_dt_to",
				"inpt_act_hm_to",
				"chd_itm_typ",
				"chd_itm_typ_nm",
				"chd_itm_typ_d_cd",
				"chd_itm_typ_d_nm",
				"chd_itm_cd",
				"chd_itm_sub1",
				"chd_itm_sub2",
				"chd_itm_sub3",
				"chd_itm_nm",
				"par_itm_typ",
				"par_itm_typ_nm",
				"par_itm_typ_d_cd",
				"par_itm_typ_d_nm",
				"par_itm_cd",
				"par_itm_sub1",
				"par_itm_sub2",
				"par_itm_sub3",
				"par_itm_nm",
				"par_sno1",
				"par_sno2",
				"par_sno3",
				"par_sno4",
				"wrk_no",
				"wrk_nm",
				"chd_itm_grp_flg1",
				"chd_itm_grp_cd1",
				"chd_itm_grp_nm1",
				"chd_itm_grp_flg2",
				"chd_itm_grp_cd2",
				"chd_itm_grp_nm2",
				"chd_itm_grp_flg3",
				"chd_itm_grp_cd3",
				"chd_itm_grp_nm3",
				"chd_itm_grp_flg4",
				"chd_itm_grp_cd4",
				"chd_itm_grp_nm4",
				"chd_itm_grp_flg5",
				"chd_itm_grp_cd5",
				"chd_itm_grp_nm5",
				"chd_itm_grp_flg6",
				"chd_itm_grp_cd6",
				"chd_itm_grp_nm6",
				"chd_itm_grp_flg7",
				"chd_itm_grp_cd7",
				"chd_itm_grp_nm7",
				"chd_itm_grp_flg8",
				"chd_itm_grp_cd8",
				"chd_itm_grp_nm8",
				"chd_itm_grp_flg9",
				"chd_itm_grp_cd9",
				"chd_itm_grp_nm9",
				"chd_itm_grp_flg10",
				"chd_itm_grp_cd10",
				"chd_itm_grp_nm10",
				"par_itm_grp_flg1",
				"par_itm_grp_cd1",
				"par_itm_grp_nm1",
				"par_itm_grp_flg2",
				"par_itm_grp_cd2",
				"par_itm_grp_nm2",
				"par_itm_grp_flg3",
				"par_itm_grp_cd3",
				"par_itm_grp_nm3",
				"par_itm_grp_flg4",
				"par_itm_grp_cd4",
				"par_itm_grp_nm4",
				"par_itm_grp_flg5",
				"par_itm_grp_cd5",
				"par_itm_grp_nm5",
				"par_itm_grp_flg6",
				"par_itm_grp_cd6",
				"par_itm_grp_nm6",
				"par_itm_grp_flg7",
				"par_itm_grp_cd7",
				"par_itm_grp_nm7",
				"par_itm_grp_flg8",
				"par_itm_grp_cd8",
				"par_itm_grp_nm8",
				"par_itm_grp_flg9",
				"par_itm_grp_cd9",
				"par_itm_grp_nm9",
				"par_itm_grp_flg10",
				"par_itm_grp_cd10",
				"par_itm_grp_nm10"
			},
			{
				$inpt_schd_dt_fr,
				$inpt_schd_hm_fr,
				$inpt_schd_dt_to,
				$inpt_schd_hm_to,
				$inpt_act_dt_fr,
				$inpt_act_hm_fr,
				$inpt_act_dt_to,
				$inpt_act_hm_to,
				$chd_itm_typ,
				$chd_itm_typ_nm,
				$chd_itm_typ_d_cd,
				$chd_itm_typ_d_nm,
				$chd_itm_cd,
				$chd_itm_sub1,
				$chd_itm_sub2,
				$chd_itm_sub3,
				$chd_itm_nm,
				$par_itm_typ,
				$par_itm_typ_nm,
				$par_itm_typ_d_cd,
				$par_itm_typ_d_nm,
				$par_itm_cd,
				$par_itm_sub1,
				$par_itm_sub2,
				$par_itm_sub3,
				$par_itm_nm,
				$par_sno1,
				$par_sno2,
				$par_sno3,
				$par_sno4,
				$wrk_no,
				$wrk_nm,
				$chd_itm_grp_flg1,
				$chd_itm_grp_cd1,
				$chd_itm_grp_nm1,
				$chd_itm_grp_flg2,
				$chd_itm_grp_cd2,
				$chd_itm_grp_nm2,
				$chd_itm_grp_flg3,
				$chd_itm_grp_cd3,
				$chd_itm_grp_nm3,
				$chd_itm_grp_flg4,
				$chd_itm_grp_cd4,
				$chd_itm_grp_nm4,
				$chd_itm_grp_flg5,
				$chd_itm_grp_cd5,
				$chd_itm_grp_nm5,
				$chd_itm_grp_flg6,
				$chd_itm_grp_cd6,
				$chd_itm_grp_nm6,
				$chd_itm_grp_flg7,
				$chd_itm_grp_cd7,
				$chd_itm_grp_nm7,
				$chd_itm_grp_flg8,
				$chd_itm_grp_cd8,
				$chd_itm_grp_nm8,
				$chd_itm_grp_flg9,
				$chd_itm_grp_cd9,
				$chd_itm_grp_nm9,
				$chd_itm_grp_flg10,
				$chd_itm_grp_cd10,
				$chd_itm_grp_nm10,
				$par_itm_grp_flg1,
				$par_itm_grp_cd1,
				$par_itm_grp_nm1,
				$par_itm_grp_flg2,
				$par_itm_grp_cd2,
				$par_itm_grp_nm2,
				$par_itm_grp_flg3,
				$par_itm_grp_cd3,
				$par_itm_grp_nm3,
				$par_itm_grp_flg4,
				$par_itm_grp_cd4,
				$par_itm_grp_nm4,
				$par_itm_grp_flg5,
				$par_itm_grp_cd5,
				$par_itm_grp_nm5,
				$par_itm_grp_flg6,
				$par_itm_grp_cd6,
				$par_itm_grp_nm6,
				$par_itm_grp_flg7,
				$par_itm_grp_cd7,
				$par_itm_grp_nm7,
				$par_itm_grp_flg8,
				$par_itm_grp_cd8,
				$par_itm_grp_nm8,
				$par_itm_grp_flg9,
				$par_itm_grp_cd9,
				$par_itm_grp_nm9,
				$par_itm_grp_flg10,
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
				{$mfg_loc_site_cd, "site_nm"},	// mfg_loc_site_cd
				{$mfg_loc_wg_cd, "wg_nm"},	// mfg_loc_wg_cd
				{$mfg_loc_grp_cd, "loc_grp_nm"},	// mfg_loc_grp_cd
				{$mfg_loc_cd, "loc_nm"},	// mfg_loc_cd
				{$mfg_str_ln_cd, "str_ln_nm"},	// mfg_str_ln_cd
				{$inpt_loc_cd, "loc_nm"},	// inpt_loc_cd
				{$inpt_str_ln_cd, "str_ln_nm"},	// inpt_str_ln_cd
				{$sppl_cd, "bp_nm"},	// sppl_cd
				{$oper_loc_cd, "loc_nm"},	// oper_loc_cd
				{$oper_str_ln_cd, "str_ln_nm"},	// oper_str_ln_cd
				{$chd_itm_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3"},	// chd_itm_p.itm_cd
				{$chd_itm_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3"},	// chd_itm_p.itm_sub1
				{$chd_itm_p + ".itm_sub2", "itm_nm;itm_sub3"},	// chd_itm_p.itm_sub2
				{$chd_itm_p + ".itm_sub3", "itm_nm"},	// chd_itm_p.itm_sub3
				{$loss_rsn_cd, "biz_rsn_nm"},	// loss_rsn_cd
				{$par_itm_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3"},	// par_itm_p.itm_cd
				{$par_itm_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3"},	// par_itm_p.itm_sub1
				{$par_itm_p + ".itm_sub2", "itm_nm;itm_sub3"},	// par_itm_p.itm_sub2
				{$par_itm_p + ".itm_sub3", "itm_nm"},	// par_itm_p.itm_sub3
				{$inpt_rsn_cd, "biz_rsn_nm"},	// inpt_rsn_cd
				{$oper_usr_cd, "usr_nm"}	// oper_usr_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$mfg_loc_cd, "MAC_LOC_IS_SRCH_TYP.MFG_WG"},	// mfg_loc_cd
				{$mfg_str_ln_cd, "mfg_loc_cd;true"},	// mfg_str_ln_cd
				{$inpt_loc_cd, "MAC_LOC_IS_SRCH_TYP.MFG_WG"},	// inpt_loc_cd
				{$inpt_str_ln_cd, "inpt_loc_cd;true"},	// inpt_str_ln_cd
				{$sppl_cd, "bp_cd;true"},	// sppl_cd
				{$oper_loc_cd, "MAC_LOC_IS_SRCH_TYP.MFG_WG"},	// oper_loc_cd
				{$oper_str_ln_cd, "oper_loc_cd;true"},	// oper_str_ln_cd
				{$chd_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.STK1"},	// chd_itm_p.itm_cd
				{$chd_itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.STK1;chd_itm_cd"},	// chd_itm_p.itm_sub1
				{$chd_itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.STK1;chd_itm_cd;chd_itm_sub1"},	// chd_itm_p.itm_sub2
				{$chd_itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.STK1;chd_itm_cd;chd_itm_sub1;chd_itm_sub2"},	// chd_itm_p.itm_sub3
				{$chd_lot_no, "chd_itm_cd;chd_itm_sub1;chd_itm_sub2;chd_itm_sub3"},	// chd_lot_no
				{$chd_sublot_no, "chd_itm_cd;chd_itm_sub1;chd_itm_sub2;chd_itm_sub3;chd_lot_no"},	// chd_sublot_no
				{$par_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.STK1"},	// par_itm_p.itm_cd
				{$par_itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.STK1;par_itm_cd"},	// par_itm_p.itm_sub1
				{$par_itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.STK1;par_itm_cd;par_itm_sub1"},	// par_itm_p.itm_sub2
				{$par_itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.STK1;par_itm_cd;par_itm_sub1;par_itm_sub2"}	// par_itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$mfg_loc_cd, "loc_is_srch_typ"},	// mfg_loc_cd
				{$mfg_str_ln_cd, "loc_cd;mode_nullval_flg"},	// mfg_str_ln_cd
				{$inpt_loc_cd, "loc_is_srch_typ"},	// inpt_loc_cd
				{$inpt_str_ln_cd, "loc_cd;mode_nullval_flg"},	// inpt_str_ln_cd
				{$sppl_cd, "bp_cd;sppl_flg"},	// sppl_cd
				{$oper_loc_cd, "loc_is_srch_typ"},	// oper_loc_cd
				{$oper_str_ln_cd, "loc_cd;mode_nullval_flg"},	// oper_str_ln_cd
				{$chd_itm_p + ".itm_cd", "itm_is_srch_typ"},	// chd_itm_p.itm_cd
				{$chd_itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// chd_itm_p.itm_sub1
				{$chd_itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// chd_itm_p.itm_sub2
				{$chd_itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// chd_itm_p.itm_sub3
				{$chd_lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// chd_lot_no
				{$chd_sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// chd_sublot_no
				{$par_itm_p + ".itm_cd", "itm_is_srch_typ"},	// par_itm_p.itm_cd
				{$par_itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// par_itm_p.itm_sub1
				{$par_itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// par_itm_p.itm_sub2
				{$par_itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// par_itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$mfg_loc_site_cd, "SITE"},	// mfg_loc_site_cd
				{$mfg_loc_site_nm, "SITE"},	// mfg_loc_site_nm
				{$mfg_loc_wg_cd, "WG"},	// mfg_loc_wg_cd
				{$mfg_loc_wg_nm, "WG"},	// mfg_loc_wg_nm
				{$mfg_loc_grp_cd, "LOC_GRP"},	// mfg_loc_grp_cd
				{$mfg_loc_grp_nm, "LOC_GRP"},	// mfg_loc_grp_nm
				{$mfg_str_ln_cd, "STR_LN"},	// mfg_str_ln_cd
				{$mfg_str_ln_nm, "STR_LN"},	// mfg_str_ln_nm
				{$inpt_str_ln_cd, "STR_LN"},	// inpt_str_ln_cd
				{$inpt_str_ln_nm, "STR_LN"},	// inpt_str_ln_nm
				{$oper_str_ln_cd, "STR_LN"},	// oper_str_ln_cd
				{$oper_str_ln_nm, "STR_LN"}	// oper_str_ln_nm
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * SCHD,Schedule,SCHD;ACT,Result,ACT SCHD,予定,SCHD;ACT,実績,ACT.<p>
	 *
	 */
	public String srch_mode1() {
		return getConstString(offset + 0, $srch_mode1);
	}

	/**
	 * SCHD,Schedule,SCHD;ACT,Result,ACT SCHD,予定,SCHD;ACT,実績,ACT.<p>
	 *
	 */
	public void srch_mode1(String value) {
		setConstString(offset + 0, $srch_mode1, value);
	}


	/**
	 * INPT,Input,INPT;LOSS,Loss,LOSS INPT,投入,INPT;LOSS,ロス,LOSS.<p>
	 *
	 */
	public String srch_mode2() {
		return getConstString(offset + 1, $srch_mode2);
	}

	/**
	 * INPT,Input,INPT;LOSS,Loss,LOSS INPT,投入,INPT;LOSS,ロス,LOSS.<p>
	 *
	 */
	public void srch_mode2(String value) {
		setConstString(offset + 1, $srch_mode2, value);
	}


	/**
	 * Save order 指図保存.<p>
	 *
	 */
	public boolean oper_sav_flg() {
		return getConstBoolean(offset + 2, $oper_sav_flg);
	}

	/**
	 * Save order 指図保存.<p>
	 *
	 */
	public void oper_sav_flg(boolean value) {
		setConstBoolean(offset + 2, $oper_sav_flg, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean oper_ord_flg() {
		return getConstBoolean(offset + 3, $oper_ord_flg);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void oper_ord_flg(boolean value) {
		setConstBoolean(offset + 3, $oper_ord_flg, value);
	}


	/**
	 * In process 着手中.<p>
	 *
	 */
	public boolean oper_stt_flg() {
		return getConstBoolean(offset + 4, $oper_stt_flg);
	}

	/**
	 * In process 着手中.<p>
	 *
	 */
	public void oper_stt_flg(boolean value) {
		setConstBoolean(offset + 4, $oper_stt_flg, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean oper_cmpl_flg() {
		return getConstBoolean(offset + 5, $oper_cmpl_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void oper_cmpl_flg(boolean value) {
		setConstBoolean(offset + 5, $oper_cmpl_flg, value);
	}


	/**
	 * Save order 指図保存.<p>
	 *
	 */
	public boolean inpt_sav_flg() {
		return getConstBoolean(offset + 6, $inpt_sav_flg);
	}

	/**
	 * Save order 指図保存.<p>
	 *
	 */
	public void inpt_sav_flg(boolean value) {
		setConstBoolean(offset + 6, $inpt_sav_flg, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean inpt_ord_flg() {
		return getConstBoolean(offset + 7, $inpt_ord_flg);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void inpt_ord_flg(boolean value) {
		setConstBoolean(offset + 7, $inpt_ord_flg, value);
	}


	/**
	 * In process 着手中.<p>
	 *
	 */
	public boolean inpt_stt_flg() {
		return getConstBoolean(offset + 8, $inpt_stt_flg);
	}

	/**
	 * In process 着手中.<p>
	 *
	 */
	public void inpt_stt_flg(boolean value) {
		setConstBoolean(offset + 8, $inpt_stt_flg, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean inpt_cmpl_flg() {
		return getConstBoolean(offset + 9, $inpt_cmpl_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void inpt_cmpl_flg(boolean value) {
		setConstBoolean(offset + 9, $inpt_cmpl_flg, value);
	}


	/**
	 * No scheduled 予定無し.<p>
	 *
	 */
	public boolean inpt_no_schd_flg() {
		return getConstBoolean(offset + 10, $inpt_no_schd_flg);
	}

	/**
	 * No scheduled 予定無し.<p>
	 *
	 */
	public void inpt_no_schd_flg(boolean value) {
		setConstBoolean(offset + 10, $inpt_no_schd_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR inpt_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 11, $inpt_schd_dt_p);
	}
	
	public void inpt_schd_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 11, $inpt_schd_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR inpt_act_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 12, $inpt_act_dt_p);
	}
	
	public void inpt_act_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 12, $inpt_act_dt_p, row);
	}


	/**
	 * Input recording date FROM 投入計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate inpt_ac_dt_fr() {
		return getConstDate(offset + 13, $inpt_ac_dt_fr);
	}

	/**
	 * Input recording date FROM 投入計上日ＦＲＯＭ.<p>
	 *
	 */
	public void inpt_ac_dt_fr(MCDate value) {
		setConstDate(offset + 13, $inpt_ac_dt_fr, value);
	}


	/**
	 * Input recording date TO 投入計上日ＴＯ.<p>
	 *
	 */
	public MCDate inpt_ac_dt_to() {
		return getConstDate(offset + 14, $inpt_ac_dt_to);
	}

	/**
	 * Input recording date TO 投入計上日ＴＯ.<p>
	 *
	 */
	public void inpt_ac_dt_to(MCDate value) {
		setConstDate(offset + 14, $inpt_ac_dt_to, value);
	}


	/**
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public String bkf_typ() {
		return getConstString(offset + 15, $bkf_typ);
	}

	/**
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public void bkf_typ(String value) {
		setConstString(offset + 15, $bkf_typ, value);
	}


	/**
	 * Input item backflush type name 投入品バックフラッシュ区分名.<p>
	 *
	 */
	public String bkf_typ_nm() {
		return getConstString(offset + 16, $bkf_typ_nm);
	}

	/**
	 * Input item backflush type name 投入品バックフラッシュ区分名.<p>
	 *
	 */
	public void bkf_typ_nm(String value) {
		setConstString(offset + 16, $bkf_typ_nm, value);
	}


	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public MCNumber pr_rate_fr() {
		return getConstNumber(offset + 17, $pr_rate_fr);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(MCNumber value) {
		setConstNumber(offset + 17, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(int value) {
		setConstNumber(offset + 17, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(long value) {
		setConstNumber(offset + 17, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(float value) {
		setConstNumber(offset + 17, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(double value) {
		setConstNumber(offset + 17, $pr_rate_fr, value);
	}


	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public MCNumber pr_rate_to() {
		return getConstNumber(offset + 18, $pr_rate_to);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(MCNumber value) {
		setConstNumber(offset + 18, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(int value) {
		setConstNumber(offset + 18, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(long value) {
		setConstNumber(offset + 18, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(float value) {
		setConstNumber(offset + 18, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(double value) {
		setConstNumber(offset + 18, $pr_rate_to, value);
	}


	/**
	 * Consider loss in progress 進捗率にロスを加味する.<p>
	 *
	 */
	public boolean pr_rate_inc_loss_flg() {
		return getConstBoolean(offset + 19, $pr_rate_inc_loss_flg);
	}

	/**
	 * Consider loss in progress 進捗率にロスを加味する.<p>
	 *
	 */
	public void pr_rate_inc_loss_flg(boolean value) {
		setConstBoolean(offset + 19, $pr_rate_inc_loss_flg, value);
	}


	/**
	 * Unallocated only 未引当のみ.<p>
	 *
	 */
	public boolean not_alloc_srch_flg() {
		return getConstBoolean(offset + 20, $not_alloc_srch_flg);
	}

	/**
	 * Unallocated only 未引当のみ.<p>
	 *
	 */
	public void not_alloc_srch_flg(boolean value) {
		setConstBoolean(offset + 20, $not_alloc_srch_flg, value);
	}


	/**
	 * Child item for yield calculation only 収率計算用子品目のみ.<p>
	 *
	 */
	public boolean yield_calc_flg() {
		return getConstBoolean(offset + 21, $yield_calc_flg);
	}

	/**
	 * Child item for yield calculation only 収率計算用子品目のみ.<p>
	 *
	 */
	public void yield_calc_flg(boolean value) {
		setConstBoolean(offset + 21, $yield_calc_flg, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String mfg_loc_site_cd() {
		return getConstString(offset + 22, $mfg_loc_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void mfg_loc_site_cd(String value) {
		setConstString(offset + 22, $mfg_loc_site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String mfg_loc_site_nm() {
		return getConstString(offset + 23, $mfg_loc_site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void mfg_loc_site_nm(String value) {
		setConstString(offset + 23, $mfg_loc_site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String mfg_loc_wg_cd() {
		return getConstString(offset + 24, $mfg_loc_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void mfg_loc_wg_cd(String value) {
		setConstString(offset + 24, $mfg_loc_wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String mfg_loc_wg_nm() {
		return getConstString(offset + 25, $mfg_loc_wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void mfg_loc_wg_nm(String value) {
		setConstString(offset + 25, $mfg_loc_wg_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String mfg_loc_grp_cd() {
		return getConstString(offset + 26, $mfg_loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void mfg_loc_grp_cd(String value) {
		setConstString(offset + 26, $mfg_loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String mfg_loc_grp_nm() {
		return getConstString(offset + 27, $mfg_loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void mfg_loc_grp_nm(String value) {
		setConstString(offset + 27, $mfg_loc_grp_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 28, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 28, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 29, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 29, $mfg_loc_nm, value);
	}


	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public String mfg_str_ln_cd() {
		return getConstString(offset + 30, $mfg_str_ln_cd);
	}

	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public void mfg_str_ln_cd(String value) {
		setConstString(offset + 30, $mfg_str_ln_cd, value);
	}


	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public String mfg_str_ln_nm() {
		return getConstString(offset + 31, $mfg_str_ln_nm);
	}

	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public void mfg_str_ln_nm(String value) {
		setConstString(offset + 31, $mfg_str_ln_nm, value);
	}


	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public String inpt_loc_cd() {
		return getConstString(offset + 32, $inpt_loc_cd);
	}

	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public void inpt_loc_cd(String value) {
		setConstString(offset + 32, $inpt_loc_cd, value);
	}


	/**
	 * Input location name 投入場所名.<p>
	 *
	 */
	public String inpt_loc_nm() {
		return getConstString(offset + 33, $inpt_loc_nm);
	}

	/**
	 * Input location name 投入場所名.<p>
	 *
	 */
	public void inpt_loc_nm(String value) {
		setConstString(offset + 33, $inpt_loc_nm, value);
	}


	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public String inpt_str_ln_cd() {
		return getConstString(offset + 34, $inpt_str_ln_cd);
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public void inpt_str_ln_cd(String value) {
		setConstString(offset + 34, $inpt_str_ln_cd, value);
	}


	/**
	 * Input rack/line name 投入棚・ライン名.<p>
	 *
	 */
	public String inpt_str_ln_nm() {
		return getConstString(offset + 35, $inpt_str_ln_nm);
	}

	/**
	 * Input rack/line name 投入棚・ライン名.<p>
	 *
	 */
	public void inpt_str_ln_nm(String value) {
		setConstString(offset + 35, $inpt_str_ln_nm, value);
	}


	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 36, $sppl_cd);
	}

	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 36, $sppl_cd, value);
	}


	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 37, $sppl_nm);
	}

	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 37, $sppl_nm, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 38, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 38, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 39, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 39, $oper_nm, value);
	}


	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public String oper_loc_cd() {
		return getConstString(offset + 40, $oper_loc_cd);
	}

	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public void oper_loc_cd(String value) {
		setConstString(offset + 40, $oper_loc_cd, value);
	}


	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public String oper_loc_nm() {
		return getConstString(offset + 41, $oper_loc_nm);
	}

	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public void oper_loc_nm(String value) {
		setConstString(offset + 41, $oper_loc_nm, value);
	}


	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public String oper_str_ln_cd() {
		return getConstString(offset + 42, $oper_str_ln_cd);
	}

	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public void oper_str_ln_cd(String value) {
		setConstString(offset + 42, $oper_str_ln_cd, value);
	}


	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public String oper_str_ln_nm() {
		return getConstString(offset + 43, $oper_str_ln_nm);
	}

	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public void oper_str_ln_nm(String value) {
		setConstString(offset + 43, $oper_str_ln_nm, value);
	}


	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public String mfg_mtd_typ() {
		return getConstString(offset + 44, $mfg_mtd_typ);
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public void mfg_mtd_typ(String value) {
		setConstString(offset + 44, $mfg_mtd_typ, value);
	}


	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public String mfg_mtd_typ_nm() {
		return getConstString(offset + 45, $mfg_mtd_typ_nm);
	}

	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public void mfg_mtd_typ_nm(String value) {
		setConstString(offset + 45, $mfg_mtd_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR chd_itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 46, $chd_itm_typ_p);
	}
	
	public void chd_itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 46, $chd_itm_typ_p, row);
	}


	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public String inpt_ctl_typ() {
		return getConstString(offset + 47, $inpt_ctl_typ);
	}

	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public void inpt_ctl_typ(String value) {
		setConstString(offset + 47, $inpt_ctl_typ, value);
	}


	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public String inpt_ctl_typ_nm() {
		return getConstString(offset + 48, $inpt_ctl_typ_nm);
	}

	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public void inpt_ctl_typ_nm(String value) {
		setConstString(offset + 48, $inpt_ctl_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR chd_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 49, $chd_itm_p);
	}
	
	public void chd_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 49, $chd_itm_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String chd_lot_no() {
		return getConstString(offset + 50, $chd_lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void chd_lot_no(String value) {
		setConstString(offset + 50, $chd_lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String chd_sublot_no() {
		return getConstString(offset + 51, $chd_sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void chd_sublot_no(String value) {
		setConstString(offset + 51, $chd_sublot_no, value);
	}


	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public String loss_rsn_cd() {
		return getConstString(offset + 52, $loss_rsn_cd);
	}

	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public void loss_rsn_cd(String value) {
		setConstString(offset + 52, $loss_rsn_cd, value);
	}


	/**
	 * Loss reason name ロス理由名.<p>
	 *
	 */
	public String loss_rsn_nm() {
		return getConstString(offset + 53, $loss_rsn_nm);
	}

	/**
	 * Loss reason name ロス理由名.<p>
	 *
	 */
	public void loss_rsn_nm(String value) {
		setConstString(offset + 53, $loss_rsn_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR par_itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 54, $par_itm_typ_p);
	}
	
	public void par_itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 54, $par_itm_typ_p, row);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 55, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 55, $mfg_inst_no, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR par_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 56, $par_itm_p);
	}
	
	public void par_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 56, $par_itm_p, row);
	}


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR par_sno_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 57, $par_sno_p);
	}
	
	public void par_sno_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 57, $par_sno_p, row);
	}


	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public String inpt_rsn_cd() {
		return getConstString(offset + 58, $inpt_rsn_cd);
	}

	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public void inpt_rsn_cd(String value) {
		setConstString(offset + 58, $inpt_rsn_cd, value);
	}


	/**
	 * Input reason name 投入理由名.<p>
	 *
	 */
	public String inpt_rsn_nm() {
		return getConstString(offset + 59, $inpt_rsn_nm);
	}

	/**
	 * Input reason name 投入理由名.<p>
	 *
	 */
	public void inpt_rsn_nm(String value) {
		setConstString(offset + 59, $inpt_rsn_nm, value);
	}


	/**
	 * Operation PIC cd. 工程担当者ＣＤ.<p>
	 *
	 */
	public String oper_usr_cd() {
		return getConstString(offset + 60, $oper_usr_cd);
	}

	/**
	 * Operation PIC cd. 工程担当者ＣＤ.<p>
	 *
	 */
	public void oper_usr_cd(String value) {
		setConstString(offset + 60, $oper_usr_cd, value);
	}


	/**
	 * Operation PIC name 工程担当者名.<p>
	 *
	 */
	public String oper_usr_nm() {
		return getConstString(offset + 61, $oper_usr_nm);
	}

	/**
	 * Operation PIC name 工程担当者名.<p>
	 *
	 */
	public void oper_usr_nm(String value) {
		setConstString(offset + 61, $oper_usr_nm, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 62, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 62, $itm_ord_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 63, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 63, $po_d_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 64, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 64, $oper_inst_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 65, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 65, $mfg_act_no, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 66, $oper_act_no);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 66, $oper_act_no, value);
	}


	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public String inpt_schd_no() {
		return getConstString(offset + 67, $inpt_schd_no);
	}

	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		setConstString(offset + 67, $inpt_schd_no, value);
	}


	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public String inpt_act_no() {
		return getConstString(offset + 68, $inpt_act_no);
	}

	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public void inpt_act_no(String value) {
		setConstString(offset + 68, $inpt_act_no, value);
	}


	/**
	 * Loss result No. ロス実績ＮＯ.<p>
	 *
	 */
	public String loss_act_no() {
		return getConstString(offset + 69, $loss_act_no);
	}

	/**
	 * Loss result No. ロス実績ＮＯ.<p>
	 *
	 */
	public void loss_act_no(String value) {
		setConstString(offset + 69, $loss_act_no, value);
	}


	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public String mes_id() {
		return getConstString(offset + 70, $mes_id);
	}

	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public void mes_id(String value) {
		setConstString(offset + 70, $mes_id, value);
	}


	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 71, $data_no);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 71, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 71, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 71, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 71, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 71, $data_no, value);
	}


	/**
	 * External input result No. 外部投入実績ＮＯ.<p>
	 *
	 */
	public String ext_inpt_act_no() {
		return getConstString(offset + 72, $ext_inpt_act_no);
	}

	/**
	 * External input result No. 外部投入実績ＮＯ.<p>
	 *
	 */
	public void ext_inpt_act_no(String value) {
		setConstString(offset + 72, $ext_inpt_act_no, value);
	}


	/**
	 * Input schedule order sheet remarks 投入予定指図書備考.<p>
	 *
	 */
	public String inpt_schd_inst_rpt_rmrks() {
		return getConstString(offset + 73, $inpt_schd_inst_rpt_rmrks);
	}

	/**
	 * Input schedule order sheet remarks 投入予定指図書備考.<p>
	 *
	 */
	public void inpt_schd_inst_rpt_rmrks(String value) {
		setConstString(offset + 73, $inpt_schd_inst_rpt_rmrks, value);
	}


	/**
	 * Input schedule internal remarks 投入予定内部備考.<p>
	 *
	 */
	public String inpt_schd_intr_rmrks() {
		return getConstString(offset + 74, $inpt_schd_intr_rmrks);
	}

	/**
	 * Input schedule internal remarks 投入予定内部備考.<p>
	 *
	 */
	public void inpt_schd_intr_rmrks(String value) {
		setConstString(offset + 74, $inpt_schd_intr_rmrks, value);
	}


	/**
	 * Input schedule spare 1 投入予定予備１.<p>
	 *
	 */
	public String inpt_schd_sub_char1() {
		return getConstString(offset + 75, $inpt_schd_sub_char1);
	}

	/**
	 * Input schedule spare 1 投入予定予備１.<p>
	 *
	 */
	public void inpt_schd_sub_char1(String value) {
		setConstString(offset + 75, $inpt_schd_sub_char1, value);
	}


	/**
	 * Input schedule spare 2 投入予定予備２.<p>
	 *
	 */
	public String inpt_schd_sub_char2() {
		return getConstString(offset + 76, $inpt_schd_sub_char2);
	}

	/**
	 * Input schedule spare 2 投入予定予備２.<p>
	 *
	 */
	public void inpt_schd_sub_char2(String value) {
		setConstString(offset + 76, $inpt_schd_sub_char2, value);
	}


	/**
	 * Input schedule spare 3 投入予定予備３.<p>
	 *
	 */
	public String inpt_schd_sub_char3() {
		return getConstString(offset + 77, $inpt_schd_sub_char3);
	}

	/**
	 * Input schedule spare 3 投入予定予備３.<p>
	 *
	 */
	public void inpt_schd_sub_char3(String value) {
		setConstString(offset + 77, $inpt_schd_sub_char3, value);
	}


	/**
	 * Input result record sheet remarks 投入実績記録書備考.<p>
	 *
	 */
	public String inpt_act_rpt_rmrks() {
		return getConstString(offset + 78, $inpt_act_rpt_rmrks);
	}

	/**
	 * Input result record sheet remarks 投入実績記録書備考.<p>
	 *
	 */
	public void inpt_act_rpt_rmrks(String value) {
		setConstString(offset + 78, $inpt_act_rpt_rmrks, value);
	}


	/**
	 * Input result internal remarks 投入実績内部備考.<p>
	 *
	 */
	public String inpt_act_intr_rmrks() {
		return getConstString(offset + 79, $inpt_act_intr_rmrks);
	}

	/**
	 * Input result internal remarks 投入実績内部備考.<p>
	 *
	 */
	public void inpt_act_intr_rmrks(String value) {
		setConstString(offset + 79, $inpt_act_intr_rmrks, value);
	}


	/**
	 * Input result transaction remarks 投入実績取引備考.<p>
	 *
	 */
	public String inpt_act_trd_rmrks() {
		return getConstString(offset + 80, $inpt_act_trd_rmrks);
	}

	/**
	 * Input result transaction remarks 投入実績取引備考.<p>
	 *
	 */
	public void inpt_act_trd_rmrks(String value) {
		setConstString(offset + 80, $inpt_act_trd_rmrks, value);
	}


	/**
	 * Input result spare 1 投入実績予備１.<p>
	 *
	 */
	public String inpt_act_sub_char1() {
		return getConstString(offset + 81, $inpt_act_sub_char1);
	}

	/**
	 * Input result spare 1 投入実績予備１.<p>
	 *
	 */
	public void inpt_act_sub_char1(String value) {
		setConstString(offset + 81, $inpt_act_sub_char1, value);
	}


	/**
	 * Input result spare 2 投入実績予備２.<p>
	 *
	 */
	public String inpt_act_sub_char2() {
		return getConstString(offset + 82, $inpt_act_sub_char2);
	}

	/**
	 * Input result spare 2 投入実績予備２.<p>
	 *
	 */
	public void inpt_act_sub_char2(String value) {
		setConstString(offset + 82, $inpt_act_sub_char2, value);
	}


	/**
	 * Input result spare 3 投入実績予備３.<p>
	 *
	 */
	public String inpt_act_sub_char3() {
		return getConstString(offset + 83, $inpt_act_sub_char3);
	}

	/**
	 * Input result spare 3 投入実績予備３.<p>
	 *
	 */
	public void inpt_act_sub_char3(String value) {
		setConstString(offset + 83, $inpt_act_sub_char3, value);
	}


	/**
	 * Mfg. record sheet remarks 製造記録書備考.<p>
	 *
	 */
	public String mfg_act_rpt_rmrks() {
		return getConstString(offset + 84, $mfg_act_rpt_rmrks);
	}

	/**
	 * Mfg. record sheet remarks 製造記録書備考.<p>
	 *
	 */
	public void mfg_act_rpt_rmrks(String value) {
		setConstString(offset + 84, $mfg_act_rpt_rmrks, value);
	}


	/**
	 * Mfg. internal remarks 製造内部備考.<p>
	 *
	 */
	public String mfg_act_intr_rmrks() {
		return getConstString(offset + 85, $mfg_act_intr_rmrks);
	}

	/**
	 * Mfg. internal remarks 製造内部備考.<p>
	 *
	 */
	public void mfg_act_intr_rmrks(String value) {
		setConstString(offset + 85, $mfg_act_intr_rmrks, value);
	}


	/**
	 * Mfg. result spare 1 製造実績予備１.<p>
	 *
	 */
	public String mfg_act_sub_char1() {
		return getConstString(offset + 86, $mfg_act_sub_char1);
	}

	/**
	 * Mfg. result spare 1 製造実績予備１.<p>
	 *
	 */
	public void mfg_act_sub_char1(String value) {
		setConstString(offset + 86, $mfg_act_sub_char1, value);
	}


	/**
	 * Mfg. result spare 2 製造実績予備２.<p>
	 *
	 */
	public String mfg_act_sub_char2() {
		return getConstString(offset + 87, $mfg_act_sub_char2);
	}

	/**
	 * Mfg. result spare 2 製造実績予備２.<p>
	 *
	 */
	public void mfg_act_sub_char2(String value) {
		setConstString(offset + 87, $mfg_act_sub_char2, value);
	}


	/**
	 * Mfg. result spare 3 製造実績予備３.<p>
	 *
	 */
	public String mfg_act_sub_char3() {
		return getConstString(offset + 88, $mfg_act_sub_char3);
	}

	/**
	 * Mfg. result spare 3 製造実績予備３.<p>
	 *
	 */
	public void mfg_act_sub_char3(String value) {
		setConstString(offset + 88, $mfg_act_sub_char3, value);
	}


	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public String oper_act_intr_rmrks() {
		return getConstString(offset + 89, $oper_act_intr_rmrks);
	}

	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public void oper_act_intr_rmrks(String value) {
		setConstString(offset + 89, $oper_act_intr_rmrks, value);
	}


	/**
	 * Operation record sheet remarks 工程記録書備考.<p>
	 *
	 */
	public String oper_act_rpt_rmrks() {
		return getConstString(offset + 90, $oper_act_rpt_rmrks);
	}

	/**
	 * Operation record sheet remarks 工程記録書備考.<p>
	 *
	 */
	public void oper_act_rpt_rmrks(String value) {
		setConstString(offset + 90, $oper_act_rpt_rmrks, value);
	}


	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public String oper_act_sub_char1() {
		return getConstString(offset + 91, $oper_act_sub_char1);
	}

	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public void oper_act_sub_char1(String value) {
		setConstString(offset + 91, $oper_act_sub_char1, value);
	}


	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public String oper_act_sub_char2() {
		return getConstString(offset + 92, $oper_act_sub_char2);
	}

	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public void oper_act_sub_char2(String value) {
		setConstString(offset + 92, $oper_act_sub_char2, value);
	}


	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public String oper_act_sub_char3() {
		return getConstString(offset + 93, $oper_act_sub_char3);
	}

	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public void oper_act_sub_char3(String value) {
		setConstString(offset + 93, $oper_act_sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR chd_itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 94, $chd_itm_grp_p);
	}
	
	public void chd_itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 94, $chd_itm_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR par_itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 95, $par_itm_grp_p);
	}
	
	public void par_itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 95, $par_itm_grp_p, row);
	}


	public String getString(String name) {
		if ($srch_mode1.equalsIgnoreCase(name)) {
			return srch_mode1();
		}
		if ($srch_mode2.equalsIgnoreCase(name)) {
			return srch_mode2();
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			return bkf_typ();
		}
		if ($bkf_typ_nm.equalsIgnoreCase(name)) {
			return bkf_typ_nm();
		}
		if ($mfg_loc_site_cd.equalsIgnoreCase(name)) {
			return mfg_loc_site_cd();
		}
		if ($mfg_loc_site_nm.equalsIgnoreCase(name)) {
			return mfg_loc_site_nm();
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return mfg_loc_wg_cd();
		}
		if ($mfg_loc_wg_nm.equalsIgnoreCase(name)) {
			return mfg_loc_wg_nm();
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			return mfg_loc_grp_cd();
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			return mfg_loc_grp_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return mfg_str_ln_nm();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_loc_nm.equalsIgnoreCase(name)) {
			return inpt_loc_nm();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($inpt_str_ln_nm.equalsIgnoreCase(name)) {
			return inpt_str_ln_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			return oper_loc_nm();
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			return oper_str_ln_cd();
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			return oper_str_ln_nm();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			return mfg_mtd_typ_nm();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			return inpt_ctl_typ_nm();
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			return chd_lot_no();
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			return chd_sublot_no();
		}
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			return loss_rsn_cd();
		}
		if ($loss_rsn_nm.equalsIgnoreCase(name)) {
			return loss_rsn_nm();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			return inpt_rsn_cd();
		}
		if ($inpt_rsn_nm.equalsIgnoreCase(name)) {
			return inpt_rsn_nm();
		}
		if ($oper_usr_cd.equalsIgnoreCase(name)) {
			return oper_usr_cd();
		}
		if ($oper_usr_nm.equalsIgnoreCase(name)) {
			return oper_usr_nm();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			return inpt_act_no();
		}
		if ($loss_act_no.equalsIgnoreCase(name)) {
			return loss_act_no();
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			return mes_id();
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			return ext_inpt_act_no();
		}
		if ($inpt_schd_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inpt_schd_inst_rpt_rmrks();
		}
		if ($inpt_schd_intr_rmrks.equalsIgnoreCase(name)) {
			return inpt_schd_intr_rmrks();
		}
		if ($inpt_schd_sub_char1.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char1();
		}
		if ($inpt_schd_sub_char2.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char2();
		}
		if ($inpt_schd_sub_char3.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char3();
		}
		if ($inpt_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return inpt_act_rpt_rmrks();
		}
		if ($inpt_act_intr_rmrks.equalsIgnoreCase(name)) {
			return inpt_act_intr_rmrks();
		}
		if ($inpt_act_trd_rmrks.equalsIgnoreCase(name)) {
			return inpt_act_trd_rmrks();
		}
		if ($inpt_act_sub_char1.equalsIgnoreCase(name)) {
			return inpt_act_sub_char1();
		}
		if ($inpt_act_sub_char2.equalsIgnoreCase(name)) {
			return inpt_act_sub_char2();
		}
		if ($inpt_act_sub_char3.equalsIgnoreCase(name)) {
			return inpt_act_sub_char3();
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_rpt_rmrks();
		}
		if ($mfg_act_intr_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_intr_rmrks();
		}
		if ($mfg_act_sub_char1.equalsIgnoreCase(name)) {
			return mfg_act_sub_char1();
		}
		if ($mfg_act_sub_char2.equalsIgnoreCase(name)) {
			return mfg_act_sub_char2();
		}
		if ($mfg_act_sub_char3.equalsIgnoreCase(name)) {
			return mfg_act_sub_char3();
		}
		if ($oper_act_intr_rmrks.equalsIgnoreCase(name)) {
			return oper_act_intr_rmrks();
		}
		if ($oper_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return oper_act_rpt_rmrks();
		}
		if ($oper_act_sub_char1.equalsIgnoreCase(name)) {
			return oper_act_sub_char1();
		}
		if ($oper_act_sub_char2.equalsIgnoreCase(name)) {
			return oper_act_sub_char2();
		}
		if ($oper_act_sub_char3.equalsIgnoreCase(name)) {
			return oper_act_sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			return pr_rate_fr();
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			return pr_rate_to();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($inpt_ac_dt_fr.equalsIgnoreCase(name)) {
			return inpt_ac_dt_fr();
		}
		if ($inpt_ac_dt_to.equalsIgnoreCase(name)) {
			return inpt_ac_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($oper_sav_flg.equalsIgnoreCase(name)) {
			return oper_sav_flg();
		}
		if ($oper_ord_flg.equalsIgnoreCase(name)) {
			return oper_ord_flg();
		}
		if ($oper_stt_flg.equalsIgnoreCase(name)) {
			return oper_stt_flg();
		}
		if ($oper_cmpl_flg.equalsIgnoreCase(name)) {
			return oper_cmpl_flg();
		}
		if ($inpt_sav_flg.equalsIgnoreCase(name)) {
			return inpt_sav_flg();
		}
		if ($inpt_ord_flg.equalsIgnoreCase(name)) {
			return inpt_ord_flg();
		}
		if ($inpt_stt_flg.equalsIgnoreCase(name)) {
			return inpt_stt_flg();
		}
		if ($inpt_cmpl_flg.equalsIgnoreCase(name)) {
			return inpt_cmpl_flg();
		}
		if ($inpt_no_schd_flg.equalsIgnoreCase(name)) {
			return inpt_no_schd_flg();
		}
		if ($pr_rate_inc_loss_flg.equalsIgnoreCase(name)) {
			return pr_rate_inc_loss_flg();
		}
		if ($not_alloc_srch_flg.equalsIgnoreCase(name)) {
			return not_alloc_srch_flg();
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			return yield_calc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($srch_mode1.equalsIgnoreCase(name)) {
			return srch_mode1();
		}
		if ($srch_mode2.equalsIgnoreCase(name)) {
			return srch_mode2();
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			return bkf_typ();
		}
		if ($bkf_typ_nm.equalsIgnoreCase(name)) {
			return bkf_typ_nm();
		}
		if ($mfg_loc_site_cd.equalsIgnoreCase(name)) {
			return mfg_loc_site_cd();
		}
		if ($mfg_loc_site_nm.equalsIgnoreCase(name)) {
			return mfg_loc_site_nm();
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return mfg_loc_wg_cd();
		}
		if ($mfg_loc_wg_nm.equalsIgnoreCase(name)) {
			return mfg_loc_wg_nm();
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			return mfg_loc_grp_cd();
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			return mfg_loc_grp_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return mfg_str_ln_nm();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_loc_nm.equalsIgnoreCase(name)) {
			return inpt_loc_nm();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($inpt_str_ln_nm.equalsIgnoreCase(name)) {
			return inpt_str_ln_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			return oper_loc_nm();
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			return oper_str_ln_cd();
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			return oper_str_ln_nm();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			return mfg_mtd_typ_nm();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			return inpt_ctl_typ_nm();
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			return chd_lot_no();
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			return chd_sublot_no();
		}
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			return loss_rsn_cd();
		}
		if ($loss_rsn_nm.equalsIgnoreCase(name)) {
			return loss_rsn_nm();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			return inpt_rsn_cd();
		}
		if ($inpt_rsn_nm.equalsIgnoreCase(name)) {
			return inpt_rsn_nm();
		}
		if ($oper_usr_cd.equalsIgnoreCase(name)) {
			return oper_usr_cd();
		}
		if ($oper_usr_nm.equalsIgnoreCase(name)) {
			return oper_usr_nm();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			return inpt_act_no();
		}
		if ($loss_act_no.equalsIgnoreCase(name)) {
			return loss_act_no();
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			return mes_id();
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			return ext_inpt_act_no();
		}
		if ($inpt_schd_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inpt_schd_inst_rpt_rmrks();
		}
		if ($inpt_schd_intr_rmrks.equalsIgnoreCase(name)) {
			return inpt_schd_intr_rmrks();
		}
		if ($inpt_schd_sub_char1.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char1();
		}
		if ($inpt_schd_sub_char2.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char2();
		}
		if ($inpt_schd_sub_char3.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char3();
		}
		if ($inpt_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return inpt_act_rpt_rmrks();
		}
		if ($inpt_act_intr_rmrks.equalsIgnoreCase(name)) {
			return inpt_act_intr_rmrks();
		}
		if ($inpt_act_trd_rmrks.equalsIgnoreCase(name)) {
			return inpt_act_trd_rmrks();
		}
		if ($inpt_act_sub_char1.equalsIgnoreCase(name)) {
			return inpt_act_sub_char1();
		}
		if ($inpt_act_sub_char2.equalsIgnoreCase(name)) {
			return inpt_act_sub_char2();
		}
		if ($inpt_act_sub_char3.equalsIgnoreCase(name)) {
			return inpt_act_sub_char3();
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_rpt_rmrks();
		}
		if ($mfg_act_intr_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_intr_rmrks();
		}
		if ($mfg_act_sub_char1.equalsIgnoreCase(name)) {
			return mfg_act_sub_char1();
		}
		if ($mfg_act_sub_char2.equalsIgnoreCase(name)) {
			return mfg_act_sub_char2();
		}
		if ($mfg_act_sub_char3.equalsIgnoreCase(name)) {
			return mfg_act_sub_char3();
		}
		if ($oper_act_intr_rmrks.equalsIgnoreCase(name)) {
			return oper_act_intr_rmrks();
		}
		if ($oper_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return oper_act_rpt_rmrks();
		}
		if ($oper_act_sub_char1.equalsIgnoreCase(name)) {
			return oper_act_sub_char1();
		}
		if ($oper_act_sub_char2.equalsIgnoreCase(name)) {
			return oper_act_sub_char2();
		}
		if ($oper_act_sub_char3.equalsIgnoreCase(name)) {
			return oper_act_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			return pr_rate_fr();
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			return pr_rate_to();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($inpt_ac_dt_fr.equalsIgnoreCase(name)) {
			return inpt_ac_dt_fr();
		}
		if ($inpt_ac_dt_to.equalsIgnoreCase(name)) {
			return inpt_ac_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($oper_sav_flg.equalsIgnoreCase(name)) {
			return oper_sav_flg();
		}
		if ($oper_ord_flg.equalsIgnoreCase(name)) {
			return oper_ord_flg();
		}
		if ($oper_stt_flg.equalsIgnoreCase(name)) {
			return oper_stt_flg();
		}
		if ($oper_cmpl_flg.equalsIgnoreCase(name)) {
			return oper_cmpl_flg();
		}
		if ($inpt_sav_flg.equalsIgnoreCase(name)) {
			return inpt_sav_flg();
		}
		if ($inpt_ord_flg.equalsIgnoreCase(name)) {
			return inpt_ord_flg();
		}
		if ($inpt_stt_flg.equalsIgnoreCase(name)) {
			return inpt_stt_flg();
		}
		if ($inpt_cmpl_flg.equalsIgnoreCase(name)) {
			return inpt_cmpl_flg();
		}
		if ($inpt_no_schd_flg.equalsIgnoreCase(name)) {
			return inpt_no_schd_flg();
		}
		if ($pr_rate_inc_loss_flg.equalsIgnoreCase(name)) {
			return pr_rate_inc_loss_flg();
		}
		if ($not_alloc_srch_flg.equalsIgnoreCase(name)) {
			return not_alloc_srch_flg();
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			return yield_calc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($srch_mode1.equalsIgnoreCase(name)) {
			srch_mode1(value);
			return;
		}
		if ($srch_mode2.equalsIgnoreCase(name)) {
			srch_mode2(value);
			return;
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			bkf_typ(value);
			return;
		}
		if ($bkf_typ_nm.equalsIgnoreCase(name)) {
			bkf_typ_nm(value);
			return;
		}
		if ($mfg_loc_site_cd.equalsIgnoreCase(name)) {
			mfg_loc_site_cd(value);
			return;
		}
		if ($mfg_loc_site_nm.equalsIgnoreCase(name)) {
			mfg_loc_site_nm(value);
			return;
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			mfg_loc_wg_cd(value);
			return;
		}
		if ($mfg_loc_wg_nm.equalsIgnoreCase(name)) {
			mfg_loc_wg_nm(value);
			return;
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			mfg_loc_grp_cd(value);
			return;
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			mfg_loc_grp_nm(value);
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
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_str_ln_cd(value);
			return;
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			mfg_str_ln_nm(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_loc_nm.equalsIgnoreCase(name)) {
			inpt_loc_nm(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
			return;
		}
		if ($inpt_str_ln_nm.equalsIgnoreCase(name)) {
			inpt_str_ln_nm(value);
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
			return;
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			oper_loc_nm(value);
			return;
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			oper_str_ln_cd(value);
			return;
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			oper_str_ln_nm(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			mfg_mtd_typ_nm(value);
			return;
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			inpt_ctl_typ(value);
			return;
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			inpt_ctl_typ_nm(value);
			return;
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			chd_lot_no(value);
			return;
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			chd_sublot_no(value);
			return;
		}
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			loss_rsn_cd(value);
			return;
		}
		if ($loss_rsn_nm.equalsIgnoreCase(name)) {
			loss_rsn_nm(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			inpt_rsn_cd(value);
			return;
		}
		if ($inpt_rsn_nm.equalsIgnoreCase(name)) {
			inpt_rsn_nm(value);
			return;
		}
		if ($oper_usr_cd.equalsIgnoreCase(name)) {
			oper_usr_cd(value);
			return;
		}
		if ($oper_usr_nm.equalsIgnoreCase(name)) {
			oper_usr_nm(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			inpt_act_no(value);
			return;
		}
		if ($loss_act_no.equalsIgnoreCase(name)) {
			loss_act_no(value);
			return;
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			mes_id(value);
			return;
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			ext_inpt_act_no(value);
			return;
		}
		if ($inpt_schd_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inpt_schd_inst_rpt_rmrks(value);
			return;
		}
		if ($inpt_schd_intr_rmrks.equalsIgnoreCase(name)) {
			inpt_schd_intr_rmrks(value);
			return;
		}
		if ($inpt_schd_sub_char1.equalsIgnoreCase(name)) {
			inpt_schd_sub_char1(value);
			return;
		}
		if ($inpt_schd_sub_char2.equalsIgnoreCase(name)) {
			inpt_schd_sub_char2(value);
			return;
		}
		if ($inpt_schd_sub_char3.equalsIgnoreCase(name)) {
			inpt_schd_sub_char3(value);
			return;
		}
		if ($inpt_act_rpt_rmrks.equalsIgnoreCase(name)) {
			inpt_act_rpt_rmrks(value);
			return;
		}
		if ($inpt_act_intr_rmrks.equalsIgnoreCase(name)) {
			inpt_act_intr_rmrks(value);
			return;
		}
		if ($inpt_act_trd_rmrks.equalsIgnoreCase(name)) {
			inpt_act_trd_rmrks(value);
			return;
		}
		if ($inpt_act_sub_char1.equalsIgnoreCase(name)) {
			inpt_act_sub_char1(value);
			return;
		}
		if ($inpt_act_sub_char2.equalsIgnoreCase(name)) {
			inpt_act_sub_char2(value);
			return;
		}
		if ($inpt_act_sub_char3.equalsIgnoreCase(name)) {
			inpt_act_sub_char3(value);
			return;
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			mfg_act_rpt_rmrks(value);
			return;
		}
		if ($mfg_act_intr_rmrks.equalsIgnoreCase(name)) {
			mfg_act_intr_rmrks(value);
			return;
		}
		if ($mfg_act_sub_char1.equalsIgnoreCase(name)) {
			mfg_act_sub_char1(value);
			return;
		}
		if ($mfg_act_sub_char2.equalsIgnoreCase(name)) {
			mfg_act_sub_char2(value);
			return;
		}
		if ($mfg_act_sub_char3.equalsIgnoreCase(name)) {
			mfg_act_sub_char3(value);
			return;
		}
		if ($oper_act_intr_rmrks.equalsIgnoreCase(name)) {
			oper_act_intr_rmrks(value);
			return;
		}
		if ($oper_act_rpt_rmrks.equalsIgnoreCase(name)) {
			oper_act_rpt_rmrks(value);
			return;
		}
		if ($oper_act_sub_char1.equalsIgnoreCase(name)) {
			oper_act_sub_char1(value);
			return;
		}
		if ($oper_act_sub_char2.equalsIgnoreCase(name)) {
			oper_act_sub_char2(value);
			return;
		}
		if ($oper_act_sub_char3.equalsIgnoreCase(name)) {
			oper_act_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			pr_rate_fr(value);
			return;
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			pr_rate_to(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			pr_rate_fr(value);
			return;
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			pr_rate_to(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			pr_rate_fr(value);
			return;
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			pr_rate_to(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			pr_rate_fr(value);
			return;
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			pr_rate_to(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			pr_rate_fr(value);
			return;
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			pr_rate_to(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($inpt_ac_dt_fr.equalsIgnoreCase(name)) {
			inpt_ac_dt_fr(value);
			return;
		}
		if ($inpt_ac_dt_to.equalsIgnoreCase(name)) {
			inpt_ac_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($oper_sav_flg.equalsIgnoreCase(name)) {
			oper_sav_flg(value);
			return;
		}
		if ($oper_ord_flg.equalsIgnoreCase(name)) {
			oper_ord_flg(value);
			return;
		}
		if ($oper_stt_flg.equalsIgnoreCase(name)) {
			oper_stt_flg(value);
			return;
		}
		if ($oper_cmpl_flg.equalsIgnoreCase(name)) {
			oper_cmpl_flg(value);
			return;
		}
		if ($inpt_sav_flg.equalsIgnoreCase(name)) {
			inpt_sav_flg(value);
			return;
		}
		if ($inpt_ord_flg.equalsIgnoreCase(name)) {
			inpt_ord_flg(value);
			return;
		}
		if ($inpt_stt_flg.equalsIgnoreCase(name)) {
			inpt_stt_flg(value);
			return;
		}
		if ($inpt_cmpl_flg.equalsIgnoreCase(name)) {
			inpt_cmpl_flg(value);
			return;
		}
		if ($inpt_no_schd_flg.equalsIgnoreCase(name)) {
			inpt_no_schd_flg(value);
			return;
		}
		if ($pr_rate_inc_loss_flg.equalsIgnoreCase(name)) {
			pr_rate_inc_loss_flg(value);
			return;
		}
		if ($not_alloc_srch_flg.equalsIgnoreCase(name)) {
			not_alloc_srch_flg(value);
			return;
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			yield_calc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($srch_mode1.equalsIgnoreCase(name)) {
			srch_mode1(value);
			return;
		}
		if ($srch_mode2.equalsIgnoreCase(name)) {
			srch_mode2(value);
			return;
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			bkf_typ(value);
			return;
		}
		if ($bkf_typ_nm.equalsIgnoreCase(name)) {
			bkf_typ_nm(value);
			return;
		}
		if ($mfg_loc_site_cd.equalsIgnoreCase(name)) {
			mfg_loc_site_cd(value);
			return;
		}
		if ($mfg_loc_site_nm.equalsIgnoreCase(name)) {
			mfg_loc_site_nm(value);
			return;
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			mfg_loc_wg_cd(value);
			return;
		}
		if ($mfg_loc_wg_nm.equalsIgnoreCase(name)) {
			mfg_loc_wg_nm(value);
			return;
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			mfg_loc_grp_cd(value);
			return;
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			mfg_loc_grp_nm(value);
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
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_str_ln_cd(value);
			return;
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			mfg_str_ln_nm(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_loc_nm.equalsIgnoreCase(name)) {
			inpt_loc_nm(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
			return;
		}
		if ($inpt_str_ln_nm.equalsIgnoreCase(name)) {
			inpt_str_ln_nm(value);
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
			return;
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			oper_loc_nm(value);
			return;
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			oper_str_ln_cd(value);
			return;
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			oper_str_ln_nm(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			mfg_mtd_typ_nm(value);
			return;
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			inpt_ctl_typ(value);
			return;
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			inpt_ctl_typ_nm(value);
			return;
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			chd_lot_no(value);
			return;
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			chd_sublot_no(value);
			return;
		}
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			loss_rsn_cd(value);
			return;
		}
		if ($loss_rsn_nm.equalsIgnoreCase(name)) {
			loss_rsn_nm(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			inpt_rsn_cd(value);
			return;
		}
		if ($inpt_rsn_nm.equalsIgnoreCase(name)) {
			inpt_rsn_nm(value);
			return;
		}
		if ($oper_usr_cd.equalsIgnoreCase(name)) {
			oper_usr_cd(value);
			return;
		}
		if ($oper_usr_nm.equalsIgnoreCase(name)) {
			oper_usr_nm(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			inpt_act_no(value);
			return;
		}
		if ($loss_act_no.equalsIgnoreCase(name)) {
			loss_act_no(value);
			return;
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			mes_id(value);
			return;
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			ext_inpt_act_no(value);
			return;
		}
		if ($inpt_schd_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inpt_schd_inst_rpt_rmrks(value);
			return;
		}
		if ($inpt_schd_intr_rmrks.equalsIgnoreCase(name)) {
			inpt_schd_intr_rmrks(value);
			return;
		}
		if ($inpt_schd_sub_char1.equalsIgnoreCase(name)) {
			inpt_schd_sub_char1(value);
			return;
		}
		if ($inpt_schd_sub_char2.equalsIgnoreCase(name)) {
			inpt_schd_sub_char2(value);
			return;
		}
		if ($inpt_schd_sub_char3.equalsIgnoreCase(name)) {
			inpt_schd_sub_char3(value);
			return;
		}
		if ($inpt_act_rpt_rmrks.equalsIgnoreCase(name)) {
			inpt_act_rpt_rmrks(value);
			return;
		}
		if ($inpt_act_intr_rmrks.equalsIgnoreCase(name)) {
			inpt_act_intr_rmrks(value);
			return;
		}
		if ($inpt_act_trd_rmrks.equalsIgnoreCase(name)) {
			inpt_act_trd_rmrks(value);
			return;
		}
		if ($inpt_act_sub_char1.equalsIgnoreCase(name)) {
			inpt_act_sub_char1(value);
			return;
		}
		if ($inpt_act_sub_char2.equalsIgnoreCase(name)) {
			inpt_act_sub_char2(value);
			return;
		}
		if ($inpt_act_sub_char3.equalsIgnoreCase(name)) {
			inpt_act_sub_char3(value);
			return;
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			mfg_act_rpt_rmrks(value);
			return;
		}
		if ($mfg_act_intr_rmrks.equalsIgnoreCase(name)) {
			mfg_act_intr_rmrks(value);
			return;
		}
		if ($mfg_act_sub_char1.equalsIgnoreCase(name)) {
			mfg_act_sub_char1(value);
			return;
		}
		if ($mfg_act_sub_char2.equalsIgnoreCase(name)) {
			mfg_act_sub_char2(value);
			return;
		}
		if ($mfg_act_sub_char3.equalsIgnoreCase(name)) {
			mfg_act_sub_char3(value);
			return;
		}
		if ($oper_act_intr_rmrks.equalsIgnoreCase(name)) {
			oper_act_intr_rmrks(value);
			return;
		}
		if ($oper_act_rpt_rmrks.equalsIgnoreCase(name)) {
			oper_act_rpt_rmrks(value);
			return;
		}
		if ($oper_act_sub_char1.equalsIgnoreCase(name)) {
			oper_act_sub_char1(value);
			return;
		}
		if ($oper_act_sub_char2.equalsIgnoreCase(name)) {
			oper_act_sub_char2(value);
			return;
		}
		if ($oper_act_sub_char3.equalsIgnoreCase(name)) {
			oper_act_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			pr_rate_fr(value);
			return;
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			pr_rate_to(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			pr_rate_fr(value);
			return;
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			pr_rate_to(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			pr_rate_fr(value);
			return;
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			pr_rate_to(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			pr_rate_fr(value);
			return;
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			pr_rate_to(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pr_rate_fr.equalsIgnoreCase(name)) {
			pr_rate_fr(value);
			return;
		}
		if ($pr_rate_to.equalsIgnoreCase(name)) {
			pr_rate_to(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($inpt_ac_dt_fr.equalsIgnoreCase(name)) {
			inpt_ac_dt_fr(value);
			return;
		}
		if ($inpt_ac_dt_to.equalsIgnoreCase(name)) {
			inpt_ac_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($oper_sav_flg.equalsIgnoreCase(name)) {
			oper_sav_flg(value);
			return;
		}
		if ($oper_ord_flg.equalsIgnoreCase(name)) {
			oper_ord_flg(value);
			return;
		}
		if ($oper_stt_flg.equalsIgnoreCase(name)) {
			oper_stt_flg(value);
			return;
		}
		if ($oper_cmpl_flg.equalsIgnoreCase(name)) {
			oper_cmpl_flg(value);
			return;
		}
		if ($inpt_sav_flg.equalsIgnoreCase(name)) {
			inpt_sav_flg(value);
			return;
		}
		if ($inpt_ord_flg.equalsIgnoreCase(name)) {
			inpt_ord_flg(value);
			return;
		}
		if ($inpt_stt_flg.equalsIgnoreCase(name)) {
			inpt_stt_flg(value);
			return;
		}
		if ($inpt_cmpl_flg.equalsIgnoreCase(name)) {
			inpt_cmpl_flg(value);
			return;
		}
		if ($inpt_no_schd_flg.equalsIgnoreCase(name)) {
			inpt_no_schd_flg(value);
			return;
		}
		if ($pr_rate_inc_loss_flg.equalsIgnoreCase(name)) {
			pr_rate_inc_loss_flg(value);
			return;
		}
		if ($not_alloc_srch_flg.equalsIgnoreCase(name)) {
			not_alloc_srch_flg(value);
			return;
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			yield_calc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($inpt_schd_dt_p.equalsIgnoreCase(name)) {
			return inpt_schd_dt_p();
		}
		if ($inpt_act_dt_p.equalsIgnoreCase(name)) {
			return inpt_act_dt_p();
		}
		if ($chd_itm_typ_p.equalsIgnoreCase(name)) {
			return chd_itm_typ_p();
		}
		if ($chd_itm_p.equalsIgnoreCase(name)) {
			return chd_itm_p();
		}
		if ($par_itm_typ_p.equalsIgnoreCase(name)) {
			return par_itm_typ_p();
		}
		if ($par_itm_p.equalsIgnoreCase(name)) {
			return par_itm_p();
		}
		if ($par_sno_p.equalsIgnoreCase(name)) {
			return par_sno_p();
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
		if ($inpt_schd_dt_p.equalsIgnoreCase(name)) {
			inpt_schd_dt_p(
				((MCContainerMeta) inpt_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($inpt_act_dt_p.equalsIgnoreCase(name)) {
			inpt_act_dt_p(
				((MCContainerMeta) inpt_act_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($chd_itm_typ_p.equalsIgnoreCase(name)) {
			chd_itm_typ_p(
				((MCContainerMeta) chd_itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($chd_itm_p.equalsIgnoreCase(name)) {
			chd_itm_p(
				((MCContainerMeta) chd_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($par_itm_typ_p.equalsIgnoreCase(name)) {
			par_itm_typ_p(
				((MCContainerMeta) par_itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($par_itm_p.equalsIgnoreCase(name)) {
			par_itm_p(
				((MCContainerMeta) par_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($par_sno_p.equalsIgnoreCase(name)) {
			par_sno_p(
				((MCContainerMeta) par_sno_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($chd_itm_grp_p.equalsIgnoreCase(name)) {
			chd_itm_grp_p(
				((MCContainerMeta) chd_itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0250.ItmGrpR.class, value)
			);
			return;
		}
		if ($par_itm_grp_p.equalsIgnoreCase(name)) {
			par_itm_grp_p(
				((MCContainerMeta) par_itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0250.ItmGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Scheduled input date FROM 投入予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate inpt_schd_dt_fr() {
		return inpt_schd_dt_p().ymd_fr();
	}

	/**
	 * Scheduled input date FROM 投入予定日ＦＲＯＭ.<p>
	 *
	 */
	public void inpt_schd_dt_fr(MCDate value) {
		inpt_schd_dt_p().ymd_fr(value);
	}

	/**
	 * Input schedule time FROM 投入予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate inpt_schd_hm_fr() {
		return inpt_schd_dt_p().hm_fr();
	}

	/**
	 * Input schedule time FROM 投入予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void inpt_schd_hm_fr(MCDate value) {
		inpt_schd_dt_p().hm_fr(value);
	}

	/**
	 * Scheduled input date TO 投入予定日ＴＯ.<p>
	 *
	 */
	public MCDate inpt_schd_dt_to() {
		return inpt_schd_dt_p().ymd_to();
	}

	/**
	 * Scheduled input date TO 投入予定日ＴＯ.<p>
	 *
	 */
	public void inpt_schd_dt_to(MCDate value) {
		inpt_schd_dt_p().ymd_to(value);
	}

	/**
	 * Input schedule time TO 投入予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate inpt_schd_hm_to() {
		return inpt_schd_dt_p().hm_to();
	}

	/**
	 * Input schedule time TO 投入予定時刻ＴＯ.<p>
	 *
	 */
	public void inpt_schd_hm_to(MCDate value) {
		inpt_schd_dt_p().hm_to(value);
	}

	/**
	 * Actual input date FROM 投入実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate inpt_act_dt_fr() {
		return inpt_act_dt_p().ymd_fr();
	}

	/**
	 * Actual input date FROM 投入実績日ＦＲＯＭ.<p>
	 *
	 */
	public void inpt_act_dt_fr(MCDate value) {
		inpt_act_dt_p().ymd_fr(value);
	}

	/**
	 * Actual input time FROM 投入実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate inpt_act_hm_fr() {
		return inpt_act_dt_p().hm_fr();
	}

	/**
	 * Actual input time FROM 投入実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public void inpt_act_hm_fr(MCDate value) {
		inpt_act_dt_p().hm_fr(value);
	}

	/**
	 * Actual input date TO 投入実績日ＴＯ.<p>
	 *
	 */
	public MCDate inpt_act_dt_to() {
		return inpt_act_dt_p().ymd_to();
	}

	/**
	 * Actual input date TO 投入実績日ＴＯ.<p>
	 *
	 */
	public void inpt_act_dt_to(MCDate value) {
		inpt_act_dt_p().ymd_to(value);
	}

	/**
	 * Actual input time TO 投入実績時刻ＴＯ.<p>
	 *
	 */
	public MCDate inpt_act_hm_to() {
		return inpt_act_dt_p().hm_to();
	}

	/**
	 * Actual input time TO 投入実績時刻ＴＯ.<p>
	 *
	 */
	public void inpt_act_hm_to(MCDate value) {
		inpt_act_dt_p().hm_to(value);
	}

	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public String chd_itm_typ() {
		return chd_itm_typ_p().itm_typ();
	}

	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public void chd_itm_typ(String value) {
		chd_itm_typ_p().itm_typ(value);
	}

	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public String chd_itm_typ_nm() {
		return chd_itm_typ_p().itm_typ_nm();
	}

	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public void chd_itm_typ_nm(String value) {
		chd_itm_typ_p().itm_typ_nm(value);
	}

	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public String chd_itm_typ_d_cd() {
		return chd_itm_typ_p().itm_typ_d_cd();
	}

	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public void chd_itm_typ_d_cd(String value) {
		chd_itm_typ_p().itm_typ_d_cd(value);
	}

	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public String chd_itm_typ_d_nm() {
		return chd_itm_typ_p().itm_typ_d_nm();
	}

	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public void chd_itm_typ_d_nm(String value) {
		chd_itm_typ_p().itm_typ_d_nm(value);
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

	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public String par_itm_typ() {
		return par_itm_typ_p().itm_typ();
	}

	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public void par_itm_typ(String value) {
		par_itm_typ_p().itm_typ(value);
	}

	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public String par_itm_typ_nm() {
		return par_itm_typ_p().itm_typ_nm();
	}

	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public void par_itm_typ_nm(String value) {
		par_itm_typ_p().itm_typ_nm(value);
	}

	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public String par_itm_typ_d_cd() {
		return par_itm_typ_p().itm_typ_d_cd();
	}

	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public void par_itm_typ_d_cd(String value) {
		par_itm_typ_p().itm_typ_d_cd(value);
	}

	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public String par_itm_typ_d_nm() {
		return par_itm_typ_p().itm_typ_d_nm();
	}

	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public void par_itm_typ_d_nm(String value) {
		par_itm_typ_p().itm_typ_d_nm(value);
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

	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public String par_sno1() {
		return par_sno_p().sno1();
	}

	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public void par_sno1(String value) {
		par_sno_p().sno1(value);
	}

	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public String par_sno2() {
		return par_sno_p().sno2();
	}

	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public void par_sno2(String value) {
		par_sno_p().sno2(value);
	}

	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public String par_sno3() {
		return par_sno_p().sno3();
	}

	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public void par_sno3(String value) {
		par_sno_p().sno3(value);
	}

	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public String par_sno4() {
		return par_sno_p().sno4();
	}

	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public void par_sno4(String value) {
		par_sno_p().sno4(value);
	}

	public String wrk_no() {
		return par_sno_p().wrk_no();
	}

	public void wrk_no(String value) {
		par_sno_p().wrk_no(value);
	}

	public String wrk_nm() {
		return par_sno_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		par_sno_p().wrk_nm(value);
	}

	/**
	 * Child item classification 1 子品目分類１.<p>
	 *
	 */
	public boolean chd_itm_grp_flg1() {
		return chd_itm_grp_p().itm_grp_flg1();
	}

	/**
	 * Child item classification 1 子品目分類１.<p>
	 *
	 */
	public void chd_itm_grp_flg1(boolean value) {
		chd_itm_grp_p().itm_grp_flg1(value);
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
	 * Child item classification 2 子品目分類２.<p>
	 *
	 */
	public boolean chd_itm_grp_flg2() {
		return chd_itm_grp_p().itm_grp_flg2();
	}

	/**
	 * Child item classification 2 子品目分類２.<p>
	 *
	 */
	public void chd_itm_grp_flg2(boolean value) {
		chd_itm_grp_p().itm_grp_flg2(value);
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
	 * Child item classification 3 子品目分類３.<p>
	 *
	 */
	public boolean chd_itm_grp_flg3() {
		return chd_itm_grp_p().itm_grp_flg3();
	}

	/**
	 * Child item classification 3 子品目分類３.<p>
	 *
	 */
	public void chd_itm_grp_flg3(boolean value) {
		chd_itm_grp_p().itm_grp_flg3(value);
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
	 * Child item classification 4 子品目分類４.<p>
	 *
	 */
	public boolean chd_itm_grp_flg4() {
		return chd_itm_grp_p().itm_grp_flg4();
	}

	/**
	 * Child item classification 4 子品目分類４.<p>
	 *
	 */
	public void chd_itm_grp_flg4(boolean value) {
		chd_itm_grp_p().itm_grp_flg4(value);
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
	 * Child item classification 5 子品目分類５.<p>
	 *
	 */
	public boolean chd_itm_grp_flg5() {
		return chd_itm_grp_p().itm_grp_flg5();
	}

	/**
	 * Child item classification 5 子品目分類５.<p>
	 *
	 */
	public void chd_itm_grp_flg5(boolean value) {
		chd_itm_grp_p().itm_grp_flg5(value);
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
	 * Child item classification 6 子品目分類６.<p>
	 *
	 */
	public boolean chd_itm_grp_flg6() {
		return chd_itm_grp_p().itm_grp_flg6();
	}

	/**
	 * Child item classification 6 子品目分類６.<p>
	 *
	 */
	public void chd_itm_grp_flg6(boolean value) {
		chd_itm_grp_p().itm_grp_flg6(value);
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
	 * Child item classification 7 子品目分類７.<p>
	 *
	 */
	public boolean chd_itm_grp_flg7() {
		return chd_itm_grp_p().itm_grp_flg7();
	}

	/**
	 * Child item classification 7 子品目分類７.<p>
	 *
	 */
	public void chd_itm_grp_flg7(boolean value) {
		chd_itm_grp_p().itm_grp_flg7(value);
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
	 * Child item classification 8 子品目分類８.<p>
	 *
	 */
	public boolean chd_itm_grp_flg8() {
		return chd_itm_grp_p().itm_grp_flg8();
	}

	/**
	 * Child item classification 8 子品目分類８.<p>
	 *
	 */
	public void chd_itm_grp_flg8(boolean value) {
		chd_itm_grp_p().itm_grp_flg8(value);
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
	 * Child item classification 9 子品目分類９.<p>
	 *
	 */
	public boolean chd_itm_grp_flg9() {
		return chd_itm_grp_p().itm_grp_flg9();
	}

	/**
	 * Child item classification 9 子品目分類９.<p>
	 *
	 */
	public void chd_itm_grp_flg9(boolean value) {
		chd_itm_grp_p().itm_grp_flg9(value);
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
	 * Child item classification 10 子品目分類１０.<p>
	 *
	 */
	public boolean chd_itm_grp_flg10() {
		return chd_itm_grp_p().itm_grp_flg10();
	}

	/**
	 * Child item classification 10 子品目分類１０.<p>
	 *
	 */
	public void chd_itm_grp_flg10(boolean value) {
		chd_itm_grp_p().itm_grp_flg10(value);
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
	 * Parent item classification 1 親品目分類１.<p>
	 *
	 */
	public boolean par_itm_grp_flg1() {
		return par_itm_grp_p().itm_grp_flg1();
	}

	/**
	 * Parent item classification 1 親品目分類１.<p>
	 *
	 */
	public void par_itm_grp_flg1(boolean value) {
		par_itm_grp_p().itm_grp_flg1(value);
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
	 * Parent item classification 2 親品目分類２.<p>
	 *
	 */
	public boolean par_itm_grp_flg2() {
		return par_itm_grp_p().itm_grp_flg2();
	}

	/**
	 * Parent item classification 2 親品目分類２.<p>
	 *
	 */
	public void par_itm_grp_flg2(boolean value) {
		par_itm_grp_p().itm_grp_flg2(value);
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
	 * Parent item classification 3 親品目分類３.<p>
	 *
	 */
	public boolean par_itm_grp_flg3() {
		return par_itm_grp_p().itm_grp_flg3();
	}

	/**
	 * Parent item classification 3 親品目分類３.<p>
	 *
	 */
	public void par_itm_grp_flg3(boolean value) {
		par_itm_grp_p().itm_grp_flg3(value);
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
	 * Parent item classification 4 親品目分類４.<p>
	 *
	 */
	public boolean par_itm_grp_flg4() {
		return par_itm_grp_p().itm_grp_flg4();
	}

	/**
	 * Parent item classification 4 親品目分類４.<p>
	 *
	 */
	public void par_itm_grp_flg4(boolean value) {
		par_itm_grp_p().itm_grp_flg4(value);
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
	 * Parent item classification 5 親品目分類５.<p>
	 *
	 */
	public boolean par_itm_grp_flg5() {
		return par_itm_grp_p().itm_grp_flg5();
	}

	/**
	 * Parent item classification 5 親品目分類５.<p>
	 *
	 */
	public void par_itm_grp_flg5(boolean value) {
		par_itm_grp_p().itm_grp_flg5(value);
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
	 * Parent item classification 6 親品目分類６.<p>
	 *
	 */
	public boolean par_itm_grp_flg6() {
		return par_itm_grp_p().itm_grp_flg6();
	}

	/**
	 * Parent item classification 6 親品目分類６.<p>
	 *
	 */
	public void par_itm_grp_flg6(boolean value) {
		par_itm_grp_p().itm_grp_flg6(value);
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
	 * Parent item classification 7 親品目分類７.<p>
	 *
	 */
	public boolean par_itm_grp_flg7() {
		return par_itm_grp_p().itm_grp_flg7();
	}

	/**
	 * Parent item classification 7 親品目分類７.<p>
	 *
	 */
	public void par_itm_grp_flg7(boolean value) {
		par_itm_grp_p().itm_grp_flg7(value);
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
	 * Parent item classification 8 親品目分類８.<p>
	 *
	 */
	public boolean par_itm_grp_flg8() {
		return par_itm_grp_p().itm_grp_flg8();
	}

	/**
	 * Parent item classification 8 親品目分類８.<p>
	 *
	 */
	public void par_itm_grp_flg8(boolean value) {
		par_itm_grp_p().itm_grp_flg8(value);
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
	 * Parent item classification 9 親品目分類９.<p>
	 *
	 */
	public boolean par_itm_grp_flg9() {
		return par_itm_grp_p().itm_grp_flg9();
	}

	/**
	 * Parent item classification 9 親品目分類９.<p>
	 *
	 */
	public void par_itm_grp_flg9(boolean value) {
		par_itm_grp_p().itm_grp_flg9(value);
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
	 * Parent item classification 10 親品目分類１０.<p>
	 *
	 */
	public boolean par_itm_grp_flg10() {
		return par_itm_grp_p().itm_grp_flg10();
	}

	/**
	 * Parent item classification 10 親品目分類１０.<p>
	 *
	 */
	public void par_itm_grp_flg10(boolean value) {
		par_itm_grp_p().itm_grp_flg10(value);
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

