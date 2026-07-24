package mcframe.clientMSBB.MSBBP1380;

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
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public static final String $sls_act_no = "sls_act_no";
	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public static final String $sls_act_seq = "sls_act_seq";
	public static final String $itm_p = "itm_p";
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
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
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
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public static final String $lot_no_typ = "lot_no_typ";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public static final String $sublot_no_typ = "sublot_no_typ";
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
	public static final String $trd_cur_upri_amt_p = "trd_cur_upri_amt_p";
	public static final String $base_cur_upri_p = "base_cur_upri_p";
	public static final String $base_cur_amt_p = "base_cur_amt_p";
	public static final String $base_cur_tax_amt_p = "base_cur_tax_amt_p";
	public static final String $base_cur_inc_tax_amt_p = "base_cur_inc_tax_amt_p";
	public static final String $ptax_cur_upri_p = "ptax_cur_upri_p";
	public static final String $ptax_cur_amt_p = "ptax_cur_amt_p";
	public static final String $ptax_cur_tax_amt_p = "ptax_cur_tax_amt_p";
	public static final String $ptax_cur_inc_tax_amt_p = "ptax_cur_inc_tax_amt_p";
	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public static final String $dscnt_rsn_cd = "dscnt_rsn_cd";
	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public static final String $dscnt_rsn_nm = "dscnt_rsn_nm";
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public static final String $bill_crryovr_times = "bill_crryovr_times";
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_d_no = "cst_po_d_no";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	/**
	 * Distribution channel name 1 仕向先１名.<p>
	 *
	 */
	public static final String $dest_nm1 = "dest_nm1";
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	/**
	 * Distribution channel name 2 仕向先２名.<p>
	 *
	 */
	public static final String $dest_nm2 = "dest_nm2";
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	/**
	 * Distribution channel name 3 仕向先３名.<p>
	 *
	 */
	public static final String $dest_nm3 = "dest_nm3";
	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public static final String $sls_act_d_no = "sls_act_d_no";
	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public static final String $sls_act_d_seq = "sls_act_d_seq";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	public static final String $lot_no_p = "lot_no_p";
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	public static final String $wtax_amt_p = "wtax_amt_p";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
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
	 * Reference sales result No. 参照売上実績ＮＯ.<p>
	 *
	 */
	public static final String $ref_sls_act_no = "ref_sls_act_no";
	/**
	 * Reference rev. number 参照改訂番号.<p>
	 *
	 */
	public static final String $ref_sls_act_rev = "ref_sls_act_rev";
	/**
	 * Reference sales result sequence number 参照売上実績連番.<p>
	 *
	 */
	public static final String $ref_sls_act_seq = "ref_sls_act_seq";
	/**
	 * Reference sales result details No. 参照売上実績明細ＮＯ.<p>
	 *
	 */
	public static final String $ref_sls_act_d_no = "ref_sls_act_d_no";
	/**
	 * Reference sales result details sequence number 参照売上実績明細連番.<p>
	 *
	 */
	public static final String $ref_sls_act_d_seq = "ref_sls_act_d_seq";
	/**
	 * Sales recording date (Base) 売上計上日（基）.<p>
	 *
	 */
	public static final String $base_sls_ac_dt = "base_sls_ac_dt";
	/**
	 * Result recording date 実績計上日.<p>
	 *
	 */
	public static final String $ref_ac_dt = "ref_ac_dt";
	public static final String $ref_trd_unit_qty_p = "ref_trd_unit_qty_p";
	/**
	 * Result unit cd. 実績単位ＣＤ.<p>
	 *
	 */
	public static final String $ref_trd_unit_cd = "ref_trd_unit_cd";
	/**
	 * Result unit name 実績単位名.<p>
	 *
	 */
	public static final String $ref_trd_unit_nm = "ref_trd_unit_nm";
	/**
	 * Result unit number of decimal places 実績単位小数部有効桁数.<p>
	 *
	 */
	public static final String $ref_trd_unit_dec_place = "ref_trd_unit_dec_place";
	public static final String $ref_trd_cur_upri_p = "ref_trd_cur_upri_p";
	public static final String $ref_trd_cur_amt_p = "ref_trd_cur_amt_p";
	/**
	 * Tax included result amount 実績税込金額.<p>
	 *
	 */
	public static final String $ref_trd_cur_inc_tax_amt = "ref_trd_cur_inc_tax_amt";
	/**
	 * Result tax cd. 実績税ＣＤ.<p>
	 *
	 */
	public static final String $ref_tax_cd = "ref_tax_cd";
	/**
	 * Result tax name 実績税名.<p>
	 *
	 */
	public static final String $ref_tax_nm = "ref_tax_nm";
	/**
	 * Result tax rate 実績税率.<p>
	 *
	 */
	public static final String $ref_tax_rate = "ref_tax_rate";
	public static final String $ref_base_cur_upri_p = "ref_base_cur_upri_p";
	public static final String $ref_base_cur_amt_p = "ref_base_cur_amt_p";
	/**
	 * Tax included result amount (Base currency) 基準通貨実績税込金額.<p>
	 *
	 */
	public static final String $ref_base_cur_inc_tax_amt = "ref_base_cur_inc_tax_amt";
	public static final String $ref_ptax_cur_upri_p = "ref_ptax_cur_upri_p";
	public static final String $ref_ptax_cur_amt_p = "ref_ptax_cur_amt_p";
	/**
	 * Tax included result amount (Tax currency) 納税通貨実績税込金額.<p>
	 *
	 */
	public static final String $ref_ptax_cur_inc_tax_amt = "ref_ptax_cur_inc_tax_amt";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public static final String $itm_bill_crryovr_times = "itm_bill_crryovr_times";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $trd_unit_qty = $trd_unit_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $upri_not_tgt_flg = $trd_cur_upri_amt_p + ".upri_not_tgt_flg";
	public static final String $trd_cur_upri = $trd_cur_upri_amt_p + ".trd_cur_upri";
	public static final String $interim_flg = $trd_cur_upri_amt_p + ".interim_flg";
	public static final String $trd_cur_amt = $trd_cur_upri_amt_p + ".trd_cur_amt";
	public static final String $trd_cur_inc_tax_amt = $trd_cur_upri_amt_p + ".trd_cur_inc_tax_amt";
	public static final String $tax_fix_flg = $trd_cur_upri_amt_p + ".tax_fix_flg";
	public static final String $tax_cd = $trd_cur_upri_amt_p + ".tax_cd";
	public static final String $tax_nm = $trd_cur_upri_amt_p + ".tax_nm";
	public static final String $tax_rate = $trd_cur_upri_amt_p + ".tax_rate";
	public static final String $tax_typ = $trd_cur_upri_amt_p + ".tax_typ";
	public static final String $inc_tax_flg = $trd_cur_upri_amt_p + ".inc_tax_flg";
	public static final String $trd_cur_tax_amt = $trd_cur_upri_amt_p + ".trd_cur_tax_amt";
	public static final String $trd_cur_dscnt_amt = $trd_cur_upri_amt_p + ".trd_cur_dscnt_amt";
	public static final String $base_cur_upri = $base_cur_upri_p + ".upri";
	public static final String $base_cur_amt = $base_cur_amt_p + ".amt";
	public static final String $base_cur_tax_amt = $base_cur_tax_amt_p + ".amt";
	public static final String $base_cur_inc_tax_amt = $base_cur_inc_tax_amt_p + ".amt";
	public static final String $ptax_cur_upri = $ptax_cur_upri_p + ".upri";
	public static final String $ptax_cur_amt = $ptax_cur_amt_p + ".amt";
	public static final String $ptax_cur_tax_amt = $ptax_cur_tax_amt_p + ".amt";
	public static final String $ptax_cur_inc_tax_amt = $ptax_cur_inc_tax_amt_p + ".amt";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $crt_lot_flg = $lot_no_p + ".crt_lot_flg";
	public static final String $lot_no = $lot_no_p + ".lot_no";
	public static final String $sublot_no = $lot_no_p + ".sublot_no";
	public static final String $wtax_amt = $wtax_amt_p + ".amt";
	public static final String $ref_trd_unit_qty = $ref_trd_unit_qty_p + ".qty";
	public static final String $ref_trd_cur_upri = $ref_trd_cur_upri_p + ".upri";
	public static final String $ref_trd_cur_amt = $ref_trd_cur_amt_p + ".amt";
	public static final String $ref_trd_cur_tax_amt = $ref_trd_cur_amt_p + ".tax_amt";
	public static final String $ref_base_cur_upri = $ref_base_cur_upri_p + ".upri";
	public static final String $ref_base_cur_amt = $ref_base_cur_amt_p + ".amt";
	public static final String $ref_base_cur_tax_amt = $ref_base_cur_amt_p + ".tax_amt";
	public static final String $ref_ptax_cur_upri = $ref_ptax_cur_upri_p + ".upri";
	public static final String $ref_ptax_cur_amt = $ref_ptax_cur_amt_p + ".amt";
	public static final String $ref_ptax_cur_tax_amt = $ref_ptax_cur_amt_p + ".tax_amt";

	public static final MCMeta sls_act_no_META = createCommonMeta($sls_act_no, mcframe.commonMA.meta.MA_META.SLS_ACT_NO);
	public static final MCMeta sls_act_seq_META = createCommonMeta($sls_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta asset_mng_typ_nm_META = createCommonMeta($asset_mng_typ_nm, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta lot_no_typ_META = createCommonMeta($lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sublot_no_typ_META = createCommonMeta($sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
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
	public static final MCMeta trd_cur_upri_amt_p_META = createInnerRowMeta($trd_cur_upri_amt_p, mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.class);
	public static final MCMeta base_cur_upri_p_META = createInnerRowMeta($base_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta base_cur_amt_p_META = createInnerRowMeta($base_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_tax_amt_p_META = createInnerRowMeta($base_cur_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_inc_tax_amt_p_META = createInnerRowMeta($base_cur_inc_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_upri_p_META = createInnerRowMeta($ptax_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta ptax_cur_amt_p_META = createInnerRowMeta($ptax_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_tax_amt_p_META = createInnerRowMeta($ptax_cur_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_inc_tax_amt_p_META = createInnerRowMeta($ptax_cur_inc_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta dscnt_rsn_cd_META = createCommonMeta($dscnt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta dscnt_rsn_nm_META = createCommonMeta($dscnt_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm1_META = createCommonMeta($dest_nm1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm2_META = createCommonMeta($dest_nm2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm3_META = createCommonMeta($dest_nm3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sls_act_d_no_META = createCommonMeta($sls_act_d_no, mcframe.commonMA.meta.MA_META.SLS_ACT_D_NO);
	public static final MCMeta sls_act_d_seq_META = createCommonMeta($sls_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta lot_no_p_META = createInnerRowMeta($lot_no_p, mcframe.clientMSUB.MSUBP5030.LotNoR.class);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_p_META = createInnerRowMeta($wtax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SLS_ACT_D_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SLS_ACT_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SLS_ACT_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SLS_ACT_D_SUB_CHAR3);
	public static final MCMeta ref_sls_act_no_META = createCommonMeta($ref_sls_act_no, mcframe.commonMA.meta.MA_META.SLS_ACT_NO);
	public static final MCMeta ref_sls_act_rev_META = createCommonMeta($ref_sls_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta ref_sls_act_seq_META = createCommonMeta($ref_sls_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta ref_sls_act_d_no_META = createCommonMeta($ref_sls_act_d_no, mcframe.commonMA.meta.MA_META.SLS_ACT_D_NO);
	public static final MCMeta ref_sls_act_d_seq_META = createCommonMeta($ref_sls_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta base_sls_ac_dt_META = createCommonMeta($base_sls_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ref_ac_dt_META = createCommonMeta($ref_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ref_trd_unit_qty_p_META = createInnerRowMeta($ref_trd_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta ref_trd_unit_cd_META = createCommonMeta($ref_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta ref_trd_unit_nm_META = createCommonMeta($ref_trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta ref_trd_unit_dec_place_META = createCommonMeta($ref_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ref_trd_cur_upri_p_META = createInnerRowMeta($ref_trd_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta ref_trd_cur_amt_p_META = createInnerRowMeta($ref_trd_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ref_trd_cur_inc_tax_amt_META = createCommonMeta($ref_trd_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ref_tax_cd_META = createCommonMeta($ref_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta ref_tax_nm_META = createCommonMeta($ref_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta ref_tax_rate_META = createCommonMeta($ref_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta ref_base_cur_upri_p_META = createInnerRowMeta($ref_base_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta ref_base_cur_amt_p_META = createInnerRowMeta($ref_base_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ref_base_cur_inc_tax_amt_META = createCommonMeta($ref_base_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ref_ptax_cur_upri_p_META = createInnerRowMeta($ref_ptax_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta ref_ptax_cur_amt_p_META = createInnerRowMeta($ref_ptax_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ref_ptax_cur_inc_tax_amt_META = createCommonMeta($ref_ptax_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta itm_bill_crryovr_times_META = createCommonMeta($itm_bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			sls_act_no_META,
			sls_act_seq_META,
			itm_p_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			dscnt_itm_flg_META,
			iv_itm_nm_META,
			stk_mng_typ_META,
			asset_mng_typ_META,
			asset_mng_typ_nm_META,
			sundry_itm_flg_META,
			lot_mng_typ_META,
			lot_no_typ_META,
			sublot_mng_typ_META,
			sublot_no_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
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
			trd_cur_upri_amt_p_META,
			base_cur_upri_p_META,
			base_cur_amt_p_META,
			base_cur_tax_amt_p_META,
			base_cur_inc_tax_amt_p_META,
			ptax_cur_upri_p_META,
			ptax_cur_amt_p_META,
			ptax_cur_tax_amt_p_META,
			ptax_cur_inc_tax_amt_p_META,
			dscnt_rsn_cd_META,
			dscnt_rsn_nm_META,
			bill_crryovr_times_META,
			cst_po_d_no_META,
			sno_wrk_no_p_META,
			dest_cd1_META,
			dest_nm1_META,
			dest_cd2_META,
			dest_nm2_META,
			dest_cd3_META,
			dest_nm3_META,
			sls_act_d_no_META,
			sls_act_d_seq_META,
			slo_no_META,
			slo_d_no_META,
			lot_no_p_META,
			wtax_rate_META,
			wtax_amt_p_META,
			trd_d_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			ref_sls_act_no_META,
			ref_sls_act_rev_META,
			ref_sls_act_seq_META,
			ref_sls_act_d_no_META,
			ref_sls_act_d_seq_META,
			base_sls_ac_dt_META,
			ref_ac_dt_META,
			ref_trd_unit_qty_p_META,
			ref_trd_unit_cd_META,
			ref_trd_unit_nm_META,
			ref_trd_unit_dec_place_META,
			ref_trd_cur_upri_p_META,
			ref_trd_cur_amt_p_META,
			ref_trd_cur_inc_tax_amt_META,
			ref_tax_cd_META,
			ref_tax_nm_META,
			ref_tax_rate_META,
			ref_base_cur_upri_p_META,
			ref_base_cur_amt_p_META,
			ref_base_cur_inc_tax_amt_META,
			ref_ptax_cur_upri_p_META,
			ref_ptax_cur_amt_p_META,
			ref_ptax_cur_inc_tax_amt_META,
			disp_seq_META,
			itm_bill_crryovr_times_META
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
				"base_cur_upri",
				"base_cur_amt",
				"base_cur_tax_amt",
				"base_cur_inc_tax_amt",
				"ptax_cur_upri",
				"ptax_cur_amt",
				"ptax_cur_tax_amt",
				"ptax_cur_inc_tax_amt",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"crt_lot_flg",
				"lot_no",
				"sublot_no",
				"wtax_amt",
				"ref_trd_unit_qty",
				"ref_trd_cur_upri",
				"ref_trd_cur_amt",
				"ref_trd_cur_tax_amt",
				"ref_base_cur_upri",
				"ref_base_cur_amt",
				"ref_base_cur_tax_amt",
				"ref_ptax_cur_upri",
				"ref_ptax_cur_amt",
				"ref_ptax_cur_tax_amt"
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
				$base_cur_upri,
				$base_cur_amt,
				$base_cur_tax_amt,
				$base_cur_inc_tax_amt,
				$ptax_cur_upri,
				$ptax_cur_amt,
				$ptax_cur_tax_amt,
				$ptax_cur_inc_tax_amt,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$crt_lot_flg,
				$lot_no,
				$sublot_no,
				$wtax_amt,
				$ref_trd_unit_qty,
				$ref_trd_cur_upri,
				$ref_trd_cur_amt,
				$ref_trd_cur_tax_amt,
				$ref_base_cur_upri,
				$ref_base_cur_amt,
				$ref_base_cur_tax_amt,
				$ref_ptax_cur_upri,
				$ref_ptax_cur_amt,
				$ref_ptax_cur_tax_amt
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
				{$itm_p + ".itm_cd", "itm_sub1;itm_sub2;itm_sub3;itm_nm;asset_mng_typ;asset_mng_typ_nm;sundry_itm_flg;ship_unit_cd;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;unit_cd;unit_nm;dec_place;rnd_typ;wtax_rate;dscnt_itm_flg;bill_crryovr_times;stk_mng_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_sub2;itm_sub3;itm_nm;asset_mng_typ;asset_mng_typ_nm;sundry_itm_flg;ship_unit_cd;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;unit_cd;unit_nm;dec_place;rnd_typ;wtax_rate;dscnt_itm_flg;bill_crryovr_times;stk_mng_typ"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_sub3;itm_nm;asset_mng_typ;asset_mng_typ_nm;sundry_itm_flg;ship_unit_cd;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;unit_cd;unit_nm;dec_place;rnd_typ;wtax_rate;dscnt_itm_flg;bill_crryovr_times;stk_mng_typ"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_nm;asset_mng_typ;asset_mng_typ_nm;sundry_itm_flg;ship_unit_cd;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;unit_cd;unit_nm;dec_place;rnd_typ;wtax_rate;dscnt_itm_flg;bill_crryovr_times;stk_mng_typ"},	// itm_p.itm_sub3
				{$cst_itm_cd, "bp_itm_nm;itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// cst_itm_cd
				{$trd_unit_cd, "unit_nm;dec_place;conv_base_qty;conv_qty;rnd_typ"},	// trd_unit_cd
				{$dscnt_rsn_cd, "biz_rsn_nm"},	// dscnt_rsn_cd
				{$dest_cd1, "bp_nm"},	// dest_cd1
				{$dest_cd2, "bp_nm"},	// dest_cd2
				{$dest_cd3, "bp_nm"}	// dest_cd3
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$cst_itm_cd, "bp_cd;bp_nm;dt"},	// cst_itm_cd
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$dest_cd1, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd1
				{$dest_cd2, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd2
				{$dest_cd3, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd3
				{$slo_no, "true;slo_d_no"}	// slo_no
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$cst_itm_cd, "bp_cd;bp_nm;dt"},	// cst_itm_cd
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$dest_cd1, "bp_is_srch_typ"},	// dest_cd1
				{$dest_cd2, "bp_is_srch_typ"},	// dest_cd2
				{$dest_cd3, "bp_is_srch_typ"},	// dest_cd3
				{$slo_no, "slo_d_no_srh_flg;in_slo_d_no"}	// slo_no
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_rnd_typ, "BASE_UNIT"},	// base_unit_rnd_typ
				{$base_unit_qty_p + ".qty", "BASE_UNIT"},	// base_unit_qty_p.qty
				{$base_cur_upri_p + ".upri", "BASE_CUR"},	// base_cur_upri_p.upri
				{$base_cur_amt_p + ".amt", "BASE_CUR"},	// base_cur_amt_p.amt
				{$base_cur_tax_amt_p + ".amt", "BASE_CUR"},	// base_cur_tax_amt_p.amt
				{$base_cur_inc_tax_amt_p + ".amt", "BASE_CUR"},	// base_cur_inc_tax_amt_p.amt
				{$ptax_cur_upri_p + ".upri", "PTAX"},	// ptax_cur_upri_p.upri
				{$ptax_cur_amt_p + ".amt", "PTAX"},	// ptax_cur_amt_p.amt
				{$ptax_cur_tax_amt_p + ".amt", "PTAX"},	// ptax_cur_tax_amt_p.amt
				{$ptax_cur_inc_tax_amt_p + ".amt", "PTAX"},	// ptax_cur_inc_tax_amt_p.amt
				{$dest_cd1, "DEST1"},	// dest_cd1
				{$dest_nm1, "DEST1"},	// dest_nm1
				{$dest_cd2, "DEST2"},	// dest_cd2
				{$dest_nm2, "DEST2"},	// dest_nm2
				{$dest_cd3, "DEST3"},	// dest_cd3
				{$dest_nm3, "DEST3"},	// dest_nm3
				{$wtax_rate, "WTAX"},	// wtax_rate
				{$wtax_amt_p + ".amt", "WTAX"},	// wtax_amt_p.amt
				{$ref_base_cur_upri_p + ".upri", "BASE_CUR"},	// ref_base_cur_upri_p.upri
				{$ref_base_cur_amt_p + ".amt", "BASE_CUR"},	// ref_base_cur_amt_p.amt
				{$ref_base_cur_inc_tax_amt, "BASE_CUR"},	// ref_base_cur_inc_tax_amt
				{$ref_base_cur_amt_p + ".tax_amt", "BASE_CUR"},	// ref_base_cur_amt_p.tax_amt
				{$ref_ptax_cur_upri_p + ".upri", "PTAX"},	// ref_ptax_cur_upri_p.upri
				{$ref_ptax_cur_amt_p + ".amt", "PTAX"},	// ref_ptax_cur_amt_p.amt
				{$ref_ptax_cur_inc_tax_amt, "PTAX"},	// ref_ptax_cur_inc_tax_amt
				{$ref_ptax_cur_amt_p + ".tax_amt", "PTAX"}	// ref_ptax_cur_amt_p.tax_amt
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
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public String sls_act_no() {
		return getConstString(offset + 0, $sls_act_no);
	}

	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public void sls_act_no(String value) {
		setConstString(offset + 0, $sls_act_no, value);
	}


	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public MCNumber sls_act_seq() {
		return getConstNumber(offset + 1, $sls_act_seq);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(MCNumber value) {
		setConstNumber(offset + 1, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(int value) {
		setConstNumber(offset + 1, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(long value) {
		setConstNumber(offset + 1, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(float value) {
		setConstNumber(offset + 1, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(double value) {
		setConstNumber(offset + 1, $sls_act_seq, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 2, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 2, $itm_p, row);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 3, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 3, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 4, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 4, $cst_itm_nm, value);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 5, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 5, $dscnt_itm_flg, value);
	}


	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 6, $iv_itm_nm);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 6, $iv_itm_nm, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 7, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 7, $stk_mng_typ, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 8, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 8, $asset_mng_typ, value);
	}


	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public String asset_mng_typ_nm() {
		return getConstString(offset + 9, $asset_mng_typ_nm);
	}

	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public void asset_mng_typ_nm(String value) {
		setConstString(offset + 9, $asset_mng_typ_nm, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 10, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 10, $sundry_itm_flg, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 11, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 11, $lot_mng_typ, value);
	}


	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 12, $lot_no_typ);
	}

	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 12, $lot_no_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 13, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 13, $sublot_mng_typ, value);
	}


	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 14, $sublot_no_typ);
	}

	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 14, $sublot_no_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 15, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 15, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 16, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 16, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 17, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 17, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 18, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 18, $sno4_mng_typ, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 19, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 19, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 20, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 20, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 21, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 21, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 21, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 21, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 21, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 21, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 22, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 22, $trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 23, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 23, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 23, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 23, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 23, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 23, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 24, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 24, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 24, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 24, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 24, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 24, $trd_unit_conv_qty, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 25, $trd_unit_qty_p);
	}
	
	public void trd_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 25, $trd_unit_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 26, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 26, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 27, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 27, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 28, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 28, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 28, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 28, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 28, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 28, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 29, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 29, $base_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 30, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 30, $base_unit_qty_p, row);
	}


	public mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR trd_cur_upri_amt_p(){
		return (mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR) getConstInnerRow(offset + 31, $trd_cur_upri_amt_p);
	}
	
	public void trd_cur_upri_amt_p(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR row){
		setConstInnerRow(offset + 31, $trd_cur_upri_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR base_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 32, $base_cur_upri_p);
	}
	
	public void base_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 32, $base_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 33, $base_cur_amt_p);
	}
	
	public void base_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 33, $base_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 34, $base_cur_tax_amt_p);
	}
	
	public void base_cur_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 34, $base_cur_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 35, $base_cur_inc_tax_amt_p);
	}
	
	public void base_cur_inc_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 35, $base_cur_inc_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR ptax_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 36, $ptax_cur_upri_p);
	}
	
	public void ptax_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 36, $ptax_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 37, $ptax_cur_amt_p);
	}
	
	public void ptax_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 37, $ptax_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 38, $ptax_cur_tax_amt_p);
	}
	
	public void ptax_cur_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 38, $ptax_cur_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 39, $ptax_cur_inc_tax_amt_p);
	}
	
	public void ptax_cur_inc_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 39, $ptax_cur_inc_tax_amt_p, row);
	}


	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return getConstString(offset + 40, $dscnt_rsn_cd);
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		setConstString(offset + 40, $dscnt_rsn_cd, value);
	}


	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public String dscnt_rsn_nm() {
		return getConstString(offset + 41, $dscnt_rsn_nm);
	}

	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public void dscnt_rsn_nm(String value) {
		setConstString(offset + 41, $dscnt_rsn_nm, value);
	}


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 42, $bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 42, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 42, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 42, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 42, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 42, $bill_crryovr_times, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 43, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 43, $cst_po_d_no, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 44, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 44, $sno_wrk_no_p, row);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 45, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 45, $dest_cd1, value);
	}


	/**
	 * Distribution channel name 1 仕向先１名.<p>
	 *
	 */
	public String dest_nm1() {
		return getConstString(offset + 46, $dest_nm1);
	}

	/**
	 * Distribution channel name 1 仕向先１名.<p>
	 *
	 */
	public void dest_nm1(String value) {
		setConstString(offset + 46, $dest_nm1, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 47, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 47, $dest_cd2, value);
	}


	/**
	 * Distribution channel name 2 仕向先２名.<p>
	 *
	 */
	public String dest_nm2() {
		return getConstString(offset + 48, $dest_nm2);
	}

	/**
	 * Distribution channel name 2 仕向先２名.<p>
	 *
	 */
	public void dest_nm2(String value) {
		setConstString(offset + 48, $dest_nm2, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 49, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 49, $dest_cd3, value);
	}


	/**
	 * Distribution channel name 3 仕向先３名.<p>
	 *
	 */
	public String dest_nm3() {
		return getConstString(offset + 50, $dest_nm3);
	}

	/**
	 * Distribution channel name 3 仕向先３名.<p>
	 *
	 */
	public void dest_nm3(String value) {
		setConstString(offset + 50, $dest_nm3, value);
	}


	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public String sls_act_d_no() {
		return getConstString(offset + 51, $sls_act_d_no);
	}

	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public void sls_act_d_no(String value) {
		setConstString(offset + 51, $sls_act_d_no, value);
	}


	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public MCNumber sls_act_d_seq() {
		return getConstNumber(offset + 52, $sls_act_d_seq);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(MCNumber value) {
		setConstNumber(offset + 52, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(int value) {
		setConstNumber(offset + 52, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(long value) {
		setConstNumber(offset + 52, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(float value) {
		setConstNumber(offset + 52, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(double value) {
		setConstNumber(offset + 52, $sls_act_d_seq, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 53, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 53, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 54, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 54, $slo_d_no, value);
	}


	public mcframe.clientMSUB.MSUBP5030.LotNoR lot_no_p(){
		return (mcframe.clientMSUB.MSUBP5030.LotNoR) getConstInnerRow(offset + 55, $lot_no_p);
	}
	
	public void lot_no_p(mcframe.clientMSUB.MSUBP5030.LotNoR row){
		setConstInnerRow(offset + 55, $lot_no_p, row);
	}


	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 56, $wtax_rate);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 56, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 56, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 56, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 56, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 56, $wtax_rate, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR wtax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 57, $wtax_amt_p);
	}
	
	public void wtax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 57, $wtax_amt_p, row);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 58, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 58, $trd_d_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 59, $intr_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 59, $intr_rmrks, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 60, $sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 60, $sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 61, $sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 61, $sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 62, $sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 62, $sub_char3, value);
	}


	/**
	 * Reference sales result No. 参照売上実績ＮＯ.<p>
	 *
	 */
	public String ref_sls_act_no() {
		return getConstString(offset + 63, $ref_sls_act_no);
	}

	/**
	 * Reference sales result No. 参照売上実績ＮＯ.<p>
	 *
	 */
	public void ref_sls_act_no(String value) {
		setConstString(offset + 63, $ref_sls_act_no, value);
	}


	/**
	 * Reference rev. number 参照改訂番号.<p>
	 *
	 */
	public MCNumber ref_sls_act_rev() {
		return getConstNumber(offset + 64, $ref_sls_act_rev);
	}

	/**
	 * Reference rev. number 参照改訂番号.<p>
	 *
	 */
	public void ref_sls_act_rev(MCNumber value) {
		setConstNumber(offset + 64, $ref_sls_act_rev, value);
	}

	/**
	 * Reference rev. number 参照改訂番号.<p>
	 *
	 */
	public void ref_sls_act_rev(int value) {
		setConstNumber(offset + 64, $ref_sls_act_rev, value);
	}

	/**
	 * Reference rev. number 参照改訂番号.<p>
	 *
	 */
	public void ref_sls_act_rev(long value) {
		setConstNumber(offset + 64, $ref_sls_act_rev, value);
	}

	/**
	 * Reference rev. number 参照改訂番号.<p>
	 *
	 */
	public void ref_sls_act_rev(float value) {
		setConstNumber(offset + 64, $ref_sls_act_rev, value);
	}

	/**
	 * Reference rev. number 参照改訂番号.<p>
	 *
	 */
	public void ref_sls_act_rev(double value) {
		setConstNumber(offset + 64, $ref_sls_act_rev, value);
	}


	/**
	 * Reference sales result sequence number 参照売上実績連番.<p>
	 *
	 */
	public MCNumber ref_sls_act_seq() {
		return getConstNumber(offset + 65, $ref_sls_act_seq);
	}

	/**
	 * Reference sales result sequence number 参照売上実績連番.<p>
	 *
	 */
	public void ref_sls_act_seq(MCNumber value) {
		setConstNumber(offset + 65, $ref_sls_act_seq, value);
	}

	/**
	 * Reference sales result sequence number 参照売上実績連番.<p>
	 *
	 */
	public void ref_sls_act_seq(int value) {
		setConstNumber(offset + 65, $ref_sls_act_seq, value);
	}

	/**
	 * Reference sales result sequence number 参照売上実績連番.<p>
	 *
	 */
	public void ref_sls_act_seq(long value) {
		setConstNumber(offset + 65, $ref_sls_act_seq, value);
	}

	/**
	 * Reference sales result sequence number 参照売上実績連番.<p>
	 *
	 */
	public void ref_sls_act_seq(float value) {
		setConstNumber(offset + 65, $ref_sls_act_seq, value);
	}

	/**
	 * Reference sales result sequence number 参照売上実績連番.<p>
	 *
	 */
	public void ref_sls_act_seq(double value) {
		setConstNumber(offset + 65, $ref_sls_act_seq, value);
	}


	/**
	 * Reference sales result details No. 参照売上実績明細ＮＯ.<p>
	 *
	 */
	public String ref_sls_act_d_no() {
		return getConstString(offset + 66, $ref_sls_act_d_no);
	}

	/**
	 * Reference sales result details No. 参照売上実績明細ＮＯ.<p>
	 *
	 */
	public void ref_sls_act_d_no(String value) {
		setConstString(offset + 66, $ref_sls_act_d_no, value);
	}


	/**
	 * Reference sales result details sequence number 参照売上実績明細連番.<p>
	 *
	 */
	public MCNumber ref_sls_act_d_seq() {
		return getConstNumber(offset + 67, $ref_sls_act_d_seq);
	}

	/**
	 * Reference sales result details sequence number 参照売上実績明細連番.<p>
	 *
	 */
	public void ref_sls_act_d_seq(MCNumber value) {
		setConstNumber(offset + 67, $ref_sls_act_d_seq, value);
	}

	/**
	 * Reference sales result details sequence number 参照売上実績明細連番.<p>
	 *
	 */
	public void ref_sls_act_d_seq(int value) {
		setConstNumber(offset + 67, $ref_sls_act_d_seq, value);
	}

	/**
	 * Reference sales result details sequence number 参照売上実績明細連番.<p>
	 *
	 */
	public void ref_sls_act_d_seq(long value) {
		setConstNumber(offset + 67, $ref_sls_act_d_seq, value);
	}

	/**
	 * Reference sales result details sequence number 参照売上実績明細連番.<p>
	 *
	 */
	public void ref_sls_act_d_seq(float value) {
		setConstNumber(offset + 67, $ref_sls_act_d_seq, value);
	}

	/**
	 * Reference sales result details sequence number 参照売上実績明細連番.<p>
	 *
	 */
	public void ref_sls_act_d_seq(double value) {
		setConstNumber(offset + 67, $ref_sls_act_d_seq, value);
	}


	/**
	 * Sales recording date (Base) 売上計上日（基）.<p>
	 *
	 */
	public MCDate base_sls_ac_dt() {
		return getConstDate(offset + 68, $base_sls_ac_dt);
	}

	/**
	 * Sales recording date (Base) 売上計上日（基）.<p>
	 *
	 */
	public void base_sls_ac_dt(MCDate value) {
		setConstDate(offset + 68, $base_sls_ac_dt, value);
	}


	/**
	 * Result recording date 実績計上日.<p>
	 *
	 */
	public MCDate ref_ac_dt() {
		return getConstDate(offset + 69, $ref_ac_dt);
	}

	/**
	 * Result recording date 実績計上日.<p>
	 *
	 */
	public void ref_ac_dt(MCDate value) {
		setConstDate(offset + 69, $ref_ac_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR ref_trd_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 70, $ref_trd_unit_qty_p);
	}
	
	public void ref_trd_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 70, $ref_trd_unit_qty_p, row);
	}


	/**
	 * Result unit cd. 実績単位ＣＤ.<p>
	 *
	 */
	public String ref_trd_unit_cd() {
		return getConstString(offset + 71, $ref_trd_unit_cd);
	}

	/**
	 * Result unit cd. 実績単位ＣＤ.<p>
	 *
	 */
	public void ref_trd_unit_cd(String value) {
		setConstString(offset + 71, $ref_trd_unit_cd, value);
	}


	/**
	 * Result unit name 実績単位名.<p>
	 *
	 */
	public String ref_trd_unit_nm() {
		return getConstString(offset + 72, $ref_trd_unit_nm);
	}

	/**
	 * Result unit name 実績単位名.<p>
	 *
	 */
	public void ref_trd_unit_nm(String value) {
		setConstString(offset + 72, $ref_trd_unit_nm, value);
	}


	/**
	 * Result unit number of decimal places 実績単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber ref_trd_unit_dec_place() {
		return getConstNumber(offset + 73, $ref_trd_unit_dec_place);
	}

	/**
	 * Result unit number of decimal places 実績単位小数部有効桁数.<p>
	 *
	 */
	public void ref_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 73, $ref_trd_unit_dec_place, value);
	}

	/**
	 * Result unit number of decimal places 実績単位小数部有効桁数.<p>
	 *
	 */
	public void ref_trd_unit_dec_place(int value) {
		setConstNumber(offset + 73, $ref_trd_unit_dec_place, value);
	}

	/**
	 * Result unit number of decimal places 実績単位小数部有効桁数.<p>
	 *
	 */
	public void ref_trd_unit_dec_place(long value) {
		setConstNumber(offset + 73, $ref_trd_unit_dec_place, value);
	}

	/**
	 * Result unit number of decimal places 実績単位小数部有効桁数.<p>
	 *
	 */
	public void ref_trd_unit_dec_place(float value) {
		setConstNumber(offset + 73, $ref_trd_unit_dec_place, value);
	}

	/**
	 * Result unit number of decimal places 実績単位小数部有効桁数.<p>
	 *
	 */
	public void ref_trd_unit_dec_place(double value) {
		setConstNumber(offset + 73, $ref_trd_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR ref_trd_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 74, $ref_trd_cur_upri_p);
	}
	
	public void ref_trd_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 74, $ref_trd_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ref_trd_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 75, $ref_trd_cur_amt_p);
	}
	
	public void ref_trd_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 75, $ref_trd_cur_amt_p, row);
	}


	/**
	 * Tax included result amount 実績税込金額.<p>
	 *
	 */
	public MCNumber ref_trd_cur_inc_tax_amt() {
		return getConstNumber(offset + 76, $ref_trd_cur_inc_tax_amt);
	}

	/**
	 * Tax included result amount 実績税込金額.<p>
	 *
	 */
	public void ref_trd_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 76, $ref_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included result amount 実績税込金額.<p>
	 *
	 */
	public void ref_trd_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 76, $ref_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included result amount 実績税込金額.<p>
	 *
	 */
	public void ref_trd_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 76, $ref_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included result amount 実績税込金額.<p>
	 *
	 */
	public void ref_trd_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 76, $ref_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included result amount 実績税込金額.<p>
	 *
	 */
	public void ref_trd_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 76, $ref_trd_cur_inc_tax_amt, value);
	}


	/**
	 * Result tax cd. 実績税ＣＤ.<p>
	 *
	 */
	public String ref_tax_cd() {
		return getConstString(offset + 77, $ref_tax_cd);
	}

	/**
	 * Result tax cd. 実績税ＣＤ.<p>
	 *
	 */
	public void ref_tax_cd(String value) {
		setConstString(offset + 77, $ref_tax_cd, value);
	}


	/**
	 * Result tax name 実績税名.<p>
	 *
	 */
	public String ref_tax_nm() {
		return getConstString(offset + 78, $ref_tax_nm);
	}

	/**
	 * Result tax name 実績税名.<p>
	 *
	 */
	public void ref_tax_nm(String value) {
		setConstString(offset + 78, $ref_tax_nm, value);
	}


	/**
	 * Result tax rate 実績税率.<p>
	 *
	 */
	public MCNumber ref_tax_rate() {
		return getConstNumber(offset + 79, $ref_tax_rate);
	}

	/**
	 * Result tax rate 実績税率.<p>
	 *
	 */
	public void ref_tax_rate(MCNumber value) {
		setConstNumber(offset + 79, $ref_tax_rate, value);
	}

	/**
	 * Result tax rate 実績税率.<p>
	 *
	 */
	public void ref_tax_rate(int value) {
		setConstNumber(offset + 79, $ref_tax_rate, value);
	}

	/**
	 * Result tax rate 実績税率.<p>
	 *
	 */
	public void ref_tax_rate(long value) {
		setConstNumber(offset + 79, $ref_tax_rate, value);
	}

	/**
	 * Result tax rate 実績税率.<p>
	 *
	 */
	public void ref_tax_rate(float value) {
		setConstNumber(offset + 79, $ref_tax_rate, value);
	}

	/**
	 * Result tax rate 実績税率.<p>
	 *
	 */
	public void ref_tax_rate(double value) {
		setConstNumber(offset + 79, $ref_tax_rate, value);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR ref_base_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 80, $ref_base_cur_upri_p);
	}
	
	public void ref_base_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 80, $ref_base_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ref_base_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 81, $ref_base_cur_amt_p);
	}
	
	public void ref_base_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 81, $ref_base_cur_amt_p, row);
	}


	/**
	 * Tax included result amount (Base currency) 基準通貨実績税込金額.<p>
	 *
	 */
	public MCNumber ref_base_cur_inc_tax_amt() {
		return getConstNumber(offset + 82, $ref_base_cur_inc_tax_amt);
	}

	/**
	 * Tax included result amount (Base currency) 基準通貨実績税込金額.<p>
	 *
	 */
	public void ref_base_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 82, $ref_base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included result amount (Base currency) 基準通貨実績税込金額.<p>
	 *
	 */
	public void ref_base_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 82, $ref_base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included result amount (Base currency) 基準通貨実績税込金額.<p>
	 *
	 */
	public void ref_base_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 82, $ref_base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included result amount (Base currency) 基準通貨実績税込金額.<p>
	 *
	 */
	public void ref_base_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 82, $ref_base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included result amount (Base currency) 基準通貨実績税込金額.<p>
	 *
	 */
	public void ref_base_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 82, $ref_base_cur_inc_tax_amt, value);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR ref_ptax_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 83, $ref_ptax_cur_upri_p);
	}
	
	public void ref_ptax_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 83, $ref_ptax_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ref_ptax_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 84, $ref_ptax_cur_amt_p);
	}
	
	public void ref_ptax_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 84, $ref_ptax_cur_amt_p, row);
	}


	/**
	 * Tax included result amount (Tax currency) 納税通貨実績税込金額.<p>
	 *
	 */
	public MCNumber ref_ptax_cur_inc_tax_amt() {
		return getConstNumber(offset + 85, $ref_ptax_cur_inc_tax_amt);
	}

	/**
	 * Tax included result amount (Tax currency) 納税通貨実績税込金額.<p>
	 *
	 */
	public void ref_ptax_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 85, $ref_ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included result amount (Tax currency) 納税通貨実績税込金額.<p>
	 *
	 */
	public void ref_ptax_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 85, $ref_ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included result amount (Tax currency) 納税通貨実績税込金額.<p>
	 *
	 */
	public void ref_ptax_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 85, $ref_ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included result amount (Tax currency) 納税通貨実績税込金額.<p>
	 *
	 */
	public void ref_ptax_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 85, $ref_ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included result amount (Tax currency) 納税通貨実績税込金額.<p>
	 *
	 */
	public void ref_ptax_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 85, $ref_ptax_cur_inc_tax_amt, value);
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


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber itm_bill_crryovr_times() {
		return getConstNumber(offset + 87, $itm_bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void itm_bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 87, $itm_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void itm_bill_crryovr_times(int value) {
		setConstNumber(offset + 87, $itm_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void itm_bill_crryovr_times(long value) {
		setConstNumber(offset + 87, $itm_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void itm_bill_crryovr_times(float value) {
		setConstNumber(offset + 87, $itm_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void itm_bill_crryovr_times(double value) {
		setConstNumber(offset + 87, $itm_bill_crryovr_times, value);
	}


	public String getString(String name) {
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
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
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
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
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
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
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			return sls_act_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($ref_sls_act_no.equalsIgnoreCase(name)) {
			return ref_sls_act_no();
		}
		if ($ref_sls_act_d_no.equalsIgnoreCase(name)) {
			return ref_sls_act_d_no();
		}
		if ($ref_trd_unit_cd.equalsIgnoreCase(name)) {
			return ref_trd_unit_cd();
		}
		if ($ref_trd_unit_nm.equalsIgnoreCase(name)) {
			return ref_trd_unit_nm();
		}
		if ($ref_tax_cd.equalsIgnoreCase(name)) {
			return ref_tax_cd();
		}
		if ($ref_tax_nm.equalsIgnoreCase(name)) {
			return ref_tax_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			return sls_act_seq();
		}
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			return sls_act_d_seq();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($ref_sls_act_rev.equalsIgnoreCase(name)) {
			return ref_sls_act_rev();
		}
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			return ref_sls_act_seq();
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			return ref_sls_act_d_seq();
		}
		if ($ref_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return ref_trd_unit_dec_place();
		}
		if ($ref_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return ref_trd_cur_inc_tax_amt();
		}
		if ($ref_tax_rate.equalsIgnoreCase(name)) {
			return ref_tax_rate();
		}
		if ($ref_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return ref_base_cur_inc_tax_amt();
		}
		if ($ref_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return ref_ptax_cur_inc_tax_amt();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			return itm_bill_crryovr_times();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($base_sls_ac_dt.equalsIgnoreCase(name)) {
			return base_sls_ac_dt();
		}
		if ($ref_ac_dt.equalsIgnoreCase(name)) {
			return ref_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
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
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
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
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
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
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			return sls_act_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($ref_sls_act_no.equalsIgnoreCase(name)) {
			return ref_sls_act_no();
		}
		if ($ref_sls_act_d_no.equalsIgnoreCase(name)) {
			return ref_sls_act_d_no();
		}
		if ($ref_trd_unit_cd.equalsIgnoreCase(name)) {
			return ref_trd_unit_cd();
		}
		if ($ref_trd_unit_nm.equalsIgnoreCase(name)) {
			return ref_trd_unit_nm();
		}
		if ($ref_tax_cd.equalsIgnoreCase(name)) {
			return ref_tax_cd();
		}
		if ($ref_tax_nm.equalsIgnoreCase(name)) {
			return ref_tax_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			return sls_act_seq();
		}
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			return sls_act_d_seq();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($ref_sls_act_rev.equalsIgnoreCase(name)) {
			return ref_sls_act_rev();
		}
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			return ref_sls_act_seq();
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			return ref_sls_act_d_seq();
		}
		if ($ref_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return ref_trd_unit_dec_place();
		}
		if ($ref_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return ref_trd_cur_inc_tax_amt();
		}
		if ($ref_tax_rate.equalsIgnoreCase(name)) {
			return ref_tax_rate();
		}
		if ($ref_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return ref_base_cur_inc_tax_amt();
		}
		if ($ref_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return ref_ptax_cur_inc_tax_amt();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			return itm_bill_crryovr_times();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($base_sls_ac_dt.equalsIgnoreCase(name)) {
			return base_sls_ac_dt();
		}
		if ($ref_ac_dt.equalsIgnoreCase(name)) {
			return ref_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			sublot_no_typ(value);
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
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			dscnt_rsn_nm(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
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
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			sls_act_d_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($ref_sls_act_no.equalsIgnoreCase(name)) {
			ref_sls_act_no(value);
			return;
		}
		if ($ref_sls_act_d_no.equalsIgnoreCase(name)) {
			ref_sls_act_d_no(value);
			return;
		}
		if ($ref_trd_unit_cd.equalsIgnoreCase(name)) {
			ref_trd_unit_cd(value);
			return;
		}
		if ($ref_trd_unit_nm.equalsIgnoreCase(name)) {
			ref_trd_unit_nm(value);
			return;
		}
		if ($ref_tax_cd.equalsIgnoreCase(name)) {
			ref_tax_cd(value);
			return;
		}
		if ($ref_tax_nm.equalsIgnoreCase(name)) {
			ref_tax_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($ref_sls_act_rev.equalsIgnoreCase(name)) {
			ref_sls_act_rev(value);
			return;
		}
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			ref_sls_act_seq(value);
			return;
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			ref_sls_act_d_seq(value);
			return;
		}
		if ($ref_trd_unit_dec_place.equalsIgnoreCase(name)) {
			ref_trd_unit_dec_place(value);
			return;
		}
		if ($ref_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ref_tax_rate.equalsIgnoreCase(name)) {
			ref_tax_rate(value);
			return;
		}
		if ($ref_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_base_cur_inc_tax_amt(value);
			return;
		}
		if ($ref_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($ref_sls_act_rev.equalsIgnoreCase(name)) {
			ref_sls_act_rev(value);
			return;
		}
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			ref_sls_act_seq(value);
			return;
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			ref_sls_act_d_seq(value);
			return;
		}
		if ($ref_trd_unit_dec_place.equalsIgnoreCase(name)) {
			ref_trd_unit_dec_place(value);
			return;
		}
		if ($ref_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ref_tax_rate.equalsIgnoreCase(name)) {
			ref_tax_rate(value);
			return;
		}
		if ($ref_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_base_cur_inc_tax_amt(value);
			return;
		}
		if ($ref_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($ref_sls_act_rev.equalsIgnoreCase(name)) {
			ref_sls_act_rev(value);
			return;
		}
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			ref_sls_act_seq(value);
			return;
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			ref_sls_act_d_seq(value);
			return;
		}
		if ($ref_trd_unit_dec_place.equalsIgnoreCase(name)) {
			ref_trd_unit_dec_place(value);
			return;
		}
		if ($ref_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ref_tax_rate.equalsIgnoreCase(name)) {
			ref_tax_rate(value);
			return;
		}
		if ($ref_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_base_cur_inc_tax_amt(value);
			return;
		}
		if ($ref_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($ref_sls_act_rev.equalsIgnoreCase(name)) {
			ref_sls_act_rev(value);
			return;
		}
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			ref_sls_act_seq(value);
			return;
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			ref_sls_act_d_seq(value);
			return;
		}
		if ($ref_trd_unit_dec_place.equalsIgnoreCase(name)) {
			ref_trd_unit_dec_place(value);
			return;
		}
		if ($ref_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ref_tax_rate.equalsIgnoreCase(name)) {
			ref_tax_rate(value);
			return;
		}
		if ($ref_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_base_cur_inc_tax_amt(value);
			return;
		}
		if ($ref_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($ref_sls_act_rev.equalsIgnoreCase(name)) {
			ref_sls_act_rev(value);
			return;
		}
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			ref_sls_act_seq(value);
			return;
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			ref_sls_act_d_seq(value);
			return;
		}
		if ($ref_trd_unit_dec_place.equalsIgnoreCase(name)) {
			ref_trd_unit_dec_place(value);
			return;
		}
		if ($ref_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ref_tax_rate.equalsIgnoreCase(name)) {
			ref_tax_rate(value);
			return;
		}
		if ($ref_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_base_cur_inc_tax_amt(value);
			return;
		}
		if ($ref_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($base_sls_ac_dt.equalsIgnoreCase(name)) {
			base_sls_ac_dt(value);
			return;
		}
		if ($ref_ac_dt.equalsIgnoreCase(name)) {
			ref_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			sublot_no_typ(value);
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
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			dscnt_rsn_nm(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
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
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			sls_act_d_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($ref_sls_act_no.equalsIgnoreCase(name)) {
			ref_sls_act_no(value);
			return;
		}
		if ($ref_sls_act_d_no.equalsIgnoreCase(name)) {
			ref_sls_act_d_no(value);
			return;
		}
		if ($ref_trd_unit_cd.equalsIgnoreCase(name)) {
			ref_trd_unit_cd(value);
			return;
		}
		if ($ref_trd_unit_nm.equalsIgnoreCase(name)) {
			ref_trd_unit_nm(value);
			return;
		}
		if ($ref_tax_cd.equalsIgnoreCase(name)) {
			ref_tax_cd(value);
			return;
		}
		if ($ref_tax_nm.equalsIgnoreCase(name)) {
			ref_tax_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($ref_sls_act_rev.equalsIgnoreCase(name)) {
			ref_sls_act_rev(value);
			return;
		}
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			ref_sls_act_seq(value);
			return;
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			ref_sls_act_d_seq(value);
			return;
		}
		if ($ref_trd_unit_dec_place.equalsIgnoreCase(name)) {
			ref_trd_unit_dec_place(value);
			return;
		}
		if ($ref_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ref_tax_rate.equalsIgnoreCase(name)) {
			ref_tax_rate(value);
			return;
		}
		if ($ref_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_base_cur_inc_tax_amt(value);
			return;
		}
		if ($ref_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($ref_sls_act_rev.equalsIgnoreCase(name)) {
			ref_sls_act_rev(value);
			return;
		}
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			ref_sls_act_seq(value);
			return;
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			ref_sls_act_d_seq(value);
			return;
		}
		if ($ref_trd_unit_dec_place.equalsIgnoreCase(name)) {
			ref_trd_unit_dec_place(value);
			return;
		}
		if ($ref_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ref_tax_rate.equalsIgnoreCase(name)) {
			ref_tax_rate(value);
			return;
		}
		if ($ref_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_base_cur_inc_tax_amt(value);
			return;
		}
		if ($ref_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($ref_sls_act_rev.equalsIgnoreCase(name)) {
			ref_sls_act_rev(value);
			return;
		}
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			ref_sls_act_seq(value);
			return;
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			ref_sls_act_d_seq(value);
			return;
		}
		if ($ref_trd_unit_dec_place.equalsIgnoreCase(name)) {
			ref_trd_unit_dec_place(value);
			return;
		}
		if ($ref_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ref_tax_rate.equalsIgnoreCase(name)) {
			ref_tax_rate(value);
			return;
		}
		if ($ref_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_base_cur_inc_tax_amt(value);
			return;
		}
		if ($ref_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($ref_sls_act_rev.equalsIgnoreCase(name)) {
			ref_sls_act_rev(value);
			return;
		}
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			ref_sls_act_seq(value);
			return;
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			ref_sls_act_d_seq(value);
			return;
		}
		if ($ref_trd_unit_dec_place.equalsIgnoreCase(name)) {
			ref_trd_unit_dec_place(value);
			return;
		}
		if ($ref_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ref_tax_rate.equalsIgnoreCase(name)) {
			ref_tax_rate(value);
			return;
		}
		if ($ref_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_base_cur_inc_tax_amt(value);
			return;
		}
		if ($ref_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($ref_sls_act_rev.equalsIgnoreCase(name)) {
			ref_sls_act_rev(value);
			return;
		}
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			ref_sls_act_seq(value);
			return;
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			ref_sls_act_d_seq(value);
			return;
		}
		if ($ref_trd_unit_dec_place.equalsIgnoreCase(name)) {
			ref_trd_unit_dec_place(value);
			return;
		}
		if ($ref_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ref_tax_rate.equalsIgnoreCase(name)) {
			ref_tax_rate(value);
			return;
		}
		if ($ref_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_base_cur_inc_tax_amt(value);
			return;
		}
		if ($ref_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ref_ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($base_sls_ac_dt.equalsIgnoreCase(name)) {
			base_sls_ac_dt(value);
			return;
		}
		if ($ref_ac_dt.equalsIgnoreCase(name)) {
			ref_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
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
		if ($trd_cur_upri_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_upri_amt_p();
		}
		if ($base_cur_upri_p.equalsIgnoreCase(name)) {
			return base_cur_upri_p();
		}
		if ($base_cur_amt_p.equalsIgnoreCase(name)) {
			return base_cur_amt_p();
		}
		if ($base_cur_tax_amt_p.equalsIgnoreCase(name)) {
			return base_cur_tax_amt_p();
		}
		if ($base_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			return base_cur_inc_tax_amt_p();
		}
		if ($ptax_cur_upri_p.equalsIgnoreCase(name)) {
			return ptax_cur_upri_p();
		}
		if ($ptax_cur_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_amt_p();
		}
		if ($ptax_cur_tax_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_tax_amt_p();
		}
		if ($ptax_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_inc_tax_amt_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($lot_no_p.equalsIgnoreCase(name)) {
			return lot_no_p();
		}
		if ($wtax_amt_p.equalsIgnoreCase(name)) {
			return wtax_amt_p();
		}
		if ($ref_trd_unit_qty_p.equalsIgnoreCase(name)) {
			return ref_trd_unit_qty_p();
		}
		if ($ref_trd_cur_upri_p.equalsIgnoreCase(name)) {
			return ref_trd_cur_upri_p();
		}
		if ($ref_trd_cur_amt_p.equalsIgnoreCase(name)) {
			return ref_trd_cur_amt_p();
		}
		if ($ref_base_cur_upri_p.equalsIgnoreCase(name)) {
			return ref_base_cur_upri_p();
		}
		if ($ref_base_cur_amt_p.equalsIgnoreCase(name)) {
			return ref_base_cur_amt_p();
		}
		if ($ref_ptax_cur_upri_p.equalsIgnoreCase(name)) {
			return ref_ptax_cur_upri_p();
		}
		if ($ref_ptax_cur_amt_p.equalsIgnoreCase(name)) {
			return ref_ptax_cur_amt_p();
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
		if ($trd_cur_upri_amt_p.equalsIgnoreCase(name)) {
			trd_cur_upri_amt_p(
				((MCContainerMeta) trd_cur_upri_amt_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.class, value)
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
		if ($base_cur_tax_amt_p.equalsIgnoreCase(name)) {
			base_cur_tax_amt_p(
				((MCContainerMeta) base_cur_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt_p(
				((MCContainerMeta) base_cur_inc_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ptax_cur_upri_p.equalsIgnoreCase(name)) {
			ptax_cur_upri_p(
				((MCContainerMeta) ptax_cur_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($ptax_cur_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_amt_p(
				((MCContainerMeta) ptax_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ptax_cur_tax_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt_p(
				((MCContainerMeta) ptax_cur_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ptax_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt_p(
				((MCContainerMeta) ptax_cur_inc_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($lot_no_p.equalsIgnoreCase(name)) {
			lot_no_p(
				((MCContainerMeta) lot_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5030.LotNoR.class, value)
			);
			return;
		}
		if ($wtax_amt_p.equalsIgnoreCase(name)) {
			wtax_amt_p(
				((MCContainerMeta) wtax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ref_trd_unit_qty_p.equalsIgnoreCase(name)) {
			ref_trd_unit_qty_p(
				((MCContainerMeta) ref_trd_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($ref_trd_cur_upri_p.equalsIgnoreCase(name)) {
			ref_trd_cur_upri_p(
				((MCContainerMeta) ref_trd_cur_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($ref_trd_cur_amt_p.equalsIgnoreCase(name)) {
			ref_trd_cur_amt_p(
				((MCContainerMeta) ref_trd_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ref_base_cur_upri_p.equalsIgnoreCase(name)) {
			ref_base_cur_upri_p(
				((MCContainerMeta) ref_base_cur_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($ref_base_cur_amt_p.equalsIgnoreCase(name)) {
			ref_base_cur_amt_p(
				((MCContainerMeta) ref_base_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ref_ptax_cur_upri_p.equalsIgnoreCase(name)) {
			ref_ptax_cur_upri_p(
				((MCContainerMeta) ref_ptax_cur_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($ref_ptax_cur_amt_p.equalsIgnoreCase(name)) {
			ref_ptax_cur_amt_p(
				((MCContainerMeta) ref_ptax_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
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
		return trd_cur_upri_amt_p().upri_not_tgt_flg();
	}

	public void upri_not_tgt_flg(boolean value) {
		trd_cur_upri_amt_p().upri_not_tgt_flg(value);
	}

	public MCNumber trd_cur_upri() {
		return trd_cur_upri_amt_p().trd_cur_upri();
	}

	public void trd_cur_upri(MCNumber value) {
		trd_cur_upri_amt_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(int value) {
		trd_cur_upri_amt_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(long value) {
		trd_cur_upri_amt_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(float value) {
		trd_cur_upri_amt_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(double value) {
		trd_cur_upri_amt_p().trd_cur_upri(value);
	}

	public boolean interim_flg() {
		return trd_cur_upri_amt_p().interim_flg();
	}

	public void interim_flg(boolean value) {
		trd_cur_upri_amt_p().interim_flg(value);
	}

	public MCNumber trd_cur_amt() {
		return trd_cur_upri_amt_p().trd_cur_amt();
	}

	public void trd_cur_amt(MCNumber value) {
		trd_cur_upri_amt_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(int value) {
		trd_cur_upri_amt_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(long value) {
		trd_cur_upri_amt_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(float value) {
		trd_cur_upri_amt_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(double value) {
		trd_cur_upri_amt_p().trd_cur_amt(value);
	}

	public MCNumber trd_cur_inc_tax_amt() {
		return trd_cur_upri_amt_p().trd_cur_inc_tax_amt();
	}

	public void trd_cur_inc_tax_amt(MCNumber value) {
		trd_cur_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(int value) {
		trd_cur_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(long value) {
		trd_cur_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(float value) {
		trd_cur_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(double value) {
		trd_cur_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public boolean tax_fix_flg() {
		return trd_cur_upri_amt_p().tax_fix_flg();
	}

	public void tax_fix_flg(boolean value) {
		trd_cur_upri_amt_p().tax_fix_flg(value);
	}

	public String tax_cd() {
		return trd_cur_upri_amt_p().tax_cd();
	}

	public void tax_cd(String value) {
		trd_cur_upri_amt_p().tax_cd(value);
	}

	public String tax_nm() {
		return trd_cur_upri_amt_p().tax_nm();
	}

	public void tax_nm(String value) {
		trd_cur_upri_amt_p().tax_nm(value);
	}

	public MCNumber tax_rate() {
		return trd_cur_upri_amt_p().tax_rate();
	}

	public void tax_rate(MCNumber value) {
		trd_cur_upri_amt_p().tax_rate(value);
	}

	public void tax_rate(int value) {
		trd_cur_upri_amt_p().tax_rate(value);
	}

	public void tax_rate(long value) {
		trd_cur_upri_amt_p().tax_rate(value);
	}

	public void tax_rate(float value) {
		trd_cur_upri_amt_p().tax_rate(value);
	}

	public void tax_rate(double value) {
		trd_cur_upri_amt_p().tax_rate(value);
	}

	public String tax_typ() {
		return trd_cur_upri_amt_p().tax_typ();
	}

	public void tax_typ(String value) {
		trd_cur_upri_amt_p().tax_typ(value);
	}

	public boolean inc_tax_flg() {
		return trd_cur_upri_amt_p().inc_tax_flg();
	}

	public void inc_tax_flg(boolean value) {
		trd_cur_upri_amt_p().inc_tax_flg(value);
	}

	public MCNumber trd_cur_tax_amt() {
		return trd_cur_upri_amt_p().trd_cur_tax_amt();
	}

	public void trd_cur_tax_amt(MCNumber value) {
		trd_cur_upri_amt_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(int value) {
		trd_cur_upri_amt_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(long value) {
		trd_cur_upri_amt_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(float value) {
		trd_cur_upri_amt_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(double value) {
		trd_cur_upri_amt_p().trd_cur_tax_amt(value);
	}

	public MCNumber trd_cur_dscnt_amt() {
		return trd_cur_upri_amt_p().trd_cur_dscnt_amt();
	}

	public void trd_cur_dscnt_amt(MCNumber value) {
		trd_cur_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(int value) {
		trd_cur_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(long value) {
		trd_cur_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(float value) {
		trd_cur_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(double value) {
		trd_cur_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return base_cur_upri_p().upri();
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return base_cur_amt_p().amt();
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return base_cur_tax_amt_p().amt();
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public MCNumber base_cur_inc_tax_amt() {
		return base_cur_inc_tax_amt_p().amt();
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(MCNumber value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(int value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(long value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(float value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(double value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public MCNumber ptax_cur_upri() {
		return ptax_cur_upri_p().upri();
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(MCNumber value) {
		ptax_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(int value) {
		ptax_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(long value) {
		ptax_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(float value) {
		ptax_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(double value) {
		ptax_cur_upri_p().upri(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return ptax_cur_amt_p().amt();
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		ptax_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		ptax_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		ptax_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		ptax_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		ptax_cur_amt_p().amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public MCNumber ptax_cur_tax_amt() {
		return ptax_cur_tax_amt_p().amt();
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(MCNumber value) {
		ptax_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(int value) {
		ptax_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(long value) {
		ptax_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(float value) {
		ptax_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(double value) {
		ptax_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public MCNumber ptax_cur_inc_tax_amt() {
		return ptax_cur_inc_tax_amt_p().amt();
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(MCNumber value) {
		ptax_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(int value) {
		ptax_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(long value) {
		ptax_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(float value) {
		ptax_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(double value) {
		ptax_cur_inc_tax_amt_p().amt(value);
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

	public boolean crt_lot_flg() {
		return lot_no_p().crt_lot_flg();
	}

	public void crt_lot_flg(boolean value) {
		lot_no_p().crt_lot_flg(value);
	}

	public String lot_no() {
		return lot_no_p().lot_no();
	}

	public void lot_no(String value) {
		lot_no_p().lot_no(value);
	}

	public String sublot_no() {
		return lot_no_p().sublot_no();
	}

	public void sublot_no(String value) {
		lot_no_p().sublot_no(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return wtax_amt_p().amt();
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		wtax_amt_p().amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		wtax_amt_p().amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		wtax_amt_p().amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		wtax_amt_p().amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		wtax_amt_p().amt(value);
	}

	/**
	 * Result qty. 実績数量.<p>
	 *
	 */
	public MCNumber ref_trd_unit_qty() {
		return ref_trd_unit_qty_p().qty();
	}

	/**
	 * Result qty. 実績数量.<p>
	 *
	 */
	public void ref_trd_unit_qty(MCNumber value) {
		ref_trd_unit_qty_p().qty(value);
	}

	/**
	 * Result qty. 実績数量.<p>
	 *
	 */
	public void ref_trd_unit_qty(int value) {
		ref_trd_unit_qty_p().qty(value);
	}

	/**
	 * Result qty. 実績数量.<p>
	 *
	 */
	public void ref_trd_unit_qty(long value) {
		ref_trd_unit_qty_p().qty(value);
	}

	/**
	 * Result qty. 実績数量.<p>
	 *
	 */
	public void ref_trd_unit_qty(float value) {
		ref_trd_unit_qty_p().qty(value);
	}

	/**
	 * Result qty. 実績数量.<p>
	 *
	 */
	public void ref_trd_unit_qty(double value) {
		ref_trd_unit_qty_p().qty(value);
	}

	/**
	 * Result unit price 実績単価.<p>
	 *
	 */
	public MCNumber ref_trd_cur_upri() {
		return ref_trd_cur_upri_p().upri();
	}

	/**
	 * Result unit price 実績単価.<p>
	 *
	 */
	public void ref_trd_cur_upri(MCNumber value) {
		ref_trd_cur_upri_p().upri(value);
	}

	/**
	 * Result unit price 実績単価.<p>
	 *
	 */
	public void ref_trd_cur_upri(int value) {
		ref_trd_cur_upri_p().upri(value);
	}

	/**
	 * Result unit price 実績単価.<p>
	 *
	 */
	public void ref_trd_cur_upri(long value) {
		ref_trd_cur_upri_p().upri(value);
	}

	/**
	 * Result unit price 実績単価.<p>
	 *
	 */
	public void ref_trd_cur_upri(float value) {
		ref_trd_cur_upri_p().upri(value);
	}

	/**
	 * Result unit price 実績単価.<p>
	 *
	 */
	public void ref_trd_cur_upri(double value) {
		ref_trd_cur_upri_p().upri(value);
	}

	/**
	 * Result amount 実績金額.<p>
	 *
	 */
	public MCNumber ref_trd_cur_amt() {
		return ref_trd_cur_amt_p().amt();
	}

	/**
	 * Result amount 実績金額.<p>
	 *
	 */
	public void ref_trd_cur_amt(MCNumber value) {
		ref_trd_cur_amt_p().amt(value);
	}

	/**
	 * Result amount 実績金額.<p>
	 *
	 */
	public void ref_trd_cur_amt(int value) {
		ref_trd_cur_amt_p().amt(value);
	}

	/**
	 * Result amount 実績金額.<p>
	 *
	 */
	public void ref_trd_cur_amt(long value) {
		ref_trd_cur_amt_p().amt(value);
	}

	/**
	 * Result amount 実績金額.<p>
	 *
	 */
	public void ref_trd_cur_amt(float value) {
		ref_trd_cur_amt_p().amt(value);
	}

	/**
	 * Result amount 実績金額.<p>
	 *
	 */
	public void ref_trd_cur_amt(double value) {
		ref_trd_cur_amt_p().amt(value);
	}

	/**
	 * Result tax amount 実績税金額.<p>
	 *
	 */
	public MCNumber ref_trd_cur_tax_amt() {
		return ref_trd_cur_amt_p().tax_amt();
	}

	/**
	 * Result tax amount 実績税金額.<p>
	 *
	 */
	public void ref_trd_cur_tax_amt(MCNumber value) {
		ref_trd_cur_amt_p().tax_amt(value);
	}

	/**
	 * Result tax amount 実績税金額.<p>
	 *
	 */
	public void ref_trd_cur_tax_amt(int value) {
		ref_trd_cur_amt_p().tax_amt(value);
	}

	/**
	 * Result tax amount 実績税金額.<p>
	 *
	 */
	public void ref_trd_cur_tax_amt(long value) {
		ref_trd_cur_amt_p().tax_amt(value);
	}

	/**
	 * Result tax amount 実績税金額.<p>
	 *
	 */
	public void ref_trd_cur_tax_amt(float value) {
		ref_trd_cur_amt_p().tax_amt(value);
	}

	/**
	 * Result tax amount 実績税金額.<p>
	 *
	 */
	public void ref_trd_cur_tax_amt(double value) {
		ref_trd_cur_amt_p().tax_amt(value);
	}

	/**
	 * Result unit price (Base currency) 基準通貨実績単価.<p>
	 *
	 */
	public MCNumber ref_base_cur_upri() {
		return ref_base_cur_upri_p().upri();
	}

	/**
	 * Result unit price (Base currency) 基準通貨実績単価.<p>
	 *
	 */
	public void ref_base_cur_upri(MCNumber value) {
		ref_base_cur_upri_p().upri(value);
	}

	/**
	 * Result unit price (Base currency) 基準通貨実績単価.<p>
	 *
	 */
	public void ref_base_cur_upri(int value) {
		ref_base_cur_upri_p().upri(value);
	}

	/**
	 * Result unit price (Base currency) 基準通貨実績単価.<p>
	 *
	 */
	public void ref_base_cur_upri(long value) {
		ref_base_cur_upri_p().upri(value);
	}

	/**
	 * Result unit price (Base currency) 基準通貨実績単価.<p>
	 *
	 */
	public void ref_base_cur_upri(float value) {
		ref_base_cur_upri_p().upri(value);
	}

	/**
	 * Result unit price (Base currency) 基準通貨実績単価.<p>
	 *
	 */
	public void ref_base_cur_upri(double value) {
		ref_base_cur_upri_p().upri(value);
	}

	/**
	 * Result amount (Base currency) 基準通貨実績金額.<p>
	 *
	 */
	public MCNumber ref_base_cur_amt() {
		return ref_base_cur_amt_p().amt();
	}

	/**
	 * Result amount (Base currency) 基準通貨実績金額.<p>
	 *
	 */
	public void ref_base_cur_amt(MCNumber value) {
		ref_base_cur_amt_p().amt(value);
	}

	/**
	 * Result amount (Base currency) 基準通貨実績金額.<p>
	 *
	 */
	public void ref_base_cur_amt(int value) {
		ref_base_cur_amt_p().amt(value);
	}

	/**
	 * Result amount (Base currency) 基準通貨実績金額.<p>
	 *
	 */
	public void ref_base_cur_amt(long value) {
		ref_base_cur_amt_p().amt(value);
	}

	/**
	 * Result amount (Base currency) 基準通貨実績金額.<p>
	 *
	 */
	public void ref_base_cur_amt(float value) {
		ref_base_cur_amt_p().amt(value);
	}

	/**
	 * Result amount (Base currency) 基準通貨実績金額.<p>
	 *
	 */
	public void ref_base_cur_amt(double value) {
		ref_base_cur_amt_p().amt(value);
	}

	/**
	 * Result tax amount (Base currency) 基準通貨実績税金額.<p>
	 *
	 */
	public MCNumber ref_base_cur_tax_amt() {
		return ref_base_cur_amt_p().tax_amt();
	}

	/**
	 * Result tax amount (Base currency) 基準通貨実績税金額.<p>
	 *
	 */
	public void ref_base_cur_tax_amt(MCNumber value) {
		ref_base_cur_amt_p().tax_amt(value);
	}

	/**
	 * Result tax amount (Base currency) 基準通貨実績税金額.<p>
	 *
	 */
	public void ref_base_cur_tax_amt(int value) {
		ref_base_cur_amt_p().tax_amt(value);
	}

	/**
	 * Result tax amount (Base currency) 基準通貨実績税金額.<p>
	 *
	 */
	public void ref_base_cur_tax_amt(long value) {
		ref_base_cur_amt_p().tax_amt(value);
	}

	/**
	 * Result tax amount (Base currency) 基準通貨実績税金額.<p>
	 *
	 */
	public void ref_base_cur_tax_amt(float value) {
		ref_base_cur_amt_p().tax_amt(value);
	}

	/**
	 * Result tax amount (Base currency) 基準通貨実績税金額.<p>
	 *
	 */
	public void ref_base_cur_tax_amt(double value) {
		ref_base_cur_amt_p().tax_amt(value);
	}

	/**
	 * Result unit price (Tax currency) 納税通貨実績単価.<p>
	 *
	 */
	public MCNumber ref_ptax_cur_upri() {
		return ref_ptax_cur_upri_p().upri();
	}

	/**
	 * Result unit price (Tax currency) 納税通貨実績単価.<p>
	 *
	 */
	public void ref_ptax_cur_upri(MCNumber value) {
		ref_ptax_cur_upri_p().upri(value);
	}

	/**
	 * Result unit price (Tax currency) 納税通貨実績単価.<p>
	 *
	 */
	public void ref_ptax_cur_upri(int value) {
		ref_ptax_cur_upri_p().upri(value);
	}

	/**
	 * Result unit price (Tax currency) 納税通貨実績単価.<p>
	 *
	 */
	public void ref_ptax_cur_upri(long value) {
		ref_ptax_cur_upri_p().upri(value);
	}

	/**
	 * Result unit price (Tax currency) 納税通貨実績単価.<p>
	 *
	 */
	public void ref_ptax_cur_upri(float value) {
		ref_ptax_cur_upri_p().upri(value);
	}

	/**
	 * Result unit price (Tax currency) 納税通貨実績単価.<p>
	 *
	 */
	public void ref_ptax_cur_upri(double value) {
		ref_ptax_cur_upri_p().upri(value);
	}

	/**
	 * Result amount (Tax currency) 納税通貨実績金額.<p>
	 *
	 */
	public MCNumber ref_ptax_cur_amt() {
		return ref_ptax_cur_amt_p().amt();
	}

	/**
	 * Result amount (Tax currency) 納税通貨実績金額.<p>
	 *
	 */
	public void ref_ptax_cur_amt(MCNumber value) {
		ref_ptax_cur_amt_p().amt(value);
	}

	/**
	 * Result amount (Tax currency) 納税通貨実績金額.<p>
	 *
	 */
	public void ref_ptax_cur_amt(int value) {
		ref_ptax_cur_amt_p().amt(value);
	}

	/**
	 * Result amount (Tax currency) 納税通貨実績金額.<p>
	 *
	 */
	public void ref_ptax_cur_amt(long value) {
		ref_ptax_cur_amt_p().amt(value);
	}

	/**
	 * Result amount (Tax currency) 納税通貨実績金額.<p>
	 *
	 */
	public void ref_ptax_cur_amt(float value) {
		ref_ptax_cur_amt_p().amt(value);
	}

	/**
	 * Result amount (Tax currency) 納税通貨実績金額.<p>
	 *
	 */
	public void ref_ptax_cur_amt(double value) {
		ref_ptax_cur_amt_p().amt(value);
	}

	/**
	 * Result tax amount (Tax currency) 納税通貨実績税金額.<p>
	 *
	 */
	public MCNumber ref_ptax_cur_tax_amt() {
		return ref_ptax_cur_amt_p().tax_amt();
	}

	/**
	 * Result tax amount (Tax currency) 納税通貨実績税金額.<p>
	 *
	 */
	public void ref_ptax_cur_tax_amt(MCNumber value) {
		ref_ptax_cur_amt_p().tax_amt(value);
	}

	/**
	 * Result tax amount (Tax currency) 納税通貨実績税金額.<p>
	 *
	 */
	public void ref_ptax_cur_tax_amt(int value) {
		ref_ptax_cur_amt_p().tax_amt(value);
	}

	/**
	 * Result tax amount (Tax currency) 納税通貨実績税金額.<p>
	 *
	 */
	public void ref_ptax_cur_tax_amt(long value) {
		ref_ptax_cur_amt_p().tax_amt(value);
	}

	/**
	 * Result tax amount (Tax currency) 納税通貨実績税金額.<p>
	 *
	 */
	public void ref_ptax_cur_tax_amt(float value) {
		ref_ptax_cur_amt_p().tax_amt(value);
	}

	/**
	 * Result tax amount (Tax currency) 納税通貨実績税金額.<p>
	 *
	 */
	public void ref_ptax_cur_tax_amt(double value) {
		ref_ptax_cur_amt_p().tax_amt(value);
	}

}

