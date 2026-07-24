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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends mcframe.serverMSBD.MSBDL5170.DtlR {

	/**
	 * Return schedule unit cd. 返品予定単位ＣＤ.<p>
	 *
	 */
	public static final String $schd_trd_unit_cd = "schd_trd_unit_cd";
	/**
	 * Return schedule transaction unit conversion qty. 返品予定取引単位換算数量.<p>
	 *
	 */
	public static final String $schd_trd_unit_conv_qty = "schd_trd_unit_conv_qty";
	/**
	 * Return schedule transaction unit conversion base qty. 返品予定取引単位換算基準数量.<p>
	 *
	 */
	public static final String $schd_trd_unit_dmn_qty = "schd_trd_unit_dmn_qty";
	/**
	 * Return schedule transaction unit number of decimal places 返品予定取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $schd_trd_unit_dec_place = "schd_trd_unit_dec_place";
	/**
	 * Return schedule transaction unit rounding type 返品予定取引単位端数処理区分.<p>
	 *
	 */
	public static final String $schd_trd_unit_rnd_typ = "schd_trd_unit_rnd_typ";
	/**
	 * Return schedule transaction unit qty. 返品予定取引単位数量.<p>
	 *
	 */
	public static final String $schd_trd_unit_qty = "schd_trd_unit_qty";
	/**
	 * Return schedule base unit qty. 返品予定基準単位数量.<p>
	 *
	 */
	public static final String $schd_base_unit_qty = "schd_base_unit_qty";
	/**
	 * Return schedule unit price (Transaction currency) 返品予定取引通貨単価.<p>
	 *
	 */
	public static final String $schd_trd_cur_upri = "schd_trd_cur_upri";
	/**
	 * Return schedule subcontracting unit price (Transaction currency) 返品予定取引通貨加工単価.<p>
	 *
	 */
	public static final String $schd_trd_cur_proc_upri = "schd_trd_cur_proc_upri";
	/**
	 * Return schedule chargeable supply unit price (Transaction currency) 返品予定取引通貨有償支給単価.<p>
	 *
	 */
	public static final String $schd_trd_cur_onr_prov_upri = "schd_trd_cur_onr_prov_upri";
	/**
	 * Return schedule discount amount (Transaction currency) 返品予定取引通貨値引額.<p>
	 *
	 */
	public static final String $schd_trd_cur_dscnt_amt = "schd_trd_cur_dscnt_amt";
	/**
	 * Return schedule amount (Transaction currency) 返品予定取引通貨金額.<p>
	 *
	 */
	public static final String $schd_trd_cur_amt = "schd_trd_cur_amt";
	/**
	 * Return schedule subcontracting amount (Transaction currency) 返品予定取引通貨加工金額.<p>
	 *
	 */
	public static final String $schd_trd_cur_proc_amt = "schd_trd_cur_proc_amt";
	/**
	 * Return schedule chargeable supply amount (Transaction currency) 返品予定取引通貨有償支給金額.<p>
	 *
	 */
	public static final String $schd_trd_cur_onr_prov_amt = "schd_trd_cur_onr_prov_amt";
	/**
	 * Return schedule tax amount (Transaction currency) 返品予定取引通貨税額.<p>
	 *
	 */
	public static final String $schd_trd_cur_tax_amt = "schd_trd_cur_tax_amt";
	/**
	 * Purchase return-from location WG name 仕入返品元場所ＷＧ 名.<p>
	 *
	 */
	public static final String $purc_ret_loc_wg_nm = "purc_ret_loc_wg_nm";
	/**
	 * Return-from location name 返品元場所名.<p>
	 *
	 */
	public static final String $purc_ret_loc_nm = "purc_ret_loc_nm";
	/**
	 * Return-from supplier name 返品元発注先名.<p>
	 *
	 */
	public static final String $purc_ret_sppl_nm = "purc_ret_sppl_nm";
	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public static final String $loc_mng_typ = "loc_mng_typ";
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public static final String $str_ln_tgt_flg = "str_ln_tgt_flg";
	/**
	 * Without rack/line cd. 棚・ラインＣＤ無.<p>
	 *
	 */
	public static final String $str_ln_cd_none_flg = "str_ln_cd_none_flg";
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public static final String $itm_purc_upri_cng_flg = "itm_purc_upri_cng_flg";
	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public static final String $arr_skip_flg = "arr_skip_flg";
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
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
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 * Purchase type name 購買区分名.<p>
	 *
	 */
	public static final String $purc_typ_nm = "purc_typ_nm";
	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public static final String $purc_id_typ_nm = "purc_id_typ_nm";
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
	public static final String $trd_unit_dmn_qty = "trd_unit_dmn_qty";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	/**
	 * Transaction unit returned qty. 取引単位返品済数量.<p>
	 *
	 */
	public static final String $trd_ret_qty = "trd_ret_qty";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Remaining schedule qty. 予定残数.<p>
	 *
	 */
	public static final String $schd_qty = "schd_qty";
	/**
	 * Returned qty. 返品済数.<p>
	 *
	 */
	public static final String $ret_qty = "ret_qty";
	/**
	 * Cancelled remaining qty. 打切数.<p>
	 *
	 */
	public static final String $abort_qty = "abort_qty";
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
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public static final String $trd_cur_inc_tax_amt = "trd_cur_inc_tax_amt";
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public static final String $tax_fix_flg = "tax_fix_flg";
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 * Tax rate at schedule 予定時税率.<p>
	 *
	 */
	public static final String $schd_tax_rate = "schd_tax_rate";
	/**
	 * Tax inclusive at schedule flg. 予定時内税ＦＬＧ.<p>
	 *
	 */
	public static final String $schd_inc_tax_flg = "schd_inc_tax_flg";
	/**
	 * Tax cd. at result 実績時税ＣＤ.<p>
	 *
	 */
	public static final String $act_tax_cd = "act_tax_cd";
	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public static final String $base_cur_inc_tax_amt = "base_cur_inc_tax_amt";
	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public static final String $ptax_cur_inc_tax_amt = "ptax_cur_inc_tax_amt";
	/**
	 * Inspection 検査.<p>
	 *
	 */
	public static final String $insp_flg = "insp_flg";
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public static final String $quality_typ_nm = "quality_typ_nm";
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public static final String $stk_insp_typ_nm = "stk_insp_typ_nm";
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public static final String $stk_id_typ_nm = "stk_id_typ_nm";
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public static final String $stk_arrv_bp_nm = "stk_arrv_bp_nm";
	/**
	 * Return reason name 返品理由名.<p>
	 *
	 */
	public static final String $ret_rsn_nm = "ret_rsn_nm";
	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public static final String $dscnt_rsn_nm = "dscnt_rsn_nm";
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public static final String $ap_dpt_nm = "ap_dpt_nm";
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public static final String $bd_dpt_nm = "bd_dpt_nm";
	/**
	 * Charged WG name 負担ＷＧ名.<p>
	 *
	 */
	public static final String $bd_wg_nm = "bd_wg_nm";
	/**
	 * Charged item name 負担品名.<p>
	 *
	 */
	public static final String $bd_itm_nm = "bd_itm_nm";
	/**
	 * Charged location name 負担場所名.<p>
	 *
	 */
	public static final String $bd_loc_nm = "bd_loc_nm";
	/**
	 * Charged item group name 負担品群名.<p>
	 *
	 */
	public static final String $bd_ctg_nm = "bd_ctg_nm";
	/**
	 * Charged operation name 負担工程名.<p>
	 *
	 */
	public static final String $bd_oper_nm = "bd_oper_nm";
	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public static final String $bd_bp_cd = "bd_bp_cd";
	/**
	 * Charged BP name 負担取引先名.<p>
	 *
	 */
	public static final String $bd_bp_nm = "bd_bp_nm";
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public static final String $asset_mng_typ_nm = "asset_mng_typ_nm";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public static final String $purc_cont_fctr = "purc_cont_fctr";
	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public static final String $std_cont_qty = "std_cont_qty";
	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public static final String $std_cont_fctr = "std_cont_fctr";
	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public static final String $cont_fctr_unit_cd = "cont_fctr_unit_cd";
	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public static final String $cont_fctr_unit_nm = "cont_fctr_unit_nm";
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * Reference receipt result No. 参照入荷実績ＮＯ.<p>
	 *
	 */
	public static final String $ref_arr_act_no = "ref_arr_act_no";
	/**
	 * Reference receipt result rev. number 参照入荷実績改訂番号.<p>
	 *
	 */
	public static final String $ref_arr_act_rev = "ref_arr_act_rev";
	/**
	 * Base date (For unit price re-acquisition) 基準日（単価再取得用）.<p>
	 *
	 */
	public static final String $base_dt = "base_dt";


	public static final MCMeta schd_trd_unit_cd_META = createCommonMeta($schd_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta schd_trd_unit_conv_qty_META = createCommonMeta($schd_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_trd_unit_dmn_qty_META = createCommonMeta($schd_trd_unit_dmn_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_trd_unit_dec_place_META = createCommonMeta($schd_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta schd_trd_unit_rnd_typ_META = createCommonMeta($schd_trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta schd_trd_unit_qty_META = createCommonMeta($schd_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_base_unit_qty_META = createCommonMeta($schd_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_trd_cur_upri_META = createCommonMeta($schd_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_trd_cur_proc_upri_META = createCommonMeta($schd_trd_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_trd_cur_onr_prov_upri_META = createCommonMeta($schd_trd_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_trd_cur_dscnt_amt_META = createCommonMeta($schd_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_trd_cur_amt_META = createCommonMeta($schd_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_trd_cur_proc_amt_META = createCommonMeta($schd_trd_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_trd_cur_onr_prov_amt_META = createCommonMeta($schd_trd_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_trd_cur_tax_amt_META = createCommonMeta($schd_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_ret_loc_wg_nm_META = createCommonMeta($purc_ret_loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta purc_ret_loc_nm_META = createCommonMeta($purc_ret_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta purc_ret_sppl_nm_META = createCommonMeta($purc_ret_sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta loc_mng_typ_META = createCommonMeta($loc_mng_typ, mcframe.commonMA.meta.MA_META.LOC_MNG_TYP);
	public static final MCMeta str_ln_tgt_flg_META = createCommonMeta($str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln_cd_none_flg_META = createCommonMeta($str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta itm_purc_upri_cng_flg_META = createCommonMeta($itm_purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_skip_flg_META = createCommonMeta($arr_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta purc_typ_nm_META = createCommonMeta($purc_typ_nm, mcframe.commonMA.meta.MA_META.PURC_TYP_NM);
	public static final MCMeta purc_id_typ_nm_META = createCommonMeta($purc_id_typ_nm, mcframe.commonMA.meta.MA_META.PURC_ID_TYP_NM);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_unit_dmn_qty_META = createCommonMeta($trd_unit_dmn_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_ret_qty_META = createCommonMeta($trd_ret_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta schd_qty_META = createCommonMeta($schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ret_qty_META = createCommonMeta($ret_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta abort_qty_META = createCommonMeta($abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_upri_typ_META = createCommonMeta($outsrc_upri_typ, mcframe.commonMA.meta.MA_META.OUTSRC_UPRI_TYP);
	public static final MCMeta trd_cur_inc_tax_amt_META = createCommonMeta($trd_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_fix_flg_META = createCommonMeta($tax_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_tax_rate_META = createCommonMeta($schd_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta schd_inc_tax_flg_META = createCommonMeta($schd_inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_tax_cd_META = createCommonMeta($act_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta base_cur_inc_tax_amt_META = createCommonMeta($base_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_inc_tax_amt_META = createCommonMeta($ptax_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta insp_flg_META = createCommonMeta($insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ret_rsn_nm_META = createCommonMeta($ret_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta dscnt_rsn_nm_META = createCommonMeta($dscnt_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta bd_wg_nm_META = createCommonMeta($bd_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bd_itm_nm_META = createCommonMeta($bd_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta bd_loc_nm_META = createCommonMeta($bd_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta bd_ctg_nm_META = createCommonMeta($bd_ctg_nm, mcframe.commonMA.meta.MA_META.COST_CTG_NM);
	public static final MCMeta bd_oper_nm_META = createCommonMeta($bd_oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta bd_bp_cd_META = createCommonMeta($bd_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bd_bp_nm_META = createCommonMeta($bd_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta asset_mng_typ_nm_META = createCommonMeta($asset_mng_typ_nm, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP_NM);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cont_fctr_META = createCommonMeta($purc_cont_fctr, mcframe.commonMA.meta.MA_META.PURC_CONT_FCTR);
	public static final MCMeta std_cont_qty_META = createCommonMeta($std_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta cont_fctr_unit_nm_META = createCommonMeta($cont_fctr_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ref_arr_act_no_META = createCommonMeta($ref_arr_act_no, mcframe.commonMA.meta.MA_META.ARR_ACT_NO);
	public static final MCMeta ref_arr_act_rev_META = createCommonMeta($ref_arr_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta base_dt_META = createCommonMeta($base_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		mcframe.serverMSBD.MSBDL5170.DtlR.constMetas,
		new MCMeta[]{
			schd_trd_unit_cd_META,
			schd_trd_unit_conv_qty_META,
			schd_trd_unit_dmn_qty_META,
			schd_trd_unit_dec_place_META,
			schd_trd_unit_rnd_typ_META,
			schd_trd_unit_qty_META,
			schd_base_unit_qty_META,
			schd_trd_cur_upri_META,
			schd_trd_cur_proc_upri_META,
			schd_trd_cur_onr_prov_upri_META,
			schd_trd_cur_dscnt_amt_META,
			schd_trd_cur_amt_META,
			schd_trd_cur_proc_amt_META,
			schd_trd_cur_onr_prov_amt_META,
			schd_trd_cur_tax_amt_META,
			purc_ret_loc_wg_nm_META,
			purc_ret_loc_nm_META,
			purc_ret_sppl_nm_META,
			loc_mng_typ_META,
			str_ln_tgt_flg_META,
			str_ln_cd_none_flg_META,
			str_ln_nm_META,
			maker_nm_META,
			itm_purc_upri_cng_flg_META,
			dscnt_itm_flg_META,
			arr_skip_flg_META,
			ver_flg_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			wrk_no_META,
			wrk_nm_META,
			purc_typ_nm_META,
			purc_id_typ_nm_META,
			trd_unit_nm_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			trd_unit_dmn_qty_META,
			trd_unit_conv_qty_META,
			trd_ret_qty_META,
			base_unit_nm_META,
			base_unit_rnd_typ_META,
			base_unit_dec_place_META,
			schd_qty_META,
			ret_qty_META,
			abort_qty_META,
			repurc_obli_flg_META,
			outsrc_upri_typ_META,
			trd_cur_inc_tax_amt_META,
			tax_nm_META,
			tax_fix_flg_META,
			inc_tax_flg_META,
			schd_tax_rate_META,
			schd_inc_tax_flg_META,
			act_tax_cd_META,
			base_cur_inc_tax_amt_META,
			ptax_cur_inc_tax_amt_META,
			insp_flg_META,
			quality_typ_nm_META,
			stk_insp_typ_nm_META,
			stk_id_typ_nm_META,
			gd_nm_META,
			stk_arrv_bp_nm_META,
			ret_rsn_nm_META,
			dscnt_rsn_nm_META,
			ap_dpt_nm_META,
			bd_dpt_nm_META,
			bd_wg_nm_META,
			bd_itm_nm_META,
			bd_loc_nm_META,
			bd_ctg_nm_META,
			bd_oper_nm_META,
			bd_bp_cd_META,
			bd_bp_nm_META,
			asset_mng_typ_nm_META,
			cont_fctr_flg_META,
			purc_cont_fctr_META,
			std_cont_qty_META,
			std_cont_fctr_META,
			cont_fctr_unit_cd_META,
			cont_fctr_unit_nm_META,
			cont_fctr_rnd_typ_META,
			cont_fctr_dec_place_META,
			ref_arr_act_no_META,
			ref_arr_act_rev_META,
			base_dt_META,
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
		mcframe.serverMSBD.MSBDL5170.DtlR.EXTMAP,
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$maker_cd, "E"},	// maker_cd
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$lot_no, "E"},	// lot_no
				{$sublot_no, "E"},	// sublot_no
				{$sno1, "E"},	// sno1
				{$sno2, "E"},	// sno2
				{$sno3, "E"},	// sno3
				{$sno4, "E"},	// sno4
				{$stk_arrv_bp_cd, "E"}	// stk_arrv_bp_cd
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$peg_no, "E"},	// peg_no
				{$itm_cd, "E"},	// itm_cd
				{$purc_typ, "E"},	// purc_typ
				{$purc_id_typ, "E"},	// purc_id_typ
				{$trd_unit_cd, "E"},	// trd_unit_cd
				{$trd_unit_qty, "E"},	// trd_unit_qty
				{$ret_rsn_cd, "E"},	// ret_rsn_cd
				{$base_purc_ac_dt, "E"}	// base_purc_ac_dt
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$purc_ret_loc_cd, "MA.MAUAL0010.Loc"},	// purc_ret_loc_cd
				{$str_ln_cd, "MA.MAUAL0010.StrLn"},	// str_ln_cd
				{$maker_cd, "MA.MAUAL0010.Bp"},	// maker_cd
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$trd_unit_cd, "MA.MAUAL0010.ItmUnit"},	// trd_unit_cd
				{$base_unit_cd, "MA.MAUAL0010.ItmUnit"},	// base_unit_cd
				{$tax_cd, "MA.MAUAL0010.PurcTax"},	// tax_cd
				{$mfg_inst_no, "MS.MSUAL0040.MfgInstNo"},	// mfg_inst_no
				{$gd_cd, "MA.MAUAL0010.StkGd"},	// gd_cd
				{$stk_arrv_bp_cd, "MA.MAUAL0010.Bp"},	// stk_arrv_bp_cd
				{$ret_rsn_cd, "MA.MAUAL0010.PurcRtnBizRsn"},	// ret_rsn_cd
				{$ap_dpt_cd, "MA.MAUAL0010.Dpt"},	// ap_dpt_cd
				{$bd_dpt_cd, "MA.MAUAL0010.Dpt"},	// bd_dpt_cd
				{$bd_itm_sub3, "MA.MAUAL0010.ItmSub3"},	// bd_itm_sub3
				{$bd_loc_cd, "MA.MAUAL0010.Loc"},	// bd_loc_cd
				{$bd_ctg_cd, "MA.MAUAL0010.CostCtg"},	// bd_ctg_cd
				{$bd_oper_cd, "MA.MAUAL0010.Oper"}	// bd_oper_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$purc_ret_loc_cd, "purc_ret_sppl_cd;purc_ret_loc_wg_cd"},	// purc_ret_loc_cd
				{$itm_sub3, "lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;sundry_itm_flg;itm_purc_upri_cng_flg;dscnt_itm_flg;arr_skip_flg;ver_flg;lot_mng_typ;sublot_mng_typ;stk_mng_typ;base_unit_cd;base_unit_nm;base_unit_dec_place;base_unit_rnd_typ;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_rnd_typ;cont_fctr_dec_place;asset_mng_typ"},	// itm_sub3
				{$trd_unit_cd, "trd_unit_dec_place;trd_unit_rnd_typ;trd_unit_dmn_qty;trd_unit_conv_qty"},	// trd_unit_cd
				{$base_unit_cd, "base_unit_dec_place;base_unit_rnd_typ"},	// base_unit_cd
				{$tax_cd, "tax_rate;inc_tax_flg"},	// tax_cd
				{$stk_arrv_bp_cd, "stk_arrv_bp_nm"},	// stk_arrv_bp_cd
				{$ret_rsn_cd, "xpns_purc_flg"},	// ret_rsn_cd
				{$ap_dpt_cd, "ap_dpt_nm"},	// ap_dpt_cd
				{$bd_dpt_cd, "bd_wg_cd;bd_dpt_nm"},	// bd_dpt_cd
				{$bd_itm_sub3, "bd_itm_nm;bd_lot_mng_typ;bd_lot_no_typ;bd_sublot_mng_typ;bd_sublot_no_typ;bd_sno1_mng_typ;bd_sno2_mng_typ;bd_sno3_mng_typ;bd_sno4_mng_typ"}	// bd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$purc_ret_loc_cd, "sppl_cd;wg_cd"},	// purc_ret_loc_cd
				{$itm_sub3, "lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;sundry_itm_flg;purc_upri_cng_flg;dscnt_itm_flg;arr_skip_flg;ver_flg;lot_mng_typ;sublot_mng_typ;stk_mng_typ;unit_cd;unit_nm;dec_place;rnd_typ;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_rnd_typ;cont_fctr_dec_place;asset_mng_typ"},	// itm_sub3
				{$trd_unit_cd, "dec_place;rnd_typ;conv_base_qty;conv_qty"},	// trd_unit_cd
				{$base_unit_cd, "dec_place;rnd_typ"},	// base_unit_cd
				{$stk_arrv_bp_cd, "bp_nm"},	// stk_arrv_bp_cd
				{$ap_dpt_cd, "dpt_nm"},	// ap_dpt_cd
				{$bd_dpt_cd, "wg_cd;dpt_nm"},	// bd_dpt_cd
				{$bd_itm_sub3, "itm_nm;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"}	// bd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$str_ln_cd, "purc_ret_loc_cd;true"},	// str_ln_cd
				{$maker_cd, "MAC_BP_IS_SRCH_TYP.MAKER;true"},	// maker_cd
				{$itm_sub3, "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"},	// itm_sub3
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$base_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// base_unit_cd
				{$mfg_inst_no, "MSC_MFG_MTD_TYP.EXTNL;false;false;true;true"},	// mfg_inst_no
				{$stk_arrv_bp_cd, "true"},	// stk_arrv_bp_cd
				{$ap_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP"},	// ap_dpt_cd
				{$bd_dpt_cd, "MAC_DPT_IS_SRCH_TYP.BD"},	// bd_dpt_cd
				{$bd_itm_sub3, "MAC_ITM_IS_SRCH_TYP.ASSET1;bd_itm_cd;bd_itm_sub1;bd_itm_sub2"}	// bd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$str_ln_cd, "loc_cd;mode_nullval_flg"},	// str_ln_cd
				{$maker_cd, "bp_is_srch_typ;mode_nullval_flg"},	// maker_cd
				{$itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_sub3
				{$mfg_inst_no, "imi_mfg_mtd_typ;sav_flg;ord_flg;stt_flg;cmpl_flg"},	// mfg_inst_no
				{$stk_arrv_bp_cd, "mode_nullval_flg"},	// stk_arrv_bp_cd
				{$ap_dpt_cd, "dpt_is_srch_typ"},	// ap_dpt_cd
				{$bd_dpt_cd, "dpt_is_srch_typ"},	// bd_dpt_cd
				{$bd_itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// bd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$purc_typ, "MAC_PURC_TYP"},	// purc_typ
				{$purc_id_typ, "MAC_PURC_ID_TYP"},	// purc_id_typ
				{$quality_typ, "MAC_QUALITY_TYP"},	// quality_typ
				{$stk_insp_typ, "MSC_STK_INSP_TYP"},	// stk_insp_typ
				{$stk_id_typ, "MSC_STK_ID_TYP"}	// stk_id_typ
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
				{$base_purc_ac_dt, "bfToday"},	// base_purc_ac_dt
				{$base_ac_dt, "bfToday"}	// base_ac_dt
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$purc_cont_qty, "positive"}	// purc_cont_qty
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$trd_unit_qty, "0:"},	// trd_unit_qty
				{$trd_cur_proc_amt, "0:"},	// trd_cur_proc_amt
				{$trd_cur_onr_prov_amt, "0:"},	// trd_cur_onr_prov_amt
				{$trd_cur_proc_upri, "0:"},	// trd_cur_proc_upri
				{$trd_cur_onr_prov_upri, "0:"},	// trd_cur_onr_prov_upri
				{$trd_cur_upri, "0:"},	// trd_cur_upri
				{$trd_cur_amt, "0:"},	// trd_cur_amt
				{$trd_cur_dscnt_amt, "0:"},	// trd_cur_dscnt_amt
				{$trd_cur_tax_amt, "0:"},	// trd_cur_tax_amt
				{$trd_cur_inc_tax_amt, "0:"},	// trd_cur_inc_tax_amt
				{$base_cur_proc_amt, "0:"},	// base_cur_proc_amt
				{$base_cur_onr_prov_amt, "0:"},	// base_cur_onr_prov_amt
				{$base_cur_proc_upri, "0:"},	// base_cur_proc_upri
				{$base_cur_onr_prov_upri, "0:"},	// base_cur_onr_prov_upri
				{$base_cur_upri, "0:"},	// base_cur_upri
				{$base_cur_amt, "0:"},	// base_cur_amt
				{$base_cur_dscnt_amt, "0:"},	// base_cur_dscnt_amt
				{$base_cur_tax_amt, "0:"},	// base_cur_tax_amt
				{$base_cur_inc_tax_amt, "0:"},	// base_cur_inc_tax_amt
				{$ptax_cur_proc_amt, "0:"},	// ptax_cur_proc_amt
				{$ptax_cur_onr_prov_amt, "0:"},	// ptax_cur_onr_prov_amt
				{$ptax_cur_proc_upri, "0:"},	// ptax_cur_proc_upri
				{$ptax_cur_onr_prov_upri, "0:"},	// ptax_cur_onr_prov_upri
				{$ptax_cur_upri, "0:"},	// ptax_cur_upri
				{$ptax_cur_amt, "0:"},	// ptax_cur_amt
				{$ptax_cur_dscnt_amt, "0:"},	// ptax_cur_dscnt_amt
				{$ptax_cur_tax_amt, "0:"},	// ptax_cur_tax_amt
				{$ptax_cur_inc_tax_amt, "0:"},	// ptax_cur_inc_tax_amt
				{$wtax_amt, "0:"}	// wtax_amt
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

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Return schedule unit cd. 返品予定単位ＣＤ.<p>
	 *
	 */
	public String schd_trd_unit_cd() {
		return getConstString(offset + 0, $schd_trd_unit_cd);
	}

	/**
	 * Return schedule unit cd. 返品予定単位ＣＤ.<p>
	 *
	 */
	public void schd_trd_unit_cd(String value) {
		setConstString(offset + 0, $schd_trd_unit_cd, value);
	}


	/**
	 * Return schedule transaction unit conversion qty. 返品予定取引単位換算数量.<p>
	 *
	 */
	public MCNumber schd_trd_unit_conv_qty() {
		return getConstNumber(offset + 1, $schd_trd_unit_conv_qty);
	}

	/**
	 * Return schedule transaction unit conversion qty. 返品予定取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 1, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Return schedule transaction unit conversion qty. 返品予定取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 1, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Return schedule transaction unit conversion qty. 返品予定取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 1, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Return schedule transaction unit conversion qty. 返品予定取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 1, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Return schedule transaction unit conversion qty. 返品予定取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 1, $schd_trd_unit_conv_qty, value);
	}


	/**
	 * Return schedule transaction unit conversion base qty. 返品予定取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber schd_trd_unit_dmn_qty() {
		return getConstNumber(offset + 2, $schd_trd_unit_dmn_qty);
	}

	/**
	 * Return schedule transaction unit conversion base qty. 返品予定取引単位換算基準数量.<p>
	 *
	 */
	public void schd_trd_unit_dmn_qty(MCNumber value) {
		setConstNumber(offset + 2, $schd_trd_unit_dmn_qty, value);
	}

	/**
	 * Return schedule transaction unit conversion base qty. 返品予定取引単位換算基準数量.<p>
	 *
	 */
	public void schd_trd_unit_dmn_qty(int value) {
		setConstNumber(offset + 2, $schd_trd_unit_dmn_qty, value);
	}

	/**
	 * Return schedule transaction unit conversion base qty. 返品予定取引単位換算基準数量.<p>
	 *
	 */
	public void schd_trd_unit_dmn_qty(long value) {
		setConstNumber(offset + 2, $schd_trd_unit_dmn_qty, value);
	}

	/**
	 * Return schedule transaction unit conversion base qty. 返品予定取引単位換算基準数量.<p>
	 *
	 */
	public void schd_trd_unit_dmn_qty(float value) {
		setConstNumber(offset + 2, $schd_trd_unit_dmn_qty, value);
	}

	/**
	 * Return schedule transaction unit conversion base qty. 返品予定取引単位換算基準数量.<p>
	 *
	 */
	public void schd_trd_unit_dmn_qty(double value) {
		setConstNumber(offset + 2, $schd_trd_unit_dmn_qty, value);
	}


	/**
	 * Return schedule transaction unit number of decimal places 返品予定取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber schd_trd_unit_dec_place() {
		return getConstNumber(offset + 3, $schd_trd_unit_dec_place);
	}

	/**
	 * Return schedule transaction unit number of decimal places 返品予定取引単位小数部有効桁数.<p>
	 *
	 */
	public void schd_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 3, $schd_trd_unit_dec_place, value);
	}

	/**
	 * Return schedule transaction unit number of decimal places 返品予定取引単位小数部有効桁数.<p>
	 *
	 */
	public void schd_trd_unit_dec_place(int value) {
		setConstNumber(offset + 3, $schd_trd_unit_dec_place, value);
	}

	/**
	 * Return schedule transaction unit number of decimal places 返品予定取引単位小数部有効桁数.<p>
	 *
	 */
	public void schd_trd_unit_dec_place(long value) {
		setConstNumber(offset + 3, $schd_trd_unit_dec_place, value);
	}

	/**
	 * Return schedule transaction unit number of decimal places 返品予定取引単位小数部有効桁数.<p>
	 *
	 */
	public void schd_trd_unit_dec_place(float value) {
		setConstNumber(offset + 3, $schd_trd_unit_dec_place, value);
	}

	/**
	 * Return schedule transaction unit number of decimal places 返品予定取引単位小数部有効桁数.<p>
	 *
	 */
	public void schd_trd_unit_dec_place(double value) {
		setConstNumber(offset + 3, $schd_trd_unit_dec_place, value);
	}


	/**
	 * Return schedule transaction unit rounding type 返品予定取引単位端数処理区分.<p>
	 *
	 */
	public String schd_trd_unit_rnd_typ() {
		return getConstString(offset + 4, $schd_trd_unit_rnd_typ);
	}

	/**
	 * Return schedule transaction unit rounding type 返品予定取引単位端数処理区分.<p>
	 *
	 */
	public void schd_trd_unit_rnd_typ(String value) {
		setConstString(offset + 4, $schd_trd_unit_rnd_typ, value);
	}


	/**
	 * Return schedule transaction unit qty. 返品予定取引単位数量.<p>
	 *
	 */
	public MCNumber schd_trd_unit_qty() {
		return getConstNumber(offset + 5, $schd_trd_unit_qty);
	}

	/**
	 * Return schedule transaction unit qty. 返品予定取引単位数量.<p>
	 *
	 */
	public void schd_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 5, $schd_trd_unit_qty, value);
	}

	/**
	 * Return schedule transaction unit qty. 返品予定取引単位数量.<p>
	 *
	 */
	public void schd_trd_unit_qty(int value) {
		setConstNumber(offset + 5, $schd_trd_unit_qty, value);
	}

	/**
	 * Return schedule transaction unit qty. 返品予定取引単位数量.<p>
	 *
	 */
	public void schd_trd_unit_qty(long value) {
		setConstNumber(offset + 5, $schd_trd_unit_qty, value);
	}

	/**
	 * Return schedule transaction unit qty. 返品予定取引単位数量.<p>
	 *
	 */
	public void schd_trd_unit_qty(float value) {
		setConstNumber(offset + 5, $schd_trd_unit_qty, value);
	}

	/**
	 * Return schedule transaction unit qty. 返品予定取引単位数量.<p>
	 *
	 */
	public void schd_trd_unit_qty(double value) {
		setConstNumber(offset + 5, $schd_trd_unit_qty, value);
	}


	/**
	 * Return schedule base unit qty. 返品予定基準単位数量.<p>
	 *
	 */
	public MCNumber schd_base_unit_qty() {
		return getConstNumber(offset + 6, $schd_base_unit_qty);
	}

	/**
	 * Return schedule base unit qty. 返品予定基準単位数量.<p>
	 *
	 */
	public void schd_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 6, $schd_base_unit_qty, value);
	}

	/**
	 * Return schedule base unit qty. 返品予定基準単位数量.<p>
	 *
	 */
	public void schd_base_unit_qty(int value) {
		setConstNumber(offset + 6, $schd_base_unit_qty, value);
	}

	/**
	 * Return schedule base unit qty. 返品予定基準単位数量.<p>
	 *
	 */
	public void schd_base_unit_qty(long value) {
		setConstNumber(offset + 6, $schd_base_unit_qty, value);
	}

	/**
	 * Return schedule base unit qty. 返品予定基準単位数量.<p>
	 *
	 */
	public void schd_base_unit_qty(float value) {
		setConstNumber(offset + 6, $schd_base_unit_qty, value);
	}

	/**
	 * Return schedule base unit qty. 返品予定基準単位数量.<p>
	 *
	 */
	public void schd_base_unit_qty(double value) {
		setConstNumber(offset + 6, $schd_base_unit_qty, value);
	}


	/**
	 * Return schedule unit price (Transaction currency) 返品予定取引通貨単価.<p>
	 *
	 */
	public MCNumber schd_trd_cur_upri() {
		return getConstNumber(offset + 7, $schd_trd_cur_upri);
	}

	/**
	 * Return schedule unit price (Transaction currency) 返品予定取引通貨単価.<p>
	 *
	 */
	public void schd_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 7, $schd_trd_cur_upri, value);
	}

	/**
	 * Return schedule unit price (Transaction currency) 返品予定取引通貨単価.<p>
	 *
	 */
	public void schd_trd_cur_upri(int value) {
		setConstNumber(offset + 7, $schd_trd_cur_upri, value);
	}

	/**
	 * Return schedule unit price (Transaction currency) 返品予定取引通貨単価.<p>
	 *
	 */
	public void schd_trd_cur_upri(long value) {
		setConstNumber(offset + 7, $schd_trd_cur_upri, value);
	}

	/**
	 * Return schedule unit price (Transaction currency) 返品予定取引通貨単価.<p>
	 *
	 */
	public void schd_trd_cur_upri(float value) {
		setConstNumber(offset + 7, $schd_trd_cur_upri, value);
	}

	/**
	 * Return schedule unit price (Transaction currency) 返品予定取引通貨単価.<p>
	 *
	 */
	public void schd_trd_cur_upri(double value) {
		setConstNumber(offset + 7, $schd_trd_cur_upri, value);
	}


	/**
	 * Return schedule subcontracting unit price (Transaction currency) 返品予定取引通貨加工単価.<p>
	 *
	 */
	public MCNumber schd_trd_cur_proc_upri() {
		return getConstNumber(offset + 8, $schd_trd_cur_proc_upri);
	}

	/**
	 * Return schedule subcontracting unit price (Transaction currency) 返品予定取引通貨加工単価.<p>
	 *
	 */
	public void schd_trd_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 8, $schd_trd_cur_proc_upri, value);
	}

	/**
	 * Return schedule subcontracting unit price (Transaction currency) 返品予定取引通貨加工単価.<p>
	 *
	 */
	public void schd_trd_cur_proc_upri(int value) {
		setConstNumber(offset + 8, $schd_trd_cur_proc_upri, value);
	}

	/**
	 * Return schedule subcontracting unit price (Transaction currency) 返品予定取引通貨加工単価.<p>
	 *
	 */
	public void schd_trd_cur_proc_upri(long value) {
		setConstNumber(offset + 8, $schd_trd_cur_proc_upri, value);
	}

	/**
	 * Return schedule subcontracting unit price (Transaction currency) 返品予定取引通貨加工単価.<p>
	 *
	 */
	public void schd_trd_cur_proc_upri(float value) {
		setConstNumber(offset + 8, $schd_trd_cur_proc_upri, value);
	}

	/**
	 * Return schedule subcontracting unit price (Transaction currency) 返品予定取引通貨加工単価.<p>
	 *
	 */
	public void schd_trd_cur_proc_upri(double value) {
		setConstNumber(offset + 8, $schd_trd_cur_proc_upri, value);
	}


	/**
	 * Return schedule chargeable supply unit price (Transaction currency) 返品予定取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber schd_trd_cur_onr_prov_upri() {
		return getConstNumber(offset + 9, $schd_trd_cur_onr_prov_upri);
	}

	/**
	 * Return schedule chargeable supply unit price (Transaction currency) 返品予定取引通貨有償支給単価.<p>
	 *
	 */
	public void schd_trd_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 9, $schd_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Return schedule chargeable supply unit price (Transaction currency) 返品予定取引通貨有償支給単価.<p>
	 *
	 */
	public void schd_trd_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 9, $schd_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Return schedule chargeable supply unit price (Transaction currency) 返品予定取引通貨有償支給単価.<p>
	 *
	 */
	public void schd_trd_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 9, $schd_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Return schedule chargeable supply unit price (Transaction currency) 返品予定取引通貨有償支給単価.<p>
	 *
	 */
	public void schd_trd_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 9, $schd_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Return schedule chargeable supply unit price (Transaction currency) 返品予定取引通貨有償支給単価.<p>
	 *
	 */
	public void schd_trd_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 9, $schd_trd_cur_onr_prov_upri, value);
	}


	/**
	 * Return schedule discount amount (Transaction currency) 返品予定取引通貨値引額.<p>
	 *
	 */
	public MCNumber schd_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 10, $schd_trd_cur_dscnt_amt);
	}

	/**
	 * Return schedule discount amount (Transaction currency) 返品予定取引通貨値引額.<p>
	 *
	 */
	public void schd_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 10, $schd_trd_cur_dscnt_amt, value);
	}

	/**
	 * Return schedule discount amount (Transaction currency) 返品予定取引通貨値引額.<p>
	 *
	 */
	public void schd_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 10, $schd_trd_cur_dscnt_amt, value);
	}

	/**
	 * Return schedule discount amount (Transaction currency) 返品予定取引通貨値引額.<p>
	 *
	 */
	public void schd_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 10, $schd_trd_cur_dscnt_amt, value);
	}

	/**
	 * Return schedule discount amount (Transaction currency) 返品予定取引通貨値引額.<p>
	 *
	 */
	public void schd_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 10, $schd_trd_cur_dscnt_amt, value);
	}

	/**
	 * Return schedule discount amount (Transaction currency) 返品予定取引通貨値引額.<p>
	 *
	 */
	public void schd_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 10, $schd_trd_cur_dscnt_amt, value);
	}


	/**
	 * Return schedule amount (Transaction currency) 返品予定取引通貨金額.<p>
	 *
	 */
	public MCNumber schd_trd_cur_amt() {
		return getConstNumber(offset + 11, $schd_trd_cur_amt);
	}

	/**
	 * Return schedule amount (Transaction currency) 返品予定取引通貨金額.<p>
	 *
	 */
	public void schd_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 11, $schd_trd_cur_amt, value);
	}

	/**
	 * Return schedule amount (Transaction currency) 返品予定取引通貨金額.<p>
	 *
	 */
	public void schd_trd_cur_amt(int value) {
		setConstNumber(offset + 11, $schd_trd_cur_amt, value);
	}

	/**
	 * Return schedule amount (Transaction currency) 返品予定取引通貨金額.<p>
	 *
	 */
	public void schd_trd_cur_amt(long value) {
		setConstNumber(offset + 11, $schd_trd_cur_amt, value);
	}

	/**
	 * Return schedule amount (Transaction currency) 返品予定取引通貨金額.<p>
	 *
	 */
	public void schd_trd_cur_amt(float value) {
		setConstNumber(offset + 11, $schd_trd_cur_amt, value);
	}

	/**
	 * Return schedule amount (Transaction currency) 返品予定取引通貨金額.<p>
	 *
	 */
	public void schd_trd_cur_amt(double value) {
		setConstNumber(offset + 11, $schd_trd_cur_amt, value);
	}


	/**
	 * Return schedule subcontracting amount (Transaction currency) 返品予定取引通貨加工金額.<p>
	 *
	 */
	public MCNumber schd_trd_cur_proc_amt() {
		return getConstNumber(offset + 12, $schd_trd_cur_proc_amt);
	}

	/**
	 * Return schedule subcontracting amount (Transaction currency) 返品予定取引通貨加工金額.<p>
	 *
	 */
	public void schd_trd_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 12, $schd_trd_cur_proc_amt, value);
	}

	/**
	 * Return schedule subcontracting amount (Transaction currency) 返品予定取引通貨加工金額.<p>
	 *
	 */
	public void schd_trd_cur_proc_amt(int value) {
		setConstNumber(offset + 12, $schd_trd_cur_proc_amt, value);
	}

	/**
	 * Return schedule subcontracting amount (Transaction currency) 返品予定取引通貨加工金額.<p>
	 *
	 */
	public void schd_trd_cur_proc_amt(long value) {
		setConstNumber(offset + 12, $schd_trd_cur_proc_amt, value);
	}

	/**
	 * Return schedule subcontracting amount (Transaction currency) 返品予定取引通貨加工金額.<p>
	 *
	 */
	public void schd_trd_cur_proc_amt(float value) {
		setConstNumber(offset + 12, $schd_trd_cur_proc_amt, value);
	}

	/**
	 * Return schedule subcontracting amount (Transaction currency) 返品予定取引通貨加工金額.<p>
	 *
	 */
	public void schd_trd_cur_proc_amt(double value) {
		setConstNumber(offset + 12, $schd_trd_cur_proc_amt, value);
	}


	/**
	 * Return schedule chargeable supply amount (Transaction currency) 返品予定取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber schd_trd_cur_onr_prov_amt() {
		return getConstNumber(offset + 13, $schd_trd_cur_onr_prov_amt);
	}

	/**
	 * Return schedule chargeable supply amount (Transaction currency) 返品予定取引通貨有償支給金額.<p>
	 *
	 */
	public void schd_trd_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 13, $schd_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Return schedule chargeable supply amount (Transaction currency) 返品予定取引通貨有償支給金額.<p>
	 *
	 */
	public void schd_trd_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 13, $schd_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Return schedule chargeable supply amount (Transaction currency) 返品予定取引通貨有償支給金額.<p>
	 *
	 */
	public void schd_trd_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 13, $schd_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Return schedule chargeable supply amount (Transaction currency) 返品予定取引通貨有償支給金額.<p>
	 *
	 */
	public void schd_trd_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 13, $schd_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Return schedule chargeable supply amount (Transaction currency) 返品予定取引通貨有償支給金額.<p>
	 *
	 */
	public void schd_trd_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 13, $schd_trd_cur_onr_prov_amt, value);
	}


	/**
	 * Return schedule tax amount (Transaction currency) 返品予定取引通貨税額.<p>
	 *
	 */
	public MCNumber schd_trd_cur_tax_amt() {
		return getConstNumber(offset + 14, $schd_trd_cur_tax_amt);
	}

	/**
	 * Return schedule tax amount (Transaction currency) 返品予定取引通貨税額.<p>
	 *
	 */
	public void schd_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 14, $schd_trd_cur_tax_amt, value);
	}

	/**
	 * Return schedule tax amount (Transaction currency) 返品予定取引通貨税額.<p>
	 *
	 */
	public void schd_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 14, $schd_trd_cur_tax_amt, value);
	}

	/**
	 * Return schedule tax amount (Transaction currency) 返品予定取引通貨税額.<p>
	 *
	 */
	public void schd_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 14, $schd_trd_cur_tax_amt, value);
	}

	/**
	 * Return schedule tax amount (Transaction currency) 返品予定取引通貨税額.<p>
	 *
	 */
	public void schd_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 14, $schd_trd_cur_tax_amt, value);
	}

	/**
	 * Return schedule tax amount (Transaction currency) 返品予定取引通貨税額.<p>
	 *
	 */
	public void schd_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 14, $schd_trd_cur_tax_amt, value);
	}


	/**
	 * Purchase return-from location WG name 仕入返品元場所ＷＧ 名.<p>
	 *
	 */
	public String purc_ret_loc_wg_nm() {
		return getConstString(offset + 15, $purc_ret_loc_wg_nm);
	}

	/**
	 * Purchase return-from location WG name 仕入返品元場所ＷＧ 名.<p>
	 *
	 */
	public void purc_ret_loc_wg_nm(String value) {
		setConstString(offset + 15, $purc_ret_loc_wg_nm, value);
	}


	/**
	 * Return-from location name 返品元場所名.<p>
	 *
	 */
	public String purc_ret_loc_nm() {
		return getConstString(offset + 16, $purc_ret_loc_nm);
	}

	/**
	 * Return-from location name 返品元場所名.<p>
	 *
	 */
	public void purc_ret_loc_nm(String value) {
		setConstString(offset + 16, $purc_ret_loc_nm, value);
	}


	/**
	 * Return-from supplier name 返品元発注先名.<p>
	 *
	 */
	public String purc_ret_sppl_nm() {
		return getConstString(offset + 17, $purc_ret_sppl_nm);
	}

	/**
	 * Return-from supplier name 返品元発注先名.<p>
	 *
	 */
	public void purc_ret_sppl_nm(String value) {
		setConstString(offset + 17, $purc_ret_sppl_nm, value);
	}


	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public String loc_mng_typ() {
		return getConstString(offset + 18, $loc_mng_typ);
	}

	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public void loc_mng_typ(String value) {
		setConstString(offset + 18, $loc_mng_typ, value);
	}


	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public boolean str_ln_tgt_flg() {
		return getConstBoolean(offset + 19, $str_ln_tgt_flg);
	}

	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public void str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 19, $str_ln_tgt_flg, value);
	}


	/**
	 * Without rack/line cd. 棚・ラインＣＤ無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 20, $str_ln_cd_none_flg);
	}

	/**
	 * Without rack/line cd. 棚・ラインＣＤ無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 20, $str_ln_cd_none_flg, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 21, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 21, $str_ln_nm, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 22, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 22, $maker_nm, value);
	}


	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public boolean itm_purc_upri_cng_flg() {
		return getConstBoolean(offset + 23, $itm_purc_upri_cng_flg);
	}

	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public void itm_purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 23, $itm_purc_upri_cng_flg, value);
	}


	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 24, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 24, $dscnt_itm_flg, value);
	}


	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public boolean arr_skip_flg() {
		return getConstBoolean(offset + 25, $arr_skip_flg);
	}

	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public void arr_skip_flg(boolean value) {
		setConstBoolean(offset + 25, $arr_skip_flg, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 26, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 26, $ver_flg, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 27, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 27, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 28, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 28, $sublot_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 29, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 29, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 30, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 30, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 31, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 31, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 32, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 32, $sno4_mng_typ, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 33, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 33, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 34, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 34, $wrk_nm, value);
	}


	/**
	 * Purchase type name 購買区分名.<p>
	 *
	 */
	public String purc_typ_nm() {
		return getConstString(offset + 35, $purc_typ_nm);
	}

	/**
	 * Purchase type name 購買区分名.<p>
	 *
	 */
	public void purc_typ_nm(String value) {
		setConstString(offset + 35, $purc_typ_nm, value);
	}


	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public String purc_id_typ_nm() {
		return getConstString(offset + 36, $purc_id_typ_nm);
	}

	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public void purc_id_typ_nm(String value) {
		setConstString(offset + 36, $purc_id_typ_nm, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 37, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 37, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 38, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 38, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 38, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 38, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 38, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 38, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 39, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 39, $trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCNumber trd_unit_dmn_qty() {
		return getConstNumber(offset + 40, $trd_unit_dmn_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_dmn_qty(MCNumber value) {
		setConstNumber(offset + 40, $trd_unit_dmn_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_dmn_qty(int value) {
		setConstNumber(offset + 40, $trd_unit_dmn_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_dmn_qty(long value) {
		setConstNumber(offset + 40, $trd_unit_dmn_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_dmn_qty(float value) {
		setConstNumber(offset + 40, $trd_unit_dmn_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_dmn_qty(double value) {
		setConstNumber(offset + 40, $trd_unit_dmn_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 41, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 41, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 41, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 41, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 41, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 41, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit returned qty. 取引単位返品済数量.<p>
	 *
	 */
	public MCNumber trd_ret_qty() {
		return getConstNumber(offset + 42, $trd_ret_qty);
	}

	/**
	 * Transaction unit returned qty. 取引単位返品済数量.<p>
	 *
	 */
	public void trd_ret_qty(MCNumber value) {
		setConstNumber(offset + 42, $trd_ret_qty, value);
	}

	/**
	 * Transaction unit returned qty. 取引単位返品済数量.<p>
	 *
	 */
	public void trd_ret_qty(int value) {
		setConstNumber(offset + 42, $trd_ret_qty, value);
	}

	/**
	 * Transaction unit returned qty. 取引単位返品済数量.<p>
	 *
	 */
	public void trd_ret_qty(long value) {
		setConstNumber(offset + 42, $trd_ret_qty, value);
	}

	/**
	 * Transaction unit returned qty. 取引単位返品済数量.<p>
	 *
	 */
	public void trd_ret_qty(float value) {
		setConstNumber(offset + 42, $trd_ret_qty, value);
	}

	/**
	 * Transaction unit returned qty. 取引単位返品済数量.<p>
	 *
	 */
	public void trd_ret_qty(double value) {
		setConstNumber(offset + 42, $trd_ret_qty, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 43, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 43, $base_unit_nm, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 44, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 44, $base_unit_rnd_typ, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 45, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 45, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 45, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 45, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 45, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 45, $base_unit_dec_place, value);
	}


	/**
	 * Remaining schedule qty. 予定残数.<p>
	 *
	 */
	public MCNumber schd_qty() {
		return getConstNumber(offset + 46, $schd_qty);
	}

	/**
	 * Remaining schedule qty. 予定残数.<p>
	 *
	 */
	public void schd_qty(MCNumber value) {
		setConstNumber(offset + 46, $schd_qty, value);
	}

	/**
	 * Remaining schedule qty. 予定残数.<p>
	 *
	 */
	public void schd_qty(int value) {
		setConstNumber(offset + 46, $schd_qty, value);
	}

	/**
	 * Remaining schedule qty. 予定残数.<p>
	 *
	 */
	public void schd_qty(long value) {
		setConstNumber(offset + 46, $schd_qty, value);
	}

	/**
	 * Remaining schedule qty. 予定残数.<p>
	 *
	 */
	public void schd_qty(float value) {
		setConstNumber(offset + 46, $schd_qty, value);
	}

	/**
	 * Remaining schedule qty. 予定残数.<p>
	 *
	 */
	public void schd_qty(double value) {
		setConstNumber(offset + 46, $schd_qty, value);
	}


	/**
	 * Returned qty. 返品済数.<p>
	 *
	 */
	public MCNumber ret_qty() {
		return getConstNumber(offset + 47, $ret_qty);
	}

	/**
	 * Returned qty. 返品済数.<p>
	 *
	 */
	public void ret_qty(MCNumber value) {
		setConstNumber(offset + 47, $ret_qty, value);
	}

	/**
	 * Returned qty. 返品済数.<p>
	 *
	 */
	public void ret_qty(int value) {
		setConstNumber(offset + 47, $ret_qty, value);
	}

	/**
	 * Returned qty. 返品済数.<p>
	 *
	 */
	public void ret_qty(long value) {
		setConstNumber(offset + 47, $ret_qty, value);
	}

	/**
	 * Returned qty. 返品済数.<p>
	 *
	 */
	public void ret_qty(float value) {
		setConstNumber(offset + 47, $ret_qty, value);
	}

	/**
	 * Returned qty. 返品済数.<p>
	 *
	 */
	public void ret_qty(double value) {
		setConstNumber(offset + 47, $ret_qty, value);
	}


	/**
	 * Cancelled remaining qty. 打切数.<p>
	 *
	 */
	public MCNumber abort_qty() {
		return getConstNumber(offset + 48, $abort_qty);
	}

	/**
	 * Cancelled remaining qty. 打切数.<p>
	 *
	 */
	public void abort_qty(MCNumber value) {
		setConstNumber(offset + 48, $abort_qty, value);
	}

	/**
	 * Cancelled remaining qty. 打切数.<p>
	 *
	 */
	public void abort_qty(int value) {
		setConstNumber(offset + 48, $abort_qty, value);
	}

	/**
	 * Cancelled remaining qty. 打切数.<p>
	 *
	 */
	public void abort_qty(long value) {
		setConstNumber(offset + 48, $abort_qty, value);
	}

	/**
	 * Cancelled remaining qty. 打切数.<p>
	 *
	 */
	public void abort_qty(float value) {
		setConstNumber(offset + 48, $abort_qty, value);
	}

	/**
	 * Cancelled remaining qty. 打切数.<p>
	 *
	 */
	public void abort_qty(double value) {
		setConstNumber(offset + 48, $abort_qty, value);
	}


	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 49, $repurc_obli_flg);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 49, $repurc_obli_flg, value);
	}


	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public String outsrc_upri_typ() {
		return getConstString(offset + 50, $outsrc_upri_typ);
	}

	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public void outsrc_upri_typ(String value) {
		setConstString(offset + 50, $outsrc_upri_typ, value);
	}


	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public MCNumber trd_cur_inc_tax_amt() {
		return getConstNumber(offset + 51, $trd_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 51, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 51, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 51, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 51, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 51, $trd_cur_inc_tax_amt, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 52, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 52, $tax_nm, value);
	}


	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public boolean tax_fix_flg() {
		return getConstBoolean(offset + 53, $tax_fix_flg);
	}

	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public void tax_fix_flg(boolean value) {
		setConstBoolean(offset + 53, $tax_fix_flg, value);
	}


	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 54, $inc_tax_flg);
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 54, $inc_tax_flg, value);
	}


	/**
	 * Tax rate at schedule 予定時税率.<p>
	 *
	 */
	public MCNumber schd_tax_rate() {
		return getConstNumber(offset + 55, $schd_tax_rate);
	}

	/**
	 * Tax rate at schedule 予定時税率.<p>
	 *
	 */
	public void schd_tax_rate(MCNumber value) {
		setConstNumber(offset + 55, $schd_tax_rate, value);
	}

	/**
	 * Tax rate at schedule 予定時税率.<p>
	 *
	 */
	public void schd_tax_rate(int value) {
		setConstNumber(offset + 55, $schd_tax_rate, value);
	}

	/**
	 * Tax rate at schedule 予定時税率.<p>
	 *
	 */
	public void schd_tax_rate(long value) {
		setConstNumber(offset + 55, $schd_tax_rate, value);
	}

	/**
	 * Tax rate at schedule 予定時税率.<p>
	 *
	 */
	public void schd_tax_rate(float value) {
		setConstNumber(offset + 55, $schd_tax_rate, value);
	}

	/**
	 * Tax rate at schedule 予定時税率.<p>
	 *
	 */
	public void schd_tax_rate(double value) {
		setConstNumber(offset + 55, $schd_tax_rate, value);
	}


	/**
	 * Tax inclusive at schedule flg. 予定時内税ＦＬＧ.<p>
	 *
	 */
	public boolean schd_inc_tax_flg() {
		return getConstBoolean(offset + 56, $schd_inc_tax_flg);
	}

	/**
	 * Tax inclusive at schedule flg. 予定時内税ＦＬＧ.<p>
	 *
	 */
	public void schd_inc_tax_flg(boolean value) {
		setConstBoolean(offset + 56, $schd_inc_tax_flg, value);
	}


	/**
	 * Tax cd. at result 実績時税ＣＤ.<p>
	 *
	 */
	public String act_tax_cd() {
		return getConstString(offset + 57, $act_tax_cd);
	}

	/**
	 * Tax cd. at result 実績時税ＣＤ.<p>
	 *
	 */
	public void act_tax_cd(String value) {
		setConstString(offset + 57, $act_tax_cd, value);
	}


	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public MCNumber base_cur_inc_tax_amt() {
		return getConstNumber(offset + 58, $base_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 58, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 58, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 58, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 58, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 58, $base_cur_inc_tax_amt, value);
	}


	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public MCNumber ptax_cur_inc_tax_amt() {
		return getConstNumber(offset + 59, $ptax_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 59, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 59, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 59, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 59, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 59, $ptax_cur_inc_tax_amt, value);
	}


	/**
	 * Inspection 検査.<p>
	 *
	 */
	public boolean insp_flg() {
		return getConstBoolean(offset + 60, $insp_flg);
	}

	/**
	 * Inspection 検査.<p>
	 *
	 */
	public void insp_flg(boolean value) {
		setConstBoolean(offset + 60, $insp_flg, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 61, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 61, $quality_typ_nm, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 62, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 62, $stk_insp_typ_nm, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 63, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 63, $stk_id_typ_nm, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 64, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 64, $gd_nm, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 65, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 65, $stk_arrv_bp_nm, value);
	}


	/**
	 * Return reason name 返品理由名.<p>
	 *
	 */
	public String ret_rsn_nm() {
		return getConstString(offset + 66, $ret_rsn_nm);
	}

	/**
	 * Return reason name 返品理由名.<p>
	 *
	 */
	public void ret_rsn_nm(String value) {
		setConstString(offset + 66, $ret_rsn_nm, value);
	}


	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public String dscnt_rsn_nm() {
		return getConstString(offset + 67, $dscnt_rsn_nm);
	}

	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public void dscnt_rsn_nm(String value) {
		setConstString(offset + 67, $dscnt_rsn_nm, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 68, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 68, $ap_dpt_nm, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 69, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 69, $bd_dpt_nm, value);
	}


	/**
	 * Charged WG name 負担ＷＧ名.<p>
	 *
	 */
	public String bd_wg_nm() {
		return getConstString(offset + 70, $bd_wg_nm);
	}

	/**
	 * Charged WG name 負担ＷＧ名.<p>
	 *
	 */
	public void bd_wg_nm(String value) {
		setConstString(offset + 70, $bd_wg_nm, value);
	}


	/**
	 * Charged item name 負担品名.<p>
	 *
	 */
	public String bd_itm_nm() {
		return getConstString(offset + 71, $bd_itm_nm);
	}

	/**
	 * Charged item name 負担品名.<p>
	 *
	 */
	public void bd_itm_nm(String value) {
		setConstString(offset + 71, $bd_itm_nm, value);
	}


	/**
	 * Charged location name 負担場所名.<p>
	 *
	 */
	public String bd_loc_nm() {
		return getConstString(offset + 72, $bd_loc_nm);
	}

	/**
	 * Charged location name 負担場所名.<p>
	 *
	 */
	public void bd_loc_nm(String value) {
		setConstString(offset + 72, $bd_loc_nm, value);
	}


	/**
	 * Charged item group name 負担品群名.<p>
	 *
	 */
	public String bd_ctg_nm() {
		return getConstString(offset + 73, $bd_ctg_nm);
	}

	/**
	 * Charged item group name 負担品群名.<p>
	 *
	 */
	public void bd_ctg_nm(String value) {
		setConstString(offset + 73, $bd_ctg_nm, value);
	}


	/**
	 * Charged operation name 負担工程名.<p>
	 *
	 */
	public String bd_oper_nm() {
		return getConstString(offset + 74, $bd_oper_nm);
	}

	/**
	 * Charged operation name 負担工程名.<p>
	 *
	 */
	public void bd_oper_nm(String value) {
		setConstString(offset + 74, $bd_oper_nm, value);
	}


	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public String bd_bp_cd() {
		return getConstString(offset + 75, $bd_bp_cd);
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public void bd_bp_cd(String value) {
		setConstString(offset + 75, $bd_bp_cd, value);
	}


	/**
	 * Charged BP name 負担取引先名.<p>
	 *
	 */
	public String bd_bp_nm() {
		return getConstString(offset + 76, $bd_bp_nm);
	}

	/**
	 * Charged BP name 負担取引先名.<p>
	 *
	 */
	public void bd_bp_nm(String value) {
		setConstString(offset + 76, $bd_bp_nm, value);
	}


	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public String asset_mng_typ_nm() {
		return getConstString(offset + 77, $asset_mng_typ_nm);
	}

	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public void asset_mng_typ_nm(String value) {
		setConstString(offset + 77, $asset_mng_typ_nm, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 78, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 78, $cont_fctr_flg, value);
	}


	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public MCNumber purc_cont_fctr() {
		return getConstNumber(offset + 79, $purc_cont_fctr);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(MCNumber value) {
		setConstNumber(offset + 79, $purc_cont_fctr, value);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(int value) {
		setConstNumber(offset + 79, $purc_cont_fctr, value);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(long value) {
		setConstNumber(offset + 79, $purc_cont_fctr, value);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(float value) {
		setConstNumber(offset + 79, $purc_cont_fctr, value);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(double value) {
		setConstNumber(offset + 79, $purc_cont_fctr, value);
	}


	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public MCNumber std_cont_qty() {
		return getConstNumber(offset + 80, $std_cont_qty);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(MCNumber value) {
		setConstNumber(offset + 80, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(int value) {
		setConstNumber(offset + 80, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(long value) {
		setConstNumber(offset + 80, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(float value) {
		setConstNumber(offset + 80, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(double value) {
		setConstNumber(offset + 80, $std_cont_qty, value);
	}


	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 81, $std_cont_fctr);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 81, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 81, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 81, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 81, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 81, $std_cont_fctr, value);
	}


	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 82, $cont_fctr_unit_cd);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 82, $cont_fctr_unit_cd, value);
	}


	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public String cont_fctr_unit_nm() {
		return getConstString(offset + 83, $cont_fctr_unit_nm);
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public void cont_fctr_unit_nm(String value) {
		setConstString(offset + 83, $cont_fctr_unit_nm, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 84, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 84, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 85, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 85, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 85, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 85, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 85, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 85, $cont_fctr_dec_place, value);
	}


	/**
	 * Reference receipt result No. 参照入荷実績ＮＯ.<p>
	 *
	 */
	public String ref_arr_act_no() {
		return getConstString(offset + 86, $ref_arr_act_no);
	}

	/**
	 * Reference receipt result No. 参照入荷実績ＮＯ.<p>
	 *
	 */
	public void ref_arr_act_no(String value) {
		setConstString(offset + 86, $ref_arr_act_no, value);
	}


	/**
	 * Reference receipt result rev. number 参照入荷実績改訂番号.<p>
	 *
	 */
	public MCNumber ref_arr_act_rev() {
		return getConstNumber(offset + 87, $ref_arr_act_rev);
	}

	/**
	 * Reference receipt result rev. number 参照入荷実績改訂番号.<p>
	 *
	 */
	public void ref_arr_act_rev(MCNumber value) {
		setConstNumber(offset + 87, $ref_arr_act_rev, value);
	}

	/**
	 * Reference receipt result rev. number 参照入荷実績改訂番号.<p>
	 *
	 */
	public void ref_arr_act_rev(int value) {
		setConstNumber(offset + 87, $ref_arr_act_rev, value);
	}

	/**
	 * Reference receipt result rev. number 参照入荷実績改訂番号.<p>
	 *
	 */
	public void ref_arr_act_rev(long value) {
		setConstNumber(offset + 87, $ref_arr_act_rev, value);
	}

	/**
	 * Reference receipt result rev. number 参照入荷実績改訂番号.<p>
	 *
	 */
	public void ref_arr_act_rev(float value) {
		setConstNumber(offset + 87, $ref_arr_act_rev, value);
	}

	/**
	 * Reference receipt result rev. number 参照入荷実績改訂番号.<p>
	 *
	 */
	public void ref_arr_act_rev(double value) {
		setConstNumber(offset + 87, $ref_arr_act_rev, value);
	}


	/**
	 * Base date (For unit price re-acquisition) 基準日（単価再取得用）.<p>
	 *
	 */
	public MCDate base_dt() {
		return getConstDate(offset + 88, $base_dt);
	}

	/**
	 * Base date (For unit price re-acquisition) 基準日（単価再取得用）.<p>
	 *
	 */
	public void base_dt(MCDate value) {
		setConstDate(offset + 88, $base_dt, value);
	}


	public String getString(String name) {
		if ($schd_trd_unit_cd.equalsIgnoreCase(name)) {
			return schd_trd_unit_cd();
		}
		if ($schd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return schd_trd_unit_rnd_typ();
		}
		if ($purc_ret_loc_wg_nm.equalsIgnoreCase(name)) {
			return purc_ret_loc_wg_nm();
		}
		if ($purc_ret_loc_nm.equalsIgnoreCase(name)) {
			return purc_ret_loc_nm();
		}
		if ($purc_ret_sppl_nm.equalsIgnoreCase(name)) {
			return purc_ret_sppl_nm();
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			return loc_mng_typ();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($purc_typ_nm.equalsIgnoreCase(name)) {
			return purc_typ_nm();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($act_tax_cd.equalsIgnoreCase(name)) {
			return act_tax_cd();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($ret_rsn_nm.equalsIgnoreCase(name)) {
			return ret_rsn_nm();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($bd_wg_nm.equalsIgnoreCase(name)) {
			return bd_wg_nm();
		}
		if ($bd_itm_nm.equalsIgnoreCase(name)) {
			return bd_itm_nm();
		}
		if ($bd_loc_nm.equalsIgnoreCase(name)) {
			return bd_loc_nm();
		}
		if ($bd_ctg_nm.equalsIgnoreCase(name)) {
			return bd_ctg_nm();
		}
		if ($bd_oper_nm.equalsIgnoreCase(name)) {
			return bd_oper_nm();
		}
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			return bd_bp_cd();
		}
		if ($bd_bp_nm.equalsIgnoreCase(name)) {
			return bd_bp_nm();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($ref_arr_act_no.equalsIgnoreCase(name)) {
			return ref_arr_act_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_conv_qty();
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_dmn_qty();
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return schd_trd_unit_dec_place();
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_qty();
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			return schd_base_unit_qty();
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			return schd_trd_cur_upri();
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return schd_trd_cur_proc_upri();
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return schd_trd_cur_onr_prov_upri();
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_dscnt_amt();
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_amt();
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_proc_amt();
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_onr_prov_amt();
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_tax_amt();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			return trd_unit_dmn_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_ret_qty.equalsIgnoreCase(name)) {
			return trd_ret_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			return schd_qty();
		}
		if ($ret_qty.equalsIgnoreCase(name)) {
			return ret_qty();
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			return abort_qty();
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt();
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			return schd_tax_rate();
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_inc_tax_amt();
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_inc_tax_amt();
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			return purc_cont_fctr();
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			return std_cont_qty();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			return ref_arr_act_rev();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return itm_purc_upri_cng_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			return arr_skip_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($schd_inc_tax_flg.equalsIgnoreCase(name)) {
			return schd_inc_tax_flg();
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			return insp_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($schd_trd_unit_cd.equalsIgnoreCase(name)) {
			return schd_trd_unit_cd();
		}
		if ($schd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return schd_trd_unit_rnd_typ();
		}
		if ($purc_ret_loc_wg_nm.equalsIgnoreCase(name)) {
			return purc_ret_loc_wg_nm();
		}
		if ($purc_ret_loc_nm.equalsIgnoreCase(name)) {
			return purc_ret_loc_nm();
		}
		if ($purc_ret_sppl_nm.equalsIgnoreCase(name)) {
			return purc_ret_sppl_nm();
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			return loc_mng_typ();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($purc_typ_nm.equalsIgnoreCase(name)) {
			return purc_typ_nm();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($act_tax_cd.equalsIgnoreCase(name)) {
			return act_tax_cd();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($ret_rsn_nm.equalsIgnoreCase(name)) {
			return ret_rsn_nm();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($bd_wg_nm.equalsIgnoreCase(name)) {
			return bd_wg_nm();
		}
		if ($bd_itm_nm.equalsIgnoreCase(name)) {
			return bd_itm_nm();
		}
		if ($bd_loc_nm.equalsIgnoreCase(name)) {
			return bd_loc_nm();
		}
		if ($bd_ctg_nm.equalsIgnoreCase(name)) {
			return bd_ctg_nm();
		}
		if ($bd_oper_nm.equalsIgnoreCase(name)) {
			return bd_oper_nm();
		}
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			return bd_bp_cd();
		}
		if ($bd_bp_nm.equalsIgnoreCase(name)) {
			return bd_bp_nm();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($ref_arr_act_no.equalsIgnoreCase(name)) {
			return ref_arr_act_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_conv_qty();
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_dmn_qty();
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return schd_trd_unit_dec_place();
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_qty();
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			return schd_base_unit_qty();
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			return schd_trd_cur_upri();
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return schd_trd_cur_proc_upri();
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return schd_trd_cur_onr_prov_upri();
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_dscnt_amt();
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_amt();
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_proc_amt();
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_onr_prov_amt();
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_tax_amt();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			return trd_unit_dmn_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_ret_qty.equalsIgnoreCase(name)) {
			return trd_ret_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			return schd_qty();
		}
		if ($ret_qty.equalsIgnoreCase(name)) {
			return ret_qty();
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			return abort_qty();
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt();
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			return schd_tax_rate();
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_inc_tax_amt();
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_inc_tax_amt();
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			return purc_cont_fctr();
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			return std_cont_qty();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			return ref_arr_act_rev();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return itm_purc_upri_cng_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			return arr_skip_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($schd_inc_tax_flg.equalsIgnoreCase(name)) {
			return schd_inc_tax_flg();
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			return insp_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($schd_trd_unit_cd.equalsIgnoreCase(name)) {
			schd_trd_unit_cd(value);
			return;
		}
		if ($schd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			schd_trd_unit_rnd_typ(value);
			return;
		}
		if ($purc_ret_loc_wg_nm.equalsIgnoreCase(name)) {
			purc_ret_loc_wg_nm(value);
			return;
		}
		if ($purc_ret_loc_nm.equalsIgnoreCase(name)) {
			purc_ret_loc_nm(value);
			return;
		}
		if ($purc_ret_sppl_nm.equalsIgnoreCase(name)) {
			purc_ret_sppl_nm(value);
			return;
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			loc_mng_typ(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($purc_typ_nm.equalsIgnoreCase(name)) {
			purc_typ_nm(value);
			return;
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			purc_id_typ_nm(value);
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
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($act_tax_cd.equalsIgnoreCase(name)) {
			act_tax_cd(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($ret_rsn_nm.equalsIgnoreCase(name)) {
			ret_rsn_nm(value);
			return;
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			dscnt_rsn_nm(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($bd_wg_nm.equalsIgnoreCase(name)) {
			bd_wg_nm(value);
			return;
		}
		if ($bd_itm_nm.equalsIgnoreCase(name)) {
			bd_itm_nm(value);
			return;
		}
		if ($bd_loc_nm.equalsIgnoreCase(name)) {
			bd_loc_nm(value);
			return;
		}
		if ($bd_ctg_nm.equalsIgnoreCase(name)) {
			bd_ctg_nm(value);
			return;
		}
		if ($bd_oper_nm.equalsIgnoreCase(name)) {
			bd_oper_nm(value);
			return;
		}
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			bd_bp_cd(value);
			return;
		}
		if ($bd_bp_nm.equalsIgnoreCase(name)) {
			bd_bp_nm(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
			return;
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			cont_fctr_unit_nm(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($ref_arr_act_no.equalsIgnoreCase(name)) {
			ref_arr_act_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_dmn_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_upri(value);
			return;
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_upri(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_amt(value);
			return;
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_amt(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_tax_amt(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			trd_unit_dmn_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_ret_qty.equalsIgnoreCase(name)) {
			trd_ret_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($ret_qty.equalsIgnoreCase(name)) {
			ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			ref_arr_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_dmn_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_upri(value);
			return;
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_upri(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_amt(value);
			return;
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_amt(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_tax_amt(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			trd_unit_dmn_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_ret_qty.equalsIgnoreCase(name)) {
			trd_ret_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($ret_qty.equalsIgnoreCase(name)) {
			ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			ref_arr_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_dmn_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_upri(value);
			return;
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_upri(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_amt(value);
			return;
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_amt(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_tax_amt(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			trd_unit_dmn_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_ret_qty.equalsIgnoreCase(name)) {
			trd_ret_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($ret_qty.equalsIgnoreCase(name)) {
			ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			ref_arr_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_dmn_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_upri(value);
			return;
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_upri(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_amt(value);
			return;
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_amt(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_tax_amt(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			trd_unit_dmn_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_ret_qty.equalsIgnoreCase(name)) {
			trd_ret_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($ret_qty.equalsIgnoreCase(name)) {
			ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			ref_arr_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_dmn_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_upri(value);
			return;
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_upri(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_amt(value);
			return;
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_amt(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_tax_amt(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			trd_unit_dmn_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_ret_qty.equalsIgnoreCase(name)) {
			trd_ret_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($ret_qty.equalsIgnoreCase(name)) {
			ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			ref_arr_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			itm_purc_upri_cng_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			arr_skip_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			tax_fix_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($schd_inc_tax_flg.equalsIgnoreCase(name)) {
			schd_inc_tax_flg(value);
			return;
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			insp_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($schd_trd_unit_cd.equalsIgnoreCase(name)) {
			schd_trd_unit_cd(value);
			return;
		}
		if ($schd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			schd_trd_unit_rnd_typ(value);
			return;
		}
		if ($purc_ret_loc_wg_nm.equalsIgnoreCase(name)) {
			purc_ret_loc_wg_nm(value);
			return;
		}
		if ($purc_ret_loc_nm.equalsIgnoreCase(name)) {
			purc_ret_loc_nm(value);
			return;
		}
		if ($purc_ret_sppl_nm.equalsIgnoreCase(name)) {
			purc_ret_sppl_nm(value);
			return;
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			loc_mng_typ(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($purc_typ_nm.equalsIgnoreCase(name)) {
			purc_typ_nm(value);
			return;
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			purc_id_typ_nm(value);
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
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($act_tax_cd.equalsIgnoreCase(name)) {
			act_tax_cd(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($ret_rsn_nm.equalsIgnoreCase(name)) {
			ret_rsn_nm(value);
			return;
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			dscnt_rsn_nm(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($bd_wg_nm.equalsIgnoreCase(name)) {
			bd_wg_nm(value);
			return;
		}
		if ($bd_itm_nm.equalsIgnoreCase(name)) {
			bd_itm_nm(value);
			return;
		}
		if ($bd_loc_nm.equalsIgnoreCase(name)) {
			bd_loc_nm(value);
			return;
		}
		if ($bd_ctg_nm.equalsIgnoreCase(name)) {
			bd_ctg_nm(value);
			return;
		}
		if ($bd_oper_nm.equalsIgnoreCase(name)) {
			bd_oper_nm(value);
			return;
		}
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			bd_bp_cd(value);
			return;
		}
		if ($bd_bp_nm.equalsIgnoreCase(name)) {
			bd_bp_nm(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
			return;
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			cont_fctr_unit_nm(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($ref_arr_act_no.equalsIgnoreCase(name)) {
			ref_arr_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_dmn_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_upri(value);
			return;
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_upri(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_amt(value);
			return;
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_amt(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_tax_amt(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			trd_unit_dmn_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_ret_qty.equalsIgnoreCase(name)) {
			trd_ret_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($ret_qty.equalsIgnoreCase(name)) {
			ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			ref_arr_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_dmn_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_upri(value);
			return;
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_upri(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_amt(value);
			return;
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_amt(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_tax_amt(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			trd_unit_dmn_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_ret_qty.equalsIgnoreCase(name)) {
			trd_ret_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($ret_qty.equalsIgnoreCase(name)) {
			ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			ref_arr_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_dmn_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_upri(value);
			return;
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_upri(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_amt(value);
			return;
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_amt(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_tax_amt(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			trd_unit_dmn_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_ret_qty.equalsIgnoreCase(name)) {
			trd_ret_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($ret_qty.equalsIgnoreCase(name)) {
			ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			ref_arr_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_dmn_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_upri(value);
			return;
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_upri(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_amt(value);
			return;
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_amt(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_tax_amt(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			trd_unit_dmn_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_ret_qty.equalsIgnoreCase(name)) {
			trd_ret_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($ret_qty.equalsIgnoreCase(name)) {
			ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			ref_arr_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_dmn_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($schd_trd_cur_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_upri(value);
			return;
		}
		if ($schd_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_upri(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_trd_cur_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_amt(value);
			return;
		}
		if ($schd_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_proc_amt(value);
			return;
		}
		if ($schd_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($schd_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_tax_amt(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_dmn_qty.equalsIgnoreCase(name)) {
			trd_unit_dmn_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_ret_qty.equalsIgnoreCase(name)) {
			trd_ret_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($ret_qty.equalsIgnoreCase(name)) {
			ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($ref_arr_act_rev.equalsIgnoreCase(name)) {
			ref_arr_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			itm_purc_upri_cng_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			arr_skip_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			tax_fix_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($schd_inc_tax_flg.equalsIgnoreCase(name)) {
			schd_inc_tax_flg(value);
			return;
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			insp_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

