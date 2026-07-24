package mcframe.clientMSBF.MSBFP0060;

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
 * ブロック"RsltTtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltTtlR_MC_A extends MCConstRow {

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
	 * Inventory location cd. 在庫場所ＣＤ.<p>
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
	 * Inventory rack/line cd. 在庫棚・ラインＣＤ.<p>
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
	 * Defective reason cd. 不良理由ＣＤ.<p>
	 *
	 */
	public static final String $dfct_rsn_cd = "dfct_rsn_cd";
	/**
	 * Defective reason name 不良理由名.<p>
	 *
	 */
	public static final String $dfct_rsn_nm = "dfct_rsn_nm";
	public static final String $ac_dt_p = "ac_dt_p";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Base 基準.<p>
	 *
	 */
	public static final String $base_flg = "base_flg";
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
	public static final String $stk_pack_unit_qty_p = "stk_pack_unit_qty_p";
	/**
	 * Inventory unit cd. (SKU) 在庫単位（荷）ＣＤ.<p>
	 *
	 */
	public static final String $stk_pack_unit_cd = "stk_pack_unit_cd";
	/**
	 * Inventory unit name (SKU) 在庫単位名（荷）.<p>
	 *
	 */
	public static final String $stk_pack_unit_nm = "stk_pack_unit_nm";
	/**
	 * Inventory SKU number of decimal places 在庫荷姿単位小数部有効桁数.<p>
	 *
	 */
	public static final String $stk_pack_unit_dec_place = "stk_pack_unit_dec_place";
	public static final String $stk_base_unit_qty_p = "stk_base_unit_qty_p";
	/**
	 * Inventory unit cd. (Base unit) 在庫単位（基）ＣＤ.<p>
	 *
	 */
	public static final String $stk_base_unit_cd = "stk_base_unit_cd";
	/**
	 * Inventory unit name (Base unit) 在庫単位名（基）.<p>
	 *
	 */
	public static final String $stk_base_unit_nm = "stk_base_unit_nm";
	/**
	 * Inventory base unit number of decimal places 在庫基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $stk_base_unit_dec_place = "stk_base_unit_dec_place";
	public static final String $pack_xfr_pack_unit_qty_p = "pack_xfr_pack_unit_qty_p";
	/**
	 * SKU transfer unit (SKU) cd. 荷姿振替単位（荷）ＣＤ.<p>
	 *
	 */
	public static final String $pack_xfr_pack_unit_cd = "pack_xfr_pack_unit_cd";
	/**
	 * SKU transfer unit name (SKU) 荷姿振替単位名（荷）.<p>
	 *
	 */
	public static final String $pack_xfr_pack_unit_nm = "pack_xfr_pack_unit_nm";
	/**
	 * SKU transfer unit number of decimal places 荷姿振替単位小数部有効桁数.<p>
	 *
	 */
	public static final String $pack_xfr_pack_unit_dec_place = "pack_xfr_pack_unit_dec_place";
	/**
	 * SKU transfer SKU base qty. 荷姿振替荷姿基準数量.<p>
	 *
	 */
	public static final String $pack_xfr_pack_unit_dmn_qty = "pack_xfr_pack_unit_dmn_qty";
	/**
	 * SKU transfer SKU conversion qty. 荷姿振替荷姿換算数量.<p>
	 *
	 */
	public static final String $pack_xfr_pack_unit_conv_qty = "pack_xfr_pack_unit_conv_qty";
	public static final String $pack_xfr_base_unit_qty_p = "pack_xfr_base_unit_qty_p";
	/**
	 * SKU transfer unit (Base) cd. 荷姿振替単位（基）ＣＤ.<p>
	 *
	 */
	public static final String $pack_xfr_base_unit_cd = "pack_xfr_base_unit_cd";
	/**
	 * SKU transfer unit name (Base) 荷姿振替単位名（基）.<p>
	 *
	 */
	public static final String $pack_xfr_base_unit_nm = "pack_xfr_base_unit_nm";
	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $pack_xfr_base_unit_dec_place = "pack_xfr_base_unit_dec_place";
	/**
	 * SKU transfer base unit rounding type 荷姿振替基準単位端数処理区分.<p>
	 *
	 */
	public static final String $pack_xfr_base_unit_rnd_typ = "pack_xfr_base_unit_rnd_typ";
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
	public static final String $sno_p = "sno_p";
	public static final String $wrk_no_p = "wrk_no_p";
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
	public static final String $rtn_sts_typ = "rtn_sts_typ";

	public static final String $ac_dt = $ac_dt_p + ".ac_dt";
	public static final String $pack_unit_qty = $pack_unit_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $stk_pack_unit_qty = $stk_pack_unit_qty_p + ".qty";
	public static final String $stk_base_unit_qty = $stk_base_unit_qty_p + ".qty";
	public static final String $pack_xfr_pack_unit_qty = $pack_xfr_pack_unit_qty_p + ".qty";
	public static final String $pack_xfr_base_unit_qty = $pack_xfr_base_unit_qty_p + ".qty";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4 = $sno_p + ".sno4";
	public static final String $wrk_no = $wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $wrk_no_p + ".wrk_nm";

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
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta dfct_rsn_cd_META = createCommonMeta($dfct_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta dfct_rsn_nm_META = createCommonMeta($dfct_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta ac_dt_p_META = createInnerRowMeta($ac_dt_p, mcframe.clientMAUB.MAUBP5220.AcDtR.class);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta base_flg_META = createCommonMeta($base_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pack_unit_qty_p_META = createInnerRowMeta($pack_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pack_unit_dec_place_META = createCommonMeta($pack_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pack_unit_dmn_qty_META = createCommonMeta($pack_unit_dmn_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_conv_qty_META = createCommonMeta($pack_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta stk_pack_unit_qty_p_META = createInnerRowMeta($stk_pack_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta stk_pack_unit_cd_META = createCommonMeta($stk_pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta stk_pack_unit_nm_META = createCommonMeta($stk_pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta stk_pack_unit_dec_place_META = createCommonMeta($stk_pack_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta stk_base_unit_qty_p_META = createInnerRowMeta($stk_base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta stk_base_unit_cd_META = createCommonMeta($stk_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta stk_base_unit_nm_META = createCommonMeta($stk_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta stk_base_unit_dec_place_META = createCommonMeta($stk_base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pack_xfr_pack_unit_qty_p_META = createInnerRowMeta($pack_xfr_pack_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta pack_xfr_pack_unit_cd_META = createCommonMeta($pack_xfr_pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_xfr_pack_unit_nm_META = createCommonMeta($pack_xfr_pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pack_xfr_pack_unit_dec_place_META = createCommonMeta($pack_xfr_pack_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pack_xfr_pack_unit_dmn_qty_META = createCommonMeta($pack_xfr_pack_unit_dmn_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_xfr_pack_unit_conv_qty_META = createCommonMeta($pack_xfr_pack_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_xfr_base_unit_qty_p_META = createInnerRowMeta($pack_xfr_base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta pack_xfr_base_unit_cd_META = createCommonMeta($pack_xfr_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_xfr_base_unit_nm_META = createCommonMeta($pack_xfr_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pack_xfr_base_unit_dec_place_META = createCommonMeta($pack_xfr_base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pack_xfr_base_unit_rnd_typ_META = createCommonMeta($pack_xfr_base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMAUB.MAUBP5070.SnoR.class);
	public static final MCMeta wrk_no_p_META = createInnerRowMeta($wrk_no_p, mcframe.clientMSUB.MSUBP5010.WrkNoR.class);
	public static final MCMeta fix_no_typ_META = createCommonMeta($fix_no_typ, mcframe.commonMS.meta.MS_META.FIX_NO_TYP);
	public static final MCMeta fix_no_typ_nm_META = createCommonMeta($fix_no_typ_nm, mcframe.commonMS.meta.MS_META.FIX_NO_TYP_NM);
	public static final MCMeta fix_no_META = createCommonMeta($fix_no, mcframe.commonMA.meta.MA_META.FIX_NO);
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
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);

	protected static final ConstMetaList<RsltTtlR> constMetas = new ConstMetaList<RsltTtlR>(
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
			quality_typ_META,
			quality_typ_nm_META,
			gd_cd_META,
			gd_nm_META,
			dfct_rsn_cd_META,
			dfct_rsn_nm_META,
			ac_dt_p_META,
			can_ac_dt_META,
			base_flg_META,
			pack_unit_qty_p_META,
			pack_unit_cd_META,
			pack_unit_nm_META,
			pack_unit_dec_place_META,
			pack_unit_dmn_qty_META,
			pack_unit_conv_qty_META,
			base_unit_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			stk_pack_unit_qty_p_META,
			stk_pack_unit_cd_META,
			stk_pack_unit_nm_META,
			stk_pack_unit_dec_place_META,
			stk_base_unit_qty_p_META,
			stk_base_unit_cd_META,
			stk_base_unit_nm_META,
			stk_base_unit_dec_place_META,
			pack_xfr_pack_unit_qty_p_META,
			pack_xfr_pack_unit_cd_META,
			pack_xfr_pack_unit_nm_META,
			pack_xfr_pack_unit_dec_place_META,
			pack_xfr_pack_unit_dmn_qty_META,
			pack_xfr_pack_unit_conv_qty_META,
			pack_xfr_base_unit_qty_p_META,
			pack_xfr_base_unit_cd_META,
			pack_xfr_base_unit_nm_META,
			pack_xfr_base_unit_dec_place_META,
			pack_xfr_base_unit_rnd_typ_META,
			stk_insp_typ_META,
			stk_insp_typ_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			sno_p_META,
			wrk_no_p_META,
			fix_no_typ_META,
			fix_no_typ_nm_META,
			fix_no_META,
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
			ext_insp_act_d_no_META,
			rtn_sts_typ_META
		},
		new String[][]{
			{
				"ac_dt",
				"pack_unit_qty",
				"base_unit_qty",
				"stk_pack_unit_qty",
				"stk_base_unit_qty",
				"pack_xfr_pack_unit_qty",
				"pack_xfr_base_unit_qty",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm"
			},
			{
				$ac_dt,
				$pack_unit_qty,
				$base_unit_qty,
				$stk_pack_unit_qty,
				$stk_base_unit_qty,
				$pack_xfr_pack_unit_qty,
				$pack_xfr_base_unit_qty,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm
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
				{$dfct_rsn_cd, "biz_rsn_nm"},	// dfct_rsn_cd
				{$pack_unit_cd, "unit_nm;dec_place;conv_base_qty;conv_qty"}	// pack_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$pack_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// pack_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$pack_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// pack_unit_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$str_ln_tgt_flg, "STR_LN"},	// str_ln_tgt_flg
				{$str_ln_cd, "STR_LN"},	// str_ln_cd
				{$str_ln_nm, "STR_LN"},	// str_ln_nm
				{$str_ln_cd_none_flg, "STR_LN"},	// str_ln_cd_none_flg
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
	protected RsltTtlR_MC_A(ConstMetaList<? extends RsltTtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltTtlR clone() {
		return (RsltTtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltTtlR createInstance() {
		return (RsltTtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltTtlR getValues(String... names) {
		return (RsltTtlR) super.getValues(names);
	}



	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
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
	 * Inventory location cd. 在庫場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 4, $loc_cd);
	}

	/**
	 * Inventory location cd. 在庫場所ＣＤ.<p>
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
	 * Inventory rack/line cd. 在庫棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 7, $str_ln_cd);
	}

	/**
	 * Inventory rack/line cd. 在庫棚・ラインＣＤ.<p>
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
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 12, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 12, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 13, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 13, $quality_typ_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 14, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 14, $gd_cd, value);
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
	 * Defective reason cd. 不良理由ＣＤ.<p>
	 *
	 */
	public String dfct_rsn_cd() {
		return getConstString(offset + 16, $dfct_rsn_cd);
	}

	/**
	 * Defective reason cd. 不良理由ＣＤ.<p>
	 *
	 */
	public void dfct_rsn_cd(String value) {
		setConstString(offset + 16, $dfct_rsn_cd, value);
	}


	/**
	 * Defective reason name 不良理由名.<p>
	 *
	 */
	public String dfct_rsn_nm() {
		return getConstString(offset + 17, $dfct_rsn_nm);
	}

	/**
	 * Defective reason name 不良理由名.<p>
	 *
	 */
	public void dfct_rsn_nm(String value) {
		setConstString(offset + 17, $dfct_rsn_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5220.AcDtR ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP5220.AcDtR) getConstInnerRow(offset + 18, $ac_dt_p);
	}
	
	public void ac_dt_p(mcframe.clientMAUB.MAUBP5220.AcDtR row){
		setConstInnerRow(offset + 18, $ac_dt_p, row);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 19, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 19, $can_ac_dt, value);
	}


	/**
	 * Base 基準.<p>
	 *
	 */
	public boolean base_flg() {
		return getConstBoolean(offset + 20, $base_flg);
	}

	/**
	 * Base 基準.<p>
	 *
	 */
	public void base_flg(boolean value) {
		setConstBoolean(offset + 20, $base_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR pack_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 21, $pack_unit_qty_p);
	}
	
	public void pack_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 21, $pack_unit_qty_p, row);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 22, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 22, $pack_unit_cd, value);
	}


	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 23, $pack_unit_nm);
	}

	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 23, $pack_unit_nm, value);
	}


	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_unit_dec_place() {
		return getConstNumber(offset + 24, $pack_unit_dec_place);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 24, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(int value) {
		setConstNumber(offset + 24, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(long value) {
		setConstNumber(offset + 24, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(float value) {
		setConstNumber(offset + 24, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(double value) {
		setConstNumber(offset + 24, $pack_unit_dec_place, value);
	}


	/**
	 * SKU base qty. 荷姿基準数量.<p>
	 *
	 */
	public MCNumber pack_unit_dmn_qty() {
		return getConstNumber(offset + 25, $pack_unit_dmn_qty);
	}

	/**
	 * SKU base qty. 荷姿基準数量.<p>
	 *
	 */
	public void pack_unit_dmn_qty(MCNumber value) {
		setConstNumber(offset + 25, $pack_unit_dmn_qty, value);
	}

	/**
	 * SKU base qty. 荷姿基準数量.<p>
	 *
	 */
	public void pack_unit_dmn_qty(int value) {
		setConstNumber(offset + 25, $pack_unit_dmn_qty, value);
	}

	/**
	 * SKU base qty. 荷姿基準数量.<p>
	 *
	 */
	public void pack_unit_dmn_qty(long value) {
		setConstNumber(offset + 25, $pack_unit_dmn_qty, value);
	}

	/**
	 * SKU base qty. 荷姿基準数量.<p>
	 *
	 */
	public void pack_unit_dmn_qty(float value) {
		setConstNumber(offset + 25, $pack_unit_dmn_qty, value);
	}

	/**
	 * SKU base qty. 荷姿基準数量.<p>
	 *
	 */
	public void pack_unit_dmn_qty(double value) {
		setConstNumber(offset + 25, $pack_unit_dmn_qty, value);
	}


	/**
	 * SKU conversion qty. 荷姿換算数量.<p>
	 *
	 */
	public MCNumber pack_unit_conv_qty() {
		return getConstNumber(offset + 26, $pack_unit_conv_qty);
	}

	/**
	 * SKU conversion qty. 荷姿換算数量.<p>
	 *
	 */
	public void pack_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 26, $pack_unit_conv_qty, value);
	}

	/**
	 * SKU conversion qty. 荷姿換算数量.<p>
	 *
	 */
	public void pack_unit_conv_qty(int value) {
		setConstNumber(offset + 26, $pack_unit_conv_qty, value);
	}

	/**
	 * SKU conversion qty. 荷姿換算数量.<p>
	 *
	 */
	public void pack_unit_conv_qty(long value) {
		setConstNumber(offset + 26, $pack_unit_conv_qty, value);
	}

	/**
	 * SKU conversion qty. 荷姿換算数量.<p>
	 *
	 */
	public void pack_unit_conv_qty(float value) {
		setConstNumber(offset + 26, $pack_unit_conv_qty, value);
	}

	/**
	 * SKU conversion qty. 荷姿換算数量.<p>
	 *
	 */
	public void pack_unit_conv_qty(double value) {
		setConstNumber(offset + 26, $pack_unit_conv_qty, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 27, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 27, $base_unit_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 28, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 28, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 29, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 29, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 30, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 30, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 30, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 30, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 30, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 30, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 31, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 31, $base_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR stk_pack_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 32, $stk_pack_unit_qty_p);
	}
	
	public void stk_pack_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 32, $stk_pack_unit_qty_p, row);
	}


	/**
	 * Inventory unit cd. (SKU) 在庫単位（荷）ＣＤ.<p>
	 *
	 */
	public String stk_pack_unit_cd() {
		return getConstString(offset + 33, $stk_pack_unit_cd);
	}

	/**
	 * Inventory unit cd. (SKU) 在庫単位（荷）ＣＤ.<p>
	 *
	 */
	public void stk_pack_unit_cd(String value) {
		setConstString(offset + 33, $stk_pack_unit_cd, value);
	}


	/**
	 * Inventory unit name (SKU) 在庫単位名（荷）.<p>
	 *
	 */
	public String stk_pack_unit_nm() {
		return getConstString(offset + 34, $stk_pack_unit_nm);
	}

	/**
	 * Inventory unit name (SKU) 在庫単位名（荷）.<p>
	 *
	 */
	public void stk_pack_unit_nm(String value) {
		setConstString(offset + 34, $stk_pack_unit_nm, value);
	}


	/**
	 * Inventory SKU number of decimal places 在庫荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber stk_pack_unit_dec_place() {
		return getConstNumber(offset + 35, $stk_pack_unit_dec_place);
	}

	/**
	 * Inventory SKU number of decimal places 在庫荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void stk_pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 35, $stk_pack_unit_dec_place, value);
	}

	/**
	 * Inventory SKU number of decimal places 在庫荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void stk_pack_unit_dec_place(int value) {
		setConstNumber(offset + 35, $stk_pack_unit_dec_place, value);
	}

	/**
	 * Inventory SKU number of decimal places 在庫荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void stk_pack_unit_dec_place(long value) {
		setConstNumber(offset + 35, $stk_pack_unit_dec_place, value);
	}

	/**
	 * Inventory SKU number of decimal places 在庫荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void stk_pack_unit_dec_place(float value) {
		setConstNumber(offset + 35, $stk_pack_unit_dec_place, value);
	}

	/**
	 * Inventory SKU number of decimal places 在庫荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void stk_pack_unit_dec_place(double value) {
		setConstNumber(offset + 35, $stk_pack_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR stk_base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 36, $stk_base_unit_qty_p);
	}
	
	public void stk_base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 36, $stk_base_unit_qty_p, row);
	}


	/**
	 * Inventory unit cd. (Base unit) 在庫単位（基）ＣＤ.<p>
	 *
	 */
	public String stk_base_unit_cd() {
		return getConstString(offset + 37, $stk_base_unit_cd);
	}

	/**
	 * Inventory unit cd. (Base unit) 在庫単位（基）ＣＤ.<p>
	 *
	 */
	public void stk_base_unit_cd(String value) {
		setConstString(offset + 37, $stk_base_unit_cd, value);
	}


	/**
	 * Inventory unit name (Base unit) 在庫単位名（基）.<p>
	 *
	 */
	public String stk_base_unit_nm() {
		return getConstString(offset + 38, $stk_base_unit_nm);
	}

	/**
	 * Inventory unit name (Base unit) 在庫単位名（基）.<p>
	 *
	 */
	public void stk_base_unit_nm(String value) {
		setConstString(offset + 38, $stk_base_unit_nm, value);
	}


	/**
	 * Inventory base unit number of decimal places 在庫基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber stk_base_unit_dec_place() {
		return getConstNumber(offset + 39, $stk_base_unit_dec_place);
	}

	/**
	 * Inventory base unit number of decimal places 在庫基準単位小数部有効桁数.<p>
	 *
	 */
	public void stk_base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 39, $stk_base_unit_dec_place, value);
	}

	/**
	 * Inventory base unit number of decimal places 在庫基準単位小数部有効桁数.<p>
	 *
	 */
	public void stk_base_unit_dec_place(int value) {
		setConstNumber(offset + 39, $stk_base_unit_dec_place, value);
	}

	/**
	 * Inventory base unit number of decimal places 在庫基準単位小数部有効桁数.<p>
	 *
	 */
	public void stk_base_unit_dec_place(long value) {
		setConstNumber(offset + 39, $stk_base_unit_dec_place, value);
	}

	/**
	 * Inventory base unit number of decimal places 在庫基準単位小数部有効桁数.<p>
	 *
	 */
	public void stk_base_unit_dec_place(float value) {
		setConstNumber(offset + 39, $stk_base_unit_dec_place, value);
	}

	/**
	 * Inventory base unit number of decimal places 在庫基準単位小数部有効桁数.<p>
	 *
	 */
	public void stk_base_unit_dec_place(double value) {
		setConstNumber(offset + 39, $stk_base_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR pack_xfr_pack_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 40, $pack_xfr_pack_unit_qty_p);
	}
	
	public void pack_xfr_pack_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 40, $pack_xfr_pack_unit_qty_p, row);
	}


	/**
	 * SKU transfer unit (SKU) cd. 荷姿振替単位（荷）ＣＤ.<p>
	 *
	 */
	public String pack_xfr_pack_unit_cd() {
		return getConstString(offset + 41, $pack_xfr_pack_unit_cd);
	}

	/**
	 * SKU transfer unit (SKU) cd. 荷姿振替単位（荷）ＣＤ.<p>
	 *
	 */
	public void pack_xfr_pack_unit_cd(String value) {
		setConstString(offset + 41, $pack_xfr_pack_unit_cd, value);
	}


	/**
	 * SKU transfer unit name (SKU) 荷姿振替単位名（荷）.<p>
	 *
	 */
	public String pack_xfr_pack_unit_nm() {
		return getConstString(offset + 42, $pack_xfr_pack_unit_nm);
	}

	/**
	 * SKU transfer unit name (SKU) 荷姿振替単位名（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_nm(String value) {
		setConstString(offset + 42, $pack_xfr_pack_unit_nm, value);
	}


	/**
	 * SKU transfer unit number of decimal places 荷姿振替単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_xfr_pack_unit_dec_place() {
		return getConstNumber(offset + 43, $pack_xfr_pack_unit_dec_place);
	}

	/**
	 * SKU transfer unit number of decimal places 荷姿振替単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 43, $pack_xfr_pack_unit_dec_place, value);
	}

	/**
	 * SKU transfer unit number of decimal places 荷姿振替単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dec_place(int value) {
		setConstNumber(offset + 43, $pack_xfr_pack_unit_dec_place, value);
	}

	/**
	 * SKU transfer unit number of decimal places 荷姿振替単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dec_place(long value) {
		setConstNumber(offset + 43, $pack_xfr_pack_unit_dec_place, value);
	}

	/**
	 * SKU transfer unit number of decimal places 荷姿振替単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dec_place(float value) {
		setConstNumber(offset + 43, $pack_xfr_pack_unit_dec_place, value);
	}

	/**
	 * SKU transfer unit number of decimal places 荷姿振替単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dec_place(double value) {
		setConstNumber(offset + 43, $pack_xfr_pack_unit_dec_place, value);
	}


	/**
	 * SKU transfer SKU base qty. 荷姿振替荷姿基準数量.<p>
	 *
	 */
	public MCNumber pack_xfr_pack_unit_dmn_qty() {
		return getConstNumber(offset + 44, $pack_xfr_pack_unit_dmn_qty);
	}

	/**
	 * SKU transfer SKU base qty. 荷姿振替荷姿基準数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dmn_qty(MCNumber value) {
		setConstNumber(offset + 44, $pack_xfr_pack_unit_dmn_qty, value);
	}

	/**
	 * SKU transfer SKU base qty. 荷姿振替荷姿基準数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dmn_qty(int value) {
		setConstNumber(offset + 44, $pack_xfr_pack_unit_dmn_qty, value);
	}

	/**
	 * SKU transfer SKU base qty. 荷姿振替荷姿基準数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dmn_qty(long value) {
		setConstNumber(offset + 44, $pack_xfr_pack_unit_dmn_qty, value);
	}

	/**
	 * SKU transfer SKU base qty. 荷姿振替荷姿基準数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dmn_qty(float value) {
		setConstNumber(offset + 44, $pack_xfr_pack_unit_dmn_qty, value);
	}

	/**
	 * SKU transfer SKU base qty. 荷姿振替荷姿基準数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dmn_qty(double value) {
		setConstNumber(offset + 44, $pack_xfr_pack_unit_dmn_qty, value);
	}


	/**
	 * SKU transfer SKU conversion qty. 荷姿振替荷姿換算数量.<p>
	 *
	 */
	public MCNumber pack_xfr_pack_unit_conv_qty() {
		return getConstNumber(offset + 45, $pack_xfr_pack_unit_conv_qty);
	}

	/**
	 * SKU transfer SKU conversion qty. 荷姿振替荷姿換算数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 45, $pack_xfr_pack_unit_conv_qty, value);
	}

	/**
	 * SKU transfer SKU conversion qty. 荷姿振替荷姿換算数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_conv_qty(int value) {
		setConstNumber(offset + 45, $pack_xfr_pack_unit_conv_qty, value);
	}

	/**
	 * SKU transfer SKU conversion qty. 荷姿振替荷姿換算数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_conv_qty(long value) {
		setConstNumber(offset + 45, $pack_xfr_pack_unit_conv_qty, value);
	}

	/**
	 * SKU transfer SKU conversion qty. 荷姿振替荷姿換算数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_conv_qty(float value) {
		setConstNumber(offset + 45, $pack_xfr_pack_unit_conv_qty, value);
	}

	/**
	 * SKU transfer SKU conversion qty. 荷姿振替荷姿換算数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_conv_qty(double value) {
		setConstNumber(offset + 45, $pack_xfr_pack_unit_conv_qty, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR pack_xfr_base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 46, $pack_xfr_base_unit_qty_p);
	}
	
	public void pack_xfr_base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 46, $pack_xfr_base_unit_qty_p, row);
	}


	/**
	 * SKU transfer unit (Base) cd. 荷姿振替単位（基）ＣＤ.<p>
	 *
	 */
	public String pack_xfr_base_unit_cd() {
		return getConstString(offset + 47, $pack_xfr_base_unit_cd);
	}

	/**
	 * SKU transfer unit (Base) cd. 荷姿振替単位（基）ＣＤ.<p>
	 *
	 */
	public void pack_xfr_base_unit_cd(String value) {
		setConstString(offset + 47, $pack_xfr_base_unit_cd, value);
	}


	/**
	 * SKU transfer unit name (Base) 荷姿振替単位名（基）.<p>
	 *
	 */
	public String pack_xfr_base_unit_nm() {
		return getConstString(offset + 48, $pack_xfr_base_unit_nm);
	}

	/**
	 * SKU transfer unit name (Base) 荷姿振替単位名（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_nm(String value) {
		setConstString(offset + 48, $pack_xfr_base_unit_nm, value);
	}


	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_xfr_base_unit_dec_place() {
		return getConstNumber(offset + 49, $pack_xfr_base_unit_dec_place);
	}

	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 49, $pack_xfr_base_unit_dec_place, value);
	}

	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_base_unit_dec_place(int value) {
		setConstNumber(offset + 49, $pack_xfr_base_unit_dec_place, value);
	}

	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_base_unit_dec_place(long value) {
		setConstNumber(offset + 49, $pack_xfr_base_unit_dec_place, value);
	}

	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_base_unit_dec_place(float value) {
		setConstNumber(offset + 49, $pack_xfr_base_unit_dec_place, value);
	}

	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_base_unit_dec_place(double value) {
		setConstNumber(offset + 49, $pack_xfr_base_unit_dec_place, value);
	}


	/**
	 * SKU transfer base unit rounding type 荷姿振替基準単位端数処理区分.<p>
	 *
	 */
	public String pack_xfr_base_unit_rnd_typ() {
		return getConstString(offset + 50, $pack_xfr_base_unit_rnd_typ);
	}

	/**
	 * SKU transfer base unit rounding type 荷姿振替基準単位端数処理区分.<p>
	 *
	 */
	public void pack_xfr_base_unit_rnd_typ(String value) {
		setConstString(offset + 50, $pack_xfr_base_unit_rnd_typ, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 51, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 51, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 52, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 52, $stk_insp_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 53, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 53, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 54, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 54, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 55, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 55, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 56, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 56, $stk_bp_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5070.SnoR sno_p(){
		return (mcframe.clientMAUB.MAUBP5070.SnoR) getConstInnerRow(offset + 57, $sno_p);
	}
	
	public void sno_p(mcframe.clientMAUB.MAUBP5070.SnoR row){
		setConstInnerRow(offset + 57, $sno_p, row);
	}


	public mcframe.clientMSUB.MSUBP5010.WrkNoR wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5010.WrkNoR) getConstInnerRow(offset + 58, $wrk_no_p);
	}
	
	public void wrk_no_p(mcframe.clientMSUB.MSUBP5010.WrkNoR row){
		setConstInnerRow(offset + 58, $wrk_no_p, row);
	}


	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public String fix_no_typ() {
		return getConstString(offset + 59, $fix_no_typ);
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public void fix_no_typ(String value) {
		setConstString(offset + 59, $fix_no_typ, value);
	}


	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public String fix_no_typ_nm() {
		return getConstString(offset + 60, $fix_no_typ_nm);
	}

	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public void fix_no_typ_nm(String value) {
		setConstString(offset + 60, $fix_no_typ_nm, value);
	}


	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public String fix_no() {
		return getConstString(offset + 61, $fix_no);
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public void fix_no(String value) {
		setConstString(offset + 61, $fix_no, value);
	}


	/**
	 * Inspection result details No. 検査実績明細ＮＯ.<p>
	 *
	 */
	public String insp_act_d_no() {
		return getConstString(offset + 62, $insp_act_d_no);
	}

	/**
	 * Inspection result details No. 検査実績明細ＮＯ.<p>
	 *
	 */
	public void insp_act_d_no(String value) {
		setConstString(offset + 62, $insp_act_d_no, value);
	}


	/**
	 * Inspection decision details No. 検査判定明細ＮＯ.<p>
	 *
	 */
	public String insp_judg_d_no() {
		return getConstString(offset + 63, $insp_judg_d_no);
	}

	/**
	 * Inspection decision details No. 検査判定明細ＮＯ.<p>
	 *
	 */
	public void insp_judg_d_no(String value) {
		setConstString(offset + 63, $insp_judg_d_no, value);
	}


	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public String insp_act_no() {
		return getConstString(offset + 64, $insp_act_no);
	}

	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public void insp_act_no(String value) {
		setConstString(offset + 64, $insp_act_no, value);
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 65, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 65, $insp_no, value);
	}


	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 66, $intr_rmrks);
	}

	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 66, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 67, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 67, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 68, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 68, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 69, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 69, $sub_char3, value);
	}


	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public boolean lims_flg() {
		return getConstBoolean(offset + 70, $lims_flg);
	}

	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public void lims_flg(boolean value) {
		setConstBoolean(offset + 70, $lims_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 71, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 71, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 72, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 72, $ext_sys_nm, value);
	}


	/**
	 * External inspection result details No. 外部検査実績明細ＮＯ.<p>
	 *
	 */
	public String ext_insp_act_d_no() {
		return getConstString(offset + 73, $ext_insp_act_d_no);
	}

	/**
	 * External inspection result details No. 外部検査実績明細ＮＯ.<p>
	 *
	 */
	public void ext_insp_act_d_no(String value) {
		setConstString(offset + 73, $ext_insp_act_d_no, value);
	}


	public String rtn_sts_typ() {
		return getConstString(offset + 74, $rtn_sts_typ);
	}

	public void rtn_sts_typ(String value) {
		setConstString(offset + 74, $rtn_sts_typ, value);
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			return dfct_rsn_cd();
		}
		if ($dfct_rsn_nm.equalsIgnoreCase(name)) {
			return dfct_rsn_nm();
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
		if ($stk_pack_unit_cd.equalsIgnoreCase(name)) {
			return stk_pack_unit_cd();
		}
		if ($stk_pack_unit_nm.equalsIgnoreCase(name)) {
			return stk_pack_unit_nm();
		}
		if ($stk_base_unit_cd.equalsIgnoreCase(name)) {
			return stk_base_unit_cd();
		}
		if ($stk_base_unit_nm.equalsIgnoreCase(name)) {
			return stk_base_unit_nm();
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
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			return fix_no_typ_nm();
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			return fix_no();
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			return pack_unit_dmn_qty();
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			return pack_unit_conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			return stk_pack_unit_dec_place();
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			return stk_base_unit_dec_place();
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
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
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
		if ($base_flg.equalsIgnoreCase(name)) {
			return base_flg();
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			return dfct_rsn_cd();
		}
		if ($dfct_rsn_nm.equalsIgnoreCase(name)) {
			return dfct_rsn_nm();
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
		if ($stk_pack_unit_cd.equalsIgnoreCase(name)) {
			return stk_pack_unit_cd();
		}
		if ($stk_pack_unit_nm.equalsIgnoreCase(name)) {
			return stk_pack_unit_nm();
		}
		if ($stk_base_unit_cd.equalsIgnoreCase(name)) {
			return stk_base_unit_cd();
		}
		if ($stk_base_unit_nm.equalsIgnoreCase(name)) {
			return stk_base_unit_nm();
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
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			return fix_no_typ_nm();
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			return fix_no();
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			return pack_unit_dmn_qty();
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			return pack_unit_conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			return stk_pack_unit_dec_place();
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			return stk_base_unit_dec_place();
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
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
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
		if ($base_flg.equalsIgnoreCase(name)) {
			return base_flg();
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
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
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			dfct_rsn_cd(value);
			return;
		}
		if ($dfct_rsn_nm.equalsIgnoreCase(name)) {
			dfct_rsn_nm(value);
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
		if ($stk_pack_unit_cd.equalsIgnoreCase(name)) {
			stk_pack_unit_cd(value);
			return;
		}
		if ($stk_pack_unit_nm.equalsIgnoreCase(name)) {
			stk_pack_unit_nm(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			stk_pack_unit_dec_place(value);
			return;
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			stk_base_unit_dec_place(value);
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
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			stk_pack_unit_dec_place(value);
			return;
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			stk_base_unit_dec_place(value);
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
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			stk_pack_unit_dec_place(value);
			return;
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			stk_base_unit_dec_place(value);
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
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			stk_pack_unit_dec_place(value);
			return;
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			stk_base_unit_dec_place(value);
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
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			stk_pack_unit_dec_place(value);
			return;
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			stk_base_unit_dec_place(value);
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
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
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
		if ($base_flg.equalsIgnoreCase(name)) {
			base_flg(value);
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
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
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			dfct_rsn_cd(value);
			return;
		}
		if ($dfct_rsn_nm.equalsIgnoreCase(name)) {
			dfct_rsn_nm(value);
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
		if ($stk_pack_unit_cd.equalsIgnoreCase(name)) {
			stk_pack_unit_cd(value);
			return;
		}
		if ($stk_pack_unit_nm.equalsIgnoreCase(name)) {
			stk_pack_unit_nm(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			stk_pack_unit_dec_place(value);
			return;
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			stk_base_unit_dec_place(value);
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
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			stk_pack_unit_dec_place(value);
			return;
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			stk_base_unit_dec_place(value);
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
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			stk_pack_unit_dec_place(value);
			return;
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			stk_base_unit_dec_place(value);
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
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			stk_pack_unit_dec_place(value);
			return;
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			stk_base_unit_dec_place(value);
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
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($stk_pack_unit_dec_place.equalsIgnoreCase(name)) {
			stk_pack_unit_dec_place(value);
			return;
		}
		if ($stk_base_unit_dec_place.equalsIgnoreCase(name)) {
			stk_base_unit_dec_place(value);
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
		if ($pack_xfr_base_unit_dec_place.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
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
		if ($base_flg.equalsIgnoreCase(name)) {
			base_flg(value);
			return;
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			return ac_dt_p();
		}
		if ($pack_unit_qty_p.equalsIgnoreCase(name)) {
			return pack_unit_qty_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($stk_pack_unit_qty_p.equalsIgnoreCase(name)) {
			return stk_pack_unit_qty_p();
		}
		if ($stk_base_unit_qty_p.equalsIgnoreCase(name)) {
			return stk_base_unit_qty_p();
		}
		if ($pack_xfr_pack_unit_qty_p.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_qty_p();
		}
		if ($pack_xfr_base_unit_qty_p.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_qty_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			return wrk_no_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			ac_dt_p(
				((MCContainerMeta) ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5220.AcDtR.class, value)
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
		if ($stk_pack_unit_qty_p.equalsIgnoreCase(name)) {
			stk_pack_unit_qty_p(
				((MCContainerMeta) stk_pack_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($stk_base_unit_qty_p.equalsIgnoreCase(name)) {
			stk_base_unit_qty_p(
				((MCContainerMeta) stk_base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($pack_xfr_pack_unit_qty_p.equalsIgnoreCase(name)) {
			pack_xfr_pack_unit_qty_p(
				((MCContainerMeta) pack_xfr_pack_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($pack_xfr_base_unit_qty_p.equalsIgnoreCase(name)) {
			pack_xfr_base_unit_qty_p(
				((MCContainerMeta) pack_xfr_base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5070.SnoR.class, value)
			);
			return;
		}
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			wrk_no_p(
				((MCContainerMeta) wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5010.WrkNoR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate ac_dt() {
		return ac_dt_p().ac_dt();
	}

	public void ac_dt(MCDate value) {
		ac_dt_p().ac_dt(value);
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
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public MCNumber stk_pack_unit_qty() {
		return stk_pack_unit_qty_p().qty();
	}

	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public void stk_pack_unit_qty(MCNumber value) {
		stk_pack_unit_qty_p().qty(value);
	}

	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public void stk_pack_unit_qty(int value) {
		stk_pack_unit_qty_p().qty(value);
	}

	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public void stk_pack_unit_qty(long value) {
		stk_pack_unit_qty_p().qty(value);
	}

	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public void stk_pack_unit_qty(float value) {
		stk_pack_unit_qty_p().qty(value);
	}

	/**
	 * Inventory qty. (SKU) 在庫数量（荷）.<p>
	 *
	 */
	public void stk_pack_unit_qty(double value) {
		stk_pack_unit_qty_p().qty(value);
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public MCNumber stk_base_unit_qty() {
		return stk_base_unit_qty_p().qty();
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public void stk_base_unit_qty(MCNumber value) {
		stk_base_unit_qty_p().qty(value);
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public void stk_base_unit_qty(int value) {
		stk_base_unit_qty_p().qty(value);
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public void stk_base_unit_qty(long value) {
		stk_base_unit_qty_p().qty(value);
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public void stk_base_unit_qty(float value) {
		stk_base_unit_qty_p().qty(value);
	}

	/**
	 * Inventory qty. (Base unit) 在庫数量（基）.<p>
	 *
	 */
	public void stk_base_unit_qty(double value) {
		stk_base_unit_qty_p().qty(value);
	}

	/**
	 * SKU transfer qty. (SKU) 荷姿振替数量（荷）.<p>
	 *
	 */
	public MCNumber pack_xfr_pack_unit_qty() {
		return pack_xfr_pack_unit_qty_p().qty();
	}

	/**
	 * SKU transfer qty. (SKU) 荷姿振替数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(MCNumber value) {
		pack_xfr_pack_unit_qty_p().qty(value);
	}

	/**
	 * SKU transfer qty. (SKU) 荷姿振替数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(int value) {
		pack_xfr_pack_unit_qty_p().qty(value);
	}

	/**
	 * SKU transfer qty. (SKU) 荷姿振替数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(long value) {
		pack_xfr_pack_unit_qty_p().qty(value);
	}

	/**
	 * SKU transfer qty. (SKU) 荷姿振替数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(float value) {
		pack_xfr_pack_unit_qty_p().qty(value);
	}

	/**
	 * SKU transfer qty. (SKU) 荷姿振替数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(double value) {
		pack_xfr_pack_unit_qty_p().qty(value);
	}

	/**
	 * SKU transfer qty. (Base) 荷姿振替数量（基）.<p>
	 *
	 */
	public MCNumber pack_xfr_base_unit_qty() {
		return pack_xfr_base_unit_qty_p().qty();
	}

	/**
	 * SKU transfer qty. (Base) 荷姿振替数量（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(MCNumber value) {
		pack_xfr_base_unit_qty_p().qty(value);
	}

	/**
	 * SKU transfer qty. (Base) 荷姿振替数量（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(int value) {
		pack_xfr_base_unit_qty_p().qty(value);
	}

	/**
	 * SKU transfer qty. (Base) 荷姿振替数量（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(long value) {
		pack_xfr_base_unit_qty_p().qty(value);
	}

	/**
	 * SKU transfer qty. (Base) 荷姿振替数量（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(float value) {
		pack_xfr_base_unit_qty_p().qty(value);
	}

	/**
	 * SKU transfer qty. (Base) 荷姿振替数量（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(double value) {
		pack_xfr_base_unit_qty_p().qty(value);
	}

	public String sno1() {
		return sno_p().sno1();
	}

	public void sno1(String value) {
		sno_p().sno1(value);
	}

	public String sno2() {
		return sno_p().sno2();
	}

	public void sno2(String value) {
		sno_p().sno2(value);
	}

	public String sno3() {
		return sno_p().sno3();
	}

	public void sno3(String value) {
		sno_p().sno3(value);
	}

	public String sno4() {
		return sno_p().sno4();
	}

	public void sno4(String value) {
		sno_p().sno4(value);
	}

	public String wrk_no() {
		return wrk_no_p().wrk_no();
	}

	public void wrk_no(String value) {
		wrk_no_p().wrk_no(value);
	}

	public String wrk_nm() {
		return wrk_no_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		wrk_no_p().wrk_nm(value);
	}

}

