package mcframe.clientMSBE.MSBEP0030;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Closing month 締月度.<p>
	 *
	 */
	public static final String $mly_io_cl_ym = "mly_io_cl_ym";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	public static final String $itm_p = "itm_p";
	public static final String $ver_no_p = "ver_no_p";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	public static final String $str_ln_p = "str_ln_p";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public static final String $alloc_grp_nm = "alloc_grp_nm";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public static final String $in_xfr_typ = "in_xfr_typ";
	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public static final String $in_xfr_typ_nm = "in_xfr_typ_nm";
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public static final String $quality_typ_nm = "quality_typ_nm";
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public static final String $stk_insp_typ_nm = "stk_insp_typ_nm";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public static final String $asst_typ_nm = "asst_typ_nm";
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public static final String $stk_id_typ_nm = "stk_id_typ_nm";
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public static final String $fix_no_typ = "fix_no_typ";
	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public static final String $fix_no_typ_nm = "fix_no_typ_nm";
	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public static final String $fix_no = "fix_no";
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public static final String $stk_arrv_bp_nm = "stk_arrv_bp_nm";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public static final String $rnd_typ = "rnd_typ";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	/**
	 * Currency unit number of decimal places 通貨単位小数有効桁数.<p>
	 *
	 */
	public static final String $base_cur_dec_place = "base_cur_dec_place";
	/**
	 * Currency unit rounding type 通貨単位端数処理区分.<p>
	 *
	 */
	public static final String $base_cur_rnd_typ = "base_cur_rnd_typ";
	public static final String $ini_stk_qty_p = "ini_stk_qty_p";
	public static final String $gr_total_qty_p = "gr_total_qty_p";
	public static final String $arr_qty_p = "arr_qty_p";
	public static final String $purc_gr_qty_p = "purc_gr_qty_p";
	public static final String $onr_rcv_gr_qty_p = "onr_rcv_gr_qty_p";
	public static final String $purc_rtn_gr_qty_p = "purc_rtn_gr_qty_p";
	public static final String $onr_rcv_ret_gr_qty_p = "onr_rcv_ret_gr_qty_p";
	public static final String $xpns_purc_gr_qty_p = "xpns_purc_gr_qty_p";
	public static final String $xpns_purc_rtn_gr_qty_p = "xpns_purc_rtn_gr_qty_p";
	public static final String $accpt_dfct_gr_qty_p = "accpt_dfct_gr_qty_p";
	public static final String $mfg_qty_p = "mfg_qty_p";
	public static final String $bymfg_qty_p = "bymfg_qty_p";
	public static final String $ffr_prov_gr_qty_p = "ffr_prov_gr_qty_p";
	public static final String $onr_prov_gr_qty_p = "onr_prov_gr_qty_p";
	public static final String $ffr_prov_rtn_gr_qty_p = "ffr_prov_rtn_gr_qty_p";
	public static final String $onr_prov_rtn_gr_qty_p = "onr_prov_rtn_gr_qty_p";
	public static final String $insp_gr_qty_p = "insp_gr_qty_p";
	public static final String $insp_cmpl_gr_qty_p = "insp_cmpl_gr_qty_p";
	public static final String $insp_judg_gr_qty_p = "insp_judg_gr_qty_p";
	public static final String $reinsp_gr_qty_p = "reinsp_gr_qty_p";
	public static final String $stk_adjst_gr_qty_p = "stk_adjst_gr_qty_p";
	public static final String $prdct_wh_gr_qty_p = "prdct_wh_gr_qty_p";
	public static final String $prdct_wh_rtn_gr_qty_p = "prdct_wh_rtn_gr_qty_p";
	public static final String $xfr_gr_qty_p = "xfr_gr_qty_p";
	public static final String $xfr_in_qty_p = "xfr_in_qty_p";
	public static final String $purc_xfr_in_qty_p = "purc_xfr_in_qty_p";
	public static final String $xfr_rtn_gr_qty_p = "xfr_rtn_gr_qty_p";
	public static final String $acxfr_gr_qty_p = "acxfr_gr_qty_p";
	public static final String $arr_cststk_qty_p = "arr_cststk_qty_p";
	public static final String $xfr_itm_gr_qty_p = "xfr_itm_gr_qty_p";
	public static final String $xfr_lot_sno_gr_qty_p = "xfr_lot_sno_gr_qty_p";
	public static final String $xfr_grd_gr_qty_p = "xfr_grd_gr_qty_p";
	public static final String $xfr_pack_gr_qty_p = "xfr_pack_gr_qty_p";
	public static final String $ship_in_qty_p = "ship_in_qty_p";
	public static final String $ex_ship_in_qty_p = "ex_ship_in_qty_p";
	public static final String $ship_rtn_gr_qty_p = "ship_rtn_gr_qty_p";
	public static final String $sls_rtn_gr_qty_p = "sls_rtn_gr_qty_p";
	public static final String $gi_total_qty_p = "gi_total_qty_p";
	public static final String $arr_rtn_qty_p = "arr_rtn_qty_p";
	public static final String $purc_gi_qty_p = "purc_gi_qty_p";
	public static final String $onr_rcv_gi_qty_p = "onr_rcv_gi_qty_p";
	public static final String $purc_rtn_gi_qty_p = "purc_rtn_gi_qty_p";
	public static final String $onr_rcv_ret_gi_qty_p = "onr_rcv_ret_gi_qty_p";
	public static final String $xpns_purc_gi_qty_p = "xpns_purc_gi_qty_p";
	public static final String $xpns_purc_rtn_gi_qty_p = "xpns_purc_rtn_gi_qty_p";
	public static final String $accpt_dfct_gi_qty_p = "accpt_dfct_gi_qty_p";
	public static final String $inpt_qty_p = "inpt_qty_p";
	public static final String $loss_qty_p = "loss_qty_p";
	public static final String $ffr_prov_gi_qty_p = "ffr_prov_gi_qty_p";
	public static final String $onr_prov_gi_qty_p = "onr_prov_gi_qty_p";
	public static final String $ffr_prov_rtn_gi_qty_p = "ffr_prov_rtn_gi_qty_p";
	public static final String $onr_prov_rtn_gi_qty_p = "onr_prov_rtn_gi_qty_p";
	public static final String $insp_gi_qty_p = "insp_gi_qty_p";
	public static final String $insp_cmpl_gi_qty_p = "insp_cmpl_gi_qty_p";
	public static final String $insp_judg_gi_qty_p = "insp_judg_gi_qty_p";
	public static final String $reinsp_gi_qty_p = "reinsp_gi_qty_p";
	public static final String $insp_smpl_gi_qty_p = "insp_smpl_gi_qty_p";
	public static final String $stk_adjst_gi_qty_p = "stk_adjst_gi_qty_p";
	public static final String $prdct_wh_gi_qty_p = "prdct_wh_gi_qty_p";
	public static final String $prdct_wh_rtn_gi_qty_p = "prdct_wh_rtn_gi_qty_p";
	public static final String $xfr_gi_qty_p = "xfr_gi_qty_p";
	public static final String $xfr_out_qty_p = "xfr_out_qty_p";
	public static final String $purc_xfr_out_qty_p = "purc_xfr_out_qty_p";
	public static final String $xfr_rtn_gi_qty_p = "xfr_rtn_gi_qty_p";
	public static final String $acxfr_gi_qty_p = "acxfr_gi_qty_p";
	public static final String $scrp_qty_p = "scrp_qty_p";
	public static final String $xfr_itm_gi_qty_p = "xfr_itm_gi_qty_p";
	public static final String $xfr_lot_sno_gi_qty_p = "xfr_lot_sno_gi_qty_p";
	public static final String $xfr_grd_gi_qty_p = "xfr_grd_gi_qty_p";
	public static final String $xfr_pack_gi_qty_p = "xfr_pack_gi_qty_p";
	public static final String $ship_out_qty_p = "ship_out_qty_p";
	public static final String $ex_ship_out_qty_p = "ex_ship_out_qty_p";
	public static final String $ship_rtn_gi_qty_p = "ship_rtn_gi_qty_p";
	public static final String $sls_rtn_gi_qty_p = "sls_rtn_gi_qty_p";
	public static final String $sls_qty_p = "sls_qty_p";
	public static final String $end_stk_qty_p = "end_stk_qty_p";
	public static final String $ini_stk_amt_p = "ini_stk_amt_p";
	public static final String $gr_total_amt_p = "gr_total_amt_p";
	public static final String $arr_amt_p = "arr_amt_p";
	public static final String $purc_gr_amt_p = "purc_gr_amt_p";
	public static final String $onr_rcv_gr_amt_p = "onr_rcv_gr_amt_p";
	public static final String $purc_rtn_gr_amt_p = "purc_rtn_gr_amt_p";
	public static final String $onr_rcv_ret_gr_amt_p = "onr_rcv_ret_gr_amt_p";
	public static final String $xpns_purc_gr_amt_p = "xpns_purc_gr_amt_p";
	public static final String $xpns_purc_rtn_gr_amt_p = "xpns_purc_rtn_gr_amt_p";
	public static final String $accpt_dfct_gr_amt_p = "accpt_dfct_gr_amt_p";
	public static final String $mfg_amt_p = "mfg_amt_p";
	public static final String $bymfg_amt_p = "bymfg_amt_p";
	public static final String $ffr_prov_gr_amt_p = "ffr_prov_gr_amt_p";
	public static final String $onr_prov_gr_amt_p = "onr_prov_gr_amt_p";
	public static final String $ffr_prov_rtn_gr_amt_p = "ffr_prov_rtn_gr_amt_p";
	public static final String $onr_prov_rtn_gr_amt_p = "onr_prov_rtn_gr_amt_p";
	public static final String $insp_gr_amt_p = "insp_gr_amt_p";
	public static final String $insp_cmpl_gr_amt_p = "insp_cmpl_gr_amt_p";
	public static final String $insp_judg_gr_amt_p = "insp_judg_gr_amt_p";
	public static final String $reinsp_gr_amt_p = "reinsp_gr_amt_p";
	public static final String $stk_adjst_gr_amt_p = "stk_adjst_gr_amt_p";
	public static final String $prdct_wh_gr_amt_p = "prdct_wh_gr_amt_p";
	public static final String $prdct_wh_rtn_gr_amt_p = "prdct_wh_rtn_gr_amt_p";
	public static final String $xfr_gr_amt_p = "xfr_gr_amt_p";
	public static final String $xfr_in_amt_p = "xfr_in_amt_p";
	public static final String $purc_xfr_in_amt_p = "purc_xfr_in_amt_p";
	public static final String $xfr_rtn_gr_amt_p = "xfr_rtn_gr_amt_p";
	public static final String $acxfr_gr_amt_p = "acxfr_gr_amt_p";
	public static final String $arr_cststk_amt_p = "arr_cststk_amt_p";
	public static final String $xfr_itm_gr_amt_p = "xfr_itm_gr_amt_p";
	public static final String $xfr_lot_sno_gr_amt_p = "xfr_lot_sno_gr_amt_p";
	public static final String $xfr_grd_gr_amt_p = "xfr_grd_gr_amt_p";
	public static final String $xfr_pack_gr_amt_p = "xfr_pack_gr_amt_p";
	public static final String $ship_in_amt_p = "ship_in_amt_p";
	public static final String $ex_ship_in_amt_p = "ex_ship_in_amt_p";
	public static final String $ship_rtn_gr_amt_p = "ship_rtn_gr_amt_p";
	public static final String $sls_rtn_gr_amt_p = "sls_rtn_gr_amt_p";
	public static final String $gi_total_amt_p = "gi_total_amt_p";
	public static final String $arr_rtn_amt_p = "arr_rtn_amt_p";
	public static final String $purc_gi_amt_p = "purc_gi_amt_p";
	public static final String $onr_rcv_gi_amt_p = "onr_rcv_gi_amt_p";
	public static final String $purc_rtn_gi_amt_p = "purc_rtn_gi_amt_p";
	public static final String $onr_rcv_ret_gi_amt_p = "onr_rcv_ret_gi_amt_p";
	public static final String $xpns_purc_gi_amt_p = "xpns_purc_gi_amt_p";
	public static final String $xpns_purc_rtn_gi_amt_p = "xpns_purc_rtn_gi_amt_p";
	public static final String $accpt_dfct_gi_amt_p = "accpt_dfct_gi_amt_p";
	public static final String $inpt_amt_p = "inpt_amt_p";
	public static final String $loss_amt_p = "loss_amt_p";
	public static final String $ffr_prov_gi_amt_p = "ffr_prov_gi_amt_p";
	public static final String $onr_prov_gi_amt_p = "onr_prov_gi_amt_p";
	public static final String $ffr_prov_rtn_gi_amt_p = "ffr_prov_rtn_gi_amt_p";
	public static final String $onr_prov_rtn_gi_amt_p = "onr_prov_rtn_gi_amt_p";
	public static final String $insp_gi_amt_p = "insp_gi_amt_p";
	public static final String $insp_cmpl_gi_amt_p = "insp_cmpl_gi_amt_p";
	public static final String $insp_judg_gi_amt_p = "insp_judg_gi_amt_p";
	public static final String $reinsp_gi_amt_p = "reinsp_gi_amt_p";
	public static final String $insp_smpl_gi_amt_p = "insp_smpl_gi_amt_p";
	public static final String $stk_adjst_gi_amt_p = "stk_adjst_gi_amt_p";
	public static final String $prdct_wh_gi_amt_p = "prdct_wh_gi_amt_p";
	public static final String $prdct_wh_rtn_gi_amt_p = "prdct_wh_rtn_gi_amt_p";
	public static final String $xfr_gi_amt_p = "xfr_gi_amt_p";
	public static final String $xfr_out_amt_p = "xfr_out_amt_p";
	public static final String $purc_xfr_out_amt_p = "purc_xfr_out_amt_p";
	public static final String $xfr_rtn_gi_amt_p = "xfr_rtn_gi_amt_p";
	public static final String $acxfr_gi_amt_p = "acxfr_gi_amt_p";
	public static final String $scrp_amt_p = "scrp_amt_p";
	public static final String $xfr_itm_gi_amt_p = "xfr_itm_gi_amt_p";
	public static final String $xfr_lot_sno_gi_amt_p = "xfr_lot_sno_gi_amt_p";
	public static final String $xfr_grd_gi_amt_p = "xfr_grd_gi_amt_p";
	public static final String $xfr_pack_gi_amt_p = "xfr_pack_gi_amt_p";
	public static final String $ship_out_amt_p = "ship_out_amt_p";
	public static final String $ex_ship_out_amt_p = "ex_ship_out_amt_p";
	public static final String $ship_rtn_gi_amt_p = "ship_rtn_gi_amt_p";
	public static final String $sls_rtn_gi_amt_p = "sls_rtn_gi_amt_p";
	public static final String $sls_amt_p = "sls_amt_p";
	public static final String $end_stk_amt_p = "end_stk_amt_p";
	public static final String $std_unit_cost_amt_p = "std_unit_cost_amt_p";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	public static final String $itm_grp_p = "itm_grp_p";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $str_ln_cd = $str_ln_p + ".str_ln_cd";
	public static final String $str_ln_nm = $str_ln_p + ".str_ln_nm";
	public static final String $str_ln_cd_none_flg = $str_ln_p + ".str_ln_cd_none_flg";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $ini_stk_qty = $ini_stk_qty_p + ".qty";
	public static final String $gr_total_qty = $gr_total_qty_p + ".qty";
	public static final String $arr_qty = $arr_qty_p + ".qty";
	public static final String $purc_gr_qty = $purc_gr_qty_p + ".qty";
	public static final String $onr_rcv_gr_qty = $onr_rcv_gr_qty_p + ".qty";
	public static final String $purc_rtn_gr_qty = $purc_rtn_gr_qty_p + ".qty";
	public static final String $onr_rcv_ret_gr_qty = $onr_rcv_ret_gr_qty_p + ".qty";
	public static final String $xpns_purc_gr_qty = $xpns_purc_gr_qty_p + ".qty";
	public static final String $xpns_purc_rtn_gr_qty = $xpns_purc_rtn_gr_qty_p + ".qty";
	public static final String $accpt_dfct_gr_qty = $accpt_dfct_gr_qty_p + ".qty";
	public static final String $mfg_qty = $mfg_qty_p + ".qty";
	public static final String $bymfg_qty = $bymfg_qty_p + ".qty";
	public static final String $ffr_prov_gr_qty = $ffr_prov_gr_qty_p + ".qty";
	public static final String $onr_prov_gr_qty = $onr_prov_gr_qty_p + ".qty";
	public static final String $ffr_prov_rtn_gr_qty = $ffr_prov_rtn_gr_qty_p + ".qty";
	public static final String $onr_prov_rtn_gr_qty = $onr_prov_rtn_gr_qty_p + ".qty";
	public static final String $insp_gr_qty = $insp_gr_qty_p + ".qty";
	public static final String $insp_cmpl_gr_qty = $insp_cmpl_gr_qty_p + ".qty";
	public static final String $insp_judg_gr_qty = $insp_judg_gr_qty_p + ".qty";
	public static final String $reinsp_gr_qty = $reinsp_gr_qty_p + ".qty";
	public static final String $stk_adjst_gr_qty = $stk_adjst_gr_qty_p + ".qty";
	public static final String $prdct_wh_gr_qty = $prdct_wh_gr_qty_p + ".qty";
	public static final String $prdct_wh_rtn_gr_qty = $prdct_wh_rtn_gr_qty_p + ".qty";
	public static final String $xfr_gr_qty = $xfr_gr_qty_p + ".qty";
	public static final String $xfr_in_qty = $xfr_in_qty_p + ".qty";
	public static final String $purc_xfr_in_qty = $purc_xfr_in_qty_p + ".qty";
	public static final String $xfr_rtn_gr_qty = $xfr_rtn_gr_qty_p + ".qty";
	public static final String $acxfr_gr_qty = $acxfr_gr_qty_p + ".qty";
	public static final String $arr_cststk_qty = $arr_cststk_qty_p + ".qty";
	public static final String $xfr_itm_gr_qty = $xfr_itm_gr_qty_p + ".qty";
	public static final String $xfr_lot_sno_gr_qty = $xfr_lot_sno_gr_qty_p + ".qty";
	public static final String $xfr_grd_gr_qty = $xfr_grd_gr_qty_p + ".qty";
	public static final String $xfr_pack_gr_qty = $xfr_pack_gr_qty_p + ".qty";
	public static final String $ship_in_qty = $ship_in_qty_p + ".qty";
	public static final String $ex_ship_in_qty = $ex_ship_in_qty_p + ".qty";
	public static final String $ship_rtn_gr_qty = $ship_rtn_gr_qty_p + ".qty";
	public static final String $sls_rtn_gr_qty = $sls_rtn_gr_qty_p + ".qty";
	public static final String $gi_total_qty = $gi_total_qty_p + ".qty";
	public static final String $arr_rtn_qty = $arr_rtn_qty_p + ".qty";
	public static final String $purc_gi_qty = $purc_gi_qty_p + ".qty";
	public static final String $onr_rcv_gi_qty = $onr_rcv_gi_qty_p + ".qty";
	public static final String $purc_rtn_gi_qty = $purc_rtn_gi_qty_p + ".qty";
	public static final String $onr_rcv_ret_gi_qty = $onr_rcv_ret_gi_qty_p + ".qty";
	public static final String $xpns_purc_gi_qty = $xpns_purc_gi_qty_p + ".qty";
	public static final String $xpns_purc_rtn_gi_qty = $xpns_purc_rtn_gi_qty_p + ".qty";
	public static final String $accpt_dfct_gi_qty = $accpt_dfct_gi_qty_p + ".qty";
	public static final String $inpt_qty = $inpt_qty_p + ".qty";
	public static final String $loss_qty = $loss_qty_p + ".qty";
	public static final String $ffr_prov_gi_qty = $ffr_prov_gi_qty_p + ".qty";
	public static final String $onr_prov_gi_qty = $onr_prov_gi_qty_p + ".qty";
	public static final String $ffr_prov_rtn_gi_qty = $ffr_prov_rtn_gi_qty_p + ".qty";
	public static final String $onr_prov_rtn_gi_qty = $onr_prov_rtn_gi_qty_p + ".qty";
	public static final String $insp_gi_qty = $insp_gi_qty_p + ".qty";
	public static final String $insp_cmpl_gi_qty = $insp_cmpl_gi_qty_p + ".qty";
	public static final String $insp_judg_gi_qty = $insp_judg_gi_qty_p + ".qty";
	public static final String $reinsp_gi_qty = $reinsp_gi_qty_p + ".qty";
	public static final String $insp_smpl_gi_qty = $insp_smpl_gi_qty_p + ".qty";
	public static final String $stk_adjst_gi_qty = $stk_adjst_gi_qty_p + ".qty";
	public static final String $prdct_wh_gi_qty = $prdct_wh_gi_qty_p + ".qty";
	public static final String $prdct_wh_rtn_gi_qty = $prdct_wh_rtn_gi_qty_p + ".qty";
	public static final String $xfr_gi_qty = $xfr_gi_qty_p + ".qty";
	public static final String $xfr_out_qty = $xfr_out_qty_p + ".qty";
	public static final String $purc_xfr_out_qty = $purc_xfr_out_qty_p + ".qty";
	public static final String $xfr_rtn_gi_qty = $xfr_rtn_gi_qty_p + ".qty";
	public static final String $acxfr_gi_qty = $acxfr_gi_qty_p + ".qty";
	public static final String $scrp_qty = $scrp_qty_p + ".qty";
	public static final String $xfr_itm_gi_qty = $xfr_itm_gi_qty_p + ".qty";
	public static final String $xfr_lot_sno_gi_qty = $xfr_lot_sno_gi_qty_p + ".qty";
	public static final String $xfr_grd_gi_qty = $xfr_grd_gi_qty_p + ".qty";
	public static final String $xfr_pack_gi_qty = $xfr_pack_gi_qty_p + ".qty";
	public static final String $ship_out_qty = $ship_out_qty_p + ".qty";
	public static final String $ex_ship_out_qty = $ex_ship_out_qty_p + ".qty";
	public static final String $ship_rtn_gi_qty = $ship_rtn_gi_qty_p + ".qty";
	public static final String $sls_rtn_gi_qty = $sls_rtn_gi_qty_p + ".qty";
	public static final String $sls_qty = $sls_qty_p + ".qty";
	public static final String $end_stk_qty = $end_stk_qty_p + ".qty";
	public static final String $ini_stk_amt = $ini_stk_amt_p + ".amt";
	public static final String $gr_total_amt = $gr_total_amt_p + ".amt";
	public static final String $arr_amt = $arr_amt_p + ".amt";
	public static final String $purc_gr_amt = $purc_gr_amt_p + ".amt";
	public static final String $onr_rcv_gr_amt = $onr_rcv_gr_amt_p + ".amt";
	public static final String $purc_rtn_gr_amt = $purc_rtn_gr_amt_p + ".amt";
	public static final String $onr_rcv_ret_gr_amt = $onr_rcv_ret_gr_amt_p + ".amt";
	public static final String $xpns_purc_gr_amt = $xpns_purc_gr_amt_p + ".amt";
	public static final String $xpns_purc_rtn_gr_amt = $xpns_purc_rtn_gr_amt_p + ".amt";
	public static final String $accpt_dfct_gr_amt = $accpt_dfct_gr_amt_p + ".amt";
	public static final String $mfg_amt = $mfg_amt_p + ".amt";
	public static final String $bymfg_amt = $bymfg_amt_p + ".amt";
	public static final String $ffr_prov_gr_amt = $ffr_prov_gr_amt_p + ".amt";
	public static final String $onr_prov_gr_amt = $onr_prov_gr_amt_p + ".amt";
	public static final String $ffr_prov_rtn_gr_amt = $ffr_prov_rtn_gr_amt_p + ".amt";
	public static final String $onr_prov_rtn_gr_amt = $onr_prov_rtn_gr_amt_p + ".amt";
	public static final String $insp_gr_amt = $insp_gr_amt_p + ".amt";
	public static final String $insp_cmpl_gr_amt = $insp_cmpl_gr_amt_p + ".amt";
	public static final String $insp_judg_gr_amt = $insp_judg_gr_amt_p + ".amt";
	public static final String $reinsp_gr_amt = $reinsp_gr_amt_p + ".amt";
	public static final String $stk_adjst_gr_amt = $stk_adjst_gr_amt_p + ".amt";
	public static final String $prdct_wh_gr_amt = $prdct_wh_gr_amt_p + ".amt";
	public static final String $prdct_wh_rtn_gr_amt = $prdct_wh_rtn_gr_amt_p + ".amt";
	public static final String $xfr_gr_amt = $xfr_gr_amt_p + ".amt";
	public static final String $xfr_in_amt = $xfr_in_amt_p + ".amt";
	public static final String $purc_xfr_in_amt = $purc_xfr_in_amt_p + ".amt";
	public static final String $xfr_rtn_gr_amt = $xfr_rtn_gr_amt_p + ".amt";
	public static final String $acxfr_gr_amt = $acxfr_gr_amt_p + ".amt";
	public static final String $arr_cststk_amt = $arr_cststk_amt_p + ".amt";
	public static final String $xfr_itm_gr_amt = $xfr_itm_gr_amt_p + ".amt";
	public static final String $xfr_lot_sno_gr_amt = $xfr_lot_sno_gr_amt_p + ".amt";
	public static final String $xfr_grd_gr_amt = $xfr_grd_gr_amt_p + ".amt";
	public static final String $xfr_pack_gr_amt = $xfr_pack_gr_amt_p + ".amt";
	public static final String $ship_in_amt = $ship_in_amt_p + ".amt";
	public static final String $ex_ship_in_amt = $ex_ship_in_amt_p + ".amt";
	public static final String $ship_rtn_gr_amt = $ship_rtn_gr_amt_p + ".amt";
	public static final String $sls_rtn_gr_amt = $sls_rtn_gr_amt_p + ".amt";
	public static final String $gi_total_amt = $gi_total_amt_p + ".amt";
	public static final String $arr_rtn_amt = $arr_rtn_amt_p + ".amt";
	public static final String $purc_gi_amt = $purc_gi_amt_p + ".amt";
	public static final String $onr_rcv_gi_amt = $onr_rcv_gi_amt_p + ".amt";
	public static final String $purc_rtn_gi_amt = $purc_rtn_gi_amt_p + ".amt";
	public static final String $onr_rcv_ret_gi_amt = $onr_rcv_ret_gi_amt_p + ".amt";
	public static final String $xpns_purc_gi_amt = $xpns_purc_gi_amt_p + ".amt";
	public static final String $xpns_purc_rtn_gi_amt = $xpns_purc_rtn_gi_amt_p + ".amt";
	public static final String $accpt_dfct_gi_amt = $accpt_dfct_gi_amt_p + ".amt";
	public static final String $inpt_amt = $inpt_amt_p + ".amt";
	public static final String $loss_amt = $loss_amt_p + ".amt";
	public static final String $ffr_prov_gi_amt = $ffr_prov_gi_amt_p + ".amt";
	public static final String $onr_prov_gi_amt = $onr_prov_gi_amt_p + ".amt";
	public static final String $ffr_prov_rtn_gi_amt = $ffr_prov_rtn_gi_amt_p + ".amt";
	public static final String $onr_prov_rtn_gi_amt = $onr_prov_rtn_gi_amt_p + ".amt";
	public static final String $insp_gi_amt = $insp_gi_amt_p + ".amt";
	public static final String $insp_cmpl_gi_amt = $insp_cmpl_gi_amt_p + ".amt";
	public static final String $insp_judg_gi_amt = $insp_judg_gi_amt_p + ".amt";
	public static final String $reinsp_gi_amt = $reinsp_gi_amt_p + ".amt";
	public static final String $insp_smpl_gi_amt = $insp_smpl_gi_amt_p + ".amt";
	public static final String $stk_adjst_gi_amt = $stk_adjst_gi_amt_p + ".amt";
	public static final String $prdct_wh_gi_amt = $prdct_wh_gi_amt_p + ".amt";
	public static final String $prdct_wh_rtn_gi_amt = $prdct_wh_rtn_gi_amt_p + ".amt";
	public static final String $xfr_gi_amt = $xfr_gi_amt_p + ".amt";
	public static final String $xfr_out_amt = $xfr_out_amt_p + ".amt";
	public static final String $purc_xfr_out_amt = $purc_xfr_out_amt_p + ".amt";
	public static final String $xfr_rtn_gi_amt = $xfr_rtn_gi_amt_p + ".amt";
	public static final String $acxfr_gi_amt = $acxfr_gi_amt_p + ".amt";
	public static final String $scrp_amt = $scrp_amt_p + ".amt";
	public static final String $xfr_itm_gi_amt = $xfr_itm_gi_amt_p + ".amt";
	public static final String $xfr_lot_sno_gi_amt = $xfr_lot_sno_gi_amt_p + ".amt";
	public static final String $xfr_grd_gi_amt = $xfr_grd_gi_amt_p + ".amt";
	public static final String $xfr_pack_gi_amt = $xfr_pack_gi_amt_p + ".amt";
	public static final String $ship_out_amt = $ship_out_amt_p + ".amt";
	public static final String $ex_ship_out_amt = $ex_ship_out_amt_p + ".amt";
	public static final String $ship_rtn_gi_amt = $ship_rtn_gi_amt_p + ".amt";
	public static final String $sls_rtn_gi_amt = $sls_rtn_gi_amt_p + ".amt";
	public static final String $sls_amt = $sls_amt_p + ".amt";
	public static final String $end_stk_amt = $end_stk_amt_p + ".amt";
	public static final String $std_unit_cost = $std_unit_cost_amt_p + ".amt";
	public static final String $itm_grp_cd1 = $itm_grp_p + ".itm_grp_cd1";
	public static final String $itm_grp_nm1 = $itm_grp_p + ".itm_grp_nm1";
	public static final String $itm_grp_cd2 = $itm_grp_p + ".itm_grp_cd2";
	public static final String $itm_grp_nm2 = $itm_grp_p + ".itm_grp_nm2";
	public static final String $itm_grp_cd3 = $itm_grp_p + ".itm_grp_cd3";
	public static final String $itm_grp_nm3 = $itm_grp_p + ".itm_grp_nm3";
	public static final String $itm_grp_cd4 = $itm_grp_p + ".itm_grp_cd4";
	public static final String $itm_grp_nm4 = $itm_grp_p + ".itm_grp_nm4";
	public static final String $itm_grp_cd5 = $itm_grp_p + ".itm_grp_cd5";
	public static final String $itm_grp_nm5 = $itm_grp_p + ".itm_grp_nm5";
	public static final String $itm_grp_cd6 = $itm_grp_p + ".itm_grp_cd6";
	public static final String $itm_grp_nm6 = $itm_grp_p + ".itm_grp_nm6";
	public static final String $itm_grp_cd7 = $itm_grp_p + ".itm_grp_cd7";
	public static final String $itm_grp_nm7 = $itm_grp_p + ".itm_grp_nm7";
	public static final String $itm_grp_cd8 = $itm_grp_p + ".itm_grp_cd8";
	public static final String $itm_grp_nm8 = $itm_grp_p + ".itm_grp_nm8";
	public static final String $itm_grp_cd9 = $itm_grp_p + ".itm_grp_cd9";
	public static final String $itm_grp_nm9 = $itm_grp_p + ".itm_grp_nm9";
	public static final String $itm_grp_cd10 = $itm_grp_p + ".itm_grp_cd10";
	public static final String $itm_grp_nm10 = $itm_grp_p + ".itm_grp_nm10";

	public static final MCMeta mly_io_cl_ym_META = createCommonMeta($mly_io_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_p_META = createInnerRowMeta($str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta in_xfr_typ_META = createCommonMeta($in_xfr_typ, mcframe.commonMS.meta.MS_META.IN_XFR_TYP);
	public static final MCMeta in_xfr_typ_nm_META = createCommonMeta($in_xfr_typ_nm, mcframe.commonMS.meta.MS_META.IN_XFR_TYP_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta fix_no_typ_META = createCommonMeta($fix_no_typ, mcframe.commonMS.meta.MS_META.FIX_NO_TYP);
	public static final MCMeta fix_no_typ_nm_META = createCommonMeta($fix_no_typ_nm, mcframe.commonMS.meta.MS_META.FIX_NO_TYP_NM);
	public static final MCMeta fix_no_META = createCommonMeta($fix_no, mcframe.commonMA.meta.MA_META.FIX_NO);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rnd_typ_META = createCommonMeta($rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_dec_place_META = createCommonMeta($base_cur_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_rnd_typ_META = createCommonMeta($base_cur_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta ini_stk_qty_p_META = createInnerRowMeta($ini_stk_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gr_total_qty_p_META = createInnerRowMeta($gr_total_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta arr_qty_p_META = createInnerRowMeta($arr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_gr_qty_p_META = createInnerRowMeta($purc_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta onr_rcv_gr_qty_p_META = createInnerRowMeta($onr_rcv_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_rtn_gr_qty_p_META = createInnerRowMeta($purc_rtn_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta onr_rcv_ret_gr_qty_p_META = createInnerRowMeta($onr_rcv_ret_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta xpns_purc_gr_qty_p_META = createInnerRowMeta($xpns_purc_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta xpns_purc_rtn_gr_qty_p_META = createInnerRowMeta($xpns_purc_rtn_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta accpt_dfct_gr_qty_p_META = createInnerRowMeta($accpt_dfct_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta mfg_qty_p_META = createInnerRowMeta($mfg_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta bymfg_qty_p_META = createInnerRowMeta($bymfg_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta ffr_prov_gr_qty_p_META = createInnerRowMeta($ffr_prov_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta onr_prov_gr_qty_p_META = createInnerRowMeta($onr_prov_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta ffr_prov_rtn_gr_qty_p_META = createInnerRowMeta($ffr_prov_rtn_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta onr_prov_rtn_gr_qty_p_META = createInnerRowMeta($onr_prov_rtn_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta insp_gr_qty_p_META = createInnerRowMeta($insp_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta insp_cmpl_gr_qty_p_META = createInnerRowMeta($insp_cmpl_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta insp_judg_gr_qty_p_META = createInnerRowMeta($insp_judg_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta reinsp_gr_qty_p_META = createInnerRowMeta($reinsp_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta stk_adjst_gr_qty_p_META = createInnerRowMeta($stk_adjst_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta prdct_wh_gr_qty_p_META = createInnerRowMeta($prdct_wh_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta prdct_wh_rtn_gr_qty_p_META = createInnerRowMeta($prdct_wh_rtn_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta xfr_gr_qty_p_META = createInnerRowMeta($xfr_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta xfr_in_qty_p_META = createInnerRowMeta($xfr_in_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_xfr_in_qty_p_META = createInnerRowMeta($purc_xfr_in_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta xfr_rtn_gr_qty_p_META = createInnerRowMeta($xfr_rtn_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta acxfr_gr_qty_p_META = createInnerRowMeta($acxfr_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta arr_cststk_qty_p_META = createInnerRowMeta($arr_cststk_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta xfr_itm_gr_qty_p_META = createInnerRowMeta($xfr_itm_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta xfr_lot_sno_gr_qty_p_META = createInnerRowMeta($xfr_lot_sno_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta xfr_grd_gr_qty_p_META = createInnerRowMeta($xfr_grd_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta xfr_pack_gr_qty_p_META = createInnerRowMeta($xfr_pack_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta ship_in_qty_p_META = createInnerRowMeta($ship_in_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta ex_ship_in_qty_p_META = createInnerRowMeta($ex_ship_in_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta ship_rtn_gr_qty_p_META = createInnerRowMeta($ship_rtn_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta sls_rtn_gr_qty_p_META = createInnerRowMeta($sls_rtn_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gi_total_qty_p_META = createInnerRowMeta($gi_total_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta arr_rtn_qty_p_META = createInnerRowMeta($arr_rtn_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_gi_qty_p_META = createInnerRowMeta($purc_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta onr_rcv_gi_qty_p_META = createInnerRowMeta($onr_rcv_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_rtn_gi_qty_p_META = createInnerRowMeta($purc_rtn_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta onr_rcv_ret_gi_qty_p_META = createInnerRowMeta($onr_rcv_ret_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta xpns_purc_gi_qty_p_META = createInnerRowMeta($xpns_purc_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta xpns_purc_rtn_gi_qty_p_META = createInnerRowMeta($xpns_purc_rtn_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta accpt_dfct_gi_qty_p_META = createInnerRowMeta($accpt_dfct_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta inpt_qty_p_META = createInnerRowMeta($inpt_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta loss_qty_p_META = createInnerRowMeta($loss_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta ffr_prov_gi_qty_p_META = createInnerRowMeta($ffr_prov_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta onr_prov_gi_qty_p_META = createInnerRowMeta($onr_prov_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta ffr_prov_rtn_gi_qty_p_META = createInnerRowMeta($ffr_prov_rtn_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta onr_prov_rtn_gi_qty_p_META = createInnerRowMeta($onr_prov_rtn_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta insp_gi_qty_p_META = createInnerRowMeta($insp_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta insp_cmpl_gi_qty_p_META = createInnerRowMeta($insp_cmpl_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta insp_judg_gi_qty_p_META = createInnerRowMeta($insp_judg_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta reinsp_gi_qty_p_META = createInnerRowMeta($reinsp_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta insp_smpl_gi_qty_p_META = createInnerRowMeta($insp_smpl_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta stk_adjst_gi_qty_p_META = createInnerRowMeta($stk_adjst_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta prdct_wh_gi_qty_p_META = createInnerRowMeta($prdct_wh_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta prdct_wh_rtn_gi_qty_p_META = createInnerRowMeta($prdct_wh_rtn_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta xfr_gi_qty_p_META = createInnerRowMeta($xfr_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta xfr_out_qty_p_META = createInnerRowMeta($xfr_out_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_xfr_out_qty_p_META = createInnerRowMeta($purc_xfr_out_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta xfr_rtn_gi_qty_p_META = createInnerRowMeta($xfr_rtn_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta acxfr_gi_qty_p_META = createInnerRowMeta($acxfr_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta scrp_qty_p_META = createInnerRowMeta($scrp_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta xfr_itm_gi_qty_p_META = createInnerRowMeta($xfr_itm_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta xfr_lot_sno_gi_qty_p_META = createInnerRowMeta($xfr_lot_sno_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta xfr_grd_gi_qty_p_META = createInnerRowMeta($xfr_grd_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta xfr_pack_gi_qty_p_META = createInnerRowMeta($xfr_pack_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta ship_out_qty_p_META = createInnerRowMeta($ship_out_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta ex_ship_out_qty_p_META = createInnerRowMeta($ex_ship_out_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta ship_rtn_gi_qty_p_META = createInnerRowMeta($ship_rtn_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta sls_rtn_gi_qty_p_META = createInnerRowMeta($sls_rtn_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta sls_qty_p_META = createInnerRowMeta($sls_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta end_stk_qty_p_META = createInnerRowMeta($end_stk_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta ini_stk_amt_p_META = createInnerRowMeta($ini_stk_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta gr_total_amt_p_META = createInnerRowMeta($gr_total_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta arr_amt_p_META = createInnerRowMeta($arr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta purc_gr_amt_p_META = createInnerRowMeta($purc_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta onr_rcv_gr_amt_p_META = createInnerRowMeta($onr_rcv_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta purc_rtn_gr_amt_p_META = createInnerRowMeta($purc_rtn_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta onr_rcv_ret_gr_amt_p_META = createInnerRowMeta($onr_rcv_ret_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xpns_purc_gr_amt_p_META = createInnerRowMeta($xpns_purc_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xpns_purc_rtn_gr_amt_p_META = createInnerRowMeta($xpns_purc_rtn_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta accpt_dfct_gr_amt_p_META = createInnerRowMeta($accpt_dfct_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta mfg_amt_p_META = createInnerRowMeta($mfg_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta bymfg_amt_p_META = createInnerRowMeta($bymfg_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ffr_prov_gr_amt_p_META = createInnerRowMeta($ffr_prov_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta onr_prov_gr_amt_p_META = createInnerRowMeta($onr_prov_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ffr_prov_rtn_gr_amt_p_META = createInnerRowMeta($ffr_prov_rtn_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta onr_prov_rtn_gr_amt_p_META = createInnerRowMeta($onr_prov_rtn_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta insp_gr_amt_p_META = createInnerRowMeta($insp_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta insp_cmpl_gr_amt_p_META = createInnerRowMeta($insp_cmpl_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta insp_judg_gr_amt_p_META = createInnerRowMeta($insp_judg_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta reinsp_gr_amt_p_META = createInnerRowMeta($reinsp_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta stk_adjst_gr_amt_p_META = createInnerRowMeta($stk_adjst_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta prdct_wh_gr_amt_p_META = createInnerRowMeta($prdct_wh_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta prdct_wh_rtn_gr_amt_p_META = createInnerRowMeta($prdct_wh_rtn_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xfr_gr_amt_p_META = createInnerRowMeta($xfr_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xfr_in_amt_p_META = createInnerRowMeta($xfr_in_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta purc_xfr_in_amt_p_META = createInnerRowMeta($purc_xfr_in_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xfr_rtn_gr_amt_p_META = createInnerRowMeta($xfr_rtn_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta acxfr_gr_amt_p_META = createInnerRowMeta($acxfr_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta arr_cststk_amt_p_META = createInnerRowMeta($arr_cststk_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xfr_itm_gr_amt_p_META = createInnerRowMeta($xfr_itm_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xfr_lot_sno_gr_amt_p_META = createInnerRowMeta($xfr_lot_sno_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xfr_grd_gr_amt_p_META = createInnerRowMeta($xfr_grd_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xfr_pack_gr_amt_p_META = createInnerRowMeta($xfr_pack_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ship_in_amt_p_META = createInnerRowMeta($ship_in_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ex_ship_in_amt_p_META = createInnerRowMeta($ex_ship_in_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ship_rtn_gr_amt_p_META = createInnerRowMeta($ship_rtn_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta sls_rtn_gr_amt_p_META = createInnerRowMeta($sls_rtn_gr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta gi_total_amt_p_META = createInnerRowMeta($gi_total_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta arr_rtn_amt_p_META = createInnerRowMeta($arr_rtn_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta purc_gi_amt_p_META = createInnerRowMeta($purc_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta onr_rcv_gi_amt_p_META = createInnerRowMeta($onr_rcv_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta purc_rtn_gi_amt_p_META = createInnerRowMeta($purc_rtn_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta onr_rcv_ret_gi_amt_p_META = createInnerRowMeta($onr_rcv_ret_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xpns_purc_gi_amt_p_META = createInnerRowMeta($xpns_purc_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xpns_purc_rtn_gi_amt_p_META = createInnerRowMeta($xpns_purc_rtn_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta accpt_dfct_gi_amt_p_META = createInnerRowMeta($accpt_dfct_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta inpt_amt_p_META = createInnerRowMeta($inpt_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta loss_amt_p_META = createInnerRowMeta($loss_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ffr_prov_gi_amt_p_META = createInnerRowMeta($ffr_prov_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta onr_prov_gi_amt_p_META = createInnerRowMeta($onr_prov_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ffr_prov_rtn_gi_amt_p_META = createInnerRowMeta($ffr_prov_rtn_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta onr_prov_rtn_gi_amt_p_META = createInnerRowMeta($onr_prov_rtn_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta insp_gi_amt_p_META = createInnerRowMeta($insp_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta insp_cmpl_gi_amt_p_META = createInnerRowMeta($insp_cmpl_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta insp_judg_gi_amt_p_META = createInnerRowMeta($insp_judg_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta reinsp_gi_amt_p_META = createInnerRowMeta($reinsp_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta insp_smpl_gi_amt_p_META = createInnerRowMeta($insp_smpl_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta stk_adjst_gi_amt_p_META = createInnerRowMeta($stk_adjst_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta prdct_wh_gi_amt_p_META = createInnerRowMeta($prdct_wh_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta prdct_wh_rtn_gi_amt_p_META = createInnerRowMeta($prdct_wh_rtn_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xfr_gi_amt_p_META = createInnerRowMeta($xfr_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xfr_out_amt_p_META = createInnerRowMeta($xfr_out_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta purc_xfr_out_amt_p_META = createInnerRowMeta($purc_xfr_out_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xfr_rtn_gi_amt_p_META = createInnerRowMeta($xfr_rtn_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta acxfr_gi_amt_p_META = createInnerRowMeta($acxfr_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta scrp_amt_p_META = createInnerRowMeta($scrp_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xfr_itm_gi_amt_p_META = createInnerRowMeta($xfr_itm_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xfr_lot_sno_gi_amt_p_META = createInnerRowMeta($xfr_lot_sno_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xfr_grd_gi_amt_p_META = createInnerRowMeta($xfr_grd_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xfr_pack_gi_amt_p_META = createInnerRowMeta($xfr_pack_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ship_out_amt_p_META = createInnerRowMeta($ship_out_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ex_ship_out_amt_p_META = createInnerRowMeta($ex_ship_out_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ship_rtn_gi_amt_p_META = createInnerRowMeta($ship_rtn_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta sls_rtn_gi_amt_p_META = createInnerRowMeta($sls_rtn_gi_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta sls_amt_p_META = createInnerRowMeta($sls_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta end_stk_amt_p_META = createInnerRowMeta($end_stk_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta std_unit_cost_amt_p_META = createInnerRowMeta($std_unit_cost_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP5170.ItmGrpR.class);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mly_io_cl_ym_META,
			wg_cd_META,
			wg_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			itm_p_META,
			ver_no_p_META,
			lot_no_META,
			sublot_no_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_p_META,
			site_cd_META,
			site_nm_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			alloc_grp_cd_META,
			alloc_grp_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			gd_cd_META,
			gd_nm_META,
			in_xfr_typ_META,
			in_xfr_typ_nm_META,
			quality_typ_META,
			quality_typ_nm_META,
			stk_insp_typ_META,
			stk_insp_typ_nm_META,
			sno_wrk_no_p_META,
			asst_typ_META,
			asst_typ_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			fix_no_typ_META,
			fix_no_typ_nm_META,
			fix_no_META,
			stk_arrv_bp_cd_META,
			stk_arrv_bp_nm_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			rnd_typ_META,
			base_cur_cd_META,
			base_cur_nm_META,
			base_cur_dec_place_META,
			base_cur_rnd_typ_META,
			ini_stk_qty_p_META,
			gr_total_qty_p_META,
			arr_qty_p_META,
			purc_gr_qty_p_META,
			onr_rcv_gr_qty_p_META,
			purc_rtn_gr_qty_p_META,
			onr_rcv_ret_gr_qty_p_META,
			xpns_purc_gr_qty_p_META,
			xpns_purc_rtn_gr_qty_p_META,
			accpt_dfct_gr_qty_p_META,
			mfg_qty_p_META,
			bymfg_qty_p_META,
			ffr_prov_gr_qty_p_META,
			onr_prov_gr_qty_p_META,
			ffr_prov_rtn_gr_qty_p_META,
			onr_prov_rtn_gr_qty_p_META,
			insp_gr_qty_p_META,
			insp_cmpl_gr_qty_p_META,
			insp_judg_gr_qty_p_META,
			reinsp_gr_qty_p_META,
			stk_adjst_gr_qty_p_META,
			prdct_wh_gr_qty_p_META,
			prdct_wh_rtn_gr_qty_p_META,
			xfr_gr_qty_p_META,
			xfr_in_qty_p_META,
			purc_xfr_in_qty_p_META,
			xfr_rtn_gr_qty_p_META,
			acxfr_gr_qty_p_META,
			arr_cststk_qty_p_META,
			xfr_itm_gr_qty_p_META,
			xfr_lot_sno_gr_qty_p_META,
			xfr_grd_gr_qty_p_META,
			xfr_pack_gr_qty_p_META,
			ship_in_qty_p_META,
			ex_ship_in_qty_p_META,
			ship_rtn_gr_qty_p_META,
			sls_rtn_gr_qty_p_META,
			gi_total_qty_p_META,
			arr_rtn_qty_p_META,
			purc_gi_qty_p_META,
			onr_rcv_gi_qty_p_META,
			purc_rtn_gi_qty_p_META,
			onr_rcv_ret_gi_qty_p_META,
			xpns_purc_gi_qty_p_META,
			xpns_purc_rtn_gi_qty_p_META,
			accpt_dfct_gi_qty_p_META,
			inpt_qty_p_META,
			loss_qty_p_META,
			ffr_prov_gi_qty_p_META,
			onr_prov_gi_qty_p_META,
			ffr_prov_rtn_gi_qty_p_META,
			onr_prov_rtn_gi_qty_p_META,
			insp_gi_qty_p_META,
			insp_cmpl_gi_qty_p_META,
			insp_judg_gi_qty_p_META,
			reinsp_gi_qty_p_META,
			insp_smpl_gi_qty_p_META,
			stk_adjst_gi_qty_p_META,
			prdct_wh_gi_qty_p_META,
			prdct_wh_rtn_gi_qty_p_META,
			xfr_gi_qty_p_META,
			xfr_out_qty_p_META,
			purc_xfr_out_qty_p_META,
			xfr_rtn_gi_qty_p_META,
			acxfr_gi_qty_p_META,
			scrp_qty_p_META,
			xfr_itm_gi_qty_p_META,
			xfr_lot_sno_gi_qty_p_META,
			xfr_grd_gi_qty_p_META,
			xfr_pack_gi_qty_p_META,
			ship_out_qty_p_META,
			ex_ship_out_qty_p_META,
			ship_rtn_gi_qty_p_META,
			sls_rtn_gi_qty_p_META,
			sls_qty_p_META,
			end_stk_qty_p_META,
			ini_stk_amt_p_META,
			gr_total_amt_p_META,
			arr_amt_p_META,
			purc_gr_amt_p_META,
			onr_rcv_gr_amt_p_META,
			purc_rtn_gr_amt_p_META,
			onr_rcv_ret_gr_amt_p_META,
			xpns_purc_gr_amt_p_META,
			xpns_purc_rtn_gr_amt_p_META,
			accpt_dfct_gr_amt_p_META,
			mfg_amt_p_META,
			bymfg_amt_p_META,
			ffr_prov_gr_amt_p_META,
			onr_prov_gr_amt_p_META,
			ffr_prov_rtn_gr_amt_p_META,
			onr_prov_rtn_gr_amt_p_META,
			insp_gr_amt_p_META,
			insp_cmpl_gr_amt_p_META,
			insp_judg_gr_amt_p_META,
			reinsp_gr_amt_p_META,
			stk_adjst_gr_amt_p_META,
			prdct_wh_gr_amt_p_META,
			prdct_wh_rtn_gr_amt_p_META,
			xfr_gr_amt_p_META,
			xfr_in_amt_p_META,
			purc_xfr_in_amt_p_META,
			xfr_rtn_gr_amt_p_META,
			acxfr_gr_amt_p_META,
			arr_cststk_amt_p_META,
			xfr_itm_gr_amt_p_META,
			xfr_lot_sno_gr_amt_p_META,
			xfr_grd_gr_amt_p_META,
			xfr_pack_gr_amt_p_META,
			ship_in_amt_p_META,
			ex_ship_in_amt_p_META,
			ship_rtn_gr_amt_p_META,
			sls_rtn_gr_amt_p_META,
			gi_total_amt_p_META,
			arr_rtn_amt_p_META,
			purc_gi_amt_p_META,
			onr_rcv_gi_amt_p_META,
			purc_rtn_gi_amt_p_META,
			onr_rcv_ret_gi_amt_p_META,
			xpns_purc_gi_amt_p_META,
			xpns_purc_rtn_gi_amt_p_META,
			accpt_dfct_gi_amt_p_META,
			inpt_amt_p_META,
			loss_amt_p_META,
			ffr_prov_gi_amt_p_META,
			onr_prov_gi_amt_p_META,
			ffr_prov_rtn_gi_amt_p_META,
			onr_prov_rtn_gi_amt_p_META,
			insp_gi_amt_p_META,
			insp_cmpl_gi_amt_p_META,
			insp_judg_gi_amt_p_META,
			reinsp_gi_amt_p_META,
			insp_smpl_gi_amt_p_META,
			stk_adjst_gi_amt_p_META,
			prdct_wh_gi_amt_p_META,
			prdct_wh_rtn_gi_amt_p_META,
			xfr_gi_amt_p_META,
			xfr_out_amt_p_META,
			purc_xfr_out_amt_p_META,
			xfr_rtn_gi_amt_p_META,
			acxfr_gi_amt_p_META,
			scrp_amt_p_META,
			xfr_itm_gi_amt_p_META,
			xfr_lot_sno_gi_amt_p_META,
			xfr_grd_gi_amt_p_META,
			xfr_pack_gi_amt_p_META,
			ship_out_amt_p_META,
			ex_ship_out_amt_p_META,
			ship_rtn_gi_amt_p_META,
			sls_rtn_gi_amt_p_META,
			sls_amt_p_META,
			end_stk_amt_p_META,
			std_unit_cost_amt_p_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_grp_p_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"ver_no",
				"str_ln_cd",
				"str_ln_nm",
				"str_ln_cd_none_flg",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"ini_stk_qty",
				"gr_total_qty",
				"arr_qty",
				"purc_gr_qty",
				"onr_rcv_gr_qty",
				"purc_rtn_gr_qty",
				"onr_rcv_ret_gr_qty",
				"xpns_purc_gr_qty",
				"xpns_purc_rtn_gr_qty",
				"accpt_dfct_gr_qty",
				"mfg_qty",
				"bymfg_qty",
				"ffr_prov_gr_qty",
				"onr_prov_gr_qty",
				"ffr_prov_rtn_gr_qty",
				"onr_prov_rtn_gr_qty",
				"insp_gr_qty",
				"insp_cmpl_gr_qty",
				"insp_judg_gr_qty",
				"reinsp_gr_qty",
				"stk_adjst_gr_qty",
				"prdct_wh_gr_qty",
				"prdct_wh_rtn_gr_qty",
				"xfr_gr_qty",
				"xfr_in_qty",
				"purc_xfr_in_qty",
				"xfr_rtn_gr_qty",
				"acxfr_gr_qty",
				"arr_cststk_qty",
				"xfr_itm_gr_qty",
				"xfr_lot_sno_gr_qty",
				"xfr_grd_gr_qty",
				"xfr_pack_gr_qty",
				"ship_in_qty",
				"ex_ship_in_qty",
				"ship_rtn_gr_qty",
				"sls_rtn_gr_qty",
				"gi_total_qty",
				"arr_rtn_qty",
				"purc_gi_qty",
				"onr_rcv_gi_qty",
				"purc_rtn_gi_qty",
				"onr_rcv_ret_gi_qty",
				"xpns_purc_gi_qty",
				"xpns_purc_rtn_gi_qty",
				"accpt_dfct_gi_qty",
				"inpt_qty",
				"loss_qty",
				"ffr_prov_gi_qty",
				"onr_prov_gi_qty",
				"ffr_prov_rtn_gi_qty",
				"onr_prov_rtn_gi_qty",
				"insp_gi_qty",
				"insp_cmpl_gi_qty",
				"insp_judg_gi_qty",
				"reinsp_gi_qty",
				"insp_smpl_gi_qty",
				"stk_adjst_gi_qty",
				"prdct_wh_gi_qty",
				"prdct_wh_rtn_gi_qty",
				"xfr_gi_qty",
				"xfr_out_qty",
				"purc_xfr_out_qty",
				"xfr_rtn_gi_qty",
				"acxfr_gi_qty",
				"scrp_qty",
				"xfr_itm_gi_qty",
				"xfr_lot_sno_gi_qty",
				"xfr_grd_gi_qty",
				"xfr_pack_gi_qty",
				"ship_out_qty",
				"ex_ship_out_qty",
				"ship_rtn_gi_qty",
				"sls_rtn_gi_qty",
				"sls_qty",
				"end_stk_qty",
				"ini_stk_amt",
				"gr_total_amt",
				"arr_amt",
				"purc_gr_amt",
				"onr_rcv_gr_amt",
				"purc_rtn_gr_amt",
				"onr_rcv_ret_gr_amt",
				"xpns_purc_gr_amt",
				"xpns_purc_rtn_gr_amt",
				"accpt_dfct_gr_amt",
				"mfg_amt",
				"bymfg_amt",
				"ffr_prov_gr_amt",
				"onr_prov_gr_amt",
				"ffr_prov_rtn_gr_amt",
				"onr_prov_rtn_gr_amt",
				"insp_gr_amt",
				"insp_cmpl_gr_amt",
				"insp_judg_gr_amt",
				"reinsp_gr_amt",
				"stk_adjst_gr_amt",
				"prdct_wh_gr_amt",
				"prdct_wh_rtn_gr_amt",
				"xfr_gr_amt",
				"xfr_in_amt",
				"purc_xfr_in_amt",
				"xfr_rtn_gr_amt",
				"acxfr_gr_amt",
				"arr_cststk_amt",
				"xfr_itm_gr_amt",
				"xfr_lot_sno_gr_amt",
				"xfr_grd_gr_amt",
				"xfr_pack_gr_amt",
				"ship_in_amt",
				"ex_ship_in_amt",
				"ship_rtn_gr_amt",
				"sls_rtn_gr_amt",
				"gi_total_amt",
				"arr_rtn_amt",
				"purc_gi_amt",
				"onr_rcv_gi_amt",
				"purc_rtn_gi_amt",
				"onr_rcv_ret_gi_amt",
				"xpns_purc_gi_amt",
				"xpns_purc_rtn_gi_amt",
				"accpt_dfct_gi_amt",
				"inpt_amt",
				"loss_amt",
				"ffr_prov_gi_amt",
				"onr_prov_gi_amt",
				"ffr_prov_rtn_gi_amt",
				"onr_prov_rtn_gi_amt",
				"insp_gi_amt",
				"insp_cmpl_gi_amt",
				"insp_judg_gi_amt",
				"reinsp_gi_amt",
				"insp_smpl_gi_amt",
				"stk_adjst_gi_amt",
				"prdct_wh_gi_amt",
				"prdct_wh_rtn_gi_amt",
				"xfr_gi_amt",
				"xfr_out_amt",
				"purc_xfr_out_amt",
				"xfr_rtn_gi_amt",
				"acxfr_gi_amt",
				"scrp_amt",
				"xfr_itm_gi_amt",
				"xfr_lot_sno_gi_amt",
				"xfr_grd_gi_amt",
				"xfr_pack_gi_amt",
				"ship_out_amt",
				"ex_ship_out_amt",
				"ship_rtn_gi_amt",
				"sls_rtn_gi_amt",
				"sls_amt",
				"end_stk_amt",
				"std_unit_cost",
				"itm_grp_cd1",
				"itm_grp_nm1",
				"itm_grp_cd2",
				"itm_grp_nm2",
				"itm_grp_cd3",
				"itm_grp_nm3",
				"itm_grp_cd4",
				"itm_grp_nm4",
				"itm_grp_cd5",
				"itm_grp_nm5",
				"itm_grp_cd6",
				"itm_grp_nm6",
				"itm_grp_cd7",
				"itm_grp_nm7",
				"itm_grp_cd8",
				"itm_grp_nm8",
				"itm_grp_cd9",
				"itm_grp_nm9",
				"itm_grp_cd10",
				"itm_grp_nm10"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$ver_no,
				$str_ln_cd,
				$str_ln_nm,
				$str_ln_cd_none_flg,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$ini_stk_qty,
				$gr_total_qty,
				$arr_qty,
				$purc_gr_qty,
				$onr_rcv_gr_qty,
				$purc_rtn_gr_qty,
				$onr_rcv_ret_gr_qty,
				$xpns_purc_gr_qty,
				$xpns_purc_rtn_gr_qty,
				$accpt_dfct_gr_qty,
				$mfg_qty,
				$bymfg_qty,
				$ffr_prov_gr_qty,
				$onr_prov_gr_qty,
				$ffr_prov_rtn_gr_qty,
				$onr_prov_rtn_gr_qty,
				$insp_gr_qty,
				$insp_cmpl_gr_qty,
				$insp_judg_gr_qty,
				$reinsp_gr_qty,
				$stk_adjst_gr_qty,
				$prdct_wh_gr_qty,
				$prdct_wh_rtn_gr_qty,
				$xfr_gr_qty,
				$xfr_in_qty,
				$purc_xfr_in_qty,
				$xfr_rtn_gr_qty,
				$acxfr_gr_qty,
				$arr_cststk_qty,
				$xfr_itm_gr_qty,
				$xfr_lot_sno_gr_qty,
				$xfr_grd_gr_qty,
				$xfr_pack_gr_qty,
				$ship_in_qty,
				$ex_ship_in_qty,
				$ship_rtn_gr_qty,
				$sls_rtn_gr_qty,
				$gi_total_qty,
				$arr_rtn_qty,
				$purc_gi_qty,
				$onr_rcv_gi_qty,
				$purc_rtn_gi_qty,
				$onr_rcv_ret_gi_qty,
				$xpns_purc_gi_qty,
				$xpns_purc_rtn_gi_qty,
				$accpt_dfct_gi_qty,
				$inpt_qty,
				$loss_qty,
				$ffr_prov_gi_qty,
				$onr_prov_gi_qty,
				$ffr_prov_rtn_gi_qty,
				$onr_prov_rtn_gi_qty,
				$insp_gi_qty,
				$insp_cmpl_gi_qty,
				$insp_judg_gi_qty,
				$reinsp_gi_qty,
				$insp_smpl_gi_qty,
				$stk_adjst_gi_qty,
				$prdct_wh_gi_qty,
				$prdct_wh_rtn_gi_qty,
				$xfr_gi_qty,
				$xfr_out_qty,
				$purc_xfr_out_qty,
				$xfr_rtn_gi_qty,
				$acxfr_gi_qty,
				$scrp_qty,
				$xfr_itm_gi_qty,
				$xfr_lot_sno_gi_qty,
				$xfr_grd_gi_qty,
				$xfr_pack_gi_qty,
				$ship_out_qty,
				$ex_ship_out_qty,
				$ship_rtn_gi_qty,
				$sls_rtn_gi_qty,
				$sls_qty,
				$end_stk_qty,
				$ini_stk_amt,
				$gr_total_amt,
				$arr_amt,
				$purc_gr_amt,
				$onr_rcv_gr_amt,
				$purc_rtn_gr_amt,
				$onr_rcv_ret_gr_amt,
				$xpns_purc_gr_amt,
				$xpns_purc_rtn_gr_amt,
				$accpt_dfct_gr_amt,
				$mfg_amt,
				$bymfg_amt,
				$ffr_prov_gr_amt,
				$onr_prov_gr_amt,
				$ffr_prov_rtn_gr_amt,
				$onr_prov_rtn_gr_amt,
				$insp_gr_amt,
				$insp_cmpl_gr_amt,
				$insp_judg_gr_amt,
				$reinsp_gr_amt,
				$stk_adjst_gr_amt,
				$prdct_wh_gr_amt,
				$prdct_wh_rtn_gr_amt,
				$xfr_gr_amt,
				$xfr_in_amt,
				$purc_xfr_in_amt,
				$xfr_rtn_gr_amt,
				$acxfr_gr_amt,
				$arr_cststk_amt,
				$xfr_itm_gr_amt,
				$xfr_lot_sno_gr_amt,
				$xfr_grd_gr_amt,
				$xfr_pack_gr_amt,
				$ship_in_amt,
				$ex_ship_in_amt,
				$ship_rtn_gr_amt,
				$sls_rtn_gr_amt,
				$gi_total_amt,
				$arr_rtn_amt,
				$purc_gi_amt,
				$onr_rcv_gi_amt,
				$purc_rtn_gi_amt,
				$onr_rcv_ret_gi_amt,
				$xpns_purc_gi_amt,
				$xpns_purc_rtn_gi_amt,
				$accpt_dfct_gi_amt,
				$inpt_amt,
				$loss_amt,
				$ffr_prov_gi_amt,
				$onr_prov_gi_amt,
				$ffr_prov_rtn_gi_amt,
				$onr_prov_rtn_gi_amt,
				$insp_gi_amt,
				$insp_cmpl_gi_amt,
				$insp_judg_gi_amt,
				$reinsp_gi_amt,
				$insp_smpl_gi_amt,
				$stk_adjst_gi_amt,
				$prdct_wh_gi_amt,
				$prdct_wh_rtn_gi_amt,
				$xfr_gi_amt,
				$xfr_out_amt,
				$purc_xfr_out_amt,
				$xfr_rtn_gi_amt,
				$acxfr_gi_amt,
				$scrp_amt,
				$xfr_itm_gi_amt,
				$xfr_lot_sno_gi_amt,
				$xfr_grd_gi_amt,
				$xfr_pack_gi_amt,
				$ship_out_amt,
				$ex_ship_out_amt,
				$ship_rtn_gi_amt,
				$sls_rtn_gi_amt,
				$sls_amt,
				$end_stk_amt,
				$std_unit_cost,
				$itm_grp_cd1,
				$itm_grp_nm1,
				$itm_grp_cd2,
				$itm_grp_nm2,
				$itm_grp_cd3,
				$itm_grp_nm3,
				$itm_grp_cd4,
				$itm_grp_nm4,
				$itm_grp_cd5,
				$itm_grp_nm5,
				$itm_grp_cd6,
				$itm_grp_nm6,
				$itm_grp_cd7,
				$itm_grp_nm7,
				$itm_grp_cd8,
				$itm_grp_nm8,
				$itm_grp_cd9,
				$itm_grp_nm9,
				$itm_grp_cd10,
				$itm_grp_nm10
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
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$ver_no_p, "VER_NO"},	// ver_no_p
				{$ver_no_p + ".ver_no", "VER_NO"},	// ver_no_p.ver_no
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$lg_grp_cd, "LG_GRP"},	// lg_grp_cd
				{$lg_grp_nm, "LG_GRP"},	// lg_grp_nm
				{$alloc_grp_cd, "ALLOC_GRP"},	// alloc_grp_cd
				{$alloc_grp_nm, "ALLOC_GRP"},	// alloc_grp_nm
				{$loc_grp_cd, "LOC_GRP"},	// loc_grp_cd
				{$loc_grp_nm, "LOC_GRP"},	// loc_grp_nm
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"}	// gd_nm
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}



	/**
	 * Closing month 締月度.<p>
	 *
	 */
	public MCDate mly_io_cl_ym() {
		return getConstDate(offset + 0, $mly_io_cl_ym);
	}

	/**
	 * Closing month 締月度.<p>
	 *
	 */
	public void mly_io_cl_ym(MCDate value) {
		setConstDate(offset + 0, $mly_io_cl_ym, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 1, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 1, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 2, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 2, $wg_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 3, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 3, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 4, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 4, $dpt_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 5, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 5, $itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 6, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 6, $ver_no_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 7, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 7, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 8, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 8, $sublot_no, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 9, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 9, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 10, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 10, $loc_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 11, $str_ln_p);
	}
	
	public void str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 11, $str_ln_p, row);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 12, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 12, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 13, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 13, $site_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 14, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 14, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 15, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 15, $lg_grp_nm, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 16, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 16, $alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 17, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 17, $alloc_grp_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 18, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 18, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 19, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 19, $loc_grp_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 20, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 20, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 21, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 21, $gd_nm, value);
	}


	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public String in_xfr_typ() {
		return getConstString(offset + 22, $in_xfr_typ);
	}

	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public void in_xfr_typ(String value) {
		setConstString(offset + 22, $in_xfr_typ, value);
	}


	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public String in_xfr_typ_nm() {
		return getConstString(offset + 23, $in_xfr_typ_nm);
	}

	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public void in_xfr_typ_nm(String value) {
		setConstString(offset + 23, $in_xfr_typ_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 24, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 24, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 25, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 25, $quality_typ_nm, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 26, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 26, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 27, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 27, $stk_insp_typ_nm, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 28, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 28, $sno_wrk_no_p, row);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 29, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 29, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 30, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 30, $asst_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 31, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 31, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 32, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 32, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 33, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 33, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 34, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 34, $stk_bp_nm, value);
	}


	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public String fix_no_typ() {
		return getConstString(offset + 35, $fix_no_typ);
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public void fix_no_typ(String value) {
		setConstString(offset + 35, $fix_no_typ, value);
	}


	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public String fix_no_typ_nm() {
		return getConstString(offset + 36, $fix_no_typ_nm);
	}

	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public void fix_no_typ_nm(String value) {
		setConstString(offset + 36, $fix_no_typ_nm, value);
	}


	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public String fix_no() {
		return getConstString(offset + 37, $fix_no);
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public void fix_no(String value) {
		setConstString(offset + 37, $fix_no, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 38, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 38, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 39, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 39, $stk_arrv_bp_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 40, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 40, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 41, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 41, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 42, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 42, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 42, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 42, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 42, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 42, $dec_place, value);
	}


	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public String rnd_typ() {
		return getConstString(offset + 43, $rnd_typ);
	}

	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public void rnd_typ(String value) {
		setConstString(offset + 43, $rnd_typ, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 44, $base_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 44, $base_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 45, $base_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 45, $base_cur_nm, value);
	}


	/**
	 * Currency unit number of decimal places 通貨単位小数有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_dec_place() {
		return getConstNumber(offset + 46, $base_cur_dec_place);
	}

	/**
	 * Currency unit number of decimal places 通貨単位小数有効桁数.<p>
	 *
	 */
	public void base_cur_dec_place(MCNumber value) {
		setConstNumber(offset + 46, $base_cur_dec_place, value);
	}

	/**
	 * Currency unit number of decimal places 通貨単位小数有効桁数.<p>
	 *
	 */
	public void base_cur_dec_place(int value) {
		setConstNumber(offset + 46, $base_cur_dec_place, value);
	}

	/**
	 * Currency unit number of decimal places 通貨単位小数有効桁数.<p>
	 *
	 */
	public void base_cur_dec_place(long value) {
		setConstNumber(offset + 46, $base_cur_dec_place, value);
	}

	/**
	 * Currency unit number of decimal places 通貨単位小数有効桁数.<p>
	 *
	 */
	public void base_cur_dec_place(float value) {
		setConstNumber(offset + 46, $base_cur_dec_place, value);
	}

	/**
	 * Currency unit number of decimal places 通貨単位小数有効桁数.<p>
	 *
	 */
	public void base_cur_dec_place(double value) {
		setConstNumber(offset + 46, $base_cur_dec_place, value);
	}


	/**
	 * Currency unit rounding type 通貨単位端数処理区分.<p>
	 *
	 */
	public String base_cur_rnd_typ() {
		return getConstString(offset + 47, $base_cur_rnd_typ);
	}

	/**
	 * Currency unit rounding type 通貨単位端数処理区分.<p>
	 *
	 */
	public void base_cur_rnd_typ(String value) {
		setConstString(offset + 47, $base_cur_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR ini_stk_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 48, $ini_stk_qty_p);
	}
	
	public void ini_stk_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 48, $ini_stk_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR gr_total_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 49, $gr_total_qty_p);
	}
	
	public void gr_total_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 49, $gr_total_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR arr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 50, $arr_qty_p);
	}
	
	public void arr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 50, $arr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 51, $purc_gr_qty_p);
	}
	
	public void purc_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 51, $purc_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR onr_rcv_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 52, $onr_rcv_gr_qty_p);
	}
	
	public void onr_rcv_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 52, $onr_rcv_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_rtn_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 53, $purc_rtn_gr_qty_p);
	}
	
	public void purc_rtn_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 53, $purc_rtn_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR onr_rcv_ret_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 54, $onr_rcv_ret_gr_qty_p);
	}
	
	public void onr_rcv_ret_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 54, $onr_rcv_ret_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR xpns_purc_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 55, $xpns_purc_gr_qty_p);
	}
	
	public void xpns_purc_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 55, $xpns_purc_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR xpns_purc_rtn_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 56, $xpns_purc_rtn_gr_qty_p);
	}
	
	public void xpns_purc_rtn_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 56, $xpns_purc_rtn_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR accpt_dfct_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 57, $accpt_dfct_gr_qty_p);
	}
	
	public void accpt_dfct_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 57, $accpt_dfct_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR mfg_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 58, $mfg_qty_p);
	}
	
	public void mfg_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 58, $mfg_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR bymfg_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 59, $bymfg_qty_p);
	}
	
	public void bymfg_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 59, $bymfg_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR ffr_prov_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 60, $ffr_prov_gr_qty_p);
	}
	
	public void ffr_prov_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 60, $ffr_prov_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR onr_prov_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 61, $onr_prov_gr_qty_p);
	}
	
	public void onr_prov_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 61, $onr_prov_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR ffr_prov_rtn_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 62, $ffr_prov_rtn_gr_qty_p);
	}
	
	public void ffr_prov_rtn_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 62, $ffr_prov_rtn_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR onr_prov_rtn_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 63, $onr_prov_rtn_gr_qty_p);
	}
	
	public void onr_prov_rtn_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 63, $onr_prov_rtn_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR insp_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 64, $insp_gr_qty_p);
	}
	
	public void insp_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 64, $insp_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR insp_cmpl_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 65, $insp_cmpl_gr_qty_p);
	}
	
	public void insp_cmpl_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 65, $insp_cmpl_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR insp_judg_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 66, $insp_judg_gr_qty_p);
	}
	
	public void insp_judg_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 66, $insp_judg_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR reinsp_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 67, $reinsp_gr_qty_p);
	}
	
	public void reinsp_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 67, $reinsp_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR stk_adjst_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 68, $stk_adjst_gr_qty_p);
	}
	
	public void stk_adjst_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 68, $stk_adjst_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR prdct_wh_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 69, $prdct_wh_gr_qty_p);
	}
	
	public void prdct_wh_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 69, $prdct_wh_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR prdct_wh_rtn_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 70, $prdct_wh_rtn_gr_qty_p);
	}
	
	public void prdct_wh_rtn_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 70, $prdct_wh_rtn_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR xfr_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 71, $xfr_gr_qty_p);
	}
	
	public void xfr_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 71, $xfr_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR xfr_in_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 72, $xfr_in_qty_p);
	}
	
	public void xfr_in_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 72, $xfr_in_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_xfr_in_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 73, $purc_xfr_in_qty_p);
	}
	
	public void purc_xfr_in_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 73, $purc_xfr_in_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR xfr_rtn_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 74, $xfr_rtn_gr_qty_p);
	}
	
	public void xfr_rtn_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 74, $xfr_rtn_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR acxfr_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 75, $acxfr_gr_qty_p);
	}
	
	public void acxfr_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 75, $acxfr_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR arr_cststk_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 76, $arr_cststk_qty_p);
	}
	
	public void arr_cststk_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 76, $arr_cststk_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR xfr_itm_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 77, $xfr_itm_gr_qty_p);
	}
	
	public void xfr_itm_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 77, $xfr_itm_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR xfr_lot_sno_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 78, $xfr_lot_sno_gr_qty_p);
	}
	
	public void xfr_lot_sno_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 78, $xfr_lot_sno_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR xfr_grd_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 79, $xfr_grd_gr_qty_p);
	}
	
	public void xfr_grd_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 79, $xfr_grd_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR xfr_pack_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 80, $xfr_pack_gr_qty_p);
	}
	
	public void xfr_pack_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 80, $xfr_pack_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR ship_in_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 81, $ship_in_qty_p);
	}
	
	public void ship_in_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 81, $ship_in_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR ex_ship_in_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 82, $ex_ship_in_qty_p);
	}
	
	public void ex_ship_in_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 82, $ex_ship_in_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR ship_rtn_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 83, $ship_rtn_gr_qty_p);
	}
	
	public void ship_rtn_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 83, $ship_rtn_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR sls_rtn_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 84, $sls_rtn_gr_qty_p);
	}
	
	public void sls_rtn_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 84, $sls_rtn_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR gi_total_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 85, $gi_total_qty_p);
	}
	
	public void gi_total_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 85, $gi_total_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR arr_rtn_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 86, $arr_rtn_qty_p);
	}
	
	public void arr_rtn_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 86, $arr_rtn_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 87, $purc_gi_qty_p);
	}
	
	public void purc_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 87, $purc_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR onr_rcv_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 88, $onr_rcv_gi_qty_p);
	}
	
	public void onr_rcv_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 88, $onr_rcv_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_rtn_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 89, $purc_rtn_gi_qty_p);
	}
	
	public void purc_rtn_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 89, $purc_rtn_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR onr_rcv_ret_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 90, $onr_rcv_ret_gi_qty_p);
	}
	
	public void onr_rcv_ret_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 90, $onr_rcv_ret_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR xpns_purc_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 91, $xpns_purc_gi_qty_p);
	}
	
	public void xpns_purc_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 91, $xpns_purc_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR xpns_purc_rtn_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 92, $xpns_purc_rtn_gi_qty_p);
	}
	
	public void xpns_purc_rtn_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 92, $xpns_purc_rtn_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR accpt_dfct_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 93, $accpt_dfct_gi_qty_p);
	}
	
	public void accpt_dfct_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 93, $accpt_dfct_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR inpt_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 94, $inpt_qty_p);
	}
	
	public void inpt_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 94, $inpt_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR loss_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 95, $loss_qty_p);
	}
	
	public void loss_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 95, $loss_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR ffr_prov_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 96, $ffr_prov_gi_qty_p);
	}
	
	public void ffr_prov_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 96, $ffr_prov_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR onr_prov_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 97, $onr_prov_gi_qty_p);
	}
	
	public void onr_prov_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 97, $onr_prov_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR ffr_prov_rtn_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 98, $ffr_prov_rtn_gi_qty_p);
	}
	
	public void ffr_prov_rtn_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 98, $ffr_prov_rtn_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR onr_prov_rtn_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 99, $onr_prov_rtn_gi_qty_p);
	}
	
	public void onr_prov_rtn_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 99, $onr_prov_rtn_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR insp_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 100, $insp_gi_qty_p);
	}
	
	public void insp_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 100, $insp_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR insp_cmpl_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 101, $insp_cmpl_gi_qty_p);
	}
	
	public void insp_cmpl_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 101, $insp_cmpl_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR insp_judg_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 102, $insp_judg_gi_qty_p);
	}
	
	public void insp_judg_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 102, $insp_judg_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR reinsp_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 103, $reinsp_gi_qty_p);
	}
	
	public void reinsp_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 103, $reinsp_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR insp_smpl_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 104, $insp_smpl_gi_qty_p);
	}
	
	public void insp_smpl_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 104, $insp_smpl_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR stk_adjst_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 105, $stk_adjst_gi_qty_p);
	}
	
	public void stk_adjst_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 105, $stk_adjst_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR prdct_wh_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 106, $prdct_wh_gi_qty_p);
	}
	
	public void prdct_wh_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 106, $prdct_wh_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR prdct_wh_rtn_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 107, $prdct_wh_rtn_gi_qty_p);
	}
	
	public void prdct_wh_rtn_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 107, $prdct_wh_rtn_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR xfr_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 108, $xfr_gi_qty_p);
	}
	
	public void xfr_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 108, $xfr_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR xfr_out_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 109, $xfr_out_qty_p);
	}
	
	public void xfr_out_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 109, $xfr_out_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_xfr_out_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 110, $purc_xfr_out_qty_p);
	}
	
	public void purc_xfr_out_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 110, $purc_xfr_out_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR xfr_rtn_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 111, $xfr_rtn_gi_qty_p);
	}
	
	public void xfr_rtn_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 111, $xfr_rtn_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR acxfr_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 112, $acxfr_gi_qty_p);
	}
	
	public void acxfr_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 112, $acxfr_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR scrp_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 113, $scrp_qty_p);
	}
	
	public void scrp_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 113, $scrp_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR xfr_itm_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 114, $xfr_itm_gi_qty_p);
	}
	
	public void xfr_itm_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 114, $xfr_itm_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR xfr_lot_sno_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 115, $xfr_lot_sno_gi_qty_p);
	}
	
	public void xfr_lot_sno_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 115, $xfr_lot_sno_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR xfr_grd_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 116, $xfr_grd_gi_qty_p);
	}
	
	public void xfr_grd_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 116, $xfr_grd_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR xfr_pack_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 117, $xfr_pack_gi_qty_p);
	}
	
	public void xfr_pack_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 117, $xfr_pack_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR ship_out_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 118, $ship_out_qty_p);
	}
	
	public void ship_out_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 118, $ship_out_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR ex_ship_out_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 119, $ex_ship_out_qty_p);
	}
	
	public void ex_ship_out_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 119, $ex_ship_out_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR ship_rtn_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 120, $ship_rtn_gi_qty_p);
	}
	
	public void ship_rtn_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 120, $ship_rtn_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR sls_rtn_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 121, $sls_rtn_gi_qty_p);
	}
	
	public void sls_rtn_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 121, $sls_rtn_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR sls_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 122, $sls_qty_p);
	}
	
	public void sls_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 122, $sls_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR end_stk_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 123, $end_stk_qty_p);
	}
	
	public void end_stk_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 123, $end_stk_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ini_stk_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 124, $ini_stk_amt_p);
	}
	
	public void ini_stk_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 124, $ini_stk_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR gr_total_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 125, $gr_total_amt_p);
	}
	
	public void gr_total_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 125, $gr_total_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR arr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 126, $arr_amt_p);
	}
	
	public void arr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 126, $arr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR purc_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 127, $purc_gr_amt_p);
	}
	
	public void purc_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 127, $purc_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR onr_rcv_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 128, $onr_rcv_gr_amt_p);
	}
	
	public void onr_rcv_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 128, $onr_rcv_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR purc_rtn_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 129, $purc_rtn_gr_amt_p);
	}
	
	public void purc_rtn_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 129, $purc_rtn_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR onr_rcv_ret_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 130, $onr_rcv_ret_gr_amt_p);
	}
	
	public void onr_rcv_ret_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 130, $onr_rcv_ret_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR xpns_purc_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 131, $xpns_purc_gr_amt_p);
	}
	
	public void xpns_purc_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 131, $xpns_purc_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR xpns_purc_rtn_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 132, $xpns_purc_rtn_gr_amt_p);
	}
	
	public void xpns_purc_rtn_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 132, $xpns_purc_rtn_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR accpt_dfct_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 133, $accpt_dfct_gr_amt_p);
	}
	
	public void accpt_dfct_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 133, $accpt_dfct_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR mfg_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 134, $mfg_amt_p);
	}
	
	public void mfg_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 134, $mfg_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR bymfg_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 135, $bymfg_amt_p);
	}
	
	public void bymfg_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 135, $bymfg_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ffr_prov_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 136, $ffr_prov_gr_amt_p);
	}
	
	public void ffr_prov_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 136, $ffr_prov_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR onr_prov_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 137, $onr_prov_gr_amt_p);
	}
	
	public void onr_prov_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 137, $onr_prov_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ffr_prov_rtn_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 138, $ffr_prov_rtn_gr_amt_p);
	}
	
	public void ffr_prov_rtn_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 138, $ffr_prov_rtn_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR onr_prov_rtn_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 139, $onr_prov_rtn_gr_amt_p);
	}
	
	public void onr_prov_rtn_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 139, $onr_prov_rtn_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR insp_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 140, $insp_gr_amt_p);
	}
	
	public void insp_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 140, $insp_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR insp_cmpl_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 141, $insp_cmpl_gr_amt_p);
	}
	
	public void insp_cmpl_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 141, $insp_cmpl_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR insp_judg_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 142, $insp_judg_gr_amt_p);
	}
	
	public void insp_judg_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 142, $insp_judg_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR reinsp_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 143, $reinsp_gr_amt_p);
	}
	
	public void reinsp_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 143, $reinsp_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR stk_adjst_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 144, $stk_adjst_gr_amt_p);
	}
	
	public void stk_adjst_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 144, $stk_adjst_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR prdct_wh_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 145, $prdct_wh_gr_amt_p);
	}
	
	public void prdct_wh_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 145, $prdct_wh_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR prdct_wh_rtn_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 146, $prdct_wh_rtn_gr_amt_p);
	}
	
	public void prdct_wh_rtn_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 146, $prdct_wh_rtn_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR xfr_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 147, $xfr_gr_amt_p);
	}
	
	public void xfr_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 147, $xfr_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR xfr_in_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 148, $xfr_in_amt_p);
	}
	
	public void xfr_in_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 148, $xfr_in_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR purc_xfr_in_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 149, $purc_xfr_in_amt_p);
	}
	
	public void purc_xfr_in_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 149, $purc_xfr_in_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR xfr_rtn_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 150, $xfr_rtn_gr_amt_p);
	}
	
	public void xfr_rtn_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 150, $xfr_rtn_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR acxfr_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 151, $acxfr_gr_amt_p);
	}
	
	public void acxfr_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 151, $acxfr_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR arr_cststk_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 152, $arr_cststk_amt_p);
	}
	
	public void arr_cststk_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 152, $arr_cststk_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR xfr_itm_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 153, $xfr_itm_gr_amt_p);
	}
	
	public void xfr_itm_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 153, $xfr_itm_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR xfr_lot_sno_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 154, $xfr_lot_sno_gr_amt_p);
	}
	
	public void xfr_lot_sno_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 154, $xfr_lot_sno_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR xfr_grd_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 155, $xfr_grd_gr_amt_p);
	}
	
	public void xfr_grd_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 155, $xfr_grd_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR xfr_pack_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 156, $xfr_pack_gr_amt_p);
	}
	
	public void xfr_pack_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 156, $xfr_pack_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ship_in_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 157, $ship_in_amt_p);
	}
	
	public void ship_in_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 157, $ship_in_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ex_ship_in_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 158, $ex_ship_in_amt_p);
	}
	
	public void ex_ship_in_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 158, $ex_ship_in_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ship_rtn_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 159, $ship_rtn_gr_amt_p);
	}
	
	public void ship_rtn_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 159, $ship_rtn_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR sls_rtn_gr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 160, $sls_rtn_gr_amt_p);
	}
	
	public void sls_rtn_gr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 160, $sls_rtn_gr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR gi_total_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 161, $gi_total_amt_p);
	}
	
	public void gi_total_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 161, $gi_total_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR arr_rtn_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 162, $arr_rtn_amt_p);
	}
	
	public void arr_rtn_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 162, $arr_rtn_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR purc_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 163, $purc_gi_amt_p);
	}
	
	public void purc_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 163, $purc_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR onr_rcv_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 164, $onr_rcv_gi_amt_p);
	}
	
	public void onr_rcv_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 164, $onr_rcv_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR purc_rtn_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 165, $purc_rtn_gi_amt_p);
	}
	
	public void purc_rtn_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 165, $purc_rtn_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR onr_rcv_ret_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 166, $onr_rcv_ret_gi_amt_p);
	}
	
	public void onr_rcv_ret_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 166, $onr_rcv_ret_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR xpns_purc_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 167, $xpns_purc_gi_amt_p);
	}
	
	public void xpns_purc_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 167, $xpns_purc_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR xpns_purc_rtn_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 168, $xpns_purc_rtn_gi_amt_p);
	}
	
	public void xpns_purc_rtn_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 168, $xpns_purc_rtn_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR accpt_dfct_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 169, $accpt_dfct_gi_amt_p);
	}
	
	public void accpt_dfct_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 169, $accpt_dfct_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR inpt_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 170, $inpt_amt_p);
	}
	
	public void inpt_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 170, $inpt_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR loss_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 171, $loss_amt_p);
	}
	
	public void loss_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 171, $loss_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ffr_prov_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 172, $ffr_prov_gi_amt_p);
	}
	
	public void ffr_prov_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 172, $ffr_prov_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR onr_prov_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 173, $onr_prov_gi_amt_p);
	}
	
	public void onr_prov_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 173, $onr_prov_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ffr_prov_rtn_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 174, $ffr_prov_rtn_gi_amt_p);
	}
	
	public void ffr_prov_rtn_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 174, $ffr_prov_rtn_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR onr_prov_rtn_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 175, $onr_prov_rtn_gi_amt_p);
	}
	
	public void onr_prov_rtn_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 175, $onr_prov_rtn_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR insp_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 176, $insp_gi_amt_p);
	}
	
	public void insp_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 176, $insp_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR insp_cmpl_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 177, $insp_cmpl_gi_amt_p);
	}
	
	public void insp_cmpl_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 177, $insp_cmpl_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR insp_judg_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 178, $insp_judg_gi_amt_p);
	}
	
	public void insp_judg_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 178, $insp_judg_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR reinsp_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 179, $reinsp_gi_amt_p);
	}
	
	public void reinsp_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 179, $reinsp_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR insp_smpl_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 180, $insp_smpl_gi_amt_p);
	}
	
	public void insp_smpl_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 180, $insp_smpl_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR stk_adjst_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 181, $stk_adjst_gi_amt_p);
	}
	
	public void stk_adjst_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 181, $stk_adjst_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR prdct_wh_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 182, $prdct_wh_gi_amt_p);
	}
	
	public void prdct_wh_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 182, $prdct_wh_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR prdct_wh_rtn_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 183, $prdct_wh_rtn_gi_amt_p);
	}
	
	public void prdct_wh_rtn_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 183, $prdct_wh_rtn_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR xfr_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 184, $xfr_gi_amt_p);
	}
	
	public void xfr_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 184, $xfr_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR xfr_out_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 185, $xfr_out_amt_p);
	}
	
	public void xfr_out_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 185, $xfr_out_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR purc_xfr_out_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 186, $purc_xfr_out_amt_p);
	}
	
	public void purc_xfr_out_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 186, $purc_xfr_out_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR xfr_rtn_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 187, $xfr_rtn_gi_amt_p);
	}
	
	public void xfr_rtn_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 187, $xfr_rtn_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR acxfr_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 188, $acxfr_gi_amt_p);
	}
	
	public void acxfr_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 188, $acxfr_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR scrp_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 189, $scrp_amt_p);
	}
	
	public void scrp_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 189, $scrp_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR xfr_itm_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 190, $xfr_itm_gi_amt_p);
	}
	
	public void xfr_itm_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 190, $xfr_itm_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR xfr_lot_sno_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 191, $xfr_lot_sno_gi_amt_p);
	}
	
	public void xfr_lot_sno_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 191, $xfr_lot_sno_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR xfr_grd_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 192, $xfr_grd_gi_amt_p);
	}
	
	public void xfr_grd_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 192, $xfr_grd_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR xfr_pack_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 193, $xfr_pack_gi_amt_p);
	}
	
	public void xfr_pack_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 193, $xfr_pack_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ship_out_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 194, $ship_out_amt_p);
	}
	
	public void ship_out_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 194, $ship_out_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ex_ship_out_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 195, $ex_ship_out_amt_p);
	}
	
	public void ex_ship_out_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 195, $ex_ship_out_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ship_rtn_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 196, $ship_rtn_gi_amt_p);
	}
	
	public void ship_rtn_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 196, $ship_rtn_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR sls_rtn_gi_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 197, $sls_rtn_gi_amt_p);
	}
	
	public void sls_rtn_gi_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 197, $sls_rtn_gi_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR sls_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 198, $sls_amt_p);
	}
	
	public void sls_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 198, $sls_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR end_stk_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 199, $end_stk_amt_p);
	}
	
	public void end_stk_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 199, $end_stk_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR std_unit_cost_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 200, $std_unit_cost_amt_p);
	}
	
	public void std_unit_cost_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 200, $std_unit_cost_amt_p, row);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 201, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 201, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 202, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 202, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 203, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 203, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 204, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 204, $itm_typ_d_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 205, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 205, $itm_grp_p, row);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			return in_xfr_typ();
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			return in_xfr_typ_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			return fix_no_typ_nm();
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			return fix_no();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($base_cur_rnd_typ.equalsIgnoreCase(name)) {
			return base_cur_rnd_typ();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			return base_cur_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($mly_io_cl_ym.equalsIgnoreCase(name)) {
			return mly_io_cl_ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			return in_xfr_typ();
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			return in_xfr_typ_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			return fix_no_typ_nm();
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			return fix_no();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($base_cur_rnd_typ.equalsIgnoreCase(name)) {
			return base_cur_rnd_typ();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			return base_cur_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($mly_io_cl_ym.equalsIgnoreCase(name)) {
			return mly_io_cl_ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			in_xfr_typ(value);
			return;
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			in_xfr_typ_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			fix_no_typ(value);
			return;
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			fix_no_typ_nm(value);
			return;
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			fix_no(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($base_cur_rnd_typ.equalsIgnoreCase(name)) {
			base_cur_rnd_typ(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($mly_io_cl_ym.equalsIgnoreCase(name)) {
			mly_io_cl_ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			in_xfr_typ(value);
			return;
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			in_xfr_typ_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			fix_no_typ(value);
			return;
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			fix_no_typ_nm(value);
			return;
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			fix_no(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($base_cur_rnd_typ.equalsIgnoreCase(name)) {
			base_cur_rnd_typ(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($mly_io_cl_ym.equalsIgnoreCase(name)) {
			mly_io_cl_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($str_ln_p.equalsIgnoreCase(name)) {
			return str_ln_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($ini_stk_qty_p.equalsIgnoreCase(name)) {
			return ini_stk_qty_p();
		}
		if ($gr_total_qty_p.equalsIgnoreCase(name)) {
			return gr_total_qty_p();
		}
		if ($arr_qty_p.equalsIgnoreCase(name)) {
			return arr_qty_p();
		}
		if ($purc_gr_qty_p.equalsIgnoreCase(name)) {
			return purc_gr_qty_p();
		}
		if ($onr_rcv_gr_qty_p.equalsIgnoreCase(name)) {
			return onr_rcv_gr_qty_p();
		}
		if ($purc_rtn_gr_qty_p.equalsIgnoreCase(name)) {
			return purc_rtn_gr_qty_p();
		}
		if ($onr_rcv_ret_gr_qty_p.equalsIgnoreCase(name)) {
			return onr_rcv_ret_gr_qty_p();
		}
		if ($xpns_purc_gr_qty_p.equalsIgnoreCase(name)) {
			return xpns_purc_gr_qty_p();
		}
		if ($xpns_purc_rtn_gr_qty_p.equalsIgnoreCase(name)) {
			return xpns_purc_rtn_gr_qty_p();
		}
		if ($accpt_dfct_gr_qty_p.equalsIgnoreCase(name)) {
			return accpt_dfct_gr_qty_p();
		}
		if ($mfg_qty_p.equalsIgnoreCase(name)) {
			return mfg_qty_p();
		}
		if ($bymfg_qty_p.equalsIgnoreCase(name)) {
			return bymfg_qty_p();
		}
		if ($ffr_prov_gr_qty_p.equalsIgnoreCase(name)) {
			return ffr_prov_gr_qty_p();
		}
		if ($onr_prov_gr_qty_p.equalsIgnoreCase(name)) {
			return onr_prov_gr_qty_p();
		}
		if ($ffr_prov_rtn_gr_qty_p.equalsIgnoreCase(name)) {
			return ffr_prov_rtn_gr_qty_p();
		}
		if ($onr_prov_rtn_gr_qty_p.equalsIgnoreCase(name)) {
			return onr_prov_rtn_gr_qty_p();
		}
		if ($insp_gr_qty_p.equalsIgnoreCase(name)) {
			return insp_gr_qty_p();
		}
		if ($insp_cmpl_gr_qty_p.equalsIgnoreCase(name)) {
			return insp_cmpl_gr_qty_p();
		}
		if ($insp_judg_gr_qty_p.equalsIgnoreCase(name)) {
			return insp_judg_gr_qty_p();
		}
		if ($reinsp_gr_qty_p.equalsIgnoreCase(name)) {
			return reinsp_gr_qty_p();
		}
		if ($stk_adjst_gr_qty_p.equalsIgnoreCase(name)) {
			return stk_adjst_gr_qty_p();
		}
		if ($prdct_wh_gr_qty_p.equalsIgnoreCase(name)) {
			return prdct_wh_gr_qty_p();
		}
		if ($prdct_wh_rtn_gr_qty_p.equalsIgnoreCase(name)) {
			return prdct_wh_rtn_gr_qty_p();
		}
		if ($xfr_gr_qty_p.equalsIgnoreCase(name)) {
			return xfr_gr_qty_p();
		}
		if ($xfr_in_qty_p.equalsIgnoreCase(name)) {
			return xfr_in_qty_p();
		}
		if ($purc_xfr_in_qty_p.equalsIgnoreCase(name)) {
			return purc_xfr_in_qty_p();
		}
		if ($xfr_rtn_gr_qty_p.equalsIgnoreCase(name)) {
			return xfr_rtn_gr_qty_p();
		}
		if ($acxfr_gr_qty_p.equalsIgnoreCase(name)) {
			return acxfr_gr_qty_p();
		}
		if ($arr_cststk_qty_p.equalsIgnoreCase(name)) {
			return arr_cststk_qty_p();
		}
		if ($xfr_itm_gr_qty_p.equalsIgnoreCase(name)) {
			return xfr_itm_gr_qty_p();
		}
		if ($xfr_lot_sno_gr_qty_p.equalsIgnoreCase(name)) {
			return xfr_lot_sno_gr_qty_p();
		}
		if ($xfr_grd_gr_qty_p.equalsIgnoreCase(name)) {
			return xfr_grd_gr_qty_p();
		}
		if ($xfr_pack_gr_qty_p.equalsIgnoreCase(name)) {
			return xfr_pack_gr_qty_p();
		}
		if ($ship_in_qty_p.equalsIgnoreCase(name)) {
			return ship_in_qty_p();
		}
		if ($ex_ship_in_qty_p.equalsIgnoreCase(name)) {
			return ex_ship_in_qty_p();
		}
		if ($ship_rtn_gr_qty_p.equalsIgnoreCase(name)) {
			return ship_rtn_gr_qty_p();
		}
		if ($sls_rtn_gr_qty_p.equalsIgnoreCase(name)) {
			return sls_rtn_gr_qty_p();
		}
		if ($gi_total_qty_p.equalsIgnoreCase(name)) {
			return gi_total_qty_p();
		}
		if ($arr_rtn_qty_p.equalsIgnoreCase(name)) {
			return arr_rtn_qty_p();
		}
		if ($purc_gi_qty_p.equalsIgnoreCase(name)) {
			return purc_gi_qty_p();
		}
		if ($onr_rcv_gi_qty_p.equalsIgnoreCase(name)) {
			return onr_rcv_gi_qty_p();
		}
		if ($purc_rtn_gi_qty_p.equalsIgnoreCase(name)) {
			return purc_rtn_gi_qty_p();
		}
		if ($onr_rcv_ret_gi_qty_p.equalsIgnoreCase(name)) {
			return onr_rcv_ret_gi_qty_p();
		}
		if ($xpns_purc_gi_qty_p.equalsIgnoreCase(name)) {
			return xpns_purc_gi_qty_p();
		}
		if ($xpns_purc_rtn_gi_qty_p.equalsIgnoreCase(name)) {
			return xpns_purc_rtn_gi_qty_p();
		}
		if ($accpt_dfct_gi_qty_p.equalsIgnoreCase(name)) {
			return accpt_dfct_gi_qty_p();
		}
		if ($inpt_qty_p.equalsIgnoreCase(name)) {
			return inpt_qty_p();
		}
		if ($loss_qty_p.equalsIgnoreCase(name)) {
			return loss_qty_p();
		}
		if ($ffr_prov_gi_qty_p.equalsIgnoreCase(name)) {
			return ffr_prov_gi_qty_p();
		}
		if ($onr_prov_gi_qty_p.equalsIgnoreCase(name)) {
			return onr_prov_gi_qty_p();
		}
		if ($ffr_prov_rtn_gi_qty_p.equalsIgnoreCase(name)) {
			return ffr_prov_rtn_gi_qty_p();
		}
		if ($onr_prov_rtn_gi_qty_p.equalsIgnoreCase(name)) {
			return onr_prov_rtn_gi_qty_p();
		}
		if ($insp_gi_qty_p.equalsIgnoreCase(name)) {
			return insp_gi_qty_p();
		}
		if ($insp_cmpl_gi_qty_p.equalsIgnoreCase(name)) {
			return insp_cmpl_gi_qty_p();
		}
		if ($insp_judg_gi_qty_p.equalsIgnoreCase(name)) {
			return insp_judg_gi_qty_p();
		}
		if ($reinsp_gi_qty_p.equalsIgnoreCase(name)) {
			return reinsp_gi_qty_p();
		}
		if ($insp_smpl_gi_qty_p.equalsIgnoreCase(name)) {
			return insp_smpl_gi_qty_p();
		}
		if ($stk_adjst_gi_qty_p.equalsIgnoreCase(name)) {
			return stk_adjst_gi_qty_p();
		}
		if ($prdct_wh_gi_qty_p.equalsIgnoreCase(name)) {
			return prdct_wh_gi_qty_p();
		}
		if ($prdct_wh_rtn_gi_qty_p.equalsIgnoreCase(name)) {
			return prdct_wh_rtn_gi_qty_p();
		}
		if ($xfr_gi_qty_p.equalsIgnoreCase(name)) {
			return xfr_gi_qty_p();
		}
		if ($xfr_out_qty_p.equalsIgnoreCase(name)) {
			return xfr_out_qty_p();
		}
		if ($purc_xfr_out_qty_p.equalsIgnoreCase(name)) {
			return purc_xfr_out_qty_p();
		}
		if ($xfr_rtn_gi_qty_p.equalsIgnoreCase(name)) {
			return xfr_rtn_gi_qty_p();
		}
		if ($acxfr_gi_qty_p.equalsIgnoreCase(name)) {
			return acxfr_gi_qty_p();
		}
		if ($scrp_qty_p.equalsIgnoreCase(name)) {
			return scrp_qty_p();
		}
		if ($xfr_itm_gi_qty_p.equalsIgnoreCase(name)) {
			return xfr_itm_gi_qty_p();
		}
		if ($xfr_lot_sno_gi_qty_p.equalsIgnoreCase(name)) {
			return xfr_lot_sno_gi_qty_p();
		}
		if ($xfr_grd_gi_qty_p.equalsIgnoreCase(name)) {
			return xfr_grd_gi_qty_p();
		}
		if ($xfr_pack_gi_qty_p.equalsIgnoreCase(name)) {
			return xfr_pack_gi_qty_p();
		}
		if ($ship_out_qty_p.equalsIgnoreCase(name)) {
			return ship_out_qty_p();
		}
		if ($ex_ship_out_qty_p.equalsIgnoreCase(name)) {
			return ex_ship_out_qty_p();
		}
		if ($ship_rtn_gi_qty_p.equalsIgnoreCase(name)) {
			return ship_rtn_gi_qty_p();
		}
		if ($sls_rtn_gi_qty_p.equalsIgnoreCase(name)) {
			return sls_rtn_gi_qty_p();
		}
		if ($sls_qty_p.equalsIgnoreCase(name)) {
			return sls_qty_p();
		}
		if ($end_stk_qty_p.equalsIgnoreCase(name)) {
			return end_stk_qty_p();
		}
		if ($ini_stk_amt_p.equalsIgnoreCase(name)) {
			return ini_stk_amt_p();
		}
		if ($gr_total_amt_p.equalsIgnoreCase(name)) {
			return gr_total_amt_p();
		}
		if ($arr_amt_p.equalsIgnoreCase(name)) {
			return arr_amt_p();
		}
		if ($purc_gr_amt_p.equalsIgnoreCase(name)) {
			return purc_gr_amt_p();
		}
		if ($onr_rcv_gr_amt_p.equalsIgnoreCase(name)) {
			return onr_rcv_gr_amt_p();
		}
		if ($purc_rtn_gr_amt_p.equalsIgnoreCase(name)) {
			return purc_rtn_gr_amt_p();
		}
		if ($onr_rcv_ret_gr_amt_p.equalsIgnoreCase(name)) {
			return onr_rcv_ret_gr_amt_p();
		}
		if ($xpns_purc_gr_amt_p.equalsIgnoreCase(name)) {
			return xpns_purc_gr_amt_p();
		}
		if ($xpns_purc_rtn_gr_amt_p.equalsIgnoreCase(name)) {
			return xpns_purc_rtn_gr_amt_p();
		}
		if ($accpt_dfct_gr_amt_p.equalsIgnoreCase(name)) {
			return accpt_dfct_gr_amt_p();
		}
		if ($mfg_amt_p.equalsIgnoreCase(name)) {
			return mfg_amt_p();
		}
		if ($bymfg_amt_p.equalsIgnoreCase(name)) {
			return bymfg_amt_p();
		}
		if ($ffr_prov_gr_amt_p.equalsIgnoreCase(name)) {
			return ffr_prov_gr_amt_p();
		}
		if ($onr_prov_gr_amt_p.equalsIgnoreCase(name)) {
			return onr_prov_gr_amt_p();
		}
		if ($ffr_prov_rtn_gr_amt_p.equalsIgnoreCase(name)) {
			return ffr_prov_rtn_gr_amt_p();
		}
		if ($onr_prov_rtn_gr_amt_p.equalsIgnoreCase(name)) {
			return onr_prov_rtn_gr_amt_p();
		}
		if ($insp_gr_amt_p.equalsIgnoreCase(name)) {
			return insp_gr_amt_p();
		}
		if ($insp_cmpl_gr_amt_p.equalsIgnoreCase(name)) {
			return insp_cmpl_gr_amt_p();
		}
		if ($insp_judg_gr_amt_p.equalsIgnoreCase(name)) {
			return insp_judg_gr_amt_p();
		}
		if ($reinsp_gr_amt_p.equalsIgnoreCase(name)) {
			return reinsp_gr_amt_p();
		}
		if ($stk_adjst_gr_amt_p.equalsIgnoreCase(name)) {
			return stk_adjst_gr_amt_p();
		}
		if ($prdct_wh_gr_amt_p.equalsIgnoreCase(name)) {
			return prdct_wh_gr_amt_p();
		}
		if ($prdct_wh_rtn_gr_amt_p.equalsIgnoreCase(name)) {
			return prdct_wh_rtn_gr_amt_p();
		}
		if ($xfr_gr_amt_p.equalsIgnoreCase(name)) {
			return xfr_gr_amt_p();
		}
		if ($xfr_in_amt_p.equalsIgnoreCase(name)) {
			return xfr_in_amt_p();
		}
		if ($purc_xfr_in_amt_p.equalsIgnoreCase(name)) {
			return purc_xfr_in_amt_p();
		}
		if ($xfr_rtn_gr_amt_p.equalsIgnoreCase(name)) {
			return xfr_rtn_gr_amt_p();
		}
		if ($acxfr_gr_amt_p.equalsIgnoreCase(name)) {
			return acxfr_gr_amt_p();
		}
		if ($arr_cststk_amt_p.equalsIgnoreCase(name)) {
			return arr_cststk_amt_p();
		}
		if ($xfr_itm_gr_amt_p.equalsIgnoreCase(name)) {
			return xfr_itm_gr_amt_p();
		}
		if ($xfr_lot_sno_gr_amt_p.equalsIgnoreCase(name)) {
			return xfr_lot_sno_gr_amt_p();
		}
		if ($xfr_grd_gr_amt_p.equalsIgnoreCase(name)) {
			return xfr_grd_gr_amt_p();
		}
		if ($xfr_pack_gr_amt_p.equalsIgnoreCase(name)) {
			return xfr_pack_gr_amt_p();
		}
		if ($ship_in_amt_p.equalsIgnoreCase(name)) {
			return ship_in_amt_p();
		}
		if ($ex_ship_in_amt_p.equalsIgnoreCase(name)) {
			return ex_ship_in_amt_p();
		}
		if ($ship_rtn_gr_amt_p.equalsIgnoreCase(name)) {
			return ship_rtn_gr_amt_p();
		}
		if ($sls_rtn_gr_amt_p.equalsIgnoreCase(name)) {
			return sls_rtn_gr_amt_p();
		}
		if ($gi_total_amt_p.equalsIgnoreCase(name)) {
			return gi_total_amt_p();
		}
		if ($arr_rtn_amt_p.equalsIgnoreCase(name)) {
			return arr_rtn_amt_p();
		}
		if ($purc_gi_amt_p.equalsIgnoreCase(name)) {
			return purc_gi_amt_p();
		}
		if ($onr_rcv_gi_amt_p.equalsIgnoreCase(name)) {
			return onr_rcv_gi_amt_p();
		}
		if ($purc_rtn_gi_amt_p.equalsIgnoreCase(name)) {
			return purc_rtn_gi_amt_p();
		}
		if ($onr_rcv_ret_gi_amt_p.equalsIgnoreCase(name)) {
			return onr_rcv_ret_gi_amt_p();
		}
		if ($xpns_purc_gi_amt_p.equalsIgnoreCase(name)) {
			return xpns_purc_gi_amt_p();
		}
		if ($xpns_purc_rtn_gi_amt_p.equalsIgnoreCase(name)) {
			return xpns_purc_rtn_gi_amt_p();
		}
		if ($accpt_dfct_gi_amt_p.equalsIgnoreCase(name)) {
			return accpt_dfct_gi_amt_p();
		}
		if ($inpt_amt_p.equalsIgnoreCase(name)) {
			return inpt_amt_p();
		}
		if ($loss_amt_p.equalsIgnoreCase(name)) {
			return loss_amt_p();
		}
		if ($ffr_prov_gi_amt_p.equalsIgnoreCase(name)) {
			return ffr_prov_gi_amt_p();
		}
		if ($onr_prov_gi_amt_p.equalsIgnoreCase(name)) {
			return onr_prov_gi_amt_p();
		}
		if ($ffr_prov_rtn_gi_amt_p.equalsIgnoreCase(name)) {
			return ffr_prov_rtn_gi_amt_p();
		}
		if ($onr_prov_rtn_gi_amt_p.equalsIgnoreCase(name)) {
			return onr_prov_rtn_gi_amt_p();
		}
		if ($insp_gi_amt_p.equalsIgnoreCase(name)) {
			return insp_gi_amt_p();
		}
		if ($insp_cmpl_gi_amt_p.equalsIgnoreCase(name)) {
			return insp_cmpl_gi_amt_p();
		}
		if ($insp_judg_gi_amt_p.equalsIgnoreCase(name)) {
			return insp_judg_gi_amt_p();
		}
		if ($reinsp_gi_amt_p.equalsIgnoreCase(name)) {
			return reinsp_gi_amt_p();
		}
		if ($insp_smpl_gi_amt_p.equalsIgnoreCase(name)) {
			return insp_smpl_gi_amt_p();
		}
		if ($stk_adjst_gi_amt_p.equalsIgnoreCase(name)) {
			return stk_adjst_gi_amt_p();
		}
		if ($prdct_wh_gi_amt_p.equalsIgnoreCase(name)) {
			return prdct_wh_gi_amt_p();
		}
		if ($prdct_wh_rtn_gi_amt_p.equalsIgnoreCase(name)) {
			return prdct_wh_rtn_gi_amt_p();
		}
		if ($xfr_gi_amt_p.equalsIgnoreCase(name)) {
			return xfr_gi_amt_p();
		}
		if ($xfr_out_amt_p.equalsIgnoreCase(name)) {
			return xfr_out_amt_p();
		}
		if ($purc_xfr_out_amt_p.equalsIgnoreCase(name)) {
			return purc_xfr_out_amt_p();
		}
		if ($xfr_rtn_gi_amt_p.equalsIgnoreCase(name)) {
			return xfr_rtn_gi_amt_p();
		}
		if ($acxfr_gi_amt_p.equalsIgnoreCase(name)) {
			return acxfr_gi_amt_p();
		}
		if ($scrp_amt_p.equalsIgnoreCase(name)) {
			return scrp_amt_p();
		}
		if ($xfr_itm_gi_amt_p.equalsIgnoreCase(name)) {
			return xfr_itm_gi_amt_p();
		}
		if ($xfr_lot_sno_gi_amt_p.equalsIgnoreCase(name)) {
			return xfr_lot_sno_gi_amt_p();
		}
		if ($xfr_grd_gi_amt_p.equalsIgnoreCase(name)) {
			return xfr_grd_gi_amt_p();
		}
		if ($xfr_pack_gi_amt_p.equalsIgnoreCase(name)) {
			return xfr_pack_gi_amt_p();
		}
		if ($ship_out_amt_p.equalsIgnoreCase(name)) {
			return ship_out_amt_p();
		}
		if ($ex_ship_out_amt_p.equalsIgnoreCase(name)) {
			return ex_ship_out_amt_p();
		}
		if ($ship_rtn_gi_amt_p.equalsIgnoreCase(name)) {
			return ship_rtn_gi_amt_p();
		}
		if ($sls_rtn_gi_amt_p.equalsIgnoreCase(name)) {
			return sls_rtn_gi_amt_p();
		}
		if ($sls_amt_p.equalsIgnoreCase(name)) {
			return sls_amt_p();
		}
		if ($end_stk_amt_p.equalsIgnoreCase(name)) {
			return end_stk_amt_p();
		}
		if ($std_unit_cost_amt_p.equalsIgnoreCase(name)) {
			return std_unit_cost_amt_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5250.VerNoR.class, value)
			);
			return;
		}
		if ($str_ln_p.equalsIgnoreCase(name)) {
			str_ln_p(
				((MCContainerMeta) str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($ini_stk_qty_p.equalsIgnoreCase(name)) {
			ini_stk_qty_p(
				((MCContainerMeta) ini_stk_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($gr_total_qty_p.equalsIgnoreCase(name)) {
			gr_total_qty_p(
				((MCContainerMeta) gr_total_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($arr_qty_p.equalsIgnoreCase(name)) {
			arr_qty_p(
				((MCContainerMeta) arr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_gr_qty_p.equalsIgnoreCase(name)) {
			purc_gr_qty_p(
				((MCContainerMeta) purc_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($onr_rcv_gr_qty_p.equalsIgnoreCase(name)) {
			onr_rcv_gr_qty_p(
				((MCContainerMeta) onr_rcv_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_rtn_gr_qty_p.equalsIgnoreCase(name)) {
			purc_rtn_gr_qty_p(
				((MCContainerMeta) purc_rtn_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($onr_rcv_ret_gr_qty_p.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_qty_p(
				((MCContainerMeta) onr_rcv_ret_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($xpns_purc_gr_qty_p.equalsIgnoreCase(name)) {
			xpns_purc_gr_qty_p(
				((MCContainerMeta) xpns_purc_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($xpns_purc_rtn_gr_qty_p.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_qty_p(
				((MCContainerMeta) xpns_purc_rtn_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($accpt_dfct_gr_qty_p.equalsIgnoreCase(name)) {
			accpt_dfct_gr_qty_p(
				((MCContainerMeta) accpt_dfct_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($mfg_qty_p.equalsIgnoreCase(name)) {
			mfg_qty_p(
				((MCContainerMeta) mfg_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($bymfg_qty_p.equalsIgnoreCase(name)) {
			bymfg_qty_p(
				((MCContainerMeta) bymfg_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($ffr_prov_gr_qty_p.equalsIgnoreCase(name)) {
			ffr_prov_gr_qty_p(
				((MCContainerMeta) ffr_prov_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($onr_prov_gr_qty_p.equalsIgnoreCase(name)) {
			onr_prov_gr_qty_p(
				((MCContainerMeta) onr_prov_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($ffr_prov_rtn_gr_qty_p.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_qty_p(
				((MCContainerMeta) ffr_prov_rtn_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($onr_prov_rtn_gr_qty_p.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_qty_p(
				((MCContainerMeta) onr_prov_rtn_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($insp_gr_qty_p.equalsIgnoreCase(name)) {
			insp_gr_qty_p(
				((MCContainerMeta) insp_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($insp_cmpl_gr_qty_p.equalsIgnoreCase(name)) {
			insp_cmpl_gr_qty_p(
				((MCContainerMeta) insp_cmpl_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($insp_judg_gr_qty_p.equalsIgnoreCase(name)) {
			insp_judg_gr_qty_p(
				((MCContainerMeta) insp_judg_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($reinsp_gr_qty_p.equalsIgnoreCase(name)) {
			reinsp_gr_qty_p(
				((MCContainerMeta) reinsp_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($stk_adjst_gr_qty_p.equalsIgnoreCase(name)) {
			stk_adjst_gr_qty_p(
				((MCContainerMeta) stk_adjst_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($prdct_wh_gr_qty_p.equalsIgnoreCase(name)) {
			prdct_wh_gr_qty_p(
				((MCContainerMeta) prdct_wh_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($prdct_wh_rtn_gr_qty_p.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_qty_p(
				((MCContainerMeta) prdct_wh_rtn_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($xfr_gr_qty_p.equalsIgnoreCase(name)) {
			xfr_gr_qty_p(
				((MCContainerMeta) xfr_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($xfr_in_qty_p.equalsIgnoreCase(name)) {
			xfr_in_qty_p(
				((MCContainerMeta) xfr_in_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_xfr_in_qty_p.equalsIgnoreCase(name)) {
			purc_xfr_in_qty_p(
				((MCContainerMeta) purc_xfr_in_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($xfr_rtn_gr_qty_p.equalsIgnoreCase(name)) {
			xfr_rtn_gr_qty_p(
				((MCContainerMeta) xfr_rtn_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($acxfr_gr_qty_p.equalsIgnoreCase(name)) {
			acxfr_gr_qty_p(
				((MCContainerMeta) acxfr_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($arr_cststk_qty_p.equalsIgnoreCase(name)) {
			arr_cststk_qty_p(
				((MCContainerMeta) arr_cststk_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($xfr_itm_gr_qty_p.equalsIgnoreCase(name)) {
			xfr_itm_gr_qty_p(
				((MCContainerMeta) xfr_itm_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($xfr_lot_sno_gr_qty_p.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_qty_p(
				((MCContainerMeta) xfr_lot_sno_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($xfr_grd_gr_qty_p.equalsIgnoreCase(name)) {
			xfr_grd_gr_qty_p(
				((MCContainerMeta) xfr_grd_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($xfr_pack_gr_qty_p.equalsIgnoreCase(name)) {
			xfr_pack_gr_qty_p(
				((MCContainerMeta) xfr_pack_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($ship_in_qty_p.equalsIgnoreCase(name)) {
			ship_in_qty_p(
				((MCContainerMeta) ship_in_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($ex_ship_in_qty_p.equalsIgnoreCase(name)) {
			ex_ship_in_qty_p(
				((MCContainerMeta) ex_ship_in_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($ship_rtn_gr_qty_p.equalsIgnoreCase(name)) {
			ship_rtn_gr_qty_p(
				((MCContainerMeta) ship_rtn_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($sls_rtn_gr_qty_p.equalsIgnoreCase(name)) {
			sls_rtn_gr_qty_p(
				((MCContainerMeta) sls_rtn_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($gi_total_qty_p.equalsIgnoreCase(name)) {
			gi_total_qty_p(
				((MCContainerMeta) gi_total_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($arr_rtn_qty_p.equalsIgnoreCase(name)) {
			arr_rtn_qty_p(
				((MCContainerMeta) arr_rtn_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_gi_qty_p.equalsIgnoreCase(name)) {
			purc_gi_qty_p(
				((MCContainerMeta) purc_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($onr_rcv_gi_qty_p.equalsIgnoreCase(name)) {
			onr_rcv_gi_qty_p(
				((MCContainerMeta) onr_rcv_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_rtn_gi_qty_p.equalsIgnoreCase(name)) {
			purc_rtn_gi_qty_p(
				((MCContainerMeta) purc_rtn_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($onr_rcv_ret_gi_qty_p.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_qty_p(
				((MCContainerMeta) onr_rcv_ret_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($xpns_purc_gi_qty_p.equalsIgnoreCase(name)) {
			xpns_purc_gi_qty_p(
				((MCContainerMeta) xpns_purc_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($xpns_purc_rtn_gi_qty_p.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_qty_p(
				((MCContainerMeta) xpns_purc_rtn_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($accpt_dfct_gi_qty_p.equalsIgnoreCase(name)) {
			accpt_dfct_gi_qty_p(
				((MCContainerMeta) accpt_dfct_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($inpt_qty_p.equalsIgnoreCase(name)) {
			inpt_qty_p(
				((MCContainerMeta) inpt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($loss_qty_p.equalsIgnoreCase(name)) {
			loss_qty_p(
				((MCContainerMeta) loss_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($ffr_prov_gi_qty_p.equalsIgnoreCase(name)) {
			ffr_prov_gi_qty_p(
				((MCContainerMeta) ffr_prov_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($onr_prov_gi_qty_p.equalsIgnoreCase(name)) {
			onr_prov_gi_qty_p(
				((MCContainerMeta) onr_prov_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($ffr_prov_rtn_gi_qty_p.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_qty_p(
				((MCContainerMeta) ffr_prov_rtn_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($onr_prov_rtn_gi_qty_p.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_qty_p(
				((MCContainerMeta) onr_prov_rtn_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($insp_gi_qty_p.equalsIgnoreCase(name)) {
			insp_gi_qty_p(
				((MCContainerMeta) insp_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($insp_cmpl_gi_qty_p.equalsIgnoreCase(name)) {
			insp_cmpl_gi_qty_p(
				((MCContainerMeta) insp_cmpl_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($insp_judg_gi_qty_p.equalsIgnoreCase(name)) {
			insp_judg_gi_qty_p(
				((MCContainerMeta) insp_judg_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($reinsp_gi_qty_p.equalsIgnoreCase(name)) {
			reinsp_gi_qty_p(
				((MCContainerMeta) reinsp_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($insp_smpl_gi_qty_p.equalsIgnoreCase(name)) {
			insp_smpl_gi_qty_p(
				((MCContainerMeta) insp_smpl_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($stk_adjst_gi_qty_p.equalsIgnoreCase(name)) {
			stk_adjst_gi_qty_p(
				((MCContainerMeta) stk_adjst_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($prdct_wh_gi_qty_p.equalsIgnoreCase(name)) {
			prdct_wh_gi_qty_p(
				((MCContainerMeta) prdct_wh_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($prdct_wh_rtn_gi_qty_p.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_qty_p(
				((MCContainerMeta) prdct_wh_rtn_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($xfr_gi_qty_p.equalsIgnoreCase(name)) {
			xfr_gi_qty_p(
				((MCContainerMeta) xfr_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($xfr_out_qty_p.equalsIgnoreCase(name)) {
			xfr_out_qty_p(
				((MCContainerMeta) xfr_out_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_xfr_out_qty_p.equalsIgnoreCase(name)) {
			purc_xfr_out_qty_p(
				((MCContainerMeta) purc_xfr_out_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($xfr_rtn_gi_qty_p.equalsIgnoreCase(name)) {
			xfr_rtn_gi_qty_p(
				((MCContainerMeta) xfr_rtn_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($acxfr_gi_qty_p.equalsIgnoreCase(name)) {
			acxfr_gi_qty_p(
				((MCContainerMeta) acxfr_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($scrp_qty_p.equalsIgnoreCase(name)) {
			scrp_qty_p(
				((MCContainerMeta) scrp_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($xfr_itm_gi_qty_p.equalsIgnoreCase(name)) {
			xfr_itm_gi_qty_p(
				((MCContainerMeta) xfr_itm_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($xfr_lot_sno_gi_qty_p.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_qty_p(
				((MCContainerMeta) xfr_lot_sno_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($xfr_grd_gi_qty_p.equalsIgnoreCase(name)) {
			xfr_grd_gi_qty_p(
				((MCContainerMeta) xfr_grd_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($xfr_pack_gi_qty_p.equalsIgnoreCase(name)) {
			xfr_pack_gi_qty_p(
				((MCContainerMeta) xfr_pack_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($ship_out_qty_p.equalsIgnoreCase(name)) {
			ship_out_qty_p(
				((MCContainerMeta) ship_out_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($ex_ship_out_qty_p.equalsIgnoreCase(name)) {
			ex_ship_out_qty_p(
				((MCContainerMeta) ex_ship_out_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($ship_rtn_gi_qty_p.equalsIgnoreCase(name)) {
			ship_rtn_gi_qty_p(
				((MCContainerMeta) ship_rtn_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($sls_rtn_gi_qty_p.equalsIgnoreCase(name)) {
			sls_rtn_gi_qty_p(
				((MCContainerMeta) sls_rtn_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($sls_qty_p.equalsIgnoreCase(name)) {
			sls_qty_p(
				((MCContainerMeta) sls_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($end_stk_qty_p.equalsIgnoreCase(name)) {
			end_stk_qty_p(
				((MCContainerMeta) end_stk_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($ini_stk_amt_p.equalsIgnoreCase(name)) {
			ini_stk_amt_p(
				((MCContainerMeta) ini_stk_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($gr_total_amt_p.equalsIgnoreCase(name)) {
			gr_total_amt_p(
				((MCContainerMeta) gr_total_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($arr_amt_p.equalsIgnoreCase(name)) {
			arr_amt_p(
				((MCContainerMeta) arr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($purc_gr_amt_p.equalsIgnoreCase(name)) {
			purc_gr_amt_p(
				((MCContainerMeta) purc_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($onr_rcv_gr_amt_p.equalsIgnoreCase(name)) {
			onr_rcv_gr_amt_p(
				((MCContainerMeta) onr_rcv_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($purc_rtn_gr_amt_p.equalsIgnoreCase(name)) {
			purc_rtn_gr_amt_p(
				((MCContainerMeta) purc_rtn_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($onr_rcv_ret_gr_amt_p.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_amt_p(
				((MCContainerMeta) onr_rcv_ret_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xpns_purc_gr_amt_p.equalsIgnoreCase(name)) {
			xpns_purc_gr_amt_p(
				((MCContainerMeta) xpns_purc_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xpns_purc_rtn_gr_amt_p.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_amt_p(
				((MCContainerMeta) xpns_purc_rtn_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($accpt_dfct_gr_amt_p.equalsIgnoreCase(name)) {
			accpt_dfct_gr_amt_p(
				((MCContainerMeta) accpt_dfct_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($mfg_amt_p.equalsIgnoreCase(name)) {
			mfg_amt_p(
				((MCContainerMeta) mfg_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($bymfg_amt_p.equalsIgnoreCase(name)) {
			bymfg_amt_p(
				((MCContainerMeta) bymfg_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ffr_prov_gr_amt_p.equalsIgnoreCase(name)) {
			ffr_prov_gr_amt_p(
				((MCContainerMeta) ffr_prov_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($onr_prov_gr_amt_p.equalsIgnoreCase(name)) {
			onr_prov_gr_amt_p(
				((MCContainerMeta) onr_prov_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ffr_prov_rtn_gr_amt_p.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_amt_p(
				((MCContainerMeta) ffr_prov_rtn_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($onr_prov_rtn_gr_amt_p.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_amt_p(
				((MCContainerMeta) onr_prov_rtn_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($insp_gr_amt_p.equalsIgnoreCase(name)) {
			insp_gr_amt_p(
				((MCContainerMeta) insp_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($insp_cmpl_gr_amt_p.equalsIgnoreCase(name)) {
			insp_cmpl_gr_amt_p(
				((MCContainerMeta) insp_cmpl_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($insp_judg_gr_amt_p.equalsIgnoreCase(name)) {
			insp_judg_gr_amt_p(
				((MCContainerMeta) insp_judg_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($reinsp_gr_amt_p.equalsIgnoreCase(name)) {
			reinsp_gr_amt_p(
				((MCContainerMeta) reinsp_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($stk_adjst_gr_amt_p.equalsIgnoreCase(name)) {
			stk_adjst_gr_amt_p(
				((MCContainerMeta) stk_adjst_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($prdct_wh_gr_amt_p.equalsIgnoreCase(name)) {
			prdct_wh_gr_amt_p(
				((MCContainerMeta) prdct_wh_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($prdct_wh_rtn_gr_amt_p.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_amt_p(
				((MCContainerMeta) prdct_wh_rtn_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xfr_gr_amt_p.equalsIgnoreCase(name)) {
			xfr_gr_amt_p(
				((MCContainerMeta) xfr_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xfr_in_amt_p.equalsIgnoreCase(name)) {
			xfr_in_amt_p(
				((MCContainerMeta) xfr_in_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($purc_xfr_in_amt_p.equalsIgnoreCase(name)) {
			purc_xfr_in_amt_p(
				((MCContainerMeta) purc_xfr_in_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xfr_rtn_gr_amt_p.equalsIgnoreCase(name)) {
			xfr_rtn_gr_amt_p(
				((MCContainerMeta) xfr_rtn_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($acxfr_gr_amt_p.equalsIgnoreCase(name)) {
			acxfr_gr_amt_p(
				((MCContainerMeta) acxfr_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($arr_cststk_amt_p.equalsIgnoreCase(name)) {
			arr_cststk_amt_p(
				((MCContainerMeta) arr_cststk_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xfr_itm_gr_amt_p.equalsIgnoreCase(name)) {
			xfr_itm_gr_amt_p(
				((MCContainerMeta) xfr_itm_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xfr_lot_sno_gr_amt_p.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_amt_p(
				((MCContainerMeta) xfr_lot_sno_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xfr_grd_gr_amt_p.equalsIgnoreCase(name)) {
			xfr_grd_gr_amt_p(
				((MCContainerMeta) xfr_grd_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xfr_pack_gr_amt_p.equalsIgnoreCase(name)) {
			xfr_pack_gr_amt_p(
				((MCContainerMeta) xfr_pack_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ship_in_amt_p.equalsIgnoreCase(name)) {
			ship_in_amt_p(
				((MCContainerMeta) ship_in_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ex_ship_in_amt_p.equalsIgnoreCase(name)) {
			ex_ship_in_amt_p(
				((MCContainerMeta) ex_ship_in_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ship_rtn_gr_amt_p.equalsIgnoreCase(name)) {
			ship_rtn_gr_amt_p(
				((MCContainerMeta) ship_rtn_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($sls_rtn_gr_amt_p.equalsIgnoreCase(name)) {
			sls_rtn_gr_amt_p(
				((MCContainerMeta) sls_rtn_gr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($gi_total_amt_p.equalsIgnoreCase(name)) {
			gi_total_amt_p(
				((MCContainerMeta) gi_total_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($arr_rtn_amt_p.equalsIgnoreCase(name)) {
			arr_rtn_amt_p(
				((MCContainerMeta) arr_rtn_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($purc_gi_amt_p.equalsIgnoreCase(name)) {
			purc_gi_amt_p(
				((MCContainerMeta) purc_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($onr_rcv_gi_amt_p.equalsIgnoreCase(name)) {
			onr_rcv_gi_amt_p(
				((MCContainerMeta) onr_rcv_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($purc_rtn_gi_amt_p.equalsIgnoreCase(name)) {
			purc_rtn_gi_amt_p(
				((MCContainerMeta) purc_rtn_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($onr_rcv_ret_gi_amt_p.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_amt_p(
				((MCContainerMeta) onr_rcv_ret_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xpns_purc_gi_amt_p.equalsIgnoreCase(name)) {
			xpns_purc_gi_amt_p(
				((MCContainerMeta) xpns_purc_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xpns_purc_rtn_gi_amt_p.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_amt_p(
				((MCContainerMeta) xpns_purc_rtn_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($accpt_dfct_gi_amt_p.equalsIgnoreCase(name)) {
			accpt_dfct_gi_amt_p(
				((MCContainerMeta) accpt_dfct_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($inpt_amt_p.equalsIgnoreCase(name)) {
			inpt_amt_p(
				((MCContainerMeta) inpt_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($loss_amt_p.equalsIgnoreCase(name)) {
			loss_amt_p(
				((MCContainerMeta) loss_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ffr_prov_gi_amt_p.equalsIgnoreCase(name)) {
			ffr_prov_gi_amt_p(
				((MCContainerMeta) ffr_prov_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($onr_prov_gi_amt_p.equalsIgnoreCase(name)) {
			onr_prov_gi_amt_p(
				((MCContainerMeta) onr_prov_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ffr_prov_rtn_gi_amt_p.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_amt_p(
				((MCContainerMeta) ffr_prov_rtn_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($onr_prov_rtn_gi_amt_p.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_amt_p(
				((MCContainerMeta) onr_prov_rtn_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($insp_gi_amt_p.equalsIgnoreCase(name)) {
			insp_gi_amt_p(
				((MCContainerMeta) insp_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($insp_cmpl_gi_amt_p.equalsIgnoreCase(name)) {
			insp_cmpl_gi_amt_p(
				((MCContainerMeta) insp_cmpl_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($insp_judg_gi_amt_p.equalsIgnoreCase(name)) {
			insp_judg_gi_amt_p(
				((MCContainerMeta) insp_judg_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($reinsp_gi_amt_p.equalsIgnoreCase(name)) {
			reinsp_gi_amt_p(
				((MCContainerMeta) reinsp_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($insp_smpl_gi_amt_p.equalsIgnoreCase(name)) {
			insp_smpl_gi_amt_p(
				((MCContainerMeta) insp_smpl_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($stk_adjst_gi_amt_p.equalsIgnoreCase(name)) {
			stk_adjst_gi_amt_p(
				((MCContainerMeta) stk_adjst_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($prdct_wh_gi_amt_p.equalsIgnoreCase(name)) {
			prdct_wh_gi_amt_p(
				((MCContainerMeta) prdct_wh_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($prdct_wh_rtn_gi_amt_p.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_amt_p(
				((MCContainerMeta) prdct_wh_rtn_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xfr_gi_amt_p.equalsIgnoreCase(name)) {
			xfr_gi_amt_p(
				((MCContainerMeta) xfr_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xfr_out_amt_p.equalsIgnoreCase(name)) {
			xfr_out_amt_p(
				((MCContainerMeta) xfr_out_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($purc_xfr_out_amt_p.equalsIgnoreCase(name)) {
			purc_xfr_out_amt_p(
				((MCContainerMeta) purc_xfr_out_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xfr_rtn_gi_amt_p.equalsIgnoreCase(name)) {
			xfr_rtn_gi_amt_p(
				((MCContainerMeta) xfr_rtn_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($acxfr_gi_amt_p.equalsIgnoreCase(name)) {
			acxfr_gi_amt_p(
				((MCContainerMeta) acxfr_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($scrp_amt_p.equalsIgnoreCase(name)) {
			scrp_amt_p(
				((MCContainerMeta) scrp_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xfr_itm_gi_amt_p.equalsIgnoreCase(name)) {
			xfr_itm_gi_amt_p(
				((MCContainerMeta) xfr_itm_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xfr_lot_sno_gi_amt_p.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_amt_p(
				((MCContainerMeta) xfr_lot_sno_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xfr_grd_gi_amt_p.equalsIgnoreCase(name)) {
			xfr_grd_gi_amt_p(
				((MCContainerMeta) xfr_grd_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xfr_pack_gi_amt_p.equalsIgnoreCase(name)) {
			xfr_pack_gi_amt_p(
				((MCContainerMeta) xfr_pack_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ship_out_amt_p.equalsIgnoreCase(name)) {
			ship_out_amt_p(
				((MCContainerMeta) ship_out_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ex_ship_out_amt_p.equalsIgnoreCase(name)) {
			ex_ship_out_amt_p(
				((MCContainerMeta) ex_ship_out_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ship_rtn_gi_amt_p.equalsIgnoreCase(name)) {
			ship_rtn_gi_amt_p(
				((MCContainerMeta) ship_rtn_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($sls_rtn_gi_amt_p.equalsIgnoreCase(name)) {
			sls_rtn_gi_amt_p(
				((MCContainerMeta) sls_rtn_gi_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($sls_amt_p.equalsIgnoreCase(name)) {
			sls_amt_p(
				((MCContainerMeta) sls_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($end_stk_amt_p.equalsIgnoreCase(name)) {
			end_stk_amt_p(
				((MCContainerMeta) end_stk_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($std_unit_cost_amt_p.equalsIgnoreCase(name)) {
			std_unit_cost_amt_p(
				((MCContainerMeta) std_unit_cost_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5170.ItmGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
	}

	public String str_ln_cd() {
		return str_ln_p().str_ln_cd();
	}

	public void str_ln_cd(String value) {
		str_ln_p().str_ln_cd(value);
	}

	public String str_ln_nm() {
		return str_ln_p().str_ln_nm();
	}

	public void str_ln_nm(String value) {
		str_ln_p().str_ln_nm(value);
	}

	public boolean str_ln_cd_none_flg() {
		return str_ln_p().str_ln_cd_none_flg();
	}

	public void str_ln_cd_none_flg(boolean value) {
		str_ln_p().str_ln_cd_none_flg(value);
	}

	public String sno1() {
		return sno_wrk_no_p().sno1();
	}

	public void sno1(String value) {
		sno_wrk_no_p().sno1(value);
	}

	public String sno2() {
		return sno_wrk_no_p().sno2();
	}

	public void sno2(String value) {
		sno_wrk_no_p().sno2(value);
	}

	public String sno3() {
		return sno_wrk_no_p().sno3();
	}

	public void sno3(String value) {
		sno_wrk_no_p().sno3(value);
	}

	public String sno4() {
		return sno_wrk_no_p().sno4();
	}

	public void sno4(String value) {
		sno_wrk_no_p().sno4(value);
	}

	public String wrk_no() {
		return sno_wrk_no_p().wrk_no();
	}

	public void wrk_no(String value) {
		sno_wrk_no_p().wrk_no(value);
	}

	public String wrk_nm() {
		return sno_wrk_no_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		sno_wrk_no_p().wrk_nm(value);
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public MCNumber ini_stk_qty() {
		return ini_stk_qty_p().qty();
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public void ini_stk_qty(MCNumber value) {
		ini_stk_qty_p().qty(value);
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public void ini_stk_qty(int value) {
		ini_stk_qty_p().qty(value);
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public void ini_stk_qty(long value) {
		ini_stk_qty_p().qty(value);
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public void ini_stk_qty(float value) {
		ini_stk_qty_p().qty(value);
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public void ini_stk_qty(double value) {
		ini_stk_qty_p().qty(value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public MCNumber gr_total_qty() {
		return gr_total_qty_p().qty();
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_qty(MCNumber value) {
		gr_total_qty_p().qty(value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_qty(int value) {
		gr_total_qty_p().qty(value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_qty(long value) {
		gr_total_qty_p().qty(value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_qty(float value) {
		gr_total_qty_p().qty(value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_qty(double value) {
		gr_total_qty_p().qty(value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public MCNumber arr_qty() {
		return arr_qty_p().qty();
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(MCNumber value) {
		arr_qty_p().qty(value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(int value) {
		arr_qty_p().qty(value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(long value) {
		arr_qty_p().qty(value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(float value) {
		arr_qty_p().qty(value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(double value) {
		arr_qty_p().qty(value);
	}

	/**
	 * Purchase GR qty. 仕入入庫数量.<p>
	 *
	 */
	public MCNumber purc_gr_qty() {
		return purc_gr_qty_p().qty();
	}

	/**
	 * Purchase GR qty. 仕入入庫数量.<p>
	 *
	 */
	public void purc_gr_qty(MCNumber value) {
		purc_gr_qty_p().qty(value);
	}

	/**
	 * Purchase GR qty. 仕入入庫数量.<p>
	 *
	 */
	public void purc_gr_qty(int value) {
		purc_gr_qty_p().qty(value);
	}

	/**
	 * Purchase GR qty. 仕入入庫数量.<p>
	 *
	 */
	public void purc_gr_qty(long value) {
		purc_gr_qty_p().qty(value);
	}

	/**
	 * Purchase GR qty. 仕入入庫数量.<p>
	 *
	 */
	public void purc_gr_qty(float value) {
		purc_gr_qty_p().qty(value);
	}

	/**
	 * Purchase GR qty. 仕入入庫数量.<p>
	 *
	 */
	public void purc_gr_qty(double value) {
		purc_gr_qty_p().qty(value);
	}

	/**
	 * Receiving for a fee GR qty. 有償受給入庫数量.<p>
	 *
	 */
	public MCNumber onr_rcv_gr_qty() {
		return onr_rcv_gr_qty_p().qty();
	}

	/**
	 * Receiving for a fee GR qty. 有償受給入庫数量.<p>
	 *
	 */
	public void onr_rcv_gr_qty(MCNumber value) {
		onr_rcv_gr_qty_p().qty(value);
	}

	/**
	 * Receiving for a fee GR qty. 有償受給入庫数量.<p>
	 *
	 */
	public void onr_rcv_gr_qty(int value) {
		onr_rcv_gr_qty_p().qty(value);
	}

	/**
	 * Receiving for a fee GR qty. 有償受給入庫数量.<p>
	 *
	 */
	public void onr_rcv_gr_qty(long value) {
		onr_rcv_gr_qty_p().qty(value);
	}

	/**
	 * Receiving for a fee GR qty. 有償受給入庫数量.<p>
	 *
	 */
	public void onr_rcv_gr_qty(float value) {
		onr_rcv_gr_qty_p().qty(value);
	}

	/**
	 * Receiving for a fee GR qty. 有償受給入庫数量.<p>
	 *
	 */
	public void onr_rcv_gr_qty(double value) {
		onr_rcv_gr_qty_p().qty(value);
	}

	/**
	 * Purchase return GR qty. 仕入返品入庫数量.<p>
	 *
	 */
	public MCNumber purc_rtn_gr_qty() {
		return purc_rtn_gr_qty_p().qty();
	}

	/**
	 * Purchase return GR qty. 仕入返品入庫数量.<p>
	 *
	 */
	public void purc_rtn_gr_qty(MCNumber value) {
		purc_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Purchase return GR qty. 仕入返品入庫数量.<p>
	 *
	 */
	public void purc_rtn_gr_qty(int value) {
		purc_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Purchase return GR qty. 仕入返品入庫数量.<p>
	 *
	 */
	public void purc_rtn_gr_qty(long value) {
		purc_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Purchase return GR qty. 仕入返品入庫数量.<p>
	 *
	 */
	public void purc_rtn_gr_qty(float value) {
		purc_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Purchase return GR qty. 仕入返品入庫数量.<p>
	 *
	 */
	public void purc_rtn_gr_qty(double value) {
		purc_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Receiving for a fee return GR qty. 有償受給返品入庫数量.<p>
	 *
	 */
	public MCNumber onr_rcv_ret_gr_qty() {
		return onr_rcv_ret_gr_qty_p().qty();
	}

	/**
	 * Receiving for a fee return GR qty. 有償受給返品入庫数量.<p>
	 *
	 */
	public void onr_rcv_ret_gr_qty(MCNumber value) {
		onr_rcv_ret_gr_qty_p().qty(value);
	}

	/**
	 * Receiving for a fee return GR qty. 有償受給返品入庫数量.<p>
	 *
	 */
	public void onr_rcv_ret_gr_qty(int value) {
		onr_rcv_ret_gr_qty_p().qty(value);
	}

	/**
	 * Receiving for a fee return GR qty. 有償受給返品入庫数量.<p>
	 *
	 */
	public void onr_rcv_ret_gr_qty(long value) {
		onr_rcv_ret_gr_qty_p().qty(value);
	}

	/**
	 * Receiving for a fee return GR qty. 有償受給返品入庫数量.<p>
	 *
	 */
	public void onr_rcv_ret_gr_qty(float value) {
		onr_rcv_ret_gr_qty_p().qty(value);
	}

	/**
	 * Receiving for a fee return GR qty. 有償受給返品入庫数量.<p>
	 *
	 */
	public void onr_rcv_ret_gr_qty(double value) {
		onr_rcv_ret_gr_qty_p().qty(value);
	}

	/**
	 * Expense purchase GR qty. 経費購買入庫数量.<p>
	 *
	 */
	public MCNumber xpns_purc_gr_qty() {
		return xpns_purc_gr_qty_p().qty();
	}

	/**
	 * Expense purchase GR qty. 経費購買入庫数量.<p>
	 *
	 */
	public void xpns_purc_gr_qty(MCNumber value) {
		xpns_purc_gr_qty_p().qty(value);
	}

	/**
	 * Expense purchase GR qty. 経費購買入庫数量.<p>
	 *
	 */
	public void xpns_purc_gr_qty(int value) {
		xpns_purc_gr_qty_p().qty(value);
	}

	/**
	 * Expense purchase GR qty. 経費購買入庫数量.<p>
	 *
	 */
	public void xpns_purc_gr_qty(long value) {
		xpns_purc_gr_qty_p().qty(value);
	}

	/**
	 * Expense purchase GR qty. 経費購買入庫数量.<p>
	 *
	 */
	public void xpns_purc_gr_qty(float value) {
		xpns_purc_gr_qty_p().qty(value);
	}

	/**
	 * Expense purchase GR qty. 経費購買入庫数量.<p>
	 *
	 */
	public void xpns_purc_gr_qty(double value) {
		xpns_purc_gr_qty_p().qty(value);
	}

	/**
	 * Expense purchase return GR qty. 経費購買返品入庫数量.<p>
	 *
	 */
	public MCNumber xpns_purc_rtn_gr_qty() {
		return xpns_purc_rtn_gr_qty_p().qty();
	}

	/**
	 * Expense purchase return GR qty. 経費購買返品入庫数量.<p>
	 *
	 */
	public void xpns_purc_rtn_gr_qty(MCNumber value) {
		xpns_purc_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Expense purchase return GR qty. 経費購買返品入庫数量.<p>
	 *
	 */
	public void xpns_purc_rtn_gr_qty(int value) {
		xpns_purc_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Expense purchase return GR qty. 経費購買返品入庫数量.<p>
	 *
	 */
	public void xpns_purc_rtn_gr_qty(long value) {
		xpns_purc_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Expense purchase return GR qty. 経費購買返品入庫数量.<p>
	 *
	 */
	public void xpns_purc_rtn_gr_qty(float value) {
		xpns_purc_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Expense purchase return GR qty. 経費購買返品入庫数量.<p>
	 *
	 */
	public void xpns_purc_rtn_gr_qty(double value) {
		xpns_purc_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public MCNumber accpt_dfct_gr_qty() {
		return accpt_dfct_gr_qty_p().qty();
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public void accpt_dfct_gr_qty(MCNumber value) {
		accpt_dfct_gr_qty_p().qty(value);
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public void accpt_dfct_gr_qty(int value) {
		accpt_dfct_gr_qty_p().qty(value);
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public void accpt_dfct_gr_qty(long value) {
		accpt_dfct_gr_qty_p().qty(value);
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public void accpt_dfct_gr_qty(float value) {
		accpt_dfct_gr_qty_p().qty(value);
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public void accpt_dfct_gr_qty(double value) {
		accpt_dfct_gr_qty_p().qty(value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public MCNumber mfg_qty() {
		return mfg_qty_p().qty();
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void mfg_qty(MCNumber value) {
		mfg_qty_p().qty(value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void mfg_qty(int value) {
		mfg_qty_p().qty(value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void mfg_qty(long value) {
		mfg_qty_p().qty(value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void mfg_qty(float value) {
		mfg_qty_p().qty(value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void mfg_qty(double value) {
		mfg_qty_p().qty(value);
	}

	/**
	 * By-product mfg. qty. 副産品製造数量.<p>
	 *
	 */
	public MCNumber bymfg_qty() {
		return bymfg_qty_p().qty();
	}

	/**
	 * By-product mfg. qty. 副産品製造数量.<p>
	 *
	 */
	public void bymfg_qty(MCNumber value) {
		bymfg_qty_p().qty(value);
	}

	/**
	 * By-product mfg. qty. 副産品製造数量.<p>
	 *
	 */
	public void bymfg_qty(int value) {
		bymfg_qty_p().qty(value);
	}

	/**
	 * By-product mfg. qty. 副産品製造数量.<p>
	 *
	 */
	public void bymfg_qty(long value) {
		bymfg_qty_p().qty(value);
	}

	/**
	 * By-product mfg. qty. 副産品製造数量.<p>
	 *
	 */
	public void bymfg_qty(float value) {
		bymfg_qty_p().qty(value);
	}

	/**
	 * By-product mfg. qty. 副産品製造数量.<p>
	 *
	 */
	public void bymfg_qty(double value) {
		bymfg_qty_p().qty(value);
	}

	/**
	 * GR qty. (Non-chargeable supply) 無償支給入庫数量.<p>
	 *
	 */
	public MCNumber ffr_prov_gr_qty() {
		return ffr_prov_gr_qty_p().qty();
	}

	/**
	 * GR qty. (Non-chargeable supply) 無償支給入庫数量.<p>
	 *
	 */
	public void ffr_prov_gr_qty(MCNumber value) {
		ffr_prov_gr_qty_p().qty(value);
	}

	/**
	 * GR qty. (Non-chargeable supply) 無償支給入庫数量.<p>
	 *
	 */
	public void ffr_prov_gr_qty(int value) {
		ffr_prov_gr_qty_p().qty(value);
	}

	/**
	 * GR qty. (Non-chargeable supply) 無償支給入庫数量.<p>
	 *
	 */
	public void ffr_prov_gr_qty(long value) {
		ffr_prov_gr_qty_p().qty(value);
	}

	/**
	 * GR qty. (Non-chargeable supply) 無償支給入庫数量.<p>
	 *
	 */
	public void ffr_prov_gr_qty(float value) {
		ffr_prov_gr_qty_p().qty(value);
	}

	/**
	 * GR qty. (Non-chargeable supply) 無償支給入庫数量.<p>
	 *
	 */
	public void ffr_prov_gr_qty(double value) {
		ffr_prov_gr_qty_p().qty(value);
	}

	/**
	 * Chargeable supply GR qty. 有償支給入庫数量.<p>
	 *
	 */
	public MCNumber onr_prov_gr_qty() {
		return onr_prov_gr_qty_p().qty();
	}

	/**
	 * Chargeable supply GR qty. 有償支給入庫数量.<p>
	 *
	 */
	public void onr_prov_gr_qty(MCNumber value) {
		onr_prov_gr_qty_p().qty(value);
	}

	/**
	 * Chargeable supply GR qty. 有償支給入庫数量.<p>
	 *
	 */
	public void onr_prov_gr_qty(int value) {
		onr_prov_gr_qty_p().qty(value);
	}

	/**
	 * Chargeable supply GR qty. 有償支給入庫数量.<p>
	 *
	 */
	public void onr_prov_gr_qty(long value) {
		onr_prov_gr_qty_p().qty(value);
	}

	/**
	 * Chargeable supply GR qty. 有償支給入庫数量.<p>
	 *
	 */
	public void onr_prov_gr_qty(float value) {
		onr_prov_gr_qty_p().qty(value);
	}

	/**
	 * Chargeable supply GR qty. 有償支給入庫数量.<p>
	 *
	 */
	public void onr_prov_gr_qty(double value) {
		onr_prov_gr_qty_p().qty(value);
	}

	/**
	 * Non-chargeable supply return GR qty. 無償支給返品入庫数量.<p>
	 *
	 */
	public MCNumber ffr_prov_rtn_gr_qty() {
		return ffr_prov_rtn_gr_qty_p().qty();
	}

	/**
	 * Non-chargeable supply return GR qty. 無償支給返品入庫数量.<p>
	 *
	 */
	public void ffr_prov_rtn_gr_qty(MCNumber value) {
		ffr_prov_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Non-chargeable supply return GR qty. 無償支給返品入庫数量.<p>
	 *
	 */
	public void ffr_prov_rtn_gr_qty(int value) {
		ffr_prov_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Non-chargeable supply return GR qty. 無償支給返品入庫数量.<p>
	 *
	 */
	public void ffr_prov_rtn_gr_qty(long value) {
		ffr_prov_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Non-chargeable supply return GR qty. 無償支給返品入庫数量.<p>
	 *
	 */
	public void ffr_prov_rtn_gr_qty(float value) {
		ffr_prov_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Non-chargeable supply return GR qty. 無償支給返品入庫数量.<p>
	 *
	 */
	public void ffr_prov_rtn_gr_qty(double value) {
		ffr_prov_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Chargeable supply return GR qty. 有償支給返品入庫数量.<p>
	 *
	 */
	public MCNumber onr_prov_rtn_gr_qty() {
		return onr_prov_rtn_gr_qty_p().qty();
	}

	/**
	 * Chargeable supply return GR qty. 有償支給返品入庫数量.<p>
	 *
	 */
	public void onr_prov_rtn_gr_qty(MCNumber value) {
		onr_prov_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Chargeable supply return GR qty. 有償支給返品入庫数量.<p>
	 *
	 */
	public void onr_prov_rtn_gr_qty(int value) {
		onr_prov_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Chargeable supply return GR qty. 有償支給返品入庫数量.<p>
	 *
	 */
	public void onr_prov_rtn_gr_qty(long value) {
		onr_prov_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Chargeable supply return GR qty. 有償支給返品入庫数量.<p>
	 *
	 */
	public void onr_prov_rtn_gr_qty(float value) {
		onr_prov_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Chargeable supply return GR qty. 有償支給返品入庫数量.<p>
	 *
	 */
	public void onr_prov_rtn_gr_qty(double value) {
		onr_prov_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Inspection GR qty. 検査入庫数量.<p>
	 *
	 */
	public MCNumber insp_gr_qty() {
		return insp_gr_qty_p().qty();
	}

	/**
	 * Inspection GR qty. 検査入庫数量.<p>
	 *
	 */
	public void insp_gr_qty(MCNumber value) {
		insp_gr_qty_p().qty(value);
	}

	/**
	 * Inspection GR qty. 検査入庫数量.<p>
	 *
	 */
	public void insp_gr_qty(int value) {
		insp_gr_qty_p().qty(value);
	}

	/**
	 * Inspection GR qty. 検査入庫数量.<p>
	 *
	 */
	public void insp_gr_qty(long value) {
		insp_gr_qty_p().qty(value);
	}

	/**
	 * Inspection GR qty. 検査入庫数量.<p>
	 *
	 */
	public void insp_gr_qty(float value) {
		insp_gr_qty_p().qty(value);
	}

	/**
	 * Inspection GR qty. 検査入庫数量.<p>
	 *
	 */
	public void insp_gr_qty(double value) {
		insp_gr_qty_p().qty(value);
	}

	/**
	 * Inspection completed GR qty. 検査完了入庫数量.<p>
	 *
	 */
	public MCNumber insp_cmpl_gr_qty() {
		return insp_cmpl_gr_qty_p().qty();
	}

	/**
	 * Inspection completed GR qty. 検査完了入庫数量.<p>
	 *
	 */
	public void insp_cmpl_gr_qty(MCNumber value) {
		insp_cmpl_gr_qty_p().qty(value);
	}

	/**
	 * Inspection completed GR qty. 検査完了入庫数量.<p>
	 *
	 */
	public void insp_cmpl_gr_qty(int value) {
		insp_cmpl_gr_qty_p().qty(value);
	}

	/**
	 * Inspection completed GR qty. 検査完了入庫数量.<p>
	 *
	 */
	public void insp_cmpl_gr_qty(long value) {
		insp_cmpl_gr_qty_p().qty(value);
	}

	/**
	 * Inspection completed GR qty. 検査完了入庫数量.<p>
	 *
	 */
	public void insp_cmpl_gr_qty(float value) {
		insp_cmpl_gr_qty_p().qty(value);
	}

	/**
	 * Inspection completed GR qty. 検査完了入庫数量.<p>
	 *
	 */
	public void insp_cmpl_gr_qty(double value) {
		insp_cmpl_gr_qty_p().qty(value);
	}

	/**
	 * Inspection decision GR qty. 検査判定入庫数量.<p>
	 *
	 */
	public MCNumber insp_judg_gr_qty() {
		return insp_judg_gr_qty_p().qty();
	}

	/**
	 * Inspection decision GR qty. 検査判定入庫数量.<p>
	 *
	 */
	public void insp_judg_gr_qty(MCNumber value) {
		insp_judg_gr_qty_p().qty(value);
	}

	/**
	 * Inspection decision GR qty. 検査判定入庫数量.<p>
	 *
	 */
	public void insp_judg_gr_qty(int value) {
		insp_judg_gr_qty_p().qty(value);
	}

	/**
	 * Inspection decision GR qty. 検査判定入庫数量.<p>
	 *
	 */
	public void insp_judg_gr_qty(long value) {
		insp_judg_gr_qty_p().qty(value);
	}

	/**
	 * Inspection decision GR qty. 検査判定入庫数量.<p>
	 *
	 */
	public void insp_judg_gr_qty(float value) {
		insp_judg_gr_qty_p().qty(value);
	}

	/**
	 * Inspection decision GR qty. 検査判定入庫数量.<p>
	 *
	 */
	public void insp_judg_gr_qty(double value) {
		insp_judg_gr_qty_p().qty(value);
	}

	/**
	 * Re-inspection GR qty. 再検査入庫数量.<p>
	 *
	 */
	public MCNumber reinsp_gr_qty() {
		return reinsp_gr_qty_p().qty();
	}

	/**
	 * Re-inspection GR qty. 再検査入庫数量.<p>
	 *
	 */
	public void reinsp_gr_qty(MCNumber value) {
		reinsp_gr_qty_p().qty(value);
	}

	/**
	 * Re-inspection GR qty. 再検査入庫数量.<p>
	 *
	 */
	public void reinsp_gr_qty(int value) {
		reinsp_gr_qty_p().qty(value);
	}

	/**
	 * Re-inspection GR qty. 再検査入庫数量.<p>
	 *
	 */
	public void reinsp_gr_qty(long value) {
		reinsp_gr_qty_p().qty(value);
	}

	/**
	 * Re-inspection GR qty. 再検査入庫数量.<p>
	 *
	 */
	public void reinsp_gr_qty(float value) {
		reinsp_gr_qty_p().qty(value);
	}

	/**
	 * Re-inspection GR qty. 再検査入庫数量.<p>
	 *
	 */
	public void reinsp_gr_qty(double value) {
		reinsp_gr_qty_p().qty(value);
	}

	/**
	 * Inventory count variance qty. (GR) 棚卸差異増耗数量.<p>
	 *
	 */
	public MCNumber stk_adjst_gr_qty() {
		return stk_adjst_gr_qty_p().qty();
	}

	/**
	 * Inventory count variance qty. (GR) 棚卸差異増耗数量.<p>
	 *
	 */
	public void stk_adjst_gr_qty(MCNumber value) {
		stk_adjst_gr_qty_p().qty(value);
	}

	/**
	 * Inventory count variance qty. (GR) 棚卸差異増耗数量.<p>
	 *
	 */
	public void stk_adjst_gr_qty(int value) {
		stk_adjst_gr_qty_p().qty(value);
	}

	/**
	 * Inventory count variance qty. (GR) 棚卸差異増耗数量.<p>
	 *
	 */
	public void stk_adjst_gr_qty(long value) {
		stk_adjst_gr_qty_p().qty(value);
	}

	/**
	 * Inventory count variance qty. (GR) 棚卸差異増耗数量.<p>
	 *
	 */
	public void stk_adjst_gr_qty(float value) {
		stk_adjst_gr_qty_p().qty(value);
	}

	/**
	 * Inventory count variance qty. (GR) 棚卸差異増耗数量.<p>
	 *
	 */
	public void stk_adjst_gr_qty(double value) {
		stk_adjst_gr_qty_p().qty(value);
	}

	/**
	 * Warehousing GR qty. 倉入入庫数量.<p>
	 *
	 */
	public MCNumber prdct_wh_gr_qty() {
		return prdct_wh_gr_qty_p().qty();
	}

	/**
	 * Warehousing GR qty. 倉入入庫数量.<p>
	 *
	 */
	public void prdct_wh_gr_qty(MCNumber value) {
		prdct_wh_gr_qty_p().qty(value);
	}

	/**
	 * Warehousing GR qty. 倉入入庫数量.<p>
	 *
	 */
	public void prdct_wh_gr_qty(int value) {
		prdct_wh_gr_qty_p().qty(value);
	}

	/**
	 * Warehousing GR qty. 倉入入庫数量.<p>
	 *
	 */
	public void prdct_wh_gr_qty(long value) {
		prdct_wh_gr_qty_p().qty(value);
	}

	/**
	 * Warehousing GR qty. 倉入入庫数量.<p>
	 *
	 */
	public void prdct_wh_gr_qty(float value) {
		prdct_wh_gr_qty_p().qty(value);
	}

	/**
	 * Warehousing GR qty. 倉入入庫数量.<p>
	 *
	 */
	public void prdct_wh_gr_qty(double value) {
		prdct_wh_gr_qty_p().qty(value);
	}

	/**
	 * GR returning qty. 戻入入庫数量.<p>
	 *
	 */
	public MCNumber prdct_wh_rtn_gr_qty() {
		return prdct_wh_rtn_gr_qty_p().qty();
	}

	/**
	 * GR returning qty. 戻入入庫数量.<p>
	 *
	 */
	public void prdct_wh_rtn_gr_qty(MCNumber value) {
		prdct_wh_rtn_gr_qty_p().qty(value);
	}

	/**
	 * GR returning qty. 戻入入庫数量.<p>
	 *
	 */
	public void prdct_wh_rtn_gr_qty(int value) {
		prdct_wh_rtn_gr_qty_p().qty(value);
	}

	/**
	 * GR returning qty. 戻入入庫数量.<p>
	 *
	 */
	public void prdct_wh_rtn_gr_qty(long value) {
		prdct_wh_rtn_gr_qty_p().qty(value);
	}

	/**
	 * GR returning qty. 戻入入庫数量.<p>
	 *
	 */
	public void prdct_wh_rtn_gr_qty(float value) {
		prdct_wh_rtn_gr_qty_p().qty(value);
	}

	/**
	 * GR returning qty. 戻入入庫数量.<p>
	 *
	 */
	public void prdct_wh_rtn_gr_qty(double value) {
		prdct_wh_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public MCNumber xfr_gr_qty() {
		return xfr_gr_qty_p().qty();
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public void xfr_gr_qty(MCNumber value) {
		xfr_gr_qty_p().qty(value);
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public void xfr_gr_qty(int value) {
		xfr_gr_qty_p().qty(value);
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public void xfr_gr_qty(long value) {
		xfr_gr_qty_p().qty(value);
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public void xfr_gr_qty(float value) {
		xfr_gr_qty_p().qty(value);
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public void xfr_gr_qty(double value) {
		xfr_gr_qty_p().qty(value);
	}

	/**
	 * Move-in qty. 転入数量.<p>
	 *
	 */
	public MCNumber xfr_in_qty() {
		return xfr_in_qty_p().qty();
	}

	/**
	 * Move-in qty. 転入数量.<p>
	 *
	 */
	public void xfr_in_qty(MCNumber value) {
		xfr_in_qty_p().qty(value);
	}

	/**
	 * Move-in qty. 転入数量.<p>
	 *
	 */
	public void xfr_in_qty(int value) {
		xfr_in_qty_p().qty(value);
	}

	/**
	 * Move-in qty. 転入数量.<p>
	 *
	 */
	public void xfr_in_qty(long value) {
		xfr_in_qty_p().qty(value);
	}

	/**
	 * Move-in qty. 転入数量.<p>
	 *
	 */
	public void xfr_in_qty(float value) {
		xfr_in_qty_p().qty(value);
	}

	/**
	 * Move-in qty. 転入数量.<p>
	 *
	 */
	public void xfr_in_qty(double value) {
		xfr_in_qty_p().qty(value);
	}

	/**
	 * Purchase move-in qty. 仕入転入数量.<p>
	 *
	 */
	public MCNumber purc_xfr_in_qty() {
		return purc_xfr_in_qty_p().qty();
	}

	/**
	 * Purchase move-in qty. 仕入転入数量.<p>
	 *
	 */
	public void purc_xfr_in_qty(MCNumber value) {
		purc_xfr_in_qty_p().qty(value);
	}

	/**
	 * Purchase move-in qty. 仕入転入数量.<p>
	 *
	 */
	public void purc_xfr_in_qty(int value) {
		purc_xfr_in_qty_p().qty(value);
	}

	/**
	 * Purchase move-in qty. 仕入転入数量.<p>
	 *
	 */
	public void purc_xfr_in_qty(long value) {
		purc_xfr_in_qty_p().qty(value);
	}

	/**
	 * Purchase move-in qty. 仕入転入数量.<p>
	 *
	 */
	public void purc_xfr_in_qty(float value) {
		purc_xfr_in_qty_p().qty(value);
	}

	/**
	 * Purchase move-in qty. 仕入転入数量.<p>
	 *
	 */
	public void purc_xfr_in_qty(double value) {
		purc_xfr_in_qty_p().qty(value);
	}

	/**
	 * Movement/transport return GR qty. 移動・移送返品入庫数量.<p>
	 *
	 */
	public MCNumber xfr_rtn_gr_qty() {
		return xfr_rtn_gr_qty_p().qty();
	}

	/**
	 * Movement/transport return GR qty. 移動・移送返品入庫数量.<p>
	 *
	 */
	public void xfr_rtn_gr_qty(MCNumber value) {
		xfr_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Movement/transport return GR qty. 移動・移送返品入庫数量.<p>
	 *
	 */
	public void xfr_rtn_gr_qty(int value) {
		xfr_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Movement/transport return GR qty. 移動・移送返品入庫数量.<p>
	 *
	 */
	public void xfr_rtn_gr_qty(long value) {
		xfr_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Movement/transport return GR qty. 移動・移送返品入庫数量.<p>
	 *
	 */
	public void xfr_rtn_gr_qty(float value) {
		xfr_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Movement/transport return GR qty. 移動・移送返品入庫数量.<p>
	 *
	 */
	public void xfr_rtn_gr_qty(double value) {
		xfr_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public MCNumber acxfr_gr_qty() {
		return acxfr_gr_qty_p().qty();
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public void acxfr_gr_qty(MCNumber value) {
		acxfr_gr_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public void acxfr_gr_qty(int value) {
		acxfr_gr_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public void acxfr_gr_qty(long value) {
		acxfr_gr_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public void acxfr_gr_qty(float value) {
		acxfr_gr_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public void acxfr_gr_qty(double value) {
		acxfr_gr_qty_p().qty(value);
	}

	/**
	 * Customer inventory GR qty. 預り入庫数量.<p>
	 *
	 */
	public MCNumber arr_cststk_qty() {
		return arr_cststk_qty_p().qty();
	}

	/**
	 * Customer inventory GR qty. 預り入庫数量.<p>
	 *
	 */
	public void arr_cststk_qty(MCNumber value) {
		arr_cststk_qty_p().qty(value);
	}

	/**
	 * Customer inventory GR qty. 預り入庫数量.<p>
	 *
	 */
	public void arr_cststk_qty(int value) {
		arr_cststk_qty_p().qty(value);
	}

	/**
	 * Customer inventory GR qty. 預り入庫数量.<p>
	 *
	 */
	public void arr_cststk_qty(long value) {
		arr_cststk_qty_p().qty(value);
	}

	/**
	 * Customer inventory GR qty. 預り入庫数量.<p>
	 *
	 */
	public void arr_cststk_qty(float value) {
		arr_cststk_qty_p().qty(value);
	}

	/**
	 * Customer inventory GR qty. 預り入庫数量.<p>
	 *
	 */
	public void arr_cststk_qty(double value) {
		arr_cststk_qty_p().qty(value);
	}

	/**
	 * Item transfer GR qty. 品目振替入庫数量.<p>
	 *
	 */
	public MCNumber xfr_itm_gr_qty() {
		return xfr_itm_gr_qty_p().qty();
	}

	/**
	 * Item transfer GR qty. 品目振替入庫数量.<p>
	 *
	 */
	public void xfr_itm_gr_qty(MCNumber value) {
		xfr_itm_gr_qty_p().qty(value);
	}

	/**
	 * Item transfer GR qty. 品目振替入庫数量.<p>
	 *
	 */
	public void xfr_itm_gr_qty(int value) {
		xfr_itm_gr_qty_p().qty(value);
	}

	/**
	 * Item transfer GR qty. 品目振替入庫数量.<p>
	 *
	 */
	public void xfr_itm_gr_qty(long value) {
		xfr_itm_gr_qty_p().qty(value);
	}

	/**
	 * Item transfer GR qty. 品目振替入庫数量.<p>
	 *
	 */
	public void xfr_itm_gr_qty(float value) {
		xfr_itm_gr_qty_p().qty(value);
	}

	/**
	 * Item transfer GR qty. 品目振替入庫数量.<p>
	 *
	 */
	public void xfr_itm_gr_qty(double value) {
		xfr_itm_gr_qty_p().qty(value);
	}

	/**
	 * Lot/SEIBAN No. transfer GR qty. ロット・手配ＮＯ振替入庫数量.<p>
	 *
	 */
	public MCNumber xfr_lot_sno_gr_qty() {
		return xfr_lot_sno_gr_qty_p().qty();
	}

	/**
	 * Lot/SEIBAN No. transfer GR qty. ロット・手配ＮＯ振替入庫数量.<p>
	 *
	 */
	public void xfr_lot_sno_gr_qty(MCNumber value) {
		xfr_lot_sno_gr_qty_p().qty(value);
	}

	/**
	 * Lot/SEIBAN No. transfer GR qty. ロット・手配ＮＯ振替入庫数量.<p>
	 *
	 */
	public void xfr_lot_sno_gr_qty(int value) {
		xfr_lot_sno_gr_qty_p().qty(value);
	}

	/**
	 * Lot/SEIBAN No. transfer GR qty. ロット・手配ＮＯ振替入庫数量.<p>
	 *
	 */
	public void xfr_lot_sno_gr_qty(long value) {
		xfr_lot_sno_gr_qty_p().qty(value);
	}

	/**
	 * Lot/SEIBAN No. transfer GR qty. ロット・手配ＮＯ振替入庫数量.<p>
	 *
	 */
	public void xfr_lot_sno_gr_qty(float value) {
		xfr_lot_sno_gr_qty_p().qty(value);
	}

	/**
	 * Lot/SEIBAN No. transfer GR qty. ロット・手配ＮＯ振替入庫数量.<p>
	 *
	 */
	public void xfr_lot_sno_gr_qty(double value) {
		xfr_lot_sno_gr_qty_p().qty(value);
	}

	/**
	 * GR qty. (Grading/conforming type transfer) 格付・良品区分振替入庫数量.<p>
	 *
	 */
	public MCNumber xfr_grd_gr_qty() {
		return xfr_grd_gr_qty_p().qty();
	}

	/**
	 * GR qty. (Grading/conforming type transfer) 格付・良品区分振替入庫数量.<p>
	 *
	 */
	public void xfr_grd_gr_qty(MCNumber value) {
		xfr_grd_gr_qty_p().qty(value);
	}

	/**
	 * GR qty. (Grading/conforming type transfer) 格付・良品区分振替入庫数量.<p>
	 *
	 */
	public void xfr_grd_gr_qty(int value) {
		xfr_grd_gr_qty_p().qty(value);
	}

	/**
	 * GR qty. (Grading/conforming type transfer) 格付・良品区分振替入庫数量.<p>
	 *
	 */
	public void xfr_grd_gr_qty(long value) {
		xfr_grd_gr_qty_p().qty(value);
	}

	/**
	 * GR qty. (Grading/conforming type transfer) 格付・良品区分振替入庫数量.<p>
	 *
	 */
	public void xfr_grd_gr_qty(float value) {
		xfr_grd_gr_qty_p().qty(value);
	}

	/**
	 * GR qty. (Grading/conforming type transfer) 格付・良品区分振替入庫数量.<p>
	 *
	 */
	public void xfr_grd_gr_qty(double value) {
		xfr_grd_gr_qty_p().qty(value);
	}

	/**
	 * SKU transfer GR qty. 荷姿振替入庫数量.<p>
	 *
	 */
	public MCNumber xfr_pack_gr_qty() {
		return xfr_pack_gr_qty_p().qty();
	}

	/**
	 * SKU transfer GR qty. 荷姿振替入庫数量.<p>
	 *
	 */
	public void xfr_pack_gr_qty(MCNumber value) {
		xfr_pack_gr_qty_p().qty(value);
	}

	/**
	 * SKU transfer GR qty. 荷姿振替入庫数量.<p>
	 *
	 */
	public void xfr_pack_gr_qty(int value) {
		xfr_pack_gr_qty_p().qty(value);
	}

	/**
	 * SKU transfer GR qty. 荷姿振替入庫数量.<p>
	 *
	 */
	public void xfr_pack_gr_qty(long value) {
		xfr_pack_gr_qty_p().qty(value);
	}

	/**
	 * SKU transfer GR qty. 荷姿振替入庫数量.<p>
	 *
	 */
	public void xfr_pack_gr_qty(float value) {
		xfr_pack_gr_qty_p().qty(value);
	}

	/**
	 * SKU transfer GR qty. 荷姿振替入庫数量.<p>
	 *
	 */
	public void xfr_pack_gr_qty(double value) {
		xfr_pack_gr_qty_p().qty(value);
	}

	/**
	 * Arrival qty. 着荷数量.<p>
	 *
	 */
	public MCNumber ship_in_qty() {
		return ship_in_qty_p().qty();
	}

	/**
	 * Arrival qty. 着荷数量.<p>
	 *
	 */
	public void ship_in_qty(MCNumber value) {
		ship_in_qty_p().qty(value);
	}

	/**
	 * Arrival qty. 着荷数量.<p>
	 *
	 */
	public void ship_in_qty(int value) {
		ship_in_qty_p().qty(value);
	}

	/**
	 * Arrival qty. 着荷数量.<p>
	 *
	 */
	public void ship_in_qty(long value) {
		ship_in_qty_p().qty(value);
	}

	/**
	 * Arrival qty. 着荷数量.<p>
	 *
	 */
	public void ship_in_qty(float value) {
		ship_in_qty_p().qty(value);
	}

	/**
	 * Arrival qty. 着荷数量.<p>
	 *
	 */
	public void ship_in_qty(double value) {
		ship_in_qty_p().qty(value);
	}

	/**
	 * Export arrival qty. 輸出着荷数量.<p>
	 *
	 */
	public MCNumber ex_ship_in_qty() {
		return ex_ship_in_qty_p().qty();
	}

	/**
	 * Export arrival qty. 輸出着荷数量.<p>
	 *
	 */
	public void ex_ship_in_qty(MCNumber value) {
		ex_ship_in_qty_p().qty(value);
	}

	/**
	 * Export arrival qty. 輸出着荷数量.<p>
	 *
	 */
	public void ex_ship_in_qty(int value) {
		ex_ship_in_qty_p().qty(value);
	}

	/**
	 * Export arrival qty. 輸出着荷数量.<p>
	 *
	 */
	public void ex_ship_in_qty(long value) {
		ex_ship_in_qty_p().qty(value);
	}

	/**
	 * Export arrival qty. 輸出着荷数量.<p>
	 *
	 */
	public void ex_ship_in_qty(float value) {
		ex_ship_in_qty_p().qty(value);
	}

	/**
	 * Export arrival qty. 輸出着荷数量.<p>
	 *
	 */
	public void ex_ship_in_qty(double value) {
		ex_ship_in_qty_p().qty(value);
	}

	/**
	 * Shipping return GR qty. 出荷返品入庫数量.<p>
	 *
	 */
	public MCNumber ship_rtn_gr_qty() {
		return ship_rtn_gr_qty_p().qty();
	}

	/**
	 * Shipping return GR qty. 出荷返品入庫数量.<p>
	 *
	 */
	public void ship_rtn_gr_qty(MCNumber value) {
		ship_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Shipping return GR qty. 出荷返品入庫数量.<p>
	 *
	 */
	public void ship_rtn_gr_qty(int value) {
		ship_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Shipping return GR qty. 出荷返品入庫数量.<p>
	 *
	 */
	public void ship_rtn_gr_qty(long value) {
		ship_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Shipping return GR qty. 出荷返品入庫数量.<p>
	 *
	 */
	public void ship_rtn_gr_qty(float value) {
		ship_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Shipping return GR qty. 出荷返品入庫数量.<p>
	 *
	 */
	public void ship_rtn_gr_qty(double value) {
		ship_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Sales return GR qty. 売上返品入庫数量.<p>
	 *
	 */
	public MCNumber sls_rtn_gr_qty() {
		return sls_rtn_gr_qty_p().qty();
	}

	/**
	 * Sales return GR qty. 売上返品入庫数量.<p>
	 *
	 */
	public void sls_rtn_gr_qty(MCNumber value) {
		sls_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Sales return GR qty. 売上返品入庫数量.<p>
	 *
	 */
	public void sls_rtn_gr_qty(int value) {
		sls_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Sales return GR qty. 売上返品入庫数量.<p>
	 *
	 */
	public void sls_rtn_gr_qty(long value) {
		sls_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Sales return GR qty. 売上返品入庫数量.<p>
	 *
	 */
	public void sls_rtn_gr_qty(float value) {
		sls_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Sales return GR qty. 売上返品入庫数量.<p>
	 *
	 */
	public void sls_rtn_gr_qty(double value) {
		sls_rtn_gr_qty_p().qty(value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public MCNumber gi_total_qty() {
		return gi_total_qty_p().qty();
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_qty(MCNumber value) {
		gi_total_qty_p().qty(value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_qty(int value) {
		gi_total_qty_p().qty(value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_qty(long value) {
		gi_total_qty_p().qty(value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_qty(float value) {
		gi_total_qty_p().qty(value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_qty(double value) {
		gi_total_qty_p().qty(value);
	}

	/**
	 * Receipt return qty. 入荷返品数量.<p>
	 *
	 */
	public MCNumber arr_rtn_qty() {
		return arr_rtn_qty_p().qty();
	}

	/**
	 * Receipt return qty. 入荷返品数量.<p>
	 *
	 */
	public void arr_rtn_qty(MCNumber value) {
		arr_rtn_qty_p().qty(value);
	}

	/**
	 * Receipt return qty. 入荷返品数量.<p>
	 *
	 */
	public void arr_rtn_qty(int value) {
		arr_rtn_qty_p().qty(value);
	}

	/**
	 * Receipt return qty. 入荷返品数量.<p>
	 *
	 */
	public void arr_rtn_qty(long value) {
		arr_rtn_qty_p().qty(value);
	}

	/**
	 * Receipt return qty. 入荷返品数量.<p>
	 *
	 */
	public void arr_rtn_qty(float value) {
		arr_rtn_qty_p().qty(value);
	}

	/**
	 * Receipt return qty. 入荷返品数量.<p>
	 *
	 */
	public void arr_rtn_qty(double value) {
		arr_rtn_qty_p().qty(value);
	}

	/**
	 * Purchase GI qty. 仕入出庫数量.<p>
	 *
	 */
	public MCNumber purc_gi_qty() {
		return purc_gi_qty_p().qty();
	}

	/**
	 * Purchase GI qty. 仕入出庫数量.<p>
	 *
	 */
	public void purc_gi_qty(MCNumber value) {
		purc_gi_qty_p().qty(value);
	}

	/**
	 * Purchase GI qty. 仕入出庫数量.<p>
	 *
	 */
	public void purc_gi_qty(int value) {
		purc_gi_qty_p().qty(value);
	}

	/**
	 * Purchase GI qty. 仕入出庫数量.<p>
	 *
	 */
	public void purc_gi_qty(long value) {
		purc_gi_qty_p().qty(value);
	}

	/**
	 * Purchase GI qty. 仕入出庫数量.<p>
	 *
	 */
	public void purc_gi_qty(float value) {
		purc_gi_qty_p().qty(value);
	}

	/**
	 * Purchase GI qty. 仕入出庫数量.<p>
	 *
	 */
	public void purc_gi_qty(double value) {
		purc_gi_qty_p().qty(value);
	}

	/**
	 * Receiving for a fee GI qty. 有償受給出庫数量.<p>
	 *
	 */
	public MCNumber onr_rcv_gi_qty() {
		return onr_rcv_gi_qty_p().qty();
	}

	/**
	 * Receiving for a fee GI qty. 有償受給出庫数量.<p>
	 *
	 */
	public void onr_rcv_gi_qty(MCNumber value) {
		onr_rcv_gi_qty_p().qty(value);
	}

	/**
	 * Receiving for a fee GI qty. 有償受給出庫数量.<p>
	 *
	 */
	public void onr_rcv_gi_qty(int value) {
		onr_rcv_gi_qty_p().qty(value);
	}

	/**
	 * Receiving for a fee GI qty. 有償受給出庫数量.<p>
	 *
	 */
	public void onr_rcv_gi_qty(long value) {
		onr_rcv_gi_qty_p().qty(value);
	}

	/**
	 * Receiving for a fee GI qty. 有償受給出庫数量.<p>
	 *
	 */
	public void onr_rcv_gi_qty(float value) {
		onr_rcv_gi_qty_p().qty(value);
	}

	/**
	 * Receiving for a fee GI qty. 有償受給出庫数量.<p>
	 *
	 */
	public void onr_rcv_gi_qty(double value) {
		onr_rcv_gi_qty_p().qty(value);
	}

	/**
	 * Purchase return GI qty. 仕入返品出庫数量.<p>
	 *
	 */
	public MCNumber purc_rtn_gi_qty() {
		return purc_rtn_gi_qty_p().qty();
	}

	/**
	 * Purchase return GI qty. 仕入返品出庫数量.<p>
	 *
	 */
	public void purc_rtn_gi_qty(MCNumber value) {
		purc_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Purchase return GI qty. 仕入返品出庫数量.<p>
	 *
	 */
	public void purc_rtn_gi_qty(int value) {
		purc_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Purchase return GI qty. 仕入返品出庫数量.<p>
	 *
	 */
	public void purc_rtn_gi_qty(long value) {
		purc_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Purchase return GI qty. 仕入返品出庫数量.<p>
	 *
	 */
	public void purc_rtn_gi_qty(float value) {
		purc_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Purchase return GI qty. 仕入返品出庫数量.<p>
	 *
	 */
	public void purc_rtn_gi_qty(double value) {
		purc_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Receiving for a fee return GI qty. 有償受給返品出庫数量.<p>
	 *
	 */
	public MCNumber onr_rcv_ret_gi_qty() {
		return onr_rcv_ret_gi_qty_p().qty();
	}

	/**
	 * Receiving for a fee return GI qty. 有償受給返品出庫数量.<p>
	 *
	 */
	public void onr_rcv_ret_gi_qty(MCNumber value) {
		onr_rcv_ret_gi_qty_p().qty(value);
	}

	/**
	 * Receiving for a fee return GI qty. 有償受給返品出庫数量.<p>
	 *
	 */
	public void onr_rcv_ret_gi_qty(int value) {
		onr_rcv_ret_gi_qty_p().qty(value);
	}

	/**
	 * Receiving for a fee return GI qty. 有償受給返品出庫数量.<p>
	 *
	 */
	public void onr_rcv_ret_gi_qty(long value) {
		onr_rcv_ret_gi_qty_p().qty(value);
	}

	/**
	 * Receiving for a fee return GI qty. 有償受給返品出庫数量.<p>
	 *
	 */
	public void onr_rcv_ret_gi_qty(float value) {
		onr_rcv_ret_gi_qty_p().qty(value);
	}

	/**
	 * Receiving for a fee return GI qty. 有償受給返品出庫数量.<p>
	 *
	 */
	public void onr_rcv_ret_gi_qty(double value) {
		onr_rcv_ret_gi_qty_p().qty(value);
	}

	/**
	 * Expense purchase GI qty. 経費購買出庫数量.<p>
	 *
	 */
	public MCNumber xpns_purc_gi_qty() {
		return xpns_purc_gi_qty_p().qty();
	}

	/**
	 * Expense purchase GI qty. 経費購買出庫数量.<p>
	 *
	 */
	public void xpns_purc_gi_qty(MCNumber value) {
		xpns_purc_gi_qty_p().qty(value);
	}

	/**
	 * Expense purchase GI qty. 経費購買出庫数量.<p>
	 *
	 */
	public void xpns_purc_gi_qty(int value) {
		xpns_purc_gi_qty_p().qty(value);
	}

	/**
	 * Expense purchase GI qty. 経費購買出庫数量.<p>
	 *
	 */
	public void xpns_purc_gi_qty(long value) {
		xpns_purc_gi_qty_p().qty(value);
	}

	/**
	 * Expense purchase GI qty. 経費購買出庫数量.<p>
	 *
	 */
	public void xpns_purc_gi_qty(float value) {
		xpns_purc_gi_qty_p().qty(value);
	}

	/**
	 * Expense purchase GI qty. 経費購買出庫数量.<p>
	 *
	 */
	public void xpns_purc_gi_qty(double value) {
		xpns_purc_gi_qty_p().qty(value);
	}

	/**
	 * Expense purchase return GI qty. 経費購買返品出庫数量.<p>
	 *
	 */
	public MCNumber xpns_purc_rtn_gi_qty() {
		return xpns_purc_rtn_gi_qty_p().qty();
	}

	/**
	 * Expense purchase return GI qty. 経費購買返品出庫数量.<p>
	 *
	 */
	public void xpns_purc_rtn_gi_qty(MCNumber value) {
		xpns_purc_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Expense purchase return GI qty. 経費購買返品出庫数量.<p>
	 *
	 */
	public void xpns_purc_rtn_gi_qty(int value) {
		xpns_purc_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Expense purchase return GI qty. 経費購買返品出庫数量.<p>
	 *
	 */
	public void xpns_purc_rtn_gi_qty(long value) {
		xpns_purc_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Expense purchase return GI qty. 経費購買返品出庫数量.<p>
	 *
	 */
	public void xpns_purc_rtn_gi_qty(float value) {
		xpns_purc_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Expense purchase return GI qty. 経費購買返品出庫数量.<p>
	 *
	 */
	public void xpns_purc_rtn_gi_qty(double value) {
		xpns_purc_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Defective acceptance GI qty. 検収不良出庫数量.<p>
	 *
	 */
	public MCNumber accpt_dfct_gi_qty() {
		return accpt_dfct_gi_qty_p().qty();
	}

	/**
	 * Defective acceptance GI qty. 検収不良出庫数量.<p>
	 *
	 */
	public void accpt_dfct_gi_qty(MCNumber value) {
		accpt_dfct_gi_qty_p().qty(value);
	}

	/**
	 * Defective acceptance GI qty. 検収不良出庫数量.<p>
	 *
	 */
	public void accpt_dfct_gi_qty(int value) {
		accpt_dfct_gi_qty_p().qty(value);
	}

	/**
	 * Defective acceptance GI qty. 検収不良出庫数量.<p>
	 *
	 */
	public void accpt_dfct_gi_qty(long value) {
		accpt_dfct_gi_qty_p().qty(value);
	}

	/**
	 * Defective acceptance GI qty. 検収不良出庫数量.<p>
	 *
	 */
	public void accpt_dfct_gi_qty(float value) {
		accpt_dfct_gi_qty_p().qty(value);
	}

	/**
	 * Defective acceptance GI qty. 検収不良出庫数量.<p>
	 *
	 */
	public void accpt_dfct_gi_qty(double value) {
		accpt_dfct_gi_qty_p().qty(value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public MCNumber inpt_qty() {
		return inpt_qty_p().qty();
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(MCNumber value) {
		inpt_qty_p().qty(value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(int value) {
		inpt_qty_p().qty(value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(long value) {
		inpt_qty_p().qty(value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(float value) {
		inpt_qty_p().qty(value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(double value) {
		inpt_qty_p().qty(value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public MCNumber loss_qty() {
		return loss_qty_p().qty();
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(MCNumber value) {
		loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(int value) {
		loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(long value) {
		loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(float value) {
		loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(double value) {
		loss_qty_p().qty(value);
	}

	/**
	 * Non-chargeable supply GI qty. 無償支給出庫数量.<p>
	 *
	 */
	public MCNumber ffr_prov_gi_qty() {
		return ffr_prov_gi_qty_p().qty();
	}

	/**
	 * Non-chargeable supply GI qty. 無償支給出庫数量.<p>
	 *
	 */
	public void ffr_prov_gi_qty(MCNumber value) {
		ffr_prov_gi_qty_p().qty(value);
	}

	/**
	 * Non-chargeable supply GI qty. 無償支給出庫数量.<p>
	 *
	 */
	public void ffr_prov_gi_qty(int value) {
		ffr_prov_gi_qty_p().qty(value);
	}

	/**
	 * Non-chargeable supply GI qty. 無償支給出庫数量.<p>
	 *
	 */
	public void ffr_prov_gi_qty(long value) {
		ffr_prov_gi_qty_p().qty(value);
	}

	/**
	 * Non-chargeable supply GI qty. 無償支給出庫数量.<p>
	 *
	 */
	public void ffr_prov_gi_qty(float value) {
		ffr_prov_gi_qty_p().qty(value);
	}

	/**
	 * Non-chargeable supply GI qty. 無償支給出庫数量.<p>
	 *
	 */
	public void ffr_prov_gi_qty(double value) {
		ffr_prov_gi_qty_p().qty(value);
	}

	/**
	 * Chargeable supply GI qty. 有償支給出庫数量.<p>
	 *
	 */
	public MCNumber onr_prov_gi_qty() {
		return onr_prov_gi_qty_p().qty();
	}

	/**
	 * Chargeable supply GI qty. 有償支給出庫数量.<p>
	 *
	 */
	public void onr_prov_gi_qty(MCNumber value) {
		onr_prov_gi_qty_p().qty(value);
	}

	/**
	 * Chargeable supply GI qty. 有償支給出庫数量.<p>
	 *
	 */
	public void onr_prov_gi_qty(int value) {
		onr_prov_gi_qty_p().qty(value);
	}

	/**
	 * Chargeable supply GI qty. 有償支給出庫数量.<p>
	 *
	 */
	public void onr_prov_gi_qty(long value) {
		onr_prov_gi_qty_p().qty(value);
	}

	/**
	 * Chargeable supply GI qty. 有償支給出庫数量.<p>
	 *
	 */
	public void onr_prov_gi_qty(float value) {
		onr_prov_gi_qty_p().qty(value);
	}

	/**
	 * Chargeable supply GI qty. 有償支給出庫数量.<p>
	 *
	 */
	public void onr_prov_gi_qty(double value) {
		onr_prov_gi_qty_p().qty(value);
	}

	/**
	 * Non-chargeable supply return GI qty. 無償支給返品出庫数量.<p>
	 *
	 */
	public MCNumber ffr_prov_rtn_gi_qty() {
		return ffr_prov_rtn_gi_qty_p().qty();
	}

	/**
	 * Non-chargeable supply return GI qty. 無償支給返品出庫数量.<p>
	 *
	 */
	public void ffr_prov_rtn_gi_qty(MCNumber value) {
		ffr_prov_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Non-chargeable supply return GI qty. 無償支給返品出庫数量.<p>
	 *
	 */
	public void ffr_prov_rtn_gi_qty(int value) {
		ffr_prov_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Non-chargeable supply return GI qty. 無償支給返品出庫数量.<p>
	 *
	 */
	public void ffr_prov_rtn_gi_qty(long value) {
		ffr_prov_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Non-chargeable supply return GI qty. 無償支給返品出庫数量.<p>
	 *
	 */
	public void ffr_prov_rtn_gi_qty(float value) {
		ffr_prov_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Non-chargeable supply return GI qty. 無償支給返品出庫数量.<p>
	 *
	 */
	public void ffr_prov_rtn_gi_qty(double value) {
		ffr_prov_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Chargeable supply return GI qty. 有償支給返品出庫数量.<p>
	 *
	 */
	public MCNumber onr_prov_rtn_gi_qty() {
		return onr_prov_rtn_gi_qty_p().qty();
	}

	/**
	 * Chargeable supply return GI qty. 有償支給返品出庫数量.<p>
	 *
	 */
	public void onr_prov_rtn_gi_qty(MCNumber value) {
		onr_prov_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Chargeable supply return GI qty. 有償支給返品出庫数量.<p>
	 *
	 */
	public void onr_prov_rtn_gi_qty(int value) {
		onr_prov_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Chargeable supply return GI qty. 有償支給返品出庫数量.<p>
	 *
	 */
	public void onr_prov_rtn_gi_qty(long value) {
		onr_prov_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Chargeable supply return GI qty. 有償支給返品出庫数量.<p>
	 *
	 */
	public void onr_prov_rtn_gi_qty(float value) {
		onr_prov_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Chargeable supply return GI qty. 有償支給返品出庫数量.<p>
	 *
	 */
	public void onr_prov_rtn_gi_qty(double value) {
		onr_prov_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public MCNumber insp_gi_qty() {
		return insp_gi_qty_p().qty();
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public void insp_gi_qty(MCNumber value) {
		insp_gi_qty_p().qty(value);
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public void insp_gi_qty(int value) {
		insp_gi_qty_p().qty(value);
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public void insp_gi_qty(long value) {
		insp_gi_qty_p().qty(value);
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public void insp_gi_qty(float value) {
		insp_gi_qty_p().qty(value);
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public void insp_gi_qty(double value) {
		insp_gi_qty_p().qty(value);
	}

	/**
	 * Inspection completed GI qty. 検査完了出庫数量.<p>
	 *
	 */
	public MCNumber insp_cmpl_gi_qty() {
		return insp_cmpl_gi_qty_p().qty();
	}

	/**
	 * Inspection completed GI qty. 検査完了出庫数量.<p>
	 *
	 */
	public void insp_cmpl_gi_qty(MCNumber value) {
		insp_cmpl_gi_qty_p().qty(value);
	}

	/**
	 * Inspection completed GI qty. 検査完了出庫数量.<p>
	 *
	 */
	public void insp_cmpl_gi_qty(int value) {
		insp_cmpl_gi_qty_p().qty(value);
	}

	/**
	 * Inspection completed GI qty. 検査完了出庫数量.<p>
	 *
	 */
	public void insp_cmpl_gi_qty(long value) {
		insp_cmpl_gi_qty_p().qty(value);
	}

	/**
	 * Inspection completed GI qty. 検査完了出庫数量.<p>
	 *
	 */
	public void insp_cmpl_gi_qty(float value) {
		insp_cmpl_gi_qty_p().qty(value);
	}

	/**
	 * Inspection completed GI qty. 検査完了出庫数量.<p>
	 *
	 */
	public void insp_cmpl_gi_qty(double value) {
		insp_cmpl_gi_qty_p().qty(value);
	}

	/**
	 * Inspection decision GI qty. 検査判定出庫数量.<p>
	 *
	 */
	public MCNumber insp_judg_gi_qty() {
		return insp_judg_gi_qty_p().qty();
	}

	/**
	 * Inspection decision GI qty. 検査判定出庫数量.<p>
	 *
	 */
	public void insp_judg_gi_qty(MCNumber value) {
		insp_judg_gi_qty_p().qty(value);
	}

	/**
	 * Inspection decision GI qty. 検査判定出庫数量.<p>
	 *
	 */
	public void insp_judg_gi_qty(int value) {
		insp_judg_gi_qty_p().qty(value);
	}

	/**
	 * Inspection decision GI qty. 検査判定出庫数量.<p>
	 *
	 */
	public void insp_judg_gi_qty(long value) {
		insp_judg_gi_qty_p().qty(value);
	}

	/**
	 * Inspection decision GI qty. 検査判定出庫数量.<p>
	 *
	 */
	public void insp_judg_gi_qty(float value) {
		insp_judg_gi_qty_p().qty(value);
	}

	/**
	 * Inspection decision GI qty. 検査判定出庫数量.<p>
	 *
	 */
	public void insp_judg_gi_qty(double value) {
		insp_judg_gi_qty_p().qty(value);
	}

	/**
	 * Re-inspection GI qty. 再検査出庫数量.<p>
	 *
	 */
	public MCNumber reinsp_gi_qty() {
		return reinsp_gi_qty_p().qty();
	}

	/**
	 * Re-inspection GI qty. 再検査出庫数量.<p>
	 *
	 */
	public void reinsp_gi_qty(MCNumber value) {
		reinsp_gi_qty_p().qty(value);
	}

	/**
	 * Re-inspection GI qty. 再検査出庫数量.<p>
	 *
	 */
	public void reinsp_gi_qty(int value) {
		reinsp_gi_qty_p().qty(value);
	}

	/**
	 * Re-inspection GI qty. 再検査出庫数量.<p>
	 *
	 */
	public void reinsp_gi_qty(long value) {
		reinsp_gi_qty_p().qty(value);
	}

	/**
	 * Re-inspection GI qty. 再検査出庫数量.<p>
	 *
	 */
	public void reinsp_gi_qty(float value) {
		reinsp_gi_qty_p().qty(value);
	}

	/**
	 * Re-inspection GI qty. 再検査出庫数量.<p>
	 *
	 */
	public void reinsp_gi_qty(double value) {
		reinsp_gi_qty_p().qty(value);
	}

	/**
	 * Sampling qty. 検査抜取数量.<p>
	 *
	 */
	public MCNumber insp_smpl_gi_qty() {
		return insp_smpl_gi_qty_p().qty();
	}

	/**
	 * Sampling qty. 検査抜取数量.<p>
	 *
	 */
	public void insp_smpl_gi_qty(MCNumber value) {
		insp_smpl_gi_qty_p().qty(value);
	}

	/**
	 * Sampling qty. 検査抜取数量.<p>
	 *
	 */
	public void insp_smpl_gi_qty(int value) {
		insp_smpl_gi_qty_p().qty(value);
	}

	/**
	 * Sampling qty. 検査抜取数量.<p>
	 *
	 */
	public void insp_smpl_gi_qty(long value) {
		insp_smpl_gi_qty_p().qty(value);
	}

	/**
	 * Sampling qty. 検査抜取数量.<p>
	 *
	 */
	public void insp_smpl_gi_qty(float value) {
		insp_smpl_gi_qty_p().qty(value);
	}

	/**
	 * Sampling qty. 検査抜取数量.<p>
	 *
	 */
	public void insp_smpl_gi_qty(double value) {
		insp_smpl_gi_qty_p().qty(value);
	}

	/**
	 * Inventory count variance qty. (GI) 棚卸差異減耗数量.<p>
	 *
	 */
	public MCNumber stk_adjst_gi_qty() {
		return stk_adjst_gi_qty_p().qty();
	}

	/**
	 * Inventory count variance qty. (GI) 棚卸差異減耗数量.<p>
	 *
	 */
	public void stk_adjst_gi_qty(MCNumber value) {
		stk_adjst_gi_qty_p().qty(value);
	}

	/**
	 * Inventory count variance qty. (GI) 棚卸差異減耗数量.<p>
	 *
	 */
	public void stk_adjst_gi_qty(int value) {
		stk_adjst_gi_qty_p().qty(value);
	}

	/**
	 * Inventory count variance qty. (GI) 棚卸差異減耗数量.<p>
	 *
	 */
	public void stk_adjst_gi_qty(long value) {
		stk_adjst_gi_qty_p().qty(value);
	}

	/**
	 * Inventory count variance qty. (GI) 棚卸差異減耗数量.<p>
	 *
	 */
	public void stk_adjst_gi_qty(float value) {
		stk_adjst_gi_qty_p().qty(value);
	}

	/**
	 * Inventory count variance qty. (GI) 棚卸差異減耗数量.<p>
	 *
	 */
	public void stk_adjst_gi_qty(double value) {
		stk_adjst_gi_qty_p().qty(value);
	}

	/**
	 * Warehousing GI qty. 倉入出庫数量.<p>
	 *
	 */
	public MCNumber prdct_wh_gi_qty() {
		return prdct_wh_gi_qty_p().qty();
	}

	/**
	 * Warehousing GI qty. 倉入出庫数量.<p>
	 *
	 */
	public void prdct_wh_gi_qty(MCNumber value) {
		prdct_wh_gi_qty_p().qty(value);
	}

	/**
	 * Warehousing GI qty. 倉入出庫数量.<p>
	 *
	 */
	public void prdct_wh_gi_qty(int value) {
		prdct_wh_gi_qty_p().qty(value);
	}

	/**
	 * Warehousing GI qty. 倉入出庫数量.<p>
	 *
	 */
	public void prdct_wh_gi_qty(long value) {
		prdct_wh_gi_qty_p().qty(value);
	}

	/**
	 * Warehousing GI qty. 倉入出庫数量.<p>
	 *
	 */
	public void prdct_wh_gi_qty(float value) {
		prdct_wh_gi_qty_p().qty(value);
	}

	/**
	 * Warehousing GI qty. 倉入出庫数量.<p>
	 *
	 */
	public void prdct_wh_gi_qty(double value) {
		prdct_wh_gi_qty_p().qty(value);
	}

	/**
	 * GI returning qty. 戻入出庫数量.<p>
	 *
	 */
	public MCNumber prdct_wh_rtn_gi_qty() {
		return prdct_wh_rtn_gi_qty_p().qty();
	}

	/**
	 * GI returning qty. 戻入出庫数量.<p>
	 *
	 */
	public void prdct_wh_rtn_gi_qty(MCNumber value) {
		prdct_wh_rtn_gi_qty_p().qty(value);
	}

	/**
	 * GI returning qty. 戻入出庫数量.<p>
	 *
	 */
	public void prdct_wh_rtn_gi_qty(int value) {
		prdct_wh_rtn_gi_qty_p().qty(value);
	}

	/**
	 * GI returning qty. 戻入出庫数量.<p>
	 *
	 */
	public void prdct_wh_rtn_gi_qty(long value) {
		prdct_wh_rtn_gi_qty_p().qty(value);
	}

	/**
	 * GI returning qty. 戻入出庫数量.<p>
	 *
	 */
	public void prdct_wh_rtn_gi_qty(float value) {
		prdct_wh_rtn_gi_qty_p().qty(value);
	}

	/**
	 * GI returning qty. 戻入出庫数量.<p>
	 *
	 */
	public void prdct_wh_rtn_gi_qty(double value) {
		prdct_wh_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public MCNumber xfr_gi_qty() {
		return xfr_gi_qty_p().qty();
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public void xfr_gi_qty(MCNumber value) {
		xfr_gi_qty_p().qty(value);
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public void xfr_gi_qty(int value) {
		xfr_gi_qty_p().qty(value);
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public void xfr_gi_qty(long value) {
		xfr_gi_qty_p().qty(value);
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public void xfr_gi_qty(float value) {
		xfr_gi_qty_p().qty(value);
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public void xfr_gi_qty(double value) {
		xfr_gi_qty_p().qty(value);
	}

	/**
	 * Move-out qty. 転出数量.<p>
	 *
	 */
	public MCNumber xfr_out_qty() {
		return xfr_out_qty_p().qty();
	}

	/**
	 * Move-out qty. 転出数量.<p>
	 *
	 */
	public void xfr_out_qty(MCNumber value) {
		xfr_out_qty_p().qty(value);
	}

	/**
	 * Move-out qty. 転出数量.<p>
	 *
	 */
	public void xfr_out_qty(int value) {
		xfr_out_qty_p().qty(value);
	}

	/**
	 * Move-out qty. 転出数量.<p>
	 *
	 */
	public void xfr_out_qty(long value) {
		xfr_out_qty_p().qty(value);
	}

	/**
	 * Move-out qty. 転出数量.<p>
	 *
	 */
	public void xfr_out_qty(float value) {
		xfr_out_qty_p().qty(value);
	}

	/**
	 * Move-out qty. 転出数量.<p>
	 *
	 */
	public void xfr_out_qty(double value) {
		xfr_out_qty_p().qty(value);
	}

	/**
	 * Purchase move-out qty. 仕入転出数量.<p>
	 *
	 */
	public MCNumber purc_xfr_out_qty() {
		return purc_xfr_out_qty_p().qty();
	}

	/**
	 * Purchase move-out qty. 仕入転出数量.<p>
	 *
	 */
	public void purc_xfr_out_qty(MCNumber value) {
		purc_xfr_out_qty_p().qty(value);
	}

	/**
	 * Purchase move-out qty. 仕入転出数量.<p>
	 *
	 */
	public void purc_xfr_out_qty(int value) {
		purc_xfr_out_qty_p().qty(value);
	}

	/**
	 * Purchase move-out qty. 仕入転出数量.<p>
	 *
	 */
	public void purc_xfr_out_qty(long value) {
		purc_xfr_out_qty_p().qty(value);
	}

	/**
	 * Purchase move-out qty. 仕入転出数量.<p>
	 *
	 */
	public void purc_xfr_out_qty(float value) {
		purc_xfr_out_qty_p().qty(value);
	}

	/**
	 * Purchase move-out qty. 仕入転出数量.<p>
	 *
	 */
	public void purc_xfr_out_qty(double value) {
		purc_xfr_out_qty_p().qty(value);
	}

	/**
	 * Movement/transport return GI qty. 移動・移送返品出庫数量.<p>
	 *
	 */
	public MCNumber xfr_rtn_gi_qty() {
		return xfr_rtn_gi_qty_p().qty();
	}

	/**
	 * Movement/transport return GI qty. 移動・移送返品出庫数量.<p>
	 *
	 */
	public void xfr_rtn_gi_qty(MCNumber value) {
		xfr_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Movement/transport return GI qty. 移動・移送返品出庫数量.<p>
	 *
	 */
	public void xfr_rtn_gi_qty(int value) {
		xfr_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Movement/transport return GI qty. 移動・移送返品出庫数量.<p>
	 *
	 */
	public void xfr_rtn_gi_qty(long value) {
		xfr_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Movement/transport return GI qty. 移動・移送返品出庫数量.<p>
	 *
	 */
	public void xfr_rtn_gi_qty(float value) {
		xfr_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Movement/transport return GI qty. 移動・移送返品出庫数量.<p>
	 *
	 */
	public void xfr_rtn_gi_qty(double value) {
		xfr_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public MCNumber acxfr_gi_qty() {
		return acxfr_gi_qty_p().qty();
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public void acxfr_gi_qty(MCNumber value) {
		acxfr_gi_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public void acxfr_gi_qty(int value) {
		acxfr_gi_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public void acxfr_gi_qty(long value) {
		acxfr_gi_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public void acxfr_gi_qty(float value) {
		acxfr_gi_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public void acxfr_gi_qty(double value) {
		acxfr_gi_qty_p().qty(value);
	}

	/**
	 * Disposal qty. 廃棄数量.<p>
	 *
	 */
	public MCNumber scrp_qty() {
		return scrp_qty_p().qty();
	}

	/**
	 * Disposal qty. 廃棄数量.<p>
	 *
	 */
	public void scrp_qty(MCNumber value) {
		scrp_qty_p().qty(value);
	}

	/**
	 * Disposal qty. 廃棄数量.<p>
	 *
	 */
	public void scrp_qty(int value) {
		scrp_qty_p().qty(value);
	}

	/**
	 * Disposal qty. 廃棄数量.<p>
	 *
	 */
	public void scrp_qty(long value) {
		scrp_qty_p().qty(value);
	}

	/**
	 * Disposal qty. 廃棄数量.<p>
	 *
	 */
	public void scrp_qty(float value) {
		scrp_qty_p().qty(value);
	}

	/**
	 * Disposal qty. 廃棄数量.<p>
	 *
	 */
	public void scrp_qty(double value) {
		scrp_qty_p().qty(value);
	}

	/**
	 * Item transfer GI qty. 品目振替出庫数量.<p>
	 *
	 */
	public MCNumber xfr_itm_gi_qty() {
		return xfr_itm_gi_qty_p().qty();
	}

	/**
	 * Item transfer GI qty. 品目振替出庫数量.<p>
	 *
	 */
	public void xfr_itm_gi_qty(MCNumber value) {
		xfr_itm_gi_qty_p().qty(value);
	}

	/**
	 * Item transfer GI qty. 品目振替出庫数量.<p>
	 *
	 */
	public void xfr_itm_gi_qty(int value) {
		xfr_itm_gi_qty_p().qty(value);
	}

	/**
	 * Item transfer GI qty. 品目振替出庫数量.<p>
	 *
	 */
	public void xfr_itm_gi_qty(long value) {
		xfr_itm_gi_qty_p().qty(value);
	}

	/**
	 * Item transfer GI qty. 品目振替出庫数量.<p>
	 *
	 */
	public void xfr_itm_gi_qty(float value) {
		xfr_itm_gi_qty_p().qty(value);
	}

	/**
	 * Item transfer GI qty. 品目振替出庫数量.<p>
	 *
	 */
	public void xfr_itm_gi_qty(double value) {
		xfr_itm_gi_qty_p().qty(value);
	}

	/**
	 * Lot/SEIBAN No. transfer GI qty. ロット・手配ＮＯ振替出庫数量.<p>
	 *
	 */
	public MCNumber xfr_lot_sno_gi_qty() {
		return xfr_lot_sno_gi_qty_p().qty();
	}

	/**
	 * Lot/SEIBAN No. transfer GI qty. ロット・手配ＮＯ振替出庫数量.<p>
	 *
	 */
	public void xfr_lot_sno_gi_qty(MCNumber value) {
		xfr_lot_sno_gi_qty_p().qty(value);
	}

	/**
	 * Lot/SEIBAN No. transfer GI qty. ロット・手配ＮＯ振替出庫数量.<p>
	 *
	 */
	public void xfr_lot_sno_gi_qty(int value) {
		xfr_lot_sno_gi_qty_p().qty(value);
	}

	/**
	 * Lot/SEIBAN No. transfer GI qty. ロット・手配ＮＯ振替出庫数量.<p>
	 *
	 */
	public void xfr_lot_sno_gi_qty(long value) {
		xfr_lot_sno_gi_qty_p().qty(value);
	}

	/**
	 * Lot/SEIBAN No. transfer GI qty. ロット・手配ＮＯ振替出庫数量.<p>
	 *
	 */
	public void xfr_lot_sno_gi_qty(float value) {
		xfr_lot_sno_gi_qty_p().qty(value);
	}

	/**
	 * Lot/SEIBAN No. transfer GI qty. ロット・手配ＮＯ振替出庫数量.<p>
	 *
	 */
	public void xfr_lot_sno_gi_qty(double value) {
		xfr_lot_sno_gi_qty_p().qty(value);
	}

	/**
	 * GI qty. (Grading/conforming type transfer) 格付・良品区分振替出庫数量.<p>
	 *
	 */
	public MCNumber xfr_grd_gi_qty() {
		return xfr_grd_gi_qty_p().qty();
	}

	/**
	 * GI qty. (Grading/conforming type transfer) 格付・良品区分振替出庫数量.<p>
	 *
	 */
	public void xfr_grd_gi_qty(MCNumber value) {
		xfr_grd_gi_qty_p().qty(value);
	}

	/**
	 * GI qty. (Grading/conforming type transfer) 格付・良品区分振替出庫数量.<p>
	 *
	 */
	public void xfr_grd_gi_qty(int value) {
		xfr_grd_gi_qty_p().qty(value);
	}

	/**
	 * GI qty. (Grading/conforming type transfer) 格付・良品区分振替出庫数量.<p>
	 *
	 */
	public void xfr_grd_gi_qty(long value) {
		xfr_grd_gi_qty_p().qty(value);
	}

	/**
	 * GI qty. (Grading/conforming type transfer) 格付・良品区分振替出庫数量.<p>
	 *
	 */
	public void xfr_grd_gi_qty(float value) {
		xfr_grd_gi_qty_p().qty(value);
	}

	/**
	 * GI qty. (Grading/conforming type transfer) 格付・良品区分振替出庫数量.<p>
	 *
	 */
	public void xfr_grd_gi_qty(double value) {
		xfr_grd_gi_qty_p().qty(value);
	}

	/**
	 * SKU transfer GI qty. 荷姿振替出庫数量.<p>
	 *
	 */
	public MCNumber xfr_pack_gi_qty() {
		return xfr_pack_gi_qty_p().qty();
	}

	/**
	 * SKU transfer GI qty. 荷姿振替出庫数量.<p>
	 *
	 */
	public void xfr_pack_gi_qty(MCNumber value) {
		xfr_pack_gi_qty_p().qty(value);
	}

	/**
	 * SKU transfer GI qty. 荷姿振替出庫数量.<p>
	 *
	 */
	public void xfr_pack_gi_qty(int value) {
		xfr_pack_gi_qty_p().qty(value);
	}

	/**
	 * SKU transfer GI qty. 荷姿振替出庫数量.<p>
	 *
	 */
	public void xfr_pack_gi_qty(long value) {
		xfr_pack_gi_qty_p().qty(value);
	}

	/**
	 * SKU transfer GI qty. 荷姿振替出庫数量.<p>
	 *
	 */
	public void xfr_pack_gi_qty(float value) {
		xfr_pack_gi_qty_p().qty(value);
	}

	/**
	 * SKU transfer GI qty. 荷姿振替出庫数量.<p>
	 *
	 */
	public void xfr_pack_gi_qty(double value) {
		xfr_pack_gi_qty_p().qty(value);
	}

	/**
	 * Shipping qty. 出荷数量.<p>
	 *
	 */
	public MCNumber ship_out_qty() {
		return ship_out_qty_p().qty();
	}

	/**
	 * Shipping qty. 出荷数量.<p>
	 *
	 */
	public void ship_out_qty(MCNumber value) {
		ship_out_qty_p().qty(value);
	}

	/**
	 * Shipping qty. 出荷数量.<p>
	 *
	 */
	public void ship_out_qty(int value) {
		ship_out_qty_p().qty(value);
	}

	/**
	 * Shipping qty. 出荷数量.<p>
	 *
	 */
	public void ship_out_qty(long value) {
		ship_out_qty_p().qty(value);
	}

	/**
	 * Shipping qty. 出荷数量.<p>
	 *
	 */
	public void ship_out_qty(float value) {
		ship_out_qty_p().qty(value);
	}

	/**
	 * Shipping qty. 出荷数量.<p>
	 *
	 */
	public void ship_out_qty(double value) {
		ship_out_qty_p().qty(value);
	}

	/**
	 * Export shipping qty. 輸出出荷数量.<p>
	 *
	 */
	public MCNumber ex_ship_out_qty() {
		return ex_ship_out_qty_p().qty();
	}

	/**
	 * Export shipping qty. 輸出出荷数量.<p>
	 *
	 */
	public void ex_ship_out_qty(MCNumber value) {
		ex_ship_out_qty_p().qty(value);
	}

	/**
	 * Export shipping qty. 輸出出荷数量.<p>
	 *
	 */
	public void ex_ship_out_qty(int value) {
		ex_ship_out_qty_p().qty(value);
	}

	/**
	 * Export shipping qty. 輸出出荷数量.<p>
	 *
	 */
	public void ex_ship_out_qty(long value) {
		ex_ship_out_qty_p().qty(value);
	}

	/**
	 * Export shipping qty. 輸出出荷数量.<p>
	 *
	 */
	public void ex_ship_out_qty(float value) {
		ex_ship_out_qty_p().qty(value);
	}

	/**
	 * Export shipping qty. 輸出出荷数量.<p>
	 *
	 */
	public void ex_ship_out_qty(double value) {
		ex_ship_out_qty_p().qty(value);
	}

	/**
	 * Shipping return GI qty. 出荷返品出庫数量.<p>
	 *
	 */
	public MCNumber ship_rtn_gi_qty() {
		return ship_rtn_gi_qty_p().qty();
	}

	/**
	 * Shipping return GI qty. 出荷返品出庫数量.<p>
	 *
	 */
	public void ship_rtn_gi_qty(MCNumber value) {
		ship_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Shipping return GI qty. 出荷返品出庫数量.<p>
	 *
	 */
	public void ship_rtn_gi_qty(int value) {
		ship_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Shipping return GI qty. 出荷返品出庫数量.<p>
	 *
	 */
	public void ship_rtn_gi_qty(long value) {
		ship_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Shipping return GI qty. 出荷返品出庫数量.<p>
	 *
	 */
	public void ship_rtn_gi_qty(float value) {
		ship_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Shipping return GI qty. 出荷返品出庫数量.<p>
	 *
	 */
	public void ship_rtn_gi_qty(double value) {
		ship_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Sales return GI qty. 売上返品出庫数量.<p>
	 *
	 */
	public MCNumber sls_rtn_gi_qty() {
		return sls_rtn_gi_qty_p().qty();
	}

	/**
	 * Sales return GI qty. 売上返品出庫数量.<p>
	 *
	 */
	public void sls_rtn_gi_qty(MCNumber value) {
		sls_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Sales return GI qty. 売上返品出庫数量.<p>
	 *
	 */
	public void sls_rtn_gi_qty(int value) {
		sls_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Sales return GI qty. 売上返品出庫数量.<p>
	 *
	 */
	public void sls_rtn_gi_qty(long value) {
		sls_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Sales return GI qty. 売上返品出庫数量.<p>
	 *
	 */
	public void sls_rtn_gi_qty(float value) {
		sls_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Sales return GI qty. 売上返品出庫数量.<p>
	 *
	 */
	public void sls_rtn_gi_qty(double value) {
		sls_rtn_gi_qty_p().qty(value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public MCNumber sls_qty() {
		return sls_qty_p().qty();
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(MCNumber value) {
		sls_qty_p().qty(value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(int value) {
		sls_qty_p().qty(value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(long value) {
		sls_qty_p().qty(value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(float value) {
		sls_qty_p().qty(value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(double value) {
		sls_qty_p().qty(value);
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public MCNumber end_stk_qty() {
		return end_stk_qty_p().qty();
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public void end_stk_qty(MCNumber value) {
		end_stk_qty_p().qty(value);
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public void end_stk_qty(int value) {
		end_stk_qty_p().qty(value);
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public void end_stk_qty(long value) {
		end_stk_qty_p().qty(value);
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public void end_stk_qty(float value) {
		end_stk_qty_p().qty(value);
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public void end_stk_qty(double value) {
		end_stk_qty_p().qty(value);
	}

	/**
	 * Beginning inventory amount 月初在庫金額.<p>
	 *
	 */
	public MCNumber ini_stk_amt() {
		return ini_stk_amt_p().amt();
	}

	/**
	 * Beginning inventory amount 月初在庫金額.<p>
	 *
	 */
	public void ini_stk_amt(MCNumber value) {
		ini_stk_amt_p().amt(value);
	}

	/**
	 * Beginning inventory amount 月初在庫金額.<p>
	 *
	 */
	public void ini_stk_amt(int value) {
		ini_stk_amt_p().amt(value);
	}

	/**
	 * Beginning inventory amount 月初在庫金額.<p>
	 *
	 */
	public void ini_stk_amt(long value) {
		ini_stk_amt_p().amt(value);
	}

	/**
	 * Beginning inventory amount 月初在庫金額.<p>
	 *
	 */
	public void ini_stk_amt(float value) {
		ini_stk_amt_p().amt(value);
	}

	/**
	 * Beginning inventory amount 月初在庫金額.<p>
	 *
	 */
	public void ini_stk_amt(double value) {
		ini_stk_amt_p().amt(value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public MCNumber gr_total_amt() {
		return gr_total_amt_p().amt();
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_amt(MCNumber value) {
		gr_total_amt_p().amt(value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_amt(int value) {
		gr_total_amt_p().amt(value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_amt(long value) {
		gr_total_amt_p().amt(value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_amt(float value) {
		gr_total_amt_p().amt(value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_amt(double value) {
		gr_total_amt_p().amt(value);
	}

	/**
	 * Receipt amount 入荷金額.<p>
	 *
	 */
	public MCNumber arr_amt() {
		return arr_amt_p().amt();
	}

	/**
	 * Receipt amount 入荷金額.<p>
	 *
	 */
	public void arr_amt(MCNumber value) {
		arr_amt_p().amt(value);
	}

	/**
	 * Receipt amount 入荷金額.<p>
	 *
	 */
	public void arr_amt(int value) {
		arr_amt_p().amt(value);
	}

	/**
	 * Receipt amount 入荷金額.<p>
	 *
	 */
	public void arr_amt(long value) {
		arr_amt_p().amt(value);
	}

	/**
	 * Receipt amount 入荷金額.<p>
	 *
	 */
	public void arr_amt(float value) {
		arr_amt_p().amt(value);
	}

	/**
	 * Receipt amount 入荷金額.<p>
	 *
	 */
	public void arr_amt(double value) {
		arr_amt_p().amt(value);
	}

	/**
	 * Purchase GR amount 仕入入庫金額.<p>
	 *
	 */
	public MCNumber purc_gr_amt() {
		return purc_gr_amt_p().amt();
	}

	/**
	 * Purchase GR amount 仕入入庫金額.<p>
	 *
	 */
	public void purc_gr_amt(MCNumber value) {
		purc_gr_amt_p().amt(value);
	}

	/**
	 * Purchase GR amount 仕入入庫金額.<p>
	 *
	 */
	public void purc_gr_amt(int value) {
		purc_gr_amt_p().amt(value);
	}

	/**
	 * Purchase GR amount 仕入入庫金額.<p>
	 *
	 */
	public void purc_gr_amt(long value) {
		purc_gr_amt_p().amt(value);
	}

	/**
	 * Purchase GR amount 仕入入庫金額.<p>
	 *
	 */
	public void purc_gr_amt(float value) {
		purc_gr_amt_p().amt(value);
	}

	/**
	 * Purchase GR amount 仕入入庫金額.<p>
	 *
	 */
	public void purc_gr_amt(double value) {
		purc_gr_amt_p().amt(value);
	}

	/**
	 * Receiving for a fee GR amount 有償受給入庫金額.<p>
	 *
	 */
	public MCNumber onr_rcv_gr_amt() {
		return onr_rcv_gr_amt_p().amt();
	}

	/**
	 * Receiving for a fee GR amount 有償受給入庫金額.<p>
	 *
	 */
	public void onr_rcv_gr_amt(MCNumber value) {
		onr_rcv_gr_amt_p().amt(value);
	}

	/**
	 * Receiving for a fee GR amount 有償受給入庫金額.<p>
	 *
	 */
	public void onr_rcv_gr_amt(int value) {
		onr_rcv_gr_amt_p().amt(value);
	}

	/**
	 * Receiving for a fee GR amount 有償受給入庫金額.<p>
	 *
	 */
	public void onr_rcv_gr_amt(long value) {
		onr_rcv_gr_amt_p().amt(value);
	}

	/**
	 * Receiving for a fee GR amount 有償受給入庫金額.<p>
	 *
	 */
	public void onr_rcv_gr_amt(float value) {
		onr_rcv_gr_amt_p().amt(value);
	}

	/**
	 * Receiving for a fee GR amount 有償受給入庫金額.<p>
	 *
	 */
	public void onr_rcv_gr_amt(double value) {
		onr_rcv_gr_amt_p().amt(value);
	}

	/**
	 * Purchase return GR amount 仕入返品入庫金額.<p>
	 *
	 */
	public MCNumber purc_rtn_gr_amt() {
		return purc_rtn_gr_amt_p().amt();
	}

	/**
	 * Purchase return GR amount 仕入返品入庫金額.<p>
	 *
	 */
	public void purc_rtn_gr_amt(MCNumber value) {
		purc_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Purchase return GR amount 仕入返品入庫金額.<p>
	 *
	 */
	public void purc_rtn_gr_amt(int value) {
		purc_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Purchase return GR amount 仕入返品入庫金額.<p>
	 *
	 */
	public void purc_rtn_gr_amt(long value) {
		purc_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Purchase return GR amount 仕入返品入庫金額.<p>
	 *
	 */
	public void purc_rtn_gr_amt(float value) {
		purc_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Purchase return GR amount 仕入返品入庫金額.<p>
	 *
	 */
	public void purc_rtn_gr_amt(double value) {
		purc_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Receiving for a fee return GR amount 有償受給返品入庫金額.<p>
	 *
	 */
	public MCNumber onr_rcv_ret_gr_amt() {
		return onr_rcv_ret_gr_amt_p().amt();
	}

	/**
	 * Receiving for a fee return GR amount 有償受給返品入庫金額.<p>
	 *
	 */
	public void onr_rcv_ret_gr_amt(MCNumber value) {
		onr_rcv_ret_gr_amt_p().amt(value);
	}

	/**
	 * Receiving for a fee return GR amount 有償受給返品入庫金額.<p>
	 *
	 */
	public void onr_rcv_ret_gr_amt(int value) {
		onr_rcv_ret_gr_amt_p().amt(value);
	}

	/**
	 * Receiving for a fee return GR amount 有償受給返品入庫金額.<p>
	 *
	 */
	public void onr_rcv_ret_gr_amt(long value) {
		onr_rcv_ret_gr_amt_p().amt(value);
	}

	/**
	 * Receiving for a fee return GR amount 有償受給返品入庫金額.<p>
	 *
	 */
	public void onr_rcv_ret_gr_amt(float value) {
		onr_rcv_ret_gr_amt_p().amt(value);
	}

	/**
	 * Receiving for a fee return GR amount 有償受給返品入庫金額.<p>
	 *
	 */
	public void onr_rcv_ret_gr_amt(double value) {
		onr_rcv_ret_gr_amt_p().amt(value);
	}

	/**
	 * Expense purchase GR amount 経費購買入庫金額.<p>
	 *
	 */
	public MCNumber xpns_purc_gr_amt() {
		return xpns_purc_gr_amt_p().amt();
	}

	/**
	 * Expense purchase GR amount 経費購買入庫金額.<p>
	 *
	 */
	public void xpns_purc_gr_amt(MCNumber value) {
		xpns_purc_gr_amt_p().amt(value);
	}

	/**
	 * Expense purchase GR amount 経費購買入庫金額.<p>
	 *
	 */
	public void xpns_purc_gr_amt(int value) {
		xpns_purc_gr_amt_p().amt(value);
	}

	/**
	 * Expense purchase GR amount 経費購買入庫金額.<p>
	 *
	 */
	public void xpns_purc_gr_amt(long value) {
		xpns_purc_gr_amt_p().amt(value);
	}

	/**
	 * Expense purchase GR amount 経費購買入庫金額.<p>
	 *
	 */
	public void xpns_purc_gr_amt(float value) {
		xpns_purc_gr_amt_p().amt(value);
	}

	/**
	 * Expense purchase GR amount 経費購買入庫金額.<p>
	 *
	 */
	public void xpns_purc_gr_amt(double value) {
		xpns_purc_gr_amt_p().amt(value);
	}

	/**
	 * Expense purchase return GR amount 経費購買返品入庫金額.<p>
	 *
	 */
	public MCNumber xpns_purc_rtn_gr_amt() {
		return xpns_purc_rtn_gr_amt_p().amt();
	}

	/**
	 * Expense purchase return GR amount 経費購買返品入庫金額.<p>
	 *
	 */
	public void xpns_purc_rtn_gr_amt(MCNumber value) {
		xpns_purc_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Expense purchase return GR amount 経費購買返品入庫金額.<p>
	 *
	 */
	public void xpns_purc_rtn_gr_amt(int value) {
		xpns_purc_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Expense purchase return GR amount 経費購買返品入庫金額.<p>
	 *
	 */
	public void xpns_purc_rtn_gr_amt(long value) {
		xpns_purc_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Expense purchase return GR amount 経費購買返品入庫金額.<p>
	 *
	 */
	public void xpns_purc_rtn_gr_amt(float value) {
		xpns_purc_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Expense purchase return GR amount 経費購買返品入庫金額.<p>
	 *
	 */
	public void xpns_purc_rtn_gr_amt(double value) {
		xpns_purc_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public MCNumber accpt_dfct_gr_amt() {
		return accpt_dfct_gr_amt_p().amt();
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public void accpt_dfct_gr_amt(MCNumber value) {
		accpt_dfct_gr_amt_p().amt(value);
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public void accpt_dfct_gr_amt(int value) {
		accpt_dfct_gr_amt_p().amt(value);
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public void accpt_dfct_gr_amt(long value) {
		accpt_dfct_gr_amt_p().amt(value);
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public void accpt_dfct_gr_amt(float value) {
		accpt_dfct_gr_amt_p().amt(value);
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public void accpt_dfct_gr_amt(double value) {
		accpt_dfct_gr_amt_p().amt(value);
	}

	/**
	 * Mfg. amount 製造金額.<p>
	 *
	 */
	public MCNumber mfg_amt() {
		return mfg_amt_p().amt();
	}

	/**
	 * Mfg. amount 製造金額.<p>
	 *
	 */
	public void mfg_amt(MCNumber value) {
		mfg_amt_p().amt(value);
	}

	/**
	 * Mfg. amount 製造金額.<p>
	 *
	 */
	public void mfg_amt(int value) {
		mfg_amt_p().amt(value);
	}

	/**
	 * Mfg. amount 製造金額.<p>
	 *
	 */
	public void mfg_amt(long value) {
		mfg_amt_p().amt(value);
	}

	/**
	 * Mfg. amount 製造金額.<p>
	 *
	 */
	public void mfg_amt(float value) {
		mfg_amt_p().amt(value);
	}

	/**
	 * Mfg. amount 製造金額.<p>
	 *
	 */
	public void mfg_amt(double value) {
		mfg_amt_p().amt(value);
	}

	/**
	 * By-product mfg. amount 副産品製造金額.<p>
	 *
	 */
	public MCNumber bymfg_amt() {
		return bymfg_amt_p().amt();
	}

	/**
	 * By-product mfg. amount 副産品製造金額.<p>
	 *
	 */
	public void bymfg_amt(MCNumber value) {
		bymfg_amt_p().amt(value);
	}

	/**
	 * By-product mfg. amount 副産品製造金額.<p>
	 *
	 */
	public void bymfg_amt(int value) {
		bymfg_amt_p().amt(value);
	}

	/**
	 * By-product mfg. amount 副産品製造金額.<p>
	 *
	 */
	public void bymfg_amt(long value) {
		bymfg_amt_p().amt(value);
	}

	/**
	 * By-product mfg. amount 副産品製造金額.<p>
	 *
	 */
	public void bymfg_amt(float value) {
		bymfg_amt_p().amt(value);
	}

	/**
	 * By-product mfg. amount 副産品製造金額.<p>
	 *
	 */
	public void bymfg_amt(double value) {
		bymfg_amt_p().amt(value);
	}

	/**
	 * GR amount (Non-chargeable supply) 無償支給入庫金額.<p>
	 *
	 */
	public MCNumber ffr_prov_gr_amt() {
		return ffr_prov_gr_amt_p().amt();
	}

	/**
	 * GR amount (Non-chargeable supply) 無償支給入庫金額.<p>
	 *
	 */
	public void ffr_prov_gr_amt(MCNumber value) {
		ffr_prov_gr_amt_p().amt(value);
	}

	/**
	 * GR amount (Non-chargeable supply) 無償支給入庫金額.<p>
	 *
	 */
	public void ffr_prov_gr_amt(int value) {
		ffr_prov_gr_amt_p().amt(value);
	}

	/**
	 * GR amount (Non-chargeable supply) 無償支給入庫金額.<p>
	 *
	 */
	public void ffr_prov_gr_amt(long value) {
		ffr_prov_gr_amt_p().amt(value);
	}

	/**
	 * GR amount (Non-chargeable supply) 無償支給入庫金額.<p>
	 *
	 */
	public void ffr_prov_gr_amt(float value) {
		ffr_prov_gr_amt_p().amt(value);
	}

	/**
	 * GR amount (Non-chargeable supply) 無償支給入庫金額.<p>
	 *
	 */
	public void ffr_prov_gr_amt(double value) {
		ffr_prov_gr_amt_p().amt(value);
	}

	/**
	 * Chargeable supply GR amount 有償支給入庫金額.<p>
	 *
	 */
	public MCNumber onr_prov_gr_amt() {
		return onr_prov_gr_amt_p().amt();
	}

	/**
	 * Chargeable supply GR amount 有償支給入庫金額.<p>
	 *
	 */
	public void onr_prov_gr_amt(MCNumber value) {
		onr_prov_gr_amt_p().amt(value);
	}

	/**
	 * Chargeable supply GR amount 有償支給入庫金額.<p>
	 *
	 */
	public void onr_prov_gr_amt(int value) {
		onr_prov_gr_amt_p().amt(value);
	}

	/**
	 * Chargeable supply GR amount 有償支給入庫金額.<p>
	 *
	 */
	public void onr_prov_gr_amt(long value) {
		onr_prov_gr_amt_p().amt(value);
	}

	/**
	 * Chargeable supply GR amount 有償支給入庫金額.<p>
	 *
	 */
	public void onr_prov_gr_amt(float value) {
		onr_prov_gr_amt_p().amt(value);
	}

	/**
	 * Chargeable supply GR amount 有償支給入庫金額.<p>
	 *
	 */
	public void onr_prov_gr_amt(double value) {
		onr_prov_gr_amt_p().amt(value);
	}

	/**
	 * Non-chargeable supply return GR amount 無償支給返品入庫金額.<p>
	 *
	 */
	public MCNumber ffr_prov_rtn_gr_amt() {
		return ffr_prov_rtn_gr_amt_p().amt();
	}

	/**
	 * Non-chargeable supply return GR amount 無償支給返品入庫金額.<p>
	 *
	 */
	public void ffr_prov_rtn_gr_amt(MCNumber value) {
		ffr_prov_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Non-chargeable supply return GR amount 無償支給返品入庫金額.<p>
	 *
	 */
	public void ffr_prov_rtn_gr_amt(int value) {
		ffr_prov_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Non-chargeable supply return GR amount 無償支給返品入庫金額.<p>
	 *
	 */
	public void ffr_prov_rtn_gr_amt(long value) {
		ffr_prov_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Non-chargeable supply return GR amount 無償支給返品入庫金額.<p>
	 *
	 */
	public void ffr_prov_rtn_gr_amt(float value) {
		ffr_prov_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Non-chargeable supply return GR amount 無償支給返品入庫金額.<p>
	 *
	 */
	public void ffr_prov_rtn_gr_amt(double value) {
		ffr_prov_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Chargeable supply return GR amount 有償支給返品入庫金額.<p>
	 *
	 */
	public MCNumber onr_prov_rtn_gr_amt() {
		return onr_prov_rtn_gr_amt_p().amt();
	}

	/**
	 * Chargeable supply return GR amount 有償支給返品入庫金額.<p>
	 *
	 */
	public void onr_prov_rtn_gr_amt(MCNumber value) {
		onr_prov_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Chargeable supply return GR amount 有償支給返品入庫金額.<p>
	 *
	 */
	public void onr_prov_rtn_gr_amt(int value) {
		onr_prov_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Chargeable supply return GR amount 有償支給返品入庫金額.<p>
	 *
	 */
	public void onr_prov_rtn_gr_amt(long value) {
		onr_prov_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Chargeable supply return GR amount 有償支給返品入庫金額.<p>
	 *
	 */
	public void onr_prov_rtn_gr_amt(float value) {
		onr_prov_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Chargeable supply return GR amount 有償支給返品入庫金額.<p>
	 *
	 */
	public void onr_prov_rtn_gr_amt(double value) {
		onr_prov_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Inspection GR amount 検査入庫金額.<p>
	 *
	 */
	public MCNumber insp_gr_amt() {
		return insp_gr_amt_p().amt();
	}

	/**
	 * Inspection GR amount 検査入庫金額.<p>
	 *
	 */
	public void insp_gr_amt(MCNumber value) {
		insp_gr_amt_p().amt(value);
	}

	/**
	 * Inspection GR amount 検査入庫金額.<p>
	 *
	 */
	public void insp_gr_amt(int value) {
		insp_gr_amt_p().amt(value);
	}

	/**
	 * Inspection GR amount 検査入庫金額.<p>
	 *
	 */
	public void insp_gr_amt(long value) {
		insp_gr_amt_p().amt(value);
	}

	/**
	 * Inspection GR amount 検査入庫金額.<p>
	 *
	 */
	public void insp_gr_amt(float value) {
		insp_gr_amt_p().amt(value);
	}

	/**
	 * Inspection GR amount 検査入庫金額.<p>
	 *
	 */
	public void insp_gr_amt(double value) {
		insp_gr_amt_p().amt(value);
	}

	/**
	 * Inspection completed GR amount 検査完了入庫金額.<p>
	 *
	 */
	public MCNumber insp_cmpl_gr_amt() {
		return insp_cmpl_gr_amt_p().amt();
	}

	/**
	 * Inspection completed GR amount 検査完了入庫金額.<p>
	 *
	 */
	public void insp_cmpl_gr_amt(MCNumber value) {
		insp_cmpl_gr_amt_p().amt(value);
	}

	/**
	 * Inspection completed GR amount 検査完了入庫金額.<p>
	 *
	 */
	public void insp_cmpl_gr_amt(int value) {
		insp_cmpl_gr_amt_p().amt(value);
	}

	/**
	 * Inspection completed GR amount 検査完了入庫金額.<p>
	 *
	 */
	public void insp_cmpl_gr_amt(long value) {
		insp_cmpl_gr_amt_p().amt(value);
	}

	/**
	 * Inspection completed GR amount 検査完了入庫金額.<p>
	 *
	 */
	public void insp_cmpl_gr_amt(float value) {
		insp_cmpl_gr_amt_p().amt(value);
	}

	/**
	 * Inspection completed GR amount 検査完了入庫金額.<p>
	 *
	 */
	public void insp_cmpl_gr_amt(double value) {
		insp_cmpl_gr_amt_p().amt(value);
	}

	/**
	 * Inspection decision GR amount 検査判定入庫金額.<p>
	 *
	 */
	public MCNumber insp_judg_gr_amt() {
		return insp_judg_gr_amt_p().amt();
	}

	/**
	 * Inspection decision GR amount 検査判定入庫金額.<p>
	 *
	 */
	public void insp_judg_gr_amt(MCNumber value) {
		insp_judg_gr_amt_p().amt(value);
	}

	/**
	 * Inspection decision GR amount 検査判定入庫金額.<p>
	 *
	 */
	public void insp_judg_gr_amt(int value) {
		insp_judg_gr_amt_p().amt(value);
	}

	/**
	 * Inspection decision GR amount 検査判定入庫金額.<p>
	 *
	 */
	public void insp_judg_gr_amt(long value) {
		insp_judg_gr_amt_p().amt(value);
	}

	/**
	 * Inspection decision GR amount 検査判定入庫金額.<p>
	 *
	 */
	public void insp_judg_gr_amt(float value) {
		insp_judg_gr_amt_p().amt(value);
	}

	/**
	 * Inspection decision GR amount 検査判定入庫金額.<p>
	 *
	 */
	public void insp_judg_gr_amt(double value) {
		insp_judg_gr_amt_p().amt(value);
	}

	/**
	 * Re-inspection GR amount 再検査入庫金額.<p>
	 *
	 */
	public MCNumber reinsp_gr_amt() {
		return reinsp_gr_amt_p().amt();
	}

	/**
	 * Re-inspection GR amount 再検査入庫金額.<p>
	 *
	 */
	public void reinsp_gr_amt(MCNumber value) {
		reinsp_gr_amt_p().amt(value);
	}

	/**
	 * Re-inspection GR amount 再検査入庫金額.<p>
	 *
	 */
	public void reinsp_gr_amt(int value) {
		reinsp_gr_amt_p().amt(value);
	}

	/**
	 * Re-inspection GR amount 再検査入庫金額.<p>
	 *
	 */
	public void reinsp_gr_amt(long value) {
		reinsp_gr_amt_p().amt(value);
	}

	/**
	 * Re-inspection GR amount 再検査入庫金額.<p>
	 *
	 */
	public void reinsp_gr_amt(float value) {
		reinsp_gr_amt_p().amt(value);
	}

	/**
	 * Re-inspection GR amount 再検査入庫金額.<p>
	 *
	 */
	public void reinsp_gr_amt(double value) {
		reinsp_gr_amt_p().amt(value);
	}

	/**
	 * Inventory count variance amount (GR) 棚卸差異増耗金額.<p>
	 *
	 */
	public MCNumber stk_adjst_gr_amt() {
		return stk_adjst_gr_amt_p().amt();
	}

	/**
	 * Inventory count variance amount (GR) 棚卸差異増耗金額.<p>
	 *
	 */
	public void stk_adjst_gr_amt(MCNumber value) {
		stk_adjst_gr_amt_p().amt(value);
	}

	/**
	 * Inventory count variance amount (GR) 棚卸差異増耗金額.<p>
	 *
	 */
	public void stk_adjst_gr_amt(int value) {
		stk_adjst_gr_amt_p().amt(value);
	}

	/**
	 * Inventory count variance amount (GR) 棚卸差異増耗金額.<p>
	 *
	 */
	public void stk_adjst_gr_amt(long value) {
		stk_adjst_gr_amt_p().amt(value);
	}

	/**
	 * Inventory count variance amount (GR) 棚卸差異増耗金額.<p>
	 *
	 */
	public void stk_adjst_gr_amt(float value) {
		stk_adjst_gr_amt_p().amt(value);
	}

	/**
	 * Inventory count variance amount (GR) 棚卸差異増耗金額.<p>
	 *
	 */
	public void stk_adjst_gr_amt(double value) {
		stk_adjst_gr_amt_p().amt(value);
	}

	/**
	 * Warehousing GR amount 倉入入庫金額.<p>
	 *
	 */
	public MCNumber prdct_wh_gr_amt() {
		return prdct_wh_gr_amt_p().amt();
	}

	/**
	 * Warehousing GR amount 倉入入庫金額.<p>
	 *
	 */
	public void prdct_wh_gr_amt(MCNumber value) {
		prdct_wh_gr_amt_p().amt(value);
	}

	/**
	 * Warehousing GR amount 倉入入庫金額.<p>
	 *
	 */
	public void prdct_wh_gr_amt(int value) {
		prdct_wh_gr_amt_p().amt(value);
	}

	/**
	 * Warehousing GR amount 倉入入庫金額.<p>
	 *
	 */
	public void prdct_wh_gr_amt(long value) {
		prdct_wh_gr_amt_p().amt(value);
	}

	/**
	 * Warehousing GR amount 倉入入庫金額.<p>
	 *
	 */
	public void prdct_wh_gr_amt(float value) {
		prdct_wh_gr_amt_p().amt(value);
	}

	/**
	 * Warehousing GR amount 倉入入庫金額.<p>
	 *
	 */
	public void prdct_wh_gr_amt(double value) {
		prdct_wh_gr_amt_p().amt(value);
	}

	/**
	 * GR returning amount 戻入入庫金額.<p>
	 *
	 */
	public MCNumber prdct_wh_rtn_gr_amt() {
		return prdct_wh_rtn_gr_amt_p().amt();
	}

	/**
	 * GR returning amount 戻入入庫金額.<p>
	 *
	 */
	public void prdct_wh_rtn_gr_amt(MCNumber value) {
		prdct_wh_rtn_gr_amt_p().amt(value);
	}

	/**
	 * GR returning amount 戻入入庫金額.<p>
	 *
	 */
	public void prdct_wh_rtn_gr_amt(int value) {
		prdct_wh_rtn_gr_amt_p().amt(value);
	}

	/**
	 * GR returning amount 戻入入庫金額.<p>
	 *
	 */
	public void prdct_wh_rtn_gr_amt(long value) {
		prdct_wh_rtn_gr_amt_p().amt(value);
	}

	/**
	 * GR returning amount 戻入入庫金額.<p>
	 *
	 */
	public void prdct_wh_rtn_gr_amt(float value) {
		prdct_wh_rtn_gr_amt_p().amt(value);
	}

	/**
	 * GR returning amount 戻入入庫金額.<p>
	 *
	 */
	public void prdct_wh_rtn_gr_amt(double value) {
		prdct_wh_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public MCNumber xfr_gr_amt() {
		return xfr_gr_amt_p().amt();
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public void xfr_gr_amt(MCNumber value) {
		xfr_gr_amt_p().amt(value);
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public void xfr_gr_amt(int value) {
		xfr_gr_amt_p().amt(value);
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public void xfr_gr_amt(long value) {
		xfr_gr_amt_p().amt(value);
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public void xfr_gr_amt(float value) {
		xfr_gr_amt_p().amt(value);
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public void xfr_gr_amt(double value) {
		xfr_gr_amt_p().amt(value);
	}

	/**
	 * Move-in amount 転入金額.<p>
	 *
	 */
	public MCNumber xfr_in_amt() {
		return xfr_in_amt_p().amt();
	}

	/**
	 * Move-in amount 転入金額.<p>
	 *
	 */
	public void xfr_in_amt(MCNumber value) {
		xfr_in_amt_p().amt(value);
	}

	/**
	 * Move-in amount 転入金額.<p>
	 *
	 */
	public void xfr_in_amt(int value) {
		xfr_in_amt_p().amt(value);
	}

	/**
	 * Move-in amount 転入金額.<p>
	 *
	 */
	public void xfr_in_amt(long value) {
		xfr_in_amt_p().amt(value);
	}

	/**
	 * Move-in amount 転入金額.<p>
	 *
	 */
	public void xfr_in_amt(float value) {
		xfr_in_amt_p().amt(value);
	}

	/**
	 * Move-in amount 転入金額.<p>
	 *
	 */
	public void xfr_in_amt(double value) {
		xfr_in_amt_p().amt(value);
	}

	/**
	 * Amount of purchase without receipt 仕入転入金額.<p>
	 *
	 */
	public MCNumber purc_xfr_in_amt() {
		return purc_xfr_in_amt_p().amt();
	}

	/**
	 * Amount of purchase without receipt 仕入転入金額.<p>
	 *
	 */
	public void purc_xfr_in_amt(MCNumber value) {
		purc_xfr_in_amt_p().amt(value);
	}

	/**
	 * Amount of purchase without receipt 仕入転入金額.<p>
	 *
	 */
	public void purc_xfr_in_amt(int value) {
		purc_xfr_in_amt_p().amt(value);
	}

	/**
	 * Amount of purchase without receipt 仕入転入金額.<p>
	 *
	 */
	public void purc_xfr_in_amt(long value) {
		purc_xfr_in_amt_p().amt(value);
	}

	/**
	 * Amount of purchase without receipt 仕入転入金額.<p>
	 *
	 */
	public void purc_xfr_in_amt(float value) {
		purc_xfr_in_amt_p().amt(value);
	}

	/**
	 * Amount of purchase without receipt 仕入転入金額.<p>
	 *
	 */
	public void purc_xfr_in_amt(double value) {
		purc_xfr_in_amt_p().amt(value);
	}

	/**
	 * Movement/transport return GR amount 移動・移送返品入庫金額.<p>
	 *
	 */
	public MCNumber xfr_rtn_gr_amt() {
		return xfr_rtn_gr_amt_p().amt();
	}

	/**
	 * Movement/transport return GR amount 移動・移送返品入庫金額.<p>
	 *
	 */
	public void xfr_rtn_gr_amt(MCNumber value) {
		xfr_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Movement/transport return GR amount 移動・移送返品入庫金額.<p>
	 *
	 */
	public void xfr_rtn_gr_amt(int value) {
		xfr_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Movement/transport return GR amount 移動・移送返品入庫金額.<p>
	 *
	 */
	public void xfr_rtn_gr_amt(long value) {
		xfr_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Movement/transport return GR amount 移動・移送返品入庫金額.<p>
	 *
	 */
	public void xfr_rtn_gr_amt(float value) {
		xfr_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Movement/transport return GR amount 移動・移送返品入庫金額.<p>
	 *
	 */
	public void xfr_rtn_gr_amt(double value) {
		xfr_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public MCNumber acxfr_gr_amt() {
		return acxfr_gr_amt_p().amt();
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public void acxfr_gr_amt(MCNumber value) {
		acxfr_gr_amt_p().amt(value);
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public void acxfr_gr_amt(int value) {
		acxfr_gr_amt_p().amt(value);
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public void acxfr_gr_amt(long value) {
		acxfr_gr_amt_p().amt(value);
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public void acxfr_gr_amt(float value) {
		acxfr_gr_amt_p().amt(value);
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public void acxfr_gr_amt(double value) {
		acxfr_gr_amt_p().amt(value);
	}

	/**
	 * Customer inventory GR amount 預り入庫金額.<p>
	 *
	 */
	public MCNumber arr_cststk_amt() {
		return arr_cststk_amt_p().amt();
	}

	/**
	 * Customer inventory GR amount 預り入庫金額.<p>
	 *
	 */
	public void arr_cststk_amt(MCNumber value) {
		arr_cststk_amt_p().amt(value);
	}

	/**
	 * Customer inventory GR amount 預り入庫金額.<p>
	 *
	 */
	public void arr_cststk_amt(int value) {
		arr_cststk_amt_p().amt(value);
	}

	/**
	 * Customer inventory GR amount 預り入庫金額.<p>
	 *
	 */
	public void arr_cststk_amt(long value) {
		arr_cststk_amt_p().amt(value);
	}

	/**
	 * Customer inventory GR amount 預り入庫金額.<p>
	 *
	 */
	public void arr_cststk_amt(float value) {
		arr_cststk_amt_p().amt(value);
	}

	/**
	 * Customer inventory GR amount 預り入庫金額.<p>
	 *
	 */
	public void arr_cststk_amt(double value) {
		arr_cststk_amt_p().amt(value);
	}

	/**
	 * Item transfer GR amount 品目振替入庫金額.<p>
	 *
	 */
	public MCNumber xfr_itm_gr_amt() {
		return xfr_itm_gr_amt_p().amt();
	}

	/**
	 * Item transfer GR amount 品目振替入庫金額.<p>
	 *
	 */
	public void xfr_itm_gr_amt(MCNumber value) {
		xfr_itm_gr_amt_p().amt(value);
	}

	/**
	 * Item transfer GR amount 品目振替入庫金額.<p>
	 *
	 */
	public void xfr_itm_gr_amt(int value) {
		xfr_itm_gr_amt_p().amt(value);
	}

	/**
	 * Item transfer GR amount 品目振替入庫金額.<p>
	 *
	 */
	public void xfr_itm_gr_amt(long value) {
		xfr_itm_gr_amt_p().amt(value);
	}

	/**
	 * Item transfer GR amount 品目振替入庫金額.<p>
	 *
	 */
	public void xfr_itm_gr_amt(float value) {
		xfr_itm_gr_amt_p().amt(value);
	}

	/**
	 * Item transfer GR amount 品目振替入庫金額.<p>
	 *
	 */
	public void xfr_itm_gr_amt(double value) {
		xfr_itm_gr_amt_p().amt(value);
	}

	/**
	 * Lot/SEIBAN No. transfer GR amount ロット・手配ＮＯ振替入庫金額.<p>
	 *
	 */
	public MCNumber xfr_lot_sno_gr_amt() {
		return xfr_lot_sno_gr_amt_p().amt();
	}

	/**
	 * Lot/SEIBAN No. transfer GR amount ロット・手配ＮＯ振替入庫金額.<p>
	 *
	 */
	public void xfr_lot_sno_gr_amt(MCNumber value) {
		xfr_lot_sno_gr_amt_p().amt(value);
	}

	/**
	 * Lot/SEIBAN No. transfer GR amount ロット・手配ＮＯ振替入庫金額.<p>
	 *
	 */
	public void xfr_lot_sno_gr_amt(int value) {
		xfr_lot_sno_gr_amt_p().amt(value);
	}

	/**
	 * Lot/SEIBAN No. transfer GR amount ロット・手配ＮＯ振替入庫金額.<p>
	 *
	 */
	public void xfr_lot_sno_gr_amt(long value) {
		xfr_lot_sno_gr_amt_p().amt(value);
	}

	/**
	 * Lot/SEIBAN No. transfer GR amount ロット・手配ＮＯ振替入庫金額.<p>
	 *
	 */
	public void xfr_lot_sno_gr_amt(float value) {
		xfr_lot_sno_gr_amt_p().amt(value);
	}

	/**
	 * Lot/SEIBAN No. transfer GR amount ロット・手配ＮＯ振替入庫金額.<p>
	 *
	 */
	public void xfr_lot_sno_gr_amt(double value) {
		xfr_lot_sno_gr_amt_p().amt(value);
	}

	/**
	 * GR amount (Grading/conforming type transfer) 格付・良品区分振替入庫金額.<p>
	 *
	 */
	public MCNumber xfr_grd_gr_amt() {
		return xfr_grd_gr_amt_p().amt();
	}

	/**
	 * GR amount (Grading/conforming type transfer) 格付・良品区分振替入庫金額.<p>
	 *
	 */
	public void xfr_grd_gr_amt(MCNumber value) {
		xfr_grd_gr_amt_p().amt(value);
	}

	/**
	 * GR amount (Grading/conforming type transfer) 格付・良品区分振替入庫金額.<p>
	 *
	 */
	public void xfr_grd_gr_amt(int value) {
		xfr_grd_gr_amt_p().amt(value);
	}

	/**
	 * GR amount (Grading/conforming type transfer) 格付・良品区分振替入庫金額.<p>
	 *
	 */
	public void xfr_grd_gr_amt(long value) {
		xfr_grd_gr_amt_p().amt(value);
	}

	/**
	 * GR amount (Grading/conforming type transfer) 格付・良品区分振替入庫金額.<p>
	 *
	 */
	public void xfr_grd_gr_amt(float value) {
		xfr_grd_gr_amt_p().amt(value);
	}

	/**
	 * GR amount (Grading/conforming type transfer) 格付・良品区分振替入庫金額.<p>
	 *
	 */
	public void xfr_grd_gr_amt(double value) {
		xfr_grd_gr_amt_p().amt(value);
	}

	/**
	 * SKU transfer GR amount 荷姿振替入庫金額.<p>
	 *
	 */
	public MCNumber xfr_pack_gr_amt() {
		return xfr_pack_gr_amt_p().amt();
	}

	/**
	 * SKU transfer GR amount 荷姿振替入庫金額.<p>
	 *
	 */
	public void xfr_pack_gr_amt(MCNumber value) {
		xfr_pack_gr_amt_p().amt(value);
	}

	/**
	 * SKU transfer GR amount 荷姿振替入庫金額.<p>
	 *
	 */
	public void xfr_pack_gr_amt(int value) {
		xfr_pack_gr_amt_p().amt(value);
	}

	/**
	 * SKU transfer GR amount 荷姿振替入庫金額.<p>
	 *
	 */
	public void xfr_pack_gr_amt(long value) {
		xfr_pack_gr_amt_p().amt(value);
	}

	/**
	 * SKU transfer GR amount 荷姿振替入庫金額.<p>
	 *
	 */
	public void xfr_pack_gr_amt(float value) {
		xfr_pack_gr_amt_p().amt(value);
	}

	/**
	 * SKU transfer GR amount 荷姿振替入庫金額.<p>
	 *
	 */
	public void xfr_pack_gr_amt(double value) {
		xfr_pack_gr_amt_p().amt(value);
	}

	/**
	 * Arrival amount 着荷金額.<p>
	 *
	 */
	public MCNumber ship_in_amt() {
		return ship_in_amt_p().amt();
	}

	/**
	 * Arrival amount 着荷金額.<p>
	 *
	 */
	public void ship_in_amt(MCNumber value) {
		ship_in_amt_p().amt(value);
	}

	/**
	 * Arrival amount 着荷金額.<p>
	 *
	 */
	public void ship_in_amt(int value) {
		ship_in_amt_p().amt(value);
	}

	/**
	 * Arrival amount 着荷金額.<p>
	 *
	 */
	public void ship_in_amt(long value) {
		ship_in_amt_p().amt(value);
	}

	/**
	 * Arrival amount 着荷金額.<p>
	 *
	 */
	public void ship_in_amt(float value) {
		ship_in_amt_p().amt(value);
	}

	/**
	 * Arrival amount 着荷金額.<p>
	 *
	 */
	public void ship_in_amt(double value) {
		ship_in_amt_p().amt(value);
	}

	/**
	 * Export arrival amount 輸出着荷金額.<p>
	 *
	 */
	public MCNumber ex_ship_in_amt() {
		return ex_ship_in_amt_p().amt();
	}

	/**
	 * Export arrival amount 輸出着荷金額.<p>
	 *
	 */
	public void ex_ship_in_amt(MCNumber value) {
		ex_ship_in_amt_p().amt(value);
	}

	/**
	 * Export arrival amount 輸出着荷金額.<p>
	 *
	 */
	public void ex_ship_in_amt(int value) {
		ex_ship_in_amt_p().amt(value);
	}

	/**
	 * Export arrival amount 輸出着荷金額.<p>
	 *
	 */
	public void ex_ship_in_amt(long value) {
		ex_ship_in_amt_p().amt(value);
	}

	/**
	 * Export arrival amount 輸出着荷金額.<p>
	 *
	 */
	public void ex_ship_in_amt(float value) {
		ex_ship_in_amt_p().amt(value);
	}

	/**
	 * Export arrival amount 輸出着荷金額.<p>
	 *
	 */
	public void ex_ship_in_amt(double value) {
		ex_ship_in_amt_p().amt(value);
	}

	/**
	 * Shipping return GR amount 出荷返品入庫金額.<p>
	 *
	 */
	public MCNumber ship_rtn_gr_amt() {
		return ship_rtn_gr_amt_p().amt();
	}

	/**
	 * Shipping return GR amount 出荷返品入庫金額.<p>
	 *
	 */
	public void ship_rtn_gr_amt(MCNumber value) {
		ship_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Shipping return GR amount 出荷返品入庫金額.<p>
	 *
	 */
	public void ship_rtn_gr_amt(int value) {
		ship_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Shipping return GR amount 出荷返品入庫金額.<p>
	 *
	 */
	public void ship_rtn_gr_amt(long value) {
		ship_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Shipping return GR amount 出荷返品入庫金額.<p>
	 *
	 */
	public void ship_rtn_gr_amt(float value) {
		ship_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Shipping return GR amount 出荷返品入庫金額.<p>
	 *
	 */
	public void ship_rtn_gr_amt(double value) {
		ship_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Sales return GR amount 売上返品入庫金額.<p>
	 *
	 */
	public MCNumber sls_rtn_gr_amt() {
		return sls_rtn_gr_amt_p().amt();
	}

	/**
	 * Sales return GR amount 売上返品入庫金額.<p>
	 *
	 */
	public void sls_rtn_gr_amt(MCNumber value) {
		sls_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Sales return GR amount 売上返品入庫金額.<p>
	 *
	 */
	public void sls_rtn_gr_amt(int value) {
		sls_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Sales return GR amount 売上返品入庫金額.<p>
	 *
	 */
	public void sls_rtn_gr_amt(long value) {
		sls_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Sales return GR amount 売上返品入庫金額.<p>
	 *
	 */
	public void sls_rtn_gr_amt(float value) {
		sls_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Sales return GR amount 売上返品入庫金額.<p>
	 *
	 */
	public void sls_rtn_gr_amt(double value) {
		sls_rtn_gr_amt_p().amt(value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public MCNumber gi_total_amt() {
		return gi_total_amt_p().amt();
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_amt(MCNumber value) {
		gi_total_amt_p().amt(value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_amt(int value) {
		gi_total_amt_p().amt(value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_amt(long value) {
		gi_total_amt_p().amt(value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_amt(float value) {
		gi_total_amt_p().amt(value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_amt(double value) {
		gi_total_amt_p().amt(value);
	}

	/**
	 * Receipt return amount 入荷返品金額.<p>
	 *
	 */
	public MCNumber arr_rtn_amt() {
		return arr_rtn_amt_p().amt();
	}

	/**
	 * Receipt return amount 入荷返品金額.<p>
	 *
	 */
	public void arr_rtn_amt(MCNumber value) {
		arr_rtn_amt_p().amt(value);
	}

	/**
	 * Receipt return amount 入荷返品金額.<p>
	 *
	 */
	public void arr_rtn_amt(int value) {
		arr_rtn_amt_p().amt(value);
	}

	/**
	 * Receipt return amount 入荷返品金額.<p>
	 *
	 */
	public void arr_rtn_amt(long value) {
		arr_rtn_amt_p().amt(value);
	}

	/**
	 * Receipt return amount 入荷返品金額.<p>
	 *
	 */
	public void arr_rtn_amt(float value) {
		arr_rtn_amt_p().amt(value);
	}

	/**
	 * Receipt return amount 入荷返品金額.<p>
	 *
	 */
	public void arr_rtn_amt(double value) {
		arr_rtn_amt_p().amt(value);
	}

	/**
	 * Purchase GI amount 仕入出庫金額.<p>
	 *
	 */
	public MCNumber purc_gi_amt() {
		return purc_gi_amt_p().amt();
	}

	/**
	 * Purchase GI amount 仕入出庫金額.<p>
	 *
	 */
	public void purc_gi_amt(MCNumber value) {
		purc_gi_amt_p().amt(value);
	}

	/**
	 * Purchase GI amount 仕入出庫金額.<p>
	 *
	 */
	public void purc_gi_amt(int value) {
		purc_gi_amt_p().amt(value);
	}

	/**
	 * Purchase GI amount 仕入出庫金額.<p>
	 *
	 */
	public void purc_gi_amt(long value) {
		purc_gi_amt_p().amt(value);
	}

	/**
	 * Purchase GI amount 仕入出庫金額.<p>
	 *
	 */
	public void purc_gi_amt(float value) {
		purc_gi_amt_p().amt(value);
	}

	/**
	 * Purchase GI amount 仕入出庫金額.<p>
	 *
	 */
	public void purc_gi_amt(double value) {
		purc_gi_amt_p().amt(value);
	}

	/**
	 * Receiving for a fee GI amount 有償受給出庫金額.<p>
	 *
	 */
	public MCNumber onr_rcv_gi_amt() {
		return onr_rcv_gi_amt_p().amt();
	}

	/**
	 * Receiving for a fee GI amount 有償受給出庫金額.<p>
	 *
	 */
	public void onr_rcv_gi_amt(MCNumber value) {
		onr_rcv_gi_amt_p().amt(value);
	}

	/**
	 * Receiving for a fee GI amount 有償受給出庫金額.<p>
	 *
	 */
	public void onr_rcv_gi_amt(int value) {
		onr_rcv_gi_amt_p().amt(value);
	}

	/**
	 * Receiving for a fee GI amount 有償受給出庫金額.<p>
	 *
	 */
	public void onr_rcv_gi_amt(long value) {
		onr_rcv_gi_amt_p().amt(value);
	}

	/**
	 * Receiving for a fee GI amount 有償受給出庫金額.<p>
	 *
	 */
	public void onr_rcv_gi_amt(float value) {
		onr_rcv_gi_amt_p().amt(value);
	}

	/**
	 * Receiving for a fee GI amount 有償受給出庫金額.<p>
	 *
	 */
	public void onr_rcv_gi_amt(double value) {
		onr_rcv_gi_amt_p().amt(value);
	}

	/**
	 * Purchase return GI amount 仕入返品出庫金額.<p>
	 *
	 */
	public MCNumber purc_rtn_gi_amt() {
		return purc_rtn_gi_amt_p().amt();
	}

	/**
	 * Purchase return GI amount 仕入返品出庫金額.<p>
	 *
	 */
	public void purc_rtn_gi_amt(MCNumber value) {
		purc_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Purchase return GI amount 仕入返品出庫金額.<p>
	 *
	 */
	public void purc_rtn_gi_amt(int value) {
		purc_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Purchase return GI amount 仕入返品出庫金額.<p>
	 *
	 */
	public void purc_rtn_gi_amt(long value) {
		purc_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Purchase return GI amount 仕入返品出庫金額.<p>
	 *
	 */
	public void purc_rtn_gi_amt(float value) {
		purc_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Purchase return GI amount 仕入返品出庫金額.<p>
	 *
	 */
	public void purc_rtn_gi_amt(double value) {
		purc_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Receiving for a fee return GI amount 有償受給返品出庫金額.<p>
	 *
	 */
	public MCNumber onr_rcv_ret_gi_amt() {
		return onr_rcv_ret_gi_amt_p().amt();
	}

	/**
	 * Receiving for a fee return GI amount 有償受給返品出庫金額.<p>
	 *
	 */
	public void onr_rcv_ret_gi_amt(MCNumber value) {
		onr_rcv_ret_gi_amt_p().amt(value);
	}

	/**
	 * Receiving for a fee return GI amount 有償受給返品出庫金額.<p>
	 *
	 */
	public void onr_rcv_ret_gi_amt(int value) {
		onr_rcv_ret_gi_amt_p().amt(value);
	}

	/**
	 * Receiving for a fee return GI amount 有償受給返品出庫金額.<p>
	 *
	 */
	public void onr_rcv_ret_gi_amt(long value) {
		onr_rcv_ret_gi_amt_p().amt(value);
	}

	/**
	 * Receiving for a fee return GI amount 有償受給返品出庫金額.<p>
	 *
	 */
	public void onr_rcv_ret_gi_amt(float value) {
		onr_rcv_ret_gi_amt_p().amt(value);
	}

	/**
	 * Receiving for a fee return GI amount 有償受給返品出庫金額.<p>
	 *
	 */
	public void onr_rcv_ret_gi_amt(double value) {
		onr_rcv_ret_gi_amt_p().amt(value);
	}

	/**
	 * Expense purchase GI amount 経費購買出庫金額.<p>
	 *
	 */
	public MCNumber xpns_purc_gi_amt() {
		return xpns_purc_gi_amt_p().amt();
	}

	/**
	 * Expense purchase GI amount 経費購買出庫金額.<p>
	 *
	 */
	public void xpns_purc_gi_amt(MCNumber value) {
		xpns_purc_gi_amt_p().amt(value);
	}

	/**
	 * Expense purchase GI amount 経費購買出庫金額.<p>
	 *
	 */
	public void xpns_purc_gi_amt(int value) {
		xpns_purc_gi_amt_p().amt(value);
	}

	/**
	 * Expense purchase GI amount 経費購買出庫金額.<p>
	 *
	 */
	public void xpns_purc_gi_amt(long value) {
		xpns_purc_gi_amt_p().amt(value);
	}

	/**
	 * Expense purchase GI amount 経費購買出庫金額.<p>
	 *
	 */
	public void xpns_purc_gi_amt(float value) {
		xpns_purc_gi_amt_p().amt(value);
	}

	/**
	 * Expense purchase GI amount 経費購買出庫金額.<p>
	 *
	 */
	public void xpns_purc_gi_amt(double value) {
		xpns_purc_gi_amt_p().amt(value);
	}

	/**
	 * Expense purchase return GI amount 経費購買返品出庫金額.<p>
	 *
	 */
	public MCNumber xpns_purc_rtn_gi_amt() {
		return xpns_purc_rtn_gi_amt_p().amt();
	}

	/**
	 * Expense purchase return GI amount 経費購買返品出庫金額.<p>
	 *
	 */
	public void xpns_purc_rtn_gi_amt(MCNumber value) {
		xpns_purc_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Expense purchase return GI amount 経費購買返品出庫金額.<p>
	 *
	 */
	public void xpns_purc_rtn_gi_amt(int value) {
		xpns_purc_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Expense purchase return GI amount 経費購買返品出庫金額.<p>
	 *
	 */
	public void xpns_purc_rtn_gi_amt(long value) {
		xpns_purc_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Expense purchase return GI amount 経費購買返品出庫金額.<p>
	 *
	 */
	public void xpns_purc_rtn_gi_amt(float value) {
		xpns_purc_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Expense purchase return GI amount 経費購買返品出庫金額.<p>
	 *
	 */
	public void xpns_purc_rtn_gi_amt(double value) {
		xpns_purc_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Defective acceptance GI amount 検収不良出庫金額.<p>
	 *
	 */
	public MCNumber accpt_dfct_gi_amt() {
		return accpt_dfct_gi_amt_p().amt();
	}

	/**
	 * Defective acceptance GI amount 検収不良出庫金額.<p>
	 *
	 */
	public void accpt_dfct_gi_amt(MCNumber value) {
		accpt_dfct_gi_amt_p().amt(value);
	}

	/**
	 * Defective acceptance GI amount 検収不良出庫金額.<p>
	 *
	 */
	public void accpt_dfct_gi_amt(int value) {
		accpt_dfct_gi_amt_p().amt(value);
	}

	/**
	 * Defective acceptance GI amount 検収不良出庫金額.<p>
	 *
	 */
	public void accpt_dfct_gi_amt(long value) {
		accpt_dfct_gi_amt_p().amt(value);
	}

	/**
	 * Defective acceptance GI amount 検収不良出庫金額.<p>
	 *
	 */
	public void accpt_dfct_gi_amt(float value) {
		accpt_dfct_gi_amt_p().amt(value);
	}

	/**
	 * Defective acceptance GI amount 検収不良出庫金額.<p>
	 *
	 */
	public void accpt_dfct_gi_amt(double value) {
		accpt_dfct_gi_amt_p().amt(value);
	}

	/**
	 * Input amount 投入金額.<p>
	 *
	 */
	public MCNumber inpt_amt() {
		return inpt_amt_p().amt();
	}

	/**
	 * Input amount 投入金額.<p>
	 *
	 */
	public void inpt_amt(MCNumber value) {
		inpt_amt_p().amt(value);
	}

	/**
	 * Input amount 投入金額.<p>
	 *
	 */
	public void inpt_amt(int value) {
		inpt_amt_p().amt(value);
	}

	/**
	 * Input amount 投入金額.<p>
	 *
	 */
	public void inpt_amt(long value) {
		inpt_amt_p().amt(value);
	}

	/**
	 * Input amount 投入金額.<p>
	 *
	 */
	public void inpt_amt(float value) {
		inpt_amt_p().amt(value);
	}

	/**
	 * Input amount 投入金額.<p>
	 *
	 */
	public void inpt_amt(double value) {
		inpt_amt_p().amt(value);
	}

	/**
	 * Loss amount ロス金額.<p>
	 *
	 */
	public MCNumber loss_amt() {
		return loss_amt_p().amt();
	}

	/**
	 * Loss amount ロス金額.<p>
	 *
	 */
	public void loss_amt(MCNumber value) {
		loss_amt_p().amt(value);
	}

	/**
	 * Loss amount ロス金額.<p>
	 *
	 */
	public void loss_amt(int value) {
		loss_amt_p().amt(value);
	}

	/**
	 * Loss amount ロス金額.<p>
	 *
	 */
	public void loss_amt(long value) {
		loss_amt_p().amt(value);
	}

	/**
	 * Loss amount ロス金額.<p>
	 *
	 */
	public void loss_amt(float value) {
		loss_amt_p().amt(value);
	}

	/**
	 * Loss amount ロス金額.<p>
	 *
	 */
	public void loss_amt(double value) {
		loss_amt_p().amt(value);
	}

	/**
	 * Non-chargeable supply GI amount 無償支給出庫金額.<p>
	 *
	 */
	public MCNumber ffr_prov_gi_amt() {
		return ffr_prov_gi_amt_p().amt();
	}

	/**
	 * Non-chargeable supply GI amount 無償支給出庫金額.<p>
	 *
	 */
	public void ffr_prov_gi_amt(MCNumber value) {
		ffr_prov_gi_amt_p().amt(value);
	}

	/**
	 * Non-chargeable supply GI amount 無償支給出庫金額.<p>
	 *
	 */
	public void ffr_prov_gi_amt(int value) {
		ffr_prov_gi_amt_p().amt(value);
	}

	/**
	 * Non-chargeable supply GI amount 無償支給出庫金額.<p>
	 *
	 */
	public void ffr_prov_gi_amt(long value) {
		ffr_prov_gi_amt_p().amt(value);
	}

	/**
	 * Non-chargeable supply GI amount 無償支給出庫金額.<p>
	 *
	 */
	public void ffr_prov_gi_amt(float value) {
		ffr_prov_gi_amt_p().amt(value);
	}

	/**
	 * Non-chargeable supply GI amount 無償支給出庫金額.<p>
	 *
	 */
	public void ffr_prov_gi_amt(double value) {
		ffr_prov_gi_amt_p().amt(value);
	}

	/**
	 * Chargeable supply GI amount 有償支給出庫金額.<p>
	 *
	 */
	public MCNumber onr_prov_gi_amt() {
		return onr_prov_gi_amt_p().amt();
	}

	/**
	 * Chargeable supply GI amount 有償支給出庫金額.<p>
	 *
	 */
	public void onr_prov_gi_amt(MCNumber value) {
		onr_prov_gi_amt_p().amt(value);
	}

	/**
	 * Chargeable supply GI amount 有償支給出庫金額.<p>
	 *
	 */
	public void onr_prov_gi_amt(int value) {
		onr_prov_gi_amt_p().amt(value);
	}

	/**
	 * Chargeable supply GI amount 有償支給出庫金額.<p>
	 *
	 */
	public void onr_prov_gi_amt(long value) {
		onr_prov_gi_amt_p().amt(value);
	}

	/**
	 * Chargeable supply GI amount 有償支給出庫金額.<p>
	 *
	 */
	public void onr_prov_gi_amt(float value) {
		onr_prov_gi_amt_p().amt(value);
	}

	/**
	 * Chargeable supply GI amount 有償支給出庫金額.<p>
	 *
	 */
	public void onr_prov_gi_amt(double value) {
		onr_prov_gi_amt_p().amt(value);
	}

	/**
	 * Non-chargeable supply return GI amount 無償支給返品出庫金額.<p>
	 *
	 */
	public MCNumber ffr_prov_rtn_gi_amt() {
		return ffr_prov_rtn_gi_amt_p().amt();
	}

	/**
	 * Non-chargeable supply return GI amount 無償支給返品出庫金額.<p>
	 *
	 */
	public void ffr_prov_rtn_gi_amt(MCNumber value) {
		ffr_prov_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Non-chargeable supply return GI amount 無償支給返品出庫金額.<p>
	 *
	 */
	public void ffr_prov_rtn_gi_amt(int value) {
		ffr_prov_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Non-chargeable supply return GI amount 無償支給返品出庫金額.<p>
	 *
	 */
	public void ffr_prov_rtn_gi_amt(long value) {
		ffr_prov_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Non-chargeable supply return GI amount 無償支給返品出庫金額.<p>
	 *
	 */
	public void ffr_prov_rtn_gi_amt(float value) {
		ffr_prov_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Non-chargeable supply return GI amount 無償支給返品出庫金額.<p>
	 *
	 */
	public void ffr_prov_rtn_gi_amt(double value) {
		ffr_prov_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Chargeable supply return GI amount 有償支給返品出庫金額.<p>
	 *
	 */
	public MCNumber onr_prov_rtn_gi_amt() {
		return onr_prov_rtn_gi_amt_p().amt();
	}

	/**
	 * Chargeable supply return GI amount 有償支給返品出庫金額.<p>
	 *
	 */
	public void onr_prov_rtn_gi_amt(MCNumber value) {
		onr_prov_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Chargeable supply return GI amount 有償支給返品出庫金額.<p>
	 *
	 */
	public void onr_prov_rtn_gi_amt(int value) {
		onr_prov_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Chargeable supply return GI amount 有償支給返品出庫金額.<p>
	 *
	 */
	public void onr_prov_rtn_gi_amt(long value) {
		onr_prov_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Chargeable supply return GI amount 有償支給返品出庫金額.<p>
	 *
	 */
	public void onr_prov_rtn_gi_amt(float value) {
		onr_prov_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Chargeable supply return GI amount 有償支給返品出庫金額.<p>
	 *
	 */
	public void onr_prov_rtn_gi_amt(double value) {
		onr_prov_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public MCNumber insp_gi_amt() {
		return insp_gi_amt_p().amt();
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public void insp_gi_amt(MCNumber value) {
		insp_gi_amt_p().amt(value);
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public void insp_gi_amt(int value) {
		insp_gi_amt_p().amt(value);
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public void insp_gi_amt(long value) {
		insp_gi_amt_p().amt(value);
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public void insp_gi_amt(float value) {
		insp_gi_amt_p().amt(value);
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public void insp_gi_amt(double value) {
		insp_gi_amt_p().amt(value);
	}

	/**
	 * Inspection completed GI amount 検査完了出庫金額.<p>
	 *
	 */
	public MCNumber insp_cmpl_gi_amt() {
		return insp_cmpl_gi_amt_p().amt();
	}

	/**
	 * Inspection completed GI amount 検査完了出庫金額.<p>
	 *
	 */
	public void insp_cmpl_gi_amt(MCNumber value) {
		insp_cmpl_gi_amt_p().amt(value);
	}

	/**
	 * Inspection completed GI amount 検査完了出庫金額.<p>
	 *
	 */
	public void insp_cmpl_gi_amt(int value) {
		insp_cmpl_gi_amt_p().amt(value);
	}

	/**
	 * Inspection completed GI amount 検査完了出庫金額.<p>
	 *
	 */
	public void insp_cmpl_gi_amt(long value) {
		insp_cmpl_gi_amt_p().amt(value);
	}

	/**
	 * Inspection completed GI amount 検査完了出庫金額.<p>
	 *
	 */
	public void insp_cmpl_gi_amt(float value) {
		insp_cmpl_gi_amt_p().amt(value);
	}

	/**
	 * Inspection completed GI amount 検査完了出庫金額.<p>
	 *
	 */
	public void insp_cmpl_gi_amt(double value) {
		insp_cmpl_gi_amt_p().amt(value);
	}

	/**
	 * Inspection decision GI amount 検査判定出庫金額.<p>
	 *
	 */
	public MCNumber insp_judg_gi_amt() {
		return insp_judg_gi_amt_p().amt();
	}

	/**
	 * Inspection decision GI amount 検査判定出庫金額.<p>
	 *
	 */
	public void insp_judg_gi_amt(MCNumber value) {
		insp_judg_gi_amt_p().amt(value);
	}

	/**
	 * Inspection decision GI amount 検査判定出庫金額.<p>
	 *
	 */
	public void insp_judg_gi_amt(int value) {
		insp_judg_gi_amt_p().amt(value);
	}

	/**
	 * Inspection decision GI amount 検査判定出庫金額.<p>
	 *
	 */
	public void insp_judg_gi_amt(long value) {
		insp_judg_gi_amt_p().amt(value);
	}

	/**
	 * Inspection decision GI amount 検査判定出庫金額.<p>
	 *
	 */
	public void insp_judg_gi_amt(float value) {
		insp_judg_gi_amt_p().amt(value);
	}

	/**
	 * Inspection decision GI amount 検査判定出庫金額.<p>
	 *
	 */
	public void insp_judg_gi_amt(double value) {
		insp_judg_gi_amt_p().amt(value);
	}

	/**
	 * Re-inspection GI amount 再検査出庫金額.<p>
	 *
	 */
	public MCNumber reinsp_gi_amt() {
		return reinsp_gi_amt_p().amt();
	}

	/**
	 * Re-inspection GI amount 再検査出庫金額.<p>
	 *
	 */
	public void reinsp_gi_amt(MCNumber value) {
		reinsp_gi_amt_p().amt(value);
	}

	/**
	 * Re-inspection GI amount 再検査出庫金額.<p>
	 *
	 */
	public void reinsp_gi_amt(int value) {
		reinsp_gi_amt_p().amt(value);
	}

	/**
	 * Re-inspection GI amount 再検査出庫金額.<p>
	 *
	 */
	public void reinsp_gi_amt(long value) {
		reinsp_gi_amt_p().amt(value);
	}

	/**
	 * Re-inspection GI amount 再検査出庫金額.<p>
	 *
	 */
	public void reinsp_gi_amt(float value) {
		reinsp_gi_amt_p().amt(value);
	}

	/**
	 * Re-inspection GI amount 再検査出庫金額.<p>
	 *
	 */
	public void reinsp_gi_amt(double value) {
		reinsp_gi_amt_p().amt(value);
	}

	/**
	 * Sampling amount 検査抜取金額.<p>
	 *
	 */
	public MCNumber insp_smpl_gi_amt() {
		return insp_smpl_gi_amt_p().amt();
	}

	/**
	 * Sampling amount 検査抜取金額.<p>
	 *
	 */
	public void insp_smpl_gi_amt(MCNumber value) {
		insp_smpl_gi_amt_p().amt(value);
	}

	/**
	 * Sampling amount 検査抜取金額.<p>
	 *
	 */
	public void insp_smpl_gi_amt(int value) {
		insp_smpl_gi_amt_p().amt(value);
	}

	/**
	 * Sampling amount 検査抜取金額.<p>
	 *
	 */
	public void insp_smpl_gi_amt(long value) {
		insp_smpl_gi_amt_p().amt(value);
	}

	/**
	 * Sampling amount 検査抜取金額.<p>
	 *
	 */
	public void insp_smpl_gi_amt(float value) {
		insp_smpl_gi_amt_p().amt(value);
	}

	/**
	 * Sampling amount 検査抜取金額.<p>
	 *
	 */
	public void insp_smpl_gi_amt(double value) {
		insp_smpl_gi_amt_p().amt(value);
	}

	/**
	 * Inventory count variance amount (GI) 棚卸差異減耗金額.<p>
	 *
	 */
	public MCNumber stk_adjst_gi_amt() {
		return stk_adjst_gi_amt_p().amt();
	}

	/**
	 * Inventory count variance amount (GI) 棚卸差異減耗金額.<p>
	 *
	 */
	public void stk_adjst_gi_amt(MCNumber value) {
		stk_adjst_gi_amt_p().amt(value);
	}

	/**
	 * Inventory count variance amount (GI) 棚卸差異減耗金額.<p>
	 *
	 */
	public void stk_adjst_gi_amt(int value) {
		stk_adjst_gi_amt_p().amt(value);
	}

	/**
	 * Inventory count variance amount (GI) 棚卸差異減耗金額.<p>
	 *
	 */
	public void stk_adjst_gi_amt(long value) {
		stk_adjst_gi_amt_p().amt(value);
	}

	/**
	 * Inventory count variance amount (GI) 棚卸差異減耗金額.<p>
	 *
	 */
	public void stk_adjst_gi_amt(float value) {
		stk_adjst_gi_amt_p().amt(value);
	}

	/**
	 * Inventory count variance amount (GI) 棚卸差異減耗金額.<p>
	 *
	 */
	public void stk_adjst_gi_amt(double value) {
		stk_adjst_gi_amt_p().amt(value);
	}

	/**
	 * Warehousing GI amount 倉入出庫金額.<p>
	 *
	 */
	public MCNumber prdct_wh_gi_amt() {
		return prdct_wh_gi_amt_p().amt();
	}

	/**
	 * Warehousing GI amount 倉入出庫金額.<p>
	 *
	 */
	public void prdct_wh_gi_amt(MCNumber value) {
		prdct_wh_gi_amt_p().amt(value);
	}

	/**
	 * Warehousing GI amount 倉入出庫金額.<p>
	 *
	 */
	public void prdct_wh_gi_amt(int value) {
		prdct_wh_gi_amt_p().amt(value);
	}

	/**
	 * Warehousing GI amount 倉入出庫金額.<p>
	 *
	 */
	public void prdct_wh_gi_amt(long value) {
		prdct_wh_gi_amt_p().amt(value);
	}

	/**
	 * Warehousing GI amount 倉入出庫金額.<p>
	 *
	 */
	public void prdct_wh_gi_amt(float value) {
		prdct_wh_gi_amt_p().amt(value);
	}

	/**
	 * Warehousing GI amount 倉入出庫金額.<p>
	 *
	 */
	public void prdct_wh_gi_amt(double value) {
		prdct_wh_gi_amt_p().amt(value);
	}

	/**
	 * GI returning amount 戻入出庫金額.<p>
	 *
	 */
	public MCNumber prdct_wh_rtn_gi_amt() {
		return prdct_wh_rtn_gi_amt_p().amt();
	}

	/**
	 * GI returning amount 戻入出庫金額.<p>
	 *
	 */
	public void prdct_wh_rtn_gi_amt(MCNumber value) {
		prdct_wh_rtn_gi_amt_p().amt(value);
	}

	/**
	 * GI returning amount 戻入出庫金額.<p>
	 *
	 */
	public void prdct_wh_rtn_gi_amt(int value) {
		prdct_wh_rtn_gi_amt_p().amt(value);
	}

	/**
	 * GI returning amount 戻入出庫金額.<p>
	 *
	 */
	public void prdct_wh_rtn_gi_amt(long value) {
		prdct_wh_rtn_gi_amt_p().amt(value);
	}

	/**
	 * GI returning amount 戻入出庫金額.<p>
	 *
	 */
	public void prdct_wh_rtn_gi_amt(float value) {
		prdct_wh_rtn_gi_amt_p().amt(value);
	}

	/**
	 * GI returning amount 戻入出庫金額.<p>
	 *
	 */
	public void prdct_wh_rtn_gi_amt(double value) {
		prdct_wh_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public MCNumber xfr_gi_amt() {
		return xfr_gi_amt_p().amt();
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public void xfr_gi_amt(MCNumber value) {
		xfr_gi_amt_p().amt(value);
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public void xfr_gi_amt(int value) {
		xfr_gi_amt_p().amt(value);
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public void xfr_gi_amt(long value) {
		xfr_gi_amt_p().amt(value);
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public void xfr_gi_amt(float value) {
		xfr_gi_amt_p().amt(value);
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public void xfr_gi_amt(double value) {
		xfr_gi_amt_p().amt(value);
	}

	/**
	 * Move-out amount 転出金額.<p>
	 *
	 */
	public MCNumber xfr_out_amt() {
		return xfr_out_amt_p().amt();
	}

	/**
	 * Move-out amount 転出金額.<p>
	 *
	 */
	public void xfr_out_amt(MCNumber value) {
		xfr_out_amt_p().amt(value);
	}

	/**
	 * Move-out amount 転出金額.<p>
	 *
	 */
	public void xfr_out_amt(int value) {
		xfr_out_amt_p().amt(value);
	}

	/**
	 * Move-out amount 転出金額.<p>
	 *
	 */
	public void xfr_out_amt(long value) {
		xfr_out_amt_p().amt(value);
	}

	/**
	 * Move-out amount 転出金額.<p>
	 *
	 */
	public void xfr_out_amt(float value) {
		xfr_out_amt_p().amt(value);
	}

	/**
	 * Move-out amount 転出金額.<p>
	 *
	 */
	public void xfr_out_amt(double value) {
		xfr_out_amt_p().amt(value);
	}

	/**
	 * Purchase move-out amount 仕入転出金額.<p>
	 *
	 */
	public MCNumber purc_xfr_out_amt() {
		return purc_xfr_out_amt_p().amt();
	}

	/**
	 * Purchase move-out amount 仕入転出金額.<p>
	 *
	 */
	public void purc_xfr_out_amt(MCNumber value) {
		purc_xfr_out_amt_p().amt(value);
	}

	/**
	 * Purchase move-out amount 仕入転出金額.<p>
	 *
	 */
	public void purc_xfr_out_amt(int value) {
		purc_xfr_out_amt_p().amt(value);
	}

	/**
	 * Purchase move-out amount 仕入転出金額.<p>
	 *
	 */
	public void purc_xfr_out_amt(long value) {
		purc_xfr_out_amt_p().amt(value);
	}

	/**
	 * Purchase move-out amount 仕入転出金額.<p>
	 *
	 */
	public void purc_xfr_out_amt(float value) {
		purc_xfr_out_amt_p().amt(value);
	}

	/**
	 * Purchase move-out amount 仕入転出金額.<p>
	 *
	 */
	public void purc_xfr_out_amt(double value) {
		purc_xfr_out_amt_p().amt(value);
	}

	/**
	 * Movement/transport return GI amount 移動・移送返品出庫金額.<p>
	 *
	 */
	public MCNumber xfr_rtn_gi_amt() {
		return xfr_rtn_gi_amt_p().amt();
	}

	/**
	 * Movement/transport return GI amount 移動・移送返品出庫金額.<p>
	 *
	 */
	public void xfr_rtn_gi_amt(MCNumber value) {
		xfr_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Movement/transport return GI amount 移動・移送返品出庫金額.<p>
	 *
	 */
	public void xfr_rtn_gi_amt(int value) {
		xfr_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Movement/transport return GI amount 移動・移送返品出庫金額.<p>
	 *
	 */
	public void xfr_rtn_gi_amt(long value) {
		xfr_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Movement/transport return GI amount 移動・移送返品出庫金額.<p>
	 *
	 */
	public void xfr_rtn_gi_amt(float value) {
		xfr_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Movement/transport return GI amount 移動・移送返品出庫金額.<p>
	 *
	 */
	public void xfr_rtn_gi_amt(double value) {
		xfr_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public MCNumber acxfr_gi_amt() {
		return acxfr_gi_amt_p().amt();
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public void acxfr_gi_amt(MCNumber value) {
		acxfr_gi_amt_p().amt(value);
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public void acxfr_gi_amt(int value) {
		acxfr_gi_amt_p().amt(value);
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public void acxfr_gi_amt(long value) {
		acxfr_gi_amt_p().amt(value);
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public void acxfr_gi_amt(float value) {
		acxfr_gi_amt_p().amt(value);
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public void acxfr_gi_amt(double value) {
		acxfr_gi_amt_p().amt(value);
	}

	/**
	 * Disposal amount 廃棄金額.<p>
	 *
	 */
	public MCNumber scrp_amt() {
		return scrp_amt_p().amt();
	}

	/**
	 * Disposal amount 廃棄金額.<p>
	 *
	 */
	public void scrp_amt(MCNumber value) {
		scrp_amt_p().amt(value);
	}

	/**
	 * Disposal amount 廃棄金額.<p>
	 *
	 */
	public void scrp_amt(int value) {
		scrp_amt_p().amt(value);
	}

	/**
	 * Disposal amount 廃棄金額.<p>
	 *
	 */
	public void scrp_amt(long value) {
		scrp_amt_p().amt(value);
	}

	/**
	 * Disposal amount 廃棄金額.<p>
	 *
	 */
	public void scrp_amt(float value) {
		scrp_amt_p().amt(value);
	}

	/**
	 * Disposal amount 廃棄金額.<p>
	 *
	 */
	public void scrp_amt(double value) {
		scrp_amt_p().amt(value);
	}

	/**
	 * Item transfer GI amount 品目振替出庫金額.<p>
	 *
	 */
	public MCNumber xfr_itm_gi_amt() {
		return xfr_itm_gi_amt_p().amt();
	}

	/**
	 * Item transfer GI amount 品目振替出庫金額.<p>
	 *
	 */
	public void xfr_itm_gi_amt(MCNumber value) {
		xfr_itm_gi_amt_p().amt(value);
	}

	/**
	 * Item transfer GI amount 品目振替出庫金額.<p>
	 *
	 */
	public void xfr_itm_gi_amt(int value) {
		xfr_itm_gi_amt_p().amt(value);
	}

	/**
	 * Item transfer GI amount 品目振替出庫金額.<p>
	 *
	 */
	public void xfr_itm_gi_amt(long value) {
		xfr_itm_gi_amt_p().amt(value);
	}

	/**
	 * Item transfer GI amount 品目振替出庫金額.<p>
	 *
	 */
	public void xfr_itm_gi_amt(float value) {
		xfr_itm_gi_amt_p().amt(value);
	}

	/**
	 * Item transfer GI amount 品目振替出庫金額.<p>
	 *
	 */
	public void xfr_itm_gi_amt(double value) {
		xfr_itm_gi_amt_p().amt(value);
	}

	/**
	 * Lot/SEIBAN No. transfer GI amount ロット・手配ＮＯ振替出庫金額.<p>
	 *
	 */
	public MCNumber xfr_lot_sno_gi_amt() {
		return xfr_lot_sno_gi_amt_p().amt();
	}

	/**
	 * Lot/SEIBAN No. transfer GI amount ロット・手配ＮＯ振替出庫金額.<p>
	 *
	 */
	public void xfr_lot_sno_gi_amt(MCNumber value) {
		xfr_lot_sno_gi_amt_p().amt(value);
	}

	/**
	 * Lot/SEIBAN No. transfer GI amount ロット・手配ＮＯ振替出庫金額.<p>
	 *
	 */
	public void xfr_lot_sno_gi_amt(int value) {
		xfr_lot_sno_gi_amt_p().amt(value);
	}

	/**
	 * Lot/SEIBAN No. transfer GI amount ロット・手配ＮＯ振替出庫金額.<p>
	 *
	 */
	public void xfr_lot_sno_gi_amt(long value) {
		xfr_lot_sno_gi_amt_p().amt(value);
	}

	/**
	 * Lot/SEIBAN No. transfer GI amount ロット・手配ＮＯ振替出庫金額.<p>
	 *
	 */
	public void xfr_lot_sno_gi_amt(float value) {
		xfr_lot_sno_gi_amt_p().amt(value);
	}

	/**
	 * Lot/SEIBAN No. transfer GI amount ロット・手配ＮＯ振替出庫金額.<p>
	 *
	 */
	public void xfr_lot_sno_gi_amt(double value) {
		xfr_lot_sno_gi_amt_p().amt(value);
	}

	/**
	 * GI amount (Grading/conforming type transfer) 格付・良品区分振替出庫金額.<p>
	 *
	 */
	public MCNumber xfr_grd_gi_amt() {
		return xfr_grd_gi_amt_p().amt();
	}

	/**
	 * GI amount (Grading/conforming type transfer) 格付・良品区分振替出庫金額.<p>
	 *
	 */
	public void xfr_grd_gi_amt(MCNumber value) {
		xfr_grd_gi_amt_p().amt(value);
	}

	/**
	 * GI amount (Grading/conforming type transfer) 格付・良品区分振替出庫金額.<p>
	 *
	 */
	public void xfr_grd_gi_amt(int value) {
		xfr_grd_gi_amt_p().amt(value);
	}

	/**
	 * GI amount (Grading/conforming type transfer) 格付・良品区分振替出庫金額.<p>
	 *
	 */
	public void xfr_grd_gi_amt(long value) {
		xfr_grd_gi_amt_p().amt(value);
	}

	/**
	 * GI amount (Grading/conforming type transfer) 格付・良品区分振替出庫金額.<p>
	 *
	 */
	public void xfr_grd_gi_amt(float value) {
		xfr_grd_gi_amt_p().amt(value);
	}

	/**
	 * GI amount (Grading/conforming type transfer) 格付・良品区分振替出庫金額.<p>
	 *
	 */
	public void xfr_grd_gi_amt(double value) {
		xfr_grd_gi_amt_p().amt(value);
	}

	/**
	 * SKU transfer GI amount 荷姿振替出庫金額.<p>
	 *
	 */
	public MCNumber xfr_pack_gi_amt() {
		return xfr_pack_gi_amt_p().amt();
	}

	/**
	 * SKU transfer GI amount 荷姿振替出庫金額.<p>
	 *
	 */
	public void xfr_pack_gi_amt(MCNumber value) {
		xfr_pack_gi_amt_p().amt(value);
	}

	/**
	 * SKU transfer GI amount 荷姿振替出庫金額.<p>
	 *
	 */
	public void xfr_pack_gi_amt(int value) {
		xfr_pack_gi_amt_p().amt(value);
	}

	/**
	 * SKU transfer GI amount 荷姿振替出庫金額.<p>
	 *
	 */
	public void xfr_pack_gi_amt(long value) {
		xfr_pack_gi_amt_p().amt(value);
	}

	/**
	 * SKU transfer GI amount 荷姿振替出庫金額.<p>
	 *
	 */
	public void xfr_pack_gi_amt(float value) {
		xfr_pack_gi_amt_p().amt(value);
	}

	/**
	 * SKU transfer GI amount 荷姿振替出庫金額.<p>
	 *
	 */
	public void xfr_pack_gi_amt(double value) {
		xfr_pack_gi_amt_p().amt(value);
	}

	/**
	 * Shipping amount 出荷金額.<p>
	 *
	 */
	public MCNumber ship_out_amt() {
		return ship_out_amt_p().amt();
	}

	/**
	 * Shipping amount 出荷金額.<p>
	 *
	 */
	public void ship_out_amt(MCNumber value) {
		ship_out_amt_p().amt(value);
	}

	/**
	 * Shipping amount 出荷金額.<p>
	 *
	 */
	public void ship_out_amt(int value) {
		ship_out_amt_p().amt(value);
	}

	/**
	 * Shipping amount 出荷金額.<p>
	 *
	 */
	public void ship_out_amt(long value) {
		ship_out_amt_p().amt(value);
	}

	/**
	 * Shipping amount 出荷金額.<p>
	 *
	 */
	public void ship_out_amt(float value) {
		ship_out_amt_p().amt(value);
	}

	/**
	 * Shipping amount 出荷金額.<p>
	 *
	 */
	public void ship_out_amt(double value) {
		ship_out_amt_p().amt(value);
	}

	/**
	 * Export shipping amount 輸出出荷金額.<p>
	 *
	 */
	public MCNumber ex_ship_out_amt() {
		return ex_ship_out_amt_p().amt();
	}

	/**
	 * Export shipping amount 輸出出荷金額.<p>
	 *
	 */
	public void ex_ship_out_amt(MCNumber value) {
		ex_ship_out_amt_p().amt(value);
	}

	/**
	 * Export shipping amount 輸出出荷金額.<p>
	 *
	 */
	public void ex_ship_out_amt(int value) {
		ex_ship_out_amt_p().amt(value);
	}

	/**
	 * Export shipping amount 輸出出荷金額.<p>
	 *
	 */
	public void ex_ship_out_amt(long value) {
		ex_ship_out_amt_p().amt(value);
	}

	/**
	 * Export shipping amount 輸出出荷金額.<p>
	 *
	 */
	public void ex_ship_out_amt(float value) {
		ex_ship_out_amt_p().amt(value);
	}

	/**
	 * Export shipping amount 輸出出荷金額.<p>
	 *
	 */
	public void ex_ship_out_amt(double value) {
		ex_ship_out_amt_p().amt(value);
	}

	/**
	 * Shipping return GI amount 出荷返品出庫金額.<p>
	 *
	 */
	public MCNumber ship_rtn_gi_amt() {
		return ship_rtn_gi_amt_p().amt();
	}

	/**
	 * Shipping return GI amount 出荷返品出庫金額.<p>
	 *
	 */
	public void ship_rtn_gi_amt(MCNumber value) {
		ship_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Shipping return GI amount 出荷返品出庫金額.<p>
	 *
	 */
	public void ship_rtn_gi_amt(int value) {
		ship_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Shipping return GI amount 出荷返品出庫金額.<p>
	 *
	 */
	public void ship_rtn_gi_amt(long value) {
		ship_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Shipping return GI amount 出荷返品出庫金額.<p>
	 *
	 */
	public void ship_rtn_gi_amt(float value) {
		ship_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Shipping return GI amount 出荷返品出庫金額.<p>
	 *
	 */
	public void ship_rtn_gi_amt(double value) {
		ship_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Sales return GI amount 売上返品出庫金額.<p>
	 *
	 */
	public MCNumber sls_rtn_gi_amt() {
		return sls_rtn_gi_amt_p().amt();
	}

	/**
	 * Sales return GI amount 売上返品出庫金額.<p>
	 *
	 */
	public void sls_rtn_gi_amt(MCNumber value) {
		sls_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Sales return GI amount 売上返品出庫金額.<p>
	 *
	 */
	public void sls_rtn_gi_amt(int value) {
		sls_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Sales return GI amount 売上返品出庫金額.<p>
	 *
	 */
	public void sls_rtn_gi_amt(long value) {
		sls_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Sales return GI amount 売上返品出庫金額.<p>
	 *
	 */
	public void sls_rtn_gi_amt(float value) {
		sls_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Sales return GI amount 売上返品出庫金額.<p>
	 *
	 */
	public void sls_rtn_gi_amt(double value) {
		sls_rtn_gi_amt_p().amt(value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return sls_amt_p().amt();
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		sls_amt_p().amt(value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(int value) {
		sls_amt_p().amt(value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(long value) {
		sls_amt_p().amt(value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(float value) {
		sls_amt_p().amt(value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(double value) {
		sls_amt_p().amt(value);
	}

	/**
	 * Ending inventory amount 月末在庫金額.<p>
	 *
	 */
	public MCNumber end_stk_amt() {
		return end_stk_amt_p().amt();
	}

	/**
	 * Ending inventory amount 月末在庫金額.<p>
	 *
	 */
	public void end_stk_amt(MCNumber value) {
		end_stk_amt_p().amt(value);
	}

	/**
	 * Ending inventory amount 月末在庫金額.<p>
	 *
	 */
	public void end_stk_amt(int value) {
		end_stk_amt_p().amt(value);
	}

	/**
	 * Ending inventory amount 月末在庫金額.<p>
	 *
	 */
	public void end_stk_amt(long value) {
		end_stk_amt_p().amt(value);
	}

	/**
	 * Ending inventory amount 月末在庫金額.<p>
	 *
	 */
	public void end_stk_amt(float value) {
		end_stk_amt_p().amt(value);
	}

	/**
	 * Ending inventory amount 月末在庫金額.<p>
	 *
	 */
	public void end_stk_amt(double value) {
		end_stk_amt_p().amt(value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber std_unit_cost() {
		return std_unit_cost_amt_p().amt();
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(MCNumber value) {
		std_unit_cost_amt_p().amt(value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(int value) {
		std_unit_cost_amt_p().amt(value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(long value) {
		std_unit_cost_amt_p().amt(value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(float value) {
		std_unit_cost_amt_p().amt(value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(double value) {
		std_unit_cost_amt_p().amt(value);
	}

	public String itm_grp_cd1() {
		return itm_grp_p().itm_grp_cd1();
	}

	public void itm_grp_cd1(String value) {
		itm_grp_p().itm_grp_cd1(value);
	}

	public String itm_grp_nm1() {
		return itm_grp_p().itm_grp_nm1();
	}

	public void itm_grp_nm1(String value) {
		itm_grp_p().itm_grp_nm1(value);
	}

	public String itm_grp_cd2() {
		return itm_grp_p().itm_grp_cd2();
	}

	public void itm_grp_cd2(String value) {
		itm_grp_p().itm_grp_cd2(value);
	}

	public String itm_grp_nm2() {
		return itm_grp_p().itm_grp_nm2();
	}

	public void itm_grp_nm2(String value) {
		itm_grp_p().itm_grp_nm2(value);
	}

	public String itm_grp_cd3() {
		return itm_grp_p().itm_grp_cd3();
	}

	public void itm_grp_cd3(String value) {
		itm_grp_p().itm_grp_cd3(value);
	}

	public String itm_grp_nm3() {
		return itm_grp_p().itm_grp_nm3();
	}

	public void itm_grp_nm3(String value) {
		itm_grp_p().itm_grp_nm3(value);
	}

	public String itm_grp_cd4() {
		return itm_grp_p().itm_grp_cd4();
	}

	public void itm_grp_cd4(String value) {
		itm_grp_p().itm_grp_cd4(value);
	}

	public String itm_grp_nm4() {
		return itm_grp_p().itm_grp_nm4();
	}

	public void itm_grp_nm4(String value) {
		itm_grp_p().itm_grp_nm4(value);
	}

	public String itm_grp_cd5() {
		return itm_grp_p().itm_grp_cd5();
	}

	public void itm_grp_cd5(String value) {
		itm_grp_p().itm_grp_cd5(value);
	}

	public String itm_grp_nm5() {
		return itm_grp_p().itm_grp_nm5();
	}

	public void itm_grp_nm5(String value) {
		itm_grp_p().itm_grp_nm5(value);
	}

	public String itm_grp_cd6() {
		return itm_grp_p().itm_grp_cd6();
	}

	public void itm_grp_cd6(String value) {
		itm_grp_p().itm_grp_cd6(value);
	}

	public String itm_grp_nm6() {
		return itm_grp_p().itm_grp_nm6();
	}

	public void itm_grp_nm6(String value) {
		itm_grp_p().itm_grp_nm6(value);
	}

	public String itm_grp_cd7() {
		return itm_grp_p().itm_grp_cd7();
	}

	public void itm_grp_cd7(String value) {
		itm_grp_p().itm_grp_cd7(value);
	}

	public String itm_grp_nm7() {
		return itm_grp_p().itm_grp_nm7();
	}

	public void itm_grp_nm7(String value) {
		itm_grp_p().itm_grp_nm7(value);
	}

	public String itm_grp_cd8() {
		return itm_grp_p().itm_grp_cd8();
	}

	public void itm_grp_cd8(String value) {
		itm_grp_p().itm_grp_cd8(value);
	}

	public String itm_grp_nm8() {
		return itm_grp_p().itm_grp_nm8();
	}

	public void itm_grp_nm8(String value) {
		itm_grp_p().itm_grp_nm8(value);
	}

	public String itm_grp_cd9() {
		return itm_grp_p().itm_grp_cd9();
	}

	public void itm_grp_cd9(String value) {
		itm_grp_p().itm_grp_cd9(value);
	}

	public String itm_grp_nm9() {
		return itm_grp_p().itm_grp_nm9();
	}

	public void itm_grp_nm9(String value) {
		itm_grp_p().itm_grp_nm9(value);
	}

	public String itm_grp_cd10() {
		return itm_grp_p().itm_grp_cd10();
	}

	public void itm_grp_cd10(String value) {
		itm_grp_p().itm_grp_cd10(value);
	}

	public String itm_grp_nm10() {
		return itm_grp_p().itm_grp_nm10();
	}

	public void itm_grp_nm10(String value) {
		itm_grp_p().itm_grp_nm10(value);
	}

}

