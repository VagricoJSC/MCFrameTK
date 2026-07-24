package mcframe.serverMSBH.MSBHL0010;

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
	 * Uncollated 未照合.<p>
	 *
	 */
	public static final String $unchk_flg = "unchk_flg";
	/**
	 * Collated 照合済.<p>
	 *
	 */
	public static final String $chk_flg = "chk_flg";
	/**
	 * Unit price 本単価.<p>
	 *
	 */
	public static final String $upri_flg = "upri_flg";
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 * Carry-over 繰越分.<p>
	 *
	 */
	public static final String $crryovr_flg = "crryovr_flg";
	/**
	 * Except for carry-over 繰越分以外.<p>
	 *
	 */
	public static final String $not_crryovr_flg = "not_crryovr_flg";
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public static final String $pay_spot_flg = "pay_spot_flg";
	/**
	 * Other than payment per transaction 都度支払以外.<p>
	 *
	 */
	public static final String $not_pay_spot_flg = "not_pay_spot_flg";
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
	/**
	 * Not for subcontract 下請対象外.<p>
	 *
	 */
	public static final String $not_subcon_flg = "not_subcon_flg";
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
	 * Actual date FROM 実績日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $act_dt_fr = "act_dt_fr";
	/**
	 * Actual date TO 実績日ＴＯ.<p>
	 *
	 */
	public static final String $act_dt_to = "act_dt_to";
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
	 * Elapsed days (equal or more) 経過日数（以上）.<p>
	 *
	 */
	public static final String $pass_days = "pass_days";
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
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
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
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_d_no = "purc_act_d_no";
	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public static final String $bp_dlv_slip_no = "bp_dlv_slip_no";
	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $bp_dlv_slip_d_no = "bp_dlv_slip_d_no";
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
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public static final String $ap_d_no = "ap_d_no";
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public static final String $pay_chk_no = "pay_chk_no";
	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public static final String $pay_sts_typ = "pay_sts_typ";
	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public static final String $pay_mtd_typ = "pay_mtd_typ";
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
	 * Include temporary AP 暫定買掛含む.<p>
	 *
	 */
	public static final String $accrued_flg = "accrued_flg";
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
	 * Supplier classification 1 search target 発注先分類１検索対象.<p>
	 *
	 */
	public static final String $sppl_grp_flg1 = "sppl_grp_flg1";
	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public static final String $sppl_grp_cd1 = "sppl_grp_cd1";
	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public static final String $sppl_grp_nm1 = "sppl_grp_nm1";
	/**
	 * Supplier classification 2 search target 発注先分類２検索対象.<p>
	 *
	 */
	public static final String $sppl_grp_flg2 = "sppl_grp_flg2";
	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public static final String $sppl_grp_cd2 = "sppl_grp_cd2";
	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public static final String $sppl_grp_nm2 = "sppl_grp_nm2";
	/**
	 * Supplier classification 3 search target 発注先分類３検索対象.<p>
	 *
	 */
	public static final String $sppl_grp_flg3 = "sppl_grp_flg3";
	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public static final String $sppl_grp_cd3 = "sppl_grp_cd3";
	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public static final String $sppl_grp_nm3 = "sppl_grp_nm3";
	/**
	 * Supplier classification 4 search target 発注先分類４検索対象.<p>
	 *
	 */
	public static final String $sppl_grp_flg4 = "sppl_grp_flg4";
	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public static final String $sppl_grp_cd4 = "sppl_grp_cd4";
	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public static final String $sppl_grp_nm4 = "sppl_grp_nm4";
	/**
	 * Supplier classification 5 search target 発注先分類５検索対象.<p>
	 *
	 */
	public static final String $sppl_grp_flg5 = "sppl_grp_flg5";
	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public static final String $sppl_grp_cd5 = "sppl_grp_cd5";
	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public static final String $sppl_grp_nm5 = "sppl_grp_nm5";
	/**
	 * Supplier classification 6 search target 発注先分類６検索対象.<p>
	 *
	 */
	public static final String $sppl_grp_flg6 = "sppl_grp_flg6";
	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public static final String $sppl_grp_cd6 = "sppl_grp_cd6";
	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public static final String $sppl_grp_nm6 = "sppl_grp_nm6";
	/**
	 * Supplier classification 7 search target 発注先分類７検索対象.<p>
	 *
	 */
	public static final String $sppl_grp_flg7 = "sppl_grp_flg7";
	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public static final String $sppl_grp_cd7 = "sppl_grp_cd7";
	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public static final String $sppl_grp_nm7 = "sppl_grp_nm7";
	/**
	 * Supplier classification 8 search target 発注先分類８検索対象.<p>
	 *
	 */
	public static final String $sppl_grp_flg8 = "sppl_grp_flg8";
	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public static final String $sppl_grp_cd8 = "sppl_grp_cd8";
	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public static final String $sppl_grp_nm8 = "sppl_grp_nm8";
	/**
	 * Supplier classification 9 search target 発注先分類９検索対象.<p>
	 *
	 */
	public static final String $sppl_grp_flg9 = "sppl_grp_flg9";
	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public static final String $sppl_grp_cd9 = "sppl_grp_cd9";
	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public static final String $sppl_grp_nm9 = "sppl_grp_nm9";
	/**
	 * Supplier classification 10 search target 発注先分類１０検索対象.<p>
	 *
	 */
	public static final String $sppl_grp_flg10 = "sppl_grp_flg10";
	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $sppl_grp_cd10 = "sppl_grp_cd10";
	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public static final String $sppl_grp_nm10 = "sppl_grp_nm10";
	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public static final String $itm_grp_flg1 = "itm_grp_flg1";
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $itm_grp_cd1 = "itm_grp_cd1";
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public static final String $itm_grp_nm1 = "itm_grp_nm1";
	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public static final String $itm_grp_flg2 = "itm_grp_flg2";
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $itm_grp_cd2 = "itm_grp_cd2";
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public static final String $itm_grp_nm2 = "itm_grp_nm2";
	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public static final String $itm_grp_flg3 = "itm_grp_flg3";
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $itm_grp_cd3 = "itm_grp_cd3";
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public static final String $itm_grp_nm3 = "itm_grp_nm3";
	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public static final String $itm_grp_flg4 = "itm_grp_flg4";
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $itm_grp_cd4 = "itm_grp_cd4";
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public static final String $itm_grp_nm4 = "itm_grp_nm4";
	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public static final String $itm_grp_flg5 = "itm_grp_flg5";
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $itm_grp_cd5 = "itm_grp_cd5";
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public static final String $itm_grp_nm5 = "itm_grp_nm5";
	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public static final String $itm_grp_flg6 = "itm_grp_flg6";
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $itm_grp_cd6 = "itm_grp_cd6";
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public static final String $itm_grp_nm6 = "itm_grp_nm6";
	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public static final String $itm_grp_flg7 = "itm_grp_flg7";
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $itm_grp_cd7 = "itm_grp_cd7";
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public static final String $itm_grp_nm7 = "itm_grp_nm7";
	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public static final String $itm_grp_flg8 = "itm_grp_flg8";
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $itm_grp_cd8 = "itm_grp_cd8";
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public static final String $itm_grp_nm8 = "itm_grp_nm8";
	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public static final String $itm_grp_flg9 = "itm_grp_flg9";
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $itm_grp_cd9 = "itm_grp_cd9";
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public static final String $itm_grp_nm9 = "itm_grp_nm9";
	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public static final String $itm_grp_flg10 = "itm_grp_flg10";
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public static final String $itm_grp_nm10 = "itm_grp_nm10";


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta unchk_flg_META = createCommonMeta($unchk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chk_flg_META = createCommonMeta($chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upri_flg_META = createCommonMeta($upri_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta crryovr_flg_META = createCommonMeta($crryovr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_crryovr_flg_META = createCommonMeta($not_crryovr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_spot_flg_META = createCommonMeta($pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_pay_spot_flg_META = createCommonMeta($not_pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_subcon_flg_META = createCommonMeta($not_subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_schd_dt_fr_META = createCommonMeta($pay_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_dt_to_META = createCommonMeta($pay_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bsppl_cl_dt_fr_META = createCommonMeta($bsppl_cl_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bsppl_cl_dt_to_META = createCommonMeta($bsppl_cl_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta act_dt_fr_META = createCommonMeta($act_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta act_dt_to_META = createCommonMeta($act_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_fr_META = createCommonMeta($ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_to_META = createCommonMeta($ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pass_days_META = createCommonMeta($pass_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_nm_META = createCommonMeta($bsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_nm_META = createCommonMeta($asppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bsppl_dpt_nm_META = createCommonMeta($bsppl_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta bp_dlv_slip_no_META = createCommonMeta($bp_dlv_slip_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_NO);
	public static final MCMeta bp_dlv_slip_d_no_META = createCommonMeta($bp_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_D_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta ap_d_no_META = createCommonMeta($ap_d_no, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta pay_chk_no_META = createCommonMeta($pay_chk_no, mcframe.commonMA.meta.MA_META.PAY_CHK_NO);
	public static final MCMeta pay_sts_typ_META = createCommonMeta($pay_sts_typ, mcframe.commonMS.meta.MS_META.PAY_STS_TYP);
	public static final MCMeta pay_mtd_typ_META = createCommonMeta($pay_mtd_typ, mcframe.commonMS.meta.MS_META.PAY_MTD_TYP);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta pay_schd_d_print_rmrks_META = createCommonMeta($pay_schd_d_print_rmrks, mcframe.commonMS.meta.MS_META.PAY_SCHD_D_PRINT_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.AP_D_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.AP_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.AP_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.AP_D_SUB_CHAR3);
	public static final MCMeta accrued_flg_META = createCommonMeta($accrued_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta sppl_grp_flg1_META = createCommonMeta($sppl_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd1_META = createCommonMeta($sppl_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm1_META = createCommonMeta($sppl_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg2_META = createCommonMeta($sppl_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd2_META = createCommonMeta($sppl_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm2_META = createCommonMeta($sppl_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg3_META = createCommonMeta($sppl_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd3_META = createCommonMeta($sppl_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm3_META = createCommonMeta($sppl_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg4_META = createCommonMeta($sppl_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd4_META = createCommonMeta($sppl_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm4_META = createCommonMeta($sppl_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg5_META = createCommonMeta($sppl_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd5_META = createCommonMeta($sppl_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm5_META = createCommonMeta($sppl_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg6_META = createCommonMeta($sppl_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd6_META = createCommonMeta($sppl_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm6_META = createCommonMeta($sppl_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg7_META = createCommonMeta($sppl_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd7_META = createCommonMeta($sppl_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm7_META = createCommonMeta($sppl_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg8_META = createCommonMeta($sppl_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd8_META = createCommonMeta($sppl_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm8_META = createCommonMeta($sppl_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg9_META = createCommonMeta($sppl_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd9_META = createCommonMeta($sppl_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm9_META = createCommonMeta($sppl_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg10_META = createCommonMeta($sppl_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd10_META = createCommonMeta($sppl_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm10_META = createCommonMeta($sppl_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta itm_grp_flg1_META = createCommonMeta($itm_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg2_META = createCommonMeta($itm_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg3_META = createCommonMeta($itm_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg4_META = createCommonMeta($itm_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg5_META = createCommonMeta($itm_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg6_META = createCommonMeta($itm_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg7_META = createCommonMeta($itm_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg8_META = createCommonMeta($itm_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg9_META = createCommonMeta($itm_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg10_META = createCommonMeta($itm_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			unchk_flg_META,
			chk_flg_META,
			upri_flg_META,
			interim_flg_META,
			crryovr_flg_META,
			not_crryovr_flg_META,
			pay_spot_flg_META,
			not_pay_spot_flg_META,
			subcon_flg_META,
			not_subcon_flg_META,
			pay_schd_dt_fr_META,
			pay_schd_dt_to_META,
			bsppl_cl_dt_fr_META,
			bsppl_cl_dt_to_META,
			act_dt_fr_META,
			act_dt_to_META,
			ac_dt_fr_META,
			ac_dt_to_META,
			pass_days_META,
			bsppl_cd_META,
			bsppl_nm_META,
			asppl_cd_META,
			asppl_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			itm_typ_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			bsppl_dpt_cd_META,
			bsppl_dpt_nm_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			trd_cd_META,
			trd_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			po_no_META,
			po_d_no_META,
			purc_act_no_META,
			purc_act_d_no_META,
			bp_dlv_slip_no_META,
			bp_dlv_slip_d_no_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			ap_d_no_META,
			pay_chk_no_META,
			pay_sts_typ_META,
			pay_mtd_typ_META,
			wrk_no_META,
			wrk_nm_META,
			pay_schd_d_print_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			accrued_flg_META,
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
			sppl_grp_flg1_META,
			sppl_grp_cd1_META,
			sppl_grp_nm1_META,
			sppl_grp_flg2_META,
			sppl_grp_cd2_META,
			sppl_grp_nm2_META,
			sppl_grp_flg3_META,
			sppl_grp_cd3_META,
			sppl_grp_nm3_META,
			sppl_grp_flg4_META,
			sppl_grp_cd4_META,
			sppl_grp_nm4_META,
			sppl_grp_flg5_META,
			sppl_grp_cd5_META,
			sppl_grp_nm5_META,
			sppl_grp_flg6_META,
			sppl_grp_cd6_META,
			sppl_grp_nm6_META,
			sppl_grp_flg7_META,
			sppl_grp_cd7_META,
			sppl_grp_nm7_META,
			sppl_grp_flg8_META,
			sppl_grp_cd8_META,
			sppl_grp_nm8_META,
			sppl_grp_flg9_META,
			sppl_grp_cd9_META,
			sppl_grp_nm9_META,
			sppl_grp_flg10_META,
			sppl_grp_cd10_META,
			sppl_grp_nm10_META,
			itm_grp_flg1_META,
			itm_grp_cd1_META,
			itm_grp_nm1_META,
			itm_grp_flg2_META,
			itm_grp_cd2_META,
			itm_grp_nm2_META,
			itm_grp_flg3_META,
			itm_grp_cd3_META,
			itm_grp_nm3_META,
			itm_grp_flg4_META,
			itm_grp_cd4_META,
			itm_grp_nm4_META,
			itm_grp_flg5_META,
			itm_grp_cd5_META,
			itm_grp_nm5_META,
			itm_grp_flg6_META,
			itm_grp_cd6_META,
			itm_grp_nm6_META,
			itm_grp_flg7_META,
			itm_grp_cd7_META,
			itm_grp_nm7_META,
			itm_grp_flg8_META,
			itm_grp_cd8_META,
			itm_grp_nm8_META,
			itm_grp_flg9_META,
			itm_grp_cd9_META,
			itm_grp_nm9_META,
			itm_grp_flg10_META,
			itm_grp_cd10_META,
			itm_grp_nm10_META
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
	 * Uncollated 未照合.<p>
	 *
	 */
	public boolean unchk_flg() {
		return getConstBoolean(offset + 1, $unchk_flg);
	}

	/**
	 * Uncollated 未照合.<p>
	 *
	 */
	public void unchk_flg(boolean value) {
		setConstBoolean(offset + 1, $unchk_flg, value);
	}


	/**
	 * Collated 照合済.<p>
	 *
	 */
	public boolean chk_flg() {
		return getConstBoolean(offset + 2, $chk_flg);
	}

	/**
	 * Collated 照合済.<p>
	 *
	 */
	public void chk_flg(boolean value) {
		setConstBoolean(offset + 2, $chk_flg, value);
	}


	/**
	 * Unit price 本単価.<p>
	 *
	 */
	public boolean upri_flg() {
		return getConstBoolean(offset + 3, $upri_flg);
	}

	/**
	 * Unit price 本単価.<p>
	 *
	 */
	public void upri_flg(boolean value) {
		setConstBoolean(offset + 3, $upri_flg, value);
	}


	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 4, $interim_flg);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 4, $interim_flg, value);
	}


	/**
	 * Carry-over 繰越分.<p>
	 *
	 */
	public boolean crryovr_flg() {
		return getConstBoolean(offset + 5, $crryovr_flg);
	}

	/**
	 * Carry-over 繰越分.<p>
	 *
	 */
	public void crryovr_flg(boolean value) {
		setConstBoolean(offset + 5, $crryovr_flg, value);
	}


	/**
	 * Except for carry-over 繰越分以外.<p>
	 *
	 */
	public boolean not_crryovr_flg() {
		return getConstBoolean(offset + 6, $not_crryovr_flg);
	}

	/**
	 * Except for carry-over 繰越分以外.<p>
	 *
	 */
	public void not_crryovr_flg(boolean value) {
		setConstBoolean(offset + 6, $not_crryovr_flg, value);
	}


	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public boolean pay_spot_flg() {
		return getConstBoolean(offset + 7, $pay_spot_flg);
	}

	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public void pay_spot_flg(boolean value) {
		setConstBoolean(offset + 7, $pay_spot_flg, value);
	}


	/**
	 * Other than payment per transaction 都度支払以外.<p>
	 *
	 */
	public boolean not_pay_spot_flg() {
		return getConstBoolean(offset + 8, $not_pay_spot_flg);
	}

	/**
	 * Other than payment per transaction 都度支払以外.<p>
	 *
	 */
	public void not_pay_spot_flg(boolean value) {
		setConstBoolean(offset + 8, $not_pay_spot_flg, value);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 9, $subcon_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 9, $subcon_flg, value);
	}


	/**
	 * Not for subcontract 下請対象外.<p>
	 *
	 */
	public boolean not_subcon_flg() {
		return getConstBoolean(offset + 10, $not_subcon_flg);
	}

	/**
	 * Not for subcontract 下請対象外.<p>
	 *
	 */
	public void not_subcon_flg(boolean value) {
		setConstBoolean(offset + 10, $not_subcon_flg, value);
	}


	/**
	 * Scheduled payment date FROM 支払予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate pay_schd_dt_fr() {
		return getConstDate(offset + 11, $pay_schd_dt_fr);
	}

	/**
	 * Scheduled payment date FROM 支払予定日ＦＲＯＭ.<p>
	 *
	 */
	public void pay_schd_dt_fr(MCDate value) {
		setConstDate(offset + 11, $pay_schd_dt_fr, value);
	}


	/**
	 * Scheduled payment date TO 支払予定日ＴＯ.<p>
	 *
	 */
	public MCDate pay_schd_dt_to() {
		return getConstDate(offset + 12, $pay_schd_dt_to);
	}

	/**
	 * Scheduled payment date TO 支払予定日ＴＯ.<p>
	 *
	 */
	public void pay_schd_dt_to(MCDate value) {
		setConstDate(offset + 12, $pay_schd_dt_to, value);
	}


	/**
	 * Scheduled payee closing year, month, and date FROM 支払予定管理先締年月日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate bsppl_cl_dt_fr() {
		return getConstDate(offset + 13, $bsppl_cl_dt_fr);
	}

	/**
	 * Scheduled payee closing year, month, and date FROM 支払予定管理先締年月日ＦＲＯＭ.<p>
	 *
	 */
	public void bsppl_cl_dt_fr(MCDate value) {
		setConstDate(offset + 13, $bsppl_cl_dt_fr, value);
	}


	/**
	 * Scheduled payee closing year, month, and date TO 支払予定管理先締年月日ＴＯ.<p>
	 *
	 */
	public MCDate bsppl_cl_dt_to() {
		return getConstDate(offset + 14, $bsppl_cl_dt_to);
	}

	/**
	 * Scheduled payee closing year, month, and date TO 支払予定管理先締年月日ＴＯ.<p>
	 *
	 */
	public void bsppl_cl_dt_to(MCDate value) {
		setConstDate(offset + 14, $bsppl_cl_dt_to, value);
	}


	/**
	 * Actual date FROM 実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate act_dt_fr() {
		return getConstDate(offset + 15, $act_dt_fr);
	}

	/**
	 * Actual date FROM 実績日ＦＲＯＭ.<p>
	 *
	 */
	public void act_dt_fr(MCDate value) {
		setConstDate(offset + 15, $act_dt_fr, value);
	}


	/**
	 * Actual date TO 実績日ＴＯ.<p>
	 *
	 */
	public MCDate act_dt_to() {
		return getConstDate(offset + 16, $act_dt_to);
	}

	/**
	 * Actual date TO 実績日ＴＯ.<p>
	 *
	 */
	public void act_dt_to(MCDate value) {
		setConstDate(offset + 16, $act_dt_to, value);
	}


	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ac_dt_fr() {
		return getConstDate(offset + 17, $ac_dt_fr);
	}

	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public void ac_dt_fr(MCDate value) {
		setConstDate(offset + 17, $ac_dt_fr, value);
	}


	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public MCDate ac_dt_to() {
		return getConstDate(offset + 18, $ac_dt_to);
	}

	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public void ac_dt_to(MCDate value) {
		setConstDate(offset + 18, $ac_dt_to, value);
	}


	/**
	 * Elapsed days (equal or more) 経過日数（以上）.<p>
	 *
	 */
	public MCNumber pass_days() {
		return getConstNumber(offset + 19, $pass_days);
	}

	/**
	 * Elapsed days (equal or more) 経過日数（以上）.<p>
	 *
	 */
	public void pass_days(MCNumber value) {
		setConstNumber(offset + 19, $pass_days, value);
	}

	/**
	 * Elapsed days (equal or more) 経過日数（以上）.<p>
	 *
	 */
	public void pass_days(int value) {
		setConstNumber(offset + 19, $pass_days, value);
	}

	/**
	 * Elapsed days (equal or more) 経過日数（以上）.<p>
	 *
	 */
	public void pass_days(long value) {
		setConstNumber(offset + 19, $pass_days, value);
	}

	/**
	 * Elapsed days (equal or more) 経過日数（以上）.<p>
	 *
	 */
	public void pass_days(float value) {
		setConstNumber(offset + 19, $pass_days, value);
	}

	/**
	 * Elapsed days (equal or more) 経過日数（以上）.<p>
	 *
	 */
	public void pass_days(double value) {
		setConstNumber(offset + 19, $pass_days, value);
	}


	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 20, $bsppl_cd);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 20, $bsppl_cd, value);
	}


	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public String bsppl_nm() {
		return getConstString(offset + 21, $bsppl_nm);
	}

	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public void bsppl_nm(String value) {
		setConstString(offset + 21, $bsppl_nm, value);
	}


	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 22, $asppl_cd);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 22, $asppl_cd, value);
	}


	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public String asppl_nm() {
		return getConstString(offset + 23, $asppl_nm);
	}

	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public void asppl_nm(String value) {
		setConstString(offset + 23, $asppl_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 24, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 24, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 25, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 25, $sppl_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 26, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 26, $itm_typ, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 27, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 27, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 28, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 28, $itm_typ_d_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 29, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 29, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 30, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 30, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 31, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 31, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 32, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 32, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 33, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 33, $itm_nm, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 34, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 34, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 35, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 35, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 36, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 36, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 37, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 37, $sno4, value);
	}


	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 38, $bsppl_dpt_cd);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 38, $bsppl_dpt_cd, value);
	}


	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public String bsppl_dpt_nm() {
		return getConstString(offset + 39, $bsppl_dpt_nm);
	}

	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public void bsppl_dpt_nm(String value) {
		setConstString(offset + 39, $bsppl_dpt_nm, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 40, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 40, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 41, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 41, $ap_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 42, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 42, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 43, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 43, $wg_nm, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 44, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 44, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 45, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 45, $trd_nm, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 46, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 46, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 47, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 47, $trd_cur_nm, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 48, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 48, $po_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 49, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 49, $po_d_no, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 50, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 50, $purc_act_no, value);
	}


	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 51, $purc_act_d_no);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 51, $purc_act_d_no, value);
	}


	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return getConstString(offset + 52, $bp_dlv_slip_no);
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		setConstString(offset + 52, $bp_dlv_slip_no, value);
	}


	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_d_no() {
		return getConstString(offset + 53, $bp_dlv_slip_d_no);
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no(String value) {
		setConstString(offset + 53, $bp_dlv_slip_d_no, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 54, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 54, $rcpt_iv_no, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 55, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 55, $rcpt_iv_mng_no, value);
	}


	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public String ap_d_no() {
		return getConstString(offset + 56, $ap_d_no);
	}

	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public void ap_d_no(String value) {
		setConstString(offset + 56, $ap_d_no, value);
	}


	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public String pay_chk_no() {
		return getConstString(offset + 57, $pay_chk_no);
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no(String value) {
		setConstString(offset + 57, $pay_chk_no, value);
	}


	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public String pay_sts_typ() {
		return getConstString(offset + 58, $pay_sts_typ);
	}

	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public void pay_sts_typ(String value) {
		setConstString(offset + 58, $pay_sts_typ, value);
	}


	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public String pay_mtd_typ() {
		return getConstString(offset + 59, $pay_mtd_typ);
	}

	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public void pay_mtd_typ(String value) {
		setConstString(offset + 59, $pay_mtd_typ, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 60, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 60, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 61, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 61, $wrk_nm, value);
	}


	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public String pay_schd_d_print_rmrks() {
		return getConstString(offset + 62, $pay_schd_d_print_rmrks);
	}

	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public void pay_schd_d_print_rmrks(String value) {
		setConstString(offset + 62, $pay_schd_d_print_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 63, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 63, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 64, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 64, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 65, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 65, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 66, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 66, $sub_char3, value);
	}


	/**
	 * Include temporary AP 暫定買掛含む.<p>
	 *
	 */
	public boolean accrued_flg() {
		return getConstBoolean(offset + 67, $accrued_flg);
	}

	/**
	 * Include temporary AP 暫定買掛含む.<p>
	 *
	 */
	public void accrued_flg(boolean value) {
		setConstBoolean(offset + 67, $accrued_flg, value);
	}


	/**
	 * Scheduled payee classification 1 search target 支払予定管理先分類１検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg1() {
		return getConstBoolean(offset + 68, $bsppl_grp_flg1);
	}

	/**
	 * Scheduled payee classification 1 search target 支払予定管理先分類１検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg1(boolean value) {
		setConstBoolean(offset + 68, $bsppl_grp_flg1, value);
	}


	/**
	 * Scheduled payee classification cd. 1 支払予定管理先分類ＣＤ１.<p>
	 *
	 */
	public String bsppl_grp_cd1() {
		return getConstString(offset + 69, $bsppl_grp_cd1);
	}

	/**
	 * Scheduled payee classification cd. 1 支払予定管理先分類ＣＤ１.<p>
	 *
	 */
	public void bsppl_grp_cd1(String value) {
		setConstString(offset + 69, $bsppl_grp_cd1, value);
	}


	/**
	 * Scheduled payee classification name 1 支払予定管理先分類名１.<p>
	 *
	 */
	public String bsppl_grp_nm1() {
		return getConstString(offset + 70, $bsppl_grp_nm1);
	}

	/**
	 * Scheduled payee classification name 1 支払予定管理先分類名１.<p>
	 *
	 */
	public void bsppl_grp_nm1(String value) {
		setConstString(offset + 70, $bsppl_grp_nm1, value);
	}


	/**
	 * Scheduled payee classification 2 search target 支払予定管理先分類２検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg2() {
		return getConstBoolean(offset + 71, $bsppl_grp_flg2);
	}

	/**
	 * Scheduled payee classification 2 search target 支払予定管理先分類２検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg2(boolean value) {
		setConstBoolean(offset + 71, $bsppl_grp_flg2, value);
	}


	/**
	 * Scheduled payee classification cd. 2 支払予定管理先分類ＣＤ２.<p>
	 *
	 */
	public String bsppl_grp_cd2() {
		return getConstString(offset + 72, $bsppl_grp_cd2);
	}

	/**
	 * Scheduled payee classification cd. 2 支払予定管理先分類ＣＤ２.<p>
	 *
	 */
	public void bsppl_grp_cd2(String value) {
		setConstString(offset + 72, $bsppl_grp_cd2, value);
	}


	/**
	 * Scheduled payee classification name 2 支払予定管理先分類名２.<p>
	 *
	 */
	public String bsppl_grp_nm2() {
		return getConstString(offset + 73, $bsppl_grp_nm2);
	}

	/**
	 * Scheduled payee classification name 2 支払予定管理先分類名２.<p>
	 *
	 */
	public void bsppl_grp_nm2(String value) {
		setConstString(offset + 73, $bsppl_grp_nm2, value);
	}


	/**
	 * Scheduled payee classification 3 search target 支払予定管理先分類３検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg3() {
		return getConstBoolean(offset + 74, $bsppl_grp_flg3);
	}

	/**
	 * Scheduled payee classification 3 search target 支払予定管理先分類３検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg3(boolean value) {
		setConstBoolean(offset + 74, $bsppl_grp_flg3, value);
	}


	/**
	 * Scheduled payee classification cd. 3 支払予定管理先分類ＣＤ３.<p>
	 *
	 */
	public String bsppl_grp_cd3() {
		return getConstString(offset + 75, $bsppl_grp_cd3);
	}

	/**
	 * Scheduled payee classification cd. 3 支払予定管理先分類ＣＤ３.<p>
	 *
	 */
	public void bsppl_grp_cd3(String value) {
		setConstString(offset + 75, $bsppl_grp_cd3, value);
	}


	/**
	 * Scheduled payee classification name 3 支払予定管理先分類名３.<p>
	 *
	 */
	public String bsppl_grp_nm3() {
		return getConstString(offset + 76, $bsppl_grp_nm3);
	}

	/**
	 * Scheduled payee classification name 3 支払予定管理先分類名３.<p>
	 *
	 */
	public void bsppl_grp_nm3(String value) {
		setConstString(offset + 76, $bsppl_grp_nm3, value);
	}


	/**
	 * Scheduled payee classification 4 search target 支払予定管理先分類４検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg4() {
		return getConstBoolean(offset + 77, $bsppl_grp_flg4);
	}

	/**
	 * Scheduled payee classification 4 search target 支払予定管理先分類４検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg4(boolean value) {
		setConstBoolean(offset + 77, $bsppl_grp_flg4, value);
	}


	/**
	 * Scheduled payee classification cd. 4 支払予定管理先分類ＣＤ４.<p>
	 *
	 */
	public String bsppl_grp_cd4() {
		return getConstString(offset + 78, $bsppl_grp_cd4);
	}

	/**
	 * Scheduled payee classification cd. 4 支払予定管理先分類ＣＤ４.<p>
	 *
	 */
	public void bsppl_grp_cd4(String value) {
		setConstString(offset + 78, $bsppl_grp_cd4, value);
	}


	/**
	 * Scheduled payee classification name 4 支払予定管理先分類名４.<p>
	 *
	 */
	public String bsppl_grp_nm4() {
		return getConstString(offset + 79, $bsppl_grp_nm4);
	}

	/**
	 * Scheduled payee classification name 4 支払予定管理先分類名４.<p>
	 *
	 */
	public void bsppl_grp_nm4(String value) {
		setConstString(offset + 79, $bsppl_grp_nm4, value);
	}


	/**
	 * Scheduled payee classification 5 search target 支払予定管理先分類５検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg5() {
		return getConstBoolean(offset + 80, $bsppl_grp_flg5);
	}

	/**
	 * Scheduled payee classification 5 search target 支払予定管理先分類５検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg5(boolean value) {
		setConstBoolean(offset + 80, $bsppl_grp_flg5, value);
	}


	/**
	 * Scheduled payee classification cd. 5 支払予定管理先分類ＣＤ５.<p>
	 *
	 */
	public String bsppl_grp_cd5() {
		return getConstString(offset + 81, $bsppl_grp_cd5);
	}

	/**
	 * Scheduled payee classification cd. 5 支払予定管理先分類ＣＤ５.<p>
	 *
	 */
	public void bsppl_grp_cd5(String value) {
		setConstString(offset + 81, $bsppl_grp_cd5, value);
	}


	/**
	 * Scheduled payee classification name 5 支払予定管理先分類名５.<p>
	 *
	 */
	public String bsppl_grp_nm5() {
		return getConstString(offset + 82, $bsppl_grp_nm5);
	}

	/**
	 * Scheduled payee classification name 5 支払予定管理先分類名５.<p>
	 *
	 */
	public void bsppl_grp_nm5(String value) {
		setConstString(offset + 82, $bsppl_grp_nm5, value);
	}


	/**
	 * Scheduled payee classification 6 search target 支払予定管理先分類６検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg6() {
		return getConstBoolean(offset + 83, $bsppl_grp_flg6);
	}

	/**
	 * Scheduled payee classification 6 search target 支払予定管理先分類６検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg6(boolean value) {
		setConstBoolean(offset + 83, $bsppl_grp_flg6, value);
	}


	/**
	 * Scheduled payee classification cd. 6 支払予定管理先分類ＣＤ６.<p>
	 *
	 */
	public String bsppl_grp_cd6() {
		return getConstString(offset + 84, $bsppl_grp_cd6);
	}

	/**
	 * Scheduled payee classification cd. 6 支払予定管理先分類ＣＤ６.<p>
	 *
	 */
	public void bsppl_grp_cd6(String value) {
		setConstString(offset + 84, $bsppl_grp_cd6, value);
	}


	/**
	 * Scheduled payee classification name 6 支払予定管理先分類名６.<p>
	 *
	 */
	public String bsppl_grp_nm6() {
		return getConstString(offset + 85, $bsppl_grp_nm6);
	}

	/**
	 * Scheduled payee classification name 6 支払予定管理先分類名６.<p>
	 *
	 */
	public void bsppl_grp_nm6(String value) {
		setConstString(offset + 85, $bsppl_grp_nm6, value);
	}


	/**
	 * Scheduled payee classification 7 search target 支払予定管理先分類７検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg7() {
		return getConstBoolean(offset + 86, $bsppl_grp_flg7);
	}

	/**
	 * Scheduled payee classification 7 search target 支払予定管理先分類７検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg7(boolean value) {
		setConstBoolean(offset + 86, $bsppl_grp_flg7, value);
	}


	/**
	 * Scheduled payee classification cd. 7 支払予定管理先分類ＣＤ７.<p>
	 *
	 */
	public String bsppl_grp_cd7() {
		return getConstString(offset + 87, $bsppl_grp_cd7);
	}

	/**
	 * Scheduled payee classification cd. 7 支払予定管理先分類ＣＤ７.<p>
	 *
	 */
	public void bsppl_grp_cd7(String value) {
		setConstString(offset + 87, $bsppl_grp_cd7, value);
	}


	/**
	 * Scheduled payee classification name 7 支払予定管理先分類名７.<p>
	 *
	 */
	public String bsppl_grp_nm7() {
		return getConstString(offset + 88, $bsppl_grp_nm7);
	}

	/**
	 * Scheduled payee classification name 7 支払予定管理先分類名７.<p>
	 *
	 */
	public void bsppl_grp_nm7(String value) {
		setConstString(offset + 88, $bsppl_grp_nm7, value);
	}


	/**
	 * Scheduled payee classification 8 search target 支払予定管理先分類８検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg8() {
		return getConstBoolean(offset + 89, $bsppl_grp_flg8);
	}

	/**
	 * Scheduled payee classification 8 search target 支払予定管理先分類８検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg8(boolean value) {
		setConstBoolean(offset + 89, $bsppl_grp_flg8, value);
	}


	/**
	 * Scheduled payee classification cd. 8 支払予定管理先分類ＣＤ８.<p>
	 *
	 */
	public String bsppl_grp_cd8() {
		return getConstString(offset + 90, $bsppl_grp_cd8);
	}

	/**
	 * Scheduled payee classification cd. 8 支払予定管理先分類ＣＤ８.<p>
	 *
	 */
	public void bsppl_grp_cd8(String value) {
		setConstString(offset + 90, $bsppl_grp_cd8, value);
	}


	/**
	 * Scheduled payee classification name 8 支払予定管理先分類名８.<p>
	 *
	 */
	public String bsppl_grp_nm8() {
		return getConstString(offset + 91, $bsppl_grp_nm8);
	}

	/**
	 * Scheduled payee classification name 8 支払予定管理先分類名８.<p>
	 *
	 */
	public void bsppl_grp_nm8(String value) {
		setConstString(offset + 91, $bsppl_grp_nm8, value);
	}


	/**
	 * Scheduled payee classification 9 search target 支払予定管理先分類９検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg9() {
		return getConstBoolean(offset + 92, $bsppl_grp_flg9);
	}

	/**
	 * Scheduled payee classification 9 search target 支払予定管理先分類９検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg9(boolean value) {
		setConstBoolean(offset + 92, $bsppl_grp_flg9, value);
	}


	/**
	 * Scheduled payee classification cd. 9 支払予定管理先分類ＣＤ９.<p>
	 *
	 */
	public String bsppl_grp_cd9() {
		return getConstString(offset + 93, $bsppl_grp_cd9);
	}

	/**
	 * Scheduled payee classification cd. 9 支払予定管理先分類ＣＤ９.<p>
	 *
	 */
	public void bsppl_grp_cd9(String value) {
		setConstString(offset + 93, $bsppl_grp_cd9, value);
	}


	/**
	 * Scheduled payee classification name 9 支払予定管理先分類名９.<p>
	 *
	 */
	public String bsppl_grp_nm9() {
		return getConstString(offset + 94, $bsppl_grp_nm9);
	}

	/**
	 * Scheduled payee classification name 9 支払予定管理先分類名９.<p>
	 *
	 */
	public void bsppl_grp_nm9(String value) {
		setConstString(offset + 94, $bsppl_grp_nm9, value);
	}


	/**
	 * Scheduled payee classification 10 search target 支払予定管理先分類１０検索対象.<p>
	 *
	 */
	public boolean bsppl_grp_flg10() {
		return getConstBoolean(offset + 95, $bsppl_grp_flg10);
	}

	/**
	 * Scheduled payee classification 10 search target 支払予定管理先分類１０検索対象.<p>
	 *
	 */
	public void bsppl_grp_flg10(boolean value) {
		setConstBoolean(offset + 95, $bsppl_grp_flg10, value);
	}


	/**
	 * Scheduled payee classification cd. 10 支払予定管理先分類ＣＤ１０.<p>
	 *
	 */
	public String bsppl_grp_cd10() {
		return getConstString(offset + 96, $bsppl_grp_cd10);
	}

	/**
	 * Scheduled payee classification cd. 10 支払予定管理先分類ＣＤ１０.<p>
	 *
	 */
	public void bsppl_grp_cd10(String value) {
		setConstString(offset + 96, $bsppl_grp_cd10, value);
	}


	/**
	 * Scheduled payee classification name 10 支払予定管理先分類名１０.<p>
	 *
	 */
	public String bsppl_grp_nm10() {
		return getConstString(offset + 97, $bsppl_grp_nm10);
	}

	/**
	 * Scheduled payee classification name 10 支払予定管理先分類名１０.<p>
	 *
	 */
	public void bsppl_grp_nm10(String value) {
		setConstString(offset + 97, $bsppl_grp_nm10, value);
	}


	/**
	 * AP supplier classification 1 search target 買掛先分類１検索対象.<p>
	 *
	 */
	public boolean asppl_grp_flg1() {
		return getConstBoolean(offset + 98, $asppl_grp_flg1);
	}

	/**
	 * AP supplier classification 1 search target 買掛先分類１検索対象.<p>
	 *
	 */
	public void asppl_grp_flg1(boolean value) {
		setConstBoolean(offset + 98, $asppl_grp_flg1, value);
	}


	/**
	 * AP supplier classification cd. 1 買掛先分類ＣＤ１.<p>
	 *
	 */
	public String asppl_grp_cd1() {
		return getConstString(offset + 99, $asppl_grp_cd1);
	}

	/**
	 * AP supplier classification cd. 1 買掛先分類ＣＤ１.<p>
	 *
	 */
	public void asppl_grp_cd1(String value) {
		setConstString(offset + 99, $asppl_grp_cd1, value);
	}


	/**
	 * AP supplier classification name 1 買掛先分類名１.<p>
	 *
	 */
	public String asppl_grp_nm1() {
		return getConstString(offset + 100, $asppl_grp_nm1);
	}

	/**
	 * AP supplier classification name 1 買掛先分類名１.<p>
	 *
	 */
	public void asppl_grp_nm1(String value) {
		setConstString(offset + 100, $asppl_grp_nm1, value);
	}


	/**
	 * AP supplier classification 2 search target 買掛先分類２検索対象.<p>
	 *
	 */
	public boolean asppl_grp_flg2() {
		return getConstBoolean(offset + 101, $asppl_grp_flg2);
	}

	/**
	 * AP supplier classification 2 search target 買掛先分類２検索対象.<p>
	 *
	 */
	public void asppl_grp_flg2(boolean value) {
		setConstBoolean(offset + 101, $asppl_grp_flg2, value);
	}


	/**
	 * AP supplier classification cd. 2 買掛先分類ＣＤ２.<p>
	 *
	 */
	public String asppl_grp_cd2() {
		return getConstString(offset + 102, $asppl_grp_cd2);
	}

	/**
	 * AP supplier classification cd. 2 買掛先分類ＣＤ２.<p>
	 *
	 */
	public void asppl_grp_cd2(String value) {
		setConstString(offset + 102, $asppl_grp_cd2, value);
	}


	/**
	 * AP supplier classification name 2 買掛先分類名２.<p>
	 *
	 */
	public String asppl_grp_nm2() {
		return getConstString(offset + 103, $asppl_grp_nm2);
	}

	/**
	 * AP supplier classification name 2 買掛先分類名２.<p>
	 *
	 */
	public void asppl_grp_nm2(String value) {
		setConstString(offset + 103, $asppl_grp_nm2, value);
	}


	/**
	 * AP supplier classification 3 search target 買掛先分類３検索対象.<p>
	 *
	 */
	public boolean asppl_grp_flg3() {
		return getConstBoolean(offset + 104, $asppl_grp_flg3);
	}

	/**
	 * AP supplier classification 3 search target 買掛先分類３検索対象.<p>
	 *
	 */
	public void asppl_grp_flg3(boolean value) {
		setConstBoolean(offset + 104, $asppl_grp_flg3, value);
	}


	/**
	 * AP supplier classification cd. 3 買掛先分類ＣＤ３.<p>
	 *
	 */
	public String asppl_grp_cd3() {
		return getConstString(offset + 105, $asppl_grp_cd3);
	}

	/**
	 * AP supplier classification cd. 3 買掛先分類ＣＤ３.<p>
	 *
	 */
	public void asppl_grp_cd3(String value) {
		setConstString(offset + 105, $asppl_grp_cd3, value);
	}


	/**
	 * AP supplier classification name 3 買掛先分類名３.<p>
	 *
	 */
	public String asppl_grp_nm3() {
		return getConstString(offset + 106, $asppl_grp_nm3);
	}

	/**
	 * AP supplier classification name 3 買掛先分類名３.<p>
	 *
	 */
	public void asppl_grp_nm3(String value) {
		setConstString(offset + 106, $asppl_grp_nm3, value);
	}


	/**
	 * AP supplier classification 4 search target 買掛先分類４検索対象.<p>
	 *
	 */
	public boolean asppl_grp_flg4() {
		return getConstBoolean(offset + 107, $asppl_grp_flg4);
	}

	/**
	 * AP supplier classification 4 search target 買掛先分類４検索対象.<p>
	 *
	 */
	public void asppl_grp_flg4(boolean value) {
		setConstBoolean(offset + 107, $asppl_grp_flg4, value);
	}


	/**
	 * AP supplier classification cd. 4 買掛先分類ＣＤ４.<p>
	 *
	 */
	public String asppl_grp_cd4() {
		return getConstString(offset + 108, $asppl_grp_cd4);
	}

	/**
	 * AP supplier classification cd. 4 買掛先分類ＣＤ４.<p>
	 *
	 */
	public void asppl_grp_cd4(String value) {
		setConstString(offset + 108, $asppl_grp_cd4, value);
	}


	/**
	 * AP supplier classification name 4 買掛先分類名４.<p>
	 *
	 */
	public String asppl_grp_nm4() {
		return getConstString(offset + 109, $asppl_grp_nm4);
	}

	/**
	 * AP supplier classification name 4 買掛先分類名４.<p>
	 *
	 */
	public void asppl_grp_nm4(String value) {
		setConstString(offset + 109, $asppl_grp_nm4, value);
	}


	/**
	 * AP supplier classification 5 search target 買掛先分類５検索対象.<p>
	 *
	 */
	public boolean asppl_grp_flg5() {
		return getConstBoolean(offset + 110, $asppl_grp_flg5);
	}

	/**
	 * AP supplier classification 5 search target 買掛先分類５検索対象.<p>
	 *
	 */
	public void asppl_grp_flg5(boolean value) {
		setConstBoolean(offset + 110, $asppl_grp_flg5, value);
	}


	/**
	 * AP supplier classification cd. 5 買掛先分類ＣＤ５.<p>
	 *
	 */
	public String asppl_grp_cd5() {
		return getConstString(offset + 111, $asppl_grp_cd5);
	}

	/**
	 * AP supplier classification cd. 5 買掛先分類ＣＤ５.<p>
	 *
	 */
	public void asppl_grp_cd5(String value) {
		setConstString(offset + 111, $asppl_grp_cd5, value);
	}


	/**
	 * AP supplier classification name 5 買掛先分類名５.<p>
	 *
	 */
	public String asppl_grp_nm5() {
		return getConstString(offset + 112, $asppl_grp_nm5);
	}

	/**
	 * AP supplier classification name 5 買掛先分類名５.<p>
	 *
	 */
	public void asppl_grp_nm5(String value) {
		setConstString(offset + 112, $asppl_grp_nm5, value);
	}


	/**
	 * AP supplier classification 6 search target 買掛先分類６検索対象.<p>
	 *
	 */
	public boolean asppl_grp_flg6() {
		return getConstBoolean(offset + 113, $asppl_grp_flg6);
	}

	/**
	 * AP supplier classification 6 search target 買掛先分類６検索対象.<p>
	 *
	 */
	public void asppl_grp_flg6(boolean value) {
		setConstBoolean(offset + 113, $asppl_grp_flg6, value);
	}


	/**
	 * AP supplier classification cd. 6 買掛先分類ＣＤ６.<p>
	 *
	 */
	public String asppl_grp_cd6() {
		return getConstString(offset + 114, $asppl_grp_cd6);
	}

	/**
	 * AP supplier classification cd. 6 買掛先分類ＣＤ６.<p>
	 *
	 */
	public void asppl_grp_cd6(String value) {
		setConstString(offset + 114, $asppl_grp_cd6, value);
	}


	/**
	 * AP supplier classification name 6 買掛先分類名６.<p>
	 *
	 */
	public String asppl_grp_nm6() {
		return getConstString(offset + 115, $asppl_grp_nm6);
	}

	/**
	 * AP supplier classification name 6 買掛先分類名６.<p>
	 *
	 */
	public void asppl_grp_nm6(String value) {
		setConstString(offset + 115, $asppl_grp_nm6, value);
	}


	/**
	 * AP supplier classification 7 search target 買掛先分類７検索対象.<p>
	 *
	 */
	public boolean asppl_grp_flg7() {
		return getConstBoolean(offset + 116, $asppl_grp_flg7);
	}

	/**
	 * AP supplier classification 7 search target 買掛先分類７検索対象.<p>
	 *
	 */
	public void asppl_grp_flg7(boolean value) {
		setConstBoolean(offset + 116, $asppl_grp_flg7, value);
	}


	/**
	 * AP supplier classification cd. 7 買掛先分類ＣＤ７.<p>
	 *
	 */
	public String asppl_grp_cd7() {
		return getConstString(offset + 117, $asppl_grp_cd7);
	}

	/**
	 * AP supplier classification cd. 7 買掛先分類ＣＤ７.<p>
	 *
	 */
	public void asppl_grp_cd7(String value) {
		setConstString(offset + 117, $asppl_grp_cd7, value);
	}


	/**
	 * AP supplier classification name 7 買掛先分類名７.<p>
	 *
	 */
	public String asppl_grp_nm7() {
		return getConstString(offset + 118, $asppl_grp_nm7);
	}

	/**
	 * AP supplier classification name 7 買掛先分類名７.<p>
	 *
	 */
	public void asppl_grp_nm7(String value) {
		setConstString(offset + 118, $asppl_grp_nm7, value);
	}


	/**
	 * AP supplier classification 8 search target 買掛先分類８検索対象.<p>
	 *
	 */
	public boolean asppl_grp_flg8() {
		return getConstBoolean(offset + 119, $asppl_grp_flg8);
	}

	/**
	 * AP supplier classification 8 search target 買掛先分類８検索対象.<p>
	 *
	 */
	public void asppl_grp_flg8(boolean value) {
		setConstBoolean(offset + 119, $asppl_grp_flg8, value);
	}


	/**
	 * AP supplier classification cd. 8 買掛先分類ＣＤ８.<p>
	 *
	 */
	public String asppl_grp_cd8() {
		return getConstString(offset + 120, $asppl_grp_cd8);
	}

	/**
	 * AP supplier classification cd. 8 買掛先分類ＣＤ８.<p>
	 *
	 */
	public void asppl_grp_cd8(String value) {
		setConstString(offset + 120, $asppl_grp_cd8, value);
	}


	/**
	 * AP supplier classification name 8 買掛先分類名８.<p>
	 *
	 */
	public String asppl_grp_nm8() {
		return getConstString(offset + 121, $asppl_grp_nm8);
	}

	/**
	 * AP supplier classification name 8 買掛先分類名８.<p>
	 *
	 */
	public void asppl_grp_nm8(String value) {
		setConstString(offset + 121, $asppl_grp_nm8, value);
	}


	/**
	 * AP supplier classification 9 search target 買掛先分類９検索対象.<p>
	 *
	 */
	public boolean asppl_grp_flg9() {
		return getConstBoolean(offset + 122, $asppl_grp_flg9);
	}

	/**
	 * AP supplier classification 9 search target 買掛先分類９検索対象.<p>
	 *
	 */
	public void asppl_grp_flg9(boolean value) {
		setConstBoolean(offset + 122, $asppl_grp_flg9, value);
	}


	/**
	 * AP supplier classification cd. 9 買掛先分類ＣＤ９.<p>
	 *
	 */
	public String asppl_grp_cd9() {
		return getConstString(offset + 123, $asppl_grp_cd9);
	}

	/**
	 * AP supplier classification cd. 9 買掛先分類ＣＤ９.<p>
	 *
	 */
	public void asppl_grp_cd9(String value) {
		setConstString(offset + 123, $asppl_grp_cd9, value);
	}


	/**
	 * AP supplier classification name 9 買掛先分類名９.<p>
	 *
	 */
	public String asppl_grp_nm9() {
		return getConstString(offset + 124, $asppl_grp_nm9);
	}

	/**
	 * AP supplier classification name 9 買掛先分類名９.<p>
	 *
	 */
	public void asppl_grp_nm9(String value) {
		setConstString(offset + 124, $asppl_grp_nm9, value);
	}


	/**
	 * AP supplier classification 10 search target 買掛先分類１０検索対象.<p>
	 *
	 */
	public boolean asppl_grp_flg10() {
		return getConstBoolean(offset + 125, $asppl_grp_flg10);
	}

	/**
	 * AP supplier classification 10 search target 買掛先分類１０検索対象.<p>
	 *
	 */
	public void asppl_grp_flg10(boolean value) {
		setConstBoolean(offset + 125, $asppl_grp_flg10, value);
	}


	/**
	 * AP supplier classification cd. 10 買掛先分類ＣＤ１０.<p>
	 *
	 */
	public String asppl_grp_cd10() {
		return getConstString(offset + 126, $asppl_grp_cd10);
	}

	/**
	 * AP supplier classification cd. 10 買掛先分類ＣＤ１０.<p>
	 *
	 */
	public void asppl_grp_cd10(String value) {
		setConstString(offset + 126, $asppl_grp_cd10, value);
	}


	/**
	 * AP supplier classification name 10 買掛先分類名１０.<p>
	 *
	 */
	public String asppl_grp_nm10() {
		return getConstString(offset + 127, $asppl_grp_nm10);
	}

	/**
	 * AP supplier classification name 10 買掛先分類名１０.<p>
	 *
	 */
	public void asppl_grp_nm10(String value) {
		setConstString(offset + 127, $asppl_grp_nm10, value);
	}


	/**
	 * Supplier classification 1 search target 発注先分類１検索対象.<p>
	 *
	 */
	public boolean sppl_grp_flg1() {
		return getConstBoolean(offset + 128, $sppl_grp_flg1);
	}

	/**
	 * Supplier classification 1 search target 発注先分類１検索対象.<p>
	 *
	 */
	public void sppl_grp_flg1(boolean value) {
		setConstBoolean(offset + 128, $sppl_grp_flg1, value);
	}


	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public String sppl_grp_cd1() {
		return getConstString(offset + 129, $sppl_grp_cd1);
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public void sppl_grp_cd1(String value) {
		setConstString(offset + 129, $sppl_grp_cd1, value);
	}


	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public String sppl_grp_nm1() {
		return getConstString(offset + 130, $sppl_grp_nm1);
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public void sppl_grp_nm1(String value) {
		setConstString(offset + 130, $sppl_grp_nm1, value);
	}


	/**
	 * Supplier classification 2 search target 発注先分類２検索対象.<p>
	 *
	 */
	public boolean sppl_grp_flg2() {
		return getConstBoolean(offset + 131, $sppl_grp_flg2);
	}

	/**
	 * Supplier classification 2 search target 発注先分類２検索対象.<p>
	 *
	 */
	public void sppl_grp_flg2(boolean value) {
		setConstBoolean(offset + 131, $sppl_grp_flg2, value);
	}


	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public String sppl_grp_cd2() {
		return getConstString(offset + 132, $sppl_grp_cd2);
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public void sppl_grp_cd2(String value) {
		setConstString(offset + 132, $sppl_grp_cd2, value);
	}


	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public String sppl_grp_nm2() {
		return getConstString(offset + 133, $sppl_grp_nm2);
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public void sppl_grp_nm2(String value) {
		setConstString(offset + 133, $sppl_grp_nm2, value);
	}


	/**
	 * Supplier classification 3 search target 発注先分類３検索対象.<p>
	 *
	 */
	public boolean sppl_grp_flg3() {
		return getConstBoolean(offset + 134, $sppl_grp_flg3);
	}

	/**
	 * Supplier classification 3 search target 発注先分類３検索対象.<p>
	 *
	 */
	public void sppl_grp_flg3(boolean value) {
		setConstBoolean(offset + 134, $sppl_grp_flg3, value);
	}


	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public String sppl_grp_cd3() {
		return getConstString(offset + 135, $sppl_grp_cd3);
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public void sppl_grp_cd3(String value) {
		setConstString(offset + 135, $sppl_grp_cd3, value);
	}


	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public String sppl_grp_nm3() {
		return getConstString(offset + 136, $sppl_grp_nm3);
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public void sppl_grp_nm3(String value) {
		setConstString(offset + 136, $sppl_grp_nm3, value);
	}


	/**
	 * Supplier classification 4 search target 発注先分類４検索対象.<p>
	 *
	 */
	public boolean sppl_grp_flg4() {
		return getConstBoolean(offset + 137, $sppl_grp_flg4);
	}

	/**
	 * Supplier classification 4 search target 発注先分類４検索対象.<p>
	 *
	 */
	public void sppl_grp_flg4(boolean value) {
		setConstBoolean(offset + 137, $sppl_grp_flg4, value);
	}


	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public String sppl_grp_cd4() {
		return getConstString(offset + 138, $sppl_grp_cd4);
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public void sppl_grp_cd4(String value) {
		setConstString(offset + 138, $sppl_grp_cd4, value);
	}


	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public String sppl_grp_nm4() {
		return getConstString(offset + 139, $sppl_grp_nm4);
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public void sppl_grp_nm4(String value) {
		setConstString(offset + 139, $sppl_grp_nm4, value);
	}


	/**
	 * Supplier classification 5 search target 発注先分類５検索対象.<p>
	 *
	 */
	public boolean sppl_grp_flg5() {
		return getConstBoolean(offset + 140, $sppl_grp_flg5);
	}

	/**
	 * Supplier classification 5 search target 発注先分類５検索対象.<p>
	 *
	 */
	public void sppl_grp_flg5(boolean value) {
		setConstBoolean(offset + 140, $sppl_grp_flg5, value);
	}


	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public String sppl_grp_cd5() {
		return getConstString(offset + 141, $sppl_grp_cd5);
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public void sppl_grp_cd5(String value) {
		setConstString(offset + 141, $sppl_grp_cd5, value);
	}


	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public String sppl_grp_nm5() {
		return getConstString(offset + 142, $sppl_grp_nm5);
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public void sppl_grp_nm5(String value) {
		setConstString(offset + 142, $sppl_grp_nm5, value);
	}


	/**
	 * Supplier classification 6 search target 発注先分類６検索対象.<p>
	 *
	 */
	public boolean sppl_grp_flg6() {
		return getConstBoolean(offset + 143, $sppl_grp_flg6);
	}

	/**
	 * Supplier classification 6 search target 発注先分類６検索対象.<p>
	 *
	 */
	public void sppl_grp_flg6(boolean value) {
		setConstBoolean(offset + 143, $sppl_grp_flg6, value);
	}


	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public String sppl_grp_cd6() {
		return getConstString(offset + 144, $sppl_grp_cd6);
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public void sppl_grp_cd6(String value) {
		setConstString(offset + 144, $sppl_grp_cd6, value);
	}


	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public String sppl_grp_nm6() {
		return getConstString(offset + 145, $sppl_grp_nm6);
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public void sppl_grp_nm6(String value) {
		setConstString(offset + 145, $sppl_grp_nm6, value);
	}


	/**
	 * Supplier classification 7 search target 発注先分類７検索対象.<p>
	 *
	 */
	public boolean sppl_grp_flg7() {
		return getConstBoolean(offset + 146, $sppl_grp_flg7);
	}

	/**
	 * Supplier classification 7 search target 発注先分類７検索対象.<p>
	 *
	 */
	public void sppl_grp_flg7(boolean value) {
		setConstBoolean(offset + 146, $sppl_grp_flg7, value);
	}


	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public String sppl_grp_cd7() {
		return getConstString(offset + 147, $sppl_grp_cd7);
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public void sppl_grp_cd7(String value) {
		setConstString(offset + 147, $sppl_grp_cd7, value);
	}


	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public String sppl_grp_nm7() {
		return getConstString(offset + 148, $sppl_grp_nm7);
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public void sppl_grp_nm7(String value) {
		setConstString(offset + 148, $sppl_grp_nm7, value);
	}


	/**
	 * Supplier classification 8 search target 発注先分類８検索対象.<p>
	 *
	 */
	public boolean sppl_grp_flg8() {
		return getConstBoolean(offset + 149, $sppl_grp_flg8);
	}

	/**
	 * Supplier classification 8 search target 発注先分類８検索対象.<p>
	 *
	 */
	public void sppl_grp_flg8(boolean value) {
		setConstBoolean(offset + 149, $sppl_grp_flg8, value);
	}


	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public String sppl_grp_cd8() {
		return getConstString(offset + 150, $sppl_grp_cd8);
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public void sppl_grp_cd8(String value) {
		setConstString(offset + 150, $sppl_grp_cd8, value);
	}


	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public String sppl_grp_nm8() {
		return getConstString(offset + 151, $sppl_grp_nm8);
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public void sppl_grp_nm8(String value) {
		setConstString(offset + 151, $sppl_grp_nm8, value);
	}


	/**
	 * Supplier classification 9 search target 発注先分類９検索対象.<p>
	 *
	 */
	public boolean sppl_grp_flg9() {
		return getConstBoolean(offset + 152, $sppl_grp_flg9);
	}

	/**
	 * Supplier classification 9 search target 発注先分類９検索対象.<p>
	 *
	 */
	public void sppl_grp_flg9(boolean value) {
		setConstBoolean(offset + 152, $sppl_grp_flg9, value);
	}


	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public String sppl_grp_cd9() {
		return getConstString(offset + 153, $sppl_grp_cd9);
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public void sppl_grp_cd9(String value) {
		setConstString(offset + 153, $sppl_grp_cd9, value);
	}


	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public String sppl_grp_nm9() {
		return getConstString(offset + 154, $sppl_grp_nm9);
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public void sppl_grp_nm9(String value) {
		setConstString(offset + 154, $sppl_grp_nm9, value);
	}


	/**
	 * Supplier classification 10 search target 発注先分類１０検索対象.<p>
	 *
	 */
	public boolean sppl_grp_flg10() {
		return getConstBoolean(offset + 155, $sppl_grp_flg10);
	}

	/**
	 * Supplier classification 10 search target 発注先分類１０検索対象.<p>
	 *
	 */
	public void sppl_grp_flg10(boolean value) {
		setConstBoolean(offset + 155, $sppl_grp_flg10, value);
	}


	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public String sppl_grp_cd10() {
		return getConstString(offset + 156, $sppl_grp_cd10);
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public void sppl_grp_cd10(String value) {
		setConstString(offset + 156, $sppl_grp_cd10, value);
	}


	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public String sppl_grp_nm10() {
		return getConstString(offset + 157, $sppl_grp_nm10);
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public void sppl_grp_nm10(String value) {
		setConstString(offset + 157, $sppl_grp_nm10, value);
	}


	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public boolean itm_grp_flg1() {
		return getConstBoolean(offset + 158, $itm_grp_flg1);
	}

	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public void itm_grp_flg1(boolean value) {
		setConstBoolean(offset + 158, $itm_grp_flg1, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 159, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 159, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 160, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 160, $itm_grp_nm1, value);
	}


	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public boolean itm_grp_flg2() {
		return getConstBoolean(offset + 161, $itm_grp_flg2);
	}

	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public void itm_grp_flg2(boolean value) {
		setConstBoolean(offset + 161, $itm_grp_flg2, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 162, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 162, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 163, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 163, $itm_grp_nm2, value);
	}


	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public boolean itm_grp_flg3() {
		return getConstBoolean(offset + 164, $itm_grp_flg3);
	}

	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public void itm_grp_flg3(boolean value) {
		setConstBoolean(offset + 164, $itm_grp_flg3, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 165, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 165, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 166, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 166, $itm_grp_nm3, value);
	}


	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public boolean itm_grp_flg4() {
		return getConstBoolean(offset + 167, $itm_grp_flg4);
	}

	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public void itm_grp_flg4(boolean value) {
		setConstBoolean(offset + 167, $itm_grp_flg4, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 168, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 168, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 169, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 169, $itm_grp_nm4, value);
	}


	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public boolean itm_grp_flg5() {
		return getConstBoolean(offset + 170, $itm_grp_flg5);
	}

	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public void itm_grp_flg5(boolean value) {
		setConstBoolean(offset + 170, $itm_grp_flg5, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 171, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 171, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 172, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 172, $itm_grp_nm5, value);
	}


	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public boolean itm_grp_flg6() {
		return getConstBoolean(offset + 173, $itm_grp_flg6);
	}

	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public void itm_grp_flg6(boolean value) {
		setConstBoolean(offset + 173, $itm_grp_flg6, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 174, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 174, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 175, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 175, $itm_grp_nm6, value);
	}


	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public boolean itm_grp_flg7() {
		return getConstBoolean(offset + 176, $itm_grp_flg7);
	}

	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public void itm_grp_flg7(boolean value) {
		setConstBoolean(offset + 176, $itm_grp_flg7, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 177, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 177, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 178, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 178, $itm_grp_nm7, value);
	}


	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public boolean itm_grp_flg8() {
		return getConstBoolean(offset + 179, $itm_grp_flg8);
	}

	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public void itm_grp_flg8(boolean value) {
		setConstBoolean(offset + 179, $itm_grp_flg8, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 180, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 180, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 181, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 181, $itm_grp_nm8, value);
	}


	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public boolean itm_grp_flg9() {
		return getConstBoolean(offset + 182, $itm_grp_flg9);
	}

	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public void itm_grp_flg9(boolean value) {
		setConstBoolean(offset + 182, $itm_grp_flg9, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 183, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 183, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 184, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 184, $itm_grp_nm9, value);
	}


	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public boolean itm_grp_flg10() {
		return getConstBoolean(offset + 185, $itm_grp_flg10);
	}

	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public void itm_grp_flg10(boolean value) {
		setConstBoolean(offset + 185, $itm_grp_flg10, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 186, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 186, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 187, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 187, $itm_grp_nm10, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_d_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($ap_d_no.equalsIgnoreCase(name)) {
			return ap_d_no();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			return pay_sts_typ();
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			return pay_mtd_typ();
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
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			return sppl_grp_cd1();
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			return sppl_grp_nm1();
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			return sppl_grp_cd2();
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			return sppl_grp_nm2();
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			return sppl_grp_cd3();
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			return sppl_grp_nm3();
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			return sppl_grp_cd4();
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			return sppl_grp_nm4();
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			return sppl_grp_cd5();
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			return sppl_grp_nm5();
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			return sppl_grp_cd6();
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			return sppl_grp_nm6();
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			return sppl_grp_cd7();
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			return sppl_grp_nm7();
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			return sppl_grp_cd8();
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			return sppl_grp_nm8();
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			return sppl_grp_cd9();
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			return sppl_grp_nm9();
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			return sppl_grp_cd10();
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			return sppl_grp_nm10();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($pass_days.equalsIgnoreCase(name)) {
			return pass_days();
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
		if ($bsppl_cl_dt_fr.equalsIgnoreCase(name)) {
			return bsppl_cl_dt_fr();
		}
		if ($bsppl_cl_dt_to.equalsIgnoreCase(name)) {
			return bsppl_cl_dt_to();
		}
		if ($act_dt_fr.equalsIgnoreCase(name)) {
			return act_dt_fr();
		}
		if ($act_dt_to.equalsIgnoreCase(name)) {
			return act_dt_to();
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			return ac_dt_fr();
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			return ac_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($unchk_flg.equalsIgnoreCase(name)) {
			return unchk_flg();
		}
		if ($chk_flg.equalsIgnoreCase(name)) {
			return chk_flg();
		}
		if ($upri_flg.equalsIgnoreCase(name)) {
			return upri_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($crryovr_flg.equalsIgnoreCase(name)) {
			return crryovr_flg();
		}
		if ($not_crryovr_flg.equalsIgnoreCase(name)) {
			return not_crryovr_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($not_pay_spot_flg.equalsIgnoreCase(name)) {
			return not_pay_spot_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($not_subcon_flg.equalsIgnoreCase(name)) {
			return not_subcon_flg();
		}
		if ($accrued_flg.equalsIgnoreCase(name)) {
			return accrued_flg();
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
		if ($sppl_grp_flg1.equalsIgnoreCase(name)) {
			return sppl_grp_flg1();
		}
		if ($sppl_grp_flg2.equalsIgnoreCase(name)) {
			return sppl_grp_flg2();
		}
		if ($sppl_grp_flg3.equalsIgnoreCase(name)) {
			return sppl_grp_flg3();
		}
		if ($sppl_grp_flg4.equalsIgnoreCase(name)) {
			return sppl_grp_flg4();
		}
		if ($sppl_grp_flg5.equalsIgnoreCase(name)) {
			return sppl_grp_flg5();
		}
		if ($sppl_grp_flg6.equalsIgnoreCase(name)) {
			return sppl_grp_flg6();
		}
		if ($sppl_grp_flg7.equalsIgnoreCase(name)) {
			return sppl_grp_flg7();
		}
		if ($sppl_grp_flg8.equalsIgnoreCase(name)) {
			return sppl_grp_flg8();
		}
		if ($sppl_grp_flg9.equalsIgnoreCase(name)) {
			return sppl_grp_flg9();
		}
		if ($sppl_grp_flg10.equalsIgnoreCase(name)) {
			return sppl_grp_flg10();
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			return itm_grp_flg1();
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			return itm_grp_flg2();
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			return itm_grp_flg3();
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			return itm_grp_flg4();
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			return itm_grp_flg5();
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			return itm_grp_flg6();
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			return itm_grp_flg7();
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			return itm_grp_flg8();
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			return itm_grp_flg9();
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			return itm_grp_flg10();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_d_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($ap_d_no.equalsIgnoreCase(name)) {
			return ap_d_no();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			return pay_sts_typ();
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			return pay_mtd_typ();
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
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			return sppl_grp_cd1();
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			return sppl_grp_nm1();
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			return sppl_grp_cd2();
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			return sppl_grp_nm2();
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			return sppl_grp_cd3();
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			return sppl_grp_nm3();
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			return sppl_grp_cd4();
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			return sppl_grp_nm4();
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			return sppl_grp_cd5();
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			return sppl_grp_nm5();
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			return sppl_grp_cd6();
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			return sppl_grp_nm6();
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			return sppl_grp_cd7();
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			return sppl_grp_nm7();
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			return sppl_grp_cd8();
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			return sppl_grp_nm8();
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			return sppl_grp_cd9();
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			return sppl_grp_nm9();
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			return sppl_grp_cd10();
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			return sppl_grp_nm10();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($pass_days.equalsIgnoreCase(name)) {
			return pass_days();
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
		if ($bsppl_cl_dt_fr.equalsIgnoreCase(name)) {
			return bsppl_cl_dt_fr();
		}
		if ($bsppl_cl_dt_to.equalsIgnoreCase(name)) {
			return bsppl_cl_dt_to();
		}
		if ($act_dt_fr.equalsIgnoreCase(name)) {
			return act_dt_fr();
		}
		if ($act_dt_to.equalsIgnoreCase(name)) {
			return act_dt_to();
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			return ac_dt_fr();
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			return ac_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($unchk_flg.equalsIgnoreCase(name)) {
			return unchk_flg();
		}
		if ($chk_flg.equalsIgnoreCase(name)) {
			return chk_flg();
		}
		if ($upri_flg.equalsIgnoreCase(name)) {
			return upri_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($crryovr_flg.equalsIgnoreCase(name)) {
			return crryovr_flg();
		}
		if ($not_crryovr_flg.equalsIgnoreCase(name)) {
			return not_crryovr_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($not_pay_spot_flg.equalsIgnoreCase(name)) {
			return not_pay_spot_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($not_subcon_flg.equalsIgnoreCase(name)) {
			return not_subcon_flg();
		}
		if ($accrued_flg.equalsIgnoreCase(name)) {
			return accrued_flg();
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
		if ($sppl_grp_flg1.equalsIgnoreCase(name)) {
			return sppl_grp_flg1();
		}
		if ($sppl_grp_flg2.equalsIgnoreCase(name)) {
			return sppl_grp_flg2();
		}
		if ($sppl_grp_flg3.equalsIgnoreCase(name)) {
			return sppl_grp_flg3();
		}
		if ($sppl_grp_flg4.equalsIgnoreCase(name)) {
			return sppl_grp_flg4();
		}
		if ($sppl_grp_flg5.equalsIgnoreCase(name)) {
			return sppl_grp_flg5();
		}
		if ($sppl_grp_flg6.equalsIgnoreCase(name)) {
			return sppl_grp_flg6();
		}
		if ($sppl_grp_flg7.equalsIgnoreCase(name)) {
			return sppl_grp_flg7();
		}
		if ($sppl_grp_flg8.equalsIgnoreCase(name)) {
			return sppl_grp_flg8();
		}
		if ($sppl_grp_flg9.equalsIgnoreCase(name)) {
			return sppl_grp_flg9();
		}
		if ($sppl_grp_flg10.equalsIgnoreCase(name)) {
			return sppl_grp_flg10();
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			return itm_grp_flg1();
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			return itm_grp_flg2();
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			return itm_grp_flg3();
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			return itm_grp_flg4();
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			return itm_grp_flg5();
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			return itm_grp_flg6();
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			return itm_grp_flg7();
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			return itm_grp_flg8();
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			return itm_grp_flg9();
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			return itm_grp_flg10();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
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
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_no(value);
			return;
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_d_no(value);
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
		if ($ap_d_no.equalsIgnoreCase(name)) {
			ap_d_no(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			pay_sts_typ(value);
			return;
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			pay_mtd_typ(value);
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
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			sppl_grp_cd1(value);
			return;
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			sppl_grp_nm1(value);
			return;
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			sppl_grp_cd2(value);
			return;
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			sppl_grp_nm2(value);
			return;
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			sppl_grp_cd3(value);
			return;
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			sppl_grp_nm3(value);
			return;
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			sppl_grp_cd4(value);
			return;
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			sppl_grp_nm4(value);
			return;
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			sppl_grp_cd5(value);
			return;
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			sppl_grp_nm5(value);
			return;
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			sppl_grp_cd6(value);
			return;
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			sppl_grp_nm6(value);
			return;
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			sppl_grp_cd7(value);
			return;
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			sppl_grp_nm7(value);
			return;
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			sppl_grp_cd8(value);
			return;
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			sppl_grp_nm8(value);
			return;
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			sppl_grp_cd9(value);
			return;
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			sppl_grp_nm9(value);
			return;
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			sppl_grp_cd10(value);
			return;
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			sppl_grp_nm10(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($pass_days.equalsIgnoreCase(name)) {
			pass_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pass_days.equalsIgnoreCase(name)) {
			pass_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pass_days.equalsIgnoreCase(name)) {
			pass_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pass_days.equalsIgnoreCase(name)) {
			pass_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pass_days.equalsIgnoreCase(name)) {
			pass_days(value);
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
		if ($bsppl_cl_dt_fr.equalsIgnoreCase(name)) {
			bsppl_cl_dt_fr(value);
			return;
		}
		if ($bsppl_cl_dt_to.equalsIgnoreCase(name)) {
			bsppl_cl_dt_to(value);
			return;
		}
		if ($act_dt_fr.equalsIgnoreCase(name)) {
			act_dt_fr(value);
			return;
		}
		if ($act_dt_to.equalsIgnoreCase(name)) {
			act_dt_to(value);
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
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($unchk_flg.equalsIgnoreCase(name)) {
			unchk_flg(value);
			return;
		}
		if ($chk_flg.equalsIgnoreCase(name)) {
			chk_flg(value);
			return;
		}
		if ($upri_flg.equalsIgnoreCase(name)) {
			upri_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($crryovr_flg.equalsIgnoreCase(name)) {
			crryovr_flg(value);
			return;
		}
		if ($not_crryovr_flg.equalsIgnoreCase(name)) {
			not_crryovr_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($not_pay_spot_flg.equalsIgnoreCase(name)) {
			not_pay_spot_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($not_subcon_flg.equalsIgnoreCase(name)) {
			not_subcon_flg(value);
			return;
		}
		if ($accrued_flg.equalsIgnoreCase(name)) {
			accrued_flg(value);
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
		if ($sppl_grp_flg1.equalsIgnoreCase(name)) {
			sppl_grp_flg1(value);
			return;
		}
		if ($sppl_grp_flg2.equalsIgnoreCase(name)) {
			sppl_grp_flg2(value);
			return;
		}
		if ($sppl_grp_flg3.equalsIgnoreCase(name)) {
			sppl_grp_flg3(value);
			return;
		}
		if ($sppl_grp_flg4.equalsIgnoreCase(name)) {
			sppl_grp_flg4(value);
			return;
		}
		if ($sppl_grp_flg5.equalsIgnoreCase(name)) {
			sppl_grp_flg5(value);
			return;
		}
		if ($sppl_grp_flg6.equalsIgnoreCase(name)) {
			sppl_grp_flg6(value);
			return;
		}
		if ($sppl_grp_flg7.equalsIgnoreCase(name)) {
			sppl_grp_flg7(value);
			return;
		}
		if ($sppl_grp_flg8.equalsIgnoreCase(name)) {
			sppl_grp_flg8(value);
			return;
		}
		if ($sppl_grp_flg9.equalsIgnoreCase(name)) {
			sppl_grp_flg9(value);
			return;
		}
		if ($sppl_grp_flg10.equalsIgnoreCase(name)) {
			sppl_grp_flg10(value);
			return;
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			itm_grp_flg1(value);
			return;
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			itm_grp_flg2(value);
			return;
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			itm_grp_flg3(value);
			return;
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			itm_grp_flg4(value);
			return;
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			itm_grp_flg5(value);
			return;
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			itm_grp_flg6(value);
			return;
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			itm_grp_flg7(value);
			return;
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			itm_grp_flg8(value);
			return;
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			itm_grp_flg9(value);
			return;
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			itm_grp_flg10(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
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
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_no(value);
			return;
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_d_no(value);
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
		if ($ap_d_no.equalsIgnoreCase(name)) {
			ap_d_no(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			pay_sts_typ(value);
			return;
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			pay_mtd_typ(value);
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
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			sppl_grp_cd1(value);
			return;
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			sppl_grp_nm1(value);
			return;
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			sppl_grp_cd2(value);
			return;
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			sppl_grp_nm2(value);
			return;
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			sppl_grp_cd3(value);
			return;
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			sppl_grp_nm3(value);
			return;
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			sppl_grp_cd4(value);
			return;
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			sppl_grp_nm4(value);
			return;
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			sppl_grp_cd5(value);
			return;
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			sppl_grp_nm5(value);
			return;
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			sppl_grp_cd6(value);
			return;
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			sppl_grp_nm6(value);
			return;
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			sppl_grp_cd7(value);
			return;
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			sppl_grp_nm7(value);
			return;
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			sppl_grp_cd8(value);
			return;
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			sppl_grp_nm8(value);
			return;
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			sppl_grp_cd9(value);
			return;
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			sppl_grp_nm9(value);
			return;
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			sppl_grp_cd10(value);
			return;
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			sppl_grp_nm10(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($pass_days.equalsIgnoreCase(name)) {
			pass_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pass_days.equalsIgnoreCase(name)) {
			pass_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pass_days.equalsIgnoreCase(name)) {
			pass_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pass_days.equalsIgnoreCase(name)) {
			pass_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pass_days.equalsIgnoreCase(name)) {
			pass_days(value);
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
		if ($bsppl_cl_dt_fr.equalsIgnoreCase(name)) {
			bsppl_cl_dt_fr(value);
			return;
		}
		if ($bsppl_cl_dt_to.equalsIgnoreCase(name)) {
			bsppl_cl_dt_to(value);
			return;
		}
		if ($act_dt_fr.equalsIgnoreCase(name)) {
			act_dt_fr(value);
			return;
		}
		if ($act_dt_to.equalsIgnoreCase(name)) {
			act_dt_to(value);
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
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($unchk_flg.equalsIgnoreCase(name)) {
			unchk_flg(value);
			return;
		}
		if ($chk_flg.equalsIgnoreCase(name)) {
			chk_flg(value);
			return;
		}
		if ($upri_flg.equalsIgnoreCase(name)) {
			upri_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($crryovr_flg.equalsIgnoreCase(name)) {
			crryovr_flg(value);
			return;
		}
		if ($not_crryovr_flg.equalsIgnoreCase(name)) {
			not_crryovr_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($not_pay_spot_flg.equalsIgnoreCase(name)) {
			not_pay_spot_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($not_subcon_flg.equalsIgnoreCase(name)) {
			not_subcon_flg(value);
			return;
		}
		if ($accrued_flg.equalsIgnoreCase(name)) {
			accrued_flg(value);
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
		if ($sppl_grp_flg1.equalsIgnoreCase(name)) {
			sppl_grp_flg1(value);
			return;
		}
		if ($sppl_grp_flg2.equalsIgnoreCase(name)) {
			sppl_grp_flg2(value);
			return;
		}
		if ($sppl_grp_flg3.equalsIgnoreCase(name)) {
			sppl_grp_flg3(value);
			return;
		}
		if ($sppl_grp_flg4.equalsIgnoreCase(name)) {
			sppl_grp_flg4(value);
			return;
		}
		if ($sppl_grp_flg5.equalsIgnoreCase(name)) {
			sppl_grp_flg5(value);
			return;
		}
		if ($sppl_grp_flg6.equalsIgnoreCase(name)) {
			sppl_grp_flg6(value);
			return;
		}
		if ($sppl_grp_flg7.equalsIgnoreCase(name)) {
			sppl_grp_flg7(value);
			return;
		}
		if ($sppl_grp_flg8.equalsIgnoreCase(name)) {
			sppl_grp_flg8(value);
			return;
		}
		if ($sppl_grp_flg9.equalsIgnoreCase(name)) {
			sppl_grp_flg9(value);
			return;
		}
		if ($sppl_grp_flg10.equalsIgnoreCase(name)) {
			sppl_grp_flg10(value);
			return;
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			itm_grp_flg1(value);
			return;
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			itm_grp_flg2(value);
			return;
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			itm_grp_flg3(value);
			return;
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			itm_grp_flg4(value);
			return;
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			itm_grp_flg5(value);
			return;
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			itm_grp_flg6(value);
			return;
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			itm_grp_flg7(value);
			return;
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			itm_grp_flg8(value);
			return;
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			itm_grp_flg9(value);
			return;
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			itm_grp_flg10(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

