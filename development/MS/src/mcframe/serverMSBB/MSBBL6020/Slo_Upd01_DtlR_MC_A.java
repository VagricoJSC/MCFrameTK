package mcframe.serverMSBB.MSBBL6020;

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
 * ブロック"Slo_Upd01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Slo_Upd01_DtlR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
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
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public static final String $comp_spec_typ = "comp_spec_typ";
	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public static final String $alloc_margin_days = "alloc_margin_days";
	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public static final String $cntry_org_cd = "cntry_org_cd";
	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public static final String $vmi_flg = "vmi_flg";
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
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public static final String $upri_not_tgt_flg = "upri_not_tgt_flg";
	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public static final String $cost_upri = "cost_upri";
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public static final String $dscnt_rsn_cd = "dscnt_rsn_cd";
	/**
	 * I/V unit price Ｉ／Ｖ単価.<p>
	 *
	 */
	public static final String $iv_upri = "iv_upri";
	/**
	 * I/V amount Ｉ／Ｖ金額.<p>
	 *
	 */
	public static final String $iv_amt = "iv_amt";
	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public static final String $tax_fix_flg = "tax_fix_flg";
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public static final String $wtax_amt = "wtax_amt";
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public static final String $bill_crryovr_times = "bill_crryovr_times";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Numbering SEIBAN No. 手配ＮＯ発番.<p>
	 *
	 */
	public static final String $sno_num_flg = "sno_num_flg";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public static final String $sno1_null_flg = "sno1_null_flg";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public static final String $sno2_null_flg = "sno2_null_flg";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public static final String $sno3_null_flg = "sno3_null_flg";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public static final String $sno4_null_flg = "sno4_null_flg";
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
	 * SEIBAN No. 1 numbering pattern cd. 手配ＮＯ１発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sno1_ptn_cd = "sno1_ptn_cd";
	/**
	 * SEIBAN No. 2 numbering pattern cd. 手配ＮＯ２発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sno2_ptn_cd = "sno2_ptn_cd";
	/**
	 * SEIBAN No. 3 numbering pattern cd. 手配ＮＯ３発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sno3_ptn_cd = "sno3_ptn_cd";
	/**
	 * SEIBAN No. 4 numbering pattern cd. 手配ＮＯ４発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sno4_ptn_cd = "sno4_ptn_cd";
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
	 * Assortment No. 品揃ＮＯ.<p>
	 *
	 */
	public static final String $set_itm_grp_no = "set_itm_grp_no";
	/**
	 * Desired shipping date and time 出荷希望日時.<p>
	 *
	 */
	public static final String $ship_rqst_tm = "ship_rqst_tm";
	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public static final String $dlv_rqst_tm = "dlv_rqst_tm";
	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public static final String $sls_schd_dt = "sls_schd_dt";
	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public static final String $accpt_schd_dt = "accpt_schd_dt";
	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public static final String $ship_schd_tm = "ship_schd_tm";
	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public static final String $dlv_schd_tm = "dlv_schd_tm";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public static final String $dlv_cntct_dpt = "dlv_cntct_dpt";
	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public static final String $dlv_cntct_psn = "dlv_cntct_psn";
	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public static final String $dlv_zip_cd = "dlv_zip_cd";
	/**
	 * Address 1 (Delivery destination) 納品先住所1.<p>
	 *
	 */
	public static final String $dlv_addr1 = "dlv_addr1";
	/**
	 * Address 2 (Delivery destination) 納品先住所2.<p>
	 *
	 */
	public static final String $dlv_addr2 = "dlv_addr2";
	/**
	 * Address 3 (Delivery destination) 納品先住所3.<p>
	 *
	 */
	public static final String $dlv_addr3 = "dlv_addr3";
	/**
	 * Address 4 (Delivery destination) 納品先住所4.<p>
	 *
	 */
	public static final String $dlv_addr4 = "dlv_addr4";
	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public static final String $dlv_tel = "dlv_tel";
	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public static final String $dlv_fax = "dlv_fax";
	/**
	 * Delivery destination distribution G cd. 納品先物流ＧＣＤ.<p>
	 *
	 */
	public static final String $dlv_lg_grp_cd = "dlv_lg_grp_cd";
	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cntry_cd = "dlv_cntry_cd";
	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public static final String $pri_prnt_flg = "pri_prnt_flg";
	/**
	 * Receiving point required 配送先必須.<p>
	 *
	 */
	public static final String $tdlv_req_flg = "tdlv_req_flg";
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public static final String $tdlv_cd = "tdlv_cd";
	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public static final String $tdlv_sundry_flg = "tdlv_sundry_flg";
	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public static final String $tdlv_nm = "tdlv_nm";
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
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
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public static final String $tdlv_zip_cd = "tdlv_zip_cd";
	/**
	 * Receiving point address 1 配送先住所1.<p>
	 *
	 */
	public static final String $tdlv_addr1 = "tdlv_addr1";
	/**
	 * Receiving point address 2 配送先住所2.<p>
	 *
	 */
	public static final String $tdlv_addr2 = "tdlv_addr2";
	/**
	 * Receiving point address 3 配送先住所3.<p>
	 *
	 */
	public static final String $tdlv_addr3 = "tdlv_addr3";
	/**
	 * Receiving point address 4 配送先住所4.<p>
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
	 * Shipping destination distribution G cd. 配送先物流ＧＣＤ.<p>
	 *
	 */
	public static final String $tdlv_lg_grp_cd = "tdlv_lg_grp_cd";
	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public static final String $dlv_day_week_typ = "dlv_day_week_typ";
	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public static final String $sls_cststk_flg = "sls_cststk_flg";
	/**
	 * Procurement type 手配区分.<p>
	 *
	 */
	public static final String $proc_typ = "proc_typ";
	/**
	 * Order type 指図区分.<p>
	 *
	 */
	public static final String $ship_inst_typ = "ship_inst_typ";
	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public static final String $ship_schd_split_typ = "ship_schd_split_typ";
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public static final String $alloc_scope_typ = "alloc_scope_typ";
	/**
	 * Prohibit mixed distribution G 物流Ｇ混在不可.<p>
	 *
	 */
	public static final String $not_lg_mix_flg = "not_lg_mix_flg";
	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public static final String $alloc_typ = "alloc_typ";
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public static final String $rqst_to_loc_cd = "rqst_to_loc_cd";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Request date 依頼日.<p>
	 *
	 */
	public static final String $rqst_dt = "rqst_dt";
	/**
	 * Request desired delivery date 依頼納入希望日.<p>
	 *
	 */
	public static final String $rqst_dlv_rqst_dt = "rqst_dlv_rqst_dt";
	/**
	 * Request qty. 依頼数.<p>
	 *
	 */
	public static final String $rqst_qty = "rqst_qty";
	/**
	 * Request unit cd. 依頼単位ＣＤ.<p>
	 *
	 */
	public static final String $rqst_unit_cd = "rqst_unit_cd";
	/**
	 * Requested contact remarks 依頼先連絡備考.<p>
	 *
	 */
	public static final String $wg_rqst_cnt_rmrks = "wg_rqst_cnt_rmrks";
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $rqst_to_wg_cd = "rqst_to_wg_cd";
	/**
	 * Gross allocation location G cd. 総量引当場所ＧＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Shipping distribution G cd. 出荷物流ＧＣＤ.<p>
	 *
	 */
	public static final String $ship_lg_grp_cd = "ship_lg_grp_cd";
	/**
	 * Normal shipping location cd. 通常出荷場所ＣＤ.<p>
	 *
	 */
	public static final String $def_loc_cd = "def_loc_cd";
	/**
	 * Normal shipping rack/line cd. 通常出荷棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $def_str_ln_cd = "def_str_ln_cd";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
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
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public static final String $str_ln_cd_none_flg = "str_ln_cd_none_flg";
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
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public static final String $not_lot_mix_flg = "not_lot_mix_flg";
	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public static final String $not_sublot_mix_flg = "not_sublot_mix_flg";
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
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public static final String $ship_block_flg = "ship_block_flg";
	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public static final String $ship_cnt_rmrks = "ship_cnt_rmrks";
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_d_no = "cst_po_d_no";
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
	 * Customer order details remarks 得意先注文明細備考.<p>
	 *
	 */
	public static final String $cst_po_d_rmrks = "cst_po_d_rmrks";
	/**
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public static final String $sls_rsn_cd = "sls_rsn_cd";
	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public static final String $sls_acxfr_flg = "sls_acxfr_flg";
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public static final String $sls_upri_req_typ = "sls_upri_req_typ";
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
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
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
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public static final String $can_rsn_cd = "can_rsn_cd";
	/**
	 * Details cancel remarks 明細取消備考.<p>
	 *
	 */
	public static final String $slo_d_can_rmkrs = "slo_d_can_rmkrs";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public static final String $qtn_d_no = "qtn_d_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public static final String $slo_rev = "slo_rev";
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $ship_pr_no = "ship_pr_no";
	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public static final String $slo_dt = "slo_dt";
	/**
	 * Sales item No. 販売品目ＮＯ.<p>
	 *
	 */
	public static final String $sls_itm_no = "sls_itm_no";
	/**
	 * Sales item specification No. 販売品目仕様ＮＯ.<p>
	 *
	 */
	public static final String $sls_itm_spec_no = "sls_itm_spec_no";
	/**
	 * Configuration rev. number 構成改訂番号.<p>
	 *
	 */
	public static final String $itm_comp_rev_no = "itm_comp_rev_no";
	/**
	 * Configuration base unit qty. 構成基準単位数量.<p>
	 *
	 */
	public static final String $comp_base_qty = "comp_base_qty";
	/**
	 * Configuration release 構成リリース.<p>
	 *
	 */
	public static final String $comp_rel_flg = "comp_rel_flg";
	/**
	 * Item undefined 品目未定義.<p>
	 *
	 */
	public static final String $no_itm_cd_flg = "no_itm_cd_flg";
	/**
	 * New configuration 新規構成.<p>
	 *
	 */
	public static final String $new_comp_flg = "new_comp_flg";
	/**
	 * Edit configuration 構成変更.<p>
	 *
	 */
	public static final String $upd_comp_flg = "upd_comp_flg";
	/**
	 * Configuration revision 構成改訂.<p>
	 *
	 */
	public static final String $rev_comp_flg = "rev_comp_flg";
	/**
	 * New specification 新規仕様.<p>
	 *
	 */
	public static final String $new_spec_flg = "new_spec_flg";
	/**
	 * Update specification 仕様更新.<p>
	 *
	 */
	public static final String $upd_spec_flg = "upd_spec_flg";
	/**
	 * Sales item numbered 販売品目発番済み.<p>
	 *
	 */
	public static final String $sls_itm_seq_flg = "sls_itm_seq_flg";
	/**
	 * Specification numbered 仕様発番済み.<p>
	 *
	 */
	public static final String $spec_seq_flg = "spec_seq_flg";
	/**
	 * Pending shipping before change 変更前の出荷留め.<p>
	 *
	 */
	public static final String $org_ship_block_flg = "org_ship_block_flg";
	/**
	 * Specifications available 仕様有り.<p>
	 *
	 */
	public static final String $has_spec_flg = "has_spec_flg";
	/**
	 * Specification remarks 仕様備考.<p>
	 *
	 */
	public static final String $spec_rmrks = "spec_rmrks";
	/**
	 * Specification spare 1 仕様予備１.<p>
	 *
	 */
	public static final String $spec_sub_char1 = "spec_sub_char1";
	/**
	 * Specification spare 2 仕様予備２.<p>
	 *
	 */
	public static final String $spec_sub_char2 = "spec_sub_char2";
	/**
	 * Specification spare 3 仕様予備３.<p>
	 *
	 */
	public static final String $spec_sub_char3 = "spec_sub_char3";
	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public static final String $itm_ship_grp_cd = "itm_ship_grp_cd";
	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public static final String $ship_pr_upd_cntr = "ship_pr_upd_cntr";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Expiration date (Lower limit) 有効期限（下限）.<p>
	 *
	 */
	public static final String $valid_dt_fr = "valid_dt_fr";
	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public static final String $valid_dt_fr_grp = "valid_dt_fr_grp";
	/**
	 * Expiration date (Upper limit) 有効期限（上限）.<p>
	 *
	 */
	public static final String $valid_dt_to = "valid_dt_to";
	/**
	 * Not auto-calculate 自動計算しない.<p>
	 *
	 */
	public static final String $not_dt_calc_flg = "not_dt_calc_flg";
	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public static final String $ship_wk_cd = "ship_wk_cd";
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
	 * SKU 荷姿単位.<p>
	 *
	 */
	public static final String $pack_flg = "pack_flg";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	/**
	 * HS cd. ＨＳ ＣＤ.<p>
	 *
	 */
	public static final String $hs_cd = "hs_cd";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Not for update counter check 更新カウンタチェック対象外.<p>
	 *
	 */
	public static final String $upd_cntr_not_chk_flg = "upd_cntr_not_chk_flg";
	/**
	 * EDI details spare CHAR column 1 ＥＤＩ明細予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $edi_sub_d_char1 = "edi_sub_d_char1";
	/**
	 * EDI details spare CHAR column 2 ＥＤＩ明細予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $edi_sub_d_char2 = "edi_sub_d_char2";
	/**
	 * EDI details spare CHAR column 3 ＥＤＩ明細予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $edi_sub_d_char3 = "edi_sub_d_char3";
	/**
	 * EDI details spare CHAR column 4 ＥＤＩ明細予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $edi_sub_d_char4 = "edi_sub_d_char4";
	/**
	 * EDI details spare CHAR column 5 ＥＤＩ明細予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $edi_sub_d_char5 = "edi_sub_d_char5";
	/**
	 * EDI details spare NUM column 1 ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public static final String $edi_sub_d_num1 = "edi_sub_d_num1";
	/**
	 * EDI details spare DATE column 1 ＥＤＩ明細予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public static final String $edi_sub_d_dt1 = "edi_sub_d_dt1";
	/**
	 * Cancelled remaining qty. 残数打切数量.<p>
	 *
	 */
	public static final String $rem_abort_qty = "rem_abort_qty";
	/**
	 * Cancel remaining qty. 残数打切.<p>
	 *
	 */
	public static final String $rem_abort_flg = "rem_abort_flg";
	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public static final String $data_lno = "data_lno";
	/**
	 * Receiving date 受信日.<p>
	 *
	 */
	public static final String $recv_dt = "recv_dt";
	/**
	 * Delivery destination dept. (Master) 納品先部署（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_cntct_dpt = "mst_dlv_cntct_dpt";
	/**
	 * Delivery destination PIC (Master) 納品先担当者（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_cntct_psn = "mst_dlv_cntct_psn";
	/**
	 * Delivery destination postal code (Master) 納品先郵便番号（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_zip_cd = "mst_dlv_zip_cd";
	/**
	 * Delivery destination address 1 (Master) 納品先住所１（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_addr1 = "mst_dlv_addr1";
	/**
	 * Delivery address 2 (Master) 納品先住所２（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_addr2 = "mst_dlv_addr2";
	/**
	 * Delivery address 3 (Master) 納品先住所３（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_addr3 = "mst_dlv_addr3";
	/**
	 * Delivery address 4 (Master) 納品先住所４（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_addr4 = "mst_dlv_addr4";
	/**
	 * Delivery destination TEL (Master) 納品先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_tel = "mst_dlv_tel";
	/**
	 * Delivery destination FAX (Master) 納品先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_fax = "mst_dlv_fax";
	/**
	 * Delivery destination distribution group cd. (Master) 納品先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_lg_grp_cd = "mst_dlv_lg_grp_cd";
	/**
	 * Destination dept. (master) 配送先部署（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_cntct_dpt = "mst_tdlv_cntct_dpt";
	/**
	 * Delivery person in charge (master) 配送先担当者（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_cntct_psn = "mst_tdlv_cntct_psn";
	/**
	 * Delivery destination postal code (master) 配送先郵便番号（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_zip_cd = "mst_tdlv_zip_cd";
	/**
	 * Shipping address 1 (master) 配送先住所１（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_addr1 = "mst_tdlv_addr1";
	/**
	 * Shipping address 2 (master) 配送先住所２（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_addr2 = "mst_tdlv_addr2";
	/**
	 * Shipping address 3 (master) 配送先住所３（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_addr3 = "mst_tdlv_addr3";
	/**
	 * Shipping address 4 (master) 配送先住所４（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_addr4 = "mst_tdlv_addr4";
	/**
	 * Delivery destination TEL (master) 配送先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_tel = "mst_tdlv_tel";
	/**
	 * Delivery destination fax (master) 配送先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_fax = "mst_tdlv_fax";
	/**
	 * Delivery destination distribution group cd. (master) 配送先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_lg_grp_cd = "mst_tdlv_lg_grp_cd";


	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta comp_spec_typ_META = createCommonMeta($comp_spec_typ, mcframe.commonMA.meta.MA_META.COMP_SPEC_TYP);
	public static final MCMeta alloc_margin_days_META = createCommonMeta($alloc_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta cntry_org_cd_META = createCommonMeta($cntry_org_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta vmi_flg_META = createCommonMeta($vmi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upri_not_tgt_flg_META = createCommonMeta($upri_not_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cost_upri_META = createCommonMeta($cost_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dscnt_rsn_cd_META = createCommonMeta($dscnt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta iv_upri_META = createCommonMeta($iv_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta iv_amt_META = createCommonMeta($iv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_fix_flg_META = createCommonMeta($tax_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta wtax_amt_META = createCommonMeta($wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta sno_num_flg_META = createCommonMeta($sno_num_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno1_num_typ_META = createCommonMeta($sno1_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno2_num_typ_META = createCommonMeta($sno2_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno3_num_typ_META = createCommonMeta($sno3_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno4_num_typ_META = createCommonMeta($sno4_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno1_ptn_cd_META = createCommonMeta($sno1_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sno2_ptn_cd_META = createCommonMeta($sno2_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sno3_ptn_cd_META = createCommonMeta($sno3_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sno4_ptn_cd_META = createCommonMeta($sno4_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta slo_sno1_flg_META = createCommonMeta($slo_sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_sno2_flg_META = createCommonMeta($slo_sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_sno3_flg_META = createCommonMeta($slo_sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_sno4_flg_META = createCommonMeta($slo_sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta set_itm_grp_no_META = createCommonMeta($set_itm_grp_no, mcframe.commonMA.meta.MA_META.SET_ITM_GRP_NO);
	public static final MCMeta ship_rqst_tm_META = createCommonMeta($ship_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_rqst_tm_META = createCommonMeta($dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta sls_schd_dt_META = createCommonMeta($sls_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta accpt_schd_dt_META = createCommonMeta($accpt_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_schd_tm_META = createCommonMeta($ship_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_schd_tm_META = createCommonMeta($dlv_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_cntct_dpt_META = createCommonMeta($dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta dlv_cntct_psn_META = createCommonMeta($dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta dlv_zip_cd_META = createCommonMeta($dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta dlv_addr1_META = createCommonMeta($dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr2_META = createCommonMeta($dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr3_META = createCommonMeta($dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr4_META = createCommonMeta($dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_tel_META = createCommonMeta($dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_fax_META = createCommonMeta($dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_lg_grp_cd_META = createCommonMeta($dlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dlv_cntry_cd_META = createCommonMeta($dlv_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta pri_prnt_flg_META = createCommonMeta($pri_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_req_flg_META = createCommonMeta($tdlv_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tdlv_sundry_flg_META = createCommonMeta($tdlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta tdlv_cntct_dpt_META = createCommonMeta($tdlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta tdlv_cntct_psn_META = createCommonMeta($tdlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta tdlv_zip_cd_META = createCommonMeta($tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta tdlv_addr1_META = createCommonMeta($tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr2_META = createCommonMeta($tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr3_META = createCommonMeta($tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr4_META = createCommonMeta($tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_tel_META = createCommonMeta($tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_fax_META = createCommonMeta($tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_lg_grp_cd_META = createCommonMeta($tdlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dlv_day_week_typ_META = createCommonMeta($dlv_day_week_typ, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP);
	public static final MCMeta sls_cststk_flg_META = createCommonMeta($sls_cststk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta proc_typ_META = createCommonMeta($proc_typ, mcframe.commonMA.meta.MA_META.SLO_PROC_TYP);
	public static final MCMeta ship_inst_typ_META = createCommonMeta($ship_inst_typ, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP);
	public static final MCMeta ship_schd_split_typ_META = createCommonMeta($ship_schd_split_typ, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP);
	public static final MCMeta alloc_scope_typ_META = createCommonMeta($alloc_scope_typ, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP);
	public static final MCMeta not_lg_mix_flg_META = createCommonMeta($not_lg_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_typ_META = createCommonMeta($alloc_typ, mcframe.commonMA.meta.MA_META.ALLOC_TYP);
	public static final MCMeta rqst_to_loc_cd_META = createCommonMeta($rqst_to_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rqst_dt_META = createCommonMeta($rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_dlv_rqst_dt_META = createCommonMeta($rqst_dlv_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_qty_META = createCommonMeta($rqst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rqst_unit_cd_META = createCommonMeta($rqst_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta wg_rqst_cnt_rmrks_META = createCommonMeta($wg_rqst_cnt_rmrks, mcframe.commonMS.meta.MS_META.WG_RQST_CNT_RMRKS);
	public static final MCMeta rqst_to_wg_cd_META = createCommonMeta($rqst_to_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta ship_lg_grp_cd_META = createCommonMeta($ship_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta def_loc_cd_META = createCommonMeta($def_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta def_str_ln_cd_META = createCommonMeta($def_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta str_ln_tgt_flg_META = createCommonMeta($str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_cd_none_flg_META = createCommonMeta($str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta not_lot_mix_flg_META = createCommonMeta($not_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sublot_mix_flg_META = createCommonMeta($not_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ship_block_flg_META = createCommonMeta($ship_block_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_cnt_rmrks_META = createCommonMeta($ship_cnt_rmrks, mcframe.commonMS.meta.MS_META.SHIP_CNT_RMRKS);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta cst_po_d_rmrks_META = createCommonMeta($cst_po_d_rmrks, mcframe.commonMS.meta.MS_META.CST_PO_D_RMRKS);
	public static final MCMeta sls_rsn_cd_META = createCommonMeta($sls_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta sls_acxfr_flg_META = createCommonMeta($sls_acxfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_upri_req_typ_META = createCommonMeta($sls_upri_req_typ, mcframe.commonMA.meta.MA_META.SLS_UPRI_REQ_TYP);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SLO_D_INTR_RMRKS);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SLO_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SLO_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SLO_D_SUB_CHAR3);
	public static final MCMeta can_rsn_cd_META = createCommonMeta($can_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta slo_d_can_rmkrs_META = createCommonMeta($slo_d_can_rmkrs, mcframe.commonMS.meta.MS_META.SLO_D_CAN_RMKRS);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qtn_d_no_META = createCommonMeta($qtn_d_no, mcframe.commonMA.meta.MA_META.QTN_D_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_rev_META = createCommonMeta($slo_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta ship_pr_no_META = createCommonMeta($ship_pr_no, mcframe.commonMA.meta.MA_META.SHIP_PR_NO);
	public static final MCMeta slo_dt_META = createCommonMeta($slo_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_itm_no_META = createCommonMeta($sls_itm_no, mcframe.commonMA.meta.MA_META.SLS_ITM_NO);
	public static final MCMeta sls_itm_spec_no_META = createCommonMeta($sls_itm_spec_no, mcframe.commonMA.meta.MA_META.SLS_ITM_SPEC_NO);
	public static final MCMeta itm_comp_rev_no_META = createCommonMeta($itm_comp_rev_no, mcframe.commonMA.meta.MA_META.ITM_COMP_REV_NO);
	public static final MCMeta comp_base_qty_META = createCommonMeta($comp_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta comp_rel_flg_META = createCommonMeta($comp_rel_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_itm_cd_flg_META = createCommonMeta($no_itm_cd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta new_comp_flg_META = createCommonMeta($new_comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upd_comp_flg_META = createCommonMeta($upd_comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rev_comp_flg_META = createCommonMeta($rev_comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta new_spec_flg_META = createCommonMeta($new_spec_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upd_spec_flg_META = createCommonMeta($upd_spec_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_itm_seq_flg_META = createCommonMeta($sls_itm_seq_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta spec_seq_flg_META = createCommonMeta($spec_seq_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta org_ship_block_flg_META = createCommonMeta($org_ship_block_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta has_spec_flg_META = createCommonMeta($has_spec_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta spec_rmrks_META = createCommonMeta($spec_rmrks, mcframe.commonMS.meta.MS_META.SPEC_RMRKS);
	public static final MCMeta spec_sub_char1_META = createCommonMeta($spec_sub_char1, mcframe.commonMS.meta.MS_META.SLS_ITM_SPEC_SUB_CHAR1);
	public static final MCMeta spec_sub_char2_META = createCommonMeta($spec_sub_char2, mcframe.commonMS.meta.MS_META.SLS_ITM_SPEC_SUB_CHAR2);
	public static final MCMeta spec_sub_char3_META = createCommonMeta($spec_sub_char3, mcframe.commonMS.meta.MS_META.SLS_ITM_SPEC_SUB_CHAR3);
	public static final MCMeta itm_ship_grp_cd_META = createCommonMeta($itm_ship_grp_cd, mcframe.commonMA.meta.MA_META.ITM_SHIP_GRP_CD);
	public static final MCMeta ship_pr_upd_cntr_META = createCommonMeta($ship_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta valid_dt_fr_META = createCommonMeta($valid_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta valid_dt_fr_grp_META = createCommonMeta($valid_dt_fr_grp, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta valid_dt_to_META = createCommonMeta($valid_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta not_dt_calc_flg_META = createCommonMeta($not_dt_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_wk_cd_META = createCommonMeta($ship_wk_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_CD);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta pack_flg_META = createCommonMeta($pack_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta hs_cd_META = createCommonMeta($hs_cd, mcframe.commonMA.meta.MA_META.HS_CD);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta upd_cntr_not_chk_flg_META = createCommonMeta($upd_cntr_not_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta edi_sub_d_char1_META = createCommonMeta($edi_sub_d_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta edi_sub_d_char2_META = createCommonMeta($edi_sub_d_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta edi_sub_d_char3_META = createCommonMeta($edi_sub_d_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta edi_sub_d_char4_META = createCommonMeta($edi_sub_d_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta edi_sub_d_char5_META = createCommonMeta($edi_sub_d_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta edi_sub_d_num1_META = createCommonMeta($edi_sub_d_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta edi_sub_d_dt1_META = createCommonMeta($edi_sub_d_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rem_abort_qty_META = createCommonMeta($rem_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rem_abort_flg_META = createCommonMeta($rem_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta recv_dt_META = createCommonMeta($recv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mst_dlv_cntct_dpt_META = createCommonMeta($mst_dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta mst_dlv_cntct_psn_META = createCommonMeta($mst_dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta mst_dlv_zip_cd_META = createCommonMeta($mst_dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta mst_dlv_addr1_META = createCommonMeta($mst_dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_dlv_addr2_META = createCommonMeta($mst_dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_dlv_addr3_META = createCommonMeta($mst_dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_dlv_addr4_META = createCommonMeta($mst_dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_dlv_tel_META = createCommonMeta($mst_dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta mst_dlv_fax_META = createCommonMeta($mst_dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta mst_dlv_lg_grp_cd_META = createCommonMeta($mst_dlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta mst_tdlv_cntct_dpt_META = createCommonMeta($mst_tdlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta mst_tdlv_cntct_psn_META = createCommonMeta($mst_tdlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta mst_tdlv_zip_cd_META = createCommonMeta($mst_tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta mst_tdlv_addr1_META = createCommonMeta($mst_tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_tdlv_addr2_META = createCommonMeta($mst_tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_tdlv_addr3_META = createCommonMeta($mst_tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_tdlv_addr4_META = createCommonMeta($mst_tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_tdlv_tel_META = createCommonMeta($mst_tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta mst_tdlv_fax_META = createCommonMeta($mst_tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta mst_tdlv_lg_grp_cd_META = createCommonMeta($mst_tdlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);

	protected static final ConstMetaList<Slo_Upd01_DtlR> constMetas = new ConstMetaList<Slo_Upd01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			abort_flg_META,
			disp_seq_META,
			slo_d_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			sundry_itm_flg_META,
			dscnt_itm_flg_META,
			comp_spec_typ_META,
			alloc_margin_days_META,
			iv_itm_nm_META,
			stk_mng_typ_META,
			cntry_org_cd_META,
			vmi_flg_META,
			trd_unit_cd_META,
			trd_unit_qty_META,
			trd_cur_upri_META,
			interim_flg_META,
			upri_not_tgt_flg_META,
			cost_upri_META,
			trd_cur_amt_META,
			trd_cur_dscnt_amt_META,
			dscnt_rsn_cd_META,
			iv_upri_META,
			iv_amt_META,
			tax_fix_flg_META,
			tax_cd_META,
			tax_rate_META,
			inc_tax_flg_META,
			trd_cur_tax_amt_META,
			wtax_rate_META,
			wtax_amt_META,
			bill_crryovr_times_META,
			gd_cd_META,
			sno_num_flg_META,
			sno1_META,
			sno1_null_flg_META,
			sno2_META,
			sno2_null_flg_META,
			sno3_META,
			sno3_null_flg_META,
			sno4_META,
			sno4_null_flg_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			sno1_num_typ_META,
			sno2_num_typ_META,
			sno3_num_typ_META,
			sno4_num_typ_META,
			sno1_ptn_cd_META,
			sno2_ptn_cd_META,
			sno3_ptn_cd_META,
			sno4_ptn_cd_META,
			slo_sno1_flg_META,
			slo_sno2_flg_META,
			slo_sno3_flg_META,
			slo_sno4_flg_META,
			set_itm_grp_no_META,
			ship_rqst_tm_META,
			dlv_rqst_tm_META,
			sls_schd_dt_META,
			accpt_schd_dt_META,
			ship_schd_tm_META,
			dlv_schd_tm_META,
			dlv_cd_META,
			dlv_sundry_flg_META,
			dlv_nm_META,
			dlv_cntct_dpt_META,
			dlv_cntct_psn_META,
			dlv_zip_cd_META,
			dlv_addr1_META,
			dlv_addr2_META,
			dlv_addr3_META,
			dlv_addr4_META,
			dlv_tel_META,
			dlv_fax_META,
			dlv_lg_grp_cd_META,
			dlv_cntry_cd_META,
			pri_prnt_flg_META,
			tdlv_req_flg_META,
			dest_cd1_META,
			dest_cd2_META,
			dest_cd3_META,
			tdlv_cd_META,
			tdlv_sundry_flg_META,
			tdlv_nm_META,
			via_dlv_typ_META,
			tdlv_cntct_dpt_META,
			tdlv_cntct_psn_META,
			tdlv_zip_cd_META,
			tdlv_addr1_META,
			tdlv_addr2_META,
			tdlv_addr3_META,
			tdlv_addr4_META,
			tdlv_tel_META,
			tdlv_fax_META,
			tdlv_lg_grp_cd_META,
			dlv_day_week_typ_META,
			sls_cststk_flg_META,
			proc_typ_META,
			ship_inst_typ_META,
			ship_schd_split_typ_META,
			alloc_scope_typ_META,
			not_lg_mix_flg_META,
			alloc_typ_META,
			rqst_to_loc_cd_META,
			sppl_cd_META,
			maker_cd_META,
			rqst_dt_META,
			rqst_dlv_rqst_dt_META,
			rqst_qty_META,
			rqst_unit_cd_META,
			wg_rqst_cnt_rmrks_META,
			rqst_to_wg_cd_META,
			alloc_grp_cd_META,
			ship_lg_grp_cd_META,
			def_loc_cd_META,
			def_str_ln_cd_META,
			loc_cd_META,
			str_ln_tgt_flg_META,
			str_ln_cd_META,
			str_ln_cd_none_flg_META,
			lot_no_META,
			sublot_no_META,
			not_lot_mix_flg_META,
			not_sublot_mix_flg_META,
			ver_flg_META,
			ver_no_META,
			ship_term_cd_META,
			ship_block_flg_META,
			ship_cnt_rmrks_META,
			cst_po_d_no_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			cst_po_d_rmrks_META,
			sls_rsn_cd_META,
			sls_acxfr_flg_META,
			bd_dpt_cd_META,
			sls_upri_req_typ_META,
			trd_d_rmrks_META,
			intr_rmrks_META,
			io_schd_pr_no_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			can_rsn_cd_META,
			slo_d_can_rmkrs_META,
			base_unit_cd_META,
			base_unit_qty_META,
			qtn_d_no_META,
			slo_no_META,
			slo_rev_META,
			ship_pr_no_META,
			slo_dt_META,
			sls_itm_no_META,
			sls_itm_spec_no_META,
			itm_comp_rev_no_META,
			comp_base_qty_META,
			comp_rel_flg_META,
			no_itm_cd_flg_META,
			new_comp_flg_META,
			upd_comp_flg_META,
			rev_comp_flg_META,
			new_spec_flg_META,
			upd_spec_flg_META,
			sls_itm_seq_flg_META,
			spec_seq_flg_META,
			org_ship_block_flg_META,
			has_spec_flg_META,
			spec_rmrks_META,
			spec_sub_char1_META,
			spec_sub_char2_META,
			spec_sub_char3_META,
			itm_ship_grp_cd_META,
			ship_pr_upd_cntr_META,
			err_flg_META,
			valid_dt_fr_META,
			valid_dt_fr_grp_META,
			valid_dt_to_META,
			not_dt_calc_flg_META,
			ship_wk_cd_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			pack_flg_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			hs_cd_META,
			peg_no_META,
			hdr_peg_no_META,
			upd_cntr_not_chk_flg_META,
			edi_sub_d_char1_META,
			edi_sub_d_char2_META,
			edi_sub_d_char3_META,
			edi_sub_d_char4_META,
			edi_sub_d_char5_META,
			edi_sub_d_num1_META,
			edi_sub_d_dt1_META,
			rem_abort_qty_META,
			rem_abort_flg_META,
			data_lno_META,
			recv_dt_META,
			mst_dlv_cntct_dpt_META,
			mst_dlv_cntct_psn_META,
			mst_dlv_zip_cd_META,
			mst_dlv_addr1_META,
			mst_dlv_addr2_META,
			mst_dlv_addr3_META,
			mst_dlv_addr4_META,
			mst_dlv_tel_META,
			mst_dlv_fax_META,
			mst_dlv_lg_grp_cd_META,
			mst_tdlv_cntct_dpt_META,
			mst_tdlv_cntct_psn_META,
			mst_tdlv_zip_cd_META,
			mst_tdlv_addr1_META,
			mst_tdlv_addr2_META,
			mst_tdlv_addr3_META,
			mst_tdlv_addr4_META,
			mst_tdlv_tel_META,
			mst_tdlv_fax_META,
			mst_tdlv_lg_grp_cd_META
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
				{$itm_cd, "E"},	// itm_cd
				{$trd_unit_cd, "E"},	// trd_unit_cd
				{$trd_unit_qty, "E"},	// trd_unit_qty
				{$dlv_cd, "E"},	// dlv_cd
				{$ship_inst_typ, "E"}	// ship_inst_typ
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$trd_unit_qty, "positive"}	// trd_unit_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$trd_cur_upri, "0:"},	// trd_cur_upri
				{$cost_upri, "0:"},	// cost_upri
				{$trd_cur_dscnt_amt, "0:"},	// trd_cur_dscnt_amt
				{$iv_upri, "0:"},	// iv_upri
				{$wtax_rate, "0:"},	// wtax_rate
				{$bill_crryovr_times, "0:"}	// bill_crryovr_times
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$ship_schd_tm, "ship_schd_hm:BF"},	// ship_schd_tm
				{$dlv_schd_tm, "ship_schd_hm:AF"}	// dlv_schd_tm
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
				{$dlv_zip_cd, "ZIP"},	// dlv_zip_cd
				{$dlv_tel, "TEL"},	// dlv_tel
				{$dlv_fax, "TEL"},	// dlv_fax
				{$tdlv_zip_cd, "ZIP"},	// tdlv_zip_cd
				{$tdlv_tel, "TEL"},	// tdlv_tel
				{$tdlv_fax, "TEL"}	// tdlv_fax
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
				{$rqst_to_loc_cd, "sppl_cd"}	// rqst_to_loc_cd
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
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$cntry_org_cd, "MA.MAUAL0010.Cntry"},	// cntry_org_cd
				{$trd_unit_cd, "MA.MAUAL0010.ItmUnit"},	// trd_unit_cd
				{$dscnt_rsn_cd, "MA.MAUAL0010.SlsDscntBizRsn"},	// dscnt_rsn_cd
				{$tax_cd, "MA.MAUAL0010.SlsTax"},	// tax_cd
				{$gd_cd, "MA.MAUAL0010.SloStkGd"},	// gd_cd
				{$dlv_cd, "MA.MAUAL0010.Bp"},	// dlv_cd
				{$dlv_lg_grp_cd, "MA.MAUAL0010.LgGrp"},	// dlv_lg_grp_cd
				{$dest_cd1, "MA.MAUAL0010.Bp"},	// dest_cd1
				{$dest_cd2, "MA.MAUAL0010.Bp"},	// dest_cd2
				{$dest_cd3, "MA.MAUAL0010.Bp"},	// dest_cd3
				{$tdlv_cd, "MA.MAUAL0010.Bp"},	// tdlv_cd
				{$tdlv_lg_grp_cd, "MA.MAUAL0010.LgGrp"},	// tdlv_lg_grp_cd
				{$rqst_to_loc_cd, "MA.MAUAL0010.Loc"},	// rqst_to_loc_cd
				{$sppl_cd, "MA.MAUAL0010.Bp"},	// sppl_cd
				{$maker_cd, "MA.MAUAL0010.Bp"},	// maker_cd
				{$alloc_grp_cd, "MA.MAUAL0010.AllocGrp"},	// alloc_grp_cd
				{$ship_lg_grp_cd, "MA.MAUAL0010.LgGrp"},	// ship_lg_grp_cd
				{$def_loc_cd, "MA.MAUAL0010.Loc"},	// def_loc_cd
				{$def_str_ln_cd, "MA.MAUAL0010.Loc"},	// def_str_ln_cd
				{$loc_cd, "MA.MAUAL0010.Loc"},	// loc_cd
				{$str_ln_cd, "MA.MAUAL0010.StrLn"},	// str_ln_cd
				{$ship_term_cd, "MA.MAUAL0010.ShipTerm"},	// ship_term_cd
				{$sls_rsn_cd, "MA.MAUAL0010.SlsBizRsn"},	// sls_rsn_cd
				{$bd_dpt_cd, "MA.MAUAL0010.Dpt"},	// bd_dpt_cd
				{$can_rsn_cd, "MS.MSUAL0030.SloCanRsn"}	// can_rsn_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$itm_sub3, "sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;sno1_num_typ;sno2_num_typ;sno3_num_typ;sno4_num_typ;slo_sno1_flg;slo_sno2_flg;slo_sno3_flg;slo_sno4_flg;sno1_ptn_cd;sno2_ptn_cd;sno3_ptn_cd;sno4_ptn_cd;itm_sub1;itm_sub2;itm_sub3;sundry_itm_flg;comp_spec_typ;stk_mng_typ;itm_ship_grp_cd;dscnt_itm_flg;alloc_margin_days;base_unit_cd;ver_flg;base_unit_dec_place;base_unit_rnd_typ;hs_cd"},	// itm_sub3
				{$trd_unit_cd, "trd_unit_conv_base_qty;trd_unit_conv_qty;trd_unit_dec_place;trd_unit_rnd_typ;pack_flg"},	// trd_unit_cd
				{$tax_cd, "tax_rate;tax_typ;inc_tax_flg"},	// tax_cd
				{$dlv_cd, "dlv_sundry_flg;dlv_cntry_cd;tdlv_req_flg;mst_dlv_zip_cd;mst_dlv_addr1;mst_dlv_addr2;mst_dlv_addr3;mst_dlv_addr4;mst_dlv_tel;mst_dlv_fax;mst_dlv_cntct_dpt;mst_dlv_cntct_psn;mst_dlv_lg_grp_cd"},	// dlv_cd
				{$tdlv_cd, "tdlv_sundry_flg;mst_tdlv_lg_grp_cd;mst_tdlv_zip_cd;mst_tdlv_addr1;mst_tdlv_addr2;mst_tdlv_addr3;mst_tdlv_addr4;mst_tdlv_tel;mst_tdlv_fax;mst_tdlv_cntct_dpt;mst_tdlv_cntct_psn;"},	// tdlv_cd
				{$loc_cd, "str_ln_tgt_flg"},	// loc_cd
				{$sls_rsn_cd, "sls_acxfr_flg"}	// sls_rsn_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;sno1_num_typ;sno2_num_typ;sno3_num_typ;sno4_num_typ;slo_sno1_flg;slo_sno2_flg;slo_sno3_flg;slo_sno4_flg;sno1_ptn_cd;sno2_ptn_cd;sno3_ptn_cd;sno4_ptn_cd;itm_sub1;itm_sub2;itm_sub3;sundry_itm_flg;comp_spec_typ;stk_mng_typ;itm_ship_grp_cd;dscnt_itm_flg;alloc_margin_days;unit_cd;ver_flg;dec_place;rnd_typ;hs_cd"},	// itm_sub3
				{$trd_unit_cd, "conv_base_qty;conv_qty;dec_place;rnd_typ;pack_flg"},	// trd_unit_cd
				{$dlv_cd, "dlv_sundry_flg;cntry_cd;tdlv_req_flg;zip_cd;addr1;addr2;addr3;addr4;tel;fax;dlv_cntct_dpt;dlv_cntct_psn;lg_grp_cd"},	// dlv_cd
				{$tdlv_cd, "dlv_sundry_flg;lg_grp_cd;zip_cd;addr1;addr2;addr3;addr4;tel;fax;dlv_cntct_dpt;dlv_cntct_psn;"}	// tdlv_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_sub3, "MAC_ITM_IS_SRCH_TYP.COMM;itm_cd;itm_sub1;itm_sub2"},	// itm_sub3
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$dlv_cd, "MAC_BP_IS_SRCH_TYP.DLV;slo_dt"},	// dlv_cd
				{$dest_cd1, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd1
				{$dest_cd2, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd2
				{$dest_cd3, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd3
				{$tdlv_cd, "MAC_BP_IS_SRCH_TYP.TDLV;slo_dt"},	// tdlv_cd
				{$rqst_to_loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM"},	// rqst_to_loc_cd
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// sppl_cd
				{$maker_cd, "MAC_BP_IS_SRCH_TYP.MAKER;true"},	// maker_cd
				{$def_loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM"},	// def_loc_cd
				{$def_str_ln_cd, "MAC_LOC_IS_SRCH_TYP.COMM"},	// def_str_ln_cd
				{$loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM"},	// loc_cd
				{$str_ln_cd, "loc_cd;true"},	// str_ln_cd
				{$bd_dpt_cd, "MAC_DPT_IS_SRCH_TYP.BD;slo_dt"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_sub3
				{$dlv_cd, "bp_is_srch_typ;dt"},	// dlv_cd
				{$dest_cd1, "bp_is_srch_typ"},	// dest_cd1
				{$dest_cd2, "bp_is_srch_typ"},	// dest_cd2
				{$dest_cd3, "bp_is_srch_typ"},	// dest_cd3
				{$tdlv_cd, "bp_is_srch_typ;dt"},	// tdlv_cd
				{$rqst_to_loc_cd, "loc_is_srch_typ"},	// rqst_to_loc_cd
				{$sppl_cd, "bp_is_srch_typ"},	// sppl_cd
				{$maker_cd, "bp_is_srch_typ;mode_nullval_flg"},	// maker_cd
				{$def_loc_cd, "loc_is_srch_typ"},	// def_loc_cd
				{$def_str_ln_cd, "loc_is_srch_typ"},	// def_str_ln_cd
				{$loc_cd, "loc_is_srch_typ"},	// loc_cd
				{$str_ln_cd, "loc_cd;mode_nullval_flg"},	// str_ln_cd
				{$bd_dpt_cd, "dpt_is_srch_typ;dt"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$via_dlv_typ, "MAC_VIA_DLV_TYP"},	// via_dlv_typ
				{$proc_typ, "MAC_SLO_PROC_TYP"},	// proc_typ
				{$ship_inst_typ, "MAC_SHIP_INST_TYP"},	// ship_inst_typ
				{$ship_schd_split_typ, "MAC_SHIP_SCHD_SPLIT_TYP"},	// ship_schd_split_typ
				{$alloc_scope_typ, "MAC_ALLOC_SCOPE_TYP"},	// alloc_scope_typ
				{$alloc_typ, "MAC_ALLOC_TYP"},	// alloc_typ
				{$sls_upri_req_typ, "MAC_SLS_UPRI_REQ_TYP"}	// sls_upri_req_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"}	// itm_sub3
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
	protected Slo_Upd01_DtlR_MC_A(ConstMetaList<? extends Slo_Upd01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_Upd01_DtlR clone() {
		return (Slo_Upd01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_Upd01_DtlR createInstance() {
		return (Slo_Upd01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_Upd01_DtlR getValues(String... names) {
		return (Slo_Upd01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 0, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 0, $data_crud_typ, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 1, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 1, $abort_flg, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 2, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 2, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 2, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 2, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 2, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 2, $disp_seq, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 3, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 3, $slo_d_no, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 4, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 4, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 5, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 5, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 6, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 6, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 7, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 7, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 8, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 8, $itm_nm, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 9, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 9, $sundry_itm_flg, value);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 10, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 10, $dscnt_itm_flg, value);
	}


	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public String comp_spec_typ() {
		return getConstString(offset + 11, $comp_spec_typ);
	}

	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public void comp_spec_typ(String value) {
		setConstString(offset + 11, $comp_spec_typ, value);
	}


	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public MCNumber alloc_margin_days() {
		return getConstNumber(offset + 12, $alloc_margin_days);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 12, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(int value) {
		setConstNumber(offset + 12, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(long value) {
		setConstNumber(offset + 12, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(float value) {
		setConstNumber(offset + 12, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(double value) {
		setConstNumber(offset + 12, $alloc_margin_days, value);
	}


	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 13, $iv_itm_nm);
	}

	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 13, $iv_itm_nm, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 14, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 14, $stk_mng_typ, value);
	}


	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public String cntry_org_cd() {
		return getConstString(offset + 15, $cntry_org_cd);
	}

	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public void cntry_org_cd(String value) {
		setConstString(offset + 15, $cntry_org_cd, value);
	}


	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public boolean vmi_flg() {
		return getConstBoolean(offset + 16, $vmi_flg);
	}

	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public void vmi_flg(boolean value) {
		setConstBoolean(offset + 16, $vmi_flg, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 17, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 17, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 18, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 18, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 18, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 18, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 18, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 18, $trd_unit_qty, value);
	}


	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 19, $trd_cur_upri);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 19, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 19, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 19, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 19, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 19, $trd_cur_upri, value);
	}


	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 20, $interim_flg);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 20, $interim_flg, value);
	}


	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public boolean upri_not_tgt_flg() {
		return getConstBoolean(offset + 21, $upri_not_tgt_flg);
	}

	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public void upri_not_tgt_flg(boolean value) {
		setConstBoolean(offset + 21, $upri_not_tgt_flg, value);
	}


	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public MCNumber cost_upri() {
		return getConstNumber(offset + 22, $cost_upri);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(MCNumber value) {
		setConstNumber(offset + 22, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(int value) {
		setConstNumber(offset + 22, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(long value) {
		setConstNumber(offset + 22, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(float value) {
		setConstNumber(offset + 22, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(double value) {
		setConstNumber(offset + 22, $cost_upri, value);
	}


	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 23, $trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 23, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 23, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 23, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 23, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 23, $trd_cur_amt, value);
	}


	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 24, $trd_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 24, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 24, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 24, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 24, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 24, $trd_cur_dscnt_amt, value);
	}


	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return getConstString(offset + 25, $dscnt_rsn_cd);
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		setConstString(offset + 25, $dscnt_rsn_cd, value);
	}


	/**
	 * I/V unit price Ｉ／Ｖ単価.<p>
	 *
	 */
	public MCNumber iv_upri() {
		return getConstNumber(offset + 26, $iv_upri);
	}

	/**
	 * I/V unit price Ｉ／Ｖ単価.<p>
	 *
	 */
	public void iv_upri(MCNumber value) {
		setConstNumber(offset + 26, $iv_upri, value);
	}

	/**
	 * I/V unit price Ｉ／Ｖ単価.<p>
	 *
	 */
	public void iv_upri(int value) {
		setConstNumber(offset + 26, $iv_upri, value);
	}

	/**
	 * I/V unit price Ｉ／Ｖ単価.<p>
	 *
	 */
	public void iv_upri(long value) {
		setConstNumber(offset + 26, $iv_upri, value);
	}

	/**
	 * I/V unit price Ｉ／Ｖ単価.<p>
	 *
	 */
	public void iv_upri(float value) {
		setConstNumber(offset + 26, $iv_upri, value);
	}

	/**
	 * I/V unit price Ｉ／Ｖ単価.<p>
	 *
	 */
	public void iv_upri(double value) {
		setConstNumber(offset + 26, $iv_upri, value);
	}


	/**
	 * I/V amount Ｉ／Ｖ金額.<p>
	 *
	 */
	public MCNumber iv_amt() {
		return getConstNumber(offset + 27, $iv_amt);
	}

	/**
	 * I/V amount Ｉ／Ｖ金額.<p>
	 *
	 */
	public void iv_amt(MCNumber value) {
		setConstNumber(offset + 27, $iv_amt, value);
	}

	/**
	 * I/V amount Ｉ／Ｖ金額.<p>
	 *
	 */
	public void iv_amt(int value) {
		setConstNumber(offset + 27, $iv_amt, value);
	}

	/**
	 * I/V amount Ｉ／Ｖ金額.<p>
	 *
	 */
	public void iv_amt(long value) {
		setConstNumber(offset + 27, $iv_amt, value);
	}

	/**
	 * I/V amount Ｉ／Ｖ金額.<p>
	 *
	 */
	public void iv_amt(float value) {
		setConstNumber(offset + 27, $iv_amt, value);
	}

	/**
	 * I/V amount Ｉ／Ｖ金額.<p>
	 *
	 */
	public void iv_amt(double value) {
		setConstNumber(offset + 27, $iv_amt, value);
	}


	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public boolean tax_fix_flg() {
		return getConstBoolean(offset + 28, $tax_fix_flg);
	}

	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public void tax_fix_flg(boolean value) {
		setConstBoolean(offset + 28, $tax_fix_flg, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 29, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 29, $tax_cd, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 30, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 30, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 30, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 30, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 30, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 30, $tax_rate, value);
	}


	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 31, $inc_tax_flg);
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 31, $inc_tax_flg, value);
	}


	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 32, $trd_cur_tax_amt);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 32, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 32, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 32, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 32, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 32, $trd_cur_tax_amt, value);
	}


	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 33, $wtax_rate);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 33, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 33, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 33, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 33, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 33, $wtax_rate, value);
	}


	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return getConstNumber(offset + 34, $wtax_amt);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		setConstNumber(offset + 34, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		setConstNumber(offset + 34, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		setConstNumber(offset + 34, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		setConstNumber(offset + 34, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		setConstNumber(offset + 34, $wtax_amt, value);
	}


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 35, $bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 35, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 35, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 35, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 35, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 35, $bill_crryovr_times, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 36, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 36, $gd_cd, value);
	}


	/**
	 * Numbering SEIBAN No. 手配ＮＯ発番.<p>
	 *
	 */
	public boolean sno_num_flg() {
		return getConstBoolean(offset + 37, $sno_num_flg);
	}

	/**
	 * Numbering SEIBAN No. 手配ＮＯ発番.<p>
	 *
	 */
	public void sno_num_flg(boolean value) {
		setConstBoolean(offset + 37, $sno_num_flg, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 38, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 38, $sno1, value);
	}


	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 39, $sno1_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 39, $sno1_null_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 40, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 40, $sno2, value);
	}


	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 41, $sno2_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 41, $sno2_null_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 42, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 42, $sno3, value);
	}


	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 43, $sno3_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 43, $sno3_null_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 44, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 44, $sno4, value);
	}


	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 45, $sno4_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 45, $sno4_null_flg, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 46, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 46, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 47, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 47, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 48, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 48, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 49, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 49, $sno4_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public String sno1_num_typ() {
		return getConstString(offset + 50, $sno1_num_typ);
	}

	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public void sno1_num_typ(String value) {
		setConstString(offset + 50, $sno1_num_typ, value);
	}


	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public String sno2_num_typ() {
		return getConstString(offset + 51, $sno2_num_typ);
	}

	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public void sno2_num_typ(String value) {
		setConstString(offset + 51, $sno2_num_typ, value);
	}


	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public String sno3_num_typ() {
		return getConstString(offset + 52, $sno3_num_typ);
	}

	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public void sno3_num_typ(String value) {
		setConstString(offset + 52, $sno3_num_typ, value);
	}


	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public String sno4_num_typ() {
		return getConstString(offset + 53, $sno4_num_typ);
	}

	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public void sno4_num_typ(String value) {
		setConstString(offset + 53, $sno4_num_typ, value);
	}


	/**
	 * SEIBAN No. 1 numbering pattern cd. 手配ＮＯ１発番パタンＣＤ.<p>
	 *
	 */
	public String sno1_ptn_cd() {
		return getConstString(offset + 54, $sno1_ptn_cd);
	}

	/**
	 * SEIBAN No. 1 numbering pattern cd. 手配ＮＯ１発番パタンＣＤ.<p>
	 *
	 */
	public void sno1_ptn_cd(String value) {
		setConstString(offset + 54, $sno1_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 2 numbering pattern cd. 手配ＮＯ２発番パタンＣＤ.<p>
	 *
	 */
	public String sno2_ptn_cd() {
		return getConstString(offset + 55, $sno2_ptn_cd);
	}

	/**
	 * SEIBAN No. 2 numbering pattern cd. 手配ＮＯ２発番パタンＣＤ.<p>
	 *
	 */
	public void sno2_ptn_cd(String value) {
		setConstString(offset + 55, $sno2_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 3 numbering pattern cd. 手配ＮＯ３発番パタンＣＤ.<p>
	 *
	 */
	public String sno3_ptn_cd() {
		return getConstString(offset + 56, $sno3_ptn_cd);
	}

	/**
	 * SEIBAN No. 3 numbering pattern cd. 手配ＮＯ３発番パタンＣＤ.<p>
	 *
	 */
	public void sno3_ptn_cd(String value) {
		setConstString(offset + 56, $sno3_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 4 numbering pattern cd. 手配ＮＯ４発番パタンＣＤ.<p>
	 *
	 */
	public String sno4_ptn_cd() {
		return getConstString(offset + 57, $sno4_ptn_cd);
	}

	/**
	 * SEIBAN No. 4 numbering pattern cd. 手配ＮＯ４発番パタンＣＤ.<p>
	 *
	 */
	public void sno4_ptn_cd(String value) {
		setConstString(offset + 57, $sno4_ptn_cd, value);
	}


	/**
	 * Sales order SEIBAN No. 1 required 受注手配ＮＯ１必須.<p>
	 *
	 */
	public boolean slo_sno1_flg() {
		return getConstBoolean(offset + 58, $slo_sno1_flg);
	}

	/**
	 * Sales order SEIBAN No. 1 required 受注手配ＮＯ１必須.<p>
	 *
	 */
	public void slo_sno1_flg(boolean value) {
		setConstBoolean(offset + 58, $slo_sno1_flg, value);
	}


	/**
	 * Sales order SEIBAN No. 2 required 受注手配ＮＯ２必須.<p>
	 *
	 */
	public boolean slo_sno2_flg() {
		return getConstBoolean(offset + 59, $slo_sno2_flg);
	}

	/**
	 * Sales order SEIBAN No. 2 required 受注手配ＮＯ２必須.<p>
	 *
	 */
	public void slo_sno2_flg(boolean value) {
		setConstBoolean(offset + 59, $slo_sno2_flg, value);
	}


	/**
	 * Sales order SEIBAN No. 3 required 受注手配ＮＯ３必須.<p>
	 *
	 */
	public boolean slo_sno3_flg() {
		return getConstBoolean(offset + 60, $slo_sno3_flg);
	}

	/**
	 * Sales order SEIBAN No. 3 required 受注手配ＮＯ３必須.<p>
	 *
	 */
	public void slo_sno3_flg(boolean value) {
		setConstBoolean(offset + 60, $slo_sno3_flg, value);
	}


	/**
	 * Sales order SEIBAN No. 4 required 受注手配ＮＯ４必須.<p>
	 *
	 */
	public boolean slo_sno4_flg() {
		return getConstBoolean(offset + 61, $slo_sno4_flg);
	}

	/**
	 * Sales order SEIBAN No. 4 required 受注手配ＮＯ４必須.<p>
	 *
	 */
	public void slo_sno4_flg(boolean value) {
		setConstBoolean(offset + 61, $slo_sno4_flg, value);
	}


	/**
	 * Assortment No. 品揃ＮＯ.<p>
	 *
	 */
	public MCNumber set_itm_grp_no() {
		return getConstNumber(offset + 62, $set_itm_grp_no);
	}

	/**
	 * Assortment No. 品揃ＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(MCNumber value) {
		setConstNumber(offset + 62, $set_itm_grp_no, value);
	}

	/**
	 * Assortment No. 品揃ＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(int value) {
		setConstNumber(offset + 62, $set_itm_grp_no, value);
	}

	/**
	 * Assortment No. 品揃ＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(long value) {
		setConstNumber(offset + 62, $set_itm_grp_no, value);
	}

	/**
	 * Assortment No. 品揃ＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(float value) {
		setConstNumber(offset + 62, $set_itm_grp_no, value);
	}

	/**
	 * Assortment No. 品揃ＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(double value) {
		setConstNumber(offset + 62, $set_itm_grp_no, value);
	}


	/**
	 * Desired shipping date and time 出荷希望日時.<p>
	 *
	 */
	public MCDate ship_rqst_tm() {
		return getConstDate(offset + 63, $ship_rqst_tm);
	}

	/**
	 * Desired shipping date and time 出荷希望日時.<p>
	 *
	 */
	public void ship_rqst_tm(MCDate value) {
		setConstDate(offset + 63, $ship_rqst_tm, value);
	}


	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return getConstDate(offset + 64, $dlv_rqst_tm);
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 64, $dlv_rqst_tm, value);
	}


	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public MCDate sls_schd_dt() {
		return getConstDate(offset + 65, $sls_schd_dt);
	}

	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public void sls_schd_dt(MCDate value) {
		setConstDate(offset + 65, $sls_schd_dt, value);
	}


	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCDate accpt_schd_dt() {
		return getConstDate(offset + 66, $accpt_schd_dt);
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public void accpt_schd_dt(MCDate value) {
		setConstDate(offset + 66, $accpt_schd_dt, value);
	}


	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public MCDate ship_schd_tm() {
		return getConstDate(offset + 67, $ship_schd_tm);
	}

	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public void ship_schd_tm(MCDate value) {
		setConstDate(offset + 67, $ship_schd_tm, value);
	}


	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public MCDate dlv_schd_tm() {
		return getConstDate(offset + 68, $dlv_schd_tm);
	}

	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public void dlv_schd_tm(MCDate value) {
		setConstDate(offset + 68, $dlv_schd_tm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 69, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 69, $dlv_cd, value);
	}


	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 70, $dlv_sundry_flg);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 70, $dlv_sundry_flg, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 71, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 71, $dlv_nm, value);
	}


	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return getConstString(offset + 72, $dlv_cntct_dpt);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		setConstString(offset + 72, $dlv_cntct_dpt, value);
	}


	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return getConstString(offset + 73, $dlv_cntct_psn);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		setConstString(offset + 73, $dlv_cntct_psn, value);
	}


	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return getConstString(offset + 74, $dlv_zip_cd);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		setConstString(offset + 74, $dlv_zip_cd, value);
	}


	/**
	 * Address 1 (Delivery destination) 納品先住所1.<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 75, $dlv_addr1);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所1.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 75, $dlv_addr1, value);
	}


	/**
	 * Address 2 (Delivery destination) 納品先住所2.<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 76, $dlv_addr2);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所2.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 76, $dlv_addr2, value);
	}


	/**
	 * Address 3 (Delivery destination) 納品先住所3.<p>
	 *
	 */
	public String dlv_addr3() {
		return getConstString(offset + 77, $dlv_addr3);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所3.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		setConstString(offset + 77, $dlv_addr3, value);
	}


	/**
	 * Address 4 (Delivery destination) 納品先住所4.<p>
	 *
	 */
	public String dlv_addr4() {
		return getConstString(offset + 78, $dlv_addr4);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所4.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		setConstString(offset + 78, $dlv_addr4, value);
	}


	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return getConstString(offset + 79, $dlv_tel);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		setConstString(offset + 79, $dlv_tel, value);
	}


	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return getConstString(offset + 80, $dlv_fax);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		setConstString(offset + 80, $dlv_fax, value);
	}


	/**
	 * Delivery destination distribution G cd. 納品先物流ＧＣＤ.<p>
	 *
	 */
	public String dlv_lg_grp_cd() {
		return getConstString(offset + 81, $dlv_lg_grp_cd);
	}

	/**
	 * Delivery destination distribution G cd. 納品先物流ＧＣＤ.<p>
	 *
	 */
	public void dlv_lg_grp_cd(String value) {
		setConstString(offset + 81, $dlv_lg_grp_cd, value);
	}


	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public String dlv_cntry_cd() {
		return getConstString(offset + 82, $dlv_cntry_cd);
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public void dlv_cntry_cd(String value) {
		setConstString(offset + 82, $dlv_cntry_cd, value);
	}


	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return getConstBoolean(offset + 83, $pri_prnt_flg);
	}

	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		setConstBoolean(offset + 83, $pri_prnt_flg, value);
	}


	/**
	 * Receiving point required 配送先必須.<p>
	 *
	 */
	public boolean tdlv_req_flg() {
		return getConstBoolean(offset + 84, $tdlv_req_flg);
	}

	/**
	 * Receiving point required 配送先必須.<p>
	 *
	 */
	public void tdlv_req_flg(boolean value) {
		setConstBoolean(offset + 84, $tdlv_req_flg, value);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 85, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 85, $dest_cd1, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 86, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 86, $dest_cd2, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 87, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 87, $dest_cd3, value);
	}


	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 88, $tdlv_cd);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 88, $tdlv_cd, value);
	}


	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return getConstBoolean(offset + 89, $tdlv_sundry_flg);
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 89, $tdlv_sundry_flg, value);
	}


	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 90, $tdlv_nm);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 90, $tdlv_nm, value);
	}


	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 91, $via_dlv_typ);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 91, $via_dlv_typ, value);
	}


	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return getConstString(offset + 92, $tdlv_cntct_dpt);
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		setConstString(offset + 92, $tdlv_cntct_dpt, value);
	}


	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return getConstString(offset + 93, $tdlv_cntct_psn);
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		setConstString(offset + 93, $tdlv_cntct_psn, value);
	}


	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return getConstString(offset + 94, $tdlv_zip_cd);
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		setConstString(offset + 94, $tdlv_zip_cd, value);
	}


	/**
	 * Receiving point address 1 配送先住所1.<p>
	 *
	 */
	public String tdlv_addr1() {
		return getConstString(offset + 95, $tdlv_addr1);
	}

	/**
	 * Receiving point address 1 配送先住所1.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		setConstString(offset + 95, $tdlv_addr1, value);
	}


	/**
	 * Receiving point address 2 配送先住所2.<p>
	 *
	 */
	public String tdlv_addr2() {
		return getConstString(offset + 96, $tdlv_addr2);
	}

	/**
	 * Receiving point address 2 配送先住所2.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		setConstString(offset + 96, $tdlv_addr2, value);
	}


	/**
	 * Receiving point address 3 配送先住所3.<p>
	 *
	 */
	public String tdlv_addr3() {
		return getConstString(offset + 97, $tdlv_addr3);
	}

	/**
	 * Receiving point address 3 配送先住所3.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		setConstString(offset + 97, $tdlv_addr3, value);
	}


	/**
	 * Receiving point address 4 配送先住所4.<p>
	 *
	 */
	public String tdlv_addr4() {
		return getConstString(offset + 98, $tdlv_addr4);
	}

	/**
	 * Receiving point address 4 配送先住所4.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		setConstString(offset + 98, $tdlv_addr4, value);
	}


	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return getConstString(offset + 99, $tdlv_tel);
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		setConstString(offset + 99, $tdlv_tel, value);
	}


	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return getConstString(offset + 100, $tdlv_fax);
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		setConstString(offset + 100, $tdlv_fax, value);
	}


	/**
	 * Shipping destination distribution G cd. 配送先物流ＧＣＤ.<p>
	 *
	 */
	public String tdlv_lg_grp_cd() {
		return getConstString(offset + 101, $tdlv_lg_grp_cd);
	}

	/**
	 * Shipping destination distribution G cd. 配送先物流ＧＣＤ.<p>
	 *
	 */
	public void tdlv_lg_grp_cd(String value) {
		setConstString(offset + 101, $tdlv_lg_grp_cd, value);
	}


	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public String dlv_day_week_typ() {
		return getConstString(offset + 102, $dlv_day_week_typ);
	}

	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public void dlv_day_week_typ(String value) {
		setConstString(offset + 102, $dlv_day_week_typ, value);
	}


	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public boolean sls_cststk_flg() {
		return getConstBoolean(offset + 103, $sls_cststk_flg);
	}

	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public void sls_cststk_flg(boolean value) {
		setConstBoolean(offset + 103, $sls_cststk_flg, value);
	}


	/**
	 * Procurement type 手配区分.<p>
	 *
	 */
	public String proc_typ() {
		return getConstString(offset + 104, $proc_typ);
	}

	/**
	 * Procurement type 手配区分.<p>
	 *
	 */
	public void proc_typ(String value) {
		setConstString(offset + 104, $proc_typ, value);
	}


	/**
	 * Order type 指図区分.<p>
	 *
	 */
	public String ship_inst_typ() {
		return getConstString(offset + 105, $ship_inst_typ);
	}

	/**
	 * Order type 指図区分.<p>
	 *
	 */
	public void ship_inst_typ(String value) {
		setConstString(offset + 105, $ship_inst_typ, value);
	}


	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public String ship_schd_split_typ() {
		return getConstString(offset + 106, $ship_schd_split_typ);
	}

	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public void ship_schd_split_typ(String value) {
		setConstString(offset + 106, $ship_schd_split_typ, value);
	}


	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public String alloc_scope_typ() {
		return getConstString(offset + 107, $alloc_scope_typ);
	}

	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public void alloc_scope_typ(String value) {
		setConstString(offset + 107, $alloc_scope_typ, value);
	}


	/**
	 * Prohibit mixed distribution G 物流Ｇ混在不可.<p>
	 *
	 */
	public boolean not_lg_mix_flg() {
		return getConstBoolean(offset + 108, $not_lg_mix_flg);
	}

	/**
	 * Prohibit mixed distribution G 物流Ｇ混在不可.<p>
	 *
	 */
	public void not_lg_mix_flg(boolean value) {
		setConstBoolean(offset + 108, $not_lg_mix_flg, value);
	}


	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public String alloc_typ() {
		return getConstString(offset + 109, $alloc_typ);
	}

	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public void alloc_typ(String value) {
		setConstString(offset + 109, $alloc_typ, value);
	}


	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public String rqst_to_loc_cd() {
		return getConstString(offset + 110, $rqst_to_loc_cd);
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public void rqst_to_loc_cd(String value) {
		setConstString(offset + 110, $rqst_to_loc_cd, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 111, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 111, $sppl_cd, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 112, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 112, $maker_cd, value);
	}


	/**
	 * Request date 依頼日.<p>
	 *
	 */
	public MCDate rqst_dt() {
		return getConstDate(offset + 113, $rqst_dt);
	}

	/**
	 * Request date 依頼日.<p>
	 *
	 */
	public void rqst_dt(MCDate value) {
		setConstDate(offset + 113, $rqst_dt, value);
	}


	/**
	 * Request desired delivery date 依頼納入希望日.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_dt() {
		return getConstDate(offset + 114, $rqst_dlv_rqst_dt);
	}

	/**
	 * Request desired delivery date 依頼納入希望日.<p>
	 *
	 */
	public void rqst_dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 114, $rqst_dlv_rqst_dt, value);
	}


	/**
	 * Request qty. 依頼数.<p>
	 *
	 */
	public MCNumber rqst_qty() {
		return getConstNumber(offset + 115, $rqst_qty);
	}

	/**
	 * Request qty. 依頼数.<p>
	 *
	 */
	public void rqst_qty(MCNumber value) {
		setConstNumber(offset + 115, $rqst_qty, value);
	}

	/**
	 * Request qty. 依頼数.<p>
	 *
	 */
	public void rqst_qty(int value) {
		setConstNumber(offset + 115, $rqst_qty, value);
	}

	/**
	 * Request qty. 依頼数.<p>
	 *
	 */
	public void rqst_qty(long value) {
		setConstNumber(offset + 115, $rqst_qty, value);
	}

	/**
	 * Request qty. 依頼数.<p>
	 *
	 */
	public void rqst_qty(float value) {
		setConstNumber(offset + 115, $rqst_qty, value);
	}

	/**
	 * Request qty. 依頼数.<p>
	 *
	 */
	public void rqst_qty(double value) {
		setConstNumber(offset + 115, $rqst_qty, value);
	}


	/**
	 * Request unit cd. 依頼単位ＣＤ.<p>
	 *
	 */
	public String rqst_unit_cd() {
		return getConstString(offset + 116, $rqst_unit_cd);
	}

	/**
	 * Request unit cd. 依頼単位ＣＤ.<p>
	 *
	 */
	public void rqst_unit_cd(String value) {
		setConstString(offset + 116, $rqst_unit_cd, value);
	}


	/**
	 * Requested contact remarks 依頼先連絡備考.<p>
	 *
	 */
	public String wg_rqst_cnt_rmrks() {
		return getConstString(offset + 117, $wg_rqst_cnt_rmrks);
	}

	/**
	 * Requested contact remarks 依頼先連絡備考.<p>
	 *
	 */
	public void wg_rqst_cnt_rmrks(String value) {
		setConstString(offset + 117, $wg_rqst_cnt_rmrks, value);
	}


	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_to_wg_cd() {
		return getConstString(offset + 118, $rqst_to_wg_cd);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_to_wg_cd(String value) {
		setConstString(offset + 118, $rqst_to_wg_cd, value);
	}


	/**
	 * Gross allocation location G cd. 総量引当場所ＧＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 119, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location G cd. 総量引当場所ＧＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 119, $alloc_grp_cd, value);
	}


	/**
	 * Shipping distribution G cd. 出荷物流ＧＣＤ.<p>
	 *
	 */
	public String ship_lg_grp_cd() {
		return getConstString(offset + 120, $ship_lg_grp_cd);
	}

	/**
	 * Shipping distribution G cd. 出荷物流ＧＣＤ.<p>
	 *
	 */
	public void ship_lg_grp_cd(String value) {
		setConstString(offset + 120, $ship_lg_grp_cd, value);
	}


	/**
	 * Normal shipping location cd. 通常出荷場所ＣＤ.<p>
	 *
	 */
	public String def_loc_cd() {
		return getConstString(offset + 121, $def_loc_cd);
	}

	/**
	 * Normal shipping location cd. 通常出荷場所ＣＤ.<p>
	 *
	 */
	public void def_loc_cd(String value) {
		setConstString(offset + 121, $def_loc_cd, value);
	}


	/**
	 * Normal shipping rack/line cd. 通常出荷棚・ラインＣＤ.<p>
	 *
	 */
	public String def_str_ln_cd() {
		return getConstString(offset + 122, $def_str_ln_cd);
	}

	/**
	 * Normal shipping rack/line cd. 通常出荷棚・ラインＣＤ.<p>
	 *
	 */
	public void def_str_ln_cd(String value) {
		setConstString(offset + 122, $def_str_ln_cd, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 123, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 123, $loc_cd, value);
	}


	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public boolean str_ln_tgt_flg() {
		return getConstBoolean(offset + 124, $str_ln_tgt_flg);
	}

	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public void str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 124, $str_ln_tgt_flg, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 125, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 125, $str_ln_cd, value);
	}


	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 126, $str_ln_cd_none_flg);
	}

	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 126, $str_ln_cd_none_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 127, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 127, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 128, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 128, $sublot_no, value);
	}


	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return getConstBoolean(offset + 129, $not_lot_mix_flg);
	}

	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 129, $not_lot_mix_flg, value);
	}


	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return getConstBoolean(offset + 130, $not_sublot_mix_flg);
	}

	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 130, $not_sublot_mix_flg, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 131, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 131, $ver_flg, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 132, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 132, $ver_no, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 133, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 133, $ship_term_cd, value);
	}


	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public boolean ship_block_flg() {
		return getConstBoolean(offset + 134, $ship_block_flg);
	}

	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public void ship_block_flg(boolean value) {
		setConstBoolean(offset + 134, $ship_block_flg, value);
	}


	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public String ship_cnt_rmrks() {
		return getConstString(offset + 135, $ship_cnt_rmrks);
	}

	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public void ship_cnt_rmrks(String value) {
		setConstString(offset + 135, $ship_cnt_rmrks, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 136, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 136, $cst_po_d_no, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 137, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 137, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 138, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 138, $cst_itm_nm, value);
	}


	/**
	 * Customer order details remarks 得意先注文明細備考.<p>
	 *
	 */
	public String cst_po_d_rmrks() {
		return getConstString(offset + 139, $cst_po_d_rmrks);
	}

	/**
	 * Customer order details remarks 得意先注文明細備考.<p>
	 *
	 */
	public void cst_po_d_rmrks(String value) {
		setConstString(offset + 139, $cst_po_d_rmrks, value);
	}


	/**
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public String sls_rsn_cd() {
		return getConstString(offset + 140, $sls_rsn_cd);
	}

	/**
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public void sls_rsn_cd(String value) {
		setConstString(offset + 140, $sls_rsn_cd, value);
	}


	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public boolean sls_acxfr_flg() {
		return getConstBoolean(offset + 141, $sls_acxfr_flg);
	}

	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public void sls_acxfr_flg(boolean value) {
		setConstBoolean(offset + 141, $sls_acxfr_flg, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 142, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 142, $bd_dpt_cd, value);
	}


	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public String sls_upri_req_typ() {
		return getConstString(offset + 143, $sls_upri_req_typ);
	}

	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public void sls_upri_req_typ(String value) {
		setConstString(offset + 143, $sls_upri_req_typ, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 144, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 144, $trd_d_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 145, $intr_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 145, $intr_rmrks, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 146, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 146, $io_schd_pr_no, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 147, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 147, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 148, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 148, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 149, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 149, $sub_char3, value);
	}


	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public String can_rsn_cd() {
		return getConstString(offset + 150, $can_rsn_cd);
	}

	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public void can_rsn_cd(String value) {
		setConstString(offset + 150, $can_rsn_cd, value);
	}


	/**
	 * Details cancel remarks 明細取消備考.<p>
	 *
	 */
	public String slo_d_can_rmkrs() {
		return getConstString(offset + 151, $slo_d_can_rmkrs);
	}

	/**
	 * Details cancel remarks 明細取消備考.<p>
	 *
	 */
	public void slo_d_can_rmkrs(String value) {
		setConstString(offset + 151, $slo_d_can_rmkrs, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 152, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 152, $base_unit_cd, value);
	}


	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 153, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 153, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 153, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 153, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 153, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 153, $base_unit_qty, value);
	}


	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public String qtn_d_no() {
		return getConstString(offset + 154, $qtn_d_no);
	}

	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public void qtn_d_no(String value) {
		setConstString(offset + 154, $qtn_d_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 155, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 155, $slo_no, value);
	}


	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public MCNumber slo_rev() {
		return getConstNumber(offset + 156, $slo_rev);
	}

	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public void slo_rev(MCNumber value) {
		setConstNumber(offset + 156, $slo_rev, value);
	}

	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public void slo_rev(int value) {
		setConstNumber(offset + 156, $slo_rev, value);
	}

	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public void slo_rev(long value) {
		setConstNumber(offset + 156, $slo_rev, value);
	}

	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public void slo_rev(float value) {
		setConstNumber(offset + 156, $slo_rev, value);
	}

	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public void slo_rev(double value) {
		setConstNumber(offset + 156, $slo_rev, value);
	}


	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public String ship_pr_no() {
		return getConstString(offset + 157, $ship_pr_no);
	}

	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public void ship_pr_no(String value) {
		setConstString(offset + 157, $ship_pr_no, value);
	}


	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public MCDate slo_dt() {
		return getConstDate(offset + 158, $slo_dt);
	}

	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public void slo_dt(MCDate value) {
		setConstDate(offset + 158, $slo_dt, value);
	}


	/**
	 * Sales item No. 販売品目ＮＯ.<p>
	 *
	 */
	public String sls_itm_no() {
		return getConstString(offset + 159, $sls_itm_no);
	}

	/**
	 * Sales item No. 販売品目ＮＯ.<p>
	 *
	 */
	public void sls_itm_no(String value) {
		setConstString(offset + 159, $sls_itm_no, value);
	}


	/**
	 * Sales item specification No. 販売品目仕様ＮＯ.<p>
	 *
	 */
	public String sls_itm_spec_no() {
		return getConstString(offset + 160, $sls_itm_spec_no);
	}

	/**
	 * Sales item specification No. 販売品目仕様ＮＯ.<p>
	 *
	 */
	public void sls_itm_spec_no(String value) {
		setConstString(offset + 160, $sls_itm_spec_no, value);
	}


	/**
	 * Configuration rev. number 構成改訂番号.<p>
	 *
	 */
	public String itm_comp_rev_no() {
		return getConstString(offset + 161, $itm_comp_rev_no);
	}

	/**
	 * Configuration rev. number 構成改訂番号.<p>
	 *
	 */
	public void itm_comp_rev_no(String value) {
		setConstString(offset + 161, $itm_comp_rev_no, value);
	}


	/**
	 * Configuration base unit qty. 構成基準単位数量.<p>
	 *
	 */
	public MCNumber comp_base_qty() {
		return getConstNumber(offset + 162, $comp_base_qty);
	}

	/**
	 * Configuration base unit qty. 構成基準単位数量.<p>
	 *
	 */
	public void comp_base_qty(MCNumber value) {
		setConstNumber(offset + 162, $comp_base_qty, value);
	}

	/**
	 * Configuration base unit qty. 構成基準単位数量.<p>
	 *
	 */
	public void comp_base_qty(int value) {
		setConstNumber(offset + 162, $comp_base_qty, value);
	}

	/**
	 * Configuration base unit qty. 構成基準単位数量.<p>
	 *
	 */
	public void comp_base_qty(long value) {
		setConstNumber(offset + 162, $comp_base_qty, value);
	}

	/**
	 * Configuration base unit qty. 構成基準単位数量.<p>
	 *
	 */
	public void comp_base_qty(float value) {
		setConstNumber(offset + 162, $comp_base_qty, value);
	}

	/**
	 * Configuration base unit qty. 構成基準単位数量.<p>
	 *
	 */
	public void comp_base_qty(double value) {
		setConstNumber(offset + 162, $comp_base_qty, value);
	}


	/**
	 * Configuration release 構成リリース.<p>
	 *
	 */
	public boolean comp_rel_flg() {
		return getConstBoolean(offset + 163, $comp_rel_flg);
	}

	/**
	 * Configuration release 構成リリース.<p>
	 *
	 */
	public void comp_rel_flg(boolean value) {
		setConstBoolean(offset + 163, $comp_rel_flg, value);
	}


	/**
	 * Item undefined 品目未定義.<p>
	 *
	 */
	public boolean no_itm_cd_flg() {
		return getConstBoolean(offset + 164, $no_itm_cd_flg);
	}

	/**
	 * Item undefined 品目未定義.<p>
	 *
	 */
	public void no_itm_cd_flg(boolean value) {
		setConstBoolean(offset + 164, $no_itm_cd_flg, value);
	}


	/**
	 * New configuration 新規構成.<p>
	 *
	 */
	public boolean new_comp_flg() {
		return getConstBoolean(offset + 165, $new_comp_flg);
	}

	/**
	 * New configuration 新規構成.<p>
	 *
	 */
	public void new_comp_flg(boolean value) {
		setConstBoolean(offset + 165, $new_comp_flg, value);
	}


	/**
	 * Edit configuration 構成変更.<p>
	 *
	 */
	public boolean upd_comp_flg() {
		return getConstBoolean(offset + 166, $upd_comp_flg);
	}

	/**
	 * Edit configuration 構成変更.<p>
	 *
	 */
	public void upd_comp_flg(boolean value) {
		setConstBoolean(offset + 166, $upd_comp_flg, value);
	}


	/**
	 * Configuration revision 構成改訂.<p>
	 *
	 */
	public boolean rev_comp_flg() {
		return getConstBoolean(offset + 167, $rev_comp_flg);
	}

	/**
	 * Configuration revision 構成改訂.<p>
	 *
	 */
	public void rev_comp_flg(boolean value) {
		setConstBoolean(offset + 167, $rev_comp_flg, value);
	}


	/**
	 * New specification 新規仕様.<p>
	 *
	 */
	public boolean new_spec_flg() {
		return getConstBoolean(offset + 168, $new_spec_flg);
	}

	/**
	 * New specification 新規仕様.<p>
	 *
	 */
	public void new_spec_flg(boolean value) {
		setConstBoolean(offset + 168, $new_spec_flg, value);
	}


	/**
	 * Update specification 仕様更新.<p>
	 *
	 */
	public boolean upd_spec_flg() {
		return getConstBoolean(offset + 169, $upd_spec_flg);
	}

	/**
	 * Update specification 仕様更新.<p>
	 *
	 */
	public void upd_spec_flg(boolean value) {
		setConstBoolean(offset + 169, $upd_spec_flg, value);
	}


	/**
	 * Sales item numbered 販売品目発番済み.<p>
	 *
	 */
	public boolean sls_itm_seq_flg() {
		return getConstBoolean(offset + 170, $sls_itm_seq_flg);
	}

	/**
	 * Sales item numbered 販売品目発番済み.<p>
	 *
	 */
	public void sls_itm_seq_flg(boolean value) {
		setConstBoolean(offset + 170, $sls_itm_seq_flg, value);
	}


	/**
	 * Specification numbered 仕様発番済み.<p>
	 *
	 */
	public boolean spec_seq_flg() {
		return getConstBoolean(offset + 171, $spec_seq_flg);
	}

	/**
	 * Specification numbered 仕様発番済み.<p>
	 *
	 */
	public void spec_seq_flg(boolean value) {
		setConstBoolean(offset + 171, $spec_seq_flg, value);
	}


	/**
	 * Pending shipping before change 変更前の出荷留め.<p>
	 *
	 */
	public boolean org_ship_block_flg() {
		return getConstBoolean(offset + 172, $org_ship_block_flg);
	}

	/**
	 * Pending shipping before change 変更前の出荷留め.<p>
	 *
	 */
	public void org_ship_block_flg(boolean value) {
		setConstBoolean(offset + 172, $org_ship_block_flg, value);
	}


	/**
	 * Specifications available 仕様有り.<p>
	 *
	 */
	public boolean has_spec_flg() {
		return getConstBoolean(offset + 173, $has_spec_flg);
	}

	/**
	 * Specifications available 仕様有り.<p>
	 *
	 */
	public void has_spec_flg(boolean value) {
		setConstBoolean(offset + 173, $has_spec_flg, value);
	}


	/**
	 * Specification remarks 仕様備考.<p>
	 *
	 */
	public String spec_rmrks() {
		return getConstString(offset + 174, $spec_rmrks);
	}

	/**
	 * Specification remarks 仕様備考.<p>
	 *
	 */
	public void spec_rmrks(String value) {
		setConstString(offset + 174, $spec_rmrks, value);
	}


	/**
	 * Specification spare 1 仕様予備１.<p>
	 *
	 */
	public String spec_sub_char1() {
		return getConstString(offset + 175, $spec_sub_char1);
	}

	/**
	 * Specification spare 1 仕様予備１.<p>
	 *
	 */
	public void spec_sub_char1(String value) {
		setConstString(offset + 175, $spec_sub_char1, value);
	}


	/**
	 * Specification spare 2 仕様予備２.<p>
	 *
	 */
	public String spec_sub_char2() {
		return getConstString(offset + 176, $spec_sub_char2);
	}

	/**
	 * Specification spare 2 仕様予備２.<p>
	 *
	 */
	public void spec_sub_char2(String value) {
		setConstString(offset + 176, $spec_sub_char2, value);
	}


	/**
	 * Specification spare 3 仕様予備３.<p>
	 *
	 */
	public String spec_sub_char3() {
		return getConstString(offset + 177, $spec_sub_char3);
	}

	/**
	 * Specification spare 3 仕様予備３.<p>
	 *
	 */
	public void spec_sub_char3(String value) {
		setConstString(offset + 177, $spec_sub_char3, value);
	}


	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public String itm_ship_grp_cd() {
		return getConstString(offset + 178, $itm_ship_grp_cd);
	}

	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public void itm_ship_grp_cd(String value) {
		setConstString(offset + 178, $itm_ship_grp_cd, value);
	}


	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public MCNumber ship_pr_upd_cntr() {
		return getConstNumber(offset + 179, $ship_pr_upd_cntr);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 179, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(int value) {
		setConstNumber(offset + 179, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(long value) {
		setConstNumber(offset + 179, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(float value) {
		setConstNumber(offset + 179, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(double value) {
		setConstNumber(offset + 179, $ship_pr_upd_cntr, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 180, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 180, $err_flg, value);
	}


	/**
	 * Expiration date (Lower limit) 有効期限（下限）.<p>
	 *
	 */
	public MCDate valid_dt_fr() {
		return getConstDate(offset + 181, $valid_dt_fr);
	}

	/**
	 * Expiration date (Lower limit) 有効期限（下限）.<p>
	 *
	 */
	public void valid_dt_fr(MCDate value) {
		setConstDate(offset + 181, $valid_dt_fr, value);
	}


	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public MCNumber valid_dt_fr_grp() {
		return getConstNumber(offset + 182, $valid_dt_fr_grp);
	}

	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public void valid_dt_fr_grp(MCNumber value) {
		setConstNumber(offset + 182, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public void valid_dt_fr_grp(int value) {
		setConstNumber(offset + 182, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public void valid_dt_fr_grp(long value) {
		setConstNumber(offset + 182, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public void valid_dt_fr_grp(float value) {
		setConstNumber(offset + 182, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public void valid_dt_fr_grp(double value) {
		setConstNumber(offset + 182, $valid_dt_fr_grp, value);
	}


	/**
	 * Expiration date (Upper limit) 有効期限（上限）.<p>
	 *
	 */
	public MCDate valid_dt_to() {
		return getConstDate(offset + 183, $valid_dt_to);
	}

	/**
	 * Expiration date (Upper limit) 有効期限（上限）.<p>
	 *
	 */
	public void valid_dt_to(MCDate value) {
		setConstDate(offset + 183, $valid_dt_to, value);
	}


	/**
	 * Not auto-calculate 自動計算しない.<p>
	 *
	 */
	public boolean not_dt_calc_flg() {
		return getConstBoolean(offset + 184, $not_dt_calc_flg);
	}

	/**
	 * Not auto-calculate 自動計算しない.<p>
	 *
	 */
	public void not_dt_calc_flg(boolean value) {
		setConstBoolean(offset + 184, $not_dt_calc_flg, value);
	}


	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public String ship_wk_cd() {
		return getConstString(offset + 185, $ship_wk_cd);
	}

	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public void ship_wk_cd(String value) {
		setConstString(offset + 185, $ship_wk_cd, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 186, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 186, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 186, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 186, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 186, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 186, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 187, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 187, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 187, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 187, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 187, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 187, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 188, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 188, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 188, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 188, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 188, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 188, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 189, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 189, $trd_unit_rnd_typ, value);
	}


	/**
	 * SKU 荷姿単位.<p>
	 *
	 */
	public boolean pack_flg() {
		return getConstBoolean(offset + 190, $pack_flg);
	}

	/**
	 * SKU 荷姿単位.<p>
	 *
	 */
	public void pack_flg(boolean value) {
		setConstBoolean(offset + 190, $pack_flg, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 191, $base_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 191, $base_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 191, $base_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 191, $base_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 191, $base_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 191, $base_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 192, $base_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 192, $base_unit_rnd_typ, value);
	}


	/**
	 * HS cd. ＨＳ ＣＤ.<p>
	 *
	 */
	public String hs_cd() {
		return getConstString(offset + 193, $hs_cd);
	}

	/**
	 * HS cd. ＨＳ ＣＤ.<p>
	 *
	 */
	public void hs_cd(String value) {
		setConstString(offset + 193, $hs_cd, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 194, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 194, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 194, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 194, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 194, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 194, $peg_no, value);
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 195, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 195, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 195, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 195, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 195, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 195, $hdr_peg_no, value);
	}


	/**
	 * Not for update counter check 更新カウンタチェック対象外.<p>
	 *
	 */
	public boolean upd_cntr_not_chk_flg() {
		return getConstBoolean(offset + 196, $upd_cntr_not_chk_flg);
	}

	/**
	 * Not for update counter check 更新カウンタチェック対象外.<p>
	 *
	 */
	public void upd_cntr_not_chk_flg(boolean value) {
		setConstBoolean(offset + 196, $upd_cntr_not_chk_flg, value);
	}


	/**
	 * EDI details spare CHAR column 1 ＥＤＩ明細予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String edi_sub_d_char1() {
		return getConstString(offset + 197, $edi_sub_d_char1);
	}

	/**
	 * EDI details spare CHAR column 1 ＥＤＩ明細予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void edi_sub_d_char1(String value) {
		setConstString(offset + 197, $edi_sub_d_char1, value);
	}


	/**
	 * EDI details spare CHAR column 2 ＥＤＩ明細予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String edi_sub_d_char2() {
		return getConstString(offset + 198, $edi_sub_d_char2);
	}

	/**
	 * EDI details spare CHAR column 2 ＥＤＩ明細予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void edi_sub_d_char2(String value) {
		setConstString(offset + 198, $edi_sub_d_char2, value);
	}


	/**
	 * EDI details spare CHAR column 3 ＥＤＩ明細予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String edi_sub_d_char3() {
		return getConstString(offset + 199, $edi_sub_d_char3);
	}

	/**
	 * EDI details spare CHAR column 3 ＥＤＩ明細予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void edi_sub_d_char3(String value) {
		setConstString(offset + 199, $edi_sub_d_char3, value);
	}


	/**
	 * EDI details spare CHAR column 4 ＥＤＩ明細予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String edi_sub_d_char4() {
		return getConstString(offset + 200, $edi_sub_d_char4);
	}

	/**
	 * EDI details spare CHAR column 4 ＥＤＩ明細予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void edi_sub_d_char4(String value) {
		setConstString(offset + 200, $edi_sub_d_char4, value);
	}


	/**
	 * EDI details spare CHAR column 5 ＥＤＩ明細予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String edi_sub_d_char5() {
		return getConstString(offset + 201, $edi_sub_d_char5);
	}

	/**
	 * EDI details spare CHAR column 5 ＥＤＩ明細予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void edi_sub_d_char5(String value) {
		setConstString(offset + 201, $edi_sub_d_char5, value);
	}


	/**
	 * EDI details spare NUM column 1 ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber edi_sub_d_num1() {
		return getConstNumber(offset + 202, $edi_sub_d_num1);
	}

	/**
	 * EDI details spare NUM column 1 ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_d_num1(MCNumber value) {
		setConstNumber(offset + 202, $edi_sub_d_num1, value);
	}

	/**
	 * EDI details spare NUM column 1 ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_d_num1(int value) {
		setConstNumber(offset + 202, $edi_sub_d_num1, value);
	}

	/**
	 * EDI details spare NUM column 1 ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_d_num1(long value) {
		setConstNumber(offset + 202, $edi_sub_d_num1, value);
	}

	/**
	 * EDI details spare NUM column 1 ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_d_num1(float value) {
		setConstNumber(offset + 202, $edi_sub_d_num1, value);
	}

	/**
	 * EDI details spare NUM column 1 ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_d_num1(double value) {
		setConstNumber(offset + 202, $edi_sub_d_num1, value);
	}


	/**
	 * EDI details spare DATE column 1 ＥＤＩ明細予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate edi_sub_d_dt1() {
		return getConstDate(offset + 203, $edi_sub_d_dt1);
	}

	/**
	 * EDI details spare DATE column 1 ＥＤＩ明細予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void edi_sub_d_dt1(MCDate value) {
		setConstDate(offset + 203, $edi_sub_d_dt1, value);
	}


	/**
	 * Cancelled remaining qty. 残数打切数量.<p>
	 *
	 */
	public MCNumber rem_abort_qty() {
		return getConstNumber(offset + 204, $rem_abort_qty);
	}

	/**
	 * Cancelled remaining qty. 残数打切数量.<p>
	 *
	 */
	public void rem_abort_qty(MCNumber value) {
		setConstNumber(offset + 204, $rem_abort_qty, value);
	}

	/**
	 * Cancelled remaining qty. 残数打切数量.<p>
	 *
	 */
	public void rem_abort_qty(int value) {
		setConstNumber(offset + 204, $rem_abort_qty, value);
	}

	/**
	 * Cancelled remaining qty. 残数打切数量.<p>
	 *
	 */
	public void rem_abort_qty(long value) {
		setConstNumber(offset + 204, $rem_abort_qty, value);
	}

	/**
	 * Cancelled remaining qty. 残数打切数量.<p>
	 *
	 */
	public void rem_abort_qty(float value) {
		setConstNumber(offset + 204, $rem_abort_qty, value);
	}

	/**
	 * Cancelled remaining qty. 残数打切数量.<p>
	 *
	 */
	public void rem_abort_qty(double value) {
		setConstNumber(offset + 204, $rem_abort_qty, value);
	}


	/**
	 * Cancel remaining qty. 残数打切.<p>
	 *
	 */
	public boolean rem_abort_flg() {
		return getConstBoolean(offset + 205, $rem_abort_flg);
	}

	/**
	 * Cancel remaining qty. 残数打切.<p>
	 *
	 */
	public void rem_abort_flg(boolean value) {
		setConstBoolean(offset + 205, $rem_abort_flg, value);
	}


	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return getConstNumber(offset + 206, $data_lno);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		setConstNumber(offset + 206, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		setConstNumber(offset + 206, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		setConstNumber(offset + 206, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		setConstNumber(offset + 206, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		setConstNumber(offset + 206, $data_lno, value);
	}


	/**
	 * Receiving date 受信日.<p>
	 *
	 */
	public MCDate recv_dt() {
		return getConstDate(offset + 207, $recv_dt);
	}

	/**
	 * Receiving date 受信日.<p>
	 *
	 */
	public void recv_dt(MCDate value) {
		setConstDate(offset + 207, $recv_dt, value);
	}


	/**
	 * Delivery destination dept. (Master) 納品先部署（マスタ）.<p>
	 *
	 */
	public String mst_dlv_cntct_dpt() {
		return getConstString(offset + 208, $mst_dlv_cntct_dpt);
	}

	/**
	 * Delivery destination dept. (Master) 納品先部署（マスタ）.<p>
	 *
	 */
	public void mst_dlv_cntct_dpt(String value) {
		setConstString(offset + 208, $mst_dlv_cntct_dpt, value);
	}


	/**
	 * Delivery destination PIC (Master) 納品先担当者（マスタ）.<p>
	 *
	 */
	public String mst_dlv_cntct_psn() {
		return getConstString(offset + 209, $mst_dlv_cntct_psn);
	}

	/**
	 * Delivery destination PIC (Master) 納品先担当者（マスタ）.<p>
	 *
	 */
	public void mst_dlv_cntct_psn(String value) {
		setConstString(offset + 209, $mst_dlv_cntct_psn, value);
	}


	/**
	 * Delivery destination postal code (Master) 納品先郵便番号（マスタ）.<p>
	 *
	 */
	public String mst_dlv_zip_cd() {
		return getConstString(offset + 210, $mst_dlv_zip_cd);
	}

	/**
	 * Delivery destination postal code (Master) 納品先郵便番号（マスタ）.<p>
	 *
	 */
	public void mst_dlv_zip_cd(String value) {
		setConstString(offset + 210, $mst_dlv_zip_cd, value);
	}


	/**
	 * Delivery destination address 1 (Master) 納品先住所１（マスタ）.<p>
	 *
	 */
	public String mst_dlv_addr1() {
		return getConstString(offset + 211, $mst_dlv_addr1);
	}

	/**
	 * Delivery destination address 1 (Master) 納品先住所１（マスタ）.<p>
	 *
	 */
	public void mst_dlv_addr1(String value) {
		setConstString(offset + 211, $mst_dlv_addr1, value);
	}


	/**
	 * Delivery address 2 (Master) 納品先住所２（マスタ）.<p>
	 *
	 */
	public String mst_dlv_addr2() {
		return getConstString(offset + 212, $mst_dlv_addr2);
	}

	/**
	 * Delivery address 2 (Master) 納品先住所２（マスタ）.<p>
	 *
	 */
	public void mst_dlv_addr2(String value) {
		setConstString(offset + 212, $mst_dlv_addr2, value);
	}


	/**
	 * Delivery address 3 (Master) 納品先住所３（マスタ）.<p>
	 *
	 */
	public String mst_dlv_addr3() {
		return getConstString(offset + 213, $mst_dlv_addr3);
	}

	/**
	 * Delivery address 3 (Master) 納品先住所３（マスタ）.<p>
	 *
	 */
	public void mst_dlv_addr3(String value) {
		setConstString(offset + 213, $mst_dlv_addr3, value);
	}


	/**
	 * Delivery address 4 (Master) 納品先住所４（マスタ）.<p>
	 *
	 */
	public String mst_dlv_addr4() {
		return getConstString(offset + 214, $mst_dlv_addr4);
	}

	/**
	 * Delivery address 4 (Master) 納品先住所４（マスタ）.<p>
	 *
	 */
	public void mst_dlv_addr4(String value) {
		setConstString(offset + 214, $mst_dlv_addr4, value);
	}


	/**
	 * Delivery destination TEL (Master) 納品先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public String mst_dlv_tel() {
		return getConstString(offset + 215, $mst_dlv_tel);
	}

	/**
	 * Delivery destination TEL (Master) 納品先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public void mst_dlv_tel(String value) {
		setConstString(offset + 215, $mst_dlv_tel, value);
	}


	/**
	 * Delivery destination FAX (Master) 納品先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public String mst_dlv_fax() {
		return getConstString(offset + 216, $mst_dlv_fax);
	}

	/**
	 * Delivery destination FAX (Master) 納品先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public void mst_dlv_fax(String value) {
		setConstString(offset + 216, $mst_dlv_fax, value);
	}


	/**
	 * Delivery destination distribution group cd. (Master) 納品先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public String mst_dlv_lg_grp_cd() {
		return getConstString(offset + 217, $mst_dlv_lg_grp_cd);
	}

	/**
	 * Delivery destination distribution group cd. (Master) 納品先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public void mst_dlv_lg_grp_cd(String value) {
		setConstString(offset + 217, $mst_dlv_lg_grp_cd, value);
	}


	/**
	 * Destination dept. (master) 配送先部署（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_cntct_dpt() {
		return getConstString(offset + 218, $mst_tdlv_cntct_dpt);
	}

	/**
	 * Destination dept. (master) 配送先部署（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_cntct_dpt(String value) {
		setConstString(offset + 218, $mst_tdlv_cntct_dpt, value);
	}


	/**
	 * Delivery person in charge (master) 配送先担当者（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_cntct_psn() {
		return getConstString(offset + 219, $mst_tdlv_cntct_psn);
	}

	/**
	 * Delivery person in charge (master) 配送先担当者（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_cntct_psn(String value) {
		setConstString(offset + 219, $mst_tdlv_cntct_psn, value);
	}


	/**
	 * Delivery destination postal code (master) 配送先郵便番号（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_zip_cd() {
		return getConstString(offset + 220, $mst_tdlv_zip_cd);
	}

	/**
	 * Delivery destination postal code (master) 配送先郵便番号（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_zip_cd(String value) {
		setConstString(offset + 220, $mst_tdlv_zip_cd, value);
	}


	/**
	 * Shipping address 1 (master) 配送先住所１（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_addr1() {
		return getConstString(offset + 221, $mst_tdlv_addr1);
	}

	/**
	 * Shipping address 1 (master) 配送先住所１（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_addr1(String value) {
		setConstString(offset + 221, $mst_tdlv_addr1, value);
	}


	/**
	 * Shipping address 2 (master) 配送先住所２（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_addr2() {
		return getConstString(offset + 222, $mst_tdlv_addr2);
	}

	/**
	 * Shipping address 2 (master) 配送先住所２（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_addr2(String value) {
		setConstString(offset + 222, $mst_tdlv_addr2, value);
	}


	/**
	 * Shipping address 3 (master) 配送先住所３（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_addr3() {
		return getConstString(offset + 223, $mst_tdlv_addr3);
	}

	/**
	 * Shipping address 3 (master) 配送先住所３（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_addr3(String value) {
		setConstString(offset + 223, $mst_tdlv_addr3, value);
	}


	/**
	 * Shipping address 4 (master) 配送先住所４（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_addr4() {
		return getConstString(offset + 224, $mst_tdlv_addr4);
	}

	/**
	 * Shipping address 4 (master) 配送先住所４（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_addr4(String value) {
		setConstString(offset + 224, $mst_tdlv_addr4, value);
	}


	/**
	 * Delivery destination TEL (master) 配送先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_tel() {
		return getConstString(offset + 225, $mst_tdlv_tel);
	}

	/**
	 * Delivery destination TEL (master) 配送先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_tel(String value) {
		setConstString(offset + 225, $mst_tdlv_tel, value);
	}


	/**
	 * Delivery destination fax (master) 配送先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_fax() {
		return getConstString(offset + 226, $mst_tdlv_fax);
	}

	/**
	 * Delivery destination fax (master) 配送先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_fax(String value) {
		setConstString(offset + 226, $mst_tdlv_fax, value);
	}


	/**
	 * Delivery destination distribution group cd. (master) 配送先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_lg_grp_cd() {
		return getConstString(offset + 227, $mst_tdlv_lg_grp_cd);
	}

	/**
	 * Delivery destination distribution group cd. (master) 配送先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_lg_grp_cd(String value) {
		setConstString(offset + 227, $mst_tdlv_lg_grp_cd, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
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
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			return comp_spec_typ();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
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
		if ($sno1_ptn_cd.equalsIgnoreCase(name)) {
			return sno1_ptn_cd();
		}
		if ($sno2_ptn_cd.equalsIgnoreCase(name)) {
			return sno2_ptn_cd();
		}
		if ($sno3_ptn_cd.equalsIgnoreCase(name)) {
			return sno3_ptn_cd();
		}
		if ($sno4_ptn_cd.equalsIgnoreCase(name)) {
			return sno4_ptn_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			return dlv_cntry_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
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
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_cd();
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			return proc_typ();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			return alloc_typ();
		}
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			return rqst_to_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($rqst_unit_cd.equalsIgnoreCase(name)) {
			return rqst_unit_cd();
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_rqst_cnt_rmrks();
		}
		if ($rqst_to_wg_cd.equalsIgnoreCase(name)) {
			return rqst_to_wg_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($def_loc_cd.equalsIgnoreCase(name)) {
			return def_loc_cd();
		}
		if ($def_str_ln_cd.equalsIgnoreCase(name)) {
			return def_str_ln_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($cst_po_d_rmrks.equalsIgnoreCase(name)) {
			return cst_po_d_rmrks();
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			return sls_rsn_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
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
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			return can_rsn_cd();
		}
		if ($slo_d_can_rmkrs.equalsIgnoreCase(name)) {
			return slo_d_can_rmkrs();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			return qtn_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($sls_itm_no.equalsIgnoreCase(name)) {
			return sls_itm_no();
		}
		if ($sls_itm_spec_no.equalsIgnoreCase(name)) {
			return sls_itm_spec_no();
		}
		if ($itm_comp_rev_no.equalsIgnoreCase(name)) {
			return itm_comp_rev_no();
		}
		if ($spec_rmrks.equalsIgnoreCase(name)) {
			return spec_rmrks();
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
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			return itm_ship_grp_cd();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($hs_cd.equalsIgnoreCase(name)) {
			return hs_cd();
		}
		if ($edi_sub_d_char1.equalsIgnoreCase(name)) {
			return edi_sub_d_char1();
		}
		if ($edi_sub_d_char2.equalsIgnoreCase(name)) {
			return edi_sub_d_char2();
		}
		if ($edi_sub_d_char3.equalsIgnoreCase(name)) {
			return edi_sub_d_char3();
		}
		if ($edi_sub_d_char4.equalsIgnoreCase(name)) {
			return edi_sub_d_char4();
		}
		if ($edi_sub_d_char5.equalsIgnoreCase(name)) {
			return edi_sub_d_char5();
		}
		if ($mst_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return mst_dlv_cntct_dpt();
		}
		if ($mst_dlv_cntct_psn.equalsIgnoreCase(name)) {
			return mst_dlv_cntct_psn();
		}
		if ($mst_dlv_zip_cd.equalsIgnoreCase(name)) {
			return mst_dlv_zip_cd();
		}
		if ($mst_dlv_addr1.equalsIgnoreCase(name)) {
			return mst_dlv_addr1();
		}
		if ($mst_dlv_addr2.equalsIgnoreCase(name)) {
			return mst_dlv_addr2();
		}
		if ($mst_dlv_addr3.equalsIgnoreCase(name)) {
			return mst_dlv_addr3();
		}
		if ($mst_dlv_addr4.equalsIgnoreCase(name)) {
			return mst_dlv_addr4();
		}
		if ($mst_dlv_tel.equalsIgnoreCase(name)) {
			return mst_dlv_tel();
		}
		if ($mst_dlv_fax.equalsIgnoreCase(name)) {
			return mst_dlv_fax();
		}
		if ($mst_dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return mst_dlv_lg_grp_cd();
		}
		if ($mst_tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return mst_tdlv_cntct_dpt();
		}
		if ($mst_tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return mst_tdlv_cntct_psn();
		}
		if ($mst_tdlv_zip_cd.equalsIgnoreCase(name)) {
			return mst_tdlv_zip_cd();
		}
		if ($mst_tdlv_addr1.equalsIgnoreCase(name)) {
			return mst_tdlv_addr1();
		}
		if ($mst_tdlv_addr2.equalsIgnoreCase(name)) {
			return mst_tdlv_addr2();
		}
		if ($mst_tdlv_addr3.equalsIgnoreCase(name)) {
			return mst_tdlv_addr3();
		}
		if ($mst_tdlv_addr4.equalsIgnoreCase(name)) {
			return mst_tdlv_addr4();
		}
		if ($mst_tdlv_tel.equalsIgnoreCase(name)) {
			return mst_tdlv_tel();
		}
		if ($mst_tdlv_fax.equalsIgnoreCase(name)) {
			return mst_tdlv_fax();
		}
		if ($mst_tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return mst_tdlv_lg_grp_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			return alloc_margin_days();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			return cost_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			return iv_upri();
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			return iv_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			return rqst_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			return slo_rev();
		}
		if ($comp_base_qty.equalsIgnoreCase(name)) {
			return comp_base_qty();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			return valid_dt_fr_grp();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			return edi_sub_d_num1();
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			return rem_abort_qty();
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			return ship_rqst_tm();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			return sls_schd_dt();
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			return accpt_schd_dt();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		if ($rqst_dt.equalsIgnoreCase(name)) {
			return rqst_dt();
		}
		if ($rqst_dlv_rqst_dt.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_dt();
		}
		if ($slo_dt.equalsIgnoreCase(name)) {
			return slo_dt();
		}
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			return valid_dt_fr();
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			return valid_dt_to();
		}
		if ($edi_sub_d_dt1.equalsIgnoreCase(name)) {
			return edi_sub_d_dt1();
		}
		if ($recv_dt.equalsIgnoreCase(name)) {
			return recv_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			return vmi_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			return upri_not_tgt_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($sno_num_flg.equalsIgnoreCase(name)) {
			return sno_num_flg();
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
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
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			return tdlv_req_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			return ship_block_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($comp_rel_flg.equalsIgnoreCase(name)) {
			return comp_rel_flg();
		}
		if ($no_itm_cd_flg.equalsIgnoreCase(name)) {
			return no_itm_cd_flg();
		}
		if ($new_comp_flg.equalsIgnoreCase(name)) {
			return new_comp_flg();
		}
		if ($upd_comp_flg.equalsIgnoreCase(name)) {
			return upd_comp_flg();
		}
		if ($rev_comp_flg.equalsIgnoreCase(name)) {
			return rev_comp_flg();
		}
		if ($new_spec_flg.equalsIgnoreCase(name)) {
			return new_spec_flg();
		}
		if ($upd_spec_flg.equalsIgnoreCase(name)) {
			return upd_spec_flg();
		}
		if ($sls_itm_seq_flg.equalsIgnoreCase(name)) {
			return sls_itm_seq_flg();
		}
		if ($spec_seq_flg.equalsIgnoreCase(name)) {
			return spec_seq_flg();
		}
		if ($org_ship_block_flg.equalsIgnoreCase(name)) {
			return org_ship_block_flg();
		}
		if ($has_spec_flg.equalsIgnoreCase(name)) {
			return has_spec_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($not_dt_calc_flg.equalsIgnoreCase(name)) {
			return not_dt_calc_flg();
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($upd_cntr_not_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_not_chk_flg();
		}
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			return rem_abort_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
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
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			return comp_spec_typ();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
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
		if ($sno1_ptn_cd.equalsIgnoreCase(name)) {
			return sno1_ptn_cd();
		}
		if ($sno2_ptn_cd.equalsIgnoreCase(name)) {
			return sno2_ptn_cd();
		}
		if ($sno3_ptn_cd.equalsIgnoreCase(name)) {
			return sno3_ptn_cd();
		}
		if ($sno4_ptn_cd.equalsIgnoreCase(name)) {
			return sno4_ptn_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			return dlv_cntry_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
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
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_cd();
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			return proc_typ();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			return alloc_typ();
		}
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			return rqst_to_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($rqst_unit_cd.equalsIgnoreCase(name)) {
			return rqst_unit_cd();
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_rqst_cnt_rmrks();
		}
		if ($rqst_to_wg_cd.equalsIgnoreCase(name)) {
			return rqst_to_wg_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($def_loc_cd.equalsIgnoreCase(name)) {
			return def_loc_cd();
		}
		if ($def_str_ln_cd.equalsIgnoreCase(name)) {
			return def_str_ln_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($cst_po_d_rmrks.equalsIgnoreCase(name)) {
			return cst_po_d_rmrks();
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			return sls_rsn_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
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
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			return can_rsn_cd();
		}
		if ($slo_d_can_rmkrs.equalsIgnoreCase(name)) {
			return slo_d_can_rmkrs();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			return qtn_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($sls_itm_no.equalsIgnoreCase(name)) {
			return sls_itm_no();
		}
		if ($sls_itm_spec_no.equalsIgnoreCase(name)) {
			return sls_itm_spec_no();
		}
		if ($itm_comp_rev_no.equalsIgnoreCase(name)) {
			return itm_comp_rev_no();
		}
		if ($spec_rmrks.equalsIgnoreCase(name)) {
			return spec_rmrks();
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
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			return itm_ship_grp_cd();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($hs_cd.equalsIgnoreCase(name)) {
			return hs_cd();
		}
		if ($edi_sub_d_char1.equalsIgnoreCase(name)) {
			return edi_sub_d_char1();
		}
		if ($edi_sub_d_char2.equalsIgnoreCase(name)) {
			return edi_sub_d_char2();
		}
		if ($edi_sub_d_char3.equalsIgnoreCase(name)) {
			return edi_sub_d_char3();
		}
		if ($edi_sub_d_char4.equalsIgnoreCase(name)) {
			return edi_sub_d_char4();
		}
		if ($edi_sub_d_char5.equalsIgnoreCase(name)) {
			return edi_sub_d_char5();
		}
		if ($mst_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return mst_dlv_cntct_dpt();
		}
		if ($mst_dlv_cntct_psn.equalsIgnoreCase(name)) {
			return mst_dlv_cntct_psn();
		}
		if ($mst_dlv_zip_cd.equalsIgnoreCase(name)) {
			return mst_dlv_zip_cd();
		}
		if ($mst_dlv_addr1.equalsIgnoreCase(name)) {
			return mst_dlv_addr1();
		}
		if ($mst_dlv_addr2.equalsIgnoreCase(name)) {
			return mst_dlv_addr2();
		}
		if ($mst_dlv_addr3.equalsIgnoreCase(name)) {
			return mst_dlv_addr3();
		}
		if ($mst_dlv_addr4.equalsIgnoreCase(name)) {
			return mst_dlv_addr4();
		}
		if ($mst_dlv_tel.equalsIgnoreCase(name)) {
			return mst_dlv_tel();
		}
		if ($mst_dlv_fax.equalsIgnoreCase(name)) {
			return mst_dlv_fax();
		}
		if ($mst_dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return mst_dlv_lg_grp_cd();
		}
		if ($mst_tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return mst_tdlv_cntct_dpt();
		}
		if ($mst_tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return mst_tdlv_cntct_psn();
		}
		if ($mst_tdlv_zip_cd.equalsIgnoreCase(name)) {
			return mst_tdlv_zip_cd();
		}
		if ($mst_tdlv_addr1.equalsIgnoreCase(name)) {
			return mst_tdlv_addr1();
		}
		if ($mst_tdlv_addr2.equalsIgnoreCase(name)) {
			return mst_tdlv_addr2();
		}
		if ($mst_tdlv_addr3.equalsIgnoreCase(name)) {
			return mst_tdlv_addr3();
		}
		if ($mst_tdlv_addr4.equalsIgnoreCase(name)) {
			return mst_tdlv_addr4();
		}
		if ($mst_tdlv_tel.equalsIgnoreCase(name)) {
			return mst_tdlv_tel();
		}
		if ($mst_tdlv_fax.equalsIgnoreCase(name)) {
			return mst_tdlv_fax();
		}
		if ($mst_tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return mst_tdlv_lg_grp_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			return alloc_margin_days();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			return cost_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			return iv_upri();
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			return iv_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			return rqst_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			return slo_rev();
		}
		if ($comp_base_qty.equalsIgnoreCase(name)) {
			return comp_base_qty();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			return valid_dt_fr_grp();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			return edi_sub_d_num1();
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			return rem_abort_qty();
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			return ship_rqst_tm();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			return sls_schd_dt();
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			return accpt_schd_dt();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		if ($rqst_dt.equalsIgnoreCase(name)) {
			return rqst_dt();
		}
		if ($rqst_dlv_rqst_dt.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_dt();
		}
		if ($slo_dt.equalsIgnoreCase(name)) {
			return slo_dt();
		}
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			return valid_dt_fr();
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			return valid_dt_to();
		}
		if ($edi_sub_d_dt1.equalsIgnoreCase(name)) {
			return edi_sub_d_dt1();
		}
		if ($recv_dt.equalsIgnoreCase(name)) {
			return recv_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			return vmi_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			return upri_not_tgt_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($sno_num_flg.equalsIgnoreCase(name)) {
			return sno_num_flg();
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
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
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			return tdlv_req_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			return ship_block_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($comp_rel_flg.equalsIgnoreCase(name)) {
			return comp_rel_flg();
		}
		if ($no_itm_cd_flg.equalsIgnoreCase(name)) {
			return no_itm_cd_flg();
		}
		if ($new_comp_flg.equalsIgnoreCase(name)) {
			return new_comp_flg();
		}
		if ($upd_comp_flg.equalsIgnoreCase(name)) {
			return upd_comp_flg();
		}
		if ($rev_comp_flg.equalsIgnoreCase(name)) {
			return rev_comp_flg();
		}
		if ($new_spec_flg.equalsIgnoreCase(name)) {
			return new_spec_flg();
		}
		if ($upd_spec_flg.equalsIgnoreCase(name)) {
			return upd_spec_flg();
		}
		if ($sls_itm_seq_flg.equalsIgnoreCase(name)) {
			return sls_itm_seq_flg();
		}
		if ($spec_seq_flg.equalsIgnoreCase(name)) {
			return spec_seq_flg();
		}
		if ($org_ship_block_flg.equalsIgnoreCase(name)) {
			return org_ship_block_flg();
		}
		if ($has_spec_flg.equalsIgnoreCase(name)) {
			return has_spec_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($not_dt_calc_flg.equalsIgnoreCase(name)) {
			return not_dt_calc_flg();
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($upd_cntr_not_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_not_chk_flg();
		}
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			return rem_abort_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
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
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			comp_spec_typ(value);
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
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
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
		if ($sno1_ptn_cd.equalsIgnoreCase(name)) {
			sno1_ptn_cd(value);
			return;
		}
		if ($sno2_ptn_cd.equalsIgnoreCase(name)) {
			sno2_ptn_cd(value);
			return;
		}
		if ($sno3_ptn_cd.equalsIgnoreCase(name)) {
			sno3_ptn_cd(value);
			return;
		}
		if ($sno4_ptn_cd.equalsIgnoreCase(name)) {
			sno4_ptn_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
			return;
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			dlv_cntry_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
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
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
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
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			tdlv_lg_grp_cd(value);
			return;
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			dlv_day_week_typ(value);
			return;
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			proc_typ(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			alloc_typ(value);
			return;
		}
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			rqst_to_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($rqst_unit_cd.equalsIgnoreCase(name)) {
			rqst_unit_cd(value);
			return;
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			wg_rqst_cnt_rmrks(value);
			return;
		}
		if ($rqst_to_wg_cd.equalsIgnoreCase(name)) {
			rqst_to_wg_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($def_loc_cd.equalsIgnoreCase(name)) {
			def_loc_cd(value);
			return;
		}
		if ($def_str_ln_cd.equalsIgnoreCase(name)) {
			def_str_ln_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
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
		if ($cst_po_d_rmrks.equalsIgnoreCase(name)) {
			cst_po_d_rmrks(value);
			return;
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			sls_rsn_cd(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
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
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
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
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			can_rsn_cd(value);
			return;
		}
		if ($slo_d_can_rmkrs.equalsIgnoreCase(name)) {
			slo_d_can_rmkrs(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			qtn_d_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($sls_itm_no.equalsIgnoreCase(name)) {
			sls_itm_no(value);
			return;
		}
		if ($sls_itm_spec_no.equalsIgnoreCase(name)) {
			sls_itm_spec_no(value);
			return;
		}
		if ($itm_comp_rev_no.equalsIgnoreCase(name)) {
			itm_comp_rev_no(value);
			return;
		}
		if ($spec_rmrks.equalsIgnoreCase(name)) {
			spec_rmrks(value);
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
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			itm_ship_grp_cd(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($hs_cd.equalsIgnoreCase(name)) {
			hs_cd(value);
			return;
		}
		if ($edi_sub_d_char1.equalsIgnoreCase(name)) {
			edi_sub_d_char1(value);
			return;
		}
		if ($edi_sub_d_char2.equalsIgnoreCase(name)) {
			edi_sub_d_char2(value);
			return;
		}
		if ($edi_sub_d_char3.equalsIgnoreCase(name)) {
			edi_sub_d_char3(value);
			return;
		}
		if ($edi_sub_d_char4.equalsIgnoreCase(name)) {
			edi_sub_d_char4(value);
			return;
		}
		if ($edi_sub_d_char5.equalsIgnoreCase(name)) {
			edi_sub_d_char5(value);
			return;
		}
		if ($mst_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			mst_dlv_cntct_dpt(value);
			return;
		}
		if ($mst_dlv_cntct_psn.equalsIgnoreCase(name)) {
			mst_dlv_cntct_psn(value);
			return;
		}
		if ($mst_dlv_zip_cd.equalsIgnoreCase(name)) {
			mst_dlv_zip_cd(value);
			return;
		}
		if ($mst_dlv_addr1.equalsIgnoreCase(name)) {
			mst_dlv_addr1(value);
			return;
		}
		if ($mst_dlv_addr2.equalsIgnoreCase(name)) {
			mst_dlv_addr2(value);
			return;
		}
		if ($mst_dlv_addr3.equalsIgnoreCase(name)) {
			mst_dlv_addr3(value);
			return;
		}
		if ($mst_dlv_addr4.equalsIgnoreCase(name)) {
			mst_dlv_addr4(value);
			return;
		}
		if ($mst_dlv_tel.equalsIgnoreCase(name)) {
			mst_dlv_tel(value);
			return;
		}
		if ($mst_dlv_fax.equalsIgnoreCase(name)) {
			mst_dlv_fax(value);
			return;
		}
		if ($mst_dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			mst_dlv_lg_grp_cd(value);
			return;
		}
		if ($mst_tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			mst_tdlv_cntct_dpt(value);
			return;
		}
		if ($mst_tdlv_cntct_psn.equalsIgnoreCase(name)) {
			mst_tdlv_cntct_psn(value);
			return;
		}
		if ($mst_tdlv_zip_cd.equalsIgnoreCase(name)) {
			mst_tdlv_zip_cd(value);
			return;
		}
		if ($mst_tdlv_addr1.equalsIgnoreCase(name)) {
			mst_tdlv_addr1(value);
			return;
		}
		if ($mst_tdlv_addr2.equalsIgnoreCase(name)) {
			mst_tdlv_addr2(value);
			return;
		}
		if ($mst_tdlv_addr3.equalsIgnoreCase(name)) {
			mst_tdlv_addr3(value);
			return;
		}
		if ($mst_tdlv_addr4.equalsIgnoreCase(name)) {
			mst_tdlv_addr4(value);
			return;
		}
		if ($mst_tdlv_tel.equalsIgnoreCase(name)) {
			mst_tdlv_tel(value);
			return;
		}
		if ($mst_tdlv_fax.equalsIgnoreCase(name)) {
			mst_tdlv_fax(value);
			return;
		}
		if ($mst_tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			mst_tdlv_lg_grp_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($comp_base_qty.equalsIgnoreCase(name)) {
			comp_base_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			rem_abort_qty(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($comp_base_qty.equalsIgnoreCase(name)) {
			comp_base_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			rem_abort_qty(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($comp_base_qty.equalsIgnoreCase(name)) {
			comp_base_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			rem_abort_qty(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($comp_base_qty.equalsIgnoreCase(name)) {
			comp_base_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			rem_abort_qty(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($comp_base_qty.equalsIgnoreCase(name)) {
			comp_base_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			rem_abort_qty(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			ship_rqst_tm(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			sls_schd_dt(value);
			return;
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			accpt_schd_dt(value);
			return;
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		if ($rqst_dt.equalsIgnoreCase(name)) {
			rqst_dt(value);
			return;
		}
		if ($rqst_dlv_rqst_dt.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_dt(value);
			return;
		}
		if ($slo_dt.equalsIgnoreCase(name)) {
			slo_dt(value);
			return;
		}
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			valid_dt_fr(value);
			return;
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			valid_dt_to(value);
			return;
		}
		if ($edi_sub_d_dt1.equalsIgnoreCase(name)) {
			edi_sub_d_dt1(value);
			return;
		}
		if ($recv_dt.equalsIgnoreCase(name)) {
			recv_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			vmi_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			upri_not_tgt_flg(value);
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
		if ($sno_num_flg.equalsIgnoreCase(name)) {
			sno_num_flg(value);
			return;
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
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
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			tdlv_req_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
			return;
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
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
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			not_lot_mix_flg(value);
			return;
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			not_sublot_mix_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			ship_block_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($comp_rel_flg.equalsIgnoreCase(name)) {
			comp_rel_flg(value);
			return;
		}
		if ($no_itm_cd_flg.equalsIgnoreCase(name)) {
			no_itm_cd_flg(value);
			return;
		}
		if ($new_comp_flg.equalsIgnoreCase(name)) {
			new_comp_flg(value);
			return;
		}
		if ($upd_comp_flg.equalsIgnoreCase(name)) {
			upd_comp_flg(value);
			return;
		}
		if ($rev_comp_flg.equalsIgnoreCase(name)) {
			rev_comp_flg(value);
			return;
		}
		if ($new_spec_flg.equalsIgnoreCase(name)) {
			new_spec_flg(value);
			return;
		}
		if ($upd_spec_flg.equalsIgnoreCase(name)) {
			upd_spec_flg(value);
			return;
		}
		if ($sls_itm_seq_flg.equalsIgnoreCase(name)) {
			sls_itm_seq_flg(value);
			return;
		}
		if ($spec_seq_flg.equalsIgnoreCase(name)) {
			spec_seq_flg(value);
			return;
		}
		if ($org_ship_block_flg.equalsIgnoreCase(name)) {
			org_ship_block_flg(value);
			return;
		}
		if ($has_spec_flg.equalsIgnoreCase(name)) {
			has_spec_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($not_dt_calc_flg.equalsIgnoreCase(name)) {
			not_dt_calc_flg(value);
			return;
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($upd_cntr_not_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_not_chk_flg(value);
			return;
		}
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			rem_abort_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
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
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			comp_spec_typ(value);
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
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
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
		if ($sno1_ptn_cd.equalsIgnoreCase(name)) {
			sno1_ptn_cd(value);
			return;
		}
		if ($sno2_ptn_cd.equalsIgnoreCase(name)) {
			sno2_ptn_cd(value);
			return;
		}
		if ($sno3_ptn_cd.equalsIgnoreCase(name)) {
			sno3_ptn_cd(value);
			return;
		}
		if ($sno4_ptn_cd.equalsIgnoreCase(name)) {
			sno4_ptn_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
			return;
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			dlv_cntry_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
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
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
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
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			tdlv_lg_grp_cd(value);
			return;
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			dlv_day_week_typ(value);
			return;
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			proc_typ(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			alloc_typ(value);
			return;
		}
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			rqst_to_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($rqst_unit_cd.equalsIgnoreCase(name)) {
			rqst_unit_cd(value);
			return;
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			wg_rqst_cnt_rmrks(value);
			return;
		}
		if ($rqst_to_wg_cd.equalsIgnoreCase(name)) {
			rqst_to_wg_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($def_loc_cd.equalsIgnoreCase(name)) {
			def_loc_cd(value);
			return;
		}
		if ($def_str_ln_cd.equalsIgnoreCase(name)) {
			def_str_ln_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
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
		if ($cst_po_d_rmrks.equalsIgnoreCase(name)) {
			cst_po_d_rmrks(value);
			return;
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			sls_rsn_cd(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
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
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
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
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			can_rsn_cd(value);
			return;
		}
		if ($slo_d_can_rmkrs.equalsIgnoreCase(name)) {
			slo_d_can_rmkrs(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			qtn_d_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($sls_itm_no.equalsIgnoreCase(name)) {
			sls_itm_no(value);
			return;
		}
		if ($sls_itm_spec_no.equalsIgnoreCase(name)) {
			sls_itm_spec_no(value);
			return;
		}
		if ($itm_comp_rev_no.equalsIgnoreCase(name)) {
			itm_comp_rev_no(value);
			return;
		}
		if ($spec_rmrks.equalsIgnoreCase(name)) {
			spec_rmrks(value);
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
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			itm_ship_grp_cd(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($hs_cd.equalsIgnoreCase(name)) {
			hs_cd(value);
			return;
		}
		if ($edi_sub_d_char1.equalsIgnoreCase(name)) {
			edi_sub_d_char1(value);
			return;
		}
		if ($edi_sub_d_char2.equalsIgnoreCase(name)) {
			edi_sub_d_char2(value);
			return;
		}
		if ($edi_sub_d_char3.equalsIgnoreCase(name)) {
			edi_sub_d_char3(value);
			return;
		}
		if ($edi_sub_d_char4.equalsIgnoreCase(name)) {
			edi_sub_d_char4(value);
			return;
		}
		if ($edi_sub_d_char5.equalsIgnoreCase(name)) {
			edi_sub_d_char5(value);
			return;
		}
		if ($mst_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			mst_dlv_cntct_dpt(value);
			return;
		}
		if ($mst_dlv_cntct_psn.equalsIgnoreCase(name)) {
			mst_dlv_cntct_psn(value);
			return;
		}
		if ($mst_dlv_zip_cd.equalsIgnoreCase(name)) {
			mst_dlv_zip_cd(value);
			return;
		}
		if ($mst_dlv_addr1.equalsIgnoreCase(name)) {
			mst_dlv_addr1(value);
			return;
		}
		if ($mst_dlv_addr2.equalsIgnoreCase(name)) {
			mst_dlv_addr2(value);
			return;
		}
		if ($mst_dlv_addr3.equalsIgnoreCase(name)) {
			mst_dlv_addr3(value);
			return;
		}
		if ($mst_dlv_addr4.equalsIgnoreCase(name)) {
			mst_dlv_addr4(value);
			return;
		}
		if ($mst_dlv_tel.equalsIgnoreCase(name)) {
			mst_dlv_tel(value);
			return;
		}
		if ($mst_dlv_fax.equalsIgnoreCase(name)) {
			mst_dlv_fax(value);
			return;
		}
		if ($mst_dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			mst_dlv_lg_grp_cd(value);
			return;
		}
		if ($mst_tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			mst_tdlv_cntct_dpt(value);
			return;
		}
		if ($mst_tdlv_cntct_psn.equalsIgnoreCase(name)) {
			mst_tdlv_cntct_psn(value);
			return;
		}
		if ($mst_tdlv_zip_cd.equalsIgnoreCase(name)) {
			mst_tdlv_zip_cd(value);
			return;
		}
		if ($mst_tdlv_addr1.equalsIgnoreCase(name)) {
			mst_tdlv_addr1(value);
			return;
		}
		if ($mst_tdlv_addr2.equalsIgnoreCase(name)) {
			mst_tdlv_addr2(value);
			return;
		}
		if ($mst_tdlv_addr3.equalsIgnoreCase(name)) {
			mst_tdlv_addr3(value);
			return;
		}
		if ($mst_tdlv_addr4.equalsIgnoreCase(name)) {
			mst_tdlv_addr4(value);
			return;
		}
		if ($mst_tdlv_tel.equalsIgnoreCase(name)) {
			mst_tdlv_tel(value);
			return;
		}
		if ($mst_tdlv_fax.equalsIgnoreCase(name)) {
			mst_tdlv_fax(value);
			return;
		}
		if ($mst_tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			mst_tdlv_lg_grp_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($comp_base_qty.equalsIgnoreCase(name)) {
			comp_base_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			rem_abort_qty(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($comp_base_qty.equalsIgnoreCase(name)) {
			comp_base_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			rem_abort_qty(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($comp_base_qty.equalsIgnoreCase(name)) {
			comp_base_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			rem_abort_qty(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($comp_base_qty.equalsIgnoreCase(name)) {
			comp_base_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			rem_abort_qty(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($comp_base_qty.equalsIgnoreCase(name)) {
			comp_base_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			rem_abort_qty(value);
			return;
		}
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			ship_rqst_tm(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			sls_schd_dt(value);
			return;
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			accpt_schd_dt(value);
			return;
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		if ($rqst_dt.equalsIgnoreCase(name)) {
			rqst_dt(value);
			return;
		}
		if ($rqst_dlv_rqst_dt.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_dt(value);
			return;
		}
		if ($slo_dt.equalsIgnoreCase(name)) {
			slo_dt(value);
			return;
		}
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			valid_dt_fr(value);
			return;
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			valid_dt_to(value);
			return;
		}
		if ($edi_sub_d_dt1.equalsIgnoreCase(name)) {
			edi_sub_d_dt1(value);
			return;
		}
		if ($recv_dt.equalsIgnoreCase(name)) {
			recv_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			vmi_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			upri_not_tgt_flg(value);
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
		if ($sno_num_flg.equalsIgnoreCase(name)) {
			sno_num_flg(value);
			return;
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
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
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			tdlv_req_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
			return;
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
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
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			not_lot_mix_flg(value);
			return;
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			not_sublot_mix_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			ship_block_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($comp_rel_flg.equalsIgnoreCase(name)) {
			comp_rel_flg(value);
			return;
		}
		if ($no_itm_cd_flg.equalsIgnoreCase(name)) {
			no_itm_cd_flg(value);
			return;
		}
		if ($new_comp_flg.equalsIgnoreCase(name)) {
			new_comp_flg(value);
			return;
		}
		if ($upd_comp_flg.equalsIgnoreCase(name)) {
			upd_comp_flg(value);
			return;
		}
		if ($rev_comp_flg.equalsIgnoreCase(name)) {
			rev_comp_flg(value);
			return;
		}
		if ($new_spec_flg.equalsIgnoreCase(name)) {
			new_spec_flg(value);
			return;
		}
		if ($upd_spec_flg.equalsIgnoreCase(name)) {
			upd_spec_flg(value);
			return;
		}
		if ($sls_itm_seq_flg.equalsIgnoreCase(name)) {
			sls_itm_seq_flg(value);
			return;
		}
		if ($spec_seq_flg.equalsIgnoreCase(name)) {
			spec_seq_flg(value);
			return;
		}
		if ($org_ship_block_flg.equalsIgnoreCase(name)) {
			org_ship_block_flg(value);
			return;
		}
		if ($has_spec_flg.equalsIgnoreCase(name)) {
			has_spec_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($not_dt_calc_flg.equalsIgnoreCase(name)) {
			not_dt_calc_flg(value);
			return;
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($upd_cntr_not_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_not_chk_flg(value);
			return;
		}
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			rem_abort_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

