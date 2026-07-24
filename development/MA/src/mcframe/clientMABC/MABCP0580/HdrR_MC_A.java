package mcframe.clientMABC.MABCP0580;

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
 * ブロック"Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrR_MC_A extends MCConstRow {

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public static final String $bsppl_flg = "bsppl_flg";
	/**
	 * Payee 支払先.<p>
	 *
	 */
	public static final String $psppl_flg = "psppl_flg";
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
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $check_bsppl_dpt_cd = "check_bsppl_dpt_cd";
	/**
	 * AP credit managed BP cd. 債務与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $ap_cred_cd = "ap_cred_cd";
	/**
	 * AP credit managed BP name 債務与信管理先名.<p>
	 *
	 */
	public static final String $ap_cred_nm = "ap_cred_nm";
	/**
	 * Purchase temporary unit price closing 仕入仮単価締.<p>
	 *
	 */
	public static final String $purc_interim_cl_flg = "purc_interim_cl_flg";
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
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public static final String $pay_spot_flg = "pay_spot_flg";
	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public static final String $psppl_cl_day1 = "psppl_cl_day1";
	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public static final String $psppl_cl_day2 = "psppl_cl_day2";
	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public static final String $psppl_cl_day3 = "psppl_cl_day3";
	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public static final String $psppl_cl_day4 = "psppl_cl_day4";
	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public static final String $psppl_cl_day5 = "psppl_cl_day5";
	/**
	 * AP offset group cd. 債務相殺グループＣＤ.<p>
	 *
	 */
	public static final String $ap_setoff_grp_cd = "ap_setoff_grp_cd";
	/**
	 * AP offset group name 債務相殺グループ名.<p>
	 *
	 */
	public static final String $ap_setoff_grp_nm = "ap_setoff_grp_nm";
	/**
	 * Payment tax calculation 支払税計算.<p>
	 *
	 */
	public static final String $tax_on_pay_flg = "tax_on_pay_flg";
	/**
	 * Payment tax amount rounding type 支払税額端数処理区分.<p>
	 *
	 */
	public static final String $pay_tax_rnd_typ = "pay_tax_rnd_typ";
	/**
	 * Payment tax amount rounding type name 支払税額端数処理区分名.<p>
	 *
	 */
	public static final String $pay_tax_rnd_typ_nm = "pay_tax_rnd_typ_nm";
	/**
	 * Payment schedule before/after type 支払予定前後区分.<p>
	 *
	 */
	public static final String $pay_schd_ba_typ = "pay_schd_ba_typ";
	/**
	 * Payment schedule before/after type name 支払予定前後区分名.<p>
	 *
	 */
	public static final String $pay_schd_ba_typ_nm = "pay_schd_ba_typ_nm";
	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public static final String $batch_pay_schd_cl_flg = "batch_pay_schd_cl_flg";
	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public static final String $pay_schd_cl_delay_days = "pay_schd_cl_delay_days";
	/**
	 * Payment schedule closing before/after type 支払予定締前後区分.<p>
	 *
	 */
	public static final String $pay_schd_cl_ba_typ = "pay_schd_cl_ba_typ";
	/**
	 * Payment schedule closing before/after type name 支払予定締前後区分名.<p>
	 *
	 */
	public static final String $pay_schd_cl_ba_typ_nm = "pay_schd_cl_ba_typ_nm";
	/**
	 * Report issue type (Scheduled payee) 帳票発行区分（支払予定管理先）.<p>
	 *
	 */
	public static final String $bsppl_prnt_typ = "bsppl_prnt_typ";
	/**
	 * Report issue type name (Scheduled payee) 帳票発行区分名（支払予定管理先）.<p>
	 *
	 */
	public static final String $bsppl_prnt_typ_nm = "bsppl_prnt_typ_nm";
	/**
	 * Payment notice to be issued 支払通知書発行対象.<p>
	 *
	 */
	public static final String $pay_ntc_prnt_flg = "pay_ntc_prnt_flg";
	/**
	 * Payment notice send-to zip code 支払通知書送付郵便番号.<p>
	 *
	 */
	public static final String $pay_ntc_zip_cd = "pay_ntc_zip_cd";
	/**
	 * Payment notice send-to address 1 支払通知書送付住所１.<p>
	 *
	 */
	public static final String $pay_ntc_addr1 = "pay_ntc_addr1";
	/**
	 * Payment notice send-to address 2 支払通知書送付住所２.<p>
	 *
	 */
	public static final String $pay_ntc_addr2 = "pay_ntc_addr2";
	/**
	 * Payment notice send-to address 3 支払通知書送付住所３.<p>
	 *
	 */
	public static final String $pay_ntc_addr3 = "pay_ntc_addr3";
	/**
	 * Payment notice send-to address 4 支払通知書送付住所４.<p>
	 *
	 */
	public static final String $pay_ntc_addr4 = "pay_ntc_addr4";
	/**
	 * Payment notice send-to TEL 支払通知書送付ＴＥＬ.<p>
	 *
	 */
	public static final String $pay_ntc_tel = "pay_ntc_tel";
	/**
	 * Payment notice destination 支払通知書宛先.<p>
	 *
	 */
	public static final String $pay_ntc_bsppl_nm = "pay_ntc_bsppl_nm";
	/**
	 * Payment notice send-to dept. 支払通知書送付部署.<p>
	 *
	 */
	public static final String $pay_ntc_bsppl_dpt = "pay_ntc_bsppl_dpt";
	/**
	 * Payment notice send-to PIC 支払通知書送付担当者.<p>
	 *
	 */
	public static final String $pay_ntc_bsppl_psn = "pay_ntc_bsppl_psn";
	/**
	 * Payment notice send-to PIC honorific title 支払通知書送付担当者敬称.<p>
	 *
	 */
	public static final String $pay_ntc_bsppl_psn_title = "pay_ntc_bsppl_psn_title";
	/**
	 * Output payment notice details 支払通知書明細出力.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_outp_flg = "pay_ntc_dtl_outp_flg";
	/**
	 * Display balance of previous month on payment notice 支払通知書前月残高表示.<p>
	 *
	 */
	public static final String $pay_ntc_bfw_bal_disp_flg = "pay_ntc_bfw_bal_disp_flg";
	/**
	 * Display advance payment on payment notice 支払通知書前渡金表示.<p>
	 *
	 */
	public static final String $pay_ntc_adv_pay_flg = "pay_ntc_adv_pay_flg";
	/**
	 * Display payment schedule on payment notice 支払通知書支払予定表示.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_pay_flg = "pay_ntc_dtl_pay_flg";
	/**
	 * Payment notice details subtotal type 支払通知書明細小計区分.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_subttl_typ = "pay_ntc_dtl_subttl_typ";
	/**
	 * Payment notice details subtotal type name 支払通知書明細小計区分名.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_subttl_typ_nm = "pay_ntc_dtl_subttl_typ_nm";
	/**
	 * Payment notice details page break type 支払通知書明細改頁区分.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_brk_typ = "pay_ntc_dtl_brk_typ";
	/**
	 * Payment notice details page break type name 支払通知書明細改頁区分名.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_brk_typ_nm = "pay_ntc_dtl_brk_typ_nm";
	/**
	 * Payment notice details sorting order type 支払通知書明細並順区分.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_sort_typ = "pay_ntc_dtl_sort_typ";
	/**
	 * Payment notice details sorting order type name 支払通知書明細並順区分名.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_sort_typ_nm = "pay_ntc_dtl_sort_typ_nm";
	/**
	 * Payment notice cancel slip display type 支払通知書取消伝票表示区分.<p>
	 *
	 */
	public static final String $pay_ntc_can_slip_typ = "pay_ntc_can_slip_typ";
	/**
	 * Payment notice cancel slip display type name 支払通知書取消伝票表示区分名.<p>
	 *
	 */
	public static final String $pay_ntc_can_slip_typ_nm = "pay_ntc_can_slip_typ_nm";
	/**
	 * Payee remarks 支払先備考.<p>
	 *
	 */
	public static final String $psppl_rmrks = "psppl_rmrks";
	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public static final String $note_days = "note_days";
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
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public static final String $check_pay_dpt_cd = "check_pay_dpt_cd";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
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
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";
	/**
	 * Report issue type (Payee) 帳票発行区分（支払先）.<p>
	 *
	 */
	public static final String $psppl_prnt_typ = "psppl_prnt_typ";
	/**
	 * Report issue type name (Payee) 帳票発行区分名（支払先）.<p>
	 *
	 */
	public static final String $psppl_prnt_typ_nm = "psppl_prnt_typ_nm";


	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_flg_META = createCommonMeta($bsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_flg_META = createCommonMeta($psppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta psppl_nm_META = createCommonMeta($psppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bsppl_dpt_nm_META = createCommonMeta($bsppl_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta check_bsppl_dpt_cd_META = createCommonMeta($check_bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_cred_cd_META = createCommonMeta($ap_cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ap_cred_nm_META = createCommonMeta($ap_cred_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta purc_interim_cl_flg_META = createCommonMeta($purc_interim_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_bank_ac_cd_META = createCommonMeta($pay_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta pay_bank_ac_nm_META = createCommonMeta($pay_bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta pay_spot_flg_META = createCommonMeta($pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_cl_day1_META = createCommonMeta($psppl_cl_day1, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day2_META = createCommonMeta($psppl_cl_day2, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day3_META = createCommonMeta($psppl_cl_day3, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day4_META = createCommonMeta($psppl_cl_day4, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day5_META = createCommonMeta($psppl_cl_day5, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta ap_setoff_grp_cd_META = createCommonMeta($ap_setoff_grp_cd, mcframe.commonMA.meta.MA_META.SETOFF_GRP_CD);
	public static final MCMeta ap_setoff_grp_nm_META = createCommonMeta($ap_setoff_grp_nm, mcframe.commonMA.meta.MA_META.SETOFF_GRP_NM);
	public static final MCMeta tax_on_pay_flg_META = createCommonMeta($tax_on_pay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_tax_rnd_typ_META = createCommonMeta($pay_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta pay_tax_rnd_typ_nm_META = createCommonMeta($pay_tax_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta pay_schd_ba_typ_META = createCommonMeta($pay_schd_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta pay_schd_ba_typ_nm_META = createCommonMeta($pay_schd_ba_typ_nm, mcframe.commonMA.meta.MA_META.BA_TYP_NM);
	public static final MCMeta batch_pay_schd_cl_flg_META = createCommonMeta($batch_pay_schd_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_schd_cl_delay_days_META = createCommonMeta($pay_schd_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta pay_schd_cl_ba_typ_META = createCommonMeta($pay_schd_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta pay_schd_cl_ba_typ_nm_META = createCommonMeta($pay_schd_cl_ba_typ_nm, mcframe.commonMA.meta.MA_META.BA_TYP_NM);
	public static final MCMeta bsppl_prnt_typ_META = createCommonMeta($bsppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta bsppl_prnt_typ_nm_META = createCommonMeta($bsppl_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);
	public static final MCMeta pay_ntc_prnt_flg_META = createCommonMeta($pay_ntc_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_zip_cd_META = createCommonMeta($pay_ntc_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta pay_ntc_addr1_META = createCommonMeta($pay_ntc_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta pay_ntc_addr2_META = createCommonMeta($pay_ntc_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta pay_ntc_addr3_META = createCommonMeta($pay_ntc_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta pay_ntc_addr4_META = createCommonMeta($pay_ntc_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta pay_ntc_tel_META = createCommonMeta($pay_ntc_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta pay_ntc_bsppl_nm_META = createCommonMeta($pay_ntc_bsppl_nm, mcframe.commonMA.meta.MA_META.PAY_NTC_BSPPL_NM);
	public static final MCMeta pay_ntc_bsppl_dpt_META = createCommonMeta($pay_ntc_bsppl_dpt, mcframe.commonMA.meta.MA_META.PAY_NTC_BSPPL_DPT);
	public static final MCMeta pay_ntc_bsppl_psn_META = createCommonMeta($pay_ntc_bsppl_psn, mcframe.commonMA.meta.MA_META.PAY_NTC_BSPPL_PSN);
	public static final MCMeta pay_ntc_bsppl_psn_title_META = createCommonMeta($pay_ntc_bsppl_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta pay_ntc_dtl_outp_flg_META = createCommonMeta($pay_ntc_dtl_outp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_bfw_bal_disp_flg_META = createCommonMeta($pay_ntc_bfw_bal_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_adv_pay_flg_META = createCommonMeta($pay_ntc_adv_pay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_dtl_pay_flg_META = createCommonMeta($pay_ntc_dtl_pay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_dtl_subttl_typ_META = createCommonMeta($pay_ntc_dtl_subttl_typ, mcframe.commonMA.meta.MA_META.PAY_NTC_DTL_SUBTTL_TYP);
	public static final MCMeta pay_ntc_dtl_subttl_typ_nm_META = createCommonMeta($pay_ntc_dtl_subttl_typ_nm, mcframe.commonMA.meta.MA_META.PAY_NTC_DTL_SUBTTL_TYP_NM);
	public static final MCMeta pay_ntc_dtl_brk_typ_META = createCommonMeta($pay_ntc_dtl_brk_typ, mcframe.commonMA.meta.MA_META.PAY_NTC_DTL_BRK_TYP);
	public static final MCMeta pay_ntc_dtl_brk_typ_nm_META = createCommonMeta($pay_ntc_dtl_brk_typ_nm, mcframe.commonMA.meta.MA_META.PAY_NTC_DTL_BRK_TYP_NM);
	public static final MCMeta pay_ntc_dtl_sort_typ_META = createCommonMeta($pay_ntc_dtl_sort_typ, mcframe.commonMA.meta.MA_META.PAY_NTC_DTL_SORT_TYP);
	public static final MCMeta pay_ntc_dtl_sort_typ_nm_META = createCommonMeta($pay_ntc_dtl_sort_typ_nm, mcframe.commonMA.meta.MA_META.PAY_NTC_DTL_SORT_TYP_NM);
	public static final MCMeta pay_ntc_can_slip_typ_META = createCommonMeta($pay_ntc_can_slip_typ, mcframe.commonMA.meta.MA_META.PAY_NTC_CAN_SLIP_TYP);
	public static final MCMeta pay_ntc_can_slip_typ_nm_META = createCommonMeta($pay_ntc_can_slip_typ_nm, mcframe.commonMA.meta.MA_META.PAY_NTC_CAN_SLIP_TYP_NM);
	public static final MCMeta psppl_rmrks_META = createCommonMeta($psppl_rmrks, mcframe.commonMA.meta.MA_META.PSPPL_RMRKS);
	public static final MCMeta note_days_META = createCommonMeta($note_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta pay_dpt_cd_META = createCommonMeta($pay_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pay_dpt_nm_META = createCommonMeta($pay_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta check_pay_dpt_cd_META = createCommonMeta($check_pay_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta psppl_prnt_typ_META = createCommonMeta($psppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta psppl_prnt_typ_nm_META = createCommonMeta($psppl_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bp_cd_META,
			bp_nm_META,
			bsppl_flg_META,
			psppl_flg_META,
			psppl_cd_META,
			psppl_nm_META,
			bsppl_dpt_cd_META,
			bsppl_dpt_nm_META,
			check_bsppl_dpt_cd_META,
			ap_cred_cd_META,
			ap_cred_nm_META,
			purc_interim_cl_flg_META,
			pay_bank_ac_cd_META,
			pay_bank_ac_nm_META,
			pay_spot_flg_META,
			psppl_cl_day1_META,
			psppl_cl_day2_META,
			psppl_cl_day3_META,
			psppl_cl_day4_META,
			psppl_cl_day5_META,
			ap_setoff_grp_cd_META,
			ap_setoff_grp_nm_META,
			tax_on_pay_flg_META,
			pay_tax_rnd_typ_META,
			pay_tax_rnd_typ_nm_META,
			pay_schd_ba_typ_META,
			pay_schd_ba_typ_nm_META,
			batch_pay_schd_cl_flg_META,
			pay_schd_cl_delay_days_META,
			pay_schd_cl_ba_typ_META,
			pay_schd_cl_ba_typ_nm_META,
			bsppl_prnt_typ_META,
			bsppl_prnt_typ_nm_META,
			pay_ntc_prnt_flg_META,
			pay_ntc_zip_cd_META,
			pay_ntc_addr1_META,
			pay_ntc_addr2_META,
			pay_ntc_addr3_META,
			pay_ntc_addr4_META,
			pay_ntc_tel_META,
			pay_ntc_bsppl_nm_META,
			pay_ntc_bsppl_dpt_META,
			pay_ntc_bsppl_psn_META,
			pay_ntc_bsppl_psn_title_META,
			pay_ntc_dtl_outp_flg_META,
			pay_ntc_bfw_bal_disp_flg_META,
			pay_ntc_adv_pay_flg_META,
			pay_ntc_dtl_pay_flg_META,
			pay_ntc_dtl_subttl_typ_META,
			pay_ntc_dtl_subttl_typ_nm_META,
			pay_ntc_dtl_brk_typ_META,
			pay_ntc_dtl_brk_typ_nm_META,
			pay_ntc_dtl_sort_typ_META,
			pay_ntc_dtl_sort_typ_nm_META,
			pay_ntc_can_slip_typ_META,
			pay_ntc_can_slip_typ_nm_META,
			psppl_rmrks_META,
			note_days_META,
			pay_dpt_cd_META,
			pay_dpt_nm_META,
			check_pay_dpt_cd_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META,
			psppl_prnt_typ_META,
			psppl_prnt_typ_nm_META
		},
		new String[][]{
			{
			},
			{
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
				{$psppl_cd, "bp_nm"},	// psppl_cd
				{$bsppl_dpt_cd, "dpt_nm"},	// bsppl_dpt_cd
				{$ap_cred_cd, "bp_nm"},	// ap_cred_cd
				{$pay_bank_ac_cd, "bank_ac_nm"},	// pay_bank_ac_cd
				{$ap_setoff_grp_cd, "setoff_grp_nm"},	// ap_setoff_grp_cd
				{$pay_tax_rnd_typ, "rnd_typ_nm"},	// pay_tax_rnd_typ
				{$pay_schd_ba_typ, "ba_typ_nm"},	// pay_schd_ba_typ
				{$pay_schd_cl_ba_typ, "ba_typ_nm"},	// pay_schd_cl_ba_typ
				{$bsppl_prnt_typ, "prnt_typ_nm"},	// bsppl_prnt_typ
				{$pay_dpt_cd, "dpt_nm"},	// pay_dpt_cd
				{$psppl_prnt_typ, "prnt_typ_nm"}	// psppl_prnt_typ
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$psppl_cd, "MAC_BP_IS_SRCH_TYP.PSPPL;psppl_flg;bp_cd"},	// psppl_cd
				{$bsppl_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP;true"},	// bsppl_dpt_cd
				{$ap_cred_cd, "MAC_BP_IS_SRCH_TYP.CRED;cred_flg;bp_cd"},	// ap_cred_cd
				{$pay_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP;true"}	// pay_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$psppl_cd, "bp_is_srch_typ;check_rem_flg;ref_bp_cd"},	// psppl_cd
				{$bsppl_dpt_cd, "dpt_is_srch_typ;mode_today_flg"},	// bsppl_dpt_cd
				{$ap_cred_cd, "bp_is_srch_typ;check_rem_flg;ref_bp_cd"},	// ap_cred_cd
				{$pay_dpt_cd, "dpt_is_srch_typ;mode_today_flg"}	// pay_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$ap_cred_cd, "CRED"},	// ap_cred_cd
				{$ap_cred_nm, "CRED"},	// ap_cred_nm
				{$pay_ntc_addr1, "ADDR1"},	// pay_ntc_addr1
				{$pay_ntc_addr2, "ADDR2"},	// pay_ntc_addr2
				{$pay_ntc_addr3, "ADDR3"},	// pay_ntc_addr3
				{$pay_ntc_addr4, "ADDR4"}	// pay_ntc_addr4
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
	protected HdrR_MC_A(ConstMetaList<? extends HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR clone() {
		return (HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR createInstance() {
		return (HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR getValues(String... names) {
		return (HdrR) super.getValues(names);
	}



	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 0, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 0, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 1, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 1, $bp_nm, value);
	}


	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public boolean bsppl_flg() {
		return getConstBoolean(offset + 2, $bsppl_flg);
	}

	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public void bsppl_flg(boolean value) {
		setConstBoolean(offset + 2, $bsppl_flg, value);
	}


	/**
	 * Payee 支払先.<p>
	 *
	 */
	public boolean psppl_flg() {
		return getConstBoolean(offset + 3, $psppl_flg);
	}

	/**
	 * Payee 支払先.<p>
	 *
	 */
	public void psppl_flg(boolean value) {
		setConstBoolean(offset + 3, $psppl_flg, value);
	}


	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 4, $psppl_cd);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 4, $psppl_cd, value);
	}


	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public String psppl_nm() {
		return getConstString(offset + 5, $psppl_nm);
	}

	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public void psppl_nm(String value) {
		setConstString(offset + 5, $psppl_nm, value);
	}


	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 6, $bsppl_dpt_cd);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 6, $bsppl_dpt_cd, value);
	}


	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public String bsppl_dpt_nm() {
		return getConstString(offset + 7, $bsppl_dpt_nm);
	}

	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public void bsppl_dpt_nm(String value) {
		setConstString(offset + 7, $bsppl_dpt_nm, value);
	}


	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String check_bsppl_dpt_cd() {
		return getConstString(offset + 8, $check_bsppl_dpt_cd);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void check_bsppl_dpt_cd(String value) {
		setConstString(offset + 8, $check_bsppl_dpt_cd, value);
	}


	/**
	 * AP credit managed BP cd. 債務与信管理先ＣＤ.<p>
	 *
	 */
	public String ap_cred_cd() {
		return getConstString(offset + 9, $ap_cred_cd);
	}

	/**
	 * AP credit managed BP cd. 債務与信管理先ＣＤ.<p>
	 *
	 */
	public void ap_cred_cd(String value) {
		setConstString(offset + 9, $ap_cred_cd, value);
	}


	/**
	 * AP credit managed BP name 債務与信管理先名.<p>
	 *
	 */
	public String ap_cred_nm() {
		return getConstString(offset + 10, $ap_cred_nm);
	}

	/**
	 * AP credit managed BP name 債務与信管理先名.<p>
	 *
	 */
	public void ap_cred_nm(String value) {
		setConstString(offset + 10, $ap_cred_nm, value);
	}


	/**
	 * Purchase temporary unit price closing 仕入仮単価締.<p>
	 *
	 */
	public boolean purc_interim_cl_flg() {
		return getConstBoolean(offset + 11, $purc_interim_cl_flg);
	}

	/**
	 * Purchase temporary unit price closing 仕入仮単価締.<p>
	 *
	 */
	public void purc_interim_cl_flg(boolean value) {
		setConstBoolean(offset + 11, $purc_interim_cl_flg, value);
	}


	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return getConstString(offset + 12, $pay_bank_ac_cd);
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		setConstString(offset + 12, $pay_bank_ac_cd, value);
	}


	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public String pay_bank_ac_nm() {
		return getConstString(offset + 13, $pay_bank_ac_nm);
	}

	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public void pay_bank_ac_nm(String value) {
		setConstString(offset + 13, $pay_bank_ac_nm, value);
	}


	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public boolean pay_spot_flg() {
		return getConstBoolean(offset + 14, $pay_spot_flg);
	}

	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public void pay_spot_flg(boolean value) {
		setConstBoolean(offset + 14, $pay_spot_flg, value);
	}


	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public MCNumber psppl_cl_day1() {
		return getConstNumber(offset + 15, $psppl_cl_day1);
	}

	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(MCNumber value) {
		setConstNumber(offset + 15, $psppl_cl_day1, value);
	}

	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(int value) {
		setConstNumber(offset + 15, $psppl_cl_day1, value);
	}

	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(long value) {
		setConstNumber(offset + 15, $psppl_cl_day1, value);
	}

	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(float value) {
		setConstNumber(offset + 15, $psppl_cl_day1, value);
	}

	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(double value) {
		setConstNumber(offset + 15, $psppl_cl_day1, value);
	}


	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public MCNumber psppl_cl_day2() {
		return getConstNumber(offset + 16, $psppl_cl_day2);
	}

	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(MCNumber value) {
		setConstNumber(offset + 16, $psppl_cl_day2, value);
	}

	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(int value) {
		setConstNumber(offset + 16, $psppl_cl_day2, value);
	}

	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(long value) {
		setConstNumber(offset + 16, $psppl_cl_day2, value);
	}

	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(float value) {
		setConstNumber(offset + 16, $psppl_cl_day2, value);
	}

	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(double value) {
		setConstNumber(offset + 16, $psppl_cl_day2, value);
	}


	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public MCNumber psppl_cl_day3() {
		return getConstNumber(offset + 17, $psppl_cl_day3);
	}

	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(MCNumber value) {
		setConstNumber(offset + 17, $psppl_cl_day3, value);
	}

	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(int value) {
		setConstNumber(offset + 17, $psppl_cl_day3, value);
	}

	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(long value) {
		setConstNumber(offset + 17, $psppl_cl_day3, value);
	}

	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(float value) {
		setConstNumber(offset + 17, $psppl_cl_day3, value);
	}

	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(double value) {
		setConstNumber(offset + 17, $psppl_cl_day3, value);
	}


	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public MCNumber psppl_cl_day4() {
		return getConstNumber(offset + 18, $psppl_cl_day4);
	}

	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(MCNumber value) {
		setConstNumber(offset + 18, $psppl_cl_day4, value);
	}

	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(int value) {
		setConstNumber(offset + 18, $psppl_cl_day4, value);
	}

	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(long value) {
		setConstNumber(offset + 18, $psppl_cl_day4, value);
	}

	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(float value) {
		setConstNumber(offset + 18, $psppl_cl_day4, value);
	}

	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(double value) {
		setConstNumber(offset + 18, $psppl_cl_day4, value);
	}


	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public MCNumber psppl_cl_day5() {
		return getConstNumber(offset + 19, $psppl_cl_day5);
	}

	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(MCNumber value) {
		setConstNumber(offset + 19, $psppl_cl_day5, value);
	}

	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(int value) {
		setConstNumber(offset + 19, $psppl_cl_day5, value);
	}

	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(long value) {
		setConstNumber(offset + 19, $psppl_cl_day5, value);
	}

	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(float value) {
		setConstNumber(offset + 19, $psppl_cl_day5, value);
	}

	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(double value) {
		setConstNumber(offset + 19, $psppl_cl_day5, value);
	}


	/**
	 * AP offset group cd. 債務相殺グループＣＤ.<p>
	 *
	 */
	public String ap_setoff_grp_cd() {
		return getConstString(offset + 20, $ap_setoff_grp_cd);
	}

	/**
	 * AP offset group cd. 債務相殺グループＣＤ.<p>
	 *
	 */
	public void ap_setoff_grp_cd(String value) {
		setConstString(offset + 20, $ap_setoff_grp_cd, value);
	}


	/**
	 * AP offset group name 債務相殺グループ名.<p>
	 *
	 */
	public String ap_setoff_grp_nm() {
		return getConstString(offset + 21, $ap_setoff_grp_nm);
	}

	/**
	 * AP offset group name 債務相殺グループ名.<p>
	 *
	 */
	public void ap_setoff_grp_nm(String value) {
		setConstString(offset + 21, $ap_setoff_grp_nm, value);
	}


	/**
	 * Payment tax calculation 支払税計算.<p>
	 *
	 */
	public boolean tax_on_pay_flg() {
		return getConstBoolean(offset + 22, $tax_on_pay_flg);
	}

	/**
	 * Payment tax calculation 支払税計算.<p>
	 *
	 */
	public void tax_on_pay_flg(boolean value) {
		setConstBoolean(offset + 22, $tax_on_pay_flg, value);
	}


	/**
	 * Payment tax amount rounding type 支払税額端数処理区分.<p>
	 *
	 */
	public String pay_tax_rnd_typ() {
		return getConstString(offset + 23, $pay_tax_rnd_typ);
	}

	/**
	 * Payment tax amount rounding type 支払税額端数処理区分.<p>
	 *
	 */
	public void pay_tax_rnd_typ(String value) {
		setConstString(offset + 23, $pay_tax_rnd_typ, value);
	}


	/**
	 * Payment tax amount rounding type name 支払税額端数処理区分名.<p>
	 *
	 */
	public String pay_tax_rnd_typ_nm() {
		return getConstString(offset + 24, $pay_tax_rnd_typ_nm);
	}

	/**
	 * Payment tax amount rounding type name 支払税額端数処理区分名.<p>
	 *
	 */
	public void pay_tax_rnd_typ_nm(String value) {
		setConstString(offset + 24, $pay_tax_rnd_typ_nm, value);
	}


	/**
	 * Payment schedule before/after type 支払予定前後区分.<p>
	 *
	 */
	public String pay_schd_ba_typ() {
		return getConstString(offset + 25, $pay_schd_ba_typ);
	}

	/**
	 * Payment schedule before/after type 支払予定前後区分.<p>
	 *
	 */
	public void pay_schd_ba_typ(String value) {
		setConstString(offset + 25, $pay_schd_ba_typ, value);
	}


	/**
	 * Payment schedule before/after type name 支払予定前後区分名.<p>
	 *
	 */
	public String pay_schd_ba_typ_nm() {
		return getConstString(offset + 26, $pay_schd_ba_typ_nm);
	}

	/**
	 * Payment schedule before/after type name 支払予定前後区分名.<p>
	 *
	 */
	public void pay_schd_ba_typ_nm(String value) {
		setConstString(offset + 26, $pay_schd_ba_typ_nm, value);
	}


	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public boolean batch_pay_schd_cl_flg() {
		return getConstBoolean(offset + 27, $batch_pay_schd_cl_flg);
	}

	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public void batch_pay_schd_cl_flg(boolean value) {
		setConstBoolean(offset + 27, $batch_pay_schd_cl_flg, value);
	}


	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public MCNumber pay_schd_cl_delay_days() {
		return getConstNumber(offset + 28, $pay_schd_cl_delay_days);
	}

	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 28, $pay_schd_cl_delay_days, value);
	}

	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(int value) {
		setConstNumber(offset + 28, $pay_schd_cl_delay_days, value);
	}

	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(long value) {
		setConstNumber(offset + 28, $pay_schd_cl_delay_days, value);
	}

	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(float value) {
		setConstNumber(offset + 28, $pay_schd_cl_delay_days, value);
	}

	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(double value) {
		setConstNumber(offset + 28, $pay_schd_cl_delay_days, value);
	}


	/**
	 * Payment schedule closing before/after type 支払予定締前後区分.<p>
	 *
	 */
	public String pay_schd_cl_ba_typ() {
		return getConstString(offset + 29, $pay_schd_cl_ba_typ);
	}

	/**
	 * Payment schedule closing before/after type 支払予定締前後区分.<p>
	 *
	 */
	public void pay_schd_cl_ba_typ(String value) {
		setConstString(offset + 29, $pay_schd_cl_ba_typ, value);
	}


	/**
	 * Payment schedule closing before/after type name 支払予定締前後区分名.<p>
	 *
	 */
	public String pay_schd_cl_ba_typ_nm() {
		return getConstString(offset + 30, $pay_schd_cl_ba_typ_nm);
	}

	/**
	 * Payment schedule closing before/after type name 支払予定締前後区分名.<p>
	 *
	 */
	public void pay_schd_cl_ba_typ_nm(String value) {
		setConstString(offset + 30, $pay_schd_cl_ba_typ_nm, value);
	}


	/**
	 * Report issue type (Scheduled payee) 帳票発行区分（支払予定管理先）.<p>
	 *
	 */
	public String bsppl_prnt_typ() {
		return getConstString(offset + 31, $bsppl_prnt_typ);
	}

	/**
	 * Report issue type (Scheduled payee) 帳票発行区分（支払予定管理先）.<p>
	 *
	 */
	public void bsppl_prnt_typ(String value) {
		setConstString(offset + 31, $bsppl_prnt_typ, value);
	}


	/**
	 * Report issue type name (Scheduled payee) 帳票発行区分名（支払予定管理先）.<p>
	 *
	 */
	public String bsppl_prnt_typ_nm() {
		return getConstString(offset + 32, $bsppl_prnt_typ_nm);
	}

	/**
	 * Report issue type name (Scheduled payee) 帳票発行区分名（支払予定管理先）.<p>
	 *
	 */
	public void bsppl_prnt_typ_nm(String value) {
		setConstString(offset + 32, $bsppl_prnt_typ_nm, value);
	}


	/**
	 * Payment notice to be issued 支払通知書発行対象.<p>
	 *
	 */
	public boolean pay_ntc_prnt_flg() {
		return getConstBoolean(offset + 33, $pay_ntc_prnt_flg);
	}

	/**
	 * Payment notice to be issued 支払通知書発行対象.<p>
	 *
	 */
	public void pay_ntc_prnt_flg(boolean value) {
		setConstBoolean(offset + 33, $pay_ntc_prnt_flg, value);
	}


	/**
	 * Payment notice send-to zip code 支払通知書送付郵便番号.<p>
	 *
	 */
	public String pay_ntc_zip_cd() {
		return getConstString(offset + 34, $pay_ntc_zip_cd);
	}

	/**
	 * Payment notice send-to zip code 支払通知書送付郵便番号.<p>
	 *
	 */
	public void pay_ntc_zip_cd(String value) {
		setConstString(offset + 34, $pay_ntc_zip_cd, value);
	}


	/**
	 * Payment notice send-to address 1 支払通知書送付住所１.<p>
	 *
	 */
	public String pay_ntc_addr1() {
		return getConstString(offset + 35, $pay_ntc_addr1);
	}

	/**
	 * Payment notice send-to address 1 支払通知書送付住所１.<p>
	 *
	 */
	public void pay_ntc_addr1(String value) {
		setConstString(offset + 35, $pay_ntc_addr1, value);
	}


	/**
	 * Payment notice send-to address 2 支払通知書送付住所２.<p>
	 *
	 */
	public String pay_ntc_addr2() {
		return getConstString(offset + 36, $pay_ntc_addr2);
	}

	/**
	 * Payment notice send-to address 2 支払通知書送付住所２.<p>
	 *
	 */
	public void pay_ntc_addr2(String value) {
		setConstString(offset + 36, $pay_ntc_addr2, value);
	}


	/**
	 * Payment notice send-to address 3 支払通知書送付住所３.<p>
	 *
	 */
	public String pay_ntc_addr3() {
		return getConstString(offset + 37, $pay_ntc_addr3);
	}

	/**
	 * Payment notice send-to address 3 支払通知書送付住所３.<p>
	 *
	 */
	public void pay_ntc_addr3(String value) {
		setConstString(offset + 37, $pay_ntc_addr3, value);
	}


	/**
	 * Payment notice send-to address 4 支払通知書送付住所４.<p>
	 *
	 */
	public String pay_ntc_addr4() {
		return getConstString(offset + 38, $pay_ntc_addr4);
	}

	/**
	 * Payment notice send-to address 4 支払通知書送付住所４.<p>
	 *
	 */
	public void pay_ntc_addr4(String value) {
		setConstString(offset + 38, $pay_ntc_addr4, value);
	}


	/**
	 * Payment notice send-to TEL 支払通知書送付ＴＥＬ.<p>
	 *
	 */
	public String pay_ntc_tel() {
		return getConstString(offset + 39, $pay_ntc_tel);
	}

	/**
	 * Payment notice send-to TEL 支払通知書送付ＴＥＬ.<p>
	 *
	 */
	public void pay_ntc_tel(String value) {
		setConstString(offset + 39, $pay_ntc_tel, value);
	}


	/**
	 * Payment notice destination 支払通知書宛先.<p>
	 *
	 */
	public String pay_ntc_bsppl_nm() {
		return getConstString(offset + 40, $pay_ntc_bsppl_nm);
	}

	/**
	 * Payment notice destination 支払通知書宛先.<p>
	 *
	 */
	public void pay_ntc_bsppl_nm(String value) {
		setConstString(offset + 40, $pay_ntc_bsppl_nm, value);
	}


	/**
	 * Payment notice send-to dept. 支払通知書送付部署.<p>
	 *
	 */
	public String pay_ntc_bsppl_dpt() {
		return getConstString(offset + 41, $pay_ntc_bsppl_dpt);
	}

	/**
	 * Payment notice send-to dept. 支払通知書送付部署.<p>
	 *
	 */
	public void pay_ntc_bsppl_dpt(String value) {
		setConstString(offset + 41, $pay_ntc_bsppl_dpt, value);
	}


	/**
	 * Payment notice send-to PIC 支払通知書送付担当者.<p>
	 *
	 */
	public String pay_ntc_bsppl_psn() {
		return getConstString(offset + 42, $pay_ntc_bsppl_psn);
	}

	/**
	 * Payment notice send-to PIC 支払通知書送付担当者.<p>
	 *
	 */
	public void pay_ntc_bsppl_psn(String value) {
		setConstString(offset + 42, $pay_ntc_bsppl_psn, value);
	}


	/**
	 * Payment notice send-to PIC honorific title 支払通知書送付担当者敬称.<p>
	 *
	 */
	public String pay_ntc_bsppl_psn_title() {
		return getConstString(offset + 43, $pay_ntc_bsppl_psn_title);
	}

	/**
	 * Payment notice send-to PIC honorific title 支払通知書送付担当者敬称.<p>
	 *
	 */
	public void pay_ntc_bsppl_psn_title(String value) {
		setConstString(offset + 43, $pay_ntc_bsppl_psn_title, value);
	}


	/**
	 * Output payment notice details 支払通知書明細出力.<p>
	 *
	 */
	public boolean pay_ntc_dtl_outp_flg() {
		return getConstBoolean(offset + 44, $pay_ntc_dtl_outp_flg);
	}

	/**
	 * Output payment notice details 支払通知書明細出力.<p>
	 *
	 */
	public void pay_ntc_dtl_outp_flg(boolean value) {
		setConstBoolean(offset + 44, $pay_ntc_dtl_outp_flg, value);
	}


	/**
	 * Display balance of previous month on payment notice 支払通知書前月残高表示.<p>
	 *
	 */
	public boolean pay_ntc_bfw_bal_disp_flg() {
		return getConstBoolean(offset + 45, $pay_ntc_bfw_bal_disp_flg);
	}

	/**
	 * Display balance of previous month on payment notice 支払通知書前月残高表示.<p>
	 *
	 */
	public void pay_ntc_bfw_bal_disp_flg(boolean value) {
		setConstBoolean(offset + 45, $pay_ntc_bfw_bal_disp_flg, value);
	}


	/**
	 * Display advance payment on payment notice 支払通知書前渡金表示.<p>
	 *
	 */
	public boolean pay_ntc_adv_pay_flg() {
		return getConstBoolean(offset + 46, $pay_ntc_adv_pay_flg);
	}

	/**
	 * Display advance payment on payment notice 支払通知書前渡金表示.<p>
	 *
	 */
	public void pay_ntc_adv_pay_flg(boolean value) {
		setConstBoolean(offset + 46, $pay_ntc_adv_pay_flg, value);
	}


	/**
	 * Display payment schedule on payment notice 支払通知書支払予定表示.<p>
	 *
	 */
	public boolean pay_ntc_dtl_pay_flg() {
		return getConstBoolean(offset + 47, $pay_ntc_dtl_pay_flg);
	}

	/**
	 * Display payment schedule on payment notice 支払通知書支払予定表示.<p>
	 *
	 */
	public void pay_ntc_dtl_pay_flg(boolean value) {
		setConstBoolean(offset + 47, $pay_ntc_dtl_pay_flg, value);
	}


	/**
	 * Payment notice details subtotal type 支払通知書明細小計区分.<p>
	 *
	 */
	public String pay_ntc_dtl_subttl_typ() {
		return getConstString(offset + 48, $pay_ntc_dtl_subttl_typ);
	}

	/**
	 * Payment notice details subtotal type 支払通知書明細小計区分.<p>
	 *
	 */
	public void pay_ntc_dtl_subttl_typ(String value) {
		setConstString(offset + 48, $pay_ntc_dtl_subttl_typ, value);
	}


	/**
	 * Payment notice details subtotal type name 支払通知書明細小計区分名.<p>
	 *
	 */
	public String pay_ntc_dtl_subttl_typ_nm() {
		return getConstString(offset + 49, $pay_ntc_dtl_subttl_typ_nm);
	}

	/**
	 * Payment notice details subtotal type name 支払通知書明細小計区分名.<p>
	 *
	 */
	public void pay_ntc_dtl_subttl_typ_nm(String value) {
		setConstString(offset + 49, $pay_ntc_dtl_subttl_typ_nm, value);
	}


	/**
	 * Payment notice details page break type 支払通知書明細改頁区分.<p>
	 *
	 */
	public String pay_ntc_dtl_brk_typ() {
		return getConstString(offset + 50, $pay_ntc_dtl_brk_typ);
	}

	/**
	 * Payment notice details page break type 支払通知書明細改頁区分.<p>
	 *
	 */
	public void pay_ntc_dtl_brk_typ(String value) {
		setConstString(offset + 50, $pay_ntc_dtl_brk_typ, value);
	}


	/**
	 * Payment notice details page break type name 支払通知書明細改頁区分名.<p>
	 *
	 */
	public String pay_ntc_dtl_brk_typ_nm() {
		return getConstString(offset + 51, $pay_ntc_dtl_brk_typ_nm);
	}

	/**
	 * Payment notice details page break type name 支払通知書明細改頁区分名.<p>
	 *
	 */
	public void pay_ntc_dtl_brk_typ_nm(String value) {
		setConstString(offset + 51, $pay_ntc_dtl_brk_typ_nm, value);
	}


	/**
	 * Payment notice details sorting order type 支払通知書明細並順区分.<p>
	 *
	 */
	public String pay_ntc_dtl_sort_typ() {
		return getConstString(offset + 52, $pay_ntc_dtl_sort_typ);
	}

	/**
	 * Payment notice details sorting order type 支払通知書明細並順区分.<p>
	 *
	 */
	public void pay_ntc_dtl_sort_typ(String value) {
		setConstString(offset + 52, $pay_ntc_dtl_sort_typ, value);
	}


	/**
	 * Payment notice details sorting order type name 支払通知書明細並順区分名.<p>
	 *
	 */
	public String pay_ntc_dtl_sort_typ_nm() {
		return getConstString(offset + 53, $pay_ntc_dtl_sort_typ_nm);
	}

	/**
	 * Payment notice details sorting order type name 支払通知書明細並順区分名.<p>
	 *
	 */
	public void pay_ntc_dtl_sort_typ_nm(String value) {
		setConstString(offset + 53, $pay_ntc_dtl_sort_typ_nm, value);
	}


	/**
	 * Payment notice cancel slip display type 支払通知書取消伝票表示区分.<p>
	 *
	 */
	public String pay_ntc_can_slip_typ() {
		return getConstString(offset + 54, $pay_ntc_can_slip_typ);
	}

	/**
	 * Payment notice cancel slip display type 支払通知書取消伝票表示区分.<p>
	 *
	 */
	public void pay_ntc_can_slip_typ(String value) {
		setConstString(offset + 54, $pay_ntc_can_slip_typ, value);
	}


	/**
	 * Payment notice cancel slip display type name 支払通知書取消伝票表示区分名.<p>
	 *
	 */
	public String pay_ntc_can_slip_typ_nm() {
		return getConstString(offset + 55, $pay_ntc_can_slip_typ_nm);
	}

	/**
	 * Payment notice cancel slip display type name 支払通知書取消伝票表示区分名.<p>
	 *
	 */
	public void pay_ntc_can_slip_typ_nm(String value) {
		setConstString(offset + 55, $pay_ntc_can_slip_typ_nm, value);
	}


	/**
	 * Payee remarks 支払先備考.<p>
	 *
	 */
	public String psppl_rmrks() {
		return getConstString(offset + 56, $psppl_rmrks);
	}

	/**
	 * Payee remarks 支払先備考.<p>
	 *
	 */
	public void psppl_rmrks(String value) {
		setConstString(offset + 56, $psppl_rmrks, value);
	}


	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public MCNumber note_days() {
		return getConstNumber(offset + 57, $note_days);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(MCNumber value) {
		setConstNumber(offset + 57, $note_days, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(int value) {
		setConstNumber(offset + 57, $note_days, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(long value) {
		setConstNumber(offset + 57, $note_days, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(float value) {
		setConstNumber(offset + 57, $note_days, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(double value) {
		setConstNumber(offset + 57, $note_days, value);
	}


	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public String pay_dpt_cd() {
		return getConstString(offset + 58, $pay_dpt_cd);
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public void pay_dpt_cd(String value) {
		setConstString(offset + 58, $pay_dpt_cd, value);
	}


	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public String pay_dpt_nm() {
		return getConstString(offset + 59, $pay_dpt_nm);
	}

	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public void pay_dpt_nm(String value) {
		setConstString(offset + 59, $pay_dpt_nm, value);
	}


	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public String check_pay_dpt_cd() {
		return getConstString(offset + 60, $check_pay_dpt_cd);
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public void check_pay_dpt_cd(String value) {
		setConstString(offset + 60, $check_pay_dpt_cd, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 61, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 61, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 62, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 62, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 63, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 63, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 64, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 64, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 65, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 65, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 66, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 66, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 66, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 66, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 66, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 66, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 67, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 67, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 68, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 68, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 69, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 69, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 70, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 70, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 71, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 71, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 72, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 72, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 73, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 73, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 74, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 74, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 75, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 75, $del_ts, value);
	}


	/**
	 * Report issue type (Payee) 帳票発行区分（支払先）.<p>
	 *
	 */
	public String psppl_prnt_typ() {
		return getConstString(offset + 76, $psppl_prnt_typ);
	}

	/**
	 * Report issue type (Payee) 帳票発行区分（支払先）.<p>
	 *
	 */
	public void psppl_prnt_typ(String value) {
		setConstString(offset + 76, $psppl_prnt_typ, value);
	}


	/**
	 * Report issue type name (Payee) 帳票発行区分名（支払先）.<p>
	 *
	 */
	public String psppl_prnt_typ_nm() {
		return getConstString(offset + 77, $psppl_prnt_typ_nm);
	}

	/**
	 * Report issue type name (Payee) 帳票発行区分名（支払先）.<p>
	 *
	 */
	public void psppl_prnt_typ_nm(String value) {
		setConstString(offset + 77, $psppl_prnt_typ_nm, value);
	}


	public String getString(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($check_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return check_bsppl_dpt_cd();
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			return ap_cred_cd();
		}
		if ($ap_cred_nm.equalsIgnoreCase(name)) {
			return ap_cred_nm();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			return pay_bank_ac_nm();
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ap_setoff_grp_cd();
		}
		if ($ap_setoff_grp_nm.equalsIgnoreCase(name)) {
			return ap_setoff_grp_nm();
		}
		if ($pay_tax_rnd_typ.equalsIgnoreCase(name)) {
			return pay_tax_rnd_typ();
		}
		if ($pay_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return pay_tax_rnd_typ_nm();
		}
		if ($pay_schd_ba_typ.equalsIgnoreCase(name)) {
			return pay_schd_ba_typ();
		}
		if ($pay_schd_ba_typ_nm.equalsIgnoreCase(name)) {
			return pay_schd_ba_typ_nm();
		}
		if ($pay_schd_cl_ba_typ.equalsIgnoreCase(name)) {
			return pay_schd_cl_ba_typ();
		}
		if ($pay_schd_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			return pay_schd_cl_ba_typ_nm();
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			return bsppl_prnt_typ();
		}
		if ($bsppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return bsppl_prnt_typ_nm();
		}
		if ($pay_ntc_zip_cd.equalsIgnoreCase(name)) {
			return pay_ntc_zip_cd();
		}
		if ($pay_ntc_addr1.equalsIgnoreCase(name)) {
			return pay_ntc_addr1();
		}
		if ($pay_ntc_addr2.equalsIgnoreCase(name)) {
			return pay_ntc_addr2();
		}
		if ($pay_ntc_addr3.equalsIgnoreCase(name)) {
			return pay_ntc_addr3();
		}
		if ($pay_ntc_addr4.equalsIgnoreCase(name)) {
			return pay_ntc_addr4();
		}
		if ($pay_ntc_tel.equalsIgnoreCase(name)) {
			return pay_ntc_tel();
		}
		if ($pay_ntc_bsppl_nm.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_nm();
		}
		if ($pay_ntc_bsppl_dpt.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_dpt();
		}
		if ($pay_ntc_bsppl_psn.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_psn();
		}
		if ($pay_ntc_bsppl_psn_title.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_psn_title();
		}
		if ($pay_ntc_dtl_subttl_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_subttl_typ();
		}
		if ($pay_ntc_dtl_subttl_typ_nm.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_subttl_typ_nm();
		}
		if ($pay_ntc_dtl_brk_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_brk_typ();
		}
		if ($pay_ntc_dtl_brk_typ_nm.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_brk_typ_nm();
		}
		if ($pay_ntc_dtl_sort_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_sort_typ();
		}
		if ($pay_ntc_dtl_sort_typ_nm.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_sort_typ_nm();
		}
		if ($pay_ntc_can_slip_typ.equalsIgnoreCase(name)) {
			return pay_ntc_can_slip_typ();
		}
		if ($pay_ntc_can_slip_typ_nm.equalsIgnoreCase(name)) {
			return pay_ntc_can_slip_typ_nm();
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			return psppl_rmrks();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			return pay_dpt_nm();
		}
		if ($check_pay_dpt_cd.equalsIgnoreCase(name)) {
			return check_pay_dpt_cd();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			return psppl_prnt_typ();
		}
		if ($psppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return psppl_prnt_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			return psppl_cl_day1();
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			return psppl_cl_day2();
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			return psppl_cl_day3();
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			return psppl_cl_day4();
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			return psppl_cl_day5();
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			return pay_schd_cl_delay_days();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			return bsppl_flg();
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			return psppl_flg();
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			return purc_interim_cl_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($tax_on_pay_flg.equalsIgnoreCase(name)) {
			return tax_on_pay_flg();
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			return batch_pay_schd_cl_flg();
		}
		if ($pay_ntc_prnt_flg.equalsIgnoreCase(name)) {
			return pay_ntc_prnt_flg();
		}
		if ($pay_ntc_dtl_outp_flg.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_outp_flg();
		}
		if ($pay_ntc_bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return pay_ntc_bfw_bal_disp_flg();
		}
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			return pay_ntc_adv_pay_flg();
		}
		if ($pay_ntc_dtl_pay_flg.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_pay_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($psppl_nm.equalsIgnoreCase(name)) {
			return psppl_nm();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($check_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return check_bsppl_dpt_cd();
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			return ap_cred_cd();
		}
		if ($ap_cred_nm.equalsIgnoreCase(name)) {
			return ap_cred_nm();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			return pay_bank_ac_nm();
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ap_setoff_grp_cd();
		}
		if ($ap_setoff_grp_nm.equalsIgnoreCase(name)) {
			return ap_setoff_grp_nm();
		}
		if ($pay_tax_rnd_typ.equalsIgnoreCase(name)) {
			return pay_tax_rnd_typ();
		}
		if ($pay_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return pay_tax_rnd_typ_nm();
		}
		if ($pay_schd_ba_typ.equalsIgnoreCase(name)) {
			return pay_schd_ba_typ();
		}
		if ($pay_schd_ba_typ_nm.equalsIgnoreCase(name)) {
			return pay_schd_ba_typ_nm();
		}
		if ($pay_schd_cl_ba_typ.equalsIgnoreCase(name)) {
			return pay_schd_cl_ba_typ();
		}
		if ($pay_schd_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			return pay_schd_cl_ba_typ_nm();
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			return bsppl_prnt_typ();
		}
		if ($bsppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return bsppl_prnt_typ_nm();
		}
		if ($pay_ntc_zip_cd.equalsIgnoreCase(name)) {
			return pay_ntc_zip_cd();
		}
		if ($pay_ntc_addr1.equalsIgnoreCase(name)) {
			return pay_ntc_addr1();
		}
		if ($pay_ntc_addr2.equalsIgnoreCase(name)) {
			return pay_ntc_addr2();
		}
		if ($pay_ntc_addr3.equalsIgnoreCase(name)) {
			return pay_ntc_addr3();
		}
		if ($pay_ntc_addr4.equalsIgnoreCase(name)) {
			return pay_ntc_addr4();
		}
		if ($pay_ntc_tel.equalsIgnoreCase(name)) {
			return pay_ntc_tel();
		}
		if ($pay_ntc_bsppl_nm.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_nm();
		}
		if ($pay_ntc_bsppl_dpt.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_dpt();
		}
		if ($pay_ntc_bsppl_psn.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_psn();
		}
		if ($pay_ntc_bsppl_psn_title.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_psn_title();
		}
		if ($pay_ntc_dtl_subttl_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_subttl_typ();
		}
		if ($pay_ntc_dtl_subttl_typ_nm.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_subttl_typ_nm();
		}
		if ($pay_ntc_dtl_brk_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_brk_typ();
		}
		if ($pay_ntc_dtl_brk_typ_nm.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_brk_typ_nm();
		}
		if ($pay_ntc_dtl_sort_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_sort_typ();
		}
		if ($pay_ntc_dtl_sort_typ_nm.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_sort_typ_nm();
		}
		if ($pay_ntc_can_slip_typ.equalsIgnoreCase(name)) {
			return pay_ntc_can_slip_typ();
		}
		if ($pay_ntc_can_slip_typ_nm.equalsIgnoreCase(name)) {
			return pay_ntc_can_slip_typ_nm();
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			return psppl_rmrks();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			return pay_dpt_nm();
		}
		if ($check_pay_dpt_cd.equalsIgnoreCase(name)) {
			return check_pay_dpt_cd();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			return psppl_prnt_typ();
		}
		if ($psppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return psppl_prnt_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			return psppl_cl_day1();
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			return psppl_cl_day2();
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			return psppl_cl_day3();
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			return psppl_cl_day4();
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			return psppl_cl_day5();
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			return pay_schd_cl_delay_days();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			return bsppl_flg();
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			return psppl_flg();
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			return purc_interim_cl_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($tax_on_pay_flg.equalsIgnoreCase(name)) {
			return tax_on_pay_flg();
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			return batch_pay_schd_cl_flg();
		}
		if ($pay_ntc_prnt_flg.equalsIgnoreCase(name)) {
			return pay_ntc_prnt_flg();
		}
		if ($pay_ntc_dtl_outp_flg.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_outp_flg();
		}
		if ($pay_ntc_bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return pay_ntc_bfw_bal_disp_flg();
		}
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			return pay_ntc_adv_pay_flg();
		}
		if ($pay_ntc_dtl_pay_flg.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_pay_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
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
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			bsppl_dpt_nm(value);
			return;
		}
		if ($check_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			check_bsppl_dpt_cd(value);
			return;
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			ap_cred_cd(value);
			return;
		}
		if ($ap_cred_nm.equalsIgnoreCase(name)) {
			ap_cred_nm(value);
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
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			ap_setoff_grp_cd(value);
			return;
		}
		if ($ap_setoff_grp_nm.equalsIgnoreCase(name)) {
			ap_setoff_grp_nm(value);
			return;
		}
		if ($pay_tax_rnd_typ.equalsIgnoreCase(name)) {
			pay_tax_rnd_typ(value);
			return;
		}
		if ($pay_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			pay_tax_rnd_typ_nm(value);
			return;
		}
		if ($pay_schd_ba_typ.equalsIgnoreCase(name)) {
			pay_schd_ba_typ(value);
			return;
		}
		if ($pay_schd_ba_typ_nm.equalsIgnoreCase(name)) {
			pay_schd_ba_typ_nm(value);
			return;
		}
		if ($pay_schd_cl_ba_typ.equalsIgnoreCase(name)) {
			pay_schd_cl_ba_typ(value);
			return;
		}
		if ($pay_schd_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			pay_schd_cl_ba_typ_nm(value);
			return;
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			bsppl_prnt_typ(value);
			return;
		}
		if ($bsppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			bsppl_prnt_typ_nm(value);
			return;
		}
		if ($pay_ntc_zip_cd.equalsIgnoreCase(name)) {
			pay_ntc_zip_cd(value);
			return;
		}
		if ($pay_ntc_addr1.equalsIgnoreCase(name)) {
			pay_ntc_addr1(value);
			return;
		}
		if ($pay_ntc_addr2.equalsIgnoreCase(name)) {
			pay_ntc_addr2(value);
			return;
		}
		if ($pay_ntc_addr3.equalsIgnoreCase(name)) {
			pay_ntc_addr3(value);
			return;
		}
		if ($pay_ntc_addr4.equalsIgnoreCase(name)) {
			pay_ntc_addr4(value);
			return;
		}
		if ($pay_ntc_tel.equalsIgnoreCase(name)) {
			pay_ntc_tel(value);
			return;
		}
		if ($pay_ntc_bsppl_nm.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_nm(value);
			return;
		}
		if ($pay_ntc_bsppl_dpt.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_dpt(value);
			return;
		}
		if ($pay_ntc_bsppl_psn.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_psn(value);
			return;
		}
		if ($pay_ntc_bsppl_psn_title.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_psn_title(value);
			return;
		}
		if ($pay_ntc_dtl_subttl_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_subttl_typ(value);
			return;
		}
		if ($pay_ntc_dtl_subttl_typ_nm.equalsIgnoreCase(name)) {
			pay_ntc_dtl_subttl_typ_nm(value);
			return;
		}
		if ($pay_ntc_dtl_brk_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_brk_typ(value);
			return;
		}
		if ($pay_ntc_dtl_brk_typ_nm.equalsIgnoreCase(name)) {
			pay_ntc_dtl_brk_typ_nm(value);
			return;
		}
		if ($pay_ntc_dtl_sort_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_sort_typ(value);
			return;
		}
		if ($pay_ntc_dtl_sort_typ_nm.equalsIgnoreCase(name)) {
			pay_ntc_dtl_sort_typ_nm(value);
			return;
		}
		if ($pay_ntc_can_slip_typ.equalsIgnoreCase(name)) {
			pay_ntc_can_slip_typ(value);
			return;
		}
		if ($pay_ntc_can_slip_typ_nm.equalsIgnoreCase(name)) {
			pay_ntc_can_slip_typ_nm(value);
			return;
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			psppl_rmrks(value);
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
		if ($check_pay_dpt_cd.equalsIgnoreCase(name)) {
			check_pay_dpt_cd(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			psppl_prnt_typ(value);
			return;
		}
		if ($psppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			psppl_prnt_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			bsppl_flg(value);
			return;
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			psppl_flg(value);
			return;
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			purc_interim_cl_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($tax_on_pay_flg.equalsIgnoreCase(name)) {
			tax_on_pay_flg(value);
			return;
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			batch_pay_schd_cl_flg(value);
			return;
		}
		if ($pay_ntc_prnt_flg.equalsIgnoreCase(name)) {
			pay_ntc_prnt_flg(value);
			return;
		}
		if ($pay_ntc_dtl_outp_flg.equalsIgnoreCase(name)) {
			pay_ntc_dtl_outp_flg(value);
			return;
		}
		if ($pay_ntc_bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			pay_ntc_bfw_bal_disp_flg(value);
			return;
		}
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			pay_ntc_adv_pay_flg(value);
			return;
		}
		if ($pay_ntc_dtl_pay_flg.equalsIgnoreCase(name)) {
			pay_ntc_dtl_pay_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
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
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			bsppl_dpt_nm(value);
			return;
		}
		if ($check_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			check_bsppl_dpt_cd(value);
			return;
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			ap_cred_cd(value);
			return;
		}
		if ($ap_cred_nm.equalsIgnoreCase(name)) {
			ap_cred_nm(value);
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
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			ap_setoff_grp_cd(value);
			return;
		}
		if ($ap_setoff_grp_nm.equalsIgnoreCase(name)) {
			ap_setoff_grp_nm(value);
			return;
		}
		if ($pay_tax_rnd_typ.equalsIgnoreCase(name)) {
			pay_tax_rnd_typ(value);
			return;
		}
		if ($pay_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			pay_tax_rnd_typ_nm(value);
			return;
		}
		if ($pay_schd_ba_typ.equalsIgnoreCase(name)) {
			pay_schd_ba_typ(value);
			return;
		}
		if ($pay_schd_ba_typ_nm.equalsIgnoreCase(name)) {
			pay_schd_ba_typ_nm(value);
			return;
		}
		if ($pay_schd_cl_ba_typ.equalsIgnoreCase(name)) {
			pay_schd_cl_ba_typ(value);
			return;
		}
		if ($pay_schd_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			pay_schd_cl_ba_typ_nm(value);
			return;
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			bsppl_prnt_typ(value);
			return;
		}
		if ($bsppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			bsppl_prnt_typ_nm(value);
			return;
		}
		if ($pay_ntc_zip_cd.equalsIgnoreCase(name)) {
			pay_ntc_zip_cd(value);
			return;
		}
		if ($pay_ntc_addr1.equalsIgnoreCase(name)) {
			pay_ntc_addr1(value);
			return;
		}
		if ($pay_ntc_addr2.equalsIgnoreCase(name)) {
			pay_ntc_addr2(value);
			return;
		}
		if ($pay_ntc_addr3.equalsIgnoreCase(name)) {
			pay_ntc_addr3(value);
			return;
		}
		if ($pay_ntc_addr4.equalsIgnoreCase(name)) {
			pay_ntc_addr4(value);
			return;
		}
		if ($pay_ntc_tel.equalsIgnoreCase(name)) {
			pay_ntc_tel(value);
			return;
		}
		if ($pay_ntc_bsppl_nm.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_nm(value);
			return;
		}
		if ($pay_ntc_bsppl_dpt.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_dpt(value);
			return;
		}
		if ($pay_ntc_bsppl_psn.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_psn(value);
			return;
		}
		if ($pay_ntc_bsppl_psn_title.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_psn_title(value);
			return;
		}
		if ($pay_ntc_dtl_subttl_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_subttl_typ(value);
			return;
		}
		if ($pay_ntc_dtl_subttl_typ_nm.equalsIgnoreCase(name)) {
			pay_ntc_dtl_subttl_typ_nm(value);
			return;
		}
		if ($pay_ntc_dtl_brk_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_brk_typ(value);
			return;
		}
		if ($pay_ntc_dtl_brk_typ_nm.equalsIgnoreCase(name)) {
			pay_ntc_dtl_brk_typ_nm(value);
			return;
		}
		if ($pay_ntc_dtl_sort_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_sort_typ(value);
			return;
		}
		if ($pay_ntc_dtl_sort_typ_nm.equalsIgnoreCase(name)) {
			pay_ntc_dtl_sort_typ_nm(value);
			return;
		}
		if ($pay_ntc_can_slip_typ.equalsIgnoreCase(name)) {
			pay_ntc_can_slip_typ(value);
			return;
		}
		if ($pay_ntc_can_slip_typ_nm.equalsIgnoreCase(name)) {
			pay_ntc_can_slip_typ_nm(value);
			return;
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			psppl_rmrks(value);
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
		if ($check_pay_dpt_cd.equalsIgnoreCase(name)) {
			check_pay_dpt_cd(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			psppl_prnt_typ(value);
			return;
		}
		if ($psppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			psppl_prnt_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
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
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			bsppl_flg(value);
			return;
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			psppl_flg(value);
			return;
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			purc_interim_cl_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($tax_on_pay_flg.equalsIgnoreCase(name)) {
			tax_on_pay_flg(value);
			return;
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			batch_pay_schd_cl_flg(value);
			return;
		}
		if ($pay_ntc_prnt_flg.equalsIgnoreCase(name)) {
			pay_ntc_prnt_flg(value);
			return;
		}
		if ($pay_ntc_dtl_outp_flg.equalsIgnoreCase(name)) {
			pay_ntc_dtl_outp_flg(value);
			return;
		}
		if ($pay_ntc_bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			pay_ntc_bfw_bal_disp_flg(value);
			return;
		}
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			pay_ntc_adv_pay_flg(value);
			return;
		}
		if ($pay_ntc_dtl_pay_flg.equalsIgnoreCase(name)) {
			pay_ntc_dtl_pay_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

