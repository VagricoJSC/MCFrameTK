package mcframe.serverMSBC.MSBCL6050;

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
 * ブロック"MfgActReg_Chk01_DtlInpt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgActReg_Chk01_DtlInptR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
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
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
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
	 * Item cd. before update 更新前品目ＣＤ.<p>
	 *
	 */
	public static final String $old_itm_cd = "old_itm_cd";
	/**
	 * Branch No. 1 before update 更新前枝番１.<p>
	 *
	 */
	public static final String $old_itm_sub1 = "old_itm_sub1";
	/**
	 * Branch No. 2 before update 更新前枝番２.<p>
	 *
	 */
	public static final String $old_itm_sub2 = "old_itm_sub2";
	/**
	 * Branch No. 3 before update 更新前枝番３.<p>
	 *
	 */
	public static final String $old_itm_sub3 = "old_itm_sub3";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type details 品目区分詳細.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
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
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_conv_rnd_typ = "base_unit_conv_rnd_typ";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
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
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public static final String $cont_fctr_unit_cd = "cont_fctr_unit_cd";
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
	public static final String $inpt_lot_no = "inpt_lot_no";
	/**
	 * Sublot No. (Order) サブロットＮＯ(指図).<p>
	 *
	 */
	public static final String $inpt_sublot_no = "inpt_sublot_no";
	/**
	 * Version No. (Lot info.) 版ＮＯ（ロット情報）.<p>
	 *
	 */
	public static final String $lot_ver_no = "lot_ver_no";
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
	 * Other accounting transfer charged dept. cd. 他勘定振替負担部門ＣＤ.<p>
	 *
	 */
	public static final String $acxfr_act_bd_dpt_cd = "acxfr_act_bd_dpt_cd";
	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public static final String $act_tm = "act_tm";
	/**
	 * Input recording date 投入計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
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
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public static final String $inpt_rsn_cd = "inpt_rsn_cd";
	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public static final String $inpt_loc_cd = "inpt_loc_cd";
	/**
	 * Input location cd. before update 更新前投入場所ＣＤ.<p>
	 *
	 */
	public static final String $old_inpt_loc_cd = "old_inpt_loc_cd";
	/**
	 * For input location rack/line 投入場所棚・ライン対象.<p>
	 *
	 */
	public static final String $inpt_str_ln_tgt_flg = "inpt_str_ln_tgt_flg";
	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $inpt_str_ln_cd = "inpt_str_ln_cd";
	/**
	 * Input location supplier cd. 投入場所発注先ＣＤ.<p>
	 *
	 */
	public static final String $inpt_loc_sppl_cd = "inpt_loc_sppl_cd";
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 * Inventory identification type before update 更新前在庫識別区分.<p>
	 *
	 */
	public static final String $old_stk_id_typ = "old_stk_id_typ";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * Arriving point cd. 着荷先ＣＤ.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	/**
	 * Arrival point cd. before update 更新前着荷先ＣＤ.<p>
	 *
	 */
	public static final String $old_stk_arrv_bp_cd = "old_stk_arrv_bp_cd";
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
	 * Backflush update バックフラッシュ更新.<p>
	 *
	 */
	public static final String $bkf_upd_flg = "bkf_upd_flg";
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
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
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
	 * Number of alternative sources 代替元数.<p>
	 *
	 */
	public static final String $base_unit_alt_qty = "base_unit_alt_qty";
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
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
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
	 * Base unit standard input qty. 基準単位標準投入数量.<p>
	 *
	 */
	public static final String $base_unit_std_qty = "base_unit_std_qty";
	/**
	 * Add 追加.<p>
	 *
	 */
	public static final String $add_flg = "add_flg";
	/**
	 * Version No. before update 更新前版ＮＯ.<p>
	 *
	 */
	public static final String $old_ver_no = "old_ver_no";
	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public static final String $main_itm_flg = "main_itm_flg";
	/**
	 * Lot conforming type (For check) ロット良品区分（チェック用）.<p>
	 *
	 */
	public static final String $lot_quality_typ = "lot_quality_typ";
	/**
	 * Subcontractor (For check) 外注先（チェック用）.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Input reason complement flg. 投入理由補完ＦＬＧ.<p>
	 *
	 */
	public static final String $inpt_rsn_comp_flg = "inpt_rsn_comp_flg";
	/**
	 * Do not complement reason for input 投入理由補完しない.<p>
	 *
	 */
	public static final String $inpt_rsn_not_comp_flg = "inpt_rsn_not_comp_flg";
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
	 * External input result No. 外部投入実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_inpt_act_no = "ext_inpt_act_no";
	/**
	 * IF auto-create ＩＦ自動作成.<p>
	 *
	 */
	public static final String $if_auto_reg_flg = "if_auto_reg_flg";
	public static final String $is_only_abort_flg = "is_only_abort_flg";


	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_peg_no_META = createCommonMeta($oper_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_seq_META = createCommonMeta($alt_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alt_itm_fix_flg_META = createCommonMeta($alt_itm_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta old_itm_cd_META = createCommonMeta($old_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta old_itm_sub1_META = createCommonMeta($old_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta old_itm_sub2_META = createCommonMeta($old_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta old_itm_sub3_META = createCommonMeta($old_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_inpt_qty_META = createCommonMeta($base_unit_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_conv_rnd_typ_META = createCommonMeta($base_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta cont_inpt_qty_META = createCommonMeta($cont_inpt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta inpt_lot_no_META = createCommonMeta($inpt_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta inpt_sublot_no_META = createCommonMeta($inpt_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta lot_ver_no_META = createCommonMeta($lot_ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta first_gr_dt_META = createCommonMeta($first_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_seq_META = createCommonMeta($lot_seq, mcframe.commonMA.meta.MA_META.LOT_SEQ);
	public static final MCMeta acxfr_act_qty_META = createCommonMeta($acxfr_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta acxfr_act_rsn_cd_META = createCommonMeta($acxfr_act_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta acxfr_act_bd_dpt_cd_META = createCommonMeta($acxfr_act_bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_tm_META = createCommonMeta($act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
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
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta inpt_rsn_cd_META = createCommonMeta($inpt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta inpt_loc_cd_META = createCommonMeta($inpt_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta old_inpt_loc_cd_META = createCommonMeta($old_inpt_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inpt_str_ln_tgt_flg_META = createCommonMeta($inpt_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_str_ln_cd_META = createCommonMeta($inpt_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta inpt_loc_sppl_cd_META = createCommonMeta($inpt_loc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta old_stk_id_typ_META = createCommonMeta($old_stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta old_stk_arrv_bp_cd_META = createCommonMeta($old_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta inpt_act_intr_rmrks_META = createCommonMeta($inpt_act_intr_rmrks, mcframe.commonMS.meta.MS_META.INPT_ACT_INTR_RMRKS);
	public static final MCMeta inpt_act_rpt_rmrks_META = createCommonMeta($inpt_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.INPT_ACT_RPT_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta inpt_act_sub_char1_META = createCommonMeta($inpt_act_sub_char1, mcframe.commonMS.meta.MS_META.INPT_ACT_SUB_CHAR1);
	public static final MCMeta inpt_act_sub_char2_META = createCommonMeta($inpt_act_sub_char2, mcframe.commonMS.meta.MS_META.INPT_ACT_SUB_CHAR2);
	public static final MCMeta inpt_act_sub_char3_META = createCommonMeta($inpt_act_sub_char3, mcframe.commonMS.meta.MS_META.INPT_ACT_SUB_CHAR3);
	public static final MCMeta bkf_upd_flg_META = createCommonMeta($bkf_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_mix_flg_META = createCommonMeta($lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_mix_flg_META = createCommonMeta($sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta alt_itm_typ_META = createCommonMeta($alt_itm_typ, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP);
	public static final MCMeta alt_alloc_prio_META = createCommonMeta($alt_alloc_prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta base_unit_alt_qty_META = createCommonMeta($base_unit_alt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_ctl_typ_META = createCommonMeta($alloc_ctl_typ, mcframe.commonMA.meta.MA_META.ALLOC_CTL_TYP);
	public static final MCMeta inpt_schd_no_META = createCommonMeta($inpt_schd_no, mcframe.commonMA.meta.MA_META.INPT_SCHD_NO);
	public static final MCMeta inpt_act_no_META = createCommonMeta($inpt_act_no, mcframe.commonMA.meta.MA_META.INPT_ACT_NO);
	public static final MCMeta mes_id_META = createCommonMeta($mes_id, mcframe.commonMS.meta.MS_META.MES_ID);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta slf_support_cur_cd_META = createCommonMeta($slf_support_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta slf_support_upri_META = createCommonMeta($slf_support_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slf_support_tax_cd_META = createCommonMeta($slf_support_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta slf_support_xrate_cd_META = createCommonMeta($slf_support_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta slf_support_xrate_META = createCommonMeta($slf_support_xrate, mcframe.commonMA.meta.MA_META.XRATE);
	public static final MCMeta vmi_interim_flg_META = createCommonMeta($vmi_interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vmi_upri_META = createCommonMeta($vmi_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_unit_std_qty_META = createCommonMeta($base_unit_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta add_flg_META = createCommonMeta($add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_ver_no_META = createCommonMeta($old_ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta main_itm_flg_META = createCommonMeta($main_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_quality_typ_META = createCommonMeta($lot_quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta inpt_rsn_comp_flg_META = createCommonMeta($inpt_rsn_comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_rsn_not_comp_flg_META = createCommonMeta($inpt_rsn_not_comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mes_flg_META = createCommonMeta($mes_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_inpt_act_no_META = createCommonMeta($ext_inpt_act_no, mcframe.commonMA.meta.MA_META.EXT_INPT_ACT_NO);
	public static final MCMeta if_auto_reg_flg_META = createCommonMeta($if_auto_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_only_abort_flg_META = createCommonMeta($is_only_abort_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<MfgActReg_Chk01_DtlInptR> constMetas = new ConstMetaList<MfgActReg_Chk01_DtlInptR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			hdr_peg_no_META,
			oper_peg_no_META,
			peg_no_META,
			err_flg_META,
			oper_inst_no_META,
			alt_grp_cd_META,
			alt_grp_seq_META,
			alt_itm_fix_flg_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			old_itm_cd_META,
			old_itm_sub1_META,
			old_itm_sub2_META,
			old_itm_sub3_META,
			itm_typ_META,
			itm_typ_d_cd_META,
			ver_no_META,
			ver_flg_META,
			base_unit_inpt_qty_META,
			abort_flg_META,
			base_unit_cd_META,
			base_unit_conv_rnd_typ_META,
			base_unit_dec_place_META,
			cont_fctr_flg_META,
			cont_fctr_rnd_typ_META,
			cont_fctr_dec_place_META,
			act_cont_fctr_META,
			std_cont_fctr_META,
			cont_inpt_qty_META,
			cont_fctr_unit_cd_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			lot_no_META,
			sublot_no_META,
			inpt_lot_no_META,
			inpt_sublot_no_META,
			lot_ver_no_META,
			vld_dt_META,
			first_gr_dt_META,
			lot_seq_META,
			acxfr_act_qty_META,
			acxfr_act_rsn_cd_META,
			acxfr_act_bd_dpt_cd_META,
			act_tm_META,
			ac_dt_META,
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
			gd_cd_META,
			inpt_rsn_cd_META,
			inpt_loc_cd_META,
			old_inpt_loc_cd_META,
			inpt_str_ln_tgt_flg_META,
			inpt_str_ln_cd_META,
			inpt_loc_sppl_cd_META,
			stk_id_typ_META,
			old_stk_id_typ_META,
			stk_bp_cd_META,
			stk_arrv_bp_cd_META,
			old_stk_arrv_bp_cd_META,
			inpt_act_intr_rmrks_META,
			inpt_act_rpt_rmrks_META,
			trd_rmrks_META,
			inpt_act_sub_char1_META,
			inpt_act_sub_char2_META,
			inpt_act_sub_char3_META,
			bkf_upd_flg_META,
			lot_mix_flg_META,
			sublot_mix_flg_META,
			stk_mng_typ_META,
			prov_typ_META,
			alt_itm_typ_META,
			alt_alloc_prio_META,
			base_unit_alt_qty_META,
			alloc_flg_META,
			alloc_ctl_typ_META,
			inpt_schd_no_META,
			inpt_act_no_META,
			mes_id_META,
			data_no_META,
			can_ac_dt_META,
			slf_support_cur_cd_META,
			slf_support_upri_META,
			slf_support_tax_cd_META,
			slf_support_xrate_cd_META,
			slf_support_xrate_META,
			vmi_interim_flg_META,
			vmi_upri_META,
			base_unit_std_qty_META,
			add_flg_META,
			old_ver_no_META,
			main_itm_flg_META,
			lot_quality_typ_META,
			sppl_cd_META,
			wg_cd_META,
			inpt_rsn_comp_flg_META,
			inpt_rsn_not_comp_flg_META,
			mes_flg_META,
			ext_sys_cd_META,
			ext_inpt_act_no_META,
			if_auto_reg_flg_META,
			is_only_abort_flg_META
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
				{$hdr_peg_no, "E"},	// hdr_peg_no
				{$oper_peg_no, "E"},	// oper_peg_no
				{$peg_no, "E"},	// peg_no
				{$itm_cd, "E"},	// itm_cd
				{$base_unit_inpt_qty, "E"},	// base_unit_inpt_qty
				{$act_tm, "E"},	// act_tm
				{$ac_dt, "E"},	// ac_dt
				{$gd_cd, "E"},	// gd_cd
				{$inpt_loc_cd, "E"}	// inpt_loc_cd
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$base_unit_inpt_qty, "0:"}	// base_unit_inpt_qty
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
				{$can_ac_dt, "bfToday"}	// can_ac_dt
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
				{$peg_no, "E"}	// peg_no
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
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$acxfr_act_rsn_cd, "MA.MAUAL0010.InptAcxfrBizRsn"},	// acxfr_act_rsn_cd
				{$acxfr_act_bd_dpt_cd, "MA.MAUAL0010.Dpt"},	// acxfr_act_bd_dpt_cd
				{$gd_cd, "MA.MAUAL0010.StkGd"},	// gd_cd
				{$inpt_rsn_cd, "MA.MAUAL0010.InptBizRsn"},	// inpt_rsn_cd
				{$inpt_loc_cd, "MA.MAUAL0010.Loc"},	// inpt_loc_cd
				{$inpt_str_ln_cd, "MA.MAUAL0010.StrLn"},	// inpt_str_ln_cd
				{$stk_bp_cd, "MA.MAUAL0010.Bp"},	// stk_bp_cd
				{$stk_arrv_bp_cd, "MA.MAUAL0010.Bp"},	// stk_arrv_bp_cd
				{$old_stk_arrv_bp_cd, "MA.MAUAL0010.Bp"}	// old_stk_arrv_bp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_typ;itm_typ_d_cd;ver_flg;base_unit_cd;cont_fctr_flg;cont_fctr_rnd_typ;cont_fctr_dec_place;lot_mng_typ;sublot_mng_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;stk_mng_typ;base_unit_dec_place;cont_fctr_unit_cd;base_unit_conv_rnd_typ"},	// itm_sub3
				{$inpt_loc_cd, "inpt_loc_sppl_cd"}	// inpt_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_typ;itm_typ_d_cd;ver_flg;unit_cd;cont_fctr_flg;cont_fctr_rnd_typ;cont_fctr_dec_place;lot_mng_typ;sublot_mng_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;stk_mng_typ;dec_place;cont_fctr_unit_cd;rnd_typ"},	// itm_sub3
				{$inpt_loc_cd, "sppl_cd"}	// inpt_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_cd;itm_sub1;itm_sub2;MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_sub3
				{$acxfr_act_bd_dpt_cd, "MAC_DPT_IS_SRCH_TYP.BD;ac_dt"},	// acxfr_act_bd_dpt_cd
				{$inpt_loc_cd, "MAC_LOC_IS_SRCH_TYP.WG;wg_cd"},	// inpt_loc_cd
				{$inpt_str_ln_cd, "inpt_loc_cd;true"},	// inpt_str_ln_cd
				{$stk_bp_cd, "MAC_BP_IS_SRCH_TYP.SPPL;true"},	// stk_bp_cd
				{$stk_arrv_bp_cd, "MAC_BP_IS_SRCH_TYP.SPPL;true"},	// stk_arrv_bp_cd
				{$old_stk_arrv_bp_cd, "MAC_BP_IS_SRCH_TYP.SPPL;true"}	// old_stk_arrv_bp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_cd;itm_sub1;itm_sub2;itm_is_srch_typ"},	// itm_sub3
				{$acxfr_act_bd_dpt_cd, "dpt_is_srch_typ;dt"},	// acxfr_act_bd_dpt_cd
				{$inpt_loc_cd, "loc_is_srch_typ;wg_cd"},	// inpt_loc_cd
				{$inpt_str_ln_cd, "loc_cd;mode_nullval_flg"},	// inpt_str_ln_cd
				{$stk_bp_cd, "bp_is_srch_typ;mode_nullval_flg"},	// stk_bp_cd
				{$stk_arrv_bp_cd, "bp_is_srch_typ;mode_nullval_flg"},	// stk_arrv_bp_cd
				{$old_stk_arrv_bp_cd, "bp_is_srch_typ;mode_nullval_flg"}	// old_stk_arrv_bp_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$stk_id_typ, "MSC_STK_ID_TYP"},	// stk_id_typ
				{$old_stk_id_typ, "MSC_STK_ID_TYP"}	// old_stk_id_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$old_itm_sub1, "E"},	// old_itm_sub1
				{$old_itm_sub2, "E"},	// old_itm_sub2
				{$old_itm_sub3, "E"},	// old_itm_sub3
				{$lot_no, "E"},	// lot_no
				{$sublot_no, "E"},	// sublot_no
				{$sno1, "E"},	// sno1
				{$sno2, "E"},	// sno2
				{$sno3, "E"},	// sno3
				{$sno4, "E"},	// sno4
				{$inpt_str_ln_cd, "E"}	// inpt_str_ln_cd
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
	protected MfgActReg_Chk01_DtlInptR_MC_A(ConstMetaList<? extends MfgActReg_Chk01_DtlInptR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActReg_Chk01_DtlInptR clone() {
		return (MfgActReg_Chk01_DtlInptR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActReg_Chk01_DtlInptR createInstance() {
		return (MfgActReg_Chk01_DtlInptR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActReg_Chk01_DtlInptR getValues(String... names) {
		return (MfgActReg_Chk01_DtlInptR) super.getValues(names);
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
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 1, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}


	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public MCNumber oper_peg_no() {
		return getConstNumber(offset + 2, $oper_peg_no);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(MCNumber value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(int value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(long value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(float value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(double value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}


	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 3, $peg_no);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 3, $peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 3, $peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 3, $peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 3, $peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 3, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 4, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 4, $err_flg, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 5, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 5, $oper_inst_no, value);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 6, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 6, $alt_grp_cd, value);
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
	 * Item cd. before update 更新前品目ＣＤ.<p>
	 *
	 */
	public String old_itm_cd() {
		return getConstString(offset + 13, $old_itm_cd);
	}

	/**
	 * Item cd. before update 更新前品目ＣＤ.<p>
	 *
	 */
	public void old_itm_cd(String value) {
		setConstString(offset + 13, $old_itm_cd, value);
	}


	/**
	 * Branch No. 1 before update 更新前枝番１.<p>
	 *
	 */
	public String old_itm_sub1() {
		return getConstString(offset + 14, $old_itm_sub1);
	}

	/**
	 * Branch No. 1 before update 更新前枝番１.<p>
	 *
	 */
	public void old_itm_sub1(String value) {
		setConstString(offset + 14, $old_itm_sub1, value);
	}


	/**
	 * Branch No. 2 before update 更新前枝番２.<p>
	 *
	 */
	public String old_itm_sub2() {
		return getConstString(offset + 15, $old_itm_sub2);
	}

	/**
	 * Branch No. 2 before update 更新前枝番２.<p>
	 *
	 */
	public void old_itm_sub2(String value) {
		setConstString(offset + 15, $old_itm_sub2, value);
	}


	/**
	 * Branch No. 3 before update 更新前枝番３.<p>
	 *
	 */
	public String old_itm_sub3() {
		return getConstString(offset + 16, $old_itm_sub3);
	}

	/**
	 * Branch No. 3 before update 更新前枝番３.<p>
	 *
	 */
	public void old_itm_sub3(String value) {
		setConstString(offset + 16, $old_itm_sub3, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 17, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 17, $itm_typ, value);
	}


	/**
	 * Item type details 品目区分詳細.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 18, $itm_typ_d_cd);
	}

	/**
	 * Item type details 品目区分詳細.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 18, $itm_typ_d_cd, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 19, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 19, $ver_no, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 20, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 20, $ver_flg, value);
	}


	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_qty() {
		return getConstNumber(offset + 21, $base_unit_inpt_qty);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(MCNumber value) {
		setConstNumber(offset + 21, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(int value) {
		setConstNumber(offset + 21, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(long value) {
		setConstNumber(offset + 21, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(float value) {
		setConstNumber(offset + 21, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(double value) {
		setConstNumber(offset + 21, $base_unit_inpt_qty, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 22, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 22, $abort_flg, value);
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
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public String base_unit_conv_rnd_typ() {
		return getConstString(offset + 24, $base_unit_conv_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public void base_unit_conv_rnd_typ(String value) {
		setConstString(offset + 24, $base_unit_conv_rnd_typ, value);
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
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 26, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 26, $cont_fctr_flg, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 27, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 27, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 28, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 28, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 28, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 28, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 28, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 28, $cont_fctr_dec_place, value);
	}


	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 29, $act_cont_fctr);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 29, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 29, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 29, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 29, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 29, $act_cont_fctr, value);
	}


	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 30, $std_cont_fctr);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 30, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 30, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 30, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 30, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 30, $std_cont_fctr, value);
	}


	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public MCNumber cont_inpt_qty() {
		return getConstNumber(offset + 31, $cont_inpt_qty);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(MCNumber value) {
		setConstNumber(offset + 31, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(int value) {
		setConstNumber(offset + 31, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(long value) {
		setConstNumber(offset + 31, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(float value) {
		setConstNumber(offset + 31, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(double value) {
		setConstNumber(offset + 31, $cont_inpt_qty, value);
	}


	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 32, $cont_fctr_unit_cd);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 32, $cont_fctr_unit_cd, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 33, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 33, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 34, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 34, $sublot_mng_typ, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 35, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 35, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 36, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 36, $sublot_no, value);
	}


	/**
	 * Lot No. (Order) ロットＮＯ(指図).<p>
	 *
	 */
	public String inpt_lot_no() {
		return getConstString(offset + 37, $inpt_lot_no);
	}

	/**
	 * Lot No. (Order) ロットＮＯ(指図).<p>
	 *
	 */
	public void inpt_lot_no(String value) {
		setConstString(offset + 37, $inpt_lot_no, value);
	}


	/**
	 * Sublot No. (Order) サブロットＮＯ(指図).<p>
	 *
	 */
	public String inpt_sublot_no() {
		return getConstString(offset + 38, $inpt_sublot_no);
	}

	/**
	 * Sublot No. (Order) サブロットＮＯ(指図).<p>
	 *
	 */
	public void inpt_sublot_no(String value) {
		setConstString(offset + 38, $inpt_sublot_no, value);
	}


	/**
	 * Version No. (Lot info.) 版ＮＯ（ロット情報）.<p>
	 *
	 */
	public String lot_ver_no() {
		return getConstString(offset + 39, $lot_ver_no);
	}

	/**
	 * Version No. (Lot info.) 版ＮＯ（ロット情報）.<p>
	 *
	 */
	public void lot_ver_no(String value) {
		setConstString(offset + 39, $lot_ver_no, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 40, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 40, $vld_dt, value);
	}


	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 41, $first_gr_dt);
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 41, $first_gr_dt, value);
	}


	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public String lot_seq() {
		return getConstString(offset + 42, $lot_seq);
	}

	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public void lot_seq(String value) {
		setConstString(offset + 42, $lot_seq, value);
	}


	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public MCNumber acxfr_act_qty() {
		return getConstNumber(offset + 43, $acxfr_act_qty);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_act_qty(MCNumber value) {
		setConstNumber(offset + 43, $acxfr_act_qty, value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_act_qty(int value) {
		setConstNumber(offset + 43, $acxfr_act_qty, value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_act_qty(long value) {
		setConstNumber(offset + 43, $acxfr_act_qty, value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_act_qty(float value) {
		setConstNumber(offset + 43, $acxfr_act_qty, value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_act_qty(double value) {
		setConstNumber(offset + 43, $acxfr_act_qty, value);
	}


	/**
	 * Other accounting transfer reason cd. 他勘定振替理由ＣＤ.<p>
	 *
	 */
	public String acxfr_act_rsn_cd() {
		return getConstString(offset + 44, $acxfr_act_rsn_cd);
	}

	/**
	 * Other accounting transfer reason cd. 他勘定振替理由ＣＤ.<p>
	 *
	 */
	public void acxfr_act_rsn_cd(String value) {
		setConstString(offset + 44, $acxfr_act_rsn_cd, value);
	}


	/**
	 * Other accounting transfer charged dept. cd. 他勘定振替負担部門ＣＤ.<p>
	 *
	 */
	public String acxfr_act_bd_dpt_cd() {
		return getConstString(offset + 45, $acxfr_act_bd_dpt_cd);
	}

	/**
	 * Other accounting transfer charged dept. cd. 他勘定振替負担部門ＣＤ.<p>
	 *
	 */
	public void acxfr_act_bd_dpt_cd(String value) {
		setConstString(offset + 45, $acxfr_act_bd_dpt_cd, value);
	}


	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public MCDate act_tm() {
		return getConstDate(offset + 46, $act_tm);
	}

	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public void act_tm(MCDate value) {
		setConstDate(offset + 46, $act_tm, value);
	}


	/**
	 * Input recording date 投入計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 47, $ac_dt);
	}

	/**
	 * Input recording date 投入計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 47, $ac_dt, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 48, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 48, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 49, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 49, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 50, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 50, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 51, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 51, $sno4_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 (Result) 手配ＮＯ１(実績).<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 52, $sno1);
	}

	/**
	 * SEIBAN No. 1 (Result) 手配ＮＯ１(実績).<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 52, $sno1, value);
	}


	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 53, $sno1_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 53, $sno1_null_flg, value);
	}


	/**
	 * SEIBAN No. 1 (Order) 手配ＮＯ１(指図).<p>
	 *
	 */
	public String inst_sno1() {
		return getConstString(offset + 54, $inst_sno1);
	}

	/**
	 * SEIBAN No. 1 (Order) 手配ＮＯ１(指図).<p>
	 *
	 */
	public void inst_sno1(String value) {
		setConstString(offset + 54, $inst_sno1, value);
	}


	/**
	 * SEIBAN No. 2 (Result) 手配ＮＯ２(実績).<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 55, $sno2);
	}

	/**
	 * SEIBAN No. 2 (Result) 手配ＮＯ２(実績).<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 55, $sno2, value);
	}


	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 56, $sno2_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 56, $sno2_null_flg, value);
	}


	/**
	 * SEIBAN No. 2 (Sales order) 手配ＮＯ２(指図).<p>
	 *
	 */
	public String inst_sno2() {
		return getConstString(offset + 57, $inst_sno2);
	}

	/**
	 * SEIBAN No. 2 (Sales order) 手配ＮＯ２(指図).<p>
	 *
	 */
	public void inst_sno2(String value) {
		setConstString(offset + 57, $inst_sno2, value);
	}


	/**
	 * SEIBAN No. 3 (Result) 手配ＮＯ３(実績).<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 58, $sno3);
	}

	/**
	 * SEIBAN No. 3 (Result) 手配ＮＯ３(実績).<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 58, $sno3, value);
	}


	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 59, $sno3_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 59, $sno3_null_flg, value);
	}


	/**
	 * SEIBAN No. 3 (Sales order) 手配ＮＯ３(指図).<p>
	 *
	 */
	public String inst_sno3() {
		return getConstString(offset + 60, $inst_sno3);
	}

	/**
	 * SEIBAN No. 3 (Sales order) 手配ＮＯ３(指図).<p>
	 *
	 */
	public void inst_sno3(String value) {
		setConstString(offset + 60, $inst_sno3, value);
	}


	/**
	 * SEIBAN No. 4 (Result) 手配ＮＯ４(実績).<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 61, $sno4);
	}

	/**
	 * SEIBAN No. 4 (Result) 手配ＮＯ４(実績).<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 61, $sno4, value);
	}


	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 62, $sno4_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 62, $sno4_null_flg, value);
	}


	/**
	 * SEIBAN No. 4 (Sales order) 手配ＮＯ４(指図).<p>
	 *
	 */
	public String inst_sno4() {
		return getConstString(offset + 63, $inst_sno4);
	}

	/**
	 * SEIBAN No. 4 (Sales order) 手配ＮＯ４(指図).<p>
	 *
	 */
	public void inst_sno4(String value) {
		setConstString(offset + 63, $inst_sno4, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 64, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 64, $gd_cd, value);
	}


	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public String inpt_rsn_cd() {
		return getConstString(offset + 65, $inpt_rsn_cd);
	}

	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public void inpt_rsn_cd(String value) {
		setConstString(offset + 65, $inpt_rsn_cd, value);
	}


	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public String inpt_loc_cd() {
		return getConstString(offset + 66, $inpt_loc_cd);
	}

	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public void inpt_loc_cd(String value) {
		setConstString(offset + 66, $inpt_loc_cd, value);
	}


	/**
	 * Input location cd. before update 更新前投入場所ＣＤ.<p>
	 *
	 */
	public String old_inpt_loc_cd() {
		return getConstString(offset + 67, $old_inpt_loc_cd);
	}

	/**
	 * Input location cd. before update 更新前投入場所ＣＤ.<p>
	 *
	 */
	public void old_inpt_loc_cd(String value) {
		setConstString(offset + 67, $old_inpt_loc_cd, value);
	}


	/**
	 * For input location rack/line 投入場所棚・ライン対象.<p>
	 *
	 */
	public boolean inpt_str_ln_tgt_flg() {
		return getConstBoolean(offset + 68, $inpt_str_ln_tgt_flg);
	}

	/**
	 * For input location rack/line 投入場所棚・ライン対象.<p>
	 *
	 */
	public void inpt_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 68, $inpt_str_ln_tgt_flg, value);
	}


	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public String inpt_str_ln_cd() {
		return getConstString(offset + 69, $inpt_str_ln_cd);
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public void inpt_str_ln_cd(String value) {
		setConstString(offset + 69, $inpt_str_ln_cd, value);
	}


	/**
	 * Input location supplier cd. 投入場所発注先ＣＤ.<p>
	 *
	 */
	public String inpt_loc_sppl_cd() {
		return getConstString(offset + 70, $inpt_loc_sppl_cd);
	}

	/**
	 * Input location supplier cd. 投入場所発注先ＣＤ.<p>
	 *
	 */
	public void inpt_loc_sppl_cd(String value) {
		setConstString(offset + 70, $inpt_loc_sppl_cd, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 71, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 71, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type before update 更新前在庫識別区分.<p>
	 *
	 */
	public String old_stk_id_typ() {
		return getConstString(offset + 72, $old_stk_id_typ);
	}

	/**
	 * Inventory identification type before update 更新前在庫識別区分.<p>
	 *
	 */
	public void old_stk_id_typ(String value) {
		setConstString(offset + 72, $old_stk_id_typ, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 73, $stk_bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 73, $stk_bp_cd, value);
	}


	/**
	 * Arriving point cd. 着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 74, $stk_arrv_bp_cd);
	}

	/**
	 * Arriving point cd. 着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 74, $stk_arrv_bp_cd, value);
	}


	/**
	 * Arrival point cd. before update 更新前着荷先ＣＤ.<p>
	 *
	 */
	public String old_stk_arrv_bp_cd() {
		return getConstString(offset + 75, $old_stk_arrv_bp_cd);
	}

	/**
	 * Arrival point cd. before update 更新前着荷先ＣＤ.<p>
	 *
	 */
	public void old_stk_arrv_bp_cd(String value) {
		setConstString(offset + 75, $old_stk_arrv_bp_cd, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String inpt_act_intr_rmrks() {
		return getConstString(offset + 76, $inpt_act_intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void inpt_act_intr_rmrks(String value) {
		setConstString(offset + 76, $inpt_act_intr_rmrks, value);
	}


	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public String inpt_act_rpt_rmrks() {
		return getConstString(offset + 77, $inpt_act_rpt_rmrks);
	}

	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public void inpt_act_rpt_rmrks(String value) {
		setConstString(offset + 77, $inpt_act_rpt_rmrks, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 78, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 78, $trd_rmrks, value);
	}


	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public String inpt_act_sub_char1() {
		return getConstString(offset + 79, $inpt_act_sub_char1);
	}

	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public void inpt_act_sub_char1(String value) {
		setConstString(offset + 79, $inpt_act_sub_char1, value);
	}


	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public String inpt_act_sub_char2() {
		return getConstString(offset + 80, $inpt_act_sub_char2);
	}

	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public void inpt_act_sub_char2(String value) {
		setConstString(offset + 80, $inpt_act_sub_char2, value);
	}


	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public String inpt_act_sub_char3() {
		return getConstString(offset + 81, $inpt_act_sub_char3);
	}

	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public void inpt_act_sub_char3(String value) {
		setConstString(offset + 81, $inpt_act_sub_char3, value);
	}


	/**
	 * Backflush update バックフラッシュ更新.<p>
	 *
	 */
	public boolean bkf_upd_flg() {
		return getConstBoolean(offset + 82, $bkf_upd_flg);
	}

	/**
	 * Backflush update バックフラッシュ更新.<p>
	 *
	 */
	public void bkf_upd_flg(boolean value) {
		setConstBoolean(offset + 82, $bkf_upd_flg, value);
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
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 85, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 85, $stk_mng_typ, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 86, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 86, $prov_typ, value);
	}


	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public String alt_itm_typ() {
		return getConstString(offset + 87, $alt_itm_typ);
	}

	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public void alt_itm_typ(String value) {
		setConstString(offset + 87, $alt_itm_typ, value);
	}


	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public MCNumber alt_alloc_prio() {
		return getConstNumber(offset + 88, $alt_alloc_prio);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(MCNumber value) {
		setConstNumber(offset + 88, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(int value) {
		setConstNumber(offset + 88, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(long value) {
		setConstNumber(offset + 88, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(float value) {
		setConstNumber(offset + 88, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(double value) {
		setConstNumber(offset + 88, $alt_alloc_prio, value);
	}


	/**
	 * Number of alternative sources 代替元数.<p>
	 *
	 */
	public MCNumber base_unit_alt_qty() {
		return getConstNumber(offset + 89, $base_unit_alt_qty);
	}

	/**
	 * Number of alternative sources 代替元数.<p>
	 *
	 */
	public void base_unit_alt_qty(MCNumber value) {
		setConstNumber(offset + 89, $base_unit_alt_qty, value);
	}

	/**
	 * Number of alternative sources 代替元数.<p>
	 *
	 */
	public void base_unit_alt_qty(int value) {
		setConstNumber(offset + 89, $base_unit_alt_qty, value);
	}

	/**
	 * Number of alternative sources 代替元数.<p>
	 *
	 */
	public void base_unit_alt_qty(long value) {
		setConstNumber(offset + 89, $base_unit_alt_qty, value);
	}

	/**
	 * Number of alternative sources 代替元数.<p>
	 *
	 */
	public void base_unit_alt_qty(float value) {
		setConstNumber(offset + 89, $base_unit_alt_qty, value);
	}

	/**
	 * Number of alternative sources 代替元数.<p>
	 *
	 */
	public void base_unit_alt_qty(double value) {
		setConstNumber(offset + 89, $base_unit_alt_qty, value);
	}


	/**
	 * Allocation 引当.<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 90, $alloc_flg);
	}

	/**
	 * Allocation 引当.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 90, $alloc_flg, value);
	}


	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public String alloc_ctl_typ() {
		return getConstString(offset + 91, $alloc_ctl_typ);
	}

	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public void alloc_ctl_typ(String value) {
		setConstString(offset + 91, $alloc_ctl_typ, value);
	}


	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public String inpt_schd_no() {
		return getConstString(offset + 92, $inpt_schd_no);
	}

	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		setConstString(offset + 92, $inpt_schd_no, value);
	}


	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public String inpt_act_no() {
		return getConstString(offset + 93, $inpt_act_no);
	}

	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public void inpt_act_no(String value) {
		setConstString(offset + 93, $inpt_act_no, value);
	}


	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public String mes_id() {
		return getConstString(offset + 94, $mes_id);
	}

	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public void mes_id(String value) {
		setConstString(offset + 94, $mes_id, value);
	}


	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 95, $data_no);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 95, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 95, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 95, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 95, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 95, $data_no, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 96, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 96, $can_ac_dt, value);
	}


	/**
	 * Self supply currency cd. 自給通貨ＣＤ.<p>
	 *
	 */
	public String slf_support_cur_cd() {
		return getConstString(offset + 97, $slf_support_cur_cd);
	}

	/**
	 * Self supply currency cd. 自給通貨ＣＤ.<p>
	 *
	 */
	public void slf_support_cur_cd(String value) {
		setConstString(offset + 97, $slf_support_cur_cd, value);
	}


	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public MCNumber slf_support_upri() {
		return getConstNumber(offset + 98, $slf_support_upri);
	}

	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public void slf_support_upri(MCNumber value) {
		setConstNumber(offset + 98, $slf_support_upri, value);
	}

	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public void slf_support_upri(int value) {
		setConstNumber(offset + 98, $slf_support_upri, value);
	}

	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public void slf_support_upri(long value) {
		setConstNumber(offset + 98, $slf_support_upri, value);
	}

	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public void slf_support_upri(float value) {
		setConstNumber(offset + 98, $slf_support_upri, value);
	}

	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public void slf_support_upri(double value) {
		setConstNumber(offset + 98, $slf_support_upri, value);
	}


	/**
	 * Self supply tax cd. 自給税ＣＤ.<p>
	 *
	 */
	public String slf_support_tax_cd() {
		return getConstString(offset + 99, $slf_support_tax_cd);
	}

	/**
	 * Self supply tax cd. 自給税ＣＤ.<p>
	 *
	 */
	public void slf_support_tax_cd(String value) {
		setConstString(offset + 99, $slf_support_tax_cd, value);
	}


	/**
	 * Self supply exchange rate cd. 自給為替レートＣＤ.<p>
	 *
	 */
	public String slf_support_xrate_cd() {
		return getConstString(offset + 100, $slf_support_xrate_cd);
	}

	/**
	 * Self supply exchange rate cd. 自給為替レートＣＤ.<p>
	 *
	 */
	public void slf_support_xrate_cd(String value) {
		setConstString(offset + 100, $slf_support_xrate_cd, value);
	}


	/**
	 * Self supply exchange rate 自給為替レート.<p>
	 *
	 */
	public MCNumber slf_support_xrate() {
		return getConstNumber(offset + 101, $slf_support_xrate);
	}

	/**
	 * Self supply exchange rate 自給為替レート.<p>
	 *
	 */
	public void slf_support_xrate(MCNumber value) {
		setConstNumber(offset + 101, $slf_support_xrate, value);
	}

	/**
	 * Self supply exchange rate 自給為替レート.<p>
	 *
	 */
	public void slf_support_xrate(int value) {
		setConstNumber(offset + 101, $slf_support_xrate, value);
	}

	/**
	 * Self supply exchange rate 自給為替レート.<p>
	 *
	 */
	public void slf_support_xrate(long value) {
		setConstNumber(offset + 101, $slf_support_xrate, value);
	}

	/**
	 * Self supply exchange rate 自給為替レート.<p>
	 *
	 */
	public void slf_support_xrate(float value) {
		setConstNumber(offset + 101, $slf_support_xrate, value);
	}

	/**
	 * Self supply exchange rate 自給為替レート.<p>
	 *
	 */
	public void slf_support_xrate(double value) {
		setConstNumber(offset + 101, $slf_support_xrate, value);
	}


	/**
	 * VMI temporary unit price ＶＭＩ仮単価.<p>
	 *
	 */
	public boolean vmi_interim_flg() {
		return getConstBoolean(offset + 102, $vmi_interim_flg);
	}

	/**
	 * VMI temporary unit price ＶＭＩ仮単価.<p>
	 *
	 */
	public void vmi_interim_flg(boolean value) {
		setConstBoolean(offset + 102, $vmi_interim_flg, value);
	}


	/**
	 * VMI unit price ＶＭＩ単価.<p>
	 *
	 */
	public MCNumber vmi_upri() {
		return getConstNumber(offset + 103, $vmi_upri);
	}

	/**
	 * VMI unit price ＶＭＩ単価.<p>
	 *
	 */
	public void vmi_upri(MCNumber value) {
		setConstNumber(offset + 103, $vmi_upri, value);
	}

	/**
	 * VMI unit price ＶＭＩ単価.<p>
	 *
	 */
	public void vmi_upri(int value) {
		setConstNumber(offset + 103, $vmi_upri, value);
	}

	/**
	 * VMI unit price ＶＭＩ単価.<p>
	 *
	 */
	public void vmi_upri(long value) {
		setConstNumber(offset + 103, $vmi_upri, value);
	}

	/**
	 * VMI unit price ＶＭＩ単価.<p>
	 *
	 */
	public void vmi_upri(float value) {
		setConstNumber(offset + 103, $vmi_upri, value);
	}

	/**
	 * VMI unit price ＶＭＩ単価.<p>
	 *
	 */
	public void vmi_upri(double value) {
		setConstNumber(offset + 103, $vmi_upri, value);
	}


	/**
	 * Base unit standard input qty. 基準単位標準投入数量.<p>
	 *
	 */
	public MCNumber base_unit_std_qty() {
		return getConstNumber(offset + 104, $base_unit_std_qty);
	}

	/**
	 * Base unit standard input qty. 基準単位標準投入数量.<p>
	 *
	 */
	public void base_unit_std_qty(MCNumber value) {
		setConstNumber(offset + 104, $base_unit_std_qty, value);
	}

	/**
	 * Base unit standard input qty. 基準単位標準投入数量.<p>
	 *
	 */
	public void base_unit_std_qty(int value) {
		setConstNumber(offset + 104, $base_unit_std_qty, value);
	}

	/**
	 * Base unit standard input qty. 基準単位標準投入数量.<p>
	 *
	 */
	public void base_unit_std_qty(long value) {
		setConstNumber(offset + 104, $base_unit_std_qty, value);
	}

	/**
	 * Base unit standard input qty. 基準単位標準投入数量.<p>
	 *
	 */
	public void base_unit_std_qty(float value) {
		setConstNumber(offset + 104, $base_unit_std_qty, value);
	}

	/**
	 * Base unit standard input qty. 基準単位標準投入数量.<p>
	 *
	 */
	public void base_unit_std_qty(double value) {
		setConstNumber(offset + 104, $base_unit_std_qty, value);
	}


	/**
	 * Add 追加.<p>
	 *
	 */
	public boolean add_flg() {
		return getConstBoolean(offset + 105, $add_flg);
	}

	/**
	 * Add 追加.<p>
	 *
	 */
	public void add_flg(boolean value) {
		setConstBoolean(offset + 105, $add_flg, value);
	}


	/**
	 * Version No. before update 更新前版ＮＯ.<p>
	 *
	 */
	public String old_ver_no() {
		return getConstString(offset + 106, $old_ver_no);
	}

	/**
	 * Version No. before update 更新前版ＮＯ.<p>
	 *
	 */
	public void old_ver_no(String value) {
		setConstString(offset + 106, $old_ver_no, value);
	}


	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public boolean main_itm_flg() {
		return getConstBoolean(offset + 107, $main_itm_flg);
	}

	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public void main_itm_flg(boolean value) {
		setConstBoolean(offset + 107, $main_itm_flg, value);
	}


	/**
	 * Lot conforming type (For check) ロット良品区分（チェック用）.<p>
	 *
	 */
	public String lot_quality_typ() {
		return getConstString(offset + 108, $lot_quality_typ);
	}

	/**
	 * Lot conforming type (For check) ロット良品区分（チェック用）.<p>
	 *
	 */
	public void lot_quality_typ(String value) {
		setConstString(offset + 108, $lot_quality_typ, value);
	}


	/**
	 * Subcontractor (For check) 外注先（チェック用）.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 109, $sppl_cd);
	}

	/**
	 * Subcontractor (For check) 外注先（チェック用）.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 109, $sppl_cd, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 110, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 110, $wg_cd, value);
	}


	/**
	 * Input reason complement flg. 投入理由補完ＦＬＧ.<p>
	 *
	 */
	public boolean inpt_rsn_comp_flg() {
		return getConstBoolean(offset + 111, $inpt_rsn_comp_flg);
	}

	/**
	 * Input reason complement flg. 投入理由補完ＦＬＧ.<p>
	 *
	 */
	public void inpt_rsn_comp_flg(boolean value) {
		setConstBoolean(offset + 111, $inpt_rsn_comp_flg, value);
	}


	/**
	 * Do not complement reason for input 投入理由補完しない.<p>
	 *
	 */
	public boolean inpt_rsn_not_comp_flg() {
		return getConstBoolean(offset + 112, $inpt_rsn_not_comp_flg);
	}

	/**
	 * Do not complement reason for input 投入理由補完しない.<p>
	 *
	 */
	public void inpt_rsn_not_comp_flg(boolean value) {
		setConstBoolean(offset + 112, $inpt_rsn_not_comp_flg, value);
	}


	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public boolean mes_flg() {
		return getConstBoolean(offset + 113, $mes_flg);
	}

	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public void mes_flg(boolean value) {
		setConstBoolean(offset + 113, $mes_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 114, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 114, $ext_sys_cd, value);
	}


	/**
	 * External input result No. 外部投入実績ＮＯ.<p>
	 *
	 */
	public String ext_inpt_act_no() {
		return getConstString(offset + 115, $ext_inpt_act_no);
	}

	/**
	 * External input result No. 外部投入実績ＮＯ.<p>
	 *
	 */
	public void ext_inpt_act_no(String value) {
		setConstString(offset + 115, $ext_inpt_act_no, value);
	}


	/**
	 * IF auto-create ＩＦ自動作成.<p>
	 *
	 */
	public boolean if_auto_reg_flg() {
		return getConstBoolean(offset + 116, $if_auto_reg_flg);
	}

	/**
	 * IF auto-create ＩＦ自動作成.<p>
	 *
	 */
	public void if_auto_reg_flg(boolean value) {
		setConstBoolean(offset + 116, $if_auto_reg_flg, value);
	}


	public boolean is_only_abort_flg() {
		return getConstBoolean(offset + 117, $is_only_abort_flg);
	}

	public void is_only_abort_flg(boolean value) {
		setConstBoolean(offset + 117, $is_only_abort_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
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
		if ($old_itm_cd.equalsIgnoreCase(name)) {
			return old_itm_cd();
		}
		if ($old_itm_sub1.equalsIgnoreCase(name)) {
			return old_itm_sub1();
		}
		if ($old_itm_sub2.equalsIgnoreCase(name)) {
			return old_itm_sub2();
		}
		if ($old_itm_sub3.equalsIgnoreCase(name)) {
			return old_itm_sub3();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
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
		if ($inpt_lot_no.equalsIgnoreCase(name)) {
			return inpt_lot_no();
		}
		if ($inpt_sublot_no.equalsIgnoreCase(name)) {
			return inpt_sublot_no();
		}
		if ($lot_ver_no.equalsIgnoreCase(name)) {
			return lot_ver_no();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		if ($acxfr_act_rsn_cd.equalsIgnoreCase(name)) {
			return acxfr_act_rsn_cd();
		}
		if ($acxfr_act_bd_dpt_cd.equalsIgnoreCase(name)) {
			return acxfr_act_bd_dpt_cd();
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			return inpt_rsn_cd();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($old_inpt_loc_cd.equalsIgnoreCase(name)) {
			return old_inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($inpt_loc_sppl_cd.equalsIgnoreCase(name)) {
			return inpt_loc_sppl_cd();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($old_stk_id_typ.equalsIgnoreCase(name)) {
			return old_stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($old_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return old_stk_arrv_bp_cd();
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
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
		if ($slf_support_cur_cd.equalsIgnoreCase(name)) {
			return slf_support_cur_cd();
		}
		if ($slf_support_tax_cd.equalsIgnoreCase(name)) {
			return slf_support_tax_cd();
		}
		if ($slf_support_xrate_cd.equalsIgnoreCase(name)) {
			return slf_support_xrate_cd();
		}
		if ($old_ver_no.equalsIgnoreCase(name)) {
			return old_ver_no();
		}
		if ($lot_quality_typ.equalsIgnoreCase(name)) {
			return lot_quality_typ();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			return ext_inpt_act_no();
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
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			return acxfr_act_qty();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			return base_unit_alt_qty();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
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
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			return base_unit_std_qty();
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
		if ($act_tm.equalsIgnoreCase(name)) {
			return act_tm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
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
		if ($vmi_interim_flg.equalsIgnoreCase(name)) {
			return vmi_interim_flg();
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			return add_flg();
		}
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			return main_itm_flg();
		}
		if ($inpt_rsn_comp_flg.equalsIgnoreCase(name)) {
			return inpt_rsn_comp_flg();
		}
		if ($inpt_rsn_not_comp_flg.equalsIgnoreCase(name)) {
			return inpt_rsn_not_comp_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			return if_auto_reg_flg();
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
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
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
		if ($old_itm_cd.equalsIgnoreCase(name)) {
			return old_itm_cd();
		}
		if ($old_itm_sub1.equalsIgnoreCase(name)) {
			return old_itm_sub1();
		}
		if ($old_itm_sub2.equalsIgnoreCase(name)) {
			return old_itm_sub2();
		}
		if ($old_itm_sub3.equalsIgnoreCase(name)) {
			return old_itm_sub3();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
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
		if ($inpt_lot_no.equalsIgnoreCase(name)) {
			return inpt_lot_no();
		}
		if ($inpt_sublot_no.equalsIgnoreCase(name)) {
			return inpt_sublot_no();
		}
		if ($lot_ver_no.equalsIgnoreCase(name)) {
			return lot_ver_no();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		if ($acxfr_act_rsn_cd.equalsIgnoreCase(name)) {
			return acxfr_act_rsn_cd();
		}
		if ($acxfr_act_bd_dpt_cd.equalsIgnoreCase(name)) {
			return acxfr_act_bd_dpt_cd();
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			return inpt_rsn_cd();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($old_inpt_loc_cd.equalsIgnoreCase(name)) {
			return old_inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($inpt_loc_sppl_cd.equalsIgnoreCase(name)) {
			return inpt_loc_sppl_cd();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($old_stk_id_typ.equalsIgnoreCase(name)) {
			return old_stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($old_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return old_stk_arrv_bp_cd();
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
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
		if ($slf_support_cur_cd.equalsIgnoreCase(name)) {
			return slf_support_cur_cd();
		}
		if ($slf_support_tax_cd.equalsIgnoreCase(name)) {
			return slf_support_tax_cd();
		}
		if ($slf_support_xrate_cd.equalsIgnoreCase(name)) {
			return slf_support_xrate_cd();
		}
		if ($old_ver_no.equalsIgnoreCase(name)) {
			return old_ver_no();
		}
		if ($lot_quality_typ.equalsIgnoreCase(name)) {
			return lot_quality_typ();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			return ext_inpt_act_no();
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
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			return acxfr_act_qty();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			return base_unit_alt_qty();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
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
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			return base_unit_std_qty();
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
		if ($act_tm.equalsIgnoreCase(name)) {
			return act_tm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
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
		if ($vmi_interim_flg.equalsIgnoreCase(name)) {
			return vmi_interim_flg();
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			return add_flg();
		}
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			return main_itm_flg();
		}
		if ($inpt_rsn_comp_flg.equalsIgnoreCase(name)) {
			return inpt_rsn_comp_flg();
		}
		if ($inpt_rsn_not_comp_flg.equalsIgnoreCase(name)) {
			return inpt_rsn_not_comp_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			return if_auto_reg_flg();
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
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
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
		if ($old_itm_cd.equalsIgnoreCase(name)) {
			old_itm_cd(value);
			return;
		}
		if ($old_itm_sub1.equalsIgnoreCase(name)) {
			old_itm_sub1(value);
			return;
		}
		if ($old_itm_sub2.equalsIgnoreCase(name)) {
			old_itm_sub2(value);
			return;
		}
		if ($old_itm_sub3.equalsIgnoreCase(name)) {
			old_itm_sub3(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
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
		if ($inpt_lot_no.equalsIgnoreCase(name)) {
			inpt_lot_no(value);
			return;
		}
		if ($inpt_sublot_no.equalsIgnoreCase(name)) {
			inpt_sublot_no(value);
			return;
		}
		if ($lot_ver_no.equalsIgnoreCase(name)) {
			lot_ver_no(value);
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
		if ($acxfr_act_bd_dpt_cd.equalsIgnoreCase(name)) {
			acxfr_act_bd_dpt_cd(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			inpt_rsn_cd(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($old_inpt_loc_cd.equalsIgnoreCase(name)) {
			old_inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
			return;
		}
		if ($inpt_loc_sppl_cd.equalsIgnoreCase(name)) {
			inpt_loc_sppl_cd(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($old_stk_id_typ.equalsIgnoreCase(name)) {
			old_stk_id_typ(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($old_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			old_stk_arrv_bp_cd(value);
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
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
		if ($old_ver_no.equalsIgnoreCase(name)) {
			old_ver_no(value);
			return;
		}
		if ($lot_quality_typ.equalsIgnoreCase(name)) {
			lot_quality_typ(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			ext_inpt_act_no(value);
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
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			acxfr_act_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			base_unit_std_qty(value);
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
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			acxfr_act_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			base_unit_std_qty(value);
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
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			acxfr_act_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			base_unit_std_qty(value);
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
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			acxfr_act_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			base_unit_std_qty(value);
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
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			acxfr_act_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			base_unit_std_qty(value);
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
		if ($act_tm.equalsIgnoreCase(name)) {
			act_tm(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
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
		if ($vmi_interim_flg.equalsIgnoreCase(name)) {
			vmi_interim_flg(value);
			return;
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			add_flg(value);
			return;
		}
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			main_itm_flg(value);
			return;
		}
		if ($inpt_rsn_comp_flg.equalsIgnoreCase(name)) {
			inpt_rsn_comp_flg(value);
			return;
		}
		if ($inpt_rsn_not_comp_flg.equalsIgnoreCase(name)) {
			inpt_rsn_not_comp_flg(value);
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
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
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
		if ($old_itm_cd.equalsIgnoreCase(name)) {
			old_itm_cd(value);
			return;
		}
		if ($old_itm_sub1.equalsIgnoreCase(name)) {
			old_itm_sub1(value);
			return;
		}
		if ($old_itm_sub2.equalsIgnoreCase(name)) {
			old_itm_sub2(value);
			return;
		}
		if ($old_itm_sub3.equalsIgnoreCase(name)) {
			old_itm_sub3(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
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
		if ($inpt_lot_no.equalsIgnoreCase(name)) {
			inpt_lot_no(value);
			return;
		}
		if ($inpt_sublot_no.equalsIgnoreCase(name)) {
			inpt_sublot_no(value);
			return;
		}
		if ($lot_ver_no.equalsIgnoreCase(name)) {
			lot_ver_no(value);
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
		if ($acxfr_act_bd_dpt_cd.equalsIgnoreCase(name)) {
			acxfr_act_bd_dpt_cd(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			inpt_rsn_cd(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($old_inpt_loc_cd.equalsIgnoreCase(name)) {
			old_inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
			return;
		}
		if ($inpt_loc_sppl_cd.equalsIgnoreCase(name)) {
			inpt_loc_sppl_cd(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($old_stk_id_typ.equalsIgnoreCase(name)) {
			old_stk_id_typ(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($old_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			old_stk_arrv_bp_cd(value);
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
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
		if ($old_ver_no.equalsIgnoreCase(name)) {
			old_ver_no(value);
			return;
		}
		if ($lot_quality_typ.equalsIgnoreCase(name)) {
			lot_quality_typ(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			ext_inpt_act_no(value);
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
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			acxfr_act_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			base_unit_std_qty(value);
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
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			acxfr_act_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			base_unit_std_qty(value);
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
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			acxfr_act_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			base_unit_std_qty(value);
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
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			acxfr_act_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			base_unit_std_qty(value);
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
		if ($acxfr_act_qty.equalsIgnoreCase(name)) {
			acxfr_act_qty(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($base_unit_std_qty.equalsIgnoreCase(name)) {
			base_unit_std_qty(value);
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
		if ($act_tm.equalsIgnoreCase(name)) {
			act_tm(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
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
		if ($vmi_interim_flg.equalsIgnoreCase(name)) {
			vmi_interim_flg(value);
			return;
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			add_flg(value);
			return;
		}
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			main_itm_flg(value);
			return;
		}
		if ($inpt_rsn_comp_flg.equalsIgnoreCase(name)) {
			inpt_rsn_comp_flg(value);
			return;
		}
		if ($inpt_rsn_not_comp_flg.equalsIgnoreCase(name)) {
			inpt_rsn_not_comp_flg(value);
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
		if ($is_only_abort_flg.equalsIgnoreCase(name)) {
			is_only_abort_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

