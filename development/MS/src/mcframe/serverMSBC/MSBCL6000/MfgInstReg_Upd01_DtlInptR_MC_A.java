package mcframe.serverMSBC.MSBCL6000;

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
 * ブロック"MfgInstReg_Upd01_DtlInpt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstReg_Upd01_DtlInptR_MC_A extends MCConstRow {

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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Version No. before update 更新前版ＮＯ.<p>
	 *
	 */
	public static final String $old_ver_no = "old_ver_no";
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
	 * Base unit alternative sources qty. 基準単位代替元数量.<p>
	 *
	 */
	public static final String $base_unit_alt_qty = "base_unit_alt_qty";
	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public static final String $base_unit_inpt_qty = "base_unit_inpt_qty";
	/**
	 * Base unit required qty. 基準単位必要数量.<p>
	 *
	 */
	public static final String $base_unit_rqmt_qty = "base_unit_rqmt_qty";
	/**
	 * Base unit fixed required qty. 基準単位固定必要数量.<p>
	 *
	 */
	public static final String $base_unit_fxd_rqmt_qty = "base_unit_fxd_rqmt_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public static final String $cont_inpt_qty = "cont_inpt_qty";
	/**
	 * Active ingredient (Required qty.) 有効成分（必要数量）.<p>
	 *
	 */
	public static final String $cont_rqmt_qty = "cont_rqmt_qty";
	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要数量）.<p>
	 *
	 */
	public static final String $cont_fxd_rqmt_qty = "cont_fxd_rqmt_qty";
	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public static final String $cont_fctr_unit_cd = "cont_fctr_unit_cd";
	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public static final String $std_cont_fctr = "std_cont_fctr";
	/**
	 * Scheduled input date and time 投入予定日時.<p>
	 *
	 */
	public static final String $schd_tm = "schd_tm";
	/**
	 * Allocation 引当.<p>
	 *
	 */
	public static final String $alloc_flg = "alloc_flg";
	/**
	 * Without lot ロット指定無し.<p>
	 *
	 */
	public static final String $no_lot_fix_flg = "no_lot_fix_flg";
	/**
	 * Require lot 指図時ロット指定.<p>
	 *
	 */
	public static final String $inst_lot_fix_flg = "inst_lot_fix_flg";
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
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public static final String $alloc_sno1 = "alloc_sno1";
	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public static final String $alloc_sno2 = "alloc_sno2";
	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public static final String $alloc_sno3 = "alloc_sno3";
	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public static final String $alloc_sno4 = "alloc_sno4";
	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public static final String $inpt_loc_cd = "inpt_loc_cd";
	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $inpt_str_ln_cd = "inpt_str_ln_cd";
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
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public static final String $inst_rpt_rmrks = "inst_rpt_rmrks";
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
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public static final String $bkf_typ = "bkf_typ";
	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public static final String $par_inst_qty = "par_inst_qty";
	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public static final String $chd_inpt_qty = "chd_inpt_qty";
	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public static final String $chd_rqmt_qty = "chd_rqmt_qty";
	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public static final String $fxd_chd_rqmt_qty = "fxd_chd_rqmt_qty";
	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public static final String $main_itm_flg = "main_itm_flg";
	/**
	 * In-operation BOM identification number 工程内ＢＯＭ識別番号.<p>
	 *
	 */
	public static final String $bom_id_no = "bom_id_no";
	/**
	 * Allow same child item sequence number 同一子品目連番.<p>
	 *
	 */
	public static final String $chd_itm_seq = "chd_itm_seq";
	/**
	 * BOM memo 1 ＢＯＭメモ１.<p>
	 *
	 */
	public static final String $bom_memo1 = "bom_memo1";
	/**
	 * BOM memo 2 ＢＯＭメモ２.<p>
	 *
	 */
	public static final String $bom_memo2 = "bom_memo2";
	/**
	 * BOM memo 3 ＢＯＭメモ３.<p>
	 *
	 */
	public static final String $bom_memo3 = "bom_memo3";
	/**
	 * For yield calculation 収率計算用.<p>
	 *
	 */
	public static final String $yield_calc_flg = "yield_calc_flg";
	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public static final String $alloc_ctl_typ = "alloc_ctl_typ";
	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public static final String $inpt_ctl_typ = "inpt_ctl_typ";
	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public static final String $in_offst_typ = "in_offst_typ";
	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public static final String $in_offst = "in_offst";
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
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public static final String $alt_itm_ratio = "alt_itm_ratio";
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
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
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
	/**
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public static final String $old_mfg_sts_typ = "old_mfg_sts_typ";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Update display order only 表示順のみ更新.<p>
	 *
	 */
	public static final String $disp_seq_upd_flg = "disp_seq_upd_flg";
	/**
	 * Error for ordered movement/transport 移動・移送指図済エラー.<p>
	 *
	 */
	public static final String $xfr_inst_err_flg = "xfr_inst_err_flg";
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public static final String $mfg_mtd_typ = "mfg_mtd_typ";
	/**
	 * Header mfg. status type ヘッダ製造状況区分.<p>
	 *
	 */
	public static final String $hdr_mfg_sts_typ = "hdr_mfg_sts_typ";
	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public static final String $inst_abort_flg = "inst_abort_flg";
	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public static final String $old_inst_abort_flg = "old_inst_abort_flg";
	/**
	 * Caller subcontractor mfg. order service flg. 呼出元外注製造指図サービスＦＬＧ.<p>
	 *
	 */
	public static final String $is_src_outsrc_srv_flg = "is_src_outsrc_srv_flg";
	/**
	 * Bulk execution flg. 一括実行ＦＬＧ.<p>
	 *
	 */
	public static final String $lst_reg_flg = "lst_reg_flg";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 * Order date 指図日.<p>
	 *
	 */
	public static final String $inst_dt = "inst_dt";
	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public static final String $inst_usr_cd = "inst_usr_cd";
	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public static final String $inst_dpt_cd = "inst_dpt_cd";
	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public static final String $not_frst_inst_can_flg = "not_frst_inst_can_flg";
	public static final String $not_header_inst_abort_flg = "not_header_inst_abort_flg";
	/**
	 * Inventory rack/line setting flg. 在庫棚・ライン設定ＦＬＧ.<p>
	 *
	 */
	public static final String $set_stk_str_ln_flg = "set_stk_str_ln_flg";
	public static final String $is_src_batch_flg = "is_src_batch_flg";


	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_peg_no_META = createCommonMeta($oper_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_seq_META = createCommonMeta($alt_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alt_itm_fix_flg_META = createCommonMeta($alt_itm_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta old_ver_no_META = createCommonMeta($old_ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta base_unit_alt_qty_META = createCommonMeta($base_unit_alt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_inpt_qty_META = createCommonMeta($base_unit_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_rqmt_qty_META = createCommonMeta($base_unit_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_fxd_rqmt_qty_META = createCommonMeta($base_unit_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta cont_inpt_qty_META = createCommonMeta($cont_inpt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_rqmt_qty_META = createCommonMeta($cont_rqmt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_fxd_rqmt_qty_META = createCommonMeta($cont_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta schd_tm_META = createCommonMeta($schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_lot_fix_flg_META = createCommonMeta($no_lot_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_lot_fix_flg_META = createCommonMeta($inst_lot_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta first_gr_dt_META = createCommonMeta($first_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_seq_META = createCommonMeta($lot_seq, mcframe.commonMA.meta.MA_META.LOT_SEQ);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_sno1_META = createCommonMeta($alloc_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta alloc_sno2_META = createCommonMeta($alloc_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta alloc_sno3_META = createCommonMeta($alloc_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta alloc_sno4_META = createCommonMeta($alloc_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta inpt_loc_cd_META = createCommonMeta($inpt_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inpt_str_ln_cd_META = createCommonMeta($inpt_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta inpt_rsn_cd_META = createCommonMeta($inpt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.INPT_SCHD_INTR_RMRKS);
	public static final MCMeta inst_rpt_rmrks_META = createCommonMeta($inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.INPT_SCHD_RPT_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.INPT_SCHD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.INPT_SCHD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.INPT_SCHD_SUB_CHAR3);
	public static final MCMeta bkf_typ_META = createCommonMeta($bkf_typ, mcframe.commonMA.meta.MA_META.BKF_TYP);
	public static final MCMeta par_inst_qty_META = createCommonMeta($par_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_inpt_qty_META = createCommonMeta($chd_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_rqmt_qty_META = createCommonMeta($chd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fxd_chd_rqmt_qty_META = createCommonMeta($fxd_chd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta main_itm_flg_META = createCommonMeta($main_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bom_id_no_META = createCommonMeta($bom_id_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta chd_itm_seq_META = createCommonMeta($chd_itm_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta bom_memo1_META = createCommonMeta($bom_memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta bom_memo2_META = createCommonMeta($bom_memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta bom_memo3_META = createCommonMeta($bom_memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta yield_calc_flg_META = createCommonMeta($yield_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_ctl_typ_META = createCommonMeta($alloc_ctl_typ, mcframe.commonMA.meta.MA_META.ALLOC_CTL_TYP);
	public static final MCMeta inpt_ctl_typ_META = createCommonMeta($inpt_ctl_typ, mcframe.commonMA.meta.MA_META.INPT_CTL_TYP);
	public static final MCMeta in_offst_typ_META = createCommonMeta($in_offst_typ, mcframe.commonMA.meta.MA_META.OFFST_TYP);
	public static final MCMeta in_offst_META = createCommonMeta($in_offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta lot_mix_flg_META = createCommonMeta($lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_mix_flg_META = createCommonMeta($sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta alt_itm_typ_META = createCommonMeta($alt_itm_typ, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP);
	public static final MCMeta alt_alloc_prio_META = createCommonMeta($alt_alloc_prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alt_itm_ratio_META = createCommonMeta($alt_itm_ratio, mcframe.commonMA.meta.MA_META.ALT_ITM_RATIO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta inpt_schd_no_META = createCommonMeta($inpt_schd_no, mcframe.commonMA.meta.MA_META.INPT_SCHD_NO);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta old_mfg_sts_typ_META = createCommonMeta($old_mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta disp_seq_upd_flg_META = createCommonMeta($disp_seq_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_inst_err_flg_META = createCommonMeta($xfr_inst_err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta mfg_mtd_typ_META = createCommonMeta($mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta hdr_mfg_sts_typ_META = createCommonMeta($hdr_mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta inst_abort_flg_META = createCommonMeta($inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_inst_abort_flg_META = createCommonMeta($old_inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_outsrc_srv_flg_META = createCommonMeta($is_src_outsrc_srv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lst_reg_flg_META = createCommonMeta($lst_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta inst_dt_META = createCommonMeta($inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta not_frst_inst_can_flg_META = createCommonMeta($not_frst_inst_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_header_inst_abort_flg_META = createCommonMeta($not_header_inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta set_stk_str_ln_flg_META = createCommonMeta($set_stk_str_ln_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_batch_flg_META = createCommonMeta($is_src_batch_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<MfgInstReg_Upd01_DtlInptR> constMetas = new ConstMetaList<MfgInstReg_Upd01_DtlInptR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			hdr_peg_no_META,
			oper_peg_no_META,
			peg_no_META,
			alt_grp_cd_META,
			alt_grp_seq_META,
			alt_itm_fix_flg_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			ver_no_META,
			old_ver_no_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			base_unit_alt_qty_META,
			base_unit_inpt_qty_META,
			base_unit_rqmt_qty_META,
			base_unit_fxd_rqmt_qty_META,
			base_unit_cd_META,
			cont_fctr_flg_META,
			act_cont_fctr_META,
			cont_inpt_qty_META,
			cont_rqmt_qty_META,
			cont_fxd_rqmt_qty_META,
			cont_fctr_unit_cd_META,
			std_cont_fctr_META,
			schd_tm_META,
			alloc_flg_META,
			no_lot_fix_flg_META,
			inst_lot_fix_flg_META,
			lot_no_META,
			sublot_no_META,
			vld_dt_META,
			first_gr_dt_META,
			lot_seq_META,
			sno1_META,
			sno1_null_flg_META,
			sno2_META,
			sno2_null_flg_META,
			sno3_META,
			sno3_null_flg_META,
			sno4_META,
			sno4_null_flg_META,
			alloc_sno1_META,
			alloc_sno2_META,
			alloc_sno3_META,
			alloc_sno4_META,
			inpt_loc_cd_META,
			inpt_str_ln_cd_META,
			gd_cd_META,
			inpt_rsn_cd_META,
			intr_rmrks_META,
			inst_rpt_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			bkf_typ_META,
			par_inst_qty_META,
			chd_inpt_qty_META,
			chd_rqmt_qty_META,
			fxd_chd_rqmt_qty_META,
			main_itm_flg_META,
			bom_id_no_META,
			chd_itm_seq_META,
			bom_memo1_META,
			bom_memo2_META,
			bom_memo3_META,
			yield_calc_flg_META,
			alloc_ctl_typ_META,
			inpt_ctl_typ_META,
			in_offst_typ_META,
			in_offst_META,
			lot_mix_flg_META,
			sublot_mix_flg_META,
			stk_mng_typ_META,
			prov_typ_META,
			alt_itm_typ_META,
			alt_alloc_prio_META,
			alt_itm_ratio_META,
			itm_mfg_inst_no_META,
			mfg_inst_no_META,
			oper_inst_no_META,
			inpt_schd_no_META,
			mfg_sts_typ_META,
			old_mfg_sts_typ_META,
			disp_seq_META,
			disp_seq_upd_flg_META,
			xfr_inst_err_flg_META,
			mfg_inst_unit_typ_META,
			mfg_mtd_typ_META,
			hdr_mfg_sts_typ_META,
			inst_abort_flg_META,
			old_inst_abort_flg_META,
			is_src_outsrc_srv_flg_META,
			lst_reg_flg_META,
			itm_ord_no_META,
			inst_dt_META,
			inst_usr_cd_META,
			inst_dpt_cd_META,
			not_frst_inst_can_flg_META,
			not_header_inst_abort_flg_META,
			set_stk_str_ln_flg_META,
			is_src_batch_flg_META
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
	protected MfgInstReg_Upd01_DtlInptR_MC_A(ConstMetaList<? extends MfgInstReg_Upd01_DtlInptR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Upd01_DtlInptR clone() {
		return (MfgInstReg_Upd01_DtlInptR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Upd01_DtlInptR createInstance() {
		return (MfgInstReg_Upd01_DtlInptR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Upd01_DtlInptR getValues(String... names) {
		return (MfgInstReg_Upd01_DtlInptR) super.getValues(names);
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
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 4, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 4, $alt_grp_cd, value);
	}


	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public MCNumber alt_grp_seq() {
		return getConstNumber(offset + 5, $alt_grp_seq);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(MCNumber value) {
		setConstNumber(offset + 5, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(int value) {
		setConstNumber(offset + 5, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(long value) {
		setConstNumber(offset + 5, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(float value) {
		setConstNumber(offset + 5, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(double value) {
		setConstNumber(offset + 5, $alt_grp_seq, value);
	}


	/**
	 * Specify alternative item 代替品目指定.<p>
	 *
	 */
	public boolean alt_itm_fix_flg() {
		return getConstBoolean(offset + 6, $alt_itm_fix_flg);
	}

	/**
	 * Specify alternative item 代替品目指定.<p>
	 *
	 */
	public void alt_itm_fix_flg(boolean value) {
		setConstBoolean(offset + 6, $alt_itm_fix_flg, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 7, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 7, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 8, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 8, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 9, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 9, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 10, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 10, $itm_sub3, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 11, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 11, $ver_no, value);
	}


	/**
	 * Version No. before update 更新前版ＮＯ.<p>
	 *
	 */
	public String old_ver_no() {
		return getConstString(offset + 12, $old_ver_no);
	}

	/**
	 * Version No. before update 更新前版ＮＯ.<p>
	 *
	 */
	public void old_ver_no(String value) {
		setConstString(offset + 12, $old_ver_no, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 13, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 13, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 14, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 14, $sublot_mng_typ, value);
	}


	/**
	 * Base unit alternative sources qty. 基準単位代替元数量.<p>
	 *
	 */
	public MCNumber base_unit_alt_qty() {
		return getConstNumber(offset + 15, $base_unit_alt_qty);
	}

	/**
	 * Base unit alternative sources qty. 基準単位代替元数量.<p>
	 *
	 */
	public void base_unit_alt_qty(MCNumber value) {
		setConstNumber(offset + 15, $base_unit_alt_qty, value);
	}

	/**
	 * Base unit alternative sources qty. 基準単位代替元数量.<p>
	 *
	 */
	public void base_unit_alt_qty(int value) {
		setConstNumber(offset + 15, $base_unit_alt_qty, value);
	}

	/**
	 * Base unit alternative sources qty. 基準単位代替元数量.<p>
	 *
	 */
	public void base_unit_alt_qty(long value) {
		setConstNumber(offset + 15, $base_unit_alt_qty, value);
	}

	/**
	 * Base unit alternative sources qty. 基準単位代替元数量.<p>
	 *
	 */
	public void base_unit_alt_qty(float value) {
		setConstNumber(offset + 15, $base_unit_alt_qty, value);
	}

	/**
	 * Base unit alternative sources qty. 基準単位代替元数量.<p>
	 *
	 */
	public void base_unit_alt_qty(double value) {
		setConstNumber(offset + 15, $base_unit_alt_qty, value);
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
	 * Base unit required qty. 基準単位必要数量.<p>
	 *
	 */
	public MCNumber base_unit_rqmt_qty() {
		return getConstNumber(offset + 17, $base_unit_rqmt_qty);
	}

	/**
	 * Base unit required qty. 基準単位必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 17, $base_unit_rqmt_qty, value);
	}

	/**
	 * Base unit required qty. 基準単位必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(int value) {
		setConstNumber(offset + 17, $base_unit_rqmt_qty, value);
	}

	/**
	 * Base unit required qty. 基準単位必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(long value) {
		setConstNumber(offset + 17, $base_unit_rqmt_qty, value);
	}

	/**
	 * Base unit required qty. 基準単位必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(float value) {
		setConstNumber(offset + 17, $base_unit_rqmt_qty, value);
	}

	/**
	 * Base unit required qty. 基準単位必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(double value) {
		setConstNumber(offset + 17, $base_unit_rqmt_qty, value);
	}


	/**
	 * Base unit fixed required qty. 基準単位固定必要数量.<p>
	 *
	 */
	public MCNumber base_unit_fxd_rqmt_qty() {
		return getConstNumber(offset + 18, $base_unit_fxd_rqmt_qty);
	}

	/**
	 * Base unit fixed required qty. 基準単位固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 18, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 * Base unit fixed required qty. 基準単位固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 18, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 * Base unit fixed required qty. 基準単位固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 18, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 * Base unit fixed required qty. 基準単位固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 18, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 * Base unit fixed required qty. 基準単位固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 18, $base_unit_fxd_rqmt_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 19, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 19, $base_unit_cd, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 20, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 20, $cont_fctr_flg, value);
	}


	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 21, $act_cont_fctr);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 21, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 21, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 21, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 21, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 21, $act_cont_fctr, value);
	}


	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public MCNumber cont_inpt_qty() {
		return getConstNumber(offset + 22, $cont_inpt_qty);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(MCNumber value) {
		setConstNumber(offset + 22, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(int value) {
		setConstNumber(offset + 22, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(long value) {
		setConstNumber(offset + 22, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(float value) {
		setConstNumber(offset + 22, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(double value) {
		setConstNumber(offset + 22, $cont_inpt_qty, value);
	}


	/**
	 * Active ingredient (Required qty.) 有効成分（必要数量）.<p>
	 *
	 */
	public MCNumber cont_rqmt_qty() {
		return getConstNumber(offset + 23, $cont_rqmt_qty);
	}

	/**
	 * Active ingredient (Required qty.) 有効成分（必要数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 23, $cont_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Required qty.) 有効成分（必要数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(int value) {
		setConstNumber(offset + 23, $cont_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Required qty.) 有効成分（必要数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(long value) {
		setConstNumber(offset + 23, $cont_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Required qty.) 有効成分（必要数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(float value) {
		setConstNumber(offset + 23, $cont_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Required qty.) 有効成分（必要数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(double value) {
		setConstNumber(offset + 23, $cont_rqmt_qty, value);
	}


	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要数量）.<p>
	 *
	 */
	public MCNumber cont_fxd_rqmt_qty() {
		return getConstNumber(offset + 24, $cont_fxd_rqmt_qty);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 24, $cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 24, $cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 24, $cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 24, $cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 24, $cont_fxd_rqmt_qty, value);
	}


	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 25, $cont_fctr_unit_cd);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 25, $cont_fctr_unit_cd, value);
	}


	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 26, $std_cont_fctr);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 26, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 26, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 26, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 26, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 26, $std_cont_fctr, value);
	}


	/**
	 * Scheduled input date and time 投入予定日時.<p>
	 *
	 */
	public MCDate schd_tm() {
		return getConstDate(offset + 27, $schd_tm);
	}

	/**
	 * Scheduled input date and time 投入予定日時.<p>
	 *
	 */
	public void schd_tm(MCDate value) {
		setConstDate(offset + 27, $schd_tm, value);
	}


	/**
	 * Allocation 引当.<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 28, $alloc_flg);
	}

	/**
	 * Allocation 引当.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 28, $alloc_flg, value);
	}


	/**
	 * Without lot ロット指定無し.<p>
	 *
	 */
	public boolean no_lot_fix_flg() {
		return getConstBoolean(offset + 29, $no_lot_fix_flg);
	}

	/**
	 * Without lot ロット指定無し.<p>
	 *
	 */
	public void no_lot_fix_flg(boolean value) {
		setConstBoolean(offset + 29, $no_lot_fix_flg, value);
	}


	/**
	 * Require lot 指図時ロット指定.<p>
	 *
	 */
	public boolean inst_lot_fix_flg() {
		return getConstBoolean(offset + 30, $inst_lot_fix_flg);
	}

	/**
	 * Require lot 指図時ロット指定.<p>
	 *
	 */
	public void inst_lot_fix_flg(boolean value) {
		setConstBoolean(offset + 30, $inst_lot_fix_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 31, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 31, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 32, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 32, $sublot_no, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 33, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 33, $vld_dt, value);
	}


	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 34, $first_gr_dt);
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 34, $first_gr_dt, value);
	}


	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public String lot_seq() {
		return getConstString(offset + 35, $lot_seq);
	}

	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public void lot_seq(String value) {
		setConstString(offset + 35, $lot_seq, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 36, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 36, $sno1, value);
	}


	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 37, $sno1_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 37, $sno1_null_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 38, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 38, $sno2, value);
	}


	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 39, $sno2_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 39, $sno2_null_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 40, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 40, $sno3, value);
	}


	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 41, $sno3_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 41, $sno3_null_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 42, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 42, $sno4, value);
	}


	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 43, $sno4_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 43, $sno4_null_flg, value);
	}


	/**
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public String alloc_sno1() {
		return getConstString(offset + 44, $alloc_sno1);
	}

	/**
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public void alloc_sno1(String value) {
		setConstString(offset + 44, $alloc_sno1, value);
	}


	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public String alloc_sno2() {
		return getConstString(offset + 45, $alloc_sno2);
	}

	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public void alloc_sno2(String value) {
		setConstString(offset + 45, $alloc_sno2, value);
	}


	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public String alloc_sno3() {
		return getConstString(offset + 46, $alloc_sno3);
	}

	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public void alloc_sno3(String value) {
		setConstString(offset + 46, $alloc_sno3, value);
	}


	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public String alloc_sno4() {
		return getConstString(offset + 47, $alloc_sno4);
	}

	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public void alloc_sno4(String value) {
		setConstString(offset + 47, $alloc_sno4, value);
	}


	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public String inpt_loc_cd() {
		return getConstString(offset + 48, $inpt_loc_cd);
	}

	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public void inpt_loc_cd(String value) {
		setConstString(offset + 48, $inpt_loc_cd, value);
	}


	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public String inpt_str_ln_cd() {
		return getConstString(offset + 49, $inpt_str_ln_cd);
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public void inpt_str_ln_cd(String value) {
		setConstString(offset + 49, $inpt_str_ln_cd, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 50, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 50, $gd_cd, value);
	}


	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public String inpt_rsn_cd() {
		return getConstString(offset + 51, $inpt_rsn_cd);
	}

	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public void inpt_rsn_cd(String value) {
		setConstString(offset + 51, $inpt_rsn_cd, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 52, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 52, $intr_rmrks, value);
	}


	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public String inst_rpt_rmrks() {
		return getConstString(offset + 53, $inst_rpt_rmrks);
	}

	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public void inst_rpt_rmrks(String value) {
		setConstString(offset + 53, $inst_rpt_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 54, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 54, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 55, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 55, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 56, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 56, $sub_char3, value);
	}


	/**
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public String bkf_typ() {
		return getConstString(offset + 57, $bkf_typ);
	}

	/**
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public void bkf_typ(String value) {
		setConstString(offset + 57, $bkf_typ, value);
	}


	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public MCNumber par_inst_qty() {
		return getConstNumber(offset + 58, $par_inst_qty);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(MCNumber value) {
		setConstNumber(offset + 58, $par_inst_qty, value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(int value) {
		setConstNumber(offset + 58, $par_inst_qty, value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(long value) {
		setConstNumber(offset + 58, $par_inst_qty, value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(float value) {
		setConstNumber(offset + 58, $par_inst_qty, value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(double value) {
		setConstNumber(offset + 58, $par_inst_qty, value);
	}


	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public MCNumber chd_inpt_qty() {
		return getConstNumber(offset + 59, $chd_inpt_qty);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(MCNumber value) {
		setConstNumber(offset + 59, $chd_inpt_qty, value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(int value) {
		setConstNumber(offset + 59, $chd_inpt_qty, value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(long value) {
		setConstNumber(offset + 59, $chd_inpt_qty, value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(float value) {
		setConstNumber(offset + 59, $chd_inpt_qty, value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(double value) {
		setConstNumber(offset + 59, $chd_inpt_qty, value);
	}


	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public MCNumber chd_rqmt_qty() {
		return getConstNumber(offset + 60, $chd_rqmt_qty);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 60, $chd_rqmt_qty, value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(int value) {
		setConstNumber(offset + 60, $chd_rqmt_qty, value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(long value) {
		setConstNumber(offset + 60, $chd_rqmt_qty, value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(float value) {
		setConstNumber(offset + 60, $chd_rqmt_qty, value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(double value) {
		setConstNumber(offset + 60, $chd_rqmt_qty, value);
	}


	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public MCNumber fxd_chd_rqmt_qty() {
		return getConstNumber(offset + 61, $fxd_chd_rqmt_qty);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 61, $fxd_chd_rqmt_qty, value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(int value) {
		setConstNumber(offset + 61, $fxd_chd_rqmt_qty, value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(long value) {
		setConstNumber(offset + 61, $fxd_chd_rqmt_qty, value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(float value) {
		setConstNumber(offset + 61, $fxd_chd_rqmt_qty, value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(double value) {
		setConstNumber(offset + 61, $fxd_chd_rqmt_qty, value);
	}


	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public boolean main_itm_flg() {
		return getConstBoolean(offset + 62, $main_itm_flg);
	}

	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public void main_itm_flg(boolean value) {
		setConstBoolean(offset + 62, $main_itm_flg, value);
	}


	/**
	 * In-operation BOM identification number 工程内ＢＯＭ識別番号.<p>
	 *
	 */
	public MCNumber bom_id_no() {
		return getConstNumber(offset + 63, $bom_id_no);
	}

	/**
	 * In-operation BOM identification number 工程内ＢＯＭ識別番号.<p>
	 *
	 */
	public void bom_id_no(MCNumber value) {
		setConstNumber(offset + 63, $bom_id_no, value);
	}

	/**
	 * In-operation BOM identification number 工程内ＢＯＭ識別番号.<p>
	 *
	 */
	public void bom_id_no(int value) {
		setConstNumber(offset + 63, $bom_id_no, value);
	}

	/**
	 * In-operation BOM identification number 工程内ＢＯＭ識別番号.<p>
	 *
	 */
	public void bom_id_no(long value) {
		setConstNumber(offset + 63, $bom_id_no, value);
	}

	/**
	 * In-operation BOM identification number 工程内ＢＯＭ識別番号.<p>
	 *
	 */
	public void bom_id_no(float value) {
		setConstNumber(offset + 63, $bom_id_no, value);
	}

	/**
	 * In-operation BOM identification number 工程内ＢＯＭ識別番号.<p>
	 *
	 */
	public void bom_id_no(double value) {
		setConstNumber(offset + 63, $bom_id_no, value);
	}


	/**
	 * Allow same child item sequence number 同一子品目連番.<p>
	 *
	 */
	public MCNumber chd_itm_seq() {
		return getConstNumber(offset + 64, $chd_itm_seq);
	}

	/**
	 * Allow same child item sequence number 同一子品目連番.<p>
	 *
	 */
	public void chd_itm_seq(MCNumber value) {
		setConstNumber(offset + 64, $chd_itm_seq, value);
	}

	/**
	 * Allow same child item sequence number 同一子品目連番.<p>
	 *
	 */
	public void chd_itm_seq(int value) {
		setConstNumber(offset + 64, $chd_itm_seq, value);
	}

	/**
	 * Allow same child item sequence number 同一子品目連番.<p>
	 *
	 */
	public void chd_itm_seq(long value) {
		setConstNumber(offset + 64, $chd_itm_seq, value);
	}

	/**
	 * Allow same child item sequence number 同一子品目連番.<p>
	 *
	 */
	public void chd_itm_seq(float value) {
		setConstNumber(offset + 64, $chd_itm_seq, value);
	}

	/**
	 * Allow same child item sequence number 同一子品目連番.<p>
	 *
	 */
	public void chd_itm_seq(double value) {
		setConstNumber(offset + 64, $chd_itm_seq, value);
	}


	/**
	 * BOM memo 1 ＢＯＭメモ１.<p>
	 *
	 */
	public String bom_memo1() {
		return getConstString(offset + 65, $bom_memo1);
	}

	/**
	 * BOM memo 1 ＢＯＭメモ１.<p>
	 *
	 */
	public void bom_memo1(String value) {
		setConstString(offset + 65, $bom_memo1, value);
	}


	/**
	 * BOM memo 2 ＢＯＭメモ２.<p>
	 *
	 */
	public String bom_memo2() {
		return getConstString(offset + 66, $bom_memo2);
	}

	/**
	 * BOM memo 2 ＢＯＭメモ２.<p>
	 *
	 */
	public void bom_memo2(String value) {
		setConstString(offset + 66, $bom_memo2, value);
	}


	/**
	 * BOM memo 3 ＢＯＭメモ３.<p>
	 *
	 */
	public String bom_memo3() {
		return getConstString(offset + 67, $bom_memo3);
	}

	/**
	 * BOM memo 3 ＢＯＭメモ３.<p>
	 *
	 */
	public void bom_memo3(String value) {
		setConstString(offset + 67, $bom_memo3, value);
	}


	/**
	 * For yield calculation 収率計算用.<p>
	 *
	 */
	public boolean yield_calc_flg() {
		return getConstBoolean(offset + 68, $yield_calc_flg);
	}

	/**
	 * For yield calculation 収率計算用.<p>
	 *
	 */
	public void yield_calc_flg(boolean value) {
		setConstBoolean(offset + 68, $yield_calc_flg, value);
	}


	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public String alloc_ctl_typ() {
		return getConstString(offset + 69, $alloc_ctl_typ);
	}

	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public void alloc_ctl_typ(String value) {
		setConstString(offset + 69, $alloc_ctl_typ, value);
	}


	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public String inpt_ctl_typ() {
		return getConstString(offset + 70, $inpt_ctl_typ);
	}

	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public void inpt_ctl_typ(String value) {
		setConstString(offset + 70, $inpt_ctl_typ, value);
	}


	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public String in_offst_typ() {
		return getConstString(offset + 71, $in_offst_typ);
	}

	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public void in_offst_typ(String value) {
		setConstString(offset + 71, $in_offst_typ, value);
	}


	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public MCNumber in_offst() {
		return getConstNumber(offset + 72, $in_offst);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(MCNumber value) {
		setConstNumber(offset + 72, $in_offst, value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(int value) {
		setConstNumber(offset + 72, $in_offst, value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(long value) {
		setConstNumber(offset + 72, $in_offst, value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(float value) {
		setConstNumber(offset + 72, $in_offst, value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(double value) {
		setConstNumber(offset + 72, $in_offst, value);
	}


	/**
	 * Lot mixed ロット混在.<p>
	 *
	 */
	public boolean lot_mix_flg() {
		return getConstBoolean(offset + 73, $lot_mix_flg);
	}

	/**
	 * Lot mixed ロット混在.<p>
	 *
	 */
	public void lot_mix_flg(boolean value) {
		setConstBoolean(offset + 73, $lot_mix_flg, value);
	}


	/**
	 * Sublots mixed サブロット混在.<p>
	 *
	 */
	public boolean sublot_mix_flg() {
		return getConstBoolean(offset + 74, $sublot_mix_flg);
	}

	/**
	 * Sublots mixed サブロット混在.<p>
	 *
	 */
	public void sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 74, $sublot_mix_flg, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 75, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 75, $stk_mng_typ, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 76, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 76, $prov_typ, value);
	}


	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public String alt_itm_typ() {
		return getConstString(offset + 77, $alt_itm_typ);
	}

	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public void alt_itm_typ(String value) {
		setConstString(offset + 77, $alt_itm_typ, value);
	}


	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public MCNumber alt_alloc_prio() {
		return getConstNumber(offset + 78, $alt_alloc_prio);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(MCNumber value) {
		setConstNumber(offset + 78, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(int value) {
		setConstNumber(offset + 78, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(long value) {
		setConstNumber(offset + 78, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(float value) {
		setConstNumber(offset + 78, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(double value) {
		setConstNumber(offset + 78, $alt_alloc_prio, value);
	}


	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCNumber alt_itm_ratio() {
		return getConstNumber(offset + 79, $alt_itm_ratio);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(MCNumber value) {
		setConstNumber(offset + 79, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(int value) {
		setConstNumber(offset + 79, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(long value) {
		setConstNumber(offset + 79, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(float value) {
		setConstNumber(offset + 79, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(double value) {
		setConstNumber(offset + 79, $alt_itm_ratio, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 80, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 80, $itm_mfg_inst_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 81, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 81, $mfg_inst_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 82, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 82, $oper_inst_no, value);
	}


	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public String inpt_schd_no() {
		return getConstString(offset + 83, $inpt_schd_no);
	}

	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		setConstString(offset + 83, $inpt_schd_no, value);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 84, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 84, $mfg_sts_typ, value);
	}


	/**
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public String old_mfg_sts_typ() {
		return getConstString(offset + 85, $old_mfg_sts_typ);
	}

	/**
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public void old_mfg_sts_typ(String value) {
		setConstString(offset + 85, $old_mfg_sts_typ, value);
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
	 * Update display order only 表示順のみ更新.<p>
	 *
	 */
	public boolean disp_seq_upd_flg() {
		return getConstBoolean(offset + 87, $disp_seq_upd_flg);
	}

	/**
	 * Update display order only 表示順のみ更新.<p>
	 *
	 */
	public void disp_seq_upd_flg(boolean value) {
		setConstBoolean(offset + 87, $disp_seq_upd_flg, value);
	}


	/**
	 * Error for ordered movement/transport 移動・移送指図済エラー.<p>
	 *
	 */
	public boolean xfr_inst_err_flg() {
		return getConstBoolean(offset + 88, $xfr_inst_err_flg);
	}

	/**
	 * Error for ordered movement/transport 移動・移送指図済エラー.<p>
	 *
	 */
	public void xfr_inst_err_flg(boolean value) {
		setConstBoolean(offset + 88, $xfr_inst_err_flg, value);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 89, $mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 89, $mfg_inst_unit_typ, value);
	}


	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public String mfg_mtd_typ() {
		return getConstString(offset + 90, $mfg_mtd_typ);
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public void mfg_mtd_typ(String value) {
		setConstString(offset + 90, $mfg_mtd_typ, value);
	}


	/**
	 * Header mfg. status type ヘッダ製造状況区分.<p>
	 *
	 */
	public String hdr_mfg_sts_typ() {
		return getConstString(offset + 91, $hdr_mfg_sts_typ);
	}

	/**
	 * Header mfg. status type ヘッダ製造状況区分.<p>
	 *
	 */
	public void hdr_mfg_sts_typ(String value) {
		setConstString(offset + 91, $hdr_mfg_sts_typ, value);
	}


	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public boolean inst_abort_flg() {
		return getConstBoolean(offset + 92, $inst_abort_flg);
	}

	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public void inst_abort_flg(boolean value) {
		setConstBoolean(offset + 92, $inst_abort_flg, value);
	}


	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public boolean old_inst_abort_flg() {
		return getConstBoolean(offset + 93, $old_inst_abort_flg);
	}

	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public void old_inst_abort_flg(boolean value) {
		setConstBoolean(offset + 93, $old_inst_abort_flg, value);
	}


	/**
	 * Caller subcontractor mfg. order service flg. 呼出元外注製造指図サービスＦＬＧ.<p>
	 *
	 */
	public boolean is_src_outsrc_srv_flg() {
		return getConstBoolean(offset + 94, $is_src_outsrc_srv_flg);
	}

	/**
	 * Caller subcontractor mfg. order service flg. 呼出元外注製造指図サービスＦＬＧ.<p>
	 *
	 */
	public void is_src_outsrc_srv_flg(boolean value) {
		setConstBoolean(offset + 94, $is_src_outsrc_srv_flg, value);
	}


	/**
	 * Bulk execution flg. 一括実行ＦＬＧ.<p>
	 *
	 */
	public boolean lst_reg_flg() {
		return getConstBoolean(offset + 95, $lst_reg_flg);
	}

	/**
	 * Bulk execution flg. 一括実行ＦＬＧ.<p>
	 *
	 */
	public void lst_reg_flg(boolean value) {
		setConstBoolean(offset + 95, $lst_reg_flg, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 96, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 96, $itm_ord_no, value);
	}


	/**
	 * Order date 指図日.<p>
	 *
	 */
	public MCDate inst_dt() {
		return getConstDate(offset + 97, $inst_dt);
	}

	/**
	 * Order date 指図日.<p>
	 *
	 */
	public void inst_dt(MCDate value) {
		setConstDate(offset + 97, $inst_dt, value);
	}


	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 98, $inst_usr_cd);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 98, $inst_usr_cd, value);
	}


	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 99, $inst_dpt_cd);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 99, $inst_dpt_cd, value);
	}


	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public boolean not_frst_inst_can_flg() {
		return getConstBoolean(offset + 100, $not_frst_inst_can_flg);
	}

	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public void not_frst_inst_can_flg(boolean value) {
		setConstBoolean(offset + 100, $not_frst_inst_can_flg, value);
	}


	public boolean not_header_inst_abort_flg() {
		return getConstBoolean(offset + 101, $not_header_inst_abort_flg);
	}

	public void not_header_inst_abort_flg(boolean value) {
		setConstBoolean(offset + 101, $not_header_inst_abort_flg, value);
	}


	/**
	 * Inventory rack/line setting flg. 在庫棚・ライン設定ＦＬＧ.<p>
	 *
	 */
	public boolean set_stk_str_ln_flg() {
		return getConstBoolean(offset + 102, $set_stk_str_ln_flg);
	}

	/**
	 * Inventory rack/line setting flg. 在庫棚・ライン設定ＦＬＧ.<p>
	 *
	 */
	public void set_stk_str_ln_flg(boolean value) {
		setConstBoolean(offset + 102, $set_stk_str_ln_flg, value);
	}


	public boolean is_src_batch_flg() {
		return getConstBoolean(offset + 103, $is_src_batch_flg);
	}

	public void is_src_batch_flg(boolean value) {
		setConstBoolean(offset + 103, $is_src_batch_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($old_ver_no.equalsIgnoreCase(name)) {
			return old_ver_no();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
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
		if ($alloc_sno1.equalsIgnoreCase(name)) {
			return alloc_sno1();
		}
		if ($alloc_sno2.equalsIgnoreCase(name)) {
			return alloc_sno2();
		}
		if ($alloc_sno3.equalsIgnoreCase(name)) {
			return alloc_sno3();
		}
		if ($alloc_sno4.equalsIgnoreCase(name)) {
			return alloc_sno4();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			return inpt_rsn_cd();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
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
		if ($bkf_typ.equalsIgnoreCase(name)) {
			return bkf_typ();
		}
		if ($bom_memo1.equalsIgnoreCase(name)) {
			return bom_memo1();
		}
		if ($bom_memo2.equalsIgnoreCase(name)) {
			return bom_memo2();
		}
		if ($bom_memo3.equalsIgnoreCase(name)) {
			return bom_memo3();
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			return alloc_ctl_typ();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			return in_offst_typ();
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
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
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			return old_mfg_sts_typ();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($hdr_mfg_sts_typ.equalsIgnoreCase(name)) {
			return hdr_mfg_sts_typ();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
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
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			return base_unit_alt_qty();
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_rqmt_qty();
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_qty();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_qty();
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_rqmt_qty();
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_fxd_rqmt_qty();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			return par_inst_qty();
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			return chd_inpt_qty();
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			return chd_rqmt_qty();
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_chd_rqmt_qty();
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			return bom_id_no();
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			return chd_itm_seq();
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			return in_offst();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($schd_tm.equalsIgnoreCase(name)) {
			return schd_tm();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			return alt_itm_fix_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($no_lot_fix_flg.equalsIgnoreCase(name)) {
			return no_lot_fix_flg();
		}
		if ($inst_lot_fix_flg.equalsIgnoreCase(name)) {
			return inst_lot_fix_flg();
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
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			return main_itm_flg();
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			return yield_calc_flg();
		}
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			return lot_mix_flg();
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			return sublot_mix_flg();
		}
		if ($disp_seq_upd_flg.equalsIgnoreCase(name)) {
			return disp_seq_upd_flg();
		}
		if ($xfr_inst_err_flg.equalsIgnoreCase(name)) {
			return xfr_inst_err_flg();
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			return inst_abort_flg();
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			return old_inst_abort_flg();
		}
		if ($is_src_outsrc_srv_flg.equalsIgnoreCase(name)) {
			return is_src_outsrc_srv_flg();
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			return lst_reg_flg();
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			return not_frst_inst_can_flg();
		}
		if ($not_header_inst_abort_flg.equalsIgnoreCase(name)) {
			return not_header_inst_abort_flg();
		}
		if ($set_stk_str_ln_flg.equalsIgnoreCase(name)) {
			return set_stk_str_ln_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($old_ver_no.equalsIgnoreCase(name)) {
			return old_ver_no();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
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
		if ($alloc_sno1.equalsIgnoreCase(name)) {
			return alloc_sno1();
		}
		if ($alloc_sno2.equalsIgnoreCase(name)) {
			return alloc_sno2();
		}
		if ($alloc_sno3.equalsIgnoreCase(name)) {
			return alloc_sno3();
		}
		if ($alloc_sno4.equalsIgnoreCase(name)) {
			return alloc_sno4();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			return inpt_rsn_cd();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
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
		if ($bkf_typ.equalsIgnoreCase(name)) {
			return bkf_typ();
		}
		if ($bom_memo1.equalsIgnoreCase(name)) {
			return bom_memo1();
		}
		if ($bom_memo2.equalsIgnoreCase(name)) {
			return bom_memo2();
		}
		if ($bom_memo3.equalsIgnoreCase(name)) {
			return bom_memo3();
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			return alloc_ctl_typ();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			return in_offst_typ();
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
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
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			return old_mfg_sts_typ();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($hdr_mfg_sts_typ.equalsIgnoreCase(name)) {
			return hdr_mfg_sts_typ();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
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
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			return base_unit_alt_qty();
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_rqmt_qty();
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_qty();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_qty();
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_rqmt_qty();
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_fxd_rqmt_qty();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			return par_inst_qty();
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			return chd_inpt_qty();
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			return chd_rqmt_qty();
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_chd_rqmt_qty();
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			return bom_id_no();
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			return chd_itm_seq();
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			return in_offst();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($schd_tm.equalsIgnoreCase(name)) {
			return schd_tm();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			return alt_itm_fix_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($no_lot_fix_flg.equalsIgnoreCase(name)) {
			return no_lot_fix_flg();
		}
		if ($inst_lot_fix_flg.equalsIgnoreCase(name)) {
			return inst_lot_fix_flg();
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
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			return main_itm_flg();
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			return yield_calc_flg();
		}
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			return lot_mix_flg();
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			return sublot_mix_flg();
		}
		if ($disp_seq_upd_flg.equalsIgnoreCase(name)) {
			return disp_seq_upd_flg();
		}
		if ($xfr_inst_err_flg.equalsIgnoreCase(name)) {
			return xfr_inst_err_flg();
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			return inst_abort_flg();
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			return old_inst_abort_flg();
		}
		if ($is_src_outsrc_srv_flg.equalsIgnoreCase(name)) {
			return is_src_outsrc_srv_flg();
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			return lst_reg_flg();
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			return not_frst_inst_can_flg();
		}
		if ($not_header_inst_abort_flg.equalsIgnoreCase(name)) {
			return not_header_inst_abort_flg();
		}
		if ($set_stk_str_ln_flg.equalsIgnoreCase(name)) {
			return set_stk_str_ln_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($old_ver_no.equalsIgnoreCase(name)) {
			old_ver_no(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
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
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
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
		if ($alloc_sno1.equalsIgnoreCase(name)) {
			alloc_sno1(value);
			return;
		}
		if ($alloc_sno2.equalsIgnoreCase(name)) {
			alloc_sno2(value);
			return;
		}
		if ($alloc_sno3.equalsIgnoreCase(name)) {
			alloc_sno3(value);
			return;
		}
		if ($alloc_sno4.equalsIgnoreCase(name)) {
			alloc_sno4(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
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
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inst_rpt_rmrks(value);
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
		if ($bkf_typ.equalsIgnoreCase(name)) {
			bkf_typ(value);
			return;
		}
		if ($bom_memo1.equalsIgnoreCase(name)) {
			bom_memo1(value);
			return;
		}
		if ($bom_memo2.equalsIgnoreCase(name)) {
			bom_memo2(value);
			return;
		}
		if ($bom_memo3.equalsIgnoreCase(name)) {
			bom_memo3(value);
			return;
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			alloc_ctl_typ(value);
			return;
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			inpt_ctl_typ(value);
			return;
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			in_offst_typ(value);
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
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
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			old_mfg_sts_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($hdr_mfg_sts_typ.equalsIgnoreCase(name)) {
			hdr_mfg_sts_typ(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
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
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			chd_itm_seq(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			chd_itm_seq(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			chd_itm_seq(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			chd_itm_seq(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			chd_itm_seq(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($schd_tm.equalsIgnoreCase(name)) {
			schd_tm(value);
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
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			alt_itm_fix_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($no_lot_fix_flg.equalsIgnoreCase(name)) {
			no_lot_fix_flg(value);
			return;
		}
		if ($inst_lot_fix_flg.equalsIgnoreCase(name)) {
			inst_lot_fix_flg(value);
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
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			main_itm_flg(value);
			return;
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			yield_calc_flg(value);
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
		if ($disp_seq_upd_flg.equalsIgnoreCase(name)) {
			disp_seq_upd_flg(value);
			return;
		}
		if ($xfr_inst_err_flg.equalsIgnoreCase(name)) {
			xfr_inst_err_flg(value);
			return;
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			inst_abort_flg(value);
			return;
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			old_inst_abort_flg(value);
			return;
		}
		if ($is_src_outsrc_srv_flg.equalsIgnoreCase(name)) {
			is_src_outsrc_srv_flg(value);
			return;
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			lst_reg_flg(value);
			return;
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			not_frst_inst_can_flg(value);
			return;
		}
		if ($not_header_inst_abort_flg.equalsIgnoreCase(name)) {
			not_header_inst_abort_flg(value);
			return;
		}
		if ($set_stk_str_ln_flg.equalsIgnoreCase(name)) {
			set_stk_str_ln_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($old_ver_no.equalsIgnoreCase(name)) {
			old_ver_no(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
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
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
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
		if ($alloc_sno1.equalsIgnoreCase(name)) {
			alloc_sno1(value);
			return;
		}
		if ($alloc_sno2.equalsIgnoreCase(name)) {
			alloc_sno2(value);
			return;
		}
		if ($alloc_sno3.equalsIgnoreCase(name)) {
			alloc_sno3(value);
			return;
		}
		if ($alloc_sno4.equalsIgnoreCase(name)) {
			alloc_sno4(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
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
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inst_rpt_rmrks(value);
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
		if ($bkf_typ.equalsIgnoreCase(name)) {
			bkf_typ(value);
			return;
		}
		if ($bom_memo1.equalsIgnoreCase(name)) {
			bom_memo1(value);
			return;
		}
		if ($bom_memo2.equalsIgnoreCase(name)) {
			bom_memo2(value);
			return;
		}
		if ($bom_memo3.equalsIgnoreCase(name)) {
			bom_memo3(value);
			return;
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			alloc_ctl_typ(value);
			return;
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			inpt_ctl_typ(value);
			return;
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			in_offst_typ(value);
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
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
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			old_mfg_sts_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($hdr_mfg_sts_typ.equalsIgnoreCase(name)) {
			hdr_mfg_sts_typ(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
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
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			chd_itm_seq(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			chd_itm_seq(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			chd_itm_seq(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			chd_itm_seq(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($base_unit_alt_qty.equalsIgnoreCase(name)) {
			base_unit_alt_qty(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($chd_itm_seq.equalsIgnoreCase(name)) {
			chd_itm_seq(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($schd_tm.equalsIgnoreCase(name)) {
			schd_tm(value);
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
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			alt_itm_fix_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($no_lot_fix_flg.equalsIgnoreCase(name)) {
			no_lot_fix_flg(value);
			return;
		}
		if ($inst_lot_fix_flg.equalsIgnoreCase(name)) {
			inst_lot_fix_flg(value);
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
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			main_itm_flg(value);
			return;
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			yield_calc_flg(value);
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
		if ($disp_seq_upd_flg.equalsIgnoreCase(name)) {
			disp_seq_upd_flg(value);
			return;
		}
		if ($xfr_inst_err_flg.equalsIgnoreCase(name)) {
			xfr_inst_err_flg(value);
			return;
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			inst_abort_flg(value);
			return;
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			old_inst_abort_flg(value);
			return;
		}
		if ($is_src_outsrc_srv_flg.equalsIgnoreCase(name)) {
			is_src_outsrc_srv_flg(value);
			return;
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			lst_reg_flg(value);
			return;
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			not_frst_inst_can_flg(value);
			return;
		}
		if ($not_header_inst_abort_flg.equalsIgnoreCase(name)) {
			not_header_inst_abort_flg(value);
			return;
		}
		if ($set_stk_str_ln_flg.equalsIgnoreCase(name)) {
			set_stk_str_ln_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

