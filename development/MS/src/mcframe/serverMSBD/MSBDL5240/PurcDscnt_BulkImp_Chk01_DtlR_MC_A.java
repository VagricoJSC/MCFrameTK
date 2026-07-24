package mcframe.serverMSBD.MSBDL5240;

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
 * ブロック"PurcDscnt_BulkImp_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PurcDscnt_BulkImp_Chk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
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
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public static final String $purc_usr_cd = "purc_usr_cd";
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_cd = "purc_dpt_cd";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * For I/V transaction Ｉ／Ｖ取引対象.<p>
	 *
	 */
	public static final String $sppl_iv_flg = "sppl_iv_flg";
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public static final String $psppl_cd = "psppl_cd";
	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $cred_cd = "cred_cd";
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public static final String $pay_spot_flg = "pay_spot_flg";
	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public static final String $purc_amt_rnd_typ = "purc_amt_rnd_typ";
	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public static final String $purc_tax_rnd_typ = "purc_tax_rnd_typ";
	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public static final String $purc_tax_calc_typ = "purc_tax_calc_typ";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public static final String $upri_dec_place = "upri_dec_place";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public static final String $ptax_cur_cd = "ptax_cur_cd";
	/**
	 * Tax amount number of decimal places 納税金額小数部有効桁数.<p>
	 *
	 */
	public static final String $ptax_cur_amt_dec_place = "ptax_cur_amt_dec_place";
	/**
	 * Tax unit price number of decimal places 納税単価小数部有効桁数.<p>
	 *
	 */
	public static final String $ptax_cur_upri_dec_place = "ptax_cur_upri_dec_place";
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public static final String $base_cur_amt_dec_place = "base_cur_amt_dec_place";
	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public static final String $base_cur_upri_dec_place = "base_cur_upri_dec_place";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $tterm_cd1 = "tterm_cd1";
	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public static final String $tterm_rmrks1 = "tterm_rmrks1";
	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $tterm_cd2 = "tterm_cd2";
	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public static final String $tterm_rmrks2 = "tterm_rmrks2";
	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $tterm_cd3 = "tterm_cd3";
	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public static final String $tterm_rmrks3 = "tterm_rmrks3";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public static final String $purc_dt = "purc_dt";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public static final String $pay_basis_dt = "pay_basis_dt";
	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public static final String $pay_schd_dt = "pay_schd_dt";
	/**
	 * Purchase I/V No. 受領Ｉ／ＶＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Corresponding receipt I/V No. 対応受領Ｉ／Ｖ　ＮＯ.<p>
	 *
	 */
	public static final String $ref_rcpt_iv_no = "ref_rcpt_iv_no";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public static final String $ptax_dt = "ptax_dt";
	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public static final String $ptax_xrate = "ptax_xrate";
	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public static final String $dtl_peg_no = "dtl_peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public static final String $dscnt_rsn_cd = "dscnt_rsn_cd";
	/**
	 * Purchase type 購買区分.<p>
	 *
	 */
	public static final String $purc_typ = "purc_typ";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
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
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public static final String $sppl_itm_cd = "sppl_itm_cd";
	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public static final String $sppl_itm_nm = "sppl_itm_nm";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public static final String $pack_flg = "pack_flg";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
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
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public static final String $tax_typ = "tax_typ";
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 * Details correction flg. 明細訂正ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_dtl_upd_flg = "purc_dtl_upd_flg";
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
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public static final String $base_cur_upri = "base_cur_upri";
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public static final String $base_cur_inc_tax_amt = "base_cur_inc_tax_amt";
	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public static final String $ptax_cur_upri = "ptax_cur_upri";
	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public static final String $ptax_cur_amt = "ptax_cur_amt";
	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public static final String $ptax_cur_tax_amt = "ptax_cur_tax_amt";
	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public static final String $ptax_cur_inc_tax_amt = "ptax_cur_inc_tax_amt";
	/**
	 * Withholding tax rate 源泉徴収税率.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	/**
	 * Withholding tax amount 源泉徴収税額.<p>
	 *
	 */
	public static final String $wtax_amt = "wtax_amt";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public static final String $pay_crryovr_times = "pay_crryovr_times";
	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public static final String $bd_itm_cd = "bd_itm_cd";
	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public static final String $bd_itm_sub1 = "bd_itm_sub1";
	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public static final String $bd_itm_sub2 = "bd_itm_sub2";
	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public static final String $bd_itm_sub3 = "bd_itm_sub3";
	/**
	 * Charged item name 負担品名.<p>
	 *
	 */
	public static final String $bd_itm_nm = "bd_itm_nm";
	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public static final String $bd_lot_mng_typ = "bd_lot_mng_typ";
	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public static final String $bd_sublot_mng_typ = "bd_sublot_mng_typ";
	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $bd_lot_no_typ = "bd_lot_no_typ";
	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $bd_sublot_no_typ = "bd_sublot_no_typ";
	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $bd_sno1_mng_typ = "bd_sno1_mng_typ";
	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $bd_sno2_mng_typ = "bd_sno2_mng_typ";
	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $bd_sno3_mng_typ = "bd_sno3_mng_typ";
	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public static final String $bd_sno4_mng_typ = "bd_sno4_mng_typ";
	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public static final String $bd_sno1 = "bd_sno1";
	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public static final String $bd_sno2 = "bd_sno2";
	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public static final String $bd_sno3 = "bd_sno3";
	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public static final String $bd_sno4 = "bd_sno4";
	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public static final String $bd_lot_no = "bd_lot_no";
	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public static final String $bd_sublot_no = "bd_sublot_no";
	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public static final String $bd_ctg_cd = "bd_ctg_cd";
	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public static final String $bd_oper_cd = "bd_oper_cd";
	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public static final String $bd_iv_no = "bd_iv_no";
	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public static final String $bd_loc_cd = "bd_loc_cd";
	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public static final String $bd_po_no = "bd_po_no";
	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public static final String $bd_slo_no = "bd_slo_no";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	/**
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public static final String $bd_wg_cd = "bd_wg_cd";
	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public static final String $bd_bp_cd = "bd_bp_cd";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_d_rmrks = "intr_d_rmrks";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public static final String $d_sub_char1 = "d_sub_char1";
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public static final String $d_sub_char2 = "d_sub_char2";
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public static final String $d_sub_char3 = "d_sub_char3";
	/**
	 * Reference purchase result No. 参照仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $ref_purc_act_no = "ref_purc_act_no";
	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public static final String $ref_purc_act_seq = "ref_purc_act_seq";
	/**
	 * Reference purchase result details No. 参照仕入実績明細ＮＯ.<p>
	 *
	 */
	public static final String $ref_purc_act_d_no = "ref_purc_act_d_no";
	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public static final String $ref_purc_act_d_seq = "ref_purc_act_d_seq";
	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public static final String $base_purc_ac_dt = "base_purc_ac_dt";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
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
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Withholding tax rounding type 源泉税額端数処理区分.<p>
	 *
	 */
	public static final String $wtax_rnd_typ = "wtax_rnd_typ";
	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public static final String $xrate_rnd_typ = "xrate_rnd_typ";
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta purc_usr_cd_META = createCommonMeta($purc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta purc_dpt_cd_META = createCommonMeta($purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_iv_flg_META = createCommonMeta($sppl_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cred_cd_META = createCommonMeta($cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta pay_spot_flg_META = createCommonMeta($pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_amt_rnd_typ_META = createCommonMeta($purc_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_rnd_typ_META = createCommonMeta($purc_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_calc_typ_META = createCommonMeta($purc_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta upri_dec_place_META = createCommonMeta($upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_cur_amt_dec_place_META = createCommonMeta($ptax_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_cur_upri_dec_place_META = createCommonMeta($ptax_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_amt_dec_place_META = createCommonMeta($base_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_upri_dec_place_META = createCommonMeta($base_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PO_INTR_RMRKS);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PO_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PO_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PO_SUB_CHAR3);
	public static final MCMeta purc_dt_META = createCommonMeta($purc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_basis_dt_META = createCommonMeta($pay_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_dt_META = createCommonMeta($pay_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta ref_rcpt_iv_no_META = createCommonMeta($ref_rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_dt_META = createCommonMeta($ptax_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ptax_xrate_META = createCommonMeta($ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dtl_peg_no_META = createCommonMeta($dtl_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dscnt_rsn_cd_META = createCommonMeta($dscnt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta purc_typ_META = createCommonMeta($purc_typ, mcframe.commonMA.meta.MA_META.PURC_TYP);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_flg_META = createCommonMeta($pack_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_typ_META = createCommonMeta($tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta purc_dtl_upd_flg_META = createCommonMeta($purc_dtl_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_upri_META = createCommonMeta($base_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_inc_tax_amt_META = createCommonMeta($base_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_upri_META = createCommonMeta($ptax_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_amt_META = createCommonMeta($ptax_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_tax_amt_META = createCommonMeta($ptax_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_inc_tax_amt_META = createCommonMeta($ptax_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_META = createCommonMeta($wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pay_crryovr_times_META = createCommonMeta($pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta bd_itm_cd_META = createCommonMeta($bd_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta bd_itm_sub1_META = createCommonMeta($bd_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta bd_itm_sub2_META = createCommonMeta($bd_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta bd_itm_sub3_META = createCommonMeta($bd_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta bd_itm_nm_META = createCommonMeta($bd_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta bd_lot_mng_typ_META = createCommonMeta($bd_lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta bd_sublot_mng_typ_META = createCommonMeta($bd_sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta bd_lot_no_typ_META = createCommonMeta($bd_lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta bd_sublot_no_typ_META = createCommonMeta($bd_sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta bd_sno1_mng_typ_META = createCommonMeta($bd_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno2_mng_typ_META = createCommonMeta($bd_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno3_mng_typ_META = createCommonMeta($bd_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno4_mng_typ_META = createCommonMeta($bd_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno1_META = createCommonMeta($bd_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta bd_sno2_META = createCommonMeta($bd_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta bd_sno3_META = createCommonMeta($bd_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta bd_sno4_META = createCommonMeta($bd_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta bd_lot_no_META = createCommonMeta($bd_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta bd_sublot_no_META = createCommonMeta($bd_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta bd_ctg_cd_META = createCommonMeta($bd_ctg_cd, mcframe.commonMA.meta.MA_META.COST_CTG_CD);
	public static final MCMeta bd_oper_cd_META = createCommonMeta($bd_oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta bd_iv_no_META = createCommonMeta($bd_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta bd_loc_cd_META = createCommonMeta($bd_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta bd_po_no_META = createCommonMeta($bd_po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta bd_slo_no_META = createCommonMeta($bd_slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_wg_cd_META = createCommonMeta($bd_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta bd_bp_cd_META = createCommonMeta($bd_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta intr_d_rmrks_META = createCommonMeta($intr_d_rmrks, mcframe.commonMS.meta.MS_META.PO_D_INTR_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta d_sub_char1_META = createCommonMeta($d_sub_char1, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR1);
	public static final MCMeta d_sub_char2_META = createCommonMeta($d_sub_char2, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR2);
	public static final MCMeta d_sub_char3_META = createCommonMeta($d_sub_char3, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR3);
	public static final MCMeta ref_purc_act_no_META = createCommonMeta($ref_purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta ref_purc_act_seq_META = createCommonMeta($ref_purc_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta ref_purc_act_d_no_META = createCommonMeta($ref_purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta ref_purc_act_d_seq_META = createCommonMeta($ref_purc_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta base_purc_ac_dt_META = createCommonMeta($base_purc_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta wtax_rnd_typ_META = createCommonMeta($wtax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta xrate_rnd_typ_META = createCommonMeta($xrate_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);

	protected static final ConstMetaList<PurcDscnt_BulkImp_Chk01_DtlR> constMetas = new ConstMetaList<PurcDscnt_BulkImp_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			trd_cd_META,
			trd_ptn_typ_META,
			purc_usr_cd_META,
			purc_dpt_cd_META,
			wg_cd_META,
			sppl_cd_META,
			sppl_iv_flg_META,
			asppl_cd_META,
			bsppl_cd_META,
			psppl_cd_META,
			cred_cd_META,
			pay_spot_flg_META,
			purc_amt_rnd_typ_META,
			purc_tax_rnd_typ_META,
			purc_tax_calc_typ_META,
			trd_cur_cd_META,
			upri_dec_place_META,
			amt_dec_place_META,
			ptax_cur_cd_META,
			ptax_cur_amt_dec_place_META,
			ptax_cur_upri_dec_place_META,
			base_cur_cd_META,
			base_cur_amt_dec_place_META,
			base_cur_upri_dec_place_META,
			trd_rmrks_META,
			intr_rmrks_META,
			tterm_cd1_META,
			tterm_rmrks1_META,
			tterm_cd2_META,
			tterm_rmrks2_META,
			tterm_cd3_META,
			tterm_rmrks3_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			purc_dt_META,
			ac_dt_META,
			pay_basis_dt_META,
			pay_schd_dt_META,
			rcpt_iv_no_META,
			ref_rcpt_iv_no_META,
			xrate_cd_META,
			xrate_META,
			ptax_dt_META,
			ptax_xrate_META,
			dtl_peg_no_META,
			data_crud_typ_META,
			err_flg_META,
			dscnt_rsn_cd_META,
			purc_typ_META,
			mfg_inst_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			dscnt_itm_flg_META,
			iv_itm_nm_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			sundry_itm_flg_META,
			stk_mng_typ_META,
			trd_unit_cd_META,
			trd_unit_qty_META,
			trd_unit_dec_place_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			pack_flg_META,
			base_unit_cd_META,
			base_unit_qty_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			tax_cd_META,
			inc_tax_flg_META,
			tax_typ_META,
			tax_rate_META,
			purc_dtl_upd_flg_META,
			trd_cur_upri_META,
			trd_cur_amt_META,
			trd_cur_tax_amt_META,
			base_cur_upri_META,
			base_cur_amt_META,
			base_cur_tax_amt_META,
			base_cur_inc_tax_amt_META,
			ptax_cur_upri_META,
			ptax_cur_amt_META,
			ptax_cur_tax_amt_META,
			ptax_cur_inc_tax_amt_META,
			wtax_rate_META,
			wtax_amt_META,
			maker_cd_META,
			ap_dpt_cd_META,
			pay_crryovr_times_META,
			bd_itm_cd_META,
			bd_itm_sub1_META,
			bd_itm_sub2_META,
			bd_itm_sub3_META,
			bd_itm_nm_META,
			bd_lot_mng_typ_META,
			bd_sublot_mng_typ_META,
			bd_lot_no_typ_META,
			bd_sublot_no_typ_META,
			bd_sno1_mng_typ_META,
			bd_sno2_mng_typ_META,
			bd_sno3_mng_typ_META,
			bd_sno4_mng_typ_META,
			bd_sno1_META,
			bd_sno2_META,
			bd_sno3_META,
			bd_sno4_META,
			bd_lot_no_META,
			bd_sublot_no_META,
			bd_ctg_cd_META,
			bd_oper_cd_META,
			bd_iv_no_META,
			bd_loc_cd_META,
			bd_po_no_META,
			bd_slo_no_META,
			asset_mng_typ_META,
			bd_dpt_cd_META,
			bd_wg_cd_META,
			bd_bp_cd_META,
			intr_d_rmrks_META,
			trd_d_rmrks_META,
			d_sub_char1_META,
			d_sub_char2_META,
			d_sub_char3_META,
			ref_purc_act_no_META,
			ref_purc_act_seq_META,
			ref_purc_act_d_no_META,
			ref_purc_act_d_seq_META,
			base_purc_ac_dt_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			lot_no_META,
			sublot_no_META,
			po_no_META,
			slo_no_META,
			disp_seq_META,
			wtax_rnd_typ_META,
			xrate_rnd_typ_META,
			prnt_lcl_cd_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
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
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$trd_cd, "E"},	// trd_cd
				{$sppl_cd, "E"},	// sppl_cd
				{$trd_cur_cd, "E"},	// trd_cur_cd
				{$purc_dt, "E"},	// purc_dt
				{$ac_dt, "E"},	// ac_dt
				{$dscnt_rsn_cd, "E"},	// dscnt_rsn_cd
				{$purc_typ, "E"},	// purc_typ
				{$itm_cd, "E"},	// itm_cd
				{$tax_cd, "E"},	// tax_cd
				{$trd_cur_upri, "E"},	// trd_cur_upri
				{$maker_cd, "E"},	// maker_cd
				{$ap_dpt_cd, "E"},	// ap_dpt_cd
				{$pay_crryovr_times, "E"},	// pay_crryovr_times
				{$bd_dpt_cd, "E"},	// bd_dpt_cd
				{$base_purc_ac_dt, "E"}	// base_purc_ac_dt
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$xrate, "positive"},	// xrate
				{$ptax_xrate, "positive"},	// ptax_xrate
				{$trd_unit_qty, "positive"}	// trd_unit_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$trd_cur_upri, "0:"},	// trd_cur_upri
				{$pay_crryovr_times, "0:"}	// pay_crryovr_times
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
				{$purc_dt, "bfToday"},	// purc_dt
				{$ac_dt, "bfToday"},	// ac_dt
				{$base_purc_ac_dt, "bfToday"}	// base_purc_ac_dt
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$purc_dt, "pay_basis_dt:BF"},	// purc_dt
				{$pay_basis_dt, "pay_basis_dt:AF,pay_schd_dt:BF"},	// pay_basis_dt
				{$pay_schd_dt, "pay_schd_dt:AF"}	// pay_schd_dt
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$trd_cd, "MA.MAUAL0010.Trd"},	// trd_cd
				{$purc_usr_cd, "MA.MAUAL0010.Usr"},	// purc_usr_cd
				{$purc_dpt_cd, "MA.MAUAL0010.Dpt"},	// purc_dpt_cd
				{$sppl_cd, "MA.MAUAL0010.Bp"},	// sppl_cd
				{$asppl_cd, "MA.MAUAL0010.Bp"},	// asppl_cd
				{$bsppl_cd, "MA.MAUAL0010.Bp"},	// bsppl_cd
				{$psppl_cd, "MA.MAUAL0010.Bp"},	// psppl_cd
				{$cred_cd, "MA.MAUAL0010.Bp"},	// cred_cd
				{$trd_cur_cd, "MA.MAUAL0010.Cur"},	// trd_cur_cd
				{$ptax_cur_cd, "MA.MAUAL0010.Cur"},	// ptax_cur_cd
				{$base_cur_cd, "MA.MAUAL0010.Cur"},	// base_cur_cd
				{$tterm_cd1, "MA.MAUAL0010.Tterm1"},	// tterm_cd1
				{$tterm_cd2, "MA.MAUAL0010.Tterm2"},	// tterm_cd2
				{$tterm_cd3, "MA.MAUAL0010.Tterm3"},	// tterm_cd3
				{$dscnt_rsn_cd, "MA.MAUAL0010.PurcDscntBizRsn"},	// dscnt_rsn_cd
				{$mfg_inst_no, "MS.MSUAL0040.MfgInstNo"},	// mfg_inst_no
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$trd_unit_cd, "MA.MAUAL0010.ItmUnit"},	// trd_unit_cd
				{$tax_cd, "MA.MAUAL0010.PurcTax"},	// tax_cd
				{$maker_cd, "MA.MAUAL0010.Bp"},	// maker_cd
				{$ap_dpt_cd, "MA.MAUAL0010.Dpt"},	// ap_dpt_cd
				{$bd_itm_sub3, "MA.MAUAL0010.ItmSub3"},	// bd_itm_sub3
				{$bd_ctg_cd, "MA.MAUAL0010.CostCtg"},	// bd_ctg_cd
				{$bd_oper_cd, "MA.MAUAL0010.Oper"},	// bd_oper_cd
				{$bd_loc_cd, "MA.MAUAL0010.Loc"},	// bd_loc_cd
				{$bd_dpt_cd, "MA.MAUAL0010.Dpt"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$trd_cd, "trd_ptn_typ"},	// trd_cd
				{$purc_dpt_cd, "wg_cd"},	// purc_dpt_cd
				{$sppl_cd, "sppl_iv_flg;asppl_cd;purc_amt_rnd_typ;purc_tax_rnd_typ;purc_tax_calc_typ;prnt_lcl_cd"},	// sppl_cd
				{$asppl_cd, "bsppl_cd"},	// asppl_cd
				{$bsppl_cd, "psppl_cd;pay_spot_flg;cred_cd"},	// bsppl_cd
				{$trd_cur_cd, "upri_dec_place;amt_dec_place"},	// trd_cur_cd
				{$ptax_cur_cd, "ptax_cur_amt_dec_place;ptax_cur_upri_dec_place"},	// ptax_cur_cd
				{$base_cur_cd, "base_cur_amt_dec_place;base_cur_upri_dec_place"},	// base_cur_cd
				{$itm_sub3, "base_unit_cd;sundry_itm_flg;base_unit_dec_place;base_unit_rnd_typ;lot_mng_typ;sublot_mng_typ;asset_mng_typ;dscnt_itm_flg;stk_mng_typ"},	// itm_sub3
				{$trd_unit_cd, "trd_unit_dec_place;trd_unit_conv_base_qty;trd_unit_conv_qty;pack_flg"},	// trd_unit_cd
				{$tax_cd, "tax_typ;tax_rate;inc_tax_flg"},	// tax_cd
				{$bd_itm_sub3, "bd_itm_nm;bd_lot_mng_typ;bd_lot_no_typ;bd_sublot_mng_typ;bd_sublot_no_typ;bd_sno1_mng_typ;bd_sno2_mng_typ;bd_sno3_mng_typ;bd_sno4_mng_typ"},	// bd_itm_sub3
				{$bd_dpt_cd, "bd_wg_cd"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$trd_cd, "trd_ptn_typ"},	// trd_cd
				{$purc_dpt_cd, "wg_cd"},	// purc_dpt_cd
				{$sppl_cd, "sppl_iv_flg;asppl_cd;purc_amt_rnd_typ;purc_tax_rnd_typ;purc_tax_calc_typ;prnt_lcl_cd"},	// sppl_cd
				{$bsppl_cd, "psppl_cd;pay_spot_flg;ap_cred_cd"},	// bsppl_cd
				{$trd_cur_cd, "upri_dec_place;amt_dec_place"},	// trd_cur_cd
				{$ptax_cur_cd, "amt_dec_place;upri_dec_place"},	// ptax_cur_cd
				{$base_cur_cd, "amt_dec_place;upri_dec_place"},	// base_cur_cd
				{$itm_sub3, "unit_cd;sundry_itm_flg;dec_place;rnd_typ;lot_mng_typ;sublot_mng_typ;asset_mng_typ;dscnt_itm_flg;stk_mng_typ"},	// itm_sub3
				{$trd_unit_cd, "dec_place;conv_base_qty;conv_qty;pack_flg"},	// trd_unit_cd
				{$tax_cd, "tax_typ;tax_rate;inc_tax_flg"},	// tax_cd
				{$bd_itm_sub3, "itm_nm;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// bd_itm_sub3
				{$bd_dpt_cd, "wg_cd"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$purc_usr_cd, "ac_dt"},	// purc_usr_cd
				{$purc_dpt_cd, "ac_dt;purc_usr_cd;MAC_DPT_IS_SRCH_TYP.PURC"},	// purc_dpt_cd
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL;purc_dt"},	// sppl_cd
				{$asppl_cd, "MAC_BP_IS_SRCH_TYP.ASPPL"},	// asppl_cd
				{$bsppl_cd, "MAC_BP_IS_SRCH_TYP.BSPPL"},	// bsppl_cd
				{$psppl_cd, "MAC_BP_IS_SRCH_TYP.PSPPL"},	// psppl_cd
				{$cred_cd, "MAC_BP_IS_SRCH_TYP.CRED"},	// cred_cd
				{$mfg_inst_no, "MSC_MFG_MTD_TYP.EXTNL;false;false;true;true"},	// mfg_inst_no
				{$itm_sub3, "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"},	// itm_sub3
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$maker_cd, "MAC_BP_IS_SRCH_TYP.MAKER;true"},	// maker_cd
				{$ap_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP;ac_dt"},	// ap_dpt_cd
				{$bd_itm_sub3, "MAC_ITM_IS_SRCH_TYP.ASSET1;bd_itm_cd;bd_itm_sub1;bd_itm_sub2"},	// bd_itm_sub3
				{$bd_loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM"},	// bd_loc_cd
				{$bd_dpt_cd, "MAC_DPT_IS_SRCH_TYP.BD;ac_dt"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$purc_usr_cd, "dt"},	// purc_usr_cd
				{$purc_dpt_cd, "dt;usr_cd;dpt_is_srch_typ"},	// purc_dpt_cd
				{$sppl_cd, "bp_is_srch_typ;dt"},	// sppl_cd
				{$asppl_cd, "dpt_is_srch_typ"},	// asppl_cd
				{$bsppl_cd, "dpt_is_srch_typ"},	// bsppl_cd
				{$psppl_cd, "dpt_is_srch_typ"},	// psppl_cd
				{$cred_cd, "dpt_is_srch_typ"},	// cred_cd
				{$mfg_inst_no, "imi_mfg_mtd_typ;sav_flg;ord_flg;stt_flg;cmpl_flg"},	// mfg_inst_no
				{$itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_sub3
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$maker_cd, "bp_is_srch_typ;mode_nullval_flg"},	// maker_cd
				{$ap_dpt_cd, "dpt_is_srch_typ;dt"},	// ap_dpt_cd
				{$bd_itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// bd_itm_sub3
				{$bd_loc_cd, "loc_is_srch_typ"},	// bd_loc_cd
				{$bd_dpt_cd, "dpt_is_srch_typ;dt"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$purc_typ, "MAC_PURC_TYP"}	// purc_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$maker_cd, "E"},	// maker_cd
				{$sno1, "E"},	// sno1
				{$sno2, "E"},	// sno2
				{$sno3, "E"},	// sno3
				{$sno4, "E"},	// sno4
				{$lot_no, "E"},	// lot_no
				{$sublot_no, "E"}	// sublot_no
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
	protected PurcDscnt_BulkImp_Chk01_DtlR_MC_A(ConstMetaList<? extends PurcDscnt_BulkImp_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcDscnt_BulkImp_Chk01_DtlR clone() {
		return (PurcDscnt_BulkImp_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcDscnt_BulkImp_Chk01_DtlR createInstance() {
		return (PurcDscnt_BulkImp_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcDscnt_BulkImp_Chk01_DtlR getValues(String... names) {
		return (PurcDscnt_BulkImp_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 1, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 1, $trd_cd, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 2, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 2, $trd_ptn_typ, value);
	}


	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return getConstString(offset + 3, $purc_usr_cd);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		setConstString(offset + 3, $purc_usr_cd, value);
	}


	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return getConstString(offset + 4, $purc_dpt_cd);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		setConstString(offset + 4, $purc_dpt_cd, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 5, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 5, $wg_cd, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 6, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 6, $sppl_cd, value);
	}


	/**
	 * For I/V transaction Ｉ／Ｖ取引対象.<p>
	 *
	 */
	public boolean sppl_iv_flg() {
		return getConstBoolean(offset + 7, $sppl_iv_flg);
	}

	/**
	 * For I/V transaction Ｉ／Ｖ取引対象.<p>
	 *
	 */
	public void sppl_iv_flg(boolean value) {
		setConstBoolean(offset + 7, $sppl_iv_flg, value);
	}


	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 8, $asppl_cd);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 8, $asppl_cd, value);
	}


	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 9, $bsppl_cd);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 9, $bsppl_cd, value);
	}


	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 10, $psppl_cd);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 10, $psppl_cd, value);
	}


	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public String cred_cd() {
		return getConstString(offset + 11, $cred_cd);
	}

	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public void cred_cd(String value) {
		setConstString(offset + 11, $cred_cd, value);
	}


	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public boolean pay_spot_flg() {
		return getConstBoolean(offset + 12, $pay_spot_flg);
	}

	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public void pay_spot_flg(boolean value) {
		setConstBoolean(offset + 12, $pay_spot_flg, value);
	}


	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public String purc_amt_rnd_typ() {
		return getConstString(offset + 13, $purc_amt_rnd_typ);
	}

	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public void purc_amt_rnd_typ(String value) {
		setConstString(offset + 13, $purc_amt_rnd_typ, value);
	}


	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return getConstString(offset + 14, $purc_tax_rnd_typ);
	}

	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		setConstString(offset + 14, $purc_tax_rnd_typ, value);
	}


	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public String purc_tax_calc_typ() {
		return getConstString(offset + 15, $purc_tax_calc_typ);
	}

	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public void purc_tax_calc_typ(String value) {
		setConstString(offset + 15, $purc_tax_calc_typ, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 16, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 16, $trd_cur_cd, value);
	}


	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber upri_dec_place() {
		return getConstNumber(offset + 17, $upri_dec_place);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(MCNumber value) {
		setConstNumber(offset + 17, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(int value) {
		setConstNumber(offset + 17, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(long value) {
		setConstNumber(offset + 17, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(float value) {
		setConstNumber(offset + 17, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(double value) {
		setConstNumber(offset + 17, $upri_dec_place, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 18, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 18, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 18, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 18, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 18, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 18, $amt_dec_place, value);
	}


	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 19, $ptax_cur_cd);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 19, $ptax_cur_cd, value);
	}


	/**
	 * Tax amount number of decimal places 納税金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber ptax_cur_amt_dec_place() {
		return getConstNumber(offset + 20, $ptax_cur_amt_dec_place);
	}

	/**
	 * Tax amount number of decimal places 納税金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 20, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax amount number of decimal places 納税金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(int value) {
		setConstNumber(offset + 20, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax amount number of decimal places 納税金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(long value) {
		setConstNumber(offset + 20, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax amount number of decimal places 納税金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(float value) {
		setConstNumber(offset + 20, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax amount number of decimal places 納税金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(double value) {
		setConstNumber(offset + 20, $ptax_cur_amt_dec_place, value);
	}


	/**
	 * Tax unit price number of decimal places 納税単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber ptax_cur_upri_dec_place() {
		return getConstNumber(offset + 21, $ptax_cur_upri_dec_place);
	}

	/**
	 * Tax unit price number of decimal places 納税単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 21, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Tax unit price number of decimal places 納税単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(int value) {
		setConstNumber(offset + 21, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Tax unit price number of decimal places 納税単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(long value) {
		setConstNumber(offset + 21, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Tax unit price number of decimal places 納税単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(float value) {
		setConstNumber(offset + 21, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Tax unit price number of decimal places 納税単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(double value) {
		setConstNumber(offset + 21, $ptax_cur_upri_dec_place, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 22, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 22, $base_cur_cd, value);
	}


	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_amt_dec_place() {
		return getConstNumber(offset + 23, $base_cur_amt_dec_place);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 23, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(int value) {
		setConstNumber(offset + 23, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(long value) {
		setConstNumber(offset + 23, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(float value) {
		setConstNumber(offset + 23, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(double value) {
		setConstNumber(offset + 23, $base_cur_amt_dec_place, value);
	}


	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_upri_dec_place() {
		return getConstNumber(offset + 24, $base_cur_upri_dec_place);
	}

	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 24, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(int value) {
		setConstNumber(offset + 24, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(long value) {
		setConstNumber(offset + 24, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(float value) {
		setConstNumber(offset + 24, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(double value) {
		setConstNumber(offset + 24, $base_cur_upri_dec_place, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 25, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 25, $trd_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 26, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 26, $intr_rmrks, value);
	}


	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 27, $tterm_cd1);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 27, $tterm_cd1, value);
	}


	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 28, $tterm_rmrks1);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 28, $tterm_rmrks1, value);
	}


	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 29, $tterm_cd2);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 29, $tterm_cd2, value);
	}


	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 30, $tterm_rmrks2);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 30, $tterm_rmrks2, value);
	}


	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 31, $tterm_cd3);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 31, $tterm_cd3, value);
	}


	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 32, $tterm_rmrks3);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 32, $tterm_rmrks3, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 33, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 33, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 34, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 34, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 35, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 35, $sub_char3, value);
	}


	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public MCDate purc_dt() {
		return getConstDate(offset + 36, $purc_dt);
	}

	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public void purc_dt(MCDate value) {
		setConstDate(offset + 36, $purc_dt, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 37, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 37, $ac_dt, value);
	}


	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public MCDate pay_basis_dt() {
		return getConstDate(offset + 38, $pay_basis_dt);
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public void pay_basis_dt(MCDate value) {
		setConstDate(offset + 38, $pay_basis_dt, value);
	}


	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return getConstDate(offset + 39, $pay_schd_dt);
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		setConstDate(offset + 39, $pay_schd_dt, value);
	}


	/**
	 * Purchase I/V No. 受領Ｉ／ＶＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 40, $rcpt_iv_no);
	}

	/**
	 * Purchase I/V No. 受領Ｉ／ＶＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 40, $rcpt_iv_no, value);
	}


	/**
	 * Corresponding receipt I/V No. 対応受領Ｉ／Ｖ　ＮＯ.<p>
	 *
	 */
	public String ref_rcpt_iv_no() {
		return getConstString(offset + 41, $ref_rcpt_iv_no);
	}

	/**
	 * Corresponding receipt I/V No. 対応受領Ｉ／Ｖ　ＮＯ.<p>
	 *
	 */
	public void ref_rcpt_iv_no(String value) {
		setConstString(offset + 41, $ref_rcpt_iv_no, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 42, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 42, $xrate_cd, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 43, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 43, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 43, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 43, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 43, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 43, $xrate, value);
	}


	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public MCDate ptax_dt() {
		return getConstDate(offset + 44, $ptax_dt);
	}

	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public void ptax_dt(MCDate value) {
		setConstDate(offset + 44, $ptax_dt, value);
	}


	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return getConstNumber(offset + 45, $ptax_xrate);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		setConstNumber(offset + 45, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		setConstNumber(offset + 45, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		setConstNumber(offset + 45, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		setConstNumber(offset + 45, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		setConstNumber(offset + 45, $ptax_xrate, value);
	}


	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public MCNumber dtl_peg_no() {
		return getConstNumber(offset + 46, $dtl_peg_no);
	}

	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(MCNumber value) {
		setConstNumber(offset + 46, $dtl_peg_no, value);
	}

	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(int value) {
		setConstNumber(offset + 46, $dtl_peg_no, value);
	}

	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(long value) {
		setConstNumber(offset + 46, $dtl_peg_no, value);
	}

	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(float value) {
		setConstNumber(offset + 46, $dtl_peg_no, value);
	}

	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(double value) {
		setConstNumber(offset + 46, $dtl_peg_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 47, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 47, $data_crud_typ, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 48, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 48, $err_flg, value);
	}


	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return getConstString(offset + 49, $dscnt_rsn_cd);
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		setConstString(offset + 49, $dscnt_rsn_cd, value);
	}


	/**
	 * Purchase type 購買区分.<p>
	 *
	 */
	public String purc_typ() {
		return getConstString(offset + 50, $purc_typ);
	}

	/**
	 * Purchase type 購買区分.<p>
	 *
	 */
	public void purc_typ(String value) {
		setConstString(offset + 50, $purc_typ, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 51, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 51, $mfg_inst_no, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 52, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 52, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 53, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 53, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 54, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 54, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 55, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 55, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 56, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 56, $itm_nm, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 57, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 57, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 58, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 58, $sublot_mng_typ, value);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 59, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 59, $dscnt_itm_flg, value);
	}


	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 60, $iv_itm_nm);
	}

	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 60, $iv_itm_nm, value);
	}


	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 61, $sppl_itm_cd);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 61, $sppl_itm_cd, value);
	}


	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 62, $sppl_itm_nm);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 62, $sppl_itm_nm, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 63, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 63, $sundry_itm_flg, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 64, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 64, $stk_mng_typ, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 65, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 65, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 66, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 66, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 66, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 66, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 66, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 66, $trd_unit_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 67, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 67, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 67, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 67, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 67, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 67, $trd_unit_dec_place, value);
	}


	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 68, $trd_unit_conv_base_qty);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 68, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 68, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 68, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 68, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 68, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 69, $trd_unit_conv_qty);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 69, $trd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 69, $trd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 69, $trd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 69, $trd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 69, $trd_unit_conv_qty, value);
	}


	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public boolean pack_flg() {
		return getConstBoolean(offset + 70, $pack_flg);
	}

	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public void pack_flg(boolean value) {
		setConstBoolean(offset + 70, $pack_flg, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 71, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 71, $base_unit_cd, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 72, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 72, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 72, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 72, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 72, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 72, $base_unit_qty, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 73, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 73, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 73, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 73, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 73, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 73, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 74, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 74, $base_unit_rnd_typ, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 75, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 75, $tax_cd, value);
	}


	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 76, $inc_tax_flg);
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 76, $inc_tax_flg, value);
	}


	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public String tax_typ() {
		return getConstString(offset + 77, $tax_typ);
	}

	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public void tax_typ(String value) {
		setConstString(offset + 77, $tax_typ, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 78, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 78, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 78, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 78, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 78, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 78, $tax_rate, value);
	}


	/**
	 * Details correction flg. 明細訂正ＦＬＧ.<p>
	 *
	 */
	public boolean purc_dtl_upd_flg() {
		return getConstBoolean(offset + 79, $purc_dtl_upd_flg);
	}

	/**
	 * Details correction flg. 明細訂正ＦＬＧ.<p>
	 *
	 */
	public void purc_dtl_upd_flg(boolean value) {
		setConstBoolean(offset + 79, $purc_dtl_upd_flg, value);
	}


	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 80, $trd_cur_upri);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 80, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 80, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 80, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 80, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 80, $trd_cur_upri, value);
	}


	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 81, $trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 81, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 81, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 81, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 81, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 81, $trd_cur_amt, value);
	}


	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 82, $trd_cur_tax_amt);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 82, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 82, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 82, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 82, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 82, $trd_cur_tax_amt, value);
	}


	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return getConstNumber(offset + 83, $base_cur_upri);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		setConstNumber(offset + 83, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		setConstNumber(offset + 83, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		setConstNumber(offset + 83, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		setConstNumber(offset + 83, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		setConstNumber(offset + 83, $base_cur_upri, value);
	}


	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 84, $base_cur_amt);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 84, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 84, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 84, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 84, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 84, $base_cur_amt, value);
	}


	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 85, $base_cur_tax_amt);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 85, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 85, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 85, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 85, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 85, $base_cur_tax_amt, value);
	}


	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public MCNumber base_cur_inc_tax_amt() {
		return getConstNumber(offset + 86, $base_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 86, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 86, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 86, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 86, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 86, $base_cur_inc_tax_amt, value);
	}


	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public MCNumber ptax_cur_upri() {
		return getConstNumber(offset + 87, $ptax_cur_upri);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(MCNumber value) {
		setConstNumber(offset + 87, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(int value) {
		setConstNumber(offset + 87, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(long value) {
		setConstNumber(offset + 87, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(float value) {
		setConstNumber(offset + 87, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(double value) {
		setConstNumber(offset + 87, $ptax_cur_upri, value);
	}


	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return getConstNumber(offset + 88, $ptax_cur_amt);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		setConstNumber(offset + 88, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		setConstNumber(offset + 88, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		setConstNumber(offset + 88, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		setConstNumber(offset + 88, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		setConstNumber(offset + 88, $ptax_cur_amt, value);
	}


	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public MCNumber ptax_cur_tax_amt() {
		return getConstNumber(offset + 89, $ptax_cur_tax_amt);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 89, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(int value) {
		setConstNumber(offset + 89, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(long value) {
		setConstNumber(offset + 89, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(float value) {
		setConstNumber(offset + 89, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(double value) {
		setConstNumber(offset + 89, $ptax_cur_tax_amt, value);
	}


	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public MCNumber ptax_cur_inc_tax_amt() {
		return getConstNumber(offset + 90, $ptax_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 90, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 90, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 90, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 90, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 90, $ptax_cur_inc_tax_amt, value);
	}


	/**
	 * Withholding tax rate 源泉徴収税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 91, $wtax_rate);
	}

	/**
	 * Withholding tax rate 源泉徴収税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 91, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉徴収税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 91, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉徴収税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 91, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉徴収税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 91, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉徴収税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 91, $wtax_rate, value);
	}


	/**
	 * Withholding tax amount 源泉徴収税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return getConstNumber(offset + 92, $wtax_amt);
	}

	/**
	 * Withholding tax amount 源泉徴収税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		setConstNumber(offset + 92, $wtax_amt, value);
	}

	/**
	 * Withholding tax amount 源泉徴収税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		setConstNumber(offset + 92, $wtax_amt, value);
	}

	/**
	 * Withholding tax amount 源泉徴収税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		setConstNumber(offset + 92, $wtax_amt, value);
	}

	/**
	 * Withholding tax amount 源泉徴収税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		setConstNumber(offset + 92, $wtax_amt, value);
	}

	/**
	 * Withholding tax amount 源泉徴収税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		setConstNumber(offset + 92, $wtax_amt, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 93, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 93, $maker_cd, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 94, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 94, $ap_dpt_cd, value);
	}


	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return getConstNumber(offset + 95, $pay_crryovr_times);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 95, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		setConstNumber(offset + 95, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		setConstNumber(offset + 95, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		setConstNumber(offset + 95, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		setConstNumber(offset + 95, $pay_crryovr_times, value);
	}


	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public String bd_itm_cd() {
		return getConstString(offset + 96, $bd_itm_cd);
	}

	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public void bd_itm_cd(String value) {
		setConstString(offset + 96, $bd_itm_cd, value);
	}


	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public String bd_itm_sub1() {
		return getConstString(offset + 97, $bd_itm_sub1);
	}

	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public void bd_itm_sub1(String value) {
		setConstString(offset + 97, $bd_itm_sub1, value);
	}


	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public String bd_itm_sub2() {
		return getConstString(offset + 98, $bd_itm_sub2);
	}

	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public void bd_itm_sub2(String value) {
		setConstString(offset + 98, $bd_itm_sub2, value);
	}


	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public String bd_itm_sub3() {
		return getConstString(offset + 99, $bd_itm_sub3);
	}

	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public void bd_itm_sub3(String value) {
		setConstString(offset + 99, $bd_itm_sub3, value);
	}


	/**
	 * Charged item name 負担品名.<p>
	 *
	 */
	public String bd_itm_nm() {
		return getConstString(offset + 100, $bd_itm_nm);
	}

	/**
	 * Charged item name 負担品名.<p>
	 *
	 */
	public void bd_itm_nm(String value) {
		setConstString(offset + 100, $bd_itm_nm, value);
	}


	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public String bd_lot_mng_typ() {
		return getConstString(offset + 101, $bd_lot_mng_typ);
	}

	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public void bd_lot_mng_typ(String value) {
		setConstString(offset + 101, $bd_lot_mng_typ, value);
	}


	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public String bd_sublot_mng_typ() {
		return getConstString(offset + 102, $bd_sublot_mng_typ);
	}

	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public void bd_sublot_mng_typ(String value) {
		setConstString(offset + 102, $bd_sublot_mng_typ, value);
	}


	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public String bd_lot_no_typ() {
		return getConstString(offset + 103, $bd_lot_no_typ);
	}

	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public void bd_lot_no_typ(String value) {
		setConstString(offset + 103, $bd_lot_no_typ, value);
	}


	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public String bd_sublot_no_typ() {
		return getConstString(offset + 104, $bd_sublot_no_typ);
	}

	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public void bd_sublot_no_typ(String value) {
		setConstString(offset + 104, $bd_sublot_no_typ, value);
	}


	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public String bd_sno1_mng_typ() {
		return getConstString(offset + 105, $bd_sno1_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public void bd_sno1_mng_typ(String value) {
		setConstString(offset + 105, $bd_sno1_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public String bd_sno2_mng_typ() {
		return getConstString(offset + 106, $bd_sno2_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public void bd_sno2_mng_typ(String value) {
		setConstString(offset + 106, $bd_sno2_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public String bd_sno3_mng_typ() {
		return getConstString(offset + 107, $bd_sno3_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public void bd_sno3_mng_typ(String value) {
		setConstString(offset + 107, $bd_sno3_mng_typ, value);
	}


	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public String bd_sno4_mng_typ() {
		return getConstString(offset + 108, $bd_sno4_mng_typ);
	}

	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public void bd_sno4_mng_typ(String value) {
		setConstString(offset + 108, $bd_sno4_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public String bd_sno1() {
		return getConstString(offset + 109, $bd_sno1);
	}

	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public void bd_sno1(String value) {
		setConstString(offset + 109, $bd_sno1, value);
	}


	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public String bd_sno2() {
		return getConstString(offset + 110, $bd_sno2);
	}

	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public void bd_sno2(String value) {
		setConstString(offset + 110, $bd_sno2, value);
	}


	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public String bd_sno3() {
		return getConstString(offset + 111, $bd_sno3);
	}

	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public void bd_sno3(String value) {
		setConstString(offset + 111, $bd_sno3, value);
	}


	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public String bd_sno4() {
		return getConstString(offset + 112, $bd_sno4);
	}

	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public void bd_sno4(String value) {
		setConstString(offset + 112, $bd_sno4, value);
	}


	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public String bd_lot_no() {
		return getConstString(offset + 113, $bd_lot_no);
	}

	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public void bd_lot_no(String value) {
		setConstString(offset + 113, $bd_lot_no, value);
	}


	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public String bd_sublot_no() {
		return getConstString(offset + 114, $bd_sublot_no);
	}

	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public void bd_sublot_no(String value) {
		setConstString(offset + 114, $bd_sublot_no, value);
	}


	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public String bd_ctg_cd() {
		return getConstString(offset + 115, $bd_ctg_cd);
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public void bd_ctg_cd(String value) {
		setConstString(offset + 115, $bd_ctg_cd, value);
	}


	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public String bd_oper_cd() {
		return getConstString(offset + 116, $bd_oper_cd);
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public void bd_oper_cd(String value) {
		setConstString(offset + 116, $bd_oper_cd, value);
	}


	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public String bd_iv_no() {
		return getConstString(offset + 117, $bd_iv_no);
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public void bd_iv_no(String value) {
		setConstString(offset + 117, $bd_iv_no, value);
	}


	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public String bd_loc_cd() {
		return getConstString(offset + 118, $bd_loc_cd);
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public void bd_loc_cd(String value) {
		setConstString(offset + 118, $bd_loc_cd, value);
	}


	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public String bd_po_no() {
		return getConstString(offset + 119, $bd_po_no);
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public void bd_po_no(String value) {
		setConstString(offset + 119, $bd_po_no, value);
	}


	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public String bd_slo_no() {
		return getConstString(offset + 120, $bd_slo_no);
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public void bd_slo_no(String value) {
		setConstString(offset + 120, $bd_slo_no, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 121, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 121, $asset_mng_typ, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 122, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 122, $bd_dpt_cd, value);
	}


	/**
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public String bd_wg_cd() {
		return getConstString(offset + 123, $bd_wg_cd);
	}

	/**
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public void bd_wg_cd(String value) {
		setConstString(offset + 123, $bd_wg_cd, value);
	}


	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public String bd_bp_cd() {
		return getConstString(offset + 124, $bd_bp_cd);
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public void bd_bp_cd(String value) {
		setConstString(offset + 124, $bd_bp_cd, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 125, $intr_d_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 125, $intr_d_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 126, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 126, $trd_d_rmrks, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String d_sub_char1() {
		return getConstString(offset + 127, $d_sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void d_sub_char1(String value) {
		setConstString(offset + 127, $d_sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String d_sub_char2() {
		return getConstString(offset + 128, $d_sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void d_sub_char2(String value) {
		setConstString(offset + 128, $d_sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String d_sub_char3() {
		return getConstString(offset + 129, $d_sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void d_sub_char3(String value) {
		setConstString(offset + 129, $d_sub_char3, value);
	}


	/**
	 * Reference purchase result No. 参照仕入実績ＮＯ.<p>
	 *
	 */
	public String ref_purc_act_no() {
		return getConstString(offset + 130, $ref_purc_act_no);
	}

	/**
	 * Reference purchase result No. 参照仕入実績ＮＯ.<p>
	 *
	 */
	public void ref_purc_act_no(String value) {
		setConstString(offset + 130, $ref_purc_act_no, value);
	}


	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public MCNumber ref_purc_act_seq() {
		return getConstNumber(offset + 131, $ref_purc_act_seq);
	}

	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public void ref_purc_act_seq(MCNumber value) {
		setConstNumber(offset + 131, $ref_purc_act_seq, value);
	}

	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public void ref_purc_act_seq(int value) {
		setConstNumber(offset + 131, $ref_purc_act_seq, value);
	}

	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public void ref_purc_act_seq(long value) {
		setConstNumber(offset + 131, $ref_purc_act_seq, value);
	}

	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public void ref_purc_act_seq(float value) {
		setConstNumber(offset + 131, $ref_purc_act_seq, value);
	}

	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public void ref_purc_act_seq(double value) {
		setConstNumber(offset + 131, $ref_purc_act_seq, value);
	}


	/**
	 * Reference purchase result details No. 参照仕入実績明細ＮＯ.<p>
	 *
	 */
	public String ref_purc_act_d_no() {
		return getConstString(offset + 132, $ref_purc_act_d_no);
	}

	/**
	 * Reference purchase result details No. 参照仕入実績明細ＮＯ.<p>
	 *
	 */
	public void ref_purc_act_d_no(String value) {
		setConstString(offset + 132, $ref_purc_act_d_no, value);
	}


	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public MCNumber ref_purc_act_d_seq() {
		return getConstNumber(offset + 133, $ref_purc_act_d_seq);
	}

	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public void ref_purc_act_d_seq(MCNumber value) {
		setConstNumber(offset + 133, $ref_purc_act_d_seq, value);
	}

	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public void ref_purc_act_d_seq(int value) {
		setConstNumber(offset + 133, $ref_purc_act_d_seq, value);
	}

	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public void ref_purc_act_d_seq(long value) {
		setConstNumber(offset + 133, $ref_purc_act_d_seq, value);
	}

	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public void ref_purc_act_d_seq(float value) {
		setConstNumber(offset + 133, $ref_purc_act_d_seq, value);
	}

	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public void ref_purc_act_d_seq(double value) {
		setConstNumber(offset + 133, $ref_purc_act_d_seq, value);
	}


	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public MCDate base_purc_ac_dt() {
		return getConstDate(offset + 134, $base_purc_ac_dt);
	}

	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public void base_purc_ac_dt(MCDate value) {
		setConstDate(offset + 134, $base_purc_ac_dt, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 135, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 135, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 136, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 136, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 137, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 137, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 138, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 138, $sno4, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 139, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 139, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 140, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 140, $sublot_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 141, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 141, $po_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 142, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 142, $slo_no, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 143, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 143, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 143, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 143, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 143, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 143, $disp_seq, value);
	}


	/**
	 * Withholding tax rounding type 源泉税額端数処理区分.<p>
	 *
	 */
	public String wtax_rnd_typ() {
		return getConstString(offset + 144, $wtax_rnd_typ);
	}

	/**
	 * Withholding tax rounding type 源泉税額端数処理区分.<p>
	 *
	 */
	public void wtax_rnd_typ(String value) {
		setConstString(offset + 144, $wtax_rnd_typ, value);
	}


	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public String xrate_rnd_typ() {
		return getConstString(offset + 145, $xrate_rnd_typ);
	}

	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public void xrate_rnd_typ(String value) {
		setConstString(offset + 145, $xrate_rnd_typ, value);
	}


	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 146, $prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 146, $prnt_lcl_cd, value);
	}


	public String getString(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
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
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($ref_rcpt_iv_no.equalsIgnoreCase(name)) {
			return ref_rcpt_iv_no();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($purc_typ.equalsIgnoreCase(name)) {
			return purc_typ();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($bd_itm_cd.equalsIgnoreCase(name)) {
			return bd_itm_cd();
		}
		if ($bd_itm_sub1.equalsIgnoreCase(name)) {
			return bd_itm_sub1();
		}
		if ($bd_itm_sub2.equalsIgnoreCase(name)) {
			return bd_itm_sub2();
		}
		if ($bd_itm_sub3.equalsIgnoreCase(name)) {
			return bd_itm_sub3();
		}
		if ($bd_itm_nm.equalsIgnoreCase(name)) {
			return bd_itm_nm();
		}
		if ($bd_lot_mng_typ.equalsIgnoreCase(name)) {
			return bd_lot_mng_typ();
		}
		if ($bd_sublot_mng_typ.equalsIgnoreCase(name)) {
			return bd_sublot_mng_typ();
		}
		if ($bd_lot_no_typ.equalsIgnoreCase(name)) {
			return bd_lot_no_typ();
		}
		if ($bd_sublot_no_typ.equalsIgnoreCase(name)) {
			return bd_sublot_no_typ();
		}
		if ($bd_sno1_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno1_mng_typ();
		}
		if ($bd_sno2_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno2_mng_typ();
		}
		if ($bd_sno3_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno3_mng_typ();
		}
		if ($bd_sno4_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno4_mng_typ();
		}
		if ($bd_sno1.equalsIgnoreCase(name)) {
			return bd_sno1();
		}
		if ($bd_sno2.equalsIgnoreCase(name)) {
			return bd_sno2();
		}
		if ($bd_sno3.equalsIgnoreCase(name)) {
			return bd_sno3();
		}
		if ($bd_sno4.equalsIgnoreCase(name)) {
			return bd_sno4();
		}
		if ($bd_lot_no.equalsIgnoreCase(name)) {
			return bd_lot_no();
		}
		if ($bd_sublot_no.equalsIgnoreCase(name)) {
			return bd_sublot_no();
		}
		if ($bd_ctg_cd.equalsIgnoreCase(name)) {
			return bd_ctg_cd();
		}
		if ($bd_oper_cd.equalsIgnoreCase(name)) {
			return bd_oper_cd();
		}
		if ($bd_iv_no.equalsIgnoreCase(name)) {
			return bd_iv_no();
		}
		if ($bd_loc_cd.equalsIgnoreCase(name)) {
			return bd_loc_cd();
		}
		if ($bd_po_no.equalsIgnoreCase(name)) {
			return bd_po_no();
		}
		if ($bd_slo_no.equalsIgnoreCase(name)) {
			return bd_slo_no();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			return bd_wg_cd();
		}
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			return bd_bp_cd();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			return d_sub_char1();
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			return d_sub_char2();
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			return d_sub_char3();
		}
		if ($ref_purc_act_no.equalsIgnoreCase(name)) {
			return ref_purc_act_no();
		}
		if ($ref_purc_act_d_no.equalsIgnoreCase(name)) {
			return ref_purc_act_d_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			return wtax_rnd_typ();
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			return xrate_rnd_typ();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_amt_dec_place();
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_upri_dec_place();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return base_cur_upri_dec_place();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			return dtl_peg_no();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_inc_tax_amt();
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			return ptax_cur_upri();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_tax_amt();
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_inc_tax_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			return ref_purc_act_seq();
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			return ref_purc_act_d_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($purc_dt.equalsIgnoreCase(name)) {
			return purc_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			return pay_basis_dt();
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			return ptax_dt();
		}
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			return base_purc_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			return purc_dtl_upd_flg();
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
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
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
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($ref_rcpt_iv_no.equalsIgnoreCase(name)) {
			return ref_rcpt_iv_no();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($purc_typ.equalsIgnoreCase(name)) {
			return purc_typ();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($bd_itm_cd.equalsIgnoreCase(name)) {
			return bd_itm_cd();
		}
		if ($bd_itm_sub1.equalsIgnoreCase(name)) {
			return bd_itm_sub1();
		}
		if ($bd_itm_sub2.equalsIgnoreCase(name)) {
			return bd_itm_sub2();
		}
		if ($bd_itm_sub3.equalsIgnoreCase(name)) {
			return bd_itm_sub3();
		}
		if ($bd_itm_nm.equalsIgnoreCase(name)) {
			return bd_itm_nm();
		}
		if ($bd_lot_mng_typ.equalsIgnoreCase(name)) {
			return bd_lot_mng_typ();
		}
		if ($bd_sublot_mng_typ.equalsIgnoreCase(name)) {
			return bd_sublot_mng_typ();
		}
		if ($bd_lot_no_typ.equalsIgnoreCase(name)) {
			return bd_lot_no_typ();
		}
		if ($bd_sublot_no_typ.equalsIgnoreCase(name)) {
			return bd_sublot_no_typ();
		}
		if ($bd_sno1_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno1_mng_typ();
		}
		if ($bd_sno2_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno2_mng_typ();
		}
		if ($bd_sno3_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno3_mng_typ();
		}
		if ($bd_sno4_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno4_mng_typ();
		}
		if ($bd_sno1.equalsIgnoreCase(name)) {
			return bd_sno1();
		}
		if ($bd_sno2.equalsIgnoreCase(name)) {
			return bd_sno2();
		}
		if ($bd_sno3.equalsIgnoreCase(name)) {
			return bd_sno3();
		}
		if ($bd_sno4.equalsIgnoreCase(name)) {
			return bd_sno4();
		}
		if ($bd_lot_no.equalsIgnoreCase(name)) {
			return bd_lot_no();
		}
		if ($bd_sublot_no.equalsIgnoreCase(name)) {
			return bd_sublot_no();
		}
		if ($bd_ctg_cd.equalsIgnoreCase(name)) {
			return bd_ctg_cd();
		}
		if ($bd_oper_cd.equalsIgnoreCase(name)) {
			return bd_oper_cd();
		}
		if ($bd_iv_no.equalsIgnoreCase(name)) {
			return bd_iv_no();
		}
		if ($bd_loc_cd.equalsIgnoreCase(name)) {
			return bd_loc_cd();
		}
		if ($bd_po_no.equalsIgnoreCase(name)) {
			return bd_po_no();
		}
		if ($bd_slo_no.equalsIgnoreCase(name)) {
			return bd_slo_no();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_wg_cd.equalsIgnoreCase(name)) {
			return bd_wg_cd();
		}
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			return bd_bp_cd();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			return d_sub_char1();
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			return d_sub_char2();
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			return d_sub_char3();
		}
		if ($ref_purc_act_no.equalsIgnoreCase(name)) {
			return ref_purc_act_no();
		}
		if ($ref_purc_act_d_no.equalsIgnoreCase(name)) {
			return ref_purc_act_d_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			return wtax_rnd_typ();
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			return xrate_rnd_typ();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_amt_dec_place();
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_upri_dec_place();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return base_cur_upri_dec_place();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			return dtl_peg_no();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_inc_tax_amt();
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			return ptax_cur_upri();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_tax_amt();
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_inc_tax_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			return ref_purc_act_seq();
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			return ref_purc_act_d_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($purc_dt.equalsIgnoreCase(name)) {
			return purc_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			return pay_basis_dt();
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			return ptax_dt();
		}
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			return base_purc_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			return purc_dtl_upd_flg();
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
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			tterm_rmrks1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
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
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($ref_rcpt_iv_no.equalsIgnoreCase(name)) {
			ref_rcpt_iv_no(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($purc_typ.equalsIgnoreCase(name)) {
			purc_typ(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($bd_itm_cd.equalsIgnoreCase(name)) {
			bd_itm_cd(value);
			return;
		}
		if ($bd_itm_sub1.equalsIgnoreCase(name)) {
			bd_itm_sub1(value);
			return;
		}
		if ($bd_itm_sub2.equalsIgnoreCase(name)) {
			bd_itm_sub2(value);
			return;
		}
		if ($bd_itm_sub3.equalsIgnoreCase(name)) {
			bd_itm_sub3(value);
			return;
		}
		if ($bd_itm_nm.equalsIgnoreCase(name)) {
			bd_itm_nm(value);
			return;
		}
		if ($bd_lot_mng_typ.equalsIgnoreCase(name)) {
			bd_lot_mng_typ(value);
			return;
		}
		if ($bd_sublot_mng_typ.equalsIgnoreCase(name)) {
			bd_sublot_mng_typ(value);
			return;
		}
		if ($bd_lot_no_typ.equalsIgnoreCase(name)) {
			bd_lot_no_typ(value);
			return;
		}
		if ($bd_sublot_no_typ.equalsIgnoreCase(name)) {
			bd_sublot_no_typ(value);
			return;
		}
		if ($bd_sno1_mng_typ.equalsIgnoreCase(name)) {
			bd_sno1_mng_typ(value);
			return;
		}
		if ($bd_sno2_mng_typ.equalsIgnoreCase(name)) {
			bd_sno2_mng_typ(value);
			return;
		}
		if ($bd_sno3_mng_typ.equalsIgnoreCase(name)) {
			bd_sno3_mng_typ(value);
			return;
		}
		if ($bd_sno4_mng_typ.equalsIgnoreCase(name)) {
			bd_sno4_mng_typ(value);
			return;
		}
		if ($bd_sno1.equalsIgnoreCase(name)) {
			bd_sno1(value);
			return;
		}
		if ($bd_sno2.equalsIgnoreCase(name)) {
			bd_sno2(value);
			return;
		}
		if ($bd_sno3.equalsIgnoreCase(name)) {
			bd_sno3(value);
			return;
		}
		if ($bd_sno4.equalsIgnoreCase(name)) {
			bd_sno4(value);
			return;
		}
		if ($bd_lot_no.equalsIgnoreCase(name)) {
			bd_lot_no(value);
			return;
		}
		if ($bd_sublot_no.equalsIgnoreCase(name)) {
			bd_sublot_no(value);
			return;
		}
		if ($bd_ctg_cd.equalsIgnoreCase(name)) {
			bd_ctg_cd(value);
			return;
		}
		if ($bd_oper_cd.equalsIgnoreCase(name)) {
			bd_oper_cd(value);
			return;
		}
		if ($bd_iv_no.equalsIgnoreCase(name)) {
			bd_iv_no(value);
			return;
		}
		if ($bd_loc_cd.equalsIgnoreCase(name)) {
			bd_loc_cd(value);
			return;
		}
		if ($bd_po_no.equalsIgnoreCase(name)) {
			bd_po_no(value);
			return;
		}
		if ($bd_slo_no.equalsIgnoreCase(name)) {
			bd_slo_no(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			bd_bp_cd(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			d_sub_char1(value);
			return;
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			d_sub_char2(value);
			return;
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			d_sub_char3(value);
			return;
		}
		if ($ref_purc_act_no.equalsIgnoreCase(name)) {
			ref_purc_act_no(value);
			return;
		}
		if ($ref_purc_act_d_no.equalsIgnoreCase(name)) {
			ref_purc_act_d_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
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
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			wtax_rnd_typ(value);
			return;
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			xrate_rnd_typ(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
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
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			ref_purc_act_seq(value);
			return;
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			ref_purc_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
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
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			ref_purc_act_seq(value);
			return;
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			ref_purc_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
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
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			ref_purc_act_seq(value);
			return;
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			ref_purc_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
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
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			ref_purc_act_seq(value);
			return;
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			ref_purc_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
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
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			ref_purc_act_seq(value);
			return;
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			ref_purc_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($purc_dt.equalsIgnoreCase(name)) {
			purc_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			pay_basis_dt(value);
			return;
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			ptax_dt(value);
			return;
		}
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			base_purc_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			purc_dtl_upd_flg(value);
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
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			tterm_rmrks1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
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
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($ref_rcpt_iv_no.equalsIgnoreCase(name)) {
			ref_rcpt_iv_no(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($purc_typ.equalsIgnoreCase(name)) {
			purc_typ(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($bd_itm_cd.equalsIgnoreCase(name)) {
			bd_itm_cd(value);
			return;
		}
		if ($bd_itm_sub1.equalsIgnoreCase(name)) {
			bd_itm_sub1(value);
			return;
		}
		if ($bd_itm_sub2.equalsIgnoreCase(name)) {
			bd_itm_sub2(value);
			return;
		}
		if ($bd_itm_sub3.equalsIgnoreCase(name)) {
			bd_itm_sub3(value);
			return;
		}
		if ($bd_itm_nm.equalsIgnoreCase(name)) {
			bd_itm_nm(value);
			return;
		}
		if ($bd_lot_mng_typ.equalsIgnoreCase(name)) {
			bd_lot_mng_typ(value);
			return;
		}
		if ($bd_sublot_mng_typ.equalsIgnoreCase(name)) {
			bd_sublot_mng_typ(value);
			return;
		}
		if ($bd_lot_no_typ.equalsIgnoreCase(name)) {
			bd_lot_no_typ(value);
			return;
		}
		if ($bd_sublot_no_typ.equalsIgnoreCase(name)) {
			bd_sublot_no_typ(value);
			return;
		}
		if ($bd_sno1_mng_typ.equalsIgnoreCase(name)) {
			bd_sno1_mng_typ(value);
			return;
		}
		if ($bd_sno2_mng_typ.equalsIgnoreCase(name)) {
			bd_sno2_mng_typ(value);
			return;
		}
		if ($bd_sno3_mng_typ.equalsIgnoreCase(name)) {
			bd_sno3_mng_typ(value);
			return;
		}
		if ($bd_sno4_mng_typ.equalsIgnoreCase(name)) {
			bd_sno4_mng_typ(value);
			return;
		}
		if ($bd_sno1.equalsIgnoreCase(name)) {
			bd_sno1(value);
			return;
		}
		if ($bd_sno2.equalsIgnoreCase(name)) {
			bd_sno2(value);
			return;
		}
		if ($bd_sno3.equalsIgnoreCase(name)) {
			bd_sno3(value);
			return;
		}
		if ($bd_sno4.equalsIgnoreCase(name)) {
			bd_sno4(value);
			return;
		}
		if ($bd_lot_no.equalsIgnoreCase(name)) {
			bd_lot_no(value);
			return;
		}
		if ($bd_sublot_no.equalsIgnoreCase(name)) {
			bd_sublot_no(value);
			return;
		}
		if ($bd_ctg_cd.equalsIgnoreCase(name)) {
			bd_ctg_cd(value);
			return;
		}
		if ($bd_oper_cd.equalsIgnoreCase(name)) {
			bd_oper_cd(value);
			return;
		}
		if ($bd_iv_no.equalsIgnoreCase(name)) {
			bd_iv_no(value);
			return;
		}
		if ($bd_loc_cd.equalsIgnoreCase(name)) {
			bd_loc_cd(value);
			return;
		}
		if ($bd_po_no.equalsIgnoreCase(name)) {
			bd_po_no(value);
			return;
		}
		if ($bd_slo_no.equalsIgnoreCase(name)) {
			bd_slo_no(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			bd_bp_cd(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			d_sub_char1(value);
			return;
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			d_sub_char2(value);
			return;
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			d_sub_char3(value);
			return;
		}
		if ($ref_purc_act_no.equalsIgnoreCase(name)) {
			ref_purc_act_no(value);
			return;
		}
		if ($ref_purc_act_d_no.equalsIgnoreCase(name)) {
			ref_purc_act_d_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
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
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			wtax_rnd_typ(value);
			return;
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			xrate_rnd_typ(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
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
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			ref_purc_act_seq(value);
			return;
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			ref_purc_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
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
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			ref_purc_act_seq(value);
			return;
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			ref_purc_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
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
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			ref_purc_act_seq(value);
			return;
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			ref_purc_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
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
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			ref_purc_act_seq(value);
			return;
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			ref_purc_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
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
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($ref_purc_act_seq.equalsIgnoreCase(name)) {
			ref_purc_act_seq(value);
			return;
		}
		if ($ref_purc_act_d_seq.equalsIgnoreCase(name)) {
			ref_purc_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($purc_dt.equalsIgnoreCase(name)) {
			purc_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			pay_basis_dt(value);
			return;
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			ptax_dt(value);
			return;
		}
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			base_purc_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			purc_dtl_upd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

