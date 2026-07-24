package mcframe.clientMABC.MABCP1510;

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
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_00 = "col_conv_typ_00";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_01 = "col_conv_typ_01";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_02 = "col_conv_typ_02";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_03 = "col_conv_typ_03";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_04 = "col_conv_typ_04";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_05 = "col_conv_typ_05";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_06 = "col_conv_typ_06";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_07 = "col_conv_typ_07";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_08 = "col_conv_typ_08";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_09 = "col_conv_typ_09";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_10 = "col_conv_typ_10";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_11 = "col_conv_typ_11";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_12 = "col_conv_typ_12";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_13 = "col_conv_typ_13";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_14 = "col_conv_typ_14";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_15 = "col_conv_typ_15";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_16 = "col_conv_typ_16";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_17 = "col_conv_typ_17";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_18 = "col_conv_typ_18";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_19 = "col_conv_typ_19";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_20 = "col_conv_typ_20";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_21 = "col_conv_typ_21";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_22 = "col_conv_typ_22";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_23 = "col_conv_typ_23";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_24 = "col_conv_typ_24";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_25 = "col_conv_typ_25";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_26 = "col_conv_typ_26";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_27 = "col_conv_typ_27";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_28 = "col_conv_typ_28";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_29 = "col_conv_typ_29";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_30 = "col_conv_typ_30";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_31 = "col_conv_typ_31";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_32 = "col_conv_typ_32";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_33 = "col_conv_typ_33";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_34 = "col_conv_typ_34";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_35 = "col_conv_typ_35";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_36 = "col_conv_typ_36";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_37 = "col_conv_typ_37";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_38 = "col_conv_typ_38";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_39 = "col_conv_typ_39";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_40 = "col_conv_typ_40";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_41 = "col_conv_typ_41";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_42 = "col_conv_typ_42";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_43 = "col_conv_typ_43";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_44 = "col_conv_typ_44";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_45 = "col_conv_typ_45";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_46 = "col_conv_typ_46";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_47 = "col_conv_typ_47";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_48 = "col_conv_typ_48";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_49 = "col_conv_typ_49";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_50 = "col_conv_typ_50";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_51 = "col_conv_typ_51";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_52 = "col_conv_typ_52";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_53 = "col_conv_typ_53";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_54 = "col_conv_typ_54";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_55 = "col_conv_typ_55";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_56 = "col_conv_typ_56";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_57 = "col_conv_typ_57";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_58 = "col_conv_typ_58";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_59 = "col_conv_typ_59";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_60 = "col_conv_typ_60";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_61 = "col_conv_typ_61";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_62 = "col_conv_typ_62";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_63 = "col_conv_typ_63";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_64 = "col_conv_typ_64";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_65 = "col_conv_typ_65";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_66 = "col_conv_typ_66";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_67 = "col_conv_typ_67";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_68 = "col_conv_typ_68";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_69 = "col_conv_typ_69";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_70 = "col_conv_typ_70";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_71 = "col_conv_typ_71";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_72 = "col_conv_typ_72";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_73 = "col_conv_typ_73";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_74 = "col_conv_typ_74";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_75 = "col_conv_typ_75";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_76 = "col_conv_typ_76";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_77 = "col_conv_typ_77";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_78 = "col_conv_typ_78";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_79 = "col_conv_typ_79";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_80 = "col_conv_typ_80";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_81 = "col_conv_typ_81";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_82 = "col_conv_typ_82";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_83 = "col_conv_typ_83";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_84 = "col_conv_typ_84";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_85 = "col_conv_typ_85";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_86 = "col_conv_typ_86";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_87 = "col_conv_typ_87";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_88 = "col_conv_typ_88";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_89 = "col_conv_typ_89";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_90 = "col_conv_typ_90";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_91 = "col_conv_typ_91";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_92 = "col_conv_typ_92";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_93 = "col_conv_typ_93";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_94 = "col_conv_typ_94";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_95 = "col_conv_typ_95";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_96 = "col_conv_typ_96";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_97 = "col_conv_typ_97";
	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public static final String $col_conv_typ_98 = "col_conv_typ_98";
	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public static final String $col_conv_typ_99 = "col_conv_typ_99";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta col_conv_typ_00_META = createCommonMeta($col_conv_typ_00, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_01_META = createCommonMeta($col_conv_typ_01, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_02_META = createCommonMeta($col_conv_typ_02, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_03_META = createCommonMeta($col_conv_typ_03, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_04_META = createCommonMeta($col_conv_typ_04, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_05_META = createCommonMeta($col_conv_typ_05, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_06_META = createCommonMeta($col_conv_typ_06, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_07_META = createCommonMeta($col_conv_typ_07, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_08_META = createCommonMeta($col_conv_typ_08, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_09_META = createCommonMeta($col_conv_typ_09, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_10_META = createCommonMeta($col_conv_typ_10, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_11_META = createCommonMeta($col_conv_typ_11, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_12_META = createCommonMeta($col_conv_typ_12, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_13_META = createCommonMeta($col_conv_typ_13, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_14_META = createCommonMeta($col_conv_typ_14, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_15_META = createCommonMeta($col_conv_typ_15, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_16_META = createCommonMeta($col_conv_typ_16, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_17_META = createCommonMeta($col_conv_typ_17, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_18_META = createCommonMeta($col_conv_typ_18, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_19_META = createCommonMeta($col_conv_typ_19, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_20_META = createCommonMeta($col_conv_typ_20, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_21_META = createCommonMeta($col_conv_typ_21, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_22_META = createCommonMeta($col_conv_typ_22, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_23_META = createCommonMeta($col_conv_typ_23, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_24_META = createCommonMeta($col_conv_typ_24, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_25_META = createCommonMeta($col_conv_typ_25, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_26_META = createCommonMeta($col_conv_typ_26, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_27_META = createCommonMeta($col_conv_typ_27, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_28_META = createCommonMeta($col_conv_typ_28, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_29_META = createCommonMeta($col_conv_typ_29, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_30_META = createCommonMeta($col_conv_typ_30, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_31_META = createCommonMeta($col_conv_typ_31, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_32_META = createCommonMeta($col_conv_typ_32, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_33_META = createCommonMeta($col_conv_typ_33, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_34_META = createCommonMeta($col_conv_typ_34, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_35_META = createCommonMeta($col_conv_typ_35, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_36_META = createCommonMeta($col_conv_typ_36, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_37_META = createCommonMeta($col_conv_typ_37, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_38_META = createCommonMeta($col_conv_typ_38, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_39_META = createCommonMeta($col_conv_typ_39, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_40_META = createCommonMeta($col_conv_typ_40, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_41_META = createCommonMeta($col_conv_typ_41, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_42_META = createCommonMeta($col_conv_typ_42, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_43_META = createCommonMeta($col_conv_typ_43, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_44_META = createCommonMeta($col_conv_typ_44, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_45_META = createCommonMeta($col_conv_typ_45, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_46_META = createCommonMeta($col_conv_typ_46, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_47_META = createCommonMeta($col_conv_typ_47, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_48_META = createCommonMeta($col_conv_typ_48, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_49_META = createCommonMeta($col_conv_typ_49, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_50_META = createCommonMeta($col_conv_typ_50, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_51_META = createCommonMeta($col_conv_typ_51, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_52_META = createCommonMeta($col_conv_typ_52, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_53_META = createCommonMeta($col_conv_typ_53, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_54_META = createCommonMeta($col_conv_typ_54, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_55_META = createCommonMeta($col_conv_typ_55, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_56_META = createCommonMeta($col_conv_typ_56, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_57_META = createCommonMeta($col_conv_typ_57, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_58_META = createCommonMeta($col_conv_typ_58, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_59_META = createCommonMeta($col_conv_typ_59, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_60_META = createCommonMeta($col_conv_typ_60, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_61_META = createCommonMeta($col_conv_typ_61, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_62_META = createCommonMeta($col_conv_typ_62, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_63_META = createCommonMeta($col_conv_typ_63, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_64_META = createCommonMeta($col_conv_typ_64, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_65_META = createCommonMeta($col_conv_typ_65, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_66_META = createCommonMeta($col_conv_typ_66, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_67_META = createCommonMeta($col_conv_typ_67, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_68_META = createCommonMeta($col_conv_typ_68, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_69_META = createCommonMeta($col_conv_typ_69, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_70_META = createCommonMeta($col_conv_typ_70, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_71_META = createCommonMeta($col_conv_typ_71, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_72_META = createCommonMeta($col_conv_typ_72, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_73_META = createCommonMeta($col_conv_typ_73, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_74_META = createCommonMeta($col_conv_typ_74, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_75_META = createCommonMeta($col_conv_typ_75, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_76_META = createCommonMeta($col_conv_typ_76, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_77_META = createCommonMeta($col_conv_typ_77, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_78_META = createCommonMeta($col_conv_typ_78, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_79_META = createCommonMeta($col_conv_typ_79, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_80_META = createCommonMeta($col_conv_typ_80, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_81_META = createCommonMeta($col_conv_typ_81, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_82_META = createCommonMeta($col_conv_typ_82, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_83_META = createCommonMeta($col_conv_typ_83, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_84_META = createCommonMeta($col_conv_typ_84, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_85_META = createCommonMeta($col_conv_typ_85, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_86_META = createCommonMeta($col_conv_typ_86, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_87_META = createCommonMeta($col_conv_typ_87, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_88_META = createCommonMeta($col_conv_typ_88, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_89_META = createCommonMeta($col_conv_typ_89, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_90_META = createCommonMeta($col_conv_typ_90, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_91_META = createCommonMeta($col_conv_typ_91, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_92_META = createCommonMeta($col_conv_typ_92, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_93_META = createCommonMeta($col_conv_typ_93, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_94_META = createCommonMeta($col_conv_typ_94, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_95_META = createCommonMeta($col_conv_typ_95, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_96_META = createCommonMeta($col_conv_typ_96, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_97_META = createCommonMeta($col_conv_typ_97, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta col_conv_typ_98_META = createCommonMeta($col_conv_typ_98, mcframe.commonMA.meta.MA_META.COL_CONV_TYP);
	public static final MCMeta col_conv_typ_99_META = createCommonMeta($col_conv_typ_99, mcframe.commonMA.meta.MA_META.COL_CONV_TYP_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<DispDtlR> constMetas = new ConstMetaList<DispDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			del_flg_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			bp_cd_META,
			bp_nm_META,
			col_conv_typ_00_META,
			col_conv_typ_01_META,
			col_conv_typ_02_META,
			col_conv_typ_03_META,
			col_conv_typ_04_META,
			col_conv_typ_05_META,
			col_conv_typ_06_META,
			col_conv_typ_07_META,
			col_conv_typ_08_META,
			col_conv_typ_09_META,
			col_conv_typ_10_META,
			col_conv_typ_11_META,
			col_conv_typ_12_META,
			col_conv_typ_13_META,
			col_conv_typ_14_META,
			col_conv_typ_15_META,
			col_conv_typ_16_META,
			col_conv_typ_17_META,
			col_conv_typ_18_META,
			col_conv_typ_19_META,
			col_conv_typ_20_META,
			col_conv_typ_21_META,
			col_conv_typ_22_META,
			col_conv_typ_23_META,
			col_conv_typ_24_META,
			col_conv_typ_25_META,
			col_conv_typ_26_META,
			col_conv_typ_27_META,
			col_conv_typ_28_META,
			col_conv_typ_29_META,
			col_conv_typ_30_META,
			col_conv_typ_31_META,
			col_conv_typ_32_META,
			col_conv_typ_33_META,
			col_conv_typ_34_META,
			col_conv_typ_35_META,
			col_conv_typ_36_META,
			col_conv_typ_37_META,
			col_conv_typ_38_META,
			col_conv_typ_39_META,
			col_conv_typ_40_META,
			col_conv_typ_41_META,
			col_conv_typ_42_META,
			col_conv_typ_43_META,
			col_conv_typ_44_META,
			col_conv_typ_45_META,
			col_conv_typ_46_META,
			col_conv_typ_47_META,
			col_conv_typ_48_META,
			col_conv_typ_49_META,
			col_conv_typ_50_META,
			col_conv_typ_51_META,
			col_conv_typ_52_META,
			col_conv_typ_53_META,
			col_conv_typ_54_META,
			col_conv_typ_55_META,
			col_conv_typ_56_META,
			col_conv_typ_57_META,
			col_conv_typ_58_META,
			col_conv_typ_59_META,
			col_conv_typ_60_META,
			col_conv_typ_61_META,
			col_conv_typ_62_META,
			col_conv_typ_63_META,
			col_conv_typ_64_META,
			col_conv_typ_65_META,
			col_conv_typ_66_META,
			col_conv_typ_67_META,
			col_conv_typ_68_META,
			col_conv_typ_69_META,
			col_conv_typ_70_META,
			col_conv_typ_71_META,
			col_conv_typ_72_META,
			col_conv_typ_73_META,
			col_conv_typ_74_META,
			col_conv_typ_75_META,
			col_conv_typ_76_META,
			col_conv_typ_77_META,
			col_conv_typ_78_META,
			col_conv_typ_79_META,
			col_conv_typ_80_META,
			col_conv_typ_81_META,
			col_conv_typ_82_META,
			col_conv_typ_83_META,
			col_conv_typ_84_META,
			col_conv_typ_85_META,
			col_conv_typ_86_META,
			col_conv_typ_87_META,
			col_conv_typ_88_META,
			col_conv_typ_89_META,
			col_conv_typ_90_META,
			col_conv_typ_91_META,
			col_conv_typ_92_META,
			col_conv_typ_93_META,
			col_conv_typ_94_META,
			col_conv_typ_95_META,
			col_conv_typ_96_META,
			col_conv_typ_97_META,
			col_conv_typ_98_META,
			col_conv_typ_99_META,
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
			$ext_sys_cd,	// ext_sys_cd
			$bp_cd	// bp_cd
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$col_conv_typ_00, "col_conv_typ_nm"},	// col_conv_typ_00
				{$col_conv_typ_02, "col_conv_typ_nm"},	// col_conv_typ_02
				{$col_conv_typ_04, "col_conv_typ_nm"},	// col_conv_typ_04
				{$col_conv_typ_06, "col_conv_typ_nm"},	// col_conv_typ_06
				{$col_conv_typ_08, "col_conv_typ_nm"},	// col_conv_typ_08
				{$col_conv_typ_10, "col_conv_typ_nm"},	// col_conv_typ_10
				{$col_conv_typ_12, "col_conv_typ_nm"},	// col_conv_typ_12
				{$col_conv_typ_14, "col_conv_typ_nm"},	// col_conv_typ_14
				{$col_conv_typ_16, "col_conv_typ_nm"},	// col_conv_typ_16
				{$col_conv_typ_18, "col_conv_typ_nm"},	// col_conv_typ_18
				{$col_conv_typ_20, "col_conv_typ_nm"},	// col_conv_typ_20
				{$col_conv_typ_22, "col_conv_typ_nm"},	// col_conv_typ_22
				{$col_conv_typ_24, "col_conv_typ_nm"},	// col_conv_typ_24
				{$col_conv_typ_26, "col_conv_typ_nm"},	// col_conv_typ_26
				{$col_conv_typ_28, "col_conv_typ_nm"},	// col_conv_typ_28
				{$col_conv_typ_30, "col_conv_typ_nm"},	// col_conv_typ_30
				{$col_conv_typ_32, "col_conv_typ_nm"},	// col_conv_typ_32
				{$col_conv_typ_34, "col_conv_typ_nm"},	// col_conv_typ_34
				{$col_conv_typ_36, "col_conv_typ_nm"},	// col_conv_typ_36
				{$col_conv_typ_38, "col_conv_typ_nm"},	// col_conv_typ_38
				{$col_conv_typ_40, "col_conv_typ_nm"},	// col_conv_typ_40
				{$col_conv_typ_42, "col_conv_typ_nm"},	// col_conv_typ_42
				{$col_conv_typ_44, "col_conv_typ_nm"},	// col_conv_typ_44
				{$col_conv_typ_46, "col_conv_typ_nm"},	// col_conv_typ_46
				{$col_conv_typ_48, "col_conv_typ_nm"},	// col_conv_typ_48
				{$col_conv_typ_50, "col_conv_typ_nm"},	// col_conv_typ_50
				{$col_conv_typ_52, "col_conv_typ_nm"},	// col_conv_typ_52
				{$col_conv_typ_54, "col_conv_typ_nm"},	// col_conv_typ_54
				{$col_conv_typ_56, "col_conv_typ_nm"},	// col_conv_typ_56
				{$col_conv_typ_58, "col_conv_typ_nm"},	// col_conv_typ_58
				{$col_conv_typ_60, "col_conv_typ_nm"},	// col_conv_typ_60
				{$col_conv_typ_62, "col_conv_typ_nm"},	// col_conv_typ_62
				{$col_conv_typ_64, "col_conv_typ_nm"},	// col_conv_typ_64
				{$col_conv_typ_66, "col_conv_typ_nm"},	// col_conv_typ_66
				{$col_conv_typ_68, "col_conv_typ_nm"},	// col_conv_typ_68
				{$col_conv_typ_70, "col_conv_typ_nm"},	// col_conv_typ_70
				{$col_conv_typ_72, "col_conv_typ_nm"},	// col_conv_typ_72
				{$col_conv_typ_74, "col_conv_typ_nm"},	// col_conv_typ_74
				{$col_conv_typ_76, "col_conv_typ_nm"},	// col_conv_typ_76
				{$col_conv_typ_78, "col_conv_typ_nm"},	// col_conv_typ_78
				{$col_conv_typ_80, "col_conv_typ_nm"},	// col_conv_typ_80
				{$col_conv_typ_82, "col_conv_typ_nm"},	// col_conv_typ_82
				{$col_conv_typ_84, "col_conv_typ_nm"},	// col_conv_typ_84
				{$col_conv_typ_86, "col_conv_typ_nm"},	// col_conv_typ_86
				{$col_conv_typ_88, "col_conv_typ_nm"},	// col_conv_typ_88
				{$col_conv_typ_90, "col_conv_typ_nm"},	// col_conv_typ_90
				{$col_conv_typ_92, "col_conv_typ_nm"},	// col_conv_typ_92
				{$col_conv_typ_94, "col_conv_typ_nm"},	// col_conv_typ_94
				{$col_conv_typ_96, "col_conv_typ_nm"},	// col_conv_typ_96
				{$col_conv_typ_98, "col_conv_typ_nm"}	// col_conv_typ_98
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$bp_cd, "MAC_BP_IS_SRCH_TYP.COMM"}	// bp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$bp_cd, "bp_is_srch_typ"}	// bp_cd
			}
		)),
		new MCExtMap.Entry($$VH_KEY, new MCExtList(
			new String[][]{
				{$col_conv_typ_00, "ELM"},	// col_conv_typ_00
				{$col_conv_typ_01, "ELM"},	// col_conv_typ_01
				{$col_conv_typ_02, "ELM"},	// col_conv_typ_02
				{$col_conv_typ_03, "ELM"},	// col_conv_typ_03
				{$col_conv_typ_04, "ELM"},	// col_conv_typ_04
				{$col_conv_typ_05, "ELM"},	// col_conv_typ_05
				{$col_conv_typ_06, "ELM"},	// col_conv_typ_06
				{$col_conv_typ_07, "ELM"},	// col_conv_typ_07
				{$col_conv_typ_08, "ELM"},	// col_conv_typ_08
				{$col_conv_typ_09, "ELM"},	// col_conv_typ_09
				{$col_conv_typ_10, "ELM"},	// col_conv_typ_10
				{$col_conv_typ_11, "ELM"},	// col_conv_typ_11
				{$col_conv_typ_12, "ELM"},	// col_conv_typ_12
				{$col_conv_typ_13, "ELM"},	// col_conv_typ_13
				{$col_conv_typ_14, "ELM"},	// col_conv_typ_14
				{$col_conv_typ_15, "ELM"},	// col_conv_typ_15
				{$col_conv_typ_16, "ELM"},	// col_conv_typ_16
				{$col_conv_typ_17, "ELM"},	// col_conv_typ_17
				{$col_conv_typ_18, "ELM"},	// col_conv_typ_18
				{$col_conv_typ_19, "ELM"},	// col_conv_typ_19
				{$col_conv_typ_20, "ELM"},	// col_conv_typ_20
				{$col_conv_typ_21, "ELM"},	// col_conv_typ_21
				{$col_conv_typ_22, "ELM"},	// col_conv_typ_22
				{$col_conv_typ_23, "ELM"},	// col_conv_typ_23
				{$col_conv_typ_24, "ELM"},	// col_conv_typ_24
				{$col_conv_typ_25, "ELM"},	// col_conv_typ_25
				{$col_conv_typ_26, "ELM"},	// col_conv_typ_26
				{$col_conv_typ_27, "ELM"},	// col_conv_typ_27
				{$col_conv_typ_28, "ELM"},	// col_conv_typ_28
				{$col_conv_typ_29, "ELM"},	// col_conv_typ_29
				{$col_conv_typ_30, "ELM"},	// col_conv_typ_30
				{$col_conv_typ_31, "ELM"},	// col_conv_typ_31
				{$col_conv_typ_32, "ELM"},	// col_conv_typ_32
				{$col_conv_typ_33, "ELM"},	// col_conv_typ_33
				{$col_conv_typ_34, "ELM"},	// col_conv_typ_34
				{$col_conv_typ_35, "ELM"},	// col_conv_typ_35
				{$col_conv_typ_36, "ELM"},	// col_conv_typ_36
				{$col_conv_typ_37, "ELM"},	// col_conv_typ_37
				{$col_conv_typ_38, "ELM"},	// col_conv_typ_38
				{$col_conv_typ_39, "ELM"},	// col_conv_typ_39
				{$col_conv_typ_40, "ELM"},	// col_conv_typ_40
				{$col_conv_typ_41, "ELM"},	// col_conv_typ_41
				{$col_conv_typ_42, "ELM"},	// col_conv_typ_42
				{$col_conv_typ_43, "ELM"},	// col_conv_typ_43
				{$col_conv_typ_44, "ELM"},	// col_conv_typ_44
				{$col_conv_typ_45, "ELM"},	// col_conv_typ_45
				{$col_conv_typ_46, "ELM"},	// col_conv_typ_46
				{$col_conv_typ_47, "ELM"},	// col_conv_typ_47
				{$col_conv_typ_48, "ELM"},	// col_conv_typ_48
				{$col_conv_typ_49, "ELM"},	// col_conv_typ_49
				{$col_conv_typ_50, "ELM"},	// col_conv_typ_50
				{$col_conv_typ_51, "ELM"},	// col_conv_typ_51
				{$col_conv_typ_52, "ELM"},	// col_conv_typ_52
				{$col_conv_typ_53, "ELM"},	// col_conv_typ_53
				{$col_conv_typ_54, "ELM"},	// col_conv_typ_54
				{$col_conv_typ_55, "ELM"},	// col_conv_typ_55
				{$col_conv_typ_56, "ELM"},	// col_conv_typ_56
				{$col_conv_typ_57, "ELM"},	// col_conv_typ_57
				{$col_conv_typ_58, "ELM"},	// col_conv_typ_58
				{$col_conv_typ_59, "ELM"},	// col_conv_typ_59
				{$col_conv_typ_60, "ELM"},	// col_conv_typ_60
				{$col_conv_typ_61, "ELM"},	// col_conv_typ_61
				{$col_conv_typ_62, "ELM"},	// col_conv_typ_62
				{$col_conv_typ_63, "ELM"},	// col_conv_typ_63
				{$col_conv_typ_64, "ELM"},	// col_conv_typ_64
				{$col_conv_typ_65, "ELM"},	// col_conv_typ_65
				{$col_conv_typ_66, "ELM"},	// col_conv_typ_66
				{$col_conv_typ_67, "ELM"},	// col_conv_typ_67
				{$col_conv_typ_68, "ELM"},	// col_conv_typ_68
				{$col_conv_typ_69, "ELM"},	// col_conv_typ_69
				{$col_conv_typ_70, "ELM"},	// col_conv_typ_70
				{$col_conv_typ_71, "ELM"},	// col_conv_typ_71
				{$col_conv_typ_72, "ELM"},	// col_conv_typ_72
				{$col_conv_typ_73, "ELM"},	// col_conv_typ_73
				{$col_conv_typ_74, "ELM"},	// col_conv_typ_74
				{$col_conv_typ_75, "ELM"},	// col_conv_typ_75
				{$col_conv_typ_76, "ELM"},	// col_conv_typ_76
				{$col_conv_typ_77, "ELM"},	// col_conv_typ_77
				{$col_conv_typ_78, "ELM"},	// col_conv_typ_78
				{$col_conv_typ_79, "ELM"},	// col_conv_typ_79
				{$col_conv_typ_80, "ELM"},	// col_conv_typ_80
				{$col_conv_typ_81, "ELM"},	// col_conv_typ_81
				{$col_conv_typ_82, "ELM"},	// col_conv_typ_82
				{$col_conv_typ_83, "ELM"},	// col_conv_typ_83
				{$col_conv_typ_84, "ELM"},	// col_conv_typ_84
				{$col_conv_typ_85, "ELM"},	// col_conv_typ_85
				{$col_conv_typ_86, "ELM"},	// col_conv_typ_86
				{$col_conv_typ_87, "ELM"},	// col_conv_typ_87
				{$col_conv_typ_88, "ELM"},	// col_conv_typ_88
				{$col_conv_typ_89, "ELM"},	// col_conv_typ_89
				{$col_conv_typ_90, "ELM"},	// col_conv_typ_90
				{$col_conv_typ_91, "ELM"},	// col_conv_typ_91
				{$col_conv_typ_92, "ELM"},	// col_conv_typ_92
				{$col_conv_typ_93, "ELM"},	// col_conv_typ_93
				{$col_conv_typ_94, "ELM"},	// col_conv_typ_94
				{$col_conv_typ_95, "ELM"},	// col_conv_typ_95
				{$col_conv_typ_96, "ELM"},	// col_conv_typ_96
				{$col_conv_typ_97, "ELM"},	// col_conv_typ_97
				{$col_conv_typ_98, "ELM"},	// col_conv_typ_98
				{$col_conv_typ_99, "ELM"}	// col_conv_typ_99
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
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 2, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 2, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 3, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 3, $ext_sys_nm, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 4, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 4, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 5, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 5, $bp_nm, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_00() {
		return getConstString(offset + 6, $col_conv_typ_00);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_00(String value) {
		setConstString(offset + 6, $col_conv_typ_00, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_01() {
		return getConstString(offset + 7, $col_conv_typ_01);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_01(String value) {
		setConstString(offset + 7, $col_conv_typ_01, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_02() {
		return getConstString(offset + 8, $col_conv_typ_02);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_02(String value) {
		setConstString(offset + 8, $col_conv_typ_02, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_03() {
		return getConstString(offset + 9, $col_conv_typ_03);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_03(String value) {
		setConstString(offset + 9, $col_conv_typ_03, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_04() {
		return getConstString(offset + 10, $col_conv_typ_04);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_04(String value) {
		setConstString(offset + 10, $col_conv_typ_04, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_05() {
		return getConstString(offset + 11, $col_conv_typ_05);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_05(String value) {
		setConstString(offset + 11, $col_conv_typ_05, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_06() {
		return getConstString(offset + 12, $col_conv_typ_06);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_06(String value) {
		setConstString(offset + 12, $col_conv_typ_06, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_07() {
		return getConstString(offset + 13, $col_conv_typ_07);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_07(String value) {
		setConstString(offset + 13, $col_conv_typ_07, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_08() {
		return getConstString(offset + 14, $col_conv_typ_08);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_08(String value) {
		setConstString(offset + 14, $col_conv_typ_08, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_09() {
		return getConstString(offset + 15, $col_conv_typ_09);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_09(String value) {
		setConstString(offset + 15, $col_conv_typ_09, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_10() {
		return getConstString(offset + 16, $col_conv_typ_10);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_10(String value) {
		setConstString(offset + 16, $col_conv_typ_10, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_11() {
		return getConstString(offset + 17, $col_conv_typ_11);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_11(String value) {
		setConstString(offset + 17, $col_conv_typ_11, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_12() {
		return getConstString(offset + 18, $col_conv_typ_12);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_12(String value) {
		setConstString(offset + 18, $col_conv_typ_12, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_13() {
		return getConstString(offset + 19, $col_conv_typ_13);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_13(String value) {
		setConstString(offset + 19, $col_conv_typ_13, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_14() {
		return getConstString(offset + 20, $col_conv_typ_14);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_14(String value) {
		setConstString(offset + 20, $col_conv_typ_14, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_15() {
		return getConstString(offset + 21, $col_conv_typ_15);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_15(String value) {
		setConstString(offset + 21, $col_conv_typ_15, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_16() {
		return getConstString(offset + 22, $col_conv_typ_16);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_16(String value) {
		setConstString(offset + 22, $col_conv_typ_16, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_17() {
		return getConstString(offset + 23, $col_conv_typ_17);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_17(String value) {
		setConstString(offset + 23, $col_conv_typ_17, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_18() {
		return getConstString(offset + 24, $col_conv_typ_18);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_18(String value) {
		setConstString(offset + 24, $col_conv_typ_18, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_19() {
		return getConstString(offset + 25, $col_conv_typ_19);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_19(String value) {
		setConstString(offset + 25, $col_conv_typ_19, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_20() {
		return getConstString(offset + 26, $col_conv_typ_20);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_20(String value) {
		setConstString(offset + 26, $col_conv_typ_20, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_21() {
		return getConstString(offset + 27, $col_conv_typ_21);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_21(String value) {
		setConstString(offset + 27, $col_conv_typ_21, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_22() {
		return getConstString(offset + 28, $col_conv_typ_22);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_22(String value) {
		setConstString(offset + 28, $col_conv_typ_22, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_23() {
		return getConstString(offset + 29, $col_conv_typ_23);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_23(String value) {
		setConstString(offset + 29, $col_conv_typ_23, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_24() {
		return getConstString(offset + 30, $col_conv_typ_24);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_24(String value) {
		setConstString(offset + 30, $col_conv_typ_24, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_25() {
		return getConstString(offset + 31, $col_conv_typ_25);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_25(String value) {
		setConstString(offset + 31, $col_conv_typ_25, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_26() {
		return getConstString(offset + 32, $col_conv_typ_26);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_26(String value) {
		setConstString(offset + 32, $col_conv_typ_26, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_27() {
		return getConstString(offset + 33, $col_conv_typ_27);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_27(String value) {
		setConstString(offset + 33, $col_conv_typ_27, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_28() {
		return getConstString(offset + 34, $col_conv_typ_28);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_28(String value) {
		setConstString(offset + 34, $col_conv_typ_28, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_29() {
		return getConstString(offset + 35, $col_conv_typ_29);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_29(String value) {
		setConstString(offset + 35, $col_conv_typ_29, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_30() {
		return getConstString(offset + 36, $col_conv_typ_30);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_30(String value) {
		setConstString(offset + 36, $col_conv_typ_30, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_31() {
		return getConstString(offset + 37, $col_conv_typ_31);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_31(String value) {
		setConstString(offset + 37, $col_conv_typ_31, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_32() {
		return getConstString(offset + 38, $col_conv_typ_32);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_32(String value) {
		setConstString(offset + 38, $col_conv_typ_32, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_33() {
		return getConstString(offset + 39, $col_conv_typ_33);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_33(String value) {
		setConstString(offset + 39, $col_conv_typ_33, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_34() {
		return getConstString(offset + 40, $col_conv_typ_34);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_34(String value) {
		setConstString(offset + 40, $col_conv_typ_34, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_35() {
		return getConstString(offset + 41, $col_conv_typ_35);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_35(String value) {
		setConstString(offset + 41, $col_conv_typ_35, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_36() {
		return getConstString(offset + 42, $col_conv_typ_36);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_36(String value) {
		setConstString(offset + 42, $col_conv_typ_36, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_37() {
		return getConstString(offset + 43, $col_conv_typ_37);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_37(String value) {
		setConstString(offset + 43, $col_conv_typ_37, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_38() {
		return getConstString(offset + 44, $col_conv_typ_38);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_38(String value) {
		setConstString(offset + 44, $col_conv_typ_38, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_39() {
		return getConstString(offset + 45, $col_conv_typ_39);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_39(String value) {
		setConstString(offset + 45, $col_conv_typ_39, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_40() {
		return getConstString(offset + 46, $col_conv_typ_40);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_40(String value) {
		setConstString(offset + 46, $col_conv_typ_40, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_41() {
		return getConstString(offset + 47, $col_conv_typ_41);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_41(String value) {
		setConstString(offset + 47, $col_conv_typ_41, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_42() {
		return getConstString(offset + 48, $col_conv_typ_42);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_42(String value) {
		setConstString(offset + 48, $col_conv_typ_42, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_43() {
		return getConstString(offset + 49, $col_conv_typ_43);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_43(String value) {
		setConstString(offset + 49, $col_conv_typ_43, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_44() {
		return getConstString(offset + 50, $col_conv_typ_44);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_44(String value) {
		setConstString(offset + 50, $col_conv_typ_44, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_45() {
		return getConstString(offset + 51, $col_conv_typ_45);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_45(String value) {
		setConstString(offset + 51, $col_conv_typ_45, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_46() {
		return getConstString(offset + 52, $col_conv_typ_46);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_46(String value) {
		setConstString(offset + 52, $col_conv_typ_46, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_47() {
		return getConstString(offset + 53, $col_conv_typ_47);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_47(String value) {
		setConstString(offset + 53, $col_conv_typ_47, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_48() {
		return getConstString(offset + 54, $col_conv_typ_48);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_48(String value) {
		setConstString(offset + 54, $col_conv_typ_48, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_49() {
		return getConstString(offset + 55, $col_conv_typ_49);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_49(String value) {
		setConstString(offset + 55, $col_conv_typ_49, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_50() {
		return getConstString(offset + 56, $col_conv_typ_50);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_50(String value) {
		setConstString(offset + 56, $col_conv_typ_50, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_51() {
		return getConstString(offset + 57, $col_conv_typ_51);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_51(String value) {
		setConstString(offset + 57, $col_conv_typ_51, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_52() {
		return getConstString(offset + 58, $col_conv_typ_52);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_52(String value) {
		setConstString(offset + 58, $col_conv_typ_52, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_53() {
		return getConstString(offset + 59, $col_conv_typ_53);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_53(String value) {
		setConstString(offset + 59, $col_conv_typ_53, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_54() {
		return getConstString(offset + 60, $col_conv_typ_54);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_54(String value) {
		setConstString(offset + 60, $col_conv_typ_54, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_55() {
		return getConstString(offset + 61, $col_conv_typ_55);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_55(String value) {
		setConstString(offset + 61, $col_conv_typ_55, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_56() {
		return getConstString(offset + 62, $col_conv_typ_56);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_56(String value) {
		setConstString(offset + 62, $col_conv_typ_56, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_57() {
		return getConstString(offset + 63, $col_conv_typ_57);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_57(String value) {
		setConstString(offset + 63, $col_conv_typ_57, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_58() {
		return getConstString(offset + 64, $col_conv_typ_58);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_58(String value) {
		setConstString(offset + 64, $col_conv_typ_58, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_59() {
		return getConstString(offset + 65, $col_conv_typ_59);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_59(String value) {
		setConstString(offset + 65, $col_conv_typ_59, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_60() {
		return getConstString(offset + 66, $col_conv_typ_60);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_60(String value) {
		setConstString(offset + 66, $col_conv_typ_60, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_61() {
		return getConstString(offset + 67, $col_conv_typ_61);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_61(String value) {
		setConstString(offset + 67, $col_conv_typ_61, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_62() {
		return getConstString(offset + 68, $col_conv_typ_62);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_62(String value) {
		setConstString(offset + 68, $col_conv_typ_62, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_63() {
		return getConstString(offset + 69, $col_conv_typ_63);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_63(String value) {
		setConstString(offset + 69, $col_conv_typ_63, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_64() {
		return getConstString(offset + 70, $col_conv_typ_64);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_64(String value) {
		setConstString(offset + 70, $col_conv_typ_64, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_65() {
		return getConstString(offset + 71, $col_conv_typ_65);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_65(String value) {
		setConstString(offset + 71, $col_conv_typ_65, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_66() {
		return getConstString(offset + 72, $col_conv_typ_66);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_66(String value) {
		setConstString(offset + 72, $col_conv_typ_66, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_67() {
		return getConstString(offset + 73, $col_conv_typ_67);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_67(String value) {
		setConstString(offset + 73, $col_conv_typ_67, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_68() {
		return getConstString(offset + 74, $col_conv_typ_68);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_68(String value) {
		setConstString(offset + 74, $col_conv_typ_68, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_69() {
		return getConstString(offset + 75, $col_conv_typ_69);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_69(String value) {
		setConstString(offset + 75, $col_conv_typ_69, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_70() {
		return getConstString(offset + 76, $col_conv_typ_70);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_70(String value) {
		setConstString(offset + 76, $col_conv_typ_70, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_71() {
		return getConstString(offset + 77, $col_conv_typ_71);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_71(String value) {
		setConstString(offset + 77, $col_conv_typ_71, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_72() {
		return getConstString(offset + 78, $col_conv_typ_72);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_72(String value) {
		setConstString(offset + 78, $col_conv_typ_72, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_73() {
		return getConstString(offset + 79, $col_conv_typ_73);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_73(String value) {
		setConstString(offset + 79, $col_conv_typ_73, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_74() {
		return getConstString(offset + 80, $col_conv_typ_74);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_74(String value) {
		setConstString(offset + 80, $col_conv_typ_74, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_75() {
		return getConstString(offset + 81, $col_conv_typ_75);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_75(String value) {
		setConstString(offset + 81, $col_conv_typ_75, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_76() {
		return getConstString(offset + 82, $col_conv_typ_76);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_76(String value) {
		setConstString(offset + 82, $col_conv_typ_76, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_77() {
		return getConstString(offset + 83, $col_conv_typ_77);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_77(String value) {
		setConstString(offset + 83, $col_conv_typ_77, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_78() {
		return getConstString(offset + 84, $col_conv_typ_78);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_78(String value) {
		setConstString(offset + 84, $col_conv_typ_78, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_79() {
		return getConstString(offset + 85, $col_conv_typ_79);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_79(String value) {
		setConstString(offset + 85, $col_conv_typ_79, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_80() {
		return getConstString(offset + 86, $col_conv_typ_80);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_80(String value) {
		setConstString(offset + 86, $col_conv_typ_80, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_81() {
		return getConstString(offset + 87, $col_conv_typ_81);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_81(String value) {
		setConstString(offset + 87, $col_conv_typ_81, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_82() {
		return getConstString(offset + 88, $col_conv_typ_82);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_82(String value) {
		setConstString(offset + 88, $col_conv_typ_82, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_83() {
		return getConstString(offset + 89, $col_conv_typ_83);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_83(String value) {
		setConstString(offset + 89, $col_conv_typ_83, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_84() {
		return getConstString(offset + 90, $col_conv_typ_84);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_84(String value) {
		setConstString(offset + 90, $col_conv_typ_84, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_85() {
		return getConstString(offset + 91, $col_conv_typ_85);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_85(String value) {
		setConstString(offset + 91, $col_conv_typ_85, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_86() {
		return getConstString(offset + 92, $col_conv_typ_86);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_86(String value) {
		setConstString(offset + 92, $col_conv_typ_86, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_87() {
		return getConstString(offset + 93, $col_conv_typ_87);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_87(String value) {
		setConstString(offset + 93, $col_conv_typ_87, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_88() {
		return getConstString(offset + 94, $col_conv_typ_88);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_88(String value) {
		setConstString(offset + 94, $col_conv_typ_88, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_89() {
		return getConstString(offset + 95, $col_conv_typ_89);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_89(String value) {
		setConstString(offset + 95, $col_conv_typ_89, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_90() {
		return getConstString(offset + 96, $col_conv_typ_90);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_90(String value) {
		setConstString(offset + 96, $col_conv_typ_90, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_91() {
		return getConstString(offset + 97, $col_conv_typ_91);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_91(String value) {
		setConstString(offset + 97, $col_conv_typ_91, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_92() {
		return getConstString(offset + 98, $col_conv_typ_92);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_92(String value) {
		setConstString(offset + 98, $col_conv_typ_92, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_93() {
		return getConstString(offset + 99, $col_conv_typ_93);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_93(String value) {
		setConstString(offset + 99, $col_conv_typ_93, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_94() {
		return getConstString(offset + 100, $col_conv_typ_94);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_94(String value) {
		setConstString(offset + 100, $col_conv_typ_94, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_95() {
		return getConstString(offset + 101, $col_conv_typ_95);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_95(String value) {
		setConstString(offset + 101, $col_conv_typ_95, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_96() {
		return getConstString(offset + 102, $col_conv_typ_96);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_96(String value) {
		setConstString(offset + 102, $col_conv_typ_96, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_97() {
		return getConstString(offset + 103, $col_conv_typ_97);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_97(String value) {
		setConstString(offset + 103, $col_conv_typ_97, value);
	}


	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public String col_conv_typ_98() {
		return getConstString(offset + 104, $col_conv_typ_98);
	}

	/**
	 * Column conversion type 項目変換区分.<p>
	 *
	 */
	public void col_conv_typ_98(String value) {
		setConstString(offset + 104, $col_conv_typ_98, value);
	}


	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public String col_conv_typ_99() {
		return getConstString(offset + 105, $col_conv_typ_99);
	}

	/**
	 * Column conversion type name 項目変換区分名.<p>
	 *
	 */
	public void col_conv_typ_99(String value) {
		setConstString(offset + 105, $col_conv_typ_99, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 106, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 106, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 106, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 106, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 106, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 106, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($col_conv_typ_00.equalsIgnoreCase(name)) {
			return col_conv_typ_00();
		}
		if ($col_conv_typ_01.equalsIgnoreCase(name)) {
			return col_conv_typ_01();
		}
		if ($col_conv_typ_02.equalsIgnoreCase(name)) {
			return col_conv_typ_02();
		}
		if ($col_conv_typ_03.equalsIgnoreCase(name)) {
			return col_conv_typ_03();
		}
		if ($col_conv_typ_04.equalsIgnoreCase(name)) {
			return col_conv_typ_04();
		}
		if ($col_conv_typ_05.equalsIgnoreCase(name)) {
			return col_conv_typ_05();
		}
		if ($col_conv_typ_06.equalsIgnoreCase(name)) {
			return col_conv_typ_06();
		}
		if ($col_conv_typ_07.equalsIgnoreCase(name)) {
			return col_conv_typ_07();
		}
		if ($col_conv_typ_08.equalsIgnoreCase(name)) {
			return col_conv_typ_08();
		}
		if ($col_conv_typ_09.equalsIgnoreCase(name)) {
			return col_conv_typ_09();
		}
		if ($col_conv_typ_10.equalsIgnoreCase(name)) {
			return col_conv_typ_10();
		}
		if ($col_conv_typ_11.equalsIgnoreCase(name)) {
			return col_conv_typ_11();
		}
		if ($col_conv_typ_12.equalsIgnoreCase(name)) {
			return col_conv_typ_12();
		}
		if ($col_conv_typ_13.equalsIgnoreCase(name)) {
			return col_conv_typ_13();
		}
		if ($col_conv_typ_14.equalsIgnoreCase(name)) {
			return col_conv_typ_14();
		}
		if ($col_conv_typ_15.equalsIgnoreCase(name)) {
			return col_conv_typ_15();
		}
		if ($col_conv_typ_16.equalsIgnoreCase(name)) {
			return col_conv_typ_16();
		}
		if ($col_conv_typ_17.equalsIgnoreCase(name)) {
			return col_conv_typ_17();
		}
		if ($col_conv_typ_18.equalsIgnoreCase(name)) {
			return col_conv_typ_18();
		}
		if ($col_conv_typ_19.equalsIgnoreCase(name)) {
			return col_conv_typ_19();
		}
		if ($col_conv_typ_20.equalsIgnoreCase(name)) {
			return col_conv_typ_20();
		}
		if ($col_conv_typ_21.equalsIgnoreCase(name)) {
			return col_conv_typ_21();
		}
		if ($col_conv_typ_22.equalsIgnoreCase(name)) {
			return col_conv_typ_22();
		}
		if ($col_conv_typ_23.equalsIgnoreCase(name)) {
			return col_conv_typ_23();
		}
		if ($col_conv_typ_24.equalsIgnoreCase(name)) {
			return col_conv_typ_24();
		}
		if ($col_conv_typ_25.equalsIgnoreCase(name)) {
			return col_conv_typ_25();
		}
		if ($col_conv_typ_26.equalsIgnoreCase(name)) {
			return col_conv_typ_26();
		}
		if ($col_conv_typ_27.equalsIgnoreCase(name)) {
			return col_conv_typ_27();
		}
		if ($col_conv_typ_28.equalsIgnoreCase(name)) {
			return col_conv_typ_28();
		}
		if ($col_conv_typ_29.equalsIgnoreCase(name)) {
			return col_conv_typ_29();
		}
		if ($col_conv_typ_30.equalsIgnoreCase(name)) {
			return col_conv_typ_30();
		}
		if ($col_conv_typ_31.equalsIgnoreCase(name)) {
			return col_conv_typ_31();
		}
		if ($col_conv_typ_32.equalsIgnoreCase(name)) {
			return col_conv_typ_32();
		}
		if ($col_conv_typ_33.equalsIgnoreCase(name)) {
			return col_conv_typ_33();
		}
		if ($col_conv_typ_34.equalsIgnoreCase(name)) {
			return col_conv_typ_34();
		}
		if ($col_conv_typ_35.equalsIgnoreCase(name)) {
			return col_conv_typ_35();
		}
		if ($col_conv_typ_36.equalsIgnoreCase(name)) {
			return col_conv_typ_36();
		}
		if ($col_conv_typ_37.equalsIgnoreCase(name)) {
			return col_conv_typ_37();
		}
		if ($col_conv_typ_38.equalsIgnoreCase(name)) {
			return col_conv_typ_38();
		}
		if ($col_conv_typ_39.equalsIgnoreCase(name)) {
			return col_conv_typ_39();
		}
		if ($col_conv_typ_40.equalsIgnoreCase(name)) {
			return col_conv_typ_40();
		}
		if ($col_conv_typ_41.equalsIgnoreCase(name)) {
			return col_conv_typ_41();
		}
		if ($col_conv_typ_42.equalsIgnoreCase(name)) {
			return col_conv_typ_42();
		}
		if ($col_conv_typ_43.equalsIgnoreCase(name)) {
			return col_conv_typ_43();
		}
		if ($col_conv_typ_44.equalsIgnoreCase(name)) {
			return col_conv_typ_44();
		}
		if ($col_conv_typ_45.equalsIgnoreCase(name)) {
			return col_conv_typ_45();
		}
		if ($col_conv_typ_46.equalsIgnoreCase(name)) {
			return col_conv_typ_46();
		}
		if ($col_conv_typ_47.equalsIgnoreCase(name)) {
			return col_conv_typ_47();
		}
		if ($col_conv_typ_48.equalsIgnoreCase(name)) {
			return col_conv_typ_48();
		}
		if ($col_conv_typ_49.equalsIgnoreCase(name)) {
			return col_conv_typ_49();
		}
		if ($col_conv_typ_50.equalsIgnoreCase(name)) {
			return col_conv_typ_50();
		}
		if ($col_conv_typ_51.equalsIgnoreCase(name)) {
			return col_conv_typ_51();
		}
		if ($col_conv_typ_52.equalsIgnoreCase(name)) {
			return col_conv_typ_52();
		}
		if ($col_conv_typ_53.equalsIgnoreCase(name)) {
			return col_conv_typ_53();
		}
		if ($col_conv_typ_54.equalsIgnoreCase(name)) {
			return col_conv_typ_54();
		}
		if ($col_conv_typ_55.equalsIgnoreCase(name)) {
			return col_conv_typ_55();
		}
		if ($col_conv_typ_56.equalsIgnoreCase(name)) {
			return col_conv_typ_56();
		}
		if ($col_conv_typ_57.equalsIgnoreCase(name)) {
			return col_conv_typ_57();
		}
		if ($col_conv_typ_58.equalsIgnoreCase(name)) {
			return col_conv_typ_58();
		}
		if ($col_conv_typ_59.equalsIgnoreCase(name)) {
			return col_conv_typ_59();
		}
		if ($col_conv_typ_60.equalsIgnoreCase(name)) {
			return col_conv_typ_60();
		}
		if ($col_conv_typ_61.equalsIgnoreCase(name)) {
			return col_conv_typ_61();
		}
		if ($col_conv_typ_62.equalsIgnoreCase(name)) {
			return col_conv_typ_62();
		}
		if ($col_conv_typ_63.equalsIgnoreCase(name)) {
			return col_conv_typ_63();
		}
		if ($col_conv_typ_64.equalsIgnoreCase(name)) {
			return col_conv_typ_64();
		}
		if ($col_conv_typ_65.equalsIgnoreCase(name)) {
			return col_conv_typ_65();
		}
		if ($col_conv_typ_66.equalsIgnoreCase(name)) {
			return col_conv_typ_66();
		}
		if ($col_conv_typ_67.equalsIgnoreCase(name)) {
			return col_conv_typ_67();
		}
		if ($col_conv_typ_68.equalsIgnoreCase(name)) {
			return col_conv_typ_68();
		}
		if ($col_conv_typ_69.equalsIgnoreCase(name)) {
			return col_conv_typ_69();
		}
		if ($col_conv_typ_70.equalsIgnoreCase(name)) {
			return col_conv_typ_70();
		}
		if ($col_conv_typ_71.equalsIgnoreCase(name)) {
			return col_conv_typ_71();
		}
		if ($col_conv_typ_72.equalsIgnoreCase(name)) {
			return col_conv_typ_72();
		}
		if ($col_conv_typ_73.equalsIgnoreCase(name)) {
			return col_conv_typ_73();
		}
		if ($col_conv_typ_74.equalsIgnoreCase(name)) {
			return col_conv_typ_74();
		}
		if ($col_conv_typ_75.equalsIgnoreCase(name)) {
			return col_conv_typ_75();
		}
		if ($col_conv_typ_76.equalsIgnoreCase(name)) {
			return col_conv_typ_76();
		}
		if ($col_conv_typ_77.equalsIgnoreCase(name)) {
			return col_conv_typ_77();
		}
		if ($col_conv_typ_78.equalsIgnoreCase(name)) {
			return col_conv_typ_78();
		}
		if ($col_conv_typ_79.equalsIgnoreCase(name)) {
			return col_conv_typ_79();
		}
		if ($col_conv_typ_80.equalsIgnoreCase(name)) {
			return col_conv_typ_80();
		}
		if ($col_conv_typ_81.equalsIgnoreCase(name)) {
			return col_conv_typ_81();
		}
		if ($col_conv_typ_82.equalsIgnoreCase(name)) {
			return col_conv_typ_82();
		}
		if ($col_conv_typ_83.equalsIgnoreCase(name)) {
			return col_conv_typ_83();
		}
		if ($col_conv_typ_84.equalsIgnoreCase(name)) {
			return col_conv_typ_84();
		}
		if ($col_conv_typ_85.equalsIgnoreCase(name)) {
			return col_conv_typ_85();
		}
		if ($col_conv_typ_86.equalsIgnoreCase(name)) {
			return col_conv_typ_86();
		}
		if ($col_conv_typ_87.equalsIgnoreCase(name)) {
			return col_conv_typ_87();
		}
		if ($col_conv_typ_88.equalsIgnoreCase(name)) {
			return col_conv_typ_88();
		}
		if ($col_conv_typ_89.equalsIgnoreCase(name)) {
			return col_conv_typ_89();
		}
		if ($col_conv_typ_90.equalsIgnoreCase(name)) {
			return col_conv_typ_90();
		}
		if ($col_conv_typ_91.equalsIgnoreCase(name)) {
			return col_conv_typ_91();
		}
		if ($col_conv_typ_92.equalsIgnoreCase(name)) {
			return col_conv_typ_92();
		}
		if ($col_conv_typ_93.equalsIgnoreCase(name)) {
			return col_conv_typ_93();
		}
		if ($col_conv_typ_94.equalsIgnoreCase(name)) {
			return col_conv_typ_94();
		}
		if ($col_conv_typ_95.equalsIgnoreCase(name)) {
			return col_conv_typ_95();
		}
		if ($col_conv_typ_96.equalsIgnoreCase(name)) {
			return col_conv_typ_96();
		}
		if ($col_conv_typ_97.equalsIgnoreCase(name)) {
			return col_conv_typ_97();
		}
		if ($col_conv_typ_98.equalsIgnoreCase(name)) {
			return col_conv_typ_98();
		}
		if ($col_conv_typ_99.equalsIgnoreCase(name)) {
			return col_conv_typ_99();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($col_conv_typ_00.equalsIgnoreCase(name)) {
			return col_conv_typ_00();
		}
		if ($col_conv_typ_01.equalsIgnoreCase(name)) {
			return col_conv_typ_01();
		}
		if ($col_conv_typ_02.equalsIgnoreCase(name)) {
			return col_conv_typ_02();
		}
		if ($col_conv_typ_03.equalsIgnoreCase(name)) {
			return col_conv_typ_03();
		}
		if ($col_conv_typ_04.equalsIgnoreCase(name)) {
			return col_conv_typ_04();
		}
		if ($col_conv_typ_05.equalsIgnoreCase(name)) {
			return col_conv_typ_05();
		}
		if ($col_conv_typ_06.equalsIgnoreCase(name)) {
			return col_conv_typ_06();
		}
		if ($col_conv_typ_07.equalsIgnoreCase(name)) {
			return col_conv_typ_07();
		}
		if ($col_conv_typ_08.equalsIgnoreCase(name)) {
			return col_conv_typ_08();
		}
		if ($col_conv_typ_09.equalsIgnoreCase(name)) {
			return col_conv_typ_09();
		}
		if ($col_conv_typ_10.equalsIgnoreCase(name)) {
			return col_conv_typ_10();
		}
		if ($col_conv_typ_11.equalsIgnoreCase(name)) {
			return col_conv_typ_11();
		}
		if ($col_conv_typ_12.equalsIgnoreCase(name)) {
			return col_conv_typ_12();
		}
		if ($col_conv_typ_13.equalsIgnoreCase(name)) {
			return col_conv_typ_13();
		}
		if ($col_conv_typ_14.equalsIgnoreCase(name)) {
			return col_conv_typ_14();
		}
		if ($col_conv_typ_15.equalsIgnoreCase(name)) {
			return col_conv_typ_15();
		}
		if ($col_conv_typ_16.equalsIgnoreCase(name)) {
			return col_conv_typ_16();
		}
		if ($col_conv_typ_17.equalsIgnoreCase(name)) {
			return col_conv_typ_17();
		}
		if ($col_conv_typ_18.equalsIgnoreCase(name)) {
			return col_conv_typ_18();
		}
		if ($col_conv_typ_19.equalsIgnoreCase(name)) {
			return col_conv_typ_19();
		}
		if ($col_conv_typ_20.equalsIgnoreCase(name)) {
			return col_conv_typ_20();
		}
		if ($col_conv_typ_21.equalsIgnoreCase(name)) {
			return col_conv_typ_21();
		}
		if ($col_conv_typ_22.equalsIgnoreCase(name)) {
			return col_conv_typ_22();
		}
		if ($col_conv_typ_23.equalsIgnoreCase(name)) {
			return col_conv_typ_23();
		}
		if ($col_conv_typ_24.equalsIgnoreCase(name)) {
			return col_conv_typ_24();
		}
		if ($col_conv_typ_25.equalsIgnoreCase(name)) {
			return col_conv_typ_25();
		}
		if ($col_conv_typ_26.equalsIgnoreCase(name)) {
			return col_conv_typ_26();
		}
		if ($col_conv_typ_27.equalsIgnoreCase(name)) {
			return col_conv_typ_27();
		}
		if ($col_conv_typ_28.equalsIgnoreCase(name)) {
			return col_conv_typ_28();
		}
		if ($col_conv_typ_29.equalsIgnoreCase(name)) {
			return col_conv_typ_29();
		}
		if ($col_conv_typ_30.equalsIgnoreCase(name)) {
			return col_conv_typ_30();
		}
		if ($col_conv_typ_31.equalsIgnoreCase(name)) {
			return col_conv_typ_31();
		}
		if ($col_conv_typ_32.equalsIgnoreCase(name)) {
			return col_conv_typ_32();
		}
		if ($col_conv_typ_33.equalsIgnoreCase(name)) {
			return col_conv_typ_33();
		}
		if ($col_conv_typ_34.equalsIgnoreCase(name)) {
			return col_conv_typ_34();
		}
		if ($col_conv_typ_35.equalsIgnoreCase(name)) {
			return col_conv_typ_35();
		}
		if ($col_conv_typ_36.equalsIgnoreCase(name)) {
			return col_conv_typ_36();
		}
		if ($col_conv_typ_37.equalsIgnoreCase(name)) {
			return col_conv_typ_37();
		}
		if ($col_conv_typ_38.equalsIgnoreCase(name)) {
			return col_conv_typ_38();
		}
		if ($col_conv_typ_39.equalsIgnoreCase(name)) {
			return col_conv_typ_39();
		}
		if ($col_conv_typ_40.equalsIgnoreCase(name)) {
			return col_conv_typ_40();
		}
		if ($col_conv_typ_41.equalsIgnoreCase(name)) {
			return col_conv_typ_41();
		}
		if ($col_conv_typ_42.equalsIgnoreCase(name)) {
			return col_conv_typ_42();
		}
		if ($col_conv_typ_43.equalsIgnoreCase(name)) {
			return col_conv_typ_43();
		}
		if ($col_conv_typ_44.equalsIgnoreCase(name)) {
			return col_conv_typ_44();
		}
		if ($col_conv_typ_45.equalsIgnoreCase(name)) {
			return col_conv_typ_45();
		}
		if ($col_conv_typ_46.equalsIgnoreCase(name)) {
			return col_conv_typ_46();
		}
		if ($col_conv_typ_47.equalsIgnoreCase(name)) {
			return col_conv_typ_47();
		}
		if ($col_conv_typ_48.equalsIgnoreCase(name)) {
			return col_conv_typ_48();
		}
		if ($col_conv_typ_49.equalsIgnoreCase(name)) {
			return col_conv_typ_49();
		}
		if ($col_conv_typ_50.equalsIgnoreCase(name)) {
			return col_conv_typ_50();
		}
		if ($col_conv_typ_51.equalsIgnoreCase(name)) {
			return col_conv_typ_51();
		}
		if ($col_conv_typ_52.equalsIgnoreCase(name)) {
			return col_conv_typ_52();
		}
		if ($col_conv_typ_53.equalsIgnoreCase(name)) {
			return col_conv_typ_53();
		}
		if ($col_conv_typ_54.equalsIgnoreCase(name)) {
			return col_conv_typ_54();
		}
		if ($col_conv_typ_55.equalsIgnoreCase(name)) {
			return col_conv_typ_55();
		}
		if ($col_conv_typ_56.equalsIgnoreCase(name)) {
			return col_conv_typ_56();
		}
		if ($col_conv_typ_57.equalsIgnoreCase(name)) {
			return col_conv_typ_57();
		}
		if ($col_conv_typ_58.equalsIgnoreCase(name)) {
			return col_conv_typ_58();
		}
		if ($col_conv_typ_59.equalsIgnoreCase(name)) {
			return col_conv_typ_59();
		}
		if ($col_conv_typ_60.equalsIgnoreCase(name)) {
			return col_conv_typ_60();
		}
		if ($col_conv_typ_61.equalsIgnoreCase(name)) {
			return col_conv_typ_61();
		}
		if ($col_conv_typ_62.equalsIgnoreCase(name)) {
			return col_conv_typ_62();
		}
		if ($col_conv_typ_63.equalsIgnoreCase(name)) {
			return col_conv_typ_63();
		}
		if ($col_conv_typ_64.equalsIgnoreCase(name)) {
			return col_conv_typ_64();
		}
		if ($col_conv_typ_65.equalsIgnoreCase(name)) {
			return col_conv_typ_65();
		}
		if ($col_conv_typ_66.equalsIgnoreCase(name)) {
			return col_conv_typ_66();
		}
		if ($col_conv_typ_67.equalsIgnoreCase(name)) {
			return col_conv_typ_67();
		}
		if ($col_conv_typ_68.equalsIgnoreCase(name)) {
			return col_conv_typ_68();
		}
		if ($col_conv_typ_69.equalsIgnoreCase(name)) {
			return col_conv_typ_69();
		}
		if ($col_conv_typ_70.equalsIgnoreCase(name)) {
			return col_conv_typ_70();
		}
		if ($col_conv_typ_71.equalsIgnoreCase(name)) {
			return col_conv_typ_71();
		}
		if ($col_conv_typ_72.equalsIgnoreCase(name)) {
			return col_conv_typ_72();
		}
		if ($col_conv_typ_73.equalsIgnoreCase(name)) {
			return col_conv_typ_73();
		}
		if ($col_conv_typ_74.equalsIgnoreCase(name)) {
			return col_conv_typ_74();
		}
		if ($col_conv_typ_75.equalsIgnoreCase(name)) {
			return col_conv_typ_75();
		}
		if ($col_conv_typ_76.equalsIgnoreCase(name)) {
			return col_conv_typ_76();
		}
		if ($col_conv_typ_77.equalsIgnoreCase(name)) {
			return col_conv_typ_77();
		}
		if ($col_conv_typ_78.equalsIgnoreCase(name)) {
			return col_conv_typ_78();
		}
		if ($col_conv_typ_79.equalsIgnoreCase(name)) {
			return col_conv_typ_79();
		}
		if ($col_conv_typ_80.equalsIgnoreCase(name)) {
			return col_conv_typ_80();
		}
		if ($col_conv_typ_81.equalsIgnoreCase(name)) {
			return col_conv_typ_81();
		}
		if ($col_conv_typ_82.equalsIgnoreCase(name)) {
			return col_conv_typ_82();
		}
		if ($col_conv_typ_83.equalsIgnoreCase(name)) {
			return col_conv_typ_83();
		}
		if ($col_conv_typ_84.equalsIgnoreCase(name)) {
			return col_conv_typ_84();
		}
		if ($col_conv_typ_85.equalsIgnoreCase(name)) {
			return col_conv_typ_85();
		}
		if ($col_conv_typ_86.equalsIgnoreCase(name)) {
			return col_conv_typ_86();
		}
		if ($col_conv_typ_87.equalsIgnoreCase(name)) {
			return col_conv_typ_87();
		}
		if ($col_conv_typ_88.equalsIgnoreCase(name)) {
			return col_conv_typ_88();
		}
		if ($col_conv_typ_89.equalsIgnoreCase(name)) {
			return col_conv_typ_89();
		}
		if ($col_conv_typ_90.equalsIgnoreCase(name)) {
			return col_conv_typ_90();
		}
		if ($col_conv_typ_91.equalsIgnoreCase(name)) {
			return col_conv_typ_91();
		}
		if ($col_conv_typ_92.equalsIgnoreCase(name)) {
			return col_conv_typ_92();
		}
		if ($col_conv_typ_93.equalsIgnoreCase(name)) {
			return col_conv_typ_93();
		}
		if ($col_conv_typ_94.equalsIgnoreCase(name)) {
			return col_conv_typ_94();
		}
		if ($col_conv_typ_95.equalsIgnoreCase(name)) {
			return col_conv_typ_95();
		}
		if ($col_conv_typ_96.equalsIgnoreCase(name)) {
			return col_conv_typ_96();
		}
		if ($col_conv_typ_97.equalsIgnoreCase(name)) {
			return col_conv_typ_97();
		}
		if ($col_conv_typ_98.equalsIgnoreCase(name)) {
			return col_conv_typ_98();
		}
		if ($col_conv_typ_99.equalsIgnoreCase(name)) {
			return col_conv_typ_99();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($col_conv_typ_00.equalsIgnoreCase(name)) {
			col_conv_typ_00(value);
			return;
		}
		if ($col_conv_typ_01.equalsIgnoreCase(name)) {
			col_conv_typ_01(value);
			return;
		}
		if ($col_conv_typ_02.equalsIgnoreCase(name)) {
			col_conv_typ_02(value);
			return;
		}
		if ($col_conv_typ_03.equalsIgnoreCase(name)) {
			col_conv_typ_03(value);
			return;
		}
		if ($col_conv_typ_04.equalsIgnoreCase(name)) {
			col_conv_typ_04(value);
			return;
		}
		if ($col_conv_typ_05.equalsIgnoreCase(name)) {
			col_conv_typ_05(value);
			return;
		}
		if ($col_conv_typ_06.equalsIgnoreCase(name)) {
			col_conv_typ_06(value);
			return;
		}
		if ($col_conv_typ_07.equalsIgnoreCase(name)) {
			col_conv_typ_07(value);
			return;
		}
		if ($col_conv_typ_08.equalsIgnoreCase(name)) {
			col_conv_typ_08(value);
			return;
		}
		if ($col_conv_typ_09.equalsIgnoreCase(name)) {
			col_conv_typ_09(value);
			return;
		}
		if ($col_conv_typ_10.equalsIgnoreCase(name)) {
			col_conv_typ_10(value);
			return;
		}
		if ($col_conv_typ_11.equalsIgnoreCase(name)) {
			col_conv_typ_11(value);
			return;
		}
		if ($col_conv_typ_12.equalsIgnoreCase(name)) {
			col_conv_typ_12(value);
			return;
		}
		if ($col_conv_typ_13.equalsIgnoreCase(name)) {
			col_conv_typ_13(value);
			return;
		}
		if ($col_conv_typ_14.equalsIgnoreCase(name)) {
			col_conv_typ_14(value);
			return;
		}
		if ($col_conv_typ_15.equalsIgnoreCase(name)) {
			col_conv_typ_15(value);
			return;
		}
		if ($col_conv_typ_16.equalsIgnoreCase(name)) {
			col_conv_typ_16(value);
			return;
		}
		if ($col_conv_typ_17.equalsIgnoreCase(name)) {
			col_conv_typ_17(value);
			return;
		}
		if ($col_conv_typ_18.equalsIgnoreCase(name)) {
			col_conv_typ_18(value);
			return;
		}
		if ($col_conv_typ_19.equalsIgnoreCase(name)) {
			col_conv_typ_19(value);
			return;
		}
		if ($col_conv_typ_20.equalsIgnoreCase(name)) {
			col_conv_typ_20(value);
			return;
		}
		if ($col_conv_typ_21.equalsIgnoreCase(name)) {
			col_conv_typ_21(value);
			return;
		}
		if ($col_conv_typ_22.equalsIgnoreCase(name)) {
			col_conv_typ_22(value);
			return;
		}
		if ($col_conv_typ_23.equalsIgnoreCase(name)) {
			col_conv_typ_23(value);
			return;
		}
		if ($col_conv_typ_24.equalsIgnoreCase(name)) {
			col_conv_typ_24(value);
			return;
		}
		if ($col_conv_typ_25.equalsIgnoreCase(name)) {
			col_conv_typ_25(value);
			return;
		}
		if ($col_conv_typ_26.equalsIgnoreCase(name)) {
			col_conv_typ_26(value);
			return;
		}
		if ($col_conv_typ_27.equalsIgnoreCase(name)) {
			col_conv_typ_27(value);
			return;
		}
		if ($col_conv_typ_28.equalsIgnoreCase(name)) {
			col_conv_typ_28(value);
			return;
		}
		if ($col_conv_typ_29.equalsIgnoreCase(name)) {
			col_conv_typ_29(value);
			return;
		}
		if ($col_conv_typ_30.equalsIgnoreCase(name)) {
			col_conv_typ_30(value);
			return;
		}
		if ($col_conv_typ_31.equalsIgnoreCase(name)) {
			col_conv_typ_31(value);
			return;
		}
		if ($col_conv_typ_32.equalsIgnoreCase(name)) {
			col_conv_typ_32(value);
			return;
		}
		if ($col_conv_typ_33.equalsIgnoreCase(name)) {
			col_conv_typ_33(value);
			return;
		}
		if ($col_conv_typ_34.equalsIgnoreCase(name)) {
			col_conv_typ_34(value);
			return;
		}
		if ($col_conv_typ_35.equalsIgnoreCase(name)) {
			col_conv_typ_35(value);
			return;
		}
		if ($col_conv_typ_36.equalsIgnoreCase(name)) {
			col_conv_typ_36(value);
			return;
		}
		if ($col_conv_typ_37.equalsIgnoreCase(name)) {
			col_conv_typ_37(value);
			return;
		}
		if ($col_conv_typ_38.equalsIgnoreCase(name)) {
			col_conv_typ_38(value);
			return;
		}
		if ($col_conv_typ_39.equalsIgnoreCase(name)) {
			col_conv_typ_39(value);
			return;
		}
		if ($col_conv_typ_40.equalsIgnoreCase(name)) {
			col_conv_typ_40(value);
			return;
		}
		if ($col_conv_typ_41.equalsIgnoreCase(name)) {
			col_conv_typ_41(value);
			return;
		}
		if ($col_conv_typ_42.equalsIgnoreCase(name)) {
			col_conv_typ_42(value);
			return;
		}
		if ($col_conv_typ_43.equalsIgnoreCase(name)) {
			col_conv_typ_43(value);
			return;
		}
		if ($col_conv_typ_44.equalsIgnoreCase(name)) {
			col_conv_typ_44(value);
			return;
		}
		if ($col_conv_typ_45.equalsIgnoreCase(name)) {
			col_conv_typ_45(value);
			return;
		}
		if ($col_conv_typ_46.equalsIgnoreCase(name)) {
			col_conv_typ_46(value);
			return;
		}
		if ($col_conv_typ_47.equalsIgnoreCase(name)) {
			col_conv_typ_47(value);
			return;
		}
		if ($col_conv_typ_48.equalsIgnoreCase(name)) {
			col_conv_typ_48(value);
			return;
		}
		if ($col_conv_typ_49.equalsIgnoreCase(name)) {
			col_conv_typ_49(value);
			return;
		}
		if ($col_conv_typ_50.equalsIgnoreCase(name)) {
			col_conv_typ_50(value);
			return;
		}
		if ($col_conv_typ_51.equalsIgnoreCase(name)) {
			col_conv_typ_51(value);
			return;
		}
		if ($col_conv_typ_52.equalsIgnoreCase(name)) {
			col_conv_typ_52(value);
			return;
		}
		if ($col_conv_typ_53.equalsIgnoreCase(name)) {
			col_conv_typ_53(value);
			return;
		}
		if ($col_conv_typ_54.equalsIgnoreCase(name)) {
			col_conv_typ_54(value);
			return;
		}
		if ($col_conv_typ_55.equalsIgnoreCase(name)) {
			col_conv_typ_55(value);
			return;
		}
		if ($col_conv_typ_56.equalsIgnoreCase(name)) {
			col_conv_typ_56(value);
			return;
		}
		if ($col_conv_typ_57.equalsIgnoreCase(name)) {
			col_conv_typ_57(value);
			return;
		}
		if ($col_conv_typ_58.equalsIgnoreCase(name)) {
			col_conv_typ_58(value);
			return;
		}
		if ($col_conv_typ_59.equalsIgnoreCase(name)) {
			col_conv_typ_59(value);
			return;
		}
		if ($col_conv_typ_60.equalsIgnoreCase(name)) {
			col_conv_typ_60(value);
			return;
		}
		if ($col_conv_typ_61.equalsIgnoreCase(name)) {
			col_conv_typ_61(value);
			return;
		}
		if ($col_conv_typ_62.equalsIgnoreCase(name)) {
			col_conv_typ_62(value);
			return;
		}
		if ($col_conv_typ_63.equalsIgnoreCase(name)) {
			col_conv_typ_63(value);
			return;
		}
		if ($col_conv_typ_64.equalsIgnoreCase(name)) {
			col_conv_typ_64(value);
			return;
		}
		if ($col_conv_typ_65.equalsIgnoreCase(name)) {
			col_conv_typ_65(value);
			return;
		}
		if ($col_conv_typ_66.equalsIgnoreCase(name)) {
			col_conv_typ_66(value);
			return;
		}
		if ($col_conv_typ_67.equalsIgnoreCase(name)) {
			col_conv_typ_67(value);
			return;
		}
		if ($col_conv_typ_68.equalsIgnoreCase(name)) {
			col_conv_typ_68(value);
			return;
		}
		if ($col_conv_typ_69.equalsIgnoreCase(name)) {
			col_conv_typ_69(value);
			return;
		}
		if ($col_conv_typ_70.equalsIgnoreCase(name)) {
			col_conv_typ_70(value);
			return;
		}
		if ($col_conv_typ_71.equalsIgnoreCase(name)) {
			col_conv_typ_71(value);
			return;
		}
		if ($col_conv_typ_72.equalsIgnoreCase(name)) {
			col_conv_typ_72(value);
			return;
		}
		if ($col_conv_typ_73.equalsIgnoreCase(name)) {
			col_conv_typ_73(value);
			return;
		}
		if ($col_conv_typ_74.equalsIgnoreCase(name)) {
			col_conv_typ_74(value);
			return;
		}
		if ($col_conv_typ_75.equalsIgnoreCase(name)) {
			col_conv_typ_75(value);
			return;
		}
		if ($col_conv_typ_76.equalsIgnoreCase(name)) {
			col_conv_typ_76(value);
			return;
		}
		if ($col_conv_typ_77.equalsIgnoreCase(name)) {
			col_conv_typ_77(value);
			return;
		}
		if ($col_conv_typ_78.equalsIgnoreCase(name)) {
			col_conv_typ_78(value);
			return;
		}
		if ($col_conv_typ_79.equalsIgnoreCase(name)) {
			col_conv_typ_79(value);
			return;
		}
		if ($col_conv_typ_80.equalsIgnoreCase(name)) {
			col_conv_typ_80(value);
			return;
		}
		if ($col_conv_typ_81.equalsIgnoreCase(name)) {
			col_conv_typ_81(value);
			return;
		}
		if ($col_conv_typ_82.equalsIgnoreCase(name)) {
			col_conv_typ_82(value);
			return;
		}
		if ($col_conv_typ_83.equalsIgnoreCase(name)) {
			col_conv_typ_83(value);
			return;
		}
		if ($col_conv_typ_84.equalsIgnoreCase(name)) {
			col_conv_typ_84(value);
			return;
		}
		if ($col_conv_typ_85.equalsIgnoreCase(name)) {
			col_conv_typ_85(value);
			return;
		}
		if ($col_conv_typ_86.equalsIgnoreCase(name)) {
			col_conv_typ_86(value);
			return;
		}
		if ($col_conv_typ_87.equalsIgnoreCase(name)) {
			col_conv_typ_87(value);
			return;
		}
		if ($col_conv_typ_88.equalsIgnoreCase(name)) {
			col_conv_typ_88(value);
			return;
		}
		if ($col_conv_typ_89.equalsIgnoreCase(name)) {
			col_conv_typ_89(value);
			return;
		}
		if ($col_conv_typ_90.equalsIgnoreCase(name)) {
			col_conv_typ_90(value);
			return;
		}
		if ($col_conv_typ_91.equalsIgnoreCase(name)) {
			col_conv_typ_91(value);
			return;
		}
		if ($col_conv_typ_92.equalsIgnoreCase(name)) {
			col_conv_typ_92(value);
			return;
		}
		if ($col_conv_typ_93.equalsIgnoreCase(name)) {
			col_conv_typ_93(value);
			return;
		}
		if ($col_conv_typ_94.equalsIgnoreCase(name)) {
			col_conv_typ_94(value);
			return;
		}
		if ($col_conv_typ_95.equalsIgnoreCase(name)) {
			col_conv_typ_95(value);
			return;
		}
		if ($col_conv_typ_96.equalsIgnoreCase(name)) {
			col_conv_typ_96(value);
			return;
		}
		if ($col_conv_typ_97.equalsIgnoreCase(name)) {
			col_conv_typ_97(value);
			return;
		}
		if ($col_conv_typ_98.equalsIgnoreCase(name)) {
			col_conv_typ_98(value);
			return;
		}
		if ($col_conv_typ_99.equalsIgnoreCase(name)) {
			col_conv_typ_99(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($col_conv_typ_00.equalsIgnoreCase(name)) {
			col_conv_typ_00(value);
			return;
		}
		if ($col_conv_typ_01.equalsIgnoreCase(name)) {
			col_conv_typ_01(value);
			return;
		}
		if ($col_conv_typ_02.equalsIgnoreCase(name)) {
			col_conv_typ_02(value);
			return;
		}
		if ($col_conv_typ_03.equalsIgnoreCase(name)) {
			col_conv_typ_03(value);
			return;
		}
		if ($col_conv_typ_04.equalsIgnoreCase(name)) {
			col_conv_typ_04(value);
			return;
		}
		if ($col_conv_typ_05.equalsIgnoreCase(name)) {
			col_conv_typ_05(value);
			return;
		}
		if ($col_conv_typ_06.equalsIgnoreCase(name)) {
			col_conv_typ_06(value);
			return;
		}
		if ($col_conv_typ_07.equalsIgnoreCase(name)) {
			col_conv_typ_07(value);
			return;
		}
		if ($col_conv_typ_08.equalsIgnoreCase(name)) {
			col_conv_typ_08(value);
			return;
		}
		if ($col_conv_typ_09.equalsIgnoreCase(name)) {
			col_conv_typ_09(value);
			return;
		}
		if ($col_conv_typ_10.equalsIgnoreCase(name)) {
			col_conv_typ_10(value);
			return;
		}
		if ($col_conv_typ_11.equalsIgnoreCase(name)) {
			col_conv_typ_11(value);
			return;
		}
		if ($col_conv_typ_12.equalsIgnoreCase(name)) {
			col_conv_typ_12(value);
			return;
		}
		if ($col_conv_typ_13.equalsIgnoreCase(name)) {
			col_conv_typ_13(value);
			return;
		}
		if ($col_conv_typ_14.equalsIgnoreCase(name)) {
			col_conv_typ_14(value);
			return;
		}
		if ($col_conv_typ_15.equalsIgnoreCase(name)) {
			col_conv_typ_15(value);
			return;
		}
		if ($col_conv_typ_16.equalsIgnoreCase(name)) {
			col_conv_typ_16(value);
			return;
		}
		if ($col_conv_typ_17.equalsIgnoreCase(name)) {
			col_conv_typ_17(value);
			return;
		}
		if ($col_conv_typ_18.equalsIgnoreCase(name)) {
			col_conv_typ_18(value);
			return;
		}
		if ($col_conv_typ_19.equalsIgnoreCase(name)) {
			col_conv_typ_19(value);
			return;
		}
		if ($col_conv_typ_20.equalsIgnoreCase(name)) {
			col_conv_typ_20(value);
			return;
		}
		if ($col_conv_typ_21.equalsIgnoreCase(name)) {
			col_conv_typ_21(value);
			return;
		}
		if ($col_conv_typ_22.equalsIgnoreCase(name)) {
			col_conv_typ_22(value);
			return;
		}
		if ($col_conv_typ_23.equalsIgnoreCase(name)) {
			col_conv_typ_23(value);
			return;
		}
		if ($col_conv_typ_24.equalsIgnoreCase(name)) {
			col_conv_typ_24(value);
			return;
		}
		if ($col_conv_typ_25.equalsIgnoreCase(name)) {
			col_conv_typ_25(value);
			return;
		}
		if ($col_conv_typ_26.equalsIgnoreCase(name)) {
			col_conv_typ_26(value);
			return;
		}
		if ($col_conv_typ_27.equalsIgnoreCase(name)) {
			col_conv_typ_27(value);
			return;
		}
		if ($col_conv_typ_28.equalsIgnoreCase(name)) {
			col_conv_typ_28(value);
			return;
		}
		if ($col_conv_typ_29.equalsIgnoreCase(name)) {
			col_conv_typ_29(value);
			return;
		}
		if ($col_conv_typ_30.equalsIgnoreCase(name)) {
			col_conv_typ_30(value);
			return;
		}
		if ($col_conv_typ_31.equalsIgnoreCase(name)) {
			col_conv_typ_31(value);
			return;
		}
		if ($col_conv_typ_32.equalsIgnoreCase(name)) {
			col_conv_typ_32(value);
			return;
		}
		if ($col_conv_typ_33.equalsIgnoreCase(name)) {
			col_conv_typ_33(value);
			return;
		}
		if ($col_conv_typ_34.equalsIgnoreCase(name)) {
			col_conv_typ_34(value);
			return;
		}
		if ($col_conv_typ_35.equalsIgnoreCase(name)) {
			col_conv_typ_35(value);
			return;
		}
		if ($col_conv_typ_36.equalsIgnoreCase(name)) {
			col_conv_typ_36(value);
			return;
		}
		if ($col_conv_typ_37.equalsIgnoreCase(name)) {
			col_conv_typ_37(value);
			return;
		}
		if ($col_conv_typ_38.equalsIgnoreCase(name)) {
			col_conv_typ_38(value);
			return;
		}
		if ($col_conv_typ_39.equalsIgnoreCase(name)) {
			col_conv_typ_39(value);
			return;
		}
		if ($col_conv_typ_40.equalsIgnoreCase(name)) {
			col_conv_typ_40(value);
			return;
		}
		if ($col_conv_typ_41.equalsIgnoreCase(name)) {
			col_conv_typ_41(value);
			return;
		}
		if ($col_conv_typ_42.equalsIgnoreCase(name)) {
			col_conv_typ_42(value);
			return;
		}
		if ($col_conv_typ_43.equalsIgnoreCase(name)) {
			col_conv_typ_43(value);
			return;
		}
		if ($col_conv_typ_44.equalsIgnoreCase(name)) {
			col_conv_typ_44(value);
			return;
		}
		if ($col_conv_typ_45.equalsIgnoreCase(name)) {
			col_conv_typ_45(value);
			return;
		}
		if ($col_conv_typ_46.equalsIgnoreCase(name)) {
			col_conv_typ_46(value);
			return;
		}
		if ($col_conv_typ_47.equalsIgnoreCase(name)) {
			col_conv_typ_47(value);
			return;
		}
		if ($col_conv_typ_48.equalsIgnoreCase(name)) {
			col_conv_typ_48(value);
			return;
		}
		if ($col_conv_typ_49.equalsIgnoreCase(name)) {
			col_conv_typ_49(value);
			return;
		}
		if ($col_conv_typ_50.equalsIgnoreCase(name)) {
			col_conv_typ_50(value);
			return;
		}
		if ($col_conv_typ_51.equalsIgnoreCase(name)) {
			col_conv_typ_51(value);
			return;
		}
		if ($col_conv_typ_52.equalsIgnoreCase(name)) {
			col_conv_typ_52(value);
			return;
		}
		if ($col_conv_typ_53.equalsIgnoreCase(name)) {
			col_conv_typ_53(value);
			return;
		}
		if ($col_conv_typ_54.equalsIgnoreCase(name)) {
			col_conv_typ_54(value);
			return;
		}
		if ($col_conv_typ_55.equalsIgnoreCase(name)) {
			col_conv_typ_55(value);
			return;
		}
		if ($col_conv_typ_56.equalsIgnoreCase(name)) {
			col_conv_typ_56(value);
			return;
		}
		if ($col_conv_typ_57.equalsIgnoreCase(name)) {
			col_conv_typ_57(value);
			return;
		}
		if ($col_conv_typ_58.equalsIgnoreCase(name)) {
			col_conv_typ_58(value);
			return;
		}
		if ($col_conv_typ_59.equalsIgnoreCase(name)) {
			col_conv_typ_59(value);
			return;
		}
		if ($col_conv_typ_60.equalsIgnoreCase(name)) {
			col_conv_typ_60(value);
			return;
		}
		if ($col_conv_typ_61.equalsIgnoreCase(name)) {
			col_conv_typ_61(value);
			return;
		}
		if ($col_conv_typ_62.equalsIgnoreCase(name)) {
			col_conv_typ_62(value);
			return;
		}
		if ($col_conv_typ_63.equalsIgnoreCase(name)) {
			col_conv_typ_63(value);
			return;
		}
		if ($col_conv_typ_64.equalsIgnoreCase(name)) {
			col_conv_typ_64(value);
			return;
		}
		if ($col_conv_typ_65.equalsIgnoreCase(name)) {
			col_conv_typ_65(value);
			return;
		}
		if ($col_conv_typ_66.equalsIgnoreCase(name)) {
			col_conv_typ_66(value);
			return;
		}
		if ($col_conv_typ_67.equalsIgnoreCase(name)) {
			col_conv_typ_67(value);
			return;
		}
		if ($col_conv_typ_68.equalsIgnoreCase(name)) {
			col_conv_typ_68(value);
			return;
		}
		if ($col_conv_typ_69.equalsIgnoreCase(name)) {
			col_conv_typ_69(value);
			return;
		}
		if ($col_conv_typ_70.equalsIgnoreCase(name)) {
			col_conv_typ_70(value);
			return;
		}
		if ($col_conv_typ_71.equalsIgnoreCase(name)) {
			col_conv_typ_71(value);
			return;
		}
		if ($col_conv_typ_72.equalsIgnoreCase(name)) {
			col_conv_typ_72(value);
			return;
		}
		if ($col_conv_typ_73.equalsIgnoreCase(name)) {
			col_conv_typ_73(value);
			return;
		}
		if ($col_conv_typ_74.equalsIgnoreCase(name)) {
			col_conv_typ_74(value);
			return;
		}
		if ($col_conv_typ_75.equalsIgnoreCase(name)) {
			col_conv_typ_75(value);
			return;
		}
		if ($col_conv_typ_76.equalsIgnoreCase(name)) {
			col_conv_typ_76(value);
			return;
		}
		if ($col_conv_typ_77.equalsIgnoreCase(name)) {
			col_conv_typ_77(value);
			return;
		}
		if ($col_conv_typ_78.equalsIgnoreCase(name)) {
			col_conv_typ_78(value);
			return;
		}
		if ($col_conv_typ_79.equalsIgnoreCase(name)) {
			col_conv_typ_79(value);
			return;
		}
		if ($col_conv_typ_80.equalsIgnoreCase(name)) {
			col_conv_typ_80(value);
			return;
		}
		if ($col_conv_typ_81.equalsIgnoreCase(name)) {
			col_conv_typ_81(value);
			return;
		}
		if ($col_conv_typ_82.equalsIgnoreCase(name)) {
			col_conv_typ_82(value);
			return;
		}
		if ($col_conv_typ_83.equalsIgnoreCase(name)) {
			col_conv_typ_83(value);
			return;
		}
		if ($col_conv_typ_84.equalsIgnoreCase(name)) {
			col_conv_typ_84(value);
			return;
		}
		if ($col_conv_typ_85.equalsIgnoreCase(name)) {
			col_conv_typ_85(value);
			return;
		}
		if ($col_conv_typ_86.equalsIgnoreCase(name)) {
			col_conv_typ_86(value);
			return;
		}
		if ($col_conv_typ_87.equalsIgnoreCase(name)) {
			col_conv_typ_87(value);
			return;
		}
		if ($col_conv_typ_88.equalsIgnoreCase(name)) {
			col_conv_typ_88(value);
			return;
		}
		if ($col_conv_typ_89.equalsIgnoreCase(name)) {
			col_conv_typ_89(value);
			return;
		}
		if ($col_conv_typ_90.equalsIgnoreCase(name)) {
			col_conv_typ_90(value);
			return;
		}
		if ($col_conv_typ_91.equalsIgnoreCase(name)) {
			col_conv_typ_91(value);
			return;
		}
		if ($col_conv_typ_92.equalsIgnoreCase(name)) {
			col_conv_typ_92(value);
			return;
		}
		if ($col_conv_typ_93.equalsIgnoreCase(name)) {
			col_conv_typ_93(value);
			return;
		}
		if ($col_conv_typ_94.equalsIgnoreCase(name)) {
			col_conv_typ_94(value);
			return;
		}
		if ($col_conv_typ_95.equalsIgnoreCase(name)) {
			col_conv_typ_95(value);
			return;
		}
		if ($col_conv_typ_96.equalsIgnoreCase(name)) {
			col_conv_typ_96(value);
			return;
		}
		if ($col_conv_typ_97.equalsIgnoreCase(name)) {
			col_conv_typ_97(value);
			return;
		}
		if ($col_conv_typ_98.equalsIgnoreCase(name)) {
			col_conv_typ_98(value);
			return;
		}
		if ($col_conv_typ_99.equalsIgnoreCase(name)) {
			col_conv_typ_99(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
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

