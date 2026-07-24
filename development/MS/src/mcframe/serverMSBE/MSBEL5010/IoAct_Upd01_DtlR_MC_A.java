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
 * ブロック"IoAct_Upd01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class IoAct_Upd01_DtlR_MC_A extends MCConstRow {

	public static final String $tia = "tia";
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
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gi_str_ln_cd = "gi_str_ln_cd";
	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gr_str_ln_cd = "gr_str_ln_cd";
	/**
	 * GI grading cd. 出庫格付ＣＤ.<p>
	 *
	 */
	public static final String $gi_gd_cd = "gi_gd_cd";
	/**
	 * GR grading cd. 入庫格付ＣＤ.<p>
	 *
	 */
	public static final String $gr_gd_cd = "gr_gd_cd";
	/**
	 * Inventory variance qty. 棚差数.<p>
	 *
	 */
	public static final String $stktk_diff_qty = "stktk_diff_qty";
	/**
	 * SKU transfer unit cd. 荷姿振替単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_xfr_unit_cd = "pack_xfr_unit_cd";
	/**
	 * SKU transfer qty. 荷姿振替数量.<p>
	 *
	 */
	public static final String $pack_xfr_qty = "pack_xfr_qty";
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public static final String $arr_ptn_typ = "arr_ptn_typ";
	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public static final String $yield_typ = "yield_typ";
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public static final String $purc_id_typ = "purc_id_typ";
	/**
	 * Work GR/GI type name ワーク入出庫区分.<p>
	 *
	 */
	public static final String $wia_io_typ = "wia_io_typ";
	/**
	 * Defective acceptance 検収不良.<p>
	 *
	 */
	public static final String $accpt_dfct_flg = "accpt_dfct_flg";
	/**
	 * Parent slip GR/GI type 親伝票受払区分.<p>
	 *
	 */
	public static final String $par_slip_io_act_typ = "par_slip_io_act_typ";
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	/**
	 * GI location cd. (Original) 出庫場所ＣＤ（元）.<p>
	 *
	 */
	public static final String $org_gi_loc_cd = "org_gi_loc_cd";
	/**
	 * GR location cd. (Original) 入庫場所ＣＤ（元）.<p>
	 *
	 */
	public static final String $org_gr_loc_cd = "org_gr_loc_cd";
	/**
	 * Not for GI allocation confirmation 出庫引当確認対象外.<p>
	 *
	 */
	public static final String $no_gi_alloc_flg = "no_gi_alloc_flg";
	/**
	 * Other accounting transfer inventory identification type 他勘定振替在庫識別区分.<p>
	 *
	 */
	public static final String $acxfr_stk_id_typ = "acxfr_stk_id_typ";
	/**
	 * Other accounting transfer inventory BP cd. 他勘定振替在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $acxfr_stk_bp_cd = "acxfr_stk_bp_cd";
	/**
	 * Other accounting transfer inventory arriving point cd. 他勘定振替在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $acxfr_stk_arrv_bp_cd = "acxfr_stk_arrv_bp_cd";
	/**
	 * Reason cd. 2 理由ＣＤ２.<p>
	 *
	 */
	public static final String $rsn_cd2 = "rsn_cd2";

	public static final String $slip_no = $tia + ".slip_no";
	public static final String $slip_seq_no = $tia + ".slip_seq_no";
	public static final String $ac_ym = $tia + ".ac_ym";
	public static final String $ac_dt = $tia + ".ac_dt";
	public static final String $act_tm = $tia + ".act_tm";
	public static final String $slip_rev_no = $tia + ".slip_rev_no";
	public static final String $act_no = $tia + ".act_no";
	public static final String $act_seq = $tia + ".act_seq";
	public static final String $act_rev_no = $tia + ".act_rev_no";
	public static final String $act_d_no = $tia + ".act_d_no";
	public static final String $act_d_seq = $tia + ".act_d_seq";
	public static final String $act_io_no = $tia + ".act_io_no";
	public static final String $act_io_seq = $tia + ".act_io_seq";
	public static final String $slip_sts_typ = $tia + ".slip_sts_typ";
	public static final String $un_fix_flg = $tia + ".un_fix_flg";
	public static final String $temp_ap_flg = $tia + ".temp_ap_flg";
	public static final String $trd_cd = $tia + ".trd_cd";
	public static final String $trd_ptn_typ = $tia + ".trd_ptn_typ";
	public static final String $trn_typ = $tia + ".trn_typ";
	public static final String $io_act_typ = $tia + ".io_act_typ";
	public static final String $io_typ = $tia + ".io_typ";
	public static final String $ac_slip_typ = $tia + ".ac_slip_typ";
	public static final String $rsn_cd = $tia + ".rsn_cd";
	public static final String $ac_rsn_cd = $tia + ".ac_rsn_cd";
	public static final String $gi_wg_cd = $tia + ".gi_wg_cd";
	public static final String $gr_wg_cd = $tia + ".gr_wg_cd";
	public static final String $act_dpt_cd = $tia + ".act_dpt_cd";
	public static final String $purc_dpt_cd = $tia + ".purc_dpt_cd";
	public static final String $ap_dpt_cd = $tia + ".ap_dpt_cd";
	public static final String $sls_dpt_cd = $tia + ".sls_dpt_cd";
	public static final String $ar_dpt_cd = $tia + ".ar_dpt_cd";
	public static final String $gi_dpt_cd = $tia + ".gi_dpt_cd";
	public static final String $gr_dpt_cd = $tia + ".gr_dpt_cd";
	public static final String $bd_dpt_cd = $tia + ".bd_dpt_cd";
	public static final String $sub_dpt_cd1 = $tia + ".sub_dpt_cd1";
	public static final String $sub_dpt_cd2 = $tia + ".sub_dpt_cd2";
	public static final String $sub_dpt_cd3 = $tia + ".sub_dpt_cd3";
	public static final String $act_usr_cd = $tia + ".act_usr_cd";
	public static final String $sls_usr_cd = $tia + ".sls_usr_cd";
	public static final String $mfg_usr_cd = $tia + ".mfg_usr_cd";
	public static final String $purc_usr_cd = $tia + ".purc_usr_cd";
	public static final String $ac_itm_grp_cd = $tia + ".ac_itm_grp_cd";
	public static final String $itm_jnl_cd = $tia + ".itm_jnl_cd";
	public static final String $itm_cd = $tia + ".itm_cd";
	public static final String $itm_sub1 = $tia + ".itm_sub1";
	public static final String $itm_sub2 = $tia + ".itm_sub2";
	public static final String $itm_sub3 = $tia + ".itm_sub3";
	public static final String $itm_nm = $tia + ".itm_nm";
	public static final String $stk_mng_typ = $tia + ".stk_mng_typ";
	public static final String $asset_mng_typ = $tia + ".asset_mng_typ";
	public static final String $sundry_itm_flg = $tia + ".sundry_itm_flg";
	public static final String $loc_cd = $tia + ".loc_cd";
	public static final String $str_ln_cd = $tia + ".str_ln_cd";
	public static final String $stk_arrv_bp_cd = $tia + ".stk_arrv_bp_cd";
	public static final String $lot_no = $tia + ".lot_no";
	public static final String $sublot_no = $tia + ".sublot_no";
	public static final String $sno1 = $tia + ".sno1";
	public static final String $sno2 = $tia + ".sno2";
	public static final String $sno3 = $tia + ".sno3";
	public static final String $sno4 = $tia + ".sno4";
	public static final String $fix_no_typ = $tia + ".fix_no_typ";
	public static final String $fix_no = $tia + ".fix_no";
	public static final String $gd_cd = $tia + ".gd_cd";
	public static final String $in_xfr_typ = $tia + ".in_xfr_typ";
	public static final String $quality_typ = $tia + ".quality_typ";
	public static final String $asst_typ = $tia + ".asst_typ";
	public static final String $stk_insp_typ = $tia + ".stk_insp_typ";
	public static final String $stk_id_typ = $tia + ".stk_id_typ";
	public static final String $stk_bp_cd = $tia + ".stk_bp_cd";
	public static final String $trd_unit_qty = $tia + ".trd_unit_qty";
	public static final String $trd_unit_cd = $tia + ".trd_unit_cd";
	public static final String $pack_unit_qty = $tia + ".pack_unit_qty";
	public static final String $pack_unit_cd = $tia + ".pack_unit_cd";
	public static final String $base_unit_qty = $tia + ".base_unit_qty";
	public static final String $base_unit_cd = $tia + ".base_unit_cd";
	public static final String $trd_cur_cd = $tia + ".trd_cur_cd";
	public static final String $trd_cur_upri = $tia + ".trd_cur_upri";
	public static final String $trd_cur_amt = $tia + ".trd_cur_amt";
	public static final String $trd_cur_proc_amt = $tia + ".trd_cur_proc_amt";
	public static final String $trd_cur_onr_prov_amt = $tia + ".trd_cur_onr_prov_amt";
	public static final String $trd_cur_tax_amt = $tia + ".trd_cur_tax_amt";
	public static final String $base_cur_cd = $tia + ".base_cur_cd";
	public static final String $base_cur_upri = $tia + ".base_cur_upri";
	public static final String $base_cur_amt = $tia + ".base_cur_amt";
	public static final String $base_cur_proc_amt = $tia + ".base_cur_proc_amt";
	public static final String $base_cur_onr_prov_amt = $tia + ".base_cur_onr_prov_amt";
	public static final String $base_cur_tax_amt = $tia + ".base_cur_tax_amt";
	public static final String $ptax_cur_cd = $tia + ".ptax_cur_cd";
	public static final String $ptax_cur_upri = $tia + ".ptax_cur_upri";
	public static final String $ptax_cur_amt = $tia + ".ptax_cur_amt";
	public static final String $ptax_cur_proc_amt = $tia + ".ptax_cur_proc_amt";
	public static final String $ptax_cur_onr_prov_amt = $tia + ".ptax_cur_onr_prov_amt";
	public static final String $ptax_cur_tax_amt = $tia + ".ptax_cur_tax_amt";
	public static final String $wtax_rate = $tia + ".wtax_rate";
	public static final String $wtax_amt = $tia + ".wtax_amt";
	public static final String $tax_cd = $tia + ".tax_cd";
	public static final String $foreign_flg = $tia + ".foreign_flg";
	public static final String $xrate_cd = $tia + ".xrate_cd";
	public static final String $xrate = $tia + ".xrate";
	public static final String $ptax_xrate_cd = $tia + ".ptax_xrate_cd";
	public static final String $ptax_xrate = $tia + ".ptax_xrate";
	public static final String $slo_no = $tia + ".slo_no";
	public static final String $po_no = $tia + ".po_no";
	public static final String $iv_no = $tia + ".iv_no";
	public static final String $rcpt_iv_no = $tia + ".rcpt_iv_no";
	public static final String $bd_ctg_cd = $tia + ".bd_ctg_cd";
	public static final String $bd_bp_cd = $tia + ".bd_bp_cd";
	public static final String $bd_oper_cd = $tia + ".bd_oper_cd";
	public static final String $bd_loc_cd = $tia + ".bd_loc_cd";
	public static final String $bd_slo_no = $tia + ".bd_slo_no";
	public static final String $bd_po_no = $tia + ".bd_po_no";
	public static final String $bd_iv_no = $tia + ".bd_iv_no";
	public static final String $bd_wg_cd = $tia + ".bd_wg_cd";
	public static final String $dlv_cd = $tia + ".dlv_cd";
	public static final String $tdlv_cd = $tia + ".tdlv_cd";
	public static final String $rcst_cd = $tia + ".rcst_cd";
	public static final String $bcst_cd = $tia + ".bcst_cd";
	public static final String $acst_cd = $tia + ".acst_cd";
	public static final String $cst_cd = $tia + ".cst_cd";
	public static final String $dest_cd1 = $tia + ".dest_cd1";
	public static final String $dest_cd2 = $tia + ".dest_cd2";
	public static final String $dest_cd3 = $tia + ".dest_cd3";
	public static final String $psppl_cd = $tia + ".psppl_cd";
	public static final String $bsppl_cd = $tia + ".bsppl_cd";
	public static final String $asppl_cd = $tia + ".asppl_cd";
	public static final String $sppl_cd = $tia + ".sppl_cd";
	public static final String $cred_cd = $tia + ".cred_cd";
	public static final String $spot_flg = $tia + ".spot_flg";
	public static final String $sttl_schd_dt = $tia + ".sttl_schd_dt";
	public static final String $sttl_cd = $tia + ".sttl_cd";
	public static final String $cst_itm_cd = $tia + ".cst_itm_cd";
	public static final String $cst_itm_nm = $tia + ".cst_itm_nm";
	public static final String $sppl_itm_cd = $tia + ".sppl_itm_cd";
	public static final String $sppl_itm_nm = $tia + ".sppl_itm_nm";
	public static final String $purc_typ = $tia + ".purc_typ";
	public static final String $area_cd = $tia + ".area_cd";
	public static final String $cntry_cd = $tia + ".cntry_cd";
	public static final String $itm_mfg_inst_no = $tia + ".itm_mfg_inst_no";
	public static final String $itm_inst_qty = $tia + ".itm_inst_qty";
	public static final String $mfg_inst_no = $tia + ".mfg_inst_no";
	public static final String $mfg_act_no = $tia + ".mfg_act_no";
	public static final String $mfg_st_qty = $tia + ".mfg_st_qty";
	public static final String $oper_act_no = $tia + ".oper_act_no";
	public static final String $yield_rate = $tia + ".yield_rate";
	public static final String $disp_seq = $tia + ".disp_seq";
	public static final String $oper_cd = $tia + ".oper_cd";
	public static final String $inpt_loc_cd = $tia + ".inpt_loc_cd";
	public static final String $inpt_str_ln_cd = $tia + ".inpt_str_ln_cd";
	public static final String $outsrc_mfg_loc_cd = $tia + ".outsrc_mfg_loc_cd";
	public static final String $outsrc_mfg_loc_dpt_cd = $tia + ".outsrc_mfg_loc_dpt_cd";
	public static final String $outsrc_mfg_loc_wg_cd = $tia + ".outsrc_mfg_loc_wg_cd";
	public static final String $strg_loc_cd = $tia + ".strg_loc_cd";
	public static final String $strg_str_ln_cd = $tia + ".strg_str_ln_cd";
	public static final String $mfg_inst_unit_typ = $tia + ".mfg_inst_unit_typ";
	public static final String $gi_loc_cd = $tia + ".gi_loc_cd";
	public static final String $gr_loc_cd = $tia + ".gr_loc_cd";
	public static final String $stktk_base_dt = $tia + ".stktk_base_dt";
	public static final String $par_ac_itm_grp_cd = $tia + ".par_ac_itm_grp_cd";
	public static final String $par_itm_jnl_cd = $tia + ".par_itm_jnl_cd";
	public static final String $par_itm_cd = $tia + ".par_itm_cd";
	public static final String $par_itm_sub1 = $tia + ".par_itm_sub1";
	public static final String $par_itm_sub2 = $tia + ".par_itm_sub2";
	public static final String $par_itm_sub3 = $tia + ".par_itm_sub3";
	public static final String $par_itm_nm = $tia + ".par_itm_nm";
	public static final String $par_lot_no = $tia + ".par_lot_no";
	public static final String $par_sublot_no = $tia + ".par_sublot_no";
	public static final String $par_sno1 = $tia + ".par_sno1";
	public static final String $par_sno2 = $tia + ".par_sno2";
	public static final String $par_sno3 = $tia + ".par_sno3";
	public static final String $par_sno4 = $tia + ".par_sno4";
	public static final String $trd_rmrks = $tia + ".trd_rmrks";
	public static final String $trd_d_rmrks = $tia + ".trd_d_rmrks";
	public static final String $sub_char1 = $tia + ".sub_char1";
	public static final String $sub_char2 = $tia + ".sub_char2";
	public static final String $sub_char3 = $tia + ".sub_char3";
	public static final String $sub_char4 = $tia + ".sub_char4";
	public static final String $sub_char5 = $tia + ".sub_char5";
	public static final String $sub_char6 = $tia + ".sub_char6";
	public static final String $sub_char7 = $tia + ".sub_char7";
	public static final String $sub_char8 = $tia + ".sub_char8";
	public static final String $sub_char9 = $tia + ".sub_char9";
	public static final String $sub_char10 = $tia + ".sub_char10";
	public static final String $sub_num1 = $tia + ".sub_num1";
	public static final String $sub_num2 = $tia + ".sub_num2";
	public static final String $sub_num3 = $tia + ".sub_num3";
	public static final String $sub_dt1 = $tia + ".sub_dt1";
	public static final String $sub_dt2 = $tia + ".sub_dt2";
	public static final String $sub_dt3 = $tia + ".sub_dt3";
	public static final String $par_slip_no = $tia + ".par_slip_no";
	public static final String $par_slip_seq_no = $tia + ".par_slip_seq_no";
	public static final String $slip_cmpl_flg = $tia + ".slip_cmpl_flg";
	public static final String $send_flg = $tia + ".send_flg";
	public static final String $c_imp_flg = $tia + ".c_imp_flg";
	public static final String $a_imp_flg = $tia + ".a_imp_flg";
	public static final String $repurc_obli_flg = $tia + ".repurc_obli_flg";

	public static final MCMeta tia_META = createInnerRowMeta($tia, mcframe.serverMS.dbc.MST_IO_ACT_R.class);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gi_str_ln_cd_META = createCommonMeta($gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gr_str_ln_cd_META = createCommonMeta($gr_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gi_gd_cd_META = createCommonMeta($gi_gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gr_gd_cd_META = createCommonMeta($gr_gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta stktk_diff_qty_META = createCommonMeta($stktk_diff_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_xfr_unit_cd_META = createCommonMeta($pack_xfr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_xfr_qty_META = createCommonMeta($pack_xfr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta arr_ptn_typ_META = createCommonMeta($arr_ptn_typ, mcframe.commonMA.meta.MA_META.ARR_PTN_TYP);
	public static final MCMeta yield_typ_META = createCommonMeta($yield_typ, mcframe.commonMA.meta.MA_META.YIELD_TYP);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta purc_id_typ_META = createCommonMeta($purc_id_typ, mcframe.commonMA.meta.MA_META.PURC_ID_TYP);
	public static final MCMeta wia_io_typ_META = createCommonMeta($wia_io_typ, mcframe.commonMS.meta.MS_META.IO_TYP);
	public static final MCMeta accpt_dfct_flg_META = createCommonMeta($accpt_dfct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_slip_io_act_typ_META = createCommonMeta($par_slip_io_act_typ, mcframe.commonMS.meta.MS_META.IO_ACT_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta org_gi_loc_cd_META = createCommonMeta($org_gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta org_gr_loc_cd_META = createCommonMeta($org_gr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta no_gi_alloc_flg_META = createCommonMeta($no_gi_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acxfr_stk_id_typ_META = createCommonMeta($acxfr_stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta acxfr_stk_bp_cd_META = createCommonMeta($acxfr_stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acxfr_stk_arrv_bp_cd_META = createCommonMeta($acxfr_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rsn_cd2_META = createCommonMeta($rsn_cd2, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);

	protected static final ConstMetaList<IoAct_Upd01_DtlR> constMetas = new ConstMetaList<IoAct_Upd01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			tia_META,
			data_crud_typ_META,
			can_ac_dt_META,
			gi_str_ln_cd_META,
			gr_str_ln_cd_META,
			gi_gd_cd_META,
			gr_gd_cd_META,
			stktk_diff_qty_META,
			pack_xfr_unit_cd_META,
			pack_xfr_qty_META,
			via_dlv_typ_META,
			arr_ptn_typ_META,
			yield_typ_META,
			prov_typ_META,
			purc_id_typ_META,
			wia_io_typ_META,
			accpt_dfct_flg_META,
			par_slip_io_act_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			org_gi_loc_cd_META,
			org_gr_loc_cd_META,
			no_gi_alloc_flg_META,
			acxfr_stk_id_typ_META,
			acxfr_stk_bp_cd_META,
			acxfr_stk_arrv_bp_cd_META,
			rsn_cd2_META
		},
		new String[][]{
			{
				"slip_no",
				"slip_seq_no",
				"ac_ym",
				"ac_dt",
				"act_tm",
				"slip_rev_no",
				"act_no",
				"act_seq",
				"act_rev_no",
				"act_d_no",
				"act_d_seq",
				"act_io_no",
				"act_io_seq",
				"slip_sts_typ",
				"un_fix_flg",
				"temp_ap_flg",
				"trd_cd",
				"trd_ptn_typ",
				"trn_typ",
				"io_act_typ",
				"io_typ",
				"ac_slip_typ",
				"rsn_cd",
				"ac_rsn_cd",
				"gi_wg_cd",
				"gr_wg_cd",
				"act_dpt_cd",
				"purc_dpt_cd",
				"ap_dpt_cd",
				"sls_dpt_cd",
				"ar_dpt_cd",
				"gi_dpt_cd",
				"gr_dpt_cd",
				"bd_dpt_cd",
				"sub_dpt_cd1",
				"sub_dpt_cd2",
				"sub_dpt_cd3",
				"act_usr_cd",
				"sls_usr_cd",
				"mfg_usr_cd",
				"purc_usr_cd",
				"ac_itm_grp_cd",
				"itm_jnl_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"stk_mng_typ",
				"asset_mng_typ",
				"sundry_itm_flg",
				"loc_cd",
				"str_ln_cd",
				"stk_arrv_bp_cd",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"fix_no_typ",
				"fix_no",
				"gd_cd",
				"in_xfr_typ",
				"quality_typ",
				"asst_typ",
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
				"foreign_flg",
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
				"rcst_cd",
				"bcst_cd",
				"acst_cd",
				"cst_cd",
				"dest_cd1",
				"dest_cd2",
				"dest_cd3",
				"psppl_cd",
				"bsppl_cd",
				"asppl_cd",
				"sppl_cd",
				"cred_cd",
				"spot_flg",
				"sttl_schd_dt",
				"sttl_cd",
				"cst_itm_cd",
				"cst_itm_nm",
				"sppl_itm_cd",
				"sppl_itm_nm",
				"purc_typ",
				"area_cd",
				"cntry_cd",
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
				"outsrc_mfg_loc_cd",
				"outsrc_mfg_loc_dpt_cd",
				"outsrc_mfg_loc_wg_cd",
				"strg_loc_cd",
				"strg_str_ln_cd",
				"mfg_inst_unit_typ",
				"gi_loc_cd",
				"gr_loc_cd",
				"stktk_base_dt",
				"par_ac_itm_grp_cd",
				"par_itm_jnl_cd",
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
				"par_slip_no",
				"par_slip_seq_no",
				"slip_cmpl_flg",
				"send_flg",
				"c_imp_flg",
				"a_imp_flg",
				"repurc_obli_flg"
			},
			{
				$slip_no,
				$slip_seq_no,
				$ac_ym,
				$ac_dt,
				$act_tm,
				$slip_rev_no,
				$act_no,
				$act_seq,
				$act_rev_no,
				$act_d_no,
				$act_d_seq,
				$act_io_no,
				$act_io_seq,
				$slip_sts_typ,
				$un_fix_flg,
				$temp_ap_flg,
				$trd_cd,
				$trd_ptn_typ,
				$trn_typ,
				$io_act_typ,
				$io_typ,
				$ac_slip_typ,
				$rsn_cd,
				$ac_rsn_cd,
				$gi_wg_cd,
				$gr_wg_cd,
				$act_dpt_cd,
				$purc_dpt_cd,
				$ap_dpt_cd,
				$sls_dpt_cd,
				$ar_dpt_cd,
				$gi_dpt_cd,
				$gr_dpt_cd,
				$bd_dpt_cd,
				$sub_dpt_cd1,
				$sub_dpt_cd2,
				$sub_dpt_cd3,
				$act_usr_cd,
				$sls_usr_cd,
				$mfg_usr_cd,
				$purc_usr_cd,
				$ac_itm_grp_cd,
				$itm_jnl_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$stk_mng_typ,
				$asset_mng_typ,
				$sundry_itm_flg,
				$loc_cd,
				$str_ln_cd,
				$stk_arrv_bp_cd,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$fix_no_typ,
				$fix_no,
				$gd_cd,
				$in_xfr_typ,
				$quality_typ,
				$asst_typ,
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
				$foreign_flg,
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
				$rcst_cd,
				$bcst_cd,
				$acst_cd,
				$cst_cd,
				$dest_cd1,
				$dest_cd2,
				$dest_cd3,
				$psppl_cd,
				$bsppl_cd,
				$asppl_cd,
				$sppl_cd,
				$cred_cd,
				$spot_flg,
				$sttl_schd_dt,
				$sttl_cd,
				$cst_itm_cd,
				$cst_itm_nm,
				$sppl_itm_cd,
				$sppl_itm_nm,
				$purc_typ,
				$area_cd,
				$cntry_cd,
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
				$outsrc_mfg_loc_cd,
				$outsrc_mfg_loc_dpt_cd,
				$outsrc_mfg_loc_wg_cd,
				$strg_loc_cd,
				$strg_str_ln_cd,
				$mfg_inst_unit_typ,
				$gi_loc_cd,
				$gr_loc_cd,
				$stktk_base_dt,
				$par_ac_itm_grp_cd,
				$par_itm_jnl_cd,
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
				$par_slip_no,
				$par_slip_seq_no,
				$slip_cmpl_flg,
				$send_flg,
				$c_imp_flg,
				$a_imp_flg,
				$repurc_obli_flg
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
	protected IoAct_Upd01_DtlR_MC_A(ConstMetaList<? extends IoAct_Upd01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IoAct_Upd01_DtlR clone() {
		return (IoAct_Upd01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IoAct_Upd01_DtlR createInstance() {
		return (IoAct_Upd01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IoAct_Upd01_DtlR getValues(String... names) {
		return (IoAct_Upd01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_IO_ACT_R tia(){
		return (mcframe.serverMS.dbc.MST_IO_ACT_R) getConstInnerRow(offset + 0, $tia);
	}
	
	public void tia(mcframe.serverMS.dbc.MST_IO_ACT_R row){
		setConstInnerRow(offset + 0, $tia, row);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 1, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 1, $data_crud_typ, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 2, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 2, $can_ac_dt, value);
	}


	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return getConstString(offset + 3, $gi_str_ln_cd);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		setConstString(offset + 3, $gi_str_ln_cd, value);
	}


	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return getConstString(offset + 4, $gr_str_ln_cd);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		setConstString(offset + 4, $gr_str_ln_cd, value);
	}


	/**
	 * GI grading cd. 出庫格付ＣＤ.<p>
	 *
	 */
	public String gi_gd_cd() {
		return getConstString(offset + 5, $gi_gd_cd);
	}

	/**
	 * GI grading cd. 出庫格付ＣＤ.<p>
	 *
	 */
	public void gi_gd_cd(String value) {
		setConstString(offset + 5, $gi_gd_cd, value);
	}


	/**
	 * GR grading cd. 入庫格付ＣＤ.<p>
	 *
	 */
	public String gr_gd_cd() {
		return getConstString(offset + 6, $gr_gd_cd);
	}

	/**
	 * GR grading cd. 入庫格付ＣＤ.<p>
	 *
	 */
	public void gr_gd_cd(String value) {
		setConstString(offset + 6, $gr_gd_cd, value);
	}


	/**
	 * Inventory variance qty. 棚差数.<p>
	 *
	 */
	public MCNumber stktk_diff_qty() {
		return getConstNumber(offset + 7, $stktk_diff_qty);
	}

	/**
	 * Inventory variance qty. 棚差数.<p>
	 *
	 */
	public void stktk_diff_qty(MCNumber value) {
		setConstNumber(offset + 7, $stktk_diff_qty, value);
	}

	/**
	 * Inventory variance qty. 棚差数.<p>
	 *
	 */
	public void stktk_diff_qty(int value) {
		setConstNumber(offset + 7, $stktk_diff_qty, value);
	}

	/**
	 * Inventory variance qty. 棚差数.<p>
	 *
	 */
	public void stktk_diff_qty(long value) {
		setConstNumber(offset + 7, $stktk_diff_qty, value);
	}

	/**
	 * Inventory variance qty. 棚差数.<p>
	 *
	 */
	public void stktk_diff_qty(float value) {
		setConstNumber(offset + 7, $stktk_diff_qty, value);
	}

	/**
	 * Inventory variance qty. 棚差数.<p>
	 *
	 */
	public void stktk_diff_qty(double value) {
		setConstNumber(offset + 7, $stktk_diff_qty, value);
	}


	/**
	 * SKU transfer unit cd. 荷姿振替単位ＣＤ.<p>
	 *
	 */
	public String pack_xfr_unit_cd() {
		return getConstString(offset + 8, $pack_xfr_unit_cd);
	}

	/**
	 * SKU transfer unit cd. 荷姿振替単位ＣＤ.<p>
	 *
	 */
	public void pack_xfr_unit_cd(String value) {
		setConstString(offset + 8, $pack_xfr_unit_cd, value);
	}


	/**
	 * SKU transfer qty. 荷姿振替数量.<p>
	 *
	 */
	public MCNumber pack_xfr_qty() {
		return getConstNumber(offset + 9, $pack_xfr_qty);
	}

	/**
	 * SKU transfer qty. 荷姿振替数量.<p>
	 *
	 */
	public void pack_xfr_qty(MCNumber value) {
		setConstNumber(offset + 9, $pack_xfr_qty, value);
	}

	/**
	 * SKU transfer qty. 荷姿振替数量.<p>
	 *
	 */
	public void pack_xfr_qty(int value) {
		setConstNumber(offset + 9, $pack_xfr_qty, value);
	}

	/**
	 * SKU transfer qty. 荷姿振替数量.<p>
	 *
	 */
	public void pack_xfr_qty(long value) {
		setConstNumber(offset + 9, $pack_xfr_qty, value);
	}

	/**
	 * SKU transfer qty. 荷姿振替数量.<p>
	 *
	 */
	public void pack_xfr_qty(float value) {
		setConstNumber(offset + 9, $pack_xfr_qty, value);
	}

	/**
	 * SKU transfer qty. 荷姿振替数量.<p>
	 *
	 */
	public void pack_xfr_qty(double value) {
		setConstNumber(offset + 9, $pack_xfr_qty, value);
	}


	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 10, $via_dlv_typ);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 10, $via_dlv_typ, value);
	}


	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public String arr_ptn_typ() {
		return getConstString(offset + 11, $arr_ptn_typ);
	}

	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public void arr_ptn_typ(String value) {
		setConstString(offset + 11, $arr_ptn_typ, value);
	}


	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public String yield_typ() {
		return getConstString(offset + 12, $yield_typ);
	}

	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public void yield_typ(String value) {
		setConstString(offset + 12, $yield_typ, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 13, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 13, $prov_typ, value);
	}


	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return getConstString(offset + 14, $purc_id_typ);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		setConstString(offset + 14, $purc_id_typ, value);
	}


	/**
	 * Work GR/GI type name ワーク入出庫区分.<p>
	 *
	 */
	public String wia_io_typ() {
		return getConstString(offset + 15, $wia_io_typ);
	}

	/**
	 * Work GR/GI type name ワーク入出庫区分.<p>
	 *
	 */
	public void wia_io_typ(String value) {
		setConstString(offset + 15, $wia_io_typ, value);
	}


	/**
	 * Defective acceptance 検収不良.<p>
	 *
	 */
	public boolean accpt_dfct_flg() {
		return getConstBoolean(offset + 16, $accpt_dfct_flg);
	}

	/**
	 * Defective acceptance 検収不良.<p>
	 *
	 */
	public void accpt_dfct_flg(boolean value) {
		setConstBoolean(offset + 16, $accpt_dfct_flg, value);
	}


	/**
	 * Parent slip GR/GI type 親伝票受払区分.<p>
	 *
	 */
	public String par_slip_io_act_typ() {
		return getConstString(offset + 17, $par_slip_io_act_typ);
	}

	/**
	 * Parent slip GR/GI type 親伝票受払区分.<p>
	 *
	 */
	public void par_slip_io_act_typ(String value) {
		setConstString(offset + 17, $par_slip_io_act_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 18, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 18, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 19, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 19, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 20, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 20, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 21, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 21, $sno4_mng_typ, value);
	}


	/**
	 * GI location cd. (Original) 出庫場所ＣＤ（元）.<p>
	 *
	 */
	public String org_gi_loc_cd() {
		return getConstString(offset + 22, $org_gi_loc_cd);
	}

	/**
	 * GI location cd. (Original) 出庫場所ＣＤ（元）.<p>
	 *
	 */
	public void org_gi_loc_cd(String value) {
		setConstString(offset + 22, $org_gi_loc_cd, value);
	}


	/**
	 * GR location cd. (Original) 入庫場所ＣＤ（元）.<p>
	 *
	 */
	public String org_gr_loc_cd() {
		return getConstString(offset + 23, $org_gr_loc_cd);
	}

	/**
	 * GR location cd. (Original) 入庫場所ＣＤ（元）.<p>
	 *
	 */
	public void org_gr_loc_cd(String value) {
		setConstString(offset + 23, $org_gr_loc_cd, value);
	}


	/**
	 * Not for GI allocation confirmation 出庫引当確認対象外.<p>
	 *
	 */
	public boolean no_gi_alloc_flg() {
		return getConstBoolean(offset + 24, $no_gi_alloc_flg);
	}

	/**
	 * Not for GI allocation confirmation 出庫引当確認対象外.<p>
	 *
	 */
	public void no_gi_alloc_flg(boolean value) {
		setConstBoolean(offset + 24, $no_gi_alloc_flg, value);
	}


	/**
	 * Other accounting transfer inventory identification type 他勘定振替在庫識別区分.<p>
	 *
	 */
	public String acxfr_stk_id_typ() {
		return getConstString(offset + 25, $acxfr_stk_id_typ);
	}

	/**
	 * Other accounting transfer inventory identification type 他勘定振替在庫識別区分.<p>
	 *
	 */
	public void acxfr_stk_id_typ(String value) {
		setConstString(offset + 25, $acxfr_stk_id_typ, value);
	}


	/**
	 * Other accounting transfer inventory BP cd. 他勘定振替在庫取引先ＣＤ.<p>
	 *
	 */
	public String acxfr_stk_bp_cd() {
		return getConstString(offset + 26, $acxfr_stk_bp_cd);
	}

	/**
	 * Other accounting transfer inventory BP cd. 他勘定振替在庫取引先ＣＤ.<p>
	 *
	 */
	public void acxfr_stk_bp_cd(String value) {
		setConstString(offset + 26, $acxfr_stk_bp_cd, value);
	}


	/**
	 * Other accounting transfer inventory arriving point cd. 他勘定振替在庫着荷先ＣＤ.<p>
	 *
	 */
	public String acxfr_stk_arrv_bp_cd() {
		return getConstString(offset + 27, $acxfr_stk_arrv_bp_cd);
	}

	/**
	 * Other accounting transfer inventory arriving point cd. 他勘定振替在庫着荷先ＣＤ.<p>
	 *
	 */
	public void acxfr_stk_arrv_bp_cd(String value) {
		setConstString(offset + 27, $acxfr_stk_arrv_bp_cd, value);
	}


	/**
	 * Reason cd. 2 理由ＣＤ２.<p>
	 *
	 */
	public String rsn_cd2() {
		return getConstString(offset + 28, $rsn_cd2);
	}

	/**
	 * Reason cd. 2 理由ＣＤ２.<p>
	 *
	 */
	public void rsn_cd2(String value) {
		setConstString(offset + 28, $rsn_cd2, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gi_gd_cd.equalsIgnoreCase(name)) {
			return gi_gd_cd();
		}
		if ($gr_gd_cd.equalsIgnoreCase(name)) {
			return gr_gd_cd();
		}
		if ($pack_xfr_unit_cd.equalsIgnoreCase(name)) {
			return pack_xfr_unit_cd();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			return arr_ptn_typ();
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($wia_io_typ.equalsIgnoreCase(name)) {
			return wia_io_typ();
		}
		if ($par_slip_io_act_typ.equalsIgnoreCase(name)) {
			return par_slip_io_act_typ();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($org_gi_loc_cd.equalsIgnoreCase(name)) {
			return org_gi_loc_cd();
		}
		if ($org_gr_loc_cd.equalsIgnoreCase(name)) {
			return org_gr_loc_cd();
		}
		if ($acxfr_stk_id_typ.equalsIgnoreCase(name)) {
			return acxfr_stk_id_typ();
		}
		if ($acxfr_stk_bp_cd.equalsIgnoreCase(name)) {
			return acxfr_stk_bp_cd();
		}
		if ($acxfr_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return acxfr_stk_arrv_bp_cd();
		}
		if ($rsn_cd2.equalsIgnoreCase(name)) {
			return rsn_cd2();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($stktk_diff_qty.equalsIgnoreCase(name)) {
			return stktk_diff_qty();
		}
		if ($pack_xfr_qty.equalsIgnoreCase(name)) {
			return pack_xfr_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($accpt_dfct_flg.equalsIgnoreCase(name)) {
			return accpt_dfct_flg();
		}
		if ($no_gi_alloc_flg.equalsIgnoreCase(name)) {
			return no_gi_alloc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gi_gd_cd.equalsIgnoreCase(name)) {
			return gi_gd_cd();
		}
		if ($gr_gd_cd.equalsIgnoreCase(name)) {
			return gr_gd_cd();
		}
		if ($pack_xfr_unit_cd.equalsIgnoreCase(name)) {
			return pack_xfr_unit_cd();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			return arr_ptn_typ();
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($wia_io_typ.equalsIgnoreCase(name)) {
			return wia_io_typ();
		}
		if ($par_slip_io_act_typ.equalsIgnoreCase(name)) {
			return par_slip_io_act_typ();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($org_gi_loc_cd.equalsIgnoreCase(name)) {
			return org_gi_loc_cd();
		}
		if ($org_gr_loc_cd.equalsIgnoreCase(name)) {
			return org_gr_loc_cd();
		}
		if ($acxfr_stk_id_typ.equalsIgnoreCase(name)) {
			return acxfr_stk_id_typ();
		}
		if ($acxfr_stk_bp_cd.equalsIgnoreCase(name)) {
			return acxfr_stk_bp_cd();
		}
		if ($acxfr_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return acxfr_stk_arrv_bp_cd();
		}
		if ($rsn_cd2.equalsIgnoreCase(name)) {
			return rsn_cd2();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($stktk_diff_qty.equalsIgnoreCase(name)) {
			return stktk_diff_qty();
		}
		if ($pack_xfr_qty.equalsIgnoreCase(name)) {
			return pack_xfr_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($accpt_dfct_flg.equalsIgnoreCase(name)) {
			return accpt_dfct_flg();
		}
		if ($no_gi_alloc_flg.equalsIgnoreCase(name)) {
			return no_gi_alloc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($gi_gd_cd.equalsIgnoreCase(name)) {
			gi_gd_cd(value);
			return;
		}
		if ($gr_gd_cd.equalsIgnoreCase(name)) {
			gr_gd_cd(value);
			return;
		}
		if ($pack_xfr_unit_cd.equalsIgnoreCase(name)) {
			pack_xfr_unit_cd(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			arr_ptn_typ(value);
			return;
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($wia_io_typ.equalsIgnoreCase(name)) {
			wia_io_typ(value);
			return;
		}
		if ($par_slip_io_act_typ.equalsIgnoreCase(name)) {
			par_slip_io_act_typ(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($org_gi_loc_cd.equalsIgnoreCase(name)) {
			org_gi_loc_cd(value);
			return;
		}
		if ($org_gr_loc_cd.equalsIgnoreCase(name)) {
			org_gr_loc_cd(value);
			return;
		}
		if ($acxfr_stk_id_typ.equalsIgnoreCase(name)) {
			acxfr_stk_id_typ(value);
			return;
		}
		if ($acxfr_stk_bp_cd.equalsIgnoreCase(name)) {
			acxfr_stk_bp_cd(value);
			return;
		}
		if ($acxfr_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			acxfr_stk_arrv_bp_cd(value);
			return;
		}
		if ($rsn_cd2.equalsIgnoreCase(name)) {
			rsn_cd2(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($stktk_diff_qty.equalsIgnoreCase(name)) {
			stktk_diff_qty(value);
			return;
		}
		if ($pack_xfr_qty.equalsIgnoreCase(name)) {
			pack_xfr_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($stktk_diff_qty.equalsIgnoreCase(name)) {
			stktk_diff_qty(value);
			return;
		}
		if ($pack_xfr_qty.equalsIgnoreCase(name)) {
			pack_xfr_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($stktk_diff_qty.equalsIgnoreCase(name)) {
			stktk_diff_qty(value);
			return;
		}
		if ($pack_xfr_qty.equalsIgnoreCase(name)) {
			pack_xfr_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($stktk_diff_qty.equalsIgnoreCase(name)) {
			stktk_diff_qty(value);
			return;
		}
		if ($pack_xfr_qty.equalsIgnoreCase(name)) {
			pack_xfr_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($stktk_diff_qty.equalsIgnoreCase(name)) {
			stktk_diff_qty(value);
			return;
		}
		if ($pack_xfr_qty.equalsIgnoreCase(name)) {
			pack_xfr_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($accpt_dfct_flg.equalsIgnoreCase(name)) {
			accpt_dfct_flg(value);
			return;
		}
		if ($no_gi_alloc_flg.equalsIgnoreCase(name)) {
			no_gi_alloc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($gi_gd_cd.equalsIgnoreCase(name)) {
			gi_gd_cd(value);
			return;
		}
		if ($gr_gd_cd.equalsIgnoreCase(name)) {
			gr_gd_cd(value);
			return;
		}
		if ($pack_xfr_unit_cd.equalsIgnoreCase(name)) {
			pack_xfr_unit_cd(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			arr_ptn_typ(value);
			return;
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($wia_io_typ.equalsIgnoreCase(name)) {
			wia_io_typ(value);
			return;
		}
		if ($par_slip_io_act_typ.equalsIgnoreCase(name)) {
			par_slip_io_act_typ(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($org_gi_loc_cd.equalsIgnoreCase(name)) {
			org_gi_loc_cd(value);
			return;
		}
		if ($org_gr_loc_cd.equalsIgnoreCase(name)) {
			org_gr_loc_cd(value);
			return;
		}
		if ($acxfr_stk_id_typ.equalsIgnoreCase(name)) {
			acxfr_stk_id_typ(value);
			return;
		}
		if ($acxfr_stk_bp_cd.equalsIgnoreCase(name)) {
			acxfr_stk_bp_cd(value);
			return;
		}
		if ($acxfr_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			acxfr_stk_arrv_bp_cd(value);
			return;
		}
		if ($rsn_cd2.equalsIgnoreCase(name)) {
			rsn_cd2(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($stktk_diff_qty.equalsIgnoreCase(name)) {
			stktk_diff_qty(value);
			return;
		}
		if ($pack_xfr_qty.equalsIgnoreCase(name)) {
			pack_xfr_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($stktk_diff_qty.equalsIgnoreCase(name)) {
			stktk_diff_qty(value);
			return;
		}
		if ($pack_xfr_qty.equalsIgnoreCase(name)) {
			pack_xfr_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($stktk_diff_qty.equalsIgnoreCase(name)) {
			stktk_diff_qty(value);
			return;
		}
		if ($pack_xfr_qty.equalsIgnoreCase(name)) {
			pack_xfr_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($stktk_diff_qty.equalsIgnoreCase(name)) {
			stktk_diff_qty(value);
			return;
		}
		if ($pack_xfr_qty.equalsIgnoreCase(name)) {
			pack_xfr_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($stktk_diff_qty.equalsIgnoreCase(name)) {
			stktk_diff_qty(value);
			return;
		}
		if ($pack_xfr_qty.equalsIgnoreCase(name)) {
			pack_xfr_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($accpt_dfct_flg.equalsIgnoreCase(name)) {
			accpt_dfct_flg(value);
			return;
		}
		if ($no_gi_alloc_flg.equalsIgnoreCase(name)) {
			no_gi_alloc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($tia.equalsIgnoreCase(name)) {
			return tia();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($tia.equalsIgnoreCase(name)) {
			tia(
				((MCContainerMeta) tia_META).castInnerRow(mcframe.serverMS.dbc.MST_IO_ACT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Slip No. 伝票ＮＯ.<p>
	 *
	 */
	public String slip_no() {
		return tia().slip_no();
	}

	/**
	 * Slip No. 伝票ＮＯ.<p>
	 *
	 */
	public void slip_no(String value) {
		tia().slip_no(value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public MCNumber slip_seq_no() {
		return tia().slip_seq_no();
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(MCNumber value) {
		tia().slip_seq_no(value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(int value) {
		tia().slip_seq_no(value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(long value) {
		tia().slip_seq_no(value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(float value) {
		tia().slip_seq_no(value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(double value) {
		tia().slip_seq_no(value);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return tia().ac_ym();
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		tia().ac_ym(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return tia().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		tia().ac_dt(value);
	}

	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public MCDate act_tm() {
		return tia().act_tm();
	}

	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public void act_tm(MCDate value) {
		tia().act_tm(value);
	}

	/**
	 * Slip rev. number 伝票改訂番号.<p>
	 *
	 */
	public MCNumber slip_rev_no() {
		return tia().slip_rev_no();
	}

	/**
	 * Slip rev. number 伝票改訂番号.<p>
	 *
	 */
	public void slip_rev_no(MCNumber value) {
		tia().slip_rev_no(value);
	}

	/**
	 * Slip rev. number 伝票改訂番号.<p>
	 *
	 */
	public void slip_rev_no(int value) {
		tia().slip_rev_no(value);
	}

	/**
	 * Slip rev. number 伝票改訂番号.<p>
	 *
	 */
	public void slip_rev_no(long value) {
		tia().slip_rev_no(value);
	}

	/**
	 * Slip rev. number 伝票改訂番号.<p>
	 *
	 */
	public void slip_rev_no(float value) {
		tia().slip_rev_no(value);
	}

	/**
	 * Slip rev. number 伝票改訂番号.<p>
	 *
	 */
	public void slip_rev_no(double value) {
		tia().slip_rev_no(value);
	}

	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public String act_no() {
		return tia().act_no();
	}

	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public void act_no(String value) {
		tia().act_no(value);
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public MCNumber act_seq() {
		return tia().act_seq();
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public void act_seq(MCNumber value) {
		tia().act_seq(value);
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public void act_seq(int value) {
		tia().act_seq(value);
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public void act_seq(long value) {
		tia().act_seq(value);
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public void act_seq(float value) {
		tia().act_seq(value);
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public void act_seq(double value) {
		tia().act_seq(value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public MCNumber act_rev_no() {
		return tia().act_rev_no();
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev_no(MCNumber value) {
		tia().act_rev_no(value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev_no(int value) {
		tia().act_rev_no(value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev_no(long value) {
		tia().act_rev_no(value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev_no(float value) {
		tia().act_rev_no(value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev_no(double value) {
		tia().act_rev_no(value);
	}

	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public String act_d_no() {
		return tia().act_d_no();
	}

	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public void act_d_no(String value) {
		tia().act_d_no(value);
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public MCNumber act_d_seq() {
		return tia().act_d_seq();
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public void act_d_seq(MCNumber value) {
		tia().act_d_seq(value);
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public void act_d_seq(int value) {
		tia().act_d_seq(value);
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public void act_d_seq(long value) {
		tia().act_d_seq(value);
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public void act_d_seq(float value) {
		tia().act_d_seq(value);
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public void act_d_seq(double value) {
		tia().act_d_seq(value);
	}

	/**
	 * Result GR/GI No. 実績受払ＮＯ.<p>
	 *
	 */
	public String act_io_no() {
		return tia().act_io_no();
	}

	/**
	 * Result GR/GI No. 実績受払ＮＯ.<p>
	 *
	 */
	public void act_io_no(String value) {
		tia().act_io_no(value);
	}

	/**
	 * Result GR/GI sequence number 実績受払連番.<p>
	 *
	 */
	public MCNumber act_io_seq() {
		return tia().act_io_seq();
	}

	/**
	 * Result GR/GI sequence number 実績受払連番.<p>
	 *
	 */
	public void act_io_seq(MCNumber value) {
		tia().act_io_seq(value);
	}

	/**
	 * Result GR/GI sequence number 実績受払連番.<p>
	 *
	 */
	public void act_io_seq(int value) {
		tia().act_io_seq(value);
	}

	/**
	 * Result GR/GI sequence number 実績受払連番.<p>
	 *
	 */
	public void act_io_seq(long value) {
		tia().act_io_seq(value);
	}

	/**
	 * Result GR/GI sequence number 実績受払連番.<p>
	 *
	 */
	public void act_io_seq(float value) {
		tia().act_io_seq(value);
	}

	/**
	 * Result GR/GI sequence number 実績受払連番.<p>
	 *
	 */
	public void act_io_seq(double value) {
		tia().act_io_seq(value);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return tia().slip_sts_typ();
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		tia().slip_sts_typ(value);
	}

	/**
	 * Amount unfirm 金額未確定.<p>
	 *
	 */
	public boolean un_fix_flg() {
		return tia().un_fix_flg();
	}

	/**
	 * Amount unfirm 金額未確定.<p>
	 *
	 */
	public void un_fix_flg(boolean value) {
		tia().un_fix_flg(value);
	}

	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public boolean temp_ap_flg() {
		return tia().temp_ap_flg();
	}

	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public void temp_ap_flg(boolean value) {
		tia().temp_ap_flg(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return tia().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		tia().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return tia().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		tia().trd_ptn_typ(value);
	}

	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public String trn_typ() {
		return tia().trn_typ();
	}

	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public void trn_typ(String value) {
		tia().trn_typ(value);
	}

	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public String io_act_typ() {
		return tia().io_act_typ();
	}

	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public void io_act_typ(String value) {
		tia().io_act_typ(value);
	}

	/**
	 * GR/GI type 入出庫区分.<p>
	 *
	 */
	public String io_typ() {
		return tia().io_typ();
	}

	/**
	 * GR/GI type 入出庫区分.<p>
	 *
	 */
	public void io_typ(String value) {
		tia().io_typ(value);
	}

	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public String ac_slip_typ() {
		return tia().ac_slip_typ();
	}

	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		tia().ac_slip_typ(value);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return tia().rsn_cd();
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		tia().rsn_cd(value);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return tia().ac_rsn_cd();
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		tia().ac_rsn_cd(value);
	}

	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gi_wg_cd() {
		return tia().gi_wg_cd();
	}

	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gi_wg_cd(String value) {
		tia().gi_wg_cd(value);
	}

	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gr_wg_cd() {
		return tia().gr_wg_cd();
	}

	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gr_wg_cd(String value) {
		tia().gr_wg_cd(value);
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return tia().act_dpt_cd();
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		tia().act_dpt_cd(value);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return tia().purc_dpt_cd();
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		tia().purc_dpt_cd(value);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return tia().ap_dpt_cd();
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		tia().ap_dpt_cd(value);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return tia().sls_dpt_cd();
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		tia().sls_dpt_cd(value);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return tia().ar_dpt_cd();
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		tia().ar_dpt_cd(value);
	}

	/**
	 * GI dept. cd. 出庫部門ＣＤ.<p>
	 *
	 */
	public String gi_dpt_cd() {
		return tia().gi_dpt_cd();
	}

	/**
	 * GI dept. cd. 出庫部門ＣＤ.<p>
	 *
	 */
	public void gi_dpt_cd(String value) {
		tia().gi_dpt_cd(value);
	}

	/**
	 * GR dept. cd. 入庫部門ＣＤ.<p>
	 *
	 */
	public String gr_dpt_cd() {
		return tia().gr_dpt_cd();
	}

	/**
	 * GR dept. cd. 入庫部門ＣＤ.<p>
	 *
	 */
	public void gr_dpt_cd(String value) {
		tia().gr_dpt_cd(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return tia().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		tia().bd_dpt_cd(value);
	}

	/**
	 * Spare dept. cd. 1 予備部門ＣＤ１.<p>
	 *
	 */
	public String sub_dpt_cd1() {
		return tia().sub_dpt_cd1();
	}

	/**
	 * Spare dept. cd. 1 予備部門ＣＤ１.<p>
	 *
	 */
	public void sub_dpt_cd1(String value) {
		tia().sub_dpt_cd1(value);
	}

	/**
	 * Spare dept. cd. 2 予備部門ＣＤ２.<p>
	 *
	 */
	public String sub_dpt_cd2() {
		return tia().sub_dpt_cd2();
	}

	/**
	 * Spare dept. cd. 2 予備部門ＣＤ２.<p>
	 *
	 */
	public void sub_dpt_cd2(String value) {
		tia().sub_dpt_cd2(value);
	}

	/**
	 * Spare dept. cd. 3 予備部門ＣＤ３.<p>
	 *
	 */
	public String sub_dpt_cd3() {
		return tia().sub_dpt_cd3();
	}

	/**
	 * Spare dept. cd. 3 予備部門ＣＤ３.<p>
	 *
	 */
	public void sub_dpt_cd3(String value) {
		tia().sub_dpt_cd3(value);
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return tia().act_usr_cd();
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		tia().act_usr_cd(value);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return tia().sls_usr_cd();
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		tia().sls_usr_cd(value);
	}

	/**
	 * Mfg. PIC cd. 製造担当者ＣＤ.<p>
	 *
	 */
	public String mfg_usr_cd() {
		return tia().mfg_usr_cd();
	}

	/**
	 * Mfg. PIC cd. 製造担当者ＣＤ.<p>
	 *
	 */
	public void mfg_usr_cd(String value) {
		tia().mfg_usr_cd(value);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return tia().purc_usr_cd();
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		tia().purc_usr_cd(value);
	}

	/**
	 * Accounting item classification cd. 会計品目分類ＣＤ.<p>
	 *
	 */
	public String ac_itm_grp_cd() {
		return tia().ac_itm_grp_cd();
	}

	/**
	 * Accounting item classification cd. 会計品目分類ＣＤ.<p>
	 *
	 */
	public void ac_itm_grp_cd(String value) {
		tia().ac_itm_grp_cd(value);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return tia().itm_jnl_cd();
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		tia().itm_jnl_cd(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return tia().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		tia().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return tia().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		tia().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return tia().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		tia().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return tia().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		tia().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return tia().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		tia().itm_nm(value);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return tia().stk_mng_typ();
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		tia().stk_mng_typ(value);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return tia().asset_mng_typ();
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		tia().asset_mng_typ(value);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return tia().sundry_itm_flg();
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		tia().sundry_itm_flg(value);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return tia().loc_cd();
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		tia().loc_cd(value);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return tia().str_ln_cd();
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		tia().str_ln_cd(value);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return tia().stk_arrv_bp_cd();
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		tia().stk_arrv_bp_cd(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return tia().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		tia().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return tia().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		tia().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return tia().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		tia().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return tia().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		tia().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return tia().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		tia().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return tia().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		tia().sno4(value);
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public String fix_no_typ() {
		return tia().fix_no_typ();
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public void fix_no_typ(String value) {
		tia().fix_no_typ(value);
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public String fix_no() {
		return tia().fix_no();
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public void fix_no(String value) {
		tia().fix_no(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return tia().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		tia().gd_cd(value);
	}

	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public String in_xfr_typ() {
		return tia().in_xfr_typ();
	}

	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public void in_xfr_typ(String value) {
		tia().in_xfr_typ(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return tia().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		tia().quality_typ(value);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return tia().asst_typ();
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		tia().asst_typ(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return tia().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		tia().stk_insp_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return tia().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		tia().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return tia().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		tia().stk_bp_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return tia().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		tia().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		tia().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		tia().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		tia().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		tia().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return tia().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		tia().trd_unit_cd(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return tia().pack_unit_qty();
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		tia().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		tia().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		tia().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		tia().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		tia().pack_unit_qty(value);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return tia().pack_unit_cd();
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		tia().pack_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return tia().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		tia().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		tia().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		tia().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		tia().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		tia().base_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return tia().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		tia().base_unit_cd(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return tia().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		tia().trd_cur_cd(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return tia().trd_cur_upri();
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		tia().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		tia().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		tia().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		tia().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		tia().trd_cur_upri(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return tia().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		tia().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		tia().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		tia().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		tia().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		tia().trd_cur_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return tia().trd_cur_proc_amt();
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		tia().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		tia().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		tia().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		tia().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		tia().trd_cur_proc_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return tia().trd_cur_onr_prov_amt();
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		tia().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		tia().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		tia().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		tia().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		tia().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return tia().trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		tia().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		tia().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		tia().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		tia().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		tia().trd_cur_tax_amt(value);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return tia().base_cur_cd();
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		tia().base_cur_cd(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return tia().base_cur_upri();
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		tia().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		tia().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		tia().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		tia().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		tia().base_cur_upri(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return tia().base_cur_amt();
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		tia().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		tia().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		tia().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		tia().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		tia().base_cur_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public MCNumber base_cur_proc_amt() {
		return tia().base_cur_proc_amt();
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(MCNumber value) {
		tia().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(int value) {
		tia().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(long value) {
		tia().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(float value) {
		tia().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(double value) {
		tia().base_cur_proc_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_amt() {
		return tia().base_cur_onr_prov_amt();
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(MCNumber value) {
		tia().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(int value) {
		tia().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(long value) {
		tia().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(float value) {
		tia().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(double value) {
		tia().base_cur_onr_prov_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return tia().base_cur_tax_amt();
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		tia().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		tia().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		tia().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		tia().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		tia().base_cur_tax_amt(value);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return tia().ptax_cur_cd();
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		tia().ptax_cur_cd(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public MCNumber ptax_cur_upri() {
		return tia().ptax_cur_upri();
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(MCNumber value) {
		tia().ptax_cur_upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(int value) {
		tia().ptax_cur_upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(long value) {
		tia().ptax_cur_upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(float value) {
		tia().ptax_cur_upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(double value) {
		tia().ptax_cur_upri(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return tia().ptax_cur_amt();
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		tia().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		tia().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		tia().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		tia().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		tia().ptax_cur_amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public MCNumber ptax_cur_proc_amt() {
		return tia().ptax_cur_proc_amt();
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(MCNumber value) {
		tia().ptax_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(int value) {
		tia().ptax_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(long value) {
		tia().ptax_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(float value) {
		tia().ptax_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(double value) {
		tia().ptax_cur_proc_amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public MCNumber ptax_cur_onr_prov_amt() {
		return tia().ptax_cur_onr_prov_amt();
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(MCNumber value) {
		tia().ptax_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(int value) {
		tia().ptax_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(long value) {
		tia().ptax_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(float value) {
		tia().ptax_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(double value) {
		tia().ptax_cur_onr_prov_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public MCNumber ptax_cur_tax_amt() {
		return tia().ptax_cur_tax_amt();
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(MCNumber value) {
		tia().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(int value) {
		tia().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(long value) {
		tia().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(float value) {
		tia().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(double value) {
		tia().ptax_cur_tax_amt(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return tia().wtax_rate();
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		tia().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		tia().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		tia().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		tia().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		tia().wtax_rate(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return tia().wtax_amt();
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		tia().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		tia().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		tia().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		tia().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		tia().wtax_amt(value);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return tia().tax_cd();
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		tia().tax_cd(value);
	}

	/**
	 * Foreign transaction 国外取引.<p>
	 *
	 */
	public boolean foreign_flg() {
		return tia().foreign_flg();
	}

	/**
	 * Foreign transaction 国外取引.<p>
	 *
	 */
	public void foreign_flg(boolean value) {
		tia().foreign_flg(value);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return tia().xrate_cd();
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		tia().xrate_cd(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return tia().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		tia().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		tia().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		tia().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		tia().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		tia().xrate(value);
	}

	/**
	 * Taxpaying exchange rate cd. 納税為替レートＣＤ.<p>
	 *
	 */
	public String ptax_xrate_cd() {
		return tia().ptax_xrate_cd();
	}

	/**
	 * Taxpaying exchange rate cd. 納税為替レートＣＤ.<p>
	 *
	 */
	public void ptax_xrate_cd(String value) {
		tia().ptax_xrate_cd(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return tia().ptax_xrate();
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		tia().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		tia().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		tia().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		tia().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		tia().ptax_xrate(value);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return tia().slo_no();
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		tia().slo_no(value);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return tia().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		tia().po_no(value);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return tia().iv_no();
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		tia().iv_no(value);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return tia().rcpt_iv_no();
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		tia().rcpt_iv_no(value);
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public String bd_ctg_cd() {
		return tia().bd_ctg_cd();
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public void bd_ctg_cd(String value) {
		tia().bd_ctg_cd(value);
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public String bd_bp_cd() {
		return tia().bd_bp_cd();
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public void bd_bp_cd(String value) {
		tia().bd_bp_cd(value);
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public String bd_oper_cd() {
		return tia().bd_oper_cd();
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public void bd_oper_cd(String value) {
		tia().bd_oper_cd(value);
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public String bd_loc_cd() {
		return tia().bd_loc_cd();
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public void bd_loc_cd(String value) {
		tia().bd_loc_cd(value);
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public String bd_slo_no() {
		return tia().bd_slo_no();
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public void bd_slo_no(String value) {
		tia().bd_slo_no(value);
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public String bd_po_no() {
		return tia().bd_po_no();
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public void bd_po_no(String value) {
		tia().bd_po_no(value);
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public String bd_iv_no() {
		return tia().bd_iv_no();
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public void bd_iv_no(String value) {
		tia().bd_iv_no(value);
	}

	/**
	 * Charged WG cd. 負担ワーキンググループＣＤ.<p>
	 *
	 */
	public String bd_wg_cd() {
		return tia().bd_wg_cd();
	}

	/**
	 * Charged WG cd. 負担ワーキンググループＣＤ.<p>
	 *
	 */
	public void bd_wg_cd(String value) {
		tia().bd_wg_cd(value);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return tia().dlv_cd();
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		tia().dlv_cd(value);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return tia().tdlv_cd();
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		tia().tdlv_cd(value);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return tia().rcst_cd();
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		tia().rcst_cd(value);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return tia().bcst_cd();
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		tia().bcst_cd(value);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return tia().acst_cd();
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		tia().acst_cd(value);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return tia().cst_cd();
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		tia().cst_cd(value);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return tia().dest_cd1();
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		tia().dest_cd1(value);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return tia().dest_cd2();
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		tia().dest_cd2(value);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return tia().dest_cd3();
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		tia().dest_cd3(value);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return tia().psppl_cd();
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		tia().psppl_cd(value);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return tia().bsppl_cd();
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		tia().bsppl_cd(value);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return tia().asppl_cd();
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		tia().asppl_cd(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return tia().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		tia().sppl_cd(value);
	}

	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public String cred_cd() {
		return tia().cred_cd();
	}

	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public void cred_cd(String value) {
		tia().cred_cd(value);
	}

	/**
	 * Settlement per transaction 都度精算.<p>
	 *
	 */
	public boolean spot_flg() {
		return tia().spot_flg();
	}

	/**
	 * Settlement per transaction 都度精算.<p>
	 *
	 */
	public void spot_flg(boolean value) {
		tia().spot_flg(value);
	}

	/**
	 * Scheduled settlement date 決済予定日.<p>
	 *
	 */
	public MCDate sttl_schd_dt() {
		return tia().sttl_schd_dt();
	}

	/**
	 * Scheduled settlement date 決済予定日.<p>
	 *
	 */
	public void sttl_schd_dt(MCDate value) {
		tia().sttl_schd_dt(value);
	}

	/**
	 * Settlement method cd. 決済方法ＣＤ.<p>
	 *
	 */
	public String sttl_cd() {
		return tia().sttl_cd();
	}

	/**
	 * Settlement method cd. 決済方法ＣＤ.<p>
	 *
	 */
	public void sttl_cd(String value) {
		tia().sttl_cd(value);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return tia().cst_itm_cd();
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		tia().cst_itm_cd(value);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return tia().cst_itm_nm();
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		tia().cst_itm_nm(value);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return tia().sppl_itm_cd();
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		tia().sppl_itm_cd(value);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return tia().sppl_itm_nm();
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		tia().sppl_itm_nm(value);
	}

	/**
	 * Purchase type 購買区分.<p>
	 *
	 */
	public String purc_typ() {
		return tia().purc_typ();
	}

	/**
	 * Purchase type 購買区分.<p>
	 *
	 */
	public void purc_typ(String value) {
		tia().purc_typ(value);
	}

	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public String area_cd() {
		return tia().area_cd();
	}

	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public void area_cd(String value) {
		tia().area_cd(value);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return tia().cntry_cd();
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		tia().cntry_cd(value);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return tia().itm_mfg_inst_no();
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		tia().itm_mfg_inst_no(value);
	}

	/**
	 * Item order qty. 品目指図数量.<p>
	 *
	 */
	public MCNumber itm_inst_qty() {
		return tia().itm_inst_qty();
	}

	/**
	 * Item order qty. 品目指図数量.<p>
	 *
	 */
	public void itm_inst_qty(MCNumber value) {
		tia().itm_inst_qty(value);
	}

	/**
	 * Item order qty. 品目指図数量.<p>
	 *
	 */
	public void itm_inst_qty(int value) {
		tia().itm_inst_qty(value);
	}

	/**
	 * Item order qty. 品目指図数量.<p>
	 *
	 */
	public void itm_inst_qty(long value) {
		tia().itm_inst_qty(value);
	}

	/**
	 * Item order qty. 品目指図数量.<p>
	 *
	 */
	public void itm_inst_qty(float value) {
		tia().itm_inst_qty(value);
	}

	/**
	 * Item order qty. 品目指図数量.<p>
	 *
	 */
	public void itm_inst_qty(double value) {
		tia().itm_inst_qty(value);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return tia().mfg_inst_no();
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		tia().mfg_inst_no(value);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return tia().mfg_act_no();
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		tia().mfg_act_no(value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public MCNumber mfg_st_qty() {
		return tia().mfg_st_qty();
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(MCNumber value) {
		tia().mfg_st_qty(value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(int value) {
		tia().mfg_st_qty(value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(long value) {
		tia().mfg_st_qty(value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(float value) {
		tia().mfg_st_qty(value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(double value) {
		tia().mfg_st_qty(value);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return tia().oper_act_no();
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		tia().oper_act_no(value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public MCNumber yield_rate() {
		return tia().yield_rate();
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(MCNumber value) {
		tia().yield_rate(value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(int value) {
		tia().yield_rate(value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(long value) {
		tia().yield_rate(value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(float value) {
		tia().yield_rate(value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(double value) {
		tia().yield_rate(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return tia().disp_seq();
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		tia().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		tia().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		tia().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		tia().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		tia().disp_seq(value);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return tia().oper_cd();
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		tia().oper_cd(value);
	}

	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public String inpt_loc_cd() {
		return tia().inpt_loc_cd();
	}

	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public void inpt_loc_cd(String value) {
		tia().inpt_loc_cd(value);
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public String inpt_str_ln_cd() {
		return tia().inpt_str_ln_cd();
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public void inpt_str_ln_cd(String value) {
		tia().inpt_str_ln_cd(value);
	}

	/**
	 * Subcontracting mfg. location cd. 外注製造場所ＣＤ.<p>
	 *
	 */
	public String outsrc_mfg_loc_cd() {
		return tia().outsrc_mfg_loc_cd();
	}

	/**
	 * Subcontracting mfg. location cd. 外注製造場所ＣＤ.<p>
	 *
	 */
	public void outsrc_mfg_loc_cd(String value) {
		tia().outsrc_mfg_loc_cd(value);
	}

	/**
	 * Subcontracting mfg. location dept. cd. 外注製造場所部門ＣＤ.<p>
	 *
	 */
	public String outsrc_mfg_loc_dpt_cd() {
		return tia().outsrc_mfg_loc_dpt_cd();
	}

	/**
	 * Subcontracting mfg. location dept. cd. 外注製造場所部門ＣＤ.<p>
	 *
	 */
	public void outsrc_mfg_loc_dpt_cd(String value) {
		tia().outsrc_mfg_loc_dpt_cd(value);
	}

	/**
	 * Subcontracting mfg. location WG cd. 外注製造場所ワーキンググループＣＤ.<p>
	 *
	 */
	public String outsrc_mfg_loc_wg_cd() {
		return tia().outsrc_mfg_loc_wg_cd();
	}

	/**
	 * Subcontracting mfg. location WG cd. 外注製造場所ワーキンググループＣＤ.<p>
	 *
	 */
	public void outsrc_mfg_loc_wg_cd(String value) {
		tia().outsrc_mfg_loc_wg_cd(value);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return tia().strg_loc_cd();
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		tia().strg_loc_cd(value);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return tia().strg_str_ln_cd();
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		tia().strg_str_ln_cd(value);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return tia().mfg_inst_unit_typ();
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		tia().mfg_inst_unit_typ(value);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return tia().gi_loc_cd();
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		tia().gi_loc_cd(value);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return tia().gr_loc_cd();
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		tia().gr_loc_cd(value);
	}

	/**
	 * Base date of inventory count 棚卸基準日.<p>
	 *
	 */
	public MCDate stktk_base_dt() {
		return tia().stktk_base_dt();
	}

	/**
	 * Base date of inventory count 棚卸基準日.<p>
	 *
	 */
	public void stktk_base_dt(MCDate value) {
		tia().stktk_base_dt(value);
	}

	/**
	 * Parent accounting item classification cd. 親会計品目分類ＣＤ.<p>
	 *
	 */
	public String par_ac_itm_grp_cd() {
		return tia().par_ac_itm_grp_cd();
	}

	/**
	 * Parent accounting item classification cd. 親会計品目分類ＣＤ.<p>
	 *
	 */
	public void par_ac_itm_grp_cd(String value) {
		tia().par_ac_itm_grp_cd(value);
	}

	/**
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public String par_itm_jnl_cd() {
		return tia().par_itm_jnl_cd();
	}

	/**
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public void par_itm_jnl_cd(String value) {
		tia().par_itm_jnl_cd(value);
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return tia().par_itm_cd();
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		tia().par_itm_cd(value);
	}

	/**
	 * Parent item branch No. 1 親品目枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return tia().par_itm_sub1();
	}

	/**
	 * Parent item branch No. 1 親品目枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		tia().par_itm_sub1(value);
	}

	/**
	 * Parent item branch No. 2 親品目枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return tia().par_itm_sub2();
	}

	/**
	 * Parent item branch No. 2 親品目枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		tia().par_itm_sub2(value);
	}

	/**
	 * Parent item branch No. 3 親品目枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return tia().par_itm_sub3();
	}

	/**
	 * Parent item branch No. 3 親品目枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		tia().par_itm_sub3(value);
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return tia().par_itm_nm();
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		tia().par_itm_nm(value);
	}

	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public String par_lot_no() {
		return tia().par_lot_no();
	}

	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public void par_lot_no(String value) {
		tia().par_lot_no(value);
	}

	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public String par_sublot_no() {
		return tia().par_sublot_no();
	}

	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public void par_sublot_no(String value) {
		tia().par_sublot_no(value);
	}

	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public String par_sno1() {
		return tia().par_sno1();
	}

	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public void par_sno1(String value) {
		tia().par_sno1(value);
	}

	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public String par_sno2() {
		return tia().par_sno2();
	}

	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public void par_sno2(String value) {
		tia().par_sno2(value);
	}

	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public String par_sno3() {
		return tia().par_sno3();
	}

	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public void par_sno3(String value) {
		tia().par_sno3(value);
	}

	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public String par_sno4() {
		return tia().par_sno4();
	}

	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public void par_sno4(String value) {
		tia().par_sno4(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return tia().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		tia().trd_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return tia().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		tia().trd_d_rmrks(value);
	}

	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String sub_char1() {
		return tia().sub_char1();
	}

	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void sub_char1(String value) {
		tia().sub_char1(value);
	}

	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String sub_char2() {
		return tia().sub_char2();
	}

	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void sub_char2(String value) {
		tia().sub_char2(value);
	}

	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String sub_char3() {
		return tia().sub_char3();
	}

	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void sub_char3(String value) {
		tia().sub_char3(value);
	}

	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String sub_char4() {
		return tia().sub_char4();
	}

	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void sub_char4(String value) {
		tia().sub_char4(value);
	}

	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String sub_char5() {
		return tia().sub_char5();
	}

	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void sub_char5(String value) {
		tia().sub_char5(value);
	}

	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String sub_char6() {
		return tia().sub_char6();
	}

	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void sub_char6(String value) {
		tia().sub_char6(value);
	}

	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String sub_char7() {
		return tia().sub_char7();
	}

	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void sub_char7(String value) {
		tia().sub_char7(value);
	}

	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String sub_char8() {
		return tia().sub_char8();
	}

	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void sub_char8(String value) {
		tia().sub_char8(value);
	}

	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String sub_char9() {
		return tia().sub_char9();
	}

	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void sub_char9(String value) {
		tia().sub_char9(value);
	}

	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String sub_char10() {
		return tia().sub_char10();
	}

	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void sub_char10(String value) {
		tia().sub_char10(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return tia().sub_num1();
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		tia().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(int value) {
		tia().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(long value) {
		tia().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(float value) {
		tia().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(double value) {
		tia().sub_num1(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return tia().sub_num2();
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		tia().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(int value) {
		tia().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(long value) {
		tia().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(float value) {
		tia().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(double value) {
		tia().sub_num2(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return tia().sub_num3();
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		tia().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(int value) {
		tia().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(long value) {
		tia().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(float value) {
		tia().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(double value) {
		tia().sub_num3(value);
	}

	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return tia().sub_dt1();
	}

	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		tia().sub_dt1(value);
	}

	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return tia().sub_dt2();
	}

	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		tia().sub_dt2(value);
	}

	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return tia().sub_dt3();
	}

	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		tia().sub_dt3(value);
	}

	/**
	 * Parent slip No. 親伝票ＮＯ.<p>
	 *
	 */
	public String par_slip_no() {
		return tia().par_slip_no();
	}

	/**
	 * Parent slip No. 親伝票ＮＯ.<p>
	 *
	 */
	public void par_slip_no(String value) {
		tia().par_slip_no(value);
	}

	/**
	 * Parent slip sequence number 親伝票連番.<p>
	 *
	 */
	public MCNumber par_slip_seq_no() {
		return tia().par_slip_seq_no();
	}

	/**
	 * Parent slip sequence number 親伝票連番.<p>
	 *
	 */
	public void par_slip_seq_no(MCNumber value) {
		tia().par_slip_seq_no(value);
	}

	/**
	 * Parent slip sequence number 親伝票連番.<p>
	 *
	 */
	public void par_slip_seq_no(int value) {
		tia().par_slip_seq_no(value);
	}

	/**
	 * Parent slip sequence number 親伝票連番.<p>
	 *
	 */
	public void par_slip_seq_no(long value) {
		tia().par_slip_seq_no(value);
	}

	/**
	 * Parent slip sequence number 親伝票連番.<p>
	 *
	 */
	public void par_slip_seq_no(float value) {
		tia().par_slip_seq_no(value);
	}

	/**
	 * Parent slip sequence number 親伝票連番.<p>
	 *
	 */
	public void par_slip_seq_no(double value) {
		tia().par_slip_seq_no(value);
	}

	/**
	 * Completion 補完.<p>
	 *
	 */
	public boolean slip_cmpl_flg() {
		return tia().slip_cmpl_flg();
	}

	/**
	 * Completion 補完.<p>
	 *
	 */
	public void slip_cmpl_flg(boolean value) {
		tia().slip_cmpl_flg(value);
	}

	/**
	 * To be exported 送信対象.<p>
	 *
	 */
	public boolean send_flg() {
		return tia().send_flg();
	}

	/**
	 * To be exported 送信対象.<p>
	 *
	 */
	public void send_flg(boolean value) {
		tia().send_flg(value);
	}

	/**
	 * Cost imported 原価取込済.<p>
	 *
	 */
	public boolean c_imp_flg() {
		return tia().c_imp_flg();
	}

	/**
	 * Cost imported 原価取込済.<p>
	 *
	 */
	public void c_imp_flg(boolean value) {
		tia().c_imp_flg(value);
	}

	/**
	 * Accounting IF Imported 会計ＩＦ取込済.<p>
	 *
	 */
	public boolean a_imp_flg() {
		return tia().a_imp_flg();
	}

	/**
	 * Accounting IF Imported 会計ＩＦ取込済.<p>
	 *
	 */
	public void a_imp_flg(boolean value) {
		tia().a_imp_flg(value);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return tia().repurc_obli_flg();
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		tia().repurc_obli_flg(value);
	}

}

