package mcframe.clientMSBC.MSBCP1060;

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
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
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
	public static final String $itm_p = "itm_p";
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
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
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
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public static final String $fix_no_typ = "fix_no_typ";
	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public static final String $fix_no_typ_nm = "fix_no_typ_nm";
	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public static final String $fix_no = "fix_no";
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
	public static final String $pack_stk_qty_p = "pack_stk_qty_p";
	public static final String $pack_gr_schd_qty_p = "pack_gr_schd_qty_p";
	public static final String $pack_alloc_qty_p = "pack_alloc_qty_p";
	public static final String $pack_wait_qty_p = "pack_wait_qty_p";
	public static final String $pack_lot_alloc_avl_qty_p = "pack_lot_alloc_avl_qty_p";
	public static final String $pack_alloc_avl_qty_p = "pack_alloc_avl_qty_p";
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
	public static final String $act_cont_qty_p = "act_cont_qty_p";
	public static final String $cont_fctr_unit_p = "cont_fctr_unit_p";
	public static final String $act_cont_fctr_p = "act_cont_fctr_p";
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public static final String $pack_unit_dec_place = "pack_unit_dec_place";
	/**
	 * SKU rounding type 荷姿単位端数処理区分.<p>
	 *
	 */
	public static final String $pack_unit_rnd_typ = "pack_unit_rnd_typ";
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
	public static final String $base_stk_qty_p = "base_stk_qty_p";
	public static final String $base_gr_schd_qty_p = "base_gr_schd_qty_p";
	public static final String $base_alloc_qty_p = "base_alloc_qty_p";
	public static final String $base_wait_qty_p = "base_wait_qty_p";
	public static final String $base_lot_alloc_avl_qty_p = "base_lot_alloc_avl_qty_p";
	public static final String $base_alloc_avl_qty_p = "base_alloc_avl_qty_p";
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
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	public static final String $stk_act_cont_qty_p = "stk_act_cont_qty_p";
	public static final String $schd_act_cont_qty_p = "schd_act_cont_qty_p";
	public static final String $alloc_act_cont_qty_p = "alloc_act_cont_qty_p";
	public static final String $wait_act_cont_qty_p = "wait_act_cont_qty_p";
	public static final String $lot_avl_act_cont_qty_p = "lot_avl_act_cont_qty_p";
	public static final String $avl_act_cont_qty_p = "avl_act_cont_qty_p";
	public static final String $stk_std_cont_qty_p = "stk_std_cont_qty_p";
	public static final String $schd_std_cont_qty_p = "schd_std_cont_qty_p";
	public static final String $alloc_std_cont_qty_p = "alloc_std_cont_qty_p";
	public static final String $wait_std_cont_qty_p = "wait_std_cont_qty_p";
	public static final String $lot_avl_std_cont_qty_p = "lot_avl_std_cont_qty_p";
	public static final String $avl_std_cont_qty_p = "avl_std_cont_qty_p";
	public static final String $std_cont_qty_p = "std_cont_qty_p";
	public static final String $std_cont_fctr_p = "std_cont_fctr_p";
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * Rounding type (Active ingredient) 有効成分端数処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public static final String $first_gr_dt = "first_gr_dt";
	/**
	 * Without expiration 期限未設定.<p>
	 *
	 */
	public static final String $unreg_lmt_flg = "unreg_lmt_flg";
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
	 * Scheduled date 予定日.<p>
	 *
	 */
	public static final String $schd_dt = "schd_dt";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
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
	public static final String $pack_stk_qty = $pack_stk_qty_p + ".qty";
	public static final String $pack_gr_schd_qty = $pack_gr_schd_qty_p + ".qty";
	public static final String $pack_alloc_qty = $pack_alloc_qty_p + ".qty";
	public static final String $pack_wait_qty = $pack_wait_qty_p + ".qty";
	public static final String $pack_lot_alloc_avl_qty = $pack_lot_alloc_avl_qty_p + ".qty";
	public static final String $pack_alloc_avl_qty = $pack_alloc_avl_qty_p + ".qty";
	public static final String $pack_unit_qty = $pack_unit_qty_p + ".qty";
	public static final String $act_cont_qty = $act_cont_qty_p + ".cont_qty";
	public static final String $cont_fctr_unit_cd = $cont_fctr_unit_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_fctr_unit_p + ".cont_fctr_unit_nm";
	public static final String $act_cont_fctr = $act_cont_fctr_p + ".act_cont_fctr";
	public static final String $base_stk_qty = $base_stk_qty_p + ".qty";
	public static final String $base_gr_schd_qty = $base_gr_schd_qty_p + ".qty";
	public static final String $base_alloc_qty = $base_alloc_qty_p + ".qty";
	public static final String $base_wait_qty = $base_wait_qty_p + ".qty";
	public static final String $base_lot_alloc_avl_qty = $base_lot_alloc_avl_qty_p + ".qty";
	public static final String $base_alloc_avl_qty = $base_alloc_avl_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $stk_act_cont_qty = $stk_act_cont_qty_p + ".cont_qty";
	public static final String $schd_act_cont_qty = $schd_act_cont_qty_p + ".cont_qty";
	public static final String $alloc_act_cont_qty = $alloc_act_cont_qty_p + ".cont_qty";
	public static final String $wait_act_cont_qty = $wait_act_cont_qty_p + ".cont_qty";
	public static final String $lot_avl_act_cont_qty = $lot_avl_act_cont_qty_p + ".cont_qty";
	public static final String $avl_act_cont_qty = $avl_act_cont_qty_p + ".cont_qty";
	public static final String $stk_std_cont_qty = $stk_std_cont_qty_p + ".cont_qty";
	public static final String $schd_std_cont_qty = $schd_std_cont_qty_p + ".cont_qty";
	public static final String $alloc_std_cont_qty = $alloc_std_cont_qty_p + ".cont_qty";
	public static final String $wait_std_cont_qty = $wait_std_cont_qty_p + ".cont_qty";
	public static final String $lot_avl_std_cont_qty = $lot_avl_std_cont_qty_p + ".cont_qty";
	public static final String $avl_std_cont_qty = $avl_std_cont_qty_p + ".cont_qty";
	public static final String $std_cont_qty = $std_cont_qty_p + ".cont_qty";
	public static final String $std_cont_fctr = $std_cont_fctr_p + ".std_cont_fctr";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
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
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta fix_no_typ_META = createCommonMeta($fix_no_typ, mcframe.commonMS.meta.MS_META.FIX_NO_TYP);
	public static final MCMeta fix_no_typ_nm_META = createCommonMeta($fix_no_typ_nm, mcframe.commonMS.meta.MS_META.FIX_NO_TYP_NM);
	public static final MCMeta fix_no_META = createCommonMeta($fix_no, mcframe.commonMA.meta.MA_META.FIX_NO);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta pack_stk_qty_p_META = createInnerRowMeta($pack_stk_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta pack_gr_schd_qty_p_META = createInnerRowMeta($pack_gr_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta pack_alloc_qty_p_META = createInnerRowMeta($pack_alloc_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta pack_wait_qty_p_META = createInnerRowMeta($pack_wait_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta pack_lot_alloc_avl_qty_p_META = createInnerRowMeta($pack_lot_alloc_avl_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta pack_alloc_avl_qty_p_META = createInnerRowMeta($pack_alloc_avl_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta pack_unit_qty_p_META = createInnerRowMeta($pack_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta act_cont_qty_p_META = createInnerRowMeta($act_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta cont_fctr_unit_p_META = createInnerRowMeta($cont_fctr_unit_p, mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class);
	public static final MCMeta act_cont_fctr_p_META = createInnerRowMeta($act_cont_fctr_p, mcframe.clientMAUB.MAUBP5290.ActContFctrR.class);
	public static final MCMeta pack_unit_dec_place_META = createCommonMeta($pack_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pack_unit_rnd_typ_META = createCommonMeta($pack_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta conv_base_qty_META = createCommonMeta($conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta conv_qty_META = createCommonMeta($conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_stk_qty_p_META = createInnerRowMeta($base_stk_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_gr_schd_qty_p_META = createInnerRowMeta($base_gr_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_alloc_qty_p_META = createInnerRowMeta($base_alloc_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_wait_qty_p_META = createInnerRowMeta($base_wait_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_lot_alloc_avl_qty_p_META = createInnerRowMeta($base_lot_alloc_avl_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_alloc_avl_qty_p_META = createInnerRowMeta($base_alloc_avl_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_act_cont_qty_p_META = createInnerRowMeta($stk_act_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta schd_act_cont_qty_p_META = createInnerRowMeta($schd_act_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta alloc_act_cont_qty_p_META = createInnerRowMeta($alloc_act_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta wait_act_cont_qty_p_META = createInnerRowMeta($wait_act_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta lot_avl_act_cont_qty_p_META = createInnerRowMeta($lot_avl_act_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta avl_act_cont_qty_p_META = createInnerRowMeta($avl_act_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta stk_std_cont_qty_p_META = createInnerRowMeta($stk_std_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta schd_std_cont_qty_p_META = createInnerRowMeta($schd_std_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta alloc_std_cont_qty_p_META = createInnerRowMeta($alloc_std_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta wait_std_cont_qty_p_META = createInnerRowMeta($wait_std_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta lot_avl_std_cont_qty_p_META = createInnerRowMeta($lot_avl_std_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta avl_std_cont_qty_p_META = createInnerRowMeta($avl_std_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta std_cont_qty_p_META = createInnerRowMeta($std_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta std_cont_fctr_p_META = createInnerRowMeta($std_cont_fctr_p, mcframe.clientMAUB.MAUBP5280.StdContFctrR.class);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta first_gr_dt_META = createCommonMeta($first_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta unreg_lmt_flg_META = createCommonMeta($unreg_lmt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta plnt_aprv_sts_typ_META = createCommonMeta($plnt_aprv_sts_typ, mcframe.commonMS.meta.MS_META.PLNT_APRV_STS_TYP);
	public static final MCMeta plnt_aprv_sts_typ_nm_META = createCommonMeta($plnt_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.PLNT_APRV_STS_TYP_NM);
	public static final MCMeta mrkt_judg_sts_typ_META = createCommonMeta($mrkt_judg_sts_typ, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP);
	public static final MCMeta mrkt_judg_sts_typ_nm_META = createCommonMeta($mrkt_judg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP_NM);
	public static final MCMeta schd_dt_META = createCommonMeta($schd_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			wg_cd_META,
			wg_nm_META,
			itm_p_META,
			ver_no_p_META,
			lot_no_META,
			sublot_no_META,
			bp_lot_no_META,
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
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			fix_no_typ_META,
			fix_no_typ_nm_META,
			fix_no_META,
			stk_arrv_bp_cd_META,
			stk_arrv_bp_nm_META,
			pack_stk_qty_p_META,
			pack_gr_schd_qty_p_META,
			pack_alloc_qty_p_META,
			pack_wait_qty_p_META,
			pack_lot_alloc_avl_qty_p_META,
			pack_alloc_avl_qty_p_META,
			pack_unit_qty_p_META,
			pack_unit_cd_META,
			pack_unit_nm_META,
			act_cont_qty_p_META,
			cont_fctr_unit_p_META,
			act_cont_fctr_p_META,
			pack_unit_dec_place_META,
			pack_unit_rnd_typ_META,
			conv_base_qty_META,
			conv_qty_META,
			base_stk_qty_p_META,
			base_gr_schd_qty_p_META,
			base_alloc_qty_p_META,
			base_wait_qty_p_META,
			base_lot_alloc_avl_qty_p_META,
			base_alloc_avl_qty_p_META,
			base_unit_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			cont_fctr_flg_META,
			stk_act_cont_qty_p_META,
			schd_act_cont_qty_p_META,
			alloc_act_cont_qty_p_META,
			wait_act_cont_qty_p_META,
			lot_avl_act_cont_qty_p_META,
			avl_act_cont_qty_p_META,
			stk_std_cont_qty_p_META,
			schd_std_cont_qty_p_META,
			alloc_std_cont_qty_p_META,
			wait_std_cont_qty_p_META,
			lot_avl_std_cont_qty_p_META,
			avl_std_cont_qty_p_META,
			std_cont_qty_p_META,
			std_cont_fctr_p_META,
			cont_fctr_dec_place_META,
			cont_fctr_rnd_typ_META,
			first_gr_dt_META,
			unreg_lmt_flg_META,
			vld_dt_META,
			lmt_dt_META,
			plnt_aprv_sts_typ_META,
			plnt_aprv_sts_typ_nm_META,
			mrkt_judg_sts_typ_META,
			mrkt_judg_sts_typ_nm_META,
			schd_dt_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
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
				"pack_stk_qty",
				"pack_gr_schd_qty",
				"pack_alloc_qty",
				"pack_wait_qty",
				"pack_lot_alloc_avl_qty",
				"pack_alloc_avl_qty",
				"pack_unit_qty",
				"act_cont_qty",
				"cont_fctr_unit_cd",
				"cont_fctr_unit_nm",
				"act_cont_fctr",
				"base_stk_qty",
				"base_gr_schd_qty",
				"base_alloc_qty",
				"base_wait_qty",
				"base_lot_alloc_avl_qty",
				"base_alloc_avl_qty",
				"base_unit_qty",
				"stk_act_cont_qty",
				"schd_act_cont_qty",
				"alloc_act_cont_qty",
				"wait_act_cont_qty",
				"lot_avl_act_cont_qty",
				"avl_act_cont_qty",
				"stk_std_cont_qty",
				"schd_std_cont_qty",
				"alloc_std_cont_qty",
				"wait_std_cont_qty",
				"lot_avl_std_cont_qty",
				"avl_std_cont_qty",
				"std_cont_qty",
				"std_cont_fctr"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
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
				$pack_stk_qty,
				$pack_gr_schd_qty,
				$pack_alloc_qty,
				$pack_wait_qty,
				$pack_lot_alloc_avl_qty,
				$pack_alloc_avl_qty,
				$pack_unit_qty,
				$act_cont_qty,
				$cont_fctr_unit_cd,
				$cont_fctr_unit_nm,
				$act_cont_fctr,
				$base_stk_qty,
				$base_gr_schd_qty,
				$base_alloc_qty,
				$base_wait_qty,
				$base_lot_alloc_avl_qty,
				$base_alloc_avl_qty,
				$base_unit_qty,
				$stk_act_cont_qty,
				$schd_act_cont_qty,
				$alloc_act_cont_qty,
				$wait_act_cont_qty,
				$lot_avl_act_cont_qty,
				$avl_act_cont_qty,
				$stk_std_cont_qty,
				$schd_std_cont_qty,
				$alloc_std_cont_qty,
				$wait_std_cont_qty,
				$lot_avl_std_cont_qty,
				$avl_std_cont_qty,
				$std_cont_qty,
				$std_cont_fctr
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
				{$act_cont_qty_p, "CONT_FCTR"},	// act_cont_qty_p
				{$act_cont_qty_p + ".cont_qty", "CONT_FCTR"},	// act_cont_qty_p.cont_qty
				{$cont_fctr_unit_p, "CONT_FCTR"},	// cont_fctr_unit_p
				{$cont_fctr_unit_p + ".cont_fctr_unit_cd", "CONT_FCTR"},	// cont_fctr_unit_p.cont_fctr_unit_cd
				{$cont_fctr_unit_p + ".cont_fctr_unit_nm", "CONT_FCTR"},	// cont_fctr_unit_p.cont_fctr_unit_nm
				{$act_cont_fctr_p, "CONT_FCTR"},	// act_cont_fctr_p
				{$act_cont_fctr_p + ".act_cont_fctr", "CONT_FCTR"},	// act_cont_fctr_p.act_cont_fctr
				{$cont_fctr_flg, "CONT_FCTR"},	// cont_fctr_flg
				{$stk_act_cont_qty_p, "CONT_FCTR"},	// stk_act_cont_qty_p
				{$stk_act_cont_qty_p + ".cont_qty", "CONT_FCTR"},	// stk_act_cont_qty_p.cont_qty
				{$schd_act_cont_qty_p, "CONT_FCTR"},	// schd_act_cont_qty_p
				{$schd_act_cont_qty_p + ".cont_qty", "CONT_FCTR"},	// schd_act_cont_qty_p.cont_qty
				{$alloc_act_cont_qty_p, "CONT_FCTR"},	// alloc_act_cont_qty_p
				{$alloc_act_cont_qty_p + ".cont_qty", "CONT_FCTR"},	// alloc_act_cont_qty_p.cont_qty
				{$wait_act_cont_qty_p, "CONT_FCTR"},	// wait_act_cont_qty_p
				{$wait_act_cont_qty_p + ".cont_qty", "CONT_FCTR"},	// wait_act_cont_qty_p.cont_qty
				{$lot_avl_act_cont_qty_p, "CONT_FCTR"},	// lot_avl_act_cont_qty_p
				{$lot_avl_act_cont_qty_p + ".cont_qty", "CONT_FCTR"},	// lot_avl_act_cont_qty_p.cont_qty
				{$avl_act_cont_qty_p, "CONT_FCTR"},	// avl_act_cont_qty_p
				{$avl_act_cont_qty_p + ".cont_qty", "CONT_FCTR"},	// avl_act_cont_qty_p.cont_qty
				{$stk_std_cont_qty_p, "CONT_FCTR"},	// stk_std_cont_qty_p
				{$stk_std_cont_qty_p + ".cont_qty", "CONT_FCTR"},	// stk_std_cont_qty_p.cont_qty
				{$schd_std_cont_qty_p, "CONT_FCTR"},	// schd_std_cont_qty_p
				{$schd_std_cont_qty_p + ".cont_qty", "CONT_FCTR"},	// schd_std_cont_qty_p.cont_qty
				{$alloc_std_cont_qty_p, "CONT_FCTR"},	// alloc_std_cont_qty_p
				{$alloc_std_cont_qty_p + ".cont_qty", "CONT_FCTR"},	// alloc_std_cont_qty_p.cont_qty
				{$wait_std_cont_qty_p, "CONT_FCTR"},	// wait_std_cont_qty_p
				{$wait_std_cont_qty_p + ".cont_qty", "CONT_FCTR"},	// wait_std_cont_qty_p.cont_qty
				{$lot_avl_std_cont_qty_p, "CONT_FCTR"},	// lot_avl_std_cont_qty_p
				{$lot_avl_std_cont_qty_p + ".cont_qty", "CONT_FCTR"},	// lot_avl_std_cont_qty_p.cont_qty
				{$avl_std_cont_qty_p, "CONT_FCTR"},	// avl_std_cont_qty_p
				{$avl_std_cont_qty_p + ".cont_qty", "CONT_FCTR"},	// avl_std_cont_qty_p.cont_qty
				{$std_cont_qty_p, "CONT_FCTR"},	// std_cont_qty_p
				{$std_cont_qty_p + ".cont_qty", "CONT_FCTR"},	// std_cont_qty_p.cont_qty
				{$std_cont_fctr_p, "CONT_FCTR"},	// std_cont_fctr_p
				{$std_cont_fctr_p + ".std_cont_fctr", "CONT_FCTR"},	// std_cont_fctr_p.std_cont_fctr
				{$cont_fctr_dec_place, "CONT_FCTR"},	// cont_fctr_dec_place
				{$cont_fctr_rnd_typ, "CONT_FCTR"}	// cont_fctr_rnd_typ
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
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
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


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 3, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 3, $itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 4, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 4, $ver_no_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 5, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 5, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 6, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 6, $sublot_no, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 7, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 7, $bp_lot_no, value);
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
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 28, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 28, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 29, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 29, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 30, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 30, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 31, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 31, $stk_bp_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 32, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 32, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 33, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 33, $asst_typ_nm, value);
	}


	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public String fix_no_typ() {
		return getConstString(offset + 34, $fix_no_typ);
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public void fix_no_typ(String value) {
		setConstString(offset + 34, $fix_no_typ, value);
	}


	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public String fix_no_typ_nm() {
		return getConstString(offset + 35, $fix_no_typ_nm);
	}

	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public void fix_no_typ_nm(String value) {
		setConstString(offset + 35, $fix_no_typ_nm, value);
	}


	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public String fix_no() {
		return getConstString(offset + 36, $fix_no);
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public void fix_no(String value) {
		setConstString(offset + 36, $fix_no, value);
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


	public mcframe.clientMAUB.MAUBP5040.QtyR pack_stk_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 39, $pack_stk_qty_p);
	}
	
	public void pack_stk_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 39, $pack_stk_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR pack_gr_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 40, $pack_gr_schd_qty_p);
	}
	
	public void pack_gr_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 40, $pack_gr_schd_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR pack_alloc_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 41, $pack_alloc_qty_p);
	}
	
	public void pack_alloc_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 41, $pack_alloc_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR pack_wait_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 42, $pack_wait_qty_p);
	}
	
	public void pack_wait_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 42, $pack_wait_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR pack_lot_alloc_avl_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 43, $pack_lot_alloc_avl_qty_p);
	}
	
	public void pack_lot_alloc_avl_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 43, $pack_lot_alloc_avl_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR pack_alloc_avl_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 44, $pack_alloc_avl_qty_p);
	}
	
	public void pack_alloc_avl_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 44, $pack_alloc_avl_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR pack_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 45, $pack_unit_qty_p);
	}
	
	public void pack_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 45, $pack_unit_qty_p, row);
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


	public mcframe.clientMAUB.MAUBP5260.ContQtyR act_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 48, $act_cont_qty_p);
	}
	
	public void act_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 48, $act_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5270.ContFctrUnitR cont_fctr_unit_p(){
		return (mcframe.clientMAUB.MAUBP5270.ContFctrUnitR) getConstInnerRow(offset + 49, $cont_fctr_unit_p);
	}
	
	public void cont_fctr_unit_p(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR row){
		setConstInnerRow(offset + 49, $cont_fctr_unit_p, row);
	}


	public mcframe.clientMAUB.MAUBP5290.ActContFctrR act_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5290.ActContFctrR) getConstInnerRow(offset + 50, $act_cont_fctr_p);
	}
	
	public void act_cont_fctr_p(mcframe.clientMAUB.MAUBP5290.ActContFctrR row){
		setConstInnerRow(offset + 50, $act_cont_fctr_p, row);
	}


	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_unit_dec_place() {
		return getConstNumber(offset + 51, $pack_unit_dec_place);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 51, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(int value) {
		setConstNumber(offset + 51, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(long value) {
		setConstNumber(offset + 51, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(float value) {
		setConstNumber(offset + 51, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(double value) {
		setConstNumber(offset + 51, $pack_unit_dec_place, value);
	}


	/**
	 * SKU rounding type 荷姿単位端数処理区分.<p>
	 *
	 */
	public String pack_unit_rnd_typ() {
		return getConstString(offset + 52, $pack_unit_rnd_typ);
	}

	/**
	 * SKU rounding type 荷姿単位端数処理区分.<p>
	 *
	 */
	public void pack_unit_rnd_typ(String value) {
		setConstString(offset + 52, $pack_unit_rnd_typ, value);
	}


	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public MCNumber conv_base_qty() {
		return getConstNumber(offset + 53, $conv_base_qty);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(MCNumber value) {
		setConstNumber(offset + 53, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(int value) {
		setConstNumber(offset + 53, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(long value) {
		setConstNumber(offset + 53, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(float value) {
		setConstNumber(offset + 53, $conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(double value) {
		setConstNumber(offset + 53, $conv_base_qty, value);
	}


	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public MCNumber conv_qty() {
		return getConstNumber(offset + 54, $conv_qty);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(MCNumber value) {
		setConstNumber(offset + 54, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(int value) {
		setConstNumber(offset + 54, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(long value) {
		setConstNumber(offset + 54, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(float value) {
		setConstNumber(offset + 54, $conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(double value) {
		setConstNumber(offset + 54, $conv_qty, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_stk_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 55, $base_stk_qty_p);
	}
	
	public void base_stk_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 55, $base_stk_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_gr_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 56, $base_gr_schd_qty_p);
	}
	
	public void base_gr_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 56, $base_gr_schd_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_alloc_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 57, $base_alloc_qty_p);
	}
	
	public void base_alloc_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 57, $base_alloc_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_wait_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 58, $base_wait_qty_p);
	}
	
	public void base_wait_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 58, $base_wait_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_lot_alloc_avl_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 59, $base_lot_alloc_avl_qty_p);
	}
	
	public void base_lot_alloc_avl_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 59, $base_lot_alloc_avl_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_alloc_avl_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 60, $base_alloc_avl_qty_p);
	}
	
	public void base_alloc_avl_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 60, $base_alloc_avl_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 61, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 61, $base_unit_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 62, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 62, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 63, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 63, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 64, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 64, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 64, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 64, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 64, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 64, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 65, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 65, $base_unit_rnd_typ, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 66, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 66, $cont_fctr_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR stk_act_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 67, $stk_act_cont_qty_p);
	}
	
	public void stk_act_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 67, $stk_act_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR schd_act_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 68, $schd_act_cont_qty_p);
	}
	
	public void schd_act_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 68, $schd_act_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR alloc_act_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 69, $alloc_act_cont_qty_p);
	}
	
	public void alloc_act_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 69, $alloc_act_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR wait_act_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 70, $wait_act_cont_qty_p);
	}
	
	public void wait_act_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 70, $wait_act_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR lot_avl_act_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 71, $lot_avl_act_cont_qty_p);
	}
	
	public void lot_avl_act_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 71, $lot_avl_act_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR avl_act_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 72, $avl_act_cont_qty_p);
	}
	
	public void avl_act_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 72, $avl_act_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR stk_std_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 73, $stk_std_cont_qty_p);
	}
	
	public void stk_std_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 73, $stk_std_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR schd_std_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 74, $schd_std_cont_qty_p);
	}
	
	public void schd_std_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 74, $schd_std_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR alloc_std_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 75, $alloc_std_cont_qty_p);
	}
	
	public void alloc_std_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 75, $alloc_std_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR wait_std_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 76, $wait_std_cont_qty_p);
	}
	
	public void wait_std_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 76, $wait_std_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR lot_avl_std_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 77, $lot_avl_std_cont_qty_p);
	}
	
	public void lot_avl_std_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 77, $lot_avl_std_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR avl_std_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 78, $avl_std_cont_qty_p);
	}
	
	public void avl_std_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 78, $avl_std_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR std_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 79, $std_cont_qty_p);
	}
	
	public void std_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 79, $std_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5280.StdContFctrR std_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5280.StdContFctrR) getConstInnerRow(offset + 80, $std_cont_fctr_p);
	}
	
	public void std_cont_fctr_p(mcframe.clientMAUB.MAUBP5280.StdContFctrR row){
		setConstInnerRow(offset + 80, $std_cont_fctr_p, row);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 81, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 81, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 81, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 81, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 81, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 81, $cont_fctr_dec_place, value);
	}


	/**
	 * Rounding type (Active ingredient) 有効成分端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 82, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient) 有効成分端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 82, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 83, $first_gr_dt);
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 83, $first_gr_dt, value);
	}


	/**
	 * Without expiration 期限未設定.<p>
	 *
	 */
	public boolean unreg_lmt_flg() {
		return getConstBoolean(offset + 84, $unreg_lmt_flg);
	}

	/**
	 * Without expiration 期限未設定.<p>
	 *
	 */
	public void unreg_lmt_flg(boolean value) {
		setConstBoolean(offset + 84, $unreg_lmt_flg, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 85, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 85, $vld_dt, value);
	}


	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 86, $lmt_dt);
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 86, $lmt_dt, value);
	}


	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public String plnt_aprv_sts_typ() {
		return getConstString(offset + 87, $plnt_aprv_sts_typ);
	}

	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public void plnt_aprv_sts_typ(String value) {
		setConstString(offset + 87, $plnt_aprv_sts_typ, value);
	}


	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public String plnt_aprv_sts_typ_nm() {
		return getConstString(offset + 88, $plnt_aprv_sts_typ_nm);
	}

	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public void plnt_aprv_sts_typ_nm(String value) {
		setConstString(offset + 88, $plnt_aprv_sts_typ_nm, value);
	}


	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public String mrkt_judg_sts_typ() {
		return getConstString(offset + 89, $mrkt_judg_sts_typ);
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public void mrkt_judg_sts_typ(String value) {
		setConstString(offset + 89, $mrkt_judg_sts_typ, value);
	}


	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public String mrkt_judg_sts_typ_nm() {
		return getConstString(offset + 90, $mrkt_judg_sts_typ_nm);
	}

	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_nm(String value) {
		setConstString(offset + 90, $mrkt_judg_sts_typ_nm, value);
	}


	/**
	 * Scheduled date 予定日.<p>
	 *
	 */
	public MCDate schd_dt() {
		return getConstDate(offset + 91, $schd_dt);
	}

	/**
	 * Scheduled date 予定日.<p>
	 *
	 */
	public void schd_dt(MCDate value) {
		setConstDate(offset + 91, $schd_dt, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			return fix_no_typ_nm();
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			return fix_no();
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
		if ($pack_unit_rnd_typ.equalsIgnoreCase(name)) {
			return pack_unit_rnd_typ();
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			return conv_base_qty();
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			return conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($schd_dt.equalsIgnoreCase(name)) {
			return schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			return unreg_lmt_flg();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			return fix_no_typ_nm();
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			return fix_no();
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
		if ($pack_unit_rnd_typ.equalsIgnoreCase(name)) {
			return pack_unit_rnd_typ();
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($conv_base_qty.equalsIgnoreCase(name)) {
			return conv_base_qty();
		}
		if ($conv_qty.equalsIgnoreCase(name)) {
			return conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($schd_dt.equalsIgnoreCase(name)) {
			return schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			return unreg_lmt_flg();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			fix_no_typ(value);
			return;
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			fix_no_typ_nm(value);
			return;
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			fix_no(value);
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
		if ($pack_unit_rnd_typ.equalsIgnoreCase(name)) {
			pack_unit_rnd_typ(value);
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
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
		if ($schd_dt.equalsIgnoreCase(name)) {
			schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			unreg_lmt_flg(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			fix_no_typ(value);
			return;
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			fix_no_typ_nm(value);
			return;
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			fix_no(value);
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
		if ($pack_unit_rnd_typ.equalsIgnoreCase(name)) {
			pack_unit_rnd_typ(value);
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
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
		if ($schd_dt.equalsIgnoreCase(name)) {
			schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			unreg_lmt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($str_ln_p.equalsIgnoreCase(name)) {
			return str_ln_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($pack_stk_qty_p.equalsIgnoreCase(name)) {
			return pack_stk_qty_p();
		}
		if ($pack_gr_schd_qty_p.equalsIgnoreCase(name)) {
			return pack_gr_schd_qty_p();
		}
		if ($pack_alloc_qty_p.equalsIgnoreCase(name)) {
			return pack_alloc_qty_p();
		}
		if ($pack_wait_qty_p.equalsIgnoreCase(name)) {
			return pack_wait_qty_p();
		}
		if ($pack_lot_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			return pack_lot_alloc_avl_qty_p();
		}
		if ($pack_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			return pack_alloc_avl_qty_p();
		}
		if ($pack_unit_qty_p.equalsIgnoreCase(name)) {
			return pack_unit_qty_p();
		}
		if ($act_cont_qty_p.equalsIgnoreCase(name)) {
			return act_cont_qty_p();
		}
		if ($cont_fctr_unit_p.equalsIgnoreCase(name)) {
			return cont_fctr_unit_p();
		}
		if ($act_cont_fctr_p.equalsIgnoreCase(name)) {
			return act_cont_fctr_p();
		}
		if ($base_stk_qty_p.equalsIgnoreCase(name)) {
			return base_stk_qty_p();
		}
		if ($base_gr_schd_qty_p.equalsIgnoreCase(name)) {
			return base_gr_schd_qty_p();
		}
		if ($base_alloc_qty_p.equalsIgnoreCase(name)) {
			return base_alloc_qty_p();
		}
		if ($base_wait_qty_p.equalsIgnoreCase(name)) {
			return base_wait_qty_p();
		}
		if ($base_lot_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			return base_lot_alloc_avl_qty_p();
		}
		if ($base_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			return base_alloc_avl_qty_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($stk_act_cont_qty_p.equalsIgnoreCase(name)) {
			return stk_act_cont_qty_p();
		}
		if ($schd_act_cont_qty_p.equalsIgnoreCase(name)) {
			return schd_act_cont_qty_p();
		}
		if ($alloc_act_cont_qty_p.equalsIgnoreCase(name)) {
			return alloc_act_cont_qty_p();
		}
		if ($wait_act_cont_qty_p.equalsIgnoreCase(name)) {
			return wait_act_cont_qty_p();
		}
		if ($lot_avl_act_cont_qty_p.equalsIgnoreCase(name)) {
			return lot_avl_act_cont_qty_p();
		}
		if ($avl_act_cont_qty_p.equalsIgnoreCase(name)) {
			return avl_act_cont_qty_p();
		}
		if ($stk_std_cont_qty_p.equalsIgnoreCase(name)) {
			return stk_std_cont_qty_p();
		}
		if ($schd_std_cont_qty_p.equalsIgnoreCase(name)) {
			return schd_std_cont_qty_p();
		}
		if ($alloc_std_cont_qty_p.equalsIgnoreCase(name)) {
			return alloc_std_cont_qty_p();
		}
		if ($wait_std_cont_qty_p.equalsIgnoreCase(name)) {
			return wait_std_cont_qty_p();
		}
		if ($lot_avl_std_cont_qty_p.equalsIgnoreCase(name)) {
			return lot_avl_std_cont_qty_p();
		}
		if ($avl_std_cont_qty_p.equalsIgnoreCase(name)) {
			return avl_std_cont_qty_p();
		}
		if ($std_cont_qty_p.equalsIgnoreCase(name)) {
			return std_cont_qty_p();
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			return std_cont_fctr_p();
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
		if ($pack_stk_qty_p.equalsIgnoreCase(name)) {
			pack_stk_qty_p(
				((MCContainerMeta) pack_stk_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($pack_gr_schd_qty_p.equalsIgnoreCase(name)) {
			pack_gr_schd_qty_p(
				((MCContainerMeta) pack_gr_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($pack_alloc_qty_p.equalsIgnoreCase(name)) {
			pack_alloc_qty_p(
				((MCContainerMeta) pack_alloc_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($pack_wait_qty_p.equalsIgnoreCase(name)) {
			pack_wait_qty_p(
				((MCContainerMeta) pack_wait_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($pack_lot_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			pack_lot_alloc_avl_qty_p(
				((MCContainerMeta) pack_lot_alloc_avl_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($pack_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			pack_alloc_avl_qty_p(
				((MCContainerMeta) pack_alloc_avl_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($pack_unit_qty_p.equalsIgnoreCase(name)) {
			pack_unit_qty_p(
				((MCContainerMeta) pack_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($act_cont_qty_p.equalsIgnoreCase(name)) {
			act_cont_qty_p(
				((MCContainerMeta) act_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($cont_fctr_unit_p.equalsIgnoreCase(name)) {
			cont_fctr_unit_p(
				((MCContainerMeta) cont_fctr_unit_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class, value)
			);
			return;
		}
		if ($act_cont_fctr_p.equalsIgnoreCase(name)) {
			act_cont_fctr_p(
				((MCContainerMeta) act_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5290.ActContFctrR.class, value)
			);
			return;
		}
		if ($base_stk_qty_p.equalsIgnoreCase(name)) {
			base_stk_qty_p(
				((MCContainerMeta) base_stk_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_gr_schd_qty_p.equalsIgnoreCase(name)) {
			base_gr_schd_qty_p(
				((MCContainerMeta) base_gr_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_alloc_qty_p.equalsIgnoreCase(name)) {
			base_alloc_qty_p(
				((MCContainerMeta) base_alloc_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_wait_qty_p.equalsIgnoreCase(name)) {
			base_wait_qty_p(
				((MCContainerMeta) base_wait_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_lot_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			base_lot_alloc_avl_qty_p(
				((MCContainerMeta) base_lot_alloc_avl_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_alloc_avl_qty_p.equalsIgnoreCase(name)) {
			base_alloc_avl_qty_p(
				((MCContainerMeta) base_alloc_avl_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			base_unit_qty_p(
				((MCContainerMeta) base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($stk_act_cont_qty_p.equalsIgnoreCase(name)) {
			stk_act_cont_qty_p(
				((MCContainerMeta) stk_act_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($schd_act_cont_qty_p.equalsIgnoreCase(name)) {
			schd_act_cont_qty_p(
				((MCContainerMeta) schd_act_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($alloc_act_cont_qty_p.equalsIgnoreCase(name)) {
			alloc_act_cont_qty_p(
				((MCContainerMeta) alloc_act_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($wait_act_cont_qty_p.equalsIgnoreCase(name)) {
			wait_act_cont_qty_p(
				((MCContainerMeta) wait_act_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($lot_avl_act_cont_qty_p.equalsIgnoreCase(name)) {
			lot_avl_act_cont_qty_p(
				((MCContainerMeta) lot_avl_act_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($avl_act_cont_qty_p.equalsIgnoreCase(name)) {
			avl_act_cont_qty_p(
				((MCContainerMeta) avl_act_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($stk_std_cont_qty_p.equalsIgnoreCase(name)) {
			stk_std_cont_qty_p(
				((MCContainerMeta) stk_std_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($schd_std_cont_qty_p.equalsIgnoreCase(name)) {
			schd_std_cont_qty_p(
				((MCContainerMeta) schd_std_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($alloc_std_cont_qty_p.equalsIgnoreCase(name)) {
			alloc_std_cont_qty_p(
				((MCContainerMeta) alloc_std_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($wait_std_cont_qty_p.equalsIgnoreCase(name)) {
			wait_std_cont_qty_p(
				((MCContainerMeta) wait_std_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($lot_avl_std_cont_qty_p.equalsIgnoreCase(name)) {
			lot_avl_std_cont_qty_p(
				((MCContainerMeta) lot_avl_std_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($avl_std_cont_qty_p.equalsIgnoreCase(name)) {
			avl_std_cont_qty_p(
				((MCContainerMeta) avl_std_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($std_cont_qty_p.equalsIgnoreCase(name)) {
			std_cont_qty_p(
				((MCContainerMeta) std_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			std_cont_fctr_p(
				((MCContainerMeta) std_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5280.StdContFctrR.class, value)
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
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public MCNumber pack_stk_qty() {
		return pack_stk_qty_p().qty();
	}

	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public void pack_stk_qty(MCNumber value) {
		pack_stk_qty_p().qty(value);
	}

	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public void pack_stk_qty(int value) {
		pack_stk_qty_p().qty(value);
	}

	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public void pack_stk_qty(long value) {
		pack_stk_qty_p().qty(value);
	}

	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public void pack_stk_qty(float value) {
		pack_stk_qty_p().qty(value);
	}

	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public void pack_stk_qty(double value) {
		pack_stk_qty_p().qty(value);
	}

	/**
	 * GR scheduled qty. (SKU) 入庫予定数量（荷）.<p>
	 *
	 */
	public MCNumber pack_gr_schd_qty() {
		return pack_gr_schd_qty_p().qty();
	}

	/**
	 * GR scheduled qty. (SKU) 入庫予定数量（荷）.<p>
	 *
	 */
	public void pack_gr_schd_qty(MCNumber value) {
		pack_gr_schd_qty_p().qty(value);
	}

	/**
	 * GR scheduled qty. (SKU) 入庫予定数量（荷）.<p>
	 *
	 */
	public void pack_gr_schd_qty(int value) {
		pack_gr_schd_qty_p().qty(value);
	}

	/**
	 * GR scheduled qty. (SKU) 入庫予定数量（荷）.<p>
	 *
	 */
	public void pack_gr_schd_qty(long value) {
		pack_gr_schd_qty_p().qty(value);
	}

	/**
	 * GR scheduled qty. (SKU) 入庫予定数量（荷）.<p>
	 *
	 */
	public void pack_gr_schd_qty(float value) {
		pack_gr_schd_qty_p().qty(value);
	}

	/**
	 * GR scheduled qty. (SKU) 入庫予定数量（荷）.<p>
	 *
	 */
	public void pack_gr_schd_qty(double value) {
		pack_gr_schd_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (SKU) 引当数量（荷）.<p>
	 *
	 */
	public MCNumber pack_alloc_qty() {
		return pack_alloc_qty_p().qty();
	}

	/**
	 * Allocation qty. (SKU) 引当数量（荷）.<p>
	 *
	 */
	public void pack_alloc_qty(MCNumber value) {
		pack_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (SKU) 引当数量（荷）.<p>
	 *
	 */
	public void pack_alloc_qty(int value) {
		pack_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (SKU) 引当数量（荷）.<p>
	 *
	 */
	public void pack_alloc_qty(long value) {
		pack_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (SKU) 引当数量（荷）.<p>
	 *
	 */
	public void pack_alloc_qty(float value) {
		pack_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (SKU) 引当数量（荷）.<p>
	 *
	 */
	public void pack_alloc_qty(double value) {
		pack_alloc_qty_p().qty(value);
	}

	/**
	 * Pending qty. (SKU) 保留数量（荷）.<p>
	 *
	 */
	public MCNumber pack_wait_qty() {
		return pack_wait_qty_p().qty();
	}

	/**
	 * Pending qty. (SKU) 保留数量（荷）.<p>
	 *
	 */
	public void pack_wait_qty(MCNumber value) {
		pack_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (SKU) 保留数量（荷）.<p>
	 *
	 */
	public void pack_wait_qty(int value) {
		pack_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (SKU) 保留数量（荷）.<p>
	 *
	 */
	public void pack_wait_qty(long value) {
		pack_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (SKU) 保留数量（荷）.<p>
	 *
	 */
	public void pack_wait_qty(float value) {
		pack_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (SKU) 保留数量（荷）.<p>
	 *
	 */
	public void pack_wait_qty(double value) {
		pack_wait_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Package/with lot number after subtraction) 引当可能数量（荷／ロット指定有減算後）.<p>
	 *
	 */
	public MCNumber pack_lot_alloc_avl_qty() {
		return pack_lot_alloc_avl_qty_p().qty();
	}

	/**
	 * Allocatable qty. (Package/with lot number after subtraction) 引当可能数量（荷／ロット指定有減算後）.<p>
	 *
	 */
	public void pack_lot_alloc_avl_qty(MCNumber value) {
		pack_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Package/with lot number after subtraction) 引当可能数量（荷／ロット指定有減算後）.<p>
	 *
	 */
	public void pack_lot_alloc_avl_qty(int value) {
		pack_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Package/with lot number after subtraction) 引当可能数量（荷／ロット指定有減算後）.<p>
	 *
	 */
	public void pack_lot_alloc_avl_qty(long value) {
		pack_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Package/with lot number after subtraction) 引当可能数量（荷／ロット指定有減算後）.<p>
	 *
	 */
	public void pack_lot_alloc_avl_qty(float value) {
		pack_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Package/with lot number after subtraction) 引当可能数量（荷／ロット指定有減算後）.<p>
	 *
	 */
	public void pack_lot_alloc_avl_qty(double value) {
		pack_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (SKU) 引当可能数量（荷）.<p>
	 *
	 */
	public MCNumber pack_alloc_avl_qty() {
		return pack_alloc_avl_qty_p().qty();
	}

	/**
	 * Allocatable qty. (SKU) 引当可能数量（荷）.<p>
	 *
	 */
	public void pack_alloc_avl_qty(MCNumber value) {
		pack_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (SKU) 引当可能数量（荷）.<p>
	 *
	 */
	public void pack_alloc_avl_qty(int value) {
		pack_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (SKU) 引当可能数量（荷）.<p>
	 *
	 */
	public void pack_alloc_avl_qty(long value) {
		pack_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (SKU) 引当可能数量（荷）.<p>
	 *
	 */
	public void pack_alloc_avl_qty(float value) {
		pack_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (SKU) 引当可能数量（荷）.<p>
	 *
	 */
	public void pack_alloc_avl_qty(double value) {
		pack_alloc_avl_qty_p().qty(value);
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
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public MCNumber base_stk_qty() {
		return base_stk_qty_p().qty();
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public void base_stk_qty(MCNumber value) {
		base_stk_qty_p().qty(value);
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public void base_stk_qty(int value) {
		base_stk_qty_p().qty(value);
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public void base_stk_qty(long value) {
		base_stk_qty_p().qty(value);
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public void base_stk_qty(float value) {
		base_stk_qty_p().qty(value);
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public void base_stk_qty(double value) {
		base_stk_qty_p().qty(value);
	}

	/**
	 * GR scheduled qty. (Base) 入庫予定数量（基）.<p>
	 *
	 */
	public MCNumber base_gr_schd_qty() {
		return base_gr_schd_qty_p().qty();
	}

	/**
	 * GR scheduled qty. (Base) 入庫予定数量（基）.<p>
	 *
	 */
	public void base_gr_schd_qty(MCNumber value) {
		base_gr_schd_qty_p().qty(value);
	}

	/**
	 * GR scheduled qty. (Base) 入庫予定数量（基）.<p>
	 *
	 */
	public void base_gr_schd_qty(int value) {
		base_gr_schd_qty_p().qty(value);
	}

	/**
	 * GR scheduled qty. (Base) 入庫予定数量（基）.<p>
	 *
	 */
	public void base_gr_schd_qty(long value) {
		base_gr_schd_qty_p().qty(value);
	}

	/**
	 * GR scheduled qty. (Base) 入庫予定数量（基）.<p>
	 *
	 */
	public void base_gr_schd_qty(float value) {
		base_gr_schd_qty_p().qty(value);
	}

	/**
	 * GR scheduled qty. (Base) 入庫予定数量（基）.<p>
	 *
	 */
	public void base_gr_schd_qty(double value) {
		base_gr_schd_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Base unit) 引当数量（基）.<p>
	 *
	 */
	public MCNumber base_alloc_qty() {
		return base_alloc_qty_p().qty();
	}

	/**
	 * Allocation qty. (Base unit) 引当数量（基）.<p>
	 *
	 */
	public void base_alloc_qty(MCNumber value) {
		base_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Base unit) 引当数量（基）.<p>
	 *
	 */
	public void base_alloc_qty(int value) {
		base_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Base unit) 引当数量（基）.<p>
	 *
	 */
	public void base_alloc_qty(long value) {
		base_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Base unit) 引当数量（基）.<p>
	 *
	 */
	public void base_alloc_qty(float value) {
		base_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation qty. (Base unit) 引当数量（基）.<p>
	 *
	 */
	public void base_alloc_qty(double value) {
		base_alloc_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Base) 保留数量（基）.<p>
	 *
	 */
	public MCNumber base_wait_qty() {
		return base_wait_qty_p().qty();
	}

	/**
	 * Pending qty. (Base) 保留数量（基）.<p>
	 *
	 */
	public void base_wait_qty(MCNumber value) {
		base_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Base) 保留数量（基）.<p>
	 *
	 */
	public void base_wait_qty(int value) {
		base_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Base) 保留数量（基）.<p>
	 *
	 */
	public void base_wait_qty(long value) {
		base_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Base) 保留数量（基）.<p>
	 *
	 */
	public void base_wait_qty(float value) {
		base_wait_qty_p().qty(value);
	}

	/**
	 * Pending qty. (Base) 保留数量（基）.<p>
	 *
	 */
	public void base_wait_qty(double value) {
		base_wait_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Base/with lot number after subtraction) 引当可能数量（基／ロット指定有減算後）.<p>
	 *
	 */
	public MCNumber base_lot_alloc_avl_qty() {
		return base_lot_alloc_avl_qty_p().qty();
	}

	/**
	 * Allocatable qty. (Base/with lot number after subtraction) 引当可能数量（基／ロット指定有減算後）.<p>
	 *
	 */
	public void base_lot_alloc_avl_qty(MCNumber value) {
		base_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Base/with lot number after subtraction) 引当可能数量（基／ロット指定有減算後）.<p>
	 *
	 */
	public void base_lot_alloc_avl_qty(int value) {
		base_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Base/with lot number after subtraction) 引当可能数量（基／ロット指定有減算後）.<p>
	 *
	 */
	public void base_lot_alloc_avl_qty(long value) {
		base_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Base/with lot number after subtraction) 引当可能数量（基／ロット指定有減算後）.<p>
	 *
	 */
	public void base_lot_alloc_avl_qty(float value) {
		base_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Base/with lot number after subtraction) 引当可能数量（基／ロット指定有減算後）.<p>
	 *
	 */
	public void base_lot_alloc_avl_qty(double value) {
		base_lot_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Base) 引当可能数量（基）.<p>
	 *
	 */
	public MCNumber base_alloc_avl_qty() {
		return base_alloc_avl_qty_p().qty();
	}

	/**
	 * Allocatable qty. (Base) 引当可能数量（基）.<p>
	 *
	 */
	public void base_alloc_avl_qty(MCNumber value) {
		base_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Base) 引当可能数量（基）.<p>
	 *
	 */
	public void base_alloc_avl_qty(int value) {
		base_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Base) 引当可能数量（基）.<p>
	 *
	 */
	public void base_alloc_avl_qty(long value) {
		base_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Base) 引当可能数量（基）.<p>
	 *
	 */
	public void base_alloc_avl_qty(float value) {
		base_alloc_avl_qty_p().qty(value);
	}

	/**
	 * Allocatable qty. (Base) 引当可能数量（基）.<p>
	 *
	 */
	public void base_alloc_avl_qty(double value) {
		base_alloc_avl_qty_p().qty(value);
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
	 * Actual active ingredient (Inventory) 実際有効成分（在庫）.<p>
	 *
	 */
	public MCNumber stk_act_cont_qty() {
		return stk_act_cont_qty_p().cont_qty();
	}

	/**
	 * Actual active ingredient (Inventory) 実際有効成分（在庫）.<p>
	 *
	 */
	public void stk_act_cont_qty(MCNumber value) {
		stk_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Inventory) 実際有効成分（在庫）.<p>
	 *
	 */
	public void stk_act_cont_qty(int value) {
		stk_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Inventory) 実際有効成分（在庫）.<p>
	 *
	 */
	public void stk_act_cont_qty(long value) {
		stk_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Inventory) 実際有効成分（在庫）.<p>
	 *
	 */
	public void stk_act_cont_qty(float value) {
		stk_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Inventory) 実際有効成分（在庫）.<p>
	 *
	 */
	public void stk_act_cont_qty(double value) {
		stk_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (GR) 実際有効成分（入庫）.<p>
	 *
	 */
	public MCNumber schd_act_cont_qty() {
		return schd_act_cont_qty_p().cont_qty();
	}

	/**
	 * Actual active ingredient (GR) 実際有効成分（入庫）.<p>
	 *
	 */
	public void schd_act_cont_qty(MCNumber value) {
		schd_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (GR) 実際有効成分（入庫）.<p>
	 *
	 */
	public void schd_act_cont_qty(int value) {
		schd_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (GR) 実際有効成分（入庫）.<p>
	 *
	 */
	public void schd_act_cont_qty(long value) {
		schd_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (GR) 実際有効成分（入庫）.<p>
	 *
	 */
	public void schd_act_cont_qty(float value) {
		schd_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (GR) 実際有効成分（入庫）.<p>
	 *
	 */
	public void schd_act_cont_qty(double value) {
		schd_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Allocation) 実際有効成分（引当）.<p>
	 *
	 */
	public MCNumber alloc_act_cont_qty() {
		return alloc_act_cont_qty_p().cont_qty();
	}

	/**
	 * Actual active ingredient (Allocation) 実際有効成分（引当）.<p>
	 *
	 */
	public void alloc_act_cont_qty(MCNumber value) {
		alloc_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Allocation) 実際有効成分（引当）.<p>
	 *
	 */
	public void alloc_act_cont_qty(int value) {
		alloc_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Allocation) 実際有効成分（引当）.<p>
	 *
	 */
	public void alloc_act_cont_qty(long value) {
		alloc_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Allocation) 実際有効成分（引当）.<p>
	 *
	 */
	public void alloc_act_cont_qty(float value) {
		alloc_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Allocation) 実際有効成分（引当）.<p>
	 *
	 */
	public void alloc_act_cont_qty(double value) {
		alloc_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Pending) 実際有効成分（保留）.<p>
	 *
	 */
	public MCNumber wait_act_cont_qty() {
		return wait_act_cont_qty_p().cont_qty();
	}

	/**
	 * Actual active ingredient (Pending) 実際有効成分（保留）.<p>
	 *
	 */
	public void wait_act_cont_qty(MCNumber value) {
		wait_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Pending) 実際有効成分（保留）.<p>
	 *
	 */
	public void wait_act_cont_qty(int value) {
		wait_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Pending) 実際有効成分（保留）.<p>
	 *
	 */
	public void wait_act_cont_qty(long value) {
		wait_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Pending) 実際有効成分（保留）.<p>
	 *
	 */
	public void wait_act_cont_qty(float value) {
		wait_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Pending) 実際有効成分（保留）.<p>
	 *
	 */
	public void wait_act_cont_qty(double value) {
		wait_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Allocatable/with lot number after subtraction) 実際有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public MCNumber lot_avl_act_cont_qty() {
		return lot_avl_act_cont_qty_p().cont_qty();
	}

	/**
	 * Actual active ingredient (Allocatable/with lot number after subtraction) 実際有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_avl_act_cont_qty(MCNumber value) {
		lot_avl_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Allocatable/with lot number after subtraction) 実際有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_avl_act_cont_qty(int value) {
		lot_avl_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Allocatable/with lot number after subtraction) 実際有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_avl_act_cont_qty(long value) {
		lot_avl_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Allocatable/with lot number after subtraction) 実際有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_avl_act_cont_qty(float value) {
		lot_avl_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Allocatable/with lot number after subtraction) 実際有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_avl_act_cont_qty(double value) {
		lot_avl_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Allocatable) 実際有効成分（引当可）.<p>
	 *
	 */
	public MCNumber avl_act_cont_qty() {
		return avl_act_cont_qty_p().cont_qty();
	}

	/**
	 * Actual active ingredient (Allocatable) 実際有効成分（引当可）.<p>
	 *
	 */
	public void avl_act_cont_qty(MCNumber value) {
		avl_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Allocatable) 実際有効成分（引当可）.<p>
	 *
	 */
	public void avl_act_cont_qty(int value) {
		avl_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Allocatable) 実際有効成分（引当可）.<p>
	 *
	 */
	public void avl_act_cont_qty(long value) {
		avl_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Allocatable) 実際有効成分（引当可）.<p>
	 *
	 */
	public void avl_act_cont_qty(float value) {
		avl_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient (Allocatable) 実際有効成分（引当可）.<p>
	 *
	 */
	public void avl_act_cont_qty(double value) {
		avl_act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Inventory) 標準有効成分（在庫）.<p>
	 *
	 */
	public MCNumber stk_std_cont_qty() {
		return stk_std_cont_qty_p().cont_qty();
	}

	/**
	 * Standard active ingredient (Inventory) 標準有効成分（在庫）.<p>
	 *
	 */
	public void stk_std_cont_qty(MCNumber value) {
		stk_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Inventory) 標準有効成分（在庫）.<p>
	 *
	 */
	public void stk_std_cont_qty(int value) {
		stk_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Inventory) 標準有効成分（在庫）.<p>
	 *
	 */
	public void stk_std_cont_qty(long value) {
		stk_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Inventory) 標準有効成分（在庫）.<p>
	 *
	 */
	public void stk_std_cont_qty(float value) {
		stk_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Inventory) 標準有効成分（在庫）.<p>
	 *
	 */
	public void stk_std_cont_qty(double value) {
		stk_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (GR) 標準有効成分（入庫）.<p>
	 *
	 */
	public MCNumber schd_std_cont_qty() {
		return schd_std_cont_qty_p().cont_qty();
	}

	/**
	 * Standard active ingredient (GR) 標準有効成分（入庫）.<p>
	 *
	 */
	public void schd_std_cont_qty(MCNumber value) {
		schd_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (GR) 標準有効成分（入庫）.<p>
	 *
	 */
	public void schd_std_cont_qty(int value) {
		schd_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (GR) 標準有効成分（入庫）.<p>
	 *
	 */
	public void schd_std_cont_qty(long value) {
		schd_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (GR) 標準有効成分（入庫）.<p>
	 *
	 */
	public void schd_std_cont_qty(float value) {
		schd_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (GR) 標準有効成分（入庫）.<p>
	 *
	 */
	public void schd_std_cont_qty(double value) {
		schd_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Allocation) 標準有効成分（引当）.<p>
	 *
	 */
	public MCNumber alloc_std_cont_qty() {
		return alloc_std_cont_qty_p().cont_qty();
	}

	/**
	 * Standard active ingredient (Allocation) 標準有効成分（引当）.<p>
	 *
	 */
	public void alloc_std_cont_qty(MCNumber value) {
		alloc_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Allocation) 標準有効成分（引当）.<p>
	 *
	 */
	public void alloc_std_cont_qty(int value) {
		alloc_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Allocation) 標準有効成分（引当）.<p>
	 *
	 */
	public void alloc_std_cont_qty(long value) {
		alloc_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Allocation) 標準有効成分（引当）.<p>
	 *
	 */
	public void alloc_std_cont_qty(float value) {
		alloc_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Allocation) 標準有効成分（引当）.<p>
	 *
	 */
	public void alloc_std_cont_qty(double value) {
		alloc_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Pending) 標準有効成分（保留）.<p>
	 *
	 */
	public MCNumber wait_std_cont_qty() {
		return wait_std_cont_qty_p().cont_qty();
	}

	/**
	 * Standard active ingredient (Pending) 標準有効成分（保留）.<p>
	 *
	 */
	public void wait_std_cont_qty(MCNumber value) {
		wait_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Pending) 標準有効成分（保留）.<p>
	 *
	 */
	public void wait_std_cont_qty(int value) {
		wait_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Pending) 標準有効成分（保留）.<p>
	 *
	 */
	public void wait_std_cont_qty(long value) {
		wait_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Pending) 標準有効成分（保留）.<p>
	 *
	 */
	public void wait_std_cont_qty(float value) {
		wait_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Pending) 標準有効成分（保留）.<p>
	 *
	 */
	public void wait_std_cont_qty(double value) {
		wait_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Allocatable/with lot number after subtraction) 標準有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public MCNumber lot_avl_std_cont_qty() {
		return lot_avl_std_cont_qty_p().cont_qty();
	}

	/**
	 * Standard active ingredient (Allocatable/with lot number after subtraction) 標準有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_avl_std_cont_qty(MCNumber value) {
		lot_avl_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Allocatable/with lot number after subtraction) 標準有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_avl_std_cont_qty(int value) {
		lot_avl_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Allocatable/with lot number after subtraction) 標準有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_avl_std_cont_qty(long value) {
		lot_avl_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Allocatable/with lot number after subtraction) 標準有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_avl_std_cont_qty(float value) {
		lot_avl_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Allocatable/with lot number after subtraction) 標準有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_avl_std_cont_qty(double value) {
		lot_avl_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Allocatable) 標準有効成分（引当可）.<p>
	 *
	 */
	public MCNumber avl_std_cont_qty() {
		return avl_std_cont_qty_p().cont_qty();
	}

	/**
	 * Standard active ingredient (Allocatable) 標準有効成分（引当可）.<p>
	 *
	 */
	public void avl_std_cont_qty(MCNumber value) {
		avl_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Allocatable) 標準有効成分（引当可）.<p>
	 *
	 */
	public void avl_std_cont_qty(int value) {
		avl_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Allocatable) 標準有効成分（引当可）.<p>
	 *
	 */
	public void avl_std_cont_qty(long value) {
		avl_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Allocatable) 標準有効成分（引当可）.<p>
	 *
	 */
	public void avl_std_cont_qty(float value) {
		avl_std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient (Allocatable) 標準有効成分（引当可）.<p>
	 *
	 */
	public void avl_std_cont_qty(double value) {
		avl_std_cont_qty_p().cont_qty(value);
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

}

