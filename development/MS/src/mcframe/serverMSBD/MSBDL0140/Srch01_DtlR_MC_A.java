package mcframe.serverMSBD.MSBDL0140;

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
 * ブロック"Srch01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_DtlR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Schedule unit cd. 予定単位ＣＤ.<p>
	 *
	 */
	public static final String $schd_unit_cd = "schd_unit_cd";
	/**
	 * Schedule transaction unit conversion qty. 予定取引単位換算数量.<p>
	 *
	 */
	public static final String $schd_trd_unit_conv_qty = "schd_trd_unit_conv_qty";
	/**
	 * Schedule transaction unit conversion base qty. 予定取引単位換算基準数量.<p>
	 *
	 */
	public static final String $schd_trd_unit_conv_base_qty = "schd_trd_unit_conv_base_qty";
	/**
	 * Schedule transaction unit number of decimal places 予定取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $schd_trd_unit_dec_place = "schd_trd_unit_dec_place";
	/**
	 * Schedule transaction unit rounding type 予定取引単位端数処理区分.<p>
	 *
	 */
	public static final String $schd_trd_unit_rnd_typ = "schd_trd_unit_rnd_typ";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Subcontracting flg. 外注ＦＬＧ.<p>
	 *
	 */
	public static final String $outsrc_flg = "outsrc_flg";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public static final String $purc_id_typ = "purc_id_typ";
	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public static final String $purc_id_typ_nm = "purc_id_typ_nm";
	/**
	 * Not receipt flg. 入荷不要ＦＬＧ.<p>
	 *
	 */
	public static final String $arr_skip_flg = "arr_skip_flg";
	/**
	 * Direct delivery flg. 仕入直送ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_ddlv_flg = "purc_ddlv_flg";
	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public static final String $arr_schd_dt = "arr_schd_dt";
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public static final String $purc_schd_dt = "purc_schd_dt";
	/**
	 * Receipt schedule simultaneously recording flg. 入荷予定同時計上ＦＬＧ.<p>
	 *
	 */
	public static final String $schd_sync_flg = "schd_sync_flg";
	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public static final String $arr_ptn_typ = "arr_ptn_typ";
	/**
	 * Receipt simultaneously recording flg. 入荷同時計上ＦＬＧ.<p>
	 *
	 */
	public static final String $sync_flg = "sync_flg";
	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public static final String $purc_basis_typ = "purc_basis_typ";
	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public static final String $purc_basis_typ_nm = "purc_basis_typ_nm";
	/**
	 * Receipt result flg. 入荷実績ＦＬＧ.<p>
	 *
	 */
	public static final String $arr_act_flg = "arr_act_flg";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_d_no = "rcpt_iv_d_no";
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public static final String $purc_schd_no = "purc_schd_no";
	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public static final String $arr_schd_no = "arr_schd_no";
	/**
	 * Temporary flg. 暫定ＦＬＧ.<p>
	 *
	 */
	public static final String $temp_ap_flg = "temp_ap_flg";
	/**
	 * Not for purchase flg. 仕入対象外ＦＬＧ.<p>
	 *
	 */
	public static final String $non_purc_flg = "non_purc_flg";
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public static final String $purc_act_seq = "purc_act_seq";
	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public static final String $purc_act_rev = "purc_act_rev";
	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_d_no = "purc_act_d_no";
	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public static final String $purc_act_d_seq = "purc_act_d_seq";
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
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * Import/export charges type 輸出入諸掛区分.<p>
	 *
	 */
	public static final String $exim_xpns_typ = "exim_xpns_typ";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
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
	 * Transaction unit cd. at PO 発注時取引単位ＣＤ.<p>
	 *
	 */
	public static final String $src_trd_unit_cd = "src_trd_unit_cd";
	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public static final String $src_trd_unit_conv_qty = "src_trd_unit_conv_qty";
	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public static final String $src_trd_unit_conv_base_qty = "src_trd_unit_conv_base_qty";
	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $src_trd_unit_dec_place = "src_trd_unit_dec_place";
	/**
	 * Transaction unit rounding type at PO 発注時取引単位端数処理区分.<p>
	 *
	 */
	public static final String $src_trd_unit_rnd_typ = "src_trd_unit_rnd_typ";
	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public static final String $src_trd_unit_qty = "src_trd_unit_qty";
	/**
	 * Unit qty. at PO 発注時基準単位数量.<p>
	 *
	 */
	public static final String $src_base_unit_qty = "src_base_unit_qty";
	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public static final String $src_trd_cur_upri = "src_trd_cur_upri";
	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public static final String $src_trd_cur_proc_upri = "src_trd_cur_proc_upri";
	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public static final String $src_trd_cur_onr_prov_upri = "src_trd_cur_onr_prov_upri";
	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public static final String $src_trd_cur_dscnt_amt = "src_trd_cur_dscnt_amt";
	/**
	 * PO amount (Transaction currency) 発注取引通貨金額.<p>
	 *
	 */
	public static final String $src_trd_cur_amt = "src_trd_cur_amt";
	/**
	 * Subcontracting amount at PO (Transaction currency) 発注取引通貨加工金額.<p>
	 *
	 */
	public static final String $src_trd_cur_proc_amt = "src_trd_cur_proc_amt";
	/**
	 * Chargeable supply amount (PO transaction currency) 発注取引通貨有償支給金額.<p>
	 *
	 */
	public static final String $src_trd_cur_onr_prov_amt = "src_trd_cur_onr_prov_amt";
	/**
	 * PO tax amount (Transaction currency) 発注取引通貨税額.<p>
	 *
	 */
	public static final String $src_trd_cur_tax_amt = "src_trd_cur_tax_amt";
	/**
	 * PO withholding tax rate 発注源泉税率.<p>
	 *
	 */
	public static final String $src_wtax_rate = "src_wtax_rate";
	/**
	 * Tax cd. at PO 発注時税ＣＤ.<p>
	 *
	 */
	public static final String $src_tax_cd = "src_tax_cd";
	/**
	 * Tax name at PO 発注時税名.<p>
	 *
	 */
	public static final String $src_tax_nm = "src_tax_nm";
	/**
	 * Tax rate at PO 発注時税率.<p>
	 *
	 */
	public static final String $src_tax_rate = "src_tax_rate";
	/**
	 * Tax type at PO 発注時税区分.<p>
	 *
	 */
	public static final String $src_tax_typ = "src_tax_typ";
	/**
	 * Tax inclusive flg. at PO 発注時内税ＦＬＧ.<p>
	 *
	 */
	public static final String $src_inc_tax_flg = "src_inc_tax_flg";
	/**
	 * Acceptance defective flg. 検収不良ＦＬＧ.<p>
	 *
	 */
	public static final String $accpt_dfct_flg = "accpt_dfct_flg";
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
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	/**
	 * Transaction unit scheduled qty. 取引単位予定数量.<p>
	 *
	 */
	public static final String $trd_unit_schd_qty = "trd_unit_schd_qty";
	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
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
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public static final String $base_unit_schd_qty = "base_unit_schd_qty";
	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty_bf_cng = "base_unit_qty_bf_cng";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Base unit purchase qty. 基準単位仕入数量.<p>
	 *
	 */
	public static final String $base_unit_purc_qty = "base_unit_purc_qty";
	/**
	 * Base unit receipt qty. 基準単位入荷数量.<p>
	 *
	 */
	public static final String $base_unit_arr_qty = "base_unit_arr_qty";
	/**
	 * Base unit acceptance detective qty. 基準単位検収不良数量.<p>
	 *
	 */
	public static final String $base_unit_accpt_dfct_qty = "base_unit_accpt_dfct_qty";
	/**
	 * Re-receipt flg. 再入荷ＦＬＧ.<p>
	 *
	 */
	public static final String $re_arr_flg = "re_arr_flg";
	/**
	 * Re-receipt location cd. 再入荷場所ＣＤ.<p>
	 *
	 */
	public static final String $re_arr_loc_cd = "re_arr_loc_cd";
	/**
	 * Re-receipt location name 再入荷場所名.<p>
	 *
	 */
	public static final String $re_arr_loc_nm = "re_arr_loc_nm";
	/**
	 * Re-receipt location WG cd. 再入荷場所ＷＧＣＤ.<p>
	 *
	 */
	public static final String $re_arr_loc_wg_cd = "re_arr_loc_wg_cd";
	/**
	 * Re-receipt location WG name 再入荷場所ＷＧ名.<p>
	 *
	 */
	public static final String $re_arr_loc_wg_nm = "re_arr_loc_wg_nm";
	/**
	 * For re-receipt rack/line 再入荷棚・ライン対象.<p>
	 *
	 */
	public static final String $re_arr_str_ln_tgt_flg = "re_arr_str_ln_tgt_flg";
	/**
	 * Re-receipt rack/line cd. 再入荷棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $re_arr_str_ln_cd = "re_arr_str_ln_cd";
	/**
	 * Re-receipt rack/line name 再入荷棚・ライン名.<p>
	 *
	 */
	public static final String $re_arr_str_ln_nm = "re_arr_str_ln_nm";
	/**
	 * Re-receipt (Without rack/line) 再入荷棚・ライン無.<p>
	 *
	 */
	public static final String $re_arr_str_ln_cd_none_flg = "re_arr_str_ln_cd_none_flg";
	/**
	 * Re-receipt factory/distribution warehouse cd. 再入荷場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $re_arr_loc_site_cd = "re_arr_loc_site_cd";
	/**
	 * Re-receipt location calendar cd. 再入荷場所カレンダＣＤ.<p>
	 *
	 */
	public static final String $re_arr_loc_cal_cd = "re_arr_loc_cal_cd";
	/**
	 * Re-receipt location Subcontractor cd. 再入荷場所外注発注先ＣＤ.<p>
	 *
	 */
	public static final String $re_arr_loc_sppl_cd = "re_arr_loc_sppl_cd";
	/**
	 * Re-receipt location Subcontractor calendar cd. 再入荷場所外注発注先カレンダＣＤ.<p>
	 *
	 */
	public static final String $re_arr_loc_sppl_cal_cd = "re_arr_loc_sppl_cal_cd";
	/**
	 * Transaction unit re-receipt qty. 取引単位再入荷数量.<p>
	 *
	 */
	public static final String $trd_unit_re_arr_qty = "trd_unit_re_arr_qty";
	/**
	 * Desired re-receipt date 再入荷希望日.<p>
	 *
	 */
	public static final String $re_arr_rqst_dt = "re_arr_rqst_dt";
	/**
	 * Desired re-receipt time 再入荷希望時刻.<p>
	 *
	 */
	public static final String $re_arr_rqst_hm = "re_arr_rqst_hm";
	/**
	 * Scheduled re-receipt purchase date 再入荷仕入予定日.<p>
	 *
	 */
	public static final String $re_arr_purc_schd_dt = "re_arr_purc_schd_dt";
	/**
	 * Re-receipt simultaneously recording 再入荷同時計上.<p>
	 *
	 */
	public static final String $re_arr_sync_flg = "re_arr_sync_flg";
	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Free of charge flg. 無償ＦＬＧ.<p>
	 *
	 */
	public static final String $ncv_flg = "ncv_flg";
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
	 * Delivery location WG 納入場所ＷＧ.<p>
	 *
	 */
	public static final String $dlv_loc_wg_cd = "dlv_loc_wg_cd";
	/**
	 * Delivery location WG name 納入場所ＷＧ名.<p>
	 *
	 */
	public static final String $dlv_loc_wg_nm = "dlv_loc_wg_nm";
	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public static final String $dlv_loc_cd = "dlv_loc_cd";
	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public static final String $dlv_loc_nm = "dlv_loc_nm";
	/**
	 * Delivery location supplier cd. 納入場所発注先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_loc_sppl_cd = "dlv_loc_sppl_cd";
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public static final String $str_ln_tgt_flg = "str_ln_tgt_flg";
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public static final String $str_ln_cd_none_flg = "str_ln_cd_none_flg";
	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public static final String $drct_dlv_typ = "drct_dlv_typ";
	/**
	 * Direct-delivery type name 直納区分名.<p>
	 *
	 */
	public static final String $drct_dlv_typ_nm = "drct_dlv_typ_nm";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Delivery destination calendar cd. 納品先カレンダＣＤ.<p>
	 *
	 */
	public static final String $scst_cal_cd = "scst_cal_cd";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $scst_cd = "scst_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $scst_nm = "scst_nm";
	/**
	 * Miscellaneous delivery destination flg. 納品先諸口ＦＬＧ.<p>
	 *
	 */
	public static final String $scst_sundry_flg = "scst_sundry_flg";
	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public static final String $scst_zip_cd = "scst_zip_cd";
	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public static final String $scst_addr1 = "scst_addr1";
	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public static final String $scst_addr2 = "scst_addr2";
	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public static final String $scst_addr3 = "scst_addr3";
	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public static final String $scst_addr4 = "scst_addr4";
	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public static final String $scst_tel = "scst_tel";
	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public static final String $scst_fax = "scst_fax";
	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public static final String $scst_cntry_cd = "scst_cntry_cd";
	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public static final String $scst_cntry_nm = "scst_cntry_nm";
	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public static final String $scst_cntct_dpt = "scst_cntct_dpt";
	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public static final String $scst_cntct_psn = "scst_cntct_psn";
	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public static final String $tdlv_cd = "tdlv_cd";
	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public static final String $tdlv_nm = "tdlv_nm";
	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public static final String $tdlv_cntct_dpt = "tdlv_cntct_dpt";
	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public static final String $tdlv_cntct_psn = "tdlv_cntct_psn";
	/**
	 * Miscellaneous receiving point flg. 配送先諸口ＦＬＧ.<p>
	 *
	 */
	public static final String $tdlv_sundry_flg = "tdlv_sundry_flg";
	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public static final String $tdlv_zip_cd = "tdlv_zip_cd";
	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public static final String $tdlv_addr1 = "tdlv_addr1";
	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public static final String $tdlv_addr2 = "tdlv_addr2";
	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public static final String $tdlv_addr3 = "tdlv_addr3";
	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public static final String $tdlv_addr4 = "tdlv_addr4";
	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public static final String $tdlv_tel = "tdlv_tel";
	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public static final String $tdlv_fax = "tdlv_fax";
	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public static final String $tdlv_cntry_cd = "tdlv_cntry_cd";
	/**
	 * Receiving point country name 配送先国名.<p>
	 *
	 */
	public static final String $tdlv_cntry_nm = "tdlv_cntry_nm";
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
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Vendor lot required 業者ロット必須.<p>
	 *
	 */
	public static final String $bp_lot_flg = "bp_lot_flg";
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public static final String $bp_dlv_slip_no = "bp_dlv_slip_no";
	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $bp_dlv_slip_d_no = "bp_dlv_slip_d_no";
	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public static final String $ship_fr_valid_dt = "ship_fr_valid_dt";
	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public static final String $upri_not_tgt_flg = "upri_not_tgt_flg";
	/**
	 * Details correction 明細訂正.<p>
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
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public static final String $trd_cur_inc_tax_amt = "trd_cur_inc_tax_amt";
	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
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
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public static final String $trd_cur_proc_upri = "trd_cur_proc_upri";
	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public static final String $trd_cur_proc_amt = "trd_cur_proc_amt";
	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public static final String $trd_cur_onr_prov_upri = "trd_cur_onr_prov_upri";
	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public static final String $trd_cur_onr_prov_amt = "trd_cur_onr_prov_amt";
	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
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
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public static final String $tax_typ = "tax_typ";
	/**
	 * Tax specified flg. 税指定ＦＬＧ.<p>
	 *
	 */
	public static final String $tax_fix_flg = "tax_fix_flg";
	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
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
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public static final String $base_cur_dscnt_amt = "base_cur_dscnt_amt";
	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public static final String $base_cur_proc_upri = "base_cur_proc_upri";
	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public static final String $base_cur_proc_amt = "base_cur_proc_amt";
	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public static final String $base_cur_onr_prov_upri = "base_cur_onr_prov_upri";
	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public static final String $base_cur_onr_prov_amt = "base_cur_onr_prov_amt";
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
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public static final String $ptax_cur_dscnt_amt = "ptax_cur_dscnt_amt";
	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public static final String $ptax_cur_proc_upri = "ptax_cur_proc_upri";
	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public static final String $ptax_cur_proc_amt = "ptax_cur_proc_amt";
	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public static final String $ptax_cur_onr_prov_upri = "ptax_cur_onr_prov_upri";
	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public static final String $ptax_cur_onr_prov_amt = "ptax_cur_onr_prov_amt";
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public static final String $trd_cur_wtax_amt = "trd_cur_wtax_amt";
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
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public static final String $purc_rsn_cd = "purc_rsn_cd";
	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public static final String $purc_rsn_nm = "purc_rsn_nm";
	/**
	 * Expenses purchasing flg. 経費購買ＦＬＧ.<p>
	 *
	 */
	public static final String $xpns_purc_flg = "xpns_purc_flg";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public static final String $ap_dpt_nm = "ap_dpt_nm";
	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public static final String $pay_crryovr_times = "pay_crryovr_times";
	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public static final String $purc_usr_cd = "purc_usr_cd";
	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public static final String $purc_usr_nm = "purc_usr_nm";
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_cd = "purc_dpt_cd";
	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public static final String $purc_dpt_nm = "purc_dpt_nm";
	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public static final String $ap_dpt_flg = "ap_dpt_flg";
	/**
	 * Purchasing dept. WG cd. 購買部門ＷＧＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_wg_cd = "purc_dpt_wg_cd";
	/**
	 * Purchasing dept. WG name 購買部門ＷＧ名.<p>
	 *
	 */
	public static final String $purc_dpt_wg_nm = "purc_dpt_wg_nm";
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public static final String $bd_dpt_nm = "bd_dpt_nm";
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
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public static final String $bd_loc_cd = "bd_loc_cd";
	/**
	 * Charged location name 負担場所名.<p>
	 *
	 */
	public static final String $bd_loc_nm = "bd_loc_nm";
	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public static final String $bd_ctg_cd = "bd_ctg_cd";
	/**
	 * Charged item group name 負担品群名.<p>
	 *
	 */
	public static final String $bd_ctg_nm = "bd_ctg_nm";
	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public static final String $bd_oper_cd = "bd_oper_cd";
	/**
	 * Charged operation name 負担工程名.<p>
	 *
	 */
	public static final String $bd_oper_nm = "bd_oper_nm";
	/**
	 * Charged I/V No. 負担Ｉ／ＶＮＯ.<p>
	 *
	 */
	public static final String $bd_iv_no = "bd_iv_no";
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
	 * Purchase invoice details remarks 受領インボイス明細備考.<p>
	 *
	 */
	public static final String $rcpt_iv_d_rmrks = "rcpt_iv_d_rmrks";
	/**
	 * Purchase invoice internal details remark 受領インボイス内部明細備考.<p>
	 *
	 */
	public static final String $rcpt_iv_intr_d_rmrks = "rcpt_iv_intr_d_rmrks";
	/**
	 * Purchase invoice details spare 1 受領インボイス明細予備１.<p>
	 *
	 */
	public static final String $rcpt_iv_d_sub_char1 = "rcpt_iv_d_sub_char1";
	/**
	 * Purchase invoice details spare 2 受領インボイス明細予備２.<p>
	 *
	 */
	public static final String $rcpt_iv_d_sub_char2 = "rcpt_iv_d_sub_char2";
	/**
	 * Purchase invoice details spare 3 受領インボイス明細予備３.<p>
	 *
	 */
	public static final String $rcpt_iv_d_sub_char3 = "rcpt_iv_d_sub_char3";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_d_rmrks = "intr_d_rmrks";
	/**
	 * Purchase result details spare 1 仕入実績明細予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Purchase result details spare 2 仕入実績明細予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Purchase result details spare 3 仕入実績明細予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public static final String $po_print_d_rmrks = "po_print_d_rmrks";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public static final String $purc_cont_qty = "purc_cont_qty";
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
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $arr_pr_no = "arr_pr_no";
	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public static final String $arr_pr_upd_cntr = "arr_pr_upd_cntr";
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $lot_no_typ = "lot_no_typ";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
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
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public static final String $bd_lot_mng_typ = "bd_lot_mng_typ";
	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $bd_lot_no_typ = "bd_lot_no_typ";
	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public static final String $bd_sublot_mng_typ = "bd_sublot_mng_typ";
	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $bd_sublot_no_typ = "bd_sublot_no_typ";
	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $bd_sno1_mng_typ = "bd_sno1_mng_typ";
	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $bd_sno2_mng_typ = "bd_sno2_mng_typ";
	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $bd_sno3_mng_typ = "bd_sno3_mng_typ";
	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $bd_sno4_mng_typ = "bd_sno4_mng_typ";
	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public static final String $loc_mng_typ = "loc_mng_typ";
	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public static final String $purc_upri_cng_flg = "purc_upri_cng_flg";
	/**
	 * Update counter (Purchase result header) 更新カウンタ（仕入実績ヘッダ）.<p>
	 *
	 */
	public static final String $purc_act_upd_cntr = "purc_act_upd_cntr";
	/**
	 * Manual add マニュアル追加.<p>
	 *
	 */
	public static final String $manual_add_flg = "manual_add_flg";
	public static final String $sls_sync_flg = "sls_sync_flg";
	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public static final String $base_unit_purc_act_qty = "base_unit_purc_act_qty";


	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta schd_unit_cd_META = createCommonMeta($schd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta schd_trd_unit_conv_qty_META = createCommonMeta($schd_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_trd_unit_conv_base_qty_META = createCommonMeta($schd_trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_trd_unit_dec_place_META = createCommonMeta($schd_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta schd_trd_unit_rnd_typ_META = createCommonMeta($schd_trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta purc_id_typ_META = createCommonMeta($purc_id_typ, mcframe.commonMA.meta.MA_META.PURC_ID_TYP);
	public static final MCMeta purc_id_typ_nm_META = createCommonMeta($purc_id_typ_nm, mcframe.commonMA.meta.MA_META.PURC_ID_TYP_NM);
	public static final MCMeta arr_skip_flg_META = createCommonMeta($arr_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_ddlv_flg_META = createCommonMeta($purc_ddlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_schd_dt_META = createCommonMeta($arr_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_schd_dt_META = createCommonMeta($purc_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta schd_sync_flg_META = createCommonMeta($schd_sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_ptn_typ_META = createCommonMeta($arr_ptn_typ, mcframe.commonMA.meta.MA_META.ARR_PTN_TYP);
	public static final MCMeta sync_flg_META = createCommonMeta($sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_basis_typ_META = createCommonMeta($purc_basis_typ, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP);
	public static final MCMeta purc_basis_typ_nm_META = createCommonMeta($purc_basis_typ_nm, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP_NM);
	public static final MCMeta arr_act_flg_META = createCommonMeta($arr_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta rcpt_iv_d_no_META = createCommonMeta($rcpt_iv_d_no, mcframe.commonMA.meta.MA_META.RCPT_IV_D_NO);
	public static final MCMeta purc_schd_no_META = createCommonMeta($purc_schd_no, mcframe.commonMA.meta.MA_META.PURC_SCHD_NO);
	public static final MCMeta arr_schd_no_META = createCommonMeta($arr_schd_no, mcframe.commonMA.meta.MA_META.ARR_SCHD_NO);
	public static final MCMeta temp_ap_flg_META = createCommonMeta($temp_ap_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_purc_flg_META = createCommonMeta($non_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta purc_act_seq_META = createCommonMeta($purc_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta purc_act_rev_META = createCommonMeta($purc_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta purc_act_d_seq_META = createCommonMeta($purc_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta asset_mng_typ_nm_META = createCommonMeta($asset_mng_typ_nm, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta exim_xpns_typ_META = createCommonMeta($exim_xpns_typ, mcframe.commonMA.meta.MA_META.EXIM_XPNS_TYP);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cntry_org_cd_META = createCommonMeta($cntry_org_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_org_nm_META = createCommonMeta($cntry_org_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta src_trd_unit_cd_META = createCommonMeta($src_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta src_trd_unit_conv_qty_META = createCommonMeta($src_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta src_trd_unit_conv_base_qty_META = createCommonMeta($src_trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta src_trd_unit_dec_place_META = createCommonMeta($src_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta src_trd_unit_rnd_typ_META = createCommonMeta($src_trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta src_trd_unit_qty_META = createCommonMeta($src_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta src_base_unit_qty_META = createCommonMeta($src_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta src_trd_cur_upri_META = createCommonMeta($src_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_proc_upri_META = createCommonMeta($src_trd_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_onr_prov_upri_META = createCommonMeta($src_trd_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_dscnt_amt_META = createCommonMeta($src_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_amt_META = createCommonMeta($src_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_proc_amt_META = createCommonMeta($src_trd_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_onr_prov_amt_META = createCommonMeta($src_trd_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_tax_amt_META = createCommonMeta($src_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_wtax_rate_META = createCommonMeta($src_wtax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta src_tax_cd_META = createCommonMeta($src_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta src_tax_nm_META = createCommonMeta($src_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta src_tax_rate_META = createCommonMeta($src_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta src_tax_typ_META = createCommonMeta($src_tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta src_inc_tax_flg_META = createCommonMeta($src_inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta accpt_dfct_flg_META = createCommonMeta($accpt_dfct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_schd_qty_META = createCommonMeta($trd_unit_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_schd_qty_META = createCommonMeta($base_unit_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_qty_bf_cng_META = createCommonMeta($base_unit_qty_bf_cng, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_purc_qty_META = createCommonMeta($base_unit_purc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_arr_qty_META = createCommonMeta($base_unit_arr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_accpt_dfct_qty_META = createCommonMeta($base_unit_accpt_dfct_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta re_arr_flg_META = createCommonMeta($re_arr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_arr_loc_cd_META = createCommonMeta($re_arr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta re_arr_loc_nm_META = createCommonMeta($re_arr_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta re_arr_loc_wg_cd_META = createCommonMeta($re_arr_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta re_arr_loc_wg_nm_META = createCommonMeta($re_arr_loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta re_arr_str_ln_tgt_flg_META = createCommonMeta($re_arr_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_arr_str_ln_cd_META = createCommonMeta($re_arr_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta re_arr_str_ln_nm_META = createCommonMeta($re_arr_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta re_arr_str_ln_cd_none_flg_META = createCommonMeta($re_arr_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_arr_loc_site_cd_META = createCommonMeta($re_arr_loc_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta re_arr_loc_cal_cd_META = createCommonMeta($re_arr_loc_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta re_arr_loc_sppl_cd_META = createCommonMeta($re_arr_loc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta re_arr_loc_sppl_cal_cd_META = createCommonMeta($re_arr_loc_sppl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta trd_unit_re_arr_qty_META = createCommonMeta($trd_unit_re_arr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta re_arr_rqst_dt_META = createCommonMeta($re_arr_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta re_arr_rqst_hm_META = createCommonMeta($re_arr_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta re_arr_purc_schd_dt_META = createCommonMeta($re_arr_purc_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta re_arr_sync_flg_META = createCommonMeta($re_arr_sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ncv_flg_META = createCommonMeta($ncv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta dlv_loc_wg_cd_META = createCommonMeta($dlv_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta dlv_loc_wg_nm_META = createCommonMeta($dlv_loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dlv_loc_cd_META = createCommonMeta($dlv_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta dlv_loc_nm_META = createCommonMeta($dlv_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta dlv_loc_sppl_cd_META = createCommonMeta($dlv_loc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta str_ln_tgt_flg_META = createCommonMeta($str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta str_ln_cd_none_flg_META = createCommonMeta($str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta drct_dlv_typ_META = createCommonMeta($drct_dlv_typ, mcframe.commonMS.meta.MS_META.DRCT_DLV_TYP);
	public static final MCMeta drct_dlv_typ_nm_META = createCommonMeta($drct_dlv_typ_nm, mcframe.commonMS.meta.MS_META.DRCT_DLV_TYP_NM);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta scst_cal_cd_META = createCommonMeta($scst_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta scst_cd_META = createCommonMeta($scst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta scst_nm_META = createCommonMeta($scst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta scst_sundry_flg_META = createCommonMeta($scst_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta scst_zip_cd_META = createCommonMeta($scst_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta scst_addr1_META = createCommonMeta($scst_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta scst_addr2_META = createCommonMeta($scst_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta scst_addr3_META = createCommonMeta($scst_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta scst_addr4_META = createCommonMeta($scst_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta scst_tel_META = createCommonMeta($scst_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta scst_fax_META = createCommonMeta($scst_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta scst_cntry_cd_META = createCommonMeta($scst_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta scst_cntry_nm_META = createCommonMeta($scst_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta scst_cntct_dpt_META = createCommonMeta($scst_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta scst_cntct_psn_META = createCommonMeta($scst_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta tdlv_cntct_dpt_META = createCommonMeta($tdlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta tdlv_cntct_psn_META = createCommonMeta($tdlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta tdlv_sundry_flg_META = createCommonMeta($tdlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_zip_cd_META = createCommonMeta($tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta tdlv_addr1_META = createCommonMeta($tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr2_META = createCommonMeta($tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr3_META = createCommonMeta($tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr4_META = createCommonMeta($tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_tel_META = createCommonMeta($tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_fax_META = createCommonMeta($tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_cntry_cd_META = createCommonMeta($tdlv_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta tdlv_cntry_nm_META = createCommonMeta($tdlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta bp_lot_flg_META = createCommonMeta($bp_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta bp_dlv_slip_no_META = createCommonMeta($bp_dlv_slip_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_NO);
	public static final MCMeta bp_dlv_slip_d_no_META = createCommonMeta($bp_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_D_NO);
	public static final MCMeta ship_fr_valid_dt_META = createCommonMeta($ship_fr_valid_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta upri_not_tgt_flg_META = createCommonMeta($upri_not_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dtl_upd_flg_META = createCommonMeta($purc_dtl_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_inc_tax_amt_META = createCommonMeta($trd_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_upri_typ_META = createCommonMeta($outsrc_upri_typ, mcframe.commonMA.meta.MA_META.OUTSRC_UPRI_TYP);
	public static final MCMeta trd_cur_proc_upri_META = createCommonMeta($trd_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_proc_amt_META = createCommonMeta($trd_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_onr_prov_upri_META = createCommonMeta($trd_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_onr_prov_amt_META = createCommonMeta($trd_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dscnt_rsn_cd_META = createCommonMeta($dscnt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta dscnt_rsn_nm_META = createCommonMeta($dscnt_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_typ_META = createCommonMeta($tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta tax_fix_flg_META = createCommonMeta($tax_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_cur_upri_META = createCommonMeta($base_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_inc_tax_amt_META = createCommonMeta($base_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_dscnt_amt_META = createCommonMeta($base_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_proc_upri_META = createCommonMeta($base_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_proc_amt_META = createCommonMeta($base_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_onr_prov_upri_META = createCommonMeta($base_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_onr_prov_amt_META = createCommonMeta($base_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_upri_META = createCommonMeta($ptax_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_amt_META = createCommonMeta($ptax_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_tax_amt_META = createCommonMeta($ptax_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_inc_tax_amt_META = createCommonMeta($ptax_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_dscnt_amt_META = createCommonMeta($ptax_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_proc_upri_META = createCommonMeta($ptax_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_proc_amt_META = createCommonMeta($ptax_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_onr_prov_upri_META = createCommonMeta($ptax_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_onr_prov_amt_META = createCommonMeta($ptax_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta trd_cur_wtax_amt_META = createCommonMeta($trd_cur_wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta purc_rsn_cd_META = createCommonMeta($purc_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta purc_rsn_nm_META = createCommonMeta($purc_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta xpns_purc_flg_META = createCommonMeta($xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta pay_crryovr_times_META = createCommonMeta($pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta purc_usr_cd_META = createCommonMeta($purc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta purc_usr_nm_META = createCommonMeta($purc_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta purc_dpt_cd_META = createCommonMeta($purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta purc_dpt_nm_META = createCommonMeta($purc_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ap_dpt_flg_META = createCommonMeta($ap_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dpt_wg_cd_META = createCommonMeta($purc_dpt_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta purc_dpt_wg_nm_META = createCommonMeta($purc_dpt_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta bd_itm_cd_META = createCommonMeta($bd_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta bd_itm_sub1_META = createCommonMeta($bd_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta bd_itm_sub2_META = createCommonMeta($bd_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta bd_itm_sub3_META = createCommonMeta($bd_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta bd_itm_nm_META = createCommonMeta($bd_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta bd_lot_no_META = createCommonMeta($bd_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta bd_sublot_no_META = createCommonMeta($bd_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta bd_sno1_META = createCommonMeta($bd_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta bd_sno2_META = createCommonMeta($bd_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta bd_sno3_META = createCommonMeta($bd_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta bd_sno4_META = createCommonMeta($bd_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta bd_bp_cd_META = createCommonMeta($bd_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bd_bp_nm_META = createCommonMeta($bd_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bd_loc_cd_META = createCommonMeta($bd_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta bd_loc_nm_META = createCommonMeta($bd_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta bd_ctg_cd_META = createCommonMeta($bd_ctg_cd, mcframe.commonMA.meta.MA_META.COST_CTG_CD);
	public static final MCMeta bd_ctg_nm_META = createCommonMeta($bd_ctg_nm, mcframe.commonMA.meta.MA_META.COST_CTG_NM);
	public static final MCMeta bd_oper_cd_META = createCommonMeta($bd_oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta bd_oper_nm_META = createCommonMeta($bd_oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta bd_iv_no_META = createCommonMeta($bd_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta bd_po_no_META = createCommonMeta($bd_po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta bd_slo_no_META = createCommonMeta($bd_slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta rcpt_iv_d_rmrks_META = createCommonMeta($rcpt_iv_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta rcpt_iv_intr_d_rmrks_META = createCommonMeta($rcpt_iv_intr_d_rmrks, mcframe.commonMS.meta.MS_META.RCPT_IV_INTR_D_RMRKS);
	public static final MCMeta rcpt_iv_d_sub_char1_META = createCommonMeta($rcpt_iv_d_sub_char1, mcframe.commonMS.meta.MS_META.RCPT_IV_D_SUB_CHAR1);
	public static final MCMeta rcpt_iv_d_sub_char2_META = createCommonMeta($rcpt_iv_d_sub_char2, mcframe.commonMS.meta.MS_META.RCPT_IV_D_SUB_CHAR2);
	public static final MCMeta rcpt_iv_d_sub_char3_META = createCommonMeta($rcpt_iv_d_sub_char3, mcframe.commonMS.meta.MS_META.RCPT_IV_D_SUB_CHAR3);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_d_rmrks_META = createCommonMeta($intr_d_rmrks, mcframe.commonMS.meta.MS_META.PO_D_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PURC_ACT_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PURC_ACT_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PURC_ACT_D_SUB_CHAR3);
	public static final MCMeta po_print_d_rmrks_META = createCommonMeta($po_print_d_rmrks, mcframe.commonMS.meta.MS_META.PO_PRINT_D_RMRKS);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cont_qty_META = createCommonMeta($purc_cont_qty, mcframe.commonMA.meta.MA_META.PURC_CONT_QTY);
	public static final MCMeta purc_cont_fctr_META = createCommonMeta($purc_cont_fctr, mcframe.commonMA.meta.MA_META.PURC_CONT_FCTR);
	public static final MCMeta std_cont_qty_META = createCommonMeta($std_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta cont_fctr_unit_nm_META = createCommonMeta($cont_fctr_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta arr_pr_no_META = createCommonMeta($arr_pr_no, mcframe.commonMA.meta.MA_META.ARR_PR_NO);
	public static final MCMeta arr_pr_upd_cntr_META = createCommonMeta($arr_pr_upd_cntr, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta lot_no_typ_META = createCommonMeta($lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sublot_no_typ_META = createCommonMeta($sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_lot_mng_typ_META = createCommonMeta($bd_lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta bd_lot_no_typ_META = createCommonMeta($bd_lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta bd_sublot_mng_typ_META = createCommonMeta($bd_sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta bd_sublot_no_typ_META = createCommonMeta($bd_sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta bd_sno1_mng_typ_META = createCommonMeta($bd_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno2_mng_typ_META = createCommonMeta($bd_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno3_mng_typ_META = createCommonMeta($bd_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno4_mng_typ_META = createCommonMeta($bd_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_mng_typ_META = createCommonMeta($loc_mng_typ, mcframe.commonMA.meta.MA_META.LOC_MNG_TYP);
	public static final MCMeta purc_upri_cng_flg_META = createCommonMeta($purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_act_upd_cntr_META = createCommonMeta($purc_act_upd_cntr, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta manual_add_flg_META = createCommonMeta($manual_add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_sync_flg_META = createCommonMeta($sls_sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_purc_act_qty_META = createCommonMeta($base_unit_purc_act_qty, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<Srch01_DtlR> constMetas = new ConstMetaList<Srch01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			peg_no_META,
			schd_unit_cd_META,
			schd_trd_unit_conv_qty_META,
			schd_trd_unit_conv_base_qty_META,
			schd_trd_unit_dec_place_META,
			schd_trd_unit_rnd_typ_META,
			err_flg_META,
			outsrc_flg_META,
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			purc_id_typ_META,
			purc_id_typ_nm_META,
			arr_skip_flg_META,
			purc_ddlv_flg_META,
			arr_schd_dt_META,
			purc_schd_dt_META,
			schd_sync_flg_META,
			arr_ptn_typ_META,
			sync_flg_META,
			purc_basis_typ_META,
			purc_basis_typ_nm_META,
			arr_act_flg_META,
			mfg_inst_no_META,
			mfg_loc_cd_META,
			bom_ptn_META,
			po_no_META,
			po_d_no_META,
			rcpt_iv_d_no_META,
			purc_schd_no_META,
			arr_schd_no_META,
			temp_ap_flg_META,
			non_purc_flg_META,
			purc_act_no_META,
			purc_act_seq_META,
			purc_act_rev_META,
			purc_act_d_no_META,
			purc_act_d_seq_META,
			asset_mng_typ_META,
			asset_mng_typ_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			iv_itm_nm_META,
			sundry_itm_flg_META,
			exim_xpns_typ_META,
			maker_cd_META,
			maker_nm_META,
			cntry_org_cd_META,
			cntry_org_nm_META,
			src_trd_unit_cd_META,
			src_trd_unit_conv_qty_META,
			src_trd_unit_conv_base_qty_META,
			src_trd_unit_dec_place_META,
			src_trd_unit_rnd_typ_META,
			src_trd_unit_qty_META,
			src_base_unit_qty_META,
			src_trd_cur_upri_META,
			src_trd_cur_proc_upri_META,
			src_trd_cur_onr_prov_upri_META,
			src_trd_cur_dscnt_amt_META,
			src_trd_cur_amt_META,
			src_trd_cur_proc_amt_META,
			src_trd_cur_onr_prov_amt_META,
			src_trd_cur_tax_amt_META,
			src_wtax_rate_META,
			src_tax_cd_META,
			src_tax_nm_META,
			src_tax_rate_META,
			src_tax_typ_META,
			src_inc_tax_flg_META,
			accpt_dfct_flg_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_schd_qty_META,
			trd_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_schd_qty_META,
			base_unit_qty_bf_cng_META,
			base_unit_qty_META,
			base_unit_purc_qty_META,
			base_unit_arr_qty_META,
			base_unit_accpt_dfct_qty_META,
			re_arr_flg_META,
			re_arr_loc_cd_META,
			re_arr_loc_nm_META,
			re_arr_loc_wg_cd_META,
			re_arr_loc_wg_nm_META,
			re_arr_str_ln_tgt_flg_META,
			re_arr_str_ln_cd_META,
			re_arr_str_ln_nm_META,
			re_arr_str_ln_cd_none_flg_META,
			re_arr_loc_site_cd_META,
			re_arr_loc_cal_cd_META,
			re_arr_loc_sppl_cd_META,
			re_arr_loc_sppl_cal_cd_META,
			trd_unit_re_arr_qty_META,
			re_arr_rqst_dt_META,
			re_arr_rqst_hm_META,
			re_arr_purc_schd_dt_META,
			re_arr_sync_flg_META,
			abort_flg_META,
			ncv_flg_META,
			gd_cd_META,
			gd_nm_META,
			quality_typ_META,
			quality_typ_nm_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META,
			dlv_loc_wg_cd_META,
			dlv_loc_wg_nm_META,
			dlv_loc_cd_META,
			dlv_loc_nm_META,
			dlv_loc_sppl_cd_META,
			str_ln_tgt_flg_META,
			str_ln_cd_META,
			str_ln_nm_META,
			str_ln_cd_none_flg_META,
			drct_dlv_typ_META,
			drct_dlv_typ_nm_META,
			slo_d_no_META,
			slo_no_META,
			scst_cal_cd_META,
			scst_cd_META,
			scst_nm_META,
			scst_sundry_flg_META,
			scst_zip_cd_META,
			scst_addr1_META,
			scst_addr2_META,
			scst_addr3_META,
			scst_addr4_META,
			scst_tel_META,
			scst_fax_META,
			scst_cntry_cd_META,
			scst_cntry_nm_META,
			scst_cntct_dpt_META,
			scst_cntct_psn_META,
			tdlv_cd_META,
			tdlv_nm_META,
			tdlv_cntct_dpt_META,
			tdlv_cntct_psn_META,
			tdlv_sundry_flg_META,
			tdlv_zip_cd_META,
			tdlv_addr1_META,
			tdlv_addr2_META,
			tdlv_addr3_META,
			tdlv_addr4_META,
			tdlv_tel_META,
			tdlv_fax_META,
			tdlv_cntry_cd_META,
			tdlv_cntry_nm_META,
			lot_no_META,
			sublot_no_META,
			site_cd_META,
			ver_flg_META,
			ver_no_META,
			bp_lot_flg_META,
			bp_lot_no_META,
			bp_dlv_slip_no_META,
			bp_dlv_slip_d_no_META,
			ship_fr_valid_dt_META,
			upri_not_tgt_flg_META,
			purc_dtl_upd_flg_META,
			trd_cur_upri_META,
			trd_cur_amt_META,
			trd_cur_tax_amt_META,
			trd_cur_inc_tax_amt_META,
			trd_cur_dscnt_amt_META,
			repurc_obli_flg_META,
			outsrc_upri_typ_META,
			trd_cur_proc_upri_META,
			trd_cur_proc_amt_META,
			trd_cur_onr_prov_upri_META,
			trd_cur_onr_prov_amt_META,
			interim_flg_META,
			dscnt_rsn_cd_META,
			dscnt_rsn_nm_META,
			tax_cd_META,
			tax_nm_META,
			tax_rate_META,
			tax_typ_META,
			tax_fix_flg_META,
			inc_tax_flg_META,
			base_cur_upri_META,
			base_cur_amt_META,
			base_cur_tax_amt_META,
			base_cur_inc_tax_amt_META,
			base_cur_dscnt_amt_META,
			base_cur_proc_upri_META,
			base_cur_proc_amt_META,
			base_cur_onr_prov_upri_META,
			base_cur_onr_prov_amt_META,
			ptax_cur_upri_META,
			ptax_cur_amt_META,
			ptax_cur_tax_amt_META,
			ptax_cur_inc_tax_amt_META,
			ptax_cur_dscnt_amt_META,
			ptax_cur_proc_upri_META,
			ptax_cur_proc_amt_META,
			ptax_cur_onr_prov_upri_META,
			ptax_cur_onr_prov_amt_META,
			wtax_rate_META,
			trd_cur_wtax_amt_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			purc_rsn_cd_META,
			purc_rsn_nm_META,
			xpns_purc_flg_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			pay_crryovr_times_META,
			purc_usr_cd_META,
			purc_usr_nm_META,
			purc_dpt_cd_META,
			purc_dpt_nm_META,
			ap_dpt_flg_META,
			purc_dpt_wg_cd_META,
			purc_dpt_wg_nm_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			bd_itm_cd_META,
			bd_itm_sub1_META,
			bd_itm_sub2_META,
			bd_itm_sub3_META,
			bd_itm_nm_META,
			bd_lot_no_META,
			bd_sublot_no_META,
			bd_sno1_META,
			bd_sno2_META,
			bd_sno3_META,
			bd_sno4_META,
			bd_bp_cd_META,
			bd_bp_nm_META,
			bd_loc_cd_META,
			bd_loc_nm_META,
			bd_ctg_cd_META,
			bd_ctg_nm_META,
			bd_oper_cd_META,
			bd_oper_nm_META,
			bd_iv_no_META,
			bd_po_no_META,
			bd_slo_no_META,
			rcpt_iv_d_rmrks_META,
			rcpt_iv_intr_d_rmrks_META,
			rcpt_iv_d_sub_char1_META,
			rcpt_iv_d_sub_char2_META,
			rcpt_iv_d_sub_char3_META,
			trd_d_rmrks_META,
			intr_d_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			po_print_d_rmrks_META,
			cont_fctr_flg_META,
			purc_cont_qty_META,
			purc_cont_fctr_META,
			std_cont_qty_META,
			std_cont_fctr_META,
			cont_fctr_unit_cd_META,
			cont_fctr_unit_nm_META,
			cont_fctr_rnd_typ_META,
			cont_fctr_dec_place_META,
			disp_seq_META,
			arr_pr_no_META,
			arr_pr_upd_cntr_META,
			stk_mng_typ_META,
			lot_mng_typ_META,
			lot_no_typ_META,
			sublot_mng_typ_META,
			sublot_no_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			bd_lot_mng_typ_META,
			bd_lot_no_typ_META,
			bd_sublot_mng_typ_META,
			bd_sublot_no_typ_META,
			bd_sno1_mng_typ_META,
			bd_sno2_mng_typ_META,
			bd_sno3_mng_typ_META,
			bd_sno4_mng_typ_META,
			dscnt_itm_flg_META,
			loc_mng_typ_META,
			purc_upri_cng_flg_META,
			purc_act_upd_cntr_META,
			manual_add_flg_META,
			sls_sync_flg_META,
			base_unit_purc_act_qty_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$purc_id_typ, "MAC_PURC_ID_TYP"},	// purc_id_typ
				{$purc_basis_typ, "MAC_PURC_BASIS_TYP"},	// purc_basis_typ
				{$asset_mng_typ, "MAC_ASSET_MNG_TYP"},	// asset_mng_typ
				{$quality_typ, "MAC_QUALITY_TYP"},	// quality_typ
				{$drct_dlv_typ, "MSC_DRCT_DLV_TYP"}	// drct_dlv_typ
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
	protected Srch01_DtlR_MC_A(ConstMetaList<? extends Srch01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR clone() {
		return (Srch01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR createInstance() {
		return (Srch01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR getValues(String... names) {
		return (Srch01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 0, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}


	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 1, $peg_no, value);
	}


	/**
	 * Schedule unit cd. 予定単位ＣＤ.<p>
	 *
	 */
	public String schd_unit_cd() {
		return getConstString(offset + 2, $schd_unit_cd);
	}

	/**
	 * Schedule unit cd. 予定単位ＣＤ.<p>
	 *
	 */
	public void schd_unit_cd(String value) {
		setConstString(offset + 2, $schd_unit_cd, value);
	}


	/**
	 * Schedule transaction unit conversion qty. 予定取引単位換算数量.<p>
	 *
	 */
	public MCNumber schd_trd_unit_conv_qty() {
		return getConstNumber(offset + 3, $schd_trd_unit_conv_qty);
	}

	/**
	 * Schedule transaction unit conversion qty. 予定取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 3, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Schedule transaction unit conversion qty. 予定取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 3, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Schedule transaction unit conversion qty. 予定取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 3, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Schedule transaction unit conversion qty. 予定取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 3, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Schedule transaction unit conversion qty. 予定取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 3, $schd_trd_unit_conv_qty, value);
	}


	/**
	 * Schedule transaction unit conversion base qty. 予定取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber schd_trd_unit_conv_base_qty() {
		return getConstNumber(offset + 4, $schd_trd_unit_conv_base_qty);
	}

	/**
	 * Schedule transaction unit conversion base qty. 予定取引単位換算基準数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 4, $schd_trd_unit_conv_base_qty, value);
	}

	/**
	 * Schedule transaction unit conversion base qty. 予定取引単位換算基準数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 4, $schd_trd_unit_conv_base_qty, value);
	}

	/**
	 * Schedule transaction unit conversion base qty. 予定取引単位換算基準数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 4, $schd_trd_unit_conv_base_qty, value);
	}

	/**
	 * Schedule transaction unit conversion base qty. 予定取引単位換算基準数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 4, $schd_trd_unit_conv_base_qty, value);
	}

	/**
	 * Schedule transaction unit conversion base qty. 予定取引単位換算基準数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 4, $schd_trd_unit_conv_base_qty, value);
	}


	/**
	 * Schedule transaction unit number of decimal places 予定取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber schd_trd_unit_dec_place() {
		return getConstNumber(offset + 5, $schd_trd_unit_dec_place);
	}

	/**
	 * Schedule transaction unit number of decimal places 予定取引単位小数部有効桁数.<p>
	 *
	 */
	public void schd_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 5, $schd_trd_unit_dec_place, value);
	}

	/**
	 * Schedule transaction unit number of decimal places 予定取引単位小数部有効桁数.<p>
	 *
	 */
	public void schd_trd_unit_dec_place(int value) {
		setConstNumber(offset + 5, $schd_trd_unit_dec_place, value);
	}

	/**
	 * Schedule transaction unit number of decimal places 予定取引単位小数部有効桁数.<p>
	 *
	 */
	public void schd_trd_unit_dec_place(long value) {
		setConstNumber(offset + 5, $schd_trd_unit_dec_place, value);
	}

	/**
	 * Schedule transaction unit number of decimal places 予定取引単位小数部有効桁数.<p>
	 *
	 */
	public void schd_trd_unit_dec_place(float value) {
		setConstNumber(offset + 5, $schd_trd_unit_dec_place, value);
	}

	/**
	 * Schedule transaction unit number of decimal places 予定取引単位小数部有効桁数.<p>
	 *
	 */
	public void schd_trd_unit_dec_place(double value) {
		setConstNumber(offset + 5, $schd_trd_unit_dec_place, value);
	}


	/**
	 * Schedule transaction unit rounding type 予定取引単位端数処理区分.<p>
	 *
	 */
	public String schd_trd_unit_rnd_typ() {
		return getConstString(offset + 6, $schd_trd_unit_rnd_typ);
	}

	/**
	 * Schedule transaction unit rounding type 予定取引単位端数処理区分.<p>
	 *
	 */
	public void schd_trd_unit_rnd_typ(String value) {
		setConstString(offset + 6, $schd_trd_unit_rnd_typ, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 7, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 7, $err_flg, value);
	}


	/**
	 * Subcontracting flg. 外注ＦＬＧ.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return getConstBoolean(offset + 8, $outsrc_flg);
	}

	/**
	 * Subcontracting flg. 外注ＦＬＧ.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		setConstBoolean(offset + 8, $outsrc_flg, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 9, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 9, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 10, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 10, $trd_nm, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 11, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 11, $trd_ptn_typ, value);
	}


	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return getConstString(offset + 12, $purc_id_typ);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		setConstString(offset + 12, $purc_id_typ, value);
	}


	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public String purc_id_typ_nm() {
		return getConstString(offset + 13, $purc_id_typ_nm);
	}

	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public void purc_id_typ_nm(String value) {
		setConstString(offset + 13, $purc_id_typ_nm, value);
	}


	/**
	 * Not receipt flg. 入荷不要ＦＬＧ.<p>
	 *
	 */
	public boolean arr_skip_flg() {
		return getConstBoolean(offset + 14, $arr_skip_flg);
	}

	/**
	 * Not receipt flg. 入荷不要ＦＬＧ.<p>
	 *
	 */
	public void arr_skip_flg(boolean value) {
		setConstBoolean(offset + 14, $arr_skip_flg, value);
	}


	/**
	 * Direct delivery flg. 仕入直送ＦＬＧ.<p>
	 *
	 */
	public boolean purc_ddlv_flg() {
		return getConstBoolean(offset + 15, $purc_ddlv_flg);
	}

	/**
	 * Direct delivery flg. 仕入直送ＦＬＧ.<p>
	 *
	 */
	public void purc_ddlv_flg(boolean value) {
		setConstBoolean(offset + 15, $purc_ddlv_flg, value);
	}


	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public MCDate arr_schd_dt() {
		return getConstDate(offset + 16, $arr_schd_dt);
	}

	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public void arr_schd_dt(MCDate value) {
		setConstDate(offset + 16, $arr_schd_dt, value);
	}


	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return getConstDate(offset + 17, $purc_schd_dt);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		setConstDate(offset + 17, $purc_schd_dt, value);
	}


	/**
	 * Receipt schedule simultaneously recording flg. 入荷予定同時計上ＦＬＧ.<p>
	 *
	 */
	public boolean schd_sync_flg() {
		return getConstBoolean(offset + 18, $schd_sync_flg);
	}

	/**
	 * Receipt schedule simultaneously recording flg. 入荷予定同時計上ＦＬＧ.<p>
	 *
	 */
	public void schd_sync_flg(boolean value) {
		setConstBoolean(offset + 18, $schd_sync_flg, value);
	}


	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public String arr_ptn_typ() {
		return getConstString(offset + 19, $arr_ptn_typ);
	}

	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public void arr_ptn_typ(String value) {
		setConstString(offset + 19, $arr_ptn_typ, value);
	}


	/**
	 * Receipt simultaneously recording flg. 入荷同時計上ＦＬＧ.<p>
	 *
	 */
	public boolean sync_flg() {
		return getConstBoolean(offset + 20, $sync_flg);
	}

	/**
	 * Receipt simultaneously recording flg. 入荷同時計上ＦＬＧ.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		setConstBoolean(offset + 20, $sync_flg, value);
	}


	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public String purc_basis_typ() {
		return getConstString(offset + 21, $purc_basis_typ);
	}

	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public void purc_basis_typ(String value) {
		setConstString(offset + 21, $purc_basis_typ, value);
	}


	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public String purc_basis_typ_nm() {
		return getConstString(offset + 22, $purc_basis_typ_nm);
	}

	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public void purc_basis_typ_nm(String value) {
		setConstString(offset + 22, $purc_basis_typ_nm, value);
	}


	/**
	 * Receipt result flg. 入荷実績ＦＬＧ.<p>
	 *
	 */
	public boolean arr_act_flg() {
		return getConstBoolean(offset + 23, $arr_act_flg);
	}

	/**
	 * Receipt result flg. 入荷実績ＦＬＧ.<p>
	 *
	 */
	public void arr_act_flg(boolean value) {
		setConstBoolean(offset + 23, $arr_act_flg, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 24, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 24, $mfg_inst_no, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 25, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 25, $mfg_loc_cd, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 26, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 26, $bom_ptn, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 27, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 27, $po_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 28, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 28, $po_d_no, value);
	}


	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_d_no() {
		return getConstString(offset + 29, $rcpt_iv_d_no);
	}

	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_d_no(String value) {
		setConstString(offset + 29, $rcpt_iv_d_no, value);
	}


	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public String purc_schd_no() {
		return getConstString(offset + 30, $purc_schd_no);
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public void purc_schd_no(String value) {
		setConstString(offset + 30, $purc_schd_no, value);
	}


	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return getConstString(offset + 31, $arr_schd_no);
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		setConstString(offset + 31, $arr_schd_no, value);
	}


	/**
	 * Temporary flg. 暫定ＦＬＧ.<p>
	 *
	 */
	public boolean temp_ap_flg() {
		return getConstBoolean(offset + 32, $temp_ap_flg);
	}

	/**
	 * Temporary flg. 暫定ＦＬＧ.<p>
	 *
	 */
	public void temp_ap_flg(boolean value) {
		setConstBoolean(offset + 32, $temp_ap_flg, value);
	}


	/**
	 * Not for purchase flg. 仕入対象外ＦＬＧ.<p>
	 *
	 */
	public boolean non_purc_flg() {
		return getConstBoolean(offset + 33, $non_purc_flg);
	}

	/**
	 * Not for purchase flg. 仕入対象外ＦＬＧ.<p>
	 *
	 */
	public void non_purc_flg(boolean value) {
		setConstBoolean(offset + 33, $non_purc_flg, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 34, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 34, $purc_act_no, value);
	}


	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public MCNumber purc_act_seq() {
		return getConstNumber(offset + 35, $purc_act_seq);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(MCNumber value) {
		setConstNumber(offset + 35, $purc_act_seq, value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(int value) {
		setConstNumber(offset + 35, $purc_act_seq, value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(long value) {
		setConstNumber(offset + 35, $purc_act_seq, value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(float value) {
		setConstNumber(offset + 35, $purc_act_seq, value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(double value) {
		setConstNumber(offset + 35, $purc_act_seq, value);
	}


	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public MCNumber purc_act_rev() {
		return getConstNumber(offset + 36, $purc_act_rev);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(MCNumber value) {
		setConstNumber(offset + 36, $purc_act_rev, value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(int value) {
		setConstNumber(offset + 36, $purc_act_rev, value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(long value) {
		setConstNumber(offset + 36, $purc_act_rev, value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(float value) {
		setConstNumber(offset + 36, $purc_act_rev, value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(double value) {
		setConstNumber(offset + 36, $purc_act_rev, value);
	}


	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 37, $purc_act_d_no);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 37, $purc_act_d_no, value);
	}


	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public MCNumber purc_act_d_seq() {
		return getConstNumber(offset + 38, $purc_act_d_seq);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(MCNumber value) {
		setConstNumber(offset + 38, $purc_act_d_seq, value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(int value) {
		setConstNumber(offset + 38, $purc_act_d_seq, value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(long value) {
		setConstNumber(offset + 38, $purc_act_d_seq, value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(float value) {
		setConstNumber(offset + 38, $purc_act_d_seq, value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(double value) {
		setConstNumber(offset + 38, $purc_act_d_seq, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 39, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 39, $asset_mng_typ, value);
	}


	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public String asset_mng_typ_nm() {
		return getConstString(offset + 40, $asset_mng_typ_nm);
	}

	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public void asset_mng_typ_nm(String value) {
		setConstString(offset + 40, $asset_mng_typ_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 41, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 41, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 42, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 42, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 43, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 43, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 44, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 44, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 45, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 45, $itm_nm, value);
	}


	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 46, $iv_itm_nm);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 46, $iv_itm_nm, value);
	}


	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 47, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 47, $sundry_itm_flg, value);
	}


	/**
	 * Import/export charges type 輸出入諸掛区分.<p>
	 *
	 */
	public String exim_xpns_typ() {
		return getConstString(offset + 48, $exim_xpns_typ);
	}

	/**
	 * Import/export charges type 輸出入諸掛区分.<p>
	 *
	 */
	public void exim_xpns_typ(String value) {
		setConstString(offset + 48, $exim_xpns_typ, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 49, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 49, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 50, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 50, $maker_nm, value);
	}


	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public String cntry_org_cd() {
		return getConstString(offset + 51, $cntry_org_cd);
	}

	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public void cntry_org_cd(String value) {
		setConstString(offset + 51, $cntry_org_cd, value);
	}


	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public String cntry_org_nm() {
		return getConstString(offset + 52, $cntry_org_nm);
	}

	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public void cntry_org_nm(String value) {
		setConstString(offset + 52, $cntry_org_nm, value);
	}


	/**
	 * Transaction unit cd. at PO 発注時取引単位ＣＤ.<p>
	 *
	 */
	public String src_trd_unit_cd() {
		return getConstString(offset + 53, $src_trd_unit_cd);
	}

	/**
	 * Transaction unit cd. at PO 発注時取引単位ＣＤ.<p>
	 *
	 */
	public void src_trd_unit_cd(String value) {
		setConstString(offset + 53, $src_trd_unit_cd, value);
	}


	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public MCNumber src_trd_unit_conv_qty() {
		return getConstNumber(offset + 54, $src_trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public void src_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 54, $src_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public void src_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 54, $src_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public void src_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 54, $src_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public void src_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 54, $src_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public void src_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 54, $src_trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber src_trd_unit_conv_base_qty() {
		return getConstNumber(offset + 55, $src_trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public void src_trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 55, $src_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public void src_trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 55, $src_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public void src_trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 55, $src_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public void src_trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 55, $src_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public void src_trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 55, $src_trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber src_trd_unit_dec_place() {
		return getConstNumber(offset + 56, $src_trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public void src_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 56, $src_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public void src_trd_unit_dec_place(int value) {
		setConstNumber(offset + 56, $src_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public void src_trd_unit_dec_place(long value) {
		setConstNumber(offset + 56, $src_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public void src_trd_unit_dec_place(float value) {
		setConstNumber(offset + 56, $src_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public void src_trd_unit_dec_place(double value) {
		setConstNumber(offset + 56, $src_trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type at PO 発注時取引単位端数処理区分.<p>
	 *
	 */
	public String src_trd_unit_rnd_typ() {
		return getConstString(offset + 57, $src_trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type at PO 発注時取引単位端数処理区分.<p>
	 *
	 */
	public void src_trd_unit_rnd_typ(String value) {
		setConstString(offset + 57, $src_trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public MCNumber src_trd_unit_qty() {
		return getConstNumber(offset + 58, $src_trd_unit_qty);
	}

	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public void src_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 58, $src_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public void src_trd_unit_qty(int value) {
		setConstNumber(offset + 58, $src_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public void src_trd_unit_qty(long value) {
		setConstNumber(offset + 58, $src_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public void src_trd_unit_qty(float value) {
		setConstNumber(offset + 58, $src_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public void src_trd_unit_qty(double value) {
		setConstNumber(offset + 58, $src_trd_unit_qty, value);
	}


	/**
	 * Unit qty. at PO 発注時基準単位数量.<p>
	 *
	 */
	public MCNumber src_base_unit_qty() {
		return getConstNumber(offset + 59, $src_base_unit_qty);
	}

	/**
	 * Unit qty. at PO 発注時基準単位数量.<p>
	 *
	 */
	public void src_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 59, $src_base_unit_qty, value);
	}

	/**
	 * Unit qty. at PO 発注時基準単位数量.<p>
	 *
	 */
	public void src_base_unit_qty(int value) {
		setConstNumber(offset + 59, $src_base_unit_qty, value);
	}

	/**
	 * Unit qty. at PO 発注時基準単位数量.<p>
	 *
	 */
	public void src_base_unit_qty(long value) {
		setConstNumber(offset + 59, $src_base_unit_qty, value);
	}

	/**
	 * Unit qty. at PO 発注時基準単位数量.<p>
	 *
	 */
	public void src_base_unit_qty(float value) {
		setConstNumber(offset + 59, $src_base_unit_qty, value);
	}

	/**
	 * Unit qty. at PO 発注時基準単位数量.<p>
	 *
	 */
	public void src_base_unit_qty(double value) {
		setConstNumber(offset + 59, $src_base_unit_qty, value);
	}


	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public MCNumber src_trd_cur_upri() {
		return getConstNumber(offset + 60, $src_trd_cur_upri);
	}

	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public void src_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 60, $src_trd_cur_upri, value);
	}

	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public void src_trd_cur_upri(int value) {
		setConstNumber(offset + 60, $src_trd_cur_upri, value);
	}

	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public void src_trd_cur_upri(long value) {
		setConstNumber(offset + 60, $src_trd_cur_upri, value);
	}

	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public void src_trd_cur_upri(float value) {
		setConstNumber(offset + 60, $src_trd_cur_upri, value);
	}

	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public void src_trd_cur_upri(double value) {
		setConstNumber(offset + 60, $src_trd_cur_upri, value);
	}


	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public MCNumber src_trd_cur_proc_upri() {
		return getConstNumber(offset + 61, $src_trd_cur_proc_upri);
	}

	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public void src_trd_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 61, $src_trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public void src_trd_cur_proc_upri(int value) {
		setConstNumber(offset + 61, $src_trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public void src_trd_cur_proc_upri(long value) {
		setConstNumber(offset + 61, $src_trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public void src_trd_cur_proc_upri(float value) {
		setConstNumber(offset + 61, $src_trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public void src_trd_cur_proc_upri(double value) {
		setConstNumber(offset + 61, $src_trd_cur_proc_upri, value);
	}


	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber src_trd_cur_onr_prov_upri() {
		return getConstNumber(offset + 62, $src_trd_cur_onr_prov_upri);
	}

	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 62, $src_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 62, $src_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 62, $src_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 62, $src_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 62, $src_trd_cur_onr_prov_upri, value);
	}


	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public MCNumber src_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 63, $src_trd_cur_dscnt_amt);
	}

	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public void src_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 63, $src_trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public void src_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 63, $src_trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public void src_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 63, $src_trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public void src_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 63, $src_trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public void src_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 63, $src_trd_cur_dscnt_amt, value);
	}


	/**
	 * PO amount (Transaction currency) 発注取引通貨金額.<p>
	 *
	 */
	public MCNumber src_trd_cur_amt() {
		return getConstNumber(offset + 64, $src_trd_cur_amt);
	}

	/**
	 * PO amount (Transaction currency) 発注取引通貨金額.<p>
	 *
	 */
	public void src_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 64, $src_trd_cur_amt, value);
	}

	/**
	 * PO amount (Transaction currency) 発注取引通貨金額.<p>
	 *
	 */
	public void src_trd_cur_amt(int value) {
		setConstNumber(offset + 64, $src_trd_cur_amt, value);
	}

	/**
	 * PO amount (Transaction currency) 発注取引通貨金額.<p>
	 *
	 */
	public void src_trd_cur_amt(long value) {
		setConstNumber(offset + 64, $src_trd_cur_amt, value);
	}

	/**
	 * PO amount (Transaction currency) 発注取引通貨金額.<p>
	 *
	 */
	public void src_trd_cur_amt(float value) {
		setConstNumber(offset + 64, $src_trd_cur_amt, value);
	}

	/**
	 * PO amount (Transaction currency) 発注取引通貨金額.<p>
	 *
	 */
	public void src_trd_cur_amt(double value) {
		setConstNumber(offset + 64, $src_trd_cur_amt, value);
	}


	/**
	 * Subcontracting amount at PO (Transaction currency) 発注取引通貨加工金額.<p>
	 *
	 */
	public MCNumber src_trd_cur_proc_amt() {
		return getConstNumber(offset + 65, $src_trd_cur_proc_amt);
	}

	/**
	 * Subcontracting amount at PO (Transaction currency) 発注取引通貨加工金額.<p>
	 *
	 */
	public void src_trd_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 65, $src_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount at PO (Transaction currency) 発注取引通貨加工金額.<p>
	 *
	 */
	public void src_trd_cur_proc_amt(int value) {
		setConstNumber(offset + 65, $src_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount at PO (Transaction currency) 発注取引通貨加工金額.<p>
	 *
	 */
	public void src_trd_cur_proc_amt(long value) {
		setConstNumber(offset + 65, $src_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount at PO (Transaction currency) 発注取引通貨加工金額.<p>
	 *
	 */
	public void src_trd_cur_proc_amt(float value) {
		setConstNumber(offset + 65, $src_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount at PO (Transaction currency) 発注取引通貨加工金額.<p>
	 *
	 */
	public void src_trd_cur_proc_amt(double value) {
		setConstNumber(offset + 65, $src_trd_cur_proc_amt, value);
	}


	/**
	 * Chargeable supply amount (PO transaction currency) 発注取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber src_trd_cur_onr_prov_amt() {
		return getConstNumber(offset + 66, $src_trd_cur_onr_prov_amt);
	}

	/**
	 * Chargeable supply amount (PO transaction currency) 発注取引通貨有償支給金額.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 66, $src_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (PO transaction currency) 発注取引通貨有償支給金額.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 66, $src_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (PO transaction currency) 発注取引通貨有償支給金額.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 66, $src_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (PO transaction currency) 発注取引通貨有償支給金額.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 66, $src_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (PO transaction currency) 発注取引通貨有償支給金額.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 66, $src_trd_cur_onr_prov_amt, value);
	}


	/**
	 * PO tax amount (Transaction currency) 発注取引通貨税額.<p>
	 *
	 */
	public MCNumber src_trd_cur_tax_amt() {
		return getConstNumber(offset + 67, $src_trd_cur_tax_amt);
	}

	/**
	 * PO tax amount (Transaction currency) 発注取引通貨税額.<p>
	 *
	 */
	public void src_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 67, $src_trd_cur_tax_amt, value);
	}

	/**
	 * PO tax amount (Transaction currency) 発注取引通貨税額.<p>
	 *
	 */
	public void src_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 67, $src_trd_cur_tax_amt, value);
	}

	/**
	 * PO tax amount (Transaction currency) 発注取引通貨税額.<p>
	 *
	 */
	public void src_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 67, $src_trd_cur_tax_amt, value);
	}

	/**
	 * PO tax amount (Transaction currency) 発注取引通貨税額.<p>
	 *
	 */
	public void src_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 67, $src_trd_cur_tax_amt, value);
	}

	/**
	 * PO tax amount (Transaction currency) 発注取引通貨税額.<p>
	 *
	 */
	public void src_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 67, $src_trd_cur_tax_amt, value);
	}


	/**
	 * PO withholding tax rate 発注源泉税率.<p>
	 *
	 */
	public MCNumber src_wtax_rate() {
		return getConstNumber(offset + 68, $src_wtax_rate);
	}

	/**
	 * PO withholding tax rate 発注源泉税率.<p>
	 *
	 */
	public void src_wtax_rate(MCNumber value) {
		setConstNumber(offset + 68, $src_wtax_rate, value);
	}

	/**
	 * PO withholding tax rate 発注源泉税率.<p>
	 *
	 */
	public void src_wtax_rate(int value) {
		setConstNumber(offset + 68, $src_wtax_rate, value);
	}

	/**
	 * PO withholding tax rate 発注源泉税率.<p>
	 *
	 */
	public void src_wtax_rate(long value) {
		setConstNumber(offset + 68, $src_wtax_rate, value);
	}

	/**
	 * PO withholding tax rate 発注源泉税率.<p>
	 *
	 */
	public void src_wtax_rate(float value) {
		setConstNumber(offset + 68, $src_wtax_rate, value);
	}

	/**
	 * PO withholding tax rate 発注源泉税率.<p>
	 *
	 */
	public void src_wtax_rate(double value) {
		setConstNumber(offset + 68, $src_wtax_rate, value);
	}


	/**
	 * Tax cd. at PO 発注時税ＣＤ.<p>
	 *
	 */
	public String src_tax_cd() {
		return getConstString(offset + 69, $src_tax_cd);
	}

	/**
	 * Tax cd. at PO 発注時税ＣＤ.<p>
	 *
	 */
	public void src_tax_cd(String value) {
		setConstString(offset + 69, $src_tax_cd, value);
	}


	/**
	 * Tax name at PO 発注時税名.<p>
	 *
	 */
	public String src_tax_nm() {
		return getConstString(offset + 70, $src_tax_nm);
	}

	/**
	 * Tax name at PO 発注時税名.<p>
	 *
	 */
	public void src_tax_nm(String value) {
		setConstString(offset + 70, $src_tax_nm, value);
	}


	/**
	 * Tax rate at PO 発注時税率.<p>
	 *
	 */
	public MCNumber src_tax_rate() {
		return getConstNumber(offset + 71, $src_tax_rate);
	}

	/**
	 * Tax rate at PO 発注時税率.<p>
	 *
	 */
	public void src_tax_rate(MCNumber value) {
		setConstNumber(offset + 71, $src_tax_rate, value);
	}

	/**
	 * Tax rate at PO 発注時税率.<p>
	 *
	 */
	public void src_tax_rate(int value) {
		setConstNumber(offset + 71, $src_tax_rate, value);
	}

	/**
	 * Tax rate at PO 発注時税率.<p>
	 *
	 */
	public void src_tax_rate(long value) {
		setConstNumber(offset + 71, $src_tax_rate, value);
	}

	/**
	 * Tax rate at PO 発注時税率.<p>
	 *
	 */
	public void src_tax_rate(float value) {
		setConstNumber(offset + 71, $src_tax_rate, value);
	}

	/**
	 * Tax rate at PO 発注時税率.<p>
	 *
	 */
	public void src_tax_rate(double value) {
		setConstNumber(offset + 71, $src_tax_rate, value);
	}


	/**
	 * Tax type at PO 発注時税区分.<p>
	 *
	 */
	public String src_tax_typ() {
		return getConstString(offset + 72, $src_tax_typ);
	}

	/**
	 * Tax type at PO 発注時税区分.<p>
	 *
	 */
	public void src_tax_typ(String value) {
		setConstString(offset + 72, $src_tax_typ, value);
	}


	/**
	 * Tax inclusive flg. at PO 発注時内税ＦＬＧ.<p>
	 *
	 */
	public boolean src_inc_tax_flg() {
		return getConstBoolean(offset + 73, $src_inc_tax_flg);
	}

	/**
	 * Tax inclusive flg. at PO 発注時内税ＦＬＧ.<p>
	 *
	 */
	public void src_inc_tax_flg(boolean value) {
		setConstBoolean(offset + 73, $src_inc_tax_flg, value);
	}


	/**
	 * Acceptance defective flg. 検収不良ＦＬＧ.<p>
	 *
	 */
	public boolean accpt_dfct_flg() {
		return getConstBoolean(offset + 74, $accpt_dfct_flg);
	}

	/**
	 * Acceptance defective flg. 検収不良ＦＬＧ.<p>
	 *
	 */
	public void accpt_dfct_flg(boolean value) {
		setConstBoolean(offset + 74, $accpt_dfct_flg, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 75, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 75, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 76, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 76, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 77, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 77, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 77, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 77, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 77, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 77, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 78, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 78, $trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 79, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 79, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 79, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 79, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 79, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 79, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 80, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 80, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 80, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 80, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 80, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 80, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit scheduled qty. 取引単位予定数量.<p>
	 *
	 */
	public MCNumber trd_unit_schd_qty() {
		return getConstNumber(offset + 81, $trd_unit_schd_qty);
	}

	/**
	 * Transaction unit scheduled qty. 取引単位予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(MCNumber value) {
		setConstNumber(offset + 81, $trd_unit_schd_qty, value);
	}

	/**
	 * Transaction unit scheduled qty. 取引単位予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(int value) {
		setConstNumber(offset + 81, $trd_unit_schd_qty, value);
	}

	/**
	 * Transaction unit scheduled qty. 取引単位予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(long value) {
		setConstNumber(offset + 81, $trd_unit_schd_qty, value);
	}

	/**
	 * Transaction unit scheduled qty. 取引単位予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(float value) {
		setConstNumber(offset + 81, $trd_unit_schd_qty, value);
	}

	/**
	 * Transaction unit scheduled qty. 取引単位予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(double value) {
		setConstNumber(offset + 81, $trd_unit_schd_qty, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 82, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 82, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 82, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 82, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 82, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 82, $trd_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 83, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 83, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 84, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 84, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 85, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 85, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 85, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 85, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 85, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 85, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 86, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 86, $base_unit_rnd_typ, value);
	}


	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public MCNumber base_unit_schd_qty() {
		return getConstNumber(offset + 87, $base_unit_schd_qty);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(MCNumber value) {
		setConstNumber(offset + 87, $base_unit_schd_qty, value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(int value) {
		setConstNumber(offset + 87, $base_unit_schd_qty, value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(long value) {
		setConstNumber(offset + 87, $base_unit_schd_qty, value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(float value) {
		setConstNumber(offset + 87, $base_unit_schd_qty, value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(double value) {
		setConstNumber(offset + 87, $base_unit_schd_qty, value);
	}


	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty_bf_cng() {
		return getConstNumber(offset + 88, $base_unit_qty_bf_cng);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bf_cng(MCNumber value) {
		setConstNumber(offset + 88, $base_unit_qty_bf_cng, value);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bf_cng(int value) {
		setConstNumber(offset + 88, $base_unit_qty_bf_cng, value);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bf_cng(long value) {
		setConstNumber(offset + 88, $base_unit_qty_bf_cng, value);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bf_cng(float value) {
		setConstNumber(offset + 88, $base_unit_qty_bf_cng, value);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bf_cng(double value) {
		setConstNumber(offset + 88, $base_unit_qty_bf_cng, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 89, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 89, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 89, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 89, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 89, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 89, $base_unit_qty, value);
	}


	/**
	 * Base unit purchase qty. 基準単位仕入数量.<p>
	 *
	 */
	public MCNumber base_unit_purc_qty() {
		return getConstNumber(offset + 90, $base_unit_purc_qty);
	}

	/**
	 * Base unit purchase qty. 基準単位仕入数量.<p>
	 *
	 */
	public void base_unit_purc_qty(MCNumber value) {
		setConstNumber(offset + 90, $base_unit_purc_qty, value);
	}

	/**
	 * Base unit purchase qty. 基準単位仕入数量.<p>
	 *
	 */
	public void base_unit_purc_qty(int value) {
		setConstNumber(offset + 90, $base_unit_purc_qty, value);
	}

	/**
	 * Base unit purchase qty. 基準単位仕入数量.<p>
	 *
	 */
	public void base_unit_purc_qty(long value) {
		setConstNumber(offset + 90, $base_unit_purc_qty, value);
	}

	/**
	 * Base unit purchase qty. 基準単位仕入数量.<p>
	 *
	 */
	public void base_unit_purc_qty(float value) {
		setConstNumber(offset + 90, $base_unit_purc_qty, value);
	}

	/**
	 * Base unit purchase qty. 基準単位仕入数量.<p>
	 *
	 */
	public void base_unit_purc_qty(double value) {
		setConstNumber(offset + 90, $base_unit_purc_qty, value);
	}


	/**
	 * Base unit receipt qty. 基準単位入荷数量.<p>
	 *
	 */
	public MCNumber base_unit_arr_qty() {
		return getConstNumber(offset + 91, $base_unit_arr_qty);
	}

	/**
	 * Base unit receipt qty. 基準単位入荷数量.<p>
	 *
	 */
	public void base_unit_arr_qty(MCNumber value) {
		setConstNumber(offset + 91, $base_unit_arr_qty, value);
	}

	/**
	 * Base unit receipt qty. 基準単位入荷数量.<p>
	 *
	 */
	public void base_unit_arr_qty(int value) {
		setConstNumber(offset + 91, $base_unit_arr_qty, value);
	}

	/**
	 * Base unit receipt qty. 基準単位入荷数量.<p>
	 *
	 */
	public void base_unit_arr_qty(long value) {
		setConstNumber(offset + 91, $base_unit_arr_qty, value);
	}

	/**
	 * Base unit receipt qty. 基準単位入荷数量.<p>
	 *
	 */
	public void base_unit_arr_qty(float value) {
		setConstNumber(offset + 91, $base_unit_arr_qty, value);
	}

	/**
	 * Base unit receipt qty. 基準単位入荷数量.<p>
	 *
	 */
	public void base_unit_arr_qty(double value) {
		setConstNumber(offset + 91, $base_unit_arr_qty, value);
	}


	/**
	 * Base unit acceptance detective qty. 基準単位検収不良数量.<p>
	 *
	 */
	public MCNumber base_unit_accpt_dfct_qty() {
		return getConstNumber(offset + 92, $base_unit_accpt_dfct_qty);
	}

	/**
	 * Base unit acceptance detective qty. 基準単位検収不良数量.<p>
	 *
	 */
	public void base_unit_accpt_dfct_qty(MCNumber value) {
		setConstNumber(offset + 92, $base_unit_accpt_dfct_qty, value);
	}

	/**
	 * Base unit acceptance detective qty. 基準単位検収不良数量.<p>
	 *
	 */
	public void base_unit_accpt_dfct_qty(int value) {
		setConstNumber(offset + 92, $base_unit_accpt_dfct_qty, value);
	}

	/**
	 * Base unit acceptance detective qty. 基準単位検収不良数量.<p>
	 *
	 */
	public void base_unit_accpt_dfct_qty(long value) {
		setConstNumber(offset + 92, $base_unit_accpt_dfct_qty, value);
	}

	/**
	 * Base unit acceptance detective qty. 基準単位検収不良数量.<p>
	 *
	 */
	public void base_unit_accpt_dfct_qty(float value) {
		setConstNumber(offset + 92, $base_unit_accpt_dfct_qty, value);
	}

	/**
	 * Base unit acceptance detective qty. 基準単位検収不良数量.<p>
	 *
	 */
	public void base_unit_accpt_dfct_qty(double value) {
		setConstNumber(offset + 92, $base_unit_accpt_dfct_qty, value);
	}


	/**
	 * Re-receipt flg. 再入荷ＦＬＧ.<p>
	 *
	 */
	public boolean re_arr_flg() {
		return getConstBoolean(offset + 93, $re_arr_flg);
	}

	/**
	 * Re-receipt flg. 再入荷ＦＬＧ.<p>
	 *
	 */
	public void re_arr_flg(boolean value) {
		setConstBoolean(offset + 93, $re_arr_flg, value);
	}


	/**
	 * Re-receipt location cd. 再入荷場所ＣＤ.<p>
	 *
	 */
	public String re_arr_loc_cd() {
		return getConstString(offset + 94, $re_arr_loc_cd);
	}

	/**
	 * Re-receipt location cd. 再入荷場所ＣＤ.<p>
	 *
	 */
	public void re_arr_loc_cd(String value) {
		setConstString(offset + 94, $re_arr_loc_cd, value);
	}


	/**
	 * Re-receipt location name 再入荷場所名.<p>
	 *
	 */
	public String re_arr_loc_nm() {
		return getConstString(offset + 95, $re_arr_loc_nm);
	}

	/**
	 * Re-receipt location name 再入荷場所名.<p>
	 *
	 */
	public void re_arr_loc_nm(String value) {
		setConstString(offset + 95, $re_arr_loc_nm, value);
	}


	/**
	 * Re-receipt location WG cd. 再入荷場所ＷＧＣＤ.<p>
	 *
	 */
	public String re_arr_loc_wg_cd() {
		return getConstString(offset + 96, $re_arr_loc_wg_cd);
	}

	/**
	 * Re-receipt location WG cd. 再入荷場所ＷＧＣＤ.<p>
	 *
	 */
	public void re_arr_loc_wg_cd(String value) {
		setConstString(offset + 96, $re_arr_loc_wg_cd, value);
	}


	/**
	 * Re-receipt location WG name 再入荷場所ＷＧ名.<p>
	 *
	 */
	public String re_arr_loc_wg_nm() {
		return getConstString(offset + 97, $re_arr_loc_wg_nm);
	}

	/**
	 * Re-receipt location WG name 再入荷場所ＷＧ名.<p>
	 *
	 */
	public void re_arr_loc_wg_nm(String value) {
		setConstString(offset + 97, $re_arr_loc_wg_nm, value);
	}


	/**
	 * For re-receipt rack/line 再入荷棚・ライン対象.<p>
	 *
	 */
	public boolean re_arr_str_ln_tgt_flg() {
		return getConstBoolean(offset + 98, $re_arr_str_ln_tgt_flg);
	}

	/**
	 * For re-receipt rack/line 再入荷棚・ライン対象.<p>
	 *
	 */
	public void re_arr_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 98, $re_arr_str_ln_tgt_flg, value);
	}


	/**
	 * Re-receipt rack/line cd. 再入荷棚・ラインＣＤ.<p>
	 *
	 */
	public String re_arr_str_ln_cd() {
		return getConstString(offset + 99, $re_arr_str_ln_cd);
	}

	/**
	 * Re-receipt rack/line cd. 再入荷棚・ラインＣＤ.<p>
	 *
	 */
	public void re_arr_str_ln_cd(String value) {
		setConstString(offset + 99, $re_arr_str_ln_cd, value);
	}


	/**
	 * Re-receipt rack/line name 再入荷棚・ライン名.<p>
	 *
	 */
	public String re_arr_str_ln_nm() {
		return getConstString(offset + 100, $re_arr_str_ln_nm);
	}

	/**
	 * Re-receipt rack/line name 再入荷棚・ライン名.<p>
	 *
	 */
	public void re_arr_str_ln_nm(String value) {
		setConstString(offset + 100, $re_arr_str_ln_nm, value);
	}


	/**
	 * Re-receipt (Without rack/line) 再入荷棚・ライン無.<p>
	 *
	 */
	public boolean re_arr_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 101, $re_arr_str_ln_cd_none_flg);
	}

	/**
	 * Re-receipt (Without rack/line) 再入荷棚・ライン無.<p>
	 *
	 */
	public void re_arr_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 101, $re_arr_str_ln_cd_none_flg, value);
	}


	/**
	 * Re-receipt factory/distribution warehouse cd. 再入荷場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String re_arr_loc_site_cd() {
		return getConstString(offset + 102, $re_arr_loc_site_cd);
	}

	/**
	 * Re-receipt factory/distribution warehouse cd. 再入荷場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void re_arr_loc_site_cd(String value) {
		setConstString(offset + 102, $re_arr_loc_site_cd, value);
	}


	/**
	 * Re-receipt location calendar cd. 再入荷場所カレンダＣＤ.<p>
	 *
	 */
	public String re_arr_loc_cal_cd() {
		return getConstString(offset + 103, $re_arr_loc_cal_cd);
	}

	/**
	 * Re-receipt location calendar cd. 再入荷場所カレンダＣＤ.<p>
	 *
	 */
	public void re_arr_loc_cal_cd(String value) {
		setConstString(offset + 103, $re_arr_loc_cal_cd, value);
	}


	/**
	 * Re-receipt location Subcontractor cd. 再入荷場所外注発注先ＣＤ.<p>
	 *
	 */
	public String re_arr_loc_sppl_cd() {
		return getConstString(offset + 104, $re_arr_loc_sppl_cd);
	}

	/**
	 * Re-receipt location Subcontractor cd. 再入荷場所外注発注先ＣＤ.<p>
	 *
	 */
	public void re_arr_loc_sppl_cd(String value) {
		setConstString(offset + 104, $re_arr_loc_sppl_cd, value);
	}


	/**
	 * Re-receipt location Subcontractor calendar cd. 再入荷場所外注発注先カレンダＣＤ.<p>
	 *
	 */
	public String re_arr_loc_sppl_cal_cd() {
		return getConstString(offset + 105, $re_arr_loc_sppl_cal_cd);
	}

	/**
	 * Re-receipt location Subcontractor calendar cd. 再入荷場所外注発注先カレンダＣＤ.<p>
	 *
	 */
	public void re_arr_loc_sppl_cal_cd(String value) {
		setConstString(offset + 105, $re_arr_loc_sppl_cal_cd, value);
	}


	/**
	 * Transaction unit re-receipt qty. 取引単位再入荷数量.<p>
	 *
	 */
	public MCNumber trd_unit_re_arr_qty() {
		return getConstNumber(offset + 106, $trd_unit_re_arr_qty);
	}

	/**
	 * Transaction unit re-receipt qty. 取引単位再入荷数量.<p>
	 *
	 */
	public void trd_unit_re_arr_qty(MCNumber value) {
		setConstNumber(offset + 106, $trd_unit_re_arr_qty, value);
	}

	/**
	 * Transaction unit re-receipt qty. 取引単位再入荷数量.<p>
	 *
	 */
	public void trd_unit_re_arr_qty(int value) {
		setConstNumber(offset + 106, $trd_unit_re_arr_qty, value);
	}

	/**
	 * Transaction unit re-receipt qty. 取引単位再入荷数量.<p>
	 *
	 */
	public void trd_unit_re_arr_qty(long value) {
		setConstNumber(offset + 106, $trd_unit_re_arr_qty, value);
	}

	/**
	 * Transaction unit re-receipt qty. 取引単位再入荷数量.<p>
	 *
	 */
	public void trd_unit_re_arr_qty(float value) {
		setConstNumber(offset + 106, $trd_unit_re_arr_qty, value);
	}

	/**
	 * Transaction unit re-receipt qty. 取引単位再入荷数量.<p>
	 *
	 */
	public void trd_unit_re_arr_qty(double value) {
		setConstNumber(offset + 106, $trd_unit_re_arr_qty, value);
	}


	/**
	 * Desired re-receipt date 再入荷希望日.<p>
	 *
	 */
	public MCDate re_arr_rqst_dt() {
		return getConstDate(offset + 107, $re_arr_rqst_dt);
	}

	/**
	 * Desired re-receipt date 再入荷希望日.<p>
	 *
	 */
	public void re_arr_rqst_dt(MCDate value) {
		setConstDate(offset + 107, $re_arr_rqst_dt, value);
	}


	/**
	 * Desired re-receipt time 再入荷希望時刻.<p>
	 *
	 */
	public MCDate re_arr_rqst_hm() {
		return getConstDate(offset + 108, $re_arr_rqst_hm);
	}

	/**
	 * Desired re-receipt time 再入荷希望時刻.<p>
	 *
	 */
	public void re_arr_rqst_hm(MCDate value) {
		setConstDate(offset + 108, $re_arr_rqst_hm, value);
	}


	/**
	 * Scheduled re-receipt purchase date 再入荷仕入予定日.<p>
	 *
	 */
	public MCDate re_arr_purc_schd_dt() {
		return getConstDate(offset + 109, $re_arr_purc_schd_dt);
	}

	/**
	 * Scheduled re-receipt purchase date 再入荷仕入予定日.<p>
	 *
	 */
	public void re_arr_purc_schd_dt(MCDate value) {
		setConstDate(offset + 109, $re_arr_purc_schd_dt, value);
	}


	/**
	 * Re-receipt simultaneously recording 再入荷同時計上.<p>
	 *
	 */
	public boolean re_arr_sync_flg() {
		return getConstBoolean(offset + 110, $re_arr_sync_flg);
	}

	/**
	 * Re-receipt simultaneously recording 再入荷同時計上.<p>
	 *
	 */
	public void re_arr_sync_flg(boolean value) {
		setConstBoolean(offset + 110, $re_arr_sync_flg, value);
	}


	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 111, $abort_flg);
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 111, $abort_flg, value);
	}


	/**
	 * Free of charge flg. 無償ＦＬＧ.<p>
	 *
	 */
	public boolean ncv_flg() {
		return getConstBoolean(offset + 112, $ncv_flg);
	}

	/**
	 * Free of charge flg. 無償ＦＬＧ.<p>
	 *
	 */
	public void ncv_flg(boolean value) {
		setConstBoolean(offset + 112, $ncv_flg, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 113, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 113, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 114, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 114, $gd_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 115, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 115, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 116, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 116, $quality_typ_nm, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 117, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 117, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 118, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 118, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 119, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 119, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 120, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 120, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 121, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 121, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 122, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 122, $wrk_nm, value);
	}


	/**
	 * Delivery location WG 納入場所ＷＧ.<p>
	 *
	 */
	public String dlv_loc_wg_cd() {
		return getConstString(offset + 123, $dlv_loc_wg_cd);
	}

	/**
	 * Delivery location WG 納入場所ＷＧ.<p>
	 *
	 */
	public void dlv_loc_wg_cd(String value) {
		setConstString(offset + 123, $dlv_loc_wg_cd, value);
	}


	/**
	 * Delivery location WG name 納入場所ＷＧ名.<p>
	 *
	 */
	public String dlv_loc_wg_nm() {
		return getConstString(offset + 124, $dlv_loc_wg_nm);
	}

	/**
	 * Delivery location WG name 納入場所ＷＧ名.<p>
	 *
	 */
	public void dlv_loc_wg_nm(String value) {
		setConstString(offset + 124, $dlv_loc_wg_nm, value);
	}


	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public String dlv_loc_cd() {
		return getConstString(offset + 125, $dlv_loc_cd);
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public void dlv_loc_cd(String value) {
		setConstString(offset + 125, $dlv_loc_cd, value);
	}


	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public String dlv_loc_nm() {
		return getConstString(offset + 126, $dlv_loc_nm);
	}

	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public void dlv_loc_nm(String value) {
		setConstString(offset + 126, $dlv_loc_nm, value);
	}


	/**
	 * Delivery location supplier cd. 納入場所発注先ＣＤ.<p>
	 *
	 */
	public String dlv_loc_sppl_cd() {
		return getConstString(offset + 127, $dlv_loc_sppl_cd);
	}

	/**
	 * Delivery location supplier cd. 納入場所発注先ＣＤ.<p>
	 *
	 */
	public void dlv_loc_sppl_cd(String value) {
		setConstString(offset + 127, $dlv_loc_sppl_cd, value);
	}


	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public boolean str_ln_tgt_flg() {
		return getConstBoolean(offset + 128, $str_ln_tgt_flg);
	}

	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public void str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 128, $str_ln_tgt_flg, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 129, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 129, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 130, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 130, $str_ln_nm, value);
	}


	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 131, $str_ln_cd_none_flg);
	}

	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 131, $str_ln_cd_none_flg, value);
	}


	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public String drct_dlv_typ() {
		return getConstString(offset + 132, $drct_dlv_typ);
	}

	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public void drct_dlv_typ(String value) {
		setConstString(offset + 132, $drct_dlv_typ, value);
	}


	/**
	 * Direct-delivery type name 直納区分名.<p>
	 *
	 */
	public String drct_dlv_typ_nm() {
		return getConstString(offset + 133, $drct_dlv_typ_nm);
	}

	/**
	 * Direct-delivery type name 直納区分名.<p>
	 *
	 */
	public void drct_dlv_typ_nm(String value) {
		setConstString(offset + 133, $drct_dlv_typ_nm, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 134, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 134, $slo_d_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 135, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 135, $slo_no, value);
	}


	/**
	 * Delivery destination calendar cd. 納品先カレンダＣＤ.<p>
	 *
	 */
	public String scst_cal_cd() {
		return getConstString(offset + 136, $scst_cal_cd);
	}

	/**
	 * Delivery destination calendar cd. 納品先カレンダＣＤ.<p>
	 *
	 */
	public void scst_cal_cd(String value) {
		setConstString(offset + 136, $scst_cal_cd, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String scst_cd() {
		return getConstString(offset + 137, $scst_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void scst_cd(String value) {
		setConstString(offset + 137, $scst_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String scst_nm() {
		return getConstString(offset + 138, $scst_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void scst_nm(String value) {
		setConstString(offset + 138, $scst_nm, value);
	}


	/**
	 * Miscellaneous delivery destination flg. 納品先諸口ＦＬＧ.<p>
	 *
	 */
	public boolean scst_sundry_flg() {
		return getConstBoolean(offset + 139, $scst_sundry_flg);
	}

	/**
	 * Miscellaneous delivery destination flg. 納品先諸口ＦＬＧ.<p>
	 *
	 */
	public void scst_sundry_flg(boolean value) {
		setConstBoolean(offset + 139, $scst_sundry_flg, value);
	}


	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String scst_zip_cd() {
		return getConstString(offset + 140, $scst_zip_cd);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void scst_zip_cd(String value) {
		setConstString(offset + 140, $scst_zip_cd, value);
	}


	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String scst_addr1() {
		return getConstString(offset + 141, $scst_addr1);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void scst_addr1(String value) {
		setConstString(offset + 141, $scst_addr1, value);
	}


	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String scst_addr2() {
		return getConstString(offset + 142, $scst_addr2);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void scst_addr2(String value) {
		setConstString(offset + 142, $scst_addr2, value);
	}


	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String scst_addr3() {
		return getConstString(offset + 143, $scst_addr3);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void scst_addr3(String value) {
		setConstString(offset + 143, $scst_addr3, value);
	}


	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String scst_addr4() {
		return getConstString(offset + 144, $scst_addr4);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void scst_addr4(String value) {
		setConstString(offset + 144, $scst_addr4, value);
	}


	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String scst_tel() {
		return getConstString(offset + 145, $scst_tel);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void scst_tel(String value) {
		setConstString(offset + 145, $scst_tel, value);
	}


	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String scst_fax() {
		return getConstString(offset + 146, $scst_fax);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void scst_fax(String value) {
		setConstString(offset + 146, $scst_fax, value);
	}


	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public String scst_cntry_cd() {
		return getConstString(offset + 147, $scst_cntry_cd);
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public void scst_cntry_cd(String value) {
		setConstString(offset + 147, $scst_cntry_cd, value);
	}


	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public String scst_cntry_nm() {
		return getConstString(offset + 148, $scst_cntry_nm);
	}

	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public void scst_cntry_nm(String value) {
		setConstString(offset + 148, $scst_cntry_nm, value);
	}


	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String scst_cntct_dpt() {
		return getConstString(offset + 149, $scst_cntct_dpt);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void scst_cntct_dpt(String value) {
		setConstString(offset + 149, $scst_cntct_dpt, value);
	}


	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String scst_cntct_psn() {
		return getConstString(offset + 150, $scst_cntct_psn);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void scst_cntct_psn(String value) {
		setConstString(offset + 150, $scst_cntct_psn, value);
	}


	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 151, $tdlv_cd);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 151, $tdlv_cd, value);
	}


	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 152, $tdlv_nm);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 152, $tdlv_nm, value);
	}


	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return getConstString(offset + 153, $tdlv_cntct_dpt);
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		setConstString(offset + 153, $tdlv_cntct_dpt, value);
	}


	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return getConstString(offset + 154, $tdlv_cntct_psn);
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		setConstString(offset + 154, $tdlv_cntct_psn, value);
	}


	/**
	 * Miscellaneous receiving point flg. 配送先諸口ＦＬＧ.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return getConstBoolean(offset + 155, $tdlv_sundry_flg);
	}

	/**
	 * Miscellaneous receiving point flg. 配送先諸口ＦＬＧ.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 155, $tdlv_sundry_flg, value);
	}


	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return getConstString(offset + 156, $tdlv_zip_cd);
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		setConstString(offset + 156, $tdlv_zip_cd, value);
	}


	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return getConstString(offset + 157, $tdlv_addr1);
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		setConstString(offset + 157, $tdlv_addr1, value);
	}


	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return getConstString(offset + 158, $tdlv_addr2);
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		setConstString(offset + 158, $tdlv_addr2, value);
	}


	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return getConstString(offset + 159, $tdlv_addr3);
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		setConstString(offset + 159, $tdlv_addr3, value);
	}


	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return getConstString(offset + 160, $tdlv_addr4);
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		setConstString(offset + 160, $tdlv_addr4, value);
	}


	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return getConstString(offset + 161, $tdlv_tel);
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		setConstString(offset + 161, $tdlv_tel, value);
	}


	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return getConstString(offset + 162, $tdlv_fax);
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		setConstString(offset + 162, $tdlv_fax, value);
	}


	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public String tdlv_cntry_cd() {
		return getConstString(offset + 163, $tdlv_cntry_cd);
	}

	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public void tdlv_cntry_cd(String value) {
		setConstString(offset + 163, $tdlv_cntry_cd, value);
	}


	/**
	 * Receiving point country name 配送先国名.<p>
	 *
	 */
	public String tdlv_cntry_nm() {
		return getConstString(offset + 164, $tdlv_cntry_nm);
	}

	/**
	 * Receiving point country name 配送先国名.<p>
	 *
	 */
	public void tdlv_cntry_nm(String value) {
		setConstString(offset + 164, $tdlv_cntry_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 165, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 165, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 166, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 166, $sublot_no, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 167, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 167, $site_cd, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 168, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 168, $ver_flg, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 169, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 169, $ver_no, value);
	}


	/**
	 * Vendor lot required 業者ロット必須.<p>
	 *
	 */
	public boolean bp_lot_flg() {
		return getConstBoolean(offset + 170, $bp_lot_flg);
	}

	/**
	 * Vendor lot required 業者ロット必須.<p>
	 *
	 */
	public void bp_lot_flg(boolean value) {
		setConstBoolean(offset + 170, $bp_lot_flg, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 171, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 171, $bp_lot_no, value);
	}


	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return getConstString(offset + 172, $bp_dlv_slip_no);
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		setConstString(offset + 172, $bp_dlv_slip_no, value);
	}


	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_d_no() {
		return getConstString(offset + 173, $bp_dlv_slip_d_no);
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no(String value) {
		setConstString(offset + 173, $bp_dlv_slip_d_no, value);
	}


	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public MCDate ship_fr_valid_dt() {
		return getConstDate(offset + 174, $ship_fr_valid_dt);
	}

	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public void ship_fr_valid_dt(MCDate value) {
		setConstDate(offset + 174, $ship_fr_valid_dt, value);
	}


	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public boolean upri_not_tgt_flg() {
		return getConstBoolean(offset + 175, $upri_not_tgt_flg);
	}

	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public void upri_not_tgt_flg(boolean value) {
		setConstBoolean(offset + 175, $upri_not_tgt_flg, value);
	}


	/**
	 * Details correction 明細訂正.<p>
	 *
	 */
	public boolean purc_dtl_upd_flg() {
		return getConstBoolean(offset + 176, $purc_dtl_upd_flg);
	}

	/**
	 * Details correction 明細訂正.<p>
	 *
	 */
	public void purc_dtl_upd_flg(boolean value) {
		setConstBoolean(offset + 176, $purc_dtl_upd_flg, value);
	}


	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 177, $trd_cur_upri);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 177, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 177, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 177, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 177, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 177, $trd_cur_upri, value);
	}


	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 178, $trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 178, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 178, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 178, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 178, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 178, $trd_cur_amt, value);
	}


	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 179, $trd_cur_tax_amt);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 179, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 179, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 179, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 179, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 179, $trd_cur_tax_amt, value);
	}


	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public MCNumber trd_cur_inc_tax_amt() {
		return getConstNumber(offset + 180, $trd_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 180, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 180, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 180, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 180, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 180, $trd_cur_inc_tax_amt, value);
	}


	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 181, $trd_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 181, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 181, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 181, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 181, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 181, $trd_cur_dscnt_amt, value);
	}


	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 182, $repurc_obli_flg);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 182, $repurc_obli_flg, value);
	}


	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public String outsrc_upri_typ() {
		return getConstString(offset + 183, $outsrc_upri_typ);
	}

	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public void outsrc_upri_typ(String value) {
		setConstString(offset + 183, $outsrc_upri_typ, value);
	}


	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public MCNumber trd_cur_proc_upri() {
		return getConstNumber(offset + 184, $trd_cur_proc_upri);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 184, $trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(int value) {
		setConstNumber(offset + 184, $trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(long value) {
		setConstNumber(offset + 184, $trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(float value) {
		setConstNumber(offset + 184, $trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(double value) {
		setConstNumber(offset + 184, $trd_cur_proc_upri, value);
	}


	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return getConstNumber(offset + 185, $trd_cur_proc_amt);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 185, $trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		setConstNumber(offset + 185, $trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		setConstNumber(offset + 185, $trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		setConstNumber(offset + 185, $trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		setConstNumber(offset + 185, $trd_cur_proc_amt, value);
	}


	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_upri() {
		return getConstNumber(offset + 186, $trd_cur_onr_prov_upri);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 186, $trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 186, $trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 186, $trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 186, $trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 186, $trd_cur_onr_prov_upri, value);
	}


	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return getConstNumber(offset + 187, $trd_cur_onr_prov_amt);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 187, $trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 187, $trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 187, $trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 187, $trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 187, $trd_cur_onr_prov_amt, value);
	}


	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 188, $interim_flg);
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 188, $interim_flg, value);
	}


	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return getConstString(offset + 189, $dscnt_rsn_cd);
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		setConstString(offset + 189, $dscnt_rsn_cd, value);
	}


	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public String dscnt_rsn_nm() {
		return getConstString(offset + 190, $dscnt_rsn_nm);
	}

	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public void dscnt_rsn_nm(String value) {
		setConstString(offset + 190, $dscnt_rsn_nm, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 191, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 191, $tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 192, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 192, $tax_nm, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 193, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 193, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 193, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 193, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 193, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 193, $tax_rate, value);
	}


	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public String tax_typ() {
		return getConstString(offset + 194, $tax_typ);
	}

	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public void tax_typ(String value) {
		setConstString(offset + 194, $tax_typ, value);
	}


	/**
	 * Tax specified flg. 税指定ＦＬＧ.<p>
	 *
	 */
	public boolean tax_fix_flg() {
		return getConstBoolean(offset + 195, $tax_fix_flg);
	}

	/**
	 * Tax specified flg. 税指定ＦＬＧ.<p>
	 *
	 */
	public void tax_fix_flg(boolean value) {
		setConstBoolean(offset + 195, $tax_fix_flg, value);
	}


	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 196, $inc_tax_flg);
	}

	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 196, $inc_tax_flg, value);
	}


	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return getConstNumber(offset + 197, $base_cur_upri);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		setConstNumber(offset + 197, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		setConstNumber(offset + 197, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		setConstNumber(offset + 197, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		setConstNumber(offset + 197, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		setConstNumber(offset + 197, $base_cur_upri, value);
	}


	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 198, $base_cur_amt);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 198, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 198, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 198, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 198, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 198, $base_cur_amt, value);
	}


	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 199, $base_cur_tax_amt);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 199, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 199, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 199, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 199, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 199, $base_cur_tax_amt, value);
	}


	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public MCNumber base_cur_inc_tax_amt() {
		return getConstNumber(offset + 200, $base_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 200, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 200, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 200, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 200, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 200, $base_cur_inc_tax_amt, value);
	}


	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return getConstNumber(offset + 201, $base_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 201, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		setConstNumber(offset + 201, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		setConstNumber(offset + 201, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		setConstNumber(offset + 201, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		setConstNumber(offset + 201, $base_cur_dscnt_amt, value);
	}


	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public MCNumber base_cur_proc_upri() {
		return getConstNumber(offset + 202, $base_cur_proc_upri);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 202, $base_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(int value) {
		setConstNumber(offset + 202, $base_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(long value) {
		setConstNumber(offset + 202, $base_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(float value) {
		setConstNumber(offset + 202, $base_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(double value) {
		setConstNumber(offset + 202, $base_cur_proc_upri, value);
	}


	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public MCNumber base_cur_proc_amt() {
		return getConstNumber(offset + 203, $base_cur_proc_amt);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 203, $base_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(int value) {
		setConstNumber(offset + 203, $base_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(long value) {
		setConstNumber(offset + 203, $base_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(float value) {
		setConstNumber(offset + 203, $base_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(double value) {
		setConstNumber(offset + 203, $base_cur_proc_amt, value);
	}


	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_upri() {
		return getConstNumber(offset + 204, $base_cur_onr_prov_upri);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 204, $base_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 204, $base_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 204, $base_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 204, $base_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 204, $base_cur_onr_prov_upri, value);
	}


	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_amt() {
		return getConstNumber(offset + 205, $base_cur_onr_prov_amt);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 205, $base_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 205, $base_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 205, $base_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 205, $base_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 205, $base_cur_onr_prov_amt, value);
	}


	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public MCNumber ptax_cur_upri() {
		return getConstNumber(offset + 206, $ptax_cur_upri);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(MCNumber value) {
		setConstNumber(offset + 206, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(int value) {
		setConstNumber(offset + 206, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(long value) {
		setConstNumber(offset + 206, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(float value) {
		setConstNumber(offset + 206, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(double value) {
		setConstNumber(offset + 206, $ptax_cur_upri, value);
	}


	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return getConstNumber(offset + 207, $ptax_cur_amt);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		setConstNumber(offset + 207, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		setConstNumber(offset + 207, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		setConstNumber(offset + 207, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		setConstNumber(offset + 207, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		setConstNumber(offset + 207, $ptax_cur_amt, value);
	}


	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public MCNumber ptax_cur_tax_amt() {
		return getConstNumber(offset + 208, $ptax_cur_tax_amt);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 208, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(int value) {
		setConstNumber(offset + 208, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(long value) {
		setConstNumber(offset + 208, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(float value) {
		setConstNumber(offset + 208, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(double value) {
		setConstNumber(offset + 208, $ptax_cur_tax_amt, value);
	}


	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public MCNumber ptax_cur_inc_tax_amt() {
		return getConstNumber(offset + 209, $ptax_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 209, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 209, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 209, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 209, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 209, $ptax_cur_inc_tax_amt, value);
	}


	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public MCNumber ptax_cur_dscnt_amt() {
		return getConstNumber(offset + 210, $ptax_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 210, $ptax_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(int value) {
		setConstNumber(offset + 210, $ptax_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(long value) {
		setConstNumber(offset + 210, $ptax_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(float value) {
		setConstNumber(offset + 210, $ptax_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(double value) {
		setConstNumber(offset + 210, $ptax_cur_dscnt_amt, value);
	}


	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public MCNumber ptax_cur_proc_upri() {
		return getConstNumber(offset + 211, $ptax_cur_proc_upri);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 211, $ptax_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(int value) {
		setConstNumber(offset + 211, $ptax_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(long value) {
		setConstNumber(offset + 211, $ptax_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(float value) {
		setConstNumber(offset + 211, $ptax_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(double value) {
		setConstNumber(offset + 211, $ptax_cur_proc_upri, value);
	}


	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public MCNumber ptax_cur_proc_amt() {
		return getConstNumber(offset + 212, $ptax_cur_proc_amt);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 212, $ptax_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(int value) {
		setConstNumber(offset + 212, $ptax_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(long value) {
		setConstNumber(offset + 212, $ptax_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(float value) {
		setConstNumber(offset + 212, $ptax_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(double value) {
		setConstNumber(offset + 212, $ptax_cur_proc_amt, value);
	}


	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public MCNumber ptax_cur_onr_prov_upri() {
		return getConstNumber(offset + 213, $ptax_cur_onr_prov_upri);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 213, $ptax_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 213, $ptax_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 213, $ptax_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 213, $ptax_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 213, $ptax_cur_onr_prov_upri, value);
	}


	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public MCNumber ptax_cur_onr_prov_amt() {
		return getConstNumber(offset + 214, $ptax_cur_onr_prov_amt);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 214, $ptax_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 214, $ptax_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 214, $ptax_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 214, $ptax_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 214, $ptax_cur_onr_prov_amt, value);
	}


	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 215, $wtax_rate);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 215, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 215, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 215, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 215, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 215, $wtax_rate, value);
	}


	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber trd_cur_wtax_amt() {
		return getConstNumber(offset + 216, $trd_cur_wtax_amt);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void trd_cur_wtax_amt(MCNumber value) {
		setConstNumber(offset + 216, $trd_cur_wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void trd_cur_wtax_amt(int value) {
		setConstNumber(offset + 216, $trd_cur_wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void trd_cur_wtax_amt(long value) {
		setConstNumber(offset + 216, $trd_cur_wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void trd_cur_wtax_amt(float value) {
		setConstNumber(offset + 216, $trd_cur_wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void trd_cur_wtax_amt(double value) {
		setConstNumber(offset + 216, $trd_cur_wtax_amt, value);
	}


	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 217, $sppl_itm_cd);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 217, $sppl_itm_cd, value);
	}


	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 218, $sppl_itm_nm);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 218, $sppl_itm_nm, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 219, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 219, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 220, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 220, $cst_itm_nm, value);
	}


	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public String purc_rsn_cd() {
		return getConstString(offset + 221, $purc_rsn_cd);
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public void purc_rsn_cd(String value) {
		setConstString(offset + 221, $purc_rsn_cd, value);
	}


	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public String purc_rsn_nm() {
		return getConstString(offset + 222, $purc_rsn_nm);
	}

	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public void purc_rsn_nm(String value) {
		setConstString(offset + 222, $purc_rsn_nm, value);
	}


	/**
	 * Expenses purchasing flg. 経費購買ＦＬＧ.<p>
	 *
	 */
	public boolean xpns_purc_flg() {
		return getConstBoolean(offset + 223, $xpns_purc_flg);
	}

	/**
	 * Expenses purchasing flg. 経費購買ＦＬＧ.<p>
	 *
	 */
	public void xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 223, $xpns_purc_flg, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 224, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 224, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 225, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 225, $ap_dpt_nm, value);
	}


	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return getConstNumber(offset + 226, $pay_crryovr_times);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 226, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		setConstNumber(offset + 226, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		setConstNumber(offset + 226, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		setConstNumber(offset + 226, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		setConstNumber(offset + 226, $pay_crryovr_times, value);
	}


	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return getConstString(offset + 227, $purc_usr_cd);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		setConstString(offset + 227, $purc_usr_cd, value);
	}


	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public String purc_usr_nm() {
		return getConstString(offset + 228, $purc_usr_nm);
	}

	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public void purc_usr_nm(String value) {
		setConstString(offset + 228, $purc_usr_nm, value);
	}


	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return getConstString(offset + 229, $purc_dpt_cd);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		setConstString(offset + 229, $purc_dpt_cd, value);
	}


	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public String purc_dpt_nm() {
		return getConstString(offset + 230, $purc_dpt_nm);
	}

	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public void purc_dpt_nm(String value) {
		setConstString(offset + 230, $purc_dpt_nm, value);
	}


	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public boolean ap_dpt_flg() {
		return getConstBoolean(offset + 231, $ap_dpt_flg);
	}

	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public void ap_dpt_flg(boolean value) {
		setConstBoolean(offset + 231, $ap_dpt_flg, value);
	}


	/**
	 * Purchasing dept. WG cd. 購買部門ＷＧＣＤ.<p>
	 *
	 */
	public String purc_dpt_wg_cd() {
		return getConstString(offset + 232, $purc_dpt_wg_cd);
	}

	/**
	 * Purchasing dept. WG cd. 購買部門ＷＧＣＤ.<p>
	 *
	 */
	public void purc_dpt_wg_cd(String value) {
		setConstString(offset + 232, $purc_dpt_wg_cd, value);
	}


	/**
	 * Purchasing dept. WG name 購買部門ＷＧ名.<p>
	 *
	 */
	public String purc_dpt_wg_nm() {
		return getConstString(offset + 233, $purc_dpt_wg_nm);
	}

	/**
	 * Purchasing dept. WG name 購買部門ＷＧ名.<p>
	 *
	 */
	public void purc_dpt_wg_nm(String value) {
		setConstString(offset + 233, $purc_dpt_wg_nm, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 234, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 234, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 235, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 235, $bd_dpt_nm, value);
	}


	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public String bd_itm_cd() {
		return getConstString(offset + 236, $bd_itm_cd);
	}

	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public void bd_itm_cd(String value) {
		setConstString(offset + 236, $bd_itm_cd, value);
	}


	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public String bd_itm_sub1() {
		return getConstString(offset + 237, $bd_itm_sub1);
	}

	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public void bd_itm_sub1(String value) {
		setConstString(offset + 237, $bd_itm_sub1, value);
	}


	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public String bd_itm_sub2() {
		return getConstString(offset + 238, $bd_itm_sub2);
	}

	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public void bd_itm_sub2(String value) {
		setConstString(offset + 238, $bd_itm_sub2, value);
	}


	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public String bd_itm_sub3() {
		return getConstString(offset + 239, $bd_itm_sub3);
	}

	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public void bd_itm_sub3(String value) {
		setConstString(offset + 239, $bd_itm_sub3, value);
	}


	/**
	 * Charged item name 負担品名.<p>
	 *
	 */
	public String bd_itm_nm() {
		return getConstString(offset + 240, $bd_itm_nm);
	}

	/**
	 * Charged item name 負担品名.<p>
	 *
	 */
	public void bd_itm_nm(String value) {
		setConstString(offset + 240, $bd_itm_nm, value);
	}


	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public String bd_lot_no() {
		return getConstString(offset + 241, $bd_lot_no);
	}

	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public void bd_lot_no(String value) {
		setConstString(offset + 241, $bd_lot_no, value);
	}


	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public String bd_sublot_no() {
		return getConstString(offset + 242, $bd_sublot_no);
	}

	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public void bd_sublot_no(String value) {
		setConstString(offset + 242, $bd_sublot_no, value);
	}


	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public String bd_sno1() {
		return getConstString(offset + 243, $bd_sno1);
	}

	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public void bd_sno1(String value) {
		setConstString(offset + 243, $bd_sno1, value);
	}


	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public String bd_sno2() {
		return getConstString(offset + 244, $bd_sno2);
	}

	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public void bd_sno2(String value) {
		setConstString(offset + 244, $bd_sno2, value);
	}


	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public String bd_sno3() {
		return getConstString(offset + 245, $bd_sno3);
	}

	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public void bd_sno3(String value) {
		setConstString(offset + 245, $bd_sno3, value);
	}


	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public String bd_sno4() {
		return getConstString(offset + 246, $bd_sno4);
	}

	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public void bd_sno4(String value) {
		setConstString(offset + 246, $bd_sno4, value);
	}


	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public String bd_bp_cd() {
		return getConstString(offset + 247, $bd_bp_cd);
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public void bd_bp_cd(String value) {
		setConstString(offset + 247, $bd_bp_cd, value);
	}


	/**
	 * Charged BP name 負担取引先名.<p>
	 *
	 */
	public String bd_bp_nm() {
		return getConstString(offset + 248, $bd_bp_nm);
	}

	/**
	 * Charged BP name 負担取引先名.<p>
	 *
	 */
	public void bd_bp_nm(String value) {
		setConstString(offset + 248, $bd_bp_nm, value);
	}


	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public String bd_loc_cd() {
		return getConstString(offset + 249, $bd_loc_cd);
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public void bd_loc_cd(String value) {
		setConstString(offset + 249, $bd_loc_cd, value);
	}


	/**
	 * Charged location name 負担場所名.<p>
	 *
	 */
	public String bd_loc_nm() {
		return getConstString(offset + 250, $bd_loc_nm);
	}

	/**
	 * Charged location name 負担場所名.<p>
	 *
	 */
	public void bd_loc_nm(String value) {
		setConstString(offset + 250, $bd_loc_nm, value);
	}


	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public String bd_ctg_cd() {
		return getConstString(offset + 251, $bd_ctg_cd);
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public void bd_ctg_cd(String value) {
		setConstString(offset + 251, $bd_ctg_cd, value);
	}


	/**
	 * Charged item group name 負担品群名.<p>
	 *
	 */
	public String bd_ctg_nm() {
		return getConstString(offset + 252, $bd_ctg_nm);
	}

	/**
	 * Charged item group name 負担品群名.<p>
	 *
	 */
	public void bd_ctg_nm(String value) {
		setConstString(offset + 252, $bd_ctg_nm, value);
	}


	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public String bd_oper_cd() {
		return getConstString(offset + 253, $bd_oper_cd);
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public void bd_oper_cd(String value) {
		setConstString(offset + 253, $bd_oper_cd, value);
	}


	/**
	 * Charged operation name 負担工程名.<p>
	 *
	 */
	public String bd_oper_nm() {
		return getConstString(offset + 254, $bd_oper_nm);
	}

	/**
	 * Charged operation name 負担工程名.<p>
	 *
	 */
	public void bd_oper_nm(String value) {
		setConstString(offset + 254, $bd_oper_nm, value);
	}


	/**
	 * Charged I/V No. 負担Ｉ／ＶＮＯ.<p>
	 *
	 */
	public String bd_iv_no() {
		return getConstString(offset + 255, $bd_iv_no);
	}

	/**
	 * Charged I/V No. 負担Ｉ／ＶＮＯ.<p>
	 *
	 */
	public void bd_iv_no(String value) {
		setConstString(offset + 255, $bd_iv_no, value);
	}


	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public String bd_po_no() {
		return getConstString(offset + 256, $bd_po_no);
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public void bd_po_no(String value) {
		setConstString(offset + 256, $bd_po_no, value);
	}


	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public String bd_slo_no() {
		return getConstString(offset + 257, $bd_slo_no);
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public void bd_slo_no(String value) {
		setConstString(offset + 257, $bd_slo_no, value);
	}


	/**
	 * Purchase invoice details remarks 受領インボイス明細備考.<p>
	 *
	 */
	public String rcpt_iv_d_rmrks() {
		return getConstString(offset + 258, $rcpt_iv_d_rmrks);
	}

	/**
	 * Purchase invoice details remarks 受領インボイス明細備考.<p>
	 *
	 */
	public void rcpt_iv_d_rmrks(String value) {
		setConstString(offset + 258, $rcpt_iv_d_rmrks, value);
	}


	/**
	 * Purchase invoice internal details remark 受領インボイス内部明細備考.<p>
	 *
	 */
	public String rcpt_iv_intr_d_rmrks() {
		return getConstString(offset + 259, $rcpt_iv_intr_d_rmrks);
	}

	/**
	 * Purchase invoice internal details remark 受領インボイス内部明細備考.<p>
	 *
	 */
	public void rcpt_iv_intr_d_rmrks(String value) {
		setConstString(offset + 259, $rcpt_iv_intr_d_rmrks, value);
	}


	/**
	 * Purchase invoice details spare 1 受領インボイス明細予備１.<p>
	 *
	 */
	public String rcpt_iv_d_sub_char1() {
		return getConstString(offset + 260, $rcpt_iv_d_sub_char1);
	}

	/**
	 * Purchase invoice details spare 1 受領インボイス明細予備１.<p>
	 *
	 */
	public void rcpt_iv_d_sub_char1(String value) {
		setConstString(offset + 260, $rcpt_iv_d_sub_char1, value);
	}


	/**
	 * Purchase invoice details spare 2 受領インボイス明細予備２.<p>
	 *
	 */
	public String rcpt_iv_d_sub_char2() {
		return getConstString(offset + 261, $rcpt_iv_d_sub_char2);
	}

	/**
	 * Purchase invoice details spare 2 受領インボイス明細予備２.<p>
	 *
	 */
	public void rcpt_iv_d_sub_char2(String value) {
		setConstString(offset + 261, $rcpt_iv_d_sub_char2, value);
	}


	/**
	 * Purchase invoice details spare 3 受領インボイス明細予備３.<p>
	 *
	 */
	public String rcpt_iv_d_sub_char3() {
		return getConstString(offset + 262, $rcpt_iv_d_sub_char3);
	}

	/**
	 * Purchase invoice details spare 3 受領インボイス明細予備３.<p>
	 *
	 */
	public void rcpt_iv_d_sub_char3(String value) {
		setConstString(offset + 262, $rcpt_iv_d_sub_char3, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 263, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 263, $trd_d_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 264, $intr_d_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 264, $intr_d_rmrks, value);
	}


	/**
	 * Purchase result details spare 1 仕入実績明細予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 265, $sub_char1);
	}

	/**
	 * Purchase result details spare 1 仕入実績明細予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 265, $sub_char1, value);
	}


	/**
	 * Purchase result details spare 2 仕入実績明細予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 266, $sub_char2);
	}

	/**
	 * Purchase result details spare 2 仕入実績明細予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 266, $sub_char2, value);
	}


	/**
	 * Purchase result details spare 3 仕入実績明細予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 267, $sub_char3);
	}

	/**
	 * Purchase result details spare 3 仕入実績明細予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 267, $sub_char3, value);
	}


	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public String po_print_d_rmrks() {
		return getConstString(offset + 268, $po_print_d_rmrks);
	}

	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public void po_print_d_rmrks(String value) {
		setConstString(offset + 268, $po_print_d_rmrks, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 269, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 269, $cont_fctr_flg, value);
	}


	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public MCNumber purc_cont_qty() {
		return getConstNumber(offset + 270, $purc_cont_qty);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(MCNumber value) {
		setConstNumber(offset + 270, $purc_cont_qty, value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(int value) {
		setConstNumber(offset + 270, $purc_cont_qty, value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(long value) {
		setConstNumber(offset + 270, $purc_cont_qty, value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(float value) {
		setConstNumber(offset + 270, $purc_cont_qty, value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(double value) {
		setConstNumber(offset + 270, $purc_cont_qty, value);
	}


	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public MCNumber purc_cont_fctr() {
		return getConstNumber(offset + 271, $purc_cont_fctr);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(MCNumber value) {
		setConstNumber(offset + 271, $purc_cont_fctr, value);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(int value) {
		setConstNumber(offset + 271, $purc_cont_fctr, value);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(long value) {
		setConstNumber(offset + 271, $purc_cont_fctr, value);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(float value) {
		setConstNumber(offset + 271, $purc_cont_fctr, value);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(double value) {
		setConstNumber(offset + 271, $purc_cont_fctr, value);
	}


	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public MCNumber std_cont_qty() {
		return getConstNumber(offset + 272, $std_cont_qty);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(MCNumber value) {
		setConstNumber(offset + 272, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(int value) {
		setConstNumber(offset + 272, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(long value) {
		setConstNumber(offset + 272, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(float value) {
		setConstNumber(offset + 272, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(double value) {
		setConstNumber(offset + 272, $std_cont_qty, value);
	}


	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 273, $std_cont_fctr);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 273, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 273, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 273, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 273, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 273, $std_cont_fctr, value);
	}


	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 274, $cont_fctr_unit_cd);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 274, $cont_fctr_unit_cd, value);
	}


	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public String cont_fctr_unit_nm() {
		return getConstString(offset + 275, $cont_fctr_unit_nm);
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public void cont_fctr_unit_nm(String value) {
		setConstString(offset + 275, $cont_fctr_unit_nm, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 276, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 276, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 277, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 277, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 277, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 277, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 277, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 277, $cont_fctr_dec_place, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 278, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 278, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 278, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 278, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 278, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 278, $disp_seq, value);
	}


	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 279, $arr_pr_no);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 279, $arr_pr_no, value);
	}


	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public MCNumber arr_pr_upd_cntr() {
		return getConstNumber(offset + 280, $arr_pr_upd_cntr);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public void arr_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 280, $arr_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public void arr_pr_upd_cntr(int value) {
		setConstNumber(offset + 280, $arr_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public void arr_pr_upd_cntr(long value) {
		setConstNumber(offset + 280, $arr_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public void arr_pr_upd_cntr(float value) {
		setConstNumber(offset + 280, $arr_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public void arr_pr_upd_cntr(double value) {
		setConstNumber(offset + 280, $arr_pr_upd_cntr, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 281, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 281, $stk_mng_typ, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 282, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 282, $lot_mng_typ, value);
	}


	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 283, $lot_no_typ);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 283, $lot_no_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 284, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 284, $sublot_mng_typ, value);
	}


	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 285, $sublot_no_typ);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 285, $sublot_no_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 286, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 286, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 287, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 287, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 288, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 288, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 289, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 289, $sno4_mng_typ, value);
	}


	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public String bd_lot_mng_typ() {
		return getConstString(offset + 290, $bd_lot_mng_typ);
	}

	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public void bd_lot_mng_typ(String value) {
		setConstString(offset + 290, $bd_lot_mng_typ, value);
	}


	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public String bd_lot_no_typ() {
		return getConstString(offset + 291, $bd_lot_no_typ);
	}

	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public void bd_lot_no_typ(String value) {
		setConstString(offset + 291, $bd_lot_no_typ, value);
	}


	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public String bd_sublot_mng_typ() {
		return getConstString(offset + 292, $bd_sublot_mng_typ);
	}

	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public void bd_sublot_mng_typ(String value) {
		setConstString(offset + 292, $bd_sublot_mng_typ, value);
	}


	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public String bd_sublot_no_typ() {
		return getConstString(offset + 293, $bd_sublot_no_typ);
	}

	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public void bd_sublot_no_typ(String value) {
		setConstString(offset + 293, $bd_sublot_no_typ, value);
	}


	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public String bd_sno1_mng_typ() {
		return getConstString(offset + 294, $bd_sno1_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public void bd_sno1_mng_typ(String value) {
		setConstString(offset + 294, $bd_sno1_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public String bd_sno2_mng_typ() {
		return getConstString(offset + 295, $bd_sno2_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public void bd_sno2_mng_typ(String value) {
		setConstString(offset + 295, $bd_sno2_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public String bd_sno3_mng_typ() {
		return getConstString(offset + 296, $bd_sno3_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public void bd_sno3_mng_typ(String value) {
		setConstString(offset + 296, $bd_sno3_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public String bd_sno4_mng_typ() {
		return getConstString(offset + 297, $bd_sno4_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public void bd_sno4_mng_typ(String value) {
		setConstString(offset + 297, $bd_sno4_mng_typ, value);
	}


	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 298, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 298, $dscnt_itm_flg, value);
	}


	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public String loc_mng_typ() {
		return getConstString(offset + 299, $loc_mng_typ);
	}

	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public void loc_mng_typ(String value) {
		setConstString(offset + 299, $loc_mng_typ, value);
	}


	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public boolean purc_upri_cng_flg() {
		return getConstBoolean(offset + 300, $purc_upri_cng_flg);
	}

	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public void purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 300, $purc_upri_cng_flg, value);
	}


	/**
	 * Update counter (Purchase result header) 更新カウンタ（仕入実績ヘッダ）.<p>
	 *
	 */
	public MCNumber purc_act_upd_cntr() {
		return getConstNumber(offset + 301, $purc_act_upd_cntr);
	}

	/**
	 * Update counter (Purchase result header) 更新カウンタ（仕入実績ヘッダ）.<p>
	 *
	 */
	public void purc_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 301, $purc_act_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase result header) 更新カウンタ（仕入実績ヘッダ）.<p>
	 *
	 */
	public void purc_act_upd_cntr(int value) {
		setConstNumber(offset + 301, $purc_act_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase result header) 更新カウンタ（仕入実績ヘッダ）.<p>
	 *
	 */
	public void purc_act_upd_cntr(long value) {
		setConstNumber(offset + 301, $purc_act_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase result header) 更新カウンタ（仕入実績ヘッダ）.<p>
	 *
	 */
	public void purc_act_upd_cntr(float value) {
		setConstNumber(offset + 301, $purc_act_upd_cntr, value);
	}

	/**
	 * Update counter (Purchase result header) 更新カウンタ（仕入実績ヘッダ）.<p>
	 *
	 */
	public void purc_act_upd_cntr(double value) {
		setConstNumber(offset + 301, $purc_act_upd_cntr, value);
	}


	/**
	 * Manual add マニュアル追加.<p>
	 *
	 */
	public boolean manual_add_flg() {
		return getConstBoolean(offset + 302, $manual_add_flg);
	}

	/**
	 * Manual add マニュアル追加.<p>
	 *
	 */
	public void manual_add_flg(boolean value) {
		setConstBoolean(offset + 302, $manual_add_flg, value);
	}


	public boolean sls_sync_flg() {
		return getConstBoolean(offset + 303, $sls_sync_flg);
	}

	public void sls_sync_flg(boolean value) {
		setConstBoolean(offset + 303, $sls_sync_flg, value);
	}


	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public MCNumber base_unit_purc_act_qty() {
		return getConstNumber(offset + 304, $base_unit_purc_act_qty);
	}

	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public void base_unit_purc_act_qty(MCNumber value) {
		setConstNumber(offset + 304, $base_unit_purc_act_qty, value);
	}

	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public void base_unit_purc_act_qty(int value) {
		setConstNumber(offset + 304, $base_unit_purc_act_qty, value);
	}

	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public void base_unit_purc_act_qty(long value) {
		setConstNumber(offset + 304, $base_unit_purc_act_qty, value);
	}

	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public void base_unit_purc_act_qty(float value) {
		setConstNumber(offset + 304, $base_unit_purc_act_qty, value);
	}

	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public void base_unit_purc_act_qty(double value) {
		setConstNumber(offset + 304, $base_unit_purc_act_qty, value);
	}


	public String getString(String name) {
		if ($schd_unit_cd.equalsIgnoreCase(name)) {
			return schd_unit_cd();
		}
		if ($schd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return schd_trd_unit_rnd_typ();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			return arr_ptn_typ();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			return rcpt_iv_d_no();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($exim_xpns_typ.equalsIgnoreCase(name)) {
			return exim_xpns_typ();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			return cntry_org_nm();
		}
		if ($src_trd_unit_cd.equalsIgnoreCase(name)) {
			return src_trd_unit_cd();
		}
		if ($src_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return src_trd_unit_rnd_typ();
		}
		if ($src_tax_cd.equalsIgnoreCase(name)) {
			return src_tax_cd();
		}
		if ($src_tax_nm.equalsIgnoreCase(name)) {
			return src_tax_nm();
		}
		if ($src_tax_typ.equalsIgnoreCase(name)) {
			return src_tax_typ();
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
		if ($re_arr_loc_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_cd();
		}
		if ($re_arr_loc_nm.equalsIgnoreCase(name)) {
			return re_arr_loc_nm();
		}
		if ($re_arr_loc_wg_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_wg_cd();
		}
		if ($re_arr_loc_wg_nm.equalsIgnoreCase(name)) {
			return re_arr_loc_wg_nm();
		}
		if ($re_arr_str_ln_cd.equalsIgnoreCase(name)) {
			return re_arr_str_ln_cd();
		}
		if ($re_arr_str_ln_nm.equalsIgnoreCase(name)) {
			return re_arr_str_ln_nm();
		}
		if ($re_arr_loc_site_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_site_cd();
		}
		if ($re_arr_loc_cal_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_cal_cd();
		}
		if ($re_arr_loc_sppl_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_sppl_cd();
		}
		if ($re_arr_loc_sppl_cal_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_sppl_cal_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($dlv_loc_wg_cd.equalsIgnoreCase(name)) {
			return dlv_loc_wg_cd();
		}
		if ($dlv_loc_wg_nm.equalsIgnoreCase(name)) {
			return dlv_loc_wg_nm();
		}
		if ($dlv_loc_cd.equalsIgnoreCase(name)) {
			return dlv_loc_cd();
		}
		if ($dlv_loc_nm.equalsIgnoreCase(name)) {
			return dlv_loc_nm();
		}
		if ($dlv_loc_sppl_cd.equalsIgnoreCase(name)) {
			return dlv_loc_sppl_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			return drct_dlv_typ();
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			return drct_dlv_typ_nm();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($scst_cal_cd.equalsIgnoreCase(name)) {
			return scst_cal_cd();
		}
		if ($scst_cd.equalsIgnoreCase(name)) {
			return scst_cd();
		}
		if ($scst_nm.equalsIgnoreCase(name)) {
			return scst_nm();
		}
		if ($scst_zip_cd.equalsIgnoreCase(name)) {
			return scst_zip_cd();
		}
		if ($scst_addr1.equalsIgnoreCase(name)) {
			return scst_addr1();
		}
		if ($scst_addr2.equalsIgnoreCase(name)) {
			return scst_addr2();
		}
		if ($scst_addr3.equalsIgnoreCase(name)) {
			return scst_addr3();
		}
		if ($scst_addr4.equalsIgnoreCase(name)) {
			return scst_addr4();
		}
		if ($scst_tel.equalsIgnoreCase(name)) {
			return scst_tel();
		}
		if ($scst_fax.equalsIgnoreCase(name)) {
			return scst_fax();
		}
		if ($scst_cntry_cd.equalsIgnoreCase(name)) {
			return scst_cntry_cd();
		}
		if ($scst_cntry_nm.equalsIgnoreCase(name)) {
			return scst_cntry_nm();
		}
		if ($scst_cntct_dpt.equalsIgnoreCase(name)) {
			return scst_cntct_dpt();
		}
		if ($scst_cntct_psn.equalsIgnoreCase(name)) {
			return scst_cntct_psn();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			return tdlv_zip_cd();
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			return tdlv_addr1();
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			return tdlv_addr2();
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			return tdlv_addr3();
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			return tdlv_addr4();
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			return tdlv_cntry_cd();
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			return tdlv_cntry_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_d_no();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			return purc_rsn_cd();
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			return purc_rsn_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			return purc_dpt_wg_cd();
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			return purc_dpt_wg_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
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
		if ($bd_lot_no.equalsIgnoreCase(name)) {
			return bd_lot_no();
		}
		if ($bd_sublot_no.equalsIgnoreCase(name)) {
			return bd_sublot_no();
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
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			return bd_bp_cd();
		}
		if ($bd_bp_nm.equalsIgnoreCase(name)) {
			return bd_bp_nm();
		}
		if ($bd_loc_cd.equalsIgnoreCase(name)) {
			return bd_loc_cd();
		}
		if ($bd_loc_nm.equalsIgnoreCase(name)) {
			return bd_loc_nm();
		}
		if ($bd_ctg_cd.equalsIgnoreCase(name)) {
			return bd_ctg_cd();
		}
		if ($bd_ctg_nm.equalsIgnoreCase(name)) {
			return bd_ctg_nm();
		}
		if ($bd_oper_cd.equalsIgnoreCase(name)) {
			return bd_oper_cd();
		}
		if ($bd_oper_nm.equalsIgnoreCase(name)) {
			return bd_oper_nm();
		}
		if ($bd_iv_no.equalsIgnoreCase(name)) {
			return bd_iv_no();
		}
		if ($bd_po_no.equalsIgnoreCase(name)) {
			return bd_po_no();
		}
		if ($bd_slo_no.equalsIgnoreCase(name)) {
			return bd_slo_no();
		}
		if ($rcpt_iv_d_rmrks.equalsIgnoreCase(name)) {
			return rcpt_iv_d_rmrks();
		}
		if ($rcpt_iv_intr_d_rmrks.equalsIgnoreCase(name)) {
			return rcpt_iv_intr_d_rmrks();
		}
		if ($rcpt_iv_d_sub_char1.equalsIgnoreCase(name)) {
			return rcpt_iv_d_sub_char1();
		}
		if ($rcpt_iv_d_sub_char2.equalsIgnoreCase(name)) {
			return rcpt_iv_d_sub_char2();
		}
		if ($rcpt_iv_d_sub_char3.equalsIgnoreCase(name)) {
			return rcpt_iv_d_sub_char3();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
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
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			return po_print_d_rmrks();
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
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
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
		if ($bd_lot_mng_typ.equalsIgnoreCase(name)) {
			return bd_lot_mng_typ();
		}
		if ($bd_lot_no_typ.equalsIgnoreCase(name)) {
			return bd_lot_no_typ();
		}
		if ($bd_sublot_mng_typ.equalsIgnoreCase(name)) {
			return bd_sublot_mng_typ();
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
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			return loc_mng_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_conv_qty();
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_conv_base_qty();
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return schd_trd_unit_dec_place();
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			return purc_act_seq();
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			return purc_act_rev();
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			return purc_act_d_seq();
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_conv_qty();
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_conv_base_qty();
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return src_trd_unit_dec_place();
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_qty();
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			return src_base_unit_qty();
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			return src_trd_cur_upri();
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return src_trd_cur_proc_upri();
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return src_trd_cur_onr_prov_upri();
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_dscnt_amt();
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_amt();
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_proc_amt();
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_onr_prov_amt();
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_tax_amt();
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			return src_wtax_rate();
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			return src_tax_rate();
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
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			return trd_unit_schd_qty();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			return base_unit_schd_qty();
		}
		if ($base_unit_qty_bf_cng.equalsIgnoreCase(name)) {
			return base_unit_qty_bf_cng();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			return base_unit_purc_qty();
		}
		if ($base_unit_arr_qty.equalsIgnoreCase(name)) {
			return base_unit_arr_qty();
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			return base_unit_accpt_dfct_qty();
		}
		if ($trd_unit_re_arr_qty.equalsIgnoreCase(name)) {
			return trd_unit_re_arr_qty();
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return trd_cur_proc_upri();
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return trd_cur_proc_amt();
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_upri();
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
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
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt();
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			return base_cur_proc_upri();
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			return base_cur_proc_amt();
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_upri();
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_amt();
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
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return ptax_cur_dscnt_amt();
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			return ptax_cur_proc_upri();
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			return ptax_cur_proc_amt();
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return ptax_cur_onr_prov_upri();
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return ptax_cur_onr_prov_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($trd_cur_wtax_amt.equalsIgnoreCase(name)) {
			return trd_cur_wtax_amt();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			return purc_cont_qty();
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			return arr_pr_upd_cntr();
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			return purc_act_upd_cntr();
		}
		if ($base_unit_purc_act_qty.equalsIgnoreCase(name)) {
			return base_unit_purc_act_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			return arr_schd_dt();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($re_arr_rqst_dt.equalsIgnoreCase(name)) {
			return re_arr_rqst_dt();
		}
		if ($re_arr_rqst_hm.equalsIgnoreCase(name)) {
			return re_arr_rqst_hm();
		}
		if ($re_arr_purc_schd_dt.equalsIgnoreCase(name)) {
			return re_arr_purc_schd_dt();
		}
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			return ship_fr_valid_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			return arr_skip_flg();
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_flg();
		}
		if ($schd_sync_flg.equalsIgnoreCase(name)) {
			return schd_sync_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($arr_act_flg.equalsIgnoreCase(name)) {
			return arr_act_flg();
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			return temp_ap_flg();
		}
		if ($non_purc_flg.equalsIgnoreCase(name)) {
			return non_purc_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($src_inc_tax_flg.equalsIgnoreCase(name)) {
			return src_inc_tax_flg();
		}
		if ($accpt_dfct_flg.equalsIgnoreCase(name)) {
			return accpt_dfct_flg();
		}
		if ($re_arr_flg.equalsIgnoreCase(name)) {
			return re_arr_flg();
		}
		if ($re_arr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return re_arr_str_ln_tgt_flg();
		}
		if ($re_arr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return re_arr_str_ln_cd_none_flg();
		}
		if ($re_arr_sync_flg.equalsIgnoreCase(name)) {
			return re_arr_sync_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($ncv_flg.equalsIgnoreCase(name)) {
			return ncv_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($scst_sundry_flg.equalsIgnoreCase(name)) {
			return scst_sundry_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			return bp_lot_flg();
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			return upri_not_tgt_flg();
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			return purc_dtl_upd_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			return ap_dpt_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($manual_add_flg.equalsIgnoreCase(name)) {
			return manual_add_flg();
		}
		if ($sls_sync_flg.equalsIgnoreCase(name)) {
			return sls_sync_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($schd_unit_cd.equalsIgnoreCase(name)) {
			return schd_unit_cd();
		}
		if ($schd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return schd_trd_unit_rnd_typ();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			return arr_ptn_typ();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			return rcpt_iv_d_no();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($exim_xpns_typ.equalsIgnoreCase(name)) {
			return exim_xpns_typ();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			return cntry_org_nm();
		}
		if ($src_trd_unit_cd.equalsIgnoreCase(name)) {
			return src_trd_unit_cd();
		}
		if ($src_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return src_trd_unit_rnd_typ();
		}
		if ($src_tax_cd.equalsIgnoreCase(name)) {
			return src_tax_cd();
		}
		if ($src_tax_nm.equalsIgnoreCase(name)) {
			return src_tax_nm();
		}
		if ($src_tax_typ.equalsIgnoreCase(name)) {
			return src_tax_typ();
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
		if ($re_arr_loc_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_cd();
		}
		if ($re_arr_loc_nm.equalsIgnoreCase(name)) {
			return re_arr_loc_nm();
		}
		if ($re_arr_loc_wg_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_wg_cd();
		}
		if ($re_arr_loc_wg_nm.equalsIgnoreCase(name)) {
			return re_arr_loc_wg_nm();
		}
		if ($re_arr_str_ln_cd.equalsIgnoreCase(name)) {
			return re_arr_str_ln_cd();
		}
		if ($re_arr_str_ln_nm.equalsIgnoreCase(name)) {
			return re_arr_str_ln_nm();
		}
		if ($re_arr_loc_site_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_site_cd();
		}
		if ($re_arr_loc_cal_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_cal_cd();
		}
		if ($re_arr_loc_sppl_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_sppl_cd();
		}
		if ($re_arr_loc_sppl_cal_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_sppl_cal_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($dlv_loc_wg_cd.equalsIgnoreCase(name)) {
			return dlv_loc_wg_cd();
		}
		if ($dlv_loc_wg_nm.equalsIgnoreCase(name)) {
			return dlv_loc_wg_nm();
		}
		if ($dlv_loc_cd.equalsIgnoreCase(name)) {
			return dlv_loc_cd();
		}
		if ($dlv_loc_nm.equalsIgnoreCase(name)) {
			return dlv_loc_nm();
		}
		if ($dlv_loc_sppl_cd.equalsIgnoreCase(name)) {
			return dlv_loc_sppl_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			return drct_dlv_typ();
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			return drct_dlv_typ_nm();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($scst_cal_cd.equalsIgnoreCase(name)) {
			return scst_cal_cd();
		}
		if ($scst_cd.equalsIgnoreCase(name)) {
			return scst_cd();
		}
		if ($scst_nm.equalsIgnoreCase(name)) {
			return scst_nm();
		}
		if ($scst_zip_cd.equalsIgnoreCase(name)) {
			return scst_zip_cd();
		}
		if ($scst_addr1.equalsIgnoreCase(name)) {
			return scst_addr1();
		}
		if ($scst_addr2.equalsIgnoreCase(name)) {
			return scst_addr2();
		}
		if ($scst_addr3.equalsIgnoreCase(name)) {
			return scst_addr3();
		}
		if ($scst_addr4.equalsIgnoreCase(name)) {
			return scst_addr4();
		}
		if ($scst_tel.equalsIgnoreCase(name)) {
			return scst_tel();
		}
		if ($scst_fax.equalsIgnoreCase(name)) {
			return scst_fax();
		}
		if ($scst_cntry_cd.equalsIgnoreCase(name)) {
			return scst_cntry_cd();
		}
		if ($scst_cntry_nm.equalsIgnoreCase(name)) {
			return scst_cntry_nm();
		}
		if ($scst_cntct_dpt.equalsIgnoreCase(name)) {
			return scst_cntct_dpt();
		}
		if ($scst_cntct_psn.equalsIgnoreCase(name)) {
			return scst_cntct_psn();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			return tdlv_zip_cd();
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			return tdlv_addr1();
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			return tdlv_addr2();
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			return tdlv_addr3();
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			return tdlv_addr4();
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			return tdlv_cntry_cd();
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			return tdlv_cntry_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_d_no();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			return purc_rsn_cd();
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			return purc_rsn_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			return purc_dpt_wg_cd();
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			return purc_dpt_wg_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
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
		if ($bd_lot_no.equalsIgnoreCase(name)) {
			return bd_lot_no();
		}
		if ($bd_sublot_no.equalsIgnoreCase(name)) {
			return bd_sublot_no();
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
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			return bd_bp_cd();
		}
		if ($bd_bp_nm.equalsIgnoreCase(name)) {
			return bd_bp_nm();
		}
		if ($bd_loc_cd.equalsIgnoreCase(name)) {
			return bd_loc_cd();
		}
		if ($bd_loc_nm.equalsIgnoreCase(name)) {
			return bd_loc_nm();
		}
		if ($bd_ctg_cd.equalsIgnoreCase(name)) {
			return bd_ctg_cd();
		}
		if ($bd_ctg_nm.equalsIgnoreCase(name)) {
			return bd_ctg_nm();
		}
		if ($bd_oper_cd.equalsIgnoreCase(name)) {
			return bd_oper_cd();
		}
		if ($bd_oper_nm.equalsIgnoreCase(name)) {
			return bd_oper_nm();
		}
		if ($bd_iv_no.equalsIgnoreCase(name)) {
			return bd_iv_no();
		}
		if ($bd_po_no.equalsIgnoreCase(name)) {
			return bd_po_no();
		}
		if ($bd_slo_no.equalsIgnoreCase(name)) {
			return bd_slo_no();
		}
		if ($rcpt_iv_d_rmrks.equalsIgnoreCase(name)) {
			return rcpt_iv_d_rmrks();
		}
		if ($rcpt_iv_intr_d_rmrks.equalsIgnoreCase(name)) {
			return rcpt_iv_intr_d_rmrks();
		}
		if ($rcpt_iv_d_sub_char1.equalsIgnoreCase(name)) {
			return rcpt_iv_d_sub_char1();
		}
		if ($rcpt_iv_d_sub_char2.equalsIgnoreCase(name)) {
			return rcpt_iv_d_sub_char2();
		}
		if ($rcpt_iv_d_sub_char3.equalsIgnoreCase(name)) {
			return rcpt_iv_d_sub_char3();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
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
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			return po_print_d_rmrks();
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
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
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
		if ($bd_lot_mng_typ.equalsIgnoreCase(name)) {
			return bd_lot_mng_typ();
		}
		if ($bd_lot_no_typ.equalsIgnoreCase(name)) {
			return bd_lot_no_typ();
		}
		if ($bd_sublot_mng_typ.equalsIgnoreCase(name)) {
			return bd_sublot_mng_typ();
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
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			return loc_mng_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_conv_qty();
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_conv_base_qty();
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return schd_trd_unit_dec_place();
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			return purc_act_seq();
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			return purc_act_rev();
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			return purc_act_d_seq();
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_conv_qty();
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_conv_base_qty();
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return src_trd_unit_dec_place();
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_qty();
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			return src_base_unit_qty();
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			return src_trd_cur_upri();
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return src_trd_cur_proc_upri();
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return src_trd_cur_onr_prov_upri();
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_dscnt_amt();
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_amt();
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_proc_amt();
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_onr_prov_amt();
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_tax_amt();
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			return src_wtax_rate();
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			return src_tax_rate();
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
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			return trd_unit_schd_qty();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			return base_unit_schd_qty();
		}
		if ($base_unit_qty_bf_cng.equalsIgnoreCase(name)) {
			return base_unit_qty_bf_cng();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			return base_unit_purc_qty();
		}
		if ($base_unit_arr_qty.equalsIgnoreCase(name)) {
			return base_unit_arr_qty();
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			return base_unit_accpt_dfct_qty();
		}
		if ($trd_unit_re_arr_qty.equalsIgnoreCase(name)) {
			return trd_unit_re_arr_qty();
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return trd_cur_proc_upri();
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return trd_cur_proc_amt();
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_upri();
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
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
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt();
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			return base_cur_proc_upri();
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			return base_cur_proc_amt();
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_upri();
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_amt();
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
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return ptax_cur_dscnt_amt();
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			return ptax_cur_proc_upri();
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			return ptax_cur_proc_amt();
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return ptax_cur_onr_prov_upri();
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return ptax_cur_onr_prov_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($trd_cur_wtax_amt.equalsIgnoreCase(name)) {
			return trd_cur_wtax_amt();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			return purc_cont_qty();
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			return arr_pr_upd_cntr();
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			return purc_act_upd_cntr();
		}
		if ($base_unit_purc_act_qty.equalsIgnoreCase(name)) {
			return base_unit_purc_act_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			return arr_schd_dt();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($re_arr_rqst_dt.equalsIgnoreCase(name)) {
			return re_arr_rqst_dt();
		}
		if ($re_arr_rqst_hm.equalsIgnoreCase(name)) {
			return re_arr_rqst_hm();
		}
		if ($re_arr_purc_schd_dt.equalsIgnoreCase(name)) {
			return re_arr_purc_schd_dt();
		}
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			return ship_fr_valid_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			return arr_skip_flg();
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_flg();
		}
		if ($schd_sync_flg.equalsIgnoreCase(name)) {
			return schd_sync_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($arr_act_flg.equalsIgnoreCase(name)) {
			return arr_act_flg();
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			return temp_ap_flg();
		}
		if ($non_purc_flg.equalsIgnoreCase(name)) {
			return non_purc_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($src_inc_tax_flg.equalsIgnoreCase(name)) {
			return src_inc_tax_flg();
		}
		if ($accpt_dfct_flg.equalsIgnoreCase(name)) {
			return accpt_dfct_flg();
		}
		if ($re_arr_flg.equalsIgnoreCase(name)) {
			return re_arr_flg();
		}
		if ($re_arr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return re_arr_str_ln_tgt_flg();
		}
		if ($re_arr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return re_arr_str_ln_cd_none_flg();
		}
		if ($re_arr_sync_flg.equalsIgnoreCase(name)) {
			return re_arr_sync_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($ncv_flg.equalsIgnoreCase(name)) {
			return ncv_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($scst_sundry_flg.equalsIgnoreCase(name)) {
			return scst_sundry_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			return bp_lot_flg();
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			return upri_not_tgt_flg();
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			return purc_dtl_upd_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			return ap_dpt_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($manual_add_flg.equalsIgnoreCase(name)) {
			return manual_add_flg();
		}
		if ($sls_sync_flg.equalsIgnoreCase(name)) {
			return sls_sync_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($schd_unit_cd.equalsIgnoreCase(name)) {
			schd_unit_cd(value);
			return;
		}
		if ($schd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			schd_trd_unit_rnd_typ(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			purc_id_typ_nm(value);
			return;
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			arr_ptn_typ(value);
			return;
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			purc_basis_typ_nm(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			rcpt_iv_d_no(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($exim_xpns_typ.equalsIgnoreCase(name)) {
			exim_xpns_typ(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
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
		if ($src_trd_unit_cd.equalsIgnoreCase(name)) {
			src_trd_unit_cd(value);
			return;
		}
		if ($src_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			src_trd_unit_rnd_typ(value);
			return;
		}
		if ($src_tax_cd.equalsIgnoreCase(name)) {
			src_tax_cd(value);
			return;
		}
		if ($src_tax_nm.equalsIgnoreCase(name)) {
			src_tax_nm(value);
			return;
		}
		if ($src_tax_typ.equalsIgnoreCase(name)) {
			src_tax_typ(value);
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
		if ($re_arr_loc_cd.equalsIgnoreCase(name)) {
			re_arr_loc_cd(value);
			return;
		}
		if ($re_arr_loc_nm.equalsIgnoreCase(name)) {
			re_arr_loc_nm(value);
			return;
		}
		if ($re_arr_loc_wg_cd.equalsIgnoreCase(name)) {
			re_arr_loc_wg_cd(value);
			return;
		}
		if ($re_arr_loc_wg_nm.equalsIgnoreCase(name)) {
			re_arr_loc_wg_nm(value);
			return;
		}
		if ($re_arr_str_ln_cd.equalsIgnoreCase(name)) {
			re_arr_str_ln_cd(value);
			return;
		}
		if ($re_arr_str_ln_nm.equalsIgnoreCase(name)) {
			re_arr_str_ln_nm(value);
			return;
		}
		if ($re_arr_loc_site_cd.equalsIgnoreCase(name)) {
			re_arr_loc_site_cd(value);
			return;
		}
		if ($re_arr_loc_cal_cd.equalsIgnoreCase(name)) {
			re_arr_loc_cal_cd(value);
			return;
		}
		if ($re_arr_loc_sppl_cd.equalsIgnoreCase(name)) {
			re_arr_loc_sppl_cd(value);
			return;
		}
		if ($re_arr_loc_sppl_cal_cd.equalsIgnoreCase(name)) {
			re_arr_loc_sppl_cal_cd(value);
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($dlv_loc_wg_cd.equalsIgnoreCase(name)) {
			dlv_loc_wg_cd(value);
			return;
		}
		if ($dlv_loc_wg_nm.equalsIgnoreCase(name)) {
			dlv_loc_wg_nm(value);
			return;
		}
		if ($dlv_loc_cd.equalsIgnoreCase(name)) {
			dlv_loc_cd(value);
			return;
		}
		if ($dlv_loc_nm.equalsIgnoreCase(name)) {
			dlv_loc_nm(value);
			return;
		}
		if ($dlv_loc_sppl_cd.equalsIgnoreCase(name)) {
			dlv_loc_sppl_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			drct_dlv_typ(value);
			return;
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			drct_dlv_typ_nm(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($scst_cal_cd.equalsIgnoreCase(name)) {
			scst_cal_cd(value);
			return;
		}
		if ($scst_cd.equalsIgnoreCase(name)) {
			scst_cd(value);
			return;
		}
		if ($scst_nm.equalsIgnoreCase(name)) {
			scst_nm(value);
			return;
		}
		if ($scst_zip_cd.equalsIgnoreCase(name)) {
			scst_zip_cd(value);
			return;
		}
		if ($scst_addr1.equalsIgnoreCase(name)) {
			scst_addr1(value);
			return;
		}
		if ($scst_addr2.equalsIgnoreCase(name)) {
			scst_addr2(value);
			return;
		}
		if ($scst_addr3.equalsIgnoreCase(name)) {
			scst_addr3(value);
			return;
		}
		if ($scst_addr4.equalsIgnoreCase(name)) {
			scst_addr4(value);
			return;
		}
		if ($scst_tel.equalsIgnoreCase(name)) {
			scst_tel(value);
			return;
		}
		if ($scst_fax.equalsIgnoreCase(name)) {
			scst_fax(value);
			return;
		}
		if ($scst_cntry_cd.equalsIgnoreCase(name)) {
			scst_cntry_cd(value);
			return;
		}
		if ($scst_cntry_nm.equalsIgnoreCase(name)) {
			scst_cntry_nm(value);
			return;
		}
		if ($scst_cntct_dpt.equalsIgnoreCase(name)) {
			scst_cntct_dpt(value);
			return;
		}
		if ($scst_cntct_psn.equalsIgnoreCase(name)) {
			scst_cntct_psn(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			tdlv_cntct_dpt(value);
			return;
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			tdlv_cntct_psn(value);
			return;
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			tdlv_zip_cd(value);
			return;
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			tdlv_addr1(value);
			return;
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			tdlv_addr2(value);
			return;
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			tdlv_addr3(value);
			return;
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			tdlv_addr4(value);
			return;
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
			return;
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			tdlv_cntry_cd(value);
			return;
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			tdlv_cntry_nm(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_no(value);
			return;
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_d_no(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
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
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			purc_rsn_cd(value);
			return;
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			purc_rsn_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			purc_usr_nm(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
			return;
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			purc_dpt_wg_cd(value);
			return;
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			purc_dpt_wg_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
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
		if ($bd_lot_no.equalsIgnoreCase(name)) {
			bd_lot_no(value);
			return;
		}
		if ($bd_sublot_no.equalsIgnoreCase(name)) {
			bd_sublot_no(value);
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
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			bd_bp_cd(value);
			return;
		}
		if ($bd_bp_nm.equalsIgnoreCase(name)) {
			bd_bp_nm(value);
			return;
		}
		if ($bd_loc_cd.equalsIgnoreCase(name)) {
			bd_loc_cd(value);
			return;
		}
		if ($bd_loc_nm.equalsIgnoreCase(name)) {
			bd_loc_nm(value);
			return;
		}
		if ($bd_ctg_cd.equalsIgnoreCase(name)) {
			bd_ctg_cd(value);
			return;
		}
		if ($bd_ctg_nm.equalsIgnoreCase(name)) {
			bd_ctg_nm(value);
			return;
		}
		if ($bd_oper_cd.equalsIgnoreCase(name)) {
			bd_oper_cd(value);
			return;
		}
		if ($bd_oper_nm.equalsIgnoreCase(name)) {
			bd_oper_nm(value);
			return;
		}
		if ($bd_iv_no.equalsIgnoreCase(name)) {
			bd_iv_no(value);
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
		if ($rcpt_iv_d_rmrks.equalsIgnoreCase(name)) {
			rcpt_iv_d_rmrks(value);
			return;
		}
		if ($rcpt_iv_intr_d_rmrks.equalsIgnoreCase(name)) {
			rcpt_iv_intr_d_rmrks(value);
			return;
		}
		if ($rcpt_iv_d_sub_char1.equalsIgnoreCase(name)) {
			rcpt_iv_d_sub_char1(value);
			return;
		}
		if ($rcpt_iv_d_sub_char2.equalsIgnoreCase(name)) {
			rcpt_iv_d_sub_char2(value);
			return;
		}
		if ($rcpt_iv_d_sub_char3.equalsIgnoreCase(name)) {
			rcpt_iv_d_sub_char3(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
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
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			po_print_d_rmrks(value);
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
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
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
		if ($bd_lot_mng_typ.equalsIgnoreCase(name)) {
			bd_lot_mng_typ(value);
			return;
		}
		if ($bd_lot_no_typ.equalsIgnoreCase(name)) {
			bd_lot_no_typ(value);
			return;
		}
		if ($bd_sublot_mng_typ.equalsIgnoreCase(name)) {
			bd_sublot_mng_typ(value);
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
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			loc_mng_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			src_base_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			src_wtax_rate(value);
			return;
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			src_tax_rate(value);
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
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_qty_bf_cng.equalsIgnoreCase(name)) {
			base_unit_qty_bf_cng(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		if ($base_unit_arr_qty.equalsIgnoreCase(name)) {
			base_unit_arr_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($trd_unit_re_arr_qty.equalsIgnoreCase(name)) {
			trd_unit_re_arr_qty(value);
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			base_cur_proc_upri(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
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
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($trd_cur_wtax_amt.equalsIgnoreCase(name)) {
			trd_cur_wtax_amt(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($base_unit_purc_act_qty.equalsIgnoreCase(name)) {
			base_unit_purc_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			src_base_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			src_wtax_rate(value);
			return;
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			src_tax_rate(value);
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
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_qty_bf_cng.equalsIgnoreCase(name)) {
			base_unit_qty_bf_cng(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		if ($base_unit_arr_qty.equalsIgnoreCase(name)) {
			base_unit_arr_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($trd_unit_re_arr_qty.equalsIgnoreCase(name)) {
			trd_unit_re_arr_qty(value);
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			base_cur_proc_upri(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
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
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($trd_cur_wtax_amt.equalsIgnoreCase(name)) {
			trd_cur_wtax_amt(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($base_unit_purc_act_qty.equalsIgnoreCase(name)) {
			base_unit_purc_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			src_base_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			src_wtax_rate(value);
			return;
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			src_tax_rate(value);
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
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_qty_bf_cng.equalsIgnoreCase(name)) {
			base_unit_qty_bf_cng(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		if ($base_unit_arr_qty.equalsIgnoreCase(name)) {
			base_unit_arr_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($trd_unit_re_arr_qty.equalsIgnoreCase(name)) {
			trd_unit_re_arr_qty(value);
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			base_cur_proc_upri(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
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
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($trd_cur_wtax_amt.equalsIgnoreCase(name)) {
			trd_cur_wtax_amt(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($base_unit_purc_act_qty.equalsIgnoreCase(name)) {
			base_unit_purc_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			src_base_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			src_wtax_rate(value);
			return;
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			src_tax_rate(value);
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
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_qty_bf_cng.equalsIgnoreCase(name)) {
			base_unit_qty_bf_cng(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		if ($base_unit_arr_qty.equalsIgnoreCase(name)) {
			base_unit_arr_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($trd_unit_re_arr_qty.equalsIgnoreCase(name)) {
			trd_unit_re_arr_qty(value);
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			base_cur_proc_upri(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
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
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($trd_cur_wtax_amt.equalsIgnoreCase(name)) {
			trd_cur_wtax_amt(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($base_unit_purc_act_qty.equalsIgnoreCase(name)) {
			base_unit_purc_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			src_base_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			src_wtax_rate(value);
			return;
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			src_tax_rate(value);
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
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_qty_bf_cng.equalsIgnoreCase(name)) {
			base_unit_qty_bf_cng(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		if ($base_unit_arr_qty.equalsIgnoreCase(name)) {
			base_unit_arr_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($trd_unit_re_arr_qty.equalsIgnoreCase(name)) {
			trd_unit_re_arr_qty(value);
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			base_cur_proc_upri(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
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
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($trd_cur_wtax_amt.equalsIgnoreCase(name)) {
			trd_cur_wtax_amt(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($base_unit_purc_act_qty.equalsIgnoreCase(name)) {
			base_unit_purc_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			arr_schd_dt(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($re_arr_rqst_dt.equalsIgnoreCase(name)) {
			re_arr_rqst_dt(value);
			return;
		}
		if ($re_arr_rqst_hm.equalsIgnoreCase(name)) {
			re_arr_rqst_hm(value);
			return;
		}
		if ($re_arr_purc_schd_dt.equalsIgnoreCase(name)) {
			re_arr_purc_schd_dt(value);
			return;
		}
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			ship_fr_valid_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			arr_skip_flg(value);
			return;
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			purc_ddlv_flg(value);
			return;
		}
		if ($schd_sync_flg.equalsIgnoreCase(name)) {
			schd_sync_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($arr_act_flg.equalsIgnoreCase(name)) {
			arr_act_flg(value);
			return;
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			temp_ap_flg(value);
			return;
		}
		if ($non_purc_flg.equalsIgnoreCase(name)) {
			non_purc_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($src_inc_tax_flg.equalsIgnoreCase(name)) {
			src_inc_tax_flg(value);
			return;
		}
		if ($accpt_dfct_flg.equalsIgnoreCase(name)) {
			accpt_dfct_flg(value);
			return;
		}
		if ($re_arr_flg.equalsIgnoreCase(name)) {
			re_arr_flg(value);
			return;
		}
		if ($re_arr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			re_arr_str_ln_tgt_flg(value);
			return;
		}
		if ($re_arr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			re_arr_str_ln_cd_none_flg(value);
			return;
		}
		if ($re_arr_sync_flg.equalsIgnoreCase(name)) {
			re_arr_sync_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($ncv_flg.equalsIgnoreCase(name)) {
			ncv_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($scst_sundry_flg.equalsIgnoreCase(name)) {
			scst_sundry_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			bp_lot_flg(value);
			return;
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			upri_not_tgt_flg(value);
			return;
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			purc_dtl_upd_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
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
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			ap_dpt_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($manual_add_flg.equalsIgnoreCase(name)) {
			manual_add_flg(value);
			return;
		}
		if ($sls_sync_flg.equalsIgnoreCase(name)) {
			sls_sync_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($schd_unit_cd.equalsIgnoreCase(name)) {
			schd_unit_cd(value);
			return;
		}
		if ($schd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			schd_trd_unit_rnd_typ(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			purc_id_typ_nm(value);
			return;
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			arr_ptn_typ(value);
			return;
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			purc_basis_typ_nm(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			rcpt_iv_d_no(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($exim_xpns_typ.equalsIgnoreCase(name)) {
			exim_xpns_typ(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
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
		if ($src_trd_unit_cd.equalsIgnoreCase(name)) {
			src_trd_unit_cd(value);
			return;
		}
		if ($src_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			src_trd_unit_rnd_typ(value);
			return;
		}
		if ($src_tax_cd.equalsIgnoreCase(name)) {
			src_tax_cd(value);
			return;
		}
		if ($src_tax_nm.equalsIgnoreCase(name)) {
			src_tax_nm(value);
			return;
		}
		if ($src_tax_typ.equalsIgnoreCase(name)) {
			src_tax_typ(value);
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
		if ($re_arr_loc_cd.equalsIgnoreCase(name)) {
			re_arr_loc_cd(value);
			return;
		}
		if ($re_arr_loc_nm.equalsIgnoreCase(name)) {
			re_arr_loc_nm(value);
			return;
		}
		if ($re_arr_loc_wg_cd.equalsIgnoreCase(name)) {
			re_arr_loc_wg_cd(value);
			return;
		}
		if ($re_arr_loc_wg_nm.equalsIgnoreCase(name)) {
			re_arr_loc_wg_nm(value);
			return;
		}
		if ($re_arr_str_ln_cd.equalsIgnoreCase(name)) {
			re_arr_str_ln_cd(value);
			return;
		}
		if ($re_arr_str_ln_nm.equalsIgnoreCase(name)) {
			re_arr_str_ln_nm(value);
			return;
		}
		if ($re_arr_loc_site_cd.equalsIgnoreCase(name)) {
			re_arr_loc_site_cd(value);
			return;
		}
		if ($re_arr_loc_cal_cd.equalsIgnoreCase(name)) {
			re_arr_loc_cal_cd(value);
			return;
		}
		if ($re_arr_loc_sppl_cd.equalsIgnoreCase(name)) {
			re_arr_loc_sppl_cd(value);
			return;
		}
		if ($re_arr_loc_sppl_cal_cd.equalsIgnoreCase(name)) {
			re_arr_loc_sppl_cal_cd(value);
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($dlv_loc_wg_cd.equalsIgnoreCase(name)) {
			dlv_loc_wg_cd(value);
			return;
		}
		if ($dlv_loc_wg_nm.equalsIgnoreCase(name)) {
			dlv_loc_wg_nm(value);
			return;
		}
		if ($dlv_loc_cd.equalsIgnoreCase(name)) {
			dlv_loc_cd(value);
			return;
		}
		if ($dlv_loc_nm.equalsIgnoreCase(name)) {
			dlv_loc_nm(value);
			return;
		}
		if ($dlv_loc_sppl_cd.equalsIgnoreCase(name)) {
			dlv_loc_sppl_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			drct_dlv_typ(value);
			return;
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			drct_dlv_typ_nm(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($scst_cal_cd.equalsIgnoreCase(name)) {
			scst_cal_cd(value);
			return;
		}
		if ($scst_cd.equalsIgnoreCase(name)) {
			scst_cd(value);
			return;
		}
		if ($scst_nm.equalsIgnoreCase(name)) {
			scst_nm(value);
			return;
		}
		if ($scst_zip_cd.equalsIgnoreCase(name)) {
			scst_zip_cd(value);
			return;
		}
		if ($scst_addr1.equalsIgnoreCase(name)) {
			scst_addr1(value);
			return;
		}
		if ($scst_addr2.equalsIgnoreCase(name)) {
			scst_addr2(value);
			return;
		}
		if ($scst_addr3.equalsIgnoreCase(name)) {
			scst_addr3(value);
			return;
		}
		if ($scst_addr4.equalsIgnoreCase(name)) {
			scst_addr4(value);
			return;
		}
		if ($scst_tel.equalsIgnoreCase(name)) {
			scst_tel(value);
			return;
		}
		if ($scst_fax.equalsIgnoreCase(name)) {
			scst_fax(value);
			return;
		}
		if ($scst_cntry_cd.equalsIgnoreCase(name)) {
			scst_cntry_cd(value);
			return;
		}
		if ($scst_cntry_nm.equalsIgnoreCase(name)) {
			scst_cntry_nm(value);
			return;
		}
		if ($scst_cntct_dpt.equalsIgnoreCase(name)) {
			scst_cntct_dpt(value);
			return;
		}
		if ($scst_cntct_psn.equalsIgnoreCase(name)) {
			scst_cntct_psn(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			tdlv_cntct_dpt(value);
			return;
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			tdlv_cntct_psn(value);
			return;
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			tdlv_zip_cd(value);
			return;
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			tdlv_addr1(value);
			return;
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			tdlv_addr2(value);
			return;
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			tdlv_addr3(value);
			return;
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			tdlv_addr4(value);
			return;
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
			return;
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			tdlv_cntry_cd(value);
			return;
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			tdlv_cntry_nm(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_no(value);
			return;
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_d_no(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
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
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			purc_rsn_cd(value);
			return;
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			purc_rsn_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			purc_usr_nm(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
			return;
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			purc_dpt_wg_cd(value);
			return;
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			purc_dpt_wg_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
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
		if ($bd_lot_no.equalsIgnoreCase(name)) {
			bd_lot_no(value);
			return;
		}
		if ($bd_sublot_no.equalsIgnoreCase(name)) {
			bd_sublot_no(value);
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
		if ($bd_bp_cd.equalsIgnoreCase(name)) {
			bd_bp_cd(value);
			return;
		}
		if ($bd_bp_nm.equalsIgnoreCase(name)) {
			bd_bp_nm(value);
			return;
		}
		if ($bd_loc_cd.equalsIgnoreCase(name)) {
			bd_loc_cd(value);
			return;
		}
		if ($bd_loc_nm.equalsIgnoreCase(name)) {
			bd_loc_nm(value);
			return;
		}
		if ($bd_ctg_cd.equalsIgnoreCase(name)) {
			bd_ctg_cd(value);
			return;
		}
		if ($bd_ctg_nm.equalsIgnoreCase(name)) {
			bd_ctg_nm(value);
			return;
		}
		if ($bd_oper_cd.equalsIgnoreCase(name)) {
			bd_oper_cd(value);
			return;
		}
		if ($bd_oper_nm.equalsIgnoreCase(name)) {
			bd_oper_nm(value);
			return;
		}
		if ($bd_iv_no.equalsIgnoreCase(name)) {
			bd_iv_no(value);
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
		if ($rcpt_iv_d_rmrks.equalsIgnoreCase(name)) {
			rcpt_iv_d_rmrks(value);
			return;
		}
		if ($rcpt_iv_intr_d_rmrks.equalsIgnoreCase(name)) {
			rcpt_iv_intr_d_rmrks(value);
			return;
		}
		if ($rcpt_iv_d_sub_char1.equalsIgnoreCase(name)) {
			rcpt_iv_d_sub_char1(value);
			return;
		}
		if ($rcpt_iv_d_sub_char2.equalsIgnoreCase(name)) {
			rcpt_iv_d_sub_char2(value);
			return;
		}
		if ($rcpt_iv_d_sub_char3.equalsIgnoreCase(name)) {
			rcpt_iv_d_sub_char3(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
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
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			po_print_d_rmrks(value);
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
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
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
		if ($bd_lot_mng_typ.equalsIgnoreCase(name)) {
			bd_lot_mng_typ(value);
			return;
		}
		if ($bd_lot_no_typ.equalsIgnoreCase(name)) {
			bd_lot_no_typ(value);
			return;
		}
		if ($bd_sublot_mng_typ.equalsIgnoreCase(name)) {
			bd_sublot_mng_typ(value);
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
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			loc_mng_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			src_base_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			src_wtax_rate(value);
			return;
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			src_tax_rate(value);
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
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_qty_bf_cng.equalsIgnoreCase(name)) {
			base_unit_qty_bf_cng(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		if ($base_unit_arr_qty.equalsIgnoreCase(name)) {
			base_unit_arr_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($trd_unit_re_arr_qty.equalsIgnoreCase(name)) {
			trd_unit_re_arr_qty(value);
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			base_cur_proc_upri(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
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
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($trd_cur_wtax_amt.equalsIgnoreCase(name)) {
			trd_cur_wtax_amt(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($base_unit_purc_act_qty.equalsIgnoreCase(name)) {
			base_unit_purc_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			src_base_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			src_wtax_rate(value);
			return;
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			src_tax_rate(value);
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
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_qty_bf_cng.equalsIgnoreCase(name)) {
			base_unit_qty_bf_cng(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		if ($base_unit_arr_qty.equalsIgnoreCase(name)) {
			base_unit_arr_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($trd_unit_re_arr_qty.equalsIgnoreCase(name)) {
			trd_unit_re_arr_qty(value);
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			base_cur_proc_upri(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
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
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($trd_cur_wtax_amt.equalsIgnoreCase(name)) {
			trd_cur_wtax_amt(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($base_unit_purc_act_qty.equalsIgnoreCase(name)) {
			base_unit_purc_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			src_base_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			src_wtax_rate(value);
			return;
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			src_tax_rate(value);
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
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_qty_bf_cng.equalsIgnoreCase(name)) {
			base_unit_qty_bf_cng(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		if ($base_unit_arr_qty.equalsIgnoreCase(name)) {
			base_unit_arr_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($trd_unit_re_arr_qty.equalsIgnoreCase(name)) {
			trd_unit_re_arr_qty(value);
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			base_cur_proc_upri(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
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
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($trd_cur_wtax_amt.equalsIgnoreCase(name)) {
			trd_cur_wtax_amt(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($base_unit_purc_act_qty.equalsIgnoreCase(name)) {
			base_unit_purc_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			src_base_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			src_wtax_rate(value);
			return;
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			src_tax_rate(value);
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
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_qty_bf_cng.equalsIgnoreCase(name)) {
			base_unit_qty_bf_cng(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		if ($base_unit_arr_qty.equalsIgnoreCase(name)) {
			base_unit_arr_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($trd_unit_re_arr_qty.equalsIgnoreCase(name)) {
			trd_unit_re_arr_qty(value);
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			base_cur_proc_upri(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
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
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($trd_cur_wtax_amt.equalsIgnoreCase(name)) {
			trd_cur_wtax_amt(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($base_unit_purc_act_qty.equalsIgnoreCase(name)) {
			base_unit_purc_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_base_unit_qty.equalsIgnoreCase(name)) {
			src_base_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			src_wtax_rate(value);
			return;
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			src_tax_rate(value);
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
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($base_unit_qty_bf_cng.equalsIgnoreCase(name)) {
			base_unit_qty_bf_cng(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		if ($base_unit_arr_qty.equalsIgnoreCase(name)) {
			base_unit_arr_qty(value);
			return;
		}
		if ($base_unit_accpt_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_accpt_dfct_qty(value);
			return;
		}
		if ($trd_unit_re_arr_qty.equalsIgnoreCase(name)) {
			trd_unit_re_arr_qty(value);
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			base_cur_proc_upri(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
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
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($trd_cur_wtax_amt.equalsIgnoreCase(name)) {
			trd_cur_wtax_amt(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($base_unit_purc_act_qty.equalsIgnoreCase(name)) {
			base_unit_purc_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			arr_schd_dt(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($re_arr_rqst_dt.equalsIgnoreCase(name)) {
			re_arr_rqst_dt(value);
			return;
		}
		if ($re_arr_rqst_hm.equalsIgnoreCase(name)) {
			re_arr_rqst_hm(value);
			return;
		}
		if ($re_arr_purc_schd_dt.equalsIgnoreCase(name)) {
			re_arr_purc_schd_dt(value);
			return;
		}
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			ship_fr_valid_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			arr_skip_flg(value);
			return;
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			purc_ddlv_flg(value);
			return;
		}
		if ($schd_sync_flg.equalsIgnoreCase(name)) {
			schd_sync_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($arr_act_flg.equalsIgnoreCase(name)) {
			arr_act_flg(value);
			return;
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			temp_ap_flg(value);
			return;
		}
		if ($non_purc_flg.equalsIgnoreCase(name)) {
			non_purc_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($src_inc_tax_flg.equalsIgnoreCase(name)) {
			src_inc_tax_flg(value);
			return;
		}
		if ($accpt_dfct_flg.equalsIgnoreCase(name)) {
			accpt_dfct_flg(value);
			return;
		}
		if ($re_arr_flg.equalsIgnoreCase(name)) {
			re_arr_flg(value);
			return;
		}
		if ($re_arr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			re_arr_str_ln_tgt_flg(value);
			return;
		}
		if ($re_arr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			re_arr_str_ln_cd_none_flg(value);
			return;
		}
		if ($re_arr_sync_flg.equalsIgnoreCase(name)) {
			re_arr_sync_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($ncv_flg.equalsIgnoreCase(name)) {
			ncv_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($scst_sundry_flg.equalsIgnoreCase(name)) {
			scst_sundry_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			bp_lot_flg(value);
			return;
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			upri_not_tgt_flg(value);
			return;
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			purc_dtl_upd_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
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
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			ap_dpt_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($manual_add_flg.equalsIgnoreCase(name)) {
			manual_add_flg(value);
			return;
		}
		if ($sls_sync_flg.equalsIgnoreCase(name)) {
			sls_sync_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

