package mcframe.serverMSBF.MSBFL0060;

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
 * ブロック"Srch01_RsltTtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltTtlR_MC_A extends MCConstRow {

	/**
	 * Item 品目.<p>
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
	 * Inventory location 在庫場所.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Inventory location name 在庫場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * For inventory rack/line 在庫棚・ライン対象.<p>
	 *
	 */
	public static final String $str_ln_tgt_flg = "str_ln_tgt_flg";
	/**
	 * Inventory rack/line 在庫棚・ライン.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Inventory rack/line name 在庫棚・ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Without Inventory rack/line 在庫棚・ライン無.<p>
	 *
	 */
	public static final String $str_ln_cd_none_flg = "str_ln_cd_none_flg";
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
	 * Grading 格付.<p>
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
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public static final String $stk_pack_unit_qty = "stk_pack_unit_qty";
	/**
	 * Inventory unit (SKU) 在庫単位（荷）.<p>
	 *
	 */
	public static final String $stk_pack_unit_cd = "stk_pack_unit_cd";
	/**
	 * Inventory unit name (SKU) 在庫単位名（荷）.<p>
	 *
	 */
	public static final String $stk_pack_unit_nm = "stk_pack_unit_nm";
	/**
	 * Inventory amount number of decimal places (SKU) 在庫単位小数部有効桁数（荷）.<p>
	 *
	 */
	public static final String $stk_pack_unit_dec_place = "stk_pack_unit_dec_place";
	/**
	 * Inventory unit base qty. (SKU) 在庫単位基準数量（荷）.<p>
	 *
	 */
	public static final String $stk_pack_unit_dmn_qty = "stk_pack_unit_dmn_qty";
	/**
	 * Conversion qty. per inventory (SKU) 在庫単位換算数量（荷）.<p>
	 *
	 */
	public static final String $stk_pack_unit_conv_qty = "stk_pack_unit_conv_qty";
	/**
	 * Inventory unit rounding type (SKU) 在庫単位端数処理区分（荷）.<p>
	 *
	 */
	public static final String $stk_pack_unit_rnd_typ = "stk_pack_unit_rnd_typ";
	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public static final String $stk_base_unit_qty = "stk_base_unit_qty";
	/**
	 * Inventory unit (Base unit) 在庫単位（基）.<p>
	 *
	 */
	public static final String $stk_base_unit_cd = "stk_base_unit_cd";
	/**
	 * Inventory unit name (Base unit) 在庫単位名（基）.<p>
	 *
	 */
	public static final String $stk_base_unit_nm = "stk_base_unit_nm";
	/**
	 * Inventory amount number of decimal places (Base) 在庫単位小数部有効桁数（基）.<p>
	 *
	 */
	public static final String $stk_base_unit_dec_place = "stk_base_unit_dec_place";
	/**
	 * Inventory unit rounding type (Base) 在庫単位端数処理区分（基）.<p>
	 *
	 */
	public static final String $stk_base_unit_rnd_typ = "stk_base_unit_rnd_typ";
	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public static final String $pack_unit_qty = "pack_unit_qty";
	/**
	 * SKU 荷姿単位.<p>
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
	 * SKU base qty. 荷姿基準数量.<p>
	 *
	 */
	public static final String $pack_unit_dmn_qty = "pack_unit_dmn_qty";
	/**
	 * SKU conversion qty. 荷姿換算数量.<p>
	 *
	 */
	public static final String $pack_unit_conv_qty = "pack_unit_conv_qty";
	/**
	 * SKU rounding type 荷姿単位端数処理区分.<p>
	 *
	 */
	public static final String $pack_unit_rnd_typ = "pack_unit_rnd_typ";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Base unit 基準単位.<p>
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
	 * SKU transfer qty. (SKU) 荷姿振替数量（荷）.<p>
	 *
	 */
	public static final String $pack_xfr_pack_unit_qty = "pack_xfr_pack_unit_qty";
	/**
	 * SKU transfer unit (SKU) 荷姿振替単位（荷）.<p>
	 *
	 */
	public static final String $pack_xfr_pack_unit_cd = "pack_xfr_pack_unit_cd";
	/**
	 * SKU transfer unit name (SKU) 荷姿振替単位名（荷）.<p>
	 *
	 */
	public static final String $pack_xfr_pack_unit_nm = "pack_xfr_pack_unit_nm";
	/**
	 * Number of decimal places for SKU transfer (SKU) 荷姿振替小数部有効桁数（荷）.<p>
	 *
	 */
	public static final String $pack_xfr_pack_unit_dec_place = "pack_xfr_pack_unit_dec_place";
	/**
	 * SKU transfer base qty. (SKU) 荷姿振替基準数量（荷）.<p>
	 *
	 */
	public static final String $pack_xfr_pack_unit_dmn_qty = "pack_xfr_pack_unit_dmn_qty";
	/**
	 * SKU transfer conversion qty. (SKU) 荷姿振替換算数量（荷）.<p>
	 *
	 */
	public static final String $pack_xfr_pack_unit_conv_qty = "pack_xfr_pack_unit_conv_qty";
	/**
	 * SKU transfer qty. (Base) 荷姿振替数量（基）.<p>
	 *
	 */
	public static final String $pack_xfr_base_unit_qty = "pack_xfr_base_unit_qty";
	/**
	 * SKU transfer unit (Base) 荷姿振替単位（基）.<p>
	 *
	 */
	public static final String $pack_xfr_base_unit_cd = "pack_xfr_base_unit_cd";
	/**
	 * SKU transfer unit name (Base) 荷姿振替単位名（基）.<p>
	 *
	 */
	public static final String $pack_xfr_base_unit_nm = "pack_xfr_base_unit_nm";
	/**
	 * Number of decimal places for SKU transfer (Base) 荷姿振替小数部有効桁数（基）.<p>
	 *
	 */
	public static final String $pack_xfr_base_unit_dec_place = "pack_xfr_base_unit_dec_place";
	/**
	 * SKU transfer rounding process type (Base) 荷姿振替端数処理区分（基）.<p>
	 *
	 */
	public static final String $pack_xfr_base_unit_rnd_typ = "pack_xfr_base_unit_rnd_typ";
	/**
	 * Defective reason 不良理由.<p>
	 *
	 */
	public static final String $dfct_rsn_cd = "dfct_rsn_cd";
	/**
	 * Defective reason name 不良理由名.<p>
	 *
	 */
	public static final String $dfct_rsn_nm = "dfct_rsn_nm";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Inspection result details No. 検査実績明細ＮＯ.<p>
	 *
	 */
	public static final String $insp_act_d_no = "insp_act_d_no";
	/**
	 * Inspection decision details No. 検査判定明細ＮＯ.<p>
	 *
	 */
	public static final String $insp_judg_d_no = "insp_judg_d_no";
	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public static final String $insp_act_no = "insp_act_no";
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
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
	 * External system name 外部システム名.<p>
	 *
	 */
	public static final String $ext_sys_nm = "ext_sys_nm";
	/**
	 * External inspection result details No. 外部検査実績明細ＮＯ.<p>
	 *
	 */
	public static final String $ext_insp_act_d_no = "ext_insp_act_d_no";


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_tgt_flg_META = createCommonMeta($str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta str_ln_cd_none_flg_META = createCommonMeta($str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta fix_no_typ_META = createCommonMeta($fix_no_typ, mcframe.commonMS.meta.MS_META.FIX_NO_TYP);
	public static final MCMeta fix_no_typ_nm_META = createCommonMeta($fix_no_typ_nm, mcframe.commonMS.meta.MS_META.FIX_NO_TYP_NM);
	public static final MCMeta fix_no_META = createCommonMeta($fix_no, mcframe.commonMA.meta.MA_META.FIX_NO);
	public static final MCMeta stk_pack_unit_qty_META = createCommonMeta($stk_pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta stk_pack_unit_cd_META = createCommonMeta($stk_pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta stk_pack_unit_nm_META = createCommonMeta($stk_pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta stk_pack_unit_dec_place_META = createCommonMeta($stk_pack_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta stk_pack_unit_dmn_qty_META = createCommonMeta($stk_pack_unit_dmn_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta stk_pack_unit_conv_qty_META = createCommonMeta($stk_pack_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta stk_pack_unit_rnd_typ_META = createCommonMeta($stk_pack_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta stk_base_unit_qty_META = createCommonMeta($stk_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta stk_base_unit_cd_META = createCommonMeta($stk_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta stk_base_unit_nm_META = createCommonMeta($stk_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta stk_base_unit_dec_place_META = createCommonMeta($stk_base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta stk_base_unit_rnd_typ_META = createCommonMeta($stk_base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pack_unit_dec_place_META = createCommonMeta($pack_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pack_unit_dmn_qty_META = createCommonMeta($pack_unit_dmn_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_conv_qty_META = createCommonMeta($pack_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_rnd_typ_META = createCommonMeta($pack_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta pack_xfr_pack_unit_qty_META = createCommonMeta($pack_xfr_pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_xfr_pack_unit_cd_META = createCommonMeta($pack_xfr_pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_xfr_pack_unit_nm_META = createCommonMeta($pack_xfr_pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pack_xfr_pack_unit_dec_place_META = createCommonMeta($pack_xfr_pack_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pack_xfr_pack_unit_dmn_qty_META = createCommonMeta($pack_xfr_pack_unit_dmn_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_xfr_pack_unit_conv_qty_META = createCommonMeta($pack_xfr_pack_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_xfr_base_unit_qty_META = createCommonMeta($pack_xfr_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_xfr_base_unit_cd_META = createCommonMeta($pack_xfr_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_xfr_base_unit_nm_META = createCommonMeta($pack_xfr_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pack_xfr_base_unit_dec_place_META = createCommonMeta($pack_xfr_base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pack_xfr_base_unit_rnd_typ_META = createCommonMeta($pack_xfr_base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta dfct_rsn_cd_META = createCommonMeta($dfct_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta dfct_rsn_nm_META = createCommonMeta($dfct_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_act_d_no_META = createCommonMeta($insp_act_d_no, mcframe.commonMA.meta.MA_META.INSP_ACT_D_NO);
	public static final MCMeta insp_judg_d_no_META = createCommonMeta($insp_judg_d_no, mcframe.commonMA.meta.MA_META.INSP_JUDG_D_NO);
	public static final MCMeta insp_act_no_META = createCommonMeta($insp_act_no, mcframe.commonMA.meta.MA_META.INSP_ACT_NO);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.INSP_ACT_D_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.INSP_ACT_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.INSP_ACT_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.INSP_ACT_D_SUB_CHAR3);
	public static final MCMeta lims_flg_META = createCommonMeta($lims_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_insp_act_d_no_META = createCommonMeta($ext_insp_act_d_no, mcframe.commonMA.meta.MA_META.EXT_INSP_ACT_D_NO);

	protected static final ConstMetaList<Srch01_RsltTtlR> constMetas = new ConstMetaList<Srch01_RsltTtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_tgt_flg_META,
			str_ln_cd_META,
			str_ln_nm_META,
			str_ln_cd_none_flg_META,
			stk_arrv_bp_cd_META,
			stk_arrv_bp_nm_META,
			gd_cd_META,
			gd_nm_META,
			quality_typ_META,
			quality_typ_nm_META,
			stk_insp_typ_META,
			stk_insp_typ_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META,
			fix_no_typ_META,
			fix_no_typ_nm_META,
			fix_no_META,
			stk_pack_unit_qty_META,
			stk_pack_unit_cd_META,
			stk_pack_unit_nm_META,
			stk_pack_unit_dec_place_META,
			stk_pack_unit_dmn_qty_META,
			stk_pack_unit_conv_qty_META,
			stk_pack_unit_rnd_typ_META,
			stk_base_unit_qty_META,
			stk_base_unit_cd_META,
			stk_base_unit_nm_META,
			stk_base_unit_dec_place_META,
			stk_base_unit_rnd_typ_META,
			pack_unit_qty_META,
			pack_unit_cd_META,
			pack_unit_nm_META,
			pack_unit_dec_place_META,
			pack_unit_dmn_qty_META,
			pack_unit_conv_qty_META,
			pack_unit_rnd_typ_META,
			base_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			pack_xfr_pack_unit_qty_META,
			pack_xfr_pack_unit_cd_META,
			pack_xfr_pack_unit_nm_META,
			pack_xfr_pack_unit_dec_place_META,
			pack_xfr_pack_unit_dmn_qty_META,
			pack_xfr_pack_unit_conv_qty_META,
			pack_xfr_base_unit_qty_META,
			pack_xfr_base_unit_cd_META,
			pack_xfr_base_unit_nm_META,
			pack_xfr_base_unit_dec_place_META,
			pack_xfr_base_unit_rnd_typ_META,
			dfct_rsn_cd_META,
			dfct_rsn_nm_META,
			ac_dt_META,
			insp_act_d_no_META,
			insp_judg_d_no_META,
			insp_act_no_META,
			insp_no_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			lims_flg_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			ext_insp_act_d_no_META
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
				{$stk_id_typ, "MSC_STK_ID_TYP"},	// stk_id_typ
				{$fix_no_typ, "MSC_FIX_NO_TYP"}	// fix_no_typ
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
	protected Srch01_RsltTtlR_MC_A(ConstMetaList<? extends Srch01_RsltTtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltTtlR clone() {
		return (Srch01_RsltTtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltTtlR createInstance() {
		return (Srch01_RsltTtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltTtlR getValues(String... names) {
		return (Srch01_RsltTtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Item 品目.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}


	/**
	 * Inventory location 在庫場所.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 4, $loc_cd);
	}

	/**
	 * Inventory location 在庫場所.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 4, $loc_cd, value);
	}


	/**
	 * Inventory location name 在庫場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 5, $loc_nm);
	}

	/**
	 * Inventory location name 在庫場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 5, $loc_nm, value);
	}


	/**
	 * For inventory rack/line 在庫棚・ライン対象.<p>
	 *
	 */
	public boolean str_ln_tgt_flg() {
		return getConstBoolean(offset + 6, $str_ln_tgt_flg);
	}

	/**
	 * For inventory rack/line 在庫棚・ライン対象.<p>
	 *
	 */
	public void str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 6, $str_ln_tgt_flg, value);
	}


	/**
	 * Inventory rack/line 在庫棚・ライン.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 7, $str_ln_cd);
	}

	/**
	 * Inventory rack/line 在庫棚・ライン.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 7, $str_ln_cd, value);
	}


	/**
	 * Inventory rack/line name 在庫棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 8, $str_ln_nm);
	}

	/**
	 * Inventory rack/line name 在庫棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 8, $str_ln_nm, value);
	}


	/**
	 * Without Inventory rack/line 在庫棚・ライン無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 9, $str_ln_cd_none_flg);
	}

	/**
	 * Without Inventory rack/line 在庫棚・ライン無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 9, $str_ln_cd_none_flg, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 10, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 10, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 11, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 11, $stk_arrv_bp_nm, value);
	}


	/**
	 * Grading 格付.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 12, $gd_cd);
	}

	/**
	 * Grading 格付.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 12, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 13, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 13, $gd_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 14, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 14, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 15, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 15, $quality_typ_nm, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 16, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 16, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 17, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 17, $stk_insp_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 18, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 18, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 19, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 19, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 20, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 20, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 21, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 21, $stk_bp_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 22, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 22, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 23, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 23, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 24, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 24, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 25, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 25, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 26, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 26, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 27, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 27, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 28, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 28, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 29, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 29, $wrk_nm, value);
	}


	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public String fix_no_typ() {
		return getConstString(offset + 30, $fix_no_typ);
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public void fix_no_typ(String value) {
		setConstString(offset + 30, $fix_no_typ, value);
	}


	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public String fix_no_typ_nm() {
		return getConstString(offset + 31, $fix_no_typ_nm);
	}

	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public void fix_no_typ_nm(String value) {
		setConstString(offset + 31, $fix_no_typ_nm, value);
	}


	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public String fix_no() {
		return getConstString(offset + 32, $fix_no);
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public void fix_no(String value) {
		setConstString(offset + 32, $fix_no, value);
	}


	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public MCNumber stk_pack_unit_qty() {
		return getConstNumber(offset + 33, $stk_pack_unit_qty);
	}

	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public void stk_pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 33, $stk_pack_unit_qty, value);
	}

	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public void stk_pack_unit_qty(int value) {
		setConstNumber(offset + 33, $stk_pack_unit_qty, value);
	}

	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public void stk_pack_unit_qty(long value) {
		setConstNumber(offset + 33, $stk_pack_unit_qty, value);
	}

	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public void stk_pack_unit_qty(float value) {
		setConstNumber(offset + 33, $stk_pack_unit_qty, value);
	}

	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public void stk_pack_unit_qty(double value) {
		setConstNumber(offset + 33, $stk_pack_unit_qty, value);
	}


	/**
	 * Inventory unit (SKU) 在庫単位（荷）.<p>
	 *
	 */
	public String stk_pack_unit_cd() {
		return getConstString(offset + 34, $stk_pack_unit_cd);
	}

	/**
	 * Inventory unit (SKU) 在庫単位（荷）.<p>
	 *
	 */
	public void stk_pack_unit_cd(String value) {
		setConstString(offset + 34, $stk_pack_unit_cd, value);
	}


	/**
	 * Inventory unit name (SKU) 在庫単位名（荷）.<p>
	 *
	 */
	public String stk_pack_unit_nm() {
		return getConstString(offset + 35, $stk_pack_unit_nm);
	}

	/**
	 * Inventory unit name (SKU) 在庫単位名（荷）.<p>
	 *
	 */
	public void stk_pack_unit_nm(String value) {
		setConstString(offset + 35, $stk_pack_unit_nm, value);
	}


	/**
	 * Inventory amount number of decimal places (SKU) 在庫単位小数部有効桁数（荷）.<p>
	 *
	 */
	public MCNumber stk_pack_unit_dec_place() {
		return getConstNumber(offset + 36, $stk_pack_unit_dec_place);
	}

	/**
	 * Inventory amount number of decimal places (SKU) 在庫単位小数部有効桁数（荷）.<p>
	 *
	 */
	public void stk_pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 36, $stk_pack_unit_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places (SKU) 在庫単位小数部有効桁数（荷）.<p>
	 *
	 */
	public void stk_pack_unit_dec_place(int value) {
		setConstNumber(offset + 36, $stk_pack_unit_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places (SKU) 在庫単位小数部有効桁数（荷）.<p>
	 *
	 */
	public void stk_pack_unit_dec_place(long value) {
		setConstNumber(offset + 36, $stk_pack_unit_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places (SKU) 在庫単位小数部有効桁数（荷）.<p>
	 *
	 */
	public void stk_pack_unit_dec_place(float value) {
		setConstNumber(offset + 36, $stk_pack_unit_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places (SKU) 在庫単位小数部有効桁数（荷）.<p>
	 *
	 */
	public void stk_pack_unit_dec_place(double value) {
		setConstNumber(offset + 36, $stk_pack_unit_dec_place, value);
	}


	/**
	 * Inventory unit base qty. (SKU) 在庫単位基準数量（荷）.<p>
	 *
	 */
	public MCNumber stk_pack_unit_dmn_qty() {
		return getConstNumber(offset + 37, $stk_pack_unit_dmn_qty);
	}

	/**
	 * Inventory unit base qty. (SKU) 在庫単位基準数量（荷）.<p>
	 *
	 */
	public void stk_pack_unit_dmn_qty(MCNumber value) {
		setConstNumber(offset + 37, $stk_pack_unit_dmn_qty, value);
	}

	/**
	 * Inventory unit base qty. (SKU) 在庫単位基準数量（荷）.<p>
	 *
	 */
	public void stk_pack_unit_dmn_qty(int value) {
		setConstNumber(offset + 37, $stk_pack_unit_dmn_qty, value);
	}

	/**
	 * Inventory unit base qty. (SKU) 在庫単位基準数量（荷）.<p>
	 *
	 */
	public void stk_pack_unit_dmn_qty(long value) {
		setConstNumber(offset + 37, $stk_pack_unit_dmn_qty, value);
	}

	/**
	 * Inventory unit base qty. (SKU) 在庫単位基準数量（荷）.<p>
	 *
	 */
	public void stk_pack_unit_dmn_qty(float value) {
		setConstNumber(offset + 37, $stk_pack_unit_dmn_qty, value);
	}

	/**
	 * Inventory unit base qty. (SKU) 在庫単位基準数量（荷）.<p>
	 *
	 */
	public void stk_pack_unit_dmn_qty(double value) {
		setConstNumber(offset + 37, $stk_pack_unit_dmn_qty, value);
	}


	/**
	 * Conversion qty. per inventory (SKU) 在庫単位換算数量（荷）.<p>
	 *
	 */
	public MCNumber stk_pack_unit_conv_qty() {
		return getConstNumber(offset + 38, $stk_pack_unit_conv_qty);
	}

	/**
	 * Conversion qty. per inventory (SKU) 在庫単位換算数量（荷）.<p>
	 *
	 */
	public void stk_pack_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 38, $stk_pack_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. per inventory (SKU) 在庫単位換算数量（荷）.<p>
	 *
	 */
	public void stk_pack_unit_conv_qty(int value) {
		setConstNumber(offset + 38, $stk_pack_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. per inventory (SKU) 在庫単位換算数量（荷）.<p>
	 *
	 */
	public void stk_pack_unit_conv_qty(long value) {
		setConstNumber(offset + 38, $stk_pack_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. per inventory (SKU) 在庫単位換算数量（荷）.<p>
	 *
	 */
	public void stk_pack_unit_conv_qty(float value) {
		setConstNumber(offset + 38, $stk_pack_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. per inventory (SKU) 在庫単位換算数量（荷）.<p>
	 *
	 */
	public void stk_pack_unit_conv_qty(double value) {
		setConstNumber(offset + 38, $stk_pack_unit_conv_qty, value);
	}


	/**
	 * Inventory unit rounding type (SKU) 在庫単位端数処理区分（荷）.<p>
	 *
	 */
	public String stk_pack_unit_rnd_typ() {
		return getConstString(offset + 39, $stk_pack_unit_rnd_typ);
	}

	/**
	 * Inventory unit rounding type (SKU) 在庫単位端数処理区分（荷）.<p>
	 *
	 */
	public void stk_pack_unit_rnd_typ(String value) {
		setConstString(offset + 39, $stk_pack_unit_rnd_typ, value);
	}


	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public MCNumber stk_base_unit_qty() {
		return getConstNumber(offset + 40, $stk_base_unit_qty);
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public void stk_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 40, $stk_base_unit_qty, value);
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public void stk_base_unit_qty(int value) {
		setConstNumber(offset + 40, $stk_base_unit_qty, value);
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public void stk_base_unit_qty(long value) {
		setConstNumber(offset + 40, $stk_base_unit_qty, value);
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public void stk_base_unit_qty(float value) {
		setConstNumber(offset + 40, $stk_base_unit_qty, value);
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public void stk_base_unit_qty(double value) {
		setConstNumber(offset + 40, $stk_base_unit_qty, value);
	}


	/**
	 * Inventory unit (Base unit) 在庫単位（基）.<p>
	 *
	 */
	public String stk_base_unit_cd() {
		return getConstString(offset + 41, $stk_base_unit_cd);
	}

	/**
	 * Inventory unit (Base unit) 在庫単位（基）.<p>
	 *
	 */
	public void stk_base_unit_cd(String value) {
		setConstString(offset + 41, $stk_base_unit_cd, value);
	}


	/**
	 * Inventory unit name (Base unit) 在庫単位名（基）.<p>
	 *
	 */
	public String stk_base_unit_nm() {
		return getConstString(offset + 42, $stk_base_unit_nm);
	}

	/**
	 * Inventory unit name (Base unit) 在庫単位名（基）.<p>
	 *
	 */
	public void stk_base_unit_nm(String value) {
		setConstString(offset + 42, $stk_base_unit_nm, value);
	}


	/**
	 * Inventory amount number of decimal places (Base) 在庫単位小数部有効桁数（基）.<p>
	 *
	 */
	public MCNumber stk_base_unit_dec_place() {
		return getConstNumber(offset + 43, $stk_base_unit_dec_place);
	}

	/**
	 * Inventory amount number of decimal places (Base) 在庫単位小数部有効桁数（基）.<p>
	 *
	 */
	public void stk_base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 43, $stk_base_unit_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places (Base) 在庫単位小数部有効桁数（基）.<p>
	 *
	 */
	public void stk_base_unit_dec_place(int value) {
		setConstNumber(offset + 43, $stk_base_unit_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places (Base) 在庫単位小数部有効桁数（基）.<p>
	 *
	 */
	public void stk_base_unit_dec_place(long value) {
		setConstNumber(offset + 43, $stk_base_unit_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places (Base) 在庫単位小数部有効桁数（基）.<p>
	 *
	 */
	public void stk_base_unit_dec_place(float value) {
		setConstNumber(offset + 43, $stk_base_unit_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places (Base) 在庫単位小数部有効桁数（基）.<p>
	 *
	 */
	public void stk_base_unit_dec_place(double value) {
		setConstNumber(offset + 43, $stk_base_unit_dec_place, value);
	}


	/**
	 * Inventory unit rounding type (Base) 在庫単位端数処理区分（基）.<p>
	 *
	 */
	public String stk_base_unit_rnd_typ() {
		return getConstString(offset + 44, $stk_base_unit_rnd_typ);
	}

	/**
	 * Inventory unit rounding type (Base) 在庫単位端数処理区分（基）.<p>
	 *
	 */
	public void stk_base_unit_rnd_typ(String value) {
		setConstString(offset + 44, $stk_base_unit_rnd_typ, value);
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
	 * SKU 荷姿単位.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 46, $pack_unit_cd);
	}

	/**
	 * SKU 荷姿単位.<p>
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
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_unit_dec_place() {
		return getConstNumber(offset + 48, $pack_unit_dec_place);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 48, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(int value) {
		setConstNumber(offset + 48, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(long value) {
		setConstNumber(offset + 48, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(float value) {
		setConstNumber(offset + 48, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(double value) {
		setConstNumber(offset + 48, $pack_unit_dec_place, value);
	}


	/**
	 * SKU base qty. 荷姿基準数量.<p>
	 *
	 */
	public MCNumber pack_unit_dmn_qty() {
		return getConstNumber(offset + 49, $pack_unit_dmn_qty);
	}

	/**
	 * SKU base qty. 荷姿基準数量.<p>
	 *
	 */
	public void pack_unit_dmn_qty(MCNumber value) {
		setConstNumber(offset + 49, $pack_unit_dmn_qty, value);
	}

	/**
	 * SKU base qty. 荷姿基準数量.<p>
	 *
	 */
	public void pack_unit_dmn_qty(int value) {
		setConstNumber(offset + 49, $pack_unit_dmn_qty, value);
	}

	/**
	 * SKU base qty. 荷姿基準数量.<p>
	 *
	 */
	public void pack_unit_dmn_qty(long value) {
		setConstNumber(offset + 49, $pack_unit_dmn_qty, value);
	}

	/**
	 * SKU base qty. 荷姿基準数量.<p>
	 *
	 */
	public void pack_unit_dmn_qty(float value) {
		setConstNumber(offset + 49, $pack_unit_dmn_qty, value);
	}

	/**
	 * SKU base qty. 荷姿基準数量.<p>
	 *
	 */
	public void pack_unit_dmn_qty(double value) {
		setConstNumber(offset + 49, $pack_unit_dmn_qty, value);
	}


	/**
	 * SKU conversion qty. 荷姿換算数量.<p>
	 *
	 */
	public MCNumber pack_unit_conv_qty() {
		return getConstNumber(offset + 50, $pack_unit_conv_qty);
	}

	/**
	 * SKU conversion qty. 荷姿換算数量.<p>
	 *
	 */
	public void pack_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 50, $pack_unit_conv_qty, value);
	}

	/**
	 * SKU conversion qty. 荷姿換算数量.<p>
	 *
	 */
	public void pack_unit_conv_qty(int value) {
		setConstNumber(offset + 50, $pack_unit_conv_qty, value);
	}

	/**
	 * SKU conversion qty. 荷姿換算数量.<p>
	 *
	 */
	public void pack_unit_conv_qty(long value) {
		setConstNumber(offset + 50, $pack_unit_conv_qty, value);
	}

	/**
	 * SKU conversion qty. 荷姿換算数量.<p>
	 *
	 */
	public void pack_unit_conv_qty(float value) {
		setConstNumber(offset + 50, $pack_unit_conv_qty, value);
	}

	/**
	 * SKU conversion qty. 荷姿換算数量.<p>
	 *
	 */
	public void pack_unit_conv_qty(double value) {
		setConstNumber(offset + 50, $pack_unit_conv_qty, value);
	}


	/**
	 * SKU rounding type 荷姿単位端数処理区分.<p>
	 *
	 */
	public String pack_unit_rnd_typ() {
		return getConstString(offset + 51, $pack_unit_rnd_typ);
	}

	/**
	 * SKU rounding type 荷姿単位端数処理区分.<p>
	 *
	 */
	public void pack_unit_rnd_typ(String value) {
		setConstString(offset + 51, $pack_unit_rnd_typ, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 52, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 52, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 52, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 52, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 52, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 52, $base_unit_qty, value);
	}


	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 53, $base_unit_cd);
	}

	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 53, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 54, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 54, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 55, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 55, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 55, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 55, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 55, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 55, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 56, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 56, $base_unit_rnd_typ, value);
	}


	/**
	 * SKU transfer qty. (SKU) 荷姿振替数量（荷）.<p>
	 *
	 */
	public MCNumber pack_xfr_pack_unit_qty() {
		return getConstNumber(offset + 57, $pack_xfr_pack_unit_qty);
	}

	/**
	 * SKU transfer qty. (SKU) 荷姿振替数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 57, $pack_xfr_pack_unit_qty, value);
	}

	/**
	 * SKU transfer qty. (SKU) 荷姿振替数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(int value) {
		setConstNumber(offset + 57, $pack_xfr_pack_unit_qty, value);
	}

	/**
	 * SKU transfer qty. (SKU) 荷姿振替数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(long value) {
		setConstNumber(offset + 57, $pack_xfr_pack_unit_qty, value);
	}

	/**
	 * SKU transfer qty. (SKU) 荷姿振替数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(float value) {
		setConstNumber(offset + 57, $pack_xfr_pack_unit_qty, value);
	}

	/**
	 * SKU transfer qty. (SKU) 荷姿振替数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(double value) {
		setConstNumber(offset + 57, $pack_xfr_pack_unit_qty, value);
	}


	/**
	 * SKU transfer unit (SKU) 荷姿振替単位（荷）.<p>
	 *
	 */
	public String pack_xfr_pack_unit_cd() {
		return getConstString(offset + 58, $pack_xfr_pack_unit_cd);
	}

	/**
	 * SKU transfer unit (SKU) 荷姿振替単位（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_cd(String value) {
		setConstString(offset + 58, $pack_xfr_pack_unit_cd, value);
	}


	/**
	 * SKU transfer unit name (SKU) 荷姿振替単位名（荷）.<p>
	 *
	 */
	public String pack_xfr_pack_unit_nm() {
		return getConstString(offset + 59, $pack_xfr_pack_unit_nm);
	}

	/**
	 * SKU transfer unit name (SKU) 荷姿振替単位名（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_nm(String value) {
		setConstString(offset + 59, $pack_xfr_pack_unit_nm, value);
	}


	/**
	 * Number of decimal places for SKU transfer (SKU) 荷姿振替小数部有効桁数（荷）.<p>
	 *
	 */
	public MCNumber pack_xfr_pack_unit_dec_place() {
		return getConstNumber(offset + 60, $pack_xfr_pack_unit_dec_place);
	}

	/**
	 * Number of decimal places for SKU transfer (SKU) 荷姿振替小数部有効桁数（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 60, $pack_xfr_pack_unit_dec_place, value);
	}

	/**
	 * Number of decimal places for SKU transfer (SKU) 荷姿振替小数部有効桁数（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dec_place(int value) {
		setConstNumber(offset + 60, $pack_xfr_pack_unit_dec_place, value);
	}

	/**
	 * Number of decimal places for SKU transfer (SKU) 荷姿振替小数部有効桁数（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dec_place(long value) {
		setConstNumber(offset + 60, $pack_xfr_pack_unit_dec_place, value);
	}

	/**
	 * Number of decimal places for SKU transfer (SKU) 荷姿振替小数部有効桁数（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dec_place(float value) {
		setConstNumber(offset + 60, $pack_xfr_pack_unit_dec_place, value);
	}

	/**
	 * Number of decimal places for SKU transfer (SKU) 荷姿振替小数部有効桁数（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dec_place(double value) {
		setConstNumber(offset + 60, $pack_xfr_pack_unit_dec_place, value);
	}


	/**
	 * SKU transfer base qty. (SKU) 荷姿振替基準数量（荷）.<p>
	 *
	 */
	public MCNumber pack_xfr_pack_unit_dmn_qty() {
		return getConstNumber(offset + 61, $pack_xfr_pack_unit_dmn_qty);
	}

	/**
	 * SKU transfer base qty. (SKU) 荷姿振替基準数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dmn_qty(MCNumber value) {
		setConstNumber(offset + 61, $pack_xfr_pack_unit_dmn_qty, value);
	}

	/**
	 * SKU transfer base qty. (SKU) 荷姿振替基準数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dmn_qty(int value) {
		setConstNumber(offset + 61, $pack_xfr_pack_unit_dmn_qty, value);
	}

	/**
	 * SKU transfer base qty. (SKU) 荷姿振替基準数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dmn_qty(long value) {
		setConstNumber(offset + 61, $pack_xfr_pack_unit_dmn_qty, value);
	}

	/**
	 * SKU transfer base qty. (SKU) 荷姿振替基準数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dmn_qty(float value) {
		setConstNumber(offset + 61, $pack_xfr_pack_unit_dmn_qty, value);
	}

	/**
	 * SKU transfer base qty. (SKU) 荷姿振替基準数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dmn_qty(double value) {
		setConstNumber(offset + 61, $pack_xfr_pack_unit_dmn_qty, value);
	}


	/**
	 * SKU transfer conversion qty. (SKU) 荷姿振替換算数量（荷）.<p>
	 *
	 */
	public MCNumber pack_xfr_pack_unit_conv_qty() {
		return getConstNumber(offset + 62, $pack_xfr_pack_unit_conv_qty);
	}

	/**
	 * SKU transfer conversion qty. (SKU) 荷姿振替換算数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 62, $pack_xfr_pack_unit_conv_qty, value);
	}

	/**
	 * SKU transfer conversion qty. (SKU) 荷姿振替換算数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_conv_qty(int value) {
		setConstNumber(offset + 62, $pack_xfr_pack_unit_conv_qty, value);
	}

	/**
	 * SKU transfer conversion qty. (SKU) 荷姿振替換算数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_conv_qty(long value) {
		setConstNumber(offset + 62, $pack_xfr_pack_unit_conv_qty, value);
	}

	/**
	 * SKU transfer conversion qty. (SKU) 荷姿振替換算数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_conv_qty(float value) {
		setConstNumber(offset + 62, $pack_xfr_pack_unit_conv_qty, value);
	}

	/**
	 * SKU transfer conversion qty. (SKU) 荷姿振替換算数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_conv_qty(double value) {
		setConstNumber(offset + 62, $pack_xfr_pack_unit_conv_qty, value);
	}


	/**
	 * SKU transfer qty. (Base) 荷姿振替数量（基）.<p>
	 *
	 */
	public MCNumber pack_xfr_base_unit_qty() {
		return getConstNumber(offset + 63, $pack_xfr_base_unit_qty);
	}

	/**
	 * SKU transfer qty. (Base) 荷姿振替数量（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 63, $pack_xfr_base_unit_qty, value);
	}

	/**
	 * SKU transfer qty. (Base) 荷姿振替数量（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(int value) {
		setConstNumber(offset + 63, $pack_xfr_base_unit_qty, value);
	}

	/**
	 * SKU transfer qty. (Base) 荷姿振替数量（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(long value) {
		setConstNumber(offset + 63, $pack_xfr_base_unit_qty, value);
	}

	/**
	 * SKU transfer qty. (Base) 荷姿振替数量（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(float value) {
		setConstNumber(offset + 63, $pack_xfr_base_unit_qty, value);
	}

	/**
	 * SKU transfer qty. (Base) 荷姿振替数量（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(double value) {
		setConstNumber(offset + 63, $pack_xfr_base_unit_qty, value);
	}


	/**
	 * SKU transfer unit (Base) 荷姿振替単位（基）.<p>
	 *
	 */
	public String pack_xfr_base_unit_cd() {
		return getConstString(offset + 64, $pack_xfr_base_unit_cd);
	}

	/**
	 * SKU transfer unit (Base) 荷姿振替単位（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_cd(String value) {
		setConstString(offset + 64, $pack_xfr_base_unit_cd, value);
	}


	/**
	 * SKU transfer unit name (Base) 荷姿振替単位名（基）.<p>
	 *
	 */
	public String pack_xfr_base_unit_nm() {
		return getConstString(offset + 65, $pack_xfr_base_unit_nm);
	}

	/**
	 * SKU transfer unit name (Base) 荷姿振替単位名（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_nm(String value) {
		setConstString(offset + 65, $pack_xfr_base_unit_nm, value);
	}


	/**
	 * Number of decimal places for SKU transfer (Base) 荷姿振替小数部有効桁数（基）.<p>
	 *
	 */
	public MCNumber pack_xfr_base_unit_dec_place() {
		return getConstNumber(offset + 66, $pack_xfr_base_unit_dec_place);
	}

	/**
	 * Number of decimal places for SKU transfer (Base) 荷姿振替小数部有効桁数（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 66, $pack_xfr_base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places for SKU transfer (Base) 荷姿振替小数部有効桁数（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_dec_place(int value) {
		setConstNumber(offset + 66, $pack_xfr_base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places for SKU transfer (Base) 荷姿振替小数部有効桁数（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_dec_place(long value) {
		setConstNumber(offset + 66, $pack_xfr_base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places for SKU transfer (Base) 荷姿振替小数部有効桁数（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_dec_place(float value) {
		setConstNumber(offset + 66, $pack_xfr_base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places for SKU transfer (Base) 荷姿振替小数部有効桁数（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_dec_place(double value) {
		setConstNumber(offset + 66, $pack_xfr_base_unit_dec_place, value);
	}


	/**
	 * SKU transfer rounding process type (Base) 荷姿振替端数処理区分（基）.<p>
	 *
	 */
	public String pack_xfr_base_unit_rnd_typ() {
		return getConstString(offset + 67, $pack_xfr_base_unit_rnd_typ);
	}

	/**
	 * SKU transfer rounding process type (Base) 荷姿振替端数処理区分（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_rnd_typ(String value) {
		setConstString(offset + 67, $pack_xfr_base_unit_rnd_typ, value);
	}


	/**
	 * Defective reason 不良理由.<p>
	 *
	 */
	public String dfct_rsn_cd() {
		return getConstString(offset + 68, $dfct_rsn_cd);
	}

	/**
	 * Defective reason 不良理由.<p>
	 *
	 */
	public void dfct_rsn_cd(String value) {
		setConstString(offset + 68, $dfct_rsn_cd, value);
	}


	/**
	 * Defective reason name 不良理由名.<p>
	 *
	 */
	public String dfct_rsn_nm() {
		return getConstString(offset + 69, $dfct_rsn_nm);
	}

	/**
	 * Defective reason name 不良理由名.<p>
	 *
	 */
	public void dfct_rsn_nm(String value) {
		setConstString(offset + 69, $dfct_rsn_nm, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 70, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 70, $ac_dt, value);
	}


	/**
	 * Inspection result details No. 検査実績明細ＮＯ.<p>
	 *
	 */
	public String insp_act_d_no() {
		return getConstString(offset + 71, $insp_act_d_no);
	}

	/**
	 * Inspection result details No. 検査実績明細ＮＯ.<p>
	 *
	 */
	public void insp_act_d_no(String value) {
		setConstString(offset + 71, $insp_act_d_no, value);
	}


	/**
	 * Inspection decision details No. 検査判定明細ＮＯ.<p>
	 *
	 */
	public String insp_judg_d_no() {
		return getConstString(offset + 72, $insp_judg_d_no);
	}

	/**
	 * Inspection decision details No. 検査判定明細ＮＯ.<p>
	 *
	 */
	public void insp_judg_d_no(String value) {
		setConstString(offset + 72, $insp_judg_d_no, value);
	}


	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public String insp_act_no() {
		return getConstString(offset + 73, $insp_act_no);
	}

	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public void insp_act_no(String value) {
		setConstString(offset + 73, $insp_act_no, value);
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 74, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 74, $insp_no, value);
	}


	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 75, $intr_rmrks);
	}

	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 75, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 76, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 76, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 77, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 77, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 78, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 78, $sub_char3, value);
	}


	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public boolean lims_flg() {
		return getConstBoolean(offset + 79, $lims_flg);
	}

	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public void lims_flg(boolean value) {
		setConstBoolean(offset + 79, $lims_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 80, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 80, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 81, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 81, $ext_sys_nm, value);
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
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		if ($stk_pack_unit_cd.equalsIgnoreCase(name)) {
			return stk_pack_unit_cd();
		}
		if ($stk_pack_unit_nm.equalsIgnoreCase(name)) {
			return stk_pack_unit_nm();
		}
		if ($stk_pack_unit_rnd_typ.equalsIgnoreCase(name)) {
			return stk_pack_unit_rnd_typ();
		}
		if ($stk_base_unit_cd.equalsIgnoreCase(name)) {
			return stk_base_unit_cd();
		}
		if ($stk_base_unit_nm.equalsIgnoreCase(name)) {
			return stk_base_unit_nm();
		}
		if ($stk_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return stk_base_unit_rnd_typ();
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
		if ($pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_cd();
		}
		if ($pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_nm();
		}
		if ($pack_xfr_base_unit_cd.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_cd();
		}
		if ($pack_xfr_base_unit_nm.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_nm();
		}
		if ($pack_xfr_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_rnd_typ();
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			return dfct_rsn_cd();
		}
		if ($dfct_rsn_nm.equalsIgnoreCase(name)) {
			return dfct_rsn_nm();
		}
		if ($insp_act_d_no.equalsIgnoreCase(name)) {
			return insp_act_d_no();
		}
		if ($insp_judg_d_no.equalsIgnoreCase(name)) {
			return insp_judg_d_no();
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			return insp_act_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
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
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_insp_act_d_no.equalsIgnoreCase(name)) {
			return ext_insp_act_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			return stk_pack_unit_qty();
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			return stk_pack_unit_dec_place();
		}
		if ($stk_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			return stk_pack_unit_dmn_qty();
		}
		if ($stk_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			return stk_pack_unit_conv_qty();
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			return stk_base_unit_qty();
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			return stk_base_unit_dec_place();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			return pack_unit_dmn_qty();
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			return pack_unit_conv_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_qty();
		}
		if ($pack_xfr_pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_dec_place();
		}
		if ($pack_xfr_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_dmn_qty();
		}
		if ($pack_xfr_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_conv_qty();
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_qty();
		}
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		if ($stk_pack_unit_cd.equalsIgnoreCase(name)) {
			return stk_pack_unit_cd();
		}
		if ($stk_pack_unit_nm.equalsIgnoreCase(name)) {
			return stk_pack_unit_nm();
		}
		if ($stk_pack_unit_rnd_typ.equalsIgnoreCase(name)) {
			return stk_pack_unit_rnd_typ();
		}
		if ($stk_base_unit_cd.equalsIgnoreCase(name)) {
			return stk_base_unit_cd();
		}
		if ($stk_base_unit_nm.equalsIgnoreCase(name)) {
			return stk_base_unit_nm();
		}
		if ($stk_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return stk_base_unit_rnd_typ();
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
		if ($pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_cd();
		}
		if ($pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_nm();
		}
		if ($pack_xfr_base_unit_cd.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_cd();
		}
		if ($pack_xfr_base_unit_nm.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_nm();
		}
		if ($pack_xfr_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_rnd_typ();
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			return dfct_rsn_cd();
		}
		if ($dfct_rsn_nm.equalsIgnoreCase(name)) {
			return dfct_rsn_nm();
		}
		if ($insp_act_d_no.equalsIgnoreCase(name)) {
			return insp_act_d_no();
		}
		if ($insp_judg_d_no.equalsIgnoreCase(name)) {
			return insp_judg_d_no();
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			return insp_act_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
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
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_insp_act_d_no.equalsIgnoreCase(name)) {
			return ext_insp_act_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			return stk_pack_unit_qty();
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			return stk_pack_unit_dec_place();
		}
		if ($stk_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			return stk_pack_unit_dmn_qty();
		}
		if ($stk_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			return stk_pack_unit_conv_qty();
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			return stk_base_unit_qty();
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			return stk_base_unit_dec_place();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			return pack_unit_dmn_qty();
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			return pack_unit_conv_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_qty();
		}
		if ($pack_xfr_pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_dec_place();
		}
		if ($pack_xfr_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_dmn_qty();
		}
		if ($pack_xfr_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_conv_qty();
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_qty();
		}
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($stk_pack_unit_cd.equalsIgnoreCase(name)) {
			stk_pack_unit_cd(value);
			return;
		}
		if ($stk_pack_unit_nm.equalsIgnoreCase(name)) {
			stk_pack_unit_nm(value);
			return;
		}
		if ($stk_pack_unit_rnd_typ.equalsIgnoreCase(name)) {
			stk_pack_unit_rnd_typ(value);
			return;
		}
		if ($stk_base_unit_cd.equalsIgnoreCase(name)) {
			stk_base_unit_cd(value);
			return;
		}
		if ($stk_base_unit_nm.equalsIgnoreCase(name)) {
			stk_base_unit_nm(value);
			return;
		}
		if ($stk_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			stk_base_unit_rnd_typ(value);
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
		if ($pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_cd(value);
			return;
		}
		if ($pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_nm(value);
			return;
		}
		if ($pack_xfr_base_unit_cd.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_cd(value);
			return;
		}
		if ($pack_xfr_base_unit_nm.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_nm(value);
			return;
		}
		if ($pack_xfr_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_rnd_typ(value);
			return;
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			dfct_rsn_cd(value);
			return;
		}
		if ($dfct_rsn_nm.equalsIgnoreCase(name)) {
			dfct_rsn_nm(value);
			return;
		}
		if ($insp_act_d_no.equalsIgnoreCase(name)) {
			insp_act_d_no(value);
			return;
		}
		if ($insp_judg_d_no.equalsIgnoreCase(name)) {
			insp_judg_d_no(value);
			return;
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			insp_act_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
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
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_insp_act_d_no.equalsIgnoreCase(name)) {
			ext_insp_act_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			stk_pack_unit_dec_place(value);
			return;
		}
		if ($stk_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_dmn_qty(value);
			return;
		}
		if ($stk_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_conv_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			stk_base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
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
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($pack_xfr_pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_dec_place(value);
			return;
		}
		if ($pack_xfr_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_xfr_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_conv_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			stk_pack_unit_dec_place(value);
			return;
		}
		if ($stk_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_dmn_qty(value);
			return;
		}
		if ($stk_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_conv_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			stk_base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
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
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($pack_xfr_pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_dec_place(value);
			return;
		}
		if ($pack_xfr_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_xfr_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_conv_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			stk_pack_unit_dec_place(value);
			return;
		}
		if ($stk_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_dmn_qty(value);
			return;
		}
		if ($stk_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_conv_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			stk_base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
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
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($pack_xfr_pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_dec_place(value);
			return;
		}
		if ($pack_xfr_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_xfr_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_conv_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			stk_pack_unit_dec_place(value);
			return;
		}
		if ($stk_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_dmn_qty(value);
			return;
		}
		if ($stk_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_conv_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			stk_base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
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
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($pack_xfr_pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_dec_place(value);
			return;
		}
		if ($pack_xfr_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_xfr_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_conv_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			stk_pack_unit_dec_place(value);
			return;
		}
		if ($stk_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_dmn_qty(value);
			return;
		}
		if ($stk_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_conv_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			stk_base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
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
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($pack_xfr_pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_dec_place(value);
			return;
		}
		if ($pack_xfr_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_xfr_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_conv_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($stk_pack_unit_cd.equalsIgnoreCase(name)) {
			stk_pack_unit_cd(value);
			return;
		}
		if ($stk_pack_unit_nm.equalsIgnoreCase(name)) {
			stk_pack_unit_nm(value);
			return;
		}
		if ($stk_pack_unit_rnd_typ.equalsIgnoreCase(name)) {
			stk_pack_unit_rnd_typ(value);
			return;
		}
		if ($stk_base_unit_cd.equalsIgnoreCase(name)) {
			stk_base_unit_cd(value);
			return;
		}
		if ($stk_base_unit_nm.equalsIgnoreCase(name)) {
			stk_base_unit_nm(value);
			return;
		}
		if ($stk_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			stk_base_unit_rnd_typ(value);
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
		if ($pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_cd(value);
			return;
		}
		if ($pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_nm(value);
			return;
		}
		if ($pack_xfr_base_unit_cd.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_cd(value);
			return;
		}
		if ($pack_xfr_base_unit_nm.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_nm(value);
			return;
		}
		if ($pack_xfr_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_rnd_typ(value);
			return;
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			dfct_rsn_cd(value);
			return;
		}
		if ($dfct_rsn_nm.equalsIgnoreCase(name)) {
			dfct_rsn_nm(value);
			return;
		}
		if ($insp_act_d_no.equalsIgnoreCase(name)) {
			insp_act_d_no(value);
			return;
		}
		if ($insp_judg_d_no.equalsIgnoreCase(name)) {
			insp_judg_d_no(value);
			return;
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			insp_act_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
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
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_insp_act_d_no.equalsIgnoreCase(name)) {
			ext_insp_act_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			stk_pack_unit_dec_place(value);
			return;
		}
		if ($stk_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_dmn_qty(value);
			return;
		}
		if ($stk_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_conv_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			stk_base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
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
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($pack_xfr_pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_dec_place(value);
			return;
		}
		if ($pack_xfr_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_xfr_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_conv_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			stk_pack_unit_dec_place(value);
			return;
		}
		if ($stk_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_dmn_qty(value);
			return;
		}
		if ($stk_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_conv_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			stk_base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
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
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($pack_xfr_pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_dec_place(value);
			return;
		}
		if ($pack_xfr_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_xfr_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_conv_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			stk_pack_unit_dec_place(value);
			return;
		}
		if ($stk_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_dmn_qty(value);
			return;
		}
		if ($stk_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_conv_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			stk_base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
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
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($pack_xfr_pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_dec_place(value);
			return;
		}
		if ($pack_xfr_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_xfr_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_conv_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			stk_pack_unit_dec_place(value);
			return;
		}
		if ($stk_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_dmn_qty(value);
			return;
		}
		if ($stk_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_conv_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			stk_base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
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
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($pack_xfr_pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_dec_place(value);
			return;
		}
		if ($pack_xfr_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_xfr_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_conv_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			stk_pack_unit_dec_place(value);
			return;
		}
		if ($stk_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_dmn_qty(value);
			return;
		}
		if ($stk_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_conv_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			stk_base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
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
		if ($pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($pack_xfr_pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_dec_place(value);
			return;
		}
		if ($pack_xfr_pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_xfr_pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_conv_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_qty.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty(value);
			return;
		}
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

