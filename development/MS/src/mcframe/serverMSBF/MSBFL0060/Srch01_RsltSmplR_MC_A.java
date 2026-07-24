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
 * ブロック"Srch01_RsltSmpl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltSmplR_MC_A extends MCConstRow {

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
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public static final String $so_qty = "so_qty";
	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public static final String $smpl_qty = "smpl_qty";
	/**
	 * Deduction completion flg. 引落完了ＦＬＧ.<p>
	 *
	 */
	public static final String $so_cmpl_flg = "so_cmpl_flg";
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
	 * SKU transfer qty. (SKU) 荷姿振替数量（荷）.<p>
	 *
	 */
	public static final String $pack_xfr_pack_unit_qty = "pack_xfr_pack_unit_qty";
	/**
	 * SKU transfer SKU 荷姿振替荷姿単位.<p>
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
	 * SKU transfer base unit 荷姿振替基準単位.<p>
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
	 * Sampling location 抜取元場所.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Sampling location name 抜取元場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public static final String $str_ln_tgt_flg = "str_ln_tgt_flg";
	/**
	 * Sampling rack/line 抜取元棚・ライン.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Sampling rack/line name 抜取元棚・ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Without sampling rack/line 抜取元棚・ライン無.<p>
	 *
	 */
	public static final String $str_ln_cd_none_flg = "str_ln_cd_none_flg";
	/**
	 * Inventory arriving point 在庫着荷先.<p>
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
	 * Actual date 実績日.<p>
	 *
	 */
	public static final String $act_dt = "act_dt";
	/**
	 * Actual time 実績時刻.<p>
	 *
	 */
	public static final String $act_hm = "act_hm";
	/**
	 * Sampling recording date 抜取計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Sampling cancellation recording date 抜取取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Charged dept. 負担部門.<p>
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
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public static final String $insp_schd_no = "insp_schd_no";
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
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
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


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta so_qty_META = createCommonMeta($so_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta smpl_qty_META = createCommonMeta($smpl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta so_cmpl_flg_META = createCommonMeta($so_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta act_dt_META = createCommonMeta($act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta act_hm_META = createCommonMeta($act_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta insp_smpl_act_no_META = createCommonMeta($insp_smpl_act_no, mcframe.commonMA.meta.MA_META.INSP_SMPL_ACT_NO);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta insp_schd_no_META = createCommonMeta($insp_schd_no, mcframe.commonMA.meta.MA_META.INSP_SCHD_NO);
	public static final MCMeta insp_act_no_META = createCommonMeta($insp_act_no, mcframe.commonMA.meta.MA_META.INSP_ACT_NO);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMS.meta.MS_META.INSP_SMPL_ACT_TRD_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.INSP_SMPL_ACT_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.INSP_SMPL_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.INSP_SMPL_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.INSP_SMPL_ACT_SUB_CHAR3);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta lims_flg_META = createCommonMeta($lims_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_insp_smpl_act_no_META = createCommonMeta($ext_insp_smpl_act_no, mcframe.commonMA.meta.MA_META.EXT_INSP_ACT_NO);

	protected static final ConstMetaList<Srch01_RsltSmplR> constMetas = new ConstMetaList<Srch01_RsltSmplR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			so_qty_META,
			smpl_qty_META,
			so_cmpl_flg_META,
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
			act_dt_META,
			act_hm_META,
			ac_dt_META,
			can_ac_dt_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			insp_smpl_act_no_META,
			insp_no_META,
			insp_schd_no_META,
			insp_act_no_META,
			trd_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			wg_cd_META,
			lims_flg_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			ext_insp_smpl_act_no_META
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
	protected Srch01_RsltSmplR_MC_A(ConstMetaList<? extends Srch01_RsltSmplR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltSmplR clone() {
		return (Srch01_RsltSmplR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltSmplR createInstance() {
		return (Srch01_RsltSmplR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltSmplR getValues(String... names) {
		return (Srch01_RsltSmplR) super.getValues(names);
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
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public MCNumber so_qty() {
		return getConstNumber(offset + 4, $so_qty);
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public void so_qty(MCNumber value) {
		setConstNumber(offset + 4, $so_qty, value);
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public void so_qty(int value) {
		setConstNumber(offset + 4, $so_qty, value);
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public void so_qty(long value) {
		setConstNumber(offset + 4, $so_qty, value);
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public void so_qty(float value) {
		setConstNumber(offset + 4, $so_qty, value);
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public void so_qty(double value) {
		setConstNumber(offset + 4, $so_qty, value);
	}


	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public MCNumber smpl_qty() {
		return getConstNumber(offset + 5, $smpl_qty);
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public void smpl_qty(MCNumber value) {
		setConstNumber(offset + 5, $smpl_qty, value);
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public void smpl_qty(int value) {
		setConstNumber(offset + 5, $smpl_qty, value);
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public void smpl_qty(long value) {
		setConstNumber(offset + 5, $smpl_qty, value);
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public void smpl_qty(float value) {
		setConstNumber(offset + 5, $smpl_qty, value);
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public void smpl_qty(double value) {
		setConstNumber(offset + 5, $smpl_qty, value);
	}


	/**
	 * Deduction completion flg. 引落完了ＦＬＧ.<p>
	 *
	 */
	public boolean so_cmpl_flg() {
		return getConstBoolean(offset + 6, $so_cmpl_flg);
	}

	/**
	 * Deduction completion flg. 引落完了ＦＬＧ.<p>
	 *
	 */
	public void so_cmpl_flg(boolean value) {
		setConstBoolean(offset + 6, $so_cmpl_flg, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 7, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 7, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 8, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 8, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 9, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 9, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 9, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 9, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 9, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 9, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 10, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 10, $base_unit_rnd_typ, value);
	}


	/**
	 * SKU transfer qty. (SKU) 荷姿振替数量（荷）.<p>
	 *
	 */
	public MCNumber pack_xfr_pack_unit_qty() {
		return getConstNumber(offset + 11, $pack_xfr_pack_unit_qty);
	}

	/**
	 * SKU transfer qty. (SKU) 荷姿振替数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 11, $pack_xfr_pack_unit_qty, value);
	}

	/**
	 * SKU transfer qty. (SKU) 荷姿振替数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(int value) {
		setConstNumber(offset + 11, $pack_xfr_pack_unit_qty, value);
	}

	/**
	 * SKU transfer qty. (SKU) 荷姿振替数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(long value) {
		setConstNumber(offset + 11, $pack_xfr_pack_unit_qty, value);
	}

	/**
	 * SKU transfer qty. (SKU) 荷姿振替数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(float value) {
		setConstNumber(offset + 11, $pack_xfr_pack_unit_qty, value);
	}

	/**
	 * SKU transfer qty. (SKU) 荷姿振替数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_qty(double value) {
		setConstNumber(offset + 11, $pack_xfr_pack_unit_qty, value);
	}


	/**
	 * SKU transfer SKU 荷姿振替荷姿単位.<p>
	 *
	 */
	public String pack_xfr_pack_unit_cd() {
		return getConstString(offset + 12, $pack_xfr_pack_unit_cd);
	}

	/**
	 * SKU transfer SKU 荷姿振替荷姿単位.<p>
	 *
	 */
	public void pack_xfr_pack_unit_cd(String value) {
		setConstString(offset + 12, $pack_xfr_pack_unit_cd, value);
	}


	/**
	 * SKU transfer SKU name 荷姿振替荷姿単位名.<p>
	 *
	 */
	public String pack_xfr_pack_unit_nm() {
		return getConstString(offset + 13, $pack_xfr_pack_unit_nm);
	}

	/**
	 * SKU transfer SKU name 荷姿振替荷姿単位名.<p>
	 *
	 */
	public void pack_xfr_pack_unit_nm(String value) {
		setConstString(offset + 13, $pack_xfr_pack_unit_nm, value);
	}


	/**
	 * SKU transfer SKU number of decimal places 荷姿振替荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_xfr_pack_unit_dec_place() {
		return getConstNumber(offset + 14, $pack_xfr_pack_unit_dec_place);
	}

	/**
	 * SKU transfer SKU number of decimal places 荷姿振替荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 14, $pack_xfr_pack_unit_dec_place, value);
	}

	/**
	 * SKU transfer SKU number of decimal places 荷姿振替荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dec_place(int value) {
		setConstNumber(offset + 14, $pack_xfr_pack_unit_dec_place, value);
	}

	/**
	 * SKU transfer SKU number of decimal places 荷姿振替荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dec_place(long value) {
		setConstNumber(offset + 14, $pack_xfr_pack_unit_dec_place, value);
	}

	/**
	 * SKU transfer SKU number of decimal places 荷姿振替荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dec_place(float value) {
		setConstNumber(offset + 14, $pack_xfr_pack_unit_dec_place, value);
	}

	/**
	 * SKU transfer SKU number of decimal places 荷姿振替荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dec_place(double value) {
		setConstNumber(offset + 14, $pack_xfr_pack_unit_dec_place, value);
	}


	/**
	 * SKU transfer base qty. (SKU) 荷姿振替基準数量（荷）.<p>
	 *
	 */
	public MCNumber pack_xfr_pack_unit_dmn_qty() {
		return getConstNumber(offset + 15, $pack_xfr_pack_unit_dmn_qty);
	}

	/**
	 * SKU transfer base qty. (SKU) 荷姿振替基準数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dmn_qty(MCNumber value) {
		setConstNumber(offset + 15, $pack_xfr_pack_unit_dmn_qty, value);
	}

	/**
	 * SKU transfer base qty. (SKU) 荷姿振替基準数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dmn_qty(int value) {
		setConstNumber(offset + 15, $pack_xfr_pack_unit_dmn_qty, value);
	}

	/**
	 * SKU transfer base qty. (SKU) 荷姿振替基準数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dmn_qty(long value) {
		setConstNumber(offset + 15, $pack_xfr_pack_unit_dmn_qty, value);
	}

	/**
	 * SKU transfer base qty. (SKU) 荷姿振替基準数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dmn_qty(float value) {
		setConstNumber(offset + 15, $pack_xfr_pack_unit_dmn_qty, value);
	}

	/**
	 * SKU transfer base qty. (SKU) 荷姿振替基準数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_dmn_qty(double value) {
		setConstNumber(offset + 15, $pack_xfr_pack_unit_dmn_qty, value);
	}


	/**
	 * SKU transfer conversion qty. (SKU) 荷姿振替換算数量（荷）.<p>
	 *
	 */
	public MCNumber pack_xfr_pack_unit_conv_qty() {
		return getConstNumber(offset + 16, $pack_xfr_pack_unit_conv_qty);
	}

	/**
	 * SKU transfer conversion qty. (SKU) 荷姿振替換算数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 16, $pack_xfr_pack_unit_conv_qty, value);
	}

	/**
	 * SKU transfer conversion qty. (SKU) 荷姿振替換算数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_conv_qty(int value) {
		setConstNumber(offset + 16, $pack_xfr_pack_unit_conv_qty, value);
	}

	/**
	 * SKU transfer conversion qty. (SKU) 荷姿振替換算数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_conv_qty(long value) {
		setConstNumber(offset + 16, $pack_xfr_pack_unit_conv_qty, value);
	}

	/**
	 * SKU transfer conversion qty. (SKU) 荷姿振替換算数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_conv_qty(float value) {
		setConstNumber(offset + 16, $pack_xfr_pack_unit_conv_qty, value);
	}

	/**
	 * SKU transfer conversion qty. (SKU) 荷姿振替換算数量（荷）.<p>
	 *
	 */
	public void pack_xfr_pack_unit_conv_qty(double value) {
		setConstNumber(offset + 16, $pack_xfr_pack_unit_conv_qty, value);
	}


	/**
	 * SKU transfer qty. (Base) 荷姿振替数量（基）.<p>
	 *
	 */
	public MCNumber pack_xfr_base_unit_qty() {
		return getConstNumber(offset + 17, $pack_xfr_base_unit_qty);
	}

	/**
	 * SKU transfer qty. (Base) 荷姿振替数量（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 17, $pack_xfr_base_unit_qty, value);
	}

	/**
	 * SKU transfer qty. (Base) 荷姿振替数量（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(int value) {
		setConstNumber(offset + 17, $pack_xfr_base_unit_qty, value);
	}

	/**
	 * SKU transfer qty. (Base) 荷姿振替数量（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(long value) {
		setConstNumber(offset + 17, $pack_xfr_base_unit_qty, value);
	}

	/**
	 * SKU transfer qty. (Base) 荷姿振替数量（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(float value) {
		setConstNumber(offset + 17, $pack_xfr_base_unit_qty, value);
	}

	/**
	 * SKU transfer qty. (Base) 荷姿振替数量（基）.<p>
	 *
	 */
	public void pack_xfr_base_unit_qty(double value) {
		setConstNumber(offset + 17, $pack_xfr_base_unit_qty, value);
	}


	/**
	 * SKU transfer base unit 荷姿振替基準単位.<p>
	 *
	 */
	public String pack_xfr_base_unit_cd() {
		return getConstString(offset + 18, $pack_xfr_base_unit_cd);
	}

	/**
	 * SKU transfer base unit 荷姿振替基準単位.<p>
	 *
	 */
	public void pack_xfr_base_unit_cd(String value) {
		setConstString(offset + 18, $pack_xfr_base_unit_cd, value);
	}


	/**
	 * SKU transfer base unit name 荷姿振替基準単位名.<p>
	 *
	 */
	public String pack_xfr_base_unit_nm() {
		return getConstString(offset + 19, $pack_xfr_base_unit_nm);
	}

	/**
	 * SKU transfer base unit name 荷姿振替基準単位名.<p>
	 *
	 */
	public void pack_xfr_base_unit_nm(String value) {
		setConstString(offset + 19, $pack_xfr_base_unit_nm, value);
	}


	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_xfr_base_unit_dec_place() {
		return getConstNumber(offset + 20, $pack_xfr_base_unit_dec_place);
	}

	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 20, $pack_xfr_base_unit_dec_place, value);
	}

	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_base_unit_dec_place(int value) {
		setConstNumber(offset + 20, $pack_xfr_base_unit_dec_place, value);
	}

	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_base_unit_dec_place(long value) {
		setConstNumber(offset + 20, $pack_xfr_base_unit_dec_place, value);
	}

	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_base_unit_dec_place(float value) {
		setConstNumber(offset + 20, $pack_xfr_base_unit_dec_place, value);
	}

	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public void pack_xfr_base_unit_dec_place(double value) {
		setConstNumber(offset + 20, $pack_xfr_base_unit_dec_place, value);
	}


	/**
	 * SKU transfer base unit rounding type 荷姿振替基準単位端数処理区分.<p>
	 *
	 */
	public String pack_xfr_base_unit_rnd_typ() {
		return getConstString(offset + 21, $pack_xfr_base_unit_rnd_typ);
	}

	/**
	 * SKU transfer base unit rounding type 荷姿振替基準単位端数処理区分.<p>
	 *
	 */
	public void pack_xfr_base_unit_rnd_typ(String value) {
		setConstString(offset + 21, $pack_xfr_base_unit_rnd_typ, value);
	}


	/**
	 * Sampling location 抜取元場所.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 22, $loc_cd);
	}

	/**
	 * Sampling location 抜取元場所.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 22, $loc_cd, value);
	}


	/**
	 * Sampling location name 抜取元場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 23, $loc_nm);
	}

	/**
	 * Sampling location name 抜取元場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 23, $loc_nm, value);
	}


	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public boolean str_ln_tgt_flg() {
		return getConstBoolean(offset + 24, $str_ln_tgt_flg);
	}

	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public void str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 24, $str_ln_tgt_flg, value);
	}


	/**
	 * Sampling rack/line 抜取元棚・ライン.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 25, $str_ln_cd);
	}

	/**
	 * Sampling rack/line 抜取元棚・ライン.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 25, $str_ln_cd, value);
	}


	/**
	 * Sampling rack/line name 抜取元棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 26, $str_ln_nm);
	}

	/**
	 * Sampling rack/line name 抜取元棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 26, $str_ln_nm, value);
	}


	/**
	 * Without sampling rack/line 抜取元棚・ライン無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 27, $str_ln_cd_none_flg);
	}

	/**
	 * Without sampling rack/line 抜取元棚・ライン無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 27, $str_ln_cd_none_flg, value);
	}


	/**
	 * Inventory arriving point 在庫着荷先.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 28, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point 在庫着荷先.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 28, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 29, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 29, $stk_arrv_bp_nm, value);
	}


	/**
	 * Grading 格付.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 30, $gd_cd);
	}

	/**
	 * Grading 格付.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 30, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 31, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 31, $gd_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 32, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 32, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 33, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 33, $quality_typ_nm, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 34, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 34, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 35, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 35, $stk_insp_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 36, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 36, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 37, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 37, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 38, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 38, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 39, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 39, $stk_bp_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 40, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 40, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 41, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 41, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 42, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 42, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 43, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 43, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 44, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 44, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 45, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 45, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 46, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 46, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 47, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 47, $wrk_nm, value);
	}


	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public String fix_no_typ() {
		return getConstString(offset + 48, $fix_no_typ);
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public void fix_no_typ(String value) {
		setConstString(offset + 48, $fix_no_typ, value);
	}


	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public String fix_no_typ_nm() {
		return getConstString(offset + 49, $fix_no_typ_nm);
	}

	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public void fix_no_typ_nm(String value) {
		setConstString(offset + 49, $fix_no_typ_nm, value);
	}


	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public String fix_no() {
		return getConstString(offset + 50, $fix_no);
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public void fix_no(String value) {
		setConstString(offset + 50, $fix_no, value);
	}


	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public MCDate act_dt() {
		return getConstDate(offset + 51, $act_dt);
	}

	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public void act_dt(MCDate value) {
		setConstDate(offset + 51, $act_dt, value);
	}


	/**
	 * Actual time 実績時刻.<p>
	 *
	 */
	public MCDate act_hm() {
		return getConstDate(offset + 52, $act_hm);
	}

	/**
	 * Actual time 実績時刻.<p>
	 *
	 */
	public void act_hm(MCDate value) {
		setConstDate(offset + 52, $act_hm, value);
	}


	/**
	 * Sampling recording date 抜取計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 53, $ac_dt);
	}

	/**
	 * Sampling recording date 抜取計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 53, $ac_dt, value);
	}


	/**
	 * Sampling cancellation recording date 抜取取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 54, $can_ac_dt);
	}

	/**
	 * Sampling cancellation recording date 抜取取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 54, $can_ac_dt, value);
	}


	/**
	 * Charged dept. 負担部門.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 55, $bd_dpt_cd);
	}

	/**
	 * Charged dept. 負担部門.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 55, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 56, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 56, $bd_dpt_nm, value);
	}


	/**
	 * Sampling inspection result No. 検査抜取実績ＮＯ.<p>
	 *
	 */
	public String insp_smpl_act_no() {
		return getConstString(offset + 57, $insp_smpl_act_no);
	}

	/**
	 * Sampling inspection result No. 検査抜取実績ＮＯ.<p>
	 *
	 */
	public void insp_smpl_act_no(String value) {
		setConstString(offset + 57, $insp_smpl_act_no, value);
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 58, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 58, $insp_no, value);
	}


	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public String insp_schd_no() {
		return getConstString(offset + 59, $insp_schd_no);
	}

	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public void insp_schd_no(String value) {
		setConstString(offset + 59, $insp_schd_no, value);
	}


	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public String insp_act_no() {
		return getConstString(offset + 60, $insp_act_no);
	}

	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public void insp_act_no(String value) {
		setConstString(offset + 60, $insp_act_no, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 61, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 61, $trd_rmrks, value);
	}


	/**
	 * Sampling internal remarks 抜取内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 62, $intr_rmrks);
	}

	/**
	 * Sampling internal remarks 抜取内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 62, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 63, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 63, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 64, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 64, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 65, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 65, $sub_char3, value);
	}


	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 66, $wg_cd);
	}

	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 66, $wg_cd, value);
	}


	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public boolean lims_flg() {
		return getConstBoolean(offset + 67, $lims_flg);
	}

	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public void lims_flg(boolean value) {
		setConstBoolean(offset + 67, $lims_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 68, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 68, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 69, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 69, $ext_sys_nm, value);
	}


	/**
	 * External inspection sampling result No. 外部検査抜取実績ＮＯ.<p>
	 *
	 */
	public String ext_insp_smpl_act_no() {
		return getConstString(offset + 70, $ext_insp_smpl_act_no);
	}

	/**
	 * External inspection sampling result No. 外部検査抜取実績ＮＯ.<p>
	 *
	 */
	public void ext_insp_smpl_act_no(String value) {
		setConstString(offset + 70, $ext_insp_smpl_act_no, value);
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
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($insp_smpl_act_no.equalsIgnoreCase(name)) {
			return insp_smpl_act_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
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
		if ($so_qty.equalsIgnoreCase(name)) {
			return so_qty();
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			return smpl_qty();
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
		if ($act_dt.equalsIgnoreCase(name)) {
			return act_dt();
		}
		if ($act_hm.equalsIgnoreCase(name)) {
			return act_hm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
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
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($insp_smpl_act_no.equalsIgnoreCase(name)) {
			return insp_smpl_act_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
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
		if ($so_qty.equalsIgnoreCase(name)) {
			return so_qty();
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			return smpl_qty();
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
		if ($act_dt.equalsIgnoreCase(name)) {
			return act_dt();
		}
		if ($act_hm.equalsIgnoreCase(name)) {
			return act_hm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
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
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
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
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
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
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
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
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
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
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
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
		if ($act_dt.equalsIgnoreCase(name)) {
			act_dt(value);
			return;
		}
		if ($act_hm.equalsIgnoreCase(name)) {
			act_hm(value);
			return;
		}
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
		if ($so_cmpl_flg.equalsIgnoreCase(name)) {
			so_cmpl_flg(value);
			return;
		}
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
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
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
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
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
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
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
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
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
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
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
		if ($act_dt.equalsIgnoreCase(name)) {
			act_dt(value);
			return;
		}
		if ($act_hm.equalsIgnoreCase(name)) {
			act_hm(value);
			return;
		}
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
		if ($so_cmpl_flg.equalsIgnoreCase(name)) {
			so_cmpl_flg(value);
			return;
		}
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

