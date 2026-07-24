package mcframe.clientMSBH.MSBHP0110;

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
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public static final String $asppl_nm = "asppl_nm";
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
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
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
	public static final String $wrk_no_p = "wrk_no_p";
	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public static final String $ap_typ = "ap_typ";
	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public static final String $ap_typ_nm = "ap_typ_nm";
	public static final String $init_bal_p = "init_bal_p";
	public static final String $purc_amt_p = "purc_amt_p";
	public static final String $ret_amt_p = "ret_amt_p";
	public static final String $dscnt_amt_p = "dscnt_amt_p";
	public static final String $sw_to_amt_p = "sw_to_amt_p";
	public static final String $tax_amt_p = "tax_amt_p";
	public static final String $cash_amt_p = "cash_amt_p";
	public static final String $note_amt_p = "note_amt_p";
	public static final String $account_amt_p = "account_amt_p";
	public static final String $setoff_amt_p = "setoff_amt_p";
	public static final String $sw_amt_p = "sw_amt_p";
	public static final String $end_bal_p = "end_bal_p";
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
	public static final String $base_cur_amt_dec_place = "base_cur_amt_dec_place";
	public static final String $base_cur_init_bal_p = "base_cur_init_bal_p";
	public static final String $base_cur_purc_amt_p = "base_cur_purc_amt_p";
	public static final String $base_cur_ret_amt_p = "base_cur_ret_amt_p";
	public static final String $base_cur_dscnt_amt_p = "base_cur_dscnt_amt_p";
	public static final String $base_cur_sw_to_amt_p = "base_cur_sw_to_amt_p";
	public static final String $base_cur_tax_amt_p = "base_cur_tax_amt_p";
	public static final String $base_cur_cash_amt_p = "base_cur_cash_amt_p";
	public static final String $base_cur_note_amt_p = "base_cur_note_amt_p";
	public static final String $base_cur_account_amt_p = "base_cur_account_amt_p";
	public static final String $base_cur_setoff_amt_p = "base_cur_setoff_amt_p";
	public static final String $base_cur_sw_amt_p = "base_cur_sw_amt_p";
	public static final String $base_cur_end_bal_p = "base_cur_end_bal_p";
	public static final String $exc_gain_loss_p = "exc_gain_loss_p";
	public static final String $total_exc_gain_loss_p = "total_exc_gain_loss_p";
	public static final String $asppl_grp_p = "asppl_grp_p";
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
	public static final String $purc_amt = $purc_amt_p + ".amt";
	public static final String $ret_amt = $ret_amt_p + ".amt";
	public static final String $dscnt_amt = $dscnt_amt_p + ".amt";
	public static final String $sw_to_amt = $sw_to_amt_p + ".amt";
	public static final String $tax_amt = $tax_amt_p + ".amt";
	public static final String $cash_amt = $cash_amt_p + ".amt";
	public static final String $note_amt = $note_amt_p + ".amt";
	public static final String $account_amt = $account_amt_p + ".amt";
	public static final String $setoff_amt = $setoff_amt_p + ".amt";
	public static final String $sw_amt = $sw_amt_p + ".amt";
	public static final String $end_bal = $end_bal_p + ".amt";
	public static final String $base_cur_init_bal = $base_cur_init_bal_p + ".amt";
	public static final String $base_cur_purc_amt = $base_cur_purc_amt_p + ".amt";
	public static final String $base_cur_ret_amt = $base_cur_ret_amt_p + ".amt";
	public static final String $base_cur_dscnt_amt = $base_cur_dscnt_amt_p + ".amt";
	public static final String $base_cur_sw_to_amt = $base_cur_sw_to_amt_p + ".amt";
	public static final String $base_cur_tax_amt = $base_cur_tax_amt_p + ".amt";
	public static final String $base_cur_cash_amt = $base_cur_cash_amt_p + ".amt";
	public static final String $base_cur_note_amt = $base_cur_note_amt_p + ".amt";
	public static final String $base_cur_account_amt = $base_cur_account_amt_p + ".amt";
	public static final String $base_cur_setoff_amt = $base_cur_setoff_amt_p + ".amt";
	public static final String $base_cur_sw_amt = $base_cur_sw_amt_p + ".amt";
	public static final String $base_cur_end_bal = $base_cur_end_bal_p + ".amt";
	public static final String $exc_gain_loss = $exc_gain_loss_p + ".amt";
	public static final String $total_exc_gain_loss = $total_exc_gain_loss_p + ".amt";
	public static final String $asppl_grp_cd1 = $asppl_grp_p + ".bp_grp_cd1";
	public static final String $asppl_grp_nm1 = $asppl_grp_p + ".bp_grp_nm1";
	public static final String $asppl_grp_cd2 = $asppl_grp_p + ".bp_grp_cd2";
	public static final String $asppl_grp_nm2 = $asppl_grp_p + ".bp_grp_nm2";
	public static final String $asppl_grp_cd3 = $asppl_grp_p + ".bp_grp_cd3";
	public static final String $asppl_grp_nm3 = $asppl_grp_p + ".bp_grp_nm3";
	public static final String $asppl_grp_cd4 = $asppl_grp_p + ".bp_grp_cd4";
	public static final String $asppl_grp_nm4 = $asppl_grp_p + ".bp_grp_nm4";
	public static final String $asppl_grp_cd5 = $asppl_grp_p + ".bp_grp_cd5";
	public static final String $asppl_grp_nm5 = $asppl_grp_p + ".bp_grp_nm5";
	public static final String $asppl_grp_cd6 = $asppl_grp_p + ".bp_grp_cd6";
	public static final String $asppl_grp_nm6 = $asppl_grp_p + ".bp_grp_nm6";
	public static final String $asppl_grp_cd7 = $asppl_grp_p + ".bp_grp_cd7";
	public static final String $asppl_grp_nm7 = $asppl_grp_p + ".bp_grp_nm7";
	public static final String $asppl_grp_cd8 = $asppl_grp_p + ".bp_grp_cd8";
	public static final String $asppl_grp_nm8 = $asppl_grp_p + ".bp_grp_nm8";
	public static final String $asppl_grp_cd9 = $asppl_grp_p + ".bp_grp_cd9";
	public static final String $asppl_grp_nm9 = $asppl_grp_p + ".bp_grp_nm9";
	public static final String $asppl_grp_cd10 = $asppl_grp_p + ".bp_grp_cd10";
	public static final String $asppl_grp_nm10 = $asppl_grp_p + ".bp_grp_nm10";

	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_nm_META = createCommonMeta($asppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta wrk_no_p_META = createInnerRowMeta($wrk_no_p, mcframe.clientMSUB.MSUBP5010.WrkNoR.class);
	public static final MCMeta ap_typ_META = createCommonMeta($ap_typ, mcframe.commonMA.meta.MA_META.AP_TYP);
	public static final MCMeta ap_typ_nm_META = createCommonMeta($ap_typ_nm, mcframe.commonMA.meta.MA_META.AP_TYP_NM);
	public static final MCMeta init_bal_p_META = createInnerRowMeta($init_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta purc_amt_p_META = createInnerRowMeta($purc_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ret_amt_p_META = createInnerRowMeta($ret_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta dscnt_amt_p_META = createInnerRowMeta($dscnt_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta sw_to_amt_p_META = createInnerRowMeta($sw_to_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta tax_amt_p_META = createInnerRowMeta($tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta cash_amt_p_META = createInnerRowMeta($cash_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta note_amt_p_META = createInnerRowMeta($note_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta account_amt_p_META = createInnerRowMeta($account_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta setoff_amt_p_META = createInnerRowMeta($setoff_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta sw_amt_p_META = createInnerRowMeta($sw_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta end_bal_p_META = createInnerRowMeta($end_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_amt_dec_place_META = createCommonMeta($base_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_init_bal_p_META = createInnerRowMeta($base_cur_init_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_purc_amt_p_META = createInnerRowMeta($base_cur_purc_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_ret_amt_p_META = createInnerRowMeta($base_cur_ret_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_dscnt_amt_p_META = createInnerRowMeta($base_cur_dscnt_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_sw_to_amt_p_META = createInnerRowMeta($base_cur_sw_to_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_tax_amt_p_META = createInnerRowMeta($base_cur_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_cash_amt_p_META = createInnerRowMeta($base_cur_cash_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_note_amt_p_META = createInnerRowMeta($base_cur_note_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_account_amt_p_META = createInnerRowMeta($base_cur_account_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_setoff_amt_p_META = createInnerRowMeta($base_cur_setoff_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_sw_amt_p_META = createInnerRowMeta($base_cur_sw_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_end_bal_p_META = createInnerRowMeta($base_cur_end_bal_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta exc_gain_loss_p_META = createInnerRowMeta($exc_gain_loss_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta total_exc_gain_loss_p_META = createInnerRowMeta($total_exc_gain_loss_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta asppl_grp_p_META = createInnerRowMeta($asppl_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
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
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			asppl_cd_META,
			asppl_nm_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			purc_act_no_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_cur_amt_dec_place_META,
			wrk_no_p_META,
			ap_typ_META,
			ap_typ_nm_META,
			init_bal_p_META,
			purc_amt_p_META,
			ret_amt_p_META,
			dscnt_amt_p_META,
			sw_to_amt_p_META,
			tax_amt_p_META,
			cash_amt_p_META,
			note_amt_p_META,
			account_amt_p_META,
			setoff_amt_p_META,
			sw_amt_p_META,
			end_bal_p_META,
			base_cur_cd_META,
			base_cur_nm_META,
			base_cur_amt_dec_place_META,
			base_cur_init_bal_p_META,
			base_cur_purc_amt_p_META,
			base_cur_ret_amt_p_META,
			base_cur_dscnt_amt_p_META,
			base_cur_sw_to_amt_p_META,
			base_cur_tax_amt_p_META,
			base_cur_cash_amt_p_META,
			base_cur_note_amt_p_META,
			base_cur_account_amt_p_META,
			base_cur_setoff_amt_p_META,
			base_cur_sw_amt_p_META,
			base_cur_end_bal_p_META,
			exc_gain_loss_p_META,
			total_exc_gain_loss_p_META,
			asppl_grp_p_META,
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
				"purc_amt",
				"ret_amt",
				"dscnt_amt",
				"sw_to_amt",
				"tax_amt",
				"cash_amt",
				"note_amt",
				"account_amt",
				"setoff_amt",
				"sw_amt",
				"end_bal",
				"base_cur_init_bal",
				"base_cur_purc_amt",
				"base_cur_ret_amt",
				"base_cur_dscnt_amt",
				"base_cur_sw_to_amt",
				"base_cur_tax_amt",
				"base_cur_cash_amt",
				"base_cur_note_amt",
				"base_cur_account_amt",
				"base_cur_setoff_amt",
				"base_cur_sw_amt",
				"base_cur_end_bal",
				"exc_gain_loss",
				"total_exc_gain_loss",
				"asppl_grp_cd1",
				"asppl_grp_nm1",
				"asppl_grp_cd2",
				"asppl_grp_nm2",
				"asppl_grp_cd3",
				"asppl_grp_nm3",
				"asppl_grp_cd4",
				"asppl_grp_nm4",
				"asppl_grp_cd5",
				"asppl_grp_nm5",
				"asppl_grp_cd6",
				"asppl_grp_nm6",
				"asppl_grp_cd7",
				"asppl_grp_nm7",
				"asppl_grp_cd8",
				"asppl_grp_nm8",
				"asppl_grp_cd9",
				"asppl_grp_nm9",
				"asppl_grp_cd10",
				"asppl_grp_nm10"
			},
			{
				$wrk_no,
				$wrk_nm,
				$init_bal,
				$purc_amt,
				$ret_amt,
				$dscnt_amt,
				$sw_to_amt,
				$tax_amt,
				$cash_amt,
				$note_amt,
				$account_amt,
				$setoff_amt,
				$sw_amt,
				$end_bal,
				$base_cur_init_bal,
				$base_cur_purc_amt,
				$base_cur_ret_amt,
				$base_cur_dscnt_amt,
				$base_cur_sw_to_amt,
				$base_cur_tax_amt,
				$base_cur_cash_amt,
				$base_cur_note_amt,
				$base_cur_account_amt,
				$base_cur_setoff_amt,
				$base_cur_sw_amt,
				$base_cur_end_bal,
				$exc_gain_loss,
				$total_exc_gain_loss,
				$asppl_grp_cd1,
				$asppl_grp_nm1,
				$asppl_grp_cd2,
				$asppl_grp_nm2,
				$asppl_grp_cd3,
				$asppl_grp_nm3,
				$asppl_grp_cd4,
				$asppl_grp_nm4,
				$asppl_grp_cd5,
				$asppl_grp_nm5,
				$asppl_grp_cd6,
				$asppl_grp_nm6,
				$asppl_grp_cd7,
				$asppl_grp_nm7,
				$asppl_grp_cd8,
				$asppl_grp_nm8,
				$asppl_grp_cd9,
				$asppl_grp_nm9,
				$asppl_grp_cd10,
				$asppl_grp_nm10
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
				{$base_cur_amt_dec_place, "BASE_CUR"},	// base_cur_amt_dec_place
				{$base_cur_init_bal_p + ".amt", "BASE_CUR"},	// base_cur_init_bal_p.amt
				{$base_cur_purc_amt_p + ".amt", "BASE_CUR"},	// base_cur_purc_amt_p.amt
				{$base_cur_ret_amt_p + ".amt", "BASE_CUR"},	// base_cur_ret_amt_p.amt
				{$base_cur_dscnt_amt_p + ".amt", "BASE_CUR"},	// base_cur_dscnt_amt_p.amt
				{$base_cur_sw_to_amt_p + ".amt", "BASE_CUR"},	// base_cur_sw_to_amt_p.amt
				{$base_cur_tax_amt_p + ".amt", "BASE_CUR"},	// base_cur_tax_amt_p.amt
				{$base_cur_cash_amt_p + ".amt", "BASE_CUR"},	// base_cur_cash_amt_p.amt
				{$base_cur_note_amt_p + ".amt", "BASE_CUR"},	// base_cur_note_amt_p.amt
				{$base_cur_account_amt_p + ".amt", "BASE_CUR"},	// base_cur_account_amt_p.amt
				{$base_cur_setoff_amt_p + ".amt", "BASE_CUR"},	// base_cur_setoff_amt_p.amt
				{$base_cur_sw_amt_p + ".amt", "BASE_CUR"},	// base_cur_sw_amt_p.amt
				{$base_cur_end_bal_p + ".amt", "BASE_CUR"}	// base_cur_end_bal_p.amt
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
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 1, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 1, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 2, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 2, $ap_dpt_nm, value);
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
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 5, $asppl_cd);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 5, $asppl_cd, value);
	}


	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public String asppl_nm() {
		return getConstString(offset + 6, $asppl_nm);
	}

	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public void asppl_nm(String value) {
		setConstString(offset + 6, $asppl_nm, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 7, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 7, $rcpt_iv_no, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 8, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 8, $rcpt_iv_mng_no, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 9, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 9, $purc_act_no, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 10, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 10, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 11, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 11, $trd_cur_nm, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 12, $trd_cur_amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 12, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 12, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 12, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 12, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 12, $trd_cur_amt_dec_place, value);
	}


	public mcframe.clientMSUB.MSUBP5010.WrkNoR wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5010.WrkNoR) getConstInnerRow(offset + 13, $wrk_no_p);
	}
	
	public void wrk_no_p(mcframe.clientMSUB.MSUBP5010.WrkNoR row){
		setConstInnerRow(offset + 13, $wrk_no_p, row);
	}


	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public String ap_typ() {
		return getConstString(offset + 14, $ap_typ);
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public void ap_typ(String value) {
		setConstString(offset + 14, $ap_typ, value);
	}


	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public String ap_typ_nm() {
		return getConstString(offset + 15, $ap_typ_nm);
	}

	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public void ap_typ_nm(String value) {
		setConstString(offset + 15, $ap_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR init_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 16, $init_bal_p);
	}
	
	public void init_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 16, $init_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR purc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 17, $purc_amt_p);
	}
	
	public void purc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 17, $purc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ret_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 18, $ret_amt_p);
	}
	
	public void ret_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 18, $ret_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR dscnt_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 19, $dscnt_amt_p);
	}
	
	public void dscnt_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 19, $dscnt_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR sw_to_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 20, $sw_to_amt_p);
	}
	
	public void sw_to_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 20, $sw_to_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 21, $tax_amt_p);
	}
	
	public void tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 21, $tax_amt_p, row);
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


	public mcframe.clientMAUB.MAUBP5050.AmtR account_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 24, $account_amt_p);
	}
	
	public void account_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 24, $account_amt_p, row);
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


	public mcframe.clientMAUB.MAUBP5050.AmtR end_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 27, $end_bal_p);
	}
	
	public void end_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 27, $end_bal_p, row);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 28, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 28, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 29, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 29, $base_cur_nm, value);
	}


	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_amt_dec_place() {
		return getConstNumber(offset + 30, $base_cur_amt_dec_place);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 30, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(int value) {
		setConstNumber(offset + 30, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(long value) {
		setConstNumber(offset + 30, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(float value) {
		setConstNumber(offset + 30, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(double value) {
		setConstNumber(offset + 30, $base_cur_amt_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_init_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 31, $base_cur_init_bal_p);
	}
	
	public void base_cur_init_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 31, $base_cur_init_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_purc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 32, $base_cur_purc_amt_p);
	}
	
	public void base_cur_purc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 32, $base_cur_purc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_ret_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 33, $base_cur_ret_amt_p);
	}
	
	public void base_cur_ret_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 33, $base_cur_ret_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_dscnt_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 34, $base_cur_dscnt_amt_p);
	}
	
	public void base_cur_dscnt_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 34, $base_cur_dscnt_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_sw_to_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 35, $base_cur_sw_to_amt_p);
	}
	
	public void base_cur_sw_to_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 35, $base_cur_sw_to_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 36, $base_cur_tax_amt_p);
	}
	
	public void base_cur_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 36, $base_cur_tax_amt_p, row);
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


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_account_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 39, $base_cur_account_amt_p);
	}
	
	public void base_cur_account_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 39, $base_cur_account_amt_p, row);
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


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_end_bal_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 42, $base_cur_end_bal_p);
	}
	
	public void base_cur_end_bal_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 42, $base_cur_end_bal_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR exc_gain_loss_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 43, $exc_gain_loss_p);
	}
	
	public void exc_gain_loss_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 43, $exc_gain_loss_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR total_exc_gain_loss_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 44, $total_exc_gain_loss_p);
	}
	
	public void total_exc_gain_loss_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 44, $total_exc_gain_loss_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR asppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 45, $asppl_grp_p);
	}
	
	public void asppl_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 45, $asppl_grp_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 46, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 46, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 47, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 47, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 48, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 48, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 49, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 49, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 50, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 50, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 51, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 51, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 52, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 52, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 53, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 53, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 54, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 54, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 55, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 55, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 56, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 56, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			return ap_typ_nm();
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
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
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
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			return ap_typ_nm();
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
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
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
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
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
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
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
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			ap_typ_nm(value);
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
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
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
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
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
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
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
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			ap_typ_nm(value);
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
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
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
		if ($purc_amt_p.equalsIgnoreCase(name)) {
			return purc_amt_p();
		}
		if ($ret_amt_p.equalsIgnoreCase(name)) {
			return ret_amt_p();
		}
		if ($dscnt_amt_p.equalsIgnoreCase(name)) {
			return dscnt_amt_p();
		}
		if ($sw_to_amt_p.equalsIgnoreCase(name)) {
			return sw_to_amt_p();
		}
		if ($tax_amt_p.equalsIgnoreCase(name)) {
			return tax_amt_p();
		}
		if ($cash_amt_p.equalsIgnoreCase(name)) {
			return cash_amt_p();
		}
		if ($note_amt_p.equalsIgnoreCase(name)) {
			return note_amt_p();
		}
		if ($account_amt_p.equalsIgnoreCase(name)) {
			return account_amt_p();
		}
		if ($setoff_amt_p.equalsIgnoreCase(name)) {
			return setoff_amt_p();
		}
		if ($sw_amt_p.equalsIgnoreCase(name)) {
			return sw_amt_p();
		}
		if ($end_bal_p.equalsIgnoreCase(name)) {
			return end_bal_p();
		}
		if ($base_cur_init_bal_p.equalsIgnoreCase(name)) {
			return base_cur_init_bal_p();
		}
		if ($base_cur_purc_amt_p.equalsIgnoreCase(name)) {
			return base_cur_purc_amt_p();
		}
		if ($base_cur_ret_amt_p.equalsIgnoreCase(name)) {
			return base_cur_ret_amt_p();
		}
		if ($base_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt_p();
		}
		if ($base_cur_sw_to_amt_p.equalsIgnoreCase(name)) {
			return base_cur_sw_to_amt_p();
		}
		if ($base_cur_tax_amt_p.equalsIgnoreCase(name)) {
			return base_cur_tax_amt_p();
		}
		if ($base_cur_cash_amt_p.equalsIgnoreCase(name)) {
			return base_cur_cash_amt_p();
		}
		if ($base_cur_note_amt_p.equalsIgnoreCase(name)) {
			return base_cur_note_amt_p();
		}
		if ($base_cur_account_amt_p.equalsIgnoreCase(name)) {
			return base_cur_account_amt_p();
		}
		if ($base_cur_setoff_amt_p.equalsIgnoreCase(name)) {
			return base_cur_setoff_amt_p();
		}
		if ($base_cur_sw_amt_p.equalsIgnoreCase(name)) {
			return base_cur_sw_amt_p();
		}
		if ($base_cur_end_bal_p.equalsIgnoreCase(name)) {
			return base_cur_end_bal_p();
		}
		if ($exc_gain_loss_p.equalsIgnoreCase(name)) {
			return exc_gain_loss_p();
		}
		if ($total_exc_gain_loss_p.equalsIgnoreCase(name)) {
			return total_exc_gain_loss_p();
		}
		if ($asppl_grp_p.equalsIgnoreCase(name)) {
			return asppl_grp_p();
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
		if ($purc_amt_p.equalsIgnoreCase(name)) {
			purc_amt_p(
				((MCContainerMeta) purc_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ret_amt_p.equalsIgnoreCase(name)) {
			ret_amt_p(
				((MCContainerMeta) ret_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($dscnt_amt_p.equalsIgnoreCase(name)) {
			dscnt_amt_p(
				((MCContainerMeta) dscnt_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($sw_to_amt_p.equalsIgnoreCase(name)) {
			sw_to_amt_p(
				((MCContainerMeta) sw_to_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($tax_amt_p.equalsIgnoreCase(name)) {
			tax_amt_p(
				((MCContainerMeta) tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
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
		if ($account_amt_p.equalsIgnoreCase(name)) {
			account_amt_p(
				((MCContainerMeta) account_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
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
		if ($end_bal_p.equalsIgnoreCase(name)) {
			end_bal_p(
				((MCContainerMeta) end_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_init_bal_p.equalsIgnoreCase(name)) {
			base_cur_init_bal_p(
				((MCContainerMeta) base_cur_init_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_purc_amt_p.equalsIgnoreCase(name)) {
			base_cur_purc_amt_p(
				((MCContainerMeta) base_cur_purc_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_ret_amt_p.equalsIgnoreCase(name)) {
			base_cur_ret_amt_p(
				((MCContainerMeta) base_cur_ret_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt_p(
				((MCContainerMeta) base_cur_dscnt_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_sw_to_amt_p.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt_p(
				((MCContainerMeta) base_cur_sw_to_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_tax_amt_p.equalsIgnoreCase(name)) {
			base_cur_tax_amt_p(
				((MCContainerMeta) base_cur_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
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
		if ($base_cur_account_amt_p.equalsIgnoreCase(name)) {
			base_cur_account_amt_p(
				((MCContainerMeta) base_cur_account_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
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
		if ($base_cur_end_bal_p.equalsIgnoreCase(name)) {
			base_cur_end_bal_p(
				((MCContainerMeta) base_cur_end_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
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
		if ($asppl_grp_p.equalsIgnoreCase(name)) {
			asppl_grp_p(
				((MCContainerMeta) asppl_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
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
	 * Beginning balance 月初残高.<p>
	 *
	 */
	public MCNumber init_bal() {
		return init_bal_p().amt();
	}

	/**
	 * Beginning balance 月初残高.<p>
	 *
	 */
	public void init_bal(MCNumber value) {
		init_bal_p().amt(value);
	}

	/**
	 * Beginning balance 月初残高.<p>
	 *
	 */
	public void init_bal(int value) {
		init_bal_p().amt(value);
	}

	/**
	 * Beginning balance 月初残高.<p>
	 *
	 */
	public void init_bal(long value) {
		init_bal_p().amt(value);
	}

	/**
	 * Beginning balance 月初残高.<p>
	 *
	 */
	public void init_bal(float value) {
		init_bal_p().amt(value);
	}

	/**
	 * Beginning balance 月初残高.<p>
	 *
	 */
	public void init_bal(double value) {
		init_bal_p().amt(value);
	}

	/**
	 * Purchase amount (Current month) 当月仕入額.<p>
	 *
	 */
	public MCNumber purc_amt() {
		return purc_amt_p().amt();
	}

	/**
	 * Purchase amount (Current month) 当月仕入額.<p>
	 *
	 */
	public void purc_amt(MCNumber value) {
		purc_amt_p().amt(value);
	}

	/**
	 * Purchase amount (Current month) 当月仕入額.<p>
	 *
	 */
	public void purc_amt(int value) {
		purc_amt_p().amt(value);
	}

	/**
	 * Purchase amount (Current month) 当月仕入額.<p>
	 *
	 */
	public void purc_amt(long value) {
		purc_amt_p().amt(value);
	}

	/**
	 * Purchase amount (Current month) 当月仕入額.<p>
	 *
	 */
	public void purc_amt(float value) {
		purc_amt_p().amt(value);
	}

	/**
	 * Purchase amount (Current month) 当月仕入額.<p>
	 *
	 */
	public void purc_amt(double value) {
		purc_amt_p().amt(value);
	}

	/**
	 * Return amount (Current month) 当月返品額.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return ret_amt_p().amt();
	}

	/**
	 * Return amount (Current month) 当月返品額.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		ret_amt_p().amt(value);
	}

	/**
	 * Return amount (Current month) 当月返品額.<p>
	 *
	 */
	public void ret_amt(int value) {
		ret_amt_p().amt(value);
	}

	/**
	 * Return amount (Current month) 当月返品額.<p>
	 *
	 */
	public void ret_amt(long value) {
		ret_amt_p().amt(value);
	}

	/**
	 * Return amount (Current month) 当月返品額.<p>
	 *
	 */
	public void ret_amt(float value) {
		ret_amt_p().amt(value);
	}

	/**
	 * Return amount (Current month) 当月返品額.<p>
	 *
	 */
	public void ret_amt(double value) {
		ret_amt_p().amt(value);
	}

	/**
	 * Discount amount (Current month) 当月値引額.<p>
	 *
	 */
	public MCNumber dscnt_amt() {
		return dscnt_amt_p().amt();
	}

	/**
	 * Discount amount (Current month) 当月値引額.<p>
	 *
	 */
	public void dscnt_amt(MCNumber value) {
		dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Current month) 当月値引額.<p>
	 *
	 */
	public void dscnt_amt(int value) {
		dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Current month) 当月値引額.<p>
	 *
	 */
	public void dscnt_amt(long value) {
		dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Current month) 当月値引額.<p>
	 *
	 */
	public void dscnt_amt(float value) {
		dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Current month) 当月値引額.<p>
	 *
	 */
	public void dscnt_amt(double value) {
		dscnt_amt_p().amt(value);
	}

	/**
	 * Transferred amount (Current month)(Transfer) 当月振替額（振替先）.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return sw_to_amt_p().amt();
	}

	/**
	 * Transferred amount (Current month)(Transfer) 当月振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		sw_to_amt_p().amt(value);
	}

	/**
	 * Transferred amount (Current month)(Transfer) 当月振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		sw_to_amt_p().amt(value);
	}

	/**
	 * Transferred amount (Current month)(Transfer) 当月振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		sw_to_amt_p().amt(value);
	}

	/**
	 * Transferred amount (Current month)(Transfer) 当月振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		sw_to_amt_p().amt(value);
	}

	/**
	 * Transferred amount (Current month)(Transfer) 当月振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		sw_to_amt_p().amt(value);
	}

	/**
	 * Tax amount (Current month) 当月税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return tax_amt_p().amt();
	}

	/**
	 * Tax amount (Current month) 当月税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Current month) 当月税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Current month) 当月税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Current month) 当月税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Current month) 当月税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Cash payment amount of current month 当月現金支払額.<p>
	 *
	 */
	public MCNumber cash_amt() {
		return cash_amt_p().amt();
	}

	/**
	 * Cash payment amount of current month 当月現金支払額.<p>
	 *
	 */
	public void cash_amt(MCNumber value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Cash payment amount of current month 当月現金支払額.<p>
	 *
	 */
	public void cash_amt(int value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Cash payment amount of current month 当月現金支払額.<p>
	 *
	 */
	public void cash_amt(long value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Cash payment amount of current month 当月現金支払額.<p>
	 *
	 */
	public void cash_amt(float value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Cash payment amount of current month 当月現金支払額.<p>
	 *
	 */
	public void cash_amt(double value) {
		cash_amt_p().amt(value);
	}

	/**
	 * Notes payment amount (Current month) 当月手形支払額.<p>
	 *
	 */
	public MCNumber note_amt() {
		return note_amt_p().amt();
	}

	/**
	 * Notes payment amount (Current month) 当月手形支払額.<p>
	 *
	 */
	public void note_amt(MCNumber value) {
		note_amt_p().amt(value);
	}

	/**
	 * Notes payment amount (Current month) 当月手形支払額.<p>
	 *
	 */
	public void note_amt(int value) {
		note_amt_p().amt(value);
	}

	/**
	 * Notes payment amount (Current month) 当月手形支払額.<p>
	 *
	 */
	public void note_amt(long value) {
		note_amt_p().amt(value);
	}

	/**
	 * Notes payment amount (Current month) 当月手形支払額.<p>
	 *
	 */
	public void note_amt(float value) {
		note_amt_p().amt(value);
	}

	/**
	 * Notes payment amount (Current month) 当月手形支払額.<p>
	 *
	 */
	public void note_amt(double value) {
		note_amt_p().amt(value);
	}

	/**
	 * Deposit payment amount (Current month) 当月預金支払額.<p>
	 *
	 */
	public MCNumber account_amt() {
		return account_amt_p().amt();
	}

	/**
	 * Deposit payment amount (Current month) 当月預金支払額.<p>
	 *
	 */
	public void account_amt(MCNumber value) {
		account_amt_p().amt(value);
	}

	/**
	 * Deposit payment amount (Current month) 当月預金支払額.<p>
	 *
	 */
	public void account_amt(int value) {
		account_amt_p().amt(value);
	}

	/**
	 * Deposit payment amount (Current month) 当月預金支払額.<p>
	 *
	 */
	public void account_amt(long value) {
		account_amt_p().amt(value);
	}

	/**
	 * Deposit payment amount (Current month) 当月預金支払額.<p>
	 *
	 */
	public void account_amt(float value) {
		account_amt_p().amt(value);
	}

	/**
	 * Deposit payment amount (Current month) 当月預金支払額.<p>
	 *
	 */
	public void account_amt(double value) {
		account_amt_p().amt(value);
	}

	/**
	 * Offset amount (Current month) 当月相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return setoff_amt_p().amt();
	}

	/**
	 * Offset amount (Current month) 当月相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Offset amount (Current month) 当月相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Offset amount (Current month) 当月相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Offset amount (Current month) 当月相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Offset amount (Current month) 当月相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setoff_amt_p().amt(value);
	}

	/**
	 * Transferred amount (Current month) 当月振替額.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return sw_amt_p().amt();
	}

	/**
	 * Transferred amount (Current month) 当月振替額.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		sw_amt_p().amt(value);
	}

	/**
	 * Transferred amount (Current month) 当月振替額.<p>
	 *
	 */
	public void sw_amt(int value) {
		sw_amt_p().amt(value);
	}

	/**
	 * Transferred amount (Current month) 当月振替額.<p>
	 *
	 */
	public void sw_amt(long value) {
		sw_amt_p().amt(value);
	}

	/**
	 * Transferred amount (Current month) 当月振替額.<p>
	 *
	 */
	public void sw_amt(float value) {
		sw_amt_p().amt(value);
	}

	/**
	 * Transferred amount (Current month) 当月振替額.<p>
	 *
	 */
	public void sw_amt(double value) {
		sw_amt_p().amt(value);
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public MCNumber end_bal() {
		return end_bal_p().amt();
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public void end_bal(MCNumber value) {
		end_bal_p().amt(value);
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public void end_bal(int value) {
		end_bal_p().amt(value);
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public void end_bal(long value) {
		end_bal_p().amt(value);
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public void end_bal(float value) {
		end_bal_p().amt(value);
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public void end_bal(double value) {
		end_bal_p().amt(value);
	}

	/**
	 * Beginning balance (Base currency) 基準通貨月初残高.<p>
	 *
	 */
	public MCNumber base_cur_init_bal() {
		return base_cur_init_bal_p().amt();
	}

	/**
	 * Beginning balance (Base currency) 基準通貨月初残高.<p>
	 *
	 */
	public void base_cur_init_bal(MCNumber value) {
		base_cur_init_bal_p().amt(value);
	}

	/**
	 * Beginning balance (Base currency) 基準通貨月初残高.<p>
	 *
	 */
	public void base_cur_init_bal(int value) {
		base_cur_init_bal_p().amt(value);
	}

	/**
	 * Beginning balance (Base currency) 基準通貨月初残高.<p>
	 *
	 */
	public void base_cur_init_bal(long value) {
		base_cur_init_bal_p().amt(value);
	}

	/**
	 * Beginning balance (Base currency) 基準通貨月初残高.<p>
	 *
	 */
	public void base_cur_init_bal(float value) {
		base_cur_init_bal_p().amt(value);
	}

	/**
	 * Beginning balance (Base currency) 基準通貨月初残高.<p>
	 *
	 */
	public void base_cur_init_bal(double value) {
		base_cur_init_bal_p().amt(value);
	}

	/**
	 * Current month purchase amount (Base currency) 基準通貨当月仕入額.<p>
	 *
	 */
	public MCNumber base_cur_purc_amt() {
		return base_cur_purc_amt_p().amt();
	}

	/**
	 * Current month purchase amount (Base currency) 基準通貨当月仕入額.<p>
	 *
	 */
	public void base_cur_purc_amt(MCNumber value) {
		base_cur_purc_amt_p().amt(value);
	}

	/**
	 * Current month purchase amount (Base currency) 基準通貨当月仕入額.<p>
	 *
	 */
	public void base_cur_purc_amt(int value) {
		base_cur_purc_amt_p().amt(value);
	}

	/**
	 * Current month purchase amount (Base currency) 基準通貨当月仕入額.<p>
	 *
	 */
	public void base_cur_purc_amt(long value) {
		base_cur_purc_amt_p().amt(value);
	}

	/**
	 * Current month purchase amount (Base currency) 基準通貨当月仕入額.<p>
	 *
	 */
	public void base_cur_purc_amt(float value) {
		base_cur_purc_amt_p().amt(value);
	}

	/**
	 * Current month purchase amount (Base currency) 基準通貨当月仕入額.<p>
	 *
	 */
	public void base_cur_purc_amt(double value) {
		base_cur_purc_amt_p().amt(value);
	}

	/**
	 * Current month return amount (Base currency) 基準通貨当月返品額.<p>
	 *
	 */
	public MCNumber base_cur_ret_amt() {
		return base_cur_ret_amt_p().amt();
	}

	/**
	 * Current month return amount (Base currency) 基準通貨当月返品額.<p>
	 *
	 */
	public void base_cur_ret_amt(MCNumber value) {
		base_cur_ret_amt_p().amt(value);
	}

	/**
	 * Current month return amount (Base currency) 基準通貨当月返品額.<p>
	 *
	 */
	public void base_cur_ret_amt(int value) {
		base_cur_ret_amt_p().amt(value);
	}

	/**
	 * Current month return amount (Base currency) 基準通貨当月返品額.<p>
	 *
	 */
	public void base_cur_ret_amt(long value) {
		base_cur_ret_amt_p().amt(value);
	}

	/**
	 * Current month return amount (Base currency) 基準通貨当月返品額.<p>
	 *
	 */
	public void base_cur_ret_amt(float value) {
		base_cur_ret_amt_p().amt(value);
	}

	/**
	 * Current month return amount (Base currency) 基準通貨当月返品額.<p>
	 *
	 */
	public void base_cur_ret_amt(double value) {
		base_cur_ret_amt_p().amt(value);
	}

	/**
	 * Current month discount amount (Base currency) 基準通貨当月値引額.<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return base_cur_dscnt_amt_p().amt();
	}

	/**
	 * Current month discount amount (Base currency) 基準通貨当月値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Current month discount amount (Base currency) 基準通貨当月値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Current month discount amount (Base currency) 基準通貨当月値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Current month discount amount (Base currency) 基準通貨当月値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Current month discount amount (Base currency) 基準通貨当月値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Current month transfer amount (Transfer) (Base currency) 基準通貨当月振替額（振替先）.<p>
	 *
	 */
	public MCNumber base_cur_sw_to_amt() {
		return base_cur_sw_to_amt_p().amt();
	}

	/**
	 * Current month transfer amount (Transfer) (Base currency) 基準通貨当月振替額（振替先）.<p>
	 *
	 */
	public void base_cur_sw_to_amt(MCNumber value) {
		base_cur_sw_to_amt_p().amt(value);
	}

	/**
	 * Current month transfer amount (Transfer) (Base currency) 基準通貨当月振替額（振替先）.<p>
	 *
	 */
	public void base_cur_sw_to_amt(int value) {
		base_cur_sw_to_amt_p().amt(value);
	}

	/**
	 * Current month transfer amount (Transfer) (Base currency) 基準通貨当月振替額（振替先）.<p>
	 *
	 */
	public void base_cur_sw_to_amt(long value) {
		base_cur_sw_to_amt_p().amt(value);
	}

	/**
	 * Current month transfer amount (Transfer) (Base currency) 基準通貨当月振替額（振替先）.<p>
	 *
	 */
	public void base_cur_sw_to_amt(float value) {
		base_cur_sw_to_amt_p().amt(value);
	}

	/**
	 * Current month transfer amount (Transfer) (Base currency) 基準通貨当月振替額（振替先）.<p>
	 *
	 */
	public void base_cur_sw_to_amt(double value) {
		base_cur_sw_to_amt_p().amt(value);
	}

	/**
	 * Current month tax amount (Base currency) 基準通貨当月税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return base_cur_tax_amt_p().amt();
	}

	/**
	 * Current month tax amount (Base currency) 基準通貨当月税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Current month tax amount (Base currency) 基準通貨当月税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Current month tax amount (Base currency) 基準通貨当月税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Current month tax amount (Base currency) 基準通貨当月税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Current month tax amount (Base currency) 基準通貨当月税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Current month cash payment amount (Base currency) 基準通貨当月現金支払額.<p>
	 *
	 */
	public MCNumber base_cur_cash_amt() {
		return base_cur_cash_amt_p().amt();
	}

	/**
	 * Current month cash payment amount (Base currency) 基準通貨当月現金支払額.<p>
	 *
	 */
	public void base_cur_cash_amt(MCNumber value) {
		base_cur_cash_amt_p().amt(value);
	}

	/**
	 * Current month cash payment amount (Base currency) 基準通貨当月現金支払額.<p>
	 *
	 */
	public void base_cur_cash_amt(int value) {
		base_cur_cash_amt_p().amt(value);
	}

	/**
	 * Current month cash payment amount (Base currency) 基準通貨当月現金支払額.<p>
	 *
	 */
	public void base_cur_cash_amt(long value) {
		base_cur_cash_amt_p().amt(value);
	}

	/**
	 * Current month cash payment amount (Base currency) 基準通貨当月現金支払額.<p>
	 *
	 */
	public void base_cur_cash_amt(float value) {
		base_cur_cash_amt_p().amt(value);
	}

	/**
	 * Current month cash payment amount (Base currency) 基準通貨当月現金支払額.<p>
	 *
	 */
	public void base_cur_cash_amt(double value) {
		base_cur_cash_amt_p().amt(value);
	}

	/**
	 * Current month notes payment amount (Base currency) 基準通貨当月手形支払額.<p>
	 *
	 */
	public MCNumber base_cur_note_amt() {
		return base_cur_note_amt_p().amt();
	}

	/**
	 * Current month notes payment amount (Base currency) 基準通貨当月手形支払額.<p>
	 *
	 */
	public void base_cur_note_amt(MCNumber value) {
		base_cur_note_amt_p().amt(value);
	}

	/**
	 * Current month notes payment amount (Base currency) 基準通貨当月手形支払額.<p>
	 *
	 */
	public void base_cur_note_amt(int value) {
		base_cur_note_amt_p().amt(value);
	}

	/**
	 * Current month notes payment amount (Base currency) 基準通貨当月手形支払額.<p>
	 *
	 */
	public void base_cur_note_amt(long value) {
		base_cur_note_amt_p().amt(value);
	}

	/**
	 * Current month notes payment amount (Base currency) 基準通貨当月手形支払額.<p>
	 *
	 */
	public void base_cur_note_amt(float value) {
		base_cur_note_amt_p().amt(value);
	}

	/**
	 * Current month notes payment amount (Base currency) 基準通貨当月手形支払額.<p>
	 *
	 */
	public void base_cur_note_amt(double value) {
		base_cur_note_amt_p().amt(value);
	}

	/**
	 * Current month deposit payment amount (Base currency) 基準通貨当月預金支払額.<p>
	 *
	 */
	public MCNumber base_cur_account_amt() {
		return base_cur_account_amt_p().amt();
	}

	/**
	 * Current month deposit payment amount (Base currency) 基準通貨当月預金支払額.<p>
	 *
	 */
	public void base_cur_account_amt(MCNumber value) {
		base_cur_account_amt_p().amt(value);
	}

	/**
	 * Current month deposit payment amount (Base currency) 基準通貨当月預金支払額.<p>
	 *
	 */
	public void base_cur_account_amt(int value) {
		base_cur_account_amt_p().amt(value);
	}

	/**
	 * Current month deposit payment amount (Base currency) 基準通貨当月預金支払額.<p>
	 *
	 */
	public void base_cur_account_amt(long value) {
		base_cur_account_amt_p().amt(value);
	}

	/**
	 * Current month deposit payment amount (Base currency) 基準通貨当月預金支払額.<p>
	 *
	 */
	public void base_cur_account_amt(float value) {
		base_cur_account_amt_p().amt(value);
	}

	/**
	 * Current month deposit payment amount (Base currency) 基準通貨当月預金支払額.<p>
	 *
	 */
	public void base_cur_account_amt(double value) {
		base_cur_account_amt_p().amt(value);
	}

	/**
	 * Current month offset amount (Base currency) 基準通貨当月相殺額.<p>
	 *
	 */
	public MCNumber base_cur_setoff_amt() {
		return base_cur_setoff_amt_p().amt();
	}

	/**
	 * Current month offset amount (Base currency) 基準通貨当月相殺額.<p>
	 *
	 */
	public void base_cur_setoff_amt(MCNumber value) {
		base_cur_setoff_amt_p().amt(value);
	}

	/**
	 * Current month offset amount (Base currency) 基準通貨当月相殺額.<p>
	 *
	 */
	public void base_cur_setoff_amt(int value) {
		base_cur_setoff_amt_p().amt(value);
	}

	/**
	 * Current month offset amount (Base currency) 基準通貨当月相殺額.<p>
	 *
	 */
	public void base_cur_setoff_amt(long value) {
		base_cur_setoff_amt_p().amt(value);
	}

	/**
	 * Current month offset amount (Base currency) 基準通貨当月相殺額.<p>
	 *
	 */
	public void base_cur_setoff_amt(float value) {
		base_cur_setoff_amt_p().amt(value);
	}

	/**
	 * Current month offset amount (Base currency) 基準通貨当月相殺額.<p>
	 *
	 */
	public void base_cur_setoff_amt(double value) {
		base_cur_setoff_amt_p().amt(value);
	}

	/**
	 * Current month transfer amount (Base currency) 基準通貨当月振替額.<p>
	 *
	 */
	public MCNumber base_cur_sw_amt() {
		return base_cur_sw_amt_p().amt();
	}

	/**
	 * Current month transfer amount (Base currency) 基準通貨当月振替額.<p>
	 *
	 */
	public void base_cur_sw_amt(MCNumber value) {
		base_cur_sw_amt_p().amt(value);
	}

	/**
	 * Current month transfer amount (Base currency) 基準通貨当月振替額.<p>
	 *
	 */
	public void base_cur_sw_amt(int value) {
		base_cur_sw_amt_p().amt(value);
	}

	/**
	 * Current month transfer amount (Base currency) 基準通貨当月振替額.<p>
	 *
	 */
	public void base_cur_sw_amt(long value) {
		base_cur_sw_amt_p().amt(value);
	}

	/**
	 * Current month transfer amount (Base currency) 基準通貨当月振替額.<p>
	 *
	 */
	public void base_cur_sw_amt(float value) {
		base_cur_sw_amt_p().amt(value);
	}

	/**
	 * Current month transfer amount (Base currency) 基準通貨当月振替額.<p>
	 *
	 */
	public void base_cur_sw_amt(double value) {
		base_cur_sw_amt_p().amt(value);
	}

	/**
	 * Current month balance (Base currency) 基準通貨当月残高.<p>
	 *
	 */
	public MCNumber base_cur_end_bal() {
		return base_cur_end_bal_p().amt();
	}

	/**
	 * Current month balance (Base currency) 基準通貨当月残高.<p>
	 *
	 */
	public void base_cur_end_bal(MCNumber value) {
		base_cur_end_bal_p().amt(value);
	}

	/**
	 * Current month balance (Base currency) 基準通貨当月残高.<p>
	 *
	 */
	public void base_cur_end_bal(int value) {
		base_cur_end_bal_p().amt(value);
	}

	/**
	 * Current month balance (Base currency) 基準通貨当月残高.<p>
	 *
	 */
	public void base_cur_end_bal(long value) {
		base_cur_end_bal_p().amt(value);
	}

	/**
	 * Current month balance (Base currency) 基準通貨当月残高.<p>
	 *
	 */
	public void base_cur_end_bal(float value) {
		base_cur_end_bal_p().amt(value);
	}

	/**
	 * Current month balance (Base currency) 基準通貨当月残高.<p>
	 *
	 */
	public void base_cur_end_bal(double value) {
		base_cur_end_bal_p().amt(value);
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
	 * AP supplier classification cd. 1 買掛先分類ＣＤ１.<p>
	 *
	 */
	public String asppl_grp_cd1() {
		return asppl_grp_p().bp_grp_cd1();
	}

	/**
	 * AP supplier classification cd. 1 買掛先分類ＣＤ１.<p>
	 *
	 */
	public void asppl_grp_cd1(String value) {
		asppl_grp_p().bp_grp_cd1(value);
	}

	/**
	 * AP supplier classification name 1 買掛先分類名１.<p>
	 *
	 */
	public String asppl_grp_nm1() {
		return asppl_grp_p().bp_grp_nm1();
	}

	/**
	 * AP supplier classification name 1 買掛先分類名１.<p>
	 *
	 */
	public void asppl_grp_nm1(String value) {
		asppl_grp_p().bp_grp_nm1(value);
	}

	/**
	 * AP supplier classification cd. 2 買掛先分類ＣＤ２.<p>
	 *
	 */
	public String asppl_grp_cd2() {
		return asppl_grp_p().bp_grp_cd2();
	}

	/**
	 * AP supplier classification cd. 2 買掛先分類ＣＤ２.<p>
	 *
	 */
	public void asppl_grp_cd2(String value) {
		asppl_grp_p().bp_grp_cd2(value);
	}

	/**
	 * AP supplier classification name 2 買掛先分類名２.<p>
	 *
	 */
	public String asppl_grp_nm2() {
		return asppl_grp_p().bp_grp_nm2();
	}

	/**
	 * AP supplier classification name 2 買掛先分類名２.<p>
	 *
	 */
	public void asppl_grp_nm2(String value) {
		asppl_grp_p().bp_grp_nm2(value);
	}

	/**
	 * AP supplier classification cd. 3 買掛先分類ＣＤ３.<p>
	 *
	 */
	public String asppl_grp_cd3() {
		return asppl_grp_p().bp_grp_cd3();
	}

	/**
	 * AP supplier classification cd. 3 買掛先分類ＣＤ３.<p>
	 *
	 */
	public void asppl_grp_cd3(String value) {
		asppl_grp_p().bp_grp_cd3(value);
	}

	/**
	 * AP supplier classification name 3 買掛先分類名３.<p>
	 *
	 */
	public String asppl_grp_nm3() {
		return asppl_grp_p().bp_grp_nm3();
	}

	/**
	 * AP supplier classification name 3 買掛先分類名３.<p>
	 *
	 */
	public void asppl_grp_nm3(String value) {
		asppl_grp_p().bp_grp_nm3(value);
	}

	/**
	 * AP supplier classification cd. 4 買掛先分類ＣＤ４.<p>
	 *
	 */
	public String asppl_grp_cd4() {
		return asppl_grp_p().bp_grp_cd4();
	}

	/**
	 * AP supplier classification cd. 4 買掛先分類ＣＤ４.<p>
	 *
	 */
	public void asppl_grp_cd4(String value) {
		asppl_grp_p().bp_grp_cd4(value);
	}

	/**
	 * AP supplier classification name 4 買掛先分類名４.<p>
	 *
	 */
	public String asppl_grp_nm4() {
		return asppl_grp_p().bp_grp_nm4();
	}

	/**
	 * AP supplier classification name 4 買掛先分類名４.<p>
	 *
	 */
	public void asppl_grp_nm4(String value) {
		asppl_grp_p().bp_grp_nm4(value);
	}

	/**
	 * AP supplier classification cd. 5 買掛先分類ＣＤ５.<p>
	 *
	 */
	public String asppl_grp_cd5() {
		return asppl_grp_p().bp_grp_cd5();
	}

	/**
	 * AP supplier classification cd. 5 買掛先分類ＣＤ５.<p>
	 *
	 */
	public void asppl_grp_cd5(String value) {
		asppl_grp_p().bp_grp_cd5(value);
	}

	/**
	 * AP supplier classification name 5 買掛先分類名５.<p>
	 *
	 */
	public String asppl_grp_nm5() {
		return asppl_grp_p().bp_grp_nm5();
	}

	/**
	 * AP supplier classification name 5 買掛先分類名５.<p>
	 *
	 */
	public void asppl_grp_nm5(String value) {
		asppl_grp_p().bp_grp_nm5(value);
	}

	/**
	 * AP supplier classification cd. 6 買掛先分類ＣＤ６.<p>
	 *
	 */
	public String asppl_grp_cd6() {
		return asppl_grp_p().bp_grp_cd6();
	}

	/**
	 * AP supplier classification cd. 6 買掛先分類ＣＤ６.<p>
	 *
	 */
	public void asppl_grp_cd6(String value) {
		asppl_grp_p().bp_grp_cd6(value);
	}

	/**
	 * AP supplier classification name 6 買掛先分類名６.<p>
	 *
	 */
	public String asppl_grp_nm6() {
		return asppl_grp_p().bp_grp_nm6();
	}

	/**
	 * AP supplier classification name 6 買掛先分類名６.<p>
	 *
	 */
	public void asppl_grp_nm6(String value) {
		asppl_grp_p().bp_grp_nm6(value);
	}

	/**
	 * AP supplier classification cd. 7 買掛先分類ＣＤ７.<p>
	 *
	 */
	public String asppl_grp_cd7() {
		return asppl_grp_p().bp_grp_cd7();
	}

	/**
	 * AP supplier classification cd. 7 買掛先分類ＣＤ７.<p>
	 *
	 */
	public void asppl_grp_cd7(String value) {
		asppl_grp_p().bp_grp_cd7(value);
	}

	/**
	 * AP supplier classification name 7 買掛先分類名７.<p>
	 *
	 */
	public String asppl_grp_nm7() {
		return asppl_grp_p().bp_grp_nm7();
	}

	/**
	 * AP supplier classification name 7 買掛先分類名７.<p>
	 *
	 */
	public void asppl_grp_nm7(String value) {
		asppl_grp_p().bp_grp_nm7(value);
	}

	/**
	 * AP supplier classification cd. 8 買掛先分類ＣＤ８.<p>
	 *
	 */
	public String asppl_grp_cd8() {
		return asppl_grp_p().bp_grp_cd8();
	}

	/**
	 * AP supplier classification cd. 8 買掛先分類ＣＤ８.<p>
	 *
	 */
	public void asppl_grp_cd8(String value) {
		asppl_grp_p().bp_grp_cd8(value);
	}

	/**
	 * AP supplier classification name 8 買掛先分類名８.<p>
	 *
	 */
	public String asppl_grp_nm8() {
		return asppl_grp_p().bp_grp_nm8();
	}

	/**
	 * AP supplier classification name 8 買掛先分類名８.<p>
	 *
	 */
	public void asppl_grp_nm8(String value) {
		asppl_grp_p().bp_grp_nm8(value);
	}

	/**
	 * AP supplier classification cd. 9 買掛先分類ＣＤ９.<p>
	 *
	 */
	public String asppl_grp_cd9() {
		return asppl_grp_p().bp_grp_cd9();
	}

	/**
	 * AP supplier classification cd. 9 買掛先分類ＣＤ９.<p>
	 *
	 */
	public void asppl_grp_cd9(String value) {
		asppl_grp_p().bp_grp_cd9(value);
	}

	/**
	 * AP supplier classification name 9 買掛先分類名９.<p>
	 *
	 */
	public String asppl_grp_nm9() {
		return asppl_grp_p().bp_grp_nm9();
	}

	/**
	 * AP supplier classification name 9 買掛先分類名９.<p>
	 *
	 */
	public void asppl_grp_nm9(String value) {
		asppl_grp_p().bp_grp_nm9(value);
	}

	/**
	 * AP supplier classification cd. 10 買掛先分類ＣＤ１０.<p>
	 *
	 */
	public String asppl_grp_cd10() {
		return asppl_grp_p().bp_grp_cd10();
	}

	/**
	 * AP supplier classification cd. 10 買掛先分類ＣＤ１０.<p>
	 *
	 */
	public void asppl_grp_cd10(String value) {
		asppl_grp_p().bp_grp_cd10(value);
	}

	/**
	 * AP supplier classification name 10 買掛先分類名１０.<p>
	 *
	 */
	public String asppl_grp_nm10() {
		return asppl_grp_p().bp_grp_nm10();
	}

	/**
	 * AP supplier classification name 10 買掛先分類名１０.<p>
	 *
	 */
	public void asppl_grp_nm10(String value) {
		asppl_grp_p().bp_grp_nm10(value);
	}

}

