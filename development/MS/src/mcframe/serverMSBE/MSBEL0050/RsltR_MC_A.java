package mcframe.serverMSBE.MSBEL0050;

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
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public static final String $str_ln_cd_none_flg = "str_ln_cd_none_flg";
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
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
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
	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public static final String $pack_unit_qty = "pack_unit_qty";
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
	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public static final String $stk_qty = "stk_qty";
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
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $std_unit_cost = "std_unit_cost";
	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public static final String $stk_amt = "stk_amt";
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
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
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
	 * Base unit total GI qty. 基準単位合計出庫数量.<p>
	 *
	 */
	public static final String $base_unit_ttl_gi_qty = "base_unit_ttl_gi_qty";
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
	 * Base unit average inventory qty. 基準単位平均在庫数量.<p>
	 *
	 */
	public static final String $base_unit_avg_stk_qty = "base_unit_avg_stk_qty";
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
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $itm_grp_cd1 = "itm_grp_cd1";
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public static final String $itm_grp_nm1 = "itm_grp_nm1";
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $itm_grp_cd2 = "itm_grp_cd2";
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public static final String $itm_grp_nm2 = "itm_grp_nm2";
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $itm_grp_cd3 = "itm_grp_cd3";
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public static final String $itm_grp_nm3 = "itm_grp_nm3";
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $itm_grp_cd4 = "itm_grp_cd4";
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public static final String $itm_grp_nm4 = "itm_grp_nm4";
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $itm_grp_cd5 = "itm_grp_cd5";
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public static final String $itm_grp_nm5 = "itm_grp_nm5";
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $itm_grp_cd6 = "itm_grp_cd6";
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public static final String $itm_grp_nm6 = "itm_grp_nm6";
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $itm_grp_cd7 = "itm_grp_cd7";
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public static final String $itm_grp_nm7 = "itm_grp_nm7";
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $itm_grp_cd8 = "itm_grp_cd8";
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public static final String $itm_grp_nm8 = "itm_grp_nm8";
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $itm_grp_cd9 = "itm_grp_cd9";
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public static final String $itm_grp_nm9 = "itm_grp_nm9";
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public static final String $itm_grp_nm10 = "itm_grp_nm10";
	/**
	 * Location calendar cd. 場所カレンダＣＤ.<p>
	 *
	 */
	public static final String $loc_cal_cd = "loc_cal_cd";
	/**
	 * Distribution G calendar cd. 物流ＧカレンダＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cal_cd = "lg_grp_cal_cd";
	/**
	 * Number of operating days 稼働日数.<p>
	 *
	 */
	public static final String $cal_days = "cal_days";


	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta str_ln_cd_none_flg_META = createCommonMeta($str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta in_xfr_typ_META = createCommonMeta($in_xfr_typ, mcframe.commonMS.meta.MS_META.IN_XFR_TYP);
	public static final MCMeta in_xfr_typ_nm_META = createCommonMeta($in_xfr_typ_nm, mcframe.commonMS.meta.MS_META.IN_XFR_TYP_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pack_unit_dec_place_META = createCommonMeta($pack_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta stk_qty_META = createCommonMeta($stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta std_unit_cost_META = createCommonMeta($std_unit_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta stk_amt_META = createCommonMeta($stk_amt, mcframe.commonMA.meta.MA_META.MONEY);
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
	public static final MCMeta base_unit_ttl_gi_qty_META = createCommonMeta($base_unit_ttl_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ttl_gi_amt_META = createCommonMeta($ttl_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta avg_stk_qty_META = createCommonMeta($avg_stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_avg_stk_qty_META = createCommonMeta($base_unit_avg_stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta avg_stk_amt_META = createCommonMeta($avg_stk_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta avg_gi_qty_META = createCommonMeta($avg_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta avg_gi_amt_META = createCommonMeta($avg_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gi_days_META = createNumberMeta($gi_days);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta loc_cal_cd_META = createCommonMeta($loc_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta lg_grp_cal_cd_META = createCommonMeta($lg_grp_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta cal_days_META = createCommonMeta($cal_days, mcframe.commonMA.meta.MA_META.DAYS);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ac_ym_META,
			wg_cd_META,
			wg_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			lot_no_META,
			sublot_no_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			str_ln_cd_none_flg_META,
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
			quality_typ_META,
			quality_typ_nm_META,
			stk_insp_typ_META,
			stk_insp_typ_nm_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META,
			in_xfr_typ_META,
			in_xfr_typ_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			stk_arrv_bp_cd_META,
			stk_arrv_bp_nm_META,
			pack_unit_qty_META,
			pack_unit_cd_META,
			pack_unit_nm_META,
			pack_unit_dec_place_META,
			stk_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			std_unit_cost_META,
			stk_amt_META,
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
			base_unit_ttl_gi_qty_META,
			ttl_gi_amt_META,
			avg_stk_qty_META,
			base_unit_avg_stk_qty_META,
			avg_stk_amt_META,
			avg_gi_qty_META,
			avg_gi_amt_META,
			gi_days_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_grp_cd1_META,
			itm_grp_nm1_META,
			itm_grp_cd2_META,
			itm_grp_nm2_META,
			itm_grp_cd3_META,
			itm_grp_nm3_META,
			itm_grp_cd4_META,
			itm_grp_nm4_META,
			itm_grp_cd5_META,
			itm_grp_nm5_META,
			itm_grp_cd6_META,
			itm_grp_nm6_META,
			itm_grp_cd7_META,
			itm_grp_nm7_META,
			itm_grp_cd8_META,
			itm_grp_nm8_META,
			itm_grp_cd9_META,
			itm_grp_nm9_META,
			itm_grp_cd10_META,
			itm_grp_nm10_META,
			loc_cal_cd_META,
			lg_grp_cal_cd_META,
			cal_days_META
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
				{$quality_typ, "MAC_QUALITY_TYP"},	// quality_typ
				{$stk_insp_typ, "MSC_STK_INSP_TYP"},	// stk_insp_typ
				{$in_xfr_typ, "MSC_IN_XFR_TYP"},	// in_xfr_typ
				{$asst_typ, "MAC_ASST_TYP"},	// asst_typ
				{$stk_id_typ, "MSC_STK_ID_TYP"},	// stk_id_typ
				{$itm_typ, "MAC_ITM_TYP"}	// itm_typ
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

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
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


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 5, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 5, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 6, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 6, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 7, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 7, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 8, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 8, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 9, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 9, $itm_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 10, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 10, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 11, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 11, $sublot_no, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 12, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 12, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 13, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 13, $loc_nm, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 14, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 14, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 15, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 15, $str_ln_nm, value);
	}


	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 16, $str_ln_cd_none_flg);
	}

	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 16, $str_ln_cd_none_flg, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 17, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 17, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 18, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 18, $site_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 19, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 19, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 20, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 20, $lg_grp_nm, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 21, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 21, $alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 22, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 22, $alloc_grp_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 23, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 23, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 24, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 24, $loc_grp_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 25, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 25, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 26, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 26, $gd_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 27, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 27, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 28, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 28, $quality_typ_nm, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 29, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 29, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 30, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 30, $stk_insp_typ_nm, value);
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
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 32, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 32, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 33, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 33, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 34, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 34, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 35, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 35, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 36, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 36, $wrk_nm, value);
	}


	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public String in_xfr_typ() {
		return getConstString(offset + 37, $in_xfr_typ);
	}

	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public void in_xfr_typ(String value) {
		setConstString(offset + 37, $in_xfr_typ, value);
	}


	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public String in_xfr_typ_nm() {
		return getConstString(offset + 38, $in_xfr_typ_nm);
	}

	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public void in_xfr_typ_nm(String value) {
		setConstString(offset + 38, $in_xfr_typ_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 39, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 39, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 40, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 40, $asst_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 41, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 41, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 42, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 42, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 43, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 43, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 44, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 44, $stk_bp_nm, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 45, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 45, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 46, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 46, $stk_arrv_bp_nm, value);
	}


	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 47, $pack_unit_qty);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 47, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 47, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 47, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 47, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 47, $pack_unit_qty, value);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 48, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 48, $pack_unit_cd, value);
	}


	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 49, $pack_unit_nm);
	}

	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 49, $pack_unit_nm, value);
	}


	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_unit_dec_place() {
		return getConstNumber(offset + 50, $pack_unit_dec_place);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 50, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(int value) {
		setConstNumber(offset + 50, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(long value) {
		setConstNumber(offset + 50, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(float value) {
		setConstNumber(offset + 50, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(double value) {
		setConstNumber(offset + 50, $pack_unit_dec_place, value);
	}


	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public MCNumber stk_qty() {
		return getConstNumber(offset + 51, $stk_qty);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(MCNumber value) {
		setConstNumber(offset + 51, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(int value) {
		setConstNumber(offset + 51, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(long value) {
		setConstNumber(offset + 51, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(float value) {
		setConstNumber(offset + 51, $stk_qty, value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(double value) {
		setConstNumber(offset + 51, $stk_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 52, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 52, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 53, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 53, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 54, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 54, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 54, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 54, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 54, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 54, $base_unit_dec_place, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber std_unit_cost() {
		return getConstNumber(offset + 55, $std_unit_cost);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(MCNumber value) {
		setConstNumber(offset + 55, $std_unit_cost, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(int value) {
		setConstNumber(offset + 55, $std_unit_cost, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(long value) {
		setConstNumber(offset + 55, $std_unit_cost, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(float value) {
		setConstNumber(offset + 55, $std_unit_cost, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(double value) {
		setConstNumber(offset + 55, $std_unit_cost, value);
	}


	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public MCNumber stk_amt() {
		return getConstNumber(offset + 56, $stk_amt);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(MCNumber value) {
		setConstNumber(offset + 56, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(int value) {
		setConstNumber(offset + 56, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(long value) {
		setConstNumber(offset + 56, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(float value) {
		setConstNumber(offset + 56, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(double value) {
		setConstNumber(offset + 56, $stk_amt, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 57, $base_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 57, $base_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 58, $base_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 58, $base_cur_nm, value);
	}


	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber stk_amt_dec_place() {
		return getConstNumber(offset + 59, $stk_amt_dec_place);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 59, $stk_amt_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(int value) {
		setConstNumber(offset + 59, $stk_amt_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(long value) {
		setConstNumber(offset + 59, $stk_amt_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(float value) {
		setConstNumber(offset + 59, $stk_amt_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(double value) {
		setConstNumber(offset + 59, $stk_amt_dec_place, value);
	}


	/**
	 * Inventory amount rounding type 在庫金額端数処理区分.<p>
	 *
	 */
	public String stk_amt_rnd_typ() {
		return getConstString(offset + 60, $stk_amt_rnd_typ);
	}

	/**
	 * Inventory amount rounding type 在庫金額端数処理区分.<p>
	 *
	 */
	public void stk_amt_rnd_typ(String value) {
		setConstString(offset + 60, $stk_amt_rnd_typ, value);
	}


	/**
	 * Non-moving base month 滞留基準年月.<p>
	 *
	 */
	public MCDate non_mov_base_ym() {
		return getConstDate(offset + 61, $non_mov_base_ym);
	}

	/**
	 * Non-moving base month 滞留基準年月.<p>
	 *
	 */
	public void non_mov_base_ym(MCDate value) {
		setConstDate(offset + 61, $non_mov_base_ym, value);
	}


	/**
	 * Number of non-moving months 滞留月数.<p>
	 *
	 */
	public MCNumber non_mov_mons() {
		return getConstNumber(offset + 62, $non_mov_mons);
	}

	/**
	 * Number of non-moving months 滞留月数.<p>
	 *
	 */
	public void non_mov_mons(MCNumber value) {
		setConstNumber(offset + 62, $non_mov_mons, value);
	}

	/**
	 * Number of non-moving months 滞留月数.<p>
	 *
	 */
	public void non_mov_mons(int value) {
		setConstNumber(offset + 62, $non_mov_mons, value);
	}

	/**
	 * Number of non-moving months 滞留月数.<p>
	 *
	 */
	public void non_mov_mons(long value) {
		setConstNumber(offset + 62, $non_mov_mons, value);
	}

	/**
	 * Number of non-moving months 滞留月数.<p>
	 *
	 */
	public void non_mov_mons(float value) {
		setConstNumber(offset + 62, $non_mov_mons, value);
	}

	/**
	 * Number of non-moving months 滞留月数.<p>
	 *
	 */
	public void non_mov_mons(double value) {
		setConstNumber(offset + 62, $non_mov_mons, value);
	}


	/**
	 * Earliest scheduled GI date 直近出庫予定日.<p>
	 *
	 */
	public MCDate rcnt_gi_schd_dt() {
		return getConstDate(offset + 63, $rcnt_gi_schd_dt);
	}

	/**
	 * Earliest scheduled GI date 直近出庫予定日.<p>
	 *
	 */
	public void rcnt_gi_schd_dt(MCDate value) {
		setConstDate(offset + 63, $rcnt_gi_schd_dt, value);
	}


	/**
	 * Inventory turnover ratio 在庫回転率.<p>
	 *
	 */
	public MCNumber stk_trn_ovr_rate() {
		return getConstNumber(offset + 64, $stk_trn_ovr_rate);
	}

	/**
	 * Inventory turnover ratio 在庫回転率.<p>
	 *
	 */
	public void stk_trn_ovr_rate(MCNumber value) {
		setConstNumber(offset + 64, $stk_trn_ovr_rate, value);
	}

	/**
	 * Inventory turnover ratio 在庫回転率.<p>
	 *
	 */
	public void stk_trn_ovr_rate(int value) {
		setConstNumber(offset + 64, $stk_trn_ovr_rate, value);
	}

	/**
	 * Inventory turnover ratio 在庫回転率.<p>
	 *
	 */
	public void stk_trn_ovr_rate(long value) {
		setConstNumber(offset + 64, $stk_trn_ovr_rate, value);
	}

	/**
	 * Inventory turnover ratio 在庫回転率.<p>
	 *
	 */
	public void stk_trn_ovr_rate(float value) {
		setConstNumber(offset + 64, $stk_trn_ovr_rate, value);
	}

	/**
	 * Inventory turnover ratio 在庫回転率.<p>
	 *
	 */
	public void stk_trn_ovr_rate(double value) {
		setConstNumber(offset + 64, $stk_trn_ovr_rate, value);
	}


	/**
	 * Inventory turnover period 在庫回転期間.<p>
	 *
	 */
	public MCNumber stk_trn_ovr_pd() {
		return getConstNumber(offset + 65, $stk_trn_ovr_pd);
	}

	/**
	 * Inventory turnover period 在庫回転期間.<p>
	 *
	 */
	public void stk_trn_ovr_pd(MCNumber value) {
		setConstNumber(offset + 65, $stk_trn_ovr_pd, value);
	}

	/**
	 * Inventory turnover period 在庫回転期間.<p>
	 *
	 */
	public void stk_trn_ovr_pd(int value) {
		setConstNumber(offset + 65, $stk_trn_ovr_pd, value);
	}

	/**
	 * Inventory turnover period 在庫回転期間.<p>
	 *
	 */
	public void stk_trn_ovr_pd(long value) {
		setConstNumber(offset + 65, $stk_trn_ovr_pd, value);
	}

	/**
	 * Inventory turnover period 在庫回転期間.<p>
	 *
	 */
	public void stk_trn_ovr_pd(float value) {
		setConstNumber(offset + 65, $stk_trn_ovr_pd, value);
	}

	/**
	 * Inventory turnover period 在庫回転期間.<p>
	 *
	 */
	public void stk_trn_ovr_pd(double value) {
		setConstNumber(offset + 65, $stk_trn_ovr_pd, value);
	}


	/**
	 * Total GI qty. 合計出庫数量.<p>
	 *
	 */
	public MCNumber ttl_gi_qty() {
		return getConstNumber(offset + 66, $ttl_gi_qty);
	}

	/**
	 * Total GI qty. 合計出庫数量.<p>
	 *
	 */
	public void ttl_gi_qty(MCNumber value) {
		setConstNumber(offset + 66, $ttl_gi_qty, value);
	}

	/**
	 * Total GI qty. 合計出庫数量.<p>
	 *
	 */
	public void ttl_gi_qty(int value) {
		setConstNumber(offset + 66, $ttl_gi_qty, value);
	}

	/**
	 * Total GI qty. 合計出庫数量.<p>
	 *
	 */
	public void ttl_gi_qty(long value) {
		setConstNumber(offset + 66, $ttl_gi_qty, value);
	}

	/**
	 * Total GI qty. 合計出庫数量.<p>
	 *
	 */
	public void ttl_gi_qty(float value) {
		setConstNumber(offset + 66, $ttl_gi_qty, value);
	}

	/**
	 * Total GI qty. 合計出庫数量.<p>
	 *
	 */
	public void ttl_gi_qty(double value) {
		setConstNumber(offset + 66, $ttl_gi_qty, value);
	}


	/**
	 * Base unit total GI qty. 基準単位合計出庫数量.<p>
	 *
	 */
	public MCNumber base_unit_ttl_gi_qty() {
		return getConstNumber(offset + 67, $base_unit_ttl_gi_qty);
	}

	/**
	 * Base unit total GI qty. 基準単位合計出庫数量.<p>
	 *
	 */
	public void base_unit_ttl_gi_qty(MCNumber value) {
		setConstNumber(offset + 67, $base_unit_ttl_gi_qty, value);
	}

	/**
	 * Base unit total GI qty. 基準単位合計出庫数量.<p>
	 *
	 */
	public void base_unit_ttl_gi_qty(int value) {
		setConstNumber(offset + 67, $base_unit_ttl_gi_qty, value);
	}

	/**
	 * Base unit total GI qty. 基準単位合計出庫数量.<p>
	 *
	 */
	public void base_unit_ttl_gi_qty(long value) {
		setConstNumber(offset + 67, $base_unit_ttl_gi_qty, value);
	}

	/**
	 * Base unit total GI qty. 基準単位合計出庫数量.<p>
	 *
	 */
	public void base_unit_ttl_gi_qty(float value) {
		setConstNumber(offset + 67, $base_unit_ttl_gi_qty, value);
	}

	/**
	 * Base unit total GI qty. 基準単位合計出庫数量.<p>
	 *
	 */
	public void base_unit_ttl_gi_qty(double value) {
		setConstNumber(offset + 67, $base_unit_ttl_gi_qty, value);
	}


	/**
	 * Total GI amount 合計出庫金額.<p>
	 *
	 */
	public MCNumber ttl_gi_amt() {
		return getConstNumber(offset + 68, $ttl_gi_amt);
	}

	/**
	 * Total GI amount 合計出庫金額.<p>
	 *
	 */
	public void ttl_gi_amt(MCNumber value) {
		setConstNumber(offset + 68, $ttl_gi_amt, value);
	}

	/**
	 * Total GI amount 合計出庫金額.<p>
	 *
	 */
	public void ttl_gi_amt(int value) {
		setConstNumber(offset + 68, $ttl_gi_amt, value);
	}

	/**
	 * Total GI amount 合計出庫金額.<p>
	 *
	 */
	public void ttl_gi_amt(long value) {
		setConstNumber(offset + 68, $ttl_gi_amt, value);
	}

	/**
	 * Total GI amount 合計出庫金額.<p>
	 *
	 */
	public void ttl_gi_amt(float value) {
		setConstNumber(offset + 68, $ttl_gi_amt, value);
	}

	/**
	 * Total GI amount 合計出庫金額.<p>
	 *
	 */
	public void ttl_gi_amt(double value) {
		setConstNumber(offset + 68, $ttl_gi_amt, value);
	}


	/**
	 * Average inventory quantity 平均在庫数量.<p>
	 *
	 */
	public MCNumber avg_stk_qty() {
		return getConstNumber(offset + 69, $avg_stk_qty);
	}

	/**
	 * Average inventory quantity 平均在庫数量.<p>
	 *
	 */
	public void avg_stk_qty(MCNumber value) {
		setConstNumber(offset + 69, $avg_stk_qty, value);
	}

	/**
	 * Average inventory quantity 平均在庫数量.<p>
	 *
	 */
	public void avg_stk_qty(int value) {
		setConstNumber(offset + 69, $avg_stk_qty, value);
	}

	/**
	 * Average inventory quantity 平均在庫数量.<p>
	 *
	 */
	public void avg_stk_qty(long value) {
		setConstNumber(offset + 69, $avg_stk_qty, value);
	}

	/**
	 * Average inventory quantity 平均在庫数量.<p>
	 *
	 */
	public void avg_stk_qty(float value) {
		setConstNumber(offset + 69, $avg_stk_qty, value);
	}

	/**
	 * Average inventory quantity 平均在庫数量.<p>
	 *
	 */
	public void avg_stk_qty(double value) {
		setConstNumber(offset + 69, $avg_stk_qty, value);
	}


	/**
	 * Base unit average inventory qty. 基準単位平均在庫数量.<p>
	 *
	 */
	public MCNumber base_unit_avg_stk_qty() {
		return getConstNumber(offset + 70, $base_unit_avg_stk_qty);
	}

	/**
	 * Base unit average inventory qty. 基準単位平均在庫数量.<p>
	 *
	 */
	public void base_unit_avg_stk_qty(MCNumber value) {
		setConstNumber(offset + 70, $base_unit_avg_stk_qty, value);
	}

	/**
	 * Base unit average inventory qty. 基準単位平均在庫数量.<p>
	 *
	 */
	public void base_unit_avg_stk_qty(int value) {
		setConstNumber(offset + 70, $base_unit_avg_stk_qty, value);
	}

	/**
	 * Base unit average inventory qty. 基準単位平均在庫数量.<p>
	 *
	 */
	public void base_unit_avg_stk_qty(long value) {
		setConstNumber(offset + 70, $base_unit_avg_stk_qty, value);
	}

	/**
	 * Base unit average inventory qty. 基準単位平均在庫数量.<p>
	 *
	 */
	public void base_unit_avg_stk_qty(float value) {
		setConstNumber(offset + 70, $base_unit_avg_stk_qty, value);
	}

	/**
	 * Base unit average inventory qty. 基準単位平均在庫数量.<p>
	 *
	 */
	public void base_unit_avg_stk_qty(double value) {
		setConstNumber(offset + 70, $base_unit_avg_stk_qty, value);
	}


	/**
	 * Average inventory amount 平均在庫金額.<p>
	 *
	 */
	public MCNumber avg_stk_amt() {
		return getConstNumber(offset + 71, $avg_stk_amt);
	}

	/**
	 * Average inventory amount 平均在庫金額.<p>
	 *
	 */
	public void avg_stk_amt(MCNumber value) {
		setConstNumber(offset + 71, $avg_stk_amt, value);
	}

	/**
	 * Average inventory amount 平均在庫金額.<p>
	 *
	 */
	public void avg_stk_amt(int value) {
		setConstNumber(offset + 71, $avg_stk_amt, value);
	}

	/**
	 * Average inventory amount 平均在庫金額.<p>
	 *
	 */
	public void avg_stk_amt(long value) {
		setConstNumber(offset + 71, $avg_stk_amt, value);
	}

	/**
	 * Average inventory amount 平均在庫金額.<p>
	 *
	 */
	public void avg_stk_amt(float value) {
		setConstNumber(offset + 71, $avg_stk_amt, value);
	}

	/**
	 * Average inventory amount 平均在庫金額.<p>
	 *
	 */
	public void avg_stk_amt(double value) {
		setConstNumber(offset + 71, $avg_stk_amt, value);
	}


	/**
	 * Average GI qty. per day 一日あたり平均出庫数量.<p>
	 *
	 */
	public MCNumber avg_gi_qty() {
		return getConstNumber(offset + 72, $avg_gi_qty);
	}

	/**
	 * Average GI qty. per day 一日あたり平均出庫数量.<p>
	 *
	 */
	public void avg_gi_qty(MCNumber value) {
		setConstNumber(offset + 72, $avg_gi_qty, value);
	}

	/**
	 * Average GI qty. per day 一日あたり平均出庫数量.<p>
	 *
	 */
	public void avg_gi_qty(int value) {
		setConstNumber(offset + 72, $avg_gi_qty, value);
	}

	/**
	 * Average GI qty. per day 一日あたり平均出庫数量.<p>
	 *
	 */
	public void avg_gi_qty(long value) {
		setConstNumber(offset + 72, $avg_gi_qty, value);
	}

	/**
	 * Average GI qty. per day 一日あたり平均出庫数量.<p>
	 *
	 */
	public void avg_gi_qty(float value) {
		setConstNumber(offset + 72, $avg_gi_qty, value);
	}

	/**
	 * Average GI qty. per day 一日あたり平均出庫数量.<p>
	 *
	 */
	public void avg_gi_qty(double value) {
		setConstNumber(offset + 72, $avg_gi_qty, value);
	}


	/**
	 * Average GI amount per day 一日あたり平均出庫金額.<p>
	 *
	 */
	public MCNumber avg_gi_amt() {
		return getConstNumber(offset + 73, $avg_gi_amt);
	}

	/**
	 * Average GI amount per day 一日あたり平均出庫金額.<p>
	 *
	 */
	public void avg_gi_amt(MCNumber value) {
		setConstNumber(offset + 73, $avg_gi_amt, value);
	}

	/**
	 * Average GI amount per day 一日あたり平均出庫金額.<p>
	 *
	 */
	public void avg_gi_amt(int value) {
		setConstNumber(offset + 73, $avg_gi_amt, value);
	}

	/**
	 * Average GI amount per day 一日あたり平均出庫金額.<p>
	 *
	 */
	public void avg_gi_amt(long value) {
		setConstNumber(offset + 73, $avg_gi_amt, value);
	}

	/**
	 * Average GI amount per day 一日あたり平均出庫金額.<p>
	 *
	 */
	public void avg_gi_amt(float value) {
		setConstNumber(offset + 73, $avg_gi_amt, value);
	}

	/**
	 * Average GI amount per day 一日あたり平均出庫金額.<p>
	 *
	 */
	public void avg_gi_amt(double value) {
		setConstNumber(offset + 73, $avg_gi_amt, value);
	}


	/**
	 * Number of days to GI 出庫対応日数.<p>
	 *
	 */
	public MCNumber gi_days() {
		return getConstNumber(offset + 74, $gi_days);
	}

	/**
	 * Number of days to GI 出庫対応日数.<p>
	 *
	 */
	public void gi_days(MCNumber value) {
		setConstNumber(offset + 74, $gi_days, value);
	}

	/**
	 * Number of days to GI 出庫対応日数.<p>
	 *
	 */
	public void gi_days(int value) {
		setConstNumber(offset + 74, $gi_days, value);
	}

	/**
	 * Number of days to GI 出庫対応日数.<p>
	 *
	 */
	public void gi_days(long value) {
		setConstNumber(offset + 74, $gi_days, value);
	}

	/**
	 * Number of days to GI 出庫対応日数.<p>
	 *
	 */
	public void gi_days(float value) {
		setConstNumber(offset + 74, $gi_days, value);
	}

	/**
	 * Number of days to GI 出庫対応日数.<p>
	 *
	 */
	public void gi_days(double value) {
		setConstNumber(offset + 74, $gi_days, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 75, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 75, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 76, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 76, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 77, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 77, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 78, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 78, $itm_typ_d_nm, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 79, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 79, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 80, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 80, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 81, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 81, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 82, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 82, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 83, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 83, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 84, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 84, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 85, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 85, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 86, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 86, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 87, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 87, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 88, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 88, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 89, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 89, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 90, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 90, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 91, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 91, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 92, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 92, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 93, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 93, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 94, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 94, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 95, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 95, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 96, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 96, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 97, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 97, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 98, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 98, $itm_grp_nm10, value);
	}


	/**
	 * Location calendar cd. 場所カレンダＣＤ.<p>
	 *
	 */
	public String loc_cal_cd() {
		return getConstString(offset + 99, $loc_cal_cd);
	}

	/**
	 * Location calendar cd. 場所カレンダＣＤ.<p>
	 *
	 */
	public void loc_cal_cd(String value) {
		setConstString(offset + 99, $loc_cal_cd, value);
	}


	/**
	 * Distribution G calendar cd. 物流ＧカレンダＣＤ.<p>
	 *
	 */
	public String lg_grp_cal_cd() {
		return getConstString(offset + 100, $lg_grp_cal_cd);
	}

	/**
	 * Distribution G calendar cd. 物流ＧカレンダＣＤ.<p>
	 *
	 */
	public void lg_grp_cal_cd(String value) {
		setConstString(offset + 100, $lg_grp_cal_cd, value);
	}


	/**
	 * Number of operating days 稼働日数.<p>
	 *
	 */
	public MCNumber cal_days() {
		return getConstNumber(offset + 101, $cal_days);
	}

	/**
	 * Number of operating days 稼働日数.<p>
	 *
	 */
	public void cal_days(MCNumber value) {
		setConstNumber(offset + 101, $cal_days, value);
	}

	/**
	 * Number of operating days 稼働日数.<p>
	 *
	 */
	public void cal_days(int value) {
		setConstNumber(offset + 101, $cal_days, value);
	}

	/**
	 * Number of operating days 稼働日数.<p>
	 *
	 */
	public void cal_days(long value) {
		setConstNumber(offset + 101, $cal_days, value);
	}

	/**
	 * Number of operating days 稼働日数.<p>
	 *
	 */
	public void cal_days(float value) {
		setConstNumber(offset + 101, $cal_days, value);
	}

	/**
	 * Number of operating days 稼働日数.<p>
	 *
	 */
	public void cal_days(double value) {
		setConstNumber(offset + 101, $cal_days, value);
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
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
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
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			return in_xfr_typ();
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			return in_xfr_typ_nm();
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
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		if ($loc_cal_cd.equalsIgnoreCase(name)) {
			return loc_cal_cd();
		}
		if ($lg_grp_cal_cd.equalsIgnoreCase(name)) {
			return lg_grp_cal_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			return stk_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			return std_unit_cost();
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			return stk_amt();
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
		if ($base_unit_ttl_gi_qty.equalsIgnoreCase(name)) {
			return base_unit_ttl_gi_qty();
		}
		if ($ttl_gi_amt.equalsIgnoreCase(name)) {
			return ttl_gi_amt();
		}
		if ($avg_stk_qty.equalsIgnoreCase(name)) {
			return avg_stk_qty();
		}
		if ($base_unit_avg_stk_qty.equalsIgnoreCase(name)) {
			return base_unit_avg_stk_qty();
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
		if ($cal_days.equalsIgnoreCase(name)) {
			return cal_days();
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
	public boolean getBoolean(String name) {
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		return super.getBoolean(name);
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
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
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
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			return in_xfr_typ();
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			return in_xfr_typ_nm();
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
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		if ($loc_cal_cd.equalsIgnoreCase(name)) {
			return loc_cal_cd();
		}
		if ($lg_grp_cal_cd.equalsIgnoreCase(name)) {
			return lg_grp_cal_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			return stk_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			return std_unit_cost();
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			return stk_amt();
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
		if ($base_unit_ttl_gi_qty.equalsIgnoreCase(name)) {
			return base_unit_ttl_gi_qty();
		}
		if ($ttl_gi_amt.equalsIgnoreCase(name)) {
			return ttl_gi_amt();
		}
		if ($avg_stk_qty.equalsIgnoreCase(name)) {
			return avg_stk_qty();
		}
		if ($base_unit_avg_stk_qty.equalsIgnoreCase(name)) {
			return base_unit_avg_stk_qty();
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
		if ($cal_days.equalsIgnoreCase(name)) {
			return cal_days();
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
	public boolean getBooleanNE(String name) {
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		return super.getBooleanNE(name);
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
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
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
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			in_xfr_typ(value);
			return;
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			in_xfr_typ_nm(value);
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
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		if ($loc_cal_cd.equalsIgnoreCase(name)) {
			loc_cal_cd(value);
			return;
		}
		if ($lg_grp_cal_cd.equalsIgnoreCase(name)) {
			lg_grp_cal_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
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
		if ($base_unit_ttl_gi_qty.equalsIgnoreCase(name)) {
			base_unit_ttl_gi_qty(value);
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
		if ($base_unit_avg_stk_qty.equalsIgnoreCase(name)) {
			base_unit_avg_stk_qty(value);
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
		if ($cal_days.equalsIgnoreCase(name)) {
			cal_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
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
		if ($base_unit_ttl_gi_qty.equalsIgnoreCase(name)) {
			base_unit_ttl_gi_qty(value);
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
		if ($base_unit_avg_stk_qty.equalsIgnoreCase(name)) {
			base_unit_avg_stk_qty(value);
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
		if ($cal_days.equalsIgnoreCase(name)) {
			cal_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
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
		if ($base_unit_ttl_gi_qty.equalsIgnoreCase(name)) {
			base_unit_ttl_gi_qty(value);
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
		if ($base_unit_avg_stk_qty.equalsIgnoreCase(name)) {
			base_unit_avg_stk_qty(value);
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
		if ($cal_days.equalsIgnoreCase(name)) {
			cal_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
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
		if ($base_unit_ttl_gi_qty.equalsIgnoreCase(name)) {
			base_unit_ttl_gi_qty(value);
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
		if ($base_unit_avg_stk_qty.equalsIgnoreCase(name)) {
			base_unit_avg_stk_qty(value);
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
		if ($cal_days.equalsIgnoreCase(name)) {
			cal_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
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
		if ($base_unit_ttl_gi_qty.equalsIgnoreCase(name)) {
			base_unit_ttl_gi_qty(value);
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
		if ($base_unit_avg_stk_qty.equalsIgnoreCase(name)) {
			base_unit_avg_stk_qty(value);
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
		if ($cal_days.equalsIgnoreCase(name)) {
			cal_days(value);
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
	public void setBoolean(String name, boolean value) {
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		super.setBoolean(name, value);
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
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
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
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			in_xfr_typ(value);
			return;
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			in_xfr_typ_nm(value);
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
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		if ($loc_cal_cd.equalsIgnoreCase(name)) {
			loc_cal_cd(value);
			return;
		}
		if ($lg_grp_cal_cd.equalsIgnoreCase(name)) {
			lg_grp_cal_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
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
		if ($base_unit_ttl_gi_qty.equalsIgnoreCase(name)) {
			base_unit_ttl_gi_qty(value);
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
		if ($base_unit_avg_stk_qty.equalsIgnoreCase(name)) {
			base_unit_avg_stk_qty(value);
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
		if ($cal_days.equalsIgnoreCase(name)) {
			cal_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
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
		if ($base_unit_ttl_gi_qty.equalsIgnoreCase(name)) {
			base_unit_ttl_gi_qty(value);
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
		if ($base_unit_avg_stk_qty.equalsIgnoreCase(name)) {
			base_unit_avg_stk_qty(value);
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
		if ($cal_days.equalsIgnoreCase(name)) {
			cal_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
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
		if ($base_unit_ttl_gi_qty.equalsIgnoreCase(name)) {
			base_unit_ttl_gi_qty(value);
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
		if ($base_unit_avg_stk_qty.equalsIgnoreCase(name)) {
			base_unit_avg_stk_qty(value);
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
		if ($cal_days.equalsIgnoreCase(name)) {
			cal_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
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
		if ($base_unit_ttl_gi_qty.equalsIgnoreCase(name)) {
			base_unit_ttl_gi_qty(value);
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
		if ($base_unit_avg_stk_qty.equalsIgnoreCase(name)) {
			base_unit_avg_stk_qty(value);
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
		if ($cal_days.equalsIgnoreCase(name)) {
			cal_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($stk_qty.equalsIgnoreCase(name)) {
			stk_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
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
		if ($base_unit_ttl_gi_qty.equalsIgnoreCase(name)) {
			base_unit_ttl_gi_qty(value);
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
		if ($base_unit_avg_stk_qty.equalsIgnoreCase(name)) {
			base_unit_avg_stk_qty(value);
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
		if ($cal_days.equalsIgnoreCase(name)) {
			cal_days(value);
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
	public void setBooleanNE(String name, boolean value) {
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

