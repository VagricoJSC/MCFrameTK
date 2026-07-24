package mcframe.serverMABC.MABCL0520;

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
 * ブロック"BpLst_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BpLst_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_BP_R {

	/**
	 * Own company use 自社使用.<p>
	 *
	 */
	public static final String $com_use_flg = "com_use_flg";
	/**
	 * Not own company use 自社不使用.<p>
	 *
	 */
	public static final String $com_ex_flg = "com_ex_flg";
	/**
	 * Exclude 除外.<p>
	 *
	 */
	public static final String $ex_flg = "ex_flg";
	/**
	 * Update counter (Common) 更新カウンタ（共通）.<p>
	 *
	 */
	public static final String $upd_cntr_c = "upd_cntr_c";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $check_ar_dpt_cd = "check_ar_dpt_cd";
	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $check_bcst_dpt_cd = "check_bcst_dpt_cd";
	/**
	 * VMI purchasing dept. cd. ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public static final String $check_vmi_purc_dpt_cd = "check_vmi_purc_dpt_cd";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $check_ap_dpt_cd = "check_ap_dpt_cd";
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $check_bsppl_dpt_cd = "check_bsppl_dpt_cd";
	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public static final String $check_pay_dpt_cd = "check_pay_dpt_cd";
	/**
	 * Update counter (BP company master) 更新カウンタ（取引先会社マスタ）.<p>
	 *
	 */
	public static final String $bp_com_upd_cntr = "bp_com_upd_cntr";
	/**
	 * Company-wide update 全社更新.<p>
	 *
	 */
	public static final String $all_upd_flg = "all_upd_flg";


	public static final MCMeta com_use_flg_META = createCommonMeta($com_use_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta com_ex_flg_META = createCommonMeta($com_ex_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ex_flg_META = createCommonMeta($ex_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upd_cntr_c_META = createCommonMeta($upd_cntr_c, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta check_ar_dpt_cd_META = createCommonMeta($check_ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta check_bcst_dpt_cd_META = createCommonMeta($check_bcst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta check_vmi_purc_dpt_cd_META = createCommonMeta($check_vmi_purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta check_ap_dpt_cd_META = createCommonMeta($check_ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta check_bsppl_dpt_cd_META = createCommonMeta($check_bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta check_pay_dpt_cd_META = createCommonMeta($check_pay_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bp_com_upd_cntr_META = createCommonMeta($bp_com_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta all_upd_flg_META = createCommonMeta($all_upd_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<BpLst_UpdChk01_DtlR> constMetas = new ConstMetaList<BpLst_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_BP_R.constMetas,
		new MCMeta[]{
			com_use_flg_META,
			com_ex_flg_META,
			ex_flg_META,
			upd_cntr_c_META,
			check_ar_dpt_cd_META,
			check_bcst_dpt_cd_META,
			check_vmi_purc_dpt_cd_META,
			check_ap_dpt_cd_META,
			check_bsppl_dpt_cd_META,
			check_pay_dpt_cd_META,
			bp_com_upd_cntr_META,
			all_upd_flg_META,
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
				{$bp_cd, "E"},	// bp_cd
				{$bp_nm, "E"},	// bp_nm
				{$cntry_cd, "E"},	// cntry_cd
				{$cur_cd, "E"}	// cur_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$ar_dpt_typ, "MAC_AR_DPT_TYP"},	// ar_dpt_typ
				{$sls_upri_req_typ, "MAC_SLS_UPRI_REQ_TYP"},	// sls_upri_req_typ
				{$sls_upri_rnd_typ, "MAC_RND_TYP"},	// sls_upri_rnd_typ
				{$sls_amt_rnd_typ, "MAC_RND_TYP"},	// sls_amt_rnd_typ
				{$sls_tax_calc_typ, "MAC_TAX_CALC_TYP"},	// sls_tax_calc_typ
				{$sls_tax_rnd_typ, "MAC_RND_TYP"},	// sls_tax_rnd_typ
				{$sls_basis_typ, "MAC_SLS_BASIS_TYP"},	// sls_basis_typ
				{$ship_schd_split_typ, "MAC_SHIP_SCHD_SPLIT_TYP"},	// ship_schd_split_typ
				{$bill_basis_typ, "MAC_BILL_BASIS_TYP"},	// bill_basis_typ
				{$lot_back_stop_typ, "MAC_LOT_BACK_STOP_TYP"},	// lot_back_stop_typ
				{$slip_each_lot_typ, "MAC_SLIP_EACH_LOT_TYP"},	// slip_each_lot_typ
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
				{$via_dlv_typ, "MAC_VIA_DLV_TYP"},	// via_dlv_typ
				{$purc_upri_req_typ, "MAC_PURC_UPRI_REQ_TYP"},	// purc_upri_req_typ
				{$purc_amt_rnd_typ, "MAC_RND_TYP"},	// purc_amt_rnd_typ
				{$purc_tax_calc_typ, "MAC_TAX_CALC_TYP"},	// purc_tax_calc_typ
				{$purc_tax_rnd_typ, "MAC_RND_TYP"},	// purc_tax_rnd_typ
				{$prov_rcv_typ, "MAC_PROV_RCV_TYP"},	// prov_rcv_typ
				{$purc_slip_each_lot_typ, "MAC_SLIP_EACH_LOT_TYP"},	// purc_slip_each_lot_typ
				{$purc_basis_typ, "MAC_PURC_BASIS_TYP"},	// purc_basis_typ
				{$outsrc_upri_typ, "MAC_OUTSRC_UPRI_TYP"},	// outsrc_upri_typ
				{$prov_basis_typ, "MAC_PROV_BASIS_TYP"},	// prov_basis_typ
				{$prov_amt_rnd_typ, "MAC_RND_TYP"},	// prov_amt_rnd_typ
				{$prov_tax_calc_typ, "MAC_TAX_CALC_TYP"},	// prov_tax_calc_typ
				{$prov_tax_rnd_typ, "MAC_RND_TYP"},	// prov_tax_rnd_typ
				{$pay_tax_rnd_typ, "MAC_RND_TYP"},	// pay_tax_rnd_typ
				{$pay_schd_ba_typ, "MAC_BA_TYP"},	// pay_schd_ba_typ
				{$pay_schd_cl_ba_typ, "MAC_BA_TYP"},	// pay_schd_cl_ba_typ
				{$pay_ntc_dtl_subttl_typ, "MAC_PAY_NTC_DTL_SUBTTL_TYP"},	// pay_ntc_dtl_subttl_typ
				{$pay_ntc_dtl_brk_typ, "MAC_PAY_NTC_DTL_BRK_TYP"},	// pay_ntc_dtl_brk_typ
				{$pay_ntc_dtl_sort_typ, "MAC_PAY_NTC_DTL_SORT_TYP"},	// pay_ntc_dtl_sort_typ
				{$pay_ntc_can_slip_typ, "MAC_PAY_NTC_CAN_SLIP_TYP"},	// pay_ntc_can_slip_typ
				{$cst_prnt_typ, "MAC_PRNT_TYP"},	// cst_prnt_typ
				{$acst_prnt_typ, "MAC_PRNT_TYP"},	// acst_prnt_typ
				{$bcst_prnt_typ, "MAC_PRNT_TYP"},	// bcst_prnt_typ
				{$rcst_prnt_typ, "MAC_PRNT_TYP"},	// rcst_prnt_typ
				{$dlv_prnt_typ, "MAC_PRNT_TYP"},	// dlv_prnt_typ
				{$sppl_prnt_typ, "MAC_PRNT_TYP"},	// sppl_prnt_typ
				{$asppl_prnt_typ, "MAC_PRNT_TYP"},	// asppl_prnt_typ
				{$bsppl_prnt_typ, "MAC_PRNT_TYP"},	// bsppl_prnt_typ
				{$psppl_prnt_typ, "MAC_PRNT_TYP"}	// psppl_prnt_typ
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$cntry_cd, "MA.MAUAL0010.Cntry"},	// cntry_cd
				{$area_cd, "MA.MAUAL0010.Area"},	// area_cd
				{$cur_cd, "MA.MAUAL0010.Cur"},	// cur_cd
				{$bp_grp_cd1, "MA.MAUAL0010.BpGrp1"},	// bp_grp_cd1
				{$bp_grp_cd2, "MA.MAUAL0010.BpGrp2"},	// bp_grp_cd2
				{$bp_grp_cd3, "MA.MAUAL0010.BpGrp3"},	// bp_grp_cd3
				{$bp_grp_cd4, "MA.MAUAL0010.BpGrp4"},	// bp_grp_cd4
				{$bp_grp_cd5, "MA.MAUAL0010.BpGrp5"},	// bp_grp_cd5
				{$bp_grp_cd6, "MA.MAUAL0010.BpGrp6"},	// bp_grp_cd6
				{$bp_grp_cd7, "MA.MAUAL0010.BpGrp7"},	// bp_grp_cd7
				{$bp_grp_cd8, "MA.MAUAL0010.BpGrp8"},	// bp_grp_cd8
				{$bp_grp_cd9, "MA.MAUAL0010.BpGrp9"},	// bp_grp_cd9
				{$bp_grp_cd10, "MA.MAUAL0010.BpGrp10"},	// bp_grp_cd10
				{$acst_cd, "MA.MAUAL0010.Bp"},	// acst_cd
				{$check_ar_dpt_cd, "MA.MAUAL0010.Dpt"},	// check_ar_dpt_cd
				{$cst_ship_form_cd, "MA.MAUAL0010.SlipForm"},	// cst_ship_form_cd
				{$stk_lst_form_cd, "MA.MAUAL0010.SlipForm"},	// stk_lst_form_cd
				{$sls_tax_cd, "MA.MAUAL0010.SlsTax"},	// sls_tax_cd
				{$cst_tterm_cd1, "MA.MAUAL0010.Tterm1"},	// cst_tterm_cd1
				{$cst_tterm_cd2, "MA.MAUAL0010.Tterm2"},	// cst_tterm_cd2
				{$cst_tterm_cd3, "MA.MAUAL0010.Tterm3"},	// cst_tterm_cd3
				{$sls_anly_cd1, "MA.MAUAL0010.SlsAnly1"},	// sls_anly_cd1
				{$sls_anly_cd2, "MA.MAUAL0010.SlsAnly2"},	// sls_anly_cd2
				{$sls_anly_cd3, "MA.MAUAL0010.SlsAnly3"},	// sls_anly_cd3
				{$bcst_cd, "MA.MAUAL0010.Bp"},	// bcst_cd
				{$rcst_cd, "MA.MAUAL0010.Bp"},	// rcst_cd
				{$ar_cred_cd, "MA.MAUAL0010.Bp"},	// ar_cred_cd
				{$check_bcst_dpt_cd, "MA.MAUAL0010.Dpt"},	// check_bcst_dpt_cd
				{$bill_cal_cd, "MA.MAUAL0010.CalBase"},	// bill_cal_cd
				{$ar_setoff_grp_cd, "MA.MAUAL0010.SetoffGrp"},	// ar_setoff_grp_cd
				{$lg_grp_cd, "MA.MAUAL0010.LgGrpNotForLoc"},	// lg_grp_cd
				{$dlv_cal_cd, "MA.MAUAL0010.CalBase"},	// dlv_cal_cd
				{$asppl_cd, "MA.MAUAL0010.Bp"},	// asppl_cd
				{$check_vmi_purc_dpt_cd, "MA.MAUAL0010.Dpt"},	// check_vmi_purc_dpt_cd
				{$purc_tax_cd, "MA.MAUAL0010.PurcTax"},	// purc_tax_cd
				{$sppl_cal_cd, "MA.MAUAL0010.CalBase"},	// sppl_cal_cd
				{$po_print_cd, "MA.MAUAL0010.PoPrint"},	// po_print_cd
				{$sppl_ship_form_cd, "MA.MAUAL0010.SlipForm"},	// sppl_ship_form_cd
				{$sppl_tterm_cd1, "MA.MAUAL0010.Tterm1"},	// sppl_tterm_cd1
				{$sppl_tterm_cd2, "MA.MAUAL0010.Tterm2"},	// sppl_tterm_cd2
				{$sppl_tterm_cd3, "MA.MAUAL0010.Tterm3"},	// sppl_tterm_cd3
				{$prov_tax_cd, "MA.MAUAL0010.ProvTax"},	// prov_tax_cd
				{$bsppl_cd, "MA.MAUAL0010.Bp"},	// bsppl_cd
				{$check_ap_dpt_cd, "MA.MAUAL0010.Dpt"},	// check_ap_dpt_cd
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
				{$acst_cd, "MAC_BP_IS_SRCH_TYP.ACST;acst_flg;bp_cd"},	// acst_cd
				{$check_ar_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AR;true"},	// check_ar_dpt_cd
				{$bcst_cd, "MAC_BP_IS_SRCH_TYP.BCST;bcst_flg;bp_cd"},	// bcst_cd
				{$rcst_cd, "MAC_BP_IS_SRCH_TYP.RCST;rcst_flg;bp_cd"},	// rcst_cd
				{$ar_cred_cd, "MAC_BP_IS_SRCH_TYP.CRED;cred_flg;bp_cd"},	// ar_cred_cd
				{$check_bcst_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AR;true"},	// check_bcst_dpt_cd
				{$asppl_cd, "MAC_BP_IS_SRCH_TYP.ASPPL;asppl_flg;bp_cd"},	// asppl_cd
				{$check_vmi_purc_dpt_cd, "MAC_DPT_IS_SRCH_TYP.PURC;true"},	// check_vmi_purc_dpt_cd
				{$prov_tax_cd, "repurc_obli_flg"},	// prov_tax_cd
				{$bsppl_cd, "MAC_BP_IS_SRCH_TYP.BSPPL;bsppl_flg;bp_cd"},	// bsppl_cd
				{$check_ap_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP;true"},	// check_ap_dpt_cd
				{$psppl_cd, "MAC_BP_IS_SRCH_TYP.PSPPL;psppl_flg;bp_cd"},	// psppl_cd
				{$ap_cred_cd, "MAC_BP_IS_SRCH_TYP.CRED;cred_flg;bp_cd"},	// ap_cred_cd
				{$check_bsppl_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP;true"},	// check_bsppl_dpt_cd
				{$check_pay_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP;true"}	// check_pay_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$acst_cd, "bp_is_srch_typ;check_rem_flg;ref_bp_cd"},	// acst_cd
				{$check_ar_dpt_cd, "dpt_is_srch_typ;mode_today_flg"},	// check_ar_dpt_cd
				{$bcst_cd, "bp_is_srch_typ;check_rem_flg;ref_bp_cd"},	// bcst_cd
				{$rcst_cd, "bp_is_srch_typ;check_rem_flg;ref_bp_cd"},	// rcst_cd
				{$ar_cred_cd, "bp_is_srch_typ;check_rem_flg;ref_bp_cd"},	// ar_cred_cd
				{$check_bcst_dpt_cd, "dpt_is_srch_typ;mode_today_flg"},	// check_bcst_dpt_cd
				{$asppl_cd, "bp_is_srch_typ;check_rem_flg;ref_bp_cd"},	// asppl_cd
				{$check_vmi_purc_dpt_cd, "dpt_is_srch_typ;mode_today_flg"},	// check_vmi_purc_dpt_cd
				{$prov_tax_cd, "repurc_obli_flg"},	// prov_tax_cd
				{$bsppl_cd, "bp_is_srch_typ;check_rem_flg;ref_bp_cd"},	// bsppl_cd
				{$check_ap_dpt_cd, "dpt_is_srch_typ;mode_today_flg"},	// check_ap_dpt_cd
				{$psppl_cd, "bp_is_srch_typ;check_rem_flg;ref_bp_cd"},	// psppl_cd
				{$ap_cred_cd, "bp_is_srch_typ;check_rem_flg;ref_bp_cd"},	// ap_cred_cd
				{$check_bsppl_dpt_cd, "dpt_is_srch_typ;mode_today_flg"},	// check_bsppl_dpt_cd
				{$check_pay_dpt_cd, "dpt_is_srch_typ;mode_today_flg"}	// check_pay_dpt_cd
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
				{$zip_cd, "ZIP"},	// zip_cd
				{$tel, "TEL"},	// tel
				{$fax, "TEL"},	// fax
				{$bill_zip_cd, "ZIP"},	// bill_zip_cd
				{$bill_tel, "TEL"},	// bill_tel
				{$pay_ntc_zip_cd, "ZIP"},	// pay_ntc_zip_cd
				{$pay_ntc_tel, "TEL"}	// pay_ntc_tel
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$bill_crryovr_times, "0:99"},	// bill_crryovr_times
				{$ship_lt, "0:"},	// ship_lt
				{$pay_crryovr_times, "0:99"}	// pay_crryovr_times
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
				{$cst_flg, "E"},	// cst_flg
				{$acst_flg, "E"},	// acst_flg
				{$bcst_flg, "E"},	// bcst_flg
				{$rcst_flg, "E"},	// rcst_flg
				{$dlv_flg, "E"},	// dlv_flg
				{$dest_flg, "E"},	// dest_flg
				{$cred_flg, "E"},	// cred_flg
				{$sppl_flg, "E"},	// sppl_flg
				{$asppl_flg, "E"},	// asppl_flg
				{$bsppl_flg, "E"},	// bsppl_flg
				{$psppl_flg, "E"},	// psppl_flg
				{$maker_flg, "E"}	// maker_flg
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
	protected BpLst_UpdChk01_DtlR_MC_A(ConstMetaList<? extends BpLst_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BpLst_UpdChk01_DtlR clone() {
		return (BpLst_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BpLst_UpdChk01_DtlR createInstance() {
		return (BpLst_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BpLst_UpdChk01_DtlR getValues(String... names) {
		return (BpLst_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Own company use 自社使用.<p>
	 *
	 */
	public boolean com_use_flg() {
		return getConstBoolean(offset + 0, $com_use_flg);
	}

	/**
	 * Own company use 自社使用.<p>
	 *
	 */
	public void com_use_flg(boolean value) {
		setConstBoolean(offset + 0, $com_use_flg, value);
	}


	/**
	 * Not own company use 自社不使用.<p>
	 *
	 */
	public boolean com_ex_flg() {
		return getConstBoolean(offset + 1, $com_ex_flg);
	}

	/**
	 * Not own company use 自社不使用.<p>
	 *
	 */
	public void com_ex_flg(boolean value) {
		setConstBoolean(offset + 1, $com_ex_flg, value);
	}


	/**
	 * Exclude 除外.<p>
	 *
	 */
	public boolean ex_flg() {
		return getConstBoolean(offset + 2, $ex_flg);
	}

	/**
	 * Exclude 除外.<p>
	 *
	 */
	public void ex_flg(boolean value) {
		setConstBoolean(offset + 2, $ex_flg, value);
	}


	/**
	 * Update counter (Common) 更新カウンタ（共通）.<p>
	 *
	 */
	public MCNumber upd_cntr_c() {
		return getConstNumber(offset + 3, $upd_cntr_c);
	}

	/**
	 * Update counter (Common) 更新カウンタ（共通）.<p>
	 *
	 */
	public void upd_cntr_c(MCNumber value) {
		setConstNumber(offset + 3, $upd_cntr_c, value);
	}

	/**
	 * Update counter (Common) 更新カウンタ（共通）.<p>
	 *
	 */
	public void upd_cntr_c(int value) {
		setConstNumber(offset + 3, $upd_cntr_c, value);
	}

	/**
	 * Update counter (Common) 更新カウンタ（共通）.<p>
	 *
	 */
	public void upd_cntr_c(long value) {
		setConstNumber(offset + 3, $upd_cntr_c, value);
	}

	/**
	 * Update counter (Common) 更新カウンタ（共通）.<p>
	 *
	 */
	public void upd_cntr_c(float value) {
		setConstNumber(offset + 3, $upd_cntr_c, value);
	}

	/**
	 * Update counter (Common) 更新カウンタ（共通）.<p>
	 *
	 */
	public void upd_cntr_c(double value) {
		setConstNumber(offset + 3, $upd_cntr_c, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String check_ar_dpt_cd() {
		return getConstString(offset + 4, $check_ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void check_ar_dpt_cd(String value) {
		setConstString(offset + 4, $check_ar_dpt_cd, value);
	}


	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public String check_bcst_dpt_cd() {
		return getConstString(offset + 5, $check_bcst_dpt_cd);
	}

	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public void check_bcst_dpt_cd(String value) {
		setConstString(offset + 5, $check_bcst_dpt_cd, value);
	}


	/**
	 * VMI purchasing dept. cd. ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public String check_vmi_purc_dpt_cd() {
		return getConstString(offset + 6, $check_vmi_purc_dpt_cd);
	}

	/**
	 * VMI purchasing dept. cd. ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public void check_vmi_purc_dpt_cd(String value) {
		setConstString(offset + 6, $check_vmi_purc_dpt_cd, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String check_ap_dpt_cd() {
		return getConstString(offset + 7, $check_ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void check_ap_dpt_cd(String value) {
		setConstString(offset + 7, $check_ap_dpt_cd, value);
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
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public String check_pay_dpt_cd() {
		return getConstString(offset + 9, $check_pay_dpt_cd);
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public void check_pay_dpt_cd(String value) {
		setConstString(offset + 9, $check_pay_dpt_cd, value);
	}


	/**
	 * Update counter (BP company master) 更新カウンタ（取引先会社マスタ）.<p>
	 *
	 */
	public MCNumber bp_com_upd_cntr() {
		return getConstNumber(offset + 10, $bp_com_upd_cntr);
	}

	/**
	 * Update counter (BP company master) 更新カウンタ（取引先会社マスタ）.<p>
	 *
	 */
	public void bp_com_upd_cntr(MCNumber value) {
		setConstNumber(offset + 10, $bp_com_upd_cntr, value);
	}

	/**
	 * Update counter (BP company master) 更新カウンタ（取引先会社マスタ）.<p>
	 *
	 */
	public void bp_com_upd_cntr(int value) {
		setConstNumber(offset + 10, $bp_com_upd_cntr, value);
	}

	/**
	 * Update counter (BP company master) 更新カウンタ（取引先会社マスタ）.<p>
	 *
	 */
	public void bp_com_upd_cntr(long value) {
		setConstNumber(offset + 10, $bp_com_upd_cntr, value);
	}

	/**
	 * Update counter (BP company master) 更新カウンタ（取引先会社マスタ）.<p>
	 *
	 */
	public void bp_com_upd_cntr(float value) {
		setConstNumber(offset + 10, $bp_com_upd_cntr, value);
	}

	/**
	 * Update counter (BP company master) 更新カウンタ（取引先会社マスタ）.<p>
	 *
	 */
	public void bp_com_upd_cntr(double value) {
		setConstNumber(offset + 10, $bp_com_upd_cntr, value);
	}


	/**
	 * Company-wide update 全社更新.<p>
	 *
	 */
	public boolean all_upd_flg() {
		return getConstBoolean(offset + 11, $all_upd_flg);
	}

	/**
	 * Company-wide update 全社更新.<p>
	 *
	 */
	public void all_upd_flg(boolean value) {
		setConstBoolean(offset + 11, $all_upd_flg, value);
	}


	public String getString(String name) {
		if ($check_ar_dpt_cd.equalsIgnoreCase(name)) {
			return check_ar_dpt_cd();
		}
		if ($check_bcst_dpt_cd.equalsIgnoreCase(name)) {
			return check_bcst_dpt_cd();
		}
		if ($check_vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			return check_vmi_purc_dpt_cd();
		}
		if ($check_ap_dpt_cd.equalsIgnoreCase(name)) {
			return check_ap_dpt_cd();
		}
		if ($check_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return check_bsppl_dpt_cd();
		}
		if ($check_pay_dpt_cd.equalsIgnoreCase(name)) {
			return check_pay_dpt_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			return upd_cntr_c();
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			return bp_com_upd_cntr();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($com_use_flg.equalsIgnoreCase(name)) {
			return com_use_flg();
		}
		if ($com_ex_flg.equalsIgnoreCase(name)) {
			return com_ex_flg();
		}
		if ($ex_flg.equalsIgnoreCase(name)) {
			return ex_flg();
		}
		if ($all_upd_flg.equalsIgnoreCase(name)) {
			return all_upd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($check_ar_dpt_cd.equalsIgnoreCase(name)) {
			return check_ar_dpt_cd();
		}
		if ($check_bcst_dpt_cd.equalsIgnoreCase(name)) {
			return check_bcst_dpt_cd();
		}
		if ($check_vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			return check_vmi_purc_dpt_cd();
		}
		if ($check_ap_dpt_cd.equalsIgnoreCase(name)) {
			return check_ap_dpt_cd();
		}
		if ($check_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return check_bsppl_dpt_cd();
		}
		if ($check_pay_dpt_cd.equalsIgnoreCase(name)) {
			return check_pay_dpt_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			return upd_cntr_c();
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			return bp_com_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($com_use_flg.equalsIgnoreCase(name)) {
			return com_use_flg();
		}
		if ($com_ex_flg.equalsIgnoreCase(name)) {
			return com_ex_flg();
		}
		if ($ex_flg.equalsIgnoreCase(name)) {
			return ex_flg();
		}
		if ($all_upd_flg.equalsIgnoreCase(name)) {
			return all_upd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($check_ar_dpt_cd.equalsIgnoreCase(name)) {
			check_ar_dpt_cd(value);
			return;
		}
		if ($check_bcst_dpt_cd.equalsIgnoreCase(name)) {
			check_bcst_dpt_cd(value);
			return;
		}
		if ($check_vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			check_vmi_purc_dpt_cd(value);
			return;
		}
		if ($check_ap_dpt_cd.equalsIgnoreCase(name)) {
			check_ap_dpt_cd(value);
			return;
		}
		if ($check_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			check_bsppl_dpt_cd(value);
			return;
		}
		if ($check_pay_dpt_cd.equalsIgnoreCase(name)) {
			check_pay_dpt_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			bp_com_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			bp_com_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			bp_com_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			bp_com_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			bp_com_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($com_use_flg.equalsIgnoreCase(name)) {
			com_use_flg(value);
			return;
		}
		if ($com_ex_flg.equalsIgnoreCase(name)) {
			com_ex_flg(value);
			return;
		}
		if ($ex_flg.equalsIgnoreCase(name)) {
			ex_flg(value);
			return;
		}
		if ($all_upd_flg.equalsIgnoreCase(name)) {
			all_upd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($check_ar_dpt_cd.equalsIgnoreCase(name)) {
			check_ar_dpt_cd(value);
			return;
		}
		if ($check_bcst_dpt_cd.equalsIgnoreCase(name)) {
			check_bcst_dpt_cd(value);
			return;
		}
		if ($check_vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			check_vmi_purc_dpt_cd(value);
			return;
		}
		if ($check_ap_dpt_cd.equalsIgnoreCase(name)) {
			check_ap_dpt_cd(value);
			return;
		}
		if ($check_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			check_bsppl_dpt_cd(value);
			return;
		}
		if ($check_pay_dpt_cd.equalsIgnoreCase(name)) {
			check_pay_dpt_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			bp_com_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			bp_com_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			bp_com_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			bp_com_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($bp_com_upd_cntr.equalsIgnoreCase(name)) {
			bp_com_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($com_use_flg.equalsIgnoreCase(name)) {
			com_use_flg(value);
			return;
		}
		if ($com_ex_flg.equalsIgnoreCase(name)) {
			com_ex_flg(value);
			return;
		}
		if ($ex_flg.equalsIgnoreCase(name)) {
			ex_flg(value);
			return;
		}
		if ($all_upd_flg.equalsIgnoreCase(name)) {
			all_upd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

