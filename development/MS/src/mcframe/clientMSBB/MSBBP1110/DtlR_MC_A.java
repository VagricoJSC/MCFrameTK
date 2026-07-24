package mcframe.clientMSBB.MSBBP1110;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public static final String $qtn_d_no = "qtn_d_no";
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
	public static final String $itm_p = "itm_p";
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
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
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public static final String $sno1_num_typ = "sno1_num_typ";
	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public static final String $sno2_num_typ = "sno2_num_typ";
	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public static final String $sno3_num_typ = "sno3_num_typ";
	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public static final String $sno4_num_typ = "sno4_num_typ";
	/**
	 * Sales order SEIBAN No. 1 required 受注手配ＮＯ１必須.<p>
	 *
	 */
	public static final String $slo_sno1_flg = "slo_sno1_flg";
	/**
	 * Sales order SEIBAN No. 2 required 受注手配ＮＯ２必須.<p>
	 *
	 */
	public static final String $slo_sno2_flg = "slo_sno2_flg";
	/**
	 * Sales order SEIBAN No. 3 required 受注手配ＮＯ３必須.<p>
	 *
	 */
	public static final String $slo_sno3_flg = "slo_sno3_flg";
	/**
	 * Sales order SEIBAN No. 4 required 受注手配ＮＯ４必須.<p>
	 *
	 */
	public static final String $slo_sno4_flg = "slo_sno4_flg";
	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public static final String $comp_spec_typ = "comp_spec_typ";
	/**
	 * Configuration/specification management type name 構成・仕様管理区分名.<p>
	 *
	 */
	public static final String $comp_spec_typ_nm = "comp_spec_typ_nm";
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public static final String $asset_mng_typ_nm = "asset_mng_typ_nm";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public static final String $cntry_org_cd = "cntry_org_cd";
	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public static final String $cntry_org_nm = "cntry_org_nm";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $trd_unit_rnd_typ = "trd_unit_rnd_typ";
	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	public static final String $trd_unit_qty_p = "trd_unit_qty_p";
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
	public static final String $base_unit_qty_p = "base_unit_qty_p";
	public static final String $trd_cur_std_sls_upri_amt_p = "trd_cur_std_sls_upri_amt_p";
	/**
	 * Discount rate 仕切率.<p>
	 *
	 */
	public static final String $upri_rate = "upri_rate";
	public static final String $trd_cur_upri_p = "trd_cur_upri_p";
	public static final String $trd_cur_amt_p = "trd_cur_amt_p";
	public static final String $trd_cur_inc_tax_amt_p = "trd_cur_inc_tax_amt_p";
	public static final String $trd_cur_tax_amt_p = "trd_cur_tax_amt_p";
	public static final String $cost_upri_p = "cost_upri_p";
	public static final String $cost_amt_p = "cost_amt_p";
	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public static final String $prof_rate = "prof_rate";
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
	 * Numbering SEIBAN No. 手配ＮＯ発番.<p>
	 *
	 */
	public static final String $sno_auto_flg = "sno_auto_flg";
	public static final String $sno_p = "sno_p";
	public static final String $base_cur_std_sls_upri_p = "base_cur_std_sls_upri_p";
	public static final String $base_cur_std_sls_amt_p = "base_cur_std_sls_amt_p";
	public static final String $base_cur_std_sls_inc_tax_amt_p = "base_cur_std_sls_inc_tax_amt_p";
	public static final String $base_cur_std_sls_tax_amt_p = "base_cur_std_sls_tax_amt_p";
	public static final String $base_cur_upri_p = "base_cur_upri_p";
	public static final String $base_cur_amt_p = "base_cur_amt_p";
	public static final String $base_cur_inc_tax_amt_p = "base_cur_inc_tax_amt_p";
	public static final String $base_cur_tax_amt_p = "base_cur_tax_amt_p";
	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public static final String $set_itm_grp_no = "set_itm_grp_no";
	public static final String $dlv_p = "dlv_p";
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	/**
	 * Distribution channel 1 cd. 仕向先１ＣＤ.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public static final String $dest_nm1 = "dest_nm1";
	/**
	 * Distribution channel 2 cd. 仕向先２ＣＤ.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public static final String $dest_nm2 = "dest_nm2";
	/**
	 * Distribution channel 3 cd. 仕向先３ＣＤ.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public static final String $dest_nm3 = "dest_nm3";
	/**
	 * Quotation details remarks 見積明細備考.<p>
	 *
	 */
	public static final String $qtn_d_rmrks = "qtn_d_rmrks";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Configuration rev. number 構成改訂番号.<p>
	 *
	 */
	public static final String $itm_comp_rev_no = "itm_comp_rev_no";
	/**
	 * Item undefined 品目未定義.<p>
	 *
	 */
	public static final String $no_itm_cd_flg = "no_itm_cd_flg";
	/**
	 * Configuration release 構成リリース.<p>
	 *
	 */
	public static final String $comp_rel_flg = "comp_rel_flg";
	/**
	 * Specification exists 仕様有.<p>
	 *
	 */
	public static final String $spec_flg = "spec_flg";
	/**
	 * Specification remarks 仕様備考.<p>
	 *
	 */
	public static final String $spec_sub_char1 = "spec_sub_char1";
	/**
	 * Specification spare 1 仕様予備１.<p>
	 *
	 */
	public static final String $spec_sub_char2 = "spec_sub_char2";
	/**
	 * Specification spare 2 仕様予備２.<p>
	 *
	 */
	public static final String $spec_sub_char3 = "spec_sub_char3";
	/**
	 * Specification spare 3 仕様予備３.<p>
	 *
	 */
	public static final String $spec_sub_char4 = "spec_sub_char4";
	/**
	 * Quotation details result reason cd. 見積明細結果理由ＣＤ.<p>
	 *
	 */
	public static final String $qtn_d_rslt_rsn_cd = "qtn_d_rslt_rsn_cd";
	/**
	 * Quotation details result reason name 見積明細結果理由名.<p>
	 *
	 */
	public static final String $qtn_d_rslt_rsn_nm = "qtn_d_rslt_rsn_nm";
	/**
	 * Quotation details result reason remarks 見積明細結果理由備考.<p>
	 *
	 */
	public static final String $qtn_d_rslt_rsn_rmrks = "qtn_d_rslt_rsn_rmrks";
	public static final String $trnst_qty_p = "trnst_qty_p";
	/**
	 * Customer quotation request details No. 得意先見積依頼明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_qtn_rqst_d_no = "cst_qtn_rqst_d_no";
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	public static final String $old_trd_cur_std_sls_upri_p = "old_trd_cur_std_sls_upri_p";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $trd_unit_qty = $trd_unit_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $upri_not_tgt_flg = $trd_cur_std_sls_upri_amt_p + ".upri_not_tgt_flg";
	public static final String $trd_cur_std_sls_upri = $trd_cur_std_sls_upri_amt_p + ".trd_cur_upri";
	public static final String $interim_flg = $trd_cur_std_sls_upri_amt_p + ".interim_flg";
	public static final String $trd_cur_std_sls_amt = $trd_cur_std_sls_upri_amt_p + ".trd_cur_amt";
	public static final String $trd_cur_std_sls_inc_tax_amt = $trd_cur_std_sls_upri_amt_p + ".trd_cur_inc_tax_amt";
	public static final String $tax_fix_flg = $trd_cur_std_sls_upri_amt_p + ".tax_fix_flg";
	public static final String $tax_cd = $trd_cur_std_sls_upri_amt_p + ".tax_cd";
	public static final String $tax_nm = $trd_cur_std_sls_upri_amt_p + ".tax_nm";
	public static final String $tax_rate = $trd_cur_std_sls_upri_amt_p + ".tax_rate";
	public static final String $tax_typ = $trd_cur_std_sls_upri_amt_p + ".tax_typ";
	public static final String $inc_tax_flg = $trd_cur_std_sls_upri_amt_p + ".inc_tax_flg";
	public static final String $trd_cur_std_sls_tax_amt = $trd_cur_std_sls_upri_amt_p + ".trd_cur_tax_amt";
	public static final String $trd_cur_dscnt_amt = $trd_cur_std_sls_upri_amt_p + ".trd_cur_dscnt_amt";
	public static final String $dscnt_rsn_cd = $trd_cur_std_sls_upri_amt_p + ".dscnt_rsn_cd";
	public static final String $dscnt_rsn_nm = $trd_cur_std_sls_upri_amt_p + ".dscnt_rsn_nm";
	public static final String $trd_cur_upri = $trd_cur_upri_p + ".upri";
	public static final String $trd_cur_amt = $trd_cur_amt_p + ".amt";
	public static final String $trd_cur_inc_tax_amt = $trd_cur_inc_tax_amt_p + ".amt";
	public static final String $trd_cur_tax_amt = $trd_cur_tax_amt_p + ".amt";
	public static final String $cost_upri = $cost_upri_p + ".upri";
	public static final String $cost_amt = $cost_amt_p + ".amt";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4 = $sno_p + ".sno4";
	public static final String $base_cur_std_sls_upri = $base_cur_std_sls_upri_p + ".upri";
	public static final String $base_cur_std_sls_amt = $base_cur_std_sls_amt_p + ".amt";
	public static final String $base_cur_std_sls_inc_tax_amt = $base_cur_std_sls_inc_tax_amt_p + ".amt";
	public static final String $base_cur_std_sls_tax_amt = $base_cur_std_sls_tax_amt_p + ".amt";
	public static final String $base_cur_upri = $base_cur_upri_p + ".upri";
	public static final String $base_cur_amt = $base_cur_amt_p + ".amt";
	public static final String $base_cur_inc_tax_amt = $base_cur_inc_tax_amt_p + ".amt";
	public static final String $base_cur_tax_amt = $base_cur_tax_amt_p + ".amt";
	public static final String $dlv_cd = $dlv_p + ".bp_cd";
	public static final String $dlv_nm = $dlv_p + ".bp_nm";
	public static final String $pri_prnt_flg = $dlv_p + ".pri_prnt_flg";
	public static final String $dlv_zip_cd = $dlv_p + ".zip_cd";
	public static final String $dlv_addr1 = $dlv_p + ".addr1";
	public static final String $dlv_addr2 = $dlv_p + ".addr2";
	public static final String $dlv_addr3 = $dlv_p + ".addr3";
	public static final String $dlv_addr4 = $dlv_p + ".addr4";
	public static final String $dlv_cntct_dpt = $dlv_p + ".dlv_cntct_dpt";
	public static final String $dlv_cntct_psn = $dlv_p + ".dlv_cntct_psn";
	public static final String $dlv_tel = $dlv_p + ".tel";
	public static final String $dlv_fax = $dlv_p + ".fax";
	public static final String $dlv_sundry_flg = $dlv_p + ".dlv_sundry_flg";
	public static final String $dlv_cntry_cd = $dlv_p + ".cntry_cd";
	public static final String $dlv_cntry_nm = $dlv_p + ".cntry_nm";
	public static final String $dlv_lg_grp_cd = $dlv_p + ".lg_grp_cd";
	public static final String $dlv_lg_grp_nm = $dlv_p + ".lg_grp_nm";
	public static final String $trnst_qty = $trnst_qty_p + ".qty";
	public static final String $old_trd_cur_std_sls_upri = $old_trd_cur_std_sls_upri_p + ".upri";

	public static final MCMeta qtn_d_no_META = createCommonMeta($qtn_d_no, mcframe.commonMA.meta.MA_META.QTN_D_NO);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno1_num_typ_META = createCommonMeta($sno1_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno2_num_typ_META = createCommonMeta($sno2_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno3_num_typ_META = createCommonMeta($sno3_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno4_num_typ_META = createCommonMeta($sno4_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta slo_sno1_flg_META = createCommonMeta($slo_sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_sno2_flg_META = createCommonMeta($slo_sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_sno3_flg_META = createCommonMeta($slo_sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_sno4_flg_META = createCommonMeta($slo_sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta comp_spec_typ_META = createCommonMeta($comp_spec_typ, mcframe.commonMA.meta.MA_META.COMP_SPEC_TYP);
	public static final MCMeta comp_spec_typ_nm_META = createCommonMeta($comp_spec_typ_nm, mcframe.commonMA.meta.MA_META.COMP_SPEC_TYP_NM);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta asset_mng_typ_nm_META = createCommonMeta($asset_mng_typ_nm, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta cntry_org_cd_META = createCommonMeta($cntry_org_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_org_nm_META = createCommonMeta($cntry_org_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_qty_p_META = createInnerRowMeta($trd_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta trd_cur_std_sls_upri_amt_p_META = createInnerRowMeta($trd_cur_std_sls_upri_amt_p, mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.class);
	public static final MCMeta upri_rate_META = createCommonMeta($upri_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta trd_cur_upri_p_META = createInnerRowMeta($trd_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta trd_cur_amt_p_META = createInnerRowMeta($trd_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta trd_cur_inc_tax_amt_p_META = createInnerRowMeta($trd_cur_inc_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta trd_cur_tax_amt_p_META = createInnerRowMeta($trd_cur_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta cost_upri_p_META = createInnerRowMeta($cost_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta cost_amt_p_META = createInnerRowMeta($cost_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta prof_rate_META = createCommonMeta($prof_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta sno_auto_flg_META = createCommonMeta($sno_auto_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMAUB.MAUBP5070.SnoR.class);
	public static final MCMeta base_cur_std_sls_upri_p_META = createInnerRowMeta($base_cur_std_sls_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta base_cur_std_sls_amt_p_META = createInnerRowMeta($base_cur_std_sls_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_std_sls_inc_tax_amt_p_META = createInnerRowMeta($base_cur_std_sls_inc_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_std_sls_tax_amt_p_META = createInnerRowMeta($base_cur_std_sls_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_upri_p_META = createInnerRowMeta($base_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta base_cur_amt_p_META = createInnerRowMeta($base_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_inc_tax_amt_p_META = createInnerRowMeta($base_cur_inc_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_tax_amt_p_META = createInnerRowMeta($base_cur_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta set_itm_grp_no_META = createCommonMeta($set_itm_grp_no, mcframe.commonMA.meta.MA_META.SET_ITM_GRP_NO);
	public static final MCMeta dlv_p_META = createInnerRowMeta($dlv_p, mcframe.clientMAUB.MAUBP5400.DlvR.class);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm1_META = createCommonMeta($dest_nm1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm2_META = createCommonMeta($dest_nm2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm3_META = createCommonMeta($dest_nm3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta qtn_d_rmrks_META = createCommonMeta($qtn_d_rmrks, mcframe.commonMS.meta.MS_META.QTN_D_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.QTN_D_INTR_RMRKS);
	public static final MCMeta itm_comp_rev_no_META = createCommonMeta($itm_comp_rev_no, mcframe.commonMA.meta.MA_META.ITM_COMP_REV_NO);
	public static final MCMeta no_itm_cd_flg_META = createCommonMeta($no_itm_cd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta comp_rel_flg_META = createCommonMeta($comp_rel_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta spec_flg_META = createCommonMeta($spec_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta spec_sub_char1_META = createCommonMeta($spec_sub_char1, mcframe.commonMS.meta.MS_META.SPEC_RMRKS);
	public static final MCMeta spec_sub_char2_META = createCommonMeta($spec_sub_char2, mcframe.commonMS.meta.MS_META.SLS_ITM_SPEC_SUB_CHAR1);
	public static final MCMeta spec_sub_char3_META = createCommonMeta($spec_sub_char3, mcframe.commonMS.meta.MS_META.SLS_ITM_SPEC_SUB_CHAR2);
	public static final MCMeta spec_sub_char4_META = createCommonMeta($spec_sub_char4, mcframe.commonMS.meta.MS_META.SLS_ITM_SPEC_SUB_CHAR3);
	public static final MCMeta qtn_d_rslt_rsn_cd_META = createCommonMeta($qtn_d_rslt_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta qtn_d_rslt_rsn_nm_META = createCommonMeta($qtn_d_rslt_rsn_nm, mcframe.commonMS.meta.MS_META.SLO_RSN_NM);
	public static final MCMeta qtn_d_rslt_rsn_rmrks_META = createCommonMeta($qtn_d_rslt_rsn_rmrks, mcframe.commonMS.meta.MS_META.QTN_D_RSLT_RSN_RMRKS);
	public static final MCMeta trnst_qty_p_META = createInnerRowMeta($trnst_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta cst_qtn_rqst_d_no_META = createCommonMeta($cst_qtn_rqst_d_no, mcframe.commonMA.meta.MA_META.CST_QTN_RQST_D_NO);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.QTN_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.QTN_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.QTN_D_SUB_CHAR3);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta old_trd_cur_std_sls_upri_p_META = createInnerRowMeta($old_trd_cur_std_sls_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			qtn_d_no_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			itm_p_META,
			dscnt_itm_flg_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			sno1_num_typ_META,
			sno2_num_typ_META,
			sno3_num_typ_META,
			sno4_num_typ_META,
			slo_sno1_flg_META,
			slo_sno2_flg_META,
			slo_sno3_flg_META,
			slo_sno4_flg_META,
			comp_spec_typ_META,
			comp_spec_typ_nm_META,
			stk_mng_typ_META,
			asset_mng_typ_META,
			asset_mng_typ_nm_META,
			sundry_itm_flg_META,
			iv_itm_nm_META,
			cntry_org_cd_META,
			cntry_org_nm_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_qty_p_META,
			trd_cur_std_sls_upri_amt_p_META,
			upri_rate_META,
			trd_cur_upri_p_META,
			trd_cur_amt_p_META,
			trd_cur_inc_tax_amt_p_META,
			trd_cur_tax_amt_p_META,
			cost_upri_p_META,
			cost_amt_p_META,
			prof_rate_META,
			gd_cd_META,
			gd_nm_META,
			sno_auto_flg_META,
			sno_p_META,
			base_cur_std_sls_upri_p_META,
			base_cur_std_sls_amt_p_META,
			base_cur_std_sls_inc_tax_amt_p_META,
			base_cur_std_sls_tax_amt_p_META,
			base_cur_upri_p_META,
			base_cur_amt_p_META,
			base_cur_inc_tax_amt_p_META,
			base_cur_tax_amt_p_META,
			set_itm_grp_no_META,
			dlv_p_META,
			prnt_lcl_cd_META,
			dest_cd1_META,
			dest_nm1_META,
			dest_cd2_META,
			dest_nm2_META,
			dest_cd3_META,
			dest_nm3_META,
			qtn_d_rmrks_META,
			intr_rmrks_META,
			itm_comp_rev_no_META,
			no_itm_cd_flg_META,
			comp_rel_flg_META,
			spec_flg_META,
			spec_sub_char1_META,
			spec_sub_char2_META,
			spec_sub_char3_META,
			spec_sub_char4_META,
			qtn_d_rslt_rsn_cd_META,
			qtn_d_rslt_rsn_nm_META,
			qtn_d_rslt_rsn_rmrks_META,
			trnst_qty_p_META,
			cst_qtn_rqst_d_no_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			disp_seq_META,
			old_trd_cur_std_sls_upri_p_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"trd_unit_qty",
				"base_unit_qty",
				"upri_not_tgt_flg",
				"trd_cur_std_sls_upri",
				"interim_flg",
				"trd_cur_std_sls_amt",
				"trd_cur_std_sls_inc_tax_amt",
				"tax_fix_flg",
				"tax_cd",
				"tax_nm",
				"tax_rate",
				"tax_typ",
				"inc_tax_flg",
				"trd_cur_std_sls_tax_amt",
				"trd_cur_dscnt_amt",
				"dscnt_rsn_cd",
				"dscnt_rsn_nm",
				"trd_cur_upri",
				"trd_cur_amt",
				"trd_cur_inc_tax_amt",
				"trd_cur_tax_amt",
				"cost_upri",
				"cost_amt",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"base_cur_std_sls_upri",
				"base_cur_std_sls_amt",
				"base_cur_std_sls_inc_tax_amt",
				"base_cur_std_sls_tax_amt",
				"base_cur_upri",
				"base_cur_amt",
				"base_cur_inc_tax_amt",
				"base_cur_tax_amt",
				"dlv_cd",
				"dlv_nm",
				"pri_prnt_flg",
				"dlv_zip_cd",
				"dlv_addr1",
				"dlv_addr2",
				"dlv_addr3",
				"dlv_addr4",
				"dlv_cntct_dpt",
				"dlv_cntct_psn",
				"dlv_tel",
				"dlv_fax",
				"dlv_sundry_flg",
				"dlv_cntry_cd",
				"dlv_cntry_nm",
				"dlv_lg_grp_cd",
				"dlv_lg_grp_nm",
				"trnst_qty",
				"old_trd_cur_std_sls_upri"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$trd_unit_qty,
				$base_unit_qty,
				$upri_not_tgt_flg,
				$trd_cur_std_sls_upri,
				$interim_flg,
				$trd_cur_std_sls_amt,
				$trd_cur_std_sls_inc_tax_amt,
				$tax_fix_flg,
				$tax_cd,
				$tax_nm,
				$tax_rate,
				$tax_typ,
				$inc_tax_flg,
				$trd_cur_std_sls_tax_amt,
				$trd_cur_dscnt_amt,
				$dscnt_rsn_cd,
				$dscnt_rsn_nm,
				$trd_cur_upri,
				$trd_cur_amt,
				$trd_cur_inc_tax_amt,
				$trd_cur_tax_amt,
				$cost_upri,
				$cost_amt,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$base_cur_std_sls_upri,
				$base_cur_std_sls_amt,
				$base_cur_std_sls_inc_tax_amt,
				$base_cur_std_sls_tax_amt,
				$base_cur_upri,
				$base_cur_amt,
				$base_cur_inc_tax_amt,
				$base_cur_tax_amt,
				$dlv_cd,
				$dlv_nm,
				$pri_prnt_flg,
				$dlv_zip_cd,
				$dlv_addr1,
				$dlv_addr2,
				$dlv_addr3,
				$dlv_addr4,
				$dlv_cntct_dpt,
				$dlv_cntct_psn,
				$dlv_tel,
				$dlv_fax,
				$dlv_sundry_flg,
				$dlv_cntry_cd,
				$dlv_cntry_nm,
				$dlv_lg_grp_cd,
				$dlv_lg_grp_nm,
				$trnst_qty,
				$old_trd_cur_std_sls_upri
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
				{$cst_itm_cd, "bp_itm_nm;itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// cst_itm_cd
				{$itm_p + ".itm_cd", "itm_sub1;itm_sub2;itm_sub3;itm_nm;stk_mng_typ;asset_mng_typ;asset_mng_typ_nm;sundry_itm_flg;cntry_org_cd;ship_unit_cd;unit_cd;unit_nm;dec_place;rnd_typ;dscnt_itm_flg;comp_spec_typ;comp_spec_typ_nm;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;sno1_num_typ;sno2_num_typ;sno3_num_typ;sno4_num_typ;slo_sno1_flg;slo_sno2_flg;slo_sno3_flg;slo_sno4_flg"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_sub2;itm_sub3;itm_nm;stk_mng_typ;asset_mng_typ;asset_mng_typ_nm;sundry_itm_flg;cntry_org_cd;ship_unit_cd;unit_cd;unit_nm;dec_place;rnd_typ;dscnt_itm_flg;comp_spec_typ;comp_spec_typ_nm;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;sno1_num_typ;sno2_num_typ;sno3_num_typ;sno4_num_typ;slo_sno1_flg;slo_sno2_flg;slo_sno3_flg;slo_sno4_flg"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_sub3;itm_nm;stk_mng_typ;asset_mng_typ;asset_mng_typ_nm;sundry_itm_flg;cntry_org_cd;ship_unit_cd;unit_cd;unit_nm;dec_place;rnd_typ;dscnt_itm_flg;comp_spec_typ;comp_spec_typ_nm;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;sno1_num_typ;sno2_num_typ;sno3_num_typ;sno4_num_typ;slo_sno1_flg;slo_sno2_flg;slo_sno3_flg;slo_sno4_flg"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_nm;stk_mng_typ;asset_mng_typ;asset_mng_typ_nm;sundry_itm_flg;cntry_org_cd;ship_unit_cd;unit_cd;unit_nm;dec_place;rnd_typ;dscnt_itm_flg;comp_spec_typ;comp_spec_typ_nm;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;sno1_num_typ;sno2_num_typ;sno3_num_typ;sno4_num_typ;slo_sno1_flg;slo_sno2_flg;slo_sno3_flg;slo_sno4_flg"},	// itm_p.itm_sub3
				{$cntry_org_cd, "cntry_nm"},	// cntry_org_cd
				{$trd_unit_cd, "unit_nm;dec_place;conv_base_qty;conv_qty;rnd_typ"},	// trd_unit_cd
				{$trd_cur_std_sls_upri_amt_p + ".dscnt_rsn_cd", "biz_rsn_nm"},	// trd_cur_std_sls_upri_amt_p.dscnt_rsn_cd
				{$dlv_p + ".bp_cd", "bp_nm;dlv_sundry_flg;pri_prnt_flg;zip_cd;addr1;addr2;addr3;addr4;cntry_cd;cntry_nm;tel;fax;dlv_cntct_dpt;dlv_cntct_psn;lg_grp_cd;prnt_lcl_cd"},	// dlv_p.bp_cd
				{$dest_cd1, "bp_nm"},	// dest_cd1
				{$dest_cd2, "bp_nm"},	// dest_cd2
				{$dest_cd3, "bp_nm"},	// dest_cd3
				{$qtn_d_rslt_rsn_cd, "slo_rsn_nm"}	// qtn_d_rslt_rsn_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$cst_itm_cd, "bp_cd;bp_nm;dt"},	// cst_itm_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$gd_cd, "cst_cd;dlv_cd"},	// gd_cd
				{$dlv_p + ".bp_cd", "MAC_BP_IS_SRCH_TYP.DLV;qtn_dt"},	// dlv_p.bp_cd
				{$dest_cd1, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd1
				{$dest_cd2, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd2
				{$dest_cd3, "MAC_BP_IS_SRCH_TYP.DEST"}	// dest_cd3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$cst_itm_cd, "bp_cd;bp_nm;dt"},	// cst_itm_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$gd_cd, "cst_cd;dlv_cd"},	// gd_cd
				{$dlv_p + ".bp_cd", "bp_is_srch_typ;dt"},	// dlv_p.bp_cd
				{$dest_cd1, "bp_is_srch_typ"},	// dest_cd1
				{$dest_cd2, "bp_is_srch_typ"},	// dest_cd2
				{$dest_cd3, "bp_is_srch_typ"}	// dest_cd3
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_rnd_typ, "BASE_UNIT"},	// base_unit_rnd_typ
				{$base_unit_qty_p + ".qty", "BASE_UNIT"},	// base_unit_qty_p.qty
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"},	// gd_nm
				{$sno_auto_flg, "SNO1"},	// sno_auto_flg
				{$base_cur_std_sls_upri_p + ".upri", "BASE_CUR"},	// base_cur_std_sls_upri_p.upri
				{$base_cur_std_sls_amt_p + ".amt", "BASE_CUR"},	// base_cur_std_sls_amt_p.amt
				{$base_cur_std_sls_inc_tax_amt_p + ".amt", "BASE_CUR"},	// base_cur_std_sls_inc_tax_amt_p.amt
				{$base_cur_std_sls_tax_amt_p + ".amt", "BASE_CUR"},	// base_cur_std_sls_tax_amt_p.amt
				{$base_cur_upri_p + ".upri", "BASE_CUR"},	// base_cur_upri_p.upri
				{$base_cur_amt_p + ".amt", "BASE_CUR"},	// base_cur_amt_p.amt
				{$base_cur_inc_tax_amt_p + ".amt", "BASE_CUR"},	// base_cur_inc_tax_amt_p.amt
				{$base_cur_tax_amt_p + ".amt", "BASE_CUR"},	// base_cur_tax_amt_p.amt
				{$dest_cd1, "DEST1"},	// dest_cd1
				{$dest_nm1, "DEST1"},	// dest_nm1
				{$dest_cd2, "DEST2"},	// dest_cd2
				{$dest_nm2, "DEST2"},	// dest_nm2
				{$dest_cd3, "DEST3"},	// dest_cd3
				{$dest_nm3, "DEST3"}	// dest_nm3
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}



	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public String qtn_d_no() {
		return getConstString(offset + 0, $qtn_d_no);
	}

	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public void qtn_d_no(String value) {
		setConstString(offset + 0, $qtn_d_no, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 1, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 1, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 2, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 2, $cst_itm_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 3, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 3, $itm_p, row);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 4, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 4, $dscnt_itm_flg, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 5, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 5, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 6, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 6, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 7, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 7, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 8, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 8, $sno4_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public String sno1_num_typ() {
		return getConstString(offset + 9, $sno1_num_typ);
	}

	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public void sno1_num_typ(String value) {
		setConstString(offset + 9, $sno1_num_typ, value);
	}


	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public String sno2_num_typ() {
		return getConstString(offset + 10, $sno2_num_typ);
	}

	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public void sno2_num_typ(String value) {
		setConstString(offset + 10, $sno2_num_typ, value);
	}


	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public String sno3_num_typ() {
		return getConstString(offset + 11, $sno3_num_typ);
	}

	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public void sno3_num_typ(String value) {
		setConstString(offset + 11, $sno3_num_typ, value);
	}


	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public String sno4_num_typ() {
		return getConstString(offset + 12, $sno4_num_typ);
	}

	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public void sno4_num_typ(String value) {
		setConstString(offset + 12, $sno4_num_typ, value);
	}


	/**
	 * Sales order SEIBAN No. 1 required 受注手配ＮＯ１必須.<p>
	 *
	 */
	public boolean slo_sno1_flg() {
		return getConstBoolean(offset + 13, $slo_sno1_flg);
	}

	/**
	 * Sales order SEIBAN No. 1 required 受注手配ＮＯ１必須.<p>
	 *
	 */
	public void slo_sno1_flg(boolean value) {
		setConstBoolean(offset + 13, $slo_sno1_flg, value);
	}


	/**
	 * Sales order SEIBAN No. 2 required 受注手配ＮＯ２必須.<p>
	 *
	 */
	public boolean slo_sno2_flg() {
		return getConstBoolean(offset + 14, $slo_sno2_flg);
	}

	/**
	 * Sales order SEIBAN No. 2 required 受注手配ＮＯ２必須.<p>
	 *
	 */
	public void slo_sno2_flg(boolean value) {
		setConstBoolean(offset + 14, $slo_sno2_flg, value);
	}


	/**
	 * Sales order SEIBAN No. 3 required 受注手配ＮＯ３必須.<p>
	 *
	 */
	public boolean slo_sno3_flg() {
		return getConstBoolean(offset + 15, $slo_sno3_flg);
	}

	/**
	 * Sales order SEIBAN No. 3 required 受注手配ＮＯ３必須.<p>
	 *
	 */
	public void slo_sno3_flg(boolean value) {
		setConstBoolean(offset + 15, $slo_sno3_flg, value);
	}


	/**
	 * Sales order SEIBAN No. 4 required 受注手配ＮＯ４必須.<p>
	 *
	 */
	public boolean slo_sno4_flg() {
		return getConstBoolean(offset + 16, $slo_sno4_flg);
	}

	/**
	 * Sales order SEIBAN No. 4 required 受注手配ＮＯ４必須.<p>
	 *
	 */
	public void slo_sno4_flg(boolean value) {
		setConstBoolean(offset + 16, $slo_sno4_flg, value);
	}


	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public String comp_spec_typ() {
		return getConstString(offset + 17, $comp_spec_typ);
	}

	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public void comp_spec_typ(String value) {
		setConstString(offset + 17, $comp_spec_typ, value);
	}


	/**
	 * Configuration/specification management type name 構成・仕様管理区分名.<p>
	 *
	 */
	public String comp_spec_typ_nm() {
		return getConstString(offset + 18, $comp_spec_typ_nm);
	}

	/**
	 * Configuration/specification management type name 構成・仕様管理区分名.<p>
	 *
	 */
	public void comp_spec_typ_nm(String value) {
		setConstString(offset + 18, $comp_spec_typ_nm, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 19, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 19, $stk_mng_typ, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 20, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 20, $asset_mng_typ, value);
	}


	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public String asset_mng_typ_nm() {
		return getConstString(offset + 21, $asset_mng_typ_nm);
	}

	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public void asset_mng_typ_nm(String value) {
		setConstString(offset + 21, $asset_mng_typ_nm, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 22, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 22, $sundry_itm_flg, value);
	}


	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 23, $iv_itm_nm);
	}

	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 23, $iv_itm_nm, value);
	}


	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public String cntry_org_cd() {
		return getConstString(offset + 24, $cntry_org_cd);
	}

	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public void cntry_org_cd(String value) {
		setConstString(offset + 24, $cntry_org_cd, value);
	}


	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public String cntry_org_nm() {
		return getConstString(offset + 25, $cntry_org_nm);
	}

	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public void cntry_org_nm(String value) {
		setConstString(offset + 25, $cntry_org_nm, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 26, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 26, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 27, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 27, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 28, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 28, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 28, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 28, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 28, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 28, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 29, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 29, $trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 30, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 30, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 30, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 30, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 30, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 30, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 31, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 31, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 31, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 31, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 31, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 31, $trd_unit_conv_qty, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 32, $trd_unit_qty_p);
	}
	
	public void trd_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 32, $trd_unit_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 33, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 33, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 34, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 34, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 35, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 35, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 35, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 35, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 35, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 35, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 36, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 36, $base_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 37, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 37, $base_unit_qty_p, row);
	}


	public mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR trd_cur_std_sls_upri_amt_p(){
		return (mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR) getConstInnerRow(offset + 38, $trd_cur_std_sls_upri_amt_p);
	}
	
	public void trd_cur_std_sls_upri_amt_p(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR row){
		setConstInnerRow(offset + 38, $trd_cur_std_sls_upri_amt_p, row);
	}


	/**
	 * Discount rate 仕切率.<p>
	 *
	 */
	public MCNumber upri_rate() {
		return getConstNumber(offset + 39, $upri_rate);
	}

	/**
	 * Discount rate 仕切率.<p>
	 *
	 */
	public void upri_rate(MCNumber value) {
		setConstNumber(offset + 39, $upri_rate, value);
	}

	/**
	 * Discount rate 仕切率.<p>
	 *
	 */
	public void upri_rate(int value) {
		setConstNumber(offset + 39, $upri_rate, value);
	}

	/**
	 * Discount rate 仕切率.<p>
	 *
	 */
	public void upri_rate(long value) {
		setConstNumber(offset + 39, $upri_rate, value);
	}

	/**
	 * Discount rate 仕切率.<p>
	 *
	 */
	public void upri_rate(float value) {
		setConstNumber(offset + 39, $upri_rate, value);
	}

	/**
	 * Discount rate 仕切率.<p>
	 *
	 */
	public void upri_rate(double value) {
		setConstNumber(offset + 39, $upri_rate, value);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR trd_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 40, $trd_cur_upri_p);
	}
	
	public void trd_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 40, $trd_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 41, $trd_cur_amt_p);
	}
	
	public void trd_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 41, $trd_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 42, $trd_cur_inc_tax_amt_p);
	}
	
	public void trd_cur_inc_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 42, $trd_cur_inc_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 43, $trd_cur_tax_amt_p);
	}
	
	public void trd_cur_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 43, $trd_cur_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR cost_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 44, $cost_upri_p);
	}
	
	public void cost_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 44, $cost_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR cost_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 45, $cost_amt_p);
	}
	
	public void cost_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 45, $cost_amt_p, row);
	}


	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public MCNumber prof_rate() {
		return getConstNumber(offset + 46, $prof_rate);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(MCNumber value) {
		setConstNumber(offset + 46, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(int value) {
		setConstNumber(offset + 46, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(long value) {
		setConstNumber(offset + 46, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(float value) {
		setConstNumber(offset + 46, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(double value) {
		setConstNumber(offset + 46, $prof_rate, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 47, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 47, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 48, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 48, $gd_nm, value);
	}


	/**
	 * Numbering SEIBAN No. 手配ＮＯ発番.<p>
	 *
	 */
	public boolean sno_auto_flg() {
		return getConstBoolean(offset + 49, $sno_auto_flg);
	}

	/**
	 * Numbering SEIBAN No. 手配ＮＯ発番.<p>
	 *
	 */
	public void sno_auto_flg(boolean value) {
		setConstBoolean(offset + 49, $sno_auto_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5070.SnoR sno_p(){
		return (mcframe.clientMAUB.MAUBP5070.SnoR) getConstInnerRow(offset + 50, $sno_p);
	}
	
	public void sno_p(mcframe.clientMAUB.MAUBP5070.SnoR row){
		setConstInnerRow(offset + 50, $sno_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR base_cur_std_sls_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 51, $base_cur_std_sls_upri_p);
	}
	
	public void base_cur_std_sls_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 51, $base_cur_std_sls_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_std_sls_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 52, $base_cur_std_sls_amt_p);
	}
	
	public void base_cur_std_sls_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 52, $base_cur_std_sls_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_std_sls_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 53, $base_cur_std_sls_inc_tax_amt_p);
	}
	
	public void base_cur_std_sls_inc_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 53, $base_cur_std_sls_inc_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_std_sls_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 54, $base_cur_std_sls_tax_amt_p);
	}
	
	public void base_cur_std_sls_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 54, $base_cur_std_sls_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR base_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 55, $base_cur_upri_p);
	}
	
	public void base_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 55, $base_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 56, $base_cur_amt_p);
	}
	
	public void base_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 56, $base_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 57, $base_cur_inc_tax_amt_p);
	}
	
	public void base_cur_inc_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 57, $base_cur_inc_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 58, $base_cur_tax_amt_p);
	}
	
	public void base_cur_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 58, $base_cur_tax_amt_p, row);
	}


	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public MCNumber set_itm_grp_no() {
		return getConstNumber(offset + 59, $set_itm_grp_no);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(MCNumber value) {
		setConstNumber(offset + 59, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(int value) {
		setConstNumber(offset + 59, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(long value) {
		setConstNumber(offset + 59, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(float value) {
		setConstNumber(offset + 59, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(double value) {
		setConstNumber(offset + 59, $set_itm_grp_no, value);
	}


	public mcframe.clientMAUB.MAUBP5400.DlvR dlv_p(){
		return (mcframe.clientMAUB.MAUBP5400.DlvR) getConstInnerRow(offset + 60, $dlv_p);
	}
	
	public void dlv_p(mcframe.clientMAUB.MAUBP5400.DlvR row){
		setConstInnerRow(offset + 60, $dlv_p, row);
	}


	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 61, $prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 61, $prnt_lcl_cd, value);
	}


	/**
	 * Distribution channel 1 cd. 仕向先１ＣＤ.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 62, $dest_cd1);
	}

	/**
	 * Distribution channel 1 cd. 仕向先１ＣＤ.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 62, $dest_cd1, value);
	}


	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public String dest_nm1() {
		return getConstString(offset + 63, $dest_nm1);
	}

	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public void dest_nm1(String value) {
		setConstString(offset + 63, $dest_nm1, value);
	}


	/**
	 * Distribution channel 2 cd. 仕向先２ＣＤ.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 64, $dest_cd2);
	}

	/**
	 * Distribution channel 2 cd. 仕向先２ＣＤ.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 64, $dest_cd2, value);
	}


	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public String dest_nm2() {
		return getConstString(offset + 65, $dest_nm2);
	}

	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public void dest_nm2(String value) {
		setConstString(offset + 65, $dest_nm2, value);
	}


	/**
	 * Distribution channel 3 cd. 仕向先３ＣＤ.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 66, $dest_cd3);
	}

	/**
	 * Distribution channel 3 cd. 仕向先３ＣＤ.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 66, $dest_cd3, value);
	}


	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public String dest_nm3() {
		return getConstString(offset + 67, $dest_nm3);
	}

	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public void dest_nm3(String value) {
		setConstString(offset + 67, $dest_nm3, value);
	}


	/**
	 * Quotation details remarks 見積明細備考.<p>
	 *
	 */
	public String qtn_d_rmrks() {
		return getConstString(offset + 68, $qtn_d_rmrks);
	}

	/**
	 * Quotation details remarks 見積明細備考.<p>
	 *
	 */
	public void qtn_d_rmrks(String value) {
		setConstString(offset + 68, $qtn_d_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 69, $intr_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 69, $intr_rmrks, value);
	}


	/**
	 * Configuration rev. number 構成改訂番号.<p>
	 *
	 */
	public String itm_comp_rev_no() {
		return getConstString(offset + 70, $itm_comp_rev_no);
	}

	/**
	 * Configuration rev. number 構成改訂番号.<p>
	 *
	 */
	public void itm_comp_rev_no(String value) {
		setConstString(offset + 70, $itm_comp_rev_no, value);
	}


	/**
	 * Item undefined 品目未定義.<p>
	 *
	 */
	public boolean no_itm_cd_flg() {
		return getConstBoolean(offset + 71, $no_itm_cd_flg);
	}

	/**
	 * Item undefined 品目未定義.<p>
	 *
	 */
	public void no_itm_cd_flg(boolean value) {
		setConstBoolean(offset + 71, $no_itm_cd_flg, value);
	}


	/**
	 * Configuration release 構成リリース.<p>
	 *
	 */
	public boolean comp_rel_flg() {
		return getConstBoolean(offset + 72, $comp_rel_flg);
	}

	/**
	 * Configuration release 構成リリース.<p>
	 *
	 */
	public void comp_rel_flg(boolean value) {
		setConstBoolean(offset + 72, $comp_rel_flg, value);
	}


	/**
	 * Specification exists 仕様有.<p>
	 *
	 */
	public boolean spec_flg() {
		return getConstBoolean(offset + 73, $spec_flg);
	}

	/**
	 * Specification exists 仕様有.<p>
	 *
	 */
	public void spec_flg(boolean value) {
		setConstBoolean(offset + 73, $spec_flg, value);
	}


	/**
	 * Specification remarks 仕様備考.<p>
	 *
	 */
	public String spec_sub_char1() {
		return getConstString(offset + 74, $spec_sub_char1);
	}

	/**
	 * Specification remarks 仕様備考.<p>
	 *
	 */
	public void spec_sub_char1(String value) {
		setConstString(offset + 74, $spec_sub_char1, value);
	}


	/**
	 * Specification spare 1 仕様予備１.<p>
	 *
	 */
	public String spec_sub_char2() {
		return getConstString(offset + 75, $spec_sub_char2);
	}

	/**
	 * Specification spare 1 仕様予備１.<p>
	 *
	 */
	public void spec_sub_char2(String value) {
		setConstString(offset + 75, $spec_sub_char2, value);
	}


	/**
	 * Specification spare 2 仕様予備２.<p>
	 *
	 */
	public String spec_sub_char3() {
		return getConstString(offset + 76, $spec_sub_char3);
	}

	/**
	 * Specification spare 2 仕様予備２.<p>
	 *
	 */
	public void spec_sub_char3(String value) {
		setConstString(offset + 76, $spec_sub_char3, value);
	}


	/**
	 * Specification spare 3 仕様予備３.<p>
	 *
	 */
	public String spec_sub_char4() {
		return getConstString(offset + 77, $spec_sub_char4);
	}

	/**
	 * Specification spare 3 仕様予備３.<p>
	 *
	 */
	public void spec_sub_char4(String value) {
		setConstString(offset + 77, $spec_sub_char4, value);
	}


	/**
	 * Quotation details result reason cd. 見積明細結果理由ＣＤ.<p>
	 *
	 */
	public String qtn_d_rslt_rsn_cd() {
		return getConstString(offset + 78, $qtn_d_rslt_rsn_cd);
	}

	/**
	 * Quotation details result reason cd. 見積明細結果理由ＣＤ.<p>
	 *
	 */
	public void qtn_d_rslt_rsn_cd(String value) {
		setConstString(offset + 78, $qtn_d_rslt_rsn_cd, value);
	}


	/**
	 * Quotation details result reason name 見積明細結果理由名.<p>
	 *
	 */
	public String qtn_d_rslt_rsn_nm() {
		return getConstString(offset + 79, $qtn_d_rslt_rsn_nm);
	}

	/**
	 * Quotation details result reason name 見積明細結果理由名.<p>
	 *
	 */
	public void qtn_d_rslt_rsn_nm(String value) {
		setConstString(offset + 79, $qtn_d_rslt_rsn_nm, value);
	}


	/**
	 * Quotation details result reason remarks 見積明細結果理由備考.<p>
	 *
	 */
	public String qtn_d_rslt_rsn_rmrks() {
		return getConstString(offset + 80, $qtn_d_rslt_rsn_rmrks);
	}

	/**
	 * Quotation details result reason remarks 見積明細結果理由備考.<p>
	 *
	 */
	public void qtn_d_rslt_rsn_rmrks(String value) {
		setConstString(offset + 80, $qtn_d_rslt_rsn_rmrks, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trnst_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 81, $trnst_qty_p);
	}
	
	public void trnst_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 81, $trnst_qty_p, row);
	}


	/**
	 * Customer quotation request details No. 得意先見積依頼明細ＮＯ.<p>
	 *
	 */
	public String cst_qtn_rqst_d_no() {
		return getConstString(offset + 82, $cst_qtn_rqst_d_no);
	}

	/**
	 * Customer quotation request details No. 得意先見積依頼明細ＮＯ.<p>
	 *
	 */
	public void cst_qtn_rqst_d_no(String value) {
		setConstString(offset + 82, $cst_qtn_rqst_d_no, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 83, $sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 83, $sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 84, $sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 84, $sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 85, $sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 85, $sub_char3, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 86, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 86, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 86, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 86, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 86, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 86, $disp_seq, value);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR old_trd_cur_std_sls_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 87, $old_trd_cur_std_sls_upri_p);
	}
	
	public void old_trd_cur_std_sls_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 87, $old_trd_cur_std_sls_upri_p, row);
	}


	public String getString(String name) {
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			return qtn_d_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
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
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			return sno1_num_typ();
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			return sno2_num_typ();
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			return sno3_num_typ();
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			return sno4_num_typ();
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			return comp_spec_typ();
		}
		if ($comp_spec_typ_nm.equalsIgnoreCase(name)) {
			return comp_spec_typ_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			return cntry_org_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			return dest_nm1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			return dest_nm2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			return dest_nm3();
		}
		if ($qtn_d_rmrks.equalsIgnoreCase(name)) {
			return qtn_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($itm_comp_rev_no.equalsIgnoreCase(name)) {
			return itm_comp_rev_no();
		}
		if ($spec_sub_char1.equalsIgnoreCase(name)) {
			return spec_sub_char1();
		}
		if ($spec_sub_char2.equalsIgnoreCase(name)) {
			return spec_sub_char2();
		}
		if ($spec_sub_char3.equalsIgnoreCase(name)) {
			return spec_sub_char3();
		}
		if ($spec_sub_char4.equalsIgnoreCase(name)) {
			return spec_sub_char4();
		}
		if ($qtn_d_rslt_rsn_cd.equalsIgnoreCase(name)) {
			return qtn_d_rslt_rsn_cd();
		}
		if ($qtn_d_rslt_rsn_nm.equalsIgnoreCase(name)) {
			return qtn_d_rslt_rsn_nm();
		}
		if ($qtn_d_rslt_rsn_rmrks.equalsIgnoreCase(name)) {
			return qtn_d_rslt_rsn_rmrks();
		}
		if ($cst_qtn_rqst_d_no.equalsIgnoreCase(name)) {
			return cst_qtn_rqst_d_no();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			return upri_rate();
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			return prof_rate();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			return slo_sno1_flg();
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			return slo_sno2_flg();
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			return slo_sno3_flg();
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			return slo_sno4_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($sno_auto_flg.equalsIgnoreCase(name)) {
			return sno_auto_flg();
		}
		if ($no_itm_cd_flg.equalsIgnoreCase(name)) {
			return no_itm_cd_flg();
		}
		if ($comp_rel_flg.equalsIgnoreCase(name)) {
			return comp_rel_flg();
		}
		if ($spec_flg.equalsIgnoreCase(name)) {
			return spec_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			return qtn_d_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
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
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			return sno1_num_typ();
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			return sno2_num_typ();
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			return sno3_num_typ();
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			return sno4_num_typ();
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			return comp_spec_typ();
		}
		if ($comp_spec_typ_nm.equalsIgnoreCase(name)) {
			return comp_spec_typ_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			return cntry_org_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			return dest_nm1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			return dest_nm2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			return dest_nm3();
		}
		if ($qtn_d_rmrks.equalsIgnoreCase(name)) {
			return qtn_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($itm_comp_rev_no.equalsIgnoreCase(name)) {
			return itm_comp_rev_no();
		}
		if ($spec_sub_char1.equalsIgnoreCase(name)) {
			return spec_sub_char1();
		}
		if ($spec_sub_char2.equalsIgnoreCase(name)) {
			return spec_sub_char2();
		}
		if ($spec_sub_char3.equalsIgnoreCase(name)) {
			return spec_sub_char3();
		}
		if ($spec_sub_char4.equalsIgnoreCase(name)) {
			return spec_sub_char4();
		}
		if ($qtn_d_rslt_rsn_cd.equalsIgnoreCase(name)) {
			return qtn_d_rslt_rsn_cd();
		}
		if ($qtn_d_rslt_rsn_nm.equalsIgnoreCase(name)) {
			return qtn_d_rslt_rsn_nm();
		}
		if ($qtn_d_rslt_rsn_rmrks.equalsIgnoreCase(name)) {
			return qtn_d_rslt_rsn_rmrks();
		}
		if ($cst_qtn_rqst_d_no.equalsIgnoreCase(name)) {
			return cst_qtn_rqst_d_no();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			return upri_rate();
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			return prof_rate();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			return slo_sno1_flg();
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			return slo_sno2_flg();
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			return slo_sno3_flg();
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			return slo_sno4_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($sno_auto_flg.equalsIgnoreCase(name)) {
			return sno_auto_flg();
		}
		if ($no_itm_cd_flg.equalsIgnoreCase(name)) {
			return no_itm_cd_flg();
		}
		if ($comp_rel_flg.equalsIgnoreCase(name)) {
			return comp_rel_flg();
		}
		if ($spec_flg.equalsIgnoreCase(name)) {
			return spec_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			qtn_d_no(value);
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
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			sno1_num_typ(value);
			return;
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			sno2_num_typ(value);
			return;
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			sno3_num_typ(value);
			return;
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			sno4_num_typ(value);
			return;
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			comp_spec_typ(value);
			return;
		}
		if ($comp_spec_typ_nm.equalsIgnoreCase(name)) {
			comp_spec_typ_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			cntry_org_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			dest_nm1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			dest_nm2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			dest_nm3(value);
			return;
		}
		if ($qtn_d_rmrks.equalsIgnoreCase(name)) {
			qtn_d_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($itm_comp_rev_no.equalsIgnoreCase(name)) {
			itm_comp_rev_no(value);
			return;
		}
		if ($spec_sub_char1.equalsIgnoreCase(name)) {
			spec_sub_char1(value);
			return;
		}
		if ($spec_sub_char2.equalsIgnoreCase(name)) {
			spec_sub_char2(value);
			return;
		}
		if ($spec_sub_char3.equalsIgnoreCase(name)) {
			spec_sub_char3(value);
			return;
		}
		if ($spec_sub_char4.equalsIgnoreCase(name)) {
			spec_sub_char4(value);
			return;
		}
		if ($qtn_d_rslt_rsn_cd.equalsIgnoreCase(name)) {
			qtn_d_rslt_rsn_cd(value);
			return;
		}
		if ($qtn_d_rslt_rsn_nm.equalsIgnoreCase(name)) {
			qtn_d_rslt_rsn_nm(value);
			return;
		}
		if ($qtn_d_rslt_rsn_rmrks.equalsIgnoreCase(name)) {
			qtn_d_rslt_rsn_rmrks(value);
			return;
		}
		if ($cst_qtn_rqst_d_no.equalsIgnoreCase(name)) {
			cst_qtn_rqst_d_no(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			slo_sno1_flg(value);
			return;
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			slo_sno2_flg(value);
			return;
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			slo_sno3_flg(value);
			return;
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			slo_sno4_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($sno_auto_flg.equalsIgnoreCase(name)) {
			sno_auto_flg(value);
			return;
		}
		if ($no_itm_cd_flg.equalsIgnoreCase(name)) {
			no_itm_cd_flg(value);
			return;
		}
		if ($comp_rel_flg.equalsIgnoreCase(name)) {
			comp_rel_flg(value);
			return;
		}
		if ($spec_flg.equalsIgnoreCase(name)) {
			spec_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			qtn_d_no(value);
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
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			sno1_num_typ(value);
			return;
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			sno2_num_typ(value);
			return;
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			sno3_num_typ(value);
			return;
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			sno4_num_typ(value);
			return;
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			comp_spec_typ(value);
			return;
		}
		if ($comp_spec_typ_nm.equalsIgnoreCase(name)) {
			comp_spec_typ_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			cntry_org_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			dest_nm1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			dest_nm2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			dest_nm3(value);
			return;
		}
		if ($qtn_d_rmrks.equalsIgnoreCase(name)) {
			qtn_d_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($itm_comp_rev_no.equalsIgnoreCase(name)) {
			itm_comp_rev_no(value);
			return;
		}
		if ($spec_sub_char1.equalsIgnoreCase(name)) {
			spec_sub_char1(value);
			return;
		}
		if ($spec_sub_char2.equalsIgnoreCase(name)) {
			spec_sub_char2(value);
			return;
		}
		if ($spec_sub_char3.equalsIgnoreCase(name)) {
			spec_sub_char3(value);
			return;
		}
		if ($spec_sub_char4.equalsIgnoreCase(name)) {
			spec_sub_char4(value);
			return;
		}
		if ($qtn_d_rslt_rsn_cd.equalsIgnoreCase(name)) {
			qtn_d_rslt_rsn_cd(value);
			return;
		}
		if ($qtn_d_rslt_rsn_nm.equalsIgnoreCase(name)) {
			qtn_d_rslt_rsn_nm(value);
			return;
		}
		if ($qtn_d_rslt_rsn_rmrks.equalsIgnoreCase(name)) {
			qtn_d_rslt_rsn_rmrks(value);
			return;
		}
		if ($cst_qtn_rqst_d_no.equalsIgnoreCase(name)) {
			cst_qtn_rqst_d_no(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			slo_sno1_flg(value);
			return;
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			slo_sno2_flg(value);
			return;
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			slo_sno3_flg(value);
			return;
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			slo_sno4_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($sno_auto_flg.equalsIgnoreCase(name)) {
			sno_auto_flg(value);
			return;
		}
		if ($no_itm_cd_flg.equalsIgnoreCase(name)) {
			no_itm_cd_flg(value);
			return;
		}
		if ($comp_rel_flg.equalsIgnoreCase(name)) {
			comp_rel_flg(value);
			return;
		}
		if ($spec_flg.equalsIgnoreCase(name)) {
			spec_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($trd_unit_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_qty_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($trd_cur_std_sls_upri_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_std_sls_upri_amt_p();
		}
		if ($trd_cur_upri_p.equalsIgnoreCase(name)) {
			return trd_cur_upri_p();
		}
		if ($trd_cur_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_amt_p();
		}
		if ($trd_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt_p();
		}
		if ($trd_cur_tax_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt_p();
		}
		if ($cost_upri_p.equalsIgnoreCase(name)) {
			return cost_upri_p();
		}
		if ($cost_amt_p.equalsIgnoreCase(name)) {
			return cost_amt_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($base_cur_std_sls_upri_p.equalsIgnoreCase(name)) {
			return base_cur_std_sls_upri_p();
		}
		if ($base_cur_std_sls_amt_p.equalsIgnoreCase(name)) {
			return base_cur_std_sls_amt_p();
		}
		if ($base_cur_std_sls_inc_tax_amt_p.equalsIgnoreCase(name)) {
			return base_cur_std_sls_inc_tax_amt_p();
		}
		if ($base_cur_std_sls_tax_amt_p.equalsIgnoreCase(name)) {
			return base_cur_std_sls_tax_amt_p();
		}
		if ($base_cur_upri_p.equalsIgnoreCase(name)) {
			return base_cur_upri_p();
		}
		if ($base_cur_amt_p.equalsIgnoreCase(name)) {
			return base_cur_amt_p();
		}
		if ($base_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			return base_cur_inc_tax_amt_p();
		}
		if ($base_cur_tax_amt_p.equalsIgnoreCase(name)) {
			return base_cur_tax_amt_p();
		}
		if ($dlv_p.equalsIgnoreCase(name)) {
			return dlv_p();
		}
		if ($trnst_qty_p.equalsIgnoreCase(name)) {
			return trnst_qty_p();
		}
		if ($old_trd_cur_std_sls_upri_p.equalsIgnoreCase(name)) {
			return old_trd_cur_std_sls_upri_p();
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
		if ($trd_unit_qty_p.equalsIgnoreCase(name)) {
			trd_unit_qty_p(
				((MCContainerMeta) trd_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			base_unit_qty_p(
				((MCContainerMeta) base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($trd_cur_std_sls_upri_amt_p.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri_amt_p(
				((MCContainerMeta) trd_cur_std_sls_upri_amt_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.class, value)
			);
			return;
		}
		if ($trd_cur_upri_p.equalsIgnoreCase(name)) {
			trd_cur_upri_p(
				((MCContainerMeta) trd_cur_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($trd_cur_amt_p.equalsIgnoreCase(name)) {
			trd_cur_amt_p(
				((MCContainerMeta) trd_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($trd_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt_p(
				((MCContainerMeta) trd_cur_inc_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($trd_cur_tax_amt_p.equalsIgnoreCase(name)) {
			trd_cur_tax_amt_p(
				((MCContainerMeta) trd_cur_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($cost_upri_p.equalsIgnoreCase(name)) {
			cost_upri_p(
				((MCContainerMeta) cost_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($cost_amt_p.equalsIgnoreCase(name)) {
			cost_amt_p(
				((MCContainerMeta) cost_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5070.SnoR.class, value)
			);
			return;
		}
		if ($base_cur_std_sls_upri_p.equalsIgnoreCase(name)) {
			base_cur_std_sls_upri_p(
				((MCContainerMeta) base_cur_std_sls_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($base_cur_std_sls_amt_p.equalsIgnoreCase(name)) {
			base_cur_std_sls_amt_p(
				((MCContainerMeta) base_cur_std_sls_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_std_sls_inc_tax_amt_p.equalsIgnoreCase(name)) {
			base_cur_std_sls_inc_tax_amt_p(
				((MCContainerMeta) base_cur_std_sls_inc_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_std_sls_tax_amt_p.equalsIgnoreCase(name)) {
			base_cur_std_sls_tax_amt_p(
				((MCContainerMeta) base_cur_std_sls_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_upri_p.equalsIgnoreCase(name)) {
			base_cur_upri_p(
				((MCContainerMeta) base_cur_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($base_cur_amt_p.equalsIgnoreCase(name)) {
			base_cur_amt_p(
				((MCContainerMeta) base_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt_p(
				((MCContainerMeta) base_cur_inc_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_tax_amt_p.equalsIgnoreCase(name)) {
			base_cur_tax_amt_p(
				((MCContainerMeta) base_cur_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($dlv_p.equalsIgnoreCase(name)) {
			dlv_p(
				((MCContainerMeta) dlv_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5400.DlvR.class, value)
			);
			return;
		}
		if ($trnst_qty_p.equalsIgnoreCase(name)) {
			trnst_qty_p(
				((MCContainerMeta) trnst_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($old_trd_cur_std_sls_upri_p.equalsIgnoreCase(name)) {
			old_trd_cur_std_sls_upri_p(
				((MCContainerMeta) old_trd_cur_std_sls_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
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
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return trd_unit_qty_p().qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return base_unit_qty_p().qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		base_unit_qty_p().qty(value);
	}

	public boolean upri_not_tgt_flg() {
		return trd_cur_std_sls_upri_amt_p().upri_not_tgt_flg();
	}

	public void upri_not_tgt_flg(boolean value) {
		trd_cur_std_sls_upri_amt_p().upri_not_tgt_flg(value);
	}

	/**
	 * Standard sales unit price (Transaction currency) 取引通貨標準販売単価.<p>
	 *
	 */
	public MCNumber trd_cur_std_sls_upri() {
		return trd_cur_std_sls_upri_amt_p().trd_cur_upri();
	}

	/**
	 * Standard sales unit price (Transaction currency) 取引通貨標準販売単価.<p>
	 *
	 */
	public void trd_cur_std_sls_upri(MCNumber value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_upri(value);
	}

	/**
	 * Standard sales unit price (Transaction currency) 取引通貨標準販売単価.<p>
	 *
	 */
	public void trd_cur_std_sls_upri(int value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_upri(value);
	}

	/**
	 * Standard sales unit price (Transaction currency) 取引通貨標準販売単価.<p>
	 *
	 */
	public void trd_cur_std_sls_upri(long value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_upri(value);
	}

	/**
	 * Standard sales unit price (Transaction currency) 取引通貨標準販売単価.<p>
	 *
	 */
	public void trd_cur_std_sls_upri(float value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_upri(value);
	}

	/**
	 * Standard sales unit price (Transaction currency) 取引通貨標準販売単価.<p>
	 *
	 */
	public void trd_cur_std_sls_upri(double value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_upri(value);
	}

	public boolean interim_flg() {
		return trd_cur_std_sls_upri_amt_p().interim_flg();
	}

	public void interim_flg(boolean value) {
		trd_cur_std_sls_upri_amt_p().interim_flg(value);
	}

	/**
	 * Standard sales amount (Transaction currency) 取引通貨標準販売金額.<p>
	 *
	 */
	public MCNumber trd_cur_std_sls_amt() {
		return trd_cur_std_sls_upri_amt_p().trd_cur_amt();
	}

	/**
	 * Standard sales amount (Transaction currency) 取引通貨標準販売金額.<p>
	 *
	 */
	public void trd_cur_std_sls_amt(MCNumber value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_amt(value);
	}

	/**
	 * Standard sales amount (Transaction currency) 取引通貨標準販売金額.<p>
	 *
	 */
	public void trd_cur_std_sls_amt(int value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_amt(value);
	}

	/**
	 * Standard sales amount (Transaction currency) 取引通貨標準販売金額.<p>
	 *
	 */
	public void trd_cur_std_sls_amt(long value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_amt(value);
	}

	/**
	 * Standard sales amount (Transaction currency) 取引通貨標準販売金額.<p>
	 *
	 */
	public void trd_cur_std_sls_amt(float value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_amt(value);
	}

	/**
	 * Standard sales amount (Transaction currency) 取引通貨標準販売金額.<p>
	 *
	 */
	public void trd_cur_std_sls_amt(double value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_amt(value);
	}

	/**
	 * Standard tax included sales amount (Transaction currency) 取引通貨標準販売税込金額.<p>
	 *
	 */
	public MCNumber trd_cur_std_sls_inc_tax_amt() {
		return trd_cur_std_sls_upri_amt_p().trd_cur_inc_tax_amt();
	}

	/**
	 * Standard tax included sales amount (Transaction currency) 取引通貨標準販売税込金額.<p>
	 *
	 */
	public void trd_cur_std_sls_inc_tax_amt(MCNumber value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	/**
	 * Standard tax included sales amount (Transaction currency) 取引通貨標準販売税込金額.<p>
	 *
	 */
	public void trd_cur_std_sls_inc_tax_amt(int value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	/**
	 * Standard tax included sales amount (Transaction currency) 取引通貨標準販売税込金額.<p>
	 *
	 */
	public void trd_cur_std_sls_inc_tax_amt(long value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	/**
	 * Standard tax included sales amount (Transaction currency) 取引通貨標準販売税込金額.<p>
	 *
	 */
	public void trd_cur_std_sls_inc_tax_amt(float value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	/**
	 * Standard tax included sales amount (Transaction currency) 取引通貨標準販売税込金額.<p>
	 *
	 */
	public void trd_cur_std_sls_inc_tax_amt(double value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public boolean tax_fix_flg() {
		return trd_cur_std_sls_upri_amt_p().tax_fix_flg();
	}

	public void tax_fix_flg(boolean value) {
		trd_cur_std_sls_upri_amt_p().tax_fix_flg(value);
	}

	public String tax_cd() {
		return trd_cur_std_sls_upri_amt_p().tax_cd();
	}

	public void tax_cd(String value) {
		trd_cur_std_sls_upri_amt_p().tax_cd(value);
	}

	public String tax_nm() {
		return trd_cur_std_sls_upri_amt_p().tax_nm();
	}

	public void tax_nm(String value) {
		trd_cur_std_sls_upri_amt_p().tax_nm(value);
	}

	public MCNumber tax_rate() {
		return trd_cur_std_sls_upri_amt_p().tax_rate();
	}

	public void tax_rate(MCNumber value) {
		trd_cur_std_sls_upri_amt_p().tax_rate(value);
	}

	public void tax_rate(int value) {
		trd_cur_std_sls_upri_amt_p().tax_rate(value);
	}

	public void tax_rate(long value) {
		trd_cur_std_sls_upri_amt_p().tax_rate(value);
	}

	public void tax_rate(float value) {
		trd_cur_std_sls_upri_amt_p().tax_rate(value);
	}

	public void tax_rate(double value) {
		trd_cur_std_sls_upri_amt_p().tax_rate(value);
	}

	public String tax_typ() {
		return trd_cur_std_sls_upri_amt_p().tax_typ();
	}

	public void tax_typ(String value) {
		trd_cur_std_sls_upri_amt_p().tax_typ(value);
	}

	public boolean inc_tax_flg() {
		return trd_cur_std_sls_upri_amt_p().inc_tax_flg();
	}

	public void inc_tax_flg(boolean value) {
		trd_cur_std_sls_upri_amt_p().inc_tax_flg(value);
	}

	/**
	 * Standard sales tax (Transaction currency) 取引通貨標準販売税額.<p>
	 *
	 */
	public MCNumber trd_cur_std_sls_tax_amt() {
		return trd_cur_std_sls_upri_amt_p().trd_cur_tax_amt();
	}

	/**
	 * Standard sales tax (Transaction currency) 取引通貨標準販売税額.<p>
	 *
	 */
	public void trd_cur_std_sls_tax_amt(MCNumber value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_tax_amt(value);
	}

	/**
	 * Standard sales tax (Transaction currency) 取引通貨標準販売税額.<p>
	 *
	 */
	public void trd_cur_std_sls_tax_amt(int value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_tax_amt(value);
	}

	/**
	 * Standard sales tax (Transaction currency) 取引通貨標準販売税額.<p>
	 *
	 */
	public void trd_cur_std_sls_tax_amt(long value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_tax_amt(value);
	}

	/**
	 * Standard sales tax (Transaction currency) 取引通貨標準販売税額.<p>
	 *
	 */
	public void trd_cur_std_sls_tax_amt(float value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_tax_amt(value);
	}

	/**
	 * Standard sales tax (Transaction currency) 取引通貨標準販売税額.<p>
	 *
	 */
	public void trd_cur_std_sls_tax_amt(double value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_tax_amt(value);
	}

	public MCNumber trd_cur_dscnt_amt() {
		return trd_cur_std_sls_upri_amt_p().trd_cur_dscnt_amt();
	}

	public void trd_cur_dscnt_amt(MCNumber value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(int value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(long value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(float value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(double value) {
		trd_cur_std_sls_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public String dscnt_rsn_cd() {
		return trd_cur_std_sls_upri_amt_p().dscnt_rsn_cd();
	}

	public void dscnt_rsn_cd(String value) {
		trd_cur_std_sls_upri_amt_p().dscnt_rsn_cd(value);
	}

	public String dscnt_rsn_nm() {
		return trd_cur_std_sls_upri_amt_p().dscnt_rsn_nm();
	}

	public void dscnt_rsn_nm(String value) {
		trd_cur_std_sls_upri_amt_p().dscnt_rsn_nm(value);
	}

	/**
	 * Discount unit price (Transaction currency) 取引通貨仕切単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return trd_cur_upri_p().upri();
	}

	/**
	 * Discount unit price (Transaction currency) 取引通貨仕切単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		trd_cur_upri_p().upri(value);
	}

	/**
	 * Discount unit price (Transaction currency) 取引通貨仕切単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		trd_cur_upri_p().upri(value);
	}

	/**
	 * Discount unit price (Transaction currency) 取引通貨仕切単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		trd_cur_upri_p().upri(value);
	}

	/**
	 * Discount unit price (Transaction currency) 取引通貨仕切単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		trd_cur_upri_p().upri(value);
	}

	/**
	 * Discount unit price (Transaction currency) 取引通貨仕切単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		trd_cur_upri_p().upri(value);
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return trd_cur_amt_p().amt();
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Tax included discount amount (Transaction currency) 取引通貨仕切税込金額.<p>
	 *
	 */
	public MCNumber trd_cur_inc_tax_amt() {
		return trd_cur_inc_tax_amt_p().amt();
	}

	/**
	 * Tax included discount amount (Transaction currency) 取引通貨仕切税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(MCNumber value) {
		trd_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included discount amount (Transaction currency) 取引通貨仕切税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(int value) {
		trd_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included discount amount (Transaction currency) 取引通貨仕切税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(long value) {
		trd_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included discount amount (Transaction currency) 取引通貨仕切税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(float value) {
		trd_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included discount amount (Transaction currency) 取引通貨仕切税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(double value) {
		trd_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Discount unit tax (Transaction currency) 取引通貨仕切税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return trd_cur_tax_amt_p().amt();
	}

	/**
	 * Discount unit tax (Transaction currency) 取引通貨仕切税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		trd_cur_tax_amt_p().amt(value);
	}

	/**
	 * Discount unit tax (Transaction currency) 取引通貨仕切税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		trd_cur_tax_amt_p().amt(value);
	}

	/**
	 * Discount unit tax (Transaction currency) 取引通貨仕切税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		trd_cur_tax_amt_p().amt(value);
	}

	/**
	 * Discount unit tax (Transaction currency) 取引通貨仕切税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		trd_cur_tax_amt_p().amt(value);
	}

	/**
	 * Discount unit tax (Transaction currency) 取引通貨仕切税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		trd_cur_tax_amt_p().amt(value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public MCNumber cost_upri() {
		return cost_upri_p().upri();
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(MCNumber value) {
		cost_upri_p().upri(value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(int value) {
		cost_upri_p().upri(value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(long value) {
		cost_upri_p().upri(value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(float value) {
		cost_upri_p().upri(value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(double value) {
		cost_upri_p().upri(value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public MCNumber cost_amt() {
		return cost_amt_p().amt();
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(MCNumber value) {
		cost_amt_p().amt(value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(int value) {
		cost_amt_p().amt(value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(long value) {
		cost_amt_p().amt(value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(float value) {
		cost_amt_p().amt(value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(double value) {
		cost_amt_p().amt(value);
	}

	public String sno1() {
		return sno_p().sno1();
	}

	public void sno1(String value) {
		sno_p().sno1(value);
	}

	public String sno2() {
		return sno_p().sno2();
	}

	public void sno2(String value) {
		sno_p().sno2(value);
	}

	public String sno3() {
		return sno_p().sno3();
	}

	public void sno3(String value) {
		sno_p().sno3(value);
	}

	public String sno4() {
		return sno_p().sno4();
	}

	public void sno4(String value) {
		sno_p().sno4(value);
	}

	/**
	 * Standard sales unit price (Base currency) 基準通貨標準販売単価.<p>
	 *
	 */
	public MCNumber base_cur_std_sls_upri() {
		return base_cur_std_sls_upri_p().upri();
	}

	/**
	 * Standard sales unit price (Base currency) 基準通貨標準販売単価.<p>
	 *
	 */
	public void base_cur_std_sls_upri(MCNumber value) {
		base_cur_std_sls_upri_p().upri(value);
	}

	/**
	 * Standard sales unit price (Base currency) 基準通貨標準販売単価.<p>
	 *
	 */
	public void base_cur_std_sls_upri(int value) {
		base_cur_std_sls_upri_p().upri(value);
	}

	/**
	 * Standard sales unit price (Base currency) 基準通貨標準販売単価.<p>
	 *
	 */
	public void base_cur_std_sls_upri(long value) {
		base_cur_std_sls_upri_p().upri(value);
	}

	/**
	 * Standard sales unit price (Base currency) 基準通貨標準販売単価.<p>
	 *
	 */
	public void base_cur_std_sls_upri(float value) {
		base_cur_std_sls_upri_p().upri(value);
	}

	/**
	 * Standard sales unit price (Base currency) 基準通貨標準販売単価.<p>
	 *
	 */
	public void base_cur_std_sls_upri(double value) {
		base_cur_std_sls_upri_p().upri(value);
	}

	/**
	 * Standard sales amount (Base currency) 基準通貨標準販売金額.<p>
	 *
	 */
	public MCNumber base_cur_std_sls_amt() {
		return base_cur_std_sls_amt_p().amt();
	}

	/**
	 * Standard sales amount (Base currency) 基準通貨標準販売金額.<p>
	 *
	 */
	public void base_cur_std_sls_amt(MCNumber value) {
		base_cur_std_sls_amt_p().amt(value);
	}

	/**
	 * Standard sales amount (Base currency) 基準通貨標準販売金額.<p>
	 *
	 */
	public void base_cur_std_sls_amt(int value) {
		base_cur_std_sls_amt_p().amt(value);
	}

	/**
	 * Standard sales amount (Base currency) 基準通貨標準販売金額.<p>
	 *
	 */
	public void base_cur_std_sls_amt(long value) {
		base_cur_std_sls_amt_p().amt(value);
	}

	/**
	 * Standard sales amount (Base currency) 基準通貨標準販売金額.<p>
	 *
	 */
	public void base_cur_std_sls_amt(float value) {
		base_cur_std_sls_amt_p().amt(value);
	}

	/**
	 * Standard sales amount (Base currency) 基準通貨標準販売金額.<p>
	 *
	 */
	public void base_cur_std_sls_amt(double value) {
		base_cur_std_sls_amt_p().amt(value);
	}

	/**
	 * Standard tax included sales amount (Base currency) 基準通貨標準販売税込金額.<p>
	 *
	 */
	public MCNumber base_cur_std_sls_inc_tax_amt() {
		return base_cur_std_sls_inc_tax_amt_p().amt();
	}

	/**
	 * Standard tax included sales amount (Base currency) 基準通貨標準販売税込金額.<p>
	 *
	 */
	public void base_cur_std_sls_inc_tax_amt(MCNumber value) {
		base_cur_std_sls_inc_tax_amt_p().amt(value);
	}

	/**
	 * Standard tax included sales amount (Base currency) 基準通貨標準販売税込金額.<p>
	 *
	 */
	public void base_cur_std_sls_inc_tax_amt(int value) {
		base_cur_std_sls_inc_tax_amt_p().amt(value);
	}

	/**
	 * Standard tax included sales amount (Base currency) 基準通貨標準販売税込金額.<p>
	 *
	 */
	public void base_cur_std_sls_inc_tax_amt(long value) {
		base_cur_std_sls_inc_tax_amt_p().amt(value);
	}

	/**
	 * Standard tax included sales amount (Base currency) 基準通貨標準販売税込金額.<p>
	 *
	 */
	public void base_cur_std_sls_inc_tax_amt(float value) {
		base_cur_std_sls_inc_tax_amt_p().amt(value);
	}

	/**
	 * Standard tax included sales amount (Base currency) 基準通貨標準販売税込金額.<p>
	 *
	 */
	public void base_cur_std_sls_inc_tax_amt(double value) {
		base_cur_std_sls_inc_tax_amt_p().amt(value);
	}

	/**
	 * Standard sales tax amount (Base currency) 基準通貨標準販売税額.<p>
	 *
	 */
	public MCNumber base_cur_std_sls_tax_amt() {
		return base_cur_std_sls_tax_amt_p().amt();
	}

	/**
	 * Standard sales tax amount (Base currency) 基準通貨標準販売税額.<p>
	 *
	 */
	public void base_cur_std_sls_tax_amt(MCNumber value) {
		base_cur_std_sls_tax_amt_p().amt(value);
	}

	/**
	 * Standard sales tax amount (Base currency) 基準通貨標準販売税額.<p>
	 *
	 */
	public void base_cur_std_sls_tax_amt(int value) {
		base_cur_std_sls_tax_amt_p().amt(value);
	}

	/**
	 * Standard sales tax amount (Base currency) 基準通貨標準販売税額.<p>
	 *
	 */
	public void base_cur_std_sls_tax_amt(long value) {
		base_cur_std_sls_tax_amt_p().amt(value);
	}

	/**
	 * Standard sales tax amount (Base currency) 基準通貨標準販売税額.<p>
	 *
	 */
	public void base_cur_std_sls_tax_amt(float value) {
		base_cur_std_sls_tax_amt_p().amt(value);
	}

	/**
	 * Standard sales tax amount (Base currency) 基準通貨標準販売税額.<p>
	 *
	 */
	public void base_cur_std_sls_tax_amt(double value) {
		base_cur_std_sls_tax_amt_p().amt(value);
	}

	/**
	 * Discount unit price (Base currency) 基準通貨仕切単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return base_cur_upri_p().upri();
	}

	/**
	 * Discount unit price (Base currency) 基準通貨仕切単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Discount unit price (Base currency) 基準通貨仕切単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Discount unit price (Base currency) 基準通貨仕切単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Discount unit price (Base currency) 基準通貨仕切単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Discount unit price (Base currency) 基準通貨仕切単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨仕切金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return base_cur_amt_p().amt();
	}

	/**
	 * Discount amount (Base currency) 基準通貨仕切金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨仕切金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨仕切金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨仕切金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨仕切金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Tax included discount amount (Base currency) 基準通貨仕切税込金額.<p>
	 *
	 */
	public MCNumber base_cur_inc_tax_amt() {
		return base_cur_inc_tax_amt_p().amt();
	}

	/**
	 * Tax included discount amount (Base currency) 基準通貨仕切税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(MCNumber value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included discount amount (Base currency) 基準通貨仕切税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(int value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included discount amount (Base currency) 基準通貨仕切税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(long value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included discount amount (Base currency) 基準通貨仕切税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(float value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included discount amount (Base currency) 基準通貨仕切税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(double value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Discount tax amount (Base currency) 基準通貨仕切税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return base_cur_tax_amt_p().amt();
	}

	/**
	 * Discount tax amount (Base currency) 基準通貨仕切税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Discount tax amount (Base currency) 基準通貨仕切税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Discount tax amount (Base currency) 基準通貨仕切税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Discount tax amount (Base currency) 基準通貨仕切税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Discount tax amount (Base currency) 基準通貨仕切税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		base_cur_tax_amt_p().amt(value);
	}

	public String dlv_cd() {
		return dlv_p().bp_cd();
	}

	public void dlv_cd(String value) {
		dlv_p().bp_cd(value);
	}

	public String dlv_nm() {
		return dlv_p().bp_nm();
	}

	public void dlv_nm(String value) {
		dlv_p().bp_nm(value);
	}

	public boolean pri_prnt_flg() {
		return dlv_p().pri_prnt_flg();
	}

	public void pri_prnt_flg(boolean value) {
		dlv_p().pri_prnt_flg(value);
	}

	public String dlv_zip_cd() {
		return dlv_p().zip_cd();
	}

	public void dlv_zip_cd(String value) {
		dlv_p().zip_cd(value);
	}

	public String dlv_addr1() {
		return dlv_p().addr1();
	}

	public void dlv_addr1(String value) {
		dlv_p().addr1(value);
	}

	public String dlv_addr2() {
		return dlv_p().addr2();
	}

	public void dlv_addr2(String value) {
		dlv_p().addr2(value);
	}

	public String dlv_addr3() {
		return dlv_p().addr3();
	}

	public void dlv_addr3(String value) {
		dlv_p().addr3(value);
	}

	public String dlv_addr4() {
		return dlv_p().addr4();
	}

	public void dlv_addr4(String value) {
		dlv_p().addr4(value);
	}

	public String dlv_cntct_dpt() {
		return dlv_p().dlv_cntct_dpt();
	}

	public void dlv_cntct_dpt(String value) {
		dlv_p().dlv_cntct_dpt(value);
	}

	public String dlv_cntct_psn() {
		return dlv_p().dlv_cntct_psn();
	}

	public void dlv_cntct_psn(String value) {
		dlv_p().dlv_cntct_psn(value);
	}

	public String dlv_tel() {
		return dlv_p().tel();
	}

	public void dlv_tel(String value) {
		dlv_p().tel(value);
	}

	public String dlv_fax() {
		return dlv_p().fax();
	}

	public void dlv_fax(String value) {
		dlv_p().fax(value);
	}

	public boolean dlv_sundry_flg() {
		return dlv_p().dlv_sundry_flg();
	}

	public void dlv_sundry_flg(boolean value) {
		dlv_p().dlv_sundry_flg(value);
	}

	public String dlv_cntry_cd() {
		return dlv_p().cntry_cd();
	}

	public void dlv_cntry_cd(String value) {
		dlv_p().cntry_cd(value);
	}

	public String dlv_cntry_nm() {
		return dlv_p().cntry_nm();
	}

	public void dlv_cntry_nm(String value) {
		dlv_p().cntry_nm(value);
	}

	public String dlv_lg_grp_cd() {
		return dlv_p().lg_grp_cd();
	}

	public void dlv_lg_grp_cd(String value) {
		dlv_p().lg_grp_cd(value);
	}

	public String dlv_lg_grp_nm() {
		return dlv_p().lg_grp_nm();
	}

	public void dlv_lg_grp_nm(String value) {
		dlv_p().lg_grp_nm(value);
	}

	/**
	 * Copy qty. 引継数量.<p>
	 *
	 */
	public MCNumber trnst_qty() {
		return trnst_qty_p().qty();
	}

	/**
	 * Copy qty. 引継数量.<p>
	 *
	 */
	public void trnst_qty(MCNumber value) {
		trnst_qty_p().qty(value);
	}

	/**
	 * Copy qty. 引継数量.<p>
	 *
	 */
	public void trnst_qty(int value) {
		trnst_qty_p().qty(value);
	}

	/**
	 * Copy qty. 引継数量.<p>
	 *
	 */
	public void trnst_qty(long value) {
		trnst_qty_p().qty(value);
	}

	/**
	 * Copy qty. 引継数量.<p>
	 *
	 */
	public void trnst_qty(float value) {
		trnst_qty_p().qty(value);
	}

	/**
	 * Copy qty. 引継数量.<p>
	 *
	 */
	public void trnst_qty(double value) {
		trnst_qty_p().qty(value);
	}

	/**
	 * Standard sales unit price (Transaction currency) 取引通貨標準販売単価.<p>
	 *
	 */
	public MCNumber old_trd_cur_std_sls_upri() {
		return old_trd_cur_std_sls_upri_p().upri();
	}

	/**
	 * Standard sales unit price (Transaction currency) 取引通貨標準販売単価.<p>
	 *
	 */
	public void old_trd_cur_std_sls_upri(MCNumber value) {
		old_trd_cur_std_sls_upri_p().upri(value);
	}

	/**
	 * Standard sales unit price (Transaction currency) 取引通貨標準販売単価.<p>
	 *
	 */
	public void old_trd_cur_std_sls_upri(int value) {
		old_trd_cur_std_sls_upri_p().upri(value);
	}

	/**
	 * Standard sales unit price (Transaction currency) 取引通貨標準販売単価.<p>
	 *
	 */
	public void old_trd_cur_std_sls_upri(long value) {
		old_trd_cur_std_sls_upri_p().upri(value);
	}

	/**
	 * Standard sales unit price (Transaction currency) 取引通貨標準販売単価.<p>
	 *
	 */
	public void old_trd_cur_std_sls_upri(float value) {
		old_trd_cur_std_sls_upri_p().upri(value);
	}

	/**
	 * Standard sales unit price (Transaction currency) 取引通貨標準販売単価.<p>
	 *
	 */
	public void old_trd_cur_std_sls_upri(double value) {
		old_trd_cur_std_sls_upri_p().upri(value);
	}

}

