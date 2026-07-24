package mcframe.clientMSBF.MSBFP0070;

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
 * ブロック"Smpl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SmplR_MC_A extends MCConstRow {

	public static final String $so_qty_p = "so_qty_p";
	public static final String $smpl_qty_p = "smpl_qty_p";
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
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	/**
	 * Sampling source unit cd. 抜取元単位ＣＤ.<p>
	 *
	 */
	public static final String $stk_unit_cd = "stk_unit_cd";
	public static final String $pack_xfr_pack_unit_qty_p = "pack_xfr_pack_unit_qty_p";
	/**
	 * SKU transfer packing unit cd. 荷姿振替荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_xfr_pack_unit_cd = "pack_xfr_pack_unit_cd";
	/**
	 * SKU transfer SKU name 荷姿振替荷姿単位名.<p>
	 *
	 */
	public static final String $pack_xfr_pack_unit_nm = "pack_xfr_pack_unit_nm";
	/**
	 * SKU transfer SKU number of decimal places 荷姿振替荷姿単位小数部有効桁数.<p>
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
	 * SKU transfer base unit cd. 荷姿振替基準単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_xfr_base_unit_cd = "pack_xfr_base_unit_cd";
	/**
	 * SKU transfer base unit name 荷姿振替基準単位名.<p>
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
	 * Deduction completed 引落完了.<p>
	 *
	 */
	public static final String $so_cmpl_flg = "so_cmpl_flg";
	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Sampling location cd. 抜取元場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Sampling location name 抜取元場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * For sampling rack/line 抜取元棚・ライン対象.<p>
	 *
	 */
	public static final String $str_ln_tgt_flg = "str_ln_tgt_flg";
	public static final String $str_ln_p = "str_ln_p";
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
	public static final String $act_dt_p = "act_dt_p";
	/**
	 * Sampling recording date 抜取計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	public static final String $can_ac_dt_p = "can_ac_dt_p";
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public static final String $bd_dpt_nm = "bd_dpt_nm";
	/**
	 * Sampling inspection result No. 検査抜取実績ＮＯ.<p>
	 *
	 */
	public static final String $insp_smpl_act_no = "insp_smpl_act_no";
	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public static final String $insp_schd_no = "insp_schd_no";
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public static final String $insp_act_no = "insp_act_no";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Sampling internal remarks 抜取内部備考.<p>
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
	 * External inspection sampling result No. 外部検査抜取実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_insp_smpl_act_no = "ext_insp_smpl_act_no";

	public static final String $so_qty = $so_qty_p + ".qty";
	public static final String $smpl_qty = $smpl_qty_p + ".qty";
	public static final String $pack_xfr_pack_unit_qty = $pack_xfr_pack_unit_qty_p + ".qty";
	public static final String $pack_xfr_base_unit_qty = $pack_xfr_base_unit_qty_p + ".qty";
	public static final String $str_ln_cd = $str_ln_p + ".str_ln_cd";
	public static final String $str_ln_nm = $str_ln_p + ".str_ln_nm";
	public static final String $str_ln_cd_none_flg = $str_ln_p + ".str_ln_cd_none_flg";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4 = $sno_p + ".sno4";
	public static final String $wrk_no = $wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $wrk_no_p + ".wrk_nm";
	public static final String $act_dt = $act_dt_p + ".ymd";
	public static final String $act_hm = $act_dt_p + ".hm";
	public static final String $can_ac_dt_for_input = $can_ac_dt_p + ".can_ac_dt_for_input";
	public static final String $can_ac_dt = $can_ac_dt_p + ".can_ac_dt_for_call";
	public static final String $ac_dt_after_srch = $can_ac_dt_p + ".ac_dt_after_srch";

	public static final MCMeta so_qty_p_META = createInnerRowMeta($so_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta smpl_qty_p_META = createInnerRowMeta($smpl_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta stk_unit_cd_META = createCommonMeta($stk_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
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
	public static final MCMeta so_cmpl_flg_META = createCommonMeta($so_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_tgt_flg_META = createCommonMeta($str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln_p_META = createInnerRowMeta($str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
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
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMAUB.MAUBP5070.SnoR.class);
	public static final MCMeta wrk_no_p_META = createInnerRowMeta($wrk_no_p, mcframe.clientMSUB.MSUBP5010.WrkNoR.class);
	public static final MCMeta fix_no_typ_META = createCommonMeta($fix_no_typ, mcframe.commonMS.meta.MS_META.FIX_NO_TYP);
	public static final MCMeta fix_no_typ_nm_META = createCommonMeta($fix_no_typ_nm, mcframe.commonMS.meta.MS_META.FIX_NO_TYP_NM);
	public static final MCMeta fix_no_META = createCommonMeta($fix_no, mcframe.commonMA.meta.MA_META.FIX_NO);
	public static final MCMeta act_dt_p_META = createInnerRowMeta($act_dt_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_ac_dt_p_META = createInnerRowMeta($can_ac_dt_p, mcframe.clientMAUB.MAUBP5240.CanAcDtR.class);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta insp_smpl_act_no_META = createCommonMeta($insp_smpl_act_no, mcframe.commonMA.meta.MA_META.INSP_SMPL_ACT_NO);
	public static final MCMeta insp_schd_no_META = createCommonMeta($insp_schd_no, mcframe.commonMA.meta.MA_META.INSP_SCHD_NO);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta insp_act_no_META = createCommonMeta($insp_act_no, mcframe.commonMA.meta.MA_META.INSP_ACT_NO);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMS.meta.MS_META.INSP_SMPL_ACT_TRD_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.INSP_SMPL_ACT_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.INSP_SMPL_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.INSP_SMPL_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.INSP_SMPL_ACT_SUB_CHAR3);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta lims_flg_META = createCommonMeta($lims_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_insp_smpl_act_no_META = createCommonMeta($ext_insp_smpl_act_no, mcframe.commonMA.meta.MA_META.EXT_INSP_ACT_NO);

	protected static final ConstMetaList<SmplR> constMetas = new ConstMetaList<SmplR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			so_qty_p_META,
			smpl_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			stk_unit_cd_META,
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
			so_cmpl_flg_META,
			wg_cd_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_tgt_flg_META,
			str_ln_p_META,
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
			sno_p_META,
			wrk_no_p_META,
			fix_no_typ_META,
			fix_no_typ_nm_META,
			fix_no_META,
			act_dt_p_META,
			ac_dt_META,
			can_ac_dt_p_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			insp_smpl_act_no_META,
			insp_schd_no_META,
			insp_no_META,
			insp_act_no_META,
			trd_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			lims_flg_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			ext_insp_smpl_act_no_META
		},
		new String[][]{
			{
				"so_qty",
				"smpl_qty",
				"pack_xfr_pack_unit_qty",
				"pack_xfr_base_unit_qty",
				"str_ln_cd",
				"str_ln_nm",
				"str_ln_cd_none_flg",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"act_dt",
				"act_hm",
				"can_ac_dt_for_input",
				"can_ac_dt",
				"ac_dt_after_srch"
			},
			{
				$so_qty,
				$smpl_qty,
				$pack_xfr_pack_unit_qty,
				$pack_xfr_base_unit_qty,
				$str_ln_cd,
				$str_ln_nm,
				$str_ln_cd_none_flg,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$act_dt,
				$act_hm,
				$can_ac_dt_for_input,
				$can_ac_dt,
				$ac_dt_after_srch
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
				{$bd_dpt_cd, "dpt_nm"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM;wg_cd"},	// loc_cd
				{$str_ln_p + ".str_ln_cd", "loc_cd;true"},	// str_ln_p.str_ln_cd
				{$bd_dpt_cd, "ac_dt;MAC_DPT_IS_SRCH_TYP.BD;true"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$loc_cd, "loc_is_srch_typ;wg_cd"},	// loc_cd
				{$str_ln_p + ".str_ln_cd", "loc_cd;mode_nullval_flg"},	// str_ln_p.str_ln_cd
				{$bd_dpt_cd, "dt;dpt_is_srch_typ;bd_dpt_flg"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$str_ln_tgt_flg, "STR_LN"},	// str_ln_tgt_flg
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
	protected SmplR_MC_A(ConstMetaList<? extends SmplR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SmplR clone() {
		return (SmplR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SmplR createInstance() {
		return (SmplR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SmplR getValues(String... names) {
		return (SmplR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP5040.QtyR so_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 0, $so_qty_p);
	}
	
	public void so_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 0, $so_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR smpl_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 1, $smpl_qty_p);
	}
	
	public void smpl_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 1, $smpl_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 2, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 2, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 3, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 3, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 4, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 4, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 4, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 4, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 4, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 4, $base_unit_dec_place, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 5, $base_unit_rnd_typ);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 5, $base_unit_rnd_typ, value);
	}


	/**
	 * Sampling source unit cd. 抜取元単位ＣＤ.<p>
	 *
	 */
	public String stk_unit_cd() {
		return getConstString(offset + 6, $stk_unit_cd);
	}

	/**
	 * Sampling source unit cd. 抜取元単位ＣＤ.<p>
	 *
	 */
	public void stk_unit_cd(String value) {
		setConstString(offset + 6, $stk_unit_cd, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR pack_xfr_pack_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 7, $pack_xfr_pack_unit_qty_p);
	}
	
	public void pack_xfr_pack_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 7, $pack_xfr_pack_unit_qty_p, row);
	}


	/**
	 * SKU transfer packing unit cd. 荷姿振替荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_xfr_pack_unit_cd() {
		return getConstString(offset + 8, $pack_xfr_pack_unit_cd);
	}

	/**
	 * SKU transfer packing unit cd. 荷姿振替荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_xfr_pack_unit_cd(String value) {
		setConstString(offset + 8, $pack_xfr_pack_unit_cd, value);
	}


	/**
	 * SKU transfer SKU name 荷姿振替荷姿単位名.<p>
	 *
	 */
	public String pack_xfr_pack_unit_nm() {
		return getConstString(offset + 9, $pack_xfr_pack_unit_nm);
	}

	/**
	 * SKU transfer SKU name 荷姿振替荷姿単位名.<p>
	 *
	 */
	public void pack_xfr_pack_unit_nm(String value) {
		setConstString(offset + 9, $pack_xfr_pack_unit_nm, value);
	}


	/**
	 * SKU transfer SKU number of decimal places 荷姿振替荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_xfr_pack_unit_dec_place() {
		return getConstNumber(offset + 10, $pack_xfr_pack_unit_dec_place);
	}

	/**
	 * SKU transfer SKU number of decimal places 荷姿振替荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 10, $pack_xfr_pack_unit_dec_place, value);
	}

	/**
	 * SKU transfer SKU number of decimal places 荷姿振替荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dec_place(int value) {
		setConstNumber(offset + 10, $pack_xfr_pack_unit_dec_place, value);
	}

	/**
	 * SKU transfer SKU number of decimal places 荷姿振替荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dec_place(long value) {
		setConstNumber(offset + 10, $pack_xfr_pack_unit_dec_place, value);
	}

	/**
	 * SKU transfer SKU number of decimal places 荷姿振替荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dec_place(float value) {
		setConstNumber(offset + 10, $pack_xfr_pack_unit_dec_place, value);
	}

	/**
	 * SKU transfer SKU number of decimal places 荷姿振替荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dec_place(double value) {
		setConstNumber(offset + 10, $pack_xfr_pack_unit_dec_place, value);
	}


	/**
	 * SKU transfer SKU base qty. 荷姿振替荷姿基準数量.<p>
	 *
	 */
	public MCNumber pack_xfr_pack_unit_dmn_qty() {
		return getConstNumber(offset + 11, $pack_xfr_pack_unit_dmn_qty);
	}

	/**
	 * SKU transfer SKU base qty. 荷姿振替荷姿基準数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dmn_qty(MCNumber value) {
		setConstNumber(offset + 11, $pack_xfr_pack_unit_dmn_qty, value);
	}

	/**
	 * SKU transfer SKU base qty. 荷姿振替荷姿基準数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dmn_qty(int value) {
		setConstNumber(offset + 11, $pack_xfr_pack_unit_dmn_qty, value);
	}

	/**
	 * SKU transfer SKU base qty. 荷姿振替荷姿基準数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dmn_qty(long value) {
		setConstNumber(offset + 11, $pack_xfr_pack_unit_dmn_qty, value);
	}

	/**
	 * SKU transfer SKU base qty. 荷姿振替荷姿基準数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dmn_qty(float value) {
		setConstNumber(offset + 11, $pack_xfr_pack_unit_dmn_qty, value);
	}

	/**
	 * SKU transfer SKU base qty. 荷姿振替荷姿基準数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dmn_qty(double value) {
		setConstNumber(offset + 11, $pack_xfr_pack_unit_dmn_qty, value);
	}


	/**
	 * SKU transfer SKU conversion qty. 荷姿振替荷姿換算数量.<p>
	 *
	 */
	public MCNumber pack_xfr_pack_unit_conv_qty() {
		return getConstNumber(offset + 12, $pack_xfr_pack_unit_conv_qty);
	}

	/**
	 * SKU transfer SKU conversion qty. 荷姿振替荷姿換算数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 12, $pack_xfr_pack_unit_conv_qty, value);
	}

	/**
	 * SKU transfer SKU conversion qty. 荷姿振替荷姿換算数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_conv_qty(int value) {
		setConstNumber(offset + 12, $pack_xfr_pack_unit_conv_qty, value);
	}

	/**
	 * SKU transfer SKU conversion qty. 荷姿振替荷姿換算数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_conv_qty(long value) {
		setConstNumber(offset + 12, $pack_xfr_pack_unit_conv_qty, value);
	}

	/**
	 * SKU transfer SKU conversion qty. 荷姿振替荷姿換算数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_conv_qty(float value) {
		setConstNumber(offset + 12, $pack_xfr_pack_unit_conv_qty, value);
	}

	/**
	 * SKU transfer SKU conversion qty. 荷姿振替荷姿換算数量.<p>
	 *
	 */
	public void pack_xfr_pack_unit_conv_qty(double value) {
		setConstNumber(offset + 12, $pack_xfr_pack_unit_conv_qty, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR pack_xfr_base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 13, $pack_xfr_base_unit_qty_p);
	}
	
	public void pack_xfr_base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 13, $pack_xfr_base_unit_qty_p, row);
	}


	/**
	 * SKU transfer base unit cd. 荷姿振替基準単位ＣＤ.<p>
	 *
	 */
	public String pack_xfr_base_unit_cd() {
		return getConstString(offset + 14, $pack_xfr_base_unit_cd);
	}

	/**
	 * SKU transfer base unit cd. 荷姿振替基準単位ＣＤ.<p>
	 *
	 */
	public void pack_xfr_base_unit_cd(String value) {
		setConstString(offset + 14, $pack_xfr_base_unit_cd, value);
	}


	/**
	 * SKU transfer base unit name 荷姿振替基準単位名.<p>
	 *
	 */
	public String pack_xfr_base_unit_nm() {
		return getConstString(offset + 15, $pack_xfr_base_unit_nm);
	}

	/**
	 * SKU transfer base unit name 荷姿振替基準単位名.<p>
	 *
	 */
	public void pack_xfr_base_unit_nm(String value) {
		setConstString(offset + 15, $pack_xfr_base_unit_nm, value);
	}


	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_xfr_base_unit_dec_place() {
		return getConstNumber(offset + 16, $pack_xfr_base_unit_dec_place);
	}

	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 16, $pack_xfr_base_unit_dec_place, value);
	}

	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_base_unit_dec_place(int value) {
		setConstNumber(offset + 16, $pack_xfr_base_unit_dec_place, value);
	}

	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_base_unit_dec_place(long value) {
		setConstNumber(offset + 16, $pack_xfr_base_unit_dec_place, value);
	}

	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_base_unit_dec_place(float value) {
		setConstNumber(offset + 16, $pack_xfr_base_unit_dec_place, value);
	}

	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_base_unit_dec_place(double value) {
		setConstNumber(offset + 16, $pack_xfr_base_unit_dec_place, value);
	}


	/**
	 * SKU transfer base unit rounding type 荷姿振替基準単位端数処理区分.<p>
	 *
	 */
	public String pack_xfr_base_unit_rnd_typ() {
		return getConstString(offset + 17, $pack_xfr_base_unit_rnd_typ);
	}

	/**
	 * SKU transfer base unit rounding type 荷姿振替基準単位端数処理区分.<p>
	 *
	 */
	public void pack_xfr_base_unit_rnd_typ(String value) {
		setConstString(offset + 17, $pack_xfr_base_unit_rnd_typ, value);
	}


	/**
	 * Deduction completed 引落完了.<p>
	 *
	 */
	public boolean so_cmpl_flg() {
		return getConstBoolean(offset + 18, $so_cmpl_flg);
	}

	/**
	 * Deduction completed 引落完了.<p>
	 *
	 */
	public void so_cmpl_flg(boolean value) {
		setConstBoolean(offset + 18, $so_cmpl_flg, value);
	}


	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 19, $wg_cd);
	}

	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 19, $wg_cd, value);
	}


	/**
	 * Sampling location cd. 抜取元場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 20, $loc_cd);
	}

	/**
	 * Sampling location cd. 抜取元場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 20, $loc_cd, value);
	}


	/**
	 * Sampling location name 抜取元場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 21, $loc_nm);
	}

	/**
	 * Sampling location name 抜取元場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 21, $loc_nm, value);
	}


	/**
	 * For sampling rack/line 抜取元棚・ライン対象.<p>
	 *
	 */
	public boolean str_ln_tgt_flg() {
		return getConstBoolean(offset + 22, $str_ln_tgt_flg);
	}

	/**
	 * For sampling rack/line 抜取元棚・ライン対象.<p>
	 *
	 */
	public void str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 22, $str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 23, $str_ln_p);
	}
	
	public void str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 23, $str_ln_p, row);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 24, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 24, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 25, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 25, $stk_arrv_bp_nm, value);
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
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 27, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 27, $gd_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 28, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 28, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 29, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 29, $quality_typ_nm, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 30, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 30, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 31, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 31, $stk_insp_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 32, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 32, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 33, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 33, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 34, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 34, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 35, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 35, $stk_bp_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5070.SnoR sno_p(){
		return (mcframe.clientMAUB.MAUBP5070.SnoR) getConstInnerRow(offset + 36, $sno_p);
	}
	
	public void sno_p(mcframe.clientMAUB.MAUBP5070.SnoR row){
		setConstInnerRow(offset + 36, $sno_p, row);
	}


	public mcframe.clientMSUB.MSUBP5010.WrkNoR wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5010.WrkNoR) getConstInnerRow(offset + 37, $wrk_no_p);
	}
	
	public void wrk_no_p(mcframe.clientMSUB.MSUBP5010.WrkNoR row){
		setConstInnerRow(offset + 37, $wrk_no_p, row);
	}


	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public String fix_no_typ() {
		return getConstString(offset + 38, $fix_no_typ);
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public void fix_no_typ(String value) {
		setConstString(offset + 38, $fix_no_typ, value);
	}


	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public String fix_no_typ_nm() {
		return getConstString(offset + 39, $fix_no_typ_nm);
	}

	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public void fix_no_typ_nm(String value) {
		setConstString(offset + 39, $fix_no_typ_nm, value);
	}


	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public String fix_no() {
		return getConstString(offset + 40, $fix_no);
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public void fix_no(String value) {
		setConstString(offset + 40, $fix_no, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR act_dt_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 41, $act_dt_p);
	}
	
	public void act_dt_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 41, $act_dt_p, row);
	}


	/**
	 * Sampling recording date 抜取計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 42, $ac_dt);
	}

	/**
	 * Sampling recording date 抜取計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 42, $ac_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5240.CanAcDtR can_ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP5240.CanAcDtR) getConstInnerRow(offset + 43, $can_ac_dt_p);
	}
	
	public void can_ac_dt_p(mcframe.clientMAUB.MAUBP5240.CanAcDtR row){
		setConstInnerRow(offset + 43, $can_ac_dt_p, row);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 44, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 44, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 45, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 45, $bd_dpt_nm, value);
	}


	/**
	 * Sampling inspection result No. 検査抜取実績ＮＯ.<p>
	 *
	 */
	public String insp_smpl_act_no() {
		return getConstString(offset + 46, $insp_smpl_act_no);
	}

	/**
	 * Sampling inspection result No. 検査抜取実績ＮＯ.<p>
	 *
	 */
	public void insp_smpl_act_no(String value) {
		setConstString(offset + 46, $insp_smpl_act_no, value);
	}


	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public String insp_schd_no() {
		return getConstString(offset + 47, $insp_schd_no);
	}

	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public void insp_schd_no(String value) {
		setConstString(offset + 47, $insp_schd_no, value);
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 48, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 48, $insp_no, value);
	}


	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public String insp_act_no() {
		return getConstString(offset + 49, $insp_act_no);
	}

	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public void insp_act_no(String value) {
		setConstString(offset + 49, $insp_act_no, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 50, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 50, $trd_rmrks, value);
	}


	/**
	 * Sampling internal remarks 抜取内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 51, $intr_rmrks);
	}

	/**
	 * Sampling internal remarks 抜取内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 51, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 52, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 52, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 53, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 53, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 54, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 54, $sub_char3, value);
	}


	/**
	 * Item 品目.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 55, $itm_cd);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 55, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 56, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 56, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 57, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 57, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 58, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 58, $itm_sub3, value);
	}


	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public boolean lims_flg() {
		return getConstBoolean(offset + 59, $lims_flg);
	}

	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public void lims_flg(boolean value) {
		setConstBoolean(offset + 59, $lims_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 60, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 60, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 61, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 61, $ext_sys_nm, value);
	}


	/**
	 * External inspection sampling result No. 外部検査抜取実績ＮＯ.<p>
	 *
	 */
	public String ext_insp_smpl_act_no() {
		return getConstString(offset + 62, $ext_insp_smpl_act_no);
	}

	/**
	 * External inspection sampling result No. 外部検査抜取実績ＮＯ.<p>
	 *
	 */
	public void ext_insp_smpl_act_no(String value) {
		setConstString(offset + 62, $ext_insp_smpl_act_no, value);
	}


	public String getString(String name) {
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($stk_unit_cd.equalsIgnoreCase(name)) {
			return stk_unit_cd();
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
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
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			return fix_no_typ_nm();
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			return fix_no();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($insp_smpl_act_no.equalsIgnoreCase(name)) {
			return insp_smpl_act_no();
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			return insp_act_no();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_insp_smpl_act_no.equalsIgnoreCase(name)) {
			return ext_insp_smpl_act_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($so_cmpl_flg.equalsIgnoreCase(name)) {
			return so_cmpl_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($stk_unit_cd.equalsIgnoreCase(name)) {
			return stk_unit_cd();
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
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
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			return fix_no_typ_nm();
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			return fix_no();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($insp_smpl_act_no.equalsIgnoreCase(name)) {
			return insp_smpl_act_no();
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			return insp_act_no();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_insp_smpl_act_no.equalsIgnoreCase(name)) {
			return ext_insp_smpl_act_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($so_cmpl_flg.equalsIgnoreCase(name)) {
			return so_cmpl_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($stk_unit_cd.equalsIgnoreCase(name)) {
			stk_unit_cd(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($insp_smpl_act_no.equalsIgnoreCase(name)) {
			insp_smpl_act_no(value);
			return;
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			insp_act_no(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_insp_smpl_act_no.equalsIgnoreCase(name)) {
			ext_insp_smpl_act_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($so_cmpl_flg.equalsIgnoreCase(name)) {
			so_cmpl_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($stk_unit_cd.equalsIgnoreCase(name)) {
			stk_unit_cd(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($insp_smpl_act_no.equalsIgnoreCase(name)) {
			insp_smpl_act_no(value);
			return;
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			insp_act_no(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_insp_smpl_act_no.equalsIgnoreCase(name)) {
			ext_insp_smpl_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($so_cmpl_flg.equalsIgnoreCase(name)) {
			so_cmpl_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($so_qty_p.equalsIgnoreCase(name)) {
			return so_qty_p();
		}
		if ($smpl_qty_p.equalsIgnoreCase(name)) {
			return smpl_qty_p();
		}
		if ($pack_xfr_pack_unit_qty_p.equalsIgnoreCase(name)) {
			return pack_xfr_pack_unit_qty_p();
		}
		if ($pack_xfr_base_unit_qty_p.equalsIgnoreCase(name)) {
			return pack_xfr_base_unit_qty_p();
		}
		if ($str_ln_p.equalsIgnoreCase(name)) {
			return str_ln_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			return wrk_no_p();
		}
		if ($act_dt_p.equalsIgnoreCase(name)) {
			return act_dt_p();
		}
		if ($can_ac_dt_p.equalsIgnoreCase(name)) {
			return can_ac_dt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($so_qty_p.equalsIgnoreCase(name)) {
			so_qty_p(
				((MCContainerMeta) so_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($smpl_qty_p.equalsIgnoreCase(name)) {
			smpl_qty_p(
				((MCContainerMeta) smpl_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
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
		if ($str_ln_p.equalsIgnoreCase(name)) {
			str_ln_p(
				((MCContainerMeta) str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
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
		if ($act_dt_p.equalsIgnoreCase(name)) {
			act_dt_p(
				((MCContainerMeta) act_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($can_ac_dt_p.equalsIgnoreCase(name)) {
			can_ac_dt_p(
				((MCContainerMeta) can_ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5240.CanAcDtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public MCNumber so_qty() {
		return so_qty_p().qty();
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public void so_qty(MCNumber value) {
		so_qty_p().qty(value);
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public void so_qty(int value) {
		so_qty_p().qty(value);
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public void so_qty(long value) {
		so_qty_p().qty(value);
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public void so_qty(float value) {
		so_qty_p().qty(value);
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public void so_qty(double value) {
		so_qty_p().qty(value);
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public MCNumber smpl_qty() {
		return smpl_qty_p().qty();
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public void smpl_qty(MCNumber value) {
		smpl_qty_p().qty(value);
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public void smpl_qty(int value) {
		smpl_qty_p().qty(value);
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public void smpl_qty(long value) {
		smpl_qty_p().qty(value);
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public void smpl_qty(float value) {
		smpl_qty_p().qty(value);
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public void smpl_qty(double value) {
		smpl_qty_p().qty(value);
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

	/**
	 * Sampling rack/line cd. 抜取元棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return str_ln_p().str_ln_cd();
	}

	/**
	 * Sampling rack/line cd. 抜取元棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		str_ln_p().str_ln_cd(value);
	}

	/**
	 * Sampling rack/line name 抜取元棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return str_ln_p().str_ln_nm();
	}

	/**
	 * Sampling rack/line name 抜取元棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		str_ln_p().str_ln_nm(value);
	}

	/**
	 * Without sampling rack/line 抜取元棚・ライン無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return str_ln_p().str_ln_cd_none_flg();
	}

	/**
	 * Without sampling rack/line 抜取元棚・ライン無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		str_ln_p().str_ln_cd_none_flg(value);
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

	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public MCDate act_dt() {
		return act_dt_p().ymd();
	}

	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public void act_dt(MCDate value) {
		act_dt_p().ymd(value);
	}

	/**
	 * Actual time 実績時刻.<p>
	 *
	 */
	public MCDate act_hm() {
		return act_dt_p().hm();
	}

	/**
	 * Actual time 実績時刻.<p>
	 *
	 */
	public void act_hm(MCDate value) {
		act_dt_p().hm(value);
	}

	public MCDate can_ac_dt_for_input() {
		return can_ac_dt_p().can_ac_dt_for_input();
	}

	public void can_ac_dt_for_input(MCDate value) {
		can_ac_dt_p().can_ac_dt_for_input(value);
	}

	/**
	 * Sampling cancellation recording date 抜取取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return can_ac_dt_p().can_ac_dt_for_call();
	}

	/**
	 * Sampling cancellation recording date 抜取取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		can_ac_dt_p().can_ac_dt_for_call(value);
	}

	public MCDate ac_dt_after_srch() {
		return can_ac_dt_p().ac_dt_after_srch();
	}

	public void ac_dt_after_srch(MCDate value) {
		can_ac_dt_p().ac_dt_after_srch(value);
	}

}

