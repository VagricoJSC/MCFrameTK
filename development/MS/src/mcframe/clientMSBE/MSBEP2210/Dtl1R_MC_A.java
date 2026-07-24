package mcframe.clientMSBE.MSBEP2210;

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
 * ブロック"Dtl1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Dtl1R_MC_A extends mcframe.clientMSBD.MSBDP0140.Dtl1R {

	public static final String $bef_pay_crryovr_times = "bef_pay_crryovr_times";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $str_ln_cd = $str_ln_p + ".str_ln_cd";
	public static final String $str_ln_nm = $str_ln_p + ".str_ln_nm";
	public static final String $str_ln_cd_none_flg = $str_ln_p + ".str_ln_cd_none_flg";
	public static final String $trd_unit_qty = $trd_unit_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $trd_unit_re_arr_qty = $trd_unit_re_arr_qty_p + ".qty";
	public static final String $re_arr_str_ln_cd = $re_arr_str_ln_p + ".str_ln_cd";
	public static final String $re_arr_str_ln_nm = $re_arr_str_ln_p + ".str_ln_nm";
	public static final String $re_arr_str_ln_cd_none_flg = $re_arr_str_ln_p + ".str_ln_cd_none_flg";
	public static final String $re_arr_rqst_dt = $re_arr_rqst_tm_p + ".ymd";
	public static final String $re_arr_rqst_hm = $re_arr_rqst_tm_p + ".hm";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $scst_cd = $dlv_p + ".bp_cd";
	public static final String $scst_nm = $dlv_p + ".bp_nm";
	public static final String $scst_sundry_flg = $dlv_p + ".dlv_sundry_flg";
	public static final String $sppl_show_dtl = $dlv_p + ".show_dtl";
	public static final String $scst_zip_cd = $dlv_p + ".zip_cd";
	public static final String $scst_addr1 = $dlv_p + ".addr1";
	public static final String $scst_addr2 = $dlv_p + ".addr2";
	public static final String $scst_addr3 = $dlv_p + ".addr3";
	public static final String $scst_addr4 = $dlv_p + ".addr4";
	public static final String $scst_tel = $dlv_p + ".tel";
	public static final String $scst_fax = $dlv_p + ".fax";
	public static final String $scst_cntry_cd = $dlv_p + ".cntry_cd";
	public static final String $scst_cntry_nm = $dlv_p + ".cntry_nm";
	public static final String $scst_cntct_dpt = $dlv_p + ".dlv_cntct_dpt";
	public static final String $scst_cntct_psn = $dlv_p + ".dlv_cntct_psn";
	public static final String $tdlv_cd = $tdlv_p + ".bp_cd";
	public static final String $tdlv_nm = $tdlv_p + ".bp_nm";
	public static final String $tdlv_zip_cd = $tdlv_p + ".zip_cd";
	public static final String $tdlv_addr1 = $tdlv_p + ".addr1";
	public static final String $tdlv_addr2 = $tdlv_p + ".addr2";
	public static final String $tdlv_addr3 = $tdlv_p + ".addr3";
	public static final String $tdlv_addr4 = $tdlv_p + ".addr4";
	public static final String $tdlv_tel = $tdlv_p + ".tel";
	public static final String $tdlv_fax = $tdlv_p + ".fax";
	public static final String $tdlv_sundry_flg = $tdlv_p + ".dlv_sundry_flg";
	public static final String $tdlv_show_dtl = $tdlv_p + ".show_dtl";
	public static final String $tdlv_cntry_cd = $tdlv_p + ".cntry_cd";
	public static final String $tdlv_cntry_nm = $tdlv_p + ".cntry_nm";
	public static final String $tdlv_cntct_dpt = $tdlv_p + ".dlv_cntct_dpt";
	public static final String $tdlv_cntct_psn = $tdlv_p + ".dlv_cntct_psn";
	public static final String $crt_lot_flg = $lot_no_p + ".crt_lot_flg";
	public static final String $lot_no = $lot_no_p + ".lot_no";
	public static final String $sublot_no = $lot_no_p + ".sublot_no";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $upri_not_tgt_flg = $trd_cur_upri_p + ".upri_not_tgt_flg";
	public static final String $trd_cur_upri = $trd_cur_upri_p + ".trd_cur_upri";
	public static final String $interim_flg = $trd_cur_upri_p + ".interim_flg";
	public static final String $trd_cur_amt = $trd_cur_upri_p + ".trd_cur_amt";
	public static final String $trd_cur_inc_tax_amt = $trd_cur_upri_p + ".trd_cur_inc_tax_amt";
	public static final String $tax_fix_flg = $trd_cur_upri_p + ".tax_fix_flg";
	public static final String $tax_cd = $trd_cur_upri_p + ".tax_cd";
	public static final String $tax_nm = $trd_cur_upri_p + ".tax_nm";
	public static final String $tax_rate = $trd_cur_upri_p + ".tax_rate";
	public static final String $tax_typ = $trd_cur_upri_p + ".tax_typ";
	public static final String $inc_tax_flg = $trd_cur_upri_p + ".inc_tax_flg";
	public static final String $trd_cur_tax_amt = $trd_cur_upri_p + ".trd_cur_tax_amt";
	public static final String $trd_cur_dscnt_amt = $trd_cur_upri_p + ".trd_cur_dscnt_amt";
	public static final String $dscnt_rsn_cd = $trd_cur_upri_p + ".dscnt_rsn_cd";
	public static final String $dscnt_rsn_nm = $trd_cur_upri_p + ".dscnt_rsn_nm";
	public static final String $trd_cur_proc_upri = $trd_cur_proc_upri_p + ".upri";
	public static final String $trd_cur_proc_amt = $trd_cur_proc_amt_p + ".amt";
	public static final String $trd_cur_onr_prov_upri = $trd_cur_onr_prov_upri_p + ".upri";
	public static final String $trd_cur_onr_prov_amt = $trd_cur_onr_prov_amt_p + ".amt";
	public static final String $base_cur_upri = $base_cur_upri_p + ".upri";
	public static final String $base_cur_dscnt_amt = $base_cur_dscnt_amt_p + ".amt";
	public static final String $base_cur_amt = $base_cur_amt_p + ".amt";
	public static final String $base_cur_tax_amt = $base_cur_tax_amt_p + ".amt";
	public static final String $base_cur_inc_tax_amt = $base_cur_inc_tax_amt_p + ".amt";
	public static final String $base_cur_proc_upri = $base_cur_proc_upri_p + ".upri";
	public static final String $base_cur_proc_amt = $base_cur_proc_amt_p + ".amt";
	public static final String $base_cur_onr_prov_upri = $base_cur_onr_prov_upri_p + ".upri";
	public static final String $base_cur_onr_prov_amt = $base_cur_onr_prov_amt_p + ".amt";
	public static final String $ptax_cur_upri = $ptax_cur_upri_p + ".upri";
	public static final String $ptax_cur_proc_upri = $ptax_cur_proc_upri_p + ".upri";
	public static final String $ptax_cur_onr_prov_upri = $ptax_cur_onr_prov_upri_p + ".upri";
	public static final String $ptax_cur_dscnt_amt = $ptax_cur_dscnt_amt_p + ".amt";
	public static final String $ptax_cur_amt = $ptax_cur_amt_p + ".amt";
	public static final String $ptax_cur_tax_amt = $ptax_cur_tax_amt_p + ".amt";
	public static final String $ptax_cur_inc_tax_amt = $ptax_cur_inc_tax_amt_p + ".amt";
	public static final String $ptax_cur_proc_amt = $ptax_cur_proc_amt_p + ".amt";
	public static final String $ptax_cur_onr_prov_amt = $ptax_cur_onr_prov_amt_p + ".amt";
	public static final String $trd_cur_wtax_amt = $wtax_amt_p + ".amt";
	public static final String $purc_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $purc_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $purc_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $purc_dpt_nm = $usr_dpt_p + ".dpt_nm";
	public static final String $bd_dpt_cd = $bd_p + ".bd_dpt_cd";
	public static final String $bd_dpt_nm = $bd_p + ".bd_dpt_nm";
	public static final String $bd_itm_cd = $bd_p + ".bd_itm_cd";
	public static final String $bd_itm_sub1 = $bd_p + ".bd_itm_sub1";
	public static final String $bd_itm_sub2 = $bd_p + ".bd_itm_sub2";
	public static final String $bd_itm_sub3 = $bd_p + ".bd_itm_sub3";
	public static final String $bd_itm_nm = $bd_p + ".bd_itm_nm";
	public static final String $bd_lot_no = $bd_p + ".bd_lot_no";
	public static final String $bd_sublot_no = $bd_p + ".bd_sublot_no";
	public static final String $bd_sno1 = $bd_p + ".bd_sno1";
	public static final String $bd_sno2 = $bd_p + ".bd_sno2";
	public static final String $bd_sno3 = $bd_p + ".bd_sno3";
	public static final String $bd_sno4 = $bd_p + ".bd_sno4";
	public static final String $bd_bp_cd = $bd_p + ".bd_bp_cd";
	public static final String $bd_bp_nm = $bd_p + ".bd_bp_nm";
	public static final String $bd_loc_cd = $bd_p + ".bd_loc_cd";
	public static final String $bd_loc_nm = $bd_p + ".bd_loc_nm";
	public static final String $bd_ctg_cd = $bd_p + ".bd_ctg_cd";
	public static final String $bd_ctg_nm = $bd_p + ".bd_ctg_nm";
	public static final String $bd_oper_cd = $bd_p + ".bd_oper_cd";
	public static final String $bd_oper_nm = $bd_p + ".bd_oper_nm";
	public static final String $bd_iv_no = $bd_p + ".bd_iv_no";
	public static final String $bd_slo_no = $bd_p + ".bd_slo_no";
	public static final String $bd_po_no = $bd_p + ".bd_po_no";
	public static final String $purc_cont_qty = $purc_cont_qty_p + ".purc_cont_qty";
	public static final String $purc_cont_fctr = $purc_cont_fctr_p + ".purc_cont_fctr";
	public static final String $std_cont_qty = $std_cont_qty_p + ".cont_qty";
	public static final String $std_cont_fctr = $std_cont_fctr_p + ".std_cont_fctr";
	public static final String $cont_fctr_unit_cd = $cont_fctr_unit_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_fctr_unit_p + ".cont_fctr_unit_nm";

	public static final MCMeta bef_pay_crryovr_times_META = createCommonMeta($bef_pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);

	protected static final ConstMetaList<Dtl1R> constMetas = new ConstMetaList<Dtl1R>(
		mcframe.clientMSBD.MSBDP0140.Dtl1R.constMetas,
		new MCMeta[]{
			bef_pay_crryovr_times_META,
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"str_ln_cd",
				"str_ln_nm",
				"str_ln_cd_none_flg",
				"trd_unit_qty",
				"base_unit_qty",
				"trd_unit_re_arr_qty",
				"re_arr_str_ln_cd",
				"re_arr_str_ln_nm",
				"re_arr_str_ln_cd_none_flg",
				"re_arr_rqst_dt",
				"re_arr_rqst_hm",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"scst_cd",
				"scst_nm",
				"scst_sundry_flg",
				"scst_zip_cd",
				"scst_addr1",
				"scst_addr2",
				"scst_addr3",
				"scst_addr4",
				"scst_tel",
				"scst_fax",
				"scst_cntry_cd",
				"scst_cntry_nm",
				"scst_cntct_dpt",
				"scst_cntct_psn",
				"tdlv_cd",
				"tdlv_nm",
				"tdlv_zip_cd",
				"tdlv_addr1",
				"tdlv_addr2",
				"tdlv_addr3",
				"tdlv_addr4",
				"tdlv_tel",
				"tdlv_fax",
				"tdlv_sundry_flg",
				"tdlv_cntry_cd",
				"tdlv_cntry_nm",
				"tdlv_cntct_dpt",
				"tdlv_cntct_psn",
				"crt_lot_flg",
				"lot_no",
				"sublot_no",
				"ver_no",
				"upri_not_tgt_flg",
				"trd_cur_upri",
				"interim_flg",
				"trd_cur_amt",
				"trd_cur_inc_tax_amt",
				"tax_fix_flg",
				"tax_cd",
				"tax_nm",
				"tax_rate",
				"tax_typ",
				"inc_tax_flg",
				"trd_cur_tax_amt",
				"trd_cur_dscnt_amt",
				"dscnt_rsn_cd",
				"dscnt_rsn_nm",
				"trd_cur_proc_upri",
				"trd_cur_proc_amt",
				"trd_cur_onr_prov_upri",
				"trd_cur_onr_prov_amt",
				"base_cur_upri",
				"base_cur_dscnt_amt",
				"base_cur_amt",
				"base_cur_tax_amt",
				"base_cur_inc_tax_amt",
				"base_cur_proc_upri",
				"base_cur_proc_amt",
				"base_cur_onr_prov_upri",
				"base_cur_onr_prov_amt",
				"ptax_cur_upri",
				"ptax_cur_proc_upri",
				"ptax_cur_onr_prov_upri",
				"ptax_cur_dscnt_amt",
				"ptax_cur_amt",
				"ptax_cur_tax_amt",
				"ptax_cur_inc_tax_amt",
				"ptax_cur_proc_amt",
				"ptax_cur_onr_prov_amt",
				"trd_cur_wtax_amt",
				"purc_usr_cd",
				"purc_usr_nm",
				"purc_dpt_cd",
				"purc_dpt_nm",
				"bd_dpt_cd",
				"bd_dpt_nm",
				"bd_itm_cd",
				"bd_itm_sub1",
				"bd_itm_sub2",
				"bd_itm_sub3",
				"bd_itm_nm",
				"bd_lot_no",
				"bd_sublot_no",
				"bd_sno1",
				"bd_sno2",
				"bd_sno3",
				"bd_sno4",
				"bd_bp_cd",
				"bd_bp_nm",
				"bd_loc_cd",
				"bd_loc_nm",
				"bd_ctg_cd",
				"bd_ctg_nm",
				"bd_oper_cd",
				"bd_oper_nm",
				"bd_iv_no",
				"bd_slo_no",
				"bd_po_no",
				"purc_cont_qty",
				"purc_cont_fctr",
				"std_cont_qty",
				"std_cont_fctr",
				"cont_fctr_unit_cd",
				"cont_fctr_unit_nm"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$str_ln_cd,
				$str_ln_nm,
				$str_ln_cd_none_flg,
				$trd_unit_qty,
				$base_unit_qty,
				$trd_unit_re_arr_qty,
				$re_arr_str_ln_cd,
				$re_arr_str_ln_nm,
				$re_arr_str_ln_cd_none_flg,
				$re_arr_rqst_dt,
				$re_arr_rqst_hm,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$scst_cd,
				$scst_nm,
				$scst_sundry_flg,
				$scst_zip_cd,
				$scst_addr1,
				$scst_addr2,
				$scst_addr3,
				$scst_addr4,
				$scst_tel,
				$scst_fax,
				$scst_cntry_cd,
				$scst_cntry_nm,
				$scst_cntct_dpt,
				$scst_cntct_psn,
				$tdlv_cd,
				$tdlv_nm,
				$tdlv_zip_cd,
				$tdlv_addr1,
				$tdlv_addr2,
				$tdlv_addr3,
				$tdlv_addr4,
				$tdlv_tel,
				$tdlv_fax,
				$tdlv_sundry_flg,
				$tdlv_cntry_cd,
				$tdlv_cntry_nm,
				$tdlv_cntct_dpt,
				$tdlv_cntct_psn,
				$crt_lot_flg,
				$lot_no,
				$sublot_no,
				$ver_no,
				$upri_not_tgt_flg,
				$trd_cur_upri,
				$interim_flg,
				$trd_cur_amt,
				$trd_cur_inc_tax_amt,
				$tax_fix_flg,
				$tax_cd,
				$tax_nm,
				$tax_rate,
				$tax_typ,
				$inc_tax_flg,
				$trd_cur_tax_amt,
				$trd_cur_dscnt_amt,
				$dscnt_rsn_cd,
				$dscnt_rsn_nm,
				$trd_cur_proc_upri,
				$trd_cur_proc_amt,
				$trd_cur_onr_prov_upri,
				$trd_cur_onr_prov_amt,
				$base_cur_upri,
				$base_cur_dscnt_amt,
				$base_cur_amt,
				$base_cur_tax_amt,
				$base_cur_inc_tax_amt,
				$base_cur_proc_upri,
				$base_cur_proc_amt,
				$base_cur_onr_prov_upri,
				$base_cur_onr_prov_amt,
				$ptax_cur_upri,
				$ptax_cur_proc_upri,
				$ptax_cur_onr_prov_upri,
				$ptax_cur_dscnt_amt,
				$ptax_cur_amt,
				$ptax_cur_tax_amt,
				$ptax_cur_inc_tax_amt,
				$ptax_cur_proc_amt,
				$ptax_cur_onr_prov_amt,
				$trd_cur_wtax_amt,
				$purc_usr_cd,
				$purc_usr_nm,
				$purc_dpt_cd,
				$purc_dpt_nm,
				$bd_dpt_cd,
				$bd_dpt_nm,
				$bd_itm_cd,
				$bd_itm_sub1,
				$bd_itm_sub2,
				$bd_itm_sub3,
				$bd_itm_nm,
				$bd_lot_no,
				$bd_sublot_no,
				$bd_sno1,
				$bd_sno2,
				$bd_sno3,
				$bd_sno4,
				$bd_bp_cd,
				$bd_bp_nm,
				$bd_loc_cd,
				$bd_loc_nm,
				$bd_ctg_cd,
				$bd_ctg_nm,
				$bd_oper_cd,
				$bd_oper_nm,
				$bd_iv_no,
				$bd_slo_no,
				$bd_po_no,
				$purc_cont_qty,
				$purc_cont_fctr,
				$std_cont_qty,
				$std_cont_fctr,
				$cont_fctr_unit_cd,
				$cont_fctr_unit_nm
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		mcframe.clientMSBD.MSBDP0140.Dtl1R.KEYS,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[PURC_ONLY_ITEM]のキー定数 */
	public static final String $$PURC_ONLY_ITEM = "PURC_ONLY_ITEM";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		mcframe.clientMSBD.MSBDP0140.Dtl1R.EXTMAP,
		new MCExtMap.Entry($$PURC_ONLY_ITEM, new MCExtList(
			new String[][]{
				{$purc_schd_dt, "E"},	// purc_schd_dt
				{$accpt_dfct_flg, "E"},	// accpt_dfct_flg
				{$re_arr_flg, "E"},	// re_arr_flg
				{$trd_unit_re_arr_qty_p + ".qty", "E"},	// trd_unit_re_arr_qty_p.qty
				{$re_arr_loc_wg_cd, "E"},	// re_arr_loc_wg_cd
				{$re_arr_loc_wg_nm, "E"},	// re_arr_loc_wg_nm
				{$re_arr_loc_cd, "E"},	// re_arr_loc_cd
				{$re_arr_loc_nm, "E"},	// re_arr_loc_nm
				{$re_arr_str_ln_tgt_flg, "E"},	// re_arr_str_ln_tgt_flg
				{$re_arr_str_ln_p + ".str_ln_cd", "E"},	// re_arr_str_ln_p.str_ln_cd
				{$re_arr_str_ln_p + ".str_ln_nm", "E"},	// re_arr_str_ln_p.str_ln_nm
				{$re_arr_str_ln_p + ".str_ln_cd_none_flg", "E"},	// re_arr_str_ln_p.str_ln_cd_none_flg
				{$re_arr_loc_site_cd, "E"},	// re_arr_loc_site_cd
				{$re_arr_loc_cal_cd, "E"},	// re_arr_loc_cal_cd
				{$re_arr_loc_sppl_cd, "E"},	// re_arr_loc_sppl_cd
				{$re_arr_loc_sppl_cal_cd, "E"},	// re_arr_loc_sppl_cal_cd
				{$re_arr_rqst_tm_p + ".ymd", "E"},	// re_arr_rqst_tm_p.ymd
				{$re_arr_rqst_tm_p + ".hm", "E"},	// re_arr_rqst_tm_p.hm
				{$re_arr_purc_schd_dt, "E"},	// re_arr_purc_schd_dt
				{$re_arr_sync_flg, "E"},	// re_arr_sync_flg
				{$ncv_flg, "E"}	// ncv_flg
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
	protected Dtl1R_MC_A(ConstMetaList<? extends Dtl1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl1R clone() {
		return (Dtl1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl1R createInstance() {
		return (Dtl1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl1R getValues(String... names) {
		return (Dtl1R) super.getValues(names);
	}



	public MCNumber bef_pay_crryovr_times() {
		return getConstNumber(offset + 0, $bef_pay_crryovr_times);
	}

	public void bef_pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 0, $bef_pay_crryovr_times, value);
	}

	public void bef_pay_crryovr_times(int value) {
		setConstNumber(offset + 0, $bef_pay_crryovr_times, value);
	}

	public void bef_pay_crryovr_times(long value) {
		setConstNumber(offset + 0, $bef_pay_crryovr_times, value);
	}

	public void bef_pay_crryovr_times(float value) {
		setConstNumber(offset + 0, $bef_pay_crryovr_times, value);
	}

	public void bef_pay_crryovr_times(double value) {
		setConstNumber(offset + 0, $bef_pay_crryovr_times, value);
	}


	public String getString(String name) {
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($bef_pay_crryovr_times.equalsIgnoreCase(name)) {
			return bef_pay_crryovr_times();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($bef_pay_crryovr_times.equalsIgnoreCase(name)) {
			return bef_pay_crryovr_times();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($bef_pay_crryovr_times.equalsIgnoreCase(name)) {
			bef_pay_crryovr_times(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($bef_pay_crryovr_times.equalsIgnoreCase(name)) {
			bef_pay_crryovr_times(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($bef_pay_crryovr_times.equalsIgnoreCase(name)) {
			bef_pay_crryovr_times(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($bef_pay_crryovr_times.equalsIgnoreCase(name)) {
			bef_pay_crryovr_times(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($bef_pay_crryovr_times.equalsIgnoreCase(name)) {
			bef_pay_crryovr_times(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($bef_pay_crryovr_times.equalsIgnoreCase(name)) {
			bef_pay_crryovr_times(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($bef_pay_crryovr_times.equalsIgnoreCase(name)) {
			bef_pay_crryovr_times(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($bef_pay_crryovr_times.equalsIgnoreCase(name)) {
			bef_pay_crryovr_times(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($bef_pay_crryovr_times.equalsIgnoreCase(name)) {
			bef_pay_crryovr_times(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($bef_pay_crryovr_times.equalsIgnoreCase(name)) {
			bef_pay_crryovr_times(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		super.setInnerRow(name, value);
	}


}

