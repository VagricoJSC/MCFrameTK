package mcframe.clientMGBF.MGBFP0430;

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
 * ブロック"DispRslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DispRsltR_MC_A extends MCConstRow {

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public static final String $calc_grp_nm = "calc_grp_nm";
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
	public static final String $mng_dpt_cd = "mng_dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $mng_dpt_nm = "mng_dpt_nm";
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
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Line name ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public static final String $elm_no = "elm_no";
	/**
	 * Column key 項目キー.<p>
	 *
	 */
	public static final String $elm = "elm";
	/**
	 * Column 項目.<p>
	 *
	 */
	public static final String $elm_nm = "elm_nm";
	public static final String $amt_00_p = "amt_00_p";
	public static final String $amt_01_p = "amt_01_p";
	public static final String $amt_02_p = "amt_02_p";
	public static final String $amt_03_p = "amt_03_p";
	public static final String $amt_04_p = "amt_04_p";
	public static final String $amt_05_p = "amt_05_p";
	public static final String $amt_06_p = "amt_06_p";
	public static final String $amt_07_p = "amt_07_p";
	public static final String $amt_08_p = "amt_08_p";
	public static final String $amt_09_p = "amt_09_p";
	public static final String $amt_10_p = "amt_10_p";
	public static final String $amt_11_p = "amt_11_p";
	public static final String $amt_12_p = "amt_12_p";
	public static final String $amt_13_p = "amt_13_p";
	public static final String $amt_14_p = "amt_14_p";
	public static final String $amt_15_p = "amt_15_p";
	public static final String $amt_16_p = "amt_16_p";
	public static final String $amt_17_p = "amt_17_p";
	public static final String $amt_18_p = "amt_18_p";
	public static final String $amt_19_p = "amt_19_p";
	public static final String $amt_20_p = "amt_20_p";
	public static final String $amt_21_p = "amt_21_p";
	public static final String $amt_22_p = "amt_22_p";
	public static final String $amt_23_p = "amt_23_p";
	public static final String $amt_24_p = "amt_24_p";
	public static final String $amt_25_p = "amt_25_p";
	public static final String $amt_26_p = "amt_26_p";
	public static final String $amt_27_p = "amt_27_p";
	public static final String $amt_28_p = "amt_28_p";
	public static final String $amt_29_p = "amt_29_p";
	public static final String $amt_30_p = "amt_30_p";
	public static final String $amt_31_p = "amt_31_p";
	public static final String $amt_32_p = "amt_32_p";
	public static final String $amt_33_p = "amt_33_p";
	public static final String $amt_34_p = "amt_34_p";
	public static final String $amt_35_p = "amt_35_p";
	public static final String $amt_36_p = "amt_36_p";
	public static final String $amt_37_p = "amt_37_p";
	public static final String $amt_38_p = "amt_38_p";
	public static final String $amt_39_p = "amt_39_p";
	public static final String $amt_40_p = "amt_40_p";
	public static final String $amt_41_p = "amt_41_p";
	public static final String $amt_42_p = "amt_42_p";
	public static final String $amt_43_p = "amt_43_p";
	public static final String $amt_44_p = "amt_44_p";
	public static final String $amt_45_p = "amt_45_p";
	public static final String $amt_46_p = "amt_46_p";
	public static final String $amt_47_p = "amt_47_p";
	public static final String $amt_48_p = "amt_48_p";
	public static final String $amt_49_p = "amt_49_p";
	public static final String $amt_50_p = "amt_50_p";
	public static final String $amt_51_p = "amt_51_p";
	public static final String $amt_52_p = "amt_52_p";
	public static final String $amt_53_p = "amt_53_p";
	public static final String $amt_54_p = "amt_54_p";
	public static final String $amt_55_p = "amt_55_p";
	public static final String $amt_56_p = "amt_56_p";
	public static final String $amt_57_p = "amt_57_p";
	public static final String $amt_58_p = "amt_58_p";
	public static final String $amt_59_p = "amt_59_p";
	public static final String $ttl_amt_p = "ttl_amt_p";

	public static final String $col_00 = $amt_00_p + ".amt";
	public static final String $col_01 = $amt_01_p + ".amt";
	public static final String $col_02 = $amt_02_p + ".amt";
	public static final String $col_03 = $amt_03_p + ".amt";
	public static final String $col_04 = $amt_04_p + ".amt";
	public static final String $col_05 = $amt_05_p + ".amt";
	public static final String $col_06 = $amt_06_p + ".amt";
	public static final String $col_07 = $amt_07_p + ".amt";
	public static final String $col_08 = $amt_08_p + ".amt";
	public static final String $col_09 = $amt_09_p + ".amt";
	public static final String $col_10 = $amt_10_p + ".amt";
	public static final String $col_11 = $amt_11_p + ".amt";
	public static final String $col_12 = $amt_12_p + ".amt";
	public static final String $col_13 = $amt_13_p + ".amt";
	public static final String $col_14 = $amt_14_p + ".amt";
	public static final String $col_15 = $amt_15_p + ".amt";
	public static final String $col_16 = $amt_16_p + ".amt";
	public static final String $col_17 = $amt_17_p + ".amt";
	public static final String $col_18 = $amt_18_p + ".amt";
	public static final String $col_19 = $amt_19_p + ".amt";
	public static final String $col_20 = $amt_20_p + ".amt";
	public static final String $col_21 = $amt_21_p + ".amt";
	public static final String $col_22 = $amt_22_p + ".amt";
	public static final String $col_23 = $amt_23_p + ".amt";
	public static final String $col_24 = $amt_24_p + ".amt";
	public static final String $col_25 = $amt_25_p + ".amt";
	public static final String $col_26 = $amt_26_p + ".amt";
	public static final String $col_27 = $amt_27_p + ".amt";
	public static final String $col_28 = $amt_28_p + ".amt";
	public static final String $col_29 = $amt_29_p + ".amt";
	public static final String $col_30 = $amt_30_p + ".amt";
	public static final String $col_31 = $amt_31_p + ".amt";
	public static final String $col_32 = $amt_32_p + ".amt";
	public static final String $col_33 = $amt_33_p + ".amt";
	public static final String $col_34 = $amt_34_p + ".amt";
	public static final String $col_35 = $amt_35_p + ".amt";
	public static final String $col_36 = $amt_36_p + ".amt";
	public static final String $col_37 = $amt_37_p + ".amt";
	public static final String $col_38 = $amt_38_p + ".amt";
	public static final String $col_39 = $amt_39_p + ".amt";
	public static final String $col_40 = $amt_40_p + ".amt";
	public static final String $col_41 = $amt_41_p + ".amt";
	public static final String $col_42 = $amt_42_p + ".amt";
	public static final String $col_43 = $amt_43_p + ".amt";
	public static final String $col_44 = $amt_44_p + ".amt";
	public static final String $col_45 = $amt_45_p + ".amt";
	public static final String $col_46 = $amt_46_p + ".amt";
	public static final String $col_47 = $amt_47_p + ".amt";
	public static final String $col_48 = $amt_48_p + ".amt";
	public static final String $col_49 = $amt_49_p + ".amt";
	public static final String $col_50 = $amt_50_p + ".amt";
	public static final String $col_51 = $amt_51_p + ".amt";
	public static final String $col_52 = $amt_52_p + ".amt";
	public static final String $col_53 = $amt_53_p + ".amt";
	public static final String $col_54 = $amt_54_p + ".amt";
	public static final String $col_55 = $amt_55_p + ".amt";
	public static final String $col_56 = $amt_56_p + ".amt";
	public static final String $col_57 = $amt_57_p + ".amt";
	public static final String $col_58 = $amt_58_p + ".amt";
	public static final String $col_59 = $amt_59_p + ".amt";
	public static final String $ttl = $ttl_amt_p + ".amt";

	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta elm_no_META = createNumberMeta($elm_no);
	public static final MCMeta elm_META = createStringMeta($elm);
	public static final MCMeta elm_nm_META = createStringMeta($elm_nm);
	public static final MCMeta amt_00_p_META = createInnerRowMeta($amt_00_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_01_p_META = createInnerRowMeta($amt_01_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_02_p_META = createInnerRowMeta($amt_02_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_03_p_META = createInnerRowMeta($amt_03_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_04_p_META = createInnerRowMeta($amt_04_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_05_p_META = createInnerRowMeta($amt_05_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_06_p_META = createInnerRowMeta($amt_06_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_07_p_META = createInnerRowMeta($amt_07_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_08_p_META = createInnerRowMeta($amt_08_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_09_p_META = createInnerRowMeta($amt_09_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_10_p_META = createInnerRowMeta($amt_10_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_11_p_META = createInnerRowMeta($amt_11_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_12_p_META = createInnerRowMeta($amt_12_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_13_p_META = createInnerRowMeta($amt_13_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_14_p_META = createInnerRowMeta($amt_14_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_15_p_META = createInnerRowMeta($amt_15_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_16_p_META = createInnerRowMeta($amt_16_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_17_p_META = createInnerRowMeta($amt_17_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_18_p_META = createInnerRowMeta($amt_18_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_19_p_META = createInnerRowMeta($amt_19_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_20_p_META = createInnerRowMeta($amt_20_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_21_p_META = createInnerRowMeta($amt_21_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_22_p_META = createInnerRowMeta($amt_22_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_23_p_META = createInnerRowMeta($amt_23_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_24_p_META = createInnerRowMeta($amt_24_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_25_p_META = createInnerRowMeta($amt_25_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_26_p_META = createInnerRowMeta($amt_26_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_27_p_META = createInnerRowMeta($amt_27_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_28_p_META = createInnerRowMeta($amt_28_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_29_p_META = createInnerRowMeta($amt_29_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_30_p_META = createInnerRowMeta($amt_30_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_31_p_META = createInnerRowMeta($amt_31_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_32_p_META = createInnerRowMeta($amt_32_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_33_p_META = createInnerRowMeta($amt_33_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_34_p_META = createInnerRowMeta($amt_34_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_35_p_META = createInnerRowMeta($amt_35_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_36_p_META = createInnerRowMeta($amt_36_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_37_p_META = createInnerRowMeta($amt_37_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_38_p_META = createInnerRowMeta($amt_38_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_39_p_META = createInnerRowMeta($amt_39_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_40_p_META = createInnerRowMeta($amt_40_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_41_p_META = createInnerRowMeta($amt_41_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_42_p_META = createInnerRowMeta($amt_42_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_43_p_META = createInnerRowMeta($amt_43_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_44_p_META = createInnerRowMeta($amt_44_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_45_p_META = createInnerRowMeta($amt_45_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_46_p_META = createInnerRowMeta($amt_46_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_47_p_META = createInnerRowMeta($amt_47_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_48_p_META = createInnerRowMeta($amt_48_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_49_p_META = createInnerRowMeta($amt_49_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_50_p_META = createInnerRowMeta($amt_50_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_51_p_META = createInnerRowMeta($amt_51_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_52_p_META = createInnerRowMeta($amt_52_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_53_p_META = createInnerRowMeta($amt_53_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_54_p_META = createInnerRowMeta($amt_54_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_55_p_META = createInnerRowMeta($amt_55_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_56_p_META = createInnerRowMeta($amt_56_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_57_p_META = createInnerRowMeta($amt_57_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_58_p_META = createInnerRowMeta($amt_58_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta amt_59_p_META = createInnerRowMeta($amt_59_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ttl_amt_p_META = createInnerRowMeta($ttl_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);

	protected static final ConstMetaList<DispRsltR> constMetas = new ConstMetaList<DispRsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_grp_cd_META,
			calc_grp_nm_META,
			wg_cd_META,
			wg_nm_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			site_cd_META,
			site_nm_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			elm_no_META,
			elm_META,
			elm_nm_META,
			amt_00_p_META,
			amt_01_p_META,
			amt_02_p_META,
			amt_03_p_META,
			amt_04_p_META,
			amt_05_p_META,
			amt_06_p_META,
			amt_07_p_META,
			amt_08_p_META,
			amt_09_p_META,
			amt_10_p_META,
			amt_11_p_META,
			amt_12_p_META,
			amt_13_p_META,
			amt_14_p_META,
			amt_15_p_META,
			amt_16_p_META,
			amt_17_p_META,
			amt_18_p_META,
			amt_19_p_META,
			amt_20_p_META,
			amt_21_p_META,
			amt_22_p_META,
			amt_23_p_META,
			amt_24_p_META,
			amt_25_p_META,
			amt_26_p_META,
			amt_27_p_META,
			amt_28_p_META,
			amt_29_p_META,
			amt_30_p_META,
			amt_31_p_META,
			amt_32_p_META,
			amt_33_p_META,
			amt_34_p_META,
			amt_35_p_META,
			amt_36_p_META,
			amt_37_p_META,
			amt_38_p_META,
			amt_39_p_META,
			amt_40_p_META,
			amt_41_p_META,
			amt_42_p_META,
			amt_43_p_META,
			amt_44_p_META,
			amt_45_p_META,
			amt_46_p_META,
			amt_47_p_META,
			amt_48_p_META,
			amt_49_p_META,
			amt_50_p_META,
			amt_51_p_META,
			amt_52_p_META,
			amt_53_p_META,
			amt_54_p_META,
			amt_55_p_META,
			amt_56_p_META,
			amt_57_p_META,
			amt_58_p_META,
			amt_59_p_META,
			ttl_amt_p_META
		},
		new String[][]{
			{
				"col_00",
				"col_01",
				"col_02",
				"col_03",
				"col_04",
				"col_05",
				"col_06",
				"col_07",
				"col_08",
				"col_09",
				"col_10",
				"col_11",
				"col_12",
				"col_13",
				"col_14",
				"col_15",
				"col_16",
				"col_17",
				"col_18",
				"col_19",
				"col_20",
				"col_21",
				"col_22",
				"col_23",
				"col_24",
				"col_25",
				"col_26",
				"col_27",
				"col_28",
				"col_29",
				"col_30",
				"col_31",
				"col_32",
				"col_33",
				"col_34",
				"col_35",
				"col_36",
				"col_37",
				"col_38",
				"col_39",
				"col_40",
				"col_41",
				"col_42",
				"col_43",
				"col_44",
				"col_45",
				"col_46",
				"col_47",
				"col_48",
				"col_49",
				"col_50",
				"col_51",
				"col_52",
				"col_53",
				"col_54",
				"col_55",
				"col_56",
				"col_57",
				"col_58",
				"col_59",
				"ttl"
			},
			{
				$col_00,
				$col_01,
				$col_02,
				$col_03,
				$col_04,
				$col_05,
				$col_06,
				$col_07,
				$col_08,
				$col_09,
				$col_10,
				$col_11,
				$col_12,
				$col_13,
				$col_14,
				$col_15,
				$col_16,
				$col_17,
				$col_18,
				$col_19,
				$col_20,
				$col_21,
				$col_22,
				$col_23,
				$col_24,
				$col_25,
				$col_26,
				$col_27,
				$col_28,
				$col_29,
				$col_30,
				$col_31,
				$col_32,
				$col_33,
				$col_34,
				$col_35,
				$col_36,
				$col_37,
				$col_38,
				$col_39,
				$col_40,
				$col_41,
				$col_42,
				$col_43,
				$col_44,
				$col_45,
				$col_46,
				$col_47,
				$col_48,
				$col_49,
				$col_50,
				$col_51,
				$col_52,
				$col_53,
				$col_54,
				$col_55,
				$col_56,
				$col_57,
				$col_58,
				$col_59,
				$ttl
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

	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CLEAR]のキー定数 */
	public static final String $$CLEAR = "CLEAR";
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[HKEY]のキー定数 */
	public static final String $$HKEY = "HKEY";
	/** 項目属性情報のグループ[OTHER]のキー定数 */
	public static final String $$OTHER = "OTHER";
	/** 項目属性情報のグループ[HVAL]のキー定数 */
	public static final String $$HVAL = "HVAL";
	/** 項目属性情報のグループ[ELM]のキー定数 */
	public static final String $$ELM = "ELM";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$str_ln_cd, "STR_LN"},	// str_ln_cd
				{$str_ln_nm, "STR_LN"}	// str_ln_nm
			}
		)),
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
		new MCExtMap.Entry($$CLEAR, new MCExtList(
			new String[][]{
				{$calc_grp_cd, "Key"},	// calc_grp_cd
				{$calc_grp_nm, "Key"},	// calc_grp_nm
				{$wg_cd, "Key"},	// wg_cd
				{$wg_nm, "Key"},	// wg_nm
				{$mng_dpt_cd, "Key"},	// mng_dpt_cd
				{$mng_dpt_nm, "Key"},	// mng_dpt_nm
				{$site_cd, "Key"},	// site_cd
				{$site_nm, "Key"},	// site_nm
				{$loc_cd, "Key"},	// loc_cd
				{$loc_nm, "Key"},	// loc_nm
				{$str_ln_cd, "Key"},	// str_ln_cd
				{$str_ln_nm, "Key"}	// str_ln_nm
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
				{$calc_grp_cd, "disp_calc_grp_flg"},	// calc_grp_cd
				{$calc_grp_nm, "disp_calc_grp_flg"},	// calc_grp_nm
				{$wg_cd, "disp_wg_flg"},	// wg_cd
				{$wg_nm, "disp_wg_flg"},	// wg_nm
				{$mng_dpt_cd, "disp_mng_dpt_flg"},	// mng_dpt_cd
				{$mng_dpt_nm, "disp_mng_dpt_flg"},	// mng_dpt_nm
				{$site_cd, "site_flg"},	// site_cd
				{$site_nm, "site_flg"},	// site_nm
				{$loc_cd, "loc_flg"},	// loc_cd
				{$loc_nm, "loc_flg"},	// loc_nm
				{$str_ln_cd, "str_ln_flg"},	// str_ln_cd
				{$str_ln_nm, "str_ln_flg"}	// str_ln_nm
			}
		)),
		new MCExtMap.Entry($$HKEY, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$OTHER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$HVAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ELM, new MCExtList(
			new String[][]{
				{$amt_00_p + ".amt", "Key"},	// amt_00_p.amt
				{$amt_01_p + ".amt", "Key"},	// amt_01_p.amt
				{$amt_02_p + ".amt", "Key"},	// amt_02_p.amt
				{$amt_03_p + ".amt", "Key"},	// amt_03_p.amt
				{$amt_04_p + ".amt", "Key"},	// amt_04_p.amt
				{$amt_05_p + ".amt", "Key"},	// amt_05_p.amt
				{$amt_06_p + ".amt", "Key"},	// amt_06_p.amt
				{$amt_07_p + ".amt", "Key"},	// amt_07_p.amt
				{$amt_08_p + ".amt", "Key"},	// amt_08_p.amt
				{$amt_09_p + ".amt", "Key"},	// amt_09_p.amt
				{$amt_10_p + ".amt", "Key"},	// amt_10_p.amt
				{$amt_11_p + ".amt", "Key"},	// amt_11_p.amt
				{$amt_12_p + ".amt", "Key"},	// amt_12_p.amt
				{$amt_13_p + ".amt", "Key"},	// amt_13_p.amt
				{$amt_14_p + ".amt", "Key"},	// amt_14_p.amt
				{$amt_15_p + ".amt", "Key"},	// amt_15_p.amt
				{$amt_16_p + ".amt", "Key"},	// amt_16_p.amt
				{$amt_17_p + ".amt", "Key"},	// amt_17_p.amt
				{$amt_18_p + ".amt", "Key"},	// amt_18_p.amt
				{$amt_19_p + ".amt", "Key"},	// amt_19_p.amt
				{$amt_20_p + ".amt", "Key"},	// amt_20_p.amt
				{$amt_21_p + ".amt", "Key"},	// amt_21_p.amt
				{$amt_22_p + ".amt", "Key"},	// amt_22_p.amt
				{$amt_23_p + ".amt", "Key"},	// amt_23_p.amt
				{$amt_24_p + ".amt", "Key"},	// amt_24_p.amt
				{$amt_25_p + ".amt", "Key"},	// amt_25_p.amt
				{$amt_26_p + ".amt", "Key"},	// amt_26_p.amt
				{$amt_27_p + ".amt", "Key"},	// amt_27_p.amt
				{$amt_28_p + ".amt", "Key"},	// amt_28_p.amt
				{$amt_29_p + ".amt", "Key"},	// amt_29_p.amt
				{$amt_30_p + ".amt", "Key"},	// amt_30_p.amt
				{$amt_31_p + ".amt", "Key"},	// amt_31_p.amt
				{$amt_32_p + ".amt", "Key"},	// amt_32_p.amt
				{$amt_33_p + ".amt", "Key"},	// amt_33_p.amt
				{$amt_34_p + ".amt", "Key"},	// amt_34_p.amt
				{$amt_35_p + ".amt", "Key"},	// amt_35_p.amt
				{$amt_36_p + ".amt", "Key"},	// amt_36_p.amt
				{$amt_37_p + ".amt", "Key"},	// amt_37_p.amt
				{$amt_38_p + ".amt", "Key"},	// amt_38_p.amt
				{$amt_39_p + ".amt", "Key"},	// amt_39_p.amt
				{$amt_40_p + ".amt", "Key"},	// amt_40_p.amt
				{$amt_41_p + ".amt", "Key"},	// amt_41_p.amt
				{$amt_42_p + ".amt", "Key"},	// amt_42_p.amt
				{$amt_43_p + ".amt", "Key"},	// amt_43_p.amt
				{$amt_44_p + ".amt", "Key"},	// amt_44_p.amt
				{$amt_45_p + ".amt", "Key"},	// amt_45_p.amt
				{$amt_46_p + ".amt", "Key"},	// amt_46_p.amt
				{$amt_47_p + ".amt", "Key"},	// amt_47_p.amt
				{$amt_48_p + ".amt", "Key"},	// amt_48_p.amt
				{$amt_49_p + ".amt", "Key"},	// amt_49_p.amt
				{$amt_50_p + ".amt", "Key"},	// amt_50_p.amt
				{$amt_51_p + ".amt", "Key"},	// amt_51_p.amt
				{$amt_52_p + ".amt", "Key"},	// amt_52_p.amt
				{$amt_53_p + ".amt", "Key"},	// amt_53_p.amt
				{$amt_54_p + ".amt", "Key"},	// amt_54_p.amt
				{$amt_55_p + ".amt", "Key"},	// amt_55_p.amt
				{$amt_56_p + ".amt", "Key"},	// amt_56_p.amt
				{$amt_57_p + ".amt", "Key"},	// amt_57_p.amt
				{$amt_58_p + ".amt", "Key"},	// amt_58_p.amt
				{$amt_59_p + ".amt", "Key"}	// amt_59_p.amt
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
				{$amt_00_p + ".amt", "AMT"},	// amt_00_p.amt
				{$amt_01_p + ".amt", "AMT"},	// amt_01_p.amt
				{$amt_02_p + ".amt", "AMT"},	// amt_02_p.amt
				{$amt_03_p + ".amt", "AMT"},	// amt_03_p.amt
				{$amt_04_p + ".amt", "AMT"},	// amt_04_p.amt
				{$amt_05_p + ".amt", "AMT"},	// amt_05_p.amt
				{$amt_06_p + ".amt", "AMT"},	// amt_06_p.amt
				{$amt_07_p + ".amt", "AMT"},	// amt_07_p.amt
				{$amt_08_p + ".amt", "AMT"},	// amt_08_p.amt
				{$amt_09_p + ".amt", "AMT"},	// amt_09_p.amt
				{$amt_10_p + ".amt", "AMT"},	// amt_10_p.amt
				{$amt_11_p + ".amt", "AMT"},	// amt_11_p.amt
				{$amt_12_p + ".amt", "AMT"},	// amt_12_p.amt
				{$amt_13_p + ".amt", "AMT"},	// amt_13_p.amt
				{$amt_14_p + ".amt", "AMT"},	// amt_14_p.amt
				{$amt_15_p + ".amt", "AMT"},	// amt_15_p.amt
				{$amt_16_p + ".amt", "AMT"},	// amt_16_p.amt
				{$amt_17_p + ".amt", "AMT"},	// amt_17_p.amt
				{$amt_18_p + ".amt", "AMT"},	// amt_18_p.amt
				{$amt_19_p + ".amt", "AMT"},	// amt_19_p.amt
				{$amt_20_p + ".amt", "AMT"},	// amt_20_p.amt
				{$amt_21_p + ".amt", "AMT"},	// amt_21_p.amt
				{$amt_22_p + ".amt", "AMT"},	// amt_22_p.amt
				{$amt_23_p + ".amt", "AMT"},	// amt_23_p.amt
				{$amt_24_p + ".amt", "AMT"},	// amt_24_p.amt
				{$amt_25_p + ".amt", "AMT"},	// amt_25_p.amt
				{$amt_26_p + ".amt", "AMT"},	// amt_26_p.amt
				{$amt_27_p + ".amt", "AMT"},	// amt_27_p.amt
				{$amt_28_p + ".amt", "AMT"},	// amt_28_p.amt
				{$amt_29_p + ".amt", "AMT"},	// amt_29_p.amt
				{$amt_30_p + ".amt", "AMT"},	// amt_30_p.amt
				{$amt_31_p + ".amt", "AMT"},	// amt_31_p.amt
				{$amt_32_p + ".amt", "AMT"},	// amt_32_p.amt
				{$amt_33_p + ".amt", "AMT"},	// amt_33_p.amt
				{$amt_34_p + ".amt", "AMT"},	// amt_34_p.amt
				{$amt_35_p + ".amt", "AMT"},	// amt_35_p.amt
				{$amt_36_p + ".amt", "AMT"},	// amt_36_p.amt
				{$amt_37_p + ".amt", "AMT"},	// amt_37_p.amt
				{$amt_38_p + ".amt", "AMT"},	// amt_38_p.amt
				{$amt_39_p + ".amt", "AMT"},	// amt_39_p.amt
				{$amt_40_p + ".amt", "AMT"},	// amt_40_p.amt
				{$amt_41_p + ".amt", "AMT"},	// amt_41_p.amt
				{$amt_42_p + ".amt", "AMT"},	// amt_42_p.amt
				{$amt_43_p + ".amt", "AMT"},	// amt_43_p.amt
				{$amt_44_p + ".amt", "AMT"},	// amt_44_p.amt
				{$amt_45_p + ".amt", "AMT"},	// amt_45_p.amt
				{$amt_46_p + ".amt", "AMT"},	// amt_46_p.amt
				{$amt_47_p + ".amt", "AMT"},	// amt_47_p.amt
				{$amt_48_p + ".amt", "AMT"},	// amt_48_p.amt
				{$amt_49_p + ".amt", "AMT"},	// amt_49_p.amt
				{$amt_50_p + ".amt", "AMT"},	// amt_50_p.amt
				{$amt_51_p + ".amt", "AMT"},	// amt_51_p.amt
				{$amt_52_p + ".amt", "AMT"},	// amt_52_p.amt
				{$amt_53_p + ".amt", "AMT"},	// amt_53_p.amt
				{$amt_54_p + ".amt", "AMT"},	// amt_54_p.amt
				{$amt_55_p + ".amt", "AMT"},	// amt_55_p.amt
				{$amt_56_p + ".amt", "AMT"},	// amt_56_p.amt
				{$amt_57_p + ".amt", "AMT"},	// amt_57_p.amt
				{$amt_58_p + ".amt", "AMT"},	// amt_58_p.amt
				{$amt_59_p + ".amt", "AMT"},	// amt_59_p.amt
				{$ttl_amt_p + ".amt", "AMT"}	// ttl_amt_p.amt
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
	protected DispRsltR_MC_A(ConstMetaList<? extends DispRsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispRsltR clone() {
		return (DispRsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispRsltR createInstance() {
		return (DispRsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispRsltR getValues(String... names) {
		return (DispRsltR) super.getValues(names);
	}



	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 0, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 0, $calc_grp_cd, value);
	}


	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 1, $calc_grp_nm);
	}

	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 1, $calc_grp_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 3, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 3, $wg_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 4, $mng_dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 4, $mng_dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 5, $mng_dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 5, $mng_dpt_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 6, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 6, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 7, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 7, $site_nm, value);
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


	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 10, $str_ln_cd);
	}

	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 10, $str_ln_cd, value);
	}


	/**
	 * Line name ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 11, $str_ln_nm);
	}

	/**
	 * Line name ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 11, $str_ln_nm, value);
	}


	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public MCNumber elm_no() {
		return getConstNumber(offset + 12, $elm_no);
	}

	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public void elm_no(MCNumber value) {
		setConstNumber(offset + 12, $elm_no, value);
	}

	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public void elm_no(int value) {
		setConstNumber(offset + 12, $elm_no, value);
	}

	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public void elm_no(long value) {
		setConstNumber(offset + 12, $elm_no, value);
	}

	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public void elm_no(float value) {
		setConstNumber(offset + 12, $elm_no, value);
	}

	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public void elm_no(double value) {
		setConstNumber(offset + 12, $elm_no, value);
	}


	/**
	 * Column key 項目キー.<p>
	 *
	 */
	public String elm() {
		return getConstString(offset + 13, $elm);
	}

	/**
	 * Column key 項目キー.<p>
	 *
	 */
	public void elm(String value) {
		setConstString(offset + 13, $elm, value);
	}


	/**
	 * Column 項目.<p>
	 *
	 */
	public String elm_nm() {
		return getConstString(offset + 14, $elm_nm);
	}

	/**
	 * Column 項目.<p>
	 *
	 */
	public void elm_nm(String value) {
		setConstString(offset + 14, $elm_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_00_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 15, $amt_00_p);
	}
	
	public void amt_00_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 15, $amt_00_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_01_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 16, $amt_01_p);
	}
	
	public void amt_01_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 16, $amt_01_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_02_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 17, $amt_02_p);
	}
	
	public void amt_02_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 17, $amt_02_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_03_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 18, $amt_03_p);
	}
	
	public void amt_03_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 18, $amt_03_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_04_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 19, $amt_04_p);
	}
	
	public void amt_04_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 19, $amt_04_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_05_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 20, $amt_05_p);
	}
	
	public void amt_05_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 20, $amt_05_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_06_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 21, $amt_06_p);
	}
	
	public void amt_06_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 21, $amt_06_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_07_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 22, $amt_07_p);
	}
	
	public void amt_07_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 22, $amt_07_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_08_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 23, $amt_08_p);
	}
	
	public void amt_08_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 23, $amt_08_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_09_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 24, $amt_09_p);
	}
	
	public void amt_09_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 24, $amt_09_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_10_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 25, $amt_10_p);
	}
	
	public void amt_10_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 25, $amt_10_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_11_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 26, $amt_11_p);
	}
	
	public void amt_11_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 26, $amt_11_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_12_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 27, $amt_12_p);
	}
	
	public void amt_12_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 27, $amt_12_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_13_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 28, $amt_13_p);
	}
	
	public void amt_13_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 28, $amt_13_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_14_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 29, $amt_14_p);
	}
	
	public void amt_14_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 29, $amt_14_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_15_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 30, $amt_15_p);
	}
	
	public void amt_15_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 30, $amt_15_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_16_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 31, $amt_16_p);
	}
	
	public void amt_16_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 31, $amt_16_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_17_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 32, $amt_17_p);
	}
	
	public void amt_17_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 32, $amt_17_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_18_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 33, $amt_18_p);
	}
	
	public void amt_18_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 33, $amt_18_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_19_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 34, $amt_19_p);
	}
	
	public void amt_19_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 34, $amt_19_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_20_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 35, $amt_20_p);
	}
	
	public void amt_20_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 35, $amt_20_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_21_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 36, $amt_21_p);
	}
	
	public void amt_21_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 36, $amt_21_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_22_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 37, $amt_22_p);
	}
	
	public void amt_22_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 37, $amt_22_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_23_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 38, $amt_23_p);
	}
	
	public void amt_23_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 38, $amt_23_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_24_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 39, $amt_24_p);
	}
	
	public void amt_24_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 39, $amt_24_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_25_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 40, $amt_25_p);
	}
	
	public void amt_25_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 40, $amt_25_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_26_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 41, $amt_26_p);
	}
	
	public void amt_26_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 41, $amt_26_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_27_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 42, $amt_27_p);
	}
	
	public void amt_27_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 42, $amt_27_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_28_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 43, $amt_28_p);
	}
	
	public void amt_28_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 43, $amt_28_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_29_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 44, $amt_29_p);
	}
	
	public void amt_29_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 44, $amt_29_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_30_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 45, $amt_30_p);
	}
	
	public void amt_30_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 45, $amt_30_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_31_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 46, $amt_31_p);
	}
	
	public void amt_31_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 46, $amt_31_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_32_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 47, $amt_32_p);
	}
	
	public void amt_32_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 47, $amt_32_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_33_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 48, $amt_33_p);
	}
	
	public void amt_33_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 48, $amt_33_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_34_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 49, $amt_34_p);
	}
	
	public void amt_34_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 49, $amt_34_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_35_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 50, $amt_35_p);
	}
	
	public void amt_35_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 50, $amt_35_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_36_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 51, $amt_36_p);
	}
	
	public void amt_36_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 51, $amt_36_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_37_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 52, $amt_37_p);
	}
	
	public void amt_37_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 52, $amt_37_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_38_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 53, $amt_38_p);
	}
	
	public void amt_38_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 53, $amt_38_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_39_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 54, $amt_39_p);
	}
	
	public void amt_39_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 54, $amt_39_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_40_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 55, $amt_40_p);
	}
	
	public void amt_40_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 55, $amt_40_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_41_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 56, $amt_41_p);
	}
	
	public void amt_41_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 56, $amt_41_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_42_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 57, $amt_42_p);
	}
	
	public void amt_42_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 57, $amt_42_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_43_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 58, $amt_43_p);
	}
	
	public void amt_43_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 58, $amt_43_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_44_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 59, $amt_44_p);
	}
	
	public void amt_44_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 59, $amt_44_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_45_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 60, $amt_45_p);
	}
	
	public void amt_45_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 60, $amt_45_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_46_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 61, $amt_46_p);
	}
	
	public void amt_46_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 61, $amt_46_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_47_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 62, $amt_47_p);
	}
	
	public void amt_47_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 62, $amt_47_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_48_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 63, $amt_48_p);
	}
	
	public void amt_48_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 63, $amt_48_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_49_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 64, $amt_49_p);
	}
	
	public void amt_49_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 64, $amt_49_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_50_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 65, $amt_50_p);
	}
	
	public void amt_50_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 65, $amt_50_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_51_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 66, $amt_51_p);
	}
	
	public void amt_51_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 66, $amt_51_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_52_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 67, $amt_52_p);
	}
	
	public void amt_52_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 67, $amt_52_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_53_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 68, $amt_53_p);
	}
	
	public void amt_53_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 68, $amt_53_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_54_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 69, $amt_54_p);
	}
	
	public void amt_54_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 69, $amt_54_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_55_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 70, $amt_55_p);
	}
	
	public void amt_55_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 70, $amt_55_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_56_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 71, $amt_56_p);
	}
	
	public void amt_56_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 71, $amt_56_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_57_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 72, $amt_57_p);
	}
	
	public void amt_57_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 72, $amt_57_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_58_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 73, $amt_58_p);
	}
	
	public void amt_58_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 73, $amt_58_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_59_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 74, $amt_59_p);
	}
	
	public void amt_59_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 74, $amt_59_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ttl_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 75, $ttl_amt_p);
	}
	
	public void ttl_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 75, $ttl_amt_p, row);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
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
		if ($elm.equalsIgnoreCase(name)) {
			return elm();
		}
		if ($elm_nm.equalsIgnoreCase(name)) {
			return elm_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($elm_no.equalsIgnoreCase(name)) {
			return elm_no();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
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
		if ($elm.equalsIgnoreCase(name)) {
			return elm();
		}
		if ($elm_nm.equalsIgnoreCase(name)) {
			return elm_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($elm_no.equalsIgnoreCase(name)) {
			return elm_no();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
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
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
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
		if ($elm.equalsIgnoreCase(name)) {
			elm(value);
			return;
		}
		if ($elm_nm.equalsIgnoreCase(name)) {
			elm_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
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
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
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
		if ($elm.equalsIgnoreCase(name)) {
			elm(value);
			return;
		}
		if ($elm_nm.equalsIgnoreCase(name)) {
			elm_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($amt_00_p.equalsIgnoreCase(name)) {
			return amt_00_p();
		}
		if ($amt_01_p.equalsIgnoreCase(name)) {
			return amt_01_p();
		}
		if ($amt_02_p.equalsIgnoreCase(name)) {
			return amt_02_p();
		}
		if ($amt_03_p.equalsIgnoreCase(name)) {
			return amt_03_p();
		}
		if ($amt_04_p.equalsIgnoreCase(name)) {
			return amt_04_p();
		}
		if ($amt_05_p.equalsIgnoreCase(name)) {
			return amt_05_p();
		}
		if ($amt_06_p.equalsIgnoreCase(name)) {
			return amt_06_p();
		}
		if ($amt_07_p.equalsIgnoreCase(name)) {
			return amt_07_p();
		}
		if ($amt_08_p.equalsIgnoreCase(name)) {
			return amt_08_p();
		}
		if ($amt_09_p.equalsIgnoreCase(name)) {
			return amt_09_p();
		}
		if ($amt_10_p.equalsIgnoreCase(name)) {
			return amt_10_p();
		}
		if ($amt_11_p.equalsIgnoreCase(name)) {
			return amt_11_p();
		}
		if ($amt_12_p.equalsIgnoreCase(name)) {
			return amt_12_p();
		}
		if ($amt_13_p.equalsIgnoreCase(name)) {
			return amt_13_p();
		}
		if ($amt_14_p.equalsIgnoreCase(name)) {
			return amt_14_p();
		}
		if ($amt_15_p.equalsIgnoreCase(name)) {
			return amt_15_p();
		}
		if ($amt_16_p.equalsIgnoreCase(name)) {
			return amt_16_p();
		}
		if ($amt_17_p.equalsIgnoreCase(name)) {
			return amt_17_p();
		}
		if ($amt_18_p.equalsIgnoreCase(name)) {
			return amt_18_p();
		}
		if ($amt_19_p.equalsIgnoreCase(name)) {
			return amt_19_p();
		}
		if ($amt_20_p.equalsIgnoreCase(name)) {
			return amt_20_p();
		}
		if ($amt_21_p.equalsIgnoreCase(name)) {
			return amt_21_p();
		}
		if ($amt_22_p.equalsIgnoreCase(name)) {
			return amt_22_p();
		}
		if ($amt_23_p.equalsIgnoreCase(name)) {
			return amt_23_p();
		}
		if ($amt_24_p.equalsIgnoreCase(name)) {
			return amt_24_p();
		}
		if ($amt_25_p.equalsIgnoreCase(name)) {
			return amt_25_p();
		}
		if ($amt_26_p.equalsIgnoreCase(name)) {
			return amt_26_p();
		}
		if ($amt_27_p.equalsIgnoreCase(name)) {
			return amt_27_p();
		}
		if ($amt_28_p.equalsIgnoreCase(name)) {
			return amt_28_p();
		}
		if ($amt_29_p.equalsIgnoreCase(name)) {
			return amt_29_p();
		}
		if ($amt_30_p.equalsIgnoreCase(name)) {
			return amt_30_p();
		}
		if ($amt_31_p.equalsIgnoreCase(name)) {
			return amt_31_p();
		}
		if ($amt_32_p.equalsIgnoreCase(name)) {
			return amt_32_p();
		}
		if ($amt_33_p.equalsIgnoreCase(name)) {
			return amt_33_p();
		}
		if ($amt_34_p.equalsIgnoreCase(name)) {
			return amt_34_p();
		}
		if ($amt_35_p.equalsIgnoreCase(name)) {
			return amt_35_p();
		}
		if ($amt_36_p.equalsIgnoreCase(name)) {
			return amt_36_p();
		}
		if ($amt_37_p.equalsIgnoreCase(name)) {
			return amt_37_p();
		}
		if ($amt_38_p.equalsIgnoreCase(name)) {
			return amt_38_p();
		}
		if ($amt_39_p.equalsIgnoreCase(name)) {
			return amt_39_p();
		}
		if ($amt_40_p.equalsIgnoreCase(name)) {
			return amt_40_p();
		}
		if ($amt_41_p.equalsIgnoreCase(name)) {
			return amt_41_p();
		}
		if ($amt_42_p.equalsIgnoreCase(name)) {
			return amt_42_p();
		}
		if ($amt_43_p.equalsIgnoreCase(name)) {
			return amt_43_p();
		}
		if ($amt_44_p.equalsIgnoreCase(name)) {
			return amt_44_p();
		}
		if ($amt_45_p.equalsIgnoreCase(name)) {
			return amt_45_p();
		}
		if ($amt_46_p.equalsIgnoreCase(name)) {
			return amt_46_p();
		}
		if ($amt_47_p.equalsIgnoreCase(name)) {
			return amt_47_p();
		}
		if ($amt_48_p.equalsIgnoreCase(name)) {
			return amt_48_p();
		}
		if ($amt_49_p.equalsIgnoreCase(name)) {
			return amt_49_p();
		}
		if ($amt_50_p.equalsIgnoreCase(name)) {
			return amt_50_p();
		}
		if ($amt_51_p.equalsIgnoreCase(name)) {
			return amt_51_p();
		}
		if ($amt_52_p.equalsIgnoreCase(name)) {
			return amt_52_p();
		}
		if ($amt_53_p.equalsIgnoreCase(name)) {
			return amt_53_p();
		}
		if ($amt_54_p.equalsIgnoreCase(name)) {
			return amt_54_p();
		}
		if ($amt_55_p.equalsIgnoreCase(name)) {
			return amt_55_p();
		}
		if ($amt_56_p.equalsIgnoreCase(name)) {
			return amt_56_p();
		}
		if ($amt_57_p.equalsIgnoreCase(name)) {
			return amt_57_p();
		}
		if ($amt_58_p.equalsIgnoreCase(name)) {
			return amt_58_p();
		}
		if ($amt_59_p.equalsIgnoreCase(name)) {
			return amt_59_p();
		}
		if ($ttl_amt_p.equalsIgnoreCase(name)) {
			return ttl_amt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($amt_00_p.equalsIgnoreCase(name)) {
			amt_00_p(
				((MCContainerMeta) amt_00_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_01_p.equalsIgnoreCase(name)) {
			amt_01_p(
				((MCContainerMeta) amt_01_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_02_p.equalsIgnoreCase(name)) {
			amt_02_p(
				((MCContainerMeta) amt_02_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_03_p.equalsIgnoreCase(name)) {
			amt_03_p(
				((MCContainerMeta) amt_03_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_04_p.equalsIgnoreCase(name)) {
			amt_04_p(
				((MCContainerMeta) amt_04_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_05_p.equalsIgnoreCase(name)) {
			amt_05_p(
				((MCContainerMeta) amt_05_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_06_p.equalsIgnoreCase(name)) {
			amt_06_p(
				((MCContainerMeta) amt_06_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_07_p.equalsIgnoreCase(name)) {
			amt_07_p(
				((MCContainerMeta) amt_07_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_08_p.equalsIgnoreCase(name)) {
			amt_08_p(
				((MCContainerMeta) amt_08_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_09_p.equalsIgnoreCase(name)) {
			amt_09_p(
				((MCContainerMeta) amt_09_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_10_p.equalsIgnoreCase(name)) {
			amt_10_p(
				((MCContainerMeta) amt_10_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_11_p.equalsIgnoreCase(name)) {
			amt_11_p(
				((MCContainerMeta) amt_11_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_12_p.equalsIgnoreCase(name)) {
			amt_12_p(
				((MCContainerMeta) amt_12_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_13_p.equalsIgnoreCase(name)) {
			amt_13_p(
				((MCContainerMeta) amt_13_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_14_p.equalsIgnoreCase(name)) {
			amt_14_p(
				((MCContainerMeta) amt_14_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_15_p.equalsIgnoreCase(name)) {
			amt_15_p(
				((MCContainerMeta) amt_15_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_16_p.equalsIgnoreCase(name)) {
			amt_16_p(
				((MCContainerMeta) amt_16_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_17_p.equalsIgnoreCase(name)) {
			amt_17_p(
				((MCContainerMeta) amt_17_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_18_p.equalsIgnoreCase(name)) {
			amt_18_p(
				((MCContainerMeta) amt_18_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_19_p.equalsIgnoreCase(name)) {
			amt_19_p(
				((MCContainerMeta) amt_19_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_20_p.equalsIgnoreCase(name)) {
			amt_20_p(
				((MCContainerMeta) amt_20_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_21_p.equalsIgnoreCase(name)) {
			amt_21_p(
				((MCContainerMeta) amt_21_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_22_p.equalsIgnoreCase(name)) {
			amt_22_p(
				((MCContainerMeta) amt_22_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_23_p.equalsIgnoreCase(name)) {
			amt_23_p(
				((MCContainerMeta) amt_23_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_24_p.equalsIgnoreCase(name)) {
			amt_24_p(
				((MCContainerMeta) amt_24_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_25_p.equalsIgnoreCase(name)) {
			amt_25_p(
				((MCContainerMeta) amt_25_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_26_p.equalsIgnoreCase(name)) {
			amt_26_p(
				((MCContainerMeta) amt_26_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_27_p.equalsIgnoreCase(name)) {
			amt_27_p(
				((MCContainerMeta) amt_27_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_28_p.equalsIgnoreCase(name)) {
			amt_28_p(
				((MCContainerMeta) amt_28_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_29_p.equalsIgnoreCase(name)) {
			amt_29_p(
				((MCContainerMeta) amt_29_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_30_p.equalsIgnoreCase(name)) {
			amt_30_p(
				((MCContainerMeta) amt_30_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_31_p.equalsIgnoreCase(name)) {
			amt_31_p(
				((MCContainerMeta) amt_31_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_32_p.equalsIgnoreCase(name)) {
			amt_32_p(
				((MCContainerMeta) amt_32_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_33_p.equalsIgnoreCase(name)) {
			amt_33_p(
				((MCContainerMeta) amt_33_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_34_p.equalsIgnoreCase(name)) {
			amt_34_p(
				((MCContainerMeta) amt_34_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_35_p.equalsIgnoreCase(name)) {
			amt_35_p(
				((MCContainerMeta) amt_35_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_36_p.equalsIgnoreCase(name)) {
			amt_36_p(
				((MCContainerMeta) amt_36_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_37_p.equalsIgnoreCase(name)) {
			amt_37_p(
				((MCContainerMeta) amt_37_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_38_p.equalsIgnoreCase(name)) {
			amt_38_p(
				((MCContainerMeta) amt_38_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_39_p.equalsIgnoreCase(name)) {
			amt_39_p(
				((MCContainerMeta) amt_39_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_40_p.equalsIgnoreCase(name)) {
			amt_40_p(
				((MCContainerMeta) amt_40_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_41_p.equalsIgnoreCase(name)) {
			amt_41_p(
				((MCContainerMeta) amt_41_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_42_p.equalsIgnoreCase(name)) {
			amt_42_p(
				((MCContainerMeta) amt_42_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_43_p.equalsIgnoreCase(name)) {
			amt_43_p(
				((MCContainerMeta) amt_43_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_44_p.equalsIgnoreCase(name)) {
			amt_44_p(
				((MCContainerMeta) amt_44_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_45_p.equalsIgnoreCase(name)) {
			amt_45_p(
				((MCContainerMeta) amt_45_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_46_p.equalsIgnoreCase(name)) {
			amt_46_p(
				((MCContainerMeta) amt_46_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_47_p.equalsIgnoreCase(name)) {
			amt_47_p(
				((MCContainerMeta) amt_47_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_48_p.equalsIgnoreCase(name)) {
			amt_48_p(
				((MCContainerMeta) amt_48_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_49_p.equalsIgnoreCase(name)) {
			amt_49_p(
				((MCContainerMeta) amt_49_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_50_p.equalsIgnoreCase(name)) {
			amt_50_p(
				((MCContainerMeta) amt_50_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_51_p.equalsIgnoreCase(name)) {
			amt_51_p(
				((MCContainerMeta) amt_51_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_52_p.equalsIgnoreCase(name)) {
			amt_52_p(
				((MCContainerMeta) amt_52_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_53_p.equalsIgnoreCase(name)) {
			amt_53_p(
				((MCContainerMeta) amt_53_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_54_p.equalsIgnoreCase(name)) {
			amt_54_p(
				((MCContainerMeta) amt_54_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_55_p.equalsIgnoreCase(name)) {
			amt_55_p(
				((MCContainerMeta) amt_55_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_56_p.equalsIgnoreCase(name)) {
			amt_56_p(
				((MCContainerMeta) amt_56_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_57_p.equalsIgnoreCase(name)) {
			amt_57_p(
				((MCContainerMeta) amt_57_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_58_p.equalsIgnoreCase(name)) {
			amt_58_p(
				((MCContainerMeta) amt_58_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_59_p.equalsIgnoreCase(name)) {
			amt_59_p(
				((MCContainerMeta) amt_59_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ttl_amt_p.equalsIgnoreCase(name)) {
			ttl_amt_p(
				((MCContainerMeta) ttl_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public MCNumber col_00() {
		return amt_00_p().amt();
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_00(MCNumber value) {
		amt_00_p().amt(value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_00(int value) {
		amt_00_p().amt(value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_00(long value) {
		amt_00_p().amt(value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_00(float value) {
		amt_00_p().amt(value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_00(double value) {
		amt_00_p().amt(value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public MCNumber col_01() {
		return amt_01_p().amt();
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_01(MCNumber value) {
		amt_01_p().amt(value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_01(int value) {
		amt_01_p().amt(value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_01(long value) {
		amt_01_p().amt(value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_01(float value) {
		amt_01_p().amt(value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_01(double value) {
		amt_01_p().amt(value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public MCNumber col_02() {
		return amt_02_p().amt();
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_02(MCNumber value) {
		amt_02_p().amt(value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_02(int value) {
		amt_02_p().amt(value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_02(long value) {
		amt_02_p().amt(value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_02(float value) {
		amt_02_p().amt(value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_02(double value) {
		amt_02_p().amt(value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public MCNumber col_03() {
		return amt_03_p().amt();
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_03(MCNumber value) {
		amt_03_p().amt(value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_03(int value) {
		amt_03_p().amt(value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_03(long value) {
		amt_03_p().amt(value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_03(float value) {
		amt_03_p().amt(value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_03(double value) {
		amt_03_p().amt(value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public MCNumber col_04() {
		return amt_04_p().amt();
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_04(MCNumber value) {
		amt_04_p().amt(value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_04(int value) {
		amt_04_p().amt(value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_04(long value) {
		amt_04_p().amt(value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_04(float value) {
		amt_04_p().amt(value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_04(double value) {
		amt_04_p().amt(value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public MCNumber col_05() {
		return amt_05_p().amt();
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_05(MCNumber value) {
		amt_05_p().amt(value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_05(int value) {
		amt_05_p().amt(value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_05(long value) {
		amt_05_p().amt(value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_05(float value) {
		amt_05_p().amt(value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_05(double value) {
		amt_05_p().amt(value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public MCNumber col_06() {
		return amt_06_p().amt();
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_06(MCNumber value) {
		amt_06_p().amt(value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_06(int value) {
		amt_06_p().amt(value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_06(long value) {
		amt_06_p().amt(value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_06(float value) {
		amt_06_p().amt(value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_06(double value) {
		amt_06_p().amt(value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public MCNumber col_07() {
		return amt_07_p().amt();
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_07(MCNumber value) {
		amt_07_p().amt(value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_07(int value) {
		amt_07_p().amt(value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_07(long value) {
		amt_07_p().amt(value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_07(float value) {
		amt_07_p().amt(value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_07(double value) {
		amt_07_p().amt(value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public MCNumber col_08() {
		return amt_08_p().amt();
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_08(MCNumber value) {
		amt_08_p().amt(value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_08(int value) {
		amt_08_p().amt(value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_08(long value) {
		amt_08_p().amt(value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_08(float value) {
		amt_08_p().amt(value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_08(double value) {
		amt_08_p().amt(value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public MCNumber col_09() {
		return amt_09_p().amt();
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_09(MCNumber value) {
		amt_09_p().amt(value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_09(int value) {
		amt_09_p().amt(value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_09(long value) {
		amt_09_p().amt(value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_09(float value) {
		amt_09_p().amt(value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_09(double value) {
		amt_09_p().amt(value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public MCNumber col_10() {
		return amt_10_p().amt();
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_10(MCNumber value) {
		amt_10_p().amt(value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_10(int value) {
		amt_10_p().amt(value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_10(long value) {
		amt_10_p().amt(value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_10(float value) {
		amt_10_p().amt(value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_10(double value) {
		amt_10_p().amt(value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public MCNumber col_11() {
		return amt_11_p().amt();
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void col_11(MCNumber value) {
		amt_11_p().amt(value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void col_11(int value) {
		amt_11_p().amt(value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void col_11(long value) {
		amt_11_p().amt(value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void col_11(float value) {
		amt_11_p().amt(value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void col_11(double value) {
		amt_11_p().amt(value);
	}

	/**
	 * Month 12 年月１２.<p>
	 *
	 */
	public MCNumber col_12() {
		return amt_12_p().amt();
	}

	/**
	 * Month 12 年月１２.<p>
	 *
	 */
	public void col_12(MCNumber value) {
		amt_12_p().amt(value);
	}

	/**
	 * Month 12 年月１２.<p>
	 *
	 */
	public void col_12(int value) {
		amt_12_p().amt(value);
	}

	/**
	 * Month 12 年月１２.<p>
	 *
	 */
	public void col_12(long value) {
		amt_12_p().amt(value);
	}

	/**
	 * Month 12 年月１２.<p>
	 *
	 */
	public void col_12(float value) {
		amt_12_p().amt(value);
	}

	/**
	 * Month 12 年月１２.<p>
	 *
	 */
	public void col_12(double value) {
		amt_12_p().amt(value);
	}

	/**
	 * Month 13 年月１３.<p>
	 *
	 */
	public MCNumber col_13() {
		return amt_13_p().amt();
	}

	/**
	 * Month 13 年月１３.<p>
	 *
	 */
	public void col_13(MCNumber value) {
		amt_13_p().amt(value);
	}

	/**
	 * Month 13 年月１３.<p>
	 *
	 */
	public void col_13(int value) {
		amt_13_p().amt(value);
	}

	/**
	 * Month 13 年月１３.<p>
	 *
	 */
	public void col_13(long value) {
		amt_13_p().amt(value);
	}

	/**
	 * Month 13 年月１３.<p>
	 *
	 */
	public void col_13(float value) {
		amt_13_p().amt(value);
	}

	/**
	 * Month 13 年月１３.<p>
	 *
	 */
	public void col_13(double value) {
		amt_13_p().amt(value);
	}

	/**
	 * Month 14 年月１４.<p>
	 *
	 */
	public MCNumber col_14() {
		return amt_14_p().amt();
	}

	/**
	 * Month 14 年月１４.<p>
	 *
	 */
	public void col_14(MCNumber value) {
		amt_14_p().amt(value);
	}

	/**
	 * Month 14 年月１４.<p>
	 *
	 */
	public void col_14(int value) {
		amt_14_p().amt(value);
	}

	/**
	 * Month 14 年月１４.<p>
	 *
	 */
	public void col_14(long value) {
		amt_14_p().amt(value);
	}

	/**
	 * Month 14 年月１４.<p>
	 *
	 */
	public void col_14(float value) {
		amt_14_p().amt(value);
	}

	/**
	 * Month 14 年月１４.<p>
	 *
	 */
	public void col_14(double value) {
		amt_14_p().amt(value);
	}

	/**
	 * Month 15 年月１５.<p>
	 *
	 */
	public MCNumber col_15() {
		return amt_15_p().amt();
	}

	/**
	 * Month 15 年月１５.<p>
	 *
	 */
	public void col_15(MCNumber value) {
		amt_15_p().amt(value);
	}

	/**
	 * Month 15 年月１５.<p>
	 *
	 */
	public void col_15(int value) {
		amt_15_p().amt(value);
	}

	/**
	 * Month 15 年月１５.<p>
	 *
	 */
	public void col_15(long value) {
		amt_15_p().amt(value);
	}

	/**
	 * Month 15 年月１５.<p>
	 *
	 */
	public void col_15(float value) {
		amt_15_p().amt(value);
	}

	/**
	 * Month 15 年月１５.<p>
	 *
	 */
	public void col_15(double value) {
		amt_15_p().amt(value);
	}

	/**
	 * Month 16 年月１６.<p>
	 *
	 */
	public MCNumber col_16() {
		return amt_16_p().amt();
	}

	/**
	 * Month 16 年月１６.<p>
	 *
	 */
	public void col_16(MCNumber value) {
		amt_16_p().amt(value);
	}

	/**
	 * Month 16 年月１６.<p>
	 *
	 */
	public void col_16(int value) {
		amt_16_p().amt(value);
	}

	/**
	 * Month 16 年月１６.<p>
	 *
	 */
	public void col_16(long value) {
		amt_16_p().amt(value);
	}

	/**
	 * Month 16 年月１６.<p>
	 *
	 */
	public void col_16(float value) {
		amt_16_p().amt(value);
	}

	/**
	 * Month 16 年月１６.<p>
	 *
	 */
	public void col_16(double value) {
		amt_16_p().amt(value);
	}

	/**
	 * Month 17 年月１７.<p>
	 *
	 */
	public MCNumber col_17() {
		return amt_17_p().amt();
	}

	/**
	 * Month 17 年月１７.<p>
	 *
	 */
	public void col_17(MCNumber value) {
		amt_17_p().amt(value);
	}

	/**
	 * Month 17 年月１７.<p>
	 *
	 */
	public void col_17(int value) {
		amt_17_p().amt(value);
	}

	/**
	 * Month 17 年月１７.<p>
	 *
	 */
	public void col_17(long value) {
		amt_17_p().amt(value);
	}

	/**
	 * Month 17 年月１７.<p>
	 *
	 */
	public void col_17(float value) {
		amt_17_p().amt(value);
	}

	/**
	 * Month 17 年月１７.<p>
	 *
	 */
	public void col_17(double value) {
		amt_17_p().amt(value);
	}

	/**
	 * Month 18 年月１８.<p>
	 *
	 */
	public MCNumber col_18() {
		return amt_18_p().amt();
	}

	/**
	 * Month 18 年月１８.<p>
	 *
	 */
	public void col_18(MCNumber value) {
		amt_18_p().amt(value);
	}

	/**
	 * Month 18 年月１８.<p>
	 *
	 */
	public void col_18(int value) {
		amt_18_p().amt(value);
	}

	/**
	 * Month 18 年月１８.<p>
	 *
	 */
	public void col_18(long value) {
		amt_18_p().amt(value);
	}

	/**
	 * Month 18 年月１８.<p>
	 *
	 */
	public void col_18(float value) {
		amt_18_p().amt(value);
	}

	/**
	 * Month 18 年月１８.<p>
	 *
	 */
	public void col_18(double value) {
		amt_18_p().amt(value);
	}

	/**
	 * Month 19 年月１９.<p>
	 *
	 */
	public MCNumber col_19() {
		return amt_19_p().amt();
	}

	/**
	 * Month 19 年月１９.<p>
	 *
	 */
	public void col_19(MCNumber value) {
		amt_19_p().amt(value);
	}

	/**
	 * Month 19 年月１９.<p>
	 *
	 */
	public void col_19(int value) {
		amt_19_p().amt(value);
	}

	/**
	 * Month 19 年月１９.<p>
	 *
	 */
	public void col_19(long value) {
		amt_19_p().amt(value);
	}

	/**
	 * Month 19 年月１９.<p>
	 *
	 */
	public void col_19(float value) {
		amt_19_p().amt(value);
	}

	/**
	 * Month 19 年月１９.<p>
	 *
	 */
	public void col_19(double value) {
		amt_19_p().amt(value);
	}

	/**
	 * Month 20 年月２０.<p>
	 *
	 */
	public MCNumber col_20() {
		return amt_20_p().amt();
	}

	/**
	 * Month 20 年月２０.<p>
	 *
	 */
	public void col_20(MCNumber value) {
		amt_20_p().amt(value);
	}

	/**
	 * Month 20 年月２０.<p>
	 *
	 */
	public void col_20(int value) {
		amt_20_p().amt(value);
	}

	/**
	 * Month 20 年月２０.<p>
	 *
	 */
	public void col_20(long value) {
		amt_20_p().amt(value);
	}

	/**
	 * Month 20 年月２０.<p>
	 *
	 */
	public void col_20(float value) {
		amt_20_p().amt(value);
	}

	/**
	 * Month 20 年月２０.<p>
	 *
	 */
	public void col_20(double value) {
		amt_20_p().amt(value);
	}

	/**
	 * Month 21 年月２１.<p>
	 *
	 */
	public MCNumber col_21() {
		return amt_21_p().amt();
	}

	/**
	 * Month 21 年月２１.<p>
	 *
	 */
	public void col_21(MCNumber value) {
		amt_21_p().amt(value);
	}

	/**
	 * Month 21 年月２１.<p>
	 *
	 */
	public void col_21(int value) {
		amt_21_p().amt(value);
	}

	/**
	 * Month 21 年月２１.<p>
	 *
	 */
	public void col_21(long value) {
		amt_21_p().amt(value);
	}

	/**
	 * Month 21 年月２１.<p>
	 *
	 */
	public void col_21(float value) {
		amt_21_p().amt(value);
	}

	/**
	 * Month 21 年月２１.<p>
	 *
	 */
	public void col_21(double value) {
		amt_21_p().amt(value);
	}

	/**
	 * Month 22 年月２２.<p>
	 *
	 */
	public MCNumber col_22() {
		return amt_22_p().amt();
	}

	/**
	 * Month 22 年月２２.<p>
	 *
	 */
	public void col_22(MCNumber value) {
		amt_22_p().amt(value);
	}

	/**
	 * Month 22 年月２２.<p>
	 *
	 */
	public void col_22(int value) {
		amt_22_p().amt(value);
	}

	/**
	 * Month 22 年月２２.<p>
	 *
	 */
	public void col_22(long value) {
		amt_22_p().amt(value);
	}

	/**
	 * Month 22 年月２２.<p>
	 *
	 */
	public void col_22(float value) {
		amt_22_p().amt(value);
	}

	/**
	 * Month 22 年月２２.<p>
	 *
	 */
	public void col_22(double value) {
		amt_22_p().amt(value);
	}

	/**
	 * Month 23 年月２３.<p>
	 *
	 */
	public MCNumber col_23() {
		return amt_23_p().amt();
	}

	/**
	 * Month 23 年月２３.<p>
	 *
	 */
	public void col_23(MCNumber value) {
		amt_23_p().amt(value);
	}

	/**
	 * Month 23 年月２３.<p>
	 *
	 */
	public void col_23(int value) {
		amt_23_p().amt(value);
	}

	/**
	 * Month 23 年月２３.<p>
	 *
	 */
	public void col_23(long value) {
		amt_23_p().amt(value);
	}

	/**
	 * Month 23 年月２３.<p>
	 *
	 */
	public void col_23(float value) {
		amt_23_p().amt(value);
	}

	/**
	 * Month 23 年月２３.<p>
	 *
	 */
	public void col_23(double value) {
		amt_23_p().amt(value);
	}

	/**
	 * Month 24 年月２４.<p>
	 *
	 */
	public MCNumber col_24() {
		return amt_24_p().amt();
	}

	/**
	 * Month 24 年月２４.<p>
	 *
	 */
	public void col_24(MCNumber value) {
		amt_24_p().amt(value);
	}

	/**
	 * Month 24 年月２４.<p>
	 *
	 */
	public void col_24(int value) {
		amt_24_p().amt(value);
	}

	/**
	 * Month 24 年月２４.<p>
	 *
	 */
	public void col_24(long value) {
		amt_24_p().amt(value);
	}

	/**
	 * Month 24 年月２４.<p>
	 *
	 */
	public void col_24(float value) {
		amt_24_p().amt(value);
	}

	/**
	 * Month 24 年月２４.<p>
	 *
	 */
	public void col_24(double value) {
		amt_24_p().amt(value);
	}

	/**
	 * Month 25 年月２５.<p>
	 *
	 */
	public MCNumber col_25() {
		return amt_25_p().amt();
	}

	/**
	 * Month 25 年月２５.<p>
	 *
	 */
	public void col_25(MCNumber value) {
		amt_25_p().amt(value);
	}

	/**
	 * Month 25 年月２５.<p>
	 *
	 */
	public void col_25(int value) {
		amt_25_p().amt(value);
	}

	/**
	 * Month 25 年月２５.<p>
	 *
	 */
	public void col_25(long value) {
		amt_25_p().amt(value);
	}

	/**
	 * Month 25 年月２５.<p>
	 *
	 */
	public void col_25(float value) {
		amt_25_p().amt(value);
	}

	/**
	 * Month 25 年月２５.<p>
	 *
	 */
	public void col_25(double value) {
		amt_25_p().amt(value);
	}

	/**
	 * Month 26 年月２６.<p>
	 *
	 */
	public MCNumber col_26() {
		return amt_26_p().amt();
	}

	/**
	 * Month 26 年月２６.<p>
	 *
	 */
	public void col_26(MCNumber value) {
		amt_26_p().amt(value);
	}

	/**
	 * Month 26 年月２６.<p>
	 *
	 */
	public void col_26(int value) {
		amt_26_p().amt(value);
	}

	/**
	 * Month 26 年月２６.<p>
	 *
	 */
	public void col_26(long value) {
		amt_26_p().amt(value);
	}

	/**
	 * Month 26 年月２６.<p>
	 *
	 */
	public void col_26(float value) {
		amt_26_p().amt(value);
	}

	/**
	 * Month 26 年月２６.<p>
	 *
	 */
	public void col_26(double value) {
		amt_26_p().amt(value);
	}

	/**
	 * Month 27 年月２７.<p>
	 *
	 */
	public MCNumber col_27() {
		return amt_27_p().amt();
	}

	/**
	 * Month 27 年月２７.<p>
	 *
	 */
	public void col_27(MCNumber value) {
		amt_27_p().amt(value);
	}

	/**
	 * Month 27 年月２７.<p>
	 *
	 */
	public void col_27(int value) {
		amt_27_p().amt(value);
	}

	/**
	 * Month 27 年月２７.<p>
	 *
	 */
	public void col_27(long value) {
		amt_27_p().amt(value);
	}

	/**
	 * Month 27 年月２７.<p>
	 *
	 */
	public void col_27(float value) {
		amt_27_p().amt(value);
	}

	/**
	 * Month 27 年月２７.<p>
	 *
	 */
	public void col_27(double value) {
		amt_27_p().amt(value);
	}

	/**
	 * Month 28 年月２８.<p>
	 *
	 */
	public MCNumber col_28() {
		return amt_28_p().amt();
	}

	/**
	 * Month 28 年月２８.<p>
	 *
	 */
	public void col_28(MCNumber value) {
		amt_28_p().amt(value);
	}

	/**
	 * Month 28 年月２８.<p>
	 *
	 */
	public void col_28(int value) {
		amt_28_p().amt(value);
	}

	/**
	 * Month 28 年月２８.<p>
	 *
	 */
	public void col_28(long value) {
		amt_28_p().amt(value);
	}

	/**
	 * Month 28 年月２８.<p>
	 *
	 */
	public void col_28(float value) {
		amt_28_p().amt(value);
	}

	/**
	 * Month 28 年月２８.<p>
	 *
	 */
	public void col_28(double value) {
		amt_28_p().amt(value);
	}

	/**
	 * Month 29 年月２９.<p>
	 *
	 */
	public MCNumber col_29() {
		return amt_29_p().amt();
	}

	/**
	 * Month 29 年月２９.<p>
	 *
	 */
	public void col_29(MCNumber value) {
		amt_29_p().amt(value);
	}

	/**
	 * Month 29 年月２９.<p>
	 *
	 */
	public void col_29(int value) {
		amt_29_p().amt(value);
	}

	/**
	 * Month 29 年月２９.<p>
	 *
	 */
	public void col_29(long value) {
		amt_29_p().amt(value);
	}

	/**
	 * Month 29 年月２９.<p>
	 *
	 */
	public void col_29(float value) {
		amt_29_p().amt(value);
	}

	/**
	 * Month 29 年月２９.<p>
	 *
	 */
	public void col_29(double value) {
		amt_29_p().amt(value);
	}

	/**
	 * Month 30 年月３０.<p>
	 *
	 */
	public MCNumber col_30() {
		return amt_30_p().amt();
	}

	/**
	 * Month 30 年月３０.<p>
	 *
	 */
	public void col_30(MCNumber value) {
		amt_30_p().amt(value);
	}

	/**
	 * Month 30 年月３０.<p>
	 *
	 */
	public void col_30(int value) {
		amt_30_p().amt(value);
	}

	/**
	 * Month 30 年月３０.<p>
	 *
	 */
	public void col_30(long value) {
		amt_30_p().amt(value);
	}

	/**
	 * Month 30 年月３０.<p>
	 *
	 */
	public void col_30(float value) {
		amt_30_p().amt(value);
	}

	/**
	 * Month 30 年月３０.<p>
	 *
	 */
	public void col_30(double value) {
		amt_30_p().amt(value);
	}

	/**
	 * Month 31 年月３１.<p>
	 *
	 */
	public MCNumber col_31() {
		return amt_31_p().amt();
	}

	/**
	 * Month 31 年月３１.<p>
	 *
	 */
	public void col_31(MCNumber value) {
		amt_31_p().amt(value);
	}

	/**
	 * Month 31 年月３１.<p>
	 *
	 */
	public void col_31(int value) {
		amt_31_p().amt(value);
	}

	/**
	 * Month 31 年月３１.<p>
	 *
	 */
	public void col_31(long value) {
		amt_31_p().amt(value);
	}

	/**
	 * Month 31 年月３１.<p>
	 *
	 */
	public void col_31(float value) {
		amt_31_p().amt(value);
	}

	/**
	 * Month 31 年月３１.<p>
	 *
	 */
	public void col_31(double value) {
		amt_31_p().amt(value);
	}

	/**
	 * Month 32 年月３２.<p>
	 *
	 */
	public MCNumber col_32() {
		return amt_32_p().amt();
	}

	/**
	 * Month 32 年月３２.<p>
	 *
	 */
	public void col_32(MCNumber value) {
		amt_32_p().amt(value);
	}

	/**
	 * Month 32 年月３２.<p>
	 *
	 */
	public void col_32(int value) {
		amt_32_p().amt(value);
	}

	/**
	 * Month 32 年月３２.<p>
	 *
	 */
	public void col_32(long value) {
		amt_32_p().amt(value);
	}

	/**
	 * Month 32 年月３２.<p>
	 *
	 */
	public void col_32(float value) {
		amt_32_p().amt(value);
	}

	/**
	 * Month 32 年月３２.<p>
	 *
	 */
	public void col_32(double value) {
		amt_32_p().amt(value);
	}

	/**
	 * Month 33 年月３３.<p>
	 *
	 */
	public MCNumber col_33() {
		return amt_33_p().amt();
	}

	/**
	 * Month 33 年月３３.<p>
	 *
	 */
	public void col_33(MCNumber value) {
		amt_33_p().amt(value);
	}

	/**
	 * Month 33 年月３３.<p>
	 *
	 */
	public void col_33(int value) {
		amt_33_p().amt(value);
	}

	/**
	 * Month 33 年月３３.<p>
	 *
	 */
	public void col_33(long value) {
		amt_33_p().amt(value);
	}

	/**
	 * Month 33 年月３３.<p>
	 *
	 */
	public void col_33(float value) {
		amt_33_p().amt(value);
	}

	/**
	 * Month 33 年月３３.<p>
	 *
	 */
	public void col_33(double value) {
		amt_33_p().amt(value);
	}

	/**
	 * Month 34 年月３４.<p>
	 *
	 */
	public MCNumber col_34() {
		return amt_34_p().amt();
	}

	/**
	 * Month 34 年月３４.<p>
	 *
	 */
	public void col_34(MCNumber value) {
		amt_34_p().amt(value);
	}

	/**
	 * Month 34 年月３４.<p>
	 *
	 */
	public void col_34(int value) {
		amt_34_p().amt(value);
	}

	/**
	 * Month 34 年月３４.<p>
	 *
	 */
	public void col_34(long value) {
		amt_34_p().amt(value);
	}

	/**
	 * Month 34 年月３４.<p>
	 *
	 */
	public void col_34(float value) {
		amt_34_p().amt(value);
	}

	/**
	 * Month 34 年月３４.<p>
	 *
	 */
	public void col_34(double value) {
		amt_34_p().amt(value);
	}

	/**
	 * Month 35 年月３５.<p>
	 *
	 */
	public MCNumber col_35() {
		return amt_35_p().amt();
	}

	/**
	 * Month 35 年月３５.<p>
	 *
	 */
	public void col_35(MCNumber value) {
		amt_35_p().amt(value);
	}

	/**
	 * Month 35 年月３５.<p>
	 *
	 */
	public void col_35(int value) {
		amt_35_p().amt(value);
	}

	/**
	 * Month 35 年月３５.<p>
	 *
	 */
	public void col_35(long value) {
		amt_35_p().amt(value);
	}

	/**
	 * Month 35 年月３５.<p>
	 *
	 */
	public void col_35(float value) {
		amt_35_p().amt(value);
	}

	/**
	 * Month 35 年月３５.<p>
	 *
	 */
	public void col_35(double value) {
		amt_35_p().amt(value);
	}

	/**
	 * Month 36 年月３６.<p>
	 *
	 */
	public MCNumber col_36() {
		return amt_36_p().amt();
	}

	/**
	 * Month 36 年月３６.<p>
	 *
	 */
	public void col_36(MCNumber value) {
		amt_36_p().amt(value);
	}

	/**
	 * Month 36 年月３６.<p>
	 *
	 */
	public void col_36(int value) {
		amt_36_p().amt(value);
	}

	/**
	 * Month 36 年月３６.<p>
	 *
	 */
	public void col_36(long value) {
		amt_36_p().amt(value);
	}

	/**
	 * Month 36 年月３６.<p>
	 *
	 */
	public void col_36(float value) {
		amt_36_p().amt(value);
	}

	/**
	 * Month 36 年月３６.<p>
	 *
	 */
	public void col_36(double value) {
		amt_36_p().amt(value);
	}

	/**
	 * Month 37 年月３７.<p>
	 *
	 */
	public MCNumber col_37() {
		return amt_37_p().amt();
	}

	/**
	 * Month 37 年月３７.<p>
	 *
	 */
	public void col_37(MCNumber value) {
		amt_37_p().amt(value);
	}

	/**
	 * Month 37 年月３７.<p>
	 *
	 */
	public void col_37(int value) {
		amt_37_p().amt(value);
	}

	/**
	 * Month 37 年月３７.<p>
	 *
	 */
	public void col_37(long value) {
		amt_37_p().amt(value);
	}

	/**
	 * Month 37 年月３７.<p>
	 *
	 */
	public void col_37(float value) {
		amt_37_p().amt(value);
	}

	/**
	 * Month 37 年月３７.<p>
	 *
	 */
	public void col_37(double value) {
		amt_37_p().amt(value);
	}

	/**
	 * Month 38 年月３８.<p>
	 *
	 */
	public MCNumber col_38() {
		return amt_38_p().amt();
	}

	/**
	 * Month 38 年月３８.<p>
	 *
	 */
	public void col_38(MCNumber value) {
		amt_38_p().amt(value);
	}

	/**
	 * Month 38 年月３８.<p>
	 *
	 */
	public void col_38(int value) {
		amt_38_p().amt(value);
	}

	/**
	 * Month 38 年月３８.<p>
	 *
	 */
	public void col_38(long value) {
		amt_38_p().amt(value);
	}

	/**
	 * Month 38 年月３８.<p>
	 *
	 */
	public void col_38(float value) {
		amt_38_p().amt(value);
	}

	/**
	 * Month 38 年月３８.<p>
	 *
	 */
	public void col_38(double value) {
		amt_38_p().amt(value);
	}

	/**
	 * Month 39 年月３９.<p>
	 *
	 */
	public MCNumber col_39() {
		return amt_39_p().amt();
	}

	/**
	 * Month 39 年月３９.<p>
	 *
	 */
	public void col_39(MCNumber value) {
		amt_39_p().amt(value);
	}

	/**
	 * Month 39 年月３９.<p>
	 *
	 */
	public void col_39(int value) {
		amt_39_p().amt(value);
	}

	/**
	 * Month 39 年月３９.<p>
	 *
	 */
	public void col_39(long value) {
		amt_39_p().amt(value);
	}

	/**
	 * Month 39 年月３９.<p>
	 *
	 */
	public void col_39(float value) {
		amt_39_p().amt(value);
	}

	/**
	 * Month 39 年月３９.<p>
	 *
	 */
	public void col_39(double value) {
		amt_39_p().amt(value);
	}

	/**
	 * Month 40 年月４０.<p>
	 *
	 */
	public MCNumber col_40() {
		return amt_40_p().amt();
	}

	/**
	 * Month 40 年月４０.<p>
	 *
	 */
	public void col_40(MCNumber value) {
		amt_40_p().amt(value);
	}

	/**
	 * Month 40 年月４０.<p>
	 *
	 */
	public void col_40(int value) {
		amt_40_p().amt(value);
	}

	/**
	 * Month 40 年月４０.<p>
	 *
	 */
	public void col_40(long value) {
		amt_40_p().amt(value);
	}

	/**
	 * Month 40 年月４０.<p>
	 *
	 */
	public void col_40(float value) {
		amt_40_p().amt(value);
	}

	/**
	 * Month 40 年月４０.<p>
	 *
	 */
	public void col_40(double value) {
		amt_40_p().amt(value);
	}

	/**
	 * Month 41 年月４１.<p>
	 *
	 */
	public MCNumber col_41() {
		return amt_41_p().amt();
	}

	/**
	 * Month 41 年月４１.<p>
	 *
	 */
	public void col_41(MCNumber value) {
		amt_41_p().amt(value);
	}

	/**
	 * Month 41 年月４１.<p>
	 *
	 */
	public void col_41(int value) {
		amt_41_p().amt(value);
	}

	/**
	 * Month 41 年月４１.<p>
	 *
	 */
	public void col_41(long value) {
		amt_41_p().amt(value);
	}

	/**
	 * Month 41 年月４１.<p>
	 *
	 */
	public void col_41(float value) {
		amt_41_p().amt(value);
	}

	/**
	 * Month 41 年月４１.<p>
	 *
	 */
	public void col_41(double value) {
		amt_41_p().amt(value);
	}

	/**
	 * Month 42 年月４２.<p>
	 *
	 */
	public MCNumber col_42() {
		return amt_42_p().amt();
	}

	/**
	 * Month 42 年月４２.<p>
	 *
	 */
	public void col_42(MCNumber value) {
		amt_42_p().amt(value);
	}

	/**
	 * Month 42 年月４２.<p>
	 *
	 */
	public void col_42(int value) {
		amt_42_p().amt(value);
	}

	/**
	 * Month 42 年月４２.<p>
	 *
	 */
	public void col_42(long value) {
		amt_42_p().amt(value);
	}

	/**
	 * Month 42 年月４２.<p>
	 *
	 */
	public void col_42(float value) {
		amt_42_p().amt(value);
	}

	/**
	 * Month 42 年月４２.<p>
	 *
	 */
	public void col_42(double value) {
		amt_42_p().amt(value);
	}

	/**
	 * Month 43 年月４３.<p>
	 *
	 */
	public MCNumber col_43() {
		return amt_43_p().amt();
	}

	/**
	 * Month 43 年月４３.<p>
	 *
	 */
	public void col_43(MCNumber value) {
		amt_43_p().amt(value);
	}

	/**
	 * Month 43 年月４３.<p>
	 *
	 */
	public void col_43(int value) {
		amt_43_p().amt(value);
	}

	/**
	 * Month 43 年月４３.<p>
	 *
	 */
	public void col_43(long value) {
		amt_43_p().amt(value);
	}

	/**
	 * Month 43 年月４３.<p>
	 *
	 */
	public void col_43(float value) {
		amt_43_p().amt(value);
	}

	/**
	 * Month 43 年月４３.<p>
	 *
	 */
	public void col_43(double value) {
		amt_43_p().amt(value);
	}

	/**
	 * Month 44 年月４４.<p>
	 *
	 */
	public MCNumber col_44() {
		return amt_44_p().amt();
	}

	/**
	 * Month 44 年月４４.<p>
	 *
	 */
	public void col_44(MCNumber value) {
		amt_44_p().amt(value);
	}

	/**
	 * Month 44 年月４４.<p>
	 *
	 */
	public void col_44(int value) {
		amt_44_p().amt(value);
	}

	/**
	 * Month 44 年月４４.<p>
	 *
	 */
	public void col_44(long value) {
		amt_44_p().amt(value);
	}

	/**
	 * Month 44 年月４４.<p>
	 *
	 */
	public void col_44(float value) {
		amt_44_p().amt(value);
	}

	/**
	 * Month 44 年月４４.<p>
	 *
	 */
	public void col_44(double value) {
		amt_44_p().amt(value);
	}

	/**
	 * Month 45 年月４５.<p>
	 *
	 */
	public MCNumber col_45() {
		return amt_45_p().amt();
	}

	/**
	 * Month 45 年月４５.<p>
	 *
	 */
	public void col_45(MCNumber value) {
		amt_45_p().amt(value);
	}

	/**
	 * Month 45 年月４５.<p>
	 *
	 */
	public void col_45(int value) {
		amt_45_p().amt(value);
	}

	/**
	 * Month 45 年月４５.<p>
	 *
	 */
	public void col_45(long value) {
		amt_45_p().amt(value);
	}

	/**
	 * Month 45 年月４５.<p>
	 *
	 */
	public void col_45(float value) {
		amt_45_p().amt(value);
	}

	/**
	 * Month 45 年月４５.<p>
	 *
	 */
	public void col_45(double value) {
		amt_45_p().amt(value);
	}

	/**
	 * Month 46 年月４６.<p>
	 *
	 */
	public MCNumber col_46() {
		return amt_46_p().amt();
	}

	/**
	 * Month 46 年月４６.<p>
	 *
	 */
	public void col_46(MCNumber value) {
		amt_46_p().amt(value);
	}

	/**
	 * Month 46 年月４６.<p>
	 *
	 */
	public void col_46(int value) {
		amt_46_p().amt(value);
	}

	/**
	 * Month 46 年月４６.<p>
	 *
	 */
	public void col_46(long value) {
		amt_46_p().amt(value);
	}

	/**
	 * Month 46 年月４６.<p>
	 *
	 */
	public void col_46(float value) {
		amt_46_p().amt(value);
	}

	/**
	 * Month 46 年月４６.<p>
	 *
	 */
	public void col_46(double value) {
		amt_46_p().amt(value);
	}

	/**
	 * Month 47 年月４７.<p>
	 *
	 */
	public MCNumber col_47() {
		return amt_47_p().amt();
	}

	/**
	 * Month 47 年月４７.<p>
	 *
	 */
	public void col_47(MCNumber value) {
		amt_47_p().amt(value);
	}

	/**
	 * Month 47 年月４７.<p>
	 *
	 */
	public void col_47(int value) {
		amt_47_p().amt(value);
	}

	/**
	 * Month 47 年月４７.<p>
	 *
	 */
	public void col_47(long value) {
		amt_47_p().amt(value);
	}

	/**
	 * Month 47 年月４７.<p>
	 *
	 */
	public void col_47(float value) {
		amt_47_p().amt(value);
	}

	/**
	 * Month 47 年月４７.<p>
	 *
	 */
	public void col_47(double value) {
		amt_47_p().amt(value);
	}

	/**
	 * Month 48 年月４８.<p>
	 *
	 */
	public MCNumber col_48() {
		return amt_48_p().amt();
	}

	/**
	 * Month 48 年月４８.<p>
	 *
	 */
	public void col_48(MCNumber value) {
		amt_48_p().amt(value);
	}

	/**
	 * Month 48 年月４８.<p>
	 *
	 */
	public void col_48(int value) {
		amt_48_p().amt(value);
	}

	/**
	 * Month 48 年月４８.<p>
	 *
	 */
	public void col_48(long value) {
		amt_48_p().amt(value);
	}

	/**
	 * Month 48 年月４８.<p>
	 *
	 */
	public void col_48(float value) {
		amt_48_p().amt(value);
	}

	/**
	 * Month 48 年月４８.<p>
	 *
	 */
	public void col_48(double value) {
		amt_48_p().amt(value);
	}

	/**
	 * Month 49 年月４９.<p>
	 *
	 */
	public MCNumber col_49() {
		return amt_49_p().amt();
	}

	/**
	 * Month 49 年月４９.<p>
	 *
	 */
	public void col_49(MCNumber value) {
		amt_49_p().amt(value);
	}

	/**
	 * Month 49 年月４９.<p>
	 *
	 */
	public void col_49(int value) {
		amt_49_p().amt(value);
	}

	/**
	 * Month 49 年月４９.<p>
	 *
	 */
	public void col_49(long value) {
		amt_49_p().amt(value);
	}

	/**
	 * Month 49 年月４９.<p>
	 *
	 */
	public void col_49(float value) {
		amt_49_p().amt(value);
	}

	/**
	 * Month 49 年月４９.<p>
	 *
	 */
	public void col_49(double value) {
		amt_49_p().amt(value);
	}

	/**
	 * Month 50 年月５０.<p>
	 *
	 */
	public MCNumber col_50() {
		return amt_50_p().amt();
	}

	/**
	 * Month 50 年月５０.<p>
	 *
	 */
	public void col_50(MCNumber value) {
		amt_50_p().amt(value);
	}

	/**
	 * Month 50 年月５０.<p>
	 *
	 */
	public void col_50(int value) {
		amt_50_p().amt(value);
	}

	/**
	 * Month 50 年月５０.<p>
	 *
	 */
	public void col_50(long value) {
		amt_50_p().amt(value);
	}

	/**
	 * Month 50 年月５０.<p>
	 *
	 */
	public void col_50(float value) {
		amt_50_p().amt(value);
	}

	/**
	 * Month 50 年月５０.<p>
	 *
	 */
	public void col_50(double value) {
		amt_50_p().amt(value);
	}

	/**
	 * Month 51 年月５１.<p>
	 *
	 */
	public MCNumber col_51() {
		return amt_51_p().amt();
	}

	/**
	 * Month 51 年月５１.<p>
	 *
	 */
	public void col_51(MCNumber value) {
		amt_51_p().amt(value);
	}

	/**
	 * Month 51 年月５１.<p>
	 *
	 */
	public void col_51(int value) {
		amt_51_p().amt(value);
	}

	/**
	 * Month 51 年月５１.<p>
	 *
	 */
	public void col_51(long value) {
		amt_51_p().amt(value);
	}

	/**
	 * Month 51 年月５１.<p>
	 *
	 */
	public void col_51(float value) {
		amt_51_p().amt(value);
	}

	/**
	 * Month 51 年月５１.<p>
	 *
	 */
	public void col_51(double value) {
		amt_51_p().amt(value);
	}

	/**
	 * Month 52 年月５２.<p>
	 *
	 */
	public MCNumber col_52() {
		return amt_52_p().amt();
	}

	/**
	 * Month 52 年月５２.<p>
	 *
	 */
	public void col_52(MCNumber value) {
		amt_52_p().amt(value);
	}

	/**
	 * Month 52 年月５２.<p>
	 *
	 */
	public void col_52(int value) {
		amt_52_p().amt(value);
	}

	/**
	 * Month 52 年月５２.<p>
	 *
	 */
	public void col_52(long value) {
		amt_52_p().amt(value);
	}

	/**
	 * Month 52 年月５２.<p>
	 *
	 */
	public void col_52(float value) {
		amt_52_p().amt(value);
	}

	/**
	 * Month 52 年月５２.<p>
	 *
	 */
	public void col_52(double value) {
		amt_52_p().amt(value);
	}

	/**
	 * Month 53 年月５３.<p>
	 *
	 */
	public MCNumber col_53() {
		return amt_53_p().amt();
	}

	/**
	 * Month 53 年月５３.<p>
	 *
	 */
	public void col_53(MCNumber value) {
		amt_53_p().amt(value);
	}

	/**
	 * Month 53 年月５３.<p>
	 *
	 */
	public void col_53(int value) {
		amt_53_p().amt(value);
	}

	/**
	 * Month 53 年月５３.<p>
	 *
	 */
	public void col_53(long value) {
		amt_53_p().amt(value);
	}

	/**
	 * Month 53 年月５３.<p>
	 *
	 */
	public void col_53(float value) {
		amt_53_p().amt(value);
	}

	/**
	 * Month 53 年月５３.<p>
	 *
	 */
	public void col_53(double value) {
		amt_53_p().amt(value);
	}

	/**
	 * Month 54 年月５４.<p>
	 *
	 */
	public MCNumber col_54() {
		return amt_54_p().amt();
	}

	/**
	 * Month 54 年月５４.<p>
	 *
	 */
	public void col_54(MCNumber value) {
		amt_54_p().amt(value);
	}

	/**
	 * Month 54 年月５４.<p>
	 *
	 */
	public void col_54(int value) {
		amt_54_p().amt(value);
	}

	/**
	 * Month 54 年月５４.<p>
	 *
	 */
	public void col_54(long value) {
		amt_54_p().amt(value);
	}

	/**
	 * Month 54 年月５４.<p>
	 *
	 */
	public void col_54(float value) {
		amt_54_p().amt(value);
	}

	/**
	 * Month 54 年月５４.<p>
	 *
	 */
	public void col_54(double value) {
		amt_54_p().amt(value);
	}

	/**
	 * Month 55 年月５５.<p>
	 *
	 */
	public MCNumber col_55() {
		return amt_55_p().amt();
	}

	/**
	 * Month 55 年月５５.<p>
	 *
	 */
	public void col_55(MCNumber value) {
		amt_55_p().amt(value);
	}

	/**
	 * Month 55 年月５５.<p>
	 *
	 */
	public void col_55(int value) {
		amt_55_p().amt(value);
	}

	/**
	 * Month 55 年月５５.<p>
	 *
	 */
	public void col_55(long value) {
		amt_55_p().amt(value);
	}

	/**
	 * Month 55 年月５５.<p>
	 *
	 */
	public void col_55(float value) {
		amt_55_p().amt(value);
	}

	/**
	 * Month 55 年月５５.<p>
	 *
	 */
	public void col_55(double value) {
		amt_55_p().amt(value);
	}

	/**
	 * Month 56 年月５６.<p>
	 *
	 */
	public MCNumber col_56() {
		return amt_56_p().amt();
	}

	/**
	 * Month 56 年月５６.<p>
	 *
	 */
	public void col_56(MCNumber value) {
		amt_56_p().amt(value);
	}

	/**
	 * Month 56 年月５６.<p>
	 *
	 */
	public void col_56(int value) {
		amt_56_p().amt(value);
	}

	/**
	 * Month 56 年月５６.<p>
	 *
	 */
	public void col_56(long value) {
		amt_56_p().amt(value);
	}

	/**
	 * Month 56 年月５６.<p>
	 *
	 */
	public void col_56(float value) {
		amt_56_p().amt(value);
	}

	/**
	 * Month 56 年月５６.<p>
	 *
	 */
	public void col_56(double value) {
		amt_56_p().amt(value);
	}

	/**
	 * Month 57 年月５７.<p>
	 *
	 */
	public MCNumber col_57() {
		return amt_57_p().amt();
	}

	/**
	 * Month 57 年月５７.<p>
	 *
	 */
	public void col_57(MCNumber value) {
		amt_57_p().amt(value);
	}

	/**
	 * Month 57 年月５７.<p>
	 *
	 */
	public void col_57(int value) {
		amt_57_p().amt(value);
	}

	/**
	 * Month 57 年月５７.<p>
	 *
	 */
	public void col_57(long value) {
		amt_57_p().amt(value);
	}

	/**
	 * Month 57 年月５７.<p>
	 *
	 */
	public void col_57(float value) {
		amt_57_p().amt(value);
	}

	/**
	 * Month 57 年月５７.<p>
	 *
	 */
	public void col_57(double value) {
		amt_57_p().amt(value);
	}

	/**
	 * Month 58 年月５８.<p>
	 *
	 */
	public MCNumber col_58() {
		return amt_58_p().amt();
	}

	/**
	 * Month 58 年月５８.<p>
	 *
	 */
	public void col_58(MCNumber value) {
		amt_58_p().amt(value);
	}

	/**
	 * Month 58 年月５８.<p>
	 *
	 */
	public void col_58(int value) {
		amt_58_p().amt(value);
	}

	/**
	 * Month 58 年月５８.<p>
	 *
	 */
	public void col_58(long value) {
		amt_58_p().amt(value);
	}

	/**
	 * Month 58 年月５８.<p>
	 *
	 */
	public void col_58(float value) {
		amt_58_p().amt(value);
	}

	/**
	 * Month 58 年月５８.<p>
	 *
	 */
	public void col_58(double value) {
		amt_58_p().amt(value);
	}

	/**
	 * Month 59 年月５９.<p>
	 *
	 */
	public MCNumber col_59() {
		return amt_59_p().amt();
	}

	/**
	 * Month 59 年月５９.<p>
	 *
	 */
	public void col_59(MCNumber value) {
		amt_59_p().amt(value);
	}

	/**
	 * Month 59 年月５９.<p>
	 *
	 */
	public void col_59(int value) {
		amt_59_p().amt(value);
	}

	/**
	 * Month 59 年月５９.<p>
	 *
	 */
	public void col_59(long value) {
		amt_59_p().amt(value);
	}

	/**
	 * Month 59 年月５９.<p>
	 *
	 */
	public void col_59(float value) {
		amt_59_p().amt(value);
	}

	/**
	 * Month 59 年月５９.<p>
	 *
	 */
	public void col_59(double value) {
		amt_59_p().amt(value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public MCNumber ttl() {
		return ttl_amt_p().amt();
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(MCNumber value) {
		ttl_amt_p().amt(value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(int value) {
		ttl_amt_p().amt(value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(long value) {
		ttl_amt_p().amt(value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(float value) {
		ttl_amt_p().amt(value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(double value) {
		ttl_amt_p().amt(value);
	}

}

