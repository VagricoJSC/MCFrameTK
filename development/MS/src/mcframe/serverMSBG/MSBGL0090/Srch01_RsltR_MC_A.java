package mcframe.serverMSBG.MSBGL0090;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

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
	 * AR type 債権区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public static final String $ar_typ_nm = "ar_typ_nm";
	/**
	 * Transaction balance of previous month 取引前月末残.<p>
	 *
	 */
	public static final String $init_bal = "init_bal";
	/**
	 * Transaction payment received (Current month) 取引当月入金.<p>
	 *
	 */
	public static final String $amt = "amt";
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public static final String $cl_day = "cl_day";
	/**
	 * Transaction billing (Current month) 取引当月請求.<p>
	 *
	 */
	public static final String $bef_cl_sls_amt = "bef_cl_sls_amt";
	/**
	 * Transaction billing from next month 取引翌月以降請求.<p>
	 *
	 */
	public static final String $aft_cl_sls_amt = "aft_cl_sls_amt";
	/**
	 * Transaction AR balance 取引売掛残.<p>
	 *
	 */
	public static final String $end_bal = "end_bal";
	/**
	 * Transaction outstanding notes 取引未決済手形.<p>
	 *
	 */
	public static final String $not_appl_note = "not_appl_note";
	/**
	 * Transaction Outstanding notes (Month) 取引月別未決済手形.<p>
	 *
	 */
	public static final String $mly_not_appl_note = "mly_not_appl_note";
	/**
	 * Transaction cash 取引現金.<p>
	 *
	 */
	public static final String $cash_amt = "cash_amt";
	/**
	 * Transaction notes 取引手形.<p>
	 *
	 */
	public static final String $note_amt = "note_amt";
	/**
	 * Transaction payment 取引振込.<p>
	 *
	 */
	public static final String $xfr_amt = "xfr_amt";
	/**
	 * Transaction offset 取引相殺.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	/**
	 * Transaction transfer 取引振替.<p>
	 *
	 */
	public static final String $sw_amt = "sw_amt";
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
	/**
	 * Base balance of previous month 基準前月末残.<p>
	 *
	 */
	public static final String $base_cur_init_bal = "base_cur_init_bal";
	/**
	 * Base payment received (Current month) 基準当月入金.<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	/**
	 * Base billing (Current month) 基準当月請求.<p>
	 *
	 */
	public static final String $base_cur_bef_cl_sls_amt = "base_cur_bef_cl_sls_amt";
	/**
	 * Base billing from next month 基準翌月以降請求.<p>
	 *
	 */
	public static final String $base_cur_aft_cl_sls_amt = "base_cur_aft_cl_sls_amt";
	/**
	 * Base AR balance 基準売掛残.<p>
	 *
	 */
	public static final String $base_cur_end_bal = "base_cur_end_bal";
	/**
	 * Base outstanding notes 基準未決済手形.<p>
	 *
	 */
	public static final String $base_cur_not_appl_note = "base_cur_not_appl_note";
	/**
	 * Outstanding notes by base month 基準月別未決済手形.<p>
	 *
	 */
	public static final String $base_cur_mly_not_appl_note = "base_cur_mly_not_appl_note";
	/**
	 * Base cash 基準現金.<p>
	 *
	 */
	public static final String $base_cur_cash_amt = "base_cur_cash_amt";
	/**
	 * Base notes 基準手形.<p>
	 *
	 */
	public static final String $base_cur_note_amt = "base_cur_note_amt";
	/**
	 * Base payment 基準振込.<p>
	 *
	 */
	public static final String $base_cur_xfr_amt = "base_cur_xfr_amt";
	/**
	 * Base offset 基準相殺.<p>
	 *
	 */
	public static final String $base_cur_setoff_amt = "base_cur_setoff_amt";
	/**
	 * Base transfer 基準振替.<p>
	 *
	 */
	public static final String $base_cur_sw_amt = "base_cur_sw_amt";
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
	 * AR customer classification cd. 1 売掛先分類ＣＤ１.<p>
	 *
	 */
	public static final String $acst_grp_cd1 = "acst_grp_cd1";
	/**
	 * AR customer classification name 1 売掛先分類名１.<p>
	 *
	 */
	public static final String $acst_grp_nm1 = "acst_grp_nm1";
	/**
	 * AR customer classification cd. 2 売掛先分類ＣＤ２.<p>
	 *
	 */
	public static final String $acst_grp_cd2 = "acst_grp_cd2";
	/**
	 * AR customer classification name 2 売掛先分類名２.<p>
	 *
	 */
	public static final String $acst_grp_nm2 = "acst_grp_nm2";
	/**
	 * AR customer classification cd. 3 売掛先分類ＣＤ３.<p>
	 *
	 */
	public static final String $acst_grp_cd3 = "acst_grp_cd3";
	/**
	 * AR customer classification name 3 売掛先分類名３.<p>
	 *
	 */
	public static final String $acst_grp_nm3 = "acst_grp_nm3";
	/**
	 * AR customer classification cd. 4 売掛先分類ＣＤ４.<p>
	 *
	 */
	public static final String $acst_grp_cd4 = "acst_grp_cd4";
	/**
	 * AR customer classification name 4 売掛先分類名４.<p>
	 *
	 */
	public static final String $acst_grp_nm4 = "acst_grp_nm4";
	/**
	 * AR customer classification cd. 5 売掛先分類ＣＤ５.<p>
	 *
	 */
	public static final String $acst_grp_cd5 = "acst_grp_cd5";
	/**
	 * AR customer classification name 5 売掛先分類名５.<p>
	 *
	 */
	public static final String $acst_grp_nm5 = "acst_grp_nm5";
	/**
	 * AR customer classification cd. 6 売掛先分類ＣＤ６.<p>
	 *
	 */
	public static final String $acst_grp_cd6 = "acst_grp_cd6";
	/**
	 * AR customer classification name 6 売掛先分類名６.<p>
	 *
	 */
	public static final String $acst_grp_nm6 = "acst_grp_nm6";
	/**
	 * AR customer classification cd. 7 売掛先分類ＣＤ７.<p>
	 *
	 */
	public static final String $acst_grp_cd7 = "acst_grp_cd7";
	/**
	 * AR customer classification name 7 売掛先分類名７.<p>
	 *
	 */
	public static final String $acst_grp_nm7 = "acst_grp_nm7";
	/**
	 * AR customer classification cd. 8 売掛先分類ＣＤ８.<p>
	 *
	 */
	public static final String $acst_grp_cd8 = "acst_grp_cd8";
	/**
	 * AR customer classification name 8 売掛先分類名８.<p>
	 *
	 */
	public static final String $acst_grp_nm8 = "acst_grp_nm8";
	/**
	 * AR customer classification cd. 9 売掛先分類ＣＤ９.<p>
	 *
	 */
	public static final String $acst_grp_cd9 = "acst_grp_cd9";
	/**
	 * AR customer classification name 9 売掛先分類名９.<p>
	 *
	 */
	public static final String $acst_grp_nm9 = "acst_grp_nm9";
	/**
	 * AR customer classification cd. 10 売掛先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $acst_grp_cd10 = "acst_grp_cd10";
	/**
	 * AR customer classification name 10 売掛先分類名１０.<p>
	 *
	 */
	public static final String $acst_grp_nm10 = "acst_grp_nm10";
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
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta ar_typ_nm_META = createCommonMeta($ar_typ_nm, mcframe.commonMA.meta.MA_META.AR_TYP_NM);
	public static final MCMeta init_bal_META = createCommonMeta($init_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cl_day_META = createCommonMeta($cl_day, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bef_cl_sls_amt_META = createCommonMeta($bef_cl_sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta aft_cl_sls_amt_META = createCommonMeta($aft_cl_sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta end_bal_META = createCommonMeta($end_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta not_appl_note_META = createCommonMeta($not_appl_note, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta mly_not_appl_note_META = createCommonMeta($mly_not_appl_note, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cash_amt_META = createCommonMeta($cash_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta note_amt_META = createCommonMeta($note_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xfr_amt_META = createCommonMeta($xfr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_amt_META = createCommonMeta($sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_amt_dec_place_META = createCommonMeta($base_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_init_bal_META = createCommonMeta($base_cur_init_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_bef_cl_sls_amt_META = createCommonMeta($base_cur_bef_cl_sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_aft_cl_sls_amt_META = createCommonMeta($base_cur_aft_cl_sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_end_bal_META = createCommonMeta($base_cur_end_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_not_appl_note_META = createCommonMeta($base_cur_not_appl_note, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_mly_not_appl_note_META = createCommonMeta($base_cur_mly_not_appl_note, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_cash_amt_META = createCommonMeta($base_cur_cash_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_note_amt_META = createCommonMeta($base_cur_note_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_xfr_amt_META = createCommonMeta($base_cur_xfr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_setoff_amt_META = createCommonMeta($base_cur_setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_sw_amt_META = createCommonMeta($base_cur_sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta exc_gain_loss_META = createCommonMeta($exc_gain_loss, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta total_exc_gain_loss_META = createCommonMeta($total_exc_gain_loss, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta acst_grp_cd1_META = createCommonMeta($acst_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm1_META = createCommonMeta($acst_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_cd2_META = createCommonMeta($acst_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm2_META = createCommonMeta($acst_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_cd3_META = createCommonMeta($acst_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm3_META = createCommonMeta($acst_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_cd4_META = createCommonMeta($acst_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm4_META = createCommonMeta($acst_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_cd5_META = createCommonMeta($acst_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm5_META = createCommonMeta($acst_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_cd6_META = createCommonMeta($acst_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm6_META = createCommonMeta($acst_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_cd7_META = createCommonMeta($acst_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm7_META = createCommonMeta($acst_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_cd8_META = createCommonMeta($acst_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm8_META = createCommonMeta($acst_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_cd9_META = createCommonMeta($acst_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm9_META = createCommonMeta($acst_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_cd10_META = createCommonMeta($acst_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm10_META = createCommonMeta($acst_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
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

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
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
			wrk_no_META,
			wrk_nm_META,
			ar_typ_META,
			ar_typ_nm_META,
			init_bal_META,
			amt_META,
			cl_day_META,
			bef_cl_sls_amt_META,
			aft_cl_sls_amt_META,
			end_bal_META,
			not_appl_note_META,
			mly_not_appl_note_META,
			cash_amt_META,
			note_amt_META,
			xfr_amt_META,
			setoff_amt_META,
			sw_amt_META,
			base_cur_cd_META,
			base_cur_nm_META,
			base_amt_dec_place_META,
			base_cur_init_bal_META,
			base_cur_amt_META,
			base_cur_bef_cl_sls_amt_META,
			base_cur_aft_cl_sls_amt_META,
			base_cur_end_bal_META,
			base_cur_not_appl_note_META,
			base_cur_mly_not_appl_note_META,
			base_cur_cash_amt_META,
			base_cur_note_amt_META,
			base_cur_xfr_amt_META,
			base_cur_setoff_amt_META,
			base_cur_sw_amt_META,
			exc_gain_loss_META,
			total_exc_gain_loss_META,
			acst_grp_cd1_META,
			acst_grp_nm1_META,
			acst_grp_cd2_META,
			acst_grp_nm2_META,
			acst_grp_cd3_META,
			acst_grp_nm3_META,
			acst_grp_cd4_META,
			acst_grp_nm4_META,
			acst_grp_cd5_META,
			acst_grp_nm5_META,
			acst_grp_cd6_META,
			acst_grp_nm6_META,
			acst_grp_cd7_META,
			acst_grp_nm7_META,
			acst_grp_cd8_META,
			acst_grp_nm8_META,
			acst_grp_cd9_META,
			acst_grp_nm9_META,
			acst_grp_cd10_META,
			acst_grp_nm10_META,
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
				{$ar_typ, "MAC_AR_TYP"}	// ar_typ
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
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


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 11, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 11, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 12, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 12, $wrk_nm, value);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 13, $ar_typ);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 13, $ar_typ, value);
	}


	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public String ar_typ_nm() {
		return getConstString(offset + 14, $ar_typ_nm);
	}

	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public void ar_typ_nm(String value) {
		setConstString(offset + 14, $ar_typ_nm, value);
	}


	/**
	 * Transaction balance of previous month 取引前月末残.<p>
	 *
	 */
	public MCNumber init_bal() {
		return getConstNumber(offset + 15, $init_bal);
	}

	/**
	 * Transaction balance of previous month 取引前月末残.<p>
	 *
	 */
	public void init_bal(MCNumber value) {
		setConstNumber(offset + 15, $init_bal, value);
	}

	/**
	 * Transaction balance of previous month 取引前月末残.<p>
	 *
	 */
	public void init_bal(int value) {
		setConstNumber(offset + 15, $init_bal, value);
	}

	/**
	 * Transaction balance of previous month 取引前月末残.<p>
	 *
	 */
	public void init_bal(long value) {
		setConstNumber(offset + 15, $init_bal, value);
	}

	/**
	 * Transaction balance of previous month 取引前月末残.<p>
	 *
	 */
	public void init_bal(float value) {
		setConstNumber(offset + 15, $init_bal, value);
	}

	/**
	 * Transaction balance of previous month 取引前月末残.<p>
	 *
	 */
	public void init_bal(double value) {
		setConstNumber(offset + 15, $init_bal, value);
	}


	/**
	 * Transaction payment received (Current month) 取引当月入金.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 16, $amt);
	}

	/**
	 * Transaction payment received (Current month) 取引当月入金.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 16, $amt, value);
	}

	/**
	 * Transaction payment received (Current month) 取引当月入金.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 16, $amt, value);
	}

	/**
	 * Transaction payment received (Current month) 取引当月入金.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 16, $amt, value);
	}

	/**
	 * Transaction payment received (Current month) 取引当月入金.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 16, $amt, value);
	}

	/**
	 * Transaction payment received (Current month) 取引当月入金.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 16, $amt, value);
	}


	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCNumber cl_day() {
		return getConstNumber(offset + 17, $cl_day);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void cl_day(MCNumber value) {
		setConstNumber(offset + 17, $cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void cl_day(int value) {
		setConstNumber(offset + 17, $cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void cl_day(long value) {
		setConstNumber(offset + 17, $cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void cl_day(float value) {
		setConstNumber(offset + 17, $cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void cl_day(double value) {
		setConstNumber(offset + 17, $cl_day, value);
	}


	/**
	 * Transaction billing (Current month) 取引当月請求.<p>
	 *
	 */
	public MCNumber bef_cl_sls_amt() {
		return getConstNumber(offset + 18, $bef_cl_sls_amt);
	}

	/**
	 * Transaction billing (Current month) 取引当月請求.<p>
	 *
	 */
	public void bef_cl_sls_amt(MCNumber value) {
		setConstNumber(offset + 18, $bef_cl_sls_amt, value);
	}

	/**
	 * Transaction billing (Current month) 取引当月請求.<p>
	 *
	 */
	public void bef_cl_sls_amt(int value) {
		setConstNumber(offset + 18, $bef_cl_sls_amt, value);
	}

	/**
	 * Transaction billing (Current month) 取引当月請求.<p>
	 *
	 */
	public void bef_cl_sls_amt(long value) {
		setConstNumber(offset + 18, $bef_cl_sls_amt, value);
	}

	/**
	 * Transaction billing (Current month) 取引当月請求.<p>
	 *
	 */
	public void bef_cl_sls_amt(float value) {
		setConstNumber(offset + 18, $bef_cl_sls_amt, value);
	}

	/**
	 * Transaction billing (Current month) 取引当月請求.<p>
	 *
	 */
	public void bef_cl_sls_amt(double value) {
		setConstNumber(offset + 18, $bef_cl_sls_amt, value);
	}


	/**
	 * Transaction billing from next month 取引翌月以降請求.<p>
	 *
	 */
	public MCNumber aft_cl_sls_amt() {
		return getConstNumber(offset + 19, $aft_cl_sls_amt);
	}

	/**
	 * Transaction billing from next month 取引翌月以降請求.<p>
	 *
	 */
	public void aft_cl_sls_amt(MCNumber value) {
		setConstNumber(offset + 19, $aft_cl_sls_amt, value);
	}

	/**
	 * Transaction billing from next month 取引翌月以降請求.<p>
	 *
	 */
	public void aft_cl_sls_amt(int value) {
		setConstNumber(offset + 19, $aft_cl_sls_amt, value);
	}

	/**
	 * Transaction billing from next month 取引翌月以降請求.<p>
	 *
	 */
	public void aft_cl_sls_amt(long value) {
		setConstNumber(offset + 19, $aft_cl_sls_amt, value);
	}

	/**
	 * Transaction billing from next month 取引翌月以降請求.<p>
	 *
	 */
	public void aft_cl_sls_amt(float value) {
		setConstNumber(offset + 19, $aft_cl_sls_amt, value);
	}

	/**
	 * Transaction billing from next month 取引翌月以降請求.<p>
	 *
	 */
	public void aft_cl_sls_amt(double value) {
		setConstNumber(offset + 19, $aft_cl_sls_amt, value);
	}


	/**
	 * Transaction AR balance 取引売掛残.<p>
	 *
	 */
	public MCNumber end_bal() {
		return getConstNumber(offset + 20, $end_bal);
	}

	/**
	 * Transaction AR balance 取引売掛残.<p>
	 *
	 */
	public void end_bal(MCNumber value) {
		setConstNumber(offset + 20, $end_bal, value);
	}

	/**
	 * Transaction AR balance 取引売掛残.<p>
	 *
	 */
	public void end_bal(int value) {
		setConstNumber(offset + 20, $end_bal, value);
	}

	/**
	 * Transaction AR balance 取引売掛残.<p>
	 *
	 */
	public void end_bal(long value) {
		setConstNumber(offset + 20, $end_bal, value);
	}

	/**
	 * Transaction AR balance 取引売掛残.<p>
	 *
	 */
	public void end_bal(float value) {
		setConstNumber(offset + 20, $end_bal, value);
	}

	/**
	 * Transaction AR balance 取引売掛残.<p>
	 *
	 */
	public void end_bal(double value) {
		setConstNumber(offset + 20, $end_bal, value);
	}


	/**
	 * Transaction outstanding notes 取引未決済手形.<p>
	 *
	 */
	public MCNumber not_appl_note() {
		return getConstNumber(offset + 21, $not_appl_note);
	}

	/**
	 * Transaction outstanding notes 取引未決済手形.<p>
	 *
	 */
	public void not_appl_note(MCNumber value) {
		setConstNumber(offset + 21, $not_appl_note, value);
	}

	/**
	 * Transaction outstanding notes 取引未決済手形.<p>
	 *
	 */
	public void not_appl_note(int value) {
		setConstNumber(offset + 21, $not_appl_note, value);
	}

	/**
	 * Transaction outstanding notes 取引未決済手形.<p>
	 *
	 */
	public void not_appl_note(long value) {
		setConstNumber(offset + 21, $not_appl_note, value);
	}

	/**
	 * Transaction outstanding notes 取引未決済手形.<p>
	 *
	 */
	public void not_appl_note(float value) {
		setConstNumber(offset + 21, $not_appl_note, value);
	}

	/**
	 * Transaction outstanding notes 取引未決済手形.<p>
	 *
	 */
	public void not_appl_note(double value) {
		setConstNumber(offset + 21, $not_appl_note, value);
	}


	/**
	 * Transaction Outstanding notes (Month) 取引月別未決済手形.<p>
	 *
	 */
	public MCNumber mly_not_appl_note() {
		return getConstNumber(offset + 22, $mly_not_appl_note);
	}

	/**
	 * Transaction Outstanding notes (Month) 取引月別未決済手形.<p>
	 *
	 */
	public void mly_not_appl_note(MCNumber value) {
		setConstNumber(offset + 22, $mly_not_appl_note, value);
	}

	/**
	 * Transaction Outstanding notes (Month) 取引月別未決済手形.<p>
	 *
	 */
	public void mly_not_appl_note(int value) {
		setConstNumber(offset + 22, $mly_not_appl_note, value);
	}

	/**
	 * Transaction Outstanding notes (Month) 取引月別未決済手形.<p>
	 *
	 */
	public void mly_not_appl_note(long value) {
		setConstNumber(offset + 22, $mly_not_appl_note, value);
	}

	/**
	 * Transaction Outstanding notes (Month) 取引月別未決済手形.<p>
	 *
	 */
	public void mly_not_appl_note(float value) {
		setConstNumber(offset + 22, $mly_not_appl_note, value);
	}

	/**
	 * Transaction Outstanding notes (Month) 取引月別未決済手形.<p>
	 *
	 */
	public void mly_not_appl_note(double value) {
		setConstNumber(offset + 22, $mly_not_appl_note, value);
	}


	/**
	 * Transaction cash 取引現金.<p>
	 *
	 */
	public MCNumber cash_amt() {
		return getConstNumber(offset + 23, $cash_amt);
	}

	/**
	 * Transaction cash 取引現金.<p>
	 *
	 */
	public void cash_amt(MCNumber value) {
		setConstNumber(offset + 23, $cash_amt, value);
	}

	/**
	 * Transaction cash 取引現金.<p>
	 *
	 */
	public void cash_amt(int value) {
		setConstNumber(offset + 23, $cash_amt, value);
	}

	/**
	 * Transaction cash 取引現金.<p>
	 *
	 */
	public void cash_amt(long value) {
		setConstNumber(offset + 23, $cash_amt, value);
	}

	/**
	 * Transaction cash 取引現金.<p>
	 *
	 */
	public void cash_amt(float value) {
		setConstNumber(offset + 23, $cash_amt, value);
	}

	/**
	 * Transaction cash 取引現金.<p>
	 *
	 */
	public void cash_amt(double value) {
		setConstNumber(offset + 23, $cash_amt, value);
	}


	/**
	 * Transaction notes 取引手形.<p>
	 *
	 */
	public MCNumber note_amt() {
		return getConstNumber(offset + 24, $note_amt);
	}

	/**
	 * Transaction notes 取引手形.<p>
	 *
	 */
	public void note_amt(MCNumber value) {
		setConstNumber(offset + 24, $note_amt, value);
	}

	/**
	 * Transaction notes 取引手形.<p>
	 *
	 */
	public void note_amt(int value) {
		setConstNumber(offset + 24, $note_amt, value);
	}

	/**
	 * Transaction notes 取引手形.<p>
	 *
	 */
	public void note_amt(long value) {
		setConstNumber(offset + 24, $note_amt, value);
	}

	/**
	 * Transaction notes 取引手形.<p>
	 *
	 */
	public void note_amt(float value) {
		setConstNumber(offset + 24, $note_amt, value);
	}

	/**
	 * Transaction notes 取引手形.<p>
	 *
	 */
	public void note_amt(double value) {
		setConstNumber(offset + 24, $note_amt, value);
	}


	/**
	 * Transaction payment 取引振込.<p>
	 *
	 */
	public MCNumber xfr_amt() {
		return getConstNumber(offset + 25, $xfr_amt);
	}

	/**
	 * Transaction payment 取引振込.<p>
	 *
	 */
	public void xfr_amt(MCNumber value) {
		setConstNumber(offset + 25, $xfr_amt, value);
	}

	/**
	 * Transaction payment 取引振込.<p>
	 *
	 */
	public void xfr_amt(int value) {
		setConstNumber(offset + 25, $xfr_amt, value);
	}

	/**
	 * Transaction payment 取引振込.<p>
	 *
	 */
	public void xfr_amt(long value) {
		setConstNumber(offset + 25, $xfr_amt, value);
	}

	/**
	 * Transaction payment 取引振込.<p>
	 *
	 */
	public void xfr_amt(float value) {
		setConstNumber(offset + 25, $xfr_amt, value);
	}

	/**
	 * Transaction payment 取引振込.<p>
	 *
	 */
	public void xfr_amt(double value) {
		setConstNumber(offset + 25, $xfr_amt, value);
	}


	/**
	 * Transaction offset 取引相殺.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 26, $setoff_amt);
	}

	/**
	 * Transaction offset 取引相殺.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 26, $setoff_amt, value);
	}

	/**
	 * Transaction offset 取引相殺.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 26, $setoff_amt, value);
	}

	/**
	 * Transaction offset 取引相殺.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 26, $setoff_amt, value);
	}

	/**
	 * Transaction offset 取引相殺.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 26, $setoff_amt, value);
	}

	/**
	 * Transaction offset 取引相殺.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 26, $setoff_amt, value);
	}


	/**
	 * Transaction transfer 取引振替.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return getConstNumber(offset + 27, $sw_amt);
	}

	/**
	 * Transaction transfer 取引振替.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		setConstNumber(offset + 27, $sw_amt, value);
	}

	/**
	 * Transaction transfer 取引振替.<p>
	 *
	 */
	public void sw_amt(int value) {
		setConstNumber(offset + 27, $sw_amt, value);
	}

	/**
	 * Transaction transfer 取引振替.<p>
	 *
	 */
	public void sw_amt(long value) {
		setConstNumber(offset + 27, $sw_amt, value);
	}

	/**
	 * Transaction transfer 取引振替.<p>
	 *
	 */
	public void sw_amt(float value) {
		setConstNumber(offset + 27, $sw_amt, value);
	}

	/**
	 * Transaction transfer 取引振替.<p>
	 *
	 */
	public void sw_amt(double value) {
		setConstNumber(offset + 27, $sw_amt, value);
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
	public MCNumber base_amt_dec_place() {
		return getConstNumber(offset + 30, $base_amt_dec_place);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 30, $base_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_amt_dec_place(int value) {
		setConstNumber(offset + 30, $base_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_amt_dec_place(long value) {
		setConstNumber(offset + 30, $base_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_amt_dec_place(float value) {
		setConstNumber(offset + 30, $base_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_amt_dec_place(double value) {
		setConstNumber(offset + 30, $base_amt_dec_place, value);
	}


	/**
	 * Base balance of previous month 基準前月末残.<p>
	 *
	 */
	public MCNumber base_cur_init_bal() {
		return getConstNumber(offset + 31, $base_cur_init_bal);
	}

	/**
	 * Base balance of previous month 基準前月末残.<p>
	 *
	 */
	public void base_cur_init_bal(MCNumber value) {
		setConstNumber(offset + 31, $base_cur_init_bal, value);
	}

	/**
	 * Base balance of previous month 基準前月末残.<p>
	 *
	 */
	public void base_cur_init_bal(int value) {
		setConstNumber(offset + 31, $base_cur_init_bal, value);
	}

	/**
	 * Base balance of previous month 基準前月末残.<p>
	 *
	 */
	public void base_cur_init_bal(long value) {
		setConstNumber(offset + 31, $base_cur_init_bal, value);
	}

	/**
	 * Base balance of previous month 基準前月末残.<p>
	 *
	 */
	public void base_cur_init_bal(float value) {
		setConstNumber(offset + 31, $base_cur_init_bal, value);
	}

	/**
	 * Base balance of previous month 基準前月末残.<p>
	 *
	 */
	public void base_cur_init_bal(double value) {
		setConstNumber(offset + 31, $base_cur_init_bal, value);
	}


	/**
	 * Base payment received (Current month) 基準当月入金.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 32, $base_cur_amt);
	}

	/**
	 * Base payment received (Current month) 基準当月入金.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 32, $base_cur_amt, value);
	}

	/**
	 * Base payment received (Current month) 基準当月入金.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 32, $base_cur_amt, value);
	}

	/**
	 * Base payment received (Current month) 基準当月入金.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 32, $base_cur_amt, value);
	}

	/**
	 * Base payment received (Current month) 基準当月入金.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 32, $base_cur_amt, value);
	}

	/**
	 * Base payment received (Current month) 基準当月入金.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 32, $base_cur_amt, value);
	}


	/**
	 * Base billing (Current month) 基準当月請求.<p>
	 *
	 */
	public MCNumber base_cur_bef_cl_sls_amt() {
		return getConstNumber(offset + 33, $base_cur_bef_cl_sls_amt);
	}

	/**
	 * Base billing (Current month) 基準当月請求.<p>
	 *
	 */
	public void base_cur_bef_cl_sls_amt(MCNumber value) {
		setConstNumber(offset + 33, $base_cur_bef_cl_sls_amt, value);
	}

	/**
	 * Base billing (Current month) 基準当月請求.<p>
	 *
	 */
	public void base_cur_bef_cl_sls_amt(int value) {
		setConstNumber(offset + 33, $base_cur_bef_cl_sls_amt, value);
	}

	/**
	 * Base billing (Current month) 基準当月請求.<p>
	 *
	 */
	public void base_cur_bef_cl_sls_amt(long value) {
		setConstNumber(offset + 33, $base_cur_bef_cl_sls_amt, value);
	}

	/**
	 * Base billing (Current month) 基準当月請求.<p>
	 *
	 */
	public void base_cur_bef_cl_sls_amt(float value) {
		setConstNumber(offset + 33, $base_cur_bef_cl_sls_amt, value);
	}

	/**
	 * Base billing (Current month) 基準当月請求.<p>
	 *
	 */
	public void base_cur_bef_cl_sls_amt(double value) {
		setConstNumber(offset + 33, $base_cur_bef_cl_sls_amt, value);
	}


	/**
	 * Base billing from next month 基準翌月以降請求.<p>
	 *
	 */
	public MCNumber base_cur_aft_cl_sls_amt() {
		return getConstNumber(offset + 34, $base_cur_aft_cl_sls_amt);
	}

	/**
	 * Base billing from next month 基準翌月以降請求.<p>
	 *
	 */
	public void base_cur_aft_cl_sls_amt(MCNumber value) {
		setConstNumber(offset + 34, $base_cur_aft_cl_sls_amt, value);
	}

	/**
	 * Base billing from next month 基準翌月以降請求.<p>
	 *
	 */
	public void base_cur_aft_cl_sls_amt(int value) {
		setConstNumber(offset + 34, $base_cur_aft_cl_sls_amt, value);
	}

	/**
	 * Base billing from next month 基準翌月以降請求.<p>
	 *
	 */
	public void base_cur_aft_cl_sls_amt(long value) {
		setConstNumber(offset + 34, $base_cur_aft_cl_sls_amt, value);
	}

	/**
	 * Base billing from next month 基準翌月以降請求.<p>
	 *
	 */
	public void base_cur_aft_cl_sls_amt(float value) {
		setConstNumber(offset + 34, $base_cur_aft_cl_sls_amt, value);
	}

	/**
	 * Base billing from next month 基準翌月以降請求.<p>
	 *
	 */
	public void base_cur_aft_cl_sls_amt(double value) {
		setConstNumber(offset + 34, $base_cur_aft_cl_sls_amt, value);
	}


	/**
	 * Base AR balance 基準売掛残.<p>
	 *
	 */
	public MCNumber base_cur_end_bal() {
		return getConstNumber(offset + 35, $base_cur_end_bal);
	}

	/**
	 * Base AR balance 基準売掛残.<p>
	 *
	 */
	public void base_cur_end_bal(MCNumber value) {
		setConstNumber(offset + 35, $base_cur_end_bal, value);
	}

	/**
	 * Base AR balance 基準売掛残.<p>
	 *
	 */
	public void base_cur_end_bal(int value) {
		setConstNumber(offset + 35, $base_cur_end_bal, value);
	}

	/**
	 * Base AR balance 基準売掛残.<p>
	 *
	 */
	public void base_cur_end_bal(long value) {
		setConstNumber(offset + 35, $base_cur_end_bal, value);
	}

	/**
	 * Base AR balance 基準売掛残.<p>
	 *
	 */
	public void base_cur_end_bal(float value) {
		setConstNumber(offset + 35, $base_cur_end_bal, value);
	}

	/**
	 * Base AR balance 基準売掛残.<p>
	 *
	 */
	public void base_cur_end_bal(double value) {
		setConstNumber(offset + 35, $base_cur_end_bal, value);
	}


	/**
	 * Base outstanding notes 基準未決済手形.<p>
	 *
	 */
	public MCNumber base_cur_not_appl_note() {
		return getConstNumber(offset + 36, $base_cur_not_appl_note);
	}

	/**
	 * Base outstanding notes 基準未決済手形.<p>
	 *
	 */
	public void base_cur_not_appl_note(MCNumber value) {
		setConstNumber(offset + 36, $base_cur_not_appl_note, value);
	}

	/**
	 * Base outstanding notes 基準未決済手形.<p>
	 *
	 */
	public void base_cur_not_appl_note(int value) {
		setConstNumber(offset + 36, $base_cur_not_appl_note, value);
	}

	/**
	 * Base outstanding notes 基準未決済手形.<p>
	 *
	 */
	public void base_cur_not_appl_note(long value) {
		setConstNumber(offset + 36, $base_cur_not_appl_note, value);
	}

	/**
	 * Base outstanding notes 基準未決済手形.<p>
	 *
	 */
	public void base_cur_not_appl_note(float value) {
		setConstNumber(offset + 36, $base_cur_not_appl_note, value);
	}

	/**
	 * Base outstanding notes 基準未決済手形.<p>
	 *
	 */
	public void base_cur_not_appl_note(double value) {
		setConstNumber(offset + 36, $base_cur_not_appl_note, value);
	}


	/**
	 * Outstanding notes by base month 基準月別未決済手形.<p>
	 *
	 */
	public MCNumber base_cur_mly_not_appl_note() {
		return getConstNumber(offset + 37, $base_cur_mly_not_appl_note);
	}

	/**
	 * Outstanding notes by base month 基準月別未決済手形.<p>
	 *
	 */
	public void base_cur_mly_not_appl_note(MCNumber value) {
		setConstNumber(offset + 37, $base_cur_mly_not_appl_note, value);
	}

	/**
	 * Outstanding notes by base month 基準月別未決済手形.<p>
	 *
	 */
	public void base_cur_mly_not_appl_note(int value) {
		setConstNumber(offset + 37, $base_cur_mly_not_appl_note, value);
	}

	/**
	 * Outstanding notes by base month 基準月別未決済手形.<p>
	 *
	 */
	public void base_cur_mly_not_appl_note(long value) {
		setConstNumber(offset + 37, $base_cur_mly_not_appl_note, value);
	}

	/**
	 * Outstanding notes by base month 基準月別未決済手形.<p>
	 *
	 */
	public void base_cur_mly_not_appl_note(float value) {
		setConstNumber(offset + 37, $base_cur_mly_not_appl_note, value);
	}

	/**
	 * Outstanding notes by base month 基準月別未決済手形.<p>
	 *
	 */
	public void base_cur_mly_not_appl_note(double value) {
		setConstNumber(offset + 37, $base_cur_mly_not_appl_note, value);
	}


	/**
	 * Base cash 基準現金.<p>
	 *
	 */
	public MCNumber base_cur_cash_amt() {
		return getConstNumber(offset + 38, $base_cur_cash_amt);
	}

	/**
	 * Base cash 基準現金.<p>
	 *
	 */
	public void base_cur_cash_amt(MCNumber value) {
		setConstNumber(offset + 38, $base_cur_cash_amt, value);
	}

	/**
	 * Base cash 基準現金.<p>
	 *
	 */
	public void base_cur_cash_amt(int value) {
		setConstNumber(offset + 38, $base_cur_cash_amt, value);
	}

	/**
	 * Base cash 基準現金.<p>
	 *
	 */
	public void base_cur_cash_amt(long value) {
		setConstNumber(offset + 38, $base_cur_cash_amt, value);
	}

	/**
	 * Base cash 基準現金.<p>
	 *
	 */
	public void base_cur_cash_amt(float value) {
		setConstNumber(offset + 38, $base_cur_cash_amt, value);
	}

	/**
	 * Base cash 基準現金.<p>
	 *
	 */
	public void base_cur_cash_amt(double value) {
		setConstNumber(offset + 38, $base_cur_cash_amt, value);
	}


	/**
	 * Base notes 基準手形.<p>
	 *
	 */
	public MCNumber base_cur_note_amt() {
		return getConstNumber(offset + 39, $base_cur_note_amt);
	}

	/**
	 * Base notes 基準手形.<p>
	 *
	 */
	public void base_cur_note_amt(MCNumber value) {
		setConstNumber(offset + 39, $base_cur_note_amt, value);
	}

	/**
	 * Base notes 基準手形.<p>
	 *
	 */
	public void base_cur_note_amt(int value) {
		setConstNumber(offset + 39, $base_cur_note_amt, value);
	}

	/**
	 * Base notes 基準手形.<p>
	 *
	 */
	public void base_cur_note_amt(long value) {
		setConstNumber(offset + 39, $base_cur_note_amt, value);
	}

	/**
	 * Base notes 基準手形.<p>
	 *
	 */
	public void base_cur_note_amt(float value) {
		setConstNumber(offset + 39, $base_cur_note_amt, value);
	}

	/**
	 * Base notes 基準手形.<p>
	 *
	 */
	public void base_cur_note_amt(double value) {
		setConstNumber(offset + 39, $base_cur_note_amt, value);
	}


	/**
	 * Base payment 基準振込.<p>
	 *
	 */
	public MCNumber base_cur_xfr_amt() {
		return getConstNumber(offset + 40, $base_cur_xfr_amt);
	}

	/**
	 * Base payment 基準振込.<p>
	 *
	 */
	public void base_cur_xfr_amt(MCNumber value) {
		setConstNumber(offset + 40, $base_cur_xfr_amt, value);
	}

	/**
	 * Base payment 基準振込.<p>
	 *
	 */
	public void base_cur_xfr_amt(int value) {
		setConstNumber(offset + 40, $base_cur_xfr_amt, value);
	}

	/**
	 * Base payment 基準振込.<p>
	 *
	 */
	public void base_cur_xfr_amt(long value) {
		setConstNumber(offset + 40, $base_cur_xfr_amt, value);
	}

	/**
	 * Base payment 基準振込.<p>
	 *
	 */
	public void base_cur_xfr_amt(float value) {
		setConstNumber(offset + 40, $base_cur_xfr_amt, value);
	}

	/**
	 * Base payment 基準振込.<p>
	 *
	 */
	public void base_cur_xfr_amt(double value) {
		setConstNumber(offset + 40, $base_cur_xfr_amt, value);
	}


	/**
	 * Base offset 基準相殺.<p>
	 *
	 */
	public MCNumber base_cur_setoff_amt() {
		return getConstNumber(offset + 41, $base_cur_setoff_amt);
	}

	/**
	 * Base offset 基準相殺.<p>
	 *
	 */
	public void base_cur_setoff_amt(MCNumber value) {
		setConstNumber(offset + 41, $base_cur_setoff_amt, value);
	}

	/**
	 * Base offset 基準相殺.<p>
	 *
	 */
	public void base_cur_setoff_amt(int value) {
		setConstNumber(offset + 41, $base_cur_setoff_amt, value);
	}

	/**
	 * Base offset 基準相殺.<p>
	 *
	 */
	public void base_cur_setoff_amt(long value) {
		setConstNumber(offset + 41, $base_cur_setoff_amt, value);
	}

	/**
	 * Base offset 基準相殺.<p>
	 *
	 */
	public void base_cur_setoff_amt(float value) {
		setConstNumber(offset + 41, $base_cur_setoff_amt, value);
	}

	/**
	 * Base offset 基準相殺.<p>
	 *
	 */
	public void base_cur_setoff_amt(double value) {
		setConstNumber(offset + 41, $base_cur_setoff_amt, value);
	}


	/**
	 * Base transfer 基準振替.<p>
	 *
	 */
	public MCNumber base_cur_sw_amt() {
		return getConstNumber(offset + 42, $base_cur_sw_amt);
	}

	/**
	 * Base transfer 基準振替.<p>
	 *
	 */
	public void base_cur_sw_amt(MCNumber value) {
		setConstNumber(offset + 42, $base_cur_sw_amt, value);
	}

	/**
	 * Base transfer 基準振替.<p>
	 *
	 */
	public void base_cur_sw_amt(int value) {
		setConstNumber(offset + 42, $base_cur_sw_amt, value);
	}

	/**
	 * Base transfer 基準振替.<p>
	 *
	 */
	public void base_cur_sw_amt(long value) {
		setConstNumber(offset + 42, $base_cur_sw_amt, value);
	}

	/**
	 * Base transfer 基準振替.<p>
	 *
	 */
	public void base_cur_sw_amt(float value) {
		setConstNumber(offset + 42, $base_cur_sw_amt, value);
	}

	/**
	 * Base transfer 基準振替.<p>
	 *
	 */
	public void base_cur_sw_amt(double value) {
		setConstNumber(offset + 42, $base_cur_sw_amt, value);
	}


	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public MCNumber exc_gain_loss() {
		return getConstNumber(offset + 43, $exc_gain_loss);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(MCNumber value) {
		setConstNumber(offset + 43, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(int value) {
		setConstNumber(offset + 43, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(long value) {
		setConstNumber(offset + 43, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(float value) {
		setConstNumber(offset + 43, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(double value) {
		setConstNumber(offset + 43, $exc_gain_loss, value);
	}


	/**
	 * Accumulation exchange gain/loss 累計為替差損益.<p>
	 *
	 */
	public MCNumber total_exc_gain_loss() {
		return getConstNumber(offset + 44, $total_exc_gain_loss);
	}

	/**
	 * Accumulation exchange gain/loss 累計為替差損益.<p>
	 *
	 */
	public void total_exc_gain_loss(MCNumber value) {
		setConstNumber(offset + 44, $total_exc_gain_loss, value);
	}

	/**
	 * Accumulation exchange gain/loss 累計為替差損益.<p>
	 *
	 */
	public void total_exc_gain_loss(int value) {
		setConstNumber(offset + 44, $total_exc_gain_loss, value);
	}

	/**
	 * Accumulation exchange gain/loss 累計為替差損益.<p>
	 *
	 */
	public void total_exc_gain_loss(long value) {
		setConstNumber(offset + 44, $total_exc_gain_loss, value);
	}

	/**
	 * Accumulation exchange gain/loss 累計為替差損益.<p>
	 *
	 */
	public void total_exc_gain_loss(float value) {
		setConstNumber(offset + 44, $total_exc_gain_loss, value);
	}

	/**
	 * Accumulation exchange gain/loss 累計為替差損益.<p>
	 *
	 */
	public void total_exc_gain_loss(double value) {
		setConstNumber(offset + 44, $total_exc_gain_loss, value);
	}


	/**
	 * AR customer classification cd. 1 売掛先分類ＣＤ１.<p>
	 *
	 */
	public String acst_grp_cd1() {
		return getConstString(offset + 45, $acst_grp_cd1);
	}

	/**
	 * AR customer classification cd. 1 売掛先分類ＣＤ１.<p>
	 *
	 */
	public void acst_grp_cd1(String value) {
		setConstString(offset + 45, $acst_grp_cd1, value);
	}


	/**
	 * AR customer classification name 1 売掛先分類名１.<p>
	 *
	 */
	public String acst_grp_nm1() {
		return getConstString(offset + 46, $acst_grp_nm1);
	}

	/**
	 * AR customer classification name 1 売掛先分類名１.<p>
	 *
	 */
	public void acst_grp_nm1(String value) {
		setConstString(offset + 46, $acst_grp_nm1, value);
	}


	/**
	 * AR customer classification cd. 2 売掛先分類ＣＤ２.<p>
	 *
	 */
	public String acst_grp_cd2() {
		return getConstString(offset + 47, $acst_grp_cd2);
	}

	/**
	 * AR customer classification cd. 2 売掛先分類ＣＤ２.<p>
	 *
	 */
	public void acst_grp_cd2(String value) {
		setConstString(offset + 47, $acst_grp_cd2, value);
	}


	/**
	 * AR customer classification name 2 売掛先分類名２.<p>
	 *
	 */
	public String acst_grp_nm2() {
		return getConstString(offset + 48, $acst_grp_nm2);
	}

	/**
	 * AR customer classification name 2 売掛先分類名２.<p>
	 *
	 */
	public void acst_grp_nm2(String value) {
		setConstString(offset + 48, $acst_grp_nm2, value);
	}


	/**
	 * AR customer classification cd. 3 売掛先分類ＣＤ３.<p>
	 *
	 */
	public String acst_grp_cd3() {
		return getConstString(offset + 49, $acst_grp_cd3);
	}

	/**
	 * AR customer classification cd. 3 売掛先分類ＣＤ３.<p>
	 *
	 */
	public void acst_grp_cd3(String value) {
		setConstString(offset + 49, $acst_grp_cd3, value);
	}


	/**
	 * AR customer classification name 3 売掛先分類名３.<p>
	 *
	 */
	public String acst_grp_nm3() {
		return getConstString(offset + 50, $acst_grp_nm3);
	}

	/**
	 * AR customer classification name 3 売掛先分類名３.<p>
	 *
	 */
	public void acst_grp_nm3(String value) {
		setConstString(offset + 50, $acst_grp_nm3, value);
	}


	/**
	 * AR customer classification cd. 4 売掛先分類ＣＤ４.<p>
	 *
	 */
	public String acst_grp_cd4() {
		return getConstString(offset + 51, $acst_grp_cd4);
	}

	/**
	 * AR customer classification cd. 4 売掛先分類ＣＤ４.<p>
	 *
	 */
	public void acst_grp_cd4(String value) {
		setConstString(offset + 51, $acst_grp_cd4, value);
	}


	/**
	 * AR customer classification name 4 売掛先分類名４.<p>
	 *
	 */
	public String acst_grp_nm4() {
		return getConstString(offset + 52, $acst_grp_nm4);
	}

	/**
	 * AR customer classification name 4 売掛先分類名４.<p>
	 *
	 */
	public void acst_grp_nm4(String value) {
		setConstString(offset + 52, $acst_grp_nm4, value);
	}


	/**
	 * AR customer classification cd. 5 売掛先分類ＣＤ５.<p>
	 *
	 */
	public String acst_grp_cd5() {
		return getConstString(offset + 53, $acst_grp_cd5);
	}

	/**
	 * AR customer classification cd. 5 売掛先分類ＣＤ５.<p>
	 *
	 */
	public void acst_grp_cd5(String value) {
		setConstString(offset + 53, $acst_grp_cd5, value);
	}


	/**
	 * AR customer classification name 5 売掛先分類名５.<p>
	 *
	 */
	public String acst_grp_nm5() {
		return getConstString(offset + 54, $acst_grp_nm5);
	}

	/**
	 * AR customer classification name 5 売掛先分類名５.<p>
	 *
	 */
	public void acst_grp_nm5(String value) {
		setConstString(offset + 54, $acst_grp_nm5, value);
	}


	/**
	 * AR customer classification cd. 6 売掛先分類ＣＤ６.<p>
	 *
	 */
	public String acst_grp_cd6() {
		return getConstString(offset + 55, $acst_grp_cd6);
	}

	/**
	 * AR customer classification cd. 6 売掛先分類ＣＤ６.<p>
	 *
	 */
	public void acst_grp_cd6(String value) {
		setConstString(offset + 55, $acst_grp_cd6, value);
	}


	/**
	 * AR customer classification name 6 売掛先分類名６.<p>
	 *
	 */
	public String acst_grp_nm6() {
		return getConstString(offset + 56, $acst_grp_nm6);
	}

	/**
	 * AR customer classification name 6 売掛先分類名６.<p>
	 *
	 */
	public void acst_grp_nm6(String value) {
		setConstString(offset + 56, $acst_grp_nm6, value);
	}


	/**
	 * AR customer classification cd. 7 売掛先分類ＣＤ７.<p>
	 *
	 */
	public String acst_grp_cd7() {
		return getConstString(offset + 57, $acst_grp_cd7);
	}

	/**
	 * AR customer classification cd. 7 売掛先分類ＣＤ７.<p>
	 *
	 */
	public void acst_grp_cd7(String value) {
		setConstString(offset + 57, $acst_grp_cd7, value);
	}


	/**
	 * AR customer classification name 7 売掛先分類名７.<p>
	 *
	 */
	public String acst_grp_nm7() {
		return getConstString(offset + 58, $acst_grp_nm7);
	}

	/**
	 * AR customer classification name 7 売掛先分類名７.<p>
	 *
	 */
	public void acst_grp_nm7(String value) {
		setConstString(offset + 58, $acst_grp_nm7, value);
	}


	/**
	 * AR customer classification cd. 8 売掛先分類ＣＤ８.<p>
	 *
	 */
	public String acst_grp_cd8() {
		return getConstString(offset + 59, $acst_grp_cd8);
	}

	/**
	 * AR customer classification cd. 8 売掛先分類ＣＤ８.<p>
	 *
	 */
	public void acst_grp_cd8(String value) {
		setConstString(offset + 59, $acst_grp_cd8, value);
	}


	/**
	 * AR customer classification name 8 売掛先分類名８.<p>
	 *
	 */
	public String acst_grp_nm8() {
		return getConstString(offset + 60, $acst_grp_nm8);
	}

	/**
	 * AR customer classification name 8 売掛先分類名８.<p>
	 *
	 */
	public void acst_grp_nm8(String value) {
		setConstString(offset + 60, $acst_grp_nm8, value);
	}


	/**
	 * AR customer classification cd. 9 売掛先分類ＣＤ９.<p>
	 *
	 */
	public String acst_grp_cd9() {
		return getConstString(offset + 61, $acst_grp_cd9);
	}

	/**
	 * AR customer classification cd. 9 売掛先分類ＣＤ９.<p>
	 *
	 */
	public void acst_grp_cd9(String value) {
		setConstString(offset + 61, $acst_grp_cd9, value);
	}


	/**
	 * AR customer classification name 9 売掛先分類名９.<p>
	 *
	 */
	public String acst_grp_nm9() {
		return getConstString(offset + 62, $acst_grp_nm9);
	}

	/**
	 * AR customer classification name 9 売掛先分類名９.<p>
	 *
	 */
	public void acst_grp_nm9(String value) {
		setConstString(offset + 62, $acst_grp_nm9, value);
	}


	/**
	 * AR customer classification cd. 10 売掛先分類ＣＤ１０.<p>
	 *
	 */
	public String acst_grp_cd10() {
		return getConstString(offset + 63, $acst_grp_cd10);
	}

	/**
	 * AR customer classification cd. 10 売掛先分類ＣＤ１０.<p>
	 *
	 */
	public void acst_grp_cd10(String value) {
		setConstString(offset + 63, $acst_grp_cd10, value);
	}


	/**
	 * AR customer classification name 10 売掛先分類名１０.<p>
	 *
	 */
	public String acst_grp_nm10() {
		return getConstString(offset + 64, $acst_grp_nm10);
	}

	/**
	 * AR customer classification name 10 売掛先分類名１０.<p>
	 *
	 */
	public void acst_grp_nm10(String value) {
		setConstString(offset + 64, $acst_grp_nm10, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 65, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 65, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 66, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 66, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 67, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 67, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 68, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 68, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 69, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 69, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 70, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 70, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 71, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 71, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 72, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 72, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 73, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 73, $upd_func_nm, value);
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
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 75, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 75, $upd_srv_req_no, value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		if ($acst_grp_cd1.equalsIgnoreCase(name)) {
			return acst_grp_cd1();
		}
		if ($acst_grp_nm1.equalsIgnoreCase(name)) {
			return acst_grp_nm1();
		}
		if ($acst_grp_cd2.equalsIgnoreCase(name)) {
			return acst_grp_cd2();
		}
		if ($acst_grp_nm2.equalsIgnoreCase(name)) {
			return acst_grp_nm2();
		}
		if ($acst_grp_cd3.equalsIgnoreCase(name)) {
			return acst_grp_cd3();
		}
		if ($acst_grp_nm3.equalsIgnoreCase(name)) {
			return acst_grp_nm3();
		}
		if ($acst_grp_cd4.equalsIgnoreCase(name)) {
			return acst_grp_cd4();
		}
		if ($acst_grp_nm4.equalsIgnoreCase(name)) {
			return acst_grp_nm4();
		}
		if ($acst_grp_cd5.equalsIgnoreCase(name)) {
			return acst_grp_cd5();
		}
		if ($acst_grp_nm5.equalsIgnoreCase(name)) {
			return acst_grp_nm5();
		}
		if ($acst_grp_cd6.equalsIgnoreCase(name)) {
			return acst_grp_cd6();
		}
		if ($acst_grp_nm6.equalsIgnoreCase(name)) {
			return acst_grp_nm6();
		}
		if ($acst_grp_cd7.equalsIgnoreCase(name)) {
			return acst_grp_cd7();
		}
		if ($acst_grp_nm7.equalsIgnoreCase(name)) {
			return acst_grp_nm7();
		}
		if ($acst_grp_cd8.equalsIgnoreCase(name)) {
			return acst_grp_cd8();
		}
		if ($acst_grp_nm8.equalsIgnoreCase(name)) {
			return acst_grp_nm8();
		}
		if ($acst_grp_cd9.equalsIgnoreCase(name)) {
			return acst_grp_cd9();
		}
		if ($acst_grp_nm9.equalsIgnoreCase(name)) {
			return acst_grp_nm9();
		}
		if ($acst_grp_cd10.equalsIgnoreCase(name)) {
			return acst_grp_cd10();
		}
		if ($acst_grp_nm10.equalsIgnoreCase(name)) {
			return acst_grp_nm10();
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
		if ($init_bal.equalsIgnoreCase(name)) {
			return init_bal();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			return cl_day();
		}
		if ($bef_cl_sls_amt.equalsIgnoreCase(name)) {
			return bef_cl_sls_amt();
		}
		if ($aft_cl_sls_amt.equalsIgnoreCase(name)) {
			return aft_cl_sls_amt();
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			return end_bal();
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			return not_appl_note();
		}
		if ($mly_not_appl_note.equalsIgnoreCase(name)) {
			return mly_not_appl_note();
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			return cash_amt();
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			return note_amt();
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			return xfr_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			return base_amt_dec_place();
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			return base_cur_init_bal();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_bef_cl_sls_amt.equalsIgnoreCase(name)) {
			return base_cur_bef_cl_sls_amt();
		}
		if ($base_cur_aft_cl_sls_amt.equalsIgnoreCase(name)) {
			return base_cur_aft_cl_sls_amt();
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			return base_cur_end_bal();
		}
		if ($base_cur_not_appl_note.equalsIgnoreCase(name)) {
			return base_cur_not_appl_note();
		}
		if ($base_cur_mly_not_appl_note.equalsIgnoreCase(name)) {
			return base_cur_mly_not_appl_note();
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			return base_cur_cash_amt();
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			return base_cur_note_amt();
		}
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			return base_cur_xfr_amt();
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			return base_cur_setoff_amt();
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			return base_cur_sw_amt();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		if ($acst_grp_cd1.equalsIgnoreCase(name)) {
			return acst_grp_cd1();
		}
		if ($acst_grp_nm1.equalsIgnoreCase(name)) {
			return acst_grp_nm1();
		}
		if ($acst_grp_cd2.equalsIgnoreCase(name)) {
			return acst_grp_cd2();
		}
		if ($acst_grp_nm2.equalsIgnoreCase(name)) {
			return acst_grp_nm2();
		}
		if ($acst_grp_cd3.equalsIgnoreCase(name)) {
			return acst_grp_cd3();
		}
		if ($acst_grp_nm3.equalsIgnoreCase(name)) {
			return acst_grp_nm3();
		}
		if ($acst_grp_cd4.equalsIgnoreCase(name)) {
			return acst_grp_cd4();
		}
		if ($acst_grp_nm4.equalsIgnoreCase(name)) {
			return acst_grp_nm4();
		}
		if ($acst_grp_cd5.equalsIgnoreCase(name)) {
			return acst_grp_cd5();
		}
		if ($acst_grp_nm5.equalsIgnoreCase(name)) {
			return acst_grp_nm5();
		}
		if ($acst_grp_cd6.equalsIgnoreCase(name)) {
			return acst_grp_cd6();
		}
		if ($acst_grp_nm6.equalsIgnoreCase(name)) {
			return acst_grp_nm6();
		}
		if ($acst_grp_cd7.equalsIgnoreCase(name)) {
			return acst_grp_cd7();
		}
		if ($acst_grp_nm7.equalsIgnoreCase(name)) {
			return acst_grp_nm7();
		}
		if ($acst_grp_cd8.equalsIgnoreCase(name)) {
			return acst_grp_cd8();
		}
		if ($acst_grp_nm8.equalsIgnoreCase(name)) {
			return acst_grp_nm8();
		}
		if ($acst_grp_cd9.equalsIgnoreCase(name)) {
			return acst_grp_cd9();
		}
		if ($acst_grp_nm9.equalsIgnoreCase(name)) {
			return acst_grp_nm9();
		}
		if ($acst_grp_cd10.equalsIgnoreCase(name)) {
			return acst_grp_cd10();
		}
		if ($acst_grp_nm10.equalsIgnoreCase(name)) {
			return acst_grp_nm10();
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
		if ($init_bal.equalsIgnoreCase(name)) {
			return init_bal();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			return cl_day();
		}
		if ($bef_cl_sls_amt.equalsIgnoreCase(name)) {
			return bef_cl_sls_amt();
		}
		if ($aft_cl_sls_amt.equalsIgnoreCase(name)) {
			return aft_cl_sls_amt();
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			return end_bal();
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			return not_appl_note();
		}
		if ($mly_not_appl_note.equalsIgnoreCase(name)) {
			return mly_not_appl_note();
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			return cash_amt();
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			return note_amt();
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			return xfr_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			return base_amt_dec_place();
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			return base_cur_init_bal();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_bef_cl_sls_amt.equalsIgnoreCase(name)) {
			return base_cur_bef_cl_sls_amt();
		}
		if ($base_cur_aft_cl_sls_amt.equalsIgnoreCase(name)) {
			return base_cur_aft_cl_sls_amt();
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			return base_cur_end_bal();
		}
		if ($base_cur_not_appl_note.equalsIgnoreCase(name)) {
			return base_cur_not_appl_note();
		}
		if ($base_cur_mly_not_appl_note.equalsIgnoreCase(name)) {
			return base_cur_mly_not_appl_note();
		}
		if ($base_cur_cash_amt.equalsIgnoreCase(name)) {
			return base_cur_cash_amt();
		}
		if ($base_cur_note_amt.equalsIgnoreCase(name)) {
			return base_cur_note_amt();
		}
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			return base_cur_xfr_amt();
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			return base_cur_setoff_amt();
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			return base_cur_sw_amt();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($acst_grp_cd1.equalsIgnoreCase(name)) {
			acst_grp_cd1(value);
			return;
		}
		if ($acst_grp_nm1.equalsIgnoreCase(name)) {
			acst_grp_nm1(value);
			return;
		}
		if ($acst_grp_cd2.equalsIgnoreCase(name)) {
			acst_grp_cd2(value);
			return;
		}
		if ($acst_grp_nm2.equalsIgnoreCase(name)) {
			acst_grp_nm2(value);
			return;
		}
		if ($acst_grp_cd3.equalsIgnoreCase(name)) {
			acst_grp_cd3(value);
			return;
		}
		if ($acst_grp_nm3.equalsIgnoreCase(name)) {
			acst_grp_nm3(value);
			return;
		}
		if ($acst_grp_cd4.equalsIgnoreCase(name)) {
			acst_grp_cd4(value);
			return;
		}
		if ($acst_grp_nm4.equalsIgnoreCase(name)) {
			acst_grp_nm4(value);
			return;
		}
		if ($acst_grp_cd5.equalsIgnoreCase(name)) {
			acst_grp_cd5(value);
			return;
		}
		if ($acst_grp_nm5.equalsIgnoreCase(name)) {
			acst_grp_nm5(value);
			return;
		}
		if ($acst_grp_cd6.equalsIgnoreCase(name)) {
			acst_grp_cd6(value);
			return;
		}
		if ($acst_grp_nm6.equalsIgnoreCase(name)) {
			acst_grp_nm6(value);
			return;
		}
		if ($acst_grp_cd7.equalsIgnoreCase(name)) {
			acst_grp_cd7(value);
			return;
		}
		if ($acst_grp_nm7.equalsIgnoreCase(name)) {
			acst_grp_nm7(value);
			return;
		}
		if ($acst_grp_cd8.equalsIgnoreCase(name)) {
			acst_grp_cd8(value);
			return;
		}
		if ($acst_grp_nm8.equalsIgnoreCase(name)) {
			acst_grp_nm8(value);
			return;
		}
		if ($acst_grp_cd9.equalsIgnoreCase(name)) {
			acst_grp_cd9(value);
			return;
		}
		if ($acst_grp_nm9.equalsIgnoreCase(name)) {
			acst_grp_nm9(value);
			return;
		}
		if ($acst_grp_cd10.equalsIgnoreCase(name)) {
			acst_grp_cd10(value);
			return;
		}
		if ($acst_grp_nm10.equalsIgnoreCase(name)) {
			acst_grp_nm10(value);
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
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			cl_day(value);
			return;
		}
		if ($bef_cl_sls_amt.equalsIgnoreCase(name)) {
			bef_cl_sls_amt(value);
			return;
		}
		if ($aft_cl_sls_amt.equalsIgnoreCase(name)) {
			aft_cl_sls_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($mly_not_appl_note.equalsIgnoreCase(name)) {
			mly_not_appl_note(value);
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
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
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
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_bef_cl_sls_amt.equalsIgnoreCase(name)) {
			base_cur_bef_cl_sls_amt(value);
			return;
		}
		if ($base_cur_aft_cl_sls_amt.equalsIgnoreCase(name)) {
			base_cur_aft_cl_sls_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($base_cur_not_appl_note.equalsIgnoreCase(name)) {
			base_cur_not_appl_note(value);
			return;
		}
		if ($base_cur_mly_not_appl_note.equalsIgnoreCase(name)) {
			base_cur_mly_not_appl_note(value);
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
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			base_cur_xfr_amt(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			cl_day(value);
			return;
		}
		if ($bef_cl_sls_amt.equalsIgnoreCase(name)) {
			bef_cl_sls_amt(value);
			return;
		}
		if ($aft_cl_sls_amt.equalsIgnoreCase(name)) {
			aft_cl_sls_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($mly_not_appl_note.equalsIgnoreCase(name)) {
			mly_not_appl_note(value);
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
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
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
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_bef_cl_sls_amt.equalsIgnoreCase(name)) {
			base_cur_bef_cl_sls_amt(value);
			return;
		}
		if ($base_cur_aft_cl_sls_amt.equalsIgnoreCase(name)) {
			base_cur_aft_cl_sls_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($base_cur_not_appl_note.equalsIgnoreCase(name)) {
			base_cur_not_appl_note(value);
			return;
		}
		if ($base_cur_mly_not_appl_note.equalsIgnoreCase(name)) {
			base_cur_mly_not_appl_note(value);
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
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			base_cur_xfr_amt(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			cl_day(value);
			return;
		}
		if ($bef_cl_sls_amt.equalsIgnoreCase(name)) {
			bef_cl_sls_amt(value);
			return;
		}
		if ($aft_cl_sls_amt.equalsIgnoreCase(name)) {
			aft_cl_sls_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($mly_not_appl_note.equalsIgnoreCase(name)) {
			mly_not_appl_note(value);
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
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
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
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_bef_cl_sls_amt.equalsIgnoreCase(name)) {
			base_cur_bef_cl_sls_amt(value);
			return;
		}
		if ($base_cur_aft_cl_sls_amt.equalsIgnoreCase(name)) {
			base_cur_aft_cl_sls_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($base_cur_not_appl_note.equalsIgnoreCase(name)) {
			base_cur_not_appl_note(value);
			return;
		}
		if ($base_cur_mly_not_appl_note.equalsIgnoreCase(name)) {
			base_cur_mly_not_appl_note(value);
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
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			base_cur_xfr_amt(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			cl_day(value);
			return;
		}
		if ($bef_cl_sls_amt.equalsIgnoreCase(name)) {
			bef_cl_sls_amt(value);
			return;
		}
		if ($aft_cl_sls_amt.equalsIgnoreCase(name)) {
			aft_cl_sls_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($mly_not_appl_note.equalsIgnoreCase(name)) {
			mly_not_appl_note(value);
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
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
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
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_bef_cl_sls_amt.equalsIgnoreCase(name)) {
			base_cur_bef_cl_sls_amt(value);
			return;
		}
		if ($base_cur_aft_cl_sls_amt.equalsIgnoreCase(name)) {
			base_cur_aft_cl_sls_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($base_cur_not_appl_note.equalsIgnoreCase(name)) {
			base_cur_not_appl_note(value);
			return;
		}
		if ($base_cur_mly_not_appl_note.equalsIgnoreCase(name)) {
			base_cur_mly_not_appl_note(value);
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
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			base_cur_xfr_amt(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			cl_day(value);
			return;
		}
		if ($bef_cl_sls_amt.equalsIgnoreCase(name)) {
			bef_cl_sls_amt(value);
			return;
		}
		if ($aft_cl_sls_amt.equalsIgnoreCase(name)) {
			aft_cl_sls_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($mly_not_appl_note.equalsIgnoreCase(name)) {
			mly_not_appl_note(value);
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
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
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
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_bef_cl_sls_amt.equalsIgnoreCase(name)) {
			base_cur_bef_cl_sls_amt(value);
			return;
		}
		if ($base_cur_aft_cl_sls_amt.equalsIgnoreCase(name)) {
			base_cur_aft_cl_sls_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($base_cur_not_appl_note.equalsIgnoreCase(name)) {
			base_cur_not_appl_note(value);
			return;
		}
		if ($base_cur_mly_not_appl_note.equalsIgnoreCase(name)) {
			base_cur_mly_not_appl_note(value);
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
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			base_cur_xfr_amt(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($acst_grp_cd1.equalsIgnoreCase(name)) {
			acst_grp_cd1(value);
			return;
		}
		if ($acst_grp_nm1.equalsIgnoreCase(name)) {
			acst_grp_nm1(value);
			return;
		}
		if ($acst_grp_cd2.equalsIgnoreCase(name)) {
			acst_grp_cd2(value);
			return;
		}
		if ($acst_grp_nm2.equalsIgnoreCase(name)) {
			acst_grp_nm2(value);
			return;
		}
		if ($acst_grp_cd3.equalsIgnoreCase(name)) {
			acst_grp_cd3(value);
			return;
		}
		if ($acst_grp_nm3.equalsIgnoreCase(name)) {
			acst_grp_nm3(value);
			return;
		}
		if ($acst_grp_cd4.equalsIgnoreCase(name)) {
			acst_grp_cd4(value);
			return;
		}
		if ($acst_grp_nm4.equalsIgnoreCase(name)) {
			acst_grp_nm4(value);
			return;
		}
		if ($acst_grp_cd5.equalsIgnoreCase(name)) {
			acst_grp_cd5(value);
			return;
		}
		if ($acst_grp_nm5.equalsIgnoreCase(name)) {
			acst_grp_nm5(value);
			return;
		}
		if ($acst_grp_cd6.equalsIgnoreCase(name)) {
			acst_grp_cd6(value);
			return;
		}
		if ($acst_grp_nm6.equalsIgnoreCase(name)) {
			acst_grp_nm6(value);
			return;
		}
		if ($acst_grp_cd7.equalsIgnoreCase(name)) {
			acst_grp_cd7(value);
			return;
		}
		if ($acst_grp_nm7.equalsIgnoreCase(name)) {
			acst_grp_nm7(value);
			return;
		}
		if ($acst_grp_cd8.equalsIgnoreCase(name)) {
			acst_grp_cd8(value);
			return;
		}
		if ($acst_grp_nm8.equalsIgnoreCase(name)) {
			acst_grp_nm8(value);
			return;
		}
		if ($acst_grp_cd9.equalsIgnoreCase(name)) {
			acst_grp_cd9(value);
			return;
		}
		if ($acst_grp_nm9.equalsIgnoreCase(name)) {
			acst_grp_nm9(value);
			return;
		}
		if ($acst_grp_cd10.equalsIgnoreCase(name)) {
			acst_grp_cd10(value);
			return;
		}
		if ($acst_grp_nm10.equalsIgnoreCase(name)) {
			acst_grp_nm10(value);
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
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			cl_day(value);
			return;
		}
		if ($bef_cl_sls_amt.equalsIgnoreCase(name)) {
			bef_cl_sls_amt(value);
			return;
		}
		if ($aft_cl_sls_amt.equalsIgnoreCase(name)) {
			aft_cl_sls_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($mly_not_appl_note.equalsIgnoreCase(name)) {
			mly_not_appl_note(value);
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
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
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
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_bef_cl_sls_amt.equalsIgnoreCase(name)) {
			base_cur_bef_cl_sls_amt(value);
			return;
		}
		if ($base_cur_aft_cl_sls_amt.equalsIgnoreCase(name)) {
			base_cur_aft_cl_sls_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($base_cur_not_appl_note.equalsIgnoreCase(name)) {
			base_cur_not_appl_note(value);
			return;
		}
		if ($base_cur_mly_not_appl_note.equalsIgnoreCase(name)) {
			base_cur_mly_not_appl_note(value);
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
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			base_cur_xfr_amt(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			cl_day(value);
			return;
		}
		if ($bef_cl_sls_amt.equalsIgnoreCase(name)) {
			bef_cl_sls_amt(value);
			return;
		}
		if ($aft_cl_sls_amt.equalsIgnoreCase(name)) {
			aft_cl_sls_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($mly_not_appl_note.equalsIgnoreCase(name)) {
			mly_not_appl_note(value);
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
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
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
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_bef_cl_sls_amt.equalsIgnoreCase(name)) {
			base_cur_bef_cl_sls_amt(value);
			return;
		}
		if ($base_cur_aft_cl_sls_amt.equalsIgnoreCase(name)) {
			base_cur_aft_cl_sls_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($base_cur_not_appl_note.equalsIgnoreCase(name)) {
			base_cur_not_appl_note(value);
			return;
		}
		if ($base_cur_mly_not_appl_note.equalsIgnoreCase(name)) {
			base_cur_mly_not_appl_note(value);
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
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			base_cur_xfr_amt(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			cl_day(value);
			return;
		}
		if ($bef_cl_sls_amt.equalsIgnoreCase(name)) {
			bef_cl_sls_amt(value);
			return;
		}
		if ($aft_cl_sls_amt.equalsIgnoreCase(name)) {
			aft_cl_sls_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($mly_not_appl_note.equalsIgnoreCase(name)) {
			mly_not_appl_note(value);
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
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
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
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_bef_cl_sls_amt.equalsIgnoreCase(name)) {
			base_cur_bef_cl_sls_amt(value);
			return;
		}
		if ($base_cur_aft_cl_sls_amt.equalsIgnoreCase(name)) {
			base_cur_aft_cl_sls_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($base_cur_not_appl_note.equalsIgnoreCase(name)) {
			base_cur_not_appl_note(value);
			return;
		}
		if ($base_cur_mly_not_appl_note.equalsIgnoreCase(name)) {
			base_cur_mly_not_appl_note(value);
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
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			base_cur_xfr_amt(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			cl_day(value);
			return;
		}
		if ($bef_cl_sls_amt.equalsIgnoreCase(name)) {
			bef_cl_sls_amt(value);
			return;
		}
		if ($aft_cl_sls_amt.equalsIgnoreCase(name)) {
			aft_cl_sls_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($mly_not_appl_note.equalsIgnoreCase(name)) {
			mly_not_appl_note(value);
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
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
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
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_bef_cl_sls_amt.equalsIgnoreCase(name)) {
			base_cur_bef_cl_sls_amt(value);
			return;
		}
		if ($base_cur_aft_cl_sls_amt.equalsIgnoreCase(name)) {
			base_cur_aft_cl_sls_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($base_cur_not_appl_note.equalsIgnoreCase(name)) {
			base_cur_not_appl_note(value);
			return;
		}
		if ($base_cur_mly_not_appl_note.equalsIgnoreCase(name)) {
			base_cur_mly_not_appl_note(value);
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
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			base_cur_xfr_amt(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cl_day.equalsIgnoreCase(name)) {
			cl_day(value);
			return;
		}
		if ($bef_cl_sls_amt.equalsIgnoreCase(name)) {
			bef_cl_sls_amt(value);
			return;
		}
		if ($aft_cl_sls_amt.equalsIgnoreCase(name)) {
			aft_cl_sls_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($mly_not_appl_note.equalsIgnoreCase(name)) {
			mly_not_appl_note(value);
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
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
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
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_bef_cl_sls_amt.equalsIgnoreCase(name)) {
			base_cur_bef_cl_sls_amt(value);
			return;
		}
		if ($base_cur_aft_cl_sls_amt.equalsIgnoreCase(name)) {
			base_cur_aft_cl_sls_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($base_cur_not_appl_note.equalsIgnoreCase(name)) {
			base_cur_not_appl_note(value);
			return;
		}
		if ($base_cur_mly_not_appl_note.equalsIgnoreCase(name)) {
			base_cur_mly_not_appl_note(value);
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
		if ($base_cur_xfr_amt.equalsIgnoreCase(name)) {
			base_cur_xfr_amt(value);
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



}

