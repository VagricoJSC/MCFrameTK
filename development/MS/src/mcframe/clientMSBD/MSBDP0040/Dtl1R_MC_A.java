package mcframe.clientMSBD.MSBDP0040;

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
 * ブロック"Dtl1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Dtl1R_MC_A extends MCConstRow {

	/**
	 * Acquire scheduled date / master 予定日・マスタ取得.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Do not allow request source update 依頼元更新不可.<p>
	 *
	 */
	public static final String $rqst_upd_stop_flg = "rqst_upd_stop_flg";
	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public static final String $reg_dt = "reg_dt";
	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public static final String $in_to_loc_cd = "in_to_loc_cd";
	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public static final String $in_to_loc_nm = "in_to_loc_nm";
	/**
	 * Delivery location WG cd. 納入場所ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $in_to_loc_wg_cd = "in_to_loc_wg_cd";
	/**
	 * Delivery location WG name 納入場所ワーキンググループ名.<p>
	 *
	 */
	public static final String $in_to_loc_wg_nm = "in_to_loc_wg_nm";
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
	public static final String $outsrc_sppl_cd = "outsrc_sppl_cd";
	public static final String $str_ln_tgt_flg = "str_ln_tgt_flg";
	public static final String $in_to_loc_cal_cd = "in_to_loc_cal_cd";
	public static final String $site_cd = "site_cd";
	public static final String $lg_grp_cd = "lg_grp_cd";
	public static final String $dlv_rqst_tm_p = "dlv_rqst_tm_p";
	public static final String $itm_p = "itm_p";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
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
	 * Null 無.<p>
	 *
	 */
	public static final String $str_ln_cd_none_flg = "str_ln_cd_none_flg";
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public static final String $itm_purc_upri_cng_flg = "itm_purc_upri_cng_flg";
	public static final String $ver_no_p = "ver_no_p";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Rounding type (Transaction unit) 端数処理区分（取引単位）.<p>
	 *
	 */
	public static final String $trd_unit_rnd_typ = "trd_unit_rnd_typ";
	/**
	 * Conversion base qty. (Transaction unit) 換算基準数量（取引単位）.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Conversion qty. (Transaction unit) 換算数量（取引単位）.<p>
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
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	public static final String $base_unit_qty_p = "base_unit_qty_p";
	public static final String $inst_cont_qty_p = "inst_cont_qty_p";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	public static final String $cont_unit_p = "cont_unit_p";
	public static final String $std_cont_p = "std_cont_p";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Supplier country cd. 発注先国ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cntry_cd = "sppl_cntry_cd";
	/**
	 * Supplier country name 発注先国名.<p>
	 *
	 */
	public static final String $sppl_cntry_nm = "sppl_cntry_nm";
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
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public static final String $sppl_purc_upri_cng_flg = "sppl_purc_upri_cng_flg";
	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public static final String $sppl_cal_cd = "sppl_cal_cd";
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
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public static final String $rqst_avl_rqst_dt = "rqst_avl_rqst_dt";
	public static final String $rqst_dlv_rqst_tm_p = "rqst_dlv_rqst_tm_p";
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public static final String $purc_schd_dt = "purc_schd_dt";
	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public static final String $po_schd_dt = "po_schd_dt";
	public static final String $usr_dpt_p = "usr_dpt_p";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_wg_cd = "purc_dpt_wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $purc_dpt_wg_nm = "purc_dpt_wg_nm";
	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public static final String $purc_upri_req_typ = "purc_upri_req_typ";
	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public static final String $purc_upri_req_typ_nm = "purc_upri_req_typ_nm";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Amount number of decimal places (Transaction currency) 金額小数部有効桁数（取引通貨）.<p>
	 *
	 */
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
	/**
	 * Unit price number of decimal places (Transaction currency) 単価小数部有効桁数（取引通貨）.<p>
	 *
	 */
	public static final String $trd_cur_upri_dec_place = "trd_cur_upri_dec_place";
	public static final String $trd_cur_upri_p = "trd_cur_upri_p";
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
	public static final String $trd_cur_proc_upri_p = "trd_cur_proc_upri_p";
	public static final String $trd_cur_proc_amt_p = "trd_cur_proc_amt_p";
	public static final String $trd_cur_onr_prov_upri_p = "trd_cur_onr_prov_upri_p";
	public static final String $trd_cur_onr_prov_amt_p = "trd_cur_onr_prov_amt_p";
	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public static final String $old_trd_cur_upri = "old_trd_cur_upri";
	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public static final String $old_trd_cur_proc_upri = "old_trd_cur_proc_upri";
	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public static final String $old_trd_cur_onr_prov_upri = "old_trd_cur_onr_prov_upri";
	/**
	 * Temporary unit price before change 変更前仮単価.<p>
	 *
	 */
	public static final String $old_interim_flg = "old_interim_flg";
	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public static final String $xrate_inpt_flg = "xrate_inpt_flg";
	public static final String $xrate_p = "xrate_p";
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $base_cur_amt_dec_place = "base_cur_amt_dec_place";
	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public static final String $base_cur_upri_dec_place = "base_cur_upri_dec_place";
	public static final String $base_cur_upri_p = "base_cur_upri_p";
	public static final String $base_cur_amt_p = "base_cur_amt_p";
	public static final String $base_cur_tax_amt_p = "base_cur_tax_amt_p";
	public static final String $base_cur_inc_tax_amt_p = "base_cur_inc_tax_amt_p";
	public static final String $base_cur_proc_upri_p = "base_cur_proc_upri_p";
	public static final String $base_cur_proc_amt_p = "base_cur_proc_amt_p";
	public static final String $base_cur_onr_prov_upri_p = "base_cur_onr_prov_upri_p";
	public static final String $base_cur_onr_prov_amt_p = "base_cur_onr_prov_amt_p";
	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public static final String $ptax_xrate_inpt_flg = "ptax_xrate_inpt_flg";
	public static final String $ptax_xrate_p = "ptax_xrate_p";
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public static final String $ptax_cur_cd = "ptax_cur_cd";
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public static final String $ptax_cur_nm = "ptax_cur_nm";
	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $ptax_cur_amt_dec_place = "ptax_cur_amt_dec_place";
	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public static final String $ptax_cur_upri_dec_place = "ptax_cur_upri_dec_place";
	public static final String $ptax_cur_upri_p = "ptax_cur_upri_p";
	public static final String $ptax_cur_amt_p = "ptax_cur_amt_p";
	public static final String $ptax_cur_tax_amt_p = "ptax_cur_tax_amt_p";
	public static final String $ptax_cur_inc_tax_amt_p = "ptax_cur_inc_tax_amt_p";
	public static final String $ptax_cur_proc_upri_p = "ptax_cur_proc_upri_p";
	public static final String $ptax_cur_proc_amt_p = "ptax_cur_proc_amt_p";
	public static final String $ptax_cur_onr_prov_upri_p = "ptax_cur_onr_prov_upri_p";
	public static final String $ptax_cur_onr_prov_amt_p = "ptax_cur_onr_prov_amt_p";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
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
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public static final String $xpns_purc_flg = "xpns_purc_flg";
	/**
	 * Expense purchase only 経費購買のみ.<p>
	 *
	 */
	public static final String $not_xpns_purc_flg = "not_xpns_purc_flg";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * PO contact remarks 発注連絡備考.<p>
	 *
	 */
	public static final String $po_cnt_rmrks = "po_cnt_rmrks";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public static final String $outsrc_flg = "outsrc_flg";
	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public static final String $outsrc_itm_ord_no = "outsrc_itm_ord_no";
	public static final String $bditm_p = "bditm_p";
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
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $bd_lot_no_typ = "bd_lot_no_typ";
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
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public static final String $rqst_fr_usr_cd = "rqst_fr_usr_cd";
	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public static final String $rqst_fr_usr_nm = "rqst_fr_usr_nm";
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public static final String $rqst_fr_dpt_cd = "rqst_fr_dpt_cd";
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public static final String $rqst_fr_dpt_nm = "rqst_fr_dpt_nm";
	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public static final String $po_schd_no = "po_schd_no";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public static final String $po_schd_src_typ = "po_schd_src_typ";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * PO schedule update counter 発注予定更新カウンタ.<p>
	 *
	 */
	public static final String $po_schd_upd_cntr = "po_schd_upd_cntr";
	/**
	 * Unit price acquisition base date 単価取得基準日.<p>
	 *
	 */
	public static final String $base_dt = "base_dt";

	public static final String $dlv_rqst_dt = $dlv_rqst_tm_p + ".ymd";
	public static final String $dlv_rqst_hm = $dlv_rqst_tm_p + ".hm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $trd_unit_qty = $trd_unit_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $cont_qty = $inst_cont_qty_p + ".cont_qty";
	public static final String $cont_fctr_unit_cd = $cont_unit_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_unit_p + ".cont_fctr_unit_nm";
	public static final String $std_cont_fctr = $std_cont_p + ".std_cont_fctr";
	public static final String $rqst_dlv_rqst_dt = $rqst_dlv_rqst_tm_p + ".ymd";
	public static final String $rqst_dlv_rqst_hm = $rqst_dlv_rqst_tm_p + ".hm";
	public static final String $purc_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $purc_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $purc_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $purc_dpt_nm = $usr_dpt_p + ".dpt_nm";
	public static final String $upri_not_tgt_flg = $trd_cur_upri_p + ".upri_not_tgt_flg";
	public static final String $trd_cur_upri = $trd_cur_upri_p + ".trd_cur_upri";
	public static final String $interim_flg = $trd_cur_upri_p + ".interim_flg";
	public static final String $trd_cur_amt = $trd_cur_upri_p + ".trd_cur_amt";
	public static final String $trd_cur_inc_tax_amt = $trd_cur_upri_p + ".trd_cur_inc_tax_amt";
	public static final String $tax_fix_flg = $trd_cur_upri_p + ".tax_fix_flg";
	public static final String $tax_cd = $trd_cur_upri_p + ".tax_cd";
	public static final String $tax_nm = $trd_cur_upri_p + ".tax_nm";
	public static final String $tax_rate = $trd_cur_upri_p + ".tax_rate";
	public static final String $tax_typ = $trd_cur_upri_p + ".tax_typ";
	public static final String $inc_tax_flg = $trd_cur_upri_p + ".inc_tax_flg";
	public static final String $trd_cur_tax_amt = $trd_cur_upri_p + ".trd_cur_tax_amt";
	public static final String $trd_cur_dscnt_amt = $trd_cur_upri_p + ".trd_cur_dscnt_amt";
	public static final String $dscnt_rsn_cd = $trd_cur_upri_p + ".dscnt_rsn_cd";
	public static final String $dscnt_rsn_nm = $trd_cur_upri_p + ".dscnt_rsn_nm";
	public static final String $trd_cur_proc_upri = $trd_cur_proc_upri_p + ".upri";
	public static final String $trd_cur_proc_amt = $trd_cur_proc_amt_p + ".amt";
	public static final String $trd_cur_proc_tax_amt = $trd_cur_proc_amt_p + ".tax_amt";
	public static final String $trd_cur_onr_prov_upri = $trd_cur_onr_prov_upri_p + ".upri";
	public static final String $trd_cur_onr_prov_amt = $trd_cur_onr_prov_amt_p + ".amt";
	public static final String $trd_cur_onr_prov_tax_amt = $trd_cur_onr_prov_amt_p + ".tax_amt";
	public static final String $xrate = $xrate_p + ".xrate";
	public static final String $base_cur_upri = $base_cur_upri_p + ".upri";
	public static final String $base_cur_amt = $base_cur_amt_p + ".amt";
	public static final String $base_cur_tax_amt = $base_cur_tax_amt_p + ".amt";
	public static final String $base_cur_inc_tax_amt = $base_cur_inc_tax_amt_p + ".amt";
	public static final String $base_cur_proc_upri = $base_cur_proc_upri_p + ".upri";
	public static final String $base_cur_proc_amt = $base_cur_proc_amt_p + ".amt";
	public static final String $base_cur_proc_tax_amt = $base_cur_proc_amt_p + ".tax_amt";
	public static final String $base_cur_onr_prov_upri = $base_cur_onr_prov_upri_p + ".upri";
	public static final String $base_cur_onr_prov_amt = $base_cur_onr_prov_amt_p + ".amt";
	public static final String $base_cur_onr_prov_tax_amt = $base_cur_onr_prov_amt_p + ".tax_amt";
	public static final String $ptax_xrate = $ptax_xrate_p + ".xrate";
	public static final String $ptax_cur_upri = $ptax_cur_upri_p + ".upri";
	public static final String $ptax_cur_amt = $ptax_cur_amt_p + ".amt";
	public static final String $ptax_cur_tax_amt = $ptax_cur_tax_amt_p + ".amt";
	public static final String $ptax_cur_inc_tax_amt = $ptax_cur_inc_tax_amt_p + ".amt";
	public static final String $ptax_cur_proc_upri = $ptax_cur_proc_upri_p + ".upri";
	public static final String $ptax_cur_proc_amt = $ptax_cur_proc_amt_p + ".amt";
	public static final String $ptax_cur_proc_tax_amt = $ptax_cur_proc_amt_p + ".tax_amt";
	public static final String $ptax_cur_onr_prov_upri = $ptax_cur_onr_prov_upri_p + ".upri";
	public static final String $ptax_cur_onr_prov_amt = $ptax_cur_onr_prov_amt_p + ".amt";
	public static final String $ptax_cur_onr_prov_tax_amt = $ptax_cur_onr_prov_amt_p + ".tax_amt";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $bd_dpt_cd = $bditm_p + ".bd_dpt_cd";
	public static final String $bd_dpt_nm = $bditm_p + ".bd_dpt_nm";
	public static final String $bd_itm_cd = $bditm_p + ".bd_itm_cd";
	public static final String $bd_itm_sub1 = $bditm_p + ".bd_itm_sub1";
	public static final String $bd_itm_sub2 = $bditm_p + ".bd_itm_sub2";
	public static final String $bd_itm_sub3 = $bditm_p + ".bd_itm_sub3";
	public static final String $bd_itm_nm = $bditm_p + ".bd_itm_nm";
	public static final String $bd_lot_no = $bditm_p + ".bd_lot_no";
	public static final String $bd_sublot_no = $bditm_p + ".bd_sublot_no";
	public static final String $bd_sno1 = $bditm_p + ".bd_sno1";
	public static final String $bd_sno2 = $bditm_p + ".bd_sno2";
	public static final String $bd_sno3 = $bditm_p + ".bd_sno3";
	public static final String $bd_sno4 = $bditm_p + ".bd_sno4";
	public static final String $bd_bp_cd = $bditm_p + ".bd_bp_cd";
	public static final String $bd_bp_nm = $bditm_p + ".bd_bp_nm";
	public static final String $bd_loc_cd = $bditm_p + ".bd_loc_cd";
	public static final String $bd_loc_nm = $bditm_p + ".bd_loc_nm";
	public static final String $bd_ctg_cd = $bditm_p + ".bd_ctg_cd";
	public static final String $bd_ctg_nm = $bditm_p + ".bd_ctg_nm";
	public static final String $bd_oper_cd = $bditm_p + ".bd_oper_cd";
	public static final String $bd_oper_nm = $bditm_p + ".bd_oper_nm";
	public static final String $bd_iv_no = $bditm_p + ".bd_iv_no";
	public static final String $bd_slo_no = $bditm_p + ".bd_slo_no";
	public static final String $bd_po_no = $bditm_p + ".bd_po_no";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_upd_stop_flg_META = createCommonMeta($rqst_upd_stop_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta reg_dt_META = createCommonMeta($reg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta in_to_loc_cd_META = createCommonMeta($in_to_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta in_to_loc_nm_META = createCommonMeta($in_to_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta in_to_loc_wg_cd_META = createCommonMeta($in_to_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta in_to_loc_wg_nm_META = createCommonMeta($in_to_loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta drct_dlv_typ_META = createCommonMeta($drct_dlv_typ, mcframe.commonMS.meta.MS_META.DRCT_DLV_TYP);
	public static final MCMeta drct_dlv_typ_nm_META = createCommonMeta($drct_dlv_typ_nm, mcframe.commonMS.meta.MS_META.DRCT_DLV_TYP_NM);
	public static final MCMeta outsrc_sppl_cd_META = createCommonMeta($outsrc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta str_ln_tgt_flg_META = createCommonMeta($str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta in_to_loc_cal_cd_META = createCommonMeta($in_to_loc_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dlv_rqst_tm_p_META = createInnerRowMeta($dlv_rqst_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta str_ln_cd_none_flg_META = createCommonMeta($str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_purc_upri_cng_flg_META = createCommonMeta($itm_purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
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
	public static final MCMeta inst_cont_qty_p_META = createInnerRowMeta($inst_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_unit_p_META = createInnerRowMeta($cont_unit_p, mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class);
	public static final MCMeta std_cont_p_META = createInnerRowMeta($std_cont_p, mcframe.clientMAUB.MAUBP5280.StdContFctrR.class);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_cntry_cd_META = createCommonMeta($sppl_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta sppl_cntry_nm_META = createCommonMeta($sppl_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta purc_amt_rnd_typ_META = createCommonMeta($purc_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_rnd_typ_META = createCommonMeta($purc_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sppl_purc_upri_cng_flg_META = createCommonMeta($sppl_purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_cal_cd_META = createCommonMeta($sppl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta rqst_avl_rqst_dt_META = createCommonMeta($rqst_avl_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_dlv_rqst_tm_p_META = createInnerRowMeta($rqst_dlv_rqst_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta purc_schd_dt_META = createCommonMeta($purc_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_schd_dt_META = createCommonMeta($po_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta purc_dpt_wg_cd_META = createCommonMeta($purc_dpt_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta purc_dpt_wg_nm_META = createCommonMeta($purc_dpt_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta purc_upri_req_typ_META = createCommonMeta($purc_upri_req_typ, mcframe.commonMA.meta.MA_META.PURC_UPRI_REQ_TYP);
	public static final MCMeta purc_upri_req_typ_nm_META = createCommonMeta($purc_upri_req_typ_nm, mcframe.commonMA.meta.MA_META.PURC_UPRI_REQ_TYP_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_upri_dec_place_META = createCommonMeta($trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_upri_p_META = createInnerRowMeta($trd_cur_upri_p, mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.class);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_upri_typ_META = createCommonMeta($outsrc_upri_typ, mcframe.commonMA.meta.MA_META.OUTSRC_UPRI_TYP);
	public static final MCMeta trd_cur_proc_upri_p_META = createInnerRowMeta($trd_cur_proc_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta trd_cur_proc_amt_p_META = createInnerRowMeta($trd_cur_proc_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta trd_cur_onr_prov_upri_p_META = createInnerRowMeta($trd_cur_onr_prov_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta trd_cur_onr_prov_amt_p_META = createInnerRowMeta($trd_cur_onr_prov_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta old_trd_cur_upri_META = createCommonMeta($old_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_trd_cur_proc_upri_META = createCommonMeta($old_trd_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_trd_cur_onr_prov_upri_META = createCommonMeta($old_trd_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_interim_flg_META = createCommonMeta($old_interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_inpt_flg_META = createCommonMeta($xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_p_META = createInnerRowMeta($xrate_p, mcframe.clientMAUB.MAUBP5390.XrateR.class);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_amt_dec_place_META = createCommonMeta($base_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_upri_dec_place_META = createCommonMeta($base_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_upri_p_META = createInnerRowMeta($base_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta base_cur_amt_p_META = createInnerRowMeta($base_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_tax_amt_p_META = createInnerRowMeta($base_cur_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_inc_tax_amt_p_META = createInnerRowMeta($base_cur_inc_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_proc_upri_p_META = createInnerRowMeta($base_cur_proc_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta base_cur_proc_amt_p_META = createInnerRowMeta($base_cur_proc_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_onr_prov_upri_p_META = createInnerRowMeta($base_cur_onr_prov_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta base_cur_onr_prov_amt_p_META = createInnerRowMeta($base_cur_onr_prov_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_xrate_inpt_flg_META = createCommonMeta($ptax_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ptax_xrate_p_META = createInnerRowMeta($ptax_xrate_p, mcframe.clientMAUB.MAUBP5390.XrateR.class);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_cur_nm_META = createCommonMeta($ptax_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta ptax_cur_amt_dec_place_META = createCommonMeta($ptax_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_cur_upri_dec_place_META = createCommonMeta($ptax_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_cur_upri_p_META = createInnerRowMeta($ptax_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta ptax_cur_amt_p_META = createInnerRowMeta($ptax_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_tax_amt_p_META = createInnerRowMeta($ptax_cur_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_inc_tax_amt_p_META = createInnerRowMeta($ptax_cur_inc_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_proc_upri_p_META = createInnerRowMeta($ptax_cur_proc_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta ptax_cur_proc_amt_p_META = createInnerRowMeta($ptax_cur_proc_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_onr_prov_upri_p_META = createInnerRowMeta($ptax_cur_onr_prov_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta ptax_cur_onr_prov_amt_p_META = createInnerRowMeta($ptax_cur_onr_prov_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta purc_rsn_cd_META = createCommonMeta($purc_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta purc_rsn_nm_META = createCommonMeta($purc_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta xpns_purc_flg_META = createCommonMeta($xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_xpns_purc_flg_META = createCommonMeta($not_xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PO_SCHD_INTR_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta po_cnt_rmrks_META = createCommonMeta($po_cnt_rmrks, mcframe.commonMS.meta.MS_META.PO_CNT_RMRKS);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_itm_ord_no_META = createCommonMeta($outsrc_itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta bditm_p_META = createInnerRowMeta($bditm_p, mcframe.clientMSUB.MSUBP5040.BdItemR.class);
	public static final MCMeta bd_lot_mng_typ_META = createCommonMeta($bd_lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta bd_sublot_mng_typ_META = createCommonMeta($bd_sublot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta bd_lot_no_typ_META = createCommonMeta($bd_lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta bd_sublot_no_typ_META = createCommonMeta($bd_sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta bd_sno1_mng_typ_META = createCommonMeta($bd_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno2_mng_typ_META = createCommonMeta($bd_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno3_mng_typ_META = createCommonMeta($bd_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno4_mng_typ_META = createCommonMeta($bd_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta rqst_fr_usr_cd_META = createCommonMeta($rqst_fr_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rqst_fr_usr_nm_META = createCommonMeta($rqst_fr_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rqst_fr_dpt_cd_META = createCommonMeta($rqst_fr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_fr_dpt_nm_META = createCommonMeta($rqst_fr_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta po_schd_no_META = createCommonMeta($po_schd_no, mcframe.commonMA.meta.MA_META.PO_SCHD_NO);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta po_schd_src_typ_META = createCommonMeta($po_schd_src_typ, mcframe.commonMS.meta.MS_META.PO_SCHD_SRC_TYP);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta po_schd_upd_cntr_META = createCommonMeta($po_schd_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta base_dt_META = createCommonMeta($base_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<Dtl1R> constMetas = new ConstMetaList<Dtl1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			abort_flg_META,
			rqst_upd_stop_flg_META,
			reg_dt_META,
			in_to_loc_cd_META,
			in_to_loc_nm_META,
			in_to_loc_wg_cd_META,
			in_to_loc_wg_nm_META,
			drct_dlv_typ_META,
			drct_dlv_typ_nm_META,
			outsrc_sppl_cd_META,
			str_ln_tgt_flg_META,
			in_to_loc_cal_cd_META,
			site_cd_META,
			lg_grp_cd_META,
			dlv_rqst_tm_p_META,
			itm_p_META,
			sundry_itm_flg_META,
			str_ln_cd_META,
			str_ln_nm_META,
			str_ln_cd_none_flg_META,
			ver_flg_META,
			asset_mng_typ_META,
			dscnt_itm_flg_META,
			itm_purc_upri_cng_flg_META,
			ver_no_p_META,
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
			inst_cont_qty_p_META,
			cont_fctr_flg_META,
			cont_fctr_dec_place_META,
			cont_fctr_rnd_typ_META,
			cont_unit_p_META,
			std_cont_p_META,
			sppl_cd_META,
			sppl_nm_META,
			sppl_cntry_cd_META,
			sppl_cntry_nm_META,
			purc_amt_rnd_typ_META,
			purc_tax_rnd_typ_META,
			sppl_purc_upri_cng_flg_META,
			sppl_cal_cd_META,
			maker_cd_META,
			maker_nm_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			iv_itm_nm_META,
			rqst_avl_rqst_dt_META,
			rqst_dlv_rqst_tm_p_META,
			purc_schd_dt_META,
			po_schd_dt_META,
			usr_dpt_p_META,
			purc_dpt_wg_cd_META,
			purc_dpt_wg_nm_META,
			purc_upri_req_typ_META,
			purc_upri_req_typ_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_cur_amt_dec_place_META,
			trd_cur_upri_dec_place_META,
			trd_cur_upri_p_META,
			repurc_obli_flg_META,
			outsrc_upri_typ_META,
			trd_cur_proc_upri_p_META,
			trd_cur_proc_amt_p_META,
			trd_cur_onr_prov_upri_p_META,
			trd_cur_onr_prov_amt_p_META,
			old_trd_cur_upri_META,
			old_trd_cur_proc_upri_META,
			old_trd_cur_onr_prov_upri_META,
			old_interim_flg_META,
			xrate_cd_META,
			xrate_inpt_flg_META,
			xrate_p_META,
			base_cur_cd_META,
			base_cur_nm_META,
			base_cur_amt_dec_place_META,
			base_cur_upri_dec_place_META,
			base_cur_upri_p_META,
			base_cur_amt_p_META,
			base_cur_tax_amt_p_META,
			base_cur_inc_tax_amt_p_META,
			base_cur_proc_upri_p_META,
			base_cur_proc_amt_p_META,
			base_cur_onr_prov_upri_p_META,
			base_cur_onr_prov_amt_p_META,
			ptax_xrate_inpt_flg_META,
			ptax_xrate_p_META,
			ptax_cur_cd_META,
			ptax_cur_nm_META,
			ptax_cur_amt_dec_place_META,
			ptax_cur_upri_dec_place_META,
			ptax_cur_upri_p_META,
			ptax_cur_amt_p_META,
			ptax_cur_tax_amt_p_META,
			ptax_cur_inc_tax_amt_p_META,
			ptax_cur_proc_upri_p_META,
			ptax_cur_proc_amt_p_META,
			ptax_cur_onr_prov_upri_p_META,
			ptax_cur_onr_prov_amt_p_META,
			sno_wrk_no_p_META,
			purc_rsn_cd_META,
			purc_rsn_nm_META,
			xpns_purc_flg_META,
			not_xpns_purc_flg_META,
			intr_rmrks_META,
			trd_d_rmrks_META,
			po_cnt_rmrks_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			bom_ptn_META,
			outsrc_flg_META,
			outsrc_itm_ord_no_META,
			bditm_p_META,
			bd_lot_mng_typ_META,
			bd_sublot_mng_typ_META,
			bd_lot_no_typ_META,
			bd_sublot_no_typ_META,
			bd_sno1_mng_typ_META,
			bd_sno2_mng_typ_META,
			bd_sno3_mng_typ_META,
			bd_sno4_mng_typ_META,
			rqst_fr_usr_cd_META,
			rqst_fr_usr_nm_META,
			rqst_fr_dpt_cd_META,
			rqst_fr_dpt_nm_META,
			po_schd_no_META,
			trd_ptn_typ_META,
			po_schd_src_typ_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META,
			po_schd_upd_cntr_META,
			base_dt_META
		},
		new String[][]{
			{
				"dlv_rqst_dt",
				"dlv_rqst_hm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"ver_no",
				"trd_unit_qty",
				"base_unit_qty",
				"cont_qty",
				"cont_fctr_unit_cd",
				"cont_fctr_unit_nm",
				"std_cont_fctr",
				"rqst_dlv_rqst_dt",
				"rqst_dlv_rqst_hm",
				"purc_usr_cd",
				"purc_usr_nm",
				"purc_dpt_cd",
				"purc_dpt_nm",
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
				"dscnt_rsn_cd",
				"dscnt_rsn_nm",
				"trd_cur_proc_upri",
				"trd_cur_proc_amt",
				"trd_cur_proc_tax_amt",
				"trd_cur_onr_prov_upri",
				"trd_cur_onr_prov_amt",
				"trd_cur_onr_prov_tax_amt",
				"xrate",
				"base_cur_upri",
				"base_cur_amt",
				"base_cur_tax_amt",
				"base_cur_inc_tax_amt",
				"base_cur_proc_upri",
				"base_cur_proc_amt",
				"base_cur_proc_tax_amt",
				"base_cur_onr_prov_upri",
				"base_cur_onr_prov_amt",
				"base_cur_onr_prov_tax_amt",
				"ptax_xrate",
				"ptax_cur_upri",
				"ptax_cur_amt",
				"ptax_cur_tax_amt",
				"ptax_cur_inc_tax_amt",
				"ptax_cur_proc_upri",
				"ptax_cur_proc_amt",
				"ptax_cur_proc_tax_amt",
				"ptax_cur_onr_prov_upri",
				"ptax_cur_onr_prov_amt",
				"ptax_cur_onr_prov_tax_amt",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"bd_dpt_cd",
				"bd_dpt_nm",
				"bd_itm_cd",
				"bd_itm_sub1",
				"bd_itm_sub2",
				"bd_itm_sub3",
				"bd_itm_nm",
				"bd_lot_no",
				"bd_sublot_no",
				"bd_sno1",
				"bd_sno2",
				"bd_sno3",
				"bd_sno4",
				"bd_bp_cd",
				"bd_bp_nm",
				"bd_loc_cd",
				"bd_loc_nm",
				"bd_ctg_cd",
				"bd_ctg_nm",
				"bd_oper_cd",
				"bd_oper_nm",
				"bd_iv_no",
				"bd_slo_no",
				"bd_po_no"
			},
			{
				$dlv_rqst_dt,
				$dlv_rqst_hm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$ver_no,
				$trd_unit_qty,
				$base_unit_qty,
				$cont_qty,
				$cont_fctr_unit_cd,
				$cont_fctr_unit_nm,
				$std_cont_fctr,
				$rqst_dlv_rqst_dt,
				$rqst_dlv_rqst_hm,
				$purc_usr_cd,
				$purc_usr_nm,
				$purc_dpt_cd,
				$purc_dpt_nm,
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
				$dscnt_rsn_cd,
				$dscnt_rsn_nm,
				$trd_cur_proc_upri,
				$trd_cur_proc_amt,
				$trd_cur_proc_tax_amt,
				$trd_cur_onr_prov_upri,
				$trd_cur_onr_prov_amt,
				$trd_cur_onr_prov_tax_amt,
				$xrate,
				$base_cur_upri,
				$base_cur_amt,
				$base_cur_tax_amt,
				$base_cur_inc_tax_amt,
				$base_cur_proc_upri,
				$base_cur_proc_amt,
				$base_cur_proc_tax_amt,
				$base_cur_onr_prov_upri,
				$base_cur_onr_prov_amt,
				$base_cur_onr_prov_tax_amt,
				$ptax_xrate,
				$ptax_cur_upri,
				$ptax_cur_amt,
				$ptax_cur_tax_amt,
				$ptax_cur_inc_tax_amt,
				$ptax_cur_proc_upri,
				$ptax_cur_proc_amt,
				$ptax_cur_proc_tax_amt,
				$ptax_cur_onr_prov_upri,
				$ptax_cur_onr_prov_amt,
				$ptax_cur_onr_prov_tax_amt,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$bd_dpt_cd,
				$bd_dpt_nm,
				$bd_itm_cd,
				$bd_itm_sub1,
				$bd_itm_sub2,
				$bd_itm_sub3,
				$bd_itm_nm,
				$bd_lot_no,
				$bd_sublot_no,
				$bd_sno1,
				$bd_sno2,
				$bd_sno3,
				$bd_sno4,
				$bd_bp_cd,
				$bd_bp_nm,
				$bd_loc_cd,
				$bd_loc_nm,
				$bd_ctg_cd,
				$bd_ctg_nm,
				$bd_oper_cd,
				$bd_oper_nm,
				$bd_iv_no,
				$bd_slo_no,
				$bd_po_no
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
				{$trd_unit_cd, "unit_nm;dec_place;conv_base_qty;conv_qty;rnd_typ"},	// trd_unit_cd
				{$sppl_cd, "bp_nm;cur_cd;purc_usr_cd;purc_dpt_cd;purc_upri_cng_flg;purc_upri_req_typ;sppl_cal_cd;purc_amt_rnd_typ;purc_tax_rnd_typ;cntry_cd;cntry_nm"},	// sppl_cd
				{$maker_cd, "bp_nm"},	// maker_cd
				{$usr_dpt_p + ".dpt_cd", "dpt_nm;wg_cd;wg_nm"},	// usr_dpt_p.dpt_cd
				{$purc_upri_req_typ, "purc_upri_req_typ_nm"},	// purc_upri_req_typ
				{$trd_cur_cd, "cur_nm;amt_dec_place;upri_dec_place"},	// trd_cur_cd
				{$trd_cur_upri_p + ".tax_cd", "tax_nm;tax_typ;tax_rate;inc_tax_flg"},	// trd_cur_upri_p.tax_cd
				{$purc_rsn_cd, "biz_rsn_nm;xpns_purc_flg"},	// purc_rsn_cd
				{$mfg_loc_cd, "mfg_loc_nm;sppl_cd;maker_cd"},	// mfg_loc_cd
				{$bditm_p + ".bd_dpt_cd", "dpt_nm"},	// bditm_p.bd_dpt_cd
				{$bditm_p + ".bd_itm_cd", "itm_sub1;itm_sub2;itm_sub3;itm_nm;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// bditm_p.bd_itm_cd
				{$bditm_p + ".bd_itm_sub1", "itm_sub2;itm_sub3;itm_nm;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// bditm_p.bd_itm_sub1
				{$bditm_p + ".bd_itm_sub2", "itm_sub3;itm_nm;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// bditm_p.bd_itm_sub2
				{$bditm_p + ".bd_itm_sub3", "itm_nm;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"}	// bditm_p.bd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$ver_no_p + ".ver_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3;site_cd"},	// ver_no_p.ver_no
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$sppl_cd, "po_schd_dt;reg_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;in_to_loc_wg_cd;true;false;true;asset_mng_typ"},	// sppl_cd
				{$maker_cd, "po_schd_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;in_to_loc_wg_cd;sppl_cd;true;true;true;true;asset_mng_typ"},	// maker_cd
				{$usr_dpt_p + ".dpt_cd", "MAC_DPT_IS_SRCH_TYP.PURC;reg_dt;purc_usr_cd;true"},	// usr_dpt_p.dpt_cd
				{$purc_rsn_cd, "xpns_purc_flg;not_xpns_purc_flg"},	// purc_rsn_cd
				{$mfg_loc_cd, "rqst_avl_rqst_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;in_to_loc_wg_cd;true"},	// mfg_loc_cd
				{$bom_ptn, "rqst_avl_rqst_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;in_to_loc_wg_cd;mfg_loc_cd"},	// bom_ptn
				{$bditm_p + ".bd_dpt_cd", "MAC_DPT_IS_SRCH_TYP.BD;reg_dt"},	// bditm_p.bd_dpt_cd
				{$bditm_p + ".bd_itm_cd", "MAC_ITM_IS_SRCH_TYP.ASSET1"},	// bditm_p.bd_itm_cd
				{$bditm_p + ".bd_itm_sub1", "MAC_ITM_IS_SRCH_TYP.ASSET1;bd_itm_cd"},	// bditm_p.bd_itm_sub1
				{$bditm_p + ".bd_itm_sub2", "MAC_ITM_IS_SRCH_TYP.ASSET1;bd_itm_cd;bd_itm_sub1"},	// bditm_p.bd_itm_sub2
				{$bditm_p + ".bd_itm_sub3", "MAC_ITM_IS_SRCH_TYP.ASSET1;bd_itm_cd;bd_itm_sub1;bd_itm_sub2"}	// bditm_p.bd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$ver_no_p + ".ver_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3;site_cd"},	// ver_no_p.ver_no
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$sppl_cd, "master_dt;master_dt2;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;sppl_flg;inc_outsrc_flg;manual_sppl_flg;asset_mng_typ"},	// sppl_cd
				{$maker_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;sppl_cd;inc_outsrc_flg;mode_nullval_flg;maker_flg;manual_sppl_flg;asset_mng_typ"},	// maker_cd
				{$usr_dpt_p + ".dpt_cd", "dpt_is_srch_typ;dt;usr_cd;wr_flg"},	// usr_dpt_p.dpt_cd
				{$purc_rsn_cd, "xpns_purc_flg;not_xpns_purc_flg"},	// purc_rsn_cd
				{$mfg_loc_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;outsrc_flg"},	// mfg_loc_cd
				{$bom_ptn, "dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;mfg_loc_cd"},	// bom_ptn
				{$bditm_p + ".bd_dpt_cd", "dpt_is_srch_typ;dt"},	// bditm_p.bd_dpt_cd
				{$bditm_p + ".bd_itm_cd", "itm_is_srch_typ"},	// bditm_p.bd_itm_cd
				{$bditm_p + ".bd_itm_sub1", "itm_is_srch_typ;itm_cd"},	// bditm_p.bd_itm_sub1
				{$bditm_p + ".bd_itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// bditm_p.bd_itm_sub2
				{$bditm_p + ".bd_itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// bditm_p.bd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$in_to_loc_wg_cd, "WG"},	// in_to_loc_wg_cd
				{$in_to_loc_wg_nm, "WG"},	// in_to_loc_wg_nm
				{$str_ln_tgt_flg, "STR_LN"},	// str_ln_tgt_flg
				{$site_cd, "SITE"},	// site_cd
				{$lg_grp_cd, "LG_GRP"},	// lg_grp_cd
				{$str_ln_cd, "STR_LN"},	// str_ln_cd
				{$str_ln_nm, "STR_LN"},	// str_ln_nm
				{$str_ln_cd_none_flg, "STR_LN"},	// str_ln_cd_none_flg
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_rnd_typ, "BASE_UNIT"},	// base_unit_rnd_typ
				{$base_unit_qty_p + ".qty", "BASE_UNIT"},	// base_unit_qty_p.qty
				{$maker_cd, "MAKER"},	// maker_cd
				{$maker_nm, "MAKER"},	// maker_nm
				{$purc_dpt_wg_cd, "WG"},	// purc_dpt_wg_cd
				{$purc_dpt_wg_nm, "WG"},	// purc_dpt_wg_nm
				{$xrate_cd, "BASE_CUR"},	// xrate_cd
				{$xrate_inpt_flg, "BASE_CUR"},	// xrate_inpt_flg
				{$xrate_p + ".xrate", "BASE_CUR"},	// xrate_p.xrate
				{$base_cur_cd, "BASE_CUR"},	// base_cur_cd
				{$base_cur_nm, "BASE_CUR"},	// base_cur_nm
				{$base_cur_amt_dec_place, "BASE_CUR"},	// base_cur_amt_dec_place
				{$base_cur_upri_dec_place, "BASE_CUR"},	// base_cur_upri_dec_place
				{$base_cur_upri_p + ".upri", "BASE_CUR"},	// base_cur_upri_p.upri
				{$base_cur_amt_p + ".amt", "BASE_CUR"},	// base_cur_amt_p.amt
				{$base_cur_tax_amt_p + ".amt", "BASE_CUR"},	// base_cur_tax_amt_p.amt
				{$base_cur_inc_tax_amt_p + ".amt", "BASE_CUR"},	// base_cur_inc_tax_amt_p.amt
				{$base_cur_proc_upri_p + ".upri", "BASE_CUR"},	// base_cur_proc_upri_p.upri
				{$base_cur_proc_amt_p + ".amt", "BASE_CUR"},	// base_cur_proc_amt_p.amt
				{$base_cur_proc_amt_p + ".tax_amt", "BASE_CUR"},	// base_cur_proc_amt_p.tax_amt
				{$base_cur_onr_prov_upri_p + ".upri", "BASE_CUR"},	// base_cur_onr_prov_upri_p.upri
				{$base_cur_onr_prov_amt_p + ".amt", "BASE_CUR"},	// base_cur_onr_prov_amt_p.amt
				{$base_cur_onr_prov_amt_p + ".tax_amt", "BASE_CUR"},	// base_cur_onr_prov_amt_p.tax_amt
				{$ptax_xrate_inpt_flg, "PTAX"},	// ptax_xrate_inpt_flg
				{$ptax_xrate_p + ".xrate", "PTAX"},	// ptax_xrate_p.xrate
				{$ptax_cur_cd, "PTAX"},	// ptax_cur_cd
				{$ptax_cur_nm, "PTAX"},	// ptax_cur_nm
				{$ptax_cur_amt_dec_place, "PTAX"},	// ptax_cur_amt_dec_place
				{$ptax_cur_upri_dec_place, "PTAX"},	// ptax_cur_upri_dec_place
				{$ptax_cur_upri_p + ".upri", "PTAX"},	// ptax_cur_upri_p.upri
				{$ptax_cur_amt_p + ".amt", "PTAX"},	// ptax_cur_amt_p.amt
				{$ptax_cur_tax_amt_p + ".amt", "PTAX"},	// ptax_cur_tax_amt_p.amt
				{$ptax_cur_inc_tax_amt_p + ".amt", "PTAX"},	// ptax_cur_inc_tax_amt_p.amt
				{$ptax_cur_proc_upri_p + ".upri", "PTAX"},	// ptax_cur_proc_upri_p.upri
				{$ptax_cur_proc_amt_p + ".amt", "PTAX"},	// ptax_cur_proc_amt_p.amt
				{$ptax_cur_proc_amt_p + ".tax_amt", "PTAX"},	// ptax_cur_proc_amt_p.tax_amt
				{$ptax_cur_onr_prov_upri_p + ".upri", "PTAX"},	// ptax_cur_onr_prov_upri_p.upri
				{$ptax_cur_onr_prov_amt_p + ".amt", "PTAX"},	// ptax_cur_onr_prov_amt_p.amt
				{$ptax_cur_onr_prov_amt_p + ".tax_amt", "PTAX"}	// ptax_cur_onr_prov_amt_p.tax_amt
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
	protected Dtl1R_MC_A(ConstMetaList<? extends Dtl1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl1R clone() {
		return (Dtl1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl1R createInstance() {
		return (Dtl1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl1R getValues(String... names) {
		return (Dtl1R) super.getValues(names);
	}



	/**
	 * Acquire scheduled date / master 予定日・マスタ取得.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Acquire scheduled date / master 予定日・マスタ取得.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
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
	 * Do not allow request source update 依頼元更新不可.<p>
	 *
	 */
	public boolean rqst_upd_stop_flg() {
		return getConstBoolean(offset + 2, $rqst_upd_stop_flg);
	}

	/**
	 * Do not allow request source update 依頼元更新不可.<p>
	 *
	 */
	public void rqst_upd_stop_flg(boolean value) {
		setConstBoolean(offset + 2, $rqst_upd_stop_flg, value);
	}


	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCDate reg_dt() {
		return getConstDate(offset + 3, $reg_dt);
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public void reg_dt(MCDate value) {
		setConstDate(offset + 3, $reg_dt, value);
	}


	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public String in_to_loc_cd() {
		return getConstString(offset + 4, $in_to_loc_cd);
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public void in_to_loc_cd(String value) {
		setConstString(offset + 4, $in_to_loc_cd, value);
	}


	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public String in_to_loc_nm() {
		return getConstString(offset + 5, $in_to_loc_nm);
	}

	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public void in_to_loc_nm(String value) {
		setConstString(offset + 5, $in_to_loc_nm, value);
	}


	/**
	 * Delivery location WG cd. 納入場所ワーキンググループＣＤ.<p>
	 *
	 */
	public String in_to_loc_wg_cd() {
		return getConstString(offset + 6, $in_to_loc_wg_cd);
	}

	/**
	 * Delivery location WG cd. 納入場所ワーキンググループＣＤ.<p>
	 *
	 */
	public void in_to_loc_wg_cd(String value) {
		setConstString(offset + 6, $in_to_loc_wg_cd, value);
	}


	/**
	 * Delivery location WG name 納入場所ワーキンググループ名.<p>
	 *
	 */
	public String in_to_loc_wg_nm() {
		return getConstString(offset + 7, $in_to_loc_wg_nm);
	}

	/**
	 * Delivery location WG name 納入場所ワーキンググループ名.<p>
	 *
	 */
	public void in_to_loc_wg_nm(String value) {
		setConstString(offset + 7, $in_to_loc_wg_nm, value);
	}


	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public String drct_dlv_typ() {
		return getConstString(offset + 8, $drct_dlv_typ);
	}

	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public void drct_dlv_typ(String value) {
		setConstString(offset + 8, $drct_dlv_typ, value);
	}


	/**
	 * Direct-delivery type name 直納区分名.<p>
	 *
	 */
	public String drct_dlv_typ_nm() {
		return getConstString(offset + 9, $drct_dlv_typ_nm);
	}

	/**
	 * Direct-delivery type name 直納区分名.<p>
	 *
	 */
	public void drct_dlv_typ_nm(String value) {
		setConstString(offset + 9, $drct_dlv_typ_nm, value);
	}


	public String outsrc_sppl_cd() {
		return getConstString(offset + 10, $outsrc_sppl_cd);
	}

	public void outsrc_sppl_cd(String value) {
		setConstString(offset + 10, $outsrc_sppl_cd, value);
	}


	public boolean str_ln_tgt_flg() {
		return getConstBoolean(offset + 11, $str_ln_tgt_flg);
	}

	public void str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 11, $str_ln_tgt_flg, value);
	}


	public String in_to_loc_cal_cd() {
		return getConstString(offset + 12, $in_to_loc_cal_cd);
	}

	public void in_to_loc_cal_cd(String value) {
		setConstString(offset + 12, $in_to_loc_cal_cd, value);
	}


	public String site_cd() {
		return getConstString(offset + 13, $site_cd);
	}

	public void site_cd(String value) {
		setConstString(offset + 13, $site_cd, value);
	}


	public String lg_grp_cd() {
		return getConstString(offset + 14, $lg_grp_cd);
	}

	public void lg_grp_cd(String value) {
		setConstString(offset + 14, $lg_grp_cd, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR dlv_rqst_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 15, $dlv_rqst_tm_p);
	}
	
	public void dlv_rqst_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 15, $dlv_rqst_tm_p, row);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 16, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 16, $itm_p, row);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 17, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 17, $sundry_itm_flg, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 18, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 18, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 19, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 19, $str_ln_nm, value);
	}


	/**
	 * Null 無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 20, $str_ln_cd_none_flg);
	}

	/**
	 * Null 無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 20, $str_ln_cd_none_flg, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 21, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 21, $ver_flg, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 22, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 22, $asset_mng_typ, value);
	}


	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 23, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 23, $dscnt_itm_flg, value);
	}


	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public boolean itm_purc_upri_cng_flg() {
		return getConstBoolean(offset + 24, $itm_purc_upri_cng_flg);
	}

	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public void itm_purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 24, $itm_purc_upri_cng_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 25, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 25, $ver_no_p, row);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 26, $trd_unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 26, $trd_unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 27, $trd_unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 27, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 28, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 28, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 28, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 28, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 28, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 28, $trd_unit_dec_place, value);
	}


	/**
	 * Rounding type (Transaction unit) 端数処理区分（取引単位）.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 29, $trd_unit_rnd_typ);
	}

	/**
	 * Rounding type (Transaction unit) 端数処理区分（取引単位）.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 29, $trd_unit_rnd_typ, value);
	}


	/**
	 * Conversion base qty. (Transaction unit) 換算基準数量（取引単位）.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 30, $trd_unit_conv_base_qty);
	}

	/**
	 * Conversion base qty. (Transaction unit) 換算基準数量（取引単位）.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 30, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. (Transaction unit) 換算基準数量（取引単位）.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 30, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. (Transaction unit) 換算基準数量（取引単位）.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 30, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. (Transaction unit) 換算基準数量（取引単位）.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 30, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. (Transaction unit) 換算基準数量（取引単位）.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 30, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Conversion qty. (Transaction unit) 換算数量（取引単位）.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 31, $trd_unit_conv_qty);
	}

	/**
	 * Conversion qty. (Transaction unit) 換算数量（取引単位）.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 31, $trd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. (Transaction unit) 換算数量（取引単位）.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 31, $trd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. (Transaction unit) 換算数量（取引単位）.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 31, $trd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. (Transaction unit) 換算数量（取引単位）.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 31, $trd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. (Transaction unit) 換算数量（取引単位）.<p>
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
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 35, $base_unit_dec_place);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 35, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 35, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 35, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 35, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 35, $base_unit_dec_place, value);
	}


	public String base_unit_rnd_typ() {
		return getConstString(offset + 36, $base_unit_rnd_typ);
	}

	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 36, $base_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 37, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 37, $base_unit_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR inst_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 38, $inst_cont_qty_p);
	}
	
	public void inst_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 38, $inst_cont_qty_p, row);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 39, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 39, $cont_fctr_flg, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 40, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 40, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 40, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 40, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 40, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 40, $cont_fctr_dec_place, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 41, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 41, $cont_fctr_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5270.ContFctrUnitR cont_unit_p(){
		return (mcframe.clientMAUB.MAUBP5270.ContFctrUnitR) getConstInnerRow(offset + 42, $cont_unit_p);
	}
	
	public void cont_unit_p(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR row){
		setConstInnerRow(offset + 42, $cont_unit_p, row);
	}


	public mcframe.clientMAUB.MAUBP5280.StdContFctrR std_cont_p(){
		return (mcframe.clientMAUB.MAUBP5280.StdContFctrR) getConstInnerRow(offset + 43, $std_cont_p);
	}
	
	public void std_cont_p(mcframe.clientMAUB.MAUBP5280.StdContFctrR row){
		setConstInnerRow(offset + 43, $std_cont_p, row);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 44, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 44, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 45, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 45, $sppl_nm, value);
	}


	/**
	 * Supplier country cd. 発注先国ＣＤ.<p>
	 *
	 */
	public String sppl_cntry_cd() {
		return getConstString(offset + 46, $sppl_cntry_cd);
	}

	/**
	 * Supplier country cd. 発注先国ＣＤ.<p>
	 *
	 */
	public void sppl_cntry_cd(String value) {
		setConstString(offset + 46, $sppl_cntry_cd, value);
	}


	/**
	 * Supplier country name 発注先国名.<p>
	 *
	 */
	public String sppl_cntry_nm() {
		return getConstString(offset + 47, $sppl_cntry_nm);
	}

	/**
	 * Supplier country name 発注先国名.<p>
	 *
	 */
	public void sppl_cntry_nm(String value) {
		setConstString(offset + 47, $sppl_cntry_nm, value);
	}


	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public String purc_amt_rnd_typ() {
		return getConstString(offset + 48, $purc_amt_rnd_typ);
	}

	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public void purc_amt_rnd_typ(String value) {
		setConstString(offset + 48, $purc_amt_rnd_typ, value);
	}


	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return getConstString(offset + 49, $purc_tax_rnd_typ);
	}

	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		setConstString(offset + 49, $purc_tax_rnd_typ, value);
	}


	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public boolean sppl_purc_upri_cng_flg() {
		return getConstBoolean(offset + 50, $sppl_purc_upri_cng_flg);
	}

	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public void sppl_purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 50, $sppl_purc_upri_cng_flg, value);
	}


	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public String sppl_cal_cd() {
		return getConstString(offset + 51, $sppl_cal_cd);
	}

	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public void sppl_cal_cd(String value) {
		setConstString(offset + 51, $sppl_cal_cd, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 52, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 52, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 53, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 53, $maker_nm, value);
	}


	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 54, $sppl_itm_cd);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 54, $sppl_itm_cd, value);
	}


	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 55, $sppl_itm_nm);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 55, $sppl_itm_nm, value);
	}


	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 56, $iv_itm_nm);
	}

	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 56, $iv_itm_nm, value);
	}


	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public MCDate rqst_avl_rqst_dt() {
		return getConstDate(offset + 57, $rqst_avl_rqst_dt);
	}

	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public void rqst_avl_rqst_dt(MCDate value) {
		setConstDate(offset + 57, $rqst_avl_rqst_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR rqst_dlv_rqst_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 58, $rqst_dlv_rqst_tm_p);
	}
	
	public void rqst_dlv_rqst_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 58, $rqst_dlv_rqst_tm_p, row);
	}


	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return getConstDate(offset + 59, $purc_schd_dt);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		setConstDate(offset + 59, $purc_schd_dt, value);
	}


	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public MCDate po_schd_dt() {
		return getConstDate(offset + 60, $po_schd_dt);
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public void po_schd_dt(MCDate value) {
		setConstDate(offset + 60, $po_schd_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 61, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 61, $usr_dpt_p, row);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String purc_dpt_wg_cd() {
		return getConstString(offset + 62, $purc_dpt_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void purc_dpt_wg_cd(String value) {
		setConstString(offset + 62, $purc_dpt_wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String purc_dpt_wg_nm() {
		return getConstString(offset + 63, $purc_dpt_wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void purc_dpt_wg_nm(String value) {
		setConstString(offset + 63, $purc_dpt_wg_nm, value);
	}


	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public String purc_upri_req_typ() {
		return getConstString(offset + 64, $purc_upri_req_typ);
	}

	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public void purc_upri_req_typ(String value) {
		setConstString(offset + 64, $purc_upri_req_typ, value);
	}


	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public String purc_upri_req_typ_nm() {
		return getConstString(offset + 65, $purc_upri_req_typ_nm);
	}

	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public void purc_upri_req_typ_nm(String value) {
		setConstString(offset + 65, $purc_upri_req_typ_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 66, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 66, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 67, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 67, $trd_cur_nm, value);
	}


	/**
	 * Amount number of decimal places (Transaction currency) 金額小数部有効桁数（取引通貨）.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 68, $trd_cur_amt_dec_place);
	}

	/**
	 * Amount number of decimal places (Transaction currency) 金額小数部有効桁数（取引通貨）.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 68, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Transaction currency) 金額小数部有効桁数（取引通貨）.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 68, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Transaction currency) 金額小数部有効桁数（取引通貨）.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 68, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Transaction currency) 金額小数部有効桁数（取引通貨）.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 68, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Transaction currency) 金額小数部有効桁数（取引通貨）.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 68, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Unit price number of decimal places (Transaction currency) 単価小数部有効桁数（取引通貨）.<p>
	 *
	 */
	public MCNumber trd_cur_upri_dec_place() {
		return getConstNumber(offset + 69, $trd_cur_upri_dec_place);
	}

	/**
	 * Unit price number of decimal places (Transaction currency) 単価小数部有効桁数（取引通貨）.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 69, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Transaction currency) 単価小数部有効桁数（取引通貨）.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 69, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Transaction currency) 単価小数部有効桁数（取引通貨）.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 69, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Transaction currency) 単価小数部有効桁数（取引通貨）.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 69, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Transaction currency) 単価小数部有効桁数（取引通貨）.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 69, $trd_cur_upri_dec_place, value);
	}


	public mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR trd_cur_upri_p(){
		return (mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR) getConstInnerRow(offset + 70, $trd_cur_upri_p);
	}
	
	public void trd_cur_upri_p(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR row){
		setConstInnerRow(offset + 70, $trd_cur_upri_p, row);
	}


	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 71, $repurc_obli_flg);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 71, $repurc_obli_flg, value);
	}


	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public String outsrc_upri_typ() {
		return getConstString(offset + 72, $outsrc_upri_typ);
	}

	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public void outsrc_upri_typ(String value) {
		setConstString(offset + 72, $outsrc_upri_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR trd_cur_proc_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 73, $trd_cur_proc_upri_p);
	}
	
	public void trd_cur_proc_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 73, $trd_cur_proc_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_proc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 74, $trd_cur_proc_amt_p);
	}
	
	public void trd_cur_proc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 74, $trd_cur_proc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR trd_cur_onr_prov_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 75, $trd_cur_onr_prov_upri_p);
	}
	
	public void trd_cur_onr_prov_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 75, $trd_cur_onr_prov_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_onr_prov_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 76, $trd_cur_onr_prov_amt_p);
	}
	
	public void trd_cur_onr_prov_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 76, $trd_cur_onr_prov_amt_p, row);
	}


	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public MCNumber old_trd_cur_upri() {
		return getConstNumber(offset + 77, $old_trd_cur_upri);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void old_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 77, $old_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void old_trd_cur_upri(int value) {
		setConstNumber(offset + 77, $old_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void old_trd_cur_upri(long value) {
		setConstNumber(offset + 77, $old_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void old_trd_cur_upri(float value) {
		setConstNumber(offset + 77, $old_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void old_trd_cur_upri(double value) {
		setConstNumber(offset + 77, $old_trd_cur_upri, value);
	}


	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public MCNumber old_trd_cur_proc_upri() {
		return getConstNumber(offset + 78, $old_trd_cur_proc_upri);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void old_trd_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 78, $old_trd_cur_proc_upri, value);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void old_trd_cur_proc_upri(int value) {
		setConstNumber(offset + 78, $old_trd_cur_proc_upri, value);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void old_trd_cur_proc_upri(long value) {
		setConstNumber(offset + 78, $old_trd_cur_proc_upri, value);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void old_trd_cur_proc_upri(float value) {
		setConstNumber(offset + 78, $old_trd_cur_proc_upri, value);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void old_trd_cur_proc_upri(double value) {
		setConstNumber(offset + 78, $old_trd_cur_proc_upri, value);
	}


	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber old_trd_cur_onr_prov_upri() {
		return getConstNumber(offset + 79, $old_trd_cur_onr_prov_upri);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void old_trd_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 79, $old_trd_cur_onr_prov_upri, value);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void old_trd_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 79, $old_trd_cur_onr_prov_upri, value);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void old_trd_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 79, $old_trd_cur_onr_prov_upri, value);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void old_trd_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 79, $old_trd_cur_onr_prov_upri, value);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void old_trd_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 79, $old_trd_cur_onr_prov_upri, value);
	}


	/**
	 * Temporary unit price before change 変更前仮単価.<p>
	 *
	 */
	public boolean old_interim_flg() {
		return getConstBoolean(offset + 80, $old_interim_flg);
	}

	/**
	 * Temporary unit price before change 変更前仮単価.<p>
	 *
	 */
	public void old_interim_flg(boolean value) {
		setConstBoolean(offset + 80, $old_interim_flg, value);
	}


	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 81, $xrate_cd);
	}

	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 81, $xrate_cd, value);
	}


	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return getConstBoolean(offset + 82, $xrate_inpt_flg);
	}

	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 82, $xrate_inpt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5390.XrateR xrate_p(){
		return (mcframe.clientMAUB.MAUBP5390.XrateR) getConstInnerRow(offset + 83, $xrate_p);
	}
	
	public void xrate_p(mcframe.clientMAUB.MAUBP5390.XrateR row){
		setConstInnerRow(offset + 83, $xrate_p, row);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 84, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 84, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 85, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 85, $base_cur_nm, value);
	}


	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_amt_dec_place() {
		return getConstNumber(offset + 86, $base_cur_amt_dec_place);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 86, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(int value) {
		setConstNumber(offset + 86, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(long value) {
		setConstNumber(offset + 86, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(float value) {
		setConstNumber(offset + 86, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(double value) {
		setConstNumber(offset + 86, $base_cur_amt_dec_place, value);
	}


	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_upri_dec_place() {
		return getConstNumber(offset + 87, $base_cur_upri_dec_place);
	}

	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 87, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(int value) {
		setConstNumber(offset + 87, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(long value) {
		setConstNumber(offset + 87, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(float value) {
		setConstNumber(offset + 87, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(double value) {
		setConstNumber(offset + 87, $base_cur_upri_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR base_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 88, $base_cur_upri_p);
	}
	
	public void base_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 88, $base_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 89, $base_cur_amt_p);
	}
	
	public void base_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 89, $base_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 90, $base_cur_tax_amt_p);
	}
	
	public void base_cur_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 90, $base_cur_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 91, $base_cur_inc_tax_amt_p);
	}
	
	public void base_cur_inc_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 91, $base_cur_inc_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR base_cur_proc_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 92, $base_cur_proc_upri_p);
	}
	
	public void base_cur_proc_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 92, $base_cur_proc_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_proc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 93, $base_cur_proc_amt_p);
	}
	
	public void base_cur_proc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 93, $base_cur_proc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR base_cur_onr_prov_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 94, $base_cur_onr_prov_upri_p);
	}
	
	public void base_cur_onr_prov_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 94, $base_cur_onr_prov_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_onr_prov_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 95, $base_cur_onr_prov_amt_p);
	}
	
	public void base_cur_onr_prov_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 95, $base_cur_onr_prov_amt_p, row);
	}


	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return getConstBoolean(offset + 96, $ptax_xrate_inpt_flg);
	}

	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 96, $ptax_xrate_inpt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5390.XrateR ptax_xrate_p(){
		return (mcframe.clientMAUB.MAUBP5390.XrateR) getConstInnerRow(offset + 97, $ptax_xrate_p);
	}
	
	public void ptax_xrate_p(mcframe.clientMAUB.MAUBP5390.XrateR row){
		setConstInnerRow(offset + 97, $ptax_xrate_p, row);
	}


	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 98, $ptax_cur_cd);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 98, $ptax_cur_cd, value);
	}


	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public String ptax_cur_nm() {
		return getConstString(offset + 99, $ptax_cur_nm);
	}

	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public void ptax_cur_nm(String value) {
		setConstString(offset + 99, $ptax_cur_nm, value);
	}


	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber ptax_cur_amt_dec_place() {
		return getConstNumber(offset + 100, $ptax_cur_amt_dec_place);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 100, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(int value) {
		setConstNumber(offset + 100, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(long value) {
		setConstNumber(offset + 100, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(float value) {
		setConstNumber(offset + 100, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(double value) {
		setConstNumber(offset + 100, $ptax_cur_amt_dec_place, value);
	}


	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber ptax_cur_upri_dec_place() {
		return getConstNumber(offset + 101, $ptax_cur_upri_dec_place);
	}

	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 101, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(int value) {
		setConstNumber(offset + 101, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(long value) {
		setConstNumber(offset + 101, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(float value) {
		setConstNumber(offset + 101, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(double value) {
		setConstNumber(offset + 101, $ptax_cur_upri_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR ptax_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 102, $ptax_cur_upri_p);
	}
	
	public void ptax_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 102, $ptax_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 103, $ptax_cur_amt_p);
	}
	
	public void ptax_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 103, $ptax_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 104, $ptax_cur_tax_amt_p);
	}
	
	public void ptax_cur_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 104, $ptax_cur_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 105, $ptax_cur_inc_tax_amt_p);
	}
	
	public void ptax_cur_inc_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 105, $ptax_cur_inc_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR ptax_cur_proc_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 106, $ptax_cur_proc_upri_p);
	}
	
	public void ptax_cur_proc_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 106, $ptax_cur_proc_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_proc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 107, $ptax_cur_proc_amt_p);
	}
	
	public void ptax_cur_proc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 107, $ptax_cur_proc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR ptax_cur_onr_prov_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 108, $ptax_cur_onr_prov_upri_p);
	}
	
	public void ptax_cur_onr_prov_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 108, $ptax_cur_onr_prov_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_onr_prov_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 109, $ptax_cur_onr_prov_amt_p);
	}
	
	public void ptax_cur_onr_prov_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 109, $ptax_cur_onr_prov_amt_p, row);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 110, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 110, $sno_wrk_no_p, row);
	}


	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public String purc_rsn_cd() {
		return getConstString(offset + 111, $purc_rsn_cd);
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public void purc_rsn_cd(String value) {
		setConstString(offset + 111, $purc_rsn_cd, value);
	}


	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public String purc_rsn_nm() {
		return getConstString(offset + 112, $purc_rsn_nm);
	}

	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public void purc_rsn_nm(String value) {
		setConstString(offset + 112, $purc_rsn_nm, value);
	}


	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public boolean xpns_purc_flg() {
		return getConstBoolean(offset + 113, $xpns_purc_flg);
	}

	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public void xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 113, $xpns_purc_flg, value);
	}


	/**
	 * Expense purchase only 経費購買のみ.<p>
	 *
	 */
	public boolean not_xpns_purc_flg() {
		return getConstBoolean(offset + 114, $not_xpns_purc_flg);
	}

	/**
	 * Expense purchase only 経費購買のみ.<p>
	 *
	 */
	public void not_xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 114, $not_xpns_purc_flg, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 115, $intr_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 115, $intr_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 116, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 116, $trd_d_rmrks, value);
	}


	/**
	 * PO contact remarks 発注連絡備考.<p>
	 *
	 */
	public String po_cnt_rmrks() {
		return getConstString(offset + 117, $po_cnt_rmrks);
	}

	/**
	 * PO contact remarks 発注連絡備考.<p>
	 *
	 */
	public void po_cnt_rmrks(String value) {
		setConstString(offset + 117, $po_cnt_rmrks, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 118, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 118, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 119, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 119, $mfg_loc_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 120, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 120, $bom_ptn, value);
	}


	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return getConstBoolean(offset + 121, $outsrc_flg);
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		setConstBoolean(offset + 121, $outsrc_flg, value);
	}


	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public String outsrc_itm_ord_no() {
		return getConstString(offset + 122, $outsrc_itm_ord_no);
	}

	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public void outsrc_itm_ord_no(String value) {
		setConstString(offset + 122, $outsrc_itm_ord_no, value);
	}


	public mcframe.clientMSUB.MSUBP5040.BdItemR bditm_p(){
		return (mcframe.clientMSUB.MSUBP5040.BdItemR) getConstInnerRow(offset + 123, $bditm_p);
	}
	
	public void bditm_p(mcframe.clientMSUB.MSUBP5040.BdItemR row){
		setConstInnerRow(offset + 123, $bditm_p, row);
	}


	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public String bd_lot_mng_typ() {
		return getConstString(offset + 124, $bd_lot_mng_typ);
	}

	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public void bd_lot_mng_typ(String value) {
		setConstString(offset + 124, $bd_lot_mng_typ, value);
	}


	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public String bd_sublot_mng_typ() {
		return getConstString(offset + 125, $bd_sublot_mng_typ);
	}

	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public void bd_sublot_mng_typ(String value) {
		setConstString(offset + 125, $bd_sublot_mng_typ, value);
	}


	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public String bd_lot_no_typ() {
		return getConstString(offset + 126, $bd_lot_no_typ);
	}

	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public void bd_lot_no_typ(String value) {
		setConstString(offset + 126, $bd_lot_no_typ, value);
	}


	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public String bd_sublot_no_typ() {
		return getConstString(offset + 127, $bd_sublot_no_typ);
	}

	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public void bd_sublot_no_typ(String value) {
		setConstString(offset + 127, $bd_sublot_no_typ, value);
	}


	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public String bd_sno1_mng_typ() {
		return getConstString(offset + 128, $bd_sno1_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public void bd_sno1_mng_typ(String value) {
		setConstString(offset + 128, $bd_sno1_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public String bd_sno2_mng_typ() {
		return getConstString(offset + 129, $bd_sno2_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public void bd_sno2_mng_typ(String value) {
		setConstString(offset + 129, $bd_sno2_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public String bd_sno3_mng_typ() {
		return getConstString(offset + 130, $bd_sno3_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public void bd_sno3_mng_typ(String value) {
		setConstString(offset + 130, $bd_sno3_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public String bd_sno4_mng_typ() {
		return getConstString(offset + 131, $bd_sno4_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public void bd_sno4_mng_typ(String value) {
		setConstString(offset + 131, $bd_sno4_mng_typ, value);
	}


	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_fr_usr_cd() {
		return getConstString(offset + 132, $rqst_fr_usr_cd);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_fr_usr_cd(String value) {
		setConstString(offset + 132, $rqst_fr_usr_cd, value);
	}


	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public String rqst_fr_usr_nm() {
		return getConstString(offset + 133, $rqst_fr_usr_nm);
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public void rqst_fr_usr_nm(String value) {
		setConstString(offset + 133, $rqst_fr_usr_nm, value);
	}


	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_fr_dpt_cd() {
		return getConstString(offset + 134, $rqst_fr_dpt_cd);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_fr_dpt_cd(String value) {
		setConstString(offset + 134, $rqst_fr_dpt_cd, value);
	}


	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public String rqst_fr_dpt_nm() {
		return getConstString(offset + 135, $rqst_fr_dpt_nm);
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public void rqst_fr_dpt_nm(String value) {
		setConstString(offset + 135, $rqst_fr_dpt_nm, value);
	}


	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public String po_schd_no() {
		return getConstString(offset + 136, $po_schd_no);
	}

	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public void po_schd_no(String value) {
		setConstString(offset + 136, $po_schd_no, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 137, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 137, $trd_ptn_typ, value);
	}


	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public String po_schd_src_typ() {
		return getConstString(offset + 138, $po_schd_src_typ);
	}

	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public void po_schd_src_typ(String value) {
		setConstString(offset + 138, $po_schd_src_typ, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 139, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 139, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 140, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 140, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 141, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 141, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 142, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 142, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 143, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 143, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 144, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 144, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 145, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 145, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 146, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 146, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 147, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 147, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 148, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 148, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 149, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 149, $upd_srv_req_no, value);
	}


	/**
	 * PO schedule update counter 発注予定更新カウンタ.<p>
	 *
	 */
	public MCNumber po_schd_upd_cntr() {
		return getConstNumber(offset + 150, $po_schd_upd_cntr);
	}

	/**
	 * PO schedule update counter 発注予定更新カウンタ.<p>
	 *
	 */
	public void po_schd_upd_cntr(MCNumber value) {
		setConstNumber(offset + 150, $po_schd_upd_cntr, value);
	}

	/**
	 * PO schedule update counter 発注予定更新カウンタ.<p>
	 *
	 */
	public void po_schd_upd_cntr(int value) {
		setConstNumber(offset + 150, $po_schd_upd_cntr, value);
	}

	/**
	 * PO schedule update counter 発注予定更新カウンタ.<p>
	 *
	 */
	public void po_schd_upd_cntr(long value) {
		setConstNumber(offset + 150, $po_schd_upd_cntr, value);
	}

	/**
	 * PO schedule update counter 発注予定更新カウンタ.<p>
	 *
	 */
	public void po_schd_upd_cntr(float value) {
		setConstNumber(offset + 150, $po_schd_upd_cntr, value);
	}

	/**
	 * PO schedule update counter 発注予定更新カウンタ.<p>
	 *
	 */
	public void po_schd_upd_cntr(double value) {
		setConstNumber(offset + 150, $po_schd_upd_cntr, value);
	}


	/**
	 * Unit price acquisition base date 単価取得基準日.<p>
	 *
	 */
	public MCDate base_dt() {
		return getConstDate(offset + 151, $base_dt);
	}

	/**
	 * Unit price acquisition base date 単価取得基準日.<p>
	 *
	 */
	public void base_dt(MCDate value) {
		setConstDate(offset + 151, $base_dt, value);
	}


	public String getString(String name) {
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cd();
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			return in_to_loc_nm();
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			return in_to_loc_wg_cd();
		}
		if ($in_to_loc_wg_nm.equalsIgnoreCase(name)) {
			return in_to_loc_wg_nm();
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			return drct_dlv_typ();
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			return drct_dlv_typ_nm();
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			return outsrc_sppl_cd();
		}
		if ($in_to_loc_cal_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cal_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_cntry_cd.equalsIgnoreCase(name)) {
			return sppl_cntry_cd();
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			return sppl_cntry_nm();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			return purc_dpt_wg_cd();
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			return purc_dpt_wg_nm();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
		}
		if ($purc_upri_req_typ_nm.equalsIgnoreCase(name)) {
			return purc_upri_req_typ_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			return purc_rsn_cd();
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			return purc_rsn_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($po_cnt_rmrks.equalsIgnoreCase(name)) {
			return po_cnt_rmrks();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($outsrc_itm_ord_no.equalsIgnoreCase(name)) {
			return outsrc_itm_ord_no();
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
		if ($rqst_fr_usr_cd.equalsIgnoreCase(name)) {
			return rqst_fr_usr_cd();
		}
		if ($rqst_fr_usr_nm.equalsIgnoreCase(name)) {
			return rqst_fr_usr_nm();
		}
		if ($rqst_fr_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_fr_dpt_cd();
		}
		if ($rqst_fr_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_fr_dpt_nm();
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			return po_schd_no();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			return po_schd_src_typ();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			return old_trd_cur_upri();
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return old_trd_cur_proc_upri();
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return old_trd_cur_onr_prov_upri();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return base_cur_upri_dec_place();
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_amt_dec_place();
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_upri_dec_place();
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			return po_schd_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($reg_dt.equalsIgnoreCase(name)) {
			return reg_dt();
		}
		if ($rqst_avl_rqst_dt.equalsIgnoreCase(name)) {
			return rqst_avl_rqst_dt();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			return po_schd_dt();
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($rqst_upd_stop_flg.equalsIgnoreCase(name)) {
			return rqst_upd_stop_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return itm_purc_upri_cng_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($sppl_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return sppl_purc_upri_cng_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($old_interim_flg.equalsIgnoreCase(name)) {
			return old_interim_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($not_xpns_purc_flg.equalsIgnoreCase(name)) {
			return not_xpns_purc_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cd();
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			return in_to_loc_nm();
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			return in_to_loc_wg_cd();
		}
		if ($in_to_loc_wg_nm.equalsIgnoreCase(name)) {
			return in_to_loc_wg_nm();
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			return drct_dlv_typ();
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			return drct_dlv_typ_nm();
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			return outsrc_sppl_cd();
		}
		if ($in_to_loc_cal_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cal_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_cntry_cd.equalsIgnoreCase(name)) {
			return sppl_cntry_cd();
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			return sppl_cntry_nm();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			return purc_dpt_wg_cd();
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			return purc_dpt_wg_nm();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
		}
		if ($purc_upri_req_typ_nm.equalsIgnoreCase(name)) {
			return purc_upri_req_typ_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			return purc_rsn_cd();
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			return purc_rsn_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($po_cnt_rmrks.equalsIgnoreCase(name)) {
			return po_cnt_rmrks();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($outsrc_itm_ord_no.equalsIgnoreCase(name)) {
			return outsrc_itm_ord_no();
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
		if ($rqst_fr_usr_cd.equalsIgnoreCase(name)) {
			return rqst_fr_usr_cd();
		}
		if ($rqst_fr_usr_nm.equalsIgnoreCase(name)) {
			return rqst_fr_usr_nm();
		}
		if ($rqst_fr_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_fr_dpt_cd();
		}
		if ($rqst_fr_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_fr_dpt_nm();
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			return po_schd_no();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			return po_schd_src_typ();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			return old_trd_cur_upri();
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return old_trd_cur_proc_upri();
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return old_trd_cur_onr_prov_upri();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return base_cur_upri_dec_place();
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_amt_dec_place();
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_upri_dec_place();
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			return po_schd_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($reg_dt.equalsIgnoreCase(name)) {
			return reg_dt();
		}
		if ($rqst_avl_rqst_dt.equalsIgnoreCase(name)) {
			return rqst_avl_rqst_dt();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			return po_schd_dt();
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($rqst_upd_stop_flg.equalsIgnoreCase(name)) {
			return rqst_upd_stop_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return itm_purc_upri_cng_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($sppl_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return sppl_purc_upri_cng_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($old_interim_flg.equalsIgnoreCase(name)) {
			return old_interim_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($not_xpns_purc_flg.equalsIgnoreCase(name)) {
			return not_xpns_purc_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			in_to_loc_cd(value);
			return;
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			in_to_loc_nm(value);
			return;
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			in_to_loc_wg_cd(value);
			return;
		}
		if ($in_to_loc_wg_nm.equalsIgnoreCase(name)) {
			in_to_loc_wg_nm(value);
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
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			outsrc_sppl_cd(value);
			return;
		}
		if ($in_to_loc_cal_cd.equalsIgnoreCase(name)) {
			in_to_loc_cal_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($sppl_cntry_cd.equalsIgnoreCase(name)) {
			sppl_cntry_cd(value);
			return;
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			sppl_cntry_nm(value);
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
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
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
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
			return;
		}
		if ($purc_upri_req_typ_nm.equalsIgnoreCase(name)) {
			purc_upri_req_typ_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
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
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
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
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($po_cnt_rmrks.equalsIgnoreCase(name)) {
			po_cnt_rmrks(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($outsrc_itm_ord_no.equalsIgnoreCase(name)) {
			outsrc_itm_ord_no(value);
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
		if ($rqst_fr_usr_cd.equalsIgnoreCase(name)) {
			rqst_fr_usr_cd(value);
			return;
		}
		if ($rqst_fr_usr_nm.equalsIgnoreCase(name)) {
			rqst_fr_usr_nm(value);
			return;
		}
		if ($rqst_fr_dpt_cd.equalsIgnoreCase(name)) {
			rqst_fr_dpt_cd(value);
			return;
		}
		if ($rqst_fr_dpt_nm.equalsIgnoreCase(name)) {
			rqst_fr_dpt_nm(value);
			return;
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			po_schd_no(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			po_schd_src_typ(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($reg_dt.equalsIgnoreCase(name)) {
			reg_dt(value);
			return;
		}
		if ($rqst_avl_rqst_dt.equalsIgnoreCase(name)) {
			rqst_avl_rqst_dt(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			po_schd_dt(value);
			return;
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($rqst_upd_stop_flg.equalsIgnoreCase(name)) {
			rqst_upd_stop_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			itm_purc_upri_cng_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($sppl_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			sppl_purc_upri_cng_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($old_interim_flg.equalsIgnoreCase(name)) {
			old_interim_flg(value);
			return;
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($not_xpns_purc_flg.equalsIgnoreCase(name)) {
			not_xpns_purc_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			in_to_loc_cd(value);
			return;
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			in_to_loc_nm(value);
			return;
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			in_to_loc_wg_cd(value);
			return;
		}
		if ($in_to_loc_wg_nm.equalsIgnoreCase(name)) {
			in_to_loc_wg_nm(value);
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
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			outsrc_sppl_cd(value);
			return;
		}
		if ($in_to_loc_cal_cd.equalsIgnoreCase(name)) {
			in_to_loc_cal_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($sppl_cntry_cd.equalsIgnoreCase(name)) {
			sppl_cntry_cd(value);
			return;
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			sppl_cntry_nm(value);
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
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
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
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
			return;
		}
		if ($purc_upri_req_typ_nm.equalsIgnoreCase(name)) {
			purc_upri_req_typ_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
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
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
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
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($po_cnt_rmrks.equalsIgnoreCase(name)) {
			po_cnt_rmrks(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($outsrc_itm_ord_no.equalsIgnoreCase(name)) {
			outsrc_itm_ord_no(value);
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
		if ($rqst_fr_usr_cd.equalsIgnoreCase(name)) {
			rqst_fr_usr_cd(value);
			return;
		}
		if ($rqst_fr_usr_nm.equalsIgnoreCase(name)) {
			rqst_fr_usr_nm(value);
			return;
		}
		if ($rqst_fr_dpt_cd.equalsIgnoreCase(name)) {
			rqst_fr_dpt_cd(value);
			return;
		}
		if ($rqst_fr_dpt_nm.equalsIgnoreCase(name)) {
			rqst_fr_dpt_nm(value);
			return;
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			po_schd_no(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			po_schd_src_typ(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($reg_dt.equalsIgnoreCase(name)) {
			reg_dt(value);
			return;
		}
		if ($rqst_avl_rqst_dt.equalsIgnoreCase(name)) {
			rqst_avl_rqst_dt(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			po_schd_dt(value);
			return;
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($rqst_upd_stop_flg.equalsIgnoreCase(name)) {
			rqst_upd_stop_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			itm_purc_upri_cng_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($sppl_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			sppl_purc_upri_cng_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($old_interim_flg.equalsIgnoreCase(name)) {
			old_interim_flg(value);
			return;
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($not_xpns_purc_flg.equalsIgnoreCase(name)) {
			not_xpns_purc_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dlv_rqst_tm_p.equalsIgnoreCase(name)) {
			return dlv_rqst_tm_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($trd_unit_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_qty_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($inst_cont_qty_p.equalsIgnoreCase(name)) {
			return inst_cont_qty_p();
		}
		if ($cont_unit_p.equalsIgnoreCase(name)) {
			return cont_unit_p();
		}
		if ($std_cont_p.equalsIgnoreCase(name)) {
			return std_cont_p();
		}
		if ($rqst_dlv_rqst_tm_p.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_tm_p();
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		if ($trd_cur_upri_p.equalsIgnoreCase(name)) {
			return trd_cur_upri_p();
		}
		if ($trd_cur_proc_upri_p.equalsIgnoreCase(name)) {
			return trd_cur_proc_upri_p();
		}
		if ($trd_cur_proc_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_proc_amt_p();
		}
		if ($trd_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_upri_p();
		}
		if ($trd_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_amt_p();
		}
		if ($xrate_p.equalsIgnoreCase(name)) {
			return xrate_p();
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
		if ($base_cur_proc_upri_p.equalsIgnoreCase(name)) {
			return base_cur_proc_upri_p();
		}
		if ($base_cur_proc_amt_p.equalsIgnoreCase(name)) {
			return base_cur_proc_amt_p();
		}
		if ($base_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_upri_p();
		}
		if ($base_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_amt_p();
		}
		if ($ptax_xrate_p.equalsIgnoreCase(name)) {
			return ptax_xrate_p();
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
		if ($ptax_cur_proc_upri_p.equalsIgnoreCase(name)) {
			return ptax_cur_proc_upri_p();
		}
		if ($ptax_cur_proc_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_proc_amt_p();
		}
		if ($ptax_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			return ptax_cur_onr_prov_upri_p();
		}
		if ($ptax_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_onr_prov_amt_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($bditm_p.equalsIgnoreCase(name)) {
			return bditm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dlv_rqst_tm_p.equalsIgnoreCase(name)) {
			dlv_rqst_tm_p(
				((MCContainerMeta) dlv_rqst_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
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
		if ($inst_cont_qty_p.equalsIgnoreCase(name)) {
			inst_cont_qty_p(
				((MCContainerMeta) inst_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($cont_unit_p.equalsIgnoreCase(name)) {
			cont_unit_p(
				((MCContainerMeta) cont_unit_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class, value)
			);
			return;
		}
		if ($std_cont_p.equalsIgnoreCase(name)) {
			std_cont_p(
				((MCContainerMeta) std_cont_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5280.StdContFctrR.class, value)
			);
			return;
		}
		if ($rqst_dlv_rqst_tm_p.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_tm_p(
				((MCContainerMeta) rqst_dlv_rqst_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			usr_dpt_p(
				((MCContainerMeta) usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		if ($trd_cur_upri_p.equalsIgnoreCase(name)) {
			trd_cur_upri_p(
				((MCContainerMeta) trd_cur_upri_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.class, value)
			);
			return;
		}
		if ($trd_cur_proc_upri_p.equalsIgnoreCase(name)) {
			trd_cur_proc_upri_p(
				((MCContainerMeta) trd_cur_proc_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($trd_cur_proc_amt_p.equalsIgnoreCase(name)) {
			trd_cur_proc_amt_p(
				((MCContainerMeta) trd_cur_proc_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($trd_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri_p(
				((MCContainerMeta) trd_cur_onr_prov_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($trd_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt_p(
				((MCContainerMeta) trd_cur_onr_prov_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xrate_p.equalsIgnoreCase(name)) {
			xrate_p(
				((MCContainerMeta) xrate_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5390.XrateR.class, value)
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
		if ($base_cur_proc_upri_p.equalsIgnoreCase(name)) {
			base_cur_proc_upri_p(
				((MCContainerMeta) base_cur_proc_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($base_cur_proc_amt_p.equalsIgnoreCase(name)) {
			base_cur_proc_amt_p(
				((MCContainerMeta) base_cur_proc_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri_p(
				((MCContainerMeta) base_cur_onr_prov_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($base_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt_p(
				((MCContainerMeta) base_cur_onr_prov_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ptax_xrate_p.equalsIgnoreCase(name)) {
			ptax_xrate_p(
				((MCContainerMeta) ptax_xrate_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5390.XrateR.class, value)
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
		if ($ptax_cur_proc_upri_p.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri_p(
				((MCContainerMeta) ptax_cur_proc_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($ptax_cur_proc_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt_p(
				((MCContainerMeta) ptax_cur_proc_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ptax_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri_p(
				((MCContainerMeta) ptax_cur_onr_prov_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($ptax_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt_p(
				((MCContainerMeta) ptax_cur_onr_prov_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($bditm_p.equalsIgnoreCase(name)) {
			bditm_p(
				((MCContainerMeta) bditm_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5040.BdItemR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return dlv_rqst_tm_p().ymd();
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		dlv_rqst_tm_p().ymd(value);
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCDate dlv_rqst_hm() {
		return dlv_rqst_tm_p().hm();
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public void dlv_rqst_hm(MCDate value) {
		dlv_rqst_tm_p().hm(value);
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return ver_no_p().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		ver_no_p().ver_no(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return trd_unit_qty_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
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

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public MCNumber cont_qty() {
		return inst_cont_qty_p().cont_qty();
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void cont_qty(MCNumber value) {
		inst_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void cont_qty(int value) {
		inst_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void cont_qty(long value) {
		inst_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void cont_qty(float value) {
		inst_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void cont_qty(double value) {
		inst_cont_qty_p().cont_qty(value);
	}

	public String cont_fctr_unit_cd() {
		return cont_unit_p().cont_fctr_unit_cd();
	}

	public void cont_fctr_unit_cd(String value) {
		cont_unit_p().cont_fctr_unit_cd(value);
	}

	public String cont_fctr_unit_nm() {
		return cont_unit_p().cont_fctr_unit_nm();
	}

	public void cont_fctr_unit_nm(String value) {
		cont_unit_p().cont_fctr_unit_nm(value);
	}

	public MCNumber std_cont_fctr() {
		return std_cont_p().std_cont_fctr();
	}

	public void std_cont_fctr(MCNumber value) {
		std_cont_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(int value) {
		std_cont_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(long value) {
		std_cont_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(float value) {
		std_cont_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(double value) {
		std_cont_p().std_cont_fctr(value);
	}

	/**
	 * Request source desired delivery date 依頼元納入希望日.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_dt() {
		return rqst_dlv_rqst_tm_p().ymd();
	}

	/**
	 * Request source desired delivery date 依頼元納入希望日.<p>
	 *
	 */
	public void rqst_dlv_rqst_dt(MCDate value) {
		rqst_dlv_rqst_tm_p().ymd(value);
	}

	/**
	 * Request source desired delivery time 依頼元納入希望時刻.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_hm() {
		return rqst_dlv_rqst_tm_p().hm();
	}

	/**
	 * Request source desired delivery time 依頼元納入希望時刻.<p>
	 *
	 */
	public void rqst_dlv_rqst_hm(MCDate value) {
		rqst_dlv_rqst_tm_p().hm(value);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public String purc_usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public void purc_usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public String purc_dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public void purc_dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
	}

	public boolean upri_not_tgt_flg() {
		return trd_cur_upri_p().upri_not_tgt_flg();
	}

	public void upri_not_tgt_flg(boolean value) {
		trd_cur_upri_p().upri_not_tgt_flg(value);
	}

	public MCNumber trd_cur_upri() {
		return trd_cur_upri_p().trd_cur_upri();
	}

	public void trd_cur_upri(MCNumber value) {
		trd_cur_upri_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(int value) {
		trd_cur_upri_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(long value) {
		trd_cur_upri_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(float value) {
		trd_cur_upri_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(double value) {
		trd_cur_upri_p().trd_cur_upri(value);
	}

	public boolean interim_flg() {
		return trd_cur_upri_p().interim_flg();
	}

	public void interim_flg(boolean value) {
		trd_cur_upri_p().interim_flg(value);
	}

	public MCNumber trd_cur_amt() {
		return trd_cur_upri_p().trd_cur_amt();
	}

	public void trd_cur_amt(MCNumber value) {
		trd_cur_upri_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(int value) {
		trd_cur_upri_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(long value) {
		trd_cur_upri_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(float value) {
		trd_cur_upri_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(double value) {
		trd_cur_upri_p().trd_cur_amt(value);
	}

	public MCNumber trd_cur_inc_tax_amt() {
		return trd_cur_upri_p().trd_cur_inc_tax_amt();
	}

	public void trd_cur_inc_tax_amt(MCNumber value) {
		trd_cur_upri_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(int value) {
		trd_cur_upri_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(long value) {
		trd_cur_upri_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(float value) {
		trd_cur_upri_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(double value) {
		trd_cur_upri_p().trd_cur_inc_tax_amt(value);
	}

	public boolean tax_fix_flg() {
		return trd_cur_upri_p().tax_fix_flg();
	}

	public void tax_fix_flg(boolean value) {
		trd_cur_upri_p().tax_fix_flg(value);
	}

	public String tax_cd() {
		return trd_cur_upri_p().tax_cd();
	}

	public void tax_cd(String value) {
		trd_cur_upri_p().tax_cd(value);
	}

	public String tax_nm() {
		return trd_cur_upri_p().tax_nm();
	}

	public void tax_nm(String value) {
		trd_cur_upri_p().tax_nm(value);
	}

	public MCNumber tax_rate() {
		return trd_cur_upri_p().tax_rate();
	}

	public void tax_rate(MCNumber value) {
		trd_cur_upri_p().tax_rate(value);
	}

	public void tax_rate(int value) {
		trd_cur_upri_p().tax_rate(value);
	}

	public void tax_rate(long value) {
		trd_cur_upri_p().tax_rate(value);
	}

	public void tax_rate(float value) {
		trd_cur_upri_p().tax_rate(value);
	}

	public void tax_rate(double value) {
		trd_cur_upri_p().tax_rate(value);
	}

	public String tax_typ() {
		return trd_cur_upri_p().tax_typ();
	}

	public void tax_typ(String value) {
		trd_cur_upri_p().tax_typ(value);
	}

	public boolean inc_tax_flg() {
		return trd_cur_upri_p().inc_tax_flg();
	}

	public void inc_tax_flg(boolean value) {
		trd_cur_upri_p().inc_tax_flg(value);
	}

	public MCNumber trd_cur_tax_amt() {
		return trd_cur_upri_p().trd_cur_tax_amt();
	}

	public void trd_cur_tax_amt(MCNumber value) {
		trd_cur_upri_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(int value) {
		trd_cur_upri_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(long value) {
		trd_cur_upri_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(float value) {
		trd_cur_upri_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(double value) {
		trd_cur_upri_p().trd_cur_tax_amt(value);
	}

	public MCNumber trd_cur_dscnt_amt() {
		return trd_cur_upri_p().trd_cur_dscnt_amt();
	}

	public void trd_cur_dscnt_amt(MCNumber value) {
		trd_cur_upri_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(int value) {
		trd_cur_upri_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(long value) {
		trd_cur_upri_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(float value) {
		trd_cur_upri_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(double value) {
		trd_cur_upri_p().trd_cur_dscnt_amt(value);
	}

	public String dscnt_rsn_cd() {
		return trd_cur_upri_p().dscnt_rsn_cd();
	}

	public void dscnt_rsn_cd(String value) {
		trd_cur_upri_p().dscnt_rsn_cd(value);
	}

	public String dscnt_rsn_nm() {
		return trd_cur_upri_p().dscnt_rsn_nm();
	}

	public void dscnt_rsn_nm(String value) {
		trd_cur_upri_p().dscnt_rsn_nm(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public MCNumber trd_cur_proc_upri() {
		return trd_cur_proc_upri_p().upri();
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(MCNumber value) {
		trd_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(int value) {
		trd_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(long value) {
		trd_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(float value) {
		trd_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(double value) {
		trd_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return trd_cur_proc_amt_p().amt();
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		trd_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		trd_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		trd_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		trd_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		trd_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting tax amount (Transaction currency) 取引通貨加工税額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_tax_amt() {
		return trd_cur_proc_amt_p().tax_amt();
	}

	/**
	 * Subcontracting tax amount (Transaction currency) 取引通貨加工税額.<p>
	 *
	 */
	public void trd_cur_proc_tax_amt(MCNumber value) {
		trd_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Transaction currency) 取引通貨加工税額.<p>
	 *
	 */
	public void trd_cur_proc_tax_amt(int value) {
		trd_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Transaction currency) 取引通貨加工税額.<p>
	 *
	 */
	public void trd_cur_proc_tax_amt(long value) {
		trd_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Transaction currency) 取引通貨加工税額.<p>
	 *
	 */
	public void trd_cur_proc_tax_amt(float value) {
		trd_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Transaction currency) 取引通貨加工税額.<p>
	 *
	 */
	public void trd_cur_proc_tax_amt(double value) {
		trd_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_upri() {
		return trd_cur_onr_prov_upri_p().upri();
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(MCNumber value) {
		trd_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(int value) {
		trd_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(long value) {
		trd_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(float value) {
		trd_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(double value) {
		trd_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return trd_cur_onr_prov_amt_p().amt();
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		trd_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		trd_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		trd_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		trd_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		trd_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * chargeable supply tax amount (Transaction currency) 取引通貨有償支給税額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_tax_amt() {
		return trd_cur_onr_prov_amt_p().tax_amt();
	}

	/**
	 * chargeable supply tax amount (Transaction currency) 取引通貨有償支給税額.<p>
	 *
	 */
	public void trd_cur_onr_prov_tax_amt(MCNumber value) {
		trd_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * chargeable supply tax amount (Transaction currency) 取引通貨有償支給税額.<p>
	 *
	 */
	public void trd_cur_onr_prov_tax_amt(int value) {
		trd_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * chargeable supply tax amount (Transaction currency) 取引通貨有償支給税額.<p>
	 *
	 */
	public void trd_cur_onr_prov_tax_amt(long value) {
		trd_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * chargeable supply tax amount (Transaction currency) 取引通貨有償支給税額.<p>
	 *
	 */
	public void trd_cur_onr_prov_tax_amt(float value) {
		trd_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * chargeable supply tax amount (Transaction currency) 取引通貨有償支給税額.<p>
	 *
	 */
	public void trd_cur_onr_prov_tax_amt(double value) {
		trd_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return xrate_p().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		xrate_p().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		xrate_p().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		xrate_p().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		xrate_p().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		xrate_p().xrate(value);
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
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public MCNumber base_cur_proc_upri() {
		return base_cur_proc_upri_p().upri();
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(MCNumber value) {
		base_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(int value) {
		base_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(long value) {
		base_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(float value) {
		base_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(double value) {
		base_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public MCNumber base_cur_proc_amt() {
		return base_cur_proc_amt_p().amt();
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(MCNumber value) {
		base_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(int value) {
		base_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(long value) {
		base_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(float value) {
		base_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(double value) {
		base_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting tax amount (Base currency) 基準通貨加工税額.<p>
	 *
	 */
	public MCNumber base_cur_proc_tax_amt() {
		return base_cur_proc_amt_p().tax_amt();
	}

	/**
	 * Subcontracting tax amount (Base currency) 基準通貨加工税額.<p>
	 *
	 */
	public void base_cur_proc_tax_amt(MCNumber value) {
		base_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Base currency) 基準通貨加工税額.<p>
	 *
	 */
	public void base_cur_proc_tax_amt(int value) {
		base_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Base currency) 基準通貨加工税額.<p>
	 *
	 */
	public void base_cur_proc_tax_amt(long value) {
		base_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Base currency) 基準通貨加工税額.<p>
	 *
	 */
	public void base_cur_proc_tax_amt(float value) {
		base_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Base currency) 基準通貨加工税額.<p>
	 *
	 */
	public void base_cur_proc_tax_amt(double value) {
		base_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_upri() {
		return base_cur_onr_prov_upri_p().upri();
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(MCNumber value) {
		base_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(int value) {
		base_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(long value) {
		base_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(float value) {
		base_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(double value) {
		base_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_amt() {
		return base_cur_onr_prov_amt_p().amt();
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(MCNumber value) {
		base_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(int value) {
		base_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(long value) {
		base_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(float value) {
		base_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(double value) {
		base_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply tax amount (Base currency) 基準通貨有償支給税額.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_tax_amt() {
		return base_cur_onr_prov_amt_p().tax_amt();
	}

	/**
	 * Chargeable supply tax amount (Base currency) 基準通貨有償支給税額.<p>
	 *
	 */
	public void base_cur_onr_prov_tax_amt(MCNumber value) {
		base_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply tax amount (Base currency) 基準通貨有償支給税額.<p>
	 *
	 */
	public void base_cur_onr_prov_tax_amt(int value) {
		base_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply tax amount (Base currency) 基準通貨有償支給税額.<p>
	 *
	 */
	public void base_cur_onr_prov_tax_amt(long value) {
		base_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply tax amount (Base currency) 基準通貨有償支給税額.<p>
	 *
	 */
	public void base_cur_onr_prov_tax_amt(float value) {
		base_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply tax amount (Base currency) 基準通貨有償支給税額.<p>
	 *
	 */
	public void base_cur_onr_prov_tax_amt(double value) {
		base_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return ptax_xrate_p().xrate();
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		ptax_xrate_p().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		ptax_xrate_p().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		ptax_xrate_p().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		ptax_xrate_p().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		ptax_xrate_p().xrate(value);
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

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public MCNumber ptax_cur_proc_upri() {
		return ptax_cur_proc_upri_p().upri();
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(MCNumber value) {
		ptax_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(int value) {
		ptax_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(long value) {
		ptax_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(float value) {
		ptax_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(double value) {
		ptax_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public MCNumber ptax_cur_proc_amt() {
		return ptax_cur_proc_amt_p().amt();
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(MCNumber value) {
		ptax_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(int value) {
		ptax_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(long value) {
		ptax_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(float value) {
		ptax_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(double value) {
		ptax_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting tax amount (Tax currency) 納税通貨加工税額.<p>
	 *
	 */
	public MCNumber ptax_cur_proc_tax_amt() {
		return ptax_cur_proc_amt_p().tax_amt();
	}

	/**
	 * Subcontracting tax amount (Tax currency) 納税通貨加工税額.<p>
	 *
	 */
	public void ptax_cur_proc_tax_amt(MCNumber value) {
		ptax_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Tax currency) 納税通貨加工税額.<p>
	 *
	 */
	public void ptax_cur_proc_tax_amt(int value) {
		ptax_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Tax currency) 納税通貨加工税額.<p>
	 *
	 */
	public void ptax_cur_proc_tax_amt(long value) {
		ptax_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Tax currency) 納税通貨加工税額.<p>
	 *
	 */
	public void ptax_cur_proc_tax_amt(float value) {
		ptax_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Tax currency) 納税通貨加工税額.<p>
	 *
	 */
	public void ptax_cur_proc_tax_amt(double value) {
		ptax_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public MCNumber ptax_cur_onr_prov_upri() {
		return ptax_cur_onr_prov_upri_p().upri();
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(MCNumber value) {
		ptax_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(int value) {
		ptax_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(long value) {
		ptax_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(float value) {
		ptax_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(double value) {
		ptax_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public MCNumber ptax_cur_onr_prov_amt() {
		return ptax_cur_onr_prov_amt_p().amt();
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(MCNumber value) {
		ptax_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(int value) {
		ptax_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(long value) {
		ptax_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(float value) {
		ptax_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(double value) {
		ptax_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply tax amount (Tax currency) 納税通貨有償支給税額.<p>
	 *
	 */
	public MCNumber ptax_cur_onr_prov_tax_amt() {
		return ptax_cur_onr_prov_amt_p().tax_amt();
	}

	/**
	 * Chargeable supply tax amount (Tax currency) 納税通貨有償支給税額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_tax_amt(MCNumber value) {
		ptax_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply tax amount (Tax currency) 納税通貨有償支給税額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_tax_amt(int value) {
		ptax_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply tax amount (Tax currency) 納税通貨有償支給税額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_tax_amt(long value) {
		ptax_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply tax amount (Tax currency) 納税通貨有償支給税額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_tax_amt(float value) {
		ptax_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply tax amount (Tax currency) 納税通貨有償支給税額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_tax_amt(double value) {
		ptax_cur_onr_prov_amt_p().tax_amt(value);
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

	public String bd_dpt_cd() {
		return bditm_p().bd_dpt_cd();
	}

	public void bd_dpt_cd(String value) {
		bditm_p().bd_dpt_cd(value);
	}

	public String bd_dpt_nm() {
		return bditm_p().bd_dpt_nm();
	}

	public void bd_dpt_nm(String value) {
		bditm_p().bd_dpt_nm(value);
	}

	public String bd_itm_cd() {
		return bditm_p().bd_itm_cd();
	}

	public void bd_itm_cd(String value) {
		bditm_p().bd_itm_cd(value);
	}

	public String bd_itm_sub1() {
		return bditm_p().bd_itm_sub1();
	}

	public void bd_itm_sub1(String value) {
		bditm_p().bd_itm_sub1(value);
	}

	public String bd_itm_sub2() {
		return bditm_p().bd_itm_sub2();
	}

	public void bd_itm_sub2(String value) {
		bditm_p().bd_itm_sub2(value);
	}

	public String bd_itm_sub3() {
		return bditm_p().bd_itm_sub3();
	}

	public void bd_itm_sub3(String value) {
		bditm_p().bd_itm_sub3(value);
	}

	public String bd_itm_nm() {
		return bditm_p().bd_itm_nm();
	}

	public void bd_itm_nm(String value) {
		bditm_p().bd_itm_nm(value);
	}

	public String bd_lot_no() {
		return bditm_p().bd_lot_no();
	}

	public void bd_lot_no(String value) {
		bditm_p().bd_lot_no(value);
	}

	public String bd_sublot_no() {
		return bditm_p().bd_sublot_no();
	}

	public void bd_sublot_no(String value) {
		bditm_p().bd_sublot_no(value);
	}

	public String bd_sno1() {
		return bditm_p().bd_sno1();
	}

	public void bd_sno1(String value) {
		bditm_p().bd_sno1(value);
	}

	public String bd_sno2() {
		return bditm_p().bd_sno2();
	}

	public void bd_sno2(String value) {
		bditm_p().bd_sno2(value);
	}

	public String bd_sno3() {
		return bditm_p().bd_sno3();
	}

	public void bd_sno3(String value) {
		bditm_p().bd_sno3(value);
	}

	public String bd_sno4() {
		return bditm_p().bd_sno4();
	}

	public void bd_sno4(String value) {
		bditm_p().bd_sno4(value);
	}

	public String bd_bp_cd() {
		return bditm_p().bd_bp_cd();
	}

	public void bd_bp_cd(String value) {
		bditm_p().bd_bp_cd(value);
	}

	public String bd_bp_nm() {
		return bditm_p().bd_bp_nm();
	}

	public void bd_bp_nm(String value) {
		bditm_p().bd_bp_nm(value);
	}

	public String bd_loc_cd() {
		return bditm_p().bd_loc_cd();
	}

	public void bd_loc_cd(String value) {
		bditm_p().bd_loc_cd(value);
	}

	public String bd_loc_nm() {
		return bditm_p().bd_loc_nm();
	}

	public void bd_loc_nm(String value) {
		bditm_p().bd_loc_nm(value);
	}

	public String bd_ctg_cd() {
		return bditm_p().bd_ctg_cd();
	}

	public void bd_ctg_cd(String value) {
		bditm_p().bd_ctg_cd(value);
	}

	public String bd_ctg_nm() {
		return bditm_p().bd_ctg_nm();
	}

	public void bd_ctg_nm(String value) {
		bditm_p().bd_ctg_nm(value);
	}

	public String bd_oper_cd() {
		return bditm_p().bd_oper_cd();
	}

	public void bd_oper_cd(String value) {
		bditm_p().bd_oper_cd(value);
	}

	public String bd_oper_nm() {
		return bditm_p().bd_oper_nm();
	}

	public void bd_oper_nm(String value) {
		bditm_p().bd_oper_nm(value);
	}

	public String bd_iv_no() {
		return bditm_p().bd_iv_no();
	}

	public void bd_iv_no(String value) {
		bditm_p().bd_iv_no(value);
	}

	public String bd_slo_no() {
		return bditm_p().bd_slo_no();
	}

	public void bd_slo_no(String value) {
		bditm_p().bd_slo_no(value);
	}

	public String bd_po_no() {
		return bditm_p().bd_po_no();
	}

	public void bd_po_no(String value) {
		bditm_p().bd_po_no(value);
	}

}

