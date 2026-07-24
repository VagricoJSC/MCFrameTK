package mcframe.serverMSBD.MSBDL0160;

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
 * ブロック"Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrR_MC_A extends mcframe.serverMSBD.MSBDL5170.HdrR {

	/**
	 * Direct delivery sales return flg. 仕入直送売上返品ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_ddlv_sls_ret_flg = "purc_ddlv_sls_ret_flg";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Purchase return result rev. No. (Latest) 仕入返品実績改訂番号(最新).<p>
	 *
	 */
	public static final String $purc_ret_act_rev_new = "purc_ret_act_rev_new";
	/**
	 * Latest 最新.<p>
	 *
	 */
	public static final String $newest_flg = "newest_flg";
	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public static final String $reg_dt = "reg_dt";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public static final String $purc_upri_cng_flg = "purc_upri_cng_flg";
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public static final String $pay_spot_flg = "pay_spot_flg";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	/**
	 * Master AP dept. cd. マスタ債務部門ＣＤ.<p>
	 *
	 */
	public static final String $mst_ap_dpt_cd = "mst_ap_dpt_cd";
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	/**
	 * Supplier country cd. 発注先国ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cntry_cd = "sppl_cntry_cd";
	/**
	 * Supplier country name 発注先国名.<p>
	 *
	 */
	public static final String $sppl_cntry_nm = "sppl_cntry_nm";
	/**
	 * Supplier I/V transaction 発注先Ｉ／Ｖ取引.<p>
	 *
	 */
	public static final String $sppl_iv_flg = "sppl_iv_flg";
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public static final String $asppl_nm = "asppl_nm";
	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public static final String $purc_tax_cd = "purc_tax_cd";
	/**
	 * Purchase tax priority 仕入税優先.<p>
	 *
	 */
	public static final String $purc_tax_cd_prio_flg = "purc_tax_cd_prio_flg";
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public static final String $repurc_obli_flg = "repurc_obli_flg";
	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public static final String $outsrc_upri_typ = "outsrc_upri_typ";
	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public static final String $purc_dpt_nm = "purc_dpt_nm";
	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public static final String $ap_dpt_flg = "ap_dpt_flg";
	/**
	 * WG name ＷＧ　名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public static final String $purc_usr_nm = "purc_usr_nm";
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_upri_dec_place = "trd_cur_upri_dec_place";
	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public static final String $base_cur_upri_dec_place = "base_cur_upri_dec_place";
	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public static final String $base_cur_amt_dec_place = "base_cur_amt_dec_place";
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public static final String $ptax_cur_nm = "ptax_cur_nm";
	/**
	 * Unit price number of decimal places (Tax currency) 単価小数部有効桁数（納税通貨）.<p>
	 *
	 */
	public static final String $ptax_cur_upri_dec_place = "ptax_cur_upri_dec_place";
	/**
	 * Amount number of decimal places (Tax currency) 金額小数部有効桁数（納税通貨）.<p>
	 *
	 */
	public static final String $ptax_cur_amt_dec_place = "ptax_cur_amt_dec_place";
	/**
	 * Exchange rate rounding type 為替レート端数処理区分.<p>
	 *
	 */
	public static final String $xrate_rnd_typ = "xrate_rnd_typ";
	/**
	 * Withholding tax rounding type 源泉徴収税端数処理区分.<p>
	 *
	 */
	public static final String $wtax_rnd_typ = "wtax_rnd_typ";
	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public static final String $tterm_nm1 = "tterm_nm1";
	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public static final String $tterm_nm2 = "tterm_nm2";
	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public static final String $tterm_nm3 = "tterm_nm3";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update counter (Purchase return schedule) 更新カウンタ（仕入返品予定）.<p>
	 *
	 */
	public static final String $pr_schd_upd_cntr = "pr_schd_upd_cntr";
	/**
	 * Update counter (Purchase Return Results) 更新カウンタ（仕入返品実績）.<p>
	 *
	 */
	public static final String $pr_act_upd_cntr = "pr_act_upd_cntr";
	/**
	 * Update counter (Purchase result) 更新カウンタ（仕入実績）.<p>
	 *
	 */
	public static final String $p_act_upd_cntr = "p_act_upd_cntr";


	public static final MCMeta purc_ddlv_sls_ret_flg_META = createCommonMeta($purc_ddlv_sls_ret_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta purc_ret_act_rev_new_META = createCommonMeta($purc_ret_act_rev_new, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta newest_flg_META = createCommonMeta($newest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta reg_dt_META = createCommonMeta($reg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta purc_upri_cng_flg_META = createCommonMeta($purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_spot_flg_META = createCommonMeta($pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta mst_ap_dpt_cd_META = createCommonMeta($mst_ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta sppl_cntry_cd_META = createCommonMeta($sppl_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta sppl_cntry_nm_META = createCommonMeta($sppl_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta sppl_iv_flg_META = createCommonMeta($sppl_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_nm_META = createCommonMeta($asppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta purc_tax_cd_META = createCommonMeta($purc_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta purc_tax_cd_prio_flg_META = createCommonMeta($purc_tax_cd_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_upri_typ_META = createCommonMeta($outsrc_upri_typ, mcframe.commonMA.meta.MA_META.OUTSRC_UPRI_TYP);
	public static final MCMeta purc_dpt_nm_META = createCommonMeta($purc_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ap_dpt_flg_META = createCommonMeta($ap_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta purc_usr_nm_META = createCommonMeta($purc_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_upri_dec_place_META = createCommonMeta($trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_upri_dec_place_META = createCommonMeta($base_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_amt_dec_place_META = createCommonMeta($base_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_cur_nm_META = createCommonMeta($ptax_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta ptax_cur_upri_dec_place_META = createCommonMeta($ptax_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_cur_amt_dec_place_META = createCommonMeta($ptax_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta xrate_rnd_typ_META = createCommonMeta($xrate_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta wtax_rnd_typ_META = createCommonMeta($wtax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta tterm_nm1_META = createCommonMeta($tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_nm2_META = createCommonMeta($tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_nm3_META = createCommonMeta($tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta pr_schd_upd_cntr_META = createCommonMeta($pr_schd_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta pr_act_upd_cntr_META = createCommonMeta($pr_act_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta p_act_upd_cntr_META = createCommonMeta($p_act_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		mcframe.serverMSBD.MSBDL5170.HdrR.constMetas,
		new MCMeta[]{
			purc_ddlv_sls_ret_flg_META,
			trd_nm_META,
			purc_ret_act_rev_new_META,
			newest_flg_META,
			reg_dt_META,
			sppl_nm_META,
			purc_upri_cng_flg_META,
			pay_spot_flg_META,
			ap_dpt_cd_META,
			mst_ap_dpt_cd_META,
			prnt_lcl_cd_META,
			sppl_cntry_cd_META,
			sppl_cntry_nm_META,
			sppl_iv_flg_META,
			asppl_nm_META,
			purc_tax_cd_META,
			purc_tax_cd_prio_flg_META,
			subcon_flg_META,
			repurc_obli_flg_META,
			outsrc_upri_typ_META,
			purc_dpt_nm_META,
			ap_dpt_flg_META,
			wg_nm_META,
			purc_usr_nm_META,
			trd_cur_nm_META,
			trd_cur_upri_dec_place_META,
			trd_cur_amt_dec_place_META,
			base_cur_nm_META,
			base_cur_upri_dec_place_META,
			base_cur_amt_dec_place_META,
			ptax_cur_nm_META,
			ptax_cur_upri_dec_place_META,
			ptax_cur_amt_dec_place_META,
			xrate_rnd_typ_META,
			wtax_rnd_typ_META,
			tterm_nm1_META,
			tterm_nm2_META,
			tterm_nm3_META,
			ins_func_nm_META,
			upd_func_nm_META,
			pr_schd_upd_cntr_META,
			pr_act_upd_cntr_META,
			p_act_upd_cntr_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		mcframe.serverMSBD.MSBDL5170.HdrR.EXTMAP,
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$trd_cd, "E"},	// trd_cd
				{$purc_ret_dt, "E"},	// purc_ret_dt
				{$ac_dt, "E"},	// ac_dt
				{$sppl_cd, "E"},	// sppl_cd
				{$purc_dpt_cd, "E"},	// purc_dpt_cd
				{$trd_cur_cd, "E"},	// trd_cur_cd
				{$ret_sppl_nm, "E"}	// ret_sppl_nm
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$trd_cd, "MA.MAUAL0010.Trd"},	// trd_cd
				{$sppl_cd, "MA.MAUAL0010.Bp"},	// sppl_cd
				{$purc_dpt_cd, "MA.MAUAL0010.Dpt"},	// purc_dpt_cd
				{$purc_usr_cd, "MA.MAUAL0010.Usr"},	// purc_usr_cd
				{$trd_cur_cd, "MA.MAUAL0010.Cur"},	// trd_cur_cd
				{$tterm_cd1, "MA.MAUAL0010.Tterm"},	// tterm_cd1
				{$tterm_cd2, "MA.MAUAL0010.Tterm"},	// tterm_cd2
				{$tterm_cd3, "MA.MAUAL0010.Tterm"}	// tterm_cd3
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$trd_cd, "trd_ptn_typ"},	// trd_cd
				{$sppl_cd, "sppl_nm;purc_upri_cng_flg;sppl_cntry_cd;sppl_cntry_nm;sppl_zip_cd;sppl_addr1;sppl_addr2;sppl_addr3;sppl_addr4;sppl_cntct_dpt;sppl_cntct_psn;sppl_tel;sppl_fax;sppl_iv_flg;prnt_lcl_cd;subcon_flg;asppl_cd;purc_amt_rnd_typ;purc_tax_rnd_typ;purc_tax_cd;purc_tax_cd_prio_flg;sppl_pay_crryovr_times;ap_dpt_cd;pay_spot_flg;repurc_obli_flg;outsrc_upri_typ;purc_tax_calc_typ"},	// sppl_cd
				{$purc_dpt_cd, "wg_cd;purc_dpt_nm"},	// purc_dpt_cd
				{$trd_cur_cd, "trd_cur_upri_dec_place;trd_cur_amt_dec_place"},	// trd_cur_cd
				{$tterm_cd1, "tterm_nm"},	// tterm_cd1
				{$tterm_cd2, "tterm_nm"},	// tterm_cd2
				{$tterm_cd3, "tterm_nm"}	// tterm_cd3
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$sppl_cd, "bp_nm;purc_upri_cng_flg;cntry_cd;cntry_nm;zip_cd;addr1;addr2;addr3;addr4;sppl_cntct_dpt;sppl_cntct_psn;tel;fax;sppl_iv_flg;prnt_lcl_cd;subcon_flg;asppl_cd;purc_amt_rnd_typ;purc_tax_rnd_typ;purc_tax_cd;purc_tax_cd_prio_flg;pay_crryovr_times;ap_dpt_cd;pay_spot_flg;repurc_obli_flg;outsrc_upri_typ;purc_tax_calc_typ"},	// sppl_cd
				{$purc_dpt_cd, "wg_cd;dpt_nm"},	// purc_dpt_cd
				{$trd_cur_cd, "upri_dec_place;amt_dec_place"}	// trd_cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$sppl_cd, "purc_ret_dt;MAC_BP_IS_SRCH_TYP.SPPL_PURC"},	// sppl_cd
				{$purc_dpt_cd, "MAC_DPT_IS_SRCH_TYP.PURC;ac_dt;purc_usr_cd"},	// purc_dpt_cd
				{$tterm_cd1, "MAC_TTERM_TYP.TTERM1"},	// tterm_cd1
				{$tterm_cd2, "MAC_TTERM_TYP.TTERM2"},	// tterm_cd2
				{$tterm_cd3, "MAC_TTERM_TYP.TTERM3"}	// tterm_cd3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$sppl_cd, "dt;bp_is_srch_typ"},	// sppl_cd
				{$purc_dpt_cd, "dpt_is_srch_typ;dt;usr_cd"},	// purc_dpt_cd
				{$tterm_cd1, "tterm_typ"},	// tterm_cd1
				{$tterm_cd2, "tterm_typ"},	// tterm_cd2
				{$tterm_cd3, "tterm_typ"}	// tterm_cd3
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
				{$ac_dt, "bfToday"},	// ac_dt
				{$can_ac_dt, "bfToday"}	// can_ac_dt
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$purc_ret_dt, "ac_dt:BF"},	// purc_ret_dt
				{$ac_dt, "pay_basis_dt:BF,pay_schd_dt:BF"},	// ac_dt
				{$pay_basis_dt, "pay_basis_dt:AF"},	// pay_basis_dt
				{$pay_schd_dt, "pay_schd_dt:AF"}	// pay_schd_dt
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$xrate, "positive"},	// xrate
				{$ptax_xrate, "positive"}	// ptax_xrate
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
				{$sppl_zip_cd, "ZIP"},	// sppl_zip_cd
				{$sppl_tel, "TEL"},	// sppl_tel
				{$sppl_fax, "TEL"},	// sppl_fax
				{$ret_sppl_zip_cd, "ZIP"},	// ret_sppl_zip_cd
				{$ret_sppl_tel, "TEL"},	// ret_sppl_tel
				{$ret_sppl_fax, "TEL"}	// ret_sppl_fax
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
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

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Direct delivery sales return flg. 仕入直送売上返品ＦＬＧ.<p>
	 *
	 */
	public boolean purc_ddlv_sls_ret_flg() {
		return getConstBoolean(offset + 0, $purc_ddlv_sls_ret_flg);
	}

	/**
	 * Direct delivery sales return flg. 仕入直送売上返品ＦＬＧ.<p>
	 *
	 */
	public void purc_ddlv_sls_ret_flg(boolean value) {
		setConstBoolean(offset + 0, $purc_ddlv_sls_ret_flg, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 1, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 1, $trd_nm, value);
	}


	/**
	 * Purchase return result rev. No. (Latest) 仕入返品実績改訂番号(最新).<p>
	 *
	 */
	public MCNumber purc_ret_act_rev_new() {
		return getConstNumber(offset + 2, $purc_ret_act_rev_new);
	}

	/**
	 * Purchase return result rev. No. (Latest) 仕入返品実績改訂番号(最新).<p>
	 *
	 */
	public void purc_ret_act_rev_new(MCNumber value) {
		setConstNumber(offset + 2, $purc_ret_act_rev_new, value);
	}

	/**
	 * Purchase return result rev. No. (Latest) 仕入返品実績改訂番号(最新).<p>
	 *
	 */
	public void purc_ret_act_rev_new(int value) {
		setConstNumber(offset + 2, $purc_ret_act_rev_new, value);
	}

	/**
	 * Purchase return result rev. No. (Latest) 仕入返品実績改訂番号(最新).<p>
	 *
	 */
	public void purc_ret_act_rev_new(long value) {
		setConstNumber(offset + 2, $purc_ret_act_rev_new, value);
	}

	/**
	 * Purchase return result rev. No. (Latest) 仕入返品実績改訂番号(最新).<p>
	 *
	 */
	public void purc_ret_act_rev_new(float value) {
		setConstNumber(offset + 2, $purc_ret_act_rev_new, value);
	}

	/**
	 * Purchase return result rev. No. (Latest) 仕入返品実績改訂番号(最新).<p>
	 *
	 */
	public void purc_ret_act_rev_new(double value) {
		setConstNumber(offset + 2, $purc_ret_act_rev_new, value);
	}


	/**
	 * Latest 最新.<p>
	 *
	 */
	public boolean newest_flg() {
		return getConstBoolean(offset + 3, $newest_flg);
	}

	/**
	 * Latest 最新.<p>
	 *
	 */
	public void newest_flg(boolean value) {
		setConstBoolean(offset + 3, $newest_flg, value);
	}


	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCDate reg_dt() {
		return getConstDate(offset + 4, $reg_dt);
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public void reg_dt(MCDate value) {
		setConstDate(offset + 4, $reg_dt, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 5, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 5, $sppl_nm, value);
	}


	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public boolean purc_upri_cng_flg() {
		return getConstBoolean(offset + 6, $purc_upri_cng_flg);
	}

	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public void purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 6, $purc_upri_cng_flg, value);
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
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 8, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 8, $ap_dpt_cd, value);
	}


	/**
	 * Master AP dept. cd. マスタ債務部門ＣＤ.<p>
	 *
	 */
	public String mst_ap_dpt_cd() {
		return getConstString(offset + 9, $mst_ap_dpt_cd);
	}

	/**
	 * Master AP dept. cd. マスタ債務部門ＣＤ.<p>
	 *
	 */
	public void mst_ap_dpt_cd(String value) {
		setConstString(offset + 9, $mst_ap_dpt_cd, value);
	}


	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 10, $prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 10, $prnt_lcl_cd, value);
	}


	/**
	 * Supplier country cd. 発注先国ＣＤ.<p>
	 *
	 */
	public String sppl_cntry_cd() {
		return getConstString(offset + 11, $sppl_cntry_cd);
	}

	/**
	 * Supplier country cd. 発注先国ＣＤ.<p>
	 *
	 */
	public void sppl_cntry_cd(String value) {
		setConstString(offset + 11, $sppl_cntry_cd, value);
	}


	/**
	 * Supplier country name 発注先国名.<p>
	 *
	 */
	public String sppl_cntry_nm() {
		return getConstString(offset + 12, $sppl_cntry_nm);
	}

	/**
	 * Supplier country name 発注先国名.<p>
	 *
	 */
	public void sppl_cntry_nm(String value) {
		setConstString(offset + 12, $sppl_cntry_nm, value);
	}


	/**
	 * Supplier I/V transaction 発注先Ｉ／Ｖ取引.<p>
	 *
	 */
	public boolean sppl_iv_flg() {
		return getConstBoolean(offset + 13, $sppl_iv_flg);
	}

	/**
	 * Supplier I/V transaction 発注先Ｉ／Ｖ取引.<p>
	 *
	 */
	public void sppl_iv_flg(boolean value) {
		setConstBoolean(offset + 13, $sppl_iv_flg, value);
	}


	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public String asppl_nm() {
		return getConstString(offset + 14, $asppl_nm);
	}

	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public void asppl_nm(String value) {
		setConstString(offset + 14, $asppl_nm, value);
	}


	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public String purc_tax_cd() {
		return getConstString(offset + 15, $purc_tax_cd);
	}

	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public void purc_tax_cd(String value) {
		setConstString(offset + 15, $purc_tax_cd, value);
	}


	/**
	 * Purchase tax priority 仕入税優先.<p>
	 *
	 */
	public boolean purc_tax_cd_prio_flg() {
		return getConstBoolean(offset + 16, $purc_tax_cd_prio_flg);
	}

	/**
	 * Purchase tax priority 仕入税優先.<p>
	 *
	 */
	public void purc_tax_cd_prio_flg(boolean value) {
		setConstBoolean(offset + 16, $purc_tax_cd_prio_flg, value);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 17, $subcon_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 17, $subcon_flg, value);
	}


	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 18, $repurc_obli_flg);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 18, $repurc_obli_flg, value);
	}


	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public String outsrc_upri_typ() {
		return getConstString(offset + 19, $outsrc_upri_typ);
	}

	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public void outsrc_upri_typ(String value) {
		setConstString(offset + 19, $outsrc_upri_typ, value);
	}


	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public String purc_dpt_nm() {
		return getConstString(offset + 20, $purc_dpt_nm);
	}

	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public void purc_dpt_nm(String value) {
		setConstString(offset + 20, $purc_dpt_nm, value);
	}


	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public boolean ap_dpt_flg() {
		return getConstBoolean(offset + 21, $ap_dpt_flg);
	}

	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public void ap_dpt_flg(boolean value) {
		setConstBoolean(offset + 21, $ap_dpt_flg, value);
	}


	/**
	 * WG name ＷＧ　名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 22, $wg_nm);
	}

	/**
	 * WG name ＷＧ　名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 22, $wg_nm, value);
	}


	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public String purc_usr_nm() {
		return getConstString(offset + 23, $purc_usr_nm);
	}

	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public void purc_usr_nm(String value) {
		setConstString(offset + 23, $purc_usr_nm, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 24, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 24, $trd_cur_nm, value);
	}


	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_upri_dec_place() {
		return getConstNumber(offset + 25, $trd_cur_upri_dec_place);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 25, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 25, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 25, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 25, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 25, $trd_cur_upri_dec_place, value);
	}


	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 26, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 26, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 26, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 26, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 26, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 26, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 27, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 27, $base_cur_nm, value);
	}


	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public MCNumber base_cur_upri_dec_place() {
		return getConstNumber(offset + 28, $base_cur_upri_dec_place);
	}

	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void base_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 28, $base_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void base_cur_upri_dec_place(int value) {
		setConstNumber(offset + 28, $base_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void base_cur_upri_dec_place(long value) {
		setConstNumber(offset + 28, $base_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void base_cur_upri_dec_place(float value) {
		setConstNumber(offset + 28, $base_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void base_cur_upri_dec_place(double value) {
		setConstNumber(offset + 28, $base_cur_upri_dec_place, value);
	}


	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public MCNumber base_cur_amt_dec_place() {
		return getConstNumber(offset + 29, $base_cur_amt_dec_place);
	}

	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void base_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 29, $base_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void base_cur_amt_dec_place(int value) {
		setConstNumber(offset + 29, $base_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void base_cur_amt_dec_place(long value) {
		setConstNumber(offset + 29, $base_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void base_cur_amt_dec_place(float value) {
		setConstNumber(offset + 29, $base_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public void base_cur_amt_dec_place(double value) {
		setConstNumber(offset + 29, $base_cur_amt_dec_place, value);
	}


	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public String ptax_cur_nm() {
		return getConstString(offset + 30, $ptax_cur_nm);
	}

	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public void ptax_cur_nm(String value) {
		setConstString(offset + 30, $ptax_cur_nm, value);
	}


	/**
	 * Unit price number of decimal places (Tax currency) 単価小数部有効桁数（納税通貨）.<p>
	 *
	 */
	public MCNumber ptax_cur_upri_dec_place() {
		return getConstNumber(offset + 31, $ptax_cur_upri_dec_place);
	}

	/**
	 * Unit price number of decimal places (Tax currency) 単価小数部有効桁数（納税通貨）.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 31, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Tax currency) 単価小数部有効桁数（納税通貨）.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(int value) {
		setConstNumber(offset + 31, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Tax currency) 単価小数部有効桁数（納税通貨）.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(long value) {
		setConstNumber(offset + 31, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Tax currency) 単価小数部有効桁数（納税通貨）.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(float value) {
		setConstNumber(offset + 31, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Tax currency) 単価小数部有効桁数（納税通貨）.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(double value) {
		setConstNumber(offset + 31, $ptax_cur_upri_dec_place, value);
	}


	/**
	 * Amount number of decimal places (Tax currency) 金額小数部有効桁数（納税通貨）.<p>
	 *
	 */
	public MCNumber ptax_cur_amt_dec_place() {
		return getConstNumber(offset + 32, $ptax_cur_amt_dec_place);
	}

	/**
	 * Amount number of decimal places (Tax currency) 金額小数部有効桁数（納税通貨）.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 32, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Tax currency) 金額小数部有効桁数（納税通貨）.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(int value) {
		setConstNumber(offset + 32, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Tax currency) 金額小数部有効桁数（納税通貨）.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(long value) {
		setConstNumber(offset + 32, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Tax currency) 金額小数部有効桁数（納税通貨）.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(float value) {
		setConstNumber(offset + 32, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Tax currency) 金額小数部有効桁数（納税通貨）.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(double value) {
		setConstNumber(offset + 32, $ptax_cur_amt_dec_place, value);
	}


	/**
	 * Exchange rate rounding type 為替レート端数処理区分.<p>
	 *
	 */
	public String xrate_rnd_typ() {
		return getConstString(offset + 33, $xrate_rnd_typ);
	}

	/**
	 * Exchange rate rounding type 為替レート端数処理区分.<p>
	 *
	 */
	public void xrate_rnd_typ(String value) {
		setConstString(offset + 33, $xrate_rnd_typ, value);
	}


	/**
	 * Withholding tax rounding type 源泉徴収税端数処理区分.<p>
	 *
	 */
	public String wtax_rnd_typ() {
		return getConstString(offset + 34, $wtax_rnd_typ);
	}

	/**
	 * Withholding tax rounding type 源泉徴収税端数処理区分.<p>
	 *
	 */
	public void wtax_rnd_typ(String value) {
		setConstString(offset + 34, $wtax_rnd_typ, value);
	}


	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public String tterm_nm1() {
		return getConstString(offset + 35, $tterm_nm1);
	}

	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public void tterm_nm1(String value) {
		setConstString(offset + 35, $tterm_nm1, value);
	}


	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public String tterm_nm2() {
		return getConstString(offset + 36, $tterm_nm2);
	}

	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public void tterm_nm2(String value) {
		setConstString(offset + 36, $tterm_nm2, value);
	}


	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public String tterm_nm3() {
		return getConstString(offset + 37, $tterm_nm3);
	}

	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public void tterm_nm3(String value) {
		setConstString(offset + 37, $tterm_nm3, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 38, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 38, $ins_func_nm, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 39, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 39, $upd_func_nm, value);
	}


	/**
	 * Update counter (Purchase return schedule) 更新カウンタ（仕入返品予定）.<p>
	 *
	 */
	public MCNumber pr_schd_upd_cntr() {
		return getConstNumber(offset + 40, $pr_schd_upd_cntr);
	}

	/**
	 * Update counter (Purchase return schedule) 更新カウンタ（仕入返品予定）.<p>
	 *
	 */
	public void pr_schd_upd_cntr(MCNumber value) {
		setConstNumber(offset + 40, $pr_schd_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase return schedule) 更新カウンタ（仕入返品予定）.<p>
	 *
	 */
	public void pr_schd_upd_cntr(int value) {
		setConstNumber(offset + 40, $pr_schd_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase return schedule) 更新カウンタ（仕入返品予定）.<p>
	 *
	 */
	public void pr_schd_upd_cntr(long value) {
		setConstNumber(offset + 40, $pr_schd_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase return schedule) 更新カウンタ（仕入返品予定）.<p>
	 *
	 */
	public void pr_schd_upd_cntr(float value) {
		setConstNumber(offset + 40, $pr_schd_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase return schedule) 更新カウンタ（仕入返品予定）.<p>
	 *
	 */
	public void pr_schd_upd_cntr(double value) {
		setConstNumber(offset + 40, $pr_schd_upd_cntr, value);
	}


	/**
	 * Update counter (Purchase Return Results) 更新カウンタ（仕入返品実績）.<p>
	 *
	 */
	public MCNumber pr_act_upd_cntr() {
		return getConstNumber(offset + 41, $pr_act_upd_cntr);
	}

	/**
	 * Update counter (Purchase Return Results) 更新カウンタ（仕入返品実績）.<p>
	 *
	 */
	public void pr_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 41, $pr_act_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase Return Results) 更新カウンタ（仕入返品実績）.<p>
	 *
	 */
	public void pr_act_upd_cntr(int value) {
		setConstNumber(offset + 41, $pr_act_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase Return Results) 更新カウンタ（仕入返品実績）.<p>
	 *
	 */
	public void pr_act_upd_cntr(long value) {
		setConstNumber(offset + 41, $pr_act_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase Return Results) 更新カウンタ（仕入返品実績）.<p>
	 *
	 */
	public void pr_act_upd_cntr(float value) {
		setConstNumber(offset + 41, $pr_act_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase Return Results) 更新カウンタ（仕入返品実績）.<p>
	 *
	 */
	public void pr_act_upd_cntr(double value) {
		setConstNumber(offset + 41, $pr_act_upd_cntr, value);
	}


	/**
	 * Update counter (Purchase result) 更新カウンタ（仕入実績）.<p>
	 *
	 */
	public MCNumber p_act_upd_cntr() {
		return getConstNumber(offset + 42, $p_act_upd_cntr);
	}

	/**
	 * Update counter (Purchase result) 更新カウンタ（仕入実績）.<p>
	 *
	 */
	public void p_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 42, $p_act_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase result) 更新カウンタ（仕入実績）.<p>
	 *
	 */
	public void p_act_upd_cntr(int value) {
		setConstNumber(offset + 42, $p_act_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase result) 更新カウンタ（仕入実績）.<p>
	 *
	 */
	public void p_act_upd_cntr(long value) {
		setConstNumber(offset + 42, $p_act_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase result) 更新カウンタ（仕入実績）.<p>
	 *
	 */
	public void p_act_upd_cntr(float value) {
		setConstNumber(offset + 42, $p_act_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase result) 更新カウンタ（仕入実績）.<p>
	 *
	 */
	public void p_act_upd_cntr(double value) {
		setConstNumber(offset + 42, $p_act_upd_cntr, value);
	}


	public String getString(String name) {
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($mst_ap_dpt_cd.equalsIgnoreCase(name)) {
			return mst_ap_dpt_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($sppl_cntry_cd.equalsIgnoreCase(name)) {
			return sppl_cntry_cd();
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			return sppl_cntry_nm();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			return xrate_rnd_typ();
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			return wtax_rnd_typ();
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			return tterm_nm1();
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			return tterm_nm2();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($purc_ret_act_rev_new.equalsIgnoreCase(name)) {
			return purc_ret_act_rev_new();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return base_cur_upri_dec_place();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_upri_dec_place();
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_amt_dec_place();
		}
		if ($pr_schd_upd_cntr.equalsIgnoreCase(name)) {
			return pr_schd_upd_cntr();
		}
		if ($pr_act_upd_cntr.equalsIgnoreCase(name)) {
			return pr_act_upd_cntr();
		}
		if ($p_act_upd_cntr.equalsIgnoreCase(name)) {
			return p_act_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($reg_dt.equalsIgnoreCase(name)) {
			return reg_dt();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($purc_ddlv_sls_ret_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_sls_ret_flg();
		}
		if ($newest_flg.equalsIgnoreCase(name)) {
			return newest_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return purc_tax_cd_prio_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			return ap_dpt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($mst_ap_dpt_cd.equalsIgnoreCase(name)) {
			return mst_ap_dpt_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($sppl_cntry_cd.equalsIgnoreCase(name)) {
			return sppl_cntry_cd();
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			return sppl_cntry_nm();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			return xrate_rnd_typ();
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			return wtax_rnd_typ();
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			return tterm_nm1();
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			return tterm_nm2();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($purc_ret_act_rev_new.equalsIgnoreCase(name)) {
			return purc_ret_act_rev_new();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return base_cur_upri_dec_place();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_upri_dec_place();
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_amt_dec_place();
		}
		if ($pr_schd_upd_cntr.equalsIgnoreCase(name)) {
			return pr_schd_upd_cntr();
		}
		if ($pr_act_upd_cntr.equalsIgnoreCase(name)) {
			return pr_act_upd_cntr();
		}
		if ($p_act_upd_cntr.equalsIgnoreCase(name)) {
			return p_act_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($reg_dt.equalsIgnoreCase(name)) {
			return reg_dt();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($purc_ddlv_sls_ret_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_sls_ret_flg();
		}
		if ($newest_flg.equalsIgnoreCase(name)) {
			return newest_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return purc_tax_cd_prio_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			return ap_dpt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($mst_ap_dpt_cd.equalsIgnoreCase(name)) {
			mst_ap_dpt_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($sppl_cntry_cd.equalsIgnoreCase(name)) {
			sppl_cntry_cd(value);
			return;
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			sppl_cntry_nm(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			purc_usr_nm(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
			return;
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			xrate_rnd_typ(value);
			return;
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			wtax_rnd_typ(value);
			return;
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			tterm_nm1(value);
			return;
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			tterm_nm2(value);
			return;
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			tterm_nm3(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($purc_ret_act_rev_new.equalsIgnoreCase(name)) {
			purc_ret_act_rev_new(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($pr_schd_upd_cntr.equalsIgnoreCase(name)) {
			pr_schd_upd_cntr(value);
			return;
		}
		if ($pr_act_upd_cntr.equalsIgnoreCase(name)) {
			pr_act_upd_cntr(value);
			return;
		}
		if ($p_act_upd_cntr.equalsIgnoreCase(name)) {
			p_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($purc_ret_act_rev_new.equalsIgnoreCase(name)) {
			purc_ret_act_rev_new(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($pr_schd_upd_cntr.equalsIgnoreCase(name)) {
			pr_schd_upd_cntr(value);
			return;
		}
		if ($pr_act_upd_cntr.equalsIgnoreCase(name)) {
			pr_act_upd_cntr(value);
			return;
		}
		if ($p_act_upd_cntr.equalsIgnoreCase(name)) {
			p_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($purc_ret_act_rev_new.equalsIgnoreCase(name)) {
			purc_ret_act_rev_new(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($pr_schd_upd_cntr.equalsIgnoreCase(name)) {
			pr_schd_upd_cntr(value);
			return;
		}
		if ($pr_act_upd_cntr.equalsIgnoreCase(name)) {
			pr_act_upd_cntr(value);
			return;
		}
		if ($p_act_upd_cntr.equalsIgnoreCase(name)) {
			p_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($purc_ret_act_rev_new.equalsIgnoreCase(name)) {
			purc_ret_act_rev_new(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($pr_schd_upd_cntr.equalsIgnoreCase(name)) {
			pr_schd_upd_cntr(value);
			return;
		}
		if ($pr_act_upd_cntr.equalsIgnoreCase(name)) {
			pr_act_upd_cntr(value);
			return;
		}
		if ($p_act_upd_cntr.equalsIgnoreCase(name)) {
			p_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($purc_ret_act_rev_new.equalsIgnoreCase(name)) {
			purc_ret_act_rev_new(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($pr_schd_upd_cntr.equalsIgnoreCase(name)) {
			pr_schd_upd_cntr(value);
			return;
		}
		if ($pr_act_upd_cntr.equalsIgnoreCase(name)) {
			pr_act_upd_cntr(value);
			return;
		}
		if ($p_act_upd_cntr.equalsIgnoreCase(name)) {
			p_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($reg_dt.equalsIgnoreCase(name)) {
			reg_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($purc_ddlv_sls_ret_flg.equalsIgnoreCase(name)) {
			purc_ddlv_sls_ret_flg(value);
			return;
		}
		if ($newest_flg.equalsIgnoreCase(name)) {
			newest_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			purc_tax_cd_prio_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			ap_dpt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($mst_ap_dpt_cd.equalsIgnoreCase(name)) {
			mst_ap_dpt_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($sppl_cntry_cd.equalsIgnoreCase(name)) {
			sppl_cntry_cd(value);
			return;
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			sppl_cntry_nm(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			purc_usr_nm(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
			return;
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			xrate_rnd_typ(value);
			return;
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			wtax_rnd_typ(value);
			return;
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			tterm_nm1(value);
			return;
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			tterm_nm2(value);
			return;
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			tterm_nm3(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($purc_ret_act_rev_new.equalsIgnoreCase(name)) {
			purc_ret_act_rev_new(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($pr_schd_upd_cntr.equalsIgnoreCase(name)) {
			pr_schd_upd_cntr(value);
			return;
		}
		if ($pr_act_upd_cntr.equalsIgnoreCase(name)) {
			pr_act_upd_cntr(value);
			return;
		}
		if ($p_act_upd_cntr.equalsIgnoreCase(name)) {
			p_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($purc_ret_act_rev_new.equalsIgnoreCase(name)) {
			purc_ret_act_rev_new(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($pr_schd_upd_cntr.equalsIgnoreCase(name)) {
			pr_schd_upd_cntr(value);
			return;
		}
		if ($pr_act_upd_cntr.equalsIgnoreCase(name)) {
			pr_act_upd_cntr(value);
			return;
		}
		if ($p_act_upd_cntr.equalsIgnoreCase(name)) {
			p_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($purc_ret_act_rev_new.equalsIgnoreCase(name)) {
			purc_ret_act_rev_new(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($pr_schd_upd_cntr.equalsIgnoreCase(name)) {
			pr_schd_upd_cntr(value);
			return;
		}
		if ($pr_act_upd_cntr.equalsIgnoreCase(name)) {
			pr_act_upd_cntr(value);
			return;
		}
		if ($p_act_upd_cntr.equalsIgnoreCase(name)) {
			p_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($purc_ret_act_rev_new.equalsIgnoreCase(name)) {
			purc_ret_act_rev_new(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($pr_schd_upd_cntr.equalsIgnoreCase(name)) {
			pr_schd_upd_cntr(value);
			return;
		}
		if ($pr_act_upd_cntr.equalsIgnoreCase(name)) {
			pr_act_upd_cntr(value);
			return;
		}
		if ($p_act_upd_cntr.equalsIgnoreCase(name)) {
			p_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($purc_ret_act_rev_new.equalsIgnoreCase(name)) {
			purc_ret_act_rev_new(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($pr_schd_upd_cntr.equalsIgnoreCase(name)) {
			pr_schd_upd_cntr(value);
			return;
		}
		if ($pr_act_upd_cntr.equalsIgnoreCase(name)) {
			pr_act_upd_cntr(value);
			return;
		}
		if ($p_act_upd_cntr.equalsIgnoreCase(name)) {
			p_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($reg_dt.equalsIgnoreCase(name)) {
			reg_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($purc_ddlv_sls_ret_flg.equalsIgnoreCase(name)) {
			purc_ddlv_sls_ret_flg(value);
			return;
		}
		if ($newest_flg.equalsIgnoreCase(name)) {
			newest_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			purc_tax_cd_prio_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			ap_dpt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

