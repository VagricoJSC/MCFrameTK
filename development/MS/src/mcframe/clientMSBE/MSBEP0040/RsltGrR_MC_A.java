package mcframe.clientMSBE.MSBEP0040;

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
 * ブロック"RsltGr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltGrR_MC_A extends MCConstRow {

	/**
	 * Extraction 抽出.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Scheduled inventory type 予定在庫区分.<p>
	 *
	 */
	public static final String $schd_stk_typ = "schd_stk_typ";
	/**
	 * Scheduled inventory type name 予定在庫区分名.<p>
	 *
	 */
	public static final String $schd_stk_typ_nm = "schd_stk_typ_nm";
	/**
	 * GR date 入庫日.<p>
	 *
	 */
	public static final String $dt = "dt";
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
	public static final String $ver_no_p = "ver_no_p";
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
	public static final String $base_unit_qty_p = "base_unit_qty_p";
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
	public static final String $qty_p = "qty_p";
	public static final String $lot_alloc_qty_p = "lot_alloc_qty_p";
	public static final String $lot_wait_qty_p = "lot_wait_qty_p";
	public static final String $lot_alloc_avl_qty_p = "lot_alloc_avl_qty_p";
	public static final String $not_lot_alloc_qty_p = "not_lot_alloc_qty_p";
	public static final String $not_lot_wait_qty_p = "not_lot_wait_qty_p";
	public static final String $not_lot_alloc_avl_qty_p = "not_lot_alloc_avl_qty_p";
	public static final String $lg_lot_alloc_qty_p = "lg_lot_alloc_qty_p";
	public static final String $lg_lot_wait_qty_p = "lg_lot_wait_qty_p";
	public static final String $lg_lot_alloc_avl_qty_p = "lg_lot_alloc_avl_qty_p";
	public static final String $lg_not_lot_alloc_qty_p = "lg_not_lot_alloc_qty_p";
	public static final String $lg_not_lot_wait_qty_p = "lg_not_lot_wait_qty_p";
	public static final String $lg_not_lot_alloc_avl_qty_p = "lg_not_lot_alloc_avl_qty_p";
	public static final String $grs_alloc_qty_p = "grs_alloc_qty_p";
	public static final String $grs_wait_qty_p = "grs_wait_qty_p";
	public static final String $alloc_qty_p = "alloc_qty_p";
	public static final String $wait_qty_p = "wait_qty_p";
	public static final String $grs_alloc_avl_qty_p = "grs_alloc_avl_qty_p";
	/**
	 * Allocation unit cd. 引当単位ＣＤ.<p>
	 *
	 */
	public static final String $alloc_unit_cd = "alloc_unit_cd";
	/**
	 * Allocation unit name 引当単位名.<p>
	 *
	 */
	public static final String $alloc_unit_nm = "alloc_unit_nm";
	/**
	 * Allocation unit number of decimal places 引当単位小数部有効桁数.<p>
	 *
	 */
	public static final String $alloc_unit_dec_place = "alloc_unit_dec_place";
	/**
	 * GR delay allocation 入庫遅れ引当.<p>
	 *
	 */
	public static final String $overdue_alloc_flg = "overdue_alloc_flg";
	/**
	 * Allocation of location variance 場所違い引当.<p>
	 *
	 */
	public static final String $another_loc_alloc_flg = "another_loc_alloc_flg";
	/**
	 * Allocation error 引当異常.<p>
	 *
	 */
	public static final String $abnormal_alloc_flg = "abnormal_alloc_flg";
	public static final String $act_cont_fctr_p = "act_cont_fctr_p";
	public static final String $act_cont_qty_p = "act_cont_qty_p";
	public static final String $act_cont_alloc_qty_p = "act_cont_alloc_qty_p";
	public static final String $act_cont_wait_qty_p = "act_cont_wait_qty_p";
	public static final String $act_cont_alloc_avl_qty_p = "act_cont_alloc_avl_qty_p";
	public static final String $std_cont_fctr_p = "std_cont_fctr_p";
	public static final String $std_cont_qty_p = "std_cont_qty_p";
	public static final String $std_cont_alloc_qty_p = "std_cont_alloc_qty_p";
	public static final String $std_cont_wait_qty_p = "std_cont_wait_qty_p";
	public static final String $std_cont_alloc_avl_qty_p = "std_cont_alloc_avl_qty_p";
	public static final String $cont_fctr_unit_p = "cont_fctr_unit_p";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Rounding type (Active ingredient) 有効成分端数処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public static final String $lot_seq = "lot_seq";
	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public static final String $first_gr_dt = "first_gr_dt";
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public static final String $plnt_aprv_sts_typ = "plnt_aprv_sts_typ";
	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public static final String $plnt_aprv_sts_typ_nm = "plnt_aprv_sts_typ_nm";
	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ = "mrkt_judg_sts_typ";
	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ_nm = "mrkt_judg_sts_typ_nm";
	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public static final String $vld_dt_fr = "vld_dt_fr";
	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public static final String $vld_dt_to = "vld_dt_to";
	/**
	 * Unallocatable date 引当禁止日.<p>
	 *
	 */
	public static final String $stop_dt = "stop_dt";
	/**
	 * Allocation release date 引当解除日.<p>
	 *
	 */
	public static final String $rel_dt = "rel_dt";
	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public static final String $alloc_margin_days = "alloc_margin_days";
	/**
	 * Location supplier cd. 場所発注先ＣＤ.<p>
	 *
	 */
	public static final String $loc_sppl_cd = "loc_sppl_cd";
	/**
	 * Location supplier name 場所発注先名.<p>
	 *
	 */
	public static final String $loc_sppl_nm = "loc_sppl_nm";
	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public static final String $io_schd_typ = "io_schd_typ";
	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public static final String $io_schd_typ_nm = "io_schd_typ_nm";
	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public static final String $io_schd_sts_typ = "io_schd_sts_typ";
	/**
	 * GR/GI schedule status type 受払予定状況区分名.<p>
	 *
	 */
	public static final String $io_schd_sts_typ_nm = "io_schd_sts_typ_nm";
	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_no = "io_schd_no";
	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public static final String $io_schd_seq = "io_schd_seq";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public static final String $trd_ptn_typ_nm = "trd_ptn_typ_nm";
	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public static final String $trn_typ = "trn_typ";
	/**
	 * Transaction type name トランザクション区分名.<p>
	 *
	 */
	public static final String $trn_typ_nm = "trn_typ_nm";
	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public static final String $io_act_typ = "io_act_typ";
	/**
	 * GR/GI type name 受払区分名.<p>
	 *
	 */
	public static final String $io_act_typ_nm = "io_act_typ_nm";
	/**
	 * Row number 行番号.<p>
	 *
	 */
	public static final String $lno = "lno";

	public static final String $ver_no = $ver_no_p + ".ver_no";
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
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $qty = $qty_p + ".qty";
	public static final String $lot_alloc_qty = $lot_alloc_qty_p + ".qty";
	public static final String $lot_wait_qty = $lot_wait_qty_p + ".qty";
	public static final String $lot_alloc_avl_qty = $lot_alloc_avl_qty_p + ".qty";
	public static final String $not_lot_alloc_qty = $not_lot_alloc_qty_p + ".qty";
	public static final String $not_lot_wait_qty = $not_lot_wait_qty_p + ".qty";
	public static final String $not_lot_alloc_avl_qty = $not_lot_alloc_avl_qty_p + ".qty";
	public static final String $lg_lot_alloc_qty = $lg_lot_alloc_qty_p + ".qty";
	public static final String $lg_lot_wait_qty = $lg_lot_wait_qty_p + ".qty";
	public static final String $lg_lot_alloc_avl_qty = $lg_lot_alloc_avl_qty_p + ".qty";
	public static final String $lg_not_lot_alloc_qty = $lg_not_lot_alloc_qty_p + ".qty";
	public static final String $lg_not_lot_wait_qty = $lg_not_lot_wait_qty_p + ".qty";
	public static final String $lg_not_lot_alloc_avl_qty = $lg_not_lot_alloc_avl_qty_p + ".qty";
	public static final String $grs_alloc_qty = $grs_alloc_qty_p + ".qty";
	public static final String $grs_wait_qty = $grs_wait_qty_p + ".qty";
	public static final String $alloc_qty = $alloc_qty_p + ".qty";
	public static final String $wait_qty = $wait_qty_p + ".qty";
	public static final String $grs_alloc_avl_qty = $grs_alloc_avl_qty_p + ".qty";
	public static final String $act_cont_fctr = $act_cont_fctr_p + ".act_cont_fctr";
	public static final String $act_cont_qty = $act_cont_qty_p + ".cont_qty";
	public static final String $act_cont_alloc_qty = $act_cont_alloc_qty_p + ".cont_qty";
	public static final String $act_cont_wait_qty = $act_cont_wait_qty_p + ".cont_qty";
	public static final String $act_cont_alloc_avl_qty = $act_cont_alloc_avl_qty_p + ".cont_qty";
	public static final String $std_cont_fctr = $std_cont_fctr_p + ".std_cont_fctr";
	public static final String $std_cont_qty = $std_cont_qty_p + ".cont_qty";
	public static final String $std_cont_alloc_qty = $std_cont_alloc_qty_p + ".cont_qty";
	public static final String $std_cont_wait_qty = $std_cont_wait_qty_p + ".cont_qty";
	public static final String $std_cont_alloc_avl_qty = $std_cont_alloc_avl_qty_p + ".cont_qty";
	public static final String $cont_fctr_unit_cd = $cont_fctr_unit_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_fctr_unit_p + ".cont_fctr_unit_nm";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_stk_typ_META = createCommonMeta($schd_stk_typ, mcframe.commonMS.meta.MS_META.SCHD_STK_TYP);
	public static final MCMeta schd_stk_typ_nm_META = createCommonMeta($schd_stk_typ_nm, mcframe.commonMS.meta.MS_META.SCHD_STK_TYP_NM);
	public static final MCMeta dt_META = createCommonMeta($dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
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
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
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
	public static final MCMeta pack_unit_qty_p_META = createInnerRowMeta($pack_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pack_unit_dec_place_META = createCommonMeta($pack_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta qty_p_META = createInnerRowMeta($qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta lot_alloc_qty_p_META = createInnerRowMeta($lot_alloc_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta lot_wait_qty_p_META = createInnerRowMeta($lot_wait_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta lot_alloc_avl_qty_p_META = createInnerRowMeta($lot_alloc_avl_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta not_lot_alloc_qty_p_META = createInnerRowMeta($not_lot_alloc_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta not_lot_wait_qty_p_META = createInnerRowMeta($not_lot_wait_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta not_lot_alloc_avl_qty_p_META = createInnerRowMeta($not_lot_alloc_avl_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta lg_lot_alloc_qty_p_META = createInnerRowMeta($lg_lot_alloc_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta lg_lot_wait_qty_p_META = createInnerRowMeta($lg_lot_wait_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta lg_lot_alloc_avl_qty_p_META = createInnerRowMeta($lg_lot_alloc_avl_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta lg_not_lot_alloc_qty_p_META = createInnerRowMeta($lg_not_lot_alloc_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta lg_not_lot_wait_qty_p_META = createInnerRowMeta($lg_not_lot_wait_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta lg_not_lot_alloc_avl_qty_p_META = createInnerRowMeta($lg_not_lot_alloc_avl_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta grs_alloc_qty_p_META = createInnerRowMeta($grs_alloc_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta grs_wait_qty_p_META = createInnerRowMeta($grs_wait_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta alloc_qty_p_META = createInnerRowMeta($alloc_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta wait_qty_p_META = createInnerRowMeta($wait_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta grs_alloc_avl_qty_p_META = createInnerRowMeta($grs_alloc_avl_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta alloc_unit_cd_META = createCommonMeta($alloc_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta alloc_unit_nm_META = createCommonMeta($alloc_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta alloc_unit_dec_place_META = createCommonMeta($alloc_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta overdue_alloc_flg_META = createCommonMeta($overdue_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta another_loc_alloc_flg_META = createCommonMeta($another_loc_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abnormal_alloc_flg_META = createCommonMeta($abnormal_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_cont_fctr_p_META = createInnerRowMeta($act_cont_fctr_p, mcframe.clientMAUB.MAUBP5290.ActContFctrR.class);
	public static final MCMeta act_cont_qty_p_META = createInnerRowMeta($act_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta act_cont_alloc_qty_p_META = createInnerRowMeta($act_cont_alloc_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta act_cont_wait_qty_p_META = createInnerRowMeta($act_cont_wait_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta act_cont_alloc_avl_qty_p_META = createInnerRowMeta($act_cont_alloc_avl_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta std_cont_fctr_p_META = createInnerRowMeta($std_cont_fctr_p, mcframe.clientMAUB.MAUBP5280.StdContFctrR.class);
	public static final MCMeta std_cont_qty_p_META = createInnerRowMeta($std_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta std_cont_alloc_qty_p_META = createInnerRowMeta($std_cont_alloc_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta std_cont_wait_qty_p_META = createInnerRowMeta($std_cont_wait_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta std_cont_alloc_avl_qty_p_META = createInnerRowMeta($std_cont_alloc_avl_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta cont_fctr_unit_p_META = createInnerRowMeta($cont_fctr_unit_p, mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta lot_seq_META = createCommonMeta($lot_seq, mcframe.commonMA.meta.MA_META.LOT_SEQ);
	public static final MCMeta first_gr_dt_META = createCommonMeta($first_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta plnt_aprv_sts_typ_META = createCommonMeta($plnt_aprv_sts_typ, mcframe.commonMS.meta.MS_META.PLNT_APRV_STS_TYP);
	public static final MCMeta plnt_aprv_sts_typ_nm_META = createCommonMeta($plnt_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.PLNT_APRV_STS_TYP_NM);
	public static final MCMeta mrkt_judg_sts_typ_META = createCommonMeta($mrkt_judg_sts_typ, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP);
	public static final MCMeta mrkt_judg_sts_typ_nm_META = createCommonMeta($mrkt_judg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP_NM);
	public static final MCMeta vld_dt_fr_META = createCommonMeta($vld_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_to_META = createCommonMeta($vld_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta stop_dt_META = createCommonMeta($stop_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rel_dt_META = createCommonMeta($rel_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta alloc_margin_days_META = createCommonMeta($alloc_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta loc_sppl_cd_META = createCommonMeta($loc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta loc_sppl_nm_META = createCommonMeta($loc_sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta io_schd_typ_META = createCommonMeta($io_schd_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_TYP);
	public static final MCMeta io_schd_typ_nm_META = createCommonMeta($io_schd_typ_nm, mcframe.commonMS.meta.MS_META.IO_SCHD_TYP_NM);
	public static final MCMeta io_schd_sts_typ_META = createCommonMeta($io_schd_sts_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_STS_TYP);
	public static final MCMeta io_schd_sts_typ_nm_META = createCommonMeta($io_schd_sts_typ_nm, mcframe.commonMS.meta.MS_META.IO_SCHD_STS_TYP_NM);
	public static final MCMeta io_schd_no_META = createCommonMeta($io_schd_no, mcframe.commonMA.meta.MA_META.IO_SCHD_NO);
	public static final MCMeta io_schd_seq_META = createCommonMeta($io_schd_seq, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta trd_ptn_typ_nm_META = createCommonMeta($trd_ptn_typ_nm, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP_NM);
	public static final MCMeta trn_typ_META = createCommonMeta($trn_typ, mcframe.commonMS.meta.MS_META.TRN_TYP);
	public static final MCMeta trn_typ_nm_META = createCommonMeta($trn_typ_nm, mcframe.commonMS.meta.MS_META.TRN_TYP_NM);
	public static final MCMeta io_act_typ_META = createCommonMeta($io_act_typ, mcframe.commonMS.meta.MS_META.IO_ACT_TYP);
	public static final MCMeta io_act_typ_nm_META = createCommonMeta($io_act_typ_nm, mcframe.commonMS.meta.MS_META.IO_ACT_TYP_NM);
	public static final MCMeta lno_META = createNumberMeta($lno);

	protected static final ConstMetaList<RsltGrR> constMetas = new ConstMetaList<RsltGrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			schd_stk_typ_META,
			schd_stk_typ_nm_META,
			dt_META,
			wg_cd_META,
			wg_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			ver_no_p_META,
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
			quality_typ_META,
			quality_typ_nm_META,
			stk_insp_typ_META,
			stk_insp_typ_nm_META,
			sno_wrk_no_p_META,
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
			pack_unit_qty_p_META,
			pack_unit_cd_META,
			pack_unit_nm_META,
			pack_unit_dec_place_META,
			base_unit_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			qty_p_META,
			lot_alloc_qty_p_META,
			lot_wait_qty_p_META,
			lot_alloc_avl_qty_p_META,
			not_lot_alloc_qty_p_META,
			not_lot_wait_qty_p_META,
			not_lot_alloc_avl_qty_p_META,
			lg_lot_alloc_qty_p_META,
			lg_lot_wait_qty_p_META,
			lg_lot_alloc_avl_qty_p_META,
			lg_not_lot_alloc_qty_p_META,
			lg_not_lot_wait_qty_p_META,
			lg_not_lot_alloc_avl_qty_p_META,
			grs_alloc_qty_p_META,
			grs_wait_qty_p_META,
			alloc_qty_p_META,
			wait_qty_p_META,
			grs_alloc_avl_qty_p_META,
			alloc_unit_cd_META,
			alloc_unit_nm_META,
			alloc_unit_dec_place_META,
			overdue_alloc_flg_META,
			another_loc_alloc_flg_META,
			abnormal_alloc_flg_META,
			act_cont_fctr_p_META,
			act_cont_qty_p_META,
			act_cont_alloc_qty_p_META,
			act_cont_wait_qty_p_META,
			act_cont_alloc_avl_qty_p_META,
			std_cont_fctr_p_META,
			std_cont_qty_p_META,
			std_cont_alloc_qty_p_META,
			std_cont_wait_qty_p_META,
			std_cont_alloc_avl_qty_p_META,
			cont_fctr_unit_p_META,
			cont_fctr_flg_META,
			cont_fctr_rnd_typ_META,
			cont_fctr_dec_place_META,
			lot_seq_META,
			first_gr_dt_META,
			vld_dt_META,
			lmt_dt_META,
			plnt_aprv_sts_typ_META,
			plnt_aprv_sts_typ_nm_META,
			mrkt_judg_sts_typ_META,
			mrkt_judg_sts_typ_nm_META,
			vld_dt_fr_META,
			vld_dt_to_META,
			stop_dt_META,
			rel_dt_META,
			alloc_margin_days_META,
			loc_sppl_cd_META,
			loc_sppl_nm_META,
			io_schd_typ_META,
			io_schd_typ_nm_META,
			io_schd_sts_typ_META,
			io_schd_sts_typ_nm_META,
			io_schd_no_META,
			io_schd_seq_META,
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			trd_ptn_typ_nm_META,
			trn_typ_META,
			trn_typ_nm_META,
			io_act_typ_META,
			io_act_typ_nm_META,
			lno_META
		},
		new String[][]{
			{
				"ver_no",
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
				"base_unit_qty",
				"qty",
				"lot_alloc_qty",
				"lot_wait_qty",
				"lot_alloc_avl_qty",
				"not_lot_alloc_qty",
				"not_lot_wait_qty",
				"not_lot_alloc_avl_qty",
				"lg_lot_alloc_qty",
				"lg_lot_wait_qty",
				"lg_lot_alloc_avl_qty",
				"lg_not_lot_alloc_qty",
				"lg_not_lot_wait_qty",
				"lg_not_lot_alloc_avl_qty",
				"grs_alloc_qty",
				"grs_wait_qty",
				"alloc_qty",
				"wait_qty",
				"grs_alloc_avl_qty",
				"act_cont_fctr",
				"act_cont_qty",
				"act_cont_alloc_qty",
				"act_cont_wait_qty",
				"act_cont_alloc_avl_qty",
				"std_cont_fctr",
				"std_cont_qty",
				"std_cont_alloc_qty",
				"std_cont_wait_qty",
				"std_cont_alloc_avl_qty",
				"cont_fctr_unit_cd",
				"cont_fctr_unit_nm"
			},
			{
				$ver_no,
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
				$base_unit_qty,
				$qty,
				$lot_alloc_qty,
				$lot_wait_qty,
				$lot_alloc_avl_qty,
				$not_lot_alloc_qty,
				$not_lot_wait_qty,
				$not_lot_alloc_avl_qty,
				$lg_lot_alloc_qty,
				$lg_lot_wait_qty,
				$lg_lot_alloc_avl_qty,
				$lg_not_lot_alloc_qty,
				$lg_not_lot_wait_qty,
				$lg_not_lot_alloc_avl_qty,
				$grs_alloc_qty,
				$grs_wait_qty,
				$alloc_qty,
				$wait_qty,
				$grs_alloc_avl_qty,
				$act_cont_fctr,
				$act_cont_qty,
				$act_cont_alloc_qty,
				$act_cont_wait_qty,
				$act_cont_alloc_avl_qty,
				$std_cont_fctr,
				$std_cont_qty,
				$std_cont_alloc_qty,
				$std_cont_wait_qty,
				$std_cont_alloc_avl_qty,
				$cont_fctr_unit_cd,
				$cont_fctr_unit_nm
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
				{$gd_nm, "STK_GD"}	// gd_nm
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
	protected RsltGrR_MC_A(ConstMetaList<? extends RsltGrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltGrR clone() {
		return (RsltGrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltGrR createInstance() {
		return (RsltGrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltGrR getValues(String... names) {
		return (RsltGrR) super.getValues(names);
	}



	/**
	 * Extraction 抽出.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Extraction 抽出.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * Scheduled inventory type 予定在庫区分.<p>
	 *
	 */
	public String schd_stk_typ() {
		return getConstString(offset + 1, $schd_stk_typ);
	}

	/**
	 * Scheduled inventory type 予定在庫区分.<p>
	 *
	 */
	public void schd_stk_typ(String value) {
		setConstString(offset + 1, $schd_stk_typ, value);
	}


	/**
	 * Scheduled inventory type name 予定在庫区分名.<p>
	 *
	 */
	public String schd_stk_typ_nm() {
		return getConstString(offset + 2, $schd_stk_typ_nm);
	}

	/**
	 * Scheduled inventory type name 予定在庫区分名.<p>
	 *
	 */
	public void schd_stk_typ_nm(String value) {
		setConstString(offset + 2, $schd_stk_typ_nm, value);
	}


	/**
	 * GR date 入庫日.<p>
	 *
	 */
	public MCDate dt() {
		return getConstDate(offset + 3, $dt);
	}

	/**
	 * GR date 入庫日.<p>
	 *
	 */
	public void dt(MCDate value) {
		setConstDate(offset + 3, $dt, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 4, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 4, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 5, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 5, $wg_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 6, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 6, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 7, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 7, $dpt_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 8, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 8, $ver_no_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 9, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 9, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 10, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 10, $sublot_no, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 11, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 11, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 12, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 12, $loc_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 13, $str_ln_p);
	}
	
	public void str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 13, $str_ln_p, row);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 14, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 14, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 15, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 15, $site_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 16, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 16, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 17, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 17, $lg_grp_nm, value);
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
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 19, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 19, $alloc_grp_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 20, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 20, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 21, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 21, $loc_grp_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 22, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 22, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 23, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 23, $gd_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 24, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 24, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 25, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 25, $quality_typ_nm, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 26, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 26, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 27, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 27, $stk_insp_typ_nm, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 28, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 28, $sno_wrk_no_p, row);
	}


	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public String in_xfr_typ() {
		return getConstString(offset + 29, $in_xfr_typ);
	}

	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public void in_xfr_typ(String value) {
		setConstString(offset + 29, $in_xfr_typ, value);
	}


	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public String in_xfr_typ_nm() {
		return getConstString(offset + 30, $in_xfr_typ_nm);
	}

	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public void in_xfr_typ_nm(String value) {
		setConstString(offset + 30, $in_xfr_typ_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 31, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 31, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 32, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 32, $asst_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 33, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 33, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 34, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 34, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 35, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 35, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 36, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 36, $stk_bp_nm, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 37, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 37, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 38, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 38, $stk_arrv_bp_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR pack_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 39, $pack_unit_qty_p);
	}
	
	public void pack_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 39, $pack_unit_qty_p, row);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 40, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 40, $pack_unit_cd, value);
	}


	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 41, $pack_unit_nm);
	}

	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 41, $pack_unit_nm, value);
	}


	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_unit_dec_place() {
		return getConstNumber(offset + 42, $pack_unit_dec_place);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 42, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(int value) {
		setConstNumber(offset + 42, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(long value) {
		setConstNumber(offset + 42, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(float value) {
		setConstNumber(offset + 42, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(double value) {
		setConstNumber(offset + 42, $pack_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 43, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 43, $base_unit_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 44, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 44, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 45, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 45, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 46, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 46, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 46, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 46, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 46, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 46, $base_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 47, $qty_p);
	}
	
	public void qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 47, $qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR lot_alloc_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 48, $lot_alloc_qty_p);
	}
	
	public void lot_alloc_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 48, $lot_alloc_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR lot_wait_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 49, $lot_wait_qty_p);
	}
	
	public void lot_wait_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 49, $lot_wait_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR lot_alloc_avl_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 50, $lot_alloc_avl_qty_p);
	}
	
	public void lot_alloc_avl_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 50, $lot_alloc_avl_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR not_lot_alloc_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 51, $not_lot_alloc_qty_p);
	}
	
	public void not_lot_alloc_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 51, $not_lot_alloc_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR not_lot_wait_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 52, $not_lot_wait_qty_p);
	}
	
	public void not_lot_wait_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 52, $not_lot_wait_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR not_lot_alloc_avl_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 53, $not_lot_alloc_avl_qty_p);
	}
	
	public void not_lot_alloc_avl_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 53, $not_lot_alloc_avl_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR lg_lot_alloc_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 54, $lg_lot_alloc_qty_p);
	}
	
	public void lg_lot_alloc_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 54, $lg_lot_alloc_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR lg_lot_wait_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 55, $lg_lot_wait_qty_p);
	}
	
	public void lg_lot_wait_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 55, $lg_lot_wait_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR lg_lot_alloc_avl_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 56, $lg_lot_alloc_avl_qty_p);
	}
	
	public void lg_lot_alloc_avl_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 56, $lg_lot_alloc_avl_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR lg_not_lot_alloc_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 57, $lg_not_lot_alloc_qty_p);
	}
	
	public void lg_not_lot_alloc_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 57, $lg_not_lot_alloc_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR lg_not_lot_wait_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 58, $lg_not_lot_wait_qty_p);
	}
	
	public void lg_not_lot_wait_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 58, $lg_not_lot_wait_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR lg_not_lot_alloc_avl_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 59, $lg_not_lot_alloc_avl_qty_p);
	}
	
	public void lg_not_lot_alloc_avl_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 59, $lg_not_lot_alloc_avl_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR grs_alloc_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 60, $grs_alloc_qty_p);
	}
	
	public void grs_alloc_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 60, $grs_alloc_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR grs_wait_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 61, $grs_wait_qty_p);
	}
	
	public void grs_wait_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 61, $grs_wait_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR alloc_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 62, $alloc_qty_p);
	}
	
	public void alloc_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 62, $alloc_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR wait_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 63, $wait_qty_p);
	}
	
	public void wait_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 63, $wait_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR grs_alloc_avl_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 64, $grs_alloc_avl_qty_p);
	}
	
	public void grs_alloc_avl_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 64, $grs_alloc_avl_qty_p, row);
	}


	/**
	 * Allocation unit cd. 引当単位ＣＤ.<p>
	 *
	 */
	public String alloc_unit_cd() {
		return getConstString(offset + 65, $alloc_unit_cd);
	}

	/**
	 * Allocation unit cd. 引当単位ＣＤ.<p>
	 *
	 */
	public void alloc_unit_cd(String value) {
		setConstString(offset + 65, $alloc_unit_cd, value);
	}


	/**
	 * Allocation unit name 引当単位名.<p>
	 *
	 */
	public String alloc_unit_nm() {
		return getConstString(offset + 66, $alloc_unit_nm);
	}

	/**
	 * Allocation unit name 引当単位名.<p>
	 *
	 */
	public void alloc_unit_nm(String value) {
		setConstString(offset + 66, $alloc_unit_nm, value);
	}


	/**
	 * Allocation unit number of decimal places 引当単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber alloc_unit_dec_place() {
		return getConstNumber(offset + 67, $alloc_unit_dec_place);
	}

	/**
	 * Allocation unit number of decimal places 引当単位小数部有効桁数.<p>
	 *
	 */
	public void alloc_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 67, $alloc_unit_dec_place, value);
	}

	/**
	 * Allocation unit number of decimal places 引当単位小数部有効桁数.<p>
	 *
	 */
	public void alloc_unit_dec_place(int value) {
		setConstNumber(offset + 67, $alloc_unit_dec_place, value);
	}

	/**
	 * Allocation unit number of decimal places 引当単位小数部有効桁数.<p>
	 *
	 */
	public void alloc_unit_dec_place(long value) {
		setConstNumber(offset + 67, $alloc_unit_dec_place, value);
	}

	/**
	 * Allocation unit number of decimal places 引当単位小数部有効桁数.<p>
	 *
	 */
	public void alloc_unit_dec_place(float value) {
		setConstNumber(offset + 67, $alloc_unit_dec_place, value);
	}

	/**
	 * Allocation unit number of decimal places 引当単位小数部有効桁数.<p>
	 *
	 */
	public void alloc_unit_dec_place(double value) {
		setConstNumber(offset + 67, $alloc_unit_dec_place, value);
	}


	/**
	 * GR delay allocation 入庫遅れ引当.<p>
	 *
	 */
	public boolean overdue_alloc_flg() {
		return getConstBoolean(offset + 68, $overdue_alloc_flg);
	}

	/**
	 * GR delay allocation 入庫遅れ引当.<p>
	 *
	 */
	public void overdue_alloc_flg(boolean value) {
		setConstBoolean(offset + 68, $overdue_alloc_flg, value);
	}


	/**
	 * Allocation of location variance 場所違い引当.<p>
	 *
	 */
	public boolean another_loc_alloc_flg() {
		return getConstBoolean(offset + 69, $another_loc_alloc_flg);
	}

	/**
	 * Allocation of location variance 場所違い引当.<p>
	 *
	 */
	public void another_loc_alloc_flg(boolean value) {
		setConstBoolean(offset + 69, $another_loc_alloc_flg, value);
	}


	/**
	 * Allocation error 引当異常.<p>
	 *
	 */
	public boolean abnormal_alloc_flg() {
		return getConstBoolean(offset + 70, $abnormal_alloc_flg);
	}

	/**
	 * Allocation error 引当異常.<p>
	 *
	 */
	public void abnormal_alloc_flg(boolean value) {
		setConstBoolean(offset + 70, $abnormal_alloc_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5290.ActContFctrR act_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5290.ActContFctrR) getConstInnerRow(offset + 71, $act_cont_fctr_p);
	}
	
	public void act_cont_fctr_p(mcframe.clientMAUB.MAUBP5290.ActContFctrR row){
		setConstInnerRow(offset + 71, $act_cont_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR act_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 72, $act_cont_qty_p);
	}
	
	public void act_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 72, $act_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR act_cont_alloc_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 73, $act_cont_alloc_qty_p);
	}
	
	public void act_cont_alloc_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 73, $act_cont_alloc_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR act_cont_wait_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 74, $act_cont_wait_qty_p);
	}
	
	public void act_cont_wait_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 74, $act_cont_wait_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR act_cont_alloc_avl_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 75, $act_cont_alloc_avl_qty_p);
	}
	
	public void act_cont_alloc_avl_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 75, $act_cont_alloc_avl_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5280.StdContFctrR std_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5280.StdContFctrR) getConstInnerRow(offset + 76, $std_cont_fctr_p);
	}
	
	public void std_cont_fctr_p(mcframe.clientMAUB.MAUBP5280.StdContFctrR row){
		setConstInnerRow(offset + 76, $std_cont_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR std_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 77, $std_cont_qty_p);
	}
	
	public void std_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 77, $std_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR std_cont_alloc_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 78, $std_cont_alloc_qty_p);
	}
	
	public void std_cont_alloc_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 78, $std_cont_alloc_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR std_cont_wait_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 79, $std_cont_wait_qty_p);
	}
	
	public void std_cont_wait_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 79, $std_cont_wait_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR std_cont_alloc_avl_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 80, $std_cont_alloc_avl_qty_p);
	}
	
	public void std_cont_alloc_avl_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 80, $std_cont_alloc_avl_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5270.ContFctrUnitR cont_fctr_unit_p(){
		return (mcframe.clientMAUB.MAUBP5270.ContFctrUnitR) getConstInnerRow(offset + 81, $cont_fctr_unit_p);
	}
	
	public void cont_fctr_unit_p(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR row){
		setConstInnerRow(offset + 81, $cont_fctr_unit_p, row);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 82, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 82, $cont_fctr_flg, value);
	}


	/**
	 * Rounding type (Active ingredient) 有効成分端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 83, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient) 有効成分端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 83, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 84, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 84, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 84, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 84, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 84, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 84, $cont_fctr_dec_place, value);
	}


	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public String lot_seq() {
		return getConstString(offset + 85, $lot_seq);
	}

	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public void lot_seq(String value) {
		setConstString(offset + 85, $lot_seq, value);
	}


	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 86, $first_gr_dt);
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 86, $first_gr_dt, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 87, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 87, $vld_dt, value);
	}


	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 88, $lmt_dt);
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 88, $lmt_dt, value);
	}


	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public String plnt_aprv_sts_typ() {
		return getConstString(offset + 89, $plnt_aprv_sts_typ);
	}

	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public void plnt_aprv_sts_typ(String value) {
		setConstString(offset + 89, $plnt_aprv_sts_typ, value);
	}


	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public String plnt_aprv_sts_typ_nm() {
		return getConstString(offset + 90, $plnt_aprv_sts_typ_nm);
	}

	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public void plnt_aprv_sts_typ_nm(String value) {
		setConstString(offset + 90, $plnt_aprv_sts_typ_nm, value);
	}


	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public String mrkt_judg_sts_typ() {
		return getConstString(offset + 91, $mrkt_judg_sts_typ);
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public void mrkt_judg_sts_typ(String value) {
		setConstString(offset + 91, $mrkt_judg_sts_typ, value);
	}


	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public String mrkt_judg_sts_typ_nm() {
		return getConstString(offset + 92, $mrkt_judg_sts_typ_nm);
	}

	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_nm(String value) {
		setConstString(offset + 92, $mrkt_judg_sts_typ_nm, value);
	}


	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate vld_dt_fr() {
		return getConstDate(offset + 93, $vld_dt_fr);
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public void vld_dt_fr(MCDate value) {
		setConstDate(offset + 93, $vld_dt_fr, value);
	}


	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCDate vld_dt_to() {
		return getConstDate(offset + 94, $vld_dt_to);
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public void vld_dt_to(MCDate value) {
		setConstDate(offset + 94, $vld_dt_to, value);
	}


	/**
	 * Unallocatable date 引当禁止日.<p>
	 *
	 */
	public MCDate stop_dt() {
		return getConstDate(offset + 95, $stop_dt);
	}

	/**
	 * Unallocatable date 引当禁止日.<p>
	 *
	 */
	public void stop_dt(MCDate value) {
		setConstDate(offset + 95, $stop_dt, value);
	}


	/**
	 * Allocation release date 引当解除日.<p>
	 *
	 */
	public MCDate rel_dt() {
		return getConstDate(offset + 96, $rel_dt);
	}

	/**
	 * Allocation release date 引当解除日.<p>
	 *
	 */
	public void rel_dt(MCDate value) {
		setConstDate(offset + 96, $rel_dt, value);
	}


	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public MCNumber alloc_margin_days() {
		return getConstNumber(offset + 97, $alloc_margin_days);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 97, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(int value) {
		setConstNumber(offset + 97, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(long value) {
		setConstNumber(offset + 97, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(float value) {
		setConstNumber(offset + 97, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(double value) {
		setConstNumber(offset + 97, $alloc_margin_days, value);
	}


	/**
	 * Location supplier cd. 場所発注先ＣＤ.<p>
	 *
	 */
	public String loc_sppl_cd() {
		return getConstString(offset + 98, $loc_sppl_cd);
	}

	/**
	 * Location supplier cd. 場所発注先ＣＤ.<p>
	 *
	 */
	public void loc_sppl_cd(String value) {
		setConstString(offset + 98, $loc_sppl_cd, value);
	}


	/**
	 * Location supplier name 場所発注先名.<p>
	 *
	 */
	public String loc_sppl_nm() {
		return getConstString(offset + 99, $loc_sppl_nm);
	}

	/**
	 * Location supplier name 場所発注先名.<p>
	 *
	 */
	public void loc_sppl_nm(String value) {
		setConstString(offset + 99, $loc_sppl_nm, value);
	}


	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public String io_schd_typ() {
		return getConstString(offset + 100, $io_schd_typ);
	}

	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public void io_schd_typ(String value) {
		setConstString(offset + 100, $io_schd_typ, value);
	}


	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public String io_schd_typ_nm() {
		return getConstString(offset + 101, $io_schd_typ_nm);
	}

	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public void io_schd_typ_nm(String value) {
		setConstString(offset + 101, $io_schd_typ_nm, value);
	}


	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public String io_schd_sts_typ() {
		return getConstString(offset + 102, $io_schd_sts_typ);
	}

	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public void io_schd_sts_typ(String value) {
		setConstString(offset + 102, $io_schd_sts_typ, value);
	}


	/**
	 * GR/GI schedule status type 受払予定状況区分名.<p>
	 *
	 */
	public String io_schd_sts_typ_nm() {
		return getConstString(offset + 103, $io_schd_sts_typ_nm);
	}

	/**
	 * GR/GI schedule status type 受払予定状況区分名.<p>
	 *
	 */
	public void io_schd_sts_typ_nm(String value) {
		setConstString(offset + 103, $io_schd_sts_typ_nm, value);
	}


	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public String io_schd_no() {
		return getConstString(offset + 104, $io_schd_no);
	}

	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public void io_schd_no(String value) {
		setConstString(offset + 104, $io_schd_no, value);
	}


	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public MCNumber io_schd_seq() {
		return getConstNumber(offset + 105, $io_schd_seq);
	}

	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public void io_schd_seq(MCNumber value) {
		setConstNumber(offset + 105, $io_schd_seq, value);
	}

	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public void io_schd_seq(int value) {
		setConstNumber(offset + 105, $io_schd_seq, value);
	}

	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public void io_schd_seq(long value) {
		setConstNumber(offset + 105, $io_schd_seq, value);
	}

	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public void io_schd_seq(float value) {
		setConstNumber(offset + 105, $io_schd_seq, value);
	}

	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public void io_schd_seq(double value) {
		setConstNumber(offset + 105, $io_schd_seq, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 106, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 106, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 107, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 107, $trd_nm, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 108, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 108, $trd_ptn_typ, value);
	}


	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public String trd_ptn_typ_nm() {
		return getConstString(offset + 109, $trd_ptn_typ_nm);
	}

	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public void trd_ptn_typ_nm(String value) {
		setConstString(offset + 109, $trd_ptn_typ_nm, value);
	}


	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public String trn_typ() {
		return getConstString(offset + 110, $trn_typ);
	}

	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public void trn_typ(String value) {
		setConstString(offset + 110, $trn_typ, value);
	}


	/**
	 * Transaction type name トランザクション区分名.<p>
	 *
	 */
	public String trn_typ_nm() {
		return getConstString(offset + 111, $trn_typ_nm);
	}

	/**
	 * Transaction type name トランザクション区分名.<p>
	 *
	 */
	public void trn_typ_nm(String value) {
		setConstString(offset + 111, $trn_typ_nm, value);
	}


	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public String io_act_typ() {
		return getConstString(offset + 112, $io_act_typ);
	}

	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public void io_act_typ(String value) {
		setConstString(offset + 112, $io_act_typ, value);
	}


	/**
	 * GR/GI type name 受払区分名.<p>
	 *
	 */
	public String io_act_typ_nm() {
		return getConstString(offset + 113, $io_act_typ_nm);
	}

	/**
	 * GR/GI type name 受払区分名.<p>
	 *
	 */
	public void io_act_typ_nm(String value) {
		setConstString(offset + 113, $io_act_typ_nm, value);
	}


	/**
	 * Row number 行番号.<p>
	 *
	 */
	public MCNumber lno() {
		return getConstNumber(offset + 114, $lno);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void lno(MCNumber value) {
		setConstNumber(offset + 114, $lno, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void lno(int value) {
		setConstNumber(offset + 114, $lno, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void lno(long value) {
		setConstNumber(offset + 114, $lno, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void lno(float value) {
		setConstNumber(offset + 114, $lno, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void lno(double value) {
		setConstNumber(offset + 114, $lno, value);
	}


	public String getString(String name) {
		if ($schd_stk_typ.equalsIgnoreCase(name)) {
			return schd_stk_typ();
		}
		if ($schd_stk_typ_nm.equalsIgnoreCase(name)) {
			return schd_stk_typ_nm();
		}
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
		if ($alloc_unit_cd.equalsIgnoreCase(name)) {
			return alloc_unit_cd();
		}
		if ($alloc_unit_nm.equalsIgnoreCase(name)) {
			return alloc_unit_nm();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ();
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ_nm();
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
		}
		if ($loc_sppl_cd.equalsIgnoreCase(name)) {
			return loc_sppl_cd();
		}
		if ($loc_sppl_nm.equalsIgnoreCase(name)) {
			return loc_sppl_nm();
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_typ_nm.equalsIgnoreCase(name)) {
			return io_schd_typ_nm();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($io_schd_sts_typ_nm.equalsIgnoreCase(name)) {
			return io_schd_sts_typ_nm();
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			return io_schd_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			return trd_ptn_typ_nm();
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			return trn_typ();
		}
		if ($trn_typ_nm.equalsIgnoreCase(name)) {
			return trn_typ_nm();
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			return io_act_typ();
		}
		if ($io_act_typ_nm.equalsIgnoreCase(name)) {
			return io_act_typ_nm();
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
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			return alloc_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			return alloc_margin_days();
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			return io_schd_seq();
		}
		if ($lno.equalsIgnoreCase(name)) {
			return lno();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			return vld_dt_to();
		}
		if ($stop_dt.equalsIgnoreCase(name)) {
			return stop_dt();
		}
		if ($rel_dt.equalsIgnoreCase(name)) {
			return rel_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($overdue_alloc_flg.equalsIgnoreCase(name)) {
			return overdue_alloc_flg();
		}
		if ($another_loc_alloc_flg.equalsIgnoreCase(name)) {
			return another_loc_alloc_flg();
		}
		if ($abnormal_alloc_flg.equalsIgnoreCase(name)) {
			return abnormal_alloc_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($schd_stk_typ.equalsIgnoreCase(name)) {
			return schd_stk_typ();
		}
		if ($schd_stk_typ_nm.equalsIgnoreCase(name)) {
			return schd_stk_typ_nm();
		}
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
		if ($alloc_unit_cd.equalsIgnoreCase(name)) {
			return alloc_unit_cd();
		}
		if ($alloc_unit_nm.equalsIgnoreCase(name)) {
			return alloc_unit_nm();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ();
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ_nm();
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
		}
		if ($loc_sppl_cd.equalsIgnoreCase(name)) {
			return loc_sppl_cd();
		}
		if ($loc_sppl_nm.equalsIgnoreCase(name)) {
			return loc_sppl_nm();
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_typ_nm.equalsIgnoreCase(name)) {
			return io_schd_typ_nm();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($io_schd_sts_typ_nm.equalsIgnoreCase(name)) {
			return io_schd_sts_typ_nm();
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			return io_schd_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			return trd_ptn_typ_nm();
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			return trn_typ();
		}
		if ($trn_typ_nm.equalsIgnoreCase(name)) {
			return trn_typ_nm();
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			return io_act_typ();
		}
		if ($io_act_typ_nm.equalsIgnoreCase(name)) {
			return io_act_typ_nm();
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
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			return alloc_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			return alloc_margin_days();
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			return io_schd_seq();
		}
		if ($lno.equalsIgnoreCase(name)) {
			return lno();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
		}
		if ($vld_dt_to.equalsIgnoreCase(name)) {
			return vld_dt_to();
		}
		if ($stop_dt.equalsIgnoreCase(name)) {
			return stop_dt();
		}
		if ($rel_dt.equalsIgnoreCase(name)) {
			return rel_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($overdue_alloc_flg.equalsIgnoreCase(name)) {
			return overdue_alloc_flg();
		}
		if ($another_loc_alloc_flg.equalsIgnoreCase(name)) {
			return another_loc_alloc_flg();
		}
		if ($abnormal_alloc_flg.equalsIgnoreCase(name)) {
			return abnormal_alloc_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($schd_stk_typ.equalsIgnoreCase(name)) {
			schd_stk_typ(value);
			return;
		}
		if ($schd_stk_typ_nm.equalsIgnoreCase(name)) {
			schd_stk_typ_nm(value);
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
		if ($alloc_unit_cd.equalsIgnoreCase(name)) {
			alloc_unit_cd(value);
			return;
		}
		if ($alloc_unit_nm.equalsIgnoreCase(name)) {
			alloc_unit_nm(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
			return;
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ(value);
			return;
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ_nm(value);
			return;
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_nm(value);
			return;
		}
		if ($loc_sppl_cd.equalsIgnoreCase(name)) {
			loc_sppl_cd(value);
			return;
		}
		if ($loc_sppl_nm.equalsIgnoreCase(name)) {
			loc_sppl_nm(value);
			return;
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_typ_nm.equalsIgnoreCase(name)) {
			io_schd_typ_nm(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($io_schd_sts_typ_nm.equalsIgnoreCase(name)) {
			io_schd_sts_typ_nm(value);
			return;
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			io_schd_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			trd_ptn_typ_nm(value);
			return;
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			trn_typ(value);
			return;
		}
		if ($trn_typ_nm.equalsIgnoreCase(name)) {
			trn_typ_nm(value);
			return;
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			io_act_typ(value);
			return;
		}
		if ($io_act_typ_nm.equalsIgnoreCase(name)) {
			io_act_typ_nm(value);
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
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
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
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
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
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
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
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
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
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
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
		if ($stop_dt.equalsIgnoreCase(name)) {
			stop_dt(value);
			return;
		}
		if ($rel_dt.equalsIgnoreCase(name)) {
			rel_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($overdue_alloc_flg.equalsIgnoreCase(name)) {
			overdue_alloc_flg(value);
			return;
		}
		if ($another_loc_alloc_flg.equalsIgnoreCase(name)) {
			another_loc_alloc_flg(value);
			return;
		}
		if ($abnormal_alloc_flg.equalsIgnoreCase(name)) {
			abnormal_alloc_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($schd_stk_typ.equalsIgnoreCase(name)) {
			schd_stk_typ(value);
			return;
		}
		if ($schd_stk_typ_nm.equalsIgnoreCase(name)) {
			schd_stk_typ_nm(value);
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
		if ($alloc_unit_cd.equalsIgnoreCase(name)) {
			alloc_unit_cd(value);
			return;
		}
		if ($alloc_unit_nm.equalsIgnoreCase(name)) {
			alloc_unit_nm(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
			return;
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ(value);
			return;
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ_nm(value);
			return;
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_nm(value);
			return;
		}
		if ($loc_sppl_cd.equalsIgnoreCase(name)) {
			loc_sppl_cd(value);
			return;
		}
		if ($loc_sppl_nm.equalsIgnoreCase(name)) {
			loc_sppl_nm(value);
			return;
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_typ_nm.equalsIgnoreCase(name)) {
			io_schd_typ_nm(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($io_schd_sts_typ_nm.equalsIgnoreCase(name)) {
			io_schd_sts_typ_nm(value);
			return;
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			io_schd_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			trd_ptn_typ_nm(value);
			return;
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			trn_typ(value);
			return;
		}
		if ($trn_typ_nm.equalsIgnoreCase(name)) {
			trn_typ_nm(value);
			return;
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			io_act_typ(value);
			return;
		}
		if ($io_act_typ_nm.equalsIgnoreCase(name)) {
			io_act_typ_nm(value);
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
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
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
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
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
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
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
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
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
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($lno.equalsIgnoreCase(name)) {
			lno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
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
		if ($stop_dt.equalsIgnoreCase(name)) {
			stop_dt(value);
			return;
		}
		if ($rel_dt.equalsIgnoreCase(name)) {
			rel_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($overdue_alloc_flg.equalsIgnoreCase(name)) {
			overdue_alloc_flg(value);
			return;
		}
		if ($another_loc_alloc_flg.equalsIgnoreCase(name)) {
			another_loc_alloc_flg(value);
			return;
		}
		if ($abnormal_alloc_flg.equalsIgnoreCase(name)) {
			abnormal_alloc_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
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
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($qty_p.equalsIgnoreCase(name)) {
			return qty_p();
		}
		if ($lot_alloc_qty_p.equalsIgnoreCase(name)) {
			return lot_alloc_qty_p();
		}
		if ($lot_wait_qty_p.equalsIgnoreCase(name)) {
			return lot_wait_qty_p();
		}
		if ($lot_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			return lot_alloc_avl_qty_p();
		}
		if ($not_lot_alloc_qty_p.equalsIgnoreCase(name)) {
			return not_lot_alloc_qty_p();
		}
		if ($not_lot_wait_qty_p.equalsIgnoreCase(name)) {
			return not_lot_wait_qty_p();
		}
		if ($not_lot_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			return not_lot_alloc_avl_qty_p();
		}
		if ($lg_lot_alloc_qty_p.equalsIgnoreCase(name)) {
			return lg_lot_alloc_qty_p();
		}
		if ($lg_lot_wait_qty_p.equalsIgnoreCase(name)) {
			return lg_lot_wait_qty_p();
		}
		if ($lg_lot_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			return lg_lot_alloc_avl_qty_p();
		}
		if ($lg_not_lot_alloc_qty_p.equalsIgnoreCase(name)) {
			return lg_not_lot_alloc_qty_p();
		}
		if ($lg_not_lot_wait_qty_p.equalsIgnoreCase(name)) {
			return lg_not_lot_wait_qty_p();
		}
		if ($lg_not_lot_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			return lg_not_lot_alloc_avl_qty_p();
		}
		if ($grs_alloc_qty_p.equalsIgnoreCase(name)) {
			return grs_alloc_qty_p();
		}
		if ($grs_wait_qty_p.equalsIgnoreCase(name)) {
			return grs_wait_qty_p();
		}
		if ($alloc_qty_p.equalsIgnoreCase(name)) {
			return alloc_qty_p();
		}
		if ($wait_qty_p.equalsIgnoreCase(name)) {
			return wait_qty_p();
		}
		if ($grs_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			return grs_alloc_avl_qty_p();
		}
		if ($act_cont_fctr_p.equalsIgnoreCase(name)) {
			return act_cont_fctr_p();
		}
		if ($act_cont_qty_p.equalsIgnoreCase(name)) {
			return act_cont_qty_p();
		}
		if ($act_cont_alloc_qty_p.equalsIgnoreCase(name)) {
			return act_cont_alloc_qty_p();
		}
		if ($act_cont_wait_qty_p.equalsIgnoreCase(name)) {
			return act_cont_wait_qty_p();
		}
		if ($act_cont_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			return act_cont_alloc_avl_qty_p();
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			return std_cont_fctr_p();
		}
		if ($std_cont_qty_p.equalsIgnoreCase(name)) {
			return std_cont_qty_p();
		}
		if ($std_cont_alloc_qty_p.equalsIgnoreCase(name)) {
			return std_cont_alloc_qty_p();
		}
		if ($std_cont_wait_qty_p.equalsIgnoreCase(name)) {
			return std_cont_wait_qty_p();
		}
		if ($std_cont_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			return std_cont_alloc_avl_qty_p();
		}
		if ($cont_fctr_unit_p.equalsIgnoreCase(name)) {
			return cont_fctr_unit_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5250.VerNoR.class, value)
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
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			base_unit_qty_p(
				((MCContainerMeta) base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_p.equalsIgnoreCase(name)) {
			qty_p(
				((MCContainerMeta) qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($lot_alloc_qty_p.equalsIgnoreCase(name)) {
			lot_alloc_qty_p(
				((MCContainerMeta) lot_alloc_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($lot_wait_qty_p.equalsIgnoreCase(name)) {
			lot_wait_qty_p(
				((MCContainerMeta) lot_wait_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($lot_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			lot_alloc_avl_qty_p(
				((MCContainerMeta) lot_alloc_avl_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($not_lot_alloc_qty_p.equalsIgnoreCase(name)) {
			not_lot_alloc_qty_p(
				((MCContainerMeta) not_lot_alloc_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($not_lot_wait_qty_p.equalsIgnoreCase(name)) {
			not_lot_wait_qty_p(
				((MCContainerMeta) not_lot_wait_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($not_lot_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			not_lot_alloc_avl_qty_p(
				((MCContainerMeta) not_lot_alloc_avl_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($lg_lot_alloc_qty_p.equalsIgnoreCase(name)) {
			lg_lot_alloc_qty_p(
				((MCContainerMeta) lg_lot_alloc_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($lg_lot_wait_qty_p.equalsIgnoreCase(name)) {
			lg_lot_wait_qty_p(
				((MCContainerMeta) lg_lot_wait_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($lg_lot_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			lg_lot_alloc_avl_qty_p(
				((MCContainerMeta) lg_lot_alloc_avl_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($lg_not_lot_alloc_qty_p.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_qty_p(
				((MCContainerMeta) lg_not_lot_alloc_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($lg_not_lot_wait_qty_p.equalsIgnoreCase(name)) {
			lg_not_lot_wait_qty_p(
				((MCContainerMeta) lg_not_lot_wait_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($lg_not_lot_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_avl_qty_p(
				((MCContainerMeta) lg_not_lot_alloc_avl_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($grs_alloc_qty_p.equalsIgnoreCase(name)) {
			grs_alloc_qty_p(
				((MCContainerMeta) grs_alloc_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($grs_wait_qty_p.equalsIgnoreCase(name)) {
			grs_wait_qty_p(
				((MCContainerMeta) grs_wait_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($alloc_qty_p.equalsIgnoreCase(name)) {
			alloc_qty_p(
				((MCContainerMeta) alloc_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($wait_qty_p.equalsIgnoreCase(name)) {
			wait_qty_p(
				((MCContainerMeta) wait_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($grs_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			grs_alloc_avl_qty_p(
				((MCContainerMeta) grs_alloc_avl_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($act_cont_fctr_p.equalsIgnoreCase(name)) {
			act_cont_fctr_p(
				((MCContainerMeta) act_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5290.ActContFctrR.class, value)
			);
			return;
		}
		if ($act_cont_qty_p.equalsIgnoreCase(name)) {
			act_cont_qty_p(
				((MCContainerMeta) act_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($act_cont_alloc_qty_p.equalsIgnoreCase(name)) {
			act_cont_alloc_qty_p(
				((MCContainerMeta) act_cont_alloc_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($act_cont_wait_qty_p.equalsIgnoreCase(name)) {
			act_cont_wait_qty_p(
				((MCContainerMeta) act_cont_wait_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($act_cont_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			act_cont_alloc_avl_qty_p(
				((MCContainerMeta) act_cont_alloc_avl_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			std_cont_fctr_p(
				((MCContainerMeta) std_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5280.StdContFctrR.class, value)
			);
			return;
		}
		if ($std_cont_qty_p.equalsIgnoreCase(name)) {
			std_cont_qty_p(
				((MCContainerMeta) std_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($std_cont_alloc_qty_p.equalsIgnoreCase(name)) {
			std_cont_alloc_qty_p(
				((MCContainerMeta) std_cont_alloc_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($std_cont_wait_qty_p.equalsIgnoreCase(name)) {
			std_cont_wait_qty_p(
				((MCContainerMeta) std_cont_wait_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($std_cont_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			std_cont_alloc_avl_qty_p(
				((MCContainerMeta) std_cont_alloc_avl_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($cont_fctr_unit_p.equalsIgnoreCase(name)) {
			cont_fctr_unit_p(
				((MCContainerMeta) cont_fctr_unit_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
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
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return base_unit_qty_p().qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Inventory/GR qty. 在庫／入庫数量.<p>
	 *
	 */
	public MCNumber qty() {
		return qty_p().qty();
	}

	/**
	 * Inventory/GR qty. 在庫／入庫数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		qty_p().qty(value);
	}

	/**
	 * Inventory/GR qty. 在庫／入庫数量.<p>
	 *
	 */
	public void qty(int value) {
		qty_p().qty(value);
	}

	/**
	 * Inventory/GR qty. 在庫／入庫数量.<p>
	 *
	 */
	public void qty(long value) {
		qty_p().qty(value);
	}

	/**
	 * Inventory/GR qty. 在庫／入庫数量.<p>
	 *
	 */
	public void qty(float value) {
		qty_p().qty(value);
	}

	/**
	 * Inventory/GR qty. 在庫／入庫数量.<p>
	 *
	 */
	public void qty(double value) {
		qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Location allocation/with lot specified) 引当数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public MCNumber lot_alloc_qty() {
		return lot_alloc_qty_p().qty();
	}

	/**
	 * Allocation qty. (Location allocation/with lot specified) 引当数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public void lot_alloc_qty(MCNumber value) {
		lot_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Location allocation/with lot specified) 引当数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public void lot_alloc_qty(int value) {
		lot_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Location allocation/with lot specified) 引当数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public void lot_alloc_qty(long value) {
		lot_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Location allocation/with lot specified) 引当数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public void lot_alloc_qty(float value) {
		lot_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Location allocation/with lot specified) 引当数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public void lot_alloc_qty(double value) {
		lot_alloc_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Location allocation/with lot specified) 保留数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public MCNumber lot_wait_qty() {
		return lot_wait_qty_p().qty();
	}

	/**
	 * Pending qty. (Location allocation/with lot specified) 保留数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public void lot_wait_qty(MCNumber value) {
		lot_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Location allocation/with lot specified) 保留数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public void lot_wait_qty(int value) {
		lot_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Location allocation/with lot specified) 保留数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public void lot_wait_qty(long value) {
		lot_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Location allocation/with lot specified) 保留数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public void lot_wait_qty(float value) {
		lot_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Location allocation/with lot specified) 保留数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public void lot_wait_qty(double value) {
		lot_wait_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Location allocation/with lot number after subtraction) 引当可能数量（場所引当／ロット指定有減算後）.<p>
	 *
	 */
	public MCNumber lot_alloc_avl_qty() {
		return lot_alloc_avl_qty_p().qty();
	}

	/**
	 * Allocatable qty. (Location allocation/with lot number after subtraction) 引当可能数量（場所引当／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_alloc_avl_qty(MCNumber value) {
		lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Location allocation/with lot number after subtraction) 引当可能数量（場所引当／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_alloc_avl_qty(int value) {
		lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Location allocation/with lot number after subtraction) 引当可能数量（場所引当／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_alloc_avl_qty(long value) {
		lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Location allocation/with lot number after subtraction) 引当可能数量（場所引当／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_alloc_avl_qty(float value) {
		lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Location allocation/with lot number after subtraction) 引当可能数量（場所引当／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_alloc_avl_qty(double value) {
		lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Location allocation/without lot specified) 引当数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public MCNumber not_lot_alloc_qty() {
		return not_lot_alloc_qty_p().qty();
	}

	/**
	 * Allocation qty. (Location allocation/without lot specified) 引当数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public void not_lot_alloc_qty(MCNumber value) {
		not_lot_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Location allocation/without lot specified) 引当数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public void not_lot_alloc_qty(int value) {
		not_lot_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Location allocation/without lot specified) 引当数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public void not_lot_alloc_qty(long value) {
		not_lot_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Location allocation/without lot specified) 引当数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public void not_lot_alloc_qty(float value) {
		not_lot_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Location allocation/without lot specified) 引当数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public void not_lot_alloc_qty(double value) {
		not_lot_alloc_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Location allocation/without lot specified) 保留数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public MCNumber not_lot_wait_qty() {
		return not_lot_wait_qty_p().qty();
	}

	/**
	 * Pending qty. (Location allocation/without lot specified) 保留数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public void not_lot_wait_qty(MCNumber value) {
		not_lot_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Location allocation/without lot specified) 保留数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public void not_lot_wait_qty(int value) {
		not_lot_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Location allocation/without lot specified) 保留数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public void not_lot_wait_qty(long value) {
		not_lot_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Location allocation/without lot specified) 保留数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public void not_lot_wait_qty(float value) {
		not_lot_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Location allocation/without lot specified) 保留数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public void not_lot_wait_qty(double value) {
		not_lot_wait_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Location allocation/without lot number after subtraction) 引当可能数量（場所引当／ロット指定無減算後）.<p>
	 *
	 */
	public MCNumber not_lot_alloc_avl_qty() {
		return not_lot_alloc_avl_qty_p().qty();
	}

	/**
	 * Allocatable qty. (Location allocation/without lot number after subtraction) 引当可能数量（場所引当／ロット指定無減算後）.<p>
	 *
	 */
	public void not_lot_alloc_avl_qty(MCNumber value) {
		not_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Location allocation/without lot number after subtraction) 引当可能数量（場所引当／ロット指定無減算後）.<p>
	 *
	 */
	public void not_lot_alloc_avl_qty(int value) {
		not_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Location allocation/without lot number after subtraction) 引当可能数量（場所引当／ロット指定無減算後）.<p>
	 *
	 */
	public void not_lot_alloc_avl_qty(long value) {
		not_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Location allocation/without lot number after subtraction) 引当可能数量（場所引当／ロット指定無減算後）.<p>
	 *
	 */
	public void not_lot_alloc_avl_qty(float value) {
		not_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Location allocation/without lot number after subtraction) 引当可能数量（場所引当／ロット指定無減算後）.<p>
	 *
	 */
	public void not_lot_alloc_avl_qty(double value) {
		not_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Distribution G/with lot specified) 引当数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public MCNumber lg_lot_alloc_qty() {
		return lg_lot_alloc_qty_p().qty();
	}

	/**
	 * Allocation qty. (Distribution G/with lot specified) 引当数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public void lg_lot_alloc_qty(MCNumber value) {
		lg_lot_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Distribution G/with lot specified) 引当数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public void lg_lot_alloc_qty(int value) {
		lg_lot_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Distribution G/with lot specified) 引当数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public void lg_lot_alloc_qty(long value) {
		lg_lot_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Distribution G/with lot specified) 引当数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public void lg_lot_alloc_qty(float value) {
		lg_lot_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Distribution G/with lot specified) 引当数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public void lg_lot_alloc_qty(double value) {
		lg_lot_alloc_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Distribution G/with lot specified) 保留数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public MCNumber lg_lot_wait_qty() {
		return lg_lot_wait_qty_p().qty();
	}

	/**
	 * Pending qty. (Distribution G/with lot specified) 保留数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public void lg_lot_wait_qty(MCNumber value) {
		lg_lot_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Distribution G/with lot specified) 保留数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public void lg_lot_wait_qty(int value) {
		lg_lot_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Distribution G/with lot specified) 保留数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public void lg_lot_wait_qty(long value) {
		lg_lot_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Distribution G/with lot specified) 保留数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public void lg_lot_wait_qty(float value) {
		lg_lot_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Distribution G/with lot specified) 保留数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public void lg_lot_wait_qty(double value) {
		lg_lot_wait_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Distribution G/with lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定有減算後）.<p>
	 *
	 */
	public MCNumber lg_lot_alloc_avl_qty() {
		return lg_lot_alloc_avl_qty_p().qty();
	}

	/**
	 * Allocatable qty. (Distribution G/with lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定有減算後）.<p>
	 *
	 */
	public void lg_lot_alloc_avl_qty(MCNumber value) {
		lg_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Distribution G/with lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定有減算後）.<p>
	 *
	 */
	public void lg_lot_alloc_avl_qty(int value) {
		lg_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Distribution G/with lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定有減算後）.<p>
	 *
	 */
	public void lg_lot_alloc_avl_qty(long value) {
		lg_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Distribution G/with lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定有減算後）.<p>
	 *
	 */
	public void lg_lot_alloc_avl_qty(float value) {
		lg_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Distribution G/with lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定有減算後）.<p>
	 *
	 */
	public void lg_lot_alloc_avl_qty(double value) {
		lg_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Distribution G/without lot specified) 引当数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public MCNumber lg_not_lot_alloc_qty() {
		return lg_not_lot_alloc_qty_p().qty();
	}

	/**
	 * Allocation qty. (Distribution G/without lot specified) 引当数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public void lg_not_lot_alloc_qty(MCNumber value) {
		lg_not_lot_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Distribution G/without lot specified) 引当数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public void lg_not_lot_alloc_qty(int value) {
		lg_not_lot_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Distribution G/without lot specified) 引当数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public void lg_not_lot_alloc_qty(long value) {
		lg_not_lot_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Distribution G/without lot specified) 引当数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public void lg_not_lot_alloc_qty(float value) {
		lg_not_lot_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Distribution G/without lot specified) 引当数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public void lg_not_lot_alloc_qty(double value) {
		lg_not_lot_alloc_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Distribution G/without lot specified) 保留数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public MCNumber lg_not_lot_wait_qty() {
		return lg_not_lot_wait_qty_p().qty();
	}

	/**
	 * Pending qty. (Distribution G/without lot specified) 保留数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public void lg_not_lot_wait_qty(MCNumber value) {
		lg_not_lot_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Distribution G/without lot specified) 保留数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public void lg_not_lot_wait_qty(int value) {
		lg_not_lot_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Distribution G/without lot specified) 保留数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public void lg_not_lot_wait_qty(long value) {
		lg_not_lot_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Distribution G/without lot specified) 保留数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public void lg_not_lot_wait_qty(float value) {
		lg_not_lot_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Distribution G/without lot specified) 保留数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public void lg_not_lot_wait_qty(double value) {
		lg_not_lot_wait_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Distribution G/without lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定無減算後）.<p>
	 *
	 */
	public MCNumber lg_not_lot_alloc_avl_qty() {
		return lg_not_lot_alloc_avl_qty_p().qty();
	}

	/**
	 * Allocatable qty. (Distribution G/without lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定無減算後）.<p>
	 *
	 */
	public void lg_not_lot_alloc_avl_qty(MCNumber value) {
		lg_not_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Distribution G/without lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定無減算後）.<p>
	 *
	 */
	public void lg_not_lot_alloc_avl_qty(int value) {
		lg_not_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Distribution G/without lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定無減算後）.<p>
	 *
	 */
	public void lg_not_lot_alloc_avl_qty(long value) {
		lg_not_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Distribution G/without lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定無減算後）.<p>
	 *
	 */
	public void lg_not_lot_alloc_avl_qty(float value) {
		lg_not_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Distribution G/without lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定無減算後）.<p>
	 *
	 */
	public void lg_not_lot_alloc_avl_qty(double value) {
		lg_not_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Gross allocation) 引当数量（総量引当）.<p>
	 *
	 */
	public MCNumber grs_alloc_qty() {
		return grs_alloc_qty_p().qty();
	}

	/**
	 * Allocation qty. (Gross allocation) 引当数量（総量引当）.<p>
	 *
	 */
	public void grs_alloc_qty(MCNumber value) {
		grs_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Gross allocation) 引当数量（総量引当）.<p>
	 *
	 */
	public void grs_alloc_qty(int value) {
		grs_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Gross allocation) 引当数量（総量引当）.<p>
	 *
	 */
	public void grs_alloc_qty(long value) {
		grs_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Gross allocation) 引当数量（総量引当）.<p>
	 *
	 */
	public void grs_alloc_qty(float value) {
		grs_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Gross allocation) 引当数量（総量引当）.<p>
	 *
	 */
	public void grs_alloc_qty(double value) {
		grs_alloc_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Gross allocation) 保留数量（総量引当）.<p>
	 *
	 */
	public MCNumber grs_wait_qty() {
		return grs_wait_qty_p().qty();
	}

	/**
	 * Pending qty. (Gross allocation) 保留数量（総量引当）.<p>
	 *
	 */
	public void grs_wait_qty(MCNumber value) {
		grs_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Gross allocation) 保留数量（総量引当）.<p>
	 *
	 */
	public void grs_wait_qty(int value) {
		grs_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Gross allocation) 保留数量（総量引当）.<p>
	 *
	 */
	public void grs_wait_qty(long value) {
		grs_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Gross allocation) 保留数量（総量引当）.<p>
	 *
	 */
	public void grs_wait_qty(float value) {
		grs_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Gross allocation) 保留数量（総量引当）.<p>
	 *
	 */
	public void grs_wait_qty(double value) {
		grs_wait_qty_p().qty(value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public MCNumber alloc_qty() {
		return alloc_qty_p().qty();
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(MCNumber value) {
		alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(int value) {
		alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(long value) {
		alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(float value) {
		alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(double value) {
		alloc_qty_p().qty(value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public MCNumber wait_qty() {
		return wait_qty_p().qty();
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(MCNumber value) {
		wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(int value) {
		wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(long value) {
		wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(float value) {
		wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(double value) {
		wait_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public MCNumber grs_alloc_avl_qty() {
		return grs_alloc_avl_qty_p().qty();
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void grs_alloc_avl_qty(MCNumber value) {
		grs_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void grs_alloc_avl_qty(int value) {
		grs_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void grs_alloc_avl_qty(long value) {
		grs_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void grs_alloc_avl_qty(float value) {
		grs_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void grs_alloc_avl_qty(double value) {
		grs_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return act_cont_fctr_p().act_cont_fctr();
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public MCNumber act_cont_qty() {
		return act_cont_qty_p().cont_qty();
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(MCNumber value) {
		act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(int value) {
		act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(long value) {
		act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(float value) {
		act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(double value) {
		act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Allocated actual active ingredient 引当済実際有効成分.<p>
	 *
	 */
	public MCNumber act_cont_alloc_qty() {
		return act_cont_alloc_qty_p().cont_qty();
	}

	/**
	 * Allocated actual active ingredient 引当済実際有効成分.<p>
	 *
	 */
	public void act_cont_alloc_qty(MCNumber value) {
		act_cont_alloc_qty_p().cont_qty(value);
	}

	/**
	 * Allocated actual active ingredient 引当済実際有効成分.<p>
	 *
	 */
	public void act_cont_alloc_qty(int value) {
		act_cont_alloc_qty_p().cont_qty(value);
	}

	/**
	 * Allocated actual active ingredient 引当済実際有効成分.<p>
	 *
	 */
	public void act_cont_alloc_qty(long value) {
		act_cont_alloc_qty_p().cont_qty(value);
	}

	/**
	 * Allocated actual active ingredient 引当済実際有効成分.<p>
	 *
	 */
	public void act_cont_alloc_qty(float value) {
		act_cont_alloc_qty_p().cont_qty(value);
	}

	/**
	 * Allocated actual active ingredient 引当済実際有効成分.<p>
	 *
	 */
	public void act_cont_alloc_qty(double value) {
		act_cont_alloc_qty_p().cont_qty(value);
	}

	/**
	 * Pending actual active ingredient 保留実際有効成分.<p>
	 *
	 */
	public MCNumber act_cont_wait_qty() {
		return act_cont_wait_qty_p().cont_qty();
	}

	/**
	 * Pending actual active ingredient 保留実際有効成分.<p>
	 *
	 */
	public void act_cont_wait_qty(MCNumber value) {
		act_cont_wait_qty_p().cont_qty(value);
	}

	/**
	 * Pending actual active ingredient 保留実際有効成分.<p>
	 *
	 */
	public void act_cont_wait_qty(int value) {
		act_cont_wait_qty_p().cont_qty(value);
	}

	/**
	 * Pending actual active ingredient 保留実際有効成分.<p>
	 *
	 */
	public void act_cont_wait_qty(long value) {
		act_cont_wait_qty_p().cont_qty(value);
	}

	/**
	 * Pending actual active ingredient 保留実際有効成分.<p>
	 *
	 */
	public void act_cont_wait_qty(float value) {
		act_cont_wait_qty_p().cont_qty(value);
	}

	/**
	 * Pending actual active ingredient 保留実際有効成分.<p>
	 *
	 */
	public void act_cont_wait_qty(double value) {
		act_cont_wait_qty_p().cont_qty(value);
	}

	/**
	 * Allocatable actual active ingredient 引当可能実際有効成分.<p>
	 *
	 */
	public MCNumber act_cont_alloc_avl_qty() {
		return act_cont_alloc_avl_qty_p().cont_qty();
	}

	/**
	 * Allocatable actual active ingredient 引当可能実際有効成分.<p>
	 *
	 */
	public void act_cont_alloc_avl_qty(MCNumber value) {
		act_cont_alloc_avl_qty_p().cont_qty(value);
	}

	/**
	 * Allocatable actual active ingredient 引当可能実際有効成分.<p>
	 *
	 */
	public void act_cont_alloc_avl_qty(int value) {
		act_cont_alloc_avl_qty_p().cont_qty(value);
	}

	/**
	 * Allocatable actual active ingredient 引当可能実際有効成分.<p>
	 *
	 */
	public void act_cont_alloc_avl_qty(long value) {
		act_cont_alloc_avl_qty_p().cont_qty(value);
	}

	/**
	 * Allocatable actual active ingredient 引当可能実際有効成分.<p>
	 *
	 */
	public void act_cont_alloc_avl_qty(float value) {
		act_cont_alloc_avl_qty_p().cont_qty(value);
	}

	/**
	 * Allocatable actual active ingredient 引当可能実際有効成分.<p>
	 *
	 */
	public void act_cont_alloc_avl_qty(double value) {
		act_cont_alloc_avl_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return std_cont_fctr_p().std_cont_fctr();
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public MCNumber std_cont_qty() {
		return std_cont_qty_p().cont_qty();
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(MCNumber value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(int value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(long value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(float value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(double value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Allocated standard active ingredient 引当済標準有効成分.<p>
	 *
	 */
	public MCNumber std_cont_alloc_qty() {
		return std_cont_alloc_qty_p().cont_qty();
	}

	/**
	 * Allocated standard active ingredient 引当済標準有効成分.<p>
	 *
	 */
	public void std_cont_alloc_qty(MCNumber value) {
		std_cont_alloc_qty_p().cont_qty(value);
	}

	/**
	 * Allocated standard active ingredient 引当済標準有効成分.<p>
	 *
	 */
	public void std_cont_alloc_qty(int value) {
		std_cont_alloc_qty_p().cont_qty(value);
	}

	/**
	 * Allocated standard active ingredient 引当済標準有効成分.<p>
	 *
	 */
	public void std_cont_alloc_qty(long value) {
		std_cont_alloc_qty_p().cont_qty(value);
	}

	/**
	 * Allocated standard active ingredient 引当済標準有効成分.<p>
	 *
	 */
	public void std_cont_alloc_qty(float value) {
		std_cont_alloc_qty_p().cont_qty(value);
	}

	/**
	 * Allocated standard active ingredient 引当済標準有効成分.<p>
	 *
	 */
	public void std_cont_alloc_qty(double value) {
		std_cont_alloc_qty_p().cont_qty(value);
	}

	/**
	 * Pending standard active ingredient 保留標準有効成分.<p>
	 *
	 */
	public MCNumber std_cont_wait_qty() {
		return std_cont_wait_qty_p().cont_qty();
	}

	/**
	 * Pending standard active ingredient 保留標準有効成分.<p>
	 *
	 */
	public void std_cont_wait_qty(MCNumber value) {
		std_cont_wait_qty_p().cont_qty(value);
	}

	/**
	 * Pending standard active ingredient 保留標準有効成分.<p>
	 *
	 */
	public void std_cont_wait_qty(int value) {
		std_cont_wait_qty_p().cont_qty(value);
	}

	/**
	 * Pending standard active ingredient 保留標準有効成分.<p>
	 *
	 */
	public void std_cont_wait_qty(long value) {
		std_cont_wait_qty_p().cont_qty(value);
	}

	/**
	 * Pending standard active ingredient 保留標準有効成分.<p>
	 *
	 */
	public void std_cont_wait_qty(float value) {
		std_cont_wait_qty_p().cont_qty(value);
	}

	/**
	 * Pending standard active ingredient 保留標準有効成分.<p>
	 *
	 */
	public void std_cont_wait_qty(double value) {
		std_cont_wait_qty_p().cont_qty(value);
	}

	/**
	 * Allocatable standard active ingredient 引当可能標準有効成分.<p>
	 *
	 */
	public MCNumber std_cont_alloc_avl_qty() {
		return std_cont_alloc_avl_qty_p().cont_qty();
	}

	/**
	 * Allocatable standard active ingredient 引当可能標準有効成分.<p>
	 *
	 */
	public void std_cont_alloc_avl_qty(MCNumber value) {
		std_cont_alloc_avl_qty_p().cont_qty(value);
	}

	/**
	 * Allocatable standard active ingredient 引当可能標準有効成分.<p>
	 *
	 */
	public void std_cont_alloc_avl_qty(int value) {
		std_cont_alloc_avl_qty_p().cont_qty(value);
	}

	/**
	 * Allocatable standard active ingredient 引当可能標準有効成分.<p>
	 *
	 */
	public void std_cont_alloc_avl_qty(long value) {
		std_cont_alloc_avl_qty_p().cont_qty(value);
	}

	/**
	 * Allocatable standard active ingredient 引当可能標準有効成分.<p>
	 *
	 */
	public void std_cont_alloc_avl_qty(float value) {
		std_cont_alloc_avl_qty_p().cont_qty(value);
	}

	/**
	 * Allocatable standard active ingredient 引当可能標準有効成分.<p>
	 *
	 */
	public void std_cont_alloc_avl_qty(double value) {
		std_cont_alloc_avl_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return cont_fctr_unit_p().cont_fctr_unit_cd();
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		cont_fctr_unit_p().cont_fctr_unit_cd(value);
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public String cont_fctr_unit_nm() {
		return cont_fctr_unit_p().cont_fctr_unit_nm();
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public void cont_fctr_unit_nm(String value) {
		cont_fctr_unit_p().cont_fctr_unit_nm(value);
	}

}

