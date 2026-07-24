package mcframe.clientMGBE.MGBEP0210;

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
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm = "calc_ctg_nm";
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
	public static final String $base_qty_p = "base_qty_p";
	public static final String $unit_qty_p = "unit_qty_p";
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
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	public static final String $qty_00_p = "qty_00_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_001 = "col_001";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_002 = "col_002";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_003 = "col_003";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_004 = "col_004";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_005 = "col_005";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_006 = "col_006";
	public static final String $qty_01_p = "qty_01_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_008 = "col_008";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_009 = "col_009";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_010 = "col_010";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_011 = "col_011";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_012 = "col_012";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_013 = "col_013";
	public static final String $qty_02_p = "qty_02_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_015 = "col_015";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_016 = "col_016";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_017 = "col_017";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_018 = "col_018";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_019 = "col_019";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_020 = "col_020";
	public static final String $qty_03_p = "qty_03_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_022 = "col_022";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_023 = "col_023";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_024 = "col_024";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_025 = "col_025";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_026 = "col_026";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_027 = "col_027";
	public static final String $qty_04_p = "qty_04_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_029 = "col_029";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_030 = "col_030";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_031 = "col_031";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_032 = "col_032";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_033 = "col_033";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_034 = "col_034";
	public static final String $qty_05_p = "qty_05_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_036 = "col_036";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_037 = "col_037";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_038 = "col_038";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_039 = "col_039";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_040 = "col_040";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_041 = "col_041";
	public static final String $qty_06_p = "qty_06_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_043 = "col_043";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_044 = "col_044";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_045 = "col_045";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_046 = "col_046";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_047 = "col_047";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_048 = "col_048";
	public static final String $qty_07_p = "qty_07_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_050 = "col_050";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_051 = "col_051";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_052 = "col_052";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_053 = "col_053";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_054 = "col_054";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_055 = "col_055";
	public static final String $qty_08_p = "qty_08_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_057 = "col_057";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_058 = "col_058";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_059 = "col_059";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_060 = "col_060";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_061 = "col_061";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_062 = "col_062";
	public static final String $qty_09_p = "qty_09_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_064 = "col_064";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_065 = "col_065";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_066 = "col_066";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_067 = "col_067";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_068 = "col_068";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_069 = "col_069";
	public static final String $qty_10_p = "qty_10_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_071 = "col_071";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_072 = "col_072";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_073 = "col_073";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_074 = "col_074";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_075 = "col_075";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_076 = "col_076";
	public static final String $qty_11_p = "qty_11_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_078 = "col_078";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_079 = "col_079";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_080 = "col_080";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_081 = "col_081";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_082 = "col_082";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_083 = "col_083";
	public static final String $qty_12_p = "qty_12_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_085 = "col_085";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_086 = "col_086";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_087 = "col_087";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_088 = "col_088";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_089 = "col_089";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_090 = "col_090";
	public static final String $qty_13_p = "qty_13_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_092 = "col_092";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_093 = "col_093";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_094 = "col_094";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_095 = "col_095";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_096 = "col_096";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_097 = "col_097";
	public static final String $qty_14_p = "qty_14_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_099 = "col_099";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_100 = "col_100";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_101 = "col_101";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_102 = "col_102";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_103 = "col_103";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_104 = "col_104";
	public static final String $qty_15_p = "qty_15_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_106 = "col_106";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_107 = "col_107";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_108 = "col_108";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_109 = "col_109";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_110 = "col_110";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_111 = "col_111";
	public static final String $qty_16_p = "qty_16_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_113 = "col_113";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_114 = "col_114";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_115 = "col_115";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_116 = "col_116";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_117 = "col_117";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_118 = "col_118";
	public static final String $qty_17_p = "qty_17_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_120 = "col_120";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_121 = "col_121";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_122 = "col_122";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_123 = "col_123";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_124 = "col_124";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_125 = "col_125";
	public static final String $qty_18_p = "qty_18_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_127 = "col_127";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_128 = "col_128";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_129 = "col_129";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_130 = "col_130";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_131 = "col_131";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_132 = "col_132";
	public static final String $qty_19_p = "qty_19_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_134 = "col_134";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_135 = "col_135";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_136 = "col_136";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_137 = "col_137";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_138 = "col_138";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_139 = "col_139";
	public static final String $qty_20_p = "qty_20_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_141 = "col_141";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_142 = "col_142";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_143 = "col_143";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_144 = "col_144";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_145 = "col_145";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_146 = "col_146";
	public static final String $qty_21_p = "qty_21_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_148 = "col_148";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_149 = "col_149";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_150 = "col_150";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_151 = "col_151";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_152 = "col_152";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_153 = "col_153";
	public static final String $qty_22_p = "qty_22_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_155 = "col_155";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_156 = "col_156";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_157 = "col_157";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_158 = "col_158";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_159 = "col_159";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_160 = "col_160";
	public static final String $qty_23_p = "qty_23_p";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_162 = "col_162";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_163 = "col_163";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_164 = "col_164";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $col_165 = "col_165";
	/**
	 * Difference 差.<p>
	 *
	 */
	public static final String $col_166 = "col_166";
	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public static final String $col_167 = "col_167";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $base_qty = $base_qty_p + ".qty";
	public static final String $unit_qty = $unit_qty_p + ".qty";
	public static final String $col_000 = $qty_00_p + ".qty";
	public static final String $col_007 = $qty_01_p + ".qty";
	public static final String $col_014 = $qty_02_p + ".qty";
	public static final String $col_021 = $qty_03_p + ".qty";
	public static final String $col_028 = $qty_04_p + ".qty";
	public static final String $col_035 = $qty_05_p + ".qty";
	public static final String $col_042 = $qty_06_p + ".qty";
	public static final String $col_049 = $qty_07_p + ".qty";
	public static final String $col_056 = $qty_08_p + ".qty";
	public static final String $col_063 = $qty_09_p + ".qty";
	public static final String $col_070 = $qty_10_p + ".qty";
	public static final String $col_077 = $qty_11_p + ".qty";
	public static final String $col_084 = $qty_12_p + ".qty";
	public static final String $col_091 = $qty_13_p + ".qty";
	public static final String $col_098 = $qty_14_p + ".qty";
	public static final String $col_105 = $qty_15_p + ".qty";
	public static final String $col_112 = $qty_16_p + ".qty";
	public static final String $col_119 = $qty_17_p + ".qty";
	public static final String $col_126 = $qty_18_p + ".qty";
	public static final String $col_133 = $qty_19_p + ".qty";
	public static final String $col_140 = $qty_20_p + ".qty";
	public static final String $col_147 = $qty_21_p + ".qty";
	public static final String $col_154 = $qty_22_p + ".qty";
	public static final String $col_161 = $qty_23_p + ".qty";

	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta base_qty_p_META = createInnerRowMeta($base_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta unit_qty_p_META = createInnerRowMeta($unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta qty_00_p_META = createInnerRowMeta($qty_00_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_001_META = createCommonMeta($col_001, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_002_META = createCommonMeta($col_002, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_003_META = createCommonMeta($col_003, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_004_META = createCommonMeta($col_004, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_005_META = createCommonMeta($col_005, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_006_META = createCommonMeta($col_006, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_01_p_META = createInnerRowMeta($qty_01_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_008_META = createCommonMeta($col_008, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_009_META = createCommonMeta($col_009, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_010_META = createCommonMeta($col_010, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_011_META = createCommonMeta($col_011, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_012_META = createCommonMeta($col_012, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_013_META = createCommonMeta($col_013, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_02_p_META = createInnerRowMeta($qty_02_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_015_META = createCommonMeta($col_015, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_016_META = createCommonMeta($col_016, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_017_META = createCommonMeta($col_017, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_018_META = createCommonMeta($col_018, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_019_META = createCommonMeta($col_019, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_020_META = createCommonMeta($col_020, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_03_p_META = createInnerRowMeta($qty_03_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_022_META = createCommonMeta($col_022, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_023_META = createCommonMeta($col_023, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_024_META = createCommonMeta($col_024, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_025_META = createCommonMeta($col_025, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_026_META = createCommonMeta($col_026, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_027_META = createCommonMeta($col_027, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_04_p_META = createInnerRowMeta($qty_04_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_029_META = createCommonMeta($col_029, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_030_META = createCommonMeta($col_030, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_031_META = createCommonMeta($col_031, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_032_META = createCommonMeta($col_032, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_033_META = createCommonMeta($col_033, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_034_META = createCommonMeta($col_034, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_05_p_META = createInnerRowMeta($qty_05_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_036_META = createCommonMeta($col_036, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_037_META = createCommonMeta($col_037, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_038_META = createCommonMeta($col_038, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_039_META = createCommonMeta($col_039, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_040_META = createCommonMeta($col_040, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_041_META = createCommonMeta($col_041, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_06_p_META = createInnerRowMeta($qty_06_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_043_META = createCommonMeta($col_043, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_044_META = createCommonMeta($col_044, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_045_META = createCommonMeta($col_045, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_046_META = createCommonMeta($col_046, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_047_META = createCommonMeta($col_047, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_048_META = createCommonMeta($col_048, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_07_p_META = createInnerRowMeta($qty_07_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_050_META = createCommonMeta($col_050, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_051_META = createCommonMeta($col_051, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_052_META = createCommonMeta($col_052, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_053_META = createCommonMeta($col_053, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_054_META = createCommonMeta($col_054, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_055_META = createCommonMeta($col_055, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_08_p_META = createInnerRowMeta($qty_08_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_057_META = createCommonMeta($col_057, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_058_META = createCommonMeta($col_058, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_059_META = createCommonMeta($col_059, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_060_META = createCommonMeta($col_060, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_061_META = createCommonMeta($col_061, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_062_META = createCommonMeta($col_062, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_09_p_META = createInnerRowMeta($qty_09_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_064_META = createCommonMeta($col_064, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_065_META = createCommonMeta($col_065, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_066_META = createCommonMeta($col_066, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_067_META = createCommonMeta($col_067, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_068_META = createCommonMeta($col_068, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_069_META = createCommonMeta($col_069, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_10_p_META = createInnerRowMeta($qty_10_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_071_META = createCommonMeta($col_071, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_072_META = createCommonMeta($col_072, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_073_META = createCommonMeta($col_073, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_074_META = createCommonMeta($col_074, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_075_META = createCommonMeta($col_075, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_076_META = createCommonMeta($col_076, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_11_p_META = createInnerRowMeta($qty_11_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_078_META = createCommonMeta($col_078, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_079_META = createCommonMeta($col_079, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_080_META = createCommonMeta($col_080, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_081_META = createCommonMeta($col_081, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_082_META = createCommonMeta($col_082, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_083_META = createCommonMeta($col_083, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_12_p_META = createInnerRowMeta($qty_12_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_085_META = createCommonMeta($col_085, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_086_META = createCommonMeta($col_086, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_087_META = createCommonMeta($col_087, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_088_META = createCommonMeta($col_088, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_089_META = createCommonMeta($col_089, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_090_META = createCommonMeta($col_090, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_13_p_META = createInnerRowMeta($qty_13_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_092_META = createCommonMeta($col_092, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_093_META = createCommonMeta($col_093, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_094_META = createCommonMeta($col_094, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_095_META = createCommonMeta($col_095, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_096_META = createCommonMeta($col_096, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_097_META = createCommonMeta($col_097, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_14_p_META = createInnerRowMeta($qty_14_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_099_META = createCommonMeta($col_099, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_100_META = createCommonMeta($col_100, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_101_META = createCommonMeta($col_101, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_102_META = createCommonMeta($col_102, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_103_META = createCommonMeta($col_103, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_104_META = createCommonMeta($col_104, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_15_p_META = createInnerRowMeta($qty_15_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_106_META = createCommonMeta($col_106, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_107_META = createCommonMeta($col_107, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_108_META = createCommonMeta($col_108, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_109_META = createCommonMeta($col_109, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_110_META = createCommonMeta($col_110, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_111_META = createCommonMeta($col_111, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_16_p_META = createInnerRowMeta($qty_16_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_113_META = createCommonMeta($col_113, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_114_META = createCommonMeta($col_114, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_115_META = createCommonMeta($col_115, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_116_META = createCommonMeta($col_116, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_117_META = createCommonMeta($col_117, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_118_META = createCommonMeta($col_118, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_17_p_META = createInnerRowMeta($qty_17_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_120_META = createCommonMeta($col_120, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_121_META = createCommonMeta($col_121, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_122_META = createCommonMeta($col_122, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_123_META = createCommonMeta($col_123, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_124_META = createCommonMeta($col_124, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_125_META = createCommonMeta($col_125, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_18_p_META = createInnerRowMeta($qty_18_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_127_META = createCommonMeta($col_127, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_128_META = createCommonMeta($col_128, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_129_META = createCommonMeta($col_129, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_130_META = createCommonMeta($col_130, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_131_META = createCommonMeta($col_131, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_132_META = createCommonMeta($col_132, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_19_p_META = createInnerRowMeta($qty_19_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_134_META = createCommonMeta($col_134, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_135_META = createCommonMeta($col_135, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_136_META = createCommonMeta($col_136, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_137_META = createCommonMeta($col_137, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_138_META = createCommonMeta($col_138, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_139_META = createCommonMeta($col_139, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_20_p_META = createInnerRowMeta($qty_20_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_141_META = createCommonMeta($col_141, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_142_META = createCommonMeta($col_142, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_143_META = createCommonMeta($col_143, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_144_META = createCommonMeta($col_144, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_145_META = createCommonMeta($col_145, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_146_META = createCommonMeta($col_146, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_21_p_META = createInnerRowMeta($qty_21_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_148_META = createCommonMeta($col_148, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_149_META = createCommonMeta($col_149, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_150_META = createCommonMeta($col_150, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_151_META = createCommonMeta($col_151, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_152_META = createCommonMeta($col_152, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_153_META = createCommonMeta($col_153, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_22_p_META = createInnerRowMeta($qty_22_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_155_META = createCommonMeta($col_155, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_156_META = createCommonMeta($col_156, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_157_META = createCommonMeta($col_157, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_158_META = createCommonMeta($col_158, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_159_META = createCommonMeta($col_159, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_160_META = createCommonMeta($col_160, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta qty_23_p_META = createInnerRowMeta($qty_23_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_162_META = createCommonMeta($col_162, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_163_META = createCommonMeta($col_163, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_164_META = createCommonMeta($col_164, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_165_META = createCommonMeta($col_165, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_166_META = createCommonMeta($col_166, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_167_META = createCommonMeta($col_167, mcframe.commonMA.meta.MA_META.RATE);

	protected static final ConstMetaList<DispRsltR> constMetas = new ConstMetaList<DispRsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_ctg_cd_META,
			calc_ctg_nm_META,
			wg_cd_META,
			wg_nm_META,
			itm_p_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			base_qty_p_META,
			unit_qty_p_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			qty_00_p_META,
			col_001_META,
			col_002_META,
			col_003_META,
			col_004_META,
			col_005_META,
			col_006_META,
			qty_01_p_META,
			col_008_META,
			col_009_META,
			col_010_META,
			col_011_META,
			col_012_META,
			col_013_META,
			qty_02_p_META,
			col_015_META,
			col_016_META,
			col_017_META,
			col_018_META,
			col_019_META,
			col_020_META,
			qty_03_p_META,
			col_022_META,
			col_023_META,
			col_024_META,
			col_025_META,
			col_026_META,
			col_027_META,
			qty_04_p_META,
			col_029_META,
			col_030_META,
			col_031_META,
			col_032_META,
			col_033_META,
			col_034_META,
			qty_05_p_META,
			col_036_META,
			col_037_META,
			col_038_META,
			col_039_META,
			col_040_META,
			col_041_META,
			qty_06_p_META,
			col_043_META,
			col_044_META,
			col_045_META,
			col_046_META,
			col_047_META,
			col_048_META,
			qty_07_p_META,
			col_050_META,
			col_051_META,
			col_052_META,
			col_053_META,
			col_054_META,
			col_055_META,
			qty_08_p_META,
			col_057_META,
			col_058_META,
			col_059_META,
			col_060_META,
			col_061_META,
			col_062_META,
			qty_09_p_META,
			col_064_META,
			col_065_META,
			col_066_META,
			col_067_META,
			col_068_META,
			col_069_META,
			qty_10_p_META,
			col_071_META,
			col_072_META,
			col_073_META,
			col_074_META,
			col_075_META,
			col_076_META,
			qty_11_p_META,
			col_078_META,
			col_079_META,
			col_080_META,
			col_081_META,
			col_082_META,
			col_083_META,
			qty_12_p_META,
			col_085_META,
			col_086_META,
			col_087_META,
			col_088_META,
			col_089_META,
			col_090_META,
			qty_13_p_META,
			col_092_META,
			col_093_META,
			col_094_META,
			col_095_META,
			col_096_META,
			col_097_META,
			qty_14_p_META,
			col_099_META,
			col_100_META,
			col_101_META,
			col_102_META,
			col_103_META,
			col_104_META,
			qty_15_p_META,
			col_106_META,
			col_107_META,
			col_108_META,
			col_109_META,
			col_110_META,
			col_111_META,
			qty_16_p_META,
			col_113_META,
			col_114_META,
			col_115_META,
			col_116_META,
			col_117_META,
			col_118_META,
			qty_17_p_META,
			col_120_META,
			col_121_META,
			col_122_META,
			col_123_META,
			col_124_META,
			col_125_META,
			qty_18_p_META,
			col_127_META,
			col_128_META,
			col_129_META,
			col_130_META,
			col_131_META,
			col_132_META,
			qty_19_p_META,
			col_134_META,
			col_135_META,
			col_136_META,
			col_137_META,
			col_138_META,
			col_139_META,
			qty_20_p_META,
			col_141_META,
			col_142_META,
			col_143_META,
			col_144_META,
			col_145_META,
			col_146_META,
			qty_21_p_META,
			col_148_META,
			col_149_META,
			col_150_META,
			col_151_META,
			col_152_META,
			col_153_META,
			qty_22_p_META,
			col_155_META,
			col_156_META,
			col_157_META,
			col_158_META,
			col_159_META,
			col_160_META,
			qty_23_p_META,
			col_162_META,
			col_163_META,
			col_164_META,
			col_165_META,
			col_166_META,
			col_167_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"base_qty",
				"unit_qty",
				"col_000",
				"col_007",
				"col_014",
				"col_021",
				"col_028",
				"col_035",
				"col_042",
				"col_049",
				"col_056",
				"col_063",
				"col_070",
				"col_077",
				"col_084",
				"col_091",
				"col_098",
				"col_105",
				"col_112",
				"col_119",
				"col_126",
				"col_133",
				"col_140",
				"col_147",
				"col_154",
				"col_161"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$base_qty,
				$unit_qty,
				$col_000,
				$col_007,
				$col_014,
				$col_021,
				$col_028,
				$col_035,
				$col_042,
				$col_049,
				$col_056,
				$col_063,
				$col_070,
				$col_077,
				$col_084,
				$col_091,
				$col_098,
				$col_105,
				$col_112,
				$col_119,
				$col_126,
				$col_133,
				$col_140,
				$col_147,
				$col_154,
				$col_161
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
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[FORMAT]のキー定数 */
	public static final String $$FORMAT = "FORMAT";
	/** 項目属性情報のグループ[HKEY]のキー定数 */
	public static final String $$HKEY = "HKEY";
	/** 項目属性情報のグループ[OTHER]のキー定数 */
	public static final String $$OTHER = "OTHER";
	/** 項目属性情報のグループ[HVAL]のキー定数 */
	public static final String $$HVAL = "HVAL";
	/** 項目属性情報のグループ[ELM]のキー定数 */
	public static final String $$ELM = "ELM";
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
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
				{$col_001, "STD"},	// col_001
				{$col_002, "STD"},	// col_002
				{$col_003, "STD"},	// col_003
				{$col_004, "STD"},	// col_004
				{$col_005, "STD"},	// col_005
				{$col_008, "STD"},	// col_008
				{$col_009, "STD"},	// col_009
				{$col_010, "STD"},	// col_010
				{$col_011, "STD"},	// col_011
				{$col_012, "STD"},	// col_012
				{$col_015, "STD"},	// col_015
				{$col_016, "STD"},	// col_016
				{$col_017, "STD"},	// col_017
				{$col_018, "STD"},	// col_018
				{$col_019, "STD"},	// col_019
				{$col_022, "STD"},	// col_022
				{$col_023, "STD"},	// col_023
				{$col_024, "STD"},	// col_024
				{$col_025, "STD"},	// col_025
				{$col_026, "STD"},	// col_026
				{$col_029, "STD"},	// col_029
				{$col_030, "STD"},	// col_030
				{$col_031, "STD"},	// col_031
				{$col_032, "STD"},	// col_032
				{$col_033, "STD"},	// col_033
				{$col_036, "STD"},	// col_036
				{$col_037, "STD"},	// col_037
				{$col_038, "STD"},	// col_038
				{$col_039, "STD"},	// col_039
				{$col_040, "STD"},	// col_040
				{$col_043, "STD"},	// col_043
				{$col_044, "STD"},	// col_044
				{$col_045, "STD"},	// col_045
				{$col_046, "STD"},	// col_046
				{$col_047, "STD"},	// col_047
				{$col_050, "STD"},	// col_050
				{$col_051, "STD"},	// col_051
				{$col_052, "STD"},	// col_052
				{$col_053, "STD"},	// col_053
				{$col_054, "STD"},	// col_054
				{$col_057, "STD"},	// col_057
				{$col_058, "STD"},	// col_058
				{$col_059, "STD"},	// col_059
				{$col_060, "STD"},	// col_060
				{$col_061, "STD"},	// col_061
				{$col_064, "STD"},	// col_064
				{$col_065, "STD"},	// col_065
				{$col_066, "STD"},	// col_066
				{$col_067, "STD"},	// col_067
				{$col_068, "STD"},	// col_068
				{$col_071, "STD"},	// col_071
				{$col_072, "STD"},	// col_072
				{$col_073, "STD"},	// col_073
				{$col_074, "STD"},	// col_074
				{$col_075, "STD"},	// col_075
				{$col_078, "STD"},	// col_078
				{$col_079, "STD"},	// col_079
				{$col_080, "STD"},	// col_080
				{$col_081, "STD"},	// col_081
				{$col_082, "STD"},	// col_082
				{$col_085, "STD"},	// col_085
				{$col_086, "STD"},	// col_086
				{$col_087, "STD"},	// col_087
				{$col_088, "STD"},	// col_088
				{$col_089, "STD"},	// col_089
				{$col_092, "STD"},	// col_092
				{$col_093, "STD"},	// col_093
				{$col_094, "STD"},	// col_094
				{$col_095, "STD"},	// col_095
				{$col_096, "STD"},	// col_096
				{$col_099, "STD"},	// col_099
				{$col_100, "STD"},	// col_100
				{$col_101, "STD"},	// col_101
				{$col_102, "STD"},	// col_102
				{$col_103, "STD"},	// col_103
				{$col_106, "STD"},	// col_106
				{$col_107, "STD"},	// col_107
				{$col_108, "STD"},	// col_108
				{$col_109, "STD"},	// col_109
				{$col_110, "STD"},	// col_110
				{$col_113, "STD"},	// col_113
				{$col_114, "STD"},	// col_114
				{$col_115, "STD"},	// col_115
				{$col_116, "STD"},	// col_116
				{$col_117, "STD"},	// col_117
				{$col_120, "STD"},	// col_120
				{$col_121, "STD"},	// col_121
				{$col_122, "STD"},	// col_122
				{$col_123, "STD"},	// col_123
				{$col_124, "STD"},	// col_124
				{$col_127, "STD"},	// col_127
				{$col_128, "STD"},	// col_128
				{$col_129, "STD"},	// col_129
				{$col_130, "STD"},	// col_130
				{$col_131, "STD"},	// col_131
				{$col_134, "STD"},	// col_134
				{$col_135, "STD"},	// col_135
				{$col_136, "STD"},	// col_136
				{$col_137, "STD"},	// col_137
				{$col_138, "STD"},	// col_138
				{$col_141, "STD"},	// col_141
				{$col_142, "STD"},	// col_142
				{$col_143, "STD"},	// col_143
				{$col_144, "STD"},	// col_144
				{$col_145, "STD"},	// col_145
				{$col_148, "STD"},	// col_148
				{$col_149, "STD"},	// col_149
				{$col_150, "STD"},	// col_150
				{$col_151, "STD"},	// col_151
				{$col_152, "STD"},	// col_152
				{$col_155, "STD"},	// col_155
				{$col_156, "STD"},	// col_156
				{$col_157, "STD"},	// col_157
				{$col_158, "STD"},	// col_158
				{$col_159, "STD"},	// col_159
				{$col_162, "STD"},	// col_162
				{$col_163, "STD"},	// col_163
				{$col_164, "STD"},	// col_164
				{$col_165, "STD"},	// col_165
				{$col_166, "STD"}	// col_166
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
				{$base_qty_p + ".qty", "disp_base"},	// base_qty_p.qty
				{$unit_qty_p + ".qty", "disp_unit"},	// unit_qty_p.qty
				{$qty_00_p + ".qty", "disp_term_qty"},	// qty_00_p.qty
				{$col_001, "disp_base_not_diff"},	// col_001
				{$col_002, "disp_unit"},	// col_002
				{$col_003, "disp_unit_diff"},	// col_003
				{$col_004, "disp_base_diff"},	// col_004
				{$col_005, "disp_base_diff"},	// col_005
				{$col_006, "disp_diff"},	// col_006
				{$qty_01_p + ".qty", "disp_term_qty"},	// qty_01_p.qty
				{$col_008, "disp_base_not_diff"},	// col_008
				{$col_009, "disp_unit"},	// col_009
				{$col_010, "disp_unit_diff"},	// col_010
				{$col_011, "disp_base_diff"},	// col_011
				{$col_012, "disp_base_diff"},	// col_012
				{$col_013, "disp_diff"},	// col_013
				{$qty_02_p + ".qty", "disp_term_qty"},	// qty_02_p.qty
				{$col_015, "disp_base_not_diff"},	// col_015
				{$col_016, "disp_unit"},	// col_016
				{$col_017, "disp_unit_diff"},	// col_017
				{$col_018, "disp_base_diff"},	// col_018
				{$col_019, "disp_base_diff"},	// col_019
				{$col_020, "disp_diff"},	// col_020
				{$qty_03_p + ".qty", "disp_term_qty"},	// qty_03_p.qty
				{$col_022, "disp_base_not_diff"},	// col_022
				{$col_023, "disp_unit"},	// col_023
				{$col_024, "disp_unit_diff"},	// col_024
				{$col_025, "disp_base_diff"},	// col_025
				{$col_026, "disp_base_diff"},	// col_026
				{$col_027, "disp_diff"},	// col_027
				{$qty_04_p + ".qty", "disp_term_qty"},	// qty_04_p.qty
				{$col_029, "disp_base_not_diff"},	// col_029
				{$col_030, "disp_unit"},	// col_030
				{$col_031, "disp_unit_diff"},	// col_031
				{$col_032, "disp_base_diff"},	// col_032
				{$col_033, "disp_base_diff"},	// col_033
				{$col_034, "disp_diff"},	// col_034
				{$qty_05_p + ".qty", "disp_term_qty"},	// qty_05_p.qty
				{$col_036, "disp_base_not_diff"},	// col_036
				{$col_037, "disp_unit"},	// col_037
				{$col_038, "disp_unit_diff"},	// col_038
				{$col_039, "disp_base_diff"},	// col_039
				{$col_040, "disp_base_diff"},	// col_040
				{$col_041, "disp_diff"},	// col_041
				{$qty_06_p + ".qty", "disp_term_qty"},	// qty_06_p.qty
				{$col_043, "disp_base_not_diff"},	// col_043
				{$col_044, "disp_unit"},	// col_044
				{$col_045, "disp_unit_diff"},	// col_045
				{$col_046, "disp_base_diff"},	// col_046
				{$col_047, "disp_base_diff"},	// col_047
				{$col_048, "disp_diff"},	// col_048
				{$qty_07_p + ".qty", "disp_term_qty"},	// qty_07_p.qty
				{$col_050, "disp_base_not_diff"},	// col_050
				{$col_051, "disp_unit"},	// col_051
				{$col_052, "disp_unit_diff"},	// col_052
				{$col_053, "disp_base_diff"},	// col_053
				{$col_054, "disp_base_diff"},	// col_054
				{$col_055, "disp_diff"},	// col_055
				{$qty_08_p + ".qty", "disp_term_qty"},	// qty_08_p.qty
				{$col_057, "disp_base_not_diff"},	// col_057
				{$col_058, "disp_unit"},	// col_058
				{$col_059, "disp_unit_diff"},	// col_059
				{$col_060, "disp_base_diff"},	// col_060
				{$col_061, "disp_base_diff"},	// col_061
				{$col_062, "disp_diff"},	// col_062
				{$qty_09_p + ".qty", "disp_term_qty"},	// qty_09_p.qty
				{$col_064, "disp_base_not_diff"},	// col_064
				{$col_065, "disp_unit"},	// col_065
				{$col_066, "disp_unit_diff"},	// col_066
				{$col_067, "disp_base_diff"},	// col_067
				{$col_068, "disp_base_diff"},	// col_068
				{$col_069, "disp_diff"},	// col_069
				{$qty_10_p + ".qty", "disp_term_qty"},	// qty_10_p.qty
				{$col_071, "disp_base_not_diff"},	// col_071
				{$col_072, "disp_unit"},	// col_072
				{$col_073, "disp_unit_diff"},	// col_073
				{$col_074, "disp_base_diff"},	// col_074
				{$col_075, "disp_base_diff"},	// col_075
				{$col_076, "disp_diff"},	// col_076
				{$qty_11_p + ".qty", "disp_term_qty"},	// qty_11_p.qty
				{$col_078, "disp_base_not_diff"},	// col_078
				{$col_079, "disp_unit"},	// col_079
				{$col_080, "disp_unit_diff"},	// col_080
				{$col_081, "disp_base_diff"},	// col_081
				{$col_082, "disp_base_diff"},	// col_082
				{$col_083, "disp_diff"},	// col_083
				{$qty_12_p + ".qty", "disp_term_qty"},	// qty_12_p.qty
				{$col_085, "disp_base_not_diff"},	// col_085
				{$col_086, "disp_unit"},	// col_086
				{$col_087, "disp_unit_diff"},	// col_087
				{$col_088, "disp_base_diff"},	// col_088
				{$col_089, "disp_base_diff"},	// col_089
				{$col_090, "disp_diff"},	// col_090
				{$qty_13_p + ".qty", "disp_term_qty"},	// qty_13_p.qty
				{$col_092, "disp_base_not_diff"},	// col_092
				{$col_093, "disp_unit"},	// col_093
				{$col_094, "disp_unit_diff"},	// col_094
				{$col_095, "disp_base_diff"},	// col_095
				{$col_096, "disp_base_diff"},	// col_096
				{$col_097, "disp_diff"},	// col_097
				{$qty_14_p + ".qty", "disp_term_qty"},	// qty_14_p.qty
				{$col_099, "disp_base_not_diff"},	// col_099
				{$col_100, "disp_unit"},	// col_100
				{$col_101, "disp_unit_diff"},	// col_101
				{$col_102, "disp_base_diff"},	// col_102
				{$col_103, "disp_base_diff"},	// col_103
				{$col_104, "disp_diff"},	// col_104
				{$qty_15_p + ".qty", "disp_term_qty"},	// qty_15_p.qty
				{$col_106, "disp_base_not_diff"},	// col_106
				{$col_107, "disp_unit"},	// col_107
				{$col_108, "disp_unit_diff"},	// col_108
				{$col_109, "disp_base_diff"},	// col_109
				{$col_110, "disp_base_diff"},	// col_110
				{$col_111, "disp_diff"},	// col_111
				{$qty_16_p + ".qty", "disp_term_qty"},	// qty_16_p.qty
				{$col_113, "disp_base_not_diff"},	// col_113
				{$col_114, "disp_unit"},	// col_114
				{$col_115, "disp_unit_diff"},	// col_115
				{$col_116, "disp_base_diff"},	// col_116
				{$col_117, "disp_base_diff"},	// col_117
				{$col_118, "disp_diff"},	// col_118
				{$qty_17_p + ".qty", "disp_term_qty"},	// qty_17_p.qty
				{$col_120, "disp_base_not_diff"},	// col_120
				{$col_121, "disp_unit"},	// col_121
				{$col_122, "disp_unit_diff"},	// col_122
				{$col_123, "disp_base_diff"},	// col_123
				{$col_124, "disp_base_diff"},	// col_124
				{$col_125, "disp_diff"},	// col_125
				{$qty_18_p + ".qty", "disp_term_qty"},	// qty_18_p.qty
				{$col_127, "disp_base_not_diff"},	// col_127
				{$col_128, "disp_unit"},	// col_128
				{$col_129, "disp_unit_diff"},	// col_129
				{$col_130, "disp_base_diff"},	// col_130
				{$col_131, "disp_base_diff"},	// col_131
				{$col_132, "disp_diff"},	// col_132
				{$qty_19_p + ".qty", "disp_term_qty"},	// qty_19_p.qty
				{$col_134, "disp_base_not_diff"},	// col_134
				{$col_135, "disp_unit"},	// col_135
				{$col_136, "disp_unit_diff"},	// col_136
				{$col_137, "disp_base_diff"},	// col_137
				{$col_138, "disp_base_diff"},	// col_138
				{$col_139, "disp_diff"},	// col_139
				{$qty_20_p + ".qty", "disp_term_qty"},	// qty_20_p.qty
				{$col_141, "disp_base_not_diff"},	// col_141
				{$col_142, "disp_unit"},	// col_142
				{$col_143, "disp_unit_diff"},	// col_143
				{$col_144, "disp_base_diff"},	// col_144
				{$col_145, "disp_base_diff"},	// col_145
				{$col_146, "disp_diff"},	// col_146
				{$qty_21_p + ".qty", "disp_term_qty"},	// qty_21_p.qty
				{$col_148, "disp_base_not_diff"},	// col_148
				{$col_149, "disp_unit"},	// col_149
				{$col_150, "disp_unit_diff"},	// col_150
				{$col_151, "disp_base_diff"},	// col_151
				{$col_152, "disp_base_diff"},	// col_152
				{$col_153, "disp_diff"},	// col_153
				{$qty_22_p + ".qty", "disp_term_qty"},	// qty_22_p.qty
				{$col_155, "disp_base_not_diff"},	// col_155
				{$col_156, "disp_unit"},	// col_156
				{$col_157, "disp_unit_diff"},	// col_157
				{$col_158, "disp_base_diff"},	// col_158
				{$col_159, "disp_base_diff"},	// col_159
				{$col_160, "disp_diff"},	// col_160
				{$qty_23_p + ".qty", "disp_term_qty"},	// qty_23_p.qty
				{$col_162, "disp_base_not_diff"},	// col_162
				{$col_163, "disp_unit"},	// col_163
				{$col_164, "disp_unit_diff"},	// col_164
				{$col_165, "disp_base_diff"},	// col_165
				{$col_166, "disp_base_diff"},	// col_166
				{$col_167, "disp_diff"}	// col_167
			}
		)),
		new MCExtMap.Entry($$FORMAT, new MCExtList(
			new String[][]{
				{$col_006, "PERCENT"},	// col_006
				{$col_013, "PERCENT"},	// col_013
				{$col_020, "PERCENT"},	// col_020
				{$col_027, "PERCENT"},	// col_027
				{$col_034, "PERCENT"},	// col_034
				{$col_041, "PERCENT"},	// col_041
				{$col_048, "PERCENT"},	// col_048
				{$col_055, "PERCENT"},	// col_055
				{$col_062, "PERCENT"},	// col_062
				{$col_069, "PERCENT"},	// col_069
				{$col_076, "PERCENT"},	// col_076
				{$col_083, "PERCENT"},	// col_083
				{$col_090, "PERCENT"},	// col_090
				{$col_097, "PERCENT"},	// col_097
				{$col_104, "PERCENT"},	// col_104
				{$col_111, "PERCENT"},	// col_111
				{$col_118, "PERCENT"},	// col_118
				{$col_125, "PERCENT"},	// col_125
				{$col_132, "PERCENT"},	// col_132
				{$col_139, "PERCENT"},	// col_139
				{$col_146, "PERCENT"},	// col_146
				{$col_153, "PERCENT"},	// col_153
				{$col_160, "PERCENT"},	// col_160
				{$col_167, "PERCENT"}	// col_167
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
				{$qty_00_p + ".qty", "Key"},	// qty_00_p.qty
				{$col_001, "Key"},	// col_001
				{$col_002, "Key"},	// col_002
				{$col_003, "Key"},	// col_003
				{$col_004, "Key"},	// col_004
				{$col_005, "Key"},	// col_005
				{$col_006, "Key"},	// col_006
				{$qty_01_p + ".qty", "Key"},	// qty_01_p.qty
				{$col_008, "Key"},	// col_008
				{$col_009, "Key"},	// col_009
				{$col_010, "Key"},	// col_010
				{$col_011, "Key"},	// col_011
				{$col_012, "Key"},	// col_012
				{$col_013, "Key"},	// col_013
				{$qty_02_p + ".qty", "Key"},	// qty_02_p.qty
				{$col_015, "Key"},	// col_015
				{$col_016, "Key"},	// col_016
				{$col_017, "Key"},	// col_017
				{$col_018, "Key"},	// col_018
				{$col_019, "Key"},	// col_019
				{$col_020, "Key"},	// col_020
				{$qty_03_p + ".qty", "Key"},	// qty_03_p.qty
				{$col_022, "Key"},	// col_022
				{$col_023, "Key"},	// col_023
				{$col_024, "Key"},	// col_024
				{$col_025, "Key"},	// col_025
				{$col_026, "Key"},	// col_026
				{$col_027, "Key"},	// col_027
				{$qty_04_p + ".qty", "Key"},	// qty_04_p.qty
				{$col_029, "Key"},	// col_029
				{$col_030, "Key"},	// col_030
				{$col_031, "Key"},	// col_031
				{$col_032, "Key"},	// col_032
				{$col_033, "Key"},	// col_033
				{$col_034, "Key"},	// col_034
				{$qty_05_p + ".qty", "Key"},	// qty_05_p.qty
				{$col_036, "Key"},	// col_036
				{$col_037, "Key"},	// col_037
				{$col_038, "Key"},	// col_038
				{$col_039, "Key"},	// col_039
				{$col_040, "Key"},	// col_040
				{$col_041, "Key"},	// col_041
				{$qty_06_p + ".qty", "Key"},	// qty_06_p.qty
				{$col_043, "Key"},	// col_043
				{$col_044, "Key"},	// col_044
				{$col_045, "Key"},	// col_045
				{$col_046, "Key"},	// col_046
				{$col_047, "Key"},	// col_047
				{$col_048, "Key"},	// col_048
				{$qty_07_p + ".qty", "Key"},	// qty_07_p.qty
				{$col_050, "Key"},	// col_050
				{$col_051, "Key"},	// col_051
				{$col_052, "Key"},	// col_052
				{$col_053, "Key"},	// col_053
				{$col_054, "Key"},	// col_054
				{$col_055, "Key"},	// col_055
				{$qty_08_p + ".qty", "Key"},	// qty_08_p.qty
				{$col_057, "Key"},	// col_057
				{$col_058, "Key"},	// col_058
				{$col_059, "Key"},	// col_059
				{$col_060, "Key"},	// col_060
				{$col_061, "Key"},	// col_061
				{$col_062, "Key"},	// col_062
				{$qty_09_p + ".qty", "Key"},	// qty_09_p.qty
				{$col_064, "Key"},	// col_064
				{$col_065, "Key"},	// col_065
				{$col_066, "Key"},	// col_066
				{$col_067, "Key"},	// col_067
				{$col_068, "Key"},	// col_068
				{$col_069, "Key"},	// col_069
				{$qty_10_p + ".qty", "Key"},	// qty_10_p.qty
				{$col_071, "Key"},	// col_071
				{$col_072, "Key"},	// col_072
				{$col_073, "Key"},	// col_073
				{$col_074, "Key"},	// col_074
				{$col_075, "Key"},	// col_075
				{$col_076, "Key"},	// col_076
				{$qty_11_p + ".qty", "Key"},	// qty_11_p.qty
				{$col_078, "Key"},	// col_078
				{$col_079, "Key"},	// col_079
				{$col_080, "Key"},	// col_080
				{$col_081, "Key"},	// col_081
				{$col_082, "Key"},	// col_082
				{$col_083, "Key"},	// col_083
				{$qty_12_p + ".qty", "Key"},	// qty_12_p.qty
				{$col_085, "Key"},	// col_085
				{$col_086, "Key"},	// col_086
				{$col_087, "Key"},	// col_087
				{$col_088, "Key"},	// col_088
				{$col_089, "Key"},	// col_089
				{$col_090, "Key"},	// col_090
				{$qty_13_p + ".qty", "Key"},	// qty_13_p.qty
				{$col_092, "Key"},	// col_092
				{$col_093, "Key"},	// col_093
				{$col_094, "Key"},	// col_094
				{$col_095, "Key"},	// col_095
				{$col_096, "Key"},	// col_096
				{$col_097, "Key"},	// col_097
				{$qty_14_p + ".qty", "Key"},	// qty_14_p.qty
				{$col_099, "Key"},	// col_099
				{$col_100, "Key"},	// col_100
				{$col_101, "Key"},	// col_101
				{$col_102, "Key"},	// col_102
				{$col_103, "Key"},	// col_103
				{$col_104, "Key"},	// col_104
				{$qty_15_p + ".qty", "Key"},	// qty_15_p.qty
				{$col_106, "Key"},	// col_106
				{$col_107, "Key"},	// col_107
				{$col_108, "Key"},	// col_108
				{$col_109, "Key"},	// col_109
				{$col_110, "Key"},	// col_110
				{$col_111, "Key"},	// col_111
				{$qty_16_p + ".qty", "Key"},	// qty_16_p.qty
				{$col_113, "Key"},	// col_113
				{$col_114, "Key"},	// col_114
				{$col_115, "Key"},	// col_115
				{$col_116, "Key"},	// col_116
				{$col_117, "Key"},	// col_117
				{$col_118, "Key"},	// col_118
				{$qty_17_p + ".qty", "Key"},	// qty_17_p.qty
				{$col_120, "Key"},	// col_120
				{$col_121, "Key"},	// col_121
				{$col_122, "Key"},	// col_122
				{$col_123, "Key"},	// col_123
				{$col_124, "Key"},	// col_124
				{$col_125, "Key"},	// col_125
				{$qty_18_p + ".qty", "Key"},	// qty_18_p.qty
				{$col_127, "Key"},	// col_127
				{$col_128, "Key"},	// col_128
				{$col_129, "Key"},	// col_129
				{$col_130, "Key"},	// col_130
				{$col_131, "Key"},	// col_131
				{$col_132, "Key"},	// col_132
				{$qty_19_p + ".qty", "Key"},	// qty_19_p.qty
				{$col_134, "Key"},	// col_134
				{$col_135, "Key"},	// col_135
				{$col_136, "Key"},	// col_136
				{$col_137, "Key"},	// col_137
				{$col_138, "Key"},	// col_138
				{$col_139, "Key"},	// col_139
				{$qty_20_p + ".qty", "Key"},	// qty_20_p.qty
				{$col_141, "Key"},	// col_141
				{$col_142, "Key"},	// col_142
				{$col_143, "Key"},	// col_143
				{$col_144, "Key"},	// col_144
				{$col_145, "Key"},	// col_145
				{$col_146, "Key"},	// col_146
				{$qty_21_p + ".qty", "Key"},	// qty_21_p.qty
				{$col_148, "Key"},	// col_148
				{$col_149, "Key"},	// col_149
				{$col_150, "Key"},	// col_150
				{$col_151, "Key"},	// col_151
				{$col_152, "Key"},	// col_152
				{$col_153, "Key"},	// col_153
				{$qty_22_p + ".qty", "Key"},	// qty_22_p.qty
				{$col_155, "Key"},	// col_155
				{$col_156, "Key"},	// col_156
				{$col_157, "Key"},	// col_157
				{$col_158, "Key"},	// col_158
				{$col_159, "Key"},	// col_159
				{$col_160, "Key"},	// col_160
				{$qty_23_p + ".qty", "Key"},	// qty_23_p.qty
				{$col_162, "Key"},	// col_162
				{$col_163, "Key"},	// col_163
				{$col_164, "Key"},	// col_164
				{$col_165, "Key"},	// col_165
				{$col_166, "Key"},	// col_166
				{$col_167, "Key"}	// col_167
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
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 0, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 0, $calc_ctg_cd, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 1, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 1, $calc_ctg_nm, value);
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


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 4, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 4, $itm_p, row);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 5, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 5, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 6, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 6, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 7, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 7, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 8, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 8, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 9, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 9, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 10, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 10, $itm_jnl_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 11, $base_qty_p);
	}
	
	public void base_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 11, $base_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 12, $unit_qty_p);
	}
	
	public void unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 12, $unit_qty_p, row);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 13, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 13, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 14, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 14, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 15, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 15, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 15, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 15, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 15, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 15, $dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_00_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 16, $qty_00_p);
	}
	
	public void qty_00_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 16, $qty_00_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_001() {
		return getConstNumber(offset + 17, $col_001);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_001(MCNumber value) {
		setConstNumber(offset + 17, $col_001, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_001(int value) {
		setConstNumber(offset + 17, $col_001, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_001(long value) {
		setConstNumber(offset + 17, $col_001, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_001(float value) {
		setConstNumber(offset + 17, $col_001, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_001(double value) {
		setConstNumber(offset + 17, $col_001, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_002() {
		return getConstNumber(offset + 18, $col_002);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_002(MCNumber value) {
		setConstNumber(offset + 18, $col_002, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_002(int value) {
		setConstNumber(offset + 18, $col_002, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_002(long value) {
		setConstNumber(offset + 18, $col_002, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_002(float value) {
		setConstNumber(offset + 18, $col_002, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_002(double value) {
		setConstNumber(offset + 18, $col_002, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_003() {
		return getConstNumber(offset + 19, $col_003);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_003(MCNumber value) {
		setConstNumber(offset + 19, $col_003, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_003(int value) {
		setConstNumber(offset + 19, $col_003, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_003(long value) {
		setConstNumber(offset + 19, $col_003, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_003(float value) {
		setConstNumber(offset + 19, $col_003, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_003(double value) {
		setConstNumber(offset + 19, $col_003, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_004() {
		return getConstNumber(offset + 20, $col_004);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_004(MCNumber value) {
		setConstNumber(offset + 20, $col_004, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_004(int value) {
		setConstNumber(offset + 20, $col_004, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_004(long value) {
		setConstNumber(offset + 20, $col_004, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_004(float value) {
		setConstNumber(offset + 20, $col_004, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_004(double value) {
		setConstNumber(offset + 20, $col_004, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_005() {
		return getConstNumber(offset + 21, $col_005);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_005(MCNumber value) {
		setConstNumber(offset + 21, $col_005, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_005(int value) {
		setConstNumber(offset + 21, $col_005, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_005(long value) {
		setConstNumber(offset + 21, $col_005, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_005(float value) {
		setConstNumber(offset + 21, $col_005, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_005(double value) {
		setConstNumber(offset + 21, $col_005, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_006() {
		return getConstNumber(offset + 22, $col_006);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_006(MCNumber value) {
		setConstNumber(offset + 22, $col_006, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_006(int value) {
		setConstNumber(offset + 22, $col_006, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_006(long value) {
		setConstNumber(offset + 22, $col_006, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_006(float value) {
		setConstNumber(offset + 22, $col_006, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_006(double value) {
		setConstNumber(offset + 22, $col_006, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_01_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 23, $qty_01_p);
	}
	
	public void qty_01_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 23, $qty_01_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_008() {
		return getConstNumber(offset + 24, $col_008);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_008(MCNumber value) {
		setConstNumber(offset + 24, $col_008, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_008(int value) {
		setConstNumber(offset + 24, $col_008, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_008(long value) {
		setConstNumber(offset + 24, $col_008, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_008(float value) {
		setConstNumber(offset + 24, $col_008, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_008(double value) {
		setConstNumber(offset + 24, $col_008, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_009() {
		return getConstNumber(offset + 25, $col_009);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_009(MCNumber value) {
		setConstNumber(offset + 25, $col_009, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_009(int value) {
		setConstNumber(offset + 25, $col_009, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_009(long value) {
		setConstNumber(offset + 25, $col_009, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_009(float value) {
		setConstNumber(offset + 25, $col_009, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_009(double value) {
		setConstNumber(offset + 25, $col_009, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_010() {
		return getConstNumber(offset + 26, $col_010);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_010(MCNumber value) {
		setConstNumber(offset + 26, $col_010, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_010(int value) {
		setConstNumber(offset + 26, $col_010, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_010(long value) {
		setConstNumber(offset + 26, $col_010, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_010(float value) {
		setConstNumber(offset + 26, $col_010, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_010(double value) {
		setConstNumber(offset + 26, $col_010, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_011() {
		return getConstNumber(offset + 27, $col_011);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_011(MCNumber value) {
		setConstNumber(offset + 27, $col_011, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_011(int value) {
		setConstNumber(offset + 27, $col_011, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_011(long value) {
		setConstNumber(offset + 27, $col_011, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_011(float value) {
		setConstNumber(offset + 27, $col_011, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_011(double value) {
		setConstNumber(offset + 27, $col_011, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_012() {
		return getConstNumber(offset + 28, $col_012);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_012(MCNumber value) {
		setConstNumber(offset + 28, $col_012, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_012(int value) {
		setConstNumber(offset + 28, $col_012, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_012(long value) {
		setConstNumber(offset + 28, $col_012, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_012(float value) {
		setConstNumber(offset + 28, $col_012, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_012(double value) {
		setConstNumber(offset + 28, $col_012, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_013() {
		return getConstNumber(offset + 29, $col_013);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_013(MCNumber value) {
		setConstNumber(offset + 29, $col_013, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_013(int value) {
		setConstNumber(offset + 29, $col_013, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_013(long value) {
		setConstNumber(offset + 29, $col_013, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_013(float value) {
		setConstNumber(offset + 29, $col_013, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_013(double value) {
		setConstNumber(offset + 29, $col_013, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_02_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 30, $qty_02_p);
	}
	
	public void qty_02_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 30, $qty_02_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_015() {
		return getConstNumber(offset + 31, $col_015);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_015(MCNumber value) {
		setConstNumber(offset + 31, $col_015, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_015(int value) {
		setConstNumber(offset + 31, $col_015, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_015(long value) {
		setConstNumber(offset + 31, $col_015, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_015(float value) {
		setConstNumber(offset + 31, $col_015, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_015(double value) {
		setConstNumber(offset + 31, $col_015, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_016() {
		return getConstNumber(offset + 32, $col_016);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_016(MCNumber value) {
		setConstNumber(offset + 32, $col_016, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_016(int value) {
		setConstNumber(offset + 32, $col_016, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_016(long value) {
		setConstNumber(offset + 32, $col_016, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_016(float value) {
		setConstNumber(offset + 32, $col_016, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_016(double value) {
		setConstNumber(offset + 32, $col_016, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_017() {
		return getConstNumber(offset + 33, $col_017);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_017(MCNumber value) {
		setConstNumber(offset + 33, $col_017, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_017(int value) {
		setConstNumber(offset + 33, $col_017, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_017(long value) {
		setConstNumber(offset + 33, $col_017, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_017(float value) {
		setConstNumber(offset + 33, $col_017, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_017(double value) {
		setConstNumber(offset + 33, $col_017, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_018() {
		return getConstNumber(offset + 34, $col_018);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_018(MCNumber value) {
		setConstNumber(offset + 34, $col_018, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_018(int value) {
		setConstNumber(offset + 34, $col_018, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_018(long value) {
		setConstNumber(offset + 34, $col_018, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_018(float value) {
		setConstNumber(offset + 34, $col_018, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_018(double value) {
		setConstNumber(offset + 34, $col_018, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_019() {
		return getConstNumber(offset + 35, $col_019);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_019(MCNumber value) {
		setConstNumber(offset + 35, $col_019, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_019(int value) {
		setConstNumber(offset + 35, $col_019, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_019(long value) {
		setConstNumber(offset + 35, $col_019, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_019(float value) {
		setConstNumber(offset + 35, $col_019, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_019(double value) {
		setConstNumber(offset + 35, $col_019, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_020() {
		return getConstNumber(offset + 36, $col_020);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_020(MCNumber value) {
		setConstNumber(offset + 36, $col_020, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_020(int value) {
		setConstNumber(offset + 36, $col_020, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_020(long value) {
		setConstNumber(offset + 36, $col_020, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_020(float value) {
		setConstNumber(offset + 36, $col_020, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_020(double value) {
		setConstNumber(offset + 36, $col_020, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_03_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 37, $qty_03_p);
	}
	
	public void qty_03_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 37, $qty_03_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_022() {
		return getConstNumber(offset + 38, $col_022);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_022(MCNumber value) {
		setConstNumber(offset + 38, $col_022, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_022(int value) {
		setConstNumber(offset + 38, $col_022, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_022(long value) {
		setConstNumber(offset + 38, $col_022, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_022(float value) {
		setConstNumber(offset + 38, $col_022, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_022(double value) {
		setConstNumber(offset + 38, $col_022, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_023() {
		return getConstNumber(offset + 39, $col_023);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_023(MCNumber value) {
		setConstNumber(offset + 39, $col_023, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_023(int value) {
		setConstNumber(offset + 39, $col_023, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_023(long value) {
		setConstNumber(offset + 39, $col_023, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_023(float value) {
		setConstNumber(offset + 39, $col_023, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_023(double value) {
		setConstNumber(offset + 39, $col_023, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_024() {
		return getConstNumber(offset + 40, $col_024);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_024(MCNumber value) {
		setConstNumber(offset + 40, $col_024, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_024(int value) {
		setConstNumber(offset + 40, $col_024, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_024(long value) {
		setConstNumber(offset + 40, $col_024, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_024(float value) {
		setConstNumber(offset + 40, $col_024, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_024(double value) {
		setConstNumber(offset + 40, $col_024, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_025() {
		return getConstNumber(offset + 41, $col_025);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_025(MCNumber value) {
		setConstNumber(offset + 41, $col_025, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_025(int value) {
		setConstNumber(offset + 41, $col_025, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_025(long value) {
		setConstNumber(offset + 41, $col_025, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_025(float value) {
		setConstNumber(offset + 41, $col_025, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_025(double value) {
		setConstNumber(offset + 41, $col_025, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_026() {
		return getConstNumber(offset + 42, $col_026);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_026(MCNumber value) {
		setConstNumber(offset + 42, $col_026, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_026(int value) {
		setConstNumber(offset + 42, $col_026, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_026(long value) {
		setConstNumber(offset + 42, $col_026, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_026(float value) {
		setConstNumber(offset + 42, $col_026, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_026(double value) {
		setConstNumber(offset + 42, $col_026, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_027() {
		return getConstNumber(offset + 43, $col_027);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_027(MCNumber value) {
		setConstNumber(offset + 43, $col_027, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_027(int value) {
		setConstNumber(offset + 43, $col_027, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_027(long value) {
		setConstNumber(offset + 43, $col_027, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_027(float value) {
		setConstNumber(offset + 43, $col_027, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_027(double value) {
		setConstNumber(offset + 43, $col_027, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_04_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 44, $qty_04_p);
	}
	
	public void qty_04_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 44, $qty_04_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_029() {
		return getConstNumber(offset + 45, $col_029);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_029(MCNumber value) {
		setConstNumber(offset + 45, $col_029, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_029(int value) {
		setConstNumber(offset + 45, $col_029, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_029(long value) {
		setConstNumber(offset + 45, $col_029, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_029(float value) {
		setConstNumber(offset + 45, $col_029, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_029(double value) {
		setConstNumber(offset + 45, $col_029, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_030() {
		return getConstNumber(offset + 46, $col_030);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_030(MCNumber value) {
		setConstNumber(offset + 46, $col_030, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_030(int value) {
		setConstNumber(offset + 46, $col_030, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_030(long value) {
		setConstNumber(offset + 46, $col_030, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_030(float value) {
		setConstNumber(offset + 46, $col_030, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_030(double value) {
		setConstNumber(offset + 46, $col_030, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_031() {
		return getConstNumber(offset + 47, $col_031);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_031(MCNumber value) {
		setConstNumber(offset + 47, $col_031, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_031(int value) {
		setConstNumber(offset + 47, $col_031, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_031(long value) {
		setConstNumber(offset + 47, $col_031, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_031(float value) {
		setConstNumber(offset + 47, $col_031, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_031(double value) {
		setConstNumber(offset + 47, $col_031, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_032() {
		return getConstNumber(offset + 48, $col_032);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_032(MCNumber value) {
		setConstNumber(offset + 48, $col_032, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_032(int value) {
		setConstNumber(offset + 48, $col_032, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_032(long value) {
		setConstNumber(offset + 48, $col_032, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_032(float value) {
		setConstNumber(offset + 48, $col_032, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_032(double value) {
		setConstNumber(offset + 48, $col_032, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_033() {
		return getConstNumber(offset + 49, $col_033);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_033(MCNumber value) {
		setConstNumber(offset + 49, $col_033, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_033(int value) {
		setConstNumber(offset + 49, $col_033, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_033(long value) {
		setConstNumber(offset + 49, $col_033, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_033(float value) {
		setConstNumber(offset + 49, $col_033, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_033(double value) {
		setConstNumber(offset + 49, $col_033, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_034() {
		return getConstNumber(offset + 50, $col_034);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_034(MCNumber value) {
		setConstNumber(offset + 50, $col_034, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_034(int value) {
		setConstNumber(offset + 50, $col_034, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_034(long value) {
		setConstNumber(offset + 50, $col_034, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_034(float value) {
		setConstNumber(offset + 50, $col_034, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_034(double value) {
		setConstNumber(offset + 50, $col_034, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_05_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 51, $qty_05_p);
	}
	
	public void qty_05_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 51, $qty_05_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_036() {
		return getConstNumber(offset + 52, $col_036);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_036(MCNumber value) {
		setConstNumber(offset + 52, $col_036, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_036(int value) {
		setConstNumber(offset + 52, $col_036, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_036(long value) {
		setConstNumber(offset + 52, $col_036, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_036(float value) {
		setConstNumber(offset + 52, $col_036, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_036(double value) {
		setConstNumber(offset + 52, $col_036, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_037() {
		return getConstNumber(offset + 53, $col_037);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_037(MCNumber value) {
		setConstNumber(offset + 53, $col_037, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_037(int value) {
		setConstNumber(offset + 53, $col_037, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_037(long value) {
		setConstNumber(offset + 53, $col_037, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_037(float value) {
		setConstNumber(offset + 53, $col_037, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_037(double value) {
		setConstNumber(offset + 53, $col_037, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_038() {
		return getConstNumber(offset + 54, $col_038);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_038(MCNumber value) {
		setConstNumber(offset + 54, $col_038, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_038(int value) {
		setConstNumber(offset + 54, $col_038, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_038(long value) {
		setConstNumber(offset + 54, $col_038, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_038(float value) {
		setConstNumber(offset + 54, $col_038, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_038(double value) {
		setConstNumber(offset + 54, $col_038, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_039() {
		return getConstNumber(offset + 55, $col_039);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_039(MCNumber value) {
		setConstNumber(offset + 55, $col_039, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_039(int value) {
		setConstNumber(offset + 55, $col_039, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_039(long value) {
		setConstNumber(offset + 55, $col_039, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_039(float value) {
		setConstNumber(offset + 55, $col_039, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_039(double value) {
		setConstNumber(offset + 55, $col_039, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_040() {
		return getConstNumber(offset + 56, $col_040);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_040(MCNumber value) {
		setConstNumber(offset + 56, $col_040, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_040(int value) {
		setConstNumber(offset + 56, $col_040, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_040(long value) {
		setConstNumber(offset + 56, $col_040, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_040(float value) {
		setConstNumber(offset + 56, $col_040, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_040(double value) {
		setConstNumber(offset + 56, $col_040, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_041() {
		return getConstNumber(offset + 57, $col_041);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_041(MCNumber value) {
		setConstNumber(offset + 57, $col_041, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_041(int value) {
		setConstNumber(offset + 57, $col_041, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_041(long value) {
		setConstNumber(offset + 57, $col_041, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_041(float value) {
		setConstNumber(offset + 57, $col_041, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_041(double value) {
		setConstNumber(offset + 57, $col_041, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_06_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 58, $qty_06_p);
	}
	
	public void qty_06_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 58, $qty_06_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_043() {
		return getConstNumber(offset + 59, $col_043);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_043(MCNumber value) {
		setConstNumber(offset + 59, $col_043, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_043(int value) {
		setConstNumber(offset + 59, $col_043, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_043(long value) {
		setConstNumber(offset + 59, $col_043, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_043(float value) {
		setConstNumber(offset + 59, $col_043, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_043(double value) {
		setConstNumber(offset + 59, $col_043, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_044() {
		return getConstNumber(offset + 60, $col_044);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_044(MCNumber value) {
		setConstNumber(offset + 60, $col_044, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_044(int value) {
		setConstNumber(offset + 60, $col_044, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_044(long value) {
		setConstNumber(offset + 60, $col_044, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_044(float value) {
		setConstNumber(offset + 60, $col_044, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_044(double value) {
		setConstNumber(offset + 60, $col_044, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_045() {
		return getConstNumber(offset + 61, $col_045);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_045(MCNumber value) {
		setConstNumber(offset + 61, $col_045, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_045(int value) {
		setConstNumber(offset + 61, $col_045, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_045(long value) {
		setConstNumber(offset + 61, $col_045, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_045(float value) {
		setConstNumber(offset + 61, $col_045, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_045(double value) {
		setConstNumber(offset + 61, $col_045, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_046() {
		return getConstNumber(offset + 62, $col_046);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_046(MCNumber value) {
		setConstNumber(offset + 62, $col_046, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_046(int value) {
		setConstNumber(offset + 62, $col_046, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_046(long value) {
		setConstNumber(offset + 62, $col_046, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_046(float value) {
		setConstNumber(offset + 62, $col_046, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_046(double value) {
		setConstNumber(offset + 62, $col_046, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_047() {
		return getConstNumber(offset + 63, $col_047);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_047(MCNumber value) {
		setConstNumber(offset + 63, $col_047, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_047(int value) {
		setConstNumber(offset + 63, $col_047, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_047(long value) {
		setConstNumber(offset + 63, $col_047, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_047(float value) {
		setConstNumber(offset + 63, $col_047, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_047(double value) {
		setConstNumber(offset + 63, $col_047, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_048() {
		return getConstNumber(offset + 64, $col_048);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_048(MCNumber value) {
		setConstNumber(offset + 64, $col_048, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_048(int value) {
		setConstNumber(offset + 64, $col_048, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_048(long value) {
		setConstNumber(offset + 64, $col_048, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_048(float value) {
		setConstNumber(offset + 64, $col_048, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_048(double value) {
		setConstNumber(offset + 64, $col_048, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_07_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 65, $qty_07_p);
	}
	
	public void qty_07_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 65, $qty_07_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_050() {
		return getConstNumber(offset + 66, $col_050);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_050(MCNumber value) {
		setConstNumber(offset + 66, $col_050, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_050(int value) {
		setConstNumber(offset + 66, $col_050, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_050(long value) {
		setConstNumber(offset + 66, $col_050, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_050(float value) {
		setConstNumber(offset + 66, $col_050, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_050(double value) {
		setConstNumber(offset + 66, $col_050, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_051() {
		return getConstNumber(offset + 67, $col_051);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_051(MCNumber value) {
		setConstNumber(offset + 67, $col_051, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_051(int value) {
		setConstNumber(offset + 67, $col_051, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_051(long value) {
		setConstNumber(offset + 67, $col_051, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_051(float value) {
		setConstNumber(offset + 67, $col_051, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_051(double value) {
		setConstNumber(offset + 67, $col_051, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_052() {
		return getConstNumber(offset + 68, $col_052);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_052(MCNumber value) {
		setConstNumber(offset + 68, $col_052, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_052(int value) {
		setConstNumber(offset + 68, $col_052, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_052(long value) {
		setConstNumber(offset + 68, $col_052, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_052(float value) {
		setConstNumber(offset + 68, $col_052, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_052(double value) {
		setConstNumber(offset + 68, $col_052, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_053() {
		return getConstNumber(offset + 69, $col_053);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_053(MCNumber value) {
		setConstNumber(offset + 69, $col_053, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_053(int value) {
		setConstNumber(offset + 69, $col_053, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_053(long value) {
		setConstNumber(offset + 69, $col_053, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_053(float value) {
		setConstNumber(offset + 69, $col_053, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_053(double value) {
		setConstNumber(offset + 69, $col_053, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_054() {
		return getConstNumber(offset + 70, $col_054);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_054(MCNumber value) {
		setConstNumber(offset + 70, $col_054, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_054(int value) {
		setConstNumber(offset + 70, $col_054, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_054(long value) {
		setConstNumber(offset + 70, $col_054, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_054(float value) {
		setConstNumber(offset + 70, $col_054, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_054(double value) {
		setConstNumber(offset + 70, $col_054, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_055() {
		return getConstNumber(offset + 71, $col_055);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_055(MCNumber value) {
		setConstNumber(offset + 71, $col_055, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_055(int value) {
		setConstNumber(offset + 71, $col_055, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_055(long value) {
		setConstNumber(offset + 71, $col_055, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_055(float value) {
		setConstNumber(offset + 71, $col_055, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_055(double value) {
		setConstNumber(offset + 71, $col_055, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_08_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 72, $qty_08_p);
	}
	
	public void qty_08_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 72, $qty_08_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_057() {
		return getConstNumber(offset + 73, $col_057);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_057(MCNumber value) {
		setConstNumber(offset + 73, $col_057, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_057(int value) {
		setConstNumber(offset + 73, $col_057, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_057(long value) {
		setConstNumber(offset + 73, $col_057, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_057(float value) {
		setConstNumber(offset + 73, $col_057, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_057(double value) {
		setConstNumber(offset + 73, $col_057, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_058() {
		return getConstNumber(offset + 74, $col_058);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_058(MCNumber value) {
		setConstNumber(offset + 74, $col_058, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_058(int value) {
		setConstNumber(offset + 74, $col_058, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_058(long value) {
		setConstNumber(offset + 74, $col_058, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_058(float value) {
		setConstNumber(offset + 74, $col_058, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_058(double value) {
		setConstNumber(offset + 74, $col_058, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_059() {
		return getConstNumber(offset + 75, $col_059);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_059(MCNumber value) {
		setConstNumber(offset + 75, $col_059, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_059(int value) {
		setConstNumber(offset + 75, $col_059, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_059(long value) {
		setConstNumber(offset + 75, $col_059, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_059(float value) {
		setConstNumber(offset + 75, $col_059, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_059(double value) {
		setConstNumber(offset + 75, $col_059, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_060() {
		return getConstNumber(offset + 76, $col_060);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_060(MCNumber value) {
		setConstNumber(offset + 76, $col_060, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_060(int value) {
		setConstNumber(offset + 76, $col_060, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_060(long value) {
		setConstNumber(offset + 76, $col_060, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_060(float value) {
		setConstNumber(offset + 76, $col_060, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_060(double value) {
		setConstNumber(offset + 76, $col_060, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_061() {
		return getConstNumber(offset + 77, $col_061);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_061(MCNumber value) {
		setConstNumber(offset + 77, $col_061, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_061(int value) {
		setConstNumber(offset + 77, $col_061, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_061(long value) {
		setConstNumber(offset + 77, $col_061, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_061(float value) {
		setConstNumber(offset + 77, $col_061, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_061(double value) {
		setConstNumber(offset + 77, $col_061, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_062() {
		return getConstNumber(offset + 78, $col_062);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_062(MCNumber value) {
		setConstNumber(offset + 78, $col_062, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_062(int value) {
		setConstNumber(offset + 78, $col_062, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_062(long value) {
		setConstNumber(offset + 78, $col_062, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_062(float value) {
		setConstNumber(offset + 78, $col_062, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_062(double value) {
		setConstNumber(offset + 78, $col_062, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_09_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 79, $qty_09_p);
	}
	
	public void qty_09_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 79, $qty_09_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_064() {
		return getConstNumber(offset + 80, $col_064);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_064(MCNumber value) {
		setConstNumber(offset + 80, $col_064, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_064(int value) {
		setConstNumber(offset + 80, $col_064, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_064(long value) {
		setConstNumber(offset + 80, $col_064, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_064(float value) {
		setConstNumber(offset + 80, $col_064, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_064(double value) {
		setConstNumber(offset + 80, $col_064, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_065() {
		return getConstNumber(offset + 81, $col_065);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_065(MCNumber value) {
		setConstNumber(offset + 81, $col_065, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_065(int value) {
		setConstNumber(offset + 81, $col_065, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_065(long value) {
		setConstNumber(offset + 81, $col_065, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_065(float value) {
		setConstNumber(offset + 81, $col_065, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_065(double value) {
		setConstNumber(offset + 81, $col_065, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_066() {
		return getConstNumber(offset + 82, $col_066);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_066(MCNumber value) {
		setConstNumber(offset + 82, $col_066, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_066(int value) {
		setConstNumber(offset + 82, $col_066, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_066(long value) {
		setConstNumber(offset + 82, $col_066, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_066(float value) {
		setConstNumber(offset + 82, $col_066, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_066(double value) {
		setConstNumber(offset + 82, $col_066, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_067() {
		return getConstNumber(offset + 83, $col_067);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_067(MCNumber value) {
		setConstNumber(offset + 83, $col_067, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_067(int value) {
		setConstNumber(offset + 83, $col_067, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_067(long value) {
		setConstNumber(offset + 83, $col_067, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_067(float value) {
		setConstNumber(offset + 83, $col_067, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_067(double value) {
		setConstNumber(offset + 83, $col_067, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_068() {
		return getConstNumber(offset + 84, $col_068);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_068(MCNumber value) {
		setConstNumber(offset + 84, $col_068, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_068(int value) {
		setConstNumber(offset + 84, $col_068, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_068(long value) {
		setConstNumber(offset + 84, $col_068, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_068(float value) {
		setConstNumber(offset + 84, $col_068, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_068(double value) {
		setConstNumber(offset + 84, $col_068, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_069() {
		return getConstNumber(offset + 85, $col_069);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_069(MCNumber value) {
		setConstNumber(offset + 85, $col_069, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_069(int value) {
		setConstNumber(offset + 85, $col_069, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_069(long value) {
		setConstNumber(offset + 85, $col_069, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_069(float value) {
		setConstNumber(offset + 85, $col_069, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_069(double value) {
		setConstNumber(offset + 85, $col_069, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_10_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 86, $qty_10_p);
	}
	
	public void qty_10_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 86, $qty_10_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_071() {
		return getConstNumber(offset + 87, $col_071);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_071(MCNumber value) {
		setConstNumber(offset + 87, $col_071, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_071(int value) {
		setConstNumber(offset + 87, $col_071, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_071(long value) {
		setConstNumber(offset + 87, $col_071, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_071(float value) {
		setConstNumber(offset + 87, $col_071, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_071(double value) {
		setConstNumber(offset + 87, $col_071, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_072() {
		return getConstNumber(offset + 88, $col_072);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_072(MCNumber value) {
		setConstNumber(offset + 88, $col_072, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_072(int value) {
		setConstNumber(offset + 88, $col_072, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_072(long value) {
		setConstNumber(offset + 88, $col_072, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_072(float value) {
		setConstNumber(offset + 88, $col_072, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_072(double value) {
		setConstNumber(offset + 88, $col_072, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_073() {
		return getConstNumber(offset + 89, $col_073);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_073(MCNumber value) {
		setConstNumber(offset + 89, $col_073, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_073(int value) {
		setConstNumber(offset + 89, $col_073, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_073(long value) {
		setConstNumber(offset + 89, $col_073, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_073(float value) {
		setConstNumber(offset + 89, $col_073, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_073(double value) {
		setConstNumber(offset + 89, $col_073, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_074() {
		return getConstNumber(offset + 90, $col_074);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_074(MCNumber value) {
		setConstNumber(offset + 90, $col_074, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_074(int value) {
		setConstNumber(offset + 90, $col_074, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_074(long value) {
		setConstNumber(offset + 90, $col_074, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_074(float value) {
		setConstNumber(offset + 90, $col_074, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_074(double value) {
		setConstNumber(offset + 90, $col_074, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_075() {
		return getConstNumber(offset + 91, $col_075);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_075(MCNumber value) {
		setConstNumber(offset + 91, $col_075, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_075(int value) {
		setConstNumber(offset + 91, $col_075, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_075(long value) {
		setConstNumber(offset + 91, $col_075, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_075(float value) {
		setConstNumber(offset + 91, $col_075, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_075(double value) {
		setConstNumber(offset + 91, $col_075, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_076() {
		return getConstNumber(offset + 92, $col_076);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_076(MCNumber value) {
		setConstNumber(offset + 92, $col_076, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_076(int value) {
		setConstNumber(offset + 92, $col_076, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_076(long value) {
		setConstNumber(offset + 92, $col_076, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_076(float value) {
		setConstNumber(offset + 92, $col_076, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_076(double value) {
		setConstNumber(offset + 92, $col_076, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_11_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 93, $qty_11_p);
	}
	
	public void qty_11_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 93, $qty_11_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_078() {
		return getConstNumber(offset + 94, $col_078);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_078(MCNumber value) {
		setConstNumber(offset + 94, $col_078, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_078(int value) {
		setConstNumber(offset + 94, $col_078, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_078(long value) {
		setConstNumber(offset + 94, $col_078, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_078(float value) {
		setConstNumber(offset + 94, $col_078, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_078(double value) {
		setConstNumber(offset + 94, $col_078, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_079() {
		return getConstNumber(offset + 95, $col_079);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_079(MCNumber value) {
		setConstNumber(offset + 95, $col_079, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_079(int value) {
		setConstNumber(offset + 95, $col_079, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_079(long value) {
		setConstNumber(offset + 95, $col_079, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_079(float value) {
		setConstNumber(offset + 95, $col_079, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_079(double value) {
		setConstNumber(offset + 95, $col_079, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_080() {
		return getConstNumber(offset + 96, $col_080);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_080(MCNumber value) {
		setConstNumber(offset + 96, $col_080, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_080(int value) {
		setConstNumber(offset + 96, $col_080, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_080(long value) {
		setConstNumber(offset + 96, $col_080, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_080(float value) {
		setConstNumber(offset + 96, $col_080, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_080(double value) {
		setConstNumber(offset + 96, $col_080, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_081() {
		return getConstNumber(offset + 97, $col_081);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_081(MCNumber value) {
		setConstNumber(offset + 97, $col_081, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_081(int value) {
		setConstNumber(offset + 97, $col_081, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_081(long value) {
		setConstNumber(offset + 97, $col_081, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_081(float value) {
		setConstNumber(offset + 97, $col_081, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_081(double value) {
		setConstNumber(offset + 97, $col_081, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_082() {
		return getConstNumber(offset + 98, $col_082);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_082(MCNumber value) {
		setConstNumber(offset + 98, $col_082, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_082(int value) {
		setConstNumber(offset + 98, $col_082, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_082(long value) {
		setConstNumber(offset + 98, $col_082, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_082(float value) {
		setConstNumber(offset + 98, $col_082, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_082(double value) {
		setConstNumber(offset + 98, $col_082, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_083() {
		return getConstNumber(offset + 99, $col_083);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_083(MCNumber value) {
		setConstNumber(offset + 99, $col_083, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_083(int value) {
		setConstNumber(offset + 99, $col_083, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_083(long value) {
		setConstNumber(offset + 99, $col_083, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_083(float value) {
		setConstNumber(offset + 99, $col_083, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_083(double value) {
		setConstNumber(offset + 99, $col_083, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_12_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 100, $qty_12_p);
	}
	
	public void qty_12_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 100, $qty_12_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_085() {
		return getConstNumber(offset + 101, $col_085);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_085(MCNumber value) {
		setConstNumber(offset + 101, $col_085, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_085(int value) {
		setConstNumber(offset + 101, $col_085, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_085(long value) {
		setConstNumber(offset + 101, $col_085, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_085(float value) {
		setConstNumber(offset + 101, $col_085, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_085(double value) {
		setConstNumber(offset + 101, $col_085, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_086() {
		return getConstNumber(offset + 102, $col_086);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_086(MCNumber value) {
		setConstNumber(offset + 102, $col_086, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_086(int value) {
		setConstNumber(offset + 102, $col_086, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_086(long value) {
		setConstNumber(offset + 102, $col_086, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_086(float value) {
		setConstNumber(offset + 102, $col_086, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_086(double value) {
		setConstNumber(offset + 102, $col_086, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_087() {
		return getConstNumber(offset + 103, $col_087);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_087(MCNumber value) {
		setConstNumber(offset + 103, $col_087, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_087(int value) {
		setConstNumber(offset + 103, $col_087, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_087(long value) {
		setConstNumber(offset + 103, $col_087, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_087(float value) {
		setConstNumber(offset + 103, $col_087, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_087(double value) {
		setConstNumber(offset + 103, $col_087, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_088() {
		return getConstNumber(offset + 104, $col_088);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_088(MCNumber value) {
		setConstNumber(offset + 104, $col_088, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_088(int value) {
		setConstNumber(offset + 104, $col_088, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_088(long value) {
		setConstNumber(offset + 104, $col_088, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_088(float value) {
		setConstNumber(offset + 104, $col_088, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_088(double value) {
		setConstNumber(offset + 104, $col_088, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_089() {
		return getConstNumber(offset + 105, $col_089);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_089(MCNumber value) {
		setConstNumber(offset + 105, $col_089, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_089(int value) {
		setConstNumber(offset + 105, $col_089, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_089(long value) {
		setConstNumber(offset + 105, $col_089, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_089(float value) {
		setConstNumber(offset + 105, $col_089, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_089(double value) {
		setConstNumber(offset + 105, $col_089, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_090() {
		return getConstNumber(offset + 106, $col_090);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_090(MCNumber value) {
		setConstNumber(offset + 106, $col_090, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_090(int value) {
		setConstNumber(offset + 106, $col_090, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_090(long value) {
		setConstNumber(offset + 106, $col_090, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_090(float value) {
		setConstNumber(offset + 106, $col_090, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_090(double value) {
		setConstNumber(offset + 106, $col_090, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_13_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 107, $qty_13_p);
	}
	
	public void qty_13_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 107, $qty_13_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_092() {
		return getConstNumber(offset + 108, $col_092);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_092(MCNumber value) {
		setConstNumber(offset + 108, $col_092, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_092(int value) {
		setConstNumber(offset + 108, $col_092, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_092(long value) {
		setConstNumber(offset + 108, $col_092, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_092(float value) {
		setConstNumber(offset + 108, $col_092, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_092(double value) {
		setConstNumber(offset + 108, $col_092, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_093() {
		return getConstNumber(offset + 109, $col_093);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_093(MCNumber value) {
		setConstNumber(offset + 109, $col_093, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_093(int value) {
		setConstNumber(offset + 109, $col_093, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_093(long value) {
		setConstNumber(offset + 109, $col_093, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_093(float value) {
		setConstNumber(offset + 109, $col_093, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_093(double value) {
		setConstNumber(offset + 109, $col_093, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_094() {
		return getConstNumber(offset + 110, $col_094);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_094(MCNumber value) {
		setConstNumber(offset + 110, $col_094, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_094(int value) {
		setConstNumber(offset + 110, $col_094, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_094(long value) {
		setConstNumber(offset + 110, $col_094, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_094(float value) {
		setConstNumber(offset + 110, $col_094, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_094(double value) {
		setConstNumber(offset + 110, $col_094, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_095() {
		return getConstNumber(offset + 111, $col_095);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_095(MCNumber value) {
		setConstNumber(offset + 111, $col_095, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_095(int value) {
		setConstNumber(offset + 111, $col_095, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_095(long value) {
		setConstNumber(offset + 111, $col_095, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_095(float value) {
		setConstNumber(offset + 111, $col_095, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_095(double value) {
		setConstNumber(offset + 111, $col_095, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_096() {
		return getConstNumber(offset + 112, $col_096);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_096(MCNumber value) {
		setConstNumber(offset + 112, $col_096, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_096(int value) {
		setConstNumber(offset + 112, $col_096, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_096(long value) {
		setConstNumber(offset + 112, $col_096, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_096(float value) {
		setConstNumber(offset + 112, $col_096, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_096(double value) {
		setConstNumber(offset + 112, $col_096, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_097() {
		return getConstNumber(offset + 113, $col_097);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_097(MCNumber value) {
		setConstNumber(offset + 113, $col_097, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_097(int value) {
		setConstNumber(offset + 113, $col_097, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_097(long value) {
		setConstNumber(offset + 113, $col_097, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_097(float value) {
		setConstNumber(offset + 113, $col_097, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_097(double value) {
		setConstNumber(offset + 113, $col_097, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_14_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 114, $qty_14_p);
	}
	
	public void qty_14_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 114, $qty_14_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_099() {
		return getConstNumber(offset + 115, $col_099);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_099(MCNumber value) {
		setConstNumber(offset + 115, $col_099, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_099(int value) {
		setConstNumber(offset + 115, $col_099, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_099(long value) {
		setConstNumber(offset + 115, $col_099, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_099(float value) {
		setConstNumber(offset + 115, $col_099, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_099(double value) {
		setConstNumber(offset + 115, $col_099, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_100() {
		return getConstNumber(offset + 116, $col_100);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_100(MCNumber value) {
		setConstNumber(offset + 116, $col_100, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_100(int value) {
		setConstNumber(offset + 116, $col_100, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_100(long value) {
		setConstNumber(offset + 116, $col_100, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_100(float value) {
		setConstNumber(offset + 116, $col_100, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_100(double value) {
		setConstNumber(offset + 116, $col_100, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_101() {
		return getConstNumber(offset + 117, $col_101);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_101(MCNumber value) {
		setConstNumber(offset + 117, $col_101, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_101(int value) {
		setConstNumber(offset + 117, $col_101, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_101(long value) {
		setConstNumber(offset + 117, $col_101, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_101(float value) {
		setConstNumber(offset + 117, $col_101, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_101(double value) {
		setConstNumber(offset + 117, $col_101, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_102() {
		return getConstNumber(offset + 118, $col_102);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_102(MCNumber value) {
		setConstNumber(offset + 118, $col_102, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_102(int value) {
		setConstNumber(offset + 118, $col_102, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_102(long value) {
		setConstNumber(offset + 118, $col_102, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_102(float value) {
		setConstNumber(offset + 118, $col_102, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_102(double value) {
		setConstNumber(offset + 118, $col_102, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_103() {
		return getConstNumber(offset + 119, $col_103);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_103(MCNumber value) {
		setConstNumber(offset + 119, $col_103, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_103(int value) {
		setConstNumber(offset + 119, $col_103, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_103(long value) {
		setConstNumber(offset + 119, $col_103, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_103(float value) {
		setConstNumber(offset + 119, $col_103, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_103(double value) {
		setConstNumber(offset + 119, $col_103, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_104() {
		return getConstNumber(offset + 120, $col_104);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_104(MCNumber value) {
		setConstNumber(offset + 120, $col_104, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_104(int value) {
		setConstNumber(offset + 120, $col_104, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_104(long value) {
		setConstNumber(offset + 120, $col_104, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_104(float value) {
		setConstNumber(offset + 120, $col_104, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_104(double value) {
		setConstNumber(offset + 120, $col_104, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_15_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 121, $qty_15_p);
	}
	
	public void qty_15_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 121, $qty_15_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_106() {
		return getConstNumber(offset + 122, $col_106);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_106(MCNumber value) {
		setConstNumber(offset + 122, $col_106, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_106(int value) {
		setConstNumber(offset + 122, $col_106, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_106(long value) {
		setConstNumber(offset + 122, $col_106, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_106(float value) {
		setConstNumber(offset + 122, $col_106, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_106(double value) {
		setConstNumber(offset + 122, $col_106, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_107() {
		return getConstNumber(offset + 123, $col_107);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_107(MCNumber value) {
		setConstNumber(offset + 123, $col_107, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_107(int value) {
		setConstNumber(offset + 123, $col_107, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_107(long value) {
		setConstNumber(offset + 123, $col_107, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_107(float value) {
		setConstNumber(offset + 123, $col_107, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_107(double value) {
		setConstNumber(offset + 123, $col_107, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_108() {
		return getConstNumber(offset + 124, $col_108);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_108(MCNumber value) {
		setConstNumber(offset + 124, $col_108, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_108(int value) {
		setConstNumber(offset + 124, $col_108, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_108(long value) {
		setConstNumber(offset + 124, $col_108, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_108(float value) {
		setConstNumber(offset + 124, $col_108, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_108(double value) {
		setConstNumber(offset + 124, $col_108, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_109() {
		return getConstNumber(offset + 125, $col_109);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_109(MCNumber value) {
		setConstNumber(offset + 125, $col_109, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_109(int value) {
		setConstNumber(offset + 125, $col_109, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_109(long value) {
		setConstNumber(offset + 125, $col_109, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_109(float value) {
		setConstNumber(offset + 125, $col_109, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_109(double value) {
		setConstNumber(offset + 125, $col_109, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_110() {
		return getConstNumber(offset + 126, $col_110);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_110(MCNumber value) {
		setConstNumber(offset + 126, $col_110, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_110(int value) {
		setConstNumber(offset + 126, $col_110, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_110(long value) {
		setConstNumber(offset + 126, $col_110, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_110(float value) {
		setConstNumber(offset + 126, $col_110, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_110(double value) {
		setConstNumber(offset + 126, $col_110, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_111() {
		return getConstNumber(offset + 127, $col_111);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_111(MCNumber value) {
		setConstNumber(offset + 127, $col_111, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_111(int value) {
		setConstNumber(offset + 127, $col_111, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_111(long value) {
		setConstNumber(offset + 127, $col_111, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_111(float value) {
		setConstNumber(offset + 127, $col_111, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_111(double value) {
		setConstNumber(offset + 127, $col_111, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_16_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 128, $qty_16_p);
	}
	
	public void qty_16_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 128, $qty_16_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_113() {
		return getConstNumber(offset + 129, $col_113);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_113(MCNumber value) {
		setConstNumber(offset + 129, $col_113, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_113(int value) {
		setConstNumber(offset + 129, $col_113, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_113(long value) {
		setConstNumber(offset + 129, $col_113, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_113(float value) {
		setConstNumber(offset + 129, $col_113, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_113(double value) {
		setConstNumber(offset + 129, $col_113, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_114() {
		return getConstNumber(offset + 130, $col_114);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_114(MCNumber value) {
		setConstNumber(offset + 130, $col_114, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_114(int value) {
		setConstNumber(offset + 130, $col_114, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_114(long value) {
		setConstNumber(offset + 130, $col_114, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_114(float value) {
		setConstNumber(offset + 130, $col_114, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_114(double value) {
		setConstNumber(offset + 130, $col_114, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_115() {
		return getConstNumber(offset + 131, $col_115);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_115(MCNumber value) {
		setConstNumber(offset + 131, $col_115, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_115(int value) {
		setConstNumber(offset + 131, $col_115, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_115(long value) {
		setConstNumber(offset + 131, $col_115, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_115(float value) {
		setConstNumber(offset + 131, $col_115, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_115(double value) {
		setConstNumber(offset + 131, $col_115, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_116() {
		return getConstNumber(offset + 132, $col_116);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_116(MCNumber value) {
		setConstNumber(offset + 132, $col_116, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_116(int value) {
		setConstNumber(offset + 132, $col_116, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_116(long value) {
		setConstNumber(offset + 132, $col_116, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_116(float value) {
		setConstNumber(offset + 132, $col_116, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_116(double value) {
		setConstNumber(offset + 132, $col_116, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_117() {
		return getConstNumber(offset + 133, $col_117);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_117(MCNumber value) {
		setConstNumber(offset + 133, $col_117, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_117(int value) {
		setConstNumber(offset + 133, $col_117, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_117(long value) {
		setConstNumber(offset + 133, $col_117, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_117(float value) {
		setConstNumber(offset + 133, $col_117, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_117(double value) {
		setConstNumber(offset + 133, $col_117, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_118() {
		return getConstNumber(offset + 134, $col_118);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_118(MCNumber value) {
		setConstNumber(offset + 134, $col_118, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_118(int value) {
		setConstNumber(offset + 134, $col_118, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_118(long value) {
		setConstNumber(offset + 134, $col_118, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_118(float value) {
		setConstNumber(offset + 134, $col_118, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_118(double value) {
		setConstNumber(offset + 134, $col_118, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_17_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 135, $qty_17_p);
	}
	
	public void qty_17_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 135, $qty_17_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_120() {
		return getConstNumber(offset + 136, $col_120);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_120(MCNumber value) {
		setConstNumber(offset + 136, $col_120, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_120(int value) {
		setConstNumber(offset + 136, $col_120, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_120(long value) {
		setConstNumber(offset + 136, $col_120, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_120(float value) {
		setConstNumber(offset + 136, $col_120, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_120(double value) {
		setConstNumber(offset + 136, $col_120, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_121() {
		return getConstNumber(offset + 137, $col_121);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_121(MCNumber value) {
		setConstNumber(offset + 137, $col_121, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_121(int value) {
		setConstNumber(offset + 137, $col_121, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_121(long value) {
		setConstNumber(offset + 137, $col_121, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_121(float value) {
		setConstNumber(offset + 137, $col_121, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_121(double value) {
		setConstNumber(offset + 137, $col_121, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_122() {
		return getConstNumber(offset + 138, $col_122);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_122(MCNumber value) {
		setConstNumber(offset + 138, $col_122, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_122(int value) {
		setConstNumber(offset + 138, $col_122, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_122(long value) {
		setConstNumber(offset + 138, $col_122, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_122(float value) {
		setConstNumber(offset + 138, $col_122, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_122(double value) {
		setConstNumber(offset + 138, $col_122, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_123() {
		return getConstNumber(offset + 139, $col_123);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_123(MCNumber value) {
		setConstNumber(offset + 139, $col_123, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_123(int value) {
		setConstNumber(offset + 139, $col_123, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_123(long value) {
		setConstNumber(offset + 139, $col_123, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_123(float value) {
		setConstNumber(offset + 139, $col_123, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_123(double value) {
		setConstNumber(offset + 139, $col_123, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_124() {
		return getConstNumber(offset + 140, $col_124);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_124(MCNumber value) {
		setConstNumber(offset + 140, $col_124, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_124(int value) {
		setConstNumber(offset + 140, $col_124, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_124(long value) {
		setConstNumber(offset + 140, $col_124, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_124(float value) {
		setConstNumber(offset + 140, $col_124, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_124(double value) {
		setConstNumber(offset + 140, $col_124, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_125() {
		return getConstNumber(offset + 141, $col_125);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_125(MCNumber value) {
		setConstNumber(offset + 141, $col_125, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_125(int value) {
		setConstNumber(offset + 141, $col_125, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_125(long value) {
		setConstNumber(offset + 141, $col_125, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_125(float value) {
		setConstNumber(offset + 141, $col_125, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_125(double value) {
		setConstNumber(offset + 141, $col_125, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_18_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 142, $qty_18_p);
	}
	
	public void qty_18_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 142, $qty_18_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_127() {
		return getConstNumber(offset + 143, $col_127);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_127(MCNumber value) {
		setConstNumber(offset + 143, $col_127, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_127(int value) {
		setConstNumber(offset + 143, $col_127, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_127(long value) {
		setConstNumber(offset + 143, $col_127, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_127(float value) {
		setConstNumber(offset + 143, $col_127, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_127(double value) {
		setConstNumber(offset + 143, $col_127, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_128() {
		return getConstNumber(offset + 144, $col_128);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_128(MCNumber value) {
		setConstNumber(offset + 144, $col_128, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_128(int value) {
		setConstNumber(offset + 144, $col_128, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_128(long value) {
		setConstNumber(offset + 144, $col_128, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_128(float value) {
		setConstNumber(offset + 144, $col_128, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_128(double value) {
		setConstNumber(offset + 144, $col_128, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_129() {
		return getConstNumber(offset + 145, $col_129);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_129(MCNumber value) {
		setConstNumber(offset + 145, $col_129, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_129(int value) {
		setConstNumber(offset + 145, $col_129, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_129(long value) {
		setConstNumber(offset + 145, $col_129, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_129(float value) {
		setConstNumber(offset + 145, $col_129, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_129(double value) {
		setConstNumber(offset + 145, $col_129, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_130() {
		return getConstNumber(offset + 146, $col_130);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_130(MCNumber value) {
		setConstNumber(offset + 146, $col_130, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_130(int value) {
		setConstNumber(offset + 146, $col_130, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_130(long value) {
		setConstNumber(offset + 146, $col_130, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_130(float value) {
		setConstNumber(offset + 146, $col_130, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_130(double value) {
		setConstNumber(offset + 146, $col_130, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_131() {
		return getConstNumber(offset + 147, $col_131);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_131(MCNumber value) {
		setConstNumber(offset + 147, $col_131, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_131(int value) {
		setConstNumber(offset + 147, $col_131, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_131(long value) {
		setConstNumber(offset + 147, $col_131, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_131(float value) {
		setConstNumber(offset + 147, $col_131, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_131(double value) {
		setConstNumber(offset + 147, $col_131, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_132() {
		return getConstNumber(offset + 148, $col_132);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_132(MCNumber value) {
		setConstNumber(offset + 148, $col_132, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_132(int value) {
		setConstNumber(offset + 148, $col_132, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_132(long value) {
		setConstNumber(offset + 148, $col_132, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_132(float value) {
		setConstNumber(offset + 148, $col_132, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_132(double value) {
		setConstNumber(offset + 148, $col_132, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_19_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 149, $qty_19_p);
	}
	
	public void qty_19_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 149, $qty_19_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_134() {
		return getConstNumber(offset + 150, $col_134);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_134(MCNumber value) {
		setConstNumber(offset + 150, $col_134, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_134(int value) {
		setConstNumber(offset + 150, $col_134, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_134(long value) {
		setConstNumber(offset + 150, $col_134, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_134(float value) {
		setConstNumber(offset + 150, $col_134, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_134(double value) {
		setConstNumber(offset + 150, $col_134, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_135() {
		return getConstNumber(offset + 151, $col_135);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_135(MCNumber value) {
		setConstNumber(offset + 151, $col_135, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_135(int value) {
		setConstNumber(offset + 151, $col_135, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_135(long value) {
		setConstNumber(offset + 151, $col_135, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_135(float value) {
		setConstNumber(offset + 151, $col_135, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_135(double value) {
		setConstNumber(offset + 151, $col_135, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_136() {
		return getConstNumber(offset + 152, $col_136);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_136(MCNumber value) {
		setConstNumber(offset + 152, $col_136, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_136(int value) {
		setConstNumber(offset + 152, $col_136, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_136(long value) {
		setConstNumber(offset + 152, $col_136, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_136(float value) {
		setConstNumber(offset + 152, $col_136, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_136(double value) {
		setConstNumber(offset + 152, $col_136, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_137() {
		return getConstNumber(offset + 153, $col_137);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_137(MCNumber value) {
		setConstNumber(offset + 153, $col_137, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_137(int value) {
		setConstNumber(offset + 153, $col_137, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_137(long value) {
		setConstNumber(offset + 153, $col_137, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_137(float value) {
		setConstNumber(offset + 153, $col_137, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_137(double value) {
		setConstNumber(offset + 153, $col_137, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_138() {
		return getConstNumber(offset + 154, $col_138);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_138(MCNumber value) {
		setConstNumber(offset + 154, $col_138, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_138(int value) {
		setConstNumber(offset + 154, $col_138, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_138(long value) {
		setConstNumber(offset + 154, $col_138, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_138(float value) {
		setConstNumber(offset + 154, $col_138, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_138(double value) {
		setConstNumber(offset + 154, $col_138, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_139() {
		return getConstNumber(offset + 155, $col_139);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_139(MCNumber value) {
		setConstNumber(offset + 155, $col_139, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_139(int value) {
		setConstNumber(offset + 155, $col_139, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_139(long value) {
		setConstNumber(offset + 155, $col_139, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_139(float value) {
		setConstNumber(offset + 155, $col_139, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_139(double value) {
		setConstNumber(offset + 155, $col_139, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_20_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 156, $qty_20_p);
	}
	
	public void qty_20_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 156, $qty_20_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_141() {
		return getConstNumber(offset + 157, $col_141);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_141(MCNumber value) {
		setConstNumber(offset + 157, $col_141, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_141(int value) {
		setConstNumber(offset + 157, $col_141, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_141(long value) {
		setConstNumber(offset + 157, $col_141, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_141(float value) {
		setConstNumber(offset + 157, $col_141, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_141(double value) {
		setConstNumber(offset + 157, $col_141, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_142() {
		return getConstNumber(offset + 158, $col_142);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_142(MCNumber value) {
		setConstNumber(offset + 158, $col_142, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_142(int value) {
		setConstNumber(offset + 158, $col_142, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_142(long value) {
		setConstNumber(offset + 158, $col_142, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_142(float value) {
		setConstNumber(offset + 158, $col_142, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_142(double value) {
		setConstNumber(offset + 158, $col_142, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_143() {
		return getConstNumber(offset + 159, $col_143);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_143(MCNumber value) {
		setConstNumber(offset + 159, $col_143, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_143(int value) {
		setConstNumber(offset + 159, $col_143, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_143(long value) {
		setConstNumber(offset + 159, $col_143, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_143(float value) {
		setConstNumber(offset + 159, $col_143, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_143(double value) {
		setConstNumber(offset + 159, $col_143, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_144() {
		return getConstNumber(offset + 160, $col_144);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_144(MCNumber value) {
		setConstNumber(offset + 160, $col_144, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_144(int value) {
		setConstNumber(offset + 160, $col_144, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_144(long value) {
		setConstNumber(offset + 160, $col_144, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_144(float value) {
		setConstNumber(offset + 160, $col_144, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_144(double value) {
		setConstNumber(offset + 160, $col_144, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_145() {
		return getConstNumber(offset + 161, $col_145);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_145(MCNumber value) {
		setConstNumber(offset + 161, $col_145, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_145(int value) {
		setConstNumber(offset + 161, $col_145, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_145(long value) {
		setConstNumber(offset + 161, $col_145, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_145(float value) {
		setConstNumber(offset + 161, $col_145, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_145(double value) {
		setConstNumber(offset + 161, $col_145, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_146() {
		return getConstNumber(offset + 162, $col_146);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_146(MCNumber value) {
		setConstNumber(offset + 162, $col_146, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_146(int value) {
		setConstNumber(offset + 162, $col_146, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_146(long value) {
		setConstNumber(offset + 162, $col_146, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_146(float value) {
		setConstNumber(offset + 162, $col_146, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_146(double value) {
		setConstNumber(offset + 162, $col_146, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_21_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 163, $qty_21_p);
	}
	
	public void qty_21_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 163, $qty_21_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_148() {
		return getConstNumber(offset + 164, $col_148);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_148(MCNumber value) {
		setConstNumber(offset + 164, $col_148, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_148(int value) {
		setConstNumber(offset + 164, $col_148, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_148(long value) {
		setConstNumber(offset + 164, $col_148, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_148(float value) {
		setConstNumber(offset + 164, $col_148, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_148(double value) {
		setConstNumber(offset + 164, $col_148, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_149() {
		return getConstNumber(offset + 165, $col_149);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_149(MCNumber value) {
		setConstNumber(offset + 165, $col_149, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_149(int value) {
		setConstNumber(offset + 165, $col_149, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_149(long value) {
		setConstNumber(offset + 165, $col_149, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_149(float value) {
		setConstNumber(offset + 165, $col_149, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_149(double value) {
		setConstNumber(offset + 165, $col_149, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_150() {
		return getConstNumber(offset + 166, $col_150);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_150(MCNumber value) {
		setConstNumber(offset + 166, $col_150, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_150(int value) {
		setConstNumber(offset + 166, $col_150, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_150(long value) {
		setConstNumber(offset + 166, $col_150, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_150(float value) {
		setConstNumber(offset + 166, $col_150, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_150(double value) {
		setConstNumber(offset + 166, $col_150, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_151() {
		return getConstNumber(offset + 167, $col_151);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_151(MCNumber value) {
		setConstNumber(offset + 167, $col_151, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_151(int value) {
		setConstNumber(offset + 167, $col_151, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_151(long value) {
		setConstNumber(offset + 167, $col_151, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_151(float value) {
		setConstNumber(offset + 167, $col_151, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_151(double value) {
		setConstNumber(offset + 167, $col_151, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_152() {
		return getConstNumber(offset + 168, $col_152);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_152(MCNumber value) {
		setConstNumber(offset + 168, $col_152, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_152(int value) {
		setConstNumber(offset + 168, $col_152, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_152(long value) {
		setConstNumber(offset + 168, $col_152, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_152(float value) {
		setConstNumber(offset + 168, $col_152, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_152(double value) {
		setConstNumber(offset + 168, $col_152, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_153() {
		return getConstNumber(offset + 169, $col_153);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_153(MCNumber value) {
		setConstNumber(offset + 169, $col_153, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_153(int value) {
		setConstNumber(offset + 169, $col_153, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_153(long value) {
		setConstNumber(offset + 169, $col_153, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_153(float value) {
		setConstNumber(offset + 169, $col_153, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_153(double value) {
		setConstNumber(offset + 169, $col_153, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_22_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 170, $qty_22_p);
	}
	
	public void qty_22_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 170, $qty_22_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_155() {
		return getConstNumber(offset + 171, $col_155);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_155(MCNumber value) {
		setConstNumber(offset + 171, $col_155, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_155(int value) {
		setConstNumber(offset + 171, $col_155, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_155(long value) {
		setConstNumber(offset + 171, $col_155, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_155(float value) {
		setConstNumber(offset + 171, $col_155, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_155(double value) {
		setConstNumber(offset + 171, $col_155, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_156() {
		return getConstNumber(offset + 172, $col_156);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_156(MCNumber value) {
		setConstNumber(offset + 172, $col_156, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_156(int value) {
		setConstNumber(offset + 172, $col_156, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_156(long value) {
		setConstNumber(offset + 172, $col_156, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_156(float value) {
		setConstNumber(offset + 172, $col_156, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_156(double value) {
		setConstNumber(offset + 172, $col_156, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_157() {
		return getConstNumber(offset + 173, $col_157);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_157(MCNumber value) {
		setConstNumber(offset + 173, $col_157, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_157(int value) {
		setConstNumber(offset + 173, $col_157, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_157(long value) {
		setConstNumber(offset + 173, $col_157, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_157(float value) {
		setConstNumber(offset + 173, $col_157, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_157(double value) {
		setConstNumber(offset + 173, $col_157, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_158() {
		return getConstNumber(offset + 174, $col_158);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_158(MCNumber value) {
		setConstNumber(offset + 174, $col_158, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_158(int value) {
		setConstNumber(offset + 174, $col_158, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_158(long value) {
		setConstNumber(offset + 174, $col_158, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_158(float value) {
		setConstNumber(offset + 174, $col_158, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_158(double value) {
		setConstNumber(offset + 174, $col_158, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_159() {
		return getConstNumber(offset + 175, $col_159);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_159(MCNumber value) {
		setConstNumber(offset + 175, $col_159, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_159(int value) {
		setConstNumber(offset + 175, $col_159, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_159(long value) {
		setConstNumber(offset + 175, $col_159, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_159(float value) {
		setConstNumber(offset + 175, $col_159, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_159(double value) {
		setConstNumber(offset + 175, $col_159, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_160() {
		return getConstNumber(offset + 176, $col_160);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_160(MCNumber value) {
		setConstNumber(offset + 176, $col_160, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_160(int value) {
		setConstNumber(offset + 176, $col_160, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_160(long value) {
		setConstNumber(offset + 176, $col_160, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_160(float value) {
		setConstNumber(offset + 176, $col_160, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_160(double value) {
		setConstNumber(offset + 176, $col_160, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_23_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 177, $qty_23_p);
	}
	
	public void qty_23_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 177, $qty_23_p, row);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_162() {
		return getConstNumber(offset + 178, $col_162);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_162(MCNumber value) {
		setConstNumber(offset + 178, $col_162, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_162(int value) {
		setConstNumber(offset + 178, $col_162, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_162(long value) {
		setConstNumber(offset + 178, $col_162, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_162(float value) {
		setConstNumber(offset + 178, $col_162, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_162(double value) {
		setConstNumber(offset + 178, $col_162, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_163() {
		return getConstNumber(offset + 179, $col_163);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_163(MCNumber value) {
		setConstNumber(offset + 179, $col_163, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_163(int value) {
		setConstNumber(offset + 179, $col_163, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_163(long value) {
		setConstNumber(offset + 179, $col_163, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_163(float value) {
		setConstNumber(offset + 179, $col_163, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_163(double value) {
		setConstNumber(offset + 179, $col_163, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_164() {
		return getConstNumber(offset + 180, $col_164);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_164(MCNumber value) {
		setConstNumber(offset + 180, $col_164, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_164(int value) {
		setConstNumber(offset + 180, $col_164, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_164(long value) {
		setConstNumber(offset + 180, $col_164, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_164(float value) {
		setConstNumber(offset + 180, $col_164, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_164(double value) {
		setConstNumber(offset + 180, $col_164, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber col_165() {
		return getConstNumber(offset + 181, $col_165);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_165(MCNumber value) {
		setConstNumber(offset + 181, $col_165, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_165(int value) {
		setConstNumber(offset + 181, $col_165, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_165(long value) {
		setConstNumber(offset + 181, $col_165, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_165(float value) {
		setConstNumber(offset + 181, $col_165, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void col_165(double value) {
		setConstNumber(offset + 181, $col_165, value);
	}


	/**
	 * Difference 差.<p>
	 *
	 */
	public MCNumber col_166() {
		return getConstNumber(offset + 182, $col_166);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_166(MCNumber value) {
		setConstNumber(offset + 182, $col_166, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_166(int value) {
		setConstNumber(offset + 182, $col_166, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_166(long value) {
		setConstNumber(offset + 182, $col_166, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_166(float value) {
		setConstNumber(offset + 182, $col_166, value);
	}

	/**
	 * Difference 差.<p>
	 *
	 */
	public void col_166(double value) {
		setConstNumber(offset + 182, $col_166, value);
	}


	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public MCNumber col_167() {
		return getConstNumber(offset + 183, $col_167);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_167(MCNumber value) {
		setConstNumber(offset + 183, $col_167, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_167(int value) {
		setConstNumber(offset + 183, $col_167, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_167(long value) {
		setConstNumber(offset + 183, $col_167, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_167(float value) {
		setConstNumber(offset + 183, $col_167, value);
	}

	/**
	 * Increase rate 増加率.<p>
	 *
	 */
	public void col_167(double value) {
		setConstNumber(offset + 183, $col_167, value);
	}


	public String getString(String name) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
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
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
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
		if ($col_099.equalsIgnoreCase(name)) {
			return col_099();
		}
		if ($col_100.equalsIgnoreCase(name)) {
			return col_100();
		}
		if ($col_101.equalsIgnoreCase(name)) {
			return col_101();
		}
		if ($col_102.equalsIgnoreCase(name)) {
			return col_102();
		}
		if ($col_103.equalsIgnoreCase(name)) {
			return col_103();
		}
		if ($col_104.equalsIgnoreCase(name)) {
			return col_104();
		}
		if ($col_106.equalsIgnoreCase(name)) {
			return col_106();
		}
		if ($col_107.equalsIgnoreCase(name)) {
			return col_107();
		}
		if ($col_108.equalsIgnoreCase(name)) {
			return col_108();
		}
		if ($col_109.equalsIgnoreCase(name)) {
			return col_109();
		}
		if ($col_110.equalsIgnoreCase(name)) {
			return col_110();
		}
		if ($col_111.equalsIgnoreCase(name)) {
			return col_111();
		}
		if ($col_113.equalsIgnoreCase(name)) {
			return col_113();
		}
		if ($col_114.equalsIgnoreCase(name)) {
			return col_114();
		}
		if ($col_115.equalsIgnoreCase(name)) {
			return col_115();
		}
		if ($col_116.equalsIgnoreCase(name)) {
			return col_116();
		}
		if ($col_117.equalsIgnoreCase(name)) {
			return col_117();
		}
		if ($col_118.equalsIgnoreCase(name)) {
			return col_118();
		}
		if ($col_120.equalsIgnoreCase(name)) {
			return col_120();
		}
		if ($col_121.equalsIgnoreCase(name)) {
			return col_121();
		}
		if ($col_122.equalsIgnoreCase(name)) {
			return col_122();
		}
		if ($col_123.equalsIgnoreCase(name)) {
			return col_123();
		}
		if ($col_124.equalsIgnoreCase(name)) {
			return col_124();
		}
		if ($col_125.equalsIgnoreCase(name)) {
			return col_125();
		}
		if ($col_127.equalsIgnoreCase(name)) {
			return col_127();
		}
		if ($col_128.equalsIgnoreCase(name)) {
			return col_128();
		}
		if ($col_129.equalsIgnoreCase(name)) {
			return col_129();
		}
		if ($col_130.equalsIgnoreCase(name)) {
			return col_130();
		}
		if ($col_131.equalsIgnoreCase(name)) {
			return col_131();
		}
		if ($col_132.equalsIgnoreCase(name)) {
			return col_132();
		}
		if ($col_134.equalsIgnoreCase(name)) {
			return col_134();
		}
		if ($col_135.equalsIgnoreCase(name)) {
			return col_135();
		}
		if ($col_136.equalsIgnoreCase(name)) {
			return col_136();
		}
		if ($col_137.equalsIgnoreCase(name)) {
			return col_137();
		}
		if ($col_138.equalsIgnoreCase(name)) {
			return col_138();
		}
		if ($col_139.equalsIgnoreCase(name)) {
			return col_139();
		}
		if ($col_141.equalsIgnoreCase(name)) {
			return col_141();
		}
		if ($col_142.equalsIgnoreCase(name)) {
			return col_142();
		}
		if ($col_143.equalsIgnoreCase(name)) {
			return col_143();
		}
		if ($col_144.equalsIgnoreCase(name)) {
			return col_144();
		}
		if ($col_145.equalsIgnoreCase(name)) {
			return col_145();
		}
		if ($col_146.equalsIgnoreCase(name)) {
			return col_146();
		}
		if ($col_148.equalsIgnoreCase(name)) {
			return col_148();
		}
		if ($col_149.equalsIgnoreCase(name)) {
			return col_149();
		}
		if ($col_150.equalsIgnoreCase(name)) {
			return col_150();
		}
		if ($col_151.equalsIgnoreCase(name)) {
			return col_151();
		}
		if ($col_152.equalsIgnoreCase(name)) {
			return col_152();
		}
		if ($col_153.equalsIgnoreCase(name)) {
			return col_153();
		}
		if ($col_155.equalsIgnoreCase(name)) {
			return col_155();
		}
		if ($col_156.equalsIgnoreCase(name)) {
			return col_156();
		}
		if ($col_157.equalsIgnoreCase(name)) {
			return col_157();
		}
		if ($col_158.equalsIgnoreCase(name)) {
			return col_158();
		}
		if ($col_159.equalsIgnoreCase(name)) {
			return col_159();
		}
		if ($col_160.equalsIgnoreCase(name)) {
			return col_160();
		}
		if ($col_162.equalsIgnoreCase(name)) {
			return col_162();
		}
		if ($col_163.equalsIgnoreCase(name)) {
			return col_163();
		}
		if ($col_164.equalsIgnoreCase(name)) {
			return col_164();
		}
		if ($col_165.equalsIgnoreCase(name)) {
			return col_165();
		}
		if ($col_166.equalsIgnoreCase(name)) {
			return col_166();
		}
		if ($col_167.equalsIgnoreCase(name)) {
			return col_167();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
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
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
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
		if ($col_099.equalsIgnoreCase(name)) {
			return col_099();
		}
		if ($col_100.equalsIgnoreCase(name)) {
			return col_100();
		}
		if ($col_101.equalsIgnoreCase(name)) {
			return col_101();
		}
		if ($col_102.equalsIgnoreCase(name)) {
			return col_102();
		}
		if ($col_103.equalsIgnoreCase(name)) {
			return col_103();
		}
		if ($col_104.equalsIgnoreCase(name)) {
			return col_104();
		}
		if ($col_106.equalsIgnoreCase(name)) {
			return col_106();
		}
		if ($col_107.equalsIgnoreCase(name)) {
			return col_107();
		}
		if ($col_108.equalsIgnoreCase(name)) {
			return col_108();
		}
		if ($col_109.equalsIgnoreCase(name)) {
			return col_109();
		}
		if ($col_110.equalsIgnoreCase(name)) {
			return col_110();
		}
		if ($col_111.equalsIgnoreCase(name)) {
			return col_111();
		}
		if ($col_113.equalsIgnoreCase(name)) {
			return col_113();
		}
		if ($col_114.equalsIgnoreCase(name)) {
			return col_114();
		}
		if ($col_115.equalsIgnoreCase(name)) {
			return col_115();
		}
		if ($col_116.equalsIgnoreCase(name)) {
			return col_116();
		}
		if ($col_117.equalsIgnoreCase(name)) {
			return col_117();
		}
		if ($col_118.equalsIgnoreCase(name)) {
			return col_118();
		}
		if ($col_120.equalsIgnoreCase(name)) {
			return col_120();
		}
		if ($col_121.equalsIgnoreCase(name)) {
			return col_121();
		}
		if ($col_122.equalsIgnoreCase(name)) {
			return col_122();
		}
		if ($col_123.equalsIgnoreCase(name)) {
			return col_123();
		}
		if ($col_124.equalsIgnoreCase(name)) {
			return col_124();
		}
		if ($col_125.equalsIgnoreCase(name)) {
			return col_125();
		}
		if ($col_127.equalsIgnoreCase(name)) {
			return col_127();
		}
		if ($col_128.equalsIgnoreCase(name)) {
			return col_128();
		}
		if ($col_129.equalsIgnoreCase(name)) {
			return col_129();
		}
		if ($col_130.equalsIgnoreCase(name)) {
			return col_130();
		}
		if ($col_131.equalsIgnoreCase(name)) {
			return col_131();
		}
		if ($col_132.equalsIgnoreCase(name)) {
			return col_132();
		}
		if ($col_134.equalsIgnoreCase(name)) {
			return col_134();
		}
		if ($col_135.equalsIgnoreCase(name)) {
			return col_135();
		}
		if ($col_136.equalsIgnoreCase(name)) {
			return col_136();
		}
		if ($col_137.equalsIgnoreCase(name)) {
			return col_137();
		}
		if ($col_138.equalsIgnoreCase(name)) {
			return col_138();
		}
		if ($col_139.equalsIgnoreCase(name)) {
			return col_139();
		}
		if ($col_141.equalsIgnoreCase(name)) {
			return col_141();
		}
		if ($col_142.equalsIgnoreCase(name)) {
			return col_142();
		}
		if ($col_143.equalsIgnoreCase(name)) {
			return col_143();
		}
		if ($col_144.equalsIgnoreCase(name)) {
			return col_144();
		}
		if ($col_145.equalsIgnoreCase(name)) {
			return col_145();
		}
		if ($col_146.equalsIgnoreCase(name)) {
			return col_146();
		}
		if ($col_148.equalsIgnoreCase(name)) {
			return col_148();
		}
		if ($col_149.equalsIgnoreCase(name)) {
			return col_149();
		}
		if ($col_150.equalsIgnoreCase(name)) {
			return col_150();
		}
		if ($col_151.equalsIgnoreCase(name)) {
			return col_151();
		}
		if ($col_152.equalsIgnoreCase(name)) {
			return col_152();
		}
		if ($col_153.equalsIgnoreCase(name)) {
			return col_153();
		}
		if ($col_155.equalsIgnoreCase(name)) {
			return col_155();
		}
		if ($col_156.equalsIgnoreCase(name)) {
			return col_156();
		}
		if ($col_157.equalsIgnoreCase(name)) {
			return col_157();
		}
		if ($col_158.equalsIgnoreCase(name)) {
			return col_158();
		}
		if ($col_159.equalsIgnoreCase(name)) {
			return col_159();
		}
		if ($col_160.equalsIgnoreCase(name)) {
			return col_160();
		}
		if ($col_162.equalsIgnoreCase(name)) {
			return col_162();
		}
		if ($col_163.equalsIgnoreCase(name)) {
			return col_163();
		}
		if ($col_164.equalsIgnoreCase(name)) {
			return col_164();
		}
		if ($col_165.equalsIgnoreCase(name)) {
			return col_165();
		}
		if ($col_166.equalsIgnoreCase(name)) {
			return col_166();
		}
		if ($col_167.equalsIgnoreCase(name)) {
			return col_167();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
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
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		if ($col_100.equalsIgnoreCase(name)) {
			col_100(value);
			return;
		}
		if ($col_101.equalsIgnoreCase(name)) {
			col_101(value);
			return;
		}
		if ($col_102.equalsIgnoreCase(name)) {
			col_102(value);
			return;
		}
		if ($col_103.equalsIgnoreCase(name)) {
			col_103(value);
			return;
		}
		if ($col_104.equalsIgnoreCase(name)) {
			col_104(value);
			return;
		}
		if ($col_106.equalsIgnoreCase(name)) {
			col_106(value);
			return;
		}
		if ($col_107.equalsIgnoreCase(name)) {
			col_107(value);
			return;
		}
		if ($col_108.equalsIgnoreCase(name)) {
			col_108(value);
			return;
		}
		if ($col_109.equalsIgnoreCase(name)) {
			col_109(value);
			return;
		}
		if ($col_110.equalsIgnoreCase(name)) {
			col_110(value);
			return;
		}
		if ($col_111.equalsIgnoreCase(name)) {
			col_111(value);
			return;
		}
		if ($col_113.equalsIgnoreCase(name)) {
			col_113(value);
			return;
		}
		if ($col_114.equalsIgnoreCase(name)) {
			col_114(value);
			return;
		}
		if ($col_115.equalsIgnoreCase(name)) {
			col_115(value);
			return;
		}
		if ($col_116.equalsIgnoreCase(name)) {
			col_116(value);
			return;
		}
		if ($col_117.equalsIgnoreCase(name)) {
			col_117(value);
			return;
		}
		if ($col_118.equalsIgnoreCase(name)) {
			col_118(value);
			return;
		}
		if ($col_120.equalsIgnoreCase(name)) {
			col_120(value);
			return;
		}
		if ($col_121.equalsIgnoreCase(name)) {
			col_121(value);
			return;
		}
		if ($col_122.equalsIgnoreCase(name)) {
			col_122(value);
			return;
		}
		if ($col_123.equalsIgnoreCase(name)) {
			col_123(value);
			return;
		}
		if ($col_124.equalsIgnoreCase(name)) {
			col_124(value);
			return;
		}
		if ($col_125.equalsIgnoreCase(name)) {
			col_125(value);
			return;
		}
		if ($col_127.equalsIgnoreCase(name)) {
			col_127(value);
			return;
		}
		if ($col_128.equalsIgnoreCase(name)) {
			col_128(value);
			return;
		}
		if ($col_129.equalsIgnoreCase(name)) {
			col_129(value);
			return;
		}
		if ($col_130.equalsIgnoreCase(name)) {
			col_130(value);
			return;
		}
		if ($col_131.equalsIgnoreCase(name)) {
			col_131(value);
			return;
		}
		if ($col_132.equalsIgnoreCase(name)) {
			col_132(value);
			return;
		}
		if ($col_134.equalsIgnoreCase(name)) {
			col_134(value);
			return;
		}
		if ($col_135.equalsIgnoreCase(name)) {
			col_135(value);
			return;
		}
		if ($col_136.equalsIgnoreCase(name)) {
			col_136(value);
			return;
		}
		if ($col_137.equalsIgnoreCase(name)) {
			col_137(value);
			return;
		}
		if ($col_138.equalsIgnoreCase(name)) {
			col_138(value);
			return;
		}
		if ($col_139.equalsIgnoreCase(name)) {
			col_139(value);
			return;
		}
		if ($col_141.equalsIgnoreCase(name)) {
			col_141(value);
			return;
		}
		if ($col_142.equalsIgnoreCase(name)) {
			col_142(value);
			return;
		}
		if ($col_143.equalsIgnoreCase(name)) {
			col_143(value);
			return;
		}
		if ($col_144.equalsIgnoreCase(name)) {
			col_144(value);
			return;
		}
		if ($col_145.equalsIgnoreCase(name)) {
			col_145(value);
			return;
		}
		if ($col_146.equalsIgnoreCase(name)) {
			col_146(value);
			return;
		}
		if ($col_148.equalsIgnoreCase(name)) {
			col_148(value);
			return;
		}
		if ($col_149.equalsIgnoreCase(name)) {
			col_149(value);
			return;
		}
		if ($col_150.equalsIgnoreCase(name)) {
			col_150(value);
			return;
		}
		if ($col_151.equalsIgnoreCase(name)) {
			col_151(value);
			return;
		}
		if ($col_152.equalsIgnoreCase(name)) {
			col_152(value);
			return;
		}
		if ($col_153.equalsIgnoreCase(name)) {
			col_153(value);
			return;
		}
		if ($col_155.equalsIgnoreCase(name)) {
			col_155(value);
			return;
		}
		if ($col_156.equalsIgnoreCase(name)) {
			col_156(value);
			return;
		}
		if ($col_157.equalsIgnoreCase(name)) {
			col_157(value);
			return;
		}
		if ($col_158.equalsIgnoreCase(name)) {
			col_158(value);
			return;
		}
		if ($col_159.equalsIgnoreCase(name)) {
			col_159(value);
			return;
		}
		if ($col_160.equalsIgnoreCase(name)) {
			col_160(value);
			return;
		}
		if ($col_162.equalsIgnoreCase(name)) {
			col_162(value);
			return;
		}
		if ($col_163.equalsIgnoreCase(name)) {
			col_163(value);
			return;
		}
		if ($col_164.equalsIgnoreCase(name)) {
			col_164(value);
			return;
		}
		if ($col_165.equalsIgnoreCase(name)) {
			col_165(value);
			return;
		}
		if ($col_166.equalsIgnoreCase(name)) {
			col_166(value);
			return;
		}
		if ($col_167.equalsIgnoreCase(name)) {
			col_167(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		if ($col_100.equalsIgnoreCase(name)) {
			col_100(value);
			return;
		}
		if ($col_101.equalsIgnoreCase(name)) {
			col_101(value);
			return;
		}
		if ($col_102.equalsIgnoreCase(name)) {
			col_102(value);
			return;
		}
		if ($col_103.equalsIgnoreCase(name)) {
			col_103(value);
			return;
		}
		if ($col_104.equalsIgnoreCase(name)) {
			col_104(value);
			return;
		}
		if ($col_106.equalsIgnoreCase(name)) {
			col_106(value);
			return;
		}
		if ($col_107.equalsIgnoreCase(name)) {
			col_107(value);
			return;
		}
		if ($col_108.equalsIgnoreCase(name)) {
			col_108(value);
			return;
		}
		if ($col_109.equalsIgnoreCase(name)) {
			col_109(value);
			return;
		}
		if ($col_110.equalsIgnoreCase(name)) {
			col_110(value);
			return;
		}
		if ($col_111.equalsIgnoreCase(name)) {
			col_111(value);
			return;
		}
		if ($col_113.equalsIgnoreCase(name)) {
			col_113(value);
			return;
		}
		if ($col_114.equalsIgnoreCase(name)) {
			col_114(value);
			return;
		}
		if ($col_115.equalsIgnoreCase(name)) {
			col_115(value);
			return;
		}
		if ($col_116.equalsIgnoreCase(name)) {
			col_116(value);
			return;
		}
		if ($col_117.equalsIgnoreCase(name)) {
			col_117(value);
			return;
		}
		if ($col_118.equalsIgnoreCase(name)) {
			col_118(value);
			return;
		}
		if ($col_120.equalsIgnoreCase(name)) {
			col_120(value);
			return;
		}
		if ($col_121.equalsIgnoreCase(name)) {
			col_121(value);
			return;
		}
		if ($col_122.equalsIgnoreCase(name)) {
			col_122(value);
			return;
		}
		if ($col_123.equalsIgnoreCase(name)) {
			col_123(value);
			return;
		}
		if ($col_124.equalsIgnoreCase(name)) {
			col_124(value);
			return;
		}
		if ($col_125.equalsIgnoreCase(name)) {
			col_125(value);
			return;
		}
		if ($col_127.equalsIgnoreCase(name)) {
			col_127(value);
			return;
		}
		if ($col_128.equalsIgnoreCase(name)) {
			col_128(value);
			return;
		}
		if ($col_129.equalsIgnoreCase(name)) {
			col_129(value);
			return;
		}
		if ($col_130.equalsIgnoreCase(name)) {
			col_130(value);
			return;
		}
		if ($col_131.equalsIgnoreCase(name)) {
			col_131(value);
			return;
		}
		if ($col_132.equalsIgnoreCase(name)) {
			col_132(value);
			return;
		}
		if ($col_134.equalsIgnoreCase(name)) {
			col_134(value);
			return;
		}
		if ($col_135.equalsIgnoreCase(name)) {
			col_135(value);
			return;
		}
		if ($col_136.equalsIgnoreCase(name)) {
			col_136(value);
			return;
		}
		if ($col_137.equalsIgnoreCase(name)) {
			col_137(value);
			return;
		}
		if ($col_138.equalsIgnoreCase(name)) {
			col_138(value);
			return;
		}
		if ($col_139.equalsIgnoreCase(name)) {
			col_139(value);
			return;
		}
		if ($col_141.equalsIgnoreCase(name)) {
			col_141(value);
			return;
		}
		if ($col_142.equalsIgnoreCase(name)) {
			col_142(value);
			return;
		}
		if ($col_143.equalsIgnoreCase(name)) {
			col_143(value);
			return;
		}
		if ($col_144.equalsIgnoreCase(name)) {
			col_144(value);
			return;
		}
		if ($col_145.equalsIgnoreCase(name)) {
			col_145(value);
			return;
		}
		if ($col_146.equalsIgnoreCase(name)) {
			col_146(value);
			return;
		}
		if ($col_148.equalsIgnoreCase(name)) {
			col_148(value);
			return;
		}
		if ($col_149.equalsIgnoreCase(name)) {
			col_149(value);
			return;
		}
		if ($col_150.equalsIgnoreCase(name)) {
			col_150(value);
			return;
		}
		if ($col_151.equalsIgnoreCase(name)) {
			col_151(value);
			return;
		}
		if ($col_152.equalsIgnoreCase(name)) {
			col_152(value);
			return;
		}
		if ($col_153.equalsIgnoreCase(name)) {
			col_153(value);
			return;
		}
		if ($col_155.equalsIgnoreCase(name)) {
			col_155(value);
			return;
		}
		if ($col_156.equalsIgnoreCase(name)) {
			col_156(value);
			return;
		}
		if ($col_157.equalsIgnoreCase(name)) {
			col_157(value);
			return;
		}
		if ($col_158.equalsIgnoreCase(name)) {
			col_158(value);
			return;
		}
		if ($col_159.equalsIgnoreCase(name)) {
			col_159(value);
			return;
		}
		if ($col_160.equalsIgnoreCase(name)) {
			col_160(value);
			return;
		}
		if ($col_162.equalsIgnoreCase(name)) {
			col_162(value);
			return;
		}
		if ($col_163.equalsIgnoreCase(name)) {
			col_163(value);
			return;
		}
		if ($col_164.equalsIgnoreCase(name)) {
			col_164(value);
			return;
		}
		if ($col_165.equalsIgnoreCase(name)) {
			col_165(value);
			return;
		}
		if ($col_166.equalsIgnoreCase(name)) {
			col_166(value);
			return;
		}
		if ($col_167.equalsIgnoreCase(name)) {
			col_167(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		if ($col_100.equalsIgnoreCase(name)) {
			col_100(value);
			return;
		}
		if ($col_101.equalsIgnoreCase(name)) {
			col_101(value);
			return;
		}
		if ($col_102.equalsIgnoreCase(name)) {
			col_102(value);
			return;
		}
		if ($col_103.equalsIgnoreCase(name)) {
			col_103(value);
			return;
		}
		if ($col_104.equalsIgnoreCase(name)) {
			col_104(value);
			return;
		}
		if ($col_106.equalsIgnoreCase(name)) {
			col_106(value);
			return;
		}
		if ($col_107.equalsIgnoreCase(name)) {
			col_107(value);
			return;
		}
		if ($col_108.equalsIgnoreCase(name)) {
			col_108(value);
			return;
		}
		if ($col_109.equalsIgnoreCase(name)) {
			col_109(value);
			return;
		}
		if ($col_110.equalsIgnoreCase(name)) {
			col_110(value);
			return;
		}
		if ($col_111.equalsIgnoreCase(name)) {
			col_111(value);
			return;
		}
		if ($col_113.equalsIgnoreCase(name)) {
			col_113(value);
			return;
		}
		if ($col_114.equalsIgnoreCase(name)) {
			col_114(value);
			return;
		}
		if ($col_115.equalsIgnoreCase(name)) {
			col_115(value);
			return;
		}
		if ($col_116.equalsIgnoreCase(name)) {
			col_116(value);
			return;
		}
		if ($col_117.equalsIgnoreCase(name)) {
			col_117(value);
			return;
		}
		if ($col_118.equalsIgnoreCase(name)) {
			col_118(value);
			return;
		}
		if ($col_120.equalsIgnoreCase(name)) {
			col_120(value);
			return;
		}
		if ($col_121.equalsIgnoreCase(name)) {
			col_121(value);
			return;
		}
		if ($col_122.equalsIgnoreCase(name)) {
			col_122(value);
			return;
		}
		if ($col_123.equalsIgnoreCase(name)) {
			col_123(value);
			return;
		}
		if ($col_124.equalsIgnoreCase(name)) {
			col_124(value);
			return;
		}
		if ($col_125.equalsIgnoreCase(name)) {
			col_125(value);
			return;
		}
		if ($col_127.equalsIgnoreCase(name)) {
			col_127(value);
			return;
		}
		if ($col_128.equalsIgnoreCase(name)) {
			col_128(value);
			return;
		}
		if ($col_129.equalsIgnoreCase(name)) {
			col_129(value);
			return;
		}
		if ($col_130.equalsIgnoreCase(name)) {
			col_130(value);
			return;
		}
		if ($col_131.equalsIgnoreCase(name)) {
			col_131(value);
			return;
		}
		if ($col_132.equalsIgnoreCase(name)) {
			col_132(value);
			return;
		}
		if ($col_134.equalsIgnoreCase(name)) {
			col_134(value);
			return;
		}
		if ($col_135.equalsIgnoreCase(name)) {
			col_135(value);
			return;
		}
		if ($col_136.equalsIgnoreCase(name)) {
			col_136(value);
			return;
		}
		if ($col_137.equalsIgnoreCase(name)) {
			col_137(value);
			return;
		}
		if ($col_138.equalsIgnoreCase(name)) {
			col_138(value);
			return;
		}
		if ($col_139.equalsIgnoreCase(name)) {
			col_139(value);
			return;
		}
		if ($col_141.equalsIgnoreCase(name)) {
			col_141(value);
			return;
		}
		if ($col_142.equalsIgnoreCase(name)) {
			col_142(value);
			return;
		}
		if ($col_143.equalsIgnoreCase(name)) {
			col_143(value);
			return;
		}
		if ($col_144.equalsIgnoreCase(name)) {
			col_144(value);
			return;
		}
		if ($col_145.equalsIgnoreCase(name)) {
			col_145(value);
			return;
		}
		if ($col_146.equalsIgnoreCase(name)) {
			col_146(value);
			return;
		}
		if ($col_148.equalsIgnoreCase(name)) {
			col_148(value);
			return;
		}
		if ($col_149.equalsIgnoreCase(name)) {
			col_149(value);
			return;
		}
		if ($col_150.equalsIgnoreCase(name)) {
			col_150(value);
			return;
		}
		if ($col_151.equalsIgnoreCase(name)) {
			col_151(value);
			return;
		}
		if ($col_152.equalsIgnoreCase(name)) {
			col_152(value);
			return;
		}
		if ($col_153.equalsIgnoreCase(name)) {
			col_153(value);
			return;
		}
		if ($col_155.equalsIgnoreCase(name)) {
			col_155(value);
			return;
		}
		if ($col_156.equalsIgnoreCase(name)) {
			col_156(value);
			return;
		}
		if ($col_157.equalsIgnoreCase(name)) {
			col_157(value);
			return;
		}
		if ($col_158.equalsIgnoreCase(name)) {
			col_158(value);
			return;
		}
		if ($col_159.equalsIgnoreCase(name)) {
			col_159(value);
			return;
		}
		if ($col_160.equalsIgnoreCase(name)) {
			col_160(value);
			return;
		}
		if ($col_162.equalsIgnoreCase(name)) {
			col_162(value);
			return;
		}
		if ($col_163.equalsIgnoreCase(name)) {
			col_163(value);
			return;
		}
		if ($col_164.equalsIgnoreCase(name)) {
			col_164(value);
			return;
		}
		if ($col_165.equalsIgnoreCase(name)) {
			col_165(value);
			return;
		}
		if ($col_166.equalsIgnoreCase(name)) {
			col_166(value);
			return;
		}
		if ($col_167.equalsIgnoreCase(name)) {
			col_167(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		if ($col_100.equalsIgnoreCase(name)) {
			col_100(value);
			return;
		}
		if ($col_101.equalsIgnoreCase(name)) {
			col_101(value);
			return;
		}
		if ($col_102.equalsIgnoreCase(name)) {
			col_102(value);
			return;
		}
		if ($col_103.equalsIgnoreCase(name)) {
			col_103(value);
			return;
		}
		if ($col_104.equalsIgnoreCase(name)) {
			col_104(value);
			return;
		}
		if ($col_106.equalsIgnoreCase(name)) {
			col_106(value);
			return;
		}
		if ($col_107.equalsIgnoreCase(name)) {
			col_107(value);
			return;
		}
		if ($col_108.equalsIgnoreCase(name)) {
			col_108(value);
			return;
		}
		if ($col_109.equalsIgnoreCase(name)) {
			col_109(value);
			return;
		}
		if ($col_110.equalsIgnoreCase(name)) {
			col_110(value);
			return;
		}
		if ($col_111.equalsIgnoreCase(name)) {
			col_111(value);
			return;
		}
		if ($col_113.equalsIgnoreCase(name)) {
			col_113(value);
			return;
		}
		if ($col_114.equalsIgnoreCase(name)) {
			col_114(value);
			return;
		}
		if ($col_115.equalsIgnoreCase(name)) {
			col_115(value);
			return;
		}
		if ($col_116.equalsIgnoreCase(name)) {
			col_116(value);
			return;
		}
		if ($col_117.equalsIgnoreCase(name)) {
			col_117(value);
			return;
		}
		if ($col_118.equalsIgnoreCase(name)) {
			col_118(value);
			return;
		}
		if ($col_120.equalsIgnoreCase(name)) {
			col_120(value);
			return;
		}
		if ($col_121.equalsIgnoreCase(name)) {
			col_121(value);
			return;
		}
		if ($col_122.equalsIgnoreCase(name)) {
			col_122(value);
			return;
		}
		if ($col_123.equalsIgnoreCase(name)) {
			col_123(value);
			return;
		}
		if ($col_124.equalsIgnoreCase(name)) {
			col_124(value);
			return;
		}
		if ($col_125.equalsIgnoreCase(name)) {
			col_125(value);
			return;
		}
		if ($col_127.equalsIgnoreCase(name)) {
			col_127(value);
			return;
		}
		if ($col_128.equalsIgnoreCase(name)) {
			col_128(value);
			return;
		}
		if ($col_129.equalsIgnoreCase(name)) {
			col_129(value);
			return;
		}
		if ($col_130.equalsIgnoreCase(name)) {
			col_130(value);
			return;
		}
		if ($col_131.equalsIgnoreCase(name)) {
			col_131(value);
			return;
		}
		if ($col_132.equalsIgnoreCase(name)) {
			col_132(value);
			return;
		}
		if ($col_134.equalsIgnoreCase(name)) {
			col_134(value);
			return;
		}
		if ($col_135.equalsIgnoreCase(name)) {
			col_135(value);
			return;
		}
		if ($col_136.equalsIgnoreCase(name)) {
			col_136(value);
			return;
		}
		if ($col_137.equalsIgnoreCase(name)) {
			col_137(value);
			return;
		}
		if ($col_138.equalsIgnoreCase(name)) {
			col_138(value);
			return;
		}
		if ($col_139.equalsIgnoreCase(name)) {
			col_139(value);
			return;
		}
		if ($col_141.equalsIgnoreCase(name)) {
			col_141(value);
			return;
		}
		if ($col_142.equalsIgnoreCase(name)) {
			col_142(value);
			return;
		}
		if ($col_143.equalsIgnoreCase(name)) {
			col_143(value);
			return;
		}
		if ($col_144.equalsIgnoreCase(name)) {
			col_144(value);
			return;
		}
		if ($col_145.equalsIgnoreCase(name)) {
			col_145(value);
			return;
		}
		if ($col_146.equalsIgnoreCase(name)) {
			col_146(value);
			return;
		}
		if ($col_148.equalsIgnoreCase(name)) {
			col_148(value);
			return;
		}
		if ($col_149.equalsIgnoreCase(name)) {
			col_149(value);
			return;
		}
		if ($col_150.equalsIgnoreCase(name)) {
			col_150(value);
			return;
		}
		if ($col_151.equalsIgnoreCase(name)) {
			col_151(value);
			return;
		}
		if ($col_152.equalsIgnoreCase(name)) {
			col_152(value);
			return;
		}
		if ($col_153.equalsIgnoreCase(name)) {
			col_153(value);
			return;
		}
		if ($col_155.equalsIgnoreCase(name)) {
			col_155(value);
			return;
		}
		if ($col_156.equalsIgnoreCase(name)) {
			col_156(value);
			return;
		}
		if ($col_157.equalsIgnoreCase(name)) {
			col_157(value);
			return;
		}
		if ($col_158.equalsIgnoreCase(name)) {
			col_158(value);
			return;
		}
		if ($col_159.equalsIgnoreCase(name)) {
			col_159(value);
			return;
		}
		if ($col_160.equalsIgnoreCase(name)) {
			col_160(value);
			return;
		}
		if ($col_162.equalsIgnoreCase(name)) {
			col_162(value);
			return;
		}
		if ($col_163.equalsIgnoreCase(name)) {
			col_163(value);
			return;
		}
		if ($col_164.equalsIgnoreCase(name)) {
			col_164(value);
			return;
		}
		if ($col_165.equalsIgnoreCase(name)) {
			col_165(value);
			return;
		}
		if ($col_166.equalsIgnoreCase(name)) {
			col_166(value);
			return;
		}
		if ($col_167.equalsIgnoreCase(name)) {
			col_167(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		if ($col_100.equalsIgnoreCase(name)) {
			col_100(value);
			return;
		}
		if ($col_101.equalsIgnoreCase(name)) {
			col_101(value);
			return;
		}
		if ($col_102.equalsIgnoreCase(name)) {
			col_102(value);
			return;
		}
		if ($col_103.equalsIgnoreCase(name)) {
			col_103(value);
			return;
		}
		if ($col_104.equalsIgnoreCase(name)) {
			col_104(value);
			return;
		}
		if ($col_106.equalsIgnoreCase(name)) {
			col_106(value);
			return;
		}
		if ($col_107.equalsIgnoreCase(name)) {
			col_107(value);
			return;
		}
		if ($col_108.equalsIgnoreCase(name)) {
			col_108(value);
			return;
		}
		if ($col_109.equalsIgnoreCase(name)) {
			col_109(value);
			return;
		}
		if ($col_110.equalsIgnoreCase(name)) {
			col_110(value);
			return;
		}
		if ($col_111.equalsIgnoreCase(name)) {
			col_111(value);
			return;
		}
		if ($col_113.equalsIgnoreCase(name)) {
			col_113(value);
			return;
		}
		if ($col_114.equalsIgnoreCase(name)) {
			col_114(value);
			return;
		}
		if ($col_115.equalsIgnoreCase(name)) {
			col_115(value);
			return;
		}
		if ($col_116.equalsIgnoreCase(name)) {
			col_116(value);
			return;
		}
		if ($col_117.equalsIgnoreCase(name)) {
			col_117(value);
			return;
		}
		if ($col_118.equalsIgnoreCase(name)) {
			col_118(value);
			return;
		}
		if ($col_120.equalsIgnoreCase(name)) {
			col_120(value);
			return;
		}
		if ($col_121.equalsIgnoreCase(name)) {
			col_121(value);
			return;
		}
		if ($col_122.equalsIgnoreCase(name)) {
			col_122(value);
			return;
		}
		if ($col_123.equalsIgnoreCase(name)) {
			col_123(value);
			return;
		}
		if ($col_124.equalsIgnoreCase(name)) {
			col_124(value);
			return;
		}
		if ($col_125.equalsIgnoreCase(name)) {
			col_125(value);
			return;
		}
		if ($col_127.equalsIgnoreCase(name)) {
			col_127(value);
			return;
		}
		if ($col_128.equalsIgnoreCase(name)) {
			col_128(value);
			return;
		}
		if ($col_129.equalsIgnoreCase(name)) {
			col_129(value);
			return;
		}
		if ($col_130.equalsIgnoreCase(name)) {
			col_130(value);
			return;
		}
		if ($col_131.equalsIgnoreCase(name)) {
			col_131(value);
			return;
		}
		if ($col_132.equalsIgnoreCase(name)) {
			col_132(value);
			return;
		}
		if ($col_134.equalsIgnoreCase(name)) {
			col_134(value);
			return;
		}
		if ($col_135.equalsIgnoreCase(name)) {
			col_135(value);
			return;
		}
		if ($col_136.equalsIgnoreCase(name)) {
			col_136(value);
			return;
		}
		if ($col_137.equalsIgnoreCase(name)) {
			col_137(value);
			return;
		}
		if ($col_138.equalsIgnoreCase(name)) {
			col_138(value);
			return;
		}
		if ($col_139.equalsIgnoreCase(name)) {
			col_139(value);
			return;
		}
		if ($col_141.equalsIgnoreCase(name)) {
			col_141(value);
			return;
		}
		if ($col_142.equalsIgnoreCase(name)) {
			col_142(value);
			return;
		}
		if ($col_143.equalsIgnoreCase(name)) {
			col_143(value);
			return;
		}
		if ($col_144.equalsIgnoreCase(name)) {
			col_144(value);
			return;
		}
		if ($col_145.equalsIgnoreCase(name)) {
			col_145(value);
			return;
		}
		if ($col_146.equalsIgnoreCase(name)) {
			col_146(value);
			return;
		}
		if ($col_148.equalsIgnoreCase(name)) {
			col_148(value);
			return;
		}
		if ($col_149.equalsIgnoreCase(name)) {
			col_149(value);
			return;
		}
		if ($col_150.equalsIgnoreCase(name)) {
			col_150(value);
			return;
		}
		if ($col_151.equalsIgnoreCase(name)) {
			col_151(value);
			return;
		}
		if ($col_152.equalsIgnoreCase(name)) {
			col_152(value);
			return;
		}
		if ($col_153.equalsIgnoreCase(name)) {
			col_153(value);
			return;
		}
		if ($col_155.equalsIgnoreCase(name)) {
			col_155(value);
			return;
		}
		if ($col_156.equalsIgnoreCase(name)) {
			col_156(value);
			return;
		}
		if ($col_157.equalsIgnoreCase(name)) {
			col_157(value);
			return;
		}
		if ($col_158.equalsIgnoreCase(name)) {
			col_158(value);
			return;
		}
		if ($col_159.equalsIgnoreCase(name)) {
			col_159(value);
			return;
		}
		if ($col_160.equalsIgnoreCase(name)) {
			col_160(value);
			return;
		}
		if ($col_162.equalsIgnoreCase(name)) {
			col_162(value);
			return;
		}
		if ($col_163.equalsIgnoreCase(name)) {
			col_163(value);
			return;
		}
		if ($col_164.equalsIgnoreCase(name)) {
			col_164(value);
			return;
		}
		if ($col_165.equalsIgnoreCase(name)) {
			col_165(value);
			return;
		}
		if ($col_166.equalsIgnoreCase(name)) {
			col_166(value);
			return;
		}
		if ($col_167.equalsIgnoreCase(name)) {
			col_167(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
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
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		if ($col_100.equalsIgnoreCase(name)) {
			col_100(value);
			return;
		}
		if ($col_101.equalsIgnoreCase(name)) {
			col_101(value);
			return;
		}
		if ($col_102.equalsIgnoreCase(name)) {
			col_102(value);
			return;
		}
		if ($col_103.equalsIgnoreCase(name)) {
			col_103(value);
			return;
		}
		if ($col_104.equalsIgnoreCase(name)) {
			col_104(value);
			return;
		}
		if ($col_106.equalsIgnoreCase(name)) {
			col_106(value);
			return;
		}
		if ($col_107.equalsIgnoreCase(name)) {
			col_107(value);
			return;
		}
		if ($col_108.equalsIgnoreCase(name)) {
			col_108(value);
			return;
		}
		if ($col_109.equalsIgnoreCase(name)) {
			col_109(value);
			return;
		}
		if ($col_110.equalsIgnoreCase(name)) {
			col_110(value);
			return;
		}
		if ($col_111.equalsIgnoreCase(name)) {
			col_111(value);
			return;
		}
		if ($col_113.equalsIgnoreCase(name)) {
			col_113(value);
			return;
		}
		if ($col_114.equalsIgnoreCase(name)) {
			col_114(value);
			return;
		}
		if ($col_115.equalsIgnoreCase(name)) {
			col_115(value);
			return;
		}
		if ($col_116.equalsIgnoreCase(name)) {
			col_116(value);
			return;
		}
		if ($col_117.equalsIgnoreCase(name)) {
			col_117(value);
			return;
		}
		if ($col_118.equalsIgnoreCase(name)) {
			col_118(value);
			return;
		}
		if ($col_120.equalsIgnoreCase(name)) {
			col_120(value);
			return;
		}
		if ($col_121.equalsIgnoreCase(name)) {
			col_121(value);
			return;
		}
		if ($col_122.equalsIgnoreCase(name)) {
			col_122(value);
			return;
		}
		if ($col_123.equalsIgnoreCase(name)) {
			col_123(value);
			return;
		}
		if ($col_124.equalsIgnoreCase(name)) {
			col_124(value);
			return;
		}
		if ($col_125.equalsIgnoreCase(name)) {
			col_125(value);
			return;
		}
		if ($col_127.equalsIgnoreCase(name)) {
			col_127(value);
			return;
		}
		if ($col_128.equalsIgnoreCase(name)) {
			col_128(value);
			return;
		}
		if ($col_129.equalsIgnoreCase(name)) {
			col_129(value);
			return;
		}
		if ($col_130.equalsIgnoreCase(name)) {
			col_130(value);
			return;
		}
		if ($col_131.equalsIgnoreCase(name)) {
			col_131(value);
			return;
		}
		if ($col_132.equalsIgnoreCase(name)) {
			col_132(value);
			return;
		}
		if ($col_134.equalsIgnoreCase(name)) {
			col_134(value);
			return;
		}
		if ($col_135.equalsIgnoreCase(name)) {
			col_135(value);
			return;
		}
		if ($col_136.equalsIgnoreCase(name)) {
			col_136(value);
			return;
		}
		if ($col_137.equalsIgnoreCase(name)) {
			col_137(value);
			return;
		}
		if ($col_138.equalsIgnoreCase(name)) {
			col_138(value);
			return;
		}
		if ($col_139.equalsIgnoreCase(name)) {
			col_139(value);
			return;
		}
		if ($col_141.equalsIgnoreCase(name)) {
			col_141(value);
			return;
		}
		if ($col_142.equalsIgnoreCase(name)) {
			col_142(value);
			return;
		}
		if ($col_143.equalsIgnoreCase(name)) {
			col_143(value);
			return;
		}
		if ($col_144.equalsIgnoreCase(name)) {
			col_144(value);
			return;
		}
		if ($col_145.equalsIgnoreCase(name)) {
			col_145(value);
			return;
		}
		if ($col_146.equalsIgnoreCase(name)) {
			col_146(value);
			return;
		}
		if ($col_148.equalsIgnoreCase(name)) {
			col_148(value);
			return;
		}
		if ($col_149.equalsIgnoreCase(name)) {
			col_149(value);
			return;
		}
		if ($col_150.equalsIgnoreCase(name)) {
			col_150(value);
			return;
		}
		if ($col_151.equalsIgnoreCase(name)) {
			col_151(value);
			return;
		}
		if ($col_152.equalsIgnoreCase(name)) {
			col_152(value);
			return;
		}
		if ($col_153.equalsIgnoreCase(name)) {
			col_153(value);
			return;
		}
		if ($col_155.equalsIgnoreCase(name)) {
			col_155(value);
			return;
		}
		if ($col_156.equalsIgnoreCase(name)) {
			col_156(value);
			return;
		}
		if ($col_157.equalsIgnoreCase(name)) {
			col_157(value);
			return;
		}
		if ($col_158.equalsIgnoreCase(name)) {
			col_158(value);
			return;
		}
		if ($col_159.equalsIgnoreCase(name)) {
			col_159(value);
			return;
		}
		if ($col_160.equalsIgnoreCase(name)) {
			col_160(value);
			return;
		}
		if ($col_162.equalsIgnoreCase(name)) {
			col_162(value);
			return;
		}
		if ($col_163.equalsIgnoreCase(name)) {
			col_163(value);
			return;
		}
		if ($col_164.equalsIgnoreCase(name)) {
			col_164(value);
			return;
		}
		if ($col_165.equalsIgnoreCase(name)) {
			col_165(value);
			return;
		}
		if ($col_166.equalsIgnoreCase(name)) {
			col_166(value);
			return;
		}
		if ($col_167.equalsIgnoreCase(name)) {
			col_167(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		if ($col_100.equalsIgnoreCase(name)) {
			col_100(value);
			return;
		}
		if ($col_101.equalsIgnoreCase(name)) {
			col_101(value);
			return;
		}
		if ($col_102.equalsIgnoreCase(name)) {
			col_102(value);
			return;
		}
		if ($col_103.equalsIgnoreCase(name)) {
			col_103(value);
			return;
		}
		if ($col_104.equalsIgnoreCase(name)) {
			col_104(value);
			return;
		}
		if ($col_106.equalsIgnoreCase(name)) {
			col_106(value);
			return;
		}
		if ($col_107.equalsIgnoreCase(name)) {
			col_107(value);
			return;
		}
		if ($col_108.equalsIgnoreCase(name)) {
			col_108(value);
			return;
		}
		if ($col_109.equalsIgnoreCase(name)) {
			col_109(value);
			return;
		}
		if ($col_110.equalsIgnoreCase(name)) {
			col_110(value);
			return;
		}
		if ($col_111.equalsIgnoreCase(name)) {
			col_111(value);
			return;
		}
		if ($col_113.equalsIgnoreCase(name)) {
			col_113(value);
			return;
		}
		if ($col_114.equalsIgnoreCase(name)) {
			col_114(value);
			return;
		}
		if ($col_115.equalsIgnoreCase(name)) {
			col_115(value);
			return;
		}
		if ($col_116.equalsIgnoreCase(name)) {
			col_116(value);
			return;
		}
		if ($col_117.equalsIgnoreCase(name)) {
			col_117(value);
			return;
		}
		if ($col_118.equalsIgnoreCase(name)) {
			col_118(value);
			return;
		}
		if ($col_120.equalsIgnoreCase(name)) {
			col_120(value);
			return;
		}
		if ($col_121.equalsIgnoreCase(name)) {
			col_121(value);
			return;
		}
		if ($col_122.equalsIgnoreCase(name)) {
			col_122(value);
			return;
		}
		if ($col_123.equalsIgnoreCase(name)) {
			col_123(value);
			return;
		}
		if ($col_124.equalsIgnoreCase(name)) {
			col_124(value);
			return;
		}
		if ($col_125.equalsIgnoreCase(name)) {
			col_125(value);
			return;
		}
		if ($col_127.equalsIgnoreCase(name)) {
			col_127(value);
			return;
		}
		if ($col_128.equalsIgnoreCase(name)) {
			col_128(value);
			return;
		}
		if ($col_129.equalsIgnoreCase(name)) {
			col_129(value);
			return;
		}
		if ($col_130.equalsIgnoreCase(name)) {
			col_130(value);
			return;
		}
		if ($col_131.equalsIgnoreCase(name)) {
			col_131(value);
			return;
		}
		if ($col_132.equalsIgnoreCase(name)) {
			col_132(value);
			return;
		}
		if ($col_134.equalsIgnoreCase(name)) {
			col_134(value);
			return;
		}
		if ($col_135.equalsIgnoreCase(name)) {
			col_135(value);
			return;
		}
		if ($col_136.equalsIgnoreCase(name)) {
			col_136(value);
			return;
		}
		if ($col_137.equalsIgnoreCase(name)) {
			col_137(value);
			return;
		}
		if ($col_138.equalsIgnoreCase(name)) {
			col_138(value);
			return;
		}
		if ($col_139.equalsIgnoreCase(name)) {
			col_139(value);
			return;
		}
		if ($col_141.equalsIgnoreCase(name)) {
			col_141(value);
			return;
		}
		if ($col_142.equalsIgnoreCase(name)) {
			col_142(value);
			return;
		}
		if ($col_143.equalsIgnoreCase(name)) {
			col_143(value);
			return;
		}
		if ($col_144.equalsIgnoreCase(name)) {
			col_144(value);
			return;
		}
		if ($col_145.equalsIgnoreCase(name)) {
			col_145(value);
			return;
		}
		if ($col_146.equalsIgnoreCase(name)) {
			col_146(value);
			return;
		}
		if ($col_148.equalsIgnoreCase(name)) {
			col_148(value);
			return;
		}
		if ($col_149.equalsIgnoreCase(name)) {
			col_149(value);
			return;
		}
		if ($col_150.equalsIgnoreCase(name)) {
			col_150(value);
			return;
		}
		if ($col_151.equalsIgnoreCase(name)) {
			col_151(value);
			return;
		}
		if ($col_152.equalsIgnoreCase(name)) {
			col_152(value);
			return;
		}
		if ($col_153.equalsIgnoreCase(name)) {
			col_153(value);
			return;
		}
		if ($col_155.equalsIgnoreCase(name)) {
			col_155(value);
			return;
		}
		if ($col_156.equalsIgnoreCase(name)) {
			col_156(value);
			return;
		}
		if ($col_157.equalsIgnoreCase(name)) {
			col_157(value);
			return;
		}
		if ($col_158.equalsIgnoreCase(name)) {
			col_158(value);
			return;
		}
		if ($col_159.equalsIgnoreCase(name)) {
			col_159(value);
			return;
		}
		if ($col_160.equalsIgnoreCase(name)) {
			col_160(value);
			return;
		}
		if ($col_162.equalsIgnoreCase(name)) {
			col_162(value);
			return;
		}
		if ($col_163.equalsIgnoreCase(name)) {
			col_163(value);
			return;
		}
		if ($col_164.equalsIgnoreCase(name)) {
			col_164(value);
			return;
		}
		if ($col_165.equalsIgnoreCase(name)) {
			col_165(value);
			return;
		}
		if ($col_166.equalsIgnoreCase(name)) {
			col_166(value);
			return;
		}
		if ($col_167.equalsIgnoreCase(name)) {
			col_167(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		if ($col_100.equalsIgnoreCase(name)) {
			col_100(value);
			return;
		}
		if ($col_101.equalsIgnoreCase(name)) {
			col_101(value);
			return;
		}
		if ($col_102.equalsIgnoreCase(name)) {
			col_102(value);
			return;
		}
		if ($col_103.equalsIgnoreCase(name)) {
			col_103(value);
			return;
		}
		if ($col_104.equalsIgnoreCase(name)) {
			col_104(value);
			return;
		}
		if ($col_106.equalsIgnoreCase(name)) {
			col_106(value);
			return;
		}
		if ($col_107.equalsIgnoreCase(name)) {
			col_107(value);
			return;
		}
		if ($col_108.equalsIgnoreCase(name)) {
			col_108(value);
			return;
		}
		if ($col_109.equalsIgnoreCase(name)) {
			col_109(value);
			return;
		}
		if ($col_110.equalsIgnoreCase(name)) {
			col_110(value);
			return;
		}
		if ($col_111.equalsIgnoreCase(name)) {
			col_111(value);
			return;
		}
		if ($col_113.equalsIgnoreCase(name)) {
			col_113(value);
			return;
		}
		if ($col_114.equalsIgnoreCase(name)) {
			col_114(value);
			return;
		}
		if ($col_115.equalsIgnoreCase(name)) {
			col_115(value);
			return;
		}
		if ($col_116.equalsIgnoreCase(name)) {
			col_116(value);
			return;
		}
		if ($col_117.equalsIgnoreCase(name)) {
			col_117(value);
			return;
		}
		if ($col_118.equalsIgnoreCase(name)) {
			col_118(value);
			return;
		}
		if ($col_120.equalsIgnoreCase(name)) {
			col_120(value);
			return;
		}
		if ($col_121.equalsIgnoreCase(name)) {
			col_121(value);
			return;
		}
		if ($col_122.equalsIgnoreCase(name)) {
			col_122(value);
			return;
		}
		if ($col_123.equalsIgnoreCase(name)) {
			col_123(value);
			return;
		}
		if ($col_124.equalsIgnoreCase(name)) {
			col_124(value);
			return;
		}
		if ($col_125.equalsIgnoreCase(name)) {
			col_125(value);
			return;
		}
		if ($col_127.equalsIgnoreCase(name)) {
			col_127(value);
			return;
		}
		if ($col_128.equalsIgnoreCase(name)) {
			col_128(value);
			return;
		}
		if ($col_129.equalsIgnoreCase(name)) {
			col_129(value);
			return;
		}
		if ($col_130.equalsIgnoreCase(name)) {
			col_130(value);
			return;
		}
		if ($col_131.equalsIgnoreCase(name)) {
			col_131(value);
			return;
		}
		if ($col_132.equalsIgnoreCase(name)) {
			col_132(value);
			return;
		}
		if ($col_134.equalsIgnoreCase(name)) {
			col_134(value);
			return;
		}
		if ($col_135.equalsIgnoreCase(name)) {
			col_135(value);
			return;
		}
		if ($col_136.equalsIgnoreCase(name)) {
			col_136(value);
			return;
		}
		if ($col_137.equalsIgnoreCase(name)) {
			col_137(value);
			return;
		}
		if ($col_138.equalsIgnoreCase(name)) {
			col_138(value);
			return;
		}
		if ($col_139.equalsIgnoreCase(name)) {
			col_139(value);
			return;
		}
		if ($col_141.equalsIgnoreCase(name)) {
			col_141(value);
			return;
		}
		if ($col_142.equalsIgnoreCase(name)) {
			col_142(value);
			return;
		}
		if ($col_143.equalsIgnoreCase(name)) {
			col_143(value);
			return;
		}
		if ($col_144.equalsIgnoreCase(name)) {
			col_144(value);
			return;
		}
		if ($col_145.equalsIgnoreCase(name)) {
			col_145(value);
			return;
		}
		if ($col_146.equalsIgnoreCase(name)) {
			col_146(value);
			return;
		}
		if ($col_148.equalsIgnoreCase(name)) {
			col_148(value);
			return;
		}
		if ($col_149.equalsIgnoreCase(name)) {
			col_149(value);
			return;
		}
		if ($col_150.equalsIgnoreCase(name)) {
			col_150(value);
			return;
		}
		if ($col_151.equalsIgnoreCase(name)) {
			col_151(value);
			return;
		}
		if ($col_152.equalsIgnoreCase(name)) {
			col_152(value);
			return;
		}
		if ($col_153.equalsIgnoreCase(name)) {
			col_153(value);
			return;
		}
		if ($col_155.equalsIgnoreCase(name)) {
			col_155(value);
			return;
		}
		if ($col_156.equalsIgnoreCase(name)) {
			col_156(value);
			return;
		}
		if ($col_157.equalsIgnoreCase(name)) {
			col_157(value);
			return;
		}
		if ($col_158.equalsIgnoreCase(name)) {
			col_158(value);
			return;
		}
		if ($col_159.equalsIgnoreCase(name)) {
			col_159(value);
			return;
		}
		if ($col_160.equalsIgnoreCase(name)) {
			col_160(value);
			return;
		}
		if ($col_162.equalsIgnoreCase(name)) {
			col_162(value);
			return;
		}
		if ($col_163.equalsIgnoreCase(name)) {
			col_163(value);
			return;
		}
		if ($col_164.equalsIgnoreCase(name)) {
			col_164(value);
			return;
		}
		if ($col_165.equalsIgnoreCase(name)) {
			col_165(value);
			return;
		}
		if ($col_166.equalsIgnoreCase(name)) {
			col_166(value);
			return;
		}
		if ($col_167.equalsIgnoreCase(name)) {
			col_167(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		if ($col_100.equalsIgnoreCase(name)) {
			col_100(value);
			return;
		}
		if ($col_101.equalsIgnoreCase(name)) {
			col_101(value);
			return;
		}
		if ($col_102.equalsIgnoreCase(name)) {
			col_102(value);
			return;
		}
		if ($col_103.equalsIgnoreCase(name)) {
			col_103(value);
			return;
		}
		if ($col_104.equalsIgnoreCase(name)) {
			col_104(value);
			return;
		}
		if ($col_106.equalsIgnoreCase(name)) {
			col_106(value);
			return;
		}
		if ($col_107.equalsIgnoreCase(name)) {
			col_107(value);
			return;
		}
		if ($col_108.equalsIgnoreCase(name)) {
			col_108(value);
			return;
		}
		if ($col_109.equalsIgnoreCase(name)) {
			col_109(value);
			return;
		}
		if ($col_110.equalsIgnoreCase(name)) {
			col_110(value);
			return;
		}
		if ($col_111.equalsIgnoreCase(name)) {
			col_111(value);
			return;
		}
		if ($col_113.equalsIgnoreCase(name)) {
			col_113(value);
			return;
		}
		if ($col_114.equalsIgnoreCase(name)) {
			col_114(value);
			return;
		}
		if ($col_115.equalsIgnoreCase(name)) {
			col_115(value);
			return;
		}
		if ($col_116.equalsIgnoreCase(name)) {
			col_116(value);
			return;
		}
		if ($col_117.equalsIgnoreCase(name)) {
			col_117(value);
			return;
		}
		if ($col_118.equalsIgnoreCase(name)) {
			col_118(value);
			return;
		}
		if ($col_120.equalsIgnoreCase(name)) {
			col_120(value);
			return;
		}
		if ($col_121.equalsIgnoreCase(name)) {
			col_121(value);
			return;
		}
		if ($col_122.equalsIgnoreCase(name)) {
			col_122(value);
			return;
		}
		if ($col_123.equalsIgnoreCase(name)) {
			col_123(value);
			return;
		}
		if ($col_124.equalsIgnoreCase(name)) {
			col_124(value);
			return;
		}
		if ($col_125.equalsIgnoreCase(name)) {
			col_125(value);
			return;
		}
		if ($col_127.equalsIgnoreCase(name)) {
			col_127(value);
			return;
		}
		if ($col_128.equalsIgnoreCase(name)) {
			col_128(value);
			return;
		}
		if ($col_129.equalsIgnoreCase(name)) {
			col_129(value);
			return;
		}
		if ($col_130.equalsIgnoreCase(name)) {
			col_130(value);
			return;
		}
		if ($col_131.equalsIgnoreCase(name)) {
			col_131(value);
			return;
		}
		if ($col_132.equalsIgnoreCase(name)) {
			col_132(value);
			return;
		}
		if ($col_134.equalsIgnoreCase(name)) {
			col_134(value);
			return;
		}
		if ($col_135.equalsIgnoreCase(name)) {
			col_135(value);
			return;
		}
		if ($col_136.equalsIgnoreCase(name)) {
			col_136(value);
			return;
		}
		if ($col_137.equalsIgnoreCase(name)) {
			col_137(value);
			return;
		}
		if ($col_138.equalsIgnoreCase(name)) {
			col_138(value);
			return;
		}
		if ($col_139.equalsIgnoreCase(name)) {
			col_139(value);
			return;
		}
		if ($col_141.equalsIgnoreCase(name)) {
			col_141(value);
			return;
		}
		if ($col_142.equalsIgnoreCase(name)) {
			col_142(value);
			return;
		}
		if ($col_143.equalsIgnoreCase(name)) {
			col_143(value);
			return;
		}
		if ($col_144.equalsIgnoreCase(name)) {
			col_144(value);
			return;
		}
		if ($col_145.equalsIgnoreCase(name)) {
			col_145(value);
			return;
		}
		if ($col_146.equalsIgnoreCase(name)) {
			col_146(value);
			return;
		}
		if ($col_148.equalsIgnoreCase(name)) {
			col_148(value);
			return;
		}
		if ($col_149.equalsIgnoreCase(name)) {
			col_149(value);
			return;
		}
		if ($col_150.equalsIgnoreCase(name)) {
			col_150(value);
			return;
		}
		if ($col_151.equalsIgnoreCase(name)) {
			col_151(value);
			return;
		}
		if ($col_152.equalsIgnoreCase(name)) {
			col_152(value);
			return;
		}
		if ($col_153.equalsIgnoreCase(name)) {
			col_153(value);
			return;
		}
		if ($col_155.equalsIgnoreCase(name)) {
			col_155(value);
			return;
		}
		if ($col_156.equalsIgnoreCase(name)) {
			col_156(value);
			return;
		}
		if ($col_157.equalsIgnoreCase(name)) {
			col_157(value);
			return;
		}
		if ($col_158.equalsIgnoreCase(name)) {
			col_158(value);
			return;
		}
		if ($col_159.equalsIgnoreCase(name)) {
			col_159(value);
			return;
		}
		if ($col_160.equalsIgnoreCase(name)) {
			col_160(value);
			return;
		}
		if ($col_162.equalsIgnoreCase(name)) {
			col_162(value);
			return;
		}
		if ($col_163.equalsIgnoreCase(name)) {
			col_163(value);
			return;
		}
		if ($col_164.equalsIgnoreCase(name)) {
			col_164(value);
			return;
		}
		if ($col_165.equalsIgnoreCase(name)) {
			col_165(value);
			return;
		}
		if ($col_166.equalsIgnoreCase(name)) {
			col_166(value);
			return;
		}
		if ($col_167.equalsIgnoreCase(name)) {
			col_167(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		if ($col_100.equalsIgnoreCase(name)) {
			col_100(value);
			return;
		}
		if ($col_101.equalsIgnoreCase(name)) {
			col_101(value);
			return;
		}
		if ($col_102.equalsIgnoreCase(name)) {
			col_102(value);
			return;
		}
		if ($col_103.equalsIgnoreCase(name)) {
			col_103(value);
			return;
		}
		if ($col_104.equalsIgnoreCase(name)) {
			col_104(value);
			return;
		}
		if ($col_106.equalsIgnoreCase(name)) {
			col_106(value);
			return;
		}
		if ($col_107.equalsIgnoreCase(name)) {
			col_107(value);
			return;
		}
		if ($col_108.equalsIgnoreCase(name)) {
			col_108(value);
			return;
		}
		if ($col_109.equalsIgnoreCase(name)) {
			col_109(value);
			return;
		}
		if ($col_110.equalsIgnoreCase(name)) {
			col_110(value);
			return;
		}
		if ($col_111.equalsIgnoreCase(name)) {
			col_111(value);
			return;
		}
		if ($col_113.equalsIgnoreCase(name)) {
			col_113(value);
			return;
		}
		if ($col_114.equalsIgnoreCase(name)) {
			col_114(value);
			return;
		}
		if ($col_115.equalsIgnoreCase(name)) {
			col_115(value);
			return;
		}
		if ($col_116.equalsIgnoreCase(name)) {
			col_116(value);
			return;
		}
		if ($col_117.equalsIgnoreCase(name)) {
			col_117(value);
			return;
		}
		if ($col_118.equalsIgnoreCase(name)) {
			col_118(value);
			return;
		}
		if ($col_120.equalsIgnoreCase(name)) {
			col_120(value);
			return;
		}
		if ($col_121.equalsIgnoreCase(name)) {
			col_121(value);
			return;
		}
		if ($col_122.equalsIgnoreCase(name)) {
			col_122(value);
			return;
		}
		if ($col_123.equalsIgnoreCase(name)) {
			col_123(value);
			return;
		}
		if ($col_124.equalsIgnoreCase(name)) {
			col_124(value);
			return;
		}
		if ($col_125.equalsIgnoreCase(name)) {
			col_125(value);
			return;
		}
		if ($col_127.equalsIgnoreCase(name)) {
			col_127(value);
			return;
		}
		if ($col_128.equalsIgnoreCase(name)) {
			col_128(value);
			return;
		}
		if ($col_129.equalsIgnoreCase(name)) {
			col_129(value);
			return;
		}
		if ($col_130.equalsIgnoreCase(name)) {
			col_130(value);
			return;
		}
		if ($col_131.equalsIgnoreCase(name)) {
			col_131(value);
			return;
		}
		if ($col_132.equalsIgnoreCase(name)) {
			col_132(value);
			return;
		}
		if ($col_134.equalsIgnoreCase(name)) {
			col_134(value);
			return;
		}
		if ($col_135.equalsIgnoreCase(name)) {
			col_135(value);
			return;
		}
		if ($col_136.equalsIgnoreCase(name)) {
			col_136(value);
			return;
		}
		if ($col_137.equalsIgnoreCase(name)) {
			col_137(value);
			return;
		}
		if ($col_138.equalsIgnoreCase(name)) {
			col_138(value);
			return;
		}
		if ($col_139.equalsIgnoreCase(name)) {
			col_139(value);
			return;
		}
		if ($col_141.equalsIgnoreCase(name)) {
			col_141(value);
			return;
		}
		if ($col_142.equalsIgnoreCase(name)) {
			col_142(value);
			return;
		}
		if ($col_143.equalsIgnoreCase(name)) {
			col_143(value);
			return;
		}
		if ($col_144.equalsIgnoreCase(name)) {
			col_144(value);
			return;
		}
		if ($col_145.equalsIgnoreCase(name)) {
			col_145(value);
			return;
		}
		if ($col_146.equalsIgnoreCase(name)) {
			col_146(value);
			return;
		}
		if ($col_148.equalsIgnoreCase(name)) {
			col_148(value);
			return;
		}
		if ($col_149.equalsIgnoreCase(name)) {
			col_149(value);
			return;
		}
		if ($col_150.equalsIgnoreCase(name)) {
			col_150(value);
			return;
		}
		if ($col_151.equalsIgnoreCase(name)) {
			col_151(value);
			return;
		}
		if ($col_152.equalsIgnoreCase(name)) {
			col_152(value);
			return;
		}
		if ($col_153.equalsIgnoreCase(name)) {
			col_153(value);
			return;
		}
		if ($col_155.equalsIgnoreCase(name)) {
			col_155(value);
			return;
		}
		if ($col_156.equalsIgnoreCase(name)) {
			col_156(value);
			return;
		}
		if ($col_157.equalsIgnoreCase(name)) {
			col_157(value);
			return;
		}
		if ($col_158.equalsIgnoreCase(name)) {
			col_158(value);
			return;
		}
		if ($col_159.equalsIgnoreCase(name)) {
			col_159(value);
			return;
		}
		if ($col_160.equalsIgnoreCase(name)) {
			col_160(value);
			return;
		}
		if ($col_162.equalsIgnoreCase(name)) {
			col_162(value);
			return;
		}
		if ($col_163.equalsIgnoreCase(name)) {
			col_163(value);
			return;
		}
		if ($col_164.equalsIgnoreCase(name)) {
			col_164(value);
			return;
		}
		if ($col_165.equalsIgnoreCase(name)) {
			col_165(value);
			return;
		}
		if ($col_166.equalsIgnoreCase(name)) {
			col_166(value);
			return;
		}
		if ($col_167.equalsIgnoreCase(name)) {
			col_167(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($base_qty_p.equalsIgnoreCase(name)) {
			return base_qty_p();
		}
		if ($unit_qty_p.equalsIgnoreCase(name)) {
			return unit_qty_p();
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
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($base_qty_p.equalsIgnoreCase(name)) {
			base_qty_p(
				((MCContainerMeta) base_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($unit_qty_p.equalsIgnoreCase(name)) {
			unit_qty_p(
				((MCContainerMeta) unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
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

	public MCNumber base_qty() {
		return base_qty_p().qty();
	}

	public void base_qty(MCNumber value) {
		base_qty_p().qty(value);
	}

	public void base_qty(int value) {
		base_qty_p().qty(value);
	}

	public void base_qty(long value) {
		base_qty_p().qty(value);
	}

	public void base_qty(float value) {
		base_qty_p().qty(value);
	}

	public void base_qty(double value) {
		base_qty_p().qty(value);
	}

	public MCNumber unit_qty() {
		return unit_qty_p().qty();
	}

	public void unit_qty(MCNumber value) {
		unit_qty_p().qty(value);
	}

	public void unit_qty(int value) {
		unit_qty_p().qty(value);
	}

	public void unit_qty(long value) {
		unit_qty_p().qty(value);
	}

	public void unit_qty(float value) {
		unit_qty_p().qty(value);
	}

	public void unit_qty(double value) {
		unit_qty_p().qty(value);
	}

	public MCNumber col_000() {
		return qty_00_p().qty();
	}

	public void col_000(MCNumber value) {
		qty_00_p().qty(value);
	}

	public void col_000(int value) {
		qty_00_p().qty(value);
	}

	public void col_000(long value) {
		qty_00_p().qty(value);
	}

	public void col_000(float value) {
		qty_00_p().qty(value);
	}

	public void col_000(double value) {
		qty_00_p().qty(value);
	}

	public MCNumber col_007() {
		return qty_01_p().qty();
	}

	public void col_007(MCNumber value) {
		qty_01_p().qty(value);
	}

	public void col_007(int value) {
		qty_01_p().qty(value);
	}

	public void col_007(long value) {
		qty_01_p().qty(value);
	}

	public void col_007(float value) {
		qty_01_p().qty(value);
	}

	public void col_007(double value) {
		qty_01_p().qty(value);
	}

	public MCNumber col_014() {
		return qty_02_p().qty();
	}

	public void col_014(MCNumber value) {
		qty_02_p().qty(value);
	}

	public void col_014(int value) {
		qty_02_p().qty(value);
	}

	public void col_014(long value) {
		qty_02_p().qty(value);
	}

	public void col_014(float value) {
		qty_02_p().qty(value);
	}

	public void col_014(double value) {
		qty_02_p().qty(value);
	}

	public MCNumber col_021() {
		return qty_03_p().qty();
	}

	public void col_021(MCNumber value) {
		qty_03_p().qty(value);
	}

	public void col_021(int value) {
		qty_03_p().qty(value);
	}

	public void col_021(long value) {
		qty_03_p().qty(value);
	}

	public void col_021(float value) {
		qty_03_p().qty(value);
	}

	public void col_021(double value) {
		qty_03_p().qty(value);
	}

	public MCNumber col_028() {
		return qty_04_p().qty();
	}

	public void col_028(MCNumber value) {
		qty_04_p().qty(value);
	}

	public void col_028(int value) {
		qty_04_p().qty(value);
	}

	public void col_028(long value) {
		qty_04_p().qty(value);
	}

	public void col_028(float value) {
		qty_04_p().qty(value);
	}

	public void col_028(double value) {
		qty_04_p().qty(value);
	}

	public MCNumber col_035() {
		return qty_05_p().qty();
	}

	public void col_035(MCNumber value) {
		qty_05_p().qty(value);
	}

	public void col_035(int value) {
		qty_05_p().qty(value);
	}

	public void col_035(long value) {
		qty_05_p().qty(value);
	}

	public void col_035(float value) {
		qty_05_p().qty(value);
	}

	public void col_035(double value) {
		qty_05_p().qty(value);
	}

	public MCNumber col_042() {
		return qty_06_p().qty();
	}

	public void col_042(MCNumber value) {
		qty_06_p().qty(value);
	}

	public void col_042(int value) {
		qty_06_p().qty(value);
	}

	public void col_042(long value) {
		qty_06_p().qty(value);
	}

	public void col_042(float value) {
		qty_06_p().qty(value);
	}

	public void col_042(double value) {
		qty_06_p().qty(value);
	}

	public MCNumber col_049() {
		return qty_07_p().qty();
	}

	public void col_049(MCNumber value) {
		qty_07_p().qty(value);
	}

	public void col_049(int value) {
		qty_07_p().qty(value);
	}

	public void col_049(long value) {
		qty_07_p().qty(value);
	}

	public void col_049(float value) {
		qty_07_p().qty(value);
	}

	public void col_049(double value) {
		qty_07_p().qty(value);
	}

	public MCNumber col_056() {
		return qty_08_p().qty();
	}

	public void col_056(MCNumber value) {
		qty_08_p().qty(value);
	}

	public void col_056(int value) {
		qty_08_p().qty(value);
	}

	public void col_056(long value) {
		qty_08_p().qty(value);
	}

	public void col_056(float value) {
		qty_08_p().qty(value);
	}

	public void col_056(double value) {
		qty_08_p().qty(value);
	}

	public MCNumber col_063() {
		return qty_09_p().qty();
	}

	public void col_063(MCNumber value) {
		qty_09_p().qty(value);
	}

	public void col_063(int value) {
		qty_09_p().qty(value);
	}

	public void col_063(long value) {
		qty_09_p().qty(value);
	}

	public void col_063(float value) {
		qty_09_p().qty(value);
	}

	public void col_063(double value) {
		qty_09_p().qty(value);
	}

	public MCNumber col_070() {
		return qty_10_p().qty();
	}

	public void col_070(MCNumber value) {
		qty_10_p().qty(value);
	}

	public void col_070(int value) {
		qty_10_p().qty(value);
	}

	public void col_070(long value) {
		qty_10_p().qty(value);
	}

	public void col_070(float value) {
		qty_10_p().qty(value);
	}

	public void col_070(double value) {
		qty_10_p().qty(value);
	}

	public MCNumber col_077() {
		return qty_11_p().qty();
	}

	public void col_077(MCNumber value) {
		qty_11_p().qty(value);
	}

	public void col_077(int value) {
		qty_11_p().qty(value);
	}

	public void col_077(long value) {
		qty_11_p().qty(value);
	}

	public void col_077(float value) {
		qty_11_p().qty(value);
	}

	public void col_077(double value) {
		qty_11_p().qty(value);
	}

	public MCNumber col_084() {
		return qty_12_p().qty();
	}

	public void col_084(MCNumber value) {
		qty_12_p().qty(value);
	}

	public void col_084(int value) {
		qty_12_p().qty(value);
	}

	public void col_084(long value) {
		qty_12_p().qty(value);
	}

	public void col_084(float value) {
		qty_12_p().qty(value);
	}

	public void col_084(double value) {
		qty_12_p().qty(value);
	}

	public MCNumber col_091() {
		return qty_13_p().qty();
	}

	public void col_091(MCNumber value) {
		qty_13_p().qty(value);
	}

	public void col_091(int value) {
		qty_13_p().qty(value);
	}

	public void col_091(long value) {
		qty_13_p().qty(value);
	}

	public void col_091(float value) {
		qty_13_p().qty(value);
	}

	public void col_091(double value) {
		qty_13_p().qty(value);
	}

	public MCNumber col_098() {
		return qty_14_p().qty();
	}

	public void col_098(MCNumber value) {
		qty_14_p().qty(value);
	}

	public void col_098(int value) {
		qty_14_p().qty(value);
	}

	public void col_098(long value) {
		qty_14_p().qty(value);
	}

	public void col_098(float value) {
		qty_14_p().qty(value);
	}

	public void col_098(double value) {
		qty_14_p().qty(value);
	}

	public MCNumber col_105() {
		return qty_15_p().qty();
	}

	public void col_105(MCNumber value) {
		qty_15_p().qty(value);
	}

	public void col_105(int value) {
		qty_15_p().qty(value);
	}

	public void col_105(long value) {
		qty_15_p().qty(value);
	}

	public void col_105(float value) {
		qty_15_p().qty(value);
	}

	public void col_105(double value) {
		qty_15_p().qty(value);
	}

	public MCNumber col_112() {
		return qty_16_p().qty();
	}

	public void col_112(MCNumber value) {
		qty_16_p().qty(value);
	}

	public void col_112(int value) {
		qty_16_p().qty(value);
	}

	public void col_112(long value) {
		qty_16_p().qty(value);
	}

	public void col_112(float value) {
		qty_16_p().qty(value);
	}

	public void col_112(double value) {
		qty_16_p().qty(value);
	}

	public MCNumber col_119() {
		return qty_17_p().qty();
	}

	public void col_119(MCNumber value) {
		qty_17_p().qty(value);
	}

	public void col_119(int value) {
		qty_17_p().qty(value);
	}

	public void col_119(long value) {
		qty_17_p().qty(value);
	}

	public void col_119(float value) {
		qty_17_p().qty(value);
	}

	public void col_119(double value) {
		qty_17_p().qty(value);
	}

	public MCNumber col_126() {
		return qty_18_p().qty();
	}

	public void col_126(MCNumber value) {
		qty_18_p().qty(value);
	}

	public void col_126(int value) {
		qty_18_p().qty(value);
	}

	public void col_126(long value) {
		qty_18_p().qty(value);
	}

	public void col_126(float value) {
		qty_18_p().qty(value);
	}

	public void col_126(double value) {
		qty_18_p().qty(value);
	}

	public MCNumber col_133() {
		return qty_19_p().qty();
	}

	public void col_133(MCNumber value) {
		qty_19_p().qty(value);
	}

	public void col_133(int value) {
		qty_19_p().qty(value);
	}

	public void col_133(long value) {
		qty_19_p().qty(value);
	}

	public void col_133(float value) {
		qty_19_p().qty(value);
	}

	public void col_133(double value) {
		qty_19_p().qty(value);
	}

	public MCNumber col_140() {
		return qty_20_p().qty();
	}

	public void col_140(MCNumber value) {
		qty_20_p().qty(value);
	}

	public void col_140(int value) {
		qty_20_p().qty(value);
	}

	public void col_140(long value) {
		qty_20_p().qty(value);
	}

	public void col_140(float value) {
		qty_20_p().qty(value);
	}

	public void col_140(double value) {
		qty_20_p().qty(value);
	}

	public MCNumber col_147() {
		return qty_21_p().qty();
	}

	public void col_147(MCNumber value) {
		qty_21_p().qty(value);
	}

	public void col_147(int value) {
		qty_21_p().qty(value);
	}

	public void col_147(long value) {
		qty_21_p().qty(value);
	}

	public void col_147(float value) {
		qty_21_p().qty(value);
	}

	public void col_147(double value) {
		qty_21_p().qty(value);
	}

	public MCNumber col_154() {
		return qty_22_p().qty();
	}

	public void col_154(MCNumber value) {
		qty_22_p().qty(value);
	}

	public void col_154(int value) {
		qty_22_p().qty(value);
	}

	public void col_154(long value) {
		qty_22_p().qty(value);
	}

	public void col_154(float value) {
		qty_22_p().qty(value);
	}

	public void col_154(double value) {
		qty_22_p().qty(value);
	}

	public MCNumber col_161() {
		return qty_23_p().qty();
	}

	public void col_161(MCNumber value) {
		qty_23_p().qty(value);
	}

	public void col_161(int value) {
		qty_23_p().qty(value);
	}

	public void col_161(long value) {
		qty_23_p().qty(value);
	}

	public void col_161(float value) {
		qty_23_p().qty(value);
	}

	public void col_161(double value) {
		qty_23_p().qty(value);
	}

}

