package mcframe.serverMSBH.MSBHL0050;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Search mode 検索モード.<p>
	 *
	 */
	public static final String $mode = "mode";
	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public static final String $opn_flg = "opn_flg";
	/**
	 * Preliminary approval 一次承認済.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Final approval 最終承認済.<p>
	 *
	 */
	public static final String $acpt_flg = "acpt_flg";
	/**
	 * Reject 却下.<p>
	 *
	 */
	public static final String $rjct_flg = "rjct_flg";
	/**
	 * Denied 否認.<p>
	 *
	 */
	public static final String $last_rjct_flg = "last_rjct_flg";
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public static final String $excld_flg = "excld_flg";
	/**
	 * Scheduled/Actual payment date FROM 支払予定日／実績日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $pay_schd_act_dt_fr = "pay_schd_act_dt_fr";
	/**
	 * Scheduled/Actual payment date TO 支払予定日／実績日ＴＯ.<p>
	 *
	 */
	public static final String $pay_schd_act_dt_to = "pay_schd_act_dt_to";
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public static final String $bsppl_nm = "bsppl_nm";
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd = "bsppl_dpt_cd";
	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public static final String $bsppl_dpt_nm = "bsppl_dpt_nm";
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
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public static final String $pay_chk_no = "pay_chk_no";
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
	 * Payment schedule table details 支払予定表備考.<p>
	 *
	 */
	public static final String $pay_schd_print_rmrks = "pay_schd_print_rmrks";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
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
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
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
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public static final String $psppl_cd = "psppl_cd";
	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public static final String $psppl_nm = "psppl_nm";
	/**
	 * Display breakdown 内訳表示.<p>
	 *
	 */
	public static final String $dtl_flg = "dtl_flg";
	/**
	 * Include paid 支払済含む.<p>
	 *
	 */
	public static final String $inc_appl_flg = "inc_appl_flg";
	/**
	 * Include fee 手数料含む.<p>
	 *
	 */
	public static final String $inc_com_paid_flg = "inc_com_paid_flg";
	/**
	 * Delay check base date 遅延確認基準日.<p>
	 *
	 */
	public static final String $rfrnc_dt = "rfrnc_dt";
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd_flg = "bsppl_dpt_cd_flg";
	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public static final String $bsppl_dpt_nm_flg = "bsppl_dpt_nm_flg";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd_flg = "wg_cd_flg";
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_cd_flg = "bsppl_cd_flg";
	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public static final String $ap_typ_flg = "ap_typ_flg";
	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public static final String $pay_schd_dt_flg = "pay_schd_dt_flg";
	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public static final String $ap_sttl_cd_flg = "ap_sttl_cd_flg";
	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public static final String $ap_sttl_typ_flg = "ap_sttl_typ_flg";
	/**
	 * Scheduled payee closing year and month 支払予定管理先締年月.<p>
	 *
	 */
	public static final String $bsppl_cl_ym_flg = "bsppl_cl_ym_flg";
	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public static final String $bsppl_cl_day_flg = "bsppl_cl_day_flg";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd_flg = "trd_cur_cd_flg";
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public static final String $pay_chk_no_flg = "pay_chk_no_flg";
	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public static final String $pay_schd_no_flg = "pay_schd_no_flg";
	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no_flg = "rcpt_iv_no_flg";
	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no_flg = "rcpt_iv_mng_no_flg";
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no_flg = "purc_act_no_flg";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no_flg = "wrk_no_flg";
	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public static final String $psppl_cd_flg = "psppl_cd_flg";
	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public static final String $pay_dpt_cd_flg = "pay_dpt_cd_flg";
	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public static final String $pay_dpt_nm_flg = "pay_dpt_nm_flg";
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public static final String $asppl_cd_flg = "asppl_cd_flg";
	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public static final String $pay_sts_typ_flg = "pay_sts_typ_flg";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd_flg = "ap_dpt_cd_flg";
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public static final String $ap_dpt_nm_flg = "ap_dpt_nm_flg";
	/**
	 * Payee account 支払先口座.<p>
	 *
	 */
	public static final String $pay_bank_ac_cd_flg = "pay_bank_ac_cd_flg";
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_cd_flg = "bank_ac_cd_flg";
	/**
	 * Offset info. 相殺情報.<p>
	 *
	 */
	public static final String $setoff_info_flg = "setoff_info_flg";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate_flg = "xrate_flg";
	/**
	 * Fee tax 手数料税.<p>
	 *
	 */
	public static final String $com_paid_tax_cd_flg = "com_paid_tax_cd_flg";
	/**
	 * Counterpart invoice No. 相手先請求書ＮＯ.<p>
	 *
	 */
	public static final String $rcv_bill_no_flg = "rcv_bill_no_flg";
	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public static final String $adv_pay_act_no_flg = "adv_pay_act_no_flg";
	/**
	 * Note info. 手形情報.<p>
	 *
	 */
	public static final String $note_info_flg = "note_info_flg";
	/**
	 * Remarks/Spare 備考・予備.<p>
	 *
	 */
	public static final String $rmrks_flg = "rmrks_flg";
	/**
	 * Scheduled payee classification 1 search target 支払予定管理先分類１検索対象.<p>
	 *
	 */
	public static final String $bsppl_grp_flg1 = "bsppl_grp_flg1";
	/**
	 * Scheduled payee classification cd. 1 支払予定管理先分類ＣＤ１.<p>
	 *
	 */
	public static final String $bsppl_grp_cd1 = "bsppl_grp_cd1";
	/**
	 * Scheduled payee classification name 1 支払予定管理先分類名１.<p>
	 *
	 */
	public static final String $bsppl_grp_nm1 = "bsppl_grp_nm1";
	/**
	 * Scheduled payee classification 2 search target 支払予定管理先分類２検索対象.<p>
	 *
	 */
	public static final String $bsppl_grp_flg2 = "bsppl_grp_flg2";
	/**
	 * Scheduled payee classification cd. 2 支払予定管理先分類ＣＤ２.<p>
	 *
	 */
	public static final String $bsppl_grp_cd2 = "bsppl_grp_cd2";
	/**
	 * Scheduled payee classification name 2 支払予定管理先分類名２.<p>
	 *
	 */
	public static final String $bsppl_grp_nm2 = "bsppl_grp_nm2";
	/**
	 * Scheduled payee classification 3 search target 支払予定管理先分類３検索対象.<p>
	 *
	 */
	public static final String $bsppl_grp_flg3 = "bsppl_grp_flg3";
	/**
	 * Scheduled payee classification cd. 3 支払予定管理先分類ＣＤ３.<p>
	 *
	 */
	public static final String $bsppl_grp_cd3 = "bsppl_grp_cd3";
	/**
	 * Scheduled payee classification name 3 支払予定管理先分類名３.<p>
	 *
	 */
	public static final String $bsppl_grp_nm3 = "bsppl_grp_nm3";
	/**
	 * Scheduled payee classification 4 search target 支払予定管理先分類４検索対象.<p>
	 *
	 */
	public static final String $bsppl_grp_flg4 = "bsppl_grp_flg4";
	/**
	 * Scheduled payee classification cd. 4 支払予定管理先分類ＣＤ４.<p>
	 *
	 */
	public static final String $bsppl_grp_cd4 = "bsppl_grp_cd4";
	/**
	 * Scheduled payee classification name 4 支払予定管理先分類名４.<p>
	 *
	 */
	public static final String $bsppl_grp_nm4 = "bsppl_grp_nm4";
	/**
	 * Scheduled payee classification 5 search target 支払予定管理先分類５検索対象.<p>
	 *
	 */
	public static final String $bsppl_grp_flg5 = "bsppl_grp_flg5";
	/**
	 * Scheduled payee classification cd. 5 支払予定管理先分類ＣＤ５.<p>
	 *
	 */
	public static final String $bsppl_grp_cd5 = "bsppl_grp_cd5";
	/**
	 * Scheduled payee classification name 5 支払予定管理先分類名５.<p>
	 *
	 */
	public static final String $bsppl_grp_nm5 = "bsppl_grp_nm5";
	/**
	 * Scheduled payee classification 6 search target 支払予定管理先分類６検索対象.<p>
	 *
	 */
	public static final String $bsppl_grp_flg6 = "bsppl_grp_flg6";
	/**
	 * Scheduled payee classification cd. 6 支払予定管理先分類ＣＤ６.<p>
	 *
	 */
	public static final String $bsppl_grp_cd6 = "bsppl_grp_cd6";
	/**
	 * Scheduled payee classification name 6 支払予定管理先分類名６.<p>
	 *
	 */
	public static final String $bsppl_grp_nm6 = "bsppl_grp_nm6";
	/**
	 * Scheduled payee classification 7 search target 支払予定管理先分類７検索対象.<p>
	 *
	 */
	public static final String $bsppl_grp_flg7 = "bsppl_grp_flg7";
	/**
	 * Scheduled payee classification cd. 7 支払予定管理先分類ＣＤ７.<p>
	 *
	 */
	public static final String $bsppl_grp_cd7 = "bsppl_grp_cd7";
	/**
	 * Scheduled payee classification name 7 支払予定管理先分類名７.<p>
	 *
	 */
	public static final String $bsppl_grp_nm7 = "bsppl_grp_nm7";
	/**
	 * Scheduled payee classification 8 search target 支払予定管理先分類８検索対象.<p>
	 *
	 */
	public static final String $bsppl_grp_flg8 = "bsppl_grp_flg8";
	/**
	 * Scheduled payee classification cd. 8 支払予定管理先分類ＣＤ８.<p>
	 *
	 */
	public static final String $bsppl_grp_cd8 = "bsppl_grp_cd8";
	/**
	 * Scheduled payee classification name 8 支払予定管理先分類名８.<p>
	 *
	 */
	public static final String $bsppl_grp_nm8 = "bsppl_grp_nm8";
	/**
	 * Scheduled payee classification 9 search target 支払予定管理先分類９検索対象.<p>
	 *
	 */
	public static final String $bsppl_grp_flg9 = "bsppl_grp_flg9";
	/**
	 * Scheduled payee classification cd. 9 支払予定管理先分類ＣＤ９.<p>
	 *
	 */
	public static final String $bsppl_grp_cd9 = "bsppl_grp_cd9";
	/**
	 * Scheduled payee classification name 9 支払予定管理先分類名９.<p>
	 *
	 */
	public static final String $bsppl_grp_nm9 = "bsppl_grp_nm9";
	/**
	 * Scheduled payee classification 10 search target 支払予定管理先分類１０検索対象.<p>
	 *
	 */
	public static final String $bsppl_grp_flg10 = "bsppl_grp_flg10";
	/**
	 * Scheduled payee classification cd. 10 支払予定管理先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $bsppl_grp_cd10 = "bsppl_grp_cd10";
	/**
	 * Scheduled payee classification name 10 支払予定管理先分類名１０.<p>
	 *
	 */
	public static final String $bsppl_grp_nm10 = "bsppl_grp_nm10";
	/**
	 * Payee classification 1 search target 支払先分類１検索対象.<p>
	 *
	 */
	public static final String $psppl_grp_flg1 = "psppl_grp_flg1";
	/**
	 * Payee classification cd. 1 支払先分類ＣＤ１.<p>
	 *
	 */
	public static final String $psppl_grp_cd1 = "psppl_grp_cd1";
	/**
	 * Payee classification name 1 支払先分類名１.<p>
	 *
	 */
	public static final String $psppl_grp_nm1 = "psppl_grp_nm1";
	/**
	 * Payee classification 2 search target 支払先分類２検索対象.<p>
	 *
	 */
	public static final String $psppl_grp_flg2 = "psppl_grp_flg2";
	/**
	 * Payee classification cd. 2 支払先分類ＣＤ２.<p>
	 *
	 */
	public static final String $psppl_grp_cd2 = "psppl_grp_cd2";
	/**
	 * Payee classification name 2 支払先分類名２.<p>
	 *
	 */
	public static final String $psppl_grp_nm2 = "psppl_grp_nm2";
	/**
	 * Payee classification 3 search target 支払先分類３検索対象.<p>
	 *
	 */
	public static final String $psppl_grp_flg3 = "psppl_grp_flg3";
	/**
	 * Payee classification cd. 3 支払先分類ＣＤ３.<p>
	 *
	 */
	public static final String $psppl_grp_cd3 = "psppl_grp_cd3";
	/**
	 * Payee classification name 3 支払先分類名３.<p>
	 *
	 */
	public static final String $psppl_grp_nm3 = "psppl_grp_nm3";
	/**
	 * Payee classification 4 search target 支払先分類４検索対象.<p>
	 *
	 */
	public static final String $psppl_grp_flg4 = "psppl_grp_flg4";
	/**
	 * Payee classification cd. 4 支払先分類ＣＤ４.<p>
	 *
	 */
	public static final String $psppl_grp_cd4 = "psppl_grp_cd4";
	/**
	 * Payee classification name 4 支払先分類名４.<p>
	 *
	 */
	public static final String $psppl_grp_nm4 = "psppl_grp_nm4";
	/**
	 * Payee classification 5 search target 支払先分類５検索対象.<p>
	 *
	 */
	public static final String $psppl_grp_flg5 = "psppl_grp_flg5";
	/**
	 * Payee classification cd. 5 支払先分類ＣＤ５.<p>
	 *
	 */
	public static final String $psppl_grp_cd5 = "psppl_grp_cd5";
	/**
	 * Payee classification name 5 支払先分類名５.<p>
	 *
	 */
	public static final String $psppl_grp_nm5 = "psppl_grp_nm5";
	/**
	 * Payee classification 6 search target 支払先分類６検索対象.<p>
	 *
	 */
	public static final String $psppl_grp_flg6 = "psppl_grp_flg6";
	/**
	 * Payee classification cd. 6 支払先分類ＣＤ６.<p>
	 *
	 */
	public static final String $psppl_grp_cd6 = "psppl_grp_cd6";
	/**
	 * Payee classification name 6 支払先分類名６.<p>
	 *
	 */
	public static final String $psppl_grp_nm6 = "psppl_grp_nm6";
	/**
	 * Payee classification 7 search target 支払先分類７検索対象.<p>
	 *
	 */
	public static final String $psppl_grp_flg7 = "psppl_grp_flg7";
	/**
	 * Payee classification cd. 7 支払先分類ＣＤ７.<p>
	 *
	 */
	public static final String $psppl_grp_cd7 = "psppl_grp_cd7";
	/**
	 * Payee classification name 7 支払先分類名７.<p>
	 *
	 */
	public static final String $psppl_grp_nm7 = "psppl_grp_nm7";
	/**
	 * Payee classification 8 search target 支払先分類８検索対象.<p>
	 *
	 */
	public static final String $psppl_grp_flg8 = "psppl_grp_flg8";
	/**
	 * Payee classification cd. 8 支払先分類ＣＤ８.<p>
	 *
	 */
	public static final String $psppl_grp_cd8 = "psppl_grp_cd8";
	/**
	 * Payee classification name 8 支払先分類名８.<p>
	 *
	 */
	public static final String $psppl_grp_nm8 = "psppl_grp_nm8";
	/**
	 * Payee classification 9 search target 支払先分類９検索対象.<p>
	 *
	 */
	public static final String $psppl_grp_flg9 = "psppl_grp_flg9";
	/**
	 * Payee classification cd. 9 支払先分類ＣＤ９.<p>
	 *
	 */
	public static final String $psppl_grp_cd9 = "psppl_grp_cd9";
	/**
	 * Payee classification name 9 支払先分類名９.<p>
	 *
	 */
	public static final String $psppl_grp_nm9 = "psppl_grp_nm9";
	/**
	 * Payee classification 10 search target 支払先分類１０検索対象.<p>
	 *
	 */
	public static final String $psppl_grp_flg10 = "psppl_grp_flg10";
	/**
	 * Payee classification cd. 10 支払先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $psppl_grp_cd10 = "psppl_grp_cd10";
	/**
	 * Payee classification name 10 支払先分類名１０.<p>
	 *
	 */
	public static final String $psppl_grp_nm10 = "psppl_grp_nm10";


	public static final MCMeta mode_META = createStringMeta($mode);
	public static final MCMeta opn_flg_META = createCommonMeta($opn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acpt_flg_META = createCommonMeta($acpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rjct_flg_META = createCommonMeta($rjct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta last_rjct_flg_META = createCommonMeta($last_rjct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta excld_flg_META = createCommonMeta($excld_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_schd_act_dt_fr_META = createCommonMeta($pay_schd_act_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_act_dt_to_META = createCommonMeta($pay_schd_act_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_nm_META = createCommonMeta($bsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bsppl_dpt_nm_META = createCommonMeta($bsppl_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta pay_chk_no_META = createCommonMeta($pay_chk_no, mcframe.commonMA.meta.MA_META.PAY_CHK_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta pay_schd_print_rmrks_META = createCommonMeta($pay_schd_print_rmrks, mcframe.commonMS.meta.MS_META.PAY_SCHD_PRINT_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PAY_SCHD_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PAY_SCHD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PAY_SCHD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PAY_SCHD_SUB_CHAR3);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta ap_typ_META = createCommonMeta($ap_typ, mcframe.commonMA.meta.MA_META.AP_TYP);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta psppl_nm_META = createCommonMeta($psppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dtl_flg_META = createCommonMeta($dtl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_appl_flg_META = createCommonMeta($inc_appl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_com_paid_flg_META = createCommonMeta($inc_com_paid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rfrnc_dt_META = createCommonMeta($rfrnc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bsppl_dpt_cd_flg_META = createCommonMeta($bsppl_dpt_cd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_dpt_nm_flg_META = createCommonMeta($bsppl_dpt_nm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_cd_flg_META = createCommonMeta($wg_cd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_cd_flg_META = createCommonMeta($bsppl_cd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_typ_flg_META = createCommonMeta($ap_typ_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_schd_dt_flg_META = createCommonMeta($pay_schd_dt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_sttl_cd_flg_META = createCommonMeta($ap_sttl_cd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_sttl_typ_flg_META = createCommonMeta($ap_sttl_typ_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_cl_ym_flg_META = createCommonMeta($bsppl_cl_ym_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_cl_day_flg_META = createCommonMeta($bsppl_cl_day_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_cd_flg_META = createCommonMeta($trd_cur_cd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_chk_no_flg_META = createCommonMeta($pay_chk_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_schd_no_flg_META = createCommonMeta($pay_schd_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_no_flg_META = createCommonMeta($rcpt_iv_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_mng_no_flg_META = createCommonMeta($rcpt_iv_mng_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_act_no_flg_META = createCommonMeta($purc_act_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_no_flg_META = createCommonMeta($wrk_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_cd_flg_META = createCommonMeta($psppl_cd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_dpt_cd_flg_META = createCommonMeta($pay_dpt_cd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_dpt_nm_flg_META = createCommonMeta($pay_dpt_nm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_cd_flg_META = createCommonMeta($asppl_cd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_sts_typ_flg_META = createCommonMeta($pay_sts_typ_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_dpt_cd_flg_META = createCommonMeta($ap_dpt_cd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_dpt_nm_flg_META = createCommonMeta($ap_dpt_nm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_bank_ac_cd_flg_META = createCommonMeta($pay_bank_ac_cd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bank_ac_cd_flg_META = createCommonMeta($bank_ac_cd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta setoff_info_flg_META = createCommonMeta($setoff_info_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_flg_META = createCommonMeta($xrate_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta com_paid_tax_cd_flg_META = createCommonMeta($com_paid_tax_cd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_bill_no_flg_META = createCommonMeta($rcv_bill_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta adv_pay_act_no_flg_META = createCommonMeta($adv_pay_act_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta note_info_flg_META = createCommonMeta($note_info_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rmrks_flg_META = createCommonMeta($rmrks_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_grp_flg1_META = createCommonMeta($bsppl_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_grp_cd1_META = createCommonMeta($bsppl_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bsppl_grp_nm1_META = createCommonMeta($bsppl_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bsppl_grp_flg2_META = createCommonMeta($bsppl_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_grp_cd2_META = createCommonMeta($bsppl_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bsppl_grp_nm2_META = createCommonMeta($bsppl_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bsppl_grp_flg3_META = createCommonMeta($bsppl_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_grp_cd3_META = createCommonMeta($bsppl_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bsppl_grp_nm3_META = createCommonMeta($bsppl_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bsppl_grp_flg4_META = createCommonMeta($bsppl_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_grp_cd4_META = createCommonMeta($bsppl_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bsppl_grp_nm4_META = createCommonMeta($bsppl_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bsppl_grp_flg5_META = createCommonMeta($bsppl_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_grp_cd5_META = createCommonMeta($bsppl_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bsppl_grp_nm5_META = createCommonMeta($bsppl_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bsppl_grp_flg6_META = createCommonMeta($bsppl_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_grp_cd6_META = createCommonMeta($bsppl_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bsppl_grp_nm6_META = createCommonMeta($bsppl_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bsppl_grp_flg7_META = createCommonMeta($bsppl_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_grp_cd7_META = createCommonMeta($bsppl_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bsppl_grp_nm7_META = createCommonMeta($bsppl_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bsppl_grp_flg8_META = createCommonMeta($bsppl_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_grp_cd8_META = createCommonMeta($bsppl_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bsppl_grp_nm8_META = createCommonMeta($bsppl_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bsppl_grp_flg9_META = createCommonMeta($bsppl_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_grp_cd9_META = createCommonMeta($bsppl_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bsppl_grp_nm9_META = createCommonMeta($bsppl_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bsppl_grp_flg10_META = createCommonMeta($bsppl_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_grp_cd10_META = createCommonMeta($bsppl_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bsppl_grp_nm10_META = createCommonMeta($bsppl_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta psppl_grp_flg1_META = createCommonMeta($psppl_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_grp_cd1_META = createCommonMeta($psppl_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta psppl_grp_nm1_META = createCommonMeta($psppl_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta psppl_grp_flg2_META = createCommonMeta($psppl_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_grp_cd2_META = createCommonMeta($psppl_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta psppl_grp_nm2_META = createCommonMeta($psppl_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta psppl_grp_flg3_META = createCommonMeta($psppl_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_grp_cd3_META = createCommonMeta($psppl_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta psppl_grp_nm3_META = createCommonMeta($psppl_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta psppl_grp_flg4_META = createCommonMeta($psppl_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_grp_cd4_META = createCommonMeta($psppl_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta psppl_grp_nm4_META = createCommonMeta($psppl_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta psppl_grp_flg5_META = createCommonMeta($psppl_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_grp_cd5_META = createCommonMeta($psppl_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta psppl_grp_nm5_META = createCommonMeta($psppl_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta psppl_grp_flg6_META = createCommonMeta($psppl_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_grp_cd6_META = createCommonMeta($psppl_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta psppl_grp_nm6_META = createCommonMeta($psppl_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta psppl_grp_flg7_META = createCommonMeta($psppl_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_grp_cd7_META = createCommonMeta($psppl_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta psppl_grp_nm7_META = createCommonMeta($psppl_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta psppl_grp_flg8_META = createCommonMeta($psppl_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_grp_cd8_META = createCommonMeta($psppl_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta psppl_grp_nm8_META = createCommonMeta($psppl_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta psppl_grp_flg9_META = createCommonMeta($psppl_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_grp_cd9_META = createCommonMeta($psppl_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta psppl_grp_nm9_META = createCommonMeta($psppl_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta psppl_grp_flg10_META = createCommonMeta($psppl_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_grp_cd10_META = createCommonMeta($psppl_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta psppl_grp_nm10_META = createCommonMeta($psppl_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mode_META,
			opn_flg_META,
			fix_flg_META,
			acpt_flg_META,
			rjct_flg_META,
			last_rjct_flg_META,
			excld_flg_META,
			pay_schd_act_dt_fr_META,
			pay_schd_act_dt_to_META,
			bsppl_cd_META,
			bsppl_nm_META,
			bsppl_dpt_cd_META,
			bsppl_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			pay_chk_no_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			pay_schd_print_rmrks_META,
			trd_d_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			purc_act_no_META,
			wrk_no_META,
			wrk_nm_META,
			ap_typ_META,
			psppl_cd_META,
			psppl_nm_META,
			dtl_flg_META,
			inc_appl_flg_META,
			inc_com_paid_flg_META,
			rfrnc_dt_META,
			bsppl_dpt_cd_flg_META,
			bsppl_dpt_nm_flg_META,
			wg_cd_flg_META,
			bsppl_cd_flg_META,
			ap_typ_flg_META,
			pay_schd_dt_flg_META,
			ap_sttl_cd_flg_META,
			ap_sttl_typ_flg_META,
			bsppl_cl_ym_flg_META,
			bsppl_cl_day_flg_META,
			trd_cur_cd_flg_META,
			pay_chk_no_flg_META,
			pay_schd_no_flg_META,
			rcpt_iv_no_flg_META,
			rcpt_iv_mng_no_flg_META,
			purc_act_no_flg_META,
			wrk_no_flg_META,
			psppl_cd_flg_META,
			pay_dpt_cd_flg_META,
			pay_dpt_nm_flg_META,
			asppl_cd_flg_META,
			pay_sts_typ_flg_META,
			ap_dpt_cd_flg_META,
			ap_dpt_nm_flg_META,
			pay_bank_ac_cd_flg_META,
			bank_ac_cd_flg_META,
			setoff_info_flg_META,
			xrate_flg_META,
			com_paid_tax_cd_flg_META,
			rcv_bill_no_flg_META,
			adv_pay_act_no_flg_META,
			note_info_flg_META,
			rmrks_flg_META,
			bsppl_grp_flg1_META,
			bsppl_grp_cd1_META,
			bsppl_grp_nm1_META,
			bsppl_grp_flg2_META,
			bsppl_grp_cd2_META,
			bsppl_grp_nm2_META,
			bsppl_grp_flg3_META,
			bsppl_grp_cd3_META,
			bsppl_grp_nm3_META,
			bsppl_grp_flg4_META,
			bsppl_grp_cd4_META,
			bsppl_grp_nm4_META,
			bsppl_grp_flg5_META,
			bsppl_grp_cd5_META,
			bsppl_grp_nm5_META,
			bsppl_grp_flg6_META,
			bsppl_grp_cd6_META,
			bsppl_grp_nm6_META,
			bsppl_grp_flg7_META,
			bsppl_grp_cd7_META,
			bsppl_grp_nm7_META,
			bsppl_grp_flg8_META,
			bsppl_grp_cd8_META,
			bsppl_grp_nm8_META,
			bsppl_grp_flg9_META,
			bsppl_grp_cd9_META,
			bsppl_grp_nm9_META,
			bsppl_grp_flg10_META,
			bsppl_grp_cd10_META,
			bsppl_grp_nm10_META,
			psppl_grp_flg1_META,
			psppl_grp_cd1_META,
			psppl_grp_nm1_META,
			psppl_grp_flg2_META,
			psppl_grp_cd2_META,
			psppl_grp_nm2_META,
			psppl_grp_flg3_META,
			psppl_grp_cd3_META,
			psppl_grp_nm3_META,
			psppl_grp_flg4_META,
			psppl_grp_cd4_META,
			psppl_grp_nm4_META,
			psppl_grp_flg5_META,
			psppl_grp_cd5_META,
			psppl_grp_nm5_META,
			psppl_grp_flg6_META,
			psppl_grp_cd6_META,
			psppl_grp_nm6_META,
			psppl_grp_flg7_META,
			psppl_grp_cd7_META,
			psppl_grp_nm7_META,
			psppl_grp_flg8_META,
			psppl_grp_cd8_META,
			psppl_grp_nm8_META,
			psppl_grp_flg9_META,
			psppl_grp_cd9_META,
			psppl_grp_nm9_META,
			psppl_grp_flg10_META,
			psppl_grp_cd10_META,
			psppl_grp_nm10_META
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Search mode 検索モード.<p>
	 *
	 */
	public String mode() {
		return getConstString(offset + 0, $mode);
	}

	/**
	 * Search mode 検索モード.<p>
	 *
	 */
	public void mode(String value) {
		setConstString(offset + 0, $mode, value);
	}


	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public boolean opn_flg() {
		return getConstBoolean(offset + 1, $opn_flg);
	}

	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public void opn_flg(boolean value) {
		setConstBoolean(offset + 1, $opn_flg, value);
	}


	/**
	 * Preliminary approval 一次承認済.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 2, $fix_flg);
	}

	/**
	 * Preliminary approval 一次承認済.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 2, $fix_flg, value);
	}


	/**
	 * Final approval 最終承認済.<p>
	 *
	 */
	public boolean acpt_flg() {
		return getConstBoolean(offset + 3, $acpt_flg);
	}

	/**
	 * Final approval 最終承認済.<p>
	 *
	 */
	public void acpt_flg(boolean value) {
		setConstBoolean(offset + 3, $acpt_flg, value);
	}


	/**
	 * Reject 却下.<p>
	 *
	 */
	public boolean rjct_flg() {
		return getConstBoolean(offset + 4, $rjct_flg);
	}

	/**
	 * Reject 却下.<p>
	 *
	 */
	public void rjct_flg(boolean value) {
		setConstBoolean(offset + 4, $rjct_flg, value);
	}


	/**
	 * Denied 否認.<p>
	 *
	 */
	public boolean last_rjct_flg() {
		return getConstBoolean(offset + 5, $last_rjct_flg);
	}

	/**
	 * Denied 否認.<p>
	 *
	 */
	public void last_rjct_flg(boolean value) {
		setConstBoolean(offset + 5, $last_rjct_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean excld_flg() {
		return getConstBoolean(offset + 6, $excld_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void excld_flg(boolean value) {
		setConstBoolean(offset + 6, $excld_flg, value);
	}


	/**
	 * Scheduled/Actual payment date FROM 支払予定日／実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate pay_schd_act_dt_fr() {
		return getConstDate(offset + 7, $pay_schd_act_dt_fr);
	}

	/**
	 * Scheduled/Actual payment date FROM 支払予定日／実績日ＦＲＯＭ.<p>
	 *
	 */
	public void pay_schd_act_dt_fr(MCDate value) {
		setConstDate(offset + 7, $pay_schd_act_dt_fr, value);
	}


	/**
	 * Scheduled/Actual payment date TO 支払予定日／実績日ＴＯ.<p>
	 *
	 */
	public MCDate pay_schd_act_dt_to() {
		return getConstDate(offset + 8, $pay_schd_act_dt_to);
	}

	/**
	 * Scheduled/Actual payment date TO 支払予定日／実績日ＴＯ.<p>
	 *
	 */
	public void pay_schd_act_dt_to(MCDate value) {
		setConstDate(offset + 8, $pay_schd_act_dt_to, value);
	}


	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 9, $bsppl_cd);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 9, $bsppl_cd, value);
	}


	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public String bsppl_nm() {
		return getConstString(offset + 10, $bsppl_nm);
	}

	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public void bsppl_nm(String value) {
		setConstString(offset + 10, $bsppl_nm, value);
	}


	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 11, $bsppl_dpt_cd);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 11, $bsppl_dpt_cd, value);
	}


	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public String bsppl_dpt_nm() {
		return getConstString(offset + 12, $bsppl_dpt_nm);
	}

	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public void bsppl_dpt_nm(String value) {
		setConstString(offset + 12, $bsppl_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 13, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 13, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 14, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 14, $wg_nm, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 15, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 15, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 16, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 16, $trd_cur_nm, value);
	}


	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public String pay_chk_no() {
		return getConstString(offset + 17, $pay_chk_no);
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no(String value) {
		setConstString(offset + 17, $pay_chk_no, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 18, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 18, $rcpt_iv_no, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 19, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 19, $rcpt_iv_mng_no, value);
	}


	/**
	 * Payment schedule table details 支払予定表備考.<p>
	 *
	 */
	public String pay_schd_print_rmrks() {
		return getConstString(offset + 20, $pay_schd_print_rmrks);
	}

	/**
	 * Payment schedule table details 支払予定表備考.<p>
	 *
	 */
	public void pay_schd_print_rmrks(String value) {
		setConstString(offset + 20, $pay_schd_print_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 21, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 21, $trd_d_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 22, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 22, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 23, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 23, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 24, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 24, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 25, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 25, $sub_char3, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 26, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 26, $purc_act_no, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 27, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 27, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 28, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 28, $wrk_nm, value);
	}


	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public String ap_typ() {
		return getConstString(offset + 29, $ap_typ);
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public void ap_typ(String value) {
		setConstString(offset + 29, $ap_typ, value);
	}


	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 30, $psppl_cd);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 30, $psppl_cd, value);
	}


	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public String psppl_nm() {
		return getConstString(offset + 31, $psppl_nm);
	}

	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public void psppl_nm(String value) {
		setConstString(offset + 31, $psppl_nm, value);
	}


	/**
	 * Display breakdown 内訳表示.<p>
	 *
	 */
	public boolean dtl_flg() {
		return getConstBoolean(offset + 32, $dtl_flg);
	}

	/**
	 * Display breakdown 内訳表示.<p>
	 *
	 */
	public void dtl_flg(boolean value) {
		setConstBoolean(offset + 32, $dtl_flg, value);
	}


	/**
	 * Include paid 支払済含む.<p>
	 *
	 */
	public boolean inc_appl_flg() {
		return getConstBoolean(offset + 33, $inc_appl_flg);
	}

	/**
	 * Include paid 支払済含む.<p>
	 *
	 */
	public void inc_appl_flg(boolean value) {
		setConstBoolean(offset + 33, $inc_appl_flg, value);
	}


	/**
	 * Include fee 手数料含む.<p>
	 *
	 */
	public boolean inc_com_paid_flg() {
		return getConstBoolean(offset + 34, $inc_com_paid_flg);
	}

	/**
	 * Include fee 手数料含む.<p>
	 *
	 */
	public void inc_com_paid_flg(boolean value) {
		setConstBoolean(offset + 34, $inc_com_paid_flg, value);
	}


	/**
	 * Delay check base date 遅延確認基準日.<p>
	 *
	 */
	public MCDate rfrnc_dt() {
		return getConstDate(offset + 35, $rfrnc_dt);
	}

	/**
	 * Delay check base date 遅延確認基準日.<p>
	 *
	 */
	public void rfrnc_dt(MCDate value) {
		setConstDate(offset + 35, $rfrnc_dt, value);
	}


	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public boolean bsppl_dpt_cd_flg() {
		return getConstBoolean(offset + 36, $bsppl_dpt_cd_flg);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd_flg(boolean value) {
		setConstBoolean(offset + 36, $bsppl_dpt_cd_flg, value);
	}


	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public boolean bsppl_dpt_nm_flg() {
		return getConstBoolean(offset + 37, $bsppl_dpt_nm_flg);
	}

	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public void bsppl_dpt_nm_flg(boolean value) {
		setConstBoolean(offset + 37, $bsppl_dpt_nm_flg, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public boolean wg_cd_flg() {
		return getConstBoolean(offset + 38, $wg_cd_flg);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd_flg(boolean value) {
		setConstBoolean(offset + 38, $wg_cd_flg, value);
	}


	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public boolean bsppl_cd_flg() {
		return getConstBoolean(offset + 39, $bsppl_cd_flg);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd_flg(boolean value) {
		setConstBoolean(offset + 39, $bsppl_cd_flg, value);
	}


	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public boolean ap_typ_flg() {
		return getConstBoolean(offset + 40, $ap_typ_flg);
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public void ap_typ_flg(boolean value) {
		setConstBoolean(offset + 40, $ap_typ_flg, value);
	}


	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public boolean pay_schd_dt_flg() {
		return getConstBoolean(offset + 41, $pay_schd_dt_flg);
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public void pay_schd_dt_flg(boolean value) {
		setConstBoolean(offset + 41, $pay_schd_dt_flg, value);
	}


	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public boolean ap_sttl_cd_flg() {
		return getConstBoolean(offset + 42, $ap_sttl_cd_flg);
	}

	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public void ap_sttl_cd_flg(boolean value) {
		setConstBoolean(offset + 42, $ap_sttl_cd_flg, value);
	}


	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public boolean ap_sttl_typ_flg() {
		return getConstBoolean(offset + 43, $ap_sttl_typ_flg);
	}

	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public void ap_sttl_typ_flg(boolean value) {
		setConstBoolean(offset + 43, $ap_sttl_typ_flg, value);
	}


	/**
	 * Scheduled payee closing year and month 支払予定管理先締年月.<p>
	 *
	 */
	public boolean bsppl_cl_ym_flg() {
		return getConstBoolean(offset + 44, $bsppl_cl_ym_flg);
	}

	/**
	 * Scheduled payee closing year and month 支払予定管理先締年月.<p>
	 *
	 */
	public void bsppl_cl_ym_flg(boolean value) {
		setConstBoolean(offset + 44, $bsppl_cl_ym_flg, value);
	}


	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public boolean bsppl_cl_day_flg() {
		return getConstBoolean(offset + 45, $bsppl_cl_day_flg);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day_flg(boolean value) {
		setConstBoolean(offset + 45, $bsppl_cl_day_flg, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public boolean trd_cur_cd_flg() {
		return getConstBoolean(offset + 46, $trd_cur_cd_flg);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd_flg(boolean value) {
		setConstBoolean(offset + 46, $trd_cur_cd_flg, value);
	}


	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public boolean pay_chk_no_flg() {
		return getConstBoolean(offset + 47, $pay_chk_no_flg);
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no_flg(boolean value) {
		setConstBoolean(offset + 47, $pay_chk_no_flg, value);
	}


	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public boolean pay_schd_no_flg() {
		return getConstBoolean(offset + 48, $pay_schd_no_flg);
	}

	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public void pay_schd_no_flg(boolean value) {
		setConstBoolean(offset + 48, $pay_schd_no_flg, value);
	}


	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public boolean rcpt_iv_no_flg() {
		return getConstBoolean(offset + 49, $rcpt_iv_no_flg);
	}

	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no_flg(boolean value) {
		setConstBoolean(offset + 49, $rcpt_iv_no_flg, value);
	}


	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public boolean rcpt_iv_mng_no_flg() {
		return getConstBoolean(offset + 50, $rcpt_iv_mng_no_flg);
	}

	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no_flg(boolean value) {
		setConstBoolean(offset + 50, $rcpt_iv_mng_no_flg, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public boolean purc_act_no_flg() {
		return getConstBoolean(offset + 51, $purc_act_no_flg);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no_flg(boolean value) {
		setConstBoolean(offset + 51, $purc_act_no_flg, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public boolean wrk_no_flg() {
		return getConstBoolean(offset + 52, $wrk_no_flg);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no_flg(boolean value) {
		setConstBoolean(offset + 52, $wrk_no_flg, value);
	}


	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public boolean psppl_cd_flg() {
		return getConstBoolean(offset + 53, $psppl_cd_flg);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd_flg(boolean value) {
		setConstBoolean(offset + 53, $psppl_cd_flg, value);
	}


	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public boolean pay_dpt_cd_flg() {
		return getConstBoolean(offset + 54, $pay_dpt_cd_flg);
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public void pay_dpt_cd_flg(boolean value) {
		setConstBoolean(offset + 54, $pay_dpt_cd_flg, value);
	}


	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public boolean pay_dpt_nm_flg() {
		return getConstBoolean(offset + 55, $pay_dpt_nm_flg);
	}

	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public void pay_dpt_nm_flg(boolean value) {
		setConstBoolean(offset + 55, $pay_dpt_nm_flg, value);
	}


	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public boolean asppl_cd_flg() {
		return getConstBoolean(offset + 56, $asppl_cd_flg);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd_flg(boolean value) {
		setConstBoolean(offset + 56, $asppl_cd_flg, value);
	}


	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public boolean pay_sts_typ_flg() {
		return getConstBoolean(offset + 57, $pay_sts_typ_flg);
	}

	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public void pay_sts_typ_flg(boolean value) {
		setConstBoolean(offset + 57, $pay_sts_typ_flg, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public boolean ap_dpt_cd_flg() {
		return getConstBoolean(offset + 58, $ap_dpt_cd_flg);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd_flg(boolean value) {
		setConstBoolean(offset + 58, $ap_dpt_cd_flg, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public boolean ap_dpt_nm_flg() {
		return getConstBoolean(offset + 59, $ap_dpt_nm_flg);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm_flg(boolean value) {
		setConstBoolean(offset + 59, $ap_dpt_nm_flg, value);
	}


	/**
	 * Payee account 支払先口座.<p>
	 *
	 */
	public boolean pay_bank_ac_cd_flg() {
		return getConstBoolean(offset + 60, $pay_bank_ac_cd_flg);
	}

	/**
	 * Payee account 支払先口座.<p>
	 *
	 */
	public void pay_bank_ac_cd_flg(boolean value) {
		setConstBoolean(offset + 60, $pay_bank_ac_cd_flg, value);
	}


	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public boolean bank_ac_cd_flg() {
		return getConstBoolean(offset + 61, $bank_ac_cd_flg);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd_flg(boolean value) {
		setConstBoolean(offset + 61, $bank_ac_cd_flg, value);
	}


	/**
	 * Offset info. 相殺情報.<p>
	 *
	 */
	public boolean setoff_info_flg() {
		return getConstBoolean(offset + 62, $setoff_info_flg);
	}

	/**
	 * Offset info. 相殺情報.<p>
	 *
	 */
	public void setoff_info_flg(boolean value) {
		setConstBoolean(offset + 62, $setoff_info_flg, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public boolean xrate_flg() {
		return getConstBoolean(offset + 63, $xrate_flg);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate_flg(boolean value) {
		setConstBoolean(offset + 63, $xrate_flg, value);
	}


	/**
	 * Fee tax 手数料税.<p>
	 *
	 */
	public boolean com_paid_tax_cd_flg() {
		return getConstBoolean(offset + 64, $com_paid_tax_cd_flg);
	}

	/**
	 * Fee tax 手数料税.<p>
	 *
	 */
	public void com_paid_tax_cd_flg(boolean value) {
		setConstBoolean(offset + 64, $com_paid_tax_cd_flg, value);
	}


	/**
	 * Counterpart invoice No. 相手先請求書ＮＯ.<p>
	 *
	 */
	public boolean rcv_bill_no_flg() {
		return getConstBoolean(offset + 65, $rcv_bill_no_flg);
	}

	/**
	 * Counterpart invoice No. 相手先請求書ＮＯ.<p>
	 *
	 */
	public void rcv_bill_no_flg(boolean value) {
		setConstBoolean(offset + 65, $rcv_bill_no_flg, value);
	}


	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public boolean adv_pay_act_no_flg() {
		return getConstBoolean(offset + 66, $adv_pay_act_no_flg);
	}

	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public void adv_pay_act_no_flg(boolean value) {
		setConstBoolean(offset + 66, $adv_pay_act_no_flg, value);
	}


	/**
	 * Note info. 手形情報.<p>
	 *
	 */
	public boolean note_info_flg() {
		return getConstBoolean(offset + 67, $note_info_flg);
	}

	/**
	 * Note info. 手形情報.<p>
	 *
	 */
	public void note_info_flg(boolean value) {
		setConstBoolean(offset + 67, $note_info_flg, value);
	}


	/**
	 * Remarks/Spare 備考・予備.<p>
	 *
	 */
	public boolean rmrks_flg() {
		return getConstBoolean(offset + 68, $rmrks_flg);
	}

	/**
	 * Remarks/Spare 備考・予備.<p>
	 *
	 */
	public void rmrks_flg(boolean value) {
		setConstBoolean(offset + 68, $rmrks_flg, value);
	}


	/**
	 * Scheduled payee classification 1 search target 支払予定管理先分類１検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg1() {
		return getConstBoolean(offset + 69, $bsppl_grp_flg1);
	}

	/**
	 * Scheduled payee classification 1 search target 支払予定管理先分類１検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg1(boolean value) {
		setConstBoolean(offset + 69, $bsppl_grp_flg1, value);
	}


	/**
	 * Scheduled payee classification cd. 1 支払予定管理先分類ＣＤ１.<p>
	 *
	 */
	public String bsppl_grp_cd1() {
		return getConstString(offset + 70, $bsppl_grp_cd1);
	}

	/**
	 * Scheduled payee classification cd. 1 支払予定管理先分類ＣＤ１.<p>
	 *
	 */
	public void bsppl_grp_cd1(String value) {
		setConstString(offset + 70, $bsppl_grp_cd1, value);
	}


	/**
	 * Scheduled payee classification name 1 支払予定管理先分類名１.<p>
	 *
	 */
	public String bsppl_grp_nm1() {
		return getConstString(offset + 71, $bsppl_grp_nm1);
	}

	/**
	 * Scheduled payee classification name 1 支払予定管理先分類名１.<p>
	 *
	 */
	public void bsppl_grp_nm1(String value) {
		setConstString(offset + 71, $bsppl_grp_nm1, value);
	}


	/**
	 * Scheduled payee classification 2 search target 支払予定管理先分類２検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg2() {
		return getConstBoolean(offset + 72, $bsppl_grp_flg2);
	}

	/**
	 * Scheduled payee classification 2 search target 支払予定管理先分類２検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg2(boolean value) {
		setConstBoolean(offset + 72, $bsppl_grp_flg2, value);
	}


	/**
	 * Scheduled payee classification cd. 2 支払予定管理先分類ＣＤ２.<p>
	 *
	 */
	public String bsppl_grp_cd2() {
		return getConstString(offset + 73, $bsppl_grp_cd2);
	}

	/**
	 * Scheduled payee classification cd. 2 支払予定管理先分類ＣＤ２.<p>
	 *
	 */
	public void bsppl_grp_cd2(String value) {
		setConstString(offset + 73, $bsppl_grp_cd2, value);
	}


	/**
	 * Scheduled payee classification name 2 支払予定管理先分類名２.<p>
	 *
	 */
	public String bsppl_grp_nm2() {
		return getConstString(offset + 74, $bsppl_grp_nm2);
	}

	/**
	 * Scheduled payee classification name 2 支払予定管理先分類名２.<p>
	 *
	 */
	public void bsppl_grp_nm2(String value) {
		setConstString(offset + 74, $bsppl_grp_nm2, value);
	}


	/**
	 * Scheduled payee classification 3 search target 支払予定管理先分類３検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg3() {
		return getConstBoolean(offset + 75, $bsppl_grp_flg3);
	}

	/**
	 * Scheduled payee classification 3 search target 支払予定管理先分類３検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg3(boolean value) {
		setConstBoolean(offset + 75, $bsppl_grp_flg3, value);
	}


	/**
	 * Scheduled payee classification cd. 3 支払予定管理先分類ＣＤ３.<p>
	 *
	 */
	public String bsppl_grp_cd3() {
		return getConstString(offset + 76, $bsppl_grp_cd3);
	}

	/**
	 * Scheduled payee classification cd. 3 支払予定管理先分類ＣＤ３.<p>
	 *
	 */
	public void bsppl_grp_cd3(String value) {
		setConstString(offset + 76, $bsppl_grp_cd3, value);
	}


	/**
	 * Scheduled payee classification name 3 支払予定管理先分類名３.<p>
	 *
	 */
	public String bsppl_grp_nm3() {
		return getConstString(offset + 77, $bsppl_grp_nm3);
	}

	/**
	 * Scheduled payee classification name 3 支払予定管理先分類名３.<p>
	 *
	 */
	public void bsppl_grp_nm3(String value) {
		setConstString(offset + 77, $bsppl_grp_nm3, value);
	}


	/**
	 * Scheduled payee classification 4 search target 支払予定管理先分類４検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg4() {
		return getConstBoolean(offset + 78, $bsppl_grp_flg4);
	}

	/**
	 * Scheduled payee classification 4 search target 支払予定管理先分類４検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg4(boolean value) {
		setConstBoolean(offset + 78, $bsppl_grp_flg4, value);
	}


	/**
	 * Scheduled payee classification cd. 4 支払予定管理先分類ＣＤ４.<p>
	 *
	 */
	public String bsppl_grp_cd4() {
		return getConstString(offset + 79, $bsppl_grp_cd4);
	}

	/**
	 * Scheduled payee classification cd. 4 支払予定管理先分類ＣＤ４.<p>
	 *
	 */
	public void bsppl_grp_cd4(String value) {
		setConstString(offset + 79, $bsppl_grp_cd4, value);
	}


	/**
	 * Scheduled payee classification name 4 支払予定管理先分類名４.<p>
	 *
	 */
	public String bsppl_grp_nm4() {
		return getConstString(offset + 80, $bsppl_grp_nm4);
	}

	/**
	 * Scheduled payee classification name 4 支払予定管理先分類名４.<p>
	 *
	 */
	public void bsppl_grp_nm4(String value) {
		setConstString(offset + 80, $bsppl_grp_nm4, value);
	}


	/**
	 * Scheduled payee classification 5 search target 支払予定管理先分類５検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg5() {
		return getConstBoolean(offset + 81, $bsppl_grp_flg5);
	}

	/**
	 * Scheduled payee classification 5 search target 支払予定管理先分類５検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg5(boolean value) {
		setConstBoolean(offset + 81, $bsppl_grp_flg5, value);
	}


	/**
	 * Scheduled payee classification cd. 5 支払予定管理先分類ＣＤ５.<p>
	 *
	 */
	public String bsppl_grp_cd5() {
		return getConstString(offset + 82, $bsppl_grp_cd5);
	}

	/**
	 * Scheduled payee classification cd. 5 支払予定管理先分類ＣＤ５.<p>
	 *
	 */
	public void bsppl_grp_cd5(String value) {
		setConstString(offset + 82, $bsppl_grp_cd5, value);
	}


	/**
	 * Scheduled payee classification name 5 支払予定管理先分類名５.<p>
	 *
	 */
	public String bsppl_grp_nm5() {
		return getConstString(offset + 83, $bsppl_grp_nm5);
	}

	/**
	 * Scheduled payee classification name 5 支払予定管理先分類名５.<p>
	 *
	 */
	public void bsppl_grp_nm5(String value) {
		setConstString(offset + 83, $bsppl_grp_nm5, value);
	}


	/**
	 * Scheduled payee classification 6 search target 支払予定管理先分類６検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg6() {
		return getConstBoolean(offset + 84, $bsppl_grp_flg6);
	}

	/**
	 * Scheduled payee classification 6 search target 支払予定管理先分類６検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg6(boolean value) {
		setConstBoolean(offset + 84, $bsppl_grp_flg6, value);
	}


	/**
	 * Scheduled payee classification cd. 6 支払予定管理先分類ＣＤ６.<p>
	 *
	 */
	public String bsppl_grp_cd6() {
		return getConstString(offset + 85, $bsppl_grp_cd6);
	}

	/**
	 * Scheduled payee classification cd. 6 支払予定管理先分類ＣＤ６.<p>
	 *
	 */
	public void bsppl_grp_cd6(String value) {
		setConstString(offset + 85, $bsppl_grp_cd6, value);
	}


	/**
	 * Scheduled payee classification name 6 支払予定管理先分類名６.<p>
	 *
	 */
	public String bsppl_grp_nm6() {
		return getConstString(offset + 86, $bsppl_grp_nm6);
	}

	/**
	 * Scheduled payee classification name 6 支払予定管理先分類名６.<p>
	 *
	 */
	public void bsppl_grp_nm6(String value) {
		setConstString(offset + 86, $bsppl_grp_nm6, value);
	}


	/**
	 * Scheduled payee classification 7 search target 支払予定管理先分類７検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg7() {
		return getConstBoolean(offset + 87, $bsppl_grp_flg7);
	}

	/**
	 * Scheduled payee classification 7 search target 支払予定管理先分類７検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg7(boolean value) {
		setConstBoolean(offset + 87, $bsppl_grp_flg7, value);
	}


	/**
	 * Scheduled payee classification cd. 7 支払予定管理先分類ＣＤ７.<p>
	 *
	 */
	public String bsppl_grp_cd7() {
		return getConstString(offset + 88, $bsppl_grp_cd7);
	}

	/**
	 * Scheduled payee classification cd. 7 支払予定管理先分類ＣＤ７.<p>
	 *
	 */
	public void bsppl_grp_cd7(String value) {
		setConstString(offset + 88, $bsppl_grp_cd7, value);
	}


	/**
	 * Scheduled payee classification name 7 支払予定管理先分類名７.<p>
	 *
	 */
	public String bsppl_grp_nm7() {
		return getConstString(offset + 89, $bsppl_grp_nm7);
	}

	/**
	 * Scheduled payee classification name 7 支払予定管理先分類名７.<p>
	 *
	 */
	public void bsppl_grp_nm7(String value) {
		setConstString(offset + 89, $bsppl_grp_nm7, value);
	}


	/**
	 * Scheduled payee classification 8 search target 支払予定管理先分類８検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg8() {
		return getConstBoolean(offset + 90, $bsppl_grp_flg8);
	}

	/**
	 * Scheduled payee classification 8 search target 支払予定管理先分類８検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg8(boolean value) {
		setConstBoolean(offset + 90, $bsppl_grp_flg8, value);
	}


	/**
	 * Scheduled payee classification cd. 8 支払予定管理先分類ＣＤ８.<p>
	 *
	 */
	public String bsppl_grp_cd8() {
		return getConstString(offset + 91, $bsppl_grp_cd8);
	}

	/**
	 * Scheduled payee classification cd. 8 支払予定管理先分類ＣＤ８.<p>
	 *
	 */
	public void bsppl_grp_cd8(String value) {
		setConstString(offset + 91, $bsppl_grp_cd8, value);
	}


	/**
	 * Scheduled payee classification name 8 支払予定管理先分類名８.<p>
	 *
	 */
	public String bsppl_grp_nm8() {
		return getConstString(offset + 92, $bsppl_grp_nm8);
	}

	/**
	 * Scheduled payee classification name 8 支払予定管理先分類名８.<p>
	 *
	 */
	public void bsppl_grp_nm8(String value) {
		setConstString(offset + 92, $bsppl_grp_nm8, value);
	}


	/**
	 * Scheduled payee classification 9 search target 支払予定管理先分類９検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg9() {
		return getConstBoolean(offset + 93, $bsppl_grp_flg9);
	}

	/**
	 * Scheduled payee classification 9 search target 支払予定管理先分類９検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg9(boolean value) {
		setConstBoolean(offset + 93, $bsppl_grp_flg9, value);
	}


	/**
	 * Scheduled payee classification cd. 9 支払予定管理先分類ＣＤ９.<p>
	 *
	 */
	public String bsppl_grp_cd9() {
		return getConstString(offset + 94, $bsppl_grp_cd9);
	}

	/**
	 * Scheduled payee classification cd. 9 支払予定管理先分類ＣＤ９.<p>
	 *
	 */
	public void bsppl_grp_cd9(String value) {
		setConstString(offset + 94, $bsppl_grp_cd9, value);
	}


	/**
	 * Scheduled payee classification name 9 支払予定管理先分類名９.<p>
	 *
	 */
	public String bsppl_grp_nm9() {
		return getConstString(offset + 95, $bsppl_grp_nm9);
	}

	/**
	 * Scheduled payee classification name 9 支払予定管理先分類名９.<p>
	 *
	 */
	public void bsppl_grp_nm9(String value) {
		setConstString(offset + 95, $bsppl_grp_nm9, value);
	}


	/**
	 * Scheduled payee classification 10 search target 支払予定管理先分類１０検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg10() {
		return getConstBoolean(offset + 96, $bsppl_grp_flg10);
	}

	/**
	 * Scheduled payee classification 10 search target 支払予定管理先分類１０検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg10(boolean value) {
		setConstBoolean(offset + 96, $bsppl_grp_flg10, value);
	}


	/**
	 * Scheduled payee classification cd. 10 支払予定管理先分類ＣＤ１０.<p>
	 *
	 */
	public String bsppl_grp_cd10() {
		return getConstString(offset + 97, $bsppl_grp_cd10);
	}

	/**
	 * Scheduled payee classification cd. 10 支払予定管理先分類ＣＤ１０.<p>
	 *
	 */
	public void bsppl_grp_cd10(String value) {
		setConstString(offset + 97, $bsppl_grp_cd10, value);
	}


	/**
	 * Scheduled payee classification name 10 支払予定管理先分類名１０.<p>
	 *
	 */
	public String bsppl_grp_nm10() {
		return getConstString(offset + 98, $bsppl_grp_nm10);
	}

	/**
	 * Scheduled payee classification name 10 支払予定管理先分類名１０.<p>
	 *
	 */
	public void bsppl_grp_nm10(String value) {
		setConstString(offset + 98, $bsppl_grp_nm10, value);
	}


	/**
	 * Payee classification 1 search target 支払先分類１検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg1() {
		return getConstBoolean(offset + 99, $psppl_grp_flg1);
	}

	/**
	 * Payee classification 1 search target 支払先分類１検索対象.<p>
	 *
	 */
	public void psppl_grp_flg1(boolean value) {
		setConstBoolean(offset + 99, $psppl_grp_flg1, value);
	}


	/**
	 * Payee classification cd. 1 支払先分類ＣＤ１.<p>
	 *
	 */
	public String psppl_grp_cd1() {
		return getConstString(offset + 100, $psppl_grp_cd1);
	}

	/**
	 * Payee classification cd. 1 支払先分類ＣＤ１.<p>
	 *
	 */
	public void psppl_grp_cd1(String value) {
		setConstString(offset + 100, $psppl_grp_cd1, value);
	}


	/**
	 * Payee classification name 1 支払先分類名１.<p>
	 *
	 */
	public String psppl_grp_nm1() {
		return getConstString(offset + 101, $psppl_grp_nm1);
	}

	/**
	 * Payee classification name 1 支払先分類名１.<p>
	 *
	 */
	public void psppl_grp_nm1(String value) {
		setConstString(offset + 101, $psppl_grp_nm1, value);
	}


	/**
	 * Payee classification 2 search target 支払先分類２検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg2() {
		return getConstBoolean(offset + 102, $psppl_grp_flg2);
	}

	/**
	 * Payee classification 2 search target 支払先分類２検索対象.<p>
	 *
	 */
	public void psppl_grp_flg2(boolean value) {
		setConstBoolean(offset + 102, $psppl_grp_flg2, value);
	}


	/**
	 * Payee classification cd. 2 支払先分類ＣＤ２.<p>
	 *
	 */
	public String psppl_grp_cd2() {
		return getConstString(offset + 103, $psppl_grp_cd2);
	}

	/**
	 * Payee classification cd. 2 支払先分類ＣＤ２.<p>
	 *
	 */
	public void psppl_grp_cd2(String value) {
		setConstString(offset + 103, $psppl_grp_cd2, value);
	}


	/**
	 * Payee classification name 2 支払先分類名２.<p>
	 *
	 */
	public String psppl_grp_nm2() {
		return getConstString(offset + 104, $psppl_grp_nm2);
	}

	/**
	 * Payee classification name 2 支払先分類名２.<p>
	 *
	 */
	public void psppl_grp_nm2(String value) {
		setConstString(offset + 104, $psppl_grp_nm2, value);
	}


	/**
	 * Payee classification 3 search target 支払先分類３検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg3() {
		return getConstBoolean(offset + 105, $psppl_grp_flg3);
	}

	/**
	 * Payee classification 3 search target 支払先分類３検索対象.<p>
	 *
	 */
	public void psppl_grp_flg3(boolean value) {
		setConstBoolean(offset + 105, $psppl_grp_flg3, value);
	}


	/**
	 * Payee classification cd. 3 支払先分類ＣＤ３.<p>
	 *
	 */
	public String psppl_grp_cd3() {
		return getConstString(offset + 106, $psppl_grp_cd3);
	}

	/**
	 * Payee classification cd. 3 支払先分類ＣＤ３.<p>
	 *
	 */
	public void psppl_grp_cd3(String value) {
		setConstString(offset + 106, $psppl_grp_cd3, value);
	}


	/**
	 * Payee classification name 3 支払先分類名３.<p>
	 *
	 */
	public String psppl_grp_nm3() {
		return getConstString(offset + 107, $psppl_grp_nm3);
	}

	/**
	 * Payee classification name 3 支払先分類名３.<p>
	 *
	 */
	public void psppl_grp_nm3(String value) {
		setConstString(offset + 107, $psppl_grp_nm3, value);
	}


	/**
	 * Payee classification 4 search target 支払先分類４検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg4() {
		return getConstBoolean(offset + 108, $psppl_grp_flg4);
	}

	/**
	 * Payee classification 4 search target 支払先分類４検索対象.<p>
	 *
	 */
	public void psppl_grp_flg4(boolean value) {
		setConstBoolean(offset + 108, $psppl_grp_flg4, value);
	}


	/**
	 * Payee classification cd. 4 支払先分類ＣＤ４.<p>
	 *
	 */
	public String psppl_grp_cd4() {
		return getConstString(offset + 109, $psppl_grp_cd4);
	}

	/**
	 * Payee classification cd. 4 支払先分類ＣＤ４.<p>
	 *
	 */
	public void psppl_grp_cd4(String value) {
		setConstString(offset + 109, $psppl_grp_cd4, value);
	}


	/**
	 * Payee classification name 4 支払先分類名４.<p>
	 *
	 */
	public String psppl_grp_nm4() {
		return getConstString(offset + 110, $psppl_grp_nm4);
	}

	/**
	 * Payee classification name 4 支払先分類名４.<p>
	 *
	 */
	public void psppl_grp_nm4(String value) {
		setConstString(offset + 110, $psppl_grp_nm4, value);
	}


	/**
	 * Payee classification 5 search target 支払先分類５検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg5() {
		return getConstBoolean(offset + 111, $psppl_grp_flg5);
	}

	/**
	 * Payee classification 5 search target 支払先分類５検索対象.<p>
	 *
	 */
	public void psppl_grp_flg5(boolean value) {
		setConstBoolean(offset + 111, $psppl_grp_flg5, value);
	}


	/**
	 * Payee classification cd. 5 支払先分類ＣＤ５.<p>
	 *
	 */
	public String psppl_grp_cd5() {
		return getConstString(offset + 112, $psppl_grp_cd5);
	}

	/**
	 * Payee classification cd. 5 支払先分類ＣＤ５.<p>
	 *
	 */
	public void psppl_grp_cd5(String value) {
		setConstString(offset + 112, $psppl_grp_cd5, value);
	}


	/**
	 * Payee classification name 5 支払先分類名５.<p>
	 *
	 */
	public String psppl_grp_nm5() {
		return getConstString(offset + 113, $psppl_grp_nm5);
	}

	/**
	 * Payee classification name 5 支払先分類名５.<p>
	 *
	 */
	public void psppl_grp_nm5(String value) {
		setConstString(offset + 113, $psppl_grp_nm5, value);
	}


	/**
	 * Payee classification 6 search target 支払先分類６検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg6() {
		return getConstBoolean(offset + 114, $psppl_grp_flg6);
	}

	/**
	 * Payee classification 6 search target 支払先分類６検索対象.<p>
	 *
	 */
	public void psppl_grp_flg6(boolean value) {
		setConstBoolean(offset + 114, $psppl_grp_flg6, value);
	}


	/**
	 * Payee classification cd. 6 支払先分類ＣＤ６.<p>
	 *
	 */
	public String psppl_grp_cd6() {
		return getConstString(offset + 115, $psppl_grp_cd6);
	}

	/**
	 * Payee classification cd. 6 支払先分類ＣＤ６.<p>
	 *
	 */
	public void psppl_grp_cd6(String value) {
		setConstString(offset + 115, $psppl_grp_cd6, value);
	}


	/**
	 * Payee classification name 6 支払先分類名６.<p>
	 *
	 */
	public String psppl_grp_nm6() {
		return getConstString(offset + 116, $psppl_grp_nm6);
	}

	/**
	 * Payee classification name 6 支払先分類名６.<p>
	 *
	 */
	public void psppl_grp_nm6(String value) {
		setConstString(offset + 116, $psppl_grp_nm6, value);
	}


	/**
	 * Payee classification 7 search target 支払先分類７検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg7() {
		return getConstBoolean(offset + 117, $psppl_grp_flg7);
	}

	/**
	 * Payee classification 7 search target 支払先分類７検索対象.<p>
	 *
	 */
	public void psppl_grp_flg7(boolean value) {
		setConstBoolean(offset + 117, $psppl_grp_flg7, value);
	}


	/**
	 * Payee classification cd. 7 支払先分類ＣＤ７.<p>
	 *
	 */
	public String psppl_grp_cd7() {
		return getConstString(offset + 118, $psppl_grp_cd7);
	}

	/**
	 * Payee classification cd. 7 支払先分類ＣＤ７.<p>
	 *
	 */
	public void psppl_grp_cd7(String value) {
		setConstString(offset + 118, $psppl_grp_cd7, value);
	}


	/**
	 * Payee classification name 7 支払先分類名７.<p>
	 *
	 */
	public String psppl_grp_nm7() {
		return getConstString(offset + 119, $psppl_grp_nm7);
	}

	/**
	 * Payee classification name 7 支払先分類名７.<p>
	 *
	 */
	public void psppl_grp_nm7(String value) {
		setConstString(offset + 119, $psppl_grp_nm7, value);
	}


	/**
	 * Payee classification 8 search target 支払先分類８検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg8() {
		return getConstBoolean(offset + 120, $psppl_grp_flg8);
	}

	/**
	 * Payee classification 8 search target 支払先分類８検索対象.<p>
	 *
	 */
	public void psppl_grp_flg8(boolean value) {
		setConstBoolean(offset + 120, $psppl_grp_flg8, value);
	}


	/**
	 * Payee classification cd. 8 支払先分類ＣＤ８.<p>
	 *
	 */
	public String psppl_grp_cd8() {
		return getConstString(offset + 121, $psppl_grp_cd8);
	}

	/**
	 * Payee classification cd. 8 支払先分類ＣＤ８.<p>
	 *
	 */
	public void psppl_grp_cd8(String value) {
		setConstString(offset + 121, $psppl_grp_cd8, value);
	}


	/**
	 * Payee classification name 8 支払先分類名８.<p>
	 *
	 */
	public String psppl_grp_nm8() {
		return getConstString(offset + 122, $psppl_grp_nm8);
	}

	/**
	 * Payee classification name 8 支払先分類名８.<p>
	 *
	 */
	public void psppl_grp_nm8(String value) {
		setConstString(offset + 122, $psppl_grp_nm8, value);
	}


	/**
	 * Payee classification 9 search target 支払先分類９検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg9() {
		return getConstBoolean(offset + 123, $psppl_grp_flg9);
	}

	/**
	 * Payee classification 9 search target 支払先分類９検索対象.<p>
	 *
	 */
	public void psppl_grp_flg9(boolean value) {
		setConstBoolean(offset + 123, $psppl_grp_flg9, value);
	}


	/**
	 * Payee classification cd. 9 支払先分類ＣＤ９.<p>
	 *
	 */
	public String psppl_grp_cd9() {
		return getConstString(offset + 124, $psppl_grp_cd9);
	}

	/**
	 * Payee classification cd. 9 支払先分類ＣＤ９.<p>
	 *
	 */
	public void psppl_grp_cd9(String value) {
		setConstString(offset + 124, $psppl_grp_cd9, value);
	}


	/**
	 * Payee classification name 9 支払先分類名９.<p>
	 *
	 */
	public String psppl_grp_nm9() {
		return getConstString(offset + 125, $psppl_grp_nm9);
	}

	/**
	 * Payee classification name 9 支払先分類名９.<p>
	 *
	 */
	public void psppl_grp_nm9(String value) {
		setConstString(offset + 125, $psppl_grp_nm9, value);
	}


	/**
	 * Payee classification 10 search target 支払先分類１０検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg10() {
		return getConstBoolean(offset + 126, $psppl_grp_flg10);
	}

	/**
	 * Payee classification 10 search target 支払先分類１０検索対象.<p>
	 *
	 */
	public void psppl_grp_flg10(boolean value) {
		setConstBoolean(offset + 126, $psppl_grp_flg10, value);
	}


	/**
	 * Payee classification cd. 10 支払先分類ＣＤ１０.<p>
	 *
	 */
	public String psppl_grp_cd10() {
		return getConstString(offset + 127, $psppl_grp_cd10);
	}

	/**
	 * Payee classification cd. 10 支払先分類ＣＤ１０.<p>
	 *
	 */
	public void psppl_grp_cd10(String value) {
		setConstString(offset + 127, $psppl_grp_cd10, value);
	}


	/**
	 * Payee classification name 10 支払先分類名１０.<p>
	 *
	 */
	public String psppl_grp_nm10() {
		return getConstString(offset + 128, $psppl_grp_nm10);
	}

	/**
	 * Payee classification name 10 支払先分類名１０.<p>
	 *
	 */
	public void psppl_grp_nm10(String value) {
		setConstString(offset + 128, $psppl_grp_nm10, value);
	}


	public String getString(String name) {
		if ($mode.equalsIgnoreCase(name)) {
			return mode();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($pay_schd_print_rmrks.equalsIgnoreCase(name)) {
			return pay_schd_print_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
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
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($bsppl_grp_cd1.equalsIgnoreCase(name)) {
			return bsppl_grp_cd1();
		}
		if ($bsppl_grp_nm1.equalsIgnoreCase(name)) {
			return bsppl_grp_nm1();
		}
		if ($bsppl_grp_cd2.equalsIgnoreCase(name)) {
			return bsppl_grp_cd2();
		}
		if ($bsppl_grp_nm2.equalsIgnoreCase(name)) {
			return bsppl_grp_nm2();
		}
		if ($bsppl_grp_cd3.equalsIgnoreCase(name)) {
			return bsppl_grp_cd3();
		}
		if ($bsppl_grp_nm3.equalsIgnoreCase(name)) {
			return bsppl_grp_nm3();
		}
		if ($bsppl_grp_cd4.equalsIgnoreCase(name)) {
			return bsppl_grp_cd4();
		}
		if ($bsppl_grp_nm4.equalsIgnoreCase(name)) {
			return bsppl_grp_nm4();
		}
		if ($bsppl_grp_cd5.equalsIgnoreCase(name)) {
			return bsppl_grp_cd5();
		}
		if ($bsppl_grp_nm5.equalsIgnoreCase(name)) {
			return bsppl_grp_nm5();
		}
		if ($bsppl_grp_cd6.equalsIgnoreCase(name)) {
			return bsppl_grp_cd6();
		}
		if ($bsppl_grp_nm6.equalsIgnoreCase(name)) {
			return bsppl_grp_nm6();
		}
		if ($bsppl_grp_cd7.equalsIgnoreCase(name)) {
			return bsppl_grp_cd7();
		}
		if ($bsppl_grp_nm7.equalsIgnoreCase(name)) {
			return bsppl_grp_nm7();
		}
		if ($bsppl_grp_cd8.equalsIgnoreCase(name)) {
			return bsppl_grp_cd8();
		}
		if ($bsppl_grp_nm8.equalsIgnoreCase(name)) {
			return bsppl_grp_nm8();
		}
		if ($bsppl_grp_cd9.equalsIgnoreCase(name)) {
			return bsppl_grp_cd9();
		}
		if ($bsppl_grp_nm9.equalsIgnoreCase(name)) {
			return bsppl_grp_nm9();
		}
		if ($bsppl_grp_cd10.equalsIgnoreCase(name)) {
			return bsppl_grp_cd10();
		}
		if ($bsppl_grp_nm10.equalsIgnoreCase(name)) {
			return bsppl_grp_nm10();
		}
		if ($psppl_grp_cd1.equalsIgnoreCase(name)) {
			return psppl_grp_cd1();
		}
		if ($psppl_grp_nm1.equalsIgnoreCase(name)) {
			return psppl_grp_nm1();
		}
		if ($psppl_grp_cd2.equalsIgnoreCase(name)) {
			return psppl_grp_cd2();
		}
		if ($psppl_grp_nm2.equalsIgnoreCase(name)) {
			return psppl_grp_nm2();
		}
		if ($psppl_grp_cd3.equalsIgnoreCase(name)) {
			return psppl_grp_cd3();
		}
		if ($psppl_grp_nm3.equalsIgnoreCase(name)) {
			return psppl_grp_nm3();
		}
		if ($psppl_grp_cd4.equalsIgnoreCase(name)) {
			return psppl_grp_cd4();
		}
		if ($psppl_grp_nm4.equalsIgnoreCase(name)) {
			return psppl_grp_nm4();
		}
		if ($psppl_grp_cd5.equalsIgnoreCase(name)) {
			return psppl_grp_cd5();
		}
		if ($psppl_grp_nm5.equalsIgnoreCase(name)) {
			return psppl_grp_nm5();
		}
		if ($psppl_grp_cd6.equalsIgnoreCase(name)) {
			return psppl_grp_cd6();
		}
		if ($psppl_grp_nm6.equalsIgnoreCase(name)) {
			return psppl_grp_nm6();
		}
		if ($psppl_grp_cd7.equalsIgnoreCase(name)) {
			return psppl_grp_cd7();
		}
		if ($psppl_grp_nm7.equalsIgnoreCase(name)) {
			return psppl_grp_nm7();
		}
		if ($psppl_grp_cd8.equalsIgnoreCase(name)) {
			return psppl_grp_cd8();
		}
		if ($psppl_grp_nm8.equalsIgnoreCase(name)) {
			return psppl_grp_nm8();
		}
		if ($psppl_grp_cd9.equalsIgnoreCase(name)) {
			return psppl_grp_cd9();
		}
		if ($psppl_grp_nm9.equalsIgnoreCase(name)) {
			return psppl_grp_nm9();
		}
		if ($psppl_grp_cd10.equalsIgnoreCase(name)) {
			return psppl_grp_cd10();
		}
		if ($psppl_grp_nm10.equalsIgnoreCase(name)) {
			return psppl_grp_nm10();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($pay_schd_act_dt_fr.equalsIgnoreCase(name)) {
			return pay_schd_act_dt_fr();
		}
		if ($pay_schd_act_dt_to.equalsIgnoreCase(name)) {
			return pay_schd_act_dt_to();
		}
		if ($rfrnc_dt.equalsIgnoreCase(name)) {
			return rfrnc_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($opn_flg.equalsIgnoreCase(name)) {
			return opn_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($acpt_flg.equalsIgnoreCase(name)) {
			return acpt_flg();
		}
		if ($rjct_flg.equalsIgnoreCase(name)) {
			return rjct_flg();
		}
		if ($last_rjct_flg.equalsIgnoreCase(name)) {
			return last_rjct_flg();
		}
		if ($excld_flg.equalsIgnoreCase(name)) {
			return excld_flg();
		}
		if ($dtl_flg.equalsIgnoreCase(name)) {
			return dtl_flg();
		}
		if ($inc_appl_flg.equalsIgnoreCase(name)) {
			return inc_appl_flg();
		}
		if ($inc_com_paid_flg.equalsIgnoreCase(name)) {
			return inc_com_paid_flg();
		}
		if ($bsppl_dpt_cd_flg.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd_flg();
		}
		if ($bsppl_dpt_nm_flg.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm_flg();
		}
		if ($wg_cd_flg.equalsIgnoreCase(name)) {
			return wg_cd_flg();
		}
		if ($bsppl_cd_flg.equalsIgnoreCase(name)) {
			return bsppl_cd_flg();
		}
		if ($ap_typ_flg.equalsIgnoreCase(name)) {
			return ap_typ_flg();
		}
		if ($pay_schd_dt_flg.equalsIgnoreCase(name)) {
			return pay_schd_dt_flg();
		}
		if ($ap_sttl_cd_flg.equalsIgnoreCase(name)) {
			return ap_sttl_cd_flg();
		}
		if ($ap_sttl_typ_flg.equalsIgnoreCase(name)) {
			return ap_sttl_typ_flg();
		}
		if ($bsppl_cl_ym_flg.equalsIgnoreCase(name)) {
			return bsppl_cl_ym_flg();
		}
		if ($bsppl_cl_day_flg.equalsIgnoreCase(name)) {
			return bsppl_cl_day_flg();
		}
		if ($trd_cur_cd_flg.equalsIgnoreCase(name)) {
			return trd_cur_cd_flg();
		}
		if ($pay_chk_no_flg.equalsIgnoreCase(name)) {
			return pay_chk_no_flg();
		}
		if ($pay_schd_no_flg.equalsIgnoreCase(name)) {
			return pay_schd_no_flg();
		}
		if ($rcpt_iv_no_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_no_flg();
		}
		if ($rcpt_iv_mng_no_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no_flg();
		}
		if ($purc_act_no_flg.equalsIgnoreCase(name)) {
			return purc_act_no_flg();
		}
		if ($wrk_no_flg.equalsIgnoreCase(name)) {
			return wrk_no_flg();
		}
		if ($psppl_cd_flg.equalsIgnoreCase(name)) {
			return psppl_cd_flg();
		}
		if ($pay_dpt_cd_flg.equalsIgnoreCase(name)) {
			return pay_dpt_cd_flg();
		}
		if ($pay_dpt_nm_flg.equalsIgnoreCase(name)) {
			return pay_dpt_nm_flg();
		}
		if ($asppl_cd_flg.equalsIgnoreCase(name)) {
			return asppl_cd_flg();
		}
		if ($pay_sts_typ_flg.equalsIgnoreCase(name)) {
			return pay_sts_typ_flg();
		}
		if ($ap_dpt_cd_flg.equalsIgnoreCase(name)) {
			return ap_dpt_cd_flg();
		}
		if ($ap_dpt_nm_flg.equalsIgnoreCase(name)) {
			return ap_dpt_nm_flg();
		}
		if ($pay_bank_ac_cd_flg.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd_flg();
		}
		if ($bank_ac_cd_flg.equalsIgnoreCase(name)) {
			return bank_ac_cd_flg();
		}
		if ($setoff_info_flg.equalsIgnoreCase(name)) {
			return setoff_info_flg();
		}
		if ($xrate_flg.equalsIgnoreCase(name)) {
			return xrate_flg();
		}
		if ($com_paid_tax_cd_flg.equalsIgnoreCase(name)) {
			return com_paid_tax_cd_flg();
		}
		if ($rcv_bill_no_flg.equalsIgnoreCase(name)) {
			return rcv_bill_no_flg();
		}
		if ($adv_pay_act_no_flg.equalsIgnoreCase(name)) {
			return adv_pay_act_no_flg();
		}
		if ($note_info_flg.equalsIgnoreCase(name)) {
			return note_info_flg();
		}
		if ($rmrks_flg.equalsIgnoreCase(name)) {
			return rmrks_flg();
		}
		if ($bsppl_grp_flg1.equalsIgnoreCase(name)) {
			return bsppl_grp_flg1();
		}
		if ($bsppl_grp_flg2.equalsIgnoreCase(name)) {
			return bsppl_grp_flg2();
		}
		if ($bsppl_grp_flg3.equalsIgnoreCase(name)) {
			return bsppl_grp_flg3();
		}
		if ($bsppl_grp_flg4.equalsIgnoreCase(name)) {
			return bsppl_grp_flg4();
		}
		if ($bsppl_grp_flg5.equalsIgnoreCase(name)) {
			return bsppl_grp_flg5();
		}
		if ($bsppl_grp_flg6.equalsIgnoreCase(name)) {
			return bsppl_grp_flg6();
		}
		if ($bsppl_grp_flg7.equalsIgnoreCase(name)) {
			return bsppl_grp_flg7();
		}
		if ($bsppl_grp_flg8.equalsIgnoreCase(name)) {
			return bsppl_grp_flg8();
		}
		if ($bsppl_grp_flg9.equalsIgnoreCase(name)) {
			return bsppl_grp_flg9();
		}
		if ($bsppl_grp_flg10.equalsIgnoreCase(name)) {
			return bsppl_grp_flg10();
		}
		if ($psppl_grp_flg1.equalsIgnoreCase(name)) {
			return psppl_grp_flg1();
		}
		if ($psppl_grp_flg2.equalsIgnoreCase(name)) {
			return psppl_grp_flg2();
		}
		if ($psppl_grp_flg3.equalsIgnoreCase(name)) {
			return psppl_grp_flg3();
		}
		if ($psppl_grp_flg4.equalsIgnoreCase(name)) {
			return psppl_grp_flg4();
		}
		if ($psppl_grp_flg5.equalsIgnoreCase(name)) {
			return psppl_grp_flg5();
		}
		if ($psppl_grp_flg6.equalsIgnoreCase(name)) {
			return psppl_grp_flg6();
		}
		if ($psppl_grp_flg7.equalsIgnoreCase(name)) {
			return psppl_grp_flg7();
		}
		if ($psppl_grp_flg8.equalsIgnoreCase(name)) {
			return psppl_grp_flg8();
		}
		if ($psppl_grp_flg9.equalsIgnoreCase(name)) {
			return psppl_grp_flg9();
		}
		if ($psppl_grp_flg10.equalsIgnoreCase(name)) {
			return psppl_grp_flg10();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mode.equalsIgnoreCase(name)) {
			return mode();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($pay_schd_print_rmrks.equalsIgnoreCase(name)) {
			return pay_schd_print_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
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
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($bsppl_grp_cd1.equalsIgnoreCase(name)) {
			return bsppl_grp_cd1();
		}
		if ($bsppl_grp_nm1.equalsIgnoreCase(name)) {
			return bsppl_grp_nm1();
		}
		if ($bsppl_grp_cd2.equalsIgnoreCase(name)) {
			return bsppl_grp_cd2();
		}
		if ($bsppl_grp_nm2.equalsIgnoreCase(name)) {
			return bsppl_grp_nm2();
		}
		if ($bsppl_grp_cd3.equalsIgnoreCase(name)) {
			return bsppl_grp_cd3();
		}
		if ($bsppl_grp_nm3.equalsIgnoreCase(name)) {
			return bsppl_grp_nm3();
		}
		if ($bsppl_grp_cd4.equalsIgnoreCase(name)) {
			return bsppl_grp_cd4();
		}
		if ($bsppl_grp_nm4.equalsIgnoreCase(name)) {
			return bsppl_grp_nm4();
		}
		if ($bsppl_grp_cd5.equalsIgnoreCase(name)) {
			return bsppl_grp_cd5();
		}
		if ($bsppl_grp_nm5.equalsIgnoreCase(name)) {
			return bsppl_grp_nm5();
		}
		if ($bsppl_grp_cd6.equalsIgnoreCase(name)) {
			return bsppl_grp_cd6();
		}
		if ($bsppl_grp_nm6.equalsIgnoreCase(name)) {
			return bsppl_grp_nm6();
		}
		if ($bsppl_grp_cd7.equalsIgnoreCase(name)) {
			return bsppl_grp_cd7();
		}
		if ($bsppl_grp_nm7.equalsIgnoreCase(name)) {
			return bsppl_grp_nm7();
		}
		if ($bsppl_grp_cd8.equalsIgnoreCase(name)) {
			return bsppl_grp_cd8();
		}
		if ($bsppl_grp_nm8.equalsIgnoreCase(name)) {
			return bsppl_grp_nm8();
		}
		if ($bsppl_grp_cd9.equalsIgnoreCase(name)) {
			return bsppl_grp_cd9();
		}
		if ($bsppl_grp_nm9.equalsIgnoreCase(name)) {
			return bsppl_grp_nm9();
		}
		if ($bsppl_grp_cd10.equalsIgnoreCase(name)) {
			return bsppl_grp_cd10();
		}
		if ($bsppl_grp_nm10.equalsIgnoreCase(name)) {
			return bsppl_grp_nm10();
		}
		if ($psppl_grp_cd1.equalsIgnoreCase(name)) {
			return psppl_grp_cd1();
		}
		if ($psppl_grp_nm1.equalsIgnoreCase(name)) {
			return psppl_grp_nm1();
		}
		if ($psppl_grp_cd2.equalsIgnoreCase(name)) {
			return psppl_grp_cd2();
		}
		if ($psppl_grp_nm2.equalsIgnoreCase(name)) {
			return psppl_grp_nm2();
		}
		if ($psppl_grp_cd3.equalsIgnoreCase(name)) {
			return psppl_grp_cd3();
		}
		if ($psppl_grp_nm3.equalsIgnoreCase(name)) {
			return psppl_grp_nm3();
		}
		if ($psppl_grp_cd4.equalsIgnoreCase(name)) {
			return psppl_grp_cd4();
		}
		if ($psppl_grp_nm4.equalsIgnoreCase(name)) {
			return psppl_grp_nm4();
		}
		if ($psppl_grp_cd5.equalsIgnoreCase(name)) {
			return psppl_grp_cd5();
		}
		if ($psppl_grp_nm5.equalsIgnoreCase(name)) {
			return psppl_grp_nm5();
		}
		if ($psppl_grp_cd6.equalsIgnoreCase(name)) {
			return psppl_grp_cd6();
		}
		if ($psppl_grp_nm6.equalsIgnoreCase(name)) {
			return psppl_grp_nm6();
		}
		if ($psppl_grp_cd7.equalsIgnoreCase(name)) {
			return psppl_grp_cd7();
		}
		if ($psppl_grp_nm7.equalsIgnoreCase(name)) {
			return psppl_grp_nm7();
		}
		if ($psppl_grp_cd8.equalsIgnoreCase(name)) {
			return psppl_grp_cd8();
		}
		if ($psppl_grp_nm8.equalsIgnoreCase(name)) {
			return psppl_grp_nm8();
		}
		if ($psppl_grp_cd9.equalsIgnoreCase(name)) {
			return psppl_grp_cd9();
		}
		if ($psppl_grp_nm9.equalsIgnoreCase(name)) {
			return psppl_grp_nm9();
		}
		if ($psppl_grp_cd10.equalsIgnoreCase(name)) {
			return psppl_grp_cd10();
		}
		if ($psppl_grp_nm10.equalsIgnoreCase(name)) {
			return psppl_grp_nm10();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($pay_schd_act_dt_fr.equalsIgnoreCase(name)) {
			return pay_schd_act_dt_fr();
		}
		if ($pay_schd_act_dt_to.equalsIgnoreCase(name)) {
			return pay_schd_act_dt_to();
		}
		if ($rfrnc_dt.equalsIgnoreCase(name)) {
			return rfrnc_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($opn_flg.equalsIgnoreCase(name)) {
			return opn_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($acpt_flg.equalsIgnoreCase(name)) {
			return acpt_flg();
		}
		if ($rjct_flg.equalsIgnoreCase(name)) {
			return rjct_flg();
		}
		if ($last_rjct_flg.equalsIgnoreCase(name)) {
			return last_rjct_flg();
		}
		if ($excld_flg.equalsIgnoreCase(name)) {
			return excld_flg();
		}
		if ($dtl_flg.equalsIgnoreCase(name)) {
			return dtl_flg();
		}
		if ($inc_appl_flg.equalsIgnoreCase(name)) {
			return inc_appl_flg();
		}
		if ($inc_com_paid_flg.equalsIgnoreCase(name)) {
			return inc_com_paid_flg();
		}
		if ($bsppl_dpt_cd_flg.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd_flg();
		}
		if ($bsppl_dpt_nm_flg.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm_flg();
		}
		if ($wg_cd_flg.equalsIgnoreCase(name)) {
			return wg_cd_flg();
		}
		if ($bsppl_cd_flg.equalsIgnoreCase(name)) {
			return bsppl_cd_flg();
		}
		if ($ap_typ_flg.equalsIgnoreCase(name)) {
			return ap_typ_flg();
		}
		if ($pay_schd_dt_flg.equalsIgnoreCase(name)) {
			return pay_schd_dt_flg();
		}
		if ($ap_sttl_cd_flg.equalsIgnoreCase(name)) {
			return ap_sttl_cd_flg();
		}
		if ($ap_sttl_typ_flg.equalsIgnoreCase(name)) {
			return ap_sttl_typ_flg();
		}
		if ($bsppl_cl_ym_flg.equalsIgnoreCase(name)) {
			return bsppl_cl_ym_flg();
		}
		if ($bsppl_cl_day_flg.equalsIgnoreCase(name)) {
			return bsppl_cl_day_flg();
		}
		if ($trd_cur_cd_flg.equalsIgnoreCase(name)) {
			return trd_cur_cd_flg();
		}
		if ($pay_chk_no_flg.equalsIgnoreCase(name)) {
			return pay_chk_no_flg();
		}
		if ($pay_schd_no_flg.equalsIgnoreCase(name)) {
			return pay_schd_no_flg();
		}
		if ($rcpt_iv_no_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_no_flg();
		}
		if ($rcpt_iv_mng_no_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no_flg();
		}
		if ($purc_act_no_flg.equalsIgnoreCase(name)) {
			return purc_act_no_flg();
		}
		if ($wrk_no_flg.equalsIgnoreCase(name)) {
			return wrk_no_flg();
		}
		if ($psppl_cd_flg.equalsIgnoreCase(name)) {
			return psppl_cd_flg();
		}
		if ($pay_dpt_cd_flg.equalsIgnoreCase(name)) {
			return pay_dpt_cd_flg();
		}
		if ($pay_dpt_nm_flg.equalsIgnoreCase(name)) {
			return pay_dpt_nm_flg();
		}
		if ($asppl_cd_flg.equalsIgnoreCase(name)) {
			return asppl_cd_flg();
		}
		if ($pay_sts_typ_flg.equalsIgnoreCase(name)) {
			return pay_sts_typ_flg();
		}
		if ($ap_dpt_cd_flg.equalsIgnoreCase(name)) {
			return ap_dpt_cd_flg();
		}
		if ($ap_dpt_nm_flg.equalsIgnoreCase(name)) {
			return ap_dpt_nm_flg();
		}
		if ($pay_bank_ac_cd_flg.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd_flg();
		}
		if ($bank_ac_cd_flg.equalsIgnoreCase(name)) {
			return bank_ac_cd_flg();
		}
		if ($setoff_info_flg.equalsIgnoreCase(name)) {
			return setoff_info_flg();
		}
		if ($xrate_flg.equalsIgnoreCase(name)) {
			return xrate_flg();
		}
		if ($com_paid_tax_cd_flg.equalsIgnoreCase(name)) {
			return com_paid_tax_cd_flg();
		}
		if ($rcv_bill_no_flg.equalsIgnoreCase(name)) {
			return rcv_bill_no_flg();
		}
		if ($adv_pay_act_no_flg.equalsIgnoreCase(name)) {
			return adv_pay_act_no_flg();
		}
		if ($note_info_flg.equalsIgnoreCase(name)) {
			return note_info_flg();
		}
		if ($rmrks_flg.equalsIgnoreCase(name)) {
			return rmrks_flg();
		}
		if ($bsppl_grp_flg1.equalsIgnoreCase(name)) {
			return bsppl_grp_flg1();
		}
		if ($bsppl_grp_flg2.equalsIgnoreCase(name)) {
			return bsppl_grp_flg2();
		}
		if ($bsppl_grp_flg3.equalsIgnoreCase(name)) {
			return bsppl_grp_flg3();
		}
		if ($bsppl_grp_flg4.equalsIgnoreCase(name)) {
			return bsppl_grp_flg4();
		}
		if ($bsppl_grp_flg5.equalsIgnoreCase(name)) {
			return bsppl_grp_flg5();
		}
		if ($bsppl_grp_flg6.equalsIgnoreCase(name)) {
			return bsppl_grp_flg6();
		}
		if ($bsppl_grp_flg7.equalsIgnoreCase(name)) {
			return bsppl_grp_flg7();
		}
		if ($bsppl_grp_flg8.equalsIgnoreCase(name)) {
			return bsppl_grp_flg8();
		}
		if ($bsppl_grp_flg9.equalsIgnoreCase(name)) {
			return bsppl_grp_flg9();
		}
		if ($bsppl_grp_flg10.equalsIgnoreCase(name)) {
			return bsppl_grp_flg10();
		}
		if ($psppl_grp_flg1.equalsIgnoreCase(name)) {
			return psppl_grp_flg1();
		}
		if ($psppl_grp_flg2.equalsIgnoreCase(name)) {
			return psppl_grp_flg2();
		}
		if ($psppl_grp_flg3.equalsIgnoreCase(name)) {
			return psppl_grp_flg3();
		}
		if ($psppl_grp_flg4.equalsIgnoreCase(name)) {
			return psppl_grp_flg4();
		}
		if ($psppl_grp_flg5.equalsIgnoreCase(name)) {
			return psppl_grp_flg5();
		}
		if ($psppl_grp_flg6.equalsIgnoreCase(name)) {
			return psppl_grp_flg6();
		}
		if ($psppl_grp_flg7.equalsIgnoreCase(name)) {
			return psppl_grp_flg7();
		}
		if ($psppl_grp_flg8.equalsIgnoreCase(name)) {
			return psppl_grp_flg8();
		}
		if ($psppl_grp_flg9.equalsIgnoreCase(name)) {
			return psppl_grp_flg9();
		}
		if ($psppl_grp_flg10.equalsIgnoreCase(name)) {
			return psppl_grp_flg10();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mode.equalsIgnoreCase(name)) {
			mode(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			bsppl_dpt_nm(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
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
		if ($pay_schd_print_rmrks.equalsIgnoreCase(name)) {
			pay_schd_print_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
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
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			psppl_nm(value);
			return;
		}
		if ($bsppl_grp_cd1.equalsIgnoreCase(name)) {
			bsppl_grp_cd1(value);
			return;
		}
		if ($bsppl_grp_nm1.equalsIgnoreCase(name)) {
			bsppl_grp_nm1(value);
			return;
		}
		if ($bsppl_grp_cd2.equalsIgnoreCase(name)) {
			bsppl_grp_cd2(value);
			return;
		}
		if ($bsppl_grp_nm2.equalsIgnoreCase(name)) {
			bsppl_grp_nm2(value);
			return;
		}
		if ($bsppl_grp_cd3.equalsIgnoreCase(name)) {
			bsppl_grp_cd3(value);
			return;
		}
		if ($bsppl_grp_nm3.equalsIgnoreCase(name)) {
			bsppl_grp_nm3(value);
			return;
		}
		if ($bsppl_grp_cd4.equalsIgnoreCase(name)) {
			bsppl_grp_cd4(value);
			return;
		}
		if ($bsppl_grp_nm4.equalsIgnoreCase(name)) {
			bsppl_grp_nm4(value);
			return;
		}
		if ($bsppl_grp_cd5.equalsIgnoreCase(name)) {
			bsppl_grp_cd5(value);
			return;
		}
		if ($bsppl_grp_nm5.equalsIgnoreCase(name)) {
			bsppl_grp_nm5(value);
			return;
		}
		if ($bsppl_grp_cd6.equalsIgnoreCase(name)) {
			bsppl_grp_cd6(value);
			return;
		}
		if ($bsppl_grp_nm6.equalsIgnoreCase(name)) {
			bsppl_grp_nm6(value);
			return;
		}
		if ($bsppl_grp_cd7.equalsIgnoreCase(name)) {
			bsppl_grp_cd7(value);
			return;
		}
		if ($bsppl_grp_nm7.equalsIgnoreCase(name)) {
			bsppl_grp_nm7(value);
			return;
		}
		if ($bsppl_grp_cd8.equalsIgnoreCase(name)) {
			bsppl_grp_cd8(value);
			return;
		}
		if ($bsppl_grp_nm8.equalsIgnoreCase(name)) {
			bsppl_grp_nm8(value);
			return;
		}
		if ($bsppl_grp_cd9.equalsIgnoreCase(name)) {
			bsppl_grp_cd9(value);
			return;
		}
		if ($bsppl_grp_nm9.equalsIgnoreCase(name)) {
			bsppl_grp_nm9(value);
			return;
		}
		if ($bsppl_grp_cd10.equalsIgnoreCase(name)) {
			bsppl_grp_cd10(value);
			return;
		}
		if ($bsppl_grp_nm10.equalsIgnoreCase(name)) {
			bsppl_grp_nm10(value);
			return;
		}
		if ($psppl_grp_cd1.equalsIgnoreCase(name)) {
			psppl_grp_cd1(value);
			return;
		}
		if ($psppl_grp_nm1.equalsIgnoreCase(name)) {
			psppl_grp_nm1(value);
			return;
		}
		if ($psppl_grp_cd2.equalsIgnoreCase(name)) {
			psppl_grp_cd2(value);
			return;
		}
		if ($psppl_grp_nm2.equalsIgnoreCase(name)) {
			psppl_grp_nm2(value);
			return;
		}
		if ($psppl_grp_cd3.equalsIgnoreCase(name)) {
			psppl_grp_cd3(value);
			return;
		}
		if ($psppl_grp_nm3.equalsIgnoreCase(name)) {
			psppl_grp_nm3(value);
			return;
		}
		if ($psppl_grp_cd4.equalsIgnoreCase(name)) {
			psppl_grp_cd4(value);
			return;
		}
		if ($psppl_grp_nm4.equalsIgnoreCase(name)) {
			psppl_grp_nm4(value);
			return;
		}
		if ($psppl_grp_cd5.equalsIgnoreCase(name)) {
			psppl_grp_cd5(value);
			return;
		}
		if ($psppl_grp_nm5.equalsIgnoreCase(name)) {
			psppl_grp_nm5(value);
			return;
		}
		if ($psppl_grp_cd6.equalsIgnoreCase(name)) {
			psppl_grp_cd6(value);
			return;
		}
		if ($psppl_grp_nm6.equalsIgnoreCase(name)) {
			psppl_grp_nm6(value);
			return;
		}
		if ($psppl_grp_cd7.equalsIgnoreCase(name)) {
			psppl_grp_cd7(value);
			return;
		}
		if ($psppl_grp_nm7.equalsIgnoreCase(name)) {
			psppl_grp_nm7(value);
			return;
		}
		if ($psppl_grp_cd8.equalsIgnoreCase(name)) {
			psppl_grp_cd8(value);
			return;
		}
		if ($psppl_grp_nm8.equalsIgnoreCase(name)) {
			psppl_grp_nm8(value);
			return;
		}
		if ($psppl_grp_cd9.equalsIgnoreCase(name)) {
			psppl_grp_cd9(value);
			return;
		}
		if ($psppl_grp_nm9.equalsIgnoreCase(name)) {
			psppl_grp_nm9(value);
			return;
		}
		if ($psppl_grp_cd10.equalsIgnoreCase(name)) {
			psppl_grp_cd10(value);
			return;
		}
		if ($psppl_grp_nm10.equalsIgnoreCase(name)) {
			psppl_grp_nm10(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($pay_schd_act_dt_fr.equalsIgnoreCase(name)) {
			pay_schd_act_dt_fr(value);
			return;
		}
		if ($pay_schd_act_dt_to.equalsIgnoreCase(name)) {
			pay_schd_act_dt_to(value);
			return;
		}
		if ($rfrnc_dt.equalsIgnoreCase(name)) {
			rfrnc_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($opn_flg.equalsIgnoreCase(name)) {
			opn_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($acpt_flg.equalsIgnoreCase(name)) {
			acpt_flg(value);
			return;
		}
		if ($rjct_flg.equalsIgnoreCase(name)) {
			rjct_flg(value);
			return;
		}
		if ($last_rjct_flg.equalsIgnoreCase(name)) {
			last_rjct_flg(value);
			return;
		}
		if ($excld_flg.equalsIgnoreCase(name)) {
			excld_flg(value);
			return;
		}
		if ($dtl_flg.equalsIgnoreCase(name)) {
			dtl_flg(value);
			return;
		}
		if ($inc_appl_flg.equalsIgnoreCase(name)) {
			inc_appl_flg(value);
			return;
		}
		if ($inc_com_paid_flg.equalsIgnoreCase(name)) {
			inc_com_paid_flg(value);
			return;
		}
		if ($bsppl_dpt_cd_flg.equalsIgnoreCase(name)) {
			bsppl_dpt_cd_flg(value);
			return;
		}
		if ($bsppl_dpt_nm_flg.equalsIgnoreCase(name)) {
			bsppl_dpt_nm_flg(value);
			return;
		}
		if ($wg_cd_flg.equalsIgnoreCase(name)) {
			wg_cd_flg(value);
			return;
		}
		if ($bsppl_cd_flg.equalsIgnoreCase(name)) {
			bsppl_cd_flg(value);
			return;
		}
		if ($ap_typ_flg.equalsIgnoreCase(name)) {
			ap_typ_flg(value);
			return;
		}
		if ($pay_schd_dt_flg.equalsIgnoreCase(name)) {
			pay_schd_dt_flg(value);
			return;
		}
		if ($ap_sttl_cd_flg.equalsIgnoreCase(name)) {
			ap_sttl_cd_flg(value);
			return;
		}
		if ($ap_sttl_typ_flg.equalsIgnoreCase(name)) {
			ap_sttl_typ_flg(value);
			return;
		}
		if ($bsppl_cl_ym_flg.equalsIgnoreCase(name)) {
			bsppl_cl_ym_flg(value);
			return;
		}
		if ($bsppl_cl_day_flg.equalsIgnoreCase(name)) {
			bsppl_cl_day_flg(value);
			return;
		}
		if ($trd_cur_cd_flg.equalsIgnoreCase(name)) {
			trd_cur_cd_flg(value);
			return;
		}
		if ($pay_chk_no_flg.equalsIgnoreCase(name)) {
			pay_chk_no_flg(value);
			return;
		}
		if ($pay_schd_no_flg.equalsIgnoreCase(name)) {
			pay_schd_no_flg(value);
			return;
		}
		if ($rcpt_iv_no_flg.equalsIgnoreCase(name)) {
			rcpt_iv_no_flg(value);
			return;
		}
		if ($rcpt_iv_mng_no_flg.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no_flg(value);
			return;
		}
		if ($purc_act_no_flg.equalsIgnoreCase(name)) {
			purc_act_no_flg(value);
			return;
		}
		if ($wrk_no_flg.equalsIgnoreCase(name)) {
			wrk_no_flg(value);
			return;
		}
		if ($psppl_cd_flg.equalsIgnoreCase(name)) {
			psppl_cd_flg(value);
			return;
		}
		if ($pay_dpt_cd_flg.equalsIgnoreCase(name)) {
			pay_dpt_cd_flg(value);
			return;
		}
		if ($pay_dpt_nm_flg.equalsIgnoreCase(name)) {
			pay_dpt_nm_flg(value);
			return;
		}
		if ($asppl_cd_flg.equalsIgnoreCase(name)) {
			asppl_cd_flg(value);
			return;
		}
		if ($pay_sts_typ_flg.equalsIgnoreCase(name)) {
			pay_sts_typ_flg(value);
			return;
		}
		if ($ap_dpt_cd_flg.equalsIgnoreCase(name)) {
			ap_dpt_cd_flg(value);
			return;
		}
		if ($ap_dpt_nm_flg.equalsIgnoreCase(name)) {
			ap_dpt_nm_flg(value);
			return;
		}
		if ($pay_bank_ac_cd_flg.equalsIgnoreCase(name)) {
			pay_bank_ac_cd_flg(value);
			return;
		}
		if ($bank_ac_cd_flg.equalsIgnoreCase(name)) {
			bank_ac_cd_flg(value);
			return;
		}
		if ($setoff_info_flg.equalsIgnoreCase(name)) {
			setoff_info_flg(value);
			return;
		}
		if ($xrate_flg.equalsIgnoreCase(name)) {
			xrate_flg(value);
			return;
		}
		if ($com_paid_tax_cd_flg.equalsIgnoreCase(name)) {
			com_paid_tax_cd_flg(value);
			return;
		}
		if ($rcv_bill_no_flg.equalsIgnoreCase(name)) {
			rcv_bill_no_flg(value);
			return;
		}
		if ($adv_pay_act_no_flg.equalsIgnoreCase(name)) {
			adv_pay_act_no_flg(value);
			return;
		}
		if ($note_info_flg.equalsIgnoreCase(name)) {
			note_info_flg(value);
			return;
		}
		if ($rmrks_flg.equalsIgnoreCase(name)) {
			rmrks_flg(value);
			return;
		}
		if ($bsppl_grp_flg1.equalsIgnoreCase(name)) {
			bsppl_grp_flg1(value);
			return;
		}
		if ($bsppl_grp_flg2.equalsIgnoreCase(name)) {
			bsppl_grp_flg2(value);
			return;
		}
		if ($bsppl_grp_flg3.equalsIgnoreCase(name)) {
			bsppl_grp_flg3(value);
			return;
		}
		if ($bsppl_grp_flg4.equalsIgnoreCase(name)) {
			bsppl_grp_flg4(value);
			return;
		}
		if ($bsppl_grp_flg5.equalsIgnoreCase(name)) {
			bsppl_grp_flg5(value);
			return;
		}
		if ($bsppl_grp_flg6.equalsIgnoreCase(name)) {
			bsppl_grp_flg6(value);
			return;
		}
		if ($bsppl_grp_flg7.equalsIgnoreCase(name)) {
			bsppl_grp_flg7(value);
			return;
		}
		if ($bsppl_grp_flg8.equalsIgnoreCase(name)) {
			bsppl_grp_flg8(value);
			return;
		}
		if ($bsppl_grp_flg9.equalsIgnoreCase(name)) {
			bsppl_grp_flg9(value);
			return;
		}
		if ($bsppl_grp_flg10.equalsIgnoreCase(name)) {
			bsppl_grp_flg10(value);
			return;
		}
		if ($psppl_grp_flg1.equalsIgnoreCase(name)) {
			psppl_grp_flg1(value);
			return;
		}
		if ($psppl_grp_flg2.equalsIgnoreCase(name)) {
			psppl_grp_flg2(value);
			return;
		}
		if ($psppl_grp_flg3.equalsIgnoreCase(name)) {
			psppl_grp_flg3(value);
			return;
		}
		if ($psppl_grp_flg4.equalsIgnoreCase(name)) {
			psppl_grp_flg4(value);
			return;
		}
		if ($psppl_grp_flg5.equalsIgnoreCase(name)) {
			psppl_grp_flg5(value);
			return;
		}
		if ($psppl_grp_flg6.equalsIgnoreCase(name)) {
			psppl_grp_flg6(value);
			return;
		}
		if ($psppl_grp_flg7.equalsIgnoreCase(name)) {
			psppl_grp_flg7(value);
			return;
		}
		if ($psppl_grp_flg8.equalsIgnoreCase(name)) {
			psppl_grp_flg8(value);
			return;
		}
		if ($psppl_grp_flg9.equalsIgnoreCase(name)) {
			psppl_grp_flg9(value);
			return;
		}
		if ($psppl_grp_flg10.equalsIgnoreCase(name)) {
			psppl_grp_flg10(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mode.equalsIgnoreCase(name)) {
			mode(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			bsppl_dpt_nm(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
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
		if ($pay_schd_print_rmrks.equalsIgnoreCase(name)) {
			pay_schd_print_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
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
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			psppl_nm(value);
			return;
		}
		if ($bsppl_grp_cd1.equalsIgnoreCase(name)) {
			bsppl_grp_cd1(value);
			return;
		}
		if ($bsppl_grp_nm1.equalsIgnoreCase(name)) {
			bsppl_grp_nm1(value);
			return;
		}
		if ($bsppl_grp_cd2.equalsIgnoreCase(name)) {
			bsppl_grp_cd2(value);
			return;
		}
		if ($bsppl_grp_nm2.equalsIgnoreCase(name)) {
			bsppl_grp_nm2(value);
			return;
		}
		if ($bsppl_grp_cd3.equalsIgnoreCase(name)) {
			bsppl_grp_cd3(value);
			return;
		}
		if ($bsppl_grp_nm3.equalsIgnoreCase(name)) {
			bsppl_grp_nm3(value);
			return;
		}
		if ($bsppl_grp_cd4.equalsIgnoreCase(name)) {
			bsppl_grp_cd4(value);
			return;
		}
		if ($bsppl_grp_nm4.equalsIgnoreCase(name)) {
			bsppl_grp_nm4(value);
			return;
		}
		if ($bsppl_grp_cd5.equalsIgnoreCase(name)) {
			bsppl_grp_cd5(value);
			return;
		}
		if ($bsppl_grp_nm5.equalsIgnoreCase(name)) {
			bsppl_grp_nm5(value);
			return;
		}
		if ($bsppl_grp_cd6.equalsIgnoreCase(name)) {
			bsppl_grp_cd6(value);
			return;
		}
		if ($bsppl_grp_nm6.equalsIgnoreCase(name)) {
			bsppl_grp_nm6(value);
			return;
		}
		if ($bsppl_grp_cd7.equalsIgnoreCase(name)) {
			bsppl_grp_cd7(value);
			return;
		}
		if ($bsppl_grp_nm7.equalsIgnoreCase(name)) {
			bsppl_grp_nm7(value);
			return;
		}
		if ($bsppl_grp_cd8.equalsIgnoreCase(name)) {
			bsppl_grp_cd8(value);
			return;
		}
		if ($bsppl_grp_nm8.equalsIgnoreCase(name)) {
			bsppl_grp_nm8(value);
			return;
		}
		if ($bsppl_grp_cd9.equalsIgnoreCase(name)) {
			bsppl_grp_cd9(value);
			return;
		}
		if ($bsppl_grp_nm9.equalsIgnoreCase(name)) {
			bsppl_grp_nm9(value);
			return;
		}
		if ($bsppl_grp_cd10.equalsIgnoreCase(name)) {
			bsppl_grp_cd10(value);
			return;
		}
		if ($bsppl_grp_nm10.equalsIgnoreCase(name)) {
			bsppl_grp_nm10(value);
			return;
		}
		if ($psppl_grp_cd1.equalsIgnoreCase(name)) {
			psppl_grp_cd1(value);
			return;
		}
		if ($psppl_grp_nm1.equalsIgnoreCase(name)) {
			psppl_grp_nm1(value);
			return;
		}
		if ($psppl_grp_cd2.equalsIgnoreCase(name)) {
			psppl_grp_cd2(value);
			return;
		}
		if ($psppl_grp_nm2.equalsIgnoreCase(name)) {
			psppl_grp_nm2(value);
			return;
		}
		if ($psppl_grp_cd3.equalsIgnoreCase(name)) {
			psppl_grp_cd3(value);
			return;
		}
		if ($psppl_grp_nm3.equalsIgnoreCase(name)) {
			psppl_grp_nm3(value);
			return;
		}
		if ($psppl_grp_cd4.equalsIgnoreCase(name)) {
			psppl_grp_cd4(value);
			return;
		}
		if ($psppl_grp_nm4.equalsIgnoreCase(name)) {
			psppl_grp_nm4(value);
			return;
		}
		if ($psppl_grp_cd5.equalsIgnoreCase(name)) {
			psppl_grp_cd5(value);
			return;
		}
		if ($psppl_grp_nm5.equalsIgnoreCase(name)) {
			psppl_grp_nm5(value);
			return;
		}
		if ($psppl_grp_cd6.equalsIgnoreCase(name)) {
			psppl_grp_cd6(value);
			return;
		}
		if ($psppl_grp_nm6.equalsIgnoreCase(name)) {
			psppl_grp_nm6(value);
			return;
		}
		if ($psppl_grp_cd7.equalsIgnoreCase(name)) {
			psppl_grp_cd7(value);
			return;
		}
		if ($psppl_grp_nm7.equalsIgnoreCase(name)) {
			psppl_grp_nm7(value);
			return;
		}
		if ($psppl_grp_cd8.equalsIgnoreCase(name)) {
			psppl_grp_cd8(value);
			return;
		}
		if ($psppl_grp_nm8.equalsIgnoreCase(name)) {
			psppl_grp_nm8(value);
			return;
		}
		if ($psppl_grp_cd9.equalsIgnoreCase(name)) {
			psppl_grp_cd9(value);
			return;
		}
		if ($psppl_grp_nm9.equalsIgnoreCase(name)) {
			psppl_grp_nm9(value);
			return;
		}
		if ($psppl_grp_cd10.equalsIgnoreCase(name)) {
			psppl_grp_cd10(value);
			return;
		}
		if ($psppl_grp_nm10.equalsIgnoreCase(name)) {
			psppl_grp_nm10(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($pay_schd_act_dt_fr.equalsIgnoreCase(name)) {
			pay_schd_act_dt_fr(value);
			return;
		}
		if ($pay_schd_act_dt_to.equalsIgnoreCase(name)) {
			pay_schd_act_dt_to(value);
			return;
		}
		if ($rfrnc_dt.equalsIgnoreCase(name)) {
			rfrnc_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($opn_flg.equalsIgnoreCase(name)) {
			opn_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($acpt_flg.equalsIgnoreCase(name)) {
			acpt_flg(value);
			return;
		}
		if ($rjct_flg.equalsIgnoreCase(name)) {
			rjct_flg(value);
			return;
		}
		if ($last_rjct_flg.equalsIgnoreCase(name)) {
			last_rjct_flg(value);
			return;
		}
		if ($excld_flg.equalsIgnoreCase(name)) {
			excld_flg(value);
			return;
		}
		if ($dtl_flg.equalsIgnoreCase(name)) {
			dtl_flg(value);
			return;
		}
		if ($inc_appl_flg.equalsIgnoreCase(name)) {
			inc_appl_flg(value);
			return;
		}
		if ($inc_com_paid_flg.equalsIgnoreCase(name)) {
			inc_com_paid_flg(value);
			return;
		}
		if ($bsppl_dpt_cd_flg.equalsIgnoreCase(name)) {
			bsppl_dpt_cd_flg(value);
			return;
		}
		if ($bsppl_dpt_nm_flg.equalsIgnoreCase(name)) {
			bsppl_dpt_nm_flg(value);
			return;
		}
		if ($wg_cd_flg.equalsIgnoreCase(name)) {
			wg_cd_flg(value);
			return;
		}
		if ($bsppl_cd_flg.equalsIgnoreCase(name)) {
			bsppl_cd_flg(value);
			return;
		}
		if ($ap_typ_flg.equalsIgnoreCase(name)) {
			ap_typ_flg(value);
			return;
		}
		if ($pay_schd_dt_flg.equalsIgnoreCase(name)) {
			pay_schd_dt_flg(value);
			return;
		}
		if ($ap_sttl_cd_flg.equalsIgnoreCase(name)) {
			ap_sttl_cd_flg(value);
			return;
		}
		if ($ap_sttl_typ_flg.equalsIgnoreCase(name)) {
			ap_sttl_typ_flg(value);
			return;
		}
		if ($bsppl_cl_ym_flg.equalsIgnoreCase(name)) {
			bsppl_cl_ym_flg(value);
			return;
		}
		if ($bsppl_cl_day_flg.equalsIgnoreCase(name)) {
			bsppl_cl_day_flg(value);
			return;
		}
		if ($trd_cur_cd_flg.equalsIgnoreCase(name)) {
			trd_cur_cd_flg(value);
			return;
		}
		if ($pay_chk_no_flg.equalsIgnoreCase(name)) {
			pay_chk_no_flg(value);
			return;
		}
		if ($pay_schd_no_flg.equalsIgnoreCase(name)) {
			pay_schd_no_flg(value);
			return;
		}
		if ($rcpt_iv_no_flg.equalsIgnoreCase(name)) {
			rcpt_iv_no_flg(value);
			return;
		}
		if ($rcpt_iv_mng_no_flg.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no_flg(value);
			return;
		}
		if ($purc_act_no_flg.equalsIgnoreCase(name)) {
			purc_act_no_flg(value);
			return;
		}
		if ($wrk_no_flg.equalsIgnoreCase(name)) {
			wrk_no_flg(value);
			return;
		}
		if ($psppl_cd_flg.equalsIgnoreCase(name)) {
			psppl_cd_flg(value);
			return;
		}
		if ($pay_dpt_cd_flg.equalsIgnoreCase(name)) {
			pay_dpt_cd_flg(value);
			return;
		}
		if ($pay_dpt_nm_flg.equalsIgnoreCase(name)) {
			pay_dpt_nm_flg(value);
			return;
		}
		if ($asppl_cd_flg.equalsIgnoreCase(name)) {
			asppl_cd_flg(value);
			return;
		}
		if ($pay_sts_typ_flg.equalsIgnoreCase(name)) {
			pay_sts_typ_flg(value);
			return;
		}
		if ($ap_dpt_cd_flg.equalsIgnoreCase(name)) {
			ap_dpt_cd_flg(value);
			return;
		}
		if ($ap_dpt_nm_flg.equalsIgnoreCase(name)) {
			ap_dpt_nm_flg(value);
			return;
		}
		if ($pay_bank_ac_cd_flg.equalsIgnoreCase(name)) {
			pay_bank_ac_cd_flg(value);
			return;
		}
		if ($bank_ac_cd_flg.equalsIgnoreCase(name)) {
			bank_ac_cd_flg(value);
			return;
		}
		if ($setoff_info_flg.equalsIgnoreCase(name)) {
			setoff_info_flg(value);
			return;
		}
		if ($xrate_flg.equalsIgnoreCase(name)) {
			xrate_flg(value);
			return;
		}
		if ($com_paid_tax_cd_flg.equalsIgnoreCase(name)) {
			com_paid_tax_cd_flg(value);
			return;
		}
		if ($rcv_bill_no_flg.equalsIgnoreCase(name)) {
			rcv_bill_no_flg(value);
			return;
		}
		if ($adv_pay_act_no_flg.equalsIgnoreCase(name)) {
			adv_pay_act_no_flg(value);
			return;
		}
		if ($note_info_flg.equalsIgnoreCase(name)) {
			note_info_flg(value);
			return;
		}
		if ($rmrks_flg.equalsIgnoreCase(name)) {
			rmrks_flg(value);
			return;
		}
		if ($bsppl_grp_flg1.equalsIgnoreCase(name)) {
			bsppl_grp_flg1(value);
			return;
		}
		if ($bsppl_grp_flg2.equalsIgnoreCase(name)) {
			bsppl_grp_flg2(value);
			return;
		}
		if ($bsppl_grp_flg3.equalsIgnoreCase(name)) {
			bsppl_grp_flg3(value);
			return;
		}
		if ($bsppl_grp_flg4.equalsIgnoreCase(name)) {
			bsppl_grp_flg4(value);
			return;
		}
		if ($bsppl_grp_flg5.equalsIgnoreCase(name)) {
			bsppl_grp_flg5(value);
			return;
		}
		if ($bsppl_grp_flg6.equalsIgnoreCase(name)) {
			bsppl_grp_flg6(value);
			return;
		}
		if ($bsppl_grp_flg7.equalsIgnoreCase(name)) {
			bsppl_grp_flg7(value);
			return;
		}
		if ($bsppl_grp_flg8.equalsIgnoreCase(name)) {
			bsppl_grp_flg8(value);
			return;
		}
		if ($bsppl_grp_flg9.equalsIgnoreCase(name)) {
			bsppl_grp_flg9(value);
			return;
		}
		if ($bsppl_grp_flg10.equalsIgnoreCase(name)) {
			bsppl_grp_flg10(value);
			return;
		}
		if ($psppl_grp_flg1.equalsIgnoreCase(name)) {
			psppl_grp_flg1(value);
			return;
		}
		if ($psppl_grp_flg2.equalsIgnoreCase(name)) {
			psppl_grp_flg2(value);
			return;
		}
		if ($psppl_grp_flg3.equalsIgnoreCase(name)) {
			psppl_grp_flg3(value);
			return;
		}
		if ($psppl_grp_flg4.equalsIgnoreCase(name)) {
			psppl_grp_flg4(value);
			return;
		}
		if ($psppl_grp_flg5.equalsIgnoreCase(name)) {
			psppl_grp_flg5(value);
			return;
		}
		if ($psppl_grp_flg6.equalsIgnoreCase(name)) {
			psppl_grp_flg6(value);
			return;
		}
		if ($psppl_grp_flg7.equalsIgnoreCase(name)) {
			psppl_grp_flg7(value);
			return;
		}
		if ($psppl_grp_flg8.equalsIgnoreCase(name)) {
			psppl_grp_flg8(value);
			return;
		}
		if ($psppl_grp_flg9.equalsIgnoreCase(name)) {
			psppl_grp_flg9(value);
			return;
		}
		if ($psppl_grp_flg10.equalsIgnoreCase(name)) {
			psppl_grp_flg10(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

