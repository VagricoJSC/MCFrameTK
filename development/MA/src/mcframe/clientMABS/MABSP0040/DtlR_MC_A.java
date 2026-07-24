package mcframe.clientMABS.MABSP0040;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	public static final String $hrrchy_p = "hrrchy_p";
	/**
	 * Bottom 最下位.<p>
	 *
	 */
	public static final String $bottom_flg = "bottom_flg";
	public static final String $itm_p = "itm_p";
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
	 * By-product 副産品.<p>
	 *
	 */
	public static final String $byprod_flg = "byprod_flg";
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
	 * For active ingredient flg. 有効成分対象ＦＬＧ.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	public static final String $ver_no_p = "ver_no_p";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
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
	 * Phantom 架空.<p>
	 *
	 */
	public static final String $ph_flg = "ph_flg";
	/**
	 * Phantom BOM pattern 架空構成パタン.<p>
	 *
	 */
	public static final String $ph_bom_ptn = "ph_bom_ptn";
	/**
	 * Alternative item 代替品目.<p>
	 *
	 */
	public static final String $alt_itm_flg = "alt_itm_flg";
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
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public static final String $alt_itm_ratio = "alt_itm_ratio";
	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public static final String $alt_alloc_prio = "alt_alloc_prio";
	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public static final String $sno_typ1 = "sno_typ1";
	/**
	 * SEIBAN No. 1 type name 手配ＮＯ１区分名.<p>
	 *
	 */
	public static final String $sno_typ_nm1 = "sno_typ_nm1";
	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public static final String $sno_typ2 = "sno_typ2";
	/**
	 * SEIBAN No. 2 type name 手配ＮＯ２区分名.<p>
	 *
	 */
	public static final String $sno_typ_nm2 = "sno_typ_nm2";
	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public static final String $sno_typ3 = "sno_typ3";
	/**
	 * SEIBAN No. 3 type name 手配ＮＯ３区分名.<p>
	 *
	 */
	public static final String $sno_typ_nm3 = "sno_typ_nm3";
	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public static final String $sno_typ4 = "sno_typ4";
	/**
	 * SEIBAN No. 4 type name 手配ＮＯ４区分名.<p>
	 *
	 */
	public static final String $sno_typ_nm4 = "sno_typ_nm4";
	public static final String $min_sno_p = "min_sno_p";
	public static final String $max_sno_p = "max_sno_p";
	public static final String $dt_p = "dt_p";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $chd_unit_cd = "chd_unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $chd_unit_nm = "chd_unit_nm";
	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public static final String $chd_dec_place = "chd_dec_place";
	public static final String $qty6_p = "qty6_p";
	public static final String $qty5_p = "qty5_p";
	public static final String $qty1_p = "qty1_p";
	public static final String $qty3_p = "qty3_p";
	public static final String $qty2_p = "qty2_p";
	public static final String $qty4_p = "qty4_p";
	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public static final String $in_offst_typ = "in_offst_typ";
	/**
	 * Input offset type name 投入オフセット区分名.<p>
	 *
	 */
	public static final String $in_offst_typ_nm = "in_offst_typ_nm";
	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public static final String $in_offst = "in_offst";
	/**
	 * Backflush type バックフラッシュ区分.<p>
	 *
	 */
	public static final String $bkf_typ = "bkf_typ";
	/**
	 * Backflush type name バックフラッシュ区分名.<p>
	 *
	 */
	public static final String $bkf_typ_nm = "bkf_typ_nm";
	/**
	 * Require lot 指図時ロット指定.<p>
	 *
	 */
	public static final String $inst_lot_fix_flg = "inst_lot_fix_flg";
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
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public static final String $alloc_ctl_typ = "alloc_ctl_typ";
	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public static final String $alloc_ctl_typ_nm = "alloc_ctl_typ_nm";
	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public static final String $main_itm_flg = "main_itm_flg";
	/**
	 * For yield calculation 収率計算用.<p>
	 *
	 */
	public static final String $yield_calc_flg = "yield_calc_flg";
	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public static final String $inpt_ctl_typ = "inpt_ctl_typ";
	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public static final String $inpt_ctl_typ_nm = "inpt_ctl_typ_nm";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public static final String $chng_no = "chng_no";
	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public static final String $ext_sys_no_bom = "ext_sys_no_bom";
	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public static final String $not_cost_flg = "not_cost_flg";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";

	public static final String $hrrchy = $hrrchy_p + ".hrrchy";
	public static final String $ext = $hrrchy_p + ".ext";
	public static final String $extno = $hrrchy_p + ".extno";
	public static final String $par_extno = $hrrchy_p + ".par_extno";
	public static final String $loop_flg = $hrrchy_p + ".loop_flg";
	public static final String $leaf = $hrrchy_p + ".leaf";
	public static final String $leaf_str = $hrrchy_p + ".leaf_str";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $min_sno1 = $min_sno_p + ".sno1";
	public static final String $min_sno2 = $min_sno_p + ".sno2";
	public static final String $min_sno3 = $min_sno_p + ".sno3";
	public static final String $min_sno4 = $min_sno_p + ".sno4";
	public static final String $max_sno1 = $max_sno_p + ".sno1";
	public static final String $max_sno2 = $max_sno_p + ".sno2";
	public static final String $max_sno3 = $max_sno_p + ".sno3";
	public static final String $max_sno4 = $max_sno_p + ".sno4";
	public static final String $st_dt = $dt_p + ".st_dt";
	public static final String $end_dt = $dt_p + ".end_dt";
	public static final String $conv_inpt_qty = $qty6_p + ".qty";
	public static final String $conv_rqmt_qty = $qty5_p + ".qty";
	public static final String $par_inst_qty = $qty1_p + ".qty";
	public static final String $chd_inpt_qty = $qty3_p + ".qty";
	public static final String $chd_rqmt_qty = $qty2_p + ".qty";
	public static final String $fxd_chd_rqmt_qty = $qty4_p + ".qty";

	public static final MCMeta hrrchy_p_META = createInnerRowMeta($hrrchy_p, mcframe.clientMAUB.MAUBP5210.HrrchyR.class);
	public static final MCMeta bottom_flg_META = createCommonMeta($bottom_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta byprod_flg_META = createCommonMeta($byprod_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta ph_flg_META = createCommonMeta($ph_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ph_bom_ptn_META = createCommonMeta($ph_bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta alt_itm_flg_META = createCommonMeta($alt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_nm_META = createCommonMeta($alt_grp_nm, mcframe.commonMA.meta.MA_META.ALT_GRP_NM);
	public static final MCMeta alt_itm_typ_META = createCommonMeta($alt_itm_typ, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP);
	public static final MCMeta alt_itm_typ_nm_META = createCommonMeta($alt_itm_typ_nm, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP_NM);
	public static final MCMeta alt_itm_ratio_META = createCommonMeta($alt_itm_ratio, mcframe.commonMA.meta.MA_META.ALT_ITM_RATIO);
	public static final MCMeta alt_alloc_prio_META = createCommonMeta($alt_alloc_prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sno_typ1_META = createCommonMeta($sno_typ1, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta sno_typ_nm1_META = createCommonMeta($sno_typ_nm1, mcframe.commonMA.meta.MA_META.SNO_TYP_NM);
	public static final MCMeta sno_typ2_META = createCommonMeta($sno_typ2, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta sno_typ_nm2_META = createCommonMeta($sno_typ_nm2, mcframe.commonMA.meta.MA_META.SNO_TYP_NM);
	public static final MCMeta sno_typ3_META = createCommonMeta($sno_typ3, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta sno_typ_nm3_META = createCommonMeta($sno_typ_nm3, mcframe.commonMA.meta.MA_META.SNO_TYP_NM);
	public static final MCMeta sno_typ4_META = createCommonMeta($sno_typ4, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta sno_typ_nm4_META = createCommonMeta($sno_typ_nm4, mcframe.commonMA.meta.MA_META.SNO_TYP_NM);
	public static final MCMeta min_sno_p_META = createInnerRowMeta($min_sno_p, mcframe.clientMAUB.MAUBP5070.SnoR.class);
	public static final MCMeta max_sno_p_META = createInnerRowMeta($max_sno_p, mcframe.clientMAUB.MAUBP5070.SnoR.class);
	public static final MCMeta dt_p_META = createInnerRowMeta($dt_p, mcframe.clientMAUB.MAUBP5010.DtR.class);
	public static final MCMeta chd_unit_cd_META = createCommonMeta($chd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta chd_unit_nm_META = createCommonMeta($chd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta chd_dec_place_META = createCommonMeta($chd_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta qty6_p_META = createInnerRowMeta($qty6_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty5_p_META = createInnerRowMeta($qty5_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty1_p_META = createInnerRowMeta($qty1_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty3_p_META = createInnerRowMeta($qty3_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty2_p_META = createInnerRowMeta($qty2_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty4_p_META = createInnerRowMeta($qty4_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta in_offst_typ_META = createCommonMeta($in_offst_typ, mcframe.commonMA.meta.MA_META.OFFST_TYP);
	public static final MCMeta in_offst_typ_nm_META = createCommonMeta($in_offst_typ_nm, mcframe.commonMA.meta.MA_META.OFFST_TYP_NM);
	public static final MCMeta in_offst_META = createCommonMeta($in_offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta bkf_typ_META = createCommonMeta($bkf_typ, mcframe.commonMA.meta.MA_META.BKF_TYP);
	public static final MCMeta bkf_typ_nm_META = createCommonMeta($bkf_typ_nm, mcframe.commonMA.meta.MA_META.BKF_TYP_NM);
	public static final MCMeta inst_lot_fix_flg_META = createCommonMeta($inst_lot_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_mix_flg_META = createCommonMeta($lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_mix_flg_META = createCommonMeta($sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_ctl_typ_META = createCommonMeta($alloc_ctl_typ, mcframe.commonMA.meta.MA_META.ALLOC_CTL_TYP);
	public static final MCMeta alloc_ctl_typ_nm_META = createCommonMeta($alloc_ctl_typ_nm, mcframe.commonMA.meta.MA_META.ALLOC_CTL_TYP_NM);
	public static final MCMeta main_itm_flg_META = createCommonMeta($main_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yield_calc_flg_META = createCommonMeta($yield_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_ctl_typ_META = createCommonMeta($inpt_ctl_typ, mcframe.commonMA.meta.MA_META.INPT_CTL_TYP);
	public static final MCMeta inpt_ctl_typ_nm_META = createCommonMeta($inpt_ctl_typ_nm, mcframe.commonMA.meta.MA_META.INPT_CTL_TYP_NM);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta chng_no_META = createCommonMeta($chng_no, mcframe.commonMA.meta.MA_META.CHNG_NO);
	public static final MCMeta ext_sys_no_bom_META = createCommonMeta($ext_sys_no_bom, mcframe.commonMA.meta.MA_META.EXT_SYS_NO_BOM);
	public static final MCMeta not_cost_flg_META = createCommonMeta($not_cost_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hrrchy_p_META,
			bottom_flg_META,
			itm_p_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			byprod_flg_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			cont_fctr_flg_META,
			stk_mng_typ_META,
			unit_cd_META,
			dec_place_META,
			ver_no_p_META,
			bom_ptn_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			ph_flg_META,
			ph_bom_ptn_META,
			alt_itm_flg_META,
			alt_grp_cd_META,
			alt_grp_nm_META,
			alt_itm_typ_META,
			alt_itm_typ_nm_META,
			alt_itm_ratio_META,
			alt_alloc_prio_META,
			sno_typ1_META,
			sno_typ_nm1_META,
			sno_typ2_META,
			sno_typ_nm2_META,
			sno_typ3_META,
			sno_typ_nm3_META,
			sno_typ4_META,
			sno_typ_nm4_META,
			min_sno_p_META,
			max_sno_p_META,
			dt_p_META,
			chd_unit_cd_META,
			chd_unit_nm_META,
			chd_dec_place_META,
			qty6_p_META,
			qty5_p_META,
			qty1_p_META,
			qty3_p_META,
			qty2_p_META,
			qty4_p_META,
			in_offst_typ_META,
			in_offst_typ_nm_META,
			in_offst_META,
			bkf_typ_META,
			bkf_typ_nm_META,
			inst_lot_fix_flg_META,
			lot_mix_flg_META,
			sublot_mix_flg_META,
			alloc_ctl_typ_META,
			alloc_ctl_typ_nm_META,
			main_itm_flg_META,
			yield_calc_flg_META,
			inpt_ctl_typ_META,
			inpt_ctl_typ_nm_META,
			disp_seq_META,
			chng_no_META,
			ext_sys_no_bom_META,
			not_cost_flg_META,
			wg_cd_META,
			wg_nm_META
		},
		new String[][]{
			{
				"hrrchy",
				"ext",
				"extno",
				"par_extno",
				"loop_flg",
				"leaf",
				"leaf_str",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"ver_no",
				"min_sno1",
				"min_sno2",
				"min_sno3",
				"min_sno4",
				"max_sno1",
				"max_sno2",
				"max_sno3",
				"max_sno4",
				"st_dt",
				"end_dt",
				"conv_inpt_qty",
				"conv_rqmt_qty",
				"par_inst_qty",
				"chd_inpt_qty",
				"chd_rqmt_qty",
				"fxd_chd_rqmt_qty"
			},
			{
				$hrrchy,
				$ext,
				$extno,
				$par_extno,
				$loop_flg,
				$leaf,
				$leaf_str,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$ver_no,
				$min_sno1,
				$min_sno2,
				$min_sno3,
				$min_sno4,
				$max_sno1,
				$max_sno2,
				$max_sno3,
				$max_sno4,
				$st_dt,
				$end_dt,
				$conv_inpt_qty,
				$conv_rqmt_qty,
				$par_inst_qty,
				$chd_inpt_qty,
				$chd_rqmt_qty,
				$fxd_chd_rqmt_qty
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
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$sno_typ1, "SNO1"},	// sno_typ1
				{$sno_typ_nm1, "SNO1"},	// sno_typ_nm1
				{$sno_typ2, "SNO2"},	// sno_typ2
				{$sno_typ_nm2, "SNO2"},	// sno_typ_nm2
				{$sno_typ3, "SNO3"},	// sno_typ3
				{$sno_typ_nm3, "SNO3"},	// sno_typ_nm3
				{$sno_typ4, "SNO4"},	// sno_typ4
				{$sno_typ_nm4, "SNO4"},	// sno_typ_nm4
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP5210.HrrchyR hrrchy_p(){
		return (mcframe.clientMAUB.MAUBP5210.HrrchyR) getConstInnerRow(offset + 0, $hrrchy_p);
	}
	
	public void hrrchy_p(mcframe.clientMAUB.MAUBP5210.HrrchyR row){
		setConstInnerRow(offset + 0, $hrrchy_p, row);
	}


	/**
	 * Bottom 最下位.<p>
	 *
	 */
	public boolean bottom_flg() {
		return getConstBoolean(offset + 1, $bottom_flg);
	}

	/**
	 * Bottom 最下位.<p>
	 *
	 */
	public void bottom_flg(boolean value) {
		setConstBoolean(offset + 1, $bottom_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 2, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 2, $itm_p, row);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 3, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 3, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 4, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 4, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 5, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 5, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 6, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 6, $itm_typ_d_nm, value);
	}


	/**
	 * By-product 副産品.<p>
	 *
	 */
	public boolean byprod_flg() {
		return getConstBoolean(offset + 7, $byprod_flg);
	}

	/**
	 * By-product 副産品.<p>
	 *
	 */
	public void byprod_flg(boolean value) {
		setConstBoolean(offset + 7, $byprod_flg, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 8, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 8, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 9, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 9, $sublot_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 10, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 10, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 11, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 11, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 12, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 12, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 13, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 13, $sno4_mng_typ, value);
	}


	/**
	 * For active ingredient flg. 有効成分対象ＦＬＧ.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 14, $cont_fctr_flg);
	}

	/**
	 * For active ingredient flg. 有効成分対象ＦＬＧ.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 14, $cont_fctr_flg, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 15, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 15, $stk_mng_typ, value);
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
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 17, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 17, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 17, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 17, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 17, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 17, $dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 18, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 18, $ver_no_p, row);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 19, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 19, $bom_ptn, value);
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
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 21, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 21, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 22, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 22, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 22, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 22, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 22, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 22, $oper_seq, value);
	}


	/**
	 * Phantom 架空.<p>
	 *
	 */
	public boolean ph_flg() {
		return getConstBoolean(offset + 23, $ph_flg);
	}

	/**
	 * Phantom 架空.<p>
	 *
	 */
	public void ph_flg(boolean value) {
		setConstBoolean(offset + 23, $ph_flg, value);
	}


	/**
	 * Phantom BOM pattern 架空構成パタン.<p>
	 *
	 */
	public String ph_bom_ptn() {
		return getConstString(offset + 24, $ph_bom_ptn);
	}

	/**
	 * Phantom BOM pattern 架空構成パタン.<p>
	 *
	 */
	public void ph_bom_ptn(String value) {
		setConstString(offset + 24, $ph_bom_ptn, value);
	}


	/**
	 * Alternative item 代替品目.<p>
	 *
	 */
	public boolean alt_itm_flg() {
		return getConstBoolean(offset + 25, $alt_itm_flg);
	}

	/**
	 * Alternative item 代替品目.<p>
	 *
	 */
	public void alt_itm_flg(boolean value) {
		setConstBoolean(offset + 25, $alt_itm_flg, value);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 26, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 26, $alt_grp_cd, value);
	}


	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public String alt_grp_nm() {
		return getConstString(offset + 27, $alt_grp_nm);
	}

	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public void alt_grp_nm(String value) {
		setConstString(offset + 27, $alt_grp_nm, value);
	}


	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public String alt_itm_typ() {
		return getConstString(offset + 28, $alt_itm_typ);
	}

	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public void alt_itm_typ(String value) {
		setConstString(offset + 28, $alt_itm_typ, value);
	}


	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public String alt_itm_typ_nm() {
		return getConstString(offset + 29, $alt_itm_typ_nm);
	}

	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public void alt_itm_typ_nm(String value) {
		setConstString(offset + 29, $alt_itm_typ_nm, value);
	}


	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCNumber alt_itm_ratio() {
		return getConstNumber(offset + 30, $alt_itm_ratio);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(MCNumber value) {
		setConstNumber(offset + 30, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(int value) {
		setConstNumber(offset + 30, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(long value) {
		setConstNumber(offset + 30, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(float value) {
		setConstNumber(offset + 30, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(double value) {
		setConstNumber(offset + 30, $alt_itm_ratio, value);
	}


	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public MCNumber alt_alloc_prio() {
		return getConstNumber(offset + 31, $alt_alloc_prio);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(MCNumber value) {
		setConstNumber(offset + 31, $alt_alloc_prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(int value) {
		setConstNumber(offset + 31, $alt_alloc_prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(long value) {
		setConstNumber(offset + 31, $alt_alloc_prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(float value) {
		setConstNumber(offset + 31, $alt_alloc_prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(double value) {
		setConstNumber(offset + 31, $alt_alloc_prio, value);
	}


	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public String sno_typ1() {
		return getConstString(offset + 32, $sno_typ1);
	}

	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public void sno_typ1(String value) {
		setConstString(offset + 32, $sno_typ1, value);
	}


	/**
	 * SEIBAN No. 1 type name 手配ＮＯ１区分名.<p>
	 *
	 */
	public String sno_typ_nm1() {
		return getConstString(offset + 33, $sno_typ_nm1);
	}

	/**
	 * SEIBAN No. 1 type name 手配ＮＯ１区分名.<p>
	 *
	 */
	public void sno_typ_nm1(String value) {
		setConstString(offset + 33, $sno_typ_nm1, value);
	}


	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public String sno_typ2() {
		return getConstString(offset + 34, $sno_typ2);
	}

	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public void sno_typ2(String value) {
		setConstString(offset + 34, $sno_typ2, value);
	}


	/**
	 * SEIBAN No. 2 type name 手配ＮＯ２区分名.<p>
	 *
	 */
	public String sno_typ_nm2() {
		return getConstString(offset + 35, $sno_typ_nm2);
	}

	/**
	 * SEIBAN No. 2 type name 手配ＮＯ２区分名.<p>
	 *
	 */
	public void sno_typ_nm2(String value) {
		setConstString(offset + 35, $sno_typ_nm2, value);
	}


	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public String sno_typ3() {
		return getConstString(offset + 36, $sno_typ3);
	}

	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public void sno_typ3(String value) {
		setConstString(offset + 36, $sno_typ3, value);
	}


	/**
	 * SEIBAN No. 3 type name 手配ＮＯ３区分名.<p>
	 *
	 */
	public String sno_typ_nm3() {
		return getConstString(offset + 37, $sno_typ_nm3);
	}

	/**
	 * SEIBAN No. 3 type name 手配ＮＯ３区分名.<p>
	 *
	 */
	public void sno_typ_nm3(String value) {
		setConstString(offset + 37, $sno_typ_nm3, value);
	}


	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public String sno_typ4() {
		return getConstString(offset + 38, $sno_typ4);
	}

	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public void sno_typ4(String value) {
		setConstString(offset + 38, $sno_typ4, value);
	}


	/**
	 * SEIBAN No. 4 type name 手配ＮＯ４区分名.<p>
	 *
	 */
	public String sno_typ_nm4() {
		return getConstString(offset + 39, $sno_typ_nm4);
	}

	/**
	 * SEIBAN No. 4 type name 手配ＮＯ４区分名.<p>
	 *
	 */
	public void sno_typ_nm4(String value) {
		setConstString(offset + 39, $sno_typ_nm4, value);
	}


	public mcframe.clientMAUB.MAUBP5070.SnoR min_sno_p(){
		return (mcframe.clientMAUB.MAUBP5070.SnoR) getConstInnerRow(offset + 40, $min_sno_p);
	}
	
	public void min_sno_p(mcframe.clientMAUB.MAUBP5070.SnoR row){
		setConstInnerRow(offset + 40, $min_sno_p, row);
	}


	public mcframe.clientMAUB.MAUBP5070.SnoR max_sno_p(){
		return (mcframe.clientMAUB.MAUBP5070.SnoR) getConstInnerRow(offset + 41, $max_sno_p);
	}
	
	public void max_sno_p(mcframe.clientMAUB.MAUBP5070.SnoR row){
		setConstInnerRow(offset + 41, $max_sno_p, row);
	}


	public mcframe.clientMAUB.MAUBP5010.DtR dt_p(){
		return (mcframe.clientMAUB.MAUBP5010.DtR) getConstInnerRow(offset + 42, $dt_p);
	}
	
	public void dt_p(mcframe.clientMAUB.MAUBP5010.DtR row){
		setConstInnerRow(offset + 42, $dt_p, row);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String chd_unit_cd() {
		return getConstString(offset + 43, $chd_unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void chd_unit_cd(String value) {
		setConstString(offset + 43, $chd_unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String chd_unit_nm() {
		return getConstString(offset + 44, $chd_unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void chd_unit_nm(String value) {
		setConstString(offset + 44, $chd_unit_nm, value);
	}


	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public MCNumber chd_dec_place() {
		return getConstNumber(offset + 45, $chd_dec_place);
	}

	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public void chd_dec_place(MCNumber value) {
		setConstNumber(offset + 45, $chd_dec_place, value);
	}

	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public void chd_dec_place(int value) {
		setConstNumber(offset + 45, $chd_dec_place, value);
	}

	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public void chd_dec_place(long value) {
		setConstNumber(offset + 45, $chd_dec_place, value);
	}

	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public void chd_dec_place(float value) {
		setConstNumber(offset + 45, $chd_dec_place, value);
	}

	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public void chd_dec_place(double value) {
		setConstNumber(offset + 45, $chd_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty6_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 46, $qty6_p);
	}
	
	public void qty6_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 46, $qty6_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty5_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 47, $qty5_p);
	}
	
	public void qty5_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 47, $qty5_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty1_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 48, $qty1_p);
	}
	
	public void qty1_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 48, $qty1_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty3_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 49, $qty3_p);
	}
	
	public void qty3_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 49, $qty3_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty2_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 50, $qty2_p);
	}
	
	public void qty2_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 50, $qty2_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty4_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 51, $qty4_p);
	}
	
	public void qty4_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 51, $qty4_p, row);
	}


	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public String in_offst_typ() {
		return getConstString(offset + 52, $in_offst_typ);
	}

	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public void in_offst_typ(String value) {
		setConstString(offset + 52, $in_offst_typ, value);
	}


	/**
	 * Input offset type name 投入オフセット区分名.<p>
	 *
	 */
	public String in_offst_typ_nm() {
		return getConstString(offset + 53, $in_offst_typ_nm);
	}

	/**
	 * Input offset type name 投入オフセット区分名.<p>
	 *
	 */
	public void in_offst_typ_nm(String value) {
		setConstString(offset + 53, $in_offst_typ_nm, value);
	}


	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public MCNumber in_offst() {
		return getConstNumber(offset + 54, $in_offst);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(MCNumber value) {
		setConstNumber(offset + 54, $in_offst, value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(int value) {
		setConstNumber(offset + 54, $in_offst, value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(long value) {
		setConstNumber(offset + 54, $in_offst, value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(float value) {
		setConstNumber(offset + 54, $in_offst, value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(double value) {
		setConstNumber(offset + 54, $in_offst, value);
	}


	/**
	 * Backflush type バックフラッシュ区分.<p>
	 *
	 */
	public String bkf_typ() {
		return getConstString(offset + 55, $bkf_typ);
	}

	/**
	 * Backflush type バックフラッシュ区分.<p>
	 *
	 */
	public void bkf_typ(String value) {
		setConstString(offset + 55, $bkf_typ, value);
	}


	/**
	 * Backflush type name バックフラッシュ区分名.<p>
	 *
	 */
	public String bkf_typ_nm() {
		return getConstString(offset + 56, $bkf_typ_nm);
	}

	/**
	 * Backflush type name バックフラッシュ区分名.<p>
	 *
	 */
	public void bkf_typ_nm(String value) {
		setConstString(offset + 56, $bkf_typ_nm, value);
	}


	/**
	 * Require lot 指図時ロット指定.<p>
	 *
	 */
	public boolean inst_lot_fix_flg() {
		return getConstBoolean(offset + 57, $inst_lot_fix_flg);
	}

	/**
	 * Require lot 指図時ロット指定.<p>
	 *
	 */
	public void inst_lot_fix_flg(boolean value) {
		setConstBoolean(offset + 57, $inst_lot_fix_flg, value);
	}


	/**
	 * Lot mixed ロット混在.<p>
	 *
	 */
	public boolean lot_mix_flg() {
		return getConstBoolean(offset + 58, $lot_mix_flg);
	}

	/**
	 * Lot mixed ロット混在.<p>
	 *
	 */
	public void lot_mix_flg(boolean value) {
		setConstBoolean(offset + 58, $lot_mix_flg, value);
	}


	/**
	 * Sublots mixed サブロット混在.<p>
	 *
	 */
	public boolean sublot_mix_flg() {
		return getConstBoolean(offset + 59, $sublot_mix_flg);
	}

	/**
	 * Sublots mixed サブロット混在.<p>
	 *
	 */
	public void sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 59, $sublot_mix_flg, value);
	}


	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public String alloc_ctl_typ() {
		return getConstString(offset + 60, $alloc_ctl_typ);
	}

	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public void alloc_ctl_typ(String value) {
		setConstString(offset + 60, $alloc_ctl_typ, value);
	}


	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public String alloc_ctl_typ_nm() {
		return getConstString(offset + 61, $alloc_ctl_typ_nm);
	}

	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public void alloc_ctl_typ_nm(String value) {
		setConstString(offset + 61, $alloc_ctl_typ_nm, value);
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
	 * For yield calculation 収率計算用.<p>
	 *
	 */
	public boolean yield_calc_flg() {
		return getConstBoolean(offset + 63, $yield_calc_flg);
	}

	/**
	 * For yield calculation 収率計算用.<p>
	 *
	 */
	public void yield_calc_flg(boolean value) {
		setConstBoolean(offset + 63, $yield_calc_flg, value);
	}


	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public String inpt_ctl_typ() {
		return getConstString(offset + 64, $inpt_ctl_typ);
	}

	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public void inpt_ctl_typ(String value) {
		setConstString(offset + 64, $inpt_ctl_typ, value);
	}


	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public String inpt_ctl_typ_nm() {
		return getConstString(offset + 65, $inpt_ctl_typ_nm);
	}

	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public void inpt_ctl_typ_nm(String value) {
		setConstString(offset + 65, $inpt_ctl_typ_nm, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 66, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 66, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 66, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 66, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 66, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 66, $disp_seq, value);
	}


	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public String chng_no() {
		return getConstString(offset + 67, $chng_no);
	}

	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public void chng_no(String value) {
		setConstString(offset + 67, $chng_no, value);
	}


	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public String ext_sys_no_bom() {
		return getConstString(offset + 68, $ext_sys_no_bom);
	}

	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public void ext_sys_no_bom(String value) {
		setConstString(offset + 68, $ext_sys_no_bom, value);
	}


	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public boolean not_cost_flg() {
		return getConstBoolean(offset + 69, $not_cost_flg);
	}

	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public void not_cost_flg(boolean value) {
		setConstBoolean(offset + 69, $not_cost_flg, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 70, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 70, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 71, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 71, $wg_nm, value);
	}


	public String getString(String name) {
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($ph_bom_ptn.equalsIgnoreCase(name)) {
			return ph_bom_ptn();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			return alt_grp_nm();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			return alt_itm_typ_nm();
		}
		if ($sno_typ1.equalsIgnoreCase(name)) {
			return sno_typ1();
		}
		if ($sno_typ_nm1.equalsIgnoreCase(name)) {
			return sno_typ_nm1();
		}
		if ($sno_typ2.equalsIgnoreCase(name)) {
			return sno_typ2();
		}
		if ($sno_typ_nm2.equalsIgnoreCase(name)) {
			return sno_typ_nm2();
		}
		if ($sno_typ3.equalsIgnoreCase(name)) {
			return sno_typ3();
		}
		if ($sno_typ_nm3.equalsIgnoreCase(name)) {
			return sno_typ_nm3();
		}
		if ($sno_typ4.equalsIgnoreCase(name)) {
			return sno_typ4();
		}
		if ($sno_typ_nm4.equalsIgnoreCase(name)) {
			return sno_typ_nm4();
		}
		if ($chd_unit_cd.equalsIgnoreCase(name)) {
			return chd_unit_cd();
		}
		if ($chd_unit_nm.equalsIgnoreCase(name)) {
			return chd_unit_nm();
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			return in_offst_typ();
		}
		if ($in_offst_typ_nm.equalsIgnoreCase(name)) {
			return in_offst_typ_nm();
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			return bkf_typ();
		}
		if ($bkf_typ_nm.equalsIgnoreCase(name)) {
			return bkf_typ_nm();
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			return alloc_ctl_typ();
		}
		if ($alloc_ctl_typ_nm.equalsIgnoreCase(name)) {
			return alloc_ctl_typ_nm();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			return inpt_ctl_typ_nm();
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			return chng_no();
		}
		if ($ext_sys_no_bom.equalsIgnoreCase(name)) {
			return ext_sys_no_bom();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			return chd_dec_place();
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			return in_offst();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($bottom_flg.equalsIgnoreCase(name)) {
			return bottom_flg();
		}
		if ($byprod_flg.equalsIgnoreCase(name)) {
			return byprod_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($ph_flg.equalsIgnoreCase(name)) {
			return ph_flg();
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			return alt_itm_flg();
		}
		if ($inst_lot_fix_flg.equalsIgnoreCase(name)) {
			return inst_lot_fix_flg();
		}
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			return lot_mix_flg();
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			return sublot_mix_flg();
		}
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			return main_itm_flg();
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			return yield_calc_flg();
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			return not_cost_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($ph_bom_ptn.equalsIgnoreCase(name)) {
			return ph_bom_ptn();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			return alt_grp_nm();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			return alt_itm_typ_nm();
		}
		if ($sno_typ1.equalsIgnoreCase(name)) {
			return sno_typ1();
		}
		if ($sno_typ_nm1.equalsIgnoreCase(name)) {
			return sno_typ_nm1();
		}
		if ($sno_typ2.equalsIgnoreCase(name)) {
			return sno_typ2();
		}
		if ($sno_typ_nm2.equalsIgnoreCase(name)) {
			return sno_typ_nm2();
		}
		if ($sno_typ3.equalsIgnoreCase(name)) {
			return sno_typ3();
		}
		if ($sno_typ_nm3.equalsIgnoreCase(name)) {
			return sno_typ_nm3();
		}
		if ($sno_typ4.equalsIgnoreCase(name)) {
			return sno_typ4();
		}
		if ($sno_typ_nm4.equalsIgnoreCase(name)) {
			return sno_typ_nm4();
		}
		if ($chd_unit_cd.equalsIgnoreCase(name)) {
			return chd_unit_cd();
		}
		if ($chd_unit_nm.equalsIgnoreCase(name)) {
			return chd_unit_nm();
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			return in_offst_typ();
		}
		if ($in_offst_typ_nm.equalsIgnoreCase(name)) {
			return in_offst_typ_nm();
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			return bkf_typ();
		}
		if ($bkf_typ_nm.equalsIgnoreCase(name)) {
			return bkf_typ_nm();
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			return alloc_ctl_typ();
		}
		if ($alloc_ctl_typ_nm.equalsIgnoreCase(name)) {
			return alloc_ctl_typ_nm();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			return inpt_ctl_typ_nm();
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			return chng_no();
		}
		if ($ext_sys_no_bom.equalsIgnoreCase(name)) {
			return ext_sys_no_bom();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			return chd_dec_place();
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			return in_offst();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($bottom_flg.equalsIgnoreCase(name)) {
			return bottom_flg();
		}
		if ($byprod_flg.equalsIgnoreCase(name)) {
			return byprod_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($ph_flg.equalsIgnoreCase(name)) {
			return ph_flg();
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			return alt_itm_flg();
		}
		if ($inst_lot_fix_flg.equalsIgnoreCase(name)) {
			return inst_lot_fix_flg();
		}
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			return lot_mix_flg();
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			return sublot_mix_flg();
		}
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			return main_itm_flg();
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			return yield_calc_flg();
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			return not_cost_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
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
		if ($ph_bom_ptn.equalsIgnoreCase(name)) {
			ph_bom_ptn(value);
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
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
			return;
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			alt_itm_typ_nm(value);
			return;
		}
		if ($sno_typ1.equalsIgnoreCase(name)) {
			sno_typ1(value);
			return;
		}
		if ($sno_typ_nm1.equalsIgnoreCase(name)) {
			sno_typ_nm1(value);
			return;
		}
		if ($sno_typ2.equalsIgnoreCase(name)) {
			sno_typ2(value);
			return;
		}
		if ($sno_typ_nm2.equalsIgnoreCase(name)) {
			sno_typ_nm2(value);
			return;
		}
		if ($sno_typ3.equalsIgnoreCase(name)) {
			sno_typ3(value);
			return;
		}
		if ($sno_typ_nm3.equalsIgnoreCase(name)) {
			sno_typ_nm3(value);
			return;
		}
		if ($sno_typ4.equalsIgnoreCase(name)) {
			sno_typ4(value);
			return;
		}
		if ($sno_typ_nm4.equalsIgnoreCase(name)) {
			sno_typ_nm4(value);
			return;
		}
		if ($chd_unit_cd.equalsIgnoreCase(name)) {
			chd_unit_cd(value);
			return;
		}
		if ($chd_unit_nm.equalsIgnoreCase(name)) {
			chd_unit_nm(value);
			return;
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			in_offst_typ(value);
			return;
		}
		if ($in_offst_typ_nm.equalsIgnoreCase(name)) {
			in_offst_typ_nm(value);
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
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			alloc_ctl_typ(value);
			return;
		}
		if ($alloc_ctl_typ_nm.equalsIgnoreCase(name)) {
			alloc_ctl_typ_nm(value);
			return;
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			inpt_ctl_typ(value);
			return;
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			inpt_ctl_typ_nm(value);
			return;
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			chng_no(value);
			return;
		}
		if ($ext_sys_no_bom.equalsIgnoreCase(name)) {
			ext_sys_no_bom(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
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
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
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
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
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
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
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
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
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
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($bottom_flg.equalsIgnoreCase(name)) {
			bottom_flg(value);
			return;
		}
		if ($byprod_flg.equalsIgnoreCase(name)) {
			byprod_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($ph_flg.equalsIgnoreCase(name)) {
			ph_flg(value);
			return;
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			alt_itm_flg(value);
			return;
		}
		if ($inst_lot_fix_flg.equalsIgnoreCase(name)) {
			inst_lot_fix_flg(value);
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
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			main_itm_flg(value);
			return;
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			yield_calc_flg(value);
			return;
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			not_cost_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
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
		if ($ph_bom_ptn.equalsIgnoreCase(name)) {
			ph_bom_ptn(value);
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
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
			return;
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			alt_itm_typ_nm(value);
			return;
		}
		if ($sno_typ1.equalsIgnoreCase(name)) {
			sno_typ1(value);
			return;
		}
		if ($sno_typ_nm1.equalsIgnoreCase(name)) {
			sno_typ_nm1(value);
			return;
		}
		if ($sno_typ2.equalsIgnoreCase(name)) {
			sno_typ2(value);
			return;
		}
		if ($sno_typ_nm2.equalsIgnoreCase(name)) {
			sno_typ_nm2(value);
			return;
		}
		if ($sno_typ3.equalsIgnoreCase(name)) {
			sno_typ3(value);
			return;
		}
		if ($sno_typ_nm3.equalsIgnoreCase(name)) {
			sno_typ_nm3(value);
			return;
		}
		if ($sno_typ4.equalsIgnoreCase(name)) {
			sno_typ4(value);
			return;
		}
		if ($sno_typ_nm4.equalsIgnoreCase(name)) {
			sno_typ_nm4(value);
			return;
		}
		if ($chd_unit_cd.equalsIgnoreCase(name)) {
			chd_unit_cd(value);
			return;
		}
		if ($chd_unit_nm.equalsIgnoreCase(name)) {
			chd_unit_nm(value);
			return;
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			in_offst_typ(value);
			return;
		}
		if ($in_offst_typ_nm.equalsIgnoreCase(name)) {
			in_offst_typ_nm(value);
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
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			alloc_ctl_typ(value);
			return;
		}
		if ($alloc_ctl_typ_nm.equalsIgnoreCase(name)) {
			alloc_ctl_typ_nm(value);
			return;
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			inpt_ctl_typ(value);
			return;
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			inpt_ctl_typ_nm(value);
			return;
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			chng_no(value);
			return;
		}
		if ($ext_sys_no_bom.equalsIgnoreCase(name)) {
			ext_sys_no_bom(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
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
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
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
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
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
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
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
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
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
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($bottom_flg.equalsIgnoreCase(name)) {
			bottom_flg(value);
			return;
		}
		if ($byprod_flg.equalsIgnoreCase(name)) {
			byprod_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($ph_flg.equalsIgnoreCase(name)) {
			ph_flg(value);
			return;
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			alt_itm_flg(value);
			return;
		}
		if ($inst_lot_fix_flg.equalsIgnoreCase(name)) {
			inst_lot_fix_flg(value);
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
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			main_itm_flg(value);
			return;
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			yield_calc_flg(value);
			return;
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			not_cost_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($hrrchy_p.equalsIgnoreCase(name)) {
			return hrrchy_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($min_sno_p.equalsIgnoreCase(name)) {
			return min_sno_p();
		}
		if ($max_sno_p.equalsIgnoreCase(name)) {
			return max_sno_p();
		}
		if ($dt_p.equalsIgnoreCase(name)) {
			return dt_p();
		}
		if ($qty6_p.equalsIgnoreCase(name)) {
			return qty6_p();
		}
		if ($qty5_p.equalsIgnoreCase(name)) {
			return qty5_p();
		}
		if ($qty1_p.equalsIgnoreCase(name)) {
			return qty1_p();
		}
		if ($qty3_p.equalsIgnoreCase(name)) {
			return qty3_p();
		}
		if ($qty2_p.equalsIgnoreCase(name)) {
			return qty2_p();
		}
		if ($qty4_p.equalsIgnoreCase(name)) {
			return qty4_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($hrrchy_p.equalsIgnoreCase(name)) {
			hrrchy_p(
				((MCContainerMeta) hrrchy_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5210.HrrchyR.class, value)
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
		if ($min_sno_p.equalsIgnoreCase(name)) {
			min_sno_p(
				((MCContainerMeta) min_sno_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5070.SnoR.class, value)
			);
			return;
		}
		if ($max_sno_p.equalsIgnoreCase(name)) {
			max_sno_p(
				((MCContainerMeta) max_sno_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5070.SnoR.class, value)
			);
			return;
		}
		if ($dt_p.equalsIgnoreCase(name)) {
			dt_p(
				((MCContainerMeta) dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5010.DtR.class, value)
			);
			return;
		}
		if ($qty6_p.equalsIgnoreCase(name)) {
			qty6_p(
				((MCContainerMeta) qty6_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty5_p.equalsIgnoreCase(name)) {
			qty5_p(
				((MCContainerMeta) qty5_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty1_p.equalsIgnoreCase(name)) {
			qty1_p(
				((MCContainerMeta) qty1_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty3_p.equalsIgnoreCase(name)) {
			qty3_p(
				((MCContainerMeta) qty3_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty2_p.equalsIgnoreCase(name)) {
			qty2_p(
				((MCContainerMeta) qty2_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty4_p.equalsIgnoreCase(name)) {
			qty4_p(
				((MCContainerMeta) qty4_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCNumber hrrchy() {
		return hrrchy_p().hrrchy();
	}

	public void hrrchy(MCNumber value) {
		hrrchy_p().hrrchy(value);
	}

	public void hrrchy(int value) {
		hrrchy_p().hrrchy(value);
	}

	public void hrrchy(long value) {
		hrrchy_p().hrrchy(value);
	}

	public void hrrchy(float value) {
		hrrchy_p().hrrchy(value);
	}

	public void hrrchy(double value) {
		hrrchy_p().hrrchy(value);
	}

	public boolean ext() {
		return hrrchy_p().ext();
	}

	public void ext(boolean value) {
		hrrchy_p().ext(value);
	}

	public MCNumber extno() {
		return hrrchy_p().extno();
	}

	public void extno(MCNumber value) {
		hrrchy_p().extno(value);
	}

	public void extno(int value) {
		hrrchy_p().extno(value);
	}

	public void extno(long value) {
		hrrchy_p().extno(value);
	}

	public void extno(float value) {
		hrrchy_p().extno(value);
	}

	public void extno(double value) {
		hrrchy_p().extno(value);
	}

	public MCNumber par_extno() {
		return hrrchy_p().par_extno();
	}

	public void par_extno(MCNumber value) {
		hrrchy_p().par_extno(value);
	}

	public void par_extno(int value) {
		hrrchy_p().par_extno(value);
	}

	public void par_extno(long value) {
		hrrchy_p().par_extno(value);
	}

	public void par_extno(float value) {
		hrrchy_p().par_extno(value);
	}

	public void par_extno(double value) {
		hrrchy_p().par_extno(value);
	}

	public boolean loop_flg() {
		return hrrchy_p().loop_flg();
	}

	public void loop_flg(boolean value) {
		hrrchy_p().loop_flg(value);
	}

	public String leaf() {
		return hrrchy_p().leaf();
	}

	public void leaf(String value) {
		hrrchy_p().leaf(value);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public String leaf_str() {
		return hrrchy_p().leaf_str();
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void leaf_str(String value) {
		hrrchy_p().leaf_str(value);
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
	 * Version No. (Child item) 版ＮＯ（子品目）.<p>
	 *
	 */
	public String ver_no() {
		return ver_no_p().ver_no();
	}

	/**
	 * Version No. (Child item) 版ＮＯ（子品目）.<p>
	 *
	 */
	public void ver_no(String value) {
		ver_no_p().ver_no(value);
	}

	/**
	 * Min. SEIBAN No. 1 下限手配ＮＯ１.<p>
	 *
	 */
	public String min_sno1() {
		return min_sno_p().sno1();
	}

	/**
	 * Min. SEIBAN No. 1 下限手配ＮＯ１.<p>
	 *
	 */
	public void min_sno1(String value) {
		min_sno_p().sno1(value);
	}

	/**
	 * Min. SEIBAN No. 2 下限手配ＮＯ２.<p>
	 *
	 */
	public String min_sno2() {
		return min_sno_p().sno2();
	}

	/**
	 * Min. SEIBAN No. 2 下限手配ＮＯ２.<p>
	 *
	 */
	public void min_sno2(String value) {
		min_sno_p().sno2(value);
	}

	/**
	 * Min. SEIBAN No. 3 下限手配ＮＯ３.<p>
	 *
	 */
	public String min_sno3() {
		return min_sno_p().sno3();
	}

	/**
	 * Min. SEIBAN No. 3 下限手配ＮＯ３.<p>
	 *
	 */
	public void min_sno3(String value) {
		min_sno_p().sno3(value);
	}

	/**
	 * Min. SEIBAN No. 4 下限手配ＮＯ４.<p>
	 *
	 */
	public String min_sno4() {
		return min_sno_p().sno4();
	}

	/**
	 * Min. SEIBAN No. 4 下限手配ＮＯ４.<p>
	 *
	 */
	public void min_sno4(String value) {
		min_sno_p().sno4(value);
	}

	/**
	 * Max. SEIBAN No. 1 上限手配ＮＯ１.<p>
	 *
	 */
	public String max_sno1() {
		return max_sno_p().sno1();
	}

	/**
	 * Max. SEIBAN No. 1 上限手配ＮＯ１.<p>
	 *
	 */
	public void max_sno1(String value) {
		max_sno_p().sno1(value);
	}

	/**
	 * Max. SEIBAN No. 2 上限手配ＮＯ２.<p>
	 *
	 */
	public String max_sno2() {
		return max_sno_p().sno2();
	}

	/**
	 * Max. SEIBAN No. 2 上限手配ＮＯ２.<p>
	 *
	 */
	public void max_sno2(String value) {
		max_sno_p().sno2(value);
	}

	/**
	 * Max. SEIBAN No. 3 上限手配ＮＯ３.<p>
	 *
	 */
	public String max_sno3() {
		return max_sno_p().sno3();
	}

	/**
	 * Max. SEIBAN No. 3 上限手配ＮＯ３.<p>
	 *
	 */
	public void max_sno3(String value) {
		max_sno_p().sno3(value);
	}

	/**
	 * Max. SEIBAN No. 4 上限手配ＮＯ４.<p>
	 *
	 */
	public String max_sno4() {
		return max_sno_p().sno4();
	}

	/**
	 * Max. SEIBAN No. 4 上限手配ＮＯ４.<p>
	 *
	 */
	public void max_sno4(String value) {
		max_sno_p().sno4(value);
	}

	public MCDate st_dt() {
		return dt_p().st_dt();
	}

	public void st_dt(MCDate value) {
		dt_p().st_dt(value);
	}

	public MCDate end_dt() {
		return dt_p().end_dt();
	}

	public void end_dt(MCDate value) {
		dt_p().end_dt(value);
	}

	/**
	 * Conversion input qty. 換算投入数量.<p>
	 *
	 */
	public MCNumber conv_inpt_qty() {
		return qty6_p().qty();
	}

	/**
	 * Conversion input qty. 換算投入数量.<p>
	 *
	 */
	public void conv_inpt_qty(MCNumber value) {
		qty6_p().qty(value);
	}

	/**
	 * Conversion input qty. 換算投入数量.<p>
	 *
	 */
	public void conv_inpt_qty(int value) {
		qty6_p().qty(value);
	}

	/**
	 * Conversion input qty. 換算投入数量.<p>
	 *
	 */
	public void conv_inpt_qty(long value) {
		qty6_p().qty(value);
	}

	/**
	 * Conversion input qty. 換算投入数量.<p>
	 *
	 */
	public void conv_inpt_qty(float value) {
		qty6_p().qty(value);
	}

	/**
	 * Conversion input qty. 換算投入数量.<p>
	 *
	 */
	public void conv_inpt_qty(double value) {
		qty6_p().qty(value);
	}

	/**
	 * Conversion qty. required 換算必要数量.<p>
	 *
	 */
	public MCNumber conv_rqmt_qty() {
		return qty5_p().qty();
	}

	/**
	 * Conversion qty. required 換算必要数量.<p>
	 *
	 */
	public void conv_rqmt_qty(MCNumber value) {
		qty5_p().qty(value);
	}

	/**
	 * Conversion qty. required 換算必要数量.<p>
	 *
	 */
	public void conv_rqmt_qty(int value) {
		qty5_p().qty(value);
	}

	/**
	 * Conversion qty. required 換算必要数量.<p>
	 *
	 */
	public void conv_rqmt_qty(long value) {
		qty5_p().qty(value);
	}

	/**
	 * Conversion qty. required 換算必要数量.<p>
	 *
	 */
	public void conv_rqmt_qty(float value) {
		qty5_p().qty(value);
	}

	/**
	 * Conversion qty. required 換算必要数量.<p>
	 *
	 */
	public void conv_rqmt_qty(double value) {
		qty5_p().qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public MCNumber par_inst_qty() {
		return qty1_p().qty();
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(MCNumber value) {
		qty1_p().qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(int value) {
		qty1_p().qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(long value) {
		qty1_p().qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(float value) {
		qty1_p().qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(double value) {
		qty1_p().qty(value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public MCNumber chd_inpt_qty() {
		return qty3_p().qty();
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(MCNumber value) {
		qty3_p().qty(value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(int value) {
		qty3_p().qty(value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(long value) {
		qty3_p().qty(value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(float value) {
		qty3_p().qty(value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(double value) {
		qty3_p().qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public MCNumber chd_rqmt_qty() {
		return qty2_p().qty();
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(MCNumber value) {
		qty2_p().qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(int value) {
		qty2_p().qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(long value) {
		qty2_p().qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(float value) {
		qty2_p().qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(double value) {
		qty2_p().qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public MCNumber fxd_chd_rqmt_qty() {
		return qty4_p().qty();
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(MCNumber value) {
		qty4_p().qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(int value) {
		qty4_p().qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(long value) {
		qty4_p().qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(float value) {
		qty4_p().qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(double value) {
		qty4_p().qty(value);
	}

}

