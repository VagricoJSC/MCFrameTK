package mcframe.serverMSBH.MSBHL0100;

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
	 * Search mode 検索モード.<p>
	 *
	 */
	public static final String $mode = "mode";
	/**
	 * Scheduled payment date FROM 支払予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $pay_schd_dt_fr = "pay_schd_dt_fr";
	/**
	 * Scheduled payment date TO 支払予定日ＴＯ.<p>
	 *
	 */
	public static final String $pay_schd_dt_to = "pay_schd_dt_to";
	/**
	 * Actual payment date FROM 支払実績日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $pay_act_dt_fr = "pay_act_dt_fr";
	/**
	 * Actual payment date TO 支払実績日ＴＯ.<p>
	 *
	 */
	public static final String $pay_act_dt_to = "pay_act_dt_to";
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
	 * Payment PIC cd. 支払担当者ＣＤ.<p>
	 *
	 */
	public static final String $pay_usr_cd = "pay_usr_cd";
	/**
	 * Payment PIC name 支払担当者名.<p>
	 *
	 */
	public static final String $pay_usr_nm = "pay_usr_nm";
	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public static final String $pay_dpt_cd = "pay_dpt_cd";
	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public static final String $pay_dpt_nm = "pay_dpt_nm";
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
	 * Scheduled payee PIC cd. 支払予定管理先担当者ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_usr_cd = "bsppl_usr_cd";
	/**
	 * Scheduled payee PIC name 支払予定管理先担当者名.<p>
	 *
	 */
	public static final String $bsppl_usr_nm = "bsppl_usr_nm";
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
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public static final String $ap_sttl_cd = "ap_sttl_cd";
	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public static final String $ap_sttl_nm = "ap_sttl_nm";
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
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public static final String $pay_chk_no = "pay_chk_no";
	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public static final String $pay_schd_no = "pay_schd_no";
	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public static final String $pay_act_no = "pay_act_no";
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public static final String $note_no = "note_no";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_d_rmrks = "intr_d_rmrks";
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
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public static final String $dtl_sub_char1 = "dtl_sub_char1";
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public static final String $dtl_sub_char2 = "dtl_sub_char2";
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public static final String $dtl_sub_char3 = "dtl_sub_char3";
	/**
	 * Include invalid/cancel 無効・取消含む.<p>
	 *
	 */
	public static final String $inc_can_flg = "inc_can_flg";
	/**
	 * Include result at schedule 予定時実績含む.<p>
	 *
	 */
	public static final String $inc_schd_act_flg = "inc_schd_act_flg";
	/**
	 * Include transferred 振替済含む.<p>
	 *
	 */
	public static final String $inc_sw_flg = "inc_sw_flg";
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
	 * AP supplier classification 1 search target 買掛先分類１検索対象.<p>
	 *
	 */
	public static final String $asppl_grp_flg1 = "asppl_grp_flg1";
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
	 * AP supplier classification 2 search target 買掛先分類２検索対象.<p>
	 *
	 */
	public static final String $asppl_grp_flg2 = "asppl_grp_flg2";
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
	 * AP supplier classification 3 search target 買掛先分類３検索対象.<p>
	 *
	 */
	public static final String $asppl_grp_flg3 = "asppl_grp_flg3";
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
	 * AP supplier classification 4 search target 買掛先分類４検索対象.<p>
	 *
	 */
	public static final String $asppl_grp_flg4 = "asppl_grp_flg4";
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
	 * AP supplier classification 5 search target 買掛先分類５検索対象.<p>
	 *
	 */
	public static final String $asppl_grp_flg5 = "asppl_grp_flg5";
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
	 * AP supplier classification 6 search target 買掛先分類６検索対象.<p>
	 *
	 */
	public static final String $asppl_grp_flg6 = "asppl_grp_flg6";
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
	 * AP supplier classification 7 search target 買掛先分類７検索対象.<p>
	 *
	 */
	public static final String $asppl_grp_flg7 = "asppl_grp_flg7";
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
	 * AP supplier classification 8 search target 買掛先分類８検索対象.<p>
	 *
	 */
	public static final String $asppl_grp_flg8 = "asppl_grp_flg8";
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
	 * AP supplier classification 9 search target 買掛先分類９検索対象.<p>
	 *
	 */
	public static final String $asppl_grp_flg9 = "asppl_grp_flg9";
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
	 * AP supplier classification 10 search target 買掛先分類１０検索対象.<p>
	 *
	 */
	public static final String $asppl_grp_flg10 = "asppl_grp_flg10";
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
	 * Operation date 運用日付.<p>
	 *
	 */
	public static final String $today = "today";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
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


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta mode_META = createStringMeta($mode);
	public static final MCMeta pay_schd_dt_fr_META = createCommonMeta($pay_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_dt_to_META = createCommonMeta($pay_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_act_dt_fr_META = createCommonMeta($pay_act_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_act_dt_to_META = createCommonMeta($pay_act_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_fr_META = createCommonMeta($ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_to_META = createCommonMeta($ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bsppl_cl_dt_fr_META = createCommonMeta($bsppl_cl_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bsppl_cl_dt_to_META = createCommonMeta($bsppl_cl_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta psppl_nm_META = createCommonMeta($psppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_nm_META = createCommonMeta($bsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta pay_usr_cd_META = createCommonMeta($pay_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta pay_usr_nm_META = createCommonMeta($pay_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta pay_dpt_cd_META = createCommonMeta($pay_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pay_dpt_nm_META = createCommonMeta($pay_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bsppl_usr_cd_META = createCommonMeta($bsppl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta bsppl_usr_nm_META = createCommonMeta($bsppl_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bsppl_dpt_nm_META = createCommonMeta($bsppl_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta ap_sttl_cd_META = createCommonMeta($ap_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ap_sttl_nm_META = createCommonMeta($ap_sttl_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta pay_chk_no_META = createCommonMeta($pay_chk_no, mcframe.commonMA.meta.MA_META.PAY_CHK_NO);
	public static final MCMeta pay_schd_no_META = createCommonMeta($pay_schd_no, mcframe.commonMA.meta.MA_META.PAY_SCHD_NO);
	public static final MCMeta pay_act_no_META = createCommonMeta($pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta note_no_META = createCommonMeta($note_no, mcframe.commonMA.meta.MA_META.NOTE_NO);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PAY_ACT_INTR_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_d_rmrks_META = createCommonMeta($intr_d_rmrks, mcframe.commonMS.meta.MS_META.PAY_ACT_D_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PAY_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PAY_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PAY_ACT_SUB_CHAR3);
	public static final MCMeta dtl_sub_char1_META = createCommonMeta($dtl_sub_char1, mcframe.commonMS.meta.MS_META.PAY_ACT_D_SUB_CHAR1);
	public static final MCMeta dtl_sub_char2_META = createCommonMeta($dtl_sub_char2, mcframe.commonMS.meta.MS_META.PAY_ACT_D_SUB_CHAR2);
	public static final MCMeta dtl_sub_char3_META = createCommonMeta($dtl_sub_char3, mcframe.commonMS.meta.MS_META.PAY_ACT_D_SUB_CHAR3);
	public static final MCMeta inc_can_flg_META = createCommonMeta($inc_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_schd_act_flg_META = createCommonMeta($inc_schd_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_sw_flg_META = createCommonMeta($inc_sw_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta asppl_grp_flg1_META = createCommonMeta($asppl_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_grp_cd1_META = createCommonMeta($asppl_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm1_META = createCommonMeta($asppl_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_flg2_META = createCommonMeta($asppl_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_grp_cd2_META = createCommonMeta($asppl_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm2_META = createCommonMeta($asppl_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_flg3_META = createCommonMeta($asppl_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_grp_cd3_META = createCommonMeta($asppl_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm3_META = createCommonMeta($asppl_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_flg4_META = createCommonMeta($asppl_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_grp_cd4_META = createCommonMeta($asppl_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm4_META = createCommonMeta($asppl_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_flg5_META = createCommonMeta($asppl_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_grp_cd5_META = createCommonMeta($asppl_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm5_META = createCommonMeta($asppl_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_flg6_META = createCommonMeta($asppl_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_grp_cd6_META = createCommonMeta($asppl_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm6_META = createCommonMeta($asppl_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_flg7_META = createCommonMeta($asppl_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_grp_cd7_META = createCommonMeta($asppl_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm7_META = createCommonMeta($asppl_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_flg8_META = createCommonMeta($asppl_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_grp_cd8_META = createCommonMeta($asppl_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm8_META = createCommonMeta($asppl_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_flg9_META = createCommonMeta($asppl_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_grp_cd9_META = createCommonMeta($asppl_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm9_META = createCommonMeta($asppl_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_flg10_META = createCommonMeta($asppl_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_grp_cd10_META = createCommonMeta($asppl_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm10_META = createCommonMeta($asppl_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta today_META = createCommonMeta($today, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_amt_dec_place_META = createCommonMeta($base_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			mode_META,
			pay_schd_dt_fr_META,
			pay_schd_dt_to_META,
			pay_act_dt_fr_META,
			pay_act_dt_to_META,
			ac_dt_fr_META,
			ac_dt_to_META,
			bsppl_cl_dt_fr_META,
			bsppl_cl_dt_to_META,
			psppl_cd_META,
			psppl_nm_META,
			bsppl_cd_META,
			bsppl_nm_META,
			pay_usr_cd_META,
			pay_usr_nm_META,
			pay_dpt_cd_META,
			pay_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			bsppl_usr_cd_META,
			bsppl_usr_nm_META,
			bsppl_dpt_cd_META,
			bsppl_dpt_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			ap_sttl_cd_META,
			ap_sttl_nm_META,
			purc_act_no_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			wrk_no_META,
			wrk_nm_META,
			pay_chk_no_META,
			pay_schd_no_META,
			pay_act_no_META,
			note_no_META,
			trd_rmrks_META,
			intr_rmrks_META,
			trd_d_rmrks_META,
			intr_d_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			dtl_sub_char1_META,
			dtl_sub_char2_META,
			dtl_sub_char3_META,
			inc_can_flg_META,
			inc_schd_act_flg_META,
			inc_sw_flg_META,
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
			psppl_grp_nm10_META,
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
			asppl_grp_flg1_META,
			asppl_grp_cd1_META,
			asppl_grp_nm1_META,
			asppl_grp_flg2_META,
			asppl_grp_cd2_META,
			asppl_grp_nm2_META,
			asppl_grp_flg3_META,
			asppl_grp_cd3_META,
			asppl_grp_nm3_META,
			asppl_grp_flg4_META,
			asppl_grp_cd4_META,
			asppl_grp_nm4_META,
			asppl_grp_flg5_META,
			asppl_grp_cd5_META,
			asppl_grp_nm5_META,
			asppl_grp_flg6_META,
			asppl_grp_cd6_META,
			asppl_grp_nm6_META,
			asppl_grp_flg7_META,
			asppl_grp_cd7_META,
			asppl_grp_nm7_META,
			asppl_grp_flg8_META,
			asppl_grp_cd8_META,
			asppl_grp_nm8_META,
			asppl_grp_flg9_META,
			asppl_grp_cd9_META,
			asppl_grp_nm9_META,
			asppl_grp_flg10_META,
			asppl_grp_cd10_META,
			asppl_grp_nm10_META,
			today_META,
			xrate_cd_META,
			base_cur_cd_META,
			base_cur_nm_META,
			base_cur_amt_dec_place_META
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
	 * Search mode 検索モード.<p>
	 *
	 */
	public String mode() {
		return getConstString(offset + 1, $mode);
	}

	/**
	 * Search mode 検索モード.<p>
	 *
	 */
	public void mode(String value) {
		setConstString(offset + 1, $mode, value);
	}


	/**
	 * Scheduled payment date FROM 支払予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate pay_schd_dt_fr() {
		return getConstDate(offset + 2, $pay_schd_dt_fr);
	}

	/**
	 * Scheduled payment date FROM 支払予定日ＦＲＯＭ.<p>
	 *
	 */
	public void pay_schd_dt_fr(MCDate value) {
		setConstDate(offset + 2, $pay_schd_dt_fr, value);
	}


	/**
	 * Scheduled payment date TO 支払予定日ＴＯ.<p>
	 *
	 */
	public MCDate pay_schd_dt_to() {
		return getConstDate(offset + 3, $pay_schd_dt_to);
	}

	/**
	 * Scheduled payment date TO 支払予定日ＴＯ.<p>
	 *
	 */
	public void pay_schd_dt_to(MCDate value) {
		setConstDate(offset + 3, $pay_schd_dt_to, value);
	}


	/**
	 * Actual payment date FROM 支払実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate pay_act_dt_fr() {
		return getConstDate(offset + 4, $pay_act_dt_fr);
	}

	/**
	 * Actual payment date FROM 支払実績日ＦＲＯＭ.<p>
	 *
	 */
	public void pay_act_dt_fr(MCDate value) {
		setConstDate(offset + 4, $pay_act_dt_fr, value);
	}


	/**
	 * Actual payment date TO 支払実績日ＴＯ.<p>
	 *
	 */
	public MCDate pay_act_dt_to() {
		return getConstDate(offset + 5, $pay_act_dt_to);
	}

	/**
	 * Actual payment date TO 支払実績日ＴＯ.<p>
	 *
	 */
	public void pay_act_dt_to(MCDate value) {
		setConstDate(offset + 5, $pay_act_dt_to, value);
	}


	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ac_dt_fr() {
		return getConstDate(offset + 6, $ac_dt_fr);
	}

	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public void ac_dt_fr(MCDate value) {
		setConstDate(offset + 6, $ac_dt_fr, value);
	}


	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public MCDate ac_dt_to() {
		return getConstDate(offset + 7, $ac_dt_to);
	}

	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public void ac_dt_to(MCDate value) {
		setConstDate(offset + 7, $ac_dt_to, value);
	}


	/**
	 * Scheduled payee closing year, month, and date FROM 支払予定管理先締年月日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate bsppl_cl_dt_fr() {
		return getConstDate(offset + 8, $bsppl_cl_dt_fr);
	}

	/**
	 * Scheduled payee closing year, month, and date FROM 支払予定管理先締年月日ＦＲＯＭ.<p>
	 *
	 */
	public void bsppl_cl_dt_fr(MCDate value) {
		setConstDate(offset + 8, $bsppl_cl_dt_fr, value);
	}


	/**
	 * Scheduled payee closing year, month, and date TO 支払予定管理先締年月日ＴＯ.<p>
	 *
	 */
	public MCDate bsppl_cl_dt_to() {
		return getConstDate(offset + 9, $bsppl_cl_dt_to);
	}

	/**
	 * Scheduled payee closing year, month, and date TO 支払予定管理先締年月日ＴＯ.<p>
	 *
	 */
	public void bsppl_cl_dt_to(MCDate value) {
		setConstDate(offset + 9, $bsppl_cl_dt_to, value);
	}


	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 10, $psppl_cd);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 10, $psppl_cd, value);
	}


	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public String psppl_nm() {
		return getConstString(offset + 11, $psppl_nm);
	}

	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public void psppl_nm(String value) {
		setConstString(offset + 11, $psppl_nm, value);
	}


	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 12, $bsppl_cd);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 12, $bsppl_cd, value);
	}


	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public String bsppl_nm() {
		return getConstString(offset + 13, $bsppl_nm);
	}

	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public void bsppl_nm(String value) {
		setConstString(offset + 13, $bsppl_nm, value);
	}


	/**
	 * Payment PIC cd. 支払担当者ＣＤ.<p>
	 *
	 */
	public String pay_usr_cd() {
		return getConstString(offset + 14, $pay_usr_cd);
	}

	/**
	 * Payment PIC cd. 支払担当者ＣＤ.<p>
	 *
	 */
	public void pay_usr_cd(String value) {
		setConstString(offset + 14, $pay_usr_cd, value);
	}


	/**
	 * Payment PIC name 支払担当者名.<p>
	 *
	 */
	public String pay_usr_nm() {
		return getConstString(offset + 15, $pay_usr_nm);
	}

	/**
	 * Payment PIC name 支払担当者名.<p>
	 *
	 */
	public void pay_usr_nm(String value) {
		setConstString(offset + 15, $pay_usr_nm, value);
	}


	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public String pay_dpt_cd() {
		return getConstString(offset + 16, $pay_dpt_cd);
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public void pay_dpt_cd(String value) {
		setConstString(offset + 16, $pay_dpt_cd, value);
	}


	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public String pay_dpt_nm() {
		return getConstString(offset + 17, $pay_dpt_nm);
	}

	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public void pay_dpt_nm(String value) {
		setConstString(offset + 17, $pay_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 18, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 18, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 19, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 19, $wg_nm, value);
	}


	/**
	 * Scheduled payee PIC cd. 支払予定管理先担当者ＣＤ.<p>
	 *
	 */
	public String bsppl_usr_cd() {
		return getConstString(offset + 20, $bsppl_usr_cd);
	}

	/**
	 * Scheduled payee PIC cd. 支払予定管理先担当者ＣＤ.<p>
	 *
	 */
	public void bsppl_usr_cd(String value) {
		setConstString(offset + 20, $bsppl_usr_cd, value);
	}


	/**
	 * Scheduled payee PIC name 支払予定管理先担当者名.<p>
	 *
	 */
	public String bsppl_usr_nm() {
		return getConstString(offset + 21, $bsppl_usr_nm);
	}

	/**
	 * Scheduled payee PIC name 支払予定管理先担当者名.<p>
	 *
	 */
	public void bsppl_usr_nm(String value) {
		setConstString(offset + 21, $bsppl_usr_nm, value);
	}


	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 22, $bsppl_dpt_cd);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 22, $bsppl_dpt_cd, value);
	}


	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public String bsppl_dpt_nm() {
		return getConstString(offset + 23, $bsppl_dpt_nm);
	}

	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public void bsppl_dpt_nm(String value) {
		setConstString(offset + 23, $bsppl_dpt_nm, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 24, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 24, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 25, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 25, $trd_cur_nm, value);
	}


	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public String ap_sttl_cd() {
		return getConstString(offset + 26, $ap_sttl_cd);
	}

	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public void ap_sttl_cd(String value) {
		setConstString(offset + 26, $ap_sttl_cd, value);
	}


	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public String ap_sttl_nm() {
		return getConstString(offset + 27, $ap_sttl_nm);
	}

	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public void ap_sttl_nm(String value) {
		setConstString(offset + 27, $ap_sttl_nm, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 28, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 28, $purc_act_no, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 29, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 29, $rcpt_iv_no, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 30, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 30, $rcpt_iv_mng_no, value);
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
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public String pay_chk_no() {
		return getConstString(offset + 33, $pay_chk_no);
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no(String value) {
		setConstString(offset + 33, $pay_chk_no, value);
	}


	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public String pay_schd_no() {
		return getConstString(offset + 34, $pay_schd_no);
	}

	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public void pay_schd_no(String value) {
		setConstString(offset + 34, $pay_schd_no, value);
	}


	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public String pay_act_no() {
		return getConstString(offset + 35, $pay_act_no);
	}

	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public void pay_act_no(String value) {
		setConstString(offset + 35, $pay_act_no, value);
	}


	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 36, $note_no);
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 36, $note_no, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 37, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 37, $trd_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 38, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 38, $intr_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 39, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 39, $trd_d_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 40, $intr_d_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 40, $intr_d_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 41, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 41, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 42, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 42, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 43, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 43, $sub_char3, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String dtl_sub_char1() {
		return getConstString(offset + 44, $dtl_sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void dtl_sub_char1(String value) {
		setConstString(offset + 44, $dtl_sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String dtl_sub_char2() {
		return getConstString(offset + 45, $dtl_sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void dtl_sub_char2(String value) {
		setConstString(offset + 45, $dtl_sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String dtl_sub_char3() {
		return getConstString(offset + 46, $dtl_sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void dtl_sub_char3(String value) {
		setConstString(offset + 46, $dtl_sub_char3, value);
	}


	/**
	 * Include invalid/cancel 無効・取消含む.<p>
	 *
	 */
	public boolean inc_can_flg() {
		return getConstBoolean(offset + 47, $inc_can_flg);
	}

	/**
	 * Include invalid/cancel 無効・取消含む.<p>
	 *
	 */
	public void inc_can_flg(boolean value) {
		setConstBoolean(offset + 47, $inc_can_flg, value);
	}


	/**
	 * Include result at schedule 予定時実績含む.<p>
	 *
	 */
	public boolean inc_schd_act_flg() {
		return getConstBoolean(offset + 48, $inc_schd_act_flg);
	}

	/**
	 * Include result at schedule 予定時実績含む.<p>
	 *
	 */
	public void inc_schd_act_flg(boolean value) {
		setConstBoolean(offset + 48, $inc_schd_act_flg, value);
	}


	/**
	 * Include transferred 振替済含む.<p>
	 *
	 */
	public boolean inc_sw_flg() {
		return getConstBoolean(offset + 49, $inc_sw_flg);
	}

	/**
	 * Include transferred 振替済含む.<p>
	 *
	 */
	public void inc_sw_flg(boolean value) {
		setConstBoolean(offset + 49, $inc_sw_flg, value);
	}


	/**
	 * Payee classification 1 search target 支払先分類１検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg1() {
		return getConstBoolean(offset + 50, $psppl_grp_flg1);
	}

	/**
	 * Payee classification 1 search target 支払先分類１検索対象.<p>
	 *
	 */
	public void psppl_grp_flg1(boolean value) {
		setConstBoolean(offset + 50, $psppl_grp_flg1, value);
	}


	/**
	 * Payee classification cd. 1 支払先分類ＣＤ１.<p>
	 *
	 */
	public String psppl_grp_cd1() {
		return getConstString(offset + 51, $psppl_grp_cd1);
	}

	/**
	 * Payee classification cd. 1 支払先分類ＣＤ１.<p>
	 *
	 */
	public void psppl_grp_cd1(String value) {
		setConstString(offset + 51, $psppl_grp_cd1, value);
	}


	/**
	 * Payee classification name 1 支払先分類名１.<p>
	 *
	 */
	public String psppl_grp_nm1() {
		return getConstString(offset + 52, $psppl_grp_nm1);
	}

	/**
	 * Payee classification name 1 支払先分類名１.<p>
	 *
	 */
	public void psppl_grp_nm1(String value) {
		setConstString(offset + 52, $psppl_grp_nm1, value);
	}


	/**
	 * Payee classification 2 search target 支払先分類２検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg2() {
		return getConstBoolean(offset + 53, $psppl_grp_flg2);
	}

	/**
	 * Payee classification 2 search target 支払先分類２検索対象.<p>
	 *
	 */
	public void psppl_grp_flg2(boolean value) {
		setConstBoolean(offset + 53, $psppl_grp_flg2, value);
	}


	/**
	 * Payee classification cd. 2 支払先分類ＣＤ２.<p>
	 *
	 */
	public String psppl_grp_cd2() {
		return getConstString(offset + 54, $psppl_grp_cd2);
	}

	/**
	 * Payee classification cd. 2 支払先分類ＣＤ２.<p>
	 *
	 */
	public void psppl_grp_cd2(String value) {
		setConstString(offset + 54, $psppl_grp_cd2, value);
	}


	/**
	 * Payee classification name 2 支払先分類名２.<p>
	 *
	 */
	public String psppl_grp_nm2() {
		return getConstString(offset + 55, $psppl_grp_nm2);
	}

	/**
	 * Payee classification name 2 支払先分類名２.<p>
	 *
	 */
	public void psppl_grp_nm2(String value) {
		setConstString(offset + 55, $psppl_grp_nm2, value);
	}


	/**
	 * Payee classification 3 search target 支払先分類３検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg3() {
		return getConstBoolean(offset + 56, $psppl_grp_flg3);
	}

	/**
	 * Payee classification 3 search target 支払先分類３検索対象.<p>
	 *
	 */
	public void psppl_grp_flg3(boolean value) {
		setConstBoolean(offset + 56, $psppl_grp_flg3, value);
	}


	/**
	 * Payee classification cd. 3 支払先分類ＣＤ３.<p>
	 *
	 */
	public String psppl_grp_cd3() {
		return getConstString(offset + 57, $psppl_grp_cd3);
	}

	/**
	 * Payee classification cd. 3 支払先分類ＣＤ３.<p>
	 *
	 */
	public void psppl_grp_cd3(String value) {
		setConstString(offset + 57, $psppl_grp_cd3, value);
	}


	/**
	 * Payee classification name 3 支払先分類名３.<p>
	 *
	 */
	public String psppl_grp_nm3() {
		return getConstString(offset + 58, $psppl_grp_nm3);
	}

	/**
	 * Payee classification name 3 支払先分類名３.<p>
	 *
	 */
	public void psppl_grp_nm3(String value) {
		setConstString(offset + 58, $psppl_grp_nm3, value);
	}


	/**
	 * Payee classification 4 search target 支払先分類４検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg4() {
		return getConstBoolean(offset + 59, $psppl_grp_flg4);
	}

	/**
	 * Payee classification 4 search target 支払先分類４検索対象.<p>
	 *
	 */
	public void psppl_grp_flg4(boolean value) {
		setConstBoolean(offset + 59, $psppl_grp_flg4, value);
	}


	/**
	 * Payee classification cd. 4 支払先分類ＣＤ４.<p>
	 *
	 */
	public String psppl_grp_cd4() {
		return getConstString(offset + 60, $psppl_grp_cd4);
	}

	/**
	 * Payee classification cd. 4 支払先分類ＣＤ４.<p>
	 *
	 */
	public void psppl_grp_cd4(String value) {
		setConstString(offset + 60, $psppl_grp_cd4, value);
	}


	/**
	 * Payee classification name 4 支払先分類名４.<p>
	 *
	 */
	public String psppl_grp_nm4() {
		return getConstString(offset + 61, $psppl_grp_nm4);
	}

	/**
	 * Payee classification name 4 支払先分類名４.<p>
	 *
	 */
	public void psppl_grp_nm4(String value) {
		setConstString(offset + 61, $psppl_grp_nm4, value);
	}


	/**
	 * Payee classification 5 search target 支払先分類５検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg5() {
		return getConstBoolean(offset + 62, $psppl_grp_flg5);
	}

	/**
	 * Payee classification 5 search target 支払先分類５検索対象.<p>
	 *
	 */
	public void psppl_grp_flg5(boolean value) {
		setConstBoolean(offset + 62, $psppl_grp_flg5, value);
	}


	/**
	 * Payee classification cd. 5 支払先分類ＣＤ５.<p>
	 *
	 */
	public String psppl_grp_cd5() {
		return getConstString(offset + 63, $psppl_grp_cd5);
	}

	/**
	 * Payee classification cd. 5 支払先分類ＣＤ５.<p>
	 *
	 */
	public void psppl_grp_cd5(String value) {
		setConstString(offset + 63, $psppl_grp_cd5, value);
	}


	/**
	 * Payee classification name 5 支払先分類名５.<p>
	 *
	 */
	public String psppl_grp_nm5() {
		return getConstString(offset + 64, $psppl_grp_nm5);
	}

	/**
	 * Payee classification name 5 支払先分類名５.<p>
	 *
	 */
	public void psppl_grp_nm5(String value) {
		setConstString(offset + 64, $psppl_grp_nm5, value);
	}


	/**
	 * Payee classification 6 search target 支払先分類６検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg6() {
		return getConstBoolean(offset + 65, $psppl_grp_flg6);
	}

	/**
	 * Payee classification 6 search target 支払先分類６検索対象.<p>
	 *
	 */
	public void psppl_grp_flg6(boolean value) {
		setConstBoolean(offset + 65, $psppl_grp_flg6, value);
	}


	/**
	 * Payee classification cd. 6 支払先分類ＣＤ６.<p>
	 *
	 */
	public String psppl_grp_cd6() {
		return getConstString(offset + 66, $psppl_grp_cd6);
	}

	/**
	 * Payee classification cd. 6 支払先分類ＣＤ６.<p>
	 *
	 */
	public void psppl_grp_cd6(String value) {
		setConstString(offset + 66, $psppl_grp_cd6, value);
	}


	/**
	 * Payee classification name 6 支払先分類名６.<p>
	 *
	 */
	public String psppl_grp_nm6() {
		return getConstString(offset + 67, $psppl_grp_nm6);
	}

	/**
	 * Payee classification name 6 支払先分類名６.<p>
	 *
	 */
	public void psppl_grp_nm6(String value) {
		setConstString(offset + 67, $psppl_grp_nm6, value);
	}


	/**
	 * Payee classification 7 search target 支払先分類７検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg7() {
		return getConstBoolean(offset + 68, $psppl_grp_flg7);
	}

	/**
	 * Payee classification 7 search target 支払先分類７検索対象.<p>
	 *
	 */
	public void psppl_grp_flg7(boolean value) {
		setConstBoolean(offset + 68, $psppl_grp_flg7, value);
	}


	/**
	 * Payee classification cd. 7 支払先分類ＣＤ７.<p>
	 *
	 */
	public String psppl_grp_cd7() {
		return getConstString(offset + 69, $psppl_grp_cd7);
	}

	/**
	 * Payee classification cd. 7 支払先分類ＣＤ７.<p>
	 *
	 */
	public void psppl_grp_cd7(String value) {
		setConstString(offset + 69, $psppl_grp_cd7, value);
	}


	/**
	 * Payee classification name 7 支払先分類名７.<p>
	 *
	 */
	public String psppl_grp_nm7() {
		return getConstString(offset + 70, $psppl_grp_nm7);
	}

	/**
	 * Payee classification name 7 支払先分類名７.<p>
	 *
	 */
	public void psppl_grp_nm7(String value) {
		setConstString(offset + 70, $psppl_grp_nm7, value);
	}


	/**
	 * Payee classification 8 search target 支払先分類８検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg8() {
		return getConstBoolean(offset + 71, $psppl_grp_flg8);
	}

	/**
	 * Payee classification 8 search target 支払先分類８検索対象.<p>
	 *
	 */
	public void psppl_grp_flg8(boolean value) {
		setConstBoolean(offset + 71, $psppl_grp_flg8, value);
	}


	/**
	 * Payee classification cd. 8 支払先分類ＣＤ８.<p>
	 *
	 */
	public String psppl_grp_cd8() {
		return getConstString(offset + 72, $psppl_grp_cd8);
	}

	/**
	 * Payee classification cd. 8 支払先分類ＣＤ８.<p>
	 *
	 */
	public void psppl_grp_cd8(String value) {
		setConstString(offset + 72, $psppl_grp_cd8, value);
	}


	/**
	 * Payee classification name 8 支払先分類名８.<p>
	 *
	 */
	public String psppl_grp_nm8() {
		return getConstString(offset + 73, $psppl_grp_nm8);
	}

	/**
	 * Payee classification name 8 支払先分類名８.<p>
	 *
	 */
	public void psppl_grp_nm8(String value) {
		setConstString(offset + 73, $psppl_grp_nm8, value);
	}


	/**
	 * Payee classification 9 search target 支払先分類９検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg9() {
		return getConstBoolean(offset + 74, $psppl_grp_flg9);
	}

	/**
	 * Payee classification 9 search target 支払先分類９検索対象.<p>
	 *
	 */
	public void psppl_grp_flg9(boolean value) {
		setConstBoolean(offset + 74, $psppl_grp_flg9, value);
	}


	/**
	 * Payee classification cd. 9 支払先分類ＣＤ９.<p>
	 *
	 */
	public String psppl_grp_cd9() {
		return getConstString(offset + 75, $psppl_grp_cd9);
	}

	/**
	 * Payee classification cd. 9 支払先分類ＣＤ９.<p>
	 *
	 */
	public void psppl_grp_cd9(String value) {
		setConstString(offset + 75, $psppl_grp_cd9, value);
	}


	/**
	 * Payee classification name 9 支払先分類名９.<p>
	 *
	 */
	public String psppl_grp_nm9() {
		return getConstString(offset + 76, $psppl_grp_nm9);
	}

	/**
	 * Payee classification name 9 支払先分類名９.<p>
	 *
	 */
	public void psppl_grp_nm9(String value) {
		setConstString(offset + 76, $psppl_grp_nm9, value);
	}


	/**
	 * Payee classification 10 search target 支払先分類１０検索対象.<p>
	 *
	 */
	public boolean psppl_grp_flg10() {
		return getConstBoolean(offset + 77, $psppl_grp_flg10);
	}

	/**
	 * Payee classification 10 search target 支払先分類１０検索対象.<p>
	 *
	 */
	public void psppl_grp_flg10(boolean value) {
		setConstBoolean(offset + 77, $psppl_grp_flg10, value);
	}


	/**
	 * Payee classification cd. 10 支払先分類ＣＤ１０.<p>
	 *
	 */
	public String psppl_grp_cd10() {
		return getConstString(offset + 78, $psppl_grp_cd10);
	}

	/**
	 * Payee classification cd. 10 支払先分類ＣＤ１０.<p>
	 *
	 */
	public void psppl_grp_cd10(String value) {
		setConstString(offset + 78, $psppl_grp_cd10, value);
	}


	/**
	 * Payee classification name 10 支払先分類名１０.<p>
	 *
	 */
	public String psppl_grp_nm10() {
		return getConstString(offset + 79, $psppl_grp_nm10);
	}

	/**
	 * Payee classification name 10 支払先分類名１０.<p>
	 *
	 */
	public void psppl_grp_nm10(String value) {
		setConstString(offset + 79, $psppl_grp_nm10, value);
	}


	/**
	 * Scheduled payee classification 1 search target 支払予定管理先分類１検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg1() {
		return getConstBoolean(offset + 80, $bsppl_grp_flg1);
	}

	/**
	 * Scheduled payee classification 1 search target 支払予定管理先分類１検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg1(boolean value) {
		setConstBoolean(offset + 80, $bsppl_grp_flg1, value);
	}


	/**
	 * Scheduled payee classification cd. 1 支払予定管理先分類ＣＤ１.<p>
	 *
	 */
	public String bsppl_grp_cd1() {
		return getConstString(offset + 81, $bsppl_grp_cd1);
	}

	/**
	 * Scheduled payee classification cd. 1 支払予定管理先分類ＣＤ１.<p>
	 *
	 */
	public void bsppl_grp_cd1(String value) {
		setConstString(offset + 81, $bsppl_grp_cd1, value);
	}


	/**
	 * Scheduled payee classification name 1 支払予定管理先分類名１.<p>
	 *
	 */
	public String bsppl_grp_nm1() {
		return getConstString(offset + 82, $bsppl_grp_nm1);
	}

	/**
	 * Scheduled payee classification name 1 支払予定管理先分類名１.<p>
	 *
	 */
	public void bsppl_grp_nm1(String value) {
		setConstString(offset + 82, $bsppl_grp_nm1, value);
	}


	/**
	 * Scheduled payee classification 2 search target 支払予定管理先分類２検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg2() {
		return getConstBoolean(offset + 83, $bsppl_grp_flg2);
	}

	/**
	 * Scheduled payee classification 2 search target 支払予定管理先分類２検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg2(boolean value) {
		setConstBoolean(offset + 83, $bsppl_grp_flg2, value);
	}


	/**
	 * Scheduled payee classification cd. 2 支払予定管理先分類ＣＤ２.<p>
	 *
	 */
	public String bsppl_grp_cd2() {
		return getConstString(offset + 84, $bsppl_grp_cd2);
	}

	/**
	 * Scheduled payee classification cd. 2 支払予定管理先分類ＣＤ２.<p>
	 *
	 */
	public void bsppl_grp_cd2(String value) {
		setConstString(offset + 84, $bsppl_grp_cd2, value);
	}


	/**
	 * Scheduled payee classification name 2 支払予定管理先分類名２.<p>
	 *
	 */
	public String bsppl_grp_nm2() {
		return getConstString(offset + 85, $bsppl_grp_nm2);
	}

	/**
	 * Scheduled payee classification name 2 支払予定管理先分類名２.<p>
	 *
	 */
	public void bsppl_grp_nm2(String value) {
		setConstString(offset + 85, $bsppl_grp_nm2, value);
	}


	/**
	 * Scheduled payee classification 3 search target 支払予定管理先分類３検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg3() {
		return getConstBoolean(offset + 86, $bsppl_grp_flg3);
	}

	/**
	 * Scheduled payee classification 3 search target 支払予定管理先分類３検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg3(boolean value) {
		setConstBoolean(offset + 86, $bsppl_grp_flg3, value);
	}


	/**
	 * Scheduled payee classification cd. 3 支払予定管理先分類ＣＤ３.<p>
	 *
	 */
	public String bsppl_grp_cd3() {
		return getConstString(offset + 87, $bsppl_grp_cd3);
	}

	/**
	 * Scheduled payee classification cd. 3 支払予定管理先分類ＣＤ３.<p>
	 *
	 */
	public void bsppl_grp_cd3(String value) {
		setConstString(offset + 87, $bsppl_grp_cd3, value);
	}


	/**
	 * Scheduled payee classification name 3 支払予定管理先分類名３.<p>
	 *
	 */
	public String bsppl_grp_nm3() {
		return getConstString(offset + 88, $bsppl_grp_nm3);
	}

	/**
	 * Scheduled payee classification name 3 支払予定管理先分類名３.<p>
	 *
	 */
	public void bsppl_grp_nm3(String value) {
		setConstString(offset + 88, $bsppl_grp_nm3, value);
	}


	/**
	 * Scheduled payee classification 4 search target 支払予定管理先分類４検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg4() {
		return getConstBoolean(offset + 89, $bsppl_grp_flg4);
	}

	/**
	 * Scheduled payee classification 4 search target 支払予定管理先分類４検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg4(boolean value) {
		setConstBoolean(offset + 89, $bsppl_grp_flg4, value);
	}


	/**
	 * Scheduled payee classification cd. 4 支払予定管理先分類ＣＤ４.<p>
	 *
	 */
	public String bsppl_grp_cd4() {
		return getConstString(offset + 90, $bsppl_grp_cd4);
	}

	/**
	 * Scheduled payee classification cd. 4 支払予定管理先分類ＣＤ４.<p>
	 *
	 */
	public void bsppl_grp_cd4(String value) {
		setConstString(offset + 90, $bsppl_grp_cd4, value);
	}


	/**
	 * Scheduled payee classification name 4 支払予定管理先分類名４.<p>
	 *
	 */
	public String bsppl_grp_nm4() {
		return getConstString(offset + 91, $bsppl_grp_nm4);
	}

	/**
	 * Scheduled payee classification name 4 支払予定管理先分類名４.<p>
	 *
	 */
	public void bsppl_grp_nm4(String value) {
		setConstString(offset + 91, $bsppl_grp_nm4, value);
	}


	/**
	 * Scheduled payee classification 5 search target 支払予定管理先分類５検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg5() {
		return getConstBoolean(offset + 92, $bsppl_grp_flg5);
	}

	/**
	 * Scheduled payee classification 5 search target 支払予定管理先分類５検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg5(boolean value) {
		setConstBoolean(offset + 92, $bsppl_grp_flg5, value);
	}


	/**
	 * Scheduled payee classification cd. 5 支払予定管理先分類ＣＤ５.<p>
	 *
	 */
	public String bsppl_grp_cd5() {
		return getConstString(offset + 93, $bsppl_grp_cd5);
	}

	/**
	 * Scheduled payee classification cd. 5 支払予定管理先分類ＣＤ５.<p>
	 *
	 */
	public void bsppl_grp_cd5(String value) {
		setConstString(offset + 93, $bsppl_grp_cd5, value);
	}


	/**
	 * Scheduled payee classification name 5 支払予定管理先分類名５.<p>
	 *
	 */
	public String bsppl_grp_nm5() {
		return getConstString(offset + 94, $bsppl_grp_nm5);
	}

	/**
	 * Scheduled payee classification name 5 支払予定管理先分類名５.<p>
	 *
	 */
	public void bsppl_grp_nm5(String value) {
		setConstString(offset + 94, $bsppl_grp_nm5, value);
	}


	/**
	 * Scheduled payee classification 6 search target 支払予定管理先分類６検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg6() {
		return getConstBoolean(offset + 95, $bsppl_grp_flg6);
	}

	/**
	 * Scheduled payee classification 6 search target 支払予定管理先分類６検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg6(boolean value) {
		setConstBoolean(offset + 95, $bsppl_grp_flg6, value);
	}


	/**
	 * Scheduled payee classification cd. 6 支払予定管理先分類ＣＤ６.<p>
	 *
	 */
	public String bsppl_grp_cd6() {
		return getConstString(offset + 96, $bsppl_grp_cd6);
	}

	/**
	 * Scheduled payee classification cd. 6 支払予定管理先分類ＣＤ６.<p>
	 *
	 */
	public void bsppl_grp_cd6(String value) {
		setConstString(offset + 96, $bsppl_grp_cd6, value);
	}


	/**
	 * Scheduled payee classification name 6 支払予定管理先分類名６.<p>
	 *
	 */
	public String bsppl_grp_nm6() {
		return getConstString(offset + 97, $bsppl_grp_nm6);
	}

	/**
	 * Scheduled payee classification name 6 支払予定管理先分類名６.<p>
	 *
	 */
	public void bsppl_grp_nm6(String value) {
		setConstString(offset + 97, $bsppl_grp_nm6, value);
	}


	/**
	 * Scheduled payee classification 7 search target 支払予定管理先分類７検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg7() {
		return getConstBoolean(offset + 98, $bsppl_grp_flg7);
	}

	/**
	 * Scheduled payee classification 7 search target 支払予定管理先分類７検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg7(boolean value) {
		setConstBoolean(offset + 98, $bsppl_grp_flg7, value);
	}


	/**
	 * Scheduled payee classification cd. 7 支払予定管理先分類ＣＤ７.<p>
	 *
	 */
	public String bsppl_grp_cd7() {
		return getConstString(offset + 99, $bsppl_grp_cd7);
	}

	/**
	 * Scheduled payee classification cd. 7 支払予定管理先分類ＣＤ７.<p>
	 *
	 */
	public void bsppl_grp_cd7(String value) {
		setConstString(offset + 99, $bsppl_grp_cd7, value);
	}


	/**
	 * Scheduled payee classification name 7 支払予定管理先分類名７.<p>
	 *
	 */
	public String bsppl_grp_nm7() {
		return getConstString(offset + 100, $bsppl_grp_nm7);
	}

	/**
	 * Scheduled payee classification name 7 支払予定管理先分類名７.<p>
	 *
	 */
	public void bsppl_grp_nm7(String value) {
		setConstString(offset + 100, $bsppl_grp_nm7, value);
	}


	/**
	 * Scheduled payee classification 8 search target 支払予定管理先分類８検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg8() {
		return getConstBoolean(offset + 101, $bsppl_grp_flg8);
	}

	/**
	 * Scheduled payee classification 8 search target 支払予定管理先分類８検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg8(boolean value) {
		setConstBoolean(offset + 101, $bsppl_grp_flg8, value);
	}


	/**
	 * Scheduled payee classification cd. 8 支払予定管理先分類ＣＤ８.<p>
	 *
	 */
	public String bsppl_grp_cd8() {
		return getConstString(offset + 102, $bsppl_grp_cd8);
	}

	/**
	 * Scheduled payee classification cd. 8 支払予定管理先分類ＣＤ８.<p>
	 *
	 */
	public void bsppl_grp_cd8(String value) {
		setConstString(offset + 102, $bsppl_grp_cd8, value);
	}


	/**
	 * Scheduled payee classification name 8 支払予定管理先分類名８.<p>
	 *
	 */
	public String bsppl_grp_nm8() {
		return getConstString(offset + 103, $bsppl_grp_nm8);
	}

	/**
	 * Scheduled payee classification name 8 支払予定管理先分類名８.<p>
	 *
	 */
	public void bsppl_grp_nm8(String value) {
		setConstString(offset + 103, $bsppl_grp_nm8, value);
	}


	/**
	 * Scheduled payee classification 9 search target 支払予定管理先分類９検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg9() {
		return getConstBoolean(offset + 104, $bsppl_grp_flg9);
	}

	/**
	 * Scheduled payee classification 9 search target 支払予定管理先分類９検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg9(boolean value) {
		setConstBoolean(offset + 104, $bsppl_grp_flg9, value);
	}


	/**
	 * Scheduled payee classification cd. 9 支払予定管理先分類ＣＤ９.<p>
	 *
	 */
	public String bsppl_grp_cd9() {
		return getConstString(offset + 105, $bsppl_grp_cd9);
	}

	/**
	 * Scheduled payee classification cd. 9 支払予定管理先分類ＣＤ９.<p>
	 *
	 */
	public void bsppl_grp_cd9(String value) {
		setConstString(offset + 105, $bsppl_grp_cd9, value);
	}


	/**
	 * Scheduled payee classification name 9 支払予定管理先分類名９.<p>
	 *
	 */
	public String bsppl_grp_nm9() {
		return getConstString(offset + 106, $bsppl_grp_nm9);
	}

	/**
	 * Scheduled payee classification name 9 支払予定管理先分類名９.<p>
	 *
	 */
	public void bsppl_grp_nm9(String value) {
		setConstString(offset + 106, $bsppl_grp_nm9, value);
	}


	/**
	 * Scheduled payee classification 10 search target 支払予定管理先分類１０検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg10() {
		return getConstBoolean(offset + 107, $bsppl_grp_flg10);
	}

	/**
	 * Scheduled payee classification 10 search target 支払予定管理先分類１０検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg10(boolean value) {
		setConstBoolean(offset + 107, $bsppl_grp_flg10, value);
	}


	/**
	 * Scheduled payee classification cd. 10 支払予定管理先分類ＣＤ１０.<p>
	 *
	 */
	public String bsppl_grp_cd10() {
		return getConstString(offset + 108, $bsppl_grp_cd10);
	}

	/**
	 * Scheduled payee classification cd. 10 支払予定管理先分類ＣＤ１０.<p>
	 *
	 */
	public void bsppl_grp_cd10(String value) {
		setConstString(offset + 108, $bsppl_grp_cd10, value);
	}


	/**
	 * Scheduled payee classification name 10 支払予定管理先分類名１０.<p>
	 *
	 */
	public String bsppl_grp_nm10() {
		return getConstString(offset + 109, $bsppl_grp_nm10);
	}

	/**
	 * Scheduled payee classification name 10 支払予定管理先分類名１０.<p>
	 *
	 */
	public void bsppl_grp_nm10(String value) {
		setConstString(offset + 109, $bsppl_grp_nm10, value);
	}


	/**
	 * AP supplier classification 1 search target 買掛先分類１検索対象.<p>
	 *
	 */
	public boolean asppl_grp_flg1() {
		return getConstBoolean(offset + 110, $asppl_grp_flg1);
	}

	/**
	 * AP supplier classification 1 search target 買掛先分類１検索対象.<p>
	 *
	 */
	public void asppl_grp_flg1(boolean value) {
		setConstBoolean(offset + 110, $asppl_grp_flg1, value);
	}


	/**
	 * AP supplier classification cd. 1 買掛先分類ＣＤ１.<p>
	 *
	 */
	public String asppl_grp_cd1() {
		return getConstString(offset + 111, $asppl_grp_cd1);
	}

	/**
	 * AP supplier classification cd. 1 買掛先分類ＣＤ１.<p>
	 *
	 */
	public void asppl_grp_cd1(String value) {
		setConstString(offset + 111, $asppl_grp_cd1, value);
	}


	/**
	 * AP supplier classification name 1 買掛先分類名１.<p>
	 *
	 */
	public String asppl_grp_nm1() {
		return getConstString(offset + 112, $asppl_grp_nm1);
	}

	/**
	 * AP supplier classification name 1 買掛先分類名１.<p>
	 *
	 */
	public void asppl_grp_nm1(String value) {
		setConstString(offset + 112, $asppl_grp_nm1, value);
	}


	/**
	 * AP supplier classification 2 search target 買掛先分類２検索対象.<p>
	 *
	 */
	public boolean asppl_grp_flg2() {
		return getConstBoolean(offset + 113, $asppl_grp_flg2);
	}

	/**
	 * AP supplier classification 2 search target 買掛先分類２検索対象.<p>
	 *
	 */
	public void asppl_grp_flg2(boolean value) {
		setConstBoolean(offset + 113, $asppl_grp_flg2, value);
	}


	/**
	 * AP supplier classification cd. 2 買掛先分類ＣＤ２.<p>
	 *
	 */
	public String asppl_grp_cd2() {
		return getConstString(offset + 114, $asppl_grp_cd2);
	}

	/**
	 * AP supplier classification cd. 2 買掛先分類ＣＤ２.<p>
	 *
	 */
	public void asppl_grp_cd2(String value) {
		setConstString(offset + 114, $asppl_grp_cd2, value);
	}


	/**
	 * AP supplier classification name 2 買掛先分類名２.<p>
	 *
	 */
	public String asppl_grp_nm2() {
		return getConstString(offset + 115, $asppl_grp_nm2);
	}

	/**
	 * AP supplier classification name 2 買掛先分類名２.<p>
	 *
	 */
	public void asppl_grp_nm2(String value) {
		setConstString(offset + 115, $asppl_grp_nm2, value);
	}


	/**
	 * AP supplier classification 3 search target 買掛先分類３検索対象.<p>
	 *
	 */
	public boolean asppl_grp_flg3() {
		return getConstBoolean(offset + 116, $asppl_grp_flg3);
	}

	/**
	 * AP supplier classification 3 search target 買掛先分類３検索対象.<p>
	 *
	 */
	public void asppl_grp_flg3(boolean value) {
		setConstBoolean(offset + 116, $asppl_grp_flg3, value);
	}


	/**
	 * AP supplier classification cd. 3 買掛先分類ＣＤ３.<p>
	 *
	 */
	public String asppl_grp_cd3() {
		return getConstString(offset + 117, $asppl_grp_cd3);
	}

	/**
	 * AP supplier classification cd. 3 買掛先分類ＣＤ３.<p>
	 *
	 */
	public void asppl_grp_cd3(String value) {
		setConstString(offset + 117, $asppl_grp_cd3, value);
	}


	/**
	 * AP supplier classification name 3 買掛先分類名３.<p>
	 *
	 */
	public String asppl_grp_nm3() {
		return getConstString(offset + 118, $asppl_grp_nm3);
	}

	/**
	 * AP supplier classification name 3 買掛先分類名３.<p>
	 *
	 */
	public void asppl_grp_nm3(String value) {
		setConstString(offset + 118, $asppl_grp_nm3, value);
	}


	/**
	 * AP supplier classification 4 search target 買掛先分類４検索対象.<p>
	 *
	 */
	public boolean asppl_grp_flg4() {
		return getConstBoolean(offset + 119, $asppl_grp_flg4);
	}

	/**
	 * AP supplier classification 4 search target 買掛先分類４検索対象.<p>
	 *
	 */
	public void asppl_grp_flg4(boolean value) {
		setConstBoolean(offset + 119, $asppl_grp_flg4, value);
	}


	/**
	 * AP supplier classification cd. 4 買掛先分類ＣＤ４.<p>
	 *
	 */
	public String asppl_grp_cd4() {
		return getConstString(offset + 120, $asppl_grp_cd4);
	}

	/**
	 * AP supplier classification cd. 4 買掛先分類ＣＤ４.<p>
	 *
	 */
	public void asppl_grp_cd4(String value) {
		setConstString(offset + 120, $asppl_grp_cd4, value);
	}


	/**
	 * AP supplier classification name 4 買掛先分類名４.<p>
	 *
	 */
	public String asppl_grp_nm4() {
		return getConstString(offset + 121, $asppl_grp_nm4);
	}

	/**
	 * AP supplier classification name 4 買掛先分類名４.<p>
	 *
	 */
	public void asppl_grp_nm4(String value) {
		setConstString(offset + 121, $asppl_grp_nm4, value);
	}


	/**
	 * AP supplier classification 5 search target 買掛先分類５検索対象.<p>
	 *
	 */
	public boolean asppl_grp_flg5() {
		return getConstBoolean(offset + 122, $asppl_grp_flg5);
	}

	/**
	 * AP supplier classification 5 search target 買掛先分類５検索対象.<p>
	 *
	 */
	public void asppl_grp_flg5(boolean value) {
		setConstBoolean(offset + 122, $asppl_grp_flg5, value);
	}


	/**
	 * AP supplier classification cd. 5 買掛先分類ＣＤ５.<p>
	 *
	 */
	public String asppl_grp_cd5() {
		return getConstString(offset + 123, $asppl_grp_cd5);
	}

	/**
	 * AP supplier classification cd. 5 買掛先分類ＣＤ５.<p>
	 *
	 */
	public void asppl_grp_cd5(String value) {
		setConstString(offset + 123, $asppl_grp_cd5, value);
	}


	/**
	 * AP supplier classification name 5 買掛先分類名５.<p>
	 *
	 */
	public String asppl_grp_nm5() {
		return getConstString(offset + 124, $asppl_grp_nm5);
	}

	/**
	 * AP supplier classification name 5 買掛先分類名５.<p>
	 *
	 */
	public void asppl_grp_nm5(String value) {
		setConstString(offset + 124, $asppl_grp_nm5, value);
	}


	/**
	 * AP supplier classification 6 search target 買掛先分類６検索対象.<p>
	 *
	 */
	public boolean asppl_grp_flg6() {
		return getConstBoolean(offset + 125, $asppl_grp_flg6);
	}

	/**
	 * AP supplier classification 6 search target 買掛先分類６検索対象.<p>
	 *
	 */
	public void asppl_grp_flg6(boolean value) {
		setConstBoolean(offset + 125, $asppl_grp_flg6, value);
	}


	/**
	 * AP supplier classification cd. 6 買掛先分類ＣＤ６.<p>
	 *
	 */
	public String asppl_grp_cd6() {
		return getConstString(offset + 126, $asppl_grp_cd6);
	}

	/**
	 * AP supplier classification cd. 6 買掛先分類ＣＤ６.<p>
	 *
	 */
	public void asppl_grp_cd6(String value) {
		setConstString(offset + 126, $asppl_grp_cd6, value);
	}


	/**
	 * AP supplier classification name 6 買掛先分類名６.<p>
	 *
	 */
	public String asppl_grp_nm6() {
		return getConstString(offset + 127, $asppl_grp_nm6);
	}

	/**
	 * AP supplier classification name 6 買掛先分類名６.<p>
	 *
	 */
	public void asppl_grp_nm6(String value) {
		setConstString(offset + 127, $asppl_grp_nm6, value);
	}


	/**
	 * AP supplier classification 7 search target 買掛先分類７検索対象.<p>
	 *
	 */
	public boolean asppl_grp_flg7() {
		return getConstBoolean(offset + 128, $asppl_grp_flg7);
	}

	/**
	 * AP supplier classification 7 search target 買掛先分類７検索対象.<p>
	 *
	 */
	public void asppl_grp_flg7(boolean value) {
		setConstBoolean(offset + 128, $asppl_grp_flg7, value);
	}


	/**
	 * AP supplier classification cd. 7 買掛先分類ＣＤ７.<p>
	 *
	 */
	public String asppl_grp_cd7() {
		return getConstString(offset + 129, $asppl_grp_cd7);
	}

	/**
	 * AP supplier classification cd. 7 買掛先分類ＣＤ７.<p>
	 *
	 */
	public void asppl_grp_cd7(String value) {
		setConstString(offset + 129, $asppl_grp_cd7, value);
	}


	/**
	 * AP supplier classification name 7 買掛先分類名７.<p>
	 *
	 */
	public String asppl_grp_nm7() {
		return getConstString(offset + 130, $asppl_grp_nm7);
	}

	/**
	 * AP supplier classification name 7 買掛先分類名７.<p>
	 *
	 */
	public void asppl_grp_nm7(String value) {
		setConstString(offset + 130, $asppl_grp_nm7, value);
	}


	/**
	 * AP supplier classification 8 search target 買掛先分類８検索対象.<p>
	 *
	 */
	public boolean asppl_grp_flg8() {
		return getConstBoolean(offset + 131, $asppl_grp_flg8);
	}

	/**
	 * AP supplier classification 8 search target 買掛先分類８検索対象.<p>
	 *
	 */
	public void asppl_grp_flg8(boolean value) {
		setConstBoolean(offset + 131, $asppl_grp_flg8, value);
	}


	/**
	 * AP supplier classification cd. 8 買掛先分類ＣＤ８.<p>
	 *
	 */
	public String asppl_grp_cd8() {
		return getConstString(offset + 132, $asppl_grp_cd8);
	}

	/**
	 * AP supplier classification cd. 8 買掛先分類ＣＤ８.<p>
	 *
	 */
	public void asppl_grp_cd8(String value) {
		setConstString(offset + 132, $asppl_grp_cd8, value);
	}


	/**
	 * AP supplier classification name 8 買掛先分類名８.<p>
	 *
	 */
	public String asppl_grp_nm8() {
		return getConstString(offset + 133, $asppl_grp_nm8);
	}

	/**
	 * AP supplier classification name 8 買掛先分類名８.<p>
	 *
	 */
	public void asppl_grp_nm8(String value) {
		setConstString(offset + 133, $asppl_grp_nm8, value);
	}


	/**
	 * AP supplier classification 9 search target 買掛先分類９検索対象.<p>
	 *
	 */
	public boolean asppl_grp_flg9() {
		return getConstBoolean(offset + 134, $asppl_grp_flg9);
	}

	/**
	 * AP supplier classification 9 search target 買掛先分類９検索対象.<p>
	 *
	 */
	public void asppl_grp_flg9(boolean value) {
		setConstBoolean(offset + 134, $asppl_grp_flg9, value);
	}


	/**
	 * AP supplier classification cd. 9 買掛先分類ＣＤ９.<p>
	 *
	 */
	public String asppl_grp_cd9() {
		return getConstString(offset + 135, $asppl_grp_cd9);
	}

	/**
	 * AP supplier classification cd. 9 買掛先分類ＣＤ９.<p>
	 *
	 */
	public void asppl_grp_cd9(String value) {
		setConstString(offset + 135, $asppl_grp_cd9, value);
	}


	/**
	 * AP supplier classification name 9 買掛先分類名９.<p>
	 *
	 */
	public String asppl_grp_nm9() {
		return getConstString(offset + 136, $asppl_grp_nm9);
	}

	/**
	 * AP supplier classification name 9 買掛先分類名９.<p>
	 *
	 */
	public void asppl_grp_nm9(String value) {
		setConstString(offset + 136, $asppl_grp_nm9, value);
	}


	/**
	 * AP supplier classification 10 search target 買掛先分類１０検索対象.<p>
	 *
	 */
	public boolean asppl_grp_flg10() {
		return getConstBoolean(offset + 137, $asppl_grp_flg10);
	}

	/**
	 * AP supplier classification 10 search target 買掛先分類１０検索対象.<p>
	 *
	 */
	public void asppl_grp_flg10(boolean value) {
		setConstBoolean(offset + 137, $asppl_grp_flg10, value);
	}


	/**
	 * AP supplier classification cd. 10 買掛先分類ＣＤ１０.<p>
	 *
	 */
	public String asppl_grp_cd10() {
		return getConstString(offset + 138, $asppl_grp_cd10);
	}

	/**
	 * AP supplier classification cd. 10 買掛先分類ＣＤ１０.<p>
	 *
	 */
	public void asppl_grp_cd10(String value) {
		setConstString(offset + 138, $asppl_grp_cd10, value);
	}


	/**
	 * AP supplier classification name 10 買掛先分類名１０.<p>
	 *
	 */
	public String asppl_grp_nm10() {
		return getConstString(offset + 139, $asppl_grp_nm10);
	}

	/**
	 * AP supplier classification name 10 買掛先分類名１０.<p>
	 *
	 */
	public void asppl_grp_nm10(String value) {
		setConstString(offset + 139, $asppl_grp_nm10, value);
	}


	/**
	 * Operation date 運用日付.<p>
	 *
	 */
	public MCDate today() {
		return getConstDate(offset + 140, $today);
	}

	/**
	 * Operation date 運用日付.<p>
	 *
	 */
	public void today(MCDate value) {
		setConstDate(offset + 140, $today, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 141, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 141, $xrate_cd, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 142, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 142, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 143, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 143, $base_cur_nm, value);
	}


	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_amt_dec_place() {
		return getConstNumber(offset + 144, $base_cur_amt_dec_place);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 144, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(int value) {
		setConstNumber(offset + 144, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(long value) {
		setConstNumber(offset + 144, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(float value) {
		setConstNumber(offset + 144, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(double value) {
		setConstNumber(offset + 144, $base_cur_amt_dec_place, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($mode.equalsIgnoreCase(name)) {
			return mode();
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
		if ($pay_usr_cd.equalsIgnoreCase(name)) {
			return pay_usr_cd();
		}
		if ($pay_usr_nm.equalsIgnoreCase(name)) {
			return pay_usr_nm();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			return pay_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bsppl_usr_cd.equalsIgnoreCase(name)) {
			return bsppl_usr_cd();
		}
		if ($bsppl_usr_nm.equalsIgnoreCase(name)) {
			return bsppl_usr_nm();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			return ap_sttl_nm();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			return pay_schd_no();
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
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
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			return dtl_sub_char1();
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			return dtl_sub_char2();
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			return dtl_sub_char3();
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
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($pay_schd_dt_fr.equalsIgnoreCase(name)) {
			return pay_schd_dt_fr();
		}
		if ($pay_schd_dt_to.equalsIgnoreCase(name)) {
			return pay_schd_dt_to();
		}
		if ($pay_act_dt_fr.equalsIgnoreCase(name)) {
			return pay_act_dt_fr();
		}
		if ($pay_act_dt_to.equalsIgnoreCase(name)) {
			return pay_act_dt_to();
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			return ac_dt_fr();
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			return ac_dt_to();
		}
		if ($bsppl_cl_dt_fr.equalsIgnoreCase(name)) {
			return bsppl_cl_dt_fr();
		}
		if ($bsppl_cl_dt_to.equalsIgnoreCase(name)) {
			return bsppl_cl_dt_to();
		}
		if ($today.equalsIgnoreCase(name)) {
			return today();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			return inc_can_flg();
		}
		if ($inc_schd_act_flg.equalsIgnoreCase(name)) {
			return inc_schd_act_flg();
		}
		if ($inc_sw_flg.equalsIgnoreCase(name)) {
			return inc_sw_flg();
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
		if ($asppl_grp_flg1.equalsIgnoreCase(name)) {
			return asppl_grp_flg1();
		}
		if ($asppl_grp_flg2.equalsIgnoreCase(name)) {
			return asppl_grp_flg2();
		}
		if ($asppl_grp_flg3.equalsIgnoreCase(name)) {
			return asppl_grp_flg3();
		}
		if ($asppl_grp_flg4.equalsIgnoreCase(name)) {
			return asppl_grp_flg4();
		}
		if ($asppl_grp_flg5.equalsIgnoreCase(name)) {
			return asppl_grp_flg5();
		}
		if ($asppl_grp_flg6.equalsIgnoreCase(name)) {
			return asppl_grp_flg6();
		}
		if ($asppl_grp_flg7.equalsIgnoreCase(name)) {
			return asppl_grp_flg7();
		}
		if ($asppl_grp_flg8.equalsIgnoreCase(name)) {
			return asppl_grp_flg8();
		}
		if ($asppl_grp_flg9.equalsIgnoreCase(name)) {
			return asppl_grp_flg9();
		}
		if ($asppl_grp_flg10.equalsIgnoreCase(name)) {
			return asppl_grp_flg10();
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
		if ($pay_usr_cd.equalsIgnoreCase(name)) {
			return pay_usr_cd();
		}
		if ($pay_usr_nm.equalsIgnoreCase(name)) {
			return pay_usr_nm();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			return pay_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bsppl_usr_cd.equalsIgnoreCase(name)) {
			return bsppl_usr_cd();
		}
		if ($bsppl_usr_nm.equalsIgnoreCase(name)) {
			return bsppl_usr_nm();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			return ap_sttl_nm();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			return pay_schd_no();
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
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
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			return dtl_sub_char1();
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			return dtl_sub_char2();
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			return dtl_sub_char3();
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
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($pay_schd_dt_fr.equalsIgnoreCase(name)) {
			return pay_schd_dt_fr();
		}
		if ($pay_schd_dt_to.equalsIgnoreCase(name)) {
			return pay_schd_dt_to();
		}
		if ($pay_act_dt_fr.equalsIgnoreCase(name)) {
			return pay_act_dt_fr();
		}
		if ($pay_act_dt_to.equalsIgnoreCase(name)) {
			return pay_act_dt_to();
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			return ac_dt_fr();
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			return ac_dt_to();
		}
		if ($bsppl_cl_dt_fr.equalsIgnoreCase(name)) {
			return bsppl_cl_dt_fr();
		}
		if ($bsppl_cl_dt_to.equalsIgnoreCase(name)) {
			return bsppl_cl_dt_to();
		}
		if ($today.equalsIgnoreCase(name)) {
			return today();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			return inc_can_flg();
		}
		if ($inc_schd_act_flg.equalsIgnoreCase(name)) {
			return inc_schd_act_flg();
		}
		if ($inc_sw_flg.equalsIgnoreCase(name)) {
			return inc_sw_flg();
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
		if ($asppl_grp_flg1.equalsIgnoreCase(name)) {
			return asppl_grp_flg1();
		}
		if ($asppl_grp_flg2.equalsIgnoreCase(name)) {
			return asppl_grp_flg2();
		}
		if ($asppl_grp_flg3.equalsIgnoreCase(name)) {
			return asppl_grp_flg3();
		}
		if ($asppl_grp_flg4.equalsIgnoreCase(name)) {
			return asppl_grp_flg4();
		}
		if ($asppl_grp_flg5.equalsIgnoreCase(name)) {
			return asppl_grp_flg5();
		}
		if ($asppl_grp_flg6.equalsIgnoreCase(name)) {
			return asppl_grp_flg6();
		}
		if ($asppl_grp_flg7.equalsIgnoreCase(name)) {
			return asppl_grp_flg7();
		}
		if ($asppl_grp_flg8.equalsIgnoreCase(name)) {
			return asppl_grp_flg8();
		}
		if ($asppl_grp_flg9.equalsIgnoreCase(name)) {
			return asppl_grp_flg9();
		}
		if ($asppl_grp_flg10.equalsIgnoreCase(name)) {
			return asppl_grp_flg10();
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
		if ($pay_usr_cd.equalsIgnoreCase(name)) {
			pay_usr_cd(value);
			return;
		}
		if ($pay_usr_nm.equalsIgnoreCase(name)) {
			pay_usr_nm(value);
			return;
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			pay_dpt_cd(value);
			return;
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			pay_dpt_nm(value);
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
		if ($bsppl_usr_cd.equalsIgnoreCase(name)) {
			bsppl_usr_cd(value);
			return;
		}
		if ($bsppl_usr_nm.equalsIgnoreCase(name)) {
			bsppl_usr_nm(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			ap_sttl_cd(value);
			return;
		}
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			ap_sttl_nm(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			pay_schd_no(value);
			return;
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
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
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			dtl_sub_char1(value);
			return;
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			dtl_sub_char2(value);
			return;
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			dtl_sub_char3(value);
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
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($pay_schd_dt_fr.equalsIgnoreCase(name)) {
			pay_schd_dt_fr(value);
			return;
		}
		if ($pay_schd_dt_to.equalsIgnoreCase(name)) {
			pay_schd_dt_to(value);
			return;
		}
		if ($pay_act_dt_fr.equalsIgnoreCase(name)) {
			pay_act_dt_fr(value);
			return;
		}
		if ($pay_act_dt_to.equalsIgnoreCase(name)) {
			pay_act_dt_to(value);
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
		if ($bsppl_cl_dt_fr.equalsIgnoreCase(name)) {
			bsppl_cl_dt_fr(value);
			return;
		}
		if ($bsppl_cl_dt_to.equalsIgnoreCase(name)) {
			bsppl_cl_dt_to(value);
			return;
		}
		if ($today.equalsIgnoreCase(name)) {
			today(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			inc_can_flg(value);
			return;
		}
		if ($inc_schd_act_flg.equalsIgnoreCase(name)) {
			inc_schd_act_flg(value);
			return;
		}
		if ($inc_sw_flg.equalsIgnoreCase(name)) {
			inc_sw_flg(value);
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
		if ($asppl_grp_flg1.equalsIgnoreCase(name)) {
			asppl_grp_flg1(value);
			return;
		}
		if ($asppl_grp_flg2.equalsIgnoreCase(name)) {
			asppl_grp_flg2(value);
			return;
		}
		if ($asppl_grp_flg3.equalsIgnoreCase(name)) {
			asppl_grp_flg3(value);
			return;
		}
		if ($asppl_grp_flg4.equalsIgnoreCase(name)) {
			asppl_grp_flg4(value);
			return;
		}
		if ($asppl_grp_flg5.equalsIgnoreCase(name)) {
			asppl_grp_flg5(value);
			return;
		}
		if ($asppl_grp_flg6.equalsIgnoreCase(name)) {
			asppl_grp_flg6(value);
			return;
		}
		if ($asppl_grp_flg7.equalsIgnoreCase(name)) {
			asppl_grp_flg7(value);
			return;
		}
		if ($asppl_grp_flg8.equalsIgnoreCase(name)) {
			asppl_grp_flg8(value);
			return;
		}
		if ($asppl_grp_flg9.equalsIgnoreCase(name)) {
			asppl_grp_flg9(value);
			return;
		}
		if ($asppl_grp_flg10.equalsIgnoreCase(name)) {
			asppl_grp_flg10(value);
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
		if ($pay_usr_cd.equalsIgnoreCase(name)) {
			pay_usr_cd(value);
			return;
		}
		if ($pay_usr_nm.equalsIgnoreCase(name)) {
			pay_usr_nm(value);
			return;
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			pay_dpt_cd(value);
			return;
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			pay_dpt_nm(value);
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
		if ($bsppl_usr_cd.equalsIgnoreCase(name)) {
			bsppl_usr_cd(value);
			return;
		}
		if ($bsppl_usr_nm.equalsIgnoreCase(name)) {
			bsppl_usr_nm(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			ap_sttl_cd(value);
			return;
		}
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			ap_sttl_nm(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			pay_schd_no(value);
			return;
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
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
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			dtl_sub_char1(value);
			return;
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			dtl_sub_char2(value);
			return;
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			dtl_sub_char3(value);
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
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($pay_schd_dt_fr.equalsIgnoreCase(name)) {
			pay_schd_dt_fr(value);
			return;
		}
		if ($pay_schd_dt_to.equalsIgnoreCase(name)) {
			pay_schd_dt_to(value);
			return;
		}
		if ($pay_act_dt_fr.equalsIgnoreCase(name)) {
			pay_act_dt_fr(value);
			return;
		}
		if ($pay_act_dt_to.equalsIgnoreCase(name)) {
			pay_act_dt_to(value);
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
		if ($bsppl_cl_dt_fr.equalsIgnoreCase(name)) {
			bsppl_cl_dt_fr(value);
			return;
		}
		if ($bsppl_cl_dt_to.equalsIgnoreCase(name)) {
			bsppl_cl_dt_to(value);
			return;
		}
		if ($today.equalsIgnoreCase(name)) {
			today(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			inc_can_flg(value);
			return;
		}
		if ($inc_schd_act_flg.equalsIgnoreCase(name)) {
			inc_schd_act_flg(value);
			return;
		}
		if ($inc_sw_flg.equalsIgnoreCase(name)) {
			inc_sw_flg(value);
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
		if ($asppl_grp_flg1.equalsIgnoreCase(name)) {
			asppl_grp_flg1(value);
			return;
		}
		if ($asppl_grp_flg2.equalsIgnoreCase(name)) {
			asppl_grp_flg2(value);
			return;
		}
		if ($asppl_grp_flg3.equalsIgnoreCase(name)) {
			asppl_grp_flg3(value);
			return;
		}
		if ($asppl_grp_flg4.equalsIgnoreCase(name)) {
			asppl_grp_flg4(value);
			return;
		}
		if ($asppl_grp_flg5.equalsIgnoreCase(name)) {
			asppl_grp_flg5(value);
			return;
		}
		if ($asppl_grp_flg6.equalsIgnoreCase(name)) {
			asppl_grp_flg6(value);
			return;
		}
		if ($asppl_grp_flg7.equalsIgnoreCase(name)) {
			asppl_grp_flg7(value);
			return;
		}
		if ($asppl_grp_flg8.equalsIgnoreCase(name)) {
			asppl_grp_flg8(value);
			return;
		}
		if ($asppl_grp_flg9.equalsIgnoreCase(name)) {
			asppl_grp_flg9(value);
			return;
		}
		if ($asppl_grp_flg10.equalsIgnoreCase(name)) {
			asppl_grp_flg10(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

