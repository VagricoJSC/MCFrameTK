package mcframe.serverMSBF.MSBFL5070;

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
 * ブロック"InspActIF_Upd01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InspActIF_Upd01_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Inspection result details No. 検査実績明細ＮＯ.<p>
	 *
	 */
	public static final String $insp_act_d_no = "insp_act_d_no";
	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public static final String $insp_act_no = "insp_act_no";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Update item cd. 品目ＣＤ更新.<p>
	 *
	 */
	public static final String $itm_cd_upd_flg = "itm_cd_upd_flg";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Update branch No. 1 枝番１更新.<p>
	 *
	 */
	public static final String $itm_sub1_upd_flg = "itm_sub1_upd_flg";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Update branch No. 2 枝番２更新.<p>
	 *
	 */
	public static final String $itm_sub2_upd_flg = "itm_sub2_upd_flg";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Update branch No. 3 枝番３更新.<p>
	 *
	 */
	public static final String $itm_sub3_upd_flg = "itm_sub3_upd_flg";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Update location cd. 場所ＣＤ更新.<p>
	 *
	 */
	public static final String $loc_cd_upd_flg = "loc_cd_upd_flg";
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Update rack/line cd. 棚・ラインＣＤ更新.<p>
	 *
	 */
	public static final String $str_ln_cd_upd_flg = "str_ln_cd_upd_flg";
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Update conforming type 良品区分更新.<p>
	 *
	 */
	public static final String $quality_typ_upd_flg = "quality_typ_upd_flg";
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	/**
	 * Update inventory inspection type 在庫検査区分更新.<p>
	 *
	 */
	public static final String $stk_insp_typ_upd_flg = "stk_insp_typ_upd_flg";
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 * Update inventory identification type 在庫識別区分更新.<p>
	 *
	 */
	public static final String $stk_id_typ_upd_flg = "stk_id_typ_upd_flg";
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * Update inventory BP cd. 在庫取引先ＣＤ更新.<p>
	 *
	 */
	public static final String $stk_bp_cd_upd_flg = "stk_bp_cd_upd_flg";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Grading cd. update 格付ＣＤ更新.<p>
	 *
	 */
	public static final String $gd_cd_upd_flg = "gd_cd_upd_flg";
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	/**
	 * Update inventory arriving point cd. 在庫着荷先ＣＤ更新.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd_upd_flg = "stk_arrv_bp_cd_upd_flg";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Lot No. update ロットＮＯ更新.<p>
	 *
	 */
	public static final String $lot_no_upd_flg = "lot_no_upd_flg";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * Sublot No.?update サブロットＮＯ更新.<p>
	 *
	 */
	public static final String $sublot_no_upd_flg = "sublot_no_upd_flg";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * Update SEIBAN No. 1 手配ＮＯ１更新.<p>
	 *
	 */
	public static final String $sno1_upd_flg = "sno1_upd_flg";
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * Update SEIBAN No. 2 手配ＮＯ２更新.<p>
	 *
	 */
	public static final String $sno2_upd_flg = "sno2_upd_flg";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * Update SEIBAN No. 3 手配ＮＯ３更新.<p>
	 *
	 */
	public static final String $sno3_upd_flg = "sno3_upd_flg";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Update SEIBAN No. 4 手配ＮＯ４更新.<p>
	 *
	 */
	public static final String $sno4_upd_flg = "sno4_upd_flg";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public static final String $fix_no_typ = "fix_no_typ";
	/**
	 * Update firm No. type 確定ＮＯ区分更新.<p>
	 *
	 */
	public static final String $fix_no_typ_upd_flg = "fix_no_typ_upd_flg";
	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public static final String $fix_no = "fix_no";
	/**
	 * Update Firm No. 確定ＮＯ更新.<p>
	 *
	 */
	public static final String $fix_no_upd_flg = "fix_no_upd_flg";
	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public static final String $pack_unit_qty = "pack_unit_qty";
	/**
	 * Update SKU qty. 荷姿単位数量更新.<p>
	 *
	 */
	public static final String $pack_unit_qty_upd_flg = "pack_unit_qty_upd_flg";
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * Update SKU cd. 荷姿単位ＣＤ更新.<p>
	 *
	 */
	public static final String $pack_unit_cd_upd_flg = "pack_unit_cd_upd_flg";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Update base unit qty. 基準単位数量更新.<p>
	 *
	 */
	public static final String $base_unit_qty_upd_flg = "base_unit_qty_upd_flg";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Update base unit cd. 基準単位ＣＤ更新.<p>
	 *
	 */
	public static final String $base_unit_cd_upd_flg = "base_unit_cd_upd_flg";
	/**
	 * SKU transfer packing unit qty. 荷姿振替荷姿単位数量.<p>
	 *
	 */
	public static final String $pack_xfr_pack_unit_qty = "pack_xfr_pack_unit_qty";
	/**
	 * Update SKU transfer SKU qty. 荷姿振替荷姿単位数量更新.<p>
	 *
	 */
	public static final String $pack_xfr_pack_unit_qty_upd_flg = "pack_xfr_pack_unit_qty_upd_flg";
	/**
	 * SKU transfer packing unit cd. 荷姿振替荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_xfr_pack_unit_cd = "pack_xfr_pack_unit_cd";
	/**
	 * Update SKU transfer SKU cd. 荷姿振替荷姿単位ＣＤ更新.<p>
	 *
	 */
	public static final String $pack_xfr_pack_unit_cd_upd_flg = "pack_xfr_pack_unit_cd_upd_flg";
	/**
	 * SKU transfer base unit qty. 荷姿振替基準単位数量.<p>
	 *
	 */
	public static final String $pack_xfr_base_unit_qty = "pack_xfr_base_unit_qty";
	/**
	 * Update SKU transfer base unit qty. 荷姿振替基準単位数量更新.<p>
	 *
	 */
	public static final String $pack_xfr_base_unit_qty_upd_flg = "pack_xfr_base_unit_qty_upd_flg";
	/**
	 * SKU transfer base unit cd. 荷姿振替基準単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_xfr_base_unit_cd = "pack_xfr_base_unit_cd";
	/**
	 * Update SKU transfer base unit cd. 荷姿振替基準単位ＣＤ更新.<p>
	 *
	 */
	public static final String $pack_xfr_base_unit_cd_upd_flg = "pack_xfr_base_unit_cd_upd_flg";
	/**
	 * Defective reason cd. 不良理由ＣＤ.<p>
	 *
	 */
	public static final String $dfct_rsn_cd = "dfct_rsn_cd";
	/**
	 * Update defective reason cd. 不良理由ＣＤ更新.<p>
	 *
	 */
	public static final String $dfct_rsn_cd_upd_flg = "dfct_rsn_cd_upd_flg";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Update recording date 計上日更新.<p>
	 *
	 */
	public static final String $ac_dt_upd_flg = "ac_dt_upd_flg";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Update internal remarks 内部備考更新.<p>
	 *
	 */
	public static final String $intr_rmrks_upd_flg = "intr_rmrks_upd_flg";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Update spare 1 予備１更新.<p>
	 *
	 */
	public static final String $sub_char1_upd_flg = "sub_char1_upd_flg";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Update spare 2 予備２更新.<p>
	 *
	 */
	public static final String $sub_char2_upd_flg = "sub_char2_upd_flg";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Update spare 3 予備３更新.<p>
	 *
	 */
	public static final String $sub_char3_upd_flg = "sub_char3_upd_flg";
	/**
	 * Update remark only flg. 備考更新のみＦＬＧ.<p>
	 *
	 */
	public static final String $rmrks_upd_flg = "rmrks_upd_flg";
	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public static final String $lims_flg = "lims_flg";
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	/**
	 * External inspection result details No. 外部検査実績明細ＮＯ.<p>
	 *
	 */
	public static final String $ext_insp_act_d_no = "ext_insp_act_d_no";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta insp_act_d_no_META = createCommonMeta($insp_act_d_no, mcframe.commonMA.meta.MA_META.INSP_ACT_D_NO);
	public static final MCMeta insp_act_no_META = createCommonMeta($insp_act_no, mcframe.commonMA.meta.MA_META.INSP_ACT_NO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_cd_upd_flg_META = createCommonMeta($itm_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub1_upd_flg_META = createCommonMeta($itm_sub1_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub2_upd_flg_META = createCommonMeta($itm_sub2_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_sub3_upd_flg_META = createCommonMeta($itm_sub3_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_cd_upd_flg_META = createCommonMeta($loc_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_cd_upd_flg_META = createCommonMeta($str_ln_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_upd_flg_META = createCommonMeta($quality_typ_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_insp_typ_upd_flg_META = createCommonMeta($stk_insp_typ_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_upd_flg_META = createCommonMeta($stk_id_typ_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_cd_upd_flg_META = createCommonMeta($stk_bp_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_cd_upd_flg_META = createCommonMeta($gd_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_cd_upd_flg_META = createCommonMeta($stk_arrv_bp_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta lot_no_upd_flg_META = createCommonMeta($lot_no_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sublot_no_upd_flg_META = createCommonMeta($sublot_no_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_upd_flg_META = createCommonMeta($sno1_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno2_upd_flg_META = createCommonMeta($sno2_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno3_upd_flg_META = createCommonMeta($sno3_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno4_upd_flg_META = createCommonMeta($sno4_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta fix_no_typ_META = createCommonMeta($fix_no_typ, mcframe.commonMS.meta.MS_META.FIX_NO_TYP);
	public static final MCMeta fix_no_typ_upd_flg_META = createCommonMeta($fix_no_typ_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_no_META = createCommonMeta($fix_no, mcframe.commonMA.meta.MA_META.FIX_NO);
	public static final MCMeta fix_no_upd_flg_META = createCommonMeta($fix_no_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_qty_upd_flg_META = createCommonMeta($pack_unit_qty_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_cd_upd_flg_META = createCommonMeta($pack_unit_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_qty_upd_flg_META = createCommonMeta($base_unit_qty_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_cd_upd_flg_META = createCommonMeta($base_unit_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pack_xfr_pack_unit_qty_META = createCommonMeta($pack_xfr_pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_xfr_pack_unit_qty_upd_flg_META = createCommonMeta($pack_xfr_pack_unit_qty_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pack_xfr_pack_unit_cd_META = createCommonMeta($pack_xfr_pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_xfr_pack_unit_cd_upd_flg_META = createCommonMeta($pack_xfr_pack_unit_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pack_xfr_base_unit_qty_META = createCommonMeta($pack_xfr_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_xfr_base_unit_qty_upd_flg_META = createCommonMeta($pack_xfr_base_unit_qty_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pack_xfr_base_unit_cd_META = createCommonMeta($pack_xfr_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_xfr_base_unit_cd_upd_flg_META = createCommonMeta($pack_xfr_base_unit_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dfct_rsn_cd_META = createCommonMeta($dfct_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta dfct_rsn_cd_upd_flg_META = createCommonMeta($dfct_rsn_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_upd_flg_META = createCommonMeta($ac_dt_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.INSP_ACT_D_INTR_RMRKS);
	public static final MCMeta intr_rmrks_upd_flg_META = createCommonMeta($intr_rmrks_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.INSP_ACT_D_SUB_CHAR1);
	public static final MCMeta sub_char1_upd_flg_META = createCommonMeta($sub_char1_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.INSP_ACT_D_SUB_CHAR2);
	public static final MCMeta sub_char2_upd_flg_META = createCommonMeta($sub_char2_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.INSP_ACT_D_SUB_CHAR3);
	public static final MCMeta sub_char3_upd_flg_META = createCommonMeta($sub_char3_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rmrks_upd_flg_META = createCommonMeta($rmrks_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lims_flg_META = createCommonMeta($lims_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_insp_act_d_no_META = createCommonMeta($ext_insp_act_d_no, mcframe.commonMA.meta.MA_META.EXT_INSP_ACT_D_NO);

	protected static final ConstMetaList<InspActIF_Upd01_DtlR> constMetas = new ConstMetaList<InspActIF_Upd01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			insp_no_META,
			data_crud_typ_META,
			insp_act_d_no_META,
			insp_act_no_META,
			itm_cd_META,
			itm_cd_upd_flg_META,
			itm_sub1_META,
			itm_sub1_upd_flg_META,
			itm_sub2_META,
			itm_sub2_upd_flg_META,
			itm_sub3_META,
			itm_sub3_upd_flg_META,
			loc_cd_META,
			loc_cd_upd_flg_META,
			str_ln_cd_META,
			str_ln_cd_upd_flg_META,
			quality_typ_META,
			quality_typ_upd_flg_META,
			stk_insp_typ_META,
			stk_insp_typ_upd_flg_META,
			stk_id_typ_META,
			stk_id_typ_upd_flg_META,
			stk_bp_cd_META,
			stk_bp_cd_upd_flg_META,
			gd_cd_META,
			gd_cd_upd_flg_META,
			stk_arrv_bp_cd_META,
			stk_arrv_bp_cd_upd_flg_META,
			lot_no_META,
			lot_no_upd_flg_META,
			sublot_no_META,
			sublot_no_upd_flg_META,
			sno1_META,
			sno1_upd_flg_META,
			sno1_mng_typ_META,
			sno2_META,
			sno2_upd_flg_META,
			sno2_mng_typ_META,
			sno3_META,
			sno3_upd_flg_META,
			sno3_mng_typ_META,
			sno4_META,
			sno4_upd_flg_META,
			sno4_mng_typ_META,
			fix_no_typ_META,
			fix_no_typ_upd_flg_META,
			fix_no_META,
			fix_no_upd_flg_META,
			pack_unit_qty_META,
			pack_unit_qty_upd_flg_META,
			pack_unit_cd_META,
			pack_unit_cd_upd_flg_META,
			base_unit_qty_META,
			base_unit_qty_upd_flg_META,
			base_unit_cd_META,
			base_unit_cd_upd_flg_META,
			pack_xfr_pack_unit_qty_META,
			pack_xfr_pack_unit_qty_upd_flg_META,
			pack_xfr_pack_unit_cd_META,
			pack_xfr_pack_unit_cd_upd_flg_META,
			pack_xfr_base_unit_qty_META,
			pack_xfr_base_unit_qty_upd_flg_META,
			pack_xfr_base_unit_cd_META,
			pack_xfr_base_unit_cd_upd_flg_META,
			dfct_rsn_cd_META,
			dfct_rsn_cd_upd_flg_META,
			ac_dt_META,
			ac_dt_upd_flg_META,
			can_ac_dt_META,
			intr_rmrks_META,
			intr_rmrks_upd_flg_META,
			sub_char1_META,
			sub_char1_upd_flg_META,
			sub_char2_META,
			sub_char2_upd_flg_META,
			sub_char3_META,
			sub_char3_upd_flg_META,
			rmrks_upd_flg_META,
			lims_flg_META,
			ext_sys_cd_META,
			ext_insp_act_d_no_META
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
	protected InspActIF_Upd01_DtlR_MC_A(ConstMetaList<? extends InspActIF_Upd01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspActIF_Upd01_DtlR clone() {
		return (InspActIF_Upd01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspActIF_Upd01_DtlR createInstance() {
		return (InspActIF_Upd01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspActIF_Upd01_DtlR getValues(String... names) {
		return (InspActIF_Upd01_DtlR) super.getValues(names);
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
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 2, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 2, $insp_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 3, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 3, $data_crud_typ, value);
	}


	/**
	 * Inspection result details No. 検査実績明細ＮＯ.<p>
	 *
	 */
	public String insp_act_d_no() {
		return getConstString(offset + 4, $insp_act_d_no);
	}

	/**
	 * Inspection result details No. 検査実績明細ＮＯ.<p>
	 *
	 */
	public void insp_act_d_no(String value) {
		setConstString(offset + 4, $insp_act_d_no, value);
	}


	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public String insp_act_no() {
		return getConstString(offset + 5, $insp_act_no);
	}

	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public void insp_act_no(String value) {
		setConstString(offset + 5, $insp_act_no, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 6, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 6, $itm_cd, value);
	}


	/**
	 * Update item cd. 品目ＣＤ更新.<p>
	 *
	 */
	public boolean itm_cd_upd_flg() {
		return getConstBoolean(offset + 7, $itm_cd_upd_flg);
	}

	/**
	 * Update item cd. 品目ＣＤ更新.<p>
	 *
	 */
	public void itm_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 7, $itm_cd_upd_flg, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 8, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 8, $itm_sub1, value);
	}


	/**
	 * Update branch No. 1 枝番１更新.<p>
	 *
	 */
	public boolean itm_sub1_upd_flg() {
		return getConstBoolean(offset + 9, $itm_sub1_upd_flg);
	}

	/**
	 * Update branch No. 1 枝番１更新.<p>
	 *
	 */
	public void itm_sub1_upd_flg(boolean value) {
		setConstBoolean(offset + 9, $itm_sub1_upd_flg, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 10, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 10, $itm_sub2, value);
	}


	/**
	 * Update branch No. 2 枝番２更新.<p>
	 *
	 */
	public boolean itm_sub2_upd_flg() {
		return getConstBoolean(offset + 11, $itm_sub2_upd_flg);
	}

	/**
	 * Update branch No. 2 枝番２更新.<p>
	 *
	 */
	public void itm_sub2_upd_flg(boolean value) {
		setConstBoolean(offset + 11, $itm_sub2_upd_flg, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 12, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 12, $itm_sub3, value);
	}


	/**
	 * Update branch No. 3 枝番３更新.<p>
	 *
	 */
	public boolean itm_sub3_upd_flg() {
		return getConstBoolean(offset + 13, $itm_sub3_upd_flg);
	}

	/**
	 * Update branch No. 3 枝番３更新.<p>
	 *
	 */
	public void itm_sub3_upd_flg(boolean value) {
		setConstBoolean(offset + 13, $itm_sub3_upd_flg, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 14, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 14, $loc_cd, value);
	}


	/**
	 * Update location cd. 場所ＣＤ更新.<p>
	 *
	 */
	public boolean loc_cd_upd_flg() {
		return getConstBoolean(offset + 15, $loc_cd_upd_flg);
	}

	/**
	 * Update location cd. 場所ＣＤ更新.<p>
	 *
	 */
	public void loc_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 15, $loc_cd_upd_flg, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 16, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 16, $str_ln_cd, value);
	}


	/**
	 * Update rack/line cd. 棚・ラインＣＤ更新.<p>
	 *
	 */
	public boolean str_ln_cd_upd_flg() {
		return getConstBoolean(offset + 17, $str_ln_cd_upd_flg);
	}

	/**
	 * Update rack/line cd. 棚・ラインＣＤ更新.<p>
	 *
	 */
	public void str_ln_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 17, $str_ln_cd_upd_flg, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 18, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 18, $quality_typ, value);
	}


	/**
	 * Update conforming type 良品区分更新.<p>
	 *
	 */
	public boolean quality_typ_upd_flg() {
		return getConstBoolean(offset + 19, $quality_typ_upd_flg);
	}

	/**
	 * Update conforming type 良品区分更新.<p>
	 *
	 */
	public void quality_typ_upd_flg(boolean value) {
		setConstBoolean(offset + 19, $quality_typ_upd_flg, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 20, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 20, $stk_insp_typ, value);
	}


	/**
	 * Update inventory inspection type 在庫検査区分更新.<p>
	 *
	 */
	public boolean stk_insp_typ_upd_flg() {
		return getConstBoolean(offset + 21, $stk_insp_typ_upd_flg);
	}

	/**
	 * Update inventory inspection type 在庫検査区分更新.<p>
	 *
	 */
	public void stk_insp_typ_upd_flg(boolean value) {
		setConstBoolean(offset + 21, $stk_insp_typ_upd_flg, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 22, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 22, $stk_id_typ, value);
	}


	/**
	 * Update inventory identification type 在庫識別区分更新.<p>
	 *
	 */
	public boolean stk_id_typ_upd_flg() {
		return getConstBoolean(offset + 23, $stk_id_typ_upd_flg);
	}

	/**
	 * Update inventory identification type 在庫識別区分更新.<p>
	 *
	 */
	public void stk_id_typ_upd_flg(boolean value) {
		setConstBoolean(offset + 23, $stk_id_typ_upd_flg, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 24, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 24, $stk_bp_cd, value);
	}


	/**
	 * Update inventory BP cd. 在庫取引先ＣＤ更新.<p>
	 *
	 */
	public boolean stk_bp_cd_upd_flg() {
		return getConstBoolean(offset + 25, $stk_bp_cd_upd_flg);
	}

	/**
	 * Update inventory BP cd. 在庫取引先ＣＤ更新.<p>
	 *
	 */
	public void stk_bp_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 25, $stk_bp_cd_upd_flg, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 26, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 26, $gd_cd, value);
	}


	/**
	 * Grading cd. update 格付ＣＤ更新.<p>
	 *
	 */
	public boolean gd_cd_upd_flg() {
		return getConstBoolean(offset + 27, $gd_cd_upd_flg);
	}

	/**
	 * Grading cd. update 格付ＣＤ更新.<p>
	 *
	 */
	public void gd_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 27, $gd_cd_upd_flg, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 28, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 28, $stk_arrv_bp_cd, value);
	}


	/**
	 * Update inventory arriving point cd. 在庫着荷先ＣＤ更新.<p>
	 *
	 */
	public boolean stk_arrv_bp_cd_upd_flg() {
		return getConstBoolean(offset + 29, $stk_arrv_bp_cd_upd_flg);
	}

	/**
	 * Update inventory arriving point cd. 在庫着荷先ＣＤ更新.<p>
	 *
	 */
	public void stk_arrv_bp_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 29, $stk_arrv_bp_cd_upd_flg, value);
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
	 * Lot No. update ロットＮＯ更新.<p>
	 *
	 */
	public boolean lot_no_upd_flg() {
		return getConstBoolean(offset + 31, $lot_no_upd_flg);
	}

	/**
	 * Lot No. update ロットＮＯ更新.<p>
	 *
	 */
	public void lot_no_upd_flg(boolean value) {
		setConstBoolean(offset + 31, $lot_no_upd_flg, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 32, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 32, $sublot_no, value);
	}


	/**
	 * Sublot No.?update サブロットＮＯ更新.<p>
	 *
	 */
	public boolean sublot_no_upd_flg() {
		return getConstBoolean(offset + 33, $sublot_no_upd_flg);
	}

	/**
	 * Sublot No.?update サブロットＮＯ更新.<p>
	 *
	 */
	public void sublot_no_upd_flg(boolean value) {
		setConstBoolean(offset + 33, $sublot_no_upd_flg, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 34, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 34, $sno1, value);
	}


	/**
	 * Update SEIBAN No. 1 手配ＮＯ１更新.<p>
	 *
	 */
	public boolean sno1_upd_flg() {
		return getConstBoolean(offset + 35, $sno1_upd_flg);
	}

	/**
	 * Update SEIBAN No. 1 手配ＮＯ１更新.<p>
	 *
	 */
	public void sno1_upd_flg(boolean value) {
		setConstBoolean(offset + 35, $sno1_upd_flg, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 36, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 36, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 37, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 37, $sno2, value);
	}


	/**
	 * Update SEIBAN No. 2 手配ＮＯ２更新.<p>
	 *
	 */
	public boolean sno2_upd_flg() {
		return getConstBoolean(offset + 38, $sno2_upd_flg);
	}

	/**
	 * Update SEIBAN No. 2 手配ＮＯ２更新.<p>
	 *
	 */
	public void sno2_upd_flg(boolean value) {
		setConstBoolean(offset + 38, $sno2_upd_flg, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 39, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 39, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 40, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 40, $sno3, value);
	}


	/**
	 * Update SEIBAN No. 3 手配ＮＯ３更新.<p>
	 *
	 */
	public boolean sno3_upd_flg() {
		return getConstBoolean(offset + 41, $sno3_upd_flg);
	}

	/**
	 * Update SEIBAN No. 3 手配ＮＯ３更新.<p>
	 *
	 */
	public void sno3_upd_flg(boolean value) {
		setConstBoolean(offset + 41, $sno3_upd_flg, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 42, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 42, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 43, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 43, $sno4, value);
	}


	/**
	 * Update SEIBAN No. 4 手配ＮＯ４更新.<p>
	 *
	 */
	public boolean sno4_upd_flg() {
		return getConstBoolean(offset + 44, $sno4_upd_flg);
	}

	/**
	 * Update SEIBAN No. 4 手配ＮＯ４更新.<p>
	 *
	 */
	public void sno4_upd_flg(boolean value) {
		setConstBoolean(offset + 44, $sno4_upd_flg, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 45, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 45, $sno4_mng_typ, value);
	}


	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public String fix_no_typ() {
		return getConstString(offset + 46, $fix_no_typ);
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public void fix_no_typ(String value) {
		setConstString(offset + 46, $fix_no_typ, value);
	}


	/**
	 * Update firm No. type 確定ＮＯ区分更新.<p>
	 *
	 */
	public boolean fix_no_typ_upd_flg() {
		return getConstBoolean(offset + 47, $fix_no_typ_upd_flg);
	}

	/**
	 * Update firm No. type 確定ＮＯ区分更新.<p>
	 *
	 */
	public void fix_no_typ_upd_flg(boolean value) {
		setConstBoolean(offset + 47, $fix_no_typ_upd_flg, value);
	}


	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public String fix_no() {
		return getConstString(offset + 48, $fix_no);
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public void fix_no(String value) {
		setConstString(offset + 48, $fix_no, value);
	}


	/**
	 * Update Firm No. 確定ＮＯ更新.<p>
	 *
	 */
	public boolean fix_no_upd_flg() {
		return getConstBoolean(offset + 49, $fix_no_upd_flg);
	}

	/**
	 * Update Firm No. 確定ＮＯ更新.<p>
	 *
	 */
	public void fix_no_upd_flg(boolean value) {
		setConstBoolean(offset + 49, $fix_no_upd_flg, value);
	}


	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 50, $pack_unit_qty);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 50, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 50, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 50, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 50, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 50, $pack_unit_qty, value);
	}


	/**
	 * Update SKU qty. 荷姿単位数量更新.<p>
	 *
	 */
	public boolean pack_unit_qty_upd_flg() {
		return getConstBoolean(offset + 51, $pack_unit_qty_upd_flg);
	}

	/**
	 * Update SKU qty. 荷姿単位数量更新.<p>
	 *
	 */
	public void pack_unit_qty_upd_flg(boolean value) {
		setConstBoolean(offset + 51, $pack_unit_qty_upd_flg, value);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 52, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 52, $pack_unit_cd, value);
	}


	/**
	 * Update SKU cd. 荷姿単位ＣＤ更新.<p>
	 *
	 */
	public boolean pack_unit_cd_upd_flg() {
		return getConstBoolean(offset + 53, $pack_unit_cd_upd_flg);
	}

	/**
	 * Update SKU cd. 荷姿単位ＣＤ更新.<p>
	 *
	 */
	public void pack_unit_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 53, $pack_unit_cd_upd_flg, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 54, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 54, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 54, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 54, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 54, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 54, $base_unit_qty, value);
	}


	/**
	 * Update base unit qty. 基準単位数量更新.<p>
	 *
	 */
	public boolean base_unit_qty_upd_flg() {
		return getConstBoolean(offset + 55, $base_unit_qty_upd_flg);
	}

	/**
	 * Update base unit qty. 基準単位数量更新.<p>
	 *
	 */
	public void base_unit_qty_upd_flg(boolean value) {
		setConstBoolean(offset + 55, $base_unit_qty_upd_flg, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 56, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 56, $base_unit_cd, value);
	}


	/**
	 * Update base unit cd. 基準単位ＣＤ更新.<p>
	 *
	 */
	public boolean base_unit_cd_upd_flg() {
		return getConstBoolean(offset + 57, $base_unit_cd_upd_flg);
	}

	/**
	 * Update base unit cd. 基準単位ＣＤ更新.<p>
	 *
	 */
	public void base_unit_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 57, $base_unit_cd_upd_flg, value);
	}


	/**
	 * SKU transfer packing unit qty. 荷姿振替荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_xfr_pack_unit_qty() {
		return getConstNumber(offset + 58, $pack_xfr_pack_unit_qty);
	}

	/**
	 * SKU transfer packing unit qty. 荷姿振替荷姿単位数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 58, $pack_xfr_pack_unit_qty, value);
	}

	/**
	 * SKU transfer packing unit qty. 荷姿振替荷姿単位数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(int value) {
		setConstNumber(offset + 58, $pack_xfr_pack_unit_qty, value);
	}

	/**
	 * SKU transfer packing unit qty. 荷姿振替荷姿単位数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(long value) {
		setConstNumber(offset + 58, $pack_xfr_pack_unit_qty, value);
	}

	/**
	 * SKU transfer packing unit qty. 荷姿振替荷姿単位数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(float value) {
		setConstNumber(offset + 58, $pack_xfr_pack_unit_qty, value);
	}

	/**
	 * SKU transfer packing unit qty. 荷姿振替荷姿単位数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(double value) {
		setConstNumber(offset + 58, $pack_xfr_pack_unit_qty, value);
	}


	/**
	 * Update SKU transfer SKU qty. 荷姿振替荷姿単位数量更新.<p>
	 *
	 */
	public boolean pack_xfr_pack_unit_qty_upd_flg() {
		return getConstBoolean(offset + 59, $pack_xfr_pack_unit_qty_upd_flg);
	}

	/**
	 * Update SKU transfer SKU qty. 荷姿振替荷姿単位数量更新.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty_upd_flg(boolean value) {
		setConstBoolean(offset + 59, $pack_xfr_pack_unit_qty_upd_flg, value);
	}


	/**
	 * SKU transfer packing unit cd. 荷姿振替荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_xfr_pack_unit_cd() {
		return getConstString(offset + 60, $pack_xfr_pack_unit_cd);
	}

	/**
	 * SKU transfer packing unit cd. 荷姿振替荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_xfr_pack_unit_cd(String value) {
		setConstString(offset + 60, $pack_xfr_pack_unit_cd, value);
	}


	/**
	 * Update SKU transfer SKU cd. 荷姿振替荷姿単位ＣＤ更新.<p>
	 *
	 */
	public boolean pack_xfr_pack_unit_cd_upd_flg() {
		return getConstBoolean(offset + 61, $pack_xfr_pack_unit_cd_upd_flg);
	}

	/**
	 * Update SKU transfer SKU cd. 荷姿振替荷姿単位ＣＤ更新.<p>
	 *
	 */
	public void pack_xfr_pack_unit_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 61, $pack_xfr_pack_unit_cd_upd_flg, value);
	}


	/**
	 * SKU transfer base unit qty. 荷姿振替基準単位数量.<p>
	 *
	 */
	public MCNumber pack_xfr_base_unit_qty() {
		return getConstNumber(offset + 62, $pack_xfr_base_unit_qty);
	}

	/**
	 * SKU transfer base unit qty. 荷姿振替基準単位数量.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 62, $pack_xfr_base_unit_qty, value);
	}

	/**
	 * SKU transfer base unit qty. 荷姿振替基準単位数量.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(int value) {
		setConstNumber(offset + 62, $pack_xfr_base_unit_qty, value);
	}

	/**
	 * SKU transfer base unit qty. 荷姿振替基準単位数量.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(long value) {
		setConstNumber(offset + 62, $pack_xfr_base_unit_qty, value);
	}

	/**
	 * SKU transfer base unit qty. 荷姿振替基準単位数量.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(float value) {
		setConstNumber(offset + 62, $pack_xfr_base_unit_qty, value);
	}

	/**
	 * SKU transfer base unit qty. 荷姿振替基準単位数量.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(double value) {
		setConstNumber(offset + 62, $pack_xfr_base_unit_qty, value);
	}


	/**
	 * Update SKU transfer base unit qty. 荷姿振替基準単位数量更新.<p>
	 *
	 */
	public boolean pack_xfr_base_unit_qty_upd_flg() {
		return getConstBoolean(offset + 63, $pack_xfr_base_unit_qty_upd_flg);
	}

	/**
	 * Update SKU transfer base unit qty. 荷姿振替基準単位数量更新.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty_upd_flg(boolean value) {
		setConstBoolean(offset + 63, $pack_xfr_base_unit_qty_upd_flg, value);
	}


	/**
	 * SKU transfer base unit cd. 荷姿振替基準単位ＣＤ.<p>
	 *
	 */
	public String pack_xfr_base_unit_cd() {
		return getConstString(offset + 64, $pack_xfr_base_unit_cd);
	}

	/**
	 * SKU transfer base unit cd. 荷姿振替基準単位ＣＤ.<p>
	 *
	 */
	public void pack_xfr_base_unit_cd(String value) {
		setConstString(offset + 64, $pack_xfr_base_unit_cd, value);
	}


	/**
	 * Update SKU transfer base unit cd. 荷姿振替基準単位ＣＤ更新.<p>
	 *
	 */
	public boolean pack_xfr_base_unit_cd_upd_flg() {
		return getConstBoolean(offset + 65, $pack_xfr_base_unit_cd_upd_flg);
	}

	/**
	 * Update SKU transfer base unit cd. 荷姿振替基準単位ＣＤ更新.<p>
	 *
	 */
	public void pack_xfr_base_unit_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 65, $pack_xfr_base_unit_cd_upd_flg, value);
	}


	/**
	 * Defective reason cd. 不良理由ＣＤ.<p>
	 *
	 */
	public String dfct_rsn_cd() {
		return getConstString(offset + 66, $dfct_rsn_cd);
	}

	/**
	 * Defective reason cd. 不良理由ＣＤ.<p>
	 *
	 */
	public void dfct_rsn_cd(String value) {
		setConstString(offset + 66, $dfct_rsn_cd, value);
	}


	/**
	 * Update defective reason cd. 不良理由ＣＤ更新.<p>
	 *
	 */
	public boolean dfct_rsn_cd_upd_flg() {
		return getConstBoolean(offset + 67, $dfct_rsn_cd_upd_flg);
	}

	/**
	 * Update defective reason cd. 不良理由ＣＤ更新.<p>
	 *
	 */
	public void dfct_rsn_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 67, $dfct_rsn_cd_upd_flg, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 68, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 68, $ac_dt, value);
	}


	/**
	 * Update recording date 計上日更新.<p>
	 *
	 */
	public boolean ac_dt_upd_flg() {
		return getConstBoolean(offset + 69, $ac_dt_upd_flg);
	}

	/**
	 * Update recording date 計上日更新.<p>
	 *
	 */
	public void ac_dt_upd_flg(boolean value) {
		setConstBoolean(offset + 69, $ac_dt_upd_flg, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 70, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 70, $can_ac_dt, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 71, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 71, $intr_rmrks, value);
	}


	/**
	 * Update internal remarks 内部備考更新.<p>
	 *
	 */
	public boolean intr_rmrks_upd_flg() {
		return getConstBoolean(offset + 72, $intr_rmrks_upd_flg);
	}

	/**
	 * Update internal remarks 内部備考更新.<p>
	 *
	 */
	public void intr_rmrks_upd_flg(boolean value) {
		setConstBoolean(offset + 72, $intr_rmrks_upd_flg, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 73, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 73, $sub_char1, value);
	}


	/**
	 * Update spare 1 予備１更新.<p>
	 *
	 */
	public boolean sub_char1_upd_flg() {
		return getConstBoolean(offset + 74, $sub_char1_upd_flg);
	}

	/**
	 * Update spare 1 予備１更新.<p>
	 *
	 */
	public void sub_char1_upd_flg(boolean value) {
		setConstBoolean(offset + 74, $sub_char1_upd_flg, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 75, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 75, $sub_char2, value);
	}


	/**
	 * Update spare 2 予備２更新.<p>
	 *
	 */
	public boolean sub_char2_upd_flg() {
		return getConstBoolean(offset + 76, $sub_char2_upd_flg);
	}

	/**
	 * Update spare 2 予備２更新.<p>
	 *
	 */
	public void sub_char2_upd_flg(boolean value) {
		setConstBoolean(offset + 76, $sub_char2_upd_flg, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 77, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 77, $sub_char3, value);
	}


	/**
	 * Update spare 3 予備３更新.<p>
	 *
	 */
	public boolean sub_char3_upd_flg() {
		return getConstBoolean(offset + 78, $sub_char3_upd_flg);
	}

	/**
	 * Update spare 3 予備３更新.<p>
	 *
	 */
	public void sub_char3_upd_flg(boolean value) {
		setConstBoolean(offset + 78, $sub_char3_upd_flg, value);
	}


	/**
	 * Update remark only flg. 備考更新のみＦＬＧ.<p>
	 *
	 */
	public boolean rmrks_upd_flg() {
		return getConstBoolean(offset + 79, $rmrks_upd_flg);
	}

	/**
	 * Update remark only flg. 備考更新のみＦＬＧ.<p>
	 *
	 */
	public void rmrks_upd_flg(boolean value) {
		setConstBoolean(offset + 79, $rmrks_upd_flg, value);
	}


	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public boolean lims_flg() {
		return getConstBoolean(offset + 80, $lims_flg);
	}

	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public void lims_flg(boolean value) {
		setConstBoolean(offset + 80, $lims_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 81, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 81, $ext_sys_cd, value);
	}


	/**
	 * External inspection result details No. 外部検査実績明細ＮＯ.<p>
	 *
	 */
	public String ext_insp_act_d_no() {
		return getConstString(offset + 82, $ext_insp_act_d_no);
	}

	/**
	 * External inspection result details No. 外部検査実績明細ＮＯ.<p>
	 *
	 */
	public void ext_insp_act_d_no(String value) {
		setConstString(offset + 82, $ext_insp_act_d_no, value);
	}


	public String getString(String name) {
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($insp_act_d_no.equalsIgnoreCase(name)) {
			return insp_act_d_no();
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			return insp_act_no();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			return fix_no();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_cd();
		}
		if ($pack_xfr_base_unit_cd.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_cd();
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			return dfct_rsn_cd();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_insp_act_d_no.equalsIgnoreCase(name)) {
			return ext_insp_act_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_qty();
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($itm_cd_upd_flg.equalsIgnoreCase(name)) {
			return itm_cd_upd_flg();
		}
		if ($itm_sub1_upd_flg.equalsIgnoreCase(name)) {
			return itm_sub1_upd_flg();
		}
		if ($itm_sub2_upd_flg.equalsIgnoreCase(name)) {
			return itm_sub2_upd_flg();
		}
		if ($itm_sub3_upd_flg.equalsIgnoreCase(name)) {
			return itm_sub3_upd_flg();
		}
		if ($loc_cd_upd_flg.equalsIgnoreCase(name)) {
			return loc_cd_upd_flg();
		}
		if ($str_ln_cd_upd_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_upd_flg();
		}
		if ($quality_typ_upd_flg.equalsIgnoreCase(name)) {
			return quality_typ_upd_flg();
		}
		if ($stk_insp_typ_upd_flg.equalsIgnoreCase(name)) {
			return stk_insp_typ_upd_flg();
		}
		if ($stk_id_typ_upd_flg.equalsIgnoreCase(name)) {
			return stk_id_typ_upd_flg();
		}
		if ($stk_bp_cd_upd_flg.equalsIgnoreCase(name)) {
			return stk_bp_cd_upd_flg();
		}
		if ($gd_cd_upd_flg.equalsIgnoreCase(name)) {
			return gd_cd_upd_flg();
		}
		if ($stk_arrv_bp_cd_upd_flg.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd_upd_flg();
		}
		if ($lot_no_upd_flg.equalsIgnoreCase(name)) {
			return lot_no_upd_flg();
		}
		if ($sublot_no_upd_flg.equalsIgnoreCase(name)) {
			return sublot_no_upd_flg();
		}
		if ($sno1_upd_flg.equalsIgnoreCase(name)) {
			return sno1_upd_flg();
		}
		if ($sno2_upd_flg.equalsIgnoreCase(name)) {
			return sno2_upd_flg();
		}
		if ($sno3_upd_flg.equalsIgnoreCase(name)) {
			return sno3_upd_flg();
		}
		if ($sno4_upd_flg.equalsIgnoreCase(name)) {
			return sno4_upd_flg();
		}
		if ($fix_no_typ_upd_flg.equalsIgnoreCase(name)) {
			return fix_no_typ_upd_flg();
		}
		if ($fix_no_upd_flg.equalsIgnoreCase(name)) {
			return fix_no_upd_flg();
		}
		if ($pack_unit_qty_upd_flg.equalsIgnoreCase(name)) {
			return pack_unit_qty_upd_flg();
		}
		if ($pack_unit_cd_upd_flg.equalsIgnoreCase(name)) {
			return pack_unit_cd_upd_flg();
		}
		if ($base_unit_qty_upd_flg.equalsIgnoreCase(name)) {
			return base_unit_qty_upd_flg();
		}
		if ($base_unit_cd_upd_flg.equalsIgnoreCase(name)) {
			return base_unit_cd_upd_flg();
		}
		if ($pack_xfr_pack_unit_qty_upd_flg.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_qty_upd_flg();
		}
		if ($pack_xfr_pack_unit_cd_upd_flg.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_cd_upd_flg();
		}
		if ($pack_xfr_base_unit_qty_upd_flg.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_qty_upd_flg();
		}
		if ($pack_xfr_base_unit_cd_upd_flg.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_cd_upd_flg();
		}
		if ($dfct_rsn_cd_upd_flg.equalsIgnoreCase(name)) {
			return dfct_rsn_cd_upd_flg();
		}
		if ($ac_dt_upd_flg.equalsIgnoreCase(name)) {
			return ac_dt_upd_flg();
		}
		if ($intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return intr_rmrks_upd_flg();
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			return sub_char1_upd_flg();
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			return sub_char2_upd_flg();
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			return sub_char3_upd_flg();
		}
		if ($rmrks_upd_flg.equalsIgnoreCase(name)) {
			return rmrks_upd_flg();
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($insp_act_d_no.equalsIgnoreCase(name)) {
			return insp_act_d_no();
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			return insp_act_no();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			return fix_no();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_cd();
		}
		if ($pack_xfr_base_unit_cd.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_cd();
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			return dfct_rsn_cd();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_insp_act_d_no.equalsIgnoreCase(name)) {
			return ext_insp_act_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_qty();
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($itm_cd_upd_flg.equalsIgnoreCase(name)) {
			return itm_cd_upd_flg();
		}
		if ($itm_sub1_upd_flg.equalsIgnoreCase(name)) {
			return itm_sub1_upd_flg();
		}
		if ($itm_sub2_upd_flg.equalsIgnoreCase(name)) {
			return itm_sub2_upd_flg();
		}
		if ($itm_sub3_upd_flg.equalsIgnoreCase(name)) {
			return itm_sub3_upd_flg();
		}
		if ($loc_cd_upd_flg.equalsIgnoreCase(name)) {
			return loc_cd_upd_flg();
		}
		if ($str_ln_cd_upd_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_upd_flg();
		}
		if ($quality_typ_upd_flg.equalsIgnoreCase(name)) {
			return quality_typ_upd_flg();
		}
		if ($stk_insp_typ_upd_flg.equalsIgnoreCase(name)) {
			return stk_insp_typ_upd_flg();
		}
		if ($stk_id_typ_upd_flg.equalsIgnoreCase(name)) {
			return stk_id_typ_upd_flg();
		}
		if ($stk_bp_cd_upd_flg.equalsIgnoreCase(name)) {
			return stk_bp_cd_upd_flg();
		}
		if ($gd_cd_upd_flg.equalsIgnoreCase(name)) {
			return gd_cd_upd_flg();
		}
		if ($stk_arrv_bp_cd_upd_flg.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd_upd_flg();
		}
		if ($lot_no_upd_flg.equalsIgnoreCase(name)) {
			return lot_no_upd_flg();
		}
		if ($sublot_no_upd_flg.equalsIgnoreCase(name)) {
			return sublot_no_upd_flg();
		}
		if ($sno1_upd_flg.equalsIgnoreCase(name)) {
			return sno1_upd_flg();
		}
		if ($sno2_upd_flg.equalsIgnoreCase(name)) {
			return sno2_upd_flg();
		}
		if ($sno3_upd_flg.equalsIgnoreCase(name)) {
			return sno3_upd_flg();
		}
		if ($sno4_upd_flg.equalsIgnoreCase(name)) {
			return sno4_upd_flg();
		}
		if ($fix_no_typ_upd_flg.equalsIgnoreCase(name)) {
			return fix_no_typ_upd_flg();
		}
		if ($fix_no_upd_flg.equalsIgnoreCase(name)) {
			return fix_no_upd_flg();
		}
		if ($pack_unit_qty_upd_flg.equalsIgnoreCase(name)) {
			return pack_unit_qty_upd_flg();
		}
		if ($pack_unit_cd_upd_flg.equalsIgnoreCase(name)) {
			return pack_unit_cd_upd_flg();
		}
		if ($base_unit_qty_upd_flg.equalsIgnoreCase(name)) {
			return base_unit_qty_upd_flg();
		}
		if ($base_unit_cd_upd_flg.equalsIgnoreCase(name)) {
			return base_unit_cd_upd_flg();
		}
		if ($pack_xfr_pack_unit_qty_upd_flg.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_qty_upd_flg();
		}
		if ($pack_xfr_pack_unit_cd_upd_flg.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_cd_upd_flg();
		}
		if ($pack_xfr_base_unit_qty_upd_flg.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_qty_upd_flg();
		}
		if ($pack_xfr_base_unit_cd_upd_flg.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_cd_upd_flg();
		}
		if ($dfct_rsn_cd_upd_flg.equalsIgnoreCase(name)) {
			return dfct_rsn_cd_upd_flg();
		}
		if ($ac_dt_upd_flg.equalsIgnoreCase(name)) {
			return ac_dt_upd_flg();
		}
		if ($intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return intr_rmrks_upd_flg();
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			return sub_char1_upd_flg();
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			return sub_char2_upd_flg();
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			return sub_char3_upd_flg();
		}
		if ($rmrks_upd_flg.equalsIgnoreCase(name)) {
			return rmrks_upd_flg();
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($insp_act_d_no.equalsIgnoreCase(name)) {
			insp_act_d_no(value);
			return;
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			insp_act_no(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			fix_no_typ(value);
			return;
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			fix_no(value);
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
		if ($pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_cd(value);
			return;
		}
		if ($pack_xfr_base_unit_cd.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_cd(value);
			return;
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			dfct_rsn_cd(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_insp_act_d_no.equalsIgnoreCase(name)) {
			ext_insp_act_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($itm_cd_upd_flg.equalsIgnoreCase(name)) {
			itm_cd_upd_flg(value);
			return;
		}
		if ($itm_sub1_upd_flg.equalsIgnoreCase(name)) {
			itm_sub1_upd_flg(value);
			return;
		}
		if ($itm_sub2_upd_flg.equalsIgnoreCase(name)) {
			itm_sub2_upd_flg(value);
			return;
		}
		if ($itm_sub3_upd_flg.equalsIgnoreCase(name)) {
			itm_sub3_upd_flg(value);
			return;
		}
		if ($loc_cd_upd_flg.equalsIgnoreCase(name)) {
			loc_cd_upd_flg(value);
			return;
		}
		if ($str_ln_cd_upd_flg.equalsIgnoreCase(name)) {
			str_ln_cd_upd_flg(value);
			return;
		}
		if ($quality_typ_upd_flg.equalsIgnoreCase(name)) {
			quality_typ_upd_flg(value);
			return;
		}
		if ($stk_insp_typ_upd_flg.equalsIgnoreCase(name)) {
			stk_insp_typ_upd_flg(value);
			return;
		}
		if ($stk_id_typ_upd_flg.equalsIgnoreCase(name)) {
			stk_id_typ_upd_flg(value);
			return;
		}
		if ($stk_bp_cd_upd_flg.equalsIgnoreCase(name)) {
			stk_bp_cd_upd_flg(value);
			return;
		}
		if ($gd_cd_upd_flg.equalsIgnoreCase(name)) {
			gd_cd_upd_flg(value);
			return;
		}
		if ($stk_arrv_bp_cd_upd_flg.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd_upd_flg(value);
			return;
		}
		if ($lot_no_upd_flg.equalsIgnoreCase(name)) {
			lot_no_upd_flg(value);
			return;
		}
		if ($sublot_no_upd_flg.equalsIgnoreCase(name)) {
			sublot_no_upd_flg(value);
			return;
		}
		if ($sno1_upd_flg.equalsIgnoreCase(name)) {
			sno1_upd_flg(value);
			return;
		}
		if ($sno2_upd_flg.equalsIgnoreCase(name)) {
			sno2_upd_flg(value);
			return;
		}
		if ($sno3_upd_flg.equalsIgnoreCase(name)) {
			sno3_upd_flg(value);
			return;
		}
		if ($sno4_upd_flg.equalsIgnoreCase(name)) {
			sno4_upd_flg(value);
			return;
		}
		if ($fix_no_typ_upd_flg.equalsIgnoreCase(name)) {
			fix_no_typ_upd_flg(value);
			return;
		}
		if ($fix_no_upd_flg.equalsIgnoreCase(name)) {
			fix_no_upd_flg(value);
			return;
		}
		if ($pack_unit_qty_upd_flg.equalsIgnoreCase(name)) {
			pack_unit_qty_upd_flg(value);
			return;
		}
		if ($pack_unit_cd_upd_flg.equalsIgnoreCase(name)) {
			pack_unit_cd_upd_flg(value);
			return;
		}
		if ($base_unit_qty_upd_flg.equalsIgnoreCase(name)) {
			base_unit_qty_upd_flg(value);
			return;
		}
		if ($base_unit_cd_upd_flg.equalsIgnoreCase(name)) {
			base_unit_cd_upd_flg(value);
			return;
		}
		if ($pack_xfr_pack_unit_qty_upd_flg.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty_upd_flg(value);
			return;
		}
		if ($pack_xfr_pack_unit_cd_upd_flg.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_cd_upd_flg(value);
			return;
		}
		if ($pack_xfr_base_unit_qty_upd_flg.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty_upd_flg(value);
			return;
		}
		if ($pack_xfr_base_unit_cd_upd_flg.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_cd_upd_flg(value);
			return;
		}
		if ($dfct_rsn_cd_upd_flg.equalsIgnoreCase(name)) {
			dfct_rsn_cd_upd_flg(value);
			return;
		}
		if ($ac_dt_upd_flg.equalsIgnoreCase(name)) {
			ac_dt_upd_flg(value);
			return;
		}
		if ($intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			intr_rmrks_upd_flg(value);
			return;
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			sub_char1_upd_flg(value);
			return;
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			sub_char2_upd_flg(value);
			return;
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			sub_char3_upd_flg(value);
			return;
		}
		if ($rmrks_upd_flg.equalsIgnoreCase(name)) {
			rmrks_upd_flg(value);
			return;
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($insp_act_d_no.equalsIgnoreCase(name)) {
			insp_act_d_no(value);
			return;
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			insp_act_no(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			fix_no_typ(value);
			return;
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			fix_no(value);
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
		if ($pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_cd(value);
			return;
		}
		if ($pack_xfr_base_unit_cd.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_cd(value);
			return;
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			dfct_rsn_cd(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_insp_act_d_no.equalsIgnoreCase(name)) {
			ext_insp_act_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($itm_cd_upd_flg.equalsIgnoreCase(name)) {
			itm_cd_upd_flg(value);
			return;
		}
		if ($itm_sub1_upd_flg.equalsIgnoreCase(name)) {
			itm_sub1_upd_flg(value);
			return;
		}
		if ($itm_sub2_upd_flg.equalsIgnoreCase(name)) {
			itm_sub2_upd_flg(value);
			return;
		}
		if ($itm_sub3_upd_flg.equalsIgnoreCase(name)) {
			itm_sub3_upd_flg(value);
			return;
		}
		if ($loc_cd_upd_flg.equalsIgnoreCase(name)) {
			loc_cd_upd_flg(value);
			return;
		}
		if ($str_ln_cd_upd_flg.equalsIgnoreCase(name)) {
			str_ln_cd_upd_flg(value);
			return;
		}
		if ($quality_typ_upd_flg.equalsIgnoreCase(name)) {
			quality_typ_upd_flg(value);
			return;
		}
		if ($stk_insp_typ_upd_flg.equalsIgnoreCase(name)) {
			stk_insp_typ_upd_flg(value);
			return;
		}
		if ($stk_id_typ_upd_flg.equalsIgnoreCase(name)) {
			stk_id_typ_upd_flg(value);
			return;
		}
		if ($stk_bp_cd_upd_flg.equalsIgnoreCase(name)) {
			stk_bp_cd_upd_flg(value);
			return;
		}
		if ($gd_cd_upd_flg.equalsIgnoreCase(name)) {
			gd_cd_upd_flg(value);
			return;
		}
		if ($stk_arrv_bp_cd_upd_flg.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd_upd_flg(value);
			return;
		}
		if ($lot_no_upd_flg.equalsIgnoreCase(name)) {
			lot_no_upd_flg(value);
			return;
		}
		if ($sublot_no_upd_flg.equalsIgnoreCase(name)) {
			sublot_no_upd_flg(value);
			return;
		}
		if ($sno1_upd_flg.equalsIgnoreCase(name)) {
			sno1_upd_flg(value);
			return;
		}
		if ($sno2_upd_flg.equalsIgnoreCase(name)) {
			sno2_upd_flg(value);
			return;
		}
		if ($sno3_upd_flg.equalsIgnoreCase(name)) {
			sno3_upd_flg(value);
			return;
		}
		if ($sno4_upd_flg.equalsIgnoreCase(name)) {
			sno4_upd_flg(value);
			return;
		}
		if ($fix_no_typ_upd_flg.equalsIgnoreCase(name)) {
			fix_no_typ_upd_flg(value);
			return;
		}
		if ($fix_no_upd_flg.equalsIgnoreCase(name)) {
			fix_no_upd_flg(value);
			return;
		}
		if ($pack_unit_qty_upd_flg.equalsIgnoreCase(name)) {
			pack_unit_qty_upd_flg(value);
			return;
		}
		if ($pack_unit_cd_upd_flg.equalsIgnoreCase(name)) {
			pack_unit_cd_upd_flg(value);
			return;
		}
		if ($base_unit_qty_upd_flg.equalsIgnoreCase(name)) {
			base_unit_qty_upd_flg(value);
			return;
		}
		if ($base_unit_cd_upd_flg.equalsIgnoreCase(name)) {
			base_unit_cd_upd_flg(value);
			return;
		}
		if ($pack_xfr_pack_unit_qty_upd_flg.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty_upd_flg(value);
			return;
		}
		if ($pack_xfr_pack_unit_cd_upd_flg.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_cd_upd_flg(value);
			return;
		}
		if ($pack_xfr_base_unit_qty_upd_flg.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty_upd_flg(value);
			return;
		}
		if ($pack_xfr_base_unit_cd_upd_flg.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_cd_upd_flg(value);
			return;
		}
		if ($dfct_rsn_cd_upd_flg.equalsIgnoreCase(name)) {
			dfct_rsn_cd_upd_flg(value);
			return;
		}
		if ($ac_dt_upd_flg.equalsIgnoreCase(name)) {
			ac_dt_upd_flg(value);
			return;
		}
		if ($intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			intr_rmrks_upd_flg(value);
			return;
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			sub_char1_upd_flg(value);
			return;
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			sub_char2_upd_flg(value);
			return;
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			sub_char3_upd_flg(value);
			return;
		}
		if ($rmrks_upd_flg.equalsIgnoreCase(name)) {
			rmrks_upd_flg(value);
			return;
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

