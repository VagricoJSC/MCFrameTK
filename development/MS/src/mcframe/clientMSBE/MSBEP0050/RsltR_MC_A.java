package mcframe.clientMSBE.MSBEP0050;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
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
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	public static final String $itm_p = "itm_p";
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
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	public static final String $str_ln_p = "str_ln_p";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public static final String $alloc_grp_nm = "alloc_grp_nm";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
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
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public static final String $in_xfr_typ = "in_xfr_typ";
	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public static final String $in_xfr_typ_nm = "in_xfr_typ_nm";
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
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public static final String $stk_insp_typ_nm = "stk_insp_typ_nm";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public static final String $asst_typ_nm = "asst_typ_nm";
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
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public static final String $stk_arrv_bp_nm = "stk_arrv_bp_nm";
	public static final String $pack_unit_qty_p = "pack_unit_qty_p";
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public static final String $pack_unit_nm = "pack_unit_nm";
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public static final String $pack_unit_dec_place = "pack_unit_dec_place";
	public static final String $stk_qty_p = "stk_qty_p";
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
	public static final String $std_unit_cost_amt_p = "std_unit_cost_amt_p";
	public static final String $stk_amt_p = "stk_amt_p";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	/**
	 * Inventory amount number of decimal places 在庫金額小数有効桁数.<p>
	 *
	 */
	public static final String $stk_amt_dec_place = "stk_amt_dec_place";
	/**
	 * Inventory amount rounding type 在庫金額端数処理区分.<p>
	 *
	 */
	public static final String $stk_amt_rnd_typ = "stk_amt_rnd_typ";
	/**
	 * Non-moving base month 滞留基準年月.<p>
	 *
	 */
	public static final String $non_mov_base_ym = "non_mov_base_ym";
	/**
	 * Number of non-moving months 滞留月数.<p>
	 *
	 */
	public static final String $non_mov_mons = "non_mov_mons";
	/**
	 * Earliest scheduled GI date 直近出庫予定日.<p>
	 *
	 */
	public static final String $rcnt_gi_schd_dt = "rcnt_gi_schd_dt";
	/**
	 * Inventory turnover ratio 在庫回転率.<p>
	 *
	 */
	public static final String $stk_trn_ovr_rate = "stk_trn_ovr_rate";
	/**
	 * Inventory turnover period 在庫回転期間.<p>
	 *
	 */
	public static final String $stk_trn_ovr_pd = "stk_trn_ovr_pd";
	/**
	 * Total GI qty. 合計出庫数量.<p>
	 *
	 */
	public static final String $ttl_gi_qty = "ttl_gi_qty";
	/**
	 * Total GI amount 合計出庫金額.<p>
	 *
	 */
	public static final String $ttl_gi_amt = "ttl_gi_amt";
	/**
	 * Average inventory quantity 平均在庫数量.<p>
	 *
	 */
	public static final String $avg_stk_qty = "avg_stk_qty";
	/**
	 * Average inventory amount 平均在庫金額.<p>
	 *
	 */
	public static final String $avg_stk_amt = "avg_stk_amt";
	/**
	 * Average GI qty. per day 一日あたり平均出庫数量.<p>
	 *
	 */
	public static final String $avg_gi_qty = "avg_gi_qty";
	/**
	 * Average GI amount per day 一日あたり平均出庫金額.<p>
	 *
	 */
	public static final String $avg_gi_amt = "avg_gi_amt";
	/**
	 * Number of days to GI 出庫対応日数.<p>
	 *
	 */
	public static final String $gi_days = "gi_days";
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
	public static final String $itm_grp_p = "itm_grp_p";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $str_ln_cd = $str_ln_p + ".str_ln_cd";
	public static final String $str_ln_nm = $str_ln_p + ".str_ln_nm";
	public static final String $str_ln_cd_none_flg = $str_ln_p + ".str_ln_cd_none_flg";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $pack_unit_qty = $pack_unit_qty_p + ".qty";
	public static final String $stk_qty = $stk_qty_p + ".qty";
	public static final String $std_unit_cost = $std_unit_cost_amt_p + ".amt";
	public static final String $stk_amt = $stk_amt_p + ".amt";
	public static final String $itm_grp_cd1 = $itm_grp_p + ".itm_grp_cd1";
	public static final String $itm_grp_nm1 = $itm_grp_p + ".itm_grp_nm1";
	public static final String $itm_grp_cd2 = $itm_grp_p + ".itm_grp_cd2";
	public static final String $itm_grp_nm2 = $itm_grp_p + ".itm_grp_nm2";
	public static final String $itm_grp_cd3 = $itm_grp_p + ".itm_grp_cd3";
	public static final String $itm_grp_nm3 = $itm_grp_p + ".itm_grp_nm3";
	public static final String $itm_grp_cd4 = $itm_grp_p + ".itm_grp_cd4";
	public static final String $itm_grp_nm4 = $itm_grp_p + ".itm_grp_nm4";
	public static final String $itm_grp_cd5 = $itm_grp_p + ".itm_grp_cd5";
	public static final String $itm_grp_nm5 = $itm_grp_p + ".itm_grp_nm5";
	public static final String $itm_grp_cd6 = $itm_grp_p + ".itm_grp_cd6";
	public static final String $itm_grp_nm6 = $itm_grp_p + ".itm_grp_nm6";
	public static final String $itm_grp_cd7 = $itm_grp_p + ".itm_grp_cd7";
	public static final String $itm_grp_nm7 = $itm_grp_p + ".itm_grp_nm7";
	public static final String $itm_grp_cd8 = $itm_grp_p + ".itm_grp_cd8";
	public static final String $itm_grp_nm8 = $itm_grp_p + ".itm_grp_nm8";
	public static final String $itm_grp_cd9 = $itm_grp_p + ".itm_grp_cd9";
	public static final String $itm_grp_nm9 = $itm_grp_p + ".itm_grp_nm9";
	public static final String $itm_grp_cd10 = $itm_grp_p + ".itm_grp_cd10";
	public static final String $itm_grp_nm10 = $itm_grp_p + ".itm_grp_nm10";

	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_p_META = createInnerRowMeta($str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta in_xfr_typ_META = createCommonMeta($in_xfr_typ, mcframe.commonMS.meta.MS_META.IN_XFR_TYP);
	public static final MCMeta in_xfr_typ_nm_META = createCommonMeta($in_xfr_typ_nm, mcframe.commonMS.meta.MS_META.IN_XFR_TYP_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta pack_unit_qty_p_META = createInnerRowMeta($pack_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pack_unit_dec_place_META = createCommonMeta($pack_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta stk_qty_p_META = createInnerRowMeta($stk_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta std_unit_cost_amt_p_META = createInnerRowMeta($std_unit_cost_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta stk_amt_p_META = createInnerRowMeta($stk_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta stk_amt_dec_place_META = createCommonMeta($stk_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta stk_amt_rnd_typ_META = createCommonMeta($stk_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta non_mov_base_ym_META = createCommonMeta($non_mov_base_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta non_mov_mons_META = createCommonMeta($non_mov_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta rcnt_gi_schd_dt_META = createCommonMeta($rcnt_gi_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta stk_trn_ovr_rate_META = createCommonMeta($stk_trn_ovr_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta stk_trn_ovr_pd_META = createNumberMeta($stk_trn_ovr_pd);
	public static final MCMeta ttl_gi_qty_META = createCommonMeta($ttl_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ttl_gi_amt_META = createCommonMeta($ttl_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta avg_stk_qty_META = createCommonMeta($avg_stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta avg_stk_amt_META = createCommonMeta($avg_stk_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta avg_gi_qty_META = createCommonMeta($avg_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta avg_gi_amt_META = createCommonMeta($avg_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gi_days_META = createNumberMeta($gi_days);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP5170.ItmGrpR.class);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ac_ym_META,
			wg_cd_META,
			wg_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			itm_p_META,
			lot_no_META,
			sublot_no_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_p_META,
			site_cd_META,
			site_nm_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			alloc_grp_cd_META,
			alloc_grp_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			gd_cd_META,
			gd_nm_META,
			in_xfr_typ_META,
			in_xfr_typ_nm_META,
			quality_typ_META,
			quality_typ_nm_META,
			stk_insp_typ_META,
			stk_insp_typ_nm_META,
			sno_wrk_no_p_META,
			asst_typ_META,
			asst_typ_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			stk_arrv_bp_cd_META,
			stk_arrv_bp_nm_META,
			pack_unit_qty_p_META,
			pack_unit_cd_META,
			pack_unit_nm_META,
			pack_unit_dec_place_META,
			stk_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			std_unit_cost_amt_p_META,
			stk_amt_p_META,
			base_cur_cd_META,
			base_cur_nm_META,
			stk_amt_dec_place_META,
			stk_amt_rnd_typ_META,
			non_mov_base_ym_META,
			non_mov_mons_META,
			rcnt_gi_schd_dt_META,
			stk_trn_ovr_rate_META,
			stk_trn_ovr_pd_META,
			ttl_gi_qty_META,
			ttl_gi_amt_META,
			avg_stk_qty_META,
			avg_stk_amt_META,
			avg_gi_qty_META,
			avg_gi_amt_META,
			gi_days_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_grp_p_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"str_ln_cd",
				"str_ln_nm",
				"str_ln_cd_none_flg",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"pack_unit_qty",
				"stk_qty",
				"std_unit_cost",
				"stk_amt",
				"itm_grp_cd1",
				"itm_grp_nm1",
				"itm_grp_cd2",
				"itm_grp_nm2",
				"itm_grp_cd3",
				"itm_grp_nm3",
				"itm_grp_cd4",
				"itm_grp_nm4",
				"itm_grp_cd5",
				"itm_grp_nm5",
				"itm_grp_cd6",
				"itm_grp_nm6",
				"itm_grp_cd7",
				"itm_grp_nm7",
				"itm_grp_cd8",
				"itm_grp_nm8",
				"itm_grp_cd9",
				"itm_grp_nm9",
				"itm_grp_cd10",
				"itm_grp_nm10"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$str_ln_cd,
				$str_ln_nm,
				$str_ln_cd_none_flg,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$pack_unit_qty,
				$stk_qty,
				$std_unit_cost,
				$stk_amt,
				$itm_grp_cd1,
				$itm_grp_nm1,
				$itm_grp_cd2,
				$itm_grp_nm2,
				$itm_grp_cd3,
				$itm_grp_nm3,
				$itm_grp_cd4,
				$itm_grp_nm4,
				$itm_grp_cd5,
				$itm_grp_nm5,
				$itm_grp_cd6,
				$itm_grp_nm6,
				$itm_grp_cd7,
				$itm_grp_nm7,
				$itm_grp_cd8,
				$itm_grp_nm8,
				$itm_grp_cd9,
				$itm_grp_nm9,
				$itm_grp_cd10,
				$itm_grp_nm10
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
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$lg_grp_cd, "LG_GRP"},	// lg_grp_cd
				{$lg_grp_nm, "LG_GRP"},	// lg_grp_nm
				{$alloc_grp_cd, "ALLOC_GRP"},	// alloc_grp_cd
				{$alloc_grp_nm, "ALLOC_GRP"},	// alloc_grp_nm
				{$loc_grp_cd, "LOC_GRP"},	// loc_grp_cd
				{$loc_grp_nm, "LOC_GRP"},	// loc_grp_nm
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"},	// gd_nm
				{$stk_qty_p + ".qty", "BASE_UNIT"},	// stk_qty_p.qty
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"}	// base_unit_nm
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}



	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 0, $ac_ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 0, $ac_ym, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 1, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 1, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 2, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 2, $wg_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 3, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 3, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 4, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 4, $dpt_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 5, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 5, $itm_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 6, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 6, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 7, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 7, $sublot_no, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 8, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 8, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 9, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 9, $loc_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 10, $str_ln_p);
	}
	
	public void str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 10, $str_ln_p, row);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 11, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 11, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 12, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 12, $site_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 13, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 13, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 14, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 14, $lg_grp_nm, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 15, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 15, $alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 16, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 16, $alloc_grp_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 17, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 17, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 18, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 18, $loc_grp_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 19, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 19, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 20, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 20, $gd_nm, value);
	}


	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public String in_xfr_typ() {
		return getConstString(offset + 21, $in_xfr_typ);
	}

	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public void in_xfr_typ(String value) {
		setConstString(offset + 21, $in_xfr_typ, value);
	}


	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public String in_xfr_typ_nm() {
		return getConstString(offset + 22, $in_xfr_typ_nm);
	}

	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public void in_xfr_typ_nm(String value) {
		setConstString(offset + 22, $in_xfr_typ_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 23, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 23, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 24, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 24, $quality_typ_nm, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 25, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 25, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 26, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 26, $stk_insp_typ_nm, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 27, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 27, $sno_wrk_no_p, row);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 28, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 28, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 29, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 29, $asst_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 30, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 30, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 31, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 31, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 32, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 32, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 33, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 33, $stk_bp_nm, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 34, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 34, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 35, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 35, $stk_arrv_bp_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR pack_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 36, $pack_unit_qty_p);
	}
	
	public void pack_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 36, $pack_unit_qty_p, row);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 37, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 37, $pack_unit_cd, value);
	}


	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 38, $pack_unit_nm);
	}

	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 38, $pack_unit_nm, value);
	}


	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_unit_dec_place() {
		return getConstNumber(offset + 39, $pack_unit_dec_place);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 39, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(int value) {
		setConstNumber(offset + 39, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(long value) {
		setConstNumber(offset + 39, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(float value) {
		setConstNumber(offset + 39, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(double value) {
		setConstNumber(offset + 39, $pack_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR stk_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 40, $stk_qty_p);
	}
	
	public void stk_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 40, $stk_qty_p, row);
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
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 42, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 42, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 43, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 43, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 43, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 43, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 43, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 43, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 44, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 44, $base_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR std_unit_cost_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 45, $std_unit_cost_amt_p);
	}
	
	public void std_unit_cost_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 45, $std_unit_cost_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR stk_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 46, $stk_amt_p);
	}
	
	public void stk_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 46, $stk_amt_p, row);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 47, $base_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 47, $base_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 48, $base_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 48, $base_cur_nm, value);
	}


	/**
	 * Inventory amount number of decimal places 在庫金額小数有効桁数.<p>
	 *
	 */
	public MCNumber stk_amt_dec_place() {
		return getConstNumber(offset + 49, $stk_amt_dec_place);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 49, $stk_amt_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(int value) {
		setConstNumber(offset + 49, $stk_amt_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(long value) {
		setConstNumber(offset + 49, $stk_amt_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(float value) {
		setConstNumber(offset + 49, $stk_amt_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(double value) {
		setConstNumber(offset + 49, $stk_amt_dec_place, value);
	}


	/**
	 * Inventory amount rounding type 在庫金額端数処理区分.<p>
	 *
	 */
	public String stk_amt_rnd_typ() {
		return getConstString(offset + 50, $stk_amt_rnd_typ);
	}

	/**
	 * Inventory amount rounding type 在庫金額端数処理区分.<p>
	 *
	 */
	public void stk_amt_rnd_typ(String value) {
		setConstString(offset + 50, $stk_amt_rnd_typ, value);
	}


	/**
	 * Non-moving base month 滞留基準年月.<p>
	 *
	 */
	public MCDate non_mov_base_ym() {
		return getConstDate(offset + 51, $non_mov_base_ym);
	}

	/**
	 * Non-moving base month 滞留基準年月.<p>
	 *
	 */
	public void non_mov_base_ym(MCDate value) {
		setConstDate(offset + 51, $non_mov_base_ym, value);
	}


	/**
	 * Number of non-moving months 滞留月数.<p>
	 *
	 */
	public MCNumber non_mov_mons() {
		return getConstNumber(offset + 52, $non_mov_mons);
	}

	/**
	 * Number of non-moving months 滞留月数.<p>
	 *
	 */
	public void non_mov_mons(MCNumber value) {
		setConstNumber(offset + 52, $non_mov_mons, value);
	}

	/**
	 * Number of non-moving months 滞留月数.<p>
	 *
	 */
	public void non_mov_mons(int value) {
		setConstNumber(offset + 52, $non_mov_mons, value);
	}

	/**
	 * Number of non-moving months 滞留月数.<p>
	 *
	 */
	public void non_mov_mons(long value) {
		setConstNumber(offset + 52, $non_mov_mons, value);
	}

	/**
	 * Number of non-moving months 滞留月数.<p>
	 *
	 */
	public void non_mov_mons(float value) {
		setConstNumber(offset + 52, $non_mov_mons, value);
	}

	/**
	 * Number of non-moving months 滞留月数.<p>
	 *
	 */
	public void non_mov_mons(double value) {
		setConstNumber(offset + 52, $non_mov_mons, value);
	}


	/**
	 * Earliest scheduled GI date 直近出庫予定日.<p>
	 *
	 */
	public MCDate rcnt_gi_schd_dt() {
		return getConstDate(offset + 53, $rcnt_gi_schd_dt);
	}

	/**
	 * Earliest scheduled GI date 直近出庫予定日.<p>
	 *
	 */
	public void rcnt_gi_schd_dt(MCDate value) {
		setConstDate(offset + 53, $rcnt_gi_schd_dt, value);
	}


	/**
	 * Inventory turnover ratio 在庫回転率.<p>
	 *
	 */
	public MCNumber stk_trn_ovr_rate() {
		return getConstNumber(offset + 54, $stk_trn_ovr_rate);
	}

	/**
	 * Inventory turnover ratio 在庫回転率.<p>
	 *
	 */
	public void stk_trn_ovr_rate(MCNumber value) {
		setConstNumber(offset + 54, $stk_trn_ovr_rate, value);
	}

	/**
	 * Inventory turnover ratio 在庫回転率.<p>
	 *
	 */
	public void stk_trn_ovr_rate(int value) {
		setConstNumber(offset + 54, $stk_trn_ovr_rate, value);
	}

	/**
	 * Inventory turnover ratio 在庫回転率.<p>
	 *
	 */
	public void stk_trn_ovr_rate(long value) {
		setConstNumber(offset + 54, $stk_trn_ovr_rate, value);
	}

	/**
	 * Inventory turnover ratio 在庫回転率.<p>
	 *
	 */
	public void stk_trn_ovr_rate(float value) {
		setConstNumber(offset + 54, $stk_trn_ovr_rate, value);
	}

	/**
	 * Inventory turnover ratio 在庫回転率.<p>
	 *
	 */
	public void stk_trn_ovr_rate(double value) {
		setConstNumber(offset + 54, $stk_trn_ovr_rate, value);
	}


	/**
	 * Inventory turnover period 在庫回転期間.<p>
	 *
	 */
	public MCNumber stk_trn_ovr_pd() {
		return getConstNumber(offset + 55, $stk_trn_ovr_pd);
	}

	/**
	 * Inventory turnover period 在庫回転期間.<p>
	 *
	 */
	public void stk_trn_ovr_pd(MCNumber value) {
		setConstNumber(offset + 55, $stk_trn_ovr_pd, value);
	}

	/**
	 * Inventory turnover period 在庫回転期間.<p>
	 *
	 */
	public void stk_trn_ovr_pd(int value) {
		setConstNumber(offset + 55, $stk_trn_ovr_pd, value);
	}

	/**
	 * Inventory turnover period 在庫回転期間.<p>
	 *
	 */
	public void stk_trn_ovr_pd(long value) {
		setConstNumber(offset + 55, $stk_trn_ovr_pd, value);
	}

	/**
	 * Inventory turnover period 在庫回転期間.<p>
	 *
	 */
	public void stk_trn_ovr_pd(float value) {
		setConstNumber(offset + 55, $stk_trn_ovr_pd, value);
	}

	/**
	 * Inventory turnover period 在庫回転期間.<p>
	 *
	 */
	public void stk_trn_ovr_pd(double value) {
		setConstNumber(offset + 55, $stk_trn_ovr_pd, value);
	}


	/**
	 * Total GI qty. 合計出庫数量.<p>
	 *
	 */
	public MCNumber ttl_gi_qty() {
		return getConstNumber(offset + 56, $ttl_gi_qty);
	}

	/**
	 * Total GI qty. 合計出庫数量.<p>
	 *
	 */
	public void ttl_gi_qty(MCNumber value) {
		setConstNumber(offset + 56, $ttl_gi_qty, value);
	}

	/**
	 * Total GI qty. 合計出庫数量.<p>
	 *
	 */
	public void ttl_gi_qty(int value) {
		setConstNumber(offset + 56, $ttl_gi_qty, value);
	}

	/**
	 * Total GI qty. 合計出庫数量.<p>
	 *
	 */
	public void ttl_gi_qty(long value) {
		setConstNumber(offset + 56, $ttl_gi_qty, value);
	}

	/**
	 * Total GI qty. 合計出庫数量.<p>
	 *
	 */
	public void ttl_gi_qty(float value) {
		setConstNumber(offset + 56, $ttl_gi_qty, value);
	}

	/**
	 * Total GI qty. 合計出庫数量.<p>
	 *
	 */
	public void ttl_gi_qty(double value) {
		setConstNumber(offset + 56, $ttl_gi_qty, value);
	}


	/**
	 * Total GI amount 合計出庫金額.<p>
	 *
	 */
	public MCNumber ttl_gi_amt() {
		return getConstNumber(offset + 57, $ttl_gi_amt);
	}

	/**
	 * Total GI amount 合計出庫金額.<p>
	 *
	 */
	public void ttl_gi_amt(MCNumber value) {
		setConstNumber(offset + 57, $ttl_gi_amt, value);
	}

	/**
	 * Total GI amount 合計出庫金額.<p>
	 *
	 */
	public void ttl_gi_amt(int value) {
		setConstNumber(offset + 57, $ttl_gi_amt, value);
	}

	/**
	 * Total GI amount 合計出庫金額.<p>
	 *
	 */
	public void ttl_gi_amt(long value) {
		setConstNumber(offset + 57, $ttl_gi_amt, value);
	}

	/**
	 * Total GI amount 合計出庫金額.<p>
	 *
	 */
	public void ttl_gi_amt(float value) {
		setConstNumber(offset + 57, $ttl_gi_amt, value);
	}

	/**
	 * Total GI amount 合計出庫金額.<p>
	 *
	 */
	public void ttl_gi_amt(double value) {
		setConstNumber(offset + 57, $ttl_gi_amt, value);
	}


	/**
	 * Average inventory quantity 平均在庫数量.<p>
	 *
	 */
	public MCNumber avg_stk_qty() {
		return getConstNumber(offset + 58, $avg_stk_qty);
	}

	/**
	 * Average inventory quantity 平均在庫数量.<p>
	 *
	 */
	public void avg_stk_qty(MCNumber value) {
		setConstNumber(offset + 58, $avg_stk_qty, value);
	}

	/**
	 * Average inventory quantity 平均在庫数量.<p>
	 *
	 */
	public void avg_stk_qty(int value) {
		setConstNumber(offset + 58, $avg_stk_qty, value);
	}

	/**
	 * Average inventory quantity 平均在庫数量.<p>
	 *
	 */
	public void avg_stk_qty(long value) {
		setConstNumber(offset + 58, $avg_stk_qty, value);
	}

	/**
	 * Average inventory quantity 平均在庫数量.<p>
	 *
	 */
	public void avg_stk_qty(float value) {
		setConstNumber(offset + 58, $avg_stk_qty, value);
	}

	/**
	 * Average inventory quantity 平均在庫数量.<p>
	 *
	 */
	public void avg_stk_qty(double value) {
		setConstNumber(offset + 58, $avg_stk_qty, value);
	}


	/**
	 * Average inventory amount 平均在庫金額.<p>
	 *
	 */
	public MCNumber avg_stk_amt() {
		return getConstNumber(offset + 59, $avg_stk_amt);
	}

	/**
	 * Average inventory amount 平均在庫金額.<p>
	 *
	 */
	public void avg_stk_amt(MCNumber value) {
		setConstNumber(offset + 59, $avg_stk_amt, value);
	}

	/**
	 * Average inventory amount 平均在庫金額.<p>
	 *
	 */
	public void avg_stk_amt(int value) {
		setConstNumber(offset + 59, $avg_stk_amt, value);
	}

	/**
	 * Average inventory amount 平均在庫金額.<p>
	 *
	 */
	public void avg_stk_amt(long value) {
		setConstNumber(offset + 59, $avg_stk_amt, value);
	}

	/**
	 * Average inventory amount 平均在庫金額.<p>
	 *
	 */
	public void avg_stk_amt(float value) {
		setConstNumber(offset + 59, $avg_stk_amt, value);
	}

	/**
	 * Average inventory amount 平均在庫金額.<p>
	 *
	 */
	public void avg_stk_amt(double value) {
		setConstNumber(offset + 59, $avg_stk_amt, value);
	}


	/**
	 * Average GI qty. per day 一日あたり平均出庫数量.<p>
	 *
	 */
	public MCNumber avg_gi_qty() {
		return getConstNumber(offset + 60, $avg_gi_qty);
	}

	/**
	 * Average GI qty. per day 一日あたり平均出庫数量.<p>
	 *
	 */
	public void avg_gi_qty(MCNumber value) {
		setConstNumber(offset + 60, $avg_gi_qty, value);
	}

	/**
	 * Average GI qty. per day 一日あたり平均出庫数量.<p>
	 *
	 */
	public void avg_gi_qty(int value) {
		setConstNumber(offset + 60, $avg_gi_qty, value);
	}

	/**
	 * Average GI qty. per day 一日あたり平均出庫数量.<p>
	 *
	 */
	public void avg_gi_qty(long value) {
		setConstNumber(offset + 60, $avg_gi_qty, value);
	}

	/**
	 * Average GI qty. per day 一日あたり平均出庫数量.<p>
	 *
	 */
	public void avg_gi_qty(float value) {
		setConstNumber(offset + 60, $avg_gi_qty, value);
	}

	/**
	 * Average GI qty. per day 一日あたり平均出庫数量.<p>
	 *
	 */
	public void avg_gi_qty(double value) {
		setConstNumber(offset + 60, $avg_gi_qty, value);
	}


	/**
	 * Average GI amount per day 一日あたり平均出庫金額.<p>
	 *
	 */
	public MCNumber avg_gi_amt() {
		return getConstNumber(offset + 61, $avg_gi_amt);
	}

	/**
	 * Average GI amount per day 一日あたり平均出庫金額.<p>
	 *
	 */
	public void avg_gi_amt(MCNumber value) {
		setConstNumber(offset + 61, $avg_gi_amt, value);
	}

	/**
	 * Average GI amount per day 一日あたり平均出庫金額.<p>
	 *
	 */
	public void avg_gi_amt(int value) {
		setConstNumber(offset + 61, $avg_gi_amt, value);
	}

	/**
	 * Average GI amount per day 一日あたり平均出庫金額.<p>
	 *
	 */
	public void avg_gi_amt(long value) {
		setConstNumber(offset + 61, $avg_gi_amt, value);
	}

	/**
	 * Average GI amount per day 一日あたり平均出庫金額.<p>
	 *
	 */
	public void avg_gi_amt(float value) {
		setConstNumber(offset + 61, $avg_gi_amt, value);
	}

	/**
	 * Average GI amount per day 一日あたり平均出庫金額.<p>
	 *
	 */
	public void avg_gi_amt(double value) {
		setConstNumber(offset + 61, $avg_gi_amt, value);
	}


	/**
	 * Number of days to GI 出庫対応日数.<p>
	 *
	 */
	public MCNumber gi_days() {
		return getConstNumber(offset + 62, $gi_days);
	}

	/**
	 * Number of days to GI 出庫対応日数.<p>
	 *
	 */
	public void gi_days(MCNumber value) {
		setConstNumber(offset + 62, $gi_days, value);
	}

	/**
	 * Number of days to GI 出庫対応日数.<p>
	 *
	 */
	public void gi_days(int value) {
		setConstNumber(offset + 62, $gi_days, value);
	}

	/**
	 * Number of days to GI 出庫対応日数.<p>
	 *
	 */
	public void gi_days(long value) {
		setConstNumber(offset + 62, $gi_days, value);
	}

	/**
	 * Number of days to GI 出庫対応日数.<p>
	 *
	 */
	public void gi_days(float value) {
		setConstNumber(offset + 62, $gi_days, value);
	}

	/**
	 * Number of days to GI 出庫対応日数.<p>
	 *
	 */
	public void gi_days(double value) {
		setConstNumber(offset + 62, $gi_days, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 63, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 63, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 64, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 64, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 65, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 65, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 66, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 66, $itm_typ_d_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 67, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 67, $itm_grp_p, row);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			return in_xfr_typ();
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			return in_xfr_typ_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
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
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($stk_amt_rnd_typ.equalsIgnoreCase(name)) {
			return stk_amt_rnd_typ();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			return stk_amt_dec_place();
		}
		if ($non_mov_mons.equalsIgnoreCase(name)) {
			return non_mov_mons();
		}
		if ($stk_trn_ovr_rate.equalsIgnoreCase(name)) {
			return stk_trn_ovr_rate();
		}
		if ($stk_trn_ovr_pd.equalsIgnoreCase(name)) {
			return stk_trn_ovr_pd();
		}
		if ($ttl_gi_qty.equalsIgnoreCase(name)) {
			return ttl_gi_qty();
		}
		if ($ttl_gi_amt.equalsIgnoreCase(name)) {
			return ttl_gi_amt();
		}
		if ($avg_stk_qty.equalsIgnoreCase(name)) {
			return avg_stk_qty();
		}
		if ($avg_stk_amt.equalsIgnoreCase(name)) {
			return avg_stk_amt();
		}
		if ($avg_gi_qty.equalsIgnoreCase(name)) {
			return avg_gi_qty();
		}
		if ($avg_gi_amt.equalsIgnoreCase(name)) {
			return avg_gi_amt();
		}
		if ($gi_days.equalsIgnoreCase(name)) {
			return gi_days();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($non_mov_base_ym.equalsIgnoreCase(name)) {
			return non_mov_base_ym();
		}
		if ($rcnt_gi_schd_dt.equalsIgnoreCase(name)) {
			return rcnt_gi_schd_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			return in_xfr_typ();
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			return in_xfr_typ_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
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
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($stk_amt_rnd_typ.equalsIgnoreCase(name)) {
			return stk_amt_rnd_typ();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			return stk_amt_dec_place();
		}
		if ($non_mov_mons.equalsIgnoreCase(name)) {
			return non_mov_mons();
		}
		if ($stk_trn_ovr_rate.equalsIgnoreCase(name)) {
			return stk_trn_ovr_rate();
		}
		if ($stk_trn_ovr_pd.equalsIgnoreCase(name)) {
			return stk_trn_ovr_pd();
		}
		if ($ttl_gi_qty.equalsIgnoreCase(name)) {
			return ttl_gi_qty();
		}
		if ($ttl_gi_amt.equalsIgnoreCase(name)) {
			return ttl_gi_amt();
		}
		if ($avg_stk_qty.equalsIgnoreCase(name)) {
			return avg_stk_qty();
		}
		if ($avg_stk_amt.equalsIgnoreCase(name)) {
			return avg_stk_amt();
		}
		if ($avg_gi_qty.equalsIgnoreCase(name)) {
			return avg_gi_qty();
		}
		if ($avg_gi_amt.equalsIgnoreCase(name)) {
			return avg_gi_amt();
		}
		if ($gi_days.equalsIgnoreCase(name)) {
			return gi_days();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($non_mov_base_ym.equalsIgnoreCase(name)) {
			return non_mov_base_ym();
		}
		if ($rcnt_gi_schd_dt.equalsIgnoreCase(name)) {
			return rcnt_gi_schd_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
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
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			in_xfr_typ(value);
			return;
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			in_xfr_typ_nm(value);
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
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
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
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($stk_amt_rnd_typ.equalsIgnoreCase(name)) {
			stk_amt_rnd_typ(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($non_mov_mons.equalsIgnoreCase(name)) {
			non_mov_mons(value);
			return;
		}
		if ($stk_trn_ovr_rate.equalsIgnoreCase(name)) {
			stk_trn_ovr_rate(value);
			return;
		}
		if ($stk_trn_ovr_pd.equalsIgnoreCase(name)) {
			stk_trn_ovr_pd(value);
			return;
		}
		if ($ttl_gi_qty.equalsIgnoreCase(name)) {
			ttl_gi_qty(value);
			return;
		}
		if ($ttl_gi_amt.equalsIgnoreCase(name)) {
			ttl_gi_amt(value);
			return;
		}
		if ($avg_stk_qty.equalsIgnoreCase(name)) {
			avg_stk_qty(value);
			return;
		}
		if ($avg_stk_amt.equalsIgnoreCase(name)) {
			avg_stk_amt(value);
			return;
		}
		if ($avg_gi_qty.equalsIgnoreCase(name)) {
			avg_gi_qty(value);
			return;
		}
		if ($avg_gi_amt.equalsIgnoreCase(name)) {
			avg_gi_amt(value);
			return;
		}
		if ($gi_days.equalsIgnoreCase(name)) {
			gi_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($non_mov_mons.equalsIgnoreCase(name)) {
			non_mov_mons(value);
			return;
		}
		if ($stk_trn_ovr_rate.equalsIgnoreCase(name)) {
			stk_trn_ovr_rate(value);
			return;
		}
		if ($stk_trn_ovr_pd.equalsIgnoreCase(name)) {
			stk_trn_ovr_pd(value);
			return;
		}
		if ($ttl_gi_qty.equalsIgnoreCase(name)) {
			ttl_gi_qty(value);
			return;
		}
		if ($ttl_gi_amt.equalsIgnoreCase(name)) {
			ttl_gi_amt(value);
			return;
		}
		if ($avg_stk_qty.equalsIgnoreCase(name)) {
			avg_stk_qty(value);
			return;
		}
		if ($avg_stk_amt.equalsIgnoreCase(name)) {
			avg_stk_amt(value);
			return;
		}
		if ($avg_gi_qty.equalsIgnoreCase(name)) {
			avg_gi_qty(value);
			return;
		}
		if ($avg_gi_amt.equalsIgnoreCase(name)) {
			avg_gi_amt(value);
			return;
		}
		if ($gi_days.equalsIgnoreCase(name)) {
			gi_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($non_mov_mons.equalsIgnoreCase(name)) {
			non_mov_mons(value);
			return;
		}
		if ($stk_trn_ovr_rate.equalsIgnoreCase(name)) {
			stk_trn_ovr_rate(value);
			return;
		}
		if ($stk_trn_ovr_pd.equalsIgnoreCase(name)) {
			stk_trn_ovr_pd(value);
			return;
		}
		if ($ttl_gi_qty.equalsIgnoreCase(name)) {
			ttl_gi_qty(value);
			return;
		}
		if ($ttl_gi_amt.equalsIgnoreCase(name)) {
			ttl_gi_amt(value);
			return;
		}
		if ($avg_stk_qty.equalsIgnoreCase(name)) {
			avg_stk_qty(value);
			return;
		}
		if ($avg_stk_amt.equalsIgnoreCase(name)) {
			avg_stk_amt(value);
			return;
		}
		if ($avg_gi_qty.equalsIgnoreCase(name)) {
			avg_gi_qty(value);
			return;
		}
		if ($avg_gi_amt.equalsIgnoreCase(name)) {
			avg_gi_amt(value);
			return;
		}
		if ($gi_days.equalsIgnoreCase(name)) {
			gi_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($non_mov_mons.equalsIgnoreCase(name)) {
			non_mov_mons(value);
			return;
		}
		if ($stk_trn_ovr_rate.equalsIgnoreCase(name)) {
			stk_trn_ovr_rate(value);
			return;
		}
		if ($stk_trn_ovr_pd.equalsIgnoreCase(name)) {
			stk_trn_ovr_pd(value);
			return;
		}
		if ($ttl_gi_qty.equalsIgnoreCase(name)) {
			ttl_gi_qty(value);
			return;
		}
		if ($ttl_gi_amt.equalsIgnoreCase(name)) {
			ttl_gi_amt(value);
			return;
		}
		if ($avg_stk_qty.equalsIgnoreCase(name)) {
			avg_stk_qty(value);
			return;
		}
		if ($avg_stk_amt.equalsIgnoreCase(name)) {
			avg_stk_amt(value);
			return;
		}
		if ($avg_gi_qty.equalsIgnoreCase(name)) {
			avg_gi_qty(value);
			return;
		}
		if ($avg_gi_amt.equalsIgnoreCase(name)) {
			avg_gi_amt(value);
			return;
		}
		if ($gi_days.equalsIgnoreCase(name)) {
			gi_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($non_mov_mons.equalsIgnoreCase(name)) {
			non_mov_mons(value);
			return;
		}
		if ($stk_trn_ovr_rate.equalsIgnoreCase(name)) {
			stk_trn_ovr_rate(value);
			return;
		}
		if ($stk_trn_ovr_pd.equalsIgnoreCase(name)) {
			stk_trn_ovr_pd(value);
			return;
		}
		if ($ttl_gi_qty.equalsIgnoreCase(name)) {
			ttl_gi_qty(value);
			return;
		}
		if ($ttl_gi_amt.equalsIgnoreCase(name)) {
			ttl_gi_amt(value);
			return;
		}
		if ($avg_stk_qty.equalsIgnoreCase(name)) {
			avg_stk_qty(value);
			return;
		}
		if ($avg_stk_amt.equalsIgnoreCase(name)) {
			avg_stk_amt(value);
			return;
		}
		if ($avg_gi_qty.equalsIgnoreCase(name)) {
			avg_gi_qty(value);
			return;
		}
		if ($avg_gi_amt.equalsIgnoreCase(name)) {
			avg_gi_amt(value);
			return;
		}
		if ($gi_days.equalsIgnoreCase(name)) {
			gi_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($non_mov_base_ym.equalsIgnoreCase(name)) {
			non_mov_base_ym(value);
			return;
		}
		if ($rcnt_gi_schd_dt.equalsIgnoreCase(name)) {
			rcnt_gi_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
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
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			in_xfr_typ(value);
			return;
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			in_xfr_typ_nm(value);
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
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
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
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($stk_amt_rnd_typ.equalsIgnoreCase(name)) {
			stk_amt_rnd_typ(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($non_mov_mons.equalsIgnoreCase(name)) {
			non_mov_mons(value);
			return;
		}
		if ($stk_trn_ovr_rate.equalsIgnoreCase(name)) {
			stk_trn_ovr_rate(value);
			return;
		}
		if ($stk_trn_ovr_pd.equalsIgnoreCase(name)) {
			stk_trn_ovr_pd(value);
			return;
		}
		if ($ttl_gi_qty.equalsIgnoreCase(name)) {
			ttl_gi_qty(value);
			return;
		}
		if ($ttl_gi_amt.equalsIgnoreCase(name)) {
			ttl_gi_amt(value);
			return;
		}
		if ($avg_stk_qty.equalsIgnoreCase(name)) {
			avg_stk_qty(value);
			return;
		}
		if ($avg_stk_amt.equalsIgnoreCase(name)) {
			avg_stk_amt(value);
			return;
		}
		if ($avg_gi_qty.equalsIgnoreCase(name)) {
			avg_gi_qty(value);
			return;
		}
		if ($avg_gi_amt.equalsIgnoreCase(name)) {
			avg_gi_amt(value);
			return;
		}
		if ($gi_days.equalsIgnoreCase(name)) {
			gi_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($non_mov_mons.equalsIgnoreCase(name)) {
			non_mov_mons(value);
			return;
		}
		if ($stk_trn_ovr_rate.equalsIgnoreCase(name)) {
			stk_trn_ovr_rate(value);
			return;
		}
		if ($stk_trn_ovr_pd.equalsIgnoreCase(name)) {
			stk_trn_ovr_pd(value);
			return;
		}
		if ($ttl_gi_qty.equalsIgnoreCase(name)) {
			ttl_gi_qty(value);
			return;
		}
		if ($ttl_gi_amt.equalsIgnoreCase(name)) {
			ttl_gi_amt(value);
			return;
		}
		if ($avg_stk_qty.equalsIgnoreCase(name)) {
			avg_stk_qty(value);
			return;
		}
		if ($avg_stk_amt.equalsIgnoreCase(name)) {
			avg_stk_amt(value);
			return;
		}
		if ($avg_gi_qty.equalsIgnoreCase(name)) {
			avg_gi_qty(value);
			return;
		}
		if ($avg_gi_amt.equalsIgnoreCase(name)) {
			avg_gi_amt(value);
			return;
		}
		if ($gi_days.equalsIgnoreCase(name)) {
			gi_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($non_mov_mons.equalsIgnoreCase(name)) {
			non_mov_mons(value);
			return;
		}
		if ($stk_trn_ovr_rate.equalsIgnoreCase(name)) {
			stk_trn_ovr_rate(value);
			return;
		}
		if ($stk_trn_ovr_pd.equalsIgnoreCase(name)) {
			stk_trn_ovr_pd(value);
			return;
		}
		if ($ttl_gi_qty.equalsIgnoreCase(name)) {
			ttl_gi_qty(value);
			return;
		}
		if ($ttl_gi_amt.equalsIgnoreCase(name)) {
			ttl_gi_amt(value);
			return;
		}
		if ($avg_stk_qty.equalsIgnoreCase(name)) {
			avg_stk_qty(value);
			return;
		}
		if ($avg_stk_amt.equalsIgnoreCase(name)) {
			avg_stk_amt(value);
			return;
		}
		if ($avg_gi_qty.equalsIgnoreCase(name)) {
			avg_gi_qty(value);
			return;
		}
		if ($avg_gi_amt.equalsIgnoreCase(name)) {
			avg_gi_amt(value);
			return;
		}
		if ($gi_days.equalsIgnoreCase(name)) {
			gi_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($non_mov_mons.equalsIgnoreCase(name)) {
			non_mov_mons(value);
			return;
		}
		if ($stk_trn_ovr_rate.equalsIgnoreCase(name)) {
			stk_trn_ovr_rate(value);
			return;
		}
		if ($stk_trn_ovr_pd.equalsIgnoreCase(name)) {
			stk_trn_ovr_pd(value);
			return;
		}
		if ($ttl_gi_qty.equalsIgnoreCase(name)) {
			ttl_gi_qty(value);
			return;
		}
		if ($ttl_gi_amt.equalsIgnoreCase(name)) {
			ttl_gi_amt(value);
			return;
		}
		if ($avg_stk_qty.equalsIgnoreCase(name)) {
			avg_stk_qty(value);
			return;
		}
		if ($avg_stk_amt.equalsIgnoreCase(name)) {
			avg_stk_amt(value);
			return;
		}
		if ($avg_gi_qty.equalsIgnoreCase(name)) {
			avg_gi_qty(value);
			return;
		}
		if ($avg_gi_amt.equalsIgnoreCase(name)) {
			avg_gi_amt(value);
			return;
		}
		if ($gi_days.equalsIgnoreCase(name)) {
			gi_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($non_mov_mons.equalsIgnoreCase(name)) {
			non_mov_mons(value);
			return;
		}
		if ($stk_trn_ovr_rate.equalsIgnoreCase(name)) {
			stk_trn_ovr_rate(value);
			return;
		}
		if ($stk_trn_ovr_pd.equalsIgnoreCase(name)) {
			stk_trn_ovr_pd(value);
			return;
		}
		if ($ttl_gi_qty.equalsIgnoreCase(name)) {
			ttl_gi_qty(value);
			return;
		}
		if ($ttl_gi_amt.equalsIgnoreCase(name)) {
			ttl_gi_amt(value);
			return;
		}
		if ($avg_stk_qty.equalsIgnoreCase(name)) {
			avg_stk_qty(value);
			return;
		}
		if ($avg_stk_amt.equalsIgnoreCase(name)) {
			avg_stk_amt(value);
			return;
		}
		if ($avg_gi_qty.equalsIgnoreCase(name)) {
			avg_gi_qty(value);
			return;
		}
		if ($avg_gi_amt.equalsIgnoreCase(name)) {
			avg_gi_amt(value);
			return;
		}
		if ($gi_days.equalsIgnoreCase(name)) {
			gi_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($non_mov_base_ym.equalsIgnoreCase(name)) {
			non_mov_base_ym(value);
			return;
		}
		if ($rcnt_gi_schd_dt.equalsIgnoreCase(name)) {
			rcnt_gi_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($str_ln_p.equalsIgnoreCase(name)) {
			return str_ln_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($pack_unit_qty_p.equalsIgnoreCase(name)) {
			return pack_unit_qty_p();
		}
		if ($stk_qty_p.equalsIgnoreCase(name)) {
			return stk_qty_p();
		}
		if ($std_unit_cost_amt_p.equalsIgnoreCase(name)) {
			return std_unit_cost_amt_p();
		}
		if ($stk_amt_p.equalsIgnoreCase(name)) {
			return stk_amt_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
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
		if ($str_ln_p.equalsIgnoreCase(name)) {
			str_ln_p(
				((MCContainerMeta) str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($pack_unit_qty_p.equalsIgnoreCase(name)) {
			pack_unit_qty_p(
				((MCContainerMeta) pack_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($stk_qty_p.equalsIgnoreCase(name)) {
			stk_qty_p(
				((MCContainerMeta) stk_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($std_unit_cost_amt_p.equalsIgnoreCase(name)) {
			std_unit_cost_amt_p(
				((MCContainerMeta) std_unit_cost_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($stk_amt_p.equalsIgnoreCase(name)) {
			stk_amt_p(
				((MCContainerMeta) stk_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5170.ItmGrpR.class, value)
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

	public String str_ln_cd() {
		return str_ln_p().str_ln_cd();
	}

	public void str_ln_cd(String value) {
		str_ln_p().str_ln_cd(value);
	}

	public String str_ln_nm() {
		return str_ln_p().str_ln_nm();
	}

	public void str_ln_nm(String value) {
		str_ln_p().str_ln_nm(value);
	}

	public boolean str_ln_cd_none_flg() {
		return str_ln_p().str_ln_cd_none_flg();
	}

	public void str_ln_cd_none_flg(boolean value) {
		str_ln_p().str_ln_cd_none_flg(value);
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

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return pack_unit_qty_p().qty();
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		pack_unit_qty_p().qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		pack_unit_qty_p().qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		pack_unit_qty_p().qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		pack_unit_qty_p().qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		pack_unit_qty_p().qty(value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public MCNumber stk_qty() {
		return stk_qty_p().qty();
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(MCNumber value) {
		stk_qty_p().qty(value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(int value) {
		stk_qty_p().qty(value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(long value) {
		stk_qty_p().qty(value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(float value) {
		stk_qty_p().qty(value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(double value) {
		stk_qty_p().qty(value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber std_unit_cost() {
		return std_unit_cost_amt_p().amt();
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(MCNumber value) {
		std_unit_cost_amt_p().amt(value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(int value) {
		std_unit_cost_amt_p().amt(value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(long value) {
		std_unit_cost_amt_p().amt(value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(float value) {
		std_unit_cost_amt_p().amt(value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(double value) {
		std_unit_cost_amt_p().amt(value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public MCNumber stk_amt() {
		return stk_amt_p().amt();
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(MCNumber value) {
		stk_amt_p().amt(value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(int value) {
		stk_amt_p().amt(value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(long value) {
		stk_amt_p().amt(value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(float value) {
		stk_amt_p().amt(value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(double value) {
		stk_amt_p().amt(value);
	}

	public String itm_grp_cd1() {
		return itm_grp_p().itm_grp_cd1();
	}

	public void itm_grp_cd1(String value) {
		itm_grp_p().itm_grp_cd1(value);
	}

	public String itm_grp_nm1() {
		return itm_grp_p().itm_grp_nm1();
	}

	public void itm_grp_nm1(String value) {
		itm_grp_p().itm_grp_nm1(value);
	}

	public String itm_grp_cd2() {
		return itm_grp_p().itm_grp_cd2();
	}

	public void itm_grp_cd2(String value) {
		itm_grp_p().itm_grp_cd2(value);
	}

	public String itm_grp_nm2() {
		return itm_grp_p().itm_grp_nm2();
	}

	public void itm_grp_nm2(String value) {
		itm_grp_p().itm_grp_nm2(value);
	}

	public String itm_grp_cd3() {
		return itm_grp_p().itm_grp_cd3();
	}

	public void itm_grp_cd3(String value) {
		itm_grp_p().itm_grp_cd3(value);
	}

	public String itm_grp_nm3() {
		return itm_grp_p().itm_grp_nm3();
	}

	public void itm_grp_nm3(String value) {
		itm_grp_p().itm_grp_nm3(value);
	}

	public String itm_grp_cd4() {
		return itm_grp_p().itm_grp_cd4();
	}

	public void itm_grp_cd4(String value) {
		itm_grp_p().itm_grp_cd4(value);
	}

	public String itm_grp_nm4() {
		return itm_grp_p().itm_grp_nm4();
	}

	public void itm_grp_nm4(String value) {
		itm_grp_p().itm_grp_nm4(value);
	}

	public String itm_grp_cd5() {
		return itm_grp_p().itm_grp_cd5();
	}

	public void itm_grp_cd5(String value) {
		itm_grp_p().itm_grp_cd5(value);
	}

	public String itm_grp_nm5() {
		return itm_grp_p().itm_grp_nm5();
	}

	public void itm_grp_nm5(String value) {
		itm_grp_p().itm_grp_nm5(value);
	}

	public String itm_grp_cd6() {
		return itm_grp_p().itm_grp_cd6();
	}

	public void itm_grp_cd6(String value) {
		itm_grp_p().itm_grp_cd6(value);
	}

	public String itm_grp_nm6() {
		return itm_grp_p().itm_grp_nm6();
	}

	public void itm_grp_nm6(String value) {
		itm_grp_p().itm_grp_nm6(value);
	}

	public String itm_grp_cd7() {
		return itm_grp_p().itm_grp_cd7();
	}

	public void itm_grp_cd7(String value) {
		itm_grp_p().itm_grp_cd7(value);
	}

	public String itm_grp_nm7() {
		return itm_grp_p().itm_grp_nm7();
	}

	public void itm_grp_nm7(String value) {
		itm_grp_p().itm_grp_nm7(value);
	}

	public String itm_grp_cd8() {
		return itm_grp_p().itm_grp_cd8();
	}

	public void itm_grp_cd8(String value) {
		itm_grp_p().itm_grp_cd8(value);
	}

	public String itm_grp_nm8() {
		return itm_grp_p().itm_grp_nm8();
	}

	public void itm_grp_nm8(String value) {
		itm_grp_p().itm_grp_nm8(value);
	}

	public String itm_grp_cd9() {
		return itm_grp_p().itm_grp_cd9();
	}

	public void itm_grp_cd9(String value) {
		itm_grp_p().itm_grp_cd9(value);
	}

	public String itm_grp_nm9() {
		return itm_grp_p().itm_grp_nm9();
	}

	public void itm_grp_nm9(String value) {
		itm_grp_p().itm_grp_nm9(value);
	}

	public String itm_grp_cd10() {
		return itm_grp_p().itm_grp_cd10();
	}

	public void itm_grp_cd10(String value) {
		itm_grp_p().itm_grp_cd10(value);
	}

	public String itm_grp_nm10() {
		return itm_grp_p().itm_grp_nm10();
	}

	public void itm_grp_nm10(String value) {
		itm_grp_p().itm_grp_nm10(value);
	}

}

