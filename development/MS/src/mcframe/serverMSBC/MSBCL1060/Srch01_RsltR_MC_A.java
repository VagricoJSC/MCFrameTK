package mcframe.serverMSBC.MSBCL1060;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

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
	public static final String $alloc = "alloc";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Miscellaneous item name 諸口品名.<p>
	 *
	 */
	public static final String $sundry_itm_nm = "sundry_itm_nm";
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
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
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
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
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public static final String $in_xfr_typ_nm = "in_xfr_typ_nm";
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public static final String $quality_typ_nm = "quality_typ_nm";
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public static final String $stk_insp_typ_nm = "stk_insp_typ_nm";
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
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public static final String $asst_typ_nm = "asst_typ_nm";
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public static final String $stk_id_typ_nm = "stk_id_typ_nm";
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
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
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public static final String $stk_arrv_bp_nm = "stk_arrv_bp_nm";
	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public static final String $pack_stk_qty = "pack_stk_qty";
	/**
	 * GR scheduled qty. (SKU) 入庫予定数量（荷）.<p>
	 *
	 */
	public static final String $pack_gr_schd_qty = "pack_gr_schd_qty";
	/**
	 * Allocation qty. (SKU) 引当数量（荷）.<p>
	 *
	 */
	public static final String $pack_alloc_qty = "pack_alloc_qty";
	/**
	 * Pending qty. (SKU) 保留数量（荷）.<p>
	 *
	 */
	public static final String $pack_wait_qty = "pack_wait_qty";
	/**
	 * Allocatable qty. (Package/with lot number after subtraction) 引当可能数量（荷／ロット指定有減算後）.<p>
	 *
	 */
	public static final String $pack_lot_alloc_avl_qty = "pack_lot_alloc_avl_qty";
	/**
	 * Allocatable qty. (SKU) 引当可能数量（荷）.<p>
	 *
	 */
	public static final String $pack_alloc_avl_qty = "pack_alloc_avl_qty";
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public static final String $pack_unit_nm = "pack_unit_nm";
	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public static final String $base_stk_qty = "base_stk_qty";
	/**
	 * GR scheduled qty. (Base) 入庫予定数量（基）.<p>
	 *
	 */
	public static final String $base_gr_schd_qty = "base_gr_schd_qty";
	/**
	 * Allocation qty. (Base unit) 引当数量（基）.<p>
	 *
	 */
	public static final String $base_alloc_qty = "base_alloc_qty";
	/**
	 * Pending qty. (Base) 保留数量（基）.<p>
	 *
	 */
	public static final String $base_wait_qty = "base_wait_qty";
	/**
	 * Allocatable qty. (Base/with lot number after subtraction) 引当可能数量（基／ロット指定有減算後）.<p>
	 *
	 */
	public static final String $base_lot_alloc_avl_qty = "base_lot_alloc_avl_qty";
	/**
	 * Allocatable qty. (Base) 引当可能数量（基）.<p>
	 *
	 */
	public static final String $base_alloc_avl_qty = "base_alloc_avl_qty";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Actual active ingredient (Inventory) 実際有効成分（在庫）.<p>
	 *
	 */
	public static final String $stk_act_cont_qty = "stk_act_cont_qty";
	/**
	 * Actual active ingredient (GR) 実際有効成分（入庫）.<p>
	 *
	 */
	public static final String $schd_act_cont_qty = "schd_act_cont_qty";
	/**
	 * Actual active ingredient (Allocation) 実際有効成分（引当）.<p>
	 *
	 */
	public static final String $alloc_act_cont_qty = "alloc_act_cont_qty";
	/**
	 * Actual active ingredient (Pending) 実際有効成分（保留）.<p>
	 *
	 */
	public static final String $wait_act_cont_qty = "wait_act_cont_qty";
	/**
	 * Actual active ingredient (Allocatable/with lot number after subtraction) 実際有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public static final String $lot_avl_act_cont_qty = "lot_avl_act_cont_qty";
	/**
	 * Actual active ingredient (Allocatable) 実際有効成分（引当可）.<p>
	 *
	 */
	public static final String $avl_act_cont_qty = "avl_act_cont_qty";
	/**
	 * Standard active ingredient (Inventory) 標準有効成分（在庫）.<p>
	 *
	 */
	public static final String $stk_std_cont_qty = "stk_std_cont_qty";
	/**
	 * Standard active ingredient (GR) 標準有効成分（入庫）.<p>
	 *
	 */
	public static final String $schd_std_cont_qty = "schd_std_cont_qty";
	/**
	 * Standard active ingredient (Allocation) 標準有効成分（引当）.<p>
	 *
	 */
	public static final String $alloc_std_cont_qty = "alloc_std_cont_qty";
	/**
	 * Standard active ingredient (Pending) 標準有効成分（保留）.<p>
	 *
	 */
	public static final String $wait_std_cont_qty = "wait_std_cont_qty";
	/**
	 * Standard active ingredient (Allocatable/with lot number after subtraction) 標準有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public static final String $lot_avl_std_cont_qty = "lot_avl_std_cont_qty";
	/**
	 * Standard active ingredient (Allocatable) 標準有効成分（引当可）.<p>
	 *
	 */
	public static final String $avl_std_cont_qty = "avl_std_cont_qty";
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
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public static final String $plnt_aprv_sts_typ_nm = "plnt_aprv_sts_typ_nm";
	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ_nm = "mrkt_judg_sts_typ_nm";
	/**
	 * Scheduled inventory type 予定在庫区分.<p>
	 *
	 */
	public static final String $schd_stk_typ = "schd_stk_typ";

	public static final String $itm_cd = $alloc + ".itm_cd";
	public static final String $itm_sub1 = $alloc + ".itm_sub1";
	public static final String $itm_sub2 = $alloc + ".itm_sub2";
	public static final String $itm_sub3 = $alloc + ".itm_sub3";
	public static final String $ver_no = $alloc + ".ver_no";
	public static final String $lot_no = $alloc + ".lot_no";
	public static final String $sublot_no = $alloc + ".sublot_no";
	public static final String $loc_cd = $alloc + ".stk_loc_cd";
	public static final String $str_ln_cd = $alloc + ".stk_str_ln_cd";
	public static final String $lg_grp_cd = $alloc + ".stk_lg_grp_cd";
	public static final String $alloc_grp_cd = $alloc + ".alloc_grp_cd";
	public static final String $gd_cd = $alloc + ".gd_cd";
	public static final String $in_xfr_typ = $alloc + ".in_xfr_typ";
	public static final String $quality_typ = $alloc + ".quality_typ";
	public static final String $stk_insp_typ = $alloc + ".stk_insp_typ";
	public static final String $sno1 = $alloc + ".sno1";
	public static final String $sno2 = $alloc + ".sno2";
	public static final String $sno3 = $alloc + ".sno3";
	public static final String $sno4 = $alloc + ".sno4";
	public static final String $asst_typ = $alloc + ".asst_typ";
	public static final String $stk_id_typ = $alloc + ".stk_id_typ";
	public static final String $stk_bp_cd = $alloc + ".stk_bp_cd";
	public static final String $stk_arrv_bp_cd = $alloc + ".stk_arrv_bp_cd";
	public static final String $pack_unit_cd = $alloc + ".pack_unit_cd";
	public static final String $pack_unit_dec_place = $alloc + ".pack_unit_dec_place";
	public static final String $pack_unit_rnd_typ = $alloc + ".pack_unit_rnd_typ";
	public static final String $conv_base_qty = $alloc + ".conv_base_qty";
	public static final String $conv_qty = $alloc + ".conv_qty";
	public static final String $base_unit_cd = $alloc + ".base_unit_cd";
	public static final String $base_unit_dec_place = $alloc + ".base_unit_dec_place";
	public static final String $base_unit_rnd_typ = $alloc + ".base_unit_rnd_typ";
	public static final String $act_cont_fctr = $alloc + ".act_cont_fctr";
	public static final String $std_cont_fctr = $alloc + ".std_cont_fctr";
	public static final String $cont_fctr_flg = $alloc + ".cont_fctr_flg";
	public static final String $cont_fctr_dec_place = $alloc + ".cont_fctr_dec_place";
	public static final String $cont_fctr_rnd_typ = $alloc + ".cont_fctr_rnd_typ";
	public static final String $first_gr_dt = $alloc + ".first_gr_dt";
	public static final String $unreg_lmt_flg = $alloc + ".unreg_lmt_flg";
	public static final String $vld_dt = $alloc + ".vld_dt";
	public static final String $lmt_dt = $alloc + ".lmt_dt";
	public static final String $plnt_aprv_sts_typ = $alloc + ".plnt_aprv_sts_typ";
	public static final String $mrkt_judg_sts_typ = $alloc + ".mrkt_judg_sts_typ";
	public static final String $schd_dt = $alloc + ".schd_dt";

	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta alloc_META = createInnerRowMeta($alloc, mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sundry_itm_nm_META = createCommonMeta($sundry_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta str_ln_cd_none_flg_META = createCommonMeta($str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta in_xfr_typ_nm_META = createCommonMeta($in_xfr_typ_nm, mcframe.commonMS.meta.MS_META.IN_XFR_TYP_NM);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta fix_no_typ_META = createCommonMeta($fix_no_typ, mcframe.commonMS.meta.MS_META.FIX_NO_TYP);
	public static final MCMeta fix_no_typ_nm_META = createCommonMeta($fix_no_typ_nm, mcframe.commonMS.meta.MS_META.FIX_NO_TYP_NM);
	public static final MCMeta fix_no_META = createCommonMeta($fix_no, mcframe.commonMA.meta.MA_META.FIX_NO);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta pack_stk_qty_META = createCommonMeta($pack_stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_gr_schd_qty_META = createCommonMeta($pack_gr_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_alloc_qty_META = createCommonMeta($pack_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_wait_qty_META = createCommonMeta($pack_wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_lot_alloc_avl_qty_META = createCommonMeta($pack_lot_alloc_avl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_alloc_avl_qty_META = createCommonMeta($pack_alloc_avl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_stk_qty_META = createCommonMeta($base_stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_gr_schd_qty_META = createCommonMeta($base_gr_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_alloc_qty_META = createCommonMeta($base_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_wait_qty_META = createCommonMeta($base_wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_lot_alloc_avl_qty_META = createCommonMeta($base_lot_alloc_avl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_alloc_avl_qty_META = createCommonMeta($base_alloc_avl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta stk_act_cont_qty_META = createCommonMeta($stk_act_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta schd_act_cont_qty_META = createCommonMeta($schd_act_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta alloc_act_cont_qty_META = createCommonMeta($alloc_act_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta wait_act_cont_qty_META = createCommonMeta($wait_act_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta lot_avl_act_cont_qty_META = createCommonMeta($lot_avl_act_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta avl_act_cont_qty_META = createCommonMeta($avl_act_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta stk_std_cont_qty_META = createCommonMeta($stk_std_cont_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_std_cont_qty_META = createCommonMeta($schd_std_cont_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alloc_std_cont_qty_META = createCommonMeta($alloc_std_cont_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta wait_std_cont_qty_META = createCommonMeta($wait_std_cont_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta lot_avl_std_cont_qty_META = createCommonMeta($lot_avl_std_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta avl_std_cont_qty_META = createCommonMeta($avl_std_cont_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta cont_fctr_unit_nm_META = createCommonMeta($cont_fctr_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta plnt_aprv_sts_typ_nm_META = createCommonMeta($plnt_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.PLNT_APRV_STS_TYP_NM);
	public static final MCMeta mrkt_judg_sts_typ_nm_META = createCommonMeta($mrkt_judg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP_NM);
	public static final MCMeta schd_stk_typ_META = createCommonMeta($schd_stk_typ, mcframe.commonMS.meta.MS_META.SCHD_STK_TYP);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			wg_cd_META,
			wg_nm_META,
			alloc_META,
			itm_nm_META,
			sundry_itm_nm_META,
			bp_lot_no_META,
			loc_nm_META,
			str_ln_nm_META,
			str_ln_cd_none_flg_META,
			site_cd_META,
			site_nm_META,
			lg_grp_nm_META,
			alloc_grp_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			gd_nm_META,
			in_xfr_typ_nm_META,
			quality_typ_nm_META,
			stk_insp_typ_nm_META,
			wrk_no_META,
			wrk_nm_META,
			asst_typ_nm_META,
			stk_id_typ_nm_META,
			stk_bp_nm_META,
			fix_no_typ_META,
			fix_no_typ_nm_META,
			fix_no_META,
			stk_arrv_bp_nm_META,
			pack_stk_qty_META,
			pack_gr_schd_qty_META,
			pack_alloc_qty_META,
			pack_wait_qty_META,
			pack_lot_alloc_avl_qty_META,
			pack_alloc_avl_qty_META,
			pack_unit_nm_META,
			base_stk_qty_META,
			base_gr_schd_qty_META,
			base_alloc_qty_META,
			base_wait_qty_META,
			base_lot_alloc_avl_qty_META,
			base_alloc_avl_qty_META,
			base_unit_nm_META,
			stk_act_cont_qty_META,
			schd_act_cont_qty_META,
			alloc_act_cont_qty_META,
			wait_act_cont_qty_META,
			lot_avl_act_cont_qty_META,
			avl_act_cont_qty_META,
			stk_std_cont_qty_META,
			schd_std_cont_qty_META,
			alloc_std_cont_qty_META,
			wait_std_cont_qty_META,
			lot_avl_std_cont_qty_META,
			avl_std_cont_qty_META,
			cont_fctr_unit_cd_META,
			cont_fctr_unit_nm_META,
			plnt_aprv_sts_typ_nm_META,
			mrkt_judg_sts_typ_nm_META,
			schd_stk_typ_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"ver_no",
				"lot_no",
				"sublot_no",
				"loc_cd",
				"str_ln_cd",
				"lg_grp_cd",
				"alloc_grp_cd",
				"gd_cd",
				"in_xfr_typ",
				"quality_typ",
				"stk_insp_typ",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"asst_typ",
				"stk_id_typ",
				"stk_bp_cd",
				"stk_arrv_bp_cd",
				"pack_unit_cd",
				"pack_unit_dec_place",
				"pack_unit_rnd_typ",
				"conv_base_qty",
				"conv_qty",
				"base_unit_cd",
				"base_unit_dec_place",
				"base_unit_rnd_typ",
				"act_cont_fctr",
				"std_cont_fctr",
				"cont_fctr_flg",
				"cont_fctr_dec_place",
				"cont_fctr_rnd_typ",
				"first_gr_dt",
				"unreg_lmt_flg",
				"vld_dt",
				"lmt_dt",
				"plnt_aprv_sts_typ",
				"mrkt_judg_sts_typ",
				"schd_dt"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$ver_no,
				$lot_no,
				$sublot_no,
				$loc_cd,
				$str_ln_cd,
				$lg_grp_cd,
				$alloc_grp_cd,
				$gd_cd,
				$in_xfr_typ,
				$quality_typ,
				$stk_insp_typ,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$asst_typ,
				$stk_id_typ,
				$stk_bp_cd,
				$stk_arrv_bp_cd,
				$pack_unit_cd,
				$pack_unit_dec_place,
				$pack_unit_rnd_typ,
				$conv_base_qty,
				$conv_qty,
				$base_unit_cd,
				$base_unit_dec_place,
				$base_unit_rnd_typ,
				$act_cont_fctr,
				$std_cont_fctr,
				$cont_fctr_flg,
				$cont_fctr_dec_place,
				$cont_fctr_rnd_typ,
				$first_gr_dt,
				$unreg_lmt_flg,
				$vld_dt,
				$lmt_dt,
				$plnt_aprv_sts_typ,
				$mrkt_judg_sts_typ,
				$schd_dt
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
				{$alloc + ".in_xfr_typ", "MSC_IN_XFR_TYP"},	// alloc.in_xfr_typ
				{$alloc + ".quality_typ", "MAC_QUALITY_TYP"},	// alloc.quality_typ
				{$alloc + ".stk_insp_typ", "MSC_STK_INSP_TYP"},	// alloc.stk_insp_typ
				{$alloc + ".asst_typ", "MAC_ASST_TYP"},	// alloc.asst_typ
				{$alloc + ".stk_id_typ", "MSC_STK_ID_TYP"},	// alloc.stk_id_typ
				{$fix_no_typ, "MSC_FIX_NO_TYP"},	// fix_no_typ
				{$alloc + ".plnt_aprv_sts_typ", "MSC_PLNT_APRV_STS_TYP"},	// alloc.plnt_aprv_sts_typ
				{$alloc + ".mrkt_judg_sts_typ", "MSC_MRKT_JUDG_STS_TYP"}	// alloc.mrkt_judg_sts_typ
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 0, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 0, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 1, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 1, $wg_nm, value);
	}


	public mcframe.serverMSBE.MSBEL5040.Avl_ListR alloc(){
		return (mcframe.serverMSBE.MSBEL5040.Avl_ListR) getConstInnerRow(offset + 2, $alloc);
	}
	
	public void alloc(mcframe.serverMSBE.MSBEL5040.Avl_ListR row){
		setConstInnerRow(offset + 2, $alloc, row);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 3, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 3, $itm_nm, value);
	}


	/**
	 * Miscellaneous item name 諸口品名.<p>
	 *
	 */
	public String sundry_itm_nm() {
		return getConstString(offset + 4, $sundry_itm_nm);
	}

	/**
	 * Miscellaneous item name 諸口品名.<p>
	 *
	 */
	public void sundry_itm_nm(String value) {
		setConstString(offset + 4, $sundry_itm_nm, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 5, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 5, $bp_lot_no, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 6, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 6, $loc_nm, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 7, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 7, $str_ln_nm, value);
	}


	/**
	 * Without rack/line cd. 棚・ラインＣＤ無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 8, $str_ln_cd_none_flg);
	}

	/**
	 * Without rack/line cd. 棚・ラインＣＤ無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 8, $str_ln_cd_none_flg, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 9, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 9, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 10, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 10, $site_nm, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 11, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 11, $lg_grp_nm, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 12, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 12, $alloc_grp_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 13, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 13, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 14, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 14, $loc_grp_nm, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 15, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 15, $gd_nm, value);
	}


	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public String in_xfr_typ_nm() {
		return getConstString(offset + 16, $in_xfr_typ_nm);
	}

	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public void in_xfr_typ_nm(String value) {
		setConstString(offset + 16, $in_xfr_typ_nm, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 17, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 17, $quality_typ_nm, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 18, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 18, $stk_insp_typ_nm, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 19, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 19, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 20, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 20, $wrk_nm, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 21, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 21, $asst_typ_nm, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 22, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 22, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 23, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 23, $stk_bp_nm, value);
	}


	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public String fix_no_typ() {
		return getConstString(offset + 24, $fix_no_typ);
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public void fix_no_typ(String value) {
		setConstString(offset + 24, $fix_no_typ, value);
	}


	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public String fix_no_typ_nm() {
		return getConstString(offset + 25, $fix_no_typ_nm);
	}

	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public void fix_no_typ_nm(String value) {
		setConstString(offset + 25, $fix_no_typ_nm, value);
	}


	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public String fix_no() {
		return getConstString(offset + 26, $fix_no);
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public void fix_no(String value) {
		setConstString(offset + 26, $fix_no, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 27, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 27, $stk_arrv_bp_nm, value);
	}


	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public MCNumber pack_stk_qty() {
		return getConstNumber(offset + 28, $pack_stk_qty);
	}

	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public void pack_stk_qty(MCNumber value) {
		setConstNumber(offset + 28, $pack_stk_qty, value);
	}

	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public void pack_stk_qty(int value) {
		setConstNumber(offset + 28, $pack_stk_qty, value);
	}

	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public void pack_stk_qty(long value) {
		setConstNumber(offset + 28, $pack_stk_qty, value);
	}

	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public void pack_stk_qty(float value) {
		setConstNumber(offset + 28, $pack_stk_qty, value);
	}

	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public void pack_stk_qty(double value) {
		setConstNumber(offset + 28, $pack_stk_qty, value);
	}


	/**
	 * GR scheduled qty. (SKU) 入庫予定数量（荷）.<p>
	 *
	 */
	public MCNumber pack_gr_schd_qty() {
		return getConstNumber(offset + 29, $pack_gr_schd_qty);
	}

	/**
	 * GR scheduled qty. (SKU) 入庫予定数量（荷）.<p>
	 *
	 */
	public void pack_gr_schd_qty(MCNumber value) {
		setConstNumber(offset + 29, $pack_gr_schd_qty, value);
	}

	/**
	 * GR scheduled qty. (SKU) 入庫予定数量（荷）.<p>
	 *
	 */
	public void pack_gr_schd_qty(int value) {
		setConstNumber(offset + 29, $pack_gr_schd_qty, value);
	}

	/**
	 * GR scheduled qty. (SKU) 入庫予定数量（荷）.<p>
	 *
	 */
	public void pack_gr_schd_qty(long value) {
		setConstNumber(offset + 29, $pack_gr_schd_qty, value);
	}

	/**
	 * GR scheduled qty. (SKU) 入庫予定数量（荷）.<p>
	 *
	 */
	public void pack_gr_schd_qty(float value) {
		setConstNumber(offset + 29, $pack_gr_schd_qty, value);
	}

	/**
	 * GR scheduled qty. (SKU) 入庫予定数量（荷）.<p>
	 *
	 */
	public void pack_gr_schd_qty(double value) {
		setConstNumber(offset + 29, $pack_gr_schd_qty, value);
	}


	/**
	 * Allocation qty. (SKU) 引当数量（荷）.<p>
	 *
	 */
	public MCNumber pack_alloc_qty() {
		return getConstNumber(offset + 30, $pack_alloc_qty);
	}

	/**
	 * Allocation qty. (SKU) 引当数量（荷）.<p>
	 *
	 */
	public void pack_alloc_qty(MCNumber value) {
		setConstNumber(offset + 30, $pack_alloc_qty, value);
	}

	/**
	 * Allocation qty. (SKU) 引当数量（荷）.<p>
	 *
	 */
	public void pack_alloc_qty(int value) {
		setConstNumber(offset + 30, $pack_alloc_qty, value);
	}

	/**
	 * Allocation qty. (SKU) 引当数量（荷）.<p>
	 *
	 */
	public void pack_alloc_qty(long value) {
		setConstNumber(offset + 30, $pack_alloc_qty, value);
	}

	/**
	 * Allocation qty. (SKU) 引当数量（荷）.<p>
	 *
	 */
	public void pack_alloc_qty(float value) {
		setConstNumber(offset + 30, $pack_alloc_qty, value);
	}

	/**
	 * Allocation qty. (SKU) 引当数量（荷）.<p>
	 *
	 */
	public void pack_alloc_qty(double value) {
		setConstNumber(offset + 30, $pack_alloc_qty, value);
	}


	/**
	 * Pending qty. (SKU) 保留数量（荷）.<p>
	 *
	 */
	public MCNumber pack_wait_qty() {
		return getConstNumber(offset + 31, $pack_wait_qty);
	}

	/**
	 * Pending qty. (SKU) 保留数量（荷）.<p>
	 *
	 */
	public void pack_wait_qty(MCNumber value) {
		setConstNumber(offset + 31, $pack_wait_qty, value);
	}

	/**
	 * Pending qty. (SKU) 保留数量（荷）.<p>
	 *
	 */
	public void pack_wait_qty(int value) {
		setConstNumber(offset + 31, $pack_wait_qty, value);
	}

	/**
	 * Pending qty. (SKU) 保留数量（荷）.<p>
	 *
	 */
	public void pack_wait_qty(long value) {
		setConstNumber(offset + 31, $pack_wait_qty, value);
	}

	/**
	 * Pending qty. (SKU) 保留数量（荷）.<p>
	 *
	 */
	public void pack_wait_qty(float value) {
		setConstNumber(offset + 31, $pack_wait_qty, value);
	}

	/**
	 * Pending qty. (SKU) 保留数量（荷）.<p>
	 *
	 */
	public void pack_wait_qty(double value) {
		setConstNumber(offset + 31, $pack_wait_qty, value);
	}


	/**
	 * Allocatable qty. (Package/with lot number after subtraction) 引当可能数量（荷／ロット指定有減算後）.<p>
	 *
	 */
	public MCNumber pack_lot_alloc_avl_qty() {
		return getConstNumber(offset + 32, $pack_lot_alloc_avl_qty);
	}

	/**
	 * Allocatable qty. (Package/with lot number after subtraction) 引当可能数量（荷／ロット指定有減算後）.<p>
	 *
	 */
	public void pack_lot_alloc_avl_qty(MCNumber value) {
		setConstNumber(offset + 32, $pack_lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Package/with lot number after subtraction) 引当可能数量（荷／ロット指定有減算後）.<p>
	 *
	 */
	public void pack_lot_alloc_avl_qty(int value) {
		setConstNumber(offset + 32, $pack_lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Package/with lot number after subtraction) 引当可能数量（荷／ロット指定有減算後）.<p>
	 *
	 */
	public void pack_lot_alloc_avl_qty(long value) {
		setConstNumber(offset + 32, $pack_lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Package/with lot number after subtraction) 引当可能数量（荷／ロット指定有減算後）.<p>
	 *
	 */
	public void pack_lot_alloc_avl_qty(float value) {
		setConstNumber(offset + 32, $pack_lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Package/with lot number after subtraction) 引当可能数量（荷／ロット指定有減算後）.<p>
	 *
	 */
	public void pack_lot_alloc_avl_qty(double value) {
		setConstNumber(offset + 32, $pack_lot_alloc_avl_qty, value);
	}


	/**
	 * Allocatable qty. (SKU) 引当可能数量（荷）.<p>
	 *
	 */
	public MCNumber pack_alloc_avl_qty() {
		return getConstNumber(offset + 33, $pack_alloc_avl_qty);
	}

	/**
	 * Allocatable qty. (SKU) 引当可能数量（荷）.<p>
	 *
	 */
	public void pack_alloc_avl_qty(MCNumber value) {
		setConstNumber(offset + 33, $pack_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (SKU) 引当可能数量（荷）.<p>
	 *
	 */
	public void pack_alloc_avl_qty(int value) {
		setConstNumber(offset + 33, $pack_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (SKU) 引当可能数量（荷）.<p>
	 *
	 */
	public void pack_alloc_avl_qty(long value) {
		setConstNumber(offset + 33, $pack_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (SKU) 引当可能数量（荷）.<p>
	 *
	 */
	public void pack_alloc_avl_qty(float value) {
		setConstNumber(offset + 33, $pack_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (SKU) 引当可能数量（荷）.<p>
	 *
	 */
	public void pack_alloc_avl_qty(double value) {
		setConstNumber(offset + 33, $pack_alloc_avl_qty, value);
	}


	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 34, $pack_unit_nm);
	}

	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 34, $pack_unit_nm, value);
	}


	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public MCNumber base_stk_qty() {
		return getConstNumber(offset + 35, $base_stk_qty);
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public void base_stk_qty(MCNumber value) {
		setConstNumber(offset + 35, $base_stk_qty, value);
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public void base_stk_qty(int value) {
		setConstNumber(offset + 35, $base_stk_qty, value);
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public void base_stk_qty(long value) {
		setConstNumber(offset + 35, $base_stk_qty, value);
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public void base_stk_qty(float value) {
		setConstNumber(offset + 35, $base_stk_qty, value);
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public void base_stk_qty(double value) {
		setConstNumber(offset + 35, $base_stk_qty, value);
	}


	/**
	 * GR scheduled qty. (Base) 入庫予定数量（基）.<p>
	 *
	 */
	public MCNumber base_gr_schd_qty() {
		return getConstNumber(offset + 36, $base_gr_schd_qty);
	}

	/**
	 * GR scheduled qty. (Base) 入庫予定数量（基）.<p>
	 *
	 */
	public void base_gr_schd_qty(MCNumber value) {
		setConstNumber(offset + 36, $base_gr_schd_qty, value);
	}

	/**
	 * GR scheduled qty. (Base) 入庫予定数量（基）.<p>
	 *
	 */
	public void base_gr_schd_qty(int value) {
		setConstNumber(offset + 36, $base_gr_schd_qty, value);
	}

	/**
	 * GR scheduled qty. (Base) 入庫予定数量（基）.<p>
	 *
	 */
	public void base_gr_schd_qty(long value) {
		setConstNumber(offset + 36, $base_gr_schd_qty, value);
	}

	/**
	 * GR scheduled qty. (Base) 入庫予定数量（基）.<p>
	 *
	 */
	public void base_gr_schd_qty(float value) {
		setConstNumber(offset + 36, $base_gr_schd_qty, value);
	}

	/**
	 * GR scheduled qty. (Base) 入庫予定数量（基）.<p>
	 *
	 */
	public void base_gr_schd_qty(double value) {
		setConstNumber(offset + 36, $base_gr_schd_qty, value);
	}


	/**
	 * Allocation qty. (Base unit) 引当数量（基）.<p>
	 *
	 */
	public MCNumber base_alloc_qty() {
		return getConstNumber(offset + 37, $base_alloc_qty);
	}

	/**
	 * Allocation qty. (Base unit) 引当数量（基）.<p>
	 *
	 */
	public void base_alloc_qty(MCNumber value) {
		setConstNumber(offset + 37, $base_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Base unit) 引当数量（基）.<p>
	 *
	 */
	public void base_alloc_qty(int value) {
		setConstNumber(offset + 37, $base_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Base unit) 引当数量（基）.<p>
	 *
	 */
	public void base_alloc_qty(long value) {
		setConstNumber(offset + 37, $base_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Base unit) 引当数量（基）.<p>
	 *
	 */
	public void base_alloc_qty(float value) {
		setConstNumber(offset + 37, $base_alloc_qty, value);
	}

	/**
	 * Allocation qty. (Base unit) 引当数量（基）.<p>
	 *
	 */
	public void base_alloc_qty(double value) {
		setConstNumber(offset + 37, $base_alloc_qty, value);
	}


	/**
	 * Pending qty. (Base) 保留数量（基）.<p>
	 *
	 */
	public MCNumber base_wait_qty() {
		return getConstNumber(offset + 38, $base_wait_qty);
	}

	/**
	 * Pending qty. (Base) 保留数量（基）.<p>
	 *
	 */
	public void base_wait_qty(MCNumber value) {
		setConstNumber(offset + 38, $base_wait_qty, value);
	}

	/**
	 * Pending qty. (Base) 保留数量（基）.<p>
	 *
	 */
	public void base_wait_qty(int value) {
		setConstNumber(offset + 38, $base_wait_qty, value);
	}

	/**
	 * Pending qty. (Base) 保留数量（基）.<p>
	 *
	 */
	public void base_wait_qty(long value) {
		setConstNumber(offset + 38, $base_wait_qty, value);
	}

	/**
	 * Pending qty. (Base) 保留数量（基）.<p>
	 *
	 */
	public void base_wait_qty(float value) {
		setConstNumber(offset + 38, $base_wait_qty, value);
	}

	/**
	 * Pending qty. (Base) 保留数量（基）.<p>
	 *
	 */
	public void base_wait_qty(double value) {
		setConstNumber(offset + 38, $base_wait_qty, value);
	}


	/**
	 * Allocatable qty. (Base/with lot number after subtraction) 引当可能数量（基／ロット指定有減算後）.<p>
	 *
	 */
	public MCNumber base_lot_alloc_avl_qty() {
		return getConstNumber(offset + 39, $base_lot_alloc_avl_qty);
	}

	/**
	 * Allocatable qty. (Base/with lot number after subtraction) 引当可能数量（基／ロット指定有減算後）.<p>
	 *
	 */
	public void base_lot_alloc_avl_qty(MCNumber value) {
		setConstNumber(offset + 39, $base_lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Base/with lot number after subtraction) 引当可能数量（基／ロット指定有減算後）.<p>
	 *
	 */
	public void base_lot_alloc_avl_qty(int value) {
		setConstNumber(offset + 39, $base_lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Base/with lot number after subtraction) 引当可能数量（基／ロット指定有減算後）.<p>
	 *
	 */
	public void base_lot_alloc_avl_qty(long value) {
		setConstNumber(offset + 39, $base_lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Base/with lot number after subtraction) 引当可能数量（基／ロット指定有減算後）.<p>
	 *
	 */
	public void base_lot_alloc_avl_qty(float value) {
		setConstNumber(offset + 39, $base_lot_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Base/with lot number after subtraction) 引当可能数量（基／ロット指定有減算後）.<p>
	 *
	 */
	public void base_lot_alloc_avl_qty(double value) {
		setConstNumber(offset + 39, $base_lot_alloc_avl_qty, value);
	}


	/**
	 * Allocatable qty. (Base) 引当可能数量（基）.<p>
	 *
	 */
	public MCNumber base_alloc_avl_qty() {
		return getConstNumber(offset + 40, $base_alloc_avl_qty);
	}

	/**
	 * Allocatable qty. (Base) 引当可能数量（基）.<p>
	 *
	 */
	public void base_alloc_avl_qty(MCNumber value) {
		setConstNumber(offset + 40, $base_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Base) 引当可能数量（基）.<p>
	 *
	 */
	public void base_alloc_avl_qty(int value) {
		setConstNumber(offset + 40, $base_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Base) 引当可能数量（基）.<p>
	 *
	 */
	public void base_alloc_avl_qty(long value) {
		setConstNumber(offset + 40, $base_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Base) 引当可能数量（基）.<p>
	 *
	 */
	public void base_alloc_avl_qty(float value) {
		setConstNumber(offset + 40, $base_alloc_avl_qty, value);
	}

	/**
	 * Allocatable qty. (Base) 引当可能数量（基）.<p>
	 *
	 */
	public void base_alloc_avl_qty(double value) {
		setConstNumber(offset + 40, $base_alloc_avl_qty, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 41, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 41, $base_unit_nm, value);
	}


	/**
	 * Actual active ingredient (Inventory) 実際有効成分（在庫）.<p>
	 *
	 */
	public MCNumber stk_act_cont_qty() {
		return getConstNumber(offset + 42, $stk_act_cont_qty);
	}

	/**
	 * Actual active ingredient (Inventory) 実際有効成分（在庫）.<p>
	 *
	 */
	public void stk_act_cont_qty(MCNumber value) {
		setConstNumber(offset + 42, $stk_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (Inventory) 実際有効成分（在庫）.<p>
	 *
	 */
	public void stk_act_cont_qty(int value) {
		setConstNumber(offset + 42, $stk_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (Inventory) 実際有効成分（在庫）.<p>
	 *
	 */
	public void stk_act_cont_qty(long value) {
		setConstNumber(offset + 42, $stk_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (Inventory) 実際有効成分（在庫）.<p>
	 *
	 */
	public void stk_act_cont_qty(float value) {
		setConstNumber(offset + 42, $stk_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (Inventory) 実際有効成分（在庫）.<p>
	 *
	 */
	public void stk_act_cont_qty(double value) {
		setConstNumber(offset + 42, $stk_act_cont_qty, value);
	}


	/**
	 * Actual active ingredient (GR) 実際有効成分（入庫）.<p>
	 *
	 */
	public MCNumber schd_act_cont_qty() {
		return getConstNumber(offset + 43, $schd_act_cont_qty);
	}

	/**
	 * Actual active ingredient (GR) 実際有効成分（入庫）.<p>
	 *
	 */
	public void schd_act_cont_qty(MCNumber value) {
		setConstNumber(offset + 43, $schd_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (GR) 実際有効成分（入庫）.<p>
	 *
	 */
	public void schd_act_cont_qty(int value) {
		setConstNumber(offset + 43, $schd_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (GR) 実際有効成分（入庫）.<p>
	 *
	 */
	public void schd_act_cont_qty(long value) {
		setConstNumber(offset + 43, $schd_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (GR) 実際有効成分（入庫）.<p>
	 *
	 */
	public void schd_act_cont_qty(float value) {
		setConstNumber(offset + 43, $schd_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (GR) 実際有効成分（入庫）.<p>
	 *
	 */
	public void schd_act_cont_qty(double value) {
		setConstNumber(offset + 43, $schd_act_cont_qty, value);
	}


	/**
	 * Actual active ingredient (Allocation) 実際有効成分（引当）.<p>
	 *
	 */
	public MCNumber alloc_act_cont_qty() {
		return getConstNumber(offset + 44, $alloc_act_cont_qty);
	}

	/**
	 * Actual active ingredient (Allocation) 実際有効成分（引当）.<p>
	 *
	 */
	public void alloc_act_cont_qty(MCNumber value) {
		setConstNumber(offset + 44, $alloc_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (Allocation) 実際有効成分（引当）.<p>
	 *
	 */
	public void alloc_act_cont_qty(int value) {
		setConstNumber(offset + 44, $alloc_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (Allocation) 実際有効成分（引当）.<p>
	 *
	 */
	public void alloc_act_cont_qty(long value) {
		setConstNumber(offset + 44, $alloc_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (Allocation) 実際有効成分（引当）.<p>
	 *
	 */
	public void alloc_act_cont_qty(float value) {
		setConstNumber(offset + 44, $alloc_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (Allocation) 実際有効成分（引当）.<p>
	 *
	 */
	public void alloc_act_cont_qty(double value) {
		setConstNumber(offset + 44, $alloc_act_cont_qty, value);
	}


	/**
	 * Actual active ingredient (Pending) 実際有効成分（保留）.<p>
	 *
	 */
	public MCNumber wait_act_cont_qty() {
		return getConstNumber(offset + 45, $wait_act_cont_qty);
	}

	/**
	 * Actual active ingredient (Pending) 実際有効成分（保留）.<p>
	 *
	 */
	public void wait_act_cont_qty(MCNumber value) {
		setConstNumber(offset + 45, $wait_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (Pending) 実際有効成分（保留）.<p>
	 *
	 */
	public void wait_act_cont_qty(int value) {
		setConstNumber(offset + 45, $wait_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (Pending) 実際有効成分（保留）.<p>
	 *
	 */
	public void wait_act_cont_qty(long value) {
		setConstNumber(offset + 45, $wait_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (Pending) 実際有効成分（保留）.<p>
	 *
	 */
	public void wait_act_cont_qty(float value) {
		setConstNumber(offset + 45, $wait_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (Pending) 実際有効成分（保留）.<p>
	 *
	 */
	public void wait_act_cont_qty(double value) {
		setConstNumber(offset + 45, $wait_act_cont_qty, value);
	}


	/**
	 * Actual active ingredient (Allocatable/with lot number after subtraction) 実際有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public MCNumber lot_avl_act_cont_qty() {
		return getConstNumber(offset + 46, $lot_avl_act_cont_qty);
	}

	/**
	 * Actual active ingredient (Allocatable/with lot number after subtraction) 実際有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_avl_act_cont_qty(MCNumber value) {
		setConstNumber(offset + 46, $lot_avl_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (Allocatable/with lot number after subtraction) 実際有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_avl_act_cont_qty(int value) {
		setConstNumber(offset + 46, $lot_avl_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (Allocatable/with lot number after subtraction) 実際有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_avl_act_cont_qty(long value) {
		setConstNumber(offset + 46, $lot_avl_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (Allocatable/with lot number after subtraction) 実際有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_avl_act_cont_qty(float value) {
		setConstNumber(offset + 46, $lot_avl_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (Allocatable/with lot number after subtraction) 実際有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_avl_act_cont_qty(double value) {
		setConstNumber(offset + 46, $lot_avl_act_cont_qty, value);
	}


	/**
	 * Actual active ingredient (Allocatable) 実際有効成分（引当可）.<p>
	 *
	 */
	public MCNumber avl_act_cont_qty() {
		return getConstNumber(offset + 47, $avl_act_cont_qty);
	}

	/**
	 * Actual active ingredient (Allocatable) 実際有効成分（引当可）.<p>
	 *
	 */
	public void avl_act_cont_qty(MCNumber value) {
		setConstNumber(offset + 47, $avl_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (Allocatable) 実際有効成分（引当可）.<p>
	 *
	 */
	public void avl_act_cont_qty(int value) {
		setConstNumber(offset + 47, $avl_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (Allocatable) 実際有効成分（引当可）.<p>
	 *
	 */
	public void avl_act_cont_qty(long value) {
		setConstNumber(offset + 47, $avl_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (Allocatable) 実際有効成分（引当可）.<p>
	 *
	 */
	public void avl_act_cont_qty(float value) {
		setConstNumber(offset + 47, $avl_act_cont_qty, value);
	}

	/**
	 * Actual active ingredient (Allocatable) 実際有効成分（引当可）.<p>
	 *
	 */
	public void avl_act_cont_qty(double value) {
		setConstNumber(offset + 47, $avl_act_cont_qty, value);
	}


	/**
	 * Standard active ingredient (Inventory) 標準有効成分（在庫）.<p>
	 *
	 */
	public MCNumber stk_std_cont_qty() {
		return getConstNumber(offset + 48, $stk_std_cont_qty);
	}

	/**
	 * Standard active ingredient (Inventory) 標準有効成分（在庫）.<p>
	 *
	 */
	public void stk_std_cont_qty(MCNumber value) {
		setConstNumber(offset + 48, $stk_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (Inventory) 標準有効成分（在庫）.<p>
	 *
	 */
	public void stk_std_cont_qty(int value) {
		setConstNumber(offset + 48, $stk_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (Inventory) 標準有効成分（在庫）.<p>
	 *
	 */
	public void stk_std_cont_qty(long value) {
		setConstNumber(offset + 48, $stk_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (Inventory) 標準有効成分（在庫）.<p>
	 *
	 */
	public void stk_std_cont_qty(float value) {
		setConstNumber(offset + 48, $stk_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (Inventory) 標準有効成分（在庫）.<p>
	 *
	 */
	public void stk_std_cont_qty(double value) {
		setConstNumber(offset + 48, $stk_std_cont_qty, value);
	}


	/**
	 * Standard active ingredient (GR) 標準有効成分（入庫）.<p>
	 *
	 */
	public MCNumber schd_std_cont_qty() {
		return getConstNumber(offset + 49, $schd_std_cont_qty);
	}

	/**
	 * Standard active ingredient (GR) 標準有効成分（入庫）.<p>
	 *
	 */
	public void schd_std_cont_qty(MCNumber value) {
		setConstNumber(offset + 49, $schd_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (GR) 標準有効成分（入庫）.<p>
	 *
	 */
	public void schd_std_cont_qty(int value) {
		setConstNumber(offset + 49, $schd_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (GR) 標準有効成分（入庫）.<p>
	 *
	 */
	public void schd_std_cont_qty(long value) {
		setConstNumber(offset + 49, $schd_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (GR) 標準有効成分（入庫）.<p>
	 *
	 */
	public void schd_std_cont_qty(float value) {
		setConstNumber(offset + 49, $schd_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (GR) 標準有効成分（入庫）.<p>
	 *
	 */
	public void schd_std_cont_qty(double value) {
		setConstNumber(offset + 49, $schd_std_cont_qty, value);
	}


	/**
	 * Standard active ingredient (Allocation) 標準有効成分（引当）.<p>
	 *
	 */
	public MCNumber alloc_std_cont_qty() {
		return getConstNumber(offset + 50, $alloc_std_cont_qty);
	}

	/**
	 * Standard active ingredient (Allocation) 標準有効成分（引当）.<p>
	 *
	 */
	public void alloc_std_cont_qty(MCNumber value) {
		setConstNumber(offset + 50, $alloc_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (Allocation) 標準有効成分（引当）.<p>
	 *
	 */
	public void alloc_std_cont_qty(int value) {
		setConstNumber(offset + 50, $alloc_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (Allocation) 標準有効成分（引当）.<p>
	 *
	 */
	public void alloc_std_cont_qty(long value) {
		setConstNumber(offset + 50, $alloc_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (Allocation) 標準有効成分（引当）.<p>
	 *
	 */
	public void alloc_std_cont_qty(float value) {
		setConstNumber(offset + 50, $alloc_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (Allocation) 標準有効成分（引当）.<p>
	 *
	 */
	public void alloc_std_cont_qty(double value) {
		setConstNumber(offset + 50, $alloc_std_cont_qty, value);
	}


	/**
	 * Standard active ingredient (Pending) 標準有効成分（保留）.<p>
	 *
	 */
	public MCNumber wait_std_cont_qty() {
		return getConstNumber(offset + 51, $wait_std_cont_qty);
	}

	/**
	 * Standard active ingredient (Pending) 標準有効成分（保留）.<p>
	 *
	 */
	public void wait_std_cont_qty(MCNumber value) {
		setConstNumber(offset + 51, $wait_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (Pending) 標準有効成分（保留）.<p>
	 *
	 */
	public void wait_std_cont_qty(int value) {
		setConstNumber(offset + 51, $wait_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (Pending) 標準有効成分（保留）.<p>
	 *
	 */
	public void wait_std_cont_qty(long value) {
		setConstNumber(offset + 51, $wait_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (Pending) 標準有効成分（保留）.<p>
	 *
	 */
	public void wait_std_cont_qty(float value) {
		setConstNumber(offset + 51, $wait_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (Pending) 標準有効成分（保留）.<p>
	 *
	 */
	public void wait_std_cont_qty(double value) {
		setConstNumber(offset + 51, $wait_std_cont_qty, value);
	}


	/**
	 * Standard active ingredient (Allocatable/with lot number after subtraction) 標準有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public MCNumber lot_avl_std_cont_qty() {
		return getConstNumber(offset + 52, $lot_avl_std_cont_qty);
	}

	/**
	 * Standard active ingredient (Allocatable/with lot number after subtraction) 標準有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_avl_std_cont_qty(MCNumber value) {
		setConstNumber(offset + 52, $lot_avl_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (Allocatable/with lot number after subtraction) 標準有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_avl_std_cont_qty(int value) {
		setConstNumber(offset + 52, $lot_avl_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (Allocatable/with lot number after subtraction) 標準有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_avl_std_cont_qty(long value) {
		setConstNumber(offset + 52, $lot_avl_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (Allocatable/with lot number after subtraction) 標準有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_avl_std_cont_qty(float value) {
		setConstNumber(offset + 52, $lot_avl_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (Allocatable/with lot number after subtraction) 標準有効成分（引当可／ロット指定有減算後）.<p>
	 *
	 */
	public void lot_avl_std_cont_qty(double value) {
		setConstNumber(offset + 52, $lot_avl_std_cont_qty, value);
	}


	/**
	 * Standard active ingredient (Allocatable) 標準有効成分（引当可）.<p>
	 *
	 */
	public MCNumber avl_std_cont_qty() {
		return getConstNumber(offset + 53, $avl_std_cont_qty);
	}

	/**
	 * Standard active ingredient (Allocatable) 標準有効成分（引当可）.<p>
	 *
	 */
	public void avl_std_cont_qty(MCNumber value) {
		setConstNumber(offset + 53, $avl_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (Allocatable) 標準有効成分（引当可）.<p>
	 *
	 */
	public void avl_std_cont_qty(int value) {
		setConstNumber(offset + 53, $avl_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (Allocatable) 標準有効成分（引当可）.<p>
	 *
	 */
	public void avl_std_cont_qty(long value) {
		setConstNumber(offset + 53, $avl_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (Allocatable) 標準有効成分（引当可）.<p>
	 *
	 */
	public void avl_std_cont_qty(float value) {
		setConstNumber(offset + 53, $avl_std_cont_qty, value);
	}

	/**
	 * Standard active ingredient (Allocatable) 標準有効成分（引当可）.<p>
	 *
	 */
	public void avl_std_cont_qty(double value) {
		setConstNumber(offset + 53, $avl_std_cont_qty, value);
	}


	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 54, $cont_fctr_unit_cd);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 54, $cont_fctr_unit_cd, value);
	}


	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public String cont_fctr_unit_nm() {
		return getConstString(offset + 55, $cont_fctr_unit_nm);
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public void cont_fctr_unit_nm(String value) {
		setConstString(offset + 55, $cont_fctr_unit_nm, value);
	}


	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public String plnt_aprv_sts_typ_nm() {
		return getConstString(offset + 56, $plnt_aprv_sts_typ_nm);
	}

	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public void plnt_aprv_sts_typ_nm(String value) {
		setConstString(offset + 56, $plnt_aprv_sts_typ_nm, value);
	}


	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public String mrkt_judg_sts_typ_nm() {
		return getConstString(offset + 57, $mrkt_judg_sts_typ_nm);
	}

	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_nm(String value) {
		setConstString(offset + 57, $mrkt_judg_sts_typ_nm, value);
	}


	/**
	 * Scheduled inventory type 予定在庫区分.<p>
	 *
	 */
	public String schd_stk_typ() {
		return getConstString(offset + 58, $schd_stk_typ);
	}

	/**
	 * Scheduled inventory type 予定在庫区分.<p>
	 *
	 */
	public void schd_stk_typ(String value) {
		setConstString(offset + 58, $schd_stk_typ, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($sundry_itm_nm.equalsIgnoreCase(name)) {
			return sundry_itm_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
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
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
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
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			return in_xfr_typ_nm();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
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
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ_nm();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
		}
		if ($schd_stk_typ.equalsIgnoreCase(name)) {
			return schd_stk_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($pack_stk_qty.equalsIgnoreCase(name)) {
			return pack_stk_qty();
		}
		if ($pack_gr_schd_qty.equalsIgnoreCase(name)) {
			return pack_gr_schd_qty();
		}
		if ($pack_alloc_qty.equalsIgnoreCase(name)) {
			return pack_alloc_qty();
		}
		if ($pack_wait_qty.equalsIgnoreCase(name)) {
			return pack_wait_qty();
		}
		if ($pack_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			return pack_lot_alloc_avl_qty();
		}
		if ($pack_alloc_avl_qty.equalsIgnoreCase(name)) {
			return pack_alloc_avl_qty();
		}
		if ($base_stk_qty.equalsIgnoreCase(name)) {
			return base_stk_qty();
		}
		if ($base_gr_schd_qty.equalsIgnoreCase(name)) {
			return base_gr_schd_qty();
		}
		if ($base_alloc_qty.equalsIgnoreCase(name)) {
			return base_alloc_qty();
		}
		if ($base_wait_qty.equalsIgnoreCase(name)) {
			return base_wait_qty();
		}
		if ($base_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			return base_lot_alloc_avl_qty();
		}
		if ($base_alloc_avl_qty.equalsIgnoreCase(name)) {
			return base_alloc_avl_qty();
		}
		if ($stk_act_cont_qty.equalsIgnoreCase(name)) {
			return stk_act_cont_qty();
		}
		if ($schd_act_cont_qty.equalsIgnoreCase(name)) {
			return schd_act_cont_qty();
		}
		if ($alloc_act_cont_qty.equalsIgnoreCase(name)) {
			return alloc_act_cont_qty();
		}
		if ($wait_act_cont_qty.equalsIgnoreCase(name)) {
			return wait_act_cont_qty();
		}
		if ($lot_avl_act_cont_qty.equalsIgnoreCase(name)) {
			return lot_avl_act_cont_qty();
		}
		if ($avl_act_cont_qty.equalsIgnoreCase(name)) {
			return avl_act_cont_qty();
		}
		if ($stk_std_cont_qty.equalsIgnoreCase(name)) {
			return stk_std_cont_qty();
		}
		if ($schd_std_cont_qty.equalsIgnoreCase(name)) {
			return schd_std_cont_qty();
		}
		if ($alloc_std_cont_qty.equalsIgnoreCase(name)) {
			return alloc_std_cont_qty();
		}
		if ($wait_std_cont_qty.equalsIgnoreCase(name)) {
			return wait_std_cont_qty();
		}
		if ($lot_avl_std_cont_qty.equalsIgnoreCase(name)) {
			return lot_avl_std_cont_qty();
		}
		if ($avl_std_cont_qty.equalsIgnoreCase(name)) {
			return avl_std_cont_qty();
		}
		return super.getNumber(name);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($sundry_itm_nm.equalsIgnoreCase(name)) {
			return sundry_itm_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
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
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
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
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			return in_xfr_typ_nm();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
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
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ_nm();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
		}
		if ($schd_stk_typ.equalsIgnoreCase(name)) {
			return schd_stk_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($pack_stk_qty.equalsIgnoreCase(name)) {
			return pack_stk_qty();
		}
		if ($pack_gr_schd_qty.equalsIgnoreCase(name)) {
			return pack_gr_schd_qty();
		}
		if ($pack_alloc_qty.equalsIgnoreCase(name)) {
			return pack_alloc_qty();
		}
		if ($pack_wait_qty.equalsIgnoreCase(name)) {
			return pack_wait_qty();
		}
		if ($pack_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			return pack_lot_alloc_avl_qty();
		}
		if ($pack_alloc_avl_qty.equalsIgnoreCase(name)) {
			return pack_alloc_avl_qty();
		}
		if ($base_stk_qty.equalsIgnoreCase(name)) {
			return base_stk_qty();
		}
		if ($base_gr_schd_qty.equalsIgnoreCase(name)) {
			return base_gr_schd_qty();
		}
		if ($base_alloc_qty.equalsIgnoreCase(name)) {
			return base_alloc_qty();
		}
		if ($base_wait_qty.equalsIgnoreCase(name)) {
			return base_wait_qty();
		}
		if ($base_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			return base_lot_alloc_avl_qty();
		}
		if ($base_alloc_avl_qty.equalsIgnoreCase(name)) {
			return base_alloc_avl_qty();
		}
		if ($stk_act_cont_qty.equalsIgnoreCase(name)) {
			return stk_act_cont_qty();
		}
		if ($schd_act_cont_qty.equalsIgnoreCase(name)) {
			return schd_act_cont_qty();
		}
		if ($alloc_act_cont_qty.equalsIgnoreCase(name)) {
			return alloc_act_cont_qty();
		}
		if ($wait_act_cont_qty.equalsIgnoreCase(name)) {
			return wait_act_cont_qty();
		}
		if ($lot_avl_act_cont_qty.equalsIgnoreCase(name)) {
			return lot_avl_act_cont_qty();
		}
		if ($avl_act_cont_qty.equalsIgnoreCase(name)) {
			return avl_act_cont_qty();
		}
		if ($stk_std_cont_qty.equalsIgnoreCase(name)) {
			return stk_std_cont_qty();
		}
		if ($schd_std_cont_qty.equalsIgnoreCase(name)) {
			return schd_std_cont_qty();
		}
		if ($alloc_std_cont_qty.equalsIgnoreCase(name)) {
			return alloc_std_cont_qty();
		}
		if ($wait_std_cont_qty.equalsIgnoreCase(name)) {
			return wait_std_cont_qty();
		}
		if ($lot_avl_std_cont_qty.equalsIgnoreCase(name)) {
			return lot_avl_std_cont_qty();
		}
		if ($avl_std_cont_qty.equalsIgnoreCase(name)) {
			return avl_std_cont_qty();
		}
		return super.getNumberNE(name);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($sundry_itm_nm.equalsIgnoreCase(name)) {
			sundry_itm_nm(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
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
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
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
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			in_xfr_typ_nm(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
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
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
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
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
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
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ_nm(value);
			return;
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_nm(value);
			return;
		}
		if ($schd_stk_typ.equalsIgnoreCase(name)) {
			schd_stk_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($pack_stk_qty.equalsIgnoreCase(name)) {
			pack_stk_qty(value);
			return;
		}
		if ($pack_gr_schd_qty.equalsIgnoreCase(name)) {
			pack_gr_schd_qty(value);
			return;
		}
		if ($pack_alloc_qty.equalsIgnoreCase(name)) {
			pack_alloc_qty(value);
			return;
		}
		if ($pack_wait_qty.equalsIgnoreCase(name)) {
			pack_wait_qty(value);
			return;
		}
		if ($pack_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			pack_lot_alloc_avl_qty(value);
			return;
		}
		if ($pack_alloc_avl_qty.equalsIgnoreCase(name)) {
			pack_alloc_avl_qty(value);
			return;
		}
		if ($base_stk_qty.equalsIgnoreCase(name)) {
			base_stk_qty(value);
			return;
		}
		if ($base_gr_schd_qty.equalsIgnoreCase(name)) {
			base_gr_schd_qty(value);
			return;
		}
		if ($base_alloc_qty.equalsIgnoreCase(name)) {
			base_alloc_qty(value);
			return;
		}
		if ($base_wait_qty.equalsIgnoreCase(name)) {
			base_wait_qty(value);
			return;
		}
		if ($base_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			base_lot_alloc_avl_qty(value);
			return;
		}
		if ($base_alloc_avl_qty.equalsIgnoreCase(name)) {
			base_alloc_avl_qty(value);
			return;
		}
		if ($stk_act_cont_qty.equalsIgnoreCase(name)) {
			stk_act_cont_qty(value);
			return;
		}
		if ($schd_act_cont_qty.equalsIgnoreCase(name)) {
			schd_act_cont_qty(value);
			return;
		}
		if ($alloc_act_cont_qty.equalsIgnoreCase(name)) {
			alloc_act_cont_qty(value);
			return;
		}
		if ($wait_act_cont_qty.equalsIgnoreCase(name)) {
			wait_act_cont_qty(value);
			return;
		}
		if ($lot_avl_act_cont_qty.equalsIgnoreCase(name)) {
			lot_avl_act_cont_qty(value);
			return;
		}
		if ($avl_act_cont_qty.equalsIgnoreCase(name)) {
			avl_act_cont_qty(value);
			return;
		}
		if ($stk_std_cont_qty.equalsIgnoreCase(name)) {
			stk_std_cont_qty(value);
			return;
		}
		if ($schd_std_cont_qty.equalsIgnoreCase(name)) {
			schd_std_cont_qty(value);
			return;
		}
		if ($alloc_std_cont_qty.equalsIgnoreCase(name)) {
			alloc_std_cont_qty(value);
			return;
		}
		if ($wait_std_cont_qty.equalsIgnoreCase(name)) {
			wait_std_cont_qty(value);
			return;
		}
		if ($lot_avl_std_cont_qty.equalsIgnoreCase(name)) {
			lot_avl_std_cont_qty(value);
			return;
		}
		if ($avl_std_cont_qty.equalsIgnoreCase(name)) {
			avl_std_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pack_stk_qty.equalsIgnoreCase(name)) {
			pack_stk_qty(value);
			return;
		}
		if ($pack_gr_schd_qty.equalsIgnoreCase(name)) {
			pack_gr_schd_qty(value);
			return;
		}
		if ($pack_alloc_qty.equalsIgnoreCase(name)) {
			pack_alloc_qty(value);
			return;
		}
		if ($pack_wait_qty.equalsIgnoreCase(name)) {
			pack_wait_qty(value);
			return;
		}
		if ($pack_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			pack_lot_alloc_avl_qty(value);
			return;
		}
		if ($pack_alloc_avl_qty.equalsIgnoreCase(name)) {
			pack_alloc_avl_qty(value);
			return;
		}
		if ($base_stk_qty.equalsIgnoreCase(name)) {
			base_stk_qty(value);
			return;
		}
		if ($base_gr_schd_qty.equalsIgnoreCase(name)) {
			base_gr_schd_qty(value);
			return;
		}
		if ($base_alloc_qty.equalsIgnoreCase(name)) {
			base_alloc_qty(value);
			return;
		}
		if ($base_wait_qty.equalsIgnoreCase(name)) {
			base_wait_qty(value);
			return;
		}
		if ($base_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			base_lot_alloc_avl_qty(value);
			return;
		}
		if ($base_alloc_avl_qty.equalsIgnoreCase(name)) {
			base_alloc_avl_qty(value);
			return;
		}
		if ($stk_act_cont_qty.equalsIgnoreCase(name)) {
			stk_act_cont_qty(value);
			return;
		}
		if ($schd_act_cont_qty.equalsIgnoreCase(name)) {
			schd_act_cont_qty(value);
			return;
		}
		if ($alloc_act_cont_qty.equalsIgnoreCase(name)) {
			alloc_act_cont_qty(value);
			return;
		}
		if ($wait_act_cont_qty.equalsIgnoreCase(name)) {
			wait_act_cont_qty(value);
			return;
		}
		if ($lot_avl_act_cont_qty.equalsIgnoreCase(name)) {
			lot_avl_act_cont_qty(value);
			return;
		}
		if ($avl_act_cont_qty.equalsIgnoreCase(name)) {
			avl_act_cont_qty(value);
			return;
		}
		if ($stk_std_cont_qty.equalsIgnoreCase(name)) {
			stk_std_cont_qty(value);
			return;
		}
		if ($schd_std_cont_qty.equalsIgnoreCase(name)) {
			schd_std_cont_qty(value);
			return;
		}
		if ($alloc_std_cont_qty.equalsIgnoreCase(name)) {
			alloc_std_cont_qty(value);
			return;
		}
		if ($wait_std_cont_qty.equalsIgnoreCase(name)) {
			wait_std_cont_qty(value);
			return;
		}
		if ($lot_avl_std_cont_qty.equalsIgnoreCase(name)) {
			lot_avl_std_cont_qty(value);
			return;
		}
		if ($avl_std_cont_qty.equalsIgnoreCase(name)) {
			avl_std_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pack_stk_qty.equalsIgnoreCase(name)) {
			pack_stk_qty(value);
			return;
		}
		if ($pack_gr_schd_qty.equalsIgnoreCase(name)) {
			pack_gr_schd_qty(value);
			return;
		}
		if ($pack_alloc_qty.equalsIgnoreCase(name)) {
			pack_alloc_qty(value);
			return;
		}
		if ($pack_wait_qty.equalsIgnoreCase(name)) {
			pack_wait_qty(value);
			return;
		}
		if ($pack_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			pack_lot_alloc_avl_qty(value);
			return;
		}
		if ($pack_alloc_avl_qty.equalsIgnoreCase(name)) {
			pack_alloc_avl_qty(value);
			return;
		}
		if ($base_stk_qty.equalsIgnoreCase(name)) {
			base_stk_qty(value);
			return;
		}
		if ($base_gr_schd_qty.equalsIgnoreCase(name)) {
			base_gr_schd_qty(value);
			return;
		}
		if ($base_alloc_qty.equalsIgnoreCase(name)) {
			base_alloc_qty(value);
			return;
		}
		if ($base_wait_qty.equalsIgnoreCase(name)) {
			base_wait_qty(value);
			return;
		}
		if ($base_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			base_lot_alloc_avl_qty(value);
			return;
		}
		if ($base_alloc_avl_qty.equalsIgnoreCase(name)) {
			base_alloc_avl_qty(value);
			return;
		}
		if ($stk_act_cont_qty.equalsIgnoreCase(name)) {
			stk_act_cont_qty(value);
			return;
		}
		if ($schd_act_cont_qty.equalsIgnoreCase(name)) {
			schd_act_cont_qty(value);
			return;
		}
		if ($alloc_act_cont_qty.equalsIgnoreCase(name)) {
			alloc_act_cont_qty(value);
			return;
		}
		if ($wait_act_cont_qty.equalsIgnoreCase(name)) {
			wait_act_cont_qty(value);
			return;
		}
		if ($lot_avl_act_cont_qty.equalsIgnoreCase(name)) {
			lot_avl_act_cont_qty(value);
			return;
		}
		if ($avl_act_cont_qty.equalsIgnoreCase(name)) {
			avl_act_cont_qty(value);
			return;
		}
		if ($stk_std_cont_qty.equalsIgnoreCase(name)) {
			stk_std_cont_qty(value);
			return;
		}
		if ($schd_std_cont_qty.equalsIgnoreCase(name)) {
			schd_std_cont_qty(value);
			return;
		}
		if ($alloc_std_cont_qty.equalsIgnoreCase(name)) {
			alloc_std_cont_qty(value);
			return;
		}
		if ($wait_std_cont_qty.equalsIgnoreCase(name)) {
			wait_std_cont_qty(value);
			return;
		}
		if ($lot_avl_std_cont_qty.equalsIgnoreCase(name)) {
			lot_avl_std_cont_qty(value);
			return;
		}
		if ($avl_std_cont_qty.equalsIgnoreCase(name)) {
			avl_std_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pack_stk_qty.equalsIgnoreCase(name)) {
			pack_stk_qty(value);
			return;
		}
		if ($pack_gr_schd_qty.equalsIgnoreCase(name)) {
			pack_gr_schd_qty(value);
			return;
		}
		if ($pack_alloc_qty.equalsIgnoreCase(name)) {
			pack_alloc_qty(value);
			return;
		}
		if ($pack_wait_qty.equalsIgnoreCase(name)) {
			pack_wait_qty(value);
			return;
		}
		if ($pack_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			pack_lot_alloc_avl_qty(value);
			return;
		}
		if ($pack_alloc_avl_qty.equalsIgnoreCase(name)) {
			pack_alloc_avl_qty(value);
			return;
		}
		if ($base_stk_qty.equalsIgnoreCase(name)) {
			base_stk_qty(value);
			return;
		}
		if ($base_gr_schd_qty.equalsIgnoreCase(name)) {
			base_gr_schd_qty(value);
			return;
		}
		if ($base_alloc_qty.equalsIgnoreCase(name)) {
			base_alloc_qty(value);
			return;
		}
		if ($base_wait_qty.equalsIgnoreCase(name)) {
			base_wait_qty(value);
			return;
		}
		if ($base_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			base_lot_alloc_avl_qty(value);
			return;
		}
		if ($base_alloc_avl_qty.equalsIgnoreCase(name)) {
			base_alloc_avl_qty(value);
			return;
		}
		if ($stk_act_cont_qty.equalsIgnoreCase(name)) {
			stk_act_cont_qty(value);
			return;
		}
		if ($schd_act_cont_qty.equalsIgnoreCase(name)) {
			schd_act_cont_qty(value);
			return;
		}
		if ($alloc_act_cont_qty.equalsIgnoreCase(name)) {
			alloc_act_cont_qty(value);
			return;
		}
		if ($wait_act_cont_qty.equalsIgnoreCase(name)) {
			wait_act_cont_qty(value);
			return;
		}
		if ($lot_avl_act_cont_qty.equalsIgnoreCase(name)) {
			lot_avl_act_cont_qty(value);
			return;
		}
		if ($avl_act_cont_qty.equalsIgnoreCase(name)) {
			avl_act_cont_qty(value);
			return;
		}
		if ($stk_std_cont_qty.equalsIgnoreCase(name)) {
			stk_std_cont_qty(value);
			return;
		}
		if ($schd_std_cont_qty.equalsIgnoreCase(name)) {
			schd_std_cont_qty(value);
			return;
		}
		if ($alloc_std_cont_qty.equalsIgnoreCase(name)) {
			alloc_std_cont_qty(value);
			return;
		}
		if ($wait_std_cont_qty.equalsIgnoreCase(name)) {
			wait_std_cont_qty(value);
			return;
		}
		if ($lot_avl_std_cont_qty.equalsIgnoreCase(name)) {
			lot_avl_std_cont_qty(value);
			return;
		}
		if ($avl_std_cont_qty.equalsIgnoreCase(name)) {
			avl_std_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pack_stk_qty.equalsIgnoreCase(name)) {
			pack_stk_qty(value);
			return;
		}
		if ($pack_gr_schd_qty.equalsIgnoreCase(name)) {
			pack_gr_schd_qty(value);
			return;
		}
		if ($pack_alloc_qty.equalsIgnoreCase(name)) {
			pack_alloc_qty(value);
			return;
		}
		if ($pack_wait_qty.equalsIgnoreCase(name)) {
			pack_wait_qty(value);
			return;
		}
		if ($pack_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			pack_lot_alloc_avl_qty(value);
			return;
		}
		if ($pack_alloc_avl_qty.equalsIgnoreCase(name)) {
			pack_alloc_avl_qty(value);
			return;
		}
		if ($base_stk_qty.equalsIgnoreCase(name)) {
			base_stk_qty(value);
			return;
		}
		if ($base_gr_schd_qty.equalsIgnoreCase(name)) {
			base_gr_schd_qty(value);
			return;
		}
		if ($base_alloc_qty.equalsIgnoreCase(name)) {
			base_alloc_qty(value);
			return;
		}
		if ($base_wait_qty.equalsIgnoreCase(name)) {
			base_wait_qty(value);
			return;
		}
		if ($base_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			base_lot_alloc_avl_qty(value);
			return;
		}
		if ($base_alloc_avl_qty.equalsIgnoreCase(name)) {
			base_alloc_avl_qty(value);
			return;
		}
		if ($stk_act_cont_qty.equalsIgnoreCase(name)) {
			stk_act_cont_qty(value);
			return;
		}
		if ($schd_act_cont_qty.equalsIgnoreCase(name)) {
			schd_act_cont_qty(value);
			return;
		}
		if ($alloc_act_cont_qty.equalsIgnoreCase(name)) {
			alloc_act_cont_qty(value);
			return;
		}
		if ($wait_act_cont_qty.equalsIgnoreCase(name)) {
			wait_act_cont_qty(value);
			return;
		}
		if ($lot_avl_act_cont_qty.equalsIgnoreCase(name)) {
			lot_avl_act_cont_qty(value);
			return;
		}
		if ($avl_act_cont_qty.equalsIgnoreCase(name)) {
			avl_act_cont_qty(value);
			return;
		}
		if ($stk_std_cont_qty.equalsIgnoreCase(name)) {
			stk_std_cont_qty(value);
			return;
		}
		if ($schd_std_cont_qty.equalsIgnoreCase(name)) {
			schd_std_cont_qty(value);
			return;
		}
		if ($alloc_std_cont_qty.equalsIgnoreCase(name)) {
			alloc_std_cont_qty(value);
			return;
		}
		if ($wait_std_cont_qty.equalsIgnoreCase(name)) {
			wait_std_cont_qty(value);
			return;
		}
		if ($lot_avl_std_cont_qty.equalsIgnoreCase(name)) {
			lot_avl_std_cont_qty(value);
			return;
		}
		if ($avl_std_cont_qty.equalsIgnoreCase(name)) {
			avl_std_cont_qty(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($sundry_itm_nm.equalsIgnoreCase(name)) {
			sundry_itm_nm(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
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
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
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
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			in_xfr_typ_nm(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
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
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
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
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
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
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ_nm(value);
			return;
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_nm(value);
			return;
		}
		if ($schd_stk_typ.equalsIgnoreCase(name)) {
			schd_stk_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($pack_stk_qty.equalsIgnoreCase(name)) {
			pack_stk_qty(value);
			return;
		}
		if ($pack_gr_schd_qty.equalsIgnoreCase(name)) {
			pack_gr_schd_qty(value);
			return;
		}
		if ($pack_alloc_qty.equalsIgnoreCase(name)) {
			pack_alloc_qty(value);
			return;
		}
		if ($pack_wait_qty.equalsIgnoreCase(name)) {
			pack_wait_qty(value);
			return;
		}
		if ($pack_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			pack_lot_alloc_avl_qty(value);
			return;
		}
		if ($pack_alloc_avl_qty.equalsIgnoreCase(name)) {
			pack_alloc_avl_qty(value);
			return;
		}
		if ($base_stk_qty.equalsIgnoreCase(name)) {
			base_stk_qty(value);
			return;
		}
		if ($base_gr_schd_qty.equalsIgnoreCase(name)) {
			base_gr_schd_qty(value);
			return;
		}
		if ($base_alloc_qty.equalsIgnoreCase(name)) {
			base_alloc_qty(value);
			return;
		}
		if ($base_wait_qty.equalsIgnoreCase(name)) {
			base_wait_qty(value);
			return;
		}
		if ($base_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			base_lot_alloc_avl_qty(value);
			return;
		}
		if ($base_alloc_avl_qty.equalsIgnoreCase(name)) {
			base_alloc_avl_qty(value);
			return;
		}
		if ($stk_act_cont_qty.equalsIgnoreCase(name)) {
			stk_act_cont_qty(value);
			return;
		}
		if ($schd_act_cont_qty.equalsIgnoreCase(name)) {
			schd_act_cont_qty(value);
			return;
		}
		if ($alloc_act_cont_qty.equalsIgnoreCase(name)) {
			alloc_act_cont_qty(value);
			return;
		}
		if ($wait_act_cont_qty.equalsIgnoreCase(name)) {
			wait_act_cont_qty(value);
			return;
		}
		if ($lot_avl_act_cont_qty.equalsIgnoreCase(name)) {
			lot_avl_act_cont_qty(value);
			return;
		}
		if ($avl_act_cont_qty.equalsIgnoreCase(name)) {
			avl_act_cont_qty(value);
			return;
		}
		if ($stk_std_cont_qty.equalsIgnoreCase(name)) {
			stk_std_cont_qty(value);
			return;
		}
		if ($schd_std_cont_qty.equalsIgnoreCase(name)) {
			schd_std_cont_qty(value);
			return;
		}
		if ($alloc_std_cont_qty.equalsIgnoreCase(name)) {
			alloc_std_cont_qty(value);
			return;
		}
		if ($wait_std_cont_qty.equalsIgnoreCase(name)) {
			wait_std_cont_qty(value);
			return;
		}
		if ($lot_avl_std_cont_qty.equalsIgnoreCase(name)) {
			lot_avl_std_cont_qty(value);
			return;
		}
		if ($avl_std_cont_qty.equalsIgnoreCase(name)) {
			avl_std_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pack_stk_qty.equalsIgnoreCase(name)) {
			pack_stk_qty(value);
			return;
		}
		if ($pack_gr_schd_qty.equalsIgnoreCase(name)) {
			pack_gr_schd_qty(value);
			return;
		}
		if ($pack_alloc_qty.equalsIgnoreCase(name)) {
			pack_alloc_qty(value);
			return;
		}
		if ($pack_wait_qty.equalsIgnoreCase(name)) {
			pack_wait_qty(value);
			return;
		}
		if ($pack_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			pack_lot_alloc_avl_qty(value);
			return;
		}
		if ($pack_alloc_avl_qty.equalsIgnoreCase(name)) {
			pack_alloc_avl_qty(value);
			return;
		}
		if ($base_stk_qty.equalsIgnoreCase(name)) {
			base_stk_qty(value);
			return;
		}
		if ($base_gr_schd_qty.equalsIgnoreCase(name)) {
			base_gr_schd_qty(value);
			return;
		}
		if ($base_alloc_qty.equalsIgnoreCase(name)) {
			base_alloc_qty(value);
			return;
		}
		if ($base_wait_qty.equalsIgnoreCase(name)) {
			base_wait_qty(value);
			return;
		}
		if ($base_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			base_lot_alloc_avl_qty(value);
			return;
		}
		if ($base_alloc_avl_qty.equalsIgnoreCase(name)) {
			base_alloc_avl_qty(value);
			return;
		}
		if ($stk_act_cont_qty.equalsIgnoreCase(name)) {
			stk_act_cont_qty(value);
			return;
		}
		if ($schd_act_cont_qty.equalsIgnoreCase(name)) {
			schd_act_cont_qty(value);
			return;
		}
		if ($alloc_act_cont_qty.equalsIgnoreCase(name)) {
			alloc_act_cont_qty(value);
			return;
		}
		if ($wait_act_cont_qty.equalsIgnoreCase(name)) {
			wait_act_cont_qty(value);
			return;
		}
		if ($lot_avl_act_cont_qty.equalsIgnoreCase(name)) {
			lot_avl_act_cont_qty(value);
			return;
		}
		if ($avl_act_cont_qty.equalsIgnoreCase(name)) {
			avl_act_cont_qty(value);
			return;
		}
		if ($stk_std_cont_qty.equalsIgnoreCase(name)) {
			stk_std_cont_qty(value);
			return;
		}
		if ($schd_std_cont_qty.equalsIgnoreCase(name)) {
			schd_std_cont_qty(value);
			return;
		}
		if ($alloc_std_cont_qty.equalsIgnoreCase(name)) {
			alloc_std_cont_qty(value);
			return;
		}
		if ($wait_std_cont_qty.equalsIgnoreCase(name)) {
			wait_std_cont_qty(value);
			return;
		}
		if ($lot_avl_std_cont_qty.equalsIgnoreCase(name)) {
			lot_avl_std_cont_qty(value);
			return;
		}
		if ($avl_std_cont_qty.equalsIgnoreCase(name)) {
			avl_std_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pack_stk_qty.equalsIgnoreCase(name)) {
			pack_stk_qty(value);
			return;
		}
		if ($pack_gr_schd_qty.equalsIgnoreCase(name)) {
			pack_gr_schd_qty(value);
			return;
		}
		if ($pack_alloc_qty.equalsIgnoreCase(name)) {
			pack_alloc_qty(value);
			return;
		}
		if ($pack_wait_qty.equalsIgnoreCase(name)) {
			pack_wait_qty(value);
			return;
		}
		if ($pack_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			pack_lot_alloc_avl_qty(value);
			return;
		}
		if ($pack_alloc_avl_qty.equalsIgnoreCase(name)) {
			pack_alloc_avl_qty(value);
			return;
		}
		if ($base_stk_qty.equalsIgnoreCase(name)) {
			base_stk_qty(value);
			return;
		}
		if ($base_gr_schd_qty.equalsIgnoreCase(name)) {
			base_gr_schd_qty(value);
			return;
		}
		if ($base_alloc_qty.equalsIgnoreCase(name)) {
			base_alloc_qty(value);
			return;
		}
		if ($base_wait_qty.equalsIgnoreCase(name)) {
			base_wait_qty(value);
			return;
		}
		if ($base_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			base_lot_alloc_avl_qty(value);
			return;
		}
		if ($base_alloc_avl_qty.equalsIgnoreCase(name)) {
			base_alloc_avl_qty(value);
			return;
		}
		if ($stk_act_cont_qty.equalsIgnoreCase(name)) {
			stk_act_cont_qty(value);
			return;
		}
		if ($schd_act_cont_qty.equalsIgnoreCase(name)) {
			schd_act_cont_qty(value);
			return;
		}
		if ($alloc_act_cont_qty.equalsIgnoreCase(name)) {
			alloc_act_cont_qty(value);
			return;
		}
		if ($wait_act_cont_qty.equalsIgnoreCase(name)) {
			wait_act_cont_qty(value);
			return;
		}
		if ($lot_avl_act_cont_qty.equalsIgnoreCase(name)) {
			lot_avl_act_cont_qty(value);
			return;
		}
		if ($avl_act_cont_qty.equalsIgnoreCase(name)) {
			avl_act_cont_qty(value);
			return;
		}
		if ($stk_std_cont_qty.equalsIgnoreCase(name)) {
			stk_std_cont_qty(value);
			return;
		}
		if ($schd_std_cont_qty.equalsIgnoreCase(name)) {
			schd_std_cont_qty(value);
			return;
		}
		if ($alloc_std_cont_qty.equalsIgnoreCase(name)) {
			alloc_std_cont_qty(value);
			return;
		}
		if ($wait_std_cont_qty.equalsIgnoreCase(name)) {
			wait_std_cont_qty(value);
			return;
		}
		if ($lot_avl_std_cont_qty.equalsIgnoreCase(name)) {
			lot_avl_std_cont_qty(value);
			return;
		}
		if ($avl_std_cont_qty.equalsIgnoreCase(name)) {
			avl_std_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pack_stk_qty.equalsIgnoreCase(name)) {
			pack_stk_qty(value);
			return;
		}
		if ($pack_gr_schd_qty.equalsIgnoreCase(name)) {
			pack_gr_schd_qty(value);
			return;
		}
		if ($pack_alloc_qty.equalsIgnoreCase(name)) {
			pack_alloc_qty(value);
			return;
		}
		if ($pack_wait_qty.equalsIgnoreCase(name)) {
			pack_wait_qty(value);
			return;
		}
		if ($pack_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			pack_lot_alloc_avl_qty(value);
			return;
		}
		if ($pack_alloc_avl_qty.equalsIgnoreCase(name)) {
			pack_alloc_avl_qty(value);
			return;
		}
		if ($base_stk_qty.equalsIgnoreCase(name)) {
			base_stk_qty(value);
			return;
		}
		if ($base_gr_schd_qty.equalsIgnoreCase(name)) {
			base_gr_schd_qty(value);
			return;
		}
		if ($base_alloc_qty.equalsIgnoreCase(name)) {
			base_alloc_qty(value);
			return;
		}
		if ($base_wait_qty.equalsIgnoreCase(name)) {
			base_wait_qty(value);
			return;
		}
		if ($base_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			base_lot_alloc_avl_qty(value);
			return;
		}
		if ($base_alloc_avl_qty.equalsIgnoreCase(name)) {
			base_alloc_avl_qty(value);
			return;
		}
		if ($stk_act_cont_qty.equalsIgnoreCase(name)) {
			stk_act_cont_qty(value);
			return;
		}
		if ($schd_act_cont_qty.equalsIgnoreCase(name)) {
			schd_act_cont_qty(value);
			return;
		}
		if ($alloc_act_cont_qty.equalsIgnoreCase(name)) {
			alloc_act_cont_qty(value);
			return;
		}
		if ($wait_act_cont_qty.equalsIgnoreCase(name)) {
			wait_act_cont_qty(value);
			return;
		}
		if ($lot_avl_act_cont_qty.equalsIgnoreCase(name)) {
			lot_avl_act_cont_qty(value);
			return;
		}
		if ($avl_act_cont_qty.equalsIgnoreCase(name)) {
			avl_act_cont_qty(value);
			return;
		}
		if ($stk_std_cont_qty.equalsIgnoreCase(name)) {
			stk_std_cont_qty(value);
			return;
		}
		if ($schd_std_cont_qty.equalsIgnoreCase(name)) {
			schd_std_cont_qty(value);
			return;
		}
		if ($alloc_std_cont_qty.equalsIgnoreCase(name)) {
			alloc_std_cont_qty(value);
			return;
		}
		if ($wait_std_cont_qty.equalsIgnoreCase(name)) {
			wait_std_cont_qty(value);
			return;
		}
		if ($lot_avl_std_cont_qty.equalsIgnoreCase(name)) {
			lot_avl_std_cont_qty(value);
			return;
		}
		if ($avl_std_cont_qty.equalsIgnoreCase(name)) {
			avl_std_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pack_stk_qty.equalsIgnoreCase(name)) {
			pack_stk_qty(value);
			return;
		}
		if ($pack_gr_schd_qty.equalsIgnoreCase(name)) {
			pack_gr_schd_qty(value);
			return;
		}
		if ($pack_alloc_qty.equalsIgnoreCase(name)) {
			pack_alloc_qty(value);
			return;
		}
		if ($pack_wait_qty.equalsIgnoreCase(name)) {
			pack_wait_qty(value);
			return;
		}
		if ($pack_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			pack_lot_alloc_avl_qty(value);
			return;
		}
		if ($pack_alloc_avl_qty.equalsIgnoreCase(name)) {
			pack_alloc_avl_qty(value);
			return;
		}
		if ($base_stk_qty.equalsIgnoreCase(name)) {
			base_stk_qty(value);
			return;
		}
		if ($base_gr_schd_qty.equalsIgnoreCase(name)) {
			base_gr_schd_qty(value);
			return;
		}
		if ($base_alloc_qty.equalsIgnoreCase(name)) {
			base_alloc_qty(value);
			return;
		}
		if ($base_wait_qty.equalsIgnoreCase(name)) {
			base_wait_qty(value);
			return;
		}
		if ($base_lot_alloc_avl_qty.equalsIgnoreCase(name)) {
			base_lot_alloc_avl_qty(value);
			return;
		}
		if ($base_alloc_avl_qty.equalsIgnoreCase(name)) {
			base_alloc_avl_qty(value);
			return;
		}
		if ($stk_act_cont_qty.equalsIgnoreCase(name)) {
			stk_act_cont_qty(value);
			return;
		}
		if ($schd_act_cont_qty.equalsIgnoreCase(name)) {
			schd_act_cont_qty(value);
			return;
		}
		if ($alloc_act_cont_qty.equalsIgnoreCase(name)) {
			alloc_act_cont_qty(value);
			return;
		}
		if ($wait_act_cont_qty.equalsIgnoreCase(name)) {
			wait_act_cont_qty(value);
			return;
		}
		if ($lot_avl_act_cont_qty.equalsIgnoreCase(name)) {
			lot_avl_act_cont_qty(value);
			return;
		}
		if ($avl_act_cont_qty.equalsIgnoreCase(name)) {
			avl_act_cont_qty(value);
			return;
		}
		if ($stk_std_cont_qty.equalsIgnoreCase(name)) {
			stk_std_cont_qty(value);
			return;
		}
		if ($schd_std_cont_qty.equalsIgnoreCase(name)) {
			schd_std_cont_qty(value);
			return;
		}
		if ($alloc_std_cont_qty.equalsIgnoreCase(name)) {
			alloc_std_cont_qty(value);
			return;
		}
		if ($wait_std_cont_qty.equalsIgnoreCase(name)) {
			wait_std_cont_qty(value);
			return;
		}
		if ($lot_avl_std_cont_qty.equalsIgnoreCase(name)) {
			lot_avl_std_cont_qty(value);
			return;
		}
		if ($avl_std_cont_qty.equalsIgnoreCase(name)) {
			avl_std_cont_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($alloc.equalsIgnoreCase(name)) {
			return alloc();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($alloc.equalsIgnoreCase(name)) {
			alloc(
				((MCContainerMeta) alloc_META).castInnerRow(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return alloc().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		alloc().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return alloc().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		alloc().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return alloc().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		alloc().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return alloc().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		alloc().itm_sub3(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return alloc().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		alloc().ver_no(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return alloc().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		alloc().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return alloc().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		alloc().sublot_no(value);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return alloc().stk_loc_cd();
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		alloc().stk_loc_cd(value);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return alloc().stk_str_ln_cd();
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		alloc().stk_str_ln_cd(value);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return alloc().stk_lg_grp_cd();
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		alloc().stk_lg_grp_cd(value);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return alloc().alloc_grp_cd();
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		alloc().alloc_grp_cd(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return alloc().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		alloc().gd_cd(value);
	}

	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public String in_xfr_typ() {
		return alloc().in_xfr_typ();
	}

	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public void in_xfr_typ(String value) {
		alloc().in_xfr_typ(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return alloc().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		alloc().quality_typ(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return alloc().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		alloc().stk_insp_typ(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return alloc().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		alloc().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return alloc().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		alloc().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return alloc().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		alloc().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return alloc().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		alloc().sno4(value);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return alloc().asst_typ();
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		alloc().asst_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return alloc().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		alloc().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return alloc().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		alloc().stk_bp_cd(value);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return alloc().stk_arrv_bp_cd();
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		alloc().stk_arrv_bp_cd(value);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return alloc().pack_unit_cd();
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		alloc().pack_unit_cd(value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_unit_dec_place() {
		return alloc().pack_unit_dec_place();
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(MCNumber value) {
		alloc().pack_unit_dec_place(value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(int value) {
		alloc().pack_unit_dec_place(value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(long value) {
		alloc().pack_unit_dec_place(value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(float value) {
		alloc().pack_unit_dec_place(value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(double value) {
		alloc().pack_unit_dec_place(value);
	}

	/**
	 * SKU rounding type 荷姿単位端数処理区分.<p>
	 *
	 */
	public String pack_unit_rnd_typ() {
		return alloc().pack_unit_rnd_typ();
	}

	/**
	 * SKU rounding type 荷姿単位端数処理区分.<p>
	 *
	 */
	public void pack_unit_rnd_typ(String value) {
		alloc().pack_unit_rnd_typ(value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public MCNumber conv_base_qty() {
		return alloc().conv_base_qty();
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(MCNumber value) {
		alloc().conv_base_qty(value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(int value) {
		alloc().conv_base_qty(value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(long value) {
		alloc().conv_base_qty(value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(float value) {
		alloc().conv_base_qty(value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void conv_base_qty(double value) {
		alloc().conv_base_qty(value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public MCNumber conv_qty() {
		return alloc().conv_qty();
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(MCNumber value) {
		alloc().conv_qty(value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(int value) {
		alloc().conv_qty(value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(long value) {
		alloc().conv_qty(value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(float value) {
		alloc().conv_qty(value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void conv_qty(double value) {
		alloc().conv_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return alloc().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		alloc().base_unit_cd(value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return alloc().base_unit_dec_place();
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		alloc().base_unit_dec_place(value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		alloc().base_unit_dec_place(value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		alloc().base_unit_dec_place(value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		alloc().base_unit_dec_place(value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		alloc().base_unit_dec_place(value);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return alloc().base_unit_rnd_typ();
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		alloc().base_unit_rnd_typ(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return alloc().act_cont_fctr();
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		alloc().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		alloc().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		alloc().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		alloc().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		alloc().act_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return alloc().std_cont_fctr();
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		alloc().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		alloc().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		alloc().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		alloc().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		alloc().std_cont_fctr(value);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return alloc().cont_fctr_flg();
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		alloc().cont_fctr_flg(value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return alloc().cont_fctr_dec_place();
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		alloc().cont_fctr_dec_place(value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		alloc().cont_fctr_dec_place(value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		alloc().cont_fctr_dec_place(value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		alloc().cont_fctr_dec_place(value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		alloc().cont_fctr_dec_place(value);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return alloc().cont_fctr_rnd_typ();
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		alloc().cont_fctr_rnd_typ(value);
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return alloc().first_gr_dt();
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		alloc().first_gr_dt(value);
	}

	/**
	 * Without expiration 期限未設定.<p>
	 *
	 */
	public boolean unreg_lmt_flg() {
		return alloc().unreg_lmt_flg();
	}

	/**
	 * Without expiration 期限未設定.<p>
	 *
	 */
	public void unreg_lmt_flg(boolean value) {
		alloc().unreg_lmt_flg(value);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return alloc().vld_dt();
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		alloc().vld_dt(value);
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return alloc().lmt_dt();
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		alloc().lmt_dt(value);
	}

	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public String plnt_aprv_sts_typ() {
		return alloc().plnt_aprv_sts_typ();
	}

	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public void plnt_aprv_sts_typ(String value) {
		alloc().plnt_aprv_sts_typ(value);
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public String mrkt_judg_sts_typ() {
		return alloc().mrkt_judg_sts_typ();
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public void mrkt_judg_sts_typ(String value) {
		alloc().mrkt_judg_sts_typ(value);
	}

	/**
	 * Scheduled date 予定日.<p>
	 *
	 */
	public MCDate schd_dt() {
		return alloc().schd_dt();
	}

	/**
	 * Scheduled date 予定日.<p>
	 *
	 */
	public void schd_dt(MCDate value) {
		alloc().schd_dt(value);
	}

}

