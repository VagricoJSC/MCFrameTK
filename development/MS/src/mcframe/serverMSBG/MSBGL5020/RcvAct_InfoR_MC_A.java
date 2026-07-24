package mcframe.serverMSBG.MSBGL5020;

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
 * ブロック"RcvAct_Info"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RcvAct_InfoR_MC_A extends MCConstRow {

	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_no = "rcv_act_no";
	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public static final String $rcv_act_seq = "rcv_act_seq";
	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public static final String $rcv_act_rev = "rcv_act_rev";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $cred_cd = "cred_cd";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * AR settlement method 1 債権決済方法１.<p>
	 *
	 */
	public static final String $ar_sttl_cd1 = "ar_sttl_cd1";
	/**
	 * AR settlement type 1 債権決済区分１.<p>
	 *
	 */
	public static final String $ar_sttl_typ1 = "ar_sttl_typ1";
	/**
	 * Tax cd. 1 税ＣＤ１.<p>
	 *
	 */
	public static final String $tax_cd1 = "tax_cd1";
	/**
	 * Tax type 1 税区分１.<p>
	 *
	 */
	public static final String $tax_typ1 = "tax_typ1";
	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public static final String $tax_rate1 = "tax_rate1";
	/**
	 * AR settlement method 2 債権決済方法２.<p>
	 *
	 */
	public static final String $ar_sttl_cd2 = "ar_sttl_cd2";
	/**
	 * AR settlement type 2 債権決済区分２.<p>
	 *
	 */
	public static final String $ar_sttl_typ2 = "ar_sttl_typ2";
	/**
	 * Tax cd. 2 税ＣＤ２.<p>
	 *
	 */
	public static final String $tax_cd2 = "tax_cd2";
	/**
	 * Tax type 2 税区分２.<p>
	 *
	 */
	public static final String $tax_typ2 = "tax_typ2";
	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public static final String $tax_rate2 = "tax_rate2";
	/**
	 * AR settlement method 3 債権決済方法３.<p>
	 *
	 */
	public static final String $ar_sttl_cd3 = "ar_sttl_cd3";
	/**
	 * AR settlement type 3 債権決済区分３.<p>
	 *
	 */
	public static final String $ar_sttl_typ3 = "ar_sttl_typ3";
	/**
	 * Tax cd. 3 税ＣＤ３.<p>
	 *
	 */
	public static final String $tax_cd3 = "tax_cd3";
	/**
	 * Tax type 3 税区分３.<p>
	 *
	 */
	public static final String $tax_typ3 = "tax_typ3";
	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public static final String $tax_rate3 = "tax_rate3";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public static final String $ar_trd_grp_typ = "ar_trd_grp_typ";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public static final String $bill_basis_dt = "bill_basis_dt";
	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public static final String $rcv_no = "rcv_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public static final String $rcv_dt = "rcv_dt";
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public static final String $xfr_psn = "xfr_psn";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public static final String $note_no = "note_no";
	/**
	 * Note management No. 手形管理ＮＯ.<p>
	 *
	 */
	public static final String $note_mng_no = "note_mng_no";
	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public static final String $note_typ = "note_typ";
	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public static final String $draw_dt = "draw_dt";
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
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public static final String $draw_bank_cd = "draw_bank_cd";
	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public static final String $draw_branch_cd = "draw_branch_cd";
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
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public static final String $note_rsn_cd = "note_rsn_cd";
	/**
	 * AR/AP BP type 債権債務先区分.<p>
	 *
	 */
	public static final String $debt_cred_id_typ = "debt_cred_id_typ";
	/**
	 * AR/AP BP cd. 債権債務先ＣＤ.<p>
	 *
	 */
	public static final String $debt_cred_id_cd = "debt_cred_id_cd";
	/**
	 * AR/AP BP name 債権債務先名.<p>
	 *
	 */
	public static final String $debt_cred_nm = "debt_cred_nm";
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 * Auto-reconciliation flg. 入金自動消込ＦＬＧ.<p>
	 *
	 */
	public static final String $rcv_auto_appl_flg = "rcv_auto_appl_flg";
	/**
	 * Display advance received on invoice 請求書前受金表示.<p>
	 *
	 */
	public static final String $bill_dtl_adv_flg = "bill_dtl_adv_flg";
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
	 * Note spare 1 手形予備１.<p>
	 *
	 */
	public static final String $note_sub_char1 = "note_sub_char1";
	/**
	 * Note spare 2 手形予備２.<p>
	 *
	 */
	public static final String $note_sub_char2 = "note_sub_char2";
	/**
	 * Note spare 3 手形予備３.<p>
	 *
	 */
	public static final String $note_sub_char3 = "note_sub_char3";
	/**
	 * Tax inclusive amount 内税額.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	/**
	 * Tax inclusive subtotal 1 内税額小計１.<p>
	 *
	 */
	public static final String $tax_subttl1 = "tax_subttl1";
	/**
	 * Tax inclusive subtotal 2 内税額小計２.<p>
	 *
	 */
	public static final String $tax_subttl2 = "tax_subttl2";
	/**
	 * Tax inclusive subtotal 3 内税額小計３.<p>
	 *
	 */
	public static final String $tax_subttl3 = "tax_subttl3";
	/**
	 * Amount total 金額計.<p>
	 *
	 */
	public static final String $amt = "amt";
	/**
	 * Amount 1 total 金額１合計.<p>
	 *
	 */
	public static final String $subttl1 = "subttl1";
	/**
	 * Amount 2 total 金額２合計.<p>
	 *
	 */
	public static final String $subttl2 = "subttl2";
	/**
	 * Amount 3 total 金額３合計.<p>
	 *
	 */
	public static final String $subttl3 = "subttl3";
	/**
	 * Payment received reference date and time 入金参照日時.<p>
	 *
	 */
	public static final String $rcv_ref_time = "rcv_ref_time";
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	/**
	 * Settlement flg. 決済ＦＬＧ.<p>
	 *
	 */
	public static final String $mat_flg = "mat_flg";
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Base amount total 基準金額計.<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	/**
	 * Base amount 1 基準金額１.<p>
	 *
	 */
	public static final String $base_cur_subttl1 = "base_cur_subttl1";
	/**
	 * Base amount 2 基準金額２.<p>
	 *
	 */
	public static final String $base_cur_subttl2 = "base_cur_subttl2";
	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public static final String $base_cur_subttl3 = "base_cur_subttl3";
	/**
	 * Parent incoming payment result No. 親入金実績ＮＯ.<p>
	 *
	 */
	public static final String $par_rcv_act_no = "par_rcv_act_no";
	/**
	 * Parent incoming payment result sequence number 親入金実績連番.<p>
	 *
	 */
	public static final String $par_rcv_act_seq = "par_rcv_act_seq";
	/**
	 * Base tax amount 基準消費税額.<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	/**
	 * Tax inclusive subtotal 1 (Base currency) 基準通貨内消費税小計１.<p>
	 *
	 */
	public static final String $base_cur_tax_subttl1 = "base_cur_tax_subttl1";
	/**
	 * Tax inclusive subtotal 2 (Base currency) 基準通貨内消費税小計２.<p>
	 *
	 */
	public static final String $base_cur_tax_subttl2 = "base_cur_tax_subttl2";
	/**
	 * Tax inclusive subtotal 3 (Base currency) 基準通貨内消費税小計３.<p>
	 *
	 */
	public static final String $base_cur_tax_subttl3 = "base_cur_tax_subttl3";
	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public static final String $exc_gain_loss = "exc_gain_loss";
	/**
	 * Issued flg. 発行済ＦＬＧ.<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";


	public static final MCMeta rcv_act_no_META = createCommonMeta($rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta rcv_act_seq_META = createCommonMeta($rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta rcv_act_rev_META = createCommonMeta($rcv_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cred_cd_META = createCommonMeta($cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ar_sttl_cd1_META = createCommonMeta($ar_sttl_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_typ1_META = createCommonMeta($ar_sttl_typ1, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta tax_cd1_META = createCommonMeta($tax_cd1, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_typ1_META = createCommonMeta($tax_typ1, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta tax_rate1_META = createCommonMeta($tax_rate1, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta ar_sttl_cd2_META = createCommonMeta($ar_sttl_cd2, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_typ2_META = createCommonMeta($ar_sttl_typ2, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta tax_cd2_META = createCommonMeta($tax_cd2, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_typ2_META = createCommonMeta($tax_typ2, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta tax_rate2_META = createCommonMeta($tax_rate2, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta ar_sttl_cd3_META = createCommonMeta($ar_sttl_cd3, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_typ3_META = createCommonMeta($ar_sttl_typ3, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta tax_cd3_META = createCommonMeta($tax_cd3, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_typ3_META = createCommonMeta($tax_typ3, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta tax_rate3_META = createCommonMeta($tax_rate3, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta ar_trd_grp_typ_META = createCommonMeta($ar_trd_grp_typ, mcframe.commonMA.meta.MA_META.AR_TRD_GRP_TYP);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta bill_basis_dt_META = createCommonMeta($bill_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_no_META = createCommonMeta($rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta rcv_dt_META = createCommonMeta($rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta xfr_psn_META = createCommonMeta($xfr_psn, mcframe.commonMA.meta.MA_META.XFR_PSN);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta note_no_META = createCommonMeta($note_no, mcframe.commonMA.meta.MA_META.NOTE_NO);
	public static final MCMeta note_mng_no_META = createCommonMeta($note_mng_no, mcframe.commonMA.meta.MA_META.NOTE_MNG_NO);
	public static final MCMeta note_typ_META = createCommonMeta($note_typ, mcframe.commonMA.meta.MA_META.NOTE_TYP);
	public static final MCMeta draw_dt_META = createCommonMeta($draw_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta due_dt_META = createCommonMeta($due_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta drawer_nm_META = createCommonMeta($drawer_nm, mcframe.commonMA.meta.MA_META.DRAWER_NM);
	public static final MCMeta draw_bank_cd_META = createCommonMeta($draw_bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta draw_branch_cd_META = createCommonMeta($draw_branch_cd, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta endrsr_META = createCommonMeta($endrsr, mcframe.commonMA.meta.MA_META.NOTE_ENDRSR);
	public static final MCMeta accptr_META = createCommonMeta($accptr, mcframe.commonMA.meta.MA_META.NOTE_ACCPTR);
	public static final MCMeta note_rsn_cd_META = createCommonMeta($note_rsn_cd, mcframe.commonMA.meta.MA_META.NOTE_RSN_CD);
	public static final MCMeta debt_cred_id_typ_META = createCommonMeta($debt_cred_id_typ, mcframe.commonMA.meta.MA_META.DEBT_CRED_ID_TYP);
	public static final MCMeta debt_cred_id_cd_META = createCommonMeta($debt_cred_id_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta debt_cred_nm_META = createCommonMeta($debt_cred_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta rcv_auto_appl_flg_META = createCommonMeta($rcv_auto_appl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dtl_adv_flg_META = createCommonMeta($bill_dtl_adv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR3);
	public static final MCMeta note_sub_char1_META = createCommonMeta($note_sub_char1, mcframe.commonMS.meta.MS_META.NOTE_SUB_CHAR1);
	public static final MCMeta note_sub_char2_META = createCommonMeta($note_sub_char2, mcframe.commonMS.meta.MS_META.NOTE_SUB_CHAR2);
	public static final MCMeta note_sub_char3_META = createCommonMeta($note_sub_char3, mcframe.commonMS.meta.MS_META.NOTE_SUB_CHAR3);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_subttl1_META = createCommonMeta($tax_subttl1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_subttl2_META = createCommonMeta($tax_subttl2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_subttl3_META = createCommonMeta($tax_subttl3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta subttl1_META = createCommonMeta($subttl1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta subttl2_META = createCommonMeta($subttl2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta subttl3_META = createCommonMeta($subttl3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_ref_time_META = createCommonMeta($rcv_ref_time, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta mat_flg_META = createCommonMeta($mat_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_subttl1_META = createCommonMeta($base_cur_subttl1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_subttl2_META = createCommonMeta($base_cur_subttl2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_subttl3_META = createCommonMeta($base_cur_subttl3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta par_rcv_act_no_META = createCommonMeta($par_rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta par_rcv_act_seq_META = createCommonMeta($par_rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_subttl1_META = createCommonMeta($base_cur_tax_subttl1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_subttl2_META = createCommonMeta($base_cur_tax_subttl2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_subttl3_META = createCommonMeta($base_cur_tax_subttl3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta exc_gain_loss_META = createCommonMeta($exc_gain_loss, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<RcvAct_InfoR> constMetas = new ConstMetaList<RcvAct_InfoR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rcv_act_no_META,
			rcv_act_seq_META,
			rcv_act_rev_META,
			data_crud_typ_META,
			can_ac_dt_META,
			dpt_cd_META,
			wg_cd_META,
			usr_cd_META,
			rcst_cd_META,
			bcst_cd_META,
			cred_cd_META,
			bill_dpt_cd_META,
			ac_dt_META,
			ac_ym_META,
			ar_sttl_cd1_META,
			ar_sttl_typ1_META,
			tax_cd1_META,
			tax_typ1_META,
			tax_rate1_META,
			ar_sttl_cd2_META,
			ar_sttl_typ2_META,
			tax_cd2_META,
			tax_typ2_META,
			tax_rate2_META,
			ar_sttl_cd3_META,
			ar_sttl_typ3_META,
			tax_cd3_META,
			tax_typ3_META,
			tax_rate3_META,
			trd_cd_META,
			ar_trd_grp_typ_META,
			trd_ptn_typ_META,
			bill_basis_dt_META,
			rcv_no_META,
			slo_no_META,
			rcv_dt_META,
			bank_ac_cd_META,
			xfr_psn_META,
			trd_rmrks_META,
			note_no_META,
			note_mng_no_META,
			note_typ_META,
			draw_dt_META,
			due_dt_META,
			drawer_nm_META,
			draw_bank_cd_META,
			draw_branch_cd_META,
			endrsr_META,
			accptr_META,
			note_rsn_cd_META,
			debt_cred_id_typ_META,
			debt_cred_id_cd_META,
			debt_cred_nm_META,
			bd_dpt_cd_META,
			trd_cur_cd_META,
			xrate_META,
			xrate_cd_META,
			rcv_auto_appl_flg_META,
			bill_dtl_adv_flg_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			note_sub_char1_META,
			note_sub_char2_META,
			note_sub_char3_META,
			tax_amt_META,
			tax_subttl1_META,
			tax_subttl2_META,
			tax_subttl3_META,
			amt_META,
			subttl1_META,
			subttl2_META,
			subttl3_META,
			rcv_ref_time_META,
			slip_sts_typ_META,
			mat_flg_META,
			base_cur_cd_META,
			amt_dec_place_META,
			base_cur_amt_META,
			base_cur_subttl1_META,
			base_cur_subttl2_META,
			base_cur_subttl3_META,
			par_rcv_act_no_META,
			par_rcv_act_seq_META,
			base_cur_tax_amt_META,
			base_cur_tax_subttl1_META,
			base_cur_tax_subttl2_META,
			base_cur_tax_subttl3_META,
			exc_gain_loss_META,
			prnt_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected RcvAct_InfoR_MC_A(ConstMetaList<? extends RcvAct_InfoR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvAct_InfoR clone() {
		return (RcvAct_InfoR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvAct_InfoR createInstance() {
		return (RcvAct_InfoR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvAct_InfoR getValues(String... names) {
		return (RcvAct_InfoR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public String rcv_act_no() {
		return getConstString(offset + 0, $rcv_act_no);
	}

	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public void rcv_act_no(String value) {
		setConstString(offset + 0, $rcv_act_no, value);
	}


	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public MCNumber rcv_act_seq() {
		return getConstNumber(offset + 1, $rcv_act_seq);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(int value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(long value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(float value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(double value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}


	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public MCNumber rcv_act_rev() {
		return getConstNumber(offset + 2, $rcv_act_rev);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(MCNumber value) {
		setConstNumber(offset + 2, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(int value) {
		setConstNumber(offset + 2, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(long value) {
		setConstNumber(offset + 2, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(float value) {
		setConstNumber(offset + 2, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(double value) {
		setConstNumber(offset + 2, $rcv_act_rev, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 3, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 3, $data_crud_typ, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 4, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 4, $can_ac_dt, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 5, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 5, $dpt_cd, value);
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
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 7, $usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 7, $usr_cd, value);
	}


	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 8, $rcst_cd);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 8, $rcst_cd, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 9, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 9, $bcst_cd, value);
	}


	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public String cred_cd() {
		return getConstString(offset + 10, $cred_cd);
	}

	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public void cred_cd(String value) {
		setConstString(offset + 10, $cred_cd, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 11, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 11, $bill_dpt_cd, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 12, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 12, $ac_dt, value);
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 13, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 13, $ac_ym, value);
	}


	/**
	 * AR settlement method 1 債権決済方法１.<p>
	 *
	 */
	public String ar_sttl_cd1() {
		return getConstString(offset + 14, $ar_sttl_cd1);
	}

	/**
	 * AR settlement method 1 債権決済方法１.<p>
	 *
	 */
	public void ar_sttl_cd1(String value) {
		setConstString(offset + 14, $ar_sttl_cd1, value);
	}


	/**
	 * AR settlement type 1 債権決済区分１.<p>
	 *
	 */
	public String ar_sttl_typ1() {
		return getConstString(offset + 15, $ar_sttl_typ1);
	}

	/**
	 * AR settlement type 1 債権決済区分１.<p>
	 *
	 */
	public void ar_sttl_typ1(String value) {
		setConstString(offset + 15, $ar_sttl_typ1, value);
	}


	/**
	 * Tax cd. 1 税ＣＤ１.<p>
	 *
	 */
	public String tax_cd1() {
		return getConstString(offset + 16, $tax_cd1);
	}

	/**
	 * Tax cd. 1 税ＣＤ１.<p>
	 *
	 */
	public void tax_cd1(String value) {
		setConstString(offset + 16, $tax_cd1, value);
	}


	/**
	 * Tax type 1 税区分１.<p>
	 *
	 */
	public String tax_typ1() {
		return getConstString(offset + 17, $tax_typ1);
	}

	/**
	 * Tax type 1 税区分１.<p>
	 *
	 */
	public void tax_typ1(String value) {
		setConstString(offset + 17, $tax_typ1, value);
	}


	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public MCNumber tax_rate1() {
		return getConstNumber(offset + 18, $tax_rate1);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(MCNumber value) {
		setConstNumber(offset + 18, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(int value) {
		setConstNumber(offset + 18, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(long value) {
		setConstNumber(offset + 18, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(float value) {
		setConstNumber(offset + 18, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(double value) {
		setConstNumber(offset + 18, $tax_rate1, value);
	}


	/**
	 * AR settlement method 2 債権決済方法２.<p>
	 *
	 */
	public String ar_sttl_cd2() {
		return getConstString(offset + 19, $ar_sttl_cd2);
	}

	/**
	 * AR settlement method 2 債権決済方法２.<p>
	 *
	 */
	public void ar_sttl_cd2(String value) {
		setConstString(offset + 19, $ar_sttl_cd2, value);
	}


	/**
	 * AR settlement type 2 債権決済区分２.<p>
	 *
	 */
	public String ar_sttl_typ2() {
		return getConstString(offset + 20, $ar_sttl_typ2);
	}

	/**
	 * AR settlement type 2 債権決済区分２.<p>
	 *
	 */
	public void ar_sttl_typ2(String value) {
		setConstString(offset + 20, $ar_sttl_typ2, value);
	}


	/**
	 * Tax cd. 2 税ＣＤ２.<p>
	 *
	 */
	public String tax_cd2() {
		return getConstString(offset + 21, $tax_cd2);
	}

	/**
	 * Tax cd. 2 税ＣＤ２.<p>
	 *
	 */
	public void tax_cd2(String value) {
		setConstString(offset + 21, $tax_cd2, value);
	}


	/**
	 * Tax type 2 税区分２.<p>
	 *
	 */
	public String tax_typ2() {
		return getConstString(offset + 22, $tax_typ2);
	}

	/**
	 * Tax type 2 税区分２.<p>
	 *
	 */
	public void tax_typ2(String value) {
		setConstString(offset + 22, $tax_typ2, value);
	}


	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public MCNumber tax_rate2() {
		return getConstNumber(offset + 23, $tax_rate2);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(MCNumber value) {
		setConstNumber(offset + 23, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(int value) {
		setConstNumber(offset + 23, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(long value) {
		setConstNumber(offset + 23, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(float value) {
		setConstNumber(offset + 23, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(double value) {
		setConstNumber(offset + 23, $tax_rate2, value);
	}


	/**
	 * AR settlement method 3 債権決済方法３.<p>
	 *
	 */
	public String ar_sttl_cd3() {
		return getConstString(offset + 24, $ar_sttl_cd3);
	}

	/**
	 * AR settlement method 3 債権決済方法３.<p>
	 *
	 */
	public void ar_sttl_cd3(String value) {
		setConstString(offset + 24, $ar_sttl_cd3, value);
	}


	/**
	 * AR settlement type 3 債権決済区分３.<p>
	 *
	 */
	public String ar_sttl_typ3() {
		return getConstString(offset + 25, $ar_sttl_typ3);
	}

	/**
	 * AR settlement type 3 債権決済区分３.<p>
	 *
	 */
	public void ar_sttl_typ3(String value) {
		setConstString(offset + 25, $ar_sttl_typ3, value);
	}


	/**
	 * Tax cd. 3 税ＣＤ３.<p>
	 *
	 */
	public String tax_cd3() {
		return getConstString(offset + 26, $tax_cd3);
	}

	/**
	 * Tax cd. 3 税ＣＤ３.<p>
	 *
	 */
	public void tax_cd3(String value) {
		setConstString(offset + 26, $tax_cd3, value);
	}


	/**
	 * Tax type 3 税区分３.<p>
	 *
	 */
	public String tax_typ3() {
		return getConstString(offset + 27, $tax_typ3);
	}

	/**
	 * Tax type 3 税区分３.<p>
	 *
	 */
	public void tax_typ3(String value) {
		setConstString(offset + 27, $tax_typ3, value);
	}


	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public MCNumber tax_rate3() {
		return getConstNumber(offset + 28, $tax_rate3);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(MCNumber value) {
		setConstNumber(offset + 28, $tax_rate3, value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(int value) {
		setConstNumber(offset + 28, $tax_rate3, value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(long value) {
		setConstNumber(offset + 28, $tax_rate3, value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(float value) {
		setConstNumber(offset + 28, $tax_rate3, value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(double value) {
		setConstNumber(offset + 28, $tax_rate3, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 29, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 29, $trd_cd, value);
	}


	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public String ar_trd_grp_typ() {
		return getConstString(offset + 30, $ar_trd_grp_typ);
	}

	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public void ar_trd_grp_typ(String value) {
		setConstString(offset + 30, $ar_trd_grp_typ, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 31, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 31, $trd_ptn_typ, value);
	}


	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDate bill_basis_dt() {
		return getConstDate(offset + 32, $bill_basis_dt);
	}

	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public void bill_basis_dt(MCDate value) {
		setConstDate(offset + 32, $bill_basis_dt, value);
	}


	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 33, $rcv_no);
	}

	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 33, $rcv_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 34, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 34, $slo_no, value);
	}


	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCDate rcv_dt() {
		return getConstDate(offset + 35, $rcv_dt);
	}

	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public void rcv_dt(MCDate value) {
		setConstDate(offset + 35, $rcv_dt, value);
	}


	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 36, $bank_ac_cd);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 36, $bank_ac_cd, value);
	}


	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public String xfr_psn() {
		return getConstString(offset + 37, $xfr_psn);
	}

	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public void xfr_psn(String value) {
		setConstString(offset + 37, $xfr_psn, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 38, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 38, $trd_rmrks, value);
	}


	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 39, $note_no);
	}

	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 39, $note_no, value);
	}


	/**
	 * Note management No. 手形管理ＮＯ.<p>
	 *
	 */
	public String note_mng_no() {
		return getConstString(offset + 40, $note_mng_no);
	}

	/**
	 * Note management No. 手形管理ＮＯ.<p>
	 *
	 */
	public void note_mng_no(String value) {
		setConstString(offset + 40, $note_mng_no, value);
	}


	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public String note_typ() {
		return getConstString(offset + 41, $note_typ);
	}

	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public void note_typ(String value) {
		setConstString(offset + 41, $note_typ, value);
	}


	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public MCDate draw_dt() {
		return getConstDate(offset + 42, $draw_dt);
	}

	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public void draw_dt(MCDate value) {
		setConstDate(offset + 42, $draw_dt, value);
	}


	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public MCDate due_dt() {
		return getConstDate(offset + 43, $due_dt);
	}

	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public void due_dt(MCDate value) {
		setConstDate(offset + 43, $due_dt, value);
	}


	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public String drawer_nm() {
		return getConstString(offset + 44, $drawer_nm);
	}

	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public void drawer_nm(String value) {
		setConstString(offset + 44, $drawer_nm, value);
	}


	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public String draw_bank_cd() {
		return getConstString(offset + 45, $draw_bank_cd);
	}

	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public void draw_bank_cd(String value) {
		setConstString(offset + 45, $draw_bank_cd, value);
	}


	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public String draw_branch_cd() {
		return getConstString(offset + 46, $draw_branch_cd);
	}

	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public void draw_branch_cd(String value) {
		setConstString(offset + 46, $draw_branch_cd, value);
	}


	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public String endrsr() {
		return getConstString(offset + 47, $endrsr);
	}

	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public void endrsr(String value) {
		setConstString(offset + 47, $endrsr, value);
	}


	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public String accptr() {
		return getConstString(offset + 48, $accptr);
	}

	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public void accptr(String value) {
		setConstString(offset + 48, $accptr, value);
	}


	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public String note_rsn_cd() {
		return getConstString(offset + 49, $note_rsn_cd);
	}

	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public void note_rsn_cd(String value) {
		setConstString(offset + 49, $note_rsn_cd, value);
	}


	/**
	 * AR/AP BP type 債権債務先区分.<p>
	 *
	 */
	public String debt_cred_id_typ() {
		return getConstString(offset + 50, $debt_cred_id_typ);
	}

	/**
	 * AR/AP BP type 債権債務先区分.<p>
	 *
	 */
	public void debt_cred_id_typ(String value) {
		setConstString(offset + 50, $debt_cred_id_typ, value);
	}


	/**
	 * AR/AP BP cd. 債権債務先ＣＤ.<p>
	 *
	 */
	public String debt_cred_id_cd() {
		return getConstString(offset + 51, $debt_cred_id_cd);
	}

	/**
	 * AR/AP BP cd. 債権債務先ＣＤ.<p>
	 *
	 */
	public void debt_cred_id_cd(String value) {
		setConstString(offset + 51, $debt_cred_id_cd, value);
	}


	/**
	 * AR/AP BP name 債権債務先名.<p>
	 *
	 */
	public String debt_cred_nm() {
		return getConstString(offset + 52, $debt_cred_nm);
	}

	/**
	 * AR/AP BP name 債権債務先名.<p>
	 *
	 */
	public void debt_cred_nm(String value) {
		setConstString(offset + 52, $debt_cred_nm, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 53, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 53, $bd_dpt_cd, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 54, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 54, $trd_cur_cd, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 55, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 55, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 55, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 55, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 55, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 55, $xrate, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 56, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 56, $xrate_cd, value);
	}


	/**
	 * Auto-reconciliation flg. 入金自動消込ＦＬＧ.<p>
	 *
	 */
	public boolean rcv_auto_appl_flg() {
		return getConstBoolean(offset + 57, $rcv_auto_appl_flg);
	}

	/**
	 * Auto-reconciliation flg. 入金自動消込ＦＬＧ.<p>
	 *
	 */
	public void rcv_auto_appl_flg(boolean value) {
		setConstBoolean(offset + 57, $rcv_auto_appl_flg, value);
	}


	/**
	 * Display advance received on invoice 請求書前受金表示.<p>
	 *
	 */
	public boolean bill_dtl_adv_flg() {
		return getConstBoolean(offset + 58, $bill_dtl_adv_flg);
	}

	/**
	 * Display advance received on invoice 請求書前受金表示.<p>
	 *
	 */
	public void bill_dtl_adv_flg(boolean value) {
		setConstBoolean(offset + 58, $bill_dtl_adv_flg, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 59, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 59, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 60, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 60, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 61, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 61, $sub_char3, value);
	}


	/**
	 * Note spare 1 手形予備１.<p>
	 *
	 */
	public String note_sub_char1() {
		return getConstString(offset + 62, $note_sub_char1);
	}

	/**
	 * Note spare 1 手形予備１.<p>
	 *
	 */
	public void note_sub_char1(String value) {
		setConstString(offset + 62, $note_sub_char1, value);
	}


	/**
	 * Note spare 2 手形予備２.<p>
	 *
	 */
	public String note_sub_char2() {
		return getConstString(offset + 63, $note_sub_char2);
	}

	/**
	 * Note spare 2 手形予備２.<p>
	 *
	 */
	public void note_sub_char2(String value) {
		setConstString(offset + 63, $note_sub_char2, value);
	}


	/**
	 * Note spare 3 手形予備３.<p>
	 *
	 */
	public String note_sub_char3() {
		return getConstString(offset + 64, $note_sub_char3);
	}

	/**
	 * Note spare 3 手形予備３.<p>
	 *
	 */
	public void note_sub_char3(String value) {
		setConstString(offset + 64, $note_sub_char3, value);
	}


	/**
	 * Tax inclusive amount 内税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 65, $tax_amt);
	}

	/**
	 * Tax inclusive amount 内税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 65, $tax_amt, value);
	}

	/**
	 * Tax inclusive amount 内税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 65, $tax_amt, value);
	}

	/**
	 * Tax inclusive amount 内税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 65, $tax_amt, value);
	}

	/**
	 * Tax inclusive amount 内税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 65, $tax_amt, value);
	}

	/**
	 * Tax inclusive amount 内税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 65, $tax_amt, value);
	}


	/**
	 * Tax inclusive subtotal 1 内税額小計１.<p>
	 *
	 */
	public MCNumber tax_subttl1() {
		return getConstNumber(offset + 66, $tax_subttl1);
	}

	/**
	 * Tax inclusive subtotal 1 内税額小計１.<p>
	 *
	 */
	public void tax_subttl1(MCNumber value) {
		setConstNumber(offset + 66, $tax_subttl1, value);
	}

	/**
	 * Tax inclusive subtotal 1 内税額小計１.<p>
	 *
	 */
	public void tax_subttl1(int value) {
		setConstNumber(offset + 66, $tax_subttl1, value);
	}

	/**
	 * Tax inclusive subtotal 1 内税額小計１.<p>
	 *
	 */
	public void tax_subttl1(long value) {
		setConstNumber(offset + 66, $tax_subttl1, value);
	}

	/**
	 * Tax inclusive subtotal 1 内税額小計１.<p>
	 *
	 */
	public void tax_subttl1(float value) {
		setConstNumber(offset + 66, $tax_subttl1, value);
	}

	/**
	 * Tax inclusive subtotal 1 内税額小計１.<p>
	 *
	 */
	public void tax_subttl1(double value) {
		setConstNumber(offset + 66, $tax_subttl1, value);
	}


	/**
	 * Tax inclusive subtotal 2 内税額小計２.<p>
	 *
	 */
	public MCNumber tax_subttl2() {
		return getConstNumber(offset + 67, $tax_subttl2);
	}

	/**
	 * Tax inclusive subtotal 2 内税額小計２.<p>
	 *
	 */
	public void tax_subttl2(MCNumber value) {
		setConstNumber(offset + 67, $tax_subttl2, value);
	}

	/**
	 * Tax inclusive subtotal 2 内税額小計２.<p>
	 *
	 */
	public void tax_subttl2(int value) {
		setConstNumber(offset + 67, $tax_subttl2, value);
	}

	/**
	 * Tax inclusive subtotal 2 内税額小計２.<p>
	 *
	 */
	public void tax_subttl2(long value) {
		setConstNumber(offset + 67, $tax_subttl2, value);
	}

	/**
	 * Tax inclusive subtotal 2 内税額小計２.<p>
	 *
	 */
	public void tax_subttl2(float value) {
		setConstNumber(offset + 67, $tax_subttl2, value);
	}

	/**
	 * Tax inclusive subtotal 2 内税額小計２.<p>
	 *
	 */
	public void tax_subttl2(double value) {
		setConstNumber(offset + 67, $tax_subttl2, value);
	}


	/**
	 * Tax inclusive subtotal 3 内税額小計３.<p>
	 *
	 */
	public MCNumber tax_subttl3() {
		return getConstNumber(offset + 68, $tax_subttl3);
	}

	/**
	 * Tax inclusive subtotal 3 内税額小計３.<p>
	 *
	 */
	public void tax_subttl3(MCNumber value) {
		setConstNumber(offset + 68, $tax_subttl3, value);
	}

	/**
	 * Tax inclusive subtotal 3 内税額小計３.<p>
	 *
	 */
	public void tax_subttl3(int value) {
		setConstNumber(offset + 68, $tax_subttl3, value);
	}

	/**
	 * Tax inclusive subtotal 3 内税額小計３.<p>
	 *
	 */
	public void tax_subttl3(long value) {
		setConstNumber(offset + 68, $tax_subttl3, value);
	}

	/**
	 * Tax inclusive subtotal 3 内税額小計３.<p>
	 *
	 */
	public void tax_subttl3(float value) {
		setConstNumber(offset + 68, $tax_subttl3, value);
	}

	/**
	 * Tax inclusive subtotal 3 内税額小計３.<p>
	 *
	 */
	public void tax_subttl3(double value) {
		setConstNumber(offset + 68, $tax_subttl3, value);
	}


	/**
	 * Amount total 金額計.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 69, $amt);
	}

	/**
	 * Amount total 金額計.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 69, $amt, value);
	}

	/**
	 * Amount total 金額計.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 69, $amt, value);
	}

	/**
	 * Amount total 金額計.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 69, $amt, value);
	}

	/**
	 * Amount total 金額計.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 69, $amt, value);
	}

	/**
	 * Amount total 金額計.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 69, $amt, value);
	}


	/**
	 * Amount 1 total 金額１合計.<p>
	 *
	 */
	public MCNumber subttl1() {
		return getConstNumber(offset + 70, $subttl1);
	}

	/**
	 * Amount 1 total 金額１合計.<p>
	 *
	 */
	public void subttl1(MCNumber value) {
		setConstNumber(offset + 70, $subttl1, value);
	}

	/**
	 * Amount 1 total 金額１合計.<p>
	 *
	 */
	public void subttl1(int value) {
		setConstNumber(offset + 70, $subttl1, value);
	}

	/**
	 * Amount 1 total 金額１合計.<p>
	 *
	 */
	public void subttl1(long value) {
		setConstNumber(offset + 70, $subttl1, value);
	}

	/**
	 * Amount 1 total 金額１合計.<p>
	 *
	 */
	public void subttl1(float value) {
		setConstNumber(offset + 70, $subttl1, value);
	}

	/**
	 * Amount 1 total 金額１合計.<p>
	 *
	 */
	public void subttl1(double value) {
		setConstNumber(offset + 70, $subttl1, value);
	}


	/**
	 * Amount 2 total 金額２合計.<p>
	 *
	 */
	public MCNumber subttl2() {
		return getConstNumber(offset + 71, $subttl2);
	}

	/**
	 * Amount 2 total 金額２合計.<p>
	 *
	 */
	public void subttl2(MCNumber value) {
		setConstNumber(offset + 71, $subttl2, value);
	}

	/**
	 * Amount 2 total 金額２合計.<p>
	 *
	 */
	public void subttl2(int value) {
		setConstNumber(offset + 71, $subttl2, value);
	}

	/**
	 * Amount 2 total 金額２合計.<p>
	 *
	 */
	public void subttl2(long value) {
		setConstNumber(offset + 71, $subttl2, value);
	}

	/**
	 * Amount 2 total 金額２合計.<p>
	 *
	 */
	public void subttl2(float value) {
		setConstNumber(offset + 71, $subttl2, value);
	}

	/**
	 * Amount 2 total 金額２合計.<p>
	 *
	 */
	public void subttl2(double value) {
		setConstNumber(offset + 71, $subttl2, value);
	}


	/**
	 * Amount 3 total 金額３合計.<p>
	 *
	 */
	public MCNumber subttl3() {
		return getConstNumber(offset + 72, $subttl3);
	}

	/**
	 * Amount 3 total 金額３合計.<p>
	 *
	 */
	public void subttl3(MCNumber value) {
		setConstNumber(offset + 72, $subttl3, value);
	}

	/**
	 * Amount 3 total 金額３合計.<p>
	 *
	 */
	public void subttl3(int value) {
		setConstNumber(offset + 72, $subttl3, value);
	}

	/**
	 * Amount 3 total 金額３合計.<p>
	 *
	 */
	public void subttl3(long value) {
		setConstNumber(offset + 72, $subttl3, value);
	}

	/**
	 * Amount 3 total 金額３合計.<p>
	 *
	 */
	public void subttl3(float value) {
		setConstNumber(offset + 72, $subttl3, value);
	}

	/**
	 * Amount 3 total 金額３合計.<p>
	 *
	 */
	public void subttl3(double value) {
		setConstNumber(offset + 72, $subttl3, value);
	}


	/**
	 * Payment received reference date and time 入金参照日時.<p>
	 *
	 */
	public MCTimestamp rcv_ref_time() {
		return getConstTimestamp(offset + 73, $rcv_ref_time);
	}

	/**
	 * Payment received reference date and time 入金参照日時.<p>
	 *
	 */
	public void rcv_ref_time(MCTimestamp value) {
		setConstTimestamp(offset + 73, $rcv_ref_time, value);
	}


	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 74, $slip_sts_typ);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 74, $slip_sts_typ, value);
	}


	/**
	 * Settlement flg. 決済ＦＬＧ.<p>
	 *
	 */
	public boolean mat_flg() {
		return getConstBoolean(offset + 75, $mat_flg);
	}

	/**
	 * Settlement flg. 決済ＦＬＧ.<p>
	 *
	 */
	public void mat_flg(boolean value) {
		setConstBoolean(offset + 75, $mat_flg, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 76, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 76, $base_cur_cd, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 77, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 77, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 77, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 77, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 77, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 77, $amt_dec_place, value);
	}


	/**
	 * Base amount total 基準金額計.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 78, $base_cur_amt);
	}

	/**
	 * Base amount total 基準金額計.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 78, $base_cur_amt, value);
	}

	/**
	 * Base amount total 基準金額計.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 78, $base_cur_amt, value);
	}

	/**
	 * Base amount total 基準金額計.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 78, $base_cur_amt, value);
	}

	/**
	 * Base amount total 基準金額計.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 78, $base_cur_amt, value);
	}

	/**
	 * Base amount total 基準金額計.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 78, $base_cur_amt, value);
	}


	/**
	 * Base amount 1 基準金額１.<p>
	 *
	 */
	public MCNumber base_cur_subttl1() {
		return getConstNumber(offset + 79, $base_cur_subttl1);
	}

	/**
	 * Base amount 1 基準金額１.<p>
	 *
	 */
	public void base_cur_subttl1(MCNumber value) {
		setConstNumber(offset + 79, $base_cur_subttl1, value);
	}

	/**
	 * Base amount 1 基準金額１.<p>
	 *
	 */
	public void base_cur_subttl1(int value) {
		setConstNumber(offset + 79, $base_cur_subttl1, value);
	}

	/**
	 * Base amount 1 基準金額１.<p>
	 *
	 */
	public void base_cur_subttl1(long value) {
		setConstNumber(offset + 79, $base_cur_subttl1, value);
	}

	/**
	 * Base amount 1 基準金額１.<p>
	 *
	 */
	public void base_cur_subttl1(float value) {
		setConstNumber(offset + 79, $base_cur_subttl1, value);
	}

	/**
	 * Base amount 1 基準金額１.<p>
	 *
	 */
	public void base_cur_subttl1(double value) {
		setConstNumber(offset + 79, $base_cur_subttl1, value);
	}


	/**
	 * Base amount 2 基準金額２.<p>
	 *
	 */
	public MCNumber base_cur_subttl2() {
		return getConstNumber(offset + 80, $base_cur_subttl2);
	}

	/**
	 * Base amount 2 基準金額２.<p>
	 *
	 */
	public void base_cur_subttl2(MCNumber value) {
		setConstNumber(offset + 80, $base_cur_subttl2, value);
	}

	/**
	 * Base amount 2 基準金額２.<p>
	 *
	 */
	public void base_cur_subttl2(int value) {
		setConstNumber(offset + 80, $base_cur_subttl2, value);
	}

	/**
	 * Base amount 2 基準金額２.<p>
	 *
	 */
	public void base_cur_subttl2(long value) {
		setConstNumber(offset + 80, $base_cur_subttl2, value);
	}

	/**
	 * Base amount 2 基準金額２.<p>
	 *
	 */
	public void base_cur_subttl2(float value) {
		setConstNumber(offset + 80, $base_cur_subttl2, value);
	}

	/**
	 * Base amount 2 基準金額２.<p>
	 *
	 */
	public void base_cur_subttl2(double value) {
		setConstNumber(offset + 80, $base_cur_subttl2, value);
	}


	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public MCNumber base_cur_subttl3() {
		return getConstNumber(offset + 81, $base_cur_subttl3);
	}

	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public void base_cur_subttl3(MCNumber value) {
		setConstNumber(offset + 81, $base_cur_subttl3, value);
	}

	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public void base_cur_subttl3(int value) {
		setConstNumber(offset + 81, $base_cur_subttl3, value);
	}

	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public void base_cur_subttl3(long value) {
		setConstNumber(offset + 81, $base_cur_subttl3, value);
	}

	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public void base_cur_subttl3(float value) {
		setConstNumber(offset + 81, $base_cur_subttl3, value);
	}

	/**
	 * Base amount 3 基準金額３.<p>
	 *
	 */
	public void base_cur_subttl3(double value) {
		setConstNumber(offset + 81, $base_cur_subttl3, value);
	}


	/**
	 * Parent incoming payment result No. 親入金実績ＮＯ.<p>
	 *
	 */
	public String par_rcv_act_no() {
		return getConstString(offset + 82, $par_rcv_act_no);
	}

	/**
	 * Parent incoming payment result No. 親入金実績ＮＯ.<p>
	 *
	 */
	public void par_rcv_act_no(String value) {
		setConstString(offset + 82, $par_rcv_act_no, value);
	}


	/**
	 * Parent incoming payment result sequence number 親入金実績連番.<p>
	 *
	 */
	public MCNumber par_rcv_act_seq() {
		return getConstNumber(offset + 83, $par_rcv_act_seq);
	}

	/**
	 * Parent incoming payment result sequence number 親入金実績連番.<p>
	 *
	 */
	public void par_rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 83, $par_rcv_act_seq, value);
	}

	/**
	 * Parent incoming payment result sequence number 親入金実績連番.<p>
	 *
	 */
	public void par_rcv_act_seq(int value) {
		setConstNumber(offset + 83, $par_rcv_act_seq, value);
	}

	/**
	 * Parent incoming payment result sequence number 親入金実績連番.<p>
	 *
	 */
	public void par_rcv_act_seq(long value) {
		setConstNumber(offset + 83, $par_rcv_act_seq, value);
	}

	/**
	 * Parent incoming payment result sequence number 親入金実績連番.<p>
	 *
	 */
	public void par_rcv_act_seq(float value) {
		setConstNumber(offset + 83, $par_rcv_act_seq, value);
	}

	/**
	 * Parent incoming payment result sequence number 親入金実績連番.<p>
	 *
	 */
	public void par_rcv_act_seq(double value) {
		setConstNumber(offset + 83, $par_rcv_act_seq, value);
	}


	/**
	 * Base tax amount 基準消費税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 84, $base_cur_tax_amt);
	}

	/**
	 * Base tax amount 基準消費税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 84, $base_cur_tax_amt, value);
	}

	/**
	 * Base tax amount 基準消費税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 84, $base_cur_tax_amt, value);
	}

	/**
	 * Base tax amount 基準消費税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 84, $base_cur_tax_amt, value);
	}

	/**
	 * Base tax amount 基準消費税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 84, $base_cur_tax_amt, value);
	}

	/**
	 * Base tax amount 基準消費税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 84, $base_cur_tax_amt, value);
	}


	/**
	 * Tax inclusive subtotal 1 (Base currency) 基準通貨内消費税小計１.<p>
	 *
	 */
	public MCNumber base_cur_tax_subttl1() {
		return getConstNumber(offset + 85, $base_cur_tax_subttl1);
	}

	/**
	 * Tax inclusive subtotal 1 (Base currency) 基準通貨内消費税小計１.<p>
	 *
	 */
	public void base_cur_tax_subttl1(MCNumber value) {
		setConstNumber(offset + 85, $base_cur_tax_subttl1, value);
	}

	/**
	 * Tax inclusive subtotal 1 (Base currency) 基準通貨内消費税小計１.<p>
	 *
	 */
	public void base_cur_tax_subttl1(int value) {
		setConstNumber(offset + 85, $base_cur_tax_subttl1, value);
	}

	/**
	 * Tax inclusive subtotal 1 (Base currency) 基準通貨内消費税小計１.<p>
	 *
	 */
	public void base_cur_tax_subttl1(long value) {
		setConstNumber(offset + 85, $base_cur_tax_subttl1, value);
	}

	/**
	 * Tax inclusive subtotal 1 (Base currency) 基準通貨内消費税小計１.<p>
	 *
	 */
	public void base_cur_tax_subttl1(float value) {
		setConstNumber(offset + 85, $base_cur_tax_subttl1, value);
	}

	/**
	 * Tax inclusive subtotal 1 (Base currency) 基準通貨内消費税小計１.<p>
	 *
	 */
	public void base_cur_tax_subttl1(double value) {
		setConstNumber(offset + 85, $base_cur_tax_subttl1, value);
	}


	/**
	 * Tax inclusive subtotal 2 (Base currency) 基準通貨内消費税小計２.<p>
	 *
	 */
	public MCNumber base_cur_tax_subttl2() {
		return getConstNumber(offset + 86, $base_cur_tax_subttl2);
	}

	/**
	 * Tax inclusive subtotal 2 (Base currency) 基準通貨内消費税小計２.<p>
	 *
	 */
	public void base_cur_tax_subttl2(MCNumber value) {
		setConstNumber(offset + 86, $base_cur_tax_subttl2, value);
	}

	/**
	 * Tax inclusive subtotal 2 (Base currency) 基準通貨内消費税小計２.<p>
	 *
	 */
	public void base_cur_tax_subttl2(int value) {
		setConstNumber(offset + 86, $base_cur_tax_subttl2, value);
	}

	/**
	 * Tax inclusive subtotal 2 (Base currency) 基準通貨内消費税小計２.<p>
	 *
	 */
	public void base_cur_tax_subttl2(long value) {
		setConstNumber(offset + 86, $base_cur_tax_subttl2, value);
	}

	/**
	 * Tax inclusive subtotal 2 (Base currency) 基準通貨内消費税小計２.<p>
	 *
	 */
	public void base_cur_tax_subttl2(float value) {
		setConstNumber(offset + 86, $base_cur_tax_subttl2, value);
	}

	/**
	 * Tax inclusive subtotal 2 (Base currency) 基準通貨内消費税小計２.<p>
	 *
	 */
	public void base_cur_tax_subttl2(double value) {
		setConstNumber(offset + 86, $base_cur_tax_subttl2, value);
	}


	/**
	 * Tax inclusive subtotal 3 (Base currency) 基準通貨内消費税小計３.<p>
	 *
	 */
	public MCNumber base_cur_tax_subttl3() {
		return getConstNumber(offset + 87, $base_cur_tax_subttl3);
	}

	/**
	 * Tax inclusive subtotal 3 (Base currency) 基準通貨内消費税小計３.<p>
	 *
	 */
	public void base_cur_tax_subttl3(MCNumber value) {
		setConstNumber(offset + 87, $base_cur_tax_subttl3, value);
	}

	/**
	 * Tax inclusive subtotal 3 (Base currency) 基準通貨内消費税小計３.<p>
	 *
	 */
	public void base_cur_tax_subttl3(int value) {
		setConstNumber(offset + 87, $base_cur_tax_subttl3, value);
	}

	/**
	 * Tax inclusive subtotal 3 (Base currency) 基準通貨内消費税小計３.<p>
	 *
	 */
	public void base_cur_tax_subttl3(long value) {
		setConstNumber(offset + 87, $base_cur_tax_subttl3, value);
	}

	/**
	 * Tax inclusive subtotal 3 (Base currency) 基準通貨内消費税小計３.<p>
	 *
	 */
	public void base_cur_tax_subttl3(float value) {
		setConstNumber(offset + 87, $base_cur_tax_subttl3, value);
	}

	/**
	 * Tax inclusive subtotal 3 (Base currency) 基準通貨内消費税小計３.<p>
	 *
	 */
	public void base_cur_tax_subttl3(double value) {
		setConstNumber(offset + 87, $base_cur_tax_subttl3, value);
	}


	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public MCNumber exc_gain_loss() {
		return getConstNumber(offset + 88, $exc_gain_loss);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(MCNumber value) {
		setConstNumber(offset + 88, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(int value) {
		setConstNumber(offset + 88, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(long value) {
		setConstNumber(offset + 88, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(float value) {
		setConstNumber(offset + 88, $exc_gain_loss, value);
	}

	/**
	 * Exchange gain/loss 為替差損益.<p>
	 *
	 */
	public void exc_gain_loss(double value) {
		setConstNumber(offset + 88, $exc_gain_loss, value);
	}


	/**
	 * Issued flg. 発行済ＦＬＧ.<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 89, $prnt_flg);
	}

	/**
	 * Issued flg. 発行済ＦＬＧ.<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 89, $prnt_flg, value);
	}


	public String getString(String name) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			return ar_sttl_typ1();
		}
		if ($tax_cd1.equalsIgnoreCase(name)) {
			return tax_cd1();
		}
		if ($tax_typ1.equalsIgnoreCase(name)) {
			return tax_typ1();
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			return ar_sttl_cd2();
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			return ar_sttl_typ2();
		}
		if ($tax_cd2.equalsIgnoreCase(name)) {
			return tax_cd2();
		}
		if ($tax_typ2.equalsIgnoreCase(name)) {
			return tax_typ2();
		}
		if ($ar_sttl_cd3.equalsIgnoreCase(name)) {
			return ar_sttl_cd3();
		}
		if ($ar_sttl_typ3.equalsIgnoreCase(name)) {
			return ar_sttl_typ3();
		}
		if ($tax_cd3.equalsIgnoreCase(name)) {
			return tax_cd3();
		}
		if ($tax_typ3.equalsIgnoreCase(name)) {
			return tax_typ3();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($note_mng_no.equalsIgnoreCase(name)) {
			return note_mng_no();
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			return note_typ();
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			return drawer_nm();
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			return draw_bank_cd();
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			return draw_branch_cd();
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			return endrsr();
		}
		if ($accptr.equalsIgnoreCase(name)) {
			return accptr();
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			return note_rsn_cd();
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			return debt_cred_id_typ();
		}
		if ($debt_cred_id_cd.equalsIgnoreCase(name)) {
			return debt_cred_id_cd();
		}
		if ($debt_cred_nm.equalsIgnoreCase(name)) {
			return debt_cred_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
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
		if ($note_sub_char1.equalsIgnoreCase(name)) {
			return note_sub_char1();
		}
		if ($note_sub_char2.equalsIgnoreCase(name)) {
			return note_sub_char2();
		}
		if ($note_sub_char3.equalsIgnoreCase(name)) {
			return note_sub_char3();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($par_rcv_act_no.equalsIgnoreCase(name)) {
			return par_rcv_act_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			return rcv_act_rev();
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			return tax_rate1();
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			return tax_rate2();
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			return tax_rate3();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			return tax_subttl1();
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			return tax_subttl2();
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			return tax_subttl3();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			return subttl1();
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			return subttl2();
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			return subttl3();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			return base_cur_subttl1();
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			return base_cur_subttl2();
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			return base_cur_subttl3();
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			return par_rcv_act_seq();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			return base_cur_tax_subttl1();
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			return base_cur_tax_subttl2();
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			return base_cur_tax_subttl3();
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			return exc_gain_loss();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			return draw_dt();
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($rcv_ref_time.equalsIgnoreCase(name)) {
			return rcv_ref_time();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($rcv_auto_appl_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_flg();
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_adv_flg();
		}
		if ($mat_flg.equalsIgnoreCase(name)) {
			return mat_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			return ar_sttl_typ1();
		}
		if ($tax_cd1.equalsIgnoreCase(name)) {
			return tax_cd1();
		}
		if ($tax_typ1.equalsIgnoreCase(name)) {
			return tax_typ1();
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			return ar_sttl_cd2();
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			return ar_sttl_typ2();
		}
		if ($tax_cd2.equalsIgnoreCase(name)) {
			return tax_cd2();
		}
		if ($tax_typ2.equalsIgnoreCase(name)) {
			return tax_typ2();
		}
		if ($ar_sttl_cd3.equalsIgnoreCase(name)) {
			return ar_sttl_cd3();
		}
		if ($ar_sttl_typ3.equalsIgnoreCase(name)) {
			return ar_sttl_typ3();
		}
		if ($tax_cd3.equalsIgnoreCase(name)) {
			return tax_cd3();
		}
		if ($tax_typ3.equalsIgnoreCase(name)) {
			return tax_typ3();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($note_mng_no.equalsIgnoreCase(name)) {
			return note_mng_no();
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			return note_typ();
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			return drawer_nm();
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			return draw_bank_cd();
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			return draw_branch_cd();
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			return endrsr();
		}
		if ($accptr.equalsIgnoreCase(name)) {
			return accptr();
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			return note_rsn_cd();
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			return debt_cred_id_typ();
		}
		if ($debt_cred_id_cd.equalsIgnoreCase(name)) {
			return debt_cred_id_cd();
		}
		if ($debt_cred_nm.equalsIgnoreCase(name)) {
			return debt_cred_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
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
		if ($note_sub_char1.equalsIgnoreCase(name)) {
			return note_sub_char1();
		}
		if ($note_sub_char2.equalsIgnoreCase(name)) {
			return note_sub_char2();
		}
		if ($note_sub_char3.equalsIgnoreCase(name)) {
			return note_sub_char3();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($par_rcv_act_no.equalsIgnoreCase(name)) {
			return par_rcv_act_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			return rcv_act_rev();
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			return tax_rate1();
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			return tax_rate2();
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			return tax_rate3();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			return tax_subttl1();
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			return tax_subttl2();
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			return tax_subttl3();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			return subttl1();
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			return subttl2();
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			return subttl3();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			return base_cur_subttl1();
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			return base_cur_subttl2();
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			return base_cur_subttl3();
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			return par_rcv_act_seq();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			return base_cur_tax_subttl1();
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			return base_cur_tax_subttl2();
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			return base_cur_tax_subttl3();
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			return exc_gain_loss();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			return draw_dt();
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($rcv_ref_time.equalsIgnoreCase(name)) {
			return rcv_ref_time();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($rcv_auto_appl_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_flg();
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_adv_flg();
		}
		if ($mat_flg.equalsIgnoreCase(name)) {
			return mat_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			ar_sttl_typ1(value);
			return;
		}
		if ($tax_cd1.equalsIgnoreCase(name)) {
			tax_cd1(value);
			return;
		}
		if ($tax_typ1.equalsIgnoreCase(name)) {
			tax_typ1(value);
			return;
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			ar_sttl_cd2(value);
			return;
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			ar_sttl_typ2(value);
			return;
		}
		if ($tax_cd2.equalsIgnoreCase(name)) {
			tax_cd2(value);
			return;
		}
		if ($tax_typ2.equalsIgnoreCase(name)) {
			tax_typ2(value);
			return;
		}
		if ($ar_sttl_cd3.equalsIgnoreCase(name)) {
			ar_sttl_cd3(value);
			return;
		}
		if ($ar_sttl_typ3.equalsIgnoreCase(name)) {
			ar_sttl_typ3(value);
			return;
		}
		if ($tax_cd3.equalsIgnoreCase(name)) {
			tax_cd3(value);
			return;
		}
		if ($tax_typ3.equalsIgnoreCase(name)) {
			tax_typ3(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($note_mng_no.equalsIgnoreCase(name)) {
			note_mng_no(value);
			return;
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			note_typ(value);
			return;
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			drawer_nm(value);
			return;
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			draw_bank_cd(value);
			return;
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			draw_branch_cd(value);
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
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			note_rsn_cd(value);
			return;
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			debt_cred_id_typ(value);
			return;
		}
		if ($debt_cred_id_cd.equalsIgnoreCase(name)) {
			debt_cred_id_cd(value);
			return;
		}
		if ($debt_cred_nm.equalsIgnoreCase(name)) {
			debt_cred_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
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
		if ($note_sub_char1.equalsIgnoreCase(name)) {
			note_sub_char1(value);
			return;
		}
		if ($note_sub_char2.equalsIgnoreCase(name)) {
			note_sub_char2(value);
			return;
		}
		if ($note_sub_char3.equalsIgnoreCase(name)) {
			note_sub_char3(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($par_rcv_act_no.equalsIgnoreCase(name)) {
			par_rcv_act_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			base_cur_subttl1(value);
			return;
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			base_cur_subttl2(value);
			return;
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			base_cur_subttl3(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			base_cur_tax_subttl2(value);
			return;
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			base_cur_tax_subttl3(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			base_cur_subttl1(value);
			return;
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			base_cur_subttl2(value);
			return;
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			base_cur_subttl3(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			base_cur_tax_subttl2(value);
			return;
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			base_cur_tax_subttl3(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			base_cur_subttl1(value);
			return;
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			base_cur_subttl2(value);
			return;
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			base_cur_subttl3(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			base_cur_tax_subttl2(value);
			return;
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			base_cur_tax_subttl3(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			base_cur_subttl1(value);
			return;
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			base_cur_subttl2(value);
			return;
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			base_cur_subttl3(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			base_cur_tax_subttl2(value);
			return;
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			base_cur_tax_subttl3(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			base_cur_subttl1(value);
			return;
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			base_cur_subttl2(value);
			return;
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			base_cur_subttl3(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			base_cur_tax_subttl2(value);
			return;
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			base_cur_tax_subttl3(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
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
	public void setTimestamp(String name, MCTimestamp value) {
		if ($rcv_ref_time.equalsIgnoreCase(name)) {
			rcv_ref_time(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($rcv_auto_appl_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_flg(value);
			return;
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			bill_dtl_adv_flg(value);
			return;
		}
		if ($mat_flg.equalsIgnoreCase(name)) {
			mat_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			ar_sttl_typ1(value);
			return;
		}
		if ($tax_cd1.equalsIgnoreCase(name)) {
			tax_cd1(value);
			return;
		}
		if ($tax_typ1.equalsIgnoreCase(name)) {
			tax_typ1(value);
			return;
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			ar_sttl_cd2(value);
			return;
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			ar_sttl_typ2(value);
			return;
		}
		if ($tax_cd2.equalsIgnoreCase(name)) {
			tax_cd2(value);
			return;
		}
		if ($tax_typ2.equalsIgnoreCase(name)) {
			tax_typ2(value);
			return;
		}
		if ($ar_sttl_cd3.equalsIgnoreCase(name)) {
			ar_sttl_cd3(value);
			return;
		}
		if ($ar_sttl_typ3.equalsIgnoreCase(name)) {
			ar_sttl_typ3(value);
			return;
		}
		if ($tax_cd3.equalsIgnoreCase(name)) {
			tax_cd3(value);
			return;
		}
		if ($tax_typ3.equalsIgnoreCase(name)) {
			tax_typ3(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($note_mng_no.equalsIgnoreCase(name)) {
			note_mng_no(value);
			return;
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			note_typ(value);
			return;
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			drawer_nm(value);
			return;
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			draw_bank_cd(value);
			return;
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			draw_branch_cd(value);
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
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			note_rsn_cd(value);
			return;
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			debt_cred_id_typ(value);
			return;
		}
		if ($debt_cred_id_cd.equalsIgnoreCase(name)) {
			debt_cred_id_cd(value);
			return;
		}
		if ($debt_cred_nm.equalsIgnoreCase(name)) {
			debt_cred_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
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
		if ($note_sub_char1.equalsIgnoreCase(name)) {
			note_sub_char1(value);
			return;
		}
		if ($note_sub_char2.equalsIgnoreCase(name)) {
			note_sub_char2(value);
			return;
		}
		if ($note_sub_char3.equalsIgnoreCase(name)) {
			note_sub_char3(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($par_rcv_act_no.equalsIgnoreCase(name)) {
			par_rcv_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			base_cur_subttl1(value);
			return;
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			base_cur_subttl2(value);
			return;
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			base_cur_subttl3(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			base_cur_tax_subttl2(value);
			return;
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			base_cur_tax_subttl3(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			base_cur_subttl1(value);
			return;
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			base_cur_subttl2(value);
			return;
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			base_cur_subttl3(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			base_cur_tax_subttl2(value);
			return;
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			base_cur_tax_subttl3(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			base_cur_subttl1(value);
			return;
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			base_cur_subttl2(value);
			return;
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			base_cur_subttl3(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			base_cur_tax_subttl2(value);
			return;
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			base_cur_tax_subttl3(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			base_cur_subttl1(value);
			return;
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			base_cur_subttl2(value);
			return;
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			base_cur_subttl3(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			base_cur_tax_subttl2(value);
			return;
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			base_cur_tax_subttl3(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($tax_subttl2.equalsIgnoreCase(name)) {
			tax_subttl2(value);
			return;
		}
		if ($tax_subttl3.equalsIgnoreCase(name)) {
			tax_subttl3(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($subttl1.equalsIgnoreCase(name)) {
			subttl1(value);
			return;
		}
		if ($subttl2.equalsIgnoreCase(name)) {
			subttl2(value);
			return;
		}
		if ($subttl3.equalsIgnoreCase(name)) {
			subttl3(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_subttl1.equalsIgnoreCase(name)) {
			base_cur_subttl1(value);
			return;
		}
		if ($base_cur_subttl2.equalsIgnoreCase(name)) {
			base_cur_subttl2(value);
			return;
		}
		if ($base_cur_subttl3.equalsIgnoreCase(name)) {
			base_cur_subttl3(value);
			return;
		}
		if ($par_rcv_act_seq.equalsIgnoreCase(name)) {
			par_rcv_act_seq(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl2.equalsIgnoreCase(name)) {
			base_cur_tax_subttl2(value);
			return;
		}
		if ($base_cur_tax_subttl3.equalsIgnoreCase(name)) {
			base_cur_tax_subttl3(value);
			return;
		}
		if ($exc_gain_loss.equalsIgnoreCase(name)) {
			exc_gain_loss(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
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
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($rcv_ref_time.equalsIgnoreCase(name)) {
			rcv_ref_time(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($rcv_auto_appl_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_flg(value);
			return;
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			bill_dtl_adv_flg(value);
			return;
		}
		if ($mat_flg.equalsIgnoreCase(name)) {
			mat_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

