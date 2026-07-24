package mcframe.serverMSBH.MSBHL0090;

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
 * ブロック"Srch01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_DtlR_MC_A extends MCConstRow {

	/**
	 * Reconcile 消込.<p>
	 *
	 */
	public static final String $check = "check";
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
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public static final String $ap_sttl_typ = "ap_sttl_typ";
	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public static final String $ap_sttl_typ_nm = "ap_sttl_typ_nm";
	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public static final String $pay_schd_dt = "pay_schd_dt";
	/**
	 * Payment schedule amount 支払予定額.<p>
	 *
	 */
	public static final String $pay_schd_amt = "pay_schd_amt";
	/**
	 * Payment schedule fee tax amount 支払予定手数料税額.<p>
	 *
	 */
	public static final String $pay_schd_com_paid_tax_amt = "pay_schd_com_paid_tax_amt";
	/**
	 * Total reconciled amount 消込累計額.<p>
	 *
	 */
	public static final String $appl_ttl_amt = "appl_ttl_amt";
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Fee cd. (Transaction currency) 取引通貨手数料税ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_cd = "trd_cur_com_paid_tax_cd";
	/**
	 * Fee tax name (Transaction currency) 取引通貨手数料税名.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_nm = "trd_cur_com_paid_tax_nm";
	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_rate = "trd_cur_com_paid_tax_rate";
	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_amt = "trd_cur_com_paid_tax_amt";
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
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public static final String $pay_bank_ac_cd = "pay_bank_ac_cd";
	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public static final String $pay_bank_ac_nm = "pay_bank_ac_nm";
	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public static final String $ap_setoff_typ = "ap_setoff_typ";
	/**
	 * AP offset destination name 債務相殺先区分名.<p>
	 *
	 */
	public static final String $ap_setoff_typ_nm = "ap_setoff_typ_nm";
	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public static final String $setoff_cd = "setoff_cd";
	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public static final String $setoff_nm = "setoff_nm";
	/**
	 * Offset destination name (Master) 相殺先名（マスタ）.<p>
	 *
	 */
	public static final String $setoff_nm_mst = "setoff_nm_mst";
	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public static final String $so_dpt_cd = "so_dpt_cd";
	/**
	 * Offset dept. name 相殺部門名.<p>
	 *
	 */
	public static final String $so_dpt_nm = "so_dpt_nm";
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public static final String $base_cur_com_paid_tax_amt = "base_cur_com_paid_tax_amt";
	/**
	 * Payment result details No. 支払実績明細ＮＯ.<p>
	 *
	 */
	public static final String $pay_act_d_no = "pay_act_d_no";
	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public static final String $pay_act_d_seq = "pay_act_d_seq";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public static final String $pay_chk_no = "pay_chk_no";
	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public static final String $pay_chk_mng_no = "pay_chk_mng_no";
	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public static final String $pay_schd_no = "pay_schd_no";
	/**
	 * AP reconciliation schedule No. 買掛消込予定ＮＯ.<p>
	 *
	 */
	public static final String $ap_appl_schd_no = "ap_appl_schd_no";
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
	 * Scheduled payee dept. cd. 支払予定管理先部門ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd = "bsppl_dpt_cd";
	/**
	 * Scheduled payee dept. name 支払予定管理先部門名.<p>
	 *
	 */
	public static final String $bsppl_dpt_nm = "bsppl_dpt_nm";
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
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
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
	 * AP settlement method cd. at schedule 予定時債務決済方法ＣＤ.<p>
	 *
	 */
	public static final String $schd_ap_sttl_cd = "schd_ap_sttl_cd";
	/**
	 * AP settlement method name at schedule 予定時債務決済方法名.<p>
	 *
	 */
	public static final String $schd_ap_sttl_nm = "schd_ap_sttl_nm";
	/**
	 * AP settlement type at schedule 予定時債務決済区分.<p>
	 *
	 */
	public static final String $schd_ap_sttl_typ = "schd_ap_sttl_typ";
	/**
	 * AP settlement type name at schedule 予定時債務決済区分名.<p>
	 *
	 */
	public static final String $schd_ap_sttl_typ_nm = "schd_ap_sttl_typ_nm";
	/**
	 * Transferred 振替済.<p>
	 *
	 */
	public static final String $sw_flg = "sw_flg";
	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public static final String $pay_ntc_d_print_rmrks = "pay_ntc_d_print_rmrks";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
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
	 * Payment collation header update counter 支払照合ヘッダ更新カウンタ.<p>
	 *
	 */
	public static final String $pay_chk_upd_cntr = "pay_chk_upd_cntr";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public static final String $note_no = "note_no";
	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public static final String $note_typ = "note_typ";
	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public static final String $note_typ_nm = "note_typ_nm";
	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public static final String $draw_dt = "draw_dt";
	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public static final String $note_days = "note_days";
	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public static final String $due_dt = "due_dt";
	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public static final String $drawer_nm = "drawer_nm";
	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public static final String $endrsr = "endrsr";
	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public static final String $accptr = "accptr";
	/**
	 * Drawing bank 振出銀行.<p>
	 *
	 */
	public static final String $draw_bank_cd = "draw_bank_cd";
	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public static final String $draw_bank_nm = "draw_bank_nm";
	/**
	 * Drawing branch 振出支店.<p>
	 *
	 */
	public static final String $draw_branch_cd = "draw_branch_cd";
	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public static final String $draw_branch_nm = "draw_branch_nm";
	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public static final String $note_rsn_cd = "note_rsn_cd";
	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public static final String $note_rsn_nm = "note_rsn_nm";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_sttl_cd_META = createCommonMeta($ap_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ap_sttl_nm_META = createCommonMeta($ap_sttl_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta ap_sttl_typ_META = createCommonMeta($ap_sttl_typ, mcframe.commonMA.meta.MA_META.AP_STTL_TYP);
	public static final MCMeta ap_sttl_typ_nm_META = createCommonMeta($ap_sttl_typ_nm, mcframe.commonMA.meta.MA_META.AP_STTL_TYP_NM);
	public static final MCMeta pay_schd_dt_META = createCommonMeta($pay_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt_META = createCommonMeta($pay_schd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_schd_com_paid_tax_amt_META = createCommonMeta($pay_schd_com_paid_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta appl_ttl_amt_META = createCommonMeta($appl_ttl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_com_paid_tax_cd_META = createCommonMeta($trd_cur_com_paid_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta trd_cur_com_paid_tax_nm_META = createCommonMeta($trd_cur_com_paid_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta trd_cur_com_paid_tax_rate_META = createCommonMeta($trd_cur_com_paid_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta trd_cur_com_paid_tax_amt_META = createCommonMeta($trd_cur_com_paid_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta bank_ac_nm_META = createCommonMeta($bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta pay_bank_ac_cd_META = createCommonMeta($pay_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta pay_bank_ac_nm_META = createCommonMeta($pay_bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta ap_setoff_typ_META = createCommonMeta($ap_setoff_typ, mcframe.commonMA.meta.MA_META.AP_SETOFF_TYP);
	public static final MCMeta ap_setoff_typ_nm_META = createCommonMeta($ap_setoff_typ_nm, mcframe.commonMA.meta.MA_META.AP_SETOFF_TYP_NM);
	public static final MCMeta setoff_cd_META = createCommonMeta($setoff_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta setoff_nm_META = createCommonMeta($setoff_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta setoff_nm_mst_META = createCommonMeta($setoff_nm_mst, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta so_dpt_cd_META = createCommonMeta($so_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta so_dpt_nm_META = createCommonMeta($so_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_com_paid_tax_amt_META = createCommonMeta($base_cur_com_paid_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_act_d_no_META = createCommonMeta($pay_act_d_no, mcframe.commonMA.meta.MA_META.PAY_ACT_D_NO);
	public static final MCMeta pay_act_d_seq_META = createCommonMeta($pay_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta pay_chk_no_META = createCommonMeta($pay_chk_no, mcframe.commonMA.meta.MA_META.PAY_CHK_NO);
	public static final MCMeta pay_chk_mng_no_META = createCommonMeta($pay_chk_mng_no, mcframe.commonMA.meta.MA_META.PAY_CHK_MNG_NO);
	public static final MCMeta pay_schd_no_META = createCommonMeta($pay_schd_no, mcframe.commonMA.meta.MA_META.PAY_SCHD_NO);
	public static final MCMeta ap_appl_schd_no_META = createCommonMeta($ap_appl_schd_no, mcframe.commonMA.meta.MA_META.AP_APPL_SCHD_NO);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_nm_META = createCommonMeta($bsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bsppl_dpt_nm_META = createCommonMeta($bsppl_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_nm_META = createCommonMeta($asppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ap_typ_META = createCommonMeta($ap_typ, mcframe.commonMA.meta.MA_META.AP_TYP);
	public static final MCMeta ap_typ_nm_META = createCommonMeta($ap_typ_nm, mcframe.commonMA.meta.MA_META.AP_TYP_NM);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta schd_ap_sttl_cd_META = createCommonMeta($schd_ap_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta schd_ap_sttl_nm_META = createCommonMeta($schd_ap_sttl_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta schd_ap_sttl_typ_META = createCommonMeta($schd_ap_sttl_typ, mcframe.commonMA.meta.MA_META.AP_STTL_TYP);
	public static final MCMeta schd_ap_sttl_typ_nm_META = createCommonMeta($schd_ap_sttl_typ_nm, mcframe.commonMA.meta.MA_META.AP_STTL_TYP_NM);
	public static final MCMeta sw_flg_META = createCommonMeta($sw_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_d_print_rmrks_META = createCommonMeta($pay_ntc_d_print_rmrks, mcframe.commonMS.meta.MS_META.PAY_NTC_D_PRINT_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_d_rmrks_META = createCommonMeta($intr_d_rmrks, mcframe.commonMS.meta.MS_META.PAY_ACT_D_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PAY_ACT_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PAY_ACT_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PAY_ACT_D_SUB_CHAR3);
	public static final MCMeta pay_chk_upd_cntr_META = createCommonMeta($pay_chk_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta note_no_META = createCommonMeta($note_no, mcframe.commonMA.meta.MA_META.NOTE_NO);
	public static final MCMeta note_typ_META = createCommonMeta($note_typ, mcframe.commonMA.meta.MA_META.NOTE_TYP);
	public static final MCMeta note_typ_nm_META = createCommonMeta($note_typ_nm, mcframe.commonMA.meta.MA_META.NOTE_TYP_NM);
	public static final MCMeta draw_dt_META = createCommonMeta($draw_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta note_days_META = createCommonMeta($note_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta due_dt_META = createCommonMeta($due_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta drawer_nm_META = createCommonMeta($drawer_nm, mcframe.commonMA.meta.MA_META.DRAWER_NM);
	public static final MCMeta endrsr_META = createCommonMeta($endrsr, mcframe.commonMA.meta.MA_META.NOTE_ENDRSR);
	public static final MCMeta accptr_META = createCommonMeta($accptr, mcframe.commonMA.meta.MA_META.NOTE_ACCPTR);
	public static final MCMeta draw_bank_cd_META = createCommonMeta($draw_bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta draw_bank_nm_META = createCommonMeta($draw_bank_nm, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta draw_branch_cd_META = createCommonMeta($draw_branch_cd, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta draw_branch_nm_META = createCommonMeta($draw_branch_nm, mcframe.commonMA.meta.MA_META.BANK_BRANCH_NM);
	public static final MCMeta note_rsn_cd_META = createCommonMeta($note_rsn_cd, mcframe.commonMA.meta.MA_META.NOTE_RSN_CD);
	public static final MCMeta note_rsn_nm_META = createCommonMeta($note_rsn_nm, mcframe.commonMA.meta.MA_META.NOTE_RSN_NM);

	protected static final ConstMetaList<Srch01_DtlR> constMetas = new ConstMetaList<Srch01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			ap_sttl_cd_META,
			ap_sttl_nm_META,
			ap_sttl_typ_META,
			ap_sttl_typ_nm_META,
			pay_schd_dt_META,
			pay_schd_amt_META,
			pay_schd_com_paid_tax_amt_META,
			appl_ttl_amt_META,
			trd_cur_amt_META,
			trd_cur_com_paid_tax_cd_META,
			trd_cur_com_paid_tax_nm_META,
			trd_cur_com_paid_tax_rate_META,
			trd_cur_com_paid_tax_amt_META,
			bank_ac_cd_META,
			bank_ac_nm_META,
			pay_bank_ac_cd_META,
			pay_bank_ac_nm_META,
			ap_setoff_typ_META,
			ap_setoff_typ_nm_META,
			setoff_cd_META,
			setoff_nm_META,
			setoff_nm_mst_META,
			so_dpt_cd_META,
			so_dpt_nm_META,
			base_cur_amt_META,
			base_cur_com_paid_tax_amt_META,
			pay_act_d_no_META,
			pay_act_d_seq_META,
			disp_seq_META,
			pay_chk_no_META,
			pay_chk_mng_no_META,
			pay_schd_no_META,
			ap_appl_schd_no_META,
			bsppl_cd_META,
			bsppl_nm_META,
			bsppl_dpt_cd_META,
			bsppl_dpt_nm_META,
			asppl_cd_META,
			asppl_nm_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			ap_typ_META,
			ap_typ_nm_META,
			purc_act_no_META,
			rcpt_iv_mng_no_META,
			rcpt_iv_no_META,
			wrk_no_META,
			wrk_nm_META,
			schd_ap_sttl_cd_META,
			schd_ap_sttl_nm_META,
			schd_ap_sttl_typ_META,
			schd_ap_sttl_typ_nm_META,
			sw_flg_META,
			pay_ntc_d_print_rmrks_META,
			trd_d_rmrks_META,
			intr_d_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			pay_chk_upd_cntr_META,
			ac_dt_META,
			note_no_META,
			note_typ_META,
			note_typ_nm_META,
			draw_dt_META,
			note_days_META,
			due_dt_META,
			drawer_nm_META,
			endrsr_META,
			accptr_META,
			draw_bank_cd_META,
			draw_bank_nm_META,
			draw_branch_cd_META,
			draw_branch_nm_META,
			note_rsn_cd_META,
			note_rsn_nm_META
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
				{$ap_sttl_typ, "MAC_AP_STTL_TYP"},	// ap_sttl_typ
				{$ap_setoff_typ, "MAC_AP_SETOFF_TYP"},	// ap_setoff_typ
				{$ap_typ, "MAC_AP_TYP"},	// ap_typ
				{$schd_ap_sttl_typ, "MAC_AP_STTL_TYP"}	// schd_ap_sttl_typ
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
	protected Srch01_DtlR_MC_A(ConstMetaList<? extends Srch01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR clone() {
		return (Srch01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR createInstance() {
		return (Srch01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR getValues(String... names) {
		return (Srch01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Reconcile 消込.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Reconcile 消込.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public String ap_sttl_cd() {
		return getConstString(offset + 1, $ap_sttl_cd);
	}

	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public void ap_sttl_cd(String value) {
		setConstString(offset + 1, $ap_sttl_cd, value);
	}


	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public String ap_sttl_nm() {
		return getConstString(offset + 2, $ap_sttl_nm);
	}

	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public void ap_sttl_nm(String value) {
		setConstString(offset + 2, $ap_sttl_nm, value);
	}


	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public String ap_sttl_typ() {
		return getConstString(offset + 3, $ap_sttl_typ);
	}

	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public void ap_sttl_typ(String value) {
		setConstString(offset + 3, $ap_sttl_typ, value);
	}


	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public String ap_sttl_typ_nm() {
		return getConstString(offset + 4, $ap_sttl_typ_nm);
	}

	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public void ap_sttl_typ_nm(String value) {
		setConstString(offset + 4, $ap_sttl_typ_nm, value);
	}


	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return getConstDate(offset + 5, $pay_schd_dt);
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		setConstDate(offset + 5, $pay_schd_dt, value);
	}


	/**
	 * Payment schedule amount 支払予定額.<p>
	 *
	 */
	public MCNumber pay_schd_amt() {
		return getConstNumber(offset + 6, $pay_schd_amt);
	}

	/**
	 * Payment schedule amount 支払予定額.<p>
	 *
	 */
	public void pay_schd_amt(MCNumber value) {
		setConstNumber(offset + 6, $pay_schd_amt, value);
	}

	/**
	 * Payment schedule amount 支払予定額.<p>
	 *
	 */
	public void pay_schd_amt(int value) {
		setConstNumber(offset + 6, $pay_schd_amt, value);
	}

	/**
	 * Payment schedule amount 支払予定額.<p>
	 *
	 */
	public void pay_schd_amt(long value) {
		setConstNumber(offset + 6, $pay_schd_amt, value);
	}

	/**
	 * Payment schedule amount 支払予定額.<p>
	 *
	 */
	public void pay_schd_amt(float value) {
		setConstNumber(offset + 6, $pay_schd_amt, value);
	}

	/**
	 * Payment schedule amount 支払予定額.<p>
	 *
	 */
	public void pay_schd_amt(double value) {
		setConstNumber(offset + 6, $pay_schd_amt, value);
	}


	/**
	 * Payment schedule fee tax amount 支払予定手数料税額.<p>
	 *
	 */
	public MCNumber pay_schd_com_paid_tax_amt() {
		return getConstNumber(offset + 7, $pay_schd_com_paid_tax_amt);
	}

	/**
	 * Payment schedule fee tax amount 支払予定手数料税額.<p>
	 *
	 */
	public void pay_schd_com_paid_tax_amt(MCNumber value) {
		setConstNumber(offset + 7, $pay_schd_com_paid_tax_amt, value);
	}

	/**
	 * Payment schedule fee tax amount 支払予定手数料税額.<p>
	 *
	 */
	public void pay_schd_com_paid_tax_amt(int value) {
		setConstNumber(offset + 7, $pay_schd_com_paid_tax_amt, value);
	}

	/**
	 * Payment schedule fee tax amount 支払予定手数料税額.<p>
	 *
	 */
	public void pay_schd_com_paid_tax_amt(long value) {
		setConstNumber(offset + 7, $pay_schd_com_paid_tax_amt, value);
	}

	/**
	 * Payment schedule fee tax amount 支払予定手数料税額.<p>
	 *
	 */
	public void pay_schd_com_paid_tax_amt(float value) {
		setConstNumber(offset + 7, $pay_schd_com_paid_tax_amt, value);
	}

	/**
	 * Payment schedule fee tax amount 支払予定手数料税額.<p>
	 *
	 */
	public void pay_schd_com_paid_tax_amt(double value) {
		setConstNumber(offset + 7, $pay_schd_com_paid_tax_amt, value);
	}


	/**
	 * Total reconciled amount 消込累計額.<p>
	 *
	 */
	public MCNumber appl_ttl_amt() {
		return getConstNumber(offset + 8, $appl_ttl_amt);
	}

	/**
	 * Total reconciled amount 消込累計額.<p>
	 *
	 */
	public void appl_ttl_amt(MCNumber value) {
		setConstNumber(offset + 8, $appl_ttl_amt, value);
	}

	/**
	 * Total reconciled amount 消込累計額.<p>
	 *
	 */
	public void appl_ttl_amt(int value) {
		setConstNumber(offset + 8, $appl_ttl_amt, value);
	}

	/**
	 * Total reconciled amount 消込累計額.<p>
	 *
	 */
	public void appl_ttl_amt(long value) {
		setConstNumber(offset + 8, $appl_ttl_amt, value);
	}

	/**
	 * Total reconciled amount 消込累計額.<p>
	 *
	 */
	public void appl_ttl_amt(float value) {
		setConstNumber(offset + 8, $appl_ttl_amt, value);
	}

	/**
	 * Total reconciled amount 消込累計額.<p>
	 *
	 */
	public void appl_ttl_amt(double value) {
		setConstNumber(offset + 8, $appl_ttl_amt, value);
	}


	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 9, $trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 9, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 9, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 9, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 9, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 9, $trd_cur_amt, value);
	}


	/**
	 * Fee cd. (Transaction currency) 取引通貨手数料税ＣＤ.<p>
	 *
	 */
	public String trd_cur_com_paid_tax_cd() {
		return getConstString(offset + 10, $trd_cur_com_paid_tax_cd);
	}

	/**
	 * Fee cd. (Transaction currency) 取引通貨手数料税ＣＤ.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_cd(String value) {
		setConstString(offset + 10, $trd_cur_com_paid_tax_cd, value);
	}


	/**
	 * Fee tax name (Transaction currency) 取引通貨手数料税名.<p>
	 *
	 */
	public String trd_cur_com_paid_tax_nm() {
		return getConstString(offset + 11, $trd_cur_com_paid_tax_nm);
	}

	/**
	 * Fee tax name (Transaction currency) 取引通貨手数料税名.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_nm(String value) {
		setConstString(offset + 11, $trd_cur_com_paid_tax_nm, value);
	}


	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public MCNumber trd_cur_com_paid_tax_rate() {
		return getConstNumber(offset + 12, $trd_cur_com_paid_tax_rate);
	}

	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(MCNumber value) {
		setConstNumber(offset + 12, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(int value) {
		setConstNumber(offset + 12, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(long value) {
		setConstNumber(offset + 12, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(float value) {
		setConstNumber(offset + 12, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(double value) {
		setConstNumber(offset + 12, $trd_cur_com_paid_tax_rate, value);
	}


	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public MCNumber trd_cur_com_paid_tax_amt() {
		return getConstNumber(offset + 13, $trd_cur_com_paid_tax_amt);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(MCNumber value) {
		setConstNumber(offset + 13, $trd_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(int value) {
		setConstNumber(offset + 13, $trd_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(long value) {
		setConstNumber(offset + 13, $trd_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(float value) {
		setConstNumber(offset + 13, $trd_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Transaction currency) 取引通貨手数料税額.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_amt(double value) {
		setConstNumber(offset + 13, $trd_cur_com_paid_tax_amt, value);
	}


	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 14, $bank_ac_cd);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 14, $bank_ac_cd, value);
	}


	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public String bank_ac_nm() {
		return getConstString(offset + 15, $bank_ac_nm);
	}

	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public void bank_ac_nm(String value) {
		setConstString(offset + 15, $bank_ac_nm, value);
	}


	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return getConstString(offset + 16, $pay_bank_ac_cd);
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		setConstString(offset + 16, $pay_bank_ac_cd, value);
	}


	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public String pay_bank_ac_nm() {
		return getConstString(offset + 17, $pay_bank_ac_nm);
	}

	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public void pay_bank_ac_nm(String value) {
		setConstString(offset + 17, $pay_bank_ac_nm, value);
	}


	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public String ap_setoff_typ() {
		return getConstString(offset + 18, $ap_setoff_typ);
	}

	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public void ap_setoff_typ(String value) {
		setConstString(offset + 18, $ap_setoff_typ, value);
	}


	/**
	 * AP offset destination name 債務相殺先区分名.<p>
	 *
	 */
	public String ap_setoff_typ_nm() {
		return getConstString(offset + 19, $ap_setoff_typ_nm);
	}

	/**
	 * AP offset destination name 債務相殺先区分名.<p>
	 *
	 */
	public void ap_setoff_typ_nm(String value) {
		setConstString(offset + 19, $ap_setoff_typ_nm, value);
	}


	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public String setoff_cd() {
		return getConstString(offset + 20, $setoff_cd);
	}

	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public void setoff_cd(String value) {
		setConstString(offset + 20, $setoff_cd, value);
	}


	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public String setoff_nm() {
		return getConstString(offset + 21, $setoff_nm);
	}

	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public void setoff_nm(String value) {
		setConstString(offset + 21, $setoff_nm, value);
	}


	/**
	 * Offset destination name (Master) 相殺先名（マスタ）.<p>
	 *
	 */
	public String setoff_nm_mst() {
		return getConstString(offset + 22, $setoff_nm_mst);
	}

	/**
	 * Offset destination name (Master) 相殺先名（マスタ）.<p>
	 *
	 */
	public void setoff_nm_mst(String value) {
		setConstString(offset + 22, $setoff_nm_mst, value);
	}


	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public String so_dpt_cd() {
		return getConstString(offset + 23, $so_dpt_cd);
	}

	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public void so_dpt_cd(String value) {
		setConstString(offset + 23, $so_dpt_cd, value);
	}


	/**
	 * Offset dept. name 相殺部門名.<p>
	 *
	 */
	public String so_dpt_nm() {
		return getConstString(offset + 24, $so_dpt_nm);
	}

	/**
	 * Offset dept. name 相殺部門名.<p>
	 *
	 */
	public void so_dpt_nm(String value) {
		setConstString(offset + 24, $so_dpt_nm, value);
	}


	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 25, $base_cur_amt);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 25, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 25, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 25, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 25, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 25, $base_cur_amt, value);
	}


	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public MCNumber base_cur_com_paid_tax_amt() {
		return getConstNumber(offset + 26, $base_cur_com_paid_tax_amt);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(MCNumber value) {
		setConstNumber(offset + 26, $base_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(int value) {
		setConstNumber(offset + 26, $base_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(long value) {
		setConstNumber(offset + 26, $base_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(float value) {
		setConstNumber(offset + 26, $base_cur_com_paid_tax_amt, value);
	}

	/**
	 * Fee tax amount (Base currency) 基準通貨手数料税額.<p>
	 *
	 */
	public void base_cur_com_paid_tax_amt(double value) {
		setConstNumber(offset + 26, $base_cur_com_paid_tax_amt, value);
	}


	/**
	 * Payment result details No. 支払実績明細ＮＯ.<p>
	 *
	 */
	public String pay_act_d_no() {
		return getConstString(offset + 27, $pay_act_d_no);
	}

	/**
	 * Payment result details No. 支払実績明細ＮＯ.<p>
	 *
	 */
	public void pay_act_d_no(String value) {
		setConstString(offset + 27, $pay_act_d_no, value);
	}


	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public MCNumber pay_act_d_seq() {
		return getConstNumber(offset + 28, $pay_act_d_seq);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(MCNumber value) {
		setConstNumber(offset + 28, $pay_act_d_seq, value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(int value) {
		setConstNumber(offset + 28, $pay_act_d_seq, value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(long value) {
		setConstNumber(offset + 28, $pay_act_d_seq, value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(float value) {
		setConstNumber(offset + 28, $pay_act_d_seq, value);
	}

	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public void pay_act_d_seq(double value) {
		setConstNumber(offset + 28, $pay_act_d_seq, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 29, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 29, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 29, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 29, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 29, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 29, $disp_seq, value);
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
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public String pay_chk_mng_no() {
		return getConstString(offset + 31, $pay_chk_mng_no);
	}

	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public void pay_chk_mng_no(String value) {
		setConstString(offset + 31, $pay_chk_mng_no, value);
	}


	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public String pay_schd_no() {
		return getConstString(offset + 32, $pay_schd_no);
	}

	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public void pay_schd_no(String value) {
		setConstString(offset + 32, $pay_schd_no, value);
	}


	/**
	 * AP reconciliation schedule No. 買掛消込予定ＮＯ.<p>
	 *
	 */
	public String ap_appl_schd_no() {
		return getConstString(offset + 33, $ap_appl_schd_no);
	}

	/**
	 * AP reconciliation schedule No. 買掛消込予定ＮＯ.<p>
	 *
	 */
	public void ap_appl_schd_no(String value) {
		setConstString(offset + 33, $ap_appl_schd_no, value);
	}


	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 34, $bsppl_cd);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 34, $bsppl_cd, value);
	}


	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public String bsppl_nm() {
		return getConstString(offset + 35, $bsppl_nm);
	}

	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public void bsppl_nm(String value) {
		setConstString(offset + 35, $bsppl_nm, value);
	}


	/**
	 * Scheduled payee dept. cd. 支払予定管理先部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 36, $bsppl_dpt_cd);
	}

	/**
	 * Scheduled payee dept. cd. 支払予定管理先部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 36, $bsppl_dpt_cd, value);
	}


	/**
	 * Scheduled payee dept. name 支払予定管理先部門名.<p>
	 *
	 */
	public String bsppl_dpt_nm() {
		return getConstString(offset + 37, $bsppl_dpt_nm);
	}

	/**
	 * Scheduled payee dept. name 支払予定管理先部門名.<p>
	 *
	 */
	public void bsppl_dpt_nm(String value) {
		setConstString(offset + 37, $bsppl_dpt_nm, value);
	}


	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 38, $asppl_cd);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 38, $asppl_cd, value);
	}


	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public String asppl_nm() {
		return getConstString(offset + 39, $asppl_nm);
	}

	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public void asppl_nm(String value) {
		setConstString(offset + 39, $asppl_nm, value);
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
	 * AP type 債務区分.<p>
	 *
	 */
	public String ap_typ() {
		return getConstString(offset + 42, $ap_typ);
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public void ap_typ(String value) {
		setConstString(offset + 42, $ap_typ, value);
	}


	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public String ap_typ_nm() {
		return getConstString(offset + 43, $ap_typ_nm);
	}

	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public void ap_typ_nm(String value) {
		setConstString(offset + 43, $ap_typ_nm, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 44, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 44, $purc_act_no, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 45, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 45, $rcpt_iv_mng_no, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 46, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 46, $rcpt_iv_no, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 47, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 47, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 48, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 48, $wrk_nm, value);
	}


	/**
	 * AP settlement method cd. at schedule 予定時債務決済方法ＣＤ.<p>
	 *
	 */
	public String schd_ap_sttl_cd() {
		return getConstString(offset + 49, $schd_ap_sttl_cd);
	}

	/**
	 * AP settlement method cd. at schedule 予定時債務決済方法ＣＤ.<p>
	 *
	 */
	public void schd_ap_sttl_cd(String value) {
		setConstString(offset + 49, $schd_ap_sttl_cd, value);
	}


	/**
	 * AP settlement method name at schedule 予定時債務決済方法名.<p>
	 *
	 */
	public String schd_ap_sttl_nm() {
		return getConstString(offset + 50, $schd_ap_sttl_nm);
	}

	/**
	 * AP settlement method name at schedule 予定時債務決済方法名.<p>
	 *
	 */
	public void schd_ap_sttl_nm(String value) {
		setConstString(offset + 50, $schd_ap_sttl_nm, value);
	}


	/**
	 * AP settlement type at schedule 予定時債務決済区分.<p>
	 *
	 */
	public String schd_ap_sttl_typ() {
		return getConstString(offset + 51, $schd_ap_sttl_typ);
	}

	/**
	 * AP settlement type at schedule 予定時債務決済区分.<p>
	 *
	 */
	public void schd_ap_sttl_typ(String value) {
		setConstString(offset + 51, $schd_ap_sttl_typ, value);
	}


	/**
	 * AP settlement type name at schedule 予定時債務決済区分名.<p>
	 *
	 */
	public String schd_ap_sttl_typ_nm() {
		return getConstString(offset + 52, $schd_ap_sttl_typ_nm);
	}

	/**
	 * AP settlement type name at schedule 予定時債務決済区分名.<p>
	 *
	 */
	public void schd_ap_sttl_typ_nm(String value) {
		setConstString(offset + 52, $schd_ap_sttl_typ_nm, value);
	}


	/**
	 * Transferred 振替済.<p>
	 *
	 */
	public boolean sw_flg() {
		return getConstBoolean(offset + 53, $sw_flg);
	}

	/**
	 * Transferred 振替済.<p>
	 *
	 */
	public void sw_flg(boolean value) {
		setConstBoolean(offset + 53, $sw_flg, value);
	}


	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public String pay_ntc_d_print_rmrks() {
		return getConstString(offset + 54, $pay_ntc_d_print_rmrks);
	}

	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public void pay_ntc_d_print_rmrks(String value) {
		setConstString(offset + 54, $pay_ntc_d_print_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 55, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 55, $trd_d_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 56, $intr_d_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 56, $intr_d_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 57, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 57, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 58, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 58, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 59, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 59, $sub_char3, value);
	}


	/**
	 * Payment collation header update counter 支払照合ヘッダ更新カウンタ.<p>
	 *
	 */
	public MCNumber pay_chk_upd_cntr() {
		return getConstNumber(offset + 60, $pay_chk_upd_cntr);
	}

	/**
	 * Payment collation header update counter 支払照合ヘッダ更新カウンタ.<p>
	 *
	 */
	public void pay_chk_upd_cntr(MCNumber value) {
		setConstNumber(offset + 60, $pay_chk_upd_cntr, value);
	}

	/**
	 * Payment collation header update counter 支払照合ヘッダ更新カウンタ.<p>
	 *
	 */
	public void pay_chk_upd_cntr(int value) {
		setConstNumber(offset + 60, $pay_chk_upd_cntr, value);
	}

	/**
	 * Payment collation header update counter 支払照合ヘッダ更新カウンタ.<p>
	 *
	 */
	public void pay_chk_upd_cntr(long value) {
		setConstNumber(offset + 60, $pay_chk_upd_cntr, value);
	}

	/**
	 * Payment collation header update counter 支払照合ヘッダ更新カウンタ.<p>
	 *
	 */
	public void pay_chk_upd_cntr(float value) {
		setConstNumber(offset + 60, $pay_chk_upd_cntr, value);
	}

	/**
	 * Payment collation header update counter 支払照合ヘッダ更新カウンタ.<p>
	 *
	 */
	public void pay_chk_upd_cntr(double value) {
		setConstNumber(offset + 60, $pay_chk_upd_cntr, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 61, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 61, $ac_dt, value);
	}


	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 62, $note_no);
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 62, $note_no, value);
	}


	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public String note_typ() {
		return getConstString(offset + 63, $note_typ);
	}

	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public void note_typ(String value) {
		setConstString(offset + 63, $note_typ, value);
	}


	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public String note_typ_nm() {
		return getConstString(offset + 64, $note_typ_nm);
	}

	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public void note_typ_nm(String value) {
		setConstString(offset + 64, $note_typ_nm, value);
	}


	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public MCDate draw_dt() {
		return getConstDate(offset + 65, $draw_dt);
	}

	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public void draw_dt(MCDate value) {
		setConstDate(offset + 65, $draw_dt, value);
	}


	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public MCNumber note_days() {
		return getConstNumber(offset + 66, $note_days);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(MCNumber value) {
		setConstNumber(offset + 66, $note_days, value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(int value) {
		setConstNumber(offset + 66, $note_days, value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(long value) {
		setConstNumber(offset + 66, $note_days, value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(float value) {
		setConstNumber(offset + 66, $note_days, value);
	}

	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public void note_days(double value) {
		setConstNumber(offset + 66, $note_days, value);
	}


	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public MCDate due_dt() {
		return getConstDate(offset + 67, $due_dt);
	}

	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public void due_dt(MCDate value) {
		setConstDate(offset + 67, $due_dt, value);
	}


	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public String drawer_nm() {
		return getConstString(offset + 68, $drawer_nm);
	}

	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public void drawer_nm(String value) {
		setConstString(offset + 68, $drawer_nm, value);
	}


	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public String endrsr() {
		return getConstString(offset + 69, $endrsr);
	}

	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public void endrsr(String value) {
		setConstString(offset + 69, $endrsr, value);
	}


	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public String accptr() {
		return getConstString(offset + 70, $accptr);
	}

	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public void accptr(String value) {
		setConstString(offset + 70, $accptr, value);
	}


	/**
	 * Drawing bank 振出銀行.<p>
	 *
	 */
	public String draw_bank_cd() {
		return getConstString(offset + 71, $draw_bank_cd);
	}

	/**
	 * Drawing bank 振出銀行.<p>
	 *
	 */
	public void draw_bank_cd(String value) {
		setConstString(offset + 71, $draw_bank_cd, value);
	}


	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public String draw_bank_nm() {
		return getConstString(offset + 72, $draw_bank_nm);
	}

	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public void draw_bank_nm(String value) {
		setConstString(offset + 72, $draw_bank_nm, value);
	}


	/**
	 * Drawing branch 振出支店.<p>
	 *
	 */
	public String draw_branch_cd() {
		return getConstString(offset + 73, $draw_branch_cd);
	}

	/**
	 * Drawing branch 振出支店.<p>
	 *
	 */
	public void draw_branch_cd(String value) {
		setConstString(offset + 73, $draw_branch_cd, value);
	}


	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public String draw_branch_nm() {
		return getConstString(offset + 74, $draw_branch_nm);
	}

	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public void draw_branch_nm(String value) {
		setConstString(offset + 74, $draw_branch_nm, value);
	}


	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public String note_rsn_cd() {
		return getConstString(offset + 75, $note_rsn_cd);
	}

	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public void note_rsn_cd(String value) {
		setConstString(offset + 75, $note_rsn_cd, value);
	}


	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public String note_rsn_nm() {
		return getConstString(offset + 76, $note_rsn_nm);
	}

	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public void note_rsn_nm(String value) {
		setConstString(offset + 76, $note_rsn_nm, value);
	}


	public String getString(String name) {
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			return ap_sttl_nm();
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			return ap_sttl_typ();
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			return ap_sttl_typ_nm();
		}
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_cd();
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_nm();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			return pay_bank_ac_nm();
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			return ap_setoff_typ();
		}
		if ($ap_setoff_typ_nm.equalsIgnoreCase(name)) {
			return ap_setoff_typ_nm();
		}
		if ($setoff_cd.equalsIgnoreCase(name)) {
			return setoff_cd();
		}
		if ($setoff_nm.equalsIgnoreCase(name)) {
			return setoff_nm();
		}
		if ($setoff_nm_mst.equalsIgnoreCase(name)) {
			return setoff_nm_mst();
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			return so_dpt_cd();
		}
		if ($so_dpt_nm.equalsIgnoreCase(name)) {
			return so_dpt_nm();
		}
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			return pay_act_d_no();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			return pay_chk_mng_no();
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			return pay_schd_no();
		}
		if ($ap_appl_schd_no.equalsIgnoreCase(name)) {
			return ap_appl_schd_no();
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
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			return ap_typ_nm();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($schd_ap_sttl_cd.equalsIgnoreCase(name)) {
			return schd_ap_sttl_cd();
		}
		if ($schd_ap_sttl_nm.equalsIgnoreCase(name)) {
			return schd_ap_sttl_nm();
		}
		if ($schd_ap_sttl_typ.equalsIgnoreCase(name)) {
			return schd_ap_sttl_typ();
		}
		if ($schd_ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			return schd_ap_sttl_typ_nm();
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_ntc_d_print_rmrks();
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
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			return note_typ();
		}
		if ($note_typ_nm.equalsIgnoreCase(name)) {
			return note_typ_nm();
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			return drawer_nm();
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			return endrsr();
		}
		if ($accptr.equalsIgnoreCase(name)) {
			return accptr();
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			return draw_bank_cd();
		}
		if ($draw_bank_nm.equalsIgnoreCase(name)) {
			return draw_bank_nm();
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			return draw_branch_cd();
		}
		if ($draw_branch_nm.equalsIgnoreCase(name)) {
			return draw_branch_nm();
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			return note_rsn_cd();
		}
		if ($note_rsn_nm.equalsIgnoreCase(name)) {
			return note_rsn_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			return pay_schd_amt();
		}
		if ($pay_schd_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return pay_schd_com_paid_tax_amt();
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			return appl_ttl_amt();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_rate();
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_amt();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_com_paid_tax_amt();
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			return pay_act_d_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			return pay_chk_upd_cntr();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			return draw_dt();
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($sw_flg.equalsIgnoreCase(name)) {
			return sw_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			return ap_sttl_nm();
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			return ap_sttl_typ();
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			return ap_sttl_typ_nm();
		}
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_cd();
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_nm();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			return pay_bank_ac_nm();
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			return ap_setoff_typ();
		}
		if ($ap_setoff_typ_nm.equalsIgnoreCase(name)) {
			return ap_setoff_typ_nm();
		}
		if ($setoff_cd.equalsIgnoreCase(name)) {
			return setoff_cd();
		}
		if ($setoff_nm.equalsIgnoreCase(name)) {
			return setoff_nm();
		}
		if ($setoff_nm_mst.equalsIgnoreCase(name)) {
			return setoff_nm_mst();
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			return so_dpt_cd();
		}
		if ($so_dpt_nm.equalsIgnoreCase(name)) {
			return so_dpt_nm();
		}
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			return pay_act_d_no();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			return pay_chk_mng_no();
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			return pay_schd_no();
		}
		if ($ap_appl_schd_no.equalsIgnoreCase(name)) {
			return ap_appl_schd_no();
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
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			return ap_typ_nm();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($schd_ap_sttl_cd.equalsIgnoreCase(name)) {
			return schd_ap_sttl_cd();
		}
		if ($schd_ap_sttl_nm.equalsIgnoreCase(name)) {
			return schd_ap_sttl_nm();
		}
		if ($schd_ap_sttl_typ.equalsIgnoreCase(name)) {
			return schd_ap_sttl_typ();
		}
		if ($schd_ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			return schd_ap_sttl_typ_nm();
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_ntc_d_print_rmrks();
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
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			return note_typ();
		}
		if ($note_typ_nm.equalsIgnoreCase(name)) {
			return note_typ_nm();
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			return drawer_nm();
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			return endrsr();
		}
		if ($accptr.equalsIgnoreCase(name)) {
			return accptr();
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			return draw_bank_cd();
		}
		if ($draw_bank_nm.equalsIgnoreCase(name)) {
			return draw_bank_nm();
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			return draw_branch_cd();
		}
		if ($draw_branch_nm.equalsIgnoreCase(name)) {
			return draw_branch_nm();
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			return note_rsn_cd();
		}
		if ($note_rsn_nm.equalsIgnoreCase(name)) {
			return note_rsn_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			return pay_schd_amt();
		}
		if ($pay_schd_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return pay_schd_com_paid_tax_amt();
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			return appl_ttl_amt();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_rate();
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_amt();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_com_paid_tax_amt();
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			return pay_act_d_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			return pay_chk_upd_cntr();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			return draw_dt();
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($sw_flg.equalsIgnoreCase(name)) {
			return sw_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			ap_sttl_cd(value);
			return;
		}
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			ap_sttl_nm(value);
			return;
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			ap_sttl_typ(value);
			return;
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			ap_sttl_typ_nm(value);
			return;
		}
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_cd(value);
			return;
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_nm(value);
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
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			pay_bank_ac_nm(value);
			return;
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			ap_setoff_typ(value);
			return;
		}
		if ($ap_setoff_typ_nm.equalsIgnoreCase(name)) {
			ap_setoff_typ_nm(value);
			return;
		}
		if ($setoff_cd.equalsIgnoreCase(name)) {
			setoff_cd(value);
			return;
		}
		if ($setoff_nm.equalsIgnoreCase(name)) {
			setoff_nm(value);
			return;
		}
		if ($setoff_nm_mst.equalsIgnoreCase(name)) {
			setoff_nm_mst(value);
			return;
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			so_dpt_cd(value);
			return;
		}
		if ($so_dpt_nm.equalsIgnoreCase(name)) {
			so_dpt_nm(value);
			return;
		}
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			pay_act_d_no(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			pay_chk_mng_no(value);
			return;
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			pay_schd_no(value);
			return;
		}
		if ($ap_appl_schd_no.equalsIgnoreCase(name)) {
			ap_appl_schd_no(value);
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
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
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
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			ap_typ_nm(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
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
		if ($schd_ap_sttl_cd.equalsIgnoreCase(name)) {
			schd_ap_sttl_cd(value);
			return;
		}
		if ($schd_ap_sttl_nm.equalsIgnoreCase(name)) {
			schd_ap_sttl_nm(value);
			return;
		}
		if ($schd_ap_sttl_typ.equalsIgnoreCase(name)) {
			schd_ap_sttl_typ(value);
			return;
		}
		if ($schd_ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			schd_ap_sttl_typ_nm(value);
			return;
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_ntc_d_print_rmrks(value);
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
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			note_typ(value);
			return;
		}
		if ($note_typ_nm.equalsIgnoreCase(name)) {
			note_typ_nm(value);
			return;
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			drawer_nm(value);
			return;
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			endrsr(value);
			return;
		}
		if ($accptr.equalsIgnoreCase(name)) {
			accptr(value);
			return;
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			draw_bank_cd(value);
			return;
		}
		if ($draw_bank_nm.equalsIgnoreCase(name)) {
			draw_bank_nm(value);
			return;
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			draw_branch_cd(value);
			return;
		}
		if ($draw_branch_nm.equalsIgnoreCase(name)) {
			draw_branch_nm(value);
			return;
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			note_rsn_cd(value);
			return;
		}
		if ($note_rsn_nm.equalsIgnoreCase(name)) {
			note_rsn_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			pay_schd_amt(value);
			return;
		}
		if ($pay_schd_com_paid_tax_amt.equalsIgnoreCase(name)) {
			pay_schd_com_paid_tax_amt(value);
			return;
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			appl_ttl_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			pay_schd_amt(value);
			return;
		}
		if ($pay_schd_com_paid_tax_amt.equalsIgnoreCase(name)) {
			pay_schd_com_paid_tax_amt(value);
			return;
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			appl_ttl_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			pay_schd_amt(value);
			return;
		}
		if ($pay_schd_com_paid_tax_amt.equalsIgnoreCase(name)) {
			pay_schd_com_paid_tax_amt(value);
			return;
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			appl_ttl_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			pay_schd_amt(value);
			return;
		}
		if ($pay_schd_com_paid_tax_amt.equalsIgnoreCase(name)) {
			pay_schd_com_paid_tax_amt(value);
			return;
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			appl_ttl_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			pay_schd_amt(value);
			return;
		}
		if ($pay_schd_com_paid_tax_amt.equalsIgnoreCase(name)) {
			pay_schd_com_paid_tax_amt(value);
			return;
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			appl_ttl_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			draw_dt(value);
			return;
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			due_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($sw_flg.equalsIgnoreCase(name)) {
			sw_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			ap_sttl_cd(value);
			return;
		}
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			ap_sttl_nm(value);
			return;
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			ap_sttl_typ(value);
			return;
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			ap_sttl_typ_nm(value);
			return;
		}
		if ($trd_cur_com_paid_tax_cd.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_cd(value);
			return;
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_nm(value);
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
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			pay_bank_ac_nm(value);
			return;
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			ap_setoff_typ(value);
			return;
		}
		if ($ap_setoff_typ_nm.equalsIgnoreCase(name)) {
			ap_setoff_typ_nm(value);
			return;
		}
		if ($setoff_cd.equalsIgnoreCase(name)) {
			setoff_cd(value);
			return;
		}
		if ($setoff_nm.equalsIgnoreCase(name)) {
			setoff_nm(value);
			return;
		}
		if ($setoff_nm_mst.equalsIgnoreCase(name)) {
			setoff_nm_mst(value);
			return;
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			so_dpt_cd(value);
			return;
		}
		if ($so_dpt_nm.equalsIgnoreCase(name)) {
			so_dpt_nm(value);
			return;
		}
		if ($pay_act_d_no.equalsIgnoreCase(name)) {
			pay_act_d_no(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			pay_chk_mng_no(value);
			return;
		}
		if ($pay_schd_no.equalsIgnoreCase(name)) {
			pay_schd_no(value);
			return;
		}
		if ($ap_appl_schd_no.equalsIgnoreCase(name)) {
			ap_appl_schd_no(value);
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
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
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
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			ap_typ_nm(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
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
		if ($schd_ap_sttl_cd.equalsIgnoreCase(name)) {
			schd_ap_sttl_cd(value);
			return;
		}
		if ($schd_ap_sttl_nm.equalsIgnoreCase(name)) {
			schd_ap_sttl_nm(value);
			return;
		}
		if ($schd_ap_sttl_typ.equalsIgnoreCase(name)) {
			schd_ap_sttl_typ(value);
			return;
		}
		if ($schd_ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			schd_ap_sttl_typ_nm(value);
			return;
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_ntc_d_print_rmrks(value);
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
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			note_typ(value);
			return;
		}
		if ($note_typ_nm.equalsIgnoreCase(name)) {
			note_typ_nm(value);
			return;
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			drawer_nm(value);
			return;
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			endrsr(value);
			return;
		}
		if ($accptr.equalsIgnoreCase(name)) {
			accptr(value);
			return;
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			draw_bank_cd(value);
			return;
		}
		if ($draw_bank_nm.equalsIgnoreCase(name)) {
			draw_bank_nm(value);
			return;
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			draw_branch_cd(value);
			return;
		}
		if ($draw_branch_nm.equalsIgnoreCase(name)) {
			draw_branch_nm(value);
			return;
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			note_rsn_cd(value);
			return;
		}
		if ($note_rsn_nm.equalsIgnoreCase(name)) {
			note_rsn_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			pay_schd_amt(value);
			return;
		}
		if ($pay_schd_com_paid_tax_amt.equalsIgnoreCase(name)) {
			pay_schd_com_paid_tax_amt(value);
			return;
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			appl_ttl_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			pay_schd_amt(value);
			return;
		}
		if ($pay_schd_com_paid_tax_amt.equalsIgnoreCase(name)) {
			pay_schd_com_paid_tax_amt(value);
			return;
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			appl_ttl_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			pay_schd_amt(value);
			return;
		}
		if ($pay_schd_com_paid_tax_amt.equalsIgnoreCase(name)) {
			pay_schd_com_paid_tax_amt(value);
			return;
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			appl_ttl_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			pay_schd_amt(value);
			return;
		}
		if ($pay_schd_com_paid_tax_amt.equalsIgnoreCase(name)) {
			pay_schd_com_paid_tax_amt(value);
			return;
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			appl_ttl_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pay_schd_amt.equalsIgnoreCase(name)) {
			pay_schd_amt(value);
			return;
		}
		if ($pay_schd_com_paid_tax_amt.equalsIgnoreCase(name)) {
			pay_schd_com_paid_tax_amt(value);
			return;
		}
		if ($appl_ttl_amt.equalsIgnoreCase(name)) {
			appl_ttl_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_com_paid_tax_amt.equalsIgnoreCase(name)) {
			base_cur_com_paid_tax_amt(value);
			return;
		}
		if ($pay_act_d_seq.equalsIgnoreCase(name)) {
			pay_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($pay_chk_upd_cntr.equalsIgnoreCase(name)) {
			pay_chk_upd_cntr(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			draw_dt(value);
			return;
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			due_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($sw_flg.equalsIgnoreCase(name)) {
			sw_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

