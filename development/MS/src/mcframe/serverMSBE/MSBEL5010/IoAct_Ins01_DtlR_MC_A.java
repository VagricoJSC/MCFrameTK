package mcframe.serverMSBE.MSBEL5010;

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
 * ブロック"IoAct_Ins01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class IoAct_Ins01_DtlR_MC_A extends MCConstRow {

	public static final String $wia = "wia";

	public static final String $data_crud_typ = $wia + ".data_crud_typ";
	public static final String $ac_dt = $wia + ".ac_dt";
	public static final String $can_ac_dt = $wia + ".can_ac_dt";
	public static final String $act_tm = $wia + ".act_tm";
	public static final String $act_no = $wia + ".act_no";
	public static final String $act_seq = $wia + ".act_seq";
	public static final String $act_rev_no = $wia + ".act_rev_no";
	public static final String $act_d_no = $wia + ".act_d_no";
	public static final String $act_d_seq = $wia + ".act_d_seq";
	public static final String $act_io_no = $wia + ".act_io_no";
	public static final String $act_io_seq = $wia + ".act_io_seq";
	public static final String $un_fix_flg = $wia + ".un_fix_flg";
	public static final String $temp_ap_flg = $wia + ".temp_ap_flg";
	public static final String $trd_cd = $wia + ".trd_cd";
	public static final String $trd_ptn_typ = $wia + ".trd_ptn_typ";
	public static final String $trn_typ = $wia + ".trn_typ";
	public static final String $io_act_typ = $wia + ".io_act_typ";
	public static final String $rsn_cd = $wia + ".rsn_cd";
	public static final String $gi_wg_cd = $wia + ".gi_wg_cd";
	public static final String $gr_wg_cd = $wia + ".gr_wg_cd";
	public static final String $act_dpt_cd = $wia + ".act_dpt_cd";
	public static final String $purc_dpt_cd = $wia + ".purc_dpt_cd";
	public static final String $ap_dpt_cd = $wia + ".ap_dpt_cd";
	public static final String $sls_dpt_cd = $wia + ".sls_dpt_cd";
	public static final String $ar_dpt_cd = $wia + ".ar_dpt_cd";
	public static final String $bd_dpt_cd = $wia + ".bd_dpt_cd";
	public static final String $sub_dpt_cd1 = $wia + ".sub_dpt_cd1";
	public static final String $sub_dpt_cd2 = $wia + ".sub_dpt_cd2";
	public static final String $sub_dpt_cd3 = $wia + ".sub_dpt_cd3";
	public static final String $act_usr_cd = $wia + ".act_usr_cd";
	public static final String $sls_usr_cd = $wia + ".sls_usr_cd";
	public static final String $mfg_usr_cd = $wia + ".mfg_usr_cd";
	public static final String $purc_usr_cd = $wia + ".purc_usr_cd";
	public static final String $itm_cd = $wia + ".itm_cd";
	public static final String $itm_sub1 = $wia + ".itm_sub1";
	public static final String $itm_sub2 = $wia + ".itm_sub2";
	public static final String $itm_sub3 = $wia + ".itm_sub3";
	public static final String $itm_nm = $wia + ".itm_nm";
	public static final String $stk_mng_typ = $wia + ".stk_mng_typ";
	public static final String $sundry_itm_flg = $wia + ".sundry_itm_flg";
	public static final String $gi_loc_cd = $wia + ".gi_loc_cd";
	public static final String $gi_str_ln_cd = $wia + ".gi_str_ln_cd";
	public static final String $gr_loc_cd = $wia + ".gr_loc_cd";
	public static final String $gr_str_ln_cd = $wia + ".gr_str_ln_cd";
	public static final String $stk_arrv_bp_cd = $wia + ".stk_arrv_bp_cd";
	public static final String $lot_no = $wia + ".lot_no";
	public static final String $sublot_no = $wia + ".sublot_no";
	public static final String $sno1 = $wia + ".sno1";
	public static final String $sno2 = $wia + ".sno2";
	public static final String $sno3 = $wia + ".sno3";
	public static final String $sno4 = $wia + ".sno4";
	public static final String $sno1_mng_typ = $wia + ".sno1_mng_typ";
	public static final String $sno2_mng_typ = $wia + ".sno2_mng_typ";
	public static final String $sno3_mng_typ = $wia + ".sno3_mng_typ";
	public static final String $sno4_mng_typ = $wia + ".sno4_mng_typ";
	public static final String $fix_no_typ = $wia + ".fix_no_typ";
	public static final String $fix_no = $wia + ".fix_no";
	public static final String $gi_gd_cd = $wia + ".gi_gd_cd";
	public static final String $gr_gd_cd = $wia + ".gr_gd_cd";
	public static final String $in_xfr_typ = $wia + ".in_xfr_typ";
	public static final String $quality_typ = $wia + ".quality_typ";
	public static final String $stk_insp_typ = $wia + ".stk_insp_typ";
	public static final String $stk_id_typ = $wia + ".stk_id_typ";
	public static final String $stk_bp_cd = $wia + ".stk_bp_cd";
	public static final String $trd_unit_qty = $wia + ".trd_unit_qty";
	public static final String $trd_unit_cd = $wia + ".trd_unit_cd";
	public static final String $pack_unit_qty = $wia + ".pack_unit_qty";
	public static final String $pack_unit_cd = $wia + ".pack_unit_cd";
	public static final String $base_unit_qty = $wia + ".base_unit_qty";
	public static final String $base_unit_cd = $wia + ".base_unit_cd";
	public static final String $trd_cur_cd = $wia + ".trd_cur_cd";
	public static final String $trd_cur_upri = $wia + ".trd_cur_upri";
	public static final String $trd_cur_amt = $wia + ".trd_cur_amt";
	public static final String $trd_cur_proc_amt = $wia + ".trd_cur_proc_amt";
	public static final String $trd_cur_onr_prov_amt = $wia + ".trd_cur_onr_prov_amt";
	public static final String $trd_cur_tax_amt = $wia + ".trd_cur_tax_amt";
	public static final String $base_cur_cd = $wia + ".base_cur_cd";
	public static final String $base_cur_upri = $wia + ".base_cur_upri";
	public static final String $base_cur_amt = $wia + ".base_cur_amt";
	public static final String $base_cur_proc_amt = $wia + ".base_cur_proc_amt";
	public static final String $base_cur_onr_prov_amt = $wia + ".base_cur_onr_prov_amt";
	public static final String $base_cur_tax_amt = $wia + ".base_cur_tax_amt";
	public static final String $ptax_cur_cd = $wia + ".ptax_cur_cd";
	public static final String $ptax_cur_upri = $wia + ".ptax_cur_upri";
	public static final String $ptax_cur_amt = $wia + ".ptax_cur_amt";
	public static final String $ptax_cur_proc_amt = $wia + ".ptax_cur_proc_amt";
	public static final String $ptax_cur_onr_prov_amt = $wia + ".ptax_cur_onr_prov_amt";
	public static final String $ptax_cur_tax_amt = $wia + ".ptax_cur_tax_amt";
	public static final String $wtax_rate = $wia + ".wtax_rate";
	public static final String $wtax_amt = $wia + ".wtax_amt";
	public static final String $tax_cd = $wia + ".tax_cd";
	public static final String $xrate_cd = $wia + ".xrate_cd";
	public static final String $xrate = $wia + ".xrate";
	public static final String $ptax_xrate_cd = $wia + ".ptax_xrate_cd";
	public static final String $ptax_xrate = $wia + ".ptax_xrate";
	public static final String $slo_no = $wia + ".slo_no";
	public static final String $po_no = $wia + ".po_no";
	public static final String $iv_no = $wia + ".iv_no";
	public static final String $rcpt_iv_no = $wia + ".rcpt_iv_no";
	public static final String $bd_ctg_cd = $wia + ".bd_ctg_cd";
	public static final String $bd_bp_cd = $wia + ".bd_bp_cd";
	public static final String $bd_oper_cd = $wia + ".bd_oper_cd";
	public static final String $bd_loc_cd = $wia + ".bd_loc_cd";
	public static final String $bd_slo_no = $wia + ".bd_slo_no";
	public static final String $bd_po_no = $wia + ".bd_po_no";
	public static final String $bd_iv_no = $wia + ".bd_iv_no";
	public static final String $bd_wg_cd = $wia + ".bd_wg_cd";
	public static final String $dlv_cd = $wia + ".dlv_cd";
	public static final String $tdlv_cd = $wia + ".tdlv_cd";
	public static final String $acst_cd = $wia + ".acst_cd";
	public static final String $cst_cd = $wia + ".cst_cd";
	public static final String $dest_cd1 = $wia + ".dest_cd1";
	public static final String $dest_cd2 = $wia + ".dest_cd2";
	public static final String $dest_cd3 = $wia + ".dest_cd3";
	public static final String $asppl_cd = $wia + ".asppl_cd";
	public static final String $sppl_cd = $wia + ".sppl_cd";
	public static final String $spot_flg = $wia + ".spot_flg";
	public static final String $sttl_schd_dt = $wia + ".sttl_schd_dt";
	public static final String $sttl_cd = $wia + ".sttl_cd";
	public static final String $cst_itm_cd = $wia + ".cst_itm_cd";
	public static final String $cst_itm_nm = $wia + ".cst_itm_nm";
	public static final String $sppl_itm_cd = $wia + ".sppl_itm_cd";
	public static final String $sppl_itm_nm = $wia + ".sppl_itm_nm";
	public static final String $purc_typ = $wia + ".purc_typ";
	public static final String $itm_mfg_inst_no = $wia + ".itm_mfg_inst_no";
	public static final String $itm_inst_qty = $wia + ".itm_inst_qty";
	public static final String $mfg_inst_no = $wia + ".mfg_inst_no";
	public static final String $mfg_act_no = $wia + ".mfg_act_no";
	public static final String $mfg_st_qty = $wia + ".mfg_st_qty";
	public static final String $oper_act_no = $wia + ".oper_act_no";
	public static final String $yield_rate = $wia + ".yield_rate";
	public static final String $disp_seq = $wia + ".disp_seq";
	public static final String $oper_cd = $wia + ".oper_cd";
	public static final String $inpt_loc_cd = $wia + ".inpt_loc_cd";
	public static final String $inpt_str_ln_cd = $wia + ".inpt_str_ln_cd";
	public static final String $strg_loc_cd = $wia + ".strg_loc_cd";
	public static final String $strg_str_ln_cd = $wia + ".strg_str_ln_cd";
	public static final String $par_itm_cd = $wia + ".par_itm_cd";
	public static final String $par_itm_sub1 = $wia + ".par_itm_sub1";
	public static final String $par_itm_sub2 = $wia + ".par_itm_sub2";
	public static final String $par_itm_sub3 = $wia + ".par_itm_sub3";
	public static final String $par_itm_nm = $wia + ".par_itm_nm";
	public static final String $par_lot_no = $wia + ".par_lot_no";
	public static final String $par_sublot_no = $wia + ".par_sublot_no";
	public static final String $par_sno1 = $wia + ".par_sno1";
	public static final String $par_sno2 = $wia + ".par_sno2";
	public static final String $par_sno3 = $wia + ".par_sno3";
	public static final String $par_sno4 = $wia + ".par_sno4";
	public static final String $stktk_diff_qty = $wia + ".stktk_diff_qty";
	public static final String $pack_xfr_unit_cd = $wia + ".pack_xfr_unit_cd";
	public static final String $pack_xfr_qty = $wia + ".pack_xfr_qty";
	public static final String $mfg_inst_unit_typ = $wia + ".mfg_inst_unit_typ";
	public static final String $via_dlv_typ = $wia + ".via_dlv_typ";
	public static final String $arr_ptn_typ = $wia + ".arr_ptn_typ";
	public static final String $yield_typ = $wia + ".yield_typ";
	public static final String $prov_typ = $wia + ".prov_typ";
	public static final String $purc_id_typ = $wia + ".purc_id_typ";
	public static final String $io_typ = $wia + ".io_typ";
	public static final String $accpt_dfct_flg = $wia + ".accpt_dfct_flg";
	public static final String $par_slip_io_act_typ = $wia + ".par_slip_io_act_typ";
	public static final String $no_gi_alloc_flg = $wia + ".no_gi_alloc_flg";
	public static final String $acxfr_stk_id_typ = $wia + ".acxfr_stk_id_typ";
	public static final String $acxfr_stk_bp_cd = $wia + ".acxfr_stk_bp_cd";
	public static final String $acxfr_stk_arrv_bp_cd = $wia + ".acxfr_stk_arrv_bp_cd";
	public static final String $trd_rmrks = $wia + ".trd_rmrks";
	public static final String $trd_d_rmrks = $wia + ".trd_d_rmrks";
	public static final String $sub_char1 = $wia + ".sub_char1";
	public static final String $sub_char2 = $wia + ".sub_char2";
	public static final String $sub_char3 = $wia + ".sub_char3";
	public static final String $sub_char4 = $wia + ".sub_char4";
	public static final String $sub_char5 = $wia + ".sub_char5";
	public static final String $sub_char6 = $wia + ".sub_char6";
	public static final String $sub_char7 = $wia + ".sub_char7";
	public static final String $sub_char8 = $wia + ".sub_char8";
	public static final String $sub_char9 = $wia + ".sub_char9";
	public static final String $sub_char10 = $wia + ".sub_char10";
	public static final String $sub_num1 = $wia + ".sub_num1";
	public static final String $sub_num2 = $wia + ".sub_num2";
	public static final String $sub_num3 = $wia + ".sub_num3";
	public static final String $sub_dt1 = $wia + ".sub_dt1";
	public static final String $sub_dt2 = $wia + ".sub_dt2";
	public static final String $sub_dt3 = $wia + ".sub_dt3";
	public static final String $rsn_cd2 = $wia + ".rsn_cd2";

	public static final MCMeta wia_META = createInnerRowMeta($wia, mcframe.serverMS.dbc.MSW_IO_ACT_R.class);

	protected static final ConstMetaList<IoAct_Ins01_DtlR> constMetas = new ConstMetaList<IoAct_Ins01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			wia_META
		},
		new String[][]{
			{
				"data_crud_typ",
				"ac_dt",
				"can_ac_dt",
				"act_tm",
				"act_no",
				"act_seq",
				"act_rev_no",
				"act_d_no",
				"act_d_seq",
				"act_io_no",
				"act_io_seq",
				"un_fix_flg",
				"temp_ap_flg",
				"trd_cd",
				"trd_ptn_typ",
				"trn_typ",
				"io_act_typ",
				"rsn_cd",
				"gi_wg_cd",
				"gr_wg_cd",
				"act_dpt_cd",
				"purc_dpt_cd",
				"ap_dpt_cd",
				"sls_dpt_cd",
				"ar_dpt_cd",
				"bd_dpt_cd",
				"sub_dpt_cd1",
				"sub_dpt_cd2",
				"sub_dpt_cd3",
				"act_usr_cd",
				"sls_usr_cd",
				"mfg_usr_cd",
				"purc_usr_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"stk_mng_typ",
				"sundry_itm_flg",
				"gi_loc_cd",
				"gi_str_ln_cd",
				"gr_loc_cd",
				"gr_str_ln_cd",
				"stk_arrv_bp_cd",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"sno1_mng_typ",
				"sno2_mng_typ",
				"sno3_mng_typ",
				"sno4_mng_typ",
				"fix_no_typ",
				"fix_no",
				"gi_gd_cd",
				"gr_gd_cd",
				"in_xfr_typ",
				"quality_typ",
				"stk_insp_typ",
				"stk_id_typ",
				"stk_bp_cd",
				"trd_unit_qty",
				"trd_unit_cd",
				"pack_unit_qty",
				"pack_unit_cd",
				"base_unit_qty",
				"base_unit_cd",
				"trd_cur_cd",
				"trd_cur_upri",
				"trd_cur_amt",
				"trd_cur_proc_amt",
				"trd_cur_onr_prov_amt",
				"trd_cur_tax_amt",
				"base_cur_cd",
				"base_cur_upri",
				"base_cur_amt",
				"base_cur_proc_amt",
				"base_cur_onr_prov_amt",
				"base_cur_tax_amt",
				"ptax_cur_cd",
				"ptax_cur_upri",
				"ptax_cur_amt",
				"ptax_cur_proc_amt",
				"ptax_cur_onr_prov_amt",
				"ptax_cur_tax_amt",
				"wtax_rate",
				"wtax_amt",
				"tax_cd",
				"xrate_cd",
				"xrate",
				"ptax_xrate_cd",
				"ptax_xrate",
				"slo_no",
				"po_no",
				"iv_no",
				"rcpt_iv_no",
				"bd_ctg_cd",
				"bd_bp_cd",
				"bd_oper_cd",
				"bd_loc_cd",
				"bd_slo_no",
				"bd_po_no",
				"bd_iv_no",
				"bd_wg_cd",
				"dlv_cd",
				"tdlv_cd",
				"acst_cd",
				"cst_cd",
				"dest_cd1",
				"dest_cd2",
				"dest_cd3",
				"asppl_cd",
				"sppl_cd",
				"spot_flg",
				"sttl_schd_dt",
				"sttl_cd",
				"cst_itm_cd",
				"cst_itm_nm",
				"sppl_itm_cd",
				"sppl_itm_nm",
				"purc_typ",
				"itm_mfg_inst_no",
				"itm_inst_qty",
				"mfg_inst_no",
				"mfg_act_no",
				"mfg_st_qty",
				"oper_act_no",
				"yield_rate",
				"disp_seq",
				"oper_cd",
				"inpt_loc_cd",
				"inpt_str_ln_cd",
				"strg_loc_cd",
				"strg_str_ln_cd",
				"par_itm_cd",
				"par_itm_sub1",
				"par_itm_sub2",
				"par_itm_sub3",
				"par_itm_nm",
				"par_lot_no",
				"par_sublot_no",
				"par_sno1",
				"par_sno2",
				"par_sno3",
				"par_sno4",
				"stktk_diff_qty",
				"pack_xfr_unit_cd",
				"pack_xfr_qty",
				"mfg_inst_unit_typ",
				"via_dlv_typ",
				"arr_ptn_typ",
				"yield_typ",
				"prov_typ",
				"purc_id_typ",
				"io_typ",
				"accpt_dfct_flg",
				"par_slip_io_act_typ",
				"no_gi_alloc_flg",
				"acxfr_stk_id_typ",
				"acxfr_stk_bp_cd",
				"acxfr_stk_arrv_bp_cd",
				"trd_rmrks",
				"trd_d_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"sub_char4",
				"sub_char5",
				"sub_char6",
				"sub_char7",
				"sub_char8",
				"sub_char9",
				"sub_char10",
				"sub_num1",
				"sub_num2",
				"sub_num3",
				"sub_dt1",
				"sub_dt2",
				"sub_dt3",
				"rsn_cd2"
			},
			{
				$data_crud_typ,
				$ac_dt,
				$can_ac_dt,
				$act_tm,
				$act_no,
				$act_seq,
				$act_rev_no,
				$act_d_no,
				$act_d_seq,
				$act_io_no,
				$act_io_seq,
				$un_fix_flg,
				$temp_ap_flg,
				$trd_cd,
				$trd_ptn_typ,
				$trn_typ,
				$io_act_typ,
				$rsn_cd,
				$gi_wg_cd,
				$gr_wg_cd,
				$act_dpt_cd,
				$purc_dpt_cd,
				$ap_dpt_cd,
				$sls_dpt_cd,
				$ar_dpt_cd,
				$bd_dpt_cd,
				$sub_dpt_cd1,
				$sub_dpt_cd2,
				$sub_dpt_cd3,
				$act_usr_cd,
				$sls_usr_cd,
				$mfg_usr_cd,
				$purc_usr_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$stk_mng_typ,
				$sundry_itm_flg,
				$gi_loc_cd,
				$gi_str_ln_cd,
				$gr_loc_cd,
				$gr_str_ln_cd,
				$stk_arrv_bp_cd,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$sno1_mng_typ,
				$sno2_mng_typ,
				$sno3_mng_typ,
				$sno4_mng_typ,
				$fix_no_typ,
				$fix_no,
				$gi_gd_cd,
				$gr_gd_cd,
				$in_xfr_typ,
				$quality_typ,
				$stk_insp_typ,
				$stk_id_typ,
				$stk_bp_cd,
				$trd_unit_qty,
				$trd_unit_cd,
				$pack_unit_qty,
				$pack_unit_cd,
				$base_unit_qty,
				$base_unit_cd,
				$trd_cur_cd,
				$trd_cur_upri,
				$trd_cur_amt,
				$trd_cur_proc_amt,
				$trd_cur_onr_prov_amt,
				$trd_cur_tax_amt,
				$base_cur_cd,
				$base_cur_upri,
				$base_cur_amt,
				$base_cur_proc_amt,
				$base_cur_onr_prov_amt,
				$base_cur_tax_amt,
				$ptax_cur_cd,
				$ptax_cur_upri,
				$ptax_cur_amt,
				$ptax_cur_proc_amt,
				$ptax_cur_onr_prov_amt,
				$ptax_cur_tax_amt,
				$wtax_rate,
				$wtax_amt,
				$tax_cd,
				$xrate_cd,
				$xrate,
				$ptax_xrate_cd,
				$ptax_xrate,
				$slo_no,
				$po_no,
				$iv_no,
				$rcpt_iv_no,
				$bd_ctg_cd,
				$bd_bp_cd,
				$bd_oper_cd,
				$bd_loc_cd,
				$bd_slo_no,
				$bd_po_no,
				$bd_iv_no,
				$bd_wg_cd,
				$dlv_cd,
				$tdlv_cd,
				$acst_cd,
				$cst_cd,
				$dest_cd1,
				$dest_cd2,
				$dest_cd3,
				$asppl_cd,
				$sppl_cd,
				$spot_flg,
				$sttl_schd_dt,
				$sttl_cd,
				$cst_itm_cd,
				$cst_itm_nm,
				$sppl_itm_cd,
				$sppl_itm_nm,
				$purc_typ,
				$itm_mfg_inst_no,
				$itm_inst_qty,
				$mfg_inst_no,
				$mfg_act_no,
				$mfg_st_qty,
				$oper_act_no,
				$yield_rate,
				$disp_seq,
				$oper_cd,
				$inpt_loc_cd,
				$inpt_str_ln_cd,
				$strg_loc_cd,
				$strg_str_ln_cd,
				$par_itm_cd,
				$par_itm_sub1,
				$par_itm_sub2,
				$par_itm_sub3,
				$par_itm_nm,
				$par_lot_no,
				$par_sublot_no,
				$par_sno1,
				$par_sno2,
				$par_sno3,
				$par_sno4,
				$stktk_diff_qty,
				$pack_xfr_unit_cd,
				$pack_xfr_qty,
				$mfg_inst_unit_typ,
				$via_dlv_typ,
				$arr_ptn_typ,
				$yield_typ,
				$prov_typ,
				$purc_id_typ,
				$io_typ,
				$accpt_dfct_flg,
				$par_slip_io_act_typ,
				$no_gi_alloc_flg,
				$acxfr_stk_id_typ,
				$acxfr_stk_bp_cd,
				$acxfr_stk_arrv_bp_cd,
				$trd_rmrks,
				$trd_d_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$sub_char4,
				$sub_char5,
				$sub_char6,
				$sub_char7,
				$sub_char8,
				$sub_char9,
				$sub_char10,
				$sub_num1,
				$sub_num2,
				$sub_num3,
				$sub_dt1,
				$sub_dt2,
				$sub_dt3,
				$rsn_cd2
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
	protected IoAct_Ins01_DtlR_MC_A(ConstMetaList<? extends IoAct_Ins01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IoAct_Ins01_DtlR clone() {
		return (IoAct_Ins01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IoAct_Ins01_DtlR createInstance() {
		return (IoAct_Ins01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IoAct_Ins01_DtlR getValues(String... names) {
		return (IoAct_Ins01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MSW_IO_ACT_R wia(){
		return (mcframe.serverMS.dbc.MSW_IO_ACT_R) getConstInnerRow(offset + 0, $wia);
	}
	
	public void wia(mcframe.serverMS.dbc.MSW_IO_ACT_R row){
		setConstInnerRow(offset + 0, $wia, row);
	}






	public MCRow getInnerRow(String name) {
		if ($wia.equalsIgnoreCase(name)) {
			return wia();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($wia.equalsIgnoreCase(name)) {
			wia(
				((MCContainerMeta) wia_META).castInnerRow(mcframe.serverMS.dbc.MSW_IO_ACT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return wia().data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		wia().data_crud_typ(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return wia().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		wia().ac_dt(value);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return wia().can_ac_dt();
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		wia().can_ac_dt(value);
	}

	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public MCDate act_tm() {
		return wia().act_tm();
	}

	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public void act_tm(MCDate value) {
		wia().act_tm(value);
	}

	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public String act_no() {
		return wia().act_no();
	}

	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public void act_no(String value) {
		wia().act_no(value);
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public MCNumber act_seq() {
		return wia().act_seq();
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public void act_seq(MCNumber value) {
		wia().act_seq(value);
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public void act_seq(int value) {
		wia().act_seq(value);
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public void act_seq(long value) {
		wia().act_seq(value);
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public void act_seq(float value) {
		wia().act_seq(value);
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public void act_seq(double value) {
		wia().act_seq(value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public MCNumber act_rev_no() {
		return wia().act_rev_no();
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev_no(MCNumber value) {
		wia().act_rev_no(value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev_no(int value) {
		wia().act_rev_no(value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev_no(long value) {
		wia().act_rev_no(value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev_no(float value) {
		wia().act_rev_no(value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev_no(double value) {
		wia().act_rev_no(value);
	}

	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public String act_d_no() {
		return wia().act_d_no();
	}

	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public void act_d_no(String value) {
		wia().act_d_no(value);
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public MCNumber act_d_seq() {
		return wia().act_d_seq();
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public void act_d_seq(MCNumber value) {
		wia().act_d_seq(value);
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public void act_d_seq(int value) {
		wia().act_d_seq(value);
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public void act_d_seq(long value) {
		wia().act_d_seq(value);
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public void act_d_seq(float value) {
		wia().act_d_seq(value);
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public void act_d_seq(double value) {
		wia().act_d_seq(value);
	}

	/**
	 * Result GR/GI No. 実績受払ＮＯ.<p>
	 *
	 */
	public String act_io_no() {
		return wia().act_io_no();
	}

	/**
	 * Result GR/GI No. 実績受払ＮＯ.<p>
	 *
	 */
	public void act_io_no(String value) {
		wia().act_io_no(value);
	}

	/**
	 * Result GR/GI sequence number 実績受払連番.<p>
	 *
	 */
	public MCNumber act_io_seq() {
		return wia().act_io_seq();
	}

	/**
	 * Result GR/GI sequence number 実績受払連番.<p>
	 *
	 */
	public void act_io_seq(MCNumber value) {
		wia().act_io_seq(value);
	}

	/**
	 * Result GR/GI sequence number 実績受払連番.<p>
	 *
	 */
	public void act_io_seq(int value) {
		wia().act_io_seq(value);
	}

	/**
	 * Result GR/GI sequence number 実績受払連番.<p>
	 *
	 */
	public void act_io_seq(long value) {
		wia().act_io_seq(value);
	}

	/**
	 * Result GR/GI sequence number 実績受払連番.<p>
	 *
	 */
	public void act_io_seq(float value) {
		wia().act_io_seq(value);
	}

	/**
	 * Result GR/GI sequence number 実績受払連番.<p>
	 *
	 */
	public void act_io_seq(double value) {
		wia().act_io_seq(value);
	}

	/**
	 * Amount unfirm 金額未確定.<p>
	 *
	 */
	public boolean un_fix_flg() {
		return wia().un_fix_flg();
	}

	/**
	 * Amount unfirm 金額未確定.<p>
	 *
	 */
	public void un_fix_flg(boolean value) {
		wia().un_fix_flg(value);
	}

	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public boolean temp_ap_flg() {
		return wia().temp_ap_flg();
	}

	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public void temp_ap_flg(boolean value) {
		wia().temp_ap_flg(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return wia().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		wia().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return wia().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		wia().trd_ptn_typ(value);
	}

	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public String trn_typ() {
		return wia().trn_typ();
	}

	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public void trn_typ(String value) {
		wia().trn_typ(value);
	}

	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public String io_act_typ() {
		return wia().io_act_typ();
	}

	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public void io_act_typ(String value) {
		wia().io_act_typ(value);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return wia().rsn_cd();
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		wia().rsn_cd(value);
	}

	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gi_wg_cd() {
		return wia().gi_wg_cd();
	}

	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gi_wg_cd(String value) {
		wia().gi_wg_cd(value);
	}

	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gr_wg_cd() {
		return wia().gr_wg_cd();
	}

	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gr_wg_cd(String value) {
		wia().gr_wg_cd(value);
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return wia().act_dpt_cd();
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		wia().act_dpt_cd(value);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return wia().purc_dpt_cd();
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		wia().purc_dpt_cd(value);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return wia().ap_dpt_cd();
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		wia().ap_dpt_cd(value);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return wia().sls_dpt_cd();
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		wia().sls_dpt_cd(value);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return wia().ar_dpt_cd();
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		wia().ar_dpt_cd(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return wia().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		wia().bd_dpt_cd(value);
	}

	/**
	 * Spare dept. cd. 1 予備部門ＣＤ１.<p>
	 *
	 */
	public String sub_dpt_cd1() {
		return wia().sub_dpt_cd1();
	}

	/**
	 * Spare dept. cd. 1 予備部門ＣＤ１.<p>
	 *
	 */
	public void sub_dpt_cd1(String value) {
		wia().sub_dpt_cd1(value);
	}

	/**
	 * Spare dept. cd. 2 予備部門ＣＤ２.<p>
	 *
	 */
	public String sub_dpt_cd2() {
		return wia().sub_dpt_cd2();
	}

	/**
	 * Spare dept. cd. 2 予備部門ＣＤ２.<p>
	 *
	 */
	public void sub_dpt_cd2(String value) {
		wia().sub_dpt_cd2(value);
	}

	/**
	 * Spare dept. cd. 3 予備部門ＣＤ３.<p>
	 *
	 */
	public String sub_dpt_cd3() {
		return wia().sub_dpt_cd3();
	}

	/**
	 * Spare dept. cd. 3 予備部門ＣＤ３.<p>
	 *
	 */
	public void sub_dpt_cd3(String value) {
		wia().sub_dpt_cd3(value);
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return wia().act_usr_cd();
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		wia().act_usr_cd(value);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return wia().sls_usr_cd();
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		wia().sls_usr_cd(value);
	}

	/**
	 * Mfg. PIC cd. 製造担当者ＣＤ.<p>
	 *
	 */
	public String mfg_usr_cd() {
		return wia().mfg_usr_cd();
	}

	/**
	 * Mfg. PIC cd. 製造担当者ＣＤ.<p>
	 *
	 */
	public void mfg_usr_cd(String value) {
		wia().mfg_usr_cd(value);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return wia().purc_usr_cd();
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		wia().purc_usr_cd(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return wia().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		wia().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return wia().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		wia().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return wia().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		wia().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return wia().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		wia().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return wia().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		wia().itm_nm(value);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return wia().stk_mng_typ();
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		wia().stk_mng_typ(value);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return wia().sundry_itm_flg();
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		wia().sundry_itm_flg(value);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return wia().gi_loc_cd();
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		wia().gi_loc_cd(value);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return wia().gi_str_ln_cd();
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		wia().gi_str_ln_cd(value);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return wia().gr_loc_cd();
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		wia().gr_loc_cd(value);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return wia().gr_str_ln_cd();
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		wia().gr_str_ln_cd(value);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return wia().stk_arrv_bp_cd();
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		wia().stk_arrv_bp_cd(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return wia().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		wia().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return wia().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		wia().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return wia().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		wia().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return wia().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		wia().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return wia().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		wia().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return wia().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		wia().sno4(value);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return wia().sno1_mng_typ();
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		wia().sno1_mng_typ(value);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return wia().sno2_mng_typ();
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		wia().sno2_mng_typ(value);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return wia().sno3_mng_typ();
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		wia().sno3_mng_typ(value);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return wia().sno4_mng_typ();
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		wia().sno4_mng_typ(value);
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public String fix_no_typ() {
		return wia().fix_no_typ();
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public void fix_no_typ(String value) {
		wia().fix_no_typ(value);
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public String fix_no() {
		return wia().fix_no();
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public void fix_no(String value) {
		wia().fix_no(value);
	}

	/**
	 * GI grading cd. 出庫格付ＣＤ.<p>
	 *
	 */
	public String gi_gd_cd() {
		return wia().gi_gd_cd();
	}

	/**
	 * GI grading cd. 出庫格付ＣＤ.<p>
	 *
	 */
	public void gi_gd_cd(String value) {
		wia().gi_gd_cd(value);
	}

	/**
	 * GR grading cd. 入庫格付ＣＤ.<p>
	 *
	 */
	public String gr_gd_cd() {
		return wia().gr_gd_cd();
	}

	/**
	 * GR grading cd. 入庫格付ＣＤ.<p>
	 *
	 */
	public void gr_gd_cd(String value) {
		wia().gr_gd_cd(value);
	}

	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public String in_xfr_typ() {
		return wia().in_xfr_typ();
	}

	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public void in_xfr_typ(String value) {
		wia().in_xfr_typ(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return wia().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		wia().quality_typ(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return wia().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		wia().stk_insp_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return wia().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		wia().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return wia().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		wia().stk_bp_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return wia().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		wia().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		wia().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		wia().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		wia().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		wia().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return wia().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		wia().trd_unit_cd(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return wia().pack_unit_qty();
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		wia().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		wia().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		wia().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		wia().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		wia().pack_unit_qty(value);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return wia().pack_unit_cd();
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		wia().pack_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return wia().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		wia().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		wia().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		wia().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		wia().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		wia().base_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return wia().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		wia().base_unit_cd(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return wia().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		wia().trd_cur_cd(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return wia().trd_cur_upri();
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		wia().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		wia().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		wia().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		wia().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		wia().trd_cur_upri(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return wia().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		wia().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		wia().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		wia().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		wia().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		wia().trd_cur_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return wia().trd_cur_proc_amt();
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		wia().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		wia().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		wia().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		wia().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		wia().trd_cur_proc_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return wia().trd_cur_onr_prov_amt();
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		wia().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		wia().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		wia().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		wia().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		wia().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return wia().trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		wia().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		wia().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		wia().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		wia().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		wia().trd_cur_tax_amt(value);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return wia().base_cur_cd();
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		wia().base_cur_cd(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return wia().base_cur_upri();
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		wia().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		wia().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		wia().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		wia().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		wia().base_cur_upri(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return wia().base_cur_amt();
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		wia().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		wia().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		wia().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		wia().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		wia().base_cur_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public MCNumber base_cur_proc_amt() {
		return wia().base_cur_proc_amt();
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(MCNumber value) {
		wia().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(int value) {
		wia().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(long value) {
		wia().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(float value) {
		wia().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(double value) {
		wia().base_cur_proc_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_amt() {
		return wia().base_cur_onr_prov_amt();
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(MCNumber value) {
		wia().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(int value) {
		wia().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(long value) {
		wia().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(float value) {
		wia().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(double value) {
		wia().base_cur_onr_prov_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return wia().base_cur_tax_amt();
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		wia().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		wia().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		wia().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		wia().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		wia().base_cur_tax_amt(value);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return wia().ptax_cur_cd();
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		wia().ptax_cur_cd(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public MCNumber ptax_cur_upri() {
		return wia().ptax_cur_upri();
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(MCNumber value) {
		wia().ptax_cur_upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(int value) {
		wia().ptax_cur_upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(long value) {
		wia().ptax_cur_upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(float value) {
		wia().ptax_cur_upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(double value) {
		wia().ptax_cur_upri(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return wia().ptax_cur_amt();
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		wia().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		wia().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		wia().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		wia().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		wia().ptax_cur_amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public MCNumber ptax_cur_proc_amt() {
		return wia().ptax_cur_proc_amt();
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(MCNumber value) {
		wia().ptax_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(int value) {
		wia().ptax_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(long value) {
		wia().ptax_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(float value) {
		wia().ptax_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(double value) {
		wia().ptax_cur_proc_amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public MCNumber ptax_cur_onr_prov_amt() {
		return wia().ptax_cur_onr_prov_amt();
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(MCNumber value) {
		wia().ptax_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(int value) {
		wia().ptax_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(long value) {
		wia().ptax_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(float value) {
		wia().ptax_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(double value) {
		wia().ptax_cur_onr_prov_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public MCNumber ptax_cur_tax_amt() {
		return wia().ptax_cur_tax_amt();
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(MCNumber value) {
		wia().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(int value) {
		wia().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(long value) {
		wia().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(float value) {
		wia().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(double value) {
		wia().ptax_cur_tax_amt(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return wia().wtax_rate();
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		wia().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		wia().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		wia().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		wia().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		wia().wtax_rate(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return wia().wtax_amt();
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		wia().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		wia().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		wia().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		wia().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		wia().wtax_amt(value);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return wia().tax_cd();
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		wia().tax_cd(value);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return wia().xrate_cd();
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		wia().xrate_cd(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return wia().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		wia().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		wia().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		wia().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		wia().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		wia().xrate(value);
	}

	/**
	 * Taxpaying exchange rate cd. 納税為替レートＣＤ.<p>
	 *
	 */
	public String ptax_xrate_cd() {
		return wia().ptax_xrate_cd();
	}

	/**
	 * Taxpaying exchange rate cd. 納税為替レートＣＤ.<p>
	 *
	 */
	public void ptax_xrate_cd(String value) {
		wia().ptax_xrate_cd(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return wia().ptax_xrate();
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		wia().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		wia().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		wia().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		wia().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		wia().ptax_xrate(value);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return wia().slo_no();
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		wia().slo_no(value);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return wia().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		wia().po_no(value);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return wia().iv_no();
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		wia().iv_no(value);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return wia().rcpt_iv_no();
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		wia().rcpt_iv_no(value);
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public String bd_ctg_cd() {
		return wia().bd_ctg_cd();
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public void bd_ctg_cd(String value) {
		wia().bd_ctg_cd(value);
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public String bd_bp_cd() {
		return wia().bd_bp_cd();
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public void bd_bp_cd(String value) {
		wia().bd_bp_cd(value);
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public String bd_oper_cd() {
		return wia().bd_oper_cd();
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public void bd_oper_cd(String value) {
		wia().bd_oper_cd(value);
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public String bd_loc_cd() {
		return wia().bd_loc_cd();
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public void bd_loc_cd(String value) {
		wia().bd_loc_cd(value);
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public String bd_slo_no() {
		return wia().bd_slo_no();
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public void bd_slo_no(String value) {
		wia().bd_slo_no(value);
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public String bd_po_no() {
		return wia().bd_po_no();
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public void bd_po_no(String value) {
		wia().bd_po_no(value);
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public String bd_iv_no() {
		return wia().bd_iv_no();
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public void bd_iv_no(String value) {
		wia().bd_iv_no(value);
	}

	/**
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public String bd_wg_cd() {
		return wia().bd_wg_cd();
	}

	/**
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public void bd_wg_cd(String value) {
		wia().bd_wg_cd(value);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return wia().dlv_cd();
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		wia().dlv_cd(value);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return wia().tdlv_cd();
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		wia().tdlv_cd(value);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return wia().acst_cd();
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		wia().acst_cd(value);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return wia().cst_cd();
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		wia().cst_cd(value);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return wia().dest_cd1();
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		wia().dest_cd1(value);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return wia().dest_cd2();
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		wia().dest_cd2(value);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return wia().dest_cd3();
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		wia().dest_cd3(value);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return wia().asppl_cd();
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		wia().asppl_cd(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return wia().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		wia().sppl_cd(value);
	}

	/**
	 * Settlement per transaction 都度精算.<p>
	 *
	 */
	public boolean spot_flg() {
		return wia().spot_flg();
	}

	/**
	 * Settlement per transaction 都度精算.<p>
	 *
	 */
	public void spot_flg(boolean value) {
		wia().spot_flg(value);
	}

	/**
	 * Scheduled settlement date 決済予定日.<p>
	 *
	 */
	public MCDate sttl_schd_dt() {
		return wia().sttl_schd_dt();
	}

	/**
	 * Scheduled settlement date 決済予定日.<p>
	 *
	 */
	public void sttl_schd_dt(MCDate value) {
		wia().sttl_schd_dt(value);
	}

	/**
	 * Settlement method cd. 決済方法ＣＤ.<p>
	 *
	 */
	public String sttl_cd() {
		return wia().sttl_cd();
	}

	/**
	 * Settlement method cd. 決済方法ＣＤ.<p>
	 *
	 */
	public void sttl_cd(String value) {
		wia().sttl_cd(value);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return wia().cst_itm_cd();
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		wia().cst_itm_cd(value);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return wia().cst_itm_nm();
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		wia().cst_itm_nm(value);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return wia().sppl_itm_cd();
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		wia().sppl_itm_cd(value);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return wia().sppl_itm_nm();
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		wia().sppl_itm_nm(value);
	}

	/**
	 * Purchase type 購買区分.<p>
	 *
	 */
	public String purc_typ() {
		return wia().purc_typ();
	}

	/**
	 * Purchase type 購買区分.<p>
	 *
	 */
	public void purc_typ(String value) {
		wia().purc_typ(value);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return wia().itm_mfg_inst_no();
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		wia().itm_mfg_inst_no(value);
	}

	/**
	 * Item order qty. 品目指図数量.<p>
	 *
	 */
	public MCNumber itm_inst_qty() {
		return wia().itm_inst_qty();
	}

	/**
	 * Item order qty. 品目指図数量.<p>
	 *
	 */
	public void itm_inst_qty(MCNumber value) {
		wia().itm_inst_qty(value);
	}

	/**
	 * Item order qty. 品目指図数量.<p>
	 *
	 */
	public void itm_inst_qty(int value) {
		wia().itm_inst_qty(value);
	}

	/**
	 * Item order qty. 品目指図数量.<p>
	 *
	 */
	public void itm_inst_qty(long value) {
		wia().itm_inst_qty(value);
	}

	/**
	 * Item order qty. 品目指図数量.<p>
	 *
	 */
	public void itm_inst_qty(float value) {
		wia().itm_inst_qty(value);
	}

	/**
	 * Item order qty. 品目指図数量.<p>
	 *
	 */
	public void itm_inst_qty(double value) {
		wia().itm_inst_qty(value);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return wia().mfg_inst_no();
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		wia().mfg_inst_no(value);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return wia().mfg_act_no();
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		wia().mfg_act_no(value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public MCNumber mfg_st_qty() {
		return wia().mfg_st_qty();
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(MCNumber value) {
		wia().mfg_st_qty(value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(int value) {
		wia().mfg_st_qty(value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(long value) {
		wia().mfg_st_qty(value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(float value) {
		wia().mfg_st_qty(value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(double value) {
		wia().mfg_st_qty(value);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return wia().oper_act_no();
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		wia().oper_act_no(value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public MCNumber yield_rate() {
		return wia().yield_rate();
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(MCNumber value) {
		wia().yield_rate(value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(int value) {
		wia().yield_rate(value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(long value) {
		wia().yield_rate(value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(float value) {
		wia().yield_rate(value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(double value) {
		wia().yield_rate(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return wia().disp_seq();
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		wia().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		wia().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		wia().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		wia().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		wia().disp_seq(value);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return wia().oper_cd();
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		wia().oper_cd(value);
	}

	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public String inpt_loc_cd() {
		return wia().inpt_loc_cd();
	}

	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public void inpt_loc_cd(String value) {
		wia().inpt_loc_cd(value);
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public String inpt_str_ln_cd() {
		return wia().inpt_str_ln_cd();
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public void inpt_str_ln_cd(String value) {
		wia().inpt_str_ln_cd(value);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return wia().strg_loc_cd();
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		wia().strg_loc_cd(value);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return wia().strg_str_ln_cd();
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		wia().strg_str_ln_cd(value);
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return wia().par_itm_cd();
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		wia().par_itm_cd(value);
	}

	/**
	 * Parent item branch No. 1 親品目枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return wia().par_itm_sub1();
	}

	/**
	 * Parent item branch No. 1 親品目枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		wia().par_itm_sub1(value);
	}

	/**
	 * Parent item branch No. 2 親品目枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return wia().par_itm_sub2();
	}

	/**
	 * Parent item branch No. 2 親品目枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		wia().par_itm_sub2(value);
	}

	/**
	 * Parent item branch No. 3 親品目枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return wia().par_itm_sub3();
	}

	/**
	 * Parent item branch No. 3 親品目枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		wia().par_itm_sub3(value);
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return wia().par_itm_nm();
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		wia().par_itm_nm(value);
	}

	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public String par_lot_no() {
		return wia().par_lot_no();
	}

	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public void par_lot_no(String value) {
		wia().par_lot_no(value);
	}

	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public String par_sublot_no() {
		return wia().par_sublot_no();
	}

	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public void par_sublot_no(String value) {
		wia().par_sublot_no(value);
	}

	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public String par_sno1() {
		return wia().par_sno1();
	}

	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public void par_sno1(String value) {
		wia().par_sno1(value);
	}

	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public String par_sno2() {
		return wia().par_sno2();
	}

	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public void par_sno2(String value) {
		wia().par_sno2(value);
	}

	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public String par_sno3() {
		return wia().par_sno3();
	}

	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public void par_sno3(String value) {
		wia().par_sno3(value);
	}

	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public String par_sno4() {
		return wia().par_sno4();
	}

	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public void par_sno4(String value) {
		wia().par_sno4(value);
	}

	/**
	 * Inventory variance qty. 棚差数.<p>
	 *
	 */
	public MCNumber stktk_diff_qty() {
		return wia().stktk_diff_qty();
	}

	/**
	 * Inventory variance qty. 棚差数.<p>
	 *
	 */
	public void stktk_diff_qty(MCNumber value) {
		wia().stktk_diff_qty(value);
	}

	/**
	 * Inventory variance qty. 棚差数.<p>
	 *
	 */
	public void stktk_diff_qty(int value) {
		wia().stktk_diff_qty(value);
	}

	/**
	 * Inventory variance qty. 棚差数.<p>
	 *
	 */
	public void stktk_diff_qty(long value) {
		wia().stktk_diff_qty(value);
	}

	/**
	 * Inventory variance qty. 棚差数.<p>
	 *
	 */
	public void stktk_diff_qty(float value) {
		wia().stktk_diff_qty(value);
	}

	/**
	 * Inventory variance qty. 棚差数.<p>
	 *
	 */
	public void stktk_diff_qty(double value) {
		wia().stktk_diff_qty(value);
	}

	/**
	 * SKU transfer unit cd. 荷姿振替単位CD.<p>
	 *
	 */
	public String pack_xfr_unit_cd() {
		return wia().pack_xfr_unit_cd();
	}

	/**
	 * SKU transfer unit cd. 荷姿振替単位CD.<p>
	 *
	 */
	public void pack_xfr_unit_cd(String value) {
		wia().pack_xfr_unit_cd(value);
	}

	/**
	 * SKU transfer qty. 荷姿振替数量.<p>
	 *
	 */
	public MCNumber pack_xfr_qty() {
		return wia().pack_xfr_qty();
	}

	/**
	 * SKU transfer qty. 荷姿振替数量.<p>
	 *
	 */
	public void pack_xfr_qty(MCNumber value) {
		wia().pack_xfr_qty(value);
	}

	/**
	 * SKU transfer qty. 荷姿振替数量.<p>
	 *
	 */
	public void pack_xfr_qty(int value) {
		wia().pack_xfr_qty(value);
	}

	/**
	 * SKU transfer qty. 荷姿振替数量.<p>
	 *
	 */
	public void pack_xfr_qty(long value) {
		wia().pack_xfr_qty(value);
	}

	/**
	 * SKU transfer qty. 荷姿振替数量.<p>
	 *
	 */
	public void pack_xfr_qty(float value) {
		wia().pack_xfr_qty(value);
	}

	/**
	 * SKU transfer qty. 荷姿振替数量.<p>
	 *
	 */
	public void pack_xfr_qty(double value) {
		wia().pack_xfr_qty(value);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return wia().mfg_inst_unit_typ();
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		wia().mfg_inst_unit_typ(value);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return wia().via_dlv_typ();
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		wia().via_dlv_typ(value);
	}

	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public String arr_ptn_typ() {
		return wia().arr_ptn_typ();
	}

	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public void arr_ptn_typ(String value) {
		wia().arr_ptn_typ(value);
	}

	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public String yield_typ() {
		return wia().yield_typ();
	}

	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public void yield_typ(String value) {
		wia().yield_typ(value);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return wia().prov_typ();
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		wia().prov_typ(value);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return wia().purc_id_typ();
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		wia().purc_id_typ(value);
	}

	/**
	 * GR/GI type 入出庫区分.<p>
	 *
	 */
	public String io_typ() {
		return wia().io_typ();
	}

	/**
	 * GR/GI type 入出庫区分.<p>
	 *
	 */
	public void io_typ(String value) {
		wia().io_typ(value);
	}

	/**
	 * Defective acceptance 検収不良.<p>
	 *
	 */
	public boolean accpt_dfct_flg() {
		return wia().accpt_dfct_flg();
	}

	/**
	 * Defective acceptance 検収不良.<p>
	 *
	 */
	public void accpt_dfct_flg(boolean value) {
		wia().accpt_dfct_flg(value);
	}

	/**
	 * Parent slip GR/GI type 親伝票受払区分.<p>
	 *
	 */
	public String par_slip_io_act_typ() {
		return wia().par_slip_io_act_typ();
	}

	/**
	 * Parent slip GR/GI type 親伝票受払区分.<p>
	 *
	 */
	public void par_slip_io_act_typ(String value) {
		wia().par_slip_io_act_typ(value);
	}

	/**
	 * Not for GI allocation confirmation 出庫引当確認対象外.<p>
	 *
	 */
	public boolean no_gi_alloc_flg() {
		return wia().no_gi_alloc_flg();
	}

	/**
	 * Not for GI allocation confirmation 出庫引当確認対象外.<p>
	 *
	 */
	public void no_gi_alloc_flg(boolean value) {
		wia().no_gi_alloc_flg(value);
	}

	/**
	 * Other accounting transfer inventory identification type 他勘定振替在庫識別区分.<p>
	 *
	 */
	public String acxfr_stk_id_typ() {
		return wia().acxfr_stk_id_typ();
	}

	/**
	 * Other accounting transfer inventory identification type 他勘定振替在庫識別区分.<p>
	 *
	 */
	public void acxfr_stk_id_typ(String value) {
		wia().acxfr_stk_id_typ(value);
	}

	/**
	 * Other accounting transfer inventory BP cd. 他勘定振替在庫取引先ＣＤ.<p>
	 *
	 */
	public String acxfr_stk_bp_cd() {
		return wia().acxfr_stk_bp_cd();
	}

	/**
	 * Other accounting transfer inventory BP cd. 他勘定振替在庫取引先ＣＤ.<p>
	 *
	 */
	public void acxfr_stk_bp_cd(String value) {
		wia().acxfr_stk_bp_cd(value);
	}

	/**
	 * Other accounting transfer inventory arriving point cd. 他勘定振替在庫着荷先ＣＤ.<p>
	 *
	 */
	public String acxfr_stk_arrv_bp_cd() {
		return wia().acxfr_stk_arrv_bp_cd();
	}

	/**
	 * Other accounting transfer inventory arriving point cd. 他勘定振替在庫着荷先ＣＤ.<p>
	 *
	 */
	public void acxfr_stk_arrv_bp_cd(String value) {
		wia().acxfr_stk_arrv_bp_cd(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return wia().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		wia().trd_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return wia().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		wia().trd_d_rmrks(value);
	}

	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String sub_char1() {
		return wia().sub_char1();
	}

	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void sub_char1(String value) {
		wia().sub_char1(value);
	}

	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String sub_char2() {
		return wia().sub_char2();
	}

	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void sub_char2(String value) {
		wia().sub_char2(value);
	}

	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String sub_char3() {
		return wia().sub_char3();
	}

	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void sub_char3(String value) {
		wia().sub_char3(value);
	}

	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String sub_char4() {
		return wia().sub_char4();
	}

	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void sub_char4(String value) {
		wia().sub_char4(value);
	}

	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String sub_char5() {
		return wia().sub_char5();
	}

	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void sub_char5(String value) {
		wia().sub_char5(value);
	}

	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String sub_char6() {
		return wia().sub_char6();
	}

	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void sub_char6(String value) {
		wia().sub_char6(value);
	}

	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String sub_char7() {
		return wia().sub_char7();
	}

	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void sub_char7(String value) {
		wia().sub_char7(value);
	}

	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String sub_char8() {
		return wia().sub_char8();
	}

	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void sub_char8(String value) {
		wia().sub_char8(value);
	}

	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String sub_char9() {
		return wia().sub_char9();
	}

	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void sub_char9(String value) {
		wia().sub_char9(value);
	}

	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String sub_char10() {
		return wia().sub_char10();
	}

	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void sub_char10(String value) {
		wia().sub_char10(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return wia().sub_num1();
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		wia().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(int value) {
		wia().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(long value) {
		wia().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(float value) {
		wia().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(double value) {
		wia().sub_num1(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return wia().sub_num2();
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		wia().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(int value) {
		wia().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(long value) {
		wia().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(float value) {
		wia().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(double value) {
		wia().sub_num2(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return wia().sub_num3();
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		wia().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(int value) {
		wia().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(long value) {
		wia().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(float value) {
		wia().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(double value) {
		wia().sub_num3(value);
	}

	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return wia().sub_dt1();
	}

	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		wia().sub_dt1(value);
	}

	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return wia().sub_dt2();
	}

	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		wia().sub_dt2(value);
	}

	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return wia().sub_dt3();
	}

	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		wia().sub_dt3(value);
	}

	/**
	 * Reason cd. 2 理由ＣＤ２.<p>
	 *
	 */
	public String rsn_cd2() {
		return wia().rsn_cd2();
	}

	/**
	 * Reason cd. 2 理由ＣＤ２.<p>
	 *
	 */
	public void rsn_cd2(String value) {
		wia().rsn_cd2(value);
	}

}

