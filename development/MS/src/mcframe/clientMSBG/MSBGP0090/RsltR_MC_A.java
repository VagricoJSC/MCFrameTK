package mcframe.clientMSBG.MSBGP0090;

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
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public static final String $ar_dpt_nm = "ar_dpt_nm";
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
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public static final String $acst_nm = "acst_nm";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
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
	public static final String $wrk_no_p = "wrk_no_p";
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public static final String $ar_typ_nm = "ar_typ_nm";
	public static final String $init_bal_p = "init_bal_p";
	public static final String $amt_p = "amt_p";
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public static final String $cl_day = "cl_day";
	public static final String $bef_cl_sls_amt_p = "bef_cl_sls_amt_p";
	public static final String $aft_cl_sls_amt_p = "aft_cl_sls_amt_p";
	public static final String $end_bal_p = "end_bal_p";
	public static final String $not_appl_note_p = "not_appl_note_p";
	public static final String $mly_not_appl_note_p = "mly_not_appl_note_p";
	public static final String $cash_amt_p = "cash_amt_p";
	public static final String $note_amt_p = "note_amt_p";
	public static final String $xfr_amt_p = "xfr_amt_p";
	public static final String $setoff_amt_p = "setoff_amt_p";
	public static final String $sw_amt_p = "sw_amt_p";
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
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public static final String $base_amt_dec_place = "base_amt_dec_place";
	public static final String $base_cur_init_bal_p = "base_cur_init_bal_p";
	public static final String $base_cur_amt_p = "base_cur_amt_p";
	public static final String $base_cur_bef_cl_sls_amt_p = "base_cur_bef_cl_sls_amt_p";
	public static final String $base_cur_aft_cl_sls_amt_p = "base_cur_aft_cl_sls_amt_p";
	public static final String $base_cur_end_bal_p = "base_cur_end_bal_p";
	public static final String $base_cur_not_appl_note_p = "base_cur_not_appl_note_p";
	public static final String $base_cur_mly_not_appl_note_p = "base_cur_mly_not_appl_note_p";
	public static final String $base_cur_cash_amt_p = "base_cur_cash_amt_p";
	public static final String $base_cur_note_amt_p = "base_cur_note_amt_p";
	public static final String $base_cur_xfr_amt_p = "base_cur_xfr_amt_p";
	public static final String $base_cur_setoff_amt_p = "base_cur_setoff_amt_p";
	public static final String $base_cur_sw_amt_p = "base_cur_sw_amt_p";
	public static final String $exc_gain_loss_p = "exc_gain_loss_p";
	public static final String $total_exc_gain_loss_p = "total_exc_gain_loss_p";
	public static final String $acst_grp_p = "acst_grp_p";
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

	public static final String $wrk_no = $wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $wrk_no_p + ".wrk_nm";
	public static final String $init_bal = $init_bal_p + ".amt";
	public static final String $amt = $amt_p + ".amt";
	public static final String $bef_cl_sls_amt = $bef_cl_sls_amt_p + ".amt";
	public static final String $aft_cl_sls_amt = $aft_cl_sls_amt_p + ".amt";
	public static final String $end_bal = $end_bal_p + ".amt";
	public static final String $not_appl_note = $not_appl_note_p + ".amt";
	public static final String $mly_not_appl_note = $mly_not_appl_note_p + ".amt";
	public static final String $cash_amt = $cash_amt_p + ".amt";
	public static final String $note_amt = $note_amt_p + ".amt";
	public static final String $xfr_amt = $xfr_amt_p + ".amt";
	public static final String $setoff_amt = $setoff_amt_p + ".amt";
	public static final String $sw_amt = $sw_amt_p + ".amt";
	public static final String $base_cur_init_bal = $base_cur_init_bal_p + ".amt";
	public static final String $base_cur_amt = $base_cur_amt_p + ".amt";
	public static final String $base_cur_bef_cl_sls_amt = $base_cur_bef_cl_sls_amt_p + ".amt";
	public static final String $base_cur_aft_cl_sls_amt = $base_cur_aft_cl_sls_amt_p + ".amt";
	public static final String $base_cur_end_bal = $base_cur_end_bal_p + ".amt";
	public static final String $base_cur_not_appl_note = $base_cur_not_appl_note_p + ".amt";
	public static final String $base_cur_mly_not_appl_note = $base_cur_mly_not_appl_note_p + ".amt";
	public static final String $base_cur_cash_amt = $base_cur_cash_amt_p + ".amt";
	public static final String $base_cur_note_amt = $base_cur_note_amt_p + ".amt";
	public static final String $base_cur_xfr_amt = $base_cur_xfr_amt_p + ".amt";
	public static final String $base_cur_setoff_amt = $base_cur_setoff_amt_p + ".amt";
	public static final String $base_cur_sw_amt = $base_cur_sw_amt_p + ".amt";
	public static final String $exc_gain_loss = $exc_gain_loss_p + ".amt";
	public static final String $total_exc_gain_loss = $total_exc_gain_loss_p + ".amt";
	public static final String $acst_grp_cd1 = $acst_grp_p + ".bp_grp_cd1";
	public static final String $acst_grp_nm1 = $acst_grp_p + ".bp_grp_nm1";
	public static final String $acst_grp_cd2 = $acst_grp_p + ".bp_grp_cd2";
	public static final String $acst_grp_nm2 = $acst_grp_p + ".bp_grp_nm2";
	public static final String $acst_grp_cd3 = $acst_grp_p + ".bp_grp_cd3";
	public static final String $acst_grp_nm3 = $acst_grp_p + ".bp_grp_nm3";
	public static final String $acst_grp_cd4 = $acst_grp_p + ".bp_grp_cd4";
	public static final String $acst_grp_nm4 = $acst_grp_p + ".bp_grp_nm4";
	public static final String $acst_grp_cd5 = $acst_grp_p + ".bp_grp_cd5";
	public static final String $acst_grp_nm5 = $acst_grp_p + ".bp_grp_nm5";
	public static final String $acst_grp_cd6 = $acst_grp_p + ".bp_grp_cd6";
	public static final String $acst_grp_nm6 = $acst_grp_p + ".bp_grp_nm6";
	public static final String $acst_grp_cd7 = $acst_grp_p + ".bp_grp_cd7";
	public static final String $acst_grp_nm7 = $acst_grp_p + ".bp_grp_nm7";
	public static final String $acst_grp_cd8 = $acst_grp_p + ".bp_grp_cd8";
	public static final String $acst_grp_nm8 = $acst_grp_p + ".bp_grp_nm8";
	public static final String $acst_grp_cd9 = $acst_grp_p + ".bp_grp_cd9";
	public static final String $acst_grp_nm9 = $acst_grp_p + ".bp_grp_nm9";
	public static final String $acst_grp_cd10 = $acst_grp_p + ".bp_grp_cd10";
	public static final String $acst_grp_nm10 = $acst_grp_p + ".bp_grp_nm10";

	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_nm_META = createCommonMeta($ar_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_nm_META = createCommonMeta($acst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta wrk_no_p_META = createInnerRowMeta($wrk_no_p, mcframe.clientMSUB.MSUBP5010.WrkNoR.class);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta ar_typ_nm_META = createCommonMeta($ar_typ_nm, mcframe.commonMA.meta.MA_META.AR_TYP_NM);
	public static final MCMeta init_bal_p_META = createInnerRowMeta($init_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_p_META = createInnerRowMeta($amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta cl_day_META = createCommonMeta($cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bef_cl_sls_amt_p_META = createInnerRowMeta($bef_cl_sls_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta aft_cl_sls_amt_p_META = createInnerRowMeta($aft_cl_sls_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta end_bal_p_META = createInnerRowMeta($end_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta not_appl_note_p_META = createInnerRowMeta($not_appl_note_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta mly_not_appl_note_p_META = createInnerRowMeta($mly_not_appl_note_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta cash_amt_p_META = createInnerRowMeta($cash_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta note_amt_p_META = createInnerRowMeta($note_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xfr_amt_p_META = createInnerRowMeta($xfr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta setoff_amt_p_META = createInnerRowMeta($setoff_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta sw_amt_p_META = createInnerRowMeta($sw_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_amt_dec_place_META = createCommonMeta($base_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_init_bal_p_META = createInnerRowMeta($base_cur_init_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_amt_p_META = createInnerRowMeta($base_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_bef_cl_sls_amt_p_META = createInnerRowMeta($base_cur_bef_cl_sls_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_aft_cl_sls_amt_p_META = createInnerRowMeta($base_cur_aft_cl_sls_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_end_bal_p_META = createInnerRowMeta($base_cur_end_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_not_appl_note_p_META = createInnerRowMeta($base_cur_not_appl_note_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_mly_not_appl_note_p_META = createInnerRowMeta($base_cur_mly_not_appl_note_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_cash_amt_p_META = createInnerRowMeta($base_cur_cash_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_note_amt_p_META = createInnerRowMeta($base_cur_note_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_xfr_amt_p_META = createInnerRowMeta($base_cur_xfr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_setoff_amt_p_META = createInnerRowMeta($base_cur_setoff_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_sw_amt_p_META = createInnerRowMeta($base_cur_sw_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta exc_gain_loss_p_META = createInnerRowMeta($exc_gain_loss_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta total_exc_gain_loss_p_META = createInnerRowMeta($total_exc_gain_loss_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta acst_grp_p_META = createInnerRowMeta($acst_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
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
			ac_ym_META,
			ar_dpt_cd_META,
			ar_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			acst_cd_META,
			acst_nm_META,
			iv_no_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			amt_dec_place_META,
			wrk_no_p_META,
			ar_typ_META,
			ar_typ_nm_META,
			init_bal_p_META,
			amt_p_META,
			cl_day_META,
			bef_cl_sls_amt_p_META,
			aft_cl_sls_amt_p_META,
			end_bal_p_META,
			not_appl_note_p_META,
			mly_not_appl_note_p_META,
			cash_amt_p_META,
			note_amt_p_META,
			xfr_amt_p_META,
			setoff_amt_p_META,
			sw_amt_p_META,
			base_cur_cd_META,
			base_cur_nm_META,
			base_amt_dec_place_META,
			base_cur_init_bal_p_META,
			base_cur_amt_p_META,
			base_cur_bef_cl_sls_amt_p_META,
			base_cur_aft_cl_sls_amt_p_META,
			base_cur_end_bal_p_META,
			base_cur_not_appl_note_p_META,
			base_cur_mly_not_appl_note_p_META,
			base_cur_cash_amt_p_META,
			base_cur_note_amt_p_META,
			base_cur_xfr_amt_p_META,
			base_cur_setoff_amt_p_META,
			base_cur_sw_amt_p_META,
			exc_gain_loss_p_META,
			total_exc_gain_loss_p_META,
			acst_grp_p_META,
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
				"wrk_no",
				"wrk_nm",
				"init_bal",
				"amt",
				"bef_cl_sls_amt",
				"aft_cl_sls_amt",
				"end_bal",
				"not_appl_note",
				"mly_not_appl_note",
				"cash_amt",
				"note_amt",
				"xfr_amt",
				"setoff_amt",
				"sw_amt",
				"base_cur_init_bal",
				"base_cur_amt",
				"base_cur_bef_cl_sls_amt",
				"base_cur_aft_cl_sls_amt",
				"base_cur_end_bal",
				"base_cur_not_appl_note",
				"base_cur_mly_not_appl_note",
				"base_cur_cash_amt",
				"base_cur_note_amt",
				"base_cur_xfr_amt",
				"base_cur_setoff_amt",
				"base_cur_sw_amt",
				"exc_gain_loss",
				"total_exc_gain_loss",
				"acst_grp_cd1",
				"acst_grp_nm1",
				"acst_grp_cd2",
				"acst_grp_nm2",
				"acst_grp_cd3",
				"acst_grp_nm3",
				"acst_grp_cd4",
				"acst_grp_nm4",
				"acst_grp_cd5",
				"acst_grp_nm5",
				"acst_grp_cd6",
				"acst_grp_nm6",
				"acst_grp_cd7",
				"acst_grp_nm7",
				"acst_grp_cd8",
				"acst_grp_nm8",
				"acst_grp_cd9",
				"acst_grp_nm9",
				"acst_grp_cd10",
				"acst_grp_nm10"
			},
			{
				$wrk_no,
				$wrk_nm,
				$init_bal,
				$amt,
				$bef_cl_sls_amt,
				$aft_cl_sls_amt,
				$end_bal,
				$not_appl_note,
				$mly_not_appl_note,
				$cash_amt,
				$note_amt,
				$xfr_amt,
				$setoff_amt,
				$sw_amt,
				$base_cur_init_bal,
				$base_cur_amt,
				$base_cur_bef_cl_sls_amt,
				$base_cur_aft_cl_sls_amt,
				$base_cur_end_bal,
				$base_cur_not_appl_note,
				$base_cur_mly_not_appl_note,
				$base_cur_cash_amt,
				$base_cur_note_amt,
				$base_cur_xfr_amt,
				$base_cur_setoff_amt,
				$base_cur_sw_amt,
				$exc_gain_loss,
				$total_exc_gain_loss,
				$acst_grp_cd1,
				$acst_grp_nm1,
				$acst_grp_cd2,
				$acst_grp_nm2,
				$acst_grp_cd3,
				$acst_grp_nm3,
				$acst_grp_cd4,
				$acst_grp_nm4,
				$acst_grp_cd5,
				$acst_grp_nm5,
				$acst_grp_cd6,
				$acst_grp_nm6,
				$acst_grp_cd7,
				$acst_grp_nm7,
				$acst_grp_cd8,
				$acst_grp_nm8,
				$acst_grp_cd9,
				$acst_grp_nm9,
				$acst_grp_cd10,
				$acst_grp_nm10
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
				{$wg_nm, "WG"},	// wg_nm
				{$base_cur_cd, "BASE_CUR"},	// base_cur_cd
				{$base_cur_nm, "BASE_CUR"},	// base_cur_nm
				{$base_amt_dec_place, "BASE_CUR"},	// base_amt_dec_place
				{$base_cur_init_bal_p + ".amt", "BASE_CUR"},	// base_cur_init_bal_p.amt
				{$base_cur_amt_p + ".amt", "BASE_CUR"},	// base_cur_amt_p.amt
				{$base_cur_bef_cl_sls_amt_p + ".amt", "BASE_CUR"},	// base_cur_bef_cl_sls_amt_p.amt
				{$base_cur_aft_cl_sls_amt_p + ".amt", "BASE_CUR"},	// base_cur_aft_cl_sls_amt_p.amt
				{$base_cur_end_bal_p + ".amt", "BASE_CUR"},	// base_cur_end_bal_p.amt
				{$base_cur_not_appl_note_p + ".amt", "BASE_CUR"},	// base_cur_not_appl_note_p.amt
				{$base_cur_mly_not_appl_note_p + ".amt", "BASE_CUR"},	// base_cur_mly_not_appl_note_p.amt
				{$base_cur_cash_amt_p + ".amt", "BASE_CUR"},	// base_cur_cash_amt_p.amt
				{$base_cur_note_amt_p + ".amt", "BASE_CUR"},	// base_cur_note_amt_p.amt
				{$base_cur_xfr_amt_p + ".amt", "BASE_CUR"},	// base_cur_xfr_amt_p.amt
				{$base_cur_setoff_amt_p + ".amt", "BASE_CUR"},	// base_cur_setoff_amt_p.amt
				{$base_cur_sw_amt_p + ".amt", "BASE_CUR"}	// base_cur_sw_amt_p.amt
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
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 0, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 0, $ac_ym, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 1, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 1, $ar_dpt_cd, value);
	}


	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public String ar_dpt_nm() {
		return getConstString(offset + 2, $ar_dpt_nm);
	}

	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public void ar_dpt_nm(String value) {
		setConstString(offset + 2, $ar_dpt_nm, value);
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
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 5, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 5, $acst_cd, value);
	}


	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public String acst_nm() {
		return getConstString(offset + 6, $acst_nm);
	}

	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public void acst_nm(String value) {
		setConstString(offset + 6, $acst_nm, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 7, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 7, $iv_no, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 8, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 8, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 9, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 9, $trd_cur_nm, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 10, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 10, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 10, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 10, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 10, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 10, $amt_dec_place, value);
	}


	public mcframe.clientMSUB.MSUBP5010.WrkNoR wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5010.WrkNoR) getConstInnerRow(offset + 11, $wrk_no_p);
	}
	
	public void wrk_no_p(mcframe.clientMSUB.MSUBP5010.WrkNoR row){
		setConstInnerRow(offset + 11, $wrk_no_p, row);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 12, $ar_typ);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 12, $ar_typ, value);
	}


	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public String ar_typ_nm() {
		return getConstString(offset + 13, $ar_typ_nm);
	}

	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public void ar_typ_nm(String value) {
		setConstString(offset + 13, $ar_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR init_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 14, $init_bal_p);
	}
	
	public void init_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 14, $init_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 15, $amt_p);
	}
	
	public void amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 15, $amt_p, row);
	}


	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCNumber cl_day() {
		return getConstNumber(offset + 16, $cl_day);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void cl_day(MCNumber value) {
		setConstNumber(offset + 16, $cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void cl_day(int value) {
		setConstNumber(offset + 16, $cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void cl_day(long value) {
		setConstNumber(offset + 16, $cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void cl_day(float value) {
		setConstNumber(offset + 16, $cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void cl_day(double value) {
		setConstNumber(offset + 16, $cl_day, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR bef_cl_sls_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 17, $bef_cl_sls_amt_p);
	}
	
	public void bef_cl_sls_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 17, $bef_cl_sls_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR aft_cl_sls_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 18, $aft_cl_sls_amt_p);
	}
	
	public void aft_cl_sls_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 18, $aft_cl_sls_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR end_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 19, $end_bal_p);
	}
	
	public void end_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 19, $end_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR not_appl_note_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 20, $not_appl_note_p);
	}
	
	public void not_appl_note_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 20, $not_appl_note_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR mly_not_appl_note_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 21, $mly_not_appl_note_p);
	}
	
	public void mly_not_appl_note_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 21, $mly_not_appl_note_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR cash_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 22, $cash_amt_p);
	}
	
	public void cash_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 22, $cash_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR note_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 23, $note_amt_p);
	}
	
	public void note_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 23, $note_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR xfr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 24, $xfr_amt_p);
	}
	
	public void xfr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 24, $xfr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR setoff_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 25, $setoff_amt_p);
	}
	
	public void setoff_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 25, $setoff_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR sw_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 26, $sw_amt_p);
	}
	
	public void sw_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 26, $sw_amt_p, row);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 27, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 27, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 28, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 28, $base_cur_nm, value);
	}


	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_amt_dec_place() {
		return getConstNumber(offset + 29, $base_amt_dec_place);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 29, $base_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_amt_dec_place(int value) {
		setConstNumber(offset + 29, $base_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_amt_dec_place(long value) {
		setConstNumber(offset + 29, $base_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_amt_dec_place(float value) {
		setConstNumber(offset + 29, $base_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_amt_dec_place(double value) {
		setConstNumber(offset + 29, $base_amt_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_init_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 30, $base_cur_init_bal_p);
	}
	
	public void base_cur_init_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 30, $base_cur_init_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 31, $base_cur_amt_p);
	}
	
	public void base_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 31, $base_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_bef_cl_sls_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 32, $base_cur_bef_cl_sls_amt_p);
	}
	
	public void base_cur_bef_cl_sls_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 32, $base_cur_bef_cl_sls_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_aft_cl_sls_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 33, $base_cur_aft_cl_sls_amt_p);
	}
	
	public void base_cur_aft_cl_sls_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 33, $base_cur_aft_cl_sls_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_end_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 34, $base_cur_end_bal_p);
	}
	
	public void base_cur_end_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 34, $base_cur_end_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_not_appl_note_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 35, $base_cur_not_appl_note_p);
	}
	
	public void base_cur_not_appl_note_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 35, $base_cur_not_appl_note_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_mly_not_appl_note_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 36, $base_cur_mly_not_appl_note_p);
	}
	
	public void base_cur_mly_not_appl_note_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 36, $base_cur_mly_not_appl_note_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_cash_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 37, $base_cur_cash_amt_p);
	}
	
	public void base_cur_cash_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 37, $base_cur_cash_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_note_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 38, $base_cur_note_amt_p);
	}
	
	public void base_cur_note_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 38, $base_cur_note_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_xfr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 39, $base_cur_xfr_amt_p);
	}
	
	public void base_cur_xfr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 39, $base_cur_xfr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_setoff_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 40, $base_cur_setoff_amt_p);
	}
	
	public void base_cur_setoff_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 40, $base_cur_setoff_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_sw_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 41, $base_cur_sw_amt_p);
	}
	
	public void base_cur_sw_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 41, $base_cur_sw_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR exc_gain_loss_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 42, $exc_gain_loss_p);
	}
	
	public void exc_gain_loss_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 42, $exc_gain_loss_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR total_exc_gain_loss_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 43, $total_exc_gain_loss_p);
	}
	
	public void total_exc_gain_loss_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 43, $total_exc_gain_loss_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR acst_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 44, $acst_grp_p);
	}
	
	public void acst_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 44, $acst_grp_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 45, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 45, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 46, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 46, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 47, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 47, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 48, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 48, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 49, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 49, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 50, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 50, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 51, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 51, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 52, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 52, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 53, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 53, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 54, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 54, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 55, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 55, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			return ar_typ_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			return cl_day();
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			return base_amt_dec_place();
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

	public String getStringNE(String name) {
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			return ar_typ_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			return cl_day();
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			return base_amt_dec_place();
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

	public void setString(String name, String value) {
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
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
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			ar_typ_nm(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			cl_day(value);
			return;
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			cl_day(value);
			return;
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			cl_day(value);
			return;
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			cl_day(value);
			return;
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			cl_day(value);
			return;
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
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

	public void setStringNE(String name, String value) {
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
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
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			ar_typ_nm(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			cl_day(value);
			return;
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			cl_day(value);
			return;
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			cl_day(value);
			return;
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			cl_day(value);
			return;
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			cl_day(value);
			return;
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
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

	public MCRow getInnerRow(String name) {
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			return wrk_no_p();
		}
		if ($init_bal_p.equalsIgnoreCase(name)) {
			return init_bal_p();
		}
		if ($amt_p.equalsIgnoreCase(name)) {
			return amt_p();
		}
		if ($bef_cl_sls_amt_p.equalsIgnoreCase(name)) {
			return bef_cl_sls_amt_p();
		}
		if ($aft_cl_sls_amt_p.equalsIgnoreCase(name)) {
			return aft_cl_sls_amt_p();
		}
		if ($end_bal_p.equalsIgnoreCase(name)) {
			return end_bal_p();
		}
		if ($not_appl_note_p.equalsIgnoreCase(name)) {
			return not_appl_note_p();
		}
		if ($mly_not_appl_note_p.equalsIgnoreCase(name)) {
			return mly_not_appl_note_p();
		}
		if ($cash_amt_p.equalsIgnoreCase(name)) {
			return cash_amt_p();
		}
		if ($note_amt_p.equalsIgnoreCase(name)) {
			return note_amt_p();
		}
		if ($xfr_amt_p.equalsIgnoreCase(name)) {
			return xfr_amt_p();
		}
		if ($setoff_amt_p.equalsIgnoreCase(name)) {
			return setoff_amt_p();
		}
		if ($sw_amt_p.equalsIgnoreCase(name)) {
			return sw_amt_p();
		}
		if ($base_cur_init_bal_p.equalsIgnoreCase(name)) {
			return base_cur_init_bal_p();
		}
		if ($base_cur_amt_p.equalsIgnoreCase(name)) {
			return base_cur_amt_p();
		}
		if ($base_cur_bef_cl_sls_amt_p.equalsIgnoreCase(name)) {
			return base_cur_bef_cl_sls_amt_p();
		}
		if ($base_cur_aft_cl_sls_amt_p.equalsIgnoreCase(name)) {
			return base_cur_aft_cl_sls_amt_p();
		}
		if ($base_cur_end_bal_p.equalsIgnoreCase(name)) {
			return base_cur_end_bal_p();
		}
		if ($base_cur_not_appl_note_p.equalsIgnoreCase(name)) {
			return base_cur_not_appl_note_p();
		}
		if ($base_cur_mly_not_appl_note_p.equalsIgnoreCase(name)) {
			return base_cur_mly_not_appl_note_p();
		}
		if ($base_cur_cash_amt_p.equalsIgnoreCase(name)) {
			return base_cur_cash_amt_p();
		}
		if ($base_cur_note_amt_p.equalsIgnoreCase(name)) {
			return base_cur_note_amt_p();
		}
		if ($base_cur_xfr_amt_p.equalsIgnoreCase(name)) {
			return base_cur_xfr_amt_p();
		}
		if ($base_cur_setoff_amt_p.equalsIgnoreCase(name)) {
			return base_cur_setoff_amt_p();
		}
		if ($base_cur_sw_amt_p.equalsIgnoreCase(name)) {
			return base_cur_sw_amt_p();
		}
		if ($exc_gain_loss_p.equalsIgnoreCase(name)) {
			return exc_gain_loss_p();
		}
		if ($total_exc_gain_loss_p.equalsIgnoreCase(name)) {
			return total_exc_gain_loss_p();
		}
		if ($acst_grp_p.equalsIgnoreCase(name)) {
			return acst_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			wrk_no_p(
				((MCContainerMeta) wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5010.WrkNoR.class, value)
			);
			return;
		}
		if ($init_bal_p.equalsIgnoreCase(name)) {
			init_bal_p(
				((MCContainerMeta) init_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_p.equalsIgnoreCase(name)) {
			amt_p(
				((MCContainerMeta) amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($bef_cl_sls_amt_p.equalsIgnoreCase(name)) {
			bef_cl_sls_amt_p(
				((MCContainerMeta) bef_cl_sls_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($aft_cl_sls_amt_p.equalsIgnoreCase(name)) {
			aft_cl_sls_amt_p(
				((MCContainerMeta) aft_cl_sls_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($end_bal_p.equalsIgnoreCase(name)) {
			end_bal_p(
				((MCContainerMeta) end_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($not_appl_note_p.equalsIgnoreCase(name)) {
			not_appl_note_p(
				((MCContainerMeta) not_appl_note_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($mly_not_appl_note_p.equalsIgnoreCase(name)) {
			mly_not_appl_note_p(
				((MCContainerMeta) mly_not_appl_note_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($cash_amt_p.equalsIgnoreCase(name)) {
			cash_amt_p(
				((MCContainerMeta) cash_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($note_amt_p.equalsIgnoreCase(name)) {
			note_amt_p(
				((MCContainerMeta) note_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xfr_amt_p.equalsIgnoreCase(name)) {
			xfr_amt_p(
				((MCContainerMeta) xfr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($setoff_amt_p.equalsIgnoreCase(name)) {
			setoff_amt_p(
				((MCContainerMeta) setoff_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($sw_amt_p.equalsIgnoreCase(name)) {
			sw_amt_p(
				((MCContainerMeta) sw_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_init_bal_p.equalsIgnoreCase(name)) {
			base_cur_init_bal_p(
				((MCContainerMeta) base_cur_init_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_amt_p.equalsIgnoreCase(name)) {
			base_cur_amt_p(
				((MCContainerMeta) base_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_bef_cl_sls_amt_p.equalsIgnoreCase(name)) {
			base_cur_bef_cl_sls_amt_p(
				((MCContainerMeta) base_cur_bef_cl_sls_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_aft_cl_sls_amt_p.equalsIgnoreCase(name)) {
			base_cur_aft_cl_sls_amt_p(
				((MCContainerMeta) base_cur_aft_cl_sls_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_end_bal_p.equalsIgnoreCase(name)) {
			base_cur_end_bal_p(
				((MCContainerMeta) base_cur_end_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_not_appl_note_p.equalsIgnoreCase(name)) {
			base_cur_not_appl_note_p(
				((MCContainerMeta) base_cur_not_appl_note_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_mly_not_appl_note_p.equalsIgnoreCase(name)) {
			base_cur_mly_not_appl_note_p(
				((MCContainerMeta) base_cur_mly_not_appl_note_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_cash_amt_p.equalsIgnoreCase(name)) {
			base_cur_cash_amt_p(
				((MCContainerMeta) base_cur_cash_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_note_amt_p.equalsIgnoreCase(name)) {
			base_cur_note_amt_p(
				((MCContainerMeta) base_cur_note_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_xfr_amt_p.equalsIgnoreCase(name)) {
			base_cur_xfr_amt_p(
				((MCContainerMeta) base_cur_xfr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_setoff_amt_p.equalsIgnoreCase(name)) {
			base_cur_setoff_amt_p(
				((MCContainerMeta) base_cur_setoff_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_sw_amt_p.equalsIgnoreCase(name)) {
			base_cur_sw_amt_p(
				((MCContainerMeta) base_cur_sw_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($exc_gain_loss_p.equalsIgnoreCase(name)) {
			exc_gain_loss_p(
				((MCContainerMeta) exc_gain_loss_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($total_exc_gain_loss_p.equalsIgnoreCase(name)) {
			total_exc_gain_loss_p(
				((MCContainerMeta) total_exc_gain_loss_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($acst_grp_p.equalsIgnoreCase(name)) {
			acst_grp_p(
				((MCContainerMeta) acst_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String wrk_no() {
		return wrk_no_p().wrk_no();
	}

	public void wrk_no(String value) {
		wrk_no_p().wrk_no(value);
	}

	public String wrk_nm() {
		return wrk_no_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		wrk_no_p().wrk_nm(value);
	}

	/**
	 * Transaction balance of previous month 取引前月末残.<p>
	 *
	 */
	public MCNumber init_bal() {
		return init_bal_p().amt();
	}

	/**
	 * Transaction balance of previous month 取引前月末残.<p>
	 *
	 */
	public void init_bal(MCNumber value) {
		init_bal_p().amt(value);
	}

	/**
	 * Transaction balance of previous month 取引前月末残.<p>
	 *
	 */
	public void init_bal(int value) {
		init_bal_p().amt(value);
	}

	/**
	 * Transaction balance of previous month 取引前月末残.<p>
	 *
	 */
	public void init_bal(long value) {
		init_bal_p().amt(value);
	}

	/**
	 * Transaction balance of previous month 取引前月末残.<p>
	 *
	 */
	public void init_bal(float value) {
		init_bal_p().amt(value);
	}

	/**
	 * Transaction balance of previous month 取引前月末残.<p>
	 *
	 */
	public void init_bal(double value) {
		init_bal_p().amt(value);
	}

	/**
	 * Transaction payment received (Current month) 取引当月入金.<p>
	 *
	 */
	public MCNumber amt() {
		return amt_p().amt();
	}

	/**
	 * Transaction payment received (Current month) 取引当月入金.<p>
	 *
	 */
	public void amt(MCNumber value) {
		amt_p().amt(value);
	}

	/**
	 * Transaction payment received (Current month) 取引当月入金.<p>
	 *
	 */
	public void amt(int value) {
		amt_p().amt(value);
	}

	/**
	 * Transaction payment received (Current month) 取引当月入金.<p>
	 *
	 */
	public void amt(long value) {
		amt_p().amt(value);
	}

	/**
	 * Transaction payment received (Current month) 取引当月入金.<p>
	 *
	 */
	public void amt(float value) {
		amt_p().amt(value);
	}

	/**
	 * Transaction payment received (Current month) 取引当月入金.<p>
	 *
	 */
	public void amt(double value) {
		amt_p().amt(value);
	}

	/**
	 * Transaction billing (Current month) 取引当月請求.<p>
	 *
	 */
	public MCNumber bef_cl_sls_amt() {
		return bef_cl_sls_amt_p().amt();
	}

	/**
	 * Transaction billing (Current month) 取引当月請求.<p>
	 *
	 */
	public void bef_cl_sls_amt(MCNumber value) {
		bef_cl_sls_amt_p().amt(value);
	}

	/**
	 * Transaction billing (Current month) 取引当月請求.<p>
	 *
	 */
	public void bef_cl_sls_amt(int value) {
		bef_cl_sls_amt_p().amt(value);
	}

	/**
	 * Transaction billing (Current month) 取引当月請求.<p>
	 *
	 */
	public void bef_cl_sls_amt(long value) {
		bef_cl_sls_amt_p().amt(value);
	}

	/**
	 * Transaction billing (Current month) 取引当月請求.<p>
	 *
	 */
	public void bef_cl_sls_amt(float value) {
		bef_cl_sls_amt_p().amt(value);
	}

	/**
	 * Transaction billing (Current month) 取引当月請求.<p>
	 *
	 */
	public void bef_cl_sls_amt(double value) {
		bef_cl_sls_amt_p().amt(value);
	}

	/**
	 * Transaction billing from next month 取引翌月以降請求.<p>
	 *
	 */
	public MCNumber aft_cl_sls_amt() {
		return aft_cl_sls_amt_p().amt();
	}

	/**
	 * Transaction billing from next month 取引翌月以降請求.<p>
	 *
	 */
	public void aft_cl_sls_amt(MCNumber value) {
		aft_cl_sls_amt_p().amt(value);
	}

	/**
	 * Transaction billing from next month 取引翌月以降請求.<p>
	 *
	 */
	public void aft_cl_sls_amt(int value) {
		aft_cl_sls_amt_p().amt(value);
	}

	/**
	 * Transaction billing from next month 取引翌月以降請求.<p>
	 *
	 */
	public void aft_cl_sls_amt(long value) {
		aft_cl_sls_amt_p().amt(value);
	}

	/**
	 * Transaction billing from next month 取引翌月以降請求.<p>
	 *
	 */
	public void aft_cl_sls_amt(float value) {
		aft_cl_sls_amt_p().amt(value);
	}

	/**
	 * Transaction billing from next month 取引翌月以降請求.<p>
	 *
	 */
	public void aft_cl_sls_amt(double value) {
		aft_cl_sls_amt_p().amt(value);
	}

	/**
	 * Transaction AR balance 取引売掛残.<p>
	 *
	 */
	public MCNumber end_bal() {
		return end_bal_p().amt();
	}

	/**
	 * Transaction AR balance 取引売掛残.<p>
	 *
	 */
	public void end_bal(MCNumber value) {
		end_bal_p().amt(value);
	}

	/**
	 * Transaction AR balance 取引売掛残.<p>
	 *
	 */
	public void end_bal(int value) {
		end_bal_p().amt(value);
	}

	/**
	 * Transaction AR balance 取引売掛残.<p>
	 *
	 */
	public void end_bal(long value) {
		end_bal_p().amt(value);
	}

	/**
	 * Transaction AR balance 取引売掛残.<p>
	 *
	 */
	public void end_bal(float value) {
		end_bal_p().amt(value);
	}

	/**
	 * Transaction AR balance 取引売掛残.<p>
	 *
	 */
	public void end_bal(double value) {
		end_bal_p().amt(value);
	}

	/**
	 * Transaction outstanding notes 取引未決済手形.<p>
	 *
	 */
	public MCNumber not_appl_note() {
		return not_appl_note_p().amt();
	}

	/**
	 * Transaction outstanding notes 取引未決済手形.<p>
	 *
	 */
	public void not_appl_note(MCNumber value) {
		not_appl_note_p().amt(value);
	}

	/**
	 * Transaction outstanding notes 取引未決済手形.<p>
	 *
	 */
	public void not_appl_note(int value) {
		not_appl_note_p().amt(value);
	}

	/**
	 * Transaction outstanding notes 取引未決済手形.<p>
	 *
	 */
	public void not_appl_note(long value) {
		not_appl_note_p().amt(value);
	}

	/**
	 * Transaction outstanding notes 取引未決済手形.<p>
	 *
	 */
	public void not_appl_note(float value) {
		not_appl_note_p().amt(value);
	}

	/**
	 * Transaction outstanding notes 取引未決済手形.<p>
	 *
	 */
	public void not_appl_note(double value) {
		not_appl_note_p().amt(value);
	}

	/**
	 * Transaction Outstanding notes (Month) 取引月別未決済手形.<p>
	 *
	 */
	public MCNumber mly_not_appl_note() {
		return mly_not_appl_note_p().amt();
	}

	/**
	 * Transaction Outstanding notes (Month) 取引月別未決済手形.<p>
	 *
	 */
	public void mly_not_appl_note(MCNumber value) {
		mly_not_appl_note_p().amt(value);
	}

	/**
	 * Transaction Outstanding notes (Month) 取引月別未決済手形.<p>
	 *
	 */
	public void mly_not_appl_note(int value) {
		mly_not_appl_note_p().amt(value);
	}

	/**
	 * Transaction Outstanding notes (Month) 取引月別未決済手形.<p>
	 *
	 */
	public void mly_not_appl_note(long value) {
		mly_not_appl_note_p().amt(value);
	}

	/**
	 * Transaction Outstanding notes (Month) 取引月別未決済手形.<p>
	 *
	 */
	public void mly_not_appl_note(float value) {
		mly_not_appl_note_p().amt(value);
	}

	/**
	 * Transaction Outstanding notes (Month) 取引月別未決済手形.<p>
	 *
	 */
	public void mly_not_appl_note(double value) {
		mly_not_appl_note_p().amt(value);
	}

	/**
	 * Transaction cash 取引現金.<p>
	 *
	 */
	public MCNumber cash_amt() {
		return cash_amt_p().amt();
	}

	/**
	 * Transaction cash 取引現金.<p>
	 *
	 */
	public void cash_amt(MCNumber value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Transaction cash 取引現金.<p>
	 *
	 */
	public void cash_amt(int value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Transaction cash 取引現金.<p>
	 *
	 */
	public void cash_amt(long value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Transaction cash 取引現金.<p>
	 *
	 */
	public void cash_amt(float value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Transaction cash 取引現金.<p>
	 *
	 */
	public void cash_amt(double value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Transaction notes 取引手形.<p>
	 *
	 */
	public MCNumber note_amt() {
		return note_amt_p().amt();
	}

	/**
	 * Transaction notes 取引手形.<p>
	 *
	 */
	public void note_amt(MCNumber value) {
		note_amt_p().amt(value);
	}

	/**
	 * Transaction notes 取引手形.<p>
	 *
	 */
	public void note_amt(int value) {
		note_amt_p().amt(value);
	}

	/**
	 * Transaction notes 取引手形.<p>
	 *
	 */
	public void note_amt(long value) {
		note_amt_p().amt(value);
	}

	/**
	 * Transaction notes 取引手形.<p>
	 *
	 */
	public void note_amt(float value) {
		note_amt_p().amt(value);
	}

	/**
	 * Transaction notes 取引手形.<p>
	 *
	 */
	public void note_amt(double value) {
		note_amt_p().amt(value);
	}

	/**
	 * Transaction payment 取引振込.<p>
	 *
	 */
	public MCNumber xfr_amt() {
		return xfr_amt_p().amt();
	}

	/**
	 * Transaction payment 取引振込.<p>
	 *
	 */
	public void xfr_amt(MCNumber value) {
		xfr_amt_p().amt(value);
	}

	/**
	 * Transaction payment 取引振込.<p>
	 *
	 */
	public void xfr_amt(int value) {
		xfr_amt_p().amt(value);
	}

	/**
	 * Transaction payment 取引振込.<p>
	 *
	 */
	public void xfr_amt(long value) {
		xfr_amt_p().amt(value);
	}

	/**
	 * Transaction payment 取引振込.<p>
	 *
	 */
	public void xfr_amt(float value) {
		xfr_amt_p().amt(value);
	}

	/**
	 * Transaction payment 取引振込.<p>
	 *
	 */
	public void xfr_amt(double value) {
		xfr_amt_p().amt(value);
	}

	/**
	 * Transaction offset 取引相殺.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return setoff_amt_p().amt();
	}

	/**
	 * Transaction offset 取引相殺.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Transaction offset 取引相殺.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Transaction offset 取引相殺.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Transaction offset 取引相殺.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Transaction offset 取引相殺.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Transaction transfer 取引振替.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return sw_amt_p().amt();
	}

	/**
	 * Transaction transfer 取引振替.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		sw_amt_p().amt(value);
	}

	/**
	 * Transaction transfer 取引振替.<p>
	 *
	 */
	public void sw_amt(int value) {
		sw_amt_p().amt(value);
	}

	/**
	 * Transaction transfer 取引振替.<p>
	 *
	 */
	public void sw_amt(long value) {
		sw_amt_p().amt(value);
	}

	/**
	 * Transaction transfer 取引振替.<p>
	 *
	 */
	public void sw_amt(float value) {
		sw_amt_p().amt(value);
	}

	/**
	 * Transaction transfer 取引振替.<p>
	 *
	 */
	public void sw_amt(double value) {
		sw_amt_p().amt(value);
	}

	/**
	 * Base balance of previous month 基準前月末残.<p>
	 *
	 */
	public MCNumber base_cur_init_bal() {
		return base_cur_init_bal_p().amt();
	}

	/**
	 * Base balance of previous month 基準前月末残.<p>
	 *
	 */
	public void base_cur_init_bal(MCNumber value) {
		base_cur_init_bal_p().amt(value);
	}

	/**
	 * Base balance of previous month 基準前月末残.<p>
	 *
	 */
	public void base_cur_init_bal(int value) {
		base_cur_init_bal_p().amt(value);
	}

	/**
	 * Base balance of previous month 基準前月末残.<p>
	 *
	 */
	public void base_cur_init_bal(long value) {
		base_cur_init_bal_p().amt(value);
	}

	/**
	 * Base balance of previous month 基準前月末残.<p>
	 *
	 */
	public void base_cur_init_bal(float value) {
		base_cur_init_bal_p().amt(value);
	}

	/**
	 * Base balance of previous month 基準前月末残.<p>
	 *
	 */
	public void base_cur_init_bal(double value) {
		base_cur_init_bal_p().amt(value);
	}

	/**
	 * Base payment received (Current month) 基準当月入金.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return base_cur_amt_p().amt();
	}

	/**
	 * Base payment received (Current month) 基準当月入金.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Base payment received (Current month) 基準当月入金.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Base payment received (Current month) 基準当月入金.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Base payment received (Current month) 基準当月入金.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Base payment received (Current month) 基準当月入金.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Base billing (Current month) 基準当月請求.<p>
	 *
	 */
	public MCNumber base_cur_bef_cl_sls_amt() {
		return base_cur_bef_cl_sls_amt_p().amt();
	}

	/**
	 * Base billing (Current month) 基準当月請求.<p>
	 *
	 */
	public void base_cur_bef_cl_sls_amt(MCNumber value) {
		base_cur_bef_cl_sls_amt_p().amt(value);
	}

	/**
	 * Base billing (Current month) 基準当月請求.<p>
	 *
	 */
	public void base_cur_bef_cl_sls_amt(int value) {
		base_cur_bef_cl_sls_amt_p().amt(value);
	}

	/**
	 * Base billing (Current month) 基準当月請求.<p>
	 *
	 */
	public void base_cur_bef_cl_sls_amt(long value) {
		base_cur_bef_cl_sls_amt_p().amt(value);
	}

	/**
	 * Base billing (Current month) 基準当月請求.<p>
	 *
	 */
	public void base_cur_bef_cl_sls_amt(float value) {
		base_cur_bef_cl_sls_amt_p().amt(value);
	}

	/**
	 * Base billing (Current month) 基準当月請求.<p>
	 *
	 */
	public void base_cur_bef_cl_sls_amt(double value) {
		base_cur_bef_cl_sls_amt_p().amt(value);
	}

	/**
	 * Base billing from next month 基準翌月以降請求.<p>
	 *
	 */
	public MCNumber base_cur_aft_cl_sls_amt() {
		return base_cur_aft_cl_sls_amt_p().amt();
	}

	/**
	 * Base billing from next month 基準翌月以降請求.<p>
	 *
	 */
	public void base_cur_aft_cl_sls_amt(MCNumber value) {
		base_cur_aft_cl_sls_amt_p().amt(value);
	}

	/**
	 * Base billing from next month 基準翌月以降請求.<p>
	 *
	 */
	public void base_cur_aft_cl_sls_amt(int value) {
		base_cur_aft_cl_sls_amt_p().amt(value);
	}

	/**
	 * Base billing from next month 基準翌月以降請求.<p>
	 *
	 */
	public void base_cur_aft_cl_sls_amt(long value) {
		base_cur_aft_cl_sls_amt_p().amt(value);
	}

	/**
	 * Base billing from next month 基準翌月以降請求.<p>
	 *
	 */
	public void base_cur_aft_cl_sls_amt(float value) {
		base_cur_aft_cl_sls_amt_p().amt(value);
	}

	/**
	 * Base billing from next month 基準翌月以降請求.<p>
	 *
	 */
	public void base_cur_aft_cl_sls_amt(double value) {
		base_cur_aft_cl_sls_amt_p().amt(value);
	}

	/**
	 * Base AR balance 基準売掛残.<p>
	 *
	 */
	public MCNumber base_cur_end_bal() {
		return base_cur_end_bal_p().amt();
	}

	/**
	 * Base AR balance 基準売掛残.<p>
	 *
	 */
	public void base_cur_end_bal(MCNumber value) {
		base_cur_end_bal_p().amt(value);
	}

	/**
	 * Base AR balance 基準売掛残.<p>
	 *
	 */
	public void base_cur_end_bal(int value) {
		base_cur_end_bal_p().amt(value);
	}

	/**
	 * Base AR balance 基準売掛残.<p>
	 *
	 */
	public void base_cur_end_bal(long value) {
		base_cur_end_bal_p().amt(value);
	}

	/**
	 * Base AR balance 基準売掛残.<p>
	 *
	 */
	public void base_cur_end_bal(float value) {
		base_cur_end_bal_p().amt(value);
	}

	/**
	 * Base AR balance 基準売掛残.<p>
	 *
	 */
	public void base_cur_end_bal(double value) {
		base_cur_end_bal_p().amt(value);
	}

	/**
	 * Base outstanding notes 基準未決済手形.<p>
	 *
	 */
	public MCNumber base_cur_not_appl_note() {
		return base_cur_not_appl_note_p().amt();
	}

	/**
	 * Base outstanding notes 基準未決済手形.<p>
	 *
	 */
	public void base_cur_not_appl_note(MCNumber value) {
		base_cur_not_appl_note_p().amt(value);
	}

	/**
	 * Base outstanding notes 基準未決済手形.<p>
	 *
	 */
	public void base_cur_not_appl_note(int value) {
		base_cur_not_appl_note_p().amt(value);
	}

	/**
	 * Base outstanding notes 基準未決済手形.<p>
	 *
	 */
	public void base_cur_not_appl_note(long value) {
		base_cur_not_appl_note_p().amt(value);
	}

	/**
	 * Base outstanding notes 基準未決済手形.<p>
	 *
	 */
	public void base_cur_not_appl_note(float value) {
		base_cur_not_appl_note_p().amt(value);
	}

	/**
	 * Base outstanding notes 基準未決済手形.<p>
	 *
	 */
	public void base_cur_not_appl_note(double value) {
		base_cur_not_appl_note_p().amt(value);
	}

	/**
	 * Outstanding notes by base month 基準月別未決済手形.<p>
	 *
	 */
	public MCNumber base_cur_mly_not_appl_note() {
		return base_cur_mly_not_appl_note_p().amt();
	}

	/**
	 * Outstanding notes by base month 基準月別未決済手形.<p>
	 *
	 */
	public void base_cur_mly_not_appl_note(MCNumber value) {
		base_cur_mly_not_appl_note_p().amt(value);
	}

	/**
	 * Outstanding notes by base month 基準月別未決済手形.<p>
	 *
	 */
	public void base_cur_mly_not_appl_note(int value) {
		base_cur_mly_not_appl_note_p().amt(value);
	}

	/**
	 * Outstanding notes by base month 基準月別未決済手形.<p>
	 *
	 */
	public void base_cur_mly_not_appl_note(long value) {
		base_cur_mly_not_appl_note_p().amt(value);
	}

	/**
	 * Outstanding notes by base month 基準月別未決済手形.<p>
	 *
	 */
	public void base_cur_mly_not_appl_note(float value) {
		base_cur_mly_not_appl_note_p().amt(value);
	}

	/**
	 * Outstanding notes by base month 基準月別未決済手形.<p>
	 *
	 */
	public void base_cur_mly_not_appl_note(double value) {
		base_cur_mly_not_appl_note_p().amt(value);
	}

	/**
	 * Base cash 基準現金.<p>
	 *
	 */
	public MCNumber base_cur_cash_amt() {
		return base_cur_cash_amt_p().amt();
	}

	/**
	 * Base cash 基準現金.<p>
	 *
	 */
	public void base_cur_cash_amt(MCNumber value) {
		base_cur_cash_amt_p().amt(value);
	}

	/**
	 * Base cash 基準現金.<p>
	 *
	 */
	public void base_cur_cash_amt(int value) {
		base_cur_cash_amt_p().amt(value);
	}

	/**
	 * Base cash 基準現金.<p>
	 *
	 */
	public void base_cur_cash_amt(long value) {
		base_cur_cash_amt_p().amt(value);
	}

	/**
	 * Base cash 基準現金.<p>
	 *
	 */
	public void base_cur_cash_amt(float value) {
		base_cur_cash_amt_p().amt(value);
	}

	/**
	 * Base cash 基準現金.<p>
	 *
	 */
	public void base_cur_cash_amt(double value) {
		base_cur_cash_amt_p().amt(value);
	}

	/**
	 * Base notes 基準手形.<p>
	 *
	 */
	public MCNumber base_cur_note_amt() {
		return base_cur_note_amt_p().amt();
	}

	/**
	 * Base notes 基準手形.<p>
	 *
	 */
	public void base_cur_note_amt(MCNumber value) {
		base_cur_note_amt_p().amt(value);
	}

	/**
	 * Base notes 基準手形.<p>
	 *
	 */
	public void base_cur_note_amt(int value) {
		base_cur_note_amt_p().amt(value);
	}

	/**
	 * Base notes 基準手形.<p>
	 *
	 */
	public void base_cur_note_amt(long value) {
		base_cur_note_amt_p().amt(value);
	}

	/**
	 * Base notes 基準手形.<p>
	 *
	 */
	public void base_cur_note_amt(float value) {
		base_cur_note_amt_p().amt(value);
	}

	/**
	 * Base notes 基準手形.<p>
	 *
	 */
	public void base_cur_note_amt(double value) {
		base_cur_note_amt_p().amt(value);
	}

	/**
	 * Base payment 基準振込.<p>
	 *
	 */
	public MCNumber base_cur_xfr_amt() {
		return base_cur_xfr_amt_p().amt();
	}

	/**
	 * Base payment 基準振込.<p>
	 *
	 */
	public void base_cur_xfr_amt(MCNumber value) {
		base_cur_xfr_amt_p().amt(value);
	}

	/**
	 * Base payment 基準振込.<p>
	 *
	 */
	public void base_cur_xfr_amt(int value) {
		base_cur_xfr_amt_p().amt(value);
	}

	/**
	 * Base payment 基準振込.<p>
	 *
	 */
	public void base_cur_xfr_amt(long value) {
		base_cur_xfr_amt_p().amt(value);
	}

	/**
	 * Base payment 基準振込.<p>
	 *
	 */
	public void base_cur_xfr_amt(float value) {
		base_cur_xfr_amt_p().amt(value);
	}

	/**
	 * Base payment 基準振込.<p>
	 *
	 */
	public void base_cur_xfr_amt(double value) {
		base_cur_xfr_amt_p().amt(value);
	}

	/**
	 * Base offset 基準相殺.<p>
	 *
	 */
	public MCNumber base_cur_setoff_amt() {
		return base_cur_setoff_amt_p().amt();
	}

	/**
	 * Base offset 基準相殺.<p>
	 *
	 */
	public void base_cur_setoff_amt(MCNumber value) {
		base_cur_setoff_amt_p().amt(value);
	}

	/**
	 * Base offset 基準相殺.<p>
	 *
	 */
	public void base_cur_setoff_amt(int value) {
		base_cur_setoff_amt_p().amt(value);
	}

	/**
	 * Base offset 基準相殺.<p>
	 *
	 */
	public void base_cur_setoff_amt(long value) {
		base_cur_setoff_amt_p().amt(value);
	}

	/**
	 * Base offset 基準相殺.<p>
	 *
	 */
	public void base_cur_setoff_amt(float value) {
		base_cur_setoff_amt_p().amt(value);
	}

	/**
	 * Base offset 基準相殺.<p>
	 *
	 */
	public void base_cur_setoff_amt(double value) {
		base_cur_setoff_amt_p().amt(value);
	}

	/**
	 * Base transfer 基準振替.<p>
	 *
	 */
	public MCNumber base_cur_sw_amt() {
		return base_cur_sw_amt_p().amt();
	}

	/**
	 * Base transfer 基準振替.<p>
	 *
	 */
	public void base_cur_sw_amt(MCNumber value) {
		base_cur_sw_amt_p().amt(value);
	}

	/**
	 * Base transfer 基準振替.<p>
	 *
	 */
	public void base_cur_sw_amt(int value) {
		base_cur_sw_amt_p().amt(value);
	}

	/**
	 * Base transfer 基準振替.<p>
	 *
	 */
	public void base_cur_sw_amt(long value) {
		base_cur_sw_amt_p().amt(value);
	}

	/**
	 * Base transfer 基準振替.<p>
	 *
	 */
	public void base_cur_sw_amt(float value) {
		base_cur_sw_amt_p().amt(value);
	}

	/**
	 * Base transfer 基準振替.<p>
	 *
	 */
	public void base_cur_sw_amt(double value) {
		base_cur_sw_amt_p().amt(value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public MCNumber exc_gain_loss() {
		return exc_gain_loss_p().amt();
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(MCNumber value) {
		exc_gain_loss_p().amt(value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(int value) {
		exc_gain_loss_p().amt(value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(long value) {
		exc_gain_loss_p().amt(value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(float value) {
		exc_gain_loss_p().amt(value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(double value) {
		exc_gain_loss_p().amt(value);
	}

	/**
	 * Accumulation exchange gain/loss 累計為替差損益.<p>
	 *
	 */
	public MCNumber total_exc_gain_loss() {
		return total_exc_gain_loss_p().amt();
	}

	/**
	 * Accumulation exchange gain/loss 累計為替差損益.<p>
	 *
	 */
	public void total_exc_gain_loss(MCNumber value) {
		total_exc_gain_loss_p().amt(value);
	}

	/**
	 * Accumulation exchange gain/loss 累計為替差損益.<p>
	 *
	 */
	public void total_exc_gain_loss(int value) {
		total_exc_gain_loss_p().amt(value);
	}

	/**
	 * Accumulation exchange gain/loss 累計為替差損益.<p>
	 *
	 */
	public void total_exc_gain_loss(long value) {
		total_exc_gain_loss_p().amt(value);
	}

	/**
	 * Accumulation exchange gain/loss 累計為替差損益.<p>
	 *
	 */
	public void total_exc_gain_loss(float value) {
		total_exc_gain_loss_p().amt(value);
	}

	/**
	 * Accumulation exchange gain/loss 累計為替差損益.<p>
	 *
	 */
	public void total_exc_gain_loss(double value) {
		total_exc_gain_loss_p().amt(value);
	}

	/**
	 * AR customer classification cd. 1 売掛先分類ＣＤ１.<p>
	 *
	 */
	public String acst_grp_cd1() {
		return acst_grp_p().bp_grp_cd1();
	}

	/**
	 * AR customer classification cd. 1 売掛先分類ＣＤ１.<p>
	 *
	 */
	public void acst_grp_cd1(String value) {
		acst_grp_p().bp_grp_cd1(value);
	}

	/**
	 * AR customer classification name 1 売掛先分類名１.<p>
	 *
	 */
	public String acst_grp_nm1() {
		return acst_grp_p().bp_grp_nm1();
	}

	/**
	 * AR customer classification name 1 売掛先分類名１.<p>
	 *
	 */
	public void acst_grp_nm1(String value) {
		acst_grp_p().bp_grp_nm1(value);
	}

	/**
	 * AR customer classification cd. 2 売掛先分類ＣＤ２.<p>
	 *
	 */
	public String acst_grp_cd2() {
		return acst_grp_p().bp_grp_cd2();
	}

	/**
	 * AR customer classification cd. 2 売掛先分類ＣＤ２.<p>
	 *
	 */
	public void acst_grp_cd2(String value) {
		acst_grp_p().bp_grp_cd2(value);
	}

	/**
	 * AR customer classification name 2 売掛先分類名２.<p>
	 *
	 */
	public String acst_grp_nm2() {
		return acst_grp_p().bp_grp_nm2();
	}

	/**
	 * AR customer classification name 2 売掛先分類名２.<p>
	 *
	 */
	public void acst_grp_nm2(String value) {
		acst_grp_p().bp_grp_nm2(value);
	}

	/**
	 * AR customer classification cd. 3 売掛先分類ＣＤ３.<p>
	 *
	 */
	public String acst_grp_cd3() {
		return acst_grp_p().bp_grp_cd3();
	}

	/**
	 * AR customer classification cd. 3 売掛先分類ＣＤ３.<p>
	 *
	 */
	public void acst_grp_cd3(String value) {
		acst_grp_p().bp_grp_cd3(value);
	}

	/**
	 * AR customer classification name 3 売掛先分類名３.<p>
	 *
	 */
	public String acst_grp_nm3() {
		return acst_grp_p().bp_grp_nm3();
	}

	/**
	 * AR customer classification name 3 売掛先分類名３.<p>
	 *
	 */
	public void acst_grp_nm3(String value) {
		acst_grp_p().bp_grp_nm3(value);
	}

	/**
	 * AR customer classification cd. 4 売掛先分類ＣＤ４.<p>
	 *
	 */
	public String acst_grp_cd4() {
		return acst_grp_p().bp_grp_cd4();
	}

	/**
	 * AR customer classification cd. 4 売掛先分類ＣＤ４.<p>
	 *
	 */
	public void acst_grp_cd4(String value) {
		acst_grp_p().bp_grp_cd4(value);
	}

	/**
	 * AR customer classification name 4 売掛先分類名４.<p>
	 *
	 */
	public String acst_grp_nm4() {
		return acst_grp_p().bp_grp_nm4();
	}

	/**
	 * AR customer classification name 4 売掛先分類名４.<p>
	 *
	 */
	public void acst_grp_nm4(String value) {
		acst_grp_p().bp_grp_nm4(value);
	}

	/**
	 * AR customer classification cd. 5 売掛先分類ＣＤ５.<p>
	 *
	 */
	public String acst_grp_cd5() {
		return acst_grp_p().bp_grp_cd5();
	}

	/**
	 * AR customer classification cd. 5 売掛先分類ＣＤ５.<p>
	 *
	 */
	public void acst_grp_cd5(String value) {
		acst_grp_p().bp_grp_cd5(value);
	}

	/**
	 * AR customer classification name 5 売掛先分類名５.<p>
	 *
	 */
	public String acst_grp_nm5() {
		return acst_grp_p().bp_grp_nm5();
	}

	/**
	 * AR customer classification name 5 売掛先分類名５.<p>
	 *
	 */
	public void acst_grp_nm5(String value) {
		acst_grp_p().bp_grp_nm5(value);
	}

	/**
	 * AR customer classification cd. 6 売掛先分類ＣＤ６.<p>
	 *
	 */
	public String acst_grp_cd6() {
		return acst_grp_p().bp_grp_cd6();
	}

	/**
	 * AR customer classification cd. 6 売掛先分類ＣＤ６.<p>
	 *
	 */
	public void acst_grp_cd6(String value) {
		acst_grp_p().bp_grp_cd6(value);
	}

	/**
	 * AR customer classification name 6 売掛先分類名６.<p>
	 *
	 */
	public String acst_grp_nm6() {
		return acst_grp_p().bp_grp_nm6();
	}

	/**
	 * AR customer classification name 6 売掛先分類名６.<p>
	 *
	 */
	public void acst_grp_nm6(String value) {
		acst_grp_p().bp_grp_nm6(value);
	}

	/**
	 * AR customer classification cd. 7 売掛先分類ＣＤ７.<p>
	 *
	 */
	public String acst_grp_cd7() {
		return acst_grp_p().bp_grp_cd7();
	}

	/**
	 * AR customer classification cd. 7 売掛先分類ＣＤ７.<p>
	 *
	 */
	public void acst_grp_cd7(String value) {
		acst_grp_p().bp_grp_cd7(value);
	}

	/**
	 * AR customer classification name 7 売掛先分類名７.<p>
	 *
	 */
	public String acst_grp_nm7() {
		return acst_grp_p().bp_grp_nm7();
	}

	/**
	 * AR customer classification name 7 売掛先分類名７.<p>
	 *
	 */
	public void acst_grp_nm7(String value) {
		acst_grp_p().bp_grp_nm7(value);
	}

	/**
	 * AR customer classification cd. 8 売掛先分類ＣＤ８.<p>
	 *
	 */
	public String acst_grp_cd8() {
		return acst_grp_p().bp_grp_cd8();
	}

	/**
	 * AR customer classification cd. 8 売掛先分類ＣＤ８.<p>
	 *
	 */
	public void acst_grp_cd8(String value) {
		acst_grp_p().bp_grp_cd8(value);
	}

	/**
	 * AR customer classification name 8 売掛先分類名８.<p>
	 *
	 */
	public String acst_grp_nm8() {
		return acst_grp_p().bp_grp_nm8();
	}

	/**
	 * AR customer classification name 8 売掛先分類名８.<p>
	 *
	 */
	public void acst_grp_nm8(String value) {
		acst_grp_p().bp_grp_nm8(value);
	}

	/**
	 * AR customer classification cd. 9 売掛先分類ＣＤ９.<p>
	 *
	 */
	public String acst_grp_cd9() {
		return acst_grp_p().bp_grp_cd9();
	}

	/**
	 * AR customer classification cd. 9 売掛先分類ＣＤ９.<p>
	 *
	 */
	public void acst_grp_cd9(String value) {
		acst_grp_p().bp_grp_cd9(value);
	}

	/**
	 * AR customer classification name 9 売掛先分類名９.<p>
	 *
	 */
	public String acst_grp_nm9() {
		return acst_grp_p().bp_grp_nm9();
	}

	/**
	 * AR customer classification name 9 売掛先分類名９.<p>
	 *
	 */
	public void acst_grp_nm9(String value) {
		acst_grp_p().bp_grp_nm9(value);
	}

	/**
	 * AR customer classification cd. 10 売掛先分類ＣＤ１０.<p>
	 *
	 */
	public String acst_grp_cd10() {
		return acst_grp_p().bp_grp_cd10();
	}

	/**
	 * AR customer classification cd. 10 売掛先分類ＣＤ１０.<p>
	 *
	 */
	public void acst_grp_cd10(String value) {
		acst_grp_p().bp_grp_cd10(value);
	}

	/**
	 * AR customer classification name 10 売掛先分類名１０.<p>
	 *
	 */
	public String acst_grp_nm10() {
		return acst_grp_p().bp_grp_nm10();
	}

	/**
	 * AR customer classification name 10 売掛先分類名１０.<p>
	 *
	 */
	public void acst_grp_nm10(String value) {
		acst_grp_p().bp_grp_nm10(value);
	}

}

