package mcframe.serverMSBH.MSBHL0020;

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
	 * Operation type 操作種別.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public static final String $reg_dt = "reg_dt";
	/**
	 * Entry date FROM 登録日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $reg_dt_fr = "reg_dt_fr";
	/**
	 * Entry date TO 登録日ＴＯ.<p>
	 *
	 */
	public static final String $reg_dt_to = "reg_dt_to";
	/**
	 * Uncollated 未照合.<p>
	 *
	 */
	public static final String $unchk_flg = "unchk_flg";
	/**
	 * Schedule 予定.<p>
	 *
	 */
	public static final String $schd_flg = "schd_flg";
	/**
	 * Paid 支払済.<p>
	 *
	 */
	public static final String $act_flg = "act_flg";
	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public static final String $aprv_opn_flg = "aprv_opn_flg";
	/**
	 * Preliminary approval 一次承認済.<p>
	 *
	 */
	public static final String $aprv_fix_flg = "aprv_fix_flg";
	/**
	 * Final approval 最終承認済.<p>
	 *
	 */
	public static final String $aprv_acpt_flg = "aprv_acpt_flg";
	/**
	 * Reject 却下.<p>
	 *
	 */
	public static final String $aprv_rjct_flg = "aprv_rjct_flg";
	/**
	 * Denied 否認.<p>
	 *
	 */
	public static final String $aprv_last_rjct_flg = "aprv_last_rjct_flg";
	/**
	 * Non-target/Uncollated 対象外・未照合.<p>
	 *
	 */
	public static final String $aprv_none_flg = "aprv_none_flg";
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public static final String $not_prnt_flg = "not_prnt_flg";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";
	/**
	 * Scheduled payee closing year, month, and date FROM 支払予定管理先締年月日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $bsppl_cl_dt_fr = "bsppl_cl_dt_fr";
	/**
	 * Scheduled payee closing year, month, and date TO 支払予定管理先締年月日ＴＯ.<p>
	 *
	 */
	public static final String $bsppl_cl_dt_to = "bsppl_cl_dt_to";
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
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public static final String $pay_chk_no = "pay_chk_no";
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
	 * Include not for payment 支払対象外含む.<p>
	 *
	 */
	public static final String $inc_no_pay_flg = "inc_no_pay_flg";
	/**
	 * With temporary unit price 仮単価あり.<p>
	 *
	 */
	public static final String $inc_interim_flg = "inc_interim_flg";
	/**
	 * Manual マニュアル.<p>
	 *
	 */
	public static final String $manual_flg = "manual_flg";
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public static final String $pay_spot_flg = "pay_spot_flg";
	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public static final String $batch_pay_schd_cl_flg = "batch_pay_schd_cl_flg";
	/**
	 * Scheduled payee classification 1 search target 支払予定管理先分類１検索対象.<p>
	 *
	 */
	public static final String $bsppl_grp_flg1 = "bsppl_grp_flg1";
	/**
	 * Latest only 最新のみ.<p>
	 *
	 */
	public static final String $new_flg = "new_flg";
	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public static final String $pay_schd_d_print_rmrks = "pay_schd_d_print_rmrks";
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


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta reg_dt_META = createCommonMeta($reg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta reg_dt_fr_META = createCommonMeta($reg_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta reg_dt_to_META = createCommonMeta($reg_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta unchk_flg_META = createCommonMeta($unchk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_flg_META = createCommonMeta($schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_flg_META = createCommonMeta($act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_opn_flg_META = createCommonMeta($aprv_opn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_fix_flg_META = createCommonMeta($aprv_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_acpt_flg_META = createCommonMeta($aprv_acpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_rjct_flg_META = createCommonMeta($aprv_rjct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_last_rjct_flg_META = createCommonMeta($aprv_last_rjct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_none_flg_META = createCommonMeta($aprv_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_prnt_flg_META = createCommonMeta($not_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_cl_dt_fr_META = createCommonMeta($bsppl_cl_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bsppl_cl_dt_to_META = createCommonMeta($bsppl_cl_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta psppl_nm_META = createCommonMeta($psppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_nm_META = createCommonMeta($bsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bsppl_dpt_nm_META = createCommonMeta($bsppl_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta pay_chk_no_META = createCommonMeta($pay_chk_no, mcframe.commonMA.meta.MA_META.PAY_CHK_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta inc_no_pay_flg_META = createCommonMeta($inc_no_pay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_interim_flg_META = createCommonMeta($inc_interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta manual_flg_META = createCommonMeta($manual_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_spot_flg_META = createCommonMeta($pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta batch_pay_schd_cl_flg_META = createCommonMeta($batch_pay_schd_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_grp_flg1_META = createCommonMeta($bsppl_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta new_flg_META = createCommonMeta($new_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_schd_d_print_rmrks_META = createCommonMeta($pay_schd_d_print_rmrks, mcframe.commonMS.meta.MS_META.PAY_SCHD_D_PRINT_HDR_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PAY_CHK_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PAY_CHK_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PAY_CHK_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PAY_CHK_SUB_CHAR3);
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
			ope_META,
			reg_dt_META,
			reg_dt_fr_META,
			reg_dt_to_META,
			unchk_flg_META,
			schd_flg_META,
			act_flg_META,
			aprv_opn_flg_META,
			aprv_fix_flg_META,
			aprv_acpt_flg_META,
			aprv_rjct_flg_META,
			aprv_last_rjct_flg_META,
			aprv_none_flg_META,
			not_prnt_flg_META,
			prnt_flg_META,
			bsppl_cl_dt_fr_META,
			bsppl_cl_dt_to_META,
			psppl_cd_META,
			psppl_nm_META,
			bsppl_cd_META,
			bsppl_nm_META,
			bsppl_dpt_cd_META,
			bsppl_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			purc_act_no_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			pay_chk_no_META,
			wrk_no_META,
			wrk_nm_META,
			inc_no_pay_flg_META,
			inc_interim_flg_META,
			manual_flg_META,
			pay_spot_flg_META,
			batch_pay_schd_cl_flg_META,
			bsppl_grp_flg1_META,
			new_flg_META,
			pay_schd_d_print_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
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
	 * Operation type 操作種別.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCDate reg_dt() {
		return getConstDate(offset + 1, $reg_dt);
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public void reg_dt(MCDate value) {
		setConstDate(offset + 1, $reg_dt, value);
	}


	/**
	 * Entry date FROM 登録日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate reg_dt_fr() {
		return getConstDate(offset + 2, $reg_dt_fr);
	}

	/**
	 * Entry date FROM 登録日ＦＲＯＭ.<p>
	 *
	 */
	public void reg_dt_fr(MCDate value) {
		setConstDate(offset + 2, $reg_dt_fr, value);
	}


	/**
	 * Entry date TO 登録日ＴＯ.<p>
	 *
	 */
	public MCDate reg_dt_to() {
		return getConstDate(offset + 3, $reg_dt_to);
	}

	/**
	 * Entry date TO 登録日ＴＯ.<p>
	 *
	 */
	public void reg_dt_to(MCDate value) {
		setConstDate(offset + 3, $reg_dt_to, value);
	}


	/**
	 * Uncollated 未照合.<p>
	 *
	 */
	public boolean unchk_flg() {
		return getConstBoolean(offset + 4, $unchk_flg);
	}

	/**
	 * Uncollated 未照合.<p>
	 *
	 */
	public void unchk_flg(boolean value) {
		setConstBoolean(offset + 4, $unchk_flg, value);
	}


	/**
	 * Schedule 予定.<p>
	 *
	 */
	public boolean schd_flg() {
		return getConstBoolean(offset + 5, $schd_flg);
	}

	/**
	 * Schedule 予定.<p>
	 *
	 */
	public void schd_flg(boolean value) {
		setConstBoolean(offset + 5, $schd_flg, value);
	}


	/**
	 * Paid 支払済.<p>
	 *
	 */
	public boolean act_flg() {
		return getConstBoolean(offset + 6, $act_flg);
	}

	/**
	 * Paid 支払済.<p>
	 *
	 */
	public void act_flg(boolean value) {
		setConstBoolean(offset + 6, $act_flg, value);
	}


	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public boolean aprv_opn_flg() {
		return getConstBoolean(offset + 7, $aprv_opn_flg);
	}

	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public void aprv_opn_flg(boolean value) {
		setConstBoolean(offset + 7, $aprv_opn_flg, value);
	}


	/**
	 * Preliminary approval 一次承認済.<p>
	 *
	 */
	public boolean aprv_fix_flg() {
		return getConstBoolean(offset + 8, $aprv_fix_flg);
	}

	/**
	 * Preliminary approval 一次承認済.<p>
	 *
	 */
	public void aprv_fix_flg(boolean value) {
		setConstBoolean(offset + 8, $aprv_fix_flg, value);
	}


	/**
	 * Final approval 最終承認済.<p>
	 *
	 */
	public boolean aprv_acpt_flg() {
		return getConstBoolean(offset + 9, $aprv_acpt_flg);
	}

	/**
	 * Final approval 最終承認済.<p>
	 *
	 */
	public void aprv_acpt_flg(boolean value) {
		setConstBoolean(offset + 9, $aprv_acpt_flg, value);
	}


	/**
	 * Reject 却下.<p>
	 *
	 */
	public boolean aprv_rjct_flg() {
		return getConstBoolean(offset + 10, $aprv_rjct_flg);
	}

	/**
	 * Reject 却下.<p>
	 *
	 */
	public void aprv_rjct_flg(boolean value) {
		setConstBoolean(offset + 10, $aprv_rjct_flg, value);
	}


	/**
	 * Denied 否認.<p>
	 *
	 */
	public boolean aprv_last_rjct_flg() {
		return getConstBoolean(offset + 11, $aprv_last_rjct_flg);
	}

	/**
	 * Denied 否認.<p>
	 *
	 */
	public void aprv_last_rjct_flg(boolean value) {
		setConstBoolean(offset + 11, $aprv_last_rjct_flg, value);
	}


	/**
	 * Non-target/Uncollated 対象外・未照合.<p>
	 *
	 */
	public boolean aprv_none_flg() {
		return getConstBoolean(offset + 12, $aprv_none_flg);
	}

	/**
	 * Non-target/Uncollated 対象外・未照合.<p>
	 *
	 */
	public void aprv_none_flg(boolean value) {
		setConstBoolean(offset + 12, $aprv_none_flg, value);
	}


	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public boolean not_prnt_flg() {
		return getConstBoolean(offset + 13, $not_prnt_flg);
	}

	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public void not_prnt_flg(boolean value) {
		setConstBoolean(offset + 13, $not_prnt_flg, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 14, $prnt_flg);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 14, $prnt_flg, value);
	}


	/**
	 * Scheduled payee closing year, month, and date FROM 支払予定管理先締年月日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate bsppl_cl_dt_fr() {
		return getConstDate(offset + 15, $bsppl_cl_dt_fr);
	}

	/**
	 * Scheduled payee closing year, month, and date FROM 支払予定管理先締年月日ＦＲＯＭ.<p>
	 *
	 */
	public void bsppl_cl_dt_fr(MCDate value) {
		setConstDate(offset + 15, $bsppl_cl_dt_fr, value);
	}


	/**
	 * Scheduled payee closing year, month, and date TO 支払予定管理先締年月日ＴＯ.<p>
	 *
	 */
	public MCDate bsppl_cl_dt_to() {
		return getConstDate(offset + 16, $bsppl_cl_dt_to);
	}

	/**
	 * Scheduled payee closing year, month, and date TO 支払予定管理先締年月日ＴＯ.<p>
	 *
	 */
	public void bsppl_cl_dt_to(MCDate value) {
		setConstDate(offset + 16, $bsppl_cl_dt_to, value);
	}


	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 17, $psppl_cd);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 17, $psppl_cd, value);
	}


	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public String psppl_nm() {
		return getConstString(offset + 18, $psppl_nm);
	}

	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public void psppl_nm(String value) {
		setConstString(offset + 18, $psppl_nm, value);
	}


	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 19, $bsppl_cd);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 19, $bsppl_cd, value);
	}


	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public String bsppl_nm() {
		return getConstString(offset + 20, $bsppl_nm);
	}

	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public void bsppl_nm(String value) {
		setConstString(offset + 20, $bsppl_nm, value);
	}


	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 21, $bsppl_dpt_cd);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 21, $bsppl_dpt_cd, value);
	}


	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public String bsppl_dpt_nm() {
		return getConstString(offset + 22, $bsppl_dpt_nm);
	}

	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public void bsppl_dpt_nm(String value) {
		setConstString(offset + 22, $bsppl_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 23, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 23, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 24, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 24, $wg_nm, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 25, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 25, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 26, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 26, $trd_cur_nm, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 27, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 27, $purc_act_no, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 28, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 28, $rcpt_iv_no, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 29, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 29, $rcpt_iv_mng_no, value);
	}


	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public String pay_chk_no() {
		return getConstString(offset + 30, $pay_chk_no);
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no(String value) {
		setConstString(offset + 30, $pay_chk_no, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 31, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 31, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 32, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 32, $wrk_nm, value);
	}


	/**
	 * Include not for payment 支払対象外含む.<p>
	 *
	 */
	public boolean inc_no_pay_flg() {
		return getConstBoolean(offset + 33, $inc_no_pay_flg);
	}

	/**
	 * Include not for payment 支払対象外含む.<p>
	 *
	 */
	public void inc_no_pay_flg(boolean value) {
		setConstBoolean(offset + 33, $inc_no_pay_flg, value);
	}


	/**
	 * With temporary unit price 仮単価あり.<p>
	 *
	 */
	public boolean inc_interim_flg() {
		return getConstBoolean(offset + 34, $inc_interim_flg);
	}

	/**
	 * With temporary unit price 仮単価あり.<p>
	 *
	 */
	public void inc_interim_flg(boolean value) {
		setConstBoolean(offset + 34, $inc_interim_flg, value);
	}


	/**
	 * Manual マニュアル.<p>
	 *
	 */
	public boolean manual_flg() {
		return getConstBoolean(offset + 35, $manual_flg);
	}

	/**
	 * Manual マニュアル.<p>
	 *
	 */
	public void manual_flg(boolean value) {
		setConstBoolean(offset + 35, $manual_flg, value);
	}


	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public boolean pay_spot_flg() {
		return getConstBoolean(offset + 36, $pay_spot_flg);
	}

	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public void pay_spot_flg(boolean value) {
		setConstBoolean(offset + 36, $pay_spot_flg, value);
	}


	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public boolean batch_pay_schd_cl_flg() {
		return getConstBoolean(offset + 37, $batch_pay_schd_cl_flg);
	}

	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public void batch_pay_schd_cl_flg(boolean value) {
		setConstBoolean(offset + 37, $batch_pay_schd_cl_flg, value);
	}


	/**
	 * Scheduled payee classification 1 search target 支払予定管理先分類１検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg1() {
		return getConstBoolean(offset + 38, $bsppl_grp_flg1);
	}

	/**
	 * Scheduled payee classification 1 search target 支払予定管理先分類１検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg1(boolean value) {
		setConstBoolean(offset + 38, $bsppl_grp_flg1, value);
	}


	/**
	 * Latest only 最新のみ.<p>
	 *
	 */
	public boolean new_flg() {
		return getConstBoolean(offset + 39, $new_flg);
	}

	/**
	 * Latest only 最新のみ.<p>
	 *
	 */
	public void new_flg(boolean value) {
		setConstBoolean(offset + 39, $new_flg, value);
	}


	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public String pay_schd_d_print_rmrks() {
		return getConstString(offset + 40, $pay_schd_d_print_rmrks);
	}

	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public void pay_schd_d_print_rmrks(String value) {
		setConstString(offset + 40, $pay_schd_d_print_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 41, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 41, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 42, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 42, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 43, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 43, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 44, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 44, $sub_char3, value);
	}


	/**
	 * Scheduled payee classification cd. 1 支払予定管理先分類ＣＤ１.<p>
	 *
	 */
	public String bsppl_grp_cd1() {
		return getConstString(offset + 45, $bsppl_grp_cd1);
	}

	/**
	 * Scheduled payee classification cd. 1 支払予定管理先分類ＣＤ１.<p>
	 *
	 */
	public void bsppl_grp_cd1(String value) {
		setConstString(offset + 45, $bsppl_grp_cd1, value);
	}


	/**
	 * Scheduled payee classification name 1 支払予定管理先分類名１.<p>
	 *
	 */
	public String bsppl_grp_nm1() {
		return getConstString(offset + 46, $bsppl_grp_nm1);
	}

	/**
	 * Scheduled payee classification name 1 支払予定管理先分類名１.<p>
	 *
	 */
	public void bsppl_grp_nm1(String value) {
		setConstString(offset + 46, $bsppl_grp_nm1, value);
	}


	/**
	 * Scheduled payee classification 2 search target 支払予定管理先分類２検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg2() {
		return getConstBoolean(offset + 47, $bsppl_grp_flg2);
	}

	/**
	 * Scheduled payee classification 2 search target 支払予定管理先分類２検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg2(boolean value) {
		setConstBoolean(offset + 47, $bsppl_grp_flg2, value);
	}


	/**
	 * Scheduled payee classification cd. 2 支払予定管理先分類ＣＤ２.<p>
	 *
	 */
	public String bsppl_grp_cd2() {
		return getConstString(offset + 48, $bsppl_grp_cd2);
	}

	/**
	 * Scheduled payee classification cd. 2 支払予定管理先分類ＣＤ２.<p>
	 *
	 */
	public void bsppl_grp_cd2(String value) {
		setConstString(offset + 48, $bsppl_grp_cd2, value);
	}


	/**
	 * Scheduled payee classification name 2 支払予定管理先分類名２.<p>
	 *
	 */
	public String bsppl_grp_nm2() {
		return getConstString(offset + 49, $bsppl_grp_nm2);
	}

	/**
	 * Scheduled payee classification name 2 支払予定管理先分類名２.<p>
	 *
	 */
	public void bsppl_grp_nm2(String value) {
		setConstString(offset + 49, $bsppl_grp_nm2, value);
	}


	/**
	 * Scheduled payee classification 3 search target 支払予定管理先分類３検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg3() {
		return getConstBoolean(offset + 50, $bsppl_grp_flg3);
	}

	/**
	 * Scheduled payee classification 3 search target 支払予定管理先分類３検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg3(boolean value) {
		setConstBoolean(offset + 50, $bsppl_grp_flg3, value);
	}


	/**
	 * Scheduled payee classification cd. 3 支払予定管理先分類ＣＤ３.<p>
	 *
	 */
	public String bsppl_grp_cd3() {
		return getConstString(offset + 51, $bsppl_grp_cd3);
	}

	/**
	 * Scheduled payee classification cd. 3 支払予定管理先分類ＣＤ３.<p>
	 *
	 */
	public void bsppl_grp_cd3(String value) {
		setConstString(offset + 51, $bsppl_grp_cd3, value);
	}


	/**
	 * Scheduled payee classification name 3 支払予定管理先分類名３.<p>
	 *
	 */
	public String bsppl_grp_nm3() {
		return getConstString(offset + 52, $bsppl_grp_nm3);
	}

	/**
	 * Scheduled payee classification name 3 支払予定管理先分類名３.<p>
	 *
	 */
	public void bsppl_grp_nm3(String value) {
		setConstString(offset + 52, $bsppl_grp_nm3, value);
	}


	/**
	 * Scheduled payee classification 4 search target 支払予定管理先分類４検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg4() {
		return getConstBoolean(offset + 53, $bsppl_grp_flg4);
	}

	/**
	 * Scheduled payee classification 4 search target 支払予定管理先分類４検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg4(boolean value) {
		setConstBoolean(offset + 53, $bsppl_grp_flg4, value);
	}


	/**
	 * Scheduled payee classification cd. 4 支払予定管理先分類ＣＤ４.<p>
	 *
	 */
	public String bsppl_grp_cd4() {
		return getConstString(offset + 54, $bsppl_grp_cd4);
	}

	/**
	 * Scheduled payee classification cd. 4 支払予定管理先分類ＣＤ４.<p>
	 *
	 */
	public void bsppl_grp_cd4(String value) {
		setConstString(offset + 54, $bsppl_grp_cd4, value);
	}


	/**
	 * Scheduled payee classification name 4 支払予定管理先分類名４.<p>
	 *
	 */
	public String bsppl_grp_nm4() {
		return getConstString(offset + 55, $bsppl_grp_nm4);
	}

	/**
	 * Scheduled payee classification name 4 支払予定管理先分類名４.<p>
	 *
	 */
	public void bsppl_grp_nm4(String value) {
		setConstString(offset + 55, $bsppl_grp_nm4, value);
	}


	/**
	 * Scheduled payee classification 5 search target 支払予定管理先分類５検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg5() {
		return getConstBoolean(offset + 56, $bsppl_grp_flg5);
	}

	/**
	 * Scheduled payee classification 5 search target 支払予定管理先分類５検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg5(boolean value) {
		setConstBoolean(offset + 56, $bsppl_grp_flg5, value);
	}


	/**
	 * Scheduled payee classification cd. 5 支払予定管理先分類ＣＤ５.<p>
	 *
	 */
	public String bsppl_grp_cd5() {
		return getConstString(offset + 57, $bsppl_grp_cd5);
	}

	/**
	 * Scheduled payee classification cd. 5 支払予定管理先分類ＣＤ５.<p>
	 *
	 */
	public void bsppl_grp_cd5(String value) {
		setConstString(offset + 57, $bsppl_grp_cd5, value);
	}


	/**
	 * Scheduled payee classification name 5 支払予定管理先分類名５.<p>
	 *
	 */
	public String bsppl_grp_nm5() {
		return getConstString(offset + 58, $bsppl_grp_nm5);
	}

	/**
	 * Scheduled payee classification name 5 支払予定管理先分類名５.<p>
	 *
	 */
	public void bsppl_grp_nm5(String value) {
		setConstString(offset + 58, $bsppl_grp_nm5, value);
	}


	/**
	 * Scheduled payee classification 6 search target 支払予定管理先分類６検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg6() {
		return getConstBoolean(offset + 59, $bsppl_grp_flg6);
	}

	/**
	 * Scheduled payee classification 6 search target 支払予定管理先分類６検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg6(boolean value) {
		setConstBoolean(offset + 59, $bsppl_grp_flg6, value);
	}


	/**
	 * Scheduled payee classification cd. 6 支払予定管理先分類ＣＤ６.<p>
	 *
	 */
	public String bsppl_grp_cd6() {
		return getConstString(offset + 60, $bsppl_grp_cd6);
	}

	/**
	 * Scheduled payee classification cd. 6 支払予定管理先分類ＣＤ６.<p>
	 *
	 */
	public void bsppl_grp_cd6(String value) {
		setConstString(offset + 60, $bsppl_grp_cd6, value);
	}


	/**
	 * Scheduled payee classification name 6 支払予定管理先分類名６.<p>
	 *
	 */
	public String bsppl_grp_nm6() {
		return getConstString(offset + 61, $bsppl_grp_nm6);
	}

	/**
	 * Scheduled payee classification name 6 支払予定管理先分類名６.<p>
	 *
	 */
	public void bsppl_grp_nm6(String value) {
		setConstString(offset + 61, $bsppl_grp_nm6, value);
	}


	/**
	 * Scheduled payee classification 7 search target 支払予定管理先分類７検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg7() {
		return getConstBoolean(offset + 62, $bsppl_grp_flg7);
	}

	/**
	 * Scheduled payee classification 7 search target 支払予定管理先分類７検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg7(boolean value) {
		setConstBoolean(offset + 62, $bsppl_grp_flg7, value);
	}


	/**
	 * Scheduled payee classification cd. 7 支払予定管理先分類ＣＤ７.<p>
	 *
	 */
	public String bsppl_grp_cd7() {
		return getConstString(offset + 63, $bsppl_grp_cd7);
	}

	/**
	 * Scheduled payee classification cd. 7 支払予定管理先分類ＣＤ７.<p>
	 *
	 */
	public void bsppl_grp_cd7(String value) {
		setConstString(offset + 63, $bsppl_grp_cd7, value);
	}


	/**
	 * Scheduled payee classification name 7 支払予定管理先分類名７.<p>
	 *
	 */
	public String bsppl_grp_nm7() {
		return getConstString(offset + 64, $bsppl_grp_nm7);
	}

	/**
	 * Scheduled payee classification name 7 支払予定管理先分類名７.<p>
	 *
	 */
	public void bsppl_grp_nm7(String value) {
		setConstString(offset + 64, $bsppl_grp_nm7, value);
	}


	/**
	 * Scheduled payee classification 8 search target 支払予定管理先分類８検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg8() {
		return getConstBoolean(offset + 65, $bsppl_grp_flg8);
	}

	/**
	 * Scheduled payee classification 8 search target 支払予定管理先分類８検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg8(boolean value) {
		setConstBoolean(offset + 65, $bsppl_grp_flg8, value);
	}


	/**
	 * Scheduled payee classification cd. 8 支払予定管理先分類ＣＤ８.<p>
	 *
	 */
	public String bsppl_grp_cd8() {
		return getConstString(offset + 66, $bsppl_grp_cd8);
	}

	/**
	 * Scheduled payee classification cd. 8 支払予定管理先分類ＣＤ８.<p>
	 *
	 */
	public void bsppl_grp_cd8(String value) {
		setConstString(offset + 66, $bsppl_grp_cd8, value);
	}


	/**
	 * Scheduled payee classification name 8 支払予定管理先分類名８.<p>
	 *
	 */
	public String bsppl_grp_nm8() {
		return getConstString(offset + 67, $bsppl_grp_nm8);
	}

	/**
	 * Scheduled payee classification name 8 支払予定管理先分類名８.<p>
	 *
	 */
	public void bsppl_grp_nm8(String value) {
		setConstString(offset + 67, $bsppl_grp_nm8, value);
	}


	/**
	 * Scheduled payee classification 9 search target 支払予定管理先分類９検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg9() {
		return getConstBoolean(offset + 68, $bsppl_grp_flg9);
	}

	/**
	 * Scheduled payee classification 9 search target 支払予定管理先分類９検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg9(boolean value) {
		setConstBoolean(offset + 68, $bsppl_grp_flg9, value);
	}


	/**
	 * Scheduled payee classification cd. 9 支払予定管理先分類ＣＤ９.<p>
	 *
	 */
	public String bsppl_grp_cd9() {
		return getConstString(offset + 69, $bsppl_grp_cd9);
	}

	/**
	 * Scheduled payee classification cd. 9 支払予定管理先分類ＣＤ９.<p>
	 *
	 */
	public void bsppl_grp_cd9(String value) {
		setConstString(offset + 69, $bsppl_grp_cd9, value);
	}


	/**
	 * Scheduled payee classification name 9 支払予定管理先分類名９.<p>
	 *
	 */
	public String bsppl_grp_nm9() {
		return getConstString(offset + 70, $bsppl_grp_nm9);
	}

	/**
	 * Scheduled payee classification name 9 支払予定管理先分類名９.<p>
	 *
	 */
	public void bsppl_grp_nm9(String value) {
		setConstString(offset + 70, $bsppl_grp_nm9, value);
	}


	/**
	 * Scheduled payee classification 10 search target 支払予定管理先分類１０検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg10() {
		return getConstBoolean(offset + 71, $bsppl_grp_flg10);
	}

	/**
	 * Scheduled payee classification 10 search target 支払予定管理先分類１０検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg10(boolean value) {
		setConstBoolean(offset + 71, $bsppl_grp_flg10, value);
	}


	/**
	 * Scheduled payee classification cd. 10 支払予定管理先分類ＣＤ１０.<p>
	 *
	 */
	public String bsppl_grp_cd10() {
		return getConstString(offset + 72, $bsppl_grp_cd10);
	}

	/**
	 * Scheduled payee classification cd. 10 支払予定管理先分類ＣＤ１０.<p>
	 *
	 */
	public void bsppl_grp_cd10(String value) {
		setConstString(offset + 72, $bsppl_grp_cd10, value);
	}


	/**
	 * Scheduled payee classification name 10 支払予定管理先分類名１０.<p>
	 *
	 */
	public String bsppl_grp_nm10() {
		return getConstString(offset + 73, $bsppl_grp_nm10);
	}

	/**
	 * Scheduled payee classification name 10 支払予定管理先分類名１０.<p>
	 *
	 */
	public void bsppl_grp_nm10(String value) {
		setConstString(offset + 73, $bsppl_grp_nm10, value);
	}


	/**
	 * Payee classification 1 search target 支払先分類１検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg1() {
		return getConstBoolean(offset + 74, $psppl_grp_flg1);
	}

	/**
	 * Payee classification 1 search target 支払先分類１検索対象.<p>
	 *
	 */
	public void psppl_grp_flg1(boolean value) {
		setConstBoolean(offset + 74, $psppl_grp_flg1, value);
	}


	/**
	 * Payee classification cd. 1 支払先分類ＣＤ１.<p>
	 *
	 */
	public String psppl_grp_cd1() {
		return getConstString(offset + 75, $psppl_grp_cd1);
	}

	/**
	 * Payee classification cd. 1 支払先分類ＣＤ１.<p>
	 *
	 */
	public void psppl_grp_cd1(String value) {
		setConstString(offset + 75, $psppl_grp_cd1, value);
	}


	/**
	 * Payee classification name 1 支払先分類名１.<p>
	 *
	 */
	public String psppl_grp_nm1() {
		return getConstString(offset + 76, $psppl_grp_nm1);
	}

	/**
	 * Payee classification name 1 支払先分類名１.<p>
	 *
	 */
	public void psppl_grp_nm1(String value) {
		setConstString(offset + 76, $psppl_grp_nm1, value);
	}


	/**
	 * Payee classification 2 search target 支払先分類２検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg2() {
		return getConstBoolean(offset + 77, $psppl_grp_flg2);
	}

	/**
	 * Payee classification 2 search target 支払先分類２検索対象.<p>
	 *
	 */
	public void psppl_grp_flg2(boolean value) {
		setConstBoolean(offset + 77, $psppl_grp_flg2, value);
	}


	/**
	 * Payee classification cd. 2 支払先分類ＣＤ２.<p>
	 *
	 */
	public String psppl_grp_cd2() {
		return getConstString(offset + 78, $psppl_grp_cd2);
	}

	/**
	 * Payee classification cd. 2 支払先分類ＣＤ２.<p>
	 *
	 */
	public void psppl_grp_cd2(String value) {
		setConstString(offset + 78, $psppl_grp_cd2, value);
	}


	/**
	 * Payee classification name 2 支払先分類名２.<p>
	 *
	 */
	public String psppl_grp_nm2() {
		return getConstString(offset + 79, $psppl_grp_nm2);
	}

	/**
	 * Payee classification name 2 支払先分類名２.<p>
	 *
	 */
	public void psppl_grp_nm2(String value) {
		setConstString(offset + 79, $psppl_grp_nm2, value);
	}


	/**
	 * Payee classification 3 search target 支払先分類３検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg3() {
		return getConstBoolean(offset + 80, $psppl_grp_flg3);
	}

	/**
	 * Payee classification 3 search target 支払先分類３検索対象.<p>
	 *
	 */
	public void psppl_grp_flg3(boolean value) {
		setConstBoolean(offset + 80, $psppl_grp_flg3, value);
	}


	/**
	 * Payee classification cd. 3 支払先分類ＣＤ３.<p>
	 *
	 */
	public String psppl_grp_cd3() {
		return getConstString(offset + 81, $psppl_grp_cd3);
	}

	/**
	 * Payee classification cd. 3 支払先分類ＣＤ３.<p>
	 *
	 */
	public void psppl_grp_cd3(String value) {
		setConstString(offset + 81, $psppl_grp_cd3, value);
	}


	/**
	 * Payee classification name 3 支払先分類名３.<p>
	 *
	 */
	public String psppl_grp_nm3() {
		return getConstString(offset + 82, $psppl_grp_nm3);
	}

	/**
	 * Payee classification name 3 支払先分類名３.<p>
	 *
	 */
	public void psppl_grp_nm3(String value) {
		setConstString(offset + 82, $psppl_grp_nm3, value);
	}


	/**
	 * Payee classification 4 search target 支払先分類４検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg4() {
		return getConstBoolean(offset + 83, $psppl_grp_flg4);
	}

	/**
	 * Payee classification 4 search target 支払先分類４検索対象.<p>
	 *
	 */
	public void psppl_grp_flg4(boolean value) {
		setConstBoolean(offset + 83, $psppl_grp_flg4, value);
	}


	/**
	 * Payee classification cd. 4 支払先分類ＣＤ４.<p>
	 *
	 */
	public String psppl_grp_cd4() {
		return getConstString(offset + 84, $psppl_grp_cd4);
	}

	/**
	 * Payee classification cd. 4 支払先分類ＣＤ４.<p>
	 *
	 */
	public void psppl_grp_cd4(String value) {
		setConstString(offset + 84, $psppl_grp_cd4, value);
	}


	/**
	 * Payee classification name 4 支払先分類名４.<p>
	 *
	 */
	public String psppl_grp_nm4() {
		return getConstString(offset + 85, $psppl_grp_nm4);
	}

	/**
	 * Payee classification name 4 支払先分類名４.<p>
	 *
	 */
	public void psppl_grp_nm4(String value) {
		setConstString(offset + 85, $psppl_grp_nm4, value);
	}


	/**
	 * Payee classification 5 search target 支払先分類５検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg5() {
		return getConstBoolean(offset + 86, $psppl_grp_flg5);
	}

	/**
	 * Payee classification 5 search target 支払先分類５検索対象.<p>
	 *
	 */
	public void psppl_grp_flg5(boolean value) {
		setConstBoolean(offset + 86, $psppl_grp_flg5, value);
	}


	/**
	 * Payee classification cd. 5 支払先分類ＣＤ５.<p>
	 *
	 */
	public String psppl_grp_cd5() {
		return getConstString(offset + 87, $psppl_grp_cd5);
	}

	/**
	 * Payee classification cd. 5 支払先分類ＣＤ５.<p>
	 *
	 */
	public void psppl_grp_cd5(String value) {
		setConstString(offset + 87, $psppl_grp_cd5, value);
	}


	/**
	 * Payee classification name 5 支払先分類名５.<p>
	 *
	 */
	public String psppl_grp_nm5() {
		return getConstString(offset + 88, $psppl_grp_nm5);
	}

	/**
	 * Payee classification name 5 支払先分類名５.<p>
	 *
	 */
	public void psppl_grp_nm5(String value) {
		setConstString(offset + 88, $psppl_grp_nm5, value);
	}


	/**
	 * Payee classification 6 search target 支払先分類６検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg6() {
		return getConstBoolean(offset + 89, $psppl_grp_flg6);
	}

	/**
	 * Payee classification 6 search target 支払先分類６検索対象.<p>
	 *
	 */
	public void psppl_grp_flg6(boolean value) {
		setConstBoolean(offset + 89, $psppl_grp_flg6, value);
	}


	/**
	 * Payee classification cd. 6 支払先分類ＣＤ６.<p>
	 *
	 */
	public String psppl_grp_cd6() {
		return getConstString(offset + 90, $psppl_grp_cd6);
	}

	/**
	 * Payee classification cd. 6 支払先分類ＣＤ６.<p>
	 *
	 */
	public void psppl_grp_cd6(String value) {
		setConstString(offset + 90, $psppl_grp_cd6, value);
	}


	/**
	 * Payee classification name 6 支払先分類名６.<p>
	 *
	 */
	public String psppl_grp_nm6() {
		return getConstString(offset + 91, $psppl_grp_nm6);
	}

	/**
	 * Payee classification name 6 支払先分類名６.<p>
	 *
	 */
	public void psppl_grp_nm6(String value) {
		setConstString(offset + 91, $psppl_grp_nm6, value);
	}


	/**
	 * Payee classification 7 search target 支払先分類７検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg7() {
		return getConstBoolean(offset + 92, $psppl_grp_flg7);
	}

	/**
	 * Payee classification 7 search target 支払先分類７検索対象.<p>
	 *
	 */
	public void psppl_grp_flg7(boolean value) {
		setConstBoolean(offset + 92, $psppl_grp_flg7, value);
	}


	/**
	 * Payee classification cd. 7 支払先分類ＣＤ７.<p>
	 *
	 */
	public String psppl_grp_cd7() {
		return getConstString(offset + 93, $psppl_grp_cd7);
	}

	/**
	 * Payee classification cd. 7 支払先分類ＣＤ７.<p>
	 *
	 */
	public void psppl_grp_cd7(String value) {
		setConstString(offset + 93, $psppl_grp_cd7, value);
	}


	/**
	 * Payee classification name 7 支払先分類名７.<p>
	 *
	 */
	public String psppl_grp_nm7() {
		return getConstString(offset + 94, $psppl_grp_nm7);
	}

	/**
	 * Payee classification name 7 支払先分類名７.<p>
	 *
	 */
	public void psppl_grp_nm7(String value) {
		setConstString(offset + 94, $psppl_grp_nm7, value);
	}


	/**
	 * Payee classification 8 search target 支払先分類８検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg8() {
		return getConstBoolean(offset + 95, $psppl_grp_flg8);
	}

	/**
	 * Payee classification 8 search target 支払先分類８検索対象.<p>
	 *
	 */
	public void psppl_grp_flg8(boolean value) {
		setConstBoolean(offset + 95, $psppl_grp_flg8, value);
	}


	/**
	 * Payee classification cd. 8 支払先分類ＣＤ８.<p>
	 *
	 */
	public String psppl_grp_cd8() {
		return getConstString(offset + 96, $psppl_grp_cd8);
	}

	/**
	 * Payee classification cd. 8 支払先分類ＣＤ８.<p>
	 *
	 */
	public void psppl_grp_cd8(String value) {
		setConstString(offset + 96, $psppl_grp_cd8, value);
	}


	/**
	 * Payee classification name 8 支払先分類名８.<p>
	 *
	 */
	public String psppl_grp_nm8() {
		return getConstString(offset + 97, $psppl_grp_nm8);
	}

	/**
	 * Payee classification name 8 支払先分類名８.<p>
	 *
	 */
	public void psppl_grp_nm8(String value) {
		setConstString(offset + 97, $psppl_grp_nm8, value);
	}


	/**
	 * Payee classification 9 search target 支払先分類９検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg9() {
		return getConstBoolean(offset + 98, $psppl_grp_flg9);
	}

	/**
	 * Payee classification 9 search target 支払先分類９検索対象.<p>
	 *
	 */
	public void psppl_grp_flg9(boolean value) {
		setConstBoolean(offset + 98, $psppl_grp_flg9, value);
	}


	/**
	 * Payee classification cd. 9 支払先分類ＣＤ９.<p>
	 *
	 */
	public String psppl_grp_cd9() {
		return getConstString(offset + 99, $psppl_grp_cd9);
	}

	/**
	 * Payee classification cd. 9 支払先分類ＣＤ９.<p>
	 *
	 */
	public void psppl_grp_cd9(String value) {
		setConstString(offset + 99, $psppl_grp_cd9, value);
	}


	/**
	 * Payee classification name 9 支払先分類名９.<p>
	 *
	 */
	public String psppl_grp_nm9() {
		return getConstString(offset + 100, $psppl_grp_nm9);
	}

	/**
	 * Payee classification name 9 支払先分類名９.<p>
	 *
	 */
	public void psppl_grp_nm9(String value) {
		setConstString(offset + 100, $psppl_grp_nm9, value);
	}


	/**
	 * Payee classification 10 search target 支払先分類１０検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg10() {
		return getConstBoolean(offset + 101, $psppl_grp_flg10);
	}

	/**
	 * Payee classification 10 search target 支払先分類１０検索対象.<p>
	 *
	 */
	public void psppl_grp_flg10(boolean value) {
		setConstBoolean(offset + 101, $psppl_grp_flg10, value);
	}


	/**
	 * Payee classification cd. 10 支払先分類ＣＤ１０.<p>
	 *
	 */
	public String psppl_grp_cd10() {
		return getConstString(offset + 102, $psppl_grp_cd10);
	}

	/**
	 * Payee classification cd. 10 支払先分類ＣＤ１０.<p>
	 *
	 */
	public void psppl_grp_cd10(String value) {
		setConstString(offset + 102, $psppl_grp_cd10, value);
	}


	/**
	 * Payee classification name 10 支払先分類名１０.<p>
	 *
	 */
	public String psppl_grp_nm10() {
		return getConstString(offset + 103, $psppl_grp_nm10);
	}

	/**
	 * Payee classification name 10 支払先分類名１０.<p>
	 *
	 */
	public void psppl_grp_nm10(String value) {
		setConstString(offset + 103, $psppl_grp_nm10, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($pay_schd_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_schd_d_print_rmrks();
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
		if ($reg_dt.equalsIgnoreCase(name)) {
			return reg_dt();
		}
		if ($reg_dt_fr.equalsIgnoreCase(name)) {
			return reg_dt_fr();
		}
		if ($reg_dt_to.equalsIgnoreCase(name)) {
			return reg_dt_to();
		}
		if ($bsppl_cl_dt_fr.equalsIgnoreCase(name)) {
			return bsppl_cl_dt_fr();
		}
		if ($bsppl_cl_dt_to.equalsIgnoreCase(name)) {
			return bsppl_cl_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($unchk_flg.equalsIgnoreCase(name)) {
			return unchk_flg();
		}
		if ($schd_flg.equalsIgnoreCase(name)) {
			return schd_flg();
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
		}
		if ($aprv_opn_flg.equalsIgnoreCase(name)) {
			return aprv_opn_flg();
		}
		if ($aprv_fix_flg.equalsIgnoreCase(name)) {
			return aprv_fix_flg();
		}
		if ($aprv_acpt_flg.equalsIgnoreCase(name)) {
			return aprv_acpt_flg();
		}
		if ($aprv_rjct_flg.equalsIgnoreCase(name)) {
			return aprv_rjct_flg();
		}
		if ($aprv_last_rjct_flg.equalsIgnoreCase(name)) {
			return aprv_last_rjct_flg();
		}
		if ($aprv_none_flg.equalsIgnoreCase(name)) {
			return aprv_none_flg();
		}
		if ($not_prnt_flg.equalsIgnoreCase(name)) {
			return not_prnt_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($inc_no_pay_flg.equalsIgnoreCase(name)) {
			return inc_no_pay_flg();
		}
		if ($inc_interim_flg.equalsIgnoreCase(name)) {
			return inc_interim_flg();
		}
		if ($manual_flg.equalsIgnoreCase(name)) {
			return manual_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			return batch_pay_schd_cl_flg();
		}
		if ($bsppl_grp_flg1.equalsIgnoreCase(name)) {
			return bsppl_grp_flg1();
		}
		if ($new_flg.equalsIgnoreCase(name)) {
			return new_flg();
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
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($pay_schd_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_schd_d_print_rmrks();
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
		if ($reg_dt.equalsIgnoreCase(name)) {
			return reg_dt();
		}
		if ($reg_dt_fr.equalsIgnoreCase(name)) {
			return reg_dt_fr();
		}
		if ($reg_dt_to.equalsIgnoreCase(name)) {
			return reg_dt_to();
		}
		if ($bsppl_cl_dt_fr.equalsIgnoreCase(name)) {
			return bsppl_cl_dt_fr();
		}
		if ($bsppl_cl_dt_to.equalsIgnoreCase(name)) {
			return bsppl_cl_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($unchk_flg.equalsIgnoreCase(name)) {
			return unchk_flg();
		}
		if ($schd_flg.equalsIgnoreCase(name)) {
			return schd_flg();
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
		}
		if ($aprv_opn_flg.equalsIgnoreCase(name)) {
			return aprv_opn_flg();
		}
		if ($aprv_fix_flg.equalsIgnoreCase(name)) {
			return aprv_fix_flg();
		}
		if ($aprv_acpt_flg.equalsIgnoreCase(name)) {
			return aprv_acpt_flg();
		}
		if ($aprv_rjct_flg.equalsIgnoreCase(name)) {
			return aprv_rjct_flg();
		}
		if ($aprv_last_rjct_flg.equalsIgnoreCase(name)) {
			return aprv_last_rjct_flg();
		}
		if ($aprv_none_flg.equalsIgnoreCase(name)) {
			return aprv_none_flg();
		}
		if ($not_prnt_flg.equalsIgnoreCase(name)) {
			return not_prnt_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($inc_no_pay_flg.equalsIgnoreCase(name)) {
			return inc_no_pay_flg();
		}
		if ($inc_interim_flg.equalsIgnoreCase(name)) {
			return inc_interim_flg();
		}
		if ($manual_flg.equalsIgnoreCase(name)) {
			return manual_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			return batch_pay_schd_cl_flg();
		}
		if ($bsppl_grp_flg1.equalsIgnoreCase(name)) {
			return bsppl_grp_flg1();
		}
		if ($new_flg.equalsIgnoreCase(name)) {
			return new_flg();
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
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
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
		if ($pay_schd_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_schd_d_print_rmrks(value);
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
		if ($reg_dt.equalsIgnoreCase(name)) {
			reg_dt(value);
			return;
		}
		if ($reg_dt_fr.equalsIgnoreCase(name)) {
			reg_dt_fr(value);
			return;
		}
		if ($reg_dt_to.equalsIgnoreCase(name)) {
			reg_dt_to(value);
			return;
		}
		if ($bsppl_cl_dt_fr.equalsIgnoreCase(name)) {
			bsppl_cl_dt_fr(value);
			return;
		}
		if ($bsppl_cl_dt_to.equalsIgnoreCase(name)) {
			bsppl_cl_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($unchk_flg.equalsIgnoreCase(name)) {
			unchk_flg(value);
			return;
		}
		if ($schd_flg.equalsIgnoreCase(name)) {
			schd_flg(value);
			return;
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
			return;
		}
		if ($aprv_opn_flg.equalsIgnoreCase(name)) {
			aprv_opn_flg(value);
			return;
		}
		if ($aprv_fix_flg.equalsIgnoreCase(name)) {
			aprv_fix_flg(value);
			return;
		}
		if ($aprv_acpt_flg.equalsIgnoreCase(name)) {
			aprv_acpt_flg(value);
			return;
		}
		if ($aprv_rjct_flg.equalsIgnoreCase(name)) {
			aprv_rjct_flg(value);
			return;
		}
		if ($aprv_last_rjct_flg.equalsIgnoreCase(name)) {
			aprv_last_rjct_flg(value);
			return;
		}
		if ($aprv_none_flg.equalsIgnoreCase(name)) {
			aprv_none_flg(value);
			return;
		}
		if ($not_prnt_flg.equalsIgnoreCase(name)) {
			not_prnt_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($inc_no_pay_flg.equalsIgnoreCase(name)) {
			inc_no_pay_flg(value);
			return;
		}
		if ($inc_interim_flg.equalsIgnoreCase(name)) {
			inc_interim_flg(value);
			return;
		}
		if ($manual_flg.equalsIgnoreCase(name)) {
			manual_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			batch_pay_schd_cl_flg(value);
			return;
		}
		if ($bsppl_grp_flg1.equalsIgnoreCase(name)) {
			bsppl_grp_flg1(value);
			return;
		}
		if ($new_flg.equalsIgnoreCase(name)) {
			new_flg(value);
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
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
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
		if ($pay_schd_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_schd_d_print_rmrks(value);
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
		if ($reg_dt.equalsIgnoreCase(name)) {
			reg_dt(value);
			return;
		}
		if ($reg_dt_fr.equalsIgnoreCase(name)) {
			reg_dt_fr(value);
			return;
		}
		if ($reg_dt_to.equalsIgnoreCase(name)) {
			reg_dt_to(value);
			return;
		}
		if ($bsppl_cl_dt_fr.equalsIgnoreCase(name)) {
			bsppl_cl_dt_fr(value);
			return;
		}
		if ($bsppl_cl_dt_to.equalsIgnoreCase(name)) {
			bsppl_cl_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($unchk_flg.equalsIgnoreCase(name)) {
			unchk_flg(value);
			return;
		}
		if ($schd_flg.equalsIgnoreCase(name)) {
			schd_flg(value);
			return;
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
			return;
		}
		if ($aprv_opn_flg.equalsIgnoreCase(name)) {
			aprv_opn_flg(value);
			return;
		}
		if ($aprv_fix_flg.equalsIgnoreCase(name)) {
			aprv_fix_flg(value);
			return;
		}
		if ($aprv_acpt_flg.equalsIgnoreCase(name)) {
			aprv_acpt_flg(value);
			return;
		}
		if ($aprv_rjct_flg.equalsIgnoreCase(name)) {
			aprv_rjct_flg(value);
			return;
		}
		if ($aprv_last_rjct_flg.equalsIgnoreCase(name)) {
			aprv_last_rjct_flg(value);
			return;
		}
		if ($aprv_none_flg.equalsIgnoreCase(name)) {
			aprv_none_flg(value);
			return;
		}
		if ($not_prnt_flg.equalsIgnoreCase(name)) {
			not_prnt_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($inc_no_pay_flg.equalsIgnoreCase(name)) {
			inc_no_pay_flg(value);
			return;
		}
		if ($inc_interim_flg.equalsIgnoreCase(name)) {
			inc_interim_flg(value);
			return;
		}
		if ($manual_flg.equalsIgnoreCase(name)) {
			manual_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			batch_pay_schd_cl_flg(value);
			return;
		}
		if ($bsppl_grp_flg1.equalsIgnoreCase(name)) {
			bsppl_grp_flg1(value);
			return;
		}
		if ($new_flg.equalsIgnoreCase(name)) {
			new_flg(value);
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

