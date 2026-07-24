package mcframe.serverMSBE.MSBEL5710;

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
 * ブロック"ExAct_Upd01_Src"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ExAct_Upd01_SrcR_MC_A extends MCConstRow {

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Manual addition flg. マニュアル追加ＦＬＧ.<p>
	 *
	 */
	public static final String $manual_add_flg = "manual_add_flg";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_cd = "ship_fr_lg_grp_cd";
	/**
	 * Scheduled completion date 完了予定日.<p>
	 *
	 */
	public static final String $cmpl_schd_dt = "cmpl_schd_dt";
	/**
	 * Completion date 完了日.<p>
	 *
	 */
	public static final String $cmpl_dt = "cmpl_dt";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Scheduled transaction date 取引予定日.<p>
	 *
	 */
	public static final String $trd_schd_dt = "trd_schd_dt";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $ship_pr_no = "ship_pr_no";
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public static final String $ship_schd_no = "ship_schd_no";
	/**
	 * GI WG cd. 出庫ＷＧ ＣＤ.<p>
	 *
	 */
	public static final String $gi_wg_cd = "gi_wg_cd";
	/**
	 * VMI recording at GI flg. 出庫時ＶＭＩ計上ＦＬＧ.<p>
	 *
	 */
	public static final String $gi_vmi_flg = "gi_vmi_flg";
	/**
	 * GR WG cd. 入庫ＷＧ ＣＤ.<p>
	 *
	 */
	public static final String $gr_wg_cd = "gr_wg_cd";
	/**
	 * Base unit qty. of invoice map インボイスマップの基準単位数量.<p>
	 *
	 */
	public static final String $map_base_unit_qty = "map_base_unit_qty";
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
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public static final String $dlv_id_cd = "dlv_id_cd";
	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public static final String $tdlv_cd = "tdlv_cd";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * Shipping requested alias cd. 出荷依頼先識別ＣＤ.<p>
	 *
	 */
	public static final String $ship_rqst_id_cd = "ship_rqst_id_cd";
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public static final String $cst_itm_cd = "cst_itm_cd";
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public static final String $cst_itm_nm = "cst_itm_nm";
	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public static final String $rsn_cd = "rsn_cd";
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	/**
	 * Charged WG cd. 負担ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $bd_wg_cd = "bd_wg_cd";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public static final String $arr_cnt_rmrks = "arr_cnt_rmrks";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 * Transaction unit cd. of invoice details インボイス明細の取引単位ＣＤ.<p>
	 *
	 */
	public static final String $iv_d_trd_unit_cd = "iv_d_trd_unit_cd";
	/**
	 * Transaction unit qty. of invoice details インボイス明細の取引単位数量.<p>
	 *
	 */
	public static final String $iv_d_trd_unit_qty = "iv_d_trd_unit_qty";
	/**
	 * Base unit number of decimal places 基準単位の小数部有効桁数.<p>
	 *
	 */
	public static final String $base_dec_place = "base_dec_place";
	/**
	 * Base unit rounding type 基準単位の端数処理区分.<p>
	 *
	 */
	public static final String $base_rnd_typ = "base_rnd_typ";
	/**
	 * Conversion base qty. in transaction unit 取引単位の換算基準数量.<p>
	 *
	 */
	public static final String $trd_conv_base_qty = "trd_conv_base_qty";
	/**
	 * Conversion qty. in transaction unit 取引単位の換算数量.<p>
	 *
	 */
	public static final String $trd_conv_qty = "trd_conv_qty";
	/**
	 * Transaction unit number of decimal places 取引単位の小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_dec_place = "trd_dec_place";
	/**
	 * Rounding type in transaction unit 取引単位の端数処理区分.<p>
	 *
	 */
	public static final String $trd_rnd_typ = "trd_rnd_typ";
	/**
	 * Conversion base qty. for SKU 荷姿単位の換算基準数量.<p>
	 *
	 */
	public static final String $pack_conv_base_qty = "pack_conv_base_qty";
	/**
	 * Conversion qty. for SKU 荷姿単位の換算数量.<p>
	 *
	 */
	public static final String $pack_conv_qty = "pack_conv_qty";
	/**
	 * Number of decimal places for SKU 荷姿単位の小数部有効桁数.<p>
	 *
	 */
	public static final String $pack_dec_place = "pack_dec_place";
	/**
	 * SKU rounding type 荷姿単位の端数処理区分.<p>
	 *
	 */
	public static final String $pack_rnd_typ = "pack_rnd_typ";
	/**
	 * Transaction unit conversion base qty. for shipping schedule 出荷予定の取引単位の換算基準数量.<p>
	 *
	 */
	public static final String $schd_trd_conv_base_qty = "schd_trd_conv_base_qty";
	/**
	 * Transaction unit conversion qty. for shipping schedule 出荷予定の取引単位の換算数量.<p>
	 *
	 */
	public static final String $schd_trd_conv_qty = "schd_trd_conv_qty";
	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $arr_pr_no = "arr_pr_no";
	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public static final String $arr_schd_no = "arr_schd_no";
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public static final String $arr_act_no = "arr_act_no";
	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public static final String $accpt_schd_dt = "accpt_schd_dt";
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public static final String $ptax_xrate = "ptax_xrate";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public static final String $sls_act_no = "sls_act_no";
	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public static final String $uplnd_flg = "uplnd_flg";
	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public static final String $sls_cststk_flg = "sls_cststk_flg";
	public static final String $d = "d";

	public static final String $iv_ship_act_d_no = $d + ".iv_ship_act_d_no";
	public static final String $iv_no = $d + ".iv_no";
	public static final String $iv_d_no = $d + ".iv_d_no";
	public static final String $itm_cd = $d + ".itm_cd";
	public static final String $itm_sub1 = $d + ".itm_sub1";
	public static final String $itm_sub2 = $d + ".itm_sub2";
	public static final String $itm_sub3 = $d + ".itm_sub3";
	public static final String $itm_nm = $d + ".itm_nm";
	public static final String $iv_itm_nm = $d + ".iv_itm_nm";
	public static final String $stk_arrv_bp_cd = $d + ".stk_arrv_bp_cd";
	public static final String $stk_mng_typ = $d + ".stk_mng_typ";
	public static final String $sundry_itm_flg = $d + ".sundry_itm_flg";
	public static final String $sno1 = $d + ".sno1";
	public static final String $sno2 = $d + ".sno2";
	public static final String $sno3 = $d + ".sno3";
	public static final String $sno4 = $d + ".sno4";
	public static final String $ship_loc_cd = $d + ".ship_loc_cd";
	public static final String $ship_str_ln_cd = $d + ".ship_str_ln_cd";
	public static final String $arr_str_ln_cd = $d + ".arr_str_ln_cd";
	public static final String $lot_no = $d + ".lot_no";
	public static final String $sublot_no = $d + ".sublot_no";
	public static final String $ver_no = $d + ".ver_no";
	public static final String $gd_cd = $d + ".gd_cd";
	public static final String $quality_typ = $d + ".quality_typ";
	public static final String $stk_insp_typ = $d + ".stk_insp_typ";
	public static final String $stk_id_typ = $d + ".stk_id_typ";
	public static final String $stk_bp_cd = $d + ".stk_bp_cd";
	public static final String $trd_unit_qty = $d + ".trd_unit_qty";
	public static final String $trd_unit_cd = $d + ".trd_unit_cd";
	public static final String $base_unit_qty = $d + ".base_unit_qty";
	public static final String $base_unit_cd = $d + ".base_unit_cd";
	public static final String $pack_unit_qty = $d + ".pack_unit_qty";
	public static final String $pack_unit_cd = $d + ".pack_unit_cd";
	public static final String $ship_act_d_no = $d + ".ship_act_d_no";
	public static final String $io_schd_pr_no = $d + ".io_schd_pr_no";
	public static final String $sync_flg = $d + ".sync_flg";
	public static final String $sub_char1 = $d + ".sub_char1";
	public static final String $sub_char2 = $d + ".sub_char2";
	public static final String $sub_char3 = $d + ".sub_char3";

	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta manual_add_flg_META = createCommonMeta($manual_add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta cmpl_schd_dt_META = createCommonMeta($cmpl_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cmpl_dt_META = createCommonMeta($cmpl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_schd_dt_META = createCommonMeta($trd_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta ship_pr_no_META = createCommonMeta($ship_pr_no, mcframe.commonMA.meta.MA_META.SHIP_PR_NO);
	public static final MCMeta ship_schd_no_META = createCommonMeta($ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta gi_wg_cd_META = createCommonMeta($gi_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gi_vmi_flg_META = createCommonMeta($gi_vmi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_wg_cd_META = createCommonMeta($gr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta map_base_unit_qty_META = createCommonMeta($map_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ship_rqst_id_cd_META = createCommonMeta($ship_rqst_id_cd, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_CD);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_wg_cd_META = createCommonMeta($bd_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta arr_cnt_rmrks_META = createCommonMeta($arr_cnt_rmrks, mcframe.commonMS.meta.MS_META.ARR_CNT_RMRKS);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta iv_d_trd_unit_cd_META = createCommonMeta($iv_d_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta iv_d_trd_unit_qty_META = createCommonMeta($iv_d_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_dec_place_META = createCommonMeta($base_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_rnd_typ_META = createCommonMeta($base_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_conv_base_qty_META = createCommonMeta($trd_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_conv_qty_META = createCommonMeta($trd_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_dec_place_META = createCommonMeta($trd_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_rnd_typ_META = createCommonMeta($trd_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta pack_conv_base_qty_META = createCommonMeta($pack_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_conv_qty_META = createCommonMeta($pack_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_dec_place_META = createCommonMeta($pack_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pack_rnd_typ_META = createCommonMeta($pack_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta schd_trd_conv_base_qty_META = createCommonMeta($schd_trd_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_trd_conv_qty_META = createCommonMeta($schd_trd_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta arr_pr_no_META = createCommonMeta($arr_pr_no, mcframe.commonMA.meta.MA_META.ARR_PR_NO);
	public static final MCMeta arr_schd_no_META = createCommonMeta($arr_schd_no, mcframe.commonMA.meta.MA_META.ARR_SCHD_NO);
	public static final MCMeta arr_act_no_META = createCommonMeta($arr_act_no, mcframe.commonMA.meta.MA_META.ARR_ACT_NO);
	public static final MCMeta accpt_schd_dt_META = createCommonMeta($accpt_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_xrate_META = createCommonMeta($ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta sls_act_no_META = createCommonMeta($sls_act_no, mcframe.commonMA.meta.MA_META.SLS_ACT_NO);
	public static final MCMeta uplnd_flg_META = createCommonMeta($uplnd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_cststk_flg_META = createCommonMeta($sls_cststk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta d_META = createInnerRowMeta($d, mcframe.serverMS.dbc.MST_IV_SHIP_ACT_D_R.class);

	protected static final ConstMetaList<ExAct_Upd01_SrcR> constMetas = new ConstMetaList<ExAct_Upd01_SrcR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			trd_cd_META,
			trd_ptn_typ_META,
			manual_add_flg_META,
			trd_cur_cd_META,
			ship_fr_lg_grp_cd_META,
			cmpl_schd_dt_META,
			cmpl_dt_META,
			ac_dt_META,
			can_ac_dt_META,
			trd_schd_dt_META,
			slo_d_no_META,
			ship_pr_no_META,
			ship_schd_no_META,
			gi_wg_cd_META,
			gi_vmi_flg_META,
			gr_wg_cd_META,
			map_base_unit_qty_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			dlv_id_cd_META,
			tdlv_cd_META,
			acst_cd_META,
			ship_rqst_id_cd_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			rsn_cd_META,
			bd_dpt_cd_META,
			bd_wg_cd_META,
			trd_rmrks_META,
			trd_d_rmrks_META,
			arr_cnt_rmrks_META,
			dlv_slip_no_META,
			dlv_slip_d_no_META,
			tax_cd_META,
			trd_cur_upri_META,
			trd_cur_amt_META,
			trd_cur_tax_amt_META,
			iv_d_trd_unit_cd_META,
			iv_d_trd_unit_qty_META,
			base_dec_place_META,
			base_rnd_typ_META,
			trd_conv_base_qty_META,
			trd_conv_qty_META,
			trd_dec_place_META,
			trd_rnd_typ_META,
			pack_conv_base_qty_META,
			pack_conv_qty_META,
			pack_dec_place_META,
			pack_rnd_typ_META,
			schd_trd_conv_base_qty_META,
			schd_trd_conv_qty_META,
			arr_pr_no_META,
			arr_schd_no_META,
			arr_act_no_META,
			accpt_schd_dt_META,
			prov_typ_META,
			prov_basis_typ_META,
			xrate_META,
			ptax_xrate_META,
			slo_no_META,
			sls_act_no_META,
			uplnd_flg_META,
			sls_cststk_flg_META,
			d_META
		},
		new String[][]{
			{
				"iv_ship_act_d_no",
				"iv_no",
				"iv_d_no",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"iv_itm_nm",
				"stk_arrv_bp_cd",
				"stk_mng_typ",
				"sundry_itm_flg",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"ship_loc_cd",
				"ship_str_ln_cd",
				"arr_str_ln_cd",
				"lot_no",
				"sublot_no",
				"ver_no",
				"gd_cd",
				"quality_typ",
				"stk_insp_typ",
				"stk_id_typ",
				"stk_bp_cd",
				"trd_unit_qty",
				"trd_unit_cd",
				"base_unit_qty",
				"base_unit_cd",
				"pack_unit_qty",
				"pack_unit_cd",
				"ship_act_d_no",
				"io_schd_pr_no",
				"sync_flg",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$iv_ship_act_d_no,
				$iv_no,
				$iv_d_no,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$iv_itm_nm,
				$stk_arrv_bp_cd,
				$stk_mng_typ,
				$sundry_itm_flg,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$ship_loc_cd,
				$ship_str_ln_cd,
				$arr_str_ln_cd,
				$lot_no,
				$sublot_no,
				$ver_no,
				$gd_cd,
				$quality_typ,
				$stk_insp_typ,
				$stk_id_typ,
				$stk_bp_cd,
				$trd_unit_qty,
				$trd_unit_cd,
				$base_unit_qty,
				$base_unit_cd,
				$pack_unit_qty,
				$pack_unit_cd,
				$ship_act_d_no,
				$io_schd_pr_no,
				$sync_flg,
				$sub_char1,
				$sub_char2,
				$sub_char3
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
	protected ExAct_Upd01_SrcR_MC_A(ConstMetaList<? extends ExAct_Upd01_SrcR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExAct_Upd01_SrcR clone() {
		return (ExAct_Upd01_SrcR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExAct_Upd01_SrcR createInstance() {
		return (ExAct_Upd01_SrcR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExAct_Upd01_SrcR getValues(String... names) {
		return (ExAct_Upd01_SrcR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 0, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 0, $trd_cd, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 1, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 1, $trd_ptn_typ, value);
	}


	/**
	 * Manual addition flg. マニュアル追加ＦＬＧ.<p>
	 *
	 */
	public boolean manual_add_flg() {
		return getConstBoolean(offset + 2, $manual_add_flg);
	}

	/**
	 * Manual addition flg. マニュアル追加ＦＬＧ.<p>
	 *
	 */
	public void manual_add_flg(boolean value) {
		setConstBoolean(offset + 2, $manual_add_flg, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 3, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 3, $trd_cur_cd, value);
	}


	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 4, $ship_fr_lg_grp_cd);
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 4, $ship_fr_lg_grp_cd, value);
	}


	/**
	 * Scheduled completion date 完了予定日.<p>
	 *
	 */
	public MCDate cmpl_schd_dt() {
		return getConstDate(offset + 5, $cmpl_schd_dt);
	}

	/**
	 * Scheduled completion date 完了予定日.<p>
	 *
	 */
	public void cmpl_schd_dt(MCDate value) {
		setConstDate(offset + 5, $cmpl_schd_dt, value);
	}


	/**
	 * Completion date 完了日.<p>
	 *
	 */
	public MCDate cmpl_dt() {
		return getConstDate(offset + 6, $cmpl_dt);
	}

	/**
	 * Completion date 完了日.<p>
	 *
	 */
	public void cmpl_dt(MCDate value) {
		setConstDate(offset + 6, $cmpl_dt, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 7, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 7, $ac_dt, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 8, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 8, $can_ac_dt, value);
	}


	/**
	 * Scheduled transaction date 取引予定日.<p>
	 *
	 */
	public MCDate trd_schd_dt() {
		return getConstDate(offset + 9, $trd_schd_dt);
	}

	/**
	 * Scheduled transaction date 取引予定日.<p>
	 *
	 */
	public void trd_schd_dt(MCDate value) {
		setConstDate(offset + 9, $trd_schd_dt, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 10, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 10, $slo_d_no, value);
	}


	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public String ship_pr_no() {
		return getConstString(offset + 11, $ship_pr_no);
	}

	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public void ship_pr_no(String value) {
		setConstString(offset + 11, $ship_pr_no, value);
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return getConstString(offset + 12, $ship_schd_no);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		setConstString(offset + 12, $ship_schd_no, value);
	}


	/**
	 * GI WG cd. 出庫ＷＧ ＣＤ.<p>
	 *
	 */
	public String gi_wg_cd() {
		return getConstString(offset + 13, $gi_wg_cd);
	}

	/**
	 * GI WG cd. 出庫ＷＧ ＣＤ.<p>
	 *
	 */
	public void gi_wg_cd(String value) {
		setConstString(offset + 13, $gi_wg_cd, value);
	}


	/**
	 * VMI recording at GI flg. 出庫時ＶＭＩ計上ＦＬＧ.<p>
	 *
	 */
	public boolean gi_vmi_flg() {
		return getConstBoolean(offset + 14, $gi_vmi_flg);
	}

	/**
	 * VMI recording at GI flg. 出庫時ＶＭＩ計上ＦＬＧ.<p>
	 *
	 */
	public void gi_vmi_flg(boolean value) {
		setConstBoolean(offset + 14, $gi_vmi_flg, value);
	}


	/**
	 * GR WG cd. 入庫ＷＧ ＣＤ.<p>
	 *
	 */
	public String gr_wg_cd() {
		return getConstString(offset + 15, $gr_wg_cd);
	}

	/**
	 * GR WG cd. 入庫ＷＧ ＣＤ.<p>
	 *
	 */
	public void gr_wg_cd(String value) {
		setConstString(offset + 15, $gr_wg_cd, value);
	}


	/**
	 * Base unit qty. of invoice map インボイスマップの基準単位数量.<p>
	 *
	 */
	public MCNumber map_base_unit_qty() {
		return getConstNumber(offset + 16, $map_base_unit_qty);
	}

	/**
	 * Base unit qty. of invoice map インボイスマップの基準単位数量.<p>
	 *
	 */
	public void map_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 16, $map_base_unit_qty, value);
	}

	/**
	 * Base unit qty. of invoice map インボイスマップの基準単位数量.<p>
	 *
	 */
	public void map_base_unit_qty(int value) {
		setConstNumber(offset + 16, $map_base_unit_qty, value);
	}

	/**
	 * Base unit qty. of invoice map インボイスマップの基準単位数量.<p>
	 *
	 */
	public void map_base_unit_qty(long value) {
		setConstNumber(offset + 16, $map_base_unit_qty, value);
	}

	/**
	 * Base unit qty. of invoice map インボイスマップの基準単位数量.<p>
	 *
	 */
	public void map_base_unit_qty(float value) {
		setConstNumber(offset + 16, $map_base_unit_qty, value);
	}

	/**
	 * Base unit qty. of invoice map インボイスマップの基準単位数量.<p>
	 *
	 */
	public void map_base_unit_qty(double value) {
		setConstNumber(offset + 16, $map_base_unit_qty, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 17, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 17, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 18, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 18, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 19, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 19, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 20, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 20, $sno4_mng_typ, value);
	}


	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 21, $dlv_id_cd);
	}

	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 21, $dlv_id_cd, value);
	}


	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 22, $tdlv_cd);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 22, $tdlv_cd, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 23, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 23, $acst_cd, value);
	}


	/**
	 * Shipping requested alias cd. 出荷依頼先識別ＣＤ.<p>
	 *
	 */
	public String ship_rqst_id_cd() {
		return getConstString(offset + 24, $ship_rqst_id_cd);
	}

	/**
	 * Shipping requested alias cd. 出荷依頼先識別ＣＤ.<p>
	 *
	 */
	public void ship_rqst_id_cd(String value) {
		setConstString(offset + 24, $ship_rqst_id_cd, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 25, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 25, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 26, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 26, $cst_itm_nm, value);
	}


	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 27, $rsn_cd);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 27, $rsn_cd, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 28, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 28, $bd_dpt_cd, value);
	}


	/**
	 * Charged WG cd. 負担ワーキンググループＣＤ.<p>
	 *
	 */
	public String bd_wg_cd() {
		return getConstString(offset + 29, $bd_wg_cd);
	}

	/**
	 * Charged WG cd. 負担ワーキンググループＣＤ.<p>
	 *
	 */
	public void bd_wg_cd(String value) {
		setConstString(offset + 29, $bd_wg_cd, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 30, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 30, $trd_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 31, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 31, $trd_d_rmrks, value);
	}


	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public String arr_cnt_rmrks() {
		return getConstString(offset + 32, $arr_cnt_rmrks);
	}

	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public void arr_cnt_rmrks(String value) {
		setConstString(offset + 32, $arr_cnt_rmrks, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 33, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 33, $dlv_slip_no, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 34, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 34, $dlv_slip_d_no, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 35, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 35, $tax_cd, value);
	}


	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 36, $trd_cur_upri);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 36, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 36, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 36, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 36, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 36, $trd_cur_upri, value);
	}


	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 37, $trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 37, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 37, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 37, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 37, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 37, $trd_cur_amt, value);
	}


	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 38, $trd_cur_tax_amt);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 38, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 38, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 38, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 38, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 38, $trd_cur_tax_amt, value);
	}


	/**
	 * Transaction unit cd. of invoice details インボイス明細の取引単位ＣＤ.<p>
	 *
	 */
	public String iv_d_trd_unit_cd() {
		return getConstString(offset + 39, $iv_d_trd_unit_cd);
	}

	/**
	 * Transaction unit cd. of invoice details インボイス明細の取引単位ＣＤ.<p>
	 *
	 */
	public void iv_d_trd_unit_cd(String value) {
		setConstString(offset + 39, $iv_d_trd_unit_cd, value);
	}


	/**
	 * Transaction unit qty. of invoice details インボイス明細の取引単位数量.<p>
	 *
	 */
	public MCNumber iv_d_trd_unit_qty() {
		return getConstNumber(offset + 40, $iv_d_trd_unit_qty);
	}

	/**
	 * Transaction unit qty. of invoice details インボイス明細の取引単位数量.<p>
	 *
	 */
	public void iv_d_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 40, $iv_d_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. of invoice details インボイス明細の取引単位数量.<p>
	 *
	 */
	public void iv_d_trd_unit_qty(int value) {
		setConstNumber(offset + 40, $iv_d_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. of invoice details インボイス明細の取引単位数量.<p>
	 *
	 */
	public void iv_d_trd_unit_qty(long value) {
		setConstNumber(offset + 40, $iv_d_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. of invoice details インボイス明細の取引単位数量.<p>
	 *
	 */
	public void iv_d_trd_unit_qty(float value) {
		setConstNumber(offset + 40, $iv_d_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. of invoice details インボイス明細の取引単位数量.<p>
	 *
	 */
	public void iv_d_trd_unit_qty(double value) {
		setConstNumber(offset + 40, $iv_d_trd_unit_qty, value);
	}


	/**
	 * Base unit number of decimal places 基準単位の小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_dec_place() {
		return getConstNumber(offset + 41, $base_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位の小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(MCNumber value) {
		setConstNumber(offset + 41, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位の小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(int value) {
		setConstNumber(offset + 41, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位の小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(long value) {
		setConstNumber(offset + 41, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位の小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(float value) {
		setConstNumber(offset + 41, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位の小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(double value) {
		setConstNumber(offset + 41, $base_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位の端数処理区分.<p>
	 *
	 */
	public String base_rnd_typ() {
		return getConstString(offset + 42, $base_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位の端数処理区分.<p>
	 *
	 */
	public void base_rnd_typ(String value) {
		setConstString(offset + 42, $base_rnd_typ, value);
	}


	/**
	 * Conversion base qty. in transaction unit 取引単位の換算基準数量.<p>
	 *
	 */
	public MCNumber trd_conv_base_qty() {
		return getConstNumber(offset + 43, $trd_conv_base_qty);
	}

	/**
	 * Conversion base qty. in transaction unit 取引単位の換算基準数量.<p>
	 *
	 */
	public void trd_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 43, $trd_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. in transaction unit 取引単位の換算基準数量.<p>
	 *
	 */
	public void trd_conv_base_qty(int value) {
		setConstNumber(offset + 43, $trd_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. in transaction unit 取引単位の換算基準数量.<p>
	 *
	 */
	public void trd_conv_base_qty(long value) {
		setConstNumber(offset + 43, $trd_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. in transaction unit 取引単位の換算基準数量.<p>
	 *
	 */
	public void trd_conv_base_qty(float value) {
		setConstNumber(offset + 43, $trd_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. in transaction unit 取引単位の換算基準数量.<p>
	 *
	 */
	public void trd_conv_base_qty(double value) {
		setConstNumber(offset + 43, $trd_conv_base_qty, value);
	}


	/**
	 * Conversion qty. in transaction unit 取引単位の換算数量.<p>
	 *
	 */
	public MCNumber trd_conv_qty() {
		return getConstNumber(offset + 44, $trd_conv_qty);
	}

	/**
	 * Conversion qty. in transaction unit 取引単位の換算数量.<p>
	 *
	 */
	public void trd_conv_qty(MCNumber value) {
		setConstNumber(offset + 44, $trd_conv_qty, value);
	}

	/**
	 * Conversion qty. in transaction unit 取引単位の換算数量.<p>
	 *
	 */
	public void trd_conv_qty(int value) {
		setConstNumber(offset + 44, $trd_conv_qty, value);
	}

	/**
	 * Conversion qty. in transaction unit 取引単位の換算数量.<p>
	 *
	 */
	public void trd_conv_qty(long value) {
		setConstNumber(offset + 44, $trd_conv_qty, value);
	}

	/**
	 * Conversion qty. in transaction unit 取引単位の換算数量.<p>
	 *
	 */
	public void trd_conv_qty(float value) {
		setConstNumber(offset + 44, $trd_conv_qty, value);
	}

	/**
	 * Conversion qty. in transaction unit 取引単位の換算数量.<p>
	 *
	 */
	public void trd_conv_qty(double value) {
		setConstNumber(offset + 44, $trd_conv_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位の小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_dec_place() {
		return getConstNumber(offset + 45, $trd_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位の小数部有効桁数.<p>
	 *
	 */
	public void trd_dec_place(MCNumber value) {
		setConstNumber(offset + 45, $trd_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位の小数部有効桁数.<p>
	 *
	 */
	public void trd_dec_place(int value) {
		setConstNumber(offset + 45, $trd_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位の小数部有効桁数.<p>
	 *
	 */
	public void trd_dec_place(long value) {
		setConstNumber(offset + 45, $trd_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位の小数部有効桁数.<p>
	 *
	 */
	public void trd_dec_place(float value) {
		setConstNumber(offset + 45, $trd_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位の小数部有効桁数.<p>
	 *
	 */
	public void trd_dec_place(double value) {
		setConstNumber(offset + 45, $trd_dec_place, value);
	}


	/**
	 * Rounding type in transaction unit 取引単位の端数処理区分.<p>
	 *
	 */
	public String trd_rnd_typ() {
		return getConstString(offset + 46, $trd_rnd_typ);
	}

	/**
	 * Rounding type in transaction unit 取引単位の端数処理区分.<p>
	 *
	 */
	public void trd_rnd_typ(String value) {
		setConstString(offset + 46, $trd_rnd_typ, value);
	}


	/**
	 * Conversion base qty. for SKU 荷姿単位の換算基準数量.<p>
	 *
	 */
	public MCNumber pack_conv_base_qty() {
		return getConstNumber(offset + 47, $pack_conv_base_qty);
	}

	/**
	 * Conversion base qty. for SKU 荷姿単位の換算基準数量.<p>
	 *
	 */
	public void pack_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 47, $pack_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. for SKU 荷姿単位の換算基準数量.<p>
	 *
	 */
	public void pack_conv_base_qty(int value) {
		setConstNumber(offset + 47, $pack_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. for SKU 荷姿単位の換算基準数量.<p>
	 *
	 */
	public void pack_conv_base_qty(long value) {
		setConstNumber(offset + 47, $pack_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. for SKU 荷姿単位の換算基準数量.<p>
	 *
	 */
	public void pack_conv_base_qty(float value) {
		setConstNumber(offset + 47, $pack_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. for SKU 荷姿単位の換算基準数量.<p>
	 *
	 */
	public void pack_conv_base_qty(double value) {
		setConstNumber(offset + 47, $pack_conv_base_qty, value);
	}


	/**
	 * Conversion qty. for SKU 荷姿単位の換算数量.<p>
	 *
	 */
	public MCNumber pack_conv_qty() {
		return getConstNumber(offset + 48, $pack_conv_qty);
	}

	/**
	 * Conversion qty. for SKU 荷姿単位の換算数量.<p>
	 *
	 */
	public void pack_conv_qty(MCNumber value) {
		setConstNumber(offset + 48, $pack_conv_qty, value);
	}

	/**
	 * Conversion qty. for SKU 荷姿単位の換算数量.<p>
	 *
	 */
	public void pack_conv_qty(int value) {
		setConstNumber(offset + 48, $pack_conv_qty, value);
	}

	/**
	 * Conversion qty. for SKU 荷姿単位の換算数量.<p>
	 *
	 */
	public void pack_conv_qty(long value) {
		setConstNumber(offset + 48, $pack_conv_qty, value);
	}

	/**
	 * Conversion qty. for SKU 荷姿単位の換算数量.<p>
	 *
	 */
	public void pack_conv_qty(float value) {
		setConstNumber(offset + 48, $pack_conv_qty, value);
	}

	/**
	 * Conversion qty. for SKU 荷姿単位の換算数量.<p>
	 *
	 */
	public void pack_conv_qty(double value) {
		setConstNumber(offset + 48, $pack_conv_qty, value);
	}


	/**
	 * Number of decimal places for SKU 荷姿単位の小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_dec_place() {
		return getConstNumber(offset + 49, $pack_dec_place);
	}

	/**
	 * Number of decimal places for SKU 荷姿単位の小数部有効桁数.<p>
	 *
	 */
	public void pack_dec_place(MCNumber value) {
		setConstNumber(offset + 49, $pack_dec_place, value);
	}

	/**
	 * Number of decimal places for SKU 荷姿単位の小数部有効桁数.<p>
	 *
	 */
	public void pack_dec_place(int value) {
		setConstNumber(offset + 49, $pack_dec_place, value);
	}

	/**
	 * Number of decimal places for SKU 荷姿単位の小数部有効桁数.<p>
	 *
	 */
	public void pack_dec_place(long value) {
		setConstNumber(offset + 49, $pack_dec_place, value);
	}

	/**
	 * Number of decimal places for SKU 荷姿単位の小数部有効桁数.<p>
	 *
	 */
	public void pack_dec_place(float value) {
		setConstNumber(offset + 49, $pack_dec_place, value);
	}

	/**
	 * Number of decimal places for SKU 荷姿単位の小数部有効桁数.<p>
	 *
	 */
	public void pack_dec_place(double value) {
		setConstNumber(offset + 49, $pack_dec_place, value);
	}


	/**
	 * SKU rounding type 荷姿単位の端数処理区分.<p>
	 *
	 */
	public String pack_rnd_typ() {
		return getConstString(offset + 50, $pack_rnd_typ);
	}

	/**
	 * SKU rounding type 荷姿単位の端数処理区分.<p>
	 *
	 */
	public void pack_rnd_typ(String value) {
		setConstString(offset + 50, $pack_rnd_typ, value);
	}


	/**
	 * Transaction unit conversion base qty. for shipping schedule 出荷予定の取引単位の換算基準数量.<p>
	 *
	 */
	public MCNumber schd_trd_conv_base_qty() {
		return getConstNumber(offset + 51, $schd_trd_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. for shipping schedule 出荷予定の取引単位の換算基準数量.<p>
	 *
	 */
	public void schd_trd_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 51, $schd_trd_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. for shipping schedule 出荷予定の取引単位の換算基準数量.<p>
	 *
	 */
	public void schd_trd_conv_base_qty(int value) {
		setConstNumber(offset + 51, $schd_trd_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. for shipping schedule 出荷予定の取引単位の換算基準数量.<p>
	 *
	 */
	public void schd_trd_conv_base_qty(long value) {
		setConstNumber(offset + 51, $schd_trd_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. for shipping schedule 出荷予定の取引単位の換算基準数量.<p>
	 *
	 */
	public void schd_trd_conv_base_qty(float value) {
		setConstNumber(offset + 51, $schd_trd_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. for shipping schedule 出荷予定の取引単位の換算基準数量.<p>
	 *
	 */
	public void schd_trd_conv_base_qty(double value) {
		setConstNumber(offset + 51, $schd_trd_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. for shipping schedule 出荷予定の取引単位の換算数量.<p>
	 *
	 */
	public MCNumber schd_trd_conv_qty() {
		return getConstNumber(offset + 52, $schd_trd_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. for shipping schedule 出荷予定の取引単位の換算数量.<p>
	 *
	 */
	public void schd_trd_conv_qty(MCNumber value) {
		setConstNumber(offset + 52, $schd_trd_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. for shipping schedule 出荷予定の取引単位の換算数量.<p>
	 *
	 */
	public void schd_trd_conv_qty(int value) {
		setConstNumber(offset + 52, $schd_trd_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. for shipping schedule 出荷予定の取引単位の換算数量.<p>
	 *
	 */
	public void schd_trd_conv_qty(long value) {
		setConstNumber(offset + 52, $schd_trd_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. for shipping schedule 出荷予定の取引単位の換算数量.<p>
	 *
	 */
	public void schd_trd_conv_qty(float value) {
		setConstNumber(offset + 52, $schd_trd_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. for shipping schedule 出荷予定の取引単位の換算数量.<p>
	 *
	 */
	public void schd_trd_conv_qty(double value) {
		setConstNumber(offset + 52, $schd_trd_conv_qty, value);
	}


	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 53, $arr_pr_no);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 53, $arr_pr_no, value);
	}


	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return getConstString(offset + 54, $arr_schd_no);
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		setConstString(offset + 54, $arr_schd_no, value);
	}


	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public String arr_act_no() {
		return getConstString(offset + 55, $arr_act_no);
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public void arr_act_no(String value) {
		setConstString(offset + 55, $arr_act_no, value);
	}


	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCDate accpt_schd_dt() {
		return getConstDate(offset + 56, $accpt_schd_dt);
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public void accpt_schd_dt(MCDate value) {
		setConstDate(offset + 56, $accpt_schd_dt, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 57, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 57, $prov_typ, value);
	}


	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 58, $prov_basis_typ);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 58, $prov_basis_typ, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 59, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 59, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 59, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 59, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 59, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 59, $xrate, value);
	}


	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return getConstNumber(offset + 60, $ptax_xrate);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		setConstNumber(offset + 60, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		setConstNumber(offset + 60, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		setConstNumber(offset + 60, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		setConstNumber(offset + 60, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		setConstNumber(offset + 60, $ptax_xrate, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 61, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 61, $slo_no, value);
	}


	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public String sls_act_no() {
		return getConstString(offset + 62, $sls_act_no);
	}

	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public void sls_act_no(String value) {
		setConstString(offset + 62, $sls_act_no, value);
	}


	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public boolean uplnd_flg() {
		return getConstBoolean(offset + 63, $uplnd_flg);
	}

	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public void uplnd_flg(boolean value) {
		setConstBoolean(offset + 63, $uplnd_flg, value);
	}


	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public boolean sls_cststk_flg() {
		return getConstBoolean(offset + 64, $sls_cststk_flg);
	}

	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public void sls_cststk_flg(boolean value) {
		setConstBoolean(offset + 64, $sls_cststk_flg, value);
	}


	public mcframe.serverMS.dbc.MST_IV_SHIP_ACT_D_R d(){
		return (mcframe.serverMS.dbc.MST_IV_SHIP_ACT_D_R) getConstInnerRow(offset + 65, $d);
	}
	
	public void d(mcframe.serverMS.dbc.MST_IV_SHIP_ACT_D_R row){
		setConstInnerRow(offset + 65, $d, row);
	}


	public String getString(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
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
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			return bd_wg_cd();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($iv_d_trd_unit_cd.equalsIgnoreCase(name)) {
			return iv_d_trd_unit_cd();
		}
		if ($base_rnd_typ.equalsIgnoreCase(name)) {
			return base_rnd_typ();
		}
		if ($trd_rnd_typ.equalsIgnoreCase(name)) {
			return trd_rnd_typ();
		}
		if ($pack_rnd_typ.equalsIgnoreCase(name)) {
			return pack_rnd_typ();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($map_base_unit_qty.equalsIgnoreCase(name)) {
			return map_base_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($iv_d_trd_unit_qty.equalsIgnoreCase(name)) {
			return iv_d_trd_unit_qty();
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			return base_dec_place();
		}
		if ($trd_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_conv_base_qty();
		}
		if ($trd_conv_qty.equalsIgnoreCase(name)) {
			return trd_conv_qty();
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			return trd_dec_place();
		}
		if ($pack_conv_base_qty.equalsIgnoreCase(name)) {
			return pack_conv_base_qty();
		}
		if ($pack_conv_qty.equalsIgnoreCase(name)) {
			return pack_conv_qty();
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			return pack_dec_place();
		}
		if ($schd_trd_conv_base_qty.equalsIgnoreCase(name)) {
			return schd_trd_conv_base_qty();
		}
		if ($schd_trd_conv_qty.equalsIgnoreCase(name)) {
			return schd_trd_conv_qty();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($cmpl_schd_dt.equalsIgnoreCase(name)) {
			return cmpl_schd_dt();
		}
		if ($cmpl_dt.equalsIgnoreCase(name)) {
			return cmpl_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($trd_schd_dt.equalsIgnoreCase(name)) {
			return trd_schd_dt();
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			return accpt_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($manual_add_flg.equalsIgnoreCase(name)) {
			return manual_add_flg();
		}
		if ($gi_vmi_flg.equalsIgnoreCase(name)) {
			return gi_vmi_flg();
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			return uplnd_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
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
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			return bd_wg_cd();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($iv_d_trd_unit_cd.equalsIgnoreCase(name)) {
			return iv_d_trd_unit_cd();
		}
		if ($base_rnd_typ.equalsIgnoreCase(name)) {
			return base_rnd_typ();
		}
		if ($trd_rnd_typ.equalsIgnoreCase(name)) {
			return trd_rnd_typ();
		}
		if ($pack_rnd_typ.equalsIgnoreCase(name)) {
			return pack_rnd_typ();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($map_base_unit_qty.equalsIgnoreCase(name)) {
			return map_base_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($iv_d_trd_unit_qty.equalsIgnoreCase(name)) {
			return iv_d_trd_unit_qty();
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			return base_dec_place();
		}
		if ($trd_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_conv_base_qty();
		}
		if ($trd_conv_qty.equalsIgnoreCase(name)) {
			return trd_conv_qty();
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			return trd_dec_place();
		}
		if ($pack_conv_base_qty.equalsIgnoreCase(name)) {
			return pack_conv_base_qty();
		}
		if ($pack_conv_qty.equalsIgnoreCase(name)) {
			return pack_conv_qty();
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			return pack_dec_place();
		}
		if ($schd_trd_conv_base_qty.equalsIgnoreCase(name)) {
			return schd_trd_conv_base_qty();
		}
		if ($schd_trd_conv_qty.equalsIgnoreCase(name)) {
			return schd_trd_conv_qty();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($cmpl_schd_dt.equalsIgnoreCase(name)) {
			return cmpl_schd_dt();
		}
		if ($cmpl_dt.equalsIgnoreCase(name)) {
			return cmpl_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($trd_schd_dt.equalsIgnoreCase(name)) {
			return trd_schd_dt();
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			return accpt_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($manual_add_flg.equalsIgnoreCase(name)) {
			return manual_add_flg();
		}
		if ($gi_vmi_flg.equalsIgnoreCase(name)) {
			return gi_vmi_flg();
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			return uplnd_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
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
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			ship_rqst_id_cd(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			bd_wg_cd(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($iv_d_trd_unit_cd.equalsIgnoreCase(name)) {
			iv_d_trd_unit_cd(value);
			return;
		}
		if ($base_rnd_typ.equalsIgnoreCase(name)) {
			base_rnd_typ(value);
			return;
		}
		if ($trd_rnd_typ.equalsIgnoreCase(name)) {
			trd_rnd_typ(value);
			return;
		}
		if ($pack_rnd_typ.equalsIgnoreCase(name)) {
			pack_rnd_typ(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($map_base_unit_qty.equalsIgnoreCase(name)) {
			map_base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($iv_d_trd_unit_qty.equalsIgnoreCase(name)) {
			iv_d_trd_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($trd_conv_base_qty.equalsIgnoreCase(name)) {
			trd_conv_base_qty(value);
			return;
		}
		if ($trd_conv_qty.equalsIgnoreCase(name)) {
			trd_conv_qty(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($pack_conv_base_qty.equalsIgnoreCase(name)) {
			pack_conv_base_qty(value);
			return;
		}
		if ($pack_conv_qty.equalsIgnoreCase(name)) {
			pack_conv_qty(value);
			return;
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			pack_dec_place(value);
			return;
		}
		if ($schd_trd_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_conv_base_qty(value);
			return;
		}
		if ($schd_trd_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_conv_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($map_base_unit_qty.equalsIgnoreCase(name)) {
			map_base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($iv_d_trd_unit_qty.equalsIgnoreCase(name)) {
			iv_d_trd_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($trd_conv_base_qty.equalsIgnoreCase(name)) {
			trd_conv_base_qty(value);
			return;
		}
		if ($trd_conv_qty.equalsIgnoreCase(name)) {
			trd_conv_qty(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($pack_conv_base_qty.equalsIgnoreCase(name)) {
			pack_conv_base_qty(value);
			return;
		}
		if ($pack_conv_qty.equalsIgnoreCase(name)) {
			pack_conv_qty(value);
			return;
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			pack_dec_place(value);
			return;
		}
		if ($schd_trd_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_conv_base_qty(value);
			return;
		}
		if ($schd_trd_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_conv_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($map_base_unit_qty.equalsIgnoreCase(name)) {
			map_base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($iv_d_trd_unit_qty.equalsIgnoreCase(name)) {
			iv_d_trd_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($trd_conv_base_qty.equalsIgnoreCase(name)) {
			trd_conv_base_qty(value);
			return;
		}
		if ($trd_conv_qty.equalsIgnoreCase(name)) {
			trd_conv_qty(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($pack_conv_base_qty.equalsIgnoreCase(name)) {
			pack_conv_base_qty(value);
			return;
		}
		if ($pack_conv_qty.equalsIgnoreCase(name)) {
			pack_conv_qty(value);
			return;
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			pack_dec_place(value);
			return;
		}
		if ($schd_trd_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_conv_base_qty(value);
			return;
		}
		if ($schd_trd_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_conv_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($map_base_unit_qty.equalsIgnoreCase(name)) {
			map_base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($iv_d_trd_unit_qty.equalsIgnoreCase(name)) {
			iv_d_trd_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($trd_conv_base_qty.equalsIgnoreCase(name)) {
			trd_conv_base_qty(value);
			return;
		}
		if ($trd_conv_qty.equalsIgnoreCase(name)) {
			trd_conv_qty(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($pack_conv_base_qty.equalsIgnoreCase(name)) {
			pack_conv_base_qty(value);
			return;
		}
		if ($pack_conv_qty.equalsIgnoreCase(name)) {
			pack_conv_qty(value);
			return;
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			pack_dec_place(value);
			return;
		}
		if ($schd_trd_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_conv_base_qty(value);
			return;
		}
		if ($schd_trd_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_conv_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($map_base_unit_qty.equalsIgnoreCase(name)) {
			map_base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($iv_d_trd_unit_qty.equalsIgnoreCase(name)) {
			iv_d_trd_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($trd_conv_base_qty.equalsIgnoreCase(name)) {
			trd_conv_base_qty(value);
			return;
		}
		if ($trd_conv_qty.equalsIgnoreCase(name)) {
			trd_conv_qty(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($pack_conv_base_qty.equalsIgnoreCase(name)) {
			pack_conv_base_qty(value);
			return;
		}
		if ($pack_conv_qty.equalsIgnoreCase(name)) {
			pack_conv_qty(value);
			return;
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			pack_dec_place(value);
			return;
		}
		if ($schd_trd_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_conv_base_qty(value);
			return;
		}
		if ($schd_trd_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_conv_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($cmpl_schd_dt.equalsIgnoreCase(name)) {
			cmpl_schd_dt(value);
			return;
		}
		if ($cmpl_dt.equalsIgnoreCase(name)) {
			cmpl_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($trd_schd_dt.equalsIgnoreCase(name)) {
			trd_schd_dt(value);
			return;
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			accpt_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($manual_add_flg.equalsIgnoreCase(name)) {
			manual_add_flg(value);
			return;
		}
		if ($gi_vmi_flg.equalsIgnoreCase(name)) {
			gi_vmi_flg(value);
			return;
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			uplnd_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
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
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			ship_rqst_id_cd(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			bd_wg_cd(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($iv_d_trd_unit_cd.equalsIgnoreCase(name)) {
			iv_d_trd_unit_cd(value);
			return;
		}
		if ($base_rnd_typ.equalsIgnoreCase(name)) {
			base_rnd_typ(value);
			return;
		}
		if ($trd_rnd_typ.equalsIgnoreCase(name)) {
			trd_rnd_typ(value);
			return;
		}
		if ($pack_rnd_typ.equalsIgnoreCase(name)) {
			pack_rnd_typ(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($map_base_unit_qty.equalsIgnoreCase(name)) {
			map_base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($iv_d_trd_unit_qty.equalsIgnoreCase(name)) {
			iv_d_trd_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($trd_conv_base_qty.equalsIgnoreCase(name)) {
			trd_conv_base_qty(value);
			return;
		}
		if ($trd_conv_qty.equalsIgnoreCase(name)) {
			trd_conv_qty(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($pack_conv_base_qty.equalsIgnoreCase(name)) {
			pack_conv_base_qty(value);
			return;
		}
		if ($pack_conv_qty.equalsIgnoreCase(name)) {
			pack_conv_qty(value);
			return;
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			pack_dec_place(value);
			return;
		}
		if ($schd_trd_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_conv_base_qty(value);
			return;
		}
		if ($schd_trd_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_conv_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($map_base_unit_qty.equalsIgnoreCase(name)) {
			map_base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($iv_d_trd_unit_qty.equalsIgnoreCase(name)) {
			iv_d_trd_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($trd_conv_base_qty.equalsIgnoreCase(name)) {
			trd_conv_base_qty(value);
			return;
		}
		if ($trd_conv_qty.equalsIgnoreCase(name)) {
			trd_conv_qty(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($pack_conv_base_qty.equalsIgnoreCase(name)) {
			pack_conv_base_qty(value);
			return;
		}
		if ($pack_conv_qty.equalsIgnoreCase(name)) {
			pack_conv_qty(value);
			return;
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			pack_dec_place(value);
			return;
		}
		if ($schd_trd_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_conv_base_qty(value);
			return;
		}
		if ($schd_trd_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_conv_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($map_base_unit_qty.equalsIgnoreCase(name)) {
			map_base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($iv_d_trd_unit_qty.equalsIgnoreCase(name)) {
			iv_d_trd_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($trd_conv_base_qty.equalsIgnoreCase(name)) {
			trd_conv_base_qty(value);
			return;
		}
		if ($trd_conv_qty.equalsIgnoreCase(name)) {
			trd_conv_qty(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($pack_conv_base_qty.equalsIgnoreCase(name)) {
			pack_conv_base_qty(value);
			return;
		}
		if ($pack_conv_qty.equalsIgnoreCase(name)) {
			pack_conv_qty(value);
			return;
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			pack_dec_place(value);
			return;
		}
		if ($schd_trd_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_conv_base_qty(value);
			return;
		}
		if ($schd_trd_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_conv_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($map_base_unit_qty.equalsIgnoreCase(name)) {
			map_base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($iv_d_trd_unit_qty.equalsIgnoreCase(name)) {
			iv_d_trd_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($trd_conv_base_qty.equalsIgnoreCase(name)) {
			trd_conv_base_qty(value);
			return;
		}
		if ($trd_conv_qty.equalsIgnoreCase(name)) {
			trd_conv_qty(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($pack_conv_base_qty.equalsIgnoreCase(name)) {
			pack_conv_base_qty(value);
			return;
		}
		if ($pack_conv_qty.equalsIgnoreCase(name)) {
			pack_conv_qty(value);
			return;
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			pack_dec_place(value);
			return;
		}
		if ($schd_trd_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_conv_base_qty(value);
			return;
		}
		if ($schd_trd_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_conv_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($map_base_unit_qty.equalsIgnoreCase(name)) {
			map_base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($iv_d_trd_unit_qty.equalsIgnoreCase(name)) {
			iv_d_trd_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($trd_conv_base_qty.equalsIgnoreCase(name)) {
			trd_conv_base_qty(value);
			return;
		}
		if ($trd_conv_qty.equalsIgnoreCase(name)) {
			trd_conv_qty(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($pack_conv_base_qty.equalsIgnoreCase(name)) {
			pack_conv_base_qty(value);
			return;
		}
		if ($pack_conv_qty.equalsIgnoreCase(name)) {
			pack_conv_qty(value);
			return;
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			pack_dec_place(value);
			return;
		}
		if ($schd_trd_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_conv_base_qty(value);
			return;
		}
		if ($schd_trd_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_conv_qty(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($cmpl_schd_dt.equalsIgnoreCase(name)) {
			cmpl_schd_dt(value);
			return;
		}
		if ($cmpl_dt.equalsIgnoreCase(name)) {
			cmpl_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($trd_schd_dt.equalsIgnoreCase(name)) {
			trd_schd_dt(value);
			return;
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			accpt_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($manual_add_flg.equalsIgnoreCase(name)) {
			manual_add_flg(value);
			return;
		}
		if ($gi_vmi_flg.equalsIgnoreCase(name)) {
			gi_vmi_flg(value);
			return;
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			uplnd_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($d.equalsIgnoreCase(name)) {
			return d();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($d.equalsIgnoreCase(name)) {
			d(
				((MCContainerMeta) d_META).castInnerRow(mcframe.serverMS.dbc.MST_IV_SHIP_ACT_D_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Shipping invoice result details No. インボイス出荷実績明細ＮＯ.<p>
	 *
	 */
	public String iv_ship_act_d_no() {
		return d().iv_ship_act_d_no();
	}

	/**
	 * Shipping invoice result details No. インボイス出荷実績明細ＮＯ.<p>
	 *
	 */
	public void iv_ship_act_d_no(String value) {
		d().iv_ship_act_d_no(value);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return d().iv_no();
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		d().iv_no(value);
	}

	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public String iv_d_no() {
		return d().iv_d_no();
	}

	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public void iv_d_no(String value) {
		d().iv_d_no(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return d().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		d().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return d().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		d().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return d().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		d().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return d().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		d().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return d().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		d().itm_nm(value);
	}

	/**
	 * Item name for invoice インボイス表記用品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return d().iv_itm_nm();
	}

	/**
	 * Item name for invoice インボイス表記用品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		d().iv_itm_nm(value);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return d().stk_arrv_bp_cd();
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		d().stk_arrv_bp_cd(value);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return d().stk_mng_typ();
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		d().stk_mng_typ(value);
	}

	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return d().sundry_itm_flg();
	}

	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		d().sundry_itm_flg(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return d().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		d().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return d().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		d().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return d().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		d().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return d().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		d().sno4(value);
	}

	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public String ship_loc_cd() {
		return d().ship_loc_cd();
	}

	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public void ship_loc_cd(String value) {
		d().ship_loc_cd(value);
	}

	/**
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public String ship_str_ln_cd() {
		return d().ship_str_ln_cd();
	}

	/**
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public void ship_str_ln_cd(String value) {
		d().ship_str_ln_cd(value);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String arr_str_ln_cd() {
		return d().arr_str_ln_cd();
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void arr_str_ln_cd(String value) {
		d().arr_str_ln_cd(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return d().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		d().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return d().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		d().sublot_no(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return d().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		d().ver_no(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return d().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		d().gd_cd(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return d().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		d().quality_typ(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return d().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		d().stk_insp_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return d().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		d().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return d().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		d().stk_bp_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return d().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		d().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		d().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		d().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		d().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		d().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return d().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		d().trd_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return d().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		d().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		d().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		d().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		d().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		d().base_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return d().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		d().base_unit_cd(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return d().pack_unit_qty();
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		d().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		d().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		d().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		d().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		d().pack_unit_qty(value);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return d().pack_unit_cd();
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		d().pack_unit_cd(value);
	}

	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public String ship_act_d_no() {
		return d().ship_act_d_no();
	}

	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public void ship_act_d_no(String value) {
		d().ship_act_d_no(value);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return d().io_schd_pr_no();
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		d().io_schd_pr_no(value);
	}

	/**
	 * Simultaneous recording flg. 同時計上ＦＬＧ.<p>
	 *
	 */
	public boolean sync_flg() {
		return d().sync_flg();
	}

	/**
	 * Simultaneous recording flg. 同時計上ＦＬＧ.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		d().sync_flg(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return d().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		d().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return d().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		d().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return d().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		d().sub_char3(value);
	}

}

