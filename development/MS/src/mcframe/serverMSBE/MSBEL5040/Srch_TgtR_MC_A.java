package mcframe.serverMSBE.MSBEL5040;

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
 * ブロック"Srch_Tgt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch_TgtR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Scheduled input date 投入予定日.<p>
	 *
	 */
	public static final String $inpt_schd_dt = "inpt_schd_dt";
	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public static final String $gi_schd_dt = "gi_schd_dt";
	/**
	 * Scheduled GR date 入庫予定日.<p>
	 *
	 */
	public static final String $gr_schd_dt = "gr_schd_dt";
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
	 * Alternative flg. 代替ＦＬＧ.<p>
	 *
	 */
	public static final String $alt_flg = "alt_flg";
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
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
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
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public static final String $dlv_lg_grp_cd = "dlv_lg_grp_cd";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public static final String $gi_lg_grp_cd = "gi_lg_grp_cd";
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gi_str_ln_cd = "gi_str_ln_cd";
	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $gi_stk_arrv_bp_cd = "gi_stk_arrv_bp_cd";
	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gr_loc_cd = "gr_loc_cd";
	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gr_str_ln_cd = "gr_str_ln_cd";
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
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
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * Allow without SEIBAN No. 1 flg. 手配ＮＯ１無し可ＦＬＧ.<p>
	 *
	 */
	public static final String $sno1_null_flg = "sno1_null_flg";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * Allow without SEIBAN No. 2 flg. 手配ＮＯ２無し可ＦＬＧ.<p>
	 *
	 */
	public static final String $sno2_null_flg = "sno2_null_flg";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * Allow without SEIBAN No. 3 flg. 手配ＮＯ３無し可ＦＬＧ.<p>
	 *
	 */
	public static final String $sno3_null_flg = "sno3_null_flg";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Allow without SEIBAN No. 4 flg. 手配ＮＯ４無し可ＦＬＧ.<p>
	 *
	 */
	public static final String $sno4_null_flg = "sno4_null_flg";
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public static final String $pack_unit_qty = "pack_unit_qty";
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
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public static final String $cont_qty = "cont_qty";
	/**
	 * Without lot flg. ロット指定なしＦＬＧ.<p>
	 *
	 */
	public static final String $not_lot_fix_flg = "not_lot_fix_flg";
	/**
	 * Prohibit mixed lots flg. ロット混在不可ＦＬＧ.<p>
	 *
	 */
	public static final String $not_lot_mix_flg = "not_lot_mix_flg";
	/**
	 * Prohibit mixed sublots flg. サブロット混在不可ＦＬＧ.<p>
	 *
	 */
	public static final String $not_sublot_mix_flg = "not_sublot_mix_flg";
	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public static final String $vld_dt_fr = "vld_dt_fr";
	/**
	 * Expiration date FROM copy G 有効期限ＦＲＯＭ継承Ｇ.<p>
	 *
	 */
	public static final String $vld_dt_fr_grp = "vld_dt_fr_grp";
	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public static final String $vld_dt_to = "vld_dt_to";
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public static final String $alloc_scope_typ = "alloc_scope_typ";
	/**
	 * Prohibit mixed distribution G flg. 物流Ｇ混在不可ＦＬＧ.<p>
	 *
	 */
	public static final String $not_lg_mix_flg = "not_lg_mix_flg";
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public static final String $io_schd_typ = "io_schd_typ";
	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public static final String $io_schd_sts_typ = "io_schd_sts_typ";
	/**
	 * Inventory suggestion flg. 在庫提案ＦＬＧ.<p>
	 *
	 */
	public static final String $stk_flg = "stk_flg";
	/**
	 * Inventory prior allocation flg. 在庫優先引当ＦＬＧ.<p>
	 *
	 */
	public static final String $stk_alloc_flg = "stk_alloc_flg";
	/**
	 * Allocation pending exclusion flg. 引当保留除外ＦＬＧ.<p>
	 *
	 */
	public static final String $except_alloc_wait_flg = "except_alloc_wait_flg";
	/**
	 * Inventory info. location type 在庫情報場所区分.<p>
	 *
	 */
	public static final String $stk_info_loc_typ = "stk_info_loc_typ";
	/**
	 * Normal shipping distribution group cd. 通常出荷物流グループＣＤ.<p>
	 *
	 */
	public static final String $def_ship_lg_grp_cd = "def_ship_lg_grp_cd";
	/**
	 * Search with gross allocation specification flg. 総量引当指定検索ＦＬＧ.<p>
	 *
	 */
	public static final String $alloc_grp_srch_flg = "alloc_grp_srch_flg";
	/**
	 * SKU allocation flg. 荷姿引当ＦＬＧ.<p>
	 *
	 */
	public static final String $pack_alloc_flg = "pack_alloc_flg";
	/**
	 * For active ingredient flg. 有効成分対象ＦＬＧ.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * For active ingredient flg. (For check) 有効成分対象ＦＬＧ（チェック用）.<p>
	 *
	 */
	public static final String $chk_cont_fctr_flg = "chk_cont_fctr_flg";
	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public static final String $std_cont_fctr = "std_cont_fctr";
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
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public static final String $conv_base_qty = "conv_base_qty";
	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public static final String $conv_qty = "conv_qty";
	/**
	 * SKU number of decimal places 荷姿単位単位小数部有効桁数.<p>
	 *
	 */
	public static final String $pack_unit_dec_place = "pack_unit_dec_place";
	/**
	 * SKU rounding type 荷姿単位端数処理区分.<p>
	 *
	 */
	public static final String $pack_unit_rnd_typ = "pack_unit_rnd_typ";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
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
	 * Row number 行番号.<p>
	 *
	 */
	public static final String $lno = "lno";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Lot reverse prohibit type ロット逆転禁止区分.<p>
	 *
	 */
	public static final String $lot_back_stop_typ = "lot_back_stop_typ";
	/**
	 * Configuration check flg. 構成チェックＦＬＧ.<p>
	 *
	 */
	public static final String $chk_ship_flg = "chk_ship_flg";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta inpt_schd_dt_META = createCommonMeta($inpt_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gi_schd_dt_META = createCommonMeta($gi_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gr_schd_dt_META = createCommonMeta($gr_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta alt_flg_META = createCommonMeta($alt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_seq_META = createCommonMeta($alt_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta alt_itm_typ_META = createCommonMeta($alt_itm_typ, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP);
	public static final MCMeta alt_alloc_prio_META = createCommonMeta($alt_alloc_prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta inpt_loc_cd_META = createCommonMeta($inpt_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inpt_str_ln_cd_META = createCommonMeta($inpt_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta dlv_lg_grp_cd_META = createCommonMeta($dlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta gi_lg_grp_cd_META = createCommonMeta($gi_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_str_ln_cd_META = createCommonMeta($gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gi_stk_arrv_bp_cd_META = createCommonMeta($gi_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gr_loc_cd_META = createCommonMeta($gr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gr_str_ln_cd_META = createCommonMeta($gr_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_qty_META = createCommonMeta($cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta not_lot_fix_flg_META = createCommonMeta($not_lot_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_lot_mix_flg_META = createCommonMeta($not_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sublot_mix_flg_META = createCommonMeta($not_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vld_dt_fr_META = createCommonMeta($vld_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_fr_grp_META = createCommonMeta($vld_dt_fr_grp, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta vld_dt_to_META = createCommonMeta($vld_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta alloc_scope_typ_META = createCommonMeta($alloc_scope_typ, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP);
	public static final MCMeta not_lg_mix_flg_META = createCommonMeta($not_lg_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta io_schd_typ_META = createCommonMeta($io_schd_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_TYP);
	public static final MCMeta io_schd_sts_typ_META = createCommonMeta($io_schd_sts_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_STS_TYP);
	public static final MCMeta stk_flg_META = createCommonMeta($stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_alloc_flg_META = createCommonMeta($stk_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta except_alloc_wait_flg_META = createCommonMeta($except_alloc_wait_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_info_loc_typ_META = createCommonMeta($stk_info_loc_typ, mcframe.commonMS.meta.MS_META.STK_INFO_LOC_TYP);
	public static final MCMeta def_ship_lg_grp_cd_META = createCommonMeta($def_ship_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta alloc_grp_srch_flg_META = createCommonMeta($alloc_grp_srch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pack_alloc_flg_META = createCommonMeta($pack_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chk_cont_fctr_flg_META = createCommonMeta($chk_cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta conv_base_qty_META = createCommonMeta($conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta conv_qty_META = createCommonMeta($conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_dec_place_META = createCommonMeta($pack_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pack_unit_rnd_typ_META = createCommonMeta($pack_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta lno_META = createNumberMeta($lno);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta lot_back_stop_typ_META = createCommonMeta($lot_back_stop_typ, mcframe.commonMA.meta.MA_META.LOT_BACK_STOP_TYP);
	public static final MCMeta chk_ship_flg_META = createCommonMeta($chk_ship_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch_TgtR> constMetas = new ConstMetaList<Srch_TgtR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			inpt_schd_dt_META,
			gi_schd_dt_META,
			gr_schd_dt_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			ver_no_META,
			alt_flg_META,
			alt_grp_cd_META,
			alt_grp_seq_META,
			oper_inst_no_META,
			alt_itm_typ_META,
			alt_alloc_prio_META,
			inpt_loc_cd_META,
			inpt_str_ln_cd_META,
			dlv_lg_grp_cd_META,
			alloc_grp_cd_META,
			gi_lg_grp_cd_META,
			gi_loc_cd_META,
			gi_str_ln_cd_META,
			gi_stk_arrv_bp_cd_META,
			gr_loc_cd_META,
			gr_str_ln_cd_META,
			quality_typ_META,
			stk_id_typ_META,
			stk_bp_cd_META,
			gd_cd_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno1_null_flg_META,
			sno2_META,
			sno2_null_flg_META,
			sno3_META,
			sno3_null_flg_META,
			sno4_META,
			sno4_null_flg_META,
			pack_unit_cd_META,
			pack_unit_qty_META,
			base_unit_cd_META,
			base_unit_qty_META,
			cont_qty_META,
			not_lot_fix_flg_META,
			not_lot_mix_flg_META,
			not_sublot_mix_flg_META,
			vld_dt_fr_META,
			vld_dt_fr_grp_META,
			vld_dt_to_META,
			alloc_scope_typ_META,
			not_lg_mix_flg_META,
			ship_term_cd_META,
			io_schd_typ_META,
			io_schd_sts_typ_META,
			stk_flg_META,
			stk_alloc_flg_META,
			except_alloc_wait_flg_META,
			stk_info_loc_typ_META,
			def_ship_lg_grp_cd_META,
			alloc_grp_srch_flg_META,
			pack_alloc_flg_META,
			cont_fctr_flg_META,
			chk_cont_fctr_flg_META,
			std_cont_fctr_META,
			cont_fctr_rnd_typ_META,
			cont_fctr_dec_place_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			conv_base_qty_META,
			conv_qty_META,
			pack_unit_dec_place_META,
			pack_unit_rnd_typ_META,
			asset_mng_typ_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			lno_META,
			cst_cd_META,
			lot_back_stop_typ_META,
			chk_ship_flg_META
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
	protected Srch_TgtR_MC_A(ConstMetaList<? extends Srch_TgtR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch_TgtR clone() {
		return (Srch_TgtR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch_TgtR createInstance() {
		return (Srch_TgtR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch_TgtR getValues(String... names) {
		return (Srch_TgtR) super.getValues(names);
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
	 * Scheduled input date 投入予定日.<p>
	 *
	 */
	public MCDate inpt_schd_dt() {
		return getConstDate(offset + 1, $inpt_schd_dt);
	}

	/**
	 * Scheduled input date 投入予定日.<p>
	 *
	 */
	public void inpt_schd_dt(MCDate value) {
		setConstDate(offset + 1, $inpt_schd_dt, value);
	}


	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public MCDate gi_schd_dt() {
		return getConstDate(offset + 2, $gi_schd_dt);
	}

	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public void gi_schd_dt(MCDate value) {
		setConstDate(offset + 2, $gi_schd_dt, value);
	}


	/**
	 * Scheduled GR date 入庫予定日.<p>
	 *
	 */
	public MCDate gr_schd_dt() {
		return getConstDate(offset + 3, $gr_schd_dt);
	}

	/**
	 * Scheduled GR date 入庫予定日.<p>
	 *
	 */
	public void gr_schd_dt(MCDate value) {
		setConstDate(offset + 3, $gr_schd_dt, value);
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 8, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 8, $ver_no, value);
	}


	/**
	 * Alternative flg. 代替ＦＬＧ.<p>
	 *
	 */
	public boolean alt_flg() {
		return getConstBoolean(offset + 9, $alt_flg);
	}

	/**
	 * Alternative flg. 代替ＦＬＧ.<p>
	 *
	 */
	public void alt_flg(boolean value) {
		setConstBoolean(offset + 9, $alt_flg, value);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 10, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 10, $alt_grp_cd, value);
	}


	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public MCNumber alt_grp_seq() {
		return getConstNumber(offset + 11, $alt_grp_seq);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(MCNumber value) {
		setConstNumber(offset + 11, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(int value) {
		setConstNumber(offset + 11, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(long value) {
		setConstNumber(offset + 11, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(float value) {
		setConstNumber(offset + 11, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(double value) {
		setConstNumber(offset + 11, $alt_grp_seq, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 12, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 12, $oper_inst_no, value);
	}


	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public String alt_itm_typ() {
		return getConstString(offset + 13, $alt_itm_typ);
	}

	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public void alt_itm_typ(String value) {
		setConstString(offset + 13, $alt_itm_typ, value);
	}


	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public MCNumber alt_alloc_prio() {
		return getConstNumber(offset + 14, $alt_alloc_prio);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(MCNumber value) {
		setConstNumber(offset + 14, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(int value) {
		setConstNumber(offset + 14, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(long value) {
		setConstNumber(offset + 14, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(float value) {
		setConstNumber(offset + 14, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(double value) {
		setConstNumber(offset + 14, $alt_alloc_prio, value);
	}


	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public String inpt_loc_cd() {
		return getConstString(offset + 15, $inpt_loc_cd);
	}

	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public void inpt_loc_cd(String value) {
		setConstString(offset + 15, $inpt_loc_cd, value);
	}


	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public String inpt_str_ln_cd() {
		return getConstString(offset + 16, $inpt_str_ln_cd);
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public void inpt_str_ln_cd(String value) {
		setConstString(offset + 16, $inpt_str_ln_cd, value);
	}


	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public String dlv_lg_grp_cd() {
		return getConstString(offset + 17, $dlv_lg_grp_cd);
	}

	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public void dlv_lg_grp_cd(String value) {
		setConstString(offset + 17, $dlv_lg_grp_cd, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 18, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 18, $alloc_grp_cd, value);
	}


	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public String gi_lg_grp_cd() {
		return getConstString(offset + 19, $gi_lg_grp_cd);
	}

	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public void gi_lg_grp_cd(String value) {
		setConstString(offset + 19, $gi_lg_grp_cd, value);
	}


	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 20, $gi_loc_cd);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 20, $gi_loc_cd, value);
	}


	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return getConstString(offset + 21, $gi_str_ln_cd);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		setConstString(offset + 21, $gi_str_ln_cd, value);
	}


	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gi_stk_arrv_bp_cd() {
		return getConstString(offset + 22, $gi_stk_arrv_bp_cd);
	}

	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gi_stk_arrv_bp_cd(String value) {
		setConstString(offset + 22, $gi_stk_arrv_bp_cd, value);
	}


	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return getConstString(offset + 23, $gr_loc_cd);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		setConstString(offset + 23, $gr_loc_cd, value);
	}


	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return getConstString(offset + 24, $gr_str_ln_cd);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		setConstString(offset + 24, $gr_str_ln_cd, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 25, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 25, $quality_typ, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 26, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 26, $stk_id_typ, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 27, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 27, $stk_bp_cd, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 28, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 28, $gd_cd, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 29, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 29, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 30, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 30, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 31, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 31, $sno1, value);
	}


	/**
	 * Allow without SEIBAN No. 1 flg. 手配ＮＯ１無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 32, $sno1_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 1 flg. 手配ＮＯ１無し可ＦＬＧ.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 32, $sno1_null_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 33, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 33, $sno2, value);
	}


	/**
	 * Allow without SEIBAN No. 2 flg. 手配ＮＯ２無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 34, $sno2_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 2 flg. 手配ＮＯ２無し可ＦＬＧ.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 34, $sno2_null_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 35, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 35, $sno3, value);
	}


	/**
	 * Allow without SEIBAN No. 3 flg. 手配ＮＯ３無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 36, $sno3_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 3 flg. 手配ＮＯ３無し可ＦＬＧ.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 36, $sno3_null_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 37, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 37, $sno4, value);
	}


	/**
	 * Allow without SEIBAN No. 4 flg. 手配ＮＯ４無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 38, $sno4_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 4 flg. 手配ＮＯ４無し可ＦＬＧ.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 38, $sno4_null_flg, value);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 39, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 39, $pack_unit_cd, value);
	}


	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 40, $pack_unit_qty);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 40, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 40, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 40, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 40, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 40, $pack_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 41, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 41, $base_unit_cd, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 42, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 42, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 42, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 42, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 42, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 42, $base_unit_qty, value);
	}


	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public MCNumber cont_qty() {
		return getConstNumber(offset + 43, $cont_qty);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(MCNumber value) {
		setConstNumber(offset + 43, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(int value) {
		setConstNumber(offset + 43, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(long value) {
		setConstNumber(offset + 43, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(float value) {
		setConstNumber(offset + 43, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(double value) {
		setConstNumber(offset + 43, $cont_qty, value);
	}


	/**
	 * Without lot flg. ロット指定なしＦＬＧ.<p>
	 *
	 */
	public boolean not_lot_fix_flg() {
		return getConstBoolean(offset + 44, $not_lot_fix_flg);
	}

	/**
	 * Without lot flg. ロット指定なしＦＬＧ.<p>
	 *
	 */
	public void not_lot_fix_flg(boolean value) {
		setConstBoolean(offset + 44, $not_lot_fix_flg, value);
	}


	/**
	 * Prohibit mixed lots flg. ロット混在不可ＦＬＧ.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return getConstBoolean(offset + 45, $not_lot_mix_flg);
	}

	/**
	 * Prohibit mixed lots flg. ロット混在不可ＦＬＧ.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 45, $not_lot_mix_flg, value);
	}


	/**
	 * Prohibit mixed sublots flg. サブロット混在不可ＦＬＧ.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return getConstBoolean(offset + 46, $not_sublot_mix_flg);
	}

	/**
	 * Prohibit mixed sublots flg. サブロット混在不可ＦＬＧ.<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 46, $not_sublot_mix_flg, value);
	}


	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate vld_dt_fr() {
		return getConstDate(offset + 47, $vld_dt_fr);
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public void vld_dt_fr(MCDate value) {
		setConstDate(offset + 47, $vld_dt_fr, value);
	}


	/**
	 * Expiration date FROM copy G 有効期限ＦＲＯＭ継承Ｇ.<p>
	 *
	 */
	public MCNumber vld_dt_fr_grp() {
		return getConstNumber(offset + 48, $vld_dt_fr_grp);
	}

	/**
	 * Expiration date FROM copy G 有効期限ＦＲＯＭ継承Ｇ.<p>
	 *
	 */
	public void vld_dt_fr_grp(MCNumber value) {
		setConstNumber(offset + 48, $vld_dt_fr_grp, value);
	}

	/**
	 * Expiration date FROM copy G 有効期限ＦＲＯＭ継承Ｇ.<p>
	 *
	 */
	public void vld_dt_fr_grp(int value) {
		setConstNumber(offset + 48, $vld_dt_fr_grp, value);
	}

	/**
	 * Expiration date FROM copy G 有効期限ＦＲＯＭ継承Ｇ.<p>
	 *
	 */
	public void vld_dt_fr_grp(long value) {
		setConstNumber(offset + 48, $vld_dt_fr_grp, value);
	}

	/**
	 * Expiration date FROM copy G 有効期限ＦＲＯＭ継承Ｇ.<p>
	 *
	 */
	public void vld_dt_fr_grp(float value) {
		setConstNumber(offset + 48, $vld_dt_fr_grp, value);
	}

	/**
	 * Expiration date FROM copy G 有効期限ＦＲＯＭ継承Ｇ.<p>
	 *
	 */
	public void vld_dt_fr_grp(double value) {
		setConstNumber(offset + 48, $vld_dt_fr_grp, value);
	}


	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCDate vld_dt_to() {
		return getConstDate(offset + 49, $vld_dt_to);
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public void vld_dt_to(MCDate value) {
		setConstDate(offset + 49, $vld_dt_to, value);
	}


	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public String alloc_scope_typ() {
		return getConstString(offset + 50, $alloc_scope_typ);
	}

	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public void alloc_scope_typ(String value) {
		setConstString(offset + 50, $alloc_scope_typ, value);
	}


	/**
	 * Prohibit mixed distribution G flg. 物流Ｇ混在不可ＦＬＧ.<p>
	 *
	 */
	public boolean not_lg_mix_flg() {
		return getConstBoolean(offset + 51, $not_lg_mix_flg);
	}

	/**
	 * Prohibit mixed distribution G flg. 物流Ｇ混在不可ＦＬＧ.<p>
	 *
	 */
	public void not_lg_mix_flg(boolean value) {
		setConstBoolean(offset + 51, $not_lg_mix_flg, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 52, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 52, $ship_term_cd, value);
	}


	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public String io_schd_typ() {
		return getConstString(offset + 53, $io_schd_typ);
	}

	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public void io_schd_typ(String value) {
		setConstString(offset + 53, $io_schd_typ, value);
	}


	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public String io_schd_sts_typ() {
		return getConstString(offset + 54, $io_schd_sts_typ);
	}

	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public void io_schd_sts_typ(String value) {
		setConstString(offset + 54, $io_schd_sts_typ, value);
	}


	/**
	 * Inventory suggestion flg. 在庫提案ＦＬＧ.<p>
	 *
	 */
	public boolean stk_flg() {
		return getConstBoolean(offset + 55, $stk_flg);
	}

	/**
	 * Inventory suggestion flg. 在庫提案ＦＬＧ.<p>
	 *
	 */
	public void stk_flg(boolean value) {
		setConstBoolean(offset + 55, $stk_flg, value);
	}


	/**
	 * Inventory prior allocation flg. 在庫優先引当ＦＬＧ.<p>
	 *
	 */
	public boolean stk_alloc_flg() {
		return getConstBoolean(offset + 56, $stk_alloc_flg);
	}

	/**
	 * Inventory prior allocation flg. 在庫優先引当ＦＬＧ.<p>
	 *
	 */
	public void stk_alloc_flg(boolean value) {
		setConstBoolean(offset + 56, $stk_alloc_flg, value);
	}


	/**
	 * Allocation pending exclusion flg. 引当保留除外ＦＬＧ.<p>
	 *
	 */
	public boolean except_alloc_wait_flg() {
		return getConstBoolean(offset + 57, $except_alloc_wait_flg);
	}

	/**
	 * Allocation pending exclusion flg. 引当保留除外ＦＬＧ.<p>
	 *
	 */
	public void except_alloc_wait_flg(boolean value) {
		setConstBoolean(offset + 57, $except_alloc_wait_flg, value);
	}


	/**
	 * Inventory info. location type 在庫情報場所区分.<p>
	 *
	 */
	public String stk_info_loc_typ() {
		return getConstString(offset + 58, $stk_info_loc_typ);
	}

	/**
	 * Inventory info. location type 在庫情報場所区分.<p>
	 *
	 */
	public void stk_info_loc_typ(String value) {
		setConstString(offset + 58, $stk_info_loc_typ, value);
	}


	/**
	 * Normal shipping distribution group cd. 通常出荷物流グループＣＤ.<p>
	 *
	 */
	public String def_ship_lg_grp_cd() {
		return getConstString(offset + 59, $def_ship_lg_grp_cd);
	}

	/**
	 * Normal shipping distribution group cd. 通常出荷物流グループＣＤ.<p>
	 *
	 */
	public void def_ship_lg_grp_cd(String value) {
		setConstString(offset + 59, $def_ship_lg_grp_cd, value);
	}


	/**
	 * Search with gross allocation specification flg. 総量引当指定検索ＦＬＧ.<p>
	 *
	 */
	public boolean alloc_grp_srch_flg() {
		return getConstBoolean(offset + 60, $alloc_grp_srch_flg);
	}

	/**
	 * Search with gross allocation specification flg. 総量引当指定検索ＦＬＧ.<p>
	 *
	 */
	public void alloc_grp_srch_flg(boolean value) {
		setConstBoolean(offset + 60, $alloc_grp_srch_flg, value);
	}


	/**
	 * SKU allocation flg. 荷姿引当ＦＬＧ.<p>
	 *
	 */
	public boolean pack_alloc_flg() {
		return getConstBoolean(offset + 61, $pack_alloc_flg);
	}

	/**
	 * SKU allocation flg. 荷姿引当ＦＬＧ.<p>
	 *
	 */
	public void pack_alloc_flg(boolean value) {
		setConstBoolean(offset + 61, $pack_alloc_flg, value);
	}


	/**
	 * For active ingredient flg. 有効成分対象ＦＬＧ.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 62, $cont_fctr_flg);
	}

	/**
	 * For active ingredient flg. 有効成分対象ＦＬＧ.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 62, $cont_fctr_flg, value);
	}


	/**
	 * For active ingredient flg. (For check) 有効成分対象ＦＬＧ（チェック用）.<p>
	 *
	 */
	public boolean chk_cont_fctr_flg() {
		return getConstBoolean(offset + 63, $chk_cont_fctr_flg);
	}

	/**
	 * For active ingredient flg. (For check) 有効成分対象ＦＬＧ（チェック用）.<p>
	 *
	 */
	public void chk_cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 63, $chk_cont_fctr_flg, value);
	}


	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 64, $std_cont_fctr);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 64, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 64, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 64, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 64, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 64, $std_cont_fctr, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 65, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 65, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 66, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 66, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 66, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 66, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 66, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 66, $cont_fctr_dec_place, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 67, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 67, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 67, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 67, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 67, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 67, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 68, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 68, $base_unit_rnd_typ, value);
	}


	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public MCNumber conv_base_qty() {
		return getConstNumber(offset + 69, $conv_base_qty);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(MCNumber value) {
		setConstNumber(offset + 69, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(int value) {
		setConstNumber(offset + 69, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(long value) {
		setConstNumber(offset + 69, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(float value) {
		setConstNumber(offset + 69, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(double value) {
		setConstNumber(offset + 69, $conv_base_qty, value);
	}


	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public MCNumber conv_qty() {
		return getConstNumber(offset + 70, $conv_qty);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(MCNumber value) {
		setConstNumber(offset + 70, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(int value) {
		setConstNumber(offset + 70, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(long value) {
		setConstNumber(offset + 70, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(float value) {
		setConstNumber(offset + 70, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(double value) {
		setConstNumber(offset + 70, $conv_qty, value);
	}


	/**
	 * SKU number of decimal places 荷姿単位単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_unit_dec_place() {
		return getConstNumber(offset + 71, $pack_unit_dec_place);
	}

	/**
	 * SKU number of decimal places 荷姿単位単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 71, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(int value) {
		setConstNumber(offset + 71, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(long value) {
		setConstNumber(offset + 71, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(float value) {
		setConstNumber(offset + 71, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(double value) {
		setConstNumber(offset + 71, $pack_unit_dec_place, value);
	}


	/**
	 * SKU rounding type 荷姿単位端数処理区分.<p>
	 *
	 */
	public String pack_unit_rnd_typ() {
		return getConstString(offset + 72, $pack_unit_rnd_typ);
	}

	/**
	 * SKU rounding type 荷姿単位端数処理区分.<p>
	 *
	 */
	public void pack_unit_rnd_typ(String value) {
		setConstString(offset + 72, $pack_unit_rnd_typ, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 73, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 73, $asset_mng_typ, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 74, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 74, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 75, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 75, $sublot_mng_typ, value);
	}


	/**
	 * Row number 行番号.<p>
	 *
	 */
	public MCNumber lno() {
		return getConstNumber(offset + 76, $lno);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void lno(MCNumber value) {
		setConstNumber(offset + 76, $lno, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void lno(int value) {
		setConstNumber(offset + 76, $lno, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void lno(long value) {
		setConstNumber(offset + 76, $lno, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void lno(float value) {
		setConstNumber(offset + 76, $lno, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void lno(double value) {
		setConstNumber(offset + 76, $lno, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 77, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 77, $cst_cd, value);
	}


	/**
	 * Lot reverse prohibit type ロット逆転禁止区分.<p>
	 *
	 */
	public String lot_back_stop_typ() {
		return getConstString(offset + 78, $lot_back_stop_typ);
	}

	/**
	 * Lot reverse prohibit type ロット逆転禁止区分.<p>
	 *
	 */
	public void lot_back_stop_typ(String value) {
		setConstString(offset + 78, $lot_back_stop_typ, value);
	}


	/**
	 * Configuration check flg. 構成チェックＦＬＧ.<p>
	 *
	 */
	public boolean chk_ship_flg() {
		return getConstBoolean(offset + 79, $chk_ship_flg);
	}

	/**
	 * Configuration check flg. 構成チェックＦＬＧ.<p>
	 *
	 */
	public void chk_ship_flg(boolean value) {
		setConstBoolean(offset + 79, $chk_ship_flg, value);
	}


	public String getString(String name) {
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
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($stk_info_loc_typ.equalsIgnoreCase(name)) {
			return stk_info_loc_typ();
		}
		if ($def_ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return def_ship_lg_grp_cd();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($pack_unit_rnd_typ.equalsIgnoreCase(name)) {
			return pack_unit_rnd_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			return lot_back_stop_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			return vld_dt_fr_grp();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			return conv_base_qty();
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			return conv_qty();
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($lno.equalsIgnoreCase(name)) {
			return lno();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($inpt_schd_dt.equalsIgnoreCase(name)) {
			return inpt_schd_dt();
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			return gi_schd_dt();
		}
		if ($gr_schd_dt.equalsIgnoreCase(name)) {
			return gr_schd_dt();
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			return vld_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($alt_flg.equalsIgnoreCase(name)) {
			return alt_flg();
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
		if ($not_lot_fix_flg.equalsIgnoreCase(name)) {
			return not_lot_fix_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		if ($stk_flg.equalsIgnoreCase(name)) {
			return stk_flg();
		}
		if ($stk_alloc_flg.equalsIgnoreCase(name)) {
			return stk_alloc_flg();
		}
		if ($except_alloc_wait_flg.equalsIgnoreCase(name)) {
			return except_alloc_wait_flg();
		}
		if ($alloc_grp_srch_flg.equalsIgnoreCase(name)) {
			return alloc_grp_srch_flg();
		}
		if ($pack_alloc_flg.equalsIgnoreCase(name)) {
			return pack_alloc_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($chk_cont_fctr_flg.equalsIgnoreCase(name)) {
			return chk_cont_fctr_flg();
		}
		if ($chk_ship_flg.equalsIgnoreCase(name)) {
			return chk_ship_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($stk_info_loc_typ.equalsIgnoreCase(name)) {
			return stk_info_loc_typ();
		}
		if ($def_ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return def_ship_lg_grp_cd();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($pack_unit_rnd_typ.equalsIgnoreCase(name)) {
			return pack_unit_rnd_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			return lot_back_stop_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			return vld_dt_fr_grp();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			return conv_base_qty();
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			return conv_qty();
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($lno.equalsIgnoreCase(name)) {
			return lno();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($inpt_schd_dt.equalsIgnoreCase(name)) {
			return inpt_schd_dt();
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			return gi_schd_dt();
		}
		if ($gr_schd_dt.equalsIgnoreCase(name)) {
			return gr_schd_dt();
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			return vld_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($alt_flg.equalsIgnoreCase(name)) {
			return alt_flg();
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
		if ($not_lot_fix_flg.equalsIgnoreCase(name)) {
			return not_lot_fix_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		if ($stk_flg.equalsIgnoreCase(name)) {
			return stk_flg();
		}
		if ($stk_alloc_flg.equalsIgnoreCase(name)) {
			return stk_alloc_flg();
		}
		if ($except_alloc_wait_flg.equalsIgnoreCase(name)) {
			return except_alloc_wait_flg();
		}
		if ($alloc_grp_srch_flg.equalsIgnoreCase(name)) {
			return alloc_grp_srch_flg();
		}
		if ($pack_alloc_flg.equalsIgnoreCase(name)) {
			return pack_alloc_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($chk_cont_fctr_flg.equalsIgnoreCase(name)) {
			return chk_cont_fctr_flg();
		}
		if ($chk_ship_flg.equalsIgnoreCase(name)) {
			return chk_ship_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
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
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($stk_info_loc_typ.equalsIgnoreCase(name)) {
			stk_info_loc_typ(value);
			return;
		}
		if ($def_ship_lg_grp_cd.equalsIgnoreCase(name)) {
			def_ship_lg_grp_cd(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($pack_unit_rnd_typ.equalsIgnoreCase(name)) {
			pack_unit_rnd_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			lot_back_stop_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			vld_dt_fr_grp(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			vld_dt_fr_grp(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			vld_dt_fr_grp(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			vld_dt_fr_grp(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			vld_dt_fr_grp(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($inpt_schd_dt.equalsIgnoreCase(name)) {
			inpt_schd_dt(value);
			return;
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			gi_schd_dt(value);
			return;
		}
		if ($gr_schd_dt.equalsIgnoreCase(name)) {
			gr_schd_dt(value);
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
	public void setBoolean(String name, boolean value) {
		if ($alt_flg.equalsIgnoreCase(name)) {
			alt_flg(value);
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
		if ($not_lot_fix_flg.equalsIgnoreCase(name)) {
			not_lot_fix_flg(value);
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
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
			return;
		}
		if ($stk_flg.equalsIgnoreCase(name)) {
			stk_flg(value);
			return;
		}
		if ($stk_alloc_flg.equalsIgnoreCase(name)) {
			stk_alloc_flg(value);
			return;
		}
		if ($except_alloc_wait_flg.equalsIgnoreCase(name)) {
			except_alloc_wait_flg(value);
			return;
		}
		if ($alloc_grp_srch_flg.equalsIgnoreCase(name)) {
			alloc_grp_srch_flg(value);
			return;
		}
		if ($pack_alloc_flg.equalsIgnoreCase(name)) {
			pack_alloc_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($chk_cont_fctr_flg.equalsIgnoreCase(name)) {
			chk_cont_fctr_flg(value);
			return;
		}
		if ($chk_ship_flg.equalsIgnoreCase(name)) {
			chk_ship_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
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
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($stk_info_loc_typ.equalsIgnoreCase(name)) {
			stk_info_loc_typ(value);
			return;
		}
		if ($def_ship_lg_grp_cd.equalsIgnoreCase(name)) {
			def_ship_lg_grp_cd(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($pack_unit_rnd_typ.equalsIgnoreCase(name)) {
			pack_unit_rnd_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			lot_back_stop_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			vld_dt_fr_grp(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			vld_dt_fr_grp(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			vld_dt_fr_grp(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			vld_dt_fr_grp(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($vld_dt_fr_grp.equalsIgnoreCase(name)) {
			vld_dt_fr_grp(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			conv_base_qty(value);
			return;
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			conv_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($inpt_schd_dt.equalsIgnoreCase(name)) {
			inpt_schd_dt(value);
			return;
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			gi_schd_dt(value);
			return;
		}
		if ($gr_schd_dt.equalsIgnoreCase(name)) {
			gr_schd_dt(value);
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
	public void setBooleanNE(String name, boolean value) {
		if ($alt_flg.equalsIgnoreCase(name)) {
			alt_flg(value);
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
		if ($not_lot_fix_flg.equalsIgnoreCase(name)) {
			not_lot_fix_flg(value);
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
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
			return;
		}
		if ($stk_flg.equalsIgnoreCase(name)) {
			stk_flg(value);
			return;
		}
		if ($stk_alloc_flg.equalsIgnoreCase(name)) {
			stk_alloc_flg(value);
			return;
		}
		if ($except_alloc_wait_flg.equalsIgnoreCase(name)) {
			except_alloc_wait_flg(value);
			return;
		}
		if ($alloc_grp_srch_flg.equalsIgnoreCase(name)) {
			alloc_grp_srch_flg(value);
			return;
		}
		if ($pack_alloc_flg.equalsIgnoreCase(name)) {
			pack_alloc_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($chk_cont_fctr_flg.equalsIgnoreCase(name)) {
			chk_cont_fctr_flg(value);
			return;
		}
		if ($chk_ship_flg.equalsIgnoreCase(name)) {
			chk_ship_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

