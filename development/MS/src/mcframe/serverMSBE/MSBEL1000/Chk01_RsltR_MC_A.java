package mcframe.serverMSBE.MSBEL1000;

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
 * ブロック"Chk01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_RsltR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
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
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Allow supply unit price change 支給単価変更許可.<p>
	 *
	 */
	public static final String $prov_upri_cng_flg = "prov_upri_cng_flg";
	/**
	 * Allocation 引当.<p>
	 *
	 */
	public static final String $alloc_flg = "alloc_flg";
	/**
	 * Without lot ロット指定無.<p>
	 *
	 */
	public static final String $lot_none_flg = "lot_none_flg";
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
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Transaction qty. 取引数量.<p>
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
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
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
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * Active ingredient unit rounding type 有効成分単位端数処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	/**
	 * Input active ingredient 投入有効成分.<p>
	 *
	 */
	public static final String $cont_qty = "cont_qty";
	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public static final String $act_cont_qty = "act_cont_qty";
	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public static final String $std_cont_fctr = "std_cont_fctr";
	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public static final String $std_cont_qty = "std_cont_qty";
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public static final String $gi_loc_nm = "gi_loc_nm";
	/**
	 * For GI rack/line 出庫棚・ライン対象.<p>
	 *
	 */
	public static final String $gi_str_ln_tgt_flg = "gi_str_ln_tgt_flg";
	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gi_str_ln_cd = "gi_str_ln_cd";
	/**
	 * GI rack/line name 出庫棚・ライン名.<p>
	 *
	 */
	public static final String $gi_str_ln_nm = "gi_str_ln_nm";
	/**
	 * Without GI rack/line 出庫棚・ライン無.<p>
	 *
	 */
	public static final String $gi_str_ln_cd_none_flg = "gi_str_ln_cd_none_flg";
	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public static final String $gi_lg_grp_cd = "gi_lg_grp_cd";
	/**
	 * GI distribution group name 出庫物流グループ名.<p>
	 *
	 */
	public static final String $gi_lg_grp_nm = "gi_lg_grp_nm";
	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $gi_wg_cd = "gi_wg_cd";
	/**
	 * GI WG name 出庫ワーキンググループ名.<p>
	 *
	 */
	public static final String $gi_wg_nm = "gi_wg_nm";
	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $gi_site_cd = "gi_site_cd";
	/**
	 * GI factory/distribution warehouse name 出庫工場・物流倉庫名.<p>
	 *
	 */
	public static final String $gi_site_nm = "gi_site_nm";
	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gr_loc_cd = "gr_loc_cd";
	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public static final String $gr_loc_nm = "gr_loc_nm";
	/**
	 * For GR rack/line 入庫棚・ライン対象.<p>
	 *
	 */
	public static final String $gr_str_ln_tgt_flg = "gr_str_ln_tgt_flg";
	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gr_str_ln_cd = "gr_str_ln_cd";
	/**
	 * GR rack/line name 入庫棚・ライン名.<p>
	 *
	 */
	public static final String $gr_str_ln_nm = "gr_str_ln_nm";
	/**
	 * Without GR rack/line 入庫棚・ライン無.<p>
	 *
	 */
	public static final String $gr_str_ln_cd_none_flg = "gr_str_ln_cd_none_flg";
	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public static final String $gr_lg_grp_cd = "gr_lg_grp_cd";
	/**
	 * GR distribution group name 入庫物流グループ名.<p>
	 *
	 */
	public static final String $gr_lg_grp_nm = "gr_lg_grp_nm";
	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $gr_wg_cd = "gr_wg_cd";
	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public static final String $gr_wg_nm = "gr_wg_nm";
	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $gr_site_cd = "gr_site_cd";
	/**
	 * GR factory/distribution warehouse name 入庫工場・物流倉庫名.<p>
	 *
	 */
	public static final String $gr_site_nm = "gr_site_nm";
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
	 * GI supplier cd. 出庫発注先ＣＤ.<p>
	 *
	 */
	public static final String $gi_sppl_cd = "gi_sppl_cd";
	/**
	 * GI supplier name 出庫発注先名.<p>
	 *
	 */
	public static final String $gi_sppl_nm = "gi_sppl_nm";
	/**
	 * GI currency cd. 出庫通貨ＣＤ.<p>
	 *
	 */
	public static final String $gi_cur_cd = "gi_cur_cd";
	/**
	 * GI subcontract 出庫下請け.<p>
	 *
	 */
	public static final String $gi_subcon_flg = "gi_subcon_flg";
	/**
	 * GI chargeable supplier 出庫有償支給先.<p>
	 *
	 */
	public static final String $gi_onr_prsppl_flg = "gi_onr_prsppl_flg";
	/**
	 * Allow GI supply unit change 出庫支給単価変更許可.<p>
	 *
	 */
	public static final String $gi_prov_upri_cng_flg = "gi_prov_upri_cng_flg";
	/**
	 * GI supply amount rounding type 出庫支給金額端数処理区分.<p>
	 *
	 */
	public static final String $gi_prov_amt_rnd_typ = "gi_prov_amt_rnd_typ";
	/**
	 * GI supply tax rounding type 出庫支給税端数処理区分.<p>
	 *
	 */
	public static final String $gi_prov_tax_rnd_typ = "gi_prov_tax_rnd_typ";
	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $gi_stk_arrv_bp_cd = "gi_stk_arrv_bp_cd";
	/**
	 * GI inventory arriving point name 出庫在庫着荷先名.<p>
	 *
	 */
	public static final String $gi_stk_arrv_bp_nm = "gi_stk_arrv_bp_nm";
	/**
	 * GR supplier cd. 入庫発注先ＣＤ.<p>
	 *
	 */
	public static final String $gr_sppl_cd = "gr_sppl_cd";
	/**
	 * GR currency cd. 入庫通貨ＣＤ.<p>
	 *
	 */
	public static final String $gr_cur_cd = "gr_cur_cd";
	/**
	 * GR subcontract 入庫下請け.<p>
	 *
	 */
	public static final String $gr_subcon_flg = "gr_subcon_flg";
	/**
	 * GR chargeable supplier 入庫有償支給先.<p>
	 *
	 */
	public static final String $gr_onr_prsppl_flg = "gr_onr_prsppl_flg";
	/**
	 * GR supply in-transit management type 入庫支給積送管理区分.<p>
	 *
	 */
	public static final String $gr_prov_rcv_typ = "gr_prov_rcv_typ";
	/**
	 * GR supply recording type 入庫支給計上区分.<p>
	 *
	 */
	public static final String $gr_prov_basis_typ = "gr_prov_basis_typ";
	/**
	 * Allow GR supply unit price change 入庫支給単価変更許可.<p>
	 *
	 */
	public static final String $gr_prov_upri_cng_flg = "gr_prov_upri_cng_flg";
	/**
	 * Rounding type (GR supply amount) 入庫支給金額端数処理区分.<p>
	 *
	 */
	public static final String $gr_prov_amt_rnd_typ = "gr_prov_amt_rnd_typ";
	/**
	 * Rounding type (GR supply tax) 入庫支給税端数処理区分.<p>
	 *
	 */
	public static final String $gr_prov_tax_rnd_typ = "gr_prov_tax_rnd_typ";
	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public static final String $rcpt_dt = "rcpt_dt";
	/**
	 * Desired GI date and time 出庫希望日時.<p>
	 *
	 */
	public static final String $gi_rqst_tm = "gi_rqst_tm";
	/**
	 * Desired GI date 出庫希望日.<p>
	 *
	 */
	public static final String $gi_rqst_dt = "gi_rqst_dt";
	/**
	 * Desired GI time 出庫希望時刻.<p>
	 *
	 */
	public static final String $gi_rqst_hm = "gi_rqst_hm";
	/**
	 * Desired GR date and time 入庫希望日時.<p>
	 *
	 */
	public static final String $gr_rqst_tm = "gr_rqst_tm";
	/**
	 * Desired GR date 入庫希望日.<p>
	 *
	 */
	public static final String $gr_rqst_dt = "gr_rqst_dt";
	/**
	 * Desired GR time 入庫希望時刻.<p>
	 *
	 */
	public static final String $gr_rqst_hm = "gr_rqst_hm";
	/**
	 * Invoice transaction インボイス取引.<p>
	 *
	 */
	public static final String $iv_trd_flg = "iv_trd_flg";
	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public static final String $rqst_usr_cd = "rqst_usr_cd";
	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public static final String $rqst_usr_nm = "rqst_usr_nm";
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public static final String $rqst_dpt_cd = "rqst_dpt_cd";
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public static final String $rqst_dpt_nm = "rqst_dpt_nm";
	/**
	 * Edited by request source 依頼元訂正.<p>
	 *
	 */
	public static final String $rqst_mod_flg = "rqst_mod_flg";
	/**
	 * Unpegged 紐切れ.<p>
	 *
	 */
	public static final String $rqst_can_flg = "rqst_can_flg";
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public static final String $ship_term_nm = "ship_term_nm";
	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public static final String $ship_inst_typ = "ship_inst_typ";
	/**
	 * Shipping order type name 出荷指図区分名.<p>
	 *
	 */
	public static final String $ship_inst_typ_nm = "ship_inst_typ_nm";
	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public static final String $rsn_cd = "rsn_cd";
	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public static final String $rsn_nm = "rsn_nm";
	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public static final String $acxfr_gi_flg = "acxfr_gi_flg";
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
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public static final String $ship_block_flg = "ship_block_flg";
	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public static final String $ship_to_id_typ = "ship_to_id_typ";
	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public static final String $ship_to_id_typ_nm = "ship_to_id_typ_nm";
	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public static final String $ship_to_id_cd = "ship_to_id_cd";
	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public static final String $ship_to_id_nm = "ship_to_id_nm";
	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public static final String $ship_to_zip_cd = "ship_to_zip_cd";
	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public static final String $ship_to_addr1 = "ship_to_addr1";
	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public static final String $ship_to_addr2 = "ship_to_addr2";
	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public static final String $ship_to_addr3 = "ship_to_addr3";
	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public static final String $ship_to_addr4 = "ship_to_addr4";
	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public static final String $ship_to_cntct_dpt = "ship_to_cntct_dpt";
	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public static final String $ship_to_cntct_psn = "ship_to_cntct_psn";
	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public static final String $ship_to_tel = "ship_to_tel";
	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public static final String $ship_to_fax = "ship_to_fax";
	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public static final String $ship_to_sundry_flg = "ship_to_sundry_flg";
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public static final String $via_dlv_typ_nm = "via_dlv_typ_nm";
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public static final String $prov_typ_nm = "prov_typ_nm";
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public static final String $prov_basis_typ_nm = "prov_basis_typ_nm";
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
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_upri_dec_place = "trd_cur_upri_dec_place";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
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
	 * Tax name 税名.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
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
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public static final String $trd_cur_inc_tax_amt = "trd_cur_inc_tax_amt";
	/**
	 * Supply exchange rate cd. 支給為替レートＣＤ.<p>
	 *
	 */
	public static final String $prov_xrate_cd = "prov_xrate_cd";
	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public static final String $xrate_inpt_flg = "xrate_inpt_flg";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
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
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public static final String $ptax_xrate_inpt_flg = "ptax_xrate_inpt_flg";
	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public static final String $ptax_xrate = "ptax_xrate";
	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public static final String $ptax_amt = "ptax_amt";
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
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public static final String $ret_prov_typ = "ret_prov_typ";
	/**
	 * Supply type name (Return) 支給区分名（返品）.<p>
	 *
	 */
	public static final String $ret_prov_typ_nm = "ret_prov_typ_nm";
	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public static final String $ret_prov_basis_typ = "ret_prov_basis_typ";
	/**
	 * Supply recording type name (Return) 支給計上区分名（返品）.<p>
	 *
	 */
	public static final String $ret_prov_basis_typ_nm = "ret_prov_basis_typ_nm";
	/**
	 * Currency cd. (Return) 通貨ＣＤ（返品）.<p>
	 *
	 */
	public static final String $ret_trd_cur_cd = "ret_trd_cur_cd";
	/**
	 * Currency name (Return) 通貨名（返品）.<p>
	 *
	 */
	public static final String $ret_trd_cur_nm = "ret_trd_cur_nm";
	/**
	 * Transaction amount number of decimal places (Return) 取引金額小数部有効桁数（返品）.<p>
	 *
	 */
	public static final String $ret_trd_cur_amt_dec_place = "ret_trd_cur_amt_dec_place";
	/**
	 * Transaction unit price number of decimal places (Return) 取引単価小数部有効桁数（返品）.<p>
	 *
	 */
	public static final String $ret_trd_cur_upri_dec_place = "ret_trd_cur_upri_dec_place";
	/**
	 * Unit price (Return) 単価（返品）.<p>
	 *
	 */
	public static final String $ret_trd_cur_upri = "ret_trd_cur_upri";
	/**
	 * Amount (Return) 金額（返品）.<p>
	 *
	 */
	public static final String $ret_trd_cur_amt = "ret_trd_cur_amt";
	/**
	 * Set tax (Return) 税指定（返品）.<p>
	 *
	 */
	public static final String $ret_tax_fix_flg = "ret_tax_fix_flg";
	/**
	 * Tax cd. (Return) 税ＣＤ（返品）.<p>
	 *
	 */
	public static final String $ret_tax_cd = "ret_tax_cd";
	/**
	 * Tax name (Return) 税名（返品）.<p>
	 *
	 */
	public static final String $ret_tax_nm = "ret_tax_nm";
	/**
	 * Tax type (Return) 税区分（返品）.<p>
	 *
	 */
	public static final String $ret_tax_typ = "ret_tax_typ";
	/**
	 * Tax rate (Return) 税率（返品）.<p>
	 *
	 */
	public static final String $ret_tax_rate = "ret_tax_rate";
	/**
	 * Tax inclusive (Return) 内税（返品）.<p>
	 *
	 */
	public static final String $ret_inc_tax_flg = "ret_inc_tax_flg";
	/**
	 * Tax amount (Return) 税額（返品）.<p>
	 *
	 */
	public static final String $ret_trd_cur_tax_amt = "ret_trd_cur_tax_amt";
	/**
	 * Tax included amount (Return) 税込金額（返品）.<p>
	 *
	 */
	public static final String $ret_trd_cur_inc_tax_amt = "ret_trd_cur_inc_tax_amt";
	/**
	 * Set exchange rate (Return) 為替レート指定（返品）.<p>
	 *
	 */
	public static final String $ret_xrate_inpt_flg = "ret_xrate_inpt_flg";
	/**
	 * Exchange rate (Return) 為替レート（返品）.<p>
	 *
	 */
	public static final String $ret_xrate = "ret_xrate";
	/**
	 * Amount (Return) (Base currency) 基準通貨金額（返品）.<p>
	 *
	 */
	public static final String $ret_base_cur_amt = "ret_base_cur_amt";
	/**
	 * Tax amount (Return) (Base currency) 基準通貨税額（返品）.<p>
	 *
	 */
	public static final String $ret_base_cur_tax_amt = "ret_base_cur_tax_amt";
	/**
	 * Set tax exchange rate (Return) 納税為替レート指定（返品）.<p>
	 *
	 */
	public static final String $ret_ptax_xrate_inpt_flg = "ret_ptax_xrate_inpt_flg";
	/**
	 * Taxpaying exchange rate (Return) 納税為替レート（返品）.<p>
	 *
	 */
	public static final String $ret_ptax_xrate = "ret_ptax_xrate";
	/**
	 * Amount (Return) (Tax currency) 納税通貨金額（返品）.<p>
	 *
	 */
	public static final String $ret_ptax_amt = "ret_ptax_amt";
	/**
	 * Withholding tax rate (Return) 源泉税率（返品）.<p>
	 *
	 */
	public static final String $ret_wtax_rate = "ret_wtax_rate";
	/**
	 * Withholding tax (Return) 源泉税額（返品）.<p>
	 *
	 */
	public static final String $ret_wtax_amt = "ret_wtax_amt";
	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public static final String $base_dlv_slip_no = "base_dlv_slip_no";
	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public static final String $base_prov_act_no = "base_prov_act_no";
	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public static final String $base_ac_dt = "base_ac_dt";
	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public static final String $rqst_cnt_rmrks = "rqst_cnt_rmrks";
	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public static final String $ship_cnt_rmrks = "ship_cnt_rmrks";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
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
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public static final String $xfr_src_typ = "xfr_src_typ";
	/**
	 * Movement/transport source type name 移動・移送元区分名.<p>
	 *
	 */
	public static final String $xfr_src_typ_nm = "xfr_src_typ_nm";
	/**
	 * Source movement/transport No. 移動・移送元ＮＯ.<p>
	 *
	 */
	public static final String $xfr_src_no = "xfr_src_no";
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public static final String $xfr_schd_no = "xfr_schd_no";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public static final String $inpt_schd_no = "inpt_schd_no";
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
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
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
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public static final String $vld_dt_fr = "vld_dt_fr";
	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public static final String $vld_dt_to = "vld_dt_to";
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
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta prov_upri_cng_flg_META = createCommonMeta($prov_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_none_flg_META = createCommonMeta($lot_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta cont_fctr_unit_nm_META = createCommonMeta($cont_fctr_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_qty_META = createCommonMeta($cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta act_cont_qty_META = createCommonMeta($act_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta std_cont_qty_META = createCommonMeta($std_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_loc_nm_META = createCommonMeta($gi_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gi_str_ln_tgt_flg_META = createCommonMeta($gi_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_str_ln_cd_META = createCommonMeta($gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gi_str_ln_nm_META = createCommonMeta($gi_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta gi_str_ln_cd_none_flg_META = createCommonMeta($gi_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_lg_grp_cd_META = createCommonMeta($gi_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta gi_lg_grp_nm_META = createCommonMeta($gi_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta gi_wg_cd_META = createCommonMeta($gi_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gi_wg_nm_META = createCommonMeta($gi_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta gi_site_cd_META = createCommonMeta($gi_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta gi_site_nm_META = createCommonMeta($gi_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta gr_loc_cd_META = createCommonMeta($gr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gr_loc_nm_META = createCommonMeta($gr_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gr_str_ln_tgt_flg_META = createCommonMeta($gr_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_str_ln_cd_META = createCommonMeta($gr_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gr_str_ln_nm_META = createCommonMeta($gr_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta gr_str_ln_cd_none_flg_META = createCommonMeta($gr_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_lg_grp_cd_META = createCommonMeta($gr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta gr_lg_grp_nm_META = createCommonMeta($gr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta gr_wg_cd_META = createCommonMeta($gr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gr_wg_nm_META = createCommonMeta($gr_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta gr_site_cd_META = createCommonMeta($gr_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta gr_site_nm_META = createCommonMeta($gr_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta gi_sppl_cd_META = createCommonMeta($gi_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gi_sppl_nm_META = createCommonMeta($gi_sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta gi_cur_cd_META = createCommonMeta($gi_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta gi_subcon_flg_META = createCommonMeta($gi_subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_onr_prsppl_flg_META = createCommonMeta($gi_onr_prsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_prov_upri_cng_flg_META = createCommonMeta($gi_prov_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_prov_amt_rnd_typ_META = createCommonMeta($gi_prov_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta gi_prov_tax_rnd_typ_META = createCommonMeta($gi_prov_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta gi_stk_arrv_bp_cd_META = createCommonMeta($gi_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gi_stk_arrv_bp_nm_META = createCommonMeta($gi_stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta gr_sppl_cd_META = createCommonMeta($gr_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gr_cur_cd_META = createCommonMeta($gr_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta gr_subcon_flg_META = createCommonMeta($gr_subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_onr_prsppl_flg_META = createCommonMeta($gr_onr_prsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_prov_rcv_typ_META = createCommonMeta($gr_prov_rcv_typ, mcframe.commonMA.meta.MA_META.PROV_RCV_TYP);
	public static final MCMeta gr_prov_basis_typ_META = createCommonMeta($gr_prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta gr_prov_upri_cng_flg_META = createCommonMeta($gr_prov_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_prov_amt_rnd_typ_META = createCommonMeta($gr_prov_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta gr_prov_tax_rnd_typ_META = createCommonMeta($gr_prov_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta rcpt_dt_META = createCommonMeta($rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gi_rqst_tm_META = createCommonMeta($gi_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta gi_rqst_dt_META = createCommonMeta($gi_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gi_rqst_hm_META = createCommonMeta($gi_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta gr_rqst_tm_META = createCommonMeta($gr_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta gr_rqst_dt_META = createCommonMeta($gr_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gr_rqst_hm_META = createCommonMeta($gr_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta iv_trd_flg_META = createCommonMeta($iv_trd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_usr_cd_META = createCommonMeta($rqst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rqst_usr_nm_META = createCommonMeta($rqst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rqst_dpt_cd_META = createCommonMeta($rqst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_dpt_nm_META = createCommonMeta($rqst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta rqst_mod_flg_META = createCommonMeta($rqst_mod_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_can_flg_META = createCommonMeta($rqst_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ship_term_nm_META = createCommonMeta($ship_term_nm, mcframe.commonMA.meta.MA_META.SHIP_TERM_NM);
	public static final MCMeta ship_inst_typ_META = createCommonMeta($ship_inst_typ, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP);
	public static final MCMeta ship_inst_typ_nm_META = createCommonMeta($ship_inst_typ_nm, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP_NM);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta rsn_nm_META = createCommonMeta($rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta acxfr_gi_flg_META = createCommonMeta($acxfr_gi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ship_block_flg_META = createCommonMeta($ship_block_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_to_id_typ_META = createCommonMeta($ship_to_id_typ, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP);
	public static final MCMeta ship_to_id_typ_nm_META = createCommonMeta($ship_to_id_typ_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP_NM);
	public static final MCMeta ship_to_id_cd_META = createCommonMeta($ship_to_id_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta ship_to_id_nm_META = createCommonMeta($ship_to_id_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_NM);
	public static final MCMeta ship_to_zip_cd_META = createCommonMeta($ship_to_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta ship_to_addr1_META = createCommonMeta($ship_to_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta ship_to_addr2_META = createCommonMeta($ship_to_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta ship_to_addr3_META = createCommonMeta($ship_to_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta ship_to_addr4_META = createCommonMeta($ship_to_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta ship_to_cntct_dpt_META = createCommonMeta($ship_to_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta ship_to_cntct_psn_META = createCommonMeta($ship_to_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta ship_to_tel_META = createCommonMeta($ship_to_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ship_to_fax_META = createCommonMeta($ship_to_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ship_to_sundry_flg_META = createCommonMeta($ship_to_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta via_dlv_typ_nm_META = createCommonMeta($via_dlv_typ_nm, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP_NM);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_typ_nm_META = createCommonMeta($prov_typ_nm, mcframe.commonMA.meta.MA_META.PROV_TYP_NM);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta prov_basis_typ_nm_META = createCommonMeta($prov_basis_typ_nm, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_upri_dec_place_META = createCommonMeta($trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_fix_flg_META = createCommonMeta($tax_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_typ_META = createCommonMeta($tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_inc_tax_amt_META = createCommonMeta($trd_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prov_xrate_cd_META = createCommonMeta($prov_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_inpt_flg_META = createCommonMeta($xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_amt_dec_place_META = createCommonMeta($base_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_cur_nm_META = createCommonMeta($ptax_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta ptax_cur_amt_dec_place_META = createCommonMeta($ptax_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_xrate_inpt_flg_META = createCommonMeta($ptax_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ptax_xrate_META = createCommonMeta($ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_amt_META = createCommonMeta($ptax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_META = createCommonMeta($wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_prov_typ_META = createCommonMeta($ret_prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta ret_prov_typ_nm_META = createCommonMeta($ret_prov_typ_nm, mcframe.commonMA.meta.MA_META.PROV_TYP_NM);
	public static final MCMeta ret_prov_basis_typ_META = createCommonMeta($ret_prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta ret_prov_basis_typ_nm_META = createCommonMeta($ret_prov_basis_typ_nm, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP_NM);
	public static final MCMeta ret_trd_cur_cd_META = createCommonMeta($ret_trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ret_trd_cur_nm_META = createCommonMeta($ret_trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta ret_trd_cur_amt_dec_place_META = createCommonMeta($ret_trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ret_trd_cur_upri_dec_place_META = createCommonMeta($ret_trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ret_trd_cur_upri_META = createCommonMeta($ret_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_trd_cur_amt_META = createCommonMeta($ret_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_tax_fix_flg_META = createCommonMeta($ret_tax_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ret_tax_cd_META = createCommonMeta($ret_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta ret_tax_nm_META = createCommonMeta($ret_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta ret_tax_typ_META = createCommonMeta($ret_tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta ret_tax_rate_META = createCommonMeta($ret_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta ret_inc_tax_flg_META = createCommonMeta($ret_inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ret_trd_cur_tax_amt_META = createCommonMeta($ret_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_trd_cur_inc_tax_amt_META = createCommonMeta($ret_trd_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_xrate_inpt_flg_META = createCommonMeta($ret_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ret_xrate_META = createCommonMeta($ret_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_base_cur_amt_META = createCommonMeta($ret_base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_base_cur_tax_amt_META = createCommonMeta($ret_base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_ptax_xrate_inpt_flg_META = createCommonMeta($ret_ptax_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ret_ptax_xrate_META = createCommonMeta($ret_ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_ptax_amt_META = createCommonMeta($ret_ptax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_wtax_rate_META = createCommonMeta($ret_wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta ret_wtax_amt_META = createCommonMeta($ret_wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_dlv_slip_no_META = createCommonMeta($base_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta base_prov_act_no_META = createCommonMeta($base_prov_act_no, mcframe.commonMA.meta.MA_META.PROV_ACT_NO);
	public static final MCMeta base_ac_dt_META = createCommonMeta($base_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_cnt_rmrks_META = createCommonMeta($rqst_cnt_rmrks, mcframe.commonMS.meta.MS_META.RQST_CNT_RMRKS);
	public static final MCMeta ship_cnt_rmrks_META = createCommonMeta($ship_cnt_rmrks, mcframe.commonMS.meta.MS_META.SHIP_CNT_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.XFR_SCHD_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.XFR_SCHD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.XFR_SCHD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.XFR_SCHD_SUB_CHAR3);
	public static final MCMeta xfr_src_typ_META = createCommonMeta($xfr_src_typ, mcframe.commonMS.meta.MS_META.XFR_SRC_TYP);
	public static final MCMeta xfr_src_typ_nm_META = createCommonMeta($xfr_src_typ_nm, mcframe.commonMS.meta.MS_META.XFR_SRC_TYP_NM);
	public static final MCMeta xfr_src_no_META = createCommonMeta($xfr_src_no, mcframe.commonMA.meta.MA_META.XFR_SRC_NO);
	public static final MCMeta xfr_schd_no_META = createCommonMeta($xfr_schd_no, mcframe.commonMA.meta.MA_META.XFR_SCHD_NO);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta inpt_schd_no_META = createCommonMeta($inpt_schd_no, mcframe.commonMA.meta.MA_META.INPT_SCHD_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta not_lot_mix_flg_META = createCommonMeta($not_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sublot_mix_flg_META = createCommonMeta($not_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vld_dt_fr_META = createCommonMeta($vld_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_to_META = createCommonMeta($vld_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
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
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Chk01_RsltR> constMetas = new ConstMetaList<Chk01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			data_crud_typ_META,
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			asset_mng_typ_META,
			prov_upri_cng_flg_META,
			alloc_flg_META,
			lot_none_flg_META,
			lot_no_META,
			sublot_no_META,
			ver_flg_META,
			ver_no_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_dec_place_META,
			trd_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_qty_META,
			cont_fctr_flg_META,
			cont_fctr_unit_cd_META,
			cont_fctr_unit_nm_META,
			cont_fctr_dec_place_META,
			cont_fctr_rnd_typ_META,
			cont_qty_META,
			act_cont_fctr_META,
			act_cont_qty_META,
			std_cont_fctr_META,
			std_cont_qty_META,
			gi_loc_cd_META,
			gi_loc_nm_META,
			gi_str_ln_tgt_flg_META,
			gi_str_ln_cd_META,
			gi_str_ln_nm_META,
			gi_str_ln_cd_none_flg_META,
			gi_lg_grp_cd_META,
			gi_lg_grp_nm_META,
			gi_wg_cd_META,
			gi_wg_nm_META,
			gi_site_cd_META,
			gi_site_nm_META,
			gr_loc_cd_META,
			gr_loc_nm_META,
			gr_str_ln_tgt_flg_META,
			gr_str_ln_cd_META,
			gr_str_ln_nm_META,
			gr_str_ln_cd_none_flg_META,
			gr_lg_grp_cd_META,
			gr_lg_grp_nm_META,
			gr_wg_cd_META,
			gr_wg_nm_META,
			gr_site_cd_META,
			gr_site_nm_META,
			quality_typ_META,
			quality_typ_nm_META,
			gd_cd_META,
			gd_nm_META,
			sno1_META,
			sno1_null_flg_META,
			sno2_META,
			sno2_null_flg_META,
			sno3_META,
			sno3_null_flg_META,
			sno4_META,
			sno4_null_flg_META,
			wrk_no_META,
			wrk_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			gi_sppl_cd_META,
			gi_sppl_nm_META,
			gi_cur_cd_META,
			gi_subcon_flg_META,
			gi_onr_prsppl_flg_META,
			gi_prov_upri_cng_flg_META,
			gi_prov_amt_rnd_typ_META,
			gi_prov_tax_rnd_typ_META,
			gi_stk_arrv_bp_cd_META,
			gi_stk_arrv_bp_nm_META,
			gr_sppl_cd_META,
			gr_cur_cd_META,
			gr_subcon_flg_META,
			gr_onr_prsppl_flg_META,
			gr_prov_rcv_typ_META,
			gr_prov_basis_typ_META,
			gr_prov_upri_cng_flg_META,
			gr_prov_amt_rnd_typ_META,
			gr_prov_tax_rnd_typ_META,
			rcpt_dt_META,
			gi_rqst_tm_META,
			gi_rqst_dt_META,
			gi_rqst_hm_META,
			gr_rqst_tm_META,
			gr_rqst_dt_META,
			gr_rqst_hm_META,
			iv_trd_flg_META,
			rqst_usr_cd_META,
			rqst_usr_nm_META,
			rqst_dpt_cd_META,
			rqst_dpt_nm_META,
			rqst_mod_flg_META,
			rqst_can_flg_META,
			ship_term_cd_META,
			ship_term_nm_META,
			ship_inst_typ_META,
			ship_inst_typ_nm_META,
			rsn_cd_META,
			rsn_nm_META,
			acxfr_gi_flg_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			ship_block_flg_META,
			ship_to_id_typ_META,
			ship_to_id_typ_nm_META,
			ship_to_id_cd_META,
			ship_to_id_nm_META,
			ship_to_zip_cd_META,
			ship_to_addr1_META,
			ship_to_addr2_META,
			ship_to_addr3_META,
			ship_to_addr4_META,
			ship_to_cntct_dpt_META,
			ship_to_cntct_psn_META,
			ship_to_tel_META,
			ship_to_fax_META,
			ship_to_sundry_flg_META,
			via_dlv_typ_META,
			via_dlv_typ_nm_META,
			prov_typ_META,
			prov_typ_nm_META,
			prov_basis_typ_META,
			prov_basis_typ_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_cur_amt_dec_place_META,
			trd_cur_upri_dec_place_META,
			trd_cur_upri_META,
			trd_cur_amt_META,
			tax_fix_flg_META,
			tax_cd_META,
			tax_nm_META,
			tax_typ_META,
			tax_rate_META,
			inc_tax_flg_META,
			trd_cur_tax_amt_META,
			trd_cur_inc_tax_amt_META,
			prov_xrate_cd_META,
			xrate_inpt_flg_META,
			xrate_META,
			base_cur_cd_META,
			base_cur_nm_META,
			base_cur_amt_dec_place_META,
			base_cur_amt_META,
			base_cur_tax_amt_META,
			ptax_cur_cd_META,
			ptax_cur_nm_META,
			ptax_cur_amt_dec_place_META,
			ptax_xrate_inpt_flg_META,
			ptax_xrate_META,
			ptax_amt_META,
			wtax_rate_META,
			wtax_amt_META,
			ret_prov_typ_META,
			ret_prov_typ_nm_META,
			ret_prov_basis_typ_META,
			ret_prov_basis_typ_nm_META,
			ret_trd_cur_cd_META,
			ret_trd_cur_nm_META,
			ret_trd_cur_amt_dec_place_META,
			ret_trd_cur_upri_dec_place_META,
			ret_trd_cur_upri_META,
			ret_trd_cur_amt_META,
			ret_tax_fix_flg_META,
			ret_tax_cd_META,
			ret_tax_nm_META,
			ret_tax_typ_META,
			ret_tax_rate_META,
			ret_inc_tax_flg_META,
			ret_trd_cur_tax_amt_META,
			ret_trd_cur_inc_tax_amt_META,
			ret_xrate_inpt_flg_META,
			ret_xrate_META,
			ret_base_cur_amt_META,
			ret_base_cur_tax_amt_META,
			ret_ptax_xrate_inpt_flg_META,
			ret_ptax_xrate_META,
			ret_ptax_amt_META,
			ret_wtax_rate_META,
			ret_wtax_amt_META,
			base_dlv_slip_no_META,
			base_prov_act_no_META,
			base_ac_dt_META,
			rqst_cnt_rmrks_META,
			ship_cnt_rmrks_META,
			trd_d_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			xfr_src_typ_META,
			xfr_src_typ_nm_META,
			xfr_src_no_META,
			xfr_schd_no_META,
			itm_ord_no_META,
			mfg_inst_no_META,
			oper_inst_no_META,
			inpt_schd_no_META,
			slo_no_META,
			slo_d_no_META,
			io_schd_pr_no_META,
			not_lot_mix_flg_META,
			not_sublot_mix_flg_META,
			vld_dt_fr_META,
			vld_dt_to_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			rtn_sts_typ_META,
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
			upd_cntr_META
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
				{$xfr_schd_no, "E"}	// xfr_schd_no
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$trd_cd, "E"},	// trd_cd
				{$itm_cd, "E"},	// itm_cd
				{$trd_unit_cd, "E"},	// trd_unit_cd
				{$trd_unit_qty, "E"},	// trd_unit_qty
				{$gr_loc_cd, "E"},	// gr_loc_cd
				{$rcpt_dt, "E"}	// rcpt_dt
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$trd_unit_qty, "positive"},	// trd_unit_qty
				{$tax_rate, "positive"},	// tax_rate
				{$ptax_xrate, "positive"},	// ptax_xrate
				{$wtax_rate, "positive"},	// wtax_rate
				{$ret_xrate, "positive"},	// ret_xrate
				{$ret_ptax_xrate, "positive"},	// ret_ptax_xrate
				{$ret_wtax_rate, "positive"}	// ret_wtax_rate
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$trd_cur_upri, "0:"},	// trd_cur_upri
				{$ret_trd_cur_upri, "0:"}	// ret_trd_cur_upri
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$gi_rqst_tm, "rqst_tm:BF"},	// gi_rqst_tm
				{$gr_rqst_tm, "rqst_tm:AF"}	// gr_rqst_tm
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
				{$ship_to_zip_cd, "ZIP"},	// ship_to_zip_cd
				{$ship_to_tel, "TEL"},	// ship_to_tel
				{$ship_to_fax, "TEL"}	// ship_to_fax
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
				{$xfr_schd_no, "KEY"}	// xfr_schd_no
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
				{$gi_loc_cd, "gi_lg_grp"},	// gi_loc_cd
				{$gi_lg_grp_cd, "gi_lg_grp"},	// gi_lg_grp_cd
				{$gi_rqst_tm, "rqst_tm"},	// gi_rqst_tm
				{$gr_rqst_tm, "rqst_tm"}	// gr_rqst_tm
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$trd_cd, "MA.MAUAL0010.Trd"},	// trd_cd
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$trd_unit_cd, "MA.MAUAL0010.ItmUnit"},	// trd_unit_cd
				{$gi_loc_cd, "MA.MAUAL0010.Loc"},	// gi_loc_cd
				{$gi_str_ln_cd, "MA.MAUAL0010.StrLn"},	// gi_str_ln_cd
				{$gi_lg_grp_cd, "MA.MAUAL0010.LgGrpForLoc"},	// gi_lg_grp_cd
				{$gi_wg_cd, "MA.MAUAL0010.Wg"},	// gi_wg_cd
				{$gr_loc_cd, "MA.MAUAL0010.Loc"},	// gr_loc_cd
				{$gr_str_ln_cd, "MA.MAUAL0010.StrLn"},	// gr_str_ln_cd
				{$gd_cd, "MA.MAUAL0010.StkGd"},	// gd_cd
				{$stk_bp_cd, "MS.MSUAL0060.StkBp"},	// stk_bp_cd
				{$gi_sppl_cd, "MA.MAUAL0010.Bp"},	// gi_sppl_cd
				{$gi_stk_arrv_bp_cd, "MA.MAUAL0010.Bp"},	// gi_stk_arrv_bp_cd
				{$gr_sppl_cd, "MA.MAUAL0010.Bp"},	// gr_sppl_cd
				{$rqst_usr_cd, "MA.MAUAL0010.Usr"},	// rqst_usr_cd
				{$rqst_dpt_cd, "MA.MAUAL0010.Dpt"},	// rqst_dpt_cd
				{$ship_term_cd, "MA.MAUAL0010.ShipTerm"},	// ship_term_cd
				{$rsn_cd, "MA.MAUAL0010.XfrBizRsn"},	// rsn_cd
				{$bd_dpt_cd, "MA.MAUAL0010.Dpt"},	// bd_dpt_cd
				{$trd_cur_cd, "MA.MAUAL0010.Cur"},	// trd_cur_cd
				{$tax_cd, "MA.MAUAL0010.Tax"},	// tax_cd
				{$ptax_cur_cd, "MA.MAUAL0010.Cur"},	// ptax_cur_cd
				{$ret_trd_cur_cd, "MA.MAUAL0010.Cur"},	// ret_trd_cur_cd
				{$ret_tax_cd, "MA.MAUAL0010.Tax"}	// ret_tax_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$trd_cd, "trd_nm;trd_ptn_typ"},	// trd_cd
				{$itm_sub3, "itm_nm;base_unit_cd;base_unit_nm;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm;base_unit_dec_place;base_unit_rnd_typ;lot_mng_typ;sublot_mng_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;asset_mng_typ;ver_flg;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_unit_nm;cont_fctr_rnd_typ;cont_fctr_dec_place;prov_upri_cng_flg"},	// itm_sub3
				{$trd_unit_cd, "trd_unit_nm;trd_unit_conv_base_qty;trd_unit_conv_qty;trd_unit_dec_place"},	// trd_unit_cd
				{$gi_loc_cd, "gi_loc_nm;gi_lg_grp_cd;gi_lg_grp_nm;gi_wg_cd;gi_wg_nm;gi_site_cd;gi_site_nm;gi_str_ln_tgt_flg;gi_sppl_cd"},	// gi_loc_cd
				{$gi_str_ln_cd, "gi_str_ln_nm"},	// gi_str_ln_cd
				{$gi_lg_grp_cd, "gi_lg_grp_nm;"},	// gi_lg_grp_cd
				{$gi_wg_cd, "gr_wg_nm"},	// gi_wg_cd
				{$gr_loc_cd, "gr_loc_nm;gr_lg_grp_cd;gr_lg_grp_nm;gr_wg_cd;gr_wg_nm;gr_site_cd;gr_site_nm;gr_str_ln_tgt_flg;gr_sppl_cd"},	// gr_loc_cd
				{$gr_str_ln_cd, "gr_str_ln_nm"},	// gr_str_ln_cd
				{$gd_cd, "gd_nm"},	// gd_cd
				{$stk_bp_cd, "stk_bp_nm"},	// stk_bp_cd
				{$gi_sppl_cd, "gi_sppl_nm;gi_cur_cd;gi_subcon_flg;gi_onr_prsppl_flg;gi_prov_upri_cng_flg;gi_prov_amt_rnd_typ;gi_prov_tax_rnd_typ"},	// gi_sppl_cd
				{$gi_stk_arrv_bp_cd, "gi_stk_arrv_bp_nm"},	// gi_stk_arrv_bp_cd
				{$gr_sppl_cd, "gr_cur_cd;gr_subcon_flg;gr_onr_prsppl_flg;gr_prov_rcv_typ;gr_prov_basis_typ;gr_prov_rcv_typ;gr_prov_upri_cng_flg;gr_prov_amt_rnd_typ;gr_prov_tax_rnd_typ"},	// gr_sppl_cd
				{$rqst_usr_cd, "rqst_usr_nm"},	// rqst_usr_cd
				{$rqst_dpt_cd, "rqst_dpt_nm"},	// rqst_dpt_cd
				{$ship_term_cd, "ship_term_nm"},	// ship_term_cd
				{$rsn_cd, "rsn_nm;acxfr_gi_flg"},	// rsn_cd
				{$bd_dpt_cd, "bd_dpt_nm"},	// bd_dpt_cd
				{$trd_cur_cd, "trd_cur_nm;trd_cur_amt_dec_place;trd_cur_upri_dec_place"},	// trd_cur_cd
				{$tax_cd, "tax_nm;tax_typ;tax_rate;inc_tax_flg"},	// tax_cd
				{$ptax_cur_cd, "ptax_cur_nm;ptax_cur_amt_dec_place"},	// ptax_cur_cd
				{$ret_trd_cur_cd, "ret_trd_cur_nm;ret_trd_cur_amt_dec_place;ret_trd_cur_upri_dec_place"},	// ret_trd_cur_cd
				{$ret_tax_cd, "ret_tax_nm;ret_tax_typ;ret_tax_rate;ret_inc_tax_flg"}	// ret_tax_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_nm;unit_cd;unit_nm;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm;dec_place;rnd_typ;lot_mng_typ;sublot_mng_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;asset_mng_typ;ver_flg;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_unit_nm;cont_fctr_rnd_typ;cont_fctr_dec_place;prov_upri_cng_flg"},	// itm_sub3
				{$trd_unit_cd, "unit_nm;conv_base_qty;conv_qty;dec_place"},	// trd_unit_cd
				{$gi_loc_cd, "loc_nm;lg_grp_cd;lg_grp_nm;wg_cd;wg_nm;site_cd;site_nm;str_ln_tgt_flg;sppl_cd"},	// gi_loc_cd
				{$gi_str_ln_cd, "str_ln_nm"},	// gi_str_ln_cd
				{$gi_lg_grp_cd, "lg_grp_nm;"},	// gi_lg_grp_cd
				{$gi_wg_cd, "wg_nm"},	// gi_wg_cd
				{$gr_loc_cd, "loc_nm;lg_grp_cd;lg_grp_nm;wg_cd;wg_nm;site_cd;site_nm;str_ln_tgt_flg;sppl_cd"},	// gr_loc_cd
				{$gr_str_ln_cd, "str_ln_nm"},	// gr_str_ln_cd
				{$gi_sppl_cd, "bp_nm;cur_cd;subcon_flg;onr_prsppl_flg;prov_upri_cng_flg;prov_amt_rnd_typ;prov_tax_rnd_typ"},	// gi_sppl_cd
				{$gi_stk_arrv_bp_cd, "bp_nm"},	// gi_stk_arrv_bp_cd
				{$gr_sppl_cd, "cur_cd;subcon_flg;onr_prsppl_flg;prov_rcv_typ;prov_basis_typ;prov_rcv_typ;prov_upri_cng_flg;prov_amt_rnd_typ;prov_tax_rnd_typ"},	// gr_sppl_cd
				{$rqst_usr_cd, "usr_nm"},	// rqst_usr_cd
				{$rqst_dpt_cd, "dpt_nm"},	// rqst_dpt_cd
				{$rsn_cd, "biz_rsn_nm;acxfr_gi_flg"},	// rsn_cd
				{$bd_dpt_cd, "dpt_nm"},	// bd_dpt_cd
				{$trd_cur_cd, "cur_nm;amt_dec_place;upri_dec_place"},	// trd_cur_cd
				{$ptax_cur_cd, "cur_nm;amt_dec_place"},	// ptax_cur_cd
				{$ret_trd_cur_cd, "cur_nm;amt_dec_place;upri_dec_place"},	// ret_trd_cur_cd
				{$ret_tax_cd, "tax_nm;tax_typ;tax_rate;inc_tax_flg"}	// ret_tax_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_sub3, "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1;itm_sub2"},	// itm_sub3
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$gi_str_ln_cd, "gi_loc_cd;true"},	// gi_str_ln_cd
				{$gr_str_ln_cd, "gr_loc_cd;true"},	// gr_str_ln_cd
				{$stk_bp_cd, "stk_id_typ"},	// stk_bp_cd
				{$gi_stk_arrv_bp_cd, "true"},	// gi_stk_arrv_bp_cd
				{$rqst_dpt_cd, "rcpt_dt;rqst_usr_cd"},	// rqst_dpt_cd
				{$bd_dpt_cd, "rcpt_dt"},	// bd_dpt_cd
				{$tax_cd, "true"},	// tax_cd
				{$ret_tax_cd, "true"}	// ret_tax_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_sub3
				{$gi_str_ln_cd, "loc_cd;mode_nullval_flg"},	// gi_str_ln_cd
				{$gr_str_ln_cd, "loc_cd;mode_nullval_flg"},	// gr_str_ln_cd
				{$gi_stk_arrv_bp_cd, "mode_nullval_flg"},	// gi_stk_arrv_bp_cd
				{$rqst_dpt_cd, "dt;usr_cd"},	// rqst_dpt_cd
				{$bd_dpt_cd, "dt"},	// bd_dpt_cd
				{$tax_cd, "prov_flg"},	// tax_cd
				{$ret_tax_cd, "prov_flg"}	// ret_tax_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$quality_typ, "MAC_QUALITY_TYP"},	// quality_typ
				{$stk_id_typ, "MSC_STK_ID_TYP"},	// stk_id_typ
				{$ship_inst_typ, "MAC_SHIP_INST_TYP"},	// ship_inst_typ
				{$ship_to_id_typ, "MSC_SHIP_TO_ID_TYP"},	// ship_to_id_typ
				{$via_dlv_typ, "MAC_VIA_DLV_TYP"},	// via_dlv_typ
				{$prov_typ, "MAC_PROV_TYP"},	// prov_typ
				{$prov_basis_typ, "MAC_PROV_BASIS_TYP"},	// prov_basis_typ
				{$ret_prov_typ, "MAC_PROV_TYP"},	// ret_prov_typ
				{$ret_prov_basis_typ, "MAC_PROV_BASIS_TYP"},	// ret_prov_basis_typ
				{$xfr_src_typ, "MSC_XFR_SRC_TYP"},	// xfr_src_typ
				{$itm_typ, "MAC_ITM_TYP"}	// itm_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$gi_str_ln_cd, "E"},	// gi_str_ln_cd
				{$gr_str_ln_cd, "E"},	// gr_str_ln_cd
				{$sno1, "E"},	// sno1
				{$sno2, "E"},	// sno2
				{$sno3, "E"},	// sno3
				{$sno4, "E"}	// sno4
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
	protected Chk01_RsltR_MC_A(ConstMetaList<? extends Chk01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR clone() {
		return (Chk01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR createInstance() {
		return (Chk01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR getValues(String... names) {
		return (Chk01_RsltR) super.getValues(names);
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
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 2, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 2, $data_crud_typ, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 3, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 3, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 4, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 4, $trd_nm, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 5, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 5, $trd_ptn_typ, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 6, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 6, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 7, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 7, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 8, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 8, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 9, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 9, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 10, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 10, $itm_nm, value);
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
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 12, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 12, $sublot_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 13, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 13, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 14, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 14, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 15, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 15, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 16, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 16, $sno4_mng_typ, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 17, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 17, $asset_mng_typ, value);
	}


	/**
	 * Allow supply unit price change 支給単価変更許可.<p>
	 *
	 */
	public boolean prov_upri_cng_flg() {
		return getConstBoolean(offset + 18, $prov_upri_cng_flg);
	}

	/**
	 * Allow supply unit price change 支給単価変更許可.<p>
	 *
	 */
	public void prov_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 18, $prov_upri_cng_flg, value);
	}


	/**
	 * Allocation 引当.<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 19, $alloc_flg);
	}

	/**
	 * Allocation 引当.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 19, $alloc_flg, value);
	}


	/**
	 * Without lot ロット指定無.<p>
	 *
	 */
	public boolean lot_none_flg() {
		return getConstBoolean(offset + 20, $lot_none_flg);
	}

	/**
	 * Without lot ロット指定無.<p>
	 *
	 */
	public void lot_none_flg(boolean value) {
		setConstBoolean(offset + 20, $lot_none_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 21, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 21, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 22, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 22, $sublot_no, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 23, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 23, $ver_flg, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 24, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 24, $ver_no, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 25, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 25, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 26, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 26, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 27, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 27, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 27, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 27, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 27, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 27, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 28, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 28, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 28, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 28, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 28, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 28, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 29, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 29, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 29, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 29, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 29, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 29, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction qty. 取引数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 30, $trd_unit_qty);
	}

	/**
	 * Transaction qty. 取引数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 30, $trd_unit_qty, value);
	}

	/**
	 * Transaction qty. 取引数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 30, $trd_unit_qty, value);
	}

	/**
	 * Transaction qty. 取引数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 30, $trd_unit_qty, value);
	}

	/**
	 * Transaction qty. 取引数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 30, $trd_unit_qty, value);
	}

	/**
	 * Transaction qty. 取引数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 30, $trd_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 31, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 31, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 32, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 32, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 33, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 33, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 33, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 33, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 33, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 33, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 34, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 34, $base_unit_rnd_typ, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 35, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 35, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 35, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 35, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 35, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 35, $base_unit_qty, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 36, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 36, $cont_fctr_flg, value);
	}


	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 37, $cont_fctr_unit_cd);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 37, $cont_fctr_unit_cd, value);
	}


	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public String cont_fctr_unit_nm() {
		return getConstString(offset + 38, $cont_fctr_unit_nm);
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public void cont_fctr_unit_nm(String value) {
		setConstString(offset + 38, $cont_fctr_unit_nm, value);
	}


	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 39, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 39, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 39, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 39, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 39, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 39, $cont_fctr_dec_place, value);
	}


	/**
	 * Active ingredient unit rounding type 有効成分単位端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 40, $cont_fctr_rnd_typ);
	}

	/**
	 * Active ingredient unit rounding type 有効成分単位端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 40, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Input active ingredient 投入有効成分.<p>
	 *
	 */
	public MCNumber cont_qty() {
		return getConstNumber(offset + 41, $cont_qty);
	}

	/**
	 * Input active ingredient 投入有効成分.<p>
	 *
	 */
	public void cont_qty(MCNumber value) {
		setConstNumber(offset + 41, $cont_qty, value);
	}

	/**
	 * Input active ingredient 投入有効成分.<p>
	 *
	 */
	public void cont_qty(int value) {
		setConstNumber(offset + 41, $cont_qty, value);
	}

	/**
	 * Input active ingredient 投入有効成分.<p>
	 *
	 */
	public void cont_qty(long value) {
		setConstNumber(offset + 41, $cont_qty, value);
	}

	/**
	 * Input active ingredient 投入有効成分.<p>
	 *
	 */
	public void cont_qty(float value) {
		setConstNumber(offset + 41, $cont_qty, value);
	}

	/**
	 * Input active ingredient 投入有効成分.<p>
	 *
	 */
	public void cont_qty(double value) {
		setConstNumber(offset + 41, $cont_qty, value);
	}


	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 42, $act_cont_fctr);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 42, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 42, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 42, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 42, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 42, $act_cont_fctr, value);
	}


	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public MCNumber act_cont_qty() {
		return getConstNumber(offset + 43, $act_cont_qty);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(MCNumber value) {
		setConstNumber(offset + 43, $act_cont_qty, value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(int value) {
		setConstNumber(offset + 43, $act_cont_qty, value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(long value) {
		setConstNumber(offset + 43, $act_cont_qty, value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(float value) {
		setConstNumber(offset + 43, $act_cont_qty, value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(double value) {
		setConstNumber(offset + 43, $act_cont_qty, value);
	}


	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 44, $std_cont_fctr);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 44, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 44, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 44, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 44, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 44, $std_cont_fctr, value);
	}


	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public MCNumber std_cont_qty() {
		return getConstNumber(offset + 45, $std_cont_qty);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(MCNumber value) {
		setConstNumber(offset + 45, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(int value) {
		setConstNumber(offset + 45, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(long value) {
		setConstNumber(offset + 45, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(float value) {
		setConstNumber(offset + 45, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(double value) {
		setConstNumber(offset + 45, $std_cont_qty, value);
	}


	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 46, $gi_loc_cd);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 46, $gi_loc_cd, value);
	}


	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public String gi_loc_nm() {
		return getConstString(offset + 47, $gi_loc_nm);
	}

	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public void gi_loc_nm(String value) {
		setConstString(offset + 47, $gi_loc_nm, value);
	}


	/**
	 * For GI rack/line 出庫棚・ライン対象.<p>
	 *
	 */
	public boolean gi_str_ln_tgt_flg() {
		return getConstBoolean(offset + 48, $gi_str_ln_tgt_flg);
	}

	/**
	 * For GI rack/line 出庫棚・ライン対象.<p>
	 *
	 */
	public void gi_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 48, $gi_str_ln_tgt_flg, value);
	}


	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return getConstString(offset + 49, $gi_str_ln_cd);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		setConstString(offset + 49, $gi_str_ln_cd, value);
	}


	/**
	 * GI rack/line name 出庫棚・ライン名.<p>
	 *
	 */
	public String gi_str_ln_nm() {
		return getConstString(offset + 50, $gi_str_ln_nm);
	}

	/**
	 * GI rack/line name 出庫棚・ライン名.<p>
	 *
	 */
	public void gi_str_ln_nm(String value) {
		setConstString(offset + 50, $gi_str_ln_nm, value);
	}


	/**
	 * Without GI rack/line 出庫棚・ライン無.<p>
	 *
	 */
	public boolean gi_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 51, $gi_str_ln_cd_none_flg);
	}

	/**
	 * Without GI rack/line 出庫棚・ライン無.<p>
	 *
	 */
	public void gi_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 51, $gi_str_ln_cd_none_flg, value);
	}


	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public String gi_lg_grp_cd() {
		return getConstString(offset + 52, $gi_lg_grp_cd);
	}

	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public void gi_lg_grp_cd(String value) {
		setConstString(offset + 52, $gi_lg_grp_cd, value);
	}


	/**
	 * GI distribution group name 出庫物流グループ名.<p>
	 *
	 */
	public String gi_lg_grp_nm() {
		return getConstString(offset + 53, $gi_lg_grp_nm);
	}

	/**
	 * GI distribution group name 出庫物流グループ名.<p>
	 *
	 */
	public void gi_lg_grp_nm(String value) {
		setConstString(offset + 53, $gi_lg_grp_nm, value);
	}


	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gi_wg_cd() {
		return getConstString(offset + 54, $gi_wg_cd);
	}

	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gi_wg_cd(String value) {
		setConstString(offset + 54, $gi_wg_cd, value);
	}


	/**
	 * GI WG name 出庫ワーキンググループ名.<p>
	 *
	 */
	public String gi_wg_nm() {
		return getConstString(offset + 55, $gi_wg_nm);
	}

	/**
	 * GI WG name 出庫ワーキンググループ名.<p>
	 *
	 */
	public void gi_wg_nm(String value) {
		setConstString(offset + 55, $gi_wg_nm, value);
	}


	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String gi_site_cd() {
		return getConstString(offset + 56, $gi_site_cd);
	}

	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void gi_site_cd(String value) {
		setConstString(offset + 56, $gi_site_cd, value);
	}


	/**
	 * GI factory/distribution warehouse name 出庫工場・物流倉庫名.<p>
	 *
	 */
	public String gi_site_nm() {
		return getConstString(offset + 57, $gi_site_nm);
	}

	/**
	 * GI factory/distribution warehouse name 出庫工場・物流倉庫名.<p>
	 *
	 */
	public void gi_site_nm(String value) {
		setConstString(offset + 57, $gi_site_nm, value);
	}


	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return getConstString(offset + 58, $gr_loc_cd);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		setConstString(offset + 58, $gr_loc_cd, value);
	}


	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public String gr_loc_nm() {
		return getConstString(offset + 59, $gr_loc_nm);
	}

	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public void gr_loc_nm(String value) {
		setConstString(offset + 59, $gr_loc_nm, value);
	}


	/**
	 * For GR rack/line 入庫棚・ライン対象.<p>
	 *
	 */
	public boolean gr_str_ln_tgt_flg() {
		return getConstBoolean(offset + 60, $gr_str_ln_tgt_flg);
	}

	/**
	 * For GR rack/line 入庫棚・ライン対象.<p>
	 *
	 */
	public void gr_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 60, $gr_str_ln_tgt_flg, value);
	}


	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return getConstString(offset + 61, $gr_str_ln_cd);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		setConstString(offset + 61, $gr_str_ln_cd, value);
	}


	/**
	 * GR rack/line name 入庫棚・ライン名.<p>
	 *
	 */
	public String gr_str_ln_nm() {
		return getConstString(offset + 62, $gr_str_ln_nm);
	}

	/**
	 * GR rack/line name 入庫棚・ライン名.<p>
	 *
	 */
	public void gr_str_ln_nm(String value) {
		setConstString(offset + 62, $gr_str_ln_nm, value);
	}


	/**
	 * Without GR rack/line 入庫棚・ライン無.<p>
	 *
	 */
	public boolean gr_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 63, $gr_str_ln_cd_none_flg);
	}

	/**
	 * Without GR rack/line 入庫棚・ライン無.<p>
	 *
	 */
	public void gr_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 63, $gr_str_ln_cd_none_flg, value);
	}


	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public String gr_lg_grp_cd() {
		return getConstString(offset + 64, $gr_lg_grp_cd);
	}

	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public void gr_lg_grp_cd(String value) {
		setConstString(offset + 64, $gr_lg_grp_cd, value);
	}


	/**
	 * GR distribution group name 入庫物流グループ名.<p>
	 *
	 */
	public String gr_lg_grp_nm() {
		return getConstString(offset + 65, $gr_lg_grp_nm);
	}

	/**
	 * GR distribution group name 入庫物流グループ名.<p>
	 *
	 */
	public void gr_lg_grp_nm(String value) {
		setConstString(offset + 65, $gr_lg_grp_nm, value);
	}


	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gr_wg_cd() {
		return getConstString(offset + 66, $gr_wg_cd);
	}

	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gr_wg_cd(String value) {
		setConstString(offset + 66, $gr_wg_cd, value);
	}


	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public String gr_wg_nm() {
		return getConstString(offset + 67, $gr_wg_nm);
	}

	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public void gr_wg_nm(String value) {
		setConstString(offset + 67, $gr_wg_nm, value);
	}


	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String gr_site_cd() {
		return getConstString(offset + 68, $gr_site_cd);
	}

	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void gr_site_cd(String value) {
		setConstString(offset + 68, $gr_site_cd, value);
	}


	/**
	 * GR factory/distribution warehouse name 入庫工場・物流倉庫名.<p>
	 *
	 */
	public String gr_site_nm() {
		return getConstString(offset + 69, $gr_site_nm);
	}

	/**
	 * GR factory/distribution warehouse name 入庫工場・物流倉庫名.<p>
	 *
	 */
	public void gr_site_nm(String value) {
		setConstString(offset + 69, $gr_site_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 70, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 70, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 71, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 71, $quality_typ_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 72, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 72, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 73, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 73, $gd_nm, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 74, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 74, $sno1, value);
	}


	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 75, $sno1_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 75, $sno1_null_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 76, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 76, $sno2, value);
	}


	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 77, $sno2_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 77, $sno2_null_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 78, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 78, $sno3, value);
	}


	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 79, $sno3_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 79, $sno3_null_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 80, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 80, $sno4, value);
	}


	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 81, $sno4_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 81, $sno4_null_flg, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 82, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 82, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 83, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 83, $wrk_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 84, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 84, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 85, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 85, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 86, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 86, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 87, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 87, $stk_bp_nm, value);
	}


	/**
	 * GI supplier cd. 出庫発注先ＣＤ.<p>
	 *
	 */
	public String gi_sppl_cd() {
		return getConstString(offset + 88, $gi_sppl_cd);
	}

	/**
	 * GI supplier cd. 出庫発注先ＣＤ.<p>
	 *
	 */
	public void gi_sppl_cd(String value) {
		setConstString(offset + 88, $gi_sppl_cd, value);
	}


	/**
	 * GI supplier name 出庫発注先名.<p>
	 *
	 */
	public String gi_sppl_nm() {
		return getConstString(offset + 89, $gi_sppl_nm);
	}

	/**
	 * GI supplier name 出庫発注先名.<p>
	 *
	 */
	public void gi_sppl_nm(String value) {
		setConstString(offset + 89, $gi_sppl_nm, value);
	}


	/**
	 * GI currency cd. 出庫通貨ＣＤ.<p>
	 *
	 */
	public String gi_cur_cd() {
		return getConstString(offset + 90, $gi_cur_cd);
	}

	/**
	 * GI currency cd. 出庫通貨ＣＤ.<p>
	 *
	 */
	public void gi_cur_cd(String value) {
		setConstString(offset + 90, $gi_cur_cd, value);
	}


	/**
	 * GI subcontract 出庫下請け.<p>
	 *
	 */
	public boolean gi_subcon_flg() {
		return getConstBoolean(offset + 91, $gi_subcon_flg);
	}

	/**
	 * GI subcontract 出庫下請け.<p>
	 *
	 */
	public void gi_subcon_flg(boolean value) {
		setConstBoolean(offset + 91, $gi_subcon_flg, value);
	}


	/**
	 * GI chargeable supplier 出庫有償支給先.<p>
	 *
	 */
	public boolean gi_onr_prsppl_flg() {
		return getConstBoolean(offset + 92, $gi_onr_prsppl_flg);
	}

	/**
	 * GI chargeable supplier 出庫有償支給先.<p>
	 *
	 */
	public void gi_onr_prsppl_flg(boolean value) {
		setConstBoolean(offset + 92, $gi_onr_prsppl_flg, value);
	}


	/**
	 * Allow GI supply unit change 出庫支給単価変更許可.<p>
	 *
	 */
	public boolean gi_prov_upri_cng_flg() {
		return getConstBoolean(offset + 93, $gi_prov_upri_cng_flg);
	}

	/**
	 * Allow GI supply unit change 出庫支給単価変更許可.<p>
	 *
	 */
	public void gi_prov_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 93, $gi_prov_upri_cng_flg, value);
	}


	/**
	 * GI supply amount rounding type 出庫支給金額端数処理区分.<p>
	 *
	 */
	public String gi_prov_amt_rnd_typ() {
		return getConstString(offset + 94, $gi_prov_amt_rnd_typ);
	}

	/**
	 * GI supply amount rounding type 出庫支給金額端数処理区分.<p>
	 *
	 */
	public void gi_prov_amt_rnd_typ(String value) {
		setConstString(offset + 94, $gi_prov_amt_rnd_typ, value);
	}


	/**
	 * GI supply tax rounding type 出庫支給税端数処理区分.<p>
	 *
	 */
	public String gi_prov_tax_rnd_typ() {
		return getConstString(offset + 95, $gi_prov_tax_rnd_typ);
	}

	/**
	 * GI supply tax rounding type 出庫支給税端数処理区分.<p>
	 *
	 */
	public void gi_prov_tax_rnd_typ(String value) {
		setConstString(offset + 95, $gi_prov_tax_rnd_typ, value);
	}


	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gi_stk_arrv_bp_cd() {
		return getConstString(offset + 96, $gi_stk_arrv_bp_cd);
	}

	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gi_stk_arrv_bp_cd(String value) {
		setConstString(offset + 96, $gi_stk_arrv_bp_cd, value);
	}


	/**
	 * GI inventory arriving point name 出庫在庫着荷先名.<p>
	 *
	 */
	public String gi_stk_arrv_bp_nm() {
		return getConstString(offset + 97, $gi_stk_arrv_bp_nm);
	}

	/**
	 * GI inventory arriving point name 出庫在庫着荷先名.<p>
	 *
	 */
	public void gi_stk_arrv_bp_nm(String value) {
		setConstString(offset + 97, $gi_stk_arrv_bp_nm, value);
	}


	/**
	 * GR supplier cd. 入庫発注先ＣＤ.<p>
	 *
	 */
	public String gr_sppl_cd() {
		return getConstString(offset + 98, $gr_sppl_cd);
	}

	/**
	 * GR supplier cd. 入庫発注先ＣＤ.<p>
	 *
	 */
	public void gr_sppl_cd(String value) {
		setConstString(offset + 98, $gr_sppl_cd, value);
	}


	/**
	 * GR currency cd. 入庫通貨ＣＤ.<p>
	 *
	 */
	public String gr_cur_cd() {
		return getConstString(offset + 99, $gr_cur_cd);
	}

	/**
	 * GR currency cd. 入庫通貨ＣＤ.<p>
	 *
	 */
	public void gr_cur_cd(String value) {
		setConstString(offset + 99, $gr_cur_cd, value);
	}


	/**
	 * GR subcontract 入庫下請け.<p>
	 *
	 */
	public boolean gr_subcon_flg() {
		return getConstBoolean(offset + 100, $gr_subcon_flg);
	}

	/**
	 * GR subcontract 入庫下請け.<p>
	 *
	 */
	public void gr_subcon_flg(boolean value) {
		setConstBoolean(offset + 100, $gr_subcon_flg, value);
	}


	/**
	 * GR chargeable supplier 入庫有償支給先.<p>
	 *
	 */
	public boolean gr_onr_prsppl_flg() {
		return getConstBoolean(offset + 101, $gr_onr_prsppl_flg);
	}

	/**
	 * GR chargeable supplier 入庫有償支給先.<p>
	 *
	 */
	public void gr_onr_prsppl_flg(boolean value) {
		setConstBoolean(offset + 101, $gr_onr_prsppl_flg, value);
	}


	/**
	 * GR supply in-transit management type 入庫支給積送管理区分.<p>
	 *
	 */
	public String gr_prov_rcv_typ() {
		return getConstString(offset + 102, $gr_prov_rcv_typ);
	}

	/**
	 * GR supply in-transit management type 入庫支給積送管理区分.<p>
	 *
	 */
	public void gr_prov_rcv_typ(String value) {
		setConstString(offset + 102, $gr_prov_rcv_typ, value);
	}


	/**
	 * GR supply recording type 入庫支給計上区分.<p>
	 *
	 */
	public String gr_prov_basis_typ() {
		return getConstString(offset + 103, $gr_prov_basis_typ);
	}

	/**
	 * GR supply recording type 入庫支給計上区分.<p>
	 *
	 */
	public void gr_prov_basis_typ(String value) {
		setConstString(offset + 103, $gr_prov_basis_typ, value);
	}


	/**
	 * Allow GR supply unit price change 入庫支給単価変更許可.<p>
	 *
	 */
	public boolean gr_prov_upri_cng_flg() {
		return getConstBoolean(offset + 104, $gr_prov_upri_cng_flg);
	}

	/**
	 * Allow GR supply unit price change 入庫支給単価変更許可.<p>
	 *
	 */
	public void gr_prov_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 104, $gr_prov_upri_cng_flg, value);
	}


	/**
	 * Rounding type (GR supply amount) 入庫支給金額端数処理区分.<p>
	 *
	 */
	public String gr_prov_amt_rnd_typ() {
		return getConstString(offset + 105, $gr_prov_amt_rnd_typ);
	}

	/**
	 * Rounding type (GR supply amount) 入庫支給金額端数処理区分.<p>
	 *
	 */
	public void gr_prov_amt_rnd_typ(String value) {
		setConstString(offset + 105, $gr_prov_amt_rnd_typ, value);
	}


	/**
	 * Rounding type (GR supply tax) 入庫支給税端数処理区分.<p>
	 *
	 */
	public String gr_prov_tax_rnd_typ() {
		return getConstString(offset + 106, $gr_prov_tax_rnd_typ);
	}

	/**
	 * Rounding type (GR supply tax) 入庫支給税端数処理区分.<p>
	 *
	 */
	public void gr_prov_tax_rnd_typ(String value) {
		setConstString(offset + 106, $gr_prov_tax_rnd_typ, value);
	}


	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public MCDate rcpt_dt() {
		return getConstDate(offset + 107, $rcpt_dt);
	}

	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public void rcpt_dt(MCDate value) {
		setConstDate(offset + 107, $rcpt_dt, value);
	}


	/**
	 * Desired GI date and time 出庫希望日時.<p>
	 *
	 */
	public MCDate gi_rqst_tm() {
		return getConstDate(offset + 108, $gi_rqst_tm);
	}

	/**
	 * Desired GI date and time 出庫希望日時.<p>
	 *
	 */
	public void gi_rqst_tm(MCDate value) {
		setConstDate(offset + 108, $gi_rqst_tm, value);
	}


	/**
	 * Desired GI date 出庫希望日.<p>
	 *
	 */
	public MCDate gi_rqst_dt() {
		return getConstDate(offset + 109, $gi_rqst_dt);
	}

	/**
	 * Desired GI date 出庫希望日.<p>
	 *
	 */
	public void gi_rqst_dt(MCDate value) {
		setConstDate(offset + 109, $gi_rqst_dt, value);
	}


	/**
	 * Desired GI time 出庫希望時刻.<p>
	 *
	 */
	public MCDate gi_rqst_hm() {
		return getConstDate(offset + 110, $gi_rqst_hm);
	}

	/**
	 * Desired GI time 出庫希望時刻.<p>
	 *
	 */
	public void gi_rqst_hm(MCDate value) {
		setConstDate(offset + 110, $gi_rqst_hm, value);
	}


	/**
	 * Desired GR date and time 入庫希望日時.<p>
	 *
	 */
	public MCDate gr_rqst_tm() {
		return getConstDate(offset + 111, $gr_rqst_tm);
	}

	/**
	 * Desired GR date and time 入庫希望日時.<p>
	 *
	 */
	public void gr_rqst_tm(MCDate value) {
		setConstDate(offset + 111, $gr_rqst_tm, value);
	}


	/**
	 * Desired GR date 入庫希望日.<p>
	 *
	 */
	public MCDate gr_rqst_dt() {
		return getConstDate(offset + 112, $gr_rqst_dt);
	}

	/**
	 * Desired GR date 入庫希望日.<p>
	 *
	 */
	public void gr_rqst_dt(MCDate value) {
		setConstDate(offset + 112, $gr_rqst_dt, value);
	}


	/**
	 * Desired GR time 入庫希望時刻.<p>
	 *
	 */
	public MCDate gr_rqst_hm() {
		return getConstDate(offset + 113, $gr_rqst_hm);
	}

	/**
	 * Desired GR time 入庫希望時刻.<p>
	 *
	 */
	public void gr_rqst_hm(MCDate value) {
		setConstDate(offset + 113, $gr_rqst_hm, value);
	}


	/**
	 * Invoice transaction インボイス取引.<p>
	 *
	 */
	public boolean iv_trd_flg() {
		return getConstBoolean(offset + 114, $iv_trd_flg);
	}

	/**
	 * Invoice transaction インボイス取引.<p>
	 *
	 */
	public void iv_trd_flg(boolean value) {
		setConstBoolean(offset + 114, $iv_trd_flg, value);
	}


	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_usr_cd() {
		return getConstString(offset + 115, $rqst_usr_cd);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		setConstString(offset + 115, $rqst_usr_cd, value);
	}


	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public String rqst_usr_nm() {
		return getConstString(offset + 116, $rqst_usr_nm);
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public void rqst_usr_nm(String value) {
		setConstString(offset + 116, $rqst_usr_nm, value);
	}


	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return getConstString(offset + 117, $rqst_dpt_cd);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		setConstString(offset + 117, $rqst_dpt_cd, value);
	}


	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public String rqst_dpt_nm() {
		return getConstString(offset + 118, $rqst_dpt_nm);
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public void rqst_dpt_nm(String value) {
		setConstString(offset + 118, $rqst_dpt_nm, value);
	}


	/**
	 * Edited by request source 依頼元訂正.<p>
	 *
	 */
	public boolean rqst_mod_flg() {
		return getConstBoolean(offset + 119, $rqst_mod_flg);
	}

	/**
	 * Edited by request source 依頼元訂正.<p>
	 *
	 */
	public void rqst_mod_flg(boolean value) {
		setConstBoolean(offset + 119, $rqst_mod_flg, value);
	}


	/**
	 * Unpegged 紐切れ.<p>
	 *
	 */
	public boolean rqst_can_flg() {
		return getConstBoolean(offset + 120, $rqst_can_flg);
	}

	/**
	 * Unpegged 紐切れ.<p>
	 *
	 */
	public void rqst_can_flg(boolean value) {
		setConstBoolean(offset + 120, $rqst_can_flg, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 121, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 121, $ship_term_cd, value);
	}


	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public String ship_term_nm() {
		return getConstString(offset + 122, $ship_term_nm);
	}

	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public void ship_term_nm(String value) {
		setConstString(offset + 122, $ship_term_nm, value);
	}


	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public String ship_inst_typ() {
		return getConstString(offset + 123, $ship_inst_typ);
	}

	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public void ship_inst_typ(String value) {
		setConstString(offset + 123, $ship_inst_typ, value);
	}


	/**
	 * Shipping order type name 出荷指図区分名.<p>
	 *
	 */
	public String ship_inst_typ_nm() {
		return getConstString(offset + 124, $ship_inst_typ_nm);
	}

	/**
	 * Shipping order type name 出荷指図区分名.<p>
	 *
	 */
	public void ship_inst_typ_nm(String value) {
		setConstString(offset + 124, $ship_inst_typ_nm, value);
	}


	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 125, $rsn_cd);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 125, $rsn_cd, value);
	}


	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public String rsn_nm() {
		return getConstString(offset + 126, $rsn_nm);
	}

	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public void rsn_nm(String value) {
		setConstString(offset + 126, $rsn_nm, value);
	}


	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public boolean acxfr_gi_flg() {
		return getConstBoolean(offset + 127, $acxfr_gi_flg);
	}

	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public void acxfr_gi_flg(boolean value) {
		setConstBoolean(offset + 127, $acxfr_gi_flg, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 128, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 128, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 129, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 129, $bd_dpt_nm, value);
	}


	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public boolean ship_block_flg() {
		return getConstBoolean(offset + 130, $ship_block_flg);
	}

	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public void ship_block_flg(boolean value) {
		setConstBoolean(offset + 130, $ship_block_flg, value);
	}


	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public String ship_to_id_typ() {
		return getConstString(offset + 131, $ship_to_id_typ);
	}

	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public void ship_to_id_typ(String value) {
		setConstString(offset + 131, $ship_to_id_typ, value);
	}


	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public String ship_to_id_typ_nm() {
		return getConstString(offset + 132, $ship_to_id_typ_nm);
	}

	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public void ship_to_id_typ_nm(String value) {
		setConstString(offset + 132, $ship_to_id_typ_nm, value);
	}


	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public String ship_to_id_cd() {
		return getConstString(offset + 133, $ship_to_id_cd);
	}

	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		setConstString(offset + 133, $ship_to_id_cd, value);
	}


	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public String ship_to_id_nm() {
		return getConstString(offset + 134, $ship_to_id_nm);
	}

	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public void ship_to_id_nm(String value) {
		setConstString(offset + 134, $ship_to_id_nm, value);
	}


	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public String ship_to_zip_cd() {
		return getConstString(offset + 135, $ship_to_zip_cd);
	}

	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public void ship_to_zip_cd(String value) {
		setConstString(offset + 135, $ship_to_zip_cd, value);
	}


	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public String ship_to_addr1() {
		return getConstString(offset + 136, $ship_to_addr1);
	}

	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public void ship_to_addr1(String value) {
		setConstString(offset + 136, $ship_to_addr1, value);
	}


	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public String ship_to_addr2() {
		return getConstString(offset + 137, $ship_to_addr2);
	}

	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public void ship_to_addr2(String value) {
		setConstString(offset + 137, $ship_to_addr2, value);
	}


	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public String ship_to_addr3() {
		return getConstString(offset + 138, $ship_to_addr3);
	}

	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public void ship_to_addr3(String value) {
		setConstString(offset + 138, $ship_to_addr3, value);
	}


	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public String ship_to_addr4() {
		return getConstString(offset + 139, $ship_to_addr4);
	}

	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public void ship_to_addr4(String value) {
		setConstString(offset + 139, $ship_to_addr4, value);
	}


	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public String ship_to_cntct_dpt() {
		return getConstString(offset + 140, $ship_to_cntct_dpt);
	}

	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public void ship_to_cntct_dpt(String value) {
		setConstString(offset + 140, $ship_to_cntct_dpt, value);
	}


	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public String ship_to_cntct_psn() {
		return getConstString(offset + 141, $ship_to_cntct_psn);
	}

	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public void ship_to_cntct_psn(String value) {
		setConstString(offset + 141, $ship_to_cntct_psn, value);
	}


	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public String ship_to_tel() {
		return getConstString(offset + 142, $ship_to_tel);
	}

	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public void ship_to_tel(String value) {
		setConstString(offset + 142, $ship_to_tel, value);
	}


	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public String ship_to_fax() {
		return getConstString(offset + 143, $ship_to_fax);
	}

	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public void ship_to_fax(String value) {
		setConstString(offset + 143, $ship_to_fax, value);
	}


	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public boolean ship_to_sundry_flg() {
		return getConstBoolean(offset + 144, $ship_to_sundry_flg);
	}

	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public void ship_to_sundry_flg(boolean value) {
		setConstBoolean(offset + 144, $ship_to_sundry_flg, value);
	}


	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 145, $via_dlv_typ);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 145, $via_dlv_typ, value);
	}


	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public String via_dlv_typ_nm() {
		return getConstString(offset + 146, $via_dlv_typ_nm);
	}

	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public void via_dlv_typ_nm(String value) {
		setConstString(offset + 146, $via_dlv_typ_nm, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 147, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 147, $prov_typ, value);
	}


	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public String prov_typ_nm() {
		return getConstString(offset + 148, $prov_typ_nm);
	}

	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public void prov_typ_nm(String value) {
		setConstString(offset + 148, $prov_typ_nm, value);
	}


	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 149, $prov_basis_typ);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 149, $prov_basis_typ, value);
	}


	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public String prov_basis_typ_nm() {
		return getConstString(offset + 150, $prov_basis_typ_nm);
	}

	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public void prov_basis_typ_nm(String value) {
		setConstString(offset + 150, $prov_basis_typ_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 151, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 151, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 152, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 152, $trd_cur_nm, value);
	}


	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 153, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 153, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 153, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 153, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 153, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 153, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_upri_dec_place() {
		return getConstNumber(offset + 154, $trd_cur_upri_dec_place);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 154, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 154, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 154, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 154, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 154, $trd_cur_upri_dec_place, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 155, $trd_cur_upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 155, $trd_cur_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 155, $trd_cur_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 155, $trd_cur_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 155, $trd_cur_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 155, $trd_cur_upri, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 156, $trd_cur_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 156, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 156, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 156, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 156, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 156, $trd_cur_amt, value);
	}


	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public boolean tax_fix_flg() {
		return getConstBoolean(offset + 157, $tax_fix_flg);
	}

	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public void tax_fix_flg(boolean value) {
		setConstBoolean(offset + 157, $tax_fix_flg, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 158, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 158, $tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 159, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 159, $tax_nm, value);
	}


	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public String tax_typ() {
		return getConstString(offset + 160, $tax_typ);
	}

	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public void tax_typ(String value) {
		setConstString(offset + 160, $tax_typ, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 161, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 161, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 161, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 161, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 161, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 161, $tax_rate, value);
	}


	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 162, $inc_tax_flg);
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 162, $inc_tax_flg, value);
	}


	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 163, $trd_cur_tax_amt);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 163, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 163, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 163, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 163, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 163, $trd_cur_tax_amt, value);
	}


	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public MCNumber trd_cur_inc_tax_amt() {
		return getConstNumber(offset + 164, $trd_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 164, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 164, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 164, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 164, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 164, $trd_cur_inc_tax_amt, value);
	}


	/**
	 * Supply exchange rate cd. 支給為替レートＣＤ.<p>
	 *
	 */
	public String prov_xrate_cd() {
		return getConstString(offset + 165, $prov_xrate_cd);
	}

	/**
	 * Supply exchange rate cd. 支給為替レートＣＤ.<p>
	 *
	 */
	public void prov_xrate_cd(String value) {
		setConstString(offset + 165, $prov_xrate_cd, value);
	}


	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return getConstBoolean(offset + 166, $xrate_inpt_flg);
	}

	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 166, $xrate_inpt_flg, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 167, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 167, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 167, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 167, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 167, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 167, $xrate, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 168, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 168, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 169, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 169, $base_cur_nm, value);
	}


	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_amt_dec_place() {
		return getConstNumber(offset + 170, $base_cur_amt_dec_place);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 170, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(int value) {
		setConstNumber(offset + 170, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(long value) {
		setConstNumber(offset + 170, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(float value) {
		setConstNumber(offset + 170, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(double value) {
		setConstNumber(offset + 170, $base_cur_amt_dec_place, value);
	}


	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 171, $base_cur_amt);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 171, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 171, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 171, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 171, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 171, $base_cur_amt, value);
	}


	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 172, $base_cur_tax_amt);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 172, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 172, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 172, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 172, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 172, $base_cur_tax_amt, value);
	}


	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 173, $ptax_cur_cd);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 173, $ptax_cur_cd, value);
	}


	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public String ptax_cur_nm() {
		return getConstString(offset + 174, $ptax_cur_nm);
	}

	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public void ptax_cur_nm(String value) {
		setConstString(offset + 174, $ptax_cur_nm, value);
	}


	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber ptax_cur_amt_dec_place() {
		return getConstNumber(offset + 175, $ptax_cur_amt_dec_place);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 175, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(int value) {
		setConstNumber(offset + 175, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(long value) {
		setConstNumber(offset + 175, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(float value) {
		setConstNumber(offset + 175, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(double value) {
		setConstNumber(offset + 175, $ptax_cur_amt_dec_place, value);
	}


	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return getConstBoolean(offset + 176, $ptax_xrate_inpt_flg);
	}

	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 176, $ptax_xrate_inpt_flg, value);
	}


	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return getConstNumber(offset + 177, $ptax_xrate);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		setConstNumber(offset + 177, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		setConstNumber(offset + 177, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		setConstNumber(offset + 177, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		setConstNumber(offset + 177, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		setConstNumber(offset + 177, $ptax_xrate, value);
	}


	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCNumber ptax_amt() {
		return getConstNumber(offset + 178, $ptax_amt);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_amt(MCNumber value) {
		setConstNumber(offset + 178, $ptax_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_amt(int value) {
		setConstNumber(offset + 178, $ptax_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_amt(long value) {
		setConstNumber(offset + 178, $ptax_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_amt(float value) {
		setConstNumber(offset + 178, $ptax_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_amt(double value) {
		setConstNumber(offset + 178, $ptax_amt, value);
	}


	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 179, $wtax_rate);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 179, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 179, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 179, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 179, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 179, $wtax_rate, value);
	}


	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return getConstNumber(offset + 180, $wtax_amt);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		setConstNumber(offset + 180, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		setConstNumber(offset + 180, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		setConstNumber(offset + 180, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		setConstNumber(offset + 180, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		setConstNumber(offset + 180, $wtax_amt, value);
	}


	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public String ret_prov_typ() {
		return getConstString(offset + 181, $ret_prov_typ);
	}

	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public void ret_prov_typ(String value) {
		setConstString(offset + 181, $ret_prov_typ, value);
	}


	/**
	 * Supply type name (Return) 支給区分名（返品）.<p>
	 *
	 */
	public String ret_prov_typ_nm() {
		return getConstString(offset + 182, $ret_prov_typ_nm);
	}

	/**
	 * Supply type name (Return) 支給区分名（返品）.<p>
	 *
	 */
	public void ret_prov_typ_nm(String value) {
		setConstString(offset + 182, $ret_prov_typ_nm, value);
	}


	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public String ret_prov_basis_typ() {
		return getConstString(offset + 183, $ret_prov_basis_typ);
	}

	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public void ret_prov_basis_typ(String value) {
		setConstString(offset + 183, $ret_prov_basis_typ, value);
	}


	/**
	 * Supply recording type name (Return) 支給計上区分名（返品）.<p>
	 *
	 */
	public String ret_prov_basis_typ_nm() {
		return getConstString(offset + 184, $ret_prov_basis_typ_nm);
	}

	/**
	 * Supply recording type name (Return) 支給計上区分名（返品）.<p>
	 *
	 */
	public void ret_prov_basis_typ_nm(String value) {
		setConstString(offset + 184, $ret_prov_basis_typ_nm, value);
	}


	/**
	 * Currency cd. (Return) 通貨ＣＤ（返品）.<p>
	 *
	 */
	public String ret_trd_cur_cd() {
		return getConstString(offset + 185, $ret_trd_cur_cd);
	}

	/**
	 * Currency cd. (Return) 通貨ＣＤ（返品）.<p>
	 *
	 */
	public void ret_trd_cur_cd(String value) {
		setConstString(offset + 185, $ret_trd_cur_cd, value);
	}


	/**
	 * Currency name (Return) 通貨名（返品）.<p>
	 *
	 */
	public String ret_trd_cur_nm() {
		return getConstString(offset + 186, $ret_trd_cur_nm);
	}

	/**
	 * Currency name (Return) 通貨名（返品）.<p>
	 *
	 */
	public void ret_trd_cur_nm(String value) {
		setConstString(offset + 186, $ret_trd_cur_nm, value);
	}


	/**
	 * Transaction amount number of decimal places (Return) 取引金額小数部有効桁数（返品）.<p>
	 *
	 */
	public MCNumber ret_trd_cur_amt_dec_place() {
		return getConstNumber(offset + 187, $ret_trd_cur_amt_dec_place);
	}

	/**
	 * Transaction amount number of decimal places (Return) 取引金額小数部有効桁数（返品）.<p>
	 *
	 */
	public void ret_trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 187, $ret_trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places (Return) 取引金額小数部有効桁数（返品）.<p>
	 *
	 */
	public void ret_trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 187, $ret_trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places (Return) 取引金額小数部有効桁数（返品）.<p>
	 *
	 */
	public void ret_trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 187, $ret_trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places (Return) 取引金額小数部有効桁数（返品）.<p>
	 *
	 */
	public void ret_trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 187, $ret_trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places (Return) 取引金額小数部有効桁数（返品）.<p>
	 *
	 */
	public void ret_trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 187, $ret_trd_cur_amt_dec_place, value);
	}


	/**
	 * Transaction unit price number of decimal places (Return) 取引単価小数部有効桁数（返品）.<p>
	 *
	 */
	public MCNumber ret_trd_cur_upri_dec_place() {
		return getConstNumber(offset + 188, $ret_trd_cur_upri_dec_place);
	}

	/**
	 * Transaction unit price number of decimal places (Return) 取引単価小数部有効桁数（返品）.<p>
	 *
	 */
	public void ret_trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 188, $ret_trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places (Return) 取引単価小数部有効桁数（返品）.<p>
	 *
	 */
	public void ret_trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 188, $ret_trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places (Return) 取引単価小数部有効桁数（返品）.<p>
	 *
	 */
	public void ret_trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 188, $ret_trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places (Return) 取引単価小数部有効桁数（返品）.<p>
	 *
	 */
	public void ret_trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 188, $ret_trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places (Return) 取引単価小数部有効桁数（返品）.<p>
	 *
	 */
	public void ret_trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 188, $ret_trd_cur_upri_dec_place, value);
	}


	/**
	 * Unit price (Return) 単価（返品）.<p>
	 *
	 */
	public MCNumber ret_trd_cur_upri() {
		return getConstNumber(offset + 189, $ret_trd_cur_upri);
	}

	/**
	 * Unit price (Return) 単価（返品）.<p>
	 *
	 */
	public void ret_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 189, $ret_trd_cur_upri, value);
	}

	/**
	 * Unit price (Return) 単価（返品）.<p>
	 *
	 */
	public void ret_trd_cur_upri(int value) {
		setConstNumber(offset + 189, $ret_trd_cur_upri, value);
	}

	/**
	 * Unit price (Return) 単価（返品）.<p>
	 *
	 */
	public void ret_trd_cur_upri(long value) {
		setConstNumber(offset + 189, $ret_trd_cur_upri, value);
	}

	/**
	 * Unit price (Return) 単価（返品）.<p>
	 *
	 */
	public void ret_trd_cur_upri(float value) {
		setConstNumber(offset + 189, $ret_trd_cur_upri, value);
	}

	/**
	 * Unit price (Return) 単価（返品）.<p>
	 *
	 */
	public void ret_trd_cur_upri(double value) {
		setConstNumber(offset + 189, $ret_trd_cur_upri, value);
	}


	/**
	 * Amount (Return) 金額（返品）.<p>
	 *
	 */
	public MCNumber ret_trd_cur_amt() {
		return getConstNumber(offset + 190, $ret_trd_cur_amt);
	}

	/**
	 * Amount (Return) 金額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 190, $ret_trd_cur_amt, value);
	}

	/**
	 * Amount (Return) 金額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_amt(int value) {
		setConstNumber(offset + 190, $ret_trd_cur_amt, value);
	}

	/**
	 * Amount (Return) 金額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_amt(long value) {
		setConstNumber(offset + 190, $ret_trd_cur_amt, value);
	}

	/**
	 * Amount (Return) 金額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_amt(float value) {
		setConstNumber(offset + 190, $ret_trd_cur_amt, value);
	}

	/**
	 * Amount (Return) 金額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_amt(double value) {
		setConstNumber(offset + 190, $ret_trd_cur_amt, value);
	}


	/**
	 * Set tax (Return) 税指定（返品）.<p>
	 *
	 */
	public boolean ret_tax_fix_flg() {
		return getConstBoolean(offset + 191, $ret_tax_fix_flg);
	}

	/**
	 * Set tax (Return) 税指定（返品）.<p>
	 *
	 */
	public void ret_tax_fix_flg(boolean value) {
		setConstBoolean(offset + 191, $ret_tax_fix_flg, value);
	}


	/**
	 * Tax cd. (Return) 税ＣＤ（返品）.<p>
	 *
	 */
	public String ret_tax_cd() {
		return getConstString(offset + 192, $ret_tax_cd);
	}

	/**
	 * Tax cd. (Return) 税ＣＤ（返品）.<p>
	 *
	 */
	public void ret_tax_cd(String value) {
		setConstString(offset + 192, $ret_tax_cd, value);
	}


	/**
	 * Tax name (Return) 税名（返品）.<p>
	 *
	 */
	public String ret_tax_nm() {
		return getConstString(offset + 193, $ret_tax_nm);
	}

	/**
	 * Tax name (Return) 税名（返品）.<p>
	 *
	 */
	public void ret_tax_nm(String value) {
		setConstString(offset + 193, $ret_tax_nm, value);
	}


	/**
	 * Tax type (Return) 税区分（返品）.<p>
	 *
	 */
	public String ret_tax_typ() {
		return getConstString(offset + 194, $ret_tax_typ);
	}

	/**
	 * Tax type (Return) 税区分（返品）.<p>
	 *
	 */
	public void ret_tax_typ(String value) {
		setConstString(offset + 194, $ret_tax_typ, value);
	}


	/**
	 * Tax rate (Return) 税率（返品）.<p>
	 *
	 */
	public MCNumber ret_tax_rate() {
		return getConstNumber(offset + 195, $ret_tax_rate);
	}

	/**
	 * Tax rate (Return) 税率（返品）.<p>
	 *
	 */
	public void ret_tax_rate(MCNumber value) {
		setConstNumber(offset + 195, $ret_tax_rate, value);
	}

	/**
	 * Tax rate (Return) 税率（返品）.<p>
	 *
	 */
	public void ret_tax_rate(int value) {
		setConstNumber(offset + 195, $ret_tax_rate, value);
	}

	/**
	 * Tax rate (Return) 税率（返品）.<p>
	 *
	 */
	public void ret_tax_rate(long value) {
		setConstNumber(offset + 195, $ret_tax_rate, value);
	}

	/**
	 * Tax rate (Return) 税率（返品）.<p>
	 *
	 */
	public void ret_tax_rate(float value) {
		setConstNumber(offset + 195, $ret_tax_rate, value);
	}

	/**
	 * Tax rate (Return) 税率（返品）.<p>
	 *
	 */
	public void ret_tax_rate(double value) {
		setConstNumber(offset + 195, $ret_tax_rate, value);
	}


	/**
	 * Tax inclusive (Return) 内税（返品）.<p>
	 *
	 */
	public boolean ret_inc_tax_flg() {
		return getConstBoolean(offset + 196, $ret_inc_tax_flg);
	}

	/**
	 * Tax inclusive (Return) 内税（返品）.<p>
	 *
	 */
	public void ret_inc_tax_flg(boolean value) {
		setConstBoolean(offset + 196, $ret_inc_tax_flg, value);
	}


	/**
	 * Tax amount (Return) 税額（返品）.<p>
	 *
	 */
	public MCNumber ret_trd_cur_tax_amt() {
		return getConstNumber(offset + 197, $ret_trd_cur_tax_amt);
	}

	/**
	 * Tax amount (Return) 税額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 197, $ret_trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Return) 税額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 197, $ret_trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Return) 税額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 197, $ret_trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Return) 税額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 197, $ret_trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Return) 税額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 197, $ret_trd_cur_tax_amt, value);
	}


	/**
	 * Tax included amount (Return) 税込金額（返品）.<p>
	 *
	 */
	public MCNumber ret_trd_cur_inc_tax_amt() {
		return getConstNumber(offset + 198, $ret_trd_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Return) 税込金額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 198, $ret_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Return) 税込金額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 198, $ret_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Return) 税込金額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 198, $ret_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Return) 税込金額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 198, $ret_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Return) 税込金額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 198, $ret_trd_cur_inc_tax_amt, value);
	}


	/**
	 * Set exchange rate (Return) 為替レート指定（返品）.<p>
	 *
	 */
	public boolean ret_xrate_inpt_flg() {
		return getConstBoolean(offset + 199, $ret_xrate_inpt_flg);
	}

	/**
	 * Set exchange rate (Return) 為替レート指定（返品）.<p>
	 *
	 */
	public void ret_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 199, $ret_xrate_inpt_flg, value);
	}


	/**
	 * Exchange rate (Return) 為替レート（返品）.<p>
	 *
	 */
	public MCNumber ret_xrate() {
		return getConstNumber(offset + 200, $ret_xrate);
	}

	/**
	 * Exchange rate (Return) 為替レート（返品）.<p>
	 *
	 */
	public void ret_xrate(MCNumber value) {
		setConstNumber(offset + 200, $ret_xrate, value);
	}

	/**
	 * Exchange rate (Return) 為替レート（返品）.<p>
	 *
	 */
	public void ret_xrate(int value) {
		setConstNumber(offset + 200, $ret_xrate, value);
	}

	/**
	 * Exchange rate (Return) 為替レート（返品）.<p>
	 *
	 */
	public void ret_xrate(long value) {
		setConstNumber(offset + 200, $ret_xrate, value);
	}

	/**
	 * Exchange rate (Return) 為替レート（返品）.<p>
	 *
	 */
	public void ret_xrate(float value) {
		setConstNumber(offset + 200, $ret_xrate, value);
	}

	/**
	 * Exchange rate (Return) 為替レート（返品）.<p>
	 *
	 */
	public void ret_xrate(double value) {
		setConstNumber(offset + 200, $ret_xrate, value);
	}


	/**
	 * Amount (Return) (Base currency) 基準通貨金額（返品）.<p>
	 *
	 */
	public MCNumber ret_base_cur_amt() {
		return getConstNumber(offset + 201, $ret_base_cur_amt);
	}

	/**
	 * Amount (Return) (Base currency) 基準通貨金額（返品）.<p>
	 *
	 */
	public void ret_base_cur_amt(MCNumber value) {
		setConstNumber(offset + 201, $ret_base_cur_amt, value);
	}

	/**
	 * Amount (Return) (Base currency) 基準通貨金額（返品）.<p>
	 *
	 */
	public void ret_base_cur_amt(int value) {
		setConstNumber(offset + 201, $ret_base_cur_amt, value);
	}

	/**
	 * Amount (Return) (Base currency) 基準通貨金額（返品）.<p>
	 *
	 */
	public void ret_base_cur_amt(long value) {
		setConstNumber(offset + 201, $ret_base_cur_amt, value);
	}

	/**
	 * Amount (Return) (Base currency) 基準通貨金額（返品）.<p>
	 *
	 */
	public void ret_base_cur_amt(float value) {
		setConstNumber(offset + 201, $ret_base_cur_amt, value);
	}

	/**
	 * Amount (Return) (Base currency) 基準通貨金額（返品）.<p>
	 *
	 */
	public void ret_base_cur_amt(double value) {
		setConstNumber(offset + 201, $ret_base_cur_amt, value);
	}


	/**
	 * Tax amount (Return) (Base currency) 基準通貨税額（返品）.<p>
	 *
	 */
	public MCNumber ret_base_cur_tax_amt() {
		return getConstNumber(offset + 202, $ret_base_cur_tax_amt);
	}

	/**
	 * Tax amount (Return) (Base currency) 基準通貨税額（返品）.<p>
	 *
	 */
	public void ret_base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 202, $ret_base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Return) (Base currency) 基準通貨税額（返品）.<p>
	 *
	 */
	public void ret_base_cur_tax_amt(int value) {
		setConstNumber(offset + 202, $ret_base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Return) (Base currency) 基準通貨税額（返品）.<p>
	 *
	 */
	public void ret_base_cur_tax_amt(long value) {
		setConstNumber(offset + 202, $ret_base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Return) (Base currency) 基準通貨税額（返品）.<p>
	 *
	 */
	public void ret_base_cur_tax_amt(float value) {
		setConstNumber(offset + 202, $ret_base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Return) (Base currency) 基準通貨税額（返品）.<p>
	 *
	 */
	public void ret_base_cur_tax_amt(double value) {
		setConstNumber(offset + 202, $ret_base_cur_tax_amt, value);
	}


	/**
	 * Set tax exchange rate (Return) 納税為替レート指定（返品）.<p>
	 *
	 */
	public boolean ret_ptax_xrate_inpt_flg() {
		return getConstBoolean(offset + 203, $ret_ptax_xrate_inpt_flg);
	}

	/**
	 * Set tax exchange rate (Return) 納税為替レート指定（返品）.<p>
	 *
	 */
	public void ret_ptax_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 203, $ret_ptax_xrate_inpt_flg, value);
	}


	/**
	 * Taxpaying exchange rate (Return) 納税為替レート（返品）.<p>
	 *
	 */
	public MCNumber ret_ptax_xrate() {
		return getConstNumber(offset + 204, $ret_ptax_xrate);
	}

	/**
	 * Taxpaying exchange rate (Return) 納税為替レート（返品）.<p>
	 *
	 */
	public void ret_ptax_xrate(MCNumber value) {
		setConstNumber(offset + 204, $ret_ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate (Return) 納税為替レート（返品）.<p>
	 *
	 */
	public void ret_ptax_xrate(int value) {
		setConstNumber(offset + 204, $ret_ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate (Return) 納税為替レート（返品）.<p>
	 *
	 */
	public void ret_ptax_xrate(long value) {
		setConstNumber(offset + 204, $ret_ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate (Return) 納税為替レート（返品）.<p>
	 *
	 */
	public void ret_ptax_xrate(float value) {
		setConstNumber(offset + 204, $ret_ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate (Return) 納税為替レート（返品）.<p>
	 *
	 */
	public void ret_ptax_xrate(double value) {
		setConstNumber(offset + 204, $ret_ptax_xrate, value);
	}


	/**
	 * Amount (Return) (Tax currency) 納税通貨金額（返品）.<p>
	 *
	 */
	public MCNumber ret_ptax_amt() {
		return getConstNumber(offset + 205, $ret_ptax_amt);
	}

	/**
	 * Amount (Return) (Tax currency) 納税通貨金額（返品）.<p>
	 *
	 */
	public void ret_ptax_amt(MCNumber value) {
		setConstNumber(offset + 205, $ret_ptax_amt, value);
	}

	/**
	 * Amount (Return) (Tax currency) 納税通貨金額（返品）.<p>
	 *
	 */
	public void ret_ptax_amt(int value) {
		setConstNumber(offset + 205, $ret_ptax_amt, value);
	}

	/**
	 * Amount (Return) (Tax currency) 納税通貨金額（返品）.<p>
	 *
	 */
	public void ret_ptax_amt(long value) {
		setConstNumber(offset + 205, $ret_ptax_amt, value);
	}

	/**
	 * Amount (Return) (Tax currency) 納税通貨金額（返品）.<p>
	 *
	 */
	public void ret_ptax_amt(float value) {
		setConstNumber(offset + 205, $ret_ptax_amt, value);
	}

	/**
	 * Amount (Return) (Tax currency) 納税通貨金額（返品）.<p>
	 *
	 */
	public void ret_ptax_amt(double value) {
		setConstNumber(offset + 205, $ret_ptax_amt, value);
	}


	/**
	 * Withholding tax rate (Return) 源泉税率（返品）.<p>
	 *
	 */
	public MCNumber ret_wtax_rate() {
		return getConstNumber(offset + 206, $ret_wtax_rate);
	}

	/**
	 * Withholding tax rate (Return) 源泉税率（返品）.<p>
	 *
	 */
	public void ret_wtax_rate(MCNumber value) {
		setConstNumber(offset + 206, $ret_wtax_rate, value);
	}

	/**
	 * Withholding tax rate (Return) 源泉税率（返品）.<p>
	 *
	 */
	public void ret_wtax_rate(int value) {
		setConstNumber(offset + 206, $ret_wtax_rate, value);
	}

	/**
	 * Withholding tax rate (Return) 源泉税率（返品）.<p>
	 *
	 */
	public void ret_wtax_rate(long value) {
		setConstNumber(offset + 206, $ret_wtax_rate, value);
	}

	/**
	 * Withholding tax rate (Return) 源泉税率（返品）.<p>
	 *
	 */
	public void ret_wtax_rate(float value) {
		setConstNumber(offset + 206, $ret_wtax_rate, value);
	}

	/**
	 * Withholding tax rate (Return) 源泉税率（返品）.<p>
	 *
	 */
	public void ret_wtax_rate(double value) {
		setConstNumber(offset + 206, $ret_wtax_rate, value);
	}


	/**
	 * Withholding tax (Return) 源泉税額（返品）.<p>
	 *
	 */
	public MCNumber ret_wtax_amt() {
		return getConstNumber(offset + 207, $ret_wtax_amt);
	}

	/**
	 * Withholding tax (Return) 源泉税額（返品）.<p>
	 *
	 */
	public void ret_wtax_amt(MCNumber value) {
		setConstNumber(offset + 207, $ret_wtax_amt, value);
	}

	/**
	 * Withholding tax (Return) 源泉税額（返品）.<p>
	 *
	 */
	public void ret_wtax_amt(int value) {
		setConstNumber(offset + 207, $ret_wtax_amt, value);
	}

	/**
	 * Withholding tax (Return) 源泉税額（返品）.<p>
	 *
	 */
	public void ret_wtax_amt(long value) {
		setConstNumber(offset + 207, $ret_wtax_amt, value);
	}

	/**
	 * Withholding tax (Return) 源泉税額（返品）.<p>
	 *
	 */
	public void ret_wtax_amt(float value) {
		setConstNumber(offset + 207, $ret_wtax_amt, value);
	}

	/**
	 * Withholding tax (Return) 源泉税額（返品）.<p>
	 *
	 */
	public void ret_wtax_amt(double value) {
		setConstNumber(offset + 207, $ret_wtax_amt, value);
	}


	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public String base_dlv_slip_no() {
		return getConstString(offset + 208, $base_dlv_slip_no);
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public void base_dlv_slip_no(String value) {
		setConstString(offset + 208, $base_dlv_slip_no, value);
	}


	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public String base_prov_act_no() {
		return getConstString(offset + 209, $base_prov_act_no);
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public void base_prov_act_no(String value) {
		setConstString(offset + 209, $base_prov_act_no, value);
	}


	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return getConstDate(offset + 210, $base_ac_dt);
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		setConstDate(offset + 210, $base_ac_dt, value);
	}


	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public String rqst_cnt_rmrks() {
		return getConstString(offset + 211, $rqst_cnt_rmrks);
	}

	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public void rqst_cnt_rmrks(String value) {
		setConstString(offset + 211, $rqst_cnt_rmrks, value);
	}


	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public String ship_cnt_rmrks() {
		return getConstString(offset + 212, $ship_cnt_rmrks);
	}

	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public void ship_cnt_rmrks(String value) {
		setConstString(offset + 212, $ship_cnt_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 213, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 213, $trd_d_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 214, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 214, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 215, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 215, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 216, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 216, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 217, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 217, $sub_char3, value);
	}


	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public String xfr_src_typ() {
		return getConstString(offset + 218, $xfr_src_typ);
	}

	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public void xfr_src_typ(String value) {
		setConstString(offset + 218, $xfr_src_typ, value);
	}


	/**
	 * Movement/transport source type name 移動・移送元区分名.<p>
	 *
	 */
	public String xfr_src_typ_nm() {
		return getConstString(offset + 219, $xfr_src_typ_nm);
	}

	/**
	 * Movement/transport source type name 移動・移送元区分名.<p>
	 *
	 */
	public void xfr_src_typ_nm(String value) {
		setConstString(offset + 219, $xfr_src_typ_nm, value);
	}


	/**
	 * Source movement/transport No. 移動・移送元ＮＯ.<p>
	 *
	 */
	public String xfr_src_no() {
		return getConstString(offset + 220, $xfr_src_no);
	}

	/**
	 * Source movement/transport No. 移動・移送元ＮＯ.<p>
	 *
	 */
	public void xfr_src_no(String value) {
		setConstString(offset + 220, $xfr_src_no, value);
	}


	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public String xfr_schd_no() {
		return getConstString(offset + 221, $xfr_schd_no);
	}

	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public void xfr_schd_no(String value) {
		setConstString(offset + 221, $xfr_schd_no, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 222, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 222, $itm_ord_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 223, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 223, $mfg_inst_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 224, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 224, $oper_inst_no, value);
	}


	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public String inpt_schd_no() {
		return getConstString(offset + 225, $inpt_schd_no);
	}

	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		setConstString(offset + 225, $inpt_schd_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 226, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 226, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 227, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 227, $slo_d_no, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 228, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 228, $io_schd_pr_no, value);
	}


	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return getConstBoolean(offset + 229, $not_lot_mix_flg);
	}

	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 229, $not_lot_mix_flg, value);
	}


	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return getConstBoolean(offset + 230, $not_sublot_mix_flg);
	}

	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 230, $not_sublot_mix_flg, value);
	}


	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate vld_dt_fr() {
		return getConstDate(offset + 231, $vld_dt_fr);
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public void vld_dt_fr(MCDate value) {
		setConstDate(offset + 231, $vld_dt_fr, value);
	}


	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCDate vld_dt_to() {
		return getConstDate(offset + 232, $vld_dt_to);
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public void vld_dt_to(MCDate value) {
		setConstDate(offset + 232, $vld_dt_to, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 233, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 233, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 234, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 234, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 235, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 235, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 236, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 236, $itm_typ_d_nm, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 237, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 237, $rtn_sts_typ, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 238, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 238, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 239, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 239, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 240, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 240, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 241, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 241, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 242, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 242, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 243, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 243, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 244, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 244, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 245, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 245, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 246, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 246, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 247, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 247, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 248, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 248, $upd_srv_req_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 249, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 249, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 249, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 249, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 249, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 249, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
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
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			return gi_str_ln_nm();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_lg_grp_nm.equalsIgnoreCase(name)) {
			return gi_lg_grp_nm();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gi_wg_nm.equalsIgnoreCase(name)) {
			return gi_wg_nm();
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			return gi_site_cd();
		}
		if ($gi_site_nm.equalsIgnoreCase(name)) {
			return gi_site_nm();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			return gr_loc_nm();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			return gr_str_ln_nm();
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			return gr_lg_grp_cd();
		}
		if ($gr_lg_grp_nm.equalsIgnoreCase(name)) {
			return gr_lg_grp_nm();
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
		}
		if ($gr_wg_nm.equalsIgnoreCase(name)) {
			return gr_wg_nm();
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			return gr_site_cd();
		}
		if ($gr_site_nm.equalsIgnoreCase(name)) {
			return gr_site_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
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
		if ($gi_sppl_cd.equalsIgnoreCase(name)) {
			return gi_sppl_cd();
		}
		if ($gi_sppl_nm.equalsIgnoreCase(name)) {
			return gi_sppl_nm();
		}
		if ($gi_cur_cd.equalsIgnoreCase(name)) {
			return gi_cur_cd();
		}
		if ($gi_prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			return gi_prov_amt_rnd_typ();
		}
		if ($gi_prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			return gi_prov_tax_rnd_typ();
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gi_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_nm();
		}
		if ($gr_sppl_cd.equalsIgnoreCase(name)) {
			return gr_sppl_cd();
		}
		if ($gr_cur_cd.equalsIgnoreCase(name)) {
			return gr_cur_cd();
		}
		if ($gr_prov_rcv_typ.equalsIgnoreCase(name)) {
			return gr_prov_rcv_typ();
		}
		if ($gr_prov_basis_typ.equalsIgnoreCase(name)) {
			return gr_prov_basis_typ();
		}
		if ($gr_prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			return gr_prov_amt_rnd_typ();
		}
		if ($gr_prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			return gr_prov_tax_rnd_typ();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			return rqst_usr_nm();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_dpt_nm();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($ship_inst_typ_nm.equalsIgnoreCase(name)) {
			return ship_inst_typ_nm();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_to_id_typ_nm();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			return ship_to_zip_cd();
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			return ship_to_addr1();
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			return ship_to_addr2();
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			return ship_to_addr3();
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			return ship_to_addr4();
		}
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			return ship_to_cntct_dpt();
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			return ship_to_cntct_psn();
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			return ship_to_tel();
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			return ship_to_fax();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			return via_dlv_typ_nm();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			return prov_typ_nm();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			return prov_basis_typ_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
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
		if ($prov_xrate_cd.equalsIgnoreCase(name)) {
			return prov_xrate_cd();
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
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			return ret_prov_typ();
		}
		if ($ret_prov_typ_nm.equalsIgnoreCase(name)) {
			return ret_prov_typ_nm();
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			return ret_prov_basis_typ();
		}
		if ($ret_prov_basis_typ_nm.equalsIgnoreCase(name)) {
			return ret_prov_basis_typ_nm();
		}
		if ($ret_trd_cur_cd.equalsIgnoreCase(name)) {
			return ret_trd_cur_cd();
		}
		if ($ret_trd_cur_nm.equalsIgnoreCase(name)) {
			return ret_trd_cur_nm();
		}
		if ($ret_tax_cd.equalsIgnoreCase(name)) {
			return ret_tax_cd();
		}
		if ($ret_tax_nm.equalsIgnoreCase(name)) {
			return ret_tax_nm();
		}
		if ($ret_tax_typ.equalsIgnoreCase(name)) {
			return ret_tax_typ();
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			return base_dlv_slip_no();
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			return base_prov_act_no();
		}
		if ($rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return rqst_cnt_rmrks();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
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
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			return xfr_src_typ();
		}
		if ($xfr_src_typ_nm.equalsIgnoreCase(name)) {
			return xfr_src_typ_nm();
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			return xfr_src_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
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
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			return act_cont_qty();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			return std_cont_qty();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_amt_dec_place();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($ptax_amt.equalsIgnoreCase(name)) {
			return ptax_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($ret_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ret_trd_cur_amt_dec_place();
		}
		if ($ret_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return ret_trd_cur_upri_dec_place();
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			return ret_trd_cur_upri();
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			return ret_trd_cur_amt();
		}
		if ($ret_tax_rate.equalsIgnoreCase(name)) {
			return ret_tax_rate();
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return ret_trd_cur_tax_amt();
		}
		if ($ret_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return ret_trd_cur_inc_tax_amt();
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			return ret_xrate();
		}
		if ($ret_base_cur_amt.equalsIgnoreCase(name)) {
			return ret_base_cur_amt();
		}
		if ($ret_base_cur_tax_amt.equalsIgnoreCase(name)) {
			return ret_base_cur_tax_amt();
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			return ret_ptax_xrate();
		}
		if ($ret_ptax_amt.equalsIgnoreCase(name)) {
			return ret_ptax_amt();
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			return ret_wtax_rate();
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			return ret_wtax_amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
		}
		if ($gi_rqst_tm.equalsIgnoreCase(name)) {
			return gi_rqst_tm();
		}
		if ($gi_rqst_dt.equalsIgnoreCase(name)) {
			return gi_rqst_dt();
		}
		if ($gi_rqst_hm.equalsIgnoreCase(name)) {
			return gi_rqst_hm();
		}
		if ($gr_rqst_tm.equalsIgnoreCase(name)) {
			return gr_rqst_tm();
		}
		if ($gr_rqst_dt.equalsIgnoreCase(name)) {
			return gr_rqst_dt();
		}
		if ($gr_rqst_hm.equalsIgnoreCase(name)) {
			return gr_rqst_hm();
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			return vld_dt_to();
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
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return prov_upri_cng_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($lot_none_flg.equalsIgnoreCase(name)) {
			return lot_none_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return gi_str_ln_tgt_flg();
		}
		if ($gi_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return gi_str_ln_cd_none_flg();
		}
		if ($gr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return gr_str_ln_tgt_flg();
		}
		if ($gr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return gr_str_ln_cd_none_flg();
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
		if ($gi_subcon_flg.equalsIgnoreCase(name)) {
			return gi_subcon_flg();
		}
		if ($gi_onr_prsppl_flg.equalsIgnoreCase(name)) {
			return gi_onr_prsppl_flg();
		}
		if ($gi_prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return gi_prov_upri_cng_flg();
		}
		if ($gr_subcon_flg.equalsIgnoreCase(name)) {
			return gr_subcon_flg();
		}
		if ($gr_onr_prsppl_flg.equalsIgnoreCase(name)) {
			return gr_onr_prsppl_flg();
		}
		if ($gr_prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return gr_prov_upri_cng_flg();
		}
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			return iv_trd_flg();
		}
		if ($rqst_mod_flg.equalsIgnoreCase(name)) {
			return rqst_mod_flg();
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			return rqst_can_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			return ship_block_flg();
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($ret_tax_fix_flg.equalsIgnoreCase(name)) {
			return ret_tax_fix_flg();
		}
		if ($ret_inc_tax_flg.equalsIgnoreCase(name)) {
			return ret_inc_tax_flg();
		}
		if ($ret_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ret_xrate_inpt_flg();
		}
		if ($ret_ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ret_ptax_xrate_inpt_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
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
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			return gi_str_ln_nm();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_lg_grp_nm.equalsIgnoreCase(name)) {
			return gi_lg_grp_nm();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gi_wg_nm.equalsIgnoreCase(name)) {
			return gi_wg_nm();
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			return gi_site_cd();
		}
		if ($gi_site_nm.equalsIgnoreCase(name)) {
			return gi_site_nm();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			return gr_loc_nm();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			return gr_str_ln_nm();
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			return gr_lg_grp_cd();
		}
		if ($gr_lg_grp_nm.equalsIgnoreCase(name)) {
			return gr_lg_grp_nm();
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
		}
		if ($gr_wg_nm.equalsIgnoreCase(name)) {
			return gr_wg_nm();
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			return gr_site_cd();
		}
		if ($gr_site_nm.equalsIgnoreCase(name)) {
			return gr_site_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
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
		if ($gi_sppl_cd.equalsIgnoreCase(name)) {
			return gi_sppl_cd();
		}
		if ($gi_sppl_nm.equalsIgnoreCase(name)) {
			return gi_sppl_nm();
		}
		if ($gi_cur_cd.equalsIgnoreCase(name)) {
			return gi_cur_cd();
		}
		if ($gi_prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			return gi_prov_amt_rnd_typ();
		}
		if ($gi_prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			return gi_prov_tax_rnd_typ();
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gi_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_nm();
		}
		if ($gr_sppl_cd.equalsIgnoreCase(name)) {
			return gr_sppl_cd();
		}
		if ($gr_cur_cd.equalsIgnoreCase(name)) {
			return gr_cur_cd();
		}
		if ($gr_prov_rcv_typ.equalsIgnoreCase(name)) {
			return gr_prov_rcv_typ();
		}
		if ($gr_prov_basis_typ.equalsIgnoreCase(name)) {
			return gr_prov_basis_typ();
		}
		if ($gr_prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			return gr_prov_amt_rnd_typ();
		}
		if ($gr_prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			return gr_prov_tax_rnd_typ();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			return rqst_usr_nm();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_dpt_nm();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($ship_inst_typ_nm.equalsIgnoreCase(name)) {
			return ship_inst_typ_nm();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_to_id_typ_nm();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			return ship_to_zip_cd();
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			return ship_to_addr1();
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			return ship_to_addr2();
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			return ship_to_addr3();
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			return ship_to_addr4();
		}
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			return ship_to_cntct_dpt();
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			return ship_to_cntct_psn();
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			return ship_to_tel();
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			return ship_to_fax();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			return via_dlv_typ_nm();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			return prov_typ_nm();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			return prov_basis_typ_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
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
		if ($prov_xrate_cd.equalsIgnoreCase(name)) {
			return prov_xrate_cd();
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
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			return ret_prov_typ();
		}
		if ($ret_prov_typ_nm.equalsIgnoreCase(name)) {
			return ret_prov_typ_nm();
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			return ret_prov_basis_typ();
		}
		if ($ret_prov_basis_typ_nm.equalsIgnoreCase(name)) {
			return ret_prov_basis_typ_nm();
		}
		if ($ret_trd_cur_cd.equalsIgnoreCase(name)) {
			return ret_trd_cur_cd();
		}
		if ($ret_trd_cur_nm.equalsIgnoreCase(name)) {
			return ret_trd_cur_nm();
		}
		if ($ret_tax_cd.equalsIgnoreCase(name)) {
			return ret_tax_cd();
		}
		if ($ret_tax_nm.equalsIgnoreCase(name)) {
			return ret_tax_nm();
		}
		if ($ret_tax_typ.equalsIgnoreCase(name)) {
			return ret_tax_typ();
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			return base_dlv_slip_no();
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			return base_prov_act_no();
		}
		if ($rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return rqst_cnt_rmrks();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
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
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			return xfr_src_typ();
		}
		if ($xfr_src_typ_nm.equalsIgnoreCase(name)) {
			return xfr_src_typ_nm();
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			return xfr_src_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
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
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			return act_cont_qty();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			return std_cont_qty();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_amt_dec_place();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($ptax_amt.equalsIgnoreCase(name)) {
			return ptax_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($ret_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ret_trd_cur_amt_dec_place();
		}
		if ($ret_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return ret_trd_cur_upri_dec_place();
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			return ret_trd_cur_upri();
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			return ret_trd_cur_amt();
		}
		if ($ret_tax_rate.equalsIgnoreCase(name)) {
			return ret_tax_rate();
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return ret_trd_cur_tax_amt();
		}
		if ($ret_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return ret_trd_cur_inc_tax_amt();
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			return ret_xrate();
		}
		if ($ret_base_cur_amt.equalsIgnoreCase(name)) {
			return ret_base_cur_amt();
		}
		if ($ret_base_cur_tax_amt.equalsIgnoreCase(name)) {
			return ret_base_cur_tax_amt();
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			return ret_ptax_xrate();
		}
		if ($ret_ptax_amt.equalsIgnoreCase(name)) {
			return ret_ptax_amt();
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			return ret_wtax_rate();
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			return ret_wtax_amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
		}
		if ($gi_rqst_tm.equalsIgnoreCase(name)) {
			return gi_rqst_tm();
		}
		if ($gi_rqst_dt.equalsIgnoreCase(name)) {
			return gi_rqst_dt();
		}
		if ($gi_rqst_hm.equalsIgnoreCase(name)) {
			return gi_rqst_hm();
		}
		if ($gr_rqst_tm.equalsIgnoreCase(name)) {
			return gr_rqst_tm();
		}
		if ($gr_rqst_dt.equalsIgnoreCase(name)) {
			return gr_rqst_dt();
		}
		if ($gr_rqst_hm.equalsIgnoreCase(name)) {
			return gr_rqst_hm();
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			return vld_dt_to();
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
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return prov_upri_cng_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($lot_none_flg.equalsIgnoreCase(name)) {
			return lot_none_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return gi_str_ln_tgt_flg();
		}
		if ($gi_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return gi_str_ln_cd_none_flg();
		}
		if ($gr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return gr_str_ln_tgt_flg();
		}
		if ($gr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return gr_str_ln_cd_none_flg();
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
		if ($gi_subcon_flg.equalsIgnoreCase(name)) {
			return gi_subcon_flg();
		}
		if ($gi_onr_prsppl_flg.equalsIgnoreCase(name)) {
			return gi_onr_prsppl_flg();
		}
		if ($gi_prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return gi_prov_upri_cng_flg();
		}
		if ($gr_subcon_flg.equalsIgnoreCase(name)) {
			return gr_subcon_flg();
		}
		if ($gr_onr_prsppl_flg.equalsIgnoreCase(name)) {
			return gr_onr_prsppl_flg();
		}
		if ($gr_prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return gr_prov_upri_cng_flg();
		}
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			return iv_trd_flg();
		}
		if ($rqst_mod_flg.equalsIgnoreCase(name)) {
			return rqst_mod_flg();
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			return rqst_can_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			return ship_block_flg();
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($ret_tax_fix_flg.equalsIgnoreCase(name)) {
			return ret_tax_fix_flg();
		}
		if ($ret_inc_tax_flg.equalsIgnoreCase(name)) {
			return ret_inc_tax_flg();
		}
		if ($ret_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ret_xrate_inpt_flg();
		}
		if ($ret_ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ret_ptax_xrate_inpt_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
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
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			gi_loc_nm(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			gi_str_ln_nm(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_lg_grp_nm.equalsIgnoreCase(name)) {
			gi_lg_grp_nm(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gi_wg_nm.equalsIgnoreCase(name)) {
			gi_wg_nm(value);
			return;
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			gi_site_cd(value);
			return;
		}
		if ($gi_site_nm.equalsIgnoreCase(name)) {
			gi_site_nm(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			gr_loc_nm(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			gr_str_ln_nm(value);
			return;
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			gr_lg_grp_cd(value);
			return;
		}
		if ($gr_lg_grp_nm.equalsIgnoreCase(name)) {
			gr_lg_grp_nm(value);
			return;
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
			return;
		}
		if ($gr_wg_nm.equalsIgnoreCase(name)) {
			gr_wg_nm(value);
			return;
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			gr_site_cd(value);
			return;
		}
		if ($gr_site_nm.equalsIgnoreCase(name)) {
			gr_site_nm(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
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
		if ($gi_sppl_cd.equalsIgnoreCase(name)) {
			gi_sppl_cd(value);
			return;
		}
		if ($gi_sppl_nm.equalsIgnoreCase(name)) {
			gi_sppl_nm(value);
			return;
		}
		if ($gi_cur_cd.equalsIgnoreCase(name)) {
			gi_cur_cd(value);
			return;
		}
		if ($gi_prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			gi_prov_amt_rnd_typ(value);
			return;
		}
		if ($gi_prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			gi_prov_tax_rnd_typ(value);
			return;
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_nm(value);
			return;
		}
		if ($gr_sppl_cd.equalsIgnoreCase(name)) {
			gr_sppl_cd(value);
			return;
		}
		if ($gr_cur_cd.equalsIgnoreCase(name)) {
			gr_cur_cd(value);
			return;
		}
		if ($gr_prov_rcv_typ.equalsIgnoreCase(name)) {
			gr_prov_rcv_typ(value);
			return;
		}
		if ($gr_prov_basis_typ.equalsIgnoreCase(name)) {
			gr_prov_basis_typ(value);
			return;
		}
		if ($gr_prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			gr_prov_amt_rnd_typ(value);
			return;
		}
		if ($gr_prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			gr_prov_tax_rnd_typ(value);
			return;
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			rqst_usr_cd(value);
			return;
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			rqst_usr_nm(value);
			return;
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			rqst_dpt_nm(value);
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
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($ship_inst_typ_nm.equalsIgnoreCase(name)) {
			ship_inst_typ_nm(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
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
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			ship_to_id_typ_nm(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			ship_to_zip_cd(value);
			return;
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			ship_to_addr1(value);
			return;
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			ship_to_addr2(value);
			return;
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			ship_to_addr3(value);
			return;
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			ship_to_addr4(value);
			return;
		}
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			ship_to_cntct_dpt(value);
			return;
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			ship_to_cntct_psn(value);
			return;
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			ship_to_tel(value);
			return;
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			ship_to_fax(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			via_dlv_typ_nm(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			prov_typ_nm(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			prov_basis_typ_nm(value);
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
		if ($prov_xrate_cd.equalsIgnoreCase(name)) {
			prov_xrate_cd(value);
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
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			ret_prov_typ(value);
			return;
		}
		if ($ret_prov_typ_nm.equalsIgnoreCase(name)) {
			ret_prov_typ_nm(value);
			return;
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			ret_prov_basis_typ(value);
			return;
		}
		if ($ret_prov_basis_typ_nm.equalsIgnoreCase(name)) {
			ret_prov_basis_typ_nm(value);
			return;
		}
		if ($ret_trd_cur_cd.equalsIgnoreCase(name)) {
			ret_trd_cur_cd(value);
			return;
		}
		if ($ret_trd_cur_nm.equalsIgnoreCase(name)) {
			ret_trd_cur_nm(value);
			return;
		}
		if ($ret_tax_cd.equalsIgnoreCase(name)) {
			ret_tax_cd(value);
			return;
		}
		if ($ret_tax_nm.equalsIgnoreCase(name)) {
			ret_tax_nm(value);
			return;
		}
		if ($ret_tax_typ.equalsIgnoreCase(name)) {
			ret_tax_typ(value);
			return;
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			base_dlv_slip_no(value);
			return;
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			base_prov_act_no(value);
			return;
		}
		if ($rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			rqst_cnt_rmrks(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
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
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			xfr_src_typ(value);
			return;
		}
		if ($xfr_src_typ_nm.equalsIgnoreCase(name)) {
			xfr_src_typ_nm(value);
			return;
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			xfr_src_no(value);
			return;
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
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
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ptax_amt.equalsIgnoreCase(name)) {
			ptax_amt(value);
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
		if ($ret_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ret_trd_cur_amt_dec_place(value);
			return;
		}
		if ($ret_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ret_trd_cur_upri_dec_place(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
			return;
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_amt(value);
			return;
		}
		if ($ret_tax_rate.equalsIgnoreCase(name)) {
			ret_tax_rate(value);
			return;
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_tax_amt(value);
			return;
		}
		if ($ret_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_base_cur_amt.equalsIgnoreCase(name)) {
			ret_base_cur_amt(value);
			return;
		}
		if ($ret_base_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_base_cur_tax_amt(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_ptax_amt.equalsIgnoreCase(name)) {
			ret_ptax_amt(value);
			return;
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			ret_wtax_rate(value);
			return;
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			ret_wtax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ptax_amt.equalsIgnoreCase(name)) {
			ptax_amt(value);
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
		if ($ret_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ret_trd_cur_amt_dec_place(value);
			return;
		}
		if ($ret_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ret_trd_cur_upri_dec_place(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
			return;
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_amt(value);
			return;
		}
		if ($ret_tax_rate.equalsIgnoreCase(name)) {
			ret_tax_rate(value);
			return;
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_tax_amt(value);
			return;
		}
		if ($ret_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_base_cur_amt.equalsIgnoreCase(name)) {
			ret_base_cur_amt(value);
			return;
		}
		if ($ret_base_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_base_cur_tax_amt(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_ptax_amt.equalsIgnoreCase(name)) {
			ret_ptax_amt(value);
			return;
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			ret_wtax_rate(value);
			return;
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			ret_wtax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ptax_amt.equalsIgnoreCase(name)) {
			ptax_amt(value);
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
		if ($ret_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ret_trd_cur_amt_dec_place(value);
			return;
		}
		if ($ret_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ret_trd_cur_upri_dec_place(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
			return;
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_amt(value);
			return;
		}
		if ($ret_tax_rate.equalsIgnoreCase(name)) {
			ret_tax_rate(value);
			return;
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_tax_amt(value);
			return;
		}
		if ($ret_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_base_cur_amt.equalsIgnoreCase(name)) {
			ret_base_cur_amt(value);
			return;
		}
		if ($ret_base_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_base_cur_tax_amt(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_ptax_amt.equalsIgnoreCase(name)) {
			ret_ptax_amt(value);
			return;
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			ret_wtax_rate(value);
			return;
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			ret_wtax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ptax_amt.equalsIgnoreCase(name)) {
			ptax_amt(value);
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
		if ($ret_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ret_trd_cur_amt_dec_place(value);
			return;
		}
		if ($ret_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ret_trd_cur_upri_dec_place(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
			return;
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_amt(value);
			return;
		}
		if ($ret_tax_rate.equalsIgnoreCase(name)) {
			ret_tax_rate(value);
			return;
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_tax_amt(value);
			return;
		}
		if ($ret_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_base_cur_amt.equalsIgnoreCase(name)) {
			ret_base_cur_amt(value);
			return;
		}
		if ($ret_base_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_base_cur_tax_amt(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_ptax_amt.equalsIgnoreCase(name)) {
			ret_ptax_amt(value);
			return;
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			ret_wtax_rate(value);
			return;
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			ret_wtax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ptax_amt.equalsIgnoreCase(name)) {
			ptax_amt(value);
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
		if ($ret_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ret_trd_cur_amt_dec_place(value);
			return;
		}
		if ($ret_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ret_trd_cur_upri_dec_place(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
			return;
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_amt(value);
			return;
		}
		if ($ret_tax_rate.equalsIgnoreCase(name)) {
			ret_tax_rate(value);
			return;
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_tax_amt(value);
			return;
		}
		if ($ret_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_base_cur_amt.equalsIgnoreCase(name)) {
			ret_base_cur_amt(value);
			return;
		}
		if ($ret_base_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_base_cur_tax_amt(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_ptax_amt.equalsIgnoreCase(name)) {
			ret_ptax_amt(value);
			return;
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			ret_wtax_rate(value);
			return;
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			ret_wtax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
			return;
		}
		if ($gi_rqst_tm.equalsIgnoreCase(name)) {
			gi_rqst_tm(value);
			return;
		}
		if ($gi_rqst_dt.equalsIgnoreCase(name)) {
			gi_rqst_dt(value);
			return;
		}
		if ($gi_rqst_hm.equalsIgnoreCase(name)) {
			gi_rqst_hm(value);
			return;
		}
		if ($gr_rqst_tm.equalsIgnoreCase(name)) {
			gr_rqst_tm(value);
			return;
		}
		if ($gr_rqst_dt.equalsIgnoreCase(name)) {
			gr_rqst_dt(value);
			return;
		}
		if ($gr_rqst_hm.equalsIgnoreCase(name)) {
			gr_rqst_hm(value);
			return;
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
			return;
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			vld_dt_fr(value);
			return;
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			vld_dt_to(value);
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			prov_upri_cng_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($lot_none_flg.equalsIgnoreCase(name)) {
			lot_none_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			gi_str_ln_tgt_flg(value);
			return;
		}
		if ($gi_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			gi_str_ln_cd_none_flg(value);
			return;
		}
		if ($gr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			gr_str_ln_tgt_flg(value);
			return;
		}
		if ($gr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			gr_str_ln_cd_none_flg(value);
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
		if ($gi_subcon_flg.equalsIgnoreCase(name)) {
			gi_subcon_flg(value);
			return;
		}
		if ($gi_onr_prsppl_flg.equalsIgnoreCase(name)) {
			gi_onr_prsppl_flg(value);
			return;
		}
		if ($gi_prov_upri_cng_flg.equalsIgnoreCase(name)) {
			gi_prov_upri_cng_flg(value);
			return;
		}
		if ($gr_subcon_flg.equalsIgnoreCase(name)) {
			gr_subcon_flg(value);
			return;
		}
		if ($gr_onr_prsppl_flg.equalsIgnoreCase(name)) {
			gr_onr_prsppl_flg(value);
			return;
		}
		if ($gr_prov_upri_cng_flg.equalsIgnoreCase(name)) {
			gr_prov_upri_cng_flg(value);
			return;
		}
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			iv_trd_flg(value);
			return;
		}
		if ($rqst_mod_flg.equalsIgnoreCase(name)) {
			rqst_mod_flg(value);
			return;
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			rqst_can_flg(value);
			return;
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			acxfr_gi_flg(value);
			return;
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			ship_block_flg(value);
			return;
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
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
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		if ($ret_tax_fix_flg.equalsIgnoreCase(name)) {
			ret_tax_fix_flg(value);
			return;
		}
		if ($ret_inc_tax_flg.equalsIgnoreCase(name)) {
			ret_inc_tax_flg(value);
			return;
		}
		if ($ret_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ret_xrate_inpt_flg(value);
			return;
		}
		if ($ret_ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ret_ptax_xrate_inpt_flg(value);
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
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
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
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			gi_loc_nm(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			gi_str_ln_nm(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_lg_grp_nm.equalsIgnoreCase(name)) {
			gi_lg_grp_nm(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gi_wg_nm.equalsIgnoreCase(name)) {
			gi_wg_nm(value);
			return;
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			gi_site_cd(value);
			return;
		}
		if ($gi_site_nm.equalsIgnoreCase(name)) {
			gi_site_nm(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			gr_loc_nm(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			gr_str_ln_nm(value);
			return;
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			gr_lg_grp_cd(value);
			return;
		}
		if ($gr_lg_grp_nm.equalsIgnoreCase(name)) {
			gr_lg_grp_nm(value);
			return;
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
			return;
		}
		if ($gr_wg_nm.equalsIgnoreCase(name)) {
			gr_wg_nm(value);
			return;
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			gr_site_cd(value);
			return;
		}
		if ($gr_site_nm.equalsIgnoreCase(name)) {
			gr_site_nm(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
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
		if ($gi_sppl_cd.equalsIgnoreCase(name)) {
			gi_sppl_cd(value);
			return;
		}
		if ($gi_sppl_nm.equalsIgnoreCase(name)) {
			gi_sppl_nm(value);
			return;
		}
		if ($gi_cur_cd.equalsIgnoreCase(name)) {
			gi_cur_cd(value);
			return;
		}
		if ($gi_prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			gi_prov_amt_rnd_typ(value);
			return;
		}
		if ($gi_prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			gi_prov_tax_rnd_typ(value);
			return;
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_nm(value);
			return;
		}
		if ($gr_sppl_cd.equalsIgnoreCase(name)) {
			gr_sppl_cd(value);
			return;
		}
		if ($gr_cur_cd.equalsIgnoreCase(name)) {
			gr_cur_cd(value);
			return;
		}
		if ($gr_prov_rcv_typ.equalsIgnoreCase(name)) {
			gr_prov_rcv_typ(value);
			return;
		}
		if ($gr_prov_basis_typ.equalsIgnoreCase(name)) {
			gr_prov_basis_typ(value);
			return;
		}
		if ($gr_prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			gr_prov_amt_rnd_typ(value);
			return;
		}
		if ($gr_prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			gr_prov_tax_rnd_typ(value);
			return;
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			rqst_usr_cd(value);
			return;
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			rqst_usr_nm(value);
			return;
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			rqst_dpt_nm(value);
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
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($ship_inst_typ_nm.equalsIgnoreCase(name)) {
			ship_inst_typ_nm(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
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
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			ship_to_id_typ_nm(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			ship_to_zip_cd(value);
			return;
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			ship_to_addr1(value);
			return;
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			ship_to_addr2(value);
			return;
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			ship_to_addr3(value);
			return;
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			ship_to_addr4(value);
			return;
		}
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			ship_to_cntct_dpt(value);
			return;
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			ship_to_cntct_psn(value);
			return;
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			ship_to_tel(value);
			return;
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			ship_to_fax(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			via_dlv_typ_nm(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			prov_typ_nm(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			prov_basis_typ_nm(value);
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
		if ($prov_xrate_cd.equalsIgnoreCase(name)) {
			prov_xrate_cd(value);
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
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			ret_prov_typ(value);
			return;
		}
		if ($ret_prov_typ_nm.equalsIgnoreCase(name)) {
			ret_prov_typ_nm(value);
			return;
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			ret_prov_basis_typ(value);
			return;
		}
		if ($ret_prov_basis_typ_nm.equalsIgnoreCase(name)) {
			ret_prov_basis_typ_nm(value);
			return;
		}
		if ($ret_trd_cur_cd.equalsIgnoreCase(name)) {
			ret_trd_cur_cd(value);
			return;
		}
		if ($ret_trd_cur_nm.equalsIgnoreCase(name)) {
			ret_trd_cur_nm(value);
			return;
		}
		if ($ret_tax_cd.equalsIgnoreCase(name)) {
			ret_tax_cd(value);
			return;
		}
		if ($ret_tax_nm.equalsIgnoreCase(name)) {
			ret_tax_nm(value);
			return;
		}
		if ($ret_tax_typ.equalsIgnoreCase(name)) {
			ret_tax_typ(value);
			return;
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			base_dlv_slip_no(value);
			return;
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			base_prov_act_no(value);
			return;
		}
		if ($rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			rqst_cnt_rmrks(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
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
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			xfr_src_typ(value);
			return;
		}
		if ($xfr_src_typ_nm.equalsIgnoreCase(name)) {
			xfr_src_typ_nm(value);
			return;
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			xfr_src_no(value);
			return;
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
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
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ptax_amt.equalsIgnoreCase(name)) {
			ptax_amt(value);
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
		if ($ret_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ret_trd_cur_amt_dec_place(value);
			return;
		}
		if ($ret_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ret_trd_cur_upri_dec_place(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
			return;
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_amt(value);
			return;
		}
		if ($ret_tax_rate.equalsIgnoreCase(name)) {
			ret_tax_rate(value);
			return;
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_tax_amt(value);
			return;
		}
		if ($ret_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_base_cur_amt.equalsIgnoreCase(name)) {
			ret_base_cur_amt(value);
			return;
		}
		if ($ret_base_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_base_cur_tax_amt(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_ptax_amt.equalsIgnoreCase(name)) {
			ret_ptax_amt(value);
			return;
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			ret_wtax_rate(value);
			return;
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			ret_wtax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ptax_amt.equalsIgnoreCase(name)) {
			ptax_amt(value);
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
		if ($ret_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ret_trd_cur_amt_dec_place(value);
			return;
		}
		if ($ret_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ret_trd_cur_upri_dec_place(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
			return;
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_amt(value);
			return;
		}
		if ($ret_tax_rate.equalsIgnoreCase(name)) {
			ret_tax_rate(value);
			return;
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_tax_amt(value);
			return;
		}
		if ($ret_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_base_cur_amt.equalsIgnoreCase(name)) {
			ret_base_cur_amt(value);
			return;
		}
		if ($ret_base_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_base_cur_tax_amt(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_ptax_amt.equalsIgnoreCase(name)) {
			ret_ptax_amt(value);
			return;
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			ret_wtax_rate(value);
			return;
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			ret_wtax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ptax_amt.equalsIgnoreCase(name)) {
			ptax_amt(value);
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
		if ($ret_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ret_trd_cur_amt_dec_place(value);
			return;
		}
		if ($ret_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ret_trd_cur_upri_dec_place(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
			return;
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_amt(value);
			return;
		}
		if ($ret_tax_rate.equalsIgnoreCase(name)) {
			ret_tax_rate(value);
			return;
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_tax_amt(value);
			return;
		}
		if ($ret_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_base_cur_amt.equalsIgnoreCase(name)) {
			ret_base_cur_amt(value);
			return;
		}
		if ($ret_base_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_base_cur_tax_amt(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_ptax_amt.equalsIgnoreCase(name)) {
			ret_ptax_amt(value);
			return;
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			ret_wtax_rate(value);
			return;
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			ret_wtax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ptax_amt.equalsIgnoreCase(name)) {
			ptax_amt(value);
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
		if ($ret_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ret_trd_cur_amt_dec_place(value);
			return;
		}
		if ($ret_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ret_trd_cur_upri_dec_place(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
			return;
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_amt(value);
			return;
		}
		if ($ret_tax_rate.equalsIgnoreCase(name)) {
			ret_tax_rate(value);
			return;
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_tax_amt(value);
			return;
		}
		if ($ret_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_base_cur_amt.equalsIgnoreCase(name)) {
			ret_base_cur_amt(value);
			return;
		}
		if ($ret_base_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_base_cur_tax_amt(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_ptax_amt.equalsIgnoreCase(name)) {
			ret_ptax_amt(value);
			return;
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			ret_wtax_rate(value);
			return;
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			ret_wtax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ptax_amt.equalsIgnoreCase(name)) {
			ptax_amt(value);
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
		if ($ret_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ret_trd_cur_amt_dec_place(value);
			return;
		}
		if ($ret_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ret_trd_cur_upri_dec_place(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
			return;
		}
		if ($ret_trd_cur_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_amt(value);
			return;
		}
		if ($ret_tax_rate.equalsIgnoreCase(name)) {
			ret_tax_rate(value);
			return;
		}
		if ($ret_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_tax_amt(value);
			return;
		}
		if ($ret_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ret_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_base_cur_amt.equalsIgnoreCase(name)) {
			ret_base_cur_amt(value);
			return;
		}
		if ($ret_base_cur_tax_amt.equalsIgnoreCase(name)) {
			ret_base_cur_tax_amt(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_ptax_amt.equalsIgnoreCase(name)) {
			ret_ptax_amt(value);
			return;
		}
		if ($ret_wtax_rate.equalsIgnoreCase(name)) {
			ret_wtax_rate(value);
			return;
		}
		if ($ret_wtax_amt.equalsIgnoreCase(name)) {
			ret_wtax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
			return;
		}
		if ($gi_rqst_tm.equalsIgnoreCase(name)) {
			gi_rqst_tm(value);
			return;
		}
		if ($gi_rqst_dt.equalsIgnoreCase(name)) {
			gi_rqst_dt(value);
			return;
		}
		if ($gi_rqst_hm.equalsIgnoreCase(name)) {
			gi_rqst_hm(value);
			return;
		}
		if ($gr_rqst_tm.equalsIgnoreCase(name)) {
			gr_rqst_tm(value);
			return;
		}
		if ($gr_rqst_dt.equalsIgnoreCase(name)) {
			gr_rqst_dt(value);
			return;
		}
		if ($gr_rqst_hm.equalsIgnoreCase(name)) {
			gr_rqst_hm(value);
			return;
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
			return;
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			vld_dt_fr(value);
			return;
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			vld_dt_to(value);
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			prov_upri_cng_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($lot_none_flg.equalsIgnoreCase(name)) {
			lot_none_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			gi_str_ln_tgt_flg(value);
			return;
		}
		if ($gi_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			gi_str_ln_cd_none_flg(value);
			return;
		}
		if ($gr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			gr_str_ln_tgt_flg(value);
			return;
		}
		if ($gr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			gr_str_ln_cd_none_flg(value);
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
		if ($gi_subcon_flg.equalsIgnoreCase(name)) {
			gi_subcon_flg(value);
			return;
		}
		if ($gi_onr_prsppl_flg.equalsIgnoreCase(name)) {
			gi_onr_prsppl_flg(value);
			return;
		}
		if ($gi_prov_upri_cng_flg.equalsIgnoreCase(name)) {
			gi_prov_upri_cng_flg(value);
			return;
		}
		if ($gr_subcon_flg.equalsIgnoreCase(name)) {
			gr_subcon_flg(value);
			return;
		}
		if ($gr_onr_prsppl_flg.equalsIgnoreCase(name)) {
			gr_onr_prsppl_flg(value);
			return;
		}
		if ($gr_prov_upri_cng_flg.equalsIgnoreCase(name)) {
			gr_prov_upri_cng_flg(value);
			return;
		}
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			iv_trd_flg(value);
			return;
		}
		if ($rqst_mod_flg.equalsIgnoreCase(name)) {
			rqst_mod_flg(value);
			return;
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			rqst_can_flg(value);
			return;
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			acxfr_gi_flg(value);
			return;
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			ship_block_flg(value);
			return;
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
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
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		if ($ret_tax_fix_flg.equalsIgnoreCase(name)) {
			ret_tax_fix_flg(value);
			return;
		}
		if ($ret_inc_tax_flg.equalsIgnoreCase(name)) {
			ret_inc_tax_flg(value);
			return;
		}
		if ($ret_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ret_xrate_inpt_flg(value);
			return;
		}
		if ($ret_ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ret_ptax_xrate_inpt_flg(value);
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
		super.setBooleanNE(name, value);
	}



}

