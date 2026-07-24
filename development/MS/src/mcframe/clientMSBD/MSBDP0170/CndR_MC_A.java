package mcframe.clientMSBD.MSBDP0170;

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
	 * PRNT,Issue report;SRCH_SCHD_REF,View return schedule;SRCH_ACT_REF,View return result; PRNT,帳票発行;SRCH_SCHD_REF,返品予定を参照する;SRCH_ACT_REF,返品実績を参照する;.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * SRCH_LST,Breakdown of details;SRCH_DTL,Details;SRCH_HDR,Header SRCH_LST,詳細;SRCH_DTL,明細;SRCH_HDR,ヘッダ.<p>
	 *
	 */
	public static final String $mode = "mode";
	/**
	 * Uncopied 未引継.<p>
	 *
	 */
	public static final String $not_transt_flg = "not_transt_flg";
	/**
	 * Partial copy 一部引継.<p>
	 *
	 */
	public static final String $part_transt_flg = "part_transt_flg";
	/**
	 * Copy all 全引継.<p>
	 *
	 */
	public static final String $all_transt_flg = "all_transt_flg";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $sret_abort_flg = "sret_abort_flg";
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public static final String $not_issue_flg = "not_issue_flg";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $issue_flg = "issue_flg";
	/**
	 * Target 対象.<p>
	 *
	 */
	public static final String $iv_trgt_flg = "iv_trgt_flg";
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public static final String $iv_not_trgt_flg = "iv_not_trgt_flg";
	/**
	 * Purchase return date FROM 仕入返品日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $purc_ret_dt_fr = "purc_ret_dt_fr";
	/**
	 * Purchase return date TO 仕入返品日ＴＯ.<p>
	 *
	 */
	public static final String $purc_ret_dt_to = "purc_ret_dt_to";
	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ac_dt_fr = "ac_dt_fr";
	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public static final String $ac_dt_to = "ac_dt_to";
	/**
	 * Scheduled return date FROM 返品予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $schd_dt_fr = "schd_dt_fr";
	/**
	 * Scheduled return date TO 返品予定日ＴＯ.<p>
	 *
	 */
	public static final String $schd_dt_to = "schd_dt_to";
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
	 * Return-to name 返品先名.<p>
	 *
	 */
	public static final String $ret_sppl_nm = "ret_sppl_nm";
	/**
	 * Location WG cd. 場所ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $loc_wg_cd = "loc_wg_cd";
	/**
	 * Location WG name 場所ワーキンググループ名.<p>
	 *
	 */
	public static final String $loc_wg_nm = "loc_wg_nm";
	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public static final String $purc_ret_loc_cd = "purc_ret_loc_cd";
	/**
	 * Return-from location name 返品元場所名.<p>
	 *
	 */
	public static final String $purc_ret_loc_nm = "purc_ret_loc_nm";
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	public static final String $itm_typ_p = "itm_typ_p";
	public static final String $itm_p = "itm_p";
	public static final String $ver_no_p = "ver_no_p";
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
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
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
	public static final String $sno_p = "sno_p";
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_cd = "purc_dpt_cd";
	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public static final String $purc_dpt_nm = "purc_dpt_nm";
	/**
	 * Purchasing dept. WG cd. 購買部門ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_wg_cd = "purc_dpt_wg_cd";
	/**
	 * Purchasing dept. WG name 購買部門ワーキンググループ名.<p>
	 *
	 */
	public static final String $purc_dpt_wg_nm = "purc_dpt_wg_nm";
	/**
	 * Purchasing PIC 購買担当者.<p>
	 *
	 */
	public static final String $purc_usr_cd = "purc_usr_cd";
	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public static final String $purc_usr_nm = "purc_usr_nm";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public static final String $ap_dpt_nm = "ap_dpt_nm";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * Purchase return result No. 仕入返品実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_ret_act_no = "purc_ret_act_no";
	/**
	 * Purchase return result details No. 仕入返品実績明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_ret_act_d_no = "purc_ret_act_d_no";
	/**
	 * Purchase return schedule No. 仕入返品予定ＮＯ.<p>
	 *
	 */
	public static final String $purc_ret_schd_no = "purc_ret_schd_no";
	/**
	 * Purchase return schedule details No. 仕入返品予定明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_ret_schd_d_no = "purc_ret_schd_d_no";
	/**
	 * Maker メーカ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Return slip remarks 返品票備考.<p>
	 *
	 */
	public static final String $purc_ret_print_rmrks = "purc_ret_print_rmrks";
	/**
	 * Return slip note details remarks 返品票明細備考.<p>
	 *
	 */
	public static final String $purc_ret_print_d_rmrks = "purc_ret_print_d_rmrks";
	/**
	 * Return schedule transaction remarks 返品予定取引備考.<p>
	 *
	 */
	public static final String $schd_trd_rmrks = "schd_trd_rmrks";
	/**
	 * Return schedule transaction details remarks 返品予定取引明細備考.<p>
	 *
	 */
	public static final String $schd_trd_d_rmrks = "schd_trd_d_rmrks";
	/**
	 * Return schedule internal remarks 返品予定内部備考.<p>
	 *
	 */
	public static final String $schd_intr_rmrks = "schd_intr_rmrks";
	/**
	 * Return schedule internal details remarks 返品予定内部明細備考.<p>
	 *
	 */
	public static final String $schd_intr_d_rmrks = "schd_intr_d_rmrks";
	/**
	 * Return result transaction remarks 返品実績取引備考.<p>
	 *
	 */
	public static final String $act_trd_rmrks = "act_trd_rmrks";
	/**
	 * Return result transaction details remarks 返品実績取引明細備考.<p>
	 *
	 */
	public static final String $act_trd_d_rmrks = "act_trd_d_rmrks";
	/**
	 * Return result internal remarks 返品実績内部備考.<p>
	 *
	 */
	public static final String $act_intr_rmrks = "act_intr_rmrks";
	/**
	 * Return result internal details remarks 返品実績内部明細備考.<p>
	 *
	 */
	public static final String $act_intr_d_rmrks = "act_intr_d_rmrks";
	/**
	 * Return schedule spare 1 返品予定予備１.<p>
	 *
	 */
	public static final String $schd_sub_char1 = "schd_sub_char1";
	/**
	 * Return schedule spare 2 返品予定予備２.<p>
	 *
	 */
	public static final String $schd_sub_char2 = "schd_sub_char2";
	/**
	 * Return schedule spare 3 返品予定予備３.<p>
	 *
	 */
	public static final String $schd_sub_char3 = "schd_sub_char3";
	/**
	 * Return schedule details spare 1 返品予定明細予備１.<p>
	 *
	 */
	public static final String $schd_d_sub_char1 = "schd_d_sub_char1";
	/**
	 * Return schedule details spare 2 返品予定明細予備２.<p>
	 *
	 */
	public static final String $schd_d_sub_char2 = "schd_d_sub_char2";
	/**
	 * Return schedule details spare 3 返品予定明細予備３.<p>
	 *
	 */
	public static final String $schd_d_sub_char3 = "schd_d_sub_char3";
	/**
	 * Return schedule GR/GI spare 1 返品予定受払予備１.<p>
	 *
	 */
	public static final String $schd_io_sub_char1 = "schd_io_sub_char1";
	/**
	 * Return schedule GR/GI spare 2 返品予定受払予備２.<p>
	 *
	 */
	public static final String $schd_io_sub_char2 = "schd_io_sub_char2";
	/**
	 * Return schedule GR/GI spare 3 返品予定受払予備３.<p>
	 *
	 */
	public static final String $schd_io_sub_char3 = "schd_io_sub_char3";
	/**
	 * Return result spare 1 返品実績予備１.<p>
	 *
	 */
	public static final String $act_sub_char1 = "act_sub_char1";
	/**
	 * Return result spare 2 返品実績予備２.<p>
	 *
	 */
	public static final String $act_sub_char2 = "act_sub_char2";
	/**
	 * Return result spare 3 返品実績予備３.<p>
	 *
	 */
	public static final String $act_sub_char3 = "act_sub_char3";
	/**
	 * Return result details spare 1 返品実績明細予備１.<p>
	 *
	 */
	public static final String $act_d_sub_char1 = "act_d_sub_char1";
	/**
	 * Return result details spare 2 返品実績明細予備２.<p>
	 *
	 */
	public static final String $act_d_sub_char2 = "act_d_sub_char2";
	/**
	 * Return result details spare 3 返品実績明細予備３.<p>
	 *
	 */
	public static final String $act_d_sub_char3 = "act_d_sub_char3";
	/**
	 * Return result GR/GI spare 1 返品実績受払予備１.<p>
	 *
	 */
	public static final String $act_io_sub_char1 = "act_io_sub_char1";
	/**
	 * Return result GR/GI spare 2 返品実績受払予備２.<p>
	 *
	 */
	public static final String $act_io_sub_char2 = "act_io_sub_char2";
	/**
	 * Return result GR/GI spare 3 返品実績受払予備３.<p>
	 *
	 */
	public static final String $act_io_sub_char3 = "act_io_sub_char3";
	/**
	 * Include discount for return 返品目的の値引含む.<p>
	 *
	 */
	public static final String $inc_ret_dscnt_flg = "inc_ret_dscnt_flg";
	/**
	 * Include cancelled 取消済含む.<p>
	 *
	 */
	public static final String $inc_can_flg = "inc_can_flg";
	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public static final String $inc_past_flg = "inc_past_flg";
	public static final String $sppl_grp_p = "sppl_grp_p";
	public static final String $itm_grp_p = "itm_grp_p";

	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4 = $sno_p + ".sno4";
	public static final String $wrk_no = $sno_p + ".wrk_no";
	public static final String $wrk_nm = $sno_p + ".wrk_nm";
	public static final String $sppl_grp_lab1 = $sppl_grp_p + ".bp_grp_lab1";
	public static final String $sppl_grp_flg1 = $sppl_grp_p + ".bp_grp_flg1";
	public static final String $sppl_grp_cd1 = $sppl_grp_p + ".bp_grp_cd1";
	public static final String $sppl_grp_nm1 = $sppl_grp_p + ".bp_grp_nm1";
	public static final String $sppl_grp_lab2 = $sppl_grp_p + ".bp_grp_lab2";
	public static final String $sppl_grp_flg2 = $sppl_grp_p + ".bp_grp_flg2";
	public static final String $sppl_grp_cd2 = $sppl_grp_p + ".bp_grp_cd2";
	public static final String $sppl_grp_nm2 = $sppl_grp_p + ".bp_grp_nm2";
	public static final String $sppl_grp_lab3 = $sppl_grp_p + ".bp_grp_lab3";
	public static final String $sppl_grp_flg3 = $sppl_grp_p + ".bp_grp_flg3";
	public static final String $sppl_grp_cd3 = $sppl_grp_p + ".bp_grp_cd3";
	public static final String $sppl_grp_nm3 = $sppl_grp_p + ".bp_grp_nm3";
	public static final String $sppl_grp_lab4 = $sppl_grp_p + ".bp_grp_lab4";
	public static final String $sppl_grp_flg4 = $sppl_grp_p + ".bp_grp_flg4";
	public static final String $sppl_grp_cd4 = $sppl_grp_p + ".bp_grp_cd4";
	public static final String $sppl_grp_nm4 = $sppl_grp_p + ".bp_grp_nm4";
	public static final String $sppl_grp_lab5 = $sppl_grp_p + ".bp_grp_lab5";
	public static final String $sppl_grp_flg5 = $sppl_grp_p + ".bp_grp_flg5";
	public static final String $sppl_grp_cd5 = $sppl_grp_p + ".bp_grp_cd5";
	public static final String $sppl_grp_nm5 = $sppl_grp_p + ".bp_grp_nm5";
	public static final String $sppl_grp_lab6 = $sppl_grp_p + ".bp_grp_lab6";
	public static final String $sppl_grp_flg6 = $sppl_grp_p + ".bp_grp_flg6";
	public static final String $sppl_grp_cd6 = $sppl_grp_p + ".bp_grp_cd6";
	public static final String $sppl_grp_nm6 = $sppl_grp_p + ".bp_grp_nm6";
	public static final String $sppl_grp_lab7 = $sppl_grp_p + ".bp_grp_lab7";
	public static final String $sppl_grp_flg7 = $sppl_grp_p + ".bp_grp_flg7";
	public static final String $sppl_grp_cd7 = $sppl_grp_p + ".bp_grp_cd7";
	public static final String $sppl_grp_nm7 = $sppl_grp_p + ".bp_grp_nm7";
	public static final String $sppl_grp_lab8 = $sppl_grp_p + ".bp_grp_lab8";
	public static final String $sppl_grp_flg8 = $sppl_grp_p + ".bp_grp_flg8";
	public static final String $sppl_grp_cd8 = $sppl_grp_p + ".bp_grp_cd8";
	public static final String $sppl_grp_nm8 = $sppl_grp_p + ".bp_grp_nm8";
	public static final String $sppl_grp_lab9 = $sppl_grp_p + ".bp_grp_lab9";
	public static final String $sppl_grp_flg9 = $sppl_grp_p + ".bp_grp_flg9";
	public static final String $sppl_grp_cd9 = $sppl_grp_p + ".bp_grp_cd9";
	public static final String $sppl_grp_nm9 = $sppl_grp_p + ".bp_grp_nm9";
	public static final String $sppl_grp_lab10 = $sppl_grp_p + ".bp_grp_lab10";
	public static final String $sppl_grp_flg10 = $sppl_grp_p + ".bp_grp_flg10";
	public static final String $sppl_grp_cd10 = $sppl_grp_p + ".bp_grp_cd10";
	public static final String $sppl_grp_nm10 = $sppl_grp_p + ".bp_grp_nm10";
	public static final String $itm_grp_lab1 = $itm_grp_p + ".itm_grp_lab1";
	public static final String $itm_grp_flg1 = $itm_grp_p + ".itm_grp_flg1";
	public static final String $itm_grp_cd1 = $itm_grp_p + ".itm_grp_cd1";
	public static final String $itm_grp_nm1 = $itm_grp_p + ".itm_grp_nm1";
	public static final String $itm_grp_lab2 = $itm_grp_p + ".itm_grp_lab2";
	public static final String $itm_grp_flg2 = $itm_grp_p + ".itm_grp_flg2";
	public static final String $itm_grp_cd2 = $itm_grp_p + ".itm_grp_cd2";
	public static final String $itm_grp_nm2 = $itm_grp_p + ".itm_grp_nm2";
	public static final String $itm_grp_lab3 = $itm_grp_p + ".itm_grp_lab3";
	public static final String $itm_grp_flg3 = $itm_grp_p + ".itm_grp_flg3";
	public static final String $itm_grp_cd3 = $itm_grp_p + ".itm_grp_cd3";
	public static final String $itm_grp_nm3 = $itm_grp_p + ".itm_grp_nm3";
	public static final String $itm_grp_lab4 = $itm_grp_p + ".itm_grp_lab4";
	public static final String $itm_grp_flg4 = $itm_grp_p + ".itm_grp_flg4";
	public static final String $itm_grp_cd4 = $itm_grp_p + ".itm_grp_cd4";
	public static final String $itm_grp_nm4 = $itm_grp_p + ".itm_grp_nm4";
	public static final String $itm_grp_lab5 = $itm_grp_p + ".itm_grp_lab5";
	public static final String $itm_grp_flg5 = $itm_grp_p + ".itm_grp_flg5";
	public static final String $itm_grp_cd5 = $itm_grp_p + ".itm_grp_cd5";
	public static final String $itm_grp_nm5 = $itm_grp_p + ".itm_grp_nm5";
	public static final String $itm_grp_lab6 = $itm_grp_p + ".itm_grp_lab6";
	public static final String $itm_grp_flg6 = $itm_grp_p + ".itm_grp_flg6";
	public static final String $itm_grp_cd6 = $itm_grp_p + ".itm_grp_cd6";
	public static final String $itm_grp_nm6 = $itm_grp_p + ".itm_grp_nm6";
	public static final String $itm_grp_lab7 = $itm_grp_p + ".itm_grp_lab7";
	public static final String $itm_grp_flg7 = $itm_grp_p + ".itm_grp_flg7";
	public static final String $itm_grp_cd7 = $itm_grp_p + ".itm_grp_cd7";
	public static final String $itm_grp_nm7 = $itm_grp_p + ".itm_grp_nm7";
	public static final String $itm_grp_lab8 = $itm_grp_p + ".itm_grp_lab8";
	public static final String $itm_grp_flg8 = $itm_grp_p + ".itm_grp_flg8";
	public static final String $itm_grp_cd8 = $itm_grp_p + ".itm_grp_cd8";
	public static final String $itm_grp_nm8 = $itm_grp_p + ".itm_grp_nm8";
	public static final String $itm_grp_lab9 = $itm_grp_p + ".itm_grp_lab9";
	public static final String $itm_grp_flg9 = $itm_grp_p + ".itm_grp_flg9";
	public static final String $itm_grp_cd9 = $itm_grp_p + ".itm_grp_cd9";
	public static final String $itm_grp_nm9 = $itm_grp_p + ".itm_grp_nm9";
	public static final String $itm_grp_lab10 = $itm_grp_p + ".itm_grp_lab10";
	public static final String $itm_grp_flg10 = $itm_grp_p + ".itm_grp_flg10";
	public static final String $itm_grp_cd10 = $itm_grp_p + ".itm_grp_cd10";
	public static final String $itm_grp_nm10 = $itm_grp_p + ".itm_grp_nm10";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta mode_META = createStringMeta($mode);
	public static final MCMeta not_transt_flg_META = createCommonMeta($not_transt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta part_transt_flg_META = createCommonMeta($part_transt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta all_transt_flg_META = createCommonMeta($all_transt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sret_abort_flg_META = createCommonMeta($sret_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_issue_flg_META = createCommonMeta($not_issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta issue_flg_META = createCommonMeta($issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_trgt_flg_META = createCommonMeta($iv_trgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_not_trgt_flg_META = createCommonMeta($iv_not_trgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_ret_dt_fr_META = createCommonMeta($purc_ret_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_ret_dt_to_META = createCommonMeta($purc_ret_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_fr_META = createCommonMeta($ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_to_META = createCommonMeta($ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta schd_dt_fr_META = createCommonMeta($schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta schd_dt_to_META = createCommonMeta($schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ret_sppl_nm_META = createCommonMeta($ret_sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta loc_wg_cd_META = createCommonMeta($loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta loc_wg_nm_META = createCommonMeta($loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta purc_ret_loc_cd_META = createCommonMeta($purc_ret_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta purc_ret_loc_nm_META = createCommonMeta($purc_ret_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP0340.VerNoR.class);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class);
	public static final MCMeta purc_dpt_cd_META = createCommonMeta($purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta purc_dpt_nm_META = createCommonMeta($purc_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta purc_dpt_wg_cd_META = createCommonMeta($purc_dpt_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta purc_dpt_wg_nm_META = createCommonMeta($purc_dpt_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta purc_usr_cd_META = createCommonMeta($purc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta purc_usr_nm_META = createCommonMeta($purc_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta purc_ret_act_no_META = createCommonMeta($purc_ret_act_no, mcframe.commonMA.meta.MA_META.PURC_RET_ACT_NO);
	public static final MCMeta purc_ret_act_d_no_META = createCommonMeta($purc_ret_act_d_no, mcframe.commonMA.meta.MA_META.PURC_RET_ACT_D_NO);
	public static final MCMeta purc_ret_schd_no_META = createCommonMeta($purc_ret_schd_no, mcframe.commonMA.meta.MA_META.PURC_RET_SCHD_NO);
	public static final MCMeta purc_ret_schd_d_no_META = createCommonMeta($purc_ret_schd_d_no, mcframe.commonMA.meta.MA_META.PURC_RET_SCHD_D_NO);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta purc_ret_print_rmrks_META = createCommonMeta($purc_ret_print_rmrks, mcframe.commonMS.meta.MS_META.PURC_RET_PRINT_RMRKS);
	public static final MCMeta purc_ret_print_d_rmrks_META = createCommonMeta($purc_ret_print_d_rmrks, mcframe.commonMS.meta.MS_META.PURC_RET_PRINT_D_RMRKS);
	public static final MCMeta schd_trd_rmrks_META = createCommonMeta($schd_trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta schd_trd_d_rmrks_META = createCommonMeta($schd_trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta schd_intr_rmrks_META = createCommonMeta($schd_intr_rmrks, mcframe.commonMS.meta.MS_META.PURC_RET_SCHD_INTR_RMRKS);
	public static final MCMeta schd_intr_d_rmrks_META = createCommonMeta($schd_intr_d_rmrks, mcframe.commonMS.meta.MS_META.PURC_RET_SCHD_D_INTR_RMRKS);
	public static final MCMeta act_trd_rmrks_META = createCommonMeta($act_trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta act_trd_d_rmrks_META = createCommonMeta($act_trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta act_intr_rmrks_META = createCommonMeta($act_intr_rmrks, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_INTR_RMRKS);
	public static final MCMeta act_intr_d_rmrks_META = createCommonMeta($act_intr_d_rmrks, mcframe.commonMS.meta.MS_META.PURC_RET_PRINT_D_RMRKS);
	public static final MCMeta schd_sub_char1_META = createCommonMeta($schd_sub_char1, mcframe.commonMS.meta.MS_META.PURC_RET_SCHD_SUB_CHAR1);
	public static final MCMeta schd_sub_char2_META = createCommonMeta($schd_sub_char2, mcframe.commonMS.meta.MS_META.PURC_RET_SCHD_SUB_CHAR2);
	public static final MCMeta schd_sub_char3_META = createCommonMeta($schd_sub_char3, mcframe.commonMS.meta.MS_META.PURC_RET_SCHD_SUB_CHAR3);
	public static final MCMeta schd_d_sub_char1_META = createCommonMeta($schd_d_sub_char1, mcframe.commonMS.meta.MS_META.PURC_RET_SCHD_D_SUB_CHAR1);
	public static final MCMeta schd_d_sub_char2_META = createCommonMeta($schd_d_sub_char2, mcframe.commonMS.meta.MS_META.PURC_RET_SCHD_D_SUB_CHAR2);
	public static final MCMeta schd_d_sub_char3_META = createCommonMeta($schd_d_sub_char3, mcframe.commonMS.meta.MS_META.PURC_RET_SCHD_D_SUB_CHAR3);
	public static final MCMeta schd_io_sub_char1_META = createCommonMeta($schd_io_sub_char1, mcframe.commonMS.meta.MS_META.PURC_RET_SCHD_IO_SUB_CHAR1);
	public static final MCMeta schd_io_sub_char2_META = createCommonMeta($schd_io_sub_char2, mcframe.commonMS.meta.MS_META.PURC_RET_SCHD_IO_SUB_CHAR2);
	public static final MCMeta schd_io_sub_char3_META = createCommonMeta($schd_io_sub_char3, mcframe.commonMS.meta.MS_META.PURC_RET_SCHD_IO_SUB_CHAR3);
	public static final MCMeta act_sub_char1_META = createCommonMeta($act_sub_char1, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_SUB_CHAR1);
	public static final MCMeta act_sub_char2_META = createCommonMeta($act_sub_char2, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_SUB_CHAR2);
	public static final MCMeta act_sub_char3_META = createCommonMeta($act_sub_char3, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_SUB_CHAR3);
	public static final MCMeta act_d_sub_char1_META = createCommonMeta($act_d_sub_char1, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_D_SUB_CHAR1);
	public static final MCMeta act_d_sub_char2_META = createCommonMeta($act_d_sub_char2, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_D_SUB_CHAR2);
	public static final MCMeta act_d_sub_char3_META = createCommonMeta($act_d_sub_char3, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_D_SUB_CHAR3);
	public static final MCMeta act_io_sub_char1_META = createCommonMeta($act_io_sub_char1, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_IO_SUB_CHAR1);
	public static final MCMeta act_io_sub_char2_META = createCommonMeta($act_io_sub_char2, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_IO_SUB_CHAR2);
	public static final MCMeta act_io_sub_char3_META = createCommonMeta($act_io_sub_char3, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_IO_SUB_CHAR3);
	public static final MCMeta inc_ret_dscnt_flg_META = createCommonMeta($inc_ret_dscnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_can_flg_META = createCommonMeta($inc_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_past_flg_META = createCommonMeta($inc_past_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_p_META = createInnerRowMeta($sppl_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			mode_META,
			not_transt_flg_META,
			part_transt_flg_META,
			all_transt_flg_META,
			sret_abort_flg_META,
			not_issue_flg_META,
			issue_flg_META,
			iv_trgt_flg_META,
			iv_not_trgt_flg_META,
			purc_ret_dt_fr_META,
			purc_ret_dt_to_META,
			ac_dt_fr_META,
			ac_dt_to_META,
			schd_dt_fr_META,
			schd_dt_to_META,
			site_cd_META,
			site_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			ret_sppl_nm_META,
			loc_wg_cd_META,
			loc_wg_nm_META,
			purc_ret_loc_cd_META,
			purc_ret_loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			itm_typ_p_META,
			itm_p_META,
			ver_no_p_META,
			lot_no_META,
			sublot_no_META,
			iv_itm_nm_META,
			iv_no_META,
			gd_cd_META,
			gd_nm_META,
			sno_p_META,
			purc_dpt_cd_META,
			purc_dpt_nm_META,
			purc_dpt_wg_cd_META,
			purc_dpt_wg_nm_META,
			purc_usr_cd_META,
			purc_usr_nm_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			po_no_META,
			purc_ret_act_no_META,
			purc_ret_act_d_no_META,
			purc_ret_schd_no_META,
			purc_ret_schd_d_no_META,
			maker_cd_META,
			maker_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			purc_ret_print_rmrks_META,
			purc_ret_print_d_rmrks_META,
			schd_trd_rmrks_META,
			schd_trd_d_rmrks_META,
			schd_intr_rmrks_META,
			schd_intr_d_rmrks_META,
			act_trd_rmrks_META,
			act_trd_d_rmrks_META,
			act_intr_rmrks_META,
			act_intr_d_rmrks_META,
			schd_sub_char1_META,
			schd_sub_char2_META,
			schd_sub_char3_META,
			schd_d_sub_char1_META,
			schd_d_sub_char2_META,
			schd_d_sub_char3_META,
			schd_io_sub_char1_META,
			schd_io_sub_char2_META,
			schd_io_sub_char3_META,
			act_sub_char1_META,
			act_sub_char2_META,
			act_sub_char3_META,
			act_d_sub_char1_META,
			act_d_sub_char2_META,
			act_d_sub_char3_META,
			act_io_sub_char1_META,
			act_io_sub_char2_META,
			act_io_sub_char3_META,
			inc_ret_dscnt_flg_META,
			inc_can_flg_META,
			inc_past_flg_META,
			sppl_grp_p_META,
			itm_grp_p_META
		},
		new String[][]{
			{
				"itm_typ",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"ver_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"sppl_grp_flg1",
				"sppl_grp_cd1",
				"sppl_grp_nm1",
				"sppl_grp_flg2",
				"sppl_grp_cd2",
				"sppl_grp_nm2",
				"sppl_grp_flg3",
				"sppl_grp_cd3",
				"sppl_grp_nm3",
				"sppl_grp_flg4",
				"sppl_grp_cd4",
				"sppl_grp_nm4",
				"sppl_grp_flg5",
				"sppl_grp_cd5",
				"sppl_grp_nm5",
				"sppl_grp_flg6",
				"sppl_grp_cd6",
				"sppl_grp_nm6",
				"sppl_grp_flg7",
				"sppl_grp_cd7",
				"sppl_grp_nm7",
				"sppl_grp_flg8",
				"sppl_grp_cd8",
				"sppl_grp_nm8",
				"sppl_grp_flg9",
				"sppl_grp_cd9",
				"sppl_grp_nm9",
				"sppl_grp_flg10",
				"sppl_grp_cd10",
				"sppl_grp_nm10",
				"itm_grp_flg1",
				"itm_grp_cd1",
				"itm_grp_nm1",
				"itm_grp_flg2",
				"itm_grp_cd2",
				"itm_grp_nm2",
				"itm_grp_flg3",
				"itm_grp_cd3",
				"itm_grp_nm3",
				"itm_grp_flg4",
				"itm_grp_cd4",
				"itm_grp_nm4",
				"itm_grp_flg5",
				"itm_grp_cd5",
				"itm_grp_nm5",
				"itm_grp_flg6",
				"itm_grp_cd6",
				"itm_grp_nm6",
				"itm_grp_flg7",
				"itm_grp_cd7",
				"itm_grp_nm7",
				"itm_grp_flg8",
				"itm_grp_cd8",
				"itm_grp_nm8",
				"itm_grp_flg9",
				"itm_grp_cd9",
				"itm_grp_nm9",
				"itm_grp_flg10",
				"itm_grp_cd10",
				"itm_grp_nm10"
			},
			{
				$itm_typ,
				$itm_typ_d_cd,
				$itm_typ_d_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$ver_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$sppl_grp_flg1,
				$sppl_grp_cd1,
				$sppl_grp_nm1,
				$sppl_grp_flg2,
				$sppl_grp_cd2,
				$sppl_grp_nm2,
				$sppl_grp_flg3,
				$sppl_grp_cd3,
				$sppl_grp_nm3,
				$sppl_grp_flg4,
				$sppl_grp_cd4,
				$sppl_grp_nm4,
				$sppl_grp_flg5,
				$sppl_grp_cd5,
				$sppl_grp_nm5,
				$sppl_grp_flg6,
				$sppl_grp_cd6,
				$sppl_grp_nm6,
				$sppl_grp_flg7,
				$sppl_grp_cd7,
				$sppl_grp_nm7,
				$sppl_grp_flg8,
				$sppl_grp_cd8,
				$sppl_grp_nm8,
				$sppl_grp_flg9,
				$sppl_grp_cd9,
				$sppl_grp_nm9,
				$sppl_grp_flg10,
				$sppl_grp_cd10,
				$sppl_grp_nm10,
				$itm_grp_flg1,
				$itm_grp_cd1,
				$itm_grp_nm1,
				$itm_grp_flg2,
				$itm_grp_cd2,
				$itm_grp_nm2,
				$itm_grp_flg3,
				$itm_grp_cd3,
				$itm_grp_nm3,
				$itm_grp_flg4,
				$itm_grp_cd4,
				$itm_grp_nm4,
				$itm_grp_flg5,
				$itm_grp_cd5,
				$itm_grp_nm5,
				$itm_grp_flg6,
				$itm_grp_cd6,
				$itm_grp_nm6,
				$itm_grp_flg7,
				$itm_grp_cd7,
				$itm_grp_nm7,
				$itm_grp_flg8,
				$itm_grp_cd8,
				$itm_grp_nm8,
				$itm_grp_flg9,
				$itm_grp_cd9,
				$itm_grp_nm9,
				$itm_grp_flg10,
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
				{$sppl_cd, "bp_nm"},	// sppl_cd
				{$loc_wg_cd, "wg_nm"},	// loc_wg_cd
				{$purc_ret_loc_cd, "loc_nm"},	// purc_ret_loc_cd
				{$str_ln_cd, "str_ln_nm"},	// str_ln_cd
				{$purc_dpt_cd, "dpt_nm"},	// purc_dpt_cd
				{$purc_dpt_wg_cd, "wg_nm"},	// purc_dpt_wg_cd
				{$purc_usr_cd, "usr_nm"},	// purc_usr_cd
				{$ap_dpt_cd, "dpt_nm"},	// ap_dpt_cd
				{$maker_cd, "bp_nm"},	// maker_cd
				{$trd_cur_cd, "cur_nm"}	// trd_cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// sppl_cd
				{$str_ln_cd, "purc_ret_loc_cd;true"},	// str_ln_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;true"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;true"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2;true"},	// itm_p.itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$purc_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.PURC"},	// purc_dpt_cd
				{$ap_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.AP"},	// ap_dpt_cd
				{$maker_cd, "MAC_BP_IS_SRCH_TYP.MAKER"}	// maker_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$sppl_cd, "bp_is_srch_typ"},	// sppl_cd
				{$str_ln_cd, "loc_cd;mode_nullval_flg"},	// str_ln_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ;sundry_itm_nm_rem_flg"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$purc_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"},	// purc_dpt_cd
				{$ap_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"},	// ap_dpt_cd
				{$maker_cd, "bp_is_srch_typ"}	// maker_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$loc_wg_cd, "WG"},	// loc_wg_cd
				{$loc_wg_nm, "WG"},	// loc_wg_nm
				{$str_ln_cd, "STR_LN"},	// str_ln_cd
				{$str_ln_nm, "STR_LN"},	// str_ln_nm
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"},	// gd_nm
				{$purc_dpt_wg_cd, "WG"},	// purc_dpt_wg_cd
				{$purc_dpt_wg_nm, "WG"},	// purc_dpt_wg_nm
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
	 * PRNT,Issue report;SRCH_SCHD_REF,View return schedule;SRCH_ACT_REF,View return result; PRNT,帳票発行;SRCH_SCHD_REF,返品予定を参照する;SRCH_ACT_REF,返品実績を参照する;.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * PRNT,Issue report;SRCH_SCHD_REF,View return schedule;SRCH_ACT_REF,View return result; PRNT,帳票発行;SRCH_SCHD_REF,返品予定を参照する;SRCH_ACT_REF,返品実績を参照する;.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * SRCH_LST,Breakdown of details;SRCH_DTL,Details;SRCH_HDR,Header SRCH_LST,詳細;SRCH_DTL,明細;SRCH_HDR,ヘッダ.<p>
	 *
	 */
	public String mode() {
		return getConstString(offset + 1, $mode);
	}

	/**
	 * SRCH_LST,Breakdown of details;SRCH_DTL,Details;SRCH_HDR,Header SRCH_LST,詳細;SRCH_DTL,明細;SRCH_HDR,ヘッダ.<p>
	 *
	 */
	public void mode(String value) {
		setConstString(offset + 1, $mode, value);
	}


	/**
	 * Uncopied 未引継.<p>
	 *
	 */
	public boolean not_transt_flg() {
		return getConstBoolean(offset + 2, $not_transt_flg);
	}

	/**
	 * Uncopied 未引継.<p>
	 *
	 */
	public void not_transt_flg(boolean value) {
		setConstBoolean(offset + 2, $not_transt_flg, value);
	}


	/**
	 * Partial copy 一部引継.<p>
	 *
	 */
	public boolean part_transt_flg() {
		return getConstBoolean(offset + 3, $part_transt_flg);
	}

	/**
	 * Partial copy 一部引継.<p>
	 *
	 */
	public void part_transt_flg(boolean value) {
		setConstBoolean(offset + 3, $part_transt_flg, value);
	}


	/**
	 * Copy all 全引継.<p>
	 *
	 */
	public boolean all_transt_flg() {
		return getConstBoolean(offset + 4, $all_transt_flg);
	}

	/**
	 * Copy all 全引継.<p>
	 *
	 */
	public void all_transt_flg(boolean value) {
		setConstBoolean(offset + 4, $all_transt_flg, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean sret_abort_flg() {
		return getConstBoolean(offset + 5, $sret_abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void sret_abort_flg(boolean value) {
		setConstBoolean(offset + 5, $sret_abort_flg, value);
	}


	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public boolean not_issue_flg() {
		return getConstBoolean(offset + 6, $not_issue_flg);
	}

	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public void not_issue_flg(boolean value) {
		setConstBoolean(offset + 6, $not_issue_flg, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean issue_flg() {
		return getConstBoolean(offset + 7, $issue_flg);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void issue_flg(boolean value) {
		setConstBoolean(offset + 7, $issue_flg, value);
	}


	/**
	 * Target 対象.<p>
	 *
	 */
	public boolean iv_trgt_flg() {
		return getConstBoolean(offset + 8, $iv_trgt_flg);
	}

	/**
	 * Target 対象.<p>
	 *
	 */
	public void iv_trgt_flg(boolean value) {
		setConstBoolean(offset + 8, $iv_trgt_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean iv_not_trgt_flg() {
		return getConstBoolean(offset + 9, $iv_not_trgt_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void iv_not_trgt_flg(boolean value) {
		setConstBoolean(offset + 9, $iv_not_trgt_flg, value);
	}


	/**
	 * Purchase return date FROM 仕入返品日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate purc_ret_dt_fr() {
		return getConstDate(offset + 10, $purc_ret_dt_fr);
	}

	/**
	 * Purchase return date FROM 仕入返品日ＦＲＯＭ.<p>
	 *
	 */
	public void purc_ret_dt_fr(MCDate value) {
		setConstDate(offset + 10, $purc_ret_dt_fr, value);
	}


	/**
	 * Purchase return date TO 仕入返品日ＴＯ.<p>
	 *
	 */
	public MCDate purc_ret_dt_to() {
		return getConstDate(offset + 11, $purc_ret_dt_to);
	}

	/**
	 * Purchase return date TO 仕入返品日ＴＯ.<p>
	 *
	 */
	public void purc_ret_dt_to(MCDate value) {
		setConstDate(offset + 11, $purc_ret_dt_to, value);
	}


	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ac_dt_fr() {
		return getConstDate(offset + 12, $ac_dt_fr);
	}

	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public void ac_dt_fr(MCDate value) {
		setConstDate(offset + 12, $ac_dt_fr, value);
	}


	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public MCDate ac_dt_to() {
		return getConstDate(offset + 13, $ac_dt_to);
	}

	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public void ac_dt_to(MCDate value) {
		setConstDate(offset + 13, $ac_dt_to, value);
	}


	/**
	 * Scheduled return date FROM 返品予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate schd_dt_fr() {
		return getConstDate(offset + 14, $schd_dt_fr);
	}

	/**
	 * Scheduled return date FROM 返品予定日ＦＲＯＭ.<p>
	 *
	 */
	public void schd_dt_fr(MCDate value) {
		setConstDate(offset + 14, $schd_dt_fr, value);
	}


	/**
	 * Scheduled return date TO 返品予定日ＴＯ.<p>
	 *
	 */
	public MCDate schd_dt_to() {
		return getConstDate(offset + 15, $schd_dt_to);
	}

	/**
	 * Scheduled return date TO 返品予定日ＴＯ.<p>
	 *
	 */
	public void schd_dt_to(MCDate value) {
		setConstDate(offset + 15, $schd_dt_to, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 16, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 16, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 17, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 17, $site_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 18, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 18, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 19, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 19, $sppl_nm, value);
	}


	/**
	 * Return-to name 返品先名.<p>
	 *
	 */
	public String ret_sppl_nm() {
		return getConstString(offset + 20, $ret_sppl_nm);
	}

	/**
	 * Return-to name 返品先名.<p>
	 *
	 */
	public void ret_sppl_nm(String value) {
		setConstString(offset + 20, $ret_sppl_nm, value);
	}


	/**
	 * Location WG cd. 場所ワーキンググループＣＤ.<p>
	 *
	 */
	public String loc_wg_cd() {
		return getConstString(offset + 21, $loc_wg_cd);
	}

	/**
	 * Location WG cd. 場所ワーキンググループＣＤ.<p>
	 *
	 */
	public void loc_wg_cd(String value) {
		setConstString(offset + 21, $loc_wg_cd, value);
	}


	/**
	 * Location WG name 場所ワーキンググループ名.<p>
	 *
	 */
	public String loc_wg_nm() {
		return getConstString(offset + 22, $loc_wg_nm);
	}

	/**
	 * Location WG name 場所ワーキンググループ名.<p>
	 *
	 */
	public void loc_wg_nm(String value) {
		setConstString(offset + 22, $loc_wg_nm, value);
	}


	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public String purc_ret_loc_cd() {
		return getConstString(offset + 23, $purc_ret_loc_cd);
	}

	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public void purc_ret_loc_cd(String value) {
		setConstString(offset + 23, $purc_ret_loc_cd, value);
	}


	/**
	 * Return-from location name 返品元場所名.<p>
	 *
	 */
	public String purc_ret_loc_nm() {
		return getConstString(offset + 24, $purc_ret_loc_nm);
	}

	/**
	 * Return-from location name 返品元場所名.<p>
	 *
	 */
	public void purc_ret_loc_nm(String value) {
		setConstString(offset + 24, $purc_ret_loc_nm, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 25, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 25, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 26, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 26, $str_ln_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 27, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 27, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 28, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 28, $itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0340.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP0340.VerNoR) getConstInnerRow(offset + 29, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP0340.VerNoR row){
		setConstInnerRow(offset + 29, $ver_no_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 30, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 30, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 31, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 31, $sublot_no, value);
	}


	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 32, $iv_itm_nm);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 32, $iv_itm_nm, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 33, $iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 33, $iv_no, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 34, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 34, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 35, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 35, $gd_nm, value);
	}


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR sno_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 36, $sno_p);
	}
	
	public void sno_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 36, $sno_p, row);
	}


	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return getConstString(offset + 37, $purc_dpt_cd);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		setConstString(offset + 37, $purc_dpt_cd, value);
	}


	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public String purc_dpt_nm() {
		return getConstString(offset + 38, $purc_dpt_nm);
	}

	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public void purc_dpt_nm(String value) {
		setConstString(offset + 38, $purc_dpt_nm, value);
	}


	/**
	 * Purchasing dept. WG cd. 購買部門ワーキンググループＣＤ.<p>
	 *
	 */
	public String purc_dpt_wg_cd() {
		return getConstString(offset + 39, $purc_dpt_wg_cd);
	}

	/**
	 * Purchasing dept. WG cd. 購買部門ワーキンググループＣＤ.<p>
	 *
	 */
	public void purc_dpt_wg_cd(String value) {
		setConstString(offset + 39, $purc_dpt_wg_cd, value);
	}


	/**
	 * Purchasing dept. WG name 購買部門ワーキンググループ名.<p>
	 *
	 */
	public String purc_dpt_wg_nm() {
		return getConstString(offset + 40, $purc_dpt_wg_nm);
	}

	/**
	 * Purchasing dept. WG name 購買部門ワーキンググループ名.<p>
	 *
	 */
	public void purc_dpt_wg_nm(String value) {
		setConstString(offset + 40, $purc_dpt_wg_nm, value);
	}


	/**
	 * Purchasing PIC 購買担当者.<p>
	 *
	 */
	public String purc_usr_cd() {
		return getConstString(offset + 41, $purc_usr_cd);
	}

	/**
	 * Purchasing PIC 購買担当者.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		setConstString(offset + 41, $purc_usr_cd, value);
	}


	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public String purc_usr_nm() {
		return getConstString(offset + 42, $purc_usr_nm);
	}

	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public void purc_usr_nm(String value) {
		setConstString(offset + 42, $purc_usr_nm, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 43, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 43, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 44, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 44, $ap_dpt_nm, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 45, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 45, $po_no, value);
	}


	/**
	 * Purchase return result No. 仕入返品実績ＮＯ.<p>
	 *
	 */
	public String purc_ret_act_no() {
		return getConstString(offset + 46, $purc_ret_act_no);
	}

	/**
	 * Purchase return result No. 仕入返品実績ＮＯ.<p>
	 *
	 */
	public void purc_ret_act_no(String value) {
		setConstString(offset + 46, $purc_ret_act_no, value);
	}


	/**
	 * Purchase return result details No. 仕入返品実績明細ＮＯ.<p>
	 *
	 */
	public String purc_ret_act_d_no() {
		return getConstString(offset + 47, $purc_ret_act_d_no);
	}

	/**
	 * Purchase return result details No. 仕入返品実績明細ＮＯ.<p>
	 *
	 */
	public void purc_ret_act_d_no(String value) {
		setConstString(offset + 47, $purc_ret_act_d_no, value);
	}


	/**
	 * Purchase return schedule No. 仕入返品予定ＮＯ.<p>
	 *
	 */
	public String purc_ret_schd_no() {
		return getConstString(offset + 48, $purc_ret_schd_no);
	}

	/**
	 * Purchase return schedule No. 仕入返品予定ＮＯ.<p>
	 *
	 */
	public void purc_ret_schd_no(String value) {
		setConstString(offset + 48, $purc_ret_schd_no, value);
	}


	/**
	 * Purchase return schedule details No. 仕入返品予定明細ＮＯ.<p>
	 *
	 */
	public String purc_ret_schd_d_no() {
		return getConstString(offset + 49, $purc_ret_schd_d_no);
	}

	/**
	 * Purchase return schedule details No. 仕入返品予定明細ＮＯ.<p>
	 *
	 */
	public void purc_ret_schd_d_no(String value) {
		setConstString(offset + 49, $purc_ret_schd_d_no, value);
	}


	/**
	 * Maker メーカ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 50, $maker_cd);
	}

	/**
	 * Maker メーカ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 50, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 51, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 51, $maker_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 52, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 52, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 53, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 53, $trd_cur_nm, value);
	}


	/**
	 * Return slip remarks 返品票備考.<p>
	 *
	 */
	public String purc_ret_print_rmrks() {
		return getConstString(offset + 54, $purc_ret_print_rmrks);
	}

	/**
	 * Return slip remarks 返品票備考.<p>
	 *
	 */
	public void purc_ret_print_rmrks(String value) {
		setConstString(offset + 54, $purc_ret_print_rmrks, value);
	}


	/**
	 * Return slip note details remarks 返品票明細備考.<p>
	 *
	 */
	public String purc_ret_print_d_rmrks() {
		return getConstString(offset + 55, $purc_ret_print_d_rmrks);
	}

	/**
	 * Return slip note details remarks 返品票明細備考.<p>
	 *
	 */
	public void purc_ret_print_d_rmrks(String value) {
		setConstString(offset + 55, $purc_ret_print_d_rmrks, value);
	}


	/**
	 * Return schedule transaction remarks 返品予定取引備考.<p>
	 *
	 */
	public String schd_trd_rmrks() {
		return getConstString(offset + 56, $schd_trd_rmrks);
	}

	/**
	 * Return schedule transaction remarks 返品予定取引備考.<p>
	 *
	 */
	public void schd_trd_rmrks(String value) {
		setConstString(offset + 56, $schd_trd_rmrks, value);
	}


	/**
	 * Return schedule transaction details remarks 返品予定取引明細備考.<p>
	 *
	 */
	public String schd_trd_d_rmrks() {
		return getConstString(offset + 57, $schd_trd_d_rmrks);
	}

	/**
	 * Return schedule transaction details remarks 返品予定取引明細備考.<p>
	 *
	 */
	public void schd_trd_d_rmrks(String value) {
		setConstString(offset + 57, $schd_trd_d_rmrks, value);
	}


	/**
	 * Return schedule internal remarks 返品予定内部備考.<p>
	 *
	 */
	public String schd_intr_rmrks() {
		return getConstString(offset + 58, $schd_intr_rmrks);
	}

	/**
	 * Return schedule internal remarks 返品予定内部備考.<p>
	 *
	 */
	public void schd_intr_rmrks(String value) {
		setConstString(offset + 58, $schd_intr_rmrks, value);
	}


	/**
	 * Return schedule internal details remarks 返品予定内部明細備考.<p>
	 *
	 */
	public String schd_intr_d_rmrks() {
		return getConstString(offset + 59, $schd_intr_d_rmrks);
	}

	/**
	 * Return schedule internal details remarks 返品予定内部明細備考.<p>
	 *
	 */
	public void schd_intr_d_rmrks(String value) {
		setConstString(offset + 59, $schd_intr_d_rmrks, value);
	}


	/**
	 * Return result transaction remarks 返品実績取引備考.<p>
	 *
	 */
	public String act_trd_rmrks() {
		return getConstString(offset + 60, $act_trd_rmrks);
	}

	/**
	 * Return result transaction remarks 返品実績取引備考.<p>
	 *
	 */
	public void act_trd_rmrks(String value) {
		setConstString(offset + 60, $act_trd_rmrks, value);
	}


	/**
	 * Return result transaction details remarks 返品実績取引明細備考.<p>
	 *
	 */
	public String act_trd_d_rmrks() {
		return getConstString(offset + 61, $act_trd_d_rmrks);
	}

	/**
	 * Return result transaction details remarks 返品実績取引明細備考.<p>
	 *
	 */
	public void act_trd_d_rmrks(String value) {
		setConstString(offset + 61, $act_trd_d_rmrks, value);
	}


	/**
	 * Return result internal remarks 返品実績内部備考.<p>
	 *
	 */
	public String act_intr_rmrks() {
		return getConstString(offset + 62, $act_intr_rmrks);
	}

	/**
	 * Return result internal remarks 返品実績内部備考.<p>
	 *
	 */
	public void act_intr_rmrks(String value) {
		setConstString(offset + 62, $act_intr_rmrks, value);
	}


	/**
	 * Return result internal details remarks 返品実績内部明細備考.<p>
	 *
	 */
	public String act_intr_d_rmrks() {
		return getConstString(offset + 63, $act_intr_d_rmrks);
	}

	/**
	 * Return result internal details remarks 返品実績内部明細備考.<p>
	 *
	 */
	public void act_intr_d_rmrks(String value) {
		setConstString(offset + 63, $act_intr_d_rmrks, value);
	}


	/**
	 * Return schedule spare 1 返品予定予備１.<p>
	 *
	 */
	public String schd_sub_char1() {
		return getConstString(offset + 64, $schd_sub_char1);
	}

	/**
	 * Return schedule spare 1 返品予定予備１.<p>
	 *
	 */
	public void schd_sub_char1(String value) {
		setConstString(offset + 64, $schd_sub_char1, value);
	}


	/**
	 * Return schedule spare 2 返品予定予備２.<p>
	 *
	 */
	public String schd_sub_char2() {
		return getConstString(offset + 65, $schd_sub_char2);
	}

	/**
	 * Return schedule spare 2 返品予定予備２.<p>
	 *
	 */
	public void schd_sub_char2(String value) {
		setConstString(offset + 65, $schd_sub_char2, value);
	}


	/**
	 * Return schedule spare 3 返品予定予備３.<p>
	 *
	 */
	public String schd_sub_char3() {
		return getConstString(offset + 66, $schd_sub_char3);
	}

	/**
	 * Return schedule spare 3 返品予定予備３.<p>
	 *
	 */
	public void schd_sub_char3(String value) {
		setConstString(offset + 66, $schd_sub_char3, value);
	}


	/**
	 * Return schedule details spare 1 返品予定明細予備１.<p>
	 *
	 */
	public String schd_d_sub_char1() {
		return getConstString(offset + 67, $schd_d_sub_char1);
	}

	/**
	 * Return schedule details spare 1 返品予定明細予備１.<p>
	 *
	 */
	public void schd_d_sub_char1(String value) {
		setConstString(offset + 67, $schd_d_sub_char1, value);
	}


	/**
	 * Return schedule details spare 2 返品予定明細予備２.<p>
	 *
	 */
	public String schd_d_sub_char2() {
		return getConstString(offset + 68, $schd_d_sub_char2);
	}

	/**
	 * Return schedule details spare 2 返品予定明細予備２.<p>
	 *
	 */
	public void schd_d_sub_char2(String value) {
		setConstString(offset + 68, $schd_d_sub_char2, value);
	}


	/**
	 * Return schedule details spare 3 返品予定明細予備３.<p>
	 *
	 */
	public String schd_d_sub_char3() {
		return getConstString(offset + 69, $schd_d_sub_char3);
	}

	/**
	 * Return schedule details spare 3 返品予定明細予備３.<p>
	 *
	 */
	public void schd_d_sub_char3(String value) {
		setConstString(offset + 69, $schd_d_sub_char3, value);
	}


	/**
	 * Return schedule GR/GI spare 1 返品予定受払予備１.<p>
	 *
	 */
	public String schd_io_sub_char1() {
		return getConstString(offset + 70, $schd_io_sub_char1);
	}

	/**
	 * Return schedule GR/GI spare 1 返品予定受払予備１.<p>
	 *
	 */
	public void schd_io_sub_char1(String value) {
		setConstString(offset + 70, $schd_io_sub_char1, value);
	}


	/**
	 * Return schedule GR/GI spare 2 返品予定受払予備２.<p>
	 *
	 */
	public String schd_io_sub_char2() {
		return getConstString(offset + 71, $schd_io_sub_char2);
	}

	/**
	 * Return schedule GR/GI spare 2 返品予定受払予備２.<p>
	 *
	 */
	public void schd_io_sub_char2(String value) {
		setConstString(offset + 71, $schd_io_sub_char2, value);
	}


	/**
	 * Return schedule GR/GI spare 3 返品予定受払予備３.<p>
	 *
	 */
	public String schd_io_sub_char3() {
		return getConstString(offset + 72, $schd_io_sub_char3);
	}

	/**
	 * Return schedule GR/GI spare 3 返品予定受払予備３.<p>
	 *
	 */
	public void schd_io_sub_char3(String value) {
		setConstString(offset + 72, $schd_io_sub_char3, value);
	}


	/**
	 * Return result spare 1 返品実績予備１.<p>
	 *
	 */
	public String act_sub_char1() {
		return getConstString(offset + 73, $act_sub_char1);
	}

	/**
	 * Return result spare 1 返品実績予備１.<p>
	 *
	 */
	public void act_sub_char1(String value) {
		setConstString(offset + 73, $act_sub_char1, value);
	}


	/**
	 * Return result spare 2 返品実績予備２.<p>
	 *
	 */
	public String act_sub_char2() {
		return getConstString(offset + 74, $act_sub_char2);
	}

	/**
	 * Return result spare 2 返品実績予備２.<p>
	 *
	 */
	public void act_sub_char2(String value) {
		setConstString(offset + 74, $act_sub_char2, value);
	}


	/**
	 * Return result spare 3 返品実績予備３.<p>
	 *
	 */
	public String act_sub_char3() {
		return getConstString(offset + 75, $act_sub_char3);
	}

	/**
	 * Return result spare 3 返品実績予備３.<p>
	 *
	 */
	public void act_sub_char3(String value) {
		setConstString(offset + 75, $act_sub_char3, value);
	}


	/**
	 * Return result details spare 1 返品実績明細予備１.<p>
	 *
	 */
	public String act_d_sub_char1() {
		return getConstString(offset + 76, $act_d_sub_char1);
	}

	/**
	 * Return result details spare 1 返品実績明細予備１.<p>
	 *
	 */
	public void act_d_sub_char1(String value) {
		setConstString(offset + 76, $act_d_sub_char1, value);
	}


	/**
	 * Return result details spare 2 返品実績明細予備２.<p>
	 *
	 */
	public String act_d_sub_char2() {
		return getConstString(offset + 77, $act_d_sub_char2);
	}

	/**
	 * Return result details spare 2 返品実績明細予備２.<p>
	 *
	 */
	public void act_d_sub_char2(String value) {
		setConstString(offset + 77, $act_d_sub_char2, value);
	}


	/**
	 * Return result details spare 3 返品実績明細予備３.<p>
	 *
	 */
	public String act_d_sub_char3() {
		return getConstString(offset + 78, $act_d_sub_char3);
	}

	/**
	 * Return result details spare 3 返品実績明細予備３.<p>
	 *
	 */
	public void act_d_sub_char3(String value) {
		setConstString(offset + 78, $act_d_sub_char3, value);
	}


	/**
	 * Return result GR/GI spare 1 返品実績受払予備１.<p>
	 *
	 */
	public String act_io_sub_char1() {
		return getConstString(offset + 79, $act_io_sub_char1);
	}

	/**
	 * Return result GR/GI spare 1 返品実績受払予備１.<p>
	 *
	 */
	public void act_io_sub_char1(String value) {
		setConstString(offset + 79, $act_io_sub_char1, value);
	}


	/**
	 * Return result GR/GI spare 2 返品実績受払予備２.<p>
	 *
	 */
	public String act_io_sub_char2() {
		return getConstString(offset + 80, $act_io_sub_char2);
	}

	/**
	 * Return result GR/GI spare 2 返品実績受払予備２.<p>
	 *
	 */
	public void act_io_sub_char2(String value) {
		setConstString(offset + 80, $act_io_sub_char2, value);
	}


	/**
	 * Return result GR/GI spare 3 返品実績受払予備３.<p>
	 *
	 */
	public String act_io_sub_char3() {
		return getConstString(offset + 81, $act_io_sub_char3);
	}

	/**
	 * Return result GR/GI spare 3 返品実績受払予備３.<p>
	 *
	 */
	public void act_io_sub_char3(String value) {
		setConstString(offset + 81, $act_io_sub_char3, value);
	}


	/**
	 * Include discount for return 返品目的の値引含む.<p>
	 *
	 */
	public boolean inc_ret_dscnt_flg() {
		return getConstBoolean(offset + 82, $inc_ret_dscnt_flg);
	}

	/**
	 * Include discount for return 返品目的の値引含む.<p>
	 *
	 */
	public void inc_ret_dscnt_flg(boolean value) {
		setConstBoolean(offset + 82, $inc_ret_dscnt_flg, value);
	}


	/**
	 * Include cancelled 取消済含む.<p>
	 *
	 */
	public boolean inc_can_flg() {
		return getConstBoolean(offset + 83, $inc_can_flg);
	}

	/**
	 * Include cancelled 取消済含む.<p>
	 *
	 */
	public void inc_can_flg(boolean value) {
		setConstBoolean(offset + 83, $inc_can_flg, value);
	}


	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public boolean inc_past_flg() {
		return getConstBoolean(offset + 84, $inc_past_flg);
	}

	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public void inc_past_flg(boolean value) {
		setConstBoolean(offset + 84, $inc_past_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR sppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 85, $sppl_grp_p);
	}
	
	public void sppl_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 85, $sppl_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 86, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 86, $itm_grp_p, row);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($mode.equalsIgnoreCase(name)) {
			return mode();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($ret_sppl_nm.equalsIgnoreCase(name)) {
			return ret_sppl_nm();
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			return loc_wg_cd();
		}
		if ($loc_wg_nm.equalsIgnoreCase(name)) {
			return loc_wg_nm();
		}
		if ($purc_ret_loc_cd.equalsIgnoreCase(name)) {
			return purc_ret_loc_cd();
		}
		if ($purc_ret_loc_nm.equalsIgnoreCase(name)) {
			return purc_ret_loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			return purc_dpt_wg_cd();
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			return purc_dpt_wg_nm();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			return purc_ret_act_no();
		}
		if ($purc_ret_act_d_no.equalsIgnoreCase(name)) {
			return purc_ret_act_d_no();
		}
		if ($purc_ret_schd_no.equalsIgnoreCase(name)) {
			return purc_ret_schd_no();
		}
		if ($purc_ret_schd_d_no.equalsIgnoreCase(name)) {
			return purc_ret_schd_d_no();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($purc_ret_print_rmrks.equalsIgnoreCase(name)) {
			return purc_ret_print_rmrks();
		}
		if ($purc_ret_print_d_rmrks.equalsIgnoreCase(name)) {
			return purc_ret_print_d_rmrks();
		}
		if ($schd_trd_rmrks.equalsIgnoreCase(name)) {
			return schd_trd_rmrks();
		}
		if ($schd_trd_d_rmrks.equalsIgnoreCase(name)) {
			return schd_trd_d_rmrks();
		}
		if ($schd_intr_rmrks.equalsIgnoreCase(name)) {
			return schd_intr_rmrks();
		}
		if ($schd_intr_d_rmrks.equalsIgnoreCase(name)) {
			return schd_intr_d_rmrks();
		}
		if ($act_trd_rmrks.equalsIgnoreCase(name)) {
			return act_trd_rmrks();
		}
		if ($act_trd_d_rmrks.equalsIgnoreCase(name)) {
			return act_trd_d_rmrks();
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			return act_intr_rmrks();
		}
		if ($act_intr_d_rmrks.equalsIgnoreCase(name)) {
			return act_intr_d_rmrks();
		}
		if ($schd_sub_char1.equalsIgnoreCase(name)) {
			return schd_sub_char1();
		}
		if ($schd_sub_char2.equalsIgnoreCase(name)) {
			return schd_sub_char2();
		}
		if ($schd_sub_char3.equalsIgnoreCase(name)) {
			return schd_sub_char3();
		}
		if ($schd_d_sub_char1.equalsIgnoreCase(name)) {
			return schd_d_sub_char1();
		}
		if ($schd_d_sub_char2.equalsIgnoreCase(name)) {
			return schd_d_sub_char2();
		}
		if ($schd_d_sub_char3.equalsIgnoreCase(name)) {
			return schd_d_sub_char3();
		}
		if ($schd_io_sub_char1.equalsIgnoreCase(name)) {
			return schd_io_sub_char1();
		}
		if ($schd_io_sub_char2.equalsIgnoreCase(name)) {
			return schd_io_sub_char2();
		}
		if ($schd_io_sub_char3.equalsIgnoreCase(name)) {
			return schd_io_sub_char3();
		}
		if ($act_sub_char1.equalsIgnoreCase(name)) {
			return act_sub_char1();
		}
		if ($act_sub_char2.equalsIgnoreCase(name)) {
			return act_sub_char2();
		}
		if ($act_sub_char3.equalsIgnoreCase(name)) {
			return act_sub_char3();
		}
		if ($act_d_sub_char1.equalsIgnoreCase(name)) {
			return act_d_sub_char1();
		}
		if ($act_d_sub_char2.equalsIgnoreCase(name)) {
			return act_d_sub_char2();
		}
		if ($act_d_sub_char3.equalsIgnoreCase(name)) {
			return act_d_sub_char3();
		}
		if ($act_io_sub_char1.equalsIgnoreCase(name)) {
			return act_io_sub_char1();
		}
		if ($act_io_sub_char2.equalsIgnoreCase(name)) {
			return act_io_sub_char2();
		}
		if ($act_io_sub_char3.equalsIgnoreCase(name)) {
			return act_io_sub_char3();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($purc_ret_dt_fr.equalsIgnoreCase(name)) {
			return purc_ret_dt_fr();
		}
		if ($purc_ret_dt_to.equalsIgnoreCase(name)) {
			return purc_ret_dt_to();
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			return ac_dt_fr();
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			return ac_dt_to();
		}
		if ($schd_dt_fr.equalsIgnoreCase(name)) {
			return schd_dt_fr();
		}
		if ($schd_dt_to.equalsIgnoreCase(name)) {
			return schd_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($not_transt_flg.equalsIgnoreCase(name)) {
			return not_transt_flg();
		}
		if ($part_transt_flg.equalsIgnoreCase(name)) {
			return part_transt_flg();
		}
		if ($all_transt_flg.equalsIgnoreCase(name)) {
			return all_transt_flg();
		}
		if ($sret_abort_flg.equalsIgnoreCase(name)) {
			return sret_abort_flg();
		}
		if ($not_issue_flg.equalsIgnoreCase(name)) {
			return not_issue_flg();
		}
		if ($issue_flg.equalsIgnoreCase(name)) {
			return issue_flg();
		}
		if ($iv_trgt_flg.equalsIgnoreCase(name)) {
			return iv_trgt_flg();
		}
		if ($iv_not_trgt_flg.equalsIgnoreCase(name)) {
			return iv_not_trgt_flg();
		}
		if ($inc_ret_dscnt_flg.equalsIgnoreCase(name)) {
			return inc_ret_dscnt_flg();
		}
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			return inc_can_flg();
		}
		if ($inc_past_flg.equalsIgnoreCase(name)) {
			return inc_past_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($mode.equalsIgnoreCase(name)) {
			return mode();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($ret_sppl_nm.equalsIgnoreCase(name)) {
			return ret_sppl_nm();
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			return loc_wg_cd();
		}
		if ($loc_wg_nm.equalsIgnoreCase(name)) {
			return loc_wg_nm();
		}
		if ($purc_ret_loc_cd.equalsIgnoreCase(name)) {
			return purc_ret_loc_cd();
		}
		if ($purc_ret_loc_nm.equalsIgnoreCase(name)) {
			return purc_ret_loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			return purc_dpt_wg_cd();
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			return purc_dpt_wg_nm();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			return purc_ret_act_no();
		}
		if ($purc_ret_act_d_no.equalsIgnoreCase(name)) {
			return purc_ret_act_d_no();
		}
		if ($purc_ret_schd_no.equalsIgnoreCase(name)) {
			return purc_ret_schd_no();
		}
		if ($purc_ret_schd_d_no.equalsIgnoreCase(name)) {
			return purc_ret_schd_d_no();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($purc_ret_print_rmrks.equalsIgnoreCase(name)) {
			return purc_ret_print_rmrks();
		}
		if ($purc_ret_print_d_rmrks.equalsIgnoreCase(name)) {
			return purc_ret_print_d_rmrks();
		}
		if ($schd_trd_rmrks.equalsIgnoreCase(name)) {
			return schd_trd_rmrks();
		}
		if ($schd_trd_d_rmrks.equalsIgnoreCase(name)) {
			return schd_trd_d_rmrks();
		}
		if ($schd_intr_rmrks.equalsIgnoreCase(name)) {
			return schd_intr_rmrks();
		}
		if ($schd_intr_d_rmrks.equalsIgnoreCase(name)) {
			return schd_intr_d_rmrks();
		}
		if ($act_trd_rmrks.equalsIgnoreCase(name)) {
			return act_trd_rmrks();
		}
		if ($act_trd_d_rmrks.equalsIgnoreCase(name)) {
			return act_trd_d_rmrks();
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			return act_intr_rmrks();
		}
		if ($act_intr_d_rmrks.equalsIgnoreCase(name)) {
			return act_intr_d_rmrks();
		}
		if ($schd_sub_char1.equalsIgnoreCase(name)) {
			return schd_sub_char1();
		}
		if ($schd_sub_char2.equalsIgnoreCase(name)) {
			return schd_sub_char2();
		}
		if ($schd_sub_char3.equalsIgnoreCase(name)) {
			return schd_sub_char3();
		}
		if ($schd_d_sub_char1.equalsIgnoreCase(name)) {
			return schd_d_sub_char1();
		}
		if ($schd_d_sub_char2.equalsIgnoreCase(name)) {
			return schd_d_sub_char2();
		}
		if ($schd_d_sub_char3.equalsIgnoreCase(name)) {
			return schd_d_sub_char3();
		}
		if ($schd_io_sub_char1.equalsIgnoreCase(name)) {
			return schd_io_sub_char1();
		}
		if ($schd_io_sub_char2.equalsIgnoreCase(name)) {
			return schd_io_sub_char2();
		}
		if ($schd_io_sub_char3.equalsIgnoreCase(name)) {
			return schd_io_sub_char3();
		}
		if ($act_sub_char1.equalsIgnoreCase(name)) {
			return act_sub_char1();
		}
		if ($act_sub_char2.equalsIgnoreCase(name)) {
			return act_sub_char2();
		}
		if ($act_sub_char3.equalsIgnoreCase(name)) {
			return act_sub_char3();
		}
		if ($act_d_sub_char1.equalsIgnoreCase(name)) {
			return act_d_sub_char1();
		}
		if ($act_d_sub_char2.equalsIgnoreCase(name)) {
			return act_d_sub_char2();
		}
		if ($act_d_sub_char3.equalsIgnoreCase(name)) {
			return act_d_sub_char3();
		}
		if ($act_io_sub_char1.equalsIgnoreCase(name)) {
			return act_io_sub_char1();
		}
		if ($act_io_sub_char2.equalsIgnoreCase(name)) {
			return act_io_sub_char2();
		}
		if ($act_io_sub_char3.equalsIgnoreCase(name)) {
			return act_io_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($purc_ret_dt_fr.equalsIgnoreCase(name)) {
			return purc_ret_dt_fr();
		}
		if ($purc_ret_dt_to.equalsIgnoreCase(name)) {
			return purc_ret_dt_to();
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			return ac_dt_fr();
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			return ac_dt_to();
		}
		if ($schd_dt_fr.equalsIgnoreCase(name)) {
			return schd_dt_fr();
		}
		if ($schd_dt_to.equalsIgnoreCase(name)) {
			return schd_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($not_transt_flg.equalsIgnoreCase(name)) {
			return not_transt_flg();
		}
		if ($part_transt_flg.equalsIgnoreCase(name)) {
			return part_transt_flg();
		}
		if ($all_transt_flg.equalsIgnoreCase(name)) {
			return all_transt_flg();
		}
		if ($sret_abort_flg.equalsIgnoreCase(name)) {
			return sret_abort_flg();
		}
		if ($not_issue_flg.equalsIgnoreCase(name)) {
			return not_issue_flg();
		}
		if ($issue_flg.equalsIgnoreCase(name)) {
			return issue_flg();
		}
		if ($iv_trgt_flg.equalsIgnoreCase(name)) {
			return iv_trgt_flg();
		}
		if ($iv_not_trgt_flg.equalsIgnoreCase(name)) {
			return iv_not_trgt_flg();
		}
		if ($inc_ret_dscnt_flg.equalsIgnoreCase(name)) {
			return inc_ret_dscnt_flg();
		}
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			return inc_can_flg();
		}
		if ($inc_past_flg.equalsIgnoreCase(name)) {
			return inc_past_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($mode.equalsIgnoreCase(name)) {
			mode(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($ret_sppl_nm.equalsIgnoreCase(name)) {
			ret_sppl_nm(value);
			return;
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			loc_wg_cd(value);
			return;
		}
		if ($loc_wg_nm.equalsIgnoreCase(name)) {
			loc_wg_nm(value);
			return;
		}
		if ($purc_ret_loc_cd.equalsIgnoreCase(name)) {
			purc_ret_loc_cd(value);
			return;
		}
		if ($purc_ret_loc_nm.equalsIgnoreCase(name)) {
			purc_ret_loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
			return;
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			purc_dpt_wg_cd(value);
			return;
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			purc_dpt_wg_nm(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			purc_usr_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			purc_ret_act_no(value);
			return;
		}
		if ($purc_ret_act_d_no.equalsIgnoreCase(name)) {
			purc_ret_act_d_no(value);
			return;
		}
		if ($purc_ret_schd_no.equalsIgnoreCase(name)) {
			purc_ret_schd_no(value);
			return;
		}
		if ($purc_ret_schd_d_no.equalsIgnoreCase(name)) {
			purc_ret_schd_d_no(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($purc_ret_print_rmrks.equalsIgnoreCase(name)) {
			purc_ret_print_rmrks(value);
			return;
		}
		if ($purc_ret_print_d_rmrks.equalsIgnoreCase(name)) {
			purc_ret_print_d_rmrks(value);
			return;
		}
		if ($schd_trd_rmrks.equalsIgnoreCase(name)) {
			schd_trd_rmrks(value);
			return;
		}
		if ($schd_trd_d_rmrks.equalsIgnoreCase(name)) {
			schd_trd_d_rmrks(value);
			return;
		}
		if ($schd_intr_rmrks.equalsIgnoreCase(name)) {
			schd_intr_rmrks(value);
			return;
		}
		if ($schd_intr_d_rmrks.equalsIgnoreCase(name)) {
			schd_intr_d_rmrks(value);
			return;
		}
		if ($act_trd_rmrks.equalsIgnoreCase(name)) {
			act_trd_rmrks(value);
			return;
		}
		if ($act_trd_d_rmrks.equalsIgnoreCase(name)) {
			act_trd_d_rmrks(value);
			return;
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			act_intr_rmrks(value);
			return;
		}
		if ($act_intr_d_rmrks.equalsIgnoreCase(name)) {
			act_intr_d_rmrks(value);
			return;
		}
		if ($schd_sub_char1.equalsIgnoreCase(name)) {
			schd_sub_char1(value);
			return;
		}
		if ($schd_sub_char2.equalsIgnoreCase(name)) {
			schd_sub_char2(value);
			return;
		}
		if ($schd_sub_char3.equalsIgnoreCase(name)) {
			schd_sub_char3(value);
			return;
		}
		if ($schd_d_sub_char1.equalsIgnoreCase(name)) {
			schd_d_sub_char1(value);
			return;
		}
		if ($schd_d_sub_char2.equalsIgnoreCase(name)) {
			schd_d_sub_char2(value);
			return;
		}
		if ($schd_d_sub_char3.equalsIgnoreCase(name)) {
			schd_d_sub_char3(value);
			return;
		}
		if ($schd_io_sub_char1.equalsIgnoreCase(name)) {
			schd_io_sub_char1(value);
			return;
		}
		if ($schd_io_sub_char2.equalsIgnoreCase(name)) {
			schd_io_sub_char2(value);
			return;
		}
		if ($schd_io_sub_char3.equalsIgnoreCase(name)) {
			schd_io_sub_char3(value);
			return;
		}
		if ($act_sub_char1.equalsIgnoreCase(name)) {
			act_sub_char1(value);
			return;
		}
		if ($act_sub_char2.equalsIgnoreCase(name)) {
			act_sub_char2(value);
			return;
		}
		if ($act_sub_char3.equalsIgnoreCase(name)) {
			act_sub_char3(value);
			return;
		}
		if ($act_d_sub_char1.equalsIgnoreCase(name)) {
			act_d_sub_char1(value);
			return;
		}
		if ($act_d_sub_char2.equalsIgnoreCase(name)) {
			act_d_sub_char2(value);
			return;
		}
		if ($act_d_sub_char3.equalsIgnoreCase(name)) {
			act_d_sub_char3(value);
			return;
		}
		if ($act_io_sub_char1.equalsIgnoreCase(name)) {
			act_io_sub_char1(value);
			return;
		}
		if ($act_io_sub_char2.equalsIgnoreCase(name)) {
			act_io_sub_char2(value);
			return;
		}
		if ($act_io_sub_char3.equalsIgnoreCase(name)) {
			act_io_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($purc_ret_dt_fr.equalsIgnoreCase(name)) {
			purc_ret_dt_fr(value);
			return;
		}
		if ($purc_ret_dt_to.equalsIgnoreCase(name)) {
			purc_ret_dt_to(value);
			return;
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			ac_dt_fr(value);
			return;
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			ac_dt_to(value);
			return;
		}
		if ($schd_dt_fr.equalsIgnoreCase(name)) {
			schd_dt_fr(value);
			return;
		}
		if ($schd_dt_to.equalsIgnoreCase(name)) {
			schd_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($not_transt_flg.equalsIgnoreCase(name)) {
			not_transt_flg(value);
			return;
		}
		if ($part_transt_flg.equalsIgnoreCase(name)) {
			part_transt_flg(value);
			return;
		}
		if ($all_transt_flg.equalsIgnoreCase(name)) {
			all_transt_flg(value);
			return;
		}
		if ($sret_abort_flg.equalsIgnoreCase(name)) {
			sret_abort_flg(value);
			return;
		}
		if ($not_issue_flg.equalsIgnoreCase(name)) {
			not_issue_flg(value);
			return;
		}
		if ($issue_flg.equalsIgnoreCase(name)) {
			issue_flg(value);
			return;
		}
		if ($iv_trgt_flg.equalsIgnoreCase(name)) {
			iv_trgt_flg(value);
			return;
		}
		if ($iv_not_trgt_flg.equalsIgnoreCase(name)) {
			iv_not_trgt_flg(value);
			return;
		}
		if ($inc_ret_dscnt_flg.equalsIgnoreCase(name)) {
			inc_ret_dscnt_flg(value);
			return;
		}
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			inc_can_flg(value);
			return;
		}
		if ($inc_past_flg.equalsIgnoreCase(name)) {
			inc_past_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($mode.equalsIgnoreCase(name)) {
			mode(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($ret_sppl_nm.equalsIgnoreCase(name)) {
			ret_sppl_nm(value);
			return;
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			loc_wg_cd(value);
			return;
		}
		if ($loc_wg_nm.equalsIgnoreCase(name)) {
			loc_wg_nm(value);
			return;
		}
		if ($purc_ret_loc_cd.equalsIgnoreCase(name)) {
			purc_ret_loc_cd(value);
			return;
		}
		if ($purc_ret_loc_nm.equalsIgnoreCase(name)) {
			purc_ret_loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
			return;
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			purc_dpt_wg_cd(value);
			return;
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			purc_dpt_wg_nm(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			purc_usr_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			purc_ret_act_no(value);
			return;
		}
		if ($purc_ret_act_d_no.equalsIgnoreCase(name)) {
			purc_ret_act_d_no(value);
			return;
		}
		if ($purc_ret_schd_no.equalsIgnoreCase(name)) {
			purc_ret_schd_no(value);
			return;
		}
		if ($purc_ret_schd_d_no.equalsIgnoreCase(name)) {
			purc_ret_schd_d_no(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($purc_ret_print_rmrks.equalsIgnoreCase(name)) {
			purc_ret_print_rmrks(value);
			return;
		}
		if ($purc_ret_print_d_rmrks.equalsIgnoreCase(name)) {
			purc_ret_print_d_rmrks(value);
			return;
		}
		if ($schd_trd_rmrks.equalsIgnoreCase(name)) {
			schd_trd_rmrks(value);
			return;
		}
		if ($schd_trd_d_rmrks.equalsIgnoreCase(name)) {
			schd_trd_d_rmrks(value);
			return;
		}
		if ($schd_intr_rmrks.equalsIgnoreCase(name)) {
			schd_intr_rmrks(value);
			return;
		}
		if ($schd_intr_d_rmrks.equalsIgnoreCase(name)) {
			schd_intr_d_rmrks(value);
			return;
		}
		if ($act_trd_rmrks.equalsIgnoreCase(name)) {
			act_trd_rmrks(value);
			return;
		}
		if ($act_trd_d_rmrks.equalsIgnoreCase(name)) {
			act_trd_d_rmrks(value);
			return;
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			act_intr_rmrks(value);
			return;
		}
		if ($act_intr_d_rmrks.equalsIgnoreCase(name)) {
			act_intr_d_rmrks(value);
			return;
		}
		if ($schd_sub_char1.equalsIgnoreCase(name)) {
			schd_sub_char1(value);
			return;
		}
		if ($schd_sub_char2.equalsIgnoreCase(name)) {
			schd_sub_char2(value);
			return;
		}
		if ($schd_sub_char3.equalsIgnoreCase(name)) {
			schd_sub_char3(value);
			return;
		}
		if ($schd_d_sub_char1.equalsIgnoreCase(name)) {
			schd_d_sub_char1(value);
			return;
		}
		if ($schd_d_sub_char2.equalsIgnoreCase(name)) {
			schd_d_sub_char2(value);
			return;
		}
		if ($schd_d_sub_char3.equalsIgnoreCase(name)) {
			schd_d_sub_char3(value);
			return;
		}
		if ($schd_io_sub_char1.equalsIgnoreCase(name)) {
			schd_io_sub_char1(value);
			return;
		}
		if ($schd_io_sub_char2.equalsIgnoreCase(name)) {
			schd_io_sub_char2(value);
			return;
		}
		if ($schd_io_sub_char3.equalsIgnoreCase(name)) {
			schd_io_sub_char3(value);
			return;
		}
		if ($act_sub_char1.equalsIgnoreCase(name)) {
			act_sub_char1(value);
			return;
		}
		if ($act_sub_char2.equalsIgnoreCase(name)) {
			act_sub_char2(value);
			return;
		}
		if ($act_sub_char3.equalsIgnoreCase(name)) {
			act_sub_char3(value);
			return;
		}
		if ($act_d_sub_char1.equalsIgnoreCase(name)) {
			act_d_sub_char1(value);
			return;
		}
		if ($act_d_sub_char2.equalsIgnoreCase(name)) {
			act_d_sub_char2(value);
			return;
		}
		if ($act_d_sub_char3.equalsIgnoreCase(name)) {
			act_d_sub_char3(value);
			return;
		}
		if ($act_io_sub_char1.equalsIgnoreCase(name)) {
			act_io_sub_char1(value);
			return;
		}
		if ($act_io_sub_char2.equalsIgnoreCase(name)) {
			act_io_sub_char2(value);
			return;
		}
		if ($act_io_sub_char3.equalsIgnoreCase(name)) {
			act_io_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($purc_ret_dt_fr.equalsIgnoreCase(name)) {
			purc_ret_dt_fr(value);
			return;
		}
		if ($purc_ret_dt_to.equalsIgnoreCase(name)) {
			purc_ret_dt_to(value);
			return;
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			ac_dt_fr(value);
			return;
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			ac_dt_to(value);
			return;
		}
		if ($schd_dt_fr.equalsIgnoreCase(name)) {
			schd_dt_fr(value);
			return;
		}
		if ($schd_dt_to.equalsIgnoreCase(name)) {
			schd_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($not_transt_flg.equalsIgnoreCase(name)) {
			not_transt_flg(value);
			return;
		}
		if ($part_transt_flg.equalsIgnoreCase(name)) {
			part_transt_flg(value);
			return;
		}
		if ($all_transt_flg.equalsIgnoreCase(name)) {
			all_transt_flg(value);
			return;
		}
		if ($sret_abort_flg.equalsIgnoreCase(name)) {
			sret_abort_flg(value);
			return;
		}
		if ($not_issue_flg.equalsIgnoreCase(name)) {
			not_issue_flg(value);
			return;
		}
		if ($issue_flg.equalsIgnoreCase(name)) {
			issue_flg(value);
			return;
		}
		if ($iv_trgt_flg.equalsIgnoreCase(name)) {
			iv_trgt_flg(value);
			return;
		}
		if ($iv_not_trgt_flg.equalsIgnoreCase(name)) {
			iv_not_trgt_flg(value);
			return;
		}
		if ($inc_ret_dscnt_flg.equalsIgnoreCase(name)) {
			inc_ret_dscnt_flg(value);
			return;
		}
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			inc_can_flg(value);
			return;
		}
		if ($inc_past_flg.equalsIgnoreCase(name)) {
			inc_past_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
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
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			itm_typ_p(
				((MCContainerMeta) itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0340.VerNoR.class, value)
			);
			return;
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($sppl_grp_p.equalsIgnoreCase(name)) {
			sppl_grp_p(
				((MCContainerMeta) sppl_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0250.ItmGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_typ() {
		return itm_typ_p().itm_typ();
	}

	public void itm_typ(String value) {
		itm_typ_p().itm_typ(value);
	}

	public String itm_typ_d_cd() {
		return itm_typ_p().itm_typ_d_cd();
	}

	public void itm_typ_d_cd(String value) {
		itm_typ_p().itm_typ_d_cd(value);
	}

	public String itm_typ_d_nm() {
		return itm_typ_p().itm_typ_d_nm();
	}

	public void itm_typ_d_nm(String value) {
		itm_typ_p().itm_typ_d_nm(value);
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

	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
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

	public String wrk_no() {
		return sno_p().wrk_no();
	}

	public void wrk_no(String value) {
		sno_p().wrk_no(value);
	}

	public String wrk_nm() {
		return sno_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		sno_p().wrk_nm(value);
	}

	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public boolean sppl_grp_flg1() {
		return sppl_grp_p().bp_grp_flg1();
	}

	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public void sppl_grp_flg1(boolean value) {
		sppl_grp_p().bp_grp_flg1(value);
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
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public boolean sppl_grp_flg2() {
		return sppl_grp_p().bp_grp_flg2();
	}

	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public void sppl_grp_flg2(boolean value) {
		sppl_grp_p().bp_grp_flg2(value);
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
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public boolean sppl_grp_flg3() {
		return sppl_grp_p().bp_grp_flg3();
	}

	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public void sppl_grp_flg3(boolean value) {
		sppl_grp_p().bp_grp_flg3(value);
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
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public boolean sppl_grp_flg4() {
		return sppl_grp_p().bp_grp_flg4();
	}

	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public void sppl_grp_flg4(boolean value) {
		sppl_grp_p().bp_grp_flg4(value);
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
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public boolean sppl_grp_flg5() {
		return sppl_grp_p().bp_grp_flg5();
	}

	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public void sppl_grp_flg5(boolean value) {
		sppl_grp_p().bp_grp_flg5(value);
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
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public boolean sppl_grp_flg6() {
		return sppl_grp_p().bp_grp_flg6();
	}

	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public void sppl_grp_flg6(boolean value) {
		sppl_grp_p().bp_grp_flg6(value);
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
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public boolean sppl_grp_flg7() {
		return sppl_grp_p().bp_grp_flg7();
	}

	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public void sppl_grp_flg7(boolean value) {
		sppl_grp_p().bp_grp_flg7(value);
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
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public boolean sppl_grp_flg8() {
		return sppl_grp_p().bp_grp_flg8();
	}

	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public void sppl_grp_flg8(boolean value) {
		sppl_grp_p().bp_grp_flg8(value);
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
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public boolean sppl_grp_flg9() {
		return sppl_grp_p().bp_grp_flg9();
	}

	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public void sppl_grp_flg9(boolean value) {
		sppl_grp_p().bp_grp_flg9(value);
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
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public boolean sppl_grp_flg10() {
		return sppl_grp_p().bp_grp_flg10();
	}

	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public void sppl_grp_flg10(boolean value) {
		sppl_grp_p().bp_grp_flg10(value);
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

	public boolean itm_grp_flg1() {
		return itm_grp_p().itm_grp_flg1();
	}

	public void itm_grp_flg1(boolean value) {
		itm_grp_p().itm_grp_flg1(value);
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

	public boolean itm_grp_flg2() {
		return itm_grp_p().itm_grp_flg2();
	}

	public void itm_grp_flg2(boolean value) {
		itm_grp_p().itm_grp_flg2(value);
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

	public boolean itm_grp_flg3() {
		return itm_grp_p().itm_grp_flg3();
	}

	public void itm_grp_flg3(boolean value) {
		itm_grp_p().itm_grp_flg3(value);
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

	public boolean itm_grp_flg4() {
		return itm_grp_p().itm_grp_flg4();
	}

	public void itm_grp_flg4(boolean value) {
		itm_grp_p().itm_grp_flg4(value);
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

	public boolean itm_grp_flg5() {
		return itm_grp_p().itm_grp_flg5();
	}

	public void itm_grp_flg5(boolean value) {
		itm_grp_p().itm_grp_flg5(value);
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

	public boolean itm_grp_flg6() {
		return itm_grp_p().itm_grp_flg6();
	}

	public void itm_grp_flg6(boolean value) {
		itm_grp_p().itm_grp_flg6(value);
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

	public boolean itm_grp_flg7() {
		return itm_grp_p().itm_grp_flg7();
	}

	public void itm_grp_flg7(boolean value) {
		itm_grp_p().itm_grp_flg7(value);
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

	public boolean itm_grp_flg8() {
		return itm_grp_p().itm_grp_flg8();
	}

	public void itm_grp_flg8(boolean value) {
		itm_grp_p().itm_grp_flg8(value);
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

	public boolean itm_grp_flg9() {
		return itm_grp_p().itm_grp_flg9();
	}

	public void itm_grp_flg9(boolean value) {
		itm_grp_p().itm_grp_flg9(value);
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

	public boolean itm_grp_flg10() {
		return itm_grp_p().itm_grp_flg10();
	}

	public void itm_grp_flg10(boolean value) {
		itm_grp_p().itm_grp_flg10(value);
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

