package mcframe.clientMABG.MABGP0060;

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
 * ブロック"DispDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DispDtlR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
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
	 * Priority 優先順位.<p>
	 *
	 */
	public static final String $ctg_prio = "ctg_prio";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_00 = "calc_ctg_00";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_01 = "calc_ctg_01";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_02 = "calc_ctg_02";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_03 = "calc_ctg_03";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_04 = "calc_ctg_04";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_05 = "calc_ctg_05";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_06 = "calc_ctg_06";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_07 = "calc_ctg_07";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_08 = "calc_ctg_08";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_09 = "calc_ctg_09";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_10 = "calc_ctg_10";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_11 = "calc_ctg_11";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_12 = "calc_ctg_12";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_13 = "calc_ctg_13";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_14 = "calc_ctg_14";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_15 = "calc_ctg_15";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_16 = "calc_ctg_16";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_17 = "calc_ctg_17";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_18 = "calc_ctg_18";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_19 = "calc_ctg_19";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_20 = "calc_ctg_20";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_21 = "calc_ctg_21";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_22 = "calc_ctg_22";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_23 = "calc_ctg_23";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_24 = "calc_ctg_24";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_25 = "calc_ctg_25";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_26 = "calc_ctg_26";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_27 = "calc_ctg_27";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_28 = "calc_ctg_28";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_29 = "calc_ctg_29";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_30 = "calc_ctg_30";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_31 = "calc_ctg_31";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_32 = "calc_ctg_32";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_33 = "calc_ctg_33";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_34 = "calc_ctg_34";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_35 = "calc_ctg_35";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_36 = "calc_ctg_36";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_37 = "calc_ctg_37";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_38 = "calc_ctg_38";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_39 = "calc_ctg_39";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_40 = "calc_ctg_40";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_41 = "calc_ctg_41";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_42 = "calc_ctg_42";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_43 = "calc_ctg_43";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_44 = "calc_ctg_44";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_45 = "calc_ctg_45";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_46 = "calc_ctg_46";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_47 = "calc_ctg_47";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_48 = "calc_ctg_48";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_49 = "calc_ctg_49";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_50 = "calc_ctg_50";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_51 = "calc_ctg_51";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_52 = "calc_ctg_52";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_53 = "calc_ctg_53";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_54 = "calc_ctg_54";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_55 = "calc_ctg_55";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_56 = "calc_ctg_56";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_57 = "calc_ctg_57";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_58 = "calc_ctg_58";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_59 = "calc_ctg_59";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_60 = "calc_ctg_60";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_61 = "calc_ctg_61";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_62 = "calc_ctg_62";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_63 = "calc_ctg_63";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_64 = "calc_ctg_64";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_65 = "calc_ctg_65";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_66 = "calc_ctg_66";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_67 = "calc_ctg_67";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_68 = "calc_ctg_68";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_69 = "calc_ctg_69";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_70 = "calc_ctg_70";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_71 = "calc_ctg_71";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_72 = "calc_ctg_72";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_73 = "calc_ctg_73";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_74 = "calc_ctg_74";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_75 = "calc_ctg_75";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_76 = "calc_ctg_76";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_77 = "calc_ctg_77";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_78 = "calc_ctg_78";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_79 = "calc_ctg_79";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_80 = "calc_ctg_80";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_81 = "calc_ctg_81";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_82 = "calc_ctg_82";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_83 = "calc_ctg_83";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_84 = "calc_ctg_84";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_85 = "calc_ctg_85";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_86 = "calc_ctg_86";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_87 = "calc_ctg_87";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_88 = "calc_ctg_88";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_89 = "calc_ctg_89";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_90 = "calc_ctg_90";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_91 = "calc_ctg_91";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_92 = "calc_ctg_92";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_93 = "calc_ctg_93";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_94 = "calc_ctg_94";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_95 = "calc_ctg_95";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_96 = "calc_ctg_96";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_97 = "calc_ctg_97";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_98 = "calc_ctg_98";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_99 = "calc_ctg_99";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta ctg_prio_META = createCommonMeta($ctg_prio, mcframe.commonMA.meta.MA_META.INT2);
	public static final MCMeta calc_ctg_00_META = createCommonMeta($calc_ctg_00, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_01_META = createCommonMeta($calc_ctg_01, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_02_META = createCommonMeta($calc_ctg_02, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_03_META = createCommonMeta($calc_ctg_03, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_04_META = createCommonMeta($calc_ctg_04, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_05_META = createCommonMeta($calc_ctg_05, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_06_META = createCommonMeta($calc_ctg_06, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_07_META = createCommonMeta($calc_ctg_07, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_08_META = createCommonMeta($calc_ctg_08, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_09_META = createCommonMeta($calc_ctg_09, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_10_META = createCommonMeta($calc_ctg_10, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_11_META = createCommonMeta($calc_ctg_11, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_12_META = createCommonMeta($calc_ctg_12, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_13_META = createCommonMeta($calc_ctg_13, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_14_META = createCommonMeta($calc_ctg_14, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_15_META = createCommonMeta($calc_ctg_15, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_16_META = createCommonMeta($calc_ctg_16, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_17_META = createCommonMeta($calc_ctg_17, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_18_META = createCommonMeta($calc_ctg_18, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_19_META = createCommonMeta($calc_ctg_19, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_20_META = createCommonMeta($calc_ctg_20, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_21_META = createCommonMeta($calc_ctg_21, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_22_META = createCommonMeta($calc_ctg_22, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_23_META = createCommonMeta($calc_ctg_23, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_24_META = createCommonMeta($calc_ctg_24, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_25_META = createCommonMeta($calc_ctg_25, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_26_META = createCommonMeta($calc_ctg_26, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_27_META = createCommonMeta($calc_ctg_27, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_28_META = createCommonMeta($calc_ctg_28, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_29_META = createCommonMeta($calc_ctg_29, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_30_META = createCommonMeta($calc_ctg_30, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_31_META = createCommonMeta($calc_ctg_31, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_32_META = createCommonMeta($calc_ctg_32, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_33_META = createCommonMeta($calc_ctg_33, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_34_META = createCommonMeta($calc_ctg_34, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_35_META = createCommonMeta($calc_ctg_35, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_36_META = createCommonMeta($calc_ctg_36, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_37_META = createCommonMeta($calc_ctg_37, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_38_META = createCommonMeta($calc_ctg_38, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_39_META = createCommonMeta($calc_ctg_39, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_40_META = createCommonMeta($calc_ctg_40, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_41_META = createCommonMeta($calc_ctg_41, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_42_META = createCommonMeta($calc_ctg_42, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_43_META = createCommonMeta($calc_ctg_43, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_44_META = createCommonMeta($calc_ctg_44, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_45_META = createCommonMeta($calc_ctg_45, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_46_META = createCommonMeta($calc_ctg_46, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_47_META = createCommonMeta($calc_ctg_47, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_48_META = createCommonMeta($calc_ctg_48, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_49_META = createCommonMeta($calc_ctg_49, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_50_META = createCommonMeta($calc_ctg_50, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_51_META = createCommonMeta($calc_ctg_51, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_52_META = createCommonMeta($calc_ctg_52, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_53_META = createCommonMeta($calc_ctg_53, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_54_META = createCommonMeta($calc_ctg_54, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_55_META = createCommonMeta($calc_ctg_55, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_56_META = createCommonMeta($calc_ctg_56, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_57_META = createCommonMeta($calc_ctg_57, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_58_META = createCommonMeta($calc_ctg_58, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_59_META = createCommonMeta($calc_ctg_59, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_60_META = createCommonMeta($calc_ctg_60, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_61_META = createCommonMeta($calc_ctg_61, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_62_META = createCommonMeta($calc_ctg_62, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_63_META = createCommonMeta($calc_ctg_63, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_64_META = createCommonMeta($calc_ctg_64, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_65_META = createCommonMeta($calc_ctg_65, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_66_META = createCommonMeta($calc_ctg_66, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_67_META = createCommonMeta($calc_ctg_67, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_68_META = createCommonMeta($calc_ctg_68, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_69_META = createCommonMeta($calc_ctg_69, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_70_META = createCommonMeta($calc_ctg_70, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_71_META = createCommonMeta($calc_ctg_71, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_72_META = createCommonMeta($calc_ctg_72, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_73_META = createCommonMeta($calc_ctg_73, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_74_META = createCommonMeta($calc_ctg_74, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_75_META = createCommonMeta($calc_ctg_75, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_76_META = createCommonMeta($calc_ctg_76, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_77_META = createCommonMeta($calc_ctg_77, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_78_META = createCommonMeta($calc_ctg_78, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_79_META = createCommonMeta($calc_ctg_79, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_80_META = createCommonMeta($calc_ctg_80, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_81_META = createCommonMeta($calc_ctg_81, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_82_META = createCommonMeta($calc_ctg_82, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_83_META = createCommonMeta($calc_ctg_83, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_84_META = createCommonMeta($calc_ctg_84, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_85_META = createCommonMeta($calc_ctg_85, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_86_META = createCommonMeta($calc_ctg_86, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_87_META = createCommonMeta($calc_ctg_87, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_88_META = createCommonMeta($calc_ctg_88, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_89_META = createCommonMeta($calc_ctg_89, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_90_META = createCommonMeta($calc_ctg_90, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_91_META = createCommonMeta($calc_ctg_91, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_92_META = createCommonMeta($calc_ctg_92, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_93_META = createCommonMeta($calc_ctg_93, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_94_META = createCommonMeta($calc_ctg_94, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_95_META = createCommonMeta($calc_ctg_95, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_96_META = createCommonMeta($calc_ctg_96, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_97_META = createCommonMeta($calc_ctg_97, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta calc_ctg_98_META = createCommonMeta($calc_ctg_98, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_99_META = createCommonMeta($calc_ctg_99, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<DispDtlR> constMetas = new ConstMetaList<DispDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			del_flg_META,
			calc_grp_cd_META,
			calc_grp_nm_META,
			ctg_prio_META,
			calc_ctg_00_META,
			calc_ctg_01_META,
			calc_ctg_02_META,
			calc_ctg_03_META,
			calc_ctg_04_META,
			calc_ctg_05_META,
			calc_ctg_06_META,
			calc_ctg_07_META,
			calc_ctg_08_META,
			calc_ctg_09_META,
			calc_ctg_10_META,
			calc_ctg_11_META,
			calc_ctg_12_META,
			calc_ctg_13_META,
			calc_ctg_14_META,
			calc_ctg_15_META,
			calc_ctg_16_META,
			calc_ctg_17_META,
			calc_ctg_18_META,
			calc_ctg_19_META,
			calc_ctg_20_META,
			calc_ctg_21_META,
			calc_ctg_22_META,
			calc_ctg_23_META,
			calc_ctg_24_META,
			calc_ctg_25_META,
			calc_ctg_26_META,
			calc_ctg_27_META,
			calc_ctg_28_META,
			calc_ctg_29_META,
			calc_ctg_30_META,
			calc_ctg_31_META,
			calc_ctg_32_META,
			calc_ctg_33_META,
			calc_ctg_34_META,
			calc_ctg_35_META,
			calc_ctg_36_META,
			calc_ctg_37_META,
			calc_ctg_38_META,
			calc_ctg_39_META,
			calc_ctg_40_META,
			calc_ctg_41_META,
			calc_ctg_42_META,
			calc_ctg_43_META,
			calc_ctg_44_META,
			calc_ctg_45_META,
			calc_ctg_46_META,
			calc_ctg_47_META,
			calc_ctg_48_META,
			calc_ctg_49_META,
			calc_ctg_50_META,
			calc_ctg_51_META,
			calc_ctg_52_META,
			calc_ctg_53_META,
			calc_ctg_54_META,
			calc_ctg_55_META,
			calc_ctg_56_META,
			calc_ctg_57_META,
			calc_ctg_58_META,
			calc_ctg_59_META,
			calc_ctg_60_META,
			calc_ctg_61_META,
			calc_ctg_62_META,
			calc_ctg_63_META,
			calc_ctg_64_META,
			calc_ctg_65_META,
			calc_ctg_66_META,
			calc_ctg_67_META,
			calc_ctg_68_META,
			calc_ctg_69_META,
			calc_ctg_70_META,
			calc_ctg_71_META,
			calc_ctg_72_META,
			calc_ctg_73_META,
			calc_ctg_74_META,
			calc_ctg_75_META,
			calc_ctg_76_META,
			calc_ctg_77_META,
			calc_ctg_78_META,
			calc_ctg_79_META,
			calc_ctg_80_META,
			calc_ctg_81_META,
			calc_ctg_82_META,
			calc_ctg_83_META,
			calc_ctg_84_META,
			calc_ctg_85_META,
			calc_ctg_86_META,
			calc_ctg_87_META,
			calc_ctg_88_META,
			calc_ctg_89_META,
			calc_ctg_90_META,
			calc_ctg_91_META,
			calc_ctg_92_META,
			calc_ctg_93_META,
			calc_ctg_94_META,
			calc_ctg_95_META,
			calc_ctg_96_META,
			calc_ctg_97_META,
			calc_ctg_98_META,
			calc_ctg_99_META,
			upd_cntr_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$calc_grp_cd	// calc_grp_cd
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[VH_KEY]のキー定数 */
	public static final String $$VH_KEY = "VH_KEY";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$calc_ctg_00, "calc_ctg_nm"},	// calc_ctg_00
				{$calc_ctg_02, "calc_ctg_nm"},	// calc_ctg_02
				{$calc_ctg_04, "calc_ctg_nm"},	// calc_ctg_04
				{$calc_ctg_06, "calc_ctg_nm"},	// calc_ctg_06
				{$calc_ctg_08, "calc_ctg_nm"},	// calc_ctg_08
				{$calc_ctg_10, "calc_ctg_nm"},	// calc_ctg_10
				{$calc_ctg_12, "calc_ctg_nm"},	// calc_ctg_12
				{$calc_ctg_14, "calc_ctg_nm"},	// calc_ctg_14
				{$calc_ctg_16, "calc_ctg_nm"},	// calc_ctg_16
				{$calc_ctg_18, "calc_ctg_nm"},	// calc_ctg_18
				{$calc_ctg_20, "calc_ctg_nm"},	// calc_ctg_20
				{$calc_ctg_22, "calc_ctg_nm"},	// calc_ctg_22
				{$calc_ctg_24, "calc_ctg_nm"},	// calc_ctg_24
				{$calc_ctg_26, "calc_ctg_nm"},	// calc_ctg_26
				{$calc_ctg_28, "calc_ctg_nm"},	// calc_ctg_28
				{$calc_ctg_30, "calc_ctg_nm"},	// calc_ctg_30
				{$calc_ctg_32, "calc_ctg_nm"},	// calc_ctg_32
				{$calc_ctg_34, "calc_ctg_nm"},	// calc_ctg_34
				{$calc_ctg_36, "calc_ctg_nm"},	// calc_ctg_36
				{$calc_ctg_38, "calc_ctg_nm"},	// calc_ctg_38
				{$calc_ctg_40, "calc_ctg_nm"},	// calc_ctg_40
				{$calc_ctg_42, "calc_ctg_nm"},	// calc_ctg_42
				{$calc_ctg_44, "calc_ctg_nm"},	// calc_ctg_44
				{$calc_ctg_46, "calc_ctg_nm"},	// calc_ctg_46
				{$calc_ctg_48, "calc_ctg_nm"},	// calc_ctg_48
				{$calc_ctg_50, "calc_ctg_nm"},	// calc_ctg_50
				{$calc_ctg_52, "calc_ctg_nm"},	// calc_ctg_52
				{$calc_ctg_54, "calc_ctg_nm"},	// calc_ctg_54
				{$calc_ctg_56, "calc_ctg_nm"},	// calc_ctg_56
				{$calc_ctg_58, "calc_ctg_nm"},	// calc_ctg_58
				{$calc_ctg_60, "calc_ctg_nm"},	// calc_ctg_60
				{$calc_ctg_62, "calc_ctg_nm"},	// calc_ctg_62
				{$calc_ctg_64, "calc_ctg_nm"},	// calc_ctg_64
				{$calc_ctg_66, "calc_ctg_nm"},	// calc_ctg_66
				{$calc_ctg_68, "calc_ctg_nm"},	// calc_ctg_68
				{$calc_ctg_70, "calc_ctg_nm"},	// calc_ctg_70
				{$calc_ctg_72, "calc_ctg_nm"},	// calc_ctg_72
				{$calc_ctg_74, "calc_ctg_nm"},	// calc_ctg_74
				{$calc_ctg_76, "calc_ctg_nm"},	// calc_ctg_76
				{$calc_ctg_78, "calc_ctg_nm"},	// calc_ctg_78
				{$calc_ctg_80, "calc_ctg_nm"},	// calc_ctg_80
				{$calc_ctg_82, "calc_ctg_nm"},	// calc_ctg_82
				{$calc_ctg_84, "calc_ctg_nm"},	// calc_ctg_84
				{$calc_ctg_86, "calc_ctg_nm"},	// calc_ctg_86
				{$calc_ctg_88, "calc_ctg_nm"},	// calc_ctg_88
				{$calc_ctg_90, "calc_ctg_nm"},	// calc_ctg_90
				{$calc_ctg_92, "calc_ctg_nm"},	// calc_ctg_92
				{$calc_ctg_94, "calc_ctg_nm"},	// calc_ctg_94
				{$calc_ctg_96, "calc_ctg_nm"},	// calc_ctg_96
				{$calc_ctg_98, "calc_ctg_nm"}	// calc_ctg_98
			}
		)),
		new MCExtMap.Entry($$VH_KEY, new MCExtList(
			new String[][]{
				{$calc_ctg_00, "ELM"},	// calc_ctg_00
				{$calc_ctg_01, "ELM"},	// calc_ctg_01
				{$calc_ctg_02, "ELM"},	// calc_ctg_02
				{$calc_ctg_03, "ELM"},	// calc_ctg_03
				{$calc_ctg_04, "ELM"},	// calc_ctg_04
				{$calc_ctg_05, "ELM"},	// calc_ctg_05
				{$calc_ctg_06, "ELM"},	// calc_ctg_06
				{$calc_ctg_07, "ELM"},	// calc_ctg_07
				{$calc_ctg_08, "ELM"},	// calc_ctg_08
				{$calc_ctg_09, "ELM"},	// calc_ctg_09
				{$calc_ctg_10, "ELM"},	// calc_ctg_10
				{$calc_ctg_11, "ELM"},	// calc_ctg_11
				{$calc_ctg_12, "ELM"},	// calc_ctg_12
				{$calc_ctg_13, "ELM"},	// calc_ctg_13
				{$calc_ctg_14, "ELM"},	// calc_ctg_14
				{$calc_ctg_15, "ELM"},	// calc_ctg_15
				{$calc_ctg_16, "ELM"},	// calc_ctg_16
				{$calc_ctg_17, "ELM"},	// calc_ctg_17
				{$calc_ctg_18, "ELM"},	// calc_ctg_18
				{$calc_ctg_19, "ELM"},	// calc_ctg_19
				{$calc_ctg_20, "ELM"},	// calc_ctg_20
				{$calc_ctg_21, "ELM"},	// calc_ctg_21
				{$calc_ctg_22, "ELM"},	// calc_ctg_22
				{$calc_ctg_23, "ELM"},	// calc_ctg_23
				{$calc_ctg_24, "ELM"},	// calc_ctg_24
				{$calc_ctg_25, "ELM"},	// calc_ctg_25
				{$calc_ctg_26, "ELM"},	// calc_ctg_26
				{$calc_ctg_27, "ELM"},	// calc_ctg_27
				{$calc_ctg_28, "ELM"},	// calc_ctg_28
				{$calc_ctg_29, "ELM"},	// calc_ctg_29
				{$calc_ctg_30, "ELM"},	// calc_ctg_30
				{$calc_ctg_31, "ELM"},	// calc_ctg_31
				{$calc_ctg_32, "ELM"},	// calc_ctg_32
				{$calc_ctg_33, "ELM"},	// calc_ctg_33
				{$calc_ctg_34, "ELM"},	// calc_ctg_34
				{$calc_ctg_35, "ELM"},	// calc_ctg_35
				{$calc_ctg_36, "ELM"},	// calc_ctg_36
				{$calc_ctg_37, "ELM"},	// calc_ctg_37
				{$calc_ctg_38, "ELM"},	// calc_ctg_38
				{$calc_ctg_39, "ELM"},	// calc_ctg_39
				{$calc_ctg_40, "ELM"},	// calc_ctg_40
				{$calc_ctg_41, "ELM"},	// calc_ctg_41
				{$calc_ctg_42, "ELM"},	// calc_ctg_42
				{$calc_ctg_43, "ELM"},	// calc_ctg_43
				{$calc_ctg_44, "ELM"},	// calc_ctg_44
				{$calc_ctg_45, "ELM"},	// calc_ctg_45
				{$calc_ctg_46, "ELM"},	// calc_ctg_46
				{$calc_ctg_47, "ELM"},	// calc_ctg_47
				{$calc_ctg_48, "ELM"},	// calc_ctg_48
				{$calc_ctg_49, "ELM"},	// calc_ctg_49
				{$calc_ctg_50, "ELM"},	// calc_ctg_50
				{$calc_ctg_51, "ELM"},	// calc_ctg_51
				{$calc_ctg_52, "ELM"},	// calc_ctg_52
				{$calc_ctg_53, "ELM"},	// calc_ctg_53
				{$calc_ctg_54, "ELM"},	// calc_ctg_54
				{$calc_ctg_55, "ELM"},	// calc_ctg_55
				{$calc_ctg_56, "ELM"},	// calc_ctg_56
				{$calc_ctg_57, "ELM"},	// calc_ctg_57
				{$calc_ctg_58, "ELM"},	// calc_ctg_58
				{$calc_ctg_59, "ELM"},	// calc_ctg_59
				{$calc_ctg_60, "ELM"},	// calc_ctg_60
				{$calc_ctg_61, "ELM"},	// calc_ctg_61
				{$calc_ctg_62, "ELM"},	// calc_ctg_62
				{$calc_ctg_63, "ELM"},	// calc_ctg_63
				{$calc_ctg_64, "ELM"},	// calc_ctg_64
				{$calc_ctg_65, "ELM"},	// calc_ctg_65
				{$calc_ctg_66, "ELM"},	// calc_ctg_66
				{$calc_ctg_67, "ELM"},	// calc_ctg_67
				{$calc_ctg_68, "ELM"},	// calc_ctg_68
				{$calc_ctg_69, "ELM"},	// calc_ctg_69
				{$calc_ctg_70, "ELM"},	// calc_ctg_70
				{$calc_ctg_71, "ELM"},	// calc_ctg_71
				{$calc_ctg_72, "ELM"},	// calc_ctg_72
				{$calc_ctg_73, "ELM"},	// calc_ctg_73
				{$calc_ctg_74, "ELM"},	// calc_ctg_74
				{$calc_ctg_75, "ELM"},	// calc_ctg_75
				{$calc_ctg_76, "ELM"},	// calc_ctg_76
				{$calc_ctg_77, "ELM"},	// calc_ctg_77
				{$calc_ctg_78, "ELM"},	// calc_ctg_78
				{$calc_ctg_79, "ELM"},	// calc_ctg_79
				{$calc_ctg_80, "ELM"},	// calc_ctg_80
				{$calc_ctg_81, "ELM"},	// calc_ctg_81
				{$calc_ctg_82, "ELM"},	// calc_ctg_82
				{$calc_ctg_83, "ELM"},	// calc_ctg_83
				{$calc_ctg_84, "ELM"},	// calc_ctg_84
				{$calc_ctg_85, "ELM"},	// calc_ctg_85
				{$calc_ctg_86, "ELM"},	// calc_ctg_86
				{$calc_ctg_87, "ELM"},	// calc_ctg_87
				{$calc_ctg_88, "ELM"},	// calc_ctg_88
				{$calc_ctg_89, "ELM"},	// calc_ctg_89
				{$calc_ctg_90, "ELM"},	// calc_ctg_90
				{$calc_ctg_91, "ELM"},	// calc_ctg_91
				{$calc_ctg_92, "ELM"},	// calc_ctg_92
				{$calc_ctg_93, "ELM"},	// calc_ctg_93
				{$calc_ctg_94, "ELM"},	// calc_ctg_94
				{$calc_ctg_95, "ELM"},	// calc_ctg_95
				{$calc_ctg_96, "ELM"},	// calc_ctg_96
				{$calc_ctg_97, "ELM"},	// calc_ctg_97
				{$calc_ctg_98, "ELM"},	// calc_ctg_98
				{$calc_ctg_99, "ELM"}	// calc_ctg_99
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
	protected DispDtlR_MC_A(ConstMetaList<? extends DispDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispDtlR clone() {
		return (DispDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispDtlR createInstance() {
		return (DispDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispDtlR getValues(String... names) {
		return (DispDtlR) super.getValues(names);
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
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 1, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 1, $del_flg, value);
	}


	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 2, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 2, $calc_grp_cd, value);
	}


	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 3, $calc_grp_nm);
	}

	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 3, $calc_grp_nm, value);
	}


	/**
	 * Priority 優先順位.<p>
	 *
	 */
	public MCNumber ctg_prio() {
		return getConstNumber(offset + 4, $ctg_prio);
	}

	/**
	 * Priority 優先順位.<p>
	 *
	 */
	public void ctg_prio(MCNumber value) {
		setConstNumber(offset + 4, $ctg_prio, value);
	}

	/**
	 * Priority 優先順位.<p>
	 *
	 */
	public void ctg_prio(int value) {
		setConstNumber(offset + 4, $ctg_prio, value);
	}

	/**
	 * Priority 優先順位.<p>
	 *
	 */
	public void ctg_prio(long value) {
		setConstNumber(offset + 4, $ctg_prio, value);
	}

	/**
	 * Priority 優先順位.<p>
	 *
	 */
	public void ctg_prio(float value) {
		setConstNumber(offset + 4, $ctg_prio, value);
	}

	/**
	 * Priority 優先順位.<p>
	 *
	 */
	public void ctg_prio(double value) {
		setConstNumber(offset + 4, $ctg_prio, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_00() {
		return getConstString(offset + 5, $calc_ctg_00);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_00(String value) {
		setConstString(offset + 5, $calc_ctg_00, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_01() {
		return getConstString(offset + 6, $calc_ctg_01);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_01(String value) {
		setConstString(offset + 6, $calc_ctg_01, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_02() {
		return getConstString(offset + 7, $calc_ctg_02);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_02(String value) {
		setConstString(offset + 7, $calc_ctg_02, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_03() {
		return getConstString(offset + 8, $calc_ctg_03);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_03(String value) {
		setConstString(offset + 8, $calc_ctg_03, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_04() {
		return getConstString(offset + 9, $calc_ctg_04);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_04(String value) {
		setConstString(offset + 9, $calc_ctg_04, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_05() {
		return getConstString(offset + 10, $calc_ctg_05);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_05(String value) {
		setConstString(offset + 10, $calc_ctg_05, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_06() {
		return getConstString(offset + 11, $calc_ctg_06);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_06(String value) {
		setConstString(offset + 11, $calc_ctg_06, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_07() {
		return getConstString(offset + 12, $calc_ctg_07);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_07(String value) {
		setConstString(offset + 12, $calc_ctg_07, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_08() {
		return getConstString(offset + 13, $calc_ctg_08);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_08(String value) {
		setConstString(offset + 13, $calc_ctg_08, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_09() {
		return getConstString(offset + 14, $calc_ctg_09);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_09(String value) {
		setConstString(offset + 14, $calc_ctg_09, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_10() {
		return getConstString(offset + 15, $calc_ctg_10);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_10(String value) {
		setConstString(offset + 15, $calc_ctg_10, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_11() {
		return getConstString(offset + 16, $calc_ctg_11);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_11(String value) {
		setConstString(offset + 16, $calc_ctg_11, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_12() {
		return getConstString(offset + 17, $calc_ctg_12);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_12(String value) {
		setConstString(offset + 17, $calc_ctg_12, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_13() {
		return getConstString(offset + 18, $calc_ctg_13);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_13(String value) {
		setConstString(offset + 18, $calc_ctg_13, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_14() {
		return getConstString(offset + 19, $calc_ctg_14);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_14(String value) {
		setConstString(offset + 19, $calc_ctg_14, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_15() {
		return getConstString(offset + 20, $calc_ctg_15);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_15(String value) {
		setConstString(offset + 20, $calc_ctg_15, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_16() {
		return getConstString(offset + 21, $calc_ctg_16);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_16(String value) {
		setConstString(offset + 21, $calc_ctg_16, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_17() {
		return getConstString(offset + 22, $calc_ctg_17);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_17(String value) {
		setConstString(offset + 22, $calc_ctg_17, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_18() {
		return getConstString(offset + 23, $calc_ctg_18);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_18(String value) {
		setConstString(offset + 23, $calc_ctg_18, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_19() {
		return getConstString(offset + 24, $calc_ctg_19);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_19(String value) {
		setConstString(offset + 24, $calc_ctg_19, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_20() {
		return getConstString(offset + 25, $calc_ctg_20);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_20(String value) {
		setConstString(offset + 25, $calc_ctg_20, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_21() {
		return getConstString(offset + 26, $calc_ctg_21);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_21(String value) {
		setConstString(offset + 26, $calc_ctg_21, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_22() {
		return getConstString(offset + 27, $calc_ctg_22);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_22(String value) {
		setConstString(offset + 27, $calc_ctg_22, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_23() {
		return getConstString(offset + 28, $calc_ctg_23);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_23(String value) {
		setConstString(offset + 28, $calc_ctg_23, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_24() {
		return getConstString(offset + 29, $calc_ctg_24);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_24(String value) {
		setConstString(offset + 29, $calc_ctg_24, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_25() {
		return getConstString(offset + 30, $calc_ctg_25);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_25(String value) {
		setConstString(offset + 30, $calc_ctg_25, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_26() {
		return getConstString(offset + 31, $calc_ctg_26);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_26(String value) {
		setConstString(offset + 31, $calc_ctg_26, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_27() {
		return getConstString(offset + 32, $calc_ctg_27);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_27(String value) {
		setConstString(offset + 32, $calc_ctg_27, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_28() {
		return getConstString(offset + 33, $calc_ctg_28);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_28(String value) {
		setConstString(offset + 33, $calc_ctg_28, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_29() {
		return getConstString(offset + 34, $calc_ctg_29);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_29(String value) {
		setConstString(offset + 34, $calc_ctg_29, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_30() {
		return getConstString(offset + 35, $calc_ctg_30);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_30(String value) {
		setConstString(offset + 35, $calc_ctg_30, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_31() {
		return getConstString(offset + 36, $calc_ctg_31);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_31(String value) {
		setConstString(offset + 36, $calc_ctg_31, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_32() {
		return getConstString(offset + 37, $calc_ctg_32);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_32(String value) {
		setConstString(offset + 37, $calc_ctg_32, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_33() {
		return getConstString(offset + 38, $calc_ctg_33);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_33(String value) {
		setConstString(offset + 38, $calc_ctg_33, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_34() {
		return getConstString(offset + 39, $calc_ctg_34);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_34(String value) {
		setConstString(offset + 39, $calc_ctg_34, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_35() {
		return getConstString(offset + 40, $calc_ctg_35);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_35(String value) {
		setConstString(offset + 40, $calc_ctg_35, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_36() {
		return getConstString(offset + 41, $calc_ctg_36);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_36(String value) {
		setConstString(offset + 41, $calc_ctg_36, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_37() {
		return getConstString(offset + 42, $calc_ctg_37);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_37(String value) {
		setConstString(offset + 42, $calc_ctg_37, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_38() {
		return getConstString(offset + 43, $calc_ctg_38);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_38(String value) {
		setConstString(offset + 43, $calc_ctg_38, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_39() {
		return getConstString(offset + 44, $calc_ctg_39);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_39(String value) {
		setConstString(offset + 44, $calc_ctg_39, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_40() {
		return getConstString(offset + 45, $calc_ctg_40);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_40(String value) {
		setConstString(offset + 45, $calc_ctg_40, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_41() {
		return getConstString(offset + 46, $calc_ctg_41);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_41(String value) {
		setConstString(offset + 46, $calc_ctg_41, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_42() {
		return getConstString(offset + 47, $calc_ctg_42);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_42(String value) {
		setConstString(offset + 47, $calc_ctg_42, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_43() {
		return getConstString(offset + 48, $calc_ctg_43);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_43(String value) {
		setConstString(offset + 48, $calc_ctg_43, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_44() {
		return getConstString(offset + 49, $calc_ctg_44);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_44(String value) {
		setConstString(offset + 49, $calc_ctg_44, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_45() {
		return getConstString(offset + 50, $calc_ctg_45);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_45(String value) {
		setConstString(offset + 50, $calc_ctg_45, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_46() {
		return getConstString(offset + 51, $calc_ctg_46);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_46(String value) {
		setConstString(offset + 51, $calc_ctg_46, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_47() {
		return getConstString(offset + 52, $calc_ctg_47);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_47(String value) {
		setConstString(offset + 52, $calc_ctg_47, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_48() {
		return getConstString(offset + 53, $calc_ctg_48);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_48(String value) {
		setConstString(offset + 53, $calc_ctg_48, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_49() {
		return getConstString(offset + 54, $calc_ctg_49);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_49(String value) {
		setConstString(offset + 54, $calc_ctg_49, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_50() {
		return getConstString(offset + 55, $calc_ctg_50);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_50(String value) {
		setConstString(offset + 55, $calc_ctg_50, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_51() {
		return getConstString(offset + 56, $calc_ctg_51);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_51(String value) {
		setConstString(offset + 56, $calc_ctg_51, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_52() {
		return getConstString(offset + 57, $calc_ctg_52);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_52(String value) {
		setConstString(offset + 57, $calc_ctg_52, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_53() {
		return getConstString(offset + 58, $calc_ctg_53);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_53(String value) {
		setConstString(offset + 58, $calc_ctg_53, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_54() {
		return getConstString(offset + 59, $calc_ctg_54);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_54(String value) {
		setConstString(offset + 59, $calc_ctg_54, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_55() {
		return getConstString(offset + 60, $calc_ctg_55);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_55(String value) {
		setConstString(offset + 60, $calc_ctg_55, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_56() {
		return getConstString(offset + 61, $calc_ctg_56);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_56(String value) {
		setConstString(offset + 61, $calc_ctg_56, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_57() {
		return getConstString(offset + 62, $calc_ctg_57);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_57(String value) {
		setConstString(offset + 62, $calc_ctg_57, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_58() {
		return getConstString(offset + 63, $calc_ctg_58);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_58(String value) {
		setConstString(offset + 63, $calc_ctg_58, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_59() {
		return getConstString(offset + 64, $calc_ctg_59);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_59(String value) {
		setConstString(offset + 64, $calc_ctg_59, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_60() {
		return getConstString(offset + 65, $calc_ctg_60);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_60(String value) {
		setConstString(offset + 65, $calc_ctg_60, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_61() {
		return getConstString(offset + 66, $calc_ctg_61);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_61(String value) {
		setConstString(offset + 66, $calc_ctg_61, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_62() {
		return getConstString(offset + 67, $calc_ctg_62);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_62(String value) {
		setConstString(offset + 67, $calc_ctg_62, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_63() {
		return getConstString(offset + 68, $calc_ctg_63);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_63(String value) {
		setConstString(offset + 68, $calc_ctg_63, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_64() {
		return getConstString(offset + 69, $calc_ctg_64);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_64(String value) {
		setConstString(offset + 69, $calc_ctg_64, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_65() {
		return getConstString(offset + 70, $calc_ctg_65);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_65(String value) {
		setConstString(offset + 70, $calc_ctg_65, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_66() {
		return getConstString(offset + 71, $calc_ctg_66);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_66(String value) {
		setConstString(offset + 71, $calc_ctg_66, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_67() {
		return getConstString(offset + 72, $calc_ctg_67);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_67(String value) {
		setConstString(offset + 72, $calc_ctg_67, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_68() {
		return getConstString(offset + 73, $calc_ctg_68);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_68(String value) {
		setConstString(offset + 73, $calc_ctg_68, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_69() {
		return getConstString(offset + 74, $calc_ctg_69);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_69(String value) {
		setConstString(offset + 74, $calc_ctg_69, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_70() {
		return getConstString(offset + 75, $calc_ctg_70);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_70(String value) {
		setConstString(offset + 75, $calc_ctg_70, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_71() {
		return getConstString(offset + 76, $calc_ctg_71);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_71(String value) {
		setConstString(offset + 76, $calc_ctg_71, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_72() {
		return getConstString(offset + 77, $calc_ctg_72);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_72(String value) {
		setConstString(offset + 77, $calc_ctg_72, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_73() {
		return getConstString(offset + 78, $calc_ctg_73);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_73(String value) {
		setConstString(offset + 78, $calc_ctg_73, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_74() {
		return getConstString(offset + 79, $calc_ctg_74);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_74(String value) {
		setConstString(offset + 79, $calc_ctg_74, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_75() {
		return getConstString(offset + 80, $calc_ctg_75);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_75(String value) {
		setConstString(offset + 80, $calc_ctg_75, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_76() {
		return getConstString(offset + 81, $calc_ctg_76);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_76(String value) {
		setConstString(offset + 81, $calc_ctg_76, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_77() {
		return getConstString(offset + 82, $calc_ctg_77);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_77(String value) {
		setConstString(offset + 82, $calc_ctg_77, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_78() {
		return getConstString(offset + 83, $calc_ctg_78);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_78(String value) {
		setConstString(offset + 83, $calc_ctg_78, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_79() {
		return getConstString(offset + 84, $calc_ctg_79);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_79(String value) {
		setConstString(offset + 84, $calc_ctg_79, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_80() {
		return getConstString(offset + 85, $calc_ctg_80);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_80(String value) {
		setConstString(offset + 85, $calc_ctg_80, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_81() {
		return getConstString(offset + 86, $calc_ctg_81);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_81(String value) {
		setConstString(offset + 86, $calc_ctg_81, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_82() {
		return getConstString(offset + 87, $calc_ctg_82);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_82(String value) {
		setConstString(offset + 87, $calc_ctg_82, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_83() {
		return getConstString(offset + 88, $calc_ctg_83);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_83(String value) {
		setConstString(offset + 88, $calc_ctg_83, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_84() {
		return getConstString(offset + 89, $calc_ctg_84);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_84(String value) {
		setConstString(offset + 89, $calc_ctg_84, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_85() {
		return getConstString(offset + 90, $calc_ctg_85);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_85(String value) {
		setConstString(offset + 90, $calc_ctg_85, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_86() {
		return getConstString(offset + 91, $calc_ctg_86);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_86(String value) {
		setConstString(offset + 91, $calc_ctg_86, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_87() {
		return getConstString(offset + 92, $calc_ctg_87);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_87(String value) {
		setConstString(offset + 92, $calc_ctg_87, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_88() {
		return getConstString(offset + 93, $calc_ctg_88);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_88(String value) {
		setConstString(offset + 93, $calc_ctg_88, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_89() {
		return getConstString(offset + 94, $calc_ctg_89);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_89(String value) {
		setConstString(offset + 94, $calc_ctg_89, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_90() {
		return getConstString(offset + 95, $calc_ctg_90);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_90(String value) {
		setConstString(offset + 95, $calc_ctg_90, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_91() {
		return getConstString(offset + 96, $calc_ctg_91);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_91(String value) {
		setConstString(offset + 96, $calc_ctg_91, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_92() {
		return getConstString(offset + 97, $calc_ctg_92);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_92(String value) {
		setConstString(offset + 97, $calc_ctg_92, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_93() {
		return getConstString(offset + 98, $calc_ctg_93);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_93(String value) {
		setConstString(offset + 98, $calc_ctg_93, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_94() {
		return getConstString(offset + 99, $calc_ctg_94);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_94(String value) {
		setConstString(offset + 99, $calc_ctg_94, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_95() {
		return getConstString(offset + 100, $calc_ctg_95);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_95(String value) {
		setConstString(offset + 100, $calc_ctg_95, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_96() {
		return getConstString(offset + 101, $calc_ctg_96);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_96(String value) {
		setConstString(offset + 101, $calc_ctg_96, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_97() {
		return getConstString(offset + 102, $calc_ctg_97);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_97(String value) {
		setConstString(offset + 102, $calc_ctg_97, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_98() {
		return getConstString(offset + 103, $calc_ctg_98);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_98(String value) {
		setConstString(offset + 103, $calc_ctg_98, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_99() {
		return getConstString(offset + 104, $calc_ctg_99);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_99(String value) {
		setConstString(offset + 104, $calc_ctg_99, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 105, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 105, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 105, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 105, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 105, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 105, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($calc_ctg_00.equalsIgnoreCase(name)) {
			return calc_ctg_00();
		}
		if ($calc_ctg_01.equalsIgnoreCase(name)) {
			return calc_ctg_01();
		}
		if ($calc_ctg_02.equalsIgnoreCase(name)) {
			return calc_ctg_02();
		}
		if ($calc_ctg_03.equalsIgnoreCase(name)) {
			return calc_ctg_03();
		}
		if ($calc_ctg_04.equalsIgnoreCase(name)) {
			return calc_ctg_04();
		}
		if ($calc_ctg_05.equalsIgnoreCase(name)) {
			return calc_ctg_05();
		}
		if ($calc_ctg_06.equalsIgnoreCase(name)) {
			return calc_ctg_06();
		}
		if ($calc_ctg_07.equalsIgnoreCase(name)) {
			return calc_ctg_07();
		}
		if ($calc_ctg_08.equalsIgnoreCase(name)) {
			return calc_ctg_08();
		}
		if ($calc_ctg_09.equalsIgnoreCase(name)) {
			return calc_ctg_09();
		}
		if ($calc_ctg_10.equalsIgnoreCase(name)) {
			return calc_ctg_10();
		}
		if ($calc_ctg_11.equalsIgnoreCase(name)) {
			return calc_ctg_11();
		}
		if ($calc_ctg_12.equalsIgnoreCase(name)) {
			return calc_ctg_12();
		}
		if ($calc_ctg_13.equalsIgnoreCase(name)) {
			return calc_ctg_13();
		}
		if ($calc_ctg_14.equalsIgnoreCase(name)) {
			return calc_ctg_14();
		}
		if ($calc_ctg_15.equalsIgnoreCase(name)) {
			return calc_ctg_15();
		}
		if ($calc_ctg_16.equalsIgnoreCase(name)) {
			return calc_ctg_16();
		}
		if ($calc_ctg_17.equalsIgnoreCase(name)) {
			return calc_ctg_17();
		}
		if ($calc_ctg_18.equalsIgnoreCase(name)) {
			return calc_ctg_18();
		}
		if ($calc_ctg_19.equalsIgnoreCase(name)) {
			return calc_ctg_19();
		}
		if ($calc_ctg_20.equalsIgnoreCase(name)) {
			return calc_ctg_20();
		}
		if ($calc_ctg_21.equalsIgnoreCase(name)) {
			return calc_ctg_21();
		}
		if ($calc_ctg_22.equalsIgnoreCase(name)) {
			return calc_ctg_22();
		}
		if ($calc_ctg_23.equalsIgnoreCase(name)) {
			return calc_ctg_23();
		}
		if ($calc_ctg_24.equalsIgnoreCase(name)) {
			return calc_ctg_24();
		}
		if ($calc_ctg_25.equalsIgnoreCase(name)) {
			return calc_ctg_25();
		}
		if ($calc_ctg_26.equalsIgnoreCase(name)) {
			return calc_ctg_26();
		}
		if ($calc_ctg_27.equalsIgnoreCase(name)) {
			return calc_ctg_27();
		}
		if ($calc_ctg_28.equalsIgnoreCase(name)) {
			return calc_ctg_28();
		}
		if ($calc_ctg_29.equalsIgnoreCase(name)) {
			return calc_ctg_29();
		}
		if ($calc_ctg_30.equalsIgnoreCase(name)) {
			return calc_ctg_30();
		}
		if ($calc_ctg_31.equalsIgnoreCase(name)) {
			return calc_ctg_31();
		}
		if ($calc_ctg_32.equalsIgnoreCase(name)) {
			return calc_ctg_32();
		}
		if ($calc_ctg_33.equalsIgnoreCase(name)) {
			return calc_ctg_33();
		}
		if ($calc_ctg_34.equalsIgnoreCase(name)) {
			return calc_ctg_34();
		}
		if ($calc_ctg_35.equalsIgnoreCase(name)) {
			return calc_ctg_35();
		}
		if ($calc_ctg_36.equalsIgnoreCase(name)) {
			return calc_ctg_36();
		}
		if ($calc_ctg_37.equalsIgnoreCase(name)) {
			return calc_ctg_37();
		}
		if ($calc_ctg_38.equalsIgnoreCase(name)) {
			return calc_ctg_38();
		}
		if ($calc_ctg_39.equalsIgnoreCase(name)) {
			return calc_ctg_39();
		}
		if ($calc_ctg_40.equalsIgnoreCase(name)) {
			return calc_ctg_40();
		}
		if ($calc_ctg_41.equalsIgnoreCase(name)) {
			return calc_ctg_41();
		}
		if ($calc_ctg_42.equalsIgnoreCase(name)) {
			return calc_ctg_42();
		}
		if ($calc_ctg_43.equalsIgnoreCase(name)) {
			return calc_ctg_43();
		}
		if ($calc_ctg_44.equalsIgnoreCase(name)) {
			return calc_ctg_44();
		}
		if ($calc_ctg_45.equalsIgnoreCase(name)) {
			return calc_ctg_45();
		}
		if ($calc_ctg_46.equalsIgnoreCase(name)) {
			return calc_ctg_46();
		}
		if ($calc_ctg_47.equalsIgnoreCase(name)) {
			return calc_ctg_47();
		}
		if ($calc_ctg_48.equalsIgnoreCase(name)) {
			return calc_ctg_48();
		}
		if ($calc_ctg_49.equalsIgnoreCase(name)) {
			return calc_ctg_49();
		}
		if ($calc_ctg_50.equalsIgnoreCase(name)) {
			return calc_ctg_50();
		}
		if ($calc_ctg_51.equalsIgnoreCase(name)) {
			return calc_ctg_51();
		}
		if ($calc_ctg_52.equalsIgnoreCase(name)) {
			return calc_ctg_52();
		}
		if ($calc_ctg_53.equalsIgnoreCase(name)) {
			return calc_ctg_53();
		}
		if ($calc_ctg_54.equalsIgnoreCase(name)) {
			return calc_ctg_54();
		}
		if ($calc_ctg_55.equalsIgnoreCase(name)) {
			return calc_ctg_55();
		}
		if ($calc_ctg_56.equalsIgnoreCase(name)) {
			return calc_ctg_56();
		}
		if ($calc_ctg_57.equalsIgnoreCase(name)) {
			return calc_ctg_57();
		}
		if ($calc_ctg_58.equalsIgnoreCase(name)) {
			return calc_ctg_58();
		}
		if ($calc_ctg_59.equalsIgnoreCase(name)) {
			return calc_ctg_59();
		}
		if ($calc_ctg_60.equalsIgnoreCase(name)) {
			return calc_ctg_60();
		}
		if ($calc_ctg_61.equalsIgnoreCase(name)) {
			return calc_ctg_61();
		}
		if ($calc_ctg_62.equalsIgnoreCase(name)) {
			return calc_ctg_62();
		}
		if ($calc_ctg_63.equalsIgnoreCase(name)) {
			return calc_ctg_63();
		}
		if ($calc_ctg_64.equalsIgnoreCase(name)) {
			return calc_ctg_64();
		}
		if ($calc_ctg_65.equalsIgnoreCase(name)) {
			return calc_ctg_65();
		}
		if ($calc_ctg_66.equalsIgnoreCase(name)) {
			return calc_ctg_66();
		}
		if ($calc_ctg_67.equalsIgnoreCase(name)) {
			return calc_ctg_67();
		}
		if ($calc_ctg_68.equalsIgnoreCase(name)) {
			return calc_ctg_68();
		}
		if ($calc_ctg_69.equalsIgnoreCase(name)) {
			return calc_ctg_69();
		}
		if ($calc_ctg_70.equalsIgnoreCase(name)) {
			return calc_ctg_70();
		}
		if ($calc_ctg_71.equalsIgnoreCase(name)) {
			return calc_ctg_71();
		}
		if ($calc_ctg_72.equalsIgnoreCase(name)) {
			return calc_ctg_72();
		}
		if ($calc_ctg_73.equalsIgnoreCase(name)) {
			return calc_ctg_73();
		}
		if ($calc_ctg_74.equalsIgnoreCase(name)) {
			return calc_ctg_74();
		}
		if ($calc_ctg_75.equalsIgnoreCase(name)) {
			return calc_ctg_75();
		}
		if ($calc_ctg_76.equalsIgnoreCase(name)) {
			return calc_ctg_76();
		}
		if ($calc_ctg_77.equalsIgnoreCase(name)) {
			return calc_ctg_77();
		}
		if ($calc_ctg_78.equalsIgnoreCase(name)) {
			return calc_ctg_78();
		}
		if ($calc_ctg_79.equalsIgnoreCase(name)) {
			return calc_ctg_79();
		}
		if ($calc_ctg_80.equalsIgnoreCase(name)) {
			return calc_ctg_80();
		}
		if ($calc_ctg_81.equalsIgnoreCase(name)) {
			return calc_ctg_81();
		}
		if ($calc_ctg_82.equalsIgnoreCase(name)) {
			return calc_ctg_82();
		}
		if ($calc_ctg_83.equalsIgnoreCase(name)) {
			return calc_ctg_83();
		}
		if ($calc_ctg_84.equalsIgnoreCase(name)) {
			return calc_ctg_84();
		}
		if ($calc_ctg_85.equalsIgnoreCase(name)) {
			return calc_ctg_85();
		}
		if ($calc_ctg_86.equalsIgnoreCase(name)) {
			return calc_ctg_86();
		}
		if ($calc_ctg_87.equalsIgnoreCase(name)) {
			return calc_ctg_87();
		}
		if ($calc_ctg_88.equalsIgnoreCase(name)) {
			return calc_ctg_88();
		}
		if ($calc_ctg_89.equalsIgnoreCase(name)) {
			return calc_ctg_89();
		}
		if ($calc_ctg_90.equalsIgnoreCase(name)) {
			return calc_ctg_90();
		}
		if ($calc_ctg_91.equalsIgnoreCase(name)) {
			return calc_ctg_91();
		}
		if ($calc_ctg_92.equalsIgnoreCase(name)) {
			return calc_ctg_92();
		}
		if ($calc_ctg_93.equalsIgnoreCase(name)) {
			return calc_ctg_93();
		}
		if ($calc_ctg_94.equalsIgnoreCase(name)) {
			return calc_ctg_94();
		}
		if ($calc_ctg_95.equalsIgnoreCase(name)) {
			return calc_ctg_95();
		}
		if ($calc_ctg_96.equalsIgnoreCase(name)) {
			return calc_ctg_96();
		}
		if ($calc_ctg_97.equalsIgnoreCase(name)) {
			return calc_ctg_97();
		}
		if ($calc_ctg_98.equalsIgnoreCase(name)) {
			return calc_ctg_98();
		}
		if ($calc_ctg_99.equalsIgnoreCase(name)) {
			return calc_ctg_99();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			return ctg_prio();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($calc_ctg_00.equalsIgnoreCase(name)) {
			return calc_ctg_00();
		}
		if ($calc_ctg_01.equalsIgnoreCase(name)) {
			return calc_ctg_01();
		}
		if ($calc_ctg_02.equalsIgnoreCase(name)) {
			return calc_ctg_02();
		}
		if ($calc_ctg_03.equalsIgnoreCase(name)) {
			return calc_ctg_03();
		}
		if ($calc_ctg_04.equalsIgnoreCase(name)) {
			return calc_ctg_04();
		}
		if ($calc_ctg_05.equalsIgnoreCase(name)) {
			return calc_ctg_05();
		}
		if ($calc_ctg_06.equalsIgnoreCase(name)) {
			return calc_ctg_06();
		}
		if ($calc_ctg_07.equalsIgnoreCase(name)) {
			return calc_ctg_07();
		}
		if ($calc_ctg_08.equalsIgnoreCase(name)) {
			return calc_ctg_08();
		}
		if ($calc_ctg_09.equalsIgnoreCase(name)) {
			return calc_ctg_09();
		}
		if ($calc_ctg_10.equalsIgnoreCase(name)) {
			return calc_ctg_10();
		}
		if ($calc_ctg_11.equalsIgnoreCase(name)) {
			return calc_ctg_11();
		}
		if ($calc_ctg_12.equalsIgnoreCase(name)) {
			return calc_ctg_12();
		}
		if ($calc_ctg_13.equalsIgnoreCase(name)) {
			return calc_ctg_13();
		}
		if ($calc_ctg_14.equalsIgnoreCase(name)) {
			return calc_ctg_14();
		}
		if ($calc_ctg_15.equalsIgnoreCase(name)) {
			return calc_ctg_15();
		}
		if ($calc_ctg_16.equalsIgnoreCase(name)) {
			return calc_ctg_16();
		}
		if ($calc_ctg_17.equalsIgnoreCase(name)) {
			return calc_ctg_17();
		}
		if ($calc_ctg_18.equalsIgnoreCase(name)) {
			return calc_ctg_18();
		}
		if ($calc_ctg_19.equalsIgnoreCase(name)) {
			return calc_ctg_19();
		}
		if ($calc_ctg_20.equalsIgnoreCase(name)) {
			return calc_ctg_20();
		}
		if ($calc_ctg_21.equalsIgnoreCase(name)) {
			return calc_ctg_21();
		}
		if ($calc_ctg_22.equalsIgnoreCase(name)) {
			return calc_ctg_22();
		}
		if ($calc_ctg_23.equalsIgnoreCase(name)) {
			return calc_ctg_23();
		}
		if ($calc_ctg_24.equalsIgnoreCase(name)) {
			return calc_ctg_24();
		}
		if ($calc_ctg_25.equalsIgnoreCase(name)) {
			return calc_ctg_25();
		}
		if ($calc_ctg_26.equalsIgnoreCase(name)) {
			return calc_ctg_26();
		}
		if ($calc_ctg_27.equalsIgnoreCase(name)) {
			return calc_ctg_27();
		}
		if ($calc_ctg_28.equalsIgnoreCase(name)) {
			return calc_ctg_28();
		}
		if ($calc_ctg_29.equalsIgnoreCase(name)) {
			return calc_ctg_29();
		}
		if ($calc_ctg_30.equalsIgnoreCase(name)) {
			return calc_ctg_30();
		}
		if ($calc_ctg_31.equalsIgnoreCase(name)) {
			return calc_ctg_31();
		}
		if ($calc_ctg_32.equalsIgnoreCase(name)) {
			return calc_ctg_32();
		}
		if ($calc_ctg_33.equalsIgnoreCase(name)) {
			return calc_ctg_33();
		}
		if ($calc_ctg_34.equalsIgnoreCase(name)) {
			return calc_ctg_34();
		}
		if ($calc_ctg_35.equalsIgnoreCase(name)) {
			return calc_ctg_35();
		}
		if ($calc_ctg_36.equalsIgnoreCase(name)) {
			return calc_ctg_36();
		}
		if ($calc_ctg_37.equalsIgnoreCase(name)) {
			return calc_ctg_37();
		}
		if ($calc_ctg_38.equalsIgnoreCase(name)) {
			return calc_ctg_38();
		}
		if ($calc_ctg_39.equalsIgnoreCase(name)) {
			return calc_ctg_39();
		}
		if ($calc_ctg_40.equalsIgnoreCase(name)) {
			return calc_ctg_40();
		}
		if ($calc_ctg_41.equalsIgnoreCase(name)) {
			return calc_ctg_41();
		}
		if ($calc_ctg_42.equalsIgnoreCase(name)) {
			return calc_ctg_42();
		}
		if ($calc_ctg_43.equalsIgnoreCase(name)) {
			return calc_ctg_43();
		}
		if ($calc_ctg_44.equalsIgnoreCase(name)) {
			return calc_ctg_44();
		}
		if ($calc_ctg_45.equalsIgnoreCase(name)) {
			return calc_ctg_45();
		}
		if ($calc_ctg_46.equalsIgnoreCase(name)) {
			return calc_ctg_46();
		}
		if ($calc_ctg_47.equalsIgnoreCase(name)) {
			return calc_ctg_47();
		}
		if ($calc_ctg_48.equalsIgnoreCase(name)) {
			return calc_ctg_48();
		}
		if ($calc_ctg_49.equalsIgnoreCase(name)) {
			return calc_ctg_49();
		}
		if ($calc_ctg_50.equalsIgnoreCase(name)) {
			return calc_ctg_50();
		}
		if ($calc_ctg_51.equalsIgnoreCase(name)) {
			return calc_ctg_51();
		}
		if ($calc_ctg_52.equalsIgnoreCase(name)) {
			return calc_ctg_52();
		}
		if ($calc_ctg_53.equalsIgnoreCase(name)) {
			return calc_ctg_53();
		}
		if ($calc_ctg_54.equalsIgnoreCase(name)) {
			return calc_ctg_54();
		}
		if ($calc_ctg_55.equalsIgnoreCase(name)) {
			return calc_ctg_55();
		}
		if ($calc_ctg_56.equalsIgnoreCase(name)) {
			return calc_ctg_56();
		}
		if ($calc_ctg_57.equalsIgnoreCase(name)) {
			return calc_ctg_57();
		}
		if ($calc_ctg_58.equalsIgnoreCase(name)) {
			return calc_ctg_58();
		}
		if ($calc_ctg_59.equalsIgnoreCase(name)) {
			return calc_ctg_59();
		}
		if ($calc_ctg_60.equalsIgnoreCase(name)) {
			return calc_ctg_60();
		}
		if ($calc_ctg_61.equalsIgnoreCase(name)) {
			return calc_ctg_61();
		}
		if ($calc_ctg_62.equalsIgnoreCase(name)) {
			return calc_ctg_62();
		}
		if ($calc_ctg_63.equalsIgnoreCase(name)) {
			return calc_ctg_63();
		}
		if ($calc_ctg_64.equalsIgnoreCase(name)) {
			return calc_ctg_64();
		}
		if ($calc_ctg_65.equalsIgnoreCase(name)) {
			return calc_ctg_65();
		}
		if ($calc_ctg_66.equalsIgnoreCase(name)) {
			return calc_ctg_66();
		}
		if ($calc_ctg_67.equalsIgnoreCase(name)) {
			return calc_ctg_67();
		}
		if ($calc_ctg_68.equalsIgnoreCase(name)) {
			return calc_ctg_68();
		}
		if ($calc_ctg_69.equalsIgnoreCase(name)) {
			return calc_ctg_69();
		}
		if ($calc_ctg_70.equalsIgnoreCase(name)) {
			return calc_ctg_70();
		}
		if ($calc_ctg_71.equalsIgnoreCase(name)) {
			return calc_ctg_71();
		}
		if ($calc_ctg_72.equalsIgnoreCase(name)) {
			return calc_ctg_72();
		}
		if ($calc_ctg_73.equalsIgnoreCase(name)) {
			return calc_ctg_73();
		}
		if ($calc_ctg_74.equalsIgnoreCase(name)) {
			return calc_ctg_74();
		}
		if ($calc_ctg_75.equalsIgnoreCase(name)) {
			return calc_ctg_75();
		}
		if ($calc_ctg_76.equalsIgnoreCase(name)) {
			return calc_ctg_76();
		}
		if ($calc_ctg_77.equalsIgnoreCase(name)) {
			return calc_ctg_77();
		}
		if ($calc_ctg_78.equalsIgnoreCase(name)) {
			return calc_ctg_78();
		}
		if ($calc_ctg_79.equalsIgnoreCase(name)) {
			return calc_ctg_79();
		}
		if ($calc_ctg_80.equalsIgnoreCase(name)) {
			return calc_ctg_80();
		}
		if ($calc_ctg_81.equalsIgnoreCase(name)) {
			return calc_ctg_81();
		}
		if ($calc_ctg_82.equalsIgnoreCase(name)) {
			return calc_ctg_82();
		}
		if ($calc_ctg_83.equalsIgnoreCase(name)) {
			return calc_ctg_83();
		}
		if ($calc_ctg_84.equalsIgnoreCase(name)) {
			return calc_ctg_84();
		}
		if ($calc_ctg_85.equalsIgnoreCase(name)) {
			return calc_ctg_85();
		}
		if ($calc_ctg_86.equalsIgnoreCase(name)) {
			return calc_ctg_86();
		}
		if ($calc_ctg_87.equalsIgnoreCase(name)) {
			return calc_ctg_87();
		}
		if ($calc_ctg_88.equalsIgnoreCase(name)) {
			return calc_ctg_88();
		}
		if ($calc_ctg_89.equalsIgnoreCase(name)) {
			return calc_ctg_89();
		}
		if ($calc_ctg_90.equalsIgnoreCase(name)) {
			return calc_ctg_90();
		}
		if ($calc_ctg_91.equalsIgnoreCase(name)) {
			return calc_ctg_91();
		}
		if ($calc_ctg_92.equalsIgnoreCase(name)) {
			return calc_ctg_92();
		}
		if ($calc_ctg_93.equalsIgnoreCase(name)) {
			return calc_ctg_93();
		}
		if ($calc_ctg_94.equalsIgnoreCase(name)) {
			return calc_ctg_94();
		}
		if ($calc_ctg_95.equalsIgnoreCase(name)) {
			return calc_ctg_95();
		}
		if ($calc_ctg_96.equalsIgnoreCase(name)) {
			return calc_ctg_96();
		}
		if ($calc_ctg_97.equalsIgnoreCase(name)) {
			return calc_ctg_97();
		}
		if ($calc_ctg_98.equalsIgnoreCase(name)) {
			return calc_ctg_98();
		}
		if ($calc_ctg_99.equalsIgnoreCase(name)) {
			return calc_ctg_99();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			return ctg_prio();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
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
		if ($calc_ctg_00.equalsIgnoreCase(name)) {
			calc_ctg_00(value);
			return;
		}
		if ($calc_ctg_01.equalsIgnoreCase(name)) {
			calc_ctg_01(value);
			return;
		}
		if ($calc_ctg_02.equalsIgnoreCase(name)) {
			calc_ctg_02(value);
			return;
		}
		if ($calc_ctg_03.equalsIgnoreCase(name)) {
			calc_ctg_03(value);
			return;
		}
		if ($calc_ctg_04.equalsIgnoreCase(name)) {
			calc_ctg_04(value);
			return;
		}
		if ($calc_ctg_05.equalsIgnoreCase(name)) {
			calc_ctg_05(value);
			return;
		}
		if ($calc_ctg_06.equalsIgnoreCase(name)) {
			calc_ctg_06(value);
			return;
		}
		if ($calc_ctg_07.equalsIgnoreCase(name)) {
			calc_ctg_07(value);
			return;
		}
		if ($calc_ctg_08.equalsIgnoreCase(name)) {
			calc_ctg_08(value);
			return;
		}
		if ($calc_ctg_09.equalsIgnoreCase(name)) {
			calc_ctg_09(value);
			return;
		}
		if ($calc_ctg_10.equalsIgnoreCase(name)) {
			calc_ctg_10(value);
			return;
		}
		if ($calc_ctg_11.equalsIgnoreCase(name)) {
			calc_ctg_11(value);
			return;
		}
		if ($calc_ctg_12.equalsIgnoreCase(name)) {
			calc_ctg_12(value);
			return;
		}
		if ($calc_ctg_13.equalsIgnoreCase(name)) {
			calc_ctg_13(value);
			return;
		}
		if ($calc_ctg_14.equalsIgnoreCase(name)) {
			calc_ctg_14(value);
			return;
		}
		if ($calc_ctg_15.equalsIgnoreCase(name)) {
			calc_ctg_15(value);
			return;
		}
		if ($calc_ctg_16.equalsIgnoreCase(name)) {
			calc_ctg_16(value);
			return;
		}
		if ($calc_ctg_17.equalsIgnoreCase(name)) {
			calc_ctg_17(value);
			return;
		}
		if ($calc_ctg_18.equalsIgnoreCase(name)) {
			calc_ctg_18(value);
			return;
		}
		if ($calc_ctg_19.equalsIgnoreCase(name)) {
			calc_ctg_19(value);
			return;
		}
		if ($calc_ctg_20.equalsIgnoreCase(name)) {
			calc_ctg_20(value);
			return;
		}
		if ($calc_ctg_21.equalsIgnoreCase(name)) {
			calc_ctg_21(value);
			return;
		}
		if ($calc_ctg_22.equalsIgnoreCase(name)) {
			calc_ctg_22(value);
			return;
		}
		if ($calc_ctg_23.equalsIgnoreCase(name)) {
			calc_ctg_23(value);
			return;
		}
		if ($calc_ctg_24.equalsIgnoreCase(name)) {
			calc_ctg_24(value);
			return;
		}
		if ($calc_ctg_25.equalsIgnoreCase(name)) {
			calc_ctg_25(value);
			return;
		}
		if ($calc_ctg_26.equalsIgnoreCase(name)) {
			calc_ctg_26(value);
			return;
		}
		if ($calc_ctg_27.equalsIgnoreCase(name)) {
			calc_ctg_27(value);
			return;
		}
		if ($calc_ctg_28.equalsIgnoreCase(name)) {
			calc_ctg_28(value);
			return;
		}
		if ($calc_ctg_29.equalsIgnoreCase(name)) {
			calc_ctg_29(value);
			return;
		}
		if ($calc_ctg_30.equalsIgnoreCase(name)) {
			calc_ctg_30(value);
			return;
		}
		if ($calc_ctg_31.equalsIgnoreCase(name)) {
			calc_ctg_31(value);
			return;
		}
		if ($calc_ctg_32.equalsIgnoreCase(name)) {
			calc_ctg_32(value);
			return;
		}
		if ($calc_ctg_33.equalsIgnoreCase(name)) {
			calc_ctg_33(value);
			return;
		}
		if ($calc_ctg_34.equalsIgnoreCase(name)) {
			calc_ctg_34(value);
			return;
		}
		if ($calc_ctg_35.equalsIgnoreCase(name)) {
			calc_ctg_35(value);
			return;
		}
		if ($calc_ctg_36.equalsIgnoreCase(name)) {
			calc_ctg_36(value);
			return;
		}
		if ($calc_ctg_37.equalsIgnoreCase(name)) {
			calc_ctg_37(value);
			return;
		}
		if ($calc_ctg_38.equalsIgnoreCase(name)) {
			calc_ctg_38(value);
			return;
		}
		if ($calc_ctg_39.equalsIgnoreCase(name)) {
			calc_ctg_39(value);
			return;
		}
		if ($calc_ctg_40.equalsIgnoreCase(name)) {
			calc_ctg_40(value);
			return;
		}
		if ($calc_ctg_41.equalsIgnoreCase(name)) {
			calc_ctg_41(value);
			return;
		}
		if ($calc_ctg_42.equalsIgnoreCase(name)) {
			calc_ctg_42(value);
			return;
		}
		if ($calc_ctg_43.equalsIgnoreCase(name)) {
			calc_ctg_43(value);
			return;
		}
		if ($calc_ctg_44.equalsIgnoreCase(name)) {
			calc_ctg_44(value);
			return;
		}
		if ($calc_ctg_45.equalsIgnoreCase(name)) {
			calc_ctg_45(value);
			return;
		}
		if ($calc_ctg_46.equalsIgnoreCase(name)) {
			calc_ctg_46(value);
			return;
		}
		if ($calc_ctg_47.equalsIgnoreCase(name)) {
			calc_ctg_47(value);
			return;
		}
		if ($calc_ctg_48.equalsIgnoreCase(name)) {
			calc_ctg_48(value);
			return;
		}
		if ($calc_ctg_49.equalsIgnoreCase(name)) {
			calc_ctg_49(value);
			return;
		}
		if ($calc_ctg_50.equalsIgnoreCase(name)) {
			calc_ctg_50(value);
			return;
		}
		if ($calc_ctg_51.equalsIgnoreCase(name)) {
			calc_ctg_51(value);
			return;
		}
		if ($calc_ctg_52.equalsIgnoreCase(name)) {
			calc_ctg_52(value);
			return;
		}
		if ($calc_ctg_53.equalsIgnoreCase(name)) {
			calc_ctg_53(value);
			return;
		}
		if ($calc_ctg_54.equalsIgnoreCase(name)) {
			calc_ctg_54(value);
			return;
		}
		if ($calc_ctg_55.equalsIgnoreCase(name)) {
			calc_ctg_55(value);
			return;
		}
		if ($calc_ctg_56.equalsIgnoreCase(name)) {
			calc_ctg_56(value);
			return;
		}
		if ($calc_ctg_57.equalsIgnoreCase(name)) {
			calc_ctg_57(value);
			return;
		}
		if ($calc_ctg_58.equalsIgnoreCase(name)) {
			calc_ctg_58(value);
			return;
		}
		if ($calc_ctg_59.equalsIgnoreCase(name)) {
			calc_ctg_59(value);
			return;
		}
		if ($calc_ctg_60.equalsIgnoreCase(name)) {
			calc_ctg_60(value);
			return;
		}
		if ($calc_ctg_61.equalsIgnoreCase(name)) {
			calc_ctg_61(value);
			return;
		}
		if ($calc_ctg_62.equalsIgnoreCase(name)) {
			calc_ctg_62(value);
			return;
		}
		if ($calc_ctg_63.equalsIgnoreCase(name)) {
			calc_ctg_63(value);
			return;
		}
		if ($calc_ctg_64.equalsIgnoreCase(name)) {
			calc_ctg_64(value);
			return;
		}
		if ($calc_ctg_65.equalsIgnoreCase(name)) {
			calc_ctg_65(value);
			return;
		}
		if ($calc_ctg_66.equalsIgnoreCase(name)) {
			calc_ctg_66(value);
			return;
		}
		if ($calc_ctg_67.equalsIgnoreCase(name)) {
			calc_ctg_67(value);
			return;
		}
		if ($calc_ctg_68.equalsIgnoreCase(name)) {
			calc_ctg_68(value);
			return;
		}
		if ($calc_ctg_69.equalsIgnoreCase(name)) {
			calc_ctg_69(value);
			return;
		}
		if ($calc_ctg_70.equalsIgnoreCase(name)) {
			calc_ctg_70(value);
			return;
		}
		if ($calc_ctg_71.equalsIgnoreCase(name)) {
			calc_ctg_71(value);
			return;
		}
		if ($calc_ctg_72.equalsIgnoreCase(name)) {
			calc_ctg_72(value);
			return;
		}
		if ($calc_ctg_73.equalsIgnoreCase(name)) {
			calc_ctg_73(value);
			return;
		}
		if ($calc_ctg_74.equalsIgnoreCase(name)) {
			calc_ctg_74(value);
			return;
		}
		if ($calc_ctg_75.equalsIgnoreCase(name)) {
			calc_ctg_75(value);
			return;
		}
		if ($calc_ctg_76.equalsIgnoreCase(name)) {
			calc_ctg_76(value);
			return;
		}
		if ($calc_ctg_77.equalsIgnoreCase(name)) {
			calc_ctg_77(value);
			return;
		}
		if ($calc_ctg_78.equalsIgnoreCase(name)) {
			calc_ctg_78(value);
			return;
		}
		if ($calc_ctg_79.equalsIgnoreCase(name)) {
			calc_ctg_79(value);
			return;
		}
		if ($calc_ctg_80.equalsIgnoreCase(name)) {
			calc_ctg_80(value);
			return;
		}
		if ($calc_ctg_81.equalsIgnoreCase(name)) {
			calc_ctg_81(value);
			return;
		}
		if ($calc_ctg_82.equalsIgnoreCase(name)) {
			calc_ctg_82(value);
			return;
		}
		if ($calc_ctg_83.equalsIgnoreCase(name)) {
			calc_ctg_83(value);
			return;
		}
		if ($calc_ctg_84.equalsIgnoreCase(name)) {
			calc_ctg_84(value);
			return;
		}
		if ($calc_ctg_85.equalsIgnoreCase(name)) {
			calc_ctg_85(value);
			return;
		}
		if ($calc_ctg_86.equalsIgnoreCase(name)) {
			calc_ctg_86(value);
			return;
		}
		if ($calc_ctg_87.equalsIgnoreCase(name)) {
			calc_ctg_87(value);
			return;
		}
		if ($calc_ctg_88.equalsIgnoreCase(name)) {
			calc_ctg_88(value);
			return;
		}
		if ($calc_ctg_89.equalsIgnoreCase(name)) {
			calc_ctg_89(value);
			return;
		}
		if ($calc_ctg_90.equalsIgnoreCase(name)) {
			calc_ctg_90(value);
			return;
		}
		if ($calc_ctg_91.equalsIgnoreCase(name)) {
			calc_ctg_91(value);
			return;
		}
		if ($calc_ctg_92.equalsIgnoreCase(name)) {
			calc_ctg_92(value);
			return;
		}
		if ($calc_ctg_93.equalsIgnoreCase(name)) {
			calc_ctg_93(value);
			return;
		}
		if ($calc_ctg_94.equalsIgnoreCase(name)) {
			calc_ctg_94(value);
			return;
		}
		if ($calc_ctg_95.equalsIgnoreCase(name)) {
			calc_ctg_95(value);
			return;
		}
		if ($calc_ctg_96.equalsIgnoreCase(name)) {
			calc_ctg_96(value);
			return;
		}
		if ($calc_ctg_97.equalsIgnoreCase(name)) {
			calc_ctg_97(value);
			return;
		}
		if ($calc_ctg_98.equalsIgnoreCase(name)) {
			calc_ctg_98(value);
			return;
		}
		if ($calc_ctg_99.equalsIgnoreCase(name)) {
			calc_ctg_99(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			ctg_prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			ctg_prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			ctg_prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			ctg_prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			ctg_prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
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
		if ($calc_ctg_00.equalsIgnoreCase(name)) {
			calc_ctg_00(value);
			return;
		}
		if ($calc_ctg_01.equalsIgnoreCase(name)) {
			calc_ctg_01(value);
			return;
		}
		if ($calc_ctg_02.equalsIgnoreCase(name)) {
			calc_ctg_02(value);
			return;
		}
		if ($calc_ctg_03.equalsIgnoreCase(name)) {
			calc_ctg_03(value);
			return;
		}
		if ($calc_ctg_04.equalsIgnoreCase(name)) {
			calc_ctg_04(value);
			return;
		}
		if ($calc_ctg_05.equalsIgnoreCase(name)) {
			calc_ctg_05(value);
			return;
		}
		if ($calc_ctg_06.equalsIgnoreCase(name)) {
			calc_ctg_06(value);
			return;
		}
		if ($calc_ctg_07.equalsIgnoreCase(name)) {
			calc_ctg_07(value);
			return;
		}
		if ($calc_ctg_08.equalsIgnoreCase(name)) {
			calc_ctg_08(value);
			return;
		}
		if ($calc_ctg_09.equalsIgnoreCase(name)) {
			calc_ctg_09(value);
			return;
		}
		if ($calc_ctg_10.equalsIgnoreCase(name)) {
			calc_ctg_10(value);
			return;
		}
		if ($calc_ctg_11.equalsIgnoreCase(name)) {
			calc_ctg_11(value);
			return;
		}
		if ($calc_ctg_12.equalsIgnoreCase(name)) {
			calc_ctg_12(value);
			return;
		}
		if ($calc_ctg_13.equalsIgnoreCase(name)) {
			calc_ctg_13(value);
			return;
		}
		if ($calc_ctg_14.equalsIgnoreCase(name)) {
			calc_ctg_14(value);
			return;
		}
		if ($calc_ctg_15.equalsIgnoreCase(name)) {
			calc_ctg_15(value);
			return;
		}
		if ($calc_ctg_16.equalsIgnoreCase(name)) {
			calc_ctg_16(value);
			return;
		}
		if ($calc_ctg_17.equalsIgnoreCase(name)) {
			calc_ctg_17(value);
			return;
		}
		if ($calc_ctg_18.equalsIgnoreCase(name)) {
			calc_ctg_18(value);
			return;
		}
		if ($calc_ctg_19.equalsIgnoreCase(name)) {
			calc_ctg_19(value);
			return;
		}
		if ($calc_ctg_20.equalsIgnoreCase(name)) {
			calc_ctg_20(value);
			return;
		}
		if ($calc_ctg_21.equalsIgnoreCase(name)) {
			calc_ctg_21(value);
			return;
		}
		if ($calc_ctg_22.equalsIgnoreCase(name)) {
			calc_ctg_22(value);
			return;
		}
		if ($calc_ctg_23.equalsIgnoreCase(name)) {
			calc_ctg_23(value);
			return;
		}
		if ($calc_ctg_24.equalsIgnoreCase(name)) {
			calc_ctg_24(value);
			return;
		}
		if ($calc_ctg_25.equalsIgnoreCase(name)) {
			calc_ctg_25(value);
			return;
		}
		if ($calc_ctg_26.equalsIgnoreCase(name)) {
			calc_ctg_26(value);
			return;
		}
		if ($calc_ctg_27.equalsIgnoreCase(name)) {
			calc_ctg_27(value);
			return;
		}
		if ($calc_ctg_28.equalsIgnoreCase(name)) {
			calc_ctg_28(value);
			return;
		}
		if ($calc_ctg_29.equalsIgnoreCase(name)) {
			calc_ctg_29(value);
			return;
		}
		if ($calc_ctg_30.equalsIgnoreCase(name)) {
			calc_ctg_30(value);
			return;
		}
		if ($calc_ctg_31.equalsIgnoreCase(name)) {
			calc_ctg_31(value);
			return;
		}
		if ($calc_ctg_32.equalsIgnoreCase(name)) {
			calc_ctg_32(value);
			return;
		}
		if ($calc_ctg_33.equalsIgnoreCase(name)) {
			calc_ctg_33(value);
			return;
		}
		if ($calc_ctg_34.equalsIgnoreCase(name)) {
			calc_ctg_34(value);
			return;
		}
		if ($calc_ctg_35.equalsIgnoreCase(name)) {
			calc_ctg_35(value);
			return;
		}
		if ($calc_ctg_36.equalsIgnoreCase(name)) {
			calc_ctg_36(value);
			return;
		}
		if ($calc_ctg_37.equalsIgnoreCase(name)) {
			calc_ctg_37(value);
			return;
		}
		if ($calc_ctg_38.equalsIgnoreCase(name)) {
			calc_ctg_38(value);
			return;
		}
		if ($calc_ctg_39.equalsIgnoreCase(name)) {
			calc_ctg_39(value);
			return;
		}
		if ($calc_ctg_40.equalsIgnoreCase(name)) {
			calc_ctg_40(value);
			return;
		}
		if ($calc_ctg_41.equalsIgnoreCase(name)) {
			calc_ctg_41(value);
			return;
		}
		if ($calc_ctg_42.equalsIgnoreCase(name)) {
			calc_ctg_42(value);
			return;
		}
		if ($calc_ctg_43.equalsIgnoreCase(name)) {
			calc_ctg_43(value);
			return;
		}
		if ($calc_ctg_44.equalsIgnoreCase(name)) {
			calc_ctg_44(value);
			return;
		}
		if ($calc_ctg_45.equalsIgnoreCase(name)) {
			calc_ctg_45(value);
			return;
		}
		if ($calc_ctg_46.equalsIgnoreCase(name)) {
			calc_ctg_46(value);
			return;
		}
		if ($calc_ctg_47.equalsIgnoreCase(name)) {
			calc_ctg_47(value);
			return;
		}
		if ($calc_ctg_48.equalsIgnoreCase(name)) {
			calc_ctg_48(value);
			return;
		}
		if ($calc_ctg_49.equalsIgnoreCase(name)) {
			calc_ctg_49(value);
			return;
		}
		if ($calc_ctg_50.equalsIgnoreCase(name)) {
			calc_ctg_50(value);
			return;
		}
		if ($calc_ctg_51.equalsIgnoreCase(name)) {
			calc_ctg_51(value);
			return;
		}
		if ($calc_ctg_52.equalsIgnoreCase(name)) {
			calc_ctg_52(value);
			return;
		}
		if ($calc_ctg_53.equalsIgnoreCase(name)) {
			calc_ctg_53(value);
			return;
		}
		if ($calc_ctg_54.equalsIgnoreCase(name)) {
			calc_ctg_54(value);
			return;
		}
		if ($calc_ctg_55.equalsIgnoreCase(name)) {
			calc_ctg_55(value);
			return;
		}
		if ($calc_ctg_56.equalsIgnoreCase(name)) {
			calc_ctg_56(value);
			return;
		}
		if ($calc_ctg_57.equalsIgnoreCase(name)) {
			calc_ctg_57(value);
			return;
		}
		if ($calc_ctg_58.equalsIgnoreCase(name)) {
			calc_ctg_58(value);
			return;
		}
		if ($calc_ctg_59.equalsIgnoreCase(name)) {
			calc_ctg_59(value);
			return;
		}
		if ($calc_ctg_60.equalsIgnoreCase(name)) {
			calc_ctg_60(value);
			return;
		}
		if ($calc_ctg_61.equalsIgnoreCase(name)) {
			calc_ctg_61(value);
			return;
		}
		if ($calc_ctg_62.equalsIgnoreCase(name)) {
			calc_ctg_62(value);
			return;
		}
		if ($calc_ctg_63.equalsIgnoreCase(name)) {
			calc_ctg_63(value);
			return;
		}
		if ($calc_ctg_64.equalsIgnoreCase(name)) {
			calc_ctg_64(value);
			return;
		}
		if ($calc_ctg_65.equalsIgnoreCase(name)) {
			calc_ctg_65(value);
			return;
		}
		if ($calc_ctg_66.equalsIgnoreCase(name)) {
			calc_ctg_66(value);
			return;
		}
		if ($calc_ctg_67.equalsIgnoreCase(name)) {
			calc_ctg_67(value);
			return;
		}
		if ($calc_ctg_68.equalsIgnoreCase(name)) {
			calc_ctg_68(value);
			return;
		}
		if ($calc_ctg_69.equalsIgnoreCase(name)) {
			calc_ctg_69(value);
			return;
		}
		if ($calc_ctg_70.equalsIgnoreCase(name)) {
			calc_ctg_70(value);
			return;
		}
		if ($calc_ctg_71.equalsIgnoreCase(name)) {
			calc_ctg_71(value);
			return;
		}
		if ($calc_ctg_72.equalsIgnoreCase(name)) {
			calc_ctg_72(value);
			return;
		}
		if ($calc_ctg_73.equalsIgnoreCase(name)) {
			calc_ctg_73(value);
			return;
		}
		if ($calc_ctg_74.equalsIgnoreCase(name)) {
			calc_ctg_74(value);
			return;
		}
		if ($calc_ctg_75.equalsIgnoreCase(name)) {
			calc_ctg_75(value);
			return;
		}
		if ($calc_ctg_76.equalsIgnoreCase(name)) {
			calc_ctg_76(value);
			return;
		}
		if ($calc_ctg_77.equalsIgnoreCase(name)) {
			calc_ctg_77(value);
			return;
		}
		if ($calc_ctg_78.equalsIgnoreCase(name)) {
			calc_ctg_78(value);
			return;
		}
		if ($calc_ctg_79.equalsIgnoreCase(name)) {
			calc_ctg_79(value);
			return;
		}
		if ($calc_ctg_80.equalsIgnoreCase(name)) {
			calc_ctg_80(value);
			return;
		}
		if ($calc_ctg_81.equalsIgnoreCase(name)) {
			calc_ctg_81(value);
			return;
		}
		if ($calc_ctg_82.equalsIgnoreCase(name)) {
			calc_ctg_82(value);
			return;
		}
		if ($calc_ctg_83.equalsIgnoreCase(name)) {
			calc_ctg_83(value);
			return;
		}
		if ($calc_ctg_84.equalsIgnoreCase(name)) {
			calc_ctg_84(value);
			return;
		}
		if ($calc_ctg_85.equalsIgnoreCase(name)) {
			calc_ctg_85(value);
			return;
		}
		if ($calc_ctg_86.equalsIgnoreCase(name)) {
			calc_ctg_86(value);
			return;
		}
		if ($calc_ctg_87.equalsIgnoreCase(name)) {
			calc_ctg_87(value);
			return;
		}
		if ($calc_ctg_88.equalsIgnoreCase(name)) {
			calc_ctg_88(value);
			return;
		}
		if ($calc_ctg_89.equalsIgnoreCase(name)) {
			calc_ctg_89(value);
			return;
		}
		if ($calc_ctg_90.equalsIgnoreCase(name)) {
			calc_ctg_90(value);
			return;
		}
		if ($calc_ctg_91.equalsIgnoreCase(name)) {
			calc_ctg_91(value);
			return;
		}
		if ($calc_ctg_92.equalsIgnoreCase(name)) {
			calc_ctg_92(value);
			return;
		}
		if ($calc_ctg_93.equalsIgnoreCase(name)) {
			calc_ctg_93(value);
			return;
		}
		if ($calc_ctg_94.equalsIgnoreCase(name)) {
			calc_ctg_94(value);
			return;
		}
		if ($calc_ctg_95.equalsIgnoreCase(name)) {
			calc_ctg_95(value);
			return;
		}
		if ($calc_ctg_96.equalsIgnoreCase(name)) {
			calc_ctg_96(value);
			return;
		}
		if ($calc_ctg_97.equalsIgnoreCase(name)) {
			calc_ctg_97(value);
			return;
		}
		if ($calc_ctg_98.equalsIgnoreCase(name)) {
			calc_ctg_98(value);
			return;
		}
		if ($calc_ctg_99.equalsIgnoreCase(name)) {
			calc_ctg_99(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			ctg_prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			ctg_prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			ctg_prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			ctg_prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			ctg_prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

