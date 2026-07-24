package mcframe.serverMSBH.MSBHL5110;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"ApBal_Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ApBal_Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
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
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
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
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
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
	/**
	 * AP credit managed BP cd. 債務与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $ap_cred_cd = "ap_cred_cd";
	/**
	 * Beginning balance 月初残高.<p>
	 *
	 */
	public static final String $init_bal = "init_bal";
	/**
	 * Purchase amount (Current month) 当月仕入額.<p>
	 *
	 */
	public static final String $purc_amt = "purc_amt";
	/**
	 * Return amount (Current month) 当月返品額.<p>
	 *
	 */
	public static final String $ret_amt = "ret_amt";
	/**
	 * Discount amount (Current month) 当月値引額.<p>
	 *
	 */
	public static final String $dscnt_amt = "dscnt_amt";
	/**
	 * Transferred amount (Current month)(Transfer) 当月振替額（振替先）.<p>
	 *
	 */
	public static final String $sw_to_amt = "sw_to_amt";
	/**
	 * Tax amount (Current month) 当月税額.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	/**
	 * Cash payment amount of current month 当月現金支払額.<p>
	 *
	 */
	public static final String $cash_amt = "cash_amt";
	/**
	 * Notes payment amount (Current month) 当月手形支払額.<p>
	 *
	 */
	public static final String $note_amt = "note_amt";
	/**
	 * Deposit payment amount (Current month) 当月預金支払額.<p>
	 *
	 */
	public static final String $account_amt = "account_amt";
	/**
	 * Offset amount (Current month) 当月相殺額.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	/**
	 * Transferred amount (Current month) 当月振替額.<p>
	 *
	 */
	public static final String $sw_amt = "sw_amt";
	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public static final String $end_bal = "end_bal";
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
	/**
	 * Beginning balance (Base currency) 基準通貨月初残高.<p>
	 *
	 */
	public static final String $base_cur_init_bal = "base_cur_init_bal";
	/**
	 * Current month purchase amount (Base currency) 基準通貨当月仕入額.<p>
	 *
	 */
	public static final String $base_cur_purc_amt = "base_cur_purc_amt";
	/**
	 * Current month return amount (Base currency) 基準通貨当月返品額.<p>
	 *
	 */
	public static final String $base_cur_ret_amt = "base_cur_ret_amt";
	/**
	 * Current month discount amount (Base currency) 基準通貨当月値引額.<p>
	 *
	 */
	public static final String $base_cur_dscnt_amt = "base_cur_dscnt_amt";
	/**
	 * Current month transfer amount (Transfer) (Base currency) 基準通貨当月振替額（振替先）.<p>
	 *
	 */
	public static final String $base_cur_sw_to_amt = "base_cur_sw_to_amt";
	/**
	 * Current month tax amount (Base currency) 基準通貨当月税額.<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	/**
	 * Current month cash payment amount (Base currency) 基準通貨当月現金支払額.<p>
	 *
	 */
	public static final String $base_cur_cash_amt = "base_cur_cash_amt";
	/**
	 * Current month notes payment amount (Base currency) 基準通貨当月手形支払額.<p>
	 *
	 */
	public static final String $base_cur_note_amt = "base_cur_note_amt";
	/**
	 * Current month deposit payment amount (Base currency) 基準通貨当月預金支払額.<p>
	 *
	 */
	public static final String $base_cur_account_amt = "base_cur_account_amt";
	/**
	 * Current month offset amount (Base currency) 基準通貨当月相殺額.<p>
	 *
	 */
	public static final String $base_cur_setoff_amt = "base_cur_setoff_amt";
	/**
	 * Current month transfer amount (Base currency) 基準通貨当月振替額.<p>
	 *
	 */
	public static final String $base_cur_sw_amt = "base_cur_sw_amt";
	/**
	 * Current month balance (Base currency) 基準通貨当月残高.<p>
	 *
	 */
	public static final String $base_cur_end_bal = "base_cur_end_bal";
	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public static final String $exc_gain_loss = "exc_gain_loss";
	/**
	 * Accumulation exchange gain/loss 累計為替差損益.<p>
	 *
	 */
	public static final String $total_exc_gain_loss = "total_exc_gain_loss";
	/**
	 * AP supplier classification cd. 1 買掛先分類ＣＤ１.<p>
	 *
	 */
	public static final String $asppl_grp_cd1 = "asppl_grp_cd1";
	/**
	 * AP supplier classification name 1 買掛先分類名１.<p>
	 *
	 */
	public static final String $asppl_grp_nm1 = "asppl_grp_nm1";
	/**
	 * AP supplier classification cd. 2 買掛先分類ＣＤ２.<p>
	 *
	 */
	public static final String $asppl_grp_cd2 = "asppl_grp_cd2";
	/**
	 * AP supplier classification name 2 買掛先分類名２.<p>
	 *
	 */
	public static final String $asppl_grp_nm2 = "asppl_grp_nm2";
	/**
	 * AP supplier classification cd. 3 買掛先分類ＣＤ３.<p>
	 *
	 */
	public static final String $asppl_grp_cd3 = "asppl_grp_cd3";
	/**
	 * AP supplier classification name 3 買掛先分類名３.<p>
	 *
	 */
	public static final String $asppl_grp_nm3 = "asppl_grp_nm3";
	/**
	 * AP supplier classification cd. 4 買掛先分類ＣＤ４.<p>
	 *
	 */
	public static final String $asppl_grp_cd4 = "asppl_grp_cd4";
	/**
	 * AP supplier classification name 4 買掛先分類名４.<p>
	 *
	 */
	public static final String $asppl_grp_nm4 = "asppl_grp_nm4";
	/**
	 * AP supplier classification cd. 5 買掛先分類ＣＤ５.<p>
	 *
	 */
	public static final String $asppl_grp_cd5 = "asppl_grp_cd5";
	/**
	 * AP supplier classification name 5 買掛先分類名５.<p>
	 *
	 */
	public static final String $asppl_grp_nm5 = "asppl_grp_nm5";
	/**
	 * AP supplier classification cd. 6 買掛先分類ＣＤ６.<p>
	 *
	 */
	public static final String $asppl_grp_cd6 = "asppl_grp_cd6";
	/**
	 * AP supplier classification name 6 買掛先分類名６.<p>
	 *
	 */
	public static final String $asppl_grp_nm6 = "asppl_grp_nm6";
	/**
	 * AP supplier classification cd. 7 買掛先分類ＣＤ７.<p>
	 *
	 */
	public static final String $asppl_grp_cd7 = "asppl_grp_cd7";
	/**
	 * AP supplier classification name 7 買掛先分類名７.<p>
	 *
	 */
	public static final String $asppl_grp_nm7 = "asppl_grp_nm7";
	/**
	 * AP supplier classification cd. 8 買掛先分類ＣＤ８.<p>
	 *
	 */
	public static final String $asppl_grp_cd8 = "asppl_grp_cd8";
	/**
	 * AP supplier classification name 8 買掛先分類名８.<p>
	 *
	 */
	public static final String $asppl_grp_nm8 = "asppl_grp_nm8";
	/**
	 * AP supplier classification cd. 9 買掛先分類ＣＤ９.<p>
	 *
	 */
	public static final String $asppl_grp_cd9 = "asppl_grp_cd9";
	/**
	 * AP supplier classification name 9 買掛先分類名９.<p>
	 *
	 */
	public static final String $asppl_grp_nm9 = "asppl_grp_nm9";
	/**
	 * AP supplier classification cd. 10 買掛先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $asppl_grp_cd10 = "asppl_grp_cd10";
	/**
	 * AP supplier classification name 10 買掛先分類名１０.<p>
	 *
	 */
	public static final String $asppl_grp_nm10 = "asppl_grp_nm10";
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


	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_nm_META = createCommonMeta($asppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta ap_typ_META = createCommonMeta($ap_typ, mcframe.commonMA.meta.MA_META.AP_TYP);
	public static final MCMeta ap_typ_nm_META = createCommonMeta($ap_typ_nm, mcframe.commonMA.meta.MA_META.AP_TYP_NM);
	public static final MCMeta ap_cred_cd_META = createCommonMeta($ap_cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta init_bal_META = createCommonMeta($init_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_amt_META = createCommonMeta($purc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_amt_META = createCommonMeta($ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dscnt_amt_META = createCommonMeta($dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_to_amt_META = createCommonMeta($sw_to_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cash_amt_META = createCommonMeta($cash_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta note_amt_META = createCommonMeta($note_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta account_amt_META = createCommonMeta($account_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_amt_META = createCommonMeta($sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta end_bal_META = createCommonMeta($end_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_amt_dec_place_META = createCommonMeta($base_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_init_bal_META = createCommonMeta($base_cur_init_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_purc_amt_META = createCommonMeta($base_cur_purc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_ret_amt_META = createCommonMeta($base_cur_ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_dscnt_amt_META = createCommonMeta($base_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_sw_to_amt_META = createCommonMeta($base_cur_sw_to_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_cash_amt_META = createCommonMeta($base_cur_cash_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_note_amt_META = createCommonMeta($base_cur_note_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_account_amt_META = createCommonMeta($base_cur_account_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_setoff_amt_META = createCommonMeta($base_cur_setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_sw_amt_META = createCommonMeta($base_cur_sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_end_bal_META = createCommonMeta($base_cur_end_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta exc_gain_loss_META = createCommonMeta($exc_gain_loss, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta total_exc_gain_loss_META = createCommonMeta($total_exc_gain_loss, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta asppl_grp_cd1_META = createCommonMeta($asppl_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm1_META = createCommonMeta($asppl_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_cd2_META = createCommonMeta($asppl_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm2_META = createCommonMeta($asppl_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_cd3_META = createCommonMeta($asppl_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm3_META = createCommonMeta($asppl_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_cd4_META = createCommonMeta($asppl_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm4_META = createCommonMeta($asppl_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_cd5_META = createCommonMeta($asppl_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm5_META = createCommonMeta($asppl_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_cd6_META = createCommonMeta($asppl_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm6_META = createCommonMeta($asppl_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_cd7_META = createCommonMeta($asppl_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm7_META = createCommonMeta($asppl_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_cd8_META = createCommonMeta($asppl_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm8_META = createCommonMeta($asppl_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_cd9_META = createCommonMeta($asppl_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm9_META = createCommonMeta($asppl_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_cd10_META = createCommonMeta($asppl_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm10_META = createCommonMeta($asppl_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
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

	protected static final ConstMetaList<ApBal_Srch01_RsltR> constMetas = new ConstMetaList<ApBal_Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			peg_no_META,
			err_flg_META,
			ac_ym_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			asppl_cd_META,
			asppl_nm_META,
			purc_act_no_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_cur_amt_dec_place_META,
			wrk_no_META,
			wrk_nm_META,
			ap_typ_META,
			ap_typ_nm_META,
			ap_cred_cd_META,
			init_bal_META,
			purc_amt_META,
			ret_amt_META,
			dscnt_amt_META,
			sw_to_amt_META,
			tax_amt_META,
			cash_amt_META,
			note_amt_META,
			account_amt_META,
			setoff_amt_META,
			sw_amt_META,
			end_bal_META,
			base_cur_cd_META,
			base_cur_nm_META,
			base_cur_amt_dec_place_META,
			base_cur_init_bal_META,
			base_cur_purc_amt_META,
			base_cur_ret_amt_META,
			base_cur_dscnt_amt_META,
			base_cur_sw_to_amt_META,
			base_cur_tax_amt_META,
			base_cur_cash_amt_META,
			base_cur_note_amt_META,
			base_cur_account_amt_META,
			base_cur_setoff_amt_META,
			base_cur_sw_amt_META,
			base_cur_end_bal_META,
			exc_gain_loss_META,
			total_exc_gain_loss_META,
			asppl_grp_cd1_META,
			asppl_grp_nm1_META,
			asppl_grp_cd2_META,
			asppl_grp_nm2_META,
			asppl_grp_cd3_META,
			asppl_grp_nm3_META,
			asppl_grp_cd4_META,
			asppl_grp_nm4_META,
			asppl_grp_cd5_META,
			asppl_grp_nm5_META,
			asppl_grp_cd6_META,
			asppl_grp_nm6_META,
			asppl_grp_cd7_META,
			asppl_grp_nm7_META,
			asppl_grp_cd8_META,
			asppl_grp_nm8_META,
			asppl_grp_cd9_META,
			asppl_grp_nm9_META,
			asppl_grp_cd10_META,
			asppl_grp_nm10_META,
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
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$ap_typ, "MAC_AP_TYP"}	// ap_typ
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
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
	protected ApBal_Srch01_RsltR_MC_A(ConstMetaList<? extends ApBal_Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ApBal_Srch01_RsltR clone() {
		return (ApBal_Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ApBal_Srch01_RsltR createInstance() {
		return (ApBal_Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ApBal_Srch01_RsltR getValues(String... names) {
		return (ApBal_Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 0, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 1, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 2, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 2, $err_flg, value);
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 3, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 3, $ac_ym, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 4, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 4, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 5, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 5, $ap_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 6, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 6, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 7, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 7, $wg_nm, value);
	}


	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 8, $asppl_cd);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 8, $asppl_cd, value);
	}


	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public String asppl_nm() {
		return getConstString(offset + 9, $asppl_nm);
	}

	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public void asppl_nm(String value) {
		setConstString(offset + 9, $asppl_nm, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 10, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 10, $purc_act_no, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 11, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 11, $rcpt_iv_no, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 12, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 12, $rcpt_iv_mng_no, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 13, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 13, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 14, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 14, $trd_cur_nm, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 15, $trd_cur_amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 15, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 15, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 15, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 15, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 15, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 16, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 16, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 17, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 17, $wrk_nm, value);
	}


	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public String ap_typ() {
		return getConstString(offset + 18, $ap_typ);
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public void ap_typ(String value) {
		setConstString(offset + 18, $ap_typ, value);
	}


	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public String ap_typ_nm() {
		return getConstString(offset + 19, $ap_typ_nm);
	}

	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public void ap_typ_nm(String value) {
		setConstString(offset + 19, $ap_typ_nm, value);
	}


	/**
	 * AP credit managed BP cd. 債務与信管理先ＣＤ.<p>
	 *
	 */
	public String ap_cred_cd() {
		return getConstString(offset + 20, $ap_cred_cd);
	}

	/**
	 * AP credit managed BP cd. 債務与信管理先ＣＤ.<p>
	 *
	 */
	public void ap_cred_cd(String value) {
		setConstString(offset + 20, $ap_cred_cd, value);
	}


	/**
	 * Beginning balance 月初残高.<p>
	 *
	 */
	public MCNumber init_bal() {
		return getConstNumber(offset + 21, $init_bal);
	}

	/**
	 * Beginning balance 月初残高.<p>
	 *
	 */
	public void init_bal(MCNumber value) {
		setConstNumber(offset + 21, $init_bal, value);
	}

	/**
	 * Beginning balance 月初残高.<p>
	 *
	 */
	public void init_bal(int value) {
		setConstNumber(offset + 21, $init_bal, value);
	}

	/**
	 * Beginning balance 月初残高.<p>
	 *
	 */
	public void init_bal(long value) {
		setConstNumber(offset + 21, $init_bal, value);
	}

	/**
	 * Beginning balance 月初残高.<p>
	 *
	 */
	public void init_bal(float value) {
		setConstNumber(offset + 21, $init_bal, value);
	}

	/**
	 * Beginning balance 月初残高.<p>
	 *
	 */
	public void init_bal(double value) {
		setConstNumber(offset + 21, $init_bal, value);
	}


	/**
	 * Purchase amount (Current month) 当月仕入額.<p>
	 *
	 */
	public MCNumber purc_amt() {
		return getConstNumber(offset + 22, $purc_amt);
	}

	/**
	 * Purchase amount (Current month) 当月仕入額.<p>
	 *
	 */
	public void purc_amt(MCNumber value) {
		setConstNumber(offset + 22, $purc_amt, value);
	}

	/**
	 * Purchase amount (Current month) 当月仕入額.<p>
	 *
	 */
	public void purc_amt(int value) {
		setConstNumber(offset + 22, $purc_amt, value);
	}

	/**
	 * Purchase amount (Current month) 当月仕入額.<p>
	 *
	 */
	public void purc_amt(long value) {
		setConstNumber(offset + 22, $purc_amt, value);
	}

	/**
	 * Purchase amount (Current month) 当月仕入額.<p>
	 *
	 */
	public void purc_amt(float value) {
		setConstNumber(offset + 22, $purc_amt, value);
	}

	/**
	 * Purchase amount (Current month) 当月仕入額.<p>
	 *
	 */
	public void purc_amt(double value) {
		setConstNumber(offset + 22, $purc_amt, value);
	}


	/**
	 * Return amount (Current month) 当月返品額.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return getConstNumber(offset + 23, $ret_amt);
	}

	/**
	 * Return amount (Current month) 当月返品額.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		setConstNumber(offset + 23, $ret_amt, value);
	}

	/**
	 * Return amount (Current month) 当月返品額.<p>
	 *
	 */
	public void ret_amt(int value) {
		setConstNumber(offset + 23, $ret_amt, value);
	}

	/**
	 * Return amount (Current month) 当月返品額.<p>
	 *
	 */
	public void ret_amt(long value) {
		setConstNumber(offset + 23, $ret_amt, value);
	}

	/**
	 * Return amount (Current month) 当月返品額.<p>
	 *
	 */
	public void ret_amt(float value) {
		setConstNumber(offset + 23, $ret_amt, value);
	}

	/**
	 * Return amount (Current month) 当月返品額.<p>
	 *
	 */
	public void ret_amt(double value) {
		setConstNumber(offset + 23, $ret_amt, value);
	}


	/**
	 * Discount amount (Current month) 当月値引額.<p>
	 *
	 */
	public MCNumber dscnt_amt() {
		return getConstNumber(offset + 24, $dscnt_amt);
	}

	/**
	 * Discount amount (Current month) 当月値引額.<p>
	 *
	 */
	public void dscnt_amt(MCNumber value) {
		setConstNumber(offset + 24, $dscnt_amt, value);
	}

	/**
	 * Discount amount (Current month) 当月値引額.<p>
	 *
	 */
	public void dscnt_amt(int value) {
		setConstNumber(offset + 24, $dscnt_amt, value);
	}

	/**
	 * Discount amount (Current month) 当月値引額.<p>
	 *
	 */
	public void dscnt_amt(long value) {
		setConstNumber(offset + 24, $dscnt_amt, value);
	}

	/**
	 * Discount amount (Current month) 当月値引額.<p>
	 *
	 */
	public void dscnt_amt(float value) {
		setConstNumber(offset + 24, $dscnt_amt, value);
	}

	/**
	 * Discount amount (Current month) 当月値引額.<p>
	 *
	 */
	public void dscnt_amt(double value) {
		setConstNumber(offset + 24, $dscnt_amt, value);
	}


	/**
	 * Transferred amount (Current month)(Transfer) 当月振替額（振替先）.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return getConstNumber(offset + 25, $sw_to_amt);
	}

	/**
	 * Transferred amount (Current month)(Transfer) 当月振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		setConstNumber(offset + 25, $sw_to_amt, value);
	}

	/**
	 * Transferred amount (Current month)(Transfer) 当月振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		setConstNumber(offset + 25, $sw_to_amt, value);
	}

	/**
	 * Transferred amount (Current month)(Transfer) 当月振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		setConstNumber(offset + 25, $sw_to_amt, value);
	}

	/**
	 * Transferred amount (Current month)(Transfer) 当月振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		setConstNumber(offset + 25, $sw_to_amt, value);
	}

	/**
	 * Transferred amount (Current month)(Transfer) 当月振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		setConstNumber(offset + 25, $sw_to_amt, value);
	}


	/**
	 * Tax amount (Current month) 当月税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 26, $tax_amt);
	}

	/**
	 * Tax amount (Current month) 当月税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 26, $tax_amt, value);
	}

	/**
	 * Tax amount (Current month) 当月税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 26, $tax_amt, value);
	}

	/**
	 * Tax amount (Current month) 当月税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 26, $tax_amt, value);
	}

	/**
	 * Tax amount (Current month) 当月税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 26, $tax_amt, value);
	}

	/**
	 * Tax amount (Current month) 当月税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 26, $tax_amt, value);
	}


	/**
	 * Cash payment amount of current month 当月現金支払額.<p>
	 *
	 */
	public MCNumber cash_amt() {
		return getConstNumber(offset + 27, $cash_amt);
	}

	/**
	 * Cash payment amount of current month 当月現金支払額.<p>
	 *
	 */
	public void cash_amt(MCNumber value) {
		setConstNumber(offset + 27, $cash_amt, value);
	}

	/**
	 * Cash payment amount of current month 当月現金支払額.<p>
	 *
	 */
	public void cash_amt(int value) {
		setConstNumber(offset + 27, $cash_amt, value);
	}

	/**
	 * Cash payment amount of current month 当月現金支払額.<p>
	 *
	 */
	public void cash_amt(long value) {
		setConstNumber(offset + 27, $cash_amt, value);
	}

	/**
	 * Cash payment amount of current month 当月現金支払額.<p>
	 *
	 */
	public void cash_amt(float value) {
		setConstNumber(offset + 27, $cash_amt, value);
	}

	/**
	 * Cash payment amount of current month 当月現金支払額.<p>
	 *
	 */
	public void cash_amt(double value) {
		setConstNumber(offset + 27, $cash_amt, value);
	}


	/**
	 * Notes payment amount (Current month) 当月手形支払額.<p>
	 *
	 */
	public MCNumber note_amt() {
		return getConstNumber(offset + 28, $note_amt);
	}

	/**
	 * Notes payment amount (Current month) 当月手形支払額.<p>
	 *
	 */
	public void note_amt(MCNumber value) {
		setConstNumber(offset + 28, $note_amt, value);
	}

	/**
	 * Notes payment amount (Current month) 当月手形支払額.<p>
	 *
	 */
	public void note_amt(int value) {
		setConstNumber(offset + 28, $note_amt, value);
	}

	/**
	 * Notes payment amount (Current month) 当月手形支払額.<p>
	 *
	 */
	public void note_amt(long value) {
		setConstNumber(offset + 28, $note_amt, value);
	}

	/**
	 * Notes payment amount (Current month) 当月手形支払額.<p>
	 *
	 */
	public void note_amt(float value) {
		setConstNumber(offset + 28, $note_amt, value);
	}

	/**
	 * Notes payment amount (Current month) 当月手形支払額.<p>
	 *
	 */
	public void note_amt(double value) {
		setConstNumber(offset + 28, $note_amt, value);
	}


	/**
	 * Deposit payment amount (Current month) 当月預金支払額.<p>
	 *
	 */
	public MCNumber account_amt() {
		return getConstNumber(offset + 29, $account_amt);
	}

	/**
	 * Deposit payment amount (Current month) 当月預金支払額.<p>
	 *
	 */
	public void account_amt(MCNumber value) {
		setConstNumber(offset + 29, $account_amt, value);
	}

	/**
	 * Deposit payment amount (Current month) 当月預金支払額.<p>
	 *
	 */
	public void account_amt(int value) {
		setConstNumber(offset + 29, $account_amt, value);
	}

	/**
	 * Deposit payment amount (Current month) 当月預金支払額.<p>
	 *
	 */
	public void account_amt(long value) {
		setConstNumber(offset + 29, $account_amt, value);
	}

	/**
	 * Deposit payment amount (Current month) 当月預金支払額.<p>
	 *
	 */
	public void account_amt(float value) {
		setConstNumber(offset + 29, $account_amt, value);
	}

	/**
	 * Deposit payment amount (Current month) 当月預金支払額.<p>
	 *
	 */
	public void account_amt(double value) {
		setConstNumber(offset + 29, $account_amt, value);
	}


	/**
	 * Offset amount (Current month) 当月相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 30, $setoff_amt);
	}

	/**
	 * Offset amount (Current month) 当月相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 30, $setoff_amt, value);
	}

	/**
	 * Offset amount (Current month) 当月相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 30, $setoff_amt, value);
	}

	/**
	 * Offset amount (Current month) 当月相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 30, $setoff_amt, value);
	}

	/**
	 * Offset amount (Current month) 当月相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 30, $setoff_amt, value);
	}

	/**
	 * Offset amount (Current month) 当月相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 30, $setoff_amt, value);
	}


	/**
	 * Transferred amount (Current month) 当月振替額.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return getConstNumber(offset + 31, $sw_amt);
	}

	/**
	 * Transferred amount (Current month) 当月振替額.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		setConstNumber(offset + 31, $sw_amt, value);
	}

	/**
	 * Transferred amount (Current month) 当月振替額.<p>
	 *
	 */
	public void sw_amt(int value) {
		setConstNumber(offset + 31, $sw_amt, value);
	}

	/**
	 * Transferred amount (Current month) 当月振替額.<p>
	 *
	 */
	public void sw_amt(long value) {
		setConstNumber(offset + 31, $sw_amt, value);
	}

	/**
	 * Transferred amount (Current month) 当月振替額.<p>
	 *
	 */
	public void sw_amt(float value) {
		setConstNumber(offset + 31, $sw_amt, value);
	}

	/**
	 * Transferred amount (Current month) 当月振替額.<p>
	 *
	 */
	public void sw_amt(double value) {
		setConstNumber(offset + 31, $sw_amt, value);
	}


	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public MCNumber end_bal() {
		return getConstNumber(offset + 32, $end_bal);
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public void end_bal(MCNumber value) {
		setConstNumber(offset + 32, $end_bal, value);
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public void end_bal(int value) {
		setConstNumber(offset + 32, $end_bal, value);
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public void end_bal(long value) {
		setConstNumber(offset + 32, $end_bal, value);
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public void end_bal(float value) {
		setConstNumber(offset + 32, $end_bal, value);
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public void end_bal(double value) {
		setConstNumber(offset + 32, $end_bal, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 33, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 33, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 34, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 34, $base_cur_nm, value);
	}


	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_amt_dec_place() {
		return getConstNumber(offset + 35, $base_cur_amt_dec_place);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 35, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(int value) {
		setConstNumber(offset + 35, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(long value) {
		setConstNumber(offset + 35, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(float value) {
		setConstNumber(offset + 35, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(double value) {
		setConstNumber(offset + 35, $base_cur_amt_dec_place, value);
	}


	/**
	 * Beginning balance (Base currency) 基準通貨月初残高.<p>
	 *
	 */
	public MCNumber base_cur_init_bal() {
		return getConstNumber(offset + 36, $base_cur_init_bal);
	}

	/**
	 * Beginning balance (Base currency) 基準通貨月初残高.<p>
	 *
	 */
	public void base_cur_init_bal(MCNumber value) {
		setConstNumber(offset + 36, $base_cur_init_bal, value);
	}

	/**
	 * Beginning balance (Base currency) 基準通貨月初残高.<p>
	 *
	 */
	public void base_cur_init_bal(int value) {
		setConstNumber(offset + 36, $base_cur_init_bal, value);
	}

	/**
	 * Beginning balance (Base currency) 基準通貨月初残高.<p>
	 *
	 */
	public void base_cur_init_bal(long value) {
		setConstNumber(offset + 36, $base_cur_init_bal, value);
	}

	/**
	 * Beginning balance (Base currency) 基準通貨月初残高.<p>
	 *
	 */
	public void base_cur_init_bal(float value) {
		setConstNumber(offset + 36, $base_cur_init_bal, value);
	}

	/**
	 * Beginning balance (Base currency) 基準通貨月初残高.<p>
	 *
	 */
	public void base_cur_init_bal(double value) {
		setConstNumber(offset + 36, $base_cur_init_bal, value);
	}


	/**
	 * Current month purchase amount (Base currency) 基準通貨当月仕入額.<p>
	 *
	 */
	public MCNumber base_cur_purc_amt() {
		return getConstNumber(offset + 37, $base_cur_purc_amt);
	}

	/**
	 * Current month purchase amount (Base currency) 基準通貨当月仕入額.<p>
	 *
	 */
	public void base_cur_purc_amt(MCNumber value) {
		setConstNumber(offset + 37, $base_cur_purc_amt, value);
	}

	/**
	 * Current month purchase amount (Base currency) 基準通貨当月仕入額.<p>
	 *
	 */
	public void base_cur_purc_amt(int value) {
		setConstNumber(offset + 37, $base_cur_purc_amt, value);
	}

	/**
	 * Current month purchase amount (Base currency) 基準通貨当月仕入額.<p>
	 *
	 */
	public void base_cur_purc_amt(long value) {
		setConstNumber(offset + 37, $base_cur_purc_amt, value);
	}

	/**
	 * Current month purchase amount (Base currency) 基準通貨当月仕入額.<p>
	 *
	 */
	public void base_cur_purc_amt(float value) {
		setConstNumber(offset + 37, $base_cur_purc_amt, value);
	}

	/**
	 * Current month purchase amount (Base currency) 基準通貨当月仕入額.<p>
	 *
	 */
	public void base_cur_purc_amt(double value) {
		setConstNumber(offset + 37, $base_cur_purc_amt, value);
	}


	/**
	 * Current month return amount (Base currency) 基準通貨当月返品額.<p>
	 *
	 */
	public MCNumber base_cur_ret_amt() {
		return getConstNumber(offset + 38, $base_cur_ret_amt);
	}

	/**
	 * Current month return amount (Base currency) 基準通貨当月返品額.<p>
	 *
	 */
	public void base_cur_ret_amt(MCNumber value) {
		setConstNumber(offset + 38, $base_cur_ret_amt, value);
	}

	/**
	 * Current month return amount (Base currency) 基準通貨当月返品額.<p>
	 *
	 */
	public void base_cur_ret_amt(int value) {
		setConstNumber(offset + 38, $base_cur_ret_amt, value);
	}

	/**
	 * Current month return amount (Base currency) 基準通貨当月返品額.<p>
	 *
	 */
	public void base_cur_ret_amt(long value) {
		setConstNumber(offset + 38, $base_cur_ret_amt, value);
	}

	/**
	 * Current month return amount (Base currency) 基準通貨当月返品額.<p>
	 *
	 */
	public void base_cur_ret_amt(float value) {
		setConstNumber(offset + 38, $base_cur_ret_amt, value);
	}

	/**
	 * Current month return amount (Base currency) 基準通貨当月返品額.<p>
	 *
	 */
	public void base_cur_ret_amt(double value) {
		setConstNumber(offset + 38, $base_cur_ret_amt, value);
	}


	/**
	 * Current month discount amount (Base currency) 基準通貨当月値引額.<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return getConstNumber(offset + 39, $base_cur_dscnt_amt);
	}

	/**
	 * Current month discount amount (Base currency) 基準通貨当月値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 39, $base_cur_dscnt_amt, value);
	}

	/**
	 * Current month discount amount (Base currency) 基準通貨当月値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		setConstNumber(offset + 39, $base_cur_dscnt_amt, value);
	}

	/**
	 * Current month discount amount (Base currency) 基準通貨当月値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		setConstNumber(offset + 39, $base_cur_dscnt_amt, value);
	}

	/**
	 * Current month discount amount (Base currency) 基準通貨当月値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		setConstNumber(offset + 39, $base_cur_dscnt_amt, value);
	}

	/**
	 * Current month discount amount (Base currency) 基準通貨当月値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		setConstNumber(offset + 39, $base_cur_dscnt_amt, value);
	}


	/**
	 * Current month transfer amount (Transfer) (Base currency) 基準通貨当月振替額（振替先）.<p>
	 *
	 */
	public MCNumber base_cur_sw_to_amt() {
		return getConstNumber(offset + 40, $base_cur_sw_to_amt);
	}

	/**
	 * Current month transfer amount (Transfer) (Base currency) 基準通貨当月振替額（振替先）.<p>
	 *
	 */
	public void base_cur_sw_to_amt(MCNumber value) {
		setConstNumber(offset + 40, $base_cur_sw_to_amt, value);
	}

	/**
	 * Current month transfer amount (Transfer) (Base currency) 基準通貨当月振替額（振替先）.<p>
	 *
	 */
	public void base_cur_sw_to_amt(int value) {
		setConstNumber(offset + 40, $base_cur_sw_to_amt, value);
	}

	/**
	 * Current month transfer amount (Transfer) (Base currency) 基準通貨当月振替額（振替先）.<p>
	 *
	 */
	public void base_cur_sw_to_amt(long value) {
		setConstNumber(offset + 40, $base_cur_sw_to_amt, value);
	}

	/**
	 * Current month transfer amount (Transfer) (Base currency) 基準通貨当月振替額（振替先）.<p>
	 *
	 */
	public void base_cur_sw_to_amt(float value) {
		setConstNumber(offset + 40, $base_cur_sw_to_amt, value);
	}

	/**
	 * Current month transfer amount (Transfer) (Base currency) 基準通貨当月振替額（振替先）.<p>
	 *
	 */
	public void base_cur_sw_to_amt(double value) {
		setConstNumber(offset + 40, $base_cur_sw_to_amt, value);
	}


	/**
	 * Current month tax amount (Base currency) 基準通貨当月税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 41, $base_cur_tax_amt);
	}

	/**
	 * Current month tax amount (Base currency) 基準通貨当月税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 41, $base_cur_tax_amt, value);
	}

	/**
	 * Current month tax amount (Base currency) 基準通貨当月税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 41, $base_cur_tax_amt, value);
	}

	/**
	 * Current month tax amount (Base currency) 基準通貨当月税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 41, $base_cur_tax_amt, value);
	}

	/**
	 * Current month tax amount (Base currency) 基準通貨当月税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 41, $base_cur_tax_amt, value);
	}

	/**
	 * Current month tax amount (Base currency) 基準通貨当月税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 41, $base_cur_tax_amt, value);
	}


	/**
	 * Current month cash payment amount (Base currency) 基準通貨当月現金支払額.<p>
	 *
	 */
	public MCNumber base_cur_cash_amt() {
		return getConstNumber(offset + 42, $base_cur_cash_amt);
	}

	/**
	 * Current month cash payment amount (Base currency) 基準通貨当月現金支払額.<p>
	 *
	 */
	public void base_cur_cash_amt(MCNumber value) {
		setConstNumber(offset + 42, $base_cur_cash_amt, value);
	}

	/**
	 * Current month cash payment amount (Base currency) 基準通貨当月現金支払額.<p>
	 *
	 */
	public void base_cur_cash_amt(int value) {
		setConstNumber(offset + 42, $base_cur_cash_amt, value);
	}

	/**
	 * Current month cash payment amount (Base currency) 基準通貨当月現金支払額.<p>
	 *
	 */
	public void base_cur_cash_amt(long value) {
		setConstNumber(offset + 42, $base_cur_cash_amt, value);
	}

	/**
	 * Current month cash payment amount (Base currency) 基準通貨当月現金支払額.<p>
	 *
	 */
	public void base_cur_cash_amt(float value) {
		setConstNumber(offset + 42, $base_cur_cash_amt, value);
	}

	/**
	 * Current month cash payment amount (Base currency) 基準通貨当月現金支払額.<p>
	 *
	 */
	public void base_cur_cash_amt(double value) {
		setConstNumber(offset + 42, $base_cur_cash_amt, value);
	}


	/**
	 * Current month notes payment amount (Base currency) 基準通貨当月手形支払額.<p>
	 *
	 */
	public MCNumber base_cur_note_amt() {
		return getConstNumber(offset + 43, $base_cur_note_amt);
	}

	/**
	 * Current month notes payment amount (Base currency) 基準通貨当月手形支払額.<p>
	 *
	 */
	public void base_cur_note_amt(MCNumber value) {
		setConstNumber(offset + 43, $base_cur_note_amt, value);
	}

	/**
	 * Current month notes payment amount (Base currency) 基準通貨当月手形支払額.<p>
	 *
	 */
	public void base_cur_note_amt(int value) {
		setConstNumber(offset + 43, $base_cur_note_amt, value);
	}

	/**
	 * Current month notes payment amount (Base currency) 基準通貨当月手形支払額.<p>
	 *
	 */
	public void base_cur_note_amt(long value) {
		setConstNumber(offset + 43, $base_cur_note_amt, value);
	}

	/**
	 * Current month notes payment amount (Base currency) 基準通貨当月手形支払額.<p>
	 *
	 */
	public void base_cur_note_amt(float value) {
		setConstNumber(offset + 43, $base_cur_note_amt, value);
	}

	/**
	 * Current month notes payment amount (Base currency) 基準通貨当月手形支払額.<p>
	 *
	 */
	public void base_cur_note_amt(double value) {
		setConstNumber(offset + 43, $base_cur_note_amt, value);
	}


	/**
	 * Current month deposit payment amount (Base currency) 基準通貨当月預金支払額.<p>
	 *
	 */
	public MCNumber base_cur_account_amt() {
		return getConstNumber(offset + 44, $base_cur_account_amt);
	}

	/**
	 * Current month deposit payment amount (Base currency) 基準通貨当月預金支払額.<p>
	 *
	 */
	public void base_cur_account_amt(MCNumber value) {
		setConstNumber(offset + 44, $base_cur_account_amt, value);
	}

	/**
	 * Current month deposit payment amount (Base currency) 基準通貨当月預金支払額.<p>
	 *
	 */
	public void base_cur_account_amt(int value) {
		setConstNumber(offset + 44, $base_cur_account_amt, value);
	}

	/**
	 * Current month deposit payment amount (Base currency) 基準通貨当月預金支払額.<p>
	 *
	 */
	public void base_cur_account_amt(long value) {
		setConstNumber(offset + 44, $base_cur_account_amt, value);
	}

	/**
	 * Current month deposit payment amount (Base currency) 基準通貨当月預金支払額.<p>
	 *
	 */
	public void base_cur_account_amt(float value) {
		setConstNumber(offset + 44, $base_cur_account_amt, value);
	}

	/**
	 * Current month deposit payment amount (Base currency) 基準通貨当月預金支払額.<p>
	 *
	 */
	public void base_cur_account_amt(double value) {
		setConstNumber(offset + 44, $base_cur_account_amt, value);
	}


	/**
	 * Current month offset amount (Base currency) 基準通貨当月相殺額.<p>
	 *
	 */
	public MCNumber base_cur_setoff_amt() {
		return getConstNumber(offset + 45, $base_cur_setoff_amt);
	}

	/**
	 * Current month offset amount (Base currency) 基準通貨当月相殺額.<p>
	 *
	 */
	public void base_cur_setoff_amt(MCNumber value) {
		setConstNumber(offset + 45, $base_cur_setoff_amt, value);
	}

	/**
	 * Current month offset amount (Base currency) 基準通貨当月相殺額.<p>
	 *
	 */
	public void base_cur_setoff_amt(int value) {
		setConstNumber(offset + 45, $base_cur_setoff_amt, value);
	}

	/**
	 * Current month offset amount (Base currency) 基準通貨当月相殺額.<p>
	 *
	 */
	public void base_cur_setoff_amt(long value) {
		setConstNumber(offset + 45, $base_cur_setoff_amt, value);
	}

	/**
	 * Current month offset amount (Base currency) 基準通貨当月相殺額.<p>
	 *
	 */
	public void base_cur_setoff_amt(float value) {
		setConstNumber(offset + 45, $base_cur_setoff_amt, value);
	}

	/**
	 * Current month offset amount (Base currency) 基準通貨当月相殺額.<p>
	 *
	 */
	public void base_cur_setoff_amt(double value) {
		setConstNumber(offset + 45, $base_cur_setoff_amt, value);
	}


	/**
	 * Current month transfer amount (Base currency) 基準通貨当月振替額.<p>
	 *
	 */
	public MCNumber base_cur_sw_amt() {
		return getConstNumber(offset + 46, $base_cur_sw_amt);
	}

	/**
	 * Current month transfer amount (Base currency) 基準通貨当月振替額.<p>
	 *
	 */
	public void base_cur_sw_amt(MCNumber value) {
		setConstNumber(offset + 46, $base_cur_sw_amt, value);
	}

	/**
	 * Current month transfer amount (Base currency) 基準通貨当月振替額.<p>
	 *
	 */
	public void base_cur_sw_amt(int value) {
		setConstNumber(offset + 46, $base_cur_sw_amt, value);
	}

	/**
	 * Current month transfer amount (Base currency) 基準通貨当月振替額.<p>
	 *
	 */
	public void base_cur_sw_amt(long value) {
		setConstNumber(offset + 46, $base_cur_sw_amt, value);
	}

	/**
	 * Current month transfer amount (Base currency) 基準通貨当月振替額.<p>
	 *
	 */
	public void base_cur_sw_amt(float value) {
		setConstNumber(offset + 46, $base_cur_sw_amt, value);
	}

	/**
	 * Current month transfer amount (Base currency) 基準通貨当月振替額.<p>
	 *
	 */
	public void base_cur_sw_amt(double value) {
		setConstNumber(offset + 46, $base_cur_sw_amt, value);
	}


	/**
	 * Current month balance (Base currency) 基準通貨当月残高.<p>
	 *
	 */
	public MCNumber base_cur_end_bal() {
		return getConstNumber(offset + 47, $base_cur_end_bal);
	}

	/**
	 * Current month balance (Base currency) 基準通貨当月残高.<p>
	 *
	 */
	public void base_cur_end_bal(MCNumber value) {
		setConstNumber(offset + 47, $base_cur_end_bal, value);
	}

	/**
	 * Current month balance (Base currency) 基準通貨当月残高.<p>
	 *
	 */
	public void base_cur_end_bal(int value) {
		setConstNumber(offset + 47, $base_cur_end_bal, value);
	}

	/**
	 * Current month balance (Base currency) 基準通貨当月残高.<p>
	 *
	 */
	public void base_cur_end_bal(long value) {
		setConstNumber(offset + 47, $base_cur_end_bal, value);
	}

	/**
	 * Current month balance (Base currency) 基準通貨当月残高.<p>
	 *
	 */
	public void base_cur_end_bal(float value) {
		setConstNumber(offset + 47, $base_cur_end_bal, value);
	}

	/**
	 * Current month balance (Base currency) 基準通貨当月残高.<p>
	 *
	 */
	public void base_cur_end_bal(double value) {
		setConstNumber(offset + 47, $base_cur_end_bal, value);
	}


	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public MCNumber exc_gain_loss() {
		return getConstNumber(offset + 48, $exc_gain_loss);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(MCNumber value) {
		setConstNumber(offset + 48, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(int value) {
		setConstNumber(offset + 48, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(long value) {
		setConstNumber(offset + 48, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(float value) {
		setConstNumber(offset + 48, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(double value) {
		setConstNumber(offset + 48, $exc_gain_loss, value);
	}


	/**
	 * Accumulation exchange gain/loss 累計為替差損益.<p>
	 *
	 */
	public MCNumber total_exc_gain_loss() {
		return getConstNumber(offset + 49, $total_exc_gain_loss);
	}

	/**
	 * Accumulation exchange gain/loss 累計為替差損益.<p>
	 *
	 */
	public void total_exc_gain_loss(MCNumber value) {
		setConstNumber(offset + 49, $total_exc_gain_loss, value);
	}

	/**
	 * Accumulation exchange gain/loss 累計為替差損益.<p>
	 *
	 */
	public void total_exc_gain_loss(int value) {
		setConstNumber(offset + 49, $total_exc_gain_loss, value);
	}

	/**
	 * Accumulation exchange gain/loss 累計為替差損益.<p>
	 *
	 */
	public void total_exc_gain_loss(long value) {
		setConstNumber(offset + 49, $total_exc_gain_loss, value);
	}

	/**
	 * Accumulation exchange gain/loss 累計為替差損益.<p>
	 *
	 */
	public void total_exc_gain_loss(float value) {
		setConstNumber(offset + 49, $total_exc_gain_loss, value);
	}

	/**
	 * Accumulation exchange gain/loss 累計為替差損益.<p>
	 *
	 */
	public void total_exc_gain_loss(double value) {
		setConstNumber(offset + 49, $total_exc_gain_loss, value);
	}


	/**
	 * AP supplier classification cd. 1 買掛先分類ＣＤ１.<p>
	 *
	 */
	public String asppl_grp_cd1() {
		return getConstString(offset + 50, $asppl_grp_cd1);
	}

	/**
	 * AP supplier classification cd. 1 買掛先分類ＣＤ１.<p>
	 *
	 */
	public void asppl_grp_cd1(String value) {
		setConstString(offset + 50, $asppl_grp_cd1, value);
	}


	/**
	 * AP supplier classification name 1 買掛先分類名１.<p>
	 *
	 */
	public String asppl_grp_nm1() {
		return getConstString(offset + 51, $asppl_grp_nm1);
	}

	/**
	 * AP supplier classification name 1 買掛先分類名１.<p>
	 *
	 */
	public void asppl_grp_nm1(String value) {
		setConstString(offset + 51, $asppl_grp_nm1, value);
	}


	/**
	 * AP supplier classification cd. 2 買掛先分類ＣＤ２.<p>
	 *
	 */
	public String asppl_grp_cd2() {
		return getConstString(offset + 52, $asppl_grp_cd2);
	}

	/**
	 * AP supplier classification cd. 2 買掛先分類ＣＤ２.<p>
	 *
	 */
	public void asppl_grp_cd2(String value) {
		setConstString(offset + 52, $asppl_grp_cd2, value);
	}


	/**
	 * AP supplier classification name 2 買掛先分類名２.<p>
	 *
	 */
	public String asppl_grp_nm2() {
		return getConstString(offset + 53, $asppl_grp_nm2);
	}

	/**
	 * AP supplier classification name 2 買掛先分類名２.<p>
	 *
	 */
	public void asppl_grp_nm2(String value) {
		setConstString(offset + 53, $asppl_grp_nm2, value);
	}


	/**
	 * AP supplier classification cd. 3 買掛先分類ＣＤ３.<p>
	 *
	 */
	public String asppl_grp_cd3() {
		return getConstString(offset + 54, $asppl_grp_cd3);
	}

	/**
	 * AP supplier classification cd. 3 買掛先分類ＣＤ３.<p>
	 *
	 */
	public void asppl_grp_cd3(String value) {
		setConstString(offset + 54, $asppl_grp_cd3, value);
	}


	/**
	 * AP supplier classification name 3 買掛先分類名３.<p>
	 *
	 */
	public String asppl_grp_nm3() {
		return getConstString(offset + 55, $asppl_grp_nm3);
	}

	/**
	 * AP supplier classification name 3 買掛先分類名３.<p>
	 *
	 */
	public void asppl_grp_nm3(String value) {
		setConstString(offset + 55, $asppl_grp_nm3, value);
	}


	/**
	 * AP supplier classification cd. 4 買掛先分類ＣＤ４.<p>
	 *
	 */
	public String asppl_grp_cd4() {
		return getConstString(offset + 56, $asppl_grp_cd4);
	}

	/**
	 * AP supplier classification cd. 4 買掛先分類ＣＤ４.<p>
	 *
	 */
	public void asppl_grp_cd4(String value) {
		setConstString(offset + 56, $asppl_grp_cd4, value);
	}


	/**
	 * AP supplier classification name 4 買掛先分類名４.<p>
	 *
	 */
	public String asppl_grp_nm4() {
		return getConstString(offset + 57, $asppl_grp_nm4);
	}

	/**
	 * AP supplier classification name 4 買掛先分類名４.<p>
	 *
	 */
	public void asppl_grp_nm4(String value) {
		setConstString(offset + 57, $asppl_grp_nm4, value);
	}


	/**
	 * AP supplier classification cd. 5 買掛先分類ＣＤ５.<p>
	 *
	 */
	public String asppl_grp_cd5() {
		return getConstString(offset + 58, $asppl_grp_cd5);
	}

	/**
	 * AP supplier classification cd. 5 買掛先分類ＣＤ５.<p>
	 *
	 */
	public void asppl_grp_cd5(String value) {
		setConstString(offset + 58, $asppl_grp_cd5, value);
	}


	/**
	 * AP supplier classification name 5 買掛先分類名５.<p>
	 *
	 */
	public String asppl_grp_nm5() {
		return getConstString(offset + 59, $asppl_grp_nm5);
	}

	/**
	 * AP supplier classification name 5 買掛先分類名５.<p>
	 *
	 */
	public void asppl_grp_nm5(String value) {
		setConstString(offset + 59, $asppl_grp_nm5, value);
	}


	/**
	 * AP supplier classification cd. 6 買掛先分類ＣＤ６.<p>
	 *
	 */
	public String asppl_grp_cd6() {
		return getConstString(offset + 60, $asppl_grp_cd6);
	}

	/**
	 * AP supplier classification cd. 6 買掛先分類ＣＤ６.<p>
	 *
	 */
	public void asppl_grp_cd6(String value) {
		setConstString(offset + 60, $asppl_grp_cd6, value);
	}


	/**
	 * AP supplier classification name 6 買掛先分類名６.<p>
	 *
	 */
	public String asppl_grp_nm6() {
		return getConstString(offset + 61, $asppl_grp_nm6);
	}

	/**
	 * AP supplier classification name 6 買掛先分類名６.<p>
	 *
	 */
	public void asppl_grp_nm6(String value) {
		setConstString(offset + 61, $asppl_grp_nm6, value);
	}


	/**
	 * AP supplier classification cd. 7 買掛先分類ＣＤ７.<p>
	 *
	 */
	public String asppl_grp_cd7() {
		return getConstString(offset + 62, $asppl_grp_cd7);
	}

	/**
	 * AP supplier classification cd. 7 買掛先分類ＣＤ７.<p>
	 *
	 */
	public void asppl_grp_cd7(String value) {
		setConstString(offset + 62, $asppl_grp_cd7, value);
	}


	/**
	 * AP supplier classification name 7 買掛先分類名７.<p>
	 *
	 */
	public String asppl_grp_nm7() {
		return getConstString(offset + 63, $asppl_grp_nm7);
	}

	/**
	 * AP supplier classification name 7 買掛先分類名７.<p>
	 *
	 */
	public void asppl_grp_nm7(String value) {
		setConstString(offset + 63, $asppl_grp_nm7, value);
	}


	/**
	 * AP supplier classification cd. 8 買掛先分類ＣＤ８.<p>
	 *
	 */
	public String asppl_grp_cd8() {
		return getConstString(offset + 64, $asppl_grp_cd8);
	}

	/**
	 * AP supplier classification cd. 8 買掛先分類ＣＤ８.<p>
	 *
	 */
	public void asppl_grp_cd8(String value) {
		setConstString(offset + 64, $asppl_grp_cd8, value);
	}


	/**
	 * AP supplier classification name 8 買掛先分類名８.<p>
	 *
	 */
	public String asppl_grp_nm8() {
		return getConstString(offset + 65, $asppl_grp_nm8);
	}

	/**
	 * AP supplier classification name 8 買掛先分類名８.<p>
	 *
	 */
	public void asppl_grp_nm8(String value) {
		setConstString(offset + 65, $asppl_grp_nm8, value);
	}


	/**
	 * AP supplier classification cd. 9 買掛先分類ＣＤ９.<p>
	 *
	 */
	public String asppl_grp_cd9() {
		return getConstString(offset + 66, $asppl_grp_cd9);
	}

	/**
	 * AP supplier classification cd. 9 買掛先分類ＣＤ９.<p>
	 *
	 */
	public void asppl_grp_cd9(String value) {
		setConstString(offset + 66, $asppl_grp_cd9, value);
	}


	/**
	 * AP supplier classification name 9 買掛先分類名９.<p>
	 *
	 */
	public String asppl_grp_nm9() {
		return getConstString(offset + 67, $asppl_grp_nm9);
	}

	/**
	 * AP supplier classification name 9 買掛先分類名９.<p>
	 *
	 */
	public void asppl_grp_nm9(String value) {
		setConstString(offset + 67, $asppl_grp_nm9, value);
	}


	/**
	 * AP supplier classification cd. 10 買掛先分類ＣＤ１０.<p>
	 *
	 */
	public String asppl_grp_cd10() {
		return getConstString(offset + 68, $asppl_grp_cd10);
	}

	/**
	 * AP supplier classification cd. 10 買掛先分類ＣＤ１０.<p>
	 *
	 */
	public void asppl_grp_cd10(String value) {
		setConstString(offset + 68, $asppl_grp_cd10, value);
	}


	/**
	 * AP supplier classification name 10 買掛先分類名１０.<p>
	 *
	 */
	public String asppl_grp_nm10() {
		return getConstString(offset + 69, $asppl_grp_nm10);
	}

	/**
	 * AP supplier classification name 10 買掛先分類名１０.<p>
	 *
	 */
	public void asppl_grp_nm10(String value) {
		setConstString(offset + 69, $asppl_grp_nm10, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 70, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 70, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 71, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 71, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 72, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 72, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 73, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 73, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 74, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 74, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 75, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 75, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 76, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 76, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 77, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 77, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 78, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 78, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 79, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 79, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 80, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 80, $upd_srv_req_no, value);
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			return ap_typ_nm();
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			return ap_cred_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($asppl_grp_cd1.equalsIgnoreCase(name)) {
			return asppl_grp_cd1();
		}
		if ($asppl_grp_nm1.equalsIgnoreCase(name)) {
			return asppl_grp_nm1();
		}
		if ($asppl_grp_cd2.equalsIgnoreCase(name)) {
			return asppl_grp_cd2();
		}
		if ($asppl_grp_nm2.equalsIgnoreCase(name)) {
			return asppl_grp_nm2();
		}
		if ($asppl_grp_cd3.equalsIgnoreCase(name)) {
			return asppl_grp_cd3();
		}
		if ($asppl_grp_nm3.equalsIgnoreCase(name)) {
			return asppl_grp_nm3();
		}
		if ($asppl_grp_cd4.equalsIgnoreCase(name)) {
			return asppl_grp_cd4();
		}
		if ($asppl_grp_nm4.equalsIgnoreCase(name)) {
			return asppl_grp_nm4();
		}
		if ($asppl_grp_cd5.equalsIgnoreCase(name)) {
			return asppl_grp_cd5();
		}
		if ($asppl_grp_nm5.equalsIgnoreCase(name)) {
			return asppl_grp_nm5();
		}
		if ($asppl_grp_cd6.equalsIgnoreCase(name)) {
			return asppl_grp_cd6();
		}
		if ($asppl_grp_nm6.equalsIgnoreCase(name)) {
			return asppl_grp_nm6();
		}
		if ($asppl_grp_cd7.equalsIgnoreCase(name)) {
			return asppl_grp_cd7();
		}
		if ($asppl_grp_nm7.equalsIgnoreCase(name)) {
			return asppl_grp_nm7();
		}
		if ($asppl_grp_cd8.equalsIgnoreCase(name)) {
			return asppl_grp_cd8();
		}
		if ($asppl_grp_nm8.equalsIgnoreCase(name)) {
			return asppl_grp_nm8();
		}
		if ($asppl_grp_cd9.equalsIgnoreCase(name)) {
			return asppl_grp_cd9();
		}
		if ($asppl_grp_nm9.equalsIgnoreCase(name)) {
			return asppl_grp_nm9();
		}
		if ($asppl_grp_cd10.equalsIgnoreCase(name)) {
			return asppl_grp_cd10();
		}
		if ($asppl_grp_nm10.equalsIgnoreCase(name)) {
			return asppl_grp_nm10();
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			return init_bal();
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			return purc_amt();
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			return ret_amt();
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			return dscnt_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			return cash_amt();
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			return note_amt();
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			return account_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			return end_bal();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			return base_cur_init_bal();
		}
		if ($base_cur_purc_amt.equalsIgnoreCase(name)) {
			return base_cur_purc_amt();
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			return base_cur_ret_amt();
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt();
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			return base_cur_sw_to_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			return base_cur_cash_amt();
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			return base_cur_note_amt();
		}
		if ($base_cur_account_amt.equalsIgnoreCase(name)) {
			return base_cur_account_amt();
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			return base_cur_setoff_amt();
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			return base_cur_sw_amt();
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			return base_cur_end_bal();
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			return exc_gain_loss();
		}
		if ($total_exc_gain_loss.equalsIgnoreCase(name)) {
			return total_exc_gain_loss();
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
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			return ap_typ_nm();
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			return ap_cred_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($asppl_grp_cd1.equalsIgnoreCase(name)) {
			return asppl_grp_cd1();
		}
		if ($asppl_grp_nm1.equalsIgnoreCase(name)) {
			return asppl_grp_nm1();
		}
		if ($asppl_grp_cd2.equalsIgnoreCase(name)) {
			return asppl_grp_cd2();
		}
		if ($asppl_grp_nm2.equalsIgnoreCase(name)) {
			return asppl_grp_nm2();
		}
		if ($asppl_grp_cd3.equalsIgnoreCase(name)) {
			return asppl_grp_cd3();
		}
		if ($asppl_grp_nm3.equalsIgnoreCase(name)) {
			return asppl_grp_nm3();
		}
		if ($asppl_grp_cd4.equalsIgnoreCase(name)) {
			return asppl_grp_cd4();
		}
		if ($asppl_grp_nm4.equalsIgnoreCase(name)) {
			return asppl_grp_nm4();
		}
		if ($asppl_grp_cd5.equalsIgnoreCase(name)) {
			return asppl_grp_cd5();
		}
		if ($asppl_grp_nm5.equalsIgnoreCase(name)) {
			return asppl_grp_nm5();
		}
		if ($asppl_grp_cd6.equalsIgnoreCase(name)) {
			return asppl_grp_cd6();
		}
		if ($asppl_grp_nm6.equalsIgnoreCase(name)) {
			return asppl_grp_nm6();
		}
		if ($asppl_grp_cd7.equalsIgnoreCase(name)) {
			return asppl_grp_cd7();
		}
		if ($asppl_grp_nm7.equalsIgnoreCase(name)) {
			return asppl_grp_nm7();
		}
		if ($asppl_grp_cd8.equalsIgnoreCase(name)) {
			return asppl_grp_cd8();
		}
		if ($asppl_grp_nm8.equalsIgnoreCase(name)) {
			return asppl_grp_nm8();
		}
		if ($asppl_grp_cd9.equalsIgnoreCase(name)) {
			return asppl_grp_cd9();
		}
		if ($asppl_grp_nm9.equalsIgnoreCase(name)) {
			return asppl_grp_nm9();
		}
		if ($asppl_grp_cd10.equalsIgnoreCase(name)) {
			return asppl_grp_cd10();
		}
		if ($asppl_grp_nm10.equalsIgnoreCase(name)) {
			return asppl_grp_nm10();
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			return init_bal();
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			return purc_amt();
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			return ret_amt();
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			return dscnt_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			return cash_amt();
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			return note_amt();
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			return account_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			return end_bal();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			return base_cur_init_bal();
		}
		if ($base_cur_purc_amt.equalsIgnoreCase(name)) {
			return base_cur_purc_amt();
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			return base_cur_ret_amt();
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt();
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			return base_cur_sw_to_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			return base_cur_cash_amt();
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			return base_cur_note_amt();
		}
		if ($base_cur_account_amt.equalsIgnoreCase(name)) {
			return base_cur_account_amt();
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			return base_cur_setoff_amt();
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			return base_cur_sw_amt();
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			return base_cur_end_bal();
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			return exc_gain_loss();
		}
		if ($total_exc_gain_loss.equalsIgnoreCase(name)) {
			return total_exc_gain_loss();
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
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			ap_cred_cd(value);
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
		if ($asppl_grp_cd1.equalsIgnoreCase(name)) {
			asppl_grp_cd1(value);
			return;
		}
		if ($asppl_grp_nm1.equalsIgnoreCase(name)) {
			asppl_grp_nm1(value);
			return;
		}
		if ($asppl_grp_cd2.equalsIgnoreCase(name)) {
			asppl_grp_cd2(value);
			return;
		}
		if ($asppl_grp_nm2.equalsIgnoreCase(name)) {
			asppl_grp_nm2(value);
			return;
		}
		if ($asppl_grp_cd3.equalsIgnoreCase(name)) {
			asppl_grp_cd3(value);
			return;
		}
		if ($asppl_grp_nm3.equalsIgnoreCase(name)) {
			asppl_grp_nm3(value);
			return;
		}
		if ($asppl_grp_cd4.equalsIgnoreCase(name)) {
			asppl_grp_cd4(value);
			return;
		}
		if ($asppl_grp_nm4.equalsIgnoreCase(name)) {
			asppl_grp_nm4(value);
			return;
		}
		if ($asppl_grp_cd5.equalsIgnoreCase(name)) {
			asppl_grp_cd5(value);
			return;
		}
		if ($asppl_grp_nm5.equalsIgnoreCase(name)) {
			asppl_grp_nm5(value);
			return;
		}
		if ($asppl_grp_cd6.equalsIgnoreCase(name)) {
			asppl_grp_cd6(value);
			return;
		}
		if ($asppl_grp_nm6.equalsIgnoreCase(name)) {
			asppl_grp_nm6(value);
			return;
		}
		if ($asppl_grp_cd7.equalsIgnoreCase(name)) {
			asppl_grp_cd7(value);
			return;
		}
		if ($asppl_grp_nm7.equalsIgnoreCase(name)) {
			asppl_grp_nm7(value);
			return;
		}
		if ($asppl_grp_cd8.equalsIgnoreCase(name)) {
			asppl_grp_cd8(value);
			return;
		}
		if ($asppl_grp_nm8.equalsIgnoreCase(name)) {
			asppl_grp_nm8(value);
			return;
		}
		if ($asppl_grp_cd9.equalsIgnoreCase(name)) {
			asppl_grp_cd9(value);
			return;
		}
		if ($asppl_grp_nm9.equalsIgnoreCase(name)) {
			asppl_grp_nm9(value);
			return;
		}
		if ($asppl_grp_cd10.equalsIgnoreCase(name)) {
			asppl_grp_cd10(value);
			return;
		}
		if ($asppl_grp_nm10.equalsIgnoreCase(name)) {
			asppl_grp_nm10(value);
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_purc_amt.equalsIgnoreCase(name)) {
			base_cur_purc_amt(value);
			return;
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			base_cur_ret_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			base_cur_cash_amt(value);
			return;
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			base_cur_note_amt(value);
			return;
		}
		if ($base_cur_account_amt.equalsIgnoreCase(name)) {
			base_cur_account_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($total_exc_gain_loss.equalsIgnoreCase(name)) {
			total_exc_gain_loss(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_purc_amt.equalsIgnoreCase(name)) {
			base_cur_purc_amt(value);
			return;
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			base_cur_ret_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			base_cur_cash_amt(value);
			return;
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			base_cur_note_amt(value);
			return;
		}
		if ($base_cur_account_amt.equalsIgnoreCase(name)) {
			base_cur_account_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($total_exc_gain_loss.equalsIgnoreCase(name)) {
			total_exc_gain_loss(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_purc_amt.equalsIgnoreCase(name)) {
			base_cur_purc_amt(value);
			return;
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			base_cur_ret_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			base_cur_cash_amt(value);
			return;
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			base_cur_note_amt(value);
			return;
		}
		if ($base_cur_account_amt.equalsIgnoreCase(name)) {
			base_cur_account_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($total_exc_gain_loss.equalsIgnoreCase(name)) {
			total_exc_gain_loss(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_purc_amt.equalsIgnoreCase(name)) {
			base_cur_purc_amt(value);
			return;
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			base_cur_ret_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			base_cur_cash_amt(value);
			return;
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			base_cur_note_amt(value);
			return;
		}
		if ($base_cur_account_amt.equalsIgnoreCase(name)) {
			base_cur_account_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($total_exc_gain_loss.equalsIgnoreCase(name)) {
			total_exc_gain_loss(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_purc_amt.equalsIgnoreCase(name)) {
			base_cur_purc_amt(value);
			return;
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			base_cur_ret_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			base_cur_cash_amt(value);
			return;
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			base_cur_note_amt(value);
			return;
		}
		if ($base_cur_account_amt.equalsIgnoreCase(name)) {
			base_cur_account_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($total_exc_gain_loss.equalsIgnoreCase(name)) {
			total_exc_gain_loss(value);
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
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			ap_cred_cd(value);
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
		if ($asppl_grp_cd1.equalsIgnoreCase(name)) {
			asppl_grp_cd1(value);
			return;
		}
		if ($asppl_grp_nm1.equalsIgnoreCase(name)) {
			asppl_grp_nm1(value);
			return;
		}
		if ($asppl_grp_cd2.equalsIgnoreCase(name)) {
			asppl_grp_cd2(value);
			return;
		}
		if ($asppl_grp_nm2.equalsIgnoreCase(name)) {
			asppl_grp_nm2(value);
			return;
		}
		if ($asppl_grp_cd3.equalsIgnoreCase(name)) {
			asppl_grp_cd3(value);
			return;
		}
		if ($asppl_grp_nm3.equalsIgnoreCase(name)) {
			asppl_grp_nm3(value);
			return;
		}
		if ($asppl_grp_cd4.equalsIgnoreCase(name)) {
			asppl_grp_cd4(value);
			return;
		}
		if ($asppl_grp_nm4.equalsIgnoreCase(name)) {
			asppl_grp_nm4(value);
			return;
		}
		if ($asppl_grp_cd5.equalsIgnoreCase(name)) {
			asppl_grp_cd5(value);
			return;
		}
		if ($asppl_grp_nm5.equalsIgnoreCase(name)) {
			asppl_grp_nm5(value);
			return;
		}
		if ($asppl_grp_cd6.equalsIgnoreCase(name)) {
			asppl_grp_cd6(value);
			return;
		}
		if ($asppl_grp_nm6.equalsIgnoreCase(name)) {
			asppl_grp_nm6(value);
			return;
		}
		if ($asppl_grp_cd7.equalsIgnoreCase(name)) {
			asppl_grp_cd7(value);
			return;
		}
		if ($asppl_grp_nm7.equalsIgnoreCase(name)) {
			asppl_grp_nm7(value);
			return;
		}
		if ($asppl_grp_cd8.equalsIgnoreCase(name)) {
			asppl_grp_cd8(value);
			return;
		}
		if ($asppl_grp_nm8.equalsIgnoreCase(name)) {
			asppl_grp_nm8(value);
			return;
		}
		if ($asppl_grp_cd9.equalsIgnoreCase(name)) {
			asppl_grp_cd9(value);
			return;
		}
		if ($asppl_grp_nm9.equalsIgnoreCase(name)) {
			asppl_grp_nm9(value);
			return;
		}
		if ($asppl_grp_cd10.equalsIgnoreCase(name)) {
			asppl_grp_cd10(value);
			return;
		}
		if ($asppl_grp_nm10.equalsIgnoreCase(name)) {
			asppl_grp_nm10(value);
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_purc_amt.equalsIgnoreCase(name)) {
			base_cur_purc_amt(value);
			return;
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			base_cur_ret_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			base_cur_cash_amt(value);
			return;
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			base_cur_note_amt(value);
			return;
		}
		if ($base_cur_account_amt.equalsIgnoreCase(name)) {
			base_cur_account_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($total_exc_gain_loss.equalsIgnoreCase(name)) {
			total_exc_gain_loss(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_purc_amt.equalsIgnoreCase(name)) {
			base_cur_purc_amt(value);
			return;
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			base_cur_ret_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			base_cur_cash_amt(value);
			return;
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			base_cur_note_amt(value);
			return;
		}
		if ($base_cur_account_amt.equalsIgnoreCase(name)) {
			base_cur_account_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($total_exc_gain_loss.equalsIgnoreCase(name)) {
			total_exc_gain_loss(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_purc_amt.equalsIgnoreCase(name)) {
			base_cur_purc_amt(value);
			return;
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			base_cur_ret_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			base_cur_cash_amt(value);
			return;
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			base_cur_note_amt(value);
			return;
		}
		if ($base_cur_account_amt.equalsIgnoreCase(name)) {
			base_cur_account_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($total_exc_gain_loss.equalsIgnoreCase(name)) {
			total_exc_gain_loss(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_purc_amt.equalsIgnoreCase(name)) {
			base_cur_purc_amt(value);
			return;
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			base_cur_ret_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			base_cur_cash_amt(value);
			return;
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			base_cur_note_amt(value);
			return;
		}
		if ($base_cur_account_amt.equalsIgnoreCase(name)) {
			base_cur_account_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($total_exc_gain_loss.equalsIgnoreCase(name)) {
			total_exc_gain_loss(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($account_amt.equalsIgnoreCase(name)) {
			account_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_purc_amt.equalsIgnoreCase(name)) {
			base_cur_purc_amt(value);
			return;
		}
		if ($base_cur_ret_amt.equalsIgnoreCase(name)) {
			base_cur_ret_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_sw_to_amt.equalsIgnoreCase(name)) {
			base_cur_sw_to_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			base_cur_cash_amt(value);
			return;
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			base_cur_note_amt(value);
			return;
		}
		if ($base_cur_account_amt.equalsIgnoreCase(name)) {
			base_cur_account_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		if ($total_exc_gain_loss.equalsIgnoreCase(name)) {
			total_exc_gain_loss(value);
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
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

