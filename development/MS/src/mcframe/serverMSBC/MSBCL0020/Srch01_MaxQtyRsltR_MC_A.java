package mcframe.serverMSBC.MSBCL0020;

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
 * ブロック"Srch01_MaxQtyRslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_MaxQtyRsltR_MC_A extends MCConstRow {

	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public static final String $mps_grp_cd = "mps_grp_cd";
	/**
	 * qty_00 qty_00.<p>
	 *
	 */
	public static final String $qty_00 = "qty_00";
	/**
	 * qty_01 qty_01.<p>
	 *
	 */
	public static final String $qty_01 = "qty_01";
	/**
	 * qty_02 qty_02.<p>
	 *
	 */
	public static final String $qty_02 = "qty_02";
	/**
	 * qty_03 qty_03.<p>
	 *
	 */
	public static final String $qty_03 = "qty_03";
	/**
	 * qty_04 qty_04.<p>
	 *
	 */
	public static final String $qty_04 = "qty_04";
	/**
	 * qty_05 qty_05.<p>
	 *
	 */
	public static final String $qty_05 = "qty_05";
	/**
	 * qty_06 qty_06.<p>
	 *
	 */
	public static final String $qty_06 = "qty_06";
	/**
	 * qty_07 qty_07.<p>
	 *
	 */
	public static final String $qty_07 = "qty_07";
	/**
	 * qty_08 qty_08.<p>
	 *
	 */
	public static final String $qty_08 = "qty_08";
	/**
	 * qty_09 qty_09.<p>
	 *
	 */
	public static final String $qty_09 = "qty_09";
	/**
	 * qty_10 qty_10.<p>
	 *
	 */
	public static final String $qty_10 = "qty_10";
	/**
	 * qty_11 qty_11.<p>
	 *
	 */
	public static final String $qty_11 = "qty_11";
	/**
	 * qty_12 qty_12.<p>
	 *
	 */
	public static final String $qty_12 = "qty_12";
	/**
	 * qty_13 qty_13.<p>
	 *
	 */
	public static final String $qty_13 = "qty_13";
	/**
	 * qty_14 qty_14.<p>
	 *
	 */
	public static final String $qty_14 = "qty_14";
	/**
	 * qty_15 qty_15.<p>
	 *
	 */
	public static final String $qty_15 = "qty_15";
	/**
	 * qty_16 qty_16.<p>
	 *
	 */
	public static final String $qty_16 = "qty_16";
	/**
	 * qty_17 qty_17.<p>
	 *
	 */
	public static final String $qty_17 = "qty_17";
	/**
	 * qty_18 qty_18.<p>
	 *
	 */
	public static final String $qty_18 = "qty_18";
	/**
	 * qty_19 qty_19.<p>
	 *
	 */
	public static final String $qty_19 = "qty_19";
	/**
	 * qty_20 qty_20.<p>
	 *
	 */
	public static final String $qty_20 = "qty_20";
	/**
	 * qty_21 qty_21.<p>
	 *
	 */
	public static final String $qty_21 = "qty_21";
	/**
	 * qty_22 qty_22.<p>
	 *
	 */
	public static final String $qty_22 = "qty_22";
	/**
	 * qty_23 qty_23.<p>
	 *
	 */
	public static final String $qty_23 = "qty_23";
	/**
	 * qty_24 qty_24.<p>
	 *
	 */
	public static final String $qty_24 = "qty_24";
	/**
	 * qty_25 qty_25.<p>
	 *
	 */
	public static final String $qty_25 = "qty_25";
	/**
	 * qty_26 qty_26.<p>
	 *
	 */
	public static final String $qty_26 = "qty_26";
	/**
	 * qty_27 qty_27.<p>
	 *
	 */
	public static final String $qty_27 = "qty_27";
	/**
	 * qty_28 qty_28.<p>
	 *
	 */
	public static final String $qty_28 = "qty_28";
	/**
	 * qty_29 qty_29.<p>
	 *
	 */
	public static final String $qty_29 = "qty_29";
	/**
	 * qty_30 qty_30.<p>
	 *
	 */
	public static final String $qty_30 = "qty_30";
	/**
	 * qty_31 qty_31.<p>
	 *
	 */
	public static final String $qty_31 = "qty_31";
	/**
	 * qty_32 qty_32.<p>
	 *
	 */
	public static final String $qty_32 = "qty_32";
	/**
	 * qty_33 qty_33.<p>
	 *
	 */
	public static final String $qty_33 = "qty_33";
	/**
	 * qty_34 qty_34.<p>
	 *
	 */
	public static final String $qty_34 = "qty_34";
	/**
	 * qty_35 qty_35.<p>
	 *
	 */
	public static final String $qty_35 = "qty_35";
	/**
	 * qty_36 qty_36.<p>
	 *
	 */
	public static final String $qty_36 = "qty_36";
	/**
	 * qty_37 qty_37.<p>
	 *
	 */
	public static final String $qty_37 = "qty_37";
	/**
	 * qty_38 qty_38.<p>
	 *
	 */
	public static final String $qty_38 = "qty_38";
	/**
	 * qty_39 qty_39.<p>
	 *
	 */
	public static final String $qty_39 = "qty_39";
	/**
	 * qty_40 qty_40.<p>
	 *
	 */
	public static final String $qty_40 = "qty_40";
	/**
	 * qty_41 qty_41.<p>
	 *
	 */
	public static final String $qty_41 = "qty_41";
	/**
	 * qty_42 qty_42.<p>
	 *
	 */
	public static final String $qty_42 = "qty_42";
	/**
	 * qty_43 qty_43.<p>
	 *
	 */
	public static final String $qty_43 = "qty_43";
	/**
	 * qty_44 qty_44.<p>
	 *
	 */
	public static final String $qty_44 = "qty_44";
	/**
	 * qty_45 qty_45.<p>
	 *
	 */
	public static final String $qty_45 = "qty_45";
	/**
	 * qty_46 qty_46.<p>
	 *
	 */
	public static final String $qty_46 = "qty_46";
	/**
	 * qty_47 qty_47.<p>
	 *
	 */
	public static final String $qty_47 = "qty_47";
	/**
	 * qty_48 qty_48.<p>
	 *
	 */
	public static final String $qty_48 = "qty_48";
	/**
	 * qty_49 qty_49.<p>
	 *
	 */
	public static final String $qty_49 = "qty_49";
	/**
	 * qty_50 qty_50.<p>
	 *
	 */
	public static final String $qty_50 = "qty_50";
	/**
	 * qty_51 qty_51.<p>
	 *
	 */
	public static final String $qty_51 = "qty_51";
	/**
	 * qty_52 qty_52.<p>
	 *
	 */
	public static final String $qty_52 = "qty_52";
	/**
	 * qty_53 qty_53.<p>
	 *
	 */
	public static final String $qty_53 = "qty_53";
	/**
	 * qty_54 qty_54.<p>
	 *
	 */
	public static final String $qty_54 = "qty_54";
	/**
	 * qty_55 qty_55.<p>
	 *
	 */
	public static final String $qty_55 = "qty_55";
	/**
	 * qty_56 qty_56.<p>
	 *
	 */
	public static final String $qty_56 = "qty_56";
	/**
	 * qty_57 qty_57.<p>
	 *
	 */
	public static final String $qty_57 = "qty_57";
	/**
	 * qty_58 qty_58.<p>
	 *
	 */
	public static final String $qty_58 = "qty_58";
	/**
	 * qty_59 qty_59.<p>
	 *
	 */
	public static final String $qty_59 = "qty_59";
	/**
	 * qty_60 qty_60.<p>
	 *
	 */
	public static final String $qty_60 = "qty_60";
	/**
	 * qty_61 qty_61.<p>
	 *
	 */
	public static final String $qty_61 = "qty_61";
	/**
	 * qty_62 qty_62.<p>
	 *
	 */
	public static final String $qty_62 = "qty_62";
	/**
	 * qty_63 qty_63.<p>
	 *
	 */
	public static final String $qty_63 = "qty_63";
	/**
	 * qty_64 qty_64.<p>
	 *
	 */
	public static final String $qty_64 = "qty_64";
	/**
	 * qty_65 qty_65.<p>
	 *
	 */
	public static final String $qty_65 = "qty_65";
	/**
	 * qty_66 qty_66.<p>
	 *
	 */
	public static final String $qty_66 = "qty_66";
	/**
	 * qty_67 qty_67.<p>
	 *
	 */
	public static final String $qty_67 = "qty_67";
	/**
	 * qty_68 qty_68.<p>
	 *
	 */
	public static final String $qty_68 = "qty_68";
	/**
	 * qty_69 qty_69.<p>
	 *
	 */
	public static final String $qty_69 = "qty_69";
	/**
	 * qty_70 qty_70.<p>
	 *
	 */
	public static final String $qty_70 = "qty_70";
	/**
	 * qty_71 qty_71.<p>
	 *
	 */
	public static final String $qty_71 = "qty_71";
	/**
	 * qty_72 qty_72.<p>
	 *
	 */
	public static final String $qty_72 = "qty_72";
	/**
	 * qty_73 qty_73.<p>
	 *
	 */
	public static final String $qty_73 = "qty_73";
	/**
	 * qty_74 qty_74.<p>
	 *
	 */
	public static final String $qty_74 = "qty_74";
	/**
	 * qty_75 qty_75.<p>
	 *
	 */
	public static final String $qty_75 = "qty_75";
	/**
	 * qty_76 qty_76.<p>
	 *
	 */
	public static final String $qty_76 = "qty_76";
	/**
	 * qty_77 qty_77.<p>
	 *
	 */
	public static final String $qty_77 = "qty_77";
	/**
	 * qty_78 qty_78.<p>
	 *
	 */
	public static final String $qty_78 = "qty_78";
	/**
	 * qty_79 qty_79.<p>
	 *
	 */
	public static final String $qty_79 = "qty_79";
	/**
	 * qty_80 qty_80.<p>
	 *
	 */
	public static final String $qty_80 = "qty_80";
	/**
	 * qty_81 qty_81.<p>
	 *
	 */
	public static final String $qty_81 = "qty_81";
	/**
	 * qty_82 qty_82.<p>
	 *
	 */
	public static final String $qty_82 = "qty_82";
	/**
	 * qty_83 qty_83.<p>
	 *
	 */
	public static final String $qty_83 = "qty_83";
	/**
	 * qty_84 qty_84.<p>
	 *
	 */
	public static final String $qty_84 = "qty_84";
	/**
	 * qty_85 qty_85.<p>
	 *
	 */
	public static final String $qty_85 = "qty_85";
	/**
	 * qty_86 qty_86.<p>
	 *
	 */
	public static final String $qty_86 = "qty_86";
	/**
	 * qty_87 qty_87.<p>
	 *
	 */
	public static final String $qty_87 = "qty_87";
	/**
	 * qty_88 qty_88.<p>
	 *
	 */
	public static final String $qty_88 = "qty_88";
	/**
	 * qty_89 qty_89.<p>
	 *
	 */
	public static final String $qty_89 = "qty_89";
	/**
	 * qty_90 qty_90.<p>
	 *
	 */
	public static final String $qty_90 = "qty_90";
	/**
	 * qty_91 qty_91.<p>
	 *
	 */
	public static final String $qty_91 = "qty_91";
	/**
	 * qty_92 qty_92.<p>
	 *
	 */
	public static final String $qty_92 = "qty_92";
	/**
	 * qty_93 qty_93.<p>
	 *
	 */
	public static final String $qty_93 = "qty_93";


	public static final MCMeta mps_grp_cd_META = createCommonMeta($mps_grp_cd, mcframe.commonMA.meta.MA_META.MPS_GRP_CD);
	public static final MCMeta qty_00_META = createCommonMeta($qty_00, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_01_META = createCommonMeta($qty_01, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_02_META = createCommonMeta($qty_02, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_03_META = createCommonMeta($qty_03, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_04_META = createCommonMeta($qty_04, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_05_META = createCommonMeta($qty_05, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_06_META = createCommonMeta($qty_06, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_07_META = createCommonMeta($qty_07, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_08_META = createCommonMeta($qty_08, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_09_META = createCommonMeta($qty_09, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_10_META = createCommonMeta($qty_10, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_11_META = createCommonMeta($qty_11, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_12_META = createCommonMeta($qty_12, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_13_META = createCommonMeta($qty_13, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_14_META = createCommonMeta($qty_14, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_15_META = createCommonMeta($qty_15, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_16_META = createCommonMeta($qty_16, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_17_META = createCommonMeta($qty_17, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_18_META = createCommonMeta($qty_18, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_19_META = createCommonMeta($qty_19, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_20_META = createCommonMeta($qty_20, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_21_META = createCommonMeta($qty_21, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_22_META = createCommonMeta($qty_22, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_23_META = createCommonMeta($qty_23, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_24_META = createCommonMeta($qty_24, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_25_META = createCommonMeta($qty_25, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_26_META = createCommonMeta($qty_26, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_27_META = createCommonMeta($qty_27, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_28_META = createCommonMeta($qty_28, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_29_META = createCommonMeta($qty_29, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_30_META = createCommonMeta($qty_30, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_31_META = createCommonMeta($qty_31, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_32_META = createCommonMeta($qty_32, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_33_META = createCommonMeta($qty_33, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_34_META = createCommonMeta($qty_34, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_35_META = createCommonMeta($qty_35, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_36_META = createCommonMeta($qty_36, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_37_META = createCommonMeta($qty_37, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_38_META = createCommonMeta($qty_38, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_39_META = createCommonMeta($qty_39, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_40_META = createCommonMeta($qty_40, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_41_META = createCommonMeta($qty_41, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_42_META = createCommonMeta($qty_42, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_43_META = createCommonMeta($qty_43, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_44_META = createCommonMeta($qty_44, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_45_META = createCommonMeta($qty_45, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_46_META = createCommonMeta($qty_46, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_47_META = createCommonMeta($qty_47, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_48_META = createCommonMeta($qty_48, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_49_META = createCommonMeta($qty_49, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_50_META = createCommonMeta($qty_50, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_51_META = createCommonMeta($qty_51, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_52_META = createCommonMeta($qty_52, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_53_META = createCommonMeta($qty_53, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_54_META = createCommonMeta($qty_54, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_55_META = createCommonMeta($qty_55, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_56_META = createCommonMeta($qty_56, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_57_META = createCommonMeta($qty_57, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_58_META = createCommonMeta($qty_58, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_59_META = createCommonMeta($qty_59, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_60_META = createCommonMeta($qty_60, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_61_META = createCommonMeta($qty_61, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_62_META = createCommonMeta($qty_62, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_63_META = createCommonMeta($qty_63, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_64_META = createCommonMeta($qty_64, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_65_META = createCommonMeta($qty_65, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_66_META = createCommonMeta($qty_66, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_67_META = createCommonMeta($qty_67, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_68_META = createCommonMeta($qty_68, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_69_META = createCommonMeta($qty_69, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_70_META = createCommonMeta($qty_70, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_71_META = createCommonMeta($qty_71, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_72_META = createCommonMeta($qty_72, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_73_META = createCommonMeta($qty_73, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_74_META = createCommonMeta($qty_74, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_75_META = createCommonMeta($qty_75, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_76_META = createCommonMeta($qty_76, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_77_META = createCommonMeta($qty_77, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_78_META = createCommonMeta($qty_78, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_79_META = createCommonMeta($qty_79, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_80_META = createCommonMeta($qty_80, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_81_META = createCommonMeta($qty_81, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_82_META = createCommonMeta($qty_82, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_83_META = createCommonMeta($qty_83, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_84_META = createCommonMeta($qty_84, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_85_META = createCommonMeta($qty_85, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_86_META = createCommonMeta($qty_86, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_87_META = createCommonMeta($qty_87, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_88_META = createCommonMeta($qty_88, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_89_META = createCommonMeta($qty_89, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_90_META = createCommonMeta($qty_90, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_91_META = createCommonMeta($qty_91, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_92_META = createCommonMeta($qty_92, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_93_META = createCommonMeta($qty_93, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<Srch01_MaxQtyRsltR> constMetas = new ConstMetaList<Srch01_MaxQtyRsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mps_grp_cd_META,
			qty_00_META,
			qty_01_META,
			qty_02_META,
			qty_03_META,
			qty_04_META,
			qty_05_META,
			qty_06_META,
			qty_07_META,
			qty_08_META,
			qty_09_META,
			qty_10_META,
			qty_11_META,
			qty_12_META,
			qty_13_META,
			qty_14_META,
			qty_15_META,
			qty_16_META,
			qty_17_META,
			qty_18_META,
			qty_19_META,
			qty_20_META,
			qty_21_META,
			qty_22_META,
			qty_23_META,
			qty_24_META,
			qty_25_META,
			qty_26_META,
			qty_27_META,
			qty_28_META,
			qty_29_META,
			qty_30_META,
			qty_31_META,
			qty_32_META,
			qty_33_META,
			qty_34_META,
			qty_35_META,
			qty_36_META,
			qty_37_META,
			qty_38_META,
			qty_39_META,
			qty_40_META,
			qty_41_META,
			qty_42_META,
			qty_43_META,
			qty_44_META,
			qty_45_META,
			qty_46_META,
			qty_47_META,
			qty_48_META,
			qty_49_META,
			qty_50_META,
			qty_51_META,
			qty_52_META,
			qty_53_META,
			qty_54_META,
			qty_55_META,
			qty_56_META,
			qty_57_META,
			qty_58_META,
			qty_59_META,
			qty_60_META,
			qty_61_META,
			qty_62_META,
			qty_63_META,
			qty_64_META,
			qty_65_META,
			qty_66_META,
			qty_67_META,
			qty_68_META,
			qty_69_META,
			qty_70_META,
			qty_71_META,
			qty_72_META,
			qty_73_META,
			qty_74_META,
			qty_75_META,
			qty_76_META,
			qty_77_META,
			qty_78_META,
			qty_79_META,
			qty_80_META,
			qty_81_META,
			qty_82_META,
			qty_83_META,
			qty_84_META,
			qty_85_META,
			qty_86_META,
			qty_87_META,
			qty_88_META,
			qty_89_META,
			qty_90_META,
			qty_91_META,
			qty_92_META,
			qty_93_META
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
	protected Srch01_MaxQtyRsltR_MC_A(ConstMetaList<? extends Srch01_MaxQtyRsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_MaxQtyRsltR clone() {
		return (Srch01_MaxQtyRsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_MaxQtyRsltR createInstance() {
		return (Srch01_MaxQtyRsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_MaxQtyRsltR getValues(String... names) {
		return (Srch01_MaxQtyRsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public String mps_grp_cd() {
		return getConstString(offset + 0, $mps_grp_cd);
	}

	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public void mps_grp_cd(String value) {
		setConstString(offset + 0, $mps_grp_cd, value);
	}


	/**
	 * qty_00 qty_00.<p>
	 *
	 */
	public MCNumber qty_00() {
		return getConstNumber(offset + 1, $qty_00);
	}

	/**
	 * qty_00 qty_00.<p>
	 *
	 */
	public void qty_00(MCNumber value) {
		setConstNumber(offset + 1, $qty_00, value);
	}

	/**
	 * qty_00 qty_00.<p>
	 *
	 */
	public void qty_00(int value) {
		setConstNumber(offset + 1, $qty_00, value);
	}

	/**
	 * qty_00 qty_00.<p>
	 *
	 */
	public void qty_00(long value) {
		setConstNumber(offset + 1, $qty_00, value);
	}

	/**
	 * qty_00 qty_00.<p>
	 *
	 */
	public void qty_00(float value) {
		setConstNumber(offset + 1, $qty_00, value);
	}

	/**
	 * qty_00 qty_00.<p>
	 *
	 */
	public void qty_00(double value) {
		setConstNumber(offset + 1, $qty_00, value);
	}


	/**
	 * qty_01 qty_01.<p>
	 *
	 */
	public MCNumber qty_01() {
		return getConstNumber(offset + 2, $qty_01);
	}

	/**
	 * qty_01 qty_01.<p>
	 *
	 */
	public void qty_01(MCNumber value) {
		setConstNumber(offset + 2, $qty_01, value);
	}

	/**
	 * qty_01 qty_01.<p>
	 *
	 */
	public void qty_01(int value) {
		setConstNumber(offset + 2, $qty_01, value);
	}

	/**
	 * qty_01 qty_01.<p>
	 *
	 */
	public void qty_01(long value) {
		setConstNumber(offset + 2, $qty_01, value);
	}

	/**
	 * qty_01 qty_01.<p>
	 *
	 */
	public void qty_01(float value) {
		setConstNumber(offset + 2, $qty_01, value);
	}

	/**
	 * qty_01 qty_01.<p>
	 *
	 */
	public void qty_01(double value) {
		setConstNumber(offset + 2, $qty_01, value);
	}


	/**
	 * qty_02 qty_02.<p>
	 *
	 */
	public MCNumber qty_02() {
		return getConstNumber(offset + 3, $qty_02);
	}

	/**
	 * qty_02 qty_02.<p>
	 *
	 */
	public void qty_02(MCNumber value) {
		setConstNumber(offset + 3, $qty_02, value);
	}

	/**
	 * qty_02 qty_02.<p>
	 *
	 */
	public void qty_02(int value) {
		setConstNumber(offset + 3, $qty_02, value);
	}

	/**
	 * qty_02 qty_02.<p>
	 *
	 */
	public void qty_02(long value) {
		setConstNumber(offset + 3, $qty_02, value);
	}

	/**
	 * qty_02 qty_02.<p>
	 *
	 */
	public void qty_02(float value) {
		setConstNumber(offset + 3, $qty_02, value);
	}

	/**
	 * qty_02 qty_02.<p>
	 *
	 */
	public void qty_02(double value) {
		setConstNumber(offset + 3, $qty_02, value);
	}


	/**
	 * qty_03 qty_03.<p>
	 *
	 */
	public MCNumber qty_03() {
		return getConstNumber(offset + 4, $qty_03);
	}

	/**
	 * qty_03 qty_03.<p>
	 *
	 */
	public void qty_03(MCNumber value) {
		setConstNumber(offset + 4, $qty_03, value);
	}

	/**
	 * qty_03 qty_03.<p>
	 *
	 */
	public void qty_03(int value) {
		setConstNumber(offset + 4, $qty_03, value);
	}

	/**
	 * qty_03 qty_03.<p>
	 *
	 */
	public void qty_03(long value) {
		setConstNumber(offset + 4, $qty_03, value);
	}

	/**
	 * qty_03 qty_03.<p>
	 *
	 */
	public void qty_03(float value) {
		setConstNumber(offset + 4, $qty_03, value);
	}

	/**
	 * qty_03 qty_03.<p>
	 *
	 */
	public void qty_03(double value) {
		setConstNumber(offset + 4, $qty_03, value);
	}


	/**
	 * qty_04 qty_04.<p>
	 *
	 */
	public MCNumber qty_04() {
		return getConstNumber(offset + 5, $qty_04);
	}

	/**
	 * qty_04 qty_04.<p>
	 *
	 */
	public void qty_04(MCNumber value) {
		setConstNumber(offset + 5, $qty_04, value);
	}

	/**
	 * qty_04 qty_04.<p>
	 *
	 */
	public void qty_04(int value) {
		setConstNumber(offset + 5, $qty_04, value);
	}

	/**
	 * qty_04 qty_04.<p>
	 *
	 */
	public void qty_04(long value) {
		setConstNumber(offset + 5, $qty_04, value);
	}

	/**
	 * qty_04 qty_04.<p>
	 *
	 */
	public void qty_04(float value) {
		setConstNumber(offset + 5, $qty_04, value);
	}

	/**
	 * qty_04 qty_04.<p>
	 *
	 */
	public void qty_04(double value) {
		setConstNumber(offset + 5, $qty_04, value);
	}


	/**
	 * qty_05 qty_05.<p>
	 *
	 */
	public MCNumber qty_05() {
		return getConstNumber(offset + 6, $qty_05);
	}

	/**
	 * qty_05 qty_05.<p>
	 *
	 */
	public void qty_05(MCNumber value) {
		setConstNumber(offset + 6, $qty_05, value);
	}

	/**
	 * qty_05 qty_05.<p>
	 *
	 */
	public void qty_05(int value) {
		setConstNumber(offset + 6, $qty_05, value);
	}

	/**
	 * qty_05 qty_05.<p>
	 *
	 */
	public void qty_05(long value) {
		setConstNumber(offset + 6, $qty_05, value);
	}

	/**
	 * qty_05 qty_05.<p>
	 *
	 */
	public void qty_05(float value) {
		setConstNumber(offset + 6, $qty_05, value);
	}

	/**
	 * qty_05 qty_05.<p>
	 *
	 */
	public void qty_05(double value) {
		setConstNumber(offset + 6, $qty_05, value);
	}


	/**
	 * qty_06 qty_06.<p>
	 *
	 */
	public MCNumber qty_06() {
		return getConstNumber(offset + 7, $qty_06);
	}

	/**
	 * qty_06 qty_06.<p>
	 *
	 */
	public void qty_06(MCNumber value) {
		setConstNumber(offset + 7, $qty_06, value);
	}

	/**
	 * qty_06 qty_06.<p>
	 *
	 */
	public void qty_06(int value) {
		setConstNumber(offset + 7, $qty_06, value);
	}

	/**
	 * qty_06 qty_06.<p>
	 *
	 */
	public void qty_06(long value) {
		setConstNumber(offset + 7, $qty_06, value);
	}

	/**
	 * qty_06 qty_06.<p>
	 *
	 */
	public void qty_06(float value) {
		setConstNumber(offset + 7, $qty_06, value);
	}

	/**
	 * qty_06 qty_06.<p>
	 *
	 */
	public void qty_06(double value) {
		setConstNumber(offset + 7, $qty_06, value);
	}


	/**
	 * qty_07 qty_07.<p>
	 *
	 */
	public MCNumber qty_07() {
		return getConstNumber(offset + 8, $qty_07);
	}

	/**
	 * qty_07 qty_07.<p>
	 *
	 */
	public void qty_07(MCNumber value) {
		setConstNumber(offset + 8, $qty_07, value);
	}

	/**
	 * qty_07 qty_07.<p>
	 *
	 */
	public void qty_07(int value) {
		setConstNumber(offset + 8, $qty_07, value);
	}

	/**
	 * qty_07 qty_07.<p>
	 *
	 */
	public void qty_07(long value) {
		setConstNumber(offset + 8, $qty_07, value);
	}

	/**
	 * qty_07 qty_07.<p>
	 *
	 */
	public void qty_07(float value) {
		setConstNumber(offset + 8, $qty_07, value);
	}

	/**
	 * qty_07 qty_07.<p>
	 *
	 */
	public void qty_07(double value) {
		setConstNumber(offset + 8, $qty_07, value);
	}


	/**
	 * qty_08 qty_08.<p>
	 *
	 */
	public MCNumber qty_08() {
		return getConstNumber(offset + 9, $qty_08);
	}

	/**
	 * qty_08 qty_08.<p>
	 *
	 */
	public void qty_08(MCNumber value) {
		setConstNumber(offset + 9, $qty_08, value);
	}

	/**
	 * qty_08 qty_08.<p>
	 *
	 */
	public void qty_08(int value) {
		setConstNumber(offset + 9, $qty_08, value);
	}

	/**
	 * qty_08 qty_08.<p>
	 *
	 */
	public void qty_08(long value) {
		setConstNumber(offset + 9, $qty_08, value);
	}

	/**
	 * qty_08 qty_08.<p>
	 *
	 */
	public void qty_08(float value) {
		setConstNumber(offset + 9, $qty_08, value);
	}

	/**
	 * qty_08 qty_08.<p>
	 *
	 */
	public void qty_08(double value) {
		setConstNumber(offset + 9, $qty_08, value);
	}


	/**
	 * qty_09 qty_09.<p>
	 *
	 */
	public MCNumber qty_09() {
		return getConstNumber(offset + 10, $qty_09);
	}

	/**
	 * qty_09 qty_09.<p>
	 *
	 */
	public void qty_09(MCNumber value) {
		setConstNumber(offset + 10, $qty_09, value);
	}

	/**
	 * qty_09 qty_09.<p>
	 *
	 */
	public void qty_09(int value) {
		setConstNumber(offset + 10, $qty_09, value);
	}

	/**
	 * qty_09 qty_09.<p>
	 *
	 */
	public void qty_09(long value) {
		setConstNumber(offset + 10, $qty_09, value);
	}

	/**
	 * qty_09 qty_09.<p>
	 *
	 */
	public void qty_09(float value) {
		setConstNumber(offset + 10, $qty_09, value);
	}

	/**
	 * qty_09 qty_09.<p>
	 *
	 */
	public void qty_09(double value) {
		setConstNumber(offset + 10, $qty_09, value);
	}


	/**
	 * qty_10 qty_10.<p>
	 *
	 */
	public MCNumber qty_10() {
		return getConstNumber(offset + 11, $qty_10);
	}

	/**
	 * qty_10 qty_10.<p>
	 *
	 */
	public void qty_10(MCNumber value) {
		setConstNumber(offset + 11, $qty_10, value);
	}

	/**
	 * qty_10 qty_10.<p>
	 *
	 */
	public void qty_10(int value) {
		setConstNumber(offset + 11, $qty_10, value);
	}

	/**
	 * qty_10 qty_10.<p>
	 *
	 */
	public void qty_10(long value) {
		setConstNumber(offset + 11, $qty_10, value);
	}

	/**
	 * qty_10 qty_10.<p>
	 *
	 */
	public void qty_10(float value) {
		setConstNumber(offset + 11, $qty_10, value);
	}

	/**
	 * qty_10 qty_10.<p>
	 *
	 */
	public void qty_10(double value) {
		setConstNumber(offset + 11, $qty_10, value);
	}


	/**
	 * qty_11 qty_11.<p>
	 *
	 */
	public MCNumber qty_11() {
		return getConstNumber(offset + 12, $qty_11);
	}

	/**
	 * qty_11 qty_11.<p>
	 *
	 */
	public void qty_11(MCNumber value) {
		setConstNumber(offset + 12, $qty_11, value);
	}

	/**
	 * qty_11 qty_11.<p>
	 *
	 */
	public void qty_11(int value) {
		setConstNumber(offset + 12, $qty_11, value);
	}

	/**
	 * qty_11 qty_11.<p>
	 *
	 */
	public void qty_11(long value) {
		setConstNumber(offset + 12, $qty_11, value);
	}

	/**
	 * qty_11 qty_11.<p>
	 *
	 */
	public void qty_11(float value) {
		setConstNumber(offset + 12, $qty_11, value);
	}

	/**
	 * qty_11 qty_11.<p>
	 *
	 */
	public void qty_11(double value) {
		setConstNumber(offset + 12, $qty_11, value);
	}


	/**
	 * qty_12 qty_12.<p>
	 *
	 */
	public MCNumber qty_12() {
		return getConstNumber(offset + 13, $qty_12);
	}

	/**
	 * qty_12 qty_12.<p>
	 *
	 */
	public void qty_12(MCNumber value) {
		setConstNumber(offset + 13, $qty_12, value);
	}

	/**
	 * qty_12 qty_12.<p>
	 *
	 */
	public void qty_12(int value) {
		setConstNumber(offset + 13, $qty_12, value);
	}

	/**
	 * qty_12 qty_12.<p>
	 *
	 */
	public void qty_12(long value) {
		setConstNumber(offset + 13, $qty_12, value);
	}

	/**
	 * qty_12 qty_12.<p>
	 *
	 */
	public void qty_12(float value) {
		setConstNumber(offset + 13, $qty_12, value);
	}

	/**
	 * qty_12 qty_12.<p>
	 *
	 */
	public void qty_12(double value) {
		setConstNumber(offset + 13, $qty_12, value);
	}


	/**
	 * qty_13 qty_13.<p>
	 *
	 */
	public MCNumber qty_13() {
		return getConstNumber(offset + 14, $qty_13);
	}

	/**
	 * qty_13 qty_13.<p>
	 *
	 */
	public void qty_13(MCNumber value) {
		setConstNumber(offset + 14, $qty_13, value);
	}

	/**
	 * qty_13 qty_13.<p>
	 *
	 */
	public void qty_13(int value) {
		setConstNumber(offset + 14, $qty_13, value);
	}

	/**
	 * qty_13 qty_13.<p>
	 *
	 */
	public void qty_13(long value) {
		setConstNumber(offset + 14, $qty_13, value);
	}

	/**
	 * qty_13 qty_13.<p>
	 *
	 */
	public void qty_13(float value) {
		setConstNumber(offset + 14, $qty_13, value);
	}

	/**
	 * qty_13 qty_13.<p>
	 *
	 */
	public void qty_13(double value) {
		setConstNumber(offset + 14, $qty_13, value);
	}


	/**
	 * qty_14 qty_14.<p>
	 *
	 */
	public MCNumber qty_14() {
		return getConstNumber(offset + 15, $qty_14);
	}

	/**
	 * qty_14 qty_14.<p>
	 *
	 */
	public void qty_14(MCNumber value) {
		setConstNumber(offset + 15, $qty_14, value);
	}

	/**
	 * qty_14 qty_14.<p>
	 *
	 */
	public void qty_14(int value) {
		setConstNumber(offset + 15, $qty_14, value);
	}

	/**
	 * qty_14 qty_14.<p>
	 *
	 */
	public void qty_14(long value) {
		setConstNumber(offset + 15, $qty_14, value);
	}

	/**
	 * qty_14 qty_14.<p>
	 *
	 */
	public void qty_14(float value) {
		setConstNumber(offset + 15, $qty_14, value);
	}

	/**
	 * qty_14 qty_14.<p>
	 *
	 */
	public void qty_14(double value) {
		setConstNumber(offset + 15, $qty_14, value);
	}


	/**
	 * qty_15 qty_15.<p>
	 *
	 */
	public MCNumber qty_15() {
		return getConstNumber(offset + 16, $qty_15);
	}

	/**
	 * qty_15 qty_15.<p>
	 *
	 */
	public void qty_15(MCNumber value) {
		setConstNumber(offset + 16, $qty_15, value);
	}

	/**
	 * qty_15 qty_15.<p>
	 *
	 */
	public void qty_15(int value) {
		setConstNumber(offset + 16, $qty_15, value);
	}

	/**
	 * qty_15 qty_15.<p>
	 *
	 */
	public void qty_15(long value) {
		setConstNumber(offset + 16, $qty_15, value);
	}

	/**
	 * qty_15 qty_15.<p>
	 *
	 */
	public void qty_15(float value) {
		setConstNumber(offset + 16, $qty_15, value);
	}

	/**
	 * qty_15 qty_15.<p>
	 *
	 */
	public void qty_15(double value) {
		setConstNumber(offset + 16, $qty_15, value);
	}


	/**
	 * qty_16 qty_16.<p>
	 *
	 */
	public MCNumber qty_16() {
		return getConstNumber(offset + 17, $qty_16);
	}

	/**
	 * qty_16 qty_16.<p>
	 *
	 */
	public void qty_16(MCNumber value) {
		setConstNumber(offset + 17, $qty_16, value);
	}

	/**
	 * qty_16 qty_16.<p>
	 *
	 */
	public void qty_16(int value) {
		setConstNumber(offset + 17, $qty_16, value);
	}

	/**
	 * qty_16 qty_16.<p>
	 *
	 */
	public void qty_16(long value) {
		setConstNumber(offset + 17, $qty_16, value);
	}

	/**
	 * qty_16 qty_16.<p>
	 *
	 */
	public void qty_16(float value) {
		setConstNumber(offset + 17, $qty_16, value);
	}

	/**
	 * qty_16 qty_16.<p>
	 *
	 */
	public void qty_16(double value) {
		setConstNumber(offset + 17, $qty_16, value);
	}


	/**
	 * qty_17 qty_17.<p>
	 *
	 */
	public MCNumber qty_17() {
		return getConstNumber(offset + 18, $qty_17);
	}

	/**
	 * qty_17 qty_17.<p>
	 *
	 */
	public void qty_17(MCNumber value) {
		setConstNumber(offset + 18, $qty_17, value);
	}

	/**
	 * qty_17 qty_17.<p>
	 *
	 */
	public void qty_17(int value) {
		setConstNumber(offset + 18, $qty_17, value);
	}

	/**
	 * qty_17 qty_17.<p>
	 *
	 */
	public void qty_17(long value) {
		setConstNumber(offset + 18, $qty_17, value);
	}

	/**
	 * qty_17 qty_17.<p>
	 *
	 */
	public void qty_17(float value) {
		setConstNumber(offset + 18, $qty_17, value);
	}

	/**
	 * qty_17 qty_17.<p>
	 *
	 */
	public void qty_17(double value) {
		setConstNumber(offset + 18, $qty_17, value);
	}


	/**
	 * qty_18 qty_18.<p>
	 *
	 */
	public MCNumber qty_18() {
		return getConstNumber(offset + 19, $qty_18);
	}

	/**
	 * qty_18 qty_18.<p>
	 *
	 */
	public void qty_18(MCNumber value) {
		setConstNumber(offset + 19, $qty_18, value);
	}

	/**
	 * qty_18 qty_18.<p>
	 *
	 */
	public void qty_18(int value) {
		setConstNumber(offset + 19, $qty_18, value);
	}

	/**
	 * qty_18 qty_18.<p>
	 *
	 */
	public void qty_18(long value) {
		setConstNumber(offset + 19, $qty_18, value);
	}

	/**
	 * qty_18 qty_18.<p>
	 *
	 */
	public void qty_18(float value) {
		setConstNumber(offset + 19, $qty_18, value);
	}

	/**
	 * qty_18 qty_18.<p>
	 *
	 */
	public void qty_18(double value) {
		setConstNumber(offset + 19, $qty_18, value);
	}


	/**
	 * qty_19 qty_19.<p>
	 *
	 */
	public MCNumber qty_19() {
		return getConstNumber(offset + 20, $qty_19);
	}

	/**
	 * qty_19 qty_19.<p>
	 *
	 */
	public void qty_19(MCNumber value) {
		setConstNumber(offset + 20, $qty_19, value);
	}

	/**
	 * qty_19 qty_19.<p>
	 *
	 */
	public void qty_19(int value) {
		setConstNumber(offset + 20, $qty_19, value);
	}

	/**
	 * qty_19 qty_19.<p>
	 *
	 */
	public void qty_19(long value) {
		setConstNumber(offset + 20, $qty_19, value);
	}

	/**
	 * qty_19 qty_19.<p>
	 *
	 */
	public void qty_19(float value) {
		setConstNumber(offset + 20, $qty_19, value);
	}

	/**
	 * qty_19 qty_19.<p>
	 *
	 */
	public void qty_19(double value) {
		setConstNumber(offset + 20, $qty_19, value);
	}


	/**
	 * qty_20 qty_20.<p>
	 *
	 */
	public MCNumber qty_20() {
		return getConstNumber(offset + 21, $qty_20);
	}

	/**
	 * qty_20 qty_20.<p>
	 *
	 */
	public void qty_20(MCNumber value) {
		setConstNumber(offset + 21, $qty_20, value);
	}

	/**
	 * qty_20 qty_20.<p>
	 *
	 */
	public void qty_20(int value) {
		setConstNumber(offset + 21, $qty_20, value);
	}

	/**
	 * qty_20 qty_20.<p>
	 *
	 */
	public void qty_20(long value) {
		setConstNumber(offset + 21, $qty_20, value);
	}

	/**
	 * qty_20 qty_20.<p>
	 *
	 */
	public void qty_20(float value) {
		setConstNumber(offset + 21, $qty_20, value);
	}

	/**
	 * qty_20 qty_20.<p>
	 *
	 */
	public void qty_20(double value) {
		setConstNumber(offset + 21, $qty_20, value);
	}


	/**
	 * qty_21 qty_21.<p>
	 *
	 */
	public MCNumber qty_21() {
		return getConstNumber(offset + 22, $qty_21);
	}

	/**
	 * qty_21 qty_21.<p>
	 *
	 */
	public void qty_21(MCNumber value) {
		setConstNumber(offset + 22, $qty_21, value);
	}

	/**
	 * qty_21 qty_21.<p>
	 *
	 */
	public void qty_21(int value) {
		setConstNumber(offset + 22, $qty_21, value);
	}

	/**
	 * qty_21 qty_21.<p>
	 *
	 */
	public void qty_21(long value) {
		setConstNumber(offset + 22, $qty_21, value);
	}

	/**
	 * qty_21 qty_21.<p>
	 *
	 */
	public void qty_21(float value) {
		setConstNumber(offset + 22, $qty_21, value);
	}

	/**
	 * qty_21 qty_21.<p>
	 *
	 */
	public void qty_21(double value) {
		setConstNumber(offset + 22, $qty_21, value);
	}


	/**
	 * qty_22 qty_22.<p>
	 *
	 */
	public MCNumber qty_22() {
		return getConstNumber(offset + 23, $qty_22);
	}

	/**
	 * qty_22 qty_22.<p>
	 *
	 */
	public void qty_22(MCNumber value) {
		setConstNumber(offset + 23, $qty_22, value);
	}

	/**
	 * qty_22 qty_22.<p>
	 *
	 */
	public void qty_22(int value) {
		setConstNumber(offset + 23, $qty_22, value);
	}

	/**
	 * qty_22 qty_22.<p>
	 *
	 */
	public void qty_22(long value) {
		setConstNumber(offset + 23, $qty_22, value);
	}

	/**
	 * qty_22 qty_22.<p>
	 *
	 */
	public void qty_22(float value) {
		setConstNumber(offset + 23, $qty_22, value);
	}

	/**
	 * qty_22 qty_22.<p>
	 *
	 */
	public void qty_22(double value) {
		setConstNumber(offset + 23, $qty_22, value);
	}


	/**
	 * qty_23 qty_23.<p>
	 *
	 */
	public MCNumber qty_23() {
		return getConstNumber(offset + 24, $qty_23);
	}

	/**
	 * qty_23 qty_23.<p>
	 *
	 */
	public void qty_23(MCNumber value) {
		setConstNumber(offset + 24, $qty_23, value);
	}

	/**
	 * qty_23 qty_23.<p>
	 *
	 */
	public void qty_23(int value) {
		setConstNumber(offset + 24, $qty_23, value);
	}

	/**
	 * qty_23 qty_23.<p>
	 *
	 */
	public void qty_23(long value) {
		setConstNumber(offset + 24, $qty_23, value);
	}

	/**
	 * qty_23 qty_23.<p>
	 *
	 */
	public void qty_23(float value) {
		setConstNumber(offset + 24, $qty_23, value);
	}

	/**
	 * qty_23 qty_23.<p>
	 *
	 */
	public void qty_23(double value) {
		setConstNumber(offset + 24, $qty_23, value);
	}


	/**
	 * qty_24 qty_24.<p>
	 *
	 */
	public MCNumber qty_24() {
		return getConstNumber(offset + 25, $qty_24);
	}

	/**
	 * qty_24 qty_24.<p>
	 *
	 */
	public void qty_24(MCNumber value) {
		setConstNumber(offset + 25, $qty_24, value);
	}

	/**
	 * qty_24 qty_24.<p>
	 *
	 */
	public void qty_24(int value) {
		setConstNumber(offset + 25, $qty_24, value);
	}

	/**
	 * qty_24 qty_24.<p>
	 *
	 */
	public void qty_24(long value) {
		setConstNumber(offset + 25, $qty_24, value);
	}

	/**
	 * qty_24 qty_24.<p>
	 *
	 */
	public void qty_24(float value) {
		setConstNumber(offset + 25, $qty_24, value);
	}

	/**
	 * qty_24 qty_24.<p>
	 *
	 */
	public void qty_24(double value) {
		setConstNumber(offset + 25, $qty_24, value);
	}


	/**
	 * qty_25 qty_25.<p>
	 *
	 */
	public MCNumber qty_25() {
		return getConstNumber(offset + 26, $qty_25);
	}

	/**
	 * qty_25 qty_25.<p>
	 *
	 */
	public void qty_25(MCNumber value) {
		setConstNumber(offset + 26, $qty_25, value);
	}

	/**
	 * qty_25 qty_25.<p>
	 *
	 */
	public void qty_25(int value) {
		setConstNumber(offset + 26, $qty_25, value);
	}

	/**
	 * qty_25 qty_25.<p>
	 *
	 */
	public void qty_25(long value) {
		setConstNumber(offset + 26, $qty_25, value);
	}

	/**
	 * qty_25 qty_25.<p>
	 *
	 */
	public void qty_25(float value) {
		setConstNumber(offset + 26, $qty_25, value);
	}

	/**
	 * qty_25 qty_25.<p>
	 *
	 */
	public void qty_25(double value) {
		setConstNumber(offset + 26, $qty_25, value);
	}


	/**
	 * qty_26 qty_26.<p>
	 *
	 */
	public MCNumber qty_26() {
		return getConstNumber(offset + 27, $qty_26);
	}

	/**
	 * qty_26 qty_26.<p>
	 *
	 */
	public void qty_26(MCNumber value) {
		setConstNumber(offset + 27, $qty_26, value);
	}

	/**
	 * qty_26 qty_26.<p>
	 *
	 */
	public void qty_26(int value) {
		setConstNumber(offset + 27, $qty_26, value);
	}

	/**
	 * qty_26 qty_26.<p>
	 *
	 */
	public void qty_26(long value) {
		setConstNumber(offset + 27, $qty_26, value);
	}

	/**
	 * qty_26 qty_26.<p>
	 *
	 */
	public void qty_26(float value) {
		setConstNumber(offset + 27, $qty_26, value);
	}

	/**
	 * qty_26 qty_26.<p>
	 *
	 */
	public void qty_26(double value) {
		setConstNumber(offset + 27, $qty_26, value);
	}


	/**
	 * qty_27 qty_27.<p>
	 *
	 */
	public MCNumber qty_27() {
		return getConstNumber(offset + 28, $qty_27);
	}

	/**
	 * qty_27 qty_27.<p>
	 *
	 */
	public void qty_27(MCNumber value) {
		setConstNumber(offset + 28, $qty_27, value);
	}

	/**
	 * qty_27 qty_27.<p>
	 *
	 */
	public void qty_27(int value) {
		setConstNumber(offset + 28, $qty_27, value);
	}

	/**
	 * qty_27 qty_27.<p>
	 *
	 */
	public void qty_27(long value) {
		setConstNumber(offset + 28, $qty_27, value);
	}

	/**
	 * qty_27 qty_27.<p>
	 *
	 */
	public void qty_27(float value) {
		setConstNumber(offset + 28, $qty_27, value);
	}

	/**
	 * qty_27 qty_27.<p>
	 *
	 */
	public void qty_27(double value) {
		setConstNumber(offset + 28, $qty_27, value);
	}


	/**
	 * qty_28 qty_28.<p>
	 *
	 */
	public MCNumber qty_28() {
		return getConstNumber(offset + 29, $qty_28);
	}

	/**
	 * qty_28 qty_28.<p>
	 *
	 */
	public void qty_28(MCNumber value) {
		setConstNumber(offset + 29, $qty_28, value);
	}

	/**
	 * qty_28 qty_28.<p>
	 *
	 */
	public void qty_28(int value) {
		setConstNumber(offset + 29, $qty_28, value);
	}

	/**
	 * qty_28 qty_28.<p>
	 *
	 */
	public void qty_28(long value) {
		setConstNumber(offset + 29, $qty_28, value);
	}

	/**
	 * qty_28 qty_28.<p>
	 *
	 */
	public void qty_28(float value) {
		setConstNumber(offset + 29, $qty_28, value);
	}

	/**
	 * qty_28 qty_28.<p>
	 *
	 */
	public void qty_28(double value) {
		setConstNumber(offset + 29, $qty_28, value);
	}


	/**
	 * qty_29 qty_29.<p>
	 *
	 */
	public MCNumber qty_29() {
		return getConstNumber(offset + 30, $qty_29);
	}

	/**
	 * qty_29 qty_29.<p>
	 *
	 */
	public void qty_29(MCNumber value) {
		setConstNumber(offset + 30, $qty_29, value);
	}

	/**
	 * qty_29 qty_29.<p>
	 *
	 */
	public void qty_29(int value) {
		setConstNumber(offset + 30, $qty_29, value);
	}

	/**
	 * qty_29 qty_29.<p>
	 *
	 */
	public void qty_29(long value) {
		setConstNumber(offset + 30, $qty_29, value);
	}

	/**
	 * qty_29 qty_29.<p>
	 *
	 */
	public void qty_29(float value) {
		setConstNumber(offset + 30, $qty_29, value);
	}

	/**
	 * qty_29 qty_29.<p>
	 *
	 */
	public void qty_29(double value) {
		setConstNumber(offset + 30, $qty_29, value);
	}


	/**
	 * qty_30 qty_30.<p>
	 *
	 */
	public MCNumber qty_30() {
		return getConstNumber(offset + 31, $qty_30);
	}

	/**
	 * qty_30 qty_30.<p>
	 *
	 */
	public void qty_30(MCNumber value) {
		setConstNumber(offset + 31, $qty_30, value);
	}

	/**
	 * qty_30 qty_30.<p>
	 *
	 */
	public void qty_30(int value) {
		setConstNumber(offset + 31, $qty_30, value);
	}

	/**
	 * qty_30 qty_30.<p>
	 *
	 */
	public void qty_30(long value) {
		setConstNumber(offset + 31, $qty_30, value);
	}

	/**
	 * qty_30 qty_30.<p>
	 *
	 */
	public void qty_30(float value) {
		setConstNumber(offset + 31, $qty_30, value);
	}

	/**
	 * qty_30 qty_30.<p>
	 *
	 */
	public void qty_30(double value) {
		setConstNumber(offset + 31, $qty_30, value);
	}


	/**
	 * qty_31 qty_31.<p>
	 *
	 */
	public MCNumber qty_31() {
		return getConstNumber(offset + 32, $qty_31);
	}

	/**
	 * qty_31 qty_31.<p>
	 *
	 */
	public void qty_31(MCNumber value) {
		setConstNumber(offset + 32, $qty_31, value);
	}

	/**
	 * qty_31 qty_31.<p>
	 *
	 */
	public void qty_31(int value) {
		setConstNumber(offset + 32, $qty_31, value);
	}

	/**
	 * qty_31 qty_31.<p>
	 *
	 */
	public void qty_31(long value) {
		setConstNumber(offset + 32, $qty_31, value);
	}

	/**
	 * qty_31 qty_31.<p>
	 *
	 */
	public void qty_31(float value) {
		setConstNumber(offset + 32, $qty_31, value);
	}

	/**
	 * qty_31 qty_31.<p>
	 *
	 */
	public void qty_31(double value) {
		setConstNumber(offset + 32, $qty_31, value);
	}


	/**
	 * qty_32 qty_32.<p>
	 *
	 */
	public MCNumber qty_32() {
		return getConstNumber(offset + 33, $qty_32);
	}

	/**
	 * qty_32 qty_32.<p>
	 *
	 */
	public void qty_32(MCNumber value) {
		setConstNumber(offset + 33, $qty_32, value);
	}

	/**
	 * qty_32 qty_32.<p>
	 *
	 */
	public void qty_32(int value) {
		setConstNumber(offset + 33, $qty_32, value);
	}

	/**
	 * qty_32 qty_32.<p>
	 *
	 */
	public void qty_32(long value) {
		setConstNumber(offset + 33, $qty_32, value);
	}

	/**
	 * qty_32 qty_32.<p>
	 *
	 */
	public void qty_32(float value) {
		setConstNumber(offset + 33, $qty_32, value);
	}

	/**
	 * qty_32 qty_32.<p>
	 *
	 */
	public void qty_32(double value) {
		setConstNumber(offset + 33, $qty_32, value);
	}


	/**
	 * qty_33 qty_33.<p>
	 *
	 */
	public MCNumber qty_33() {
		return getConstNumber(offset + 34, $qty_33);
	}

	/**
	 * qty_33 qty_33.<p>
	 *
	 */
	public void qty_33(MCNumber value) {
		setConstNumber(offset + 34, $qty_33, value);
	}

	/**
	 * qty_33 qty_33.<p>
	 *
	 */
	public void qty_33(int value) {
		setConstNumber(offset + 34, $qty_33, value);
	}

	/**
	 * qty_33 qty_33.<p>
	 *
	 */
	public void qty_33(long value) {
		setConstNumber(offset + 34, $qty_33, value);
	}

	/**
	 * qty_33 qty_33.<p>
	 *
	 */
	public void qty_33(float value) {
		setConstNumber(offset + 34, $qty_33, value);
	}

	/**
	 * qty_33 qty_33.<p>
	 *
	 */
	public void qty_33(double value) {
		setConstNumber(offset + 34, $qty_33, value);
	}


	/**
	 * qty_34 qty_34.<p>
	 *
	 */
	public MCNumber qty_34() {
		return getConstNumber(offset + 35, $qty_34);
	}

	/**
	 * qty_34 qty_34.<p>
	 *
	 */
	public void qty_34(MCNumber value) {
		setConstNumber(offset + 35, $qty_34, value);
	}

	/**
	 * qty_34 qty_34.<p>
	 *
	 */
	public void qty_34(int value) {
		setConstNumber(offset + 35, $qty_34, value);
	}

	/**
	 * qty_34 qty_34.<p>
	 *
	 */
	public void qty_34(long value) {
		setConstNumber(offset + 35, $qty_34, value);
	}

	/**
	 * qty_34 qty_34.<p>
	 *
	 */
	public void qty_34(float value) {
		setConstNumber(offset + 35, $qty_34, value);
	}

	/**
	 * qty_34 qty_34.<p>
	 *
	 */
	public void qty_34(double value) {
		setConstNumber(offset + 35, $qty_34, value);
	}


	/**
	 * qty_35 qty_35.<p>
	 *
	 */
	public MCNumber qty_35() {
		return getConstNumber(offset + 36, $qty_35);
	}

	/**
	 * qty_35 qty_35.<p>
	 *
	 */
	public void qty_35(MCNumber value) {
		setConstNumber(offset + 36, $qty_35, value);
	}

	/**
	 * qty_35 qty_35.<p>
	 *
	 */
	public void qty_35(int value) {
		setConstNumber(offset + 36, $qty_35, value);
	}

	/**
	 * qty_35 qty_35.<p>
	 *
	 */
	public void qty_35(long value) {
		setConstNumber(offset + 36, $qty_35, value);
	}

	/**
	 * qty_35 qty_35.<p>
	 *
	 */
	public void qty_35(float value) {
		setConstNumber(offset + 36, $qty_35, value);
	}

	/**
	 * qty_35 qty_35.<p>
	 *
	 */
	public void qty_35(double value) {
		setConstNumber(offset + 36, $qty_35, value);
	}


	/**
	 * qty_36 qty_36.<p>
	 *
	 */
	public MCNumber qty_36() {
		return getConstNumber(offset + 37, $qty_36);
	}

	/**
	 * qty_36 qty_36.<p>
	 *
	 */
	public void qty_36(MCNumber value) {
		setConstNumber(offset + 37, $qty_36, value);
	}

	/**
	 * qty_36 qty_36.<p>
	 *
	 */
	public void qty_36(int value) {
		setConstNumber(offset + 37, $qty_36, value);
	}

	/**
	 * qty_36 qty_36.<p>
	 *
	 */
	public void qty_36(long value) {
		setConstNumber(offset + 37, $qty_36, value);
	}

	/**
	 * qty_36 qty_36.<p>
	 *
	 */
	public void qty_36(float value) {
		setConstNumber(offset + 37, $qty_36, value);
	}

	/**
	 * qty_36 qty_36.<p>
	 *
	 */
	public void qty_36(double value) {
		setConstNumber(offset + 37, $qty_36, value);
	}


	/**
	 * qty_37 qty_37.<p>
	 *
	 */
	public MCNumber qty_37() {
		return getConstNumber(offset + 38, $qty_37);
	}

	/**
	 * qty_37 qty_37.<p>
	 *
	 */
	public void qty_37(MCNumber value) {
		setConstNumber(offset + 38, $qty_37, value);
	}

	/**
	 * qty_37 qty_37.<p>
	 *
	 */
	public void qty_37(int value) {
		setConstNumber(offset + 38, $qty_37, value);
	}

	/**
	 * qty_37 qty_37.<p>
	 *
	 */
	public void qty_37(long value) {
		setConstNumber(offset + 38, $qty_37, value);
	}

	/**
	 * qty_37 qty_37.<p>
	 *
	 */
	public void qty_37(float value) {
		setConstNumber(offset + 38, $qty_37, value);
	}

	/**
	 * qty_37 qty_37.<p>
	 *
	 */
	public void qty_37(double value) {
		setConstNumber(offset + 38, $qty_37, value);
	}


	/**
	 * qty_38 qty_38.<p>
	 *
	 */
	public MCNumber qty_38() {
		return getConstNumber(offset + 39, $qty_38);
	}

	/**
	 * qty_38 qty_38.<p>
	 *
	 */
	public void qty_38(MCNumber value) {
		setConstNumber(offset + 39, $qty_38, value);
	}

	/**
	 * qty_38 qty_38.<p>
	 *
	 */
	public void qty_38(int value) {
		setConstNumber(offset + 39, $qty_38, value);
	}

	/**
	 * qty_38 qty_38.<p>
	 *
	 */
	public void qty_38(long value) {
		setConstNumber(offset + 39, $qty_38, value);
	}

	/**
	 * qty_38 qty_38.<p>
	 *
	 */
	public void qty_38(float value) {
		setConstNumber(offset + 39, $qty_38, value);
	}

	/**
	 * qty_38 qty_38.<p>
	 *
	 */
	public void qty_38(double value) {
		setConstNumber(offset + 39, $qty_38, value);
	}


	/**
	 * qty_39 qty_39.<p>
	 *
	 */
	public MCNumber qty_39() {
		return getConstNumber(offset + 40, $qty_39);
	}

	/**
	 * qty_39 qty_39.<p>
	 *
	 */
	public void qty_39(MCNumber value) {
		setConstNumber(offset + 40, $qty_39, value);
	}

	/**
	 * qty_39 qty_39.<p>
	 *
	 */
	public void qty_39(int value) {
		setConstNumber(offset + 40, $qty_39, value);
	}

	/**
	 * qty_39 qty_39.<p>
	 *
	 */
	public void qty_39(long value) {
		setConstNumber(offset + 40, $qty_39, value);
	}

	/**
	 * qty_39 qty_39.<p>
	 *
	 */
	public void qty_39(float value) {
		setConstNumber(offset + 40, $qty_39, value);
	}

	/**
	 * qty_39 qty_39.<p>
	 *
	 */
	public void qty_39(double value) {
		setConstNumber(offset + 40, $qty_39, value);
	}


	/**
	 * qty_40 qty_40.<p>
	 *
	 */
	public MCNumber qty_40() {
		return getConstNumber(offset + 41, $qty_40);
	}

	/**
	 * qty_40 qty_40.<p>
	 *
	 */
	public void qty_40(MCNumber value) {
		setConstNumber(offset + 41, $qty_40, value);
	}

	/**
	 * qty_40 qty_40.<p>
	 *
	 */
	public void qty_40(int value) {
		setConstNumber(offset + 41, $qty_40, value);
	}

	/**
	 * qty_40 qty_40.<p>
	 *
	 */
	public void qty_40(long value) {
		setConstNumber(offset + 41, $qty_40, value);
	}

	/**
	 * qty_40 qty_40.<p>
	 *
	 */
	public void qty_40(float value) {
		setConstNumber(offset + 41, $qty_40, value);
	}

	/**
	 * qty_40 qty_40.<p>
	 *
	 */
	public void qty_40(double value) {
		setConstNumber(offset + 41, $qty_40, value);
	}


	/**
	 * qty_41 qty_41.<p>
	 *
	 */
	public MCNumber qty_41() {
		return getConstNumber(offset + 42, $qty_41);
	}

	/**
	 * qty_41 qty_41.<p>
	 *
	 */
	public void qty_41(MCNumber value) {
		setConstNumber(offset + 42, $qty_41, value);
	}

	/**
	 * qty_41 qty_41.<p>
	 *
	 */
	public void qty_41(int value) {
		setConstNumber(offset + 42, $qty_41, value);
	}

	/**
	 * qty_41 qty_41.<p>
	 *
	 */
	public void qty_41(long value) {
		setConstNumber(offset + 42, $qty_41, value);
	}

	/**
	 * qty_41 qty_41.<p>
	 *
	 */
	public void qty_41(float value) {
		setConstNumber(offset + 42, $qty_41, value);
	}

	/**
	 * qty_41 qty_41.<p>
	 *
	 */
	public void qty_41(double value) {
		setConstNumber(offset + 42, $qty_41, value);
	}


	/**
	 * qty_42 qty_42.<p>
	 *
	 */
	public MCNumber qty_42() {
		return getConstNumber(offset + 43, $qty_42);
	}

	/**
	 * qty_42 qty_42.<p>
	 *
	 */
	public void qty_42(MCNumber value) {
		setConstNumber(offset + 43, $qty_42, value);
	}

	/**
	 * qty_42 qty_42.<p>
	 *
	 */
	public void qty_42(int value) {
		setConstNumber(offset + 43, $qty_42, value);
	}

	/**
	 * qty_42 qty_42.<p>
	 *
	 */
	public void qty_42(long value) {
		setConstNumber(offset + 43, $qty_42, value);
	}

	/**
	 * qty_42 qty_42.<p>
	 *
	 */
	public void qty_42(float value) {
		setConstNumber(offset + 43, $qty_42, value);
	}

	/**
	 * qty_42 qty_42.<p>
	 *
	 */
	public void qty_42(double value) {
		setConstNumber(offset + 43, $qty_42, value);
	}


	/**
	 * qty_43 qty_43.<p>
	 *
	 */
	public MCNumber qty_43() {
		return getConstNumber(offset + 44, $qty_43);
	}

	/**
	 * qty_43 qty_43.<p>
	 *
	 */
	public void qty_43(MCNumber value) {
		setConstNumber(offset + 44, $qty_43, value);
	}

	/**
	 * qty_43 qty_43.<p>
	 *
	 */
	public void qty_43(int value) {
		setConstNumber(offset + 44, $qty_43, value);
	}

	/**
	 * qty_43 qty_43.<p>
	 *
	 */
	public void qty_43(long value) {
		setConstNumber(offset + 44, $qty_43, value);
	}

	/**
	 * qty_43 qty_43.<p>
	 *
	 */
	public void qty_43(float value) {
		setConstNumber(offset + 44, $qty_43, value);
	}

	/**
	 * qty_43 qty_43.<p>
	 *
	 */
	public void qty_43(double value) {
		setConstNumber(offset + 44, $qty_43, value);
	}


	/**
	 * qty_44 qty_44.<p>
	 *
	 */
	public MCNumber qty_44() {
		return getConstNumber(offset + 45, $qty_44);
	}

	/**
	 * qty_44 qty_44.<p>
	 *
	 */
	public void qty_44(MCNumber value) {
		setConstNumber(offset + 45, $qty_44, value);
	}

	/**
	 * qty_44 qty_44.<p>
	 *
	 */
	public void qty_44(int value) {
		setConstNumber(offset + 45, $qty_44, value);
	}

	/**
	 * qty_44 qty_44.<p>
	 *
	 */
	public void qty_44(long value) {
		setConstNumber(offset + 45, $qty_44, value);
	}

	/**
	 * qty_44 qty_44.<p>
	 *
	 */
	public void qty_44(float value) {
		setConstNumber(offset + 45, $qty_44, value);
	}

	/**
	 * qty_44 qty_44.<p>
	 *
	 */
	public void qty_44(double value) {
		setConstNumber(offset + 45, $qty_44, value);
	}


	/**
	 * qty_45 qty_45.<p>
	 *
	 */
	public MCNumber qty_45() {
		return getConstNumber(offset + 46, $qty_45);
	}

	/**
	 * qty_45 qty_45.<p>
	 *
	 */
	public void qty_45(MCNumber value) {
		setConstNumber(offset + 46, $qty_45, value);
	}

	/**
	 * qty_45 qty_45.<p>
	 *
	 */
	public void qty_45(int value) {
		setConstNumber(offset + 46, $qty_45, value);
	}

	/**
	 * qty_45 qty_45.<p>
	 *
	 */
	public void qty_45(long value) {
		setConstNumber(offset + 46, $qty_45, value);
	}

	/**
	 * qty_45 qty_45.<p>
	 *
	 */
	public void qty_45(float value) {
		setConstNumber(offset + 46, $qty_45, value);
	}

	/**
	 * qty_45 qty_45.<p>
	 *
	 */
	public void qty_45(double value) {
		setConstNumber(offset + 46, $qty_45, value);
	}


	/**
	 * qty_46 qty_46.<p>
	 *
	 */
	public MCNumber qty_46() {
		return getConstNumber(offset + 47, $qty_46);
	}

	/**
	 * qty_46 qty_46.<p>
	 *
	 */
	public void qty_46(MCNumber value) {
		setConstNumber(offset + 47, $qty_46, value);
	}

	/**
	 * qty_46 qty_46.<p>
	 *
	 */
	public void qty_46(int value) {
		setConstNumber(offset + 47, $qty_46, value);
	}

	/**
	 * qty_46 qty_46.<p>
	 *
	 */
	public void qty_46(long value) {
		setConstNumber(offset + 47, $qty_46, value);
	}

	/**
	 * qty_46 qty_46.<p>
	 *
	 */
	public void qty_46(float value) {
		setConstNumber(offset + 47, $qty_46, value);
	}

	/**
	 * qty_46 qty_46.<p>
	 *
	 */
	public void qty_46(double value) {
		setConstNumber(offset + 47, $qty_46, value);
	}


	/**
	 * qty_47 qty_47.<p>
	 *
	 */
	public MCNumber qty_47() {
		return getConstNumber(offset + 48, $qty_47);
	}

	/**
	 * qty_47 qty_47.<p>
	 *
	 */
	public void qty_47(MCNumber value) {
		setConstNumber(offset + 48, $qty_47, value);
	}

	/**
	 * qty_47 qty_47.<p>
	 *
	 */
	public void qty_47(int value) {
		setConstNumber(offset + 48, $qty_47, value);
	}

	/**
	 * qty_47 qty_47.<p>
	 *
	 */
	public void qty_47(long value) {
		setConstNumber(offset + 48, $qty_47, value);
	}

	/**
	 * qty_47 qty_47.<p>
	 *
	 */
	public void qty_47(float value) {
		setConstNumber(offset + 48, $qty_47, value);
	}

	/**
	 * qty_47 qty_47.<p>
	 *
	 */
	public void qty_47(double value) {
		setConstNumber(offset + 48, $qty_47, value);
	}


	/**
	 * qty_48 qty_48.<p>
	 *
	 */
	public MCNumber qty_48() {
		return getConstNumber(offset + 49, $qty_48);
	}

	/**
	 * qty_48 qty_48.<p>
	 *
	 */
	public void qty_48(MCNumber value) {
		setConstNumber(offset + 49, $qty_48, value);
	}

	/**
	 * qty_48 qty_48.<p>
	 *
	 */
	public void qty_48(int value) {
		setConstNumber(offset + 49, $qty_48, value);
	}

	/**
	 * qty_48 qty_48.<p>
	 *
	 */
	public void qty_48(long value) {
		setConstNumber(offset + 49, $qty_48, value);
	}

	/**
	 * qty_48 qty_48.<p>
	 *
	 */
	public void qty_48(float value) {
		setConstNumber(offset + 49, $qty_48, value);
	}

	/**
	 * qty_48 qty_48.<p>
	 *
	 */
	public void qty_48(double value) {
		setConstNumber(offset + 49, $qty_48, value);
	}


	/**
	 * qty_49 qty_49.<p>
	 *
	 */
	public MCNumber qty_49() {
		return getConstNumber(offset + 50, $qty_49);
	}

	/**
	 * qty_49 qty_49.<p>
	 *
	 */
	public void qty_49(MCNumber value) {
		setConstNumber(offset + 50, $qty_49, value);
	}

	/**
	 * qty_49 qty_49.<p>
	 *
	 */
	public void qty_49(int value) {
		setConstNumber(offset + 50, $qty_49, value);
	}

	/**
	 * qty_49 qty_49.<p>
	 *
	 */
	public void qty_49(long value) {
		setConstNumber(offset + 50, $qty_49, value);
	}

	/**
	 * qty_49 qty_49.<p>
	 *
	 */
	public void qty_49(float value) {
		setConstNumber(offset + 50, $qty_49, value);
	}

	/**
	 * qty_49 qty_49.<p>
	 *
	 */
	public void qty_49(double value) {
		setConstNumber(offset + 50, $qty_49, value);
	}


	/**
	 * qty_50 qty_50.<p>
	 *
	 */
	public MCNumber qty_50() {
		return getConstNumber(offset + 51, $qty_50);
	}

	/**
	 * qty_50 qty_50.<p>
	 *
	 */
	public void qty_50(MCNumber value) {
		setConstNumber(offset + 51, $qty_50, value);
	}

	/**
	 * qty_50 qty_50.<p>
	 *
	 */
	public void qty_50(int value) {
		setConstNumber(offset + 51, $qty_50, value);
	}

	/**
	 * qty_50 qty_50.<p>
	 *
	 */
	public void qty_50(long value) {
		setConstNumber(offset + 51, $qty_50, value);
	}

	/**
	 * qty_50 qty_50.<p>
	 *
	 */
	public void qty_50(float value) {
		setConstNumber(offset + 51, $qty_50, value);
	}

	/**
	 * qty_50 qty_50.<p>
	 *
	 */
	public void qty_50(double value) {
		setConstNumber(offset + 51, $qty_50, value);
	}


	/**
	 * qty_51 qty_51.<p>
	 *
	 */
	public MCNumber qty_51() {
		return getConstNumber(offset + 52, $qty_51);
	}

	/**
	 * qty_51 qty_51.<p>
	 *
	 */
	public void qty_51(MCNumber value) {
		setConstNumber(offset + 52, $qty_51, value);
	}

	/**
	 * qty_51 qty_51.<p>
	 *
	 */
	public void qty_51(int value) {
		setConstNumber(offset + 52, $qty_51, value);
	}

	/**
	 * qty_51 qty_51.<p>
	 *
	 */
	public void qty_51(long value) {
		setConstNumber(offset + 52, $qty_51, value);
	}

	/**
	 * qty_51 qty_51.<p>
	 *
	 */
	public void qty_51(float value) {
		setConstNumber(offset + 52, $qty_51, value);
	}

	/**
	 * qty_51 qty_51.<p>
	 *
	 */
	public void qty_51(double value) {
		setConstNumber(offset + 52, $qty_51, value);
	}


	/**
	 * qty_52 qty_52.<p>
	 *
	 */
	public MCNumber qty_52() {
		return getConstNumber(offset + 53, $qty_52);
	}

	/**
	 * qty_52 qty_52.<p>
	 *
	 */
	public void qty_52(MCNumber value) {
		setConstNumber(offset + 53, $qty_52, value);
	}

	/**
	 * qty_52 qty_52.<p>
	 *
	 */
	public void qty_52(int value) {
		setConstNumber(offset + 53, $qty_52, value);
	}

	/**
	 * qty_52 qty_52.<p>
	 *
	 */
	public void qty_52(long value) {
		setConstNumber(offset + 53, $qty_52, value);
	}

	/**
	 * qty_52 qty_52.<p>
	 *
	 */
	public void qty_52(float value) {
		setConstNumber(offset + 53, $qty_52, value);
	}

	/**
	 * qty_52 qty_52.<p>
	 *
	 */
	public void qty_52(double value) {
		setConstNumber(offset + 53, $qty_52, value);
	}


	/**
	 * qty_53 qty_53.<p>
	 *
	 */
	public MCNumber qty_53() {
		return getConstNumber(offset + 54, $qty_53);
	}

	/**
	 * qty_53 qty_53.<p>
	 *
	 */
	public void qty_53(MCNumber value) {
		setConstNumber(offset + 54, $qty_53, value);
	}

	/**
	 * qty_53 qty_53.<p>
	 *
	 */
	public void qty_53(int value) {
		setConstNumber(offset + 54, $qty_53, value);
	}

	/**
	 * qty_53 qty_53.<p>
	 *
	 */
	public void qty_53(long value) {
		setConstNumber(offset + 54, $qty_53, value);
	}

	/**
	 * qty_53 qty_53.<p>
	 *
	 */
	public void qty_53(float value) {
		setConstNumber(offset + 54, $qty_53, value);
	}

	/**
	 * qty_53 qty_53.<p>
	 *
	 */
	public void qty_53(double value) {
		setConstNumber(offset + 54, $qty_53, value);
	}


	/**
	 * qty_54 qty_54.<p>
	 *
	 */
	public MCNumber qty_54() {
		return getConstNumber(offset + 55, $qty_54);
	}

	/**
	 * qty_54 qty_54.<p>
	 *
	 */
	public void qty_54(MCNumber value) {
		setConstNumber(offset + 55, $qty_54, value);
	}

	/**
	 * qty_54 qty_54.<p>
	 *
	 */
	public void qty_54(int value) {
		setConstNumber(offset + 55, $qty_54, value);
	}

	/**
	 * qty_54 qty_54.<p>
	 *
	 */
	public void qty_54(long value) {
		setConstNumber(offset + 55, $qty_54, value);
	}

	/**
	 * qty_54 qty_54.<p>
	 *
	 */
	public void qty_54(float value) {
		setConstNumber(offset + 55, $qty_54, value);
	}

	/**
	 * qty_54 qty_54.<p>
	 *
	 */
	public void qty_54(double value) {
		setConstNumber(offset + 55, $qty_54, value);
	}


	/**
	 * qty_55 qty_55.<p>
	 *
	 */
	public MCNumber qty_55() {
		return getConstNumber(offset + 56, $qty_55);
	}

	/**
	 * qty_55 qty_55.<p>
	 *
	 */
	public void qty_55(MCNumber value) {
		setConstNumber(offset + 56, $qty_55, value);
	}

	/**
	 * qty_55 qty_55.<p>
	 *
	 */
	public void qty_55(int value) {
		setConstNumber(offset + 56, $qty_55, value);
	}

	/**
	 * qty_55 qty_55.<p>
	 *
	 */
	public void qty_55(long value) {
		setConstNumber(offset + 56, $qty_55, value);
	}

	/**
	 * qty_55 qty_55.<p>
	 *
	 */
	public void qty_55(float value) {
		setConstNumber(offset + 56, $qty_55, value);
	}

	/**
	 * qty_55 qty_55.<p>
	 *
	 */
	public void qty_55(double value) {
		setConstNumber(offset + 56, $qty_55, value);
	}


	/**
	 * qty_56 qty_56.<p>
	 *
	 */
	public MCNumber qty_56() {
		return getConstNumber(offset + 57, $qty_56);
	}

	/**
	 * qty_56 qty_56.<p>
	 *
	 */
	public void qty_56(MCNumber value) {
		setConstNumber(offset + 57, $qty_56, value);
	}

	/**
	 * qty_56 qty_56.<p>
	 *
	 */
	public void qty_56(int value) {
		setConstNumber(offset + 57, $qty_56, value);
	}

	/**
	 * qty_56 qty_56.<p>
	 *
	 */
	public void qty_56(long value) {
		setConstNumber(offset + 57, $qty_56, value);
	}

	/**
	 * qty_56 qty_56.<p>
	 *
	 */
	public void qty_56(float value) {
		setConstNumber(offset + 57, $qty_56, value);
	}

	/**
	 * qty_56 qty_56.<p>
	 *
	 */
	public void qty_56(double value) {
		setConstNumber(offset + 57, $qty_56, value);
	}


	/**
	 * qty_57 qty_57.<p>
	 *
	 */
	public MCNumber qty_57() {
		return getConstNumber(offset + 58, $qty_57);
	}

	/**
	 * qty_57 qty_57.<p>
	 *
	 */
	public void qty_57(MCNumber value) {
		setConstNumber(offset + 58, $qty_57, value);
	}

	/**
	 * qty_57 qty_57.<p>
	 *
	 */
	public void qty_57(int value) {
		setConstNumber(offset + 58, $qty_57, value);
	}

	/**
	 * qty_57 qty_57.<p>
	 *
	 */
	public void qty_57(long value) {
		setConstNumber(offset + 58, $qty_57, value);
	}

	/**
	 * qty_57 qty_57.<p>
	 *
	 */
	public void qty_57(float value) {
		setConstNumber(offset + 58, $qty_57, value);
	}

	/**
	 * qty_57 qty_57.<p>
	 *
	 */
	public void qty_57(double value) {
		setConstNumber(offset + 58, $qty_57, value);
	}


	/**
	 * qty_58 qty_58.<p>
	 *
	 */
	public MCNumber qty_58() {
		return getConstNumber(offset + 59, $qty_58);
	}

	/**
	 * qty_58 qty_58.<p>
	 *
	 */
	public void qty_58(MCNumber value) {
		setConstNumber(offset + 59, $qty_58, value);
	}

	/**
	 * qty_58 qty_58.<p>
	 *
	 */
	public void qty_58(int value) {
		setConstNumber(offset + 59, $qty_58, value);
	}

	/**
	 * qty_58 qty_58.<p>
	 *
	 */
	public void qty_58(long value) {
		setConstNumber(offset + 59, $qty_58, value);
	}

	/**
	 * qty_58 qty_58.<p>
	 *
	 */
	public void qty_58(float value) {
		setConstNumber(offset + 59, $qty_58, value);
	}

	/**
	 * qty_58 qty_58.<p>
	 *
	 */
	public void qty_58(double value) {
		setConstNumber(offset + 59, $qty_58, value);
	}


	/**
	 * qty_59 qty_59.<p>
	 *
	 */
	public MCNumber qty_59() {
		return getConstNumber(offset + 60, $qty_59);
	}

	/**
	 * qty_59 qty_59.<p>
	 *
	 */
	public void qty_59(MCNumber value) {
		setConstNumber(offset + 60, $qty_59, value);
	}

	/**
	 * qty_59 qty_59.<p>
	 *
	 */
	public void qty_59(int value) {
		setConstNumber(offset + 60, $qty_59, value);
	}

	/**
	 * qty_59 qty_59.<p>
	 *
	 */
	public void qty_59(long value) {
		setConstNumber(offset + 60, $qty_59, value);
	}

	/**
	 * qty_59 qty_59.<p>
	 *
	 */
	public void qty_59(float value) {
		setConstNumber(offset + 60, $qty_59, value);
	}

	/**
	 * qty_59 qty_59.<p>
	 *
	 */
	public void qty_59(double value) {
		setConstNumber(offset + 60, $qty_59, value);
	}


	/**
	 * qty_60 qty_60.<p>
	 *
	 */
	public MCNumber qty_60() {
		return getConstNumber(offset + 61, $qty_60);
	}

	/**
	 * qty_60 qty_60.<p>
	 *
	 */
	public void qty_60(MCNumber value) {
		setConstNumber(offset + 61, $qty_60, value);
	}

	/**
	 * qty_60 qty_60.<p>
	 *
	 */
	public void qty_60(int value) {
		setConstNumber(offset + 61, $qty_60, value);
	}

	/**
	 * qty_60 qty_60.<p>
	 *
	 */
	public void qty_60(long value) {
		setConstNumber(offset + 61, $qty_60, value);
	}

	/**
	 * qty_60 qty_60.<p>
	 *
	 */
	public void qty_60(float value) {
		setConstNumber(offset + 61, $qty_60, value);
	}

	/**
	 * qty_60 qty_60.<p>
	 *
	 */
	public void qty_60(double value) {
		setConstNumber(offset + 61, $qty_60, value);
	}


	/**
	 * qty_61 qty_61.<p>
	 *
	 */
	public MCNumber qty_61() {
		return getConstNumber(offset + 62, $qty_61);
	}

	/**
	 * qty_61 qty_61.<p>
	 *
	 */
	public void qty_61(MCNumber value) {
		setConstNumber(offset + 62, $qty_61, value);
	}

	/**
	 * qty_61 qty_61.<p>
	 *
	 */
	public void qty_61(int value) {
		setConstNumber(offset + 62, $qty_61, value);
	}

	/**
	 * qty_61 qty_61.<p>
	 *
	 */
	public void qty_61(long value) {
		setConstNumber(offset + 62, $qty_61, value);
	}

	/**
	 * qty_61 qty_61.<p>
	 *
	 */
	public void qty_61(float value) {
		setConstNumber(offset + 62, $qty_61, value);
	}

	/**
	 * qty_61 qty_61.<p>
	 *
	 */
	public void qty_61(double value) {
		setConstNumber(offset + 62, $qty_61, value);
	}


	/**
	 * qty_62 qty_62.<p>
	 *
	 */
	public MCNumber qty_62() {
		return getConstNumber(offset + 63, $qty_62);
	}

	/**
	 * qty_62 qty_62.<p>
	 *
	 */
	public void qty_62(MCNumber value) {
		setConstNumber(offset + 63, $qty_62, value);
	}

	/**
	 * qty_62 qty_62.<p>
	 *
	 */
	public void qty_62(int value) {
		setConstNumber(offset + 63, $qty_62, value);
	}

	/**
	 * qty_62 qty_62.<p>
	 *
	 */
	public void qty_62(long value) {
		setConstNumber(offset + 63, $qty_62, value);
	}

	/**
	 * qty_62 qty_62.<p>
	 *
	 */
	public void qty_62(float value) {
		setConstNumber(offset + 63, $qty_62, value);
	}

	/**
	 * qty_62 qty_62.<p>
	 *
	 */
	public void qty_62(double value) {
		setConstNumber(offset + 63, $qty_62, value);
	}


	/**
	 * qty_63 qty_63.<p>
	 *
	 */
	public MCNumber qty_63() {
		return getConstNumber(offset + 64, $qty_63);
	}

	/**
	 * qty_63 qty_63.<p>
	 *
	 */
	public void qty_63(MCNumber value) {
		setConstNumber(offset + 64, $qty_63, value);
	}

	/**
	 * qty_63 qty_63.<p>
	 *
	 */
	public void qty_63(int value) {
		setConstNumber(offset + 64, $qty_63, value);
	}

	/**
	 * qty_63 qty_63.<p>
	 *
	 */
	public void qty_63(long value) {
		setConstNumber(offset + 64, $qty_63, value);
	}

	/**
	 * qty_63 qty_63.<p>
	 *
	 */
	public void qty_63(float value) {
		setConstNumber(offset + 64, $qty_63, value);
	}

	/**
	 * qty_63 qty_63.<p>
	 *
	 */
	public void qty_63(double value) {
		setConstNumber(offset + 64, $qty_63, value);
	}


	/**
	 * qty_64 qty_64.<p>
	 *
	 */
	public MCNumber qty_64() {
		return getConstNumber(offset + 65, $qty_64);
	}

	/**
	 * qty_64 qty_64.<p>
	 *
	 */
	public void qty_64(MCNumber value) {
		setConstNumber(offset + 65, $qty_64, value);
	}

	/**
	 * qty_64 qty_64.<p>
	 *
	 */
	public void qty_64(int value) {
		setConstNumber(offset + 65, $qty_64, value);
	}

	/**
	 * qty_64 qty_64.<p>
	 *
	 */
	public void qty_64(long value) {
		setConstNumber(offset + 65, $qty_64, value);
	}

	/**
	 * qty_64 qty_64.<p>
	 *
	 */
	public void qty_64(float value) {
		setConstNumber(offset + 65, $qty_64, value);
	}

	/**
	 * qty_64 qty_64.<p>
	 *
	 */
	public void qty_64(double value) {
		setConstNumber(offset + 65, $qty_64, value);
	}


	/**
	 * qty_65 qty_65.<p>
	 *
	 */
	public MCNumber qty_65() {
		return getConstNumber(offset + 66, $qty_65);
	}

	/**
	 * qty_65 qty_65.<p>
	 *
	 */
	public void qty_65(MCNumber value) {
		setConstNumber(offset + 66, $qty_65, value);
	}

	/**
	 * qty_65 qty_65.<p>
	 *
	 */
	public void qty_65(int value) {
		setConstNumber(offset + 66, $qty_65, value);
	}

	/**
	 * qty_65 qty_65.<p>
	 *
	 */
	public void qty_65(long value) {
		setConstNumber(offset + 66, $qty_65, value);
	}

	/**
	 * qty_65 qty_65.<p>
	 *
	 */
	public void qty_65(float value) {
		setConstNumber(offset + 66, $qty_65, value);
	}

	/**
	 * qty_65 qty_65.<p>
	 *
	 */
	public void qty_65(double value) {
		setConstNumber(offset + 66, $qty_65, value);
	}


	/**
	 * qty_66 qty_66.<p>
	 *
	 */
	public MCNumber qty_66() {
		return getConstNumber(offset + 67, $qty_66);
	}

	/**
	 * qty_66 qty_66.<p>
	 *
	 */
	public void qty_66(MCNumber value) {
		setConstNumber(offset + 67, $qty_66, value);
	}

	/**
	 * qty_66 qty_66.<p>
	 *
	 */
	public void qty_66(int value) {
		setConstNumber(offset + 67, $qty_66, value);
	}

	/**
	 * qty_66 qty_66.<p>
	 *
	 */
	public void qty_66(long value) {
		setConstNumber(offset + 67, $qty_66, value);
	}

	/**
	 * qty_66 qty_66.<p>
	 *
	 */
	public void qty_66(float value) {
		setConstNumber(offset + 67, $qty_66, value);
	}

	/**
	 * qty_66 qty_66.<p>
	 *
	 */
	public void qty_66(double value) {
		setConstNumber(offset + 67, $qty_66, value);
	}


	/**
	 * qty_67 qty_67.<p>
	 *
	 */
	public MCNumber qty_67() {
		return getConstNumber(offset + 68, $qty_67);
	}

	/**
	 * qty_67 qty_67.<p>
	 *
	 */
	public void qty_67(MCNumber value) {
		setConstNumber(offset + 68, $qty_67, value);
	}

	/**
	 * qty_67 qty_67.<p>
	 *
	 */
	public void qty_67(int value) {
		setConstNumber(offset + 68, $qty_67, value);
	}

	/**
	 * qty_67 qty_67.<p>
	 *
	 */
	public void qty_67(long value) {
		setConstNumber(offset + 68, $qty_67, value);
	}

	/**
	 * qty_67 qty_67.<p>
	 *
	 */
	public void qty_67(float value) {
		setConstNumber(offset + 68, $qty_67, value);
	}

	/**
	 * qty_67 qty_67.<p>
	 *
	 */
	public void qty_67(double value) {
		setConstNumber(offset + 68, $qty_67, value);
	}


	/**
	 * qty_68 qty_68.<p>
	 *
	 */
	public MCNumber qty_68() {
		return getConstNumber(offset + 69, $qty_68);
	}

	/**
	 * qty_68 qty_68.<p>
	 *
	 */
	public void qty_68(MCNumber value) {
		setConstNumber(offset + 69, $qty_68, value);
	}

	/**
	 * qty_68 qty_68.<p>
	 *
	 */
	public void qty_68(int value) {
		setConstNumber(offset + 69, $qty_68, value);
	}

	/**
	 * qty_68 qty_68.<p>
	 *
	 */
	public void qty_68(long value) {
		setConstNumber(offset + 69, $qty_68, value);
	}

	/**
	 * qty_68 qty_68.<p>
	 *
	 */
	public void qty_68(float value) {
		setConstNumber(offset + 69, $qty_68, value);
	}

	/**
	 * qty_68 qty_68.<p>
	 *
	 */
	public void qty_68(double value) {
		setConstNumber(offset + 69, $qty_68, value);
	}


	/**
	 * qty_69 qty_69.<p>
	 *
	 */
	public MCNumber qty_69() {
		return getConstNumber(offset + 70, $qty_69);
	}

	/**
	 * qty_69 qty_69.<p>
	 *
	 */
	public void qty_69(MCNumber value) {
		setConstNumber(offset + 70, $qty_69, value);
	}

	/**
	 * qty_69 qty_69.<p>
	 *
	 */
	public void qty_69(int value) {
		setConstNumber(offset + 70, $qty_69, value);
	}

	/**
	 * qty_69 qty_69.<p>
	 *
	 */
	public void qty_69(long value) {
		setConstNumber(offset + 70, $qty_69, value);
	}

	/**
	 * qty_69 qty_69.<p>
	 *
	 */
	public void qty_69(float value) {
		setConstNumber(offset + 70, $qty_69, value);
	}

	/**
	 * qty_69 qty_69.<p>
	 *
	 */
	public void qty_69(double value) {
		setConstNumber(offset + 70, $qty_69, value);
	}


	/**
	 * qty_70 qty_70.<p>
	 *
	 */
	public MCNumber qty_70() {
		return getConstNumber(offset + 71, $qty_70);
	}

	/**
	 * qty_70 qty_70.<p>
	 *
	 */
	public void qty_70(MCNumber value) {
		setConstNumber(offset + 71, $qty_70, value);
	}

	/**
	 * qty_70 qty_70.<p>
	 *
	 */
	public void qty_70(int value) {
		setConstNumber(offset + 71, $qty_70, value);
	}

	/**
	 * qty_70 qty_70.<p>
	 *
	 */
	public void qty_70(long value) {
		setConstNumber(offset + 71, $qty_70, value);
	}

	/**
	 * qty_70 qty_70.<p>
	 *
	 */
	public void qty_70(float value) {
		setConstNumber(offset + 71, $qty_70, value);
	}

	/**
	 * qty_70 qty_70.<p>
	 *
	 */
	public void qty_70(double value) {
		setConstNumber(offset + 71, $qty_70, value);
	}


	/**
	 * qty_71 qty_71.<p>
	 *
	 */
	public MCNumber qty_71() {
		return getConstNumber(offset + 72, $qty_71);
	}

	/**
	 * qty_71 qty_71.<p>
	 *
	 */
	public void qty_71(MCNumber value) {
		setConstNumber(offset + 72, $qty_71, value);
	}

	/**
	 * qty_71 qty_71.<p>
	 *
	 */
	public void qty_71(int value) {
		setConstNumber(offset + 72, $qty_71, value);
	}

	/**
	 * qty_71 qty_71.<p>
	 *
	 */
	public void qty_71(long value) {
		setConstNumber(offset + 72, $qty_71, value);
	}

	/**
	 * qty_71 qty_71.<p>
	 *
	 */
	public void qty_71(float value) {
		setConstNumber(offset + 72, $qty_71, value);
	}

	/**
	 * qty_71 qty_71.<p>
	 *
	 */
	public void qty_71(double value) {
		setConstNumber(offset + 72, $qty_71, value);
	}


	/**
	 * qty_72 qty_72.<p>
	 *
	 */
	public MCNumber qty_72() {
		return getConstNumber(offset + 73, $qty_72);
	}

	/**
	 * qty_72 qty_72.<p>
	 *
	 */
	public void qty_72(MCNumber value) {
		setConstNumber(offset + 73, $qty_72, value);
	}

	/**
	 * qty_72 qty_72.<p>
	 *
	 */
	public void qty_72(int value) {
		setConstNumber(offset + 73, $qty_72, value);
	}

	/**
	 * qty_72 qty_72.<p>
	 *
	 */
	public void qty_72(long value) {
		setConstNumber(offset + 73, $qty_72, value);
	}

	/**
	 * qty_72 qty_72.<p>
	 *
	 */
	public void qty_72(float value) {
		setConstNumber(offset + 73, $qty_72, value);
	}

	/**
	 * qty_72 qty_72.<p>
	 *
	 */
	public void qty_72(double value) {
		setConstNumber(offset + 73, $qty_72, value);
	}


	/**
	 * qty_73 qty_73.<p>
	 *
	 */
	public MCNumber qty_73() {
		return getConstNumber(offset + 74, $qty_73);
	}

	/**
	 * qty_73 qty_73.<p>
	 *
	 */
	public void qty_73(MCNumber value) {
		setConstNumber(offset + 74, $qty_73, value);
	}

	/**
	 * qty_73 qty_73.<p>
	 *
	 */
	public void qty_73(int value) {
		setConstNumber(offset + 74, $qty_73, value);
	}

	/**
	 * qty_73 qty_73.<p>
	 *
	 */
	public void qty_73(long value) {
		setConstNumber(offset + 74, $qty_73, value);
	}

	/**
	 * qty_73 qty_73.<p>
	 *
	 */
	public void qty_73(float value) {
		setConstNumber(offset + 74, $qty_73, value);
	}

	/**
	 * qty_73 qty_73.<p>
	 *
	 */
	public void qty_73(double value) {
		setConstNumber(offset + 74, $qty_73, value);
	}


	/**
	 * qty_74 qty_74.<p>
	 *
	 */
	public MCNumber qty_74() {
		return getConstNumber(offset + 75, $qty_74);
	}

	/**
	 * qty_74 qty_74.<p>
	 *
	 */
	public void qty_74(MCNumber value) {
		setConstNumber(offset + 75, $qty_74, value);
	}

	/**
	 * qty_74 qty_74.<p>
	 *
	 */
	public void qty_74(int value) {
		setConstNumber(offset + 75, $qty_74, value);
	}

	/**
	 * qty_74 qty_74.<p>
	 *
	 */
	public void qty_74(long value) {
		setConstNumber(offset + 75, $qty_74, value);
	}

	/**
	 * qty_74 qty_74.<p>
	 *
	 */
	public void qty_74(float value) {
		setConstNumber(offset + 75, $qty_74, value);
	}

	/**
	 * qty_74 qty_74.<p>
	 *
	 */
	public void qty_74(double value) {
		setConstNumber(offset + 75, $qty_74, value);
	}


	/**
	 * qty_75 qty_75.<p>
	 *
	 */
	public MCNumber qty_75() {
		return getConstNumber(offset + 76, $qty_75);
	}

	/**
	 * qty_75 qty_75.<p>
	 *
	 */
	public void qty_75(MCNumber value) {
		setConstNumber(offset + 76, $qty_75, value);
	}

	/**
	 * qty_75 qty_75.<p>
	 *
	 */
	public void qty_75(int value) {
		setConstNumber(offset + 76, $qty_75, value);
	}

	/**
	 * qty_75 qty_75.<p>
	 *
	 */
	public void qty_75(long value) {
		setConstNumber(offset + 76, $qty_75, value);
	}

	/**
	 * qty_75 qty_75.<p>
	 *
	 */
	public void qty_75(float value) {
		setConstNumber(offset + 76, $qty_75, value);
	}

	/**
	 * qty_75 qty_75.<p>
	 *
	 */
	public void qty_75(double value) {
		setConstNumber(offset + 76, $qty_75, value);
	}


	/**
	 * qty_76 qty_76.<p>
	 *
	 */
	public MCNumber qty_76() {
		return getConstNumber(offset + 77, $qty_76);
	}

	/**
	 * qty_76 qty_76.<p>
	 *
	 */
	public void qty_76(MCNumber value) {
		setConstNumber(offset + 77, $qty_76, value);
	}

	/**
	 * qty_76 qty_76.<p>
	 *
	 */
	public void qty_76(int value) {
		setConstNumber(offset + 77, $qty_76, value);
	}

	/**
	 * qty_76 qty_76.<p>
	 *
	 */
	public void qty_76(long value) {
		setConstNumber(offset + 77, $qty_76, value);
	}

	/**
	 * qty_76 qty_76.<p>
	 *
	 */
	public void qty_76(float value) {
		setConstNumber(offset + 77, $qty_76, value);
	}

	/**
	 * qty_76 qty_76.<p>
	 *
	 */
	public void qty_76(double value) {
		setConstNumber(offset + 77, $qty_76, value);
	}


	/**
	 * qty_77 qty_77.<p>
	 *
	 */
	public MCNumber qty_77() {
		return getConstNumber(offset + 78, $qty_77);
	}

	/**
	 * qty_77 qty_77.<p>
	 *
	 */
	public void qty_77(MCNumber value) {
		setConstNumber(offset + 78, $qty_77, value);
	}

	/**
	 * qty_77 qty_77.<p>
	 *
	 */
	public void qty_77(int value) {
		setConstNumber(offset + 78, $qty_77, value);
	}

	/**
	 * qty_77 qty_77.<p>
	 *
	 */
	public void qty_77(long value) {
		setConstNumber(offset + 78, $qty_77, value);
	}

	/**
	 * qty_77 qty_77.<p>
	 *
	 */
	public void qty_77(float value) {
		setConstNumber(offset + 78, $qty_77, value);
	}

	/**
	 * qty_77 qty_77.<p>
	 *
	 */
	public void qty_77(double value) {
		setConstNumber(offset + 78, $qty_77, value);
	}


	/**
	 * qty_78 qty_78.<p>
	 *
	 */
	public MCNumber qty_78() {
		return getConstNumber(offset + 79, $qty_78);
	}

	/**
	 * qty_78 qty_78.<p>
	 *
	 */
	public void qty_78(MCNumber value) {
		setConstNumber(offset + 79, $qty_78, value);
	}

	/**
	 * qty_78 qty_78.<p>
	 *
	 */
	public void qty_78(int value) {
		setConstNumber(offset + 79, $qty_78, value);
	}

	/**
	 * qty_78 qty_78.<p>
	 *
	 */
	public void qty_78(long value) {
		setConstNumber(offset + 79, $qty_78, value);
	}

	/**
	 * qty_78 qty_78.<p>
	 *
	 */
	public void qty_78(float value) {
		setConstNumber(offset + 79, $qty_78, value);
	}

	/**
	 * qty_78 qty_78.<p>
	 *
	 */
	public void qty_78(double value) {
		setConstNumber(offset + 79, $qty_78, value);
	}


	/**
	 * qty_79 qty_79.<p>
	 *
	 */
	public MCNumber qty_79() {
		return getConstNumber(offset + 80, $qty_79);
	}

	/**
	 * qty_79 qty_79.<p>
	 *
	 */
	public void qty_79(MCNumber value) {
		setConstNumber(offset + 80, $qty_79, value);
	}

	/**
	 * qty_79 qty_79.<p>
	 *
	 */
	public void qty_79(int value) {
		setConstNumber(offset + 80, $qty_79, value);
	}

	/**
	 * qty_79 qty_79.<p>
	 *
	 */
	public void qty_79(long value) {
		setConstNumber(offset + 80, $qty_79, value);
	}

	/**
	 * qty_79 qty_79.<p>
	 *
	 */
	public void qty_79(float value) {
		setConstNumber(offset + 80, $qty_79, value);
	}

	/**
	 * qty_79 qty_79.<p>
	 *
	 */
	public void qty_79(double value) {
		setConstNumber(offset + 80, $qty_79, value);
	}


	/**
	 * qty_80 qty_80.<p>
	 *
	 */
	public MCNumber qty_80() {
		return getConstNumber(offset + 81, $qty_80);
	}

	/**
	 * qty_80 qty_80.<p>
	 *
	 */
	public void qty_80(MCNumber value) {
		setConstNumber(offset + 81, $qty_80, value);
	}

	/**
	 * qty_80 qty_80.<p>
	 *
	 */
	public void qty_80(int value) {
		setConstNumber(offset + 81, $qty_80, value);
	}

	/**
	 * qty_80 qty_80.<p>
	 *
	 */
	public void qty_80(long value) {
		setConstNumber(offset + 81, $qty_80, value);
	}

	/**
	 * qty_80 qty_80.<p>
	 *
	 */
	public void qty_80(float value) {
		setConstNumber(offset + 81, $qty_80, value);
	}

	/**
	 * qty_80 qty_80.<p>
	 *
	 */
	public void qty_80(double value) {
		setConstNumber(offset + 81, $qty_80, value);
	}


	/**
	 * qty_81 qty_81.<p>
	 *
	 */
	public MCNumber qty_81() {
		return getConstNumber(offset + 82, $qty_81);
	}

	/**
	 * qty_81 qty_81.<p>
	 *
	 */
	public void qty_81(MCNumber value) {
		setConstNumber(offset + 82, $qty_81, value);
	}

	/**
	 * qty_81 qty_81.<p>
	 *
	 */
	public void qty_81(int value) {
		setConstNumber(offset + 82, $qty_81, value);
	}

	/**
	 * qty_81 qty_81.<p>
	 *
	 */
	public void qty_81(long value) {
		setConstNumber(offset + 82, $qty_81, value);
	}

	/**
	 * qty_81 qty_81.<p>
	 *
	 */
	public void qty_81(float value) {
		setConstNumber(offset + 82, $qty_81, value);
	}

	/**
	 * qty_81 qty_81.<p>
	 *
	 */
	public void qty_81(double value) {
		setConstNumber(offset + 82, $qty_81, value);
	}


	/**
	 * qty_82 qty_82.<p>
	 *
	 */
	public MCNumber qty_82() {
		return getConstNumber(offset + 83, $qty_82);
	}

	/**
	 * qty_82 qty_82.<p>
	 *
	 */
	public void qty_82(MCNumber value) {
		setConstNumber(offset + 83, $qty_82, value);
	}

	/**
	 * qty_82 qty_82.<p>
	 *
	 */
	public void qty_82(int value) {
		setConstNumber(offset + 83, $qty_82, value);
	}

	/**
	 * qty_82 qty_82.<p>
	 *
	 */
	public void qty_82(long value) {
		setConstNumber(offset + 83, $qty_82, value);
	}

	/**
	 * qty_82 qty_82.<p>
	 *
	 */
	public void qty_82(float value) {
		setConstNumber(offset + 83, $qty_82, value);
	}

	/**
	 * qty_82 qty_82.<p>
	 *
	 */
	public void qty_82(double value) {
		setConstNumber(offset + 83, $qty_82, value);
	}


	/**
	 * qty_83 qty_83.<p>
	 *
	 */
	public MCNumber qty_83() {
		return getConstNumber(offset + 84, $qty_83);
	}

	/**
	 * qty_83 qty_83.<p>
	 *
	 */
	public void qty_83(MCNumber value) {
		setConstNumber(offset + 84, $qty_83, value);
	}

	/**
	 * qty_83 qty_83.<p>
	 *
	 */
	public void qty_83(int value) {
		setConstNumber(offset + 84, $qty_83, value);
	}

	/**
	 * qty_83 qty_83.<p>
	 *
	 */
	public void qty_83(long value) {
		setConstNumber(offset + 84, $qty_83, value);
	}

	/**
	 * qty_83 qty_83.<p>
	 *
	 */
	public void qty_83(float value) {
		setConstNumber(offset + 84, $qty_83, value);
	}

	/**
	 * qty_83 qty_83.<p>
	 *
	 */
	public void qty_83(double value) {
		setConstNumber(offset + 84, $qty_83, value);
	}


	/**
	 * qty_84 qty_84.<p>
	 *
	 */
	public MCNumber qty_84() {
		return getConstNumber(offset + 85, $qty_84);
	}

	/**
	 * qty_84 qty_84.<p>
	 *
	 */
	public void qty_84(MCNumber value) {
		setConstNumber(offset + 85, $qty_84, value);
	}

	/**
	 * qty_84 qty_84.<p>
	 *
	 */
	public void qty_84(int value) {
		setConstNumber(offset + 85, $qty_84, value);
	}

	/**
	 * qty_84 qty_84.<p>
	 *
	 */
	public void qty_84(long value) {
		setConstNumber(offset + 85, $qty_84, value);
	}

	/**
	 * qty_84 qty_84.<p>
	 *
	 */
	public void qty_84(float value) {
		setConstNumber(offset + 85, $qty_84, value);
	}

	/**
	 * qty_84 qty_84.<p>
	 *
	 */
	public void qty_84(double value) {
		setConstNumber(offset + 85, $qty_84, value);
	}


	/**
	 * qty_85 qty_85.<p>
	 *
	 */
	public MCNumber qty_85() {
		return getConstNumber(offset + 86, $qty_85);
	}

	/**
	 * qty_85 qty_85.<p>
	 *
	 */
	public void qty_85(MCNumber value) {
		setConstNumber(offset + 86, $qty_85, value);
	}

	/**
	 * qty_85 qty_85.<p>
	 *
	 */
	public void qty_85(int value) {
		setConstNumber(offset + 86, $qty_85, value);
	}

	/**
	 * qty_85 qty_85.<p>
	 *
	 */
	public void qty_85(long value) {
		setConstNumber(offset + 86, $qty_85, value);
	}

	/**
	 * qty_85 qty_85.<p>
	 *
	 */
	public void qty_85(float value) {
		setConstNumber(offset + 86, $qty_85, value);
	}

	/**
	 * qty_85 qty_85.<p>
	 *
	 */
	public void qty_85(double value) {
		setConstNumber(offset + 86, $qty_85, value);
	}


	/**
	 * qty_86 qty_86.<p>
	 *
	 */
	public MCNumber qty_86() {
		return getConstNumber(offset + 87, $qty_86);
	}

	/**
	 * qty_86 qty_86.<p>
	 *
	 */
	public void qty_86(MCNumber value) {
		setConstNumber(offset + 87, $qty_86, value);
	}

	/**
	 * qty_86 qty_86.<p>
	 *
	 */
	public void qty_86(int value) {
		setConstNumber(offset + 87, $qty_86, value);
	}

	/**
	 * qty_86 qty_86.<p>
	 *
	 */
	public void qty_86(long value) {
		setConstNumber(offset + 87, $qty_86, value);
	}

	/**
	 * qty_86 qty_86.<p>
	 *
	 */
	public void qty_86(float value) {
		setConstNumber(offset + 87, $qty_86, value);
	}

	/**
	 * qty_86 qty_86.<p>
	 *
	 */
	public void qty_86(double value) {
		setConstNumber(offset + 87, $qty_86, value);
	}


	/**
	 * qty_87 qty_87.<p>
	 *
	 */
	public MCNumber qty_87() {
		return getConstNumber(offset + 88, $qty_87);
	}

	/**
	 * qty_87 qty_87.<p>
	 *
	 */
	public void qty_87(MCNumber value) {
		setConstNumber(offset + 88, $qty_87, value);
	}

	/**
	 * qty_87 qty_87.<p>
	 *
	 */
	public void qty_87(int value) {
		setConstNumber(offset + 88, $qty_87, value);
	}

	/**
	 * qty_87 qty_87.<p>
	 *
	 */
	public void qty_87(long value) {
		setConstNumber(offset + 88, $qty_87, value);
	}

	/**
	 * qty_87 qty_87.<p>
	 *
	 */
	public void qty_87(float value) {
		setConstNumber(offset + 88, $qty_87, value);
	}

	/**
	 * qty_87 qty_87.<p>
	 *
	 */
	public void qty_87(double value) {
		setConstNumber(offset + 88, $qty_87, value);
	}


	/**
	 * qty_88 qty_88.<p>
	 *
	 */
	public MCNumber qty_88() {
		return getConstNumber(offset + 89, $qty_88);
	}

	/**
	 * qty_88 qty_88.<p>
	 *
	 */
	public void qty_88(MCNumber value) {
		setConstNumber(offset + 89, $qty_88, value);
	}

	/**
	 * qty_88 qty_88.<p>
	 *
	 */
	public void qty_88(int value) {
		setConstNumber(offset + 89, $qty_88, value);
	}

	/**
	 * qty_88 qty_88.<p>
	 *
	 */
	public void qty_88(long value) {
		setConstNumber(offset + 89, $qty_88, value);
	}

	/**
	 * qty_88 qty_88.<p>
	 *
	 */
	public void qty_88(float value) {
		setConstNumber(offset + 89, $qty_88, value);
	}

	/**
	 * qty_88 qty_88.<p>
	 *
	 */
	public void qty_88(double value) {
		setConstNumber(offset + 89, $qty_88, value);
	}


	/**
	 * qty_89 qty_89.<p>
	 *
	 */
	public MCNumber qty_89() {
		return getConstNumber(offset + 90, $qty_89);
	}

	/**
	 * qty_89 qty_89.<p>
	 *
	 */
	public void qty_89(MCNumber value) {
		setConstNumber(offset + 90, $qty_89, value);
	}

	/**
	 * qty_89 qty_89.<p>
	 *
	 */
	public void qty_89(int value) {
		setConstNumber(offset + 90, $qty_89, value);
	}

	/**
	 * qty_89 qty_89.<p>
	 *
	 */
	public void qty_89(long value) {
		setConstNumber(offset + 90, $qty_89, value);
	}

	/**
	 * qty_89 qty_89.<p>
	 *
	 */
	public void qty_89(float value) {
		setConstNumber(offset + 90, $qty_89, value);
	}

	/**
	 * qty_89 qty_89.<p>
	 *
	 */
	public void qty_89(double value) {
		setConstNumber(offset + 90, $qty_89, value);
	}


	/**
	 * qty_90 qty_90.<p>
	 *
	 */
	public MCNumber qty_90() {
		return getConstNumber(offset + 91, $qty_90);
	}

	/**
	 * qty_90 qty_90.<p>
	 *
	 */
	public void qty_90(MCNumber value) {
		setConstNumber(offset + 91, $qty_90, value);
	}

	/**
	 * qty_90 qty_90.<p>
	 *
	 */
	public void qty_90(int value) {
		setConstNumber(offset + 91, $qty_90, value);
	}

	/**
	 * qty_90 qty_90.<p>
	 *
	 */
	public void qty_90(long value) {
		setConstNumber(offset + 91, $qty_90, value);
	}

	/**
	 * qty_90 qty_90.<p>
	 *
	 */
	public void qty_90(float value) {
		setConstNumber(offset + 91, $qty_90, value);
	}

	/**
	 * qty_90 qty_90.<p>
	 *
	 */
	public void qty_90(double value) {
		setConstNumber(offset + 91, $qty_90, value);
	}


	/**
	 * qty_91 qty_91.<p>
	 *
	 */
	public MCNumber qty_91() {
		return getConstNumber(offset + 92, $qty_91);
	}

	/**
	 * qty_91 qty_91.<p>
	 *
	 */
	public void qty_91(MCNumber value) {
		setConstNumber(offset + 92, $qty_91, value);
	}

	/**
	 * qty_91 qty_91.<p>
	 *
	 */
	public void qty_91(int value) {
		setConstNumber(offset + 92, $qty_91, value);
	}

	/**
	 * qty_91 qty_91.<p>
	 *
	 */
	public void qty_91(long value) {
		setConstNumber(offset + 92, $qty_91, value);
	}

	/**
	 * qty_91 qty_91.<p>
	 *
	 */
	public void qty_91(float value) {
		setConstNumber(offset + 92, $qty_91, value);
	}

	/**
	 * qty_91 qty_91.<p>
	 *
	 */
	public void qty_91(double value) {
		setConstNumber(offset + 92, $qty_91, value);
	}


	/**
	 * qty_92 qty_92.<p>
	 *
	 */
	public MCNumber qty_92() {
		return getConstNumber(offset + 93, $qty_92);
	}

	/**
	 * qty_92 qty_92.<p>
	 *
	 */
	public void qty_92(MCNumber value) {
		setConstNumber(offset + 93, $qty_92, value);
	}

	/**
	 * qty_92 qty_92.<p>
	 *
	 */
	public void qty_92(int value) {
		setConstNumber(offset + 93, $qty_92, value);
	}

	/**
	 * qty_92 qty_92.<p>
	 *
	 */
	public void qty_92(long value) {
		setConstNumber(offset + 93, $qty_92, value);
	}

	/**
	 * qty_92 qty_92.<p>
	 *
	 */
	public void qty_92(float value) {
		setConstNumber(offset + 93, $qty_92, value);
	}

	/**
	 * qty_92 qty_92.<p>
	 *
	 */
	public void qty_92(double value) {
		setConstNumber(offset + 93, $qty_92, value);
	}


	/**
	 * qty_93 qty_93.<p>
	 *
	 */
	public MCNumber qty_93() {
		return getConstNumber(offset + 94, $qty_93);
	}

	/**
	 * qty_93 qty_93.<p>
	 *
	 */
	public void qty_93(MCNumber value) {
		setConstNumber(offset + 94, $qty_93, value);
	}

	/**
	 * qty_93 qty_93.<p>
	 *
	 */
	public void qty_93(int value) {
		setConstNumber(offset + 94, $qty_93, value);
	}

	/**
	 * qty_93 qty_93.<p>
	 *
	 */
	public void qty_93(long value) {
		setConstNumber(offset + 94, $qty_93, value);
	}

	/**
	 * qty_93 qty_93.<p>
	 *
	 */
	public void qty_93(float value) {
		setConstNumber(offset + 94, $qty_93, value);
	}

	/**
	 * qty_93 qty_93.<p>
	 *
	 */
	public void qty_93(double value) {
		setConstNumber(offset + 94, $qty_93, value);
	}


	public String getString(String name) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			return mps_grp_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($qty_00.equalsIgnoreCase(name)) {
			return qty_00();
		}
		if ($qty_01.equalsIgnoreCase(name)) {
			return qty_01();
		}
		if ($qty_02.equalsIgnoreCase(name)) {
			return qty_02();
		}
		if ($qty_03.equalsIgnoreCase(name)) {
			return qty_03();
		}
		if ($qty_04.equalsIgnoreCase(name)) {
			return qty_04();
		}
		if ($qty_05.equalsIgnoreCase(name)) {
			return qty_05();
		}
		if ($qty_06.equalsIgnoreCase(name)) {
			return qty_06();
		}
		if ($qty_07.equalsIgnoreCase(name)) {
			return qty_07();
		}
		if ($qty_08.equalsIgnoreCase(name)) {
			return qty_08();
		}
		if ($qty_09.equalsIgnoreCase(name)) {
			return qty_09();
		}
		if ($qty_10.equalsIgnoreCase(name)) {
			return qty_10();
		}
		if ($qty_11.equalsIgnoreCase(name)) {
			return qty_11();
		}
		if ($qty_12.equalsIgnoreCase(name)) {
			return qty_12();
		}
		if ($qty_13.equalsIgnoreCase(name)) {
			return qty_13();
		}
		if ($qty_14.equalsIgnoreCase(name)) {
			return qty_14();
		}
		if ($qty_15.equalsIgnoreCase(name)) {
			return qty_15();
		}
		if ($qty_16.equalsIgnoreCase(name)) {
			return qty_16();
		}
		if ($qty_17.equalsIgnoreCase(name)) {
			return qty_17();
		}
		if ($qty_18.equalsIgnoreCase(name)) {
			return qty_18();
		}
		if ($qty_19.equalsIgnoreCase(name)) {
			return qty_19();
		}
		if ($qty_20.equalsIgnoreCase(name)) {
			return qty_20();
		}
		if ($qty_21.equalsIgnoreCase(name)) {
			return qty_21();
		}
		if ($qty_22.equalsIgnoreCase(name)) {
			return qty_22();
		}
		if ($qty_23.equalsIgnoreCase(name)) {
			return qty_23();
		}
		if ($qty_24.equalsIgnoreCase(name)) {
			return qty_24();
		}
		if ($qty_25.equalsIgnoreCase(name)) {
			return qty_25();
		}
		if ($qty_26.equalsIgnoreCase(name)) {
			return qty_26();
		}
		if ($qty_27.equalsIgnoreCase(name)) {
			return qty_27();
		}
		if ($qty_28.equalsIgnoreCase(name)) {
			return qty_28();
		}
		if ($qty_29.equalsIgnoreCase(name)) {
			return qty_29();
		}
		if ($qty_30.equalsIgnoreCase(name)) {
			return qty_30();
		}
		if ($qty_31.equalsIgnoreCase(name)) {
			return qty_31();
		}
		if ($qty_32.equalsIgnoreCase(name)) {
			return qty_32();
		}
		if ($qty_33.equalsIgnoreCase(name)) {
			return qty_33();
		}
		if ($qty_34.equalsIgnoreCase(name)) {
			return qty_34();
		}
		if ($qty_35.equalsIgnoreCase(name)) {
			return qty_35();
		}
		if ($qty_36.equalsIgnoreCase(name)) {
			return qty_36();
		}
		if ($qty_37.equalsIgnoreCase(name)) {
			return qty_37();
		}
		if ($qty_38.equalsIgnoreCase(name)) {
			return qty_38();
		}
		if ($qty_39.equalsIgnoreCase(name)) {
			return qty_39();
		}
		if ($qty_40.equalsIgnoreCase(name)) {
			return qty_40();
		}
		if ($qty_41.equalsIgnoreCase(name)) {
			return qty_41();
		}
		if ($qty_42.equalsIgnoreCase(name)) {
			return qty_42();
		}
		if ($qty_43.equalsIgnoreCase(name)) {
			return qty_43();
		}
		if ($qty_44.equalsIgnoreCase(name)) {
			return qty_44();
		}
		if ($qty_45.equalsIgnoreCase(name)) {
			return qty_45();
		}
		if ($qty_46.equalsIgnoreCase(name)) {
			return qty_46();
		}
		if ($qty_47.equalsIgnoreCase(name)) {
			return qty_47();
		}
		if ($qty_48.equalsIgnoreCase(name)) {
			return qty_48();
		}
		if ($qty_49.equalsIgnoreCase(name)) {
			return qty_49();
		}
		if ($qty_50.equalsIgnoreCase(name)) {
			return qty_50();
		}
		if ($qty_51.equalsIgnoreCase(name)) {
			return qty_51();
		}
		if ($qty_52.equalsIgnoreCase(name)) {
			return qty_52();
		}
		if ($qty_53.equalsIgnoreCase(name)) {
			return qty_53();
		}
		if ($qty_54.equalsIgnoreCase(name)) {
			return qty_54();
		}
		if ($qty_55.equalsIgnoreCase(name)) {
			return qty_55();
		}
		if ($qty_56.equalsIgnoreCase(name)) {
			return qty_56();
		}
		if ($qty_57.equalsIgnoreCase(name)) {
			return qty_57();
		}
		if ($qty_58.equalsIgnoreCase(name)) {
			return qty_58();
		}
		if ($qty_59.equalsIgnoreCase(name)) {
			return qty_59();
		}
		if ($qty_60.equalsIgnoreCase(name)) {
			return qty_60();
		}
		if ($qty_61.equalsIgnoreCase(name)) {
			return qty_61();
		}
		if ($qty_62.equalsIgnoreCase(name)) {
			return qty_62();
		}
		if ($qty_63.equalsIgnoreCase(name)) {
			return qty_63();
		}
		if ($qty_64.equalsIgnoreCase(name)) {
			return qty_64();
		}
		if ($qty_65.equalsIgnoreCase(name)) {
			return qty_65();
		}
		if ($qty_66.equalsIgnoreCase(name)) {
			return qty_66();
		}
		if ($qty_67.equalsIgnoreCase(name)) {
			return qty_67();
		}
		if ($qty_68.equalsIgnoreCase(name)) {
			return qty_68();
		}
		if ($qty_69.equalsIgnoreCase(name)) {
			return qty_69();
		}
		if ($qty_70.equalsIgnoreCase(name)) {
			return qty_70();
		}
		if ($qty_71.equalsIgnoreCase(name)) {
			return qty_71();
		}
		if ($qty_72.equalsIgnoreCase(name)) {
			return qty_72();
		}
		if ($qty_73.equalsIgnoreCase(name)) {
			return qty_73();
		}
		if ($qty_74.equalsIgnoreCase(name)) {
			return qty_74();
		}
		if ($qty_75.equalsIgnoreCase(name)) {
			return qty_75();
		}
		if ($qty_76.equalsIgnoreCase(name)) {
			return qty_76();
		}
		if ($qty_77.equalsIgnoreCase(name)) {
			return qty_77();
		}
		if ($qty_78.equalsIgnoreCase(name)) {
			return qty_78();
		}
		if ($qty_79.equalsIgnoreCase(name)) {
			return qty_79();
		}
		if ($qty_80.equalsIgnoreCase(name)) {
			return qty_80();
		}
		if ($qty_81.equalsIgnoreCase(name)) {
			return qty_81();
		}
		if ($qty_82.equalsIgnoreCase(name)) {
			return qty_82();
		}
		if ($qty_83.equalsIgnoreCase(name)) {
			return qty_83();
		}
		if ($qty_84.equalsIgnoreCase(name)) {
			return qty_84();
		}
		if ($qty_85.equalsIgnoreCase(name)) {
			return qty_85();
		}
		if ($qty_86.equalsIgnoreCase(name)) {
			return qty_86();
		}
		if ($qty_87.equalsIgnoreCase(name)) {
			return qty_87();
		}
		if ($qty_88.equalsIgnoreCase(name)) {
			return qty_88();
		}
		if ($qty_89.equalsIgnoreCase(name)) {
			return qty_89();
		}
		if ($qty_90.equalsIgnoreCase(name)) {
			return qty_90();
		}
		if ($qty_91.equalsIgnoreCase(name)) {
			return qty_91();
		}
		if ($qty_92.equalsIgnoreCase(name)) {
			return qty_92();
		}
		if ($qty_93.equalsIgnoreCase(name)) {
			return qty_93();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			return mps_grp_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($qty_00.equalsIgnoreCase(name)) {
			return qty_00();
		}
		if ($qty_01.equalsIgnoreCase(name)) {
			return qty_01();
		}
		if ($qty_02.equalsIgnoreCase(name)) {
			return qty_02();
		}
		if ($qty_03.equalsIgnoreCase(name)) {
			return qty_03();
		}
		if ($qty_04.equalsIgnoreCase(name)) {
			return qty_04();
		}
		if ($qty_05.equalsIgnoreCase(name)) {
			return qty_05();
		}
		if ($qty_06.equalsIgnoreCase(name)) {
			return qty_06();
		}
		if ($qty_07.equalsIgnoreCase(name)) {
			return qty_07();
		}
		if ($qty_08.equalsIgnoreCase(name)) {
			return qty_08();
		}
		if ($qty_09.equalsIgnoreCase(name)) {
			return qty_09();
		}
		if ($qty_10.equalsIgnoreCase(name)) {
			return qty_10();
		}
		if ($qty_11.equalsIgnoreCase(name)) {
			return qty_11();
		}
		if ($qty_12.equalsIgnoreCase(name)) {
			return qty_12();
		}
		if ($qty_13.equalsIgnoreCase(name)) {
			return qty_13();
		}
		if ($qty_14.equalsIgnoreCase(name)) {
			return qty_14();
		}
		if ($qty_15.equalsIgnoreCase(name)) {
			return qty_15();
		}
		if ($qty_16.equalsIgnoreCase(name)) {
			return qty_16();
		}
		if ($qty_17.equalsIgnoreCase(name)) {
			return qty_17();
		}
		if ($qty_18.equalsIgnoreCase(name)) {
			return qty_18();
		}
		if ($qty_19.equalsIgnoreCase(name)) {
			return qty_19();
		}
		if ($qty_20.equalsIgnoreCase(name)) {
			return qty_20();
		}
		if ($qty_21.equalsIgnoreCase(name)) {
			return qty_21();
		}
		if ($qty_22.equalsIgnoreCase(name)) {
			return qty_22();
		}
		if ($qty_23.equalsIgnoreCase(name)) {
			return qty_23();
		}
		if ($qty_24.equalsIgnoreCase(name)) {
			return qty_24();
		}
		if ($qty_25.equalsIgnoreCase(name)) {
			return qty_25();
		}
		if ($qty_26.equalsIgnoreCase(name)) {
			return qty_26();
		}
		if ($qty_27.equalsIgnoreCase(name)) {
			return qty_27();
		}
		if ($qty_28.equalsIgnoreCase(name)) {
			return qty_28();
		}
		if ($qty_29.equalsIgnoreCase(name)) {
			return qty_29();
		}
		if ($qty_30.equalsIgnoreCase(name)) {
			return qty_30();
		}
		if ($qty_31.equalsIgnoreCase(name)) {
			return qty_31();
		}
		if ($qty_32.equalsIgnoreCase(name)) {
			return qty_32();
		}
		if ($qty_33.equalsIgnoreCase(name)) {
			return qty_33();
		}
		if ($qty_34.equalsIgnoreCase(name)) {
			return qty_34();
		}
		if ($qty_35.equalsIgnoreCase(name)) {
			return qty_35();
		}
		if ($qty_36.equalsIgnoreCase(name)) {
			return qty_36();
		}
		if ($qty_37.equalsIgnoreCase(name)) {
			return qty_37();
		}
		if ($qty_38.equalsIgnoreCase(name)) {
			return qty_38();
		}
		if ($qty_39.equalsIgnoreCase(name)) {
			return qty_39();
		}
		if ($qty_40.equalsIgnoreCase(name)) {
			return qty_40();
		}
		if ($qty_41.equalsIgnoreCase(name)) {
			return qty_41();
		}
		if ($qty_42.equalsIgnoreCase(name)) {
			return qty_42();
		}
		if ($qty_43.equalsIgnoreCase(name)) {
			return qty_43();
		}
		if ($qty_44.equalsIgnoreCase(name)) {
			return qty_44();
		}
		if ($qty_45.equalsIgnoreCase(name)) {
			return qty_45();
		}
		if ($qty_46.equalsIgnoreCase(name)) {
			return qty_46();
		}
		if ($qty_47.equalsIgnoreCase(name)) {
			return qty_47();
		}
		if ($qty_48.equalsIgnoreCase(name)) {
			return qty_48();
		}
		if ($qty_49.equalsIgnoreCase(name)) {
			return qty_49();
		}
		if ($qty_50.equalsIgnoreCase(name)) {
			return qty_50();
		}
		if ($qty_51.equalsIgnoreCase(name)) {
			return qty_51();
		}
		if ($qty_52.equalsIgnoreCase(name)) {
			return qty_52();
		}
		if ($qty_53.equalsIgnoreCase(name)) {
			return qty_53();
		}
		if ($qty_54.equalsIgnoreCase(name)) {
			return qty_54();
		}
		if ($qty_55.equalsIgnoreCase(name)) {
			return qty_55();
		}
		if ($qty_56.equalsIgnoreCase(name)) {
			return qty_56();
		}
		if ($qty_57.equalsIgnoreCase(name)) {
			return qty_57();
		}
		if ($qty_58.equalsIgnoreCase(name)) {
			return qty_58();
		}
		if ($qty_59.equalsIgnoreCase(name)) {
			return qty_59();
		}
		if ($qty_60.equalsIgnoreCase(name)) {
			return qty_60();
		}
		if ($qty_61.equalsIgnoreCase(name)) {
			return qty_61();
		}
		if ($qty_62.equalsIgnoreCase(name)) {
			return qty_62();
		}
		if ($qty_63.equalsIgnoreCase(name)) {
			return qty_63();
		}
		if ($qty_64.equalsIgnoreCase(name)) {
			return qty_64();
		}
		if ($qty_65.equalsIgnoreCase(name)) {
			return qty_65();
		}
		if ($qty_66.equalsIgnoreCase(name)) {
			return qty_66();
		}
		if ($qty_67.equalsIgnoreCase(name)) {
			return qty_67();
		}
		if ($qty_68.equalsIgnoreCase(name)) {
			return qty_68();
		}
		if ($qty_69.equalsIgnoreCase(name)) {
			return qty_69();
		}
		if ($qty_70.equalsIgnoreCase(name)) {
			return qty_70();
		}
		if ($qty_71.equalsIgnoreCase(name)) {
			return qty_71();
		}
		if ($qty_72.equalsIgnoreCase(name)) {
			return qty_72();
		}
		if ($qty_73.equalsIgnoreCase(name)) {
			return qty_73();
		}
		if ($qty_74.equalsIgnoreCase(name)) {
			return qty_74();
		}
		if ($qty_75.equalsIgnoreCase(name)) {
			return qty_75();
		}
		if ($qty_76.equalsIgnoreCase(name)) {
			return qty_76();
		}
		if ($qty_77.equalsIgnoreCase(name)) {
			return qty_77();
		}
		if ($qty_78.equalsIgnoreCase(name)) {
			return qty_78();
		}
		if ($qty_79.equalsIgnoreCase(name)) {
			return qty_79();
		}
		if ($qty_80.equalsIgnoreCase(name)) {
			return qty_80();
		}
		if ($qty_81.equalsIgnoreCase(name)) {
			return qty_81();
		}
		if ($qty_82.equalsIgnoreCase(name)) {
			return qty_82();
		}
		if ($qty_83.equalsIgnoreCase(name)) {
			return qty_83();
		}
		if ($qty_84.equalsIgnoreCase(name)) {
			return qty_84();
		}
		if ($qty_85.equalsIgnoreCase(name)) {
			return qty_85();
		}
		if ($qty_86.equalsIgnoreCase(name)) {
			return qty_86();
		}
		if ($qty_87.equalsIgnoreCase(name)) {
			return qty_87();
		}
		if ($qty_88.equalsIgnoreCase(name)) {
			return qty_88();
		}
		if ($qty_89.equalsIgnoreCase(name)) {
			return qty_89();
		}
		if ($qty_90.equalsIgnoreCase(name)) {
			return qty_90();
		}
		if ($qty_91.equalsIgnoreCase(name)) {
			return qty_91();
		}
		if ($qty_92.equalsIgnoreCase(name)) {
			return qty_92();
		}
		if ($qty_93.equalsIgnoreCase(name)) {
			return qty_93();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			mps_grp_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($qty_00.equalsIgnoreCase(name)) {
			qty_00(value);
			return;
		}
		if ($qty_01.equalsIgnoreCase(name)) {
			qty_01(value);
			return;
		}
		if ($qty_02.equalsIgnoreCase(name)) {
			qty_02(value);
			return;
		}
		if ($qty_03.equalsIgnoreCase(name)) {
			qty_03(value);
			return;
		}
		if ($qty_04.equalsIgnoreCase(name)) {
			qty_04(value);
			return;
		}
		if ($qty_05.equalsIgnoreCase(name)) {
			qty_05(value);
			return;
		}
		if ($qty_06.equalsIgnoreCase(name)) {
			qty_06(value);
			return;
		}
		if ($qty_07.equalsIgnoreCase(name)) {
			qty_07(value);
			return;
		}
		if ($qty_08.equalsIgnoreCase(name)) {
			qty_08(value);
			return;
		}
		if ($qty_09.equalsIgnoreCase(name)) {
			qty_09(value);
			return;
		}
		if ($qty_10.equalsIgnoreCase(name)) {
			qty_10(value);
			return;
		}
		if ($qty_11.equalsIgnoreCase(name)) {
			qty_11(value);
			return;
		}
		if ($qty_12.equalsIgnoreCase(name)) {
			qty_12(value);
			return;
		}
		if ($qty_13.equalsIgnoreCase(name)) {
			qty_13(value);
			return;
		}
		if ($qty_14.equalsIgnoreCase(name)) {
			qty_14(value);
			return;
		}
		if ($qty_15.equalsIgnoreCase(name)) {
			qty_15(value);
			return;
		}
		if ($qty_16.equalsIgnoreCase(name)) {
			qty_16(value);
			return;
		}
		if ($qty_17.equalsIgnoreCase(name)) {
			qty_17(value);
			return;
		}
		if ($qty_18.equalsIgnoreCase(name)) {
			qty_18(value);
			return;
		}
		if ($qty_19.equalsIgnoreCase(name)) {
			qty_19(value);
			return;
		}
		if ($qty_20.equalsIgnoreCase(name)) {
			qty_20(value);
			return;
		}
		if ($qty_21.equalsIgnoreCase(name)) {
			qty_21(value);
			return;
		}
		if ($qty_22.equalsIgnoreCase(name)) {
			qty_22(value);
			return;
		}
		if ($qty_23.equalsIgnoreCase(name)) {
			qty_23(value);
			return;
		}
		if ($qty_24.equalsIgnoreCase(name)) {
			qty_24(value);
			return;
		}
		if ($qty_25.equalsIgnoreCase(name)) {
			qty_25(value);
			return;
		}
		if ($qty_26.equalsIgnoreCase(name)) {
			qty_26(value);
			return;
		}
		if ($qty_27.equalsIgnoreCase(name)) {
			qty_27(value);
			return;
		}
		if ($qty_28.equalsIgnoreCase(name)) {
			qty_28(value);
			return;
		}
		if ($qty_29.equalsIgnoreCase(name)) {
			qty_29(value);
			return;
		}
		if ($qty_30.equalsIgnoreCase(name)) {
			qty_30(value);
			return;
		}
		if ($qty_31.equalsIgnoreCase(name)) {
			qty_31(value);
			return;
		}
		if ($qty_32.equalsIgnoreCase(name)) {
			qty_32(value);
			return;
		}
		if ($qty_33.equalsIgnoreCase(name)) {
			qty_33(value);
			return;
		}
		if ($qty_34.equalsIgnoreCase(name)) {
			qty_34(value);
			return;
		}
		if ($qty_35.equalsIgnoreCase(name)) {
			qty_35(value);
			return;
		}
		if ($qty_36.equalsIgnoreCase(name)) {
			qty_36(value);
			return;
		}
		if ($qty_37.equalsIgnoreCase(name)) {
			qty_37(value);
			return;
		}
		if ($qty_38.equalsIgnoreCase(name)) {
			qty_38(value);
			return;
		}
		if ($qty_39.equalsIgnoreCase(name)) {
			qty_39(value);
			return;
		}
		if ($qty_40.equalsIgnoreCase(name)) {
			qty_40(value);
			return;
		}
		if ($qty_41.equalsIgnoreCase(name)) {
			qty_41(value);
			return;
		}
		if ($qty_42.equalsIgnoreCase(name)) {
			qty_42(value);
			return;
		}
		if ($qty_43.equalsIgnoreCase(name)) {
			qty_43(value);
			return;
		}
		if ($qty_44.equalsIgnoreCase(name)) {
			qty_44(value);
			return;
		}
		if ($qty_45.equalsIgnoreCase(name)) {
			qty_45(value);
			return;
		}
		if ($qty_46.equalsIgnoreCase(name)) {
			qty_46(value);
			return;
		}
		if ($qty_47.equalsIgnoreCase(name)) {
			qty_47(value);
			return;
		}
		if ($qty_48.equalsIgnoreCase(name)) {
			qty_48(value);
			return;
		}
		if ($qty_49.equalsIgnoreCase(name)) {
			qty_49(value);
			return;
		}
		if ($qty_50.equalsIgnoreCase(name)) {
			qty_50(value);
			return;
		}
		if ($qty_51.equalsIgnoreCase(name)) {
			qty_51(value);
			return;
		}
		if ($qty_52.equalsIgnoreCase(name)) {
			qty_52(value);
			return;
		}
		if ($qty_53.equalsIgnoreCase(name)) {
			qty_53(value);
			return;
		}
		if ($qty_54.equalsIgnoreCase(name)) {
			qty_54(value);
			return;
		}
		if ($qty_55.equalsIgnoreCase(name)) {
			qty_55(value);
			return;
		}
		if ($qty_56.equalsIgnoreCase(name)) {
			qty_56(value);
			return;
		}
		if ($qty_57.equalsIgnoreCase(name)) {
			qty_57(value);
			return;
		}
		if ($qty_58.equalsIgnoreCase(name)) {
			qty_58(value);
			return;
		}
		if ($qty_59.equalsIgnoreCase(name)) {
			qty_59(value);
			return;
		}
		if ($qty_60.equalsIgnoreCase(name)) {
			qty_60(value);
			return;
		}
		if ($qty_61.equalsIgnoreCase(name)) {
			qty_61(value);
			return;
		}
		if ($qty_62.equalsIgnoreCase(name)) {
			qty_62(value);
			return;
		}
		if ($qty_63.equalsIgnoreCase(name)) {
			qty_63(value);
			return;
		}
		if ($qty_64.equalsIgnoreCase(name)) {
			qty_64(value);
			return;
		}
		if ($qty_65.equalsIgnoreCase(name)) {
			qty_65(value);
			return;
		}
		if ($qty_66.equalsIgnoreCase(name)) {
			qty_66(value);
			return;
		}
		if ($qty_67.equalsIgnoreCase(name)) {
			qty_67(value);
			return;
		}
		if ($qty_68.equalsIgnoreCase(name)) {
			qty_68(value);
			return;
		}
		if ($qty_69.equalsIgnoreCase(name)) {
			qty_69(value);
			return;
		}
		if ($qty_70.equalsIgnoreCase(name)) {
			qty_70(value);
			return;
		}
		if ($qty_71.equalsIgnoreCase(name)) {
			qty_71(value);
			return;
		}
		if ($qty_72.equalsIgnoreCase(name)) {
			qty_72(value);
			return;
		}
		if ($qty_73.equalsIgnoreCase(name)) {
			qty_73(value);
			return;
		}
		if ($qty_74.equalsIgnoreCase(name)) {
			qty_74(value);
			return;
		}
		if ($qty_75.equalsIgnoreCase(name)) {
			qty_75(value);
			return;
		}
		if ($qty_76.equalsIgnoreCase(name)) {
			qty_76(value);
			return;
		}
		if ($qty_77.equalsIgnoreCase(name)) {
			qty_77(value);
			return;
		}
		if ($qty_78.equalsIgnoreCase(name)) {
			qty_78(value);
			return;
		}
		if ($qty_79.equalsIgnoreCase(name)) {
			qty_79(value);
			return;
		}
		if ($qty_80.equalsIgnoreCase(name)) {
			qty_80(value);
			return;
		}
		if ($qty_81.equalsIgnoreCase(name)) {
			qty_81(value);
			return;
		}
		if ($qty_82.equalsIgnoreCase(name)) {
			qty_82(value);
			return;
		}
		if ($qty_83.equalsIgnoreCase(name)) {
			qty_83(value);
			return;
		}
		if ($qty_84.equalsIgnoreCase(name)) {
			qty_84(value);
			return;
		}
		if ($qty_85.equalsIgnoreCase(name)) {
			qty_85(value);
			return;
		}
		if ($qty_86.equalsIgnoreCase(name)) {
			qty_86(value);
			return;
		}
		if ($qty_87.equalsIgnoreCase(name)) {
			qty_87(value);
			return;
		}
		if ($qty_88.equalsIgnoreCase(name)) {
			qty_88(value);
			return;
		}
		if ($qty_89.equalsIgnoreCase(name)) {
			qty_89(value);
			return;
		}
		if ($qty_90.equalsIgnoreCase(name)) {
			qty_90(value);
			return;
		}
		if ($qty_91.equalsIgnoreCase(name)) {
			qty_91(value);
			return;
		}
		if ($qty_92.equalsIgnoreCase(name)) {
			qty_92(value);
			return;
		}
		if ($qty_93.equalsIgnoreCase(name)) {
			qty_93(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($qty_00.equalsIgnoreCase(name)) {
			qty_00(value);
			return;
		}
		if ($qty_01.equalsIgnoreCase(name)) {
			qty_01(value);
			return;
		}
		if ($qty_02.equalsIgnoreCase(name)) {
			qty_02(value);
			return;
		}
		if ($qty_03.equalsIgnoreCase(name)) {
			qty_03(value);
			return;
		}
		if ($qty_04.equalsIgnoreCase(name)) {
			qty_04(value);
			return;
		}
		if ($qty_05.equalsIgnoreCase(name)) {
			qty_05(value);
			return;
		}
		if ($qty_06.equalsIgnoreCase(name)) {
			qty_06(value);
			return;
		}
		if ($qty_07.equalsIgnoreCase(name)) {
			qty_07(value);
			return;
		}
		if ($qty_08.equalsIgnoreCase(name)) {
			qty_08(value);
			return;
		}
		if ($qty_09.equalsIgnoreCase(name)) {
			qty_09(value);
			return;
		}
		if ($qty_10.equalsIgnoreCase(name)) {
			qty_10(value);
			return;
		}
		if ($qty_11.equalsIgnoreCase(name)) {
			qty_11(value);
			return;
		}
		if ($qty_12.equalsIgnoreCase(name)) {
			qty_12(value);
			return;
		}
		if ($qty_13.equalsIgnoreCase(name)) {
			qty_13(value);
			return;
		}
		if ($qty_14.equalsIgnoreCase(name)) {
			qty_14(value);
			return;
		}
		if ($qty_15.equalsIgnoreCase(name)) {
			qty_15(value);
			return;
		}
		if ($qty_16.equalsIgnoreCase(name)) {
			qty_16(value);
			return;
		}
		if ($qty_17.equalsIgnoreCase(name)) {
			qty_17(value);
			return;
		}
		if ($qty_18.equalsIgnoreCase(name)) {
			qty_18(value);
			return;
		}
		if ($qty_19.equalsIgnoreCase(name)) {
			qty_19(value);
			return;
		}
		if ($qty_20.equalsIgnoreCase(name)) {
			qty_20(value);
			return;
		}
		if ($qty_21.equalsIgnoreCase(name)) {
			qty_21(value);
			return;
		}
		if ($qty_22.equalsIgnoreCase(name)) {
			qty_22(value);
			return;
		}
		if ($qty_23.equalsIgnoreCase(name)) {
			qty_23(value);
			return;
		}
		if ($qty_24.equalsIgnoreCase(name)) {
			qty_24(value);
			return;
		}
		if ($qty_25.equalsIgnoreCase(name)) {
			qty_25(value);
			return;
		}
		if ($qty_26.equalsIgnoreCase(name)) {
			qty_26(value);
			return;
		}
		if ($qty_27.equalsIgnoreCase(name)) {
			qty_27(value);
			return;
		}
		if ($qty_28.equalsIgnoreCase(name)) {
			qty_28(value);
			return;
		}
		if ($qty_29.equalsIgnoreCase(name)) {
			qty_29(value);
			return;
		}
		if ($qty_30.equalsIgnoreCase(name)) {
			qty_30(value);
			return;
		}
		if ($qty_31.equalsIgnoreCase(name)) {
			qty_31(value);
			return;
		}
		if ($qty_32.equalsIgnoreCase(name)) {
			qty_32(value);
			return;
		}
		if ($qty_33.equalsIgnoreCase(name)) {
			qty_33(value);
			return;
		}
		if ($qty_34.equalsIgnoreCase(name)) {
			qty_34(value);
			return;
		}
		if ($qty_35.equalsIgnoreCase(name)) {
			qty_35(value);
			return;
		}
		if ($qty_36.equalsIgnoreCase(name)) {
			qty_36(value);
			return;
		}
		if ($qty_37.equalsIgnoreCase(name)) {
			qty_37(value);
			return;
		}
		if ($qty_38.equalsIgnoreCase(name)) {
			qty_38(value);
			return;
		}
		if ($qty_39.equalsIgnoreCase(name)) {
			qty_39(value);
			return;
		}
		if ($qty_40.equalsIgnoreCase(name)) {
			qty_40(value);
			return;
		}
		if ($qty_41.equalsIgnoreCase(name)) {
			qty_41(value);
			return;
		}
		if ($qty_42.equalsIgnoreCase(name)) {
			qty_42(value);
			return;
		}
		if ($qty_43.equalsIgnoreCase(name)) {
			qty_43(value);
			return;
		}
		if ($qty_44.equalsIgnoreCase(name)) {
			qty_44(value);
			return;
		}
		if ($qty_45.equalsIgnoreCase(name)) {
			qty_45(value);
			return;
		}
		if ($qty_46.equalsIgnoreCase(name)) {
			qty_46(value);
			return;
		}
		if ($qty_47.equalsIgnoreCase(name)) {
			qty_47(value);
			return;
		}
		if ($qty_48.equalsIgnoreCase(name)) {
			qty_48(value);
			return;
		}
		if ($qty_49.equalsIgnoreCase(name)) {
			qty_49(value);
			return;
		}
		if ($qty_50.equalsIgnoreCase(name)) {
			qty_50(value);
			return;
		}
		if ($qty_51.equalsIgnoreCase(name)) {
			qty_51(value);
			return;
		}
		if ($qty_52.equalsIgnoreCase(name)) {
			qty_52(value);
			return;
		}
		if ($qty_53.equalsIgnoreCase(name)) {
			qty_53(value);
			return;
		}
		if ($qty_54.equalsIgnoreCase(name)) {
			qty_54(value);
			return;
		}
		if ($qty_55.equalsIgnoreCase(name)) {
			qty_55(value);
			return;
		}
		if ($qty_56.equalsIgnoreCase(name)) {
			qty_56(value);
			return;
		}
		if ($qty_57.equalsIgnoreCase(name)) {
			qty_57(value);
			return;
		}
		if ($qty_58.equalsIgnoreCase(name)) {
			qty_58(value);
			return;
		}
		if ($qty_59.equalsIgnoreCase(name)) {
			qty_59(value);
			return;
		}
		if ($qty_60.equalsIgnoreCase(name)) {
			qty_60(value);
			return;
		}
		if ($qty_61.equalsIgnoreCase(name)) {
			qty_61(value);
			return;
		}
		if ($qty_62.equalsIgnoreCase(name)) {
			qty_62(value);
			return;
		}
		if ($qty_63.equalsIgnoreCase(name)) {
			qty_63(value);
			return;
		}
		if ($qty_64.equalsIgnoreCase(name)) {
			qty_64(value);
			return;
		}
		if ($qty_65.equalsIgnoreCase(name)) {
			qty_65(value);
			return;
		}
		if ($qty_66.equalsIgnoreCase(name)) {
			qty_66(value);
			return;
		}
		if ($qty_67.equalsIgnoreCase(name)) {
			qty_67(value);
			return;
		}
		if ($qty_68.equalsIgnoreCase(name)) {
			qty_68(value);
			return;
		}
		if ($qty_69.equalsIgnoreCase(name)) {
			qty_69(value);
			return;
		}
		if ($qty_70.equalsIgnoreCase(name)) {
			qty_70(value);
			return;
		}
		if ($qty_71.equalsIgnoreCase(name)) {
			qty_71(value);
			return;
		}
		if ($qty_72.equalsIgnoreCase(name)) {
			qty_72(value);
			return;
		}
		if ($qty_73.equalsIgnoreCase(name)) {
			qty_73(value);
			return;
		}
		if ($qty_74.equalsIgnoreCase(name)) {
			qty_74(value);
			return;
		}
		if ($qty_75.equalsIgnoreCase(name)) {
			qty_75(value);
			return;
		}
		if ($qty_76.equalsIgnoreCase(name)) {
			qty_76(value);
			return;
		}
		if ($qty_77.equalsIgnoreCase(name)) {
			qty_77(value);
			return;
		}
		if ($qty_78.equalsIgnoreCase(name)) {
			qty_78(value);
			return;
		}
		if ($qty_79.equalsIgnoreCase(name)) {
			qty_79(value);
			return;
		}
		if ($qty_80.equalsIgnoreCase(name)) {
			qty_80(value);
			return;
		}
		if ($qty_81.equalsIgnoreCase(name)) {
			qty_81(value);
			return;
		}
		if ($qty_82.equalsIgnoreCase(name)) {
			qty_82(value);
			return;
		}
		if ($qty_83.equalsIgnoreCase(name)) {
			qty_83(value);
			return;
		}
		if ($qty_84.equalsIgnoreCase(name)) {
			qty_84(value);
			return;
		}
		if ($qty_85.equalsIgnoreCase(name)) {
			qty_85(value);
			return;
		}
		if ($qty_86.equalsIgnoreCase(name)) {
			qty_86(value);
			return;
		}
		if ($qty_87.equalsIgnoreCase(name)) {
			qty_87(value);
			return;
		}
		if ($qty_88.equalsIgnoreCase(name)) {
			qty_88(value);
			return;
		}
		if ($qty_89.equalsIgnoreCase(name)) {
			qty_89(value);
			return;
		}
		if ($qty_90.equalsIgnoreCase(name)) {
			qty_90(value);
			return;
		}
		if ($qty_91.equalsIgnoreCase(name)) {
			qty_91(value);
			return;
		}
		if ($qty_92.equalsIgnoreCase(name)) {
			qty_92(value);
			return;
		}
		if ($qty_93.equalsIgnoreCase(name)) {
			qty_93(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($qty_00.equalsIgnoreCase(name)) {
			qty_00(value);
			return;
		}
		if ($qty_01.equalsIgnoreCase(name)) {
			qty_01(value);
			return;
		}
		if ($qty_02.equalsIgnoreCase(name)) {
			qty_02(value);
			return;
		}
		if ($qty_03.equalsIgnoreCase(name)) {
			qty_03(value);
			return;
		}
		if ($qty_04.equalsIgnoreCase(name)) {
			qty_04(value);
			return;
		}
		if ($qty_05.equalsIgnoreCase(name)) {
			qty_05(value);
			return;
		}
		if ($qty_06.equalsIgnoreCase(name)) {
			qty_06(value);
			return;
		}
		if ($qty_07.equalsIgnoreCase(name)) {
			qty_07(value);
			return;
		}
		if ($qty_08.equalsIgnoreCase(name)) {
			qty_08(value);
			return;
		}
		if ($qty_09.equalsIgnoreCase(name)) {
			qty_09(value);
			return;
		}
		if ($qty_10.equalsIgnoreCase(name)) {
			qty_10(value);
			return;
		}
		if ($qty_11.equalsIgnoreCase(name)) {
			qty_11(value);
			return;
		}
		if ($qty_12.equalsIgnoreCase(name)) {
			qty_12(value);
			return;
		}
		if ($qty_13.equalsIgnoreCase(name)) {
			qty_13(value);
			return;
		}
		if ($qty_14.equalsIgnoreCase(name)) {
			qty_14(value);
			return;
		}
		if ($qty_15.equalsIgnoreCase(name)) {
			qty_15(value);
			return;
		}
		if ($qty_16.equalsIgnoreCase(name)) {
			qty_16(value);
			return;
		}
		if ($qty_17.equalsIgnoreCase(name)) {
			qty_17(value);
			return;
		}
		if ($qty_18.equalsIgnoreCase(name)) {
			qty_18(value);
			return;
		}
		if ($qty_19.equalsIgnoreCase(name)) {
			qty_19(value);
			return;
		}
		if ($qty_20.equalsIgnoreCase(name)) {
			qty_20(value);
			return;
		}
		if ($qty_21.equalsIgnoreCase(name)) {
			qty_21(value);
			return;
		}
		if ($qty_22.equalsIgnoreCase(name)) {
			qty_22(value);
			return;
		}
		if ($qty_23.equalsIgnoreCase(name)) {
			qty_23(value);
			return;
		}
		if ($qty_24.equalsIgnoreCase(name)) {
			qty_24(value);
			return;
		}
		if ($qty_25.equalsIgnoreCase(name)) {
			qty_25(value);
			return;
		}
		if ($qty_26.equalsIgnoreCase(name)) {
			qty_26(value);
			return;
		}
		if ($qty_27.equalsIgnoreCase(name)) {
			qty_27(value);
			return;
		}
		if ($qty_28.equalsIgnoreCase(name)) {
			qty_28(value);
			return;
		}
		if ($qty_29.equalsIgnoreCase(name)) {
			qty_29(value);
			return;
		}
		if ($qty_30.equalsIgnoreCase(name)) {
			qty_30(value);
			return;
		}
		if ($qty_31.equalsIgnoreCase(name)) {
			qty_31(value);
			return;
		}
		if ($qty_32.equalsIgnoreCase(name)) {
			qty_32(value);
			return;
		}
		if ($qty_33.equalsIgnoreCase(name)) {
			qty_33(value);
			return;
		}
		if ($qty_34.equalsIgnoreCase(name)) {
			qty_34(value);
			return;
		}
		if ($qty_35.equalsIgnoreCase(name)) {
			qty_35(value);
			return;
		}
		if ($qty_36.equalsIgnoreCase(name)) {
			qty_36(value);
			return;
		}
		if ($qty_37.equalsIgnoreCase(name)) {
			qty_37(value);
			return;
		}
		if ($qty_38.equalsIgnoreCase(name)) {
			qty_38(value);
			return;
		}
		if ($qty_39.equalsIgnoreCase(name)) {
			qty_39(value);
			return;
		}
		if ($qty_40.equalsIgnoreCase(name)) {
			qty_40(value);
			return;
		}
		if ($qty_41.equalsIgnoreCase(name)) {
			qty_41(value);
			return;
		}
		if ($qty_42.equalsIgnoreCase(name)) {
			qty_42(value);
			return;
		}
		if ($qty_43.equalsIgnoreCase(name)) {
			qty_43(value);
			return;
		}
		if ($qty_44.equalsIgnoreCase(name)) {
			qty_44(value);
			return;
		}
		if ($qty_45.equalsIgnoreCase(name)) {
			qty_45(value);
			return;
		}
		if ($qty_46.equalsIgnoreCase(name)) {
			qty_46(value);
			return;
		}
		if ($qty_47.equalsIgnoreCase(name)) {
			qty_47(value);
			return;
		}
		if ($qty_48.equalsIgnoreCase(name)) {
			qty_48(value);
			return;
		}
		if ($qty_49.equalsIgnoreCase(name)) {
			qty_49(value);
			return;
		}
		if ($qty_50.equalsIgnoreCase(name)) {
			qty_50(value);
			return;
		}
		if ($qty_51.equalsIgnoreCase(name)) {
			qty_51(value);
			return;
		}
		if ($qty_52.equalsIgnoreCase(name)) {
			qty_52(value);
			return;
		}
		if ($qty_53.equalsIgnoreCase(name)) {
			qty_53(value);
			return;
		}
		if ($qty_54.equalsIgnoreCase(name)) {
			qty_54(value);
			return;
		}
		if ($qty_55.equalsIgnoreCase(name)) {
			qty_55(value);
			return;
		}
		if ($qty_56.equalsIgnoreCase(name)) {
			qty_56(value);
			return;
		}
		if ($qty_57.equalsIgnoreCase(name)) {
			qty_57(value);
			return;
		}
		if ($qty_58.equalsIgnoreCase(name)) {
			qty_58(value);
			return;
		}
		if ($qty_59.equalsIgnoreCase(name)) {
			qty_59(value);
			return;
		}
		if ($qty_60.equalsIgnoreCase(name)) {
			qty_60(value);
			return;
		}
		if ($qty_61.equalsIgnoreCase(name)) {
			qty_61(value);
			return;
		}
		if ($qty_62.equalsIgnoreCase(name)) {
			qty_62(value);
			return;
		}
		if ($qty_63.equalsIgnoreCase(name)) {
			qty_63(value);
			return;
		}
		if ($qty_64.equalsIgnoreCase(name)) {
			qty_64(value);
			return;
		}
		if ($qty_65.equalsIgnoreCase(name)) {
			qty_65(value);
			return;
		}
		if ($qty_66.equalsIgnoreCase(name)) {
			qty_66(value);
			return;
		}
		if ($qty_67.equalsIgnoreCase(name)) {
			qty_67(value);
			return;
		}
		if ($qty_68.equalsIgnoreCase(name)) {
			qty_68(value);
			return;
		}
		if ($qty_69.equalsIgnoreCase(name)) {
			qty_69(value);
			return;
		}
		if ($qty_70.equalsIgnoreCase(name)) {
			qty_70(value);
			return;
		}
		if ($qty_71.equalsIgnoreCase(name)) {
			qty_71(value);
			return;
		}
		if ($qty_72.equalsIgnoreCase(name)) {
			qty_72(value);
			return;
		}
		if ($qty_73.equalsIgnoreCase(name)) {
			qty_73(value);
			return;
		}
		if ($qty_74.equalsIgnoreCase(name)) {
			qty_74(value);
			return;
		}
		if ($qty_75.equalsIgnoreCase(name)) {
			qty_75(value);
			return;
		}
		if ($qty_76.equalsIgnoreCase(name)) {
			qty_76(value);
			return;
		}
		if ($qty_77.equalsIgnoreCase(name)) {
			qty_77(value);
			return;
		}
		if ($qty_78.equalsIgnoreCase(name)) {
			qty_78(value);
			return;
		}
		if ($qty_79.equalsIgnoreCase(name)) {
			qty_79(value);
			return;
		}
		if ($qty_80.equalsIgnoreCase(name)) {
			qty_80(value);
			return;
		}
		if ($qty_81.equalsIgnoreCase(name)) {
			qty_81(value);
			return;
		}
		if ($qty_82.equalsIgnoreCase(name)) {
			qty_82(value);
			return;
		}
		if ($qty_83.equalsIgnoreCase(name)) {
			qty_83(value);
			return;
		}
		if ($qty_84.equalsIgnoreCase(name)) {
			qty_84(value);
			return;
		}
		if ($qty_85.equalsIgnoreCase(name)) {
			qty_85(value);
			return;
		}
		if ($qty_86.equalsIgnoreCase(name)) {
			qty_86(value);
			return;
		}
		if ($qty_87.equalsIgnoreCase(name)) {
			qty_87(value);
			return;
		}
		if ($qty_88.equalsIgnoreCase(name)) {
			qty_88(value);
			return;
		}
		if ($qty_89.equalsIgnoreCase(name)) {
			qty_89(value);
			return;
		}
		if ($qty_90.equalsIgnoreCase(name)) {
			qty_90(value);
			return;
		}
		if ($qty_91.equalsIgnoreCase(name)) {
			qty_91(value);
			return;
		}
		if ($qty_92.equalsIgnoreCase(name)) {
			qty_92(value);
			return;
		}
		if ($qty_93.equalsIgnoreCase(name)) {
			qty_93(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($qty_00.equalsIgnoreCase(name)) {
			qty_00(value);
			return;
		}
		if ($qty_01.equalsIgnoreCase(name)) {
			qty_01(value);
			return;
		}
		if ($qty_02.equalsIgnoreCase(name)) {
			qty_02(value);
			return;
		}
		if ($qty_03.equalsIgnoreCase(name)) {
			qty_03(value);
			return;
		}
		if ($qty_04.equalsIgnoreCase(name)) {
			qty_04(value);
			return;
		}
		if ($qty_05.equalsIgnoreCase(name)) {
			qty_05(value);
			return;
		}
		if ($qty_06.equalsIgnoreCase(name)) {
			qty_06(value);
			return;
		}
		if ($qty_07.equalsIgnoreCase(name)) {
			qty_07(value);
			return;
		}
		if ($qty_08.equalsIgnoreCase(name)) {
			qty_08(value);
			return;
		}
		if ($qty_09.equalsIgnoreCase(name)) {
			qty_09(value);
			return;
		}
		if ($qty_10.equalsIgnoreCase(name)) {
			qty_10(value);
			return;
		}
		if ($qty_11.equalsIgnoreCase(name)) {
			qty_11(value);
			return;
		}
		if ($qty_12.equalsIgnoreCase(name)) {
			qty_12(value);
			return;
		}
		if ($qty_13.equalsIgnoreCase(name)) {
			qty_13(value);
			return;
		}
		if ($qty_14.equalsIgnoreCase(name)) {
			qty_14(value);
			return;
		}
		if ($qty_15.equalsIgnoreCase(name)) {
			qty_15(value);
			return;
		}
		if ($qty_16.equalsIgnoreCase(name)) {
			qty_16(value);
			return;
		}
		if ($qty_17.equalsIgnoreCase(name)) {
			qty_17(value);
			return;
		}
		if ($qty_18.equalsIgnoreCase(name)) {
			qty_18(value);
			return;
		}
		if ($qty_19.equalsIgnoreCase(name)) {
			qty_19(value);
			return;
		}
		if ($qty_20.equalsIgnoreCase(name)) {
			qty_20(value);
			return;
		}
		if ($qty_21.equalsIgnoreCase(name)) {
			qty_21(value);
			return;
		}
		if ($qty_22.equalsIgnoreCase(name)) {
			qty_22(value);
			return;
		}
		if ($qty_23.equalsIgnoreCase(name)) {
			qty_23(value);
			return;
		}
		if ($qty_24.equalsIgnoreCase(name)) {
			qty_24(value);
			return;
		}
		if ($qty_25.equalsIgnoreCase(name)) {
			qty_25(value);
			return;
		}
		if ($qty_26.equalsIgnoreCase(name)) {
			qty_26(value);
			return;
		}
		if ($qty_27.equalsIgnoreCase(name)) {
			qty_27(value);
			return;
		}
		if ($qty_28.equalsIgnoreCase(name)) {
			qty_28(value);
			return;
		}
		if ($qty_29.equalsIgnoreCase(name)) {
			qty_29(value);
			return;
		}
		if ($qty_30.equalsIgnoreCase(name)) {
			qty_30(value);
			return;
		}
		if ($qty_31.equalsIgnoreCase(name)) {
			qty_31(value);
			return;
		}
		if ($qty_32.equalsIgnoreCase(name)) {
			qty_32(value);
			return;
		}
		if ($qty_33.equalsIgnoreCase(name)) {
			qty_33(value);
			return;
		}
		if ($qty_34.equalsIgnoreCase(name)) {
			qty_34(value);
			return;
		}
		if ($qty_35.equalsIgnoreCase(name)) {
			qty_35(value);
			return;
		}
		if ($qty_36.equalsIgnoreCase(name)) {
			qty_36(value);
			return;
		}
		if ($qty_37.equalsIgnoreCase(name)) {
			qty_37(value);
			return;
		}
		if ($qty_38.equalsIgnoreCase(name)) {
			qty_38(value);
			return;
		}
		if ($qty_39.equalsIgnoreCase(name)) {
			qty_39(value);
			return;
		}
		if ($qty_40.equalsIgnoreCase(name)) {
			qty_40(value);
			return;
		}
		if ($qty_41.equalsIgnoreCase(name)) {
			qty_41(value);
			return;
		}
		if ($qty_42.equalsIgnoreCase(name)) {
			qty_42(value);
			return;
		}
		if ($qty_43.equalsIgnoreCase(name)) {
			qty_43(value);
			return;
		}
		if ($qty_44.equalsIgnoreCase(name)) {
			qty_44(value);
			return;
		}
		if ($qty_45.equalsIgnoreCase(name)) {
			qty_45(value);
			return;
		}
		if ($qty_46.equalsIgnoreCase(name)) {
			qty_46(value);
			return;
		}
		if ($qty_47.equalsIgnoreCase(name)) {
			qty_47(value);
			return;
		}
		if ($qty_48.equalsIgnoreCase(name)) {
			qty_48(value);
			return;
		}
		if ($qty_49.equalsIgnoreCase(name)) {
			qty_49(value);
			return;
		}
		if ($qty_50.equalsIgnoreCase(name)) {
			qty_50(value);
			return;
		}
		if ($qty_51.equalsIgnoreCase(name)) {
			qty_51(value);
			return;
		}
		if ($qty_52.equalsIgnoreCase(name)) {
			qty_52(value);
			return;
		}
		if ($qty_53.equalsIgnoreCase(name)) {
			qty_53(value);
			return;
		}
		if ($qty_54.equalsIgnoreCase(name)) {
			qty_54(value);
			return;
		}
		if ($qty_55.equalsIgnoreCase(name)) {
			qty_55(value);
			return;
		}
		if ($qty_56.equalsIgnoreCase(name)) {
			qty_56(value);
			return;
		}
		if ($qty_57.equalsIgnoreCase(name)) {
			qty_57(value);
			return;
		}
		if ($qty_58.equalsIgnoreCase(name)) {
			qty_58(value);
			return;
		}
		if ($qty_59.equalsIgnoreCase(name)) {
			qty_59(value);
			return;
		}
		if ($qty_60.equalsIgnoreCase(name)) {
			qty_60(value);
			return;
		}
		if ($qty_61.equalsIgnoreCase(name)) {
			qty_61(value);
			return;
		}
		if ($qty_62.equalsIgnoreCase(name)) {
			qty_62(value);
			return;
		}
		if ($qty_63.equalsIgnoreCase(name)) {
			qty_63(value);
			return;
		}
		if ($qty_64.equalsIgnoreCase(name)) {
			qty_64(value);
			return;
		}
		if ($qty_65.equalsIgnoreCase(name)) {
			qty_65(value);
			return;
		}
		if ($qty_66.equalsIgnoreCase(name)) {
			qty_66(value);
			return;
		}
		if ($qty_67.equalsIgnoreCase(name)) {
			qty_67(value);
			return;
		}
		if ($qty_68.equalsIgnoreCase(name)) {
			qty_68(value);
			return;
		}
		if ($qty_69.equalsIgnoreCase(name)) {
			qty_69(value);
			return;
		}
		if ($qty_70.equalsIgnoreCase(name)) {
			qty_70(value);
			return;
		}
		if ($qty_71.equalsIgnoreCase(name)) {
			qty_71(value);
			return;
		}
		if ($qty_72.equalsIgnoreCase(name)) {
			qty_72(value);
			return;
		}
		if ($qty_73.equalsIgnoreCase(name)) {
			qty_73(value);
			return;
		}
		if ($qty_74.equalsIgnoreCase(name)) {
			qty_74(value);
			return;
		}
		if ($qty_75.equalsIgnoreCase(name)) {
			qty_75(value);
			return;
		}
		if ($qty_76.equalsIgnoreCase(name)) {
			qty_76(value);
			return;
		}
		if ($qty_77.equalsIgnoreCase(name)) {
			qty_77(value);
			return;
		}
		if ($qty_78.equalsIgnoreCase(name)) {
			qty_78(value);
			return;
		}
		if ($qty_79.equalsIgnoreCase(name)) {
			qty_79(value);
			return;
		}
		if ($qty_80.equalsIgnoreCase(name)) {
			qty_80(value);
			return;
		}
		if ($qty_81.equalsIgnoreCase(name)) {
			qty_81(value);
			return;
		}
		if ($qty_82.equalsIgnoreCase(name)) {
			qty_82(value);
			return;
		}
		if ($qty_83.equalsIgnoreCase(name)) {
			qty_83(value);
			return;
		}
		if ($qty_84.equalsIgnoreCase(name)) {
			qty_84(value);
			return;
		}
		if ($qty_85.equalsIgnoreCase(name)) {
			qty_85(value);
			return;
		}
		if ($qty_86.equalsIgnoreCase(name)) {
			qty_86(value);
			return;
		}
		if ($qty_87.equalsIgnoreCase(name)) {
			qty_87(value);
			return;
		}
		if ($qty_88.equalsIgnoreCase(name)) {
			qty_88(value);
			return;
		}
		if ($qty_89.equalsIgnoreCase(name)) {
			qty_89(value);
			return;
		}
		if ($qty_90.equalsIgnoreCase(name)) {
			qty_90(value);
			return;
		}
		if ($qty_91.equalsIgnoreCase(name)) {
			qty_91(value);
			return;
		}
		if ($qty_92.equalsIgnoreCase(name)) {
			qty_92(value);
			return;
		}
		if ($qty_93.equalsIgnoreCase(name)) {
			qty_93(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($qty_00.equalsIgnoreCase(name)) {
			qty_00(value);
			return;
		}
		if ($qty_01.equalsIgnoreCase(name)) {
			qty_01(value);
			return;
		}
		if ($qty_02.equalsIgnoreCase(name)) {
			qty_02(value);
			return;
		}
		if ($qty_03.equalsIgnoreCase(name)) {
			qty_03(value);
			return;
		}
		if ($qty_04.equalsIgnoreCase(name)) {
			qty_04(value);
			return;
		}
		if ($qty_05.equalsIgnoreCase(name)) {
			qty_05(value);
			return;
		}
		if ($qty_06.equalsIgnoreCase(name)) {
			qty_06(value);
			return;
		}
		if ($qty_07.equalsIgnoreCase(name)) {
			qty_07(value);
			return;
		}
		if ($qty_08.equalsIgnoreCase(name)) {
			qty_08(value);
			return;
		}
		if ($qty_09.equalsIgnoreCase(name)) {
			qty_09(value);
			return;
		}
		if ($qty_10.equalsIgnoreCase(name)) {
			qty_10(value);
			return;
		}
		if ($qty_11.equalsIgnoreCase(name)) {
			qty_11(value);
			return;
		}
		if ($qty_12.equalsIgnoreCase(name)) {
			qty_12(value);
			return;
		}
		if ($qty_13.equalsIgnoreCase(name)) {
			qty_13(value);
			return;
		}
		if ($qty_14.equalsIgnoreCase(name)) {
			qty_14(value);
			return;
		}
		if ($qty_15.equalsIgnoreCase(name)) {
			qty_15(value);
			return;
		}
		if ($qty_16.equalsIgnoreCase(name)) {
			qty_16(value);
			return;
		}
		if ($qty_17.equalsIgnoreCase(name)) {
			qty_17(value);
			return;
		}
		if ($qty_18.equalsIgnoreCase(name)) {
			qty_18(value);
			return;
		}
		if ($qty_19.equalsIgnoreCase(name)) {
			qty_19(value);
			return;
		}
		if ($qty_20.equalsIgnoreCase(name)) {
			qty_20(value);
			return;
		}
		if ($qty_21.equalsIgnoreCase(name)) {
			qty_21(value);
			return;
		}
		if ($qty_22.equalsIgnoreCase(name)) {
			qty_22(value);
			return;
		}
		if ($qty_23.equalsIgnoreCase(name)) {
			qty_23(value);
			return;
		}
		if ($qty_24.equalsIgnoreCase(name)) {
			qty_24(value);
			return;
		}
		if ($qty_25.equalsIgnoreCase(name)) {
			qty_25(value);
			return;
		}
		if ($qty_26.equalsIgnoreCase(name)) {
			qty_26(value);
			return;
		}
		if ($qty_27.equalsIgnoreCase(name)) {
			qty_27(value);
			return;
		}
		if ($qty_28.equalsIgnoreCase(name)) {
			qty_28(value);
			return;
		}
		if ($qty_29.equalsIgnoreCase(name)) {
			qty_29(value);
			return;
		}
		if ($qty_30.equalsIgnoreCase(name)) {
			qty_30(value);
			return;
		}
		if ($qty_31.equalsIgnoreCase(name)) {
			qty_31(value);
			return;
		}
		if ($qty_32.equalsIgnoreCase(name)) {
			qty_32(value);
			return;
		}
		if ($qty_33.equalsIgnoreCase(name)) {
			qty_33(value);
			return;
		}
		if ($qty_34.equalsIgnoreCase(name)) {
			qty_34(value);
			return;
		}
		if ($qty_35.equalsIgnoreCase(name)) {
			qty_35(value);
			return;
		}
		if ($qty_36.equalsIgnoreCase(name)) {
			qty_36(value);
			return;
		}
		if ($qty_37.equalsIgnoreCase(name)) {
			qty_37(value);
			return;
		}
		if ($qty_38.equalsIgnoreCase(name)) {
			qty_38(value);
			return;
		}
		if ($qty_39.equalsIgnoreCase(name)) {
			qty_39(value);
			return;
		}
		if ($qty_40.equalsIgnoreCase(name)) {
			qty_40(value);
			return;
		}
		if ($qty_41.equalsIgnoreCase(name)) {
			qty_41(value);
			return;
		}
		if ($qty_42.equalsIgnoreCase(name)) {
			qty_42(value);
			return;
		}
		if ($qty_43.equalsIgnoreCase(name)) {
			qty_43(value);
			return;
		}
		if ($qty_44.equalsIgnoreCase(name)) {
			qty_44(value);
			return;
		}
		if ($qty_45.equalsIgnoreCase(name)) {
			qty_45(value);
			return;
		}
		if ($qty_46.equalsIgnoreCase(name)) {
			qty_46(value);
			return;
		}
		if ($qty_47.equalsIgnoreCase(name)) {
			qty_47(value);
			return;
		}
		if ($qty_48.equalsIgnoreCase(name)) {
			qty_48(value);
			return;
		}
		if ($qty_49.equalsIgnoreCase(name)) {
			qty_49(value);
			return;
		}
		if ($qty_50.equalsIgnoreCase(name)) {
			qty_50(value);
			return;
		}
		if ($qty_51.equalsIgnoreCase(name)) {
			qty_51(value);
			return;
		}
		if ($qty_52.equalsIgnoreCase(name)) {
			qty_52(value);
			return;
		}
		if ($qty_53.equalsIgnoreCase(name)) {
			qty_53(value);
			return;
		}
		if ($qty_54.equalsIgnoreCase(name)) {
			qty_54(value);
			return;
		}
		if ($qty_55.equalsIgnoreCase(name)) {
			qty_55(value);
			return;
		}
		if ($qty_56.equalsIgnoreCase(name)) {
			qty_56(value);
			return;
		}
		if ($qty_57.equalsIgnoreCase(name)) {
			qty_57(value);
			return;
		}
		if ($qty_58.equalsIgnoreCase(name)) {
			qty_58(value);
			return;
		}
		if ($qty_59.equalsIgnoreCase(name)) {
			qty_59(value);
			return;
		}
		if ($qty_60.equalsIgnoreCase(name)) {
			qty_60(value);
			return;
		}
		if ($qty_61.equalsIgnoreCase(name)) {
			qty_61(value);
			return;
		}
		if ($qty_62.equalsIgnoreCase(name)) {
			qty_62(value);
			return;
		}
		if ($qty_63.equalsIgnoreCase(name)) {
			qty_63(value);
			return;
		}
		if ($qty_64.equalsIgnoreCase(name)) {
			qty_64(value);
			return;
		}
		if ($qty_65.equalsIgnoreCase(name)) {
			qty_65(value);
			return;
		}
		if ($qty_66.equalsIgnoreCase(name)) {
			qty_66(value);
			return;
		}
		if ($qty_67.equalsIgnoreCase(name)) {
			qty_67(value);
			return;
		}
		if ($qty_68.equalsIgnoreCase(name)) {
			qty_68(value);
			return;
		}
		if ($qty_69.equalsIgnoreCase(name)) {
			qty_69(value);
			return;
		}
		if ($qty_70.equalsIgnoreCase(name)) {
			qty_70(value);
			return;
		}
		if ($qty_71.equalsIgnoreCase(name)) {
			qty_71(value);
			return;
		}
		if ($qty_72.equalsIgnoreCase(name)) {
			qty_72(value);
			return;
		}
		if ($qty_73.equalsIgnoreCase(name)) {
			qty_73(value);
			return;
		}
		if ($qty_74.equalsIgnoreCase(name)) {
			qty_74(value);
			return;
		}
		if ($qty_75.equalsIgnoreCase(name)) {
			qty_75(value);
			return;
		}
		if ($qty_76.equalsIgnoreCase(name)) {
			qty_76(value);
			return;
		}
		if ($qty_77.equalsIgnoreCase(name)) {
			qty_77(value);
			return;
		}
		if ($qty_78.equalsIgnoreCase(name)) {
			qty_78(value);
			return;
		}
		if ($qty_79.equalsIgnoreCase(name)) {
			qty_79(value);
			return;
		}
		if ($qty_80.equalsIgnoreCase(name)) {
			qty_80(value);
			return;
		}
		if ($qty_81.equalsIgnoreCase(name)) {
			qty_81(value);
			return;
		}
		if ($qty_82.equalsIgnoreCase(name)) {
			qty_82(value);
			return;
		}
		if ($qty_83.equalsIgnoreCase(name)) {
			qty_83(value);
			return;
		}
		if ($qty_84.equalsIgnoreCase(name)) {
			qty_84(value);
			return;
		}
		if ($qty_85.equalsIgnoreCase(name)) {
			qty_85(value);
			return;
		}
		if ($qty_86.equalsIgnoreCase(name)) {
			qty_86(value);
			return;
		}
		if ($qty_87.equalsIgnoreCase(name)) {
			qty_87(value);
			return;
		}
		if ($qty_88.equalsIgnoreCase(name)) {
			qty_88(value);
			return;
		}
		if ($qty_89.equalsIgnoreCase(name)) {
			qty_89(value);
			return;
		}
		if ($qty_90.equalsIgnoreCase(name)) {
			qty_90(value);
			return;
		}
		if ($qty_91.equalsIgnoreCase(name)) {
			qty_91(value);
			return;
		}
		if ($qty_92.equalsIgnoreCase(name)) {
			qty_92(value);
			return;
		}
		if ($qty_93.equalsIgnoreCase(name)) {
			qty_93(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			mps_grp_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($qty_00.equalsIgnoreCase(name)) {
			qty_00(value);
			return;
		}
		if ($qty_01.equalsIgnoreCase(name)) {
			qty_01(value);
			return;
		}
		if ($qty_02.equalsIgnoreCase(name)) {
			qty_02(value);
			return;
		}
		if ($qty_03.equalsIgnoreCase(name)) {
			qty_03(value);
			return;
		}
		if ($qty_04.equalsIgnoreCase(name)) {
			qty_04(value);
			return;
		}
		if ($qty_05.equalsIgnoreCase(name)) {
			qty_05(value);
			return;
		}
		if ($qty_06.equalsIgnoreCase(name)) {
			qty_06(value);
			return;
		}
		if ($qty_07.equalsIgnoreCase(name)) {
			qty_07(value);
			return;
		}
		if ($qty_08.equalsIgnoreCase(name)) {
			qty_08(value);
			return;
		}
		if ($qty_09.equalsIgnoreCase(name)) {
			qty_09(value);
			return;
		}
		if ($qty_10.equalsIgnoreCase(name)) {
			qty_10(value);
			return;
		}
		if ($qty_11.equalsIgnoreCase(name)) {
			qty_11(value);
			return;
		}
		if ($qty_12.equalsIgnoreCase(name)) {
			qty_12(value);
			return;
		}
		if ($qty_13.equalsIgnoreCase(name)) {
			qty_13(value);
			return;
		}
		if ($qty_14.equalsIgnoreCase(name)) {
			qty_14(value);
			return;
		}
		if ($qty_15.equalsIgnoreCase(name)) {
			qty_15(value);
			return;
		}
		if ($qty_16.equalsIgnoreCase(name)) {
			qty_16(value);
			return;
		}
		if ($qty_17.equalsIgnoreCase(name)) {
			qty_17(value);
			return;
		}
		if ($qty_18.equalsIgnoreCase(name)) {
			qty_18(value);
			return;
		}
		if ($qty_19.equalsIgnoreCase(name)) {
			qty_19(value);
			return;
		}
		if ($qty_20.equalsIgnoreCase(name)) {
			qty_20(value);
			return;
		}
		if ($qty_21.equalsIgnoreCase(name)) {
			qty_21(value);
			return;
		}
		if ($qty_22.equalsIgnoreCase(name)) {
			qty_22(value);
			return;
		}
		if ($qty_23.equalsIgnoreCase(name)) {
			qty_23(value);
			return;
		}
		if ($qty_24.equalsIgnoreCase(name)) {
			qty_24(value);
			return;
		}
		if ($qty_25.equalsIgnoreCase(name)) {
			qty_25(value);
			return;
		}
		if ($qty_26.equalsIgnoreCase(name)) {
			qty_26(value);
			return;
		}
		if ($qty_27.equalsIgnoreCase(name)) {
			qty_27(value);
			return;
		}
		if ($qty_28.equalsIgnoreCase(name)) {
			qty_28(value);
			return;
		}
		if ($qty_29.equalsIgnoreCase(name)) {
			qty_29(value);
			return;
		}
		if ($qty_30.equalsIgnoreCase(name)) {
			qty_30(value);
			return;
		}
		if ($qty_31.equalsIgnoreCase(name)) {
			qty_31(value);
			return;
		}
		if ($qty_32.equalsIgnoreCase(name)) {
			qty_32(value);
			return;
		}
		if ($qty_33.equalsIgnoreCase(name)) {
			qty_33(value);
			return;
		}
		if ($qty_34.equalsIgnoreCase(name)) {
			qty_34(value);
			return;
		}
		if ($qty_35.equalsIgnoreCase(name)) {
			qty_35(value);
			return;
		}
		if ($qty_36.equalsIgnoreCase(name)) {
			qty_36(value);
			return;
		}
		if ($qty_37.equalsIgnoreCase(name)) {
			qty_37(value);
			return;
		}
		if ($qty_38.equalsIgnoreCase(name)) {
			qty_38(value);
			return;
		}
		if ($qty_39.equalsIgnoreCase(name)) {
			qty_39(value);
			return;
		}
		if ($qty_40.equalsIgnoreCase(name)) {
			qty_40(value);
			return;
		}
		if ($qty_41.equalsIgnoreCase(name)) {
			qty_41(value);
			return;
		}
		if ($qty_42.equalsIgnoreCase(name)) {
			qty_42(value);
			return;
		}
		if ($qty_43.equalsIgnoreCase(name)) {
			qty_43(value);
			return;
		}
		if ($qty_44.equalsIgnoreCase(name)) {
			qty_44(value);
			return;
		}
		if ($qty_45.equalsIgnoreCase(name)) {
			qty_45(value);
			return;
		}
		if ($qty_46.equalsIgnoreCase(name)) {
			qty_46(value);
			return;
		}
		if ($qty_47.equalsIgnoreCase(name)) {
			qty_47(value);
			return;
		}
		if ($qty_48.equalsIgnoreCase(name)) {
			qty_48(value);
			return;
		}
		if ($qty_49.equalsIgnoreCase(name)) {
			qty_49(value);
			return;
		}
		if ($qty_50.equalsIgnoreCase(name)) {
			qty_50(value);
			return;
		}
		if ($qty_51.equalsIgnoreCase(name)) {
			qty_51(value);
			return;
		}
		if ($qty_52.equalsIgnoreCase(name)) {
			qty_52(value);
			return;
		}
		if ($qty_53.equalsIgnoreCase(name)) {
			qty_53(value);
			return;
		}
		if ($qty_54.equalsIgnoreCase(name)) {
			qty_54(value);
			return;
		}
		if ($qty_55.equalsIgnoreCase(name)) {
			qty_55(value);
			return;
		}
		if ($qty_56.equalsIgnoreCase(name)) {
			qty_56(value);
			return;
		}
		if ($qty_57.equalsIgnoreCase(name)) {
			qty_57(value);
			return;
		}
		if ($qty_58.equalsIgnoreCase(name)) {
			qty_58(value);
			return;
		}
		if ($qty_59.equalsIgnoreCase(name)) {
			qty_59(value);
			return;
		}
		if ($qty_60.equalsIgnoreCase(name)) {
			qty_60(value);
			return;
		}
		if ($qty_61.equalsIgnoreCase(name)) {
			qty_61(value);
			return;
		}
		if ($qty_62.equalsIgnoreCase(name)) {
			qty_62(value);
			return;
		}
		if ($qty_63.equalsIgnoreCase(name)) {
			qty_63(value);
			return;
		}
		if ($qty_64.equalsIgnoreCase(name)) {
			qty_64(value);
			return;
		}
		if ($qty_65.equalsIgnoreCase(name)) {
			qty_65(value);
			return;
		}
		if ($qty_66.equalsIgnoreCase(name)) {
			qty_66(value);
			return;
		}
		if ($qty_67.equalsIgnoreCase(name)) {
			qty_67(value);
			return;
		}
		if ($qty_68.equalsIgnoreCase(name)) {
			qty_68(value);
			return;
		}
		if ($qty_69.equalsIgnoreCase(name)) {
			qty_69(value);
			return;
		}
		if ($qty_70.equalsIgnoreCase(name)) {
			qty_70(value);
			return;
		}
		if ($qty_71.equalsIgnoreCase(name)) {
			qty_71(value);
			return;
		}
		if ($qty_72.equalsIgnoreCase(name)) {
			qty_72(value);
			return;
		}
		if ($qty_73.equalsIgnoreCase(name)) {
			qty_73(value);
			return;
		}
		if ($qty_74.equalsIgnoreCase(name)) {
			qty_74(value);
			return;
		}
		if ($qty_75.equalsIgnoreCase(name)) {
			qty_75(value);
			return;
		}
		if ($qty_76.equalsIgnoreCase(name)) {
			qty_76(value);
			return;
		}
		if ($qty_77.equalsIgnoreCase(name)) {
			qty_77(value);
			return;
		}
		if ($qty_78.equalsIgnoreCase(name)) {
			qty_78(value);
			return;
		}
		if ($qty_79.equalsIgnoreCase(name)) {
			qty_79(value);
			return;
		}
		if ($qty_80.equalsIgnoreCase(name)) {
			qty_80(value);
			return;
		}
		if ($qty_81.equalsIgnoreCase(name)) {
			qty_81(value);
			return;
		}
		if ($qty_82.equalsIgnoreCase(name)) {
			qty_82(value);
			return;
		}
		if ($qty_83.equalsIgnoreCase(name)) {
			qty_83(value);
			return;
		}
		if ($qty_84.equalsIgnoreCase(name)) {
			qty_84(value);
			return;
		}
		if ($qty_85.equalsIgnoreCase(name)) {
			qty_85(value);
			return;
		}
		if ($qty_86.equalsIgnoreCase(name)) {
			qty_86(value);
			return;
		}
		if ($qty_87.equalsIgnoreCase(name)) {
			qty_87(value);
			return;
		}
		if ($qty_88.equalsIgnoreCase(name)) {
			qty_88(value);
			return;
		}
		if ($qty_89.equalsIgnoreCase(name)) {
			qty_89(value);
			return;
		}
		if ($qty_90.equalsIgnoreCase(name)) {
			qty_90(value);
			return;
		}
		if ($qty_91.equalsIgnoreCase(name)) {
			qty_91(value);
			return;
		}
		if ($qty_92.equalsIgnoreCase(name)) {
			qty_92(value);
			return;
		}
		if ($qty_93.equalsIgnoreCase(name)) {
			qty_93(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($qty_00.equalsIgnoreCase(name)) {
			qty_00(value);
			return;
		}
		if ($qty_01.equalsIgnoreCase(name)) {
			qty_01(value);
			return;
		}
		if ($qty_02.equalsIgnoreCase(name)) {
			qty_02(value);
			return;
		}
		if ($qty_03.equalsIgnoreCase(name)) {
			qty_03(value);
			return;
		}
		if ($qty_04.equalsIgnoreCase(name)) {
			qty_04(value);
			return;
		}
		if ($qty_05.equalsIgnoreCase(name)) {
			qty_05(value);
			return;
		}
		if ($qty_06.equalsIgnoreCase(name)) {
			qty_06(value);
			return;
		}
		if ($qty_07.equalsIgnoreCase(name)) {
			qty_07(value);
			return;
		}
		if ($qty_08.equalsIgnoreCase(name)) {
			qty_08(value);
			return;
		}
		if ($qty_09.equalsIgnoreCase(name)) {
			qty_09(value);
			return;
		}
		if ($qty_10.equalsIgnoreCase(name)) {
			qty_10(value);
			return;
		}
		if ($qty_11.equalsIgnoreCase(name)) {
			qty_11(value);
			return;
		}
		if ($qty_12.equalsIgnoreCase(name)) {
			qty_12(value);
			return;
		}
		if ($qty_13.equalsIgnoreCase(name)) {
			qty_13(value);
			return;
		}
		if ($qty_14.equalsIgnoreCase(name)) {
			qty_14(value);
			return;
		}
		if ($qty_15.equalsIgnoreCase(name)) {
			qty_15(value);
			return;
		}
		if ($qty_16.equalsIgnoreCase(name)) {
			qty_16(value);
			return;
		}
		if ($qty_17.equalsIgnoreCase(name)) {
			qty_17(value);
			return;
		}
		if ($qty_18.equalsIgnoreCase(name)) {
			qty_18(value);
			return;
		}
		if ($qty_19.equalsIgnoreCase(name)) {
			qty_19(value);
			return;
		}
		if ($qty_20.equalsIgnoreCase(name)) {
			qty_20(value);
			return;
		}
		if ($qty_21.equalsIgnoreCase(name)) {
			qty_21(value);
			return;
		}
		if ($qty_22.equalsIgnoreCase(name)) {
			qty_22(value);
			return;
		}
		if ($qty_23.equalsIgnoreCase(name)) {
			qty_23(value);
			return;
		}
		if ($qty_24.equalsIgnoreCase(name)) {
			qty_24(value);
			return;
		}
		if ($qty_25.equalsIgnoreCase(name)) {
			qty_25(value);
			return;
		}
		if ($qty_26.equalsIgnoreCase(name)) {
			qty_26(value);
			return;
		}
		if ($qty_27.equalsIgnoreCase(name)) {
			qty_27(value);
			return;
		}
		if ($qty_28.equalsIgnoreCase(name)) {
			qty_28(value);
			return;
		}
		if ($qty_29.equalsIgnoreCase(name)) {
			qty_29(value);
			return;
		}
		if ($qty_30.equalsIgnoreCase(name)) {
			qty_30(value);
			return;
		}
		if ($qty_31.equalsIgnoreCase(name)) {
			qty_31(value);
			return;
		}
		if ($qty_32.equalsIgnoreCase(name)) {
			qty_32(value);
			return;
		}
		if ($qty_33.equalsIgnoreCase(name)) {
			qty_33(value);
			return;
		}
		if ($qty_34.equalsIgnoreCase(name)) {
			qty_34(value);
			return;
		}
		if ($qty_35.equalsIgnoreCase(name)) {
			qty_35(value);
			return;
		}
		if ($qty_36.equalsIgnoreCase(name)) {
			qty_36(value);
			return;
		}
		if ($qty_37.equalsIgnoreCase(name)) {
			qty_37(value);
			return;
		}
		if ($qty_38.equalsIgnoreCase(name)) {
			qty_38(value);
			return;
		}
		if ($qty_39.equalsIgnoreCase(name)) {
			qty_39(value);
			return;
		}
		if ($qty_40.equalsIgnoreCase(name)) {
			qty_40(value);
			return;
		}
		if ($qty_41.equalsIgnoreCase(name)) {
			qty_41(value);
			return;
		}
		if ($qty_42.equalsIgnoreCase(name)) {
			qty_42(value);
			return;
		}
		if ($qty_43.equalsIgnoreCase(name)) {
			qty_43(value);
			return;
		}
		if ($qty_44.equalsIgnoreCase(name)) {
			qty_44(value);
			return;
		}
		if ($qty_45.equalsIgnoreCase(name)) {
			qty_45(value);
			return;
		}
		if ($qty_46.equalsIgnoreCase(name)) {
			qty_46(value);
			return;
		}
		if ($qty_47.equalsIgnoreCase(name)) {
			qty_47(value);
			return;
		}
		if ($qty_48.equalsIgnoreCase(name)) {
			qty_48(value);
			return;
		}
		if ($qty_49.equalsIgnoreCase(name)) {
			qty_49(value);
			return;
		}
		if ($qty_50.equalsIgnoreCase(name)) {
			qty_50(value);
			return;
		}
		if ($qty_51.equalsIgnoreCase(name)) {
			qty_51(value);
			return;
		}
		if ($qty_52.equalsIgnoreCase(name)) {
			qty_52(value);
			return;
		}
		if ($qty_53.equalsIgnoreCase(name)) {
			qty_53(value);
			return;
		}
		if ($qty_54.equalsIgnoreCase(name)) {
			qty_54(value);
			return;
		}
		if ($qty_55.equalsIgnoreCase(name)) {
			qty_55(value);
			return;
		}
		if ($qty_56.equalsIgnoreCase(name)) {
			qty_56(value);
			return;
		}
		if ($qty_57.equalsIgnoreCase(name)) {
			qty_57(value);
			return;
		}
		if ($qty_58.equalsIgnoreCase(name)) {
			qty_58(value);
			return;
		}
		if ($qty_59.equalsIgnoreCase(name)) {
			qty_59(value);
			return;
		}
		if ($qty_60.equalsIgnoreCase(name)) {
			qty_60(value);
			return;
		}
		if ($qty_61.equalsIgnoreCase(name)) {
			qty_61(value);
			return;
		}
		if ($qty_62.equalsIgnoreCase(name)) {
			qty_62(value);
			return;
		}
		if ($qty_63.equalsIgnoreCase(name)) {
			qty_63(value);
			return;
		}
		if ($qty_64.equalsIgnoreCase(name)) {
			qty_64(value);
			return;
		}
		if ($qty_65.equalsIgnoreCase(name)) {
			qty_65(value);
			return;
		}
		if ($qty_66.equalsIgnoreCase(name)) {
			qty_66(value);
			return;
		}
		if ($qty_67.equalsIgnoreCase(name)) {
			qty_67(value);
			return;
		}
		if ($qty_68.equalsIgnoreCase(name)) {
			qty_68(value);
			return;
		}
		if ($qty_69.equalsIgnoreCase(name)) {
			qty_69(value);
			return;
		}
		if ($qty_70.equalsIgnoreCase(name)) {
			qty_70(value);
			return;
		}
		if ($qty_71.equalsIgnoreCase(name)) {
			qty_71(value);
			return;
		}
		if ($qty_72.equalsIgnoreCase(name)) {
			qty_72(value);
			return;
		}
		if ($qty_73.equalsIgnoreCase(name)) {
			qty_73(value);
			return;
		}
		if ($qty_74.equalsIgnoreCase(name)) {
			qty_74(value);
			return;
		}
		if ($qty_75.equalsIgnoreCase(name)) {
			qty_75(value);
			return;
		}
		if ($qty_76.equalsIgnoreCase(name)) {
			qty_76(value);
			return;
		}
		if ($qty_77.equalsIgnoreCase(name)) {
			qty_77(value);
			return;
		}
		if ($qty_78.equalsIgnoreCase(name)) {
			qty_78(value);
			return;
		}
		if ($qty_79.equalsIgnoreCase(name)) {
			qty_79(value);
			return;
		}
		if ($qty_80.equalsIgnoreCase(name)) {
			qty_80(value);
			return;
		}
		if ($qty_81.equalsIgnoreCase(name)) {
			qty_81(value);
			return;
		}
		if ($qty_82.equalsIgnoreCase(name)) {
			qty_82(value);
			return;
		}
		if ($qty_83.equalsIgnoreCase(name)) {
			qty_83(value);
			return;
		}
		if ($qty_84.equalsIgnoreCase(name)) {
			qty_84(value);
			return;
		}
		if ($qty_85.equalsIgnoreCase(name)) {
			qty_85(value);
			return;
		}
		if ($qty_86.equalsIgnoreCase(name)) {
			qty_86(value);
			return;
		}
		if ($qty_87.equalsIgnoreCase(name)) {
			qty_87(value);
			return;
		}
		if ($qty_88.equalsIgnoreCase(name)) {
			qty_88(value);
			return;
		}
		if ($qty_89.equalsIgnoreCase(name)) {
			qty_89(value);
			return;
		}
		if ($qty_90.equalsIgnoreCase(name)) {
			qty_90(value);
			return;
		}
		if ($qty_91.equalsIgnoreCase(name)) {
			qty_91(value);
			return;
		}
		if ($qty_92.equalsIgnoreCase(name)) {
			qty_92(value);
			return;
		}
		if ($qty_93.equalsIgnoreCase(name)) {
			qty_93(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($qty_00.equalsIgnoreCase(name)) {
			qty_00(value);
			return;
		}
		if ($qty_01.equalsIgnoreCase(name)) {
			qty_01(value);
			return;
		}
		if ($qty_02.equalsIgnoreCase(name)) {
			qty_02(value);
			return;
		}
		if ($qty_03.equalsIgnoreCase(name)) {
			qty_03(value);
			return;
		}
		if ($qty_04.equalsIgnoreCase(name)) {
			qty_04(value);
			return;
		}
		if ($qty_05.equalsIgnoreCase(name)) {
			qty_05(value);
			return;
		}
		if ($qty_06.equalsIgnoreCase(name)) {
			qty_06(value);
			return;
		}
		if ($qty_07.equalsIgnoreCase(name)) {
			qty_07(value);
			return;
		}
		if ($qty_08.equalsIgnoreCase(name)) {
			qty_08(value);
			return;
		}
		if ($qty_09.equalsIgnoreCase(name)) {
			qty_09(value);
			return;
		}
		if ($qty_10.equalsIgnoreCase(name)) {
			qty_10(value);
			return;
		}
		if ($qty_11.equalsIgnoreCase(name)) {
			qty_11(value);
			return;
		}
		if ($qty_12.equalsIgnoreCase(name)) {
			qty_12(value);
			return;
		}
		if ($qty_13.equalsIgnoreCase(name)) {
			qty_13(value);
			return;
		}
		if ($qty_14.equalsIgnoreCase(name)) {
			qty_14(value);
			return;
		}
		if ($qty_15.equalsIgnoreCase(name)) {
			qty_15(value);
			return;
		}
		if ($qty_16.equalsIgnoreCase(name)) {
			qty_16(value);
			return;
		}
		if ($qty_17.equalsIgnoreCase(name)) {
			qty_17(value);
			return;
		}
		if ($qty_18.equalsIgnoreCase(name)) {
			qty_18(value);
			return;
		}
		if ($qty_19.equalsIgnoreCase(name)) {
			qty_19(value);
			return;
		}
		if ($qty_20.equalsIgnoreCase(name)) {
			qty_20(value);
			return;
		}
		if ($qty_21.equalsIgnoreCase(name)) {
			qty_21(value);
			return;
		}
		if ($qty_22.equalsIgnoreCase(name)) {
			qty_22(value);
			return;
		}
		if ($qty_23.equalsIgnoreCase(name)) {
			qty_23(value);
			return;
		}
		if ($qty_24.equalsIgnoreCase(name)) {
			qty_24(value);
			return;
		}
		if ($qty_25.equalsIgnoreCase(name)) {
			qty_25(value);
			return;
		}
		if ($qty_26.equalsIgnoreCase(name)) {
			qty_26(value);
			return;
		}
		if ($qty_27.equalsIgnoreCase(name)) {
			qty_27(value);
			return;
		}
		if ($qty_28.equalsIgnoreCase(name)) {
			qty_28(value);
			return;
		}
		if ($qty_29.equalsIgnoreCase(name)) {
			qty_29(value);
			return;
		}
		if ($qty_30.equalsIgnoreCase(name)) {
			qty_30(value);
			return;
		}
		if ($qty_31.equalsIgnoreCase(name)) {
			qty_31(value);
			return;
		}
		if ($qty_32.equalsIgnoreCase(name)) {
			qty_32(value);
			return;
		}
		if ($qty_33.equalsIgnoreCase(name)) {
			qty_33(value);
			return;
		}
		if ($qty_34.equalsIgnoreCase(name)) {
			qty_34(value);
			return;
		}
		if ($qty_35.equalsIgnoreCase(name)) {
			qty_35(value);
			return;
		}
		if ($qty_36.equalsIgnoreCase(name)) {
			qty_36(value);
			return;
		}
		if ($qty_37.equalsIgnoreCase(name)) {
			qty_37(value);
			return;
		}
		if ($qty_38.equalsIgnoreCase(name)) {
			qty_38(value);
			return;
		}
		if ($qty_39.equalsIgnoreCase(name)) {
			qty_39(value);
			return;
		}
		if ($qty_40.equalsIgnoreCase(name)) {
			qty_40(value);
			return;
		}
		if ($qty_41.equalsIgnoreCase(name)) {
			qty_41(value);
			return;
		}
		if ($qty_42.equalsIgnoreCase(name)) {
			qty_42(value);
			return;
		}
		if ($qty_43.equalsIgnoreCase(name)) {
			qty_43(value);
			return;
		}
		if ($qty_44.equalsIgnoreCase(name)) {
			qty_44(value);
			return;
		}
		if ($qty_45.equalsIgnoreCase(name)) {
			qty_45(value);
			return;
		}
		if ($qty_46.equalsIgnoreCase(name)) {
			qty_46(value);
			return;
		}
		if ($qty_47.equalsIgnoreCase(name)) {
			qty_47(value);
			return;
		}
		if ($qty_48.equalsIgnoreCase(name)) {
			qty_48(value);
			return;
		}
		if ($qty_49.equalsIgnoreCase(name)) {
			qty_49(value);
			return;
		}
		if ($qty_50.equalsIgnoreCase(name)) {
			qty_50(value);
			return;
		}
		if ($qty_51.equalsIgnoreCase(name)) {
			qty_51(value);
			return;
		}
		if ($qty_52.equalsIgnoreCase(name)) {
			qty_52(value);
			return;
		}
		if ($qty_53.equalsIgnoreCase(name)) {
			qty_53(value);
			return;
		}
		if ($qty_54.equalsIgnoreCase(name)) {
			qty_54(value);
			return;
		}
		if ($qty_55.equalsIgnoreCase(name)) {
			qty_55(value);
			return;
		}
		if ($qty_56.equalsIgnoreCase(name)) {
			qty_56(value);
			return;
		}
		if ($qty_57.equalsIgnoreCase(name)) {
			qty_57(value);
			return;
		}
		if ($qty_58.equalsIgnoreCase(name)) {
			qty_58(value);
			return;
		}
		if ($qty_59.equalsIgnoreCase(name)) {
			qty_59(value);
			return;
		}
		if ($qty_60.equalsIgnoreCase(name)) {
			qty_60(value);
			return;
		}
		if ($qty_61.equalsIgnoreCase(name)) {
			qty_61(value);
			return;
		}
		if ($qty_62.equalsIgnoreCase(name)) {
			qty_62(value);
			return;
		}
		if ($qty_63.equalsIgnoreCase(name)) {
			qty_63(value);
			return;
		}
		if ($qty_64.equalsIgnoreCase(name)) {
			qty_64(value);
			return;
		}
		if ($qty_65.equalsIgnoreCase(name)) {
			qty_65(value);
			return;
		}
		if ($qty_66.equalsIgnoreCase(name)) {
			qty_66(value);
			return;
		}
		if ($qty_67.equalsIgnoreCase(name)) {
			qty_67(value);
			return;
		}
		if ($qty_68.equalsIgnoreCase(name)) {
			qty_68(value);
			return;
		}
		if ($qty_69.equalsIgnoreCase(name)) {
			qty_69(value);
			return;
		}
		if ($qty_70.equalsIgnoreCase(name)) {
			qty_70(value);
			return;
		}
		if ($qty_71.equalsIgnoreCase(name)) {
			qty_71(value);
			return;
		}
		if ($qty_72.equalsIgnoreCase(name)) {
			qty_72(value);
			return;
		}
		if ($qty_73.equalsIgnoreCase(name)) {
			qty_73(value);
			return;
		}
		if ($qty_74.equalsIgnoreCase(name)) {
			qty_74(value);
			return;
		}
		if ($qty_75.equalsIgnoreCase(name)) {
			qty_75(value);
			return;
		}
		if ($qty_76.equalsIgnoreCase(name)) {
			qty_76(value);
			return;
		}
		if ($qty_77.equalsIgnoreCase(name)) {
			qty_77(value);
			return;
		}
		if ($qty_78.equalsIgnoreCase(name)) {
			qty_78(value);
			return;
		}
		if ($qty_79.equalsIgnoreCase(name)) {
			qty_79(value);
			return;
		}
		if ($qty_80.equalsIgnoreCase(name)) {
			qty_80(value);
			return;
		}
		if ($qty_81.equalsIgnoreCase(name)) {
			qty_81(value);
			return;
		}
		if ($qty_82.equalsIgnoreCase(name)) {
			qty_82(value);
			return;
		}
		if ($qty_83.equalsIgnoreCase(name)) {
			qty_83(value);
			return;
		}
		if ($qty_84.equalsIgnoreCase(name)) {
			qty_84(value);
			return;
		}
		if ($qty_85.equalsIgnoreCase(name)) {
			qty_85(value);
			return;
		}
		if ($qty_86.equalsIgnoreCase(name)) {
			qty_86(value);
			return;
		}
		if ($qty_87.equalsIgnoreCase(name)) {
			qty_87(value);
			return;
		}
		if ($qty_88.equalsIgnoreCase(name)) {
			qty_88(value);
			return;
		}
		if ($qty_89.equalsIgnoreCase(name)) {
			qty_89(value);
			return;
		}
		if ($qty_90.equalsIgnoreCase(name)) {
			qty_90(value);
			return;
		}
		if ($qty_91.equalsIgnoreCase(name)) {
			qty_91(value);
			return;
		}
		if ($qty_92.equalsIgnoreCase(name)) {
			qty_92(value);
			return;
		}
		if ($qty_93.equalsIgnoreCase(name)) {
			qty_93(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($qty_00.equalsIgnoreCase(name)) {
			qty_00(value);
			return;
		}
		if ($qty_01.equalsIgnoreCase(name)) {
			qty_01(value);
			return;
		}
		if ($qty_02.equalsIgnoreCase(name)) {
			qty_02(value);
			return;
		}
		if ($qty_03.equalsIgnoreCase(name)) {
			qty_03(value);
			return;
		}
		if ($qty_04.equalsIgnoreCase(name)) {
			qty_04(value);
			return;
		}
		if ($qty_05.equalsIgnoreCase(name)) {
			qty_05(value);
			return;
		}
		if ($qty_06.equalsIgnoreCase(name)) {
			qty_06(value);
			return;
		}
		if ($qty_07.equalsIgnoreCase(name)) {
			qty_07(value);
			return;
		}
		if ($qty_08.equalsIgnoreCase(name)) {
			qty_08(value);
			return;
		}
		if ($qty_09.equalsIgnoreCase(name)) {
			qty_09(value);
			return;
		}
		if ($qty_10.equalsIgnoreCase(name)) {
			qty_10(value);
			return;
		}
		if ($qty_11.equalsIgnoreCase(name)) {
			qty_11(value);
			return;
		}
		if ($qty_12.equalsIgnoreCase(name)) {
			qty_12(value);
			return;
		}
		if ($qty_13.equalsIgnoreCase(name)) {
			qty_13(value);
			return;
		}
		if ($qty_14.equalsIgnoreCase(name)) {
			qty_14(value);
			return;
		}
		if ($qty_15.equalsIgnoreCase(name)) {
			qty_15(value);
			return;
		}
		if ($qty_16.equalsIgnoreCase(name)) {
			qty_16(value);
			return;
		}
		if ($qty_17.equalsIgnoreCase(name)) {
			qty_17(value);
			return;
		}
		if ($qty_18.equalsIgnoreCase(name)) {
			qty_18(value);
			return;
		}
		if ($qty_19.equalsIgnoreCase(name)) {
			qty_19(value);
			return;
		}
		if ($qty_20.equalsIgnoreCase(name)) {
			qty_20(value);
			return;
		}
		if ($qty_21.equalsIgnoreCase(name)) {
			qty_21(value);
			return;
		}
		if ($qty_22.equalsIgnoreCase(name)) {
			qty_22(value);
			return;
		}
		if ($qty_23.equalsIgnoreCase(name)) {
			qty_23(value);
			return;
		}
		if ($qty_24.equalsIgnoreCase(name)) {
			qty_24(value);
			return;
		}
		if ($qty_25.equalsIgnoreCase(name)) {
			qty_25(value);
			return;
		}
		if ($qty_26.equalsIgnoreCase(name)) {
			qty_26(value);
			return;
		}
		if ($qty_27.equalsIgnoreCase(name)) {
			qty_27(value);
			return;
		}
		if ($qty_28.equalsIgnoreCase(name)) {
			qty_28(value);
			return;
		}
		if ($qty_29.equalsIgnoreCase(name)) {
			qty_29(value);
			return;
		}
		if ($qty_30.equalsIgnoreCase(name)) {
			qty_30(value);
			return;
		}
		if ($qty_31.equalsIgnoreCase(name)) {
			qty_31(value);
			return;
		}
		if ($qty_32.equalsIgnoreCase(name)) {
			qty_32(value);
			return;
		}
		if ($qty_33.equalsIgnoreCase(name)) {
			qty_33(value);
			return;
		}
		if ($qty_34.equalsIgnoreCase(name)) {
			qty_34(value);
			return;
		}
		if ($qty_35.equalsIgnoreCase(name)) {
			qty_35(value);
			return;
		}
		if ($qty_36.equalsIgnoreCase(name)) {
			qty_36(value);
			return;
		}
		if ($qty_37.equalsIgnoreCase(name)) {
			qty_37(value);
			return;
		}
		if ($qty_38.equalsIgnoreCase(name)) {
			qty_38(value);
			return;
		}
		if ($qty_39.equalsIgnoreCase(name)) {
			qty_39(value);
			return;
		}
		if ($qty_40.equalsIgnoreCase(name)) {
			qty_40(value);
			return;
		}
		if ($qty_41.equalsIgnoreCase(name)) {
			qty_41(value);
			return;
		}
		if ($qty_42.equalsIgnoreCase(name)) {
			qty_42(value);
			return;
		}
		if ($qty_43.equalsIgnoreCase(name)) {
			qty_43(value);
			return;
		}
		if ($qty_44.equalsIgnoreCase(name)) {
			qty_44(value);
			return;
		}
		if ($qty_45.equalsIgnoreCase(name)) {
			qty_45(value);
			return;
		}
		if ($qty_46.equalsIgnoreCase(name)) {
			qty_46(value);
			return;
		}
		if ($qty_47.equalsIgnoreCase(name)) {
			qty_47(value);
			return;
		}
		if ($qty_48.equalsIgnoreCase(name)) {
			qty_48(value);
			return;
		}
		if ($qty_49.equalsIgnoreCase(name)) {
			qty_49(value);
			return;
		}
		if ($qty_50.equalsIgnoreCase(name)) {
			qty_50(value);
			return;
		}
		if ($qty_51.equalsIgnoreCase(name)) {
			qty_51(value);
			return;
		}
		if ($qty_52.equalsIgnoreCase(name)) {
			qty_52(value);
			return;
		}
		if ($qty_53.equalsIgnoreCase(name)) {
			qty_53(value);
			return;
		}
		if ($qty_54.equalsIgnoreCase(name)) {
			qty_54(value);
			return;
		}
		if ($qty_55.equalsIgnoreCase(name)) {
			qty_55(value);
			return;
		}
		if ($qty_56.equalsIgnoreCase(name)) {
			qty_56(value);
			return;
		}
		if ($qty_57.equalsIgnoreCase(name)) {
			qty_57(value);
			return;
		}
		if ($qty_58.equalsIgnoreCase(name)) {
			qty_58(value);
			return;
		}
		if ($qty_59.equalsIgnoreCase(name)) {
			qty_59(value);
			return;
		}
		if ($qty_60.equalsIgnoreCase(name)) {
			qty_60(value);
			return;
		}
		if ($qty_61.equalsIgnoreCase(name)) {
			qty_61(value);
			return;
		}
		if ($qty_62.equalsIgnoreCase(name)) {
			qty_62(value);
			return;
		}
		if ($qty_63.equalsIgnoreCase(name)) {
			qty_63(value);
			return;
		}
		if ($qty_64.equalsIgnoreCase(name)) {
			qty_64(value);
			return;
		}
		if ($qty_65.equalsIgnoreCase(name)) {
			qty_65(value);
			return;
		}
		if ($qty_66.equalsIgnoreCase(name)) {
			qty_66(value);
			return;
		}
		if ($qty_67.equalsIgnoreCase(name)) {
			qty_67(value);
			return;
		}
		if ($qty_68.equalsIgnoreCase(name)) {
			qty_68(value);
			return;
		}
		if ($qty_69.equalsIgnoreCase(name)) {
			qty_69(value);
			return;
		}
		if ($qty_70.equalsIgnoreCase(name)) {
			qty_70(value);
			return;
		}
		if ($qty_71.equalsIgnoreCase(name)) {
			qty_71(value);
			return;
		}
		if ($qty_72.equalsIgnoreCase(name)) {
			qty_72(value);
			return;
		}
		if ($qty_73.equalsIgnoreCase(name)) {
			qty_73(value);
			return;
		}
		if ($qty_74.equalsIgnoreCase(name)) {
			qty_74(value);
			return;
		}
		if ($qty_75.equalsIgnoreCase(name)) {
			qty_75(value);
			return;
		}
		if ($qty_76.equalsIgnoreCase(name)) {
			qty_76(value);
			return;
		}
		if ($qty_77.equalsIgnoreCase(name)) {
			qty_77(value);
			return;
		}
		if ($qty_78.equalsIgnoreCase(name)) {
			qty_78(value);
			return;
		}
		if ($qty_79.equalsIgnoreCase(name)) {
			qty_79(value);
			return;
		}
		if ($qty_80.equalsIgnoreCase(name)) {
			qty_80(value);
			return;
		}
		if ($qty_81.equalsIgnoreCase(name)) {
			qty_81(value);
			return;
		}
		if ($qty_82.equalsIgnoreCase(name)) {
			qty_82(value);
			return;
		}
		if ($qty_83.equalsIgnoreCase(name)) {
			qty_83(value);
			return;
		}
		if ($qty_84.equalsIgnoreCase(name)) {
			qty_84(value);
			return;
		}
		if ($qty_85.equalsIgnoreCase(name)) {
			qty_85(value);
			return;
		}
		if ($qty_86.equalsIgnoreCase(name)) {
			qty_86(value);
			return;
		}
		if ($qty_87.equalsIgnoreCase(name)) {
			qty_87(value);
			return;
		}
		if ($qty_88.equalsIgnoreCase(name)) {
			qty_88(value);
			return;
		}
		if ($qty_89.equalsIgnoreCase(name)) {
			qty_89(value);
			return;
		}
		if ($qty_90.equalsIgnoreCase(name)) {
			qty_90(value);
			return;
		}
		if ($qty_91.equalsIgnoreCase(name)) {
			qty_91(value);
			return;
		}
		if ($qty_92.equalsIgnoreCase(name)) {
			qty_92(value);
			return;
		}
		if ($qty_93.equalsIgnoreCase(name)) {
			qty_93(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($qty_00.equalsIgnoreCase(name)) {
			qty_00(value);
			return;
		}
		if ($qty_01.equalsIgnoreCase(name)) {
			qty_01(value);
			return;
		}
		if ($qty_02.equalsIgnoreCase(name)) {
			qty_02(value);
			return;
		}
		if ($qty_03.equalsIgnoreCase(name)) {
			qty_03(value);
			return;
		}
		if ($qty_04.equalsIgnoreCase(name)) {
			qty_04(value);
			return;
		}
		if ($qty_05.equalsIgnoreCase(name)) {
			qty_05(value);
			return;
		}
		if ($qty_06.equalsIgnoreCase(name)) {
			qty_06(value);
			return;
		}
		if ($qty_07.equalsIgnoreCase(name)) {
			qty_07(value);
			return;
		}
		if ($qty_08.equalsIgnoreCase(name)) {
			qty_08(value);
			return;
		}
		if ($qty_09.equalsIgnoreCase(name)) {
			qty_09(value);
			return;
		}
		if ($qty_10.equalsIgnoreCase(name)) {
			qty_10(value);
			return;
		}
		if ($qty_11.equalsIgnoreCase(name)) {
			qty_11(value);
			return;
		}
		if ($qty_12.equalsIgnoreCase(name)) {
			qty_12(value);
			return;
		}
		if ($qty_13.equalsIgnoreCase(name)) {
			qty_13(value);
			return;
		}
		if ($qty_14.equalsIgnoreCase(name)) {
			qty_14(value);
			return;
		}
		if ($qty_15.equalsIgnoreCase(name)) {
			qty_15(value);
			return;
		}
		if ($qty_16.equalsIgnoreCase(name)) {
			qty_16(value);
			return;
		}
		if ($qty_17.equalsIgnoreCase(name)) {
			qty_17(value);
			return;
		}
		if ($qty_18.equalsIgnoreCase(name)) {
			qty_18(value);
			return;
		}
		if ($qty_19.equalsIgnoreCase(name)) {
			qty_19(value);
			return;
		}
		if ($qty_20.equalsIgnoreCase(name)) {
			qty_20(value);
			return;
		}
		if ($qty_21.equalsIgnoreCase(name)) {
			qty_21(value);
			return;
		}
		if ($qty_22.equalsIgnoreCase(name)) {
			qty_22(value);
			return;
		}
		if ($qty_23.equalsIgnoreCase(name)) {
			qty_23(value);
			return;
		}
		if ($qty_24.equalsIgnoreCase(name)) {
			qty_24(value);
			return;
		}
		if ($qty_25.equalsIgnoreCase(name)) {
			qty_25(value);
			return;
		}
		if ($qty_26.equalsIgnoreCase(name)) {
			qty_26(value);
			return;
		}
		if ($qty_27.equalsIgnoreCase(name)) {
			qty_27(value);
			return;
		}
		if ($qty_28.equalsIgnoreCase(name)) {
			qty_28(value);
			return;
		}
		if ($qty_29.equalsIgnoreCase(name)) {
			qty_29(value);
			return;
		}
		if ($qty_30.equalsIgnoreCase(name)) {
			qty_30(value);
			return;
		}
		if ($qty_31.equalsIgnoreCase(name)) {
			qty_31(value);
			return;
		}
		if ($qty_32.equalsIgnoreCase(name)) {
			qty_32(value);
			return;
		}
		if ($qty_33.equalsIgnoreCase(name)) {
			qty_33(value);
			return;
		}
		if ($qty_34.equalsIgnoreCase(name)) {
			qty_34(value);
			return;
		}
		if ($qty_35.equalsIgnoreCase(name)) {
			qty_35(value);
			return;
		}
		if ($qty_36.equalsIgnoreCase(name)) {
			qty_36(value);
			return;
		}
		if ($qty_37.equalsIgnoreCase(name)) {
			qty_37(value);
			return;
		}
		if ($qty_38.equalsIgnoreCase(name)) {
			qty_38(value);
			return;
		}
		if ($qty_39.equalsIgnoreCase(name)) {
			qty_39(value);
			return;
		}
		if ($qty_40.equalsIgnoreCase(name)) {
			qty_40(value);
			return;
		}
		if ($qty_41.equalsIgnoreCase(name)) {
			qty_41(value);
			return;
		}
		if ($qty_42.equalsIgnoreCase(name)) {
			qty_42(value);
			return;
		}
		if ($qty_43.equalsIgnoreCase(name)) {
			qty_43(value);
			return;
		}
		if ($qty_44.equalsIgnoreCase(name)) {
			qty_44(value);
			return;
		}
		if ($qty_45.equalsIgnoreCase(name)) {
			qty_45(value);
			return;
		}
		if ($qty_46.equalsIgnoreCase(name)) {
			qty_46(value);
			return;
		}
		if ($qty_47.equalsIgnoreCase(name)) {
			qty_47(value);
			return;
		}
		if ($qty_48.equalsIgnoreCase(name)) {
			qty_48(value);
			return;
		}
		if ($qty_49.equalsIgnoreCase(name)) {
			qty_49(value);
			return;
		}
		if ($qty_50.equalsIgnoreCase(name)) {
			qty_50(value);
			return;
		}
		if ($qty_51.equalsIgnoreCase(name)) {
			qty_51(value);
			return;
		}
		if ($qty_52.equalsIgnoreCase(name)) {
			qty_52(value);
			return;
		}
		if ($qty_53.equalsIgnoreCase(name)) {
			qty_53(value);
			return;
		}
		if ($qty_54.equalsIgnoreCase(name)) {
			qty_54(value);
			return;
		}
		if ($qty_55.equalsIgnoreCase(name)) {
			qty_55(value);
			return;
		}
		if ($qty_56.equalsIgnoreCase(name)) {
			qty_56(value);
			return;
		}
		if ($qty_57.equalsIgnoreCase(name)) {
			qty_57(value);
			return;
		}
		if ($qty_58.equalsIgnoreCase(name)) {
			qty_58(value);
			return;
		}
		if ($qty_59.equalsIgnoreCase(name)) {
			qty_59(value);
			return;
		}
		if ($qty_60.equalsIgnoreCase(name)) {
			qty_60(value);
			return;
		}
		if ($qty_61.equalsIgnoreCase(name)) {
			qty_61(value);
			return;
		}
		if ($qty_62.equalsIgnoreCase(name)) {
			qty_62(value);
			return;
		}
		if ($qty_63.equalsIgnoreCase(name)) {
			qty_63(value);
			return;
		}
		if ($qty_64.equalsIgnoreCase(name)) {
			qty_64(value);
			return;
		}
		if ($qty_65.equalsIgnoreCase(name)) {
			qty_65(value);
			return;
		}
		if ($qty_66.equalsIgnoreCase(name)) {
			qty_66(value);
			return;
		}
		if ($qty_67.equalsIgnoreCase(name)) {
			qty_67(value);
			return;
		}
		if ($qty_68.equalsIgnoreCase(name)) {
			qty_68(value);
			return;
		}
		if ($qty_69.equalsIgnoreCase(name)) {
			qty_69(value);
			return;
		}
		if ($qty_70.equalsIgnoreCase(name)) {
			qty_70(value);
			return;
		}
		if ($qty_71.equalsIgnoreCase(name)) {
			qty_71(value);
			return;
		}
		if ($qty_72.equalsIgnoreCase(name)) {
			qty_72(value);
			return;
		}
		if ($qty_73.equalsIgnoreCase(name)) {
			qty_73(value);
			return;
		}
		if ($qty_74.equalsIgnoreCase(name)) {
			qty_74(value);
			return;
		}
		if ($qty_75.equalsIgnoreCase(name)) {
			qty_75(value);
			return;
		}
		if ($qty_76.equalsIgnoreCase(name)) {
			qty_76(value);
			return;
		}
		if ($qty_77.equalsIgnoreCase(name)) {
			qty_77(value);
			return;
		}
		if ($qty_78.equalsIgnoreCase(name)) {
			qty_78(value);
			return;
		}
		if ($qty_79.equalsIgnoreCase(name)) {
			qty_79(value);
			return;
		}
		if ($qty_80.equalsIgnoreCase(name)) {
			qty_80(value);
			return;
		}
		if ($qty_81.equalsIgnoreCase(name)) {
			qty_81(value);
			return;
		}
		if ($qty_82.equalsIgnoreCase(name)) {
			qty_82(value);
			return;
		}
		if ($qty_83.equalsIgnoreCase(name)) {
			qty_83(value);
			return;
		}
		if ($qty_84.equalsIgnoreCase(name)) {
			qty_84(value);
			return;
		}
		if ($qty_85.equalsIgnoreCase(name)) {
			qty_85(value);
			return;
		}
		if ($qty_86.equalsIgnoreCase(name)) {
			qty_86(value);
			return;
		}
		if ($qty_87.equalsIgnoreCase(name)) {
			qty_87(value);
			return;
		}
		if ($qty_88.equalsIgnoreCase(name)) {
			qty_88(value);
			return;
		}
		if ($qty_89.equalsIgnoreCase(name)) {
			qty_89(value);
			return;
		}
		if ($qty_90.equalsIgnoreCase(name)) {
			qty_90(value);
			return;
		}
		if ($qty_91.equalsIgnoreCase(name)) {
			qty_91(value);
			return;
		}
		if ($qty_92.equalsIgnoreCase(name)) {
			qty_92(value);
			return;
		}
		if ($qty_93.equalsIgnoreCase(name)) {
			qty_93(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

