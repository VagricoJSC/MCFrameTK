package mcframe.serverMSBE.MSBEL0040;

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
 * ブロック"Srch01_RsltGr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltGrR_MC_A extends MCConstRow {

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
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
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
	 * Without rack/line cd. 棚・ラインＣＤ無.<p>
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
	 * SKU number of decimal places 荷姿単位小数量部有効桁数量.<p>
	 *
	 */
	public static final String $pack_unit_dec_place = "pack_unit_dec_place";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
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
	 * Base unit number of decimal places 基準単位小数量部有効桁数量.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Inventory/GR qty. 在庫／入庫数量.<p>
	 *
	 */
	public static final String $qty = "qty";
	/**
	 * Allocation qty. (Location allocation/with lot specified) 引当数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public static final String $lot_alloc_qty = "lot_alloc_qty";
	/**
	 * Pending qty. (Location allocation/with lot specified) 保留数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public static final String $lot_wait_qty = "lot_wait_qty";
	/**
	 * Allocatable qty. (Location allocation/with lot number after subtraction) 引当可能数量（場所引当／ロット指定有減算後）.<p>
	 *
	 */
	public static final String $lot_alloc_avl_qty = "lot_alloc_avl_qty";
	/**
	 * Allocation qty. (Location allocation/without lot specified) 引当数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public static final String $not_lot_alloc_qty = "not_lot_alloc_qty";
	/**
	 * Pending qty. (Location allocation/without lot specified) 保留数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public static final String $not_lot_wait_qty = "not_lot_wait_qty";
	/**
	 * Allocatable qty. (Location allocation/without lot number after subtraction) 引当可能数量（場所引当／ロット指定無減算後）.<p>
	 *
	 */
	public static final String $not_lot_alloc_avl_qty = "not_lot_alloc_avl_qty";
	/**
	 * Allocation qty. (Distribution G/with lot specified) 引当数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public static final String $lg_lot_alloc_qty = "lg_lot_alloc_qty";
	/**
	 * Pending qty. (Distribution G/with lot specified) 保留数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public static final String $lg_lot_wait_qty = "lg_lot_wait_qty";
	/**
	 * Allocatable qty. (Distribution G/with lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定有減算後）.<p>
	 *
	 */
	public static final String $lg_lot_alloc_avl_qty = "lg_lot_alloc_avl_qty";
	/**
	 * Allocation qty. (Distribution G/without lot specified) 引当数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public static final String $lg_not_lot_alloc_qty = "lg_not_lot_alloc_qty";
	/**
	 * Pending qty. (Distribution G/without lot specified) 保留数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public static final String $lg_not_lot_wait_qty = "lg_not_lot_wait_qty";
	/**
	 * Allocatable qty. (Distribution G/without lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定無減算後）.<p>
	 *
	 */
	public static final String $lg_not_lot_alloc_avl_qty = "lg_not_lot_alloc_avl_qty";
	/**
	 * Allocation qty. (Gross allocation) 引当数量（総量引当）.<p>
	 *
	 */
	public static final String $grs_alloc_qty = "grs_alloc_qty";
	/**
	 * Pending qty. (Gross allocation) 保留数量（総量引当）.<p>
	 *
	 */
	public static final String $grs_wait_qty = "grs_wait_qty";
	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public static final String $alloc_qty = "alloc_qty";
	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public static final String $wait_qty = "wait_qty";
	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public static final String $grs_alloc_avl_qty = "grs_alloc_avl_qty";
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
	 * Allocation unit number of decimal places 引当単位小数量部有効桁数量.<p>
	 *
	 */
	public static final String $alloc_unit_dec_place = "alloc_unit_dec_place";
	/**
	 * Allocation qty. (Base unit) 引当数量（基準単位）.<p>
	 *
	 */
	public static final String $base_unit_alloc_qty = "base_unit_alloc_qty";
	/**
	 * Pending qty. (Base unit) 保留数量（基準単位）.<p>
	 *
	 */
	public static final String $base_unit_wait_qty = "base_unit_wait_qty";
	/**
	 * Allocatable qty. (Base unit) 引当可能数量（基準単位）.<p>
	 *
	 */
	public static final String $base_unit_avl_qty = "base_unit_avl_qty";
	/**
	 * Actual active ingredient coefficient qty. 実際有効成分係数量.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public static final String $act_cont_qty = "act_cont_qty";
	/**
	 * Allocated actual active ingredient 引当済実際有効成分.<p>
	 *
	 */
	public static final String $act_cont_alloc_qty = "act_cont_alloc_qty";
	/**
	 * Pending actual active ingredient 保留実際有効成分.<p>
	 *
	 */
	public static final String $act_cont_wait_qty = "act_cont_wait_qty";
	/**
	 * Allocatable actual active ingredient 引当可能実際有効成分.<p>
	 *
	 */
	public static final String $act_cont_alloc_avl_qty = "act_cont_alloc_avl_qty";
	/**
	 * Standard active ingredient coefficient amount 標準有効成分係数量.<p>
	 *
	 */
	public static final String $std_cont_fctr = "std_cont_fctr";
	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public static final String $std_cont_qty = "std_cont_qty";
	/**
	 * Allocated standard active ingredient 引当済標準有効成分.<p>
	 *
	 */
	public static final String $std_cont_alloc_qty = "std_cont_alloc_qty";
	/**
	 * Pending standard active ingredient 保留標準有効成分.<p>
	 *
	 */
	public static final String $std_cont_wait_qty = "std_cont_wait_qty";
	/**
	 * Allocatable standard active ingredient 引当可能標準有効成分.<p>
	 *
	 */
	public static final String $std_cont_alloc_avl_qty = "std_cont_alloc_avl_qty";
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
	 * For active ingredient flg. 有効成分対象ＦＬＧ.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Active ingredient qty. conversion rounding type 有効成分換算端数量処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	/**
	 * Active ingredient number of decimal places 有効成分小数量部有効桁数量.<p>
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
	/**
	 * Row number 行番号.<p>
	 *
	 */
	public static final String $lno = "lno";


	public static final MCMeta schd_stk_typ_META = createCommonMeta($schd_stk_typ, mcframe.commonMS.meta.MS_META.SCHD_STK_TYP);
	public static final MCMeta schd_stk_typ_nm_META = createCommonMeta($schd_stk_typ_nm, mcframe.commonMS.meta.MS_META.SCHD_STK_TYP_NM);
	public static final MCMeta dt_META = createCommonMeta($dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
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
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta lot_alloc_qty_META = createCommonMeta($lot_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta lot_wait_qty_META = createCommonMeta($lot_wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta lot_alloc_avl_qty_META = createCommonMeta($lot_alloc_avl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta not_lot_alloc_qty_META = createCommonMeta($not_lot_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta not_lot_wait_qty_META = createCommonMeta($not_lot_wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta not_lot_alloc_avl_qty_META = createCommonMeta($not_lot_alloc_avl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta lg_lot_alloc_qty_META = createCommonMeta($lg_lot_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta lg_lot_wait_qty_META = createCommonMeta($lg_lot_wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta lg_lot_alloc_avl_qty_META = createCommonMeta($lg_lot_alloc_avl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta lg_not_lot_alloc_qty_META = createCommonMeta($lg_not_lot_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta lg_not_lot_wait_qty_META = createCommonMeta($lg_not_lot_wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta lg_not_lot_alloc_avl_qty_META = createCommonMeta($lg_not_lot_alloc_avl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta grs_alloc_qty_META = createCommonMeta($grs_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta grs_wait_qty_META = createCommonMeta($grs_wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alloc_qty_META = createCommonMeta($alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta wait_qty_META = createCommonMeta($wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta grs_alloc_avl_qty_META = createCommonMeta($grs_alloc_avl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alloc_unit_cd_META = createCommonMeta($alloc_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta alloc_unit_nm_META = createCommonMeta($alloc_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta alloc_unit_dec_place_META = createCommonMeta($alloc_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_alloc_qty_META = createCommonMeta($base_unit_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_wait_qty_META = createCommonMeta($base_unit_wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_avl_qty_META = createCommonMeta($base_unit_avl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta act_cont_qty_META = createCommonMeta($act_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta act_cont_alloc_qty_META = createCommonMeta($act_cont_alloc_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta act_cont_wait_qty_META = createCommonMeta($act_cont_wait_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta act_cont_alloc_avl_qty_META = createCommonMeta($act_cont_alloc_avl_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta std_cont_qty_META = createCommonMeta($std_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta std_cont_alloc_qty_META = createCommonMeta($std_cont_alloc_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta std_cont_wait_qty_META = createCommonMeta($std_cont_wait_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta std_cont_alloc_avl_qty_META = createCommonMeta($std_cont_alloc_avl_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta cont_fctr_unit_nm_META = createCommonMeta($cont_fctr_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
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
	public static final MCMeta overdue_alloc_flg_META = createCommonMeta($overdue_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta another_loc_alloc_flg_META = createCommonMeta($another_loc_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abnormal_alloc_flg_META = createCommonMeta($abnormal_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lno_META = createNumberMeta($lno);

	protected static final ConstMetaList<Srch01_RsltGrR> constMetas = new ConstMetaList<Srch01_RsltGrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			schd_stk_typ_META,
			schd_stk_typ_nm_META,
			dt_META,
			wg_cd_META,
			wg_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			ver_no_META,
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
			base_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			qty_META,
			lot_alloc_qty_META,
			lot_wait_qty_META,
			lot_alloc_avl_qty_META,
			not_lot_alloc_qty_META,
			not_lot_wait_qty_META,
			not_lot_alloc_avl_qty_META,
			lg_lot_alloc_qty_META,
			lg_lot_wait_qty_META,
			lg_lot_alloc_avl_qty_META,
			lg_not_lot_alloc_qty_META,
			lg_not_lot_wait_qty_META,
			lg_not_lot_alloc_avl_qty_META,
			grs_alloc_qty_META,
			grs_wait_qty_META,
			alloc_qty_META,
			wait_qty_META,
			grs_alloc_avl_qty_META,
			alloc_unit_cd_META,
			alloc_unit_nm_META,
			alloc_unit_dec_place_META,
			base_unit_alloc_qty_META,
			base_unit_wait_qty_META,
			base_unit_avl_qty_META,
			act_cont_fctr_META,
			act_cont_qty_META,
			act_cont_alloc_qty_META,
			act_cont_wait_qty_META,
			act_cont_alloc_avl_qty_META,
			std_cont_fctr_META,
			std_cont_qty_META,
			std_cont_alloc_qty_META,
			std_cont_wait_qty_META,
			std_cont_alloc_avl_qty_META,
			cont_fctr_unit_cd_META,
			cont_fctr_unit_nm_META,
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
			overdue_alloc_flg_META,
			another_loc_alloc_flg_META,
			abnormal_alloc_flg_META,
			lno_META
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
				{$schd_stk_typ, "MSC_SCHD_STK_TYP"},	// schd_stk_typ
				{$quality_typ, "MAC_QUALITY_TYP"},	// quality_typ
				{$stk_insp_typ, "MSC_STK_INSP_TYP"},	// stk_insp_typ
				{$in_xfr_typ, "MSC_IN_XFR_TYP"},	// in_xfr_typ
				{$asst_typ, "MAC_ASST_TYP"},	// asst_typ
				{$stk_id_typ, "MSC_STK_ID_TYP"},	// stk_id_typ
				{$plnt_aprv_sts_typ, "MSC_PLNT_APRV_STS_TYP"},	// plnt_aprv_sts_typ
				{$mrkt_judg_sts_typ, "MSC_MRKT_JUDG_STS_TYP"},	// mrkt_judg_sts_typ
				{$io_schd_typ, "MSC_IO_SCHD_TYP"},	// io_schd_typ
				{$io_schd_sts_typ, "MSC_IO_SCHD_STS_TYP"},	// io_schd_sts_typ
				{$trd_ptn_typ, "MAC_TRD_PTN_TYP"},	// trd_ptn_typ
				{$trn_typ, "MSC_TRN_TYP"},	// trn_typ
				{$io_act_typ, "MSC_IO_ACT_TYP"}	// io_act_typ
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
	protected Srch01_RsltGrR_MC_A(ConstMetaList<? extends Srch01_RsltGrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltGrR clone() {
		return (Srch01_RsltGrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltGrR createInstance() {
		return (Srch01_RsltGrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltGrR getValues(String... names) {
		return (Srch01_RsltGrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Scheduled inventory type 予定在庫区分.<p>
	 *
	 */
	public String schd_stk_typ() {
		return getConstString(offset + 0, $schd_stk_typ);
	}

	/**
	 * Scheduled inventory type 予定在庫区分.<p>
	 *
	 */
	public void schd_stk_typ(String value) {
		setConstString(offset + 0, $schd_stk_typ, value);
	}


	/**
	 * Scheduled inventory type name 予定在庫区分名.<p>
	 *
	 */
	public String schd_stk_typ_nm() {
		return getConstString(offset + 1, $schd_stk_typ_nm);
	}

	/**
	 * Scheduled inventory type name 予定在庫区分名.<p>
	 *
	 */
	public void schd_stk_typ_nm(String value) {
		setConstString(offset + 1, $schd_stk_typ_nm, value);
	}


	/**
	 * GR date 入庫日.<p>
	 *
	 */
	public MCDate dt() {
		return getConstDate(offset + 2, $dt);
	}

	/**
	 * GR date 入庫日.<p>
	 *
	 */
	public void dt(MCDate value) {
		setConstDate(offset + 2, $dt, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 3, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 3, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 4, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 4, $wg_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 5, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 5, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 6, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 6, $dpt_nm, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 7, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 7, $ver_no, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 8, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 8, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 9, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 9, $sublot_no, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 10, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 10, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 11, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 11, $loc_nm, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 12, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 12, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 13, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 13, $str_ln_nm, value);
	}


	/**
	 * Without rack/line cd. 棚・ラインＣＤ無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 14, $str_ln_cd_none_flg);
	}

	/**
	 * Without rack/line cd. 棚・ラインＣＤ無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 14, $str_ln_cd_none_flg, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 15, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 15, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 16, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 16, $site_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 17, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 17, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 18, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 18, $lg_grp_nm, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 19, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 19, $alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 20, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 20, $alloc_grp_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 21, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 21, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 22, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 22, $loc_grp_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 23, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 23, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 24, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 24, $gd_nm, value);
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
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 26, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 26, $quality_typ_nm, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 27, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 27, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 28, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 28, $stk_insp_typ_nm, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 29, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 29, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 30, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 30, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 31, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 31, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 32, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 32, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 33, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 33, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 34, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 34, $wrk_nm, value);
	}


	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public String in_xfr_typ() {
		return getConstString(offset + 35, $in_xfr_typ);
	}

	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public void in_xfr_typ(String value) {
		setConstString(offset + 35, $in_xfr_typ, value);
	}


	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public String in_xfr_typ_nm() {
		return getConstString(offset + 36, $in_xfr_typ_nm);
	}

	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public void in_xfr_typ_nm(String value) {
		setConstString(offset + 36, $in_xfr_typ_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 37, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 37, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 38, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 38, $asst_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 39, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 39, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 40, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 40, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 41, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 41, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 42, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 42, $stk_bp_nm, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 43, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 43, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 44, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 44, $stk_arrv_bp_nm, value);
	}


	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 45, $pack_unit_qty);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 45, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 45, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 45, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 45, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 45, $pack_unit_qty, value);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 46, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 46, $pack_unit_cd, value);
	}


	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 47, $pack_unit_nm);
	}

	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 47, $pack_unit_nm, value);
	}


	/**
	 * SKU number of decimal places 荷姿単位小数量部有効桁数量.<p>
	 *
	 */
	public MCNumber pack_unit_dec_place() {
		return getConstNumber(offset + 48, $pack_unit_dec_place);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数量部有効桁数量.<p>
	 *
	 */
	public void pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 48, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数量部有効桁数量.<p>
	 *
	 */
	public void pack_unit_dec_place(int value) {
		setConstNumber(offset + 48, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数量部有効桁数量.<p>
	 *
	 */
	public void pack_unit_dec_place(long value) {
		setConstNumber(offset + 48, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数量部有効桁数量.<p>
	 *
	 */
	public void pack_unit_dec_place(float value) {
		setConstNumber(offset + 48, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数量部有効桁数量.<p>
	 *
	 */
	public void pack_unit_dec_place(double value) {
		setConstNumber(offset + 48, $pack_unit_dec_place, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 49, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 49, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 49, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 49, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 49, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 49, $base_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 50, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 50, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 51, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 51, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数量部有効桁数量.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 52, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数量部有効桁数量.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 52, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数量部有効桁数量.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 52, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数量部有効桁数量.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 52, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数量部有効桁数量.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 52, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数量部有効桁数量.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 52, $base_unit_dec_place, value);
	}


	/**
	 * Inventory/GR qty. 在庫／入庫数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 53, $qty);
	}

	/**
	 * Inventory/GR qty. 在庫／入庫数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 53, $qty, value);
	}

	/**
	 * Inventory/GR qty. 在庫／入庫数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 53, $qty, value);
	}

	/**
	 * Inventory/GR qty. 在庫／入庫数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 53, $qty, value);
	}

	/**
	 * Inventory/GR qty. 在庫／入庫数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 53, $qty, value);
	}

	/**
	 * Inventory/GR qty. 在庫／入庫数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 53, $qty, value);
	}


	/**
	 * Allocation qty. (Location allocation/with lot specified) 引当数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public MCNumber lot_alloc_qty() {
		return getConstNumber(offset + 54, $lot_alloc_qty);
	}

	/**
	 * Allocation qty. (Location allocation/with lot specified) 引当数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public void lot_alloc_qty(MCNumber value) {
		setConstNumber(offset + 54, $lot_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Location allocation/with lot specified) 引当数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public void lot_alloc_qty(int value) {
		setConstNumber(offset + 54, $lot_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Location allocation/with lot specified) 引当数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public void lot_alloc_qty(long value) {
		setConstNumber(offset + 54, $lot_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Location allocation/with lot specified) 引当数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public void lot_alloc_qty(float value) {
		setConstNumber(offset + 54, $lot_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Location allocation/with lot specified) 引当数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public void lot_alloc_qty(double value) {
		setConstNumber(offset + 54, $lot_alloc_qty, value);
	}


	/**
	 * Pending qty. (Location allocation/with lot specified) 保留数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public MCNumber lot_wait_qty() {
		return getConstNumber(offset + 55, $lot_wait_qty);
	}

	/**
	 * Pending qty. (Location allocation/with lot specified) 保留数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public void lot_wait_qty(MCNumber value) {
		setConstNumber(offset + 55, $lot_wait_qty, value);
	}

	/**
	 * Pending qty. (Location allocation/with lot specified) 保留数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public void lot_wait_qty(int value) {
		setConstNumber(offset + 55, $lot_wait_qty, value);
	}

	/**
	 * Pending qty. (Location allocation/with lot specified) 保留数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public void lot_wait_qty(long value) {
		setConstNumber(offset + 55, $lot_wait_qty, value);
	}

	/**
	 * Pending qty. (Location allocation/with lot specified) 保留数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public void lot_wait_qty(float value) {
		setConstNumber(offset + 55, $lot_wait_qty, value);
	}

	/**
	 * Pending qty. (Location allocation/with lot specified) 保留数量（場所引当／ロット指定有）.<p>
	 *
	 */
	public void lot_wait_qty(double value) {
		setConstNumber(offset + 55, $lot_wait_qty, value);
	}


	/**
	 * Allocatable qty. (Location allocation/with lot number after subtraction) 引当可能数量（場所引当／ロット指定有減算後）.<p>
	 *
	 */
	public MCNumber lot_alloc_avl_qty() {
		return getConstNumber(offset + 56, $lot_alloc_avl_qty);
	}

	/**
	 * Allocatable qty. (Location allocation/with lot number after subtraction) 引当可能数量（場所引当／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_alloc_avl_qty(MCNumber value) {
		setConstNumber(offset + 56, $lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Location allocation/with lot number after subtraction) 引当可能数量（場所引当／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_alloc_avl_qty(int value) {
		setConstNumber(offset + 56, $lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Location allocation/with lot number after subtraction) 引当可能数量（場所引当／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_alloc_avl_qty(long value) {
		setConstNumber(offset + 56, $lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Location allocation/with lot number after subtraction) 引当可能数量（場所引当／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_alloc_avl_qty(float value) {
		setConstNumber(offset + 56, $lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Location allocation/with lot number after subtraction) 引当可能数量（場所引当／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_alloc_avl_qty(double value) {
		setConstNumber(offset + 56, $lot_alloc_avl_qty, value);
	}


	/**
	 * Allocation qty. (Location allocation/without lot specified) 引当数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public MCNumber not_lot_alloc_qty() {
		return getConstNumber(offset + 57, $not_lot_alloc_qty);
	}

	/**
	 * Allocation qty. (Location allocation/without lot specified) 引当数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public void not_lot_alloc_qty(MCNumber value) {
		setConstNumber(offset + 57, $not_lot_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Location allocation/without lot specified) 引当数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public void not_lot_alloc_qty(int value) {
		setConstNumber(offset + 57, $not_lot_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Location allocation/without lot specified) 引当数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public void not_lot_alloc_qty(long value) {
		setConstNumber(offset + 57, $not_lot_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Location allocation/without lot specified) 引当数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public void not_lot_alloc_qty(float value) {
		setConstNumber(offset + 57, $not_lot_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Location allocation/without lot specified) 引当数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public void not_lot_alloc_qty(double value) {
		setConstNumber(offset + 57, $not_lot_alloc_qty, value);
	}


	/**
	 * Pending qty. (Location allocation/without lot specified) 保留数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public MCNumber not_lot_wait_qty() {
		return getConstNumber(offset + 58, $not_lot_wait_qty);
	}

	/**
	 * Pending qty. (Location allocation/without lot specified) 保留数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public void not_lot_wait_qty(MCNumber value) {
		setConstNumber(offset + 58, $not_lot_wait_qty, value);
	}

	/**
	 * Pending qty. (Location allocation/without lot specified) 保留数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public void not_lot_wait_qty(int value) {
		setConstNumber(offset + 58, $not_lot_wait_qty, value);
	}

	/**
	 * Pending qty. (Location allocation/without lot specified) 保留数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public void not_lot_wait_qty(long value) {
		setConstNumber(offset + 58, $not_lot_wait_qty, value);
	}

	/**
	 * Pending qty. (Location allocation/without lot specified) 保留数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public void not_lot_wait_qty(float value) {
		setConstNumber(offset + 58, $not_lot_wait_qty, value);
	}

	/**
	 * Pending qty. (Location allocation/without lot specified) 保留数量（場所引当／ロット指定無）.<p>
	 *
	 */
	public void not_lot_wait_qty(double value) {
		setConstNumber(offset + 58, $not_lot_wait_qty, value);
	}


	/**
	 * Allocatable qty. (Location allocation/without lot number after subtraction) 引当可能数量（場所引当／ロット指定無減算後）.<p>
	 *
	 */
	public MCNumber not_lot_alloc_avl_qty() {
		return getConstNumber(offset + 59, $not_lot_alloc_avl_qty);
	}

	/**
	 * Allocatable qty. (Location allocation/without lot number after subtraction) 引当可能数量（場所引当／ロット指定無減算後）.<p>
	 *
	 */
	public void not_lot_alloc_avl_qty(MCNumber value) {
		setConstNumber(offset + 59, $not_lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Location allocation/without lot number after subtraction) 引当可能数量（場所引当／ロット指定無減算後）.<p>
	 *
	 */
	public void not_lot_alloc_avl_qty(int value) {
		setConstNumber(offset + 59, $not_lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Location allocation/without lot number after subtraction) 引当可能数量（場所引当／ロット指定無減算後）.<p>
	 *
	 */
	public void not_lot_alloc_avl_qty(long value) {
		setConstNumber(offset + 59, $not_lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Location allocation/without lot number after subtraction) 引当可能数量（場所引当／ロット指定無減算後）.<p>
	 *
	 */
	public void not_lot_alloc_avl_qty(float value) {
		setConstNumber(offset + 59, $not_lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Location allocation/without lot number after subtraction) 引当可能数量（場所引当／ロット指定無減算後）.<p>
	 *
	 */
	public void not_lot_alloc_avl_qty(double value) {
		setConstNumber(offset + 59, $not_lot_alloc_avl_qty, value);
	}


	/**
	 * Allocation qty. (Distribution G/with lot specified) 引当数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public MCNumber lg_lot_alloc_qty() {
		return getConstNumber(offset + 60, $lg_lot_alloc_qty);
	}

	/**
	 * Allocation qty. (Distribution G/with lot specified) 引当数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public void lg_lot_alloc_qty(MCNumber value) {
		setConstNumber(offset + 60, $lg_lot_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Distribution G/with lot specified) 引当数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public void lg_lot_alloc_qty(int value) {
		setConstNumber(offset + 60, $lg_lot_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Distribution G/with lot specified) 引当数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public void lg_lot_alloc_qty(long value) {
		setConstNumber(offset + 60, $lg_lot_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Distribution G/with lot specified) 引当数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public void lg_lot_alloc_qty(float value) {
		setConstNumber(offset + 60, $lg_lot_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Distribution G/with lot specified) 引当数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public void lg_lot_alloc_qty(double value) {
		setConstNumber(offset + 60, $lg_lot_alloc_qty, value);
	}


	/**
	 * Pending qty. (Distribution G/with lot specified) 保留数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public MCNumber lg_lot_wait_qty() {
		return getConstNumber(offset + 61, $lg_lot_wait_qty);
	}

	/**
	 * Pending qty. (Distribution G/with lot specified) 保留数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public void lg_lot_wait_qty(MCNumber value) {
		setConstNumber(offset + 61, $lg_lot_wait_qty, value);
	}

	/**
	 * Pending qty. (Distribution G/with lot specified) 保留数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public void lg_lot_wait_qty(int value) {
		setConstNumber(offset + 61, $lg_lot_wait_qty, value);
	}

	/**
	 * Pending qty. (Distribution G/with lot specified) 保留数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public void lg_lot_wait_qty(long value) {
		setConstNumber(offset + 61, $lg_lot_wait_qty, value);
	}

	/**
	 * Pending qty. (Distribution G/with lot specified) 保留数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public void lg_lot_wait_qty(float value) {
		setConstNumber(offset + 61, $lg_lot_wait_qty, value);
	}

	/**
	 * Pending qty. (Distribution G/with lot specified) 保留数量（物流Ｇ／ロット指定有）.<p>
	 *
	 */
	public void lg_lot_wait_qty(double value) {
		setConstNumber(offset + 61, $lg_lot_wait_qty, value);
	}


	/**
	 * Allocatable qty. (Distribution G/with lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定有減算後）.<p>
	 *
	 */
	public MCNumber lg_lot_alloc_avl_qty() {
		return getConstNumber(offset + 62, $lg_lot_alloc_avl_qty);
	}

	/**
	 * Allocatable qty. (Distribution G/with lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定有減算後）.<p>
	 *
	 */
	public void lg_lot_alloc_avl_qty(MCNumber value) {
		setConstNumber(offset + 62, $lg_lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Distribution G/with lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定有減算後）.<p>
	 *
	 */
	public void lg_lot_alloc_avl_qty(int value) {
		setConstNumber(offset + 62, $lg_lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Distribution G/with lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定有減算後）.<p>
	 *
	 */
	public void lg_lot_alloc_avl_qty(long value) {
		setConstNumber(offset + 62, $lg_lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Distribution G/with lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定有減算後）.<p>
	 *
	 */
	public void lg_lot_alloc_avl_qty(float value) {
		setConstNumber(offset + 62, $lg_lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Distribution G/with lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定有減算後）.<p>
	 *
	 */
	public void lg_lot_alloc_avl_qty(double value) {
		setConstNumber(offset + 62, $lg_lot_alloc_avl_qty, value);
	}


	/**
	 * Allocation qty. (Distribution G/without lot specified) 引当数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public MCNumber lg_not_lot_alloc_qty() {
		return getConstNumber(offset + 63, $lg_not_lot_alloc_qty);
	}

	/**
	 * Allocation qty. (Distribution G/without lot specified) 引当数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public void lg_not_lot_alloc_qty(MCNumber value) {
		setConstNumber(offset + 63, $lg_not_lot_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Distribution G/without lot specified) 引当数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public void lg_not_lot_alloc_qty(int value) {
		setConstNumber(offset + 63, $lg_not_lot_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Distribution G/without lot specified) 引当数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public void lg_not_lot_alloc_qty(long value) {
		setConstNumber(offset + 63, $lg_not_lot_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Distribution G/without lot specified) 引当数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public void lg_not_lot_alloc_qty(float value) {
		setConstNumber(offset + 63, $lg_not_lot_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Distribution G/without lot specified) 引当数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public void lg_not_lot_alloc_qty(double value) {
		setConstNumber(offset + 63, $lg_not_lot_alloc_qty, value);
	}


	/**
	 * Pending qty. (Distribution G/without lot specified) 保留数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public MCNumber lg_not_lot_wait_qty() {
		return getConstNumber(offset + 64, $lg_not_lot_wait_qty);
	}

	/**
	 * Pending qty. (Distribution G/without lot specified) 保留数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public void lg_not_lot_wait_qty(MCNumber value) {
		setConstNumber(offset + 64, $lg_not_lot_wait_qty, value);
	}

	/**
	 * Pending qty. (Distribution G/without lot specified) 保留数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public void lg_not_lot_wait_qty(int value) {
		setConstNumber(offset + 64, $lg_not_lot_wait_qty, value);
	}

	/**
	 * Pending qty. (Distribution G/without lot specified) 保留数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public void lg_not_lot_wait_qty(long value) {
		setConstNumber(offset + 64, $lg_not_lot_wait_qty, value);
	}

	/**
	 * Pending qty. (Distribution G/without lot specified) 保留数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public void lg_not_lot_wait_qty(float value) {
		setConstNumber(offset + 64, $lg_not_lot_wait_qty, value);
	}

	/**
	 * Pending qty. (Distribution G/without lot specified) 保留数量（物流Ｇ／ロット指定無）.<p>
	 *
	 */
	public void lg_not_lot_wait_qty(double value) {
		setConstNumber(offset + 64, $lg_not_lot_wait_qty, value);
	}


	/**
	 * Allocatable qty. (Distribution G/without lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定無減算後）.<p>
	 *
	 */
	public MCNumber lg_not_lot_alloc_avl_qty() {
		return getConstNumber(offset + 65, $lg_not_lot_alloc_avl_qty);
	}

	/**
	 * Allocatable qty. (Distribution G/without lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定無減算後）.<p>
	 *
	 */
	public void lg_not_lot_alloc_avl_qty(MCNumber value) {
		setConstNumber(offset + 65, $lg_not_lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Distribution G/without lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定無減算後）.<p>
	 *
	 */
	public void lg_not_lot_alloc_avl_qty(int value) {
		setConstNumber(offset + 65, $lg_not_lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Distribution G/without lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定無減算後）.<p>
	 *
	 */
	public void lg_not_lot_alloc_avl_qty(long value) {
		setConstNumber(offset + 65, $lg_not_lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Distribution G/without lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定無減算後）.<p>
	 *
	 */
	public void lg_not_lot_alloc_avl_qty(float value) {
		setConstNumber(offset + 65, $lg_not_lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Distribution G/without lot number after subtraction) 引当可能数量（物流Ｇ／ロット指定無減算後）.<p>
	 *
	 */
	public void lg_not_lot_alloc_avl_qty(double value) {
		setConstNumber(offset + 65, $lg_not_lot_alloc_avl_qty, value);
	}


	/**
	 * Allocation qty. (Gross allocation) 引当数量（総量引当）.<p>
	 *
	 */
	public MCNumber grs_alloc_qty() {
		return getConstNumber(offset + 66, $grs_alloc_qty);
	}

	/**
	 * Allocation qty. (Gross allocation) 引当数量（総量引当）.<p>
	 *
	 */
	public void grs_alloc_qty(MCNumber value) {
		setConstNumber(offset + 66, $grs_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Gross allocation) 引当数量（総量引当）.<p>
	 *
	 */
	public void grs_alloc_qty(int value) {
		setConstNumber(offset + 66, $grs_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Gross allocation) 引当数量（総量引当）.<p>
	 *
	 */
	public void grs_alloc_qty(long value) {
		setConstNumber(offset + 66, $grs_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Gross allocation) 引当数量（総量引当）.<p>
	 *
	 */
	public void grs_alloc_qty(float value) {
		setConstNumber(offset + 66, $grs_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Gross allocation) 引当数量（総量引当）.<p>
	 *
	 */
	public void grs_alloc_qty(double value) {
		setConstNumber(offset + 66, $grs_alloc_qty, value);
	}


	/**
	 * Pending qty. (Gross allocation) 保留数量（総量引当）.<p>
	 *
	 */
	public MCNumber grs_wait_qty() {
		return getConstNumber(offset + 67, $grs_wait_qty);
	}

	/**
	 * Pending qty. (Gross allocation) 保留数量（総量引当）.<p>
	 *
	 */
	public void grs_wait_qty(MCNumber value) {
		setConstNumber(offset + 67, $grs_wait_qty, value);
	}

	/**
	 * Pending qty. (Gross allocation) 保留数量（総量引当）.<p>
	 *
	 */
	public void grs_wait_qty(int value) {
		setConstNumber(offset + 67, $grs_wait_qty, value);
	}

	/**
	 * Pending qty. (Gross allocation) 保留数量（総量引当）.<p>
	 *
	 */
	public void grs_wait_qty(long value) {
		setConstNumber(offset + 67, $grs_wait_qty, value);
	}

	/**
	 * Pending qty. (Gross allocation) 保留数量（総量引当）.<p>
	 *
	 */
	public void grs_wait_qty(float value) {
		setConstNumber(offset + 67, $grs_wait_qty, value);
	}

	/**
	 * Pending qty. (Gross allocation) 保留数量（総量引当）.<p>
	 *
	 */
	public void grs_wait_qty(double value) {
		setConstNumber(offset + 67, $grs_wait_qty, value);
	}


	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public MCNumber alloc_qty() {
		return getConstNumber(offset + 68, $alloc_qty);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(MCNumber value) {
		setConstNumber(offset + 68, $alloc_qty, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(int value) {
		setConstNumber(offset + 68, $alloc_qty, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(long value) {
		setConstNumber(offset + 68, $alloc_qty, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(float value) {
		setConstNumber(offset + 68, $alloc_qty, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(double value) {
		setConstNumber(offset + 68, $alloc_qty, value);
	}


	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public MCNumber wait_qty() {
		return getConstNumber(offset + 69, $wait_qty);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(MCNumber value) {
		setConstNumber(offset + 69, $wait_qty, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(int value) {
		setConstNumber(offset + 69, $wait_qty, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(long value) {
		setConstNumber(offset + 69, $wait_qty, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(float value) {
		setConstNumber(offset + 69, $wait_qty, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(double value) {
		setConstNumber(offset + 69, $wait_qty, value);
	}


	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public MCNumber grs_alloc_avl_qty() {
		return getConstNumber(offset + 70, $grs_alloc_avl_qty);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void grs_alloc_avl_qty(MCNumber value) {
		setConstNumber(offset + 70, $grs_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void grs_alloc_avl_qty(int value) {
		setConstNumber(offset + 70, $grs_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void grs_alloc_avl_qty(long value) {
		setConstNumber(offset + 70, $grs_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void grs_alloc_avl_qty(float value) {
		setConstNumber(offset + 70, $grs_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. 引当可能数量.<p>
	 *
	 */
	public void grs_alloc_avl_qty(double value) {
		setConstNumber(offset + 70, $grs_alloc_avl_qty, value);
	}


	/**
	 * Allocation unit cd. 引当単位ＣＤ.<p>
	 *
	 */
	public String alloc_unit_cd() {
		return getConstString(offset + 71, $alloc_unit_cd);
	}

	/**
	 * Allocation unit cd. 引当単位ＣＤ.<p>
	 *
	 */
	public void alloc_unit_cd(String value) {
		setConstString(offset + 71, $alloc_unit_cd, value);
	}


	/**
	 * Allocation unit name 引当単位名.<p>
	 *
	 */
	public String alloc_unit_nm() {
		return getConstString(offset + 72, $alloc_unit_nm);
	}

	/**
	 * Allocation unit name 引当単位名.<p>
	 *
	 */
	public void alloc_unit_nm(String value) {
		setConstString(offset + 72, $alloc_unit_nm, value);
	}


	/**
	 * Allocation unit number of decimal places 引当単位小数量部有効桁数量.<p>
	 *
	 */
	public MCNumber alloc_unit_dec_place() {
		return getConstNumber(offset + 73, $alloc_unit_dec_place);
	}

	/**
	 * Allocation unit number of decimal places 引当単位小数量部有効桁数量.<p>
	 *
	 */
	public void alloc_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 73, $alloc_unit_dec_place, value);
	}

	/**
	 * Allocation unit number of decimal places 引当単位小数量部有効桁数量.<p>
	 *
	 */
	public void alloc_unit_dec_place(int value) {
		setConstNumber(offset + 73, $alloc_unit_dec_place, value);
	}

	/**
	 * Allocation unit number of decimal places 引当単位小数量部有効桁数量.<p>
	 *
	 */
	public void alloc_unit_dec_place(long value) {
		setConstNumber(offset + 73, $alloc_unit_dec_place, value);
	}

	/**
	 * Allocation unit number of decimal places 引当単位小数量部有効桁数量.<p>
	 *
	 */
	public void alloc_unit_dec_place(float value) {
		setConstNumber(offset + 73, $alloc_unit_dec_place, value);
	}

	/**
	 * Allocation unit number of decimal places 引当単位小数量部有効桁数量.<p>
	 *
	 */
	public void alloc_unit_dec_place(double value) {
		setConstNumber(offset + 73, $alloc_unit_dec_place, value);
	}


	/**
	 * Allocation qty. (Base unit) 引当数量（基準単位）.<p>
	 *
	 */
	public MCNumber base_unit_alloc_qty() {
		return getConstNumber(offset + 74, $base_unit_alloc_qty);
	}

	/**
	 * Allocation qty. (Base unit) 引当数量（基準単位）.<p>
	 *
	 */
	public void base_unit_alloc_qty(MCNumber value) {
		setConstNumber(offset + 74, $base_unit_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Base unit) 引当数量（基準単位）.<p>
	 *
	 */
	public void base_unit_alloc_qty(int value) {
		setConstNumber(offset + 74, $base_unit_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Base unit) 引当数量（基準単位）.<p>
	 *
	 */
	public void base_unit_alloc_qty(long value) {
		setConstNumber(offset + 74, $base_unit_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Base unit) 引当数量（基準単位）.<p>
	 *
	 */
	public void base_unit_alloc_qty(float value) {
		setConstNumber(offset + 74, $base_unit_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Base unit) 引当数量（基準単位）.<p>
	 *
	 */
	public void base_unit_alloc_qty(double value) {
		setConstNumber(offset + 74, $base_unit_alloc_qty, value);
	}


	/**
	 * Pending qty. (Base unit) 保留数量（基準単位）.<p>
	 *
	 */
	public MCNumber base_unit_wait_qty() {
		return getConstNumber(offset + 75, $base_unit_wait_qty);
	}

	/**
	 * Pending qty. (Base unit) 保留数量（基準単位）.<p>
	 *
	 */
	public void base_unit_wait_qty(MCNumber value) {
		setConstNumber(offset + 75, $base_unit_wait_qty, value);
	}

	/**
	 * Pending qty. (Base unit) 保留数量（基準単位）.<p>
	 *
	 */
	public void base_unit_wait_qty(int value) {
		setConstNumber(offset + 75, $base_unit_wait_qty, value);
	}

	/**
	 * Pending qty. (Base unit) 保留数量（基準単位）.<p>
	 *
	 */
	public void base_unit_wait_qty(long value) {
		setConstNumber(offset + 75, $base_unit_wait_qty, value);
	}

	/**
	 * Pending qty. (Base unit) 保留数量（基準単位）.<p>
	 *
	 */
	public void base_unit_wait_qty(float value) {
		setConstNumber(offset + 75, $base_unit_wait_qty, value);
	}

	/**
	 * Pending qty. (Base unit) 保留数量（基準単位）.<p>
	 *
	 */
	public void base_unit_wait_qty(double value) {
		setConstNumber(offset + 75, $base_unit_wait_qty, value);
	}


	/**
	 * Allocatable qty. (Base unit) 引当可能数量（基準単位）.<p>
	 *
	 */
	public MCNumber base_unit_avl_qty() {
		return getConstNumber(offset + 76, $base_unit_avl_qty);
	}

	/**
	 * Allocatable qty. (Base unit) 引当可能数量（基準単位）.<p>
	 *
	 */
	public void base_unit_avl_qty(MCNumber value) {
		setConstNumber(offset + 76, $base_unit_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Base unit) 引当可能数量（基準単位）.<p>
	 *
	 */
	public void base_unit_avl_qty(int value) {
		setConstNumber(offset + 76, $base_unit_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Base unit) 引当可能数量（基準単位）.<p>
	 *
	 */
	public void base_unit_avl_qty(long value) {
		setConstNumber(offset + 76, $base_unit_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Base unit) 引当可能数量（基準単位）.<p>
	 *
	 */
	public void base_unit_avl_qty(float value) {
		setConstNumber(offset + 76, $base_unit_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Base unit) 引当可能数量（基準単位）.<p>
	 *
	 */
	public void base_unit_avl_qty(double value) {
		setConstNumber(offset + 76, $base_unit_avl_qty, value);
	}


	/**
	 * Actual active ingredient coefficient qty. 実際有効成分係数量.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 77, $act_cont_fctr);
	}

	/**
	 * Actual active ingredient coefficient qty. 実際有効成分係数量.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 77, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient qty. 実際有効成分係数量.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 77, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient qty. 実際有効成分係数量.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 77, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient qty. 実際有効成分係数量.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 77, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient qty. 実際有効成分係数量.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 77, $act_cont_fctr, value);
	}


	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public MCNumber act_cont_qty() {
		return getConstNumber(offset + 78, $act_cont_qty);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(MCNumber value) {
		setConstNumber(offset + 78, $act_cont_qty, value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(int value) {
		setConstNumber(offset + 78, $act_cont_qty, value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(long value) {
		setConstNumber(offset + 78, $act_cont_qty, value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(float value) {
		setConstNumber(offset + 78, $act_cont_qty, value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(double value) {
		setConstNumber(offset + 78, $act_cont_qty, value);
	}


	/**
	 * Allocated actual active ingredient 引当済実際有効成分.<p>
	 *
	 */
	public MCNumber act_cont_alloc_qty() {
		return getConstNumber(offset + 79, $act_cont_alloc_qty);
	}

	/**
	 * Allocated actual active ingredient 引当済実際有効成分.<p>
	 *
	 */
	public void act_cont_alloc_qty(MCNumber value) {
		setConstNumber(offset + 79, $act_cont_alloc_qty, value);
	}

	/**
	 * Allocated actual active ingredient 引当済実際有効成分.<p>
	 *
	 */
	public void act_cont_alloc_qty(int value) {
		setConstNumber(offset + 79, $act_cont_alloc_qty, value);
	}

	/**
	 * Allocated actual active ingredient 引当済実際有効成分.<p>
	 *
	 */
	public void act_cont_alloc_qty(long value) {
		setConstNumber(offset + 79, $act_cont_alloc_qty, value);
	}

	/**
	 * Allocated actual active ingredient 引当済実際有効成分.<p>
	 *
	 */
	public void act_cont_alloc_qty(float value) {
		setConstNumber(offset + 79, $act_cont_alloc_qty, value);
	}

	/**
	 * Allocated actual active ingredient 引当済実際有効成分.<p>
	 *
	 */
	public void act_cont_alloc_qty(double value) {
		setConstNumber(offset + 79, $act_cont_alloc_qty, value);
	}


	/**
	 * Pending actual active ingredient 保留実際有効成分.<p>
	 *
	 */
	public MCNumber act_cont_wait_qty() {
		return getConstNumber(offset + 80, $act_cont_wait_qty);
	}

	/**
	 * Pending actual active ingredient 保留実際有効成分.<p>
	 *
	 */
	public void act_cont_wait_qty(MCNumber value) {
		setConstNumber(offset + 80, $act_cont_wait_qty, value);
	}

	/**
	 * Pending actual active ingredient 保留実際有効成分.<p>
	 *
	 */
	public void act_cont_wait_qty(int value) {
		setConstNumber(offset + 80, $act_cont_wait_qty, value);
	}

	/**
	 * Pending actual active ingredient 保留実際有効成分.<p>
	 *
	 */
	public void act_cont_wait_qty(long value) {
		setConstNumber(offset + 80, $act_cont_wait_qty, value);
	}

	/**
	 * Pending actual active ingredient 保留実際有効成分.<p>
	 *
	 */
	public void act_cont_wait_qty(float value) {
		setConstNumber(offset + 80, $act_cont_wait_qty, value);
	}

	/**
	 * Pending actual active ingredient 保留実際有効成分.<p>
	 *
	 */
	public void act_cont_wait_qty(double value) {
		setConstNumber(offset + 80, $act_cont_wait_qty, value);
	}


	/**
	 * Allocatable actual active ingredient 引当可能実際有効成分.<p>
	 *
	 */
	public MCNumber act_cont_alloc_avl_qty() {
		return getConstNumber(offset + 81, $act_cont_alloc_avl_qty);
	}

	/**
	 * Allocatable actual active ingredient 引当可能実際有効成分.<p>
	 *
	 */
	public void act_cont_alloc_avl_qty(MCNumber value) {
		setConstNumber(offset + 81, $act_cont_alloc_avl_qty, value);
	}

	/**
	 * Allocatable actual active ingredient 引当可能実際有効成分.<p>
	 *
	 */
	public void act_cont_alloc_avl_qty(int value) {
		setConstNumber(offset + 81, $act_cont_alloc_avl_qty, value);
	}

	/**
	 * Allocatable actual active ingredient 引当可能実際有効成分.<p>
	 *
	 */
	public void act_cont_alloc_avl_qty(long value) {
		setConstNumber(offset + 81, $act_cont_alloc_avl_qty, value);
	}

	/**
	 * Allocatable actual active ingredient 引当可能実際有効成分.<p>
	 *
	 */
	public void act_cont_alloc_avl_qty(float value) {
		setConstNumber(offset + 81, $act_cont_alloc_avl_qty, value);
	}

	/**
	 * Allocatable actual active ingredient 引当可能実際有効成分.<p>
	 *
	 */
	public void act_cont_alloc_avl_qty(double value) {
		setConstNumber(offset + 81, $act_cont_alloc_avl_qty, value);
	}


	/**
	 * Standard active ingredient coefficient amount 標準有効成分係数量.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 82, $std_cont_fctr);
	}

	/**
	 * Standard active ingredient coefficient amount 標準有効成分係数量.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 82, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient amount 標準有効成分係数量.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 82, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient amount 標準有効成分係数量.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 82, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient amount 標準有効成分係数量.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 82, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient amount 標準有効成分係数量.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 82, $std_cont_fctr, value);
	}


	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public MCNumber std_cont_qty() {
		return getConstNumber(offset + 83, $std_cont_qty);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(MCNumber value) {
		setConstNumber(offset + 83, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(int value) {
		setConstNumber(offset + 83, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(long value) {
		setConstNumber(offset + 83, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(float value) {
		setConstNumber(offset + 83, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(double value) {
		setConstNumber(offset + 83, $std_cont_qty, value);
	}


	/**
	 * Allocated standard active ingredient 引当済標準有効成分.<p>
	 *
	 */
	public MCNumber std_cont_alloc_qty() {
		return getConstNumber(offset + 84, $std_cont_alloc_qty);
	}

	/**
	 * Allocated standard active ingredient 引当済標準有効成分.<p>
	 *
	 */
	public void std_cont_alloc_qty(MCNumber value) {
		setConstNumber(offset + 84, $std_cont_alloc_qty, value);
	}

	/**
	 * Allocated standard active ingredient 引当済標準有効成分.<p>
	 *
	 */
	public void std_cont_alloc_qty(int value) {
		setConstNumber(offset + 84, $std_cont_alloc_qty, value);
	}

	/**
	 * Allocated standard active ingredient 引当済標準有効成分.<p>
	 *
	 */
	public void std_cont_alloc_qty(long value) {
		setConstNumber(offset + 84, $std_cont_alloc_qty, value);
	}

	/**
	 * Allocated standard active ingredient 引当済標準有効成分.<p>
	 *
	 */
	public void std_cont_alloc_qty(float value) {
		setConstNumber(offset + 84, $std_cont_alloc_qty, value);
	}

	/**
	 * Allocated standard active ingredient 引当済標準有効成分.<p>
	 *
	 */
	public void std_cont_alloc_qty(double value) {
		setConstNumber(offset + 84, $std_cont_alloc_qty, value);
	}


	/**
	 * Pending standard active ingredient 保留標準有効成分.<p>
	 *
	 */
	public MCNumber std_cont_wait_qty() {
		return getConstNumber(offset + 85, $std_cont_wait_qty);
	}

	/**
	 * Pending standard active ingredient 保留標準有効成分.<p>
	 *
	 */
	public void std_cont_wait_qty(MCNumber value) {
		setConstNumber(offset + 85, $std_cont_wait_qty, value);
	}

	/**
	 * Pending standard active ingredient 保留標準有効成分.<p>
	 *
	 */
	public void std_cont_wait_qty(int value) {
		setConstNumber(offset + 85, $std_cont_wait_qty, value);
	}

	/**
	 * Pending standard active ingredient 保留標準有効成分.<p>
	 *
	 */
	public void std_cont_wait_qty(long value) {
		setConstNumber(offset + 85, $std_cont_wait_qty, value);
	}

	/**
	 * Pending standard active ingredient 保留標準有効成分.<p>
	 *
	 */
	public void std_cont_wait_qty(float value) {
		setConstNumber(offset + 85, $std_cont_wait_qty, value);
	}

	/**
	 * Pending standard active ingredient 保留標準有効成分.<p>
	 *
	 */
	public void std_cont_wait_qty(double value) {
		setConstNumber(offset + 85, $std_cont_wait_qty, value);
	}


	/**
	 * Allocatable standard active ingredient 引当可能標準有効成分.<p>
	 *
	 */
	public MCNumber std_cont_alloc_avl_qty() {
		return getConstNumber(offset + 86, $std_cont_alloc_avl_qty);
	}

	/**
	 * Allocatable standard active ingredient 引当可能標準有効成分.<p>
	 *
	 */
	public void std_cont_alloc_avl_qty(MCNumber value) {
		setConstNumber(offset + 86, $std_cont_alloc_avl_qty, value);
	}

	/**
	 * Allocatable standard active ingredient 引当可能標準有効成分.<p>
	 *
	 */
	public void std_cont_alloc_avl_qty(int value) {
		setConstNumber(offset + 86, $std_cont_alloc_avl_qty, value);
	}

	/**
	 * Allocatable standard active ingredient 引当可能標準有効成分.<p>
	 *
	 */
	public void std_cont_alloc_avl_qty(long value) {
		setConstNumber(offset + 86, $std_cont_alloc_avl_qty, value);
	}

	/**
	 * Allocatable standard active ingredient 引当可能標準有効成分.<p>
	 *
	 */
	public void std_cont_alloc_avl_qty(float value) {
		setConstNumber(offset + 86, $std_cont_alloc_avl_qty, value);
	}

	/**
	 * Allocatable standard active ingredient 引当可能標準有効成分.<p>
	 *
	 */
	public void std_cont_alloc_avl_qty(double value) {
		setConstNumber(offset + 86, $std_cont_alloc_avl_qty, value);
	}


	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 87, $cont_fctr_unit_cd);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 87, $cont_fctr_unit_cd, value);
	}


	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public String cont_fctr_unit_nm() {
		return getConstString(offset + 88, $cont_fctr_unit_nm);
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public void cont_fctr_unit_nm(String value) {
		setConstString(offset + 88, $cont_fctr_unit_nm, value);
	}


	/**
	 * For active ingredient flg. 有効成分対象ＦＬＧ.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 89, $cont_fctr_flg);
	}

	/**
	 * For active ingredient flg. 有効成分対象ＦＬＧ.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 89, $cont_fctr_flg, value);
	}


	/**
	 * Active ingredient qty. conversion rounding type 有効成分換算端数量処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 90, $cont_fctr_rnd_typ);
	}

	/**
	 * Active ingredient qty. conversion rounding type 有効成分換算端数量処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 90, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数量部有効桁数量.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 91, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数量部有効桁数量.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 91, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数量部有効桁数量.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 91, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数量部有効桁数量.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 91, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数量部有効桁数量.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 91, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数量部有効桁数量.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 91, $cont_fctr_dec_place, value);
	}


	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public String lot_seq() {
		return getConstString(offset + 92, $lot_seq);
	}

	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public void lot_seq(String value) {
		setConstString(offset + 92, $lot_seq, value);
	}


	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 93, $first_gr_dt);
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 93, $first_gr_dt, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 94, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 94, $vld_dt, value);
	}


	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 95, $lmt_dt);
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 95, $lmt_dt, value);
	}


	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public String plnt_aprv_sts_typ() {
		return getConstString(offset + 96, $plnt_aprv_sts_typ);
	}

	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public void plnt_aprv_sts_typ(String value) {
		setConstString(offset + 96, $plnt_aprv_sts_typ, value);
	}


	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public String plnt_aprv_sts_typ_nm() {
		return getConstString(offset + 97, $plnt_aprv_sts_typ_nm);
	}

	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public void plnt_aprv_sts_typ_nm(String value) {
		setConstString(offset + 97, $plnt_aprv_sts_typ_nm, value);
	}


	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public String mrkt_judg_sts_typ() {
		return getConstString(offset + 98, $mrkt_judg_sts_typ);
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public void mrkt_judg_sts_typ(String value) {
		setConstString(offset + 98, $mrkt_judg_sts_typ, value);
	}


	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public String mrkt_judg_sts_typ_nm() {
		return getConstString(offset + 99, $mrkt_judg_sts_typ_nm);
	}

	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_nm(String value) {
		setConstString(offset + 99, $mrkt_judg_sts_typ_nm, value);
	}


	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate vld_dt_fr() {
		return getConstDate(offset + 100, $vld_dt_fr);
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public void vld_dt_fr(MCDate value) {
		setConstDate(offset + 100, $vld_dt_fr, value);
	}


	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCDate vld_dt_to() {
		return getConstDate(offset + 101, $vld_dt_to);
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public void vld_dt_to(MCDate value) {
		setConstDate(offset + 101, $vld_dt_to, value);
	}


	/**
	 * Unallocatable date 引当禁止日.<p>
	 *
	 */
	public MCDate stop_dt() {
		return getConstDate(offset + 102, $stop_dt);
	}

	/**
	 * Unallocatable date 引当禁止日.<p>
	 *
	 */
	public void stop_dt(MCDate value) {
		setConstDate(offset + 102, $stop_dt, value);
	}


	/**
	 * Allocation release date 引当解除日.<p>
	 *
	 */
	public MCDate rel_dt() {
		return getConstDate(offset + 103, $rel_dt);
	}

	/**
	 * Allocation release date 引当解除日.<p>
	 *
	 */
	public void rel_dt(MCDate value) {
		setConstDate(offset + 103, $rel_dt, value);
	}


	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public MCNumber alloc_margin_days() {
		return getConstNumber(offset + 104, $alloc_margin_days);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 104, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(int value) {
		setConstNumber(offset + 104, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(long value) {
		setConstNumber(offset + 104, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(float value) {
		setConstNumber(offset + 104, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(double value) {
		setConstNumber(offset + 104, $alloc_margin_days, value);
	}


	/**
	 * Location supplier cd. 場所発注先ＣＤ.<p>
	 *
	 */
	public String loc_sppl_cd() {
		return getConstString(offset + 105, $loc_sppl_cd);
	}

	/**
	 * Location supplier cd. 場所発注先ＣＤ.<p>
	 *
	 */
	public void loc_sppl_cd(String value) {
		setConstString(offset + 105, $loc_sppl_cd, value);
	}


	/**
	 * Location supplier name 場所発注先名.<p>
	 *
	 */
	public String loc_sppl_nm() {
		return getConstString(offset + 106, $loc_sppl_nm);
	}

	/**
	 * Location supplier name 場所発注先名.<p>
	 *
	 */
	public void loc_sppl_nm(String value) {
		setConstString(offset + 106, $loc_sppl_nm, value);
	}


	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public String io_schd_typ() {
		return getConstString(offset + 107, $io_schd_typ);
	}

	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public void io_schd_typ(String value) {
		setConstString(offset + 107, $io_schd_typ, value);
	}


	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public String io_schd_typ_nm() {
		return getConstString(offset + 108, $io_schd_typ_nm);
	}

	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public void io_schd_typ_nm(String value) {
		setConstString(offset + 108, $io_schd_typ_nm, value);
	}


	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public String io_schd_sts_typ() {
		return getConstString(offset + 109, $io_schd_sts_typ);
	}

	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public void io_schd_sts_typ(String value) {
		setConstString(offset + 109, $io_schd_sts_typ, value);
	}


	/**
	 * GR/GI schedule status type 受払予定状況区分名.<p>
	 *
	 */
	public String io_schd_sts_typ_nm() {
		return getConstString(offset + 110, $io_schd_sts_typ_nm);
	}

	/**
	 * GR/GI schedule status type 受払予定状況区分名.<p>
	 *
	 */
	public void io_schd_sts_typ_nm(String value) {
		setConstString(offset + 110, $io_schd_sts_typ_nm, value);
	}


	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public String io_schd_no() {
		return getConstString(offset + 111, $io_schd_no);
	}

	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public void io_schd_no(String value) {
		setConstString(offset + 111, $io_schd_no, value);
	}


	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public MCNumber io_schd_seq() {
		return getConstNumber(offset + 112, $io_schd_seq);
	}

	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public void io_schd_seq(MCNumber value) {
		setConstNumber(offset + 112, $io_schd_seq, value);
	}

	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public void io_schd_seq(int value) {
		setConstNumber(offset + 112, $io_schd_seq, value);
	}

	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public void io_schd_seq(long value) {
		setConstNumber(offset + 112, $io_schd_seq, value);
	}

	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public void io_schd_seq(float value) {
		setConstNumber(offset + 112, $io_schd_seq, value);
	}

	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public void io_schd_seq(double value) {
		setConstNumber(offset + 112, $io_schd_seq, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 113, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 113, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 114, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 114, $trd_nm, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 115, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 115, $trd_ptn_typ, value);
	}


	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public String trd_ptn_typ_nm() {
		return getConstString(offset + 116, $trd_ptn_typ_nm);
	}

	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public void trd_ptn_typ_nm(String value) {
		setConstString(offset + 116, $trd_ptn_typ_nm, value);
	}


	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public String trn_typ() {
		return getConstString(offset + 117, $trn_typ);
	}

	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public void trn_typ(String value) {
		setConstString(offset + 117, $trn_typ, value);
	}


	/**
	 * Transaction type name トランザクション区分名.<p>
	 *
	 */
	public String trn_typ_nm() {
		return getConstString(offset + 118, $trn_typ_nm);
	}

	/**
	 * Transaction type name トランザクション区分名.<p>
	 *
	 */
	public void trn_typ_nm(String value) {
		setConstString(offset + 118, $trn_typ_nm, value);
	}


	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public String io_act_typ() {
		return getConstString(offset + 119, $io_act_typ);
	}

	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public void io_act_typ(String value) {
		setConstString(offset + 119, $io_act_typ, value);
	}


	/**
	 * GR/GI type name 受払区分名.<p>
	 *
	 */
	public String io_act_typ_nm() {
		return getConstString(offset + 120, $io_act_typ_nm);
	}

	/**
	 * GR/GI type name 受払区分名.<p>
	 *
	 */
	public void io_act_typ_nm(String value) {
		setConstString(offset + 120, $io_act_typ_nm, value);
	}


	/**
	 * GR delay allocation 入庫遅れ引当.<p>
	 *
	 */
	public boolean overdue_alloc_flg() {
		return getConstBoolean(offset + 121, $overdue_alloc_flg);
	}

	/**
	 * GR delay allocation 入庫遅れ引当.<p>
	 *
	 */
	public void overdue_alloc_flg(boolean value) {
		setConstBoolean(offset + 121, $overdue_alloc_flg, value);
	}


	/**
	 * Allocation of location variance 場所違い引当.<p>
	 *
	 */
	public boolean another_loc_alloc_flg() {
		return getConstBoolean(offset + 122, $another_loc_alloc_flg);
	}

	/**
	 * Allocation of location variance 場所違い引当.<p>
	 *
	 */
	public void another_loc_alloc_flg(boolean value) {
		setConstBoolean(offset + 122, $another_loc_alloc_flg, value);
	}


	/**
	 * Allocation error 引当異常.<p>
	 *
	 */
	public boolean abnormal_alloc_flg() {
		return getConstBoolean(offset + 123, $abnormal_alloc_flg);
	}

	/**
	 * Allocation error 引当異常.<p>
	 *
	 */
	public void abnormal_alloc_flg(boolean value) {
		setConstBoolean(offset + 123, $abnormal_alloc_flg, value);
	}


	/**
	 * Row number 行番号.<p>
	 *
	 */
	public MCNumber lno() {
		return getConstNumber(offset + 124, $lno);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void lno(MCNumber value) {
		setConstNumber(offset + 124, $lno, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void lno(int value) {
		setConstNumber(offset + 124, $lno, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void lno(long value) {
		setConstNumber(offset + 124, $lno, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void lno(float value) {
		setConstNumber(offset + 124, $lno, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void lno(double value) {
		setConstNumber(offset + 124, $lno, value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($alloc_unit_cd.equalsIgnoreCase(name)) {
			return alloc_unit_cd();
		}
		if ($alloc_unit_nm.equalsIgnoreCase(name)) {
			return alloc_unit_nm();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($lot_alloc_qty.equalsIgnoreCase(name)) {
			return lot_alloc_qty();
		}
		if ($lot_wait_qty.equalsIgnoreCase(name)) {
			return lot_wait_qty();
		}
		if ($lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			return lot_alloc_avl_qty();
		}
		if ($not_lot_alloc_qty.equalsIgnoreCase(name)) {
			return not_lot_alloc_qty();
		}
		if ($not_lot_wait_qty.equalsIgnoreCase(name)) {
			return not_lot_wait_qty();
		}
		if ($not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			return not_lot_alloc_avl_qty();
		}
		if ($lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			return lg_lot_alloc_qty();
		}
		if ($lg_lot_wait_qty.equalsIgnoreCase(name)) {
			return lg_lot_wait_qty();
		}
		if ($lg_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			return lg_lot_alloc_avl_qty();
		}
		if ($lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			return lg_not_lot_alloc_qty();
		}
		if ($lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			return lg_not_lot_wait_qty();
		}
		if ($lg_not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			return lg_not_lot_alloc_avl_qty();
		}
		if ($grs_alloc_qty.equalsIgnoreCase(name)) {
			return grs_alloc_qty();
		}
		if ($grs_wait_qty.equalsIgnoreCase(name)) {
			return grs_wait_qty();
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			return alloc_qty();
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			return wait_qty();
		}
		if ($grs_alloc_avl_qty.equalsIgnoreCase(name)) {
			return grs_alloc_avl_qty();
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			return alloc_unit_dec_place();
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			return base_unit_alloc_qty();
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			return base_unit_wait_qty();
		}
		if ($base_unit_avl_qty.equalsIgnoreCase(name)) {
			return base_unit_avl_qty();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			return act_cont_qty();
		}
		if ($act_cont_alloc_qty.equalsIgnoreCase(name)) {
			return act_cont_alloc_qty();
		}
		if ($act_cont_wait_qty.equalsIgnoreCase(name)) {
			return act_cont_wait_qty();
		}
		if ($act_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			return act_cont_alloc_avl_qty();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			return std_cont_qty();
		}
		if ($std_cont_alloc_qty.equalsIgnoreCase(name)) {
			return std_cont_alloc_qty();
		}
		if ($std_cont_wait_qty.equalsIgnoreCase(name)) {
			return std_cont_wait_qty();
		}
		if ($std_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			return std_cont_alloc_avl_qty();
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
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($alloc_unit_cd.equalsIgnoreCase(name)) {
			return alloc_unit_cd();
		}
		if ($alloc_unit_nm.equalsIgnoreCase(name)) {
			return alloc_unit_nm();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($lot_alloc_qty.equalsIgnoreCase(name)) {
			return lot_alloc_qty();
		}
		if ($lot_wait_qty.equalsIgnoreCase(name)) {
			return lot_wait_qty();
		}
		if ($lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			return lot_alloc_avl_qty();
		}
		if ($not_lot_alloc_qty.equalsIgnoreCase(name)) {
			return not_lot_alloc_qty();
		}
		if ($not_lot_wait_qty.equalsIgnoreCase(name)) {
			return not_lot_wait_qty();
		}
		if ($not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			return not_lot_alloc_avl_qty();
		}
		if ($lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			return lg_lot_alloc_qty();
		}
		if ($lg_lot_wait_qty.equalsIgnoreCase(name)) {
			return lg_lot_wait_qty();
		}
		if ($lg_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			return lg_lot_alloc_avl_qty();
		}
		if ($lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			return lg_not_lot_alloc_qty();
		}
		if ($lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			return lg_not_lot_wait_qty();
		}
		if ($lg_not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			return lg_not_lot_alloc_avl_qty();
		}
		if ($grs_alloc_qty.equalsIgnoreCase(name)) {
			return grs_alloc_qty();
		}
		if ($grs_wait_qty.equalsIgnoreCase(name)) {
			return grs_wait_qty();
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			return alloc_qty();
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			return wait_qty();
		}
		if ($grs_alloc_avl_qty.equalsIgnoreCase(name)) {
			return grs_alloc_avl_qty();
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			return alloc_unit_dec_place();
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			return base_unit_alloc_qty();
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			return base_unit_wait_qty();
		}
		if ($base_unit_avl_qty.equalsIgnoreCase(name)) {
			return base_unit_avl_qty();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			return act_cont_qty();
		}
		if ($act_cont_alloc_qty.equalsIgnoreCase(name)) {
			return act_cont_alloc_qty();
		}
		if ($act_cont_wait_qty.equalsIgnoreCase(name)) {
			return act_cont_wait_qty();
		}
		if ($act_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			return act_cont_alloc_avl_qty();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			return std_cont_qty();
		}
		if ($std_cont_alloc_qty.equalsIgnoreCase(name)) {
			return std_cont_alloc_qty();
		}
		if ($std_cont_wait_qty.equalsIgnoreCase(name)) {
			return std_cont_wait_qty();
		}
		if ($std_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			return std_cont_alloc_avl_qty();
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
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($alloc_unit_cd.equalsIgnoreCase(name)) {
			alloc_unit_cd(value);
			return;
		}
		if ($alloc_unit_nm.equalsIgnoreCase(name)) {
			alloc_unit_nm(value);
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($lot_alloc_qty.equalsIgnoreCase(name)) {
			lot_alloc_qty(value);
			return;
		}
		if ($lot_wait_qty.equalsIgnoreCase(name)) {
			lot_wait_qty(value);
			return;
		}
		if ($lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lot_alloc_avl_qty(value);
			return;
		}
		if ($not_lot_alloc_qty.equalsIgnoreCase(name)) {
			not_lot_alloc_qty(value);
			return;
		}
		if ($not_lot_wait_qty.equalsIgnoreCase(name)) {
			not_lot_wait_qty(value);
			return;
		}
		if ($not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			not_lot_alloc_avl_qty(value);
			return;
		}
		if ($lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			lg_lot_alloc_qty(value);
			return;
		}
		if ($lg_lot_wait_qty.equalsIgnoreCase(name)) {
			lg_lot_wait_qty(value);
			return;
		}
		if ($lg_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lg_lot_alloc_avl_qty(value);
			return;
		}
		if ($lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_qty(value);
			return;
		}
		if ($lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			lg_not_lot_wait_qty(value);
			return;
		}
		if ($lg_not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_avl_qty(value);
			return;
		}
		if ($grs_alloc_qty.equalsIgnoreCase(name)) {
			grs_alloc_qty(value);
			return;
		}
		if ($grs_wait_qty.equalsIgnoreCase(name)) {
			grs_wait_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($grs_alloc_avl_qty.equalsIgnoreCase(name)) {
			grs_alloc_avl_qty(value);
			return;
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_alloc_qty(value);
			return;
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			base_unit_wait_qty(value);
			return;
		}
		if ($base_unit_avl_qty.equalsIgnoreCase(name)) {
			base_unit_avl_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($act_cont_alloc_qty.equalsIgnoreCase(name)) {
			act_cont_alloc_qty(value);
			return;
		}
		if ($act_cont_wait_qty.equalsIgnoreCase(name)) {
			act_cont_wait_qty(value);
			return;
		}
		if ($act_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			act_cont_alloc_avl_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_alloc_qty.equalsIgnoreCase(name)) {
			std_cont_alloc_qty(value);
			return;
		}
		if ($std_cont_wait_qty.equalsIgnoreCase(name)) {
			std_cont_wait_qty(value);
			return;
		}
		if ($std_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			std_cont_alloc_avl_qty(value);
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($lot_alloc_qty.equalsIgnoreCase(name)) {
			lot_alloc_qty(value);
			return;
		}
		if ($lot_wait_qty.equalsIgnoreCase(name)) {
			lot_wait_qty(value);
			return;
		}
		if ($lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lot_alloc_avl_qty(value);
			return;
		}
		if ($not_lot_alloc_qty.equalsIgnoreCase(name)) {
			not_lot_alloc_qty(value);
			return;
		}
		if ($not_lot_wait_qty.equalsIgnoreCase(name)) {
			not_lot_wait_qty(value);
			return;
		}
		if ($not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			not_lot_alloc_avl_qty(value);
			return;
		}
		if ($lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			lg_lot_alloc_qty(value);
			return;
		}
		if ($lg_lot_wait_qty.equalsIgnoreCase(name)) {
			lg_lot_wait_qty(value);
			return;
		}
		if ($lg_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lg_lot_alloc_avl_qty(value);
			return;
		}
		if ($lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_qty(value);
			return;
		}
		if ($lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			lg_not_lot_wait_qty(value);
			return;
		}
		if ($lg_not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_avl_qty(value);
			return;
		}
		if ($grs_alloc_qty.equalsIgnoreCase(name)) {
			grs_alloc_qty(value);
			return;
		}
		if ($grs_wait_qty.equalsIgnoreCase(name)) {
			grs_wait_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($grs_alloc_avl_qty.equalsIgnoreCase(name)) {
			grs_alloc_avl_qty(value);
			return;
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_alloc_qty(value);
			return;
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			base_unit_wait_qty(value);
			return;
		}
		if ($base_unit_avl_qty.equalsIgnoreCase(name)) {
			base_unit_avl_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($act_cont_alloc_qty.equalsIgnoreCase(name)) {
			act_cont_alloc_qty(value);
			return;
		}
		if ($act_cont_wait_qty.equalsIgnoreCase(name)) {
			act_cont_wait_qty(value);
			return;
		}
		if ($act_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			act_cont_alloc_avl_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_alloc_qty.equalsIgnoreCase(name)) {
			std_cont_alloc_qty(value);
			return;
		}
		if ($std_cont_wait_qty.equalsIgnoreCase(name)) {
			std_cont_wait_qty(value);
			return;
		}
		if ($std_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			std_cont_alloc_avl_qty(value);
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($lot_alloc_qty.equalsIgnoreCase(name)) {
			lot_alloc_qty(value);
			return;
		}
		if ($lot_wait_qty.equalsIgnoreCase(name)) {
			lot_wait_qty(value);
			return;
		}
		if ($lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lot_alloc_avl_qty(value);
			return;
		}
		if ($not_lot_alloc_qty.equalsIgnoreCase(name)) {
			not_lot_alloc_qty(value);
			return;
		}
		if ($not_lot_wait_qty.equalsIgnoreCase(name)) {
			not_lot_wait_qty(value);
			return;
		}
		if ($not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			not_lot_alloc_avl_qty(value);
			return;
		}
		if ($lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			lg_lot_alloc_qty(value);
			return;
		}
		if ($lg_lot_wait_qty.equalsIgnoreCase(name)) {
			lg_lot_wait_qty(value);
			return;
		}
		if ($lg_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lg_lot_alloc_avl_qty(value);
			return;
		}
		if ($lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_qty(value);
			return;
		}
		if ($lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			lg_not_lot_wait_qty(value);
			return;
		}
		if ($lg_not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_avl_qty(value);
			return;
		}
		if ($grs_alloc_qty.equalsIgnoreCase(name)) {
			grs_alloc_qty(value);
			return;
		}
		if ($grs_wait_qty.equalsIgnoreCase(name)) {
			grs_wait_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($grs_alloc_avl_qty.equalsIgnoreCase(name)) {
			grs_alloc_avl_qty(value);
			return;
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_alloc_qty(value);
			return;
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			base_unit_wait_qty(value);
			return;
		}
		if ($base_unit_avl_qty.equalsIgnoreCase(name)) {
			base_unit_avl_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($act_cont_alloc_qty.equalsIgnoreCase(name)) {
			act_cont_alloc_qty(value);
			return;
		}
		if ($act_cont_wait_qty.equalsIgnoreCase(name)) {
			act_cont_wait_qty(value);
			return;
		}
		if ($act_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			act_cont_alloc_avl_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_alloc_qty.equalsIgnoreCase(name)) {
			std_cont_alloc_qty(value);
			return;
		}
		if ($std_cont_wait_qty.equalsIgnoreCase(name)) {
			std_cont_wait_qty(value);
			return;
		}
		if ($std_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			std_cont_alloc_avl_qty(value);
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($lot_alloc_qty.equalsIgnoreCase(name)) {
			lot_alloc_qty(value);
			return;
		}
		if ($lot_wait_qty.equalsIgnoreCase(name)) {
			lot_wait_qty(value);
			return;
		}
		if ($lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lot_alloc_avl_qty(value);
			return;
		}
		if ($not_lot_alloc_qty.equalsIgnoreCase(name)) {
			not_lot_alloc_qty(value);
			return;
		}
		if ($not_lot_wait_qty.equalsIgnoreCase(name)) {
			not_lot_wait_qty(value);
			return;
		}
		if ($not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			not_lot_alloc_avl_qty(value);
			return;
		}
		if ($lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			lg_lot_alloc_qty(value);
			return;
		}
		if ($lg_lot_wait_qty.equalsIgnoreCase(name)) {
			lg_lot_wait_qty(value);
			return;
		}
		if ($lg_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lg_lot_alloc_avl_qty(value);
			return;
		}
		if ($lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_qty(value);
			return;
		}
		if ($lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			lg_not_lot_wait_qty(value);
			return;
		}
		if ($lg_not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_avl_qty(value);
			return;
		}
		if ($grs_alloc_qty.equalsIgnoreCase(name)) {
			grs_alloc_qty(value);
			return;
		}
		if ($grs_wait_qty.equalsIgnoreCase(name)) {
			grs_wait_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($grs_alloc_avl_qty.equalsIgnoreCase(name)) {
			grs_alloc_avl_qty(value);
			return;
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_alloc_qty(value);
			return;
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			base_unit_wait_qty(value);
			return;
		}
		if ($base_unit_avl_qty.equalsIgnoreCase(name)) {
			base_unit_avl_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($act_cont_alloc_qty.equalsIgnoreCase(name)) {
			act_cont_alloc_qty(value);
			return;
		}
		if ($act_cont_wait_qty.equalsIgnoreCase(name)) {
			act_cont_wait_qty(value);
			return;
		}
		if ($act_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			act_cont_alloc_avl_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_alloc_qty.equalsIgnoreCase(name)) {
			std_cont_alloc_qty(value);
			return;
		}
		if ($std_cont_wait_qty.equalsIgnoreCase(name)) {
			std_cont_wait_qty(value);
			return;
		}
		if ($std_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			std_cont_alloc_avl_qty(value);
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($lot_alloc_qty.equalsIgnoreCase(name)) {
			lot_alloc_qty(value);
			return;
		}
		if ($lot_wait_qty.equalsIgnoreCase(name)) {
			lot_wait_qty(value);
			return;
		}
		if ($lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lot_alloc_avl_qty(value);
			return;
		}
		if ($not_lot_alloc_qty.equalsIgnoreCase(name)) {
			not_lot_alloc_qty(value);
			return;
		}
		if ($not_lot_wait_qty.equalsIgnoreCase(name)) {
			not_lot_wait_qty(value);
			return;
		}
		if ($not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			not_lot_alloc_avl_qty(value);
			return;
		}
		if ($lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			lg_lot_alloc_qty(value);
			return;
		}
		if ($lg_lot_wait_qty.equalsIgnoreCase(name)) {
			lg_lot_wait_qty(value);
			return;
		}
		if ($lg_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lg_lot_alloc_avl_qty(value);
			return;
		}
		if ($lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_qty(value);
			return;
		}
		if ($lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			lg_not_lot_wait_qty(value);
			return;
		}
		if ($lg_not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_avl_qty(value);
			return;
		}
		if ($grs_alloc_qty.equalsIgnoreCase(name)) {
			grs_alloc_qty(value);
			return;
		}
		if ($grs_wait_qty.equalsIgnoreCase(name)) {
			grs_wait_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($grs_alloc_avl_qty.equalsIgnoreCase(name)) {
			grs_alloc_avl_qty(value);
			return;
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_alloc_qty(value);
			return;
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			base_unit_wait_qty(value);
			return;
		}
		if ($base_unit_avl_qty.equalsIgnoreCase(name)) {
			base_unit_avl_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($act_cont_alloc_qty.equalsIgnoreCase(name)) {
			act_cont_alloc_qty(value);
			return;
		}
		if ($act_cont_wait_qty.equalsIgnoreCase(name)) {
			act_cont_wait_qty(value);
			return;
		}
		if ($act_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			act_cont_alloc_avl_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_alloc_qty.equalsIgnoreCase(name)) {
			std_cont_alloc_qty(value);
			return;
		}
		if ($std_cont_wait_qty.equalsIgnoreCase(name)) {
			std_cont_wait_qty(value);
			return;
		}
		if ($std_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			std_cont_alloc_avl_qty(value);
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
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($alloc_unit_cd.equalsIgnoreCase(name)) {
			alloc_unit_cd(value);
			return;
		}
		if ($alloc_unit_nm.equalsIgnoreCase(name)) {
			alloc_unit_nm(value);
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($lot_alloc_qty.equalsIgnoreCase(name)) {
			lot_alloc_qty(value);
			return;
		}
		if ($lot_wait_qty.equalsIgnoreCase(name)) {
			lot_wait_qty(value);
			return;
		}
		if ($lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lot_alloc_avl_qty(value);
			return;
		}
		if ($not_lot_alloc_qty.equalsIgnoreCase(name)) {
			not_lot_alloc_qty(value);
			return;
		}
		if ($not_lot_wait_qty.equalsIgnoreCase(name)) {
			not_lot_wait_qty(value);
			return;
		}
		if ($not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			not_lot_alloc_avl_qty(value);
			return;
		}
		if ($lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			lg_lot_alloc_qty(value);
			return;
		}
		if ($lg_lot_wait_qty.equalsIgnoreCase(name)) {
			lg_lot_wait_qty(value);
			return;
		}
		if ($lg_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lg_lot_alloc_avl_qty(value);
			return;
		}
		if ($lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_qty(value);
			return;
		}
		if ($lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			lg_not_lot_wait_qty(value);
			return;
		}
		if ($lg_not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_avl_qty(value);
			return;
		}
		if ($grs_alloc_qty.equalsIgnoreCase(name)) {
			grs_alloc_qty(value);
			return;
		}
		if ($grs_wait_qty.equalsIgnoreCase(name)) {
			grs_wait_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($grs_alloc_avl_qty.equalsIgnoreCase(name)) {
			grs_alloc_avl_qty(value);
			return;
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_alloc_qty(value);
			return;
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			base_unit_wait_qty(value);
			return;
		}
		if ($base_unit_avl_qty.equalsIgnoreCase(name)) {
			base_unit_avl_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($act_cont_alloc_qty.equalsIgnoreCase(name)) {
			act_cont_alloc_qty(value);
			return;
		}
		if ($act_cont_wait_qty.equalsIgnoreCase(name)) {
			act_cont_wait_qty(value);
			return;
		}
		if ($act_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			act_cont_alloc_avl_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_alloc_qty.equalsIgnoreCase(name)) {
			std_cont_alloc_qty(value);
			return;
		}
		if ($std_cont_wait_qty.equalsIgnoreCase(name)) {
			std_cont_wait_qty(value);
			return;
		}
		if ($std_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			std_cont_alloc_avl_qty(value);
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($lot_alloc_qty.equalsIgnoreCase(name)) {
			lot_alloc_qty(value);
			return;
		}
		if ($lot_wait_qty.equalsIgnoreCase(name)) {
			lot_wait_qty(value);
			return;
		}
		if ($lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lot_alloc_avl_qty(value);
			return;
		}
		if ($not_lot_alloc_qty.equalsIgnoreCase(name)) {
			not_lot_alloc_qty(value);
			return;
		}
		if ($not_lot_wait_qty.equalsIgnoreCase(name)) {
			not_lot_wait_qty(value);
			return;
		}
		if ($not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			not_lot_alloc_avl_qty(value);
			return;
		}
		if ($lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			lg_lot_alloc_qty(value);
			return;
		}
		if ($lg_lot_wait_qty.equalsIgnoreCase(name)) {
			lg_lot_wait_qty(value);
			return;
		}
		if ($lg_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lg_lot_alloc_avl_qty(value);
			return;
		}
		if ($lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_qty(value);
			return;
		}
		if ($lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			lg_not_lot_wait_qty(value);
			return;
		}
		if ($lg_not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_avl_qty(value);
			return;
		}
		if ($grs_alloc_qty.equalsIgnoreCase(name)) {
			grs_alloc_qty(value);
			return;
		}
		if ($grs_wait_qty.equalsIgnoreCase(name)) {
			grs_wait_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($grs_alloc_avl_qty.equalsIgnoreCase(name)) {
			grs_alloc_avl_qty(value);
			return;
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_alloc_qty(value);
			return;
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			base_unit_wait_qty(value);
			return;
		}
		if ($base_unit_avl_qty.equalsIgnoreCase(name)) {
			base_unit_avl_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($act_cont_alloc_qty.equalsIgnoreCase(name)) {
			act_cont_alloc_qty(value);
			return;
		}
		if ($act_cont_wait_qty.equalsIgnoreCase(name)) {
			act_cont_wait_qty(value);
			return;
		}
		if ($act_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			act_cont_alloc_avl_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_alloc_qty.equalsIgnoreCase(name)) {
			std_cont_alloc_qty(value);
			return;
		}
		if ($std_cont_wait_qty.equalsIgnoreCase(name)) {
			std_cont_wait_qty(value);
			return;
		}
		if ($std_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			std_cont_alloc_avl_qty(value);
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($lot_alloc_qty.equalsIgnoreCase(name)) {
			lot_alloc_qty(value);
			return;
		}
		if ($lot_wait_qty.equalsIgnoreCase(name)) {
			lot_wait_qty(value);
			return;
		}
		if ($lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lot_alloc_avl_qty(value);
			return;
		}
		if ($not_lot_alloc_qty.equalsIgnoreCase(name)) {
			not_lot_alloc_qty(value);
			return;
		}
		if ($not_lot_wait_qty.equalsIgnoreCase(name)) {
			not_lot_wait_qty(value);
			return;
		}
		if ($not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			not_lot_alloc_avl_qty(value);
			return;
		}
		if ($lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			lg_lot_alloc_qty(value);
			return;
		}
		if ($lg_lot_wait_qty.equalsIgnoreCase(name)) {
			lg_lot_wait_qty(value);
			return;
		}
		if ($lg_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lg_lot_alloc_avl_qty(value);
			return;
		}
		if ($lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_qty(value);
			return;
		}
		if ($lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			lg_not_lot_wait_qty(value);
			return;
		}
		if ($lg_not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_avl_qty(value);
			return;
		}
		if ($grs_alloc_qty.equalsIgnoreCase(name)) {
			grs_alloc_qty(value);
			return;
		}
		if ($grs_wait_qty.equalsIgnoreCase(name)) {
			grs_wait_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($grs_alloc_avl_qty.equalsIgnoreCase(name)) {
			grs_alloc_avl_qty(value);
			return;
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_alloc_qty(value);
			return;
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			base_unit_wait_qty(value);
			return;
		}
		if ($base_unit_avl_qty.equalsIgnoreCase(name)) {
			base_unit_avl_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($act_cont_alloc_qty.equalsIgnoreCase(name)) {
			act_cont_alloc_qty(value);
			return;
		}
		if ($act_cont_wait_qty.equalsIgnoreCase(name)) {
			act_cont_wait_qty(value);
			return;
		}
		if ($act_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			act_cont_alloc_avl_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_alloc_qty.equalsIgnoreCase(name)) {
			std_cont_alloc_qty(value);
			return;
		}
		if ($std_cont_wait_qty.equalsIgnoreCase(name)) {
			std_cont_wait_qty(value);
			return;
		}
		if ($std_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			std_cont_alloc_avl_qty(value);
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($lot_alloc_qty.equalsIgnoreCase(name)) {
			lot_alloc_qty(value);
			return;
		}
		if ($lot_wait_qty.equalsIgnoreCase(name)) {
			lot_wait_qty(value);
			return;
		}
		if ($lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lot_alloc_avl_qty(value);
			return;
		}
		if ($not_lot_alloc_qty.equalsIgnoreCase(name)) {
			not_lot_alloc_qty(value);
			return;
		}
		if ($not_lot_wait_qty.equalsIgnoreCase(name)) {
			not_lot_wait_qty(value);
			return;
		}
		if ($not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			not_lot_alloc_avl_qty(value);
			return;
		}
		if ($lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			lg_lot_alloc_qty(value);
			return;
		}
		if ($lg_lot_wait_qty.equalsIgnoreCase(name)) {
			lg_lot_wait_qty(value);
			return;
		}
		if ($lg_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lg_lot_alloc_avl_qty(value);
			return;
		}
		if ($lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_qty(value);
			return;
		}
		if ($lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			lg_not_lot_wait_qty(value);
			return;
		}
		if ($lg_not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_avl_qty(value);
			return;
		}
		if ($grs_alloc_qty.equalsIgnoreCase(name)) {
			grs_alloc_qty(value);
			return;
		}
		if ($grs_wait_qty.equalsIgnoreCase(name)) {
			grs_wait_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($grs_alloc_avl_qty.equalsIgnoreCase(name)) {
			grs_alloc_avl_qty(value);
			return;
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_alloc_qty(value);
			return;
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			base_unit_wait_qty(value);
			return;
		}
		if ($base_unit_avl_qty.equalsIgnoreCase(name)) {
			base_unit_avl_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($act_cont_alloc_qty.equalsIgnoreCase(name)) {
			act_cont_alloc_qty(value);
			return;
		}
		if ($act_cont_wait_qty.equalsIgnoreCase(name)) {
			act_cont_wait_qty(value);
			return;
		}
		if ($act_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			act_cont_alloc_avl_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_alloc_qty.equalsIgnoreCase(name)) {
			std_cont_alloc_qty(value);
			return;
		}
		if ($std_cont_wait_qty.equalsIgnoreCase(name)) {
			std_cont_wait_qty(value);
			return;
		}
		if ($std_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			std_cont_alloc_avl_qty(value);
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
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($lot_alloc_qty.equalsIgnoreCase(name)) {
			lot_alloc_qty(value);
			return;
		}
		if ($lot_wait_qty.equalsIgnoreCase(name)) {
			lot_wait_qty(value);
			return;
		}
		if ($lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lot_alloc_avl_qty(value);
			return;
		}
		if ($not_lot_alloc_qty.equalsIgnoreCase(name)) {
			not_lot_alloc_qty(value);
			return;
		}
		if ($not_lot_wait_qty.equalsIgnoreCase(name)) {
			not_lot_wait_qty(value);
			return;
		}
		if ($not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			not_lot_alloc_avl_qty(value);
			return;
		}
		if ($lg_lot_alloc_qty.equalsIgnoreCase(name)) {
			lg_lot_alloc_qty(value);
			return;
		}
		if ($lg_lot_wait_qty.equalsIgnoreCase(name)) {
			lg_lot_wait_qty(value);
			return;
		}
		if ($lg_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lg_lot_alloc_avl_qty(value);
			return;
		}
		if ($lg_not_lot_alloc_qty.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_qty(value);
			return;
		}
		if ($lg_not_lot_wait_qty.equalsIgnoreCase(name)) {
			lg_not_lot_wait_qty(value);
			return;
		}
		if ($lg_not_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			lg_not_lot_alloc_avl_qty(value);
			return;
		}
		if ($grs_alloc_qty.equalsIgnoreCase(name)) {
			grs_alloc_qty(value);
			return;
		}
		if ($grs_wait_qty.equalsIgnoreCase(name)) {
			grs_wait_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($grs_alloc_avl_qty.equalsIgnoreCase(name)) {
			grs_alloc_avl_qty(value);
			return;
		}
		if ($alloc_unit_dec_place.equalsIgnoreCase(name)) {
			alloc_unit_dec_place(value);
			return;
		}
		if ($base_unit_alloc_qty.equalsIgnoreCase(name)) {
			base_unit_alloc_qty(value);
			return;
		}
		if ($base_unit_wait_qty.equalsIgnoreCase(name)) {
			base_unit_wait_qty(value);
			return;
		}
		if ($base_unit_avl_qty.equalsIgnoreCase(name)) {
			base_unit_avl_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($act_cont_alloc_qty.equalsIgnoreCase(name)) {
			act_cont_alloc_qty(value);
			return;
		}
		if ($act_cont_wait_qty.equalsIgnoreCase(name)) {
			act_cont_wait_qty(value);
			return;
		}
		if ($act_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			act_cont_alloc_avl_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_alloc_qty.equalsIgnoreCase(name)) {
			std_cont_alloc_qty(value);
			return;
		}
		if ($std_cont_wait_qty.equalsIgnoreCase(name)) {
			std_cont_wait_qty(value);
			return;
		}
		if ($std_cont_alloc_avl_qty.equalsIgnoreCase(name)) {
			std_cont_alloc_avl_qty(value);
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
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
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
		super.setBooleanNE(name, value);
	}



}

