package mcframe.serverMSBC.MSBCL1100;

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
 * ブロック"Srch01_DtlInpt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_DtlInptR_MC_A extends MCConstRow {

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
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public static final String $alt_grp_cd = "alt_grp_cd";
	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public static final String $alt_grp_nm = "alt_grp_nm";
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public static final String $base_unit_inpt_qty = "base_unit_inpt_qty";
	/**
	 * Base unit loss qty. 基準単位ロス数量.<p>
	 *
	 */
	public static final String $base_unit_loss_qty = "base_unit_loss_qty";
	/**
	 * Base unit constant loss qty. 基準単位固定ロス数量.<p>
	 *
	 */
	public static final String $base_unit_fxd_loss_qty = "base_unit_fxd_loss_qty";
	/**
	 * Base unit schedule input qty. 基準単位予定投入数量.<p>
	 *
	 */
	public static final String $base_unit_schd_inpt_qty = "base_unit_schd_inpt_qty";
	/**
	 * Base unit schedule constant loss qty. 基準単位予定固定ロス数量.<p>
	 *
	 */
	public static final String $base_unit_schd_fxd_rqmt_qty = "base_unit_schd_fxd_rqmt_qty";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Base unit remaining input qty. 基準単位投入残数量.<p>
	 *
	 */
	public static final String $base_unit_inpt_rem_qty = "base_unit_inpt_rem_qty";
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
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_conv_rnd_typ = "base_unit_conv_rnd_typ";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
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
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
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
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public static final String $std_cont_fctr = "std_cont_fctr";
	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public static final String $cont_inpt_qty = "cont_inpt_qty";
	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public static final String $cont_loss_qty = "cont_loss_qty";
	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public static final String $cont_fxd_loss_qty = "cont_fxd_loss_qty";
	/**
	 * Active ingredient (Schedule input qty.) 有効成分（予定投入数量）.<p>
	 *
	 */
	public static final String $cont_schd_inpt_qty = "cont_schd_inpt_qty";
	/**
	 * Active ingredient (Schedule constant loss qty.) 有効成分（予定固定ロス数量）.<p>
	 *
	 */
	public static final String $cont_schd_fxd_rqmt_qty = "cont_schd_fxd_rqmt_qty";
	/**
	 * Active ingredient (Other accounting transfer qty.) 有効成分（他勘定振替数量）.<p>
	 *
	 */
	public static final String $cont_acxfr_act_qty = "cont_acxfr_act_qty";
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
	 * Lot No. (Order) ロットＮＯ(指図).<p>
	 *
	 */
	public static final String $inst_lot_no = "inst_lot_no";
	/**
	 * Sublot No. (Order) サブロットＮＯ(指図).<p>
	 *
	 */
	public static final String $inst_sublot_no = "inst_sublot_no";
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
	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public static final String $acxfr_act_qty = "acxfr_act_qty";
	/**
	 * Other accounting transfer reason cd. 他勘定振替理由ＣＤ.<p>
	 *
	 */
	public static final String $acxfr_act_rsn_cd = "acxfr_act_rsn_cd";
	/**
	 * Other accounting transfer reason name 他勘定振替理由名.<p>
	 *
	 */
	public static final String $acxfr_act_rsn_nm = "acxfr_act_rsn_nm";
	/**
	 * Other accounting transfer charged dept. cd. 他勘定振替負担部門ＣＤ.<p>
	 *
	 */
	public static final String $acxfr_act_bd_dpt_cd = "acxfr_act_bd_dpt_cd";
	/**
	 * Other accounting transfer charged dept. name 他勘定振替負担部門名.<p>
	 *
	 */
	public static final String $acxfr_act_bd_dpt_nm = "acxfr_act_bd_dpt_nm";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	/**
	 * Routing 工順.<p>
	 *
	 */
	public static final String $oper_disp_seq = "oper_disp_seq";
	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public static final String $act_dt = "act_dt";
	/**
	 * Actual time 実績時刻.<p>
	 *
	 */
	public static final String $act_hm = "act_hm";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Scheduled input date 投入予定日.<p>
	 *
	 */
	public static final String $schd_dt = "schd_dt";
	/**
	 * Input schedule time 投入予定時刻.<p>
	 *
	 */
	public static final String $schd_hm = "schd_hm";
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
	 * SEIBAN No. 1 (Result) 手配ＮＯ１(実績).<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public static final String $sno1_null_flg = "sno1_null_flg";
	/**
	 * SEIBAN No. 1 (Order) 手配ＮＯ１(指図).<p>
	 *
	 */
	public static final String $inst_sno1 = "inst_sno1";
	/**
	 * SEIBAN No. 2 (Result) 手配ＮＯ２(実績).<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public static final String $sno2_null_flg = "sno2_null_flg";
	/**
	 * SEIBAN No. 2 (Sales order) 手配ＮＯ２(指図).<p>
	 *
	 */
	public static final String $inst_sno2 = "inst_sno2";
	/**
	 * SEIBAN No. 3 (Result) 手配ＮＯ３(実績).<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public static final String $sno3_null_flg = "sno3_null_flg";
	/**
	 * SEIBAN No. 3 (Sales order) 手配ＮＯ３(指図).<p>
	 *
	 */
	public static final String $inst_sno3 = "inst_sno3";
	/**
	 * SEIBAN No. 4 (Result) 手配ＮＯ４(実績).<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public static final String $sno4_null_flg = "sno4_null_flg";
	/**
	 * SEIBAN No. 4 (Sales order) 手配ＮＯ４(指図).<p>
	 *
	 */
	public static final String $inst_sno4 = "inst_sno4";
	/**
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public static final String $bkf_typ = "bkf_typ";
	/**
	 * Input item backflush type name 投入品バックフラッシュ区分名.<p>
	 *
	 */
	public static final String $bkf_typ_nm = "bkf_typ_nm";
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
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public static final String $inpt_rsn_cd = "inpt_rsn_cd";
	/**
	 * Input reason name 投入理由名.<p>
	 *
	 */
	public static final String $inpt_rsn_nm = "inpt_rsn_nm";
	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public static final String $inpt_loc_cd = "inpt_loc_cd";
	/**
	 * Input location name 投入場所名.<p>
	 *
	 */
	public static final String $inpt_loc_nm = "inpt_loc_nm";
	/**
	 * For input location rack/line 投入場所棚・ライン対象.<p>
	 *
	 */
	public static final String $inpt_str_ln_tgt_flg = "inpt_str_ln_tgt_flg";
	/**
	 * Input location supplier cd. 投入場所発注先ＣＤ.<p>
	 *
	 */
	public static final String $inpt_loc_sppl_cd = "inpt_loc_sppl_cd";
	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $inpt_str_ln_cd = "inpt_str_ln_cd";
	/**
	 * Input rack/line name 投入棚・ライン名.<p>
	 *
	 */
	public static final String $inpt_str_ln_nm = "inpt_str_ln_nm";
	/**
	 * Without input rack/line 投入棚・ライン無.<p>
	 *
	 */
	public static final String $inpt_str_ln_cd_none_flg = "inpt_str_ln_cd_none_flg";
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
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
	/**
	 * Arriving point cd. 着荷先ＣＤ.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	/**
	 * Arriving point name 着荷先名.<p>
	 *
	 */
	public static final String $stk_arrv_bp_nm = "stk_arrv_bp_nm";
	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public static final String $inst_rpt_rmrks = "inst_rpt_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $inpt_act_intr_rmrks = "inpt_act_intr_rmrks";
	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public static final String $inpt_act_rpt_rmrks = "inpt_act_rpt_rmrks";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public static final String $inpt_act_sub_char1 = "inpt_act_sub_char1";
	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public static final String $inpt_act_sub_char2 = "inpt_act_sub_char2";
	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public static final String $inpt_act_sub_char3 = "inpt_act_sub_char3";
	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public static final String $main_itm_flg = "main_itm_flg";
	/**
	 * Backflush update バックフラッシュ更新.<p>
	 *
	 */
	public static final String $bkf_upd_flg = "bkf_upd_flg";
	/**
	 * Allow mixed lots ロット混在可.<p>
	 *
	 */
	public static final String $lot_mix_flg = "lot_mix_flg";
	/**
	 * Allow mixed sublots サブロット混在可.<p>
	 *
	 */
	public static final String $sublot_mix_flg = "sublot_mix_flg";
	/**
	 * Version No. (Order) 版ＮＯ(指図).<p>
	 *
	 */
	public static final String $inpt_schd_ver_no = "inpt_schd_ver_no";
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public static final String $stk_mng_typ_nm = "stk_mng_typ_nm";
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
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public static final String $alt_itm_typ = "alt_itm_typ";
	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public static final String $alt_itm_typ_nm = "alt_itm_typ_nm";
	/**
	 * Number of alternative sources 代替元数.<p>
	 *
	 */
	public static final String $base_unit_alt_qty = "base_unit_alt_qty";
	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public static final String $alt_alloc_prio = "alt_alloc_prio";
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
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public static final String $inpt_schd_no = "inpt_schd_no";
	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public static final String $inpt_act_no = "inpt_act_no";
	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public static final String $mes_id = "mes_id";
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";
	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public static final String $mes_flg = "mes_flg";
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public static final String $ext_sys_nm = "ext_sys_nm";
	/**
	 * External input result No. 外部投入実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_inpt_act_no = "ext_inpt_act_no";
	/**
	 * IF auto-create ＩＦ自動作成.<p>
	 *
	 */
	public static final String $if_auto_reg_flg = "if_auto_reg_flg";
	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public static final String $mfg_sts_typ_nm = "mfg_sts_typ_nm";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Loss qty. input available ロス数量入力可.<p>
	 *
	 */
	public static final String $loss_qty_enable_flg = "loss_qty_enable_flg";
	/**
	 * Constant loss qty. input available 固定ロス数量入力可.<p>
	 *
	 */
	public static final String $fxd_loss_qty_enable_flg = "fxd_loss_qty_enable_flg";
	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public static final String $recalc_grp = "recalc_grp";
	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public static final String $recalc_grp_seq = "recalc_grp_seq";
	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * For lot suggestion ロット提案対象.<p>
	 *
	 */
	public static final String $lot_prop_tgt_flg = "lot_prop_tgt_flg";
	/**
	 * Input qty. before change 変更前投入数量.<p>
	 *
	 */
	public static final String $base_unit_inpt_qty_bef = "base_unit_inpt_qty_bef";
	/**
	 * Constant loss qty. before change 変更前固定ロス数量.<p>
	 *
	 */
	public static final String $base_unit_fxd_loss_qty_bef = "base_unit_fxd_loss_qty_bef";


	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_peg_no_META = createCommonMeta($oper_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_nm_META = createCommonMeta($alt_grp_nm, mcframe.commonMA.meta.MA_META.ALT_GRP_NM);
	public static final MCMeta alt_grp_seq_META = createCommonMeta($alt_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alt_itm_fix_flg_META = createCommonMeta($alt_itm_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_inpt_qty_META = createCommonMeta($base_unit_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_loss_qty_META = createCommonMeta($base_unit_loss_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_fxd_loss_qty_META = createCommonMeta($base_unit_fxd_loss_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_schd_inpt_qty_META = createCommonMeta($base_unit_schd_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_schd_fxd_rqmt_qty_META = createCommonMeta($base_unit_schd_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_inpt_rem_qty_META = createCommonMeta($base_unit_inpt_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_conv_rnd_typ_META = createCommonMeta($base_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta cont_fctr_unit_nm_META = createCommonMeta($cont_fctr_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta cont_inpt_qty_META = createCommonMeta($cont_inpt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_loss_qty_META = createCommonMeta($cont_loss_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_fxd_loss_qty_META = createCommonMeta($cont_fxd_loss_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_schd_inpt_qty_META = createCommonMeta($cont_schd_inpt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_schd_fxd_rqmt_qty_META = createCommonMeta($cont_schd_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_acxfr_act_qty_META = createCommonMeta($cont_acxfr_act_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta inst_lot_no_META = createCommonMeta($inst_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta inst_sublot_no_META = createCommonMeta($inst_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta first_gr_dt_META = createCommonMeta($first_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_seq_META = createCommonMeta($lot_seq, mcframe.commonMA.meta.MA_META.LOT_SEQ);
	public static final MCMeta acxfr_act_qty_META = createCommonMeta($acxfr_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta acxfr_act_rsn_cd_META = createCommonMeta($acxfr_act_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta acxfr_act_rsn_nm_META = createCommonMeta($acxfr_act_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta acxfr_act_bd_dpt_cd_META = createCommonMeta($acxfr_act_bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta acxfr_act_bd_dpt_nm_META = createCommonMeta($acxfr_act_bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta oper_disp_seq_META = createCommonMeta($oper_disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta act_dt_META = createCommonMeta($act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta act_hm_META = createCommonMeta($act_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta schd_dt_META = createCommonMeta($schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta schd_hm_META = createCommonMeta($schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_sno1_META = createCommonMeta($inst_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_sno2_META = createCommonMeta($inst_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_sno3_META = createCommonMeta($inst_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_sno4_META = createCommonMeta($inst_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta bkf_typ_META = createCommonMeta($bkf_typ, mcframe.commonMA.meta.MA_META.BKF_TYP);
	public static final MCMeta bkf_typ_nm_META = createCommonMeta($bkf_typ_nm, mcframe.commonMA.meta.MA_META.BKF_TYP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta inpt_rsn_cd_META = createCommonMeta($inpt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta inpt_rsn_nm_META = createCommonMeta($inpt_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta inpt_loc_cd_META = createCommonMeta($inpt_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inpt_loc_nm_META = createCommonMeta($inpt_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta inpt_str_ln_tgt_flg_META = createCommonMeta($inpt_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_loc_sppl_cd_META = createCommonMeta($inpt_loc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta inpt_str_ln_cd_META = createCommonMeta($inpt_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta inpt_str_ln_nm_META = createCommonMeta($inpt_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta inpt_str_ln_cd_none_flg_META = createCommonMeta($inpt_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta inst_rpt_rmrks_META = createCommonMeta($inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.INPT_SCHD_RPT_RMRKS);
	public static final MCMeta inpt_act_intr_rmrks_META = createCommonMeta($inpt_act_intr_rmrks, mcframe.commonMS.meta.MS_META.INPT_ACT_INTR_RMRKS);
	public static final MCMeta inpt_act_rpt_rmrks_META = createCommonMeta($inpt_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.INPT_ACT_RPT_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta inpt_act_sub_char1_META = createCommonMeta($inpt_act_sub_char1, mcframe.commonMS.meta.MS_META.INPT_ACT_SUB_CHAR1);
	public static final MCMeta inpt_act_sub_char2_META = createCommonMeta($inpt_act_sub_char2, mcframe.commonMS.meta.MS_META.INPT_ACT_SUB_CHAR2);
	public static final MCMeta inpt_act_sub_char3_META = createCommonMeta($inpt_act_sub_char3, mcframe.commonMS.meta.MS_META.INPT_ACT_SUB_CHAR3);
	public static final MCMeta main_itm_flg_META = createCommonMeta($main_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bkf_upd_flg_META = createCommonMeta($bkf_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_mix_flg_META = createCommonMeta($lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_mix_flg_META = createCommonMeta($sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_schd_ver_no_META = createCommonMeta($inpt_schd_ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta stk_mng_typ_nm_META = createCommonMeta($stk_mng_typ_nm, mcframe.commonMA.meta.MA_META.STK_MNG_TYP_NM);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_typ_nm_META = createCommonMeta($prov_typ_nm, mcframe.commonMA.meta.MA_META.PROV_TYP_NM);
	public static final MCMeta alt_itm_typ_META = createCommonMeta($alt_itm_typ, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP);
	public static final MCMeta alt_itm_typ_nm_META = createCommonMeta($alt_itm_typ_nm, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP_NM);
	public static final MCMeta base_unit_alt_qty_META = createCommonMeta($base_unit_alt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alt_alloc_prio_META = createCommonMeta($alt_alloc_prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_ctl_typ_META = createCommonMeta($alloc_ctl_typ, mcframe.commonMA.meta.MA_META.ALLOC_CTL_TYP);
	public static final MCMeta inpt_schd_no_META = createCommonMeta($inpt_schd_no, mcframe.commonMA.meta.MA_META.INPT_SCHD_NO);
	public static final MCMeta inpt_act_no_META = createCommonMeta($inpt_act_no, mcframe.commonMA.meta.MA_META.INPT_ACT_NO);
	public static final MCMeta mes_id_META = createCommonMeta($mes_id, mcframe.commonMS.meta.MS_META.MES_ID);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta mes_flg_META = createCommonMeta($mes_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_inpt_act_no_META = createCommonMeta($ext_inpt_act_no, mcframe.commonMA.meta.MA_META.EXT_INPT_ACT_NO);
	public static final MCMeta if_auto_reg_flg_META = createCommonMeta($if_auto_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_sts_typ_nm_META = createCommonMeta($mfg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_STS_TYP_NM);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta loss_qty_enable_flg_META = createCommonMeta($loss_qty_enable_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fxd_loss_qty_enable_flg_META = createCommonMeta($fxd_loss_qty_enable_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta recalc_grp_META = createCommonMeta($recalc_grp, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta recalc_grp_seq_META = createCommonMeta($recalc_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_prop_tgt_flg_META = createCommonMeta($lot_prop_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_inpt_qty_bef_META = createCommonMeta($base_unit_inpt_qty_bef, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_fxd_loss_qty_bef_META = createCommonMeta($base_unit_fxd_loss_qty_bef, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<Srch01_DtlInptR> constMetas = new ConstMetaList<Srch01_DtlInptR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			oper_peg_no_META,
			oper_inst_no_META,
			oper_act_no_META,
			peg_no_META,
			alt_grp_cd_META,
			alt_grp_nm_META,
			alt_grp_seq_META,
			alt_itm_fix_flg_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			ver_no_META,
			ver_flg_META,
			base_unit_inpt_qty_META,
			base_unit_loss_qty_META,
			base_unit_fxd_loss_qty_META,
			base_unit_schd_inpt_qty_META,
			base_unit_schd_fxd_rqmt_qty_META,
			abort_flg_META,
			base_unit_inpt_rem_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_conv_rnd_typ_META,
			cont_fctr_flg_META,
			cont_fctr_rnd_typ_META,
			cont_fctr_dec_place_META,
			act_cont_fctr_META,
			cont_fctr_unit_cd_META,
			cont_fctr_unit_nm_META,
			std_cont_fctr_META,
			cont_inpt_qty_META,
			cont_loss_qty_META,
			cont_fxd_loss_qty_META,
			cont_schd_inpt_qty_META,
			cont_schd_fxd_rqmt_qty_META,
			cont_acxfr_act_qty_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			lot_no_META,
			sublot_no_META,
			inst_lot_no_META,
			inst_sublot_no_META,
			vld_dt_META,
			first_gr_dt_META,
			lot_seq_META,
			acxfr_act_qty_META,
			acxfr_act_rsn_cd_META,
			acxfr_act_rsn_nm_META,
			acxfr_act_bd_dpt_cd_META,
			acxfr_act_bd_dpt_nm_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			oper_disp_seq_META,
			act_dt_META,
			act_hm_META,
			ac_dt_META,
			schd_dt_META,
			schd_hm_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			sno1_META,
			sno1_null_flg_META,
			inst_sno1_META,
			sno2_META,
			sno2_null_flg_META,
			inst_sno2_META,
			sno3_META,
			sno3_null_flg_META,
			inst_sno3_META,
			sno4_META,
			sno4_null_flg_META,
			inst_sno4_META,
			bkf_typ_META,
			bkf_typ_nm_META,
			gd_cd_META,
			gd_nm_META,
			inpt_rsn_cd_META,
			inpt_rsn_nm_META,
			inpt_loc_cd_META,
			inpt_loc_nm_META,
			inpt_str_ln_tgt_flg_META,
			inpt_loc_sppl_cd_META,
			inpt_str_ln_cd_META,
			inpt_str_ln_nm_META,
			inpt_str_ln_cd_none_flg_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			stk_arrv_bp_cd_META,
			stk_arrv_bp_nm_META,
			inst_rpt_rmrks_META,
			inpt_act_intr_rmrks_META,
			inpt_act_rpt_rmrks_META,
			trd_rmrks_META,
			inpt_act_sub_char1_META,
			inpt_act_sub_char2_META,
			inpt_act_sub_char3_META,
			main_itm_flg_META,
			bkf_upd_flg_META,
			lot_mix_flg_META,
			sublot_mix_flg_META,
			inpt_schd_ver_no_META,
			stk_mng_typ_META,
			stk_mng_typ_nm_META,
			prov_typ_META,
			prov_typ_nm_META,
			alt_itm_typ_META,
			alt_itm_typ_nm_META,
			base_unit_alt_qty_META,
			alt_alloc_prio_META,
			alloc_flg_META,
			alloc_ctl_typ_META,
			inpt_schd_no_META,
			inpt_act_no_META,
			mes_id_META,
			data_no_META,
			mes_flg_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			ext_inpt_act_no_META,
			if_auto_reg_flg_META,
			mfg_sts_typ_META,
			mfg_sts_typ_nm_META,
			disp_seq_META,
			loss_qty_enable_flg_META,
			fxd_loss_qty_enable_flg_META,
			recalc_grp_META,
			recalc_grp_seq_META,
			check_META,
			lot_prop_tgt_flg_META,
			base_unit_inpt_qty_bef_META,
			base_unit_fxd_loss_qty_bef_META
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
				{$bkf_typ, "MAC_BKF_TYP"},	// bkf_typ
				{$stk_id_typ, "MSC_STK_ID_TYP"},	// stk_id_typ
				{$stk_mng_typ, "MAC_STK_MNG_TYP"},	// stk_mng_typ
				{$prov_typ, "MAC_PROV_TYP"},	// prov_typ
				{$alt_itm_typ, "MAC_ALT_ITM_TYP"},	// alt_itm_typ
				{$mfg_sts_typ, "MSC_MFG_STS_TYP"}	// mfg_sts_typ
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
	protected Srch01_DtlInptR_MC_A(ConstMetaList<? extends Srch01_DtlInptR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlInptR clone() {
		return (Srch01_DtlInptR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlInptR createInstance() {
		return (Srch01_DtlInptR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlInptR getValues(String... names) {
		return (Srch01_DtlInptR) super.getValues(names);
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
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 2, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 2, $oper_inst_no, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 3, $oper_act_no);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 3, $oper_act_no, value);
	}


	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 4, $peg_no);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 4, $peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 4, $peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 4, $peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 4, $peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 4, $peg_no, value);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 5, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 5, $alt_grp_cd, value);
	}


	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public String alt_grp_nm() {
		return getConstString(offset + 6, $alt_grp_nm);
	}

	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public void alt_grp_nm(String value) {
		setConstString(offset + 6, $alt_grp_nm, value);
	}


	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public MCNumber alt_grp_seq() {
		return getConstNumber(offset + 7, $alt_grp_seq);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(MCNumber value) {
		setConstNumber(offset + 7, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(int value) {
		setConstNumber(offset + 7, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(long value) {
		setConstNumber(offset + 7, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(float value) {
		setConstNumber(offset + 7, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(double value) {
		setConstNumber(offset + 7, $alt_grp_seq, value);
	}


	/**
	 * Specify alternative item 代替品目指定.<p>
	 *
	 */
	public boolean alt_itm_fix_flg() {
		return getConstBoolean(offset + 8, $alt_itm_fix_flg);
	}

	/**
	 * Specify alternative item 代替品目指定.<p>
	 *
	 */
	public void alt_itm_fix_flg(boolean value) {
		setConstBoolean(offset + 8, $alt_itm_fix_flg, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 9, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 9, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 10, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 10, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 11, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 11, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 12, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 12, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 13, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 13, $itm_nm, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 14, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 14, $ver_no, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 15, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 15, $ver_flg, value);
	}


	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_qty() {
		return getConstNumber(offset + 16, $base_unit_inpt_qty);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(MCNumber value) {
		setConstNumber(offset + 16, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(int value) {
		setConstNumber(offset + 16, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(long value) {
		setConstNumber(offset + 16, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(float value) {
		setConstNumber(offset + 16, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(double value) {
		setConstNumber(offset + 16, $base_unit_inpt_qty, value);
	}


	/**
	 * Base unit loss qty. 基準単位ロス数量.<p>
	 *
	 */
	public MCNumber base_unit_loss_qty() {
		return getConstNumber(offset + 17, $base_unit_loss_qty);
	}

	/**
	 * Base unit loss qty. 基準単位ロス数量.<p>
	 *
	 */
	public void base_unit_loss_qty(MCNumber value) {
		setConstNumber(offset + 17, $base_unit_loss_qty, value);
	}

	/**
	 * Base unit loss qty. 基準単位ロス数量.<p>
	 *
	 */
	public void base_unit_loss_qty(int value) {
		setConstNumber(offset + 17, $base_unit_loss_qty, value);
	}

	/**
	 * Base unit loss qty. 基準単位ロス数量.<p>
	 *
	 */
	public void base_unit_loss_qty(long value) {
		setConstNumber(offset + 17, $base_unit_loss_qty, value);
	}

	/**
	 * Base unit loss qty. 基準単位ロス数量.<p>
	 *
	 */
	public void base_unit_loss_qty(float value) {
		setConstNumber(offset + 17, $base_unit_loss_qty, value);
	}

	/**
	 * Base unit loss qty. 基準単位ロス数量.<p>
	 *
	 */
	public void base_unit_loss_qty(double value) {
		setConstNumber(offset + 17, $base_unit_loss_qty, value);
	}


	/**
	 * Base unit constant loss qty. 基準単位固定ロス数量.<p>
	 *
	 */
	public MCNumber base_unit_fxd_loss_qty() {
		return getConstNumber(offset + 18, $base_unit_fxd_loss_qty);
	}

	/**
	 * Base unit constant loss qty. 基準単位固定ロス数量.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(MCNumber value) {
		setConstNumber(offset + 18, $base_unit_fxd_loss_qty, value);
	}

	/**
	 * Base unit constant loss qty. 基準単位固定ロス数量.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(int value) {
		setConstNumber(offset + 18, $base_unit_fxd_loss_qty, value);
	}

	/**
	 * Base unit constant loss qty. 基準単位固定ロス数量.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(long value) {
		setConstNumber(offset + 18, $base_unit_fxd_loss_qty, value);
	}

	/**
	 * Base unit constant loss qty. 基準単位固定ロス数量.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(float value) {
		setConstNumber(offset + 18, $base_unit_fxd_loss_qty, value);
	}

	/**
	 * Base unit constant loss qty. 基準単位固定ロス数量.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(double value) {
		setConstNumber(offset + 18, $base_unit_fxd_loss_qty, value);
	}


	/**
	 * Base unit schedule input qty. 基準単位予定投入数量.<p>
	 *
	 */
	public MCNumber base_unit_schd_inpt_qty() {
		return getConstNumber(offset + 19, $base_unit_schd_inpt_qty);
	}

	/**
	 * Base unit schedule input qty. 基準単位予定投入数量.<p>
	 *
	 */
	public void base_unit_schd_inpt_qty(MCNumber value) {
		setConstNumber(offset + 19, $base_unit_schd_inpt_qty, value);
	}

	/**
	 * Base unit schedule input qty. 基準単位予定投入数量.<p>
	 *
	 */
	public void base_unit_schd_inpt_qty(int value) {
		setConstNumber(offset + 19, $base_unit_schd_inpt_qty, value);
	}

	/**
	 * Base unit schedule input qty. 基準単位予定投入数量.<p>
	 *
	 */
	public void base_unit_schd_inpt_qty(long value) {
		setConstNumber(offset + 19, $base_unit_schd_inpt_qty, value);
	}

	/**
	 * Base unit schedule input qty. 基準単位予定投入数量.<p>
	 *
	 */
	public void base_unit_schd_inpt_qty(float value) {
		setConstNumber(offset + 19, $base_unit_schd_inpt_qty, value);
	}

	/**
	 * Base unit schedule input qty. 基準単位予定投入数量.<p>
	 *
	 */
	public void base_unit_schd_inpt_qty(double value) {
		setConstNumber(offset + 19, $base_unit_schd_inpt_qty, value);
	}


	/**
	 * Base unit schedule constant loss qty. 基準単位予定固定ロス数量.<p>
	 *
	 */
	public MCNumber base_unit_schd_fxd_rqmt_qty() {
		return getConstNumber(offset + 20, $base_unit_schd_fxd_rqmt_qty);
	}

	/**
	 * Base unit schedule constant loss qty. 基準単位予定固定ロス数量.<p>
	 *
	 */
	public void base_unit_schd_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 20, $base_unit_schd_fxd_rqmt_qty, value);
	}

	/**
	 * Base unit schedule constant loss qty. 基準単位予定固定ロス数量.<p>
	 *
	 */
	public void base_unit_schd_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 20, $base_unit_schd_fxd_rqmt_qty, value);
	}

	/**
	 * Base unit schedule constant loss qty. 基準単位予定固定ロス数量.<p>
	 *
	 */
	public void base_unit_schd_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 20, $base_unit_schd_fxd_rqmt_qty, value);
	}

	/**
	 * Base unit schedule constant loss qty. 基準単位予定固定ロス数量.<p>
	 *
	 */
	public void base_unit_schd_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 20, $base_unit_schd_fxd_rqmt_qty, value);
	}

	/**
	 * Base unit schedule constant loss qty. 基準単位予定固定ロス数量.<p>
	 *
	 */
	public void base_unit_schd_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 20, $base_unit_schd_fxd_rqmt_qty, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 21, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 21, $abort_flg, value);
	}


	/**
	 * Base unit remaining input qty. 基準単位投入残数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_rem_qty() {
		return getConstNumber(offset + 22, $base_unit_inpt_rem_qty);
	}

	/**
	 * Base unit remaining input qty. 基準単位投入残数量.<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(MCNumber value) {
		setConstNumber(offset + 22, $base_unit_inpt_rem_qty, value);
	}

	/**
	 * Base unit remaining input qty. 基準単位投入残数量.<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(int value) {
		setConstNumber(offset + 22, $base_unit_inpt_rem_qty, value);
	}

	/**
	 * Base unit remaining input qty. 基準単位投入残数量.<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(long value) {
		setConstNumber(offset + 22, $base_unit_inpt_rem_qty, value);
	}

	/**
	 * Base unit remaining input qty. 基準単位投入残数量.<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(float value) {
		setConstNumber(offset + 22, $base_unit_inpt_rem_qty, value);
	}

	/**
	 * Base unit remaining input qty. 基準単位投入残数量.<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(double value) {
		setConstNumber(offset + 22, $base_unit_inpt_rem_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 23, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 23, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 24, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 24, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 25, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 25, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 25, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 25, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 25, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 25, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public String base_unit_conv_rnd_typ() {
		return getConstString(offset + 26, $base_unit_conv_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public void base_unit_conv_rnd_typ(String value) {
		setConstString(offset + 26, $base_unit_conv_rnd_typ, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 27, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 27, $cont_fctr_flg, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 28, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 28, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 29, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 29, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 29, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 29, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 29, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 29, $cont_fctr_dec_place, value);
	}


	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 30, $act_cont_fctr);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 30, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 30, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 30, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 30, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 30, $act_cont_fctr, value);
	}


	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 31, $cont_fctr_unit_cd);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 31, $cont_fctr_unit_cd, value);
	}


	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public String cont_fctr_unit_nm() {
		return getConstString(offset + 32, $cont_fctr_unit_nm);
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public void cont_fctr_unit_nm(String value) {
		setConstString(offset + 32, $cont_fctr_unit_nm, value);
	}


	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 33, $std_cont_fctr);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 33, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 33, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 33, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 33, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 33, $std_cont_fctr, value);
	}


	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public MCNumber cont_inpt_qty() {
		return getConstNumber(offset + 34, $cont_inpt_qty);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(MCNumber value) {
		setConstNumber(offset + 34, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(int value) {
		setConstNumber(offset + 34, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(long value) {
		setConstNumber(offset + 34, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(float value) {
		setConstNumber(offset + 34, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(double value) {
		setConstNumber(offset + 34, $cont_inpt_qty, value);
	}


	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public MCNumber cont_loss_qty() {
		return getConstNumber(offset + 35, $cont_loss_qty);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(MCNumber value) {
		setConstNumber(offset + 35, $cont_loss_qty, value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(int value) {
		setConstNumber(offset + 35, $cont_loss_qty, value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(long value) {
		setConstNumber(offset + 35, $cont_loss_qty, value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(float value) {
		setConstNumber(offset + 35, $cont_loss_qty, value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(double value) {
		setConstNumber(offset + 35, $cont_loss_qty, value);
	}


	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public MCNumber cont_fxd_loss_qty() {
		return getConstNumber(offset + 36, $cont_fxd_loss_qty);
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public void cont_fxd_loss_qty(MCNumber value) {
		setConstNumber(offset + 36, $cont_fxd_loss_qty, value);
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public void cont_fxd_loss_qty(int value) {
		setConstNumber(offset + 36, $cont_fxd_loss_qty, value);
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public void cont_fxd_loss_qty(long value) {
		setConstNumber(offset + 36, $cont_fxd_loss_qty, value);
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public void cont_fxd_loss_qty(float value) {
		setConstNumber(offset + 36, $cont_fxd_loss_qty, value);
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public void cont_fxd_loss_qty(double value) {
		setConstNumber(offset + 36, $cont_fxd_loss_qty, value);
	}


	/**
	 * Active ingredient (Schedule input qty.) 有効成分（予定投入数量）.<p>
	 *
	 */
	public MCNumber cont_schd_inpt_qty() {
		return getConstNumber(offset + 37, $cont_schd_inpt_qty);
	}

	/**
	 * Active ingredient (Schedule input qty.) 有効成分（予定投入数量）.<p>
	 *
	 */
	public void cont_schd_inpt_qty(MCNumber value) {
		setConstNumber(offset + 37, $cont_schd_inpt_qty, value);
	}

	/**
	 * Active ingredient (Schedule input qty.) 有効成分（予定投入数量）.<p>
	 *
	 */
	public void cont_schd_inpt_qty(int value) {
		setConstNumber(offset + 37, $cont_schd_inpt_qty, value);
	}

	/**
	 * Active ingredient (Schedule input qty.) 有効成分（予定投入数量）.<p>
	 *
	 */
	public void cont_schd_inpt_qty(long value) {
		setConstNumber(offset + 37, $cont_schd_inpt_qty, value);
	}

	/**
	 * Active ingredient (Schedule input qty.) 有効成分（予定投入数量）.<p>
	 *
	 */
	public void cont_schd_inpt_qty(float value) {
		setConstNumber(offset + 37, $cont_schd_inpt_qty, value);
	}

	/**
	 * Active ingredient (Schedule input qty.) 有効成分（予定投入数量）.<p>
	 *
	 */
	public void cont_schd_inpt_qty(double value) {
		setConstNumber(offset + 37, $cont_schd_inpt_qty, value);
	}


	/**
	 * Active ingredient (Schedule constant loss qty.) 有効成分（予定固定ロス数量）.<p>
	 *
	 */
	public MCNumber cont_schd_fxd_rqmt_qty() {
		return getConstNumber(offset + 38, $cont_schd_fxd_rqmt_qty);
	}

	/**
	 * Active ingredient (Schedule constant loss qty.) 有効成分（予定固定ロス数量）.<p>
	 *
	 */
	public void cont_schd_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 38, $cont_schd_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Schedule constant loss qty.) 有効成分（予定固定ロス数量）.<p>
	 *
	 */
	public void cont_schd_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 38, $cont_schd_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Schedule constant loss qty.) 有効成分（予定固定ロス数量）.<p>
	 *
	 */
	public void cont_schd_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 38, $cont_schd_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Schedule constant loss qty.) 有効成分（予定固定ロス数量）.<p>
	 *
	 */
	public void cont_schd_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 38, $cont_schd_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Schedule constant loss qty.) 有効成分（予定固定ロス数量）.<p>
	 *
	 */
	public void cont_schd_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 38, $cont_schd_fxd_rqmt_qty, value);
	}


	/**
	 * Active ingredient (Other accounting transfer qty.) 有効成分（他勘定振替数量）.<p>
	 *
	 */
	public MCNumber cont_acxfr_act_qty() {
		return getConstNumber(offset + 39, $cont_acxfr_act_qty);
	}

	/**
	 * Active ingredient (Other accounting transfer qty.) 有効成分（他勘定振替数量）.<p>
	 *
	 */
	public void cont_acxfr_act_qty(MCNumber value) {
		setConstNumber(offset + 39, $cont_acxfr_act_qty, value);
	}

	/**
	 * Active ingredient (Other accounting transfer qty.) 有効成分（他勘定振替数量）.<p>
	 *
	 */
	public void cont_acxfr_act_qty(int value) {
		setConstNumber(offset + 39, $cont_acxfr_act_qty, value);
	}

	/**
	 * Active ingredient (Other accounting transfer qty.) 有効成分（他勘定振替数量）.<p>
	 *
	 */
	public void cont_acxfr_act_qty(long value) {
		setConstNumber(offset + 39, $cont_acxfr_act_qty, value);
	}

	/**
	 * Active ingredient (Other accounting transfer qty.) 有効成分（他勘定振替数量）.<p>
	 *
	 */
	public void cont_acxfr_act_qty(float value) {
		setConstNumber(offset + 39, $cont_acxfr_act_qty, value);
	}

	/**
	 * Active ingredient (Other accounting transfer qty.) 有効成分（他勘定振替数量）.<p>
	 *
	 */
	public void cont_acxfr_act_qty(double value) {
		setConstNumber(offset + 39, $cont_acxfr_act_qty, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 40, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 40, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 41, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 41, $sublot_mng_typ, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 42, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 42, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 43, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 43, $sublot_no, value);
	}


	/**
	 * Lot No. (Order) ロットＮＯ(指図).<p>
	 *
	 */
	public String inst_lot_no() {
		return getConstString(offset + 44, $inst_lot_no);
	}

	/**
	 * Lot No. (Order) ロットＮＯ(指図).<p>
	 *
	 */
	public void inst_lot_no(String value) {
		setConstString(offset + 44, $inst_lot_no, value);
	}


	/**
	 * Sublot No. (Order) サブロットＮＯ(指図).<p>
	 *
	 */
	public String inst_sublot_no() {
		return getConstString(offset + 45, $inst_sublot_no);
	}

	/**
	 * Sublot No. (Order) サブロットＮＯ(指図).<p>
	 *
	 */
	public void inst_sublot_no(String value) {
		setConstString(offset + 45, $inst_sublot_no, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 46, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 46, $vld_dt, value);
	}


	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 47, $first_gr_dt);
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 47, $first_gr_dt, value);
	}


	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public String lot_seq() {
		return getConstString(offset + 48, $lot_seq);
	}

	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public void lot_seq(String value) {
		setConstString(offset + 48, $lot_seq, value);
	}


	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public MCNumber acxfr_act_qty() {
		return getConstNumber(offset + 49, $acxfr_act_qty);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_act_qty(MCNumber value) {
		setConstNumber(offset + 49, $acxfr_act_qty, value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_act_qty(int value) {
		setConstNumber(offset + 49, $acxfr_act_qty, value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_act_qty(long value) {
		setConstNumber(offset + 49, $acxfr_act_qty, value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_act_qty(float value) {
		setConstNumber(offset + 49, $acxfr_act_qty, value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_act_qty(double value) {
		setConstNumber(offset + 49, $acxfr_act_qty, value);
	}


	/**
	 * Other accounting transfer reason cd. 他勘定振替理由ＣＤ.<p>
	 *
	 */
	public String acxfr_act_rsn_cd() {
		return getConstString(offset + 50, $acxfr_act_rsn_cd);
	}

	/**
	 * Other accounting transfer reason cd. 他勘定振替理由ＣＤ.<p>
	 *
	 */
	public void acxfr_act_rsn_cd(String value) {
		setConstString(offset + 50, $acxfr_act_rsn_cd, value);
	}


	/**
	 * Other accounting transfer reason name 他勘定振替理由名.<p>
	 *
	 */
	public String acxfr_act_rsn_nm() {
		return getConstString(offset + 51, $acxfr_act_rsn_nm);
	}

	/**
	 * Other accounting transfer reason name 他勘定振替理由名.<p>
	 *
	 */
	public void acxfr_act_rsn_nm(String value) {
		setConstString(offset + 51, $acxfr_act_rsn_nm, value);
	}


	/**
	 * Other accounting transfer charged dept. cd. 他勘定振替負担部門ＣＤ.<p>
	 *
	 */
	public String acxfr_act_bd_dpt_cd() {
		return getConstString(offset + 52, $acxfr_act_bd_dpt_cd);
	}

	/**
	 * Other accounting transfer charged dept. cd. 他勘定振替負担部門ＣＤ.<p>
	 *
	 */
	public void acxfr_act_bd_dpt_cd(String value) {
		setConstString(offset + 52, $acxfr_act_bd_dpt_cd, value);
	}


	/**
	 * Other accounting transfer charged dept. name 他勘定振替負担部門名.<p>
	 *
	 */
	public String acxfr_act_bd_dpt_nm() {
		return getConstString(offset + 53, $acxfr_act_bd_dpt_nm);
	}

	/**
	 * Other accounting transfer charged dept. name 他勘定振替負担部門名.<p>
	 *
	 */
	public void acxfr_act_bd_dpt_nm(String value) {
		setConstString(offset + 53, $acxfr_act_bd_dpt_nm, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 54, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 54, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 55, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 55, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 56, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 56, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 56, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 56, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 56, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 56, $oper_seq, value);
	}


	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber oper_disp_seq() {
		return getConstNumber(offset + 57, $oper_disp_seq);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(MCNumber value) {
		setConstNumber(offset + 57, $oper_disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(int value) {
		setConstNumber(offset + 57, $oper_disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(long value) {
		setConstNumber(offset + 57, $oper_disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(float value) {
		setConstNumber(offset + 57, $oper_disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(double value) {
		setConstNumber(offset + 57, $oper_disp_seq, value);
	}


	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public MCDate act_dt() {
		return getConstDate(offset + 58, $act_dt);
	}

	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public void act_dt(MCDate value) {
		setConstDate(offset + 58, $act_dt, value);
	}


	/**
	 * Actual time 実績時刻.<p>
	 *
	 */
	public MCDate act_hm() {
		return getConstDate(offset + 59, $act_hm);
	}

	/**
	 * Actual time 実績時刻.<p>
	 *
	 */
	public void act_hm(MCDate value) {
		setConstDate(offset + 59, $act_hm, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 60, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 60, $ac_dt, value);
	}


	/**
	 * Scheduled input date 投入予定日.<p>
	 *
	 */
	public MCDate schd_dt() {
		return getConstDate(offset + 61, $schd_dt);
	}

	/**
	 * Scheduled input date 投入予定日.<p>
	 *
	 */
	public void schd_dt(MCDate value) {
		setConstDate(offset + 61, $schd_dt, value);
	}


	/**
	 * Input schedule time 投入予定時刻.<p>
	 *
	 */
	public MCDate schd_hm() {
		return getConstDate(offset + 62, $schd_hm);
	}

	/**
	 * Input schedule time 投入予定時刻.<p>
	 *
	 */
	public void schd_hm(MCDate value) {
		setConstDate(offset + 62, $schd_hm, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 63, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 63, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 64, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 64, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 65, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 65, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 66, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 66, $sno4_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 (Result) 手配ＮＯ１(実績).<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 67, $sno1);
	}

	/**
	 * SEIBAN No. 1 (Result) 手配ＮＯ１(実績).<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 67, $sno1, value);
	}


	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 68, $sno1_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 68, $sno1_null_flg, value);
	}


	/**
	 * SEIBAN No. 1 (Order) 手配ＮＯ１(指図).<p>
	 *
	 */
	public String inst_sno1() {
		return getConstString(offset + 69, $inst_sno1);
	}

	/**
	 * SEIBAN No. 1 (Order) 手配ＮＯ１(指図).<p>
	 *
	 */
	public void inst_sno1(String value) {
		setConstString(offset + 69, $inst_sno1, value);
	}


	/**
	 * SEIBAN No. 2 (Result) 手配ＮＯ２(実績).<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 70, $sno2);
	}

	/**
	 * SEIBAN No. 2 (Result) 手配ＮＯ２(実績).<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 70, $sno2, value);
	}


	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 71, $sno2_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 71, $sno2_null_flg, value);
	}


	/**
	 * SEIBAN No. 2 (Sales order) 手配ＮＯ２(指図).<p>
	 *
	 */
	public String inst_sno2() {
		return getConstString(offset + 72, $inst_sno2);
	}

	/**
	 * SEIBAN No. 2 (Sales order) 手配ＮＯ２(指図).<p>
	 *
	 */
	public void inst_sno2(String value) {
		setConstString(offset + 72, $inst_sno2, value);
	}


	/**
	 * SEIBAN No. 3 (Result) 手配ＮＯ３(実績).<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 73, $sno3);
	}

	/**
	 * SEIBAN No. 3 (Result) 手配ＮＯ３(実績).<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 73, $sno3, value);
	}


	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 74, $sno3_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 74, $sno3_null_flg, value);
	}


	/**
	 * SEIBAN No. 3 (Sales order) 手配ＮＯ３(指図).<p>
	 *
	 */
	public String inst_sno3() {
		return getConstString(offset + 75, $inst_sno3);
	}

	/**
	 * SEIBAN No. 3 (Sales order) 手配ＮＯ３(指図).<p>
	 *
	 */
	public void inst_sno3(String value) {
		setConstString(offset + 75, $inst_sno3, value);
	}


	/**
	 * SEIBAN No. 4 (Result) 手配ＮＯ４(実績).<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 76, $sno4);
	}

	/**
	 * SEIBAN No. 4 (Result) 手配ＮＯ４(実績).<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 76, $sno4, value);
	}


	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 77, $sno4_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 77, $sno4_null_flg, value);
	}


	/**
	 * SEIBAN No. 4 (Sales order) 手配ＮＯ４(指図).<p>
	 *
	 */
	public String inst_sno4() {
		return getConstString(offset + 78, $inst_sno4);
	}

	/**
	 * SEIBAN No. 4 (Sales order) 手配ＮＯ４(指図).<p>
	 *
	 */
	public void inst_sno4(String value) {
		setConstString(offset + 78, $inst_sno4, value);
	}


	/**
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public String bkf_typ() {
		return getConstString(offset + 79, $bkf_typ);
	}

	/**
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public void bkf_typ(String value) {
		setConstString(offset + 79, $bkf_typ, value);
	}


	/**
	 * Input item backflush type name 投入品バックフラッシュ区分名.<p>
	 *
	 */
	public String bkf_typ_nm() {
		return getConstString(offset + 80, $bkf_typ_nm);
	}

	/**
	 * Input item backflush type name 投入品バックフラッシュ区分名.<p>
	 *
	 */
	public void bkf_typ_nm(String value) {
		setConstString(offset + 80, $bkf_typ_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 81, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 81, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 82, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 82, $gd_nm, value);
	}


	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public String inpt_rsn_cd() {
		return getConstString(offset + 83, $inpt_rsn_cd);
	}

	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public void inpt_rsn_cd(String value) {
		setConstString(offset + 83, $inpt_rsn_cd, value);
	}


	/**
	 * Input reason name 投入理由名.<p>
	 *
	 */
	public String inpt_rsn_nm() {
		return getConstString(offset + 84, $inpt_rsn_nm);
	}

	/**
	 * Input reason name 投入理由名.<p>
	 *
	 */
	public void inpt_rsn_nm(String value) {
		setConstString(offset + 84, $inpt_rsn_nm, value);
	}


	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public String inpt_loc_cd() {
		return getConstString(offset + 85, $inpt_loc_cd);
	}

	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public void inpt_loc_cd(String value) {
		setConstString(offset + 85, $inpt_loc_cd, value);
	}


	/**
	 * Input location name 投入場所名.<p>
	 *
	 */
	public String inpt_loc_nm() {
		return getConstString(offset + 86, $inpt_loc_nm);
	}

	/**
	 * Input location name 投入場所名.<p>
	 *
	 */
	public void inpt_loc_nm(String value) {
		setConstString(offset + 86, $inpt_loc_nm, value);
	}


	/**
	 * For input location rack/line 投入場所棚・ライン対象.<p>
	 *
	 */
	public boolean inpt_str_ln_tgt_flg() {
		return getConstBoolean(offset + 87, $inpt_str_ln_tgt_flg);
	}

	/**
	 * For input location rack/line 投入場所棚・ライン対象.<p>
	 *
	 */
	public void inpt_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 87, $inpt_str_ln_tgt_flg, value);
	}


	/**
	 * Input location supplier cd. 投入場所発注先ＣＤ.<p>
	 *
	 */
	public String inpt_loc_sppl_cd() {
		return getConstString(offset + 88, $inpt_loc_sppl_cd);
	}

	/**
	 * Input location supplier cd. 投入場所発注先ＣＤ.<p>
	 *
	 */
	public void inpt_loc_sppl_cd(String value) {
		setConstString(offset + 88, $inpt_loc_sppl_cd, value);
	}


	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public String inpt_str_ln_cd() {
		return getConstString(offset + 89, $inpt_str_ln_cd);
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public void inpt_str_ln_cd(String value) {
		setConstString(offset + 89, $inpt_str_ln_cd, value);
	}


	/**
	 * Input rack/line name 投入棚・ライン名.<p>
	 *
	 */
	public String inpt_str_ln_nm() {
		return getConstString(offset + 90, $inpt_str_ln_nm);
	}

	/**
	 * Input rack/line name 投入棚・ライン名.<p>
	 *
	 */
	public void inpt_str_ln_nm(String value) {
		setConstString(offset + 90, $inpt_str_ln_nm, value);
	}


	/**
	 * Without input rack/line 投入棚・ライン無.<p>
	 *
	 */
	public boolean inpt_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 91, $inpt_str_ln_cd_none_flg);
	}

	/**
	 * Without input rack/line 投入棚・ライン無.<p>
	 *
	 */
	public void inpt_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 91, $inpt_str_ln_cd_none_flg, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 92, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 92, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 93, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 93, $stk_id_typ_nm, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 94, $stk_bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 94, $stk_bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 95, $stk_bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 95, $stk_bp_nm, value);
	}


	/**
	 * Arriving point cd. 着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 96, $stk_arrv_bp_cd);
	}

	/**
	 * Arriving point cd. 着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 96, $stk_arrv_bp_cd, value);
	}


	/**
	 * Arriving point name 着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 97, $stk_arrv_bp_nm);
	}

	/**
	 * Arriving point name 着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 97, $stk_arrv_bp_nm, value);
	}


	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public String inst_rpt_rmrks() {
		return getConstString(offset + 98, $inst_rpt_rmrks);
	}

	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public void inst_rpt_rmrks(String value) {
		setConstString(offset + 98, $inst_rpt_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String inpt_act_intr_rmrks() {
		return getConstString(offset + 99, $inpt_act_intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void inpt_act_intr_rmrks(String value) {
		setConstString(offset + 99, $inpt_act_intr_rmrks, value);
	}


	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public String inpt_act_rpt_rmrks() {
		return getConstString(offset + 100, $inpt_act_rpt_rmrks);
	}

	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public void inpt_act_rpt_rmrks(String value) {
		setConstString(offset + 100, $inpt_act_rpt_rmrks, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 101, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 101, $trd_rmrks, value);
	}


	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public String inpt_act_sub_char1() {
		return getConstString(offset + 102, $inpt_act_sub_char1);
	}

	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public void inpt_act_sub_char1(String value) {
		setConstString(offset + 102, $inpt_act_sub_char1, value);
	}


	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public String inpt_act_sub_char2() {
		return getConstString(offset + 103, $inpt_act_sub_char2);
	}

	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public void inpt_act_sub_char2(String value) {
		setConstString(offset + 103, $inpt_act_sub_char2, value);
	}


	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public String inpt_act_sub_char3() {
		return getConstString(offset + 104, $inpt_act_sub_char3);
	}

	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public void inpt_act_sub_char3(String value) {
		setConstString(offset + 104, $inpt_act_sub_char3, value);
	}


	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public boolean main_itm_flg() {
		return getConstBoolean(offset + 105, $main_itm_flg);
	}

	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public void main_itm_flg(boolean value) {
		setConstBoolean(offset + 105, $main_itm_flg, value);
	}


	/**
	 * Backflush update バックフラッシュ更新.<p>
	 *
	 */
	public boolean bkf_upd_flg() {
		return getConstBoolean(offset + 106, $bkf_upd_flg);
	}

	/**
	 * Backflush update バックフラッシュ更新.<p>
	 *
	 */
	public void bkf_upd_flg(boolean value) {
		setConstBoolean(offset + 106, $bkf_upd_flg, value);
	}


	/**
	 * Allow mixed lots ロット混在可.<p>
	 *
	 */
	public boolean lot_mix_flg() {
		return getConstBoolean(offset + 107, $lot_mix_flg);
	}

	/**
	 * Allow mixed lots ロット混在可.<p>
	 *
	 */
	public void lot_mix_flg(boolean value) {
		setConstBoolean(offset + 107, $lot_mix_flg, value);
	}


	/**
	 * Allow mixed sublots サブロット混在可.<p>
	 *
	 */
	public boolean sublot_mix_flg() {
		return getConstBoolean(offset + 108, $sublot_mix_flg);
	}

	/**
	 * Allow mixed sublots サブロット混在可.<p>
	 *
	 */
	public void sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 108, $sublot_mix_flg, value);
	}


	/**
	 * Version No. (Order) 版ＮＯ(指図).<p>
	 *
	 */
	public String inpt_schd_ver_no() {
		return getConstString(offset + 109, $inpt_schd_ver_no);
	}

	/**
	 * Version No. (Order) 版ＮＯ(指図).<p>
	 *
	 */
	public void inpt_schd_ver_no(String value) {
		setConstString(offset + 109, $inpt_schd_ver_no, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 110, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 110, $stk_mng_typ, value);
	}


	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public String stk_mng_typ_nm() {
		return getConstString(offset + 111, $stk_mng_typ_nm);
	}

	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public void stk_mng_typ_nm(String value) {
		setConstString(offset + 111, $stk_mng_typ_nm, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 112, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 112, $prov_typ, value);
	}


	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public String prov_typ_nm() {
		return getConstString(offset + 113, $prov_typ_nm);
	}

	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public void prov_typ_nm(String value) {
		setConstString(offset + 113, $prov_typ_nm, value);
	}


	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public String alt_itm_typ() {
		return getConstString(offset + 114, $alt_itm_typ);
	}

	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public void alt_itm_typ(String value) {
		setConstString(offset + 114, $alt_itm_typ, value);
	}


	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public String alt_itm_typ_nm() {
		return getConstString(offset + 115, $alt_itm_typ_nm);
	}

	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public void alt_itm_typ_nm(String value) {
		setConstString(offset + 115, $alt_itm_typ_nm, value);
	}


	/**
	 * Number of alternative sources 代替元数.<p>
	 *
	 */
	public MCNumber base_unit_alt_qty() {
		return getConstNumber(offset + 116, $base_unit_alt_qty);
	}

	/**
	 * Number of alternative sources 代替元数.<p>
	 *
	 */
	public void base_unit_alt_qty(MCNumber value) {
		setConstNumber(offset + 116, $base_unit_alt_qty, value);
	}

	/**
	 * Number of alternative sources 代替元数.<p>
	 *
	 */
	public void base_unit_alt_qty(int value) {
		setConstNumber(offset + 116, $base_unit_alt_qty, value);
	}

	/**
	 * Number of alternative sources 代替元数.<p>
	 *
	 */
	public void base_unit_alt_qty(long value) {
		setConstNumber(offset + 116, $base_unit_alt_qty, value);
	}

	/**
	 * Number of alternative sources 代替元数.<p>
	 *
	 */
	public void base_unit_alt_qty(float value) {
		setConstNumber(offset + 116, $base_unit_alt_qty, value);
	}

	/**
	 * Number of alternative sources 代替元数.<p>
	 *
	 */
	public void base_unit_alt_qty(double value) {
		setConstNumber(offset + 116, $base_unit_alt_qty, value);
	}


	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public MCNumber alt_alloc_prio() {
		return getConstNumber(offset + 117, $alt_alloc_prio);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(MCNumber value) {
		setConstNumber(offset + 117, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(int value) {
		setConstNumber(offset + 117, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(long value) {
		setConstNumber(offset + 117, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(float value) {
		setConstNumber(offset + 117, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(double value) {
		setConstNumber(offset + 117, $alt_alloc_prio, value);
	}


	/**
	 * Allocation 引当.<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 118, $alloc_flg);
	}

	/**
	 * Allocation 引当.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 118, $alloc_flg, value);
	}


	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public String alloc_ctl_typ() {
		return getConstString(offset + 119, $alloc_ctl_typ);
	}

	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public void alloc_ctl_typ(String value) {
		setConstString(offset + 119, $alloc_ctl_typ, value);
	}


	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public String inpt_schd_no() {
		return getConstString(offset + 120, $inpt_schd_no);
	}

	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		setConstString(offset + 120, $inpt_schd_no, value);
	}


	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public String inpt_act_no() {
		return getConstString(offset + 121, $inpt_act_no);
	}

	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public void inpt_act_no(String value) {
		setConstString(offset + 121, $inpt_act_no, value);
	}


	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public String mes_id() {
		return getConstString(offset + 122, $mes_id);
	}

	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public void mes_id(String value) {
		setConstString(offset + 122, $mes_id, value);
	}


	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 123, $data_no);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 123, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 123, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 123, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 123, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 123, $data_no, value);
	}


	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public boolean mes_flg() {
		return getConstBoolean(offset + 124, $mes_flg);
	}

	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public void mes_flg(boolean value) {
		setConstBoolean(offset + 124, $mes_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 125, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 125, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 126, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 126, $ext_sys_nm, value);
	}


	/**
	 * External input result No. 外部投入実績ＮＯ.<p>
	 *
	 */
	public String ext_inpt_act_no() {
		return getConstString(offset + 127, $ext_inpt_act_no);
	}

	/**
	 * External input result No. 外部投入実績ＮＯ.<p>
	 *
	 */
	public void ext_inpt_act_no(String value) {
		setConstString(offset + 127, $ext_inpt_act_no, value);
	}


	/**
	 * IF auto-create ＩＦ自動作成.<p>
	 *
	 */
	public boolean if_auto_reg_flg() {
		return getConstBoolean(offset + 128, $if_auto_reg_flg);
	}

	/**
	 * IF auto-create ＩＦ自動作成.<p>
	 *
	 */
	public void if_auto_reg_flg(boolean value) {
		setConstBoolean(offset + 128, $if_auto_reg_flg, value);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 129, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 129, $mfg_sts_typ, value);
	}


	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public String mfg_sts_typ_nm() {
		return getConstString(offset + 130, $mfg_sts_typ_nm);
	}

	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public void mfg_sts_typ_nm(String value) {
		setConstString(offset + 130, $mfg_sts_typ_nm, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 131, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 131, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 131, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 131, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 131, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 131, $disp_seq, value);
	}


	/**
	 * Loss qty. input available ロス数量入力可.<p>
	 *
	 */
	public boolean loss_qty_enable_flg() {
		return getConstBoolean(offset + 132, $loss_qty_enable_flg);
	}

	/**
	 * Loss qty. input available ロス数量入力可.<p>
	 *
	 */
	public void loss_qty_enable_flg(boolean value) {
		setConstBoolean(offset + 132, $loss_qty_enable_flg, value);
	}


	/**
	 * Constant loss qty. input available 固定ロス数量入力可.<p>
	 *
	 */
	public boolean fxd_loss_qty_enable_flg() {
		return getConstBoolean(offset + 133, $fxd_loss_qty_enable_flg);
	}

	/**
	 * Constant loss qty. input available 固定ロス数量入力可.<p>
	 *
	 */
	public void fxd_loss_qty_enable_flg(boolean value) {
		setConstBoolean(offset + 133, $fxd_loss_qty_enable_flg, value);
	}


	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public MCNumber recalc_grp() {
		return getConstNumber(offset + 134, $recalc_grp);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(MCNumber value) {
		setConstNumber(offset + 134, $recalc_grp, value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(int value) {
		setConstNumber(offset + 134, $recalc_grp, value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(long value) {
		setConstNumber(offset + 134, $recalc_grp, value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(float value) {
		setConstNumber(offset + 134, $recalc_grp, value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(double value) {
		setConstNumber(offset + 134, $recalc_grp, value);
	}


	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public MCNumber recalc_grp_seq() {
		return getConstNumber(offset + 135, $recalc_grp_seq);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(MCNumber value) {
		setConstNumber(offset + 135, $recalc_grp_seq, value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(int value) {
		setConstNumber(offset + 135, $recalc_grp_seq, value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(long value) {
		setConstNumber(offset + 135, $recalc_grp_seq, value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(float value) {
		setConstNumber(offset + 135, $recalc_grp_seq, value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(double value) {
		setConstNumber(offset + 135, $recalc_grp_seq, value);
	}


	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 136, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 136, $check, value);
	}


	/**
	 * For lot suggestion ロット提案対象.<p>
	 *
	 */
	public boolean lot_prop_tgt_flg() {
		return getConstBoolean(offset + 137, $lot_prop_tgt_flg);
	}

	/**
	 * For lot suggestion ロット提案対象.<p>
	 *
	 */
	public void lot_prop_tgt_flg(boolean value) {
		setConstBoolean(offset + 137, $lot_prop_tgt_flg, value);
	}


	/**
	 * Input qty. before change 変更前投入数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_qty_bef() {
		return getConstNumber(offset + 138, $base_unit_inpt_qty_bef);
	}

	/**
	 * Input qty. before change 変更前投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty_bef(MCNumber value) {
		setConstNumber(offset + 138, $base_unit_inpt_qty_bef, value);
	}

	/**
	 * Input qty. before change 変更前投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty_bef(int value) {
		setConstNumber(offset + 138, $base_unit_inpt_qty_bef, value);
	}

	/**
	 * Input qty. before change 変更前投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty_bef(long value) {
		setConstNumber(offset + 138, $base_unit_inpt_qty_bef, value);
	}

	/**
	 * Input qty. before change 変更前投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty_bef(float value) {
		setConstNumber(offset + 138, $base_unit_inpt_qty_bef, value);
	}

	/**
	 * Input qty. before change 変更前投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty_bef(double value) {
		setConstNumber(offset + 138, $base_unit_inpt_qty_bef, value);
	}


	/**
	 * Constant loss qty. before change 変更前固定ロス数量.<p>
	 *
	 */
	public MCNumber base_unit_fxd_loss_qty_bef() {
		return getConstNumber(offset + 139, $base_unit_fxd_loss_qty_bef);
	}

	/**
	 * Constant loss qty. before change 変更前固定ロス数量.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty_bef(MCNumber value) {
		setConstNumber(offset + 139, $base_unit_fxd_loss_qty_bef, value);
	}

	/**
	 * Constant loss qty. before change 変更前固定ロス数量.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty_bef(int value) {
		setConstNumber(offset + 139, $base_unit_fxd_loss_qty_bef, value);
	}

	/**
	 * Constant loss qty. before change 変更前固定ロス数量.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty_bef(long value) {
		setConstNumber(offset + 139, $base_unit_fxd_loss_qty_bef, value);
	}

	/**
	 * Constant loss qty. before change 変更前固定ロス数量.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty_bef(float value) {
		setConstNumber(offset + 139, $base_unit_fxd_loss_qty_bef, value);
	}

	/**
	 * Constant loss qty. before change 変更前固定ロス数量.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty_bef(double value) {
		setConstNumber(offset + 139, $base_unit_fxd_loss_qty_bef, value);
	}


	public String getString(String name) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			return alt_grp_nm();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_conv_rnd_typ();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($inst_lot_no.equalsIgnoreCase(name)) {
			return inst_lot_no();
		}
		if ($inst_sublot_no.equalsIgnoreCase(name)) {
			return inst_sublot_no();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		if ($acxfr_act_rsn_cd.equalsIgnoreCase(name)) {
			return acxfr_act_rsn_cd();
		}
		if ($acxfr_act_rsn_nm.equalsIgnoreCase(name)) {
			return acxfr_act_rsn_nm();
		}
		if ($acxfr_act_bd_dpt_cd.equalsIgnoreCase(name)) {
			return acxfr_act_bd_dpt_cd();
		}
		if ($acxfr_act_bd_dpt_nm.equalsIgnoreCase(name)) {
			return acxfr_act_bd_dpt_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
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
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($inst_sno1.equalsIgnoreCase(name)) {
			return inst_sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($inst_sno2.equalsIgnoreCase(name)) {
			return inst_sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($inst_sno3.equalsIgnoreCase(name)) {
			return inst_sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($inst_sno4.equalsIgnoreCase(name)) {
			return inst_sno4();
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			return bkf_typ();
		}
		if ($bkf_typ_nm.equalsIgnoreCase(name)) {
			return bkf_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			return inpt_rsn_cd();
		}
		if ($inpt_rsn_nm.equalsIgnoreCase(name)) {
			return inpt_rsn_nm();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_loc_nm.equalsIgnoreCase(name)) {
			return inpt_loc_nm();
		}
		if ($inpt_loc_sppl_cd.equalsIgnoreCase(name)) {
			return inpt_loc_sppl_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($inpt_str_ln_nm.equalsIgnoreCase(name)) {
			return inpt_str_ln_nm();
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
		}
		if ($inpt_act_intr_rmrks.equalsIgnoreCase(name)) {
			return inpt_act_intr_rmrks();
		}
		if ($inpt_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return inpt_act_rpt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($inpt_act_sub_char1.equalsIgnoreCase(name)) {
			return inpt_act_sub_char1();
		}
		if ($inpt_act_sub_char2.equalsIgnoreCase(name)) {
			return inpt_act_sub_char2();
		}
		if ($inpt_act_sub_char3.equalsIgnoreCase(name)) {
			return inpt_act_sub_char3();
		}
		if ($inpt_schd_ver_no.equalsIgnoreCase(name)) {
			return inpt_schd_ver_no();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($stk_mng_typ_nm.equalsIgnoreCase(name)) {
			return stk_mng_typ_nm();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			return prov_typ_nm();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			return alt_itm_typ_nm();
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			return alloc_ctl_typ();
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			return inpt_act_no();
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			return mes_id();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			return ext_inpt_act_no();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_sts_typ_nm();
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
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			return base_unit_loss_qty();
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_loss_qty();
		}
		if ($base_unit_schd_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_schd_inpt_qty();
		}
		if ($base_unit_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_schd_fxd_rqmt_qty();
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_rem_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_qty();
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			return cont_loss_qty();
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			return cont_fxd_loss_qty();
		}
		if ($cont_schd_inpt_qty.equalsIgnoreCase(name)) {
			return cont_schd_inpt_qty();
		}
		if ($cont_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_schd_fxd_rqmt_qty();
		}
		if ($cont_acxfr_act_qty.equalsIgnoreCase(name)) {
			return cont_acxfr_act_qty();
		}
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			return acxfr_act_qty();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			return oper_disp_seq();
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			return base_unit_alt_qty();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			return recalc_grp();
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			return recalc_grp_seq();
		}
		if ($base_unit_inpt_qty_bef.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty_bef();
		}
		if ($base_unit_fxd_loss_qty_bef.equalsIgnoreCase(name)) {
			return base_unit_fxd_loss_qty_bef();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($act_dt.equalsIgnoreCase(name)) {
			return act_dt();
		}
		if ($act_hm.equalsIgnoreCase(name)) {
			return act_hm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($schd_dt.equalsIgnoreCase(name)) {
			return schd_dt();
		}
		if ($schd_hm.equalsIgnoreCase(name)) {
			return schd_hm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			return alt_itm_fix_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
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
		if ($inpt_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return inpt_str_ln_tgt_flg();
		}
		if ($inpt_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd_none_flg();
		}
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			return main_itm_flg();
		}
		if ($bkf_upd_flg.equalsIgnoreCase(name)) {
			return bkf_upd_flg();
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
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			return if_auto_reg_flg();
		}
		if ($loss_qty_enable_flg.equalsIgnoreCase(name)) {
			return loss_qty_enable_flg();
		}
		if ($fxd_loss_qty_enable_flg.equalsIgnoreCase(name)) {
			return fxd_loss_qty_enable_flg();
		}
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($lot_prop_tgt_flg.equalsIgnoreCase(name)) {
			return lot_prop_tgt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			return alt_grp_nm();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_conv_rnd_typ();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($inst_lot_no.equalsIgnoreCase(name)) {
			return inst_lot_no();
		}
		if ($inst_sublot_no.equalsIgnoreCase(name)) {
			return inst_sublot_no();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		if ($acxfr_act_rsn_cd.equalsIgnoreCase(name)) {
			return acxfr_act_rsn_cd();
		}
		if ($acxfr_act_rsn_nm.equalsIgnoreCase(name)) {
			return acxfr_act_rsn_nm();
		}
		if ($acxfr_act_bd_dpt_cd.equalsIgnoreCase(name)) {
			return acxfr_act_bd_dpt_cd();
		}
		if ($acxfr_act_bd_dpt_nm.equalsIgnoreCase(name)) {
			return acxfr_act_bd_dpt_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
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
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($inst_sno1.equalsIgnoreCase(name)) {
			return inst_sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($inst_sno2.equalsIgnoreCase(name)) {
			return inst_sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($inst_sno3.equalsIgnoreCase(name)) {
			return inst_sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($inst_sno4.equalsIgnoreCase(name)) {
			return inst_sno4();
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			return bkf_typ();
		}
		if ($bkf_typ_nm.equalsIgnoreCase(name)) {
			return bkf_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			return inpt_rsn_cd();
		}
		if ($inpt_rsn_nm.equalsIgnoreCase(name)) {
			return inpt_rsn_nm();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_loc_nm.equalsIgnoreCase(name)) {
			return inpt_loc_nm();
		}
		if ($inpt_loc_sppl_cd.equalsIgnoreCase(name)) {
			return inpt_loc_sppl_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($inpt_str_ln_nm.equalsIgnoreCase(name)) {
			return inpt_str_ln_nm();
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
		}
		if ($inpt_act_intr_rmrks.equalsIgnoreCase(name)) {
			return inpt_act_intr_rmrks();
		}
		if ($inpt_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return inpt_act_rpt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($inpt_act_sub_char1.equalsIgnoreCase(name)) {
			return inpt_act_sub_char1();
		}
		if ($inpt_act_sub_char2.equalsIgnoreCase(name)) {
			return inpt_act_sub_char2();
		}
		if ($inpt_act_sub_char3.equalsIgnoreCase(name)) {
			return inpt_act_sub_char3();
		}
		if ($inpt_schd_ver_no.equalsIgnoreCase(name)) {
			return inpt_schd_ver_no();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($stk_mng_typ_nm.equalsIgnoreCase(name)) {
			return stk_mng_typ_nm();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			return prov_typ_nm();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			return alt_itm_typ_nm();
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			return alloc_ctl_typ();
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			return inpt_act_no();
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			return mes_id();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			return ext_inpt_act_no();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_sts_typ_nm();
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
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			return base_unit_loss_qty();
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_loss_qty();
		}
		if ($base_unit_schd_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_schd_inpt_qty();
		}
		if ($base_unit_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_schd_fxd_rqmt_qty();
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_rem_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_qty();
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			return cont_loss_qty();
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			return cont_fxd_loss_qty();
		}
		if ($cont_schd_inpt_qty.equalsIgnoreCase(name)) {
			return cont_schd_inpt_qty();
		}
		if ($cont_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_schd_fxd_rqmt_qty();
		}
		if ($cont_acxfr_act_qty.equalsIgnoreCase(name)) {
			return cont_acxfr_act_qty();
		}
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			return acxfr_act_qty();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			return oper_disp_seq();
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			return base_unit_alt_qty();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			return recalc_grp();
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			return recalc_grp_seq();
		}
		if ($base_unit_inpt_qty_bef.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty_bef();
		}
		if ($base_unit_fxd_loss_qty_bef.equalsIgnoreCase(name)) {
			return base_unit_fxd_loss_qty_bef();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($act_dt.equalsIgnoreCase(name)) {
			return act_dt();
		}
		if ($act_hm.equalsIgnoreCase(name)) {
			return act_hm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($schd_dt.equalsIgnoreCase(name)) {
			return schd_dt();
		}
		if ($schd_hm.equalsIgnoreCase(name)) {
			return schd_hm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			return alt_itm_fix_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
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
		if ($inpt_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return inpt_str_ln_tgt_flg();
		}
		if ($inpt_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd_none_flg();
		}
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			return main_itm_flg();
		}
		if ($bkf_upd_flg.equalsIgnoreCase(name)) {
			return bkf_upd_flg();
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
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			return if_auto_reg_flg();
		}
		if ($loss_qty_enable_flg.equalsIgnoreCase(name)) {
			return loss_qty_enable_flg();
		}
		if ($fxd_loss_qty_enable_flg.equalsIgnoreCase(name)) {
			return fxd_loss_qty_enable_flg();
		}
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($lot_prop_tgt_flg.equalsIgnoreCase(name)) {
			return lot_prop_tgt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			alt_grp_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_conv_rnd_typ(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
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
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
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
		if ($inst_lot_no.equalsIgnoreCase(name)) {
			inst_lot_no(value);
			return;
		}
		if ($inst_sublot_no.equalsIgnoreCase(name)) {
			inst_sublot_no(value);
			return;
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
			return;
		}
		if ($acxfr_act_rsn_cd.equalsIgnoreCase(name)) {
			acxfr_act_rsn_cd(value);
			return;
		}
		if ($acxfr_act_rsn_nm.equalsIgnoreCase(name)) {
			acxfr_act_rsn_nm(value);
			return;
		}
		if ($acxfr_act_bd_dpt_cd.equalsIgnoreCase(name)) {
			acxfr_act_bd_dpt_cd(value);
			return;
		}
		if ($acxfr_act_bd_dpt_nm.equalsIgnoreCase(name)) {
			acxfr_act_bd_dpt_nm(value);
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
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($inst_sno1.equalsIgnoreCase(name)) {
			inst_sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($inst_sno2.equalsIgnoreCase(name)) {
			inst_sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($inst_sno3.equalsIgnoreCase(name)) {
			inst_sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($inst_sno4.equalsIgnoreCase(name)) {
			inst_sno4(value);
			return;
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			bkf_typ(value);
			return;
		}
		if ($bkf_typ_nm.equalsIgnoreCase(name)) {
			bkf_typ_nm(value);
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
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			inpt_rsn_cd(value);
			return;
		}
		if ($inpt_rsn_nm.equalsIgnoreCase(name)) {
			inpt_rsn_nm(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_loc_nm.equalsIgnoreCase(name)) {
			inpt_loc_nm(value);
			return;
		}
		if ($inpt_loc_sppl_cd.equalsIgnoreCase(name)) {
			inpt_loc_sppl_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
			return;
		}
		if ($inpt_str_ln_nm.equalsIgnoreCase(name)) {
			inpt_str_ln_nm(value);
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inst_rpt_rmrks(value);
			return;
		}
		if ($inpt_act_intr_rmrks.equalsIgnoreCase(name)) {
			inpt_act_intr_rmrks(value);
			return;
		}
		if ($inpt_act_rpt_rmrks.equalsIgnoreCase(name)) {
			inpt_act_rpt_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($inpt_act_sub_char1.equalsIgnoreCase(name)) {
			inpt_act_sub_char1(value);
			return;
		}
		if ($inpt_act_sub_char2.equalsIgnoreCase(name)) {
			inpt_act_sub_char2(value);
			return;
		}
		if ($inpt_act_sub_char3.equalsIgnoreCase(name)) {
			inpt_act_sub_char3(value);
			return;
		}
		if ($inpt_schd_ver_no.equalsIgnoreCase(name)) {
			inpt_schd_ver_no(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($stk_mng_typ_nm.equalsIgnoreCase(name)) {
			stk_mng_typ_nm(value);
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
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
			return;
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			alt_itm_typ_nm(value);
			return;
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			alloc_ctl_typ(value);
			return;
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			inpt_act_no(value);
			return;
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			mes_id(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			ext_inpt_act_no(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_sts_typ_nm(value);
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
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($base_unit_schd_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_schd_inpt_qty(value);
			return;
		}
		if ($base_unit_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_schd_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
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
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		if ($cont_schd_inpt_qty.equalsIgnoreCase(name)) {
			cont_schd_inpt_qty(value);
			return;
		}
		if ($cont_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_schd_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_acxfr_act_qty.equalsIgnoreCase(name)) {
			cont_acxfr_act_qty(value);
			return;
		}
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			acxfr_act_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty_bef.equalsIgnoreCase(name)) {
			base_unit_inpt_qty_bef(value);
			return;
		}
		if ($base_unit_fxd_loss_qty_bef.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty_bef(value);
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
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($base_unit_schd_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_schd_inpt_qty(value);
			return;
		}
		if ($base_unit_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_schd_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
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
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		if ($cont_schd_inpt_qty.equalsIgnoreCase(name)) {
			cont_schd_inpt_qty(value);
			return;
		}
		if ($cont_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_schd_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_acxfr_act_qty.equalsIgnoreCase(name)) {
			cont_acxfr_act_qty(value);
			return;
		}
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			acxfr_act_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty_bef.equalsIgnoreCase(name)) {
			base_unit_inpt_qty_bef(value);
			return;
		}
		if ($base_unit_fxd_loss_qty_bef.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty_bef(value);
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
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($base_unit_schd_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_schd_inpt_qty(value);
			return;
		}
		if ($base_unit_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_schd_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
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
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		if ($cont_schd_inpt_qty.equalsIgnoreCase(name)) {
			cont_schd_inpt_qty(value);
			return;
		}
		if ($cont_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_schd_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_acxfr_act_qty.equalsIgnoreCase(name)) {
			cont_acxfr_act_qty(value);
			return;
		}
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			acxfr_act_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty_bef.equalsIgnoreCase(name)) {
			base_unit_inpt_qty_bef(value);
			return;
		}
		if ($base_unit_fxd_loss_qty_bef.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty_bef(value);
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
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($base_unit_schd_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_schd_inpt_qty(value);
			return;
		}
		if ($base_unit_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_schd_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
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
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		if ($cont_schd_inpt_qty.equalsIgnoreCase(name)) {
			cont_schd_inpt_qty(value);
			return;
		}
		if ($cont_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_schd_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_acxfr_act_qty.equalsIgnoreCase(name)) {
			cont_acxfr_act_qty(value);
			return;
		}
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			acxfr_act_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty_bef.equalsIgnoreCase(name)) {
			base_unit_inpt_qty_bef(value);
			return;
		}
		if ($base_unit_fxd_loss_qty_bef.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty_bef(value);
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
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($base_unit_schd_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_schd_inpt_qty(value);
			return;
		}
		if ($base_unit_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_schd_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
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
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		if ($cont_schd_inpt_qty.equalsIgnoreCase(name)) {
			cont_schd_inpt_qty(value);
			return;
		}
		if ($cont_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_schd_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_acxfr_act_qty.equalsIgnoreCase(name)) {
			cont_acxfr_act_qty(value);
			return;
		}
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			acxfr_act_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty_bef.equalsIgnoreCase(name)) {
			base_unit_inpt_qty_bef(value);
			return;
		}
		if ($base_unit_fxd_loss_qty_bef.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty_bef(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		if ($act_dt.equalsIgnoreCase(name)) {
			act_dt(value);
			return;
		}
		if ($act_hm.equalsIgnoreCase(name)) {
			act_hm(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($schd_dt.equalsIgnoreCase(name)) {
			schd_dt(value);
			return;
		}
		if ($schd_hm.equalsIgnoreCase(name)) {
			schd_hm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			alt_itm_fix_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
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
		if ($inpt_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			inpt_str_ln_tgt_flg(value);
			return;
		}
		if ($inpt_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			inpt_str_ln_cd_none_flg(value);
			return;
		}
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			main_itm_flg(value);
			return;
		}
		if ($bkf_upd_flg.equalsIgnoreCase(name)) {
			bkf_upd_flg(value);
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
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			if_auto_reg_flg(value);
			return;
		}
		if ($loss_qty_enable_flg.equalsIgnoreCase(name)) {
			loss_qty_enable_flg(value);
			return;
		}
		if ($fxd_loss_qty_enable_flg.equalsIgnoreCase(name)) {
			fxd_loss_qty_enable_flg(value);
			return;
		}
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($lot_prop_tgt_flg.equalsIgnoreCase(name)) {
			lot_prop_tgt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			alt_grp_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_conv_rnd_typ(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
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
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
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
		if ($inst_lot_no.equalsIgnoreCase(name)) {
			inst_lot_no(value);
			return;
		}
		if ($inst_sublot_no.equalsIgnoreCase(name)) {
			inst_sublot_no(value);
			return;
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
			return;
		}
		if ($acxfr_act_rsn_cd.equalsIgnoreCase(name)) {
			acxfr_act_rsn_cd(value);
			return;
		}
		if ($acxfr_act_rsn_nm.equalsIgnoreCase(name)) {
			acxfr_act_rsn_nm(value);
			return;
		}
		if ($acxfr_act_bd_dpt_cd.equalsIgnoreCase(name)) {
			acxfr_act_bd_dpt_cd(value);
			return;
		}
		if ($acxfr_act_bd_dpt_nm.equalsIgnoreCase(name)) {
			acxfr_act_bd_dpt_nm(value);
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
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($inst_sno1.equalsIgnoreCase(name)) {
			inst_sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($inst_sno2.equalsIgnoreCase(name)) {
			inst_sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($inst_sno3.equalsIgnoreCase(name)) {
			inst_sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($inst_sno4.equalsIgnoreCase(name)) {
			inst_sno4(value);
			return;
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			bkf_typ(value);
			return;
		}
		if ($bkf_typ_nm.equalsIgnoreCase(name)) {
			bkf_typ_nm(value);
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
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			inpt_rsn_cd(value);
			return;
		}
		if ($inpt_rsn_nm.equalsIgnoreCase(name)) {
			inpt_rsn_nm(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_loc_nm.equalsIgnoreCase(name)) {
			inpt_loc_nm(value);
			return;
		}
		if ($inpt_loc_sppl_cd.equalsIgnoreCase(name)) {
			inpt_loc_sppl_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
			return;
		}
		if ($inpt_str_ln_nm.equalsIgnoreCase(name)) {
			inpt_str_ln_nm(value);
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inst_rpt_rmrks(value);
			return;
		}
		if ($inpt_act_intr_rmrks.equalsIgnoreCase(name)) {
			inpt_act_intr_rmrks(value);
			return;
		}
		if ($inpt_act_rpt_rmrks.equalsIgnoreCase(name)) {
			inpt_act_rpt_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($inpt_act_sub_char1.equalsIgnoreCase(name)) {
			inpt_act_sub_char1(value);
			return;
		}
		if ($inpt_act_sub_char2.equalsIgnoreCase(name)) {
			inpt_act_sub_char2(value);
			return;
		}
		if ($inpt_act_sub_char3.equalsIgnoreCase(name)) {
			inpt_act_sub_char3(value);
			return;
		}
		if ($inpt_schd_ver_no.equalsIgnoreCase(name)) {
			inpt_schd_ver_no(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($stk_mng_typ_nm.equalsIgnoreCase(name)) {
			stk_mng_typ_nm(value);
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
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
			return;
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			alt_itm_typ_nm(value);
			return;
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			alloc_ctl_typ(value);
			return;
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			inpt_act_no(value);
			return;
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			mes_id(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			ext_inpt_act_no(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_sts_typ_nm(value);
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
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($base_unit_schd_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_schd_inpt_qty(value);
			return;
		}
		if ($base_unit_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_schd_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
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
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		if ($cont_schd_inpt_qty.equalsIgnoreCase(name)) {
			cont_schd_inpt_qty(value);
			return;
		}
		if ($cont_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_schd_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_acxfr_act_qty.equalsIgnoreCase(name)) {
			cont_acxfr_act_qty(value);
			return;
		}
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			acxfr_act_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty_bef.equalsIgnoreCase(name)) {
			base_unit_inpt_qty_bef(value);
			return;
		}
		if ($base_unit_fxd_loss_qty_bef.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty_bef(value);
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
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($base_unit_schd_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_schd_inpt_qty(value);
			return;
		}
		if ($base_unit_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_schd_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
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
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		if ($cont_schd_inpt_qty.equalsIgnoreCase(name)) {
			cont_schd_inpt_qty(value);
			return;
		}
		if ($cont_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_schd_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_acxfr_act_qty.equalsIgnoreCase(name)) {
			cont_acxfr_act_qty(value);
			return;
		}
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			acxfr_act_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty_bef.equalsIgnoreCase(name)) {
			base_unit_inpt_qty_bef(value);
			return;
		}
		if ($base_unit_fxd_loss_qty_bef.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty_bef(value);
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
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($base_unit_schd_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_schd_inpt_qty(value);
			return;
		}
		if ($base_unit_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_schd_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
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
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		if ($cont_schd_inpt_qty.equalsIgnoreCase(name)) {
			cont_schd_inpt_qty(value);
			return;
		}
		if ($cont_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_schd_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_acxfr_act_qty.equalsIgnoreCase(name)) {
			cont_acxfr_act_qty(value);
			return;
		}
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			acxfr_act_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty_bef.equalsIgnoreCase(name)) {
			base_unit_inpt_qty_bef(value);
			return;
		}
		if ($base_unit_fxd_loss_qty_bef.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty_bef(value);
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
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($base_unit_schd_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_schd_inpt_qty(value);
			return;
		}
		if ($base_unit_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_schd_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
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
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		if ($cont_schd_inpt_qty.equalsIgnoreCase(name)) {
			cont_schd_inpt_qty(value);
			return;
		}
		if ($cont_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_schd_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_acxfr_act_qty.equalsIgnoreCase(name)) {
			cont_acxfr_act_qty(value);
			return;
		}
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			acxfr_act_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty_bef.equalsIgnoreCase(name)) {
			base_unit_inpt_qty_bef(value);
			return;
		}
		if ($base_unit_fxd_loss_qty_bef.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty_bef(value);
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
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_loss_qty.equalsIgnoreCase(name)) {
			base_unit_loss_qty(value);
			return;
		}
		if ($base_unit_fxd_loss_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty(value);
			return;
		}
		if ($base_unit_schd_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_schd_inpt_qty(value);
			return;
		}
		if ($base_unit_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_schd_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
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
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		if ($cont_fxd_loss_qty.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty(value);
			return;
		}
		if ($cont_schd_inpt_qty.equalsIgnoreCase(name)) {
			cont_schd_inpt_qty(value);
			return;
		}
		if ($cont_schd_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_schd_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_acxfr_act_qty.equalsIgnoreCase(name)) {
			cont_acxfr_act_qty(value);
			return;
		}
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			acxfr_act_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty_bef.equalsIgnoreCase(name)) {
			base_unit_inpt_qty_bef(value);
			return;
		}
		if ($base_unit_fxd_loss_qty_bef.equalsIgnoreCase(name)) {
			base_unit_fxd_loss_qty_bef(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		if ($act_dt.equalsIgnoreCase(name)) {
			act_dt(value);
			return;
		}
		if ($act_hm.equalsIgnoreCase(name)) {
			act_hm(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($schd_dt.equalsIgnoreCase(name)) {
			schd_dt(value);
			return;
		}
		if ($schd_hm.equalsIgnoreCase(name)) {
			schd_hm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			alt_itm_fix_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
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
		if ($inpt_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			inpt_str_ln_tgt_flg(value);
			return;
		}
		if ($inpt_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			inpt_str_ln_cd_none_flg(value);
			return;
		}
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			main_itm_flg(value);
			return;
		}
		if ($bkf_upd_flg.equalsIgnoreCase(name)) {
			bkf_upd_flg(value);
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
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			if_auto_reg_flg(value);
			return;
		}
		if ($loss_qty_enable_flg.equalsIgnoreCase(name)) {
			loss_qty_enable_flg(value);
			return;
		}
		if ($fxd_loss_qty_enable_flg.equalsIgnoreCase(name)) {
			fxd_loss_qty_enable_flg(value);
			return;
		}
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($lot_prop_tgt_flg.equalsIgnoreCase(name)) {
			lot_prop_tgt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

