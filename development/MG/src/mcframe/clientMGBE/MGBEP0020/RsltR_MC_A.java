package mcframe.clientMGBE.MGBEP0020;

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
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	public static final String $itm_p = "itm_p";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
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
	 * Routing 工順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	/**
	 * Standard qty. 標準数量.<p>
	 *
	 */
	public static final String $std_qty = "std_qty";
	/**
	 * Ideal qty. 理論数量.<p>
	 *
	 */
	public static final String $the_qty = "the_qty";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Operation management unit qty. 工程管理単位数量.<p>
	 *
	 */
	public static final String $oper_qty = "oper_qty";
	/**
	 * Operation management unit cd. 工程管理単位ＣＤ.<p>
	 *
	 */
	public static final String $oper_unit_cd = "oper_unit_cd";
	/**
	 * Operation management unit name 工程管理単位名.<p>
	 *
	 */
	public static final String $oper_unit_nm = "oper_unit_nm";
	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public static final String $oper_std_qty = "oper_std_qty";
	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public static final String $oper_conv_qty = "oper_conv_qty";
	public static final String $column_id = "column_id";
	/**
	 * Total 合計.<p>
	 *
	 */
	public static final String $all_ttl = "all_ttl";
	/**
	 * Mfg. item input cost 製造品投入原価.<p>
	 *
	 */
	public static final String $std_mfg_cost = "std_mfg_cost";
	/**
	 * Ideal mfg. item input cost 理論製造品投入原価.<p>
	 *
	 */
	public static final String $the_mfg_cost = "the_mfg_cost";
	/**
	 * Total incurred 発生合計.<p>
	 *
	 */
	public static final String $ttl = "ttl";
	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public static final String $var_cost = "var_cost";
	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public static final String $fxd_cost = "fxd_cost";
	public static final String $col_000 = "col_000";
	public static final String $col_001 = "col_001";
	public static final String $col_002 = "col_002";
	public static final String $col_003 = "col_003";
	public static final String $col_004 = "col_004";
	public static final String $col_005 = "col_005";
	public static final String $col_006 = "col_006";
	public static final String $col_007 = "col_007";
	public static final String $col_008 = "col_008";
	public static final String $col_009 = "col_009";
	public static final String $col_010 = "col_010";
	public static final String $col_011 = "col_011";
	public static final String $col_012 = "col_012";
	public static final String $col_013 = "col_013";
	public static final String $col_014 = "col_014";
	public static final String $col_015 = "col_015";
	public static final String $col_016 = "col_016";
	public static final String $col_017 = "col_017";
	public static final String $col_018 = "col_018";
	public static final String $col_019 = "col_019";
	public static final String $col_020 = "col_020";
	public static final String $col_021 = "col_021";
	public static final String $col_022 = "col_022";
	public static final String $col_023 = "col_023";
	public static final String $col_024 = "col_024";
	public static final String $col_025 = "col_025";
	public static final String $col_026 = "col_026";
	public static final String $col_027 = "col_027";
	public static final String $col_028 = "col_028";
	public static final String $col_029 = "col_029";
	public static final String $col_030 = "col_030";
	public static final String $col_031 = "col_031";
	public static final String $col_032 = "col_032";
	public static final String $col_033 = "col_033";
	public static final String $col_034 = "col_034";
	public static final String $col_035 = "col_035";
	public static final String $col_036 = "col_036";
	public static final String $col_037 = "col_037";
	public static final String $col_038 = "col_038";
	public static final String $col_039 = "col_039";
	public static final String $col_040 = "col_040";
	public static final String $col_041 = "col_041";
	public static final String $col_042 = "col_042";
	public static final String $col_043 = "col_043";
	public static final String $col_044 = "col_044";
	public static final String $col_045 = "col_045";
	public static final String $col_046 = "col_046";
	public static final String $col_047 = "col_047";
	public static final String $col_048 = "col_048";
	public static final String $col_049 = "col_049";
	public static final String $col_050 = "col_050";
	public static final String $col_051 = "col_051";
	public static final String $col_052 = "col_052";
	public static final String $col_053 = "col_053";
	public static final String $col_054 = "col_054";
	public static final String $col_055 = "col_055";
	public static final String $col_056 = "col_056";
	public static final String $col_057 = "col_057";
	public static final String $col_058 = "col_058";
	public static final String $col_059 = "col_059";
	public static final String $col_060 = "col_060";
	public static final String $col_061 = "col_061";
	public static final String $col_062 = "col_062";
	public static final String $col_063 = "col_063";
	public static final String $col_064 = "col_064";
	public static final String $col_065 = "col_065";
	public static final String $col_066 = "col_066";
	public static final String $col_067 = "col_067";
	public static final String $col_068 = "col_068";
	public static final String $col_069 = "col_069";
	public static final String $col_070 = "col_070";
	public static final String $col_071 = "col_071";
	public static final String $col_072 = "col_072";
	public static final String $col_073 = "col_073";
	public static final String $col_074 = "col_074";
	public static final String $col_075 = "col_075";
	public static final String $col_076 = "col_076";
	public static final String $col_077 = "col_077";
	public static final String $col_078 = "col_078";
	public static final String $col_079 = "col_079";
	public static final String $col_080 = "col_080";
	public static final String $col_081 = "col_081";
	public static final String $col_082 = "col_082";
	public static final String $col_083 = "col_083";
	public static final String $col_084 = "col_084";
	public static final String $col_085 = "col_085";
	public static final String $col_086 = "col_086";
	public static final String $col_087 = "col_087";
	public static final String $col_088 = "col_088";
	public static final String $col_089 = "col_089";
	public static final String $col_090 = "col_090";
	public static final String $col_091 = "col_091";
	public static final String $col_092 = "col_092";
	public static final String $col_093 = "col_093";
	public static final String $col_094 = "col_094";
	public static final String $col_095 = "col_095";
	public static final String $col_096 = "col_096";
	public static final String $col_097 = "col_097";
	public static final String $col_098 = "col_098";
	public static final String $col_099 = "col_099";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";

	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta std_qty_META = createCommonMeta($std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta the_qty_META = createCommonMeta($the_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta oper_qty_META = createCommonMeta($oper_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_unit_cd_META = createCommonMeta($oper_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta oper_unit_nm_META = createCommonMeta($oper_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta oper_std_qty_META = createCommonMeta($oper_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_conv_qty_META = createCommonMeta($oper_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta column_id_META = createNumberMeta($column_id, 5, 0, false);
	public static final MCMeta all_ttl_META = createCommonMeta($all_ttl, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_mfg_cost_META = createCommonMeta($std_mfg_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta the_mfg_cost_META = createCommonMeta($the_mfg_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_META = createCommonMeta($ttl, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta var_cost_META = createCommonMeta($var_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta fxd_cost_META = createCommonMeta($fxd_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_000_META = createCommonMeta($col_000, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_001_META = createCommonMeta($col_001, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_002_META = createCommonMeta($col_002, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_003_META = createCommonMeta($col_003, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_004_META = createCommonMeta($col_004, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_005_META = createCommonMeta($col_005, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_006_META = createCommonMeta($col_006, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_007_META = createCommonMeta($col_007, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_008_META = createCommonMeta($col_008, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_009_META = createCommonMeta($col_009, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_010_META = createCommonMeta($col_010, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_011_META = createCommonMeta($col_011, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_012_META = createCommonMeta($col_012, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_013_META = createCommonMeta($col_013, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_014_META = createCommonMeta($col_014, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_015_META = createCommonMeta($col_015, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_016_META = createCommonMeta($col_016, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_017_META = createCommonMeta($col_017, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_018_META = createCommonMeta($col_018, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_019_META = createCommonMeta($col_019, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_020_META = createCommonMeta($col_020, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_021_META = createCommonMeta($col_021, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_022_META = createCommonMeta($col_022, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_023_META = createCommonMeta($col_023, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_024_META = createCommonMeta($col_024, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_025_META = createCommonMeta($col_025, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_026_META = createCommonMeta($col_026, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_027_META = createCommonMeta($col_027, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_028_META = createCommonMeta($col_028, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_029_META = createCommonMeta($col_029, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_030_META = createCommonMeta($col_030, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_031_META = createCommonMeta($col_031, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_032_META = createCommonMeta($col_032, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_033_META = createCommonMeta($col_033, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_034_META = createCommonMeta($col_034, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_035_META = createCommonMeta($col_035, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_036_META = createCommonMeta($col_036, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_037_META = createCommonMeta($col_037, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_038_META = createCommonMeta($col_038, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_039_META = createCommonMeta($col_039, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_040_META = createCommonMeta($col_040, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_041_META = createCommonMeta($col_041, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_042_META = createCommonMeta($col_042, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_043_META = createCommonMeta($col_043, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_044_META = createCommonMeta($col_044, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_045_META = createCommonMeta($col_045, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_046_META = createCommonMeta($col_046, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_047_META = createCommonMeta($col_047, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_048_META = createCommonMeta($col_048, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_049_META = createCommonMeta($col_049, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_050_META = createCommonMeta($col_050, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_051_META = createCommonMeta($col_051, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_052_META = createCommonMeta($col_052, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_053_META = createCommonMeta($col_053, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_054_META = createCommonMeta($col_054, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_055_META = createCommonMeta($col_055, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_056_META = createCommonMeta($col_056, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_057_META = createCommonMeta($col_057, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_058_META = createCommonMeta($col_058, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_059_META = createCommonMeta($col_059, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_060_META = createCommonMeta($col_060, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_061_META = createCommonMeta($col_061, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_062_META = createCommonMeta($col_062, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_063_META = createCommonMeta($col_063, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_064_META = createCommonMeta($col_064, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_065_META = createCommonMeta($col_065, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_066_META = createCommonMeta($col_066, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_067_META = createCommonMeta($col_067, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_068_META = createCommonMeta($col_068, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_069_META = createCommonMeta($col_069, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_070_META = createCommonMeta($col_070, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_071_META = createCommonMeta($col_071, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_072_META = createCommonMeta($col_072, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_073_META = createCommonMeta($col_073, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_074_META = createCommonMeta($col_074, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_075_META = createCommonMeta($col_075, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_076_META = createCommonMeta($col_076, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_077_META = createCommonMeta($col_077, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_078_META = createCommonMeta($col_078, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_079_META = createCommonMeta($col_079, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_080_META = createCommonMeta($col_080, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_081_META = createCommonMeta($col_081, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_082_META = createCommonMeta($col_082, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_083_META = createCommonMeta($col_083, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_084_META = createCommonMeta($col_084, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_085_META = createCommonMeta($col_085, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_086_META = createCommonMeta($col_086, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_087_META = createCommonMeta($col_087, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_088_META = createCommonMeta($col_088, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_089_META = createCommonMeta($col_089, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_090_META = createCommonMeta($col_090, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_091_META = createCommonMeta($col_091, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_092_META = createCommonMeta($col_092, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_093_META = createCommonMeta($col_093, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_094_META = createCommonMeta($col_094, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_095_META = createCommonMeta($col_095, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_096_META = createCommonMeta($col_096, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_097_META = createCommonMeta($col_097, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_098_META = createCommonMeta($col_098, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_099_META = createCommonMeta($col_099, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			wg_cd_META,
			wg_nm_META,
			itm_p_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			loc_cd_META,
			loc_nm_META,
			disp_seq_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			std_qty_META,
			the_qty_META,
			unit_cd_META,
			unit_nm_META,
			oper_qty_META,
			oper_unit_cd_META,
			oper_unit_nm_META,
			oper_std_qty_META,
			oper_conv_qty_META,
			column_id_META,
			all_ttl_META,
			std_mfg_cost_META,
			the_mfg_cost_META,
			ttl_META,
			var_cost_META,
			fxd_cost_META,
			col_000_META,
			col_001_META,
			col_002_META,
			col_003_META,
			col_004_META,
			col_005_META,
			col_006_META,
			col_007_META,
			col_008_META,
			col_009_META,
			col_010_META,
			col_011_META,
			col_012_META,
			col_013_META,
			col_014_META,
			col_015_META,
			col_016_META,
			col_017_META,
			col_018_META,
			col_019_META,
			col_020_META,
			col_021_META,
			col_022_META,
			col_023_META,
			col_024_META,
			col_025_META,
			col_026_META,
			col_027_META,
			col_028_META,
			col_029_META,
			col_030_META,
			col_031_META,
			col_032_META,
			col_033_META,
			col_034_META,
			col_035_META,
			col_036_META,
			col_037_META,
			col_038_META,
			col_039_META,
			col_040_META,
			col_041_META,
			col_042_META,
			col_043_META,
			col_044_META,
			col_045_META,
			col_046_META,
			col_047_META,
			col_048_META,
			col_049_META,
			col_050_META,
			col_051_META,
			col_052_META,
			col_053_META,
			col_054_META,
			col_055_META,
			col_056_META,
			col_057_META,
			col_058_META,
			col_059_META,
			col_060_META,
			col_061_META,
			col_062_META,
			col_063_META,
			col_064_META,
			col_065_META,
			col_066_META,
			col_067_META,
			col_068_META,
			col_069_META,
			col_070_META,
			col_071_META,
			col_072_META,
			col_073_META,
			col_074_META,
			col_075_META,
			col_076_META,
			col_077_META,
			col_078_META,
			col_079_META,
			col_080_META,
			col_081_META,
			col_082_META,
			col_083_META,
			col_084_META,
			col_085_META,
			col_086_META,
			col_087_META,
			col_088_META,
			col_089_META,
			col_090_META,
			col_091_META,
			col_092_META,
			col_093_META,
			col_094_META,
			col_095_META,
			col_096_META,
			col_097_META,
			col_098_META,
			col_099_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm
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
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";
	/** 項目属性情報のグループ[CLEAR]のキー定数 */
	public static final String $$CLEAR = "CLEAR";
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
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
				{$col_000, "ELM"},	// col_000
				{$col_001, "ELM"},	// col_001
				{$col_002, "ELM"},	// col_002
				{$col_003, "ELM"},	// col_003
				{$col_004, "ELM"},	// col_004
				{$col_005, "ELM"},	// col_005
				{$col_006, "ELM"},	// col_006
				{$col_007, "ELM"},	// col_007
				{$col_008, "ELM"},	// col_008
				{$col_009, "ELM"},	// col_009
				{$col_010, "ELM"},	// col_010
				{$col_011, "ELM"},	// col_011
				{$col_012, "ELM"},	// col_012
				{$col_013, "ELM"},	// col_013
				{$col_014, "ELM"},	// col_014
				{$col_015, "ELM"},	// col_015
				{$col_016, "ELM"},	// col_016
				{$col_017, "ELM"},	// col_017
				{$col_018, "ELM"},	// col_018
				{$col_019, "ELM"},	// col_019
				{$col_020, "ELM"},	// col_020
				{$col_021, "ELM"},	// col_021
				{$col_022, "ELM"},	// col_022
				{$col_023, "ELM"},	// col_023
				{$col_024, "ELM"},	// col_024
				{$col_025, "ELM"},	// col_025
				{$col_026, "ELM"},	// col_026
				{$col_027, "ELM"},	// col_027
				{$col_028, "ELM"},	// col_028
				{$col_029, "ELM"},	// col_029
				{$col_030, "ELM"},	// col_030
				{$col_031, "ELM"},	// col_031
				{$col_032, "ELM"},	// col_032
				{$col_033, "ELM"},	// col_033
				{$col_034, "ELM"},	// col_034
				{$col_035, "ELM"},	// col_035
				{$col_036, "ELM"},	// col_036
				{$col_037, "ELM"},	// col_037
				{$col_038, "ELM"},	// col_038
				{$col_039, "ELM"},	// col_039
				{$col_040, "ELM"},	// col_040
				{$col_041, "ELM"},	// col_041
				{$col_042, "ELM"},	// col_042
				{$col_043, "ELM"},	// col_043
				{$col_044, "ELM"},	// col_044
				{$col_045, "ELM"},	// col_045
				{$col_046, "ELM"},	// col_046
				{$col_047, "ELM"},	// col_047
				{$col_048, "ELM"},	// col_048
				{$col_049, "ELM"},	// col_049
				{$col_050, "ELM"},	// col_050
				{$col_051, "ELM"},	// col_051
				{$col_052, "ELM"},	// col_052
				{$col_053, "ELM"},	// col_053
				{$col_054, "ELM"},	// col_054
				{$col_055, "ELM"},	// col_055
				{$col_056, "ELM"},	// col_056
				{$col_057, "ELM"},	// col_057
				{$col_058, "ELM"},	// col_058
				{$col_059, "ELM"},	// col_059
				{$col_060, "ELM"},	// col_060
				{$col_061, "ELM"},	// col_061
				{$col_062, "ELM"},	// col_062
				{$col_063, "ELM"},	// col_063
				{$col_064, "ELM"},	// col_064
				{$col_065, "ELM"},	// col_065
				{$col_066, "ELM"},	// col_066
				{$col_067, "ELM"},	// col_067
				{$col_068, "ELM"},	// col_068
				{$col_069, "ELM"},	// col_069
				{$col_070, "ELM"},	// col_070
				{$col_071, "ELM"},	// col_071
				{$col_072, "ELM"},	// col_072
				{$col_073, "ELM"},	// col_073
				{$col_074, "ELM"},	// col_074
				{$col_075, "ELM"},	// col_075
				{$col_076, "ELM"},	// col_076
				{$col_077, "ELM"},	// col_077
				{$col_078, "ELM"},	// col_078
				{$col_079, "ELM"},	// col_079
				{$col_080, "ELM"},	// col_080
				{$col_081, "ELM"},	// col_081
				{$col_082, "ELM"},	// col_082
				{$col_083, "ELM"},	// col_083
				{$col_084, "ELM"},	// col_084
				{$col_085, "ELM"},	// col_085
				{$col_086, "ELM"},	// col_086
				{$col_087, "ELM"},	// col_087
				{$col_088, "ELM"},	// col_088
				{$col_089, "ELM"},	// col_089
				{$col_090, "ELM"},	// col_090
				{$col_091, "ELM"},	// col_091
				{$col_092, "ELM"},	// col_092
				{$col_093, "ELM"},	// col_093
				{$col_094, "ELM"},	// col_094
				{$col_095, "ELM"},	// col_095
				{$col_096, "ELM"},	// col_096
				{$col_097, "ELM"},	// col_097
				{$col_098, "ELM"},	// col_098
				{$col_099, "ELM"}	// col_099
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
				{$all_ttl, "STD"},	// all_ttl
				{$std_mfg_cost, "STD"},	// std_mfg_cost
				{$the_mfg_cost, "STD"},	// the_mfg_cost
				{$ttl, "STD"},	// ttl
				{$var_cost, "STD"},	// var_cost
				{$fxd_cost, "STD"},	// fxd_cost
				{$col_000, "STD"},	// col_000
				{$col_001, "STD"},	// col_001
				{$col_002, "STD"},	// col_002
				{$col_003, "STD"},	// col_003
				{$col_004, "STD"},	// col_004
				{$col_005, "STD"},	// col_005
				{$col_006, "STD"},	// col_006
				{$col_007, "STD"},	// col_007
				{$col_008, "STD"},	// col_008
				{$col_009, "STD"},	// col_009
				{$col_010, "STD"},	// col_010
				{$col_011, "STD"},	// col_011
				{$col_012, "STD"},	// col_012
				{$col_013, "STD"},	// col_013
				{$col_014, "STD"},	// col_014
				{$col_015, "STD"},	// col_015
				{$col_016, "STD"},	// col_016
				{$col_017, "STD"},	// col_017
				{$col_018, "STD"},	// col_018
				{$col_019, "STD"},	// col_019
				{$col_020, "STD"},	// col_020
				{$col_021, "STD"},	// col_021
				{$col_022, "STD"},	// col_022
				{$col_023, "STD"},	// col_023
				{$col_024, "STD"},	// col_024
				{$col_025, "STD"},	// col_025
				{$col_026, "STD"},	// col_026
				{$col_027, "STD"},	// col_027
				{$col_028, "STD"},	// col_028
				{$col_029, "STD"},	// col_029
				{$col_030, "STD"},	// col_030
				{$col_031, "STD"},	// col_031
				{$col_032, "STD"},	// col_032
				{$col_033, "STD"},	// col_033
				{$col_034, "STD"},	// col_034
				{$col_035, "STD"},	// col_035
				{$col_036, "STD"},	// col_036
				{$col_037, "STD"},	// col_037
				{$col_038, "STD"},	// col_038
				{$col_039, "STD"},	// col_039
				{$col_040, "STD"},	// col_040
				{$col_041, "STD"},	// col_041
				{$col_042, "STD"},	// col_042
				{$col_043, "STD"},	// col_043
				{$col_044, "STD"},	// col_044
				{$col_045, "STD"},	// col_045
				{$col_046, "STD"},	// col_046
				{$col_047, "STD"},	// col_047
				{$col_048, "STD"},	// col_048
				{$col_049, "STD"},	// col_049
				{$col_050, "STD"},	// col_050
				{$col_051, "STD"},	// col_051
				{$col_052, "STD"},	// col_052
				{$col_053, "STD"},	// col_053
				{$col_054, "STD"},	// col_054
				{$col_055, "STD"},	// col_055
				{$col_056, "STD"},	// col_056
				{$col_057, "STD"},	// col_057
				{$col_058, "STD"},	// col_058
				{$col_059, "STD"},	// col_059
				{$col_060, "STD"},	// col_060
				{$col_061, "STD"},	// col_061
				{$col_062, "STD"},	// col_062
				{$col_063, "STD"},	// col_063
				{$col_064, "STD"},	// col_064
				{$col_065, "STD"},	// col_065
				{$col_066, "STD"},	// col_066
				{$col_067, "STD"},	// col_067
				{$col_068, "STD"},	// col_068
				{$col_069, "STD"},	// col_069
				{$col_070, "STD"},	// col_070
				{$col_071, "STD"},	// col_071
				{$col_072, "STD"},	// col_072
				{$col_073, "STD"},	// col_073
				{$col_074, "STD"},	// col_074
				{$col_075, "STD"},	// col_075
				{$col_076, "STD"},	// col_076
				{$col_077, "STD"},	// col_077
				{$col_078, "STD"},	// col_078
				{$col_079, "STD"},	// col_079
				{$col_080, "STD"},	// col_080
				{$col_081, "STD"},	// col_081
				{$col_082, "STD"},	// col_082
				{$col_083, "STD"},	// col_083
				{$col_084, "STD"},	// col_084
				{$col_085, "STD"},	// col_085
				{$col_086, "STD"},	// col_086
				{$col_087, "STD"},	// col_087
				{$col_088, "STD"},	// col_088
				{$col_089, "STD"},	// col_089
				{$col_090, "STD"},	// col_090
				{$col_091, "STD"},	// col_091
				{$col_092, "STD"},	// col_092
				{$col_093, "STD"},	// col_093
				{$col_094, "STD"},	// col_094
				{$col_095, "STD"},	// col_095
				{$col_096, "STD"},	// col_096
				{$col_097, "STD"},	// col_097
				{$col_098, "STD"},	// col_098
				{$col_099, "STD"}	// col_099
			}
		)),
		new MCExtMap.Entry($$CLEAR, new MCExtList(
			new String[][]{
				{$wg_cd, "Key"},	// wg_cd
				{$wg_nm, "Key"},	// wg_nm
				{$itm_p, "Key"},	// itm_p
				{$itm_typ, "Key"},	// itm_typ
				{$itm_typ_nm, "Key"},	// itm_typ_nm
				{$itm_typ_d_cd, "Key"},	// itm_typ_d_cd
				{$itm_typ_d_nm, "Key"},	// itm_typ_d_nm
				{$itm_jnl_cd, "Key"},	// itm_jnl_cd
				{$itm_jnl_nm, "Key"},	// itm_jnl_nm
				{$loc_cd, "Key"},	// loc_cd
				{$loc_nm, "Key"}	// loc_nm
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 0, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 0, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 1, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 1, $wg_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 2, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 2, $itm_p, row);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 3, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 3, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 4, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 4, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 5, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 5, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 6, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 6, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 7, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 7, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 8, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 8, $itm_jnl_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 9, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 9, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 10, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 10, $loc_nm, value);
	}


	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 11, $disp_seq);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 11, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 11, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 11, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 11, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 11, $disp_seq, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 12, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 12, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 13, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 13, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 14, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 14, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 14, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 14, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 14, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 14, $oper_seq, value);
	}


	/**
	 * Standard qty. 標準数量.<p>
	 *
	 */
	public MCNumber std_qty() {
		return getConstNumber(offset + 15, $std_qty);
	}

	/**
	 * Standard qty. 標準数量.<p>
	 *
	 */
	public void std_qty(MCNumber value) {
		setConstNumber(offset + 15, $std_qty, value);
	}

	/**
	 * Standard qty. 標準数量.<p>
	 *
	 */
	public void std_qty(int value) {
		setConstNumber(offset + 15, $std_qty, value);
	}

	/**
	 * Standard qty. 標準数量.<p>
	 *
	 */
	public void std_qty(long value) {
		setConstNumber(offset + 15, $std_qty, value);
	}

	/**
	 * Standard qty. 標準数量.<p>
	 *
	 */
	public void std_qty(float value) {
		setConstNumber(offset + 15, $std_qty, value);
	}

	/**
	 * Standard qty. 標準数量.<p>
	 *
	 */
	public void std_qty(double value) {
		setConstNumber(offset + 15, $std_qty, value);
	}


	/**
	 * Ideal qty. 理論数量.<p>
	 *
	 */
	public MCNumber the_qty() {
		return getConstNumber(offset + 16, $the_qty);
	}

	/**
	 * Ideal qty. 理論数量.<p>
	 *
	 */
	public void the_qty(MCNumber value) {
		setConstNumber(offset + 16, $the_qty, value);
	}

	/**
	 * Ideal qty. 理論数量.<p>
	 *
	 */
	public void the_qty(int value) {
		setConstNumber(offset + 16, $the_qty, value);
	}

	/**
	 * Ideal qty. 理論数量.<p>
	 *
	 */
	public void the_qty(long value) {
		setConstNumber(offset + 16, $the_qty, value);
	}

	/**
	 * Ideal qty. 理論数量.<p>
	 *
	 */
	public void the_qty(float value) {
		setConstNumber(offset + 16, $the_qty, value);
	}

	/**
	 * Ideal qty. 理論数量.<p>
	 *
	 */
	public void the_qty(double value) {
		setConstNumber(offset + 16, $the_qty, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 17, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 17, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 18, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 18, $unit_nm, value);
	}


	/**
	 * Operation management unit qty. 工程管理単位数量.<p>
	 *
	 */
	public MCNumber oper_qty() {
		return getConstNumber(offset + 19, $oper_qty);
	}

	/**
	 * Operation management unit qty. 工程管理単位数量.<p>
	 *
	 */
	public void oper_qty(MCNumber value) {
		setConstNumber(offset + 19, $oper_qty, value);
	}

	/**
	 * Operation management unit qty. 工程管理単位数量.<p>
	 *
	 */
	public void oper_qty(int value) {
		setConstNumber(offset + 19, $oper_qty, value);
	}

	/**
	 * Operation management unit qty. 工程管理単位数量.<p>
	 *
	 */
	public void oper_qty(long value) {
		setConstNumber(offset + 19, $oper_qty, value);
	}

	/**
	 * Operation management unit qty. 工程管理単位数量.<p>
	 *
	 */
	public void oper_qty(float value) {
		setConstNumber(offset + 19, $oper_qty, value);
	}

	/**
	 * Operation management unit qty. 工程管理単位数量.<p>
	 *
	 */
	public void oper_qty(double value) {
		setConstNumber(offset + 19, $oper_qty, value);
	}


	/**
	 * Operation management unit cd. 工程管理単位ＣＤ.<p>
	 *
	 */
	public String oper_unit_cd() {
		return getConstString(offset + 20, $oper_unit_cd);
	}

	/**
	 * Operation management unit cd. 工程管理単位ＣＤ.<p>
	 *
	 */
	public void oper_unit_cd(String value) {
		setConstString(offset + 20, $oper_unit_cd, value);
	}


	/**
	 * Operation management unit name 工程管理単位名.<p>
	 *
	 */
	public String oper_unit_nm() {
		return getConstString(offset + 21, $oper_unit_nm);
	}

	/**
	 * Operation management unit name 工程管理単位名.<p>
	 *
	 */
	public void oper_unit_nm(String value) {
		setConstString(offset + 21, $oper_unit_nm, value);
	}


	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public MCNumber oper_std_qty() {
		return getConstNumber(offset + 22, $oper_std_qty);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(MCNumber value) {
		setConstNumber(offset + 22, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(int value) {
		setConstNumber(offset + 22, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(long value) {
		setConstNumber(offset + 22, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(float value) {
		setConstNumber(offset + 22, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(double value) {
		setConstNumber(offset + 22, $oper_std_qty, value);
	}


	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public MCNumber oper_conv_qty() {
		return getConstNumber(offset + 23, $oper_conv_qty);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(MCNumber value) {
		setConstNumber(offset + 23, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(int value) {
		setConstNumber(offset + 23, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(long value) {
		setConstNumber(offset + 23, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(float value) {
		setConstNumber(offset + 23, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(double value) {
		setConstNumber(offset + 23, $oper_conv_qty, value);
	}


	public MCNumber column_id() {
		return getConstNumber(offset + 24, $column_id);
	}

	public void column_id(MCNumber value) {
		setConstNumber(offset + 24, $column_id, value);
	}

	public void column_id(int value) {
		setConstNumber(offset + 24, $column_id, value);
	}

	public void column_id(long value) {
		setConstNumber(offset + 24, $column_id, value);
	}

	public void column_id(float value) {
		setConstNumber(offset + 24, $column_id, value);
	}

	public void column_id(double value) {
		setConstNumber(offset + 24, $column_id, value);
	}


	/**
	 * Total 合計.<p>
	 *
	 */
	public MCNumber all_ttl() {
		return getConstNumber(offset + 25, $all_ttl);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void all_ttl(MCNumber value) {
		setConstNumber(offset + 25, $all_ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void all_ttl(int value) {
		setConstNumber(offset + 25, $all_ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void all_ttl(long value) {
		setConstNumber(offset + 25, $all_ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void all_ttl(float value) {
		setConstNumber(offset + 25, $all_ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void all_ttl(double value) {
		setConstNumber(offset + 25, $all_ttl, value);
	}


	/**
	 * Mfg. item input cost 製造品投入原価.<p>
	 *
	 */
	public MCNumber std_mfg_cost() {
		return getConstNumber(offset + 26, $std_mfg_cost);
	}

	/**
	 * Mfg. item input cost 製造品投入原価.<p>
	 *
	 */
	public void std_mfg_cost(MCNumber value) {
		setConstNumber(offset + 26, $std_mfg_cost, value);
	}

	/**
	 * Mfg. item input cost 製造品投入原価.<p>
	 *
	 */
	public void std_mfg_cost(int value) {
		setConstNumber(offset + 26, $std_mfg_cost, value);
	}

	/**
	 * Mfg. item input cost 製造品投入原価.<p>
	 *
	 */
	public void std_mfg_cost(long value) {
		setConstNumber(offset + 26, $std_mfg_cost, value);
	}

	/**
	 * Mfg. item input cost 製造品投入原価.<p>
	 *
	 */
	public void std_mfg_cost(float value) {
		setConstNumber(offset + 26, $std_mfg_cost, value);
	}

	/**
	 * Mfg. item input cost 製造品投入原価.<p>
	 *
	 */
	public void std_mfg_cost(double value) {
		setConstNumber(offset + 26, $std_mfg_cost, value);
	}


	/**
	 * Ideal mfg. item input cost 理論製造品投入原価.<p>
	 *
	 */
	public MCNumber the_mfg_cost() {
		return getConstNumber(offset + 27, $the_mfg_cost);
	}

	/**
	 * Ideal mfg. item input cost 理論製造品投入原価.<p>
	 *
	 */
	public void the_mfg_cost(MCNumber value) {
		setConstNumber(offset + 27, $the_mfg_cost, value);
	}

	/**
	 * Ideal mfg. item input cost 理論製造品投入原価.<p>
	 *
	 */
	public void the_mfg_cost(int value) {
		setConstNumber(offset + 27, $the_mfg_cost, value);
	}

	/**
	 * Ideal mfg. item input cost 理論製造品投入原価.<p>
	 *
	 */
	public void the_mfg_cost(long value) {
		setConstNumber(offset + 27, $the_mfg_cost, value);
	}

	/**
	 * Ideal mfg. item input cost 理論製造品投入原価.<p>
	 *
	 */
	public void the_mfg_cost(float value) {
		setConstNumber(offset + 27, $the_mfg_cost, value);
	}

	/**
	 * Ideal mfg. item input cost 理論製造品投入原価.<p>
	 *
	 */
	public void the_mfg_cost(double value) {
		setConstNumber(offset + 27, $the_mfg_cost, value);
	}


	/**
	 * Total incurred 発生合計.<p>
	 *
	 */
	public MCNumber ttl() {
		return getConstNumber(offset + 28, $ttl);
	}

	/**
	 * Total incurred 発生合計.<p>
	 *
	 */
	public void ttl(MCNumber value) {
		setConstNumber(offset + 28, $ttl, value);
	}

	/**
	 * Total incurred 発生合計.<p>
	 *
	 */
	public void ttl(int value) {
		setConstNumber(offset + 28, $ttl, value);
	}

	/**
	 * Total incurred 発生合計.<p>
	 *
	 */
	public void ttl(long value) {
		setConstNumber(offset + 28, $ttl, value);
	}

	/**
	 * Total incurred 発生合計.<p>
	 *
	 */
	public void ttl(float value) {
		setConstNumber(offset + 28, $ttl, value);
	}

	/**
	 * Total incurred 発生合計.<p>
	 *
	 */
	public void ttl(double value) {
		setConstNumber(offset + 28, $ttl, value);
	}


	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public MCNumber var_cost() {
		return getConstNumber(offset + 29, $var_cost);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(MCNumber value) {
		setConstNumber(offset + 29, $var_cost, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(int value) {
		setConstNumber(offset + 29, $var_cost, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(long value) {
		setConstNumber(offset + 29, $var_cost, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(float value) {
		setConstNumber(offset + 29, $var_cost, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(double value) {
		setConstNumber(offset + 29, $var_cost, value);
	}


	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public MCNumber fxd_cost() {
		return getConstNumber(offset + 30, $fxd_cost);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(MCNumber value) {
		setConstNumber(offset + 30, $fxd_cost, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(int value) {
		setConstNumber(offset + 30, $fxd_cost, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(long value) {
		setConstNumber(offset + 30, $fxd_cost, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(float value) {
		setConstNumber(offset + 30, $fxd_cost, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(double value) {
		setConstNumber(offset + 30, $fxd_cost, value);
	}


	public MCNumber col_000() {
		return getConstNumber(offset + 31, $col_000);
	}

	public void col_000(MCNumber value) {
		setConstNumber(offset + 31, $col_000, value);
	}

	public void col_000(int value) {
		setConstNumber(offset + 31, $col_000, value);
	}

	public void col_000(long value) {
		setConstNumber(offset + 31, $col_000, value);
	}

	public void col_000(float value) {
		setConstNumber(offset + 31, $col_000, value);
	}

	public void col_000(double value) {
		setConstNumber(offset + 31, $col_000, value);
	}


	public MCNumber col_001() {
		return getConstNumber(offset + 32, $col_001);
	}

	public void col_001(MCNumber value) {
		setConstNumber(offset + 32, $col_001, value);
	}

	public void col_001(int value) {
		setConstNumber(offset + 32, $col_001, value);
	}

	public void col_001(long value) {
		setConstNumber(offset + 32, $col_001, value);
	}

	public void col_001(float value) {
		setConstNumber(offset + 32, $col_001, value);
	}

	public void col_001(double value) {
		setConstNumber(offset + 32, $col_001, value);
	}


	public MCNumber col_002() {
		return getConstNumber(offset + 33, $col_002);
	}

	public void col_002(MCNumber value) {
		setConstNumber(offset + 33, $col_002, value);
	}

	public void col_002(int value) {
		setConstNumber(offset + 33, $col_002, value);
	}

	public void col_002(long value) {
		setConstNumber(offset + 33, $col_002, value);
	}

	public void col_002(float value) {
		setConstNumber(offset + 33, $col_002, value);
	}

	public void col_002(double value) {
		setConstNumber(offset + 33, $col_002, value);
	}


	public MCNumber col_003() {
		return getConstNumber(offset + 34, $col_003);
	}

	public void col_003(MCNumber value) {
		setConstNumber(offset + 34, $col_003, value);
	}

	public void col_003(int value) {
		setConstNumber(offset + 34, $col_003, value);
	}

	public void col_003(long value) {
		setConstNumber(offset + 34, $col_003, value);
	}

	public void col_003(float value) {
		setConstNumber(offset + 34, $col_003, value);
	}

	public void col_003(double value) {
		setConstNumber(offset + 34, $col_003, value);
	}


	public MCNumber col_004() {
		return getConstNumber(offset + 35, $col_004);
	}

	public void col_004(MCNumber value) {
		setConstNumber(offset + 35, $col_004, value);
	}

	public void col_004(int value) {
		setConstNumber(offset + 35, $col_004, value);
	}

	public void col_004(long value) {
		setConstNumber(offset + 35, $col_004, value);
	}

	public void col_004(float value) {
		setConstNumber(offset + 35, $col_004, value);
	}

	public void col_004(double value) {
		setConstNumber(offset + 35, $col_004, value);
	}


	public MCNumber col_005() {
		return getConstNumber(offset + 36, $col_005);
	}

	public void col_005(MCNumber value) {
		setConstNumber(offset + 36, $col_005, value);
	}

	public void col_005(int value) {
		setConstNumber(offset + 36, $col_005, value);
	}

	public void col_005(long value) {
		setConstNumber(offset + 36, $col_005, value);
	}

	public void col_005(float value) {
		setConstNumber(offset + 36, $col_005, value);
	}

	public void col_005(double value) {
		setConstNumber(offset + 36, $col_005, value);
	}


	public MCNumber col_006() {
		return getConstNumber(offset + 37, $col_006);
	}

	public void col_006(MCNumber value) {
		setConstNumber(offset + 37, $col_006, value);
	}

	public void col_006(int value) {
		setConstNumber(offset + 37, $col_006, value);
	}

	public void col_006(long value) {
		setConstNumber(offset + 37, $col_006, value);
	}

	public void col_006(float value) {
		setConstNumber(offset + 37, $col_006, value);
	}

	public void col_006(double value) {
		setConstNumber(offset + 37, $col_006, value);
	}


	public MCNumber col_007() {
		return getConstNumber(offset + 38, $col_007);
	}

	public void col_007(MCNumber value) {
		setConstNumber(offset + 38, $col_007, value);
	}

	public void col_007(int value) {
		setConstNumber(offset + 38, $col_007, value);
	}

	public void col_007(long value) {
		setConstNumber(offset + 38, $col_007, value);
	}

	public void col_007(float value) {
		setConstNumber(offset + 38, $col_007, value);
	}

	public void col_007(double value) {
		setConstNumber(offset + 38, $col_007, value);
	}


	public MCNumber col_008() {
		return getConstNumber(offset + 39, $col_008);
	}

	public void col_008(MCNumber value) {
		setConstNumber(offset + 39, $col_008, value);
	}

	public void col_008(int value) {
		setConstNumber(offset + 39, $col_008, value);
	}

	public void col_008(long value) {
		setConstNumber(offset + 39, $col_008, value);
	}

	public void col_008(float value) {
		setConstNumber(offset + 39, $col_008, value);
	}

	public void col_008(double value) {
		setConstNumber(offset + 39, $col_008, value);
	}


	public MCNumber col_009() {
		return getConstNumber(offset + 40, $col_009);
	}

	public void col_009(MCNumber value) {
		setConstNumber(offset + 40, $col_009, value);
	}

	public void col_009(int value) {
		setConstNumber(offset + 40, $col_009, value);
	}

	public void col_009(long value) {
		setConstNumber(offset + 40, $col_009, value);
	}

	public void col_009(float value) {
		setConstNumber(offset + 40, $col_009, value);
	}

	public void col_009(double value) {
		setConstNumber(offset + 40, $col_009, value);
	}


	public MCNumber col_010() {
		return getConstNumber(offset + 41, $col_010);
	}

	public void col_010(MCNumber value) {
		setConstNumber(offset + 41, $col_010, value);
	}

	public void col_010(int value) {
		setConstNumber(offset + 41, $col_010, value);
	}

	public void col_010(long value) {
		setConstNumber(offset + 41, $col_010, value);
	}

	public void col_010(float value) {
		setConstNumber(offset + 41, $col_010, value);
	}

	public void col_010(double value) {
		setConstNumber(offset + 41, $col_010, value);
	}


	public MCNumber col_011() {
		return getConstNumber(offset + 42, $col_011);
	}

	public void col_011(MCNumber value) {
		setConstNumber(offset + 42, $col_011, value);
	}

	public void col_011(int value) {
		setConstNumber(offset + 42, $col_011, value);
	}

	public void col_011(long value) {
		setConstNumber(offset + 42, $col_011, value);
	}

	public void col_011(float value) {
		setConstNumber(offset + 42, $col_011, value);
	}

	public void col_011(double value) {
		setConstNumber(offset + 42, $col_011, value);
	}


	public MCNumber col_012() {
		return getConstNumber(offset + 43, $col_012);
	}

	public void col_012(MCNumber value) {
		setConstNumber(offset + 43, $col_012, value);
	}

	public void col_012(int value) {
		setConstNumber(offset + 43, $col_012, value);
	}

	public void col_012(long value) {
		setConstNumber(offset + 43, $col_012, value);
	}

	public void col_012(float value) {
		setConstNumber(offset + 43, $col_012, value);
	}

	public void col_012(double value) {
		setConstNumber(offset + 43, $col_012, value);
	}


	public MCNumber col_013() {
		return getConstNumber(offset + 44, $col_013);
	}

	public void col_013(MCNumber value) {
		setConstNumber(offset + 44, $col_013, value);
	}

	public void col_013(int value) {
		setConstNumber(offset + 44, $col_013, value);
	}

	public void col_013(long value) {
		setConstNumber(offset + 44, $col_013, value);
	}

	public void col_013(float value) {
		setConstNumber(offset + 44, $col_013, value);
	}

	public void col_013(double value) {
		setConstNumber(offset + 44, $col_013, value);
	}


	public MCNumber col_014() {
		return getConstNumber(offset + 45, $col_014);
	}

	public void col_014(MCNumber value) {
		setConstNumber(offset + 45, $col_014, value);
	}

	public void col_014(int value) {
		setConstNumber(offset + 45, $col_014, value);
	}

	public void col_014(long value) {
		setConstNumber(offset + 45, $col_014, value);
	}

	public void col_014(float value) {
		setConstNumber(offset + 45, $col_014, value);
	}

	public void col_014(double value) {
		setConstNumber(offset + 45, $col_014, value);
	}


	public MCNumber col_015() {
		return getConstNumber(offset + 46, $col_015);
	}

	public void col_015(MCNumber value) {
		setConstNumber(offset + 46, $col_015, value);
	}

	public void col_015(int value) {
		setConstNumber(offset + 46, $col_015, value);
	}

	public void col_015(long value) {
		setConstNumber(offset + 46, $col_015, value);
	}

	public void col_015(float value) {
		setConstNumber(offset + 46, $col_015, value);
	}

	public void col_015(double value) {
		setConstNumber(offset + 46, $col_015, value);
	}


	public MCNumber col_016() {
		return getConstNumber(offset + 47, $col_016);
	}

	public void col_016(MCNumber value) {
		setConstNumber(offset + 47, $col_016, value);
	}

	public void col_016(int value) {
		setConstNumber(offset + 47, $col_016, value);
	}

	public void col_016(long value) {
		setConstNumber(offset + 47, $col_016, value);
	}

	public void col_016(float value) {
		setConstNumber(offset + 47, $col_016, value);
	}

	public void col_016(double value) {
		setConstNumber(offset + 47, $col_016, value);
	}


	public MCNumber col_017() {
		return getConstNumber(offset + 48, $col_017);
	}

	public void col_017(MCNumber value) {
		setConstNumber(offset + 48, $col_017, value);
	}

	public void col_017(int value) {
		setConstNumber(offset + 48, $col_017, value);
	}

	public void col_017(long value) {
		setConstNumber(offset + 48, $col_017, value);
	}

	public void col_017(float value) {
		setConstNumber(offset + 48, $col_017, value);
	}

	public void col_017(double value) {
		setConstNumber(offset + 48, $col_017, value);
	}


	public MCNumber col_018() {
		return getConstNumber(offset + 49, $col_018);
	}

	public void col_018(MCNumber value) {
		setConstNumber(offset + 49, $col_018, value);
	}

	public void col_018(int value) {
		setConstNumber(offset + 49, $col_018, value);
	}

	public void col_018(long value) {
		setConstNumber(offset + 49, $col_018, value);
	}

	public void col_018(float value) {
		setConstNumber(offset + 49, $col_018, value);
	}

	public void col_018(double value) {
		setConstNumber(offset + 49, $col_018, value);
	}


	public MCNumber col_019() {
		return getConstNumber(offset + 50, $col_019);
	}

	public void col_019(MCNumber value) {
		setConstNumber(offset + 50, $col_019, value);
	}

	public void col_019(int value) {
		setConstNumber(offset + 50, $col_019, value);
	}

	public void col_019(long value) {
		setConstNumber(offset + 50, $col_019, value);
	}

	public void col_019(float value) {
		setConstNumber(offset + 50, $col_019, value);
	}

	public void col_019(double value) {
		setConstNumber(offset + 50, $col_019, value);
	}


	public MCNumber col_020() {
		return getConstNumber(offset + 51, $col_020);
	}

	public void col_020(MCNumber value) {
		setConstNumber(offset + 51, $col_020, value);
	}

	public void col_020(int value) {
		setConstNumber(offset + 51, $col_020, value);
	}

	public void col_020(long value) {
		setConstNumber(offset + 51, $col_020, value);
	}

	public void col_020(float value) {
		setConstNumber(offset + 51, $col_020, value);
	}

	public void col_020(double value) {
		setConstNumber(offset + 51, $col_020, value);
	}


	public MCNumber col_021() {
		return getConstNumber(offset + 52, $col_021);
	}

	public void col_021(MCNumber value) {
		setConstNumber(offset + 52, $col_021, value);
	}

	public void col_021(int value) {
		setConstNumber(offset + 52, $col_021, value);
	}

	public void col_021(long value) {
		setConstNumber(offset + 52, $col_021, value);
	}

	public void col_021(float value) {
		setConstNumber(offset + 52, $col_021, value);
	}

	public void col_021(double value) {
		setConstNumber(offset + 52, $col_021, value);
	}


	public MCNumber col_022() {
		return getConstNumber(offset + 53, $col_022);
	}

	public void col_022(MCNumber value) {
		setConstNumber(offset + 53, $col_022, value);
	}

	public void col_022(int value) {
		setConstNumber(offset + 53, $col_022, value);
	}

	public void col_022(long value) {
		setConstNumber(offset + 53, $col_022, value);
	}

	public void col_022(float value) {
		setConstNumber(offset + 53, $col_022, value);
	}

	public void col_022(double value) {
		setConstNumber(offset + 53, $col_022, value);
	}


	public MCNumber col_023() {
		return getConstNumber(offset + 54, $col_023);
	}

	public void col_023(MCNumber value) {
		setConstNumber(offset + 54, $col_023, value);
	}

	public void col_023(int value) {
		setConstNumber(offset + 54, $col_023, value);
	}

	public void col_023(long value) {
		setConstNumber(offset + 54, $col_023, value);
	}

	public void col_023(float value) {
		setConstNumber(offset + 54, $col_023, value);
	}

	public void col_023(double value) {
		setConstNumber(offset + 54, $col_023, value);
	}


	public MCNumber col_024() {
		return getConstNumber(offset + 55, $col_024);
	}

	public void col_024(MCNumber value) {
		setConstNumber(offset + 55, $col_024, value);
	}

	public void col_024(int value) {
		setConstNumber(offset + 55, $col_024, value);
	}

	public void col_024(long value) {
		setConstNumber(offset + 55, $col_024, value);
	}

	public void col_024(float value) {
		setConstNumber(offset + 55, $col_024, value);
	}

	public void col_024(double value) {
		setConstNumber(offset + 55, $col_024, value);
	}


	public MCNumber col_025() {
		return getConstNumber(offset + 56, $col_025);
	}

	public void col_025(MCNumber value) {
		setConstNumber(offset + 56, $col_025, value);
	}

	public void col_025(int value) {
		setConstNumber(offset + 56, $col_025, value);
	}

	public void col_025(long value) {
		setConstNumber(offset + 56, $col_025, value);
	}

	public void col_025(float value) {
		setConstNumber(offset + 56, $col_025, value);
	}

	public void col_025(double value) {
		setConstNumber(offset + 56, $col_025, value);
	}


	public MCNumber col_026() {
		return getConstNumber(offset + 57, $col_026);
	}

	public void col_026(MCNumber value) {
		setConstNumber(offset + 57, $col_026, value);
	}

	public void col_026(int value) {
		setConstNumber(offset + 57, $col_026, value);
	}

	public void col_026(long value) {
		setConstNumber(offset + 57, $col_026, value);
	}

	public void col_026(float value) {
		setConstNumber(offset + 57, $col_026, value);
	}

	public void col_026(double value) {
		setConstNumber(offset + 57, $col_026, value);
	}


	public MCNumber col_027() {
		return getConstNumber(offset + 58, $col_027);
	}

	public void col_027(MCNumber value) {
		setConstNumber(offset + 58, $col_027, value);
	}

	public void col_027(int value) {
		setConstNumber(offset + 58, $col_027, value);
	}

	public void col_027(long value) {
		setConstNumber(offset + 58, $col_027, value);
	}

	public void col_027(float value) {
		setConstNumber(offset + 58, $col_027, value);
	}

	public void col_027(double value) {
		setConstNumber(offset + 58, $col_027, value);
	}


	public MCNumber col_028() {
		return getConstNumber(offset + 59, $col_028);
	}

	public void col_028(MCNumber value) {
		setConstNumber(offset + 59, $col_028, value);
	}

	public void col_028(int value) {
		setConstNumber(offset + 59, $col_028, value);
	}

	public void col_028(long value) {
		setConstNumber(offset + 59, $col_028, value);
	}

	public void col_028(float value) {
		setConstNumber(offset + 59, $col_028, value);
	}

	public void col_028(double value) {
		setConstNumber(offset + 59, $col_028, value);
	}


	public MCNumber col_029() {
		return getConstNumber(offset + 60, $col_029);
	}

	public void col_029(MCNumber value) {
		setConstNumber(offset + 60, $col_029, value);
	}

	public void col_029(int value) {
		setConstNumber(offset + 60, $col_029, value);
	}

	public void col_029(long value) {
		setConstNumber(offset + 60, $col_029, value);
	}

	public void col_029(float value) {
		setConstNumber(offset + 60, $col_029, value);
	}

	public void col_029(double value) {
		setConstNumber(offset + 60, $col_029, value);
	}


	public MCNumber col_030() {
		return getConstNumber(offset + 61, $col_030);
	}

	public void col_030(MCNumber value) {
		setConstNumber(offset + 61, $col_030, value);
	}

	public void col_030(int value) {
		setConstNumber(offset + 61, $col_030, value);
	}

	public void col_030(long value) {
		setConstNumber(offset + 61, $col_030, value);
	}

	public void col_030(float value) {
		setConstNumber(offset + 61, $col_030, value);
	}

	public void col_030(double value) {
		setConstNumber(offset + 61, $col_030, value);
	}


	public MCNumber col_031() {
		return getConstNumber(offset + 62, $col_031);
	}

	public void col_031(MCNumber value) {
		setConstNumber(offset + 62, $col_031, value);
	}

	public void col_031(int value) {
		setConstNumber(offset + 62, $col_031, value);
	}

	public void col_031(long value) {
		setConstNumber(offset + 62, $col_031, value);
	}

	public void col_031(float value) {
		setConstNumber(offset + 62, $col_031, value);
	}

	public void col_031(double value) {
		setConstNumber(offset + 62, $col_031, value);
	}


	public MCNumber col_032() {
		return getConstNumber(offset + 63, $col_032);
	}

	public void col_032(MCNumber value) {
		setConstNumber(offset + 63, $col_032, value);
	}

	public void col_032(int value) {
		setConstNumber(offset + 63, $col_032, value);
	}

	public void col_032(long value) {
		setConstNumber(offset + 63, $col_032, value);
	}

	public void col_032(float value) {
		setConstNumber(offset + 63, $col_032, value);
	}

	public void col_032(double value) {
		setConstNumber(offset + 63, $col_032, value);
	}


	public MCNumber col_033() {
		return getConstNumber(offset + 64, $col_033);
	}

	public void col_033(MCNumber value) {
		setConstNumber(offset + 64, $col_033, value);
	}

	public void col_033(int value) {
		setConstNumber(offset + 64, $col_033, value);
	}

	public void col_033(long value) {
		setConstNumber(offset + 64, $col_033, value);
	}

	public void col_033(float value) {
		setConstNumber(offset + 64, $col_033, value);
	}

	public void col_033(double value) {
		setConstNumber(offset + 64, $col_033, value);
	}


	public MCNumber col_034() {
		return getConstNumber(offset + 65, $col_034);
	}

	public void col_034(MCNumber value) {
		setConstNumber(offset + 65, $col_034, value);
	}

	public void col_034(int value) {
		setConstNumber(offset + 65, $col_034, value);
	}

	public void col_034(long value) {
		setConstNumber(offset + 65, $col_034, value);
	}

	public void col_034(float value) {
		setConstNumber(offset + 65, $col_034, value);
	}

	public void col_034(double value) {
		setConstNumber(offset + 65, $col_034, value);
	}


	public MCNumber col_035() {
		return getConstNumber(offset + 66, $col_035);
	}

	public void col_035(MCNumber value) {
		setConstNumber(offset + 66, $col_035, value);
	}

	public void col_035(int value) {
		setConstNumber(offset + 66, $col_035, value);
	}

	public void col_035(long value) {
		setConstNumber(offset + 66, $col_035, value);
	}

	public void col_035(float value) {
		setConstNumber(offset + 66, $col_035, value);
	}

	public void col_035(double value) {
		setConstNumber(offset + 66, $col_035, value);
	}


	public MCNumber col_036() {
		return getConstNumber(offset + 67, $col_036);
	}

	public void col_036(MCNumber value) {
		setConstNumber(offset + 67, $col_036, value);
	}

	public void col_036(int value) {
		setConstNumber(offset + 67, $col_036, value);
	}

	public void col_036(long value) {
		setConstNumber(offset + 67, $col_036, value);
	}

	public void col_036(float value) {
		setConstNumber(offset + 67, $col_036, value);
	}

	public void col_036(double value) {
		setConstNumber(offset + 67, $col_036, value);
	}


	public MCNumber col_037() {
		return getConstNumber(offset + 68, $col_037);
	}

	public void col_037(MCNumber value) {
		setConstNumber(offset + 68, $col_037, value);
	}

	public void col_037(int value) {
		setConstNumber(offset + 68, $col_037, value);
	}

	public void col_037(long value) {
		setConstNumber(offset + 68, $col_037, value);
	}

	public void col_037(float value) {
		setConstNumber(offset + 68, $col_037, value);
	}

	public void col_037(double value) {
		setConstNumber(offset + 68, $col_037, value);
	}


	public MCNumber col_038() {
		return getConstNumber(offset + 69, $col_038);
	}

	public void col_038(MCNumber value) {
		setConstNumber(offset + 69, $col_038, value);
	}

	public void col_038(int value) {
		setConstNumber(offset + 69, $col_038, value);
	}

	public void col_038(long value) {
		setConstNumber(offset + 69, $col_038, value);
	}

	public void col_038(float value) {
		setConstNumber(offset + 69, $col_038, value);
	}

	public void col_038(double value) {
		setConstNumber(offset + 69, $col_038, value);
	}


	public MCNumber col_039() {
		return getConstNumber(offset + 70, $col_039);
	}

	public void col_039(MCNumber value) {
		setConstNumber(offset + 70, $col_039, value);
	}

	public void col_039(int value) {
		setConstNumber(offset + 70, $col_039, value);
	}

	public void col_039(long value) {
		setConstNumber(offset + 70, $col_039, value);
	}

	public void col_039(float value) {
		setConstNumber(offset + 70, $col_039, value);
	}

	public void col_039(double value) {
		setConstNumber(offset + 70, $col_039, value);
	}


	public MCNumber col_040() {
		return getConstNumber(offset + 71, $col_040);
	}

	public void col_040(MCNumber value) {
		setConstNumber(offset + 71, $col_040, value);
	}

	public void col_040(int value) {
		setConstNumber(offset + 71, $col_040, value);
	}

	public void col_040(long value) {
		setConstNumber(offset + 71, $col_040, value);
	}

	public void col_040(float value) {
		setConstNumber(offset + 71, $col_040, value);
	}

	public void col_040(double value) {
		setConstNumber(offset + 71, $col_040, value);
	}


	public MCNumber col_041() {
		return getConstNumber(offset + 72, $col_041);
	}

	public void col_041(MCNumber value) {
		setConstNumber(offset + 72, $col_041, value);
	}

	public void col_041(int value) {
		setConstNumber(offset + 72, $col_041, value);
	}

	public void col_041(long value) {
		setConstNumber(offset + 72, $col_041, value);
	}

	public void col_041(float value) {
		setConstNumber(offset + 72, $col_041, value);
	}

	public void col_041(double value) {
		setConstNumber(offset + 72, $col_041, value);
	}


	public MCNumber col_042() {
		return getConstNumber(offset + 73, $col_042);
	}

	public void col_042(MCNumber value) {
		setConstNumber(offset + 73, $col_042, value);
	}

	public void col_042(int value) {
		setConstNumber(offset + 73, $col_042, value);
	}

	public void col_042(long value) {
		setConstNumber(offset + 73, $col_042, value);
	}

	public void col_042(float value) {
		setConstNumber(offset + 73, $col_042, value);
	}

	public void col_042(double value) {
		setConstNumber(offset + 73, $col_042, value);
	}


	public MCNumber col_043() {
		return getConstNumber(offset + 74, $col_043);
	}

	public void col_043(MCNumber value) {
		setConstNumber(offset + 74, $col_043, value);
	}

	public void col_043(int value) {
		setConstNumber(offset + 74, $col_043, value);
	}

	public void col_043(long value) {
		setConstNumber(offset + 74, $col_043, value);
	}

	public void col_043(float value) {
		setConstNumber(offset + 74, $col_043, value);
	}

	public void col_043(double value) {
		setConstNumber(offset + 74, $col_043, value);
	}


	public MCNumber col_044() {
		return getConstNumber(offset + 75, $col_044);
	}

	public void col_044(MCNumber value) {
		setConstNumber(offset + 75, $col_044, value);
	}

	public void col_044(int value) {
		setConstNumber(offset + 75, $col_044, value);
	}

	public void col_044(long value) {
		setConstNumber(offset + 75, $col_044, value);
	}

	public void col_044(float value) {
		setConstNumber(offset + 75, $col_044, value);
	}

	public void col_044(double value) {
		setConstNumber(offset + 75, $col_044, value);
	}


	public MCNumber col_045() {
		return getConstNumber(offset + 76, $col_045);
	}

	public void col_045(MCNumber value) {
		setConstNumber(offset + 76, $col_045, value);
	}

	public void col_045(int value) {
		setConstNumber(offset + 76, $col_045, value);
	}

	public void col_045(long value) {
		setConstNumber(offset + 76, $col_045, value);
	}

	public void col_045(float value) {
		setConstNumber(offset + 76, $col_045, value);
	}

	public void col_045(double value) {
		setConstNumber(offset + 76, $col_045, value);
	}


	public MCNumber col_046() {
		return getConstNumber(offset + 77, $col_046);
	}

	public void col_046(MCNumber value) {
		setConstNumber(offset + 77, $col_046, value);
	}

	public void col_046(int value) {
		setConstNumber(offset + 77, $col_046, value);
	}

	public void col_046(long value) {
		setConstNumber(offset + 77, $col_046, value);
	}

	public void col_046(float value) {
		setConstNumber(offset + 77, $col_046, value);
	}

	public void col_046(double value) {
		setConstNumber(offset + 77, $col_046, value);
	}


	public MCNumber col_047() {
		return getConstNumber(offset + 78, $col_047);
	}

	public void col_047(MCNumber value) {
		setConstNumber(offset + 78, $col_047, value);
	}

	public void col_047(int value) {
		setConstNumber(offset + 78, $col_047, value);
	}

	public void col_047(long value) {
		setConstNumber(offset + 78, $col_047, value);
	}

	public void col_047(float value) {
		setConstNumber(offset + 78, $col_047, value);
	}

	public void col_047(double value) {
		setConstNumber(offset + 78, $col_047, value);
	}


	public MCNumber col_048() {
		return getConstNumber(offset + 79, $col_048);
	}

	public void col_048(MCNumber value) {
		setConstNumber(offset + 79, $col_048, value);
	}

	public void col_048(int value) {
		setConstNumber(offset + 79, $col_048, value);
	}

	public void col_048(long value) {
		setConstNumber(offset + 79, $col_048, value);
	}

	public void col_048(float value) {
		setConstNumber(offset + 79, $col_048, value);
	}

	public void col_048(double value) {
		setConstNumber(offset + 79, $col_048, value);
	}


	public MCNumber col_049() {
		return getConstNumber(offset + 80, $col_049);
	}

	public void col_049(MCNumber value) {
		setConstNumber(offset + 80, $col_049, value);
	}

	public void col_049(int value) {
		setConstNumber(offset + 80, $col_049, value);
	}

	public void col_049(long value) {
		setConstNumber(offset + 80, $col_049, value);
	}

	public void col_049(float value) {
		setConstNumber(offset + 80, $col_049, value);
	}

	public void col_049(double value) {
		setConstNumber(offset + 80, $col_049, value);
	}


	public MCNumber col_050() {
		return getConstNumber(offset + 81, $col_050);
	}

	public void col_050(MCNumber value) {
		setConstNumber(offset + 81, $col_050, value);
	}

	public void col_050(int value) {
		setConstNumber(offset + 81, $col_050, value);
	}

	public void col_050(long value) {
		setConstNumber(offset + 81, $col_050, value);
	}

	public void col_050(float value) {
		setConstNumber(offset + 81, $col_050, value);
	}

	public void col_050(double value) {
		setConstNumber(offset + 81, $col_050, value);
	}


	public MCNumber col_051() {
		return getConstNumber(offset + 82, $col_051);
	}

	public void col_051(MCNumber value) {
		setConstNumber(offset + 82, $col_051, value);
	}

	public void col_051(int value) {
		setConstNumber(offset + 82, $col_051, value);
	}

	public void col_051(long value) {
		setConstNumber(offset + 82, $col_051, value);
	}

	public void col_051(float value) {
		setConstNumber(offset + 82, $col_051, value);
	}

	public void col_051(double value) {
		setConstNumber(offset + 82, $col_051, value);
	}


	public MCNumber col_052() {
		return getConstNumber(offset + 83, $col_052);
	}

	public void col_052(MCNumber value) {
		setConstNumber(offset + 83, $col_052, value);
	}

	public void col_052(int value) {
		setConstNumber(offset + 83, $col_052, value);
	}

	public void col_052(long value) {
		setConstNumber(offset + 83, $col_052, value);
	}

	public void col_052(float value) {
		setConstNumber(offset + 83, $col_052, value);
	}

	public void col_052(double value) {
		setConstNumber(offset + 83, $col_052, value);
	}


	public MCNumber col_053() {
		return getConstNumber(offset + 84, $col_053);
	}

	public void col_053(MCNumber value) {
		setConstNumber(offset + 84, $col_053, value);
	}

	public void col_053(int value) {
		setConstNumber(offset + 84, $col_053, value);
	}

	public void col_053(long value) {
		setConstNumber(offset + 84, $col_053, value);
	}

	public void col_053(float value) {
		setConstNumber(offset + 84, $col_053, value);
	}

	public void col_053(double value) {
		setConstNumber(offset + 84, $col_053, value);
	}


	public MCNumber col_054() {
		return getConstNumber(offset + 85, $col_054);
	}

	public void col_054(MCNumber value) {
		setConstNumber(offset + 85, $col_054, value);
	}

	public void col_054(int value) {
		setConstNumber(offset + 85, $col_054, value);
	}

	public void col_054(long value) {
		setConstNumber(offset + 85, $col_054, value);
	}

	public void col_054(float value) {
		setConstNumber(offset + 85, $col_054, value);
	}

	public void col_054(double value) {
		setConstNumber(offset + 85, $col_054, value);
	}


	public MCNumber col_055() {
		return getConstNumber(offset + 86, $col_055);
	}

	public void col_055(MCNumber value) {
		setConstNumber(offset + 86, $col_055, value);
	}

	public void col_055(int value) {
		setConstNumber(offset + 86, $col_055, value);
	}

	public void col_055(long value) {
		setConstNumber(offset + 86, $col_055, value);
	}

	public void col_055(float value) {
		setConstNumber(offset + 86, $col_055, value);
	}

	public void col_055(double value) {
		setConstNumber(offset + 86, $col_055, value);
	}


	public MCNumber col_056() {
		return getConstNumber(offset + 87, $col_056);
	}

	public void col_056(MCNumber value) {
		setConstNumber(offset + 87, $col_056, value);
	}

	public void col_056(int value) {
		setConstNumber(offset + 87, $col_056, value);
	}

	public void col_056(long value) {
		setConstNumber(offset + 87, $col_056, value);
	}

	public void col_056(float value) {
		setConstNumber(offset + 87, $col_056, value);
	}

	public void col_056(double value) {
		setConstNumber(offset + 87, $col_056, value);
	}


	public MCNumber col_057() {
		return getConstNumber(offset + 88, $col_057);
	}

	public void col_057(MCNumber value) {
		setConstNumber(offset + 88, $col_057, value);
	}

	public void col_057(int value) {
		setConstNumber(offset + 88, $col_057, value);
	}

	public void col_057(long value) {
		setConstNumber(offset + 88, $col_057, value);
	}

	public void col_057(float value) {
		setConstNumber(offset + 88, $col_057, value);
	}

	public void col_057(double value) {
		setConstNumber(offset + 88, $col_057, value);
	}


	public MCNumber col_058() {
		return getConstNumber(offset + 89, $col_058);
	}

	public void col_058(MCNumber value) {
		setConstNumber(offset + 89, $col_058, value);
	}

	public void col_058(int value) {
		setConstNumber(offset + 89, $col_058, value);
	}

	public void col_058(long value) {
		setConstNumber(offset + 89, $col_058, value);
	}

	public void col_058(float value) {
		setConstNumber(offset + 89, $col_058, value);
	}

	public void col_058(double value) {
		setConstNumber(offset + 89, $col_058, value);
	}


	public MCNumber col_059() {
		return getConstNumber(offset + 90, $col_059);
	}

	public void col_059(MCNumber value) {
		setConstNumber(offset + 90, $col_059, value);
	}

	public void col_059(int value) {
		setConstNumber(offset + 90, $col_059, value);
	}

	public void col_059(long value) {
		setConstNumber(offset + 90, $col_059, value);
	}

	public void col_059(float value) {
		setConstNumber(offset + 90, $col_059, value);
	}

	public void col_059(double value) {
		setConstNumber(offset + 90, $col_059, value);
	}


	public MCNumber col_060() {
		return getConstNumber(offset + 91, $col_060);
	}

	public void col_060(MCNumber value) {
		setConstNumber(offset + 91, $col_060, value);
	}

	public void col_060(int value) {
		setConstNumber(offset + 91, $col_060, value);
	}

	public void col_060(long value) {
		setConstNumber(offset + 91, $col_060, value);
	}

	public void col_060(float value) {
		setConstNumber(offset + 91, $col_060, value);
	}

	public void col_060(double value) {
		setConstNumber(offset + 91, $col_060, value);
	}


	public MCNumber col_061() {
		return getConstNumber(offset + 92, $col_061);
	}

	public void col_061(MCNumber value) {
		setConstNumber(offset + 92, $col_061, value);
	}

	public void col_061(int value) {
		setConstNumber(offset + 92, $col_061, value);
	}

	public void col_061(long value) {
		setConstNumber(offset + 92, $col_061, value);
	}

	public void col_061(float value) {
		setConstNumber(offset + 92, $col_061, value);
	}

	public void col_061(double value) {
		setConstNumber(offset + 92, $col_061, value);
	}


	public MCNumber col_062() {
		return getConstNumber(offset + 93, $col_062);
	}

	public void col_062(MCNumber value) {
		setConstNumber(offset + 93, $col_062, value);
	}

	public void col_062(int value) {
		setConstNumber(offset + 93, $col_062, value);
	}

	public void col_062(long value) {
		setConstNumber(offset + 93, $col_062, value);
	}

	public void col_062(float value) {
		setConstNumber(offset + 93, $col_062, value);
	}

	public void col_062(double value) {
		setConstNumber(offset + 93, $col_062, value);
	}


	public MCNumber col_063() {
		return getConstNumber(offset + 94, $col_063);
	}

	public void col_063(MCNumber value) {
		setConstNumber(offset + 94, $col_063, value);
	}

	public void col_063(int value) {
		setConstNumber(offset + 94, $col_063, value);
	}

	public void col_063(long value) {
		setConstNumber(offset + 94, $col_063, value);
	}

	public void col_063(float value) {
		setConstNumber(offset + 94, $col_063, value);
	}

	public void col_063(double value) {
		setConstNumber(offset + 94, $col_063, value);
	}


	public MCNumber col_064() {
		return getConstNumber(offset + 95, $col_064);
	}

	public void col_064(MCNumber value) {
		setConstNumber(offset + 95, $col_064, value);
	}

	public void col_064(int value) {
		setConstNumber(offset + 95, $col_064, value);
	}

	public void col_064(long value) {
		setConstNumber(offset + 95, $col_064, value);
	}

	public void col_064(float value) {
		setConstNumber(offset + 95, $col_064, value);
	}

	public void col_064(double value) {
		setConstNumber(offset + 95, $col_064, value);
	}


	public MCNumber col_065() {
		return getConstNumber(offset + 96, $col_065);
	}

	public void col_065(MCNumber value) {
		setConstNumber(offset + 96, $col_065, value);
	}

	public void col_065(int value) {
		setConstNumber(offset + 96, $col_065, value);
	}

	public void col_065(long value) {
		setConstNumber(offset + 96, $col_065, value);
	}

	public void col_065(float value) {
		setConstNumber(offset + 96, $col_065, value);
	}

	public void col_065(double value) {
		setConstNumber(offset + 96, $col_065, value);
	}


	public MCNumber col_066() {
		return getConstNumber(offset + 97, $col_066);
	}

	public void col_066(MCNumber value) {
		setConstNumber(offset + 97, $col_066, value);
	}

	public void col_066(int value) {
		setConstNumber(offset + 97, $col_066, value);
	}

	public void col_066(long value) {
		setConstNumber(offset + 97, $col_066, value);
	}

	public void col_066(float value) {
		setConstNumber(offset + 97, $col_066, value);
	}

	public void col_066(double value) {
		setConstNumber(offset + 97, $col_066, value);
	}


	public MCNumber col_067() {
		return getConstNumber(offset + 98, $col_067);
	}

	public void col_067(MCNumber value) {
		setConstNumber(offset + 98, $col_067, value);
	}

	public void col_067(int value) {
		setConstNumber(offset + 98, $col_067, value);
	}

	public void col_067(long value) {
		setConstNumber(offset + 98, $col_067, value);
	}

	public void col_067(float value) {
		setConstNumber(offset + 98, $col_067, value);
	}

	public void col_067(double value) {
		setConstNumber(offset + 98, $col_067, value);
	}


	public MCNumber col_068() {
		return getConstNumber(offset + 99, $col_068);
	}

	public void col_068(MCNumber value) {
		setConstNumber(offset + 99, $col_068, value);
	}

	public void col_068(int value) {
		setConstNumber(offset + 99, $col_068, value);
	}

	public void col_068(long value) {
		setConstNumber(offset + 99, $col_068, value);
	}

	public void col_068(float value) {
		setConstNumber(offset + 99, $col_068, value);
	}

	public void col_068(double value) {
		setConstNumber(offset + 99, $col_068, value);
	}


	public MCNumber col_069() {
		return getConstNumber(offset + 100, $col_069);
	}

	public void col_069(MCNumber value) {
		setConstNumber(offset + 100, $col_069, value);
	}

	public void col_069(int value) {
		setConstNumber(offset + 100, $col_069, value);
	}

	public void col_069(long value) {
		setConstNumber(offset + 100, $col_069, value);
	}

	public void col_069(float value) {
		setConstNumber(offset + 100, $col_069, value);
	}

	public void col_069(double value) {
		setConstNumber(offset + 100, $col_069, value);
	}


	public MCNumber col_070() {
		return getConstNumber(offset + 101, $col_070);
	}

	public void col_070(MCNumber value) {
		setConstNumber(offset + 101, $col_070, value);
	}

	public void col_070(int value) {
		setConstNumber(offset + 101, $col_070, value);
	}

	public void col_070(long value) {
		setConstNumber(offset + 101, $col_070, value);
	}

	public void col_070(float value) {
		setConstNumber(offset + 101, $col_070, value);
	}

	public void col_070(double value) {
		setConstNumber(offset + 101, $col_070, value);
	}


	public MCNumber col_071() {
		return getConstNumber(offset + 102, $col_071);
	}

	public void col_071(MCNumber value) {
		setConstNumber(offset + 102, $col_071, value);
	}

	public void col_071(int value) {
		setConstNumber(offset + 102, $col_071, value);
	}

	public void col_071(long value) {
		setConstNumber(offset + 102, $col_071, value);
	}

	public void col_071(float value) {
		setConstNumber(offset + 102, $col_071, value);
	}

	public void col_071(double value) {
		setConstNumber(offset + 102, $col_071, value);
	}


	public MCNumber col_072() {
		return getConstNumber(offset + 103, $col_072);
	}

	public void col_072(MCNumber value) {
		setConstNumber(offset + 103, $col_072, value);
	}

	public void col_072(int value) {
		setConstNumber(offset + 103, $col_072, value);
	}

	public void col_072(long value) {
		setConstNumber(offset + 103, $col_072, value);
	}

	public void col_072(float value) {
		setConstNumber(offset + 103, $col_072, value);
	}

	public void col_072(double value) {
		setConstNumber(offset + 103, $col_072, value);
	}


	public MCNumber col_073() {
		return getConstNumber(offset + 104, $col_073);
	}

	public void col_073(MCNumber value) {
		setConstNumber(offset + 104, $col_073, value);
	}

	public void col_073(int value) {
		setConstNumber(offset + 104, $col_073, value);
	}

	public void col_073(long value) {
		setConstNumber(offset + 104, $col_073, value);
	}

	public void col_073(float value) {
		setConstNumber(offset + 104, $col_073, value);
	}

	public void col_073(double value) {
		setConstNumber(offset + 104, $col_073, value);
	}


	public MCNumber col_074() {
		return getConstNumber(offset + 105, $col_074);
	}

	public void col_074(MCNumber value) {
		setConstNumber(offset + 105, $col_074, value);
	}

	public void col_074(int value) {
		setConstNumber(offset + 105, $col_074, value);
	}

	public void col_074(long value) {
		setConstNumber(offset + 105, $col_074, value);
	}

	public void col_074(float value) {
		setConstNumber(offset + 105, $col_074, value);
	}

	public void col_074(double value) {
		setConstNumber(offset + 105, $col_074, value);
	}


	public MCNumber col_075() {
		return getConstNumber(offset + 106, $col_075);
	}

	public void col_075(MCNumber value) {
		setConstNumber(offset + 106, $col_075, value);
	}

	public void col_075(int value) {
		setConstNumber(offset + 106, $col_075, value);
	}

	public void col_075(long value) {
		setConstNumber(offset + 106, $col_075, value);
	}

	public void col_075(float value) {
		setConstNumber(offset + 106, $col_075, value);
	}

	public void col_075(double value) {
		setConstNumber(offset + 106, $col_075, value);
	}


	public MCNumber col_076() {
		return getConstNumber(offset + 107, $col_076);
	}

	public void col_076(MCNumber value) {
		setConstNumber(offset + 107, $col_076, value);
	}

	public void col_076(int value) {
		setConstNumber(offset + 107, $col_076, value);
	}

	public void col_076(long value) {
		setConstNumber(offset + 107, $col_076, value);
	}

	public void col_076(float value) {
		setConstNumber(offset + 107, $col_076, value);
	}

	public void col_076(double value) {
		setConstNumber(offset + 107, $col_076, value);
	}


	public MCNumber col_077() {
		return getConstNumber(offset + 108, $col_077);
	}

	public void col_077(MCNumber value) {
		setConstNumber(offset + 108, $col_077, value);
	}

	public void col_077(int value) {
		setConstNumber(offset + 108, $col_077, value);
	}

	public void col_077(long value) {
		setConstNumber(offset + 108, $col_077, value);
	}

	public void col_077(float value) {
		setConstNumber(offset + 108, $col_077, value);
	}

	public void col_077(double value) {
		setConstNumber(offset + 108, $col_077, value);
	}


	public MCNumber col_078() {
		return getConstNumber(offset + 109, $col_078);
	}

	public void col_078(MCNumber value) {
		setConstNumber(offset + 109, $col_078, value);
	}

	public void col_078(int value) {
		setConstNumber(offset + 109, $col_078, value);
	}

	public void col_078(long value) {
		setConstNumber(offset + 109, $col_078, value);
	}

	public void col_078(float value) {
		setConstNumber(offset + 109, $col_078, value);
	}

	public void col_078(double value) {
		setConstNumber(offset + 109, $col_078, value);
	}


	public MCNumber col_079() {
		return getConstNumber(offset + 110, $col_079);
	}

	public void col_079(MCNumber value) {
		setConstNumber(offset + 110, $col_079, value);
	}

	public void col_079(int value) {
		setConstNumber(offset + 110, $col_079, value);
	}

	public void col_079(long value) {
		setConstNumber(offset + 110, $col_079, value);
	}

	public void col_079(float value) {
		setConstNumber(offset + 110, $col_079, value);
	}

	public void col_079(double value) {
		setConstNumber(offset + 110, $col_079, value);
	}


	public MCNumber col_080() {
		return getConstNumber(offset + 111, $col_080);
	}

	public void col_080(MCNumber value) {
		setConstNumber(offset + 111, $col_080, value);
	}

	public void col_080(int value) {
		setConstNumber(offset + 111, $col_080, value);
	}

	public void col_080(long value) {
		setConstNumber(offset + 111, $col_080, value);
	}

	public void col_080(float value) {
		setConstNumber(offset + 111, $col_080, value);
	}

	public void col_080(double value) {
		setConstNumber(offset + 111, $col_080, value);
	}


	public MCNumber col_081() {
		return getConstNumber(offset + 112, $col_081);
	}

	public void col_081(MCNumber value) {
		setConstNumber(offset + 112, $col_081, value);
	}

	public void col_081(int value) {
		setConstNumber(offset + 112, $col_081, value);
	}

	public void col_081(long value) {
		setConstNumber(offset + 112, $col_081, value);
	}

	public void col_081(float value) {
		setConstNumber(offset + 112, $col_081, value);
	}

	public void col_081(double value) {
		setConstNumber(offset + 112, $col_081, value);
	}


	public MCNumber col_082() {
		return getConstNumber(offset + 113, $col_082);
	}

	public void col_082(MCNumber value) {
		setConstNumber(offset + 113, $col_082, value);
	}

	public void col_082(int value) {
		setConstNumber(offset + 113, $col_082, value);
	}

	public void col_082(long value) {
		setConstNumber(offset + 113, $col_082, value);
	}

	public void col_082(float value) {
		setConstNumber(offset + 113, $col_082, value);
	}

	public void col_082(double value) {
		setConstNumber(offset + 113, $col_082, value);
	}


	public MCNumber col_083() {
		return getConstNumber(offset + 114, $col_083);
	}

	public void col_083(MCNumber value) {
		setConstNumber(offset + 114, $col_083, value);
	}

	public void col_083(int value) {
		setConstNumber(offset + 114, $col_083, value);
	}

	public void col_083(long value) {
		setConstNumber(offset + 114, $col_083, value);
	}

	public void col_083(float value) {
		setConstNumber(offset + 114, $col_083, value);
	}

	public void col_083(double value) {
		setConstNumber(offset + 114, $col_083, value);
	}


	public MCNumber col_084() {
		return getConstNumber(offset + 115, $col_084);
	}

	public void col_084(MCNumber value) {
		setConstNumber(offset + 115, $col_084, value);
	}

	public void col_084(int value) {
		setConstNumber(offset + 115, $col_084, value);
	}

	public void col_084(long value) {
		setConstNumber(offset + 115, $col_084, value);
	}

	public void col_084(float value) {
		setConstNumber(offset + 115, $col_084, value);
	}

	public void col_084(double value) {
		setConstNumber(offset + 115, $col_084, value);
	}


	public MCNumber col_085() {
		return getConstNumber(offset + 116, $col_085);
	}

	public void col_085(MCNumber value) {
		setConstNumber(offset + 116, $col_085, value);
	}

	public void col_085(int value) {
		setConstNumber(offset + 116, $col_085, value);
	}

	public void col_085(long value) {
		setConstNumber(offset + 116, $col_085, value);
	}

	public void col_085(float value) {
		setConstNumber(offset + 116, $col_085, value);
	}

	public void col_085(double value) {
		setConstNumber(offset + 116, $col_085, value);
	}


	public MCNumber col_086() {
		return getConstNumber(offset + 117, $col_086);
	}

	public void col_086(MCNumber value) {
		setConstNumber(offset + 117, $col_086, value);
	}

	public void col_086(int value) {
		setConstNumber(offset + 117, $col_086, value);
	}

	public void col_086(long value) {
		setConstNumber(offset + 117, $col_086, value);
	}

	public void col_086(float value) {
		setConstNumber(offset + 117, $col_086, value);
	}

	public void col_086(double value) {
		setConstNumber(offset + 117, $col_086, value);
	}


	public MCNumber col_087() {
		return getConstNumber(offset + 118, $col_087);
	}

	public void col_087(MCNumber value) {
		setConstNumber(offset + 118, $col_087, value);
	}

	public void col_087(int value) {
		setConstNumber(offset + 118, $col_087, value);
	}

	public void col_087(long value) {
		setConstNumber(offset + 118, $col_087, value);
	}

	public void col_087(float value) {
		setConstNumber(offset + 118, $col_087, value);
	}

	public void col_087(double value) {
		setConstNumber(offset + 118, $col_087, value);
	}


	public MCNumber col_088() {
		return getConstNumber(offset + 119, $col_088);
	}

	public void col_088(MCNumber value) {
		setConstNumber(offset + 119, $col_088, value);
	}

	public void col_088(int value) {
		setConstNumber(offset + 119, $col_088, value);
	}

	public void col_088(long value) {
		setConstNumber(offset + 119, $col_088, value);
	}

	public void col_088(float value) {
		setConstNumber(offset + 119, $col_088, value);
	}

	public void col_088(double value) {
		setConstNumber(offset + 119, $col_088, value);
	}


	public MCNumber col_089() {
		return getConstNumber(offset + 120, $col_089);
	}

	public void col_089(MCNumber value) {
		setConstNumber(offset + 120, $col_089, value);
	}

	public void col_089(int value) {
		setConstNumber(offset + 120, $col_089, value);
	}

	public void col_089(long value) {
		setConstNumber(offset + 120, $col_089, value);
	}

	public void col_089(float value) {
		setConstNumber(offset + 120, $col_089, value);
	}

	public void col_089(double value) {
		setConstNumber(offset + 120, $col_089, value);
	}


	public MCNumber col_090() {
		return getConstNumber(offset + 121, $col_090);
	}

	public void col_090(MCNumber value) {
		setConstNumber(offset + 121, $col_090, value);
	}

	public void col_090(int value) {
		setConstNumber(offset + 121, $col_090, value);
	}

	public void col_090(long value) {
		setConstNumber(offset + 121, $col_090, value);
	}

	public void col_090(float value) {
		setConstNumber(offset + 121, $col_090, value);
	}

	public void col_090(double value) {
		setConstNumber(offset + 121, $col_090, value);
	}


	public MCNumber col_091() {
		return getConstNumber(offset + 122, $col_091);
	}

	public void col_091(MCNumber value) {
		setConstNumber(offset + 122, $col_091, value);
	}

	public void col_091(int value) {
		setConstNumber(offset + 122, $col_091, value);
	}

	public void col_091(long value) {
		setConstNumber(offset + 122, $col_091, value);
	}

	public void col_091(float value) {
		setConstNumber(offset + 122, $col_091, value);
	}

	public void col_091(double value) {
		setConstNumber(offset + 122, $col_091, value);
	}


	public MCNumber col_092() {
		return getConstNumber(offset + 123, $col_092);
	}

	public void col_092(MCNumber value) {
		setConstNumber(offset + 123, $col_092, value);
	}

	public void col_092(int value) {
		setConstNumber(offset + 123, $col_092, value);
	}

	public void col_092(long value) {
		setConstNumber(offset + 123, $col_092, value);
	}

	public void col_092(float value) {
		setConstNumber(offset + 123, $col_092, value);
	}

	public void col_092(double value) {
		setConstNumber(offset + 123, $col_092, value);
	}


	public MCNumber col_093() {
		return getConstNumber(offset + 124, $col_093);
	}

	public void col_093(MCNumber value) {
		setConstNumber(offset + 124, $col_093, value);
	}

	public void col_093(int value) {
		setConstNumber(offset + 124, $col_093, value);
	}

	public void col_093(long value) {
		setConstNumber(offset + 124, $col_093, value);
	}

	public void col_093(float value) {
		setConstNumber(offset + 124, $col_093, value);
	}

	public void col_093(double value) {
		setConstNumber(offset + 124, $col_093, value);
	}


	public MCNumber col_094() {
		return getConstNumber(offset + 125, $col_094);
	}

	public void col_094(MCNumber value) {
		setConstNumber(offset + 125, $col_094, value);
	}

	public void col_094(int value) {
		setConstNumber(offset + 125, $col_094, value);
	}

	public void col_094(long value) {
		setConstNumber(offset + 125, $col_094, value);
	}

	public void col_094(float value) {
		setConstNumber(offset + 125, $col_094, value);
	}

	public void col_094(double value) {
		setConstNumber(offset + 125, $col_094, value);
	}


	public MCNumber col_095() {
		return getConstNumber(offset + 126, $col_095);
	}

	public void col_095(MCNumber value) {
		setConstNumber(offset + 126, $col_095, value);
	}

	public void col_095(int value) {
		setConstNumber(offset + 126, $col_095, value);
	}

	public void col_095(long value) {
		setConstNumber(offset + 126, $col_095, value);
	}

	public void col_095(float value) {
		setConstNumber(offset + 126, $col_095, value);
	}

	public void col_095(double value) {
		setConstNumber(offset + 126, $col_095, value);
	}


	public MCNumber col_096() {
		return getConstNumber(offset + 127, $col_096);
	}

	public void col_096(MCNumber value) {
		setConstNumber(offset + 127, $col_096, value);
	}

	public void col_096(int value) {
		setConstNumber(offset + 127, $col_096, value);
	}

	public void col_096(long value) {
		setConstNumber(offset + 127, $col_096, value);
	}

	public void col_096(float value) {
		setConstNumber(offset + 127, $col_096, value);
	}

	public void col_096(double value) {
		setConstNumber(offset + 127, $col_096, value);
	}


	public MCNumber col_097() {
		return getConstNumber(offset + 128, $col_097);
	}

	public void col_097(MCNumber value) {
		setConstNumber(offset + 128, $col_097, value);
	}

	public void col_097(int value) {
		setConstNumber(offset + 128, $col_097, value);
	}

	public void col_097(long value) {
		setConstNumber(offset + 128, $col_097, value);
	}

	public void col_097(float value) {
		setConstNumber(offset + 128, $col_097, value);
	}

	public void col_097(double value) {
		setConstNumber(offset + 128, $col_097, value);
	}


	public MCNumber col_098() {
		return getConstNumber(offset + 129, $col_098);
	}

	public void col_098(MCNumber value) {
		setConstNumber(offset + 129, $col_098, value);
	}

	public void col_098(int value) {
		setConstNumber(offset + 129, $col_098, value);
	}

	public void col_098(long value) {
		setConstNumber(offset + 129, $col_098, value);
	}

	public void col_098(float value) {
		setConstNumber(offset + 129, $col_098, value);
	}

	public void col_098(double value) {
		setConstNumber(offset + 129, $col_098, value);
	}


	public MCNumber col_099() {
		return getConstNumber(offset + 130, $col_099);
	}

	public void col_099(MCNumber value) {
		setConstNumber(offset + 130, $col_099, value);
	}

	public void col_099(int value) {
		setConstNumber(offset + 130, $col_099, value);
	}

	public void col_099(long value) {
		setConstNumber(offset + 130, $col_099, value);
	}

	public void col_099(float value) {
		setConstNumber(offset + 130, $col_099, value);
	}

	public void col_099(double value) {
		setConstNumber(offset + 130, $col_099, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			return std_qty();
		}
		if ($the_qty.equalsIgnoreCase(name)) {
			return the_qty();
		}
		if ($oper_qty.equalsIgnoreCase(name)) {
			return oper_qty();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($column_id.equalsIgnoreCase(name)) {
			return column_id();
		}
		if ($all_ttl.equalsIgnoreCase(name)) {
			return all_ttl();
		}
		if ($std_mfg_cost.equalsIgnoreCase(name)) {
			return std_mfg_cost();
		}
		if ($the_mfg_cost.equalsIgnoreCase(name)) {
			return the_mfg_cost();
		}
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			return var_cost();
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			return fxd_cost();
		}
		if ($col_000.equalsIgnoreCase(name)) {
			return col_000();
		}
		if ($col_001.equalsIgnoreCase(name)) {
			return col_001();
		}
		if ($col_002.equalsIgnoreCase(name)) {
			return col_002();
		}
		if ($col_003.equalsIgnoreCase(name)) {
			return col_003();
		}
		if ($col_004.equalsIgnoreCase(name)) {
			return col_004();
		}
		if ($col_005.equalsIgnoreCase(name)) {
			return col_005();
		}
		if ($col_006.equalsIgnoreCase(name)) {
			return col_006();
		}
		if ($col_007.equalsIgnoreCase(name)) {
			return col_007();
		}
		if ($col_008.equalsIgnoreCase(name)) {
			return col_008();
		}
		if ($col_009.equalsIgnoreCase(name)) {
			return col_009();
		}
		if ($col_010.equalsIgnoreCase(name)) {
			return col_010();
		}
		if ($col_011.equalsIgnoreCase(name)) {
			return col_011();
		}
		if ($col_012.equalsIgnoreCase(name)) {
			return col_012();
		}
		if ($col_013.equalsIgnoreCase(name)) {
			return col_013();
		}
		if ($col_014.equalsIgnoreCase(name)) {
			return col_014();
		}
		if ($col_015.equalsIgnoreCase(name)) {
			return col_015();
		}
		if ($col_016.equalsIgnoreCase(name)) {
			return col_016();
		}
		if ($col_017.equalsIgnoreCase(name)) {
			return col_017();
		}
		if ($col_018.equalsIgnoreCase(name)) {
			return col_018();
		}
		if ($col_019.equalsIgnoreCase(name)) {
			return col_019();
		}
		if ($col_020.equalsIgnoreCase(name)) {
			return col_020();
		}
		if ($col_021.equalsIgnoreCase(name)) {
			return col_021();
		}
		if ($col_022.equalsIgnoreCase(name)) {
			return col_022();
		}
		if ($col_023.equalsIgnoreCase(name)) {
			return col_023();
		}
		if ($col_024.equalsIgnoreCase(name)) {
			return col_024();
		}
		if ($col_025.equalsIgnoreCase(name)) {
			return col_025();
		}
		if ($col_026.equalsIgnoreCase(name)) {
			return col_026();
		}
		if ($col_027.equalsIgnoreCase(name)) {
			return col_027();
		}
		if ($col_028.equalsIgnoreCase(name)) {
			return col_028();
		}
		if ($col_029.equalsIgnoreCase(name)) {
			return col_029();
		}
		if ($col_030.equalsIgnoreCase(name)) {
			return col_030();
		}
		if ($col_031.equalsIgnoreCase(name)) {
			return col_031();
		}
		if ($col_032.equalsIgnoreCase(name)) {
			return col_032();
		}
		if ($col_033.equalsIgnoreCase(name)) {
			return col_033();
		}
		if ($col_034.equalsIgnoreCase(name)) {
			return col_034();
		}
		if ($col_035.equalsIgnoreCase(name)) {
			return col_035();
		}
		if ($col_036.equalsIgnoreCase(name)) {
			return col_036();
		}
		if ($col_037.equalsIgnoreCase(name)) {
			return col_037();
		}
		if ($col_038.equalsIgnoreCase(name)) {
			return col_038();
		}
		if ($col_039.equalsIgnoreCase(name)) {
			return col_039();
		}
		if ($col_040.equalsIgnoreCase(name)) {
			return col_040();
		}
		if ($col_041.equalsIgnoreCase(name)) {
			return col_041();
		}
		if ($col_042.equalsIgnoreCase(name)) {
			return col_042();
		}
		if ($col_043.equalsIgnoreCase(name)) {
			return col_043();
		}
		if ($col_044.equalsIgnoreCase(name)) {
			return col_044();
		}
		if ($col_045.equalsIgnoreCase(name)) {
			return col_045();
		}
		if ($col_046.equalsIgnoreCase(name)) {
			return col_046();
		}
		if ($col_047.equalsIgnoreCase(name)) {
			return col_047();
		}
		if ($col_048.equalsIgnoreCase(name)) {
			return col_048();
		}
		if ($col_049.equalsIgnoreCase(name)) {
			return col_049();
		}
		if ($col_050.equalsIgnoreCase(name)) {
			return col_050();
		}
		if ($col_051.equalsIgnoreCase(name)) {
			return col_051();
		}
		if ($col_052.equalsIgnoreCase(name)) {
			return col_052();
		}
		if ($col_053.equalsIgnoreCase(name)) {
			return col_053();
		}
		if ($col_054.equalsIgnoreCase(name)) {
			return col_054();
		}
		if ($col_055.equalsIgnoreCase(name)) {
			return col_055();
		}
		if ($col_056.equalsIgnoreCase(name)) {
			return col_056();
		}
		if ($col_057.equalsIgnoreCase(name)) {
			return col_057();
		}
		if ($col_058.equalsIgnoreCase(name)) {
			return col_058();
		}
		if ($col_059.equalsIgnoreCase(name)) {
			return col_059();
		}
		if ($col_060.equalsIgnoreCase(name)) {
			return col_060();
		}
		if ($col_061.equalsIgnoreCase(name)) {
			return col_061();
		}
		if ($col_062.equalsIgnoreCase(name)) {
			return col_062();
		}
		if ($col_063.equalsIgnoreCase(name)) {
			return col_063();
		}
		if ($col_064.equalsIgnoreCase(name)) {
			return col_064();
		}
		if ($col_065.equalsIgnoreCase(name)) {
			return col_065();
		}
		if ($col_066.equalsIgnoreCase(name)) {
			return col_066();
		}
		if ($col_067.equalsIgnoreCase(name)) {
			return col_067();
		}
		if ($col_068.equalsIgnoreCase(name)) {
			return col_068();
		}
		if ($col_069.equalsIgnoreCase(name)) {
			return col_069();
		}
		if ($col_070.equalsIgnoreCase(name)) {
			return col_070();
		}
		if ($col_071.equalsIgnoreCase(name)) {
			return col_071();
		}
		if ($col_072.equalsIgnoreCase(name)) {
			return col_072();
		}
		if ($col_073.equalsIgnoreCase(name)) {
			return col_073();
		}
		if ($col_074.equalsIgnoreCase(name)) {
			return col_074();
		}
		if ($col_075.equalsIgnoreCase(name)) {
			return col_075();
		}
		if ($col_076.equalsIgnoreCase(name)) {
			return col_076();
		}
		if ($col_077.equalsIgnoreCase(name)) {
			return col_077();
		}
		if ($col_078.equalsIgnoreCase(name)) {
			return col_078();
		}
		if ($col_079.equalsIgnoreCase(name)) {
			return col_079();
		}
		if ($col_080.equalsIgnoreCase(name)) {
			return col_080();
		}
		if ($col_081.equalsIgnoreCase(name)) {
			return col_081();
		}
		if ($col_082.equalsIgnoreCase(name)) {
			return col_082();
		}
		if ($col_083.equalsIgnoreCase(name)) {
			return col_083();
		}
		if ($col_084.equalsIgnoreCase(name)) {
			return col_084();
		}
		if ($col_085.equalsIgnoreCase(name)) {
			return col_085();
		}
		if ($col_086.equalsIgnoreCase(name)) {
			return col_086();
		}
		if ($col_087.equalsIgnoreCase(name)) {
			return col_087();
		}
		if ($col_088.equalsIgnoreCase(name)) {
			return col_088();
		}
		if ($col_089.equalsIgnoreCase(name)) {
			return col_089();
		}
		if ($col_090.equalsIgnoreCase(name)) {
			return col_090();
		}
		if ($col_091.equalsIgnoreCase(name)) {
			return col_091();
		}
		if ($col_092.equalsIgnoreCase(name)) {
			return col_092();
		}
		if ($col_093.equalsIgnoreCase(name)) {
			return col_093();
		}
		if ($col_094.equalsIgnoreCase(name)) {
			return col_094();
		}
		if ($col_095.equalsIgnoreCase(name)) {
			return col_095();
		}
		if ($col_096.equalsIgnoreCase(name)) {
			return col_096();
		}
		if ($col_097.equalsIgnoreCase(name)) {
			return col_097();
		}
		if ($col_098.equalsIgnoreCase(name)) {
			return col_098();
		}
		if ($col_099.equalsIgnoreCase(name)) {
			return col_099();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			return std_qty();
		}
		if ($the_qty.equalsIgnoreCase(name)) {
			return the_qty();
		}
		if ($oper_qty.equalsIgnoreCase(name)) {
			return oper_qty();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($column_id.equalsIgnoreCase(name)) {
			return column_id();
		}
		if ($all_ttl.equalsIgnoreCase(name)) {
			return all_ttl();
		}
		if ($std_mfg_cost.equalsIgnoreCase(name)) {
			return std_mfg_cost();
		}
		if ($the_mfg_cost.equalsIgnoreCase(name)) {
			return the_mfg_cost();
		}
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			return var_cost();
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			return fxd_cost();
		}
		if ($col_000.equalsIgnoreCase(name)) {
			return col_000();
		}
		if ($col_001.equalsIgnoreCase(name)) {
			return col_001();
		}
		if ($col_002.equalsIgnoreCase(name)) {
			return col_002();
		}
		if ($col_003.equalsIgnoreCase(name)) {
			return col_003();
		}
		if ($col_004.equalsIgnoreCase(name)) {
			return col_004();
		}
		if ($col_005.equalsIgnoreCase(name)) {
			return col_005();
		}
		if ($col_006.equalsIgnoreCase(name)) {
			return col_006();
		}
		if ($col_007.equalsIgnoreCase(name)) {
			return col_007();
		}
		if ($col_008.equalsIgnoreCase(name)) {
			return col_008();
		}
		if ($col_009.equalsIgnoreCase(name)) {
			return col_009();
		}
		if ($col_010.equalsIgnoreCase(name)) {
			return col_010();
		}
		if ($col_011.equalsIgnoreCase(name)) {
			return col_011();
		}
		if ($col_012.equalsIgnoreCase(name)) {
			return col_012();
		}
		if ($col_013.equalsIgnoreCase(name)) {
			return col_013();
		}
		if ($col_014.equalsIgnoreCase(name)) {
			return col_014();
		}
		if ($col_015.equalsIgnoreCase(name)) {
			return col_015();
		}
		if ($col_016.equalsIgnoreCase(name)) {
			return col_016();
		}
		if ($col_017.equalsIgnoreCase(name)) {
			return col_017();
		}
		if ($col_018.equalsIgnoreCase(name)) {
			return col_018();
		}
		if ($col_019.equalsIgnoreCase(name)) {
			return col_019();
		}
		if ($col_020.equalsIgnoreCase(name)) {
			return col_020();
		}
		if ($col_021.equalsIgnoreCase(name)) {
			return col_021();
		}
		if ($col_022.equalsIgnoreCase(name)) {
			return col_022();
		}
		if ($col_023.equalsIgnoreCase(name)) {
			return col_023();
		}
		if ($col_024.equalsIgnoreCase(name)) {
			return col_024();
		}
		if ($col_025.equalsIgnoreCase(name)) {
			return col_025();
		}
		if ($col_026.equalsIgnoreCase(name)) {
			return col_026();
		}
		if ($col_027.equalsIgnoreCase(name)) {
			return col_027();
		}
		if ($col_028.equalsIgnoreCase(name)) {
			return col_028();
		}
		if ($col_029.equalsIgnoreCase(name)) {
			return col_029();
		}
		if ($col_030.equalsIgnoreCase(name)) {
			return col_030();
		}
		if ($col_031.equalsIgnoreCase(name)) {
			return col_031();
		}
		if ($col_032.equalsIgnoreCase(name)) {
			return col_032();
		}
		if ($col_033.equalsIgnoreCase(name)) {
			return col_033();
		}
		if ($col_034.equalsIgnoreCase(name)) {
			return col_034();
		}
		if ($col_035.equalsIgnoreCase(name)) {
			return col_035();
		}
		if ($col_036.equalsIgnoreCase(name)) {
			return col_036();
		}
		if ($col_037.equalsIgnoreCase(name)) {
			return col_037();
		}
		if ($col_038.equalsIgnoreCase(name)) {
			return col_038();
		}
		if ($col_039.equalsIgnoreCase(name)) {
			return col_039();
		}
		if ($col_040.equalsIgnoreCase(name)) {
			return col_040();
		}
		if ($col_041.equalsIgnoreCase(name)) {
			return col_041();
		}
		if ($col_042.equalsIgnoreCase(name)) {
			return col_042();
		}
		if ($col_043.equalsIgnoreCase(name)) {
			return col_043();
		}
		if ($col_044.equalsIgnoreCase(name)) {
			return col_044();
		}
		if ($col_045.equalsIgnoreCase(name)) {
			return col_045();
		}
		if ($col_046.equalsIgnoreCase(name)) {
			return col_046();
		}
		if ($col_047.equalsIgnoreCase(name)) {
			return col_047();
		}
		if ($col_048.equalsIgnoreCase(name)) {
			return col_048();
		}
		if ($col_049.equalsIgnoreCase(name)) {
			return col_049();
		}
		if ($col_050.equalsIgnoreCase(name)) {
			return col_050();
		}
		if ($col_051.equalsIgnoreCase(name)) {
			return col_051();
		}
		if ($col_052.equalsIgnoreCase(name)) {
			return col_052();
		}
		if ($col_053.equalsIgnoreCase(name)) {
			return col_053();
		}
		if ($col_054.equalsIgnoreCase(name)) {
			return col_054();
		}
		if ($col_055.equalsIgnoreCase(name)) {
			return col_055();
		}
		if ($col_056.equalsIgnoreCase(name)) {
			return col_056();
		}
		if ($col_057.equalsIgnoreCase(name)) {
			return col_057();
		}
		if ($col_058.equalsIgnoreCase(name)) {
			return col_058();
		}
		if ($col_059.equalsIgnoreCase(name)) {
			return col_059();
		}
		if ($col_060.equalsIgnoreCase(name)) {
			return col_060();
		}
		if ($col_061.equalsIgnoreCase(name)) {
			return col_061();
		}
		if ($col_062.equalsIgnoreCase(name)) {
			return col_062();
		}
		if ($col_063.equalsIgnoreCase(name)) {
			return col_063();
		}
		if ($col_064.equalsIgnoreCase(name)) {
			return col_064();
		}
		if ($col_065.equalsIgnoreCase(name)) {
			return col_065();
		}
		if ($col_066.equalsIgnoreCase(name)) {
			return col_066();
		}
		if ($col_067.equalsIgnoreCase(name)) {
			return col_067();
		}
		if ($col_068.equalsIgnoreCase(name)) {
			return col_068();
		}
		if ($col_069.equalsIgnoreCase(name)) {
			return col_069();
		}
		if ($col_070.equalsIgnoreCase(name)) {
			return col_070();
		}
		if ($col_071.equalsIgnoreCase(name)) {
			return col_071();
		}
		if ($col_072.equalsIgnoreCase(name)) {
			return col_072();
		}
		if ($col_073.equalsIgnoreCase(name)) {
			return col_073();
		}
		if ($col_074.equalsIgnoreCase(name)) {
			return col_074();
		}
		if ($col_075.equalsIgnoreCase(name)) {
			return col_075();
		}
		if ($col_076.equalsIgnoreCase(name)) {
			return col_076();
		}
		if ($col_077.equalsIgnoreCase(name)) {
			return col_077();
		}
		if ($col_078.equalsIgnoreCase(name)) {
			return col_078();
		}
		if ($col_079.equalsIgnoreCase(name)) {
			return col_079();
		}
		if ($col_080.equalsIgnoreCase(name)) {
			return col_080();
		}
		if ($col_081.equalsIgnoreCase(name)) {
			return col_081();
		}
		if ($col_082.equalsIgnoreCase(name)) {
			return col_082();
		}
		if ($col_083.equalsIgnoreCase(name)) {
			return col_083();
		}
		if ($col_084.equalsIgnoreCase(name)) {
			return col_084();
		}
		if ($col_085.equalsIgnoreCase(name)) {
			return col_085();
		}
		if ($col_086.equalsIgnoreCase(name)) {
			return col_086();
		}
		if ($col_087.equalsIgnoreCase(name)) {
			return col_087();
		}
		if ($col_088.equalsIgnoreCase(name)) {
			return col_088();
		}
		if ($col_089.equalsIgnoreCase(name)) {
			return col_089();
		}
		if ($col_090.equalsIgnoreCase(name)) {
			return col_090();
		}
		if ($col_091.equalsIgnoreCase(name)) {
			return col_091();
		}
		if ($col_092.equalsIgnoreCase(name)) {
			return col_092();
		}
		if ($col_093.equalsIgnoreCase(name)) {
			return col_093();
		}
		if ($col_094.equalsIgnoreCase(name)) {
			return col_094();
		}
		if ($col_095.equalsIgnoreCase(name)) {
			return col_095();
		}
		if ($col_096.equalsIgnoreCase(name)) {
			return col_096();
		}
		if ($col_097.equalsIgnoreCase(name)) {
			return col_097();
		}
		if ($col_098.equalsIgnoreCase(name)) {
			return col_098();
		}
		if ($col_099.equalsIgnoreCase(name)) {
			return col_099();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
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
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($the_qty.equalsIgnoreCase(name)) {
			the_qty(value);
			return;
		}
		if ($oper_qty.equalsIgnoreCase(name)) {
			oper_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($column_id.equalsIgnoreCase(name)) {
			column_id(value);
			return;
		}
		if ($all_ttl.equalsIgnoreCase(name)) {
			all_ttl(value);
			return;
		}
		if ($std_mfg_cost.equalsIgnoreCase(name)) {
			std_mfg_cost(value);
			return;
		}
		if ($the_mfg_cost.equalsIgnoreCase(name)) {
			the_mfg_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($the_qty.equalsIgnoreCase(name)) {
			the_qty(value);
			return;
		}
		if ($oper_qty.equalsIgnoreCase(name)) {
			oper_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($column_id.equalsIgnoreCase(name)) {
			column_id(value);
			return;
		}
		if ($all_ttl.equalsIgnoreCase(name)) {
			all_ttl(value);
			return;
		}
		if ($std_mfg_cost.equalsIgnoreCase(name)) {
			std_mfg_cost(value);
			return;
		}
		if ($the_mfg_cost.equalsIgnoreCase(name)) {
			the_mfg_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($the_qty.equalsIgnoreCase(name)) {
			the_qty(value);
			return;
		}
		if ($oper_qty.equalsIgnoreCase(name)) {
			oper_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($column_id.equalsIgnoreCase(name)) {
			column_id(value);
			return;
		}
		if ($all_ttl.equalsIgnoreCase(name)) {
			all_ttl(value);
			return;
		}
		if ($std_mfg_cost.equalsIgnoreCase(name)) {
			std_mfg_cost(value);
			return;
		}
		if ($the_mfg_cost.equalsIgnoreCase(name)) {
			the_mfg_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($the_qty.equalsIgnoreCase(name)) {
			the_qty(value);
			return;
		}
		if ($oper_qty.equalsIgnoreCase(name)) {
			oper_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($column_id.equalsIgnoreCase(name)) {
			column_id(value);
			return;
		}
		if ($all_ttl.equalsIgnoreCase(name)) {
			all_ttl(value);
			return;
		}
		if ($std_mfg_cost.equalsIgnoreCase(name)) {
			std_mfg_cost(value);
			return;
		}
		if ($the_mfg_cost.equalsIgnoreCase(name)) {
			the_mfg_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($the_qty.equalsIgnoreCase(name)) {
			the_qty(value);
			return;
		}
		if ($oper_qty.equalsIgnoreCase(name)) {
			oper_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($column_id.equalsIgnoreCase(name)) {
			column_id(value);
			return;
		}
		if ($all_ttl.equalsIgnoreCase(name)) {
			all_ttl(value);
			return;
		}
		if ($std_mfg_cost.equalsIgnoreCase(name)) {
			std_mfg_cost(value);
			return;
		}
		if ($the_mfg_cost.equalsIgnoreCase(name)) {
			the_mfg_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
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
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($the_qty.equalsIgnoreCase(name)) {
			the_qty(value);
			return;
		}
		if ($oper_qty.equalsIgnoreCase(name)) {
			oper_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($column_id.equalsIgnoreCase(name)) {
			column_id(value);
			return;
		}
		if ($all_ttl.equalsIgnoreCase(name)) {
			all_ttl(value);
			return;
		}
		if ($std_mfg_cost.equalsIgnoreCase(name)) {
			std_mfg_cost(value);
			return;
		}
		if ($the_mfg_cost.equalsIgnoreCase(name)) {
			the_mfg_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($the_qty.equalsIgnoreCase(name)) {
			the_qty(value);
			return;
		}
		if ($oper_qty.equalsIgnoreCase(name)) {
			oper_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($column_id.equalsIgnoreCase(name)) {
			column_id(value);
			return;
		}
		if ($all_ttl.equalsIgnoreCase(name)) {
			all_ttl(value);
			return;
		}
		if ($std_mfg_cost.equalsIgnoreCase(name)) {
			std_mfg_cost(value);
			return;
		}
		if ($the_mfg_cost.equalsIgnoreCase(name)) {
			the_mfg_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($the_qty.equalsIgnoreCase(name)) {
			the_qty(value);
			return;
		}
		if ($oper_qty.equalsIgnoreCase(name)) {
			oper_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($column_id.equalsIgnoreCase(name)) {
			column_id(value);
			return;
		}
		if ($all_ttl.equalsIgnoreCase(name)) {
			all_ttl(value);
			return;
		}
		if ($std_mfg_cost.equalsIgnoreCase(name)) {
			std_mfg_cost(value);
			return;
		}
		if ($the_mfg_cost.equalsIgnoreCase(name)) {
			the_mfg_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($the_qty.equalsIgnoreCase(name)) {
			the_qty(value);
			return;
		}
		if ($oper_qty.equalsIgnoreCase(name)) {
			oper_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($column_id.equalsIgnoreCase(name)) {
			column_id(value);
			return;
		}
		if ($all_ttl.equalsIgnoreCase(name)) {
			all_ttl(value);
			return;
		}
		if ($std_mfg_cost.equalsIgnoreCase(name)) {
			std_mfg_cost(value);
			return;
		}
		if ($the_mfg_cost.equalsIgnoreCase(name)) {
			the_mfg_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($the_qty.equalsIgnoreCase(name)) {
			the_qty(value);
			return;
		}
		if ($oper_qty.equalsIgnoreCase(name)) {
			oper_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($column_id.equalsIgnoreCase(name)) {
			column_id(value);
			return;
		}
		if ($all_ttl.equalsIgnoreCase(name)) {
			all_ttl(value);
			return;
		}
		if ($std_mfg_cost.equalsIgnoreCase(name)) {
			std_mfg_cost(value);
			return;
		}
		if ($the_mfg_cost.equalsIgnoreCase(name)) {
			the_mfg_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
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

}

