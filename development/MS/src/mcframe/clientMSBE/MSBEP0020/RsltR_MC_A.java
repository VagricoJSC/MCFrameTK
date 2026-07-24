package mcframe.clientMSBE.MSBEP0020;

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
	public static final String $itm_p = "itm_p";
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
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
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
	public static final String $purc_bf_accpt_qty_p = "purc_bf_accpt_qty_p";
	public static final String $gr_purc_qty_p = "gr_purc_qty_p";
	public static final String $accpt_dfct_qty_p = "accpt_dfct_qty_p";
	public static final String $gr_prod_qty_p = "gr_prod_qty_p";
	public static final String $gr_xfr_qty_p = "gr_xfr_qty_p";
	public static final String $gr_rcv_qty_p = "gr_rcv_qty_p";
	public static final String $gr_stk_xfr_qty_p = "gr_stk_xfr_qty_p";
	public static final String $gr_ac_xfr_qty_p = "gr_ac_xfr_qty_p";
	public static final String $gi_total_qty_p = "gi_total_qty_p";
	public static final String $gi_input_qty_p = "gi_input_qty_p";
	public static final String $gi_insp_qty_p = "gi_insp_qty_p";
	public static final String $gi_xfr_qty_p = "gi_xfr_qty_p";
	public static final String $rcv_ret_qty_p = "rcv_ret_qty_p";
	public static final String $gi_stk_xfr_qty_p = "gi_stk_xfr_qty_p";
	public static final String $gi_ac_xfr_qty_p = "gi_ac_xfr_qty_p";
	public static final String $stktk_minus_qty_p = "stktk_minus_qty_p";
	public static final String $sls_qty_p = "sls_qty_p";
	public static final String $end_stk_qty_p = "end_stk_qty_p";
	public static final String $ini_stk_amt_p = "ini_stk_amt_p";
	public static final String $gr_total_amt_p = "gr_total_amt_p";
	public static final String $purc_bf_accpt_amt_p = "purc_bf_accpt_amt_p";
	public static final String $gr_purc_amt_p = "gr_purc_amt_p";
	public static final String $accpt_dfct_amt_p = "accpt_dfct_amt_p";
	public static final String $gr_prod_amt_p = "gr_prod_amt_p";
	public static final String $gr_xfr_amt_p = "gr_xfr_amt_p";
	public static final String $gr_rcv_amt_p = "gr_rcv_amt_p";
	public static final String $gr_stk_xfr_amt_p = "gr_stk_xfr_amt_p";
	public static final String $gr_ac_xfr_amt_p = "gr_ac_xfr_amt_p";
	public static final String $gi_total_amt_p = "gi_total_amt_p";
	public static final String $gi_input_amt_p = "gi_input_amt_p";
	public static final String $gi_insp_amt_p = "gi_insp_amt_p";
	public static final String $gi_xfr_amt_p = "gi_xfr_amt_p";
	public static final String $rcv_ret_amt_p = "rcv_ret_amt_p";
	public static final String $gi_stk_xfr_amt_p = "gi_stk_xfr_amt_p";
	public static final String $gi_ac_xfr_amt_p = "gi_ac_xfr_amt_p";
	public static final String $stktk_minus_amt_p = "stktk_minus_amt_p";
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
	public static final String $ini_stk_qty = $ini_stk_qty_p + ".qty";
	public static final String $gr_total_qty = $gr_total_qty_p + ".qty";
	public static final String $purc_bf_accpt_qty = $purc_bf_accpt_qty_p + ".qty";
	public static final String $gr_purc_qty = $gr_purc_qty_p + ".qty";
	public static final String $accpt_dfct_qty = $accpt_dfct_qty_p + ".qty";
	public static final String $gr_prod_qty = $gr_prod_qty_p + ".qty";
	public static final String $gr_xfr_qty = $gr_xfr_qty_p + ".qty";
	public static final String $gr_rcv_qty = $gr_rcv_qty_p + ".qty";
	public static final String $gr_stk_xfr_qty = $gr_stk_xfr_qty_p + ".qty";
	public static final String $gr_ac_xfr_qty = $gr_ac_xfr_qty_p + ".qty";
	public static final String $gi_total_qty = $gi_total_qty_p + ".qty";
	public static final String $gi_input_qty = $gi_input_qty_p + ".qty";
	public static final String $gi_insp_qty = $gi_insp_qty_p + ".qty";
	public static final String $gi_xfr_qty = $gi_xfr_qty_p + ".qty";
	public static final String $rcv_ret_qty = $rcv_ret_qty_p + ".qty";
	public static final String $gi_stk_xfr_qty = $gi_stk_xfr_qty_p + ".qty";
	public static final String $gi_ac_xfr_qty = $gi_ac_xfr_qty_p + ".qty";
	public static final String $stktk_minus_qty = $stktk_minus_qty_p + ".qty";
	public static final String $sls_qty = $sls_qty_p + ".qty";
	public static final String $end_stk_qty = $end_stk_qty_p + ".qty";
	public static final String $ini_stk_amt = $ini_stk_amt_p + ".amt";
	public static final String $gr_total_amt = $gr_total_amt_p + ".amt";
	public static final String $purc_bf_accpt_amt = $purc_bf_accpt_amt_p + ".amt";
	public static final String $gr_purc_amt = $gr_purc_amt_p + ".amt";
	public static final String $accpt_dfct_amt = $accpt_dfct_amt_p + ".amt";
	public static final String $gr_prod_amt = $gr_prod_amt_p + ".amt";
	public static final String $gr_xfr_amt = $gr_xfr_amt_p + ".amt";
	public static final String $gr_rcv_amt = $gr_rcv_amt_p + ".amt";
	public static final String $gr_stk_xfr_amt = $gr_stk_xfr_amt_p + ".amt";
	public static final String $gr_ac_xfr_amt = $gr_ac_xfr_amt_p + ".amt";
	public static final String $gi_total_amt = $gi_total_amt_p + ".amt";
	public static final String $gi_input_amt = $gi_input_amt_p + ".amt";
	public static final String $gi_insp_amt = $gi_insp_amt_p + ".amt";
	public static final String $gi_xfr_amt = $gi_xfr_amt_p + ".amt";
	public static final String $rcv_ret_amt = $rcv_ret_amt_p + ".amt";
	public static final String $gi_stk_xfr_amt = $gi_stk_xfr_amt_p + ".amt";
	public static final String $gi_ac_xfr_amt = $gi_ac_xfr_amt_p + ".amt";
	public static final String $stktk_minus_amt = $stktk_minus_amt_p + ".amt";
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
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_dec_place_META = createCommonMeta($base_cur_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_rnd_typ_META = createCommonMeta($base_cur_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta ini_stk_qty_p_META = createInnerRowMeta($ini_stk_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gr_total_qty_p_META = createInnerRowMeta($gr_total_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_bf_accpt_qty_p_META = createInnerRowMeta($purc_bf_accpt_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gr_purc_qty_p_META = createInnerRowMeta($gr_purc_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta accpt_dfct_qty_p_META = createInnerRowMeta($accpt_dfct_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gr_prod_qty_p_META = createInnerRowMeta($gr_prod_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gr_xfr_qty_p_META = createInnerRowMeta($gr_xfr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gr_rcv_qty_p_META = createInnerRowMeta($gr_rcv_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gr_stk_xfr_qty_p_META = createInnerRowMeta($gr_stk_xfr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gr_ac_xfr_qty_p_META = createInnerRowMeta($gr_ac_xfr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gi_total_qty_p_META = createInnerRowMeta($gi_total_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gi_input_qty_p_META = createInnerRowMeta($gi_input_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gi_insp_qty_p_META = createInnerRowMeta($gi_insp_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gi_xfr_qty_p_META = createInnerRowMeta($gi_xfr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta rcv_ret_qty_p_META = createInnerRowMeta($rcv_ret_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gi_stk_xfr_qty_p_META = createInnerRowMeta($gi_stk_xfr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gi_ac_xfr_qty_p_META = createInnerRowMeta($gi_ac_xfr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta stktk_minus_qty_p_META = createInnerRowMeta($stktk_minus_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta sls_qty_p_META = createInnerRowMeta($sls_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta end_stk_qty_p_META = createInnerRowMeta($end_stk_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta ini_stk_amt_p_META = createInnerRowMeta($ini_stk_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta gr_total_amt_p_META = createInnerRowMeta($gr_total_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta purc_bf_accpt_amt_p_META = createInnerRowMeta($purc_bf_accpt_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta gr_purc_amt_p_META = createInnerRowMeta($gr_purc_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta accpt_dfct_amt_p_META = createInnerRowMeta($accpt_dfct_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta gr_prod_amt_p_META = createInnerRowMeta($gr_prod_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta gr_xfr_amt_p_META = createInnerRowMeta($gr_xfr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta gr_rcv_amt_p_META = createInnerRowMeta($gr_rcv_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta gr_stk_xfr_amt_p_META = createInnerRowMeta($gr_stk_xfr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta gr_ac_xfr_amt_p_META = createInnerRowMeta($gr_ac_xfr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta gi_total_amt_p_META = createInnerRowMeta($gi_total_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta gi_input_amt_p_META = createInnerRowMeta($gi_input_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta gi_insp_amt_p_META = createInnerRowMeta($gi_insp_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta gi_xfr_amt_p_META = createInnerRowMeta($gi_xfr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta rcv_ret_amt_p_META = createInnerRowMeta($rcv_ret_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta gi_stk_xfr_amt_p_META = createInnerRowMeta($gi_stk_xfr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta gi_ac_xfr_amt_p_META = createInnerRowMeta($gi_ac_xfr_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta stktk_minus_amt_p_META = createInnerRowMeta($stktk_minus_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
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
			itm_p_META,
			asst_typ_META,
			asst_typ_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			stk_arrv_bp_cd_META,
			stk_arrv_bp_nm_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_cur_cd_META,
			base_cur_nm_META,
			base_cur_dec_place_META,
			base_cur_rnd_typ_META,
			ini_stk_qty_p_META,
			gr_total_qty_p_META,
			purc_bf_accpt_qty_p_META,
			gr_purc_qty_p_META,
			accpt_dfct_qty_p_META,
			gr_prod_qty_p_META,
			gr_xfr_qty_p_META,
			gr_rcv_qty_p_META,
			gr_stk_xfr_qty_p_META,
			gr_ac_xfr_qty_p_META,
			gi_total_qty_p_META,
			gi_input_qty_p_META,
			gi_insp_qty_p_META,
			gi_xfr_qty_p_META,
			rcv_ret_qty_p_META,
			gi_stk_xfr_qty_p_META,
			gi_ac_xfr_qty_p_META,
			stktk_minus_qty_p_META,
			sls_qty_p_META,
			end_stk_qty_p_META,
			ini_stk_amt_p_META,
			gr_total_amt_p_META,
			purc_bf_accpt_amt_p_META,
			gr_purc_amt_p_META,
			accpt_dfct_amt_p_META,
			gr_prod_amt_p_META,
			gr_xfr_amt_p_META,
			gr_rcv_amt_p_META,
			gr_stk_xfr_amt_p_META,
			gr_ac_xfr_amt_p_META,
			gi_total_amt_p_META,
			gi_input_amt_p_META,
			gi_insp_amt_p_META,
			gi_xfr_amt_p_META,
			rcv_ret_amt_p_META,
			gi_stk_xfr_amt_p_META,
			gi_ac_xfr_amt_p_META,
			stktk_minus_amt_p_META,
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
				"ini_stk_qty",
				"gr_total_qty",
				"purc_bf_accpt_qty",
				"gr_purc_qty",
				"accpt_dfct_qty",
				"gr_prod_qty",
				"gr_xfr_qty",
				"gr_rcv_qty",
				"gr_stk_xfr_qty",
				"gr_ac_xfr_qty",
				"gi_total_qty",
				"gi_input_qty",
				"gi_insp_qty",
				"gi_xfr_qty",
				"rcv_ret_qty",
				"gi_stk_xfr_qty",
				"gi_ac_xfr_qty",
				"stktk_minus_qty",
				"sls_qty",
				"end_stk_qty",
				"ini_stk_amt",
				"gr_total_amt",
				"purc_bf_accpt_amt",
				"gr_purc_amt",
				"accpt_dfct_amt",
				"gr_prod_amt",
				"gr_xfr_amt",
				"gr_rcv_amt",
				"gr_stk_xfr_amt",
				"gr_ac_xfr_amt",
				"gi_total_amt",
				"gi_input_amt",
				"gi_insp_amt",
				"gi_xfr_amt",
				"rcv_ret_amt",
				"gi_stk_xfr_amt",
				"gi_ac_xfr_amt",
				"stktk_minus_amt",
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
				$ini_stk_qty,
				$gr_total_qty,
				$purc_bf_accpt_qty,
				$gr_purc_qty,
				$accpt_dfct_qty,
				$gr_prod_qty,
				$gr_xfr_qty,
				$gr_rcv_qty,
				$gr_stk_xfr_qty,
				$gr_ac_xfr_qty,
				$gi_total_qty,
				$gi_input_qty,
				$gi_insp_qty,
				$gi_xfr_qty,
				$rcv_ret_qty,
				$gi_stk_xfr_qty,
				$gi_ac_xfr_qty,
				$stktk_minus_qty,
				$sls_qty,
				$end_stk_qty,
				$ini_stk_amt,
				$gr_total_amt,
				$purc_bf_accpt_amt,
				$gr_purc_amt,
				$accpt_dfct_amt,
				$gr_prod_amt,
				$gr_xfr_amt,
				$gr_rcv_amt,
				$gr_stk_xfr_amt,
				$gr_ac_xfr_amt,
				$gi_total_amt,
				$gi_input_amt,
				$gi_insp_amt,
				$gi_xfr_amt,
				$rcv_ret_amt,
				$gi_stk_xfr_amt,
				$gi_ac_xfr_amt,
				$stktk_minus_amt,
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
				{$wg_nm, "WG"}	// wg_nm
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


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 3, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 3, $itm_p, row);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 4, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 4, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 5, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 5, $asst_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 6, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 6, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 7, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 7, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 8, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 8, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 9, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 9, $stk_bp_nm, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 10, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 10, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 11, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 11, $stk_arrv_bp_nm, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 12, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 12, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 13, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 13, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 14, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 14, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 14, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 14, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 14, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 14, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 15, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 15, $base_unit_rnd_typ, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 16, $base_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 16, $base_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 17, $base_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 17, $base_cur_nm, value);
	}


	/**
	 * Currency unit number of decimal places 通貨単位小数有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_dec_place() {
		return getConstNumber(offset + 18, $base_cur_dec_place);
	}

	/**
	 * Currency unit number of decimal places 通貨単位小数有効桁数.<p>
	 *
	 */
	public void base_cur_dec_place(MCNumber value) {
		setConstNumber(offset + 18, $base_cur_dec_place, value);
	}

	/**
	 * Currency unit number of decimal places 通貨単位小数有効桁数.<p>
	 *
	 */
	public void base_cur_dec_place(int value) {
		setConstNumber(offset + 18, $base_cur_dec_place, value);
	}

	/**
	 * Currency unit number of decimal places 通貨単位小数有効桁数.<p>
	 *
	 */
	public void base_cur_dec_place(long value) {
		setConstNumber(offset + 18, $base_cur_dec_place, value);
	}

	/**
	 * Currency unit number of decimal places 通貨単位小数有効桁数.<p>
	 *
	 */
	public void base_cur_dec_place(float value) {
		setConstNumber(offset + 18, $base_cur_dec_place, value);
	}

	/**
	 * Currency unit number of decimal places 通貨単位小数有効桁数.<p>
	 *
	 */
	public void base_cur_dec_place(double value) {
		setConstNumber(offset + 18, $base_cur_dec_place, value);
	}


	/**
	 * Currency unit rounding type 通貨単位端数処理区分.<p>
	 *
	 */
	public String base_cur_rnd_typ() {
		return getConstString(offset + 19, $base_cur_rnd_typ);
	}

	/**
	 * Currency unit rounding type 通貨単位端数処理区分.<p>
	 *
	 */
	public void base_cur_rnd_typ(String value) {
		setConstString(offset + 19, $base_cur_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR ini_stk_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 20, $ini_stk_qty_p);
	}
	
	public void ini_stk_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 20, $ini_stk_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR gr_total_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 21, $gr_total_qty_p);
	}
	
	public void gr_total_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 21, $gr_total_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_bf_accpt_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 22, $purc_bf_accpt_qty_p);
	}
	
	public void purc_bf_accpt_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 22, $purc_bf_accpt_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR gr_purc_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 23, $gr_purc_qty_p);
	}
	
	public void gr_purc_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 23, $gr_purc_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR accpt_dfct_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 24, $accpt_dfct_qty_p);
	}
	
	public void accpt_dfct_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 24, $accpt_dfct_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR gr_prod_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 25, $gr_prod_qty_p);
	}
	
	public void gr_prod_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 25, $gr_prod_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR gr_xfr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 26, $gr_xfr_qty_p);
	}
	
	public void gr_xfr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 26, $gr_xfr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR gr_rcv_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 27, $gr_rcv_qty_p);
	}
	
	public void gr_rcv_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 27, $gr_rcv_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR gr_stk_xfr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 28, $gr_stk_xfr_qty_p);
	}
	
	public void gr_stk_xfr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 28, $gr_stk_xfr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR gr_ac_xfr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 29, $gr_ac_xfr_qty_p);
	}
	
	public void gr_ac_xfr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 29, $gr_ac_xfr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR gi_total_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 30, $gi_total_qty_p);
	}
	
	public void gi_total_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 30, $gi_total_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR gi_input_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 31, $gi_input_qty_p);
	}
	
	public void gi_input_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 31, $gi_input_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR gi_insp_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 32, $gi_insp_qty_p);
	}
	
	public void gi_insp_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 32, $gi_insp_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR gi_xfr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 33, $gi_xfr_qty_p);
	}
	
	public void gi_xfr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 33, $gi_xfr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR rcv_ret_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 34, $rcv_ret_qty_p);
	}
	
	public void rcv_ret_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 34, $rcv_ret_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR gi_stk_xfr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 35, $gi_stk_xfr_qty_p);
	}
	
	public void gi_stk_xfr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 35, $gi_stk_xfr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR gi_ac_xfr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 36, $gi_ac_xfr_qty_p);
	}
	
	public void gi_ac_xfr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 36, $gi_ac_xfr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR stktk_minus_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 37, $stktk_minus_qty_p);
	}
	
	public void stktk_minus_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 37, $stktk_minus_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR sls_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 38, $sls_qty_p);
	}
	
	public void sls_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 38, $sls_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR end_stk_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 39, $end_stk_qty_p);
	}
	
	public void end_stk_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 39, $end_stk_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ini_stk_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 40, $ini_stk_amt_p);
	}
	
	public void ini_stk_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 40, $ini_stk_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR gr_total_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 41, $gr_total_amt_p);
	}
	
	public void gr_total_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 41, $gr_total_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR purc_bf_accpt_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 42, $purc_bf_accpt_amt_p);
	}
	
	public void purc_bf_accpt_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 42, $purc_bf_accpt_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR gr_purc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 43, $gr_purc_amt_p);
	}
	
	public void gr_purc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 43, $gr_purc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR accpt_dfct_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 44, $accpt_dfct_amt_p);
	}
	
	public void accpt_dfct_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 44, $accpt_dfct_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR gr_prod_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 45, $gr_prod_amt_p);
	}
	
	public void gr_prod_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 45, $gr_prod_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR gr_xfr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 46, $gr_xfr_amt_p);
	}
	
	public void gr_xfr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 46, $gr_xfr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR gr_rcv_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 47, $gr_rcv_amt_p);
	}
	
	public void gr_rcv_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 47, $gr_rcv_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR gr_stk_xfr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 48, $gr_stk_xfr_amt_p);
	}
	
	public void gr_stk_xfr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 48, $gr_stk_xfr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR gr_ac_xfr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 49, $gr_ac_xfr_amt_p);
	}
	
	public void gr_ac_xfr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 49, $gr_ac_xfr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR gi_total_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 50, $gi_total_amt_p);
	}
	
	public void gi_total_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 50, $gi_total_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR gi_input_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 51, $gi_input_amt_p);
	}
	
	public void gi_input_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 51, $gi_input_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR gi_insp_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 52, $gi_insp_amt_p);
	}
	
	public void gi_insp_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 52, $gi_insp_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR gi_xfr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 53, $gi_xfr_amt_p);
	}
	
	public void gi_xfr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 53, $gi_xfr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR rcv_ret_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 54, $rcv_ret_amt_p);
	}
	
	public void rcv_ret_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 54, $rcv_ret_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR gi_stk_xfr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 55, $gi_stk_xfr_amt_p);
	}
	
	public void gi_stk_xfr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 55, $gi_stk_xfr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR gi_ac_xfr_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 56, $gi_ac_xfr_amt_p);
	}
	
	public void gi_ac_xfr_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 56, $gi_ac_xfr_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR stktk_minus_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 57, $stktk_minus_amt_p);
	}
	
	public void stktk_minus_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 57, $stktk_minus_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR sls_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 58, $sls_amt_p);
	}
	
	public void sls_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 58, $sls_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR end_stk_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 59, $end_stk_amt_p);
	}
	
	public void end_stk_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 59, $end_stk_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR std_unit_cost_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 60, $std_unit_cost_amt_p);
	}
	
	public void std_unit_cost_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 60, $std_unit_cost_amt_p, row);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 61, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 61, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 62, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 62, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 63, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 63, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 64, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 64, $itm_typ_d_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 65, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 65, $itm_grp_p, row);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($ini_stk_qty_p.equalsIgnoreCase(name)) {
			return ini_stk_qty_p();
		}
		if ($gr_total_qty_p.equalsIgnoreCase(name)) {
			return gr_total_qty_p();
		}
		if ($purc_bf_accpt_qty_p.equalsIgnoreCase(name)) {
			return purc_bf_accpt_qty_p();
		}
		if ($gr_purc_qty_p.equalsIgnoreCase(name)) {
			return gr_purc_qty_p();
		}
		if ($accpt_dfct_qty_p.equalsIgnoreCase(name)) {
			return accpt_dfct_qty_p();
		}
		if ($gr_prod_qty_p.equalsIgnoreCase(name)) {
			return gr_prod_qty_p();
		}
		if ($gr_xfr_qty_p.equalsIgnoreCase(name)) {
			return gr_xfr_qty_p();
		}
		if ($gr_rcv_qty_p.equalsIgnoreCase(name)) {
			return gr_rcv_qty_p();
		}
		if ($gr_stk_xfr_qty_p.equalsIgnoreCase(name)) {
			return gr_stk_xfr_qty_p();
		}
		if ($gr_ac_xfr_qty_p.equalsIgnoreCase(name)) {
			return gr_ac_xfr_qty_p();
		}
		if ($gi_total_qty_p.equalsIgnoreCase(name)) {
			return gi_total_qty_p();
		}
		if ($gi_input_qty_p.equalsIgnoreCase(name)) {
			return gi_input_qty_p();
		}
		if ($gi_insp_qty_p.equalsIgnoreCase(name)) {
			return gi_insp_qty_p();
		}
		if ($gi_xfr_qty_p.equalsIgnoreCase(name)) {
			return gi_xfr_qty_p();
		}
		if ($rcv_ret_qty_p.equalsIgnoreCase(name)) {
			return rcv_ret_qty_p();
		}
		if ($gi_stk_xfr_qty_p.equalsIgnoreCase(name)) {
			return gi_stk_xfr_qty_p();
		}
		if ($gi_ac_xfr_qty_p.equalsIgnoreCase(name)) {
			return gi_ac_xfr_qty_p();
		}
		if ($stktk_minus_qty_p.equalsIgnoreCase(name)) {
			return stktk_minus_qty_p();
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
		if ($purc_bf_accpt_amt_p.equalsIgnoreCase(name)) {
			return purc_bf_accpt_amt_p();
		}
		if ($gr_purc_amt_p.equalsIgnoreCase(name)) {
			return gr_purc_amt_p();
		}
		if ($accpt_dfct_amt_p.equalsIgnoreCase(name)) {
			return accpt_dfct_amt_p();
		}
		if ($gr_prod_amt_p.equalsIgnoreCase(name)) {
			return gr_prod_amt_p();
		}
		if ($gr_xfr_amt_p.equalsIgnoreCase(name)) {
			return gr_xfr_amt_p();
		}
		if ($gr_rcv_amt_p.equalsIgnoreCase(name)) {
			return gr_rcv_amt_p();
		}
		if ($gr_stk_xfr_amt_p.equalsIgnoreCase(name)) {
			return gr_stk_xfr_amt_p();
		}
		if ($gr_ac_xfr_amt_p.equalsIgnoreCase(name)) {
			return gr_ac_xfr_amt_p();
		}
		if ($gi_total_amt_p.equalsIgnoreCase(name)) {
			return gi_total_amt_p();
		}
		if ($gi_input_amt_p.equalsIgnoreCase(name)) {
			return gi_input_amt_p();
		}
		if ($gi_insp_amt_p.equalsIgnoreCase(name)) {
			return gi_insp_amt_p();
		}
		if ($gi_xfr_amt_p.equalsIgnoreCase(name)) {
			return gi_xfr_amt_p();
		}
		if ($rcv_ret_amt_p.equalsIgnoreCase(name)) {
			return rcv_ret_amt_p();
		}
		if ($gi_stk_xfr_amt_p.equalsIgnoreCase(name)) {
			return gi_stk_xfr_amt_p();
		}
		if ($gi_ac_xfr_amt_p.equalsIgnoreCase(name)) {
			return gi_ac_xfr_amt_p();
		}
		if ($stktk_minus_amt_p.equalsIgnoreCase(name)) {
			return stktk_minus_amt_p();
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
		if ($purc_bf_accpt_qty_p.equalsIgnoreCase(name)) {
			purc_bf_accpt_qty_p(
				((MCContainerMeta) purc_bf_accpt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($gr_purc_qty_p.equalsIgnoreCase(name)) {
			gr_purc_qty_p(
				((MCContainerMeta) gr_purc_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($accpt_dfct_qty_p.equalsIgnoreCase(name)) {
			accpt_dfct_qty_p(
				((MCContainerMeta) accpt_dfct_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($gr_prod_qty_p.equalsIgnoreCase(name)) {
			gr_prod_qty_p(
				((MCContainerMeta) gr_prod_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($gr_xfr_qty_p.equalsIgnoreCase(name)) {
			gr_xfr_qty_p(
				((MCContainerMeta) gr_xfr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($gr_rcv_qty_p.equalsIgnoreCase(name)) {
			gr_rcv_qty_p(
				((MCContainerMeta) gr_rcv_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($gr_stk_xfr_qty_p.equalsIgnoreCase(name)) {
			gr_stk_xfr_qty_p(
				((MCContainerMeta) gr_stk_xfr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($gr_ac_xfr_qty_p.equalsIgnoreCase(name)) {
			gr_ac_xfr_qty_p(
				((MCContainerMeta) gr_ac_xfr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($gi_total_qty_p.equalsIgnoreCase(name)) {
			gi_total_qty_p(
				((MCContainerMeta) gi_total_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($gi_input_qty_p.equalsIgnoreCase(name)) {
			gi_input_qty_p(
				((MCContainerMeta) gi_input_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($gi_insp_qty_p.equalsIgnoreCase(name)) {
			gi_insp_qty_p(
				((MCContainerMeta) gi_insp_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($gi_xfr_qty_p.equalsIgnoreCase(name)) {
			gi_xfr_qty_p(
				((MCContainerMeta) gi_xfr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($rcv_ret_qty_p.equalsIgnoreCase(name)) {
			rcv_ret_qty_p(
				((MCContainerMeta) rcv_ret_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($gi_stk_xfr_qty_p.equalsIgnoreCase(name)) {
			gi_stk_xfr_qty_p(
				((MCContainerMeta) gi_stk_xfr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($gi_ac_xfr_qty_p.equalsIgnoreCase(name)) {
			gi_ac_xfr_qty_p(
				((MCContainerMeta) gi_ac_xfr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($stktk_minus_qty_p.equalsIgnoreCase(name)) {
			stktk_minus_qty_p(
				((MCContainerMeta) stktk_minus_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
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
		if ($purc_bf_accpt_amt_p.equalsIgnoreCase(name)) {
			purc_bf_accpt_amt_p(
				((MCContainerMeta) purc_bf_accpt_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($gr_purc_amt_p.equalsIgnoreCase(name)) {
			gr_purc_amt_p(
				((MCContainerMeta) gr_purc_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($accpt_dfct_amt_p.equalsIgnoreCase(name)) {
			accpt_dfct_amt_p(
				((MCContainerMeta) accpt_dfct_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($gr_prod_amt_p.equalsIgnoreCase(name)) {
			gr_prod_amt_p(
				((MCContainerMeta) gr_prod_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($gr_xfr_amt_p.equalsIgnoreCase(name)) {
			gr_xfr_amt_p(
				((MCContainerMeta) gr_xfr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($gr_rcv_amt_p.equalsIgnoreCase(name)) {
			gr_rcv_amt_p(
				((MCContainerMeta) gr_rcv_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($gr_stk_xfr_amt_p.equalsIgnoreCase(name)) {
			gr_stk_xfr_amt_p(
				((MCContainerMeta) gr_stk_xfr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($gr_ac_xfr_amt_p.equalsIgnoreCase(name)) {
			gr_ac_xfr_amt_p(
				((MCContainerMeta) gr_ac_xfr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($gi_total_amt_p.equalsIgnoreCase(name)) {
			gi_total_amt_p(
				((MCContainerMeta) gi_total_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($gi_input_amt_p.equalsIgnoreCase(name)) {
			gi_input_amt_p(
				((MCContainerMeta) gi_input_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($gi_insp_amt_p.equalsIgnoreCase(name)) {
			gi_insp_amt_p(
				((MCContainerMeta) gi_insp_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($gi_xfr_amt_p.equalsIgnoreCase(name)) {
			gi_xfr_amt_p(
				((MCContainerMeta) gi_xfr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($rcv_ret_amt_p.equalsIgnoreCase(name)) {
			rcv_ret_amt_p(
				((MCContainerMeta) rcv_ret_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($gi_stk_xfr_amt_p.equalsIgnoreCase(name)) {
			gi_stk_xfr_amt_p(
				((MCContainerMeta) gi_stk_xfr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($gi_ac_xfr_amt_p.equalsIgnoreCase(name)) {
			gi_ac_xfr_amt_p(
				((MCContainerMeta) gi_ac_xfr_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($stktk_minus_amt_p.equalsIgnoreCase(name)) {
			stktk_minus_amt_p(
				((MCContainerMeta) stktk_minus_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
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
	 * Receipt qty. before acceptance 検収前入荷数量.<p>
	 *
	 */
	public MCNumber purc_bf_accpt_qty() {
		return purc_bf_accpt_qty_p().qty();
	}

	/**
	 * Receipt qty. before acceptance 検収前入荷数量.<p>
	 *
	 */
	public void purc_bf_accpt_qty(MCNumber value) {
		purc_bf_accpt_qty_p().qty(value);
	}

	/**
	 * Receipt qty. before acceptance 検収前入荷数量.<p>
	 *
	 */
	public void purc_bf_accpt_qty(int value) {
		purc_bf_accpt_qty_p().qty(value);
	}

	/**
	 * Receipt qty. before acceptance 検収前入荷数量.<p>
	 *
	 */
	public void purc_bf_accpt_qty(long value) {
		purc_bf_accpt_qty_p().qty(value);
	}

	/**
	 * Receipt qty. before acceptance 検収前入荷数量.<p>
	 *
	 */
	public void purc_bf_accpt_qty(float value) {
		purc_bf_accpt_qty_p().qty(value);
	}

	/**
	 * Receipt qty. before acceptance 検収前入荷数量.<p>
	 *
	 */
	public void purc_bf_accpt_qty(double value) {
		purc_bf_accpt_qty_p().qty(value);
	}

	/**
	 * Purchase GR qty. 購入入庫数量.<p>
	 *
	 */
	public MCNumber gr_purc_qty() {
		return gr_purc_qty_p().qty();
	}

	/**
	 * Purchase GR qty. 購入入庫数量.<p>
	 *
	 */
	public void gr_purc_qty(MCNumber value) {
		gr_purc_qty_p().qty(value);
	}

	/**
	 * Purchase GR qty. 購入入庫数量.<p>
	 *
	 */
	public void gr_purc_qty(int value) {
		gr_purc_qty_p().qty(value);
	}

	/**
	 * Purchase GR qty. 購入入庫数量.<p>
	 *
	 */
	public void gr_purc_qty(long value) {
		gr_purc_qty_p().qty(value);
	}

	/**
	 * Purchase GR qty. 購入入庫数量.<p>
	 *
	 */
	public void gr_purc_qty(float value) {
		gr_purc_qty_p().qty(value);
	}

	/**
	 * Purchase GR qty. 購入入庫数量.<p>
	 *
	 */
	public void gr_purc_qty(double value) {
		gr_purc_qty_p().qty(value);
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public MCNumber accpt_dfct_qty() {
		return accpt_dfct_qty_p().qty();
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public void accpt_dfct_qty(MCNumber value) {
		accpt_dfct_qty_p().qty(value);
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public void accpt_dfct_qty(int value) {
		accpt_dfct_qty_p().qty(value);
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public void accpt_dfct_qty(long value) {
		accpt_dfct_qty_p().qty(value);
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public void accpt_dfct_qty(float value) {
		accpt_dfct_qty_p().qty(value);
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public void accpt_dfct_qty(double value) {
		accpt_dfct_qty_p().qty(value);
	}

	/**
	 * Mfg. GR qty. 製造入庫数量.<p>
	 *
	 */
	public MCNumber gr_prod_qty() {
		return gr_prod_qty_p().qty();
	}

	/**
	 * Mfg. GR qty. 製造入庫数量.<p>
	 *
	 */
	public void gr_prod_qty(MCNumber value) {
		gr_prod_qty_p().qty(value);
	}

	/**
	 * Mfg. GR qty. 製造入庫数量.<p>
	 *
	 */
	public void gr_prod_qty(int value) {
		gr_prod_qty_p().qty(value);
	}

	/**
	 * Mfg. GR qty. 製造入庫数量.<p>
	 *
	 */
	public void gr_prod_qty(long value) {
		gr_prod_qty_p().qty(value);
	}

	/**
	 * Mfg. GR qty. 製造入庫数量.<p>
	 *
	 */
	public void gr_prod_qty(float value) {
		gr_prod_qty_p().qty(value);
	}

	/**
	 * Mfg. GR qty. 製造入庫数量.<p>
	 *
	 */
	public void gr_prod_qty(double value) {
		gr_prod_qty_p().qty(value);
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public MCNumber gr_xfr_qty() {
		return gr_xfr_qty_p().qty();
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public void gr_xfr_qty(MCNumber value) {
		gr_xfr_qty_p().qty(value);
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public void gr_xfr_qty(int value) {
		gr_xfr_qty_p().qty(value);
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public void gr_xfr_qty(long value) {
		gr_xfr_qty_p().qty(value);
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public void gr_xfr_qty(float value) {
		gr_xfr_qty_p().qty(value);
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public void gr_xfr_qty(double value) {
		gr_xfr_qty_p().qty(value);
	}

	/**
	 * Receiving GR qty. 受給入庫数量.<p>
	 *
	 */
	public MCNumber gr_rcv_qty() {
		return gr_rcv_qty_p().qty();
	}

	/**
	 * Receiving GR qty. 受給入庫数量.<p>
	 *
	 */
	public void gr_rcv_qty(MCNumber value) {
		gr_rcv_qty_p().qty(value);
	}

	/**
	 * Receiving GR qty. 受給入庫数量.<p>
	 *
	 */
	public void gr_rcv_qty(int value) {
		gr_rcv_qty_p().qty(value);
	}

	/**
	 * Receiving GR qty. 受給入庫数量.<p>
	 *
	 */
	public void gr_rcv_qty(long value) {
		gr_rcv_qty_p().qty(value);
	}

	/**
	 * Receiving GR qty. 受給入庫数量.<p>
	 *
	 */
	public void gr_rcv_qty(float value) {
		gr_rcv_qty_p().qty(value);
	}

	/**
	 * Receiving GR qty. 受給入庫数量.<p>
	 *
	 */
	public void gr_rcv_qty(double value) {
		gr_rcv_qty_p().qty(value);
	}

	/**
	 * Inventory transfer GR qty. 在庫振替入庫数量.<p>
	 *
	 */
	public MCNumber gr_stk_xfr_qty() {
		return gr_stk_xfr_qty_p().qty();
	}

	/**
	 * Inventory transfer GR qty. 在庫振替入庫数量.<p>
	 *
	 */
	public void gr_stk_xfr_qty(MCNumber value) {
		gr_stk_xfr_qty_p().qty(value);
	}

	/**
	 * Inventory transfer GR qty. 在庫振替入庫数量.<p>
	 *
	 */
	public void gr_stk_xfr_qty(int value) {
		gr_stk_xfr_qty_p().qty(value);
	}

	/**
	 * Inventory transfer GR qty. 在庫振替入庫数量.<p>
	 *
	 */
	public void gr_stk_xfr_qty(long value) {
		gr_stk_xfr_qty_p().qty(value);
	}

	/**
	 * Inventory transfer GR qty. 在庫振替入庫数量.<p>
	 *
	 */
	public void gr_stk_xfr_qty(float value) {
		gr_stk_xfr_qty_p().qty(value);
	}

	/**
	 * Inventory transfer GR qty. 在庫振替入庫数量.<p>
	 *
	 */
	public void gr_stk_xfr_qty(double value) {
		gr_stk_xfr_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public MCNumber gr_ac_xfr_qty() {
		return gr_ac_xfr_qty_p().qty();
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public void gr_ac_xfr_qty(MCNumber value) {
		gr_ac_xfr_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public void gr_ac_xfr_qty(int value) {
		gr_ac_xfr_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public void gr_ac_xfr_qty(long value) {
		gr_ac_xfr_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public void gr_ac_xfr_qty(float value) {
		gr_ac_xfr_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public void gr_ac_xfr_qty(double value) {
		gr_ac_xfr_qty_p().qty(value);
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
	 * Input GI qty. 投入出庫数量.<p>
	 *
	 */
	public MCNumber gi_input_qty() {
		return gi_input_qty_p().qty();
	}

	/**
	 * Input GI qty. 投入出庫数量.<p>
	 *
	 */
	public void gi_input_qty(MCNumber value) {
		gi_input_qty_p().qty(value);
	}

	/**
	 * Input GI qty. 投入出庫数量.<p>
	 *
	 */
	public void gi_input_qty(int value) {
		gi_input_qty_p().qty(value);
	}

	/**
	 * Input GI qty. 投入出庫数量.<p>
	 *
	 */
	public void gi_input_qty(long value) {
		gi_input_qty_p().qty(value);
	}

	/**
	 * Input GI qty. 投入出庫数量.<p>
	 *
	 */
	public void gi_input_qty(float value) {
		gi_input_qty_p().qty(value);
	}

	/**
	 * Input GI qty. 投入出庫数量.<p>
	 *
	 */
	public void gi_input_qty(double value) {
		gi_input_qty_p().qty(value);
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public MCNumber gi_insp_qty() {
		return gi_insp_qty_p().qty();
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public void gi_insp_qty(MCNumber value) {
		gi_insp_qty_p().qty(value);
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public void gi_insp_qty(int value) {
		gi_insp_qty_p().qty(value);
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public void gi_insp_qty(long value) {
		gi_insp_qty_p().qty(value);
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public void gi_insp_qty(float value) {
		gi_insp_qty_p().qty(value);
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public void gi_insp_qty(double value) {
		gi_insp_qty_p().qty(value);
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public MCNumber gi_xfr_qty() {
		return gi_xfr_qty_p().qty();
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public void gi_xfr_qty(MCNumber value) {
		gi_xfr_qty_p().qty(value);
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public void gi_xfr_qty(int value) {
		gi_xfr_qty_p().qty(value);
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public void gi_xfr_qty(long value) {
		gi_xfr_qty_p().qty(value);
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public void gi_xfr_qty(float value) {
		gi_xfr_qty_p().qty(value);
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public void gi_xfr_qty(double value) {
		gi_xfr_qty_p().qty(value);
	}

	/**
	 * Receiving return qty. 受給戻し数量.<p>
	 *
	 */
	public MCNumber rcv_ret_qty() {
		return rcv_ret_qty_p().qty();
	}

	/**
	 * Receiving return qty. 受給戻し数量.<p>
	 *
	 */
	public void rcv_ret_qty(MCNumber value) {
		rcv_ret_qty_p().qty(value);
	}

	/**
	 * Receiving return qty. 受給戻し数量.<p>
	 *
	 */
	public void rcv_ret_qty(int value) {
		rcv_ret_qty_p().qty(value);
	}

	/**
	 * Receiving return qty. 受給戻し数量.<p>
	 *
	 */
	public void rcv_ret_qty(long value) {
		rcv_ret_qty_p().qty(value);
	}

	/**
	 * Receiving return qty. 受給戻し数量.<p>
	 *
	 */
	public void rcv_ret_qty(float value) {
		rcv_ret_qty_p().qty(value);
	}

	/**
	 * Receiving return qty. 受給戻し数量.<p>
	 *
	 */
	public void rcv_ret_qty(double value) {
		rcv_ret_qty_p().qty(value);
	}

	/**
	 * Inventory transfer GI qty. 在庫振替出庫数量.<p>
	 *
	 */
	public MCNumber gi_stk_xfr_qty() {
		return gi_stk_xfr_qty_p().qty();
	}

	/**
	 * Inventory transfer GI qty. 在庫振替出庫数量.<p>
	 *
	 */
	public void gi_stk_xfr_qty(MCNumber value) {
		gi_stk_xfr_qty_p().qty(value);
	}

	/**
	 * Inventory transfer GI qty. 在庫振替出庫数量.<p>
	 *
	 */
	public void gi_stk_xfr_qty(int value) {
		gi_stk_xfr_qty_p().qty(value);
	}

	/**
	 * Inventory transfer GI qty. 在庫振替出庫数量.<p>
	 *
	 */
	public void gi_stk_xfr_qty(long value) {
		gi_stk_xfr_qty_p().qty(value);
	}

	/**
	 * Inventory transfer GI qty. 在庫振替出庫数量.<p>
	 *
	 */
	public void gi_stk_xfr_qty(float value) {
		gi_stk_xfr_qty_p().qty(value);
	}

	/**
	 * Inventory transfer GI qty. 在庫振替出庫数量.<p>
	 *
	 */
	public void gi_stk_xfr_qty(double value) {
		gi_stk_xfr_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public MCNumber gi_ac_xfr_qty() {
		return gi_ac_xfr_qty_p().qty();
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public void gi_ac_xfr_qty(MCNumber value) {
		gi_ac_xfr_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public void gi_ac_xfr_qty(int value) {
		gi_ac_xfr_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public void gi_ac_xfr_qty(long value) {
		gi_ac_xfr_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public void gi_ac_xfr_qty(float value) {
		gi_ac_xfr_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public void gi_ac_xfr_qty(double value) {
		gi_ac_xfr_qty_p().qty(value);
	}

	/**
	 * Inventory count decreased qty. 棚卸減数量.<p>
	 *
	 */
	public MCNumber stktk_minus_qty() {
		return stktk_minus_qty_p().qty();
	}

	/**
	 * Inventory count decreased qty. 棚卸減数量.<p>
	 *
	 */
	public void stktk_minus_qty(MCNumber value) {
		stktk_minus_qty_p().qty(value);
	}

	/**
	 * Inventory count decreased qty. 棚卸減数量.<p>
	 *
	 */
	public void stktk_minus_qty(int value) {
		stktk_minus_qty_p().qty(value);
	}

	/**
	 * Inventory count decreased qty. 棚卸減数量.<p>
	 *
	 */
	public void stktk_minus_qty(long value) {
		stktk_minus_qty_p().qty(value);
	}

	/**
	 * Inventory count decreased qty. 棚卸減数量.<p>
	 *
	 */
	public void stktk_minus_qty(float value) {
		stktk_minus_qty_p().qty(value);
	}

	/**
	 * Inventory count decreased qty. 棚卸減数量.<p>
	 *
	 */
	public void stktk_minus_qty(double value) {
		stktk_minus_qty_p().qty(value);
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
	 * Receipt amount before acceptance 検収前入荷金額.<p>
	 *
	 */
	public MCNumber purc_bf_accpt_amt() {
		return purc_bf_accpt_amt_p().amt();
	}

	/**
	 * Receipt amount before acceptance 検収前入荷金額.<p>
	 *
	 */
	public void purc_bf_accpt_amt(MCNumber value) {
		purc_bf_accpt_amt_p().amt(value);
	}

	/**
	 * Receipt amount before acceptance 検収前入荷金額.<p>
	 *
	 */
	public void purc_bf_accpt_amt(int value) {
		purc_bf_accpt_amt_p().amt(value);
	}

	/**
	 * Receipt amount before acceptance 検収前入荷金額.<p>
	 *
	 */
	public void purc_bf_accpt_amt(long value) {
		purc_bf_accpt_amt_p().amt(value);
	}

	/**
	 * Receipt amount before acceptance 検収前入荷金額.<p>
	 *
	 */
	public void purc_bf_accpt_amt(float value) {
		purc_bf_accpt_amt_p().amt(value);
	}

	/**
	 * Receipt amount before acceptance 検収前入荷金額.<p>
	 *
	 */
	public void purc_bf_accpt_amt(double value) {
		purc_bf_accpt_amt_p().amt(value);
	}

	/**
	 * Purchase GR amount 購入入庫金額.<p>
	 *
	 */
	public MCNumber gr_purc_amt() {
		return gr_purc_amt_p().amt();
	}

	/**
	 * Purchase GR amount 購入入庫金額.<p>
	 *
	 */
	public void gr_purc_amt(MCNumber value) {
		gr_purc_amt_p().amt(value);
	}

	/**
	 * Purchase GR amount 購入入庫金額.<p>
	 *
	 */
	public void gr_purc_amt(int value) {
		gr_purc_amt_p().amt(value);
	}

	/**
	 * Purchase GR amount 購入入庫金額.<p>
	 *
	 */
	public void gr_purc_amt(long value) {
		gr_purc_amt_p().amt(value);
	}

	/**
	 * Purchase GR amount 購入入庫金額.<p>
	 *
	 */
	public void gr_purc_amt(float value) {
		gr_purc_amt_p().amt(value);
	}

	/**
	 * Purchase GR amount 購入入庫金額.<p>
	 *
	 */
	public void gr_purc_amt(double value) {
		gr_purc_amt_p().amt(value);
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public MCNumber accpt_dfct_amt() {
		return accpt_dfct_amt_p().amt();
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public void accpt_dfct_amt(MCNumber value) {
		accpt_dfct_amt_p().amt(value);
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public void accpt_dfct_amt(int value) {
		accpt_dfct_amt_p().amt(value);
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public void accpt_dfct_amt(long value) {
		accpt_dfct_amt_p().amt(value);
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public void accpt_dfct_amt(float value) {
		accpt_dfct_amt_p().amt(value);
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public void accpt_dfct_amt(double value) {
		accpt_dfct_amt_p().amt(value);
	}

	/**
	 * Mfg. GR amount 製造入庫金額.<p>
	 *
	 */
	public MCNumber gr_prod_amt() {
		return gr_prod_amt_p().amt();
	}

	/**
	 * Mfg. GR amount 製造入庫金額.<p>
	 *
	 */
	public void gr_prod_amt(MCNumber value) {
		gr_prod_amt_p().amt(value);
	}

	/**
	 * Mfg. GR amount 製造入庫金額.<p>
	 *
	 */
	public void gr_prod_amt(int value) {
		gr_prod_amt_p().amt(value);
	}

	/**
	 * Mfg. GR amount 製造入庫金額.<p>
	 *
	 */
	public void gr_prod_amt(long value) {
		gr_prod_amt_p().amt(value);
	}

	/**
	 * Mfg. GR amount 製造入庫金額.<p>
	 *
	 */
	public void gr_prod_amt(float value) {
		gr_prod_amt_p().amt(value);
	}

	/**
	 * Mfg. GR amount 製造入庫金額.<p>
	 *
	 */
	public void gr_prod_amt(double value) {
		gr_prod_amt_p().amt(value);
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public MCNumber gr_xfr_amt() {
		return gr_xfr_amt_p().amt();
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public void gr_xfr_amt(MCNumber value) {
		gr_xfr_amt_p().amt(value);
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public void gr_xfr_amt(int value) {
		gr_xfr_amt_p().amt(value);
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public void gr_xfr_amt(long value) {
		gr_xfr_amt_p().amt(value);
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public void gr_xfr_amt(float value) {
		gr_xfr_amt_p().amt(value);
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public void gr_xfr_amt(double value) {
		gr_xfr_amt_p().amt(value);
	}

	/**
	 * GR incoming amount 受給入庫金額.<p>
	 *
	 */
	public MCNumber gr_rcv_amt() {
		return gr_rcv_amt_p().amt();
	}

	/**
	 * GR incoming amount 受給入庫金額.<p>
	 *
	 */
	public void gr_rcv_amt(MCNumber value) {
		gr_rcv_amt_p().amt(value);
	}

	/**
	 * GR incoming amount 受給入庫金額.<p>
	 *
	 */
	public void gr_rcv_amt(int value) {
		gr_rcv_amt_p().amt(value);
	}

	/**
	 * GR incoming amount 受給入庫金額.<p>
	 *
	 */
	public void gr_rcv_amt(long value) {
		gr_rcv_amt_p().amt(value);
	}

	/**
	 * GR incoming amount 受給入庫金額.<p>
	 *
	 */
	public void gr_rcv_amt(float value) {
		gr_rcv_amt_p().amt(value);
	}

	/**
	 * GR incoming amount 受給入庫金額.<p>
	 *
	 */
	public void gr_rcv_amt(double value) {
		gr_rcv_amt_p().amt(value);
	}

	/**
	 * Inventory transfer GR amount 在庫振替入庫金額.<p>
	 *
	 */
	public MCNumber gr_stk_xfr_amt() {
		return gr_stk_xfr_amt_p().amt();
	}

	/**
	 * Inventory transfer GR amount 在庫振替入庫金額.<p>
	 *
	 */
	public void gr_stk_xfr_amt(MCNumber value) {
		gr_stk_xfr_amt_p().amt(value);
	}

	/**
	 * Inventory transfer GR amount 在庫振替入庫金額.<p>
	 *
	 */
	public void gr_stk_xfr_amt(int value) {
		gr_stk_xfr_amt_p().amt(value);
	}

	/**
	 * Inventory transfer GR amount 在庫振替入庫金額.<p>
	 *
	 */
	public void gr_stk_xfr_amt(long value) {
		gr_stk_xfr_amt_p().amt(value);
	}

	/**
	 * Inventory transfer GR amount 在庫振替入庫金額.<p>
	 *
	 */
	public void gr_stk_xfr_amt(float value) {
		gr_stk_xfr_amt_p().amt(value);
	}

	/**
	 * Inventory transfer GR amount 在庫振替入庫金額.<p>
	 *
	 */
	public void gr_stk_xfr_amt(double value) {
		gr_stk_xfr_amt_p().amt(value);
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public MCNumber gr_ac_xfr_amt() {
		return gr_ac_xfr_amt_p().amt();
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public void gr_ac_xfr_amt(MCNumber value) {
		gr_ac_xfr_amt_p().amt(value);
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public void gr_ac_xfr_amt(int value) {
		gr_ac_xfr_amt_p().amt(value);
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public void gr_ac_xfr_amt(long value) {
		gr_ac_xfr_amt_p().amt(value);
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public void gr_ac_xfr_amt(float value) {
		gr_ac_xfr_amt_p().amt(value);
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public void gr_ac_xfr_amt(double value) {
		gr_ac_xfr_amt_p().amt(value);
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
	 * Input GI amount 投入出庫金額.<p>
	 *
	 */
	public MCNumber gi_input_amt() {
		return gi_input_amt_p().amt();
	}

	/**
	 * Input GI amount 投入出庫金額.<p>
	 *
	 */
	public void gi_input_amt(MCNumber value) {
		gi_input_amt_p().amt(value);
	}

	/**
	 * Input GI amount 投入出庫金額.<p>
	 *
	 */
	public void gi_input_amt(int value) {
		gi_input_amt_p().amt(value);
	}

	/**
	 * Input GI amount 投入出庫金額.<p>
	 *
	 */
	public void gi_input_amt(long value) {
		gi_input_amt_p().amt(value);
	}

	/**
	 * Input GI amount 投入出庫金額.<p>
	 *
	 */
	public void gi_input_amt(float value) {
		gi_input_amt_p().amt(value);
	}

	/**
	 * Input GI amount 投入出庫金額.<p>
	 *
	 */
	public void gi_input_amt(double value) {
		gi_input_amt_p().amt(value);
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public MCNumber gi_insp_amt() {
		return gi_insp_amt_p().amt();
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public void gi_insp_amt(MCNumber value) {
		gi_insp_amt_p().amt(value);
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public void gi_insp_amt(int value) {
		gi_insp_amt_p().amt(value);
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public void gi_insp_amt(long value) {
		gi_insp_amt_p().amt(value);
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public void gi_insp_amt(float value) {
		gi_insp_amt_p().amt(value);
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public void gi_insp_amt(double value) {
		gi_insp_amt_p().amt(value);
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public MCNumber gi_xfr_amt() {
		return gi_xfr_amt_p().amt();
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public void gi_xfr_amt(MCNumber value) {
		gi_xfr_amt_p().amt(value);
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public void gi_xfr_amt(int value) {
		gi_xfr_amt_p().amt(value);
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public void gi_xfr_amt(long value) {
		gi_xfr_amt_p().amt(value);
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public void gi_xfr_amt(float value) {
		gi_xfr_amt_p().amt(value);
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public void gi_xfr_amt(double value) {
		gi_xfr_amt_p().amt(value);
	}

	/**
	 * Receiving return amount 受給戻し金額.<p>
	 *
	 */
	public MCNumber rcv_ret_amt() {
		return rcv_ret_amt_p().amt();
	}

	/**
	 * Receiving return amount 受給戻し金額.<p>
	 *
	 */
	public void rcv_ret_amt(MCNumber value) {
		rcv_ret_amt_p().amt(value);
	}

	/**
	 * Receiving return amount 受給戻し金額.<p>
	 *
	 */
	public void rcv_ret_amt(int value) {
		rcv_ret_amt_p().amt(value);
	}

	/**
	 * Receiving return amount 受給戻し金額.<p>
	 *
	 */
	public void rcv_ret_amt(long value) {
		rcv_ret_amt_p().amt(value);
	}

	/**
	 * Receiving return amount 受給戻し金額.<p>
	 *
	 */
	public void rcv_ret_amt(float value) {
		rcv_ret_amt_p().amt(value);
	}

	/**
	 * Receiving return amount 受給戻し金額.<p>
	 *
	 */
	public void rcv_ret_amt(double value) {
		rcv_ret_amt_p().amt(value);
	}

	/**
	 * Inventory transfer GI amount 在庫振替出庫金額.<p>
	 *
	 */
	public MCNumber gi_stk_xfr_amt() {
		return gi_stk_xfr_amt_p().amt();
	}

	/**
	 * Inventory transfer GI amount 在庫振替出庫金額.<p>
	 *
	 */
	public void gi_stk_xfr_amt(MCNumber value) {
		gi_stk_xfr_amt_p().amt(value);
	}

	/**
	 * Inventory transfer GI amount 在庫振替出庫金額.<p>
	 *
	 */
	public void gi_stk_xfr_amt(int value) {
		gi_stk_xfr_amt_p().amt(value);
	}

	/**
	 * Inventory transfer GI amount 在庫振替出庫金額.<p>
	 *
	 */
	public void gi_stk_xfr_amt(long value) {
		gi_stk_xfr_amt_p().amt(value);
	}

	/**
	 * Inventory transfer GI amount 在庫振替出庫金額.<p>
	 *
	 */
	public void gi_stk_xfr_amt(float value) {
		gi_stk_xfr_amt_p().amt(value);
	}

	/**
	 * Inventory transfer GI amount 在庫振替出庫金額.<p>
	 *
	 */
	public void gi_stk_xfr_amt(double value) {
		gi_stk_xfr_amt_p().amt(value);
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public MCNumber gi_ac_xfr_amt() {
		return gi_ac_xfr_amt_p().amt();
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public void gi_ac_xfr_amt(MCNumber value) {
		gi_ac_xfr_amt_p().amt(value);
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public void gi_ac_xfr_amt(int value) {
		gi_ac_xfr_amt_p().amt(value);
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public void gi_ac_xfr_amt(long value) {
		gi_ac_xfr_amt_p().amt(value);
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public void gi_ac_xfr_amt(float value) {
		gi_ac_xfr_amt_p().amt(value);
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public void gi_ac_xfr_amt(double value) {
		gi_ac_xfr_amt_p().amt(value);
	}

	/**
	 * Inventory count decreased amount 棚卸減金額.<p>
	 *
	 */
	public MCNumber stktk_minus_amt() {
		return stktk_minus_amt_p().amt();
	}

	/**
	 * Inventory count decreased amount 棚卸減金額.<p>
	 *
	 */
	public void stktk_minus_amt(MCNumber value) {
		stktk_minus_amt_p().amt(value);
	}

	/**
	 * Inventory count decreased amount 棚卸減金額.<p>
	 *
	 */
	public void stktk_minus_amt(int value) {
		stktk_minus_amt_p().amt(value);
	}

	/**
	 * Inventory count decreased amount 棚卸減金額.<p>
	 *
	 */
	public void stktk_minus_amt(long value) {
		stktk_minus_amt_p().amt(value);
	}

	/**
	 * Inventory count decreased amount 棚卸減金額.<p>
	 *
	 */
	public void stktk_minus_amt(float value) {
		stktk_minus_amt_p().amt(value);
	}

	/**
	 * Inventory count decreased amount 棚卸減金額.<p>
	 *
	 */
	public void stktk_minus_amt(double value) {
		stktk_minus_amt_p().amt(value);
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

