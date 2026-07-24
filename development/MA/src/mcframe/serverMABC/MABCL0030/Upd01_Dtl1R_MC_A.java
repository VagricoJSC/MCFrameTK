package mcframe.serverMABC.MABCL0030;

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
 * ブロック"Upd01_Dtl1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Upd01_Dtl1R_MC_A extends MCConstRow {

	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public static final String $da_cd = "da_cd";
	/**
	 * Standard data access name 標準データアクセス名.<p>
	 *
	 */
	public static final String $da_nm = "da_nm";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Standard dept. name 標準部門名.<p>
	 *
	 */
	public static final String $def_dpt_nm = "def_dpt_nm";
	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public static final String $dpt_lvl_cd = "dpt_lvl_cd";
	/**
	 * Standard dept. hierarchy name 標準部門階層名.<p>
	 *
	 */
	public static final String $dpt_lvl_nm = "dpt_lvl_nm";
	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public static final String $aprv_role_cd = "aprv_role_cd";
	/**
	 * Standard approval role name 標準承認役割名.<p>
	 *
	 */
	public static final String $aprv_role_nm = "aprv_role_nm";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	/**
	 * Standard Country name 標準国名.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public static final String $area_cd = "area_cd";
	/**
	 * Standard Region name 標準地域名.<p>
	 *
	 */
	public static final String $area_nm = "area_nm";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Standard currency name 標準通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public static final String $upri_dec_place = "upri_dec_place";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Standard unit name 標準単位名.<p>
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
	public static final String $unit_rnd_typ = "unit_rnd_typ";
	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public static final String $bank_cd = "bank_cd";
	/**
	 * Standard bank name 標準銀行名.<p>
	 *
	 */
	public static final String $bank_nm = "bank_nm";
	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public static final String $bank_cal_cd = "bank_cal_cd";
	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public static final String $bank_branch_bank_cd = "bank_branch_bank_cd";
	/**
	 * Bank branch cd. 銀行支店ＣＤ.<p>
	 *
	 */
	public static final String $branch_cd = "branch_cd";
	/**
	 * Standard bank branch name 標準銀行支店名.<p>
	 *
	 */
	public static final String $branch_nm = "branch_nm";
	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public static final String $bank_branch_cal_cd = "bank_branch_cal_cd";
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	/**
	 * Standard account name 標準口座名.<p>
	 *
	 */
	public static final String $bank_ac_nm = "bank_ac_nm";
	/**
	 * External 社外.<p>
	 *
	 */
	public static final String $ext_flg = "ext_flg";
	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_bank_cd = "bank_ac_bank_cd";
	/**
	 * Bank branch cd. 銀行支店ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_branch_cd = "bank_ac_branch_cd";
	/**
	 * Bank account number 口座番号.<p>
	 *
	 */
	public static final String $bank_ac_no = "bank_ac_no";
	/**
	 * Bank account type 口座区分.<p>
	 *
	 */
	public static final String $bank_ac_typ = "bank_ac_typ";
	/**
	 * Bank account holder 口座名義.<p>
	 *
	 */
	public static final String $bank_ac_holder = "bank_ac_holder";
	/**
	 * Account holder alias name 口座名義別名.<p>
	 *
	 */
	public static final String $bank_ac_holder_sub = "bank_ac_holder_sub";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 * Standard exchange rate name 標準為替レート名.<p>
	 *
	 */
	public static final String $xrate_nm = "xrate_nm";
	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public static final String $cal_cd = "cal_cd";
	/**
	 * Standard calendar name 標準カレンダ名.<p>
	 *
	 */
	public static final String $cal_nm = "cal_nm";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Standard Item journal name 標準品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public static final String $ap_typ = "ap_typ";
	/**
	 * Accounting item classification cd. 会計品目分類ＣＤ.<p>
	 *
	 */
	public static final String $ac_itm_grp_cd = "ac_itm_grp_cd";
	/**
	 * Standard Accounting item classification name 標準会計品目分類名.<p>
	 *
	 */
	public static final String $ac_itm_grp_nm = "ac_itm_grp_nm";
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	/**
	 * Standard Accounting reason name 標準会計理由名.<p>
	 *
	 */
	public static final String $ac_rsn_nm = "ac_rsn_nm";
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public static final String $ac_rsn_ar_typ = "ac_rsn_ar_typ";
	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public static final String $ac_rsn_ap_typ = "ac_rsn_ap_typ";
	/**
	 * Not for journal 仕訳対象外.<p>
	 *
	 */
	public static final String $ac_invalid_flg = "ac_invalid_flg";
	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public static final String $cost_invalid_flg = "cost_invalid_flg";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Standard factory/distribution warehouse name 標準工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	/**
	 * Receipt 入荷.<p>
	 *
	 */
	public static final String $arr_flg = "arr_flg";
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public static final String $zip_cd = "zip_cd";
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public static final String $addr1 = "addr1";
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public static final String $addr2 = "addr2";
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public static final String $addr3 = "addr3";
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public static final String $addr4 = "addr4";
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public static final String $tel = "tel";
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public static final String $fax = "fax";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $def_loc_grp_cd = "def_loc_grp_cd";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $def_alloc_grp_cd = "def_alloc_grp_cd";
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $def_lg_grp_cd = "def_lg_grp_cd";
	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public static final String $def_cal_cd = "def_cal_cd";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Standard mfg. location group name 標準製造場所グループ名.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_wg_cd = "loc_grp_wg_cd";
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Standard distribution group name 標準物流グループ名.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	/**
	 * Set location 場所設定.<p>
	 *
	 */
	public static final String $loc_flg = "loc_flg";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_wg_cd = "lg_grp_wg_cd";
	/**
	 * Issue shipping slip 出荷伝票発行.<p>
	 *
	 */
	public static final String $ship_slip_flg = "ship_slip_flg";
	/**
	 * Issue picking list ピッキングリスト発行.<p>
	 *
	 */
	public static final String $pick_list_flg = "pick_list_flg";
	/**
	 * Shipping order sheet issue 出荷指図書発行.<p>
	 *
	 */
	public static final String $ship_inst_flg = "ship_inst_flg";
	/**
	 * Issue shipping slip (Result) 出荷伝票発行（実績）.<p>
	 *
	 */
	public static final String $ship_slip_act_flg = "ship_slip_act_flg";
	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cal_cd = "lg_grp_cal_cd";
	/**
	 * Warehousing business cd. 倉庫事業者ＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_site_co_cd = "lg_grp_site_co_cd";
	/**
	 * Check negative inventory at GI 出庫時マイナス在庫確認.<p>
	 *
	 */
	public static final String $gi_minus_stk_chk_flg = "gi_minus_stk_chk_flg";
	/**
	 * Precede shipping location 出荷場所優先.<p>
	 *
	 */
	public static final String $ship_loc_prio_flg = "ship_loc_prio_flg";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Standard gross allocation location group name 標準総量引当場所グループ名.<p>
	 *
	 */
	public static final String $alloc_grp_nm = "alloc_grp_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Standard WG name 標準ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Sales 販売.<p>
	 *
	 */
	public static final String $sls_flg = "sls_flg";
	/**
	 * Distribution 物流.<p>
	 *
	 */
	public static final String $lg_flg = "lg_flg";
	/**
	 * Mfg. 製造.<p>
	 *
	 */
	public static final String $mfg_flg = "mfg_flg";
	/**
	 * Purchase 購買.<p>
	 *
	 */
	public static final String $purc_flg = "purc_flg";
	/**
	 * AR 債権.<p>
	 *
	 */
	public static final String $ar_flg = "ar_flg";
	/**
	 * AP 債務.<p>
	 *
	 */
	public static final String $ap_flg = "ap_flg";
	/**
	 * Demand and supply management 需給.<p>
	 *
	 */
	public static final String $sd_flg = "sd_flg";
	/**
	 * Prefix for MRP numbering ＭＲＰ発番用接頭語.<p>
	 *
	 */
	public static final String $mrp_prefix = "mrp_prefix";
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	/**
	 * MRP process type ＭＲＰ処理区分.<p>
	 *
	 */
	public static final String $mrp_proc_typ = "mrp_proc_typ";
	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public static final String $alloc_margin_days = "alloc_margin_days";
	/**
	 * Not for movement/transport allocation 移動・移送引当対象外.<p>
	 *
	 */
	public static final String $not_xfr_flg = "not_xfr_flg";
	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public static final String $mrp_alloc_margin_days = "mrp_alloc_margin_days";
	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public static final String $mrp_opn_xfr_days = "mrp_opn_xfr_days";
	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public static final String $rqmt_typ = "rqmt_typ";
	/**
	 * Production planning type 生産計画立案区分.<p>
	 *
	 */
	public static final String $prod_pln_typ = "prod_pln_typ";
	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public static final String $dmnd_date_div_mons = "dmnd_date_div_mons";
	/**
	 * PLM ＰＬＭ.<p>
	 *
	 */
	public static final String $plm_flg = "plm_flg";
	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public static final String $calc_seq = "calc_seq";
	/**
	 * Common unit price 共通単価.<p>
	 *
	 */
	public static final String $cmn_upri_flg = "cmn_upri_flg";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Standard operation name 標準工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * Operation allocation group 工程配賦グループ.<p>
	 *
	 */
	public static final String $oper_alc_grp = "oper_alc_grp";
	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public static final String $wk_cost_cd = "wk_cost_cd";
	/**
	 * Standard work element name 標準工数管理名.<p>
	 *
	 */
	public static final String $wk_cost_nm = "wk_cost_nm";
	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public static final String $wk_cost_unit_nm = "wk_cost_unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $wk_cost_dec_place = "wk_cost_dec_place";
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public static final String $rnd_typ = "rnd_typ";
	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public static final String $wk_rsn_cd = "wk_rsn_cd";
	/**
	 * Standard man-hour reason name 標準工数理由名.<p>
	 *
	 */
	public static final String $wk_rsn_nm = "wk_rsn_nm";
	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public static final String $sls_upri_grp_cd = "sls_upri_grp_cd";
	/**
	 * Standard sales unit price classification name 標準販売単価分類名.<p>
	 *
	 */
	public static final String $sls_upri_grp_nm = "sls_upri_grp_nm";
	/**
	 * Sales unit price rank cd. 販売単価ランクＣＤ.<p>
	 *
	 */
	public static final String $sls_upri_rank_cd = "sls_upri_rank_cd";
	/**
	 * Standard sales unit price rank name 標準販売単価ランク名.<p>
	 *
	 */
	public static final String $sls_upri_rank_nm = "sls_upri_rank_nm";
	/**
	 * Offset group cd. 相殺グループＣＤ.<p>
	 *
	 */
	public static final String $setoff_grp_cd = "setoff_grp_cd";
	/**
	 * Standard offset group name 標準相殺グループ名.<p>
	 *
	 */
	public static final String $setoff_grp_nm = "setoff_grp_nm";
	/**
	 * Shipping expiration date group cd. 出荷有効期限グループＣＤ.<p>
	 *
	 */
	public static final String $ship_valid_grp_cd = "ship_valid_grp_cd";
	/**
	 * Standard shipping expiration date group name 標準出荷有効期限グループ名.<p>
	 *
	 */
	public static final String $ship_valid_grp_nm = "ship_valid_grp_nm";
	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public static final String $itm_ship_grp_cd = "itm_ship_grp_cd";
	/**
	 * Standard item shipping group name 標準品目出荷グループ名.<p>
	 *
	 */
	public static final String $itm_ship_grp_nm = "itm_ship_grp_nm";
	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public static final String $trnspt_cd = "trnspt_cd";
	/**
	 * Standard transportation method name 標準輸送方法名.<p>
	 *
	 */
	public static final String $trnspt_nm = "trnspt_nm";
	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public static final String $trnspt_sort_seq = "trnspt_sort_seq";
	/**
	 * Packing container cd. 梱包容器ＣＤ.<p>
	 *
	 */
	public static final String $cntnr_cd = "cntnr_cd";
	/**
	 * Standard packing container name 標準梱包容器名.<p>
	 *
	 */
	public static final String $cntnr_nm = "cntnr_nm";
	/**
	 * Weight 重量.<p>
	 *
	 */
	public static final String $wt = "wt";
	/**
	 * Harbor cd. 港ＣＤ.<p>
	 *
	 */
	public static final String $port_cd = "port_cd";
	/**
	 * Standard port name 標準港名.<p>
	 *
	 */
	public static final String $port_nm = "port_nm";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $port_cntry_cd = "port_cntry_cd";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Standard grading name 標準格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 * Sales order 受注.<p>
	 *
	 */
	public static final String $slo_flg = "slo_flg";
	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public static final String $sort_seq = "sort_seq";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Standard transaction name 標準取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public static final String $trd_ac_rsn_cd = "trd_ac_rsn_cd";
	/**
	 * Lot details split type ロット明細分割区分.<p>
	 *
	 */
	public static final String $slip_each_lot_typ = "slip_each_lot_typ";
	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public static final String $trd_slip_form_cd = "trd_slip_form_cd";
	/**
	 * Adopt at auto 自動時採用.<p>
	 *
	 */
	public static final String $auto_adopt_flg = "auto_adopt_flg";
	/**
	 * Sales slip not to be exported flg. 売上伝票送信対象外ＦＬＧ.<p>
	 *
	 */
	public static final String $not_sls_slip_snd_flg = "not_sls_slip_snd_flg";
	/**
	 * Purchase slip not to be exported flg. 仕入伝票送信対象外ＦＬＧ.<p>
	 *
	 */
	public static final String $not_purc_slip_snd_flg = "not_purc_slip_snd_flg";
	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public static final String $slip_form_cd = "slip_form_cd";
	/**
	 * Standard slip report name 標準伝票帳票名.<p>
	 *
	 */
	public static final String $slip_form_nm = "slip_form_nm";
	/**
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public static final String $slip_form_id = "slip_form_id";
	/**
	 * Refrain slip ID 控帳票ＩＤ.<p>
	 *
	 */
	public static final String $copy_slip_form_id = "copy_slip_form_id";
	/**
	 * Number of rows 行数.<p>
	 *
	 */
	public static final String $line_num = "line_num";
	/**
	 * Purchase forecast group cd. 購買内示グループＣＤ.<p>
	 *
	 */
	public static final String $pf_grp_cd = "pf_grp_cd";
	/**
	 * Standard purchase forecast group name 標準購買内示グループ名.<p>
	 *
	 */
	public static final String $pf_grp_nm = "pf_grp_nm";
	/**
	 * Weekly forecast period 週次内示期間.<p>
	 *
	 */
	public static final String $weekly_period_num = "weekly_period_num";
	/**
	 * Weekly start position 週次開始位置.<p>
	 *
	 */
	public static final String $weekly_period_st = "weekly_period_st";
	/**
	 * By 10 days forecast period 旬次内示期間.<p>
	 *
	 */
	public static final String $tendays_period_num = "tendays_period_num";
	/**
	 * By 10 days starting position 旬次開始位置.<p>
	 *
	 */
	public static final String $tendays_period_st = "tendays_period_st";
	/**
	 * Monthly forecast period 月次内示期間.<p>
	 *
	 */
	public static final String $monthly_period_num = "monthly_period_num";
	/**
	 * Monthly starting position 月次開始位置.<p>
	 *
	 */
	public static final String $monthly_period_st = "monthly_period_st";
	/**
	 * Firm period 確定期間.<p>
	 *
	 */
	public static final String $fix_period_num = "fix_period_num";
	/**
	 * Item specification classification cd. 品目仕様分類ＣＤ.<p>
	 *
	 */
	public static final String $itm_spec_grp_cd = "itm_spec_grp_cd";
	/**
	 * Standard item specification classification name 標準品目仕様分類名.<p>
	 *
	 */
	public static final String $itm_spec_grp_nm = "itm_spec_grp_nm";
	/**
	 * Item configuration group cd. 品目構成グループＣＤ.<p>
	 *
	 */
	public static final String $itm_comp_grp_cd = "itm_comp_grp_cd";
	/**
	 * Standard item structure group name 標準品目構成グループ名.<p>
	 *
	 */
	public static final String $itm_comp_grp_nm = "itm_comp_grp_nm";
	/**
	 * Multiple choice 複数選択可.<p>
	 *
	 */
	public static final String $multi_sel_flg = "multi_sel_flg";
	/**
	 * Required 必須.<p>
	 *
	 */
	public static final String $req_flg = "req_flg";
	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public static final String $jnl_act_cd = "jnl_act_cd";
	/**
	 * Standard journal execute name 標準仕訳実行名.<p>
	 *
	 */
	public static final String $jnl_act_nm = "jnl_act_nm";
	/**
	 * Journal deleted 仕訳削除.<p>
	 *
	 */
	public static final String $jnl_del_flg = "jnl_del_flg";
	/**
	 * Journal group cd. 仕訳グループＣＤ.<p>
	 *
	 */
	public static final String $jnl_grp_cd = "jnl_grp_cd";
	/**
	 * Standard journal group name 標準仕訳グループ名.<p>
	 *
	 */
	public static final String $jnl_grp_nm = "jnl_grp_nm";
	/**
	 * Import bank account type setting master 1 口座科目設定マスタ取込１.<p>
	 *
	 */
	public static final String $ac_bank_flg1 = "ac_bank_flg1";
	/**
	 * Bank account type setting master import 2 口座科目設定マスタ取込２.<p>
	 *
	 */
	public static final String $ac_bank_flg2 = "ac_bank_flg2";
	/**
	 * Journal pattern cd. 仕訳パタンＣＤ.<p>
	 *
	 */
	public static final String $jnl_ptn_cd = "jnl_ptn_cd";
	/**
	 * Standard journal pattern name 標準仕訳パタン名.<p>
	 *
	 */
	public static final String $jnl_ptn_nm = "jnl_ptn_nm";
	/**
	 * Auto-journal key cd. 自動仕訳キーＣＤ.<p>
	 *
	 */
	public static final String $auto_jnl_key_cd = "auto_jnl_key_cd";
	/**
	 * Standard auto-journal key name 標準自動仕訳キー名.<p>
	 *
	 */
	public static final String $auto_jnl_key_nm = "auto_jnl_key_nm";
	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public static final String $insp_ptn_cd = "insp_ptn_cd";
	/**
	 * Standard inspection pattern name 標準検査パタン名.<p>
	 *
	 */
	public static final String $insp_ptn_nm = "insp_ptn_nm";
	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public static final String $wk_day_cd = "wk_day_cd";
	/**
	 * Standard work classification name 標準勤務種類名.<p>
	 *
	 */
	public static final String $wk_day_nm = "wk_day_nm";
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Standard shipping conditions name 標準出荷条件名.<p>
	 *
	 */
	public static final String $ship_term_nm = "ship_term_nm";
	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public static final String $ship_wk_cd = "ship_wk_cd";
	/**
	 * Standard shipping operation name 標準出荷作業名.<p>
	 *
	 */
	public static final String $ship_wk_nm = "ship_wk_nm";
	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public static final String $ship_wk_cal_cd = "ship_wk_cal_cd";
	/**
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public static final String $rsrc_cd = "rsrc_cd";
	/**
	 * Standard resource name 標準資源名.<p>
	 *
	 */
	public static final String $rsrc_nm = "rsrc_nm";
	/**
	 * Resource unit name 資源単位名.<p>
	 *
	 */
	public static final String $rsrc_unit_nm = "rsrc_unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $rsrc_dec_place = "rsrc_dec_place";
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public static final String $rsrc_rnd_typ = "rsrc_rnd_typ";
	/**
	 * HS classification cd. ＨＳ分類ＣＤ.<p>
	 *
	 */
	public static final String $hs_grp_cd = "hs_grp_cd";
	/**
	 * Standard HS classification name 標準ＨＳ分類名.<p>
	 *
	 */
	public static final String $hs_grp_nm = "hs_grp_nm";
	/**
	 * HS type ＨＳ区分.<p>
	 *
	 */
	public static final String $hs_typ = "hs_typ";
	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public static final String $alc_ptn_cd = "alc_ptn_cd";
	/**
	 * Standard allocation pattern name 標準配賦パタン名.<p>
	 *
	 */
	public static final String $alc_ptn_nm = "alc_ptn_nm";
	/**
	 * Item category group cd. 品群グループＣＤ.<p>
	 *
	 */
	public static final String $ctg_grp_cd = "ctg_grp_cd";
	/**
	 * Standard item category group name 標準品群グループ名.<p>
	 *
	 */
	public static final String $ctg_grp_nm = "ctg_grp_nm";
	/**
	 * Calculation run pattern cd. 計算実行パタンＣＤ.<p>
	 *
	 */
	public static final String $act_ptn_cd = "act_ptn_cd";
	/**
	 * Standard calculation run pattern name 標準計算実行パタン名.<p>
	 *
	 */
	public static final String $act_ptn_nm = "act_ptn_nm";
	/**
	 * General purpose allocation classification cd. 汎用配賦分類ＣＤ.<p>
	 *
	 */
	public static final String $gp_alc_cd = "gp_alc_cd";
	/**
	 * Standard general purpose allocation classification name 標準汎用配賦分類名.<p>
	 *
	 */
	public static final String $gp_alc_nm = "gp_alc_nm";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	/**
	 * Standard calculation category name 標準計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm = "calc_ctg_nm";
	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public static final String $rpt_ptn_cd = "rpt_ptn_cd";
	/**
	 * Standard Report pattern name 標準レポートパタン名.<p>
	 *
	 */
	public static final String $rpt_ptn_nm = "rpt_ptn_nm";
	/**
	 * Menu cd. メニューＣＤ.<p>
	 *
	 */
	public static final String $menu_cd = "menu_cd";
	/**
	 * Standard Menu name 標準メニュー名.<p>
	 *
	 */
	public static final String $menu_nm = "menu_nm";
	/**
	 * Warehousing business cd. 倉庫事業者ＣＤ.<p>
	 *
	 */
	public static final String $site_co_cd = "site_co_cd";
	/**
	 * Standard warehousing business name 標準倉庫事業者名.<p>
	 *
	 */
	public static final String $site_co_nm = "site_co_nm";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta da_cd_META = createCommonMeta($da_cd, mcframe.commonMA.meta.MA_META.DA_CD);
	public static final MCMeta da_nm_META = createCommonMeta($da_nm, mcframe.commonMA.meta.MA_META.DA_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta def_dpt_nm_META = createCommonMeta($def_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt_lvl_cd_META = createCommonMeta($dpt_lvl_cd, mcframe.commonMA.meta.MA_META.DPT_LVL_CD);
	public static final MCMeta dpt_lvl_nm_META = createCommonMeta($dpt_lvl_nm, mcframe.commonMA.meta.MA_META.DPT_LVL_NM);
	public static final MCMeta aprv_role_cd_META = createCommonMeta($aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_nm_META = createCommonMeta($aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta area_cd_META = createCommonMeta($area_cd, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta area_nm_META = createCommonMeta($area_nm, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta upri_dec_place_META = createCommonMeta($upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta unit_rnd_typ_META = createCommonMeta($unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta bank_cd_META = createCommonMeta($bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta bank_nm_META = createCommonMeta($bank_nm, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta bank_cal_cd_META = createCommonMeta($bank_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta bank_branch_bank_cd_META = createCommonMeta($bank_branch_bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta branch_cd_META = createCommonMeta($branch_cd, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta branch_nm_META = createCommonMeta($branch_nm, mcframe.commonMA.meta.MA_META.BANK_BRANCH_NM);
	public static final MCMeta bank_branch_cal_cd_META = createCommonMeta($bank_branch_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta bank_ac_nm_META = createCommonMeta($bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta ext_flg_META = createCommonMeta($ext_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bank_ac_bank_cd_META = createCommonMeta($bank_ac_bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta bank_ac_branch_cd_META = createCommonMeta($bank_ac_branch_cd, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta bank_ac_no_META = createCommonMeta($bank_ac_no, mcframe.commonMA.meta.MA_META.BANK_AC_NO);
	public static final MCMeta bank_ac_typ_META = createCommonMeta($bank_ac_typ, mcframe.commonMA.meta.MA_META.BANK_AC_TYP);
	public static final MCMeta bank_ac_holder_META = createCommonMeta($bank_ac_holder, mcframe.commonMA.meta.MA_META.BANK_AC_HOLDER);
	public static final MCMeta bank_ac_holder_sub_META = createCommonMeta($bank_ac_holder_sub, mcframe.commonMA.meta.MA_META.BANK_AC_HOLDER_SUB);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_nm_META = createCommonMeta($xrate_nm, mcframe.commonMA.meta.MA_META.XRATE_NM);
	public static final MCMeta cal_cd_META = createCommonMeta($cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta cal_nm_META = createCommonMeta($cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta ap_typ_META = createCommonMeta($ap_typ, mcframe.commonMA.meta.MA_META.AP_TYP);
	public static final MCMeta ac_itm_grp_cd_META = createCommonMeta($ac_itm_grp_cd, mcframe.commonMA.meta.MA_META.AC_ITM_GRP_CD);
	public static final MCMeta ac_itm_grp_nm_META = createCommonMeta($ac_itm_grp_nm, mcframe.commonMA.meta.MA_META.AC_ITM_GRP_NM);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta ac_rsn_ar_typ_META = createCommonMeta($ac_rsn_ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta ac_rsn_ap_typ_META = createCommonMeta($ac_rsn_ap_typ, mcframe.commonMA.meta.MA_META.AP_TYP);
	public static final MCMeta ac_invalid_flg_META = createCommonMeta($ac_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cost_invalid_flg_META = createCommonMeta($cost_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta arr_flg_META = createCommonMeta($arr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta tel_META = createCommonMeta($tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta fax_META = createCommonMeta($fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta def_loc_grp_cd_META = createCommonMeta($def_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta def_alloc_grp_cd_META = createCommonMeta($def_alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta def_lg_grp_cd_META = createCommonMeta($def_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta def_cal_cd_META = createCommonMeta($def_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta loc_grp_wg_cd_META = createCommonMeta($loc_grp_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta loc_flg_META = createCommonMeta($loc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lg_grp_wg_cd_META = createCommonMeta($lg_grp_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ship_slip_flg_META = createCommonMeta($ship_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pick_list_flg_META = createCommonMeta($pick_list_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_inst_flg_META = createCommonMeta($ship_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_slip_act_flg_META = createCommonMeta($ship_slip_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lg_grp_cal_cd_META = createCommonMeta($lg_grp_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta lg_grp_site_co_cd_META = createCommonMeta($lg_grp_site_co_cd, mcframe.commonMA.meta.MA_META.SITE_CO_CD);
	public static final MCMeta gi_minus_stk_chk_flg_META = createCommonMeta($gi_minus_stk_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_loc_prio_flg_META = createCommonMeta($ship_loc_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lg_flg_META = createCommonMeta($lg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_flg_META = createCommonMeta($mfg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_flg_META = createCommonMeta($ar_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_flg_META = createCommonMeta($ap_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sd_flg_META = createCommonMeta($sd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrp_prefix_META = createCommonMeta($mrp_prefix, mcframe.commonMA.meta.MA_META.MRP_PREFIX);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta mrp_proc_typ_META = createCommonMeta($mrp_proc_typ, mcframe.commonMA.meta.MA_META.MRP_PROC_TYP);
	public static final MCMeta alloc_margin_days_META = createCommonMeta($alloc_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta not_xfr_flg_META = createCommonMeta($not_xfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrp_alloc_margin_days_META = createCommonMeta($mrp_alloc_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta mrp_opn_xfr_days_META = createCommonMeta($mrp_opn_xfr_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta rqmt_typ_META = createCommonMeta($rqmt_typ, mcframe.commonMA.meta.MA_META.RQMT_TYP);
	public static final MCMeta prod_pln_typ_META = createCommonMeta($prod_pln_typ, mcframe.commonMA.meta.MA_META.PROD_PLN_TYP);
	public static final MCMeta dmnd_date_div_mons_META = createCommonMeta($dmnd_date_div_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta plm_flg_META = createCommonMeta($plm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_seq_META = createCommonMeta($calc_seq, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta cmn_upri_flg_META = createCommonMeta($cmn_upri_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_alc_grp_META = createCommonMeta($oper_alc_grp, mcframe.commonMA.meta.MA_META.OPER_ALC_GRP);
	public static final MCMeta wk_cost_cd_META = createCommonMeta($wk_cost_cd, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta wk_cost_nm_META = createCommonMeta($wk_cost_nm, mcframe.commonMA.meta.MA_META.WK_COST_NM);
	public static final MCMeta wk_cost_unit_nm_META = createCommonMeta($wk_cost_unit_nm, mcframe.commonMA.meta.MA_META.WK_COST_UNIT_NM);
	public static final MCMeta wk_cost_dec_place_META = createCommonMeta($wk_cost_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rnd_typ_META = createCommonMeta($rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta wk_rsn_cd_META = createCommonMeta($wk_rsn_cd, mcframe.commonMA.meta.MA_META.WK_RSN_CD);
	public static final MCMeta wk_rsn_nm_META = createCommonMeta($wk_rsn_nm, mcframe.commonMA.meta.MA_META.WK_RSN_NM);
	public static final MCMeta sls_upri_grp_cd_META = createCommonMeta($sls_upri_grp_cd, mcframe.commonMA.meta.MA_META.SLS_UPRI_GRP_CD);
	public static final MCMeta sls_upri_grp_nm_META = createCommonMeta($sls_upri_grp_nm, mcframe.commonMA.meta.MA_META.SLS_UPRI_GRP_NM);
	public static final MCMeta sls_upri_rank_cd_META = createCommonMeta($sls_upri_rank_cd, mcframe.commonMA.meta.MA_META.SLS_UPRI_RANK_CD);
	public static final MCMeta sls_upri_rank_nm_META = createCommonMeta($sls_upri_rank_nm, mcframe.commonMA.meta.MA_META.SLS_UPRI_RANK_NM);
	public static final MCMeta setoff_grp_cd_META = createCommonMeta($setoff_grp_cd, mcframe.commonMA.meta.MA_META.SETOFF_GRP_CD);
	public static final MCMeta setoff_grp_nm_META = createCommonMeta($setoff_grp_nm, mcframe.commonMA.meta.MA_META.SETOFF_GRP_NM);
	public static final MCMeta ship_valid_grp_cd_META = createCommonMeta($ship_valid_grp_cd, mcframe.commonMA.meta.MA_META.SHIP_VALID_GRP_CD);
	public static final MCMeta ship_valid_grp_nm_META = createCommonMeta($ship_valid_grp_nm, mcframe.commonMA.meta.MA_META.SHIP_VALID_GRP_NM);
	public static final MCMeta itm_ship_grp_cd_META = createCommonMeta($itm_ship_grp_cd, mcframe.commonMA.meta.MA_META.ITM_SHIP_GRP_CD);
	public static final MCMeta itm_ship_grp_nm_META = createCommonMeta($itm_ship_grp_nm, mcframe.commonMA.meta.MA_META.ITM_SHIP_GRP_NM);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.TRNSPT_CD);
	public static final MCMeta trnspt_nm_META = createCommonMeta($trnspt_nm, mcframe.commonMA.meta.MA_META.TRNSPT_NM);
	public static final MCMeta trnspt_sort_seq_META = createCommonMeta($trnspt_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta cntnr_cd_META = createCommonMeta($cntnr_cd, mcframe.commonMA.meta.MA_META.CNTNR_CD);
	public static final MCMeta cntnr_nm_META = createCommonMeta($cntnr_nm, mcframe.commonMA.meta.MA_META.CNTNR_NM);
	public static final MCMeta wt_META = createCommonMeta($wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta port_cd_META = createCommonMeta($port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta port_nm_META = createCommonMeta($port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta port_cntry_cd_META = createCommonMeta($port_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta slo_flg_META = createCommonMeta($slo_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sort_seq_META = createCommonMeta($sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta trd_ac_rsn_cd_META = createCommonMeta($trd_ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta slip_each_lot_typ_META = createCommonMeta($slip_each_lot_typ, mcframe.commonMA.meta.MA_META.SLIP_EACH_LOT_TYP);
	public static final MCMeta trd_slip_form_cd_META = createCommonMeta($trd_slip_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta auto_adopt_flg_META = createCommonMeta($auto_adopt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sls_slip_snd_flg_META = createCommonMeta($not_sls_slip_snd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_purc_slip_snd_flg_META = createCommonMeta($not_purc_slip_snd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slip_form_cd_META = createCommonMeta($slip_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta slip_form_nm_META = createCommonMeta($slip_form_nm, mcframe.commonMA.meta.MA_META.SLIP_FORM_NM);
	public static final MCMeta slip_form_id_META = createCommonMeta($slip_form_id, mcframe.commonMA.meta.MA_META.SLIP_FORM_ID);
	public static final MCMeta copy_slip_form_id_META = createCommonMeta($copy_slip_form_id, mcframe.commonMA.meta.MA_META.SLIP_FORM_ID);
	public static final MCMeta line_num_META = createCommonMeta($line_num, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta pf_grp_cd_META = createCommonMeta($pf_grp_cd, mcframe.commonMA.meta.MA_META.PF_GRP_CD);
	public static final MCMeta pf_grp_nm_META = createCommonMeta($pf_grp_nm, mcframe.commonMA.meta.MA_META.PF_GRP_NM);
	public static final MCMeta weekly_period_num_META = createCommonMeta($weekly_period_num, mcframe.commonMA.meta.MA_META.PF_PERIOD);
	public static final MCMeta weekly_period_st_META = createCommonMeta($weekly_period_st, mcframe.commonMA.meta.MA_META.PF_PERIOD);
	public static final MCMeta tendays_period_num_META = createCommonMeta($tendays_period_num, mcframe.commonMA.meta.MA_META.PF_PERIOD);
	public static final MCMeta tendays_period_st_META = createCommonMeta($tendays_period_st, mcframe.commonMA.meta.MA_META.PF_PERIOD);
	public static final MCMeta monthly_period_num_META = createCommonMeta($monthly_period_num, mcframe.commonMA.meta.MA_META.PF_PERIOD);
	public static final MCMeta monthly_period_st_META = createCommonMeta($monthly_period_st, mcframe.commonMA.meta.MA_META.PF_PERIOD);
	public static final MCMeta fix_period_num_META = createCommonMeta($fix_period_num, mcframe.commonMA.meta.MA_META.PF_PERIOD);
	public static final MCMeta itm_spec_grp_cd_META = createCommonMeta($itm_spec_grp_cd, mcframe.commonMA.meta.MA_META.ITM_SPEC_GRP_CD);
	public static final MCMeta itm_spec_grp_nm_META = createCommonMeta($itm_spec_grp_nm, mcframe.commonMA.meta.MA_META.ITM_SPEC_GRP_NM);
	public static final MCMeta itm_comp_grp_cd_META = createCommonMeta($itm_comp_grp_cd, mcframe.commonMA.meta.MA_META.ITM_COMP_GRP_CD);
	public static final MCMeta itm_comp_grp_nm_META = createCommonMeta($itm_comp_grp_nm, mcframe.commonMA.meta.MA_META.ITM_COMP_GRP_NM);
	public static final MCMeta multi_sel_flg_META = createCommonMeta($multi_sel_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta req_flg_META = createCommonMeta($req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta jnl_act_cd_META = createCommonMeta($jnl_act_cd, mcframe.commonMA.meta.MA_META.JNL_ACT_CD);
	public static final MCMeta jnl_act_nm_META = createCommonMeta($jnl_act_nm, mcframe.commonMA.meta.MA_META.JNL_ACT_NM);
	public static final MCMeta jnl_del_flg_META = createCommonMeta($jnl_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta jnl_grp_cd_META = createCommonMeta($jnl_grp_cd, mcframe.commonMA.meta.MA_META.JNL_GRP_CD);
	public static final MCMeta jnl_grp_nm_META = createCommonMeta($jnl_grp_nm, mcframe.commonMA.meta.MA_META.JNL_GRP_NM);
	public static final MCMeta ac_bank_flg1_META = createCommonMeta($ac_bank_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_bank_flg2_META = createCommonMeta($ac_bank_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta jnl_ptn_cd_META = createCommonMeta($jnl_ptn_cd, mcframe.commonMA.meta.MA_META.JNL_PTN_CD);
	public static final MCMeta jnl_ptn_nm_META = createCommonMeta($jnl_ptn_nm, mcframe.commonMA.meta.MA_META.JNL_PTN_NM);
	public static final MCMeta auto_jnl_key_cd_META = createCommonMeta($auto_jnl_key_cd, mcframe.commonMA.meta.MA_META.AUTO_JNL_KEY_CD);
	public static final MCMeta auto_jnl_key_nm_META = createCommonMeta($auto_jnl_key_nm, mcframe.commonMA.meta.MA_META.AUTO_JNL_KEY_NM);
	public static final MCMeta insp_ptn_cd_META = createCommonMeta($insp_ptn_cd, mcframe.commonMA.meta.MA_META.INSP_PTN_CD);
	public static final MCMeta insp_ptn_nm_META = createCommonMeta($insp_ptn_nm, mcframe.commonMA.meta.MA_META.INSP_PTN_NM);
	public static final MCMeta wk_day_cd_META = createCommonMeta($wk_day_cd, mcframe.commonMA.meta.MA_META.WK_DAY_CD);
	public static final MCMeta wk_day_nm_META = createCommonMeta($wk_day_nm, mcframe.commonMA.meta.MA_META.WK_DAY_NM);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ship_term_nm_META = createCommonMeta($ship_term_nm, mcframe.commonMA.meta.MA_META.SHIP_TERM_NM);
	public static final MCMeta ship_wk_cd_META = createCommonMeta($ship_wk_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_CD);
	public static final MCMeta ship_wk_nm_META = createCommonMeta($ship_wk_nm, mcframe.commonMA.meta.MA_META.SHIP_WK_NM);
	public static final MCMeta ship_wk_cal_cd_META = createCommonMeta($ship_wk_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta rsrc_cd_META = createCommonMeta($rsrc_cd, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta rsrc_nm_META = createCommonMeta($rsrc_nm, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_unit_nm_META = createCommonMeta($rsrc_unit_nm, mcframe.commonMA.meta.MA_META.RSRC_UNIT_NM);
	public static final MCMeta rsrc_dec_place_META = createCommonMeta($rsrc_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rsrc_rnd_typ_META = createCommonMeta($rsrc_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta hs_grp_cd_META = createCommonMeta($hs_grp_cd, mcframe.commonMA.meta.MA_META.HS_GRP_CD);
	public static final MCMeta hs_grp_nm_META = createCommonMeta($hs_grp_nm, mcframe.commonMA.meta.MA_META.HS_GRP_NM);
	public static final MCMeta hs_typ_META = createCommonMeta($hs_typ, mcframe.commonMA.meta.MA_META.HS_TYP);
	public static final MCMeta alc_ptn_cd_META = createCommonMeta($alc_ptn_cd, mcframe.commonMA.meta.MA_META.ALC_PTN_CD);
	public static final MCMeta alc_ptn_nm_META = createCommonMeta($alc_ptn_nm, mcframe.commonMA.meta.MA_META.ALC_PTN_NM);
	public static final MCMeta ctg_grp_cd_META = createCommonMeta($ctg_grp_cd, mcframe.commonMA.meta.MA_META.CTG_GRP_CD);
	public static final MCMeta ctg_grp_nm_META = createCommonMeta($ctg_grp_nm, mcframe.commonMA.meta.MA_META.CTG_GRP_NM);
	public static final MCMeta act_ptn_cd_META = createCommonMeta($act_ptn_cd, mcframe.commonMA.meta.MA_META.ACT_PTN_CD);
	public static final MCMeta act_ptn_nm_META = createCommonMeta($act_ptn_nm, mcframe.commonMA.meta.MA_META.ACT_PTN_NM);
	public static final MCMeta gp_alc_cd_META = createCommonMeta($gp_alc_cd, mcframe.commonMA.meta.MA_META.GP_ALC_CD);
	public static final MCMeta gp_alc_nm_META = createCommonMeta($gp_alc_nm, mcframe.commonMA.meta.MA_META.GP_ALC_NM);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta rpt_ptn_cd_META = createCommonMeta($rpt_ptn_cd, mcframe.commonMA.meta.MA_META.RPT_PTN_CD);
	public static final MCMeta rpt_ptn_nm_META = createCommonMeta($rpt_ptn_nm, mcframe.commonMA.meta.MA_META.RPT_PTN_NM);
	public static final MCMeta menu_cd_META = createCommonMeta($menu_cd, mcframe.commonMA.meta.MA_META.MENU_CD);
	public static final MCMeta menu_nm_META = createCommonMeta($menu_nm, mcframe.commonMA.meta.MA_META.MENU_NM);
	public static final MCMeta site_co_cd_META = createCommonMeta($site_co_cd, mcframe.commonMA.meta.MA_META.SITE_CO_CD);
	public static final MCMeta site_co_nm_META = createCommonMeta($site_co_nm, mcframe.commonMA.meta.MA_META.SITE_CO_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Upd01_Dtl1R> constMetas = new ConstMetaList<Upd01_Dtl1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			da_cd_META,
			da_nm_META,
			dpt_cd_META,
			def_dpt_nm_META,
			dpt_lvl_cd_META,
			dpt_lvl_nm_META,
			aprv_role_cd_META,
			aprv_role_nm_META,
			cntry_cd_META,
			cntry_nm_META,
			area_cd_META,
			area_nm_META,
			cur_cd_META,
			cur_nm_META,
			amt_dec_place_META,
			upri_dec_place_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			unit_rnd_typ_META,
			bank_cd_META,
			bank_nm_META,
			bank_cal_cd_META,
			bank_branch_bank_cd_META,
			branch_cd_META,
			branch_nm_META,
			bank_branch_cal_cd_META,
			bank_ac_cd_META,
			bank_ac_nm_META,
			ext_flg_META,
			bank_ac_bank_cd_META,
			bank_ac_branch_cd_META,
			bank_ac_no_META,
			bank_ac_typ_META,
			bank_ac_holder_META,
			bank_ac_holder_sub_META,
			xrate_cd_META,
			xrate_nm_META,
			cal_cd_META,
			cal_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			ar_typ_META,
			ap_typ_META,
			ac_itm_grp_cd_META,
			ac_itm_grp_nm_META,
			ac_rsn_cd_META,
			ac_rsn_nm_META,
			ac_rsn_ar_typ_META,
			ac_rsn_ap_typ_META,
			ac_invalid_flg_META,
			cost_invalid_flg_META,
			site_cd_META,
			site_nm_META,
			arr_flg_META,
			zip_cd_META,
			addr1_META,
			addr2_META,
			addr3_META,
			addr4_META,
			tel_META,
			fax_META,
			def_loc_grp_cd_META,
			def_alloc_grp_cd_META,
			def_lg_grp_cd_META,
			def_cal_cd_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			loc_grp_wg_cd_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			loc_flg_META,
			lg_grp_wg_cd_META,
			ship_slip_flg_META,
			pick_list_flg_META,
			ship_inst_flg_META,
			ship_slip_act_flg_META,
			lg_grp_cal_cd_META,
			lg_grp_site_co_cd_META,
			gi_minus_stk_chk_flg_META,
			ship_loc_prio_flg_META,
			alloc_grp_cd_META,
			alloc_grp_nm_META,
			wg_cd_META,
			wg_nm_META,
			sls_flg_META,
			lg_flg_META,
			mfg_flg_META,
			purc_flg_META,
			ar_flg_META,
			ap_flg_META,
			sd_flg_META,
			mrp_prefix_META,
			mfg_inst_unit_typ_META,
			mrp_proc_typ_META,
			alloc_margin_days_META,
			not_xfr_flg_META,
			mrp_alloc_margin_days_META,
			mrp_opn_xfr_days_META,
			rqmt_typ_META,
			prod_pln_typ_META,
			dmnd_date_div_mons_META,
			plm_flg_META,
			calc_seq_META,
			cmn_upri_flg_META,
			oper_cd_META,
			oper_nm_META,
			oper_alc_grp_META,
			wk_cost_cd_META,
			wk_cost_nm_META,
			wk_cost_unit_nm_META,
			wk_cost_dec_place_META,
			rnd_typ_META,
			wk_rsn_cd_META,
			wk_rsn_nm_META,
			sls_upri_grp_cd_META,
			sls_upri_grp_nm_META,
			sls_upri_rank_cd_META,
			sls_upri_rank_nm_META,
			setoff_grp_cd_META,
			setoff_grp_nm_META,
			ship_valid_grp_cd_META,
			ship_valid_grp_nm_META,
			itm_ship_grp_cd_META,
			itm_ship_grp_nm_META,
			trnspt_cd_META,
			trnspt_nm_META,
			trnspt_sort_seq_META,
			cntnr_cd_META,
			cntnr_nm_META,
			wt_META,
			port_cd_META,
			port_nm_META,
			port_cntry_cd_META,
			gd_cd_META,
			gd_nm_META,
			slo_flg_META,
			sort_seq_META,
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			trd_ac_rsn_cd_META,
			slip_each_lot_typ_META,
			trd_slip_form_cd_META,
			auto_adopt_flg_META,
			not_sls_slip_snd_flg_META,
			not_purc_slip_snd_flg_META,
			slip_form_cd_META,
			slip_form_nm_META,
			slip_form_id_META,
			copy_slip_form_id_META,
			line_num_META,
			pf_grp_cd_META,
			pf_grp_nm_META,
			weekly_period_num_META,
			weekly_period_st_META,
			tendays_period_num_META,
			tendays_period_st_META,
			monthly_period_num_META,
			monthly_period_st_META,
			fix_period_num_META,
			itm_spec_grp_cd_META,
			itm_spec_grp_nm_META,
			itm_comp_grp_cd_META,
			itm_comp_grp_nm_META,
			multi_sel_flg_META,
			req_flg_META,
			jnl_act_cd_META,
			jnl_act_nm_META,
			jnl_del_flg_META,
			jnl_grp_cd_META,
			jnl_grp_nm_META,
			ac_bank_flg1_META,
			ac_bank_flg2_META,
			jnl_ptn_cd_META,
			jnl_ptn_nm_META,
			auto_jnl_key_cd_META,
			auto_jnl_key_nm_META,
			insp_ptn_cd_META,
			insp_ptn_nm_META,
			wk_day_cd_META,
			wk_day_nm_META,
			ship_term_cd_META,
			ship_term_nm_META,
			ship_wk_cd_META,
			ship_wk_nm_META,
			ship_wk_cal_cd_META,
			rsrc_cd_META,
			rsrc_nm_META,
			rsrc_unit_nm_META,
			rsrc_dec_place_META,
			rsrc_rnd_typ_META,
			hs_grp_cd_META,
			hs_grp_nm_META,
			hs_typ_META,
			alc_ptn_cd_META,
			alc_ptn_nm_META,
			ctg_grp_cd_META,
			ctg_grp_nm_META,
			act_ptn_cd_META,
			act_ptn_nm_META,
			gp_alc_cd_META,
			gp_alc_nm_META,
			calc_ctg_cd_META,
			calc_ctg_nm_META,
			rpt_ptn_cd_META,
			rpt_ptn_nm_META,
			menu_cd_META,
			menu_nm_META,
			site_co_cd_META,
			site_co_nm_META,
			memo1_META,
			memo2_META,
			memo3_META,
			del_flg_META,
			upd_cntr_META
		},
		new String[][]{
			{
			},
			{
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
	protected Upd01_Dtl1R_MC_A(ConstMetaList<? extends Upd01_Dtl1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_Dtl1R clone() {
		return (Upd01_Dtl1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_Dtl1R createInstance() {
		return (Upd01_Dtl1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_Dtl1R getValues(String... names) {
		return (Upd01_Dtl1R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public String da_cd() {
		return getConstString(offset + 0, $da_cd);
	}

	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public void da_cd(String value) {
		setConstString(offset + 0, $da_cd, value);
	}


	/**
	 * Standard data access name 標準データアクセス名.<p>
	 *
	 */
	public String da_nm() {
		return getConstString(offset + 1, $da_nm);
	}

	/**
	 * Standard data access name 標準データアクセス名.<p>
	 *
	 */
	public void da_nm(String value) {
		setConstString(offset + 1, $da_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 2, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 2, $dpt_cd, value);
	}


	/**
	 * Standard dept. name 標準部門名.<p>
	 *
	 */
	public String def_dpt_nm() {
		return getConstString(offset + 3, $def_dpt_nm);
	}

	/**
	 * Standard dept. name 標準部門名.<p>
	 *
	 */
	public void def_dpt_nm(String value) {
		setConstString(offset + 3, $def_dpt_nm, value);
	}


	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public String dpt_lvl_cd() {
		return getConstString(offset + 4, $dpt_lvl_cd);
	}

	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public void dpt_lvl_cd(String value) {
		setConstString(offset + 4, $dpt_lvl_cd, value);
	}


	/**
	 * Standard dept. hierarchy name 標準部門階層名.<p>
	 *
	 */
	public String dpt_lvl_nm() {
		return getConstString(offset + 5, $dpt_lvl_nm);
	}

	/**
	 * Standard dept. hierarchy name 標準部門階層名.<p>
	 *
	 */
	public void dpt_lvl_nm(String value) {
		setConstString(offset + 5, $dpt_lvl_nm, value);
	}


	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public String aprv_role_cd() {
		return getConstString(offset + 6, $aprv_role_cd);
	}

	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public void aprv_role_cd(String value) {
		setConstString(offset + 6, $aprv_role_cd, value);
	}


	/**
	 * Standard approval role name 標準承認役割名.<p>
	 *
	 */
	public String aprv_role_nm() {
		return getConstString(offset + 7, $aprv_role_nm);
	}

	/**
	 * Standard approval role name 標準承認役割名.<p>
	 *
	 */
	public void aprv_role_nm(String value) {
		setConstString(offset + 7, $aprv_role_nm, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 8, $cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 8, $cntry_cd, value);
	}


	/**
	 * Standard Country name 標準国名.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 9, $cntry_nm);
	}

	/**
	 * Standard Country name 標準国名.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 9, $cntry_nm, value);
	}


	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public String area_cd() {
		return getConstString(offset + 10, $area_cd);
	}

	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public void area_cd(String value) {
		setConstString(offset + 10, $area_cd, value);
	}


	/**
	 * Standard Region name 標準地域名.<p>
	 *
	 */
	public String area_nm() {
		return getConstString(offset + 11, $area_nm);
	}

	/**
	 * Standard Region name 標準地域名.<p>
	 *
	 */
	public void area_nm(String value) {
		setConstString(offset + 11, $area_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 12, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 12, $cur_cd, value);
	}


	/**
	 * Standard currency name 標準通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 13, $cur_nm);
	}

	/**
	 * Standard currency name 標準通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 13, $cur_nm, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 14, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 14, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 14, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 14, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 14, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 14, $amt_dec_place, value);
	}


	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber upri_dec_place() {
		return getConstNumber(offset + 15, $upri_dec_place);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(MCNumber value) {
		setConstNumber(offset + 15, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(int value) {
		setConstNumber(offset + 15, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(long value) {
		setConstNumber(offset + 15, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(float value) {
		setConstNumber(offset + 15, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(double value) {
		setConstNumber(offset + 15, $upri_dec_place, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 16, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 16, $unit_cd, value);
	}


	/**
	 * Standard unit name 標準単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 17, $unit_nm);
	}

	/**
	 * Standard unit name 標準単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 17, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 18, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 18, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 18, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 18, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 18, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 18, $dec_place, value);
	}


	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public String unit_rnd_typ() {
		return getConstString(offset + 19, $unit_rnd_typ);
	}

	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public void unit_rnd_typ(String value) {
		setConstString(offset + 19, $unit_rnd_typ, value);
	}


	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public String bank_cd() {
		return getConstString(offset + 20, $bank_cd);
	}

	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public void bank_cd(String value) {
		setConstString(offset + 20, $bank_cd, value);
	}


	/**
	 * Standard bank name 標準銀行名.<p>
	 *
	 */
	public String bank_nm() {
		return getConstString(offset + 21, $bank_nm);
	}

	/**
	 * Standard bank name 標準銀行名.<p>
	 *
	 */
	public void bank_nm(String value) {
		setConstString(offset + 21, $bank_nm, value);
	}


	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public String bank_cal_cd() {
		return getConstString(offset + 22, $bank_cal_cd);
	}

	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public void bank_cal_cd(String value) {
		setConstString(offset + 22, $bank_cal_cd, value);
	}


	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public String bank_branch_bank_cd() {
		return getConstString(offset + 23, $bank_branch_bank_cd);
	}

	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public void bank_branch_bank_cd(String value) {
		setConstString(offset + 23, $bank_branch_bank_cd, value);
	}


	/**
	 * Bank branch cd. 銀行支店ＣＤ.<p>
	 *
	 */
	public String branch_cd() {
		return getConstString(offset + 24, $branch_cd);
	}

	/**
	 * Bank branch cd. 銀行支店ＣＤ.<p>
	 *
	 */
	public void branch_cd(String value) {
		setConstString(offset + 24, $branch_cd, value);
	}


	/**
	 * Standard bank branch name 標準銀行支店名.<p>
	 *
	 */
	public String branch_nm() {
		return getConstString(offset + 25, $branch_nm);
	}

	/**
	 * Standard bank branch name 標準銀行支店名.<p>
	 *
	 */
	public void branch_nm(String value) {
		setConstString(offset + 25, $branch_nm, value);
	}


	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public String bank_branch_cal_cd() {
		return getConstString(offset + 26, $bank_branch_cal_cd);
	}

	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public void bank_branch_cal_cd(String value) {
		setConstString(offset + 26, $bank_branch_cal_cd, value);
	}


	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 27, $bank_ac_cd);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 27, $bank_ac_cd, value);
	}


	/**
	 * Standard account name 標準口座名.<p>
	 *
	 */
	public String bank_ac_nm() {
		return getConstString(offset + 28, $bank_ac_nm);
	}

	/**
	 * Standard account name 標準口座名.<p>
	 *
	 */
	public void bank_ac_nm(String value) {
		setConstString(offset + 28, $bank_ac_nm, value);
	}


	/**
	 * External 社外.<p>
	 *
	 */
	public boolean ext_flg() {
		return getConstBoolean(offset + 29, $ext_flg);
	}

	/**
	 * External 社外.<p>
	 *
	 */
	public void ext_flg(boolean value) {
		setConstBoolean(offset + 29, $ext_flg, value);
	}


	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public String bank_ac_bank_cd() {
		return getConstString(offset + 30, $bank_ac_bank_cd);
	}

	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public void bank_ac_bank_cd(String value) {
		setConstString(offset + 30, $bank_ac_bank_cd, value);
	}


	/**
	 * Bank branch cd. 銀行支店ＣＤ.<p>
	 *
	 */
	public String bank_ac_branch_cd() {
		return getConstString(offset + 31, $bank_ac_branch_cd);
	}

	/**
	 * Bank branch cd. 銀行支店ＣＤ.<p>
	 *
	 */
	public void bank_ac_branch_cd(String value) {
		setConstString(offset + 31, $bank_ac_branch_cd, value);
	}


	/**
	 * Bank account number 口座番号.<p>
	 *
	 */
	public String bank_ac_no() {
		return getConstString(offset + 32, $bank_ac_no);
	}

	/**
	 * Bank account number 口座番号.<p>
	 *
	 */
	public void bank_ac_no(String value) {
		setConstString(offset + 32, $bank_ac_no, value);
	}


	/**
	 * Bank account type 口座区分.<p>
	 *
	 */
	public String bank_ac_typ() {
		return getConstString(offset + 33, $bank_ac_typ);
	}

	/**
	 * Bank account type 口座区分.<p>
	 *
	 */
	public void bank_ac_typ(String value) {
		setConstString(offset + 33, $bank_ac_typ, value);
	}


	/**
	 * Bank account holder 口座名義.<p>
	 *
	 */
	public String bank_ac_holder() {
		return getConstString(offset + 34, $bank_ac_holder);
	}

	/**
	 * Bank account holder 口座名義.<p>
	 *
	 */
	public void bank_ac_holder(String value) {
		setConstString(offset + 34, $bank_ac_holder, value);
	}


	/**
	 * Account holder alias name 口座名義別名.<p>
	 *
	 */
	public String bank_ac_holder_sub() {
		return getConstString(offset + 35, $bank_ac_holder_sub);
	}

	/**
	 * Account holder alias name 口座名義別名.<p>
	 *
	 */
	public void bank_ac_holder_sub(String value) {
		setConstString(offset + 35, $bank_ac_holder_sub, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 36, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 36, $xrate_cd, value);
	}


	/**
	 * Standard exchange rate name 標準為替レート名.<p>
	 *
	 */
	public String xrate_nm() {
		return getConstString(offset + 37, $xrate_nm);
	}

	/**
	 * Standard exchange rate name 標準為替レート名.<p>
	 *
	 */
	public void xrate_nm(String value) {
		setConstString(offset + 37, $xrate_nm, value);
	}


	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public String cal_cd() {
		return getConstString(offset + 38, $cal_cd);
	}

	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public void cal_cd(String value) {
		setConstString(offset + 38, $cal_cd, value);
	}


	/**
	 * Standard calendar name 標準カレンダ名.<p>
	 *
	 */
	public String cal_nm() {
		return getConstString(offset + 39, $cal_nm);
	}

	/**
	 * Standard calendar name 標準カレンダ名.<p>
	 *
	 */
	public void cal_nm(String value) {
		setConstString(offset + 39, $cal_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 40, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 40, $itm_jnl_cd, value);
	}


	/**
	 * Standard Item journal name 標準品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 41, $itm_jnl_nm);
	}

	/**
	 * Standard Item journal name 標準品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 41, $itm_jnl_nm, value);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 42, $ar_typ);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 42, $ar_typ, value);
	}


	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public String ap_typ() {
		return getConstString(offset + 43, $ap_typ);
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public void ap_typ(String value) {
		setConstString(offset + 43, $ap_typ, value);
	}


	/**
	 * Accounting item classification cd. 会計品目分類ＣＤ.<p>
	 *
	 */
	public String ac_itm_grp_cd() {
		return getConstString(offset + 44, $ac_itm_grp_cd);
	}

	/**
	 * Accounting item classification cd. 会計品目分類ＣＤ.<p>
	 *
	 */
	public void ac_itm_grp_cd(String value) {
		setConstString(offset + 44, $ac_itm_grp_cd, value);
	}


	/**
	 * Standard Accounting item classification name 標準会計品目分類名.<p>
	 *
	 */
	public String ac_itm_grp_nm() {
		return getConstString(offset + 45, $ac_itm_grp_nm);
	}

	/**
	 * Standard Accounting item classification name 標準会計品目分類名.<p>
	 *
	 */
	public void ac_itm_grp_nm(String value) {
		setConstString(offset + 45, $ac_itm_grp_nm, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 46, $ac_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 46, $ac_rsn_cd, value);
	}


	/**
	 * Standard Accounting reason name 標準会計理由名.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 47, $ac_rsn_nm);
	}

	/**
	 * Standard Accounting reason name 標準会計理由名.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 47, $ac_rsn_nm, value);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public String ac_rsn_ar_typ() {
		return getConstString(offset + 48, $ac_rsn_ar_typ);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ac_rsn_ar_typ(String value) {
		setConstString(offset + 48, $ac_rsn_ar_typ, value);
	}


	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public String ac_rsn_ap_typ() {
		return getConstString(offset + 49, $ac_rsn_ap_typ);
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public void ac_rsn_ap_typ(String value) {
		setConstString(offset + 49, $ac_rsn_ap_typ, value);
	}


	/**
	 * Not for journal 仕訳対象外.<p>
	 *
	 */
	public boolean ac_invalid_flg() {
		return getConstBoolean(offset + 50, $ac_invalid_flg);
	}

	/**
	 * Not for journal 仕訳対象外.<p>
	 *
	 */
	public void ac_invalid_flg(boolean value) {
		setConstBoolean(offset + 50, $ac_invalid_flg, value);
	}


	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public boolean cost_invalid_flg() {
		return getConstBoolean(offset + 51, $cost_invalid_flg);
	}

	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public void cost_invalid_flg(boolean value) {
		setConstBoolean(offset + 51, $cost_invalid_flg, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 52, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 52, $site_cd, value);
	}


	/**
	 * Standard factory/distribution warehouse name 標準工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 53, $site_nm);
	}

	/**
	 * Standard factory/distribution warehouse name 標準工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 53, $site_nm, value);
	}


	/**
	 * Receipt 入荷.<p>
	 *
	 */
	public boolean arr_flg() {
		return getConstBoolean(offset + 54, $arr_flg);
	}

	/**
	 * Receipt 入荷.<p>
	 *
	 */
	public void arr_flg(boolean value) {
		setConstBoolean(offset + 54, $arr_flg, value);
	}


	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 55, $zip_cd);
	}

	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 55, $zip_cd, value);
	}


	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 56, $addr1);
	}

	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 56, $addr1, value);
	}


	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 57, $addr2);
	}

	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 57, $addr2, value);
	}


	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 58, $addr3);
	}

	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 58, $addr3, value);
	}


	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 59, $addr4);
	}

	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 59, $addr4, value);
	}


	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public String tel() {
		return getConstString(offset + 60, $tel);
	}

	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public void tel(String value) {
		setConstString(offset + 60, $tel, value);
	}


	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public String fax() {
		return getConstString(offset + 61, $fax);
	}

	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public void fax(String value) {
		setConstString(offset + 61, $fax, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String def_loc_grp_cd() {
		return getConstString(offset + 62, $def_loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void def_loc_grp_cd(String value) {
		setConstString(offset + 62, $def_loc_grp_cd, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String def_alloc_grp_cd() {
		return getConstString(offset + 63, $def_alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void def_alloc_grp_cd(String value) {
		setConstString(offset + 63, $def_alloc_grp_cd, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String def_lg_grp_cd() {
		return getConstString(offset + 64, $def_lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void def_lg_grp_cd(String value) {
		setConstString(offset + 64, $def_lg_grp_cd, value);
	}


	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public String def_cal_cd() {
		return getConstString(offset + 65, $def_cal_cd);
	}

	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public void def_cal_cd(String value) {
		setConstString(offset + 65, $def_cal_cd, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 66, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 66, $loc_grp_cd, value);
	}


	/**
	 * Standard mfg. location group name 標準製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 67, $loc_grp_nm);
	}

	/**
	 * Standard mfg. location group name 標準製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 67, $loc_grp_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String loc_grp_wg_cd() {
		return getConstString(offset + 68, $loc_grp_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void loc_grp_wg_cd(String value) {
		setConstString(offset + 68, $loc_grp_wg_cd, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 69, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 69, $lg_grp_cd, value);
	}


	/**
	 * Standard distribution group name 標準物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 70, $lg_grp_nm);
	}

	/**
	 * Standard distribution group name 標準物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 70, $lg_grp_nm, value);
	}


	/**
	 * Set location 場所設定.<p>
	 *
	 */
	public boolean loc_flg() {
		return getConstBoolean(offset + 71, $loc_flg);
	}

	/**
	 * Set location 場所設定.<p>
	 *
	 */
	public void loc_flg(boolean value) {
		setConstBoolean(offset + 71, $loc_flg, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String lg_grp_wg_cd() {
		return getConstString(offset + 72, $lg_grp_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void lg_grp_wg_cd(String value) {
		setConstString(offset + 72, $lg_grp_wg_cd, value);
	}


	/**
	 * Issue shipping slip 出荷伝票発行.<p>
	 *
	 */
	public boolean ship_slip_flg() {
		return getConstBoolean(offset + 73, $ship_slip_flg);
	}

	/**
	 * Issue shipping slip 出荷伝票発行.<p>
	 *
	 */
	public void ship_slip_flg(boolean value) {
		setConstBoolean(offset + 73, $ship_slip_flg, value);
	}


	/**
	 * Issue picking list ピッキングリスト発行.<p>
	 *
	 */
	public boolean pick_list_flg() {
		return getConstBoolean(offset + 74, $pick_list_flg);
	}

	/**
	 * Issue picking list ピッキングリスト発行.<p>
	 *
	 */
	public void pick_list_flg(boolean value) {
		setConstBoolean(offset + 74, $pick_list_flg, value);
	}


	/**
	 * Shipping order sheet issue 出荷指図書発行.<p>
	 *
	 */
	public boolean ship_inst_flg() {
		return getConstBoolean(offset + 75, $ship_inst_flg);
	}

	/**
	 * Shipping order sheet issue 出荷指図書発行.<p>
	 *
	 */
	public void ship_inst_flg(boolean value) {
		setConstBoolean(offset + 75, $ship_inst_flg, value);
	}


	/**
	 * Issue shipping slip (Result) 出荷伝票発行（実績）.<p>
	 *
	 */
	public boolean ship_slip_act_flg() {
		return getConstBoolean(offset + 76, $ship_slip_act_flg);
	}

	/**
	 * Issue shipping slip (Result) 出荷伝票発行（実績）.<p>
	 *
	 */
	public void ship_slip_act_flg(boolean value) {
		setConstBoolean(offset + 76, $ship_slip_act_flg, value);
	}


	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public String lg_grp_cal_cd() {
		return getConstString(offset + 77, $lg_grp_cal_cd);
	}

	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public void lg_grp_cal_cd(String value) {
		setConstString(offset + 77, $lg_grp_cal_cd, value);
	}


	/**
	 * Warehousing business cd. 倉庫事業者ＣＤ.<p>
	 *
	 */
	public String lg_grp_site_co_cd() {
		return getConstString(offset + 78, $lg_grp_site_co_cd);
	}

	/**
	 * Warehousing business cd. 倉庫事業者ＣＤ.<p>
	 *
	 */
	public void lg_grp_site_co_cd(String value) {
		setConstString(offset + 78, $lg_grp_site_co_cd, value);
	}


	/**
	 * Check negative inventory at GI 出庫時マイナス在庫確認.<p>
	 *
	 */
	public boolean gi_minus_stk_chk_flg() {
		return getConstBoolean(offset + 79, $gi_minus_stk_chk_flg);
	}

	/**
	 * Check negative inventory at GI 出庫時マイナス在庫確認.<p>
	 *
	 */
	public void gi_minus_stk_chk_flg(boolean value) {
		setConstBoolean(offset + 79, $gi_minus_stk_chk_flg, value);
	}


	/**
	 * Precede shipping location 出荷場所優先.<p>
	 *
	 */
	public boolean ship_loc_prio_flg() {
		return getConstBoolean(offset + 80, $ship_loc_prio_flg);
	}

	/**
	 * Precede shipping location 出荷場所優先.<p>
	 *
	 */
	public void ship_loc_prio_flg(boolean value) {
		setConstBoolean(offset + 80, $ship_loc_prio_flg, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 81, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 81, $alloc_grp_cd, value);
	}


	/**
	 * Standard gross allocation location group name 標準総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 82, $alloc_grp_nm);
	}

	/**
	 * Standard gross allocation location group name 標準総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 82, $alloc_grp_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 83, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 83, $wg_cd, value);
	}


	/**
	 * Standard WG name 標準ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 84, $wg_nm);
	}

	/**
	 * Standard WG name 標準ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 84, $wg_nm, value);
	}


	/**
	 * Sales 販売.<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 85, $sls_flg);
	}

	/**
	 * Sales 販売.<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 85, $sls_flg, value);
	}


	/**
	 * Distribution 物流.<p>
	 *
	 */
	public boolean lg_flg() {
		return getConstBoolean(offset + 86, $lg_flg);
	}

	/**
	 * Distribution 物流.<p>
	 *
	 */
	public void lg_flg(boolean value) {
		setConstBoolean(offset + 86, $lg_flg, value);
	}


	/**
	 * Mfg. 製造.<p>
	 *
	 */
	public boolean mfg_flg() {
		return getConstBoolean(offset + 87, $mfg_flg);
	}

	/**
	 * Mfg. 製造.<p>
	 *
	 */
	public void mfg_flg(boolean value) {
		setConstBoolean(offset + 87, $mfg_flg, value);
	}


	/**
	 * Purchase 購買.<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 88, $purc_flg);
	}

	/**
	 * Purchase 購買.<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 88, $purc_flg, value);
	}


	/**
	 * AR 債権.<p>
	 *
	 */
	public boolean ar_flg() {
		return getConstBoolean(offset + 89, $ar_flg);
	}

	/**
	 * AR 債権.<p>
	 *
	 */
	public void ar_flg(boolean value) {
		setConstBoolean(offset + 89, $ar_flg, value);
	}


	/**
	 * AP 債務.<p>
	 *
	 */
	public boolean ap_flg() {
		return getConstBoolean(offset + 90, $ap_flg);
	}

	/**
	 * AP 債務.<p>
	 *
	 */
	public void ap_flg(boolean value) {
		setConstBoolean(offset + 90, $ap_flg, value);
	}


	/**
	 * Demand and supply management 需給.<p>
	 *
	 */
	public boolean sd_flg() {
		return getConstBoolean(offset + 91, $sd_flg);
	}

	/**
	 * Demand and supply management 需給.<p>
	 *
	 */
	public void sd_flg(boolean value) {
		setConstBoolean(offset + 91, $sd_flg, value);
	}


	/**
	 * Prefix for MRP numbering ＭＲＰ発番用接頭語.<p>
	 *
	 */
	public String mrp_prefix() {
		return getConstString(offset + 92, $mrp_prefix);
	}

	/**
	 * Prefix for MRP numbering ＭＲＰ発番用接頭語.<p>
	 *
	 */
	public void mrp_prefix(String value) {
		setConstString(offset + 92, $mrp_prefix, value);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 93, $mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 93, $mfg_inst_unit_typ, value);
	}


	/**
	 * MRP process type ＭＲＰ処理区分.<p>
	 *
	 */
	public String mrp_proc_typ() {
		return getConstString(offset + 94, $mrp_proc_typ);
	}

	/**
	 * MRP process type ＭＲＰ処理区分.<p>
	 *
	 */
	public void mrp_proc_typ(String value) {
		setConstString(offset + 94, $mrp_proc_typ, value);
	}


	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public MCNumber alloc_margin_days() {
		return getConstNumber(offset + 95, $alloc_margin_days);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 95, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(int value) {
		setConstNumber(offset + 95, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(long value) {
		setConstNumber(offset + 95, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(float value) {
		setConstNumber(offset + 95, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(double value) {
		setConstNumber(offset + 95, $alloc_margin_days, value);
	}


	/**
	 * Not for movement/transport allocation 移動・移送引当対象外.<p>
	 *
	 */
	public boolean not_xfr_flg() {
		return getConstBoolean(offset + 96, $not_xfr_flg);
	}

	/**
	 * Not for movement/transport allocation 移動・移送引当対象外.<p>
	 *
	 */
	public void not_xfr_flg(boolean value) {
		setConstBoolean(offset + 96, $not_xfr_flg, value);
	}


	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public MCNumber mrp_alloc_margin_days() {
		return getConstNumber(offset + 97, $mrp_alloc_margin_days);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void mrp_alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 97, $mrp_alloc_margin_days, value);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void mrp_alloc_margin_days(int value) {
		setConstNumber(offset + 97, $mrp_alloc_margin_days, value);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void mrp_alloc_margin_days(long value) {
		setConstNumber(offset + 97, $mrp_alloc_margin_days, value);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void mrp_alloc_margin_days(float value) {
		setConstNumber(offset + 97, $mrp_alloc_margin_days, value);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void mrp_alloc_margin_days(double value) {
		setConstNumber(offset + 97, $mrp_alloc_margin_days, value);
	}


	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public MCNumber mrp_opn_xfr_days() {
		return getConstNumber(offset + 98, $mrp_opn_xfr_days);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void mrp_opn_xfr_days(MCNumber value) {
		setConstNumber(offset + 98, $mrp_opn_xfr_days, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void mrp_opn_xfr_days(int value) {
		setConstNumber(offset + 98, $mrp_opn_xfr_days, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void mrp_opn_xfr_days(long value) {
		setConstNumber(offset + 98, $mrp_opn_xfr_days, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void mrp_opn_xfr_days(float value) {
		setConstNumber(offset + 98, $mrp_opn_xfr_days, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void mrp_opn_xfr_days(double value) {
		setConstNumber(offset + 98, $mrp_opn_xfr_days, value);
	}


	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public String rqmt_typ() {
		return getConstString(offset + 99, $rqmt_typ);
	}

	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public void rqmt_typ(String value) {
		setConstString(offset + 99, $rqmt_typ, value);
	}


	/**
	 * Production planning type 生産計画立案区分.<p>
	 *
	 */
	public String prod_pln_typ() {
		return getConstString(offset + 100, $prod_pln_typ);
	}

	/**
	 * Production planning type 生産計画立案区分.<p>
	 *
	 */
	public void prod_pln_typ(String value) {
		setConstString(offset + 100, $prod_pln_typ, value);
	}


	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public MCNumber dmnd_date_div_mons() {
		return getConstNumber(offset + 101, $dmnd_date_div_mons);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(MCNumber value) {
		setConstNumber(offset + 101, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(int value) {
		setConstNumber(offset + 101, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(long value) {
		setConstNumber(offset + 101, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(float value) {
		setConstNumber(offset + 101, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(double value) {
		setConstNumber(offset + 101, $dmnd_date_div_mons, value);
	}


	/**
	 * PLM ＰＬＭ.<p>
	 *
	 */
	public boolean plm_flg() {
		return getConstBoolean(offset + 102, $plm_flg);
	}

	/**
	 * PLM ＰＬＭ.<p>
	 *
	 */
	public void plm_flg(boolean value) {
		setConstBoolean(offset + 102, $plm_flg, value);
	}


	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public MCNumber calc_seq() {
		return getConstNumber(offset + 103, $calc_seq);
	}

	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public void calc_seq(MCNumber value) {
		setConstNumber(offset + 103, $calc_seq, value);
	}

	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public void calc_seq(int value) {
		setConstNumber(offset + 103, $calc_seq, value);
	}

	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public void calc_seq(long value) {
		setConstNumber(offset + 103, $calc_seq, value);
	}

	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public void calc_seq(float value) {
		setConstNumber(offset + 103, $calc_seq, value);
	}

	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public void calc_seq(double value) {
		setConstNumber(offset + 103, $calc_seq, value);
	}


	/**
	 * Common unit price 共通単価.<p>
	 *
	 */
	public boolean cmn_upri_flg() {
		return getConstBoolean(offset + 104, $cmn_upri_flg);
	}

	/**
	 * Common unit price 共通単価.<p>
	 *
	 */
	public void cmn_upri_flg(boolean value) {
		setConstBoolean(offset + 104, $cmn_upri_flg, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 105, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 105, $oper_cd, value);
	}


	/**
	 * Standard operation name 標準工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 106, $oper_nm);
	}

	/**
	 * Standard operation name 標準工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 106, $oper_nm, value);
	}


	/**
	 * Operation allocation group 工程配賦グループ.<p>
	 *
	 */
	public String oper_alc_grp() {
		return getConstString(offset + 107, $oper_alc_grp);
	}

	/**
	 * Operation allocation group 工程配賦グループ.<p>
	 *
	 */
	public void oper_alc_grp(String value) {
		setConstString(offset + 107, $oper_alc_grp, value);
	}


	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public String wk_cost_cd() {
		return getConstString(offset + 108, $wk_cost_cd);
	}

	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		setConstString(offset + 108, $wk_cost_cd, value);
	}


	/**
	 * Standard work element name 標準工数管理名.<p>
	 *
	 */
	public String wk_cost_nm() {
		return getConstString(offset + 109, $wk_cost_nm);
	}

	/**
	 * Standard work element name 標準工数管理名.<p>
	 *
	 */
	public void wk_cost_nm(String value) {
		setConstString(offset + 109, $wk_cost_nm, value);
	}


	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public String wk_cost_unit_nm() {
		return getConstString(offset + 110, $wk_cost_unit_nm);
	}

	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public void wk_cost_unit_nm(String value) {
		setConstString(offset + 110, $wk_cost_unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber wk_cost_dec_place() {
		return getConstNumber(offset + 111, $wk_cost_dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(MCNumber value) {
		setConstNumber(offset + 111, $wk_cost_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(int value) {
		setConstNumber(offset + 111, $wk_cost_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(long value) {
		setConstNumber(offset + 111, $wk_cost_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(float value) {
		setConstNumber(offset + 111, $wk_cost_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(double value) {
		setConstNumber(offset + 111, $wk_cost_dec_place, value);
	}


	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public String rnd_typ() {
		return getConstString(offset + 112, $rnd_typ);
	}

	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public void rnd_typ(String value) {
		setConstString(offset + 112, $rnd_typ, value);
	}


	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public String wk_rsn_cd() {
		return getConstString(offset + 113, $wk_rsn_cd);
	}

	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public void wk_rsn_cd(String value) {
		setConstString(offset + 113, $wk_rsn_cd, value);
	}


	/**
	 * Standard man-hour reason name 標準工数理由名.<p>
	 *
	 */
	public String wk_rsn_nm() {
		return getConstString(offset + 114, $wk_rsn_nm);
	}

	/**
	 * Standard man-hour reason name 標準工数理由名.<p>
	 *
	 */
	public void wk_rsn_nm(String value) {
		setConstString(offset + 114, $wk_rsn_nm, value);
	}


	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public String sls_upri_grp_cd() {
		return getConstString(offset + 115, $sls_upri_grp_cd);
	}

	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public void sls_upri_grp_cd(String value) {
		setConstString(offset + 115, $sls_upri_grp_cd, value);
	}


	/**
	 * Standard sales unit price classification name 標準販売単価分類名.<p>
	 *
	 */
	public String sls_upri_grp_nm() {
		return getConstString(offset + 116, $sls_upri_grp_nm);
	}

	/**
	 * Standard sales unit price classification name 標準販売単価分類名.<p>
	 *
	 */
	public void sls_upri_grp_nm(String value) {
		setConstString(offset + 116, $sls_upri_grp_nm, value);
	}


	/**
	 * Sales unit price rank cd. 販売単価ランクＣＤ.<p>
	 *
	 */
	public String sls_upri_rank_cd() {
		return getConstString(offset + 117, $sls_upri_rank_cd);
	}

	/**
	 * Sales unit price rank cd. 販売単価ランクＣＤ.<p>
	 *
	 */
	public void sls_upri_rank_cd(String value) {
		setConstString(offset + 117, $sls_upri_rank_cd, value);
	}


	/**
	 * Standard sales unit price rank name 標準販売単価ランク名.<p>
	 *
	 */
	public String sls_upri_rank_nm() {
		return getConstString(offset + 118, $sls_upri_rank_nm);
	}

	/**
	 * Standard sales unit price rank name 標準販売単価ランク名.<p>
	 *
	 */
	public void sls_upri_rank_nm(String value) {
		setConstString(offset + 118, $sls_upri_rank_nm, value);
	}


	/**
	 * Offset group cd. 相殺グループＣＤ.<p>
	 *
	 */
	public String setoff_grp_cd() {
		return getConstString(offset + 119, $setoff_grp_cd);
	}

	/**
	 * Offset group cd. 相殺グループＣＤ.<p>
	 *
	 */
	public void setoff_grp_cd(String value) {
		setConstString(offset + 119, $setoff_grp_cd, value);
	}


	/**
	 * Standard offset group name 標準相殺グループ名.<p>
	 *
	 */
	public String setoff_grp_nm() {
		return getConstString(offset + 120, $setoff_grp_nm);
	}

	/**
	 * Standard offset group name 標準相殺グループ名.<p>
	 *
	 */
	public void setoff_grp_nm(String value) {
		setConstString(offset + 120, $setoff_grp_nm, value);
	}


	/**
	 * Shipping expiration date group cd. 出荷有効期限グループＣＤ.<p>
	 *
	 */
	public String ship_valid_grp_cd() {
		return getConstString(offset + 121, $ship_valid_grp_cd);
	}

	/**
	 * Shipping expiration date group cd. 出荷有効期限グループＣＤ.<p>
	 *
	 */
	public void ship_valid_grp_cd(String value) {
		setConstString(offset + 121, $ship_valid_grp_cd, value);
	}


	/**
	 * Standard shipping expiration date group name 標準出荷有効期限グループ名.<p>
	 *
	 */
	public String ship_valid_grp_nm() {
		return getConstString(offset + 122, $ship_valid_grp_nm);
	}

	/**
	 * Standard shipping expiration date group name 標準出荷有効期限グループ名.<p>
	 *
	 */
	public void ship_valid_grp_nm(String value) {
		setConstString(offset + 122, $ship_valid_grp_nm, value);
	}


	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public String itm_ship_grp_cd() {
		return getConstString(offset + 123, $itm_ship_grp_cd);
	}

	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public void itm_ship_grp_cd(String value) {
		setConstString(offset + 123, $itm_ship_grp_cd, value);
	}


	/**
	 * Standard item shipping group name 標準品目出荷グループ名.<p>
	 *
	 */
	public String itm_ship_grp_nm() {
		return getConstString(offset + 124, $itm_ship_grp_nm);
	}

	/**
	 * Standard item shipping group name 標準品目出荷グループ名.<p>
	 *
	 */
	public void itm_ship_grp_nm(String value) {
		setConstString(offset + 124, $itm_ship_grp_nm, value);
	}


	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 125, $trnspt_cd);
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 125, $trnspt_cd, value);
	}


	/**
	 * Standard transportation method name 標準輸送方法名.<p>
	 *
	 */
	public String trnspt_nm() {
		return getConstString(offset + 126, $trnspt_nm);
	}

	/**
	 * Standard transportation method name 標準輸送方法名.<p>
	 *
	 */
	public void trnspt_nm(String value) {
		setConstString(offset + 126, $trnspt_nm, value);
	}


	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public MCNumber trnspt_sort_seq() {
		return getConstNumber(offset + 127, $trnspt_sort_seq);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void trnspt_sort_seq(MCNumber value) {
		setConstNumber(offset + 127, $trnspt_sort_seq, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void trnspt_sort_seq(int value) {
		setConstNumber(offset + 127, $trnspt_sort_seq, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void trnspt_sort_seq(long value) {
		setConstNumber(offset + 127, $trnspt_sort_seq, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void trnspt_sort_seq(float value) {
		setConstNumber(offset + 127, $trnspt_sort_seq, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void trnspt_sort_seq(double value) {
		setConstNumber(offset + 127, $trnspt_sort_seq, value);
	}


	/**
	 * Packing container cd. 梱包容器ＣＤ.<p>
	 *
	 */
	public String cntnr_cd() {
		return getConstString(offset + 128, $cntnr_cd);
	}

	/**
	 * Packing container cd. 梱包容器ＣＤ.<p>
	 *
	 */
	public void cntnr_cd(String value) {
		setConstString(offset + 128, $cntnr_cd, value);
	}


	/**
	 * Standard packing container name 標準梱包容器名.<p>
	 *
	 */
	public String cntnr_nm() {
		return getConstString(offset + 129, $cntnr_nm);
	}

	/**
	 * Standard packing container name 標準梱包容器名.<p>
	 *
	 */
	public void cntnr_nm(String value) {
		setConstString(offset + 129, $cntnr_nm, value);
	}


	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCNumber wt() {
		return getConstNumber(offset + 130, $wt);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(MCNumber value) {
		setConstNumber(offset + 130, $wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(int value) {
		setConstNumber(offset + 130, $wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(long value) {
		setConstNumber(offset + 130, $wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(float value) {
		setConstNumber(offset + 130, $wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(double value) {
		setConstNumber(offset + 130, $wt, value);
	}


	/**
	 * Harbor cd. 港ＣＤ.<p>
	 *
	 */
	public String port_cd() {
		return getConstString(offset + 131, $port_cd);
	}

	/**
	 * Harbor cd. 港ＣＤ.<p>
	 *
	 */
	public void port_cd(String value) {
		setConstString(offset + 131, $port_cd, value);
	}


	/**
	 * Standard port name 標準港名.<p>
	 *
	 */
	public String port_nm() {
		return getConstString(offset + 132, $port_nm);
	}

	/**
	 * Standard port name 標準港名.<p>
	 *
	 */
	public void port_nm(String value) {
		setConstString(offset + 132, $port_nm, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String port_cntry_cd() {
		return getConstString(offset + 133, $port_cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void port_cntry_cd(String value) {
		setConstString(offset + 133, $port_cntry_cd, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 134, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 134, $gd_cd, value);
	}


	/**
	 * Standard grading name 標準格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 135, $gd_nm);
	}

	/**
	 * Standard grading name 標準格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 135, $gd_nm, value);
	}


	/**
	 * Sales order 受注.<p>
	 *
	 */
	public boolean slo_flg() {
		return getConstBoolean(offset + 136, $slo_flg);
	}

	/**
	 * Sales order 受注.<p>
	 *
	 */
	public void slo_flg(boolean value) {
		setConstBoolean(offset + 136, $slo_flg, value);
	}


	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public MCNumber sort_seq() {
		return getConstNumber(offset + 137, $sort_seq);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void sort_seq(MCNumber value) {
		setConstNumber(offset + 137, $sort_seq, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void sort_seq(int value) {
		setConstNumber(offset + 137, $sort_seq, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void sort_seq(long value) {
		setConstNumber(offset + 137, $sort_seq, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void sort_seq(float value) {
		setConstNumber(offset + 137, $sort_seq, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void sort_seq(double value) {
		setConstNumber(offset + 137, $sort_seq, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 138, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 138, $trd_cd, value);
	}


	/**
	 * Standard transaction name 標準取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 139, $trd_nm);
	}

	/**
	 * Standard transaction name 標準取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 139, $trd_nm, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 140, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 140, $trd_ptn_typ, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String trd_ac_rsn_cd() {
		return getConstString(offset + 141, $trd_ac_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void trd_ac_rsn_cd(String value) {
		setConstString(offset + 141, $trd_ac_rsn_cd, value);
	}


	/**
	 * Lot details split type ロット明細分割区分.<p>
	 *
	 */
	public String slip_each_lot_typ() {
		return getConstString(offset + 142, $slip_each_lot_typ);
	}

	/**
	 * Lot details split type ロット明細分割区分.<p>
	 *
	 */
	public void slip_each_lot_typ(String value) {
		setConstString(offset + 142, $slip_each_lot_typ, value);
	}


	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public String trd_slip_form_cd() {
		return getConstString(offset + 143, $trd_slip_form_cd);
	}

	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public void trd_slip_form_cd(String value) {
		setConstString(offset + 143, $trd_slip_form_cd, value);
	}


	/**
	 * Adopt at auto 自動時採用.<p>
	 *
	 */
	public boolean auto_adopt_flg() {
		return getConstBoolean(offset + 144, $auto_adopt_flg);
	}

	/**
	 * Adopt at auto 自動時採用.<p>
	 *
	 */
	public void auto_adopt_flg(boolean value) {
		setConstBoolean(offset + 144, $auto_adopt_flg, value);
	}


	/**
	 * Sales slip not to be exported flg. 売上伝票送信対象外ＦＬＧ.<p>
	 *
	 */
	public boolean not_sls_slip_snd_flg() {
		return getConstBoolean(offset + 145, $not_sls_slip_snd_flg);
	}

	/**
	 * Sales slip not to be exported flg. 売上伝票送信対象外ＦＬＧ.<p>
	 *
	 */
	public void not_sls_slip_snd_flg(boolean value) {
		setConstBoolean(offset + 145, $not_sls_slip_snd_flg, value);
	}


	/**
	 * Purchase slip not to be exported flg. 仕入伝票送信対象外ＦＬＧ.<p>
	 *
	 */
	public boolean not_purc_slip_snd_flg() {
		return getConstBoolean(offset + 146, $not_purc_slip_snd_flg);
	}

	/**
	 * Purchase slip not to be exported flg. 仕入伝票送信対象外ＦＬＧ.<p>
	 *
	 */
	public void not_purc_slip_snd_flg(boolean value) {
		setConstBoolean(offset + 146, $not_purc_slip_snd_flg, value);
	}


	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public String slip_form_cd() {
		return getConstString(offset + 147, $slip_form_cd);
	}

	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public void slip_form_cd(String value) {
		setConstString(offset + 147, $slip_form_cd, value);
	}


	/**
	 * Standard slip report name 標準伝票帳票名.<p>
	 *
	 */
	public String slip_form_nm() {
		return getConstString(offset + 148, $slip_form_nm);
	}

	/**
	 * Standard slip report name 標準伝票帳票名.<p>
	 *
	 */
	public void slip_form_nm(String value) {
		setConstString(offset + 148, $slip_form_nm, value);
	}


	/**
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public String slip_form_id() {
		return getConstString(offset + 149, $slip_form_id);
	}

	/**
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public void slip_form_id(String value) {
		setConstString(offset + 149, $slip_form_id, value);
	}


	/**
	 * Refrain slip ID 控帳票ＩＤ.<p>
	 *
	 */
	public String copy_slip_form_id() {
		return getConstString(offset + 150, $copy_slip_form_id);
	}

	/**
	 * Refrain slip ID 控帳票ＩＤ.<p>
	 *
	 */
	public void copy_slip_form_id(String value) {
		setConstString(offset + 150, $copy_slip_form_id, value);
	}


	/**
	 * Number of rows 行数.<p>
	 *
	 */
	public MCNumber line_num() {
		return getConstNumber(offset + 151, $line_num);
	}

	/**
	 * Number of rows 行数.<p>
	 *
	 */
	public void line_num(MCNumber value) {
		setConstNumber(offset + 151, $line_num, value);
	}

	/**
	 * Number of rows 行数.<p>
	 *
	 */
	public void line_num(int value) {
		setConstNumber(offset + 151, $line_num, value);
	}

	/**
	 * Number of rows 行数.<p>
	 *
	 */
	public void line_num(long value) {
		setConstNumber(offset + 151, $line_num, value);
	}

	/**
	 * Number of rows 行数.<p>
	 *
	 */
	public void line_num(float value) {
		setConstNumber(offset + 151, $line_num, value);
	}

	/**
	 * Number of rows 行数.<p>
	 *
	 */
	public void line_num(double value) {
		setConstNumber(offset + 151, $line_num, value);
	}


	/**
	 * Purchase forecast group cd. 購買内示グループＣＤ.<p>
	 *
	 */
	public String pf_grp_cd() {
		return getConstString(offset + 152, $pf_grp_cd);
	}

	/**
	 * Purchase forecast group cd. 購買内示グループＣＤ.<p>
	 *
	 */
	public void pf_grp_cd(String value) {
		setConstString(offset + 152, $pf_grp_cd, value);
	}


	/**
	 * Standard purchase forecast group name 標準購買内示グループ名.<p>
	 *
	 */
	public String pf_grp_nm() {
		return getConstString(offset + 153, $pf_grp_nm);
	}

	/**
	 * Standard purchase forecast group name 標準購買内示グループ名.<p>
	 *
	 */
	public void pf_grp_nm(String value) {
		setConstString(offset + 153, $pf_grp_nm, value);
	}


	/**
	 * Weekly forecast period 週次内示期間.<p>
	 *
	 */
	public MCNumber weekly_period_num() {
		return getConstNumber(offset + 154, $weekly_period_num);
	}

	/**
	 * Weekly forecast period 週次内示期間.<p>
	 *
	 */
	public void weekly_period_num(MCNumber value) {
		setConstNumber(offset + 154, $weekly_period_num, value);
	}

	/**
	 * Weekly forecast period 週次内示期間.<p>
	 *
	 */
	public void weekly_period_num(int value) {
		setConstNumber(offset + 154, $weekly_period_num, value);
	}

	/**
	 * Weekly forecast period 週次内示期間.<p>
	 *
	 */
	public void weekly_period_num(long value) {
		setConstNumber(offset + 154, $weekly_period_num, value);
	}

	/**
	 * Weekly forecast period 週次内示期間.<p>
	 *
	 */
	public void weekly_period_num(float value) {
		setConstNumber(offset + 154, $weekly_period_num, value);
	}

	/**
	 * Weekly forecast period 週次内示期間.<p>
	 *
	 */
	public void weekly_period_num(double value) {
		setConstNumber(offset + 154, $weekly_period_num, value);
	}


	/**
	 * Weekly start position 週次開始位置.<p>
	 *
	 */
	public MCNumber weekly_period_st() {
		return getConstNumber(offset + 155, $weekly_period_st);
	}

	/**
	 * Weekly start position 週次開始位置.<p>
	 *
	 */
	public void weekly_period_st(MCNumber value) {
		setConstNumber(offset + 155, $weekly_period_st, value);
	}

	/**
	 * Weekly start position 週次開始位置.<p>
	 *
	 */
	public void weekly_period_st(int value) {
		setConstNumber(offset + 155, $weekly_period_st, value);
	}

	/**
	 * Weekly start position 週次開始位置.<p>
	 *
	 */
	public void weekly_period_st(long value) {
		setConstNumber(offset + 155, $weekly_period_st, value);
	}

	/**
	 * Weekly start position 週次開始位置.<p>
	 *
	 */
	public void weekly_period_st(float value) {
		setConstNumber(offset + 155, $weekly_period_st, value);
	}

	/**
	 * Weekly start position 週次開始位置.<p>
	 *
	 */
	public void weekly_period_st(double value) {
		setConstNumber(offset + 155, $weekly_period_st, value);
	}


	/**
	 * By 10 days forecast period 旬次内示期間.<p>
	 *
	 */
	public MCNumber tendays_period_num() {
		return getConstNumber(offset + 156, $tendays_period_num);
	}

	/**
	 * By 10 days forecast period 旬次内示期間.<p>
	 *
	 */
	public void tendays_period_num(MCNumber value) {
		setConstNumber(offset + 156, $tendays_period_num, value);
	}

	/**
	 * By 10 days forecast period 旬次内示期間.<p>
	 *
	 */
	public void tendays_period_num(int value) {
		setConstNumber(offset + 156, $tendays_period_num, value);
	}

	/**
	 * By 10 days forecast period 旬次内示期間.<p>
	 *
	 */
	public void tendays_period_num(long value) {
		setConstNumber(offset + 156, $tendays_period_num, value);
	}

	/**
	 * By 10 days forecast period 旬次内示期間.<p>
	 *
	 */
	public void tendays_period_num(float value) {
		setConstNumber(offset + 156, $tendays_period_num, value);
	}

	/**
	 * By 10 days forecast period 旬次内示期間.<p>
	 *
	 */
	public void tendays_period_num(double value) {
		setConstNumber(offset + 156, $tendays_period_num, value);
	}


	/**
	 * By 10 days starting position 旬次開始位置.<p>
	 *
	 */
	public MCNumber tendays_period_st() {
		return getConstNumber(offset + 157, $tendays_period_st);
	}

	/**
	 * By 10 days starting position 旬次開始位置.<p>
	 *
	 */
	public void tendays_period_st(MCNumber value) {
		setConstNumber(offset + 157, $tendays_period_st, value);
	}

	/**
	 * By 10 days starting position 旬次開始位置.<p>
	 *
	 */
	public void tendays_period_st(int value) {
		setConstNumber(offset + 157, $tendays_period_st, value);
	}

	/**
	 * By 10 days starting position 旬次開始位置.<p>
	 *
	 */
	public void tendays_period_st(long value) {
		setConstNumber(offset + 157, $tendays_period_st, value);
	}

	/**
	 * By 10 days starting position 旬次開始位置.<p>
	 *
	 */
	public void tendays_period_st(float value) {
		setConstNumber(offset + 157, $tendays_period_st, value);
	}

	/**
	 * By 10 days starting position 旬次開始位置.<p>
	 *
	 */
	public void tendays_period_st(double value) {
		setConstNumber(offset + 157, $tendays_period_st, value);
	}


	/**
	 * Monthly forecast period 月次内示期間.<p>
	 *
	 */
	public MCNumber monthly_period_num() {
		return getConstNumber(offset + 158, $monthly_period_num);
	}

	/**
	 * Monthly forecast period 月次内示期間.<p>
	 *
	 */
	public void monthly_period_num(MCNumber value) {
		setConstNumber(offset + 158, $monthly_period_num, value);
	}

	/**
	 * Monthly forecast period 月次内示期間.<p>
	 *
	 */
	public void monthly_period_num(int value) {
		setConstNumber(offset + 158, $monthly_period_num, value);
	}

	/**
	 * Monthly forecast period 月次内示期間.<p>
	 *
	 */
	public void monthly_period_num(long value) {
		setConstNumber(offset + 158, $monthly_period_num, value);
	}

	/**
	 * Monthly forecast period 月次内示期間.<p>
	 *
	 */
	public void monthly_period_num(float value) {
		setConstNumber(offset + 158, $monthly_period_num, value);
	}

	/**
	 * Monthly forecast period 月次内示期間.<p>
	 *
	 */
	public void monthly_period_num(double value) {
		setConstNumber(offset + 158, $monthly_period_num, value);
	}


	/**
	 * Monthly starting position 月次開始位置.<p>
	 *
	 */
	public MCNumber monthly_period_st() {
		return getConstNumber(offset + 159, $monthly_period_st);
	}

	/**
	 * Monthly starting position 月次開始位置.<p>
	 *
	 */
	public void monthly_period_st(MCNumber value) {
		setConstNumber(offset + 159, $monthly_period_st, value);
	}

	/**
	 * Monthly starting position 月次開始位置.<p>
	 *
	 */
	public void monthly_period_st(int value) {
		setConstNumber(offset + 159, $monthly_period_st, value);
	}

	/**
	 * Monthly starting position 月次開始位置.<p>
	 *
	 */
	public void monthly_period_st(long value) {
		setConstNumber(offset + 159, $monthly_period_st, value);
	}

	/**
	 * Monthly starting position 月次開始位置.<p>
	 *
	 */
	public void monthly_period_st(float value) {
		setConstNumber(offset + 159, $monthly_period_st, value);
	}

	/**
	 * Monthly starting position 月次開始位置.<p>
	 *
	 */
	public void monthly_period_st(double value) {
		setConstNumber(offset + 159, $monthly_period_st, value);
	}


	/**
	 * Firm period 確定期間.<p>
	 *
	 */
	public MCNumber fix_period_num() {
		return getConstNumber(offset + 160, $fix_period_num);
	}

	/**
	 * Firm period 確定期間.<p>
	 *
	 */
	public void fix_period_num(MCNumber value) {
		setConstNumber(offset + 160, $fix_period_num, value);
	}

	/**
	 * Firm period 確定期間.<p>
	 *
	 */
	public void fix_period_num(int value) {
		setConstNumber(offset + 160, $fix_period_num, value);
	}

	/**
	 * Firm period 確定期間.<p>
	 *
	 */
	public void fix_period_num(long value) {
		setConstNumber(offset + 160, $fix_period_num, value);
	}

	/**
	 * Firm period 確定期間.<p>
	 *
	 */
	public void fix_period_num(float value) {
		setConstNumber(offset + 160, $fix_period_num, value);
	}

	/**
	 * Firm period 確定期間.<p>
	 *
	 */
	public void fix_period_num(double value) {
		setConstNumber(offset + 160, $fix_period_num, value);
	}


	/**
	 * Item specification classification cd. 品目仕様分類ＣＤ.<p>
	 *
	 */
	public String itm_spec_grp_cd() {
		return getConstString(offset + 161, $itm_spec_grp_cd);
	}

	/**
	 * Item specification classification cd. 品目仕様分類ＣＤ.<p>
	 *
	 */
	public void itm_spec_grp_cd(String value) {
		setConstString(offset + 161, $itm_spec_grp_cd, value);
	}


	/**
	 * Standard item specification classification name 標準品目仕様分類名.<p>
	 *
	 */
	public String itm_spec_grp_nm() {
		return getConstString(offset + 162, $itm_spec_grp_nm);
	}

	/**
	 * Standard item specification classification name 標準品目仕様分類名.<p>
	 *
	 */
	public void itm_spec_grp_nm(String value) {
		setConstString(offset + 162, $itm_spec_grp_nm, value);
	}


	/**
	 * Item configuration group cd. 品目構成グループＣＤ.<p>
	 *
	 */
	public String itm_comp_grp_cd() {
		return getConstString(offset + 163, $itm_comp_grp_cd);
	}

	/**
	 * Item configuration group cd. 品目構成グループＣＤ.<p>
	 *
	 */
	public void itm_comp_grp_cd(String value) {
		setConstString(offset + 163, $itm_comp_grp_cd, value);
	}


	/**
	 * Standard item structure group name 標準品目構成グループ名.<p>
	 *
	 */
	public String itm_comp_grp_nm() {
		return getConstString(offset + 164, $itm_comp_grp_nm);
	}

	/**
	 * Standard item structure group name 標準品目構成グループ名.<p>
	 *
	 */
	public void itm_comp_grp_nm(String value) {
		setConstString(offset + 164, $itm_comp_grp_nm, value);
	}


	/**
	 * Multiple choice 複数選択可.<p>
	 *
	 */
	public boolean multi_sel_flg() {
		return getConstBoolean(offset + 165, $multi_sel_flg);
	}

	/**
	 * Multiple choice 複数選択可.<p>
	 *
	 */
	public void multi_sel_flg(boolean value) {
		setConstBoolean(offset + 165, $multi_sel_flg, value);
	}


	/**
	 * Required 必須.<p>
	 *
	 */
	public boolean req_flg() {
		return getConstBoolean(offset + 166, $req_flg);
	}

	/**
	 * Required 必須.<p>
	 *
	 */
	public void req_flg(boolean value) {
		setConstBoolean(offset + 166, $req_flg, value);
	}


	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public String jnl_act_cd() {
		return getConstString(offset + 167, $jnl_act_cd);
	}

	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public void jnl_act_cd(String value) {
		setConstString(offset + 167, $jnl_act_cd, value);
	}


	/**
	 * Standard journal execute name 標準仕訳実行名.<p>
	 *
	 */
	public String jnl_act_nm() {
		return getConstString(offset + 168, $jnl_act_nm);
	}

	/**
	 * Standard journal execute name 標準仕訳実行名.<p>
	 *
	 */
	public void jnl_act_nm(String value) {
		setConstString(offset + 168, $jnl_act_nm, value);
	}


	/**
	 * Journal deleted 仕訳削除.<p>
	 *
	 */
	public boolean jnl_del_flg() {
		return getConstBoolean(offset + 169, $jnl_del_flg);
	}

	/**
	 * Journal deleted 仕訳削除.<p>
	 *
	 */
	public void jnl_del_flg(boolean value) {
		setConstBoolean(offset + 169, $jnl_del_flg, value);
	}


	/**
	 * Journal group cd. 仕訳グループＣＤ.<p>
	 *
	 */
	public String jnl_grp_cd() {
		return getConstString(offset + 170, $jnl_grp_cd);
	}

	/**
	 * Journal group cd. 仕訳グループＣＤ.<p>
	 *
	 */
	public void jnl_grp_cd(String value) {
		setConstString(offset + 170, $jnl_grp_cd, value);
	}


	/**
	 * Standard journal group name 標準仕訳グループ名.<p>
	 *
	 */
	public String jnl_grp_nm() {
		return getConstString(offset + 171, $jnl_grp_nm);
	}

	/**
	 * Standard journal group name 標準仕訳グループ名.<p>
	 *
	 */
	public void jnl_grp_nm(String value) {
		setConstString(offset + 171, $jnl_grp_nm, value);
	}


	/**
	 * Import bank account type setting master 1 口座科目設定マスタ取込１.<p>
	 *
	 */
	public boolean ac_bank_flg1() {
		return getConstBoolean(offset + 172, $ac_bank_flg1);
	}

	/**
	 * Import bank account type setting master 1 口座科目設定マスタ取込１.<p>
	 *
	 */
	public void ac_bank_flg1(boolean value) {
		setConstBoolean(offset + 172, $ac_bank_flg1, value);
	}


	/**
	 * Bank account type setting master import 2 口座科目設定マスタ取込２.<p>
	 *
	 */
	public boolean ac_bank_flg2() {
		return getConstBoolean(offset + 173, $ac_bank_flg2);
	}

	/**
	 * Bank account type setting master import 2 口座科目設定マスタ取込２.<p>
	 *
	 */
	public void ac_bank_flg2(boolean value) {
		setConstBoolean(offset + 173, $ac_bank_flg2, value);
	}


	/**
	 * Journal pattern cd. 仕訳パタンＣＤ.<p>
	 *
	 */
	public String jnl_ptn_cd() {
		return getConstString(offset + 174, $jnl_ptn_cd);
	}

	/**
	 * Journal pattern cd. 仕訳パタンＣＤ.<p>
	 *
	 */
	public void jnl_ptn_cd(String value) {
		setConstString(offset + 174, $jnl_ptn_cd, value);
	}


	/**
	 * Standard journal pattern name 標準仕訳パタン名.<p>
	 *
	 */
	public String jnl_ptn_nm() {
		return getConstString(offset + 175, $jnl_ptn_nm);
	}

	/**
	 * Standard journal pattern name 標準仕訳パタン名.<p>
	 *
	 */
	public void jnl_ptn_nm(String value) {
		setConstString(offset + 175, $jnl_ptn_nm, value);
	}


	/**
	 * Auto-journal key cd. 自動仕訳キーＣＤ.<p>
	 *
	 */
	public String auto_jnl_key_cd() {
		return getConstString(offset + 176, $auto_jnl_key_cd);
	}

	/**
	 * Auto-journal key cd. 自動仕訳キーＣＤ.<p>
	 *
	 */
	public void auto_jnl_key_cd(String value) {
		setConstString(offset + 176, $auto_jnl_key_cd, value);
	}


	/**
	 * Standard auto-journal key name 標準自動仕訳キー名.<p>
	 *
	 */
	public String auto_jnl_key_nm() {
		return getConstString(offset + 177, $auto_jnl_key_nm);
	}

	/**
	 * Standard auto-journal key name 標準自動仕訳キー名.<p>
	 *
	 */
	public void auto_jnl_key_nm(String value) {
		setConstString(offset + 177, $auto_jnl_key_nm, value);
	}


	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public String insp_ptn_cd() {
		return getConstString(offset + 178, $insp_ptn_cd);
	}

	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public void insp_ptn_cd(String value) {
		setConstString(offset + 178, $insp_ptn_cd, value);
	}


	/**
	 * Standard inspection pattern name 標準検査パタン名.<p>
	 *
	 */
	public String insp_ptn_nm() {
		return getConstString(offset + 179, $insp_ptn_nm);
	}

	/**
	 * Standard inspection pattern name 標準検査パタン名.<p>
	 *
	 */
	public void insp_ptn_nm(String value) {
		setConstString(offset + 179, $insp_ptn_nm, value);
	}


	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public String wk_day_cd() {
		return getConstString(offset + 180, $wk_day_cd);
	}

	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public void wk_day_cd(String value) {
		setConstString(offset + 180, $wk_day_cd, value);
	}


	/**
	 * Standard work classification name 標準勤務種類名.<p>
	 *
	 */
	public String wk_day_nm() {
		return getConstString(offset + 181, $wk_day_nm);
	}

	/**
	 * Standard work classification name 標準勤務種類名.<p>
	 *
	 */
	public void wk_day_nm(String value) {
		setConstString(offset + 181, $wk_day_nm, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 182, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 182, $ship_term_cd, value);
	}


	/**
	 * Standard shipping conditions name 標準出荷条件名.<p>
	 *
	 */
	public String ship_term_nm() {
		return getConstString(offset + 183, $ship_term_nm);
	}

	/**
	 * Standard shipping conditions name 標準出荷条件名.<p>
	 *
	 */
	public void ship_term_nm(String value) {
		setConstString(offset + 183, $ship_term_nm, value);
	}


	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public String ship_wk_cd() {
		return getConstString(offset + 184, $ship_wk_cd);
	}

	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public void ship_wk_cd(String value) {
		setConstString(offset + 184, $ship_wk_cd, value);
	}


	/**
	 * Standard shipping operation name 標準出荷作業名.<p>
	 *
	 */
	public String ship_wk_nm() {
		return getConstString(offset + 185, $ship_wk_nm);
	}

	/**
	 * Standard shipping operation name 標準出荷作業名.<p>
	 *
	 */
	public void ship_wk_nm(String value) {
		setConstString(offset + 185, $ship_wk_nm, value);
	}


	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public String ship_wk_cal_cd() {
		return getConstString(offset + 186, $ship_wk_cal_cd);
	}

	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public void ship_wk_cal_cd(String value) {
		setConstString(offset + 186, $ship_wk_cal_cd, value);
	}


	/**
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public String rsrc_cd() {
		return getConstString(offset + 187, $rsrc_cd);
	}

	/**
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public void rsrc_cd(String value) {
		setConstString(offset + 187, $rsrc_cd, value);
	}


	/**
	 * Standard resource name 標準資源名.<p>
	 *
	 */
	public String rsrc_nm() {
		return getConstString(offset + 188, $rsrc_nm);
	}

	/**
	 * Standard resource name 標準資源名.<p>
	 *
	 */
	public void rsrc_nm(String value) {
		setConstString(offset + 188, $rsrc_nm, value);
	}


	/**
	 * Resource unit name 資源単位名.<p>
	 *
	 */
	public String rsrc_unit_nm() {
		return getConstString(offset + 189, $rsrc_unit_nm);
	}

	/**
	 * Resource unit name 資源単位名.<p>
	 *
	 */
	public void rsrc_unit_nm(String value) {
		setConstString(offset + 189, $rsrc_unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber rsrc_dec_place() {
		return getConstNumber(offset + 190, $rsrc_dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void rsrc_dec_place(MCNumber value) {
		setConstNumber(offset + 190, $rsrc_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void rsrc_dec_place(int value) {
		setConstNumber(offset + 190, $rsrc_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void rsrc_dec_place(long value) {
		setConstNumber(offset + 190, $rsrc_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void rsrc_dec_place(float value) {
		setConstNumber(offset + 190, $rsrc_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void rsrc_dec_place(double value) {
		setConstNumber(offset + 190, $rsrc_dec_place, value);
	}


	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public String rsrc_rnd_typ() {
		return getConstString(offset + 191, $rsrc_rnd_typ);
	}

	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public void rsrc_rnd_typ(String value) {
		setConstString(offset + 191, $rsrc_rnd_typ, value);
	}


	/**
	 * HS classification cd. ＨＳ分類ＣＤ.<p>
	 *
	 */
	public String hs_grp_cd() {
		return getConstString(offset + 192, $hs_grp_cd);
	}

	/**
	 * HS classification cd. ＨＳ分類ＣＤ.<p>
	 *
	 */
	public void hs_grp_cd(String value) {
		setConstString(offset + 192, $hs_grp_cd, value);
	}


	/**
	 * Standard HS classification name 標準ＨＳ分類名.<p>
	 *
	 */
	public String hs_grp_nm() {
		return getConstString(offset + 193, $hs_grp_nm);
	}

	/**
	 * Standard HS classification name 標準ＨＳ分類名.<p>
	 *
	 */
	public void hs_grp_nm(String value) {
		setConstString(offset + 193, $hs_grp_nm, value);
	}


	/**
	 * HS type ＨＳ区分.<p>
	 *
	 */
	public String hs_typ() {
		return getConstString(offset + 194, $hs_typ);
	}

	/**
	 * HS type ＨＳ区分.<p>
	 *
	 */
	public void hs_typ(String value) {
		setConstString(offset + 194, $hs_typ, value);
	}


	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public String alc_ptn_cd() {
		return getConstString(offset + 195, $alc_ptn_cd);
	}

	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public void alc_ptn_cd(String value) {
		setConstString(offset + 195, $alc_ptn_cd, value);
	}


	/**
	 * Standard allocation pattern name 標準配賦パタン名.<p>
	 *
	 */
	public String alc_ptn_nm() {
		return getConstString(offset + 196, $alc_ptn_nm);
	}

	/**
	 * Standard allocation pattern name 標準配賦パタン名.<p>
	 *
	 */
	public void alc_ptn_nm(String value) {
		setConstString(offset + 196, $alc_ptn_nm, value);
	}


	/**
	 * Item category group cd. 品群グループＣＤ.<p>
	 *
	 */
	public String ctg_grp_cd() {
		return getConstString(offset + 197, $ctg_grp_cd);
	}

	/**
	 * Item category group cd. 品群グループＣＤ.<p>
	 *
	 */
	public void ctg_grp_cd(String value) {
		setConstString(offset + 197, $ctg_grp_cd, value);
	}


	/**
	 * Standard item category group name 標準品群グループ名.<p>
	 *
	 */
	public String ctg_grp_nm() {
		return getConstString(offset + 198, $ctg_grp_nm);
	}

	/**
	 * Standard item category group name 標準品群グループ名.<p>
	 *
	 */
	public void ctg_grp_nm(String value) {
		setConstString(offset + 198, $ctg_grp_nm, value);
	}


	/**
	 * Calculation run pattern cd. 計算実行パタンＣＤ.<p>
	 *
	 */
	public String act_ptn_cd() {
		return getConstString(offset + 199, $act_ptn_cd);
	}

	/**
	 * Calculation run pattern cd. 計算実行パタンＣＤ.<p>
	 *
	 */
	public void act_ptn_cd(String value) {
		setConstString(offset + 199, $act_ptn_cd, value);
	}


	/**
	 * Standard calculation run pattern name 標準計算実行パタン名.<p>
	 *
	 */
	public String act_ptn_nm() {
		return getConstString(offset + 200, $act_ptn_nm);
	}

	/**
	 * Standard calculation run pattern name 標準計算実行パタン名.<p>
	 *
	 */
	public void act_ptn_nm(String value) {
		setConstString(offset + 200, $act_ptn_nm, value);
	}


	/**
	 * General purpose allocation classification cd. 汎用配賦分類ＣＤ.<p>
	 *
	 */
	public String gp_alc_cd() {
		return getConstString(offset + 201, $gp_alc_cd);
	}

	/**
	 * General purpose allocation classification cd. 汎用配賦分類ＣＤ.<p>
	 *
	 */
	public void gp_alc_cd(String value) {
		setConstString(offset + 201, $gp_alc_cd, value);
	}


	/**
	 * Standard general purpose allocation classification name 標準汎用配賦分類名.<p>
	 *
	 */
	public String gp_alc_nm() {
		return getConstString(offset + 202, $gp_alc_nm);
	}

	/**
	 * Standard general purpose allocation classification name 標準汎用配賦分類名.<p>
	 *
	 */
	public void gp_alc_nm(String value) {
		setConstString(offset + 202, $gp_alc_nm, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 203, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 203, $calc_ctg_cd, value);
	}


	/**
	 * Standard calculation category name 標準計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 204, $calc_ctg_nm);
	}

	/**
	 * Standard calculation category name 標準計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 204, $calc_ctg_nm, value);
	}


	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public String rpt_ptn_cd() {
		return getConstString(offset + 205, $rpt_ptn_cd);
	}

	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public void rpt_ptn_cd(String value) {
		setConstString(offset + 205, $rpt_ptn_cd, value);
	}


	/**
	 * Standard Report pattern name 標準レポートパタン名.<p>
	 *
	 */
	public String rpt_ptn_nm() {
		return getConstString(offset + 206, $rpt_ptn_nm);
	}

	/**
	 * Standard Report pattern name 標準レポートパタン名.<p>
	 *
	 */
	public void rpt_ptn_nm(String value) {
		setConstString(offset + 206, $rpt_ptn_nm, value);
	}


	/**
	 * Menu cd. メニューＣＤ.<p>
	 *
	 */
	public String menu_cd() {
		return getConstString(offset + 207, $menu_cd);
	}

	/**
	 * Menu cd. メニューＣＤ.<p>
	 *
	 */
	public void menu_cd(String value) {
		setConstString(offset + 207, $menu_cd, value);
	}


	/**
	 * Standard Menu name 標準メニュー名.<p>
	 *
	 */
	public String menu_nm() {
		return getConstString(offset + 208, $menu_nm);
	}

	/**
	 * Standard Menu name 標準メニュー名.<p>
	 *
	 */
	public void menu_nm(String value) {
		setConstString(offset + 208, $menu_nm, value);
	}


	/**
	 * Warehousing business cd. 倉庫事業者ＣＤ.<p>
	 *
	 */
	public String site_co_cd() {
		return getConstString(offset + 209, $site_co_cd);
	}

	/**
	 * Warehousing business cd. 倉庫事業者ＣＤ.<p>
	 *
	 */
	public void site_co_cd(String value) {
		setConstString(offset + 209, $site_co_cd, value);
	}


	/**
	 * Standard warehousing business name 標準倉庫事業者名.<p>
	 *
	 */
	public String site_co_nm() {
		return getConstString(offset + 210, $site_co_nm);
	}

	/**
	 * Standard warehousing business name 標準倉庫事業者名.<p>
	 *
	 */
	public void site_co_nm(String value) {
		setConstString(offset + 210, $site_co_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 211, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 211, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 212, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 212, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 213, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 213, $memo3, value);
	}


	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 214, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 214, $del_flg, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 215, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 215, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 215, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 215, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 215, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 215, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($da_cd.equalsIgnoreCase(name)) {
			return da_cd();
		}
		if ($da_nm.equalsIgnoreCase(name)) {
			return da_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($def_dpt_nm.equalsIgnoreCase(name)) {
			return def_dpt_nm();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			return dpt_lvl_nm();
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			return aprv_role_nm();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			return area_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($unit_rnd_typ.equalsIgnoreCase(name)) {
			return unit_rnd_typ();
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			return bank_nm();
		}
		if ($bank_cal_cd.equalsIgnoreCase(name)) {
			return bank_cal_cd();
		}
		if ($bank_branch_bank_cd.equalsIgnoreCase(name)) {
			return bank_branch_bank_cd();
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			return branch_cd();
		}
		if ($branch_nm.equalsIgnoreCase(name)) {
			return branch_nm();
		}
		if ($bank_branch_cal_cd.equalsIgnoreCase(name)) {
			return bank_branch_cal_cd();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($bank_ac_bank_cd.equalsIgnoreCase(name)) {
			return bank_ac_bank_cd();
		}
		if ($bank_ac_branch_cd.equalsIgnoreCase(name)) {
			return bank_ac_branch_cd();
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			return bank_ac_no();
		}
		if ($bank_ac_typ.equalsIgnoreCase(name)) {
			return bank_ac_typ();
		}
		if ($bank_ac_holder.equalsIgnoreCase(name)) {
			return bank_ac_holder();
		}
		if ($bank_ac_holder_sub.equalsIgnoreCase(name)) {
			return bank_ac_holder_sub();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			return xrate_nm();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			return cal_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			return ac_itm_grp_cd();
		}
		if ($ac_itm_grp_nm.equalsIgnoreCase(name)) {
			return ac_itm_grp_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($ac_rsn_ar_typ.equalsIgnoreCase(name)) {
			return ac_rsn_ar_typ();
		}
		if ($ac_rsn_ap_typ.equalsIgnoreCase(name)) {
			return ac_rsn_ap_typ();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($def_loc_grp_cd.equalsIgnoreCase(name)) {
			return def_loc_grp_cd();
		}
		if ($def_alloc_grp_cd.equalsIgnoreCase(name)) {
			return def_alloc_grp_cd();
		}
		if ($def_lg_grp_cd.equalsIgnoreCase(name)) {
			return def_lg_grp_cd();
		}
		if ($def_cal_cd.equalsIgnoreCase(name)) {
			return def_cal_cd();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($loc_grp_wg_cd.equalsIgnoreCase(name)) {
			return loc_grp_wg_cd();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($lg_grp_wg_cd.equalsIgnoreCase(name)) {
			return lg_grp_wg_cd();
		}
		if ($lg_grp_cal_cd.equalsIgnoreCase(name)) {
			return lg_grp_cal_cd();
		}
		if ($lg_grp_site_co_cd.equalsIgnoreCase(name)) {
			return lg_grp_site_co_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mrp_prefix.equalsIgnoreCase(name)) {
			return mrp_prefix();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			return mrp_proc_typ();
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			return rqmt_typ();
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			return prod_pln_typ();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($oper_alc_grp.equalsIgnoreCase(name)) {
			return oper_alc_grp();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			return wk_cost_nm();
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			return wk_cost_unit_nm();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			return wk_rsn_cd();
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			return wk_rsn_nm();
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			return sls_upri_grp_cd();
		}
		if ($sls_upri_grp_nm.equalsIgnoreCase(name)) {
			return sls_upri_grp_nm();
		}
		if ($sls_upri_rank_cd.equalsIgnoreCase(name)) {
			return sls_upri_rank_cd();
		}
		if ($sls_upri_rank_nm.equalsIgnoreCase(name)) {
			return sls_upri_rank_nm();
		}
		if ($setoff_grp_cd.equalsIgnoreCase(name)) {
			return setoff_grp_cd();
		}
		if ($setoff_grp_nm.equalsIgnoreCase(name)) {
			return setoff_grp_nm();
		}
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			return ship_valid_grp_cd();
		}
		if ($ship_valid_grp_nm.equalsIgnoreCase(name)) {
			return ship_valid_grp_nm();
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			return itm_ship_grp_cd();
		}
		if ($itm_ship_grp_nm.equalsIgnoreCase(name)) {
			return itm_ship_grp_nm();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($cntnr_cd.equalsIgnoreCase(name)) {
			return cntnr_cd();
		}
		if ($cntnr_nm.equalsIgnoreCase(name)) {
			return cntnr_nm();
		}
		if ($port_cd.equalsIgnoreCase(name)) {
			return port_cd();
		}
		if ($port_nm.equalsIgnoreCase(name)) {
			return port_nm();
		}
		if ($port_cntry_cd.equalsIgnoreCase(name)) {
			return port_cntry_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
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
		if ($trd_ac_rsn_cd.equalsIgnoreCase(name)) {
			return trd_ac_rsn_cd();
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			return slip_each_lot_typ();
		}
		if ($trd_slip_form_cd.equalsIgnoreCase(name)) {
			return trd_slip_form_cd();
		}
		if ($slip_form_cd.equalsIgnoreCase(name)) {
			return slip_form_cd();
		}
		if ($slip_form_nm.equalsIgnoreCase(name)) {
			return slip_form_nm();
		}
		if ($slip_form_id.equalsIgnoreCase(name)) {
			return slip_form_id();
		}
		if ($copy_slip_form_id.equalsIgnoreCase(name)) {
			return copy_slip_form_id();
		}
		if ($pf_grp_cd.equalsIgnoreCase(name)) {
			return pf_grp_cd();
		}
		if ($pf_grp_nm.equalsIgnoreCase(name)) {
			return pf_grp_nm();
		}
		if ($itm_spec_grp_cd.equalsIgnoreCase(name)) {
			return itm_spec_grp_cd();
		}
		if ($itm_spec_grp_nm.equalsIgnoreCase(name)) {
			return itm_spec_grp_nm();
		}
		if ($itm_comp_grp_cd.equalsIgnoreCase(name)) {
			return itm_comp_grp_cd();
		}
		if ($itm_comp_grp_nm.equalsIgnoreCase(name)) {
			return itm_comp_grp_nm();
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			return jnl_act_cd();
		}
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			return jnl_act_nm();
		}
		if ($jnl_grp_cd.equalsIgnoreCase(name)) {
			return jnl_grp_cd();
		}
		if ($jnl_grp_nm.equalsIgnoreCase(name)) {
			return jnl_grp_nm();
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			return jnl_ptn_cd();
		}
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			return jnl_ptn_nm();
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			return auto_jnl_key_cd();
		}
		if ($auto_jnl_key_nm.equalsIgnoreCase(name)) {
			return auto_jnl_key_nm();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			return wk_day_cd();
		}
		if ($wk_day_nm.equalsIgnoreCase(name)) {
			return wk_day_nm();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			return ship_wk_nm();
		}
		if ($ship_wk_cal_cd.equalsIgnoreCase(name)) {
			return ship_wk_cal_cd();
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			return rsrc_cd();
		}
		if ($rsrc_nm.equalsIgnoreCase(name)) {
			return rsrc_nm();
		}
		if ($rsrc_unit_nm.equalsIgnoreCase(name)) {
			return rsrc_unit_nm();
		}
		if ($rsrc_rnd_typ.equalsIgnoreCase(name)) {
			return rsrc_rnd_typ();
		}
		if ($hs_grp_cd.equalsIgnoreCase(name)) {
			return hs_grp_cd();
		}
		if ($hs_grp_nm.equalsIgnoreCase(name)) {
			return hs_grp_nm();
		}
		if ($hs_typ.equalsIgnoreCase(name)) {
			return hs_typ();
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			return alc_ptn_cd();
		}
		if ($alc_ptn_nm.equalsIgnoreCase(name)) {
			return alc_ptn_nm();
		}
		if ($ctg_grp_cd.equalsIgnoreCase(name)) {
			return ctg_grp_cd();
		}
		if ($ctg_grp_nm.equalsIgnoreCase(name)) {
			return ctg_grp_nm();
		}
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			return act_ptn_cd();
		}
		if ($act_ptn_nm.equalsIgnoreCase(name)) {
			return act_ptn_nm();
		}
		if ($gp_alc_cd.equalsIgnoreCase(name)) {
			return gp_alc_cd();
		}
		if ($gp_alc_nm.equalsIgnoreCase(name)) {
			return gp_alc_nm();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			return rpt_ptn_cd();
		}
		if ($rpt_ptn_nm.equalsIgnoreCase(name)) {
			return rpt_ptn_nm();
		}
		if ($menu_cd.equalsIgnoreCase(name)) {
			return menu_cd();
		}
		if ($menu_nm.equalsIgnoreCase(name)) {
			return menu_nm();
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			return site_co_cd();
		}
		if ($site_co_nm.equalsIgnoreCase(name)) {
			return site_co_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			return alloc_margin_days();
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			return mrp_alloc_margin_days();
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			return mrp_opn_xfr_days();
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons();
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			return calc_seq();
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			return wk_cost_dec_place();
		}
		if ($trnspt_sort_seq.equalsIgnoreCase(name)) {
			return trnspt_sort_seq();
		}
		if ($wt.equalsIgnoreCase(name)) {
			return wt();
		}
		if ($sort_seq.equalsIgnoreCase(name)) {
			return sort_seq();
		}
		if ($line_num.equalsIgnoreCase(name)) {
			return line_num();
		}
		if ($weekly_period_num.equalsIgnoreCase(name)) {
			return weekly_period_num();
		}
		if ($weekly_period_st.equalsIgnoreCase(name)) {
			return weekly_period_st();
		}
		if ($tendays_period_num.equalsIgnoreCase(name)) {
			return tendays_period_num();
		}
		if ($tendays_period_st.equalsIgnoreCase(name)) {
			return tendays_period_st();
		}
		if ($monthly_period_num.equalsIgnoreCase(name)) {
			return monthly_period_num();
		}
		if ($monthly_period_st.equalsIgnoreCase(name)) {
			return monthly_period_st();
		}
		if ($fix_period_num.equalsIgnoreCase(name)) {
			return fix_period_num();
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			return rsrc_dec_place();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($ext_flg.equalsIgnoreCase(name)) {
			return ext_flg();
		}
		if ($ac_invalid_flg.equalsIgnoreCase(name)) {
			return ac_invalid_flg();
		}
		if ($cost_invalid_flg.equalsIgnoreCase(name)) {
			return cost_invalid_flg();
		}
		if ($arr_flg.equalsIgnoreCase(name)) {
			return arr_flg();
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($ship_slip_flg.equalsIgnoreCase(name)) {
			return ship_slip_flg();
		}
		if ($pick_list_flg.equalsIgnoreCase(name)) {
			return pick_list_flg();
		}
		if ($ship_inst_flg.equalsIgnoreCase(name)) {
			return ship_inst_flg();
		}
		if ($ship_slip_act_flg.equalsIgnoreCase(name)) {
			return ship_slip_act_flg();
		}
		if ($gi_minus_stk_chk_flg.equalsIgnoreCase(name)) {
			return gi_minus_stk_chk_flg();
		}
		if ($ship_loc_prio_flg.equalsIgnoreCase(name)) {
			return ship_loc_prio_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($lg_flg.equalsIgnoreCase(name)) {
			return lg_flg();
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($ar_flg.equalsIgnoreCase(name)) {
			return ar_flg();
		}
		if ($ap_flg.equalsIgnoreCase(name)) {
			return ap_flg();
		}
		if ($sd_flg.equalsIgnoreCase(name)) {
			return sd_flg();
		}
		if ($not_xfr_flg.equalsIgnoreCase(name)) {
			return not_xfr_flg();
		}
		if ($plm_flg.equalsIgnoreCase(name)) {
			return plm_flg();
		}
		if ($cmn_upri_flg.equalsIgnoreCase(name)) {
			return cmn_upri_flg();
		}
		if ($slo_flg.equalsIgnoreCase(name)) {
			return slo_flg();
		}
		if ($auto_adopt_flg.equalsIgnoreCase(name)) {
			return auto_adopt_flg();
		}
		if ($not_sls_slip_snd_flg.equalsIgnoreCase(name)) {
			return not_sls_slip_snd_flg();
		}
		if ($not_purc_slip_snd_flg.equalsIgnoreCase(name)) {
			return not_purc_slip_snd_flg();
		}
		if ($multi_sel_flg.equalsIgnoreCase(name)) {
			return multi_sel_flg();
		}
		if ($req_flg.equalsIgnoreCase(name)) {
			return req_flg();
		}
		if ($jnl_del_flg.equalsIgnoreCase(name)) {
			return jnl_del_flg();
		}
		if ($ac_bank_flg1.equalsIgnoreCase(name)) {
			return ac_bank_flg1();
		}
		if ($ac_bank_flg2.equalsIgnoreCase(name)) {
			return ac_bank_flg2();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($da_cd.equalsIgnoreCase(name)) {
			return da_cd();
		}
		if ($da_nm.equalsIgnoreCase(name)) {
			return da_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($def_dpt_nm.equalsIgnoreCase(name)) {
			return def_dpt_nm();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			return dpt_lvl_nm();
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			return aprv_role_nm();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			return area_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($unit_rnd_typ.equalsIgnoreCase(name)) {
			return unit_rnd_typ();
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			return bank_nm();
		}
		if ($bank_cal_cd.equalsIgnoreCase(name)) {
			return bank_cal_cd();
		}
		if ($bank_branch_bank_cd.equalsIgnoreCase(name)) {
			return bank_branch_bank_cd();
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			return branch_cd();
		}
		if ($branch_nm.equalsIgnoreCase(name)) {
			return branch_nm();
		}
		if ($bank_branch_cal_cd.equalsIgnoreCase(name)) {
			return bank_branch_cal_cd();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($bank_ac_bank_cd.equalsIgnoreCase(name)) {
			return bank_ac_bank_cd();
		}
		if ($bank_ac_branch_cd.equalsIgnoreCase(name)) {
			return bank_ac_branch_cd();
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			return bank_ac_no();
		}
		if ($bank_ac_typ.equalsIgnoreCase(name)) {
			return bank_ac_typ();
		}
		if ($bank_ac_holder.equalsIgnoreCase(name)) {
			return bank_ac_holder();
		}
		if ($bank_ac_holder_sub.equalsIgnoreCase(name)) {
			return bank_ac_holder_sub();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			return xrate_nm();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			return cal_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			return ac_itm_grp_cd();
		}
		if ($ac_itm_grp_nm.equalsIgnoreCase(name)) {
			return ac_itm_grp_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($ac_rsn_ar_typ.equalsIgnoreCase(name)) {
			return ac_rsn_ar_typ();
		}
		if ($ac_rsn_ap_typ.equalsIgnoreCase(name)) {
			return ac_rsn_ap_typ();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($def_loc_grp_cd.equalsIgnoreCase(name)) {
			return def_loc_grp_cd();
		}
		if ($def_alloc_grp_cd.equalsIgnoreCase(name)) {
			return def_alloc_grp_cd();
		}
		if ($def_lg_grp_cd.equalsIgnoreCase(name)) {
			return def_lg_grp_cd();
		}
		if ($def_cal_cd.equalsIgnoreCase(name)) {
			return def_cal_cd();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($loc_grp_wg_cd.equalsIgnoreCase(name)) {
			return loc_grp_wg_cd();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($lg_grp_wg_cd.equalsIgnoreCase(name)) {
			return lg_grp_wg_cd();
		}
		if ($lg_grp_cal_cd.equalsIgnoreCase(name)) {
			return lg_grp_cal_cd();
		}
		if ($lg_grp_site_co_cd.equalsIgnoreCase(name)) {
			return lg_grp_site_co_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mrp_prefix.equalsIgnoreCase(name)) {
			return mrp_prefix();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			return mrp_proc_typ();
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			return rqmt_typ();
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			return prod_pln_typ();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($oper_alc_grp.equalsIgnoreCase(name)) {
			return oper_alc_grp();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			return wk_cost_nm();
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			return wk_cost_unit_nm();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			return wk_rsn_cd();
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			return wk_rsn_nm();
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			return sls_upri_grp_cd();
		}
		if ($sls_upri_grp_nm.equalsIgnoreCase(name)) {
			return sls_upri_grp_nm();
		}
		if ($sls_upri_rank_cd.equalsIgnoreCase(name)) {
			return sls_upri_rank_cd();
		}
		if ($sls_upri_rank_nm.equalsIgnoreCase(name)) {
			return sls_upri_rank_nm();
		}
		if ($setoff_grp_cd.equalsIgnoreCase(name)) {
			return setoff_grp_cd();
		}
		if ($setoff_grp_nm.equalsIgnoreCase(name)) {
			return setoff_grp_nm();
		}
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			return ship_valid_grp_cd();
		}
		if ($ship_valid_grp_nm.equalsIgnoreCase(name)) {
			return ship_valid_grp_nm();
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			return itm_ship_grp_cd();
		}
		if ($itm_ship_grp_nm.equalsIgnoreCase(name)) {
			return itm_ship_grp_nm();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($cntnr_cd.equalsIgnoreCase(name)) {
			return cntnr_cd();
		}
		if ($cntnr_nm.equalsIgnoreCase(name)) {
			return cntnr_nm();
		}
		if ($port_cd.equalsIgnoreCase(name)) {
			return port_cd();
		}
		if ($port_nm.equalsIgnoreCase(name)) {
			return port_nm();
		}
		if ($port_cntry_cd.equalsIgnoreCase(name)) {
			return port_cntry_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
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
		if ($trd_ac_rsn_cd.equalsIgnoreCase(name)) {
			return trd_ac_rsn_cd();
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			return slip_each_lot_typ();
		}
		if ($trd_slip_form_cd.equalsIgnoreCase(name)) {
			return trd_slip_form_cd();
		}
		if ($slip_form_cd.equalsIgnoreCase(name)) {
			return slip_form_cd();
		}
		if ($slip_form_nm.equalsIgnoreCase(name)) {
			return slip_form_nm();
		}
		if ($slip_form_id.equalsIgnoreCase(name)) {
			return slip_form_id();
		}
		if ($copy_slip_form_id.equalsIgnoreCase(name)) {
			return copy_slip_form_id();
		}
		if ($pf_grp_cd.equalsIgnoreCase(name)) {
			return pf_grp_cd();
		}
		if ($pf_grp_nm.equalsIgnoreCase(name)) {
			return pf_grp_nm();
		}
		if ($itm_spec_grp_cd.equalsIgnoreCase(name)) {
			return itm_spec_grp_cd();
		}
		if ($itm_spec_grp_nm.equalsIgnoreCase(name)) {
			return itm_spec_grp_nm();
		}
		if ($itm_comp_grp_cd.equalsIgnoreCase(name)) {
			return itm_comp_grp_cd();
		}
		if ($itm_comp_grp_nm.equalsIgnoreCase(name)) {
			return itm_comp_grp_nm();
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			return jnl_act_cd();
		}
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			return jnl_act_nm();
		}
		if ($jnl_grp_cd.equalsIgnoreCase(name)) {
			return jnl_grp_cd();
		}
		if ($jnl_grp_nm.equalsIgnoreCase(name)) {
			return jnl_grp_nm();
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			return jnl_ptn_cd();
		}
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			return jnl_ptn_nm();
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			return auto_jnl_key_cd();
		}
		if ($auto_jnl_key_nm.equalsIgnoreCase(name)) {
			return auto_jnl_key_nm();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			return wk_day_cd();
		}
		if ($wk_day_nm.equalsIgnoreCase(name)) {
			return wk_day_nm();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			return ship_wk_nm();
		}
		if ($ship_wk_cal_cd.equalsIgnoreCase(name)) {
			return ship_wk_cal_cd();
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			return rsrc_cd();
		}
		if ($rsrc_nm.equalsIgnoreCase(name)) {
			return rsrc_nm();
		}
		if ($rsrc_unit_nm.equalsIgnoreCase(name)) {
			return rsrc_unit_nm();
		}
		if ($rsrc_rnd_typ.equalsIgnoreCase(name)) {
			return rsrc_rnd_typ();
		}
		if ($hs_grp_cd.equalsIgnoreCase(name)) {
			return hs_grp_cd();
		}
		if ($hs_grp_nm.equalsIgnoreCase(name)) {
			return hs_grp_nm();
		}
		if ($hs_typ.equalsIgnoreCase(name)) {
			return hs_typ();
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			return alc_ptn_cd();
		}
		if ($alc_ptn_nm.equalsIgnoreCase(name)) {
			return alc_ptn_nm();
		}
		if ($ctg_grp_cd.equalsIgnoreCase(name)) {
			return ctg_grp_cd();
		}
		if ($ctg_grp_nm.equalsIgnoreCase(name)) {
			return ctg_grp_nm();
		}
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			return act_ptn_cd();
		}
		if ($act_ptn_nm.equalsIgnoreCase(name)) {
			return act_ptn_nm();
		}
		if ($gp_alc_cd.equalsIgnoreCase(name)) {
			return gp_alc_cd();
		}
		if ($gp_alc_nm.equalsIgnoreCase(name)) {
			return gp_alc_nm();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			return rpt_ptn_cd();
		}
		if ($rpt_ptn_nm.equalsIgnoreCase(name)) {
			return rpt_ptn_nm();
		}
		if ($menu_cd.equalsIgnoreCase(name)) {
			return menu_cd();
		}
		if ($menu_nm.equalsIgnoreCase(name)) {
			return menu_nm();
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			return site_co_cd();
		}
		if ($site_co_nm.equalsIgnoreCase(name)) {
			return site_co_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			return alloc_margin_days();
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			return mrp_alloc_margin_days();
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			return mrp_opn_xfr_days();
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons();
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			return calc_seq();
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			return wk_cost_dec_place();
		}
		if ($trnspt_sort_seq.equalsIgnoreCase(name)) {
			return trnspt_sort_seq();
		}
		if ($wt.equalsIgnoreCase(name)) {
			return wt();
		}
		if ($sort_seq.equalsIgnoreCase(name)) {
			return sort_seq();
		}
		if ($line_num.equalsIgnoreCase(name)) {
			return line_num();
		}
		if ($weekly_period_num.equalsIgnoreCase(name)) {
			return weekly_period_num();
		}
		if ($weekly_period_st.equalsIgnoreCase(name)) {
			return weekly_period_st();
		}
		if ($tendays_period_num.equalsIgnoreCase(name)) {
			return tendays_period_num();
		}
		if ($tendays_period_st.equalsIgnoreCase(name)) {
			return tendays_period_st();
		}
		if ($monthly_period_num.equalsIgnoreCase(name)) {
			return monthly_period_num();
		}
		if ($monthly_period_st.equalsIgnoreCase(name)) {
			return monthly_period_st();
		}
		if ($fix_period_num.equalsIgnoreCase(name)) {
			return fix_period_num();
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			return rsrc_dec_place();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ext_flg.equalsIgnoreCase(name)) {
			return ext_flg();
		}
		if ($ac_invalid_flg.equalsIgnoreCase(name)) {
			return ac_invalid_flg();
		}
		if ($cost_invalid_flg.equalsIgnoreCase(name)) {
			return cost_invalid_flg();
		}
		if ($arr_flg.equalsIgnoreCase(name)) {
			return arr_flg();
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($ship_slip_flg.equalsIgnoreCase(name)) {
			return ship_slip_flg();
		}
		if ($pick_list_flg.equalsIgnoreCase(name)) {
			return pick_list_flg();
		}
		if ($ship_inst_flg.equalsIgnoreCase(name)) {
			return ship_inst_flg();
		}
		if ($ship_slip_act_flg.equalsIgnoreCase(name)) {
			return ship_slip_act_flg();
		}
		if ($gi_minus_stk_chk_flg.equalsIgnoreCase(name)) {
			return gi_minus_stk_chk_flg();
		}
		if ($ship_loc_prio_flg.equalsIgnoreCase(name)) {
			return ship_loc_prio_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($lg_flg.equalsIgnoreCase(name)) {
			return lg_flg();
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($ar_flg.equalsIgnoreCase(name)) {
			return ar_flg();
		}
		if ($ap_flg.equalsIgnoreCase(name)) {
			return ap_flg();
		}
		if ($sd_flg.equalsIgnoreCase(name)) {
			return sd_flg();
		}
		if ($not_xfr_flg.equalsIgnoreCase(name)) {
			return not_xfr_flg();
		}
		if ($plm_flg.equalsIgnoreCase(name)) {
			return plm_flg();
		}
		if ($cmn_upri_flg.equalsIgnoreCase(name)) {
			return cmn_upri_flg();
		}
		if ($slo_flg.equalsIgnoreCase(name)) {
			return slo_flg();
		}
		if ($auto_adopt_flg.equalsIgnoreCase(name)) {
			return auto_adopt_flg();
		}
		if ($not_sls_slip_snd_flg.equalsIgnoreCase(name)) {
			return not_sls_slip_snd_flg();
		}
		if ($not_purc_slip_snd_flg.equalsIgnoreCase(name)) {
			return not_purc_slip_snd_flg();
		}
		if ($multi_sel_flg.equalsIgnoreCase(name)) {
			return multi_sel_flg();
		}
		if ($req_flg.equalsIgnoreCase(name)) {
			return req_flg();
		}
		if ($jnl_del_flg.equalsIgnoreCase(name)) {
			return jnl_del_flg();
		}
		if ($ac_bank_flg1.equalsIgnoreCase(name)) {
			return ac_bank_flg1();
		}
		if ($ac_bank_flg2.equalsIgnoreCase(name)) {
			return ac_bank_flg2();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($da_cd.equalsIgnoreCase(name)) {
			da_cd(value);
			return;
		}
		if ($da_nm.equalsIgnoreCase(name)) {
			da_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($def_dpt_nm.equalsIgnoreCase(name)) {
			def_dpt_nm(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			dpt_lvl_nm(value);
			return;
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			aprv_role_cd(value);
			return;
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			aprv_role_nm(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			area_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
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
		if ($unit_rnd_typ.equalsIgnoreCase(name)) {
			unit_rnd_typ(value);
			return;
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			bank_cd(value);
			return;
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			bank_nm(value);
			return;
		}
		if ($bank_cal_cd.equalsIgnoreCase(name)) {
			bank_cal_cd(value);
			return;
		}
		if ($bank_branch_bank_cd.equalsIgnoreCase(name)) {
			bank_branch_bank_cd(value);
			return;
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			branch_cd(value);
			return;
		}
		if ($branch_nm.equalsIgnoreCase(name)) {
			branch_nm(value);
			return;
		}
		if ($bank_branch_cal_cd.equalsIgnoreCase(name)) {
			bank_branch_cal_cd(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($bank_ac_bank_cd.equalsIgnoreCase(name)) {
			bank_ac_bank_cd(value);
			return;
		}
		if ($bank_ac_branch_cd.equalsIgnoreCase(name)) {
			bank_ac_branch_cd(value);
			return;
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			bank_ac_no(value);
			return;
		}
		if ($bank_ac_typ.equalsIgnoreCase(name)) {
			bank_ac_typ(value);
			return;
		}
		if ($bank_ac_holder.equalsIgnoreCase(name)) {
			bank_ac_holder(value);
			return;
		}
		if ($bank_ac_holder_sub.equalsIgnoreCase(name)) {
			bank_ac_holder_sub(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			xrate_nm(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			cal_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			ac_itm_grp_cd(value);
			return;
		}
		if ($ac_itm_grp_nm.equalsIgnoreCase(name)) {
			ac_itm_grp_nm(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($ac_rsn_ar_typ.equalsIgnoreCase(name)) {
			ac_rsn_ar_typ(value);
			return;
		}
		if ($ac_rsn_ap_typ.equalsIgnoreCase(name)) {
			ac_rsn_ap_typ(value);
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
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($def_loc_grp_cd.equalsIgnoreCase(name)) {
			def_loc_grp_cd(value);
			return;
		}
		if ($def_alloc_grp_cd.equalsIgnoreCase(name)) {
			def_alloc_grp_cd(value);
			return;
		}
		if ($def_lg_grp_cd.equalsIgnoreCase(name)) {
			def_lg_grp_cd(value);
			return;
		}
		if ($def_cal_cd.equalsIgnoreCase(name)) {
			def_cal_cd(value);
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
		if ($loc_grp_wg_cd.equalsIgnoreCase(name)) {
			loc_grp_wg_cd(value);
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
		if ($lg_grp_wg_cd.equalsIgnoreCase(name)) {
			lg_grp_wg_cd(value);
			return;
		}
		if ($lg_grp_cal_cd.equalsIgnoreCase(name)) {
			lg_grp_cal_cd(value);
			return;
		}
		if ($lg_grp_site_co_cd.equalsIgnoreCase(name)) {
			lg_grp_site_co_cd(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mrp_prefix.equalsIgnoreCase(name)) {
			mrp_prefix(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			mrp_proc_typ(value);
			return;
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			rqmt_typ(value);
			return;
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			prod_pln_typ(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($oper_alc_grp.equalsIgnoreCase(name)) {
			oper_alc_grp(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			wk_cost_nm(value);
			return;
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			wk_cost_unit_nm(value);
			return;
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
			return;
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			wk_rsn_cd(value);
			return;
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			wk_rsn_nm(value);
			return;
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			sls_upri_grp_cd(value);
			return;
		}
		if ($sls_upri_grp_nm.equalsIgnoreCase(name)) {
			sls_upri_grp_nm(value);
			return;
		}
		if ($sls_upri_rank_cd.equalsIgnoreCase(name)) {
			sls_upri_rank_cd(value);
			return;
		}
		if ($sls_upri_rank_nm.equalsIgnoreCase(name)) {
			sls_upri_rank_nm(value);
			return;
		}
		if ($setoff_grp_cd.equalsIgnoreCase(name)) {
			setoff_grp_cd(value);
			return;
		}
		if ($setoff_grp_nm.equalsIgnoreCase(name)) {
			setoff_grp_nm(value);
			return;
		}
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			ship_valid_grp_cd(value);
			return;
		}
		if ($ship_valid_grp_nm.equalsIgnoreCase(name)) {
			ship_valid_grp_nm(value);
			return;
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			itm_ship_grp_cd(value);
			return;
		}
		if ($itm_ship_grp_nm.equalsIgnoreCase(name)) {
			itm_ship_grp_nm(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			trnspt_nm(value);
			return;
		}
		if ($cntnr_cd.equalsIgnoreCase(name)) {
			cntnr_cd(value);
			return;
		}
		if ($cntnr_nm.equalsIgnoreCase(name)) {
			cntnr_nm(value);
			return;
		}
		if ($port_cd.equalsIgnoreCase(name)) {
			port_cd(value);
			return;
		}
		if ($port_nm.equalsIgnoreCase(name)) {
			port_nm(value);
			return;
		}
		if ($port_cntry_cd.equalsIgnoreCase(name)) {
			port_cntry_cd(value);
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
		if ($trd_ac_rsn_cd.equalsIgnoreCase(name)) {
			trd_ac_rsn_cd(value);
			return;
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			slip_each_lot_typ(value);
			return;
		}
		if ($trd_slip_form_cd.equalsIgnoreCase(name)) {
			trd_slip_form_cd(value);
			return;
		}
		if ($slip_form_cd.equalsIgnoreCase(name)) {
			slip_form_cd(value);
			return;
		}
		if ($slip_form_nm.equalsIgnoreCase(name)) {
			slip_form_nm(value);
			return;
		}
		if ($slip_form_id.equalsIgnoreCase(name)) {
			slip_form_id(value);
			return;
		}
		if ($copy_slip_form_id.equalsIgnoreCase(name)) {
			copy_slip_form_id(value);
			return;
		}
		if ($pf_grp_cd.equalsIgnoreCase(name)) {
			pf_grp_cd(value);
			return;
		}
		if ($pf_grp_nm.equalsIgnoreCase(name)) {
			pf_grp_nm(value);
			return;
		}
		if ($itm_spec_grp_cd.equalsIgnoreCase(name)) {
			itm_spec_grp_cd(value);
			return;
		}
		if ($itm_spec_grp_nm.equalsIgnoreCase(name)) {
			itm_spec_grp_nm(value);
			return;
		}
		if ($itm_comp_grp_cd.equalsIgnoreCase(name)) {
			itm_comp_grp_cd(value);
			return;
		}
		if ($itm_comp_grp_nm.equalsIgnoreCase(name)) {
			itm_comp_grp_nm(value);
			return;
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			jnl_act_cd(value);
			return;
		}
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			jnl_act_nm(value);
			return;
		}
		if ($jnl_grp_cd.equalsIgnoreCase(name)) {
			jnl_grp_cd(value);
			return;
		}
		if ($jnl_grp_nm.equalsIgnoreCase(name)) {
			jnl_grp_nm(value);
			return;
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			jnl_ptn_cd(value);
			return;
		}
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			jnl_ptn_nm(value);
			return;
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			auto_jnl_key_cd(value);
			return;
		}
		if ($auto_jnl_key_nm.equalsIgnoreCase(name)) {
			auto_jnl_key_nm(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			wk_day_cd(value);
			return;
		}
		if ($wk_day_nm.equalsIgnoreCase(name)) {
			wk_day_nm(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			ship_wk_nm(value);
			return;
		}
		if ($ship_wk_cal_cd.equalsIgnoreCase(name)) {
			ship_wk_cal_cd(value);
			return;
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			rsrc_cd(value);
			return;
		}
		if ($rsrc_nm.equalsIgnoreCase(name)) {
			rsrc_nm(value);
			return;
		}
		if ($rsrc_unit_nm.equalsIgnoreCase(name)) {
			rsrc_unit_nm(value);
			return;
		}
		if ($rsrc_rnd_typ.equalsIgnoreCase(name)) {
			rsrc_rnd_typ(value);
			return;
		}
		if ($hs_grp_cd.equalsIgnoreCase(name)) {
			hs_grp_cd(value);
			return;
		}
		if ($hs_grp_nm.equalsIgnoreCase(name)) {
			hs_grp_nm(value);
			return;
		}
		if ($hs_typ.equalsIgnoreCase(name)) {
			hs_typ(value);
			return;
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			alc_ptn_cd(value);
			return;
		}
		if ($alc_ptn_nm.equalsIgnoreCase(name)) {
			alc_ptn_nm(value);
			return;
		}
		if ($ctg_grp_cd.equalsIgnoreCase(name)) {
			ctg_grp_cd(value);
			return;
		}
		if ($ctg_grp_nm.equalsIgnoreCase(name)) {
			ctg_grp_nm(value);
			return;
		}
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			act_ptn_cd(value);
			return;
		}
		if ($act_ptn_nm.equalsIgnoreCase(name)) {
			act_ptn_nm(value);
			return;
		}
		if ($gp_alc_cd.equalsIgnoreCase(name)) {
			gp_alc_cd(value);
			return;
		}
		if ($gp_alc_nm.equalsIgnoreCase(name)) {
			gp_alc_nm(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			rpt_ptn_cd(value);
			return;
		}
		if ($rpt_ptn_nm.equalsIgnoreCase(name)) {
			rpt_ptn_nm(value);
			return;
		}
		if ($menu_cd.equalsIgnoreCase(name)) {
			menu_cd(value);
			return;
		}
		if ($menu_nm.equalsIgnoreCase(name)) {
			menu_nm(value);
			return;
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			site_co_cd(value);
			return;
		}
		if ($site_co_nm.equalsIgnoreCase(name)) {
			site_co_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($trnspt_sort_seq.equalsIgnoreCase(name)) {
			trnspt_sort_seq(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($sort_seq.equalsIgnoreCase(name)) {
			sort_seq(value);
			return;
		}
		if ($line_num.equalsIgnoreCase(name)) {
			line_num(value);
			return;
		}
		if ($weekly_period_num.equalsIgnoreCase(name)) {
			weekly_period_num(value);
			return;
		}
		if ($weekly_period_st.equalsIgnoreCase(name)) {
			weekly_period_st(value);
			return;
		}
		if ($tendays_period_num.equalsIgnoreCase(name)) {
			tendays_period_num(value);
			return;
		}
		if ($tendays_period_st.equalsIgnoreCase(name)) {
			tendays_period_st(value);
			return;
		}
		if ($monthly_period_num.equalsIgnoreCase(name)) {
			monthly_period_num(value);
			return;
		}
		if ($monthly_period_st.equalsIgnoreCase(name)) {
			monthly_period_st(value);
			return;
		}
		if ($fix_period_num.equalsIgnoreCase(name)) {
			fix_period_num(value);
			return;
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($trnspt_sort_seq.equalsIgnoreCase(name)) {
			trnspt_sort_seq(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($sort_seq.equalsIgnoreCase(name)) {
			sort_seq(value);
			return;
		}
		if ($line_num.equalsIgnoreCase(name)) {
			line_num(value);
			return;
		}
		if ($weekly_period_num.equalsIgnoreCase(name)) {
			weekly_period_num(value);
			return;
		}
		if ($weekly_period_st.equalsIgnoreCase(name)) {
			weekly_period_st(value);
			return;
		}
		if ($tendays_period_num.equalsIgnoreCase(name)) {
			tendays_period_num(value);
			return;
		}
		if ($tendays_period_st.equalsIgnoreCase(name)) {
			tendays_period_st(value);
			return;
		}
		if ($monthly_period_num.equalsIgnoreCase(name)) {
			monthly_period_num(value);
			return;
		}
		if ($monthly_period_st.equalsIgnoreCase(name)) {
			monthly_period_st(value);
			return;
		}
		if ($fix_period_num.equalsIgnoreCase(name)) {
			fix_period_num(value);
			return;
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($trnspt_sort_seq.equalsIgnoreCase(name)) {
			trnspt_sort_seq(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($sort_seq.equalsIgnoreCase(name)) {
			sort_seq(value);
			return;
		}
		if ($line_num.equalsIgnoreCase(name)) {
			line_num(value);
			return;
		}
		if ($weekly_period_num.equalsIgnoreCase(name)) {
			weekly_period_num(value);
			return;
		}
		if ($weekly_period_st.equalsIgnoreCase(name)) {
			weekly_period_st(value);
			return;
		}
		if ($tendays_period_num.equalsIgnoreCase(name)) {
			tendays_period_num(value);
			return;
		}
		if ($tendays_period_st.equalsIgnoreCase(name)) {
			tendays_period_st(value);
			return;
		}
		if ($monthly_period_num.equalsIgnoreCase(name)) {
			monthly_period_num(value);
			return;
		}
		if ($monthly_period_st.equalsIgnoreCase(name)) {
			monthly_period_st(value);
			return;
		}
		if ($fix_period_num.equalsIgnoreCase(name)) {
			fix_period_num(value);
			return;
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($trnspt_sort_seq.equalsIgnoreCase(name)) {
			trnspt_sort_seq(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($sort_seq.equalsIgnoreCase(name)) {
			sort_seq(value);
			return;
		}
		if ($line_num.equalsIgnoreCase(name)) {
			line_num(value);
			return;
		}
		if ($weekly_period_num.equalsIgnoreCase(name)) {
			weekly_period_num(value);
			return;
		}
		if ($weekly_period_st.equalsIgnoreCase(name)) {
			weekly_period_st(value);
			return;
		}
		if ($tendays_period_num.equalsIgnoreCase(name)) {
			tendays_period_num(value);
			return;
		}
		if ($tendays_period_st.equalsIgnoreCase(name)) {
			tendays_period_st(value);
			return;
		}
		if ($monthly_period_num.equalsIgnoreCase(name)) {
			monthly_period_num(value);
			return;
		}
		if ($monthly_period_st.equalsIgnoreCase(name)) {
			monthly_period_st(value);
			return;
		}
		if ($fix_period_num.equalsIgnoreCase(name)) {
			fix_period_num(value);
			return;
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($trnspt_sort_seq.equalsIgnoreCase(name)) {
			trnspt_sort_seq(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($sort_seq.equalsIgnoreCase(name)) {
			sort_seq(value);
			return;
		}
		if ($line_num.equalsIgnoreCase(name)) {
			line_num(value);
			return;
		}
		if ($weekly_period_num.equalsIgnoreCase(name)) {
			weekly_period_num(value);
			return;
		}
		if ($weekly_period_st.equalsIgnoreCase(name)) {
			weekly_period_st(value);
			return;
		}
		if ($tendays_period_num.equalsIgnoreCase(name)) {
			tendays_period_num(value);
			return;
		}
		if ($tendays_period_st.equalsIgnoreCase(name)) {
			tendays_period_st(value);
			return;
		}
		if ($monthly_period_num.equalsIgnoreCase(name)) {
			monthly_period_num(value);
			return;
		}
		if ($monthly_period_st.equalsIgnoreCase(name)) {
			monthly_period_st(value);
			return;
		}
		if ($fix_period_num.equalsIgnoreCase(name)) {
			fix_period_num(value);
			return;
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($ext_flg.equalsIgnoreCase(name)) {
			ext_flg(value);
			return;
		}
		if ($ac_invalid_flg.equalsIgnoreCase(name)) {
			ac_invalid_flg(value);
			return;
		}
		if ($cost_invalid_flg.equalsIgnoreCase(name)) {
			cost_invalid_flg(value);
			return;
		}
		if ($arr_flg.equalsIgnoreCase(name)) {
			arr_flg(value);
			return;
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($ship_slip_flg.equalsIgnoreCase(name)) {
			ship_slip_flg(value);
			return;
		}
		if ($pick_list_flg.equalsIgnoreCase(name)) {
			pick_list_flg(value);
			return;
		}
		if ($ship_inst_flg.equalsIgnoreCase(name)) {
			ship_inst_flg(value);
			return;
		}
		if ($ship_slip_act_flg.equalsIgnoreCase(name)) {
			ship_slip_act_flg(value);
			return;
		}
		if ($gi_minus_stk_chk_flg.equalsIgnoreCase(name)) {
			gi_minus_stk_chk_flg(value);
			return;
		}
		if ($ship_loc_prio_flg.equalsIgnoreCase(name)) {
			ship_loc_prio_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($lg_flg.equalsIgnoreCase(name)) {
			lg_flg(value);
			return;
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($ar_flg.equalsIgnoreCase(name)) {
			ar_flg(value);
			return;
		}
		if ($ap_flg.equalsIgnoreCase(name)) {
			ap_flg(value);
			return;
		}
		if ($sd_flg.equalsIgnoreCase(name)) {
			sd_flg(value);
			return;
		}
		if ($not_xfr_flg.equalsIgnoreCase(name)) {
			not_xfr_flg(value);
			return;
		}
		if ($plm_flg.equalsIgnoreCase(name)) {
			plm_flg(value);
			return;
		}
		if ($cmn_upri_flg.equalsIgnoreCase(name)) {
			cmn_upri_flg(value);
			return;
		}
		if ($slo_flg.equalsIgnoreCase(name)) {
			slo_flg(value);
			return;
		}
		if ($auto_adopt_flg.equalsIgnoreCase(name)) {
			auto_adopt_flg(value);
			return;
		}
		if ($not_sls_slip_snd_flg.equalsIgnoreCase(name)) {
			not_sls_slip_snd_flg(value);
			return;
		}
		if ($not_purc_slip_snd_flg.equalsIgnoreCase(name)) {
			not_purc_slip_snd_flg(value);
			return;
		}
		if ($multi_sel_flg.equalsIgnoreCase(name)) {
			multi_sel_flg(value);
			return;
		}
		if ($req_flg.equalsIgnoreCase(name)) {
			req_flg(value);
			return;
		}
		if ($jnl_del_flg.equalsIgnoreCase(name)) {
			jnl_del_flg(value);
			return;
		}
		if ($ac_bank_flg1.equalsIgnoreCase(name)) {
			ac_bank_flg1(value);
			return;
		}
		if ($ac_bank_flg2.equalsIgnoreCase(name)) {
			ac_bank_flg2(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($da_cd.equalsIgnoreCase(name)) {
			da_cd(value);
			return;
		}
		if ($da_nm.equalsIgnoreCase(name)) {
			da_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($def_dpt_nm.equalsIgnoreCase(name)) {
			def_dpt_nm(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			dpt_lvl_nm(value);
			return;
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			aprv_role_cd(value);
			return;
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			aprv_role_nm(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			area_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
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
		if ($unit_rnd_typ.equalsIgnoreCase(name)) {
			unit_rnd_typ(value);
			return;
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			bank_cd(value);
			return;
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			bank_nm(value);
			return;
		}
		if ($bank_cal_cd.equalsIgnoreCase(name)) {
			bank_cal_cd(value);
			return;
		}
		if ($bank_branch_bank_cd.equalsIgnoreCase(name)) {
			bank_branch_bank_cd(value);
			return;
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			branch_cd(value);
			return;
		}
		if ($branch_nm.equalsIgnoreCase(name)) {
			branch_nm(value);
			return;
		}
		if ($bank_branch_cal_cd.equalsIgnoreCase(name)) {
			bank_branch_cal_cd(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($bank_ac_bank_cd.equalsIgnoreCase(name)) {
			bank_ac_bank_cd(value);
			return;
		}
		if ($bank_ac_branch_cd.equalsIgnoreCase(name)) {
			bank_ac_branch_cd(value);
			return;
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			bank_ac_no(value);
			return;
		}
		if ($bank_ac_typ.equalsIgnoreCase(name)) {
			bank_ac_typ(value);
			return;
		}
		if ($bank_ac_holder.equalsIgnoreCase(name)) {
			bank_ac_holder(value);
			return;
		}
		if ($bank_ac_holder_sub.equalsIgnoreCase(name)) {
			bank_ac_holder_sub(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			xrate_nm(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			cal_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			ac_itm_grp_cd(value);
			return;
		}
		if ($ac_itm_grp_nm.equalsIgnoreCase(name)) {
			ac_itm_grp_nm(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($ac_rsn_ar_typ.equalsIgnoreCase(name)) {
			ac_rsn_ar_typ(value);
			return;
		}
		if ($ac_rsn_ap_typ.equalsIgnoreCase(name)) {
			ac_rsn_ap_typ(value);
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
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($def_loc_grp_cd.equalsIgnoreCase(name)) {
			def_loc_grp_cd(value);
			return;
		}
		if ($def_alloc_grp_cd.equalsIgnoreCase(name)) {
			def_alloc_grp_cd(value);
			return;
		}
		if ($def_lg_grp_cd.equalsIgnoreCase(name)) {
			def_lg_grp_cd(value);
			return;
		}
		if ($def_cal_cd.equalsIgnoreCase(name)) {
			def_cal_cd(value);
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
		if ($loc_grp_wg_cd.equalsIgnoreCase(name)) {
			loc_grp_wg_cd(value);
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
		if ($lg_grp_wg_cd.equalsIgnoreCase(name)) {
			lg_grp_wg_cd(value);
			return;
		}
		if ($lg_grp_cal_cd.equalsIgnoreCase(name)) {
			lg_grp_cal_cd(value);
			return;
		}
		if ($lg_grp_site_co_cd.equalsIgnoreCase(name)) {
			lg_grp_site_co_cd(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mrp_prefix.equalsIgnoreCase(name)) {
			mrp_prefix(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			mrp_proc_typ(value);
			return;
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			rqmt_typ(value);
			return;
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			prod_pln_typ(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($oper_alc_grp.equalsIgnoreCase(name)) {
			oper_alc_grp(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			wk_cost_nm(value);
			return;
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			wk_cost_unit_nm(value);
			return;
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
			return;
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			wk_rsn_cd(value);
			return;
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			wk_rsn_nm(value);
			return;
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			sls_upri_grp_cd(value);
			return;
		}
		if ($sls_upri_grp_nm.equalsIgnoreCase(name)) {
			sls_upri_grp_nm(value);
			return;
		}
		if ($sls_upri_rank_cd.equalsIgnoreCase(name)) {
			sls_upri_rank_cd(value);
			return;
		}
		if ($sls_upri_rank_nm.equalsIgnoreCase(name)) {
			sls_upri_rank_nm(value);
			return;
		}
		if ($setoff_grp_cd.equalsIgnoreCase(name)) {
			setoff_grp_cd(value);
			return;
		}
		if ($setoff_grp_nm.equalsIgnoreCase(name)) {
			setoff_grp_nm(value);
			return;
		}
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			ship_valid_grp_cd(value);
			return;
		}
		if ($ship_valid_grp_nm.equalsIgnoreCase(name)) {
			ship_valid_grp_nm(value);
			return;
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			itm_ship_grp_cd(value);
			return;
		}
		if ($itm_ship_grp_nm.equalsIgnoreCase(name)) {
			itm_ship_grp_nm(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			trnspt_nm(value);
			return;
		}
		if ($cntnr_cd.equalsIgnoreCase(name)) {
			cntnr_cd(value);
			return;
		}
		if ($cntnr_nm.equalsIgnoreCase(name)) {
			cntnr_nm(value);
			return;
		}
		if ($port_cd.equalsIgnoreCase(name)) {
			port_cd(value);
			return;
		}
		if ($port_nm.equalsIgnoreCase(name)) {
			port_nm(value);
			return;
		}
		if ($port_cntry_cd.equalsIgnoreCase(name)) {
			port_cntry_cd(value);
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
		if ($trd_ac_rsn_cd.equalsIgnoreCase(name)) {
			trd_ac_rsn_cd(value);
			return;
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			slip_each_lot_typ(value);
			return;
		}
		if ($trd_slip_form_cd.equalsIgnoreCase(name)) {
			trd_slip_form_cd(value);
			return;
		}
		if ($slip_form_cd.equalsIgnoreCase(name)) {
			slip_form_cd(value);
			return;
		}
		if ($slip_form_nm.equalsIgnoreCase(name)) {
			slip_form_nm(value);
			return;
		}
		if ($slip_form_id.equalsIgnoreCase(name)) {
			slip_form_id(value);
			return;
		}
		if ($copy_slip_form_id.equalsIgnoreCase(name)) {
			copy_slip_form_id(value);
			return;
		}
		if ($pf_grp_cd.equalsIgnoreCase(name)) {
			pf_grp_cd(value);
			return;
		}
		if ($pf_grp_nm.equalsIgnoreCase(name)) {
			pf_grp_nm(value);
			return;
		}
		if ($itm_spec_grp_cd.equalsIgnoreCase(name)) {
			itm_spec_grp_cd(value);
			return;
		}
		if ($itm_spec_grp_nm.equalsIgnoreCase(name)) {
			itm_spec_grp_nm(value);
			return;
		}
		if ($itm_comp_grp_cd.equalsIgnoreCase(name)) {
			itm_comp_grp_cd(value);
			return;
		}
		if ($itm_comp_grp_nm.equalsIgnoreCase(name)) {
			itm_comp_grp_nm(value);
			return;
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			jnl_act_cd(value);
			return;
		}
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			jnl_act_nm(value);
			return;
		}
		if ($jnl_grp_cd.equalsIgnoreCase(name)) {
			jnl_grp_cd(value);
			return;
		}
		if ($jnl_grp_nm.equalsIgnoreCase(name)) {
			jnl_grp_nm(value);
			return;
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			jnl_ptn_cd(value);
			return;
		}
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			jnl_ptn_nm(value);
			return;
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			auto_jnl_key_cd(value);
			return;
		}
		if ($auto_jnl_key_nm.equalsIgnoreCase(name)) {
			auto_jnl_key_nm(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			wk_day_cd(value);
			return;
		}
		if ($wk_day_nm.equalsIgnoreCase(name)) {
			wk_day_nm(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			ship_wk_nm(value);
			return;
		}
		if ($ship_wk_cal_cd.equalsIgnoreCase(name)) {
			ship_wk_cal_cd(value);
			return;
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			rsrc_cd(value);
			return;
		}
		if ($rsrc_nm.equalsIgnoreCase(name)) {
			rsrc_nm(value);
			return;
		}
		if ($rsrc_unit_nm.equalsIgnoreCase(name)) {
			rsrc_unit_nm(value);
			return;
		}
		if ($rsrc_rnd_typ.equalsIgnoreCase(name)) {
			rsrc_rnd_typ(value);
			return;
		}
		if ($hs_grp_cd.equalsIgnoreCase(name)) {
			hs_grp_cd(value);
			return;
		}
		if ($hs_grp_nm.equalsIgnoreCase(name)) {
			hs_grp_nm(value);
			return;
		}
		if ($hs_typ.equalsIgnoreCase(name)) {
			hs_typ(value);
			return;
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			alc_ptn_cd(value);
			return;
		}
		if ($alc_ptn_nm.equalsIgnoreCase(name)) {
			alc_ptn_nm(value);
			return;
		}
		if ($ctg_grp_cd.equalsIgnoreCase(name)) {
			ctg_grp_cd(value);
			return;
		}
		if ($ctg_grp_nm.equalsIgnoreCase(name)) {
			ctg_grp_nm(value);
			return;
		}
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			act_ptn_cd(value);
			return;
		}
		if ($act_ptn_nm.equalsIgnoreCase(name)) {
			act_ptn_nm(value);
			return;
		}
		if ($gp_alc_cd.equalsIgnoreCase(name)) {
			gp_alc_cd(value);
			return;
		}
		if ($gp_alc_nm.equalsIgnoreCase(name)) {
			gp_alc_nm(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			rpt_ptn_cd(value);
			return;
		}
		if ($rpt_ptn_nm.equalsIgnoreCase(name)) {
			rpt_ptn_nm(value);
			return;
		}
		if ($menu_cd.equalsIgnoreCase(name)) {
			menu_cd(value);
			return;
		}
		if ($menu_nm.equalsIgnoreCase(name)) {
			menu_nm(value);
			return;
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			site_co_cd(value);
			return;
		}
		if ($site_co_nm.equalsIgnoreCase(name)) {
			site_co_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($trnspt_sort_seq.equalsIgnoreCase(name)) {
			trnspt_sort_seq(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($sort_seq.equalsIgnoreCase(name)) {
			sort_seq(value);
			return;
		}
		if ($line_num.equalsIgnoreCase(name)) {
			line_num(value);
			return;
		}
		if ($weekly_period_num.equalsIgnoreCase(name)) {
			weekly_period_num(value);
			return;
		}
		if ($weekly_period_st.equalsIgnoreCase(name)) {
			weekly_period_st(value);
			return;
		}
		if ($tendays_period_num.equalsIgnoreCase(name)) {
			tendays_period_num(value);
			return;
		}
		if ($tendays_period_st.equalsIgnoreCase(name)) {
			tendays_period_st(value);
			return;
		}
		if ($monthly_period_num.equalsIgnoreCase(name)) {
			monthly_period_num(value);
			return;
		}
		if ($monthly_period_st.equalsIgnoreCase(name)) {
			monthly_period_st(value);
			return;
		}
		if ($fix_period_num.equalsIgnoreCase(name)) {
			fix_period_num(value);
			return;
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($trnspt_sort_seq.equalsIgnoreCase(name)) {
			trnspt_sort_seq(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($sort_seq.equalsIgnoreCase(name)) {
			sort_seq(value);
			return;
		}
		if ($line_num.equalsIgnoreCase(name)) {
			line_num(value);
			return;
		}
		if ($weekly_period_num.equalsIgnoreCase(name)) {
			weekly_period_num(value);
			return;
		}
		if ($weekly_period_st.equalsIgnoreCase(name)) {
			weekly_period_st(value);
			return;
		}
		if ($tendays_period_num.equalsIgnoreCase(name)) {
			tendays_period_num(value);
			return;
		}
		if ($tendays_period_st.equalsIgnoreCase(name)) {
			tendays_period_st(value);
			return;
		}
		if ($monthly_period_num.equalsIgnoreCase(name)) {
			monthly_period_num(value);
			return;
		}
		if ($monthly_period_st.equalsIgnoreCase(name)) {
			monthly_period_st(value);
			return;
		}
		if ($fix_period_num.equalsIgnoreCase(name)) {
			fix_period_num(value);
			return;
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($trnspt_sort_seq.equalsIgnoreCase(name)) {
			trnspt_sort_seq(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($sort_seq.equalsIgnoreCase(name)) {
			sort_seq(value);
			return;
		}
		if ($line_num.equalsIgnoreCase(name)) {
			line_num(value);
			return;
		}
		if ($weekly_period_num.equalsIgnoreCase(name)) {
			weekly_period_num(value);
			return;
		}
		if ($weekly_period_st.equalsIgnoreCase(name)) {
			weekly_period_st(value);
			return;
		}
		if ($tendays_period_num.equalsIgnoreCase(name)) {
			tendays_period_num(value);
			return;
		}
		if ($tendays_period_st.equalsIgnoreCase(name)) {
			tendays_period_st(value);
			return;
		}
		if ($monthly_period_num.equalsIgnoreCase(name)) {
			monthly_period_num(value);
			return;
		}
		if ($monthly_period_st.equalsIgnoreCase(name)) {
			monthly_period_st(value);
			return;
		}
		if ($fix_period_num.equalsIgnoreCase(name)) {
			fix_period_num(value);
			return;
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($trnspt_sort_seq.equalsIgnoreCase(name)) {
			trnspt_sort_seq(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($sort_seq.equalsIgnoreCase(name)) {
			sort_seq(value);
			return;
		}
		if ($line_num.equalsIgnoreCase(name)) {
			line_num(value);
			return;
		}
		if ($weekly_period_num.equalsIgnoreCase(name)) {
			weekly_period_num(value);
			return;
		}
		if ($weekly_period_st.equalsIgnoreCase(name)) {
			weekly_period_st(value);
			return;
		}
		if ($tendays_period_num.equalsIgnoreCase(name)) {
			tendays_period_num(value);
			return;
		}
		if ($tendays_period_st.equalsIgnoreCase(name)) {
			tendays_period_st(value);
			return;
		}
		if ($monthly_period_num.equalsIgnoreCase(name)) {
			monthly_period_num(value);
			return;
		}
		if ($monthly_period_st.equalsIgnoreCase(name)) {
			monthly_period_st(value);
			return;
		}
		if ($fix_period_num.equalsIgnoreCase(name)) {
			fix_period_num(value);
			return;
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($trnspt_sort_seq.equalsIgnoreCase(name)) {
			trnspt_sort_seq(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($sort_seq.equalsIgnoreCase(name)) {
			sort_seq(value);
			return;
		}
		if ($line_num.equalsIgnoreCase(name)) {
			line_num(value);
			return;
		}
		if ($weekly_period_num.equalsIgnoreCase(name)) {
			weekly_period_num(value);
			return;
		}
		if ($weekly_period_st.equalsIgnoreCase(name)) {
			weekly_period_st(value);
			return;
		}
		if ($tendays_period_num.equalsIgnoreCase(name)) {
			tendays_period_num(value);
			return;
		}
		if ($tendays_period_st.equalsIgnoreCase(name)) {
			tendays_period_st(value);
			return;
		}
		if ($monthly_period_num.equalsIgnoreCase(name)) {
			monthly_period_num(value);
			return;
		}
		if ($monthly_period_st.equalsIgnoreCase(name)) {
			monthly_period_st(value);
			return;
		}
		if ($fix_period_num.equalsIgnoreCase(name)) {
			fix_period_num(value);
			return;
		}
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($ext_flg.equalsIgnoreCase(name)) {
			ext_flg(value);
			return;
		}
		if ($ac_invalid_flg.equalsIgnoreCase(name)) {
			ac_invalid_flg(value);
			return;
		}
		if ($cost_invalid_flg.equalsIgnoreCase(name)) {
			cost_invalid_flg(value);
			return;
		}
		if ($arr_flg.equalsIgnoreCase(name)) {
			arr_flg(value);
			return;
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($ship_slip_flg.equalsIgnoreCase(name)) {
			ship_slip_flg(value);
			return;
		}
		if ($pick_list_flg.equalsIgnoreCase(name)) {
			pick_list_flg(value);
			return;
		}
		if ($ship_inst_flg.equalsIgnoreCase(name)) {
			ship_inst_flg(value);
			return;
		}
		if ($ship_slip_act_flg.equalsIgnoreCase(name)) {
			ship_slip_act_flg(value);
			return;
		}
		if ($gi_minus_stk_chk_flg.equalsIgnoreCase(name)) {
			gi_minus_stk_chk_flg(value);
			return;
		}
		if ($ship_loc_prio_flg.equalsIgnoreCase(name)) {
			ship_loc_prio_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($lg_flg.equalsIgnoreCase(name)) {
			lg_flg(value);
			return;
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($ar_flg.equalsIgnoreCase(name)) {
			ar_flg(value);
			return;
		}
		if ($ap_flg.equalsIgnoreCase(name)) {
			ap_flg(value);
			return;
		}
		if ($sd_flg.equalsIgnoreCase(name)) {
			sd_flg(value);
			return;
		}
		if ($not_xfr_flg.equalsIgnoreCase(name)) {
			not_xfr_flg(value);
			return;
		}
		if ($plm_flg.equalsIgnoreCase(name)) {
			plm_flg(value);
			return;
		}
		if ($cmn_upri_flg.equalsIgnoreCase(name)) {
			cmn_upri_flg(value);
			return;
		}
		if ($slo_flg.equalsIgnoreCase(name)) {
			slo_flg(value);
			return;
		}
		if ($auto_adopt_flg.equalsIgnoreCase(name)) {
			auto_adopt_flg(value);
			return;
		}
		if ($not_sls_slip_snd_flg.equalsIgnoreCase(name)) {
			not_sls_slip_snd_flg(value);
			return;
		}
		if ($not_purc_slip_snd_flg.equalsIgnoreCase(name)) {
			not_purc_slip_snd_flg(value);
			return;
		}
		if ($multi_sel_flg.equalsIgnoreCase(name)) {
			multi_sel_flg(value);
			return;
		}
		if ($req_flg.equalsIgnoreCase(name)) {
			req_flg(value);
			return;
		}
		if ($jnl_del_flg.equalsIgnoreCase(name)) {
			jnl_del_flg(value);
			return;
		}
		if ($ac_bank_flg1.equalsIgnoreCase(name)) {
			ac_bank_flg1(value);
			return;
		}
		if ($ac_bank_flg2.equalsIgnoreCase(name)) {
			ac_bank_flg2(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

