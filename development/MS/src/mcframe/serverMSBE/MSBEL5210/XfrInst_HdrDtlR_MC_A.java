package mcframe.serverMSBE.MSBEL5210;

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
 * ブロック"XfrInst_HdrDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class XfrInst_HdrDtlR_MC_A extends MCConstRow {

	public static final String $hdr = "hdr";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Return-from supplier cd. 返品元発注先ＣＤ.<p>
	 *
	 */
	public static final String $ret_sppl_cd = "ret_sppl_cd";
	public static final String $dtl = "dtl";

	public static final String $err_flg = $hdr + ".err_flg";
	public static final String $hdr_peg_no = $hdr + ".hdr_peg_no";
	public static final String $hdr_data_crud_typ = $hdr + ".hdr_data_crud_typ";
	public static final String $xfr_inst_no = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$xfr_inst_no + "";
	public static final String $trd_cd = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$trd_cd + "";
	public static final String $trd_ptn_typ = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$trd_ptn_typ + "";
	public static final String $wg_cd = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$wg_cd + "";
	public static final String $lg_grp_cd = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$lg_grp_cd + "";
	public static final String $gr_loc_cd = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$gr_loc_cd + "";
	public static final String $gr_stk_arrv_bp_cd = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$gr_stk_arrv_bp_cd + "";
	public static final String $xfr_schd_dt = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$xfr_schd_dt + "";
	public static final String $xfr_inst_dt = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$xfr_inst_dt + "";
	public static final String $inst_usr_cd = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$inst_usr_cd + "";
	public static final String $inst_dpt_cd = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$inst_dpt_cd + "";
	public static final String $inst_prnt_flg = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$inst_prnt_flg + "";
	public static final String $inst_prnt_tm = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$inst_prnt_tm + "";
	public static final String $pick_prnt_flg = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$pick_prnt_flg + "";
	public static final String $pick_prnt_tm = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$pick_prnt_tm + "";
	public static final String $dlv_prnt_flg = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$dlv_prnt_flg + "";
	public static final String $dlv_prnt_tm = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$dlv_prnt_tm + "";
	public static final String $trd_rmrks = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$trd_rmrks + "";
	public static final String $inst_rmrks = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$inst_rmrks + "";
	public static final String $intr_rmrks = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$intr_rmrks + "";
	public static final String $sub_char1 = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$sub_char1 + "";
	public static final String $sub_char2 = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$sub_char2 + "";
	public static final String $sub_char3 = $hdr + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.$sub_char3 + "";
	public static final String $immd_inst_prnt_flg = $hdr + ".immd_inst_prnt_flg";
	public static final String $immd_pick_prnt_flg = $hdr + ".immd_pick_prnt_flg";
	public static final String $immd_dlv_prnt_flg = $hdr + ".immd_dlv_prnt_flg";
	public static final String $peg_no = $dtl + ".peg_no";
	public static final String $dtl_hdr_peg_no = $dtl + ".hdr_peg_no";
	public static final String $data_crud_typ = $dtl + ".data_crud_typ";
	public static final String $xfr_inst_d_no = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$xfr_inst_d_no + "";
	public static final String $dtl_xfr_inst_no = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$xfr_inst_no + "";
	public static final String $itm_cd = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$itm_cd + "";
	public static final String $itm_sub1 = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$itm_sub1 + "";
	public static final String $itm_sub2 = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$itm_sub2 + "";
	public static final String $itm_sub3 = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$itm_sub3 + "";
	public static final String $base_dlv_slip_no = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$base_dlv_slip_no + "";
	public static final String $base_prov_act_no = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$base_prov_act_no + "";
	public static final String $base_ac_dt = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$base_ac_dt + "";
	public static final String $pr_sts_typ = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$pr_sts_typ + "";
	public static final String $gi_loc_cd = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$gi_loc_cd + "";
	public static final String $gi_str_ln_cd = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$gi_str_ln_cd + "";
	public static final String $gi_stk_arrv_bp_cd = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$gi_stk_arrv_bp_cd + "";
	public static final String $gr_str_ln_cd = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$gr_str_ln_cd + "";
	public static final String $lot_no = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$lot_no + "";
	public static final String $sublot_no = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sublot_no + "";
	public static final String $sno1 = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno1 + "";
	public static final String $sno2 = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno2 + "";
	public static final String $sno3 = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno3 + "";
	public static final String $sno4 = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno4 + "";
	public static final String $ver_no = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$ver_no + "";
	public static final String $gd_cd = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$gd_cd + "";
	public static final String $quality_typ = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$quality_typ + "";
	public static final String $stk_id_typ = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$stk_id_typ + "";
	public static final String $stk_bp_cd = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$stk_bp_cd + "";
	public static final String $trd_unit_cd = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$trd_unit_cd + "";
	public static final String $trd_unit_qty = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$trd_unit_qty + "";
	public static final String $base_unit_cd = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$base_unit_cd + "";
	public static final String $base_unit_qty = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$base_unit_qty + "";
	public static final String $rsn_cd = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$rsn_cd + "";
	public static final String $bd_dpt_cd = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$bd_dpt_cd + "";
	public static final String $abort_flg = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$abort_flg + "";
	public static final String $not_lot_mix_flg = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$not_lot_mix_flg + "";
	public static final String $not_sublot_mix_flg = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$not_sublot_mix_flg + "";
	public static final String $vld_dt_fr = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$vld_dt_fr + "";
	public static final String $vld_dt_to = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$vld_dt_to + "";
	public static final String $io_schd_pr_no = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$io_schd_pr_no + "";
	public static final String $dtl_sub_char1 = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sub_char1 + "";
	public static final String $dtl_sub_char2 = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sub_char2 + "";
	public static final String $dtl_sub_char3 = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sub_char3 + "";
	public static final String $sno1_null_flg = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno1_null_flg + "";
	public static final String $sno2_null_flg = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno2_null_flg + "";
	public static final String $sno3_null_flg = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno3_null_flg + "";
	public static final String $sno4_null_flg = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$sno4_null_flg + "";
	public static final String $alloc_sno1 = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$alloc_sno1 + "";
	public static final String $alloc_sno2 = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$alloc_sno2 + "";
	public static final String $alloc_sno3 = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$alloc_sno3 + "";
	public static final String $alloc_sno4 = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$alloc_sno4 + "";
	public static final String $alloc_flg = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$alloc_flg + "";
	public static final String $ship_inst_typ = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$ship_inst_typ + "";
	public static final String $inst_bndl_flg = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$inst_bndl_flg + "";
	public static final String $dlv_slip_no = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$dlv_slip_no + "";
	public static final String $dlv_slip_seq = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$dlv_slip_seq + "";
	public static final String $dlv_slip_d_no = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$dlv_slip_d_no + "";
	public static final String $disp_seq = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$disp_seq + "";
	public static final String $xfr_schd_no = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$xfr_schd_no + "";
	public static final String $prov_typ = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$prov_typ + "";
	public static final String $prov_basis_typ = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$prov_basis_typ + "";
	public static final String $ret_prov_typ = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$ret_prov_typ + "";
	public static final String $ret_prov_basis_typ = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$ret_prov_basis_typ + "";
	public static final String $trd_d_rmrks = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$trd_d_rmrks + "";
	public static final String $inst_d_rmrks = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$inst_d_rmrks + "";
	public static final String $intr_d_rmrks = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$intr_d_rmrks + "";
	public static final String $cont_qty = $dtl + ".cont_qty";
	public static final String $inst_rem_abort_flg = $dtl + ".inst_rem_abort_flg";
	public static final String $inst_bndl_src_flg = $dtl + ".inst_bndl_src_flg";
	public static final String $inst_bndl_peg_no = $dtl + ".inst_bndl_peg_no";
	public static final String $inst_bndl_to_peg_no = $dtl + ".inst_bndl_to_peg_no";
	public static final String $xfr_alloc_sts_no = $dtl + ".xfr_alloc_sts_no";
	public static final String $old_xfr_alloc_sts_no = $dtl + ".old_xfr_alloc_sts_no";
	public static final String $prov_schd_no = $dtl + ".prov_schd_no";
	public static final String $ret_prov_schd_no = $dtl + ".ret_prov_schd_no";
	public static final String $wms_flg = $dtl + "." + mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.$wms_flg + "";

	public static final MCMeta hdr_META = createInnerRowMeta($hdr, mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.class);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta ret_sppl_cd_META = createCommonMeta($ret_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dtl_META = createInnerRowMeta($dtl, mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.class);

	protected static final ConstMetaList<XfrInst_HdrDtlR> constMetas = new ConstMetaList<XfrInst_HdrDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_META,
			slo_no_META,
			ret_sppl_cd_META,
			dtl_META
		},
		new String[][]{
			{
				"err_flg",
				"hdr_peg_no",
				"hdr_data_crud_typ",
				"xfr_inst_no",
				"trd_cd",
				"trd_ptn_typ",
				"wg_cd",
				"lg_grp_cd",
				"gr_loc_cd",
				"gr_stk_arrv_bp_cd",
				"xfr_schd_dt",
				"xfr_inst_dt",
				"inst_usr_cd",
				"inst_dpt_cd",
				"inst_prnt_flg",
				"inst_prnt_tm",
				"pick_prnt_flg",
				"pick_prnt_tm",
				"dlv_prnt_flg",
				"dlv_prnt_tm",
				"trd_rmrks",
				"inst_rmrks",
				"intr_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"immd_inst_prnt_flg",
				"immd_pick_prnt_flg",
				"immd_dlv_prnt_flg",
				"peg_no",
				"dtl_hdr_peg_no",
				"data_crud_typ",
				"xfr_inst_d_no",
				"dtl_xfr_inst_no",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"base_dlv_slip_no",
				"base_prov_act_no",
				"base_ac_dt",
				"pr_sts_typ",
				"gi_loc_cd",
				"gi_str_ln_cd",
				"gi_stk_arrv_bp_cd",
				"gr_str_ln_cd",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"ver_no",
				"gd_cd",
				"quality_typ",
				"stk_id_typ",
				"stk_bp_cd",
				"trd_unit_cd",
				"trd_unit_qty",
				"base_unit_cd",
				"base_unit_qty",
				"rsn_cd",
				"bd_dpt_cd",
				"abort_flg",
				"not_lot_mix_flg",
				"not_sublot_mix_flg",
				"vld_dt_fr",
				"vld_dt_to",
				"io_schd_pr_no",
				"dtl_sub_char1",
				"dtl_sub_char2",
				"dtl_sub_char3",
				"sno1_null_flg",
				"sno2_null_flg",
				"sno3_null_flg",
				"sno4_null_flg",
				"alloc_sno1",
				"alloc_sno2",
				"alloc_sno3",
				"alloc_sno4",
				"alloc_flg",
				"ship_inst_typ",
				"inst_bndl_flg",
				"dlv_slip_no",
				"dlv_slip_seq",
				"dlv_slip_d_no",
				"disp_seq",
				"xfr_schd_no",
				"prov_typ",
				"prov_basis_typ",
				"ret_prov_typ",
				"ret_prov_basis_typ",
				"trd_d_rmrks",
				"inst_d_rmrks",
				"intr_d_rmrks",
				"cont_qty",
				"inst_rem_abort_flg",
				"inst_bndl_src_flg",
				"inst_bndl_peg_no",
				"inst_bndl_to_peg_no",
				"xfr_alloc_sts_no",
				"old_xfr_alloc_sts_no",
				"prov_schd_no",
				"ret_prov_schd_no",
				"wms_flg"
			},
			{
				$err_flg,
				$hdr_peg_no,
				$hdr_data_crud_typ,
				$xfr_inst_no,
				$trd_cd,
				$trd_ptn_typ,
				$wg_cd,
				$lg_grp_cd,
				$gr_loc_cd,
				$gr_stk_arrv_bp_cd,
				$xfr_schd_dt,
				$xfr_inst_dt,
				$inst_usr_cd,
				$inst_dpt_cd,
				$inst_prnt_flg,
				$inst_prnt_tm,
				$pick_prnt_flg,
				$pick_prnt_tm,
				$dlv_prnt_flg,
				$dlv_prnt_tm,
				$trd_rmrks,
				$inst_rmrks,
				$intr_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$immd_inst_prnt_flg,
				$immd_pick_prnt_flg,
				$immd_dlv_prnt_flg,
				$peg_no,
				$dtl_hdr_peg_no,
				$data_crud_typ,
				$xfr_inst_d_no,
				$dtl_xfr_inst_no,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$base_dlv_slip_no,
				$base_prov_act_no,
				$base_ac_dt,
				$pr_sts_typ,
				$gi_loc_cd,
				$gi_str_ln_cd,
				$gi_stk_arrv_bp_cd,
				$gr_str_ln_cd,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$ver_no,
				$gd_cd,
				$quality_typ,
				$stk_id_typ,
				$stk_bp_cd,
				$trd_unit_cd,
				$trd_unit_qty,
				$base_unit_cd,
				$base_unit_qty,
				$rsn_cd,
				$bd_dpt_cd,
				$abort_flg,
				$not_lot_mix_flg,
				$not_sublot_mix_flg,
				$vld_dt_fr,
				$vld_dt_to,
				$io_schd_pr_no,
				$dtl_sub_char1,
				$dtl_sub_char2,
				$dtl_sub_char3,
				$sno1_null_flg,
				$sno2_null_flg,
				$sno3_null_flg,
				$sno4_null_flg,
				$alloc_sno1,
				$alloc_sno2,
				$alloc_sno3,
				$alloc_sno4,
				$alloc_flg,
				$ship_inst_typ,
				$inst_bndl_flg,
				$dlv_slip_no,
				$dlv_slip_seq,
				$dlv_slip_d_no,
				$disp_seq,
				$xfr_schd_no,
				$prov_typ,
				$prov_basis_typ,
				$ret_prov_typ,
				$ret_prov_basis_typ,
				$trd_d_rmrks,
				$inst_d_rmrks,
				$intr_d_rmrks,
				$cont_qty,
				$inst_rem_abort_flg,
				$inst_bndl_src_flg,
				$inst_bndl_peg_no,
				$inst_bndl_to_peg_no,
				$xfr_alloc_sts_no,
				$old_xfr_alloc_sts_no,
				$prov_schd_no,
				$ret_prov_schd_no,
				$wms_flg
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
	protected XfrInst_HdrDtlR_MC_A(ConstMetaList<? extends XfrInst_HdrDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrInst_HdrDtlR clone() {
		return (XfrInst_HdrDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrInst_HdrDtlR createInstance() {
		return (XfrInst_HdrDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrInst_HdrDtlR getValues(String... names) {
		return (XfrInst_HdrDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR hdr(){
		return (mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR) getConstInnerRow(offset + 0, $hdr);
	}
	
	public void hdr(mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR row){
		setConstInnerRow(offset + 0, $hdr, row);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 1, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 1, $slo_no, value);
	}


	/**
	 * Return-from supplier cd. 返品元発注先ＣＤ.<p>
	 *
	 */
	public String ret_sppl_cd() {
		return getConstString(offset + 2, $ret_sppl_cd);
	}

	/**
	 * Return-from supplier cd. 返品元発注先ＣＤ.<p>
	 *
	 */
	public void ret_sppl_cd(String value) {
		setConstString(offset + 2, $ret_sppl_cd, value);
	}


	public mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR dtl(){
		return (mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR) getConstInnerRow(offset + 3, $dtl);
	}
	
	public void dtl(mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR row){
		setConstInnerRow(offset + 3, $dtl, row);
	}


	public String getString(String name) {
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($ret_sppl_cd.equalsIgnoreCase(name)) {
			return ret_sppl_cd();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($ret_sppl_cd.equalsIgnoreCase(name)) {
			return ret_sppl_cd();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($ret_sppl_cd.equalsIgnoreCase(name)) {
			ret_sppl_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($ret_sppl_cd.equalsIgnoreCase(name)) {
			ret_sppl_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($hdr.equalsIgnoreCase(name)) {
			return hdr();
		}
		if ($dtl.equalsIgnoreCase(name)) {
			return dtl();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($hdr.equalsIgnoreCase(name)) {
			hdr(
				((MCContainerMeta) hdr_META).castInnerRow(mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.class, value)
			);
			return;
		}
		if ($dtl.equalsIgnoreCase(name)) {
			dtl(
				((MCContainerMeta) dtl_META).castInnerRow(mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return hdr().err_flg();
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		hdr().err_flg(value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return hdr().hdr_peg_no();
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		hdr().hdr_peg_no(value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		hdr().hdr_peg_no(value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		hdr().hdr_peg_no(value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		hdr().hdr_peg_no(value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		hdr().hdr_peg_no(value);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String hdr_data_crud_typ() {
		return hdr().hdr_data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void hdr_data_crud_typ(String value) {
		hdr().hdr_data_crud_typ(value);
	}

	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public String xfr_inst_no() {
		return hdr().xfr_inst_no();
	}

	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public void xfr_inst_no(String value) {
		hdr().xfr_inst_no(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return hdr().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		hdr().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return hdr().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		hdr().trd_ptn_typ(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return hdr().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		hdr().wg_cd(value);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return hdr().lg_grp_cd();
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		hdr().lg_grp_cd(value);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return hdr().gr_loc_cd();
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		hdr().gr_loc_cd(value);
	}

	/**
	 * GR inventory arriving point cd. 入庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gr_stk_arrv_bp_cd() {
		return hdr().gr_stk_arrv_bp_cd();
	}

	/**
	 * GR inventory arriving point cd. 入庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gr_stk_arrv_bp_cd(String value) {
		hdr().gr_stk_arrv_bp_cd(value);
	}

	/**
	 * Scheduled movement date 移動予定日.<p>
	 *
	 */
	public MCDate xfr_schd_dt() {
		return hdr().xfr_schd_dt();
	}

	/**
	 * Scheduled movement date 移動予定日.<p>
	 *
	 */
	public void xfr_schd_dt(MCDate value) {
		hdr().xfr_schd_dt(value);
	}

	/**
	 * Movement order date 移動指図日.<p>
	 *
	 */
	public MCDate xfr_inst_dt() {
		return hdr().xfr_inst_dt();
	}

	/**
	 * Movement order date 移動指図日.<p>
	 *
	 */
	public void xfr_inst_dt(MCDate value) {
		hdr().xfr_inst_dt(value);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return hdr().inst_usr_cd();
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		hdr().inst_usr_cd(value);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return hdr().inst_dpt_cd();
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		hdr().inst_dpt_cd(value);
	}

	/**
	 * Order sheet issued 指図書発行済.<p>
	 *
	 */
	public boolean inst_prnt_flg() {
		return hdr().inst_prnt_flg();
	}

	/**
	 * Order sheet issued 指図書発行済.<p>
	 *
	 */
	public void inst_prnt_flg(boolean value) {
		hdr().inst_prnt_flg(value);
	}

	/**
	 * Order sheet issued date and time 指図書発行日時.<p>
	 *
	 */
	public MCDate inst_prnt_tm() {
		return hdr().inst_prnt_tm();
	}

	/**
	 * Order sheet issued date and time 指図書発行日時.<p>
	 *
	 */
	public void inst_prnt_tm(MCDate value) {
		hdr().inst_prnt_tm(value);
	}

	/**
	 * Picking list issued ピッキングリスト発行済.<p>
	 *
	 */
	public boolean pick_prnt_flg() {
		return hdr().pick_prnt_flg();
	}

	/**
	 * Picking list issued ピッキングリスト発行済.<p>
	 *
	 */
	public void pick_prnt_flg(boolean value) {
		hdr().pick_prnt_flg(value);
	}

	/**
	 * Picking list issue date and time ピッキングリスト発行日時.<p>
	 *
	 */
	public MCDate pick_prnt_tm() {
		return hdr().pick_prnt_tm();
	}

	/**
	 * Picking list issue date and time ピッキングリスト発行日時.<p>
	 *
	 */
	public void pick_prnt_tm(MCDate value) {
		hdr().pick_prnt_tm(value);
	}

	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public boolean dlv_prnt_flg() {
		return hdr().dlv_prnt_flg();
	}

	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public void dlv_prnt_flg(boolean value) {
		hdr().dlv_prnt_flg(value);
	}

	/**
	 * Delivery note issue date and time 納品書発行日時.<p>
	 *
	 */
	public MCDate dlv_prnt_tm() {
		return hdr().dlv_prnt_tm();
	}

	/**
	 * Delivery note issue date and time 納品書発行日時.<p>
	 *
	 */
	public void dlv_prnt_tm(MCDate value) {
		hdr().dlv_prnt_tm(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return hdr().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		hdr().trd_rmrks(value);
	}

	/**
	 * Order remarks 指図備考.<p>
	 *
	 */
	public String inst_rmrks() {
		return hdr().inst_rmrks();
	}

	/**
	 * Order remarks 指図備考.<p>
	 *
	 */
	public void inst_rmrks(String value) {
		hdr().inst_rmrks(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return hdr().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		hdr().intr_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return hdr().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		hdr().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return hdr().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		hdr().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return hdr().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		hdr().sub_char3(value);
	}

	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public boolean immd_inst_prnt_flg() {
		return hdr().immd_inst_prnt_flg();
	}

	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public void immd_inst_prnt_flg(boolean value) {
		hdr().immd_inst_prnt_flg(value);
	}

	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public boolean immd_pick_prnt_flg() {
		return hdr().immd_pick_prnt_flg();
	}

	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public void immd_pick_prnt_flg(boolean value) {
		hdr().immd_pick_prnt_flg(value);
	}

	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public boolean immd_dlv_prnt_flg() {
		return hdr().immd_dlv_prnt_flg();
	}

	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public void immd_dlv_prnt_flg(boolean value) {
		hdr().immd_dlv_prnt_flg(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return dtl().peg_no();
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		dtl().peg_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		dtl().peg_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		dtl().peg_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		dtl().peg_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		dtl().peg_no(value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber dtl_hdr_peg_no() {
		return dtl().hdr_peg_no();
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void dtl_hdr_peg_no(MCNumber value) {
		dtl().hdr_peg_no(value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void dtl_hdr_peg_no(int value) {
		dtl().hdr_peg_no(value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void dtl_hdr_peg_no(long value) {
		dtl().hdr_peg_no(value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void dtl_hdr_peg_no(float value) {
		dtl().hdr_peg_no(value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void dtl_hdr_peg_no(double value) {
		dtl().hdr_peg_no(value);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return dtl().data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		dtl().data_crud_typ(value);
	}

	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public String xfr_inst_d_no() {
		return dtl().xfr_inst_d_no();
	}

	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public void xfr_inst_d_no(String value) {
		dtl().xfr_inst_d_no(value);
	}

	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public String dtl_xfr_inst_no() {
		return dtl().xfr_inst_no();
	}

	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public void dtl_xfr_inst_no(String value) {
		dtl().xfr_inst_no(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return dtl().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		dtl().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return dtl().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		dtl().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return dtl().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		dtl().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return dtl().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		dtl().itm_sub3(value);
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public String base_dlv_slip_no() {
		return dtl().base_dlv_slip_no();
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public void base_dlv_slip_no(String value) {
		dtl().base_dlv_slip_no(value);
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public String base_prov_act_no() {
		return dtl().base_prov_act_no();
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public void base_prov_act_no(String value) {
		dtl().base_prov_act_no(value);
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return dtl().base_ac_dt();
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		dtl().base_ac_dt(value);
	}

	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public String pr_sts_typ() {
		return dtl().pr_sts_typ();
	}

	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public void pr_sts_typ(String value) {
		dtl().pr_sts_typ(value);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return dtl().gi_loc_cd();
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		dtl().gi_loc_cd(value);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return dtl().gi_str_ln_cd();
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		dtl().gi_str_ln_cd(value);
	}

	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gi_stk_arrv_bp_cd() {
		return dtl().gi_stk_arrv_bp_cd();
	}

	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gi_stk_arrv_bp_cd(String value) {
		dtl().gi_stk_arrv_bp_cd(value);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return dtl().gr_str_ln_cd();
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		dtl().gr_str_ln_cd(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return dtl().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		dtl().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return dtl().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		dtl().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return dtl().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		dtl().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return dtl().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		dtl().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return dtl().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		dtl().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return dtl().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		dtl().sno4(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return dtl().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		dtl().ver_no(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return dtl().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		dtl().gd_cd(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return dtl().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		dtl().quality_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return dtl().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		dtl().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return dtl().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		dtl().stk_bp_cd(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return dtl().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		dtl().trd_unit_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return dtl().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		dtl().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		dtl().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		dtl().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		dtl().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		dtl().trd_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return dtl().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		dtl().base_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return dtl().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		dtl().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		dtl().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		dtl().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		dtl().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		dtl().base_unit_qty(value);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return dtl().rsn_cd();
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		dtl().rsn_cd(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return dtl().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		dtl().bd_dpt_cd(value);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return dtl().abort_flg();
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		dtl().abort_flg(value);
	}

	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return dtl().not_lot_mix_flg();
	}

	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		dtl().not_lot_mix_flg(value);
	}

	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return dtl().not_sublot_mix_flg();
	}

	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		dtl().not_sublot_mix_flg(value);
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate vld_dt_fr() {
		return dtl().vld_dt_fr();
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public void vld_dt_fr(MCDate value) {
		dtl().vld_dt_fr(value);
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCDate vld_dt_to() {
		return dtl().vld_dt_to();
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public void vld_dt_to(MCDate value) {
		dtl().vld_dt_to(value);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return dtl().io_schd_pr_no();
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		dtl().io_schd_pr_no(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String dtl_sub_char1() {
		return dtl().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void dtl_sub_char1(String value) {
		dtl().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String dtl_sub_char2() {
		return dtl().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void dtl_sub_char2(String value) {
		dtl().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String dtl_sub_char3() {
		return dtl().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void dtl_sub_char3(String value) {
		dtl().sub_char3(value);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return dtl().sno1_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		dtl().sno1_null_flg(value);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return dtl().sno2_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		dtl().sno2_null_flg(value);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return dtl().sno3_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		dtl().sno3_null_flg(value);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return dtl().sno4_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		dtl().sno4_null_flg(value);
	}

	/**
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public String alloc_sno1() {
		return dtl().alloc_sno1();
	}

	/**
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public void alloc_sno1(String value) {
		dtl().alloc_sno1(value);
	}

	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public String alloc_sno2() {
		return dtl().alloc_sno2();
	}

	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public void alloc_sno2(String value) {
		dtl().alloc_sno2(value);
	}

	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public String alloc_sno3() {
		return dtl().alloc_sno3();
	}

	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public void alloc_sno3(String value) {
		dtl().alloc_sno3(value);
	}

	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public String alloc_sno4() {
		return dtl().alloc_sno4();
	}

	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public void alloc_sno4(String value) {
		dtl().alloc_sno4(value);
	}

	/**
	 * Location allocation 場所引当.<p>
	 *
	 */
	public boolean alloc_flg() {
		return dtl().alloc_flg();
	}

	/**
	 * Location allocation 場所引当.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		dtl().alloc_flg(value);
	}

	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public String ship_inst_typ() {
		return dtl().ship_inst_typ();
	}

	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public void ship_inst_typ(String value) {
		dtl().ship_inst_typ(value);
	}

	/**
	 * Order aggregation 指図まとめ.<p>
	 *
	 */
	public boolean inst_bndl_flg() {
		return dtl().inst_bndl_flg();
	}

	/**
	 * Order aggregation 指図まとめ.<p>
	 *
	 */
	public void inst_bndl_flg(boolean value) {
		dtl().inst_bndl_flg(value);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return dtl().dlv_slip_no();
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		dtl().dlv_slip_no(value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return dtl().dlv_slip_seq();
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		dtl().dlv_slip_seq(value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		dtl().dlv_slip_seq(value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		dtl().dlv_slip_seq(value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		dtl().dlv_slip_seq(value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		dtl().dlv_slip_seq(value);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return dtl().dlv_slip_d_no();
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		dtl().dlv_slip_d_no(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return dtl().disp_seq();
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		dtl().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		dtl().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		dtl().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		dtl().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		dtl().disp_seq(value);
	}

	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public String xfr_schd_no() {
		return dtl().xfr_schd_no();
	}

	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public void xfr_schd_no(String value) {
		dtl().xfr_schd_no(value);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return dtl().prov_typ();
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		dtl().prov_typ(value);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return dtl().prov_basis_typ();
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		dtl().prov_basis_typ(value);
	}

	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public String ret_prov_typ() {
		return dtl().ret_prov_typ();
	}

	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public void ret_prov_typ(String value) {
		dtl().ret_prov_typ(value);
	}

	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public String ret_prov_basis_typ() {
		return dtl().ret_prov_basis_typ();
	}

	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public void ret_prov_basis_typ(String value) {
		dtl().ret_prov_basis_typ(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return dtl().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		dtl().trd_d_rmrks(value);
	}

	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public String inst_d_rmrks() {
		return dtl().inst_d_rmrks();
	}

	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public void inst_d_rmrks(String value) {
		dtl().inst_d_rmrks(value);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return dtl().intr_d_rmrks();
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		dtl().intr_d_rmrks(value);
	}

	/**
	 * Input active ingredient 投入有効成分.<p>
	 *
	 */
	public MCNumber cont_qty() {
		return dtl().cont_qty();
	}

	/**
	 * Input active ingredient 投入有効成分.<p>
	 *
	 */
	public void cont_qty(MCNumber value) {
		dtl().cont_qty(value);
	}

	/**
	 * Input active ingredient 投入有効成分.<p>
	 *
	 */
	public void cont_qty(int value) {
		dtl().cont_qty(value);
	}

	/**
	 * Input active ingredient 投入有効成分.<p>
	 *
	 */
	public void cont_qty(long value) {
		dtl().cont_qty(value);
	}

	/**
	 * Input active ingredient 投入有効成分.<p>
	 *
	 */
	public void cont_qty(float value) {
		dtl().cont_qty(value);
	}

	/**
	 * Input active ingredient 投入有効成分.<p>
	 *
	 */
	public void cont_qty(double value) {
		dtl().cont_qty(value);
	}

	/**
	 * Cancel remaining order qty. flg. 指図残数打切ＦＬＧ.<p>
	 *
	 */
	public boolean inst_rem_abort_flg() {
		return dtl().inst_rem_abort_flg();
	}

	/**
	 * Cancel remaining order qty. flg. 指図残数打切ＦＬＧ.<p>
	 *
	 */
	public void inst_rem_abort_flg(boolean value) {
		dtl().inst_rem_abort_flg(value);
	}

	/**
	 * Order aggregation-from 指図まとめ元.<p>
	 *
	 */
	public boolean inst_bndl_src_flg() {
		return dtl().inst_bndl_src_flg();
	}

	/**
	 * Order aggregation-from 指図まとめ元.<p>
	 *
	 */
	public void inst_bndl_src_flg(boolean value) {
		dtl().inst_bndl_src_flg(value);
	}

	/**
	 * Order aggregation pegging No. 指図まとめ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber inst_bndl_peg_no() {
		return dtl().inst_bndl_peg_no();
	}

	/**
	 * Order aggregation pegging No. 指図まとめ紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_peg_no(MCNumber value) {
		dtl().inst_bndl_peg_no(value);
	}

	/**
	 * Order aggregation pegging No. 指図まとめ紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_peg_no(int value) {
		dtl().inst_bndl_peg_no(value);
	}

	/**
	 * Order aggregation pegging No. 指図まとめ紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_peg_no(long value) {
		dtl().inst_bndl_peg_no(value);
	}

	/**
	 * Order aggregation pegging No. 指図まとめ紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_peg_no(float value) {
		dtl().inst_bndl_peg_no(value);
	}

	/**
	 * Order aggregation pegging No. 指図まとめ紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_peg_no(double value) {
		dtl().inst_bndl_peg_no(value);
	}

	/**
	 * Order aggregation-to pegging No. 指図まとめ先紐付けＮＯ.<p>
	 *
	 */
	public MCNumber inst_bndl_to_peg_no() {
		return dtl().inst_bndl_to_peg_no();
	}

	/**
	 * Order aggregation-to pegging No. 指図まとめ先紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_to_peg_no(MCNumber value) {
		dtl().inst_bndl_to_peg_no(value);
	}

	/**
	 * Order aggregation-to pegging No. 指図まとめ先紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_to_peg_no(int value) {
		dtl().inst_bndl_to_peg_no(value);
	}

	/**
	 * Order aggregation-to pegging No. 指図まとめ先紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_to_peg_no(long value) {
		dtl().inst_bndl_to_peg_no(value);
	}

	/**
	 * Order aggregation-to pegging No. 指図まとめ先紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_to_peg_no(float value) {
		dtl().inst_bndl_to_peg_no(value);
	}

	/**
	 * Order aggregation-to pegging No. 指図まとめ先紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_to_peg_no(double value) {
		dtl().inst_bndl_to_peg_no(value);
	}

	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public String xfr_alloc_sts_no() {
		return dtl().xfr_alloc_sts_no();
	}

	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public void xfr_alloc_sts_no(String value) {
		dtl().xfr_alloc_sts_no(value);
	}

	/**
	 * Movement allocation before split status No. 分割前移動引当状況ＮＯ.<p>
	 *
	 */
	public String old_xfr_alloc_sts_no() {
		return dtl().old_xfr_alloc_sts_no();
	}

	/**
	 * Movement allocation before split status No. 分割前移動引当状況ＮＯ.<p>
	 *
	 */
	public void old_xfr_alloc_sts_no(String value) {
		dtl().old_xfr_alloc_sts_no(value);
	}

	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public String prov_schd_no() {
		return dtl().prov_schd_no();
	}

	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public void prov_schd_no(String value) {
		dtl().prov_schd_no(value);
	}

	/**
	 * Supply schedule No. (Return) 支給予定ＮＯ（返品）.<p>
	 *
	 */
	public String ret_prov_schd_no() {
		return dtl().ret_prov_schd_no();
	}

	/**
	 * Supply schedule No. (Return) 支給予定ＮＯ（返品）.<p>
	 *
	 */
	public void ret_prov_schd_no(String value) {
		dtl().ret_prov_schd_no(value);
	}

	/**
	 * WMS flg. ＷＭＳＦＬＧ.<p>
	 *
	 */
	public boolean wms_flg() {
		return dtl().wms_flg();
	}

	/**
	 * WMS flg. ＷＭＳＦＬＧ.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		dtl().wms_flg(value);
	}

}

