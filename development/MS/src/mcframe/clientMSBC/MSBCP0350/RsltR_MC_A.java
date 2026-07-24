package mcframe.clientMSBC.MSBCP0350;

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
	 * Key キー.<p>
	 *
	 */
	public static final String $disp_00 = "disp_00";
	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public static final String $mps_grp_cd = "mps_grp_cd";
	/**
	 * MPS group name ＭＰＳグループ名.<p>
	 *
	 */
	public static final String $mps_grp_nm = "mps_grp_nm";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public static final String $strg_loc_nm = "strg_loc_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Requested cd. 依頼先ＣＤ.<p>
	 *
	 */
	public static final String $rqst_loc_cd = "rqst_loc_cd";
	/**
	 * Requested-to name 依頼先名.<p>
	 *
	 */
	public static final String $rqst_loc_nm = "rqst_loc_nm";
	/**
	 * Procurement provider cd. 調達先ＣＤ.<p>
	 *
	 */
	public static final String $proc_cd = "proc_cd";
	/**
	 * Procurement provider name 調達先名.<p>
	 *
	 */
	public static final String $proc_nm = "proc_nm";
	public static final String $itm_p = "itm_p";
	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Column value 項目値.<p>
	 *
	 */
	public static final String $row_title_col = "row_title_col";
	/**
	 * Column 項目.<p>
	 *
	 */
	public static final String $row_title_nm = "row_title_nm";
	public static final String $sum_p = "sum_p";
	public static final String $qty_00_p = "qty_00_p";
	public static final String $qty_01_p = "qty_01_p";
	public static final String $qty_02_p = "qty_02_p";
	public static final String $qty_03_p = "qty_03_p";
	public static final String $qty_04_p = "qty_04_p";
	public static final String $qty_05_p = "qty_05_p";
	public static final String $qty_06_p = "qty_06_p";
	public static final String $qty_07_p = "qty_07_p";
	public static final String $qty_08_p = "qty_08_p";
	public static final String $qty_09_p = "qty_09_p";
	public static final String $qty_10_p = "qty_10_p";
	public static final String $qty_11_p = "qty_11_p";
	public static final String $qty_12_p = "qty_12_p";
	public static final String $qty_13_p = "qty_13_p";
	public static final String $qty_14_p = "qty_14_p";
	public static final String $qty_15_p = "qty_15_p";
	public static final String $qty_16_p = "qty_16_p";
	public static final String $qty_17_p = "qty_17_p";
	public static final String $qty_18_p = "qty_18_p";
	public static final String $qty_19_p = "qty_19_p";
	public static final String $qty_20_p = "qty_20_p";
	public static final String $qty_21_p = "qty_21_p";
	public static final String $qty_22_p = "qty_22_p";
	public static final String $qty_23_p = "qty_23_p";
	public static final String $qty_24_p = "qty_24_p";
	public static final String $qty_25_p = "qty_25_p";
	public static final String $qty_26_p = "qty_26_p";
	public static final String $qty_27_p = "qty_27_p";
	public static final String $qty_28_p = "qty_28_p";
	public static final String $qty_29_p = "qty_29_p";
	public static final String $qty_30_p = "qty_30_p";
	public static final String $qty_31_p = "qty_31_p";
	public static final String $qty_32_p = "qty_32_p";
	public static final String $qty_33_p = "qty_33_p";
	public static final String $qty_34_p = "qty_34_p";
	public static final String $qty_35_p = "qty_35_p";
	public static final String $qty_36_p = "qty_36_p";
	public static final String $qty_37_p = "qty_37_p";
	public static final String $qty_38_p = "qty_38_p";
	public static final String $qty_39_p = "qty_39_p";
	public static final String $qty_40_p = "qty_40_p";
	public static final String $qty_41_p = "qty_41_p";
	public static final String $qty_42_p = "qty_42_p";
	public static final String $qty_43_p = "qty_43_p";
	public static final String $qty_44_p = "qty_44_p";
	public static final String $qty_45_p = "qty_45_p";
	public static final String $qty_46_p = "qty_46_p";
	public static final String $qty_47_p = "qty_47_p";
	public static final String $qty_48_p = "qty_48_p";
	public static final String $qty_49_p = "qty_49_p";
	public static final String $qty_50_p = "qty_50_p";
	public static final String $qty_51_p = "qty_51_p";
	public static final String $qty_52_p = "qty_52_p";
	public static final String $qty_53_p = "qty_53_p";
	public static final String $qty_54_p = "qty_54_p";
	public static final String $qty_55_p = "qty_55_p";
	public static final String $qty_56_p = "qty_56_p";
	public static final String $qty_57_p = "qty_57_p";
	public static final String $qty_58_p = "qty_58_p";
	public static final String $qty_59_p = "qty_59_p";
	public static final String $qty_60_p = "qty_60_p";
	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public static final String $grp_peg_no = "grp_peg_no";
	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public static final String $record_id = "record_id";
	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public static final String $record_grp_id = "record_grp_id";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $sum = $sum_p + ".qty";
	public static final String $qty_00 = $qty_00_p + ".qty";
	public static final String $qty_01 = $qty_01_p + ".qty";
	public static final String $qty_02 = $qty_02_p + ".qty";
	public static final String $qty_03 = $qty_03_p + ".qty";
	public static final String $qty_04 = $qty_04_p + ".qty";
	public static final String $qty_05 = $qty_05_p + ".qty";
	public static final String $qty_06 = $qty_06_p + ".qty";
	public static final String $qty_07 = $qty_07_p + ".qty";
	public static final String $qty_08 = $qty_08_p + ".qty";
	public static final String $qty_09 = $qty_09_p + ".qty";
	public static final String $qty_10 = $qty_10_p + ".qty";
	public static final String $qty_11 = $qty_11_p + ".qty";
	public static final String $qty_12 = $qty_12_p + ".qty";
	public static final String $qty_13 = $qty_13_p + ".qty";
	public static final String $qty_14 = $qty_14_p + ".qty";
	public static final String $qty_15 = $qty_15_p + ".qty";
	public static final String $qty_16 = $qty_16_p + ".qty";
	public static final String $qty_17 = $qty_17_p + ".qty";
	public static final String $qty_18 = $qty_18_p + ".qty";
	public static final String $qty_19 = $qty_19_p + ".qty";
	public static final String $qty_20 = $qty_20_p + ".qty";
	public static final String $qty_21 = $qty_21_p + ".qty";
	public static final String $qty_22 = $qty_22_p + ".qty";
	public static final String $qty_23 = $qty_23_p + ".qty";
	public static final String $qty_24 = $qty_24_p + ".qty";
	public static final String $qty_25 = $qty_25_p + ".qty";
	public static final String $qty_26 = $qty_26_p + ".qty";
	public static final String $qty_27 = $qty_27_p + ".qty";
	public static final String $qty_28 = $qty_28_p + ".qty";
	public static final String $qty_29 = $qty_29_p + ".qty";
	public static final String $qty_30 = $qty_30_p + ".qty";
	public static final String $qty_31 = $qty_31_p + ".qty";
	public static final String $qty_32 = $qty_32_p + ".qty";
	public static final String $qty_33 = $qty_33_p + ".qty";
	public static final String $qty_34 = $qty_34_p + ".qty";
	public static final String $qty_35 = $qty_35_p + ".qty";
	public static final String $qty_36 = $qty_36_p + ".qty";
	public static final String $qty_37 = $qty_37_p + ".qty";
	public static final String $qty_38 = $qty_38_p + ".qty";
	public static final String $qty_39 = $qty_39_p + ".qty";
	public static final String $qty_40 = $qty_40_p + ".qty";
	public static final String $qty_41 = $qty_41_p + ".qty";
	public static final String $qty_42 = $qty_42_p + ".qty";
	public static final String $qty_43 = $qty_43_p + ".qty";
	public static final String $qty_44 = $qty_44_p + ".qty";
	public static final String $qty_45 = $qty_45_p + ".qty";
	public static final String $qty_46 = $qty_46_p + ".qty";
	public static final String $qty_47 = $qty_47_p + ".qty";
	public static final String $qty_48 = $qty_48_p + ".qty";
	public static final String $qty_49 = $qty_49_p + ".qty";
	public static final String $qty_50 = $qty_50_p + ".qty";
	public static final String $qty_51 = $qty_51_p + ".qty";
	public static final String $qty_52 = $qty_52_p + ".qty";
	public static final String $qty_53 = $qty_53_p + ".qty";
	public static final String $qty_54 = $qty_54_p + ".qty";
	public static final String $qty_55 = $qty_55_p + ".qty";
	public static final String $qty_56 = $qty_56_p + ".qty";
	public static final String $qty_57 = $qty_57_p + ".qty";
	public static final String $qty_58 = $qty_58_p + ".qty";
	public static final String $qty_59 = $qty_59_p + ".qty";
	public static final String $qty_60 = $qty_60_p + ".qty";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_00_META = createStringMeta($disp_00);
	public static final MCMeta mps_grp_cd_META = createCommonMeta($mps_grp_cd, mcframe.commonMA.meta.MA_META.MPS_GRP_CD);
	public static final MCMeta mps_grp_nm_META = createCommonMeta($mps_grp_nm, mcframe.commonMA.meta.MA_META.MPS_GRP_NM);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rqst_loc_cd_META = createCommonMeta($rqst_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rqst_loc_nm_META = createCommonMeta($rqst_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta proc_cd_META = createStringMeta($proc_cd, 20);
	public static final MCMeta proc_nm_META = createStringMeta($proc_nm, 100);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta row_title_col_META = createStringMeta($row_title_col, 30);
	public static final MCMeta row_title_nm_META = createStringMeta($row_title_nm, 30);
	public static final MCMeta sum_p_META = createInnerRowMeta($sum_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_00_p_META = createInnerRowMeta($qty_00_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_01_p_META = createInnerRowMeta($qty_01_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_02_p_META = createInnerRowMeta($qty_02_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_03_p_META = createInnerRowMeta($qty_03_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_04_p_META = createInnerRowMeta($qty_04_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_05_p_META = createInnerRowMeta($qty_05_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_06_p_META = createInnerRowMeta($qty_06_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_07_p_META = createInnerRowMeta($qty_07_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_08_p_META = createInnerRowMeta($qty_08_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_09_p_META = createInnerRowMeta($qty_09_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_10_p_META = createInnerRowMeta($qty_10_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_11_p_META = createInnerRowMeta($qty_11_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_12_p_META = createInnerRowMeta($qty_12_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_13_p_META = createInnerRowMeta($qty_13_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_14_p_META = createInnerRowMeta($qty_14_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_15_p_META = createInnerRowMeta($qty_15_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_16_p_META = createInnerRowMeta($qty_16_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_17_p_META = createInnerRowMeta($qty_17_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_18_p_META = createInnerRowMeta($qty_18_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_19_p_META = createInnerRowMeta($qty_19_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_20_p_META = createInnerRowMeta($qty_20_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_21_p_META = createInnerRowMeta($qty_21_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_22_p_META = createInnerRowMeta($qty_22_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_23_p_META = createInnerRowMeta($qty_23_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_24_p_META = createInnerRowMeta($qty_24_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_25_p_META = createInnerRowMeta($qty_25_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_26_p_META = createInnerRowMeta($qty_26_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_27_p_META = createInnerRowMeta($qty_27_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_28_p_META = createInnerRowMeta($qty_28_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_29_p_META = createInnerRowMeta($qty_29_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_30_p_META = createInnerRowMeta($qty_30_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_31_p_META = createInnerRowMeta($qty_31_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_32_p_META = createInnerRowMeta($qty_32_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_33_p_META = createInnerRowMeta($qty_33_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_34_p_META = createInnerRowMeta($qty_34_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_35_p_META = createInnerRowMeta($qty_35_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_36_p_META = createInnerRowMeta($qty_36_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_37_p_META = createInnerRowMeta($qty_37_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_38_p_META = createInnerRowMeta($qty_38_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_39_p_META = createInnerRowMeta($qty_39_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_40_p_META = createInnerRowMeta($qty_40_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_41_p_META = createInnerRowMeta($qty_41_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_42_p_META = createInnerRowMeta($qty_42_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_43_p_META = createInnerRowMeta($qty_43_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_44_p_META = createInnerRowMeta($qty_44_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_45_p_META = createInnerRowMeta($qty_45_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_46_p_META = createInnerRowMeta($qty_46_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_47_p_META = createInnerRowMeta($qty_47_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_48_p_META = createInnerRowMeta($qty_48_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_49_p_META = createInnerRowMeta($qty_49_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_50_p_META = createInnerRowMeta($qty_50_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_51_p_META = createInnerRowMeta($qty_51_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_52_p_META = createInnerRowMeta($qty_52_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_53_p_META = createInnerRowMeta($qty_53_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_54_p_META = createInnerRowMeta($qty_54_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_55_p_META = createInnerRowMeta($qty_55_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_56_p_META = createInnerRowMeta($qty_56_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_57_p_META = createInnerRowMeta($qty_57_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_58_p_META = createInnerRowMeta($qty_58_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_59_p_META = createInnerRowMeta($qty_59_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_60_p_META = createInnerRowMeta($qty_60_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta grp_peg_no_META = createCommonMeta($grp_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta record_id_META = createNumberMeta($record_id);
	public static final MCMeta record_grp_id_META = createNumberMeta($record_grp_id);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			disp_00_META,
			mps_grp_cd_META,
			mps_grp_nm_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			wg_cd_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			rqst_loc_cd_META,
			rqst_loc_nm_META,
			proc_cd_META,
			proc_nm_META,
			itm_p_META,
			ym_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			row_title_col_META,
			row_title_nm_META,
			sum_p_META,
			qty_00_p_META,
			qty_01_p_META,
			qty_02_p_META,
			qty_03_p_META,
			qty_04_p_META,
			qty_05_p_META,
			qty_06_p_META,
			qty_07_p_META,
			qty_08_p_META,
			qty_09_p_META,
			qty_10_p_META,
			qty_11_p_META,
			qty_12_p_META,
			qty_13_p_META,
			qty_14_p_META,
			qty_15_p_META,
			qty_16_p_META,
			qty_17_p_META,
			qty_18_p_META,
			qty_19_p_META,
			qty_20_p_META,
			qty_21_p_META,
			qty_22_p_META,
			qty_23_p_META,
			qty_24_p_META,
			qty_25_p_META,
			qty_26_p_META,
			qty_27_p_META,
			qty_28_p_META,
			qty_29_p_META,
			qty_30_p_META,
			qty_31_p_META,
			qty_32_p_META,
			qty_33_p_META,
			qty_34_p_META,
			qty_35_p_META,
			qty_36_p_META,
			qty_37_p_META,
			qty_38_p_META,
			qty_39_p_META,
			qty_40_p_META,
			qty_41_p_META,
			qty_42_p_META,
			qty_43_p_META,
			qty_44_p_META,
			qty_45_p_META,
			qty_46_p_META,
			qty_47_p_META,
			qty_48_p_META,
			qty_49_p_META,
			qty_50_p_META,
			qty_51_p_META,
			qty_52_p_META,
			qty_53_p_META,
			qty_54_p_META,
			qty_55_p_META,
			qty_56_p_META,
			qty_57_p_META,
			qty_58_p_META,
			qty_59_p_META,
			qty_60_p_META,
			grp_peg_no_META,
			record_id_META,
			record_grp_id_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"sum",
				"qty_00",
				"qty_01",
				"qty_02",
				"qty_03",
				"qty_04",
				"qty_05",
				"qty_06",
				"qty_07",
				"qty_08",
				"qty_09",
				"qty_10",
				"qty_11",
				"qty_12",
				"qty_13",
				"qty_14",
				"qty_15",
				"qty_16",
				"qty_17",
				"qty_18",
				"qty_19",
				"qty_20",
				"qty_21",
				"qty_22",
				"qty_23",
				"qty_24",
				"qty_25",
				"qty_26",
				"qty_27",
				"qty_28",
				"qty_29",
				"qty_30",
				"qty_31",
				"qty_32",
				"qty_33",
				"qty_34",
				"qty_35",
				"qty_36",
				"qty_37",
				"qty_38",
				"qty_39",
				"qty_40",
				"qty_41",
				"qty_42",
				"qty_43",
				"qty_44",
				"qty_45",
				"qty_46",
				"qty_47",
				"qty_48",
				"qty_49",
				"qty_50",
				"qty_51",
				"qty_52",
				"qty_53",
				"qty_54",
				"qty_55",
				"qty_56",
				"qty_57",
				"qty_58",
				"qty_59",
				"qty_60"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$sum,
				$qty_00,
				$qty_01,
				$qty_02,
				$qty_03,
				$qty_04,
				$qty_05,
				$qty_06,
				$qty_07,
				$qty_08,
				$qty_09,
				$qty_10,
				$qty_11,
				$qty_12,
				$qty_13,
				$qty_14,
				$qty_15,
				$qty_16,
				$qty_17,
				$qty_18,
				$qty_19,
				$qty_20,
				$qty_21,
				$qty_22,
				$qty_23,
				$qty_24,
				$qty_25,
				$qty_26,
				$qty_27,
				$qty_28,
				$qty_29,
				$qty_30,
				$qty_31,
				$qty_32,
				$qty_33,
				$qty_34,
				$qty_35,
				$qty_36,
				$qty_37,
				$qty_38,
				$qty_39,
				$qty_40,
				$qty_41,
				$qty_42,
				$qty_43,
				$qty_44,
				$qty_45,
				$qty_46,
				$qty_47,
				$qty_48,
				$qty_49,
				$qty_50,
				$qty_51,
				$qty_52,
				$qty_53,
				$qty_54,
				$qty_55,
				$qty_56,
				$qty_57,
				$qty_58,
				$qty_59,
				$qty_60
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
	/** 項目属性情報のグループ[VH_KEY]のキー定数 */
	public static final String $$VH_KEY = "VH_KEY";
	/** 項目属性情報のグループ[VH_SUM]のキー定数 */
	public static final String $$VH_SUM = "VH_SUM";
	/** 項目属性情報のグループ[VH_SUM_ORDER]のキー定数 */
	public static final String $$VH_SUM_ORDER = "VH_SUM_ORDER";
	/** 項目属性情報のグループ[VH_DISP_COL]のキー定数 */
	public static final String $$VH_DISP_COL = "VH_DISP_COL";
	/** 項目属性情報のグループ[VH_DISP_GRP]のキー定数 */
	public static final String $$VH_DISP_GRP = "VH_DISP_GRP";
	/** 項目属性情報のグループ[VH_DISP_IDX]のキー定数 */
	public static final String $$VH_DISP_IDX = "VH_DISP_IDX";
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
		new MCExtMap.Entry($$VH_KEY, new MCExtList(
			new String[][]{
				{$qty_00_p + ".qty", "ELM"},	// qty_00_p.qty
				{$qty_01_p + ".qty", "ELM"},	// qty_01_p.qty
				{$qty_02_p + ".qty", "ELM"},	// qty_02_p.qty
				{$qty_03_p + ".qty", "ELM"},	// qty_03_p.qty
				{$qty_04_p + ".qty", "ELM"},	// qty_04_p.qty
				{$qty_05_p + ".qty", "ELM"},	// qty_05_p.qty
				{$qty_06_p + ".qty", "ELM"},	// qty_06_p.qty
				{$qty_07_p + ".qty", "ELM"},	// qty_07_p.qty
				{$qty_08_p + ".qty", "ELM"},	// qty_08_p.qty
				{$qty_09_p + ".qty", "ELM"},	// qty_09_p.qty
				{$qty_10_p + ".qty", "ELM"},	// qty_10_p.qty
				{$qty_11_p + ".qty", "ELM"},	// qty_11_p.qty
				{$qty_12_p + ".qty", "ELM"},	// qty_12_p.qty
				{$qty_13_p + ".qty", "ELM"},	// qty_13_p.qty
				{$qty_14_p + ".qty", "ELM"},	// qty_14_p.qty
				{$qty_15_p + ".qty", "ELM"},	// qty_15_p.qty
				{$qty_16_p + ".qty", "ELM"},	// qty_16_p.qty
				{$qty_17_p + ".qty", "ELM"},	// qty_17_p.qty
				{$qty_18_p + ".qty", "ELM"},	// qty_18_p.qty
				{$qty_19_p + ".qty", "ELM"},	// qty_19_p.qty
				{$qty_20_p + ".qty", "ELM"},	// qty_20_p.qty
				{$qty_21_p + ".qty", "ELM"},	// qty_21_p.qty
				{$qty_22_p + ".qty", "ELM"},	// qty_22_p.qty
				{$qty_23_p + ".qty", "ELM"},	// qty_23_p.qty
				{$qty_24_p + ".qty", "ELM"},	// qty_24_p.qty
				{$qty_25_p + ".qty", "ELM"},	// qty_25_p.qty
				{$qty_26_p + ".qty", "ELM"},	// qty_26_p.qty
				{$qty_27_p + ".qty", "ELM"},	// qty_27_p.qty
				{$qty_28_p + ".qty", "ELM"},	// qty_28_p.qty
				{$qty_29_p + ".qty", "ELM"},	// qty_29_p.qty
				{$qty_30_p + ".qty", "ELM"},	// qty_30_p.qty
				{$qty_31_p + ".qty", "ELM"},	// qty_31_p.qty
				{$qty_32_p + ".qty", "ELM"},	// qty_32_p.qty
				{$qty_33_p + ".qty", "ELM"},	// qty_33_p.qty
				{$qty_34_p + ".qty", "ELM"},	// qty_34_p.qty
				{$qty_35_p + ".qty", "ELM"},	// qty_35_p.qty
				{$qty_36_p + ".qty", "ELM"},	// qty_36_p.qty
				{$qty_37_p + ".qty", "ELM"},	// qty_37_p.qty
				{$qty_38_p + ".qty", "ELM"},	// qty_38_p.qty
				{$qty_39_p + ".qty", "ELM"},	// qty_39_p.qty
				{$qty_40_p + ".qty", "ELM"},	// qty_40_p.qty
				{$qty_41_p + ".qty", "ELM"},	// qty_41_p.qty
				{$qty_42_p + ".qty", "ELM"},	// qty_42_p.qty
				{$qty_43_p + ".qty", "ELM"},	// qty_43_p.qty
				{$qty_44_p + ".qty", "ELM"},	// qty_44_p.qty
				{$qty_45_p + ".qty", "ELM"},	// qty_45_p.qty
				{$qty_46_p + ".qty", "ELM"},	// qty_46_p.qty
				{$qty_47_p + ".qty", "ELM"},	// qty_47_p.qty
				{$qty_48_p + ".qty", "ELM"},	// qty_48_p.qty
				{$qty_49_p + ".qty", "ELM"},	// qty_49_p.qty
				{$qty_50_p + ".qty", "ELM"},	// qty_50_p.qty
				{$qty_51_p + ".qty", "ELM"},	// qty_51_p.qty
				{$qty_52_p + ".qty", "ELM"},	// qty_52_p.qty
				{$qty_53_p + ".qty", "ELM"},	// qty_53_p.qty
				{$qty_54_p + ".qty", "ELM"},	// qty_54_p.qty
				{$qty_55_p + ".qty", "ELM"},	// qty_55_p.qty
				{$qty_56_p + ".qty", "ELM"},	// qty_56_p.qty
				{$qty_57_p + ".qty", "ELM"},	// qty_57_p.qty
				{$qty_58_p + ".qty", "ELM"},	// qty_58_p.qty
				{$qty_59_p + ".qty", "ELM"},	// qty_59_p.qty
				{$qty_60_p + ".qty", "ELM"}	// qty_60_p.qty
			}
		)),
		new MCExtMap.Entry($$VH_SUM, new MCExtList(
			new String[][]{
				{$qty_00_p + ".qty", "sum"},	// qty_00_p.qty
				{$qty_01_p + ".qty", "sum"},	// qty_01_p.qty
				{$qty_02_p + ".qty", "sum"},	// qty_02_p.qty
				{$qty_03_p + ".qty", "sum"},	// qty_03_p.qty
				{$qty_04_p + ".qty", "sum"},	// qty_04_p.qty
				{$qty_05_p + ".qty", "sum"},	// qty_05_p.qty
				{$qty_06_p + ".qty", "sum"},	// qty_06_p.qty
				{$qty_07_p + ".qty", "sum"},	// qty_07_p.qty
				{$qty_08_p + ".qty", "sum"},	// qty_08_p.qty
				{$qty_09_p + ".qty", "sum"},	// qty_09_p.qty
				{$qty_10_p + ".qty", "sum"},	// qty_10_p.qty
				{$qty_11_p + ".qty", "sum"},	// qty_11_p.qty
				{$qty_12_p + ".qty", "sum"},	// qty_12_p.qty
				{$qty_13_p + ".qty", "sum"},	// qty_13_p.qty
				{$qty_14_p + ".qty", "sum"},	// qty_14_p.qty
				{$qty_15_p + ".qty", "sum"},	// qty_15_p.qty
				{$qty_16_p + ".qty", "sum"},	// qty_16_p.qty
				{$qty_17_p + ".qty", "sum"},	// qty_17_p.qty
				{$qty_18_p + ".qty", "sum"},	// qty_18_p.qty
				{$qty_19_p + ".qty", "sum"},	// qty_19_p.qty
				{$qty_20_p + ".qty", "sum"},	// qty_20_p.qty
				{$qty_21_p + ".qty", "sum"},	// qty_21_p.qty
				{$qty_22_p + ".qty", "sum"},	// qty_22_p.qty
				{$qty_23_p + ".qty", "sum"},	// qty_23_p.qty
				{$qty_24_p + ".qty", "sum"},	// qty_24_p.qty
				{$qty_25_p + ".qty", "sum"},	// qty_25_p.qty
				{$qty_26_p + ".qty", "sum"},	// qty_26_p.qty
				{$qty_27_p + ".qty", "sum"},	// qty_27_p.qty
				{$qty_28_p + ".qty", "sum"},	// qty_28_p.qty
				{$qty_29_p + ".qty", "sum"},	// qty_29_p.qty
				{$qty_30_p + ".qty", "sum"},	// qty_30_p.qty
				{$qty_31_p + ".qty", "sum"},	// qty_31_p.qty
				{$qty_32_p + ".qty", "sum"},	// qty_32_p.qty
				{$qty_33_p + ".qty", "sum"},	// qty_33_p.qty
				{$qty_34_p + ".qty", "sum"},	// qty_34_p.qty
				{$qty_35_p + ".qty", "sum"},	// qty_35_p.qty
				{$qty_36_p + ".qty", "sum"},	// qty_36_p.qty
				{$qty_37_p + ".qty", "sum"},	// qty_37_p.qty
				{$qty_38_p + ".qty", "sum"},	// qty_38_p.qty
				{$qty_39_p + ".qty", "sum"},	// qty_39_p.qty
				{$qty_40_p + ".qty", "sum"},	// qty_40_p.qty
				{$qty_41_p + ".qty", "sum"},	// qty_41_p.qty
				{$qty_42_p + ".qty", "sum"},	// qty_42_p.qty
				{$qty_43_p + ".qty", "sum"},	// qty_43_p.qty
				{$qty_44_p + ".qty", "sum"},	// qty_44_p.qty
				{$qty_45_p + ".qty", "sum"},	// qty_45_p.qty
				{$qty_46_p + ".qty", "sum"},	// qty_46_p.qty
				{$qty_47_p + ".qty", "sum"},	// qty_47_p.qty
				{$qty_48_p + ".qty", "sum"},	// qty_48_p.qty
				{$qty_49_p + ".qty", "sum"},	// qty_49_p.qty
				{$qty_50_p + ".qty", "sum"},	// qty_50_p.qty
				{$qty_51_p + ".qty", "sum"},	// qty_51_p.qty
				{$qty_52_p + ".qty", "sum"},	// qty_52_p.qty
				{$qty_53_p + ".qty", "sum"},	// qty_53_p.qty
				{$qty_54_p + ".qty", "sum"},	// qty_54_p.qty
				{$qty_55_p + ".qty", "sum"},	// qty_55_p.qty
				{$qty_56_p + ".qty", "sum"},	// qty_56_p.qty
				{$qty_57_p + ".qty", "sum"},	// qty_57_p.qty
				{$qty_58_p + ".qty", "sum"},	// qty_58_p.qty
				{$qty_59_p + ".qty", "sum"},	// qty_59_p.qty
				{$qty_60_p + ".qty", "sum"}	// qty_60_p.qty
			}
		)),
		new MCExtMap.Entry($$VH_SUM_ORDER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_COL, new MCExtList(
			new String[][]{
				{$mps_grp_cd, "disp_00"},	// mps_grp_cd
				{$mps_grp_nm, "disp_00"},	// mps_grp_nm
				{$strg_loc_cd, "disp_00"},	// strg_loc_cd
				{$strg_loc_nm, "disp_00"},	// strg_loc_nm
				{$wg_cd, "disp_00"},	// wg_cd
				{$mfg_loc_cd, "disp_00"},	// mfg_loc_cd
				{$mfg_loc_nm, "disp_00"},	// mfg_loc_nm
				{$sppl_cd, "disp_00"},	// sppl_cd
				{$sppl_nm, "disp_00"},	// sppl_nm
				{$rqst_loc_cd, "disp_00"},	// rqst_loc_cd
				{$rqst_loc_nm, "disp_00"},	// rqst_loc_nm
				{$proc_cd, "disp_00"},	// proc_cd
				{$proc_nm, "disp_00"},	// proc_nm
				{$itm_p + ".itm_cd", "disp_00"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "disp_00"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "disp_00"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "disp_00"},	// itm_p.itm_sub3
				{$itm_p + ".itm_nm", "disp_00"}	// itm_p.itm_nm
			}
		)),
		new MCExtMap.Entry($$VH_DISP_GRP, new MCExtList(
			new String[][]{
				{$mps_grp_cd, "0"},	// mps_grp_cd
				{$mps_grp_nm, "0"},	// mps_grp_nm
				{$strg_loc_cd, "1"},	// strg_loc_cd
				{$strg_loc_nm, "1"},	// strg_loc_nm
				{$wg_cd, "1"},	// wg_cd
				{$mfg_loc_cd, "2"},	// mfg_loc_cd
				{$mfg_loc_nm, "2"},	// mfg_loc_nm
				{$sppl_cd, "2"},	// sppl_cd
				{$sppl_nm, "2"},	// sppl_nm
				{$rqst_loc_cd, "2"},	// rqst_loc_cd
				{$rqst_loc_nm, "2"},	// rqst_loc_nm
				{$proc_cd, "2"},	// proc_cd
				{$proc_nm, "2"},	// proc_nm
				{$itm_p + ".itm_cd", "3"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "3"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "3"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "3"},	// itm_p.itm_sub3
				{$itm_p + ".itm_nm", "3"}	// itm_p.itm_nm
			}
		)),
		new MCExtMap.Entry($$VH_DISP_IDX, new MCExtList(
			new String[][]{
				{$mps_grp_cd, "0"},	// mps_grp_cd
				{$mps_grp_nm, "1"},	// mps_grp_nm
				{$strg_loc_cd, "0"},	// strg_loc_cd
				{$strg_loc_nm, "1"},	// strg_loc_nm
				{$wg_cd, "2"},	// wg_cd
				{$mfg_loc_cd, "0"},	// mfg_loc_cd
				{$mfg_loc_nm, "1"},	// mfg_loc_nm
				{$sppl_cd, "2"},	// sppl_cd
				{$sppl_nm, "3"},	// sppl_nm
				{$rqst_loc_cd, "4"},	// rqst_loc_cd
				{$rqst_loc_nm, "5"},	// rqst_loc_nm
				{$proc_cd, "6"},	// proc_cd
				{$proc_nm, "7"},	// proc_nm
				{$itm_p + ".itm_cd", "0"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "1"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "2"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "3"},	// itm_p.itm_sub3
				{$itm_p + ".itm_nm", "4"}	// itm_p.itm_nm
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"}	// wg_cd
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
	 * Key キー.<p>
	 *
	 */
	public String disp_00() {
		return getConstString(offset + 1, $disp_00);
	}

	/**
	 * Key キー.<p>
	 *
	 */
	public void disp_00(String value) {
		setConstString(offset + 1, $disp_00, value);
	}


	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public String mps_grp_cd() {
		return getConstString(offset + 2, $mps_grp_cd);
	}

	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public void mps_grp_cd(String value) {
		setConstString(offset + 2, $mps_grp_cd, value);
	}


	/**
	 * MPS group name ＭＰＳグループ名.<p>
	 *
	 */
	public String mps_grp_nm() {
		return getConstString(offset + 3, $mps_grp_nm);
	}

	/**
	 * MPS group name ＭＰＳグループ名.<p>
	 *
	 */
	public void mps_grp_nm(String value) {
		setConstString(offset + 3, $mps_grp_nm, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 4, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 4, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 5, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 5, $strg_loc_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 6, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 6, $wg_cd, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 7, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 7, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 8, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 8, $mfg_loc_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 9, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 9, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 10, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 10, $sppl_nm, value);
	}


	/**
	 * Requested cd. 依頼先ＣＤ.<p>
	 *
	 */
	public String rqst_loc_cd() {
		return getConstString(offset + 11, $rqst_loc_cd);
	}

	/**
	 * Requested cd. 依頼先ＣＤ.<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		setConstString(offset + 11, $rqst_loc_cd, value);
	}


	/**
	 * Requested-to name 依頼先名.<p>
	 *
	 */
	public String rqst_loc_nm() {
		return getConstString(offset + 12, $rqst_loc_nm);
	}

	/**
	 * Requested-to name 依頼先名.<p>
	 *
	 */
	public void rqst_loc_nm(String value) {
		setConstString(offset + 12, $rqst_loc_nm, value);
	}


	/**
	 * Procurement provider cd. 調達先ＣＤ.<p>
	 *
	 */
	public String proc_cd() {
		return getConstString(offset + 13, $proc_cd);
	}

	/**
	 * Procurement provider cd. 調達先ＣＤ.<p>
	 *
	 */
	public void proc_cd(String value) {
		setConstString(offset + 13, $proc_cd, value);
	}


	/**
	 * Procurement provider name 調達先名.<p>
	 *
	 */
	public String proc_nm() {
		return getConstString(offset + 14, $proc_nm);
	}

	/**
	 * Procurement provider name 調達先名.<p>
	 *
	 */
	public void proc_nm(String value) {
		setConstString(offset + 14, $proc_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 15, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 15, $itm_p, row);
	}


	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 16, $ym);
	}

	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 16, $ym, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 17, $unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 17, $unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 18, $unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 18, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 19, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 19, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 19, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 19, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 19, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 19, $dec_place, value);
	}


	/**
	 * Column value 項目値.<p>
	 *
	 */
	public String row_title_col() {
		return getConstString(offset + 20, $row_title_col);
	}

	/**
	 * Column value 項目値.<p>
	 *
	 */
	public void row_title_col(String value) {
		setConstString(offset + 20, $row_title_col, value);
	}


	/**
	 * Column 項目.<p>
	 *
	 */
	public String row_title_nm() {
		return getConstString(offset + 21, $row_title_nm);
	}

	/**
	 * Column 項目.<p>
	 *
	 */
	public void row_title_nm(String value) {
		setConstString(offset + 21, $row_title_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR sum_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 22, $sum_p);
	}
	
	public void sum_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 22, $sum_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_00_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 23, $qty_00_p);
	}
	
	public void qty_00_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 23, $qty_00_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_01_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 24, $qty_01_p);
	}
	
	public void qty_01_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 24, $qty_01_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_02_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 25, $qty_02_p);
	}
	
	public void qty_02_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 25, $qty_02_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_03_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 26, $qty_03_p);
	}
	
	public void qty_03_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 26, $qty_03_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_04_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 27, $qty_04_p);
	}
	
	public void qty_04_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 27, $qty_04_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_05_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 28, $qty_05_p);
	}
	
	public void qty_05_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 28, $qty_05_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_06_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 29, $qty_06_p);
	}
	
	public void qty_06_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 29, $qty_06_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_07_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 30, $qty_07_p);
	}
	
	public void qty_07_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 30, $qty_07_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_08_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 31, $qty_08_p);
	}
	
	public void qty_08_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 31, $qty_08_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_09_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 32, $qty_09_p);
	}
	
	public void qty_09_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 32, $qty_09_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_10_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 33, $qty_10_p);
	}
	
	public void qty_10_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 33, $qty_10_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_11_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 34, $qty_11_p);
	}
	
	public void qty_11_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 34, $qty_11_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_12_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 35, $qty_12_p);
	}
	
	public void qty_12_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 35, $qty_12_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_13_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 36, $qty_13_p);
	}
	
	public void qty_13_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 36, $qty_13_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_14_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 37, $qty_14_p);
	}
	
	public void qty_14_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 37, $qty_14_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_15_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 38, $qty_15_p);
	}
	
	public void qty_15_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 38, $qty_15_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_16_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 39, $qty_16_p);
	}
	
	public void qty_16_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 39, $qty_16_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_17_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 40, $qty_17_p);
	}
	
	public void qty_17_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 40, $qty_17_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_18_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 41, $qty_18_p);
	}
	
	public void qty_18_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 41, $qty_18_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_19_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 42, $qty_19_p);
	}
	
	public void qty_19_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 42, $qty_19_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_20_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 43, $qty_20_p);
	}
	
	public void qty_20_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 43, $qty_20_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_21_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 44, $qty_21_p);
	}
	
	public void qty_21_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 44, $qty_21_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_22_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 45, $qty_22_p);
	}
	
	public void qty_22_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 45, $qty_22_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_23_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 46, $qty_23_p);
	}
	
	public void qty_23_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 46, $qty_23_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_24_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 47, $qty_24_p);
	}
	
	public void qty_24_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 47, $qty_24_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_25_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 48, $qty_25_p);
	}
	
	public void qty_25_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 48, $qty_25_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_26_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 49, $qty_26_p);
	}
	
	public void qty_26_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 49, $qty_26_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_27_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 50, $qty_27_p);
	}
	
	public void qty_27_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 50, $qty_27_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_28_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 51, $qty_28_p);
	}
	
	public void qty_28_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 51, $qty_28_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_29_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 52, $qty_29_p);
	}
	
	public void qty_29_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 52, $qty_29_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_30_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 53, $qty_30_p);
	}
	
	public void qty_30_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 53, $qty_30_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_31_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 54, $qty_31_p);
	}
	
	public void qty_31_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 54, $qty_31_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_32_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 55, $qty_32_p);
	}
	
	public void qty_32_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 55, $qty_32_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_33_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 56, $qty_33_p);
	}
	
	public void qty_33_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 56, $qty_33_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_34_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 57, $qty_34_p);
	}
	
	public void qty_34_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 57, $qty_34_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_35_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 58, $qty_35_p);
	}
	
	public void qty_35_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 58, $qty_35_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_36_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 59, $qty_36_p);
	}
	
	public void qty_36_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 59, $qty_36_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_37_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 60, $qty_37_p);
	}
	
	public void qty_37_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 60, $qty_37_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_38_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 61, $qty_38_p);
	}
	
	public void qty_38_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 61, $qty_38_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_39_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 62, $qty_39_p);
	}
	
	public void qty_39_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 62, $qty_39_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_40_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 63, $qty_40_p);
	}
	
	public void qty_40_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 63, $qty_40_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_41_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 64, $qty_41_p);
	}
	
	public void qty_41_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 64, $qty_41_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_42_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 65, $qty_42_p);
	}
	
	public void qty_42_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 65, $qty_42_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_43_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 66, $qty_43_p);
	}
	
	public void qty_43_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 66, $qty_43_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_44_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 67, $qty_44_p);
	}
	
	public void qty_44_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 67, $qty_44_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_45_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 68, $qty_45_p);
	}
	
	public void qty_45_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 68, $qty_45_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_46_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 69, $qty_46_p);
	}
	
	public void qty_46_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 69, $qty_46_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_47_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 70, $qty_47_p);
	}
	
	public void qty_47_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 70, $qty_47_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_48_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 71, $qty_48_p);
	}
	
	public void qty_48_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 71, $qty_48_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_49_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 72, $qty_49_p);
	}
	
	public void qty_49_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 72, $qty_49_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_50_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 73, $qty_50_p);
	}
	
	public void qty_50_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 73, $qty_50_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_51_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 74, $qty_51_p);
	}
	
	public void qty_51_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 74, $qty_51_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_52_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 75, $qty_52_p);
	}
	
	public void qty_52_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 75, $qty_52_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_53_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 76, $qty_53_p);
	}
	
	public void qty_53_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 76, $qty_53_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_54_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 77, $qty_54_p);
	}
	
	public void qty_54_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 77, $qty_54_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_55_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 78, $qty_55_p);
	}
	
	public void qty_55_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 78, $qty_55_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_56_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 79, $qty_56_p);
	}
	
	public void qty_56_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 79, $qty_56_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_57_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 80, $qty_57_p);
	}
	
	public void qty_57_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 80, $qty_57_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_58_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 81, $qty_58_p);
	}
	
	public void qty_58_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 81, $qty_58_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_59_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 82, $qty_59_p);
	}
	
	public void qty_59_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 82, $qty_59_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_60_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 83, $qty_60_p);
	}
	
	public void qty_60_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 83, $qty_60_p, row);
	}


	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber grp_peg_no() {
		return getConstNumber(offset + 84, $grp_peg_no);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(MCNumber value) {
		setConstNumber(offset + 84, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(int value) {
		setConstNumber(offset + 84, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(long value) {
		setConstNumber(offset + 84, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(float value) {
		setConstNumber(offset + 84, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(double value) {
		setConstNumber(offset + 84, $grp_peg_no, value);
	}


	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public MCNumber record_id() {
		return getConstNumber(offset + 85, $record_id);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void record_id(MCNumber value) {
		setConstNumber(offset + 85, $record_id, value);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void record_id(int value) {
		setConstNumber(offset + 85, $record_id, value);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void record_id(long value) {
		setConstNumber(offset + 85, $record_id, value);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void record_id(float value) {
		setConstNumber(offset + 85, $record_id, value);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void record_id(double value) {
		setConstNumber(offset + 85, $record_id, value);
	}


	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public MCNumber record_grp_id() {
		return getConstNumber(offset + 86, $record_grp_id);
	}

	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public void record_grp_id(MCNumber value) {
		setConstNumber(offset + 86, $record_grp_id, value);
	}

	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public void record_grp_id(int value) {
		setConstNumber(offset + 86, $record_grp_id, value);
	}

	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public void record_grp_id(long value) {
		setConstNumber(offset + 86, $record_grp_id, value);
	}

	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public void record_grp_id(float value) {
		setConstNumber(offset + 86, $record_grp_id, value);
	}

	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public void record_grp_id(double value) {
		setConstNumber(offset + 86, $record_grp_id, value);
	}


	public String getString(String name) {
		if ($disp_00.equalsIgnoreCase(name)) {
			return disp_00();
		}
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			return mps_grp_cd();
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			return mps_grp_nm();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($proc_cd.equalsIgnoreCase(name)) {
			return proc_cd();
		}
		if ($proc_nm.equalsIgnoreCase(name)) {
			return proc_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($row_title_col.equalsIgnoreCase(name)) {
			return row_title_col();
		}
		if ($row_title_nm.equalsIgnoreCase(name)) {
			return row_title_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			return grp_peg_no();
		}
		if ($record_id.equalsIgnoreCase(name)) {
			return record_id();
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			return record_grp_id();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($disp_00.equalsIgnoreCase(name)) {
			return disp_00();
		}
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			return mps_grp_cd();
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			return mps_grp_nm();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($proc_cd.equalsIgnoreCase(name)) {
			return proc_cd();
		}
		if ($proc_nm.equalsIgnoreCase(name)) {
			return proc_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($row_title_col.equalsIgnoreCase(name)) {
			return row_title_col();
		}
		if ($row_title_nm.equalsIgnoreCase(name)) {
			return row_title_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			return grp_peg_no();
		}
		if ($record_id.equalsIgnoreCase(name)) {
			return record_id();
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			return record_grp_id();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($disp_00.equalsIgnoreCase(name)) {
			disp_00(value);
			return;
		}
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			mps_grp_cd(value);
			return;
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			mps_grp_nm(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
			return;
		}
		if ($proc_cd.equalsIgnoreCase(name)) {
			proc_cd(value);
			return;
		}
		if ($proc_nm.equalsIgnoreCase(name)) {
			proc_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($row_title_col.equalsIgnoreCase(name)) {
			row_title_col(value);
			return;
		}
		if ($row_title_nm.equalsIgnoreCase(name)) {
			row_title_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($disp_00.equalsIgnoreCase(name)) {
			disp_00(value);
			return;
		}
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			mps_grp_cd(value);
			return;
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			mps_grp_nm(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
			return;
		}
		if ($proc_cd.equalsIgnoreCase(name)) {
			proc_cd(value);
			return;
		}
		if ($proc_nm.equalsIgnoreCase(name)) {
			proc_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($row_title_col.equalsIgnoreCase(name)) {
			row_title_col(value);
			return;
		}
		if ($row_title_nm.equalsIgnoreCase(name)) {
			row_title_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($sum_p.equalsIgnoreCase(name)) {
			return sum_p();
		}
		if ($qty_00_p.equalsIgnoreCase(name)) {
			return qty_00_p();
		}
		if ($qty_01_p.equalsIgnoreCase(name)) {
			return qty_01_p();
		}
		if ($qty_02_p.equalsIgnoreCase(name)) {
			return qty_02_p();
		}
		if ($qty_03_p.equalsIgnoreCase(name)) {
			return qty_03_p();
		}
		if ($qty_04_p.equalsIgnoreCase(name)) {
			return qty_04_p();
		}
		if ($qty_05_p.equalsIgnoreCase(name)) {
			return qty_05_p();
		}
		if ($qty_06_p.equalsIgnoreCase(name)) {
			return qty_06_p();
		}
		if ($qty_07_p.equalsIgnoreCase(name)) {
			return qty_07_p();
		}
		if ($qty_08_p.equalsIgnoreCase(name)) {
			return qty_08_p();
		}
		if ($qty_09_p.equalsIgnoreCase(name)) {
			return qty_09_p();
		}
		if ($qty_10_p.equalsIgnoreCase(name)) {
			return qty_10_p();
		}
		if ($qty_11_p.equalsIgnoreCase(name)) {
			return qty_11_p();
		}
		if ($qty_12_p.equalsIgnoreCase(name)) {
			return qty_12_p();
		}
		if ($qty_13_p.equalsIgnoreCase(name)) {
			return qty_13_p();
		}
		if ($qty_14_p.equalsIgnoreCase(name)) {
			return qty_14_p();
		}
		if ($qty_15_p.equalsIgnoreCase(name)) {
			return qty_15_p();
		}
		if ($qty_16_p.equalsIgnoreCase(name)) {
			return qty_16_p();
		}
		if ($qty_17_p.equalsIgnoreCase(name)) {
			return qty_17_p();
		}
		if ($qty_18_p.equalsIgnoreCase(name)) {
			return qty_18_p();
		}
		if ($qty_19_p.equalsIgnoreCase(name)) {
			return qty_19_p();
		}
		if ($qty_20_p.equalsIgnoreCase(name)) {
			return qty_20_p();
		}
		if ($qty_21_p.equalsIgnoreCase(name)) {
			return qty_21_p();
		}
		if ($qty_22_p.equalsIgnoreCase(name)) {
			return qty_22_p();
		}
		if ($qty_23_p.equalsIgnoreCase(name)) {
			return qty_23_p();
		}
		if ($qty_24_p.equalsIgnoreCase(name)) {
			return qty_24_p();
		}
		if ($qty_25_p.equalsIgnoreCase(name)) {
			return qty_25_p();
		}
		if ($qty_26_p.equalsIgnoreCase(name)) {
			return qty_26_p();
		}
		if ($qty_27_p.equalsIgnoreCase(name)) {
			return qty_27_p();
		}
		if ($qty_28_p.equalsIgnoreCase(name)) {
			return qty_28_p();
		}
		if ($qty_29_p.equalsIgnoreCase(name)) {
			return qty_29_p();
		}
		if ($qty_30_p.equalsIgnoreCase(name)) {
			return qty_30_p();
		}
		if ($qty_31_p.equalsIgnoreCase(name)) {
			return qty_31_p();
		}
		if ($qty_32_p.equalsIgnoreCase(name)) {
			return qty_32_p();
		}
		if ($qty_33_p.equalsIgnoreCase(name)) {
			return qty_33_p();
		}
		if ($qty_34_p.equalsIgnoreCase(name)) {
			return qty_34_p();
		}
		if ($qty_35_p.equalsIgnoreCase(name)) {
			return qty_35_p();
		}
		if ($qty_36_p.equalsIgnoreCase(name)) {
			return qty_36_p();
		}
		if ($qty_37_p.equalsIgnoreCase(name)) {
			return qty_37_p();
		}
		if ($qty_38_p.equalsIgnoreCase(name)) {
			return qty_38_p();
		}
		if ($qty_39_p.equalsIgnoreCase(name)) {
			return qty_39_p();
		}
		if ($qty_40_p.equalsIgnoreCase(name)) {
			return qty_40_p();
		}
		if ($qty_41_p.equalsIgnoreCase(name)) {
			return qty_41_p();
		}
		if ($qty_42_p.equalsIgnoreCase(name)) {
			return qty_42_p();
		}
		if ($qty_43_p.equalsIgnoreCase(name)) {
			return qty_43_p();
		}
		if ($qty_44_p.equalsIgnoreCase(name)) {
			return qty_44_p();
		}
		if ($qty_45_p.equalsIgnoreCase(name)) {
			return qty_45_p();
		}
		if ($qty_46_p.equalsIgnoreCase(name)) {
			return qty_46_p();
		}
		if ($qty_47_p.equalsIgnoreCase(name)) {
			return qty_47_p();
		}
		if ($qty_48_p.equalsIgnoreCase(name)) {
			return qty_48_p();
		}
		if ($qty_49_p.equalsIgnoreCase(name)) {
			return qty_49_p();
		}
		if ($qty_50_p.equalsIgnoreCase(name)) {
			return qty_50_p();
		}
		if ($qty_51_p.equalsIgnoreCase(name)) {
			return qty_51_p();
		}
		if ($qty_52_p.equalsIgnoreCase(name)) {
			return qty_52_p();
		}
		if ($qty_53_p.equalsIgnoreCase(name)) {
			return qty_53_p();
		}
		if ($qty_54_p.equalsIgnoreCase(name)) {
			return qty_54_p();
		}
		if ($qty_55_p.equalsIgnoreCase(name)) {
			return qty_55_p();
		}
		if ($qty_56_p.equalsIgnoreCase(name)) {
			return qty_56_p();
		}
		if ($qty_57_p.equalsIgnoreCase(name)) {
			return qty_57_p();
		}
		if ($qty_58_p.equalsIgnoreCase(name)) {
			return qty_58_p();
		}
		if ($qty_59_p.equalsIgnoreCase(name)) {
			return qty_59_p();
		}
		if ($qty_60_p.equalsIgnoreCase(name)) {
			return qty_60_p();
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
		if ($sum_p.equalsIgnoreCase(name)) {
			sum_p(
				((MCContainerMeta) sum_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_00_p.equalsIgnoreCase(name)) {
			qty_00_p(
				((MCContainerMeta) qty_00_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_01_p.equalsIgnoreCase(name)) {
			qty_01_p(
				((MCContainerMeta) qty_01_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_02_p.equalsIgnoreCase(name)) {
			qty_02_p(
				((MCContainerMeta) qty_02_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_03_p.equalsIgnoreCase(name)) {
			qty_03_p(
				((MCContainerMeta) qty_03_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_04_p.equalsIgnoreCase(name)) {
			qty_04_p(
				((MCContainerMeta) qty_04_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_05_p.equalsIgnoreCase(name)) {
			qty_05_p(
				((MCContainerMeta) qty_05_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_06_p.equalsIgnoreCase(name)) {
			qty_06_p(
				((MCContainerMeta) qty_06_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_07_p.equalsIgnoreCase(name)) {
			qty_07_p(
				((MCContainerMeta) qty_07_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_08_p.equalsIgnoreCase(name)) {
			qty_08_p(
				((MCContainerMeta) qty_08_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_09_p.equalsIgnoreCase(name)) {
			qty_09_p(
				((MCContainerMeta) qty_09_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_10_p.equalsIgnoreCase(name)) {
			qty_10_p(
				((MCContainerMeta) qty_10_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_11_p.equalsIgnoreCase(name)) {
			qty_11_p(
				((MCContainerMeta) qty_11_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_12_p.equalsIgnoreCase(name)) {
			qty_12_p(
				((MCContainerMeta) qty_12_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_13_p.equalsIgnoreCase(name)) {
			qty_13_p(
				((MCContainerMeta) qty_13_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_14_p.equalsIgnoreCase(name)) {
			qty_14_p(
				((MCContainerMeta) qty_14_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_15_p.equalsIgnoreCase(name)) {
			qty_15_p(
				((MCContainerMeta) qty_15_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_16_p.equalsIgnoreCase(name)) {
			qty_16_p(
				((MCContainerMeta) qty_16_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_17_p.equalsIgnoreCase(name)) {
			qty_17_p(
				((MCContainerMeta) qty_17_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_18_p.equalsIgnoreCase(name)) {
			qty_18_p(
				((MCContainerMeta) qty_18_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_19_p.equalsIgnoreCase(name)) {
			qty_19_p(
				((MCContainerMeta) qty_19_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_20_p.equalsIgnoreCase(name)) {
			qty_20_p(
				((MCContainerMeta) qty_20_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_21_p.equalsIgnoreCase(name)) {
			qty_21_p(
				((MCContainerMeta) qty_21_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_22_p.equalsIgnoreCase(name)) {
			qty_22_p(
				((MCContainerMeta) qty_22_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_23_p.equalsIgnoreCase(name)) {
			qty_23_p(
				((MCContainerMeta) qty_23_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_24_p.equalsIgnoreCase(name)) {
			qty_24_p(
				((MCContainerMeta) qty_24_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_25_p.equalsIgnoreCase(name)) {
			qty_25_p(
				((MCContainerMeta) qty_25_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_26_p.equalsIgnoreCase(name)) {
			qty_26_p(
				((MCContainerMeta) qty_26_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_27_p.equalsIgnoreCase(name)) {
			qty_27_p(
				((MCContainerMeta) qty_27_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_28_p.equalsIgnoreCase(name)) {
			qty_28_p(
				((MCContainerMeta) qty_28_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_29_p.equalsIgnoreCase(name)) {
			qty_29_p(
				((MCContainerMeta) qty_29_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_30_p.equalsIgnoreCase(name)) {
			qty_30_p(
				((MCContainerMeta) qty_30_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_31_p.equalsIgnoreCase(name)) {
			qty_31_p(
				((MCContainerMeta) qty_31_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_32_p.equalsIgnoreCase(name)) {
			qty_32_p(
				((MCContainerMeta) qty_32_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_33_p.equalsIgnoreCase(name)) {
			qty_33_p(
				((MCContainerMeta) qty_33_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_34_p.equalsIgnoreCase(name)) {
			qty_34_p(
				((MCContainerMeta) qty_34_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_35_p.equalsIgnoreCase(name)) {
			qty_35_p(
				((MCContainerMeta) qty_35_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_36_p.equalsIgnoreCase(name)) {
			qty_36_p(
				((MCContainerMeta) qty_36_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_37_p.equalsIgnoreCase(name)) {
			qty_37_p(
				((MCContainerMeta) qty_37_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_38_p.equalsIgnoreCase(name)) {
			qty_38_p(
				((MCContainerMeta) qty_38_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_39_p.equalsIgnoreCase(name)) {
			qty_39_p(
				((MCContainerMeta) qty_39_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_40_p.equalsIgnoreCase(name)) {
			qty_40_p(
				((MCContainerMeta) qty_40_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_41_p.equalsIgnoreCase(name)) {
			qty_41_p(
				((MCContainerMeta) qty_41_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_42_p.equalsIgnoreCase(name)) {
			qty_42_p(
				((MCContainerMeta) qty_42_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_43_p.equalsIgnoreCase(name)) {
			qty_43_p(
				((MCContainerMeta) qty_43_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_44_p.equalsIgnoreCase(name)) {
			qty_44_p(
				((MCContainerMeta) qty_44_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_45_p.equalsIgnoreCase(name)) {
			qty_45_p(
				((MCContainerMeta) qty_45_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_46_p.equalsIgnoreCase(name)) {
			qty_46_p(
				((MCContainerMeta) qty_46_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_47_p.equalsIgnoreCase(name)) {
			qty_47_p(
				((MCContainerMeta) qty_47_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_48_p.equalsIgnoreCase(name)) {
			qty_48_p(
				((MCContainerMeta) qty_48_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_49_p.equalsIgnoreCase(name)) {
			qty_49_p(
				((MCContainerMeta) qty_49_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_50_p.equalsIgnoreCase(name)) {
			qty_50_p(
				((MCContainerMeta) qty_50_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_51_p.equalsIgnoreCase(name)) {
			qty_51_p(
				((MCContainerMeta) qty_51_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_52_p.equalsIgnoreCase(name)) {
			qty_52_p(
				((MCContainerMeta) qty_52_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_53_p.equalsIgnoreCase(name)) {
			qty_53_p(
				((MCContainerMeta) qty_53_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_54_p.equalsIgnoreCase(name)) {
			qty_54_p(
				((MCContainerMeta) qty_54_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_55_p.equalsIgnoreCase(name)) {
			qty_55_p(
				((MCContainerMeta) qty_55_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_56_p.equalsIgnoreCase(name)) {
			qty_56_p(
				((MCContainerMeta) qty_56_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_57_p.equalsIgnoreCase(name)) {
			qty_57_p(
				((MCContainerMeta) qty_57_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_58_p.equalsIgnoreCase(name)) {
			qty_58_p(
				((MCContainerMeta) qty_58_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_59_p.equalsIgnoreCase(name)) {
			qty_59_p(
				((MCContainerMeta) qty_59_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_60_p.equalsIgnoreCase(name)) {
			qty_60_p(
				((MCContainerMeta) qty_60_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
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

	/**
	 * Aggregation 集計.<p>
	 *
	 */
	public MCNumber sum() {
		return sum_p().qty();
	}

	/**
	 * Aggregation 集計.<p>
	 *
	 */
	public void sum(MCNumber value) {
		sum_p().qty(value);
	}

	/**
	 * Aggregation 集計.<p>
	 *
	 */
	public void sum(int value) {
		sum_p().qty(value);
	}

	/**
	 * Aggregation 集計.<p>
	 *
	 */
	public void sum(long value) {
		sum_p().qty(value);
	}

	/**
	 * Aggregation 集計.<p>
	 *
	 */
	public void sum(float value) {
		sum_p().qty(value);
	}

	/**
	 * Aggregation 集計.<p>
	 *
	 */
	public void sum(double value) {
		sum_p().qty(value);
	}

	/**
	 * Date 00 年月日００.<p>
	 *
	 */
	public MCNumber qty_00() {
		return qty_00_p().qty();
	}

	/**
	 * Date 00 年月日００.<p>
	 *
	 */
	public void qty_00(MCNumber value) {
		qty_00_p().qty(value);
	}

	/**
	 * Date 00 年月日００.<p>
	 *
	 */
	public void qty_00(int value) {
		qty_00_p().qty(value);
	}

	/**
	 * Date 00 年月日００.<p>
	 *
	 */
	public void qty_00(long value) {
		qty_00_p().qty(value);
	}

	/**
	 * Date 00 年月日００.<p>
	 *
	 */
	public void qty_00(float value) {
		qty_00_p().qty(value);
	}

	/**
	 * Date 00 年月日００.<p>
	 *
	 */
	public void qty_00(double value) {
		qty_00_p().qty(value);
	}

	/**
	 * Date 01 年月日０１.<p>
	 *
	 */
	public MCNumber qty_01() {
		return qty_01_p().qty();
	}

	/**
	 * Date 01 年月日０１.<p>
	 *
	 */
	public void qty_01(MCNumber value) {
		qty_01_p().qty(value);
	}

	/**
	 * Date 01 年月日０１.<p>
	 *
	 */
	public void qty_01(int value) {
		qty_01_p().qty(value);
	}

	/**
	 * Date 01 年月日０１.<p>
	 *
	 */
	public void qty_01(long value) {
		qty_01_p().qty(value);
	}

	/**
	 * Date 01 年月日０１.<p>
	 *
	 */
	public void qty_01(float value) {
		qty_01_p().qty(value);
	}

	/**
	 * Date 01 年月日０１.<p>
	 *
	 */
	public void qty_01(double value) {
		qty_01_p().qty(value);
	}

	/**
	 * Date 02 年月日０２.<p>
	 *
	 */
	public MCNumber qty_02() {
		return qty_02_p().qty();
	}

	/**
	 * Date 02 年月日０２.<p>
	 *
	 */
	public void qty_02(MCNumber value) {
		qty_02_p().qty(value);
	}

	/**
	 * Date 02 年月日０２.<p>
	 *
	 */
	public void qty_02(int value) {
		qty_02_p().qty(value);
	}

	/**
	 * Date 02 年月日０２.<p>
	 *
	 */
	public void qty_02(long value) {
		qty_02_p().qty(value);
	}

	/**
	 * Date 02 年月日０２.<p>
	 *
	 */
	public void qty_02(float value) {
		qty_02_p().qty(value);
	}

	/**
	 * Date 02 年月日０２.<p>
	 *
	 */
	public void qty_02(double value) {
		qty_02_p().qty(value);
	}

	/**
	 * Date 03 年月日０３.<p>
	 *
	 */
	public MCNumber qty_03() {
		return qty_03_p().qty();
	}

	/**
	 * Date 03 年月日０３.<p>
	 *
	 */
	public void qty_03(MCNumber value) {
		qty_03_p().qty(value);
	}

	/**
	 * Date 03 年月日０３.<p>
	 *
	 */
	public void qty_03(int value) {
		qty_03_p().qty(value);
	}

	/**
	 * Date 03 年月日０３.<p>
	 *
	 */
	public void qty_03(long value) {
		qty_03_p().qty(value);
	}

	/**
	 * Date 03 年月日０３.<p>
	 *
	 */
	public void qty_03(float value) {
		qty_03_p().qty(value);
	}

	/**
	 * Date 03 年月日０３.<p>
	 *
	 */
	public void qty_03(double value) {
		qty_03_p().qty(value);
	}

	/**
	 * Date 04 年月日０４.<p>
	 *
	 */
	public MCNumber qty_04() {
		return qty_04_p().qty();
	}

	/**
	 * Date 04 年月日０４.<p>
	 *
	 */
	public void qty_04(MCNumber value) {
		qty_04_p().qty(value);
	}

	/**
	 * Date 04 年月日０４.<p>
	 *
	 */
	public void qty_04(int value) {
		qty_04_p().qty(value);
	}

	/**
	 * Date 04 年月日０４.<p>
	 *
	 */
	public void qty_04(long value) {
		qty_04_p().qty(value);
	}

	/**
	 * Date 04 年月日０４.<p>
	 *
	 */
	public void qty_04(float value) {
		qty_04_p().qty(value);
	}

	/**
	 * Date 04 年月日０４.<p>
	 *
	 */
	public void qty_04(double value) {
		qty_04_p().qty(value);
	}

	/**
	 * Date 05 年月日０５.<p>
	 *
	 */
	public MCNumber qty_05() {
		return qty_05_p().qty();
	}

	/**
	 * Date 05 年月日０５.<p>
	 *
	 */
	public void qty_05(MCNumber value) {
		qty_05_p().qty(value);
	}

	/**
	 * Date 05 年月日０５.<p>
	 *
	 */
	public void qty_05(int value) {
		qty_05_p().qty(value);
	}

	/**
	 * Date 05 年月日０５.<p>
	 *
	 */
	public void qty_05(long value) {
		qty_05_p().qty(value);
	}

	/**
	 * Date 05 年月日０５.<p>
	 *
	 */
	public void qty_05(float value) {
		qty_05_p().qty(value);
	}

	/**
	 * Date 05 年月日０５.<p>
	 *
	 */
	public void qty_05(double value) {
		qty_05_p().qty(value);
	}

	/**
	 * Date 06 年月日０６.<p>
	 *
	 */
	public MCNumber qty_06() {
		return qty_06_p().qty();
	}

	/**
	 * Date 06 年月日０６.<p>
	 *
	 */
	public void qty_06(MCNumber value) {
		qty_06_p().qty(value);
	}

	/**
	 * Date 06 年月日０６.<p>
	 *
	 */
	public void qty_06(int value) {
		qty_06_p().qty(value);
	}

	/**
	 * Date 06 年月日０６.<p>
	 *
	 */
	public void qty_06(long value) {
		qty_06_p().qty(value);
	}

	/**
	 * Date 06 年月日０６.<p>
	 *
	 */
	public void qty_06(float value) {
		qty_06_p().qty(value);
	}

	/**
	 * Date 06 年月日０６.<p>
	 *
	 */
	public void qty_06(double value) {
		qty_06_p().qty(value);
	}

	/**
	 * Date 07 年月日０７.<p>
	 *
	 */
	public MCNumber qty_07() {
		return qty_07_p().qty();
	}

	/**
	 * Date 07 年月日０７.<p>
	 *
	 */
	public void qty_07(MCNumber value) {
		qty_07_p().qty(value);
	}

	/**
	 * Date 07 年月日０７.<p>
	 *
	 */
	public void qty_07(int value) {
		qty_07_p().qty(value);
	}

	/**
	 * Date 07 年月日０７.<p>
	 *
	 */
	public void qty_07(long value) {
		qty_07_p().qty(value);
	}

	/**
	 * Date 07 年月日０７.<p>
	 *
	 */
	public void qty_07(float value) {
		qty_07_p().qty(value);
	}

	/**
	 * Date 07 年月日０７.<p>
	 *
	 */
	public void qty_07(double value) {
		qty_07_p().qty(value);
	}

	/**
	 * Date 08 年月日０８.<p>
	 *
	 */
	public MCNumber qty_08() {
		return qty_08_p().qty();
	}

	/**
	 * Date 08 年月日０８.<p>
	 *
	 */
	public void qty_08(MCNumber value) {
		qty_08_p().qty(value);
	}

	/**
	 * Date 08 年月日０８.<p>
	 *
	 */
	public void qty_08(int value) {
		qty_08_p().qty(value);
	}

	/**
	 * Date 08 年月日０８.<p>
	 *
	 */
	public void qty_08(long value) {
		qty_08_p().qty(value);
	}

	/**
	 * Date 08 年月日０８.<p>
	 *
	 */
	public void qty_08(float value) {
		qty_08_p().qty(value);
	}

	/**
	 * Date 08 年月日０８.<p>
	 *
	 */
	public void qty_08(double value) {
		qty_08_p().qty(value);
	}

	/**
	 * Date 09 年月日０９.<p>
	 *
	 */
	public MCNumber qty_09() {
		return qty_09_p().qty();
	}

	/**
	 * Date 09 年月日０９.<p>
	 *
	 */
	public void qty_09(MCNumber value) {
		qty_09_p().qty(value);
	}

	/**
	 * Date 09 年月日０９.<p>
	 *
	 */
	public void qty_09(int value) {
		qty_09_p().qty(value);
	}

	/**
	 * Date 09 年月日０９.<p>
	 *
	 */
	public void qty_09(long value) {
		qty_09_p().qty(value);
	}

	/**
	 * Date 09 年月日０９.<p>
	 *
	 */
	public void qty_09(float value) {
		qty_09_p().qty(value);
	}

	/**
	 * Date 09 年月日０９.<p>
	 *
	 */
	public void qty_09(double value) {
		qty_09_p().qty(value);
	}

	/**
	 * Date 10 年月日１０.<p>
	 *
	 */
	public MCNumber qty_10() {
		return qty_10_p().qty();
	}

	/**
	 * Date 10 年月日１０.<p>
	 *
	 */
	public void qty_10(MCNumber value) {
		qty_10_p().qty(value);
	}

	/**
	 * Date 10 年月日１０.<p>
	 *
	 */
	public void qty_10(int value) {
		qty_10_p().qty(value);
	}

	/**
	 * Date 10 年月日１０.<p>
	 *
	 */
	public void qty_10(long value) {
		qty_10_p().qty(value);
	}

	/**
	 * Date 10 年月日１０.<p>
	 *
	 */
	public void qty_10(float value) {
		qty_10_p().qty(value);
	}

	/**
	 * Date 10 年月日１０.<p>
	 *
	 */
	public void qty_10(double value) {
		qty_10_p().qty(value);
	}

	/**
	 * Date 11 年月日１１.<p>
	 *
	 */
	public MCNumber qty_11() {
		return qty_11_p().qty();
	}

	/**
	 * Date 11 年月日１１.<p>
	 *
	 */
	public void qty_11(MCNumber value) {
		qty_11_p().qty(value);
	}

	/**
	 * Date 11 年月日１１.<p>
	 *
	 */
	public void qty_11(int value) {
		qty_11_p().qty(value);
	}

	/**
	 * Date 11 年月日１１.<p>
	 *
	 */
	public void qty_11(long value) {
		qty_11_p().qty(value);
	}

	/**
	 * Date 11 年月日１１.<p>
	 *
	 */
	public void qty_11(float value) {
		qty_11_p().qty(value);
	}

	/**
	 * Date 11 年月日１１.<p>
	 *
	 */
	public void qty_11(double value) {
		qty_11_p().qty(value);
	}

	/**
	 * Date 12 年月日１２.<p>
	 *
	 */
	public MCNumber qty_12() {
		return qty_12_p().qty();
	}

	/**
	 * Date 12 年月日１２.<p>
	 *
	 */
	public void qty_12(MCNumber value) {
		qty_12_p().qty(value);
	}

	/**
	 * Date 12 年月日１２.<p>
	 *
	 */
	public void qty_12(int value) {
		qty_12_p().qty(value);
	}

	/**
	 * Date 12 年月日１２.<p>
	 *
	 */
	public void qty_12(long value) {
		qty_12_p().qty(value);
	}

	/**
	 * Date 12 年月日１２.<p>
	 *
	 */
	public void qty_12(float value) {
		qty_12_p().qty(value);
	}

	/**
	 * Date 12 年月日１２.<p>
	 *
	 */
	public void qty_12(double value) {
		qty_12_p().qty(value);
	}

	/**
	 * Date 13 年月日１３.<p>
	 *
	 */
	public MCNumber qty_13() {
		return qty_13_p().qty();
	}

	/**
	 * Date 13 年月日１３.<p>
	 *
	 */
	public void qty_13(MCNumber value) {
		qty_13_p().qty(value);
	}

	/**
	 * Date 13 年月日１３.<p>
	 *
	 */
	public void qty_13(int value) {
		qty_13_p().qty(value);
	}

	/**
	 * Date 13 年月日１３.<p>
	 *
	 */
	public void qty_13(long value) {
		qty_13_p().qty(value);
	}

	/**
	 * Date 13 年月日１３.<p>
	 *
	 */
	public void qty_13(float value) {
		qty_13_p().qty(value);
	}

	/**
	 * Date 13 年月日１３.<p>
	 *
	 */
	public void qty_13(double value) {
		qty_13_p().qty(value);
	}

	/**
	 * Date 14 年月日１４.<p>
	 *
	 */
	public MCNumber qty_14() {
		return qty_14_p().qty();
	}

	/**
	 * Date 14 年月日１４.<p>
	 *
	 */
	public void qty_14(MCNumber value) {
		qty_14_p().qty(value);
	}

	/**
	 * Date 14 年月日１４.<p>
	 *
	 */
	public void qty_14(int value) {
		qty_14_p().qty(value);
	}

	/**
	 * Date 14 年月日１４.<p>
	 *
	 */
	public void qty_14(long value) {
		qty_14_p().qty(value);
	}

	/**
	 * Date 14 年月日１４.<p>
	 *
	 */
	public void qty_14(float value) {
		qty_14_p().qty(value);
	}

	/**
	 * Date 14 年月日１４.<p>
	 *
	 */
	public void qty_14(double value) {
		qty_14_p().qty(value);
	}

	/**
	 * Date 15 年月日１５.<p>
	 *
	 */
	public MCNumber qty_15() {
		return qty_15_p().qty();
	}

	/**
	 * Date 15 年月日１５.<p>
	 *
	 */
	public void qty_15(MCNumber value) {
		qty_15_p().qty(value);
	}

	/**
	 * Date 15 年月日１５.<p>
	 *
	 */
	public void qty_15(int value) {
		qty_15_p().qty(value);
	}

	/**
	 * Date 15 年月日１５.<p>
	 *
	 */
	public void qty_15(long value) {
		qty_15_p().qty(value);
	}

	/**
	 * Date 15 年月日１５.<p>
	 *
	 */
	public void qty_15(float value) {
		qty_15_p().qty(value);
	}

	/**
	 * Date 15 年月日１５.<p>
	 *
	 */
	public void qty_15(double value) {
		qty_15_p().qty(value);
	}

	/**
	 * Date 16 年月日１６.<p>
	 *
	 */
	public MCNumber qty_16() {
		return qty_16_p().qty();
	}

	/**
	 * Date 16 年月日１６.<p>
	 *
	 */
	public void qty_16(MCNumber value) {
		qty_16_p().qty(value);
	}

	/**
	 * Date 16 年月日１６.<p>
	 *
	 */
	public void qty_16(int value) {
		qty_16_p().qty(value);
	}

	/**
	 * Date 16 年月日１６.<p>
	 *
	 */
	public void qty_16(long value) {
		qty_16_p().qty(value);
	}

	/**
	 * Date 16 年月日１６.<p>
	 *
	 */
	public void qty_16(float value) {
		qty_16_p().qty(value);
	}

	/**
	 * Date 16 年月日１６.<p>
	 *
	 */
	public void qty_16(double value) {
		qty_16_p().qty(value);
	}

	/**
	 * Date 17 年月日１７.<p>
	 *
	 */
	public MCNumber qty_17() {
		return qty_17_p().qty();
	}

	/**
	 * Date 17 年月日１７.<p>
	 *
	 */
	public void qty_17(MCNumber value) {
		qty_17_p().qty(value);
	}

	/**
	 * Date 17 年月日１７.<p>
	 *
	 */
	public void qty_17(int value) {
		qty_17_p().qty(value);
	}

	/**
	 * Date 17 年月日１７.<p>
	 *
	 */
	public void qty_17(long value) {
		qty_17_p().qty(value);
	}

	/**
	 * Date 17 年月日１７.<p>
	 *
	 */
	public void qty_17(float value) {
		qty_17_p().qty(value);
	}

	/**
	 * Date 17 年月日１７.<p>
	 *
	 */
	public void qty_17(double value) {
		qty_17_p().qty(value);
	}

	/**
	 * Date 18 年月日１８.<p>
	 *
	 */
	public MCNumber qty_18() {
		return qty_18_p().qty();
	}

	/**
	 * Date 18 年月日１８.<p>
	 *
	 */
	public void qty_18(MCNumber value) {
		qty_18_p().qty(value);
	}

	/**
	 * Date 18 年月日１８.<p>
	 *
	 */
	public void qty_18(int value) {
		qty_18_p().qty(value);
	}

	/**
	 * Date 18 年月日１８.<p>
	 *
	 */
	public void qty_18(long value) {
		qty_18_p().qty(value);
	}

	/**
	 * Date 18 年月日１８.<p>
	 *
	 */
	public void qty_18(float value) {
		qty_18_p().qty(value);
	}

	/**
	 * Date 18 年月日１８.<p>
	 *
	 */
	public void qty_18(double value) {
		qty_18_p().qty(value);
	}

	/**
	 * Date 19 年月日１９.<p>
	 *
	 */
	public MCNumber qty_19() {
		return qty_19_p().qty();
	}

	/**
	 * Date 19 年月日１９.<p>
	 *
	 */
	public void qty_19(MCNumber value) {
		qty_19_p().qty(value);
	}

	/**
	 * Date 19 年月日１９.<p>
	 *
	 */
	public void qty_19(int value) {
		qty_19_p().qty(value);
	}

	/**
	 * Date 19 年月日１９.<p>
	 *
	 */
	public void qty_19(long value) {
		qty_19_p().qty(value);
	}

	/**
	 * Date 19 年月日１９.<p>
	 *
	 */
	public void qty_19(float value) {
		qty_19_p().qty(value);
	}

	/**
	 * Date 19 年月日１９.<p>
	 *
	 */
	public void qty_19(double value) {
		qty_19_p().qty(value);
	}

	/**
	 * Date 20 年月日２０.<p>
	 *
	 */
	public MCNumber qty_20() {
		return qty_20_p().qty();
	}

	/**
	 * Date 20 年月日２０.<p>
	 *
	 */
	public void qty_20(MCNumber value) {
		qty_20_p().qty(value);
	}

	/**
	 * Date 20 年月日２０.<p>
	 *
	 */
	public void qty_20(int value) {
		qty_20_p().qty(value);
	}

	/**
	 * Date 20 年月日２０.<p>
	 *
	 */
	public void qty_20(long value) {
		qty_20_p().qty(value);
	}

	/**
	 * Date 20 年月日２０.<p>
	 *
	 */
	public void qty_20(float value) {
		qty_20_p().qty(value);
	}

	/**
	 * Date 20 年月日２０.<p>
	 *
	 */
	public void qty_20(double value) {
		qty_20_p().qty(value);
	}

	/**
	 * Date 21 年月日２１.<p>
	 *
	 */
	public MCNumber qty_21() {
		return qty_21_p().qty();
	}

	/**
	 * Date 21 年月日２１.<p>
	 *
	 */
	public void qty_21(MCNumber value) {
		qty_21_p().qty(value);
	}

	/**
	 * Date 21 年月日２１.<p>
	 *
	 */
	public void qty_21(int value) {
		qty_21_p().qty(value);
	}

	/**
	 * Date 21 年月日２１.<p>
	 *
	 */
	public void qty_21(long value) {
		qty_21_p().qty(value);
	}

	/**
	 * Date 21 年月日２１.<p>
	 *
	 */
	public void qty_21(float value) {
		qty_21_p().qty(value);
	}

	/**
	 * Date 21 年月日２１.<p>
	 *
	 */
	public void qty_21(double value) {
		qty_21_p().qty(value);
	}

	/**
	 * Date 22 年月日２２.<p>
	 *
	 */
	public MCNumber qty_22() {
		return qty_22_p().qty();
	}

	/**
	 * Date 22 年月日２２.<p>
	 *
	 */
	public void qty_22(MCNumber value) {
		qty_22_p().qty(value);
	}

	/**
	 * Date 22 年月日２２.<p>
	 *
	 */
	public void qty_22(int value) {
		qty_22_p().qty(value);
	}

	/**
	 * Date 22 年月日２２.<p>
	 *
	 */
	public void qty_22(long value) {
		qty_22_p().qty(value);
	}

	/**
	 * Date 22 年月日２２.<p>
	 *
	 */
	public void qty_22(float value) {
		qty_22_p().qty(value);
	}

	/**
	 * Date 22 年月日２２.<p>
	 *
	 */
	public void qty_22(double value) {
		qty_22_p().qty(value);
	}

	/**
	 * Date 23 年月日２３.<p>
	 *
	 */
	public MCNumber qty_23() {
		return qty_23_p().qty();
	}

	/**
	 * Date 23 年月日２３.<p>
	 *
	 */
	public void qty_23(MCNumber value) {
		qty_23_p().qty(value);
	}

	/**
	 * Date 23 年月日２３.<p>
	 *
	 */
	public void qty_23(int value) {
		qty_23_p().qty(value);
	}

	/**
	 * Date 23 年月日２３.<p>
	 *
	 */
	public void qty_23(long value) {
		qty_23_p().qty(value);
	}

	/**
	 * Date 23 年月日２３.<p>
	 *
	 */
	public void qty_23(float value) {
		qty_23_p().qty(value);
	}

	/**
	 * Date 23 年月日２３.<p>
	 *
	 */
	public void qty_23(double value) {
		qty_23_p().qty(value);
	}

	/**
	 * Date 24 年月日２４.<p>
	 *
	 */
	public MCNumber qty_24() {
		return qty_24_p().qty();
	}

	/**
	 * Date 24 年月日２４.<p>
	 *
	 */
	public void qty_24(MCNumber value) {
		qty_24_p().qty(value);
	}

	/**
	 * Date 24 年月日２４.<p>
	 *
	 */
	public void qty_24(int value) {
		qty_24_p().qty(value);
	}

	/**
	 * Date 24 年月日２４.<p>
	 *
	 */
	public void qty_24(long value) {
		qty_24_p().qty(value);
	}

	/**
	 * Date 24 年月日２４.<p>
	 *
	 */
	public void qty_24(float value) {
		qty_24_p().qty(value);
	}

	/**
	 * Date 24 年月日２４.<p>
	 *
	 */
	public void qty_24(double value) {
		qty_24_p().qty(value);
	}

	/**
	 * Date 25 年月日２５.<p>
	 *
	 */
	public MCNumber qty_25() {
		return qty_25_p().qty();
	}

	/**
	 * Date 25 年月日２５.<p>
	 *
	 */
	public void qty_25(MCNumber value) {
		qty_25_p().qty(value);
	}

	/**
	 * Date 25 年月日２５.<p>
	 *
	 */
	public void qty_25(int value) {
		qty_25_p().qty(value);
	}

	/**
	 * Date 25 年月日２５.<p>
	 *
	 */
	public void qty_25(long value) {
		qty_25_p().qty(value);
	}

	/**
	 * Date 25 年月日２５.<p>
	 *
	 */
	public void qty_25(float value) {
		qty_25_p().qty(value);
	}

	/**
	 * Date 25 年月日２５.<p>
	 *
	 */
	public void qty_25(double value) {
		qty_25_p().qty(value);
	}

	/**
	 * Date 26 年月日２６.<p>
	 *
	 */
	public MCNumber qty_26() {
		return qty_26_p().qty();
	}

	/**
	 * Date 26 年月日２６.<p>
	 *
	 */
	public void qty_26(MCNumber value) {
		qty_26_p().qty(value);
	}

	/**
	 * Date 26 年月日２６.<p>
	 *
	 */
	public void qty_26(int value) {
		qty_26_p().qty(value);
	}

	/**
	 * Date 26 年月日２６.<p>
	 *
	 */
	public void qty_26(long value) {
		qty_26_p().qty(value);
	}

	/**
	 * Date 26 年月日２６.<p>
	 *
	 */
	public void qty_26(float value) {
		qty_26_p().qty(value);
	}

	/**
	 * Date 26 年月日２６.<p>
	 *
	 */
	public void qty_26(double value) {
		qty_26_p().qty(value);
	}

	/**
	 * Date 27 年月日２７.<p>
	 *
	 */
	public MCNumber qty_27() {
		return qty_27_p().qty();
	}

	/**
	 * Date 27 年月日２７.<p>
	 *
	 */
	public void qty_27(MCNumber value) {
		qty_27_p().qty(value);
	}

	/**
	 * Date 27 年月日２７.<p>
	 *
	 */
	public void qty_27(int value) {
		qty_27_p().qty(value);
	}

	/**
	 * Date 27 年月日２７.<p>
	 *
	 */
	public void qty_27(long value) {
		qty_27_p().qty(value);
	}

	/**
	 * Date 27 年月日２７.<p>
	 *
	 */
	public void qty_27(float value) {
		qty_27_p().qty(value);
	}

	/**
	 * Date 27 年月日２７.<p>
	 *
	 */
	public void qty_27(double value) {
		qty_27_p().qty(value);
	}

	/**
	 * Date 28 年月日２８.<p>
	 *
	 */
	public MCNumber qty_28() {
		return qty_28_p().qty();
	}

	/**
	 * Date 28 年月日２８.<p>
	 *
	 */
	public void qty_28(MCNumber value) {
		qty_28_p().qty(value);
	}

	/**
	 * Date 28 年月日２８.<p>
	 *
	 */
	public void qty_28(int value) {
		qty_28_p().qty(value);
	}

	/**
	 * Date 28 年月日２８.<p>
	 *
	 */
	public void qty_28(long value) {
		qty_28_p().qty(value);
	}

	/**
	 * Date 28 年月日２８.<p>
	 *
	 */
	public void qty_28(float value) {
		qty_28_p().qty(value);
	}

	/**
	 * Date 28 年月日２８.<p>
	 *
	 */
	public void qty_28(double value) {
		qty_28_p().qty(value);
	}

	/**
	 * Date 29 年月日２９.<p>
	 *
	 */
	public MCNumber qty_29() {
		return qty_29_p().qty();
	}

	/**
	 * Date 29 年月日２９.<p>
	 *
	 */
	public void qty_29(MCNumber value) {
		qty_29_p().qty(value);
	}

	/**
	 * Date 29 年月日２９.<p>
	 *
	 */
	public void qty_29(int value) {
		qty_29_p().qty(value);
	}

	/**
	 * Date 29 年月日２９.<p>
	 *
	 */
	public void qty_29(long value) {
		qty_29_p().qty(value);
	}

	/**
	 * Date 29 年月日２９.<p>
	 *
	 */
	public void qty_29(float value) {
		qty_29_p().qty(value);
	}

	/**
	 * Date 29 年月日２９.<p>
	 *
	 */
	public void qty_29(double value) {
		qty_29_p().qty(value);
	}

	/**
	 * Date 30 年月日３０.<p>
	 *
	 */
	public MCNumber qty_30() {
		return qty_30_p().qty();
	}

	/**
	 * Date 30 年月日３０.<p>
	 *
	 */
	public void qty_30(MCNumber value) {
		qty_30_p().qty(value);
	}

	/**
	 * Date 30 年月日３０.<p>
	 *
	 */
	public void qty_30(int value) {
		qty_30_p().qty(value);
	}

	/**
	 * Date 30 年月日３０.<p>
	 *
	 */
	public void qty_30(long value) {
		qty_30_p().qty(value);
	}

	/**
	 * Date 30 年月日３０.<p>
	 *
	 */
	public void qty_30(float value) {
		qty_30_p().qty(value);
	}

	/**
	 * Date 30 年月日３０.<p>
	 *
	 */
	public void qty_30(double value) {
		qty_30_p().qty(value);
	}

	/**
	 * Date 31 年月日３１.<p>
	 *
	 */
	public MCNumber qty_31() {
		return qty_31_p().qty();
	}

	/**
	 * Date 31 年月日３１.<p>
	 *
	 */
	public void qty_31(MCNumber value) {
		qty_31_p().qty(value);
	}

	/**
	 * Date 31 年月日３１.<p>
	 *
	 */
	public void qty_31(int value) {
		qty_31_p().qty(value);
	}

	/**
	 * Date 31 年月日３１.<p>
	 *
	 */
	public void qty_31(long value) {
		qty_31_p().qty(value);
	}

	/**
	 * Date 31 年月日３１.<p>
	 *
	 */
	public void qty_31(float value) {
		qty_31_p().qty(value);
	}

	/**
	 * Date 31 年月日３１.<p>
	 *
	 */
	public void qty_31(double value) {
		qty_31_p().qty(value);
	}

	/**
	 * Date 32 年月日３２.<p>
	 *
	 */
	public MCNumber qty_32() {
		return qty_32_p().qty();
	}

	/**
	 * Date 32 年月日３２.<p>
	 *
	 */
	public void qty_32(MCNumber value) {
		qty_32_p().qty(value);
	}

	/**
	 * Date 32 年月日３２.<p>
	 *
	 */
	public void qty_32(int value) {
		qty_32_p().qty(value);
	}

	/**
	 * Date 32 年月日３２.<p>
	 *
	 */
	public void qty_32(long value) {
		qty_32_p().qty(value);
	}

	/**
	 * Date 32 年月日３２.<p>
	 *
	 */
	public void qty_32(float value) {
		qty_32_p().qty(value);
	}

	/**
	 * Date 32 年月日３２.<p>
	 *
	 */
	public void qty_32(double value) {
		qty_32_p().qty(value);
	}

	/**
	 * Date 33 年月日３３.<p>
	 *
	 */
	public MCNumber qty_33() {
		return qty_33_p().qty();
	}

	/**
	 * Date 33 年月日３３.<p>
	 *
	 */
	public void qty_33(MCNumber value) {
		qty_33_p().qty(value);
	}

	/**
	 * Date 33 年月日３３.<p>
	 *
	 */
	public void qty_33(int value) {
		qty_33_p().qty(value);
	}

	/**
	 * Date 33 年月日３３.<p>
	 *
	 */
	public void qty_33(long value) {
		qty_33_p().qty(value);
	}

	/**
	 * Date 33 年月日３３.<p>
	 *
	 */
	public void qty_33(float value) {
		qty_33_p().qty(value);
	}

	/**
	 * Date 33 年月日３３.<p>
	 *
	 */
	public void qty_33(double value) {
		qty_33_p().qty(value);
	}

	/**
	 * Date 34 年月日３４.<p>
	 *
	 */
	public MCNumber qty_34() {
		return qty_34_p().qty();
	}

	/**
	 * Date 34 年月日３４.<p>
	 *
	 */
	public void qty_34(MCNumber value) {
		qty_34_p().qty(value);
	}

	/**
	 * Date 34 年月日３４.<p>
	 *
	 */
	public void qty_34(int value) {
		qty_34_p().qty(value);
	}

	/**
	 * Date 34 年月日３４.<p>
	 *
	 */
	public void qty_34(long value) {
		qty_34_p().qty(value);
	}

	/**
	 * Date 34 年月日３４.<p>
	 *
	 */
	public void qty_34(float value) {
		qty_34_p().qty(value);
	}

	/**
	 * Date 34 年月日３４.<p>
	 *
	 */
	public void qty_34(double value) {
		qty_34_p().qty(value);
	}

	/**
	 * Date 35 年月日３５.<p>
	 *
	 */
	public MCNumber qty_35() {
		return qty_35_p().qty();
	}

	/**
	 * Date 35 年月日３５.<p>
	 *
	 */
	public void qty_35(MCNumber value) {
		qty_35_p().qty(value);
	}

	/**
	 * Date 35 年月日３５.<p>
	 *
	 */
	public void qty_35(int value) {
		qty_35_p().qty(value);
	}

	/**
	 * Date 35 年月日３５.<p>
	 *
	 */
	public void qty_35(long value) {
		qty_35_p().qty(value);
	}

	/**
	 * Date 35 年月日３５.<p>
	 *
	 */
	public void qty_35(float value) {
		qty_35_p().qty(value);
	}

	/**
	 * Date 35 年月日３５.<p>
	 *
	 */
	public void qty_35(double value) {
		qty_35_p().qty(value);
	}

	/**
	 * Date 36 年月日３６.<p>
	 *
	 */
	public MCNumber qty_36() {
		return qty_36_p().qty();
	}

	/**
	 * Date 36 年月日３６.<p>
	 *
	 */
	public void qty_36(MCNumber value) {
		qty_36_p().qty(value);
	}

	/**
	 * Date 36 年月日３６.<p>
	 *
	 */
	public void qty_36(int value) {
		qty_36_p().qty(value);
	}

	/**
	 * Date 36 年月日３６.<p>
	 *
	 */
	public void qty_36(long value) {
		qty_36_p().qty(value);
	}

	/**
	 * Date 36 年月日３６.<p>
	 *
	 */
	public void qty_36(float value) {
		qty_36_p().qty(value);
	}

	/**
	 * Date 36 年月日３６.<p>
	 *
	 */
	public void qty_36(double value) {
		qty_36_p().qty(value);
	}

	/**
	 * Date 37 年月日３７.<p>
	 *
	 */
	public MCNumber qty_37() {
		return qty_37_p().qty();
	}

	/**
	 * Date 37 年月日３７.<p>
	 *
	 */
	public void qty_37(MCNumber value) {
		qty_37_p().qty(value);
	}

	/**
	 * Date 37 年月日３７.<p>
	 *
	 */
	public void qty_37(int value) {
		qty_37_p().qty(value);
	}

	/**
	 * Date 37 年月日３７.<p>
	 *
	 */
	public void qty_37(long value) {
		qty_37_p().qty(value);
	}

	/**
	 * Date 37 年月日３７.<p>
	 *
	 */
	public void qty_37(float value) {
		qty_37_p().qty(value);
	}

	/**
	 * Date 37 年月日３７.<p>
	 *
	 */
	public void qty_37(double value) {
		qty_37_p().qty(value);
	}

	/**
	 * Date 38 年月日３８.<p>
	 *
	 */
	public MCNumber qty_38() {
		return qty_38_p().qty();
	}

	/**
	 * Date 38 年月日３８.<p>
	 *
	 */
	public void qty_38(MCNumber value) {
		qty_38_p().qty(value);
	}

	/**
	 * Date 38 年月日３８.<p>
	 *
	 */
	public void qty_38(int value) {
		qty_38_p().qty(value);
	}

	/**
	 * Date 38 年月日３８.<p>
	 *
	 */
	public void qty_38(long value) {
		qty_38_p().qty(value);
	}

	/**
	 * Date 38 年月日３８.<p>
	 *
	 */
	public void qty_38(float value) {
		qty_38_p().qty(value);
	}

	/**
	 * Date 38 年月日３８.<p>
	 *
	 */
	public void qty_38(double value) {
		qty_38_p().qty(value);
	}

	/**
	 * Date 39 年月日３９.<p>
	 *
	 */
	public MCNumber qty_39() {
		return qty_39_p().qty();
	}

	/**
	 * Date 39 年月日３９.<p>
	 *
	 */
	public void qty_39(MCNumber value) {
		qty_39_p().qty(value);
	}

	/**
	 * Date 39 年月日３９.<p>
	 *
	 */
	public void qty_39(int value) {
		qty_39_p().qty(value);
	}

	/**
	 * Date 39 年月日３９.<p>
	 *
	 */
	public void qty_39(long value) {
		qty_39_p().qty(value);
	}

	/**
	 * Date 39 年月日３９.<p>
	 *
	 */
	public void qty_39(float value) {
		qty_39_p().qty(value);
	}

	/**
	 * Date 39 年月日３９.<p>
	 *
	 */
	public void qty_39(double value) {
		qty_39_p().qty(value);
	}

	/**
	 * Date 40 年月日４０.<p>
	 *
	 */
	public MCNumber qty_40() {
		return qty_40_p().qty();
	}

	/**
	 * Date 40 年月日４０.<p>
	 *
	 */
	public void qty_40(MCNumber value) {
		qty_40_p().qty(value);
	}

	/**
	 * Date 40 年月日４０.<p>
	 *
	 */
	public void qty_40(int value) {
		qty_40_p().qty(value);
	}

	/**
	 * Date 40 年月日４０.<p>
	 *
	 */
	public void qty_40(long value) {
		qty_40_p().qty(value);
	}

	/**
	 * Date 40 年月日４０.<p>
	 *
	 */
	public void qty_40(float value) {
		qty_40_p().qty(value);
	}

	/**
	 * Date 40 年月日４０.<p>
	 *
	 */
	public void qty_40(double value) {
		qty_40_p().qty(value);
	}

	/**
	 * Date 41 年月日４１.<p>
	 *
	 */
	public MCNumber qty_41() {
		return qty_41_p().qty();
	}

	/**
	 * Date 41 年月日４１.<p>
	 *
	 */
	public void qty_41(MCNumber value) {
		qty_41_p().qty(value);
	}

	/**
	 * Date 41 年月日４１.<p>
	 *
	 */
	public void qty_41(int value) {
		qty_41_p().qty(value);
	}

	/**
	 * Date 41 年月日４１.<p>
	 *
	 */
	public void qty_41(long value) {
		qty_41_p().qty(value);
	}

	/**
	 * Date 41 年月日４１.<p>
	 *
	 */
	public void qty_41(float value) {
		qty_41_p().qty(value);
	}

	/**
	 * Date 41 年月日４１.<p>
	 *
	 */
	public void qty_41(double value) {
		qty_41_p().qty(value);
	}

	/**
	 * Date 42 年月日４２.<p>
	 *
	 */
	public MCNumber qty_42() {
		return qty_42_p().qty();
	}

	/**
	 * Date 42 年月日４２.<p>
	 *
	 */
	public void qty_42(MCNumber value) {
		qty_42_p().qty(value);
	}

	/**
	 * Date 42 年月日４２.<p>
	 *
	 */
	public void qty_42(int value) {
		qty_42_p().qty(value);
	}

	/**
	 * Date 42 年月日４２.<p>
	 *
	 */
	public void qty_42(long value) {
		qty_42_p().qty(value);
	}

	/**
	 * Date 42 年月日４２.<p>
	 *
	 */
	public void qty_42(float value) {
		qty_42_p().qty(value);
	}

	/**
	 * Date 42 年月日４２.<p>
	 *
	 */
	public void qty_42(double value) {
		qty_42_p().qty(value);
	}

	/**
	 * Date 43 年月日４３.<p>
	 *
	 */
	public MCNumber qty_43() {
		return qty_43_p().qty();
	}

	/**
	 * Date 43 年月日４３.<p>
	 *
	 */
	public void qty_43(MCNumber value) {
		qty_43_p().qty(value);
	}

	/**
	 * Date 43 年月日４３.<p>
	 *
	 */
	public void qty_43(int value) {
		qty_43_p().qty(value);
	}

	/**
	 * Date 43 年月日４３.<p>
	 *
	 */
	public void qty_43(long value) {
		qty_43_p().qty(value);
	}

	/**
	 * Date 43 年月日４３.<p>
	 *
	 */
	public void qty_43(float value) {
		qty_43_p().qty(value);
	}

	/**
	 * Date 43 年月日４３.<p>
	 *
	 */
	public void qty_43(double value) {
		qty_43_p().qty(value);
	}

	/**
	 * Date 44 年月日４４.<p>
	 *
	 */
	public MCNumber qty_44() {
		return qty_44_p().qty();
	}

	/**
	 * Date 44 年月日４４.<p>
	 *
	 */
	public void qty_44(MCNumber value) {
		qty_44_p().qty(value);
	}

	/**
	 * Date 44 年月日４４.<p>
	 *
	 */
	public void qty_44(int value) {
		qty_44_p().qty(value);
	}

	/**
	 * Date 44 年月日４４.<p>
	 *
	 */
	public void qty_44(long value) {
		qty_44_p().qty(value);
	}

	/**
	 * Date 44 年月日４４.<p>
	 *
	 */
	public void qty_44(float value) {
		qty_44_p().qty(value);
	}

	/**
	 * Date 44 年月日４４.<p>
	 *
	 */
	public void qty_44(double value) {
		qty_44_p().qty(value);
	}

	/**
	 * Date 45 年月日４５.<p>
	 *
	 */
	public MCNumber qty_45() {
		return qty_45_p().qty();
	}

	/**
	 * Date 45 年月日４５.<p>
	 *
	 */
	public void qty_45(MCNumber value) {
		qty_45_p().qty(value);
	}

	/**
	 * Date 45 年月日４５.<p>
	 *
	 */
	public void qty_45(int value) {
		qty_45_p().qty(value);
	}

	/**
	 * Date 45 年月日４５.<p>
	 *
	 */
	public void qty_45(long value) {
		qty_45_p().qty(value);
	}

	/**
	 * Date 45 年月日４５.<p>
	 *
	 */
	public void qty_45(float value) {
		qty_45_p().qty(value);
	}

	/**
	 * Date 45 年月日４５.<p>
	 *
	 */
	public void qty_45(double value) {
		qty_45_p().qty(value);
	}

	/**
	 * Date 46 年月日４６.<p>
	 *
	 */
	public MCNumber qty_46() {
		return qty_46_p().qty();
	}

	/**
	 * Date 46 年月日４６.<p>
	 *
	 */
	public void qty_46(MCNumber value) {
		qty_46_p().qty(value);
	}

	/**
	 * Date 46 年月日４６.<p>
	 *
	 */
	public void qty_46(int value) {
		qty_46_p().qty(value);
	}

	/**
	 * Date 46 年月日４６.<p>
	 *
	 */
	public void qty_46(long value) {
		qty_46_p().qty(value);
	}

	/**
	 * Date 46 年月日４６.<p>
	 *
	 */
	public void qty_46(float value) {
		qty_46_p().qty(value);
	}

	/**
	 * Date 46 年月日４６.<p>
	 *
	 */
	public void qty_46(double value) {
		qty_46_p().qty(value);
	}

	/**
	 * Date 47 年月日４７.<p>
	 *
	 */
	public MCNumber qty_47() {
		return qty_47_p().qty();
	}

	/**
	 * Date 47 年月日４７.<p>
	 *
	 */
	public void qty_47(MCNumber value) {
		qty_47_p().qty(value);
	}

	/**
	 * Date 47 年月日４７.<p>
	 *
	 */
	public void qty_47(int value) {
		qty_47_p().qty(value);
	}

	/**
	 * Date 47 年月日４７.<p>
	 *
	 */
	public void qty_47(long value) {
		qty_47_p().qty(value);
	}

	/**
	 * Date 47 年月日４７.<p>
	 *
	 */
	public void qty_47(float value) {
		qty_47_p().qty(value);
	}

	/**
	 * Date 47 年月日４７.<p>
	 *
	 */
	public void qty_47(double value) {
		qty_47_p().qty(value);
	}

	/**
	 * Date 48 年月日４８.<p>
	 *
	 */
	public MCNumber qty_48() {
		return qty_48_p().qty();
	}

	/**
	 * Date 48 年月日４８.<p>
	 *
	 */
	public void qty_48(MCNumber value) {
		qty_48_p().qty(value);
	}

	/**
	 * Date 48 年月日４８.<p>
	 *
	 */
	public void qty_48(int value) {
		qty_48_p().qty(value);
	}

	/**
	 * Date 48 年月日４８.<p>
	 *
	 */
	public void qty_48(long value) {
		qty_48_p().qty(value);
	}

	/**
	 * Date 48 年月日４８.<p>
	 *
	 */
	public void qty_48(float value) {
		qty_48_p().qty(value);
	}

	/**
	 * Date 48 年月日４８.<p>
	 *
	 */
	public void qty_48(double value) {
		qty_48_p().qty(value);
	}

	/**
	 * Date 49 年月日４９.<p>
	 *
	 */
	public MCNumber qty_49() {
		return qty_49_p().qty();
	}

	/**
	 * Date 49 年月日４９.<p>
	 *
	 */
	public void qty_49(MCNumber value) {
		qty_49_p().qty(value);
	}

	/**
	 * Date 49 年月日４９.<p>
	 *
	 */
	public void qty_49(int value) {
		qty_49_p().qty(value);
	}

	/**
	 * Date 49 年月日４９.<p>
	 *
	 */
	public void qty_49(long value) {
		qty_49_p().qty(value);
	}

	/**
	 * Date 49 年月日４９.<p>
	 *
	 */
	public void qty_49(float value) {
		qty_49_p().qty(value);
	}

	/**
	 * Date 49 年月日４９.<p>
	 *
	 */
	public void qty_49(double value) {
		qty_49_p().qty(value);
	}

	/**
	 * Date 50 年月日５０.<p>
	 *
	 */
	public MCNumber qty_50() {
		return qty_50_p().qty();
	}

	/**
	 * Date 50 年月日５０.<p>
	 *
	 */
	public void qty_50(MCNumber value) {
		qty_50_p().qty(value);
	}

	/**
	 * Date 50 年月日５０.<p>
	 *
	 */
	public void qty_50(int value) {
		qty_50_p().qty(value);
	}

	/**
	 * Date 50 年月日５０.<p>
	 *
	 */
	public void qty_50(long value) {
		qty_50_p().qty(value);
	}

	/**
	 * Date 50 年月日５０.<p>
	 *
	 */
	public void qty_50(float value) {
		qty_50_p().qty(value);
	}

	/**
	 * Date 50 年月日５０.<p>
	 *
	 */
	public void qty_50(double value) {
		qty_50_p().qty(value);
	}

	/**
	 * Date 51 年月日５１.<p>
	 *
	 */
	public MCNumber qty_51() {
		return qty_51_p().qty();
	}

	/**
	 * Date 51 年月日５１.<p>
	 *
	 */
	public void qty_51(MCNumber value) {
		qty_51_p().qty(value);
	}

	/**
	 * Date 51 年月日５１.<p>
	 *
	 */
	public void qty_51(int value) {
		qty_51_p().qty(value);
	}

	/**
	 * Date 51 年月日５１.<p>
	 *
	 */
	public void qty_51(long value) {
		qty_51_p().qty(value);
	}

	/**
	 * Date 51 年月日５１.<p>
	 *
	 */
	public void qty_51(float value) {
		qty_51_p().qty(value);
	}

	/**
	 * Date 51 年月日５１.<p>
	 *
	 */
	public void qty_51(double value) {
		qty_51_p().qty(value);
	}

	/**
	 * Date 52 年月日５２.<p>
	 *
	 */
	public MCNumber qty_52() {
		return qty_52_p().qty();
	}

	/**
	 * Date 52 年月日５２.<p>
	 *
	 */
	public void qty_52(MCNumber value) {
		qty_52_p().qty(value);
	}

	/**
	 * Date 52 年月日５２.<p>
	 *
	 */
	public void qty_52(int value) {
		qty_52_p().qty(value);
	}

	/**
	 * Date 52 年月日５２.<p>
	 *
	 */
	public void qty_52(long value) {
		qty_52_p().qty(value);
	}

	/**
	 * Date 52 年月日５２.<p>
	 *
	 */
	public void qty_52(float value) {
		qty_52_p().qty(value);
	}

	/**
	 * Date 52 年月日５２.<p>
	 *
	 */
	public void qty_52(double value) {
		qty_52_p().qty(value);
	}

	/**
	 * Date 53 年月日５３.<p>
	 *
	 */
	public MCNumber qty_53() {
		return qty_53_p().qty();
	}

	/**
	 * Date 53 年月日５３.<p>
	 *
	 */
	public void qty_53(MCNumber value) {
		qty_53_p().qty(value);
	}

	/**
	 * Date 53 年月日５３.<p>
	 *
	 */
	public void qty_53(int value) {
		qty_53_p().qty(value);
	}

	/**
	 * Date 53 年月日５３.<p>
	 *
	 */
	public void qty_53(long value) {
		qty_53_p().qty(value);
	}

	/**
	 * Date 53 年月日５３.<p>
	 *
	 */
	public void qty_53(float value) {
		qty_53_p().qty(value);
	}

	/**
	 * Date 53 年月日５３.<p>
	 *
	 */
	public void qty_53(double value) {
		qty_53_p().qty(value);
	}

	/**
	 * Date 54 年月日５４.<p>
	 *
	 */
	public MCNumber qty_54() {
		return qty_54_p().qty();
	}

	/**
	 * Date 54 年月日５４.<p>
	 *
	 */
	public void qty_54(MCNumber value) {
		qty_54_p().qty(value);
	}

	/**
	 * Date 54 年月日５４.<p>
	 *
	 */
	public void qty_54(int value) {
		qty_54_p().qty(value);
	}

	/**
	 * Date 54 年月日５４.<p>
	 *
	 */
	public void qty_54(long value) {
		qty_54_p().qty(value);
	}

	/**
	 * Date 54 年月日５４.<p>
	 *
	 */
	public void qty_54(float value) {
		qty_54_p().qty(value);
	}

	/**
	 * Date 54 年月日５４.<p>
	 *
	 */
	public void qty_54(double value) {
		qty_54_p().qty(value);
	}

	/**
	 * Date 55 年月日５５.<p>
	 *
	 */
	public MCNumber qty_55() {
		return qty_55_p().qty();
	}

	/**
	 * Date 55 年月日５５.<p>
	 *
	 */
	public void qty_55(MCNumber value) {
		qty_55_p().qty(value);
	}

	/**
	 * Date 55 年月日５５.<p>
	 *
	 */
	public void qty_55(int value) {
		qty_55_p().qty(value);
	}

	/**
	 * Date 55 年月日５５.<p>
	 *
	 */
	public void qty_55(long value) {
		qty_55_p().qty(value);
	}

	/**
	 * Date 55 年月日５５.<p>
	 *
	 */
	public void qty_55(float value) {
		qty_55_p().qty(value);
	}

	/**
	 * Date 55 年月日５５.<p>
	 *
	 */
	public void qty_55(double value) {
		qty_55_p().qty(value);
	}

	/**
	 * Date 56 年月日５６.<p>
	 *
	 */
	public MCNumber qty_56() {
		return qty_56_p().qty();
	}

	/**
	 * Date 56 年月日５６.<p>
	 *
	 */
	public void qty_56(MCNumber value) {
		qty_56_p().qty(value);
	}

	/**
	 * Date 56 年月日５６.<p>
	 *
	 */
	public void qty_56(int value) {
		qty_56_p().qty(value);
	}

	/**
	 * Date 56 年月日５６.<p>
	 *
	 */
	public void qty_56(long value) {
		qty_56_p().qty(value);
	}

	/**
	 * Date 56 年月日５６.<p>
	 *
	 */
	public void qty_56(float value) {
		qty_56_p().qty(value);
	}

	/**
	 * Date 56 年月日５６.<p>
	 *
	 */
	public void qty_56(double value) {
		qty_56_p().qty(value);
	}

	/**
	 * Date 57 年月日５７.<p>
	 *
	 */
	public MCNumber qty_57() {
		return qty_57_p().qty();
	}

	/**
	 * Date 57 年月日５７.<p>
	 *
	 */
	public void qty_57(MCNumber value) {
		qty_57_p().qty(value);
	}

	/**
	 * Date 57 年月日５７.<p>
	 *
	 */
	public void qty_57(int value) {
		qty_57_p().qty(value);
	}

	/**
	 * Date 57 年月日５７.<p>
	 *
	 */
	public void qty_57(long value) {
		qty_57_p().qty(value);
	}

	/**
	 * Date 57 年月日５７.<p>
	 *
	 */
	public void qty_57(float value) {
		qty_57_p().qty(value);
	}

	/**
	 * Date 57 年月日５７.<p>
	 *
	 */
	public void qty_57(double value) {
		qty_57_p().qty(value);
	}

	/**
	 * Date 58 年月日５８.<p>
	 *
	 */
	public MCNumber qty_58() {
		return qty_58_p().qty();
	}

	/**
	 * Date 58 年月日５８.<p>
	 *
	 */
	public void qty_58(MCNumber value) {
		qty_58_p().qty(value);
	}

	/**
	 * Date 58 年月日５８.<p>
	 *
	 */
	public void qty_58(int value) {
		qty_58_p().qty(value);
	}

	/**
	 * Date 58 年月日５８.<p>
	 *
	 */
	public void qty_58(long value) {
		qty_58_p().qty(value);
	}

	/**
	 * Date 58 年月日５８.<p>
	 *
	 */
	public void qty_58(float value) {
		qty_58_p().qty(value);
	}

	/**
	 * Date 58 年月日５８.<p>
	 *
	 */
	public void qty_58(double value) {
		qty_58_p().qty(value);
	}

	/**
	 * Date 59 年月日５９.<p>
	 *
	 */
	public MCNumber qty_59() {
		return qty_59_p().qty();
	}

	/**
	 * Date 59 年月日５９.<p>
	 *
	 */
	public void qty_59(MCNumber value) {
		qty_59_p().qty(value);
	}

	/**
	 * Date 59 年月日５９.<p>
	 *
	 */
	public void qty_59(int value) {
		qty_59_p().qty(value);
	}

	/**
	 * Date 59 年月日５９.<p>
	 *
	 */
	public void qty_59(long value) {
		qty_59_p().qty(value);
	}

	/**
	 * Date 59 年月日５９.<p>
	 *
	 */
	public void qty_59(float value) {
		qty_59_p().qty(value);
	}

	/**
	 * Date 59 年月日５９.<p>
	 *
	 */
	public void qty_59(double value) {
		qty_59_p().qty(value);
	}

	/**
	 * Date 60 年月日６０.<p>
	 *
	 */
	public MCNumber qty_60() {
		return qty_60_p().qty();
	}

	/**
	 * Date 60 年月日６０.<p>
	 *
	 */
	public void qty_60(MCNumber value) {
		qty_60_p().qty(value);
	}

	/**
	 * Date 60 年月日６０.<p>
	 *
	 */
	public void qty_60(int value) {
		qty_60_p().qty(value);
	}

	/**
	 * Date 60 年月日６０.<p>
	 *
	 */
	public void qty_60(long value) {
		qty_60_p().qty(value);
	}

	/**
	 * Date 60 年月日６０.<p>
	 *
	 */
	public void qty_60(float value) {
		qty_60_p().qty(value);
	}

	/**
	 * Date 60 年月日６０.<p>
	 *
	 */
	public void qty_60(double value) {
		qty_60_p().qty(value);
	}

}

