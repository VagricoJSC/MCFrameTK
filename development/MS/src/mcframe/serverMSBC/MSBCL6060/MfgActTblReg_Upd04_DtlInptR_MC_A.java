package mcframe.serverMSBC.MSBCL6060;

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
 * ブロック"MfgActTblReg_Upd04_DtlInpt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgActTblReg_Upd04_DtlInptR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public static final String $oper_peg_no = "oper_peg_no";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Skip input result entry 投入実績登録スキップ.<p>
	 *
	 */
	public static final String $inpt_act_reg_skip_flg = "inpt_act_reg_skip_flg";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
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
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public static final String $mfg_mtd_typ = "mfg_mtd_typ";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public static final String $act_dpt_cd = "act_dpt_cd";
	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $mfg_str_ln_cd = "mfg_str_ln_cd";
	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Input location supplier cd. 投入場所発注先ＣＤ.<p>
	 *
	 */
	public static final String $inpt_loc_sppl_cd = "inpt_loc_sppl_cd";
	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public static final String $itm_mfg_inst_qty = "itm_mfg_inst_qty";
	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public static final String $mfg_st_qty = "mfg_st_qty";
	/**
	 * Routing 工順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public static final String $par_itm_cd = "par_itm_cd";
	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public static final String $par_itm_sub1 = "par_itm_sub1";
	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public static final String $par_itm_sub2 = "par_itm_sub2";
	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public static final String $par_itm_sub3 = "par_itm_sub3";
	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public static final String $par_itm_nm = "par_itm_nm";
	/**
	 * Item mfg. order lot No. 品目製造指図ロットＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_lot_no = "mfg_inst_lot_no";
	/**
	 * Item mfg. order sublot No. 品目製造指図サブロットＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_sublot_no = "mfg_inst_sublot_no";
	/**
	 * Item mfg. order SEIBAN No. 1 品目製造指図手配ＮＯ１.<p>
	 *
	 */
	public static final String $mfg_inst_sno1 = "mfg_inst_sno1";
	/**
	 * Item mfg. order SEIBAN No. 2 品目製造指図手配ＮＯ２.<p>
	 *
	 */
	public static final String $mfg_inst_sno2 = "mfg_inst_sno2";
	/**
	 * Item mfg. order SEIBAN No. 3 品目製造指図手配ＮＯ３.<p>
	 *
	 */
	public static final String $mfg_inst_sno3 = "mfg_inst_sno3";
	/**
	 * Item mfg. order SEIBAN No. 4 品目製造指図手配ＮＯ４.<p>
	 *
	 */
	public static final String $mfg_inst_sno4 = "mfg_inst_sno4";
	/**
	 * Item mfg. order SEIBAN No. 1 management type 品目製造指図手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $mfg_inst_sno1_mng_typ = "mfg_inst_sno1_mng_typ";
	/**
	 * Item mfg. order SEIBAN No. 2 management type 品目製造指図手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $mfg_inst_sno2_mng_typ = "mfg_inst_sno2_mng_typ";
	/**
	 * Item mfg. order SEIBAN No. 3 management type 品目製造指図手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $mfg_inst_sno3_mng_typ = "mfg_inst_sno3_mng_typ";
	/**
	 * Item mfg. order SEIBAN No. 4 management type 品目製造指図手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $mfg_inst_sno4_mng_typ = "mfg_inst_sno4_mng_typ";
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	/**
	 * Self supply currency cd. 自給通貨ＣＤ.<p>
	 *
	 */
	public static final String $slf_support_cur_cd = "slf_support_cur_cd";
	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public static final String $slf_support_upri = "slf_support_upri";
	/**
	 * Self supply tax cd. 自給税ＣＤ.<p>
	 *
	 */
	public static final String $slf_support_tax_cd = "slf_support_tax_cd";
	/**
	 * Self supply exchange rate cd. 自給為替レートＣＤ.<p>
	 *
	 */
	public static final String $slf_support_xrate_cd = "slf_support_xrate_cd";
	/**
	 * Self supply exchange rate 自給為替レート.<p>
	 *
	 */
	public static final String $slf_support_xrate = "slf_support_xrate";
	/**
	 * VMI temporary unit price ＶＭＩ仮単価.<p>
	 *
	 */
	public static final String $vmi_interim_flg = "vmi_interim_flg";
	/**
	 * VMI unit price ＶＭＩ単価.<p>
	 *
	 */
	public static final String $vmi_upri = "vmi_upri";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * Supply pegging No. 支給紐付けＮＯ.<p>
	 *
	 */
	public static final String $prov_peg_no = "prov_peg_no";
	/**
	 * Supply return pegging No. 支給返品紐付けＮＯ.<p>
	 *
	 */
	public static final String $prov_rtn_peg_no = "prov_rtn_peg_no";
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 * Current supply 今回支給.<p>
	 *
	 */
	public static final String $prov_flg = "prov_flg";
	/**
	 * Current supply return 今回支給返品.<p>
	 *
	 */
	public static final String $prov_rtn_flg = "prov_rtn_flg";
	/**
	 * Current VMI purchase 今回ＶＭＩ仕入.<p>
	 *
	 */
	public static final String $vmi_purc_flg = "vmi_purc_flg";
	/**
	 * Last supply 前回支給.<p>
	 *
	 */
	public static final String $old_prov_flg = "old_prov_flg";
	/**
	 * Last supply return 前回支給返品.<p>
	 *
	 */
	public static final String $old_prov_rtn_flg = "old_prov_rtn_flg";
	/**
	 * Last VMI purchase 前回ＶＭＩ仕入.<p>
	 *
	 */
	public static final String $old_vmi_purc_flg = "old_vmi_purc_flg";
	/**
	 * Inventory arriving point cd. after supply 支給後在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $prov_stk_arrv_bp_cd = "prov_stk_arrv_bp_cd";
	/**
	 * Inventory identification type after supply 支給後在庫識別区分.<p>
	 *
	 */
	public static final String $prov_stk_id_typ = "prov_stk_id_typ";
	/**
	 * Inventory BP cd. after supply 支給後在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $prov_stk_bp_cd = "prov_stk_bp_cd";
	/**
	 * Inventory arriving point cd. after supply returned 支給返品後在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $prov_rtn_stk_arrv_bp_cd = "prov_rtn_stk_arrv_bp_cd";
	/**
	 * Inventory identification type after supply returned 支給返品後在庫識別区分.<p>
	 *
	 */
	public static final String $prov_rtn_stk_id_typ = "prov_rtn_stk_id_typ";
	/**
	 * Inventory BP cd. after supply returned 支給返品後在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $prov_rtn_stk_bp_cd = "prov_rtn_stk_bp_cd";
	/**
	 * Base unit input/loss total qty. 基準単位投入・ロス合計数量.<p>
	 *
	 */
	public static final String $base_unit_sum_inpt_loss_qty = "base_unit_sum_inpt_loss_qty";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
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
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public static final String $sno1_null_flg = "sno1_null_flg";
	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public static final String $sno2_null_flg = "sno2_null_flg";
	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public static final String $sno3_null_flg = "sno3_null_flg";
	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public static final String $sno4_null_flg = "sno4_null_flg";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Active ingredient total 有効成分合計.<p>
	 *
	 */
	public static final String $cont_sum_qty = "cont_sum_qty";
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
	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public static final String $std_cont_fctr = "std_cont_fctr";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_conv_rnd_typ = "base_unit_conv_rnd_typ";
	/**
	 * Loss result pegging No. ロス実績用紐付けＮＯ.<p>
	 *
	 */
	public static final String $loss_peg_no = "loss_peg_no";
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
	 * Lot mixed ロット混在.<p>
	 *
	 */
	public static final String $lot_mix_flg = "lot_mix_flg";
	/**
	 * Sublots mixed サブロット混在.<p>
	 *
	 */
	public static final String $sublot_mix_flg = "sublot_mix_flg";
	/**
	 * Allocation 引当.<p>
	 *
	 */
	public static final String $alloc_flg = "alloc_flg";
	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public static final String $alloc_ctl_typ = "alloc_ctl_typ";
	/**
	 * Bulk execution 一括実行.<p>
	 *
	 */
	public static final String $lst_reg_flg = "lst_reg_flg";
	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public static final String $is_src_batch_flg = "is_src_batch_flg";
	public static final String $is_src_md_mfg_srv_flg = "is_src_md_mfg_srv_flg";
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public static final String $alt_grp_cd = "alt_grp_cd";
	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public static final String $alt_grp_seq = "alt_grp_seq";
	/**
	 * Specify alternative item 代替品目指定.<p>
	 *
	 */
	public static final String $alt_itm_fix_flg = "alt_itm_fix_flg";
	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public static final String $alt_itm_typ = "alt_itm_typ";
	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public static final String $alt_alloc_prio = "alt_alloc_prio";
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public static final String $first_gr_dt = "first_gr_dt";
	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public static final String $lot_seq = "lot_seq";
	public static final String $not_pd_chk_flg = "not_pd_chk_flg";
	public static final String $is_only_abort_flg = "is_only_abort_flg";
	public static final String $inpt_act = "inpt_act";

	public static final String $inpt_act_no = $inpt_act + ".inpt_act_no";
	public static final String $mfg_act_no = $inpt_act + ".mfg_act_no";
	public static final String $itm_mfg_inst_no = $inpt_act + ".itm_mfg_inst_no";
	public static final String $oper_act_no = $inpt_act + ".oper_act_no";
	public static final String $inpt_schd_no = $inpt_act + ".inpt_schd_no";
	public static final String $div_seq = $inpt_act + ".div_seq";
	public static final String $itm_cd = $inpt_act + ".itm_cd";
	public static final String $itm_sub1 = $inpt_act + ".itm_sub1";
	public static final String $itm_sub2 = $inpt_act + ".itm_sub2";
	public static final String $itm_sub3 = $inpt_act + ".itm_sub3";
	public static final String $ver_no = $inpt_act + ".ver_no";
	public static final String $inpt_loc_cd = $inpt_act + ".inpt_loc_cd";
	public static final String $inpt_str_ln_cd = $inpt_act + ".inpt_str_ln_cd";
	public static final String $quality_typ = $inpt_act + ".quality_typ";
	public static final String $stk_insp_typ = $inpt_act + ".stk_insp_typ";
	public static final String $stk_id_typ = $inpt_act + ".stk_id_typ";
	public static final String $stk_bp_cd = $inpt_act + ".stk_bp_cd";
	public static final String $stk_arrv_bp_cd = $inpt_act + ".stk_arrv_bp_cd";
	public static final String $gd_cd = $inpt_act + ".gd_cd";
	public static final String $inpt_rsn_cd = $inpt_act + ".inpt_rsn_cd";
	public static final String $lot_no = $inpt_act + ".lot_no";
	public static final String $sublot_no = $inpt_act + ".sublot_no";
	public static final String $sno1 = $inpt_act + ".sno1";
	public static final String $sno2 = $inpt_act + ".sno2";
	public static final String $sno3 = $inpt_act + ".sno3";
	public static final String $sno4 = $inpt_act + ".sno4";
	public static final String $base_unit_inpt_qty = $inpt_act + ".base_unit_inpt_qty";
	public static final String $base_unit_loss_qty = $inpt_act + ".base_unit_loss_qty";
	public static final String $base_unit_fxd_loss_qty = $inpt_act + ".base_unit_fxd_loss_qty";
	public static final String $base_unit_cd = $inpt_act + ".base_unit_cd";
	public static final String $act_tm = $inpt_act + ".act_tm";
	public static final String $ac_dt = $inpt_act + ".ac_dt";
	public static final String $bkf_ctl_flg = $inpt_act + ".bkf_ctl_flg";
	public static final String $base_unit_std_qty = $inpt_act + ".base_unit_std_qty";
	public static final String $cont_qty = $inpt_act + ".cont_qty";
	public static final String $cont_loss_qty = $inpt_act + ".cont_loss_qty";
	public static final String $cont_fxd_loss_qty = $inpt_act + ".cont_fxd_loss_qty";
	public static final String $cont_fctr_unit_cd = $inpt_act + ".cont_fctr_unit_cd";
	public static final String $act_cont_fctr = $inpt_act + ".act_cont_fctr";
	public static final String $acxfr_qty = $inpt_act + ".acxfr_qty";
	public static final String $acxfr_rsn_cd = $inpt_act + ".acxfr_rsn_cd";
	public static final String $acxfr_bd_dpt_cd = $inpt_act + ".acxfr_bd_dpt_cd";
	public static final String $data_no = $inpt_act + ".data_no";
	public static final String $mes_id = $inpt_act + ".mes_id";
	public static final String $intr_rmrks = $inpt_act + ".intr_rmrks";
	public static final String $act_rpt_rmrks = $inpt_act + ".act_rpt_rmrks";
	public static final String $trd_rmrks = $inpt_act + ".trd_rmrks";
	public static final String $inpt_act_sub_char1 = $inpt_act + ".sub_char1";
	public static final String $inpt_act_sub_char2 = $inpt_act + ".sub_char2";
	public static final String $inpt_act_sub_char3 = $inpt_act + ".sub_char3";
	public static final String $add_flg = $inpt_act + ".add_flg";
	public static final String $mes_flg = $inpt_act + ".mes_flg";
	public static final String $ext_sys_cd = $inpt_act + ".ext_sys_cd";
	public static final String $ext_inpt_act_no = $inpt_act + ".ext_inpt_act_no";
	public static final String $if_auto_reg_flg = $inpt_act + ".if_auto_reg_flg";

	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_peg_no_META = createCommonMeta($oper_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta inpt_act_reg_skip_flg_META = createCommonMeta($inpt_act_reg_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta mfg_mtd_typ_META = createCommonMeta($mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_str_ln_cd_META = createCommonMeta($mfg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta inpt_loc_sppl_cd_META = createCommonMeta($inpt_loc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta itm_mfg_inst_qty_META = createCommonMeta($itm_mfg_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_st_qty_META = createCommonMeta($mfg_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta par_itm_cd_META = createCommonMeta($par_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta par_itm_sub1_META = createCommonMeta($par_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta par_itm_sub2_META = createCommonMeta($par_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta par_itm_sub3_META = createCommonMeta($par_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta par_itm_nm_META = createCommonMeta($par_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta mfg_inst_lot_no_META = createCommonMeta($mfg_inst_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta mfg_inst_sublot_no_META = createCommonMeta($mfg_inst_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta mfg_inst_sno1_META = createCommonMeta($mfg_inst_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta mfg_inst_sno2_META = createCommonMeta($mfg_inst_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta mfg_inst_sno3_META = createCommonMeta($mfg_inst_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta mfg_inst_sno4_META = createCommonMeta($mfg_inst_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta mfg_inst_sno1_mng_typ_META = createCommonMeta($mfg_inst_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta mfg_inst_sno2_mng_typ_META = createCommonMeta($mfg_inst_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta mfg_inst_sno3_mng_typ_META = createCommonMeta($mfg_inst_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta mfg_inst_sno4_mng_typ_META = createCommonMeta($mfg_inst_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta slf_support_cur_cd_META = createCommonMeta($slf_support_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta slf_support_upri_META = createCommonMeta($slf_support_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slf_support_tax_cd_META = createCommonMeta($slf_support_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta slf_support_xrate_cd_META = createCommonMeta($slf_support_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta slf_support_xrate_META = createCommonMeta($slf_support_xrate, mcframe.commonMA.meta.MA_META.XRATE);
	public static final MCMeta vmi_interim_flg_META = createCommonMeta($vmi_interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vmi_upri_META = createCommonMeta($vmi_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta prov_peg_no_META = createCommonMeta($prov_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta prov_rtn_peg_no_META = createCommonMeta($prov_rtn_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta prov_flg_META = createCommonMeta($prov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_rtn_flg_META = createCommonMeta($prov_rtn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vmi_purc_flg_META = createCommonMeta($vmi_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_prov_flg_META = createCommonMeta($old_prov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_prov_rtn_flg_META = createCommonMeta($old_prov_rtn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_vmi_purc_flg_META = createCommonMeta($old_vmi_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_stk_arrv_bp_cd_META = createCommonMeta($prov_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta prov_stk_id_typ_META = createCommonMeta($prov_stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta prov_stk_bp_cd_META = createCommonMeta($prov_stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta prov_rtn_stk_arrv_bp_cd_META = createCommonMeta($prov_rtn_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta prov_rtn_stk_id_typ_META = createCommonMeta($prov_rtn_stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta prov_rtn_stk_bp_cd_META = createCommonMeta($prov_rtn_stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta base_unit_sum_inpt_loss_qty_META = createCommonMeta($base_unit_sum_inpt_loss_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_sum_qty_META = createCommonMeta($cont_sum_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_conv_rnd_typ_META = createCommonMeta($base_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta loss_peg_no_META = createCommonMeta($loss_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta lot_mix_flg_META = createCommonMeta($lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_mix_flg_META = createCommonMeta($sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_ctl_typ_META = createCommonMeta($alloc_ctl_typ, mcframe.commonMA.meta.MA_META.ALLOC_CTL_TYP);
	public static final MCMeta lst_reg_flg_META = createCommonMeta($lst_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_batch_flg_META = createCommonMeta($is_src_batch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_md_mfg_srv_flg_META = createCommonMeta($is_src_md_mfg_srv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_seq_META = createCommonMeta($alt_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alt_itm_fix_flg_META = createCommonMeta($alt_itm_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alt_itm_typ_META = createCommonMeta($alt_itm_typ, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP);
	public static final MCMeta alt_alloc_prio_META = createCommonMeta($alt_alloc_prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta first_gr_dt_META = createCommonMeta($first_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_seq_META = createCommonMeta($lot_seq, mcframe.commonMA.meta.MA_META.LOT_SEQ);
	public static final MCMeta not_pd_chk_flg_META = createCommonMeta($not_pd_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_only_abort_flg_META = createCommonMeta($is_only_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_act_META = createInnerRowMeta($inpt_act, mcframe.serverMS.dbc.MST_INPT_ACT_R.class);

	protected static final ConstMetaList<MfgActTblReg_Upd04_DtlInptR> constMetas = new ConstMetaList<MfgActTblReg_Upd04_DtlInptR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			oper_peg_no_META,
			peg_no_META,
			data_crud_typ_META,
			inpt_act_reg_skip_flg_META,
			can_ac_dt_META,
			mfg_inst_no_META,
			oper_inst_no_META,
			mfg_mtd_typ_META,
			wg_cd_META,
			trd_cd_META,
			act_dpt_cd_META,
			act_usr_cd_META,
			mfg_loc_cd_META,
			mfg_str_ln_cd_META,
			sppl_cd_META,
			inpt_loc_sppl_cd_META,
			itm_mfg_inst_qty_META,
			mfg_st_qty_META,
			disp_seq_META,
			oper_cd_META,
			par_itm_cd_META,
			par_itm_sub1_META,
			par_itm_sub2_META,
			par_itm_sub3_META,
			par_itm_nm_META,
			mfg_inst_lot_no_META,
			mfg_inst_sublot_no_META,
			mfg_inst_sno1_META,
			mfg_inst_sno2_META,
			mfg_inst_sno3_META,
			mfg_inst_sno4_META,
			mfg_inst_sno1_mng_typ_META,
			mfg_inst_sno2_mng_typ_META,
			mfg_inst_sno3_mng_typ_META,
			mfg_inst_sno4_mng_typ_META,
			mfg_inst_unit_typ_META,
			slf_support_cur_cd_META,
			slf_support_upri_META,
			slf_support_tax_cd_META,
			slf_support_xrate_cd_META,
			slf_support_xrate_META,
			vmi_interim_flg_META,
			vmi_upri_META,
			slo_no_META,
			po_no_META,
			prov_peg_no_META,
			prov_rtn_peg_no_META,
			prov_basis_typ_META,
			prov_flg_META,
			prov_rtn_flg_META,
			vmi_purc_flg_META,
			old_prov_flg_META,
			old_prov_rtn_flg_META,
			old_vmi_purc_flg_META,
			prov_stk_arrv_bp_cd_META,
			prov_stk_id_typ_META,
			prov_stk_bp_cd_META,
			prov_rtn_stk_arrv_bp_cd_META,
			prov_rtn_stk_id_typ_META,
			prov_rtn_stk_bp_cd_META,
			base_unit_sum_inpt_loss_qty_META,
			itm_nm_META,
			stk_mng_typ_META,
			sundry_itm_flg_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			sno1_null_flg_META,
			sno2_null_flg_META,
			sno3_null_flg_META,
			sno4_null_flg_META,
			cont_fctr_flg_META,
			cont_sum_qty_META,
			cont_fctr_dec_place_META,
			cont_fctr_rnd_typ_META,
			std_cont_fctr_META,
			base_unit_dec_place_META,
			base_unit_conv_rnd_typ_META,
			loss_peg_no_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			lot_mix_flg_META,
			sublot_mix_flg_META,
			alloc_flg_META,
			alloc_ctl_typ_META,
			lst_reg_flg_META,
			is_src_batch_flg_META,
			is_src_md_mfg_srv_flg_META,
			alt_grp_cd_META,
			alt_grp_seq_META,
			alt_itm_fix_flg_META,
			alt_itm_typ_META,
			alt_alloc_prio_META,
			vld_dt_META,
			first_gr_dt_META,
			lot_seq_META,
			not_pd_chk_flg_META,
			is_only_abort_flg_META,
			inpt_act_META
		},
		new String[][]{
			{
				"inpt_act_no",
				"mfg_act_no",
				"itm_mfg_inst_no",
				"oper_act_no",
				"inpt_schd_no",
				"div_seq",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"ver_no",
				"inpt_loc_cd",
				"inpt_str_ln_cd",
				"quality_typ",
				"stk_insp_typ",
				"stk_id_typ",
				"stk_bp_cd",
				"stk_arrv_bp_cd",
				"gd_cd",
				"inpt_rsn_cd",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"base_unit_inpt_qty",
				"base_unit_loss_qty",
				"base_unit_fxd_loss_qty",
				"base_unit_cd",
				"act_tm",
				"ac_dt",
				"bkf_ctl_flg",
				"base_unit_std_qty",
				"cont_qty",
				"cont_loss_qty",
				"cont_fxd_loss_qty",
				"cont_fctr_unit_cd",
				"act_cont_fctr",
				"acxfr_qty",
				"acxfr_rsn_cd",
				"acxfr_bd_dpt_cd",
				"data_no",
				"mes_id",
				"intr_rmrks",
				"act_rpt_rmrks",
				"trd_rmrks",
				"inpt_act_sub_char1",
				"inpt_act_sub_char2",
				"inpt_act_sub_char3",
				"add_flg",
				"mes_flg",
				"ext_sys_cd",
				"ext_inpt_act_no",
				"if_auto_reg_flg"
			},
			{
				$inpt_act_no,
				$mfg_act_no,
				$itm_mfg_inst_no,
				$oper_act_no,
				$inpt_schd_no,
				$div_seq,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$ver_no,
				$inpt_loc_cd,
				$inpt_str_ln_cd,
				$quality_typ,
				$stk_insp_typ,
				$stk_id_typ,
				$stk_bp_cd,
				$stk_arrv_bp_cd,
				$gd_cd,
				$inpt_rsn_cd,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$base_unit_inpt_qty,
				$base_unit_loss_qty,
				$base_unit_fxd_loss_qty,
				$base_unit_cd,
				$act_tm,
				$ac_dt,
				$bkf_ctl_flg,
				$base_unit_std_qty,
				$cont_qty,
				$cont_loss_qty,
				$cont_fxd_loss_qty,
				$cont_fctr_unit_cd,
				$act_cont_fctr,
				$acxfr_qty,
				$acxfr_rsn_cd,
				$acxfr_bd_dpt_cd,
				$data_no,
				$mes_id,
				$intr_rmrks,
				$act_rpt_rmrks,
				$trd_rmrks,
				$inpt_act_sub_char1,
				$inpt_act_sub_char2,
				$inpt_act_sub_char3,
				$add_flg,
				$mes_flg,
				$ext_sys_cd,
				$ext_inpt_act_no,
				$if_auto_reg_flg
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
	protected MfgActTblReg_Upd04_DtlInptR_MC_A(ConstMetaList<? extends MfgActTblReg_Upd04_DtlInptR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd04_DtlInptR clone() {
		return (MfgActTblReg_Upd04_DtlInptR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd04_DtlInptR createInstance() {
		return (MfgActTblReg_Upd04_DtlInptR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd04_DtlInptR getValues(String... names) {
		return (MfgActTblReg_Upd04_DtlInptR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 0, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}


	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public MCNumber oper_peg_no() {
		return getConstNumber(offset + 1, $oper_peg_no);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(int value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(long value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(float value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(double value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 2, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 2, $peg_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 3, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 3, $data_crud_typ, value);
	}


	/**
	 * Skip input result entry 投入実績登録スキップ.<p>
	 *
	 */
	public boolean inpt_act_reg_skip_flg() {
		return getConstBoolean(offset + 4, $inpt_act_reg_skip_flg);
	}

	/**
	 * Skip input result entry 投入実績登録スキップ.<p>
	 *
	 */
	public void inpt_act_reg_skip_flg(boolean value) {
		setConstBoolean(offset + 4, $inpt_act_reg_skip_flg, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 5, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 5, $can_ac_dt, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 6, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 6, $mfg_inst_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 7, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 7, $oper_inst_no, value);
	}


	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public String mfg_mtd_typ() {
		return getConstString(offset + 8, $mfg_mtd_typ);
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public void mfg_mtd_typ(String value) {
		setConstString(offset + 8, $mfg_mtd_typ, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 9, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 9, $wg_cd, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 10, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 10, $trd_cd, value);
	}


	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 11, $act_dpt_cd);
	}

	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 11, $act_dpt_cd, value);
	}


	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 12, $act_usr_cd);
	}

	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 12, $act_usr_cd, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 13, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 13, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public String mfg_str_ln_cd() {
		return getConstString(offset + 14, $mfg_str_ln_cd);
	}

	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public void mfg_str_ln_cd(String value) {
		setConstString(offset + 14, $mfg_str_ln_cd, value);
	}


	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 15, $sppl_cd);
	}

	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 15, $sppl_cd, value);
	}


	/**
	 * Input location supplier cd. 投入場所発注先ＣＤ.<p>
	 *
	 */
	public String inpt_loc_sppl_cd() {
		return getConstString(offset + 16, $inpt_loc_sppl_cd);
	}

	/**
	 * Input location supplier cd. 投入場所発注先ＣＤ.<p>
	 *
	 */
	public void inpt_loc_sppl_cd(String value) {
		setConstString(offset + 16, $inpt_loc_sppl_cd, value);
	}


	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public MCNumber itm_mfg_inst_qty() {
		return getConstNumber(offset + 17, $itm_mfg_inst_qty);
	}

	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public void itm_mfg_inst_qty(MCNumber value) {
		setConstNumber(offset + 17, $itm_mfg_inst_qty, value);
	}

	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public void itm_mfg_inst_qty(int value) {
		setConstNumber(offset + 17, $itm_mfg_inst_qty, value);
	}

	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public void itm_mfg_inst_qty(long value) {
		setConstNumber(offset + 17, $itm_mfg_inst_qty, value);
	}

	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public void itm_mfg_inst_qty(float value) {
		setConstNumber(offset + 17, $itm_mfg_inst_qty, value);
	}

	/**
	 * Item mfg. order qty. 品目製造指図数量.<p>
	 *
	 */
	public void itm_mfg_inst_qty(double value) {
		setConstNumber(offset + 17, $itm_mfg_inst_qty, value);
	}


	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public MCNumber mfg_st_qty() {
		return getConstNumber(offset + 18, $mfg_st_qty);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(MCNumber value) {
		setConstNumber(offset + 18, $mfg_st_qty, value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(int value) {
		setConstNumber(offset + 18, $mfg_st_qty, value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(long value) {
		setConstNumber(offset + 18, $mfg_st_qty, value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(float value) {
		setConstNumber(offset + 18, $mfg_st_qty, value);
	}

	/**
	 * Mfg. start qty. 製造着手数量.<p>
	 *
	 */
	public void mfg_st_qty(double value) {
		setConstNumber(offset + 18, $mfg_st_qty, value);
	}


	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 19, $disp_seq);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 19, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 19, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 19, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 19, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 19, $disp_seq, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 20, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 20, $oper_cd, value);
	}


	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return getConstString(offset + 21, $par_itm_cd);
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		setConstString(offset + 21, $par_itm_cd, value);
	}


	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return getConstString(offset + 22, $par_itm_sub1);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		setConstString(offset + 22, $par_itm_sub1, value);
	}


	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return getConstString(offset + 23, $par_itm_sub2);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		setConstString(offset + 23, $par_itm_sub2, value);
	}


	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return getConstString(offset + 24, $par_itm_sub3);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		setConstString(offset + 24, $par_itm_sub3, value);
	}


	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return getConstString(offset + 25, $par_itm_nm);
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		setConstString(offset + 25, $par_itm_nm, value);
	}


	/**
	 * Item mfg. order lot No. 品目製造指図ロットＮＯ.<p>
	 *
	 */
	public String mfg_inst_lot_no() {
		return getConstString(offset + 26, $mfg_inst_lot_no);
	}

	/**
	 * Item mfg. order lot No. 品目製造指図ロットＮＯ.<p>
	 *
	 */
	public void mfg_inst_lot_no(String value) {
		setConstString(offset + 26, $mfg_inst_lot_no, value);
	}


	/**
	 * Item mfg. order sublot No. 品目製造指図サブロットＮＯ.<p>
	 *
	 */
	public String mfg_inst_sublot_no() {
		return getConstString(offset + 27, $mfg_inst_sublot_no);
	}

	/**
	 * Item mfg. order sublot No. 品目製造指図サブロットＮＯ.<p>
	 *
	 */
	public void mfg_inst_sublot_no(String value) {
		setConstString(offset + 27, $mfg_inst_sublot_no, value);
	}


	/**
	 * Item mfg. order SEIBAN No. 1 品目製造指図手配ＮＯ１.<p>
	 *
	 */
	public String mfg_inst_sno1() {
		return getConstString(offset + 28, $mfg_inst_sno1);
	}

	/**
	 * Item mfg. order SEIBAN No. 1 品目製造指図手配ＮＯ１.<p>
	 *
	 */
	public void mfg_inst_sno1(String value) {
		setConstString(offset + 28, $mfg_inst_sno1, value);
	}


	/**
	 * Item mfg. order SEIBAN No. 2 品目製造指図手配ＮＯ２.<p>
	 *
	 */
	public String mfg_inst_sno2() {
		return getConstString(offset + 29, $mfg_inst_sno2);
	}

	/**
	 * Item mfg. order SEIBAN No. 2 品目製造指図手配ＮＯ２.<p>
	 *
	 */
	public void mfg_inst_sno2(String value) {
		setConstString(offset + 29, $mfg_inst_sno2, value);
	}


	/**
	 * Item mfg. order SEIBAN No. 3 品目製造指図手配ＮＯ３.<p>
	 *
	 */
	public String mfg_inst_sno3() {
		return getConstString(offset + 30, $mfg_inst_sno3);
	}

	/**
	 * Item mfg. order SEIBAN No. 3 品目製造指図手配ＮＯ３.<p>
	 *
	 */
	public void mfg_inst_sno3(String value) {
		setConstString(offset + 30, $mfg_inst_sno3, value);
	}


	/**
	 * Item mfg. order SEIBAN No. 4 品目製造指図手配ＮＯ４.<p>
	 *
	 */
	public String mfg_inst_sno4() {
		return getConstString(offset + 31, $mfg_inst_sno4);
	}

	/**
	 * Item mfg. order SEIBAN No. 4 品目製造指図手配ＮＯ４.<p>
	 *
	 */
	public void mfg_inst_sno4(String value) {
		setConstString(offset + 31, $mfg_inst_sno4, value);
	}


	/**
	 * Item mfg. order SEIBAN No. 1 management type 品目製造指図手配ＮＯ１管理区分.<p>
	 *
	 */
	public String mfg_inst_sno1_mng_typ() {
		return getConstString(offset + 32, $mfg_inst_sno1_mng_typ);
	}

	/**
	 * Item mfg. order SEIBAN No. 1 management type 品目製造指図手配ＮＯ１管理区分.<p>
	 *
	 */
	public void mfg_inst_sno1_mng_typ(String value) {
		setConstString(offset + 32, $mfg_inst_sno1_mng_typ, value);
	}


	/**
	 * Item mfg. order SEIBAN No. 2 management type 品目製造指図手配ＮＯ２管理区分.<p>
	 *
	 */
	public String mfg_inst_sno2_mng_typ() {
		return getConstString(offset + 33, $mfg_inst_sno2_mng_typ);
	}

	/**
	 * Item mfg. order SEIBAN No. 2 management type 品目製造指図手配ＮＯ２管理区分.<p>
	 *
	 */
	public void mfg_inst_sno2_mng_typ(String value) {
		setConstString(offset + 33, $mfg_inst_sno2_mng_typ, value);
	}


	/**
	 * Item mfg. order SEIBAN No. 3 management type 品目製造指図手配ＮＯ３管理区分.<p>
	 *
	 */
	public String mfg_inst_sno3_mng_typ() {
		return getConstString(offset + 34, $mfg_inst_sno3_mng_typ);
	}

	/**
	 * Item mfg. order SEIBAN No. 3 management type 品目製造指図手配ＮＯ３管理区分.<p>
	 *
	 */
	public void mfg_inst_sno3_mng_typ(String value) {
		setConstString(offset + 34, $mfg_inst_sno3_mng_typ, value);
	}


	/**
	 * Item mfg. order SEIBAN No. 4 management type 品目製造指図手配ＮＯ４管理区分.<p>
	 *
	 */
	public String mfg_inst_sno4_mng_typ() {
		return getConstString(offset + 35, $mfg_inst_sno4_mng_typ);
	}

	/**
	 * Item mfg. order SEIBAN No. 4 management type 品目製造指図手配ＮＯ４管理区分.<p>
	 *
	 */
	public void mfg_inst_sno4_mng_typ(String value) {
		setConstString(offset + 35, $mfg_inst_sno4_mng_typ, value);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 36, $mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 36, $mfg_inst_unit_typ, value);
	}


	/**
	 * Self supply currency cd. 自給通貨ＣＤ.<p>
	 *
	 */
	public String slf_support_cur_cd() {
		return getConstString(offset + 37, $slf_support_cur_cd);
	}

	/**
	 * Self supply currency cd. 自給通貨ＣＤ.<p>
	 *
	 */
	public void slf_support_cur_cd(String value) {
		setConstString(offset + 37, $slf_support_cur_cd, value);
	}


	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public MCNumber slf_support_upri() {
		return getConstNumber(offset + 38, $slf_support_upri);
	}

	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public void slf_support_upri(MCNumber value) {
		setConstNumber(offset + 38, $slf_support_upri, value);
	}

	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public void slf_support_upri(int value) {
		setConstNumber(offset + 38, $slf_support_upri, value);
	}

	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public void slf_support_upri(long value) {
		setConstNumber(offset + 38, $slf_support_upri, value);
	}

	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public void slf_support_upri(float value) {
		setConstNumber(offset + 38, $slf_support_upri, value);
	}

	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public void slf_support_upri(double value) {
		setConstNumber(offset + 38, $slf_support_upri, value);
	}


	/**
	 * Self supply tax cd. 自給税ＣＤ.<p>
	 *
	 */
	public String slf_support_tax_cd() {
		return getConstString(offset + 39, $slf_support_tax_cd);
	}

	/**
	 * Self supply tax cd. 自給税ＣＤ.<p>
	 *
	 */
	public void slf_support_tax_cd(String value) {
		setConstString(offset + 39, $slf_support_tax_cd, value);
	}


	/**
	 * Self supply exchange rate cd. 自給為替レートＣＤ.<p>
	 *
	 */
	public String slf_support_xrate_cd() {
		return getConstString(offset + 40, $slf_support_xrate_cd);
	}

	/**
	 * Self supply exchange rate cd. 自給為替レートＣＤ.<p>
	 *
	 */
	public void slf_support_xrate_cd(String value) {
		setConstString(offset + 40, $slf_support_xrate_cd, value);
	}


	/**
	 * Self supply exchange rate 自給為替レート.<p>
	 *
	 */
	public MCNumber slf_support_xrate() {
		return getConstNumber(offset + 41, $slf_support_xrate);
	}

	/**
	 * Self supply exchange rate 自給為替レート.<p>
	 *
	 */
	public void slf_support_xrate(MCNumber value) {
		setConstNumber(offset + 41, $slf_support_xrate, value);
	}

	/**
	 * Self supply exchange rate 自給為替レート.<p>
	 *
	 */
	public void slf_support_xrate(int value) {
		setConstNumber(offset + 41, $slf_support_xrate, value);
	}

	/**
	 * Self supply exchange rate 自給為替レート.<p>
	 *
	 */
	public void slf_support_xrate(long value) {
		setConstNumber(offset + 41, $slf_support_xrate, value);
	}

	/**
	 * Self supply exchange rate 自給為替レート.<p>
	 *
	 */
	public void slf_support_xrate(float value) {
		setConstNumber(offset + 41, $slf_support_xrate, value);
	}

	/**
	 * Self supply exchange rate 自給為替レート.<p>
	 *
	 */
	public void slf_support_xrate(double value) {
		setConstNumber(offset + 41, $slf_support_xrate, value);
	}


	/**
	 * VMI temporary unit price ＶＭＩ仮単価.<p>
	 *
	 */
	public boolean vmi_interim_flg() {
		return getConstBoolean(offset + 42, $vmi_interim_flg);
	}

	/**
	 * VMI temporary unit price ＶＭＩ仮単価.<p>
	 *
	 */
	public void vmi_interim_flg(boolean value) {
		setConstBoolean(offset + 42, $vmi_interim_flg, value);
	}


	/**
	 * VMI unit price ＶＭＩ単価.<p>
	 *
	 */
	public MCNumber vmi_upri() {
		return getConstNumber(offset + 43, $vmi_upri);
	}

	/**
	 * VMI unit price ＶＭＩ単価.<p>
	 *
	 */
	public void vmi_upri(MCNumber value) {
		setConstNumber(offset + 43, $vmi_upri, value);
	}

	/**
	 * VMI unit price ＶＭＩ単価.<p>
	 *
	 */
	public void vmi_upri(int value) {
		setConstNumber(offset + 43, $vmi_upri, value);
	}

	/**
	 * VMI unit price ＶＭＩ単価.<p>
	 *
	 */
	public void vmi_upri(long value) {
		setConstNumber(offset + 43, $vmi_upri, value);
	}

	/**
	 * VMI unit price ＶＭＩ単価.<p>
	 *
	 */
	public void vmi_upri(float value) {
		setConstNumber(offset + 43, $vmi_upri, value);
	}

	/**
	 * VMI unit price ＶＭＩ単価.<p>
	 *
	 */
	public void vmi_upri(double value) {
		setConstNumber(offset + 43, $vmi_upri, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 44, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 44, $slo_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 45, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 45, $po_no, value);
	}


	/**
	 * Supply pegging No. 支給紐付けＮＯ.<p>
	 *
	 */
	public MCNumber prov_peg_no() {
		return getConstNumber(offset + 46, $prov_peg_no);
	}

	/**
	 * Supply pegging No. 支給紐付けＮＯ.<p>
	 *
	 */
	public void prov_peg_no(MCNumber value) {
		setConstNumber(offset + 46, $prov_peg_no, value);
	}

	/**
	 * Supply pegging No. 支給紐付けＮＯ.<p>
	 *
	 */
	public void prov_peg_no(int value) {
		setConstNumber(offset + 46, $prov_peg_no, value);
	}

	/**
	 * Supply pegging No. 支給紐付けＮＯ.<p>
	 *
	 */
	public void prov_peg_no(long value) {
		setConstNumber(offset + 46, $prov_peg_no, value);
	}

	/**
	 * Supply pegging No. 支給紐付けＮＯ.<p>
	 *
	 */
	public void prov_peg_no(float value) {
		setConstNumber(offset + 46, $prov_peg_no, value);
	}

	/**
	 * Supply pegging No. 支給紐付けＮＯ.<p>
	 *
	 */
	public void prov_peg_no(double value) {
		setConstNumber(offset + 46, $prov_peg_no, value);
	}


	/**
	 * Supply return pegging No. 支給返品紐付けＮＯ.<p>
	 *
	 */
	public MCNumber prov_rtn_peg_no() {
		return getConstNumber(offset + 47, $prov_rtn_peg_no);
	}

	/**
	 * Supply return pegging No. 支給返品紐付けＮＯ.<p>
	 *
	 */
	public void prov_rtn_peg_no(MCNumber value) {
		setConstNumber(offset + 47, $prov_rtn_peg_no, value);
	}

	/**
	 * Supply return pegging No. 支給返品紐付けＮＯ.<p>
	 *
	 */
	public void prov_rtn_peg_no(int value) {
		setConstNumber(offset + 47, $prov_rtn_peg_no, value);
	}

	/**
	 * Supply return pegging No. 支給返品紐付けＮＯ.<p>
	 *
	 */
	public void prov_rtn_peg_no(long value) {
		setConstNumber(offset + 47, $prov_rtn_peg_no, value);
	}

	/**
	 * Supply return pegging No. 支給返品紐付けＮＯ.<p>
	 *
	 */
	public void prov_rtn_peg_no(float value) {
		setConstNumber(offset + 47, $prov_rtn_peg_no, value);
	}

	/**
	 * Supply return pegging No. 支給返品紐付けＮＯ.<p>
	 *
	 */
	public void prov_rtn_peg_no(double value) {
		setConstNumber(offset + 47, $prov_rtn_peg_no, value);
	}


	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 48, $prov_basis_typ);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 48, $prov_basis_typ, value);
	}


	/**
	 * Current supply 今回支給.<p>
	 *
	 */
	public boolean prov_flg() {
		return getConstBoolean(offset + 49, $prov_flg);
	}

	/**
	 * Current supply 今回支給.<p>
	 *
	 */
	public void prov_flg(boolean value) {
		setConstBoolean(offset + 49, $prov_flg, value);
	}


	/**
	 * Current supply return 今回支給返品.<p>
	 *
	 */
	public boolean prov_rtn_flg() {
		return getConstBoolean(offset + 50, $prov_rtn_flg);
	}

	/**
	 * Current supply return 今回支給返品.<p>
	 *
	 */
	public void prov_rtn_flg(boolean value) {
		setConstBoolean(offset + 50, $prov_rtn_flg, value);
	}


	/**
	 * Current VMI purchase 今回ＶＭＩ仕入.<p>
	 *
	 */
	public boolean vmi_purc_flg() {
		return getConstBoolean(offset + 51, $vmi_purc_flg);
	}

	/**
	 * Current VMI purchase 今回ＶＭＩ仕入.<p>
	 *
	 */
	public void vmi_purc_flg(boolean value) {
		setConstBoolean(offset + 51, $vmi_purc_flg, value);
	}


	/**
	 * Last supply 前回支給.<p>
	 *
	 */
	public boolean old_prov_flg() {
		return getConstBoolean(offset + 52, $old_prov_flg);
	}

	/**
	 * Last supply 前回支給.<p>
	 *
	 */
	public void old_prov_flg(boolean value) {
		setConstBoolean(offset + 52, $old_prov_flg, value);
	}


	/**
	 * Last supply return 前回支給返品.<p>
	 *
	 */
	public boolean old_prov_rtn_flg() {
		return getConstBoolean(offset + 53, $old_prov_rtn_flg);
	}

	/**
	 * Last supply return 前回支給返品.<p>
	 *
	 */
	public void old_prov_rtn_flg(boolean value) {
		setConstBoolean(offset + 53, $old_prov_rtn_flg, value);
	}


	/**
	 * Last VMI purchase 前回ＶＭＩ仕入.<p>
	 *
	 */
	public boolean old_vmi_purc_flg() {
		return getConstBoolean(offset + 54, $old_vmi_purc_flg);
	}

	/**
	 * Last VMI purchase 前回ＶＭＩ仕入.<p>
	 *
	 */
	public void old_vmi_purc_flg(boolean value) {
		setConstBoolean(offset + 54, $old_vmi_purc_flg, value);
	}


	/**
	 * Inventory arriving point cd. after supply 支給後在庫着荷先ＣＤ.<p>
	 *
	 */
	public String prov_stk_arrv_bp_cd() {
		return getConstString(offset + 55, $prov_stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. after supply 支給後在庫着荷先ＣＤ.<p>
	 *
	 */
	public void prov_stk_arrv_bp_cd(String value) {
		setConstString(offset + 55, $prov_stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory identification type after supply 支給後在庫識別区分.<p>
	 *
	 */
	public String prov_stk_id_typ() {
		return getConstString(offset + 56, $prov_stk_id_typ);
	}

	/**
	 * Inventory identification type after supply 支給後在庫識別区分.<p>
	 *
	 */
	public void prov_stk_id_typ(String value) {
		setConstString(offset + 56, $prov_stk_id_typ, value);
	}


	/**
	 * Inventory BP cd. after supply 支給後在庫取引先ＣＤ.<p>
	 *
	 */
	public String prov_stk_bp_cd() {
		return getConstString(offset + 57, $prov_stk_bp_cd);
	}

	/**
	 * Inventory BP cd. after supply 支給後在庫取引先ＣＤ.<p>
	 *
	 */
	public void prov_stk_bp_cd(String value) {
		setConstString(offset + 57, $prov_stk_bp_cd, value);
	}


	/**
	 * Inventory arriving point cd. after supply returned 支給返品後在庫着荷先ＣＤ.<p>
	 *
	 */
	public String prov_rtn_stk_arrv_bp_cd() {
		return getConstString(offset + 58, $prov_rtn_stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. after supply returned 支給返品後在庫着荷先ＣＤ.<p>
	 *
	 */
	public void prov_rtn_stk_arrv_bp_cd(String value) {
		setConstString(offset + 58, $prov_rtn_stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory identification type after supply returned 支給返品後在庫識別区分.<p>
	 *
	 */
	public String prov_rtn_stk_id_typ() {
		return getConstString(offset + 59, $prov_rtn_stk_id_typ);
	}

	/**
	 * Inventory identification type after supply returned 支給返品後在庫識別区分.<p>
	 *
	 */
	public void prov_rtn_stk_id_typ(String value) {
		setConstString(offset + 59, $prov_rtn_stk_id_typ, value);
	}


	/**
	 * Inventory BP cd. after supply returned 支給返品後在庫取引先ＣＤ.<p>
	 *
	 */
	public String prov_rtn_stk_bp_cd() {
		return getConstString(offset + 60, $prov_rtn_stk_bp_cd);
	}

	/**
	 * Inventory BP cd. after supply returned 支給返品後在庫取引先ＣＤ.<p>
	 *
	 */
	public void prov_rtn_stk_bp_cd(String value) {
		setConstString(offset + 60, $prov_rtn_stk_bp_cd, value);
	}


	/**
	 * Base unit input/loss total qty. 基準単位投入・ロス合計数量.<p>
	 *
	 */
	public MCNumber base_unit_sum_inpt_loss_qty() {
		return getConstNumber(offset + 61, $base_unit_sum_inpt_loss_qty);
	}

	/**
	 * Base unit input/loss total qty. 基準単位投入・ロス合計数量.<p>
	 *
	 */
	public void base_unit_sum_inpt_loss_qty(MCNumber value) {
		setConstNumber(offset + 61, $base_unit_sum_inpt_loss_qty, value);
	}

	/**
	 * Base unit input/loss total qty. 基準単位投入・ロス合計数量.<p>
	 *
	 */
	public void base_unit_sum_inpt_loss_qty(int value) {
		setConstNumber(offset + 61, $base_unit_sum_inpt_loss_qty, value);
	}

	/**
	 * Base unit input/loss total qty. 基準単位投入・ロス合計数量.<p>
	 *
	 */
	public void base_unit_sum_inpt_loss_qty(long value) {
		setConstNumber(offset + 61, $base_unit_sum_inpt_loss_qty, value);
	}

	/**
	 * Base unit input/loss total qty. 基準単位投入・ロス合計数量.<p>
	 *
	 */
	public void base_unit_sum_inpt_loss_qty(float value) {
		setConstNumber(offset + 61, $base_unit_sum_inpt_loss_qty, value);
	}

	/**
	 * Base unit input/loss total qty. 基準単位投入・ロス合計数量.<p>
	 *
	 */
	public void base_unit_sum_inpt_loss_qty(double value) {
		setConstNumber(offset + 61, $base_unit_sum_inpt_loss_qty, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 62, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 62, $itm_nm, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 63, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 63, $stk_mng_typ, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 64, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 64, $sundry_itm_flg, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 65, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 65, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 66, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 66, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 67, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 67, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 68, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 68, $sno4_mng_typ, value);
	}


	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 69, $sno1_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 69, $sno1_null_flg, value);
	}


	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 70, $sno2_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 70, $sno2_null_flg, value);
	}


	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 71, $sno3_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 71, $sno3_null_flg, value);
	}


	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 72, $sno4_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 72, $sno4_null_flg, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 73, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 73, $cont_fctr_flg, value);
	}


	/**
	 * Active ingredient total 有効成分合計.<p>
	 *
	 */
	public MCNumber cont_sum_qty() {
		return getConstNumber(offset + 74, $cont_sum_qty);
	}

	/**
	 * Active ingredient total 有効成分合計.<p>
	 *
	 */
	public void cont_sum_qty(MCNumber value) {
		setConstNumber(offset + 74, $cont_sum_qty, value);
	}

	/**
	 * Active ingredient total 有効成分合計.<p>
	 *
	 */
	public void cont_sum_qty(int value) {
		setConstNumber(offset + 74, $cont_sum_qty, value);
	}

	/**
	 * Active ingredient total 有効成分合計.<p>
	 *
	 */
	public void cont_sum_qty(long value) {
		setConstNumber(offset + 74, $cont_sum_qty, value);
	}

	/**
	 * Active ingredient total 有効成分合計.<p>
	 *
	 */
	public void cont_sum_qty(float value) {
		setConstNumber(offset + 74, $cont_sum_qty, value);
	}

	/**
	 * Active ingredient total 有効成分合計.<p>
	 *
	 */
	public void cont_sum_qty(double value) {
		setConstNumber(offset + 74, $cont_sum_qty, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 75, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 75, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 75, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 75, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 75, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 75, $cont_fctr_dec_place, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 76, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 76, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 77, $std_cont_fctr);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 77, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 77, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 77, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 77, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 77, $std_cont_fctr, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 78, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 78, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 78, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 78, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 78, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 78, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public String base_unit_conv_rnd_typ() {
		return getConstString(offset + 79, $base_unit_conv_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public void base_unit_conv_rnd_typ(String value) {
		setConstString(offset + 79, $base_unit_conv_rnd_typ, value);
	}


	/**
	 * Loss result pegging No. ロス実績用紐付けＮＯ.<p>
	 *
	 */
	public MCNumber loss_peg_no() {
		return getConstNumber(offset + 80, $loss_peg_no);
	}

	/**
	 * Loss result pegging No. ロス実績用紐付けＮＯ.<p>
	 *
	 */
	public void loss_peg_no(MCNumber value) {
		setConstNumber(offset + 80, $loss_peg_no, value);
	}

	/**
	 * Loss result pegging No. ロス実績用紐付けＮＯ.<p>
	 *
	 */
	public void loss_peg_no(int value) {
		setConstNumber(offset + 80, $loss_peg_no, value);
	}

	/**
	 * Loss result pegging No. ロス実績用紐付けＮＯ.<p>
	 *
	 */
	public void loss_peg_no(long value) {
		setConstNumber(offset + 80, $loss_peg_no, value);
	}

	/**
	 * Loss result pegging No. ロス実績用紐付けＮＯ.<p>
	 *
	 */
	public void loss_peg_no(float value) {
		setConstNumber(offset + 80, $loss_peg_no, value);
	}

	/**
	 * Loss result pegging No. ロス実績用紐付けＮＯ.<p>
	 *
	 */
	public void loss_peg_no(double value) {
		setConstNumber(offset + 80, $loss_peg_no, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 81, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 81, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 82, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 82, $sublot_mng_typ, value);
	}


	/**
	 * Lot mixed ロット混在.<p>
	 *
	 */
	public boolean lot_mix_flg() {
		return getConstBoolean(offset + 83, $lot_mix_flg);
	}

	/**
	 * Lot mixed ロット混在.<p>
	 *
	 */
	public void lot_mix_flg(boolean value) {
		setConstBoolean(offset + 83, $lot_mix_flg, value);
	}


	/**
	 * Sublots mixed サブロット混在.<p>
	 *
	 */
	public boolean sublot_mix_flg() {
		return getConstBoolean(offset + 84, $sublot_mix_flg);
	}

	/**
	 * Sublots mixed サブロット混在.<p>
	 *
	 */
	public void sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 84, $sublot_mix_flg, value);
	}


	/**
	 * Allocation 引当.<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 85, $alloc_flg);
	}

	/**
	 * Allocation 引当.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 85, $alloc_flg, value);
	}


	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public String alloc_ctl_typ() {
		return getConstString(offset + 86, $alloc_ctl_typ);
	}

	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public void alloc_ctl_typ(String value) {
		setConstString(offset + 86, $alloc_ctl_typ, value);
	}


	/**
	 * Bulk execution 一括実行.<p>
	 *
	 */
	public boolean lst_reg_flg() {
		return getConstBoolean(offset + 87, $lst_reg_flg);
	}

	/**
	 * Bulk execution 一括実行.<p>
	 *
	 */
	public void lst_reg_flg(boolean value) {
		setConstBoolean(offset + 87, $lst_reg_flg, value);
	}


	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public boolean is_src_batch_flg() {
		return getConstBoolean(offset + 88, $is_src_batch_flg);
	}

	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public void is_src_batch_flg(boolean value) {
		setConstBoolean(offset + 88, $is_src_batch_flg, value);
	}


	public boolean is_src_md_mfg_srv_flg() {
		return getConstBoolean(offset + 89, $is_src_md_mfg_srv_flg);
	}

	public void is_src_md_mfg_srv_flg(boolean value) {
		setConstBoolean(offset + 89, $is_src_md_mfg_srv_flg, value);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 90, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 90, $alt_grp_cd, value);
	}


	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public MCNumber alt_grp_seq() {
		return getConstNumber(offset + 91, $alt_grp_seq);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(MCNumber value) {
		setConstNumber(offset + 91, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(int value) {
		setConstNumber(offset + 91, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(long value) {
		setConstNumber(offset + 91, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(float value) {
		setConstNumber(offset + 91, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(double value) {
		setConstNumber(offset + 91, $alt_grp_seq, value);
	}


	/**
	 * Specify alternative item 代替品目指定.<p>
	 *
	 */
	public boolean alt_itm_fix_flg() {
		return getConstBoolean(offset + 92, $alt_itm_fix_flg);
	}

	/**
	 * Specify alternative item 代替品目指定.<p>
	 *
	 */
	public void alt_itm_fix_flg(boolean value) {
		setConstBoolean(offset + 92, $alt_itm_fix_flg, value);
	}


	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public String alt_itm_typ() {
		return getConstString(offset + 93, $alt_itm_typ);
	}

	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public void alt_itm_typ(String value) {
		setConstString(offset + 93, $alt_itm_typ, value);
	}


	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public MCNumber alt_alloc_prio() {
		return getConstNumber(offset + 94, $alt_alloc_prio);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(MCNumber value) {
		setConstNumber(offset + 94, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(int value) {
		setConstNumber(offset + 94, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(long value) {
		setConstNumber(offset + 94, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(float value) {
		setConstNumber(offset + 94, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(double value) {
		setConstNumber(offset + 94, $alt_alloc_prio, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 95, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 95, $vld_dt, value);
	}


	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 96, $first_gr_dt);
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 96, $first_gr_dt, value);
	}


	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public String lot_seq() {
		return getConstString(offset + 97, $lot_seq);
	}

	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public void lot_seq(String value) {
		setConstString(offset + 97, $lot_seq, value);
	}


	public boolean not_pd_chk_flg() {
		return getConstBoolean(offset + 98, $not_pd_chk_flg);
	}

	public void not_pd_chk_flg(boolean value) {
		setConstBoolean(offset + 98, $not_pd_chk_flg, value);
	}


	public boolean is_only_abort_flg() {
		return getConstBoolean(offset + 99, $is_only_abort_flg);
	}

	public void is_only_abort_flg(boolean value) {
		setConstBoolean(offset + 99, $is_only_abort_flg, value);
	}


	public mcframe.serverMS.dbc.MST_INPT_ACT_R inpt_act(){
		return (mcframe.serverMS.dbc.MST_INPT_ACT_R) getConstInnerRow(offset + 100, $inpt_act);
	}
	
	public void inpt_act(mcframe.serverMS.dbc.MST_INPT_ACT_R row){
		setConstInnerRow(offset + 100, $inpt_act, row);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($inpt_loc_sppl_cd.equalsIgnoreCase(name)) {
			return inpt_loc_sppl_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
		}
		if ($mfg_inst_lot_no.equalsIgnoreCase(name)) {
			return mfg_inst_lot_no();
		}
		if ($mfg_inst_sublot_no.equalsIgnoreCase(name)) {
			return mfg_inst_sublot_no();
		}
		if ($mfg_inst_sno1.equalsIgnoreCase(name)) {
			return mfg_inst_sno1();
		}
		if ($mfg_inst_sno2.equalsIgnoreCase(name)) {
			return mfg_inst_sno2();
		}
		if ($mfg_inst_sno3.equalsIgnoreCase(name)) {
			return mfg_inst_sno3();
		}
		if ($mfg_inst_sno4.equalsIgnoreCase(name)) {
			return mfg_inst_sno4();
		}
		if ($mfg_inst_sno1_mng_typ.equalsIgnoreCase(name)) {
			return mfg_inst_sno1_mng_typ();
		}
		if ($mfg_inst_sno2_mng_typ.equalsIgnoreCase(name)) {
			return mfg_inst_sno2_mng_typ();
		}
		if ($mfg_inst_sno3_mng_typ.equalsIgnoreCase(name)) {
			return mfg_inst_sno3_mng_typ();
		}
		if ($mfg_inst_sno4_mng_typ.equalsIgnoreCase(name)) {
			return mfg_inst_sno4_mng_typ();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($slf_support_cur_cd.equalsIgnoreCase(name)) {
			return slf_support_cur_cd();
		}
		if ($slf_support_tax_cd.equalsIgnoreCase(name)) {
			return slf_support_tax_cd();
		}
		if ($slf_support_xrate_cd.equalsIgnoreCase(name)) {
			return slf_support_xrate_cd();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return prov_stk_arrv_bp_cd();
		}
		if ($prov_stk_id_typ.equalsIgnoreCase(name)) {
			return prov_stk_id_typ();
		}
		if ($prov_stk_bp_cd.equalsIgnoreCase(name)) {
			return prov_stk_bp_cd();
		}
		if ($prov_rtn_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return prov_rtn_stk_arrv_bp_cd();
		}
		if ($prov_rtn_stk_id_typ.equalsIgnoreCase(name)) {
			return prov_rtn_stk_id_typ();
		}
		if ($prov_rtn_stk_bp_cd.equalsIgnoreCase(name)) {
			return prov_rtn_stk_bp_cd();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_conv_rnd_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			return alloc_ctl_typ();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			return itm_mfg_inst_qty();
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			return mfg_st_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($slf_support_upri.equalsIgnoreCase(name)) {
			return slf_support_upri();
		}
		if ($slf_support_xrate.equalsIgnoreCase(name)) {
			return slf_support_xrate();
		}
		if ($vmi_upri.equalsIgnoreCase(name)) {
			return vmi_upri();
		}
		if ($prov_peg_no.equalsIgnoreCase(name)) {
			return prov_peg_no();
		}
		if ($prov_rtn_peg_no.equalsIgnoreCase(name)) {
			return prov_rtn_peg_no();
		}
		if ($base_unit_sum_inpt_loss_qty.equalsIgnoreCase(name)) {
			return base_unit_sum_inpt_loss_qty();
		}
		if ($cont_sum_qty.equalsIgnoreCase(name)) {
			return cont_sum_qty();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			return loss_peg_no();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($inpt_act_reg_skip_flg.equalsIgnoreCase(name)) {
			return inpt_act_reg_skip_flg();
		}
		if ($vmi_interim_flg.equalsIgnoreCase(name)) {
			return vmi_interim_flg();
		}
		if ($prov_flg.equalsIgnoreCase(name)) {
			return prov_flg();
		}
		if ($prov_rtn_flg.equalsIgnoreCase(name)) {
			return prov_rtn_flg();
		}
		if ($vmi_purc_flg.equalsIgnoreCase(name)) {
			return vmi_purc_flg();
		}
		if ($old_prov_flg.equalsIgnoreCase(name)) {
			return old_prov_flg();
		}
		if ($old_prov_rtn_flg.equalsIgnoreCase(name)) {
			return old_prov_rtn_flg();
		}
		if ($old_vmi_purc_flg.equalsIgnoreCase(name)) {
			return old_vmi_purc_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
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
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			return lot_mix_flg();
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			return sublot_mix_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			return lst_reg_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		if ($is_src_md_mfg_srv_flg.equalsIgnoreCase(name)) {
			return is_src_md_mfg_srv_flg();
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			return alt_itm_fix_flg();
		}
		if ($not_pd_chk_flg.equalsIgnoreCase(name)) {
			return not_pd_chk_flg();
		}
		if ($is_only_abort_flg.equalsIgnoreCase(name)) {
			return is_only_abort_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($inpt_loc_sppl_cd.equalsIgnoreCase(name)) {
			return inpt_loc_sppl_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
		}
		if ($mfg_inst_lot_no.equalsIgnoreCase(name)) {
			return mfg_inst_lot_no();
		}
		if ($mfg_inst_sublot_no.equalsIgnoreCase(name)) {
			return mfg_inst_sublot_no();
		}
		if ($mfg_inst_sno1.equalsIgnoreCase(name)) {
			return mfg_inst_sno1();
		}
		if ($mfg_inst_sno2.equalsIgnoreCase(name)) {
			return mfg_inst_sno2();
		}
		if ($mfg_inst_sno3.equalsIgnoreCase(name)) {
			return mfg_inst_sno3();
		}
		if ($mfg_inst_sno4.equalsIgnoreCase(name)) {
			return mfg_inst_sno4();
		}
		if ($mfg_inst_sno1_mng_typ.equalsIgnoreCase(name)) {
			return mfg_inst_sno1_mng_typ();
		}
		if ($mfg_inst_sno2_mng_typ.equalsIgnoreCase(name)) {
			return mfg_inst_sno2_mng_typ();
		}
		if ($mfg_inst_sno3_mng_typ.equalsIgnoreCase(name)) {
			return mfg_inst_sno3_mng_typ();
		}
		if ($mfg_inst_sno4_mng_typ.equalsIgnoreCase(name)) {
			return mfg_inst_sno4_mng_typ();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($slf_support_cur_cd.equalsIgnoreCase(name)) {
			return slf_support_cur_cd();
		}
		if ($slf_support_tax_cd.equalsIgnoreCase(name)) {
			return slf_support_tax_cd();
		}
		if ($slf_support_xrate_cd.equalsIgnoreCase(name)) {
			return slf_support_xrate_cd();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return prov_stk_arrv_bp_cd();
		}
		if ($prov_stk_id_typ.equalsIgnoreCase(name)) {
			return prov_stk_id_typ();
		}
		if ($prov_stk_bp_cd.equalsIgnoreCase(name)) {
			return prov_stk_bp_cd();
		}
		if ($prov_rtn_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return prov_rtn_stk_arrv_bp_cd();
		}
		if ($prov_rtn_stk_id_typ.equalsIgnoreCase(name)) {
			return prov_rtn_stk_id_typ();
		}
		if ($prov_rtn_stk_bp_cd.equalsIgnoreCase(name)) {
			return prov_rtn_stk_bp_cd();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_conv_rnd_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			return alloc_ctl_typ();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			return itm_mfg_inst_qty();
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			return mfg_st_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($slf_support_upri.equalsIgnoreCase(name)) {
			return slf_support_upri();
		}
		if ($slf_support_xrate.equalsIgnoreCase(name)) {
			return slf_support_xrate();
		}
		if ($vmi_upri.equalsIgnoreCase(name)) {
			return vmi_upri();
		}
		if ($prov_peg_no.equalsIgnoreCase(name)) {
			return prov_peg_no();
		}
		if ($prov_rtn_peg_no.equalsIgnoreCase(name)) {
			return prov_rtn_peg_no();
		}
		if ($base_unit_sum_inpt_loss_qty.equalsIgnoreCase(name)) {
			return base_unit_sum_inpt_loss_qty();
		}
		if ($cont_sum_qty.equalsIgnoreCase(name)) {
			return cont_sum_qty();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			return loss_peg_no();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($inpt_act_reg_skip_flg.equalsIgnoreCase(name)) {
			return inpt_act_reg_skip_flg();
		}
		if ($vmi_interim_flg.equalsIgnoreCase(name)) {
			return vmi_interim_flg();
		}
		if ($prov_flg.equalsIgnoreCase(name)) {
			return prov_flg();
		}
		if ($prov_rtn_flg.equalsIgnoreCase(name)) {
			return prov_rtn_flg();
		}
		if ($vmi_purc_flg.equalsIgnoreCase(name)) {
			return vmi_purc_flg();
		}
		if ($old_prov_flg.equalsIgnoreCase(name)) {
			return old_prov_flg();
		}
		if ($old_prov_rtn_flg.equalsIgnoreCase(name)) {
			return old_prov_rtn_flg();
		}
		if ($old_vmi_purc_flg.equalsIgnoreCase(name)) {
			return old_vmi_purc_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
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
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			return lot_mix_flg();
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			return sublot_mix_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			return lst_reg_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		if ($is_src_md_mfg_srv_flg.equalsIgnoreCase(name)) {
			return is_src_md_mfg_srv_flg();
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			return alt_itm_fix_flg();
		}
		if ($not_pd_chk_flg.equalsIgnoreCase(name)) {
			return not_pd_chk_flg();
		}
		if ($is_only_abort_flg.equalsIgnoreCase(name)) {
			return is_only_abort_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
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
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_str_ln_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($inpt_loc_sppl_cd.equalsIgnoreCase(name)) {
			inpt_loc_sppl_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
			return;
		}
		if ($mfg_inst_lot_no.equalsIgnoreCase(name)) {
			mfg_inst_lot_no(value);
			return;
		}
		if ($mfg_inst_sublot_no.equalsIgnoreCase(name)) {
			mfg_inst_sublot_no(value);
			return;
		}
		if ($mfg_inst_sno1.equalsIgnoreCase(name)) {
			mfg_inst_sno1(value);
			return;
		}
		if ($mfg_inst_sno2.equalsIgnoreCase(name)) {
			mfg_inst_sno2(value);
			return;
		}
		if ($mfg_inst_sno3.equalsIgnoreCase(name)) {
			mfg_inst_sno3(value);
			return;
		}
		if ($mfg_inst_sno4.equalsIgnoreCase(name)) {
			mfg_inst_sno4(value);
			return;
		}
		if ($mfg_inst_sno1_mng_typ.equalsIgnoreCase(name)) {
			mfg_inst_sno1_mng_typ(value);
			return;
		}
		if ($mfg_inst_sno2_mng_typ.equalsIgnoreCase(name)) {
			mfg_inst_sno2_mng_typ(value);
			return;
		}
		if ($mfg_inst_sno3_mng_typ.equalsIgnoreCase(name)) {
			mfg_inst_sno3_mng_typ(value);
			return;
		}
		if ($mfg_inst_sno4_mng_typ.equalsIgnoreCase(name)) {
			mfg_inst_sno4_mng_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($slf_support_cur_cd.equalsIgnoreCase(name)) {
			slf_support_cur_cd(value);
			return;
		}
		if ($slf_support_tax_cd.equalsIgnoreCase(name)) {
			slf_support_tax_cd(value);
			return;
		}
		if ($slf_support_xrate_cd.equalsIgnoreCase(name)) {
			slf_support_xrate_cd(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			prov_stk_arrv_bp_cd(value);
			return;
		}
		if ($prov_stk_id_typ.equalsIgnoreCase(name)) {
			prov_stk_id_typ(value);
			return;
		}
		if ($prov_stk_bp_cd.equalsIgnoreCase(name)) {
			prov_stk_bp_cd(value);
			return;
		}
		if ($prov_rtn_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			prov_rtn_stk_arrv_bp_cd(value);
			return;
		}
		if ($prov_rtn_stk_id_typ.equalsIgnoreCase(name)) {
			prov_rtn_stk_id_typ(value);
			return;
		}
		if ($prov_rtn_stk_bp_cd.equalsIgnoreCase(name)) {
			prov_rtn_stk_bp_cd(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_conv_rnd_typ(value);
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
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			alloc_ctl_typ(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
			return;
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($slf_support_upri.equalsIgnoreCase(name)) {
			slf_support_upri(value);
			return;
		}
		if ($slf_support_xrate.equalsIgnoreCase(name)) {
			slf_support_xrate(value);
			return;
		}
		if ($vmi_upri.equalsIgnoreCase(name)) {
			vmi_upri(value);
			return;
		}
		if ($prov_peg_no.equalsIgnoreCase(name)) {
			prov_peg_no(value);
			return;
		}
		if ($prov_rtn_peg_no.equalsIgnoreCase(name)) {
			prov_rtn_peg_no(value);
			return;
		}
		if ($base_unit_sum_inpt_loss_qty.equalsIgnoreCase(name)) {
			base_unit_sum_inpt_loss_qty(value);
			return;
		}
		if ($cont_sum_qty.equalsIgnoreCase(name)) {
			cont_sum_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			loss_peg_no(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($slf_support_upri.equalsIgnoreCase(name)) {
			slf_support_upri(value);
			return;
		}
		if ($slf_support_xrate.equalsIgnoreCase(name)) {
			slf_support_xrate(value);
			return;
		}
		if ($vmi_upri.equalsIgnoreCase(name)) {
			vmi_upri(value);
			return;
		}
		if ($prov_peg_no.equalsIgnoreCase(name)) {
			prov_peg_no(value);
			return;
		}
		if ($prov_rtn_peg_no.equalsIgnoreCase(name)) {
			prov_rtn_peg_no(value);
			return;
		}
		if ($base_unit_sum_inpt_loss_qty.equalsIgnoreCase(name)) {
			base_unit_sum_inpt_loss_qty(value);
			return;
		}
		if ($cont_sum_qty.equalsIgnoreCase(name)) {
			cont_sum_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			loss_peg_no(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($slf_support_upri.equalsIgnoreCase(name)) {
			slf_support_upri(value);
			return;
		}
		if ($slf_support_xrate.equalsIgnoreCase(name)) {
			slf_support_xrate(value);
			return;
		}
		if ($vmi_upri.equalsIgnoreCase(name)) {
			vmi_upri(value);
			return;
		}
		if ($prov_peg_no.equalsIgnoreCase(name)) {
			prov_peg_no(value);
			return;
		}
		if ($prov_rtn_peg_no.equalsIgnoreCase(name)) {
			prov_rtn_peg_no(value);
			return;
		}
		if ($base_unit_sum_inpt_loss_qty.equalsIgnoreCase(name)) {
			base_unit_sum_inpt_loss_qty(value);
			return;
		}
		if ($cont_sum_qty.equalsIgnoreCase(name)) {
			cont_sum_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			loss_peg_no(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($slf_support_upri.equalsIgnoreCase(name)) {
			slf_support_upri(value);
			return;
		}
		if ($slf_support_xrate.equalsIgnoreCase(name)) {
			slf_support_xrate(value);
			return;
		}
		if ($vmi_upri.equalsIgnoreCase(name)) {
			vmi_upri(value);
			return;
		}
		if ($prov_peg_no.equalsIgnoreCase(name)) {
			prov_peg_no(value);
			return;
		}
		if ($prov_rtn_peg_no.equalsIgnoreCase(name)) {
			prov_rtn_peg_no(value);
			return;
		}
		if ($base_unit_sum_inpt_loss_qty.equalsIgnoreCase(name)) {
			base_unit_sum_inpt_loss_qty(value);
			return;
		}
		if ($cont_sum_qty.equalsIgnoreCase(name)) {
			cont_sum_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			loss_peg_no(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($slf_support_upri.equalsIgnoreCase(name)) {
			slf_support_upri(value);
			return;
		}
		if ($slf_support_xrate.equalsIgnoreCase(name)) {
			slf_support_xrate(value);
			return;
		}
		if ($vmi_upri.equalsIgnoreCase(name)) {
			vmi_upri(value);
			return;
		}
		if ($prov_peg_no.equalsIgnoreCase(name)) {
			prov_peg_no(value);
			return;
		}
		if ($prov_rtn_peg_no.equalsIgnoreCase(name)) {
			prov_rtn_peg_no(value);
			return;
		}
		if ($base_unit_sum_inpt_loss_qty.equalsIgnoreCase(name)) {
			base_unit_sum_inpt_loss_qty(value);
			return;
		}
		if ($cont_sum_qty.equalsIgnoreCase(name)) {
			cont_sum_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			loss_peg_no(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($inpt_act_reg_skip_flg.equalsIgnoreCase(name)) {
			inpt_act_reg_skip_flg(value);
			return;
		}
		if ($vmi_interim_flg.equalsIgnoreCase(name)) {
			vmi_interim_flg(value);
			return;
		}
		if ($prov_flg.equalsIgnoreCase(name)) {
			prov_flg(value);
			return;
		}
		if ($prov_rtn_flg.equalsIgnoreCase(name)) {
			prov_rtn_flg(value);
			return;
		}
		if ($vmi_purc_flg.equalsIgnoreCase(name)) {
			vmi_purc_flg(value);
			return;
		}
		if ($old_prov_flg.equalsIgnoreCase(name)) {
			old_prov_flg(value);
			return;
		}
		if ($old_prov_rtn_flg.equalsIgnoreCase(name)) {
			old_prov_rtn_flg(value);
			return;
		}
		if ($old_vmi_purc_flg.equalsIgnoreCase(name)) {
			old_vmi_purc_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
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
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			lot_mix_flg(value);
			return;
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			sublot_mix_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			lst_reg_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		if ($is_src_md_mfg_srv_flg.equalsIgnoreCase(name)) {
			is_src_md_mfg_srv_flg(value);
			return;
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			alt_itm_fix_flg(value);
			return;
		}
		if ($not_pd_chk_flg.equalsIgnoreCase(name)) {
			not_pd_chk_flg(value);
			return;
		}
		if ($is_only_abort_flg.equalsIgnoreCase(name)) {
			is_only_abort_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
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
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_str_ln_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($inpt_loc_sppl_cd.equalsIgnoreCase(name)) {
			inpt_loc_sppl_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
			return;
		}
		if ($mfg_inst_lot_no.equalsIgnoreCase(name)) {
			mfg_inst_lot_no(value);
			return;
		}
		if ($mfg_inst_sublot_no.equalsIgnoreCase(name)) {
			mfg_inst_sublot_no(value);
			return;
		}
		if ($mfg_inst_sno1.equalsIgnoreCase(name)) {
			mfg_inst_sno1(value);
			return;
		}
		if ($mfg_inst_sno2.equalsIgnoreCase(name)) {
			mfg_inst_sno2(value);
			return;
		}
		if ($mfg_inst_sno3.equalsIgnoreCase(name)) {
			mfg_inst_sno3(value);
			return;
		}
		if ($mfg_inst_sno4.equalsIgnoreCase(name)) {
			mfg_inst_sno4(value);
			return;
		}
		if ($mfg_inst_sno1_mng_typ.equalsIgnoreCase(name)) {
			mfg_inst_sno1_mng_typ(value);
			return;
		}
		if ($mfg_inst_sno2_mng_typ.equalsIgnoreCase(name)) {
			mfg_inst_sno2_mng_typ(value);
			return;
		}
		if ($mfg_inst_sno3_mng_typ.equalsIgnoreCase(name)) {
			mfg_inst_sno3_mng_typ(value);
			return;
		}
		if ($mfg_inst_sno4_mng_typ.equalsIgnoreCase(name)) {
			mfg_inst_sno4_mng_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($slf_support_cur_cd.equalsIgnoreCase(name)) {
			slf_support_cur_cd(value);
			return;
		}
		if ($slf_support_tax_cd.equalsIgnoreCase(name)) {
			slf_support_tax_cd(value);
			return;
		}
		if ($slf_support_xrate_cd.equalsIgnoreCase(name)) {
			slf_support_xrate_cd(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			prov_stk_arrv_bp_cd(value);
			return;
		}
		if ($prov_stk_id_typ.equalsIgnoreCase(name)) {
			prov_stk_id_typ(value);
			return;
		}
		if ($prov_stk_bp_cd.equalsIgnoreCase(name)) {
			prov_stk_bp_cd(value);
			return;
		}
		if ($prov_rtn_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			prov_rtn_stk_arrv_bp_cd(value);
			return;
		}
		if ($prov_rtn_stk_id_typ.equalsIgnoreCase(name)) {
			prov_rtn_stk_id_typ(value);
			return;
		}
		if ($prov_rtn_stk_bp_cd.equalsIgnoreCase(name)) {
			prov_rtn_stk_bp_cd(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_conv_rnd_typ(value);
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
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			alloc_ctl_typ(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
			return;
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($slf_support_upri.equalsIgnoreCase(name)) {
			slf_support_upri(value);
			return;
		}
		if ($slf_support_xrate.equalsIgnoreCase(name)) {
			slf_support_xrate(value);
			return;
		}
		if ($vmi_upri.equalsIgnoreCase(name)) {
			vmi_upri(value);
			return;
		}
		if ($prov_peg_no.equalsIgnoreCase(name)) {
			prov_peg_no(value);
			return;
		}
		if ($prov_rtn_peg_no.equalsIgnoreCase(name)) {
			prov_rtn_peg_no(value);
			return;
		}
		if ($base_unit_sum_inpt_loss_qty.equalsIgnoreCase(name)) {
			base_unit_sum_inpt_loss_qty(value);
			return;
		}
		if ($cont_sum_qty.equalsIgnoreCase(name)) {
			cont_sum_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			loss_peg_no(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($slf_support_upri.equalsIgnoreCase(name)) {
			slf_support_upri(value);
			return;
		}
		if ($slf_support_xrate.equalsIgnoreCase(name)) {
			slf_support_xrate(value);
			return;
		}
		if ($vmi_upri.equalsIgnoreCase(name)) {
			vmi_upri(value);
			return;
		}
		if ($prov_peg_no.equalsIgnoreCase(name)) {
			prov_peg_no(value);
			return;
		}
		if ($prov_rtn_peg_no.equalsIgnoreCase(name)) {
			prov_rtn_peg_no(value);
			return;
		}
		if ($base_unit_sum_inpt_loss_qty.equalsIgnoreCase(name)) {
			base_unit_sum_inpt_loss_qty(value);
			return;
		}
		if ($cont_sum_qty.equalsIgnoreCase(name)) {
			cont_sum_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			loss_peg_no(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($slf_support_upri.equalsIgnoreCase(name)) {
			slf_support_upri(value);
			return;
		}
		if ($slf_support_xrate.equalsIgnoreCase(name)) {
			slf_support_xrate(value);
			return;
		}
		if ($vmi_upri.equalsIgnoreCase(name)) {
			vmi_upri(value);
			return;
		}
		if ($prov_peg_no.equalsIgnoreCase(name)) {
			prov_peg_no(value);
			return;
		}
		if ($prov_rtn_peg_no.equalsIgnoreCase(name)) {
			prov_rtn_peg_no(value);
			return;
		}
		if ($base_unit_sum_inpt_loss_qty.equalsIgnoreCase(name)) {
			base_unit_sum_inpt_loss_qty(value);
			return;
		}
		if ($cont_sum_qty.equalsIgnoreCase(name)) {
			cont_sum_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			loss_peg_no(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($slf_support_upri.equalsIgnoreCase(name)) {
			slf_support_upri(value);
			return;
		}
		if ($slf_support_xrate.equalsIgnoreCase(name)) {
			slf_support_xrate(value);
			return;
		}
		if ($vmi_upri.equalsIgnoreCase(name)) {
			vmi_upri(value);
			return;
		}
		if ($prov_peg_no.equalsIgnoreCase(name)) {
			prov_peg_no(value);
			return;
		}
		if ($prov_rtn_peg_no.equalsIgnoreCase(name)) {
			prov_rtn_peg_no(value);
			return;
		}
		if ($base_unit_sum_inpt_loss_qty.equalsIgnoreCase(name)) {
			base_unit_sum_inpt_loss_qty(value);
			return;
		}
		if ($cont_sum_qty.equalsIgnoreCase(name)) {
			cont_sum_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			loss_peg_no(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_mfg_inst_qty.equalsIgnoreCase(name)) {
			itm_mfg_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($slf_support_upri.equalsIgnoreCase(name)) {
			slf_support_upri(value);
			return;
		}
		if ($slf_support_xrate.equalsIgnoreCase(name)) {
			slf_support_xrate(value);
			return;
		}
		if ($vmi_upri.equalsIgnoreCase(name)) {
			vmi_upri(value);
			return;
		}
		if ($prov_peg_no.equalsIgnoreCase(name)) {
			prov_peg_no(value);
			return;
		}
		if ($prov_rtn_peg_no.equalsIgnoreCase(name)) {
			prov_rtn_peg_no(value);
			return;
		}
		if ($base_unit_sum_inpt_loss_qty.equalsIgnoreCase(name)) {
			base_unit_sum_inpt_loss_qty(value);
			return;
		}
		if ($cont_sum_qty.equalsIgnoreCase(name)) {
			cont_sum_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			loss_peg_no(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($inpt_act_reg_skip_flg.equalsIgnoreCase(name)) {
			inpt_act_reg_skip_flg(value);
			return;
		}
		if ($vmi_interim_flg.equalsIgnoreCase(name)) {
			vmi_interim_flg(value);
			return;
		}
		if ($prov_flg.equalsIgnoreCase(name)) {
			prov_flg(value);
			return;
		}
		if ($prov_rtn_flg.equalsIgnoreCase(name)) {
			prov_rtn_flg(value);
			return;
		}
		if ($vmi_purc_flg.equalsIgnoreCase(name)) {
			vmi_purc_flg(value);
			return;
		}
		if ($old_prov_flg.equalsIgnoreCase(name)) {
			old_prov_flg(value);
			return;
		}
		if ($old_prov_rtn_flg.equalsIgnoreCase(name)) {
			old_prov_rtn_flg(value);
			return;
		}
		if ($old_vmi_purc_flg.equalsIgnoreCase(name)) {
			old_vmi_purc_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
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
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			lot_mix_flg(value);
			return;
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			sublot_mix_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			lst_reg_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		if ($is_src_md_mfg_srv_flg.equalsIgnoreCase(name)) {
			is_src_md_mfg_srv_flg(value);
			return;
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			alt_itm_fix_flg(value);
			return;
		}
		if ($not_pd_chk_flg.equalsIgnoreCase(name)) {
			not_pd_chk_flg(value);
			return;
		}
		if ($is_only_abort_flg.equalsIgnoreCase(name)) {
			is_only_abort_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($inpt_act.equalsIgnoreCase(name)) {
			return inpt_act();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($inpt_act.equalsIgnoreCase(name)) {
			inpt_act(
				((MCContainerMeta) inpt_act_META).castInnerRow(mcframe.serverMS.dbc.MST_INPT_ACT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public String inpt_act_no() {
		return inpt_act().inpt_act_no();
	}

	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public void inpt_act_no(String value) {
		inpt_act().inpt_act_no(value);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return inpt_act().mfg_act_no();
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		inpt_act().mfg_act_no(value);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return inpt_act().itm_mfg_inst_no();
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		inpt_act().itm_mfg_inst_no(value);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return inpt_act().oper_act_no();
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		inpt_act().oper_act_no(value);
	}

	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public String inpt_schd_no() {
		return inpt_act().inpt_schd_no();
	}

	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		inpt_act().inpt_schd_no(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return inpt_act().div_seq();
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		inpt_act().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		inpt_act().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		inpt_act().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		inpt_act().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		inpt_act().div_seq(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return inpt_act().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		inpt_act().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return inpt_act().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		inpt_act().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return inpt_act().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		inpt_act().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return inpt_act().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		inpt_act().itm_sub3(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return inpt_act().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		inpt_act().ver_no(value);
	}

	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public String inpt_loc_cd() {
		return inpt_act().inpt_loc_cd();
	}

	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public void inpt_loc_cd(String value) {
		inpt_act().inpt_loc_cd(value);
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public String inpt_str_ln_cd() {
		return inpt_act().inpt_str_ln_cd();
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public void inpt_str_ln_cd(String value) {
		inpt_act().inpt_str_ln_cd(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return inpt_act().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		inpt_act().quality_typ(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return inpt_act().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		inpt_act().stk_insp_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return inpt_act().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		inpt_act().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return inpt_act().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		inpt_act().stk_bp_cd(value);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return inpt_act().stk_arrv_bp_cd();
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		inpt_act().stk_arrv_bp_cd(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return inpt_act().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		inpt_act().gd_cd(value);
	}

	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public String inpt_rsn_cd() {
		return inpt_act().inpt_rsn_cd();
	}

	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public void inpt_rsn_cd(String value) {
		inpt_act().inpt_rsn_cd(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return inpt_act().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		inpt_act().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return inpt_act().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		inpt_act().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return inpt_act().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		inpt_act().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return inpt_act().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		inpt_act().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return inpt_act().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		inpt_act().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return inpt_act().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		inpt_act().sno4(value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_qty() {
		return inpt_act().base_unit_inpt_qty();
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(MCNumber value) {
		inpt_act().base_unit_inpt_qty(value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(int value) {
		inpt_act().base_unit_inpt_qty(value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(long value) {
		inpt_act().base_unit_inpt_qty(value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(float value) {
		inpt_act().base_unit_inpt_qty(value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(double value) {
		inpt_act().base_unit_inpt_qty(value);
	}

	/**
	 * Base unit loss qty. 基準単位ロス数量.<p>
	 *
	 */
	public MCNumber base_unit_loss_qty() {
		return inpt_act().base_unit_loss_qty();
	}

	/**
	 * Base unit loss qty. 基準単位ロス数量.<p>
	 *
	 */
	public void base_unit_loss_qty(MCNumber value) {
		inpt_act().base_unit_loss_qty(value);
	}

	/**
	 * Base unit loss qty. 基準単位ロス数量.<p>
	 *
	 */
	public void base_unit_loss_qty(int value) {
		inpt_act().base_unit_loss_qty(value);
	}

	/**
	 * Base unit loss qty. 基準単位ロス数量.<p>
	 *
	 */
	public void base_unit_loss_qty(long value) {
		inpt_act().base_unit_loss_qty(value);
	}

	/**
	 * Base unit loss qty. 基準単位ロス数量.<p>
	 *
	 */
	public void base_unit_loss_qty(float value) {
		inpt_act().base_unit_loss_qty(value);
	}

	/**
	 * Base unit loss qty. 基準単位ロス数量.<p>
	 *
	 */
	public void base_unit_loss_qty(double value) {
		inpt_act().base_unit_loss_qty(value);
	}

	/**
	 * Base unit constant loss qty. 基準単位固定ロス数量.<p>
	 *
	 */
	public MCNumber base_unit_fxd_loss_qty() {
		return inpt_act().base_unit_fxd_loss_qty();
	}

	/**
	 * Base unit constant loss qty. 基準単位固定ロス数量.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(MCNumber value) {
		inpt_act().base_unit_fxd_loss_qty(value);
	}

	/**
	 * Base unit constant loss qty. 基準単位固定ロス数量.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(int value) {
		inpt_act().base_unit_fxd_loss_qty(value);
	}

	/**
	 * Base unit constant loss qty. 基準単位固定ロス数量.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(long value) {
		inpt_act().base_unit_fxd_loss_qty(value);
	}

	/**
	 * Base unit constant loss qty. 基準単位固定ロス数量.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(float value) {
		inpt_act().base_unit_fxd_loss_qty(value);
	}

	/**
	 * Base unit constant loss qty. 基準単位固定ロス数量.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(double value) {
		inpt_act().base_unit_fxd_loss_qty(value);
	}

	/**
	 * Input base unit cd. 投入基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return inpt_act().base_unit_cd();
	}

	/**
	 * Input base unit cd. 投入基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		inpt_act().base_unit_cd(value);
	}

	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public MCDate act_tm() {
		return inpt_act().act_tm();
	}

	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public void act_tm(MCDate value) {
		inpt_act().act_tm(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return inpt_act().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		inpt_act().ac_dt(value);
	}

	/**
	 * Allow backflush update バックフラッシュ更新許可.<p>
	 *
	 */
	public boolean bkf_ctl_flg() {
		return inpt_act().bkf_ctl_flg();
	}

	/**
	 * Allow backflush update バックフラッシュ更新許可.<p>
	 *
	 */
	public void bkf_ctl_flg(boolean value) {
		inpt_act().bkf_ctl_flg(value);
	}

	/**
	 * Base unit standard input qty. 基準単位標準投入数量.<p>
	 *
	 */
	public MCNumber base_unit_std_qty() {
		return inpt_act().base_unit_std_qty();
	}

	/**
	 * Base unit standard input qty. 基準単位標準投入数量.<p>
	 *
	 */
	public void base_unit_std_qty(MCNumber value) {
		inpt_act().base_unit_std_qty(value);
	}

	/**
	 * Base unit standard input qty. 基準単位標準投入数量.<p>
	 *
	 */
	public void base_unit_std_qty(int value) {
		inpt_act().base_unit_std_qty(value);
	}

	/**
	 * Base unit standard input qty. 基準単位標準投入数量.<p>
	 *
	 */
	public void base_unit_std_qty(long value) {
		inpt_act().base_unit_std_qty(value);
	}

	/**
	 * Base unit standard input qty. 基準単位標準投入数量.<p>
	 *
	 */
	public void base_unit_std_qty(float value) {
		inpt_act().base_unit_std_qty(value);
	}

	/**
	 * Base unit standard input qty. 基準単位標準投入数量.<p>
	 *
	 */
	public void base_unit_std_qty(double value) {
		inpt_act().base_unit_std_qty(value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public MCNumber cont_qty() {
		return inpt_act().cont_qty();
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_qty(MCNumber value) {
		inpt_act().cont_qty(value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_qty(int value) {
		inpt_act().cont_qty(value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_qty(long value) {
		inpt_act().cont_qty(value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_qty(float value) {
		inpt_act().cont_qty(value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_qty(double value) {
		inpt_act().cont_qty(value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public MCNumber cont_loss_qty() {
		return inpt_act().cont_loss_qty();
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(MCNumber value) {
		inpt_act().cont_loss_qty(value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(int value) {
		inpt_act().cont_loss_qty(value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(long value) {
		inpt_act().cont_loss_qty(value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(float value) {
		inpt_act().cont_loss_qty(value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(double value) {
		inpt_act().cont_loss_qty(value);
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public MCNumber cont_fxd_loss_qty() {
		return inpt_act().cont_fxd_loss_qty();
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public void cont_fxd_loss_qty(MCNumber value) {
		inpt_act().cont_fxd_loss_qty(value);
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public void cont_fxd_loss_qty(int value) {
		inpt_act().cont_fxd_loss_qty(value);
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public void cont_fxd_loss_qty(long value) {
		inpt_act().cont_fxd_loss_qty(value);
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public void cont_fxd_loss_qty(float value) {
		inpt_act().cont_fxd_loss_qty(value);
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public void cont_fxd_loss_qty(double value) {
		inpt_act().cont_fxd_loss_qty(value);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return inpt_act().cont_fctr_unit_cd();
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		inpt_act().cont_fctr_unit_cd(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return inpt_act().act_cont_fctr();
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		inpt_act().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		inpt_act().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		inpt_act().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		inpt_act().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		inpt_act().act_cont_fctr(value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public MCNumber acxfr_qty() {
		return inpt_act().acxfr_qty();
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_qty(MCNumber value) {
		inpt_act().acxfr_qty(value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_qty(int value) {
		inpt_act().acxfr_qty(value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_qty(long value) {
		inpt_act().acxfr_qty(value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_qty(float value) {
		inpt_act().acxfr_qty(value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_qty(double value) {
		inpt_act().acxfr_qty(value);
	}

	/**
	 * Other accounting transfer reason cd. 他勘定振替理由ＣＤ.<p>
	 *
	 */
	public String acxfr_rsn_cd() {
		return inpt_act().acxfr_rsn_cd();
	}

	/**
	 * Other accounting transfer reason cd. 他勘定振替理由ＣＤ.<p>
	 *
	 */
	public void acxfr_rsn_cd(String value) {
		inpt_act().acxfr_rsn_cd(value);
	}

	/**
	 * Other accounting transfer charged dept. cd. 他勘定振替負担部門ＣＤ.<p>
	 *
	 */
	public String acxfr_bd_dpt_cd() {
		return inpt_act().acxfr_bd_dpt_cd();
	}

	/**
	 * Other accounting transfer charged dept. cd. 他勘定振替負担部門ＣＤ.<p>
	 *
	 */
	public void acxfr_bd_dpt_cd(String value) {
		inpt_act().acxfr_bd_dpt_cd(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return inpt_act().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		inpt_act().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		inpt_act().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		inpt_act().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		inpt_act().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		inpt_act().data_no(value);
	}

	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public String mes_id() {
		return inpt_act().mes_id();
	}

	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public void mes_id(String value) {
		inpt_act().mes_id(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return inpt_act().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		inpt_act().intr_rmrks(value);
	}

	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public String act_rpt_rmrks() {
		return inpt_act().act_rpt_rmrks();
	}

	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public void act_rpt_rmrks(String value) {
		inpt_act().act_rpt_rmrks(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return inpt_act().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		inpt_act().trd_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String inpt_act_sub_char1() {
		return inpt_act().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void inpt_act_sub_char1(String value) {
		inpt_act().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String inpt_act_sub_char2() {
		return inpt_act().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void inpt_act_sub_char2(String value) {
		inpt_act().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String inpt_act_sub_char3() {
		return inpt_act().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void inpt_act_sub_char3(String value) {
		inpt_act().sub_char3(value);
	}

	/**
	 * Add 追加.<p>
	 *
	 */
	public boolean add_flg() {
		return inpt_act().add_flg();
	}

	/**
	 * Add 追加.<p>
	 *
	 */
	public void add_flg(boolean value) {
		inpt_act().add_flg(value);
	}

	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public boolean mes_flg() {
		return inpt_act().mes_flg();
	}

	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public void mes_flg(boolean value) {
		inpt_act().mes_flg(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return inpt_act().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		inpt_act().ext_sys_cd(value);
	}

	/**
	 * External input result No. 外部投入実績ＮＯ.<p>
	 *
	 */
	public String ext_inpt_act_no() {
		return inpt_act().ext_inpt_act_no();
	}

	/**
	 * External input result No. 外部投入実績ＮＯ.<p>
	 *
	 */
	public void ext_inpt_act_no(String value) {
		inpt_act().ext_inpt_act_no(value);
	}

	/**
	 * IF auto-create ＩＦ自動作成.<p>
	 *
	 */
	public boolean if_auto_reg_flg() {
		return inpt_act().if_auto_reg_flg();
	}

	/**
	 * IF auto-create ＩＦ自動作成.<p>
	 *
	 */
	public void if_auto_reg_flg(boolean value) {
		inpt_act().if_auto_reg_flg(value);
	}

}

