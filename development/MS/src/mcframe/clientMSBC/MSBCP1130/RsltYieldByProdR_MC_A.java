package mcframe.clientMSBC.MSBCP1130;

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
 * ブロック"RsltYieldByProd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltYieldByProdR_MC_A extends MCConstRow {

	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public static final String $yield_typ = "yield_typ";
	/**
	 * Output type name 出来高区分名.<p>
	 *
	 */
	public static final String $yield_typ_nm = "yield_typ_nm";
	public static final String $itm_p = "itm_p";
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
	public static final String $trd_unit_yield_act_qty_p = "trd_unit_yield_act_qty_p";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Transaction unit conversion rounding type 取引単位換算端数処理区分.<p>
	 *
	 */
	public static final String $trd_unit_conv_rnd_typ = "trd_unit_conv_rnd_typ";
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
	public static final String $base_unit_yield_act_qty_p = "base_unit_yield_act_qty_p";
	public static final String $base_unit_yield_schd_qty_p = "base_unit_yield_schd_qty_p";
	public static final String $base_unit_yield_rem_qty_p = "base_unit_yield_rem_qty_p";
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
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public static final String $conv_base_qty = "conv_base_qty";
	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public static final String $conv_qty = "conv_qty";
	public static final String $act_dt_p = "act_dt_p";
	public static final String $ac_dt_p = "ac_dt_p";
	public static final String $can_ac_dt_p = "can_ac_dt_p";
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
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public static final String $lot_no_ptn_cd = "lot_no_ptn_cd";
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
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sublot_no_ptn_cd = "sublot_no_ptn_cd";
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
	public static final String $lot_no_p = "lot_no_p";
	/**
	 * Copy-from lot No. コピー元ロットＮＯ.<p>
	 *
	 */
	public static final String $org_lot_no = "org_lot_no";
	/**
	 * Copy-from sublot No. コピー元サブロットＮＯ.<p>
	 *
	 */
	public static final String $org_sublot_no = "org_sublot_no";
	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public static final String $same_lot_flg = "same_lot_flg";
	public static final String $sno_p = "sno_p";
	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public static final String $yield_rsn_cd = "yield_rsn_cd";
	/**
	 * Output reason name 出来高理由名.<p>
	 *
	 */
	public static final String $yield_rsn_nm = "yield_rsn_nm";
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
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public static final String $strg_loc_nm = "strg_loc_nm";
	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public static final String $strg_str_ln_tgt_flg = "strg_str_ln_tgt_flg";
	public static final String $strg_str_ln_p = "strg_str_ln_p";
	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public static final String $unschd_yield_typ = "unschd_yield_typ";
	/**
	 * Output type name 出来高区分名.<p>
	 *
	 */
	public static final String $unschd_yield_typ_nm = "unschd_yield_typ_nm";
	public static final String $unschd_itm_p = "unschd_itm_p";
	public static final String $unschd_lot_no_p = "unschd_lot_no_p";
	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public static final String $unschd_same_lot_flg = "unschd_same_lot_flg";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $unschd_lot_mng_typ = "unschd_lot_mng_typ";
	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $unschd_lot_no_typ = "unschd_lot_no_typ";
	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public static final String $unschd_lot_no_ptn_cd = "unschd_lot_no_ptn_cd";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $unschd_sublot_mng_typ = "unschd_sublot_mng_typ";
	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $unschd_sublot_no_typ = "unschd_sublot_no_typ";
	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public static final String $unschd_sublot_no_ptn_cd = "unschd_sublot_no_ptn_cd";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unschd_trd_unit_cd = "unschd_trd_unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unschd_trd_unit_nm = "unschd_trd_unit_nm";
	public static final String $unschd_trd_unit_yield_act_qty_p = "unschd_trd_unit_yield_act_qty_p";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $unschd_trd_unit_dec_place = "unschd_trd_unit_dec_place";
	/**
	 * Transaction unit conversion rounding type 取引単位換算端数処理区分.<p>
	 *
	 */
	public static final String $unschd_trd_unit_conv_rnd_typ = "unschd_trd_unit_conv_rnd_typ";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $unschd_base_unit_cd = "unschd_base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $unschd_base_unit_nm = "unschd_base_unit_nm";
	public static final String $unschd_base_unit_yield_act_qty_p = "unschd_base_unit_yield_act_qty_p";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $unschd_base_unit_dec_place = "unschd_base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public static final String $unschd_base_unit_conv_rnd_typ = "unschd_base_unit_conv_rnd_typ";
	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public static final String $unschd_conv_base_qty = "unschd_conv_base_qty";
	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public static final String $unschd_conv_qty = "unschd_conv_qty";
	public static final String $unschd_act_dt_p = "unschd_act_dt_p";
	public static final String $unschd_ac_dt_p = "unschd_ac_dt_p";
	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public static final String $unschd_yield_rsn_cd = "unschd_yield_rsn_cd";
	/**
	 * Output reason name 出来高理由名.<p>
	 *
	 */
	public static final String $unschd_yield_rsn_nm = "unschd_yield_rsn_nm";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $unschd_gd_cd = "unschd_gd_cd";
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $unschd_gd_nm = "unschd_gd_nm";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $unschd_strg_loc_cd = "unschd_strg_loc_cd";
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public static final String $unschd_strg_loc_nm = "unschd_strg_loc_nm";
	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public static final String $unschd_strg_str_ln_tgt_flg = "unschd_strg_str_ln_tgt_flg";
	public static final String $unschd_strg_str_ln_p = "unschd_strg_str_ln_p";
	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public static final String $yield_rate = "yield_rate";
	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public static final String $inst_rpt_rmrks = "inst_rpt_rmrks";
	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public static final String $insp_cnt_rmrks = "insp_cnt_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $yield_act_intr_rmrks = "yield_act_intr_rmrks";
	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public static final String $yield_act_rpt_rmrks = "yield_act_rpt_rmrks";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public static final String $yield_act_sub_char1 = "yield_act_sub_char1";
	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public static final String $yield_act_sub_char2 = "yield_act_sub_char2";
	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public static final String $yield_act_sub_char3 = "yield_act_sub_char3";
	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public static final String $yield_schd_no = "yield_schd_no";
	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public static final String $yield_act_no = "yield_act_no";
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
	 * Identification tag issued 現品票発行済.<p>
	 *
	 */
	public static final String $stk_lst_prnt_flg = "stk_lst_prnt_flg";
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
	 * External output result No. 外部出来高実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_yield_act_no = "ext_yield_act_no";
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
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Row to copy コピー行.<p>
	 *
	 */
	public static final String $copied_row_flg = "copied_row_flg";
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * To update 更新対象.<p>
	 *
	 */
	public static final String $upd_tgt_flg = "upd_tgt_flg";
	/**
	 * GUI index GUIインデックス.<p>
	 *
	 */
	public static final String $gui_index = "gui_index";
	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public static final String $st_ac_dt = "st_ac_dt";
	/**
	 * Base unit output qty. before change 変更前基準単位出来高数量.<p>
	 *
	 */
	public static final String $base_unit_yield_act_qty_bef = "base_unit_yield_act_qty_bef";
	/**
	 * Base unit output result qty. 基準単位出来高実績数量.<p>
	 *
	 */
	public static final String $yield_act_qty = "yield_act_qty";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $trd_unit_yield_act_qty = $trd_unit_yield_act_qty_p + ".qty";
	public static final String $base_unit_yield_act_qty = $base_unit_yield_act_qty_p + ".qty";
	public static final String $base_unit_yield_schd_qty = $base_unit_yield_schd_qty_p + ".qty";
	public static final String $base_unit_yield_rem_qty = $base_unit_yield_rem_qty_p + ".qty";
	public static final String $act_dt = $act_dt_p + ".ymd";
	public static final String $act_hm = $act_dt_p + ".hm";
	public static final String $ac_dt = $ac_dt_p + ".ac_dt";
	public static final String $can_ac_dt_for_input = $can_ac_dt_p + ".can_ac_dt_for_input";
	public static final String $can_ac_dt = $can_ac_dt_p + ".can_ac_dt_for_call";
	public static final String $ac_dt_after_srch = $can_ac_dt_p + ".ac_dt_after_srch";
	public static final String $crt_lot_flg = $lot_no_p + ".crt_lot_flg";
	public static final String $lot_no = $lot_no_p + ".lot_no";
	public static final String $sublot_no = $lot_no_p + ".sublot_no";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4 = $sno_p + ".sno4";
	public static final String $strg_str_ln_cd = $strg_str_ln_p + ".str_ln_cd";
	public static final String $strg_str_ln_nm = $strg_str_ln_p + ".str_ln_nm";
	public static final String $strg_str_ln_cd_none_flg = $strg_str_ln_p + ".str_ln_cd_none_flg";
	public static final String $unschd_itm_cd = $unschd_itm_p + ".itm_cd";
	public static final String $unschd_itm_sub1 = $unschd_itm_p + ".itm_sub1";
	public static final String $unschd_itm_sub2 = $unschd_itm_p + ".itm_sub2";
	public static final String $unschd_itm_sub3 = $unschd_itm_p + ".itm_sub3";
	public static final String $unschd_itm_nm = $unschd_itm_p + ".itm_nm";
	public static final String $unschd_crt_lot_flg = $unschd_lot_no_p + ".crt_lot_flg";
	public static final String $unschd_lot_no = $unschd_lot_no_p + ".lot_no";
	public static final String $unschd_sublot_no = $unschd_lot_no_p + ".sublot_no";
	public static final String $unschd_trd_unit_yield_act_qty = $unschd_trd_unit_yield_act_qty_p + ".qty";
	public static final String $unschd_base_unit_yield_act_qty = $unschd_base_unit_yield_act_qty_p + ".qty";
	public static final String $unschd_act_dt = $unschd_act_dt_p + ".ymd";
	public static final String $unschd_act_hm = $unschd_act_dt_p + ".hm";
	public static final String $unschd_ac_dt = $unschd_ac_dt_p + ".ac_dt";
	public static final String $unschd_strg_str_ln_cd = $unschd_strg_str_ln_p + ".str_ln_cd";
	public static final String $unschd_strg_str_ln_nm = $unschd_strg_str_ln_p + ".str_ln_nm";
	public static final String $unschd_strg_str_ln_cd_none_flg = $unschd_strg_str_ln_p + ".str_ln_cd_none_flg";

	public static final MCMeta yield_typ_META = createCommonMeta($yield_typ, mcframe.commonMA.meta.MA_META.YIELD_TYP);
	public static final MCMeta yield_typ_nm_META = createCommonMeta($yield_typ_nm, mcframe.commonMA.meta.MA_META.YIELD_TYP_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_yield_act_qty_p_META = createInnerRowMeta($trd_unit_yield_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_conv_rnd_typ_META = createCommonMeta($trd_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_yield_act_qty_p_META = createInnerRowMeta($base_unit_yield_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_yield_schd_qty_p_META = createInnerRowMeta($base_unit_yield_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_yield_rem_qty_p_META = createInnerRowMeta($base_unit_yield_rem_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_conv_rnd_typ_META = createCommonMeta($base_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta conv_base_qty_META = createCommonMeta($conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta conv_qty_META = createCommonMeta($conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta act_dt_p_META = createInnerRowMeta($act_dt_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta ac_dt_p_META = createInnerRowMeta($ac_dt_p, mcframe.clientMAUB.MAUBP5220.AcDtR.class);
	public static final MCMeta can_ac_dt_p_META = createInnerRowMeta($can_ac_dt_p, mcframe.clientMAUB.MAUBP5240.CanAcDtR.class);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta lot_no_typ_META = createCommonMeta($lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta lot_no_ptn_cd_META = createCommonMeta($lot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sublot_no_typ_META = createCommonMeta($sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sublot_no_ptn_cd_META = createCommonMeta($sublot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta lot_no_p_META = createInnerRowMeta($lot_no_p, mcframe.clientMSUB.MSUBP5030.LotNoR.class);
	public static final MCMeta org_lot_no_META = createCommonMeta($org_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta org_sublot_no_META = createCommonMeta($org_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta same_lot_flg_META = createCommonMeta($same_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMAUB.MAUBP5070.SnoR.class);
	public static final MCMeta yield_rsn_cd_META = createCommonMeta($yield_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta yield_rsn_nm_META = createCommonMeta($yield_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta strg_str_ln_tgt_flg_META = createCommonMeta($strg_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta strg_str_ln_p_META = createInnerRowMeta($strg_str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta unschd_yield_typ_META = createCommonMeta($unschd_yield_typ, mcframe.commonMA.meta.MA_META.YIELD_TYP);
	public static final MCMeta unschd_yield_typ_nm_META = createCommonMeta($unschd_yield_typ_nm, mcframe.commonMA.meta.MA_META.YIELD_TYP_NM);
	public static final MCMeta unschd_itm_p_META = createInnerRowMeta($unschd_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta unschd_lot_no_p_META = createInnerRowMeta($unschd_lot_no_p, mcframe.clientMSUB.MSUBP5030.LotNoR.class);
	public static final MCMeta unschd_same_lot_flg_META = createCommonMeta($unschd_same_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unschd_lot_mng_typ_META = createCommonMeta($unschd_lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta unschd_lot_no_typ_META = createCommonMeta($unschd_lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta unschd_lot_no_ptn_cd_META = createCommonMeta($unschd_lot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta unschd_sublot_mng_typ_META = createCommonMeta($unschd_sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta unschd_sublot_no_typ_META = createCommonMeta($unschd_sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta unschd_sublot_no_ptn_cd_META = createCommonMeta($unschd_sublot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta unschd_trd_unit_cd_META = createCommonMeta($unschd_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unschd_trd_unit_nm_META = createCommonMeta($unschd_trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta unschd_trd_unit_yield_act_qty_p_META = createInnerRowMeta($unschd_trd_unit_yield_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta unschd_trd_unit_dec_place_META = createCommonMeta($unschd_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta unschd_trd_unit_conv_rnd_typ_META = createCommonMeta($unschd_trd_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta unschd_base_unit_cd_META = createCommonMeta($unschd_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unschd_base_unit_nm_META = createCommonMeta($unschd_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta unschd_base_unit_yield_act_qty_p_META = createInnerRowMeta($unschd_base_unit_yield_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta unschd_base_unit_dec_place_META = createCommonMeta($unschd_base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta unschd_base_unit_conv_rnd_typ_META = createCommonMeta($unschd_base_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta unschd_conv_base_qty_META = createCommonMeta($unschd_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unschd_conv_qty_META = createCommonMeta($unschd_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unschd_act_dt_p_META = createInnerRowMeta($unschd_act_dt_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta unschd_ac_dt_p_META = createInnerRowMeta($unschd_ac_dt_p, mcframe.clientMAUB.MAUBP5220.AcDtR.class);
	public static final MCMeta unschd_yield_rsn_cd_META = createCommonMeta($unschd_yield_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta unschd_yield_rsn_nm_META = createCommonMeta($unschd_yield_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta unschd_gd_cd_META = createCommonMeta($unschd_gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta unschd_gd_nm_META = createCommonMeta($unschd_gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta unschd_strg_loc_cd_META = createCommonMeta($unschd_strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta unschd_strg_loc_nm_META = createCommonMeta($unschd_strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta unschd_strg_str_ln_tgt_flg_META = createCommonMeta($unschd_strg_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unschd_strg_str_ln_p_META = createInnerRowMeta($unschd_strg_str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta yield_rate_META = createCommonMeta($yield_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta inst_rpt_rmrks_META = createCommonMeta($inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.YIELD_SCHD_RPT_RMRKS);
	public static final MCMeta insp_cnt_rmrks_META = createCommonMeta($insp_cnt_rmrks, mcframe.commonMS.meta.MS_META.INSP_CNT_RMRKS);
	public static final MCMeta yield_act_intr_rmrks_META = createCommonMeta($yield_act_intr_rmrks, mcframe.commonMS.meta.MS_META.YIELD_ACT_INTR_RMRKS);
	public static final MCMeta yield_act_rpt_rmrks_META = createCommonMeta($yield_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.YIELD_ACT_RPT_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta yield_act_sub_char1_META = createCommonMeta($yield_act_sub_char1, mcframe.commonMS.meta.MS_META.YIELD_ACT_SUB_CHAR1);
	public static final MCMeta yield_act_sub_char2_META = createCommonMeta($yield_act_sub_char2, mcframe.commonMS.meta.MS_META.YIELD_ACT_SUB_CHAR2);
	public static final MCMeta yield_act_sub_char3_META = createCommonMeta($yield_act_sub_char3, mcframe.commonMS.meta.MS_META.YIELD_ACT_SUB_CHAR3);
	public static final MCMeta yield_schd_no_META = createCommonMeta($yield_schd_no, mcframe.commonMA.meta.MA_META.YIELD_SCHD_NO);
	public static final MCMeta yield_act_no_META = createCommonMeta($yield_act_no, mcframe.commonMA.meta.MA_META.YIELD_ACT_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta stk_lst_prnt_flg_META = createCommonMeta($stk_lst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mes_id_META = createCommonMeta($mes_id, mcframe.commonMS.meta.MS_META.MES_ID);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta mes_flg_META = createCommonMeta($mes_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_yield_act_no_META = createCommonMeta($ext_yield_act_no, mcframe.commonMA.meta.MA_META.EXT_YIELD_ACT_NO);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_sts_typ_nm_META = createCommonMeta($mfg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_STS_TYP_NM);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta copied_row_flg_META = createCommonMeta($copied_row_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta upd_tgt_flg_META = createCommonMeta($upd_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gui_index_META = createCommonMeta($gui_index, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta st_ac_dt_META = createCommonMeta($st_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta base_unit_yield_act_qty_bef_META = createCommonMeta($base_unit_yield_act_qty_bef, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta yield_act_qty_META = createCommonMeta($yield_act_qty, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<RsltYieldByProdR> constMetas = new ConstMetaList<RsltYieldByProdR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			yield_typ_META,
			yield_typ_nm_META,
			itm_p_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_yield_act_qty_p_META,
			trd_unit_dec_place_META,
			trd_unit_conv_rnd_typ_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_yield_act_qty_p_META,
			base_unit_yield_schd_qty_p_META,
			base_unit_yield_rem_qty_p_META,
			base_unit_dec_place_META,
			base_unit_conv_rnd_typ_META,
			conv_base_qty_META,
			conv_qty_META,
			act_dt_p_META,
			ac_dt_p_META,
			can_ac_dt_p_META,
			lot_mng_typ_META,
			lot_no_typ_META,
			lot_no_ptn_cd_META,
			sublot_mng_typ_META,
			sublot_no_typ_META,
			sublot_no_ptn_cd_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			lot_no_p_META,
			org_lot_no_META,
			org_sublot_no_META,
			same_lot_flg_META,
			sno_p_META,
			yield_rsn_cd_META,
			yield_rsn_nm_META,
			quality_typ_META,
			quality_typ_nm_META,
			gd_cd_META,
			gd_nm_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			strg_str_ln_tgt_flg_META,
			strg_str_ln_p_META,
			unschd_yield_typ_META,
			unschd_yield_typ_nm_META,
			unschd_itm_p_META,
			unschd_lot_no_p_META,
			unschd_same_lot_flg_META,
			unschd_lot_mng_typ_META,
			unschd_lot_no_typ_META,
			unschd_lot_no_ptn_cd_META,
			unschd_sublot_mng_typ_META,
			unschd_sublot_no_typ_META,
			unschd_sublot_no_ptn_cd_META,
			unschd_trd_unit_cd_META,
			unschd_trd_unit_nm_META,
			unschd_trd_unit_yield_act_qty_p_META,
			unschd_trd_unit_dec_place_META,
			unschd_trd_unit_conv_rnd_typ_META,
			unschd_base_unit_cd_META,
			unschd_base_unit_nm_META,
			unschd_base_unit_yield_act_qty_p_META,
			unschd_base_unit_dec_place_META,
			unschd_base_unit_conv_rnd_typ_META,
			unschd_conv_base_qty_META,
			unschd_conv_qty_META,
			unschd_act_dt_p_META,
			unschd_ac_dt_p_META,
			unschd_yield_rsn_cd_META,
			unschd_yield_rsn_nm_META,
			unschd_gd_cd_META,
			unschd_gd_nm_META,
			unschd_strg_loc_cd_META,
			unschd_strg_loc_nm_META,
			unschd_strg_str_ln_tgt_flg_META,
			unschd_strg_str_ln_p_META,
			yield_rate_META,
			inst_rpt_rmrks_META,
			insp_cnt_rmrks_META,
			yield_act_intr_rmrks_META,
			yield_act_rpt_rmrks_META,
			trd_rmrks_META,
			yield_act_sub_char1_META,
			yield_act_sub_char2_META,
			yield_act_sub_char3_META,
			yield_schd_no_META,
			yield_act_no_META,
			oper_inst_no_META,
			oper_act_no_META,
			stk_lst_prnt_flg_META,
			mes_id_META,
			data_no_META,
			mes_flg_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			ext_yield_act_no_META,
			mfg_sts_typ_META,
			mfg_sts_typ_nm_META,
			disp_seq_META,
			hdr_peg_no_META,
			copied_row_flg_META,
			rtn_sts_typ_META,
			upd_tgt_flg_META,
			gui_index_META,
			st_ac_dt_META,
			base_unit_yield_act_qty_bef_META,
			yield_act_qty_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"trd_unit_yield_act_qty",
				"base_unit_yield_act_qty",
				"base_unit_yield_schd_qty",
				"base_unit_yield_rem_qty",
				"act_dt",
				"act_hm",
				"ac_dt",
				"can_ac_dt_for_input",
				"can_ac_dt",
				"ac_dt_after_srch",
				"crt_lot_flg",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"strg_str_ln_cd",
				"strg_str_ln_nm",
				"strg_str_ln_cd_none_flg",
				"unschd_itm_cd",
				"unschd_itm_sub1",
				"unschd_itm_sub2",
				"unschd_itm_sub3",
				"unschd_itm_nm",
				"unschd_crt_lot_flg",
				"unschd_lot_no",
				"unschd_sublot_no",
				"unschd_trd_unit_yield_act_qty",
				"unschd_base_unit_yield_act_qty",
				"unschd_act_dt",
				"unschd_act_hm",
				"unschd_ac_dt",
				"unschd_strg_str_ln_cd",
				"unschd_strg_str_ln_nm",
				"unschd_strg_str_ln_cd_none_flg"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$trd_unit_yield_act_qty,
				$base_unit_yield_act_qty,
				$base_unit_yield_schd_qty,
				$base_unit_yield_rem_qty,
				$act_dt,
				$act_hm,
				$ac_dt,
				$can_ac_dt_for_input,
				$can_ac_dt,
				$ac_dt_after_srch,
				$crt_lot_flg,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$strg_str_ln_cd,
				$strg_str_ln_nm,
				$strg_str_ln_cd_none_flg,
				$unschd_itm_cd,
				$unschd_itm_sub1,
				$unschd_itm_sub2,
				$unschd_itm_sub3,
				$unschd_itm_nm,
				$unschd_crt_lot_flg,
				$unschd_lot_no,
				$unschd_sublot_no,
				$unschd_trd_unit_yield_act_qty,
				$unschd_base_unit_yield_act_qty,
				$unschd_act_dt,
				$unschd_act_hm,
				$unschd_ac_dt,
				$unschd_strg_str_ln_cd,
				$unschd_strg_str_ln_nm,
				$unschd_strg_str_ln_cd_none_flg
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
				{$trd_unit_cd, "unit_nm;dec_place;rnd_typ;conv_base_qty;conv_qty"},	// trd_unit_cd
				{$yield_rsn_cd, "biz_rsn_nm"},	// yield_rsn_cd
				{$strg_loc_cd, "loc_nm;str_ln_tgt_flg;str_ln_cd;str_ln_cd_none_flg"},	// strg_loc_cd
				{$unschd_yield_typ, "yield_typ_nm"},	// unschd_yield_typ
				{$unschd_trd_unit_cd, "unit_nm;dec_place;rnd_typ;conv_base_qty;conv_qty"},	// unschd_trd_unit_cd
				{$unschd_yield_rsn_cd, "biz_rsn_nm"},	// unschd_yield_rsn_cd
				{$unschd_gd_cd, "gd_nm"},	// unschd_gd_cd
				{$unschd_strg_loc_cd, "loc_nm;str_ln_tgt_flg;str_ln_cd;str_ln_cd_none_flg"}	// unschd_strg_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$yield_rsn_cd, "yield_typ"},	// yield_rsn_cd
				{$strg_loc_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// strg_loc_cd
				{$unschd_trd_unit_cd, "unschd_itm_cd;unschd_itm_sub1;unschd_itm_sub2;unschd_itm_sub3"},	// unschd_trd_unit_cd
				{$unschd_yield_rsn_cd, "unschd_yield_typ"},	// unschd_yield_rsn_cd
				{$unschd_strg_loc_cd, "MAC_LOC_IS_SRCH_TYP.HOUSE_EQ_WG;unschd_itm_cd;unschd_itm_sub1;unschd_itm_sub2;unschd_itm_sub3"}	// unschd_strg_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$yield_rsn_cd, "yield_typ"},	// yield_rsn_cd
				{$strg_loc_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// strg_loc_cd
				{$unschd_trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// unschd_trd_unit_cd
				{$unschd_yield_rsn_cd, "yield_typ"},	// unschd_yield_rsn_cd
				{$unschd_strg_loc_cd, "loc_is_srch_typ;itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// unschd_strg_loc_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_yield_act_qty_p + ".qty", "BASE_UNIT"},	// base_unit_yield_act_qty_p.qty
				{$base_unit_yield_schd_qty_p + ".qty", "BASE_UNIT"},	// base_unit_yield_schd_qty_p.qty
				{$base_unit_yield_rem_qty_p + ".qty", "BASE_UNIT"},	// base_unit_yield_rem_qty_p.qty
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_conv_rnd_typ, "BASE_UNIT"},	// base_unit_conv_rnd_typ
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"},	// gd_nm
				{$strg_str_ln_tgt_flg, "STR_LN"},	// strg_str_ln_tgt_flg
				{$unschd_base_unit_cd, "BASE_UNIT"},	// unschd_base_unit_cd
				{$unschd_base_unit_nm, "BASE_UNIT"},	// unschd_base_unit_nm
				{$unschd_base_unit_yield_act_qty_p + ".qty", "BASE_UNIT"},	// unschd_base_unit_yield_act_qty_p.qty
				{$unschd_base_unit_dec_place, "BASE_UNIT"},	// unschd_base_unit_dec_place
				{$unschd_base_unit_conv_rnd_typ, "BASE_UNIT"},	// unschd_base_unit_conv_rnd_typ
				{$unschd_gd_cd, "STK_GD"},	// unschd_gd_cd
				{$unschd_gd_nm, "STK_GD"},	// unschd_gd_nm
				{$unschd_strg_str_ln_tgt_flg, "STR_LN"}	// unschd_strg_str_ln_tgt_flg
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
	protected RsltYieldByProdR_MC_A(ConstMetaList<? extends RsltYieldByProdR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltYieldByProdR clone() {
		return (RsltYieldByProdR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltYieldByProdR createInstance() {
		return (RsltYieldByProdR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltYieldByProdR getValues(String... names) {
		return (RsltYieldByProdR) super.getValues(names);
	}



	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public String yield_typ() {
		return getConstString(offset + 0, $yield_typ);
	}

	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public void yield_typ(String value) {
		setConstString(offset + 0, $yield_typ, value);
	}


	/**
	 * Output type name 出来高区分名.<p>
	 *
	 */
	public String yield_typ_nm() {
		return getConstString(offset + 1, $yield_typ_nm);
	}

	/**
	 * Output type name 出来高区分名.<p>
	 *
	 */
	public void yield_typ_nm(String value) {
		setConstString(offset + 1, $yield_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 2, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 2, $itm_p, row);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 3, $trd_unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 3, $trd_unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 4, $trd_unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 4, $trd_unit_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_yield_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 5, $trd_unit_yield_act_qty_p);
	}
	
	public void trd_unit_yield_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 5, $trd_unit_yield_act_qty_p, row);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 6, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 6, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 6, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 6, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 6, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 6, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit conversion rounding type 取引単位換算端数処理区分.<p>
	 *
	 */
	public String trd_unit_conv_rnd_typ() {
		return getConstString(offset + 7, $trd_unit_conv_rnd_typ);
	}

	/**
	 * Transaction unit conversion rounding type 取引単位換算端数処理区分.<p>
	 *
	 */
	public void trd_unit_conv_rnd_typ(String value) {
		setConstString(offset + 7, $trd_unit_conv_rnd_typ, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 8, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 8, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 9, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 9, $base_unit_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_yield_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 10, $base_unit_yield_act_qty_p);
	}
	
	public void base_unit_yield_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 10, $base_unit_yield_act_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_yield_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 11, $base_unit_yield_schd_qty_p);
	}
	
	public void base_unit_yield_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 11, $base_unit_yield_schd_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_yield_rem_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 12, $base_unit_yield_rem_qty_p);
	}
	
	public void base_unit_yield_rem_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 12, $base_unit_yield_rem_qty_p, row);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 13, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 13, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 13, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 13, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 13, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 13, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public String base_unit_conv_rnd_typ() {
		return getConstString(offset + 14, $base_unit_conv_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public void base_unit_conv_rnd_typ(String value) {
		setConstString(offset + 14, $base_unit_conv_rnd_typ, value);
	}


	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public MCNumber conv_base_qty() {
		return getConstNumber(offset + 15, $conv_base_qty);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(MCNumber value) {
		setConstNumber(offset + 15, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(int value) {
		setConstNumber(offset + 15, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(long value) {
		setConstNumber(offset + 15, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(float value) {
		setConstNumber(offset + 15, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(double value) {
		setConstNumber(offset + 15, $conv_base_qty, value);
	}


	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public MCNumber conv_qty() {
		return getConstNumber(offset + 16, $conv_qty);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(MCNumber value) {
		setConstNumber(offset + 16, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(int value) {
		setConstNumber(offset + 16, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(long value) {
		setConstNumber(offset + 16, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(float value) {
		setConstNumber(offset + 16, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(double value) {
		setConstNumber(offset + 16, $conv_qty, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR act_dt_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 17, $act_dt_p);
	}
	
	public void act_dt_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 17, $act_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5220.AcDtR ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP5220.AcDtR) getConstInnerRow(offset + 18, $ac_dt_p);
	}
	
	public void ac_dt_p(mcframe.clientMAUB.MAUBP5220.AcDtR row){
		setConstInnerRow(offset + 18, $ac_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5240.CanAcDtR can_ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP5240.CanAcDtR) getConstInnerRow(offset + 19, $can_ac_dt_p);
	}
	
	public void can_ac_dt_p(mcframe.clientMAUB.MAUBP5240.CanAcDtR row){
		setConstInnerRow(offset + 19, $can_ac_dt_p, row);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 20, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 20, $lot_mng_typ, value);
	}


	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 21, $lot_no_typ);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 21, $lot_no_typ, value);
	}


	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String lot_no_ptn_cd() {
		return getConstString(offset + 22, $lot_no_ptn_cd);
	}

	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void lot_no_ptn_cd(String value) {
		setConstString(offset + 22, $lot_no_ptn_cd, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 23, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 23, $sublot_mng_typ, value);
	}


	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 24, $sublot_no_typ);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 24, $sublot_no_typ, value);
	}


	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String sublot_no_ptn_cd() {
		return getConstString(offset + 25, $sublot_no_ptn_cd);
	}

	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void sublot_no_ptn_cd(String value) {
		setConstString(offset + 25, $sublot_no_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 26, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 26, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 27, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 27, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 28, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 28, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 29, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 29, $sno4_mng_typ, value);
	}


	public mcframe.clientMSUB.MSUBP5030.LotNoR lot_no_p(){
		return (mcframe.clientMSUB.MSUBP5030.LotNoR) getConstInnerRow(offset + 30, $lot_no_p);
	}
	
	public void lot_no_p(mcframe.clientMSUB.MSUBP5030.LotNoR row){
		setConstInnerRow(offset + 30, $lot_no_p, row);
	}


	/**
	 * Copy-from lot No. コピー元ロットＮＯ.<p>
	 *
	 */
	public String org_lot_no() {
		return getConstString(offset + 31, $org_lot_no);
	}

	/**
	 * Copy-from lot No. コピー元ロットＮＯ.<p>
	 *
	 */
	public void org_lot_no(String value) {
		setConstString(offset + 31, $org_lot_no, value);
	}


	/**
	 * Copy-from sublot No. コピー元サブロットＮＯ.<p>
	 *
	 */
	public String org_sublot_no() {
		return getConstString(offset + 32, $org_sublot_no);
	}

	/**
	 * Copy-from sublot No. コピー元サブロットＮＯ.<p>
	 *
	 */
	public void org_sublot_no(String value) {
		setConstString(offset + 32, $org_sublot_no, value);
	}


	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public boolean same_lot_flg() {
		return getConstBoolean(offset + 33, $same_lot_flg);
	}

	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public void same_lot_flg(boolean value) {
		setConstBoolean(offset + 33, $same_lot_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5070.SnoR sno_p(){
		return (mcframe.clientMAUB.MAUBP5070.SnoR) getConstInnerRow(offset + 34, $sno_p);
	}
	
	public void sno_p(mcframe.clientMAUB.MAUBP5070.SnoR row){
		setConstInnerRow(offset + 34, $sno_p, row);
	}


	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public String yield_rsn_cd() {
		return getConstString(offset + 35, $yield_rsn_cd);
	}

	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public void yield_rsn_cd(String value) {
		setConstString(offset + 35, $yield_rsn_cd, value);
	}


	/**
	 * Output reason name 出来高理由名.<p>
	 *
	 */
	public String yield_rsn_nm() {
		return getConstString(offset + 36, $yield_rsn_nm);
	}

	/**
	 * Output reason name 出来高理由名.<p>
	 *
	 */
	public void yield_rsn_nm(String value) {
		setConstString(offset + 36, $yield_rsn_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 37, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 37, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 38, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 38, $quality_typ_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 39, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 39, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 40, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 40, $gd_nm, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 41, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 41, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 42, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 42, $strg_loc_nm, value);
	}


	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public boolean strg_str_ln_tgt_flg() {
		return getConstBoolean(offset + 43, $strg_str_ln_tgt_flg);
	}

	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public void strg_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 43, $strg_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR strg_str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 44, $strg_str_ln_p);
	}
	
	public void strg_str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 44, $strg_str_ln_p, row);
	}


	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public String unschd_yield_typ() {
		return getConstString(offset + 45, $unschd_yield_typ);
	}

	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public void unschd_yield_typ(String value) {
		setConstString(offset + 45, $unschd_yield_typ, value);
	}


	/**
	 * Output type name 出来高区分名.<p>
	 *
	 */
	public String unschd_yield_typ_nm() {
		return getConstString(offset + 46, $unschd_yield_typ_nm);
	}

	/**
	 * Output type name 出来高区分名.<p>
	 *
	 */
	public void unschd_yield_typ_nm(String value) {
		setConstString(offset + 46, $unschd_yield_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR unschd_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 47, $unschd_itm_p);
	}
	
	public void unschd_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 47, $unschd_itm_p, row);
	}


	public mcframe.clientMSUB.MSUBP5030.LotNoR unschd_lot_no_p(){
		return (mcframe.clientMSUB.MSUBP5030.LotNoR) getConstInnerRow(offset + 48, $unschd_lot_no_p);
	}
	
	public void unschd_lot_no_p(mcframe.clientMSUB.MSUBP5030.LotNoR row){
		setConstInnerRow(offset + 48, $unschd_lot_no_p, row);
	}


	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public boolean unschd_same_lot_flg() {
		return getConstBoolean(offset + 49, $unschd_same_lot_flg);
	}

	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public void unschd_same_lot_flg(boolean value) {
		setConstBoolean(offset + 49, $unschd_same_lot_flg, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String unschd_lot_mng_typ() {
		return getConstString(offset + 50, $unschd_lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void unschd_lot_mng_typ(String value) {
		setConstString(offset + 50, $unschd_lot_mng_typ, value);
	}


	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String unschd_lot_no_typ() {
		return getConstString(offset + 51, $unschd_lot_no_typ);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void unschd_lot_no_typ(String value) {
		setConstString(offset + 51, $unschd_lot_no_typ, value);
	}


	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String unschd_lot_no_ptn_cd() {
		return getConstString(offset + 52, $unschd_lot_no_ptn_cd);
	}

	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void unschd_lot_no_ptn_cd(String value) {
		setConstString(offset + 52, $unschd_lot_no_ptn_cd, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String unschd_sublot_mng_typ() {
		return getConstString(offset + 53, $unschd_sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void unschd_sublot_mng_typ(String value) {
		setConstString(offset + 53, $unschd_sublot_mng_typ, value);
	}


	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String unschd_sublot_no_typ() {
		return getConstString(offset + 54, $unschd_sublot_no_typ);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void unschd_sublot_no_typ(String value) {
		setConstString(offset + 54, $unschd_sublot_no_typ, value);
	}


	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String unschd_sublot_no_ptn_cd() {
		return getConstString(offset + 55, $unschd_sublot_no_ptn_cd);
	}

	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void unschd_sublot_no_ptn_cd(String value) {
		setConstString(offset + 55, $unschd_sublot_no_ptn_cd, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unschd_trd_unit_cd() {
		return getConstString(offset + 56, $unschd_trd_unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unschd_trd_unit_cd(String value) {
		setConstString(offset + 56, $unschd_trd_unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unschd_trd_unit_nm() {
		return getConstString(offset + 57, $unschd_trd_unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unschd_trd_unit_nm(String value) {
		setConstString(offset + 57, $unschd_trd_unit_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR unschd_trd_unit_yield_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 58, $unschd_trd_unit_yield_act_qty_p);
	}
	
	public void unschd_trd_unit_yield_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 58, $unschd_trd_unit_yield_act_qty_p, row);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber unschd_trd_unit_dec_place() {
		return getConstNumber(offset + 59, $unschd_trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 59, $unschd_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_trd_unit_dec_place(int value) {
		setConstNumber(offset + 59, $unschd_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_trd_unit_dec_place(long value) {
		setConstNumber(offset + 59, $unschd_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_trd_unit_dec_place(float value) {
		setConstNumber(offset + 59, $unschd_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_trd_unit_dec_place(double value) {
		setConstNumber(offset + 59, $unschd_trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit conversion rounding type 取引単位換算端数処理区分.<p>
	 *
	 */
	public String unschd_trd_unit_conv_rnd_typ() {
		return getConstString(offset + 60, $unschd_trd_unit_conv_rnd_typ);
	}

	/**
	 * Transaction unit conversion rounding type 取引単位換算端数処理区分.<p>
	 *
	 */
	public void unschd_trd_unit_conv_rnd_typ(String value) {
		setConstString(offset + 60, $unschd_trd_unit_conv_rnd_typ, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String unschd_base_unit_cd() {
		return getConstString(offset + 61, $unschd_base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void unschd_base_unit_cd(String value) {
		setConstString(offset + 61, $unschd_base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String unschd_base_unit_nm() {
		return getConstString(offset + 62, $unschd_base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void unschd_base_unit_nm(String value) {
		setConstString(offset + 62, $unschd_base_unit_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR unschd_base_unit_yield_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 63, $unschd_base_unit_yield_act_qty_p);
	}
	
	public void unschd_base_unit_yield_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 63, $unschd_base_unit_yield_act_qty_p, row);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber unschd_base_unit_dec_place() {
		return getConstNumber(offset + 64, $unschd_base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 64, $unschd_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_base_unit_dec_place(int value) {
		setConstNumber(offset + 64, $unschd_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_base_unit_dec_place(long value) {
		setConstNumber(offset + 64, $unschd_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_base_unit_dec_place(float value) {
		setConstNumber(offset + 64, $unschd_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_base_unit_dec_place(double value) {
		setConstNumber(offset + 64, $unschd_base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public String unschd_base_unit_conv_rnd_typ() {
		return getConstString(offset + 65, $unschd_base_unit_conv_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public void unschd_base_unit_conv_rnd_typ(String value) {
		setConstString(offset + 65, $unschd_base_unit_conv_rnd_typ, value);
	}


	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public MCNumber unschd_conv_base_qty() {
		return getConstNumber(offset + 66, $unschd_conv_base_qty);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void unschd_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 66, $unschd_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void unschd_conv_base_qty(int value) {
		setConstNumber(offset + 66, $unschd_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void unschd_conv_base_qty(long value) {
		setConstNumber(offset + 66, $unschd_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void unschd_conv_base_qty(float value) {
		setConstNumber(offset + 66, $unschd_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void unschd_conv_base_qty(double value) {
		setConstNumber(offset + 66, $unschd_conv_base_qty, value);
	}


	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public MCNumber unschd_conv_qty() {
		return getConstNumber(offset + 67, $unschd_conv_qty);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void unschd_conv_qty(MCNumber value) {
		setConstNumber(offset + 67, $unschd_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void unschd_conv_qty(int value) {
		setConstNumber(offset + 67, $unschd_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void unschd_conv_qty(long value) {
		setConstNumber(offset + 67, $unschd_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void unschd_conv_qty(float value) {
		setConstNumber(offset + 67, $unschd_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void unschd_conv_qty(double value) {
		setConstNumber(offset + 67, $unschd_conv_qty, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR unschd_act_dt_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 68, $unschd_act_dt_p);
	}
	
	public void unschd_act_dt_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 68, $unschd_act_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5220.AcDtR unschd_ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP5220.AcDtR) getConstInnerRow(offset + 69, $unschd_ac_dt_p);
	}
	
	public void unschd_ac_dt_p(mcframe.clientMAUB.MAUBP5220.AcDtR row){
		setConstInnerRow(offset + 69, $unschd_ac_dt_p, row);
	}


	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public String unschd_yield_rsn_cd() {
		return getConstString(offset + 70, $unschd_yield_rsn_cd);
	}

	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public void unschd_yield_rsn_cd(String value) {
		setConstString(offset + 70, $unschd_yield_rsn_cd, value);
	}


	/**
	 * Output reason name 出来高理由名.<p>
	 *
	 */
	public String unschd_yield_rsn_nm() {
		return getConstString(offset + 71, $unschd_yield_rsn_nm);
	}

	/**
	 * Output reason name 出来高理由名.<p>
	 *
	 */
	public void unschd_yield_rsn_nm(String value) {
		setConstString(offset + 71, $unschd_yield_rsn_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String unschd_gd_cd() {
		return getConstString(offset + 72, $unschd_gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void unschd_gd_cd(String value) {
		setConstString(offset + 72, $unschd_gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String unschd_gd_nm() {
		return getConstString(offset + 73, $unschd_gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void unschd_gd_nm(String value) {
		setConstString(offset + 73, $unschd_gd_nm, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String unschd_strg_loc_cd() {
		return getConstString(offset + 74, $unschd_strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void unschd_strg_loc_cd(String value) {
		setConstString(offset + 74, $unschd_strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String unschd_strg_loc_nm() {
		return getConstString(offset + 75, $unschd_strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void unschd_strg_loc_nm(String value) {
		setConstString(offset + 75, $unschd_strg_loc_nm, value);
	}


	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public boolean unschd_strg_str_ln_tgt_flg() {
		return getConstBoolean(offset + 76, $unschd_strg_str_ln_tgt_flg);
	}

	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public void unschd_strg_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 76, $unschd_strg_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR unschd_strg_str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 77, $unschd_strg_str_ln_p);
	}
	
	public void unschd_strg_str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 77, $unschd_strg_str_ln_p, row);
	}


	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public MCNumber yield_rate() {
		return getConstNumber(offset + 78, $yield_rate);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(MCNumber value) {
		setConstNumber(offset + 78, $yield_rate, value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(int value) {
		setConstNumber(offset + 78, $yield_rate, value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(long value) {
		setConstNumber(offset + 78, $yield_rate, value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(float value) {
		setConstNumber(offset + 78, $yield_rate, value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(double value) {
		setConstNumber(offset + 78, $yield_rate, value);
	}


	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public String inst_rpt_rmrks() {
		return getConstString(offset + 79, $inst_rpt_rmrks);
	}

	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public void inst_rpt_rmrks(String value) {
		setConstString(offset + 79, $inst_rpt_rmrks, value);
	}


	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public String insp_cnt_rmrks() {
		return getConstString(offset + 80, $insp_cnt_rmrks);
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public void insp_cnt_rmrks(String value) {
		setConstString(offset + 80, $insp_cnt_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String yield_act_intr_rmrks() {
		return getConstString(offset + 81, $yield_act_intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void yield_act_intr_rmrks(String value) {
		setConstString(offset + 81, $yield_act_intr_rmrks, value);
	}


	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public String yield_act_rpt_rmrks() {
		return getConstString(offset + 82, $yield_act_rpt_rmrks);
	}

	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public void yield_act_rpt_rmrks(String value) {
		setConstString(offset + 82, $yield_act_rpt_rmrks, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 83, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 83, $trd_rmrks, value);
	}


	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public String yield_act_sub_char1() {
		return getConstString(offset + 84, $yield_act_sub_char1);
	}

	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public void yield_act_sub_char1(String value) {
		setConstString(offset + 84, $yield_act_sub_char1, value);
	}


	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public String yield_act_sub_char2() {
		return getConstString(offset + 85, $yield_act_sub_char2);
	}

	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public void yield_act_sub_char2(String value) {
		setConstString(offset + 85, $yield_act_sub_char2, value);
	}


	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public String yield_act_sub_char3() {
		return getConstString(offset + 86, $yield_act_sub_char3);
	}

	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public void yield_act_sub_char3(String value) {
		setConstString(offset + 86, $yield_act_sub_char3, value);
	}


	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public String yield_schd_no() {
		return getConstString(offset + 87, $yield_schd_no);
	}

	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public void yield_schd_no(String value) {
		setConstString(offset + 87, $yield_schd_no, value);
	}


	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public String yield_act_no() {
		return getConstString(offset + 88, $yield_act_no);
	}

	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public void yield_act_no(String value) {
		setConstString(offset + 88, $yield_act_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 89, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 89, $oper_inst_no, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 90, $oper_act_no);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 90, $oper_act_no, value);
	}


	/**
	 * Identification tag issued 現品票発行済.<p>
	 *
	 */
	public boolean stk_lst_prnt_flg() {
		return getConstBoolean(offset + 91, $stk_lst_prnt_flg);
	}

	/**
	 * Identification tag issued 現品票発行済.<p>
	 *
	 */
	public void stk_lst_prnt_flg(boolean value) {
		setConstBoolean(offset + 91, $stk_lst_prnt_flg, value);
	}


	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public String mes_id() {
		return getConstString(offset + 92, $mes_id);
	}

	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public void mes_id(String value) {
		setConstString(offset + 92, $mes_id, value);
	}


	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 93, $data_no);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 93, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 93, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 93, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 93, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 93, $data_no, value);
	}


	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public boolean mes_flg() {
		return getConstBoolean(offset + 94, $mes_flg);
	}

	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public void mes_flg(boolean value) {
		setConstBoolean(offset + 94, $mes_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 95, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 95, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 96, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 96, $ext_sys_nm, value);
	}


	/**
	 * External output result No. 外部出来高実績ＮＯ.<p>
	 *
	 */
	public String ext_yield_act_no() {
		return getConstString(offset + 97, $ext_yield_act_no);
	}

	/**
	 * External output result No. 外部出来高実績ＮＯ.<p>
	 *
	 */
	public void ext_yield_act_no(String value) {
		setConstString(offset + 97, $ext_yield_act_no, value);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 98, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 98, $mfg_sts_typ, value);
	}


	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public String mfg_sts_typ_nm() {
		return getConstString(offset + 99, $mfg_sts_typ_nm);
	}

	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public void mfg_sts_typ_nm(String value) {
		setConstString(offset + 99, $mfg_sts_typ_nm, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 100, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 100, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 100, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 100, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 100, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 100, $disp_seq, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 101, $hdr_peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 101, $hdr_peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 101, $hdr_peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 101, $hdr_peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 101, $hdr_peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 101, $hdr_peg_no, value);
	}


	/**
	 * Row to copy コピー行.<p>
	 *
	 */
	public boolean copied_row_flg() {
		return getConstBoolean(offset + 102, $copied_row_flg);
	}

	/**
	 * Row to copy コピー行.<p>
	 *
	 */
	public void copied_row_flg(boolean value) {
		setConstBoolean(offset + 102, $copied_row_flg, value);
	}


	public String rtn_sts_typ() {
		return getConstString(offset + 103, $rtn_sts_typ);
	}

	public void rtn_sts_typ(String value) {
		setConstString(offset + 103, $rtn_sts_typ, value);
	}


	/**
	 * To update 更新対象.<p>
	 *
	 */
	public boolean upd_tgt_flg() {
		return getConstBoolean(offset + 104, $upd_tgt_flg);
	}

	/**
	 * To update 更新対象.<p>
	 *
	 */
	public void upd_tgt_flg(boolean value) {
		setConstBoolean(offset + 104, $upd_tgt_flg, value);
	}


	/**
	 * GUI index GUIインデックス.<p>
	 *
	 */
	public MCNumber gui_index() {
		return getConstNumber(offset + 105, $gui_index);
	}

	/**
	 * GUI index GUIインデックス.<p>
	 *
	 */
	public void gui_index(MCNumber value) {
		setConstNumber(offset + 105, $gui_index, value);
	}

	/**
	 * GUI index GUIインデックス.<p>
	 *
	 */
	public void gui_index(int value) {
		setConstNumber(offset + 105, $gui_index, value);
	}

	/**
	 * GUI index GUIインデックス.<p>
	 *
	 */
	public void gui_index(long value) {
		setConstNumber(offset + 105, $gui_index, value);
	}

	/**
	 * GUI index GUIインデックス.<p>
	 *
	 */
	public void gui_index(float value) {
		setConstNumber(offset + 105, $gui_index, value);
	}

	/**
	 * GUI index GUIインデックス.<p>
	 *
	 */
	public void gui_index(double value) {
		setConstNumber(offset + 105, $gui_index, value);
	}


	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public MCDate st_ac_dt() {
		return getConstDate(offset + 106, $st_ac_dt);
	}

	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public void st_ac_dt(MCDate value) {
		setConstDate(offset + 106, $st_ac_dt, value);
	}


	/**
	 * Base unit output qty. before change 変更前基準単位出来高数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_act_qty_bef() {
		return getConstNumber(offset + 107, $base_unit_yield_act_qty_bef);
	}

	/**
	 * Base unit output qty. before change 変更前基準単位出来高数量.<p>
	 *
	 */
	public void base_unit_yield_act_qty_bef(MCNumber value) {
		setConstNumber(offset + 107, $base_unit_yield_act_qty_bef, value);
	}

	/**
	 * Base unit output qty. before change 変更前基準単位出来高数量.<p>
	 *
	 */
	public void base_unit_yield_act_qty_bef(int value) {
		setConstNumber(offset + 107, $base_unit_yield_act_qty_bef, value);
	}

	/**
	 * Base unit output qty. before change 変更前基準単位出来高数量.<p>
	 *
	 */
	public void base_unit_yield_act_qty_bef(long value) {
		setConstNumber(offset + 107, $base_unit_yield_act_qty_bef, value);
	}

	/**
	 * Base unit output qty. before change 変更前基準単位出来高数量.<p>
	 *
	 */
	public void base_unit_yield_act_qty_bef(float value) {
		setConstNumber(offset + 107, $base_unit_yield_act_qty_bef, value);
	}

	/**
	 * Base unit output qty. before change 変更前基準単位出来高数量.<p>
	 *
	 */
	public void base_unit_yield_act_qty_bef(double value) {
		setConstNumber(offset + 107, $base_unit_yield_act_qty_bef, value);
	}


	/**
	 * Base unit output result qty. 基準単位出来高実績数量.<p>
	 *
	 */
	public MCNumber yield_act_qty() {
		return getConstNumber(offset + 108, $yield_act_qty);
	}

	/**
	 * Base unit output result qty. 基準単位出来高実績数量.<p>
	 *
	 */
	public void yield_act_qty(MCNumber value) {
		setConstNumber(offset + 108, $yield_act_qty, value);
	}

	/**
	 * Base unit output result qty. 基準単位出来高実績数量.<p>
	 *
	 */
	public void yield_act_qty(int value) {
		setConstNumber(offset + 108, $yield_act_qty, value);
	}

	/**
	 * Base unit output result qty. 基準単位出来高実績数量.<p>
	 *
	 */
	public void yield_act_qty(long value) {
		setConstNumber(offset + 108, $yield_act_qty, value);
	}

	/**
	 * Base unit output result qty. 基準単位出来高実績数量.<p>
	 *
	 */
	public void yield_act_qty(float value) {
		setConstNumber(offset + 108, $yield_act_qty, value);
	}

	/**
	 * Base unit output result qty. 基準単位出来高実績数量.<p>
	 *
	 */
	public void yield_act_qty(double value) {
		setConstNumber(offset + 108, $yield_act_qty, value);
	}


	public String getString(String name) {
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
		}
		if ($yield_typ_nm.equalsIgnoreCase(name)) {
			return yield_typ_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_conv_rnd_typ();
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
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return lot_no_ptn_cd();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return sublot_no_ptn_cd();
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
		if ($org_lot_no.equalsIgnoreCase(name)) {
			return org_lot_no();
		}
		if ($org_sublot_no.equalsIgnoreCase(name)) {
			return org_sublot_no();
		}
		if ($yield_rsn_cd.equalsIgnoreCase(name)) {
			return yield_rsn_cd();
		}
		if ($yield_rsn_nm.equalsIgnoreCase(name)) {
			return yield_rsn_nm();
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($unschd_yield_typ.equalsIgnoreCase(name)) {
			return unschd_yield_typ();
		}
		if ($unschd_yield_typ_nm.equalsIgnoreCase(name)) {
			return unschd_yield_typ_nm();
		}
		if ($unschd_lot_mng_typ.equalsIgnoreCase(name)) {
			return unschd_lot_mng_typ();
		}
		if ($unschd_lot_no_typ.equalsIgnoreCase(name)) {
			return unschd_lot_no_typ();
		}
		if ($unschd_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return unschd_lot_no_ptn_cd();
		}
		if ($unschd_sublot_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sublot_mng_typ();
		}
		if ($unschd_sublot_no_typ.equalsIgnoreCase(name)) {
			return unschd_sublot_no_typ();
		}
		if ($unschd_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return unschd_sublot_no_ptn_cd();
		}
		if ($unschd_trd_unit_cd.equalsIgnoreCase(name)) {
			return unschd_trd_unit_cd();
		}
		if ($unschd_trd_unit_nm.equalsIgnoreCase(name)) {
			return unschd_trd_unit_nm();
		}
		if ($unschd_trd_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unschd_trd_unit_conv_rnd_typ();
		}
		if ($unschd_base_unit_cd.equalsIgnoreCase(name)) {
			return unschd_base_unit_cd();
		}
		if ($unschd_base_unit_nm.equalsIgnoreCase(name)) {
			return unschd_base_unit_nm();
		}
		if ($unschd_base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unschd_base_unit_conv_rnd_typ();
		}
		if ($unschd_yield_rsn_cd.equalsIgnoreCase(name)) {
			return unschd_yield_rsn_cd();
		}
		if ($unschd_yield_rsn_nm.equalsIgnoreCase(name)) {
			return unschd_yield_rsn_nm();
		}
		if ($unschd_gd_cd.equalsIgnoreCase(name)) {
			return unschd_gd_cd();
		}
		if ($unschd_gd_nm.equalsIgnoreCase(name)) {
			return unschd_gd_nm();
		}
		if ($unschd_strg_loc_cd.equalsIgnoreCase(name)) {
			return unschd_strg_loc_cd();
		}
		if ($unschd_strg_loc_nm.equalsIgnoreCase(name)) {
			return unschd_strg_loc_nm();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
		}
		if ($yield_act_intr_rmrks.equalsIgnoreCase(name)) {
			return yield_act_intr_rmrks();
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return yield_act_rpt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			return yield_act_sub_char1();
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			return yield_act_sub_char2();
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			return yield_act_sub_char3();
		}
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			return yield_act_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
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
		if ($ext_yield_act_no.equalsIgnoreCase(name)) {
			return ext_yield_act_no();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_sts_typ_nm();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
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
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return unschd_trd_unit_dec_place();
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			return unschd_base_unit_dec_place();
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			return unschd_conv_base_qty();
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			return unschd_conv_qty();
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			return yield_rate();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($gui_index.equalsIgnoreCase(name)) {
			return gui_index();
		}
		if ($base_unit_yield_act_qty_bef.equalsIgnoreCase(name)) {
			return base_unit_yield_act_qty_bef();
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			return yield_act_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			return st_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			return same_lot_flg();
		}
		if ($strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return strg_str_ln_tgt_flg();
		}
		if ($unschd_same_lot_flg.equalsIgnoreCase(name)) {
			return unschd_same_lot_flg();
		}
		if ($unschd_strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_tgt_flg();
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			return stk_lst_prnt_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		if ($copied_row_flg.equalsIgnoreCase(name)) {
			return copied_row_flg();
		}
		if ($upd_tgt_flg.equalsIgnoreCase(name)) {
			return upd_tgt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
		}
		if ($yield_typ_nm.equalsIgnoreCase(name)) {
			return yield_typ_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_conv_rnd_typ();
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
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return lot_no_ptn_cd();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return sublot_no_ptn_cd();
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
		if ($org_lot_no.equalsIgnoreCase(name)) {
			return org_lot_no();
		}
		if ($org_sublot_no.equalsIgnoreCase(name)) {
			return org_sublot_no();
		}
		if ($yield_rsn_cd.equalsIgnoreCase(name)) {
			return yield_rsn_cd();
		}
		if ($yield_rsn_nm.equalsIgnoreCase(name)) {
			return yield_rsn_nm();
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($unschd_yield_typ.equalsIgnoreCase(name)) {
			return unschd_yield_typ();
		}
		if ($unschd_yield_typ_nm.equalsIgnoreCase(name)) {
			return unschd_yield_typ_nm();
		}
		if ($unschd_lot_mng_typ.equalsIgnoreCase(name)) {
			return unschd_lot_mng_typ();
		}
		if ($unschd_lot_no_typ.equalsIgnoreCase(name)) {
			return unschd_lot_no_typ();
		}
		if ($unschd_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return unschd_lot_no_ptn_cd();
		}
		if ($unschd_sublot_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sublot_mng_typ();
		}
		if ($unschd_sublot_no_typ.equalsIgnoreCase(name)) {
			return unschd_sublot_no_typ();
		}
		if ($unschd_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return unschd_sublot_no_ptn_cd();
		}
		if ($unschd_trd_unit_cd.equalsIgnoreCase(name)) {
			return unschd_trd_unit_cd();
		}
		if ($unschd_trd_unit_nm.equalsIgnoreCase(name)) {
			return unschd_trd_unit_nm();
		}
		if ($unschd_trd_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unschd_trd_unit_conv_rnd_typ();
		}
		if ($unschd_base_unit_cd.equalsIgnoreCase(name)) {
			return unschd_base_unit_cd();
		}
		if ($unschd_base_unit_nm.equalsIgnoreCase(name)) {
			return unschd_base_unit_nm();
		}
		if ($unschd_base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unschd_base_unit_conv_rnd_typ();
		}
		if ($unschd_yield_rsn_cd.equalsIgnoreCase(name)) {
			return unschd_yield_rsn_cd();
		}
		if ($unschd_yield_rsn_nm.equalsIgnoreCase(name)) {
			return unschd_yield_rsn_nm();
		}
		if ($unschd_gd_cd.equalsIgnoreCase(name)) {
			return unschd_gd_cd();
		}
		if ($unschd_gd_nm.equalsIgnoreCase(name)) {
			return unschd_gd_nm();
		}
		if ($unschd_strg_loc_cd.equalsIgnoreCase(name)) {
			return unschd_strg_loc_cd();
		}
		if ($unschd_strg_loc_nm.equalsIgnoreCase(name)) {
			return unschd_strg_loc_nm();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
		}
		if ($yield_act_intr_rmrks.equalsIgnoreCase(name)) {
			return yield_act_intr_rmrks();
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return yield_act_rpt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			return yield_act_sub_char1();
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			return yield_act_sub_char2();
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			return yield_act_sub_char3();
		}
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			return yield_act_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
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
		if ($ext_yield_act_no.equalsIgnoreCase(name)) {
			return ext_yield_act_no();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_sts_typ_nm();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
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
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return unschd_trd_unit_dec_place();
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			return unschd_base_unit_dec_place();
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			return unschd_conv_base_qty();
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			return unschd_conv_qty();
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			return yield_rate();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($gui_index.equalsIgnoreCase(name)) {
			return gui_index();
		}
		if ($base_unit_yield_act_qty_bef.equalsIgnoreCase(name)) {
			return base_unit_yield_act_qty_bef();
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			return yield_act_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			return st_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			return same_lot_flg();
		}
		if ($strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return strg_str_ln_tgt_flg();
		}
		if ($unschd_same_lot_flg.equalsIgnoreCase(name)) {
			return unschd_same_lot_flg();
		}
		if ($unschd_strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_tgt_flg();
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			return stk_lst_prnt_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		if ($copied_row_flg.equalsIgnoreCase(name)) {
			return copied_row_flg();
		}
		if ($upd_tgt_flg.equalsIgnoreCase(name)) {
			return upd_tgt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
			return;
		}
		if ($yield_typ_nm.equalsIgnoreCase(name)) {
			yield_typ_nm(value);
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
		if ($trd_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_conv_rnd_typ(value);
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
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			lot_no_ptn_cd(value);
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
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			sublot_no_ptn_cd(value);
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
		if ($org_lot_no.equalsIgnoreCase(name)) {
			org_lot_no(value);
			return;
		}
		if ($org_sublot_no.equalsIgnoreCase(name)) {
			org_sublot_no(value);
			return;
		}
		if ($yield_rsn_cd.equalsIgnoreCase(name)) {
			yield_rsn_cd(value);
			return;
		}
		if ($yield_rsn_nm.equalsIgnoreCase(name)) {
			yield_rsn_nm(value);
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($unschd_yield_typ.equalsIgnoreCase(name)) {
			unschd_yield_typ(value);
			return;
		}
		if ($unschd_yield_typ_nm.equalsIgnoreCase(name)) {
			unschd_yield_typ_nm(value);
			return;
		}
		if ($unschd_lot_mng_typ.equalsIgnoreCase(name)) {
			unschd_lot_mng_typ(value);
			return;
		}
		if ($unschd_lot_no_typ.equalsIgnoreCase(name)) {
			unschd_lot_no_typ(value);
			return;
		}
		if ($unschd_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			unschd_lot_no_ptn_cd(value);
			return;
		}
		if ($unschd_sublot_mng_typ.equalsIgnoreCase(name)) {
			unschd_sublot_mng_typ(value);
			return;
		}
		if ($unschd_sublot_no_typ.equalsIgnoreCase(name)) {
			unschd_sublot_no_typ(value);
			return;
		}
		if ($unschd_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			unschd_sublot_no_ptn_cd(value);
			return;
		}
		if ($unschd_trd_unit_cd.equalsIgnoreCase(name)) {
			unschd_trd_unit_cd(value);
			return;
		}
		if ($unschd_trd_unit_nm.equalsIgnoreCase(name)) {
			unschd_trd_unit_nm(value);
			return;
		}
		if ($unschd_trd_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unschd_trd_unit_conv_rnd_typ(value);
			return;
		}
		if ($unschd_base_unit_cd.equalsIgnoreCase(name)) {
			unschd_base_unit_cd(value);
			return;
		}
		if ($unschd_base_unit_nm.equalsIgnoreCase(name)) {
			unschd_base_unit_nm(value);
			return;
		}
		if ($unschd_base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unschd_base_unit_conv_rnd_typ(value);
			return;
		}
		if ($unschd_yield_rsn_cd.equalsIgnoreCase(name)) {
			unschd_yield_rsn_cd(value);
			return;
		}
		if ($unschd_yield_rsn_nm.equalsIgnoreCase(name)) {
			unschd_yield_rsn_nm(value);
			return;
		}
		if ($unschd_gd_cd.equalsIgnoreCase(name)) {
			unschd_gd_cd(value);
			return;
		}
		if ($unschd_gd_nm.equalsIgnoreCase(name)) {
			unschd_gd_nm(value);
			return;
		}
		if ($unschd_strg_loc_cd.equalsIgnoreCase(name)) {
			unschd_strg_loc_cd(value);
			return;
		}
		if ($unschd_strg_loc_nm.equalsIgnoreCase(name)) {
			unschd_strg_loc_nm(value);
			return;
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inst_rpt_rmrks(value);
			return;
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
			return;
		}
		if ($yield_act_intr_rmrks.equalsIgnoreCase(name)) {
			yield_act_intr_rmrks(value);
			return;
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			yield_act_rpt_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			yield_act_sub_char1(value);
			return;
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			yield_act_sub_char2(value);
			return;
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			yield_act_sub_char3(value);
			return;
		}
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
			return;
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			yield_act_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
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
		if ($ext_yield_act_no.equalsIgnoreCase(name)) {
			ext_yield_act_no(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($gui_index.equalsIgnoreCase(name)) {
			gui_index(value);
			return;
		}
		if ($base_unit_yield_act_qty_bef.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty_bef(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($gui_index.equalsIgnoreCase(name)) {
			gui_index(value);
			return;
		}
		if ($base_unit_yield_act_qty_bef.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty_bef(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($gui_index.equalsIgnoreCase(name)) {
			gui_index(value);
			return;
		}
		if ($base_unit_yield_act_qty_bef.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty_bef(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($gui_index.equalsIgnoreCase(name)) {
			gui_index(value);
			return;
		}
		if ($base_unit_yield_act_qty_bef.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty_bef(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($gui_index.equalsIgnoreCase(name)) {
			gui_index(value);
			return;
		}
		if ($base_unit_yield_act_qty_bef.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty_bef(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			st_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			same_lot_flg(value);
			return;
		}
		if ($strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			strg_str_ln_tgt_flg(value);
			return;
		}
		if ($unschd_same_lot_flg.equalsIgnoreCase(name)) {
			unschd_same_lot_flg(value);
			return;
		}
		if ($unschd_strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_tgt_flg(value);
			return;
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			stk_lst_prnt_flg(value);
			return;
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		if ($copied_row_flg.equalsIgnoreCase(name)) {
			copied_row_flg(value);
			return;
		}
		if ($upd_tgt_flg.equalsIgnoreCase(name)) {
			upd_tgt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
			return;
		}
		if ($yield_typ_nm.equalsIgnoreCase(name)) {
			yield_typ_nm(value);
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
		if ($trd_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_conv_rnd_typ(value);
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
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			lot_no_ptn_cd(value);
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
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			sublot_no_ptn_cd(value);
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
		if ($org_lot_no.equalsIgnoreCase(name)) {
			org_lot_no(value);
			return;
		}
		if ($org_sublot_no.equalsIgnoreCase(name)) {
			org_sublot_no(value);
			return;
		}
		if ($yield_rsn_cd.equalsIgnoreCase(name)) {
			yield_rsn_cd(value);
			return;
		}
		if ($yield_rsn_nm.equalsIgnoreCase(name)) {
			yield_rsn_nm(value);
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($unschd_yield_typ.equalsIgnoreCase(name)) {
			unschd_yield_typ(value);
			return;
		}
		if ($unschd_yield_typ_nm.equalsIgnoreCase(name)) {
			unschd_yield_typ_nm(value);
			return;
		}
		if ($unschd_lot_mng_typ.equalsIgnoreCase(name)) {
			unschd_lot_mng_typ(value);
			return;
		}
		if ($unschd_lot_no_typ.equalsIgnoreCase(name)) {
			unschd_lot_no_typ(value);
			return;
		}
		if ($unschd_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			unschd_lot_no_ptn_cd(value);
			return;
		}
		if ($unschd_sublot_mng_typ.equalsIgnoreCase(name)) {
			unschd_sublot_mng_typ(value);
			return;
		}
		if ($unschd_sublot_no_typ.equalsIgnoreCase(name)) {
			unschd_sublot_no_typ(value);
			return;
		}
		if ($unschd_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			unschd_sublot_no_ptn_cd(value);
			return;
		}
		if ($unschd_trd_unit_cd.equalsIgnoreCase(name)) {
			unschd_trd_unit_cd(value);
			return;
		}
		if ($unschd_trd_unit_nm.equalsIgnoreCase(name)) {
			unschd_trd_unit_nm(value);
			return;
		}
		if ($unschd_trd_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unschd_trd_unit_conv_rnd_typ(value);
			return;
		}
		if ($unschd_base_unit_cd.equalsIgnoreCase(name)) {
			unschd_base_unit_cd(value);
			return;
		}
		if ($unschd_base_unit_nm.equalsIgnoreCase(name)) {
			unschd_base_unit_nm(value);
			return;
		}
		if ($unschd_base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unschd_base_unit_conv_rnd_typ(value);
			return;
		}
		if ($unschd_yield_rsn_cd.equalsIgnoreCase(name)) {
			unschd_yield_rsn_cd(value);
			return;
		}
		if ($unschd_yield_rsn_nm.equalsIgnoreCase(name)) {
			unschd_yield_rsn_nm(value);
			return;
		}
		if ($unschd_gd_cd.equalsIgnoreCase(name)) {
			unschd_gd_cd(value);
			return;
		}
		if ($unschd_gd_nm.equalsIgnoreCase(name)) {
			unschd_gd_nm(value);
			return;
		}
		if ($unschd_strg_loc_cd.equalsIgnoreCase(name)) {
			unschd_strg_loc_cd(value);
			return;
		}
		if ($unschd_strg_loc_nm.equalsIgnoreCase(name)) {
			unschd_strg_loc_nm(value);
			return;
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inst_rpt_rmrks(value);
			return;
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
			return;
		}
		if ($yield_act_intr_rmrks.equalsIgnoreCase(name)) {
			yield_act_intr_rmrks(value);
			return;
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			yield_act_rpt_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			yield_act_sub_char1(value);
			return;
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			yield_act_sub_char2(value);
			return;
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			yield_act_sub_char3(value);
			return;
		}
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
			return;
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			yield_act_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
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
		if ($ext_yield_act_no.equalsIgnoreCase(name)) {
			ext_yield_act_no(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($gui_index.equalsIgnoreCase(name)) {
			gui_index(value);
			return;
		}
		if ($base_unit_yield_act_qty_bef.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty_bef(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($gui_index.equalsIgnoreCase(name)) {
			gui_index(value);
			return;
		}
		if ($base_unit_yield_act_qty_bef.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty_bef(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($gui_index.equalsIgnoreCase(name)) {
			gui_index(value);
			return;
		}
		if ($base_unit_yield_act_qty_bef.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty_bef(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($gui_index.equalsIgnoreCase(name)) {
			gui_index(value);
			return;
		}
		if ($base_unit_yield_act_qty_bef.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty_bef(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
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
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($gui_index.equalsIgnoreCase(name)) {
			gui_index(value);
			return;
		}
		if ($base_unit_yield_act_qty_bef.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty_bef(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			st_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			same_lot_flg(value);
			return;
		}
		if ($strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			strg_str_ln_tgt_flg(value);
			return;
		}
		if ($unschd_same_lot_flg.equalsIgnoreCase(name)) {
			unschd_same_lot_flg(value);
			return;
		}
		if ($unschd_strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_tgt_flg(value);
			return;
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			stk_lst_prnt_flg(value);
			return;
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		if ($copied_row_flg.equalsIgnoreCase(name)) {
			copied_row_flg(value);
			return;
		}
		if ($upd_tgt_flg.equalsIgnoreCase(name)) {
			upd_tgt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($trd_unit_yield_act_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_yield_act_qty_p();
		}
		if ($base_unit_yield_act_qty_p.equalsIgnoreCase(name)) {
			return base_unit_yield_act_qty_p();
		}
		if ($base_unit_yield_schd_qty_p.equalsIgnoreCase(name)) {
			return base_unit_yield_schd_qty_p();
		}
		if ($base_unit_yield_rem_qty_p.equalsIgnoreCase(name)) {
			return base_unit_yield_rem_qty_p();
		}
		if ($act_dt_p.equalsIgnoreCase(name)) {
			return act_dt_p();
		}
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			return ac_dt_p();
		}
		if ($can_ac_dt_p.equalsIgnoreCase(name)) {
			return can_ac_dt_p();
		}
		if ($lot_no_p.equalsIgnoreCase(name)) {
			return lot_no_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($strg_str_ln_p.equalsIgnoreCase(name)) {
			return strg_str_ln_p();
		}
		if ($unschd_itm_p.equalsIgnoreCase(name)) {
			return unschd_itm_p();
		}
		if ($unschd_lot_no_p.equalsIgnoreCase(name)) {
			return unschd_lot_no_p();
		}
		if ($unschd_trd_unit_yield_act_qty_p.equalsIgnoreCase(name)) {
			return unschd_trd_unit_yield_act_qty_p();
		}
		if ($unschd_base_unit_yield_act_qty_p.equalsIgnoreCase(name)) {
			return unschd_base_unit_yield_act_qty_p();
		}
		if ($unschd_act_dt_p.equalsIgnoreCase(name)) {
			return unschd_act_dt_p();
		}
		if ($unschd_ac_dt_p.equalsIgnoreCase(name)) {
			return unschd_ac_dt_p();
		}
		if ($unschd_strg_str_ln_p.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($trd_unit_yield_act_qty_p.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty_p(
				((MCContainerMeta) trd_unit_yield_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_yield_act_qty_p.equalsIgnoreCase(name)) {
			base_unit_yield_act_qty_p(
				((MCContainerMeta) base_unit_yield_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_yield_schd_qty_p.equalsIgnoreCase(name)) {
			base_unit_yield_schd_qty_p(
				((MCContainerMeta) base_unit_yield_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_yield_rem_qty_p.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty_p(
				((MCContainerMeta) base_unit_yield_rem_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($act_dt_p.equalsIgnoreCase(name)) {
			act_dt_p(
				((MCContainerMeta) act_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			ac_dt_p(
				((MCContainerMeta) ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5220.AcDtR.class, value)
			);
			return;
		}
		if ($can_ac_dt_p.equalsIgnoreCase(name)) {
			can_ac_dt_p(
				((MCContainerMeta) can_ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5240.CanAcDtR.class, value)
			);
			return;
		}
		if ($lot_no_p.equalsIgnoreCase(name)) {
			lot_no_p(
				((MCContainerMeta) lot_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5030.LotNoR.class, value)
			);
			return;
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5070.SnoR.class, value)
			);
			return;
		}
		if ($strg_str_ln_p.equalsIgnoreCase(name)) {
			strg_str_ln_p(
				((MCContainerMeta) strg_str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($unschd_itm_p.equalsIgnoreCase(name)) {
			unschd_itm_p(
				((MCContainerMeta) unschd_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($unschd_lot_no_p.equalsIgnoreCase(name)) {
			unschd_lot_no_p(
				((MCContainerMeta) unschd_lot_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5030.LotNoR.class, value)
			);
			return;
		}
		if ($unschd_trd_unit_yield_act_qty_p.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty_p(
				((MCContainerMeta) unschd_trd_unit_yield_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($unschd_base_unit_yield_act_qty_p.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty_p(
				((MCContainerMeta) unschd_base_unit_yield_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($unschd_act_dt_p.equalsIgnoreCase(name)) {
			unschd_act_dt_p(
				((MCContainerMeta) unschd_act_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($unschd_ac_dt_p.equalsIgnoreCase(name)) {
			unschd_ac_dt_p(
				((MCContainerMeta) unschd_ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5220.AcDtR.class, value)
			);
			return;
		}
		if ($unschd_strg_str_ln_p.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_p(
				((MCContainerMeta) unschd_strg_str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
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
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public MCNumber trd_unit_yield_act_qty() {
		return trd_unit_yield_act_qty_p().qty();
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void trd_unit_yield_act_qty(MCNumber value) {
		trd_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void trd_unit_yield_act_qty(int value) {
		trd_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void trd_unit_yield_act_qty(long value) {
		trd_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void trd_unit_yield_act_qty(float value) {
		trd_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void trd_unit_yield_act_qty(double value) {
		trd_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_act_qty() {
		return base_unit_yield_act_qty_p().qty();
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void base_unit_yield_act_qty(MCNumber value) {
		base_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void base_unit_yield_act_qty(int value) {
		base_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void base_unit_yield_act_qty(long value) {
		base_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void base_unit_yield_act_qty(float value) {
		base_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void base_unit_yield_act_qty(double value) {
		base_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_schd_qty() {
		return base_unit_yield_schd_qty_p().qty();
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_schd_qty(MCNumber value) {
		base_unit_yield_schd_qty_p().qty(value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_schd_qty(int value) {
		base_unit_yield_schd_qty_p().qty(value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_schd_qty(long value) {
		base_unit_yield_schd_qty_p().qty(value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_schd_qty(float value) {
		base_unit_yield_schd_qty_p().qty(value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_schd_qty(double value) {
		base_unit_yield_schd_qty_p().qty(value);
	}

	/**
	 * Base unit remaining output qty. 基準単位出来高残数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_rem_qty() {
		return base_unit_yield_rem_qty_p().qty();
	}

	/**
	 * Base unit remaining output qty. 基準単位出来高残数量.<p>
	 *
	 */
	public void base_unit_yield_rem_qty(MCNumber value) {
		base_unit_yield_rem_qty_p().qty(value);
	}

	/**
	 * Base unit remaining output qty. 基準単位出来高残数量.<p>
	 *
	 */
	public void base_unit_yield_rem_qty(int value) {
		base_unit_yield_rem_qty_p().qty(value);
	}

	/**
	 * Base unit remaining output qty. 基準単位出来高残数量.<p>
	 *
	 */
	public void base_unit_yield_rem_qty(long value) {
		base_unit_yield_rem_qty_p().qty(value);
	}

	/**
	 * Base unit remaining output qty. 基準単位出来高残数量.<p>
	 *
	 */
	public void base_unit_yield_rem_qty(float value) {
		base_unit_yield_rem_qty_p().qty(value);
	}

	/**
	 * Base unit remaining output qty. 基準単位出来高残数量.<p>
	 *
	 */
	public void base_unit_yield_rem_qty(double value) {
		base_unit_yield_rem_qty_p().qty(value);
	}

	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public MCDate act_dt() {
		return act_dt_p().ymd();
	}

	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public void act_dt(MCDate value) {
		act_dt_p().ymd(value);
	}

	/**
	 * Actual time 実績時刻.<p>
	 *
	 */
	public MCDate act_hm() {
		return act_dt_p().hm();
	}

	/**
	 * Actual time 実績時刻.<p>
	 *
	 */
	public void act_hm(MCDate value) {
		act_dt_p().hm(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return ac_dt_p().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		ac_dt_p().ac_dt(value);
	}

	public MCDate can_ac_dt_for_input() {
		return can_ac_dt_p().can_ac_dt_for_input();
	}

	public void can_ac_dt_for_input(MCDate value) {
		can_ac_dt_p().can_ac_dt_for_input(value);
	}

	public MCDate can_ac_dt() {
		return can_ac_dt_p().can_ac_dt_for_call();
	}

	public void can_ac_dt(MCDate value) {
		can_ac_dt_p().can_ac_dt_for_call(value);
	}

	public MCDate ac_dt_after_srch() {
		return can_ac_dt_p().ac_dt_after_srch();
	}

	public void ac_dt_after_srch(MCDate value) {
		can_ac_dt_p().ac_dt_after_srch(value);
	}

	public boolean crt_lot_flg() {
		return lot_no_p().crt_lot_flg();
	}

	public void crt_lot_flg(boolean value) {
		lot_no_p().crt_lot_flg(value);
	}

	public String lot_no() {
		return lot_no_p().lot_no();
	}

	public void lot_no(String value) {
		lot_no_p().lot_no(value);
	}

	public String sublot_no() {
		return lot_no_p().sublot_no();
	}

	public void sublot_no(String value) {
		lot_no_p().sublot_no(value);
	}

	public String sno1() {
		return sno_p().sno1();
	}

	public void sno1(String value) {
		sno_p().sno1(value);
	}

	public String sno2() {
		return sno_p().sno2();
	}

	public void sno2(String value) {
		sno_p().sno2(value);
	}

	public String sno3() {
		return sno_p().sno3();
	}

	public void sno3(String value) {
		sno_p().sno3(value);
	}

	public String sno4() {
		return sno_p().sno4();
	}

	public void sno4(String value) {
		sno_p().sno4(value);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return strg_str_ln_p().str_ln_cd();
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		strg_str_ln_p().str_ln_cd(value);
	}

	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public String strg_str_ln_nm() {
		return strg_str_ln_p().str_ln_nm();
	}

	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public void strg_str_ln_nm(String value) {
		strg_str_ln_p().str_ln_nm(value);
	}

	/**
	 * Without storage location rack/line 格納場所棚・ライン無.<p>
	 *
	 */
	public boolean strg_str_ln_cd_none_flg() {
		return strg_str_ln_p().str_ln_cd_none_flg();
	}

	/**
	 * Without storage location rack/line 格納場所棚・ライン無.<p>
	 *
	 */
	public void strg_str_ln_cd_none_flg(boolean value) {
		strg_str_ln_p().str_ln_cd_none_flg(value);
	}

	public String unschd_itm_cd() {
		return unschd_itm_p().itm_cd();
	}

	public void unschd_itm_cd(String value) {
		unschd_itm_p().itm_cd(value);
	}

	public String unschd_itm_sub1() {
		return unschd_itm_p().itm_sub1();
	}

	public void unschd_itm_sub1(String value) {
		unschd_itm_p().itm_sub1(value);
	}

	public String unschd_itm_sub2() {
		return unschd_itm_p().itm_sub2();
	}

	public void unschd_itm_sub2(String value) {
		unschd_itm_p().itm_sub2(value);
	}

	public String unschd_itm_sub3() {
		return unschd_itm_p().itm_sub3();
	}

	public void unschd_itm_sub3(String value) {
		unschd_itm_p().itm_sub3(value);
	}

	public String unschd_itm_nm() {
		return unschd_itm_p().itm_nm();
	}

	public void unschd_itm_nm(String value) {
		unschd_itm_p().itm_nm(value);
	}

	public boolean unschd_crt_lot_flg() {
		return unschd_lot_no_p().crt_lot_flg();
	}

	public void unschd_crt_lot_flg(boolean value) {
		unschd_lot_no_p().crt_lot_flg(value);
	}

	public String unschd_lot_no() {
		return unschd_lot_no_p().lot_no();
	}

	public void unschd_lot_no(String value) {
		unschd_lot_no_p().lot_no(value);
	}

	public String unschd_sublot_no() {
		return unschd_lot_no_p().sublot_no();
	}

	public void unschd_sublot_no(String value) {
		unschd_lot_no_p().sublot_no(value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public MCNumber unschd_trd_unit_yield_act_qty() {
		return unschd_trd_unit_yield_act_qty_p().qty();
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void unschd_trd_unit_yield_act_qty(MCNumber value) {
		unschd_trd_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void unschd_trd_unit_yield_act_qty(int value) {
		unschd_trd_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void unschd_trd_unit_yield_act_qty(long value) {
		unschd_trd_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void unschd_trd_unit_yield_act_qty(float value) {
		unschd_trd_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void unschd_trd_unit_yield_act_qty(double value) {
		unschd_trd_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public MCNumber unschd_base_unit_yield_act_qty() {
		return unschd_base_unit_yield_act_qty_p().qty();
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void unschd_base_unit_yield_act_qty(MCNumber value) {
		unschd_base_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void unschd_base_unit_yield_act_qty(int value) {
		unschd_base_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void unschd_base_unit_yield_act_qty(long value) {
		unschd_base_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void unschd_base_unit_yield_act_qty(float value) {
		unschd_base_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void unschd_base_unit_yield_act_qty(double value) {
		unschd_base_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public MCDate unschd_act_dt() {
		return unschd_act_dt_p().ymd();
	}

	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public void unschd_act_dt(MCDate value) {
		unschd_act_dt_p().ymd(value);
	}

	/**
	 * Actual time 実績時刻.<p>
	 *
	 */
	public MCDate unschd_act_hm() {
		return unschd_act_dt_p().hm();
	}

	/**
	 * Actual time 実績時刻.<p>
	 *
	 */
	public void unschd_act_hm(MCDate value) {
		unschd_act_dt_p().hm(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate unschd_ac_dt() {
		return unschd_ac_dt_p().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void unschd_ac_dt(MCDate value) {
		unschd_ac_dt_p().ac_dt(value);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String unschd_strg_str_ln_cd() {
		return unschd_strg_str_ln_p().str_ln_cd();
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void unschd_strg_str_ln_cd(String value) {
		unschd_strg_str_ln_p().str_ln_cd(value);
	}

	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public String unschd_strg_str_ln_nm() {
		return unschd_strg_str_ln_p().str_ln_nm();
	}

	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public void unschd_strg_str_ln_nm(String value) {
		unschd_strg_str_ln_p().str_ln_nm(value);
	}

	/**
	 * Without storage location rack/line 格納場所棚・ライン無.<p>
	 *
	 */
	public boolean unschd_strg_str_ln_cd_none_flg() {
		return unschd_strg_str_ln_p().str_ln_cd_none_flg();
	}

	/**
	 * Without storage location rack/line 格納場所棚・ライン無.<p>
	 *
	 */
	public void unschd_strg_str_ln_cd_none_flg(boolean value) {
		unschd_strg_str_ln_p().str_ln_cd_none_flg(value);
	}

}

