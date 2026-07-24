package mcframe.clientMSBG.MSBGP0250;

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
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	/**
	 * Slip status type name 伝票状況区分名.<p>
	 *
	 */
	public static final String $slip_sts_typ_nm = "slip_sts_typ_nm";
	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_no = "rcv_act_no";
	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public static final String $rcv_act_seq = "rcv_act_seq";
	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public static final String $rcv_act_rev = "rcv_act_rev";
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
	 * Payment received date 入金日.<p>
	 *
	 */
	public static final String $rcv_dt = "rcv_dt";
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public static final String $rcst_nm = "rcst_nm";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public static final String $bcst_nm = "bcst_nm";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public static final String $bill_dpt_nm = "bill_dpt_nm";
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public static final String $ar_sttl_cd1 = "ar_sttl_cd1";
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public static final String $ar_sttl_nm1 = "ar_sttl_nm1";
	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public static final String $rcv_no = "rcv_no";
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public static final String $note_no = "note_no";
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public static final String $bank_ac_nm = "bank_ac_nm";
	/**
	 * Bank account number 口座番号.<p>
	 *
	 */
	public static final String $bank_ac_no = "bank_ac_no";
	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public static final String $ar_sttl_cd2 = "ar_sttl_cd2";
	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public static final String $ar_sttl_nm2 = "ar_sttl_nm2";
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
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	public static final String $subttl1_p = "subttl1_p";
	public static final String $subttl2_p = "subttl2_p";
	public static final String $tax_amt_p = "tax_amt_p";
	public static final String $tax_diff_amt_p = "tax_diff_amt_p";
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $base_cur_amt_dec_place = "base_cur_amt_dec_place";
	public static final String $base_cur_subttl1_p = "base_cur_subttl1_p";
	public static final String $base_cur_subttl2_p = "base_cur_subttl2_p";
	public static final String $base_cur_tax_amt_p = "base_cur_tax_amt_p";
	public static final String $base_cur_tax_diff_amt_p = "base_cur_tax_diff_amt_p";
	/**
	 * Transfer payment received result No. 振替先入金実績ＮＯ.<p>
	 *
	 */
	public static final String $sw_to_rcv_act_no = "sw_to_rcv_act_no";
	/**
	 * Transfer transaction cd. 振替先取引ＣＤ.<p>
	 *
	 */
	public static final String $sw_to_trd_cd = "sw_to_trd_cd";
	/**
	 * Transfer transaction name 振替先取引名.<p>
	 *
	 */
	public static final String $sw_to_trd_nm = "sw_to_trd_nm";
	/**
	 * Transfer cd. 振替先ＣＤ.<p>
	 *
	 */
	public static final String $sw_to_bcst_cd = "sw_to_bcst_cd";
	/**
	 * Transfer name 振替先名.<p>
	 *
	 */
	public static final String $sw_to_bcst_nm = "sw_to_bcst_nm";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
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
	 * Source incoming payment result No. 発生入金ＮＯ.<p>
	 *
	 */
	public static final String $gen_rcv_no = "gen_rcv_no";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";
	/**
	 * Auto-reconciliation 入金自動消込.<p>
	 *
	 */
	public static final String $rcv_auto_appl_flg = "rcv_auto_appl_flg";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
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
	public static final String $rts_msg_p = "rts_msg_p";
	public static final String $rcst_grp_p = "rcst_grp_p";
	public static final String $bcst_grp_p = "bcst_grp_p";
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

	public static final String $subttl1 = $subttl1_p + ".amt";
	public static final String $subttl2 = $subttl2_p + ".amt";
	public static final String $tax_amt = $tax_amt_p + ".amt";
	public static final String $tax_diff_amt = $tax_diff_amt_p + ".amt";
	public static final String $base_cur_subttl1 = $base_cur_subttl1_p + ".amt";
	public static final String $base_cur_subttl2 = $base_cur_subttl2_p + ".amt";
	public static final String $base_cur_tax_amt = $base_cur_tax_amt_p + ".amt";
	public static final String $base_cur_tax_diff_amt = $base_cur_tax_diff_amt_p + ".amt";
	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";
	public static final String $rcst_grp_cd1 = $rcst_grp_p + ".bp_grp_cd1";
	public static final String $rcst_grp_nm1 = $rcst_grp_p + ".bp_grp_nm1";
	public static final String $rcst_grp_cd2 = $rcst_grp_p + ".bp_grp_cd2";
	public static final String $rcst_grp_nm2 = $rcst_grp_p + ".bp_grp_nm2";
	public static final String $rcst_grp_cd3 = $rcst_grp_p + ".bp_grp_cd3";
	public static final String $rcst_grp_nm3 = $rcst_grp_p + ".bp_grp_nm3";
	public static final String $rcst_grp_cd4 = $rcst_grp_p + ".bp_grp_cd4";
	public static final String $rcst_grp_nm4 = $rcst_grp_p + ".bp_grp_nm4";
	public static final String $rcst_grp_cd5 = $rcst_grp_p + ".bp_grp_cd5";
	public static final String $rcst_grp_nm5 = $rcst_grp_p + ".bp_grp_nm5";
	public static final String $rcst_grp_cd6 = $rcst_grp_p + ".bp_grp_cd6";
	public static final String $rcst_grp_nm6 = $rcst_grp_p + ".bp_grp_nm6";
	public static final String $rcst_grp_cd7 = $rcst_grp_p + ".bp_grp_cd7";
	public static final String $rcst_grp_nm7 = $rcst_grp_p + ".bp_grp_nm7";
	public static final String $rcst_grp_cd8 = $rcst_grp_p + ".bp_grp_cd8";
	public static final String $rcst_grp_nm8 = $rcst_grp_p + ".bp_grp_nm8";
	public static final String $rcst_grp_cd9 = $rcst_grp_p + ".bp_grp_cd9";
	public static final String $rcst_grp_nm9 = $rcst_grp_p + ".bp_grp_nm9";
	public static final String $rcst_grp_cd10 = $rcst_grp_p + ".bp_grp_cd10";
	public static final String $rcst_grp_nm10 = $rcst_grp_p + ".bp_grp_nm10";
	public static final String $bcst_grp_cd1 = $bcst_grp_p + ".bp_grp_cd1";
	public static final String $bcst_grp_nm1 = $bcst_grp_p + ".bp_grp_nm1";
	public static final String $bcst_grp_cd2 = $bcst_grp_p + ".bp_grp_cd2";
	public static final String $bcst_grp_nm2 = $bcst_grp_p + ".bp_grp_nm2";
	public static final String $bcst_grp_cd3 = $bcst_grp_p + ".bp_grp_cd3";
	public static final String $bcst_grp_nm3 = $bcst_grp_p + ".bp_grp_nm3";
	public static final String $bcst_grp_cd4 = $bcst_grp_p + ".bp_grp_cd4";
	public static final String $bcst_grp_nm4 = $bcst_grp_p + ".bp_grp_nm4";
	public static final String $bcst_grp_cd5 = $bcst_grp_p + ".bp_grp_cd5";
	public static final String $bcst_grp_nm5 = $bcst_grp_p + ".bp_grp_nm5";
	public static final String $bcst_grp_cd6 = $bcst_grp_p + ".bp_grp_cd6";
	public static final String $bcst_grp_nm6 = $bcst_grp_p + ".bp_grp_nm6";
	public static final String $bcst_grp_cd7 = $bcst_grp_p + ".bp_grp_cd7";
	public static final String $bcst_grp_nm7 = $bcst_grp_p + ".bp_grp_nm7";
	public static final String $bcst_grp_cd8 = $bcst_grp_p + ".bp_grp_cd8";
	public static final String $bcst_grp_nm8 = $bcst_grp_p + ".bp_grp_nm8";
	public static final String $bcst_grp_cd9 = $bcst_grp_p + ".bp_grp_cd9";
	public static final String $bcst_grp_nm9 = $bcst_grp_p + ".bp_grp_nm9";
	public static final String $bcst_grp_cd10 = $bcst_grp_p + ".bp_grp_cd10";
	public static final String $bcst_grp_nm10 = $bcst_grp_p + ".bp_grp_nm10";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta slip_sts_typ_nm_META = createCommonMeta($slip_sts_typ_nm, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP_NM);
	public static final MCMeta rcv_act_no_META = createCommonMeta($rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta rcv_act_seq_META = createCommonMeta($rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta rcv_act_rev_META = createCommonMeta($rcv_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta rcv_dt_META = createCommonMeta($rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_nm_META = createCommonMeta($rcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_nm_META = createCommonMeta($bill_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ar_sttl_cd1_META = createCommonMeta($ar_sttl_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_nm1_META = createCommonMeta($ar_sttl_nm1, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_no_META = createCommonMeta($rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta note_no_META = createCommonMeta($note_no, mcframe.commonMA.meta.MA_META.NOTE_NO);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta bank_ac_nm_META = createCommonMeta($bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta bank_ac_no_META = createCommonMeta($bank_ac_no, mcframe.commonMA.meta.MA_META.BANK_AC_NO);
	public static final MCMeta ar_sttl_cd2_META = createCommonMeta($ar_sttl_cd2, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_nm2_META = createCommonMeta($ar_sttl_nm2, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta subttl1_p_META = createInnerRowMeta($subttl1_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta subttl2_p_META = createInnerRowMeta($subttl2_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta tax_amt_p_META = createInnerRowMeta($tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta tax_diff_amt_p_META = createInnerRowMeta($tax_diff_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_amt_dec_place_META = createCommonMeta($base_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_subttl1_p_META = createInnerRowMeta($base_cur_subttl1_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_subttl2_p_META = createInnerRowMeta($base_cur_subttl2_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_tax_amt_p_META = createInnerRowMeta($base_cur_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_tax_diff_amt_p_META = createInnerRowMeta($base_cur_tax_diff_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta sw_to_rcv_act_no_META = createCommonMeta($sw_to_rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta sw_to_trd_cd_META = createCommonMeta($sw_to_trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta sw_to_trd_nm_META = createCommonMeta($sw_to_trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta sw_to_bcst_cd_META = createCommonMeta($sw_to_bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sw_to_bcst_nm_META = createCommonMeta($sw_to_bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta gen_rcv_no_META = createCommonMeta($gen_rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_auto_appl_flg_META = createCommonMeta($rcv_auto_appl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR3);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta rcst_grp_p_META = createInnerRowMeta($rcst_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta bcst_grp_p_META = createInnerRowMeta($bcst_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
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

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			slip_sts_typ_META,
			slip_sts_typ_nm_META,
			rcv_act_no_META,
			rcv_act_seq_META,
			rcv_act_rev_META,
			trd_cd_META,
			trd_nm_META,
			rcv_dt_META,
			ac_ym_META,
			ac_dt_META,
			trd_ptn_typ_META,
			rcst_cd_META,
			rcst_nm_META,
			bcst_cd_META,
			bcst_nm_META,
			bill_dpt_cd_META,
			bill_dpt_nm_META,
			ar_sttl_cd1_META,
			ar_sttl_nm1_META,
			rcv_no_META,
			note_no_META,
			bank_ac_cd_META,
			bank_ac_nm_META,
			bank_ac_no_META,
			ar_sttl_cd2_META,
			ar_sttl_nm2_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			amt_dec_place_META,
			subttl1_p_META,
			subttl2_p_META,
			tax_amt_p_META,
			tax_diff_amt_p_META,
			base_cur_cd_META,
			base_cur_nm_META,
			base_cur_amt_dec_place_META,
			base_cur_subttl1_p_META,
			base_cur_subttl2_p_META,
			base_cur_tax_amt_p_META,
			base_cur_tax_diff_amt_p_META,
			sw_to_rcv_act_no_META,
			sw_to_trd_cd_META,
			sw_to_trd_nm_META,
			sw_to_bcst_cd_META,
			sw_to_bcst_nm_META,
			usr_cd_META,
			usr_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			gen_rcv_no_META,
			prnt_flg_META,
			rcv_auto_appl_flg_META,
			trd_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			rts_msg_p_META,
			rcst_grp_p_META,
			bcst_grp_p_META,
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
				"subttl1",
				"subttl2",
				"tax_amt",
				"tax_diff_amt",
				"base_cur_subttl1",
				"base_cur_subttl2",
				"base_cur_tax_amt",
				"base_cur_tax_diff_amt",
				"rtn_sts_typ",
				"rcst_grp_cd1",
				"rcst_grp_nm1",
				"rcst_grp_cd2",
				"rcst_grp_nm2",
				"rcst_grp_cd3",
				"rcst_grp_nm3",
				"rcst_grp_cd4",
				"rcst_grp_nm4",
				"rcst_grp_cd5",
				"rcst_grp_nm5",
				"rcst_grp_cd6",
				"rcst_grp_nm6",
				"rcst_grp_cd7",
				"rcst_grp_nm7",
				"rcst_grp_cd8",
				"rcst_grp_nm8",
				"rcst_grp_cd9",
				"rcst_grp_nm9",
				"rcst_grp_cd10",
				"rcst_grp_nm10",
				"bcst_grp_cd1",
				"bcst_grp_nm1",
				"bcst_grp_cd2",
				"bcst_grp_nm2",
				"bcst_grp_cd3",
				"bcst_grp_nm3",
				"bcst_grp_cd4",
				"bcst_grp_nm4",
				"bcst_grp_cd5",
				"bcst_grp_nm5",
				"bcst_grp_cd6",
				"bcst_grp_nm6",
				"bcst_grp_cd7",
				"bcst_grp_nm7",
				"bcst_grp_cd8",
				"bcst_grp_nm8",
				"bcst_grp_cd9",
				"bcst_grp_nm9",
				"bcst_grp_cd10",
				"bcst_grp_nm10"
			},
			{
				$subttl1,
				$subttl2,
				$tax_amt,
				$tax_diff_amt,
				$base_cur_subttl1,
				$base_cur_subttl2,
				$base_cur_tax_amt,
				$base_cur_tax_diff_amt,
				$rtn_sts_typ,
				$rcst_grp_cd1,
				$rcst_grp_nm1,
				$rcst_grp_cd2,
				$rcst_grp_nm2,
				$rcst_grp_cd3,
				$rcst_grp_nm3,
				$rcst_grp_cd4,
				$rcst_grp_nm4,
				$rcst_grp_cd5,
				$rcst_grp_nm5,
				$rcst_grp_cd6,
				$rcst_grp_nm6,
				$rcst_grp_cd7,
				$rcst_grp_nm7,
				$rcst_grp_cd8,
				$rcst_grp_nm8,
				$rcst_grp_cd9,
				$rcst_grp_nm9,
				$rcst_grp_cd10,
				$rcst_grp_nm10,
				$bcst_grp_cd1,
				$bcst_grp_nm1,
				$bcst_grp_cd2,
				$bcst_grp_nm2,
				$bcst_grp_cd3,
				$bcst_grp_nm3,
				$bcst_grp_cd4,
				$bcst_grp_nm4,
				$bcst_grp_cd5,
				$bcst_grp_nm5,
				$bcst_grp_cd6,
				$bcst_grp_nm6,
				$bcst_grp_cd7,
				$bcst_grp_nm7,
				$bcst_grp_cd8,
				$bcst_grp_nm8,
				$bcst_grp_cd9,
				$bcst_grp_nm9,
				$bcst_grp_cd10,
				$bcst_grp_nm10
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
				{$base_cur_cd, "BASE_CUR"},	// base_cur_cd
				{$base_cur_nm, "BASE_CUR"},	// base_cur_nm
				{$base_cur_amt_dec_place, "BASE_CUR"},	// base_cur_amt_dec_place
				{$base_cur_subttl1_p + ".amt", "BASE_CUR"},	// base_cur_subttl1_p.amt
				{$base_cur_subttl2_p + ".amt", "BASE_CUR"},	// base_cur_subttl2_p.amt
				{$base_cur_tax_amt_p + ".amt", "BASE_CUR"},	// base_cur_tax_amt_p.amt
				{$base_cur_tax_diff_amt_p + ".amt", "BASE_CUR"},	// base_cur_tax_diff_amt_p.amt
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
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 1, $slip_sts_typ);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 1, $slip_sts_typ, value);
	}


	/**
	 * Slip status type name 伝票状況区分名.<p>
	 *
	 */
	public String slip_sts_typ_nm() {
		return getConstString(offset + 2, $slip_sts_typ_nm);
	}

	/**
	 * Slip status type name 伝票状況区分名.<p>
	 *
	 */
	public void slip_sts_typ_nm(String value) {
		setConstString(offset + 2, $slip_sts_typ_nm, value);
	}


	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public String rcv_act_no() {
		return getConstString(offset + 3, $rcv_act_no);
	}

	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public void rcv_act_no(String value) {
		setConstString(offset + 3, $rcv_act_no, value);
	}


	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public MCNumber rcv_act_seq() {
		return getConstNumber(offset + 4, $rcv_act_seq);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 4, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(int value) {
		setConstNumber(offset + 4, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(long value) {
		setConstNumber(offset + 4, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(float value) {
		setConstNumber(offset + 4, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(double value) {
		setConstNumber(offset + 4, $rcv_act_seq, value);
	}


	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public MCNumber rcv_act_rev() {
		return getConstNumber(offset + 5, $rcv_act_rev);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(MCNumber value) {
		setConstNumber(offset + 5, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(int value) {
		setConstNumber(offset + 5, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(long value) {
		setConstNumber(offset + 5, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(float value) {
		setConstNumber(offset + 5, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(double value) {
		setConstNumber(offset + 5, $rcv_act_rev, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 6, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 6, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 7, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 7, $trd_nm, value);
	}


	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCDate rcv_dt() {
		return getConstDate(offset + 8, $rcv_dt);
	}

	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public void rcv_dt(MCDate value) {
		setConstDate(offset + 8, $rcv_dt, value);
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 9, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 9, $ac_ym, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 10, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 10, $ac_dt, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 11, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 11, $trd_ptn_typ, value);
	}


	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 12, $rcst_cd);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 12, $rcst_cd, value);
	}


	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public String rcst_nm() {
		return getConstString(offset + 13, $rcst_nm);
	}

	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public void rcst_nm(String value) {
		setConstString(offset + 13, $rcst_nm, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 14, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 14, $bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 15, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 15, $bcst_nm, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 16, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 16, $bill_dpt_cd, value);
	}


	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 17, $bill_dpt_nm);
	}

	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 17, $bill_dpt_nm, value);
	}


	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public String ar_sttl_cd1() {
		return getConstString(offset + 18, $ar_sttl_cd1);
	}

	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public void ar_sttl_cd1(String value) {
		setConstString(offset + 18, $ar_sttl_cd1, value);
	}


	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public String ar_sttl_nm1() {
		return getConstString(offset + 19, $ar_sttl_nm1);
	}

	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public void ar_sttl_nm1(String value) {
		setConstString(offset + 19, $ar_sttl_nm1, value);
	}


	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 20, $rcv_no);
	}

	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 20, $rcv_no, value);
	}


	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 21, $note_no);
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 21, $note_no, value);
	}


	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 22, $bank_ac_cd);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 22, $bank_ac_cd, value);
	}


	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public String bank_ac_nm() {
		return getConstString(offset + 23, $bank_ac_nm);
	}

	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public void bank_ac_nm(String value) {
		setConstString(offset + 23, $bank_ac_nm, value);
	}


	/**
	 * Bank account number 口座番号.<p>
	 *
	 */
	public String bank_ac_no() {
		return getConstString(offset + 24, $bank_ac_no);
	}

	/**
	 * Bank account number 口座番号.<p>
	 *
	 */
	public void bank_ac_no(String value) {
		setConstString(offset + 24, $bank_ac_no, value);
	}


	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public String ar_sttl_cd2() {
		return getConstString(offset + 25, $ar_sttl_cd2);
	}

	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public void ar_sttl_cd2(String value) {
		setConstString(offset + 25, $ar_sttl_cd2, value);
	}


	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public String ar_sttl_nm2() {
		return getConstString(offset + 26, $ar_sttl_nm2);
	}

	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public void ar_sttl_nm2(String value) {
		setConstString(offset + 26, $ar_sttl_nm2, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 27, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 27, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 28, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 28, $trd_cur_nm, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 29, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 29, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 29, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 29, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 29, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 29, $amt_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR subttl1_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 30, $subttl1_p);
	}
	
	public void subttl1_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 30, $subttl1_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR subttl2_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 31, $subttl2_p);
	}
	
	public void subttl2_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 31, $subttl2_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 32, $tax_amt_p);
	}
	
	public void tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 32, $tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR tax_diff_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 33, $tax_diff_amt_p);
	}
	
	public void tax_diff_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 33, $tax_diff_amt_p, row);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 34, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 34, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 35, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 35, $base_cur_nm, value);
	}


	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_amt_dec_place() {
		return getConstNumber(offset + 36, $base_cur_amt_dec_place);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 36, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(int value) {
		setConstNumber(offset + 36, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(long value) {
		setConstNumber(offset + 36, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(float value) {
		setConstNumber(offset + 36, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(double value) {
		setConstNumber(offset + 36, $base_cur_amt_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_subttl1_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 37, $base_cur_subttl1_p);
	}
	
	public void base_cur_subttl1_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 37, $base_cur_subttl1_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_subttl2_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 38, $base_cur_subttl2_p);
	}
	
	public void base_cur_subttl2_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 38, $base_cur_subttl2_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 39, $base_cur_tax_amt_p);
	}
	
	public void base_cur_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 39, $base_cur_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_tax_diff_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 40, $base_cur_tax_diff_amt_p);
	}
	
	public void base_cur_tax_diff_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 40, $base_cur_tax_diff_amt_p, row);
	}


	/**
	 * Transfer payment received result No. 振替先入金実績ＮＯ.<p>
	 *
	 */
	public String sw_to_rcv_act_no() {
		return getConstString(offset + 41, $sw_to_rcv_act_no);
	}

	/**
	 * Transfer payment received result No. 振替先入金実績ＮＯ.<p>
	 *
	 */
	public void sw_to_rcv_act_no(String value) {
		setConstString(offset + 41, $sw_to_rcv_act_no, value);
	}


	/**
	 * Transfer transaction cd. 振替先取引ＣＤ.<p>
	 *
	 */
	public String sw_to_trd_cd() {
		return getConstString(offset + 42, $sw_to_trd_cd);
	}

	/**
	 * Transfer transaction cd. 振替先取引ＣＤ.<p>
	 *
	 */
	public void sw_to_trd_cd(String value) {
		setConstString(offset + 42, $sw_to_trd_cd, value);
	}


	/**
	 * Transfer transaction name 振替先取引名.<p>
	 *
	 */
	public String sw_to_trd_nm() {
		return getConstString(offset + 43, $sw_to_trd_nm);
	}

	/**
	 * Transfer transaction name 振替先取引名.<p>
	 *
	 */
	public void sw_to_trd_nm(String value) {
		setConstString(offset + 43, $sw_to_trd_nm, value);
	}


	/**
	 * Transfer cd. 振替先ＣＤ.<p>
	 *
	 */
	public String sw_to_bcst_cd() {
		return getConstString(offset + 44, $sw_to_bcst_cd);
	}

	/**
	 * Transfer cd. 振替先ＣＤ.<p>
	 *
	 */
	public void sw_to_bcst_cd(String value) {
		setConstString(offset + 44, $sw_to_bcst_cd, value);
	}


	/**
	 * Transfer name 振替先名.<p>
	 *
	 */
	public String sw_to_bcst_nm() {
		return getConstString(offset + 45, $sw_to_bcst_nm);
	}

	/**
	 * Transfer name 振替先名.<p>
	 *
	 */
	public void sw_to_bcst_nm(String value) {
		setConstString(offset + 45, $sw_to_bcst_nm, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 46, $usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 46, $usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 47, $usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 47, $usr_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 48, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 48, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 49, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 49, $dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 50, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 50, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 51, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 51, $wg_nm, value);
	}


	/**
	 * Source incoming payment result No. 発生入金ＮＯ.<p>
	 *
	 */
	public String gen_rcv_no() {
		return getConstString(offset + 52, $gen_rcv_no);
	}

	/**
	 * Source incoming payment result No. 発生入金ＮＯ.<p>
	 *
	 */
	public void gen_rcv_no(String value) {
		setConstString(offset + 52, $gen_rcv_no, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 53, $prnt_flg);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 53, $prnt_flg, value);
	}


	/**
	 * Auto-reconciliation 入金自動消込.<p>
	 *
	 */
	public boolean rcv_auto_appl_flg() {
		return getConstBoolean(offset + 54, $rcv_auto_appl_flg);
	}

	/**
	 * Auto-reconciliation 入金自動消込.<p>
	 *
	 */
	public void rcv_auto_appl_flg(boolean value) {
		setConstBoolean(offset + 54, $rcv_auto_appl_flg, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 55, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 55, $trd_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 56, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 56, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 57, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 57, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 58, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 58, $sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 59, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 59, $rts_msg_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR rcst_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 60, $rcst_grp_p);
	}
	
	public void rcst_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 60, $rcst_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR bcst_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 61, $bcst_grp_p);
	}
	
	public void bcst_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 61, $bcst_grp_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 62, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 62, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 63, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 63, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 64, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 64, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 65, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 65, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 66, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 66, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 67, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 67, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 68, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 68, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 69, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 69, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 70, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 70, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 71, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 71, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 72, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 72, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			return ar_sttl_nm1();
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			return bank_ac_no();
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			return ar_sttl_cd2();
		}
		if ($ar_sttl_nm2.equalsIgnoreCase(name)) {
			return ar_sttl_nm2();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($sw_to_rcv_act_no.equalsIgnoreCase(name)) {
			return sw_to_rcv_act_no();
		}
		if ($sw_to_trd_cd.equalsIgnoreCase(name)) {
			return sw_to_trd_cd();
		}
		if ($sw_to_trd_nm.equalsIgnoreCase(name)) {
			return sw_to_trd_nm();
		}
		if ($sw_to_bcst_cd.equalsIgnoreCase(name)) {
			return sw_to_bcst_cd();
		}
		if ($sw_to_bcst_nm.equalsIgnoreCase(name)) {
			return sw_to_bcst_nm();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($gen_rcv_no.equalsIgnoreCase(name)) {
			return gen_rcv_no();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
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
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			return rcv_act_rev();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
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
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($rcv_auto_appl_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			return ar_sttl_nm1();
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			return bank_ac_no();
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			return ar_sttl_cd2();
		}
		if ($ar_sttl_nm2.equalsIgnoreCase(name)) {
			return ar_sttl_nm2();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($sw_to_rcv_act_no.equalsIgnoreCase(name)) {
			return sw_to_rcv_act_no();
		}
		if ($sw_to_trd_cd.equalsIgnoreCase(name)) {
			return sw_to_trd_cd();
		}
		if ($sw_to_trd_nm.equalsIgnoreCase(name)) {
			return sw_to_trd_nm();
		}
		if ($sw_to_bcst_cd.equalsIgnoreCase(name)) {
			return sw_to_bcst_cd();
		}
		if ($sw_to_bcst_nm.equalsIgnoreCase(name)) {
			return sw_to_bcst_nm();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($gen_rcv_no.equalsIgnoreCase(name)) {
			return gen_rcv_no();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
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
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			return rcv_act_rev();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
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
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($rcv_auto_appl_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
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
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			ar_sttl_nm1(value);
			return;
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			bank_ac_no(value);
			return;
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			ar_sttl_cd2(value);
			return;
		}
		if ($ar_sttl_nm2.equalsIgnoreCase(name)) {
			ar_sttl_nm2(value);
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
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($sw_to_rcv_act_no.equalsIgnoreCase(name)) {
			sw_to_rcv_act_no(value);
			return;
		}
		if ($sw_to_trd_cd.equalsIgnoreCase(name)) {
			sw_to_trd_cd(value);
			return;
		}
		if ($sw_to_trd_nm.equalsIgnoreCase(name)) {
			sw_to_trd_nm(value);
			return;
		}
		if ($sw_to_bcst_cd.equalsIgnoreCase(name)) {
			sw_to_bcst_cd(value);
			return;
		}
		if ($sw_to_bcst_nm.equalsIgnoreCase(name)) {
			sw_to_bcst_nm(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($gen_rcv_no.equalsIgnoreCase(name)) {
			gen_rcv_no(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
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
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
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
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($rcv_auto_appl_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
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
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			ar_sttl_nm1(value);
			return;
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			bank_ac_no(value);
			return;
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			ar_sttl_cd2(value);
			return;
		}
		if ($ar_sttl_nm2.equalsIgnoreCase(name)) {
			ar_sttl_nm2(value);
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
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($sw_to_rcv_act_no.equalsIgnoreCase(name)) {
			sw_to_rcv_act_no(value);
			return;
		}
		if ($sw_to_trd_cd.equalsIgnoreCase(name)) {
			sw_to_trd_cd(value);
			return;
		}
		if ($sw_to_trd_nm.equalsIgnoreCase(name)) {
			sw_to_trd_nm(value);
			return;
		}
		if ($sw_to_bcst_cd.equalsIgnoreCase(name)) {
			sw_to_bcst_cd(value);
			return;
		}
		if ($sw_to_bcst_nm.equalsIgnoreCase(name)) {
			sw_to_bcst_nm(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($gen_rcv_no.equalsIgnoreCase(name)) {
			gen_rcv_no(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
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
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
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
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($rcv_auto_appl_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($subttl1_p.equalsIgnoreCase(name)) {
			return subttl1_p();
		}
		if ($subttl2_p.equalsIgnoreCase(name)) {
			return subttl2_p();
		}
		if ($tax_amt_p.equalsIgnoreCase(name)) {
			return tax_amt_p();
		}
		if ($tax_diff_amt_p.equalsIgnoreCase(name)) {
			return tax_diff_amt_p();
		}
		if ($base_cur_subttl1_p.equalsIgnoreCase(name)) {
			return base_cur_subttl1_p();
		}
		if ($base_cur_subttl2_p.equalsIgnoreCase(name)) {
			return base_cur_subttl2_p();
		}
		if ($base_cur_tax_amt_p.equalsIgnoreCase(name)) {
			return base_cur_tax_amt_p();
		}
		if ($base_cur_tax_diff_amt_p.equalsIgnoreCase(name)) {
			return base_cur_tax_diff_amt_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
		}
		if ($rcst_grp_p.equalsIgnoreCase(name)) {
			return rcst_grp_p();
		}
		if ($bcst_grp_p.equalsIgnoreCase(name)) {
			return bcst_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($subttl1_p.equalsIgnoreCase(name)) {
			subttl1_p(
				((MCContainerMeta) subttl1_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($subttl2_p.equalsIgnoreCase(name)) {
			subttl2_p(
				((MCContainerMeta) subttl2_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($tax_amt_p.equalsIgnoreCase(name)) {
			tax_amt_p(
				((MCContainerMeta) tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($tax_diff_amt_p.equalsIgnoreCase(name)) {
			tax_diff_amt_p(
				((MCContainerMeta) tax_diff_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_subttl1_p.equalsIgnoreCase(name)) {
			base_cur_subttl1_p(
				((MCContainerMeta) base_cur_subttl1_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_subttl2_p.equalsIgnoreCase(name)) {
			base_cur_subttl2_p(
				((MCContainerMeta) base_cur_subttl2_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_tax_amt_p.equalsIgnoreCase(name)) {
			base_cur_tax_amt_p(
				((MCContainerMeta) base_cur_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_tax_diff_amt_p.equalsIgnoreCase(name)) {
			base_cur_tax_diff_amt_p(
				((MCContainerMeta) base_cur_tax_diff_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
			);
			return;
		}
		if ($rcst_grp_p.equalsIgnoreCase(name)) {
			rcst_grp_p(
				((MCContainerMeta) rcst_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		if ($bcst_grp_p.equalsIgnoreCase(name)) {
			bcst_grp_p(
				((MCContainerMeta) bcst_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public MCNumber subttl1() {
		return subttl1_p().amt();
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void subttl1(MCNumber value) {
		subttl1_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void subttl1(int value) {
		subttl1_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void subttl1(long value) {
		subttl1_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void subttl1(float value) {
		subttl1_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void subttl1(double value) {
		subttl1_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public MCNumber subttl2() {
		return subttl2_p().amt();
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void subttl2(MCNumber value) {
		subttl2_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void subttl2(int value) {
		subttl2_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void subttl2(long value) {
		subttl2_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void subttl2(float value) {
		subttl2_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void subttl2(double value) {
		subttl2_p().amt(value);
	}

	/**
	 * Tax inclusive amount 内税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return tax_amt_p().amt();
	}

	/**
	 * Tax inclusive amount 内税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Tax inclusive amount 内税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Tax inclusive amount 内税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Tax inclusive amount 内税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Tax inclusive amount 内税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Tax difference 税差額.<p>
	 *
	 */
	public MCNumber tax_diff_amt() {
		return tax_diff_amt_p().amt();
	}

	/**
	 * Tax difference 税差額.<p>
	 *
	 */
	public void tax_diff_amt(MCNumber value) {
		tax_diff_amt_p().amt(value);
	}

	/**
	 * Tax difference 税差額.<p>
	 *
	 */
	public void tax_diff_amt(int value) {
		tax_diff_amt_p().amt(value);
	}

	/**
	 * Tax difference 税差額.<p>
	 *
	 */
	public void tax_diff_amt(long value) {
		tax_diff_amt_p().amt(value);
	}

	/**
	 * Tax difference 税差額.<p>
	 *
	 */
	public void tax_diff_amt(float value) {
		tax_diff_amt_p().amt(value);
	}

	/**
	 * Tax difference 税差額.<p>
	 *
	 */
	public void tax_diff_amt(double value) {
		tax_diff_amt_p().amt(value);
	}

	/**
	 * Payment received amount (Base currency) 基準通貨入金額.<p>
	 *
	 */
	public MCNumber base_cur_subttl1() {
		return base_cur_subttl1_p().amt();
	}

	/**
	 * Payment received amount (Base currency) 基準通貨入金額.<p>
	 *
	 */
	public void base_cur_subttl1(MCNumber value) {
		base_cur_subttl1_p().amt(value);
	}

	/**
	 * Payment received amount (Base currency) 基準通貨入金額.<p>
	 *
	 */
	public void base_cur_subttl1(int value) {
		base_cur_subttl1_p().amt(value);
	}

	/**
	 * Payment received amount (Base currency) 基準通貨入金額.<p>
	 *
	 */
	public void base_cur_subttl1(long value) {
		base_cur_subttl1_p().amt(value);
	}

	/**
	 * Payment received amount (Base currency) 基準通貨入金額.<p>
	 *
	 */
	public void base_cur_subttl1(float value) {
		base_cur_subttl1_p().amt(value);
	}

	/**
	 * Payment received amount (Base currency) 基準通貨入金額.<p>
	 *
	 */
	public void base_cur_subttl1(double value) {
		base_cur_subttl1_p().amt(value);
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺額.<p>
	 *
	 */
	public MCNumber base_cur_subttl2() {
		return base_cur_subttl2_p().amt();
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺額.<p>
	 *
	 */
	public void base_cur_subttl2(MCNumber value) {
		base_cur_subttl2_p().amt(value);
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺額.<p>
	 *
	 */
	public void base_cur_subttl2(int value) {
		base_cur_subttl2_p().amt(value);
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺額.<p>
	 *
	 */
	public void base_cur_subttl2(long value) {
		base_cur_subttl2_p().amt(value);
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺額.<p>
	 *
	 */
	public void base_cur_subttl2(float value) {
		base_cur_subttl2_p().amt(value);
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺額.<p>
	 *
	 */
	public void base_cur_subttl2(double value) {
		base_cur_subttl2_p().amt(value);
	}

	/**
	 * Tax inclusive amount (Base currency) 基準通貨内税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return base_cur_tax_amt_p().amt();
	}

	/**
	 * Tax inclusive amount (Base currency) 基準通貨内税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax inclusive amount (Base currency) 基準通貨内税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax inclusive amount (Base currency) 基準通貨内税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax inclusive amount (Base currency) 基準通貨内税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax inclusive amount (Base currency) 基準通貨内税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax difference (Base currency) 基準通貨税差額.<p>
	 *
	 */
	public MCNumber base_cur_tax_diff_amt() {
		return base_cur_tax_diff_amt_p().amt();
	}

	/**
	 * Tax difference (Base currency) 基準通貨税差額.<p>
	 *
	 */
	public void base_cur_tax_diff_amt(MCNumber value) {
		base_cur_tax_diff_amt_p().amt(value);
	}

	/**
	 * Tax difference (Base currency) 基準通貨税差額.<p>
	 *
	 */
	public void base_cur_tax_diff_amt(int value) {
		base_cur_tax_diff_amt_p().amt(value);
	}

	/**
	 * Tax difference (Base currency) 基準通貨税差額.<p>
	 *
	 */
	public void base_cur_tax_diff_amt(long value) {
		base_cur_tax_diff_amt_p().amt(value);
	}

	/**
	 * Tax difference (Base currency) 基準通貨税差額.<p>
	 *
	 */
	public void base_cur_tax_diff_amt(float value) {
		base_cur_tax_diff_amt_p().amt(value);
	}

	/**
	 * Tax difference (Base currency) 基準通貨税差額.<p>
	 *
	 */
	public void base_cur_tax_diff_amt(double value) {
		base_cur_tax_diff_amt_p().amt(value);
	}

	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
	}

	/**
	 * Payer classification cd. 1 入金先分類ＣＤ１.<p>
	 *
	 */
	public String rcst_grp_cd1() {
		return rcst_grp_p().bp_grp_cd1();
	}

	/**
	 * Payer classification cd. 1 入金先分類ＣＤ１.<p>
	 *
	 */
	public void rcst_grp_cd1(String value) {
		rcst_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Payer classification name 1 入金先分類名１.<p>
	 *
	 */
	public String rcst_grp_nm1() {
		return rcst_grp_p().bp_grp_nm1();
	}

	/**
	 * Payer classification name 1 入金先分類名１.<p>
	 *
	 */
	public void rcst_grp_nm1(String value) {
		rcst_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Payer classification cd. 2 入金先分類ＣＤ２.<p>
	 *
	 */
	public String rcst_grp_cd2() {
		return rcst_grp_p().bp_grp_cd2();
	}

	/**
	 * Payer classification cd. 2 入金先分類ＣＤ２.<p>
	 *
	 */
	public void rcst_grp_cd2(String value) {
		rcst_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Payer classification name 2 入金先分類名２.<p>
	 *
	 */
	public String rcst_grp_nm2() {
		return rcst_grp_p().bp_grp_nm2();
	}

	/**
	 * Payer classification name 2 入金先分類名２.<p>
	 *
	 */
	public void rcst_grp_nm2(String value) {
		rcst_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Payer classification cd. 3 入金先分類ＣＤ３.<p>
	 *
	 */
	public String rcst_grp_cd3() {
		return rcst_grp_p().bp_grp_cd3();
	}

	/**
	 * Payer classification cd. 3 入金先分類ＣＤ３.<p>
	 *
	 */
	public void rcst_grp_cd3(String value) {
		rcst_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Payer classification name 3 入金先分類名３.<p>
	 *
	 */
	public String rcst_grp_nm3() {
		return rcst_grp_p().bp_grp_nm3();
	}

	/**
	 * Payer classification name 3 入金先分類名３.<p>
	 *
	 */
	public void rcst_grp_nm3(String value) {
		rcst_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Payer classification cd. 4 入金先分類ＣＤ４.<p>
	 *
	 */
	public String rcst_grp_cd4() {
		return rcst_grp_p().bp_grp_cd4();
	}

	/**
	 * Payer classification cd. 4 入金先分類ＣＤ４.<p>
	 *
	 */
	public void rcst_grp_cd4(String value) {
		rcst_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Payer classification name 4 入金先分類名４.<p>
	 *
	 */
	public String rcst_grp_nm4() {
		return rcst_grp_p().bp_grp_nm4();
	}

	/**
	 * Payer classification name 4 入金先分類名４.<p>
	 *
	 */
	public void rcst_grp_nm4(String value) {
		rcst_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Payer classification cd. 5 入金先分類ＣＤ５.<p>
	 *
	 */
	public String rcst_grp_cd5() {
		return rcst_grp_p().bp_grp_cd5();
	}

	/**
	 * Payer classification cd. 5 入金先分類ＣＤ５.<p>
	 *
	 */
	public void rcst_grp_cd5(String value) {
		rcst_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Payer classification name 5 入金先分類名５.<p>
	 *
	 */
	public String rcst_grp_nm5() {
		return rcst_grp_p().bp_grp_nm5();
	}

	/**
	 * Payer classification name 5 入金先分類名５.<p>
	 *
	 */
	public void rcst_grp_nm5(String value) {
		rcst_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Payer classification cd. 6 入金先分類ＣＤ６.<p>
	 *
	 */
	public String rcst_grp_cd6() {
		return rcst_grp_p().bp_grp_cd6();
	}

	/**
	 * Payer classification cd. 6 入金先分類ＣＤ６.<p>
	 *
	 */
	public void rcst_grp_cd6(String value) {
		rcst_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Payer classification name 6 入金先分類名６.<p>
	 *
	 */
	public String rcst_grp_nm6() {
		return rcst_grp_p().bp_grp_nm6();
	}

	/**
	 * Payer classification name 6 入金先分類名６.<p>
	 *
	 */
	public void rcst_grp_nm6(String value) {
		rcst_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Payer classification cd. 7 入金先分類ＣＤ７.<p>
	 *
	 */
	public String rcst_grp_cd7() {
		return rcst_grp_p().bp_grp_cd7();
	}

	/**
	 * Payer classification cd. 7 入金先分類ＣＤ７.<p>
	 *
	 */
	public void rcst_grp_cd7(String value) {
		rcst_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Payer classification name 7 入金先分類名７.<p>
	 *
	 */
	public String rcst_grp_nm7() {
		return rcst_grp_p().bp_grp_nm7();
	}

	/**
	 * Payer classification name 7 入金先分類名７.<p>
	 *
	 */
	public void rcst_grp_nm7(String value) {
		rcst_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Payer classification cd. 8 入金先分類ＣＤ８.<p>
	 *
	 */
	public String rcst_grp_cd8() {
		return rcst_grp_p().bp_grp_cd8();
	}

	/**
	 * Payer classification cd. 8 入金先分類ＣＤ８.<p>
	 *
	 */
	public void rcst_grp_cd8(String value) {
		rcst_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Payer classification name 8 入金先分類名８.<p>
	 *
	 */
	public String rcst_grp_nm8() {
		return rcst_grp_p().bp_grp_nm8();
	}

	/**
	 * Payer classification name 8 入金先分類名８.<p>
	 *
	 */
	public void rcst_grp_nm8(String value) {
		rcst_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Payer classification cd. 9 入金先分類ＣＤ９.<p>
	 *
	 */
	public String rcst_grp_cd9() {
		return rcst_grp_p().bp_grp_cd9();
	}

	/**
	 * Payer classification cd. 9 入金先分類ＣＤ９.<p>
	 *
	 */
	public void rcst_grp_cd9(String value) {
		rcst_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Payer classification name 9 入金先分類名９.<p>
	 *
	 */
	public String rcst_grp_nm9() {
		return rcst_grp_p().bp_grp_nm9();
	}

	/**
	 * Payer classification name 9 入金先分類名９.<p>
	 *
	 */
	public void rcst_grp_nm9(String value) {
		rcst_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Payer classification cd. 10 入金先分類ＣＤ１０.<p>
	 *
	 */
	public String rcst_grp_cd10() {
		return rcst_grp_p().bp_grp_cd10();
	}

	/**
	 * Payer classification cd. 10 入金先分類ＣＤ１０.<p>
	 *
	 */
	public void rcst_grp_cd10(String value) {
		rcst_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Payer classification name 10 入金先分類名１０.<p>
	 *
	 */
	public String rcst_grp_nm10() {
		return rcst_grp_p().bp_grp_nm10();
	}

	/**
	 * Payer classification name 10 入金先分類名１０.<p>
	 *
	 */
	public void rcst_grp_nm10(String value) {
		rcst_grp_p().bp_grp_nm10(value);
	}

	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public String bcst_grp_cd1() {
		return bcst_grp_p().bp_grp_cd1();
	}

	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public void bcst_grp_cd1(String value) {
		bcst_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public String bcst_grp_nm1() {
		return bcst_grp_p().bp_grp_nm1();
	}

	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public void bcst_grp_nm1(String value) {
		bcst_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public String bcst_grp_cd2() {
		return bcst_grp_p().bp_grp_cd2();
	}

	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public void bcst_grp_cd2(String value) {
		bcst_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public String bcst_grp_nm2() {
		return bcst_grp_p().bp_grp_nm2();
	}

	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public void bcst_grp_nm2(String value) {
		bcst_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public String bcst_grp_cd3() {
		return bcst_grp_p().bp_grp_cd3();
	}

	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public void bcst_grp_cd3(String value) {
		bcst_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public String bcst_grp_nm3() {
		return bcst_grp_p().bp_grp_nm3();
	}

	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public void bcst_grp_nm3(String value) {
		bcst_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public String bcst_grp_cd4() {
		return bcst_grp_p().bp_grp_cd4();
	}

	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public void bcst_grp_cd4(String value) {
		bcst_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public String bcst_grp_nm4() {
		return bcst_grp_p().bp_grp_nm4();
	}

	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public void bcst_grp_nm4(String value) {
		bcst_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public String bcst_grp_cd5() {
		return bcst_grp_p().bp_grp_cd5();
	}

	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public void bcst_grp_cd5(String value) {
		bcst_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public String bcst_grp_nm5() {
		return bcst_grp_p().bp_grp_nm5();
	}

	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public void bcst_grp_nm5(String value) {
		bcst_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public String bcst_grp_cd6() {
		return bcst_grp_p().bp_grp_cd6();
	}

	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public void bcst_grp_cd6(String value) {
		bcst_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public String bcst_grp_nm6() {
		return bcst_grp_p().bp_grp_nm6();
	}

	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public void bcst_grp_nm6(String value) {
		bcst_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public String bcst_grp_cd7() {
		return bcst_grp_p().bp_grp_cd7();
	}

	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public void bcst_grp_cd7(String value) {
		bcst_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public String bcst_grp_nm7() {
		return bcst_grp_p().bp_grp_nm7();
	}

	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public void bcst_grp_nm7(String value) {
		bcst_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public String bcst_grp_cd8() {
		return bcst_grp_p().bp_grp_cd8();
	}

	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public void bcst_grp_cd8(String value) {
		bcst_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public String bcst_grp_nm8() {
		return bcst_grp_p().bp_grp_nm8();
	}

	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public void bcst_grp_nm8(String value) {
		bcst_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public String bcst_grp_cd9() {
		return bcst_grp_p().bp_grp_cd9();
	}

	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public void bcst_grp_cd9(String value) {
		bcst_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public String bcst_grp_nm9() {
		return bcst_grp_p().bp_grp_nm9();
	}

	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public void bcst_grp_nm9(String value) {
		bcst_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public String bcst_grp_cd10() {
		return bcst_grp_p().bp_grp_cd10();
	}

	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public void bcst_grp_cd10(String value) {
		bcst_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public String bcst_grp_nm10() {
		return bcst_grp_p().bp_grp_nm10();
	}

	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public void bcst_grp_nm10(String value) {
		bcst_grp_p().bp_grp_nm10(value);
	}

}

