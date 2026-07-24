package mcframe.serverMSBC.MSBCL6110;

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
 * ブロック"MfgInstActCom_Upd08_DtlInptSchd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstActCom_Upd08_DtlInptSchdR_MC_A extends MCConstRow {

	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public static final String $inpt_schd_no = "inpt_schd_no";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public static final String $base_unit_inpt_qty = "base_unit_inpt_qty";
	/**
	 * Base unit required start qty. 基準単位必要着手数量.<p>
	 *
	 */
	public static final String $base_unit_rqmt_qty = "base_unit_rqmt_qty";
	/**
	 * Base unit fixed required qty. to start 基準単位固定必要着手数量.<p>
	 *
	 */
	public static final String $base_unit_fxd_rqmt_qty = "base_unit_fxd_rqmt_qty";
	/**
	 * Active ingredient (Input start qty.) 有効成分（投入着手数量）.<p>
	 *
	 */
	public static final String $cont_inpt_qty = "cont_inpt_qty";
	/**
	 * Active ingredient (Required start qty.) 有効成分（必要着手数量）.<p>
	 *
	 */
	public static final String $cont_rqmt_qty = "cont_rqmt_qty";
	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要着手数量）.<p>
	 *
	 */
	public static final String $cont_fxd_rqmt_qty = "cont_fxd_rqmt_qty";
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
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public static final String $rnd_typ = "rnd_typ";
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
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public static final String $alt_itm_typ = "alt_itm_typ";
	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public static final String $alt_itm_ratio = "alt_itm_ratio";
	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public static final String $alt_alloc_prio = "alt_alloc_prio";
	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public static final String $std_cont_fctr = "std_cont_fctr";
	/**
	 * Scheduled date and time 予定日時.<p>
	 *
	 */
	public static final String $schd_tm = "schd_tm";
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
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public static final String $inpt_ctl_typ = "inpt_ctl_typ";
	/**
	 * Allocation 引当.<p>
	 *
	 */
	public static final String $alloc_flg = "alloc_flg";
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
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Input start qty. total 投入着手数量合計.<p>
	 *
	 */
	public static final String $sum_inpt_qty = "sum_inpt_qty";
	/**
	 * Required start qty. total 必要着手数量合計.<p>
	 *
	 */
	public static final String $sum_rqmt_qty = "sum_rqmt_qty";
	/**
	 * Total fixed required qty. to start 固定必要着手数量合計.<p>
	 *
	 */
	public static final String $sum_fxd_rqmt_qty = "sum_fxd_rqmt_qty";
	/**
	 * Active ingredient (Input start qty.) total 有効成分（投入着手数量）合計.<p>
	 *
	 */
	public static final String $sum_cont_inpt_qty = "sum_cont_inpt_qty";
	/**
	 * Active ingredient (required start qty.) total 有効成分（必要着手数量）合計.<p>
	 *
	 */
	public static final String $sum_cont_rqmt_qty = "sum_cont_rqmt_qty";
	/**
	 * Active ingredient (Fixed required qty.) total 有効成分（固定必要着手数量）合計.<p>
	 *
	 */
	public static final String $sum_cont_fxd_rqmt_qty = "sum_cont_fxd_rqmt_qty";
	/**
	 * Total remaining input qty. 投入残数量合計.<p>
	 *
	 */
	public static final String $sum_inpt_rem_qty = "sum_inpt_rem_qty";
	/**
	 * Total required remaining qty. 必要残数量合計.<p>
	 *
	 */
	public static final String $sum_rqmt_rem_qty = "sum_rqmt_rem_qty";
	/**
	 * Total remaining qty. of fixed required qty. 固定必要残数量合計.<p>
	 *
	 */
	public static final String $sum_fxd_rqmt_rem_qty = "sum_fxd_rqmt_rem_qty";
	/**
	 * Active ingredient (Remaining input qty.) total 有効成分（投入残数量）合計.<p>
	 *
	 */
	public static final String $sum_cont_inpt_rem_qty = "sum_cont_inpt_rem_qty";
	/**
	 * Active ingredient (required remaining qty.) total 有効成分（必要残数量）合計.<p>
	 *
	 */
	public static final String $sum_cont_rqmt_rem_qty = "sum_cont_rqmt_rem_qty";
	/**
	 * Active ingredient (Remaining qty. of fixed required qty.) total 有効成分（固定必要残数量）合計.<p>
	 *
	 */
	public static final String $sum_cont_fxd_rqmt_rem_qty = "sum_cont_fxd_rqmt_rem_qty";
	/**
	 * Maximum mfg. status type 最大製造状況区分.<p>
	 *
	 */
	public static final String $max_sts_typ = "max_sts_typ";
	/**
	 * Minimum mfg. status type 最小製造状況区分.<p>
	 *
	 */
	public static final String $min_sts_typ = "min_sts_typ";
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
	 * Input qty. including alternative 代替を考慮した投入数量.<p>
	 *
	 */
	public static final String $alt_inpt_qty = "alt_inpt_qty";
	/**
	 * Required qty. including alternative 代替を考慮した必要数量.<p>
	 *
	 */
	public static final String $alt_rqmt_qty = "alt_rqmt_qty";
	/**
	 * Fixed required qty. considering alternatives 代替を考慮した固定必要数量.<p>
	 *
	 */
	public static final String $alt_fxd_rqmt_qty = "alt_fxd_rqmt_qty";
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	/**
	 * Specify alternative item 代替品目指定.<p>
	 *
	 */
	public static final String $alt_itm_fix_flg = "alt_itm_fix_flg";


	public static final MCMeta inpt_schd_no_META = createCommonMeta($inpt_schd_no, mcframe.commonMA.meta.MA_META.INPT_SCHD_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta base_unit_inpt_qty_META = createCommonMeta($base_unit_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_rqmt_qty_META = createCommonMeta($base_unit_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_fxd_rqmt_qty_META = createCommonMeta($base_unit_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_inpt_qty_META = createCommonMeta($cont_inpt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_rqmt_qty_META = createCommonMeta($cont_rqmt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_fxd_rqmt_qty_META = createCommonMeta($cont_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta recalc_grp_META = createCommonMeta($recalc_grp, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta recalc_grp_seq_META = createCommonMeta($recalc_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rnd_typ_META = createCommonMeta($rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_seq_META = createCommonMeta($alt_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta chd_inpt_qty_META = createCommonMeta($chd_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_rqmt_qty_META = createCommonMeta($chd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alt_itm_typ_META = createCommonMeta($alt_itm_typ, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP);
	public static final MCMeta alt_itm_ratio_META = createCommonMeta($alt_itm_ratio, mcframe.commonMA.meta.MA_META.ALT_ITM_RATIO);
	public static final MCMeta alt_alloc_prio_META = createCommonMeta($alt_alloc_prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta schd_tm_META = createCommonMeta($schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta inpt_loc_cd_META = createCommonMeta($inpt_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inpt_str_ln_cd_META = createCommonMeta($inpt_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
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
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta inpt_ctl_typ_META = createCommonMeta($inpt_ctl_typ, mcframe.commonMA.meta.MA_META.INPT_CTL_TYP);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum_inpt_qty_META = createCommonMeta($sum_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sum_rqmt_qty_META = createCommonMeta($sum_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sum_fxd_rqmt_qty_META = createCommonMeta($sum_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sum_cont_inpt_qty_META = createCommonMeta($sum_cont_inpt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta sum_cont_rqmt_qty_META = createCommonMeta($sum_cont_rqmt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta sum_cont_fxd_rqmt_qty_META = createCommonMeta($sum_cont_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta sum_inpt_rem_qty_META = createCommonMeta($sum_inpt_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sum_rqmt_rem_qty_META = createCommonMeta($sum_rqmt_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sum_fxd_rqmt_rem_qty_META = createCommonMeta($sum_fxd_rqmt_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sum_cont_inpt_rem_qty_META = createCommonMeta($sum_cont_inpt_rem_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta sum_cont_rqmt_rem_qty_META = createCommonMeta($sum_cont_rqmt_rem_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta sum_cont_fxd_rqmt_rem_qty_META = createCommonMeta($sum_cont_fxd_rqmt_rem_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta max_sts_typ_META = createCommonMeta($max_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta min_sts_typ_META = createCommonMeta($min_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta io_schd_typ_META = createCommonMeta($io_schd_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_TYP);
	public static final MCMeta io_schd_sts_typ_META = createCommonMeta($io_schd_sts_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_STS_TYP);
	public static final MCMeta alt_inpt_qty_META = createCommonMeta($alt_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alt_rqmt_qty_META = createCommonMeta($alt_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alt_fxd_rqmt_qty_META = createCommonMeta($alt_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta alt_itm_fix_flg_META = createCommonMeta($alt_itm_fix_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<MfgInstActCom_Upd08_DtlInptSchdR> constMetas = new ConstMetaList<MfgInstActCom_Upd08_DtlInptSchdR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			inpt_schd_no_META,
			mfg_inst_no_META,
			itm_mfg_inst_no_META,
			oper_inst_no_META,
			base_unit_inpt_qty_META,
			base_unit_rqmt_qty_META,
			base_unit_fxd_rqmt_qty_META,
			cont_inpt_qty_META,
			cont_rqmt_qty_META,
			cont_fxd_rqmt_qty_META,
			recalc_grp_META,
			recalc_grp_seq_META,
			dec_place_META,
			rnd_typ_META,
			alt_grp_cd_META,
			alt_grp_seq_META,
			chd_inpt_qty_META,
			chd_rqmt_qty_META,
			alt_itm_typ_META,
			alt_itm_ratio_META,
			alt_alloc_prio_META,
			std_cont_fctr_META,
			schd_tm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			ver_no_META,
			inpt_loc_cd_META,
			inpt_str_ln_cd_META,
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
			base_unit_cd_META,
			gd_cd_META,
			inpt_ctl_typ_META,
			alloc_flg_META,
			cont_fctr_rnd_typ_META,
			cont_fctr_dec_place_META,
			cont_fctr_flg_META,
			sum_inpt_qty_META,
			sum_rqmt_qty_META,
			sum_fxd_rqmt_qty_META,
			sum_cont_inpt_qty_META,
			sum_cont_rqmt_qty_META,
			sum_cont_fxd_rqmt_qty_META,
			sum_inpt_rem_qty_META,
			sum_rqmt_rem_qty_META,
			sum_fxd_rqmt_rem_qty_META,
			sum_cont_inpt_rem_qty_META,
			sum_cont_rqmt_rem_qty_META,
			sum_cont_fxd_rqmt_rem_qty_META,
			max_sts_typ_META,
			min_sts_typ_META,
			io_schd_typ_META,
			io_schd_sts_typ_META,
			alt_inpt_qty_META,
			alt_rqmt_qty_META,
			alt_fxd_rqmt_qty_META,
			div_seq_META,
			mfg_sts_typ_META,
			prov_typ_META,
			alt_itm_fix_flg_META
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
	protected MfgInstActCom_Upd08_DtlInptSchdR_MC_A(ConstMetaList<? extends MfgInstActCom_Upd08_DtlInptSchdR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_DtlInptSchdR clone() {
		return (MfgInstActCom_Upd08_DtlInptSchdR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_DtlInptSchdR createInstance() {
		return (MfgInstActCom_Upd08_DtlInptSchdR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_DtlInptSchdR getValues(String... names) {
		return (MfgInstActCom_Upd08_DtlInptSchdR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public String inpt_schd_no() {
		return getConstString(offset + 0, $inpt_schd_no);
	}

	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		setConstString(offset + 0, $inpt_schd_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 1, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 1, $mfg_inst_no, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 2, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 2, $itm_mfg_inst_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 3, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 3, $oper_inst_no, value);
	}


	/**
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_qty() {
		return getConstNumber(offset + 4, $base_unit_inpt_qty);
	}

	/**
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(MCNumber value) {
		setConstNumber(offset + 4, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(int value) {
		setConstNumber(offset + 4, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(long value) {
		setConstNumber(offset + 4, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(float value) {
		setConstNumber(offset + 4, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(double value) {
		setConstNumber(offset + 4, $base_unit_inpt_qty, value);
	}


	/**
	 * Base unit required start qty. 基準単位必要着手数量.<p>
	 *
	 */
	public MCNumber base_unit_rqmt_qty() {
		return getConstNumber(offset + 5, $base_unit_rqmt_qty);
	}

	/**
	 * Base unit required start qty. 基準単位必要着手数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 5, $base_unit_rqmt_qty, value);
	}

	/**
	 * Base unit required start qty. 基準単位必要着手数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(int value) {
		setConstNumber(offset + 5, $base_unit_rqmt_qty, value);
	}

	/**
	 * Base unit required start qty. 基準単位必要着手数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(long value) {
		setConstNumber(offset + 5, $base_unit_rqmt_qty, value);
	}

	/**
	 * Base unit required start qty. 基準単位必要着手数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(float value) {
		setConstNumber(offset + 5, $base_unit_rqmt_qty, value);
	}

	/**
	 * Base unit required start qty. 基準単位必要着手数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(double value) {
		setConstNumber(offset + 5, $base_unit_rqmt_qty, value);
	}


	/**
	 * Base unit fixed required qty. to start 基準単位固定必要着手数量.<p>
	 *
	 */
	public MCNumber base_unit_fxd_rqmt_qty() {
		return getConstNumber(offset + 6, $base_unit_fxd_rqmt_qty);
	}

	/**
	 * Base unit fixed required qty. to start 基準単位固定必要着手数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 6, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 * Base unit fixed required qty. to start 基準単位固定必要着手数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 6, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 * Base unit fixed required qty. to start 基準単位固定必要着手数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 6, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 * Base unit fixed required qty. to start 基準単位固定必要着手数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 6, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 * Base unit fixed required qty. to start 基準単位固定必要着手数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 6, $base_unit_fxd_rqmt_qty, value);
	}


	/**
	 * Active ingredient (Input start qty.) 有効成分（投入着手数量）.<p>
	 *
	 */
	public MCNumber cont_inpt_qty() {
		return getConstNumber(offset + 7, $cont_inpt_qty);
	}

	/**
	 * Active ingredient (Input start qty.) 有効成分（投入着手数量）.<p>
	 *
	 */
	public void cont_inpt_qty(MCNumber value) {
		setConstNumber(offset + 7, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input start qty.) 有効成分（投入着手数量）.<p>
	 *
	 */
	public void cont_inpt_qty(int value) {
		setConstNumber(offset + 7, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input start qty.) 有効成分（投入着手数量）.<p>
	 *
	 */
	public void cont_inpt_qty(long value) {
		setConstNumber(offset + 7, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input start qty.) 有効成分（投入着手数量）.<p>
	 *
	 */
	public void cont_inpt_qty(float value) {
		setConstNumber(offset + 7, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input start qty.) 有効成分（投入着手数量）.<p>
	 *
	 */
	public void cont_inpt_qty(double value) {
		setConstNumber(offset + 7, $cont_inpt_qty, value);
	}


	/**
	 * Active ingredient (Required start qty.) 有効成分（必要着手数量）.<p>
	 *
	 */
	public MCNumber cont_rqmt_qty() {
		return getConstNumber(offset + 8, $cont_rqmt_qty);
	}

	/**
	 * Active ingredient (Required start qty.) 有効成分（必要着手数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 8, $cont_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Required start qty.) 有効成分（必要着手数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(int value) {
		setConstNumber(offset + 8, $cont_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Required start qty.) 有効成分（必要着手数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(long value) {
		setConstNumber(offset + 8, $cont_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Required start qty.) 有効成分（必要着手数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(float value) {
		setConstNumber(offset + 8, $cont_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Required start qty.) 有効成分（必要着手数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(double value) {
		setConstNumber(offset + 8, $cont_rqmt_qty, value);
	}


	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要着手数量）.<p>
	 *
	 */
	public MCNumber cont_fxd_rqmt_qty() {
		return getConstNumber(offset + 9, $cont_fxd_rqmt_qty);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要着手数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 9, $cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要着手数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 9, $cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要着手数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 9, $cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要着手数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 9, $cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要着手数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 9, $cont_fxd_rqmt_qty, value);
	}


	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public MCNumber recalc_grp() {
		return getConstNumber(offset + 10, $recalc_grp);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(MCNumber value) {
		setConstNumber(offset + 10, $recalc_grp, value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(int value) {
		setConstNumber(offset + 10, $recalc_grp, value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(long value) {
		setConstNumber(offset + 10, $recalc_grp, value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(float value) {
		setConstNumber(offset + 10, $recalc_grp, value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(double value) {
		setConstNumber(offset + 10, $recalc_grp, value);
	}


	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public MCNumber recalc_grp_seq() {
		return getConstNumber(offset + 11, $recalc_grp_seq);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(MCNumber value) {
		setConstNumber(offset + 11, $recalc_grp_seq, value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(int value) {
		setConstNumber(offset + 11, $recalc_grp_seq, value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(long value) {
		setConstNumber(offset + 11, $recalc_grp_seq, value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(float value) {
		setConstNumber(offset + 11, $recalc_grp_seq, value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(double value) {
		setConstNumber(offset + 11, $recalc_grp_seq, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 12, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 12, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 12, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 12, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 12, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 12, $dec_place, value);
	}


	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public String rnd_typ() {
		return getConstString(offset + 13, $rnd_typ);
	}

	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public void rnd_typ(String value) {
		setConstString(offset + 13, $rnd_typ, value);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 14, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 14, $alt_grp_cd, value);
	}


	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public MCNumber alt_grp_seq() {
		return getConstNumber(offset + 15, $alt_grp_seq);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(MCNumber value) {
		setConstNumber(offset + 15, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(int value) {
		setConstNumber(offset + 15, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(long value) {
		setConstNumber(offset + 15, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(float value) {
		setConstNumber(offset + 15, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(double value) {
		setConstNumber(offset + 15, $alt_grp_seq, value);
	}


	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public MCNumber chd_inpt_qty() {
		return getConstNumber(offset + 16, $chd_inpt_qty);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(MCNumber value) {
		setConstNumber(offset + 16, $chd_inpt_qty, value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(int value) {
		setConstNumber(offset + 16, $chd_inpt_qty, value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(long value) {
		setConstNumber(offset + 16, $chd_inpt_qty, value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(float value) {
		setConstNumber(offset + 16, $chd_inpt_qty, value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(double value) {
		setConstNumber(offset + 16, $chd_inpt_qty, value);
	}


	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public MCNumber chd_rqmt_qty() {
		return getConstNumber(offset + 17, $chd_rqmt_qty);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 17, $chd_rqmt_qty, value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(int value) {
		setConstNumber(offset + 17, $chd_rqmt_qty, value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(long value) {
		setConstNumber(offset + 17, $chd_rqmt_qty, value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(float value) {
		setConstNumber(offset + 17, $chd_rqmt_qty, value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(double value) {
		setConstNumber(offset + 17, $chd_rqmt_qty, value);
	}


	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public String alt_itm_typ() {
		return getConstString(offset + 18, $alt_itm_typ);
	}

	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public void alt_itm_typ(String value) {
		setConstString(offset + 18, $alt_itm_typ, value);
	}


	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCNumber alt_itm_ratio() {
		return getConstNumber(offset + 19, $alt_itm_ratio);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(MCNumber value) {
		setConstNumber(offset + 19, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(int value) {
		setConstNumber(offset + 19, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(long value) {
		setConstNumber(offset + 19, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(float value) {
		setConstNumber(offset + 19, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(double value) {
		setConstNumber(offset + 19, $alt_itm_ratio, value);
	}


	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public MCNumber alt_alloc_prio() {
		return getConstNumber(offset + 20, $alt_alloc_prio);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(MCNumber value) {
		setConstNumber(offset + 20, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(int value) {
		setConstNumber(offset + 20, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(long value) {
		setConstNumber(offset + 20, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(float value) {
		setConstNumber(offset + 20, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(double value) {
		setConstNumber(offset + 20, $alt_alloc_prio, value);
	}


	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 21, $std_cont_fctr);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 21, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 21, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 21, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 21, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 21, $std_cont_fctr, value);
	}


	/**
	 * Scheduled date and time 予定日時.<p>
	 *
	 */
	public MCDate schd_tm() {
		return getConstDate(offset + 22, $schd_tm);
	}

	/**
	 * Scheduled date and time 予定日時.<p>
	 *
	 */
	public void schd_tm(MCDate value) {
		setConstDate(offset + 22, $schd_tm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 23, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 23, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 24, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 24, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 25, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 25, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 26, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 26, $itm_sub3, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 27, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 27, $ver_no, value);
	}


	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public String inpt_loc_cd() {
		return getConstString(offset + 28, $inpt_loc_cd);
	}

	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public void inpt_loc_cd(String value) {
		setConstString(offset + 28, $inpt_loc_cd, value);
	}


	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public String inpt_str_ln_cd() {
		return getConstString(offset + 29, $inpt_str_ln_cd);
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public void inpt_str_ln_cd(String value) {
		setConstString(offset + 29, $inpt_str_ln_cd, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 30, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 30, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 31, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 31, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 32, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 32, $sno1, value);
	}


	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 33, $sno1_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 33, $sno1_null_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 34, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 34, $sno2, value);
	}


	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 35, $sno2_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 35, $sno2_null_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 36, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 36, $sno3, value);
	}


	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 37, $sno3_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 37, $sno3_null_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 38, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 38, $sno4, value);
	}


	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 39, $sno4_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 39, $sno4_null_flg, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 40, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 40, $base_unit_cd, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 41, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 41, $gd_cd, value);
	}


	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public String inpt_ctl_typ() {
		return getConstString(offset + 42, $inpt_ctl_typ);
	}

	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public void inpt_ctl_typ(String value) {
		setConstString(offset + 42, $inpt_ctl_typ, value);
	}


	/**
	 * Allocation 引当.<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 43, $alloc_flg);
	}

	/**
	 * Allocation 引当.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 43, $alloc_flg, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 44, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 44, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 45, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 45, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 45, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 45, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 45, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 45, $cont_fctr_dec_place, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 46, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 46, $cont_fctr_flg, value);
	}


	/**
	 * Input start qty. total 投入着手数量合計.<p>
	 *
	 */
	public MCNumber sum_inpt_qty() {
		return getConstNumber(offset + 47, $sum_inpt_qty);
	}

	/**
	 * Input start qty. total 投入着手数量合計.<p>
	 *
	 */
	public void sum_inpt_qty(MCNumber value) {
		setConstNumber(offset + 47, $sum_inpt_qty, value);
	}

	/**
	 * Input start qty. total 投入着手数量合計.<p>
	 *
	 */
	public void sum_inpt_qty(int value) {
		setConstNumber(offset + 47, $sum_inpt_qty, value);
	}

	/**
	 * Input start qty. total 投入着手数量合計.<p>
	 *
	 */
	public void sum_inpt_qty(long value) {
		setConstNumber(offset + 47, $sum_inpt_qty, value);
	}

	/**
	 * Input start qty. total 投入着手数量合計.<p>
	 *
	 */
	public void sum_inpt_qty(float value) {
		setConstNumber(offset + 47, $sum_inpt_qty, value);
	}

	/**
	 * Input start qty. total 投入着手数量合計.<p>
	 *
	 */
	public void sum_inpt_qty(double value) {
		setConstNumber(offset + 47, $sum_inpt_qty, value);
	}


	/**
	 * Required start qty. total 必要着手数量合計.<p>
	 *
	 */
	public MCNumber sum_rqmt_qty() {
		return getConstNumber(offset + 48, $sum_rqmt_qty);
	}

	/**
	 * Required start qty. total 必要着手数量合計.<p>
	 *
	 */
	public void sum_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 48, $sum_rqmt_qty, value);
	}

	/**
	 * Required start qty. total 必要着手数量合計.<p>
	 *
	 */
	public void sum_rqmt_qty(int value) {
		setConstNumber(offset + 48, $sum_rqmt_qty, value);
	}

	/**
	 * Required start qty. total 必要着手数量合計.<p>
	 *
	 */
	public void sum_rqmt_qty(long value) {
		setConstNumber(offset + 48, $sum_rqmt_qty, value);
	}

	/**
	 * Required start qty. total 必要着手数量合計.<p>
	 *
	 */
	public void sum_rqmt_qty(float value) {
		setConstNumber(offset + 48, $sum_rqmt_qty, value);
	}

	/**
	 * Required start qty. total 必要着手数量合計.<p>
	 *
	 */
	public void sum_rqmt_qty(double value) {
		setConstNumber(offset + 48, $sum_rqmt_qty, value);
	}


	/**
	 * Total fixed required qty. to start 固定必要着手数量合計.<p>
	 *
	 */
	public MCNumber sum_fxd_rqmt_qty() {
		return getConstNumber(offset + 49, $sum_fxd_rqmt_qty);
	}

	/**
	 * Total fixed required qty. to start 固定必要着手数量合計.<p>
	 *
	 */
	public void sum_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 49, $sum_fxd_rqmt_qty, value);
	}

	/**
	 * Total fixed required qty. to start 固定必要着手数量合計.<p>
	 *
	 */
	public void sum_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 49, $sum_fxd_rqmt_qty, value);
	}

	/**
	 * Total fixed required qty. to start 固定必要着手数量合計.<p>
	 *
	 */
	public void sum_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 49, $sum_fxd_rqmt_qty, value);
	}

	/**
	 * Total fixed required qty. to start 固定必要着手数量合計.<p>
	 *
	 */
	public void sum_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 49, $sum_fxd_rqmt_qty, value);
	}

	/**
	 * Total fixed required qty. to start 固定必要着手数量合計.<p>
	 *
	 */
	public void sum_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 49, $sum_fxd_rqmt_qty, value);
	}


	/**
	 * Active ingredient (Input start qty.) total 有効成分（投入着手数量）合計.<p>
	 *
	 */
	public MCNumber sum_cont_inpt_qty() {
		return getConstNumber(offset + 50, $sum_cont_inpt_qty);
	}

	/**
	 * Active ingredient (Input start qty.) total 有効成分（投入着手数量）合計.<p>
	 *
	 */
	public void sum_cont_inpt_qty(MCNumber value) {
		setConstNumber(offset + 50, $sum_cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input start qty.) total 有効成分（投入着手数量）合計.<p>
	 *
	 */
	public void sum_cont_inpt_qty(int value) {
		setConstNumber(offset + 50, $sum_cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input start qty.) total 有効成分（投入着手数量）合計.<p>
	 *
	 */
	public void sum_cont_inpt_qty(long value) {
		setConstNumber(offset + 50, $sum_cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input start qty.) total 有効成分（投入着手数量）合計.<p>
	 *
	 */
	public void sum_cont_inpt_qty(float value) {
		setConstNumber(offset + 50, $sum_cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input start qty.) total 有効成分（投入着手数量）合計.<p>
	 *
	 */
	public void sum_cont_inpt_qty(double value) {
		setConstNumber(offset + 50, $sum_cont_inpt_qty, value);
	}


	/**
	 * Active ingredient (required start qty.) total 有効成分（必要着手数量）合計.<p>
	 *
	 */
	public MCNumber sum_cont_rqmt_qty() {
		return getConstNumber(offset + 51, $sum_cont_rqmt_qty);
	}

	/**
	 * Active ingredient (required start qty.) total 有効成分（必要着手数量）合計.<p>
	 *
	 */
	public void sum_cont_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 51, $sum_cont_rqmt_qty, value);
	}

	/**
	 * Active ingredient (required start qty.) total 有効成分（必要着手数量）合計.<p>
	 *
	 */
	public void sum_cont_rqmt_qty(int value) {
		setConstNumber(offset + 51, $sum_cont_rqmt_qty, value);
	}

	/**
	 * Active ingredient (required start qty.) total 有効成分（必要着手数量）合計.<p>
	 *
	 */
	public void sum_cont_rqmt_qty(long value) {
		setConstNumber(offset + 51, $sum_cont_rqmt_qty, value);
	}

	/**
	 * Active ingredient (required start qty.) total 有効成分（必要着手数量）合計.<p>
	 *
	 */
	public void sum_cont_rqmt_qty(float value) {
		setConstNumber(offset + 51, $sum_cont_rqmt_qty, value);
	}

	/**
	 * Active ingredient (required start qty.) total 有効成分（必要着手数量）合計.<p>
	 *
	 */
	public void sum_cont_rqmt_qty(double value) {
		setConstNumber(offset + 51, $sum_cont_rqmt_qty, value);
	}


	/**
	 * Active ingredient (Fixed required qty.) total 有効成分（固定必要着手数量）合計.<p>
	 *
	 */
	public MCNumber sum_cont_fxd_rqmt_qty() {
		return getConstNumber(offset + 52, $sum_cont_fxd_rqmt_qty);
	}

	/**
	 * Active ingredient (Fixed required qty.) total 有効成分（固定必要着手数量）合計.<p>
	 *
	 */
	public void sum_cont_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 52, $sum_cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Fixed required qty.) total 有効成分（固定必要着手数量）合計.<p>
	 *
	 */
	public void sum_cont_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 52, $sum_cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Fixed required qty.) total 有効成分（固定必要着手数量）合計.<p>
	 *
	 */
	public void sum_cont_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 52, $sum_cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Fixed required qty.) total 有効成分（固定必要着手数量）合計.<p>
	 *
	 */
	public void sum_cont_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 52, $sum_cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Fixed required qty.) total 有効成分（固定必要着手数量）合計.<p>
	 *
	 */
	public void sum_cont_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 52, $sum_cont_fxd_rqmt_qty, value);
	}


	/**
	 * Total remaining input qty. 投入残数量合計.<p>
	 *
	 */
	public MCNumber sum_inpt_rem_qty() {
		return getConstNumber(offset + 53, $sum_inpt_rem_qty);
	}

	/**
	 * Total remaining input qty. 投入残数量合計.<p>
	 *
	 */
	public void sum_inpt_rem_qty(MCNumber value) {
		setConstNumber(offset + 53, $sum_inpt_rem_qty, value);
	}

	/**
	 * Total remaining input qty. 投入残数量合計.<p>
	 *
	 */
	public void sum_inpt_rem_qty(int value) {
		setConstNumber(offset + 53, $sum_inpt_rem_qty, value);
	}

	/**
	 * Total remaining input qty. 投入残数量合計.<p>
	 *
	 */
	public void sum_inpt_rem_qty(long value) {
		setConstNumber(offset + 53, $sum_inpt_rem_qty, value);
	}

	/**
	 * Total remaining input qty. 投入残数量合計.<p>
	 *
	 */
	public void sum_inpt_rem_qty(float value) {
		setConstNumber(offset + 53, $sum_inpt_rem_qty, value);
	}

	/**
	 * Total remaining input qty. 投入残数量合計.<p>
	 *
	 */
	public void sum_inpt_rem_qty(double value) {
		setConstNumber(offset + 53, $sum_inpt_rem_qty, value);
	}


	/**
	 * Total required remaining qty. 必要残数量合計.<p>
	 *
	 */
	public MCNumber sum_rqmt_rem_qty() {
		return getConstNumber(offset + 54, $sum_rqmt_rem_qty);
	}

	/**
	 * Total required remaining qty. 必要残数量合計.<p>
	 *
	 */
	public void sum_rqmt_rem_qty(MCNumber value) {
		setConstNumber(offset + 54, $sum_rqmt_rem_qty, value);
	}

	/**
	 * Total required remaining qty. 必要残数量合計.<p>
	 *
	 */
	public void sum_rqmt_rem_qty(int value) {
		setConstNumber(offset + 54, $sum_rqmt_rem_qty, value);
	}

	/**
	 * Total required remaining qty. 必要残数量合計.<p>
	 *
	 */
	public void sum_rqmt_rem_qty(long value) {
		setConstNumber(offset + 54, $sum_rqmt_rem_qty, value);
	}

	/**
	 * Total required remaining qty. 必要残数量合計.<p>
	 *
	 */
	public void sum_rqmt_rem_qty(float value) {
		setConstNumber(offset + 54, $sum_rqmt_rem_qty, value);
	}

	/**
	 * Total required remaining qty. 必要残数量合計.<p>
	 *
	 */
	public void sum_rqmt_rem_qty(double value) {
		setConstNumber(offset + 54, $sum_rqmt_rem_qty, value);
	}


	/**
	 * Total remaining qty. of fixed required qty. 固定必要残数量合計.<p>
	 *
	 */
	public MCNumber sum_fxd_rqmt_rem_qty() {
		return getConstNumber(offset + 55, $sum_fxd_rqmt_rem_qty);
	}

	/**
	 * Total remaining qty. of fixed required qty. 固定必要残数量合計.<p>
	 *
	 */
	public void sum_fxd_rqmt_rem_qty(MCNumber value) {
		setConstNumber(offset + 55, $sum_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Total remaining qty. of fixed required qty. 固定必要残数量合計.<p>
	 *
	 */
	public void sum_fxd_rqmt_rem_qty(int value) {
		setConstNumber(offset + 55, $sum_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Total remaining qty. of fixed required qty. 固定必要残数量合計.<p>
	 *
	 */
	public void sum_fxd_rqmt_rem_qty(long value) {
		setConstNumber(offset + 55, $sum_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Total remaining qty. of fixed required qty. 固定必要残数量合計.<p>
	 *
	 */
	public void sum_fxd_rqmt_rem_qty(float value) {
		setConstNumber(offset + 55, $sum_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Total remaining qty. of fixed required qty. 固定必要残数量合計.<p>
	 *
	 */
	public void sum_fxd_rqmt_rem_qty(double value) {
		setConstNumber(offset + 55, $sum_fxd_rqmt_rem_qty, value);
	}


	/**
	 * Active ingredient (Remaining input qty.) total 有効成分（投入残数量）合計.<p>
	 *
	 */
	public MCNumber sum_cont_inpt_rem_qty() {
		return getConstNumber(offset + 56, $sum_cont_inpt_rem_qty);
	}

	/**
	 * Active ingredient (Remaining input qty.) total 有効成分（投入残数量）合計.<p>
	 *
	 */
	public void sum_cont_inpt_rem_qty(MCNumber value) {
		setConstNumber(offset + 56, $sum_cont_inpt_rem_qty, value);
	}

	/**
	 * Active ingredient (Remaining input qty.) total 有効成分（投入残数量）合計.<p>
	 *
	 */
	public void sum_cont_inpt_rem_qty(int value) {
		setConstNumber(offset + 56, $sum_cont_inpt_rem_qty, value);
	}

	/**
	 * Active ingredient (Remaining input qty.) total 有効成分（投入残数量）合計.<p>
	 *
	 */
	public void sum_cont_inpt_rem_qty(long value) {
		setConstNumber(offset + 56, $sum_cont_inpt_rem_qty, value);
	}

	/**
	 * Active ingredient (Remaining input qty.) total 有効成分（投入残数量）合計.<p>
	 *
	 */
	public void sum_cont_inpt_rem_qty(float value) {
		setConstNumber(offset + 56, $sum_cont_inpt_rem_qty, value);
	}

	/**
	 * Active ingredient (Remaining input qty.) total 有効成分（投入残数量）合計.<p>
	 *
	 */
	public void sum_cont_inpt_rem_qty(double value) {
		setConstNumber(offset + 56, $sum_cont_inpt_rem_qty, value);
	}


	/**
	 * Active ingredient (required remaining qty.) total 有効成分（必要残数量）合計.<p>
	 *
	 */
	public MCNumber sum_cont_rqmt_rem_qty() {
		return getConstNumber(offset + 57, $sum_cont_rqmt_rem_qty);
	}

	/**
	 * Active ingredient (required remaining qty.) total 有効成分（必要残数量）合計.<p>
	 *
	 */
	public void sum_cont_rqmt_rem_qty(MCNumber value) {
		setConstNumber(offset + 57, $sum_cont_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient (required remaining qty.) total 有効成分（必要残数量）合計.<p>
	 *
	 */
	public void sum_cont_rqmt_rem_qty(int value) {
		setConstNumber(offset + 57, $sum_cont_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient (required remaining qty.) total 有効成分（必要残数量）合計.<p>
	 *
	 */
	public void sum_cont_rqmt_rem_qty(long value) {
		setConstNumber(offset + 57, $sum_cont_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient (required remaining qty.) total 有効成分（必要残数量）合計.<p>
	 *
	 */
	public void sum_cont_rqmt_rem_qty(float value) {
		setConstNumber(offset + 57, $sum_cont_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient (required remaining qty.) total 有効成分（必要残数量）合計.<p>
	 *
	 */
	public void sum_cont_rqmt_rem_qty(double value) {
		setConstNumber(offset + 57, $sum_cont_rqmt_rem_qty, value);
	}


	/**
	 * Active ingredient (Remaining qty. of fixed required qty.) total 有効成分（固定必要残数量）合計.<p>
	 *
	 */
	public MCNumber sum_cont_fxd_rqmt_rem_qty() {
		return getConstNumber(offset + 58, $sum_cont_fxd_rqmt_rem_qty);
	}

	/**
	 * Active ingredient (Remaining qty. of fixed required qty.) total 有効成分（固定必要残数量）合計.<p>
	 *
	 */
	public void sum_cont_fxd_rqmt_rem_qty(MCNumber value) {
		setConstNumber(offset + 58, $sum_cont_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient (Remaining qty. of fixed required qty.) total 有効成分（固定必要残数量）合計.<p>
	 *
	 */
	public void sum_cont_fxd_rqmt_rem_qty(int value) {
		setConstNumber(offset + 58, $sum_cont_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient (Remaining qty. of fixed required qty.) total 有効成分（固定必要残数量）合計.<p>
	 *
	 */
	public void sum_cont_fxd_rqmt_rem_qty(long value) {
		setConstNumber(offset + 58, $sum_cont_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient (Remaining qty. of fixed required qty.) total 有効成分（固定必要残数量）合計.<p>
	 *
	 */
	public void sum_cont_fxd_rqmt_rem_qty(float value) {
		setConstNumber(offset + 58, $sum_cont_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient (Remaining qty. of fixed required qty.) total 有効成分（固定必要残数量）合計.<p>
	 *
	 */
	public void sum_cont_fxd_rqmt_rem_qty(double value) {
		setConstNumber(offset + 58, $sum_cont_fxd_rqmt_rem_qty, value);
	}


	/**
	 * Maximum mfg. status type 最大製造状況区分.<p>
	 *
	 */
	public String max_sts_typ() {
		return getConstString(offset + 59, $max_sts_typ);
	}

	/**
	 * Maximum mfg. status type 最大製造状況区分.<p>
	 *
	 */
	public void max_sts_typ(String value) {
		setConstString(offset + 59, $max_sts_typ, value);
	}


	/**
	 * Minimum mfg. status type 最小製造状況区分.<p>
	 *
	 */
	public String min_sts_typ() {
		return getConstString(offset + 60, $min_sts_typ);
	}

	/**
	 * Minimum mfg. status type 最小製造状況区分.<p>
	 *
	 */
	public void min_sts_typ(String value) {
		setConstString(offset + 60, $min_sts_typ, value);
	}


	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public String io_schd_typ() {
		return getConstString(offset + 61, $io_schd_typ);
	}

	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public void io_schd_typ(String value) {
		setConstString(offset + 61, $io_schd_typ, value);
	}


	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public String io_schd_sts_typ() {
		return getConstString(offset + 62, $io_schd_sts_typ);
	}

	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public void io_schd_sts_typ(String value) {
		setConstString(offset + 62, $io_schd_sts_typ, value);
	}


	/**
	 * Input qty. including alternative 代替を考慮した投入数量.<p>
	 *
	 */
	public MCNumber alt_inpt_qty() {
		return getConstNumber(offset + 63, $alt_inpt_qty);
	}

	/**
	 * Input qty. including alternative 代替を考慮した投入数量.<p>
	 *
	 */
	public void alt_inpt_qty(MCNumber value) {
		setConstNumber(offset + 63, $alt_inpt_qty, value);
	}

	/**
	 * Input qty. including alternative 代替を考慮した投入数量.<p>
	 *
	 */
	public void alt_inpt_qty(int value) {
		setConstNumber(offset + 63, $alt_inpt_qty, value);
	}

	/**
	 * Input qty. including alternative 代替を考慮した投入数量.<p>
	 *
	 */
	public void alt_inpt_qty(long value) {
		setConstNumber(offset + 63, $alt_inpt_qty, value);
	}

	/**
	 * Input qty. including alternative 代替を考慮した投入数量.<p>
	 *
	 */
	public void alt_inpt_qty(float value) {
		setConstNumber(offset + 63, $alt_inpt_qty, value);
	}

	/**
	 * Input qty. including alternative 代替を考慮した投入数量.<p>
	 *
	 */
	public void alt_inpt_qty(double value) {
		setConstNumber(offset + 63, $alt_inpt_qty, value);
	}


	/**
	 * Required qty. including alternative 代替を考慮した必要数量.<p>
	 *
	 */
	public MCNumber alt_rqmt_qty() {
		return getConstNumber(offset + 64, $alt_rqmt_qty);
	}

	/**
	 * Required qty. including alternative 代替を考慮した必要数量.<p>
	 *
	 */
	public void alt_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 64, $alt_rqmt_qty, value);
	}

	/**
	 * Required qty. including alternative 代替を考慮した必要数量.<p>
	 *
	 */
	public void alt_rqmt_qty(int value) {
		setConstNumber(offset + 64, $alt_rqmt_qty, value);
	}

	/**
	 * Required qty. including alternative 代替を考慮した必要数量.<p>
	 *
	 */
	public void alt_rqmt_qty(long value) {
		setConstNumber(offset + 64, $alt_rqmt_qty, value);
	}

	/**
	 * Required qty. including alternative 代替を考慮した必要数量.<p>
	 *
	 */
	public void alt_rqmt_qty(float value) {
		setConstNumber(offset + 64, $alt_rqmt_qty, value);
	}

	/**
	 * Required qty. including alternative 代替を考慮した必要数量.<p>
	 *
	 */
	public void alt_rqmt_qty(double value) {
		setConstNumber(offset + 64, $alt_rqmt_qty, value);
	}


	/**
	 * Fixed required qty. considering alternatives 代替を考慮した固定必要数量.<p>
	 *
	 */
	public MCNumber alt_fxd_rqmt_qty() {
		return getConstNumber(offset + 65, $alt_fxd_rqmt_qty);
	}

	/**
	 * Fixed required qty. considering alternatives 代替を考慮した固定必要数量.<p>
	 *
	 */
	public void alt_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 65, $alt_fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. considering alternatives 代替を考慮した固定必要数量.<p>
	 *
	 */
	public void alt_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 65, $alt_fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. considering alternatives 代替を考慮した固定必要数量.<p>
	 *
	 */
	public void alt_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 65, $alt_fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. considering alternatives 代替を考慮した固定必要数量.<p>
	 *
	 */
	public void alt_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 65, $alt_fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. considering alternatives 代替を考慮した固定必要数量.<p>
	 *
	 */
	public void alt_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 65, $alt_fxd_rqmt_qty, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 66, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 66, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 66, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 66, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 66, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 66, $div_seq, value);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 67, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 67, $mfg_sts_typ, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 68, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 68, $prov_typ, value);
	}


	/**
	 * Specify alternative item 代替品目指定.<p>
	 *
	 */
	public boolean alt_itm_fix_flg() {
		return getConstBoolean(offset + 69, $alt_itm_fix_flg);
	}

	/**
	 * Specify alternative item 代替品目指定.<p>
	 *
	 */
	public void alt_itm_fix_flg(boolean value) {
		setConstBoolean(offset + 69, $alt_itm_fix_flg, value);
	}


	public String getString(String name) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
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
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($max_sts_typ.equalsIgnoreCase(name)) {
			return max_sts_typ();
		}
		if ($min_sts_typ.equalsIgnoreCase(name)) {
			return min_sts_typ();
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_rqmt_qty();
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_qty();
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			return recalc_grp();
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			return recalc_grp_seq();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			return chd_inpt_qty();
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			return chd_rqmt_qty();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($sum_inpt_qty.equalsIgnoreCase(name)) {
			return sum_inpt_qty();
		}
		if ($sum_rqmt_qty.equalsIgnoreCase(name)) {
			return sum_rqmt_qty();
		}
		if ($sum_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return sum_fxd_rqmt_qty();
		}
		if ($sum_cont_inpt_qty.equalsIgnoreCase(name)) {
			return sum_cont_inpt_qty();
		}
		if ($sum_cont_rqmt_qty.equalsIgnoreCase(name)) {
			return sum_cont_rqmt_qty();
		}
		if ($sum_cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return sum_cont_fxd_rqmt_qty();
		}
		if ($sum_inpt_rem_qty.equalsIgnoreCase(name)) {
			return sum_inpt_rem_qty();
		}
		if ($sum_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return sum_rqmt_rem_qty();
		}
		if ($sum_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return sum_fxd_rqmt_rem_qty();
		}
		if ($sum_cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			return sum_cont_inpt_rem_qty();
		}
		if ($sum_cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return sum_cont_rqmt_rem_qty();
		}
		if ($sum_cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return sum_cont_fxd_rqmt_rem_qty();
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			return alt_inpt_qty();
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			return alt_rqmt_qty();
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return alt_fxd_rqmt_qty();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($schd_tm.equalsIgnoreCase(name)) {
			return schd_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
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
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			return alt_itm_fix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
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
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($max_sts_typ.equalsIgnoreCase(name)) {
			return max_sts_typ();
		}
		if ($min_sts_typ.equalsIgnoreCase(name)) {
			return min_sts_typ();
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_rqmt_qty();
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_qty();
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			return recalc_grp();
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			return recalc_grp_seq();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			return chd_inpt_qty();
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			return chd_rqmt_qty();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($sum_inpt_qty.equalsIgnoreCase(name)) {
			return sum_inpt_qty();
		}
		if ($sum_rqmt_qty.equalsIgnoreCase(name)) {
			return sum_rqmt_qty();
		}
		if ($sum_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return sum_fxd_rqmt_qty();
		}
		if ($sum_cont_inpt_qty.equalsIgnoreCase(name)) {
			return sum_cont_inpt_qty();
		}
		if ($sum_cont_rqmt_qty.equalsIgnoreCase(name)) {
			return sum_cont_rqmt_qty();
		}
		if ($sum_cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return sum_cont_fxd_rqmt_qty();
		}
		if ($sum_inpt_rem_qty.equalsIgnoreCase(name)) {
			return sum_inpt_rem_qty();
		}
		if ($sum_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return sum_rqmt_rem_qty();
		}
		if ($sum_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return sum_fxd_rqmt_rem_qty();
		}
		if ($sum_cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			return sum_cont_inpt_rem_qty();
		}
		if ($sum_cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return sum_cont_rqmt_rem_qty();
		}
		if ($sum_cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return sum_cont_fxd_rqmt_rem_qty();
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			return alt_inpt_qty();
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			return alt_rqmt_qty();
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return alt_fxd_rqmt_qty();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($schd_tm.equalsIgnoreCase(name)) {
			return schd_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
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
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			return alt_itm_fix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
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
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			inpt_ctl_typ(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($max_sts_typ.equalsIgnoreCase(name)) {
			max_sts_typ(value);
			return;
		}
		if ($min_sts_typ.equalsIgnoreCase(name)) {
			min_sts_typ(value);
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
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
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
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
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
		if ($sum_inpt_qty.equalsIgnoreCase(name)) {
			sum_inpt_qty(value);
			return;
		}
		if ($sum_rqmt_qty.equalsIgnoreCase(name)) {
			sum_rqmt_qty(value);
			return;
		}
		if ($sum_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			sum_fxd_rqmt_qty(value);
			return;
		}
		if ($sum_cont_inpt_qty.equalsIgnoreCase(name)) {
			sum_cont_inpt_qty(value);
			return;
		}
		if ($sum_cont_rqmt_qty.equalsIgnoreCase(name)) {
			sum_cont_rqmt_qty(value);
			return;
		}
		if ($sum_cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			sum_cont_fxd_rqmt_qty(value);
			return;
		}
		if ($sum_inpt_rem_qty.equalsIgnoreCase(name)) {
			sum_inpt_rem_qty(value);
			return;
		}
		if ($sum_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_rqmt_rem_qty(value);
			return;
		}
		if ($sum_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($sum_cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_inpt_rem_qty(value);
			return;
		}
		if ($sum_cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_rqmt_rem_qty(value);
			return;
		}
		if ($sum_cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			alt_inpt_qty(value);
			return;
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			alt_rqmt_qty(value);
			return;
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			alt_fxd_rqmt_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
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
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
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
		if ($sum_inpt_qty.equalsIgnoreCase(name)) {
			sum_inpt_qty(value);
			return;
		}
		if ($sum_rqmt_qty.equalsIgnoreCase(name)) {
			sum_rqmt_qty(value);
			return;
		}
		if ($sum_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			sum_fxd_rqmt_qty(value);
			return;
		}
		if ($sum_cont_inpt_qty.equalsIgnoreCase(name)) {
			sum_cont_inpt_qty(value);
			return;
		}
		if ($sum_cont_rqmt_qty.equalsIgnoreCase(name)) {
			sum_cont_rqmt_qty(value);
			return;
		}
		if ($sum_cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			sum_cont_fxd_rqmt_qty(value);
			return;
		}
		if ($sum_inpt_rem_qty.equalsIgnoreCase(name)) {
			sum_inpt_rem_qty(value);
			return;
		}
		if ($sum_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_rqmt_rem_qty(value);
			return;
		}
		if ($sum_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($sum_cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_inpt_rem_qty(value);
			return;
		}
		if ($sum_cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_rqmt_rem_qty(value);
			return;
		}
		if ($sum_cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			alt_inpt_qty(value);
			return;
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			alt_rqmt_qty(value);
			return;
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			alt_fxd_rqmt_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
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
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
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
		if ($sum_inpt_qty.equalsIgnoreCase(name)) {
			sum_inpt_qty(value);
			return;
		}
		if ($sum_rqmt_qty.equalsIgnoreCase(name)) {
			sum_rqmt_qty(value);
			return;
		}
		if ($sum_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			sum_fxd_rqmt_qty(value);
			return;
		}
		if ($sum_cont_inpt_qty.equalsIgnoreCase(name)) {
			sum_cont_inpt_qty(value);
			return;
		}
		if ($sum_cont_rqmt_qty.equalsIgnoreCase(name)) {
			sum_cont_rqmt_qty(value);
			return;
		}
		if ($sum_cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			sum_cont_fxd_rqmt_qty(value);
			return;
		}
		if ($sum_inpt_rem_qty.equalsIgnoreCase(name)) {
			sum_inpt_rem_qty(value);
			return;
		}
		if ($sum_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_rqmt_rem_qty(value);
			return;
		}
		if ($sum_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($sum_cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_inpt_rem_qty(value);
			return;
		}
		if ($sum_cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_rqmt_rem_qty(value);
			return;
		}
		if ($sum_cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			alt_inpt_qty(value);
			return;
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			alt_rqmt_qty(value);
			return;
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			alt_fxd_rqmt_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
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
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
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
		if ($sum_inpt_qty.equalsIgnoreCase(name)) {
			sum_inpt_qty(value);
			return;
		}
		if ($sum_rqmt_qty.equalsIgnoreCase(name)) {
			sum_rqmt_qty(value);
			return;
		}
		if ($sum_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			sum_fxd_rqmt_qty(value);
			return;
		}
		if ($sum_cont_inpt_qty.equalsIgnoreCase(name)) {
			sum_cont_inpt_qty(value);
			return;
		}
		if ($sum_cont_rqmt_qty.equalsIgnoreCase(name)) {
			sum_cont_rqmt_qty(value);
			return;
		}
		if ($sum_cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			sum_cont_fxd_rqmt_qty(value);
			return;
		}
		if ($sum_inpt_rem_qty.equalsIgnoreCase(name)) {
			sum_inpt_rem_qty(value);
			return;
		}
		if ($sum_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_rqmt_rem_qty(value);
			return;
		}
		if ($sum_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($sum_cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_inpt_rem_qty(value);
			return;
		}
		if ($sum_cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_rqmt_rem_qty(value);
			return;
		}
		if ($sum_cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			alt_inpt_qty(value);
			return;
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			alt_rqmt_qty(value);
			return;
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			alt_fxd_rqmt_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
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
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
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
		if ($sum_inpt_qty.equalsIgnoreCase(name)) {
			sum_inpt_qty(value);
			return;
		}
		if ($sum_rqmt_qty.equalsIgnoreCase(name)) {
			sum_rqmt_qty(value);
			return;
		}
		if ($sum_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			sum_fxd_rqmt_qty(value);
			return;
		}
		if ($sum_cont_inpt_qty.equalsIgnoreCase(name)) {
			sum_cont_inpt_qty(value);
			return;
		}
		if ($sum_cont_rqmt_qty.equalsIgnoreCase(name)) {
			sum_cont_rqmt_qty(value);
			return;
		}
		if ($sum_cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			sum_cont_fxd_rqmt_qty(value);
			return;
		}
		if ($sum_inpt_rem_qty.equalsIgnoreCase(name)) {
			sum_inpt_rem_qty(value);
			return;
		}
		if ($sum_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_rqmt_rem_qty(value);
			return;
		}
		if ($sum_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($sum_cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_inpt_rem_qty(value);
			return;
		}
		if ($sum_cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_rqmt_rem_qty(value);
			return;
		}
		if ($sum_cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			alt_inpt_qty(value);
			return;
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			alt_rqmt_qty(value);
			return;
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			alt_fxd_rqmt_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($schd_tm.equalsIgnoreCase(name)) {
			schd_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
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
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			alt_itm_fix_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
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
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			inpt_ctl_typ(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($max_sts_typ.equalsIgnoreCase(name)) {
			max_sts_typ(value);
			return;
		}
		if ($min_sts_typ.equalsIgnoreCase(name)) {
			min_sts_typ(value);
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
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
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
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
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
		if ($sum_inpt_qty.equalsIgnoreCase(name)) {
			sum_inpt_qty(value);
			return;
		}
		if ($sum_rqmt_qty.equalsIgnoreCase(name)) {
			sum_rqmt_qty(value);
			return;
		}
		if ($sum_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			sum_fxd_rqmt_qty(value);
			return;
		}
		if ($sum_cont_inpt_qty.equalsIgnoreCase(name)) {
			sum_cont_inpt_qty(value);
			return;
		}
		if ($sum_cont_rqmt_qty.equalsIgnoreCase(name)) {
			sum_cont_rqmt_qty(value);
			return;
		}
		if ($sum_cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			sum_cont_fxd_rqmt_qty(value);
			return;
		}
		if ($sum_inpt_rem_qty.equalsIgnoreCase(name)) {
			sum_inpt_rem_qty(value);
			return;
		}
		if ($sum_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_rqmt_rem_qty(value);
			return;
		}
		if ($sum_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($sum_cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_inpt_rem_qty(value);
			return;
		}
		if ($sum_cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_rqmt_rem_qty(value);
			return;
		}
		if ($sum_cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			alt_inpt_qty(value);
			return;
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			alt_rqmt_qty(value);
			return;
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			alt_fxd_rqmt_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
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
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
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
		if ($sum_inpt_qty.equalsIgnoreCase(name)) {
			sum_inpt_qty(value);
			return;
		}
		if ($sum_rqmt_qty.equalsIgnoreCase(name)) {
			sum_rqmt_qty(value);
			return;
		}
		if ($sum_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			sum_fxd_rqmt_qty(value);
			return;
		}
		if ($sum_cont_inpt_qty.equalsIgnoreCase(name)) {
			sum_cont_inpt_qty(value);
			return;
		}
		if ($sum_cont_rqmt_qty.equalsIgnoreCase(name)) {
			sum_cont_rqmt_qty(value);
			return;
		}
		if ($sum_cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			sum_cont_fxd_rqmt_qty(value);
			return;
		}
		if ($sum_inpt_rem_qty.equalsIgnoreCase(name)) {
			sum_inpt_rem_qty(value);
			return;
		}
		if ($sum_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_rqmt_rem_qty(value);
			return;
		}
		if ($sum_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($sum_cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_inpt_rem_qty(value);
			return;
		}
		if ($sum_cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_rqmt_rem_qty(value);
			return;
		}
		if ($sum_cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			alt_inpt_qty(value);
			return;
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			alt_rqmt_qty(value);
			return;
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			alt_fxd_rqmt_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
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
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
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
		if ($sum_inpt_qty.equalsIgnoreCase(name)) {
			sum_inpt_qty(value);
			return;
		}
		if ($sum_rqmt_qty.equalsIgnoreCase(name)) {
			sum_rqmt_qty(value);
			return;
		}
		if ($sum_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			sum_fxd_rqmt_qty(value);
			return;
		}
		if ($sum_cont_inpt_qty.equalsIgnoreCase(name)) {
			sum_cont_inpt_qty(value);
			return;
		}
		if ($sum_cont_rqmt_qty.equalsIgnoreCase(name)) {
			sum_cont_rqmt_qty(value);
			return;
		}
		if ($sum_cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			sum_cont_fxd_rqmt_qty(value);
			return;
		}
		if ($sum_inpt_rem_qty.equalsIgnoreCase(name)) {
			sum_inpt_rem_qty(value);
			return;
		}
		if ($sum_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_rqmt_rem_qty(value);
			return;
		}
		if ($sum_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($sum_cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_inpt_rem_qty(value);
			return;
		}
		if ($sum_cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_rqmt_rem_qty(value);
			return;
		}
		if ($sum_cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			alt_inpt_qty(value);
			return;
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			alt_rqmt_qty(value);
			return;
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			alt_fxd_rqmt_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
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
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
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
		if ($sum_inpt_qty.equalsIgnoreCase(name)) {
			sum_inpt_qty(value);
			return;
		}
		if ($sum_rqmt_qty.equalsIgnoreCase(name)) {
			sum_rqmt_qty(value);
			return;
		}
		if ($sum_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			sum_fxd_rqmt_qty(value);
			return;
		}
		if ($sum_cont_inpt_qty.equalsIgnoreCase(name)) {
			sum_cont_inpt_qty(value);
			return;
		}
		if ($sum_cont_rqmt_qty.equalsIgnoreCase(name)) {
			sum_cont_rqmt_qty(value);
			return;
		}
		if ($sum_cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			sum_cont_fxd_rqmt_qty(value);
			return;
		}
		if ($sum_inpt_rem_qty.equalsIgnoreCase(name)) {
			sum_inpt_rem_qty(value);
			return;
		}
		if ($sum_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_rqmt_rem_qty(value);
			return;
		}
		if ($sum_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($sum_cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_inpt_rem_qty(value);
			return;
		}
		if ($sum_cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_rqmt_rem_qty(value);
			return;
		}
		if ($sum_cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			alt_inpt_qty(value);
			return;
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			alt_rqmt_qty(value);
			return;
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			alt_fxd_rqmt_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
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
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
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
		if ($sum_inpt_qty.equalsIgnoreCase(name)) {
			sum_inpt_qty(value);
			return;
		}
		if ($sum_rqmt_qty.equalsIgnoreCase(name)) {
			sum_rqmt_qty(value);
			return;
		}
		if ($sum_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			sum_fxd_rqmt_qty(value);
			return;
		}
		if ($sum_cont_inpt_qty.equalsIgnoreCase(name)) {
			sum_cont_inpt_qty(value);
			return;
		}
		if ($sum_cont_rqmt_qty.equalsIgnoreCase(name)) {
			sum_cont_rqmt_qty(value);
			return;
		}
		if ($sum_cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			sum_cont_fxd_rqmt_qty(value);
			return;
		}
		if ($sum_inpt_rem_qty.equalsIgnoreCase(name)) {
			sum_inpt_rem_qty(value);
			return;
		}
		if ($sum_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_rqmt_rem_qty(value);
			return;
		}
		if ($sum_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($sum_cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_inpt_rem_qty(value);
			return;
		}
		if ($sum_cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_rqmt_rem_qty(value);
			return;
		}
		if ($sum_cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			sum_cont_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			alt_inpt_qty(value);
			return;
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			alt_rqmt_qty(value);
			return;
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			alt_fxd_rqmt_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($schd_tm.equalsIgnoreCase(name)) {
			schd_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
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
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			alt_itm_fix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

