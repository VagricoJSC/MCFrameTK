package mcframe.serverMABC.MABCL0580;

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
 * ブロック"BpBsppl_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BpBsppl_UpdChk01_DtlR_MC_A extends MCConstRow {

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
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
	 * AP credit managed BP cd. 債務与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $ap_cred_cd = "ap_cred_cd";
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd = "bsppl_dpt_cd";
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $check_bsppl_dpt_cd = "check_bsppl_dpt_cd";
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
	 * Purchase temporary unit price closing 仕入仮単価締.<p>
	 *
	 */
	public static final String $purc_interim_cl_flg = "purc_interim_cl_flg";
	/**
	 * AP offset group cd. 債務相殺グループＣＤ.<p>
	 *
	 */
	public static final String $ap_setoff_grp_cd = "ap_setoff_grp_cd";
	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public static final String $pay_bank_ac_cd = "pay_bank_ac_cd";
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
	 * Payment schedule before/after type 支払予定前後区分.<p>
	 *
	 */
	public static final String $pay_schd_ba_typ = "pay_schd_ba_typ";
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
	 * Payment notice details page break type 支払通知書明細改頁区分.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_brk_typ = "pay_ntc_dtl_brk_typ";
	/**
	 * Payment notice details sorting order type 支払通知書明細並順区分.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_sort_typ = "pay_ntc_dtl_sort_typ";
	/**
	 * Payment notice cancel slip display type 支払通知書取消伝票表示区分.<p>
	 *
	 */
	public static final String $pay_ntc_can_slip_typ = "pay_ntc_can_slip_typ";
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
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public static final String $check_pay_dpt_cd = "check_pay_dpt_cd";
	/**
	 * Report issue type (Scheduled payee) 帳票発行区分（支払予定管理先）.<p>
	 *
	 */
	public static final String $bsppl_prnt_typ = "bsppl_prnt_typ";
	/**
	 * Report issue type (Payee) 帳票発行区分（支払先）.<p>
	 *
	 */
	public static final String $psppl_prnt_typ = "psppl_prnt_typ";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_flg_META = createCommonMeta($bsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_flg_META = createCommonMeta($psppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ap_cred_cd_META = createCommonMeta($ap_cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta check_bsppl_dpt_cd_META = createCommonMeta($check_bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pay_spot_flg_META = createCommonMeta($pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_cl_day1_META = createCommonMeta($psppl_cl_day1, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day2_META = createCommonMeta($psppl_cl_day2, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day3_META = createCommonMeta($psppl_cl_day3, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day4_META = createCommonMeta($psppl_cl_day4, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day5_META = createCommonMeta($psppl_cl_day5, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta purc_interim_cl_flg_META = createCommonMeta($purc_interim_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_setoff_grp_cd_META = createCommonMeta($ap_setoff_grp_cd, mcframe.commonMA.meta.MA_META.SETOFF_GRP_CD);
	public static final MCMeta pay_bank_ac_cd_META = createCommonMeta($pay_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta tax_on_pay_flg_META = createCommonMeta($tax_on_pay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_tax_rnd_typ_META = createCommonMeta($pay_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta pay_schd_ba_typ_META = createCommonMeta($pay_schd_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta batch_pay_schd_cl_flg_META = createCommonMeta($batch_pay_schd_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_schd_cl_delay_days_META = createCommonMeta($pay_schd_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta pay_schd_cl_ba_typ_META = createCommonMeta($pay_schd_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
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
	public static final MCMeta pay_ntc_dtl_brk_typ_META = createCommonMeta($pay_ntc_dtl_brk_typ, mcframe.commonMA.meta.MA_META.PAY_NTC_DTL_BRK_TYP);
	public static final MCMeta pay_ntc_dtl_sort_typ_META = createCommonMeta($pay_ntc_dtl_sort_typ, mcframe.commonMA.meta.MA_META.PAY_NTC_DTL_SORT_TYP);
	public static final MCMeta pay_ntc_can_slip_typ_META = createCommonMeta($pay_ntc_can_slip_typ, mcframe.commonMA.meta.MA_META.PAY_NTC_CAN_SLIP_TYP);
	public static final MCMeta psppl_rmrks_META = createCommonMeta($psppl_rmrks, mcframe.commonMA.meta.MA_META.PSPPL_RMRKS);
	public static final MCMeta note_days_META = createCommonMeta($note_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta pay_dpt_cd_META = createCommonMeta($pay_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta check_pay_dpt_cd_META = createCommonMeta($check_pay_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bsppl_prnt_typ_META = createCommonMeta($bsppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta psppl_prnt_typ_META = createCommonMeta($psppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<BpBsppl_UpdChk01_DtlR> constMetas = new ConstMetaList<BpBsppl_UpdChk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bp_cd_META,
			bsppl_flg_META,
			psppl_flg_META,
			psppl_cd_META,
			ap_cred_cd_META,
			bsppl_dpt_cd_META,
			check_bsppl_dpt_cd_META,
			pay_spot_flg_META,
			psppl_cl_day1_META,
			psppl_cl_day2_META,
			psppl_cl_day3_META,
			psppl_cl_day4_META,
			psppl_cl_day5_META,
			purc_interim_cl_flg_META,
			ap_setoff_grp_cd_META,
			pay_bank_ac_cd_META,
			tax_on_pay_flg_META,
			pay_tax_rnd_typ_META,
			pay_schd_ba_typ_META,
			batch_pay_schd_cl_flg_META,
			pay_schd_cl_delay_days_META,
			pay_schd_cl_ba_typ_META,
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
			pay_ntc_dtl_brk_typ_META,
			pay_ntc_dtl_sort_typ_META,
			pay_ntc_can_slip_typ_META,
			psppl_rmrks_META,
			note_days_META,
			pay_dpt_cd_META,
			check_pay_dpt_cd_META,
			bsppl_prnt_typ_META,
			psppl_prnt_typ_META,
			upd_cntr_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$bp_cd, "E"}	// bp_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$pay_tax_rnd_typ, "MAC_RND_TYP"},	// pay_tax_rnd_typ
				{$pay_schd_ba_typ, "MAC_BA_TYP"},	// pay_schd_ba_typ
				{$pay_schd_cl_ba_typ, "MAC_BA_TYP"},	// pay_schd_cl_ba_typ
				{$pay_ntc_dtl_subttl_typ, "MAC_PAY_NTC_DTL_SUBTTL_TYP"},	// pay_ntc_dtl_subttl_typ
				{$pay_ntc_dtl_brk_typ, "MAC_PAY_NTC_DTL_BRK_TYP"},	// pay_ntc_dtl_brk_typ
				{$pay_ntc_dtl_sort_typ, "MAC_PAY_NTC_DTL_SORT_TYP"},	// pay_ntc_dtl_sort_typ
				{$pay_ntc_can_slip_typ, "MAC_PAY_NTC_CAN_SLIP_TYP"},	// pay_ntc_can_slip_typ
				{$bsppl_prnt_typ, "MAC_PRNT_TYP"},	// bsppl_prnt_typ
				{$psppl_prnt_typ, "MAC_PRNT_TYP"}	// psppl_prnt_typ
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$bp_cd, "MA.MAUAL0010.Bp"},	// bp_cd
				{$psppl_cd, "MA.MAUAL0010.Bp"},	// psppl_cd
				{$ap_cred_cd, "MA.MAUAL0010.Bp"},	// ap_cred_cd
				{$check_bsppl_dpt_cd, "MA.MAUAL0010.Dpt"},	// check_bsppl_dpt_cd
				{$ap_setoff_grp_cd, "MA.MAUAL0010.SetoffGrp"},	// ap_setoff_grp_cd
				{$pay_bank_ac_cd, "MA.MAUAL0010.ExtBankAc"},	// pay_bank_ac_cd
				{$check_pay_dpt_cd, "MA.MAUAL0010.Dpt"}	// check_pay_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$bp_cd, "MAC_BP_IS_SRCH_TYP.BSPPL_PSPPL"},	// bp_cd
				{$psppl_cd, "MAC_BP_IS_SRCH_TYP.PSPPL;true;bp_cd"},	// psppl_cd
				{$ap_cred_cd, "MAC_BP_IS_SRCH_TYP.CRED;true;bp_cd"},	// ap_cred_cd
				{$check_bsppl_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP;true"},	// check_bsppl_dpt_cd
				{$check_pay_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP;true"}	// check_pay_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$bp_cd, "bp_is_srch_typ"},	// bp_cd
				{$psppl_cd, "bp_is_srch_typ;check_rem_flg;ref_bp_cd"},	// psppl_cd
				{$ap_cred_cd, "bp_is_srch_typ;check_rem_flg;ref_bp_cd"},	// ap_cred_cd
				{$check_bsppl_dpt_cd, "dpt_is_srch_typ;mode_today_flg"},	// check_bsppl_dpt_cd
				{$check_pay_dpt_cd, "dpt_is_srch_typ;mode_today_flg"}	// check_pay_dpt_cd
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
				{$pay_ntc_zip_cd, "ZIP"},	// pay_ntc_zip_cd
				{$pay_ntc_tel, "TEL"}	// pay_ntc_tel
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
				{$bsppl_flg, "E"},	// bsppl_flg
				{$psppl_flg, "E"}	// psppl_flg
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
	protected BpBsppl_UpdChk01_DtlR_MC_A(ConstMetaList<? extends BpBsppl_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BpBsppl_UpdChk01_DtlR clone() {
		return (BpBsppl_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BpBsppl_UpdChk01_DtlR createInstance() {
		return (BpBsppl_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BpBsppl_UpdChk01_DtlR getValues(String... names) {
		return (BpBsppl_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
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
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public boolean bsppl_flg() {
		return getConstBoolean(offset + 1, $bsppl_flg);
	}

	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public void bsppl_flg(boolean value) {
		setConstBoolean(offset + 1, $bsppl_flg, value);
	}


	/**
	 * Payee 支払先.<p>
	 *
	 */
	public boolean psppl_flg() {
		return getConstBoolean(offset + 2, $psppl_flg);
	}

	/**
	 * Payee 支払先.<p>
	 *
	 */
	public void psppl_flg(boolean value) {
		setConstBoolean(offset + 2, $psppl_flg, value);
	}


	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 3, $psppl_cd);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 3, $psppl_cd, value);
	}


	/**
	 * AP credit managed BP cd. 債務与信管理先ＣＤ.<p>
	 *
	 */
	public String ap_cred_cd() {
		return getConstString(offset + 4, $ap_cred_cd);
	}

	/**
	 * AP credit managed BP cd. 債務与信管理先ＣＤ.<p>
	 *
	 */
	public void ap_cred_cd(String value) {
		setConstString(offset + 4, $ap_cred_cd, value);
	}


	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 5, $bsppl_dpt_cd);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 5, $bsppl_dpt_cd, value);
	}


	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String check_bsppl_dpt_cd() {
		return getConstString(offset + 6, $check_bsppl_dpt_cd);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void check_bsppl_dpt_cd(String value) {
		setConstString(offset + 6, $check_bsppl_dpt_cd, value);
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
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public MCNumber psppl_cl_day1() {
		return getConstNumber(offset + 8, $psppl_cl_day1);
	}

	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(MCNumber value) {
		setConstNumber(offset + 8, $psppl_cl_day1, value);
	}

	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(int value) {
		setConstNumber(offset + 8, $psppl_cl_day1, value);
	}

	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(long value) {
		setConstNumber(offset + 8, $psppl_cl_day1, value);
	}

	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(float value) {
		setConstNumber(offset + 8, $psppl_cl_day1, value);
	}

	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(double value) {
		setConstNumber(offset + 8, $psppl_cl_day1, value);
	}


	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public MCNumber psppl_cl_day2() {
		return getConstNumber(offset + 9, $psppl_cl_day2);
	}

	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(MCNumber value) {
		setConstNumber(offset + 9, $psppl_cl_day2, value);
	}

	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(int value) {
		setConstNumber(offset + 9, $psppl_cl_day2, value);
	}

	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(long value) {
		setConstNumber(offset + 9, $psppl_cl_day2, value);
	}

	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(float value) {
		setConstNumber(offset + 9, $psppl_cl_day2, value);
	}

	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(double value) {
		setConstNumber(offset + 9, $psppl_cl_day2, value);
	}


	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public MCNumber psppl_cl_day3() {
		return getConstNumber(offset + 10, $psppl_cl_day3);
	}

	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(MCNumber value) {
		setConstNumber(offset + 10, $psppl_cl_day3, value);
	}

	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(int value) {
		setConstNumber(offset + 10, $psppl_cl_day3, value);
	}

	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(long value) {
		setConstNumber(offset + 10, $psppl_cl_day3, value);
	}

	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(float value) {
		setConstNumber(offset + 10, $psppl_cl_day3, value);
	}

	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(double value) {
		setConstNumber(offset + 10, $psppl_cl_day3, value);
	}


	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public MCNumber psppl_cl_day4() {
		return getConstNumber(offset + 11, $psppl_cl_day4);
	}

	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(MCNumber value) {
		setConstNumber(offset + 11, $psppl_cl_day4, value);
	}

	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(int value) {
		setConstNumber(offset + 11, $psppl_cl_day4, value);
	}

	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(long value) {
		setConstNumber(offset + 11, $psppl_cl_day4, value);
	}

	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(float value) {
		setConstNumber(offset + 11, $psppl_cl_day4, value);
	}

	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(double value) {
		setConstNumber(offset + 11, $psppl_cl_day4, value);
	}


	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public MCNumber psppl_cl_day5() {
		return getConstNumber(offset + 12, $psppl_cl_day5);
	}

	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(MCNumber value) {
		setConstNumber(offset + 12, $psppl_cl_day5, value);
	}

	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(int value) {
		setConstNumber(offset + 12, $psppl_cl_day5, value);
	}

	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(long value) {
		setConstNumber(offset + 12, $psppl_cl_day5, value);
	}

	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(float value) {
		setConstNumber(offset + 12, $psppl_cl_day5, value);
	}

	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(double value) {
		setConstNumber(offset + 12, $psppl_cl_day5, value);
	}


	/**
	 * Purchase temporary unit price closing 仕入仮単価締.<p>
	 *
	 */
	public boolean purc_interim_cl_flg() {
		return getConstBoolean(offset + 13, $purc_interim_cl_flg);
	}

	/**
	 * Purchase temporary unit price closing 仕入仮単価締.<p>
	 *
	 */
	public void purc_interim_cl_flg(boolean value) {
		setConstBoolean(offset + 13, $purc_interim_cl_flg, value);
	}


	/**
	 * AP offset group cd. 債務相殺グループＣＤ.<p>
	 *
	 */
	public String ap_setoff_grp_cd() {
		return getConstString(offset + 14, $ap_setoff_grp_cd);
	}

	/**
	 * AP offset group cd. 債務相殺グループＣＤ.<p>
	 *
	 */
	public void ap_setoff_grp_cd(String value) {
		setConstString(offset + 14, $ap_setoff_grp_cd, value);
	}


	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return getConstString(offset + 15, $pay_bank_ac_cd);
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		setConstString(offset + 15, $pay_bank_ac_cd, value);
	}


	/**
	 * Payment tax calculation 支払税計算.<p>
	 *
	 */
	public boolean tax_on_pay_flg() {
		return getConstBoolean(offset + 16, $tax_on_pay_flg);
	}

	/**
	 * Payment tax calculation 支払税計算.<p>
	 *
	 */
	public void tax_on_pay_flg(boolean value) {
		setConstBoolean(offset + 16, $tax_on_pay_flg, value);
	}


	/**
	 * Payment tax amount rounding type 支払税額端数処理区分.<p>
	 *
	 */
	public String pay_tax_rnd_typ() {
		return getConstString(offset + 17, $pay_tax_rnd_typ);
	}

	/**
	 * Payment tax amount rounding type 支払税額端数処理区分.<p>
	 *
	 */
	public void pay_tax_rnd_typ(String value) {
		setConstString(offset + 17, $pay_tax_rnd_typ, value);
	}


	/**
	 * Payment schedule before/after type 支払予定前後区分.<p>
	 *
	 */
	public String pay_schd_ba_typ() {
		return getConstString(offset + 18, $pay_schd_ba_typ);
	}

	/**
	 * Payment schedule before/after type 支払予定前後区分.<p>
	 *
	 */
	public void pay_schd_ba_typ(String value) {
		setConstString(offset + 18, $pay_schd_ba_typ, value);
	}


	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public boolean batch_pay_schd_cl_flg() {
		return getConstBoolean(offset + 19, $batch_pay_schd_cl_flg);
	}

	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public void batch_pay_schd_cl_flg(boolean value) {
		setConstBoolean(offset + 19, $batch_pay_schd_cl_flg, value);
	}


	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public MCNumber pay_schd_cl_delay_days() {
		return getConstNumber(offset + 20, $pay_schd_cl_delay_days);
	}

	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 20, $pay_schd_cl_delay_days, value);
	}

	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(int value) {
		setConstNumber(offset + 20, $pay_schd_cl_delay_days, value);
	}

	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(long value) {
		setConstNumber(offset + 20, $pay_schd_cl_delay_days, value);
	}

	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(float value) {
		setConstNumber(offset + 20, $pay_schd_cl_delay_days, value);
	}

	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(double value) {
		setConstNumber(offset + 20, $pay_schd_cl_delay_days, value);
	}


	/**
	 * Payment schedule closing before/after type 支払予定締前後区分.<p>
	 *
	 */
	public String pay_schd_cl_ba_typ() {
		return getConstString(offset + 21, $pay_schd_cl_ba_typ);
	}

	/**
	 * Payment schedule closing before/after type 支払予定締前後区分.<p>
	 *
	 */
	public void pay_schd_cl_ba_typ(String value) {
		setConstString(offset + 21, $pay_schd_cl_ba_typ, value);
	}


	/**
	 * Payment notice to be issued 支払通知書発行対象.<p>
	 *
	 */
	public boolean pay_ntc_prnt_flg() {
		return getConstBoolean(offset + 22, $pay_ntc_prnt_flg);
	}

	/**
	 * Payment notice to be issued 支払通知書発行対象.<p>
	 *
	 */
	public void pay_ntc_prnt_flg(boolean value) {
		setConstBoolean(offset + 22, $pay_ntc_prnt_flg, value);
	}


	/**
	 * Payment notice send-to zip code 支払通知書送付郵便番号.<p>
	 *
	 */
	public String pay_ntc_zip_cd() {
		return getConstString(offset + 23, $pay_ntc_zip_cd);
	}

	/**
	 * Payment notice send-to zip code 支払通知書送付郵便番号.<p>
	 *
	 */
	public void pay_ntc_zip_cd(String value) {
		setConstString(offset + 23, $pay_ntc_zip_cd, value);
	}


	/**
	 * Payment notice send-to address 1 支払通知書送付住所１.<p>
	 *
	 */
	public String pay_ntc_addr1() {
		return getConstString(offset + 24, $pay_ntc_addr1);
	}

	/**
	 * Payment notice send-to address 1 支払通知書送付住所１.<p>
	 *
	 */
	public void pay_ntc_addr1(String value) {
		setConstString(offset + 24, $pay_ntc_addr1, value);
	}


	/**
	 * Payment notice send-to address 2 支払通知書送付住所２.<p>
	 *
	 */
	public String pay_ntc_addr2() {
		return getConstString(offset + 25, $pay_ntc_addr2);
	}

	/**
	 * Payment notice send-to address 2 支払通知書送付住所２.<p>
	 *
	 */
	public void pay_ntc_addr2(String value) {
		setConstString(offset + 25, $pay_ntc_addr2, value);
	}


	/**
	 * Payment notice send-to address 3 支払通知書送付住所３.<p>
	 *
	 */
	public String pay_ntc_addr3() {
		return getConstString(offset + 26, $pay_ntc_addr3);
	}

	/**
	 * Payment notice send-to address 3 支払通知書送付住所３.<p>
	 *
	 */
	public void pay_ntc_addr3(String value) {
		setConstString(offset + 26, $pay_ntc_addr3, value);
	}


	/**
	 * Payment notice send-to address 4 支払通知書送付住所４.<p>
	 *
	 */
	public String pay_ntc_addr4() {
		return getConstString(offset + 27, $pay_ntc_addr4);
	}

	/**
	 * Payment notice send-to address 4 支払通知書送付住所４.<p>
	 *
	 */
	public void pay_ntc_addr4(String value) {
		setConstString(offset + 27, $pay_ntc_addr4, value);
	}


	/**
	 * Payment notice send-to TEL 支払通知書送付ＴＥＬ.<p>
	 *
	 */
	public String pay_ntc_tel() {
		return getConstString(offset + 28, $pay_ntc_tel);
	}

	/**
	 * Payment notice send-to TEL 支払通知書送付ＴＥＬ.<p>
	 *
	 */
	public void pay_ntc_tel(String value) {
		setConstString(offset + 28, $pay_ntc_tel, value);
	}


	/**
	 * Payment notice destination 支払通知書宛先.<p>
	 *
	 */
	public String pay_ntc_bsppl_nm() {
		return getConstString(offset + 29, $pay_ntc_bsppl_nm);
	}

	/**
	 * Payment notice destination 支払通知書宛先.<p>
	 *
	 */
	public void pay_ntc_bsppl_nm(String value) {
		setConstString(offset + 29, $pay_ntc_bsppl_nm, value);
	}


	/**
	 * Payment notice send-to dept. 支払通知書送付部署.<p>
	 *
	 */
	public String pay_ntc_bsppl_dpt() {
		return getConstString(offset + 30, $pay_ntc_bsppl_dpt);
	}

	/**
	 * Payment notice send-to dept. 支払通知書送付部署.<p>
	 *
	 */
	public void pay_ntc_bsppl_dpt(String value) {
		setConstString(offset + 30, $pay_ntc_bsppl_dpt, value);
	}


	/**
	 * Payment notice send-to PIC 支払通知書送付担当者.<p>
	 *
	 */
	public String pay_ntc_bsppl_psn() {
		return getConstString(offset + 31, $pay_ntc_bsppl_psn);
	}

	/**
	 * Payment notice send-to PIC 支払通知書送付担当者.<p>
	 *
	 */
	public void pay_ntc_bsppl_psn(String value) {
		setConstString(offset + 31, $pay_ntc_bsppl_psn, value);
	}


	/**
	 * Payment notice send-to PIC honorific title 支払通知書送付担当者敬称.<p>
	 *
	 */
	public String pay_ntc_bsppl_psn_title() {
		return getConstString(offset + 32, $pay_ntc_bsppl_psn_title);
	}

	/**
	 * Payment notice send-to PIC honorific title 支払通知書送付担当者敬称.<p>
	 *
	 */
	public void pay_ntc_bsppl_psn_title(String value) {
		setConstString(offset + 32, $pay_ntc_bsppl_psn_title, value);
	}


	/**
	 * Output payment notice details 支払通知書明細出力.<p>
	 *
	 */
	public boolean pay_ntc_dtl_outp_flg() {
		return getConstBoolean(offset + 33, $pay_ntc_dtl_outp_flg);
	}

	/**
	 * Output payment notice details 支払通知書明細出力.<p>
	 *
	 */
	public void pay_ntc_dtl_outp_flg(boolean value) {
		setConstBoolean(offset + 33, $pay_ntc_dtl_outp_flg, value);
	}


	/**
	 * Display balance of previous month on payment notice 支払通知書前月残高表示.<p>
	 *
	 */
	public boolean pay_ntc_bfw_bal_disp_flg() {
		return getConstBoolean(offset + 34, $pay_ntc_bfw_bal_disp_flg);
	}

	/**
	 * Display balance of previous month on payment notice 支払通知書前月残高表示.<p>
	 *
	 */
	public void pay_ntc_bfw_bal_disp_flg(boolean value) {
		setConstBoolean(offset + 34, $pay_ntc_bfw_bal_disp_flg, value);
	}


	/**
	 * Display advance payment on payment notice 支払通知書前渡金表示.<p>
	 *
	 */
	public boolean pay_ntc_adv_pay_flg() {
		return getConstBoolean(offset + 35, $pay_ntc_adv_pay_flg);
	}

	/**
	 * Display advance payment on payment notice 支払通知書前渡金表示.<p>
	 *
	 */
	public void pay_ntc_adv_pay_flg(boolean value) {
		setConstBoolean(offset + 35, $pay_ntc_adv_pay_flg, value);
	}


	/**
	 * Display payment schedule on payment notice 支払通知書支払予定表示.<p>
	 *
	 */
	public boolean pay_ntc_dtl_pay_flg() {
		return getConstBoolean(offset + 36, $pay_ntc_dtl_pay_flg);
	}

	/**
	 * Display payment schedule on payment notice 支払通知書支払予定表示.<p>
	 *
	 */
	public void pay_ntc_dtl_pay_flg(boolean value) {
		setConstBoolean(offset + 36, $pay_ntc_dtl_pay_flg, value);
	}


	/**
	 * Payment notice details subtotal type 支払通知書明細小計区分.<p>
	 *
	 */
	public String pay_ntc_dtl_subttl_typ() {
		return getConstString(offset + 37, $pay_ntc_dtl_subttl_typ);
	}

	/**
	 * Payment notice details subtotal type 支払通知書明細小計区分.<p>
	 *
	 */
	public void pay_ntc_dtl_subttl_typ(String value) {
		setConstString(offset + 37, $pay_ntc_dtl_subttl_typ, value);
	}


	/**
	 * Payment notice details page break type 支払通知書明細改頁区分.<p>
	 *
	 */
	public String pay_ntc_dtl_brk_typ() {
		return getConstString(offset + 38, $pay_ntc_dtl_brk_typ);
	}

	/**
	 * Payment notice details page break type 支払通知書明細改頁区分.<p>
	 *
	 */
	public void pay_ntc_dtl_brk_typ(String value) {
		setConstString(offset + 38, $pay_ntc_dtl_brk_typ, value);
	}


	/**
	 * Payment notice details sorting order type 支払通知書明細並順区分.<p>
	 *
	 */
	public String pay_ntc_dtl_sort_typ() {
		return getConstString(offset + 39, $pay_ntc_dtl_sort_typ);
	}

	/**
	 * Payment notice details sorting order type 支払通知書明細並順区分.<p>
	 *
	 */
	public void pay_ntc_dtl_sort_typ(String value) {
		setConstString(offset + 39, $pay_ntc_dtl_sort_typ, value);
	}


	/**
	 * Payment notice cancel slip display type 支払通知書取消伝票表示区分.<p>
	 *
	 */
	public String pay_ntc_can_slip_typ() {
		return getConstString(offset + 40, $pay_ntc_can_slip_typ);
	}

	/**
	 * Payment notice cancel slip display type 支払通知書取消伝票表示区分.<p>
	 *
	 */
	public void pay_ntc_can_slip_typ(String value) {
		setConstString(offset + 40, $pay_ntc_can_slip_typ, value);
	}


	/**
	 * Payee remarks 支払先備考.<p>
	 *
	 */
	public String psppl_rmrks() {
		return getConstString(offset + 41, $psppl_rmrks);
	}

	/**
	 * Payee remarks 支払先備考.<p>
	 *
	 */
	public void psppl_rmrks(String value) {
		setConstString(offset + 41, $psppl_rmrks, value);
	}


	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public MCNumber note_days() {
		return getConstNumber(offset + 42, $note_days);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(MCNumber value) {
		setConstNumber(offset + 42, $note_days, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(int value) {
		setConstNumber(offset + 42, $note_days, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(long value) {
		setConstNumber(offset + 42, $note_days, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(float value) {
		setConstNumber(offset + 42, $note_days, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(double value) {
		setConstNumber(offset + 42, $note_days, value);
	}


	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public String pay_dpt_cd() {
		return getConstString(offset + 43, $pay_dpt_cd);
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public void pay_dpt_cd(String value) {
		setConstString(offset + 43, $pay_dpt_cd, value);
	}


	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public String check_pay_dpt_cd() {
		return getConstString(offset + 44, $check_pay_dpt_cd);
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public void check_pay_dpt_cd(String value) {
		setConstString(offset + 44, $check_pay_dpt_cd, value);
	}


	/**
	 * Report issue type (Scheduled payee) 帳票発行区分（支払予定管理先）.<p>
	 *
	 */
	public String bsppl_prnt_typ() {
		return getConstString(offset + 45, $bsppl_prnt_typ);
	}

	/**
	 * Report issue type (Scheduled payee) 帳票発行区分（支払予定管理先）.<p>
	 *
	 */
	public void bsppl_prnt_typ(String value) {
		setConstString(offset + 45, $bsppl_prnt_typ, value);
	}


	/**
	 * Report issue type (Payee) 帳票発行区分（支払先）.<p>
	 *
	 */
	public String psppl_prnt_typ() {
		return getConstString(offset + 46, $psppl_prnt_typ);
	}

	/**
	 * Report issue type (Payee) 帳票発行区分（支払先）.<p>
	 *
	 */
	public void psppl_prnt_typ(String value) {
		setConstString(offset + 46, $psppl_prnt_typ, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 47, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 47, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			return ap_cred_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($check_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return check_bsppl_dpt_cd();
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ap_setoff_grp_cd();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($pay_tax_rnd_typ.equalsIgnoreCase(name)) {
			return pay_tax_rnd_typ();
		}
		if ($pay_schd_ba_typ.equalsIgnoreCase(name)) {
			return pay_schd_ba_typ();
		}
		if ($pay_schd_cl_ba_typ.equalsIgnoreCase(name)) {
			return pay_schd_cl_ba_typ();
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
		if ($pay_ntc_dtl_brk_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_brk_typ();
		}
		if ($pay_ntc_dtl_sort_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_sort_typ();
		}
		if ($pay_ntc_can_slip_typ.equalsIgnoreCase(name)) {
			return pay_ntc_can_slip_typ();
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			return psppl_rmrks();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($check_pay_dpt_cd.equalsIgnoreCase(name)) {
			return check_pay_dpt_cd();
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			return bsppl_prnt_typ();
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			return psppl_prnt_typ();
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
	public boolean getBoolean(String name) {
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			return bsppl_flg();
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			return psppl_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			return purc_interim_cl_flg();
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
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			return ap_cred_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($check_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return check_bsppl_dpt_cd();
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ap_setoff_grp_cd();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($pay_tax_rnd_typ.equalsIgnoreCase(name)) {
			return pay_tax_rnd_typ();
		}
		if ($pay_schd_ba_typ.equalsIgnoreCase(name)) {
			return pay_schd_ba_typ();
		}
		if ($pay_schd_cl_ba_typ.equalsIgnoreCase(name)) {
			return pay_schd_cl_ba_typ();
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
		if ($pay_ntc_dtl_brk_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_brk_typ();
		}
		if ($pay_ntc_dtl_sort_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_sort_typ();
		}
		if ($pay_ntc_can_slip_typ.equalsIgnoreCase(name)) {
			return pay_ntc_can_slip_typ();
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			return psppl_rmrks();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($check_pay_dpt_cd.equalsIgnoreCase(name)) {
			return check_pay_dpt_cd();
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			return bsppl_prnt_typ();
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			return psppl_prnt_typ();
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
	public boolean getBooleanNE(String name) {
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			return bsppl_flg();
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			return psppl_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			return purc_interim_cl_flg();
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
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			ap_cred_cd(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($check_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			check_bsppl_dpt_cd(value);
			return;
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			ap_setoff_grp_cd(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($pay_tax_rnd_typ.equalsIgnoreCase(name)) {
			pay_tax_rnd_typ(value);
			return;
		}
		if ($pay_schd_ba_typ.equalsIgnoreCase(name)) {
			pay_schd_ba_typ(value);
			return;
		}
		if ($pay_schd_cl_ba_typ.equalsIgnoreCase(name)) {
			pay_schd_cl_ba_typ(value);
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
		if ($pay_ntc_dtl_brk_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_brk_typ(value);
			return;
		}
		if ($pay_ntc_dtl_sort_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_sort_typ(value);
			return;
		}
		if ($pay_ntc_can_slip_typ.equalsIgnoreCase(name)) {
			pay_ntc_can_slip_typ(value);
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
		if ($check_pay_dpt_cd.equalsIgnoreCase(name)) {
			check_pay_dpt_cd(value);
			return;
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			bsppl_prnt_typ(value);
			return;
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			psppl_prnt_typ(value);
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
	public void setBoolean(String name, boolean value) {
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			bsppl_flg(value);
			return;
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			psppl_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			purc_interim_cl_flg(value);
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
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			ap_cred_cd(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($check_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			check_bsppl_dpt_cd(value);
			return;
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			ap_setoff_grp_cd(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($pay_tax_rnd_typ.equalsIgnoreCase(name)) {
			pay_tax_rnd_typ(value);
			return;
		}
		if ($pay_schd_ba_typ.equalsIgnoreCase(name)) {
			pay_schd_ba_typ(value);
			return;
		}
		if ($pay_schd_cl_ba_typ.equalsIgnoreCase(name)) {
			pay_schd_cl_ba_typ(value);
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
		if ($pay_ntc_dtl_brk_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_brk_typ(value);
			return;
		}
		if ($pay_ntc_dtl_sort_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_sort_typ(value);
			return;
		}
		if ($pay_ntc_can_slip_typ.equalsIgnoreCase(name)) {
			pay_ntc_can_slip_typ(value);
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
		if ($check_pay_dpt_cd.equalsIgnoreCase(name)) {
			check_pay_dpt_cd(value);
			return;
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			bsppl_prnt_typ(value);
			return;
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			psppl_prnt_typ(value);
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
	public void setBooleanNE(String name, boolean value) {
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			bsppl_flg(value);
			return;
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			psppl_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			purc_interim_cl_flg(value);
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

