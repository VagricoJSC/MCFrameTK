package mcframe.clientMSBH.MSBHP0010;

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
	 * PAY,View (to be paid),PA;AP,View (accounts payable),AP; PAY,参照する（支払対象）,PAY;AP,参照する（買掛）,AP;.<p>
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
	public static final String $itm_typ_p = "itm_typ_p";
	public static final String $itm_p = "itm_p";
	public static final String $sno_p = "sno_p";
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
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public static final String $pay_sts_typ = "pay_sts_typ";
	/**
	 * Payment status type name 支払状況区分名.<p>
	 *
	 */
	public static final String $pay_sts_typ_nm = "pay_sts_typ_nm";
	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public static final String $pay_mtd_typ = "pay_mtd_typ";
	/**
	 * Payment method type name 支払方式区分名.<p>
	 *
	 */
	public static final String $pay_mtd_typ_nm = "pay_mtd_typ_nm";
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public static final String $pay_chk_no = "pay_chk_no";
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
	public static final String $bsppl_grp_p = "bsppl_grp_p";
	public static final String $asppl_grp_p = "asppl_grp_p";
	public static final String $sppl_grp_p = "sppl_grp_p";
	public static final String $itm_grp_p = "itm_grp_p";

	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_nm = $itm_typ_p + ".itm_typ_nm";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4 = $sno_p + ".sno4";
	public static final String $wrk_no = $sno_p + ".wrk_no";
	public static final String $wrk_nm = $sno_p + ".wrk_nm";
	public static final String $bsppl_grp_lab1 = $bsppl_grp_p + ".bp_grp_lab1";
	public static final String $bsppl_grp_flg1 = $bsppl_grp_p + ".bp_grp_flg1";
	public static final String $bsppl_grp_cd1 = $bsppl_grp_p + ".bp_grp_cd1";
	public static final String $bsppl_grp_nm1 = $bsppl_grp_p + ".bp_grp_nm1";
	public static final String $bsppl_grp_lab2 = $bsppl_grp_p + ".bp_grp_lab2";
	public static final String $bsppl_grp_flg2 = $bsppl_grp_p + ".bp_grp_flg2";
	public static final String $bsppl_grp_cd2 = $bsppl_grp_p + ".bp_grp_cd2";
	public static final String $bsppl_grp_nm2 = $bsppl_grp_p + ".bp_grp_nm2";
	public static final String $bsppl_grp_lab3 = $bsppl_grp_p + ".bp_grp_lab3";
	public static final String $bsppl_grp_flg3 = $bsppl_grp_p + ".bp_grp_flg3";
	public static final String $bsppl_grp_cd3 = $bsppl_grp_p + ".bp_grp_cd3";
	public static final String $bsppl_grp_nm3 = $bsppl_grp_p + ".bp_grp_nm3";
	public static final String $bsppl_grp_lab4 = $bsppl_grp_p + ".bp_grp_lab4";
	public static final String $bsppl_grp_flg4 = $bsppl_grp_p + ".bp_grp_flg4";
	public static final String $bsppl_grp_cd4 = $bsppl_grp_p + ".bp_grp_cd4";
	public static final String $bsppl_grp_nm4 = $bsppl_grp_p + ".bp_grp_nm4";
	public static final String $bsppl_grp_lab5 = $bsppl_grp_p + ".bp_grp_lab5";
	public static final String $bsppl_grp_flg5 = $bsppl_grp_p + ".bp_grp_flg5";
	public static final String $bsppl_grp_cd5 = $bsppl_grp_p + ".bp_grp_cd5";
	public static final String $bsppl_grp_nm5 = $bsppl_grp_p + ".bp_grp_nm5";
	public static final String $bsppl_grp_lab6 = $bsppl_grp_p + ".bp_grp_lab6";
	public static final String $bsppl_grp_flg6 = $bsppl_grp_p + ".bp_grp_flg6";
	public static final String $bsppl_grp_cd6 = $bsppl_grp_p + ".bp_grp_cd6";
	public static final String $bsppl_grp_nm6 = $bsppl_grp_p + ".bp_grp_nm6";
	public static final String $bsppl_grp_lab7 = $bsppl_grp_p + ".bp_grp_lab7";
	public static final String $bsppl_grp_flg7 = $bsppl_grp_p + ".bp_grp_flg7";
	public static final String $bsppl_grp_cd7 = $bsppl_grp_p + ".bp_grp_cd7";
	public static final String $bsppl_grp_nm7 = $bsppl_grp_p + ".bp_grp_nm7";
	public static final String $bsppl_grp_lab8 = $bsppl_grp_p + ".bp_grp_lab8";
	public static final String $bsppl_grp_flg8 = $bsppl_grp_p + ".bp_grp_flg8";
	public static final String $bsppl_grp_cd8 = $bsppl_grp_p + ".bp_grp_cd8";
	public static final String $bsppl_grp_nm8 = $bsppl_grp_p + ".bp_grp_nm8";
	public static final String $bsppl_grp_lab9 = $bsppl_grp_p + ".bp_grp_lab9";
	public static final String $bsppl_grp_flg9 = $bsppl_grp_p + ".bp_grp_flg9";
	public static final String $bsppl_grp_cd9 = $bsppl_grp_p + ".bp_grp_cd9";
	public static final String $bsppl_grp_nm9 = $bsppl_grp_p + ".bp_grp_nm9";
	public static final String $bsppl_grp_lab10 = $bsppl_grp_p + ".bp_grp_lab10";
	public static final String $bsppl_grp_flg10 = $bsppl_grp_p + ".bp_grp_flg10";
	public static final String $bsppl_grp_cd10 = $bsppl_grp_p + ".bp_grp_cd10";
	public static final String $bsppl_grp_nm10 = $bsppl_grp_p + ".bp_grp_nm10";
	public static final String $asppl_grp_lab1 = $asppl_grp_p + ".bp_grp_lab1";
	public static final String $asppl_grp_flg1 = $asppl_grp_p + ".bp_grp_flg1";
	public static final String $asppl_grp_cd1 = $asppl_grp_p + ".bp_grp_cd1";
	public static final String $asppl_grp_nm1 = $asppl_grp_p + ".bp_grp_nm1";
	public static final String $asppl_grp_lab2 = $asppl_grp_p + ".bp_grp_lab2";
	public static final String $asppl_grp_flg2 = $asppl_grp_p + ".bp_grp_flg2";
	public static final String $asppl_grp_cd2 = $asppl_grp_p + ".bp_grp_cd2";
	public static final String $asppl_grp_nm2 = $asppl_grp_p + ".bp_grp_nm2";
	public static final String $asppl_grp_lab3 = $asppl_grp_p + ".bp_grp_lab3";
	public static final String $asppl_grp_flg3 = $asppl_grp_p + ".bp_grp_flg3";
	public static final String $asppl_grp_cd3 = $asppl_grp_p + ".bp_grp_cd3";
	public static final String $asppl_grp_nm3 = $asppl_grp_p + ".bp_grp_nm3";
	public static final String $asppl_grp_lab4 = $asppl_grp_p + ".bp_grp_lab4";
	public static final String $asppl_grp_flg4 = $asppl_grp_p + ".bp_grp_flg4";
	public static final String $asppl_grp_cd4 = $asppl_grp_p + ".bp_grp_cd4";
	public static final String $asppl_grp_nm4 = $asppl_grp_p + ".bp_grp_nm4";
	public static final String $asppl_grp_lab5 = $asppl_grp_p + ".bp_grp_lab5";
	public static final String $asppl_grp_flg5 = $asppl_grp_p + ".bp_grp_flg5";
	public static final String $asppl_grp_cd5 = $asppl_grp_p + ".bp_grp_cd5";
	public static final String $asppl_grp_nm5 = $asppl_grp_p + ".bp_grp_nm5";
	public static final String $asppl_grp_lab6 = $asppl_grp_p + ".bp_grp_lab6";
	public static final String $asppl_grp_flg6 = $asppl_grp_p + ".bp_grp_flg6";
	public static final String $asppl_grp_cd6 = $asppl_grp_p + ".bp_grp_cd6";
	public static final String $asppl_grp_nm6 = $asppl_grp_p + ".bp_grp_nm6";
	public static final String $asppl_grp_lab7 = $asppl_grp_p + ".bp_grp_lab7";
	public static final String $asppl_grp_flg7 = $asppl_grp_p + ".bp_grp_flg7";
	public static final String $asppl_grp_cd7 = $asppl_grp_p + ".bp_grp_cd7";
	public static final String $asppl_grp_nm7 = $asppl_grp_p + ".bp_grp_nm7";
	public static final String $asppl_grp_lab8 = $asppl_grp_p + ".bp_grp_lab8";
	public static final String $asppl_grp_flg8 = $asppl_grp_p + ".bp_grp_flg8";
	public static final String $asppl_grp_cd8 = $asppl_grp_p + ".bp_grp_cd8";
	public static final String $asppl_grp_nm8 = $asppl_grp_p + ".bp_grp_nm8";
	public static final String $asppl_grp_lab9 = $asppl_grp_p + ".bp_grp_lab9";
	public static final String $asppl_grp_flg9 = $asppl_grp_p + ".bp_grp_flg9";
	public static final String $asppl_grp_cd9 = $asppl_grp_p + ".bp_grp_cd9";
	public static final String $asppl_grp_nm9 = $asppl_grp_p + ".bp_grp_nm9";
	public static final String $asppl_grp_lab10 = $asppl_grp_p + ".bp_grp_lab10";
	public static final String $asppl_grp_flg10 = $asppl_grp_p + ".bp_grp_flg10";
	public static final String $asppl_grp_cd10 = $asppl_grp_p + ".bp_grp_cd10";
	public static final String $asppl_grp_nm10 = $asppl_grp_p + ".bp_grp_nm10";
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
	public static final String $itm_grp_flg1 = $itm_grp_p + ".itm_grp_flg1";
	public static final String $itm_grp_cd1 = $itm_grp_p + ".itm_grp_cd1";
	public static final String $itm_grp_nm1 = $itm_grp_p + ".itm_grp_nm1";
	public static final String $itm_grp_flg2 = $itm_grp_p + ".itm_grp_flg2";
	public static final String $itm_grp_cd2 = $itm_grp_p + ".itm_grp_cd2";
	public static final String $itm_grp_nm2 = $itm_grp_p + ".itm_grp_nm2";
	public static final String $itm_grp_flg3 = $itm_grp_p + ".itm_grp_flg3";
	public static final String $itm_grp_cd3 = $itm_grp_p + ".itm_grp_cd3";
	public static final String $itm_grp_nm3 = $itm_grp_p + ".itm_grp_nm3";
	public static final String $itm_grp_flg4 = $itm_grp_p + ".itm_grp_flg4";
	public static final String $itm_grp_cd4 = $itm_grp_p + ".itm_grp_cd4";
	public static final String $itm_grp_nm4 = $itm_grp_p + ".itm_grp_nm4";
	public static final String $itm_grp_flg5 = $itm_grp_p + ".itm_grp_flg5";
	public static final String $itm_grp_cd5 = $itm_grp_p + ".itm_grp_cd5";
	public static final String $itm_grp_nm5 = $itm_grp_p + ".itm_grp_nm5";
	public static final String $itm_grp_flg6 = $itm_grp_p + ".itm_grp_flg6";
	public static final String $itm_grp_cd6 = $itm_grp_p + ".itm_grp_cd6";
	public static final String $itm_grp_nm6 = $itm_grp_p + ".itm_grp_nm6";
	public static final String $itm_grp_flg7 = $itm_grp_p + ".itm_grp_flg7";
	public static final String $itm_grp_cd7 = $itm_grp_p + ".itm_grp_cd7";
	public static final String $itm_grp_nm7 = $itm_grp_p + ".itm_grp_nm7";
	public static final String $itm_grp_flg8 = $itm_grp_p + ".itm_grp_flg8";
	public static final String $itm_grp_cd8 = $itm_grp_p + ".itm_grp_cd8";
	public static final String $itm_grp_nm8 = $itm_grp_p + ".itm_grp_nm8";
	public static final String $itm_grp_flg9 = $itm_grp_p + ".itm_grp_flg9";
	public static final String $itm_grp_cd9 = $itm_grp_p + ".itm_grp_cd9";
	public static final String $itm_grp_nm9 = $itm_grp_p + ".itm_grp_nm9";
	public static final String $itm_grp_flg10 = $itm_grp_p + ".itm_grp_flg10";
	public static final String $itm_grp_cd10 = $itm_grp_p + ".itm_grp_cd10";
	public static final String $itm_grp_nm10 = $itm_grp_p + ".itm_grp_nm10";

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
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class);
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
	public static final MCMeta pay_sts_typ_META = createCommonMeta($pay_sts_typ, mcframe.commonMS.meta.MS_META.PAY_STS_TYP);
	public static final MCMeta pay_sts_typ_nm_META = createCommonMeta($pay_sts_typ_nm, mcframe.commonMS.meta.MS_META.PAY_STS_TYP_NM);
	public static final MCMeta pay_mtd_typ_META = createCommonMeta($pay_mtd_typ, mcframe.commonMS.meta.MS_META.PAY_MTD_TYP);
	public static final MCMeta pay_mtd_typ_nm_META = createCommonMeta($pay_mtd_typ_nm, mcframe.commonMS.meta.MS_META.PAY_MTD_TYP_NM);
	public static final MCMeta pay_chk_no_META = createCommonMeta($pay_chk_no, mcframe.commonMA.meta.MA_META.PAY_CHK_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta bp_dlv_slip_no_META = createCommonMeta($bp_dlv_slip_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_NO);
	public static final MCMeta bp_dlv_slip_d_no_META = createCommonMeta($bp_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_D_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta ap_d_no_META = createCommonMeta($ap_d_no, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta pay_schd_d_print_rmrks_META = createCommonMeta($pay_schd_d_print_rmrks, mcframe.commonMS.meta.MS_META.PAY_SCHD_D_PRINT_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.AP_D_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.AP_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.AP_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.AP_D_SUB_CHAR3);
	public static final MCMeta accrued_flg_META = createCommonMeta($accrued_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_grp_p_META = createInnerRowMeta($bsppl_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta asppl_grp_p_META = createInnerRowMeta($asppl_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta sppl_grp_p_META = createInnerRowMeta($sppl_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
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
			itm_typ_p_META,
			itm_p_META,
			sno_p_META,
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
			pay_sts_typ_META,
			pay_sts_typ_nm_META,
			pay_mtd_typ_META,
			pay_mtd_typ_nm_META,
			pay_chk_no_META,
			po_no_META,
			po_d_no_META,
			purc_act_no_META,
			purc_act_d_no_META,
			bp_dlv_slip_no_META,
			bp_dlv_slip_d_no_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			ap_d_no_META,
			pay_schd_d_print_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			accrued_flg_META,
			bsppl_grp_p_META,
			asppl_grp_p_META,
			sppl_grp_p_META,
			itm_grp_p_META
		},
		new String[][]{
			{
				"itm_typ",
				"itm_typ_nm",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"bsppl_grp_flg1",
				"bsppl_grp_cd1",
				"bsppl_grp_nm1",
				"bsppl_grp_flg2",
				"bsppl_grp_cd2",
				"bsppl_grp_nm2",
				"bsppl_grp_flg3",
				"bsppl_grp_cd3",
				"bsppl_grp_nm3",
				"bsppl_grp_flg4",
				"bsppl_grp_cd4",
				"bsppl_grp_nm4",
				"bsppl_grp_flg5",
				"bsppl_grp_cd5",
				"bsppl_grp_nm5",
				"bsppl_grp_flg6",
				"bsppl_grp_cd6",
				"bsppl_grp_nm6",
				"bsppl_grp_flg7",
				"bsppl_grp_cd7",
				"bsppl_grp_nm7",
				"bsppl_grp_flg8",
				"bsppl_grp_cd8",
				"bsppl_grp_nm8",
				"bsppl_grp_flg9",
				"bsppl_grp_cd9",
				"bsppl_grp_nm9",
				"bsppl_grp_flg10",
				"bsppl_grp_cd10",
				"bsppl_grp_nm10",
				"asppl_grp_flg1",
				"asppl_grp_cd1",
				"asppl_grp_nm1",
				"asppl_grp_flg2",
				"asppl_grp_cd2",
				"asppl_grp_nm2",
				"asppl_grp_flg3",
				"asppl_grp_cd3",
				"asppl_grp_nm3",
				"asppl_grp_flg4",
				"asppl_grp_cd4",
				"asppl_grp_nm4",
				"asppl_grp_flg5",
				"asppl_grp_cd5",
				"asppl_grp_nm5",
				"asppl_grp_flg6",
				"asppl_grp_cd6",
				"asppl_grp_nm6",
				"asppl_grp_flg7",
				"asppl_grp_cd7",
				"asppl_grp_nm7",
				"asppl_grp_flg8",
				"asppl_grp_cd8",
				"asppl_grp_nm8",
				"asppl_grp_flg9",
				"asppl_grp_cd9",
				"asppl_grp_nm9",
				"asppl_grp_flg10",
				"asppl_grp_cd10",
				"asppl_grp_nm10",
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
				$itm_typ_nm,
				$itm_typ_d_cd,
				$itm_typ_d_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$bsppl_grp_flg1,
				$bsppl_grp_cd1,
				$bsppl_grp_nm1,
				$bsppl_grp_flg2,
				$bsppl_grp_cd2,
				$bsppl_grp_nm2,
				$bsppl_grp_flg3,
				$bsppl_grp_cd3,
				$bsppl_grp_nm3,
				$bsppl_grp_flg4,
				$bsppl_grp_cd4,
				$bsppl_grp_nm4,
				$bsppl_grp_flg5,
				$bsppl_grp_cd5,
				$bsppl_grp_nm5,
				$bsppl_grp_flg6,
				$bsppl_grp_cd6,
				$bsppl_grp_nm6,
				$bsppl_grp_flg7,
				$bsppl_grp_cd7,
				$bsppl_grp_nm7,
				$bsppl_grp_flg8,
				$bsppl_grp_cd8,
				$bsppl_grp_nm8,
				$bsppl_grp_flg9,
				$bsppl_grp_cd9,
				$bsppl_grp_nm9,
				$bsppl_grp_flg10,
				$bsppl_grp_cd10,
				$bsppl_grp_nm10,
				$asppl_grp_flg1,
				$asppl_grp_cd1,
				$asppl_grp_nm1,
				$asppl_grp_flg2,
				$asppl_grp_cd2,
				$asppl_grp_nm2,
				$asppl_grp_flg3,
				$asppl_grp_cd3,
				$asppl_grp_nm3,
				$asppl_grp_flg4,
				$asppl_grp_cd4,
				$asppl_grp_nm4,
				$asppl_grp_flg5,
				$asppl_grp_cd5,
				$asppl_grp_nm5,
				$asppl_grp_flg6,
				$asppl_grp_cd6,
				$asppl_grp_nm6,
				$asppl_grp_flg7,
				$asppl_grp_cd7,
				$asppl_grp_nm7,
				$asppl_grp_flg8,
				$asppl_grp_cd8,
				$asppl_grp_nm8,
				$asppl_grp_flg9,
				$asppl_grp_cd9,
				$asppl_grp_nm9,
				$asppl_grp_flg10,
				$asppl_grp_cd10,
				$asppl_grp_nm10,
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
				{$bsppl_cd, "bp_nm"},	// bsppl_cd
				{$asppl_cd, "bp_nm"},	// asppl_cd
				{$sppl_cd, "bp_nm"},	// sppl_cd
				{$bsppl_dpt_cd, "dpt_nm"},	// bsppl_dpt_cd
				{$ap_dpt_cd, "dpt_nm"},	// ap_dpt_cd
				{$trd_cur_cd, "cur_nm"},	// trd_cur_cd
				{$pay_sts_typ, "pay_sts_typ_nm"},	// pay_sts_typ
				{$pay_mtd_typ, "pay_mtd_typ_nm"}	// pay_mtd_typ
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$bsppl_cd, "MAC_BP_IS_SRCH_TYP.BSPPL"},	// bsppl_cd
				{$asppl_cd, "MAC_BP_IS_SRCH_TYP.ASPPL"},	// asppl_cd
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// sppl_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;true"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;true"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2;true"},	// itm_p.itm_sub3
				{$bsppl_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.AP"},	// bsppl_dpt_cd
				{$ap_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.AP"}	// ap_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$bsppl_cd, "bp_is_srch_typ"},	// bsppl_cd
				{$asppl_cd, "bp_is_srch_typ"},	// asppl_cd
				{$sppl_cd, "bp_is_srch_typ"},	// sppl_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ;sundry_itm_nm_rem_flg"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub3
				{$bsppl_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"},	// bsppl_dpt_cd
				{$ap_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"}	// ap_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
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
	 * PAY,View (to be paid),PA;AP,View (accounts payable),AP; PAY,参照する（支払対象）,PAY;AP,参照する（買掛）,AP;.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * PAY,View (to be paid),PA;AP,View (accounts payable),AP; PAY,参照する（支払対象）,PAY;AP,参照する（買掛）,AP;.<p>
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


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 26, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 26, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 27, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 27, $itm_p, row);
	}


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR sno_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 28, $sno_p);
	}
	
	public void sno_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 28, $sno_p, row);
	}


	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 29, $bsppl_dpt_cd);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 29, $bsppl_dpt_cd, value);
	}


	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public String bsppl_dpt_nm() {
		return getConstString(offset + 30, $bsppl_dpt_nm);
	}

	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public void bsppl_dpt_nm(String value) {
		setConstString(offset + 30, $bsppl_dpt_nm, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 31, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 31, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 32, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 32, $ap_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 33, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 33, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 34, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 34, $wg_nm, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 35, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 35, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 36, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 36, $trd_nm, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 37, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 37, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 38, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 38, $trd_cur_nm, value);
	}


	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public String pay_sts_typ() {
		return getConstString(offset + 39, $pay_sts_typ);
	}

	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public void pay_sts_typ(String value) {
		setConstString(offset + 39, $pay_sts_typ, value);
	}


	/**
	 * Payment status type name 支払状況区分名.<p>
	 *
	 */
	public String pay_sts_typ_nm() {
		return getConstString(offset + 40, $pay_sts_typ_nm);
	}

	/**
	 * Payment status type name 支払状況区分名.<p>
	 *
	 */
	public void pay_sts_typ_nm(String value) {
		setConstString(offset + 40, $pay_sts_typ_nm, value);
	}


	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public String pay_mtd_typ() {
		return getConstString(offset + 41, $pay_mtd_typ);
	}

	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public void pay_mtd_typ(String value) {
		setConstString(offset + 41, $pay_mtd_typ, value);
	}


	/**
	 * Payment method type name 支払方式区分名.<p>
	 *
	 */
	public String pay_mtd_typ_nm() {
		return getConstString(offset + 42, $pay_mtd_typ_nm);
	}

	/**
	 * Payment method type name 支払方式区分名.<p>
	 *
	 */
	public void pay_mtd_typ_nm(String value) {
		setConstString(offset + 42, $pay_mtd_typ_nm, value);
	}


	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public String pay_chk_no() {
		return getConstString(offset + 43, $pay_chk_no);
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no(String value) {
		setConstString(offset + 43, $pay_chk_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 44, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 44, $po_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 45, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 45, $po_d_no, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 46, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 46, $purc_act_no, value);
	}


	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 47, $purc_act_d_no);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 47, $purc_act_d_no, value);
	}


	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return getConstString(offset + 48, $bp_dlv_slip_no);
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		setConstString(offset + 48, $bp_dlv_slip_no, value);
	}


	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_d_no() {
		return getConstString(offset + 49, $bp_dlv_slip_d_no);
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no(String value) {
		setConstString(offset + 49, $bp_dlv_slip_d_no, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 50, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 50, $rcpt_iv_no, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 51, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 51, $rcpt_iv_mng_no, value);
	}


	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public String ap_d_no() {
		return getConstString(offset + 52, $ap_d_no);
	}

	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public void ap_d_no(String value) {
		setConstString(offset + 52, $ap_d_no, value);
	}


	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public String pay_schd_d_print_rmrks() {
		return getConstString(offset + 53, $pay_schd_d_print_rmrks);
	}

	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public void pay_schd_d_print_rmrks(String value) {
		setConstString(offset + 53, $pay_schd_d_print_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 54, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 54, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 55, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 55, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 56, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 56, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 57, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 57, $sub_char3, value);
	}


	/**
	 * Include temporary AP 暫定買掛含む.<p>
	 *
	 */
	public boolean accrued_flg() {
		return getConstBoolean(offset + 58, $accrued_flg);
	}

	/**
	 * Include temporary AP 暫定買掛含む.<p>
	 *
	 */
	public void accrued_flg(boolean value) {
		setConstBoolean(offset + 58, $accrued_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR bsppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 59, $bsppl_grp_p);
	}
	
	public void bsppl_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 59, $bsppl_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR asppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 60, $asppl_grp_p);
	}
	
	public void asppl_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 60, $asppl_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR sppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 61, $sppl_grp_p);
	}
	
	public void sppl_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 61, $sppl_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 62, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 62, $itm_grp_p, row);
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
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			return pay_sts_typ();
		}
		if ($pay_sts_typ_nm.equalsIgnoreCase(name)) {
			return pay_sts_typ_nm();
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			return pay_mtd_typ();
		}
		if ($pay_mtd_typ_nm.equalsIgnoreCase(name)) {
			return pay_mtd_typ_nm();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
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
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			return pay_sts_typ();
		}
		if ($pay_sts_typ_nm.equalsIgnoreCase(name)) {
			return pay_sts_typ_nm();
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			return pay_mtd_typ();
		}
		if ($pay_mtd_typ_nm.equalsIgnoreCase(name)) {
			return pay_mtd_typ_nm();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
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
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			pay_sts_typ(value);
			return;
		}
		if ($pay_sts_typ_nm.equalsIgnoreCase(name)) {
			pay_sts_typ_nm(value);
			return;
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			pay_mtd_typ(value);
			return;
		}
		if ($pay_mtd_typ_nm.equalsIgnoreCase(name)) {
			pay_mtd_typ_nm(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
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
		if ($pay_sts_typ.equalsIgnoreCase(name)) {
			pay_sts_typ(value);
			return;
		}
		if ($pay_sts_typ_nm.equalsIgnoreCase(name)) {
			pay_sts_typ_nm(value);
			return;
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			pay_mtd_typ(value);
			return;
		}
		if ($pay_mtd_typ_nm.equalsIgnoreCase(name)) {
			pay_mtd_typ_nm(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
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
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($bsppl_grp_p.equalsIgnoreCase(name)) {
			return bsppl_grp_p();
		}
		if ($asppl_grp_p.equalsIgnoreCase(name)) {
			return asppl_grp_p();
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
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($bsppl_grp_p.equalsIgnoreCase(name)) {
			bsppl_grp_p(
				((MCContainerMeta) bsppl_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		if ($asppl_grp_p.equalsIgnoreCase(name)) {
			asppl_grp_p(
				((MCContainerMeta) asppl_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
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

	public String itm_typ_nm() {
		return itm_typ_p().itm_typ_nm();
	}

	public void itm_typ_nm(String value) {
		itm_typ_p().itm_typ_nm(value);
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
	 * Scheduled payee classification 1 支払予定管理先分類１.<p>
	 *
	 */
	public boolean bsppl_grp_flg1() {
		return bsppl_grp_p().bp_grp_flg1();
	}

	/**
	 * Scheduled payee classification 1 支払予定管理先分類１.<p>
	 *
	 */
	public void bsppl_grp_flg1(boolean value) {
		bsppl_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Scheduled payee classification cd. 1 支払予定管理先分類ＣＤ１.<p>
	 *
	 */
	public String bsppl_grp_cd1() {
		return bsppl_grp_p().bp_grp_cd1();
	}

	/**
	 * Scheduled payee classification cd. 1 支払予定管理先分類ＣＤ１.<p>
	 *
	 */
	public void bsppl_grp_cd1(String value) {
		bsppl_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Scheduled payee classification name 1 支払予定管理先分類名１.<p>
	 *
	 */
	public String bsppl_grp_nm1() {
		return bsppl_grp_p().bp_grp_nm1();
	}

	/**
	 * Scheduled payee classification name 1 支払予定管理先分類名１.<p>
	 *
	 */
	public void bsppl_grp_nm1(String value) {
		bsppl_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Scheduled payee classification 2 支払予定管理先分類２.<p>
	 *
	 */
	public boolean bsppl_grp_flg2() {
		return bsppl_grp_p().bp_grp_flg2();
	}

	/**
	 * Scheduled payee classification 2 支払予定管理先分類２.<p>
	 *
	 */
	public void bsppl_grp_flg2(boolean value) {
		bsppl_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Scheduled payee classification cd. 2 支払予定管理先分類ＣＤ２.<p>
	 *
	 */
	public String bsppl_grp_cd2() {
		return bsppl_grp_p().bp_grp_cd2();
	}

	/**
	 * Scheduled payee classification cd. 2 支払予定管理先分類ＣＤ２.<p>
	 *
	 */
	public void bsppl_grp_cd2(String value) {
		bsppl_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Scheduled payee classification name 2 支払予定管理先分類名２.<p>
	 *
	 */
	public String bsppl_grp_nm2() {
		return bsppl_grp_p().bp_grp_nm2();
	}

	/**
	 * Scheduled payee classification name 2 支払予定管理先分類名２.<p>
	 *
	 */
	public void bsppl_grp_nm2(String value) {
		bsppl_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Scheduled payee classification 3 支払予定管理先分類３.<p>
	 *
	 */
	public boolean bsppl_grp_flg3() {
		return bsppl_grp_p().bp_grp_flg3();
	}

	/**
	 * Scheduled payee classification 3 支払予定管理先分類３.<p>
	 *
	 */
	public void bsppl_grp_flg3(boolean value) {
		bsppl_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Scheduled payee classification cd. 3 支払予定管理先分類ＣＤ３.<p>
	 *
	 */
	public String bsppl_grp_cd3() {
		return bsppl_grp_p().bp_grp_cd3();
	}

	/**
	 * Scheduled payee classification cd. 3 支払予定管理先分類ＣＤ３.<p>
	 *
	 */
	public void bsppl_grp_cd3(String value) {
		bsppl_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Scheduled payee classification name 3 支払予定管理先分類名３.<p>
	 *
	 */
	public String bsppl_grp_nm3() {
		return bsppl_grp_p().bp_grp_nm3();
	}

	/**
	 * Scheduled payee classification name 3 支払予定管理先分類名３.<p>
	 *
	 */
	public void bsppl_grp_nm3(String value) {
		bsppl_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Scheduled payee classification 4 支払予定管理先分類４.<p>
	 *
	 */
	public boolean bsppl_grp_flg4() {
		return bsppl_grp_p().bp_grp_flg4();
	}

	/**
	 * Scheduled payee classification 4 支払予定管理先分類４.<p>
	 *
	 */
	public void bsppl_grp_flg4(boolean value) {
		bsppl_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Scheduled payee classification cd. 4 支払予定管理先分類ＣＤ４.<p>
	 *
	 */
	public String bsppl_grp_cd4() {
		return bsppl_grp_p().bp_grp_cd4();
	}

	/**
	 * Scheduled payee classification cd. 4 支払予定管理先分類ＣＤ４.<p>
	 *
	 */
	public void bsppl_grp_cd4(String value) {
		bsppl_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Scheduled payee classification name 4 支払予定管理先分類名４.<p>
	 *
	 */
	public String bsppl_grp_nm4() {
		return bsppl_grp_p().bp_grp_nm4();
	}

	/**
	 * Scheduled payee classification name 4 支払予定管理先分類名４.<p>
	 *
	 */
	public void bsppl_grp_nm4(String value) {
		bsppl_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Scheduled payee classification 5 支払予定管理先分類５.<p>
	 *
	 */
	public boolean bsppl_grp_flg5() {
		return bsppl_grp_p().bp_grp_flg5();
	}

	/**
	 * Scheduled payee classification 5 支払予定管理先分類５.<p>
	 *
	 */
	public void bsppl_grp_flg5(boolean value) {
		bsppl_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Scheduled payee classification cd. 5 支払予定管理先分類ＣＤ５.<p>
	 *
	 */
	public String bsppl_grp_cd5() {
		return bsppl_grp_p().bp_grp_cd5();
	}

	/**
	 * Scheduled payee classification cd. 5 支払予定管理先分類ＣＤ５.<p>
	 *
	 */
	public void bsppl_grp_cd5(String value) {
		bsppl_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Scheduled payee classification name 5 支払予定管理先分類名５.<p>
	 *
	 */
	public String bsppl_grp_nm5() {
		return bsppl_grp_p().bp_grp_nm5();
	}

	/**
	 * Scheduled payee classification name 5 支払予定管理先分類名５.<p>
	 *
	 */
	public void bsppl_grp_nm5(String value) {
		bsppl_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Scheduled payee classification 6 支払予定管理先分類６.<p>
	 *
	 */
	public boolean bsppl_grp_flg6() {
		return bsppl_grp_p().bp_grp_flg6();
	}

	/**
	 * Scheduled payee classification 6 支払予定管理先分類６.<p>
	 *
	 */
	public void bsppl_grp_flg6(boolean value) {
		bsppl_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Scheduled payee classification cd. 6 支払予定管理先分類ＣＤ６.<p>
	 *
	 */
	public String bsppl_grp_cd6() {
		return bsppl_grp_p().bp_grp_cd6();
	}

	/**
	 * Scheduled payee classification cd. 6 支払予定管理先分類ＣＤ６.<p>
	 *
	 */
	public void bsppl_grp_cd6(String value) {
		bsppl_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Scheduled payee classification name 6 支払予定管理先分類名６.<p>
	 *
	 */
	public String bsppl_grp_nm6() {
		return bsppl_grp_p().bp_grp_nm6();
	}

	/**
	 * Scheduled payee classification name 6 支払予定管理先分類名６.<p>
	 *
	 */
	public void bsppl_grp_nm6(String value) {
		bsppl_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Scheduled payee classification 7 支払予定管理先分類７.<p>
	 *
	 */
	public boolean bsppl_grp_flg7() {
		return bsppl_grp_p().bp_grp_flg7();
	}

	/**
	 * Scheduled payee classification 7 支払予定管理先分類７.<p>
	 *
	 */
	public void bsppl_grp_flg7(boolean value) {
		bsppl_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Scheduled payee classification cd. 7 支払予定管理先分類ＣＤ７.<p>
	 *
	 */
	public String bsppl_grp_cd7() {
		return bsppl_grp_p().bp_grp_cd7();
	}

	/**
	 * Scheduled payee classification cd. 7 支払予定管理先分類ＣＤ７.<p>
	 *
	 */
	public void bsppl_grp_cd7(String value) {
		bsppl_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Scheduled payee classification name 7 支払予定管理先分類名７.<p>
	 *
	 */
	public String bsppl_grp_nm7() {
		return bsppl_grp_p().bp_grp_nm7();
	}

	/**
	 * Scheduled payee classification name 7 支払予定管理先分類名７.<p>
	 *
	 */
	public void bsppl_grp_nm7(String value) {
		bsppl_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Scheduled payee classification 8 支払予定管理先分類８.<p>
	 *
	 */
	public boolean bsppl_grp_flg8() {
		return bsppl_grp_p().bp_grp_flg8();
	}

	/**
	 * Scheduled payee classification 8 支払予定管理先分類８.<p>
	 *
	 */
	public void bsppl_grp_flg8(boolean value) {
		bsppl_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Scheduled payee classification cd. 8 支払予定管理先分類ＣＤ８.<p>
	 *
	 */
	public String bsppl_grp_cd8() {
		return bsppl_grp_p().bp_grp_cd8();
	}

	/**
	 * Scheduled payee classification cd. 8 支払予定管理先分類ＣＤ８.<p>
	 *
	 */
	public void bsppl_grp_cd8(String value) {
		bsppl_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Scheduled payee classification name 8 支払予定管理先分類名８.<p>
	 *
	 */
	public String bsppl_grp_nm8() {
		return bsppl_grp_p().bp_grp_nm8();
	}

	/**
	 * Scheduled payee classification name 8 支払予定管理先分類名８.<p>
	 *
	 */
	public void bsppl_grp_nm8(String value) {
		bsppl_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Scheduled payee classification 9 支払予定管理先分類９.<p>
	 *
	 */
	public boolean bsppl_grp_flg9() {
		return bsppl_grp_p().bp_grp_flg9();
	}

	/**
	 * Scheduled payee classification 9 支払予定管理先分類９.<p>
	 *
	 */
	public void bsppl_grp_flg9(boolean value) {
		bsppl_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Scheduled payee classification cd. 9 支払予定管理先分類ＣＤ９.<p>
	 *
	 */
	public String bsppl_grp_cd9() {
		return bsppl_grp_p().bp_grp_cd9();
	}

	/**
	 * Scheduled payee classification cd. 9 支払予定管理先分類ＣＤ９.<p>
	 *
	 */
	public void bsppl_grp_cd9(String value) {
		bsppl_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Scheduled payee classification name 9 支払予定管理先分類名９.<p>
	 *
	 */
	public String bsppl_grp_nm9() {
		return bsppl_grp_p().bp_grp_nm9();
	}

	/**
	 * Scheduled payee classification name 9 支払予定管理先分類名９.<p>
	 *
	 */
	public void bsppl_grp_nm9(String value) {
		bsppl_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Scheduled payee classification 10 支払予定管理先分類１０.<p>
	 *
	 */
	public boolean bsppl_grp_flg10() {
		return bsppl_grp_p().bp_grp_flg10();
	}

	/**
	 * Scheduled payee classification 10 支払予定管理先分類１０.<p>
	 *
	 */
	public void bsppl_grp_flg10(boolean value) {
		bsppl_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Scheduled payee classification cd. 10 支払予定管理先分類ＣＤ１０.<p>
	 *
	 */
	public String bsppl_grp_cd10() {
		return bsppl_grp_p().bp_grp_cd10();
	}

	/**
	 * Scheduled payee classification cd. 10 支払予定管理先分類ＣＤ１０.<p>
	 *
	 */
	public void bsppl_grp_cd10(String value) {
		bsppl_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Scheduled payee classification name 10 支払予定管理先分類名１０.<p>
	 *
	 */
	public String bsppl_grp_nm10() {
		return bsppl_grp_p().bp_grp_nm10();
	}

	/**
	 * Scheduled payee classification name 10 支払予定管理先分類名１０.<p>
	 *
	 */
	public void bsppl_grp_nm10(String value) {
		bsppl_grp_p().bp_grp_nm10(value);
	}

	/**
	 * AP supplier classification 1 買掛先分類１.<p>
	 *
	 */
	public boolean asppl_grp_flg1() {
		return asppl_grp_p().bp_grp_flg1();
	}

	/**
	 * AP supplier classification 1 買掛先分類１.<p>
	 *
	 */
	public void asppl_grp_flg1(boolean value) {
		asppl_grp_p().bp_grp_flg1(value);
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
	 * AP supplier classification 2 買掛先分類２.<p>
	 *
	 */
	public boolean asppl_grp_flg2() {
		return asppl_grp_p().bp_grp_flg2();
	}

	/**
	 * AP supplier classification 2 買掛先分類２.<p>
	 *
	 */
	public void asppl_grp_flg2(boolean value) {
		asppl_grp_p().bp_grp_flg2(value);
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
	 * AP supplier classification 3 買掛先分類３.<p>
	 *
	 */
	public boolean asppl_grp_flg3() {
		return asppl_grp_p().bp_grp_flg3();
	}

	/**
	 * AP supplier classification 3 買掛先分類３.<p>
	 *
	 */
	public void asppl_grp_flg3(boolean value) {
		asppl_grp_p().bp_grp_flg3(value);
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
	 * AP supplier classification 4 買掛先分類４.<p>
	 *
	 */
	public boolean asppl_grp_flg4() {
		return asppl_grp_p().bp_grp_flg4();
	}

	/**
	 * AP supplier classification 4 買掛先分類４.<p>
	 *
	 */
	public void asppl_grp_flg4(boolean value) {
		asppl_grp_p().bp_grp_flg4(value);
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
	 * AP supplier classification 5 買掛先分類５.<p>
	 *
	 */
	public boolean asppl_grp_flg5() {
		return asppl_grp_p().bp_grp_flg5();
	}

	/**
	 * AP supplier classification 5 買掛先分類５.<p>
	 *
	 */
	public void asppl_grp_flg5(boolean value) {
		asppl_grp_p().bp_grp_flg5(value);
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
	 * AP supplier classification 6 買掛先分類６.<p>
	 *
	 */
	public boolean asppl_grp_flg6() {
		return asppl_grp_p().bp_grp_flg6();
	}

	/**
	 * AP supplier classification 6 買掛先分類６.<p>
	 *
	 */
	public void asppl_grp_flg6(boolean value) {
		asppl_grp_p().bp_grp_flg6(value);
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
	 * AP supplier classification 7 買掛先分類７.<p>
	 *
	 */
	public boolean asppl_grp_flg7() {
		return asppl_grp_p().bp_grp_flg7();
	}

	/**
	 * AP supplier classification 7 買掛先分類７.<p>
	 *
	 */
	public void asppl_grp_flg7(boolean value) {
		asppl_grp_p().bp_grp_flg7(value);
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
	 * AP supplier classification 8 買掛先分類８.<p>
	 *
	 */
	public boolean asppl_grp_flg8() {
		return asppl_grp_p().bp_grp_flg8();
	}

	/**
	 * AP supplier classification 8 買掛先分類８.<p>
	 *
	 */
	public void asppl_grp_flg8(boolean value) {
		asppl_grp_p().bp_grp_flg8(value);
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
	 * AP supplier classification 9 買掛先分類９.<p>
	 *
	 */
	public boolean asppl_grp_flg9() {
		return asppl_grp_p().bp_grp_flg9();
	}

	/**
	 * AP supplier classification 9 買掛先分類９.<p>
	 *
	 */
	public void asppl_grp_flg9(boolean value) {
		asppl_grp_p().bp_grp_flg9(value);
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
	 * AP supplier classification 10 買掛先分類１０.<p>
	 *
	 */
	public boolean asppl_grp_flg10() {
		return asppl_grp_p().bp_grp_flg10();
	}

	/**
	 * AP supplier classification 10 買掛先分類１０.<p>
	 *
	 */
	public void asppl_grp_flg10(boolean value) {
		asppl_grp_p().bp_grp_flg10(value);
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

