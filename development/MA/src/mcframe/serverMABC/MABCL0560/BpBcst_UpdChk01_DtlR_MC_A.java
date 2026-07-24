package mcframe.serverMABC.MABCL0560;

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
 * ブロック"BpBcst_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BpBcst_UpdChk01_DtlR_MC_A extends MCConstRow {

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public static final String $bcst_flg = "bcst_flg";
	/**
	 * Payer 入金先.<p>
	 *
	 */
	public static final String $rcst_flg = "rcst_flg";
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	/**
	 * AR credit managed BP cd. 債権与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $ar_cred_cd = "ar_cred_cd";
	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public static final String $bill_dpt_typ = "bill_dpt_typ";
	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $bcst_dpt_cd = "bcst_dpt_cd";
	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $check_bcst_dpt_cd = "check_bcst_dpt_cd";
	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public static final String $bill_cl_typ = "bill_cl_typ";
	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public static final String $bill_cl_day1 = "bill_cl_day1";
	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public static final String $bill_cl_day2 = "bill_cl_day2";
	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public static final String $bill_cl_day3 = "bill_cl_day3";
	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public static final String $bill_cl_day4 = "bill_cl_day4";
	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public static final String $bill_cl_day5 = "bill_cl_day5";
	/**
	 * Billing tax calculation 請求税計算.<p>
	 *
	 */
	public static final String $tax_on_bill_flg = "tax_on_bill_flg";
	/**
	 * Billing tax rounding type 請求税額端数処理区分.<p>
	 *
	 */
	public static final String $bill_tax_rnd_typ = "bill_tax_rnd_typ";
	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public static final String $bill_cl_delay_days = "bill_cl_delay_days";
	/**
	 * Billing closing before/after type 請求締前後区分.<p>
	 *
	 */
	public static final String $bill_cl_ba_typ = "bill_cl_ba_typ";
	/**
	 * Billing customer calendar cd. 請求先カレンダＣＤ.<p>
	 *
	 */
	public static final String $bill_cal_cd = "bill_cal_cd";
	/**
	 * Payment receipt schedule before/after type 入金予定前後区分.<p>
	 *
	 */
	public static final String $rcv_ba_typ = "rcv_ba_typ";
	/**
	 * Details auto-reconciliation 自動明細消込.<p>
	 *
	 */
	public static final String $auto_line_appl_flg = "auto_line_appl_flg";
	/**
	 * Sales temporary unit price closing 売上仮単価締.<p>
	 *
	 */
	public static final String $sls_interim_cl_flg = "sls_interim_cl_flg";
	/**
	 * AR offset group cd. 債権相殺グループＣＤ.<p>
	 *
	 */
	public static final String $ar_setoff_grp_cd = "ar_setoff_grp_cd";
	/**
	 * Invoice send-to zip code 請求書送付郵便番号.<p>
	 *
	 */
	public static final String $bill_zip_cd = "bill_zip_cd";
	/**
	 * Invoice send-to address 1 請求書送付住所１.<p>
	 *
	 */
	public static final String $bill_addr1 = "bill_addr1";
	/**
	 * Invoice send-to address 2 請求書送付住所２.<p>
	 *
	 */
	public static final String $bill_addr2 = "bill_addr2";
	/**
	 * Invoice send-to address 3 請求書送付住所３.<p>
	 *
	 */
	public static final String $bill_addr3 = "bill_addr3";
	/**
	 * Invoice send-to address 4 請求書送付住所４.<p>
	 *
	 */
	public static final String $bill_addr4 = "bill_addr4";
	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public static final String $bill_tel = "bill_tel";
	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public static final String $bill_bcst_nm = "bill_bcst_nm";
	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public static final String $bill_bcst_dpt = "bill_bcst_dpt";
	/**
	 * Invoice send-to PIC 請求書送付担当者.<p>
	 *
	 */
	public static final String $bill_bcst_psn = "bill_bcst_psn";
	/**
	 * Invoice send-to PIC honorific 請求書送付担当者敬称.<p>
	 *
	 */
	public static final String $bill_bcst_psn_title = "bill_bcst_psn_title";
	/**
	 * Invoice issue type 請求書発行区分.<p>
	 *
	 */
	public static final String $bill_prnt_typ = "bill_prnt_typ";
	/**
	 * Sales details output type 売上明細書出力区分.<p>
	 *
	 */
	public static final String $sls_dtl_outp_typ = "sls_dtl_outp_typ";
	/**
	 * Output invoice details 請求書明細出力.<p>
	 *
	 */
	public static final String $bill_dtl_outp_flg = "bill_dtl_outp_flg";
	/**
	 * Display balance of previous month on invoice 請求書前月残高表示.<p>
	 *
	 */
	public static final String $bfw_bal_disp_flg = "bfw_bal_disp_flg";
	/**
	 * Display advance received on invoice 請求書前受金表示.<p>
	 *
	 */
	public static final String $bill_dtl_adv_flg = "bill_dtl_adv_flg";
	/**
	 * Display payment receipt schedule in invoice 請求書入金予定表示.<p>
	 *
	 */
	public static final String $bill_dtl_rcv_flg = "bill_dtl_rcv_flg";
	/**
	 * Invoice details subtotal type 請求書明細小計区分.<p>
	 *
	 */
	public static final String $bill_dtl_subttl_typ = "bill_dtl_subttl_typ";
	/**
	 * Invoice details page break type 請求書明細改頁区分.<p>
	 *
	 */
	public static final String $bill_dtl_brk_typ = "bill_dtl_brk_typ";
	/**
	 * Invoice details sorting order type 請求書明細並順区分.<p>
	 *
	 */
	public static final String $bill_dtl_sort_typ = "bill_dtl_sort_typ";
	/**
	 * Invoice cancel slip display type 請求書取消伝票表示区分.<p>
	 *
	 */
	public static final String $bill_can_slip_typ = "bill_can_slip_typ";
	/**
	 * For auto-reconciliation 入金自動消込対象.<p>
	 *
	 */
	public static final String $rcv_auto_appl_tgt_flg = "rcv_auto_appl_tgt_flg";
	/**
	 * Match amount 金額考慮.<p>
	 *
	 */
	public static final String $rcv_amt_match_flg = "rcv_amt_match_flg";
	/**
	 * Include payment option 金種考慮.<p>
	 *
	 */
	public static final String $ar_sttl_typ_match_flg = "ar_sttl_typ_match_flg";
	/**
	 * Fee calculation 手数料計算.<p>
	 *
	 */
	public static final String $calc_com_paid_flg = "calc_com_paid_flg";
	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public static final String $auto_appl_delay_days = "auto_appl_delay_days";
	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public static final String $xfr_psn = "xfr_psn";
	/**
	 * Report issue type (Billing customer) 帳票発行区分（請求先）.<p>
	 *
	 */
	public static final String $bcst_prnt_typ = "bcst_prnt_typ";
	/**
	 * Report issue type (Payer) 帳票発行区分（入金先）.<p>
	 *
	 */
	public static final String $rcst_prnt_typ = "rcst_prnt_typ";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_flg_META = createCommonMeta($bcst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_flg_META = createCommonMeta($rcst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ar_cred_cd_META = createCommonMeta($ar_cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_dpt_typ_META = createCommonMeta($bill_dpt_typ, mcframe.commonMA.meta.MA_META.BILL_DPT_TYP);
	public static final MCMeta bcst_dpt_cd_META = createCommonMeta($bcst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta check_bcst_dpt_cd_META = createCommonMeta($check_bcst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_cl_typ_META = createCommonMeta($bill_cl_typ, mcframe.commonMA.meta.MA_META.BILL_CL_TYP);
	public static final MCMeta bill_cl_day1_META = createCommonMeta($bill_cl_day1, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day2_META = createCommonMeta($bill_cl_day2, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day3_META = createCommonMeta($bill_cl_day3, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day4_META = createCommonMeta($bill_cl_day4, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day5_META = createCommonMeta($bill_cl_day5, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta tax_on_bill_flg_META = createCommonMeta($tax_on_bill_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_tax_rnd_typ_META = createCommonMeta($bill_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta bill_cl_delay_days_META = createCommonMeta($bill_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta bill_cl_ba_typ_META = createCommonMeta($bill_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta bill_cal_cd_META = createCommonMeta($bill_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta rcv_ba_typ_META = createCommonMeta($rcv_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta auto_line_appl_flg_META = createCommonMeta($auto_line_appl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_interim_cl_flg_META = createCommonMeta($sls_interim_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_setoff_grp_cd_META = createCommonMeta($ar_setoff_grp_cd, mcframe.commonMA.meta.MA_META.SETOFF_GRP_CD);
	public static final MCMeta bill_zip_cd_META = createCommonMeta($bill_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta bill_addr1_META = createCommonMeta($bill_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta bill_addr2_META = createCommonMeta($bill_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta bill_addr3_META = createCommonMeta($bill_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta bill_addr4_META = createCommonMeta($bill_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta bill_tel_META = createCommonMeta($bill_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta bill_bcst_nm_META = createCommonMeta($bill_bcst_nm, mcframe.commonMA.meta.MA_META.BILL_BCST_NM);
	public static final MCMeta bill_bcst_dpt_META = createCommonMeta($bill_bcst_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta bill_bcst_psn_META = createCommonMeta($bill_bcst_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta bill_bcst_psn_title_META = createCommonMeta($bill_bcst_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta bill_prnt_typ_META = createCommonMeta($bill_prnt_typ, mcframe.commonMA.meta.MA_META.BILL_PRNT_TYP);
	public static final MCMeta sls_dtl_outp_typ_META = createCommonMeta($sls_dtl_outp_typ, mcframe.commonMA.meta.MA_META.SLS_DTL_OUTP_TYP);
	public static final MCMeta bill_dtl_outp_flg_META = createCommonMeta($bill_dtl_outp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bfw_bal_disp_flg_META = createCommonMeta($bfw_bal_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dtl_adv_flg_META = createCommonMeta($bill_dtl_adv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dtl_rcv_flg_META = createCommonMeta($bill_dtl_rcv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dtl_subttl_typ_META = createCommonMeta($bill_dtl_subttl_typ, mcframe.commonMA.meta.MA_META.BILL_DTL_SUBTTL_TYP);
	public static final MCMeta bill_dtl_brk_typ_META = createCommonMeta($bill_dtl_brk_typ, mcframe.commonMA.meta.MA_META.BILL_DTL_BRK_TYP);
	public static final MCMeta bill_dtl_sort_typ_META = createCommonMeta($bill_dtl_sort_typ, mcframe.commonMA.meta.MA_META.BILL_DTL_SORT_TYP);
	public static final MCMeta bill_can_slip_typ_META = createCommonMeta($bill_can_slip_typ, mcframe.commonMA.meta.MA_META.BILL_CAN_SLIP_TYP);
	public static final MCMeta rcv_auto_appl_tgt_flg_META = createCommonMeta($rcv_auto_appl_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_amt_match_flg_META = createCommonMeta($rcv_amt_match_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_sttl_typ_match_flg_META = createCommonMeta($ar_sttl_typ_match_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_com_paid_flg_META = createCommonMeta($calc_com_paid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta auto_appl_delay_days_META = createCommonMeta($auto_appl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta xfr_psn_META = createCommonMeta($xfr_psn, mcframe.commonMA.meta.MA_META.XFR_PSN);
	public static final MCMeta bcst_prnt_typ_META = createCommonMeta($bcst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta rcst_prnt_typ_META = createCommonMeta($rcst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<BpBcst_UpdChk01_DtlR> constMetas = new ConstMetaList<BpBcst_UpdChk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bp_cd_META,
			bcst_flg_META,
			rcst_flg_META,
			rcst_cd_META,
			ar_cred_cd_META,
			bill_dpt_typ_META,
			bcst_dpt_cd_META,
			check_bcst_dpt_cd_META,
			bill_cl_typ_META,
			bill_cl_day1_META,
			bill_cl_day2_META,
			bill_cl_day3_META,
			bill_cl_day4_META,
			bill_cl_day5_META,
			tax_on_bill_flg_META,
			bill_tax_rnd_typ_META,
			bill_cl_delay_days_META,
			bill_cl_ba_typ_META,
			bill_cal_cd_META,
			rcv_ba_typ_META,
			auto_line_appl_flg_META,
			sls_interim_cl_flg_META,
			ar_setoff_grp_cd_META,
			bill_zip_cd_META,
			bill_addr1_META,
			bill_addr2_META,
			bill_addr3_META,
			bill_addr4_META,
			bill_tel_META,
			bill_bcst_nm_META,
			bill_bcst_dpt_META,
			bill_bcst_psn_META,
			bill_bcst_psn_title_META,
			bill_prnt_typ_META,
			sls_dtl_outp_typ_META,
			bill_dtl_outp_flg_META,
			bfw_bal_disp_flg_META,
			bill_dtl_adv_flg_META,
			bill_dtl_rcv_flg_META,
			bill_dtl_subttl_typ_META,
			bill_dtl_brk_typ_META,
			bill_dtl_sort_typ_META,
			bill_can_slip_typ_META,
			rcv_auto_appl_tgt_flg_META,
			rcv_amt_match_flg_META,
			ar_sttl_typ_match_flg_META,
			calc_com_paid_flg_META,
			auto_appl_delay_days_META,
			xfr_psn_META,
			bcst_prnt_typ_META,
			rcst_prnt_typ_META,
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
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";

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
				{$bill_dpt_typ, "MAC_BILL_DPT_TYP"},	// bill_dpt_typ
				{$bill_cl_typ, "MAC_BILL_CL_TYP"},	// bill_cl_typ
				{$bill_tax_rnd_typ, "MAC_RND_TYP"},	// bill_tax_rnd_typ
				{$bill_cl_ba_typ, "MAC_BA_TYP"},	// bill_cl_ba_typ
				{$rcv_ba_typ, "MAC_BA_TYP"},	// rcv_ba_typ
				{$bill_prnt_typ, "MAC_BILL_PRNT_TYP"},	// bill_prnt_typ
				{$sls_dtl_outp_typ, "MAC_SLS_DTL_OUTP_TYP"},	// sls_dtl_outp_typ
				{$bill_dtl_subttl_typ, "MAC_BILL_DTL_SUBTTL_TYP"},	// bill_dtl_subttl_typ
				{$bill_dtl_brk_typ, "MAC_BILL_DTL_BRK_TYP"},	// bill_dtl_brk_typ
				{$bill_dtl_sort_typ, "MAC_BILL_DTL_SORT_TYP"},	// bill_dtl_sort_typ
				{$bill_can_slip_typ, "MAC_BILL_CAN_SLIP_TYP"},	// bill_can_slip_typ
				{$bcst_prnt_typ, "MAC_PRNT_TYP"},	// bcst_prnt_typ
				{$rcst_prnt_typ, "MAC_PRNT_TYP"}	// rcst_prnt_typ
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$bp_cd, "MA.MAUAL0010.Bp"},	// bp_cd
				{$rcst_cd, "MA.MAUAL0010.Bp"},	// rcst_cd
				{$ar_cred_cd, "MA.MAUAL0010.Bp"},	// ar_cred_cd
				{$check_bcst_dpt_cd, "MA.MAUAL0010.Dpt"},	// check_bcst_dpt_cd
				{$bill_cal_cd, "MA.MAUAL0010.CalBase"},	// bill_cal_cd
				{$ar_setoff_grp_cd, "MA.MAUAL0010.SetoffGrp"}	// ar_setoff_grp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$bp_cd, "MAC_BP_IS_SRCH_TYP.BCST_RCST"},	// bp_cd
				{$rcst_cd, "MAC_BP_IS_SRCH_TYP.RCST"},	// rcst_cd
				{$ar_cred_cd, "MAC_BP_IS_SRCH_TYP.CRED"},	// ar_cred_cd
				{$check_bcst_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AR;true"}	// check_bcst_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$bp_cd, "bp_is_srch_typ"},	// bp_cd
				{$rcst_cd, "bp_is_srch_typ"},	// rcst_cd
				{$ar_cred_cd, "bp_is_srch_typ"},	// ar_cred_cd
				{$check_bcst_dpt_cd, "dpt_is_srch_typ;mode_today_flg"}	// check_bcst_dpt_cd
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
				{$bill_zip_cd, "ZIP"},	// bill_zip_cd
				{$bill_tel, "TEL"}	// bill_tel
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
	protected BpBcst_UpdChk01_DtlR_MC_A(ConstMetaList<? extends BpBcst_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BpBcst_UpdChk01_DtlR clone() {
		return (BpBcst_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BpBcst_UpdChk01_DtlR createInstance() {
		return (BpBcst_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BpBcst_UpdChk01_DtlR getValues(String... names) {
		return (BpBcst_UpdChk01_DtlR) super.getValues(names);
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
	 * Billing customer 請求先.<p>
	 *
	 */
	public boolean bcst_flg() {
		return getConstBoolean(offset + 1, $bcst_flg);
	}

	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public void bcst_flg(boolean value) {
		setConstBoolean(offset + 1, $bcst_flg, value);
	}


	/**
	 * Payer 入金先.<p>
	 *
	 */
	public boolean rcst_flg() {
		return getConstBoolean(offset + 2, $rcst_flg);
	}

	/**
	 * Payer 入金先.<p>
	 *
	 */
	public void rcst_flg(boolean value) {
		setConstBoolean(offset + 2, $rcst_flg, value);
	}


	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 3, $rcst_cd);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 3, $rcst_cd, value);
	}


	/**
	 * AR credit managed BP cd. 債権与信管理先ＣＤ.<p>
	 *
	 */
	public String ar_cred_cd() {
		return getConstString(offset + 4, $ar_cred_cd);
	}

	/**
	 * AR credit managed BP cd. 債権与信管理先ＣＤ.<p>
	 *
	 */
	public void ar_cred_cd(String value) {
		setConstString(offset + 4, $ar_cred_cd, value);
	}


	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public String bill_dpt_typ() {
		return getConstString(offset + 5, $bill_dpt_typ);
	}

	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public void bill_dpt_typ(String value) {
		setConstString(offset + 5, $bill_dpt_typ, value);
	}


	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public String bcst_dpt_cd() {
		return getConstString(offset + 6, $bcst_dpt_cd);
	}

	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public void bcst_dpt_cd(String value) {
		setConstString(offset + 6, $bcst_dpt_cd, value);
	}


	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public String check_bcst_dpt_cd() {
		return getConstString(offset + 7, $check_bcst_dpt_cd);
	}

	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public void check_bcst_dpt_cd(String value) {
		setConstString(offset + 7, $check_bcst_dpt_cd, value);
	}


	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public String bill_cl_typ() {
		return getConstString(offset + 8, $bill_cl_typ);
	}

	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public void bill_cl_typ(String value) {
		setConstString(offset + 8, $bill_cl_typ, value);
	}


	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public MCNumber bill_cl_day1() {
		return getConstNumber(offset + 9, $bill_cl_day1);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(MCNumber value) {
		setConstNumber(offset + 9, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(int value) {
		setConstNumber(offset + 9, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(long value) {
		setConstNumber(offset + 9, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(float value) {
		setConstNumber(offset + 9, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(double value) {
		setConstNumber(offset + 9, $bill_cl_day1, value);
	}


	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public MCNumber bill_cl_day2() {
		return getConstNumber(offset + 10, $bill_cl_day2);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(MCNumber value) {
		setConstNumber(offset + 10, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(int value) {
		setConstNumber(offset + 10, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(long value) {
		setConstNumber(offset + 10, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(float value) {
		setConstNumber(offset + 10, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(double value) {
		setConstNumber(offset + 10, $bill_cl_day2, value);
	}


	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public MCNumber bill_cl_day3() {
		return getConstNumber(offset + 11, $bill_cl_day3);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(MCNumber value) {
		setConstNumber(offset + 11, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(int value) {
		setConstNumber(offset + 11, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(long value) {
		setConstNumber(offset + 11, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(float value) {
		setConstNumber(offset + 11, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(double value) {
		setConstNumber(offset + 11, $bill_cl_day3, value);
	}


	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public MCNumber bill_cl_day4() {
		return getConstNumber(offset + 12, $bill_cl_day4);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(MCNumber value) {
		setConstNumber(offset + 12, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(int value) {
		setConstNumber(offset + 12, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(long value) {
		setConstNumber(offset + 12, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(float value) {
		setConstNumber(offset + 12, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(double value) {
		setConstNumber(offset + 12, $bill_cl_day4, value);
	}


	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public MCNumber bill_cl_day5() {
		return getConstNumber(offset + 13, $bill_cl_day5);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(MCNumber value) {
		setConstNumber(offset + 13, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(int value) {
		setConstNumber(offset + 13, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(long value) {
		setConstNumber(offset + 13, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(float value) {
		setConstNumber(offset + 13, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(double value) {
		setConstNumber(offset + 13, $bill_cl_day5, value);
	}


	/**
	 * Billing tax calculation 請求税計算.<p>
	 *
	 */
	public boolean tax_on_bill_flg() {
		return getConstBoolean(offset + 14, $tax_on_bill_flg);
	}

	/**
	 * Billing tax calculation 請求税計算.<p>
	 *
	 */
	public void tax_on_bill_flg(boolean value) {
		setConstBoolean(offset + 14, $tax_on_bill_flg, value);
	}


	/**
	 * Billing tax rounding type 請求税額端数処理区分.<p>
	 *
	 */
	public String bill_tax_rnd_typ() {
		return getConstString(offset + 15, $bill_tax_rnd_typ);
	}

	/**
	 * Billing tax rounding type 請求税額端数処理区分.<p>
	 *
	 */
	public void bill_tax_rnd_typ(String value) {
		setConstString(offset + 15, $bill_tax_rnd_typ, value);
	}


	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public MCNumber bill_cl_delay_days() {
		return getConstNumber(offset + 16, $bill_cl_delay_days);
	}

	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 16, $bill_cl_delay_days, value);
	}

	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(int value) {
		setConstNumber(offset + 16, $bill_cl_delay_days, value);
	}

	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(long value) {
		setConstNumber(offset + 16, $bill_cl_delay_days, value);
	}

	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(float value) {
		setConstNumber(offset + 16, $bill_cl_delay_days, value);
	}

	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(double value) {
		setConstNumber(offset + 16, $bill_cl_delay_days, value);
	}


	/**
	 * Billing closing before/after type 請求締前後区分.<p>
	 *
	 */
	public String bill_cl_ba_typ() {
		return getConstString(offset + 17, $bill_cl_ba_typ);
	}

	/**
	 * Billing closing before/after type 請求締前後区分.<p>
	 *
	 */
	public void bill_cl_ba_typ(String value) {
		setConstString(offset + 17, $bill_cl_ba_typ, value);
	}


	/**
	 * Billing customer calendar cd. 請求先カレンダＣＤ.<p>
	 *
	 */
	public String bill_cal_cd() {
		return getConstString(offset + 18, $bill_cal_cd);
	}

	/**
	 * Billing customer calendar cd. 請求先カレンダＣＤ.<p>
	 *
	 */
	public void bill_cal_cd(String value) {
		setConstString(offset + 18, $bill_cal_cd, value);
	}


	/**
	 * Payment receipt schedule before/after type 入金予定前後区分.<p>
	 *
	 */
	public String rcv_ba_typ() {
		return getConstString(offset + 19, $rcv_ba_typ);
	}

	/**
	 * Payment receipt schedule before/after type 入金予定前後区分.<p>
	 *
	 */
	public void rcv_ba_typ(String value) {
		setConstString(offset + 19, $rcv_ba_typ, value);
	}


	/**
	 * Details auto-reconciliation 自動明細消込.<p>
	 *
	 */
	public boolean auto_line_appl_flg() {
		return getConstBoolean(offset + 20, $auto_line_appl_flg);
	}

	/**
	 * Details auto-reconciliation 自動明細消込.<p>
	 *
	 */
	public void auto_line_appl_flg(boolean value) {
		setConstBoolean(offset + 20, $auto_line_appl_flg, value);
	}


	/**
	 * Sales temporary unit price closing 売上仮単価締.<p>
	 *
	 */
	public boolean sls_interim_cl_flg() {
		return getConstBoolean(offset + 21, $sls_interim_cl_flg);
	}

	/**
	 * Sales temporary unit price closing 売上仮単価締.<p>
	 *
	 */
	public void sls_interim_cl_flg(boolean value) {
		setConstBoolean(offset + 21, $sls_interim_cl_flg, value);
	}


	/**
	 * AR offset group cd. 債権相殺グループＣＤ.<p>
	 *
	 */
	public String ar_setoff_grp_cd() {
		return getConstString(offset + 22, $ar_setoff_grp_cd);
	}

	/**
	 * AR offset group cd. 債権相殺グループＣＤ.<p>
	 *
	 */
	public void ar_setoff_grp_cd(String value) {
		setConstString(offset + 22, $ar_setoff_grp_cd, value);
	}


	/**
	 * Invoice send-to zip code 請求書送付郵便番号.<p>
	 *
	 */
	public String bill_zip_cd() {
		return getConstString(offset + 23, $bill_zip_cd);
	}

	/**
	 * Invoice send-to zip code 請求書送付郵便番号.<p>
	 *
	 */
	public void bill_zip_cd(String value) {
		setConstString(offset + 23, $bill_zip_cd, value);
	}


	/**
	 * Invoice send-to address 1 請求書送付住所１.<p>
	 *
	 */
	public String bill_addr1() {
		return getConstString(offset + 24, $bill_addr1);
	}

	/**
	 * Invoice send-to address 1 請求書送付住所１.<p>
	 *
	 */
	public void bill_addr1(String value) {
		setConstString(offset + 24, $bill_addr1, value);
	}


	/**
	 * Invoice send-to address 2 請求書送付住所２.<p>
	 *
	 */
	public String bill_addr2() {
		return getConstString(offset + 25, $bill_addr2);
	}

	/**
	 * Invoice send-to address 2 請求書送付住所２.<p>
	 *
	 */
	public void bill_addr2(String value) {
		setConstString(offset + 25, $bill_addr2, value);
	}


	/**
	 * Invoice send-to address 3 請求書送付住所３.<p>
	 *
	 */
	public String bill_addr3() {
		return getConstString(offset + 26, $bill_addr3);
	}

	/**
	 * Invoice send-to address 3 請求書送付住所３.<p>
	 *
	 */
	public void bill_addr3(String value) {
		setConstString(offset + 26, $bill_addr3, value);
	}


	/**
	 * Invoice send-to address 4 請求書送付住所４.<p>
	 *
	 */
	public String bill_addr4() {
		return getConstString(offset + 27, $bill_addr4);
	}

	/**
	 * Invoice send-to address 4 請求書送付住所４.<p>
	 *
	 */
	public void bill_addr4(String value) {
		setConstString(offset + 27, $bill_addr4, value);
	}


	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public String bill_tel() {
		return getConstString(offset + 28, $bill_tel);
	}

	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public void bill_tel(String value) {
		setConstString(offset + 28, $bill_tel, value);
	}


	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public String bill_bcst_nm() {
		return getConstString(offset + 29, $bill_bcst_nm);
	}

	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public void bill_bcst_nm(String value) {
		setConstString(offset + 29, $bill_bcst_nm, value);
	}


	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public String bill_bcst_dpt() {
		return getConstString(offset + 30, $bill_bcst_dpt);
	}

	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public void bill_bcst_dpt(String value) {
		setConstString(offset + 30, $bill_bcst_dpt, value);
	}


	/**
	 * Invoice send-to PIC 請求書送付担当者.<p>
	 *
	 */
	public String bill_bcst_psn() {
		return getConstString(offset + 31, $bill_bcst_psn);
	}

	/**
	 * Invoice send-to PIC 請求書送付担当者.<p>
	 *
	 */
	public void bill_bcst_psn(String value) {
		setConstString(offset + 31, $bill_bcst_psn, value);
	}


	/**
	 * Invoice send-to PIC honorific 請求書送付担当者敬称.<p>
	 *
	 */
	public String bill_bcst_psn_title() {
		return getConstString(offset + 32, $bill_bcst_psn_title);
	}

	/**
	 * Invoice send-to PIC honorific 請求書送付担当者敬称.<p>
	 *
	 */
	public void bill_bcst_psn_title(String value) {
		setConstString(offset + 32, $bill_bcst_psn_title, value);
	}


	/**
	 * Invoice issue type 請求書発行区分.<p>
	 *
	 */
	public String bill_prnt_typ() {
		return getConstString(offset + 33, $bill_prnt_typ);
	}

	/**
	 * Invoice issue type 請求書発行区分.<p>
	 *
	 */
	public void bill_prnt_typ(String value) {
		setConstString(offset + 33, $bill_prnt_typ, value);
	}


	/**
	 * Sales details output type 売上明細書出力区分.<p>
	 *
	 */
	public String sls_dtl_outp_typ() {
		return getConstString(offset + 34, $sls_dtl_outp_typ);
	}

	/**
	 * Sales details output type 売上明細書出力区分.<p>
	 *
	 */
	public void sls_dtl_outp_typ(String value) {
		setConstString(offset + 34, $sls_dtl_outp_typ, value);
	}


	/**
	 * Output invoice details 請求書明細出力.<p>
	 *
	 */
	public boolean bill_dtl_outp_flg() {
		return getConstBoolean(offset + 35, $bill_dtl_outp_flg);
	}

	/**
	 * Output invoice details 請求書明細出力.<p>
	 *
	 */
	public void bill_dtl_outp_flg(boolean value) {
		setConstBoolean(offset + 35, $bill_dtl_outp_flg, value);
	}


	/**
	 * Display balance of previous month on invoice 請求書前月残高表示.<p>
	 *
	 */
	public boolean bfw_bal_disp_flg() {
		return getConstBoolean(offset + 36, $bfw_bal_disp_flg);
	}

	/**
	 * Display balance of previous month on invoice 請求書前月残高表示.<p>
	 *
	 */
	public void bfw_bal_disp_flg(boolean value) {
		setConstBoolean(offset + 36, $bfw_bal_disp_flg, value);
	}


	/**
	 * Display advance received on invoice 請求書前受金表示.<p>
	 *
	 */
	public boolean bill_dtl_adv_flg() {
		return getConstBoolean(offset + 37, $bill_dtl_adv_flg);
	}

	/**
	 * Display advance received on invoice 請求書前受金表示.<p>
	 *
	 */
	public void bill_dtl_adv_flg(boolean value) {
		setConstBoolean(offset + 37, $bill_dtl_adv_flg, value);
	}


	/**
	 * Display payment receipt schedule in invoice 請求書入金予定表示.<p>
	 *
	 */
	public boolean bill_dtl_rcv_flg() {
		return getConstBoolean(offset + 38, $bill_dtl_rcv_flg);
	}

	/**
	 * Display payment receipt schedule in invoice 請求書入金予定表示.<p>
	 *
	 */
	public void bill_dtl_rcv_flg(boolean value) {
		setConstBoolean(offset + 38, $bill_dtl_rcv_flg, value);
	}


	/**
	 * Invoice details subtotal type 請求書明細小計区分.<p>
	 *
	 */
	public String bill_dtl_subttl_typ() {
		return getConstString(offset + 39, $bill_dtl_subttl_typ);
	}

	/**
	 * Invoice details subtotal type 請求書明細小計区分.<p>
	 *
	 */
	public void bill_dtl_subttl_typ(String value) {
		setConstString(offset + 39, $bill_dtl_subttl_typ, value);
	}


	/**
	 * Invoice details page break type 請求書明細改頁区分.<p>
	 *
	 */
	public String bill_dtl_brk_typ() {
		return getConstString(offset + 40, $bill_dtl_brk_typ);
	}

	/**
	 * Invoice details page break type 請求書明細改頁区分.<p>
	 *
	 */
	public void bill_dtl_brk_typ(String value) {
		setConstString(offset + 40, $bill_dtl_brk_typ, value);
	}


	/**
	 * Invoice details sorting order type 請求書明細並順区分.<p>
	 *
	 */
	public String bill_dtl_sort_typ() {
		return getConstString(offset + 41, $bill_dtl_sort_typ);
	}

	/**
	 * Invoice details sorting order type 請求書明細並順区分.<p>
	 *
	 */
	public void bill_dtl_sort_typ(String value) {
		setConstString(offset + 41, $bill_dtl_sort_typ, value);
	}


	/**
	 * Invoice cancel slip display type 請求書取消伝票表示区分.<p>
	 *
	 */
	public String bill_can_slip_typ() {
		return getConstString(offset + 42, $bill_can_slip_typ);
	}

	/**
	 * Invoice cancel slip display type 請求書取消伝票表示区分.<p>
	 *
	 */
	public void bill_can_slip_typ(String value) {
		setConstString(offset + 42, $bill_can_slip_typ, value);
	}


	/**
	 * For auto-reconciliation 入金自動消込対象.<p>
	 *
	 */
	public boolean rcv_auto_appl_tgt_flg() {
		return getConstBoolean(offset + 43, $rcv_auto_appl_tgt_flg);
	}

	/**
	 * For auto-reconciliation 入金自動消込対象.<p>
	 *
	 */
	public void rcv_auto_appl_tgt_flg(boolean value) {
		setConstBoolean(offset + 43, $rcv_auto_appl_tgt_flg, value);
	}


	/**
	 * Match amount 金額考慮.<p>
	 *
	 */
	public boolean rcv_amt_match_flg() {
		return getConstBoolean(offset + 44, $rcv_amt_match_flg);
	}

	/**
	 * Match amount 金額考慮.<p>
	 *
	 */
	public void rcv_amt_match_flg(boolean value) {
		setConstBoolean(offset + 44, $rcv_amt_match_flg, value);
	}


	/**
	 * Include payment option 金種考慮.<p>
	 *
	 */
	public boolean ar_sttl_typ_match_flg() {
		return getConstBoolean(offset + 45, $ar_sttl_typ_match_flg);
	}

	/**
	 * Include payment option 金種考慮.<p>
	 *
	 */
	public void ar_sttl_typ_match_flg(boolean value) {
		setConstBoolean(offset + 45, $ar_sttl_typ_match_flg, value);
	}


	/**
	 * Fee calculation 手数料計算.<p>
	 *
	 */
	public boolean calc_com_paid_flg() {
		return getConstBoolean(offset + 46, $calc_com_paid_flg);
	}

	/**
	 * Fee calculation 手数料計算.<p>
	 *
	 */
	public void calc_com_paid_flg(boolean value) {
		setConstBoolean(offset + 46, $calc_com_paid_flg, value);
	}


	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public MCNumber auto_appl_delay_days() {
		return getConstNumber(offset + 47, $auto_appl_delay_days);
	}

	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(MCNumber value) {
		setConstNumber(offset + 47, $auto_appl_delay_days, value);
	}

	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(int value) {
		setConstNumber(offset + 47, $auto_appl_delay_days, value);
	}

	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(long value) {
		setConstNumber(offset + 47, $auto_appl_delay_days, value);
	}

	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(float value) {
		setConstNumber(offset + 47, $auto_appl_delay_days, value);
	}

	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(double value) {
		setConstNumber(offset + 47, $auto_appl_delay_days, value);
	}


	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public String xfr_psn() {
		return getConstString(offset + 48, $xfr_psn);
	}

	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public void xfr_psn(String value) {
		setConstString(offset + 48, $xfr_psn, value);
	}


	/**
	 * Report issue type (Billing customer) 帳票発行区分（請求先）.<p>
	 *
	 */
	public String bcst_prnt_typ() {
		return getConstString(offset + 49, $bcst_prnt_typ);
	}

	/**
	 * Report issue type (Billing customer) 帳票発行区分（請求先）.<p>
	 *
	 */
	public void bcst_prnt_typ(String value) {
		setConstString(offset + 49, $bcst_prnt_typ, value);
	}


	/**
	 * Report issue type (Payer) 帳票発行区分（入金先）.<p>
	 *
	 */
	public String rcst_prnt_typ() {
		return getConstString(offset + 50, $rcst_prnt_typ);
	}

	/**
	 * Report issue type (Payer) 帳票発行区分（入金先）.<p>
	 *
	 */
	public void rcst_prnt_typ(String value) {
		setConstString(offset + 50, $rcst_prnt_typ, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 51, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			return ar_cred_cd();
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			return bill_dpt_typ();
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			return bcst_dpt_cd();
		}
		if ($check_bcst_dpt_cd.equalsIgnoreCase(name)) {
			return check_bcst_dpt_cd();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			return bill_tax_rnd_typ();
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			return bill_cl_ba_typ();
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			return bill_cal_cd();
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			return rcv_ba_typ();
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ar_setoff_grp_cd();
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			return bill_zip_cd();
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			return bill_addr1();
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			return bill_addr2();
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			return bill_addr3();
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			return bill_addr4();
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			return bill_tel();
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			return bill_bcst_nm();
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			return bill_bcst_dpt();
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			return bill_bcst_psn();
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			return bill_bcst_psn_title();
		}
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			return bill_prnt_typ();
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			return sls_dtl_outp_typ();
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			return bill_dtl_subttl_typ();
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			return bill_dtl_brk_typ();
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			return bill_dtl_sort_typ();
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			return bill_can_slip_typ();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			return bcst_prnt_typ();
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			return rcst_prnt_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			return bill_cl_day1();
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			return bill_cl_day2();
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			return bill_cl_day3();
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			return bill_cl_day4();
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			return bill_cl_day5();
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			return bill_cl_delay_days();
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			return auto_appl_delay_days();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($bcst_flg.equalsIgnoreCase(name)) {
			return bcst_flg();
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			return rcst_flg();
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			return tax_on_bill_flg();
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			return auto_line_appl_flg();
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			return sls_interim_cl_flg();
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			return bill_dtl_outp_flg();
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return bfw_bal_disp_flg();
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_adv_flg();
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_rcv_flg();
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_tgt_flg();
		}
		if ($rcv_amt_match_flg.equalsIgnoreCase(name)) {
			return rcv_amt_match_flg();
		}
		if ($ar_sttl_typ_match_flg.equalsIgnoreCase(name)) {
			return ar_sttl_typ_match_flg();
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			return calc_com_paid_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			return ar_cred_cd();
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			return bill_dpt_typ();
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			return bcst_dpt_cd();
		}
		if ($check_bcst_dpt_cd.equalsIgnoreCase(name)) {
			return check_bcst_dpt_cd();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			return bill_tax_rnd_typ();
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			return bill_cl_ba_typ();
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			return bill_cal_cd();
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			return rcv_ba_typ();
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ar_setoff_grp_cd();
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			return bill_zip_cd();
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			return bill_addr1();
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			return bill_addr2();
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			return bill_addr3();
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			return bill_addr4();
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			return bill_tel();
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			return bill_bcst_nm();
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			return bill_bcst_dpt();
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			return bill_bcst_psn();
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			return bill_bcst_psn_title();
		}
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			return bill_prnt_typ();
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			return sls_dtl_outp_typ();
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			return bill_dtl_subttl_typ();
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			return bill_dtl_brk_typ();
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			return bill_dtl_sort_typ();
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			return bill_can_slip_typ();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			return bcst_prnt_typ();
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			return rcst_prnt_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			return bill_cl_day1();
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			return bill_cl_day2();
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			return bill_cl_day3();
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			return bill_cl_day4();
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			return bill_cl_day5();
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			return bill_cl_delay_days();
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			return auto_appl_delay_days();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($bcst_flg.equalsIgnoreCase(name)) {
			return bcst_flg();
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			return rcst_flg();
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			return tax_on_bill_flg();
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			return auto_line_appl_flg();
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			return sls_interim_cl_flg();
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			return bill_dtl_outp_flg();
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return bfw_bal_disp_flg();
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_adv_flg();
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_rcv_flg();
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_tgt_flg();
		}
		if ($rcv_amt_match_flg.equalsIgnoreCase(name)) {
			return rcv_amt_match_flg();
		}
		if ($ar_sttl_typ_match_flg.equalsIgnoreCase(name)) {
			return ar_sttl_typ_match_flg();
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			return calc_com_paid_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			ar_cred_cd(value);
			return;
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			bill_dpt_typ(value);
			return;
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			bcst_dpt_cd(value);
			return;
		}
		if ($check_bcst_dpt_cd.equalsIgnoreCase(name)) {
			check_bcst_dpt_cd(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			bill_tax_rnd_typ(value);
			return;
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			bill_cl_ba_typ(value);
			return;
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			bill_cal_cd(value);
			return;
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			rcv_ba_typ(value);
			return;
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			ar_setoff_grp_cd(value);
			return;
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			bill_zip_cd(value);
			return;
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			bill_addr1(value);
			return;
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			bill_addr2(value);
			return;
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			bill_addr3(value);
			return;
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			bill_addr4(value);
			return;
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			bill_tel(value);
			return;
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			bill_bcst_nm(value);
			return;
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			bill_bcst_dpt(value);
			return;
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			bill_bcst_psn(value);
			return;
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			bill_bcst_psn_title(value);
			return;
		}
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			bill_prnt_typ(value);
			return;
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			sls_dtl_outp_typ(value);
			return;
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			bill_dtl_subttl_typ(value);
			return;
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			bill_dtl_brk_typ(value);
			return;
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			bill_dtl_sort_typ(value);
			return;
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			bill_can_slip_typ(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			bcst_prnt_typ(value);
			return;
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			rcst_prnt_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($bcst_flg.equalsIgnoreCase(name)) {
			bcst_flg(value);
			return;
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			rcst_flg(value);
			return;
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			tax_on_bill_flg(value);
			return;
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			auto_line_appl_flg(value);
			return;
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			sls_interim_cl_flg(value);
			return;
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			bill_dtl_outp_flg(value);
			return;
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			bfw_bal_disp_flg(value);
			return;
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			bill_dtl_adv_flg(value);
			return;
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			bill_dtl_rcv_flg(value);
			return;
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_tgt_flg(value);
			return;
		}
		if ($rcv_amt_match_flg.equalsIgnoreCase(name)) {
			rcv_amt_match_flg(value);
			return;
		}
		if ($ar_sttl_typ_match_flg.equalsIgnoreCase(name)) {
			ar_sttl_typ_match_flg(value);
			return;
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			calc_com_paid_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			ar_cred_cd(value);
			return;
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			bill_dpt_typ(value);
			return;
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			bcst_dpt_cd(value);
			return;
		}
		if ($check_bcst_dpt_cd.equalsIgnoreCase(name)) {
			check_bcst_dpt_cd(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			bill_tax_rnd_typ(value);
			return;
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			bill_cl_ba_typ(value);
			return;
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			bill_cal_cd(value);
			return;
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			rcv_ba_typ(value);
			return;
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			ar_setoff_grp_cd(value);
			return;
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			bill_zip_cd(value);
			return;
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			bill_addr1(value);
			return;
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			bill_addr2(value);
			return;
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			bill_addr3(value);
			return;
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			bill_addr4(value);
			return;
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			bill_tel(value);
			return;
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			bill_bcst_nm(value);
			return;
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			bill_bcst_dpt(value);
			return;
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			bill_bcst_psn(value);
			return;
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			bill_bcst_psn_title(value);
			return;
		}
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			bill_prnt_typ(value);
			return;
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			sls_dtl_outp_typ(value);
			return;
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			bill_dtl_subttl_typ(value);
			return;
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			bill_dtl_brk_typ(value);
			return;
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			bill_dtl_sort_typ(value);
			return;
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			bill_can_slip_typ(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			bcst_prnt_typ(value);
			return;
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			rcst_prnt_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($bcst_flg.equalsIgnoreCase(name)) {
			bcst_flg(value);
			return;
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			rcst_flg(value);
			return;
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			tax_on_bill_flg(value);
			return;
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			auto_line_appl_flg(value);
			return;
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			sls_interim_cl_flg(value);
			return;
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			bill_dtl_outp_flg(value);
			return;
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			bfw_bal_disp_flg(value);
			return;
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			bill_dtl_adv_flg(value);
			return;
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			bill_dtl_rcv_flg(value);
			return;
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_tgt_flg(value);
			return;
		}
		if ($rcv_amt_match_flg.equalsIgnoreCase(name)) {
			rcv_amt_match_flg(value);
			return;
		}
		if ($ar_sttl_typ_match_flg.equalsIgnoreCase(name)) {
			ar_sttl_typ_match_flg(value);
			return;
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			calc_com_paid_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

