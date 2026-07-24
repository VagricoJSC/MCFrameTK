package mcframe.clientMGBF.MGBFP0140;

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
 * ブロック"Rslt9"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Rslt9R_MC_A extends MCConstRow {

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
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public static final String $wk_cost_cd = "wk_cost_cd";
	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public static final String $wk_cost_nm = "wk_cost_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	public static final String $qty_diff_p = "qty_diff_p";
	public static final String $std_qty_p = "std_qty_p";
	public static final String $act_qty_p = "act_qty_p";
	/**
	 * Man-hour unit name 工数単位名.<p>
	 *
	 */
	public static final String $wk_cost_unit_nm = "wk_cost_unit_nm";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff_ttl = "diff_ttl";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std_ttl = "std_ttl";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $ttl = "ttl";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff_var_cost = "diff_var_cost";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std_var_cost = "std_var_cost";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $var_cost = "var_cost";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $diff_fxd_cost = "diff_fxd_cost";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $std_fxd_cost = "std_fxd_cost";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $fxd_cost = "fxd_cost";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_000 = "col_000";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_001 = "col_001";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_002 = "col_002";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_003 = "col_003";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_004 = "col_004";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_005 = "col_005";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_006 = "col_006";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_007 = "col_007";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_008 = "col_008";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_009 = "col_009";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_010 = "col_010";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_011 = "col_011";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_012 = "col_012";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_013 = "col_013";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_014 = "col_014";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_015 = "col_015";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_016 = "col_016";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_017 = "col_017";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_018 = "col_018";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_019 = "col_019";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_020 = "col_020";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_021 = "col_021";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_022 = "col_022";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_023 = "col_023";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_024 = "col_024";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_025 = "col_025";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_026 = "col_026";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_027 = "col_027";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_028 = "col_028";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_029 = "col_029";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_030 = "col_030";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_031 = "col_031";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_032 = "col_032";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_033 = "col_033";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_034 = "col_034";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_035 = "col_035";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_036 = "col_036";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_037 = "col_037";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_038 = "col_038";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_039 = "col_039";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_040 = "col_040";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_041 = "col_041";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_042 = "col_042";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_043 = "col_043";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_044 = "col_044";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_045 = "col_045";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_046 = "col_046";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_047 = "col_047";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_048 = "col_048";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_049 = "col_049";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_050 = "col_050";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_051 = "col_051";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_052 = "col_052";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_053 = "col_053";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_054 = "col_054";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_055 = "col_055";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_056 = "col_056";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_057 = "col_057";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_058 = "col_058";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_059 = "col_059";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_060 = "col_060";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_061 = "col_061";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_062 = "col_062";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_063 = "col_063";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_064 = "col_064";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_065 = "col_065";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_066 = "col_066";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_067 = "col_067";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_068 = "col_068";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_069 = "col_069";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_070 = "col_070";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_071 = "col_071";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_072 = "col_072";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_073 = "col_073";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_074 = "col_074";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_075 = "col_075";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_076 = "col_076";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_077 = "col_077";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_078 = "col_078";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_079 = "col_079";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_080 = "col_080";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_081 = "col_081";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_082 = "col_082";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_083 = "col_083";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_084 = "col_084";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_085 = "col_085";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_086 = "col_086";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_087 = "col_087";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_088 = "col_088";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_089 = "col_089";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_090 = "col_090";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_091 = "col_091";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_092 = "col_092";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_093 = "col_093";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_094 = "col_094";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_095 = "col_095";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_096 = "col_096";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_097 = "col_097";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_098 = "col_098";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_099 = "col_099";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_100 = "col_100";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_101 = "col_101";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_102 = "col_102";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_103 = "col_103";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_104 = "col_104";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_105 = "col_105";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_106 = "col_106";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_107 = "col_107";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_108 = "col_108";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_109 = "col_109";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_110 = "col_110";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_111 = "col_111";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_112 = "col_112";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_113 = "col_113";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_114 = "col_114";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_115 = "col_115";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_116 = "col_116";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_117 = "col_117";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_118 = "col_118";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_119 = "col_119";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_120 = "col_120";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_121 = "col_121";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_122 = "col_122";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_123 = "col_123";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_124 = "col_124";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_125 = "col_125";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_126 = "col_126";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_127 = "col_127";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_128 = "col_128";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_129 = "col_129";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_130 = "col_130";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_131 = "col_131";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_132 = "col_132";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_133 = "col_133";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_134 = "col_134";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_135 = "col_135";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_136 = "col_136";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_137 = "col_137";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_138 = "col_138";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_139 = "col_139";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_140 = "col_140";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_141 = "col_141";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_142 = "col_142";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_143 = "col_143";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_144 = "col_144";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_145 = "col_145";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_146 = "col_146";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_147 = "col_147";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_148 = "col_148";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_149 = "col_149";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_150 = "col_150";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_151 = "col_151";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_152 = "col_152";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_153 = "col_153";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_154 = "col_154";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_155 = "col_155";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_156 = "col_156";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_157 = "col_157";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_158 = "col_158";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_159 = "col_159";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_160 = "col_160";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_161 = "col_161";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_162 = "col_162";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_163 = "col_163";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_164 = "col_164";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_165 = "col_165";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_166 = "col_166";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_167 = "col_167";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_168 = "col_168";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_169 = "col_169";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_170 = "col_170";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_171 = "col_171";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_172 = "col_172";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_173 = "col_173";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_174 = "col_174";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_175 = "col_175";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_176 = "col_176";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_177 = "col_177";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_178 = "col_178";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_179 = "col_179";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_180 = "col_180";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_181 = "col_181";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_182 = "col_182";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_183 = "col_183";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_184 = "col_184";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_185 = "col_185";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_186 = "col_186";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_187 = "col_187";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_188 = "col_188";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_189 = "col_189";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_190 = "col_190";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_191 = "col_191";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_192 = "col_192";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_193 = "col_193";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_194 = "col_194";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_195 = "col_195";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_196 = "col_196";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_197 = "col_197";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_198 = "col_198";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_199 = "col_199";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_200 = "col_200";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_201 = "col_201";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_202 = "col_202";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_203 = "col_203";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_204 = "col_204";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_205 = "col_205";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_206 = "col_206";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_207 = "col_207";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_208 = "col_208";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_209 = "col_209";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_210 = "col_210";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_211 = "col_211";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_212 = "col_212";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_213 = "col_213";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_214 = "col_214";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_215 = "col_215";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_216 = "col_216";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_217 = "col_217";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_218 = "col_218";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_219 = "col_219";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_220 = "col_220";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_221 = "col_221";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_222 = "col_222";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_223 = "col_223";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_224 = "col_224";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_225 = "col_225";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_226 = "col_226";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_227 = "col_227";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_228 = "col_228";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_229 = "col_229";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_230 = "col_230";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_231 = "col_231";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_232 = "col_232";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_233 = "col_233";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_234 = "col_234";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_235 = "col_235";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_236 = "col_236";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_237 = "col_237";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_238 = "col_238";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_239 = "col_239";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_240 = "col_240";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_241 = "col_241";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_242 = "col_242";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_243 = "col_243";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_244 = "col_244";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_245 = "col_245";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_246 = "col_246";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_247 = "col_247";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_248 = "col_248";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_249 = "col_249";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_250 = "col_250";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_251 = "col_251";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_252 = "col_252";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_253 = "col_253";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_254 = "col_254";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_255 = "col_255";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_256 = "col_256";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_257 = "col_257";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_258 = "col_258";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_259 = "col_259";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_260 = "col_260";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_261 = "col_261";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_262 = "col_262";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_263 = "col_263";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_264 = "col_264";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_265 = "col_265";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_266 = "col_266";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_267 = "col_267";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_268 = "col_268";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_269 = "col_269";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_270 = "col_270";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_271 = "col_271";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_272 = "col_272";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_273 = "col_273";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_274 = "col_274";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_275 = "col_275";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_276 = "col_276";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_277 = "col_277";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_278 = "col_278";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_279 = "col_279";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_280 = "col_280";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_281 = "col_281";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_282 = "col_282";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_283 = "col_283";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_284 = "col_284";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_285 = "col_285";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_286 = "col_286";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_287 = "col_287";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_288 = "col_288";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_289 = "col_289";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_290 = "col_290";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_291 = "col_291";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_292 = "col_292";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_293 = "col_293";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_294 = "col_294";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_295 = "col_295";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_296 = "col_296";
	/**
	 * Variance 差異.<p>
	 *
	 */
	public static final String $col_297 = "col_297";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_298 = "col_298";
	/**
	 * Actual 実際.<p>
	 *
	 */
	public static final String $col_299 = "col_299";

	public static final String $diff_wk_cost = $qty_diff_p + ".qty";
	public static final String $std_wk_cost = $std_qty_p + ".qty";
	public static final String $act_wk_cost = $act_qty_p + ".qty";

	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta wk_cost_cd_META = createCommonMeta($wk_cost_cd, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta wk_cost_nm_META = createCommonMeta($wk_cost_nm, mcframe.commonMA.meta.MA_META.WK_COST_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta qty_diff_p_META = createInnerRowMeta($qty_diff_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std_qty_p_META = createInnerRowMeta($std_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta act_qty_p_META = createInnerRowMeta($act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta wk_cost_unit_nm_META = createCommonMeta($wk_cost_unit_nm, mcframe.commonMA.meta.MA_META.WK_COST_UNIT_NM);
	public static final MCMeta diff_ttl_META = createCommonMeta($diff_ttl, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_ttl_META = createCommonMeta($std_ttl, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_META = createCommonMeta($ttl, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_var_cost_META = createCommonMeta($diff_var_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_var_cost_META = createCommonMeta($std_var_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta var_cost_META = createCommonMeta($var_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_fxd_cost_META = createCommonMeta($diff_fxd_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_fxd_cost_META = createCommonMeta($std_fxd_cost, mcframe.commonMA.meta.MA_META.MONEY);
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
	public static final MCMeta col_100_META = createCommonMeta($col_100, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_101_META = createCommonMeta($col_101, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_102_META = createCommonMeta($col_102, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_103_META = createCommonMeta($col_103, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_104_META = createCommonMeta($col_104, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_105_META = createCommonMeta($col_105, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_106_META = createCommonMeta($col_106, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_107_META = createCommonMeta($col_107, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_108_META = createCommonMeta($col_108, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_109_META = createCommonMeta($col_109, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_110_META = createCommonMeta($col_110, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_111_META = createCommonMeta($col_111, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_112_META = createCommonMeta($col_112, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_113_META = createCommonMeta($col_113, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_114_META = createCommonMeta($col_114, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_115_META = createCommonMeta($col_115, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_116_META = createCommonMeta($col_116, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_117_META = createCommonMeta($col_117, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_118_META = createCommonMeta($col_118, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_119_META = createCommonMeta($col_119, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_120_META = createCommonMeta($col_120, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_121_META = createCommonMeta($col_121, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_122_META = createCommonMeta($col_122, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_123_META = createCommonMeta($col_123, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_124_META = createCommonMeta($col_124, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_125_META = createCommonMeta($col_125, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_126_META = createCommonMeta($col_126, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_127_META = createCommonMeta($col_127, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_128_META = createCommonMeta($col_128, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_129_META = createCommonMeta($col_129, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_130_META = createCommonMeta($col_130, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_131_META = createCommonMeta($col_131, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_132_META = createCommonMeta($col_132, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_133_META = createCommonMeta($col_133, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_134_META = createCommonMeta($col_134, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_135_META = createCommonMeta($col_135, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_136_META = createCommonMeta($col_136, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_137_META = createCommonMeta($col_137, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_138_META = createCommonMeta($col_138, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_139_META = createCommonMeta($col_139, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_140_META = createCommonMeta($col_140, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_141_META = createCommonMeta($col_141, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_142_META = createCommonMeta($col_142, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_143_META = createCommonMeta($col_143, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_144_META = createCommonMeta($col_144, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_145_META = createCommonMeta($col_145, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_146_META = createCommonMeta($col_146, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_147_META = createCommonMeta($col_147, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_148_META = createCommonMeta($col_148, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_149_META = createCommonMeta($col_149, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_150_META = createCommonMeta($col_150, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_151_META = createCommonMeta($col_151, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_152_META = createCommonMeta($col_152, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_153_META = createCommonMeta($col_153, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_154_META = createCommonMeta($col_154, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_155_META = createCommonMeta($col_155, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_156_META = createCommonMeta($col_156, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_157_META = createCommonMeta($col_157, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_158_META = createCommonMeta($col_158, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_159_META = createCommonMeta($col_159, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_160_META = createCommonMeta($col_160, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_161_META = createCommonMeta($col_161, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_162_META = createCommonMeta($col_162, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_163_META = createCommonMeta($col_163, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_164_META = createCommonMeta($col_164, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_165_META = createCommonMeta($col_165, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_166_META = createCommonMeta($col_166, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_167_META = createCommonMeta($col_167, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_168_META = createCommonMeta($col_168, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_169_META = createCommonMeta($col_169, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_170_META = createCommonMeta($col_170, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_171_META = createCommonMeta($col_171, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_172_META = createCommonMeta($col_172, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_173_META = createCommonMeta($col_173, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_174_META = createCommonMeta($col_174, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_175_META = createCommonMeta($col_175, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_176_META = createCommonMeta($col_176, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_177_META = createCommonMeta($col_177, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_178_META = createCommonMeta($col_178, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_179_META = createCommonMeta($col_179, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_180_META = createCommonMeta($col_180, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_181_META = createCommonMeta($col_181, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_182_META = createCommonMeta($col_182, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_183_META = createCommonMeta($col_183, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_184_META = createCommonMeta($col_184, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_185_META = createCommonMeta($col_185, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_186_META = createCommonMeta($col_186, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_187_META = createCommonMeta($col_187, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_188_META = createCommonMeta($col_188, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_189_META = createCommonMeta($col_189, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_190_META = createCommonMeta($col_190, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_191_META = createCommonMeta($col_191, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_192_META = createCommonMeta($col_192, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_193_META = createCommonMeta($col_193, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_194_META = createCommonMeta($col_194, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_195_META = createCommonMeta($col_195, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_196_META = createCommonMeta($col_196, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_197_META = createCommonMeta($col_197, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_198_META = createCommonMeta($col_198, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_199_META = createCommonMeta($col_199, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_200_META = createCommonMeta($col_200, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_201_META = createCommonMeta($col_201, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_202_META = createCommonMeta($col_202, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_203_META = createCommonMeta($col_203, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_204_META = createCommonMeta($col_204, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_205_META = createCommonMeta($col_205, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_206_META = createCommonMeta($col_206, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_207_META = createCommonMeta($col_207, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_208_META = createCommonMeta($col_208, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_209_META = createCommonMeta($col_209, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_210_META = createCommonMeta($col_210, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_211_META = createCommonMeta($col_211, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_212_META = createCommonMeta($col_212, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_213_META = createCommonMeta($col_213, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_214_META = createCommonMeta($col_214, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_215_META = createCommonMeta($col_215, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_216_META = createCommonMeta($col_216, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_217_META = createCommonMeta($col_217, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_218_META = createCommonMeta($col_218, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_219_META = createCommonMeta($col_219, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_220_META = createCommonMeta($col_220, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_221_META = createCommonMeta($col_221, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_222_META = createCommonMeta($col_222, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_223_META = createCommonMeta($col_223, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_224_META = createCommonMeta($col_224, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_225_META = createCommonMeta($col_225, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_226_META = createCommonMeta($col_226, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_227_META = createCommonMeta($col_227, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_228_META = createCommonMeta($col_228, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_229_META = createCommonMeta($col_229, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_230_META = createCommonMeta($col_230, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_231_META = createCommonMeta($col_231, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_232_META = createCommonMeta($col_232, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_233_META = createCommonMeta($col_233, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_234_META = createCommonMeta($col_234, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_235_META = createCommonMeta($col_235, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_236_META = createCommonMeta($col_236, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_237_META = createCommonMeta($col_237, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_238_META = createCommonMeta($col_238, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_239_META = createCommonMeta($col_239, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_240_META = createCommonMeta($col_240, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_241_META = createCommonMeta($col_241, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_242_META = createCommonMeta($col_242, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_243_META = createCommonMeta($col_243, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_244_META = createCommonMeta($col_244, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_245_META = createCommonMeta($col_245, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_246_META = createCommonMeta($col_246, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_247_META = createCommonMeta($col_247, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_248_META = createCommonMeta($col_248, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_249_META = createCommonMeta($col_249, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_250_META = createCommonMeta($col_250, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_251_META = createCommonMeta($col_251, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_252_META = createCommonMeta($col_252, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_253_META = createCommonMeta($col_253, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_254_META = createCommonMeta($col_254, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_255_META = createCommonMeta($col_255, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_256_META = createCommonMeta($col_256, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_257_META = createCommonMeta($col_257, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_258_META = createCommonMeta($col_258, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_259_META = createCommonMeta($col_259, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_260_META = createCommonMeta($col_260, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_261_META = createCommonMeta($col_261, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_262_META = createCommonMeta($col_262, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_263_META = createCommonMeta($col_263, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_264_META = createCommonMeta($col_264, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_265_META = createCommonMeta($col_265, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_266_META = createCommonMeta($col_266, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_267_META = createCommonMeta($col_267, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_268_META = createCommonMeta($col_268, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_269_META = createCommonMeta($col_269, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_270_META = createCommonMeta($col_270, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_271_META = createCommonMeta($col_271, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_272_META = createCommonMeta($col_272, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_273_META = createCommonMeta($col_273, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_274_META = createCommonMeta($col_274, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_275_META = createCommonMeta($col_275, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_276_META = createCommonMeta($col_276, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_277_META = createCommonMeta($col_277, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_278_META = createCommonMeta($col_278, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_279_META = createCommonMeta($col_279, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_280_META = createCommonMeta($col_280, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_281_META = createCommonMeta($col_281, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_282_META = createCommonMeta($col_282, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_283_META = createCommonMeta($col_283, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_284_META = createCommonMeta($col_284, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_285_META = createCommonMeta($col_285, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_286_META = createCommonMeta($col_286, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_287_META = createCommonMeta($col_287, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_288_META = createCommonMeta($col_288, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_289_META = createCommonMeta($col_289, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_290_META = createCommonMeta($col_290, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_291_META = createCommonMeta($col_291, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_292_META = createCommonMeta($col_292, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_293_META = createCommonMeta($col_293, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_294_META = createCommonMeta($col_294, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_295_META = createCommonMeta($col_295, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_296_META = createCommonMeta($col_296, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_297_META = createCommonMeta($col_297, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_298_META = createCommonMeta($col_298, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_299_META = createCommonMeta($col_299, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<Rslt9R> constMetas = new ConstMetaList<Rslt9R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			wg_cd_META,
			wg_nm_META,
			loc_cd_META,
			loc_nm_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			wk_cost_cd_META,
			wk_cost_nm_META,
			dec_place_META,
			qty_diff_p_META,
			std_qty_p_META,
			act_qty_p_META,
			wk_cost_unit_nm_META,
			diff_ttl_META,
			std_ttl_META,
			ttl_META,
			diff_var_cost_META,
			std_var_cost_META,
			var_cost_META,
			diff_fxd_cost_META,
			std_fxd_cost_META,
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
			col_099_META,
			col_100_META,
			col_101_META,
			col_102_META,
			col_103_META,
			col_104_META,
			col_105_META,
			col_106_META,
			col_107_META,
			col_108_META,
			col_109_META,
			col_110_META,
			col_111_META,
			col_112_META,
			col_113_META,
			col_114_META,
			col_115_META,
			col_116_META,
			col_117_META,
			col_118_META,
			col_119_META,
			col_120_META,
			col_121_META,
			col_122_META,
			col_123_META,
			col_124_META,
			col_125_META,
			col_126_META,
			col_127_META,
			col_128_META,
			col_129_META,
			col_130_META,
			col_131_META,
			col_132_META,
			col_133_META,
			col_134_META,
			col_135_META,
			col_136_META,
			col_137_META,
			col_138_META,
			col_139_META,
			col_140_META,
			col_141_META,
			col_142_META,
			col_143_META,
			col_144_META,
			col_145_META,
			col_146_META,
			col_147_META,
			col_148_META,
			col_149_META,
			col_150_META,
			col_151_META,
			col_152_META,
			col_153_META,
			col_154_META,
			col_155_META,
			col_156_META,
			col_157_META,
			col_158_META,
			col_159_META,
			col_160_META,
			col_161_META,
			col_162_META,
			col_163_META,
			col_164_META,
			col_165_META,
			col_166_META,
			col_167_META,
			col_168_META,
			col_169_META,
			col_170_META,
			col_171_META,
			col_172_META,
			col_173_META,
			col_174_META,
			col_175_META,
			col_176_META,
			col_177_META,
			col_178_META,
			col_179_META,
			col_180_META,
			col_181_META,
			col_182_META,
			col_183_META,
			col_184_META,
			col_185_META,
			col_186_META,
			col_187_META,
			col_188_META,
			col_189_META,
			col_190_META,
			col_191_META,
			col_192_META,
			col_193_META,
			col_194_META,
			col_195_META,
			col_196_META,
			col_197_META,
			col_198_META,
			col_199_META,
			col_200_META,
			col_201_META,
			col_202_META,
			col_203_META,
			col_204_META,
			col_205_META,
			col_206_META,
			col_207_META,
			col_208_META,
			col_209_META,
			col_210_META,
			col_211_META,
			col_212_META,
			col_213_META,
			col_214_META,
			col_215_META,
			col_216_META,
			col_217_META,
			col_218_META,
			col_219_META,
			col_220_META,
			col_221_META,
			col_222_META,
			col_223_META,
			col_224_META,
			col_225_META,
			col_226_META,
			col_227_META,
			col_228_META,
			col_229_META,
			col_230_META,
			col_231_META,
			col_232_META,
			col_233_META,
			col_234_META,
			col_235_META,
			col_236_META,
			col_237_META,
			col_238_META,
			col_239_META,
			col_240_META,
			col_241_META,
			col_242_META,
			col_243_META,
			col_244_META,
			col_245_META,
			col_246_META,
			col_247_META,
			col_248_META,
			col_249_META,
			col_250_META,
			col_251_META,
			col_252_META,
			col_253_META,
			col_254_META,
			col_255_META,
			col_256_META,
			col_257_META,
			col_258_META,
			col_259_META,
			col_260_META,
			col_261_META,
			col_262_META,
			col_263_META,
			col_264_META,
			col_265_META,
			col_266_META,
			col_267_META,
			col_268_META,
			col_269_META,
			col_270_META,
			col_271_META,
			col_272_META,
			col_273_META,
			col_274_META,
			col_275_META,
			col_276_META,
			col_277_META,
			col_278_META,
			col_279_META,
			col_280_META,
			col_281_META,
			col_282_META,
			col_283_META,
			col_284_META,
			col_285_META,
			col_286_META,
			col_287_META,
			col_288_META,
			col_289_META,
			col_290_META,
			col_291_META,
			col_292_META,
			col_293_META,
			col_294_META,
			col_295_META,
			col_296_META,
			col_297_META,
			col_298_META,
			col_299_META
		},
		new String[][]{
			{
				"diff_wk_cost",
				"std_wk_cost",
				"act_wk_cost"
			},
			{
				$diff_wk_cost,
				$std_wk_cost,
				$act_wk_cost
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
				{$wg_nm, "WG"}	// wg_nm
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
				{$col_099, "ELM"},	// col_099
				{$col_100, "ELM"},	// col_100
				{$col_101, "ELM"},	// col_101
				{$col_102, "ELM"},	// col_102
				{$col_103, "ELM"},	// col_103
				{$col_104, "ELM"},	// col_104
				{$col_105, "ELM"},	// col_105
				{$col_106, "ELM"},	// col_106
				{$col_107, "ELM"},	// col_107
				{$col_108, "ELM"},	// col_108
				{$col_109, "ELM"},	// col_109
				{$col_110, "ELM"},	// col_110
				{$col_111, "ELM"},	// col_111
				{$col_112, "ELM"},	// col_112
				{$col_113, "ELM"},	// col_113
				{$col_114, "ELM"},	// col_114
				{$col_115, "ELM"},	// col_115
				{$col_116, "ELM"},	// col_116
				{$col_117, "ELM"},	// col_117
				{$col_118, "ELM"},	// col_118
				{$col_119, "ELM"},	// col_119
				{$col_120, "ELM"},	// col_120
				{$col_121, "ELM"},	// col_121
				{$col_122, "ELM"},	// col_122
				{$col_123, "ELM"},	// col_123
				{$col_124, "ELM"},	// col_124
				{$col_125, "ELM"},	// col_125
				{$col_126, "ELM"},	// col_126
				{$col_127, "ELM"},	// col_127
				{$col_128, "ELM"},	// col_128
				{$col_129, "ELM"},	// col_129
				{$col_130, "ELM"},	// col_130
				{$col_131, "ELM"},	// col_131
				{$col_132, "ELM"},	// col_132
				{$col_133, "ELM"},	// col_133
				{$col_134, "ELM"},	// col_134
				{$col_135, "ELM"},	// col_135
				{$col_136, "ELM"},	// col_136
				{$col_137, "ELM"},	// col_137
				{$col_138, "ELM"},	// col_138
				{$col_139, "ELM"},	// col_139
				{$col_140, "ELM"},	// col_140
				{$col_141, "ELM"},	// col_141
				{$col_142, "ELM"},	// col_142
				{$col_143, "ELM"},	// col_143
				{$col_144, "ELM"},	// col_144
				{$col_145, "ELM"},	// col_145
				{$col_146, "ELM"},	// col_146
				{$col_147, "ELM"},	// col_147
				{$col_148, "ELM"},	// col_148
				{$col_149, "ELM"},	// col_149
				{$col_150, "ELM"},	// col_150
				{$col_151, "ELM"},	// col_151
				{$col_152, "ELM"},	// col_152
				{$col_153, "ELM"},	// col_153
				{$col_154, "ELM"},	// col_154
				{$col_155, "ELM"},	// col_155
				{$col_156, "ELM"},	// col_156
				{$col_157, "ELM"},	// col_157
				{$col_158, "ELM"},	// col_158
				{$col_159, "ELM"},	// col_159
				{$col_160, "ELM"},	// col_160
				{$col_161, "ELM"},	// col_161
				{$col_162, "ELM"},	// col_162
				{$col_163, "ELM"},	// col_163
				{$col_164, "ELM"},	// col_164
				{$col_165, "ELM"},	// col_165
				{$col_166, "ELM"},	// col_166
				{$col_167, "ELM"},	// col_167
				{$col_168, "ELM"},	// col_168
				{$col_169, "ELM"},	// col_169
				{$col_170, "ELM"},	// col_170
				{$col_171, "ELM"},	// col_171
				{$col_172, "ELM"},	// col_172
				{$col_173, "ELM"},	// col_173
				{$col_174, "ELM"},	// col_174
				{$col_175, "ELM"},	// col_175
				{$col_176, "ELM"},	// col_176
				{$col_177, "ELM"},	// col_177
				{$col_178, "ELM"},	// col_178
				{$col_179, "ELM"},	// col_179
				{$col_180, "ELM"},	// col_180
				{$col_181, "ELM"},	// col_181
				{$col_182, "ELM"},	// col_182
				{$col_183, "ELM"},	// col_183
				{$col_184, "ELM"},	// col_184
				{$col_185, "ELM"},	// col_185
				{$col_186, "ELM"},	// col_186
				{$col_187, "ELM"},	// col_187
				{$col_188, "ELM"},	// col_188
				{$col_189, "ELM"},	// col_189
				{$col_190, "ELM"},	// col_190
				{$col_191, "ELM"},	// col_191
				{$col_192, "ELM"},	// col_192
				{$col_193, "ELM"},	// col_193
				{$col_194, "ELM"},	// col_194
				{$col_195, "ELM"},	// col_195
				{$col_196, "ELM"},	// col_196
				{$col_197, "ELM"},	// col_197
				{$col_198, "ELM"},	// col_198
				{$col_199, "ELM"},	// col_199
				{$col_200, "ELM"},	// col_200
				{$col_201, "ELM"},	// col_201
				{$col_202, "ELM"},	// col_202
				{$col_203, "ELM"},	// col_203
				{$col_204, "ELM"},	// col_204
				{$col_205, "ELM"},	// col_205
				{$col_206, "ELM"},	// col_206
				{$col_207, "ELM"},	// col_207
				{$col_208, "ELM"},	// col_208
				{$col_209, "ELM"},	// col_209
				{$col_210, "ELM"},	// col_210
				{$col_211, "ELM"},	// col_211
				{$col_212, "ELM"},	// col_212
				{$col_213, "ELM"},	// col_213
				{$col_214, "ELM"},	// col_214
				{$col_215, "ELM"},	// col_215
				{$col_216, "ELM"},	// col_216
				{$col_217, "ELM"},	// col_217
				{$col_218, "ELM"},	// col_218
				{$col_219, "ELM"},	// col_219
				{$col_220, "ELM"},	// col_220
				{$col_221, "ELM"},	// col_221
				{$col_222, "ELM"},	// col_222
				{$col_223, "ELM"},	// col_223
				{$col_224, "ELM"},	// col_224
				{$col_225, "ELM"},	// col_225
				{$col_226, "ELM"},	// col_226
				{$col_227, "ELM"},	// col_227
				{$col_228, "ELM"},	// col_228
				{$col_229, "ELM"},	// col_229
				{$col_230, "ELM"},	// col_230
				{$col_231, "ELM"},	// col_231
				{$col_232, "ELM"},	// col_232
				{$col_233, "ELM"},	// col_233
				{$col_234, "ELM"},	// col_234
				{$col_235, "ELM"},	// col_235
				{$col_236, "ELM"},	// col_236
				{$col_237, "ELM"},	// col_237
				{$col_238, "ELM"},	// col_238
				{$col_239, "ELM"},	// col_239
				{$col_240, "ELM"},	// col_240
				{$col_241, "ELM"},	// col_241
				{$col_242, "ELM"},	// col_242
				{$col_243, "ELM"},	// col_243
				{$col_244, "ELM"},	// col_244
				{$col_245, "ELM"},	// col_245
				{$col_246, "ELM"},	// col_246
				{$col_247, "ELM"},	// col_247
				{$col_248, "ELM"},	// col_248
				{$col_249, "ELM"},	// col_249
				{$col_250, "ELM"},	// col_250
				{$col_251, "ELM"},	// col_251
				{$col_252, "ELM"},	// col_252
				{$col_253, "ELM"},	// col_253
				{$col_254, "ELM"},	// col_254
				{$col_255, "ELM"},	// col_255
				{$col_256, "ELM"},	// col_256
				{$col_257, "ELM"},	// col_257
				{$col_258, "ELM"},	// col_258
				{$col_259, "ELM"},	// col_259
				{$col_260, "ELM"},	// col_260
				{$col_261, "ELM"},	// col_261
				{$col_262, "ELM"},	// col_262
				{$col_263, "ELM"},	// col_263
				{$col_264, "ELM"},	// col_264
				{$col_265, "ELM"},	// col_265
				{$col_266, "ELM"},	// col_266
				{$col_267, "ELM"},	// col_267
				{$col_268, "ELM"},	// col_268
				{$col_269, "ELM"},	// col_269
				{$col_270, "ELM"},	// col_270
				{$col_271, "ELM"},	// col_271
				{$col_272, "ELM"},	// col_272
				{$col_273, "ELM"},	// col_273
				{$col_274, "ELM"},	// col_274
				{$col_275, "ELM"},	// col_275
				{$col_276, "ELM"},	// col_276
				{$col_277, "ELM"},	// col_277
				{$col_278, "ELM"},	// col_278
				{$col_279, "ELM"},	// col_279
				{$col_280, "ELM"},	// col_280
				{$col_281, "ELM"},	// col_281
				{$col_282, "ELM"},	// col_282
				{$col_283, "ELM"},	// col_283
				{$col_284, "ELM"},	// col_284
				{$col_285, "ELM"},	// col_285
				{$col_286, "ELM"},	// col_286
				{$col_287, "ELM"},	// col_287
				{$col_288, "ELM"},	// col_288
				{$col_289, "ELM"},	// col_289
				{$col_290, "ELM"},	// col_290
				{$col_291, "ELM"},	// col_291
				{$col_292, "ELM"},	// col_292
				{$col_293, "ELM"},	// col_293
				{$col_294, "ELM"},	// col_294
				{$col_295, "ELM"},	// col_295
				{$col_296, "ELM"},	// col_296
				{$col_297, "ELM"},	// col_297
				{$col_298, "ELM"},	// col_298
				{$col_299, "ELM"}	// col_299
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
				{$col_000, "Key"},	// col_000
				{$col_001, "Key"},	// col_001
				{$col_002, "Key"},	// col_002
				{$col_003, "Key"},	// col_003
				{$col_004, "Key"},	// col_004
				{$col_005, "Key"},	// col_005
				{$col_006, "Key"},	// col_006
				{$col_007, "Key"},	// col_007
				{$col_008, "Key"},	// col_008
				{$col_009, "Key"},	// col_009
				{$col_010, "Key"},	// col_010
				{$col_011, "Key"},	// col_011
				{$col_012, "Key"},	// col_012
				{$col_013, "Key"},	// col_013
				{$col_014, "Key"},	// col_014
				{$col_015, "Key"},	// col_015
				{$col_016, "Key"},	// col_016
				{$col_017, "Key"},	// col_017
				{$col_018, "Key"},	// col_018
				{$col_019, "Key"},	// col_019
				{$col_020, "Key"},	// col_020
				{$col_021, "Key"},	// col_021
				{$col_022, "Key"},	// col_022
				{$col_023, "Key"},	// col_023
				{$col_024, "Key"},	// col_024
				{$col_025, "Key"},	// col_025
				{$col_026, "Key"},	// col_026
				{$col_027, "Key"},	// col_027
				{$col_028, "Key"},	// col_028
				{$col_029, "Key"},	// col_029
				{$col_030, "Key"},	// col_030
				{$col_031, "Key"},	// col_031
				{$col_032, "Key"},	// col_032
				{$col_033, "Key"},	// col_033
				{$col_034, "Key"},	// col_034
				{$col_035, "Key"},	// col_035
				{$col_036, "Key"},	// col_036
				{$col_037, "Key"},	// col_037
				{$col_038, "Key"},	// col_038
				{$col_039, "Key"},	// col_039
				{$col_040, "Key"},	// col_040
				{$col_041, "Key"},	// col_041
				{$col_042, "Key"},	// col_042
				{$col_043, "Key"},	// col_043
				{$col_044, "Key"},	// col_044
				{$col_045, "Key"},	// col_045
				{$col_046, "Key"},	// col_046
				{$col_047, "Key"},	// col_047
				{$col_048, "Key"},	// col_048
				{$col_049, "Key"},	// col_049
				{$col_050, "Key"},	// col_050
				{$col_051, "Key"},	// col_051
				{$col_052, "Key"},	// col_052
				{$col_053, "Key"},	// col_053
				{$col_054, "Key"},	// col_054
				{$col_055, "Key"},	// col_055
				{$col_056, "Key"},	// col_056
				{$col_057, "Key"},	// col_057
				{$col_058, "Key"},	// col_058
				{$col_059, "Key"},	// col_059
				{$col_060, "Key"},	// col_060
				{$col_061, "Key"},	// col_061
				{$col_062, "Key"},	// col_062
				{$col_063, "Key"},	// col_063
				{$col_064, "Key"},	// col_064
				{$col_065, "Key"},	// col_065
				{$col_066, "Key"},	// col_066
				{$col_067, "Key"},	// col_067
				{$col_068, "Key"},	// col_068
				{$col_069, "Key"},	// col_069
				{$col_070, "Key"},	// col_070
				{$col_071, "Key"},	// col_071
				{$col_072, "Key"},	// col_072
				{$col_073, "Key"},	// col_073
				{$col_074, "Key"},	// col_074
				{$col_075, "Key"},	// col_075
				{$col_076, "Key"},	// col_076
				{$col_077, "Key"},	// col_077
				{$col_078, "Key"},	// col_078
				{$col_079, "Key"},	// col_079
				{$col_080, "Key"},	// col_080
				{$col_081, "Key"},	// col_081
				{$col_082, "Key"},	// col_082
				{$col_083, "Key"},	// col_083
				{$col_084, "Key"},	// col_084
				{$col_085, "Key"},	// col_085
				{$col_086, "Key"},	// col_086
				{$col_087, "Key"},	// col_087
				{$col_088, "Key"},	// col_088
				{$col_089, "Key"},	// col_089
				{$col_090, "Key"},	// col_090
				{$col_091, "Key"},	// col_091
				{$col_092, "Key"},	// col_092
				{$col_093, "Key"},	// col_093
				{$col_094, "Key"},	// col_094
				{$col_095, "Key"},	// col_095
				{$col_096, "Key"},	// col_096
				{$col_097, "Key"},	// col_097
				{$col_098, "Key"},	// col_098
				{$col_099, "Key"},	// col_099
				{$col_100, "Key"},	// col_100
				{$col_101, "Key"},	// col_101
				{$col_102, "Key"},	// col_102
				{$col_103, "Key"},	// col_103
				{$col_104, "Key"},	// col_104
				{$col_105, "Key"},	// col_105
				{$col_106, "Key"},	// col_106
				{$col_107, "Key"},	// col_107
				{$col_108, "Key"},	// col_108
				{$col_109, "Key"},	// col_109
				{$col_110, "Key"},	// col_110
				{$col_111, "Key"},	// col_111
				{$col_112, "Key"},	// col_112
				{$col_113, "Key"},	// col_113
				{$col_114, "Key"},	// col_114
				{$col_115, "Key"},	// col_115
				{$col_116, "Key"},	// col_116
				{$col_117, "Key"},	// col_117
				{$col_118, "Key"},	// col_118
				{$col_119, "Key"},	// col_119
				{$col_120, "Key"},	// col_120
				{$col_121, "Key"},	// col_121
				{$col_122, "Key"},	// col_122
				{$col_123, "Key"},	// col_123
				{$col_124, "Key"},	// col_124
				{$col_125, "Key"},	// col_125
				{$col_126, "Key"},	// col_126
				{$col_127, "Key"},	// col_127
				{$col_128, "Key"},	// col_128
				{$col_129, "Key"},	// col_129
				{$col_130, "Key"},	// col_130
				{$col_131, "Key"},	// col_131
				{$col_132, "Key"},	// col_132
				{$col_133, "Key"},	// col_133
				{$col_134, "Key"},	// col_134
				{$col_135, "Key"},	// col_135
				{$col_136, "Key"},	// col_136
				{$col_137, "Key"},	// col_137
				{$col_138, "Key"},	// col_138
				{$col_139, "Key"},	// col_139
				{$col_140, "Key"},	// col_140
				{$col_141, "Key"},	// col_141
				{$col_142, "Key"},	// col_142
				{$col_143, "Key"},	// col_143
				{$col_144, "Key"},	// col_144
				{$col_145, "Key"},	// col_145
				{$col_146, "Key"},	// col_146
				{$col_147, "Key"},	// col_147
				{$col_148, "Key"},	// col_148
				{$col_149, "Key"},	// col_149
				{$col_150, "Key"},	// col_150
				{$col_151, "Key"},	// col_151
				{$col_152, "Key"},	// col_152
				{$col_153, "Key"},	// col_153
				{$col_154, "Key"},	// col_154
				{$col_155, "Key"},	// col_155
				{$col_156, "Key"},	// col_156
				{$col_157, "Key"},	// col_157
				{$col_158, "Key"},	// col_158
				{$col_159, "Key"},	// col_159
				{$col_160, "Key"},	// col_160
				{$col_161, "Key"},	// col_161
				{$col_162, "Key"},	// col_162
				{$col_163, "Key"},	// col_163
				{$col_164, "Key"},	// col_164
				{$col_165, "Key"},	// col_165
				{$col_166, "Key"},	// col_166
				{$col_167, "Key"},	// col_167
				{$col_168, "Key"},	// col_168
				{$col_169, "Key"},	// col_169
				{$col_170, "Key"},	// col_170
				{$col_171, "Key"},	// col_171
				{$col_172, "Key"},	// col_172
				{$col_173, "Key"},	// col_173
				{$col_174, "Key"},	// col_174
				{$col_175, "Key"},	// col_175
				{$col_176, "Key"},	// col_176
				{$col_177, "Key"},	// col_177
				{$col_178, "Key"},	// col_178
				{$col_179, "Key"},	// col_179
				{$col_180, "Key"},	// col_180
				{$col_181, "Key"},	// col_181
				{$col_182, "Key"},	// col_182
				{$col_183, "Key"},	// col_183
				{$col_184, "Key"},	// col_184
				{$col_185, "Key"},	// col_185
				{$col_186, "Key"},	// col_186
				{$col_187, "Key"},	// col_187
				{$col_188, "Key"},	// col_188
				{$col_189, "Key"},	// col_189
				{$col_190, "Key"},	// col_190
				{$col_191, "Key"},	// col_191
				{$col_192, "Key"},	// col_192
				{$col_193, "Key"},	// col_193
				{$col_194, "Key"},	// col_194
				{$col_195, "Key"},	// col_195
				{$col_196, "Key"},	// col_196
				{$col_197, "Key"},	// col_197
				{$col_198, "Key"},	// col_198
				{$col_199, "Key"},	// col_199
				{$col_200, "Key"},	// col_200
				{$col_201, "Key"},	// col_201
				{$col_202, "Key"},	// col_202
				{$col_203, "Key"},	// col_203
				{$col_204, "Key"},	// col_204
				{$col_205, "Key"},	// col_205
				{$col_206, "Key"},	// col_206
				{$col_207, "Key"},	// col_207
				{$col_208, "Key"},	// col_208
				{$col_209, "Key"},	// col_209
				{$col_210, "Key"},	// col_210
				{$col_211, "Key"},	// col_211
				{$col_212, "Key"},	// col_212
				{$col_213, "Key"},	// col_213
				{$col_214, "Key"},	// col_214
				{$col_215, "Key"},	// col_215
				{$col_216, "Key"},	// col_216
				{$col_217, "Key"},	// col_217
				{$col_218, "Key"},	// col_218
				{$col_219, "Key"},	// col_219
				{$col_220, "Key"},	// col_220
				{$col_221, "Key"},	// col_221
				{$col_222, "Key"},	// col_222
				{$col_223, "Key"},	// col_223
				{$col_224, "Key"},	// col_224
				{$col_225, "Key"},	// col_225
				{$col_226, "Key"},	// col_226
				{$col_227, "Key"},	// col_227
				{$col_228, "Key"},	// col_228
				{$col_229, "Key"},	// col_229
				{$col_230, "Key"},	// col_230
				{$col_231, "Key"},	// col_231
				{$col_232, "Key"},	// col_232
				{$col_233, "Key"},	// col_233
				{$col_234, "Key"},	// col_234
				{$col_235, "Key"},	// col_235
				{$col_236, "Key"},	// col_236
				{$col_237, "Key"},	// col_237
				{$col_238, "Key"},	// col_238
				{$col_239, "Key"},	// col_239
				{$col_240, "Key"},	// col_240
				{$col_241, "Key"},	// col_241
				{$col_242, "Key"},	// col_242
				{$col_243, "Key"},	// col_243
				{$col_244, "Key"},	// col_244
				{$col_245, "Key"},	// col_245
				{$col_246, "Key"},	// col_246
				{$col_247, "Key"},	// col_247
				{$col_248, "Key"},	// col_248
				{$col_249, "Key"},	// col_249
				{$col_250, "Key"},	// col_250
				{$col_251, "Key"},	// col_251
				{$col_252, "Key"},	// col_252
				{$col_253, "Key"},	// col_253
				{$col_254, "Key"},	// col_254
				{$col_255, "Key"},	// col_255
				{$col_256, "Key"},	// col_256
				{$col_257, "Key"},	// col_257
				{$col_258, "Key"},	// col_258
				{$col_259, "Key"},	// col_259
				{$col_260, "Key"},	// col_260
				{$col_261, "Key"},	// col_261
				{$col_262, "Key"},	// col_262
				{$col_263, "Key"},	// col_263
				{$col_264, "Key"},	// col_264
				{$col_265, "Key"},	// col_265
				{$col_266, "Key"},	// col_266
				{$col_267, "Key"},	// col_267
				{$col_268, "Key"},	// col_268
				{$col_269, "Key"},	// col_269
				{$col_270, "Key"},	// col_270
				{$col_271, "Key"},	// col_271
				{$col_272, "Key"},	// col_272
				{$col_273, "Key"},	// col_273
				{$col_274, "Key"},	// col_274
				{$col_275, "Key"},	// col_275
				{$col_276, "Key"},	// col_276
				{$col_277, "Key"},	// col_277
				{$col_278, "Key"},	// col_278
				{$col_279, "Key"},	// col_279
				{$col_280, "Key"},	// col_280
				{$col_281, "Key"},	// col_281
				{$col_282, "Key"},	// col_282
				{$col_283, "Key"},	// col_283
				{$col_284, "Key"},	// col_284
				{$col_285, "Key"},	// col_285
				{$col_286, "Key"},	// col_286
				{$col_287, "Key"},	// col_287
				{$col_288, "Key"},	// col_288
				{$col_289, "Key"},	// col_289
				{$col_290, "Key"},	// col_290
				{$col_291, "Key"},	// col_291
				{$col_292, "Key"},	// col_292
				{$col_293, "Key"},	// col_293
				{$col_294, "Key"},	// col_294
				{$col_295, "Key"},	// col_295
				{$col_296, "Key"},	// col_296
				{$col_297, "Key"},	// col_297
				{$col_298, "Key"},	// col_298
				{$col_299, "Key"}	// col_299
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
				{$diff_ttl, "AMT"},	// diff_ttl
				{$std_ttl, "AMT"},	// std_ttl
				{$ttl, "AMT"},	// ttl
				{$diff_var_cost, "AMT"},	// diff_var_cost
				{$std_var_cost, "AMT"},	// std_var_cost
				{$var_cost, "AMT"},	// var_cost
				{$diff_fxd_cost, "AMT"},	// diff_fxd_cost
				{$std_fxd_cost, "AMT"},	// std_fxd_cost
				{$fxd_cost, "AMT"},	// fxd_cost
				{$col_000, "AMT"},	// col_000
				{$col_001, "AMT"},	// col_001
				{$col_002, "AMT"},	// col_002
				{$col_003, "AMT"},	// col_003
				{$col_004, "AMT"},	// col_004
				{$col_005, "AMT"},	// col_005
				{$col_006, "AMT"},	// col_006
				{$col_007, "AMT"},	// col_007
				{$col_008, "AMT"},	// col_008
				{$col_009, "AMT"},	// col_009
				{$col_010, "AMT"},	// col_010
				{$col_011, "AMT"},	// col_011
				{$col_012, "AMT"},	// col_012
				{$col_013, "AMT"},	// col_013
				{$col_014, "AMT"},	// col_014
				{$col_015, "AMT"},	// col_015
				{$col_016, "AMT"},	// col_016
				{$col_017, "AMT"},	// col_017
				{$col_018, "AMT"},	// col_018
				{$col_019, "AMT"},	// col_019
				{$col_020, "AMT"},	// col_020
				{$col_021, "AMT"},	// col_021
				{$col_022, "AMT"},	// col_022
				{$col_023, "AMT"},	// col_023
				{$col_024, "AMT"},	// col_024
				{$col_025, "AMT"},	// col_025
				{$col_026, "AMT"},	// col_026
				{$col_027, "AMT"},	// col_027
				{$col_028, "AMT"},	// col_028
				{$col_029, "AMT"},	// col_029
				{$col_030, "AMT"},	// col_030
				{$col_031, "AMT"},	// col_031
				{$col_032, "AMT"},	// col_032
				{$col_033, "AMT"},	// col_033
				{$col_034, "AMT"},	// col_034
				{$col_035, "AMT"},	// col_035
				{$col_036, "AMT"},	// col_036
				{$col_037, "AMT"},	// col_037
				{$col_038, "AMT"},	// col_038
				{$col_039, "AMT"},	// col_039
				{$col_040, "AMT"},	// col_040
				{$col_041, "AMT"},	// col_041
				{$col_042, "AMT"},	// col_042
				{$col_043, "AMT"},	// col_043
				{$col_044, "AMT"},	// col_044
				{$col_045, "AMT"},	// col_045
				{$col_046, "AMT"},	// col_046
				{$col_047, "AMT"},	// col_047
				{$col_048, "AMT"},	// col_048
				{$col_049, "AMT"},	// col_049
				{$col_050, "AMT"},	// col_050
				{$col_051, "AMT"},	// col_051
				{$col_052, "AMT"},	// col_052
				{$col_053, "AMT"},	// col_053
				{$col_054, "AMT"},	// col_054
				{$col_055, "AMT"},	// col_055
				{$col_056, "AMT"},	// col_056
				{$col_057, "AMT"},	// col_057
				{$col_058, "AMT"},	// col_058
				{$col_059, "AMT"},	// col_059
				{$col_060, "AMT"},	// col_060
				{$col_061, "AMT"},	// col_061
				{$col_062, "AMT"},	// col_062
				{$col_063, "AMT"},	// col_063
				{$col_064, "AMT"},	// col_064
				{$col_065, "AMT"},	// col_065
				{$col_066, "AMT"},	// col_066
				{$col_067, "AMT"},	// col_067
				{$col_068, "AMT"},	// col_068
				{$col_069, "AMT"},	// col_069
				{$col_070, "AMT"},	// col_070
				{$col_071, "AMT"},	// col_071
				{$col_072, "AMT"},	// col_072
				{$col_073, "AMT"},	// col_073
				{$col_074, "AMT"},	// col_074
				{$col_075, "AMT"},	// col_075
				{$col_076, "AMT"},	// col_076
				{$col_077, "AMT"},	// col_077
				{$col_078, "AMT"},	// col_078
				{$col_079, "AMT"},	// col_079
				{$col_080, "AMT"},	// col_080
				{$col_081, "AMT"},	// col_081
				{$col_082, "AMT"},	// col_082
				{$col_083, "AMT"},	// col_083
				{$col_084, "AMT"},	// col_084
				{$col_085, "AMT"},	// col_085
				{$col_086, "AMT"},	// col_086
				{$col_087, "AMT"},	// col_087
				{$col_088, "AMT"},	// col_088
				{$col_089, "AMT"},	// col_089
				{$col_090, "AMT"},	// col_090
				{$col_091, "AMT"},	// col_091
				{$col_092, "AMT"},	// col_092
				{$col_093, "AMT"},	// col_093
				{$col_094, "AMT"},	// col_094
				{$col_095, "AMT"},	// col_095
				{$col_096, "AMT"},	// col_096
				{$col_097, "AMT"},	// col_097
				{$col_098, "AMT"},	// col_098
				{$col_099, "AMT"},	// col_099
				{$col_100, "AMT"},	// col_100
				{$col_101, "AMT"},	// col_101
				{$col_102, "AMT"},	// col_102
				{$col_103, "AMT"},	// col_103
				{$col_104, "AMT"},	// col_104
				{$col_105, "AMT"},	// col_105
				{$col_106, "AMT"},	// col_106
				{$col_107, "AMT"},	// col_107
				{$col_108, "AMT"},	// col_108
				{$col_109, "AMT"},	// col_109
				{$col_110, "AMT"},	// col_110
				{$col_111, "AMT"},	// col_111
				{$col_112, "AMT"},	// col_112
				{$col_113, "AMT"},	// col_113
				{$col_114, "AMT"},	// col_114
				{$col_115, "AMT"},	// col_115
				{$col_116, "AMT"},	// col_116
				{$col_117, "AMT"},	// col_117
				{$col_118, "AMT"},	// col_118
				{$col_119, "AMT"},	// col_119
				{$col_120, "AMT"},	// col_120
				{$col_121, "AMT"},	// col_121
				{$col_122, "AMT"},	// col_122
				{$col_123, "AMT"},	// col_123
				{$col_124, "AMT"},	// col_124
				{$col_125, "AMT"},	// col_125
				{$col_126, "AMT"},	// col_126
				{$col_127, "AMT"},	// col_127
				{$col_128, "AMT"},	// col_128
				{$col_129, "AMT"},	// col_129
				{$col_130, "AMT"},	// col_130
				{$col_131, "AMT"},	// col_131
				{$col_132, "AMT"},	// col_132
				{$col_133, "AMT"},	// col_133
				{$col_134, "AMT"},	// col_134
				{$col_135, "AMT"},	// col_135
				{$col_136, "AMT"},	// col_136
				{$col_137, "AMT"},	// col_137
				{$col_138, "AMT"},	// col_138
				{$col_139, "AMT"},	// col_139
				{$col_140, "AMT"},	// col_140
				{$col_141, "AMT"},	// col_141
				{$col_142, "AMT"},	// col_142
				{$col_143, "AMT"},	// col_143
				{$col_144, "AMT"},	// col_144
				{$col_145, "AMT"},	// col_145
				{$col_146, "AMT"},	// col_146
				{$col_147, "AMT"},	// col_147
				{$col_148, "AMT"},	// col_148
				{$col_149, "AMT"},	// col_149
				{$col_150, "AMT"},	// col_150
				{$col_151, "AMT"},	// col_151
				{$col_152, "AMT"},	// col_152
				{$col_153, "AMT"},	// col_153
				{$col_154, "AMT"},	// col_154
				{$col_155, "AMT"},	// col_155
				{$col_156, "AMT"},	// col_156
				{$col_157, "AMT"},	// col_157
				{$col_158, "AMT"},	// col_158
				{$col_159, "AMT"},	// col_159
				{$col_160, "AMT"},	// col_160
				{$col_161, "AMT"},	// col_161
				{$col_162, "AMT"},	// col_162
				{$col_163, "AMT"},	// col_163
				{$col_164, "AMT"},	// col_164
				{$col_165, "AMT"},	// col_165
				{$col_166, "AMT"},	// col_166
				{$col_167, "AMT"},	// col_167
				{$col_168, "AMT"},	// col_168
				{$col_169, "AMT"},	// col_169
				{$col_170, "AMT"},	// col_170
				{$col_171, "AMT"},	// col_171
				{$col_172, "AMT"},	// col_172
				{$col_173, "AMT"},	// col_173
				{$col_174, "AMT"},	// col_174
				{$col_175, "AMT"},	// col_175
				{$col_176, "AMT"},	// col_176
				{$col_177, "AMT"},	// col_177
				{$col_178, "AMT"},	// col_178
				{$col_179, "AMT"},	// col_179
				{$col_180, "AMT"},	// col_180
				{$col_181, "AMT"},	// col_181
				{$col_182, "AMT"},	// col_182
				{$col_183, "AMT"},	// col_183
				{$col_184, "AMT"},	// col_184
				{$col_185, "AMT"},	// col_185
				{$col_186, "AMT"},	// col_186
				{$col_187, "AMT"},	// col_187
				{$col_188, "AMT"},	// col_188
				{$col_189, "AMT"},	// col_189
				{$col_190, "AMT"},	// col_190
				{$col_191, "AMT"},	// col_191
				{$col_192, "AMT"},	// col_192
				{$col_193, "AMT"},	// col_193
				{$col_194, "AMT"},	// col_194
				{$col_195, "AMT"},	// col_195
				{$col_196, "AMT"},	// col_196
				{$col_197, "AMT"},	// col_197
				{$col_198, "AMT"},	// col_198
				{$col_199, "AMT"},	// col_199
				{$col_200, "AMT"},	// col_200
				{$col_201, "AMT"},	// col_201
				{$col_202, "AMT"},	// col_202
				{$col_203, "AMT"},	// col_203
				{$col_204, "AMT"},	// col_204
				{$col_205, "AMT"},	// col_205
				{$col_206, "AMT"},	// col_206
				{$col_207, "AMT"},	// col_207
				{$col_208, "AMT"},	// col_208
				{$col_209, "AMT"},	// col_209
				{$col_210, "AMT"},	// col_210
				{$col_211, "AMT"},	// col_211
				{$col_212, "AMT"},	// col_212
				{$col_213, "AMT"},	// col_213
				{$col_214, "AMT"},	// col_214
				{$col_215, "AMT"},	// col_215
				{$col_216, "AMT"},	// col_216
				{$col_217, "AMT"},	// col_217
				{$col_218, "AMT"},	// col_218
				{$col_219, "AMT"},	// col_219
				{$col_220, "AMT"},	// col_220
				{$col_221, "AMT"},	// col_221
				{$col_222, "AMT"},	// col_222
				{$col_223, "AMT"},	// col_223
				{$col_224, "AMT"},	// col_224
				{$col_225, "AMT"},	// col_225
				{$col_226, "AMT"},	// col_226
				{$col_227, "AMT"},	// col_227
				{$col_228, "AMT"},	// col_228
				{$col_229, "AMT"},	// col_229
				{$col_230, "AMT"},	// col_230
				{$col_231, "AMT"},	// col_231
				{$col_232, "AMT"},	// col_232
				{$col_233, "AMT"},	// col_233
				{$col_234, "AMT"},	// col_234
				{$col_235, "AMT"},	// col_235
				{$col_236, "AMT"},	// col_236
				{$col_237, "AMT"},	// col_237
				{$col_238, "AMT"},	// col_238
				{$col_239, "AMT"},	// col_239
				{$col_240, "AMT"},	// col_240
				{$col_241, "AMT"},	// col_241
				{$col_242, "AMT"},	// col_242
				{$col_243, "AMT"},	// col_243
				{$col_244, "AMT"},	// col_244
				{$col_245, "AMT"},	// col_245
				{$col_246, "AMT"},	// col_246
				{$col_247, "AMT"},	// col_247
				{$col_248, "AMT"},	// col_248
				{$col_249, "AMT"},	// col_249
				{$col_250, "AMT"},	// col_250
				{$col_251, "AMT"},	// col_251
				{$col_252, "AMT"},	// col_252
				{$col_253, "AMT"},	// col_253
				{$col_254, "AMT"},	// col_254
				{$col_255, "AMT"},	// col_255
				{$col_256, "AMT"},	// col_256
				{$col_257, "AMT"},	// col_257
				{$col_258, "AMT"},	// col_258
				{$col_259, "AMT"},	// col_259
				{$col_260, "AMT"},	// col_260
				{$col_261, "AMT"},	// col_261
				{$col_262, "AMT"},	// col_262
				{$col_263, "AMT"},	// col_263
				{$col_264, "AMT"},	// col_264
				{$col_265, "AMT"},	// col_265
				{$col_266, "AMT"},	// col_266
				{$col_267, "AMT"},	// col_267
				{$col_268, "AMT"},	// col_268
				{$col_269, "AMT"},	// col_269
				{$col_270, "AMT"},	// col_270
				{$col_271, "AMT"},	// col_271
				{$col_272, "AMT"},	// col_272
				{$col_273, "AMT"},	// col_273
				{$col_274, "AMT"},	// col_274
				{$col_275, "AMT"},	// col_275
				{$col_276, "AMT"},	// col_276
				{$col_277, "AMT"},	// col_277
				{$col_278, "AMT"},	// col_278
				{$col_279, "AMT"},	// col_279
				{$col_280, "AMT"},	// col_280
				{$col_281, "AMT"},	// col_281
				{$col_282, "AMT"},	// col_282
				{$col_283, "AMT"},	// col_283
				{$col_284, "AMT"},	// col_284
				{$col_285, "AMT"},	// col_285
				{$col_286, "AMT"},	// col_286
				{$col_287, "AMT"},	// col_287
				{$col_288, "AMT"},	// col_288
				{$col_289, "AMT"},	// col_289
				{$col_290, "AMT"},	// col_290
				{$col_291, "AMT"},	// col_291
				{$col_292, "AMT"},	// col_292
				{$col_293, "AMT"},	// col_293
				{$col_294, "AMT"},	// col_294
				{$col_295, "AMT"},	// col_295
				{$col_296, "AMT"},	// col_296
				{$col_297, "AMT"},	// col_297
				{$col_298, "AMT"},	// col_298
				{$col_299, "AMT"}	// col_299
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
	protected Rslt9R_MC_A(ConstMetaList<? extends Rslt9R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rslt9R clone() {
		return (Rslt9R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rslt9R createInstance() {
		return (Rslt9R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rslt9R getValues(String... names) {
		return (Rslt9R) super.getValues(names);
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


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 2, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 2, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 3, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 3, $loc_nm, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 4, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 4, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 5, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 5, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 6, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 6, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 6, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 6, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 6, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 6, $oper_seq, value);
	}


	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public String wk_cost_cd() {
		return getConstString(offset + 7, $wk_cost_cd);
	}

	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		setConstString(offset + 7, $wk_cost_cd, value);
	}


	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public String wk_cost_nm() {
		return getConstString(offset + 8, $wk_cost_nm);
	}

	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public void wk_cost_nm(String value) {
		setConstString(offset + 8, $wk_cost_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 9, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 9, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 9, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 9, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 9, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 9, $dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_diff_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 10, $qty_diff_p);
	}
	
	public void qty_diff_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 10, $qty_diff_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR std_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 11, $std_qty_p);
	}
	
	public void std_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 11, $std_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 12, $act_qty_p);
	}
	
	public void act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 12, $act_qty_p, row);
	}


	/**
	 * Man-hour unit name 工数単位名.<p>
	 *
	 */
	public String wk_cost_unit_nm() {
		return getConstString(offset + 13, $wk_cost_unit_nm);
	}

	/**
	 * Man-hour unit name 工数単位名.<p>
	 *
	 */
	public void wk_cost_unit_nm(String value) {
		setConstString(offset + 13, $wk_cost_unit_nm, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff_ttl() {
		return getConstNumber(offset + 14, $diff_ttl);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff_ttl(MCNumber value) {
		setConstNumber(offset + 14, $diff_ttl, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff_ttl(int value) {
		setConstNumber(offset + 14, $diff_ttl, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff_ttl(long value) {
		setConstNumber(offset + 14, $diff_ttl, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff_ttl(float value) {
		setConstNumber(offset + 14, $diff_ttl, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff_ttl(double value) {
		setConstNumber(offset + 14, $diff_ttl, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std_ttl() {
		return getConstNumber(offset + 15, $std_ttl);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_ttl(MCNumber value) {
		setConstNumber(offset + 15, $std_ttl, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_ttl(int value) {
		setConstNumber(offset + 15, $std_ttl, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_ttl(long value) {
		setConstNumber(offset + 15, $std_ttl, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_ttl(float value) {
		setConstNumber(offset + 15, $std_ttl, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_ttl(double value) {
		setConstNumber(offset + 15, $std_ttl, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber ttl() {
		return getConstNumber(offset + 16, $ttl);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void ttl(MCNumber value) {
		setConstNumber(offset + 16, $ttl, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void ttl(int value) {
		setConstNumber(offset + 16, $ttl, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void ttl(long value) {
		setConstNumber(offset + 16, $ttl, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void ttl(float value) {
		setConstNumber(offset + 16, $ttl, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void ttl(double value) {
		setConstNumber(offset + 16, $ttl, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff_var_cost() {
		return getConstNumber(offset + 17, $diff_var_cost);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff_var_cost(MCNumber value) {
		setConstNumber(offset + 17, $diff_var_cost, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff_var_cost(int value) {
		setConstNumber(offset + 17, $diff_var_cost, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff_var_cost(long value) {
		setConstNumber(offset + 17, $diff_var_cost, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff_var_cost(float value) {
		setConstNumber(offset + 17, $diff_var_cost, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff_var_cost(double value) {
		setConstNumber(offset + 17, $diff_var_cost, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std_var_cost() {
		return getConstNumber(offset + 18, $std_var_cost);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_var_cost(MCNumber value) {
		setConstNumber(offset + 18, $std_var_cost, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_var_cost(int value) {
		setConstNumber(offset + 18, $std_var_cost, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_var_cost(long value) {
		setConstNumber(offset + 18, $std_var_cost, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_var_cost(float value) {
		setConstNumber(offset + 18, $std_var_cost, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_var_cost(double value) {
		setConstNumber(offset + 18, $std_var_cost, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber var_cost() {
		return getConstNumber(offset + 19, $var_cost);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void var_cost(MCNumber value) {
		setConstNumber(offset + 19, $var_cost, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void var_cost(int value) {
		setConstNumber(offset + 19, $var_cost, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void var_cost(long value) {
		setConstNumber(offset + 19, $var_cost, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void var_cost(float value) {
		setConstNumber(offset + 19, $var_cost, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void var_cost(double value) {
		setConstNumber(offset + 19, $var_cost, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff_fxd_cost() {
		return getConstNumber(offset + 20, $diff_fxd_cost);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff_fxd_cost(MCNumber value) {
		setConstNumber(offset + 20, $diff_fxd_cost, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff_fxd_cost(int value) {
		setConstNumber(offset + 20, $diff_fxd_cost, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff_fxd_cost(long value) {
		setConstNumber(offset + 20, $diff_fxd_cost, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff_fxd_cost(float value) {
		setConstNumber(offset + 20, $diff_fxd_cost, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff_fxd_cost(double value) {
		setConstNumber(offset + 20, $diff_fxd_cost, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std_fxd_cost() {
		return getConstNumber(offset + 21, $std_fxd_cost);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_fxd_cost(MCNumber value) {
		setConstNumber(offset + 21, $std_fxd_cost, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_fxd_cost(int value) {
		setConstNumber(offset + 21, $std_fxd_cost, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_fxd_cost(long value) {
		setConstNumber(offset + 21, $std_fxd_cost, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_fxd_cost(float value) {
		setConstNumber(offset + 21, $std_fxd_cost, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_fxd_cost(double value) {
		setConstNumber(offset + 21, $std_fxd_cost, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber fxd_cost() {
		return getConstNumber(offset + 22, $fxd_cost);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void fxd_cost(MCNumber value) {
		setConstNumber(offset + 22, $fxd_cost, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void fxd_cost(int value) {
		setConstNumber(offset + 22, $fxd_cost, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void fxd_cost(long value) {
		setConstNumber(offset + 22, $fxd_cost, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void fxd_cost(float value) {
		setConstNumber(offset + 22, $fxd_cost, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void fxd_cost(double value) {
		setConstNumber(offset + 22, $fxd_cost, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_000() {
		return getConstNumber(offset + 23, $col_000);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_000(MCNumber value) {
		setConstNumber(offset + 23, $col_000, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_000(int value) {
		setConstNumber(offset + 23, $col_000, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_000(long value) {
		setConstNumber(offset + 23, $col_000, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_000(float value) {
		setConstNumber(offset + 23, $col_000, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_000(double value) {
		setConstNumber(offset + 23, $col_000, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_001() {
		return getConstNumber(offset + 24, $col_001);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_001(MCNumber value) {
		setConstNumber(offset + 24, $col_001, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_001(int value) {
		setConstNumber(offset + 24, $col_001, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_001(long value) {
		setConstNumber(offset + 24, $col_001, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_001(float value) {
		setConstNumber(offset + 24, $col_001, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_001(double value) {
		setConstNumber(offset + 24, $col_001, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_002() {
		return getConstNumber(offset + 25, $col_002);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_002(MCNumber value) {
		setConstNumber(offset + 25, $col_002, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_002(int value) {
		setConstNumber(offset + 25, $col_002, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_002(long value) {
		setConstNumber(offset + 25, $col_002, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_002(float value) {
		setConstNumber(offset + 25, $col_002, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_002(double value) {
		setConstNumber(offset + 25, $col_002, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_003() {
		return getConstNumber(offset + 26, $col_003);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_003(MCNumber value) {
		setConstNumber(offset + 26, $col_003, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_003(int value) {
		setConstNumber(offset + 26, $col_003, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_003(long value) {
		setConstNumber(offset + 26, $col_003, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_003(float value) {
		setConstNumber(offset + 26, $col_003, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_003(double value) {
		setConstNumber(offset + 26, $col_003, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_004() {
		return getConstNumber(offset + 27, $col_004);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_004(MCNumber value) {
		setConstNumber(offset + 27, $col_004, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_004(int value) {
		setConstNumber(offset + 27, $col_004, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_004(long value) {
		setConstNumber(offset + 27, $col_004, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_004(float value) {
		setConstNumber(offset + 27, $col_004, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_004(double value) {
		setConstNumber(offset + 27, $col_004, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_005() {
		return getConstNumber(offset + 28, $col_005);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_005(MCNumber value) {
		setConstNumber(offset + 28, $col_005, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_005(int value) {
		setConstNumber(offset + 28, $col_005, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_005(long value) {
		setConstNumber(offset + 28, $col_005, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_005(float value) {
		setConstNumber(offset + 28, $col_005, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_005(double value) {
		setConstNumber(offset + 28, $col_005, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_006() {
		return getConstNumber(offset + 29, $col_006);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_006(MCNumber value) {
		setConstNumber(offset + 29, $col_006, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_006(int value) {
		setConstNumber(offset + 29, $col_006, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_006(long value) {
		setConstNumber(offset + 29, $col_006, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_006(float value) {
		setConstNumber(offset + 29, $col_006, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_006(double value) {
		setConstNumber(offset + 29, $col_006, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_007() {
		return getConstNumber(offset + 30, $col_007);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_007(MCNumber value) {
		setConstNumber(offset + 30, $col_007, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_007(int value) {
		setConstNumber(offset + 30, $col_007, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_007(long value) {
		setConstNumber(offset + 30, $col_007, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_007(float value) {
		setConstNumber(offset + 30, $col_007, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_007(double value) {
		setConstNumber(offset + 30, $col_007, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_008() {
		return getConstNumber(offset + 31, $col_008);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_008(MCNumber value) {
		setConstNumber(offset + 31, $col_008, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_008(int value) {
		setConstNumber(offset + 31, $col_008, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_008(long value) {
		setConstNumber(offset + 31, $col_008, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_008(float value) {
		setConstNumber(offset + 31, $col_008, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_008(double value) {
		setConstNumber(offset + 31, $col_008, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_009() {
		return getConstNumber(offset + 32, $col_009);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_009(MCNumber value) {
		setConstNumber(offset + 32, $col_009, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_009(int value) {
		setConstNumber(offset + 32, $col_009, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_009(long value) {
		setConstNumber(offset + 32, $col_009, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_009(float value) {
		setConstNumber(offset + 32, $col_009, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_009(double value) {
		setConstNumber(offset + 32, $col_009, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_010() {
		return getConstNumber(offset + 33, $col_010);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_010(MCNumber value) {
		setConstNumber(offset + 33, $col_010, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_010(int value) {
		setConstNumber(offset + 33, $col_010, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_010(long value) {
		setConstNumber(offset + 33, $col_010, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_010(float value) {
		setConstNumber(offset + 33, $col_010, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_010(double value) {
		setConstNumber(offset + 33, $col_010, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_011() {
		return getConstNumber(offset + 34, $col_011);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_011(MCNumber value) {
		setConstNumber(offset + 34, $col_011, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_011(int value) {
		setConstNumber(offset + 34, $col_011, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_011(long value) {
		setConstNumber(offset + 34, $col_011, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_011(float value) {
		setConstNumber(offset + 34, $col_011, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_011(double value) {
		setConstNumber(offset + 34, $col_011, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_012() {
		return getConstNumber(offset + 35, $col_012);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_012(MCNumber value) {
		setConstNumber(offset + 35, $col_012, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_012(int value) {
		setConstNumber(offset + 35, $col_012, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_012(long value) {
		setConstNumber(offset + 35, $col_012, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_012(float value) {
		setConstNumber(offset + 35, $col_012, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_012(double value) {
		setConstNumber(offset + 35, $col_012, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_013() {
		return getConstNumber(offset + 36, $col_013);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_013(MCNumber value) {
		setConstNumber(offset + 36, $col_013, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_013(int value) {
		setConstNumber(offset + 36, $col_013, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_013(long value) {
		setConstNumber(offset + 36, $col_013, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_013(float value) {
		setConstNumber(offset + 36, $col_013, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_013(double value) {
		setConstNumber(offset + 36, $col_013, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_014() {
		return getConstNumber(offset + 37, $col_014);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_014(MCNumber value) {
		setConstNumber(offset + 37, $col_014, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_014(int value) {
		setConstNumber(offset + 37, $col_014, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_014(long value) {
		setConstNumber(offset + 37, $col_014, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_014(float value) {
		setConstNumber(offset + 37, $col_014, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_014(double value) {
		setConstNumber(offset + 37, $col_014, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_015() {
		return getConstNumber(offset + 38, $col_015);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_015(MCNumber value) {
		setConstNumber(offset + 38, $col_015, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_015(int value) {
		setConstNumber(offset + 38, $col_015, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_015(long value) {
		setConstNumber(offset + 38, $col_015, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_015(float value) {
		setConstNumber(offset + 38, $col_015, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_015(double value) {
		setConstNumber(offset + 38, $col_015, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_016() {
		return getConstNumber(offset + 39, $col_016);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_016(MCNumber value) {
		setConstNumber(offset + 39, $col_016, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_016(int value) {
		setConstNumber(offset + 39, $col_016, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_016(long value) {
		setConstNumber(offset + 39, $col_016, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_016(float value) {
		setConstNumber(offset + 39, $col_016, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_016(double value) {
		setConstNumber(offset + 39, $col_016, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_017() {
		return getConstNumber(offset + 40, $col_017);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_017(MCNumber value) {
		setConstNumber(offset + 40, $col_017, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_017(int value) {
		setConstNumber(offset + 40, $col_017, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_017(long value) {
		setConstNumber(offset + 40, $col_017, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_017(float value) {
		setConstNumber(offset + 40, $col_017, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_017(double value) {
		setConstNumber(offset + 40, $col_017, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_018() {
		return getConstNumber(offset + 41, $col_018);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_018(MCNumber value) {
		setConstNumber(offset + 41, $col_018, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_018(int value) {
		setConstNumber(offset + 41, $col_018, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_018(long value) {
		setConstNumber(offset + 41, $col_018, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_018(float value) {
		setConstNumber(offset + 41, $col_018, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_018(double value) {
		setConstNumber(offset + 41, $col_018, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_019() {
		return getConstNumber(offset + 42, $col_019);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_019(MCNumber value) {
		setConstNumber(offset + 42, $col_019, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_019(int value) {
		setConstNumber(offset + 42, $col_019, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_019(long value) {
		setConstNumber(offset + 42, $col_019, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_019(float value) {
		setConstNumber(offset + 42, $col_019, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_019(double value) {
		setConstNumber(offset + 42, $col_019, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_020() {
		return getConstNumber(offset + 43, $col_020);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_020(MCNumber value) {
		setConstNumber(offset + 43, $col_020, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_020(int value) {
		setConstNumber(offset + 43, $col_020, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_020(long value) {
		setConstNumber(offset + 43, $col_020, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_020(float value) {
		setConstNumber(offset + 43, $col_020, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_020(double value) {
		setConstNumber(offset + 43, $col_020, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_021() {
		return getConstNumber(offset + 44, $col_021);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_021(MCNumber value) {
		setConstNumber(offset + 44, $col_021, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_021(int value) {
		setConstNumber(offset + 44, $col_021, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_021(long value) {
		setConstNumber(offset + 44, $col_021, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_021(float value) {
		setConstNumber(offset + 44, $col_021, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_021(double value) {
		setConstNumber(offset + 44, $col_021, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_022() {
		return getConstNumber(offset + 45, $col_022);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_022(MCNumber value) {
		setConstNumber(offset + 45, $col_022, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_022(int value) {
		setConstNumber(offset + 45, $col_022, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_022(long value) {
		setConstNumber(offset + 45, $col_022, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_022(float value) {
		setConstNumber(offset + 45, $col_022, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_022(double value) {
		setConstNumber(offset + 45, $col_022, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_023() {
		return getConstNumber(offset + 46, $col_023);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_023(MCNumber value) {
		setConstNumber(offset + 46, $col_023, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_023(int value) {
		setConstNumber(offset + 46, $col_023, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_023(long value) {
		setConstNumber(offset + 46, $col_023, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_023(float value) {
		setConstNumber(offset + 46, $col_023, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_023(double value) {
		setConstNumber(offset + 46, $col_023, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_024() {
		return getConstNumber(offset + 47, $col_024);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_024(MCNumber value) {
		setConstNumber(offset + 47, $col_024, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_024(int value) {
		setConstNumber(offset + 47, $col_024, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_024(long value) {
		setConstNumber(offset + 47, $col_024, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_024(float value) {
		setConstNumber(offset + 47, $col_024, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_024(double value) {
		setConstNumber(offset + 47, $col_024, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_025() {
		return getConstNumber(offset + 48, $col_025);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_025(MCNumber value) {
		setConstNumber(offset + 48, $col_025, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_025(int value) {
		setConstNumber(offset + 48, $col_025, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_025(long value) {
		setConstNumber(offset + 48, $col_025, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_025(float value) {
		setConstNumber(offset + 48, $col_025, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_025(double value) {
		setConstNumber(offset + 48, $col_025, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_026() {
		return getConstNumber(offset + 49, $col_026);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_026(MCNumber value) {
		setConstNumber(offset + 49, $col_026, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_026(int value) {
		setConstNumber(offset + 49, $col_026, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_026(long value) {
		setConstNumber(offset + 49, $col_026, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_026(float value) {
		setConstNumber(offset + 49, $col_026, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_026(double value) {
		setConstNumber(offset + 49, $col_026, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_027() {
		return getConstNumber(offset + 50, $col_027);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_027(MCNumber value) {
		setConstNumber(offset + 50, $col_027, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_027(int value) {
		setConstNumber(offset + 50, $col_027, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_027(long value) {
		setConstNumber(offset + 50, $col_027, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_027(float value) {
		setConstNumber(offset + 50, $col_027, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_027(double value) {
		setConstNumber(offset + 50, $col_027, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_028() {
		return getConstNumber(offset + 51, $col_028);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_028(MCNumber value) {
		setConstNumber(offset + 51, $col_028, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_028(int value) {
		setConstNumber(offset + 51, $col_028, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_028(long value) {
		setConstNumber(offset + 51, $col_028, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_028(float value) {
		setConstNumber(offset + 51, $col_028, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_028(double value) {
		setConstNumber(offset + 51, $col_028, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_029() {
		return getConstNumber(offset + 52, $col_029);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_029(MCNumber value) {
		setConstNumber(offset + 52, $col_029, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_029(int value) {
		setConstNumber(offset + 52, $col_029, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_029(long value) {
		setConstNumber(offset + 52, $col_029, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_029(float value) {
		setConstNumber(offset + 52, $col_029, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_029(double value) {
		setConstNumber(offset + 52, $col_029, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_030() {
		return getConstNumber(offset + 53, $col_030);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_030(MCNumber value) {
		setConstNumber(offset + 53, $col_030, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_030(int value) {
		setConstNumber(offset + 53, $col_030, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_030(long value) {
		setConstNumber(offset + 53, $col_030, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_030(float value) {
		setConstNumber(offset + 53, $col_030, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_030(double value) {
		setConstNumber(offset + 53, $col_030, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_031() {
		return getConstNumber(offset + 54, $col_031);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_031(MCNumber value) {
		setConstNumber(offset + 54, $col_031, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_031(int value) {
		setConstNumber(offset + 54, $col_031, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_031(long value) {
		setConstNumber(offset + 54, $col_031, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_031(float value) {
		setConstNumber(offset + 54, $col_031, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_031(double value) {
		setConstNumber(offset + 54, $col_031, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_032() {
		return getConstNumber(offset + 55, $col_032);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_032(MCNumber value) {
		setConstNumber(offset + 55, $col_032, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_032(int value) {
		setConstNumber(offset + 55, $col_032, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_032(long value) {
		setConstNumber(offset + 55, $col_032, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_032(float value) {
		setConstNumber(offset + 55, $col_032, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_032(double value) {
		setConstNumber(offset + 55, $col_032, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_033() {
		return getConstNumber(offset + 56, $col_033);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_033(MCNumber value) {
		setConstNumber(offset + 56, $col_033, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_033(int value) {
		setConstNumber(offset + 56, $col_033, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_033(long value) {
		setConstNumber(offset + 56, $col_033, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_033(float value) {
		setConstNumber(offset + 56, $col_033, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_033(double value) {
		setConstNumber(offset + 56, $col_033, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_034() {
		return getConstNumber(offset + 57, $col_034);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_034(MCNumber value) {
		setConstNumber(offset + 57, $col_034, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_034(int value) {
		setConstNumber(offset + 57, $col_034, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_034(long value) {
		setConstNumber(offset + 57, $col_034, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_034(float value) {
		setConstNumber(offset + 57, $col_034, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_034(double value) {
		setConstNumber(offset + 57, $col_034, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_035() {
		return getConstNumber(offset + 58, $col_035);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_035(MCNumber value) {
		setConstNumber(offset + 58, $col_035, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_035(int value) {
		setConstNumber(offset + 58, $col_035, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_035(long value) {
		setConstNumber(offset + 58, $col_035, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_035(float value) {
		setConstNumber(offset + 58, $col_035, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_035(double value) {
		setConstNumber(offset + 58, $col_035, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_036() {
		return getConstNumber(offset + 59, $col_036);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_036(MCNumber value) {
		setConstNumber(offset + 59, $col_036, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_036(int value) {
		setConstNumber(offset + 59, $col_036, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_036(long value) {
		setConstNumber(offset + 59, $col_036, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_036(float value) {
		setConstNumber(offset + 59, $col_036, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_036(double value) {
		setConstNumber(offset + 59, $col_036, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_037() {
		return getConstNumber(offset + 60, $col_037);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_037(MCNumber value) {
		setConstNumber(offset + 60, $col_037, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_037(int value) {
		setConstNumber(offset + 60, $col_037, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_037(long value) {
		setConstNumber(offset + 60, $col_037, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_037(float value) {
		setConstNumber(offset + 60, $col_037, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_037(double value) {
		setConstNumber(offset + 60, $col_037, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_038() {
		return getConstNumber(offset + 61, $col_038);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_038(MCNumber value) {
		setConstNumber(offset + 61, $col_038, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_038(int value) {
		setConstNumber(offset + 61, $col_038, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_038(long value) {
		setConstNumber(offset + 61, $col_038, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_038(float value) {
		setConstNumber(offset + 61, $col_038, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_038(double value) {
		setConstNumber(offset + 61, $col_038, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_039() {
		return getConstNumber(offset + 62, $col_039);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_039(MCNumber value) {
		setConstNumber(offset + 62, $col_039, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_039(int value) {
		setConstNumber(offset + 62, $col_039, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_039(long value) {
		setConstNumber(offset + 62, $col_039, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_039(float value) {
		setConstNumber(offset + 62, $col_039, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_039(double value) {
		setConstNumber(offset + 62, $col_039, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_040() {
		return getConstNumber(offset + 63, $col_040);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_040(MCNumber value) {
		setConstNumber(offset + 63, $col_040, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_040(int value) {
		setConstNumber(offset + 63, $col_040, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_040(long value) {
		setConstNumber(offset + 63, $col_040, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_040(float value) {
		setConstNumber(offset + 63, $col_040, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_040(double value) {
		setConstNumber(offset + 63, $col_040, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_041() {
		return getConstNumber(offset + 64, $col_041);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_041(MCNumber value) {
		setConstNumber(offset + 64, $col_041, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_041(int value) {
		setConstNumber(offset + 64, $col_041, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_041(long value) {
		setConstNumber(offset + 64, $col_041, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_041(float value) {
		setConstNumber(offset + 64, $col_041, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_041(double value) {
		setConstNumber(offset + 64, $col_041, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_042() {
		return getConstNumber(offset + 65, $col_042);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_042(MCNumber value) {
		setConstNumber(offset + 65, $col_042, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_042(int value) {
		setConstNumber(offset + 65, $col_042, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_042(long value) {
		setConstNumber(offset + 65, $col_042, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_042(float value) {
		setConstNumber(offset + 65, $col_042, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_042(double value) {
		setConstNumber(offset + 65, $col_042, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_043() {
		return getConstNumber(offset + 66, $col_043);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_043(MCNumber value) {
		setConstNumber(offset + 66, $col_043, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_043(int value) {
		setConstNumber(offset + 66, $col_043, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_043(long value) {
		setConstNumber(offset + 66, $col_043, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_043(float value) {
		setConstNumber(offset + 66, $col_043, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_043(double value) {
		setConstNumber(offset + 66, $col_043, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_044() {
		return getConstNumber(offset + 67, $col_044);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_044(MCNumber value) {
		setConstNumber(offset + 67, $col_044, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_044(int value) {
		setConstNumber(offset + 67, $col_044, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_044(long value) {
		setConstNumber(offset + 67, $col_044, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_044(float value) {
		setConstNumber(offset + 67, $col_044, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_044(double value) {
		setConstNumber(offset + 67, $col_044, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_045() {
		return getConstNumber(offset + 68, $col_045);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_045(MCNumber value) {
		setConstNumber(offset + 68, $col_045, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_045(int value) {
		setConstNumber(offset + 68, $col_045, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_045(long value) {
		setConstNumber(offset + 68, $col_045, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_045(float value) {
		setConstNumber(offset + 68, $col_045, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_045(double value) {
		setConstNumber(offset + 68, $col_045, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_046() {
		return getConstNumber(offset + 69, $col_046);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_046(MCNumber value) {
		setConstNumber(offset + 69, $col_046, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_046(int value) {
		setConstNumber(offset + 69, $col_046, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_046(long value) {
		setConstNumber(offset + 69, $col_046, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_046(float value) {
		setConstNumber(offset + 69, $col_046, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_046(double value) {
		setConstNumber(offset + 69, $col_046, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_047() {
		return getConstNumber(offset + 70, $col_047);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_047(MCNumber value) {
		setConstNumber(offset + 70, $col_047, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_047(int value) {
		setConstNumber(offset + 70, $col_047, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_047(long value) {
		setConstNumber(offset + 70, $col_047, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_047(float value) {
		setConstNumber(offset + 70, $col_047, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_047(double value) {
		setConstNumber(offset + 70, $col_047, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_048() {
		return getConstNumber(offset + 71, $col_048);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_048(MCNumber value) {
		setConstNumber(offset + 71, $col_048, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_048(int value) {
		setConstNumber(offset + 71, $col_048, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_048(long value) {
		setConstNumber(offset + 71, $col_048, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_048(float value) {
		setConstNumber(offset + 71, $col_048, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_048(double value) {
		setConstNumber(offset + 71, $col_048, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_049() {
		return getConstNumber(offset + 72, $col_049);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_049(MCNumber value) {
		setConstNumber(offset + 72, $col_049, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_049(int value) {
		setConstNumber(offset + 72, $col_049, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_049(long value) {
		setConstNumber(offset + 72, $col_049, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_049(float value) {
		setConstNumber(offset + 72, $col_049, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_049(double value) {
		setConstNumber(offset + 72, $col_049, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_050() {
		return getConstNumber(offset + 73, $col_050);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_050(MCNumber value) {
		setConstNumber(offset + 73, $col_050, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_050(int value) {
		setConstNumber(offset + 73, $col_050, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_050(long value) {
		setConstNumber(offset + 73, $col_050, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_050(float value) {
		setConstNumber(offset + 73, $col_050, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_050(double value) {
		setConstNumber(offset + 73, $col_050, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_051() {
		return getConstNumber(offset + 74, $col_051);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_051(MCNumber value) {
		setConstNumber(offset + 74, $col_051, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_051(int value) {
		setConstNumber(offset + 74, $col_051, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_051(long value) {
		setConstNumber(offset + 74, $col_051, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_051(float value) {
		setConstNumber(offset + 74, $col_051, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_051(double value) {
		setConstNumber(offset + 74, $col_051, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_052() {
		return getConstNumber(offset + 75, $col_052);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_052(MCNumber value) {
		setConstNumber(offset + 75, $col_052, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_052(int value) {
		setConstNumber(offset + 75, $col_052, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_052(long value) {
		setConstNumber(offset + 75, $col_052, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_052(float value) {
		setConstNumber(offset + 75, $col_052, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_052(double value) {
		setConstNumber(offset + 75, $col_052, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_053() {
		return getConstNumber(offset + 76, $col_053);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_053(MCNumber value) {
		setConstNumber(offset + 76, $col_053, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_053(int value) {
		setConstNumber(offset + 76, $col_053, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_053(long value) {
		setConstNumber(offset + 76, $col_053, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_053(float value) {
		setConstNumber(offset + 76, $col_053, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_053(double value) {
		setConstNumber(offset + 76, $col_053, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_054() {
		return getConstNumber(offset + 77, $col_054);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_054(MCNumber value) {
		setConstNumber(offset + 77, $col_054, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_054(int value) {
		setConstNumber(offset + 77, $col_054, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_054(long value) {
		setConstNumber(offset + 77, $col_054, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_054(float value) {
		setConstNumber(offset + 77, $col_054, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_054(double value) {
		setConstNumber(offset + 77, $col_054, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_055() {
		return getConstNumber(offset + 78, $col_055);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_055(MCNumber value) {
		setConstNumber(offset + 78, $col_055, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_055(int value) {
		setConstNumber(offset + 78, $col_055, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_055(long value) {
		setConstNumber(offset + 78, $col_055, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_055(float value) {
		setConstNumber(offset + 78, $col_055, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_055(double value) {
		setConstNumber(offset + 78, $col_055, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_056() {
		return getConstNumber(offset + 79, $col_056);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_056(MCNumber value) {
		setConstNumber(offset + 79, $col_056, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_056(int value) {
		setConstNumber(offset + 79, $col_056, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_056(long value) {
		setConstNumber(offset + 79, $col_056, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_056(float value) {
		setConstNumber(offset + 79, $col_056, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_056(double value) {
		setConstNumber(offset + 79, $col_056, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_057() {
		return getConstNumber(offset + 80, $col_057);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_057(MCNumber value) {
		setConstNumber(offset + 80, $col_057, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_057(int value) {
		setConstNumber(offset + 80, $col_057, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_057(long value) {
		setConstNumber(offset + 80, $col_057, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_057(float value) {
		setConstNumber(offset + 80, $col_057, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_057(double value) {
		setConstNumber(offset + 80, $col_057, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_058() {
		return getConstNumber(offset + 81, $col_058);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_058(MCNumber value) {
		setConstNumber(offset + 81, $col_058, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_058(int value) {
		setConstNumber(offset + 81, $col_058, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_058(long value) {
		setConstNumber(offset + 81, $col_058, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_058(float value) {
		setConstNumber(offset + 81, $col_058, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_058(double value) {
		setConstNumber(offset + 81, $col_058, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_059() {
		return getConstNumber(offset + 82, $col_059);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_059(MCNumber value) {
		setConstNumber(offset + 82, $col_059, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_059(int value) {
		setConstNumber(offset + 82, $col_059, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_059(long value) {
		setConstNumber(offset + 82, $col_059, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_059(float value) {
		setConstNumber(offset + 82, $col_059, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_059(double value) {
		setConstNumber(offset + 82, $col_059, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_060() {
		return getConstNumber(offset + 83, $col_060);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_060(MCNumber value) {
		setConstNumber(offset + 83, $col_060, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_060(int value) {
		setConstNumber(offset + 83, $col_060, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_060(long value) {
		setConstNumber(offset + 83, $col_060, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_060(float value) {
		setConstNumber(offset + 83, $col_060, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_060(double value) {
		setConstNumber(offset + 83, $col_060, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_061() {
		return getConstNumber(offset + 84, $col_061);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_061(MCNumber value) {
		setConstNumber(offset + 84, $col_061, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_061(int value) {
		setConstNumber(offset + 84, $col_061, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_061(long value) {
		setConstNumber(offset + 84, $col_061, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_061(float value) {
		setConstNumber(offset + 84, $col_061, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_061(double value) {
		setConstNumber(offset + 84, $col_061, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_062() {
		return getConstNumber(offset + 85, $col_062);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_062(MCNumber value) {
		setConstNumber(offset + 85, $col_062, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_062(int value) {
		setConstNumber(offset + 85, $col_062, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_062(long value) {
		setConstNumber(offset + 85, $col_062, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_062(float value) {
		setConstNumber(offset + 85, $col_062, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_062(double value) {
		setConstNumber(offset + 85, $col_062, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_063() {
		return getConstNumber(offset + 86, $col_063);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_063(MCNumber value) {
		setConstNumber(offset + 86, $col_063, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_063(int value) {
		setConstNumber(offset + 86, $col_063, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_063(long value) {
		setConstNumber(offset + 86, $col_063, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_063(float value) {
		setConstNumber(offset + 86, $col_063, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_063(double value) {
		setConstNumber(offset + 86, $col_063, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_064() {
		return getConstNumber(offset + 87, $col_064);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_064(MCNumber value) {
		setConstNumber(offset + 87, $col_064, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_064(int value) {
		setConstNumber(offset + 87, $col_064, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_064(long value) {
		setConstNumber(offset + 87, $col_064, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_064(float value) {
		setConstNumber(offset + 87, $col_064, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_064(double value) {
		setConstNumber(offset + 87, $col_064, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_065() {
		return getConstNumber(offset + 88, $col_065);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_065(MCNumber value) {
		setConstNumber(offset + 88, $col_065, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_065(int value) {
		setConstNumber(offset + 88, $col_065, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_065(long value) {
		setConstNumber(offset + 88, $col_065, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_065(float value) {
		setConstNumber(offset + 88, $col_065, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_065(double value) {
		setConstNumber(offset + 88, $col_065, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_066() {
		return getConstNumber(offset + 89, $col_066);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_066(MCNumber value) {
		setConstNumber(offset + 89, $col_066, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_066(int value) {
		setConstNumber(offset + 89, $col_066, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_066(long value) {
		setConstNumber(offset + 89, $col_066, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_066(float value) {
		setConstNumber(offset + 89, $col_066, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_066(double value) {
		setConstNumber(offset + 89, $col_066, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_067() {
		return getConstNumber(offset + 90, $col_067);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_067(MCNumber value) {
		setConstNumber(offset + 90, $col_067, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_067(int value) {
		setConstNumber(offset + 90, $col_067, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_067(long value) {
		setConstNumber(offset + 90, $col_067, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_067(float value) {
		setConstNumber(offset + 90, $col_067, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_067(double value) {
		setConstNumber(offset + 90, $col_067, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_068() {
		return getConstNumber(offset + 91, $col_068);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_068(MCNumber value) {
		setConstNumber(offset + 91, $col_068, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_068(int value) {
		setConstNumber(offset + 91, $col_068, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_068(long value) {
		setConstNumber(offset + 91, $col_068, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_068(float value) {
		setConstNumber(offset + 91, $col_068, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_068(double value) {
		setConstNumber(offset + 91, $col_068, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_069() {
		return getConstNumber(offset + 92, $col_069);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_069(MCNumber value) {
		setConstNumber(offset + 92, $col_069, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_069(int value) {
		setConstNumber(offset + 92, $col_069, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_069(long value) {
		setConstNumber(offset + 92, $col_069, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_069(float value) {
		setConstNumber(offset + 92, $col_069, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_069(double value) {
		setConstNumber(offset + 92, $col_069, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_070() {
		return getConstNumber(offset + 93, $col_070);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_070(MCNumber value) {
		setConstNumber(offset + 93, $col_070, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_070(int value) {
		setConstNumber(offset + 93, $col_070, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_070(long value) {
		setConstNumber(offset + 93, $col_070, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_070(float value) {
		setConstNumber(offset + 93, $col_070, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_070(double value) {
		setConstNumber(offset + 93, $col_070, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_071() {
		return getConstNumber(offset + 94, $col_071);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_071(MCNumber value) {
		setConstNumber(offset + 94, $col_071, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_071(int value) {
		setConstNumber(offset + 94, $col_071, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_071(long value) {
		setConstNumber(offset + 94, $col_071, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_071(float value) {
		setConstNumber(offset + 94, $col_071, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_071(double value) {
		setConstNumber(offset + 94, $col_071, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_072() {
		return getConstNumber(offset + 95, $col_072);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_072(MCNumber value) {
		setConstNumber(offset + 95, $col_072, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_072(int value) {
		setConstNumber(offset + 95, $col_072, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_072(long value) {
		setConstNumber(offset + 95, $col_072, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_072(float value) {
		setConstNumber(offset + 95, $col_072, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_072(double value) {
		setConstNumber(offset + 95, $col_072, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_073() {
		return getConstNumber(offset + 96, $col_073);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_073(MCNumber value) {
		setConstNumber(offset + 96, $col_073, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_073(int value) {
		setConstNumber(offset + 96, $col_073, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_073(long value) {
		setConstNumber(offset + 96, $col_073, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_073(float value) {
		setConstNumber(offset + 96, $col_073, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_073(double value) {
		setConstNumber(offset + 96, $col_073, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_074() {
		return getConstNumber(offset + 97, $col_074);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_074(MCNumber value) {
		setConstNumber(offset + 97, $col_074, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_074(int value) {
		setConstNumber(offset + 97, $col_074, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_074(long value) {
		setConstNumber(offset + 97, $col_074, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_074(float value) {
		setConstNumber(offset + 97, $col_074, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_074(double value) {
		setConstNumber(offset + 97, $col_074, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_075() {
		return getConstNumber(offset + 98, $col_075);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_075(MCNumber value) {
		setConstNumber(offset + 98, $col_075, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_075(int value) {
		setConstNumber(offset + 98, $col_075, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_075(long value) {
		setConstNumber(offset + 98, $col_075, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_075(float value) {
		setConstNumber(offset + 98, $col_075, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_075(double value) {
		setConstNumber(offset + 98, $col_075, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_076() {
		return getConstNumber(offset + 99, $col_076);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_076(MCNumber value) {
		setConstNumber(offset + 99, $col_076, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_076(int value) {
		setConstNumber(offset + 99, $col_076, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_076(long value) {
		setConstNumber(offset + 99, $col_076, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_076(float value) {
		setConstNumber(offset + 99, $col_076, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_076(double value) {
		setConstNumber(offset + 99, $col_076, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_077() {
		return getConstNumber(offset + 100, $col_077);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_077(MCNumber value) {
		setConstNumber(offset + 100, $col_077, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_077(int value) {
		setConstNumber(offset + 100, $col_077, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_077(long value) {
		setConstNumber(offset + 100, $col_077, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_077(float value) {
		setConstNumber(offset + 100, $col_077, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_077(double value) {
		setConstNumber(offset + 100, $col_077, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_078() {
		return getConstNumber(offset + 101, $col_078);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_078(MCNumber value) {
		setConstNumber(offset + 101, $col_078, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_078(int value) {
		setConstNumber(offset + 101, $col_078, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_078(long value) {
		setConstNumber(offset + 101, $col_078, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_078(float value) {
		setConstNumber(offset + 101, $col_078, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_078(double value) {
		setConstNumber(offset + 101, $col_078, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_079() {
		return getConstNumber(offset + 102, $col_079);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_079(MCNumber value) {
		setConstNumber(offset + 102, $col_079, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_079(int value) {
		setConstNumber(offset + 102, $col_079, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_079(long value) {
		setConstNumber(offset + 102, $col_079, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_079(float value) {
		setConstNumber(offset + 102, $col_079, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_079(double value) {
		setConstNumber(offset + 102, $col_079, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_080() {
		return getConstNumber(offset + 103, $col_080);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_080(MCNumber value) {
		setConstNumber(offset + 103, $col_080, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_080(int value) {
		setConstNumber(offset + 103, $col_080, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_080(long value) {
		setConstNumber(offset + 103, $col_080, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_080(float value) {
		setConstNumber(offset + 103, $col_080, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_080(double value) {
		setConstNumber(offset + 103, $col_080, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_081() {
		return getConstNumber(offset + 104, $col_081);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_081(MCNumber value) {
		setConstNumber(offset + 104, $col_081, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_081(int value) {
		setConstNumber(offset + 104, $col_081, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_081(long value) {
		setConstNumber(offset + 104, $col_081, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_081(float value) {
		setConstNumber(offset + 104, $col_081, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_081(double value) {
		setConstNumber(offset + 104, $col_081, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_082() {
		return getConstNumber(offset + 105, $col_082);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_082(MCNumber value) {
		setConstNumber(offset + 105, $col_082, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_082(int value) {
		setConstNumber(offset + 105, $col_082, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_082(long value) {
		setConstNumber(offset + 105, $col_082, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_082(float value) {
		setConstNumber(offset + 105, $col_082, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_082(double value) {
		setConstNumber(offset + 105, $col_082, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_083() {
		return getConstNumber(offset + 106, $col_083);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_083(MCNumber value) {
		setConstNumber(offset + 106, $col_083, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_083(int value) {
		setConstNumber(offset + 106, $col_083, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_083(long value) {
		setConstNumber(offset + 106, $col_083, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_083(float value) {
		setConstNumber(offset + 106, $col_083, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_083(double value) {
		setConstNumber(offset + 106, $col_083, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_084() {
		return getConstNumber(offset + 107, $col_084);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_084(MCNumber value) {
		setConstNumber(offset + 107, $col_084, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_084(int value) {
		setConstNumber(offset + 107, $col_084, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_084(long value) {
		setConstNumber(offset + 107, $col_084, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_084(float value) {
		setConstNumber(offset + 107, $col_084, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_084(double value) {
		setConstNumber(offset + 107, $col_084, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_085() {
		return getConstNumber(offset + 108, $col_085);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_085(MCNumber value) {
		setConstNumber(offset + 108, $col_085, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_085(int value) {
		setConstNumber(offset + 108, $col_085, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_085(long value) {
		setConstNumber(offset + 108, $col_085, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_085(float value) {
		setConstNumber(offset + 108, $col_085, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_085(double value) {
		setConstNumber(offset + 108, $col_085, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_086() {
		return getConstNumber(offset + 109, $col_086);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_086(MCNumber value) {
		setConstNumber(offset + 109, $col_086, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_086(int value) {
		setConstNumber(offset + 109, $col_086, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_086(long value) {
		setConstNumber(offset + 109, $col_086, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_086(float value) {
		setConstNumber(offset + 109, $col_086, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_086(double value) {
		setConstNumber(offset + 109, $col_086, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_087() {
		return getConstNumber(offset + 110, $col_087);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_087(MCNumber value) {
		setConstNumber(offset + 110, $col_087, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_087(int value) {
		setConstNumber(offset + 110, $col_087, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_087(long value) {
		setConstNumber(offset + 110, $col_087, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_087(float value) {
		setConstNumber(offset + 110, $col_087, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_087(double value) {
		setConstNumber(offset + 110, $col_087, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_088() {
		return getConstNumber(offset + 111, $col_088);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_088(MCNumber value) {
		setConstNumber(offset + 111, $col_088, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_088(int value) {
		setConstNumber(offset + 111, $col_088, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_088(long value) {
		setConstNumber(offset + 111, $col_088, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_088(float value) {
		setConstNumber(offset + 111, $col_088, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_088(double value) {
		setConstNumber(offset + 111, $col_088, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_089() {
		return getConstNumber(offset + 112, $col_089);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_089(MCNumber value) {
		setConstNumber(offset + 112, $col_089, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_089(int value) {
		setConstNumber(offset + 112, $col_089, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_089(long value) {
		setConstNumber(offset + 112, $col_089, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_089(float value) {
		setConstNumber(offset + 112, $col_089, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_089(double value) {
		setConstNumber(offset + 112, $col_089, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_090() {
		return getConstNumber(offset + 113, $col_090);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_090(MCNumber value) {
		setConstNumber(offset + 113, $col_090, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_090(int value) {
		setConstNumber(offset + 113, $col_090, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_090(long value) {
		setConstNumber(offset + 113, $col_090, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_090(float value) {
		setConstNumber(offset + 113, $col_090, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_090(double value) {
		setConstNumber(offset + 113, $col_090, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_091() {
		return getConstNumber(offset + 114, $col_091);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_091(MCNumber value) {
		setConstNumber(offset + 114, $col_091, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_091(int value) {
		setConstNumber(offset + 114, $col_091, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_091(long value) {
		setConstNumber(offset + 114, $col_091, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_091(float value) {
		setConstNumber(offset + 114, $col_091, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_091(double value) {
		setConstNumber(offset + 114, $col_091, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_092() {
		return getConstNumber(offset + 115, $col_092);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_092(MCNumber value) {
		setConstNumber(offset + 115, $col_092, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_092(int value) {
		setConstNumber(offset + 115, $col_092, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_092(long value) {
		setConstNumber(offset + 115, $col_092, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_092(float value) {
		setConstNumber(offset + 115, $col_092, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_092(double value) {
		setConstNumber(offset + 115, $col_092, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_093() {
		return getConstNumber(offset + 116, $col_093);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_093(MCNumber value) {
		setConstNumber(offset + 116, $col_093, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_093(int value) {
		setConstNumber(offset + 116, $col_093, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_093(long value) {
		setConstNumber(offset + 116, $col_093, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_093(float value) {
		setConstNumber(offset + 116, $col_093, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_093(double value) {
		setConstNumber(offset + 116, $col_093, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_094() {
		return getConstNumber(offset + 117, $col_094);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_094(MCNumber value) {
		setConstNumber(offset + 117, $col_094, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_094(int value) {
		setConstNumber(offset + 117, $col_094, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_094(long value) {
		setConstNumber(offset + 117, $col_094, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_094(float value) {
		setConstNumber(offset + 117, $col_094, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_094(double value) {
		setConstNumber(offset + 117, $col_094, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_095() {
		return getConstNumber(offset + 118, $col_095);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_095(MCNumber value) {
		setConstNumber(offset + 118, $col_095, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_095(int value) {
		setConstNumber(offset + 118, $col_095, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_095(long value) {
		setConstNumber(offset + 118, $col_095, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_095(float value) {
		setConstNumber(offset + 118, $col_095, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_095(double value) {
		setConstNumber(offset + 118, $col_095, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_096() {
		return getConstNumber(offset + 119, $col_096);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_096(MCNumber value) {
		setConstNumber(offset + 119, $col_096, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_096(int value) {
		setConstNumber(offset + 119, $col_096, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_096(long value) {
		setConstNumber(offset + 119, $col_096, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_096(float value) {
		setConstNumber(offset + 119, $col_096, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_096(double value) {
		setConstNumber(offset + 119, $col_096, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_097() {
		return getConstNumber(offset + 120, $col_097);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_097(MCNumber value) {
		setConstNumber(offset + 120, $col_097, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_097(int value) {
		setConstNumber(offset + 120, $col_097, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_097(long value) {
		setConstNumber(offset + 120, $col_097, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_097(float value) {
		setConstNumber(offset + 120, $col_097, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_097(double value) {
		setConstNumber(offset + 120, $col_097, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_098() {
		return getConstNumber(offset + 121, $col_098);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_098(MCNumber value) {
		setConstNumber(offset + 121, $col_098, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_098(int value) {
		setConstNumber(offset + 121, $col_098, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_098(long value) {
		setConstNumber(offset + 121, $col_098, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_098(float value) {
		setConstNumber(offset + 121, $col_098, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_098(double value) {
		setConstNumber(offset + 121, $col_098, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_099() {
		return getConstNumber(offset + 122, $col_099);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_099(MCNumber value) {
		setConstNumber(offset + 122, $col_099, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_099(int value) {
		setConstNumber(offset + 122, $col_099, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_099(long value) {
		setConstNumber(offset + 122, $col_099, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_099(float value) {
		setConstNumber(offset + 122, $col_099, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_099(double value) {
		setConstNumber(offset + 122, $col_099, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_100() {
		return getConstNumber(offset + 123, $col_100);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_100(MCNumber value) {
		setConstNumber(offset + 123, $col_100, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_100(int value) {
		setConstNumber(offset + 123, $col_100, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_100(long value) {
		setConstNumber(offset + 123, $col_100, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_100(float value) {
		setConstNumber(offset + 123, $col_100, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_100(double value) {
		setConstNumber(offset + 123, $col_100, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_101() {
		return getConstNumber(offset + 124, $col_101);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_101(MCNumber value) {
		setConstNumber(offset + 124, $col_101, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_101(int value) {
		setConstNumber(offset + 124, $col_101, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_101(long value) {
		setConstNumber(offset + 124, $col_101, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_101(float value) {
		setConstNumber(offset + 124, $col_101, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_101(double value) {
		setConstNumber(offset + 124, $col_101, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_102() {
		return getConstNumber(offset + 125, $col_102);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_102(MCNumber value) {
		setConstNumber(offset + 125, $col_102, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_102(int value) {
		setConstNumber(offset + 125, $col_102, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_102(long value) {
		setConstNumber(offset + 125, $col_102, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_102(float value) {
		setConstNumber(offset + 125, $col_102, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_102(double value) {
		setConstNumber(offset + 125, $col_102, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_103() {
		return getConstNumber(offset + 126, $col_103);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_103(MCNumber value) {
		setConstNumber(offset + 126, $col_103, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_103(int value) {
		setConstNumber(offset + 126, $col_103, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_103(long value) {
		setConstNumber(offset + 126, $col_103, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_103(float value) {
		setConstNumber(offset + 126, $col_103, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_103(double value) {
		setConstNumber(offset + 126, $col_103, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_104() {
		return getConstNumber(offset + 127, $col_104);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_104(MCNumber value) {
		setConstNumber(offset + 127, $col_104, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_104(int value) {
		setConstNumber(offset + 127, $col_104, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_104(long value) {
		setConstNumber(offset + 127, $col_104, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_104(float value) {
		setConstNumber(offset + 127, $col_104, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_104(double value) {
		setConstNumber(offset + 127, $col_104, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_105() {
		return getConstNumber(offset + 128, $col_105);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_105(MCNumber value) {
		setConstNumber(offset + 128, $col_105, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_105(int value) {
		setConstNumber(offset + 128, $col_105, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_105(long value) {
		setConstNumber(offset + 128, $col_105, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_105(float value) {
		setConstNumber(offset + 128, $col_105, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_105(double value) {
		setConstNumber(offset + 128, $col_105, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_106() {
		return getConstNumber(offset + 129, $col_106);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_106(MCNumber value) {
		setConstNumber(offset + 129, $col_106, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_106(int value) {
		setConstNumber(offset + 129, $col_106, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_106(long value) {
		setConstNumber(offset + 129, $col_106, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_106(float value) {
		setConstNumber(offset + 129, $col_106, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_106(double value) {
		setConstNumber(offset + 129, $col_106, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_107() {
		return getConstNumber(offset + 130, $col_107);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_107(MCNumber value) {
		setConstNumber(offset + 130, $col_107, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_107(int value) {
		setConstNumber(offset + 130, $col_107, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_107(long value) {
		setConstNumber(offset + 130, $col_107, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_107(float value) {
		setConstNumber(offset + 130, $col_107, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_107(double value) {
		setConstNumber(offset + 130, $col_107, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_108() {
		return getConstNumber(offset + 131, $col_108);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_108(MCNumber value) {
		setConstNumber(offset + 131, $col_108, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_108(int value) {
		setConstNumber(offset + 131, $col_108, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_108(long value) {
		setConstNumber(offset + 131, $col_108, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_108(float value) {
		setConstNumber(offset + 131, $col_108, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_108(double value) {
		setConstNumber(offset + 131, $col_108, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_109() {
		return getConstNumber(offset + 132, $col_109);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_109(MCNumber value) {
		setConstNumber(offset + 132, $col_109, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_109(int value) {
		setConstNumber(offset + 132, $col_109, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_109(long value) {
		setConstNumber(offset + 132, $col_109, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_109(float value) {
		setConstNumber(offset + 132, $col_109, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_109(double value) {
		setConstNumber(offset + 132, $col_109, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_110() {
		return getConstNumber(offset + 133, $col_110);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_110(MCNumber value) {
		setConstNumber(offset + 133, $col_110, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_110(int value) {
		setConstNumber(offset + 133, $col_110, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_110(long value) {
		setConstNumber(offset + 133, $col_110, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_110(float value) {
		setConstNumber(offset + 133, $col_110, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_110(double value) {
		setConstNumber(offset + 133, $col_110, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_111() {
		return getConstNumber(offset + 134, $col_111);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_111(MCNumber value) {
		setConstNumber(offset + 134, $col_111, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_111(int value) {
		setConstNumber(offset + 134, $col_111, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_111(long value) {
		setConstNumber(offset + 134, $col_111, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_111(float value) {
		setConstNumber(offset + 134, $col_111, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_111(double value) {
		setConstNumber(offset + 134, $col_111, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_112() {
		return getConstNumber(offset + 135, $col_112);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_112(MCNumber value) {
		setConstNumber(offset + 135, $col_112, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_112(int value) {
		setConstNumber(offset + 135, $col_112, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_112(long value) {
		setConstNumber(offset + 135, $col_112, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_112(float value) {
		setConstNumber(offset + 135, $col_112, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_112(double value) {
		setConstNumber(offset + 135, $col_112, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_113() {
		return getConstNumber(offset + 136, $col_113);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_113(MCNumber value) {
		setConstNumber(offset + 136, $col_113, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_113(int value) {
		setConstNumber(offset + 136, $col_113, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_113(long value) {
		setConstNumber(offset + 136, $col_113, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_113(float value) {
		setConstNumber(offset + 136, $col_113, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_113(double value) {
		setConstNumber(offset + 136, $col_113, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_114() {
		return getConstNumber(offset + 137, $col_114);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_114(MCNumber value) {
		setConstNumber(offset + 137, $col_114, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_114(int value) {
		setConstNumber(offset + 137, $col_114, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_114(long value) {
		setConstNumber(offset + 137, $col_114, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_114(float value) {
		setConstNumber(offset + 137, $col_114, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_114(double value) {
		setConstNumber(offset + 137, $col_114, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_115() {
		return getConstNumber(offset + 138, $col_115);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_115(MCNumber value) {
		setConstNumber(offset + 138, $col_115, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_115(int value) {
		setConstNumber(offset + 138, $col_115, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_115(long value) {
		setConstNumber(offset + 138, $col_115, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_115(float value) {
		setConstNumber(offset + 138, $col_115, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_115(double value) {
		setConstNumber(offset + 138, $col_115, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_116() {
		return getConstNumber(offset + 139, $col_116);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_116(MCNumber value) {
		setConstNumber(offset + 139, $col_116, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_116(int value) {
		setConstNumber(offset + 139, $col_116, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_116(long value) {
		setConstNumber(offset + 139, $col_116, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_116(float value) {
		setConstNumber(offset + 139, $col_116, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_116(double value) {
		setConstNumber(offset + 139, $col_116, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_117() {
		return getConstNumber(offset + 140, $col_117);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_117(MCNumber value) {
		setConstNumber(offset + 140, $col_117, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_117(int value) {
		setConstNumber(offset + 140, $col_117, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_117(long value) {
		setConstNumber(offset + 140, $col_117, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_117(float value) {
		setConstNumber(offset + 140, $col_117, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_117(double value) {
		setConstNumber(offset + 140, $col_117, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_118() {
		return getConstNumber(offset + 141, $col_118);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_118(MCNumber value) {
		setConstNumber(offset + 141, $col_118, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_118(int value) {
		setConstNumber(offset + 141, $col_118, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_118(long value) {
		setConstNumber(offset + 141, $col_118, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_118(float value) {
		setConstNumber(offset + 141, $col_118, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_118(double value) {
		setConstNumber(offset + 141, $col_118, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_119() {
		return getConstNumber(offset + 142, $col_119);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_119(MCNumber value) {
		setConstNumber(offset + 142, $col_119, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_119(int value) {
		setConstNumber(offset + 142, $col_119, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_119(long value) {
		setConstNumber(offset + 142, $col_119, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_119(float value) {
		setConstNumber(offset + 142, $col_119, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_119(double value) {
		setConstNumber(offset + 142, $col_119, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_120() {
		return getConstNumber(offset + 143, $col_120);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_120(MCNumber value) {
		setConstNumber(offset + 143, $col_120, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_120(int value) {
		setConstNumber(offset + 143, $col_120, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_120(long value) {
		setConstNumber(offset + 143, $col_120, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_120(float value) {
		setConstNumber(offset + 143, $col_120, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_120(double value) {
		setConstNumber(offset + 143, $col_120, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_121() {
		return getConstNumber(offset + 144, $col_121);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_121(MCNumber value) {
		setConstNumber(offset + 144, $col_121, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_121(int value) {
		setConstNumber(offset + 144, $col_121, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_121(long value) {
		setConstNumber(offset + 144, $col_121, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_121(float value) {
		setConstNumber(offset + 144, $col_121, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_121(double value) {
		setConstNumber(offset + 144, $col_121, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_122() {
		return getConstNumber(offset + 145, $col_122);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_122(MCNumber value) {
		setConstNumber(offset + 145, $col_122, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_122(int value) {
		setConstNumber(offset + 145, $col_122, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_122(long value) {
		setConstNumber(offset + 145, $col_122, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_122(float value) {
		setConstNumber(offset + 145, $col_122, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_122(double value) {
		setConstNumber(offset + 145, $col_122, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_123() {
		return getConstNumber(offset + 146, $col_123);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_123(MCNumber value) {
		setConstNumber(offset + 146, $col_123, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_123(int value) {
		setConstNumber(offset + 146, $col_123, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_123(long value) {
		setConstNumber(offset + 146, $col_123, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_123(float value) {
		setConstNumber(offset + 146, $col_123, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_123(double value) {
		setConstNumber(offset + 146, $col_123, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_124() {
		return getConstNumber(offset + 147, $col_124);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_124(MCNumber value) {
		setConstNumber(offset + 147, $col_124, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_124(int value) {
		setConstNumber(offset + 147, $col_124, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_124(long value) {
		setConstNumber(offset + 147, $col_124, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_124(float value) {
		setConstNumber(offset + 147, $col_124, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_124(double value) {
		setConstNumber(offset + 147, $col_124, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_125() {
		return getConstNumber(offset + 148, $col_125);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_125(MCNumber value) {
		setConstNumber(offset + 148, $col_125, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_125(int value) {
		setConstNumber(offset + 148, $col_125, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_125(long value) {
		setConstNumber(offset + 148, $col_125, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_125(float value) {
		setConstNumber(offset + 148, $col_125, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_125(double value) {
		setConstNumber(offset + 148, $col_125, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_126() {
		return getConstNumber(offset + 149, $col_126);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_126(MCNumber value) {
		setConstNumber(offset + 149, $col_126, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_126(int value) {
		setConstNumber(offset + 149, $col_126, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_126(long value) {
		setConstNumber(offset + 149, $col_126, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_126(float value) {
		setConstNumber(offset + 149, $col_126, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_126(double value) {
		setConstNumber(offset + 149, $col_126, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_127() {
		return getConstNumber(offset + 150, $col_127);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_127(MCNumber value) {
		setConstNumber(offset + 150, $col_127, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_127(int value) {
		setConstNumber(offset + 150, $col_127, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_127(long value) {
		setConstNumber(offset + 150, $col_127, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_127(float value) {
		setConstNumber(offset + 150, $col_127, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_127(double value) {
		setConstNumber(offset + 150, $col_127, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_128() {
		return getConstNumber(offset + 151, $col_128);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_128(MCNumber value) {
		setConstNumber(offset + 151, $col_128, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_128(int value) {
		setConstNumber(offset + 151, $col_128, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_128(long value) {
		setConstNumber(offset + 151, $col_128, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_128(float value) {
		setConstNumber(offset + 151, $col_128, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_128(double value) {
		setConstNumber(offset + 151, $col_128, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_129() {
		return getConstNumber(offset + 152, $col_129);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_129(MCNumber value) {
		setConstNumber(offset + 152, $col_129, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_129(int value) {
		setConstNumber(offset + 152, $col_129, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_129(long value) {
		setConstNumber(offset + 152, $col_129, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_129(float value) {
		setConstNumber(offset + 152, $col_129, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_129(double value) {
		setConstNumber(offset + 152, $col_129, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_130() {
		return getConstNumber(offset + 153, $col_130);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_130(MCNumber value) {
		setConstNumber(offset + 153, $col_130, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_130(int value) {
		setConstNumber(offset + 153, $col_130, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_130(long value) {
		setConstNumber(offset + 153, $col_130, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_130(float value) {
		setConstNumber(offset + 153, $col_130, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_130(double value) {
		setConstNumber(offset + 153, $col_130, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_131() {
		return getConstNumber(offset + 154, $col_131);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_131(MCNumber value) {
		setConstNumber(offset + 154, $col_131, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_131(int value) {
		setConstNumber(offset + 154, $col_131, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_131(long value) {
		setConstNumber(offset + 154, $col_131, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_131(float value) {
		setConstNumber(offset + 154, $col_131, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_131(double value) {
		setConstNumber(offset + 154, $col_131, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_132() {
		return getConstNumber(offset + 155, $col_132);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_132(MCNumber value) {
		setConstNumber(offset + 155, $col_132, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_132(int value) {
		setConstNumber(offset + 155, $col_132, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_132(long value) {
		setConstNumber(offset + 155, $col_132, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_132(float value) {
		setConstNumber(offset + 155, $col_132, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_132(double value) {
		setConstNumber(offset + 155, $col_132, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_133() {
		return getConstNumber(offset + 156, $col_133);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_133(MCNumber value) {
		setConstNumber(offset + 156, $col_133, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_133(int value) {
		setConstNumber(offset + 156, $col_133, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_133(long value) {
		setConstNumber(offset + 156, $col_133, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_133(float value) {
		setConstNumber(offset + 156, $col_133, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_133(double value) {
		setConstNumber(offset + 156, $col_133, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_134() {
		return getConstNumber(offset + 157, $col_134);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_134(MCNumber value) {
		setConstNumber(offset + 157, $col_134, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_134(int value) {
		setConstNumber(offset + 157, $col_134, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_134(long value) {
		setConstNumber(offset + 157, $col_134, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_134(float value) {
		setConstNumber(offset + 157, $col_134, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_134(double value) {
		setConstNumber(offset + 157, $col_134, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_135() {
		return getConstNumber(offset + 158, $col_135);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_135(MCNumber value) {
		setConstNumber(offset + 158, $col_135, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_135(int value) {
		setConstNumber(offset + 158, $col_135, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_135(long value) {
		setConstNumber(offset + 158, $col_135, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_135(float value) {
		setConstNumber(offset + 158, $col_135, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_135(double value) {
		setConstNumber(offset + 158, $col_135, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_136() {
		return getConstNumber(offset + 159, $col_136);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_136(MCNumber value) {
		setConstNumber(offset + 159, $col_136, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_136(int value) {
		setConstNumber(offset + 159, $col_136, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_136(long value) {
		setConstNumber(offset + 159, $col_136, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_136(float value) {
		setConstNumber(offset + 159, $col_136, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_136(double value) {
		setConstNumber(offset + 159, $col_136, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_137() {
		return getConstNumber(offset + 160, $col_137);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_137(MCNumber value) {
		setConstNumber(offset + 160, $col_137, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_137(int value) {
		setConstNumber(offset + 160, $col_137, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_137(long value) {
		setConstNumber(offset + 160, $col_137, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_137(float value) {
		setConstNumber(offset + 160, $col_137, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_137(double value) {
		setConstNumber(offset + 160, $col_137, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_138() {
		return getConstNumber(offset + 161, $col_138);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_138(MCNumber value) {
		setConstNumber(offset + 161, $col_138, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_138(int value) {
		setConstNumber(offset + 161, $col_138, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_138(long value) {
		setConstNumber(offset + 161, $col_138, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_138(float value) {
		setConstNumber(offset + 161, $col_138, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_138(double value) {
		setConstNumber(offset + 161, $col_138, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_139() {
		return getConstNumber(offset + 162, $col_139);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_139(MCNumber value) {
		setConstNumber(offset + 162, $col_139, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_139(int value) {
		setConstNumber(offset + 162, $col_139, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_139(long value) {
		setConstNumber(offset + 162, $col_139, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_139(float value) {
		setConstNumber(offset + 162, $col_139, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_139(double value) {
		setConstNumber(offset + 162, $col_139, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_140() {
		return getConstNumber(offset + 163, $col_140);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_140(MCNumber value) {
		setConstNumber(offset + 163, $col_140, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_140(int value) {
		setConstNumber(offset + 163, $col_140, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_140(long value) {
		setConstNumber(offset + 163, $col_140, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_140(float value) {
		setConstNumber(offset + 163, $col_140, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_140(double value) {
		setConstNumber(offset + 163, $col_140, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_141() {
		return getConstNumber(offset + 164, $col_141);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_141(MCNumber value) {
		setConstNumber(offset + 164, $col_141, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_141(int value) {
		setConstNumber(offset + 164, $col_141, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_141(long value) {
		setConstNumber(offset + 164, $col_141, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_141(float value) {
		setConstNumber(offset + 164, $col_141, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_141(double value) {
		setConstNumber(offset + 164, $col_141, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_142() {
		return getConstNumber(offset + 165, $col_142);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_142(MCNumber value) {
		setConstNumber(offset + 165, $col_142, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_142(int value) {
		setConstNumber(offset + 165, $col_142, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_142(long value) {
		setConstNumber(offset + 165, $col_142, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_142(float value) {
		setConstNumber(offset + 165, $col_142, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_142(double value) {
		setConstNumber(offset + 165, $col_142, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_143() {
		return getConstNumber(offset + 166, $col_143);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_143(MCNumber value) {
		setConstNumber(offset + 166, $col_143, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_143(int value) {
		setConstNumber(offset + 166, $col_143, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_143(long value) {
		setConstNumber(offset + 166, $col_143, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_143(float value) {
		setConstNumber(offset + 166, $col_143, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_143(double value) {
		setConstNumber(offset + 166, $col_143, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_144() {
		return getConstNumber(offset + 167, $col_144);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_144(MCNumber value) {
		setConstNumber(offset + 167, $col_144, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_144(int value) {
		setConstNumber(offset + 167, $col_144, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_144(long value) {
		setConstNumber(offset + 167, $col_144, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_144(float value) {
		setConstNumber(offset + 167, $col_144, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_144(double value) {
		setConstNumber(offset + 167, $col_144, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_145() {
		return getConstNumber(offset + 168, $col_145);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_145(MCNumber value) {
		setConstNumber(offset + 168, $col_145, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_145(int value) {
		setConstNumber(offset + 168, $col_145, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_145(long value) {
		setConstNumber(offset + 168, $col_145, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_145(float value) {
		setConstNumber(offset + 168, $col_145, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_145(double value) {
		setConstNumber(offset + 168, $col_145, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_146() {
		return getConstNumber(offset + 169, $col_146);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_146(MCNumber value) {
		setConstNumber(offset + 169, $col_146, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_146(int value) {
		setConstNumber(offset + 169, $col_146, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_146(long value) {
		setConstNumber(offset + 169, $col_146, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_146(float value) {
		setConstNumber(offset + 169, $col_146, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_146(double value) {
		setConstNumber(offset + 169, $col_146, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_147() {
		return getConstNumber(offset + 170, $col_147);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_147(MCNumber value) {
		setConstNumber(offset + 170, $col_147, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_147(int value) {
		setConstNumber(offset + 170, $col_147, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_147(long value) {
		setConstNumber(offset + 170, $col_147, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_147(float value) {
		setConstNumber(offset + 170, $col_147, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_147(double value) {
		setConstNumber(offset + 170, $col_147, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_148() {
		return getConstNumber(offset + 171, $col_148);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_148(MCNumber value) {
		setConstNumber(offset + 171, $col_148, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_148(int value) {
		setConstNumber(offset + 171, $col_148, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_148(long value) {
		setConstNumber(offset + 171, $col_148, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_148(float value) {
		setConstNumber(offset + 171, $col_148, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_148(double value) {
		setConstNumber(offset + 171, $col_148, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_149() {
		return getConstNumber(offset + 172, $col_149);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_149(MCNumber value) {
		setConstNumber(offset + 172, $col_149, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_149(int value) {
		setConstNumber(offset + 172, $col_149, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_149(long value) {
		setConstNumber(offset + 172, $col_149, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_149(float value) {
		setConstNumber(offset + 172, $col_149, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_149(double value) {
		setConstNumber(offset + 172, $col_149, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_150() {
		return getConstNumber(offset + 173, $col_150);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_150(MCNumber value) {
		setConstNumber(offset + 173, $col_150, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_150(int value) {
		setConstNumber(offset + 173, $col_150, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_150(long value) {
		setConstNumber(offset + 173, $col_150, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_150(float value) {
		setConstNumber(offset + 173, $col_150, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_150(double value) {
		setConstNumber(offset + 173, $col_150, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_151() {
		return getConstNumber(offset + 174, $col_151);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_151(MCNumber value) {
		setConstNumber(offset + 174, $col_151, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_151(int value) {
		setConstNumber(offset + 174, $col_151, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_151(long value) {
		setConstNumber(offset + 174, $col_151, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_151(float value) {
		setConstNumber(offset + 174, $col_151, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_151(double value) {
		setConstNumber(offset + 174, $col_151, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_152() {
		return getConstNumber(offset + 175, $col_152);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_152(MCNumber value) {
		setConstNumber(offset + 175, $col_152, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_152(int value) {
		setConstNumber(offset + 175, $col_152, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_152(long value) {
		setConstNumber(offset + 175, $col_152, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_152(float value) {
		setConstNumber(offset + 175, $col_152, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_152(double value) {
		setConstNumber(offset + 175, $col_152, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_153() {
		return getConstNumber(offset + 176, $col_153);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_153(MCNumber value) {
		setConstNumber(offset + 176, $col_153, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_153(int value) {
		setConstNumber(offset + 176, $col_153, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_153(long value) {
		setConstNumber(offset + 176, $col_153, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_153(float value) {
		setConstNumber(offset + 176, $col_153, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_153(double value) {
		setConstNumber(offset + 176, $col_153, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_154() {
		return getConstNumber(offset + 177, $col_154);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_154(MCNumber value) {
		setConstNumber(offset + 177, $col_154, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_154(int value) {
		setConstNumber(offset + 177, $col_154, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_154(long value) {
		setConstNumber(offset + 177, $col_154, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_154(float value) {
		setConstNumber(offset + 177, $col_154, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_154(double value) {
		setConstNumber(offset + 177, $col_154, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_155() {
		return getConstNumber(offset + 178, $col_155);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_155(MCNumber value) {
		setConstNumber(offset + 178, $col_155, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_155(int value) {
		setConstNumber(offset + 178, $col_155, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_155(long value) {
		setConstNumber(offset + 178, $col_155, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_155(float value) {
		setConstNumber(offset + 178, $col_155, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_155(double value) {
		setConstNumber(offset + 178, $col_155, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_156() {
		return getConstNumber(offset + 179, $col_156);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_156(MCNumber value) {
		setConstNumber(offset + 179, $col_156, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_156(int value) {
		setConstNumber(offset + 179, $col_156, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_156(long value) {
		setConstNumber(offset + 179, $col_156, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_156(float value) {
		setConstNumber(offset + 179, $col_156, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_156(double value) {
		setConstNumber(offset + 179, $col_156, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_157() {
		return getConstNumber(offset + 180, $col_157);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_157(MCNumber value) {
		setConstNumber(offset + 180, $col_157, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_157(int value) {
		setConstNumber(offset + 180, $col_157, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_157(long value) {
		setConstNumber(offset + 180, $col_157, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_157(float value) {
		setConstNumber(offset + 180, $col_157, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_157(double value) {
		setConstNumber(offset + 180, $col_157, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_158() {
		return getConstNumber(offset + 181, $col_158);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_158(MCNumber value) {
		setConstNumber(offset + 181, $col_158, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_158(int value) {
		setConstNumber(offset + 181, $col_158, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_158(long value) {
		setConstNumber(offset + 181, $col_158, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_158(float value) {
		setConstNumber(offset + 181, $col_158, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_158(double value) {
		setConstNumber(offset + 181, $col_158, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_159() {
		return getConstNumber(offset + 182, $col_159);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_159(MCNumber value) {
		setConstNumber(offset + 182, $col_159, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_159(int value) {
		setConstNumber(offset + 182, $col_159, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_159(long value) {
		setConstNumber(offset + 182, $col_159, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_159(float value) {
		setConstNumber(offset + 182, $col_159, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_159(double value) {
		setConstNumber(offset + 182, $col_159, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_160() {
		return getConstNumber(offset + 183, $col_160);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_160(MCNumber value) {
		setConstNumber(offset + 183, $col_160, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_160(int value) {
		setConstNumber(offset + 183, $col_160, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_160(long value) {
		setConstNumber(offset + 183, $col_160, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_160(float value) {
		setConstNumber(offset + 183, $col_160, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_160(double value) {
		setConstNumber(offset + 183, $col_160, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_161() {
		return getConstNumber(offset + 184, $col_161);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_161(MCNumber value) {
		setConstNumber(offset + 184, $col_161, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_161(int value) {
		setConstNumber(offset + 184, $col_161, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_161(long value) {
		setConstNumber(offset + 184, $col_161, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_161(float value) {
		setConstNumber(offset + 184, $col_161, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_161(double value) {
		setConstNumber(offset + 184, $col_161, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_162() {
		return getConstNumber(offset + 185, $col_162);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_162(MCNumber value) {
		setConstNumber(offset + 185, $col_162, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_162(int value) {
		setConstNumber(offset + 185, $col_162, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_162(long value) {
		setConstNumber(offset + 185, $col_162, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_162(float value) {
		setConstNumber(offset + 185, $col_162, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_162(double value) {
		setConstNumber(offset + 185, $col_162, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_163() {
		return getConstNumber(offset + 186, $col_163);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_163(MCNumber value) {
		setConstNumber(offset + 186, $col_163, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_163(int value) {
		setConstNumber(offset + 186, $col_163, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_163(long value) {
		setConstNumber(offset + 186, $col_163, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_163(float value) {
		setConstNumber(offset + 186, $col_163, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_163(double value) {
		setConstNumber(offset + 186, $col_163, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_164() {
		return getConstNumber(offset + 187, $col_164);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_164(MCNumber value) {
		setConstNumber(offset + 187, $col_164, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_164(int value) {
		setConstNumber(offset + 187, $col_164, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_164(long value) {
		setConstNumber(offset + 187, $col_164, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_164(float value) {
		setConstNumber(offset + 187, $col_164, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_164(double value) {
		setConstNumber(offset + 187, $col_164, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_165() {
		return getConstNumber(offset + 188, $col_165);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_165(MCNumber value) {
		setConstNumber(offset + 188, $col_165, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_165(int value) {
		setConstNumber(offset + 188, $col_165, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_165(long value) {
		setConstNumber(offset + 188, $col_165, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_165(float value) {
		setConstNumber(offset + 188, $col_165, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_165(double value) {
		setConstNumber(offset + 188, $col_165, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_166() {
		return getConstNumber(offset + 189, $col_166);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_166(MCNumber value) {
		setConstNumber(offset + 189, $col_166, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_166(int value) {
		setConstNumber(offset + 189, $col_166, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_166(long value) {
		setConstNumber(offset + 189, $col_166, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_166(float value) {
		setConstNumber(offset + 189, $col_166, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_166(double value) {
		setConstNumber(offset + 189, $col_166, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_167() {
		return getConstNumber(offset + 190, $col_167);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_167(MCNumber value) {
		setConstNumber(offset + 190, $col_167, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_167(int value) {
		setConstNumber(offset + 190, $col_167, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_167(long value) {
		setConstNumber(offset + 190, $col_167, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_167(float value) {
		setConstNumber(offset + 190, $col_167, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_167(double value) {
		setConstNumber(offset + 190, $col_167, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_168() {
		return getConstNumber(offset + 191, $col_168);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_168(MCNumber value) {
		setConstNumber(offset + 191, $col_168, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_168(int value) {
		setConstNumber(offset + 191, $col_168, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_168(long value) {
		setConstNumber(offset + 191, $col_168, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_168(float value) {
		setConstNumber(offset + 191, $col_168, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_168(double value) {
		setConstNumber(offset + 191, $col_168, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_169() {
		return getConstNumber(offset + 192, $col_169);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_169(MCNumber value) {
		setConstNumber(offset + 192, $col_169, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_169(int value) {
		setConstNumber(offset + 192, $col_169, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_169(long value) {
		setConstNumber(offset + 192, $col_169, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_169(float value) {
		setConstNumber(offset + 192, $col_169, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_169(double value) {
		setConstNumber(offset + 192, $col_169, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_170() {
		return getConstNumber(offset + 193, $col_170);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_170(MCNumber value) {
		setConstNumber(offset + 193, $col_170, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_170(int value) {
		setConstNumber(offset + 193, $col_170, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_170(long value) {
		setConstNumber(offset + 193, $col_170, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_170(float value) {
		setConstNumber(offset + 193, $col_170, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_170(double value) {
		setConstNumber(offset + 193, $col_170, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_171() {
		return getConstNumber(offset + 194, $col_171);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_171(MCNumber value) {
		setConstNumber(offset + 194, $col_171, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_171(int value) {
		setConstNumber(offset + 194, $col_171, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_171(long value) {
		setConstNumber(offset + 194, $col_171, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_171(float value) {
		setConstNumber(offset + 194, $col_171, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_171(double value) {
		setConstNumber(offset + 194, $col_171, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_172() {
		return getConstNumber(offset + 195, $col_172);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_172(MCNumber value) {
		setConstNumber(offset + 195, $col_172, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_172(int value) {
		setConstNumber(offset + 195, $col_172, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_172(long value) {
		setConstNumber(offset + 195, $col_172, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_172(float value) {
		setConstNumber(offset + 195, $col_172, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_172(double value) {
		setConstNumber(offset + 195, $col_172, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_173() {
		return getConstNumber(offset + 196, $col_173);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_173(MCNumber value) {
		setConstNumber(offset + 196, $col_173, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_173(int value) {
		setConstNumber(offset + 196, $col_173, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_173(long value) {
		setConstNumber(offset + 196, $col_173, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_173(float value) {
		setConstNumber(offset + 196, $col_173, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_173(double value) {
		setConstNumber(offset + 196, $col_173, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_174() {
		return getConstNumber(offset + 197, $col_174);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_174(MCNumber value) {
		setConstNumber(offset + 197, $col_174, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_174(int value) {
		setConstNumber(offset + 197, $col_174, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_174(long value) {
		setConstNumber(offset + 197, $col_174, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_174(float value) {
		setConstNumber(offset + 197, $col_174, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_174(double value) {
		setConstNumber(offset + 197, $col_174, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_175() {
		return getConstNumber(offset + 198, $col_175);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_175(MCNumber value) {
		setConstNumber(offset + 198, $col_175, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_175(int value) {
		setConstNumber(offset + 198, $col_175, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_175(long value) {
		setConstNumber(offset + 198, $col_175, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_175(float value) {
		setConstNumber(offset + 198, $col_175, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_175(double value) {
		setConstNumber(offset + 198, $col_175, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_176() {
		return getConstNumber(offset + 199, $col_176);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_176(MCNumber value) {
		setConstNumber(offset + 199, $col_176, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_176(int value) {
		setConstNumber(offset + 199, $col_176, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_176(long value) {
		setConstNumber(offset + 199, $col_176, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_176(float value) {
		setConstNumber(offset + 199, $col_176, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_176(double value) {
		setConstNumber(offset + 199, $col_176, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_177() {
		return getConstNumber(offset + 200, $col_177);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_177(MCNumber value) {
		setConstNumber(offset + 200, $col_177, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_177(int value) {
		setConstNumber(offset + 200, $col_177, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_177(long value) {
		setConstNumber(offset + 200, $col_177, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_177(float value) {
		setConstNumber(offset + 200, $col_177, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_177(double value) {
		setConstNumber(offset + 200, $col_177, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_178() {
		return getConstNumber(offset + 201, $col_178);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_178(MCNumber value) {
		setConstNumber(offset + 201, $col_178, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_178(int value) {
		setConstNumber(offset + 201, $col_178, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_178(long value) {
		setConstNumber(offset + 201, $col_178, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_178(float value) {
		setConstNumber(offset + 201, $col_178, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_178(double value) {
		setConstNumber(offset + 201, $col_178, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_179() {
		return getConstNumber(offset + 202, $col_179);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_179(MCNumber value) {
		setConstNumber(offset + 202, $col_179, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_179(int value) {
		setConstNumber(offset + 202, $col_179, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_179(long value) {
		setConstNumber(offset + 202, $col_179, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_179(float value) {
		setConstNumber(offset + 202, $col_179, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_179(double value) {
		setConstNumber(offset + 202, $col_179, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_180() {
		return getConstNumber(offset + 203, $col_180);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_180(MCNumber value) {
		setConstNumber(offset + 203, $col_180, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_180(int value) {
		setConstNumber(offset + 203, $col_180, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_180(long value) {
		setConstNumber(offset + 203, $col_180, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_180(float value) {
		setConstNumber(offset + 203, $col_180, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_180(double value) {
		setConstNumber(offset + 203, $col_180, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_181() {
		return getConstNumber(offset + 204, $col_181);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_181(MCNumber value) {
		setConstNumber(offset + 204, $col_181, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_181(int value) {
		setConstNumber(offset + 204, $col_181, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_181(long value) {
		setConstNumber(offset + 204, $col_181, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_181(float value) {
		setConstNumber(offset + 204, $col_181, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_181(double value) {
		setConstNumber(offset + 204, $col_181, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_182() {
		return getConstNumber(offset + 205, $col_182);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_182(MCNumber value) {
		setConstNumber(offset + 205, $col_182, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_182(int value) {
		setConstNumber(offset + 205, $col_182, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_182(long value) {
		setConstNumber(offset + 205, $col_182, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_182(float value) {
		setConstNumber(offset + 205, $col_182, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_182(double value) {
		setConstNumber(offset + 205, $col_182, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_183() {
		return getConstNumber(offset + 206, $col_183);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_183(MCNumber value) {
		setConstNumber(offset + 206, $col_183, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_183(int value) {
		setConstNumber(offset + 206, $col_183, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_183(long value) {
		setConstNumber(offset + 206, $col_183, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_183(float value) {
		setConstNumber(offset + 206, $col_183, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_183(double value) {
		setConstNumber(offset + 206, $col_183, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_184() {
		return getConstNumber(offset + 207, $col_184);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_184(MCNumber value) {
		setConstNumber(offset + 207, $col_184, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_184(int value) {
		setConstNumber(offset + 207, $col_184, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_184(long value) {
		setConstNumber(offset + 207, $col_184, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_184(float value) {
		setConstNumber(offset + 207, $col_184, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_184(double value) {
		setConstNumber(offset + 207, $col_184, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_185() {
		return getConstNumber(offset + 208, $col_185);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_185(MCNumber value) {
		setConstNumber(offset + 208, $col_185, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_185(int value) {
		setConstNumber(offset + 208, $col_185, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_185(long value) {
		setConstNumber(offset + 208, $col_185, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_185(float value) {
		setConstNumber(offset + 208, $col_185, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_185(double value) {
		setConstNumber(offset + 208, $col_185, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_186() {
		return getConstNumber(offset + 209, $col_186);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_186(MCNumber value) {
		setConstNumber(offset + 209, $col_186, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_186(int value) {
		setConstNumber(offset + 209, $col_186, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_186(long value) {
		setConstNumber(offset + 209, $col_186, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_186(float value) {
		setConstNumber(offset + 209, $col_186, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_186(double value) {
		setConstNumber(offset + 209, $col_186, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_187() {
		return getConstNumber(offset + 210, $col_187);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_187(MCNumber value) {
		setConstNumber(offset + 210, $col_187, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_187(int value) {
		setConstNumber(offset + 210, $col_187, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_187(long value) {
		setConstNumber(offset + 210, $col_187, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_187(float value) {
		setConstNumber(offset + 210, $col_187, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_187(double value) {
		setConstNumber(offset + 210, $col_187, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_188() {
		return getConstNumber(offset + 211, $col_188);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_188(MCNumber value) {
		setConstNumber(offset + 211, $col_188, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_188(int value) {
		setConstNumber(offset + 211, $col_188, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_188(long value) {
		setConstNumber(offset + 211, $col_188, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_188(float value) {
		setConstNumber(offset + 211, $col_188, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_188(double value) {
		setConstNumber(offset + 211, $col_188, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_189() {
		return getConstNumber(offset + 212, $col_189);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_189(MCNumber value) {
		setConstNumber(offset + 212, $col_189, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_189(int value) {
		setConstNumber(offset + 212, $col_189, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_189(long value) {
		setConstNumber(offset + 212, $col_189, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_189(float value) {
		setConstNumber(offset + 212, $col_189, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_189(double value) {
		setConstNumber(offset + 212, $col_189, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_190() {
		return getConstNumber(offset + 213, $col_190);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_190(MCNumber value) {
		setConstNumber(offset + 213, $col_190, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_190(int value) {
		setConstNumber(offset + 213, $col_190, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_190(long value) {
		setConstNumber(offset + 213, $col_190, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_190(float value) {
		setConstNumber(offset + 213, $col_190, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_190(double value) {
		setConstNumber(offset + 213, $col_190, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_191() {
		return getConstNumber(offset + 214, $col_191);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_191(MCNumber value) {
		setConstNumber(offset + 214, $col_191, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_191(int value) {
		setConstNumber(offset + 214, $col_191, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_191(long value) {
		setConstNumber(offset + 214, $col_191, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_191(float value) {
		setConstNumber(offset + 214, $col_191, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_191(double value) {
		setConstNumber(offset + 214, $col_191, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_192() {
		return getConstNumber(offset + 215, $col_192);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_192(MCNumber value) {
		setConstNumber(offset + 215, $col_192, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_192(int value) {
		setConstNumber(offset + 215, $col_192, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_192(long value) {
		setConstNumber(offset + 215, $col_192, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_192(float value) {
		setConstNumber(offset + 215, $col_192, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_192(double value) {
		setConstNumber(offset + 215, $col_192, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_193() {
		return getConstNumber(offset + 216, $col_193);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_193(MCNumber value) {
		setConstNumber(offset + 216, $col_193, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_193(int value) {
		setConstNumber(offset + 216, $col_193, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_193(long value) {
		setConstNumber(offset + 216, $col_193, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_193(float value) {
		setConstNumber(offset + 216, $col_193, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_193(double value) {
		setConstNumber(offset + 216, $col_193, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_194() {
		return getConstNumber(offset + 217, $col_194);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_194(MCNumber value) {
		setConstNumber(offset + 217, $col_194, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_194(int value) {
		setConstNumber(offset + 217, $col_194, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_194(long value) {
		setConstNumber(offset + 217, $col_194, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_194(float value) {
		setConstNumber(offset + 217, $col_194, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_194(double value) {
		setConstNumber(offset + 217, $col_194, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_195() {
		return getConstNumber(offset + 218, $col_195);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_195(MCNumber value) {
		setConstNumber(offset + 218, $col_195, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_195(int value) {
		setConstNumber(offset + 218, $col_195, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_195(long value) {
		setConstNumber(offset + 218, $col_195, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_195(float value) {
		setConstNumber(offset + 218, $col_195, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_195(double value) {
		setConstNumber(offset + 218, $col_195, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_196() {
		return getConstNumber(offset + 219, $col_196);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_196(MCNumber value) {
		setConstNumber(offset + 219, $col_196, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_196(int value) {
		setConstNumber(offset + 219, $col_196, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_196(long value) {
		setConstNumber(offset + 219, $col_196, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_196(float value) {
		setConstNumber(offset + 219, $col_196, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_196(double value) {
		setConstNumber(offset + 219, $col_196, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_197() {
		return getConstNumber(offset + 220, $col_197);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_197(MCNumber value) {
		setConstNumber(offset + 220, $col_197, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_197(int value) {
		setConstNumber(offset + 220, $col_197, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_197(long value) {
		setConstNumber(offset + 220, $col_197, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_197(float value) {
		setConstNumber(offset + 220, $col_197, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_197(double value) {
		setConstNumber(offset + 220, $col_197, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_198() {
		return getConstNumber(offset + 221, $col_198);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_198(MCNumber value) {
		setConstNumber(offset + 221, $col_198, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_198(int value) {
		setConstNumber(offset + 221, $col_198, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_198(long value) {
		setConstNumber(offset + 221, $col_198, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_198(float value) {
		setConstNumber(offset + 221, $col_198, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_198(double value) {
		setConstNumber(offset + 221, $col_198, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_199() {
		return getConstNumber(offset + 222, $col_199);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_199(MCNumber value) {
		setConstNumber(offset + 222, $col_199, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_199(int value) {
		setConstNumber(offset + 222, $col_199, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_199(long value) {
		setConstNumber(offset + 222, $col_199, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_199(float value) {
		setConstNumber(offset + 222, $col_199, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_199(double value) {
		setConstNumber(offset + 222, $col_199, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_200() {
		return getConstNumber(offset + 223, $col_200);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_200(MCNumber value) {
		setConstNumber(offset + 223, $col_200, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_200(int value) {
		setConstNumber(offset + 223, $col_200, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_200(long value) {
		setConstNumber(offset + 223, $col_200, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_200(float value) {
		setConstNumber(offset + 223, $col_200, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_200(double value) {
		setConstNumber(offset + 223, $col_200, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_201() {
		return getConstNumber(offset + 224, $col_201);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_201(MCNumber value) {
		setConstNumber(offset + 224, $col_201, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_201(int value) {
		setConstNumber(offset + 224, $col_201, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_201(long value) {
		setConstNumber(offset + 224, $col_201, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_201(float value) {
		setConstNumber(offset + 224, $col_201, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_201(double value) {
		setConstNumber(offset + 224, $col_201, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_202() {
		return getConstNumber(offset + 225, $col_202);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_202(MCNumber value) {
		setConstNumber(offset + 225, $col_202, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_202(int value) {
		setConstNumber(offset + 225, $col_202, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_202(long value) {
		setConstNumber(offset + 225, $col_202, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_202(float value) {
		setConstNumber(offset + 225, $col_202, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_202(double value) {
		setConstNumber(offset + 225, $col_202, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_203() {
		return getConstNumber(offset + 226, $col_203);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_203(MCNumber value) {
		setConstNumber(offset + 226, $col_203, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_203(int value) {
		setConstNumber(offset + 226, $col_203, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_203(long value) {
		setConstNumber(offset + 226, $col_203, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_203(float value) {
		setConstNumber(offset + 226, $col_203, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_203(double value) {
		setConstNumber(offset + 226, $col_203, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_204() {
		return getConstNumber(offset + 227, $col_204);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_204(MCNumber value) {
		setConstNumber(offset + 227, $col_204, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_204(int value) {
		setConstNumber(offset + 227, $col_204, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_204(long value) {
		setConstNumber(offset + 227, $col_204, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_204(float value) {
		setConstNumber(offset + 227, $col_204, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_204(double value) {
		setConstNumber(offset + 227, $col_204, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_205() {
		return getConstNumber(offset + 228, $col_205);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_205(MCNumber value) {
		setConstNumber(offset + 228, $col_205, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_205(int value) {
		setConstNumber(offset + 228, $col_205, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_205(long value) {
		setConstNumber(offset + 228, $col_205, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_205(float value) {
		setConstNumber(offset + 228, $col_205, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_205(double value) {
		setConstNumber(offset + 228, $col_205, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_206() {
		return getConstNumber(offset + 229, $col_206);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_206(MCNumber value) {
		setConstNumber(offset + 229, $col_206, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_206(int value) {
		setConstNumber(offset + 229, $col_206, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_206(long value) {
		setConstNumber(offset + 229, $col_206, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_206(float value) {
		setConstNumber(offset + 229, $col_206, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_206(double value) {
		setConstNumber(offset + 229, $col_206, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_207() {
		return getConstNumber(offset + 230, $col_207);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_207(MCNumber value) {
		setConstNumber(offset + 230, $col_207, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_207(int value) {
		setConstNumber(offset + 230, $col_207, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_207(long value) {
		setConstNumber(offset + 230, $col_207, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_207(float value) {
		setConstNumber(offset + 230, $col_207, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_207(double value) {
		setConstNumber(offset + 230, $col_207, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_208() {
		return getConstNumber(offset + 231, $col_208);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_208(MCNumber value) {
		setConstNumber(offset + 231, $col_208, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_208(int value) {
		setConstNumber(offset + 231, $col_208, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_208(long value) {
		setConstNumber(offset + 231, $col_208, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_208(float value) {
		setConstNumber(offset + 231, $col_208, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_208(double value) {
		setConstNumber(offset + 231, $col_208, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_209() {
		return getConstNumber(offset + 232, $col_209);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_209(MCNumber value) {
		setConstNumber(offset + 232, $col_209, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_209(int value) {
		setConstNumber(offset + 232, $col_209, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_209(long value) {
		setConstNumber(offset + 232, $col_209, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_209(float value) {
		setConstNumber(offset + 232, $col_209, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_209(double value) {
		setConstNumber(offset + 232, $col_209, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_210() {
		return getConstNumber(offset + 233, $col_210);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_210(MCNumber value) {
		setConstNumber(offset + 233, $col_210, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_210(int value) {
		setConstNumber(offset + 233, $col_210, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_210(long value) {
		setConstNumber(offset + 233, $col_210, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_210(float value) {
		setConstNumber(offset + 233, $col_210, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_210(double value) {
		setConstNumber(offset + 233, $col_210, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_211() {
		return getConstNumber(offset + 234, $col_211);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_211(MCNumber value) {
		setConstNumber(offset + 234, $col_211, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_211(int value) {
		setConstNumber(offset + 234, $col_211, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_211(long value) {
		setConstNumber(offset + 234, $col_211, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_211(float value) {
		setConstNumber(offset + 234, $col_211, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_211(double value) {
		setConstNumber(offset + 234, $col_211, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_212() {
		return getConstNumber(offset + 235, $col_212);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_212(MCNumber value) {
		setConstNumber(offset + 235, $col_212, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_212(int value) {
		setConstNumber(offset + 235, $col_212, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_212(long value) {
		setConstNumber(offset + 235, $col_212, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_212(float value) {
		setConstNumber(offset + 235, $col_212, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_212(double value) {
		setConstNumber(offset + 235, $col_212, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_213() {
		return getConstNumber(offset + 236, $col_213);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_213(MCNumber value) {
		setConstNumber(offset + 236, $col_213, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_213(int value) {
		setConstNumber(offset + 236, $col_213, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_213(long value) {
		setConstNumber(offset + 236, $col_213, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_213(float value) {
		setConstNumber(offset + 236, $col_213, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_213(double value) {
		setConstNumber(offset + 236, $col_213, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_214() {
		return getConstNumber(offset + 237, $col_214);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_214(MCNumber value) {
		setConstNumber(offset + 237, $col_214, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_214(int value) {
		setConstNumber(offset + 237, $col_214, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_214(long value) {
		setConstNumber(offset + 237, $col_214, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_214(float value) {
		setConstNumber(offset + 237, $col_214, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_214(double value) {
		setConstNumber(offset + 237, $col_214, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_215() {
		return getConstNumber(offset + 238, $col_215);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_215(MCNumber value) {
		setConstNumber(offset + 238, $col_215, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_215(int value) {
		setConstNumber(offset + 238, $col_215, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_215(long value) {
		setConstNumber(offset + 238, $col_215, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_215(float value) {
		setConstNumber(offset + 238, $col_215, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_215(double value) {
		setConstNumber(offset + 238, $col_215, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_216() {
		return getConstNumber(offset + 239, $col_216);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_216(MCNumber value) {
		setConstNumber(offset + 239, $col_216, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_216(int value) {
		setConstNumber(offset + 239, $col_216, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_216(long value) {
		setConstNumber(offset + 239, $col_216, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_216(float value) {
		setConstNumber(offset + 239, $col_216, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_216(double value) {
		setConstNumber(offset + 239, $col_216, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_217() {
		return getConstNumber(offset + 240, $col_217);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_217(MCNumber value) {
		setConstNumber(offset + 240, $col_217, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_217(int value) {
		setConstNumber(offset + 240, $col_217, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_217(long value) {
		setConstNumber(offset + 240, $col_217, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_217(float value) {
		setConstNumber(offset + 240, $col_217, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_217(double value) {
		setConstNumber(offset + 240, $col_217, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_218() {
		return getConstNumber(offset + 241, $col_218);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_218(MCNumber value) {
		setConstNumber(offset + 241, $col_218, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_218(int value) {
		setConstNumber(offset + 241, $col_218, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_218(long value) {
		setConstNumber(offset + 241, $col_218, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_218(float value) {
		setConstNumber(offset + 241, $col_218, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_218(double value) {
		setConstNumber(offset + 241, $col_218, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_219() {
		return getConstNumber(offset + 242, $col_219);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_219(MCNumber value) {
		setConstNumber(offset + 242, $col_219, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_219(int value) {
		setConstNumber(offset + 242, $col_219, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_219(long value) {
		setConstNumber(offset + 242, $col_219, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_219(float value) {
		setConstNumber(offset + 242, $col_219, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_219(double value) {
		setConstNumber(offset + 242, $col_219, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_220() {
		return getConstNumber(offset + 243, $col_220);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_220(MCNumber value) {
		setConstNumber(offset + 243, $col_220, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_220(int value) {
		setConstNumber(offset + 243, $col_220, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_220(long value) {
		setConstNumber(offset + 243, $col_220, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_220(float value) {
		setConstNumber(offset + 243, $col_220, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_220(double value) {
		setConstNumber(offset + 243, $col_220, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_221() {
		return getConstNumber(offset + 244, $col_221);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_221(MCNumber value) {
		setConstNumber(offset + 244, $col_221, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_221(int value) {
		setConstNumber(offset + 244, $col_221, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_221(long value) {
		setConstNumber(offset + 244, $col_221, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_221(float value) {
		setConstNumber(offset + 244, $col_221, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_221(double value) {
		setConstNumber(offset + 244, $col_221, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_222() {
		return getConstNumber(offset + 245, $col_222);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_222(MCNumber value) {
		setConstNumber(offset + 245, $col_222, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_222(int value) {
		setConstNumber(offset + 245, $col_222, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_222(long value) {
		setConstNumber(offset + 245, $col_222, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_222(float value) {
		setConstNumber(offset + 245, $col_222, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_222(double value) {
		setConstNumber(offset + 245, $col_222, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_223() {
		return getConstNumber(offset + 246, $col_223);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_223(MCNumber value) {
		setConstNumber(offset + 246, $col_223, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_223(int value) {
		setConstNumber(offset + 246, $col_223, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_223(long value) {
		setConstNumber(offset + 246, $col_223, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_223(float value) {
		setConstNumber(offset + 246, $col_223, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_223(double value) {
		setConstNumber(offset + 246, $col_223, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_224() {
		return getConstNumber(offset + 247, $col_224);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_224(MCNumber value) {
		setConstNumber(offset + 247, $col_224, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_224(int value) {
		setConstNumber(offset + 247, $col_224, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_224(long value) {
		setConstNumber(offset + 247, $col_224, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_224(float value) {
		setConstNumber(offset + 247, $col_224, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_224(double value) {
		setConstNumber(offset + 247, $col_224, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_225() {
		return getConstNumber(offset + 248, $col_225);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_225(MCNumber value) {
		setConstNumber(offset + 248, $col_225, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_225(int value) {
		setConstNumber(offset + 248, $col_225, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_225(long value) {
		setConstNumber(offset + 248, $col_225, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_225(float value) {
		setConstNumber(offset + 248, $col_225, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_225(double value) {
		setConstNumber(offset + 248, $col_225, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_226() {
		return getConstNumber(offset + 249, $col_226);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_226(MCNumber value) {
		setConstNumber(offset + 249, $col_226, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_226(int value) {
		setConstNumber(offset + 249, $col_226, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_226(long value) {
		setConstNumber(offset + 249, $col_226, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_226(float value) {
		setConstNumber(offset + 249, $col_226, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_226(double value) {
		setConstNumber(offset + 249, $col_226, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_227() {
		return getConstNumber(offset + 250, $col_227);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_227(MCNumber value) {
		setConstNumber(offset + 250, $col_227, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_227(int value) {
		setConstNumber(offset + 250, $col_227, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_227(long value) {
		setConstNumber(offset + 250, $col_227, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_227(float value) {
		setConstNumber(offset + 250, $col_227, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_227(double value) {
		setConstNumber(offset + 250, $col_227, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_228() {
		return getConstNumber(offset + 251, $col_228);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_228(MCNumber value) {
		setConstNumber(offset + 251, $col_228, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_228(int value) {
		setConstNumber(offset + 251, $col_228, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_228(long value) {
		setConstNumber(offset + 251, $col_228, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_228(float value) {
		setConstNumber(offset + 251, $col_228, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_228(double value) {
		setConstNumber(offset + 251, $col_228, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_229() {
		return getConstNumber(offset + 252, $col_229);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_229(MCNumber value) {
		setConstNumber(offset + 252, $col_229, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_229(int value) {
		setConstNumber(offset + 252, $col_229, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_229(long value) {
		setConstNumber(offset + 252, $col_229, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_229(float value) {
		setConstNumber(offset + 252, $col_229, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_229(double value) {
		setConstNumber(offset + 252, $col_229, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_230() {
		return getConstNumber(offset + 253, $col_230);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_230(MCNumber value) {
		setConstNumber(offset + 253, $col_230, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_230(int value) {
		setConstNumber(offset + 253, $col_230, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_230(long value) {
		setConstNumber(offset + 253, $col_230, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_230(float value) {
		setConstNumber(offset + 253, $col_230, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_230(double value) {
		setConstNumber(offset + 253, $col_230, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_231() {
		return getConstNumber(offset + 254, $col_231);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_231(MCNumber value) {
		setConstNumber(offset + 254, $col_231, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_231(int value) {
		setConstNumber(offset + 254, $col_231, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_231(long value) {
		setConstNumber(offset + 254, $col_231, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_231(float value) {
		setConstNumber(offset + 254, $col_231, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_231(double value) {
		setConstNumber(offset + 254, $col_231, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_232() {
		return getConstNumber(offset + 255, $col_232);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_232(MCNumber value) {
		setConstNumber(offset + 255, $col_232, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_232(int value) {
		setConstNumber(offset + 255, $col_232, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_232(long value) {
		setConstNumber(offset + 255, $col_232, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_232(float value) {
		setConstNumber(offset + 255, $col_232, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_232(double value) {
		setConstNumber(offset + 255, $col_232, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_233() {
		return getConstNumber(offset + 256, $col_233);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_233(MCNumber value) {
		setConstNumber(offset + 256, $col_233, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_233(int value) {
		setConstNumber(offset + 256, $col_233, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_233(long value) {
		setConstNumber(offset + 256, $col_233, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_233(float value) {
		setConstNumber(offset + 256, $col_233, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_233(double value) {
		setConstNumber(offset + 256, $col_233, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_234() {
		return getConstNumber(offset + 257, $col_234);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_234(MCNumber value) {
		setConstNumber(offset + 257, $col_234, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_234(int value) {
		setConstNumber(offset + 257, $col_234, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_234(long value) {
		setConstNumber(offset + 257, $col_234, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_234(float value) {
		setConstNumber(offset + 257, $col_234, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_234(double value) {
		setConstNumber(offset + 257, $col_234, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_235() {
		return getConstNumber(offset + 258, $col_235);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_235(MCNumber value) {
		setConstNumber(offset + 258, $col_235, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_235(int value) {
		setConstNumber(offset + 258, $col_235, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_235(long value) {
		setConstNumber(offset + 258, $col_235, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_235(float value) {
		setConstNumber(offset + 258, $col_235, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_235(double value) {
		setConstNumber(offset + 258, $col_235, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_236() {
		return getConstNumber(offset + 259, $col_236);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_236(MCNumber value) {
		setConstNumber(offset + 259, $col_236, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_236(int value) {
		setConstNumber(offset + 259, $col_236, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_236(long value) {
		setConstNumber(offset + 259, $col_236, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_236(float value) {
		setConstNumber(offset + 259, $col_236, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_236(double value) {
		setConstNumber(offset + 259, $col_236, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_237() {
		return getConstNumber(offset + 260, $col_237);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_237(MCNumber value) {
		setConstNumber(offset + 260, $col_237, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_237(int value) {
		setConstNumber(offset + 260, $col_237, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_237(long value) {
		setConstNumber(offset + 260, $col_237, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_237(float value) {
		setConstNumber(offset + 260, $col_237, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_237(double value) {
		setConstNumber(offset + 260, $col_237, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_238() {
		return getConstNumber(offset + 261, $col_238);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_238(MCNumber value) {
		setConstNumber(offset + 261, $col_238, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_238(int value) {
		setConstNumber(offset + 261, $col_238, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_238(long value) {
		setConstNumber(offset + 261, $col_238, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_238(float value) {
		setConstNumber(offset + 261, $col_238, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_238(double value) {
		setConstNumber(offset + 261, $col_238, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_239() {
		return getConstNumber(offset + 262, $col_239);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_239(MCNumber value) {
		setConstNumber(offset + 262, $col_239, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_239(int value) {
		setConstNumber(offset + 262, $col_239, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_239(long value) {
		setConstNumber(offset + 262, $col_239, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_239(float value) {
		setConstNumber(offset + 262, $col_239, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_239(double value) {
		setConstNumber(offset + 262, $col_239, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_240() {
		return getConstNumber(offset + 263, $col_240);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_240(MCNumber value) {
		setConstNumber(offset + 263, $col_240, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_240(int value) {
		setConstNumber(offset + 263, $col_240, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_240(long value) {
		setConstNumber(offset + 263, $col_240, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_240(float value) {
		setConstNumber(offset + 263, $col_240, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_240(double value) {
		setConstNumber(offset + 263, $col_240, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_241() {
		return getConstNumber(offset + 264, $col_241);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_241(MCNumber value) {
		setConstNumber(offset + 264, $col_241, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_241(int value) {
		setConstNumber(offset + 264, $col_241, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_241(long value) {
		setConstNumber(offset + 264, $col_241, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_241(float value) {
		setConstNumber(offset + 264, $col_241, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_241(double value) {
		setConstNumber(offset + 264, $col_241, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_242() {
		return getConstNumber(offset + 265, $col_242);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_242(MCNumber value) {
		setConstNumber(offset + 265, $col_242, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_242(int value) {
		setConstNumber(offset + 265, $col_242, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_242(long value) {
		setConstNumber(offset + 265, $col_242, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_242(float value) {
		setConstNumber(offset + 265, $col_242, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_242(double value) {
		setConstNumber(offset + 265, $col_242, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_243() {
		return getConstNumber(offset + 266, $col_243);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_243(MCNumber value) {
		setConstNumber(offset + 266, $col_243, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_243(int value) {
		setConstNumber(offset + 266, $col_243, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_243(long value) {
		setConstNumber(offset + 266, $col_243, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_243(float value) {
		setConstNumber(offset + 266, $col_243, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_243(double value) {
		setConstNumber(offset + 266, $col_243, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_244() {
		return getConstNumber(offset + 267, $col_244);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_244(MCNumber value) {
		setConstNumber(offset + 267, $col_244, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_244(int value) {
		setConstNumber(offset + 267, $col_244, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_244(long value) {
		setConstNumber(offset + 267, $col_244, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_244(float value) {
		setConstNumber(offset + 267, $col_244, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_244(double value) {
		setConstNumber(offset + 267, $col_244, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_245() {
		return getConstNumber(offset + 268, $col_245);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_245(MCNumber value) {
		setConstNumber(offset + 268, $col_245, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_245(int value) {
		setConstNumber(offset + 268, $col_245, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_245(long value) {
		setConstNumber(offset + 268, $col_245, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_245(float value) {
		setConstNumber(offset + 268, $col_245, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_245(double value) {
		setConstNumber(offset + 268, $col_245, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_246() {
		return getConstNumber(offset + 269, $col_246);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_246(MCNumber value) {
		setConstNumber(offset + 269, $col_246, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_246(int value) {
		setConstNumber(offset + 269, $col_246, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_246(long value) {
		setConstNumber(offset + 269, $col_246, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_246(float value) {
		setConstNumber(offset + 269, $col_246, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_246(double value) {
		setConstNumber(offset + 269, $col_246, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_247() {
		return getConstNumber(offset + 270, $col_247);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_247(MCNumber value) {
		setConstNumber(offset + 270, $col_247, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_247(int value) {
		setConstNumber(offset + 270, $col_247, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_247(long value) {
		setConstNumber(offset + 270, $col_247, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_247(float value) {
		setConstNumber(offset + 270, $col_247, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_247(double value) {
		setConstNumber(offset + 270, $col_247, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_248() {
		return getConstNumber(offset + 271, $col_248);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_248(MCNumber value) {
		setConstNumber(offset + 271, $col_248, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_248(int value) {
		setConstNumber(offset + 271, $col_248, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_248(long value) {
		setConstNumber(offset + 271, $col_248, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_248(float value) {
		setConstNumber(offset + 271, $col_248, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_248(double value) {
		setConstNumber(offset + 271, $col_248, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_249() {
		return getConstNumber(offset + 272, $col_249);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_249(MCNumber value) {
		setConstNumber(offset + 272, $col_249, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_249(int value) {
		setConstNumber(offset + 272, $col_249, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_249(long value) {
		setConstNumber(offset + 272, $col_249, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_249(float value) {
		setConstNumber(offset + 272, $col_249, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_249(double value) {
		setConstNumber(offset + 272, $col_249, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_250() {
		return getConstNumber(offset + 273, $col_250);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_250(MCNumber value) {
		setConstNumber(offset + 273, $col_250, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_250(int value) {
		setConstNumber(offset + 273, $col_250, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_250(long value) {
		setConstNumber(offset + 273, $col_250, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_250(float value) {
		setConstNumber(offset + 273, $col_250, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_250(double value) {
		setConstNumber(offset + 273, $col_250, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_251() {
		return getConstNumber(offset + 274, $col_251);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_251(MCNumber value) {
		setConstNumber(offset + 274, $col_251, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_251(int value) {
		setConstNumber(offset + 274, $col_251, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_251(long value) {
		setConstNumber(offset + 274, $col_251, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_251(float value) {
		setConstNumber(offset + 274, $col_251, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_251(double value) {
		setConstNumber(offset + 274, $col_251, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_252() {
		return getConstNumber(offset + 275, $col_252);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_252(MCNumber value) {
		setConstNumber(offset + 275, $col_252, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_252(int value) {
		setConstNumber(offset + 275, $col_252, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_252(long value) {
		setConstNumber(offset + 275, $col_252, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_252(float value) {
		setConstNumber(offset + 275, $col_252, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_252(double value) {
		setConstNumber(offset + 275, $col_252, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_253() {
		return getConstNumber(offset + 276, $col_253);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_253(MCNumber value) {
		setConstNumber(offset + 276, $col_253, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_253(int value) {
		setConstNumber(offset + 276, $col_253, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_253(long value) {
		setConstNumber(offset + 276, $col_253, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_253(float value) {
		setConstNumber(offset + 276, $col_253, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_253(double value) {
		setConstNumber(offset + 276, $col_253, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_254() {
		return getConstNumber(offset + 277, $col_254);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_254(MCNumber value) {
		setConstNumber(offset + 277, $col_254, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_254(int value) {
		setConstNumber(offset + 277, $col_254, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_254(long value) {
		setConstNumber(offset + 277, $col_254, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_254(float value) {
		setConstNumber(offset + 277, $col_254, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_254(double value) {
		setConstNumber(offset + 277, $col_254, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_255() {
		return getConstNumber(offset + 278, $col_255);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_255(MCNumber value) {
		setConstNumber(offset + 278, $col_255, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_255(int value) {
		setConstNumber(offset + 278, $col_255, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_255(long value) {
		setConstNumber(offset + 278, $col_255, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_255(float value) {
		setConstNumber(offset + 278, $col_255, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_255(double value) {
		setConstNumber(offset + 278, $col_255, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_256() {
		return getConstNumber(offset + 279, $col_256);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_256(MCNumber value) {
		setConstNumber(offset + 279, $col_256, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_256(int value) {
		setConstNumber(offset + 279, $col_256, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_256(long value) {
		setConstNumber(offset + 279, $col_256, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_256(float value) {
		setConstNumber(offset + 279, $col_256, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_256(double value) {
		setConstNumber(offset + 279, $col_256, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_257() {
		return getConstNumber(offset + 280, $col_257);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_257(MCNumber value) {
		setConstNumber(offset + 280, $col_257, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_257(int value) {
		setConstNumber(offset + 280, $col_257, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_257(long value) {
		setConstNumber(offset + 280, $col_257, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_257(float value) {
		setConstNumber(offset + 280, $col_257, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_257(double value) {
		setConstNumber(offset + 280, $col_257, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_258() {
		return getConstNumber(offset + 281, $col_258);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_258(MCNumber value) {
		setConstNumber(offset + 281, $col_258, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_258(int value) {
		setConstNumber(offset + 281, $col_258, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_258(long value) {
		setConstNumber(offset + 281, $col_258, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_258(float value) {
		setConstNumber(offset + 281, $col_258, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_258(double value) {
		setConstNumber(offset + 281, $col_258, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_259() {
		return getConstNumber(offset + 282, $col_259);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_259(MCNumber value) {
		setConstNumber(offset + 282, $col_259, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_259(int value) {
		setConstNumber(offset + 282, $col_259, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_259(long value) {
		setConstNumber(offset + 282, $col_259, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_259(float value) {
		setConstNumber(offset + 282, $col_259, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_259(double value) {
		setConstNumber(offset + 282, $col_259, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_260() {
		return getConstNumber(offset + 283, $col_260);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_260(MCNumber value) {
		setConstNumber(offset + 283, $col_260, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_260(int value) {
		setConstNumber(offset + 283, $col_260, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_260(long value) {
		setConstNumber(offset + 283, $col_260, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_260(float value) {
		setConstNumber(offset + 283, $col_260, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_260(double value) {
		setConstNumber(offset + 283, $col_260, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_261() {
		return getConstNumber(offset + 284, $col_261);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_261(MCNumber value) {
		setConstNumber(offset + 284, $col_261, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_261(int value) {
		setConstNumber(offset + 284, $col_261, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_261(long value) {
		setConstNumber(offset + 284, $col_261, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_261(float value) {
		setConstNumber(offset + 284, $col_261, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_261(double value) {
		setConstNumber(offset + 284, $col_261, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_262() {
		return getConstNumber(offset + 285, $col_262);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_262(MCNumber value) {
		setConstNumber(offset + 285, $col_262, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_262(int value) {
		setConstNumber(offset + 285, $col_262, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_262(long value) {
		setConstNumber(offset + 285, $col_262, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_262(float value) {
		setConstNumber(offset + 285, $col_262, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_262(double value) {
		setConstNumber(offset + 285, $col_262, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_263() {
		return getConstNumber(offset + 286, $col_263);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_263(MCNumber value) {
		setConstNumber(offset + 286, $col_263, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_263(int value) {
		setConstNumber(offset + 286, $col_263, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_263(long value) {
		setConstNumber(offset + 286, $col_263, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_263(float value) {
		setConstNumber(offset + 286, $col_263, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_263(double value) {
		setConstNumber(offset + 286, $col_263, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_264() {
		return getConstNumber(offset + 287, $col_264);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_264(MCNumber value) {
		setConstNumber(offset + 287, $col_264, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_264(int value) {
		setConstNumber(offset + 287, $col_264, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_264(long value) {
		setConstNumber(offset + 287, $col_264, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_264(float value) {
		setConstNumber(offset + 287, $col_264, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_264(double value) {
		setConstNumber(offset + 287, $col_264, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_265() {
		return getConstNumber(offset + 288, $col_265);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_265(MCNumber value) {
		setConstNumber(offset + 288, $col_265, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_265(int value) {
		setConstNumber(offset + 288, $col_265, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_265(long value) {
		setConstNumber(offset + 288, $col_265, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_265(float value) {
		setConstNumber(offset + 288, $col_265, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_265(double value) {
		setConstNumber(offset + 288, $col_265, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_266() {
		return getConstNumber(offset + 289, $col_266);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_266(MCNumber value) {
		setConstNumber(offset + 289, $col_266, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_266(int value) {
		setConstNumber(offset + 289, $col_266, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_266(long value) {
		setConstNumber(offset + 289, $col_266, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_266(float value) {
		setConstNumber(offset + 289, $col_266, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_266(double value) {
		setConstNumber(offset + 289, $col_266, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_267() {
		return getConstNumber(offset + 290, $col_267);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_267(MCNumber value) {
		setConstNumber(offset + 290, $col_267, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_267(int value) {
		setConstNumber(offset + 290, $col_267, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_267(long value) {
		setConstNumber(offset + 290, $col_267, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_267(float value) {
		setConstNumber(offset + 290, $col_267, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_267(double value) {
		setConstNumber(offset + 290, $col_267, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_268() {
		return getConstNumber(offset + 291, $col_268);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_268(MCNumber value) {
		setConstNumber(offset + 291, $col_268, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_268(int value) {
		setConstNumber(offset + 291, $col_268, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_268(long value) {
		setConstNumber(offset + 291, $col_268, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_268(float value) {
		setConstNumber(offset + 291, $col_268, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_268(double value) {
		setConstNumber(offset + 291, $col_268, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_269() {
		return getConstNumber(offset + 292, $col_269);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_269(MCNumber value) {
		setConstNumber(offset + 292, $col_269, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_269(int value) {
		setConstNumber(offset + 292, $col_269, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_269(long value) {
		setConstNumber(offset + 292, $col_269, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_269(float value) {
		setConstNumber(offset + 292, $col_269, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_269(double value) {
		setConstNumber(offset + 292, $col_269, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_270() {
		return getConstNumber(offset + 293, $col_270);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_270(MCNumber value) {
		setConstNumber(offset + 293, $col_270, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_270(int value) {
		setConstNumber(offset + 293, $col_270, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_270(long value) {
		setConstNumber(offset + 293, $col_270, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_270(float value) {
		setConstNumber(offset + 293, $col_270, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_270(double value) {
		setConstNumber(offset + 293, $col_270, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_271() {
		return getConstNumber(offset + 294, $col_271);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_271(MCNumber value) {
		setConstNumber(offset + 294, $col_271, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_271(int value) {
		setConstNumber(offset + 294, $col_271, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_271(long value) {
		setConstNumber(offset + 294, $col_271, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_271(float value) {
		setConstNumber(offset + 294, $col_271, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_271(double value) {
		setConstNumber(offset + 294, $col_271, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_272() {
		return getConstNumber(offset + 295, $col_272);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_272(MCNumber value) {
		setConstNumber(offset + 295, $col_272, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_272(int value) {
		setConstNumber(offset + 295, $col_272, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_272(long value) {
		setConstNumber(offset + 295, $col_272, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_272(float value) {
		setConstNumber(offset + 295, $col_272, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_272(double value) {
		setConstNumber(offset + 295, $col_272, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_273() {
		return getConstNumber(offset + 296, $col_273);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_273(MCNumber value) {
		setConstNumber(offset + 296, $col_273, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_273(int value) {
		setConstNumber(offset + 296, $col_273, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_273(long value) {
		setConstNumber(offset + 296, $col_273, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_273(float value) {
		setConstNumber(offset + 296, $col_273, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_273(double value) {
		setConstNumber(offset + 296, $col_273, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_274() {
		return getConstNumber(offset + 297, $col_274);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_274(MCNumber value) {
		setConstNumber(offset + 297, $col_274, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_274(int value) {
		setConstNumber(offset + 297, $col_274, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_274(long value) {
		setConstNumber(offset + 297, $col_274, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_274(float value) {
		setConstNumber(offset + 297, $col_274, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_274(double value) {
		setConstNumber(offset + 297, $col_274, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_275() {
		return getConstNumber(offset + 298, $col_275);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_275(MCNumber value) {
		setConstNumber(offset + 298, $col_275, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_275(int value) {
		setConstNumber(offset + 298, $col_275, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_275(long value) {
		setConstNumber(offset + 298, $col_275, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_275(float value) {
		setConstNumber(offset + 298, $col_275, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_275(double value) {
		setConstNumber(offset + 298, $col_275, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_276() {
		return getConstNumber(offset + 299, $col_276);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_276(MCNumber value) {
		setConstNumber(offset + 299, $col_276, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_276(int value) {
		setConstNumber(offset + 299, $col_276, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_276(long value) {
		setConstNumber(offset + 299, $col_276, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_276(float value) {
		setConstNumber(offset + 299, $col_276, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_276(double value) {
		setConstNumber(offset + 299, $col_276, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_277() {
		return getConstNumber(offset + 300, $col_277);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_277(MCNumber value) {
		setConstNumber(offset + 300, $col_277, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_277(int value) {
		setConstNumber(offset + 300, $col_277, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_277(long value) {
		setConstNumber(offset + 300, $col_277, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_277(float value) {
		setConstNumber(offset + 300, $col_277, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_277(double value) {
		setConstNumber(offset + 300, $col_277, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_278() {
		return getConstNumber(offset + 301, $col_278);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_278(MCNumber value) {
		setConstNumber(offset + 301, $col_278, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_278(int value) {
		setConstNumber(offset + 301, $col_278, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_278(long value) {
		setConstNumber(offset + 301, $col_278, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_278(float value) {
		setConstNumber(offset + 301, $col_278, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_278(double value) {
		setConstNumber(offset + 301, $col_278, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_279() {
		return getConstNumber(offset + 302, $col_279);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_279(MCNumber value) {
		setConstNumber(offset + 302, $col_279, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_279(int value) {
		setConstNumber(offset + 302, $col_279, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_279(long value) {
		setConstNumber(offset + 302, $col_279, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_279(float value) {
		setConstNumber(offset + 302, $col_279, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_279(double value) {
		setConstNumber(offset + 302, $col_279, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_280() {
		return getConstNumber(offset + 303, $col_280);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_280(MCNumber value) {
		setConstNumber(offset + 303, $col_280, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_280(int value) {
		setConstNumber(offset + 303, $col_280, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_280(long value) {
		setConstNumber(offset + 303, $col_280, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_280(float value) {
		setConstNumber(offset + 303, $col_280, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_280(double value) {
		setConstNumber(offset + 303, $col_280, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_281() {
		return getConstNumber(offset + 304, $col_281);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_281(MCNumber value) {
		setConstNumber(offset + 304, $col_281, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_281(int value) {
		setConstNumber(offset + 304, $col_281, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_281(long value) {
		setConstNumber(offset + 304, $col_281, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_281(float value) {
		setConstNumber(offset + 304, $col_281, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_281(double value) {
		setConstNumber(offset + 304, $col_281, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_282() {
		return getConstNumber(offset + 305, $col_282);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_282(MCNumber value) {
		setConstNumber(offset + 305, $col_282, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_282(int value) {
		setConstNumber(offset + 305, $col_282, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_282(long value) {
		setConstNumber(offset + 305, $col_282, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_282(float value) {
		setConstNumber(offset + 305, $col_282, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_282(double value) {
		setConstNumber(offset + 305, $col_282, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_283() {
		return getConstNumber(offset + 306, $col_283);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_283(MCNumber value) {
		setConstNumber(offset + 306, $col_283, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_283(int value) {
		setConstNumber(offset + 306, $col_283, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_283(long value) {
		setConstNumber(offset + 306, $col_283, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_283(float value) {
		setConstNumber(offset + 306, $col_283, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_283(double value) {
		setConstNumber(offset + 306, $col_283, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_284() {
		return getConstNumber(offset + 307, $col_284);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_284(MCNumber value) {
		setConstNumber(offset + 307, $col_284, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_284(int value) {
		setConstNumber(offset + 307, $col_284, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_284(long value) {
		setConstNumber(offset + 307, $col_284, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_284(float value) {
		setConstNumber(offset + 307, $col_284, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_284(double value) {
		setConstNumber(offset + 307, $col_284, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_285() {
		return getConstNumber(offset + 308, $col_285);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_285(MCNumber value) {
		setConstNumber(offset + 308, $col_285, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_285(int value) {
		setConstNumber(offset + 308, $col_285, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_285(long value) {
		setConstNumber(offset + 308, $col_285, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_285(float value) {
		setConstNumber(offset + 308, $col_285, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_285(double value) {
		setConstNumber(offset + 308, $col_285, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_286() {
		return getConstNumber(offset + 309, $col_286);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_286(MCNumber value) {
		setConstNumber(offset + 309, $col_286, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_286(int value) {
		setConstNumber(offset + 309, $col_286, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_286(long value) {
		setConstNumber(offset + 309, $col_286, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_286(float value) {
		setConstNumber(offset + 309, $col_286, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_286(double value) {
		setConstNumber(offset + 309, $col_286, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_287() {
		return getConstNumber(offset + 310, $col_287);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_287(MCNumber value) {
		setConstNumber(offset + 310, $col_287, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_287(int value) {
		setConstNumber(offset + 310, $col_287, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_287(long value) {
		setConstNumber(offset + 310, $col_287, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_287(float value) {
		setConstNumber(offset + 310, $col_287, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_287(double value) {
		setConstNumber(offset + 310, $col_287, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_288() {
		return getConstNumber(offset + 311, $col_288);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_288(MCNumber value) {
		setConstNumber(offset + 311, $col_288, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_288(int value) {
		setConstNumber(offset + 311, $col_288, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_288(long value) {
		setConstNumber(offset + 311, $col_288, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_288(float value) {
		setConstNumber(offset + 311, $col_288, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_288(double value) {
		setConstNumber(offset + 311, $col_288, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_289() {
		return getConstNumber(offset + 312, $col_289);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_289(MCNumber value) {
		setConstNumber(offset + 312, $col_289, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_289(int value) {
		setConstNumber(offset + 312, $col_289, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_289(long value) {
		setConstNumber(offset + 312, $col_289, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_289(float value) {
		setConstNumber(offset + 312, $col_289, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_289(double value) {
		setConstNumber(offset + 312, $col_289, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_290() {
		return getConstNumber(offset + 313, $col_290);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_290(MCNumber value) {
		setConstNumber(offset + 313, $col_290, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_290(int value) {
		setConstNumber(offset + 313, $col_290, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_290(long value) {
		setConstNumber(offset + 313, $col_290, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_290(float value) {
		setConstNumber(offset + 313, $col_290, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_290(double value) {
		setConstNumber(offset + 313, $col_290, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_291() {
		return getConstNumber(offset + 314, $col_291);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_291(MCNumber value) {
		setConstNumber(offset + 314, $col_291, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_291(int value) {
		setConstNumber(offset + 314, $col_291, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_291(long value) {
		setConstNumber(offset + 314, $col_291, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_291(float value) {
		setConstNumber(offset + 314, $col_291, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_291(double value) {
		setConstNumber(offset + 314, $col_291, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_292() {
		return getConstNumber(offset + 315, $col_292);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_292(MCNumber value) {
		setConstNumber(offset + 315, $col_292, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_292(int value) {
		setConstNumber(offset + 315, $col_292, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_292(long value) {
		setConstNumber(offset + 315, $col_292, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_292(float value) {
		setConstNumber(offset + 315, $col_292, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_292(double value) {
		setConstNumber(offset + 315, $col_292, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_293() {
		return getConstNumber(offset + 316, $col_293);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_293(MCNumber value) {
		setConstNumber(offset + 316, $col_293, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_293(int value) {
		setConstNumber(offset + 316, $col_293, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_293(long value) {
		setConstNumber(offset + 316, $col_293, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_293(float value) {
		setConstNumber(offset + 316, $col_293, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_293(double value) {
		setConstNumber(offset + 316, $col_293, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_294() {
		return getConstNumber(offset + 317, $col_294);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_294(MCNumber value) {
		setConstNumber(offset + 317, $col_294, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_294(int value) {
		setConstNumber(offset + 317, $col_294, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_294(long value) {
		setConstNumber(offset + 317, $col_294, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_294(float value) {
		setConstNumber(offset + 317, $col_294, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_294(double value) {
		setConstNumber(offset + 317, $col_294, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_295() {
		return getConstNumber(offset + 318, $col_295);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_295(MCNumber value) {
		setConstNumber(offset + 318, $col_295, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_295(int value) {
		setConstNumber(offset + 318, $col_295, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_295(long value) {
		setConstNumber(offset + 318, $col_295, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_295(float value) {
		setConstNumber(offset + 318, $col_295, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_295(double value) {
		setConstNumber(offset + 318, $col_295, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_296() {
		return getConstNumber(offset + 319, $col_296);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_296(MCNumber value) {
		setConstNumber(offset + 319, $col_296, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_296(int value) {
		setConstNumber(offset + 319, $col_296, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_296(long value) {
		setConstNumber(offset + 319, $col_296, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_296(float value) {
		setConstNumber(offset + 319, $col_296, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_296(double value) {
		setConstNumber(offset + 319, $col_296, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber col_297() {
		return getConstNumber(offset + 320, $col_297);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_297(MCNumber value) {
		setConstNumber(offset + 320, $col_297, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_297(int value) {
		setConstNumber(offset + 320, $col_297, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_297(long value) {
		setConstNumber(offset + 320, $col_297, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_297(float value) {
		setConstNumber(offset + 320, $col_297, value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void col_297(double value) {
		setConstNumber(offset + 320, $col_297, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_298() {
		return getConstNumber(offset + 321, $col_298);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_298(MCNumber value) {
		setConstNumber(offset + 321, $col_298, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_298(int value) {
		setConstNumber(offset + 321, $col_298, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_298(long value) {
		setConstNumber(offset + 321, $col_298, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_298(float value) {
		setConstNumber(offset + 321, $col_298, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_298(double value) {
		setConstNumber(offset + 321, $col_298, value);
	}


	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber col_299() {
		return getConstNumber(offset + 322, $col_299);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_299(MCNumber value) {
		setConstNumber(offset + 322, $col_299, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_299(int value) {
		setConstNumber(offset + 322, $col_299, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_299(long value) {
		setConstNumber(offset + 322, $col_299, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_299(float value) {
		setConstNumber(offset + 322, $col_299, value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void col_299(double value) {
		setConstNumber(offset + 322, $col_299, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			return wk_cost_nm();
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			return wk_cost_unit_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($diff_ttl.equalsIgnoreCase(name)) {
			return diff_ttl();
		}
		if ($std_ttl.equalsIgnoreCase(name)) {
			return std_ttl();
		}
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		if ($diff_var_cost.equalsIgnoreCase(name)) {
			return diff_var_cost();
		}
		if ($std_var_cost.equalsIgnoreCase(name)) {
			return std_var_cost();
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			return var_cost();
		}
		if ($diff_fxd_cost.equalsIgnoreCase(name)) {
			return diff_fxd_cost();
		}
		if ($std_fxd_cost.equalsIgnoreCase(name)) {
			return std_fxd_cost();
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
		if ($col_105.equalsIgnoreCase(name)) {
			return col_105();
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
		if ($col_112.equalsIgnoreCase(name)) {
			return col_112();
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
		if ($col_119.equalsIgnoreCase(name)) {
			return col_119();
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
		if ($col_126.equalsIgnoreCase(name)) {
			return col_126();
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
		if ($col_133.equalsIgnoreCase(name)) {
			return col_133();
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
		if ($col_140.equalsIgnoreCase(name)) {
			return col_140();
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
		if ($col_147.equalsIgnoreCase(name)) {
			return col_147();
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
		if ($col_154.equalsIgnoreCase(name)) {
			return col_154();
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
		if ($col_161.equalsIgnoreCase(name)) {
			return col_161();
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
		if ($col_168.equalsIgnoreCase(name)) {
			return col_168();
		}
		if ($col_169.equalsIgnoreCase(name)) {
			return col_169();
		}
		if ($col_170.equalsIgnoreCase(name)) {
			return col_170();
		}
		if ($col_171.equalsIgnoreCase(name)) {
			return col_171();
		}
		if ($col_172.equalsIgnoreCase(name)) {
			return col_172();
		}
		if ($col_173.equalsIgnoreCase(name)) {
			return col_173();
		}
		if ($col_174.equalsIgnoreCase(name)) {
			return col_174();
		}
		if ($col_175.equalsIgnoreCase(name)) {
			return col_175();
		}
		if ($col_176.equalsIgnoreCase(name)) {
			return col_176();
		}
		if ($col_177.equalsIgnoreCase(name)) {
			return col_177();
		}
		if ($col_178.equalsIgnoreCase(name)) {
			return col_178();
		}
		if ($col_179.equalsIgnoreCase(name)) {
			return col_179();
		}
		if ($col_180.equalsIgnoreCase(name)) {
			return col_180();
		}
		if ($col_181.equalsIgnoreCase(name)) {
			return col_181();
		}
		if ($col_182.equalsIgnoreCase(name)) {
			return col_182();
		}
		if ($col_183.equalsIgnoreCase(name)) {
			return col_183();
		}
		if ($col_184.equalsIgnoreCase(name)) {
			return col_184();
		}
		if ($col_185.equalsIgnoreCase(name)) {
			return col_185();
		}
		if ($col_186.equalsIgnoreCase(name)) {
			return col_186();
		}
		if ($col_187.equalsIgnoreCase(name)) {
			return col_187();
		}
		if ($col_188.equalsIgnoreCase(name)) {
			return col_188();
		}
		if ($col_189.equalsIgnoreCase(name)) {
			return col_189();
		}
		if ($col_190.equalsIgnoreCase(name)) {
			return col_190();
		}
		if ($col_191.equalsIgnoreCase(name)) {
			return col_191();
		}
		if ($col_192.equalsIgnoreCase(name)) {
			return col_192();
		}
		if ($col_193.equalsIgnoreCase(name)) {
			return col_193();
		}
		if ($col_194.equalsIgnoreCase(name)) {
			return col_194();
		}
		if ($col_195.equalsIgnoreCase(name)) {
			return col_195();
		}
		if ($col_196.equalsIgnoreCase(name)) {
			return col_196();
		}
		if ($col_197.equalsIgnoreCase(name)) {
			return col_197();
		}
		if ($col_198.equalsIgnoreCase(name)) {
			return col_198();
		}
		if ($col_199.equalsIgnoreCase(name)) {
			return col_199();
		}
		if ($col_200.equalsIgnoreCase(name)) {
			return col_200();
		}
		if ($col_201.equalsIgnoreCase(name)) {
			return col_201();
		}
		if ($col_202.equalsIgnoreCase(name)) {
			return col_202();
		}
		if ($col_203.equalsIgnoreCase(name)) {
			return col_203();
		}
		if ($col_204.equalsIgnoreCase(name)) {
			return col_204();
		}
		if ($col_205.equalsIgnoreCase(name)) {
			return col_205();
		}
		if ($col_206.equalsIgnoreCase(name)) {
			return col_206();
		}
		if ($col_207.equalsIgnoreCase(name)) {
			return col_207();
		}
		if ($col_208.equalsIgnoreCase(name)) {
			return col_208();
		}
		if ($col_209.equalsIgnoreCase(name)) {
			return col_209();
		}
		if ($col_210.equalsIgnoreCase(name)) {
			return col_210();
		}
		if ($col_211.equalsIgnoreCase(name)) {
			return col_211();
		}
		if ($col_212.equalsIgnoreCase(name)) {
			return col_212();
		}
		if ($col_213.equalsIgnoreCase(name)) {
			return col_213();
		}
		if ($col_214.equalsIgnoreCase(name)) {
			return col_214();
		}
		if ($col_215.equalsIgnoreCase(name)) {
			return col_215();
		}
		if ($col_216.equalsIgnoreCase(name)) {
			return col_216();
		}
		if ($col_217.equalsIgnoreCase(name)) {
			return col_217();
		}
		if ($col_218.equalsIgnoreCase(name)) {
			return col_218();
		}
		if ($col_219.equalsIgnoreCase(name)) {
			return col_219();
		}
		if ($col_220.equalsIgnoreCase(name)) {
			return col_220();
		}
		if ($col_221.equalsIgnoreCase(name)) {
			return col_221();
		}
		if ($col_222.equalsIgnoreCase(name)) {
			return col_222();
		}
		if ($col_223.equalsIgnoreCase(name)) {
			return col_223();
		}
		if ($col_224.equalsIgnoreCase(name)) {
			return col_224();
		}
		if ($col_225.equalsIgnoreCase(name)) {
			return col_225();
		}
		if ($col_226.equalsIgnoreCase(name)) {
			return col_226();
		}
		if ($col_227.equalsIgnoreCase(name)) {
			return col_227();
		}
		if ($col_228.equalsIgnoreCase(name)) {
			return col_228();
		}
		if ($col_229.equalsIgnoreCase(name)) {
			return col_229();
		}
		if ($col_230.equalsIgnoreCase(name)) {
			return col_230();
		}
		if ($col_231.equalsIgnoreCase(name)) {
			return col_231();
		}
		if ($col_232.equalsIgnoreCase(name)) {
			return col_232();
		}
		if ($col_233.equalsIgnoreCase(name)) {
			return col_233();
		}
		if ($col_234.equalsIgnoreCase(name)) {
			return col_234();
		}
		if ($col_235.equalsIgnoreCase(name)) {
			return col_235();
		}
		if ($col_236.equalsIgnoreCase(name)) {
			return col_236();
		}
		if ($col_237.equalsIgnoreCase(name)) {
			return col_237();
		}
		if ($col_238.equalsIgnoreCase(name)) {
			return col_238();
		}
		if ($col_239.equalsIgnoreCase(name)) {
			return col_239();
		}
		if ($col_240.equalsIgnoreCase(name)) {
			return col_240();
		}
		if ($col_241.equalsIgnoreCase(name)) {
			return col_241();
		}
		if ($col_242.equalsIgnoreCase(name)) {
			return col_242();
		}
		if ($col_243.equalsIgnoreCase(name)) {
			return col_243();
		}
		if ($col_244.equalsIgnoreCase(name)) {
			return col_244();
		}
		if ($col_245.equalsIgnoreCase(name)) {
			return col_245();
		}
		if ($col_246.equalsIgnoreCase(name)) {
			return col_246();
		}
		if ($col_247.equalsIgnoreCase(name)) {
			return col_247();
		}
		if ($col_248.equalsIgnoreCase(name)) {
			return col_248();
		}
		if ($col_249.equalsIgnoreCase(name)) {
			return col_249();
		}
		if ($col_250.equalsIgnoreCase(name)) {
			return col_250();
		}
		if ($col_251.equalsIgnoreCase(name)) {
			return col_251();
		}
		if ($col_252.equalsIgnoreCase(name)) {
			return col_252();
		}
		if ($col_253.equalsIgnoreCase(name)) {
			return col_253();
		}
		if ($col_254.equalsIgnoreCase(name)) {
			return col_254();
		}
		if ($col_255.equalsIgnoreCase(name)) {
			return col_255();
		}
		if ($col_256.equalsIgnoreCase(name)) {
			return col_256();
		}
		if ($col_257.equalsIgnoreCase(name)) {
			return col_257();
		}
		if ($col_258.equalsIgnoreCase(name)) {
			return col_258();
		}
		if ($col_259.equalsIgnoreCase(name)) {
			return col_259();
		}
		if ($col_260.equalsIgnoreCase(name)) {
			return col_260();
		}
		if ($col_261.equalsIgnoreCase(name)) {
			return col_261();
		}
		if ($col_262.equalsIgnoreCase(name)) {
			return col_262();
		}
		if ($col_263.equalsIgnoreCase(name)) {
			return col_263();
		}
		if ($col_264.equalsIgnoreCase(name)) {
			return col_264();
		}
		if ($col_265.equalsIgnoreCase(name)) {
			return col_265();
		}
		if ($col_266.equalsIgnoreCase(name)) {
			return col_266();
		}
		if ($col_267.equalsIgnoreCase(name)) {
			return col_267();
		}
		if ($col_268.equalsIgnoreCase(name)) {
			return col_268();
		}
		if ($col_269.equalsIgnoreCase(name)) {
			return col_269();
		}
		if ($col_270.equalsIgnoreCase(name)) {
			return col_270();
		}
		if ($col_271.equalsIgnoreCase(name)) {
			return col_271();
		}
		if ($col_272.equalsIgnoreCase(name)) {
			return col_272();
		}
		if ($col_273.equalsIgnoreCase(name)) {
			return col_273();
		}
		if ($col_274.equalsIgnoreCase(name)) {
			return col_274();
		}
		if ($col_275.equalsIgnoreCase(name)) {
			return col_275();
		}
		if ($col_276.equalsIgnoreCase(name)) {
			return col_276();
		}
		if ($col_277.equalsIgnoreCase(name)) {
			return col_277();
		}
		if ($col_278.equalsIgnoreCase(name)) {
			return col_278();
		}
		if ($col_279.equalsIgnoreCase(name)) {
			return col_279();
		}
		if ($col_280.equalsIgnoreCase(name)) {
			return col_280();
		}
		if ($col_281.equalsIgnoreCase(name)) {
			return col_281();
		}
		if ($col_282.equalsIgnoreCase(name)) {
			return col_282();
		}
		if ($col_283.equalsIgnoreCase(name)) {
			return col_283();
		}
		if ($col_284.equalsIgnoreCase(name)) {
			return col_284();
		}
		if ($col_285.equalsIgnoreCase(name)) {
			return col_285();
		}
		if ($col_286.equalsIgnoreCase(name)) {
			return col_286();
		}
		if ($col_287.equalsIgnoreCase(name)) {
			return col_287();
		}
		if ($col_288.equalsIgnoreCase(name)) {
			return col_288();
		}
		if ($col_289.equalsIgnoreCase(name)) {
			return col_289();
		}
		if ($col_290.equalsIgnoreCase(name)) {
			return col_290();
		}
		if ($col_291.equalsIgnoreCase(name)) {
			return col_291();
		}
		if ($col_292.equalsIgnoreCase(name)) {
			return col_292();
		}
		if ($col_293.equalsIgnoreCase(name)) {
			return col_293();
		}
		if ($col_294.equalsIgnoreCase(name)) {
			return col_294();
		}
		if ($col_295.equalsIgnoreCase(name)) {
			return col_295();
		}
		if ($col_296.equalsIgnoreCase(name)) {
			return col_296();
		}
		if ($col_297.equalsIgnoreCase(name)) {
			return col_297();
		}
		if ($col_298.equalsIgnoreCase(name)) {
			return col_298();
		}
		if ($col_299.equalsIgnoreCase(name)) {
			return col_299();
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
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			return wk_cost_nm();
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			return wk_cost_unit_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($diff_ttl.equalsIgnoreCase(name)) {
			return diff_ttl();
		}
		if ($std_ttl.equalsIgnoreCase(name)) {
			return std_ttl();
		}
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		if ($diff_var_cost.equalsIgnoreCase(name)) {
			return diff_var_cost();
		}
		if ($std_var_cost.equalsIgnoreCase(name)) {
			return std_var_cost();
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			return var_cost();
		}
		if ($diff_fxd_cost.equalsIgnoreCase(name)) {
			return diff_fxd_cost();
		}
		if ($std_fxd_cost.equalsIgnoreCase(name)) {
			return std_fxd_cost();
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
		if ($col_105.equalsIgnoreCase(name)) {
			return col_105();
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
		if ($col_112.equalsIgnoreCase(name)) {
			return col_112();
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
		if ($col_119.equalsIgnoreCase(name)) {
			return col_119();
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
		if ($col_126.equalsIgnoreCase(name)) {
			return col_126();
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
		if ($col_133.equalsIgnoreCase(name)) {
			return col_133();
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
		if ($col_140.equalsIgnoreCase(name)) {
			return col_140();
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
		if ($col_147.equalsIgnoreCase(name)) {
			return col_147();
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
		if ($col_154.equalsIgnoreCase(name)) {
			return col_154();
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
		if ($col_161.equalsIgnoreCase(name)) {
			return col_161();
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
		if ($col_168.equalsIgnoreCase(name)) {
			return col_168();
		}
		if ($col_169.equalsIgnoreCase(name)) {
			return col_169();
		}
		if ($col_170.equalsIgnoreCase(name)) {
			return col_170();
		}
		if ($col_171.equalsIgnoreCase(name)) {
			return col_171();
		}
		if ($col_172.equalsIgnoreCase(name)) {
			return col_172();
		}
		if ($col_173.equalsIgnoreCase(name)) {
			return col_173();
		}
		if ($col_174.equalsIgnoreCase(name)) {
			return col_174();
		}
		if ($col_175.equalsIgnoreCase(name)) {
			return col_175();
		}
		if ($col_176.equalsIgnoreCase(name)) {
			return col_176();
		}
		if ($col_177.equalsIgnoreCase(name)) {
			return col_177();
		}
		if ($col_178.equalsIgnoreCase(name)) {
			return col_178();
		}
		if ($col_179.equalsIgnoreCase(name)) {
			return col_179();
		}
		if ($col_180.equalsIgnoreCase(name)) {
			return col_180();
		}
		if ($col_181.equalsIgnoreCase(name)) {
			return col_181();
		}
		if ($col_182.equalsIgnoreCase(name)) {
			return col_182();
		}
		if ($col_183.equalsIgnoreCase(name)) {
			return col_183();
		}
		if ($col_184.equalsIgnoreCase(name)) {
			return col_184();
		}
		if ($col_185.equalsIgnoreCase(name)) {
			return col_185();
		}
		if ($col_186.equalsIgnoreCase(name)) {
			return col_186();
		}
		if ($col_187.equalsIgnoreCase(name)) {
			return col_187();
		}
		if ($col_188.equalsIgnoreCase(name)) {
			return col_188();
		}
		if ($col_189.equalsIgnoreCase(name)) {
			return col_189();
		}
		if ($col_190.equalsIgnoreCase(name)) {
			return col_190();
		}
		if ($col_191.equalsIgnoreCase(name)) {
			return col_191();
		}
		if ($col_192.equalsIgnoreCase(name)) {
			return col_192();
		}
		if ($col_193.equalsIgnoreCase(name)) {
			return col_193();
		}
		if ($col_194.equalsIgnoreCase(name)) {
			return col_194();
		}
		if ($col_195.equalsIgnoreCase(name)) {
			return col_195();
		}
		if ($col_196.equalsIgnoreCase(name)) {
			return col_196();
		}
		if ($col_197.equalsIgnoreCase(name)) {
			return col_197();
		}
		if ($col_198.equalsIgnoreCase(name)) {
			return col_198();
		}
		if ($col_199.equalsIgnoreCase(name)) {
			return col_199();
		}
		if ($col_200.equalsIgnoreCase(name)) {
			return col_200();
		}
		if ($col_201.equalsIgnoreCase(name)) {
			return col_201();
		}
		if ($col_202.equalsIgnoreCase(name)) {
			return col_202();
		}
		if ($col_203.equalsIgnoreCase(name)) {
			return col_203();
		}
		if ($col_204.equalsIgnoreCase(name)) {
			return col_204();
		}
		if ($col_205.equalsIgnoreCase(name)) {
			return col_205();
		}
		if ($col_206.equalsIgnoreCase(name)) {
			return col_206();
		}
		if ($col_207.equalsIgnoreCase(name)) {
			return col_207();
		}
		if ($col_208.equalsIgnoreCase(name)) {
			return col_208();
		}
		if ($col_209.equalsIgnoreCase(name)) {
			return col_209();
		}
		if ($col_210.equalsIgnoreCase(name)) {
			return col_210();
		}
		if ($col_211.equalsIgnoreCase(name)) {
			return col_211();
		}
		if ($col_212.equalsIgnoreCase(name)) {
			return col_212();
		}
		if ($col_213.equalsIgnoreCase(name)) {
			return col_213();
		}
		if ($col_214.equalsIgnoreCase(name)) {
			return col_214();
		}
		if ($col_215.equalsIgnoreCase(name)) {
			return col_215();
		}
		if ($col_216.equalsIgnoreCase(name)) {
			return col_216();
		}
		if ($col_217.equalsIgnoreCase(name)) {
			return col_217();
		}
		if ($col_218.equalsIgnoreCase(name)) {
			return col_218();
		}
		if ($col_219.equalsIgnoreCase(name)) {
			return col_219();
		}
		if ($col_220.equalsIgnoreCase(name)) {
			return col_220();
		}
		if ($col_221.equalsIgnoreCase(name)) {
			return col_221();
		}
		if ($col_222.equalsIgnoreCase(name)) {
			return col_222();
		}
		if ($col_223.equalsIgnoreCase(name)) {
			return col_223();
		}
		if ($col_224.equalsIgnoreCase(name)) {
			return col_224();
		}
		if ($col_225.equalsIgnoreCase(name)) {
			return col_225();
		}
		if ($col_226.equalsIgnoreCase(name)) {
			return col_226();
		}
		if ($col_227.equalsIgnoreCase(name)) {
			return col_227();
		}
		if ($col_228.equalsIgnoreCase(name)) {
			return col_228();
		}
		if ($col_229.equalsIgnoreCase(name)) {
			return col_229();
		}
		if ($col_230.equalsIgnoreCase(name)) {
			return col_230();
		}
		if ($col_231.equalsIgnoreCase(name)) {
			return col_231();
		}
		if ($col_232.equalsIgnoreCase(name)) {
			return col_232();
		}
		if ($col_233.equalsIgnoreCase(name)) {
			return col_233();
		}
		if ($col_234.equalsIgnoreCase(name)) {
			return col_234();
		}
		if ($col_235.equalsIgnoreCase(name)) {
			return col_235();
		}
		if ($col_236.equalsIgnoreCase(name)) {
			return col_236();
		}
		if ($col_237.equalsIgnoreCase(name)) {
			return col_237();
		}
		if ($col_238.equalsIgnoreCase(name)) {
			return col_238();
		}
		if ($col_239.equalsIgnoreCase(name)) {
			return col_239();
		}
		if ($col_240.equalsIgnoreCase(name)) {
			return col_240();
		}
		if ($col_241.equalsIgnoreCase(name)) {
			return col_241();
		}
		if ($col_242.equalsIgnoreCase(name)) {
			return col_242();
		}
		if ($col_243.equalsIgnoreCase(name)) {
			return col_243();
		}
		if ($col_244.equalsIgnoreCase(name)) {
			return col_244();
		}
		if ($col_245.equalsIgnoreCase(name)) {
			return col_245();
		}
		if ($col_246.equalsIgnoreCase(name)) {
			return col_246();
		}
		if ($col_247.equalsIgnoreCase(name)) {
			return col_247();
		}
		if ($col_248.equalsIgnoreCase(name)) {
			return col_248();
		}
		if ($col_249.equalsIgnoreCase(name)) {
			return col_249();
		}
		if ($col_250.equalsIgnoreCase(name)) {
			return col_250();
		}
		if ($col_251.equalsIgnoreCase(name)) {
			return col_251();
		}
		if ($col_252.equalsIgnoreCase(name)) {
			return col_252();
		}
		if ($col_253.equalsIgnoreCase(name)) {
			return col_253();
		}
		if ($col_254.equalsIgnoreCase(name)) {
			return col_254();
		}
		if ($col_255.equalsIgnoreCase(name)) {
			return col_255();
		}
		if ($col_256.equalsIgnoreCase(name)) {
			return col_256();
		}
		if ($col_257.equalsIgnoreCase(name)) {
			return col_257();
		}
		if ($col_258.equalsIgnoreCase(name)) {
			return col_258();
		}
		if ($col_259.equalsIgnoreCase(name)) {
			return col_259();
		}
		if ($col_260.equalsIgnoreCase(name)) {
			return col_260();
		}
		if ($col_261.equalsIgnoreCase(name)) {
			return col_261();
		}
		if ($col_262.equalsIgnoreCase(name)) {
			return col_262();
		}
		if ($col_263.equalsIgnoreCase(name)) {
			return col_263();
		}
		if ($col_264.equalsIgnoreCase(name)) {
			return col_264();
		}
		if ($col_265.equalsIgnoreCase(name)) {
			return col_265();
		}
		if ($col_266.equalsIgnoreCase(name)) {
			return col_266();
		}
		if ($col_267.equalsIgnoreCase(name)) {
			return col_267();
		}
		if ($col_268.equalsIgnoreCase(name)) {
			return col_268();
		}
		if ($col_269.equalsIgnoreCase(name)) {
			return col_269();
		}
		if ($col_270.equalsIgnoreCase(name)) {
			return col_270();
		}
		if ($col_271.equalsIgnoreCase(name)) {
			return col_271();
		}
		if ($col_272.equalsIgnoreCase(name)) {
			return col_272();
		}
		if ($col_273.equalsIgnoreCase(name)) {
			return col_273();
		}
		if ($col_274.equalsIgnoreCase(name)) {
			return col_274();
		}
		if ($col_275.equalsIgnoreCase(name)) {
			return col_275();
		}
		if ($col_276.equalsIgnoreCase(name)) {
			return col_276();
		}
		if ($col_277.equalsIgnoreCase(name)) {
			return col_277();
		}
		if ($col_278.equalsIgnoreCase(name)) {
			return col_278();
		}
		if ($col_279.equalsIgnoreCase(name)) {
			return col_279();
		}
		if ($col_280.equalsIgnoreCase(name)) {
			return col_280();
		}
		if ($col_281.equalsIgnoreCase(name)) {
			return col_281();
		}
		if ($col_282.equalsIgnoreCase(name)) {
			return col_282();
		}
		if ($col_283.equalsIgnoreCase(name)) {
			return col_283();
		}
		if ($col_284.equalsIgnoreCase(name)) {
			return col_284();
		}
		if ($col_285.equalsIgnoreCase(name)) {
			return col_285();
		}
		if ($col_286.equalsIgnoreCase(name)) {
			return col_286();
		}
		if ($col_287.equalsIgnoreCase(name)) {
			return col_287();
		}
		if ($col_288.equalsIgnoreCase(name)) {
			return col_288();
		}
		if ($col_289.equalsIgnoreCase(name)) {
			return col_289();
		}
		if ($col_290.equalsIgnoreCase(name)) {
			return col_290();
		}
		if ($col_291.equalsIgnoreCase(name)) {
			return col_291();
		}
		if ($col_292.equalsIgnoreCase(name)) {
			return col_292();
		}
		if ($col_293.equalsIgnoreCase(name)) {
			return col_293();
		}
		if ($col_294.equalsIgnoreCase(name)) {
			return col_294();
		}
		if ($col_295.equalsIgnoreCase(name)) {
			return col_295();
		}
		if ($col_296.equalsIgnoreCase(name)) {
			return col_296();
		}
		if ($col_297.equalsIgnoreCase(name)) {
			return col_297();
		}
		if ($col_298.equalsIgnoreCase(name)) {
			return col_298();
		}
		if ($col_299.equalsIgnoreCase(name)) {
			return col_299();
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
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			wk_cost_nm(value);
			return;
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			wk_cost_unit_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($diff_ttl.equalsIgnoreCase(name)) {
			diff_ttl(value);
			return;
		}
		if ($std_ttl.equalsIgnoreCase(name)) {
			std_ttl(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($diff_var_cost.equalsIgnoreCase(name)) {
			diff_var_cost(value);
			return;
		}
		if ($std_var_cost.equalsIgnoreCase(name)) {
			std_var_cost(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($diff_fxd_cost.equalsIgnoreCase(name)) {
			diff_fxd_cost(value);
			return;
		}
		if ($std_fxd_cost.equalsIgnoreCase(name)) {
			std_fxd_cost(value);
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
		if ($col_105.equalsIgnoreCase(name)) {
			col_105(value);
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
		if ($col_112.equalsIgnoreCase(name)) {
			col_112(value);
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
		if ($col_119.equalsIgnoreCase(name)) {
			col_119(value);
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
		if ($col_126.equalsIgnoreCase(name)) {
			col_126(value);
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
		if ($col_133.equalsIgnoreCase(name)) {
			col_133(value);
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
		if ($col_140.equalsIgnoreCase(name)) {
			col_140(value);
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
		if ($col_147.equalsIgnoreCase(name)) {
			col_147(value);
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
		if ($col_154.equalsIgnoreCase(name)) {
			col_154(value);
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
		if ($col_161.equalsIgnoreCase(name)) {
			col_161(value);
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
		if ($col_168.equalsIgnoreCase(name)) {
			col_168(value);
			return;
		}
		if ($col_169.equalsIgnoreCase(name)) {
			col_169(value);
			return;
		}
		if ($col_170.equalsIgnoreCase(name)) {
			col_170(value);
			return;
		}
		if ($col_171.equalsIgnoreCase(name)) {
			col_171(value);
			return;
		}
		if ($col_172.equalsIgnoreCase(name)) {
			col_172(value);
			return;
		}
		if ($col_173.equalsIgnoreCase(name)) {
			col_173(value);
			return;
		}
		if ($col_174.equalsIgnoreCase(name)) {
			col_174(value);
			return;
		}
		if ($col_175.equalsIgnoreCase(name)) {
			col_175(value);
			return;
		}
		if ($col_176.equalsIgnoreCase(name)) {
			col_176(value);
			return;
		}
		if ($col_177.equalsIgnoreCase(name)) {
			col_177(value);
			return;
		}
		if ($col_178.equalsIgnoreCase(name)) {
			col_178(value);
			return;
		}
		if ($col_179.equalsIgnoreCase(name)) {
			col_179(value);
			return;
		}
		if ($col_180.equalsIgnoreCase(name)) {
			col_180(value);
			return;
		}
		if ($col_181.equalsIgnoreCase(name)) {
			col_181(value);
			return;
		}
		if ($col_182.equalsIgnoreCase(name)) {
			col_182(value);
			return;
		}
		if ($col_183.equalsIgnoreCase(name)) {
			col_183(value);
			return;
		}
		if ($col_184.equalsIgnoreCase(name)) {
			col_184(value);
			return;
		}
		if ($col_185.equalsIgnoreCase(name)) {
			col_185(value);
			return;
		}
		if ($col_186.equalsIgnoreCase(name)) {
			col_186(value);
			return;
		}
		if ($col_187.equalsIgnoreCase(name)) {
			col_187(value);
			return;
		}
		if ($col_188.equalsIgnoreCase(name)) {
			col_188(value);
			return;
		}
		if ($col_189.equalsIgnoreCase(name)) {
			col_189(value);
			return;
		}
		if ($col_190.equalsIgnoreCase(name)) {
			col_190(value);
			return;
		}
		if ($col_191.equalsIgnoreCase(name)) {
			col_191(value);
			return;
		}
		if ($col_192.equalsIgnoreCase(name)) {
			col_192(value);
			return;
		}
		if ($col_193.equalsIgnoreCase(name)) {
			col_193(value);
			return;
		}
		if ($col_194.equalsIgnoreCase(name)) {
			col_194(value);
			return;
		}
		if ($col_195.equalsIgnoreCase(name)) {
			col_195(value);
			return;
		}
		if ($col_196.equalsIgnoreCase(name)) {
			col_196(value);
			return;
		}
		if ($col_197.equalsIgnoreCase(name)) {
			col_197(value);
			return;
		}
		if ($col_198.equalsIgnoreCase(name)) {
			col_198(value);
			return;
		}
		if ($col_199.equalsIgnoreCase(name)) {
			col_199(value);
			return;
		}
		if ($col_200.equalsIgnoreCase(name)) {
			col_200(value);
			return;
		}
		if ($col_201.equalsIgnoreCase(name)) {
			col_201(value);
			return;
		}
		if ($col_202.equalsIgnoreCase(name)) {
			col_202(value);
			return;
		}
		if ($col_203.equalsIgnoreCase(name)) {
			col_203(value);
			return;
		}
		if ($col_204.equalsIgnoreCase(name)) {
			col_204(value);
			return;
		}
		if ($col_205.equalsIgnoreCase(name)) {
			col_205(value);
			return;
		}
		if ($col_206.equalsIgnoreCase(name)) {
			col_206(value);
			return;
		}
		if ($col_207.equalsIgnoreCase(name)) {
			col_207(value);
			return;
		}
		if ($col_208.equalsIgnoreCase(name)) {
			col_208(value);
			return;
		}
		if ($col_209.equalsIgnoreCase(name)) {
			col_209(value);
			return;
		}
		if ($col_210.equalsIgnoreCase(name)) {
			col_210(value);
			return;
		}
		if ($col_211.equalsIgnoreCase(name)) {
			col_211(value);
			return;
		}
		if ($col_212.equalsIgnoreCase(name)) {
			col_212(value);
			return;
		}
		if ($col_213.equalsIgnoreCase(name)) {
			col_213(value);
			return;
		}
		if ($col_214.equalsIgnoreCase(name)) {
			col_214(value);
			return;
		}
		if ($col_215.equalsIgnoreCase(name)) {
			col_215(value);
			return;
		}
		if ($col_216.equalsIgnoreCase(name)) {
			col_216(value);
			return;
		}
		if ($col_217.equalsIgnoreCase(name)) {
			col_217(value);
			return;
		}
		if ($col_218.equalsIgnoreCase(name)) {
			col_218(value);
			return;
		}
		if ($col_219.equalsIgnoreCase(name)) {
			col_219(value);
			return;
		}
		if ($col_220.equalsIgnoreCase(name)) {
			col_220(value);
			return;
		}
		if ($col_221.equalsIgnoreCase(name)) {
			col_221(value);
			return;
		}
		if ($col_222.equalsIgnoreCase(name)) {
			col_222(value);
			return;
		}
		if ($col_223.equalsIgnoreCase(name)) {
			col_223(value);
			return;
		}
		if ($col_224.equalsIgnoreCase(name)) {
			col_224(value);
			return;
		}
		if ($col_225.equalsIgnoreCase(name)) {
			col_225(value);
			return;
		}
		if ($col_226.equalsIgnoreCase(name)) {
			col_226(value);
			return;
		}
		if ($col_227.equalsIgnoreCase(name)) {
			col_227(value);
			return;
		}
		if ($col_228.equalsIgnoreCase(name)) {
			col_228(value);
			return;
		}
		if ($col_229.equalsIgnoreCase(name)) {
			col_229(value);
			return;
		}
		if ($col_230.equalsIgnoreCase(name)) {
			col_230(value);
			return;
		}
		if ($col_231.equalsIgnoreCase(name)) {
			col_231(value);
			return;
		}
		if ($col_232.equalsIgnoreCase(name)) {
			col_232(value);
			return;
		}
		if ($col_233.equalsIgnoreCase(name)) {
			col_233(value);
			return;
		}
		if ($col_234.equalsIgnoreCase(name)) {
			col_234(value);
			return;
		}
		if ($col_235.equalsIgnoreCase(name)) {
			col_235(value);
			return;
		}
		if ($col_236.equalsIgnoreCase(name)) {
			col_236(value);
			return;
		}
		if ($col_237.equalsIgnoreCase(name)) {
			col_237(value);
			return;
		}
		if ($col_238.equalsIgnoreCase(name)) {
			col_238(value);
			return;
		}
		if ($col_239.equalsIgnoreCase(name)) {
			col_239(value);
			return;
		}
		if ($col_240.equalsIgnoreCase(name)) {
			col_240(value);
			return;
		}
		if ($col_241.equalsIgnoreCase(name)) {
			col_241(value);
			return;
		}
		if ($col_242.equalsIgnoreCase(name)) {
			col_242(value);
			return;
		}
		if ($col_243.equalsIgnoreCase(name)) {
			col_243(value);
			return;
		}
		if ($col_244.equalsIgnoreCase(name)) {
			col_244(value);
			return;
		}
		if ($col_245.equalsIgnoreCase(name)) {
			col_245(value);
			return;
		}
		if ($col_246.equalsIgnoreCase(name)) {
			col_246(value);
			return;
		}
		if ($col_247.equalsIgnoreCase(name)) {
			col_247(value);
			return;
		}
		if ($col_248.equalsIgnoreCase(name)) {
			col_248(value);
			return;
		}
		if ($col_249.equalsIgnoreCase(name)) {
			col_249(value);
			return;
		}
		if ($col_250.equalsIgnoreCase(name)) {
			col_250(value);
			return;
		}
		if ($col_251.equalsIgnoreCase(name)) {
			col_251(value);
			return;
		}
		if ($col_252.equalsIgnoreCase(name)) {
			col_252(value);
			return;
		}
		if ($col_253.equalsIgnoreCase(name)) {
			col_253(value);
			return;
		}
		if ($col_254.equalsIgnoreCase(name)) {
			col_254(value);
			return;
		}
		if ($col_255.equalsIgnoreCase(name)) {
			col_255(value);
			return;
		}
		if ($col_256.equalsIgnoreCase(name)) {
			col_256(value);
			return;
		}
		if ($col_257.equalsIgnoreCase(name)) {
			col_257(value);
			return;
		}
		if ($col_258.equalsIgnoreCase(name)) {
			col_258(value);
			return;
		}
		if ($col_259.equalsIgnoreCase(name)) {
			col_259(value);
			return;
		}
		if ($col_260.equalsIgnoreCase(name)) {
			col_260(value);
			return;
		}
		if ($col_261.equalsIgnoreCase(name)) {
			col_261(value);
			return;
		}
		if ($col_262.equalsIgnoreCase(name)) {
			col_262(value);
			return;
		}
		if ($col_263.equalsIgnoreCase(name)) {
			col_263(value);
			return;
		}
		if ($col_264.equalsIgnoreCase(name)) {
			col_264(value);
			return;
		}
		if ($col_265.equalsIgnoreCase(name)) {
			col_265(value);
			return;
		}
		if ($col_266.equalsIgnoreCase(name)) {
			col_266(value);
			return;
		}
		if ($col_267.equalsIgnoreCase(name)) {
			col_267(value);
			return;
		}
		if ($col_268.equalsIgnoreCase(name)) {
			col_268(value);
			return;
		}
		if ($col_269.equalsIgnoreCase(name)) {
			col_269(value);
			return;
		}
		if ($col_270.equalsIgnoreCase(name)) {
			col_270(value);
			return;
		}
		if ($col_271.equalsIgnoreCase(name)) {
			col_271(value);
			return;
		}
		if ($col_272.equalsIgnoreCase(name)) {
			col_272(value);
			return;
		}
		if ($col_273.equalsIgnoreCase(name)) {
			col_273(value);
			return;
		}
		if ($col_274.equalsIgnoreCase(name)) {
			col_274(value);
			return;
		}
		if ($col_275.equalsIgnoreCase(name)) {
			col_275(value);
			return;
		}
		if ($col_276.equalsIgnoreCase(name)) {
			col_276(value);
			return;
		}
		if ($col_277.equalsIgnoreCase(name)) {
			col_277(value);
			return;
		}
		if ($col_278.equalsIgnoreCase(name)) {
			col_278(value);
			return;
		}
		if ($col_279.equalsIgnoreCase(name)) {
			col_279(value);
			return;
		}
		if ($col_280.equalsIgnoreCase(name)) {
			col_280(value);
			return;
		}
		if ($col_281.equalsIgnoreCase(name)) {
			col_281(value);
			return;
		}
		if ($col_282.equalsIgnoreCase(name)) {
			col_282(value);
			return;
		}
		if ($col_283.equalsIgnoreCase(name)) {
			col_283(value);
			return;
		}
		if ($col_284.equalsIgnoreCase(name)) {
			col_284(value);
			return;
		}
		if ($col_285.equalsIgnoreCase(name)) {
			col_285(value);
			return;
		}
		if ($col_286.equalsIgnoreCase(name)) {
			col_286(value);
			return;
		}
		if ($col_287.equalsIgnoreCase(name)) {
			col_287(value);
			return;
		}
		if ($col_288.equalsIgnoreCase(name)) {
			col_288(value);
			return;
		}
		if ($col_289.equalsIgnoreCase(name)) {
			col_289(value);
			return;
		}
		if ($col_290.equalsIgnoreCase(name)) {
			col_290(value);
			return;
		}
		if ($col_291.equalsIgnoreCase(name)) {
			col_291(value);
			return;
		}
		if ($col_292.equalsIgnoreCase(name)) {
			col_292(value);
			return;
		}
		if ($col_293.equalsIgnoreCase(name)) {
			col_293(value);
			return;
		}
		if ($col_294.equalsIgnoreCase(name)) {
			col_294(value);
			return;
		}
		if ($col_295.equalsIgnoreCase(name)) {
			col_295(value);
			return;
		}
		if ($col_296.equalsIgnoreCase(name)) {
			col_296(value);
			return;
		}
		if ($col_297.equalsIgnoreCase(name)) {
			col_297(value);
			return;
		}
		if ($col_298.equalsIgnoreCase(name)) {
			col_298(value);
			return;
		}
		if ($col_299.equalsIgnoreCase(name)) {
			col_299(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($diff_ttl.equalsIgnoreCase(name)) {
			diff_ttl(value);
			return;
		}
		if ($std_ttl.equalsIgnoreCase(name)) {
			std_ttl(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($diff_var_cost.equalsIgnoreCase(name)) {
			diff_var_cost(value);
			return;
		}
		if ($std_var_cost.equalsIgnoreCase(name)) {
			std_var_cost(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($diff_fxd_cost.equalsIgnoreCase(name)) {
			diff_fxd_cost(value);
			return;
		}
		if ($std_fxd_cost.equalsIgnoreCase(name)) {
			std_fxd_cost(value);
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
		if ($col_105.equalsIgnoreCase(name)) {
			col_105(value);
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
		if ($col_112.equalsIgnoreCase(name)) {
			col_112(value);
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
		if ($col_119.equalsIgnoreCase(name)) {
			col_119(value);
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
		if ($col_126.equalsIgnoreCase(name)) {
			col_126(value);
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
		if ($col_133.equalsIgnoreCase(name)) {
			col_133(value);
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
		if ($col_140.equalsIgnoreCase(name)) {
			col_140(value);
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
		if ($col_147.equalsIgnoreCase(name)) {
			col_147(value);
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
		if ($col_154.equalsIgnoreCase(name)) {
			col_154(value);
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
		if ($col_161.equalsIgnoreCase(name)) {
			col_161(value);
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
		if ($col_168.equalsIgnoreCase(name)) {
			col_168(value);
			return;
		}
		if ($col_169.equalsIgnoreCase(name)) {
			col_169(value);
			return;
		}
		if ($col_170.equalsIgnoreCase(name)) {
			col_170(value);
			return;
		}
		if ($col_171.equalsIgnoreCase(name)) {
			col_171(value);
			return;
		}
		if ($col_172.equalsIgnoreCase(name)) {
			col_172(value);
			return;
		}
		if ($col_173.equalsIgnoreCase(name)) {
			col_173(value);
			return;
		}
		if ($col_174.equalsIgnoreCase(name)) {
			col_174(value);
			return;
		}
		if ($col_175.equalsIgnoreCase(name)) {
			col_175(value);
			return;
		}
		if ($col_176.equalsIgnoreCase(name)) {
			col_176(value);
			return;
		}
		if ($col_177.equalsIgnoreCase(name)) {
			col_177(value);
			return;
		}
		if ($col_178.equalsIgnoreCase(name)) {
			col_178(value);
			return;
		}
		if ($col_179.equalsIgnoreCase(name)) {
			col_179(value);
			return;
		}
		if ($col_180.equalsIgnoreCase(name)) {
			col_180(value);
			return;
		}
		if ($col_181.equalsIgnoreCase(name)) {
			col_181(value);
			return;
		}
		if ($col_182.equalsIgnoreCase(name)) {
			col_182(value);
			return;
		}
		if ($col_183.equalsIgnoreCase(name)) {
			col_183(value);
			return;
		}
		if ($col_184.equalsIgnoreCase(name)) {
			col_184(value);
			return;
		}
		if ($col_185.equalsIgnoreCase(name)) {
			col_185(value);
			return;
		}
		if ($col_186.equalsIgnoreCase(name)) {
			col_186(value);
			return;
		}
		if ($col_187.equalsIgnoreCase(name)) {
			col_187(value);
			return;
		}
		if ($col_188.equalsIgnoreCase(name)) {
			col_188(value);
			return;
		}
		if ($col_189.equalsIgnoreCase(name)) {
			col_189(value);
			return;
		}
		if ($col_190.equalsIgnoreCase(name)) {
			col_190(value);
			return;
		}
		if ($col_191.equalsIgnoreCase(name)) {
			col_191(value);
			return;
		}
		if ($col_192.equalsIgnoreCase(name)) {
			col_192(value);
			return;
		}
		if ($col_193.equalsIgnoreCase(name)) {
			col_193(value);
			return;
		}
		if ($col_194.equalsIgnoreCase(name)) {
			col_194(value);
			return;
		}
		if ($col_195.equalsIgnoreCase(name)) {
			col_195(value);
			return;
		}
		if ($col_196.equalsIgnoreCase(name)) {
			col_196(value);
			return;
		}
		if ($col_197.equalsIgnoreCase(name)) {
			col_197(value);
			return;
		}
		if ($col_198.equalsIgnoreCase(name)) {
			col_198(value);
			return;
		}
		if ($col_199.equalsIgnoreCase(name)) {
			col_199(value);
			return;
		}
		if ($col_200.equalsIgnoreCase(name)) {
			col_200(value);
			return;
		}
		if ($col_201.equalsIgnoreCase(name)) {
			col_201(value);
			return;
		}
		if ($col_202.equalsIgnoreCase(name)) {
			col_202(value);
			return;
		}
		if ($col_203.equalsIgnoreCase(name)) {
			col_203(value);
			return;
		}
		if ($col_204.equalsIgnoreCase(name)) {
			col_204(value);
			return;
		}
		if ($col_205.equalsIgnoreCase(name)) {
			col_205(value);
			return;
		}
		if ($col_206.equalsIgnoreCase(name)) {
			col_206(value);
			return;
		}
		if ($col_207.equalsIgnoreCase(name)) {
			col_207(value);
			return;
		}
		if ($col_208.equalsIgnoreCase(name)) {
			col_208(value);
			return;
		}
		if ($col_209.equalsIgnoreCase(name)) {
			col_209(value);
			return;
		}
		if ($col_210.equalsIgnoreCase(name)) {
			col_210(value);
			return;
		}
		if ($col_211.equalsIgnoreCase(name)) {
			col_211(value);
			return;
		}
		if ($col_212.equalsIgnoreCase(name)) {
			col_212(value);
			return;
		}
		if ($col_213.equalsIgnoreCase(name)) {
			col_213(value);
			return;
		}
		if ($col_214.equalsIgnoreCase(name)) {
			col_214(value);
			return;
		}
		if ($col_215.equalsIgnoreCase(name)) {
			col_215(value);
			return;
		}
		if ($col_216.equalsIgnoreCase(name)) {
			col_216(value);
			return;
		}
		if ($col_217.equalsIgnoreCase(name)) {
			col_217(value);
			return;
		}
		if ($col_218.equalsIgnoreCase(name)) {
			col_218(value);
			return;
		}
		if ($col_219.equalsIgnoreCase(name)) {
			col_219(value);
			return;
		}
		if ($col_220.equalsIgnoreCase(name)) {
			col_220(value);
			return;
		}
		if ($col_221.equalsIgnoreCase(name)) {
			col_221(value);
			return;
		}
		if ($col_222.equalsIgnoreCase(name)) {
			col_222(value);
			return;
		}
		if ($col_223.equalsIgnoreCase(name)) {
			col_223(value);
			return;
		}
		if ($col_224.equalsIgnoreCase(name)) {
			col_224(value);
			return;
		}
		if ($col_225.equalsIgnoreCase(name)) {
			col_225(value);
			return;
		}
		if ($col_226.equalsIgnoreCase(name)) {
			col_226(value);
			return;
		}
		if ($col_227.equalsIgnoreCase(name)) {
			col_227(value);
			return;
		}
		if ($col_228.equalsIgnoreCase(name)) {
			col_228(value);
			return;
		}
		if ($col_229.equalsIgnoreCase(name)) {
			col_229(value);
			return;
		}
		if ($col_230.equalsIgnoreCase(name)) {
			col_230(value);
			return;
		}
		if ($col_231.equalsIgnoreCase(name)) {
			col_231(value);
			return;
		}
		if ($col_232.equalsIgnoreCase(name)) {
			col_232(value);
			return;
		}
		if ($col_233.equalsIgnoreCase(name)) {
			col_233(value);
			return;
		}
		if ($col_234.equalsIgnoreCase(name)) {
			col_234(value);
			return;
		}
		if ($col_235.equalsIgnoreCase(name)) {
			col_235(value);
			return;
		}
		if ($col_236.equalsIgnoreCase(name)) {
			col_236(value);
			return;
		}
		if ($col_237.equalsIgnoreCase(name)) {
			col_237(value);
			return;
		}
		if ($col_238.equalsIgnoreCase(name)) {
			col_238(value);
			return;
		}
		if ($col_239.equalsIgnoreCase(name)) {
			col_239(value);
			return;
		}
		if ($col_240.equalsIgnoreCase(name)) {
			col_240(value);
			return;
		}
		if ($col_241.equalsIgnoreCase(name)) {
			col_241(value);
			return;
		}
		if ($col_242.equalsIgnoreCase(name)) {
			col_242(value);
			return;
		}
		if ($col_243.equalsIgnoreCase(name)) {
			col_243(value);
			return;
		}
		if ($col_244.equalsIgnoreCase(name)) {
			col_244(value);
			return;
		}
		if ($col_245.equalsIgnoreCase(name)) {
			col_245(value);
			return;
		}
		if ($col_246.equalsIgnoreCase(name)) {
			col_246(value);
			return;
		}
		if ($col_247.equalsIgnoreCase(name)) {
			col_247(value);
			return;
		}
		if ($col_248.equalsIgnoreCase(name)) {
			col_248(value);
			return;
		}
		if ($col_249.equalsIgnoreCase(name)) {
			col_249(value);
			return;
		}
		if ($col_250.equalsIgnoreCase(name)) {
			col_250(value);
			return;
		}
		if ($col_251.equalsIgnoreCase(name)) {
			col_251(value);
			return;
		}
		if ($col_252.equalsIgnoreCase(name)) {
			col_252(value);
			return;
		}
		if ($col_253.equalsIgnoreCase(name)) {
			col_253(value);
			return;
		}
		if ($col_254.equalsIgnoreCase(name)) {
			col_254(value);
			return;
		}
		if ($col_255.equalsIgnoreCase(name)) {
			col_255(value);
			return;
		}
		if ($col_256.equalsIgnoreCase(name)) {
			col_256(value);
			return;
		}
		if ($col_257.equalsIgnoreCase(name)) {
			col_257(value);
			return;
		}
		if ($col_258.equalsIgnoreCase(name)) {
			col_258(value);
			return;
		}
		if ($col_259.equalsIgnoreCase(name)) {
			col_259(value);
			return;
		}
		if ($col_260.equalsIgnoreCase(name)) {
			col_260(value);
			return;
		}
		if ($col_261.equalsIgnoreCase(name)) {
			col_261(value);
			return;
		}
		if ($col_262.equalsIgnoreCase(name)) {
			col_262(value);
			return;
		}
		if ($col_263.equalsIgnoreCase(name)) {
			col_263(value);
			return;
		}
		if ($col_264.equalsIgnoreCase(name)) {
			col_264(value);
			return;
		}
		if ($col_265.equalsIgnoreCase(name)) {
			col_265(value);
			return;
		}
		if ($col_266.equalsIgnoreCase(name)) {
			col_266(value);
			return;
		}
		if ($col_267.equalsIgnoreCase(name)) {
			col_267(value);
			return;
		}
		if ($col_268.equalsIgnoreCase(name)) {
			col_268(value);
			return;
		}
		if ($col_269.equalsIgnoreCase(name)) {
			col_269(value);
			return;
		}
		if ($col_270.equalsIgnoreCase(name)) {
			col_270(value);
			return;
		}
		if ($col_271.equalsIgnoreCase(name)) {
			col_271(value);
			return;
		}
		if ($col_272.equalsIgnoreCase(name)) {
			col_272(value);
			return;
		}
		if ($col_273.equalsIgnoreCase(name)) {
			col_273(value);
			return;
		}
		if ($col_274.equalsIgnoreCase(name)) {
			col_274(value);
			return;
		}
		if ($col_275.equalsIgnoreCase(name)) {
			col_275(value);
			return;
		}
		if ($col_276.equalsIgnoreCase(name)) {
			col_276(value);
			return;
		}
		if ($col_277.equalsIgnoreCase(name)) {
			col_277(value);
			return;
		}
		if ($col_278.equalsIgnoreCase(name)) {
			col_278(value);
			return;
		}
		if ($col_279.equalsIgnoreCase(name)) {
			col_279(value);
			return;
		}
		if ($col_280.equalsIgnoreCase(name)) {
			col_280(value);
			return;
		}
		if ($col_281.equalsIgnoreCase(name)) {
			col_281(value);
			return;
		}
		if ($col_282.equalsIgnoreCase(name)) {
			col_282(value);
			return;
		}
		if ($col_283.equalsIgnoreCase(name)) {
			col_283(value);
			return;
		}
		if ($col_284.equalsIgnoreCase(name)) {
			col_284(value);
			return;
		}
		if ($col_285.equalsIgnoreCase(name)) {
			col_285(value);
			return;
		}
		if ($col_286.equalsIgnoreCase(name)) {
			col_286(value);
			return;
		}
		if ($col_287.equalsIgnoreCase(name)) {
			col_287(value);
			return;
		}
		if ($col_288.equalsIgnoreCase(name)) {
			col_288(value);
			return;
		}
		if ($col_289.equalsIgnoreCase(name)) {
			col_289(value);
			return;
		}
		if ($col_290.equalsIgnoreCase(name)) {
			col_290(value);
			return;
		}
		if ($col_291.equalsIgnoreCase(name)) {
			col_291(value);
			return;
		}
		if ($col_292.equalsIgnoreCase(name)) {
			col_292(value);
			return;
		}
		if ($col_293.equalsIgnoreCase(name)) {
			col_293(value);
			return;
		}
		if ($col_294.equalsIgnoreCase(name)) {
			col_294(value);
			return;
		}
		if ($col_295.equalsIgnoreCase(name)) {
			col_295(value);
			return;
		}
		if ($col_296.equalsIgnoreCase(name)) {
			col_296(value);
			return;
		}
		if ($col_297.equalsIgnoreCase(name)) {
			col_297(value);
			return;
		}
		if ($col_298.equalsIgnoreCase(name)) {
			col_298(value);
			return;
		}
		if ($col_299.equalsIgnoreCase(name)) {
			col_299(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($diff_ttl.equalsIgnoreCase(name)) {
			diff_ttl(value);
			return;
		}
		if ($std_ttl.equalsIgnoreCase(name)) {
			std_ttl(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($diff_var_cost.equalsIgnoreCase(name)) {
			diff_var_cost(value);
			return;
		}
		if ($std_var_cost.equalsIgnoreCase(name)) {
			std_var_cost(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($diff_fxd_cost.equalsIgnoreCase(name)) {
			diff_fxd_cost(value);
			return;
		}
		if ($std_fxd_cost.equalsIgnoreCase(name)) {
			std_fxd_cost(value);
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
		if ($col_105.equalsIgnoreCase(name)) {
			col_105(value);
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
		if ($col_112.equalsIgnoreCase(name)) {
			col_112(value);
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
		if ($col_119.equalsIgnoreCase(name)) {
			col_119(value);
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
		if ($col_126.equalsIgnoreCase(name)) {
			col_126(value);
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
		if ($col_133.equalsIgnoreCase(name)) {
			col_133(value);
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
		if ($col_140.equalsIgnoreCase(name)) {
			col_140(value);
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
		if ($col_147.equalsIgnoreCase(name)) {
			col_147(value);
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
		if ($col_154.equalsIgnoreCase(name)) {
			col_154(value);
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
		if ($col_161.equalsIgnoreCase(name)) {
			col_161(value);
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
		if ($col_168.equalsIgnoreCase(name)) {
			col_168(value);
			return;
		}
		if ($col_169.equalsIgnoreCase(name)) {
			col_169(value);
			return;
		}
		if ($col_170.equalsIgnoreCase(name)) {
			col_170(value);
			return;
		}
		if ($col_171.equalsIgnoreCase(name)) {
			col_171(value);
			return;
		}
		if ($col_172.equalsIgnoreCase(name)) {
			col_172(value);
			return;
		}
		if ($col_173.equalsIgnoreCase(name)) {
			col_173(value);
			return;
		}
		if ($col_174.equalsIgnoreCase(name)) {
			col_174(value);
			return;
		}
		if ($col_175.equalsIgnoreCase(name)) {
			col_175(value);
			return;
		}
		if ($col_176.equalsIgnoreCase(name)) {
			col_176(value);
			return;
		}
		if ($col_177.equalsIgnoreCase(name)) {
			col_177(value);
			return;
		}
		if ($col_178.equalsIgnoreCase(name)) {
			col_178(value);
			return;
		}
		if ($col_179.equalsIgnoreCase(name)) {
			col_179(value);
			return;
		}
		if ($col_180.equalsIgnoreCase(name)) {
			col_180(value);
			return;
		}
		if ($col_181.equalsIgnoreCase(name)) {
			col_181(value);
			return;
		}
		if ($col_182.equalsIgnoreCase(name)) {
			col_182(value);
			return;
		}
		if ($col_183.equalsIgnoreCase(name)) {
			col_183(value);
			return;
		}
		if ($col_184.equalsIgnoreCase(name)) {
			col_184(value);
			return;
		}
		if ($col_185.equalsIgnoreCase(name)) {
			col_185(value);
			return;
		}
		if ($col_186.equalsIgnoreCase(name)) {
			col_186(value);
			return;
		}
		if ($col_187.equalsIgnoreCase(name)) {
			col_187(value);
			return;
		}
		if ($col_188.equalsIgnoreCase(name)) {
			col_188(value);
			return;
		}
		if ($col_189.equalsIgnoreCase(name)) {
			col_189(value);
			return;
		}
		if ($col_190.equalsIgnoreCase(name)) {
			col_190(value);
			return;
		}
		if ($col_191.equalsIgnoreCase(name)) {
			col_191(value);
			return;
		}
		if ($col_192.equalsIgnoreCase(name)) {
			col_192(value);
			return;
		}
		if ($col_193.equalsIgnoreCase(name)) {
			col_193(value);
			return;
		}
		if ($col_194.equalsIgnoreCase(name)) {
			col_194(value);
			return;
		}
		if ($col_195.equalsIgnoreCase(name)) {
			col_195(value);
			return;
		}
		if ($col_196.equalsIgnoreCase(name)) {
			col_196(value);
			return;
		}
		if ($col_197.equalsIgnoreCase(name)) {
			col_197(value);
			return;
		}
		if ($col_198.equalsIgnoreCase(name)) {
			col_198(value);
			return;
		}
		if ($col_199.equalsIgnoreCase(name)) {
			col_199(value);
			return;
		}
		if ($col_200.equalsIgnoreCase(name)) {
			col_200(value);
			return;
		}
		if ($col_201.equalsIgnoreCase(name)) {
			col_201(value);
			return;
		}
		if ($col_202.equalsIgnoreCase(name)) {
			col_202(value);
			return;
		}
		if ($col_203.equalsIgnoreCase(name)) {
			col_203(value);
			return;
		}
		if ($col_204.equalsIgnoreCase(name)) {
			col_204(value);
			return;
		}
		if ($col_205.equalsIgnoreCase(name)) {
			col_205(value);
			return;
		}
		if ($col_206.equalsIgnoreCase(name)) {
			col_206(value);
			return;
		}
		if ($col_207.equalsIgnoreCase(name)) {
			col_207(value);
			return;
		}
		if ($col_208.equalsIgnoreCase(name)) {
			col_208(value);
			return;
		}
		if ($col_209.equalsIgnoreCase(name)) {
			col_209(value);
			return;
		}
		if ($col_210.equalsIgnoreCase(name)) {
			col_210(value);
			return;
		}
		if ($col_211.equalsIgnoreCase(name)) {
			col_211(value);
			return;
		}
		if ($col_212.equalsIgnoreCase(name)) {
			col_212(value);
			return;
		}
		if ($col_213.equalsIgnoreCase(name)) {
			col_213(value);
			return;
		}
		if ($col_214.equalsIgnoreCase(name)) {
			col_214(value);
			return;
		}
		if ($col_215.equalsIgnoreCase(name)) {
			col_215(value);
			return;
		}
		if ($col_216.equalsIgnoreCase(name)) {
			col_216(value);
			return;
		}
		if ($col_217.equalsIgnoreCase(name)) {
			col_217(value);
			return;
		}
		if ($col_218.equalsIgnoreCase(name)) {
			col_218(value);
			return;
		}
		if ($col_219.equalsIgnoreCase(name)) {
			col_219(value);
			return;
		}
		if ($col_220.equalsIgnoreCase(name)) {
			col_220(value);
			return;
		}
		if ($col_221.equalsIgnoreCase(name)) {
			col_221(value);
			return;
		}
		if ($col_222.equalsIgnoreCase(name)) {
			col_222(value);
			return;
		}
		if ($col_223.equalsIgnoreCase(name)) {
			col_223(value);
			return;
		}
		if ($col_224.equalsIgnoreCase(name)) {
			col_224(value);
			return;
		}
		if ($col_225.equalsIgnoreCase(name)) {
			col_225(value);
			return;
		}
		if ($col_226.equalsIgnoreCase(name)) {
			col_226(value);
			return;
		}
		if ($col_227.equalsIgnoreCase(name)) {
			col_227(value);
			return;
		}
		if ($col_228.equalsIgnoreCase(name)) {
			col_228(value);
			return;
		}
		if ($col_229.equalsIgnoreCase(name)) {
			col_229(value);
			return;
		}
		if ($col_230.equalsIgnoreCase(name)) {
			col_230(value);
			return;
		}
		if ($col_231.equalsIgnoreCase(name)) {
			col_231(value);
			return;
		}
		if ($col_232.equalsIgnoreCase(name)) {
			col_232(value);
			return;
		}
		if ($col_233.equalsIgnoreCase(name)) {
			col_233(value);
			return;
		}
		if ($col_234.equalsIgnoreCase(name)) {
			col_234(value);
			return;
		}
		if ($col_235.equalsIgnoreCase(name)) {
			col_235(value);
			return;
		}
		if ($col_236.equalsIgnoreCase(name)) {
			col_236(value);
			return;
		}
		if ($col_237.equalsIgnoreCase(name)) {
			col_237(value);
			return;
		}
		if ($col_238.equalsIgnoreCase(name)) {
			col_238(value);
			return;
		}
		if ($col_239.equalsIgnoreCase(name)) {
			col_239(value);
			return;
		}
		if ($col_240.equalsIgnoreCase(name)) {
			col_240(value);
			return;
		}
		if ($col_241.equalsIgnoreCase(name)) {
			col_241(value);
			return;
		}
		if ($col_242.equalsIgnoreCase(name)) {
			col_242(value);
			return;
		}
		if ($col_243.equalsIgnoreCase(name)) {
			col_243(value);
			return;
		}
		if ($col_244.equalsIgnoreCase(name)) {
			col_244(value);
			return;
		}
		if ($col_245.equalsIgnoreCase(name)) {
			col_245(value);
			return;
		}
		if ($col_246.equalsIgnoreCase(name)) {
			col_246(value);
			return;
		}
		if ($col_247.equalsIgnoreCase(name)) {
			col_247(value);
			return;
		}
		if ($col_248.equalsIgnoreCase(name)) {
			col_248(value);
			return;
		}
		if ($col_249.equalsIgnoreCase(name)) {
			col_249(value);
			return;
		}
		if ($col_250.equalsIgnoreCase(name)) {
			col_250(value);
			return;
		}
		if ($col_251.equalsIgnoreCase(name)) {
			col_251(value);
			return;
		}
		if ($col_252.equalsIgnoreCase(name)) {
			col_252(value);
			return;
		}
		if ($col_253.equalsIgnoreCase(name)) {
			col_253(value);
			return;
		}
		if ($col_254.equalsIgnoreCase(name)) {
			col_254(value);
			return;
		}
		if ($col_255.equalsIgnoreCase(name)) {
			col_255(value);
			return;
		}
		if ($col_256.equalsIgnoreCase(name)) {
			col_256(value);
			return;
		}
		if ($col_257.equalsIgnoreCase(name)) {
			col_257(value);
			return;
		}
		if ($col_258.equalsIgnoreCase(name)) {
			col_258(value);
			return;
		}
		if ($col_259.equalsIgnoreCase(name)) {
			col_259(value);
			return;
		}
		if ($col_260.equalsIgnoreCase(name)) {
			col_260(value);
			return;
		}
		if ($col_261.equalsIgnoreCase(name)) {
			col_261(value);
			return;
		}
		if ($col_262.equalsIgnoreCase(name)) {
			col_262(value);
			return;
		}
		if ($col_263.equalsIgnoreCase(name)) {
			col_263(value);
			return;
		}
		if ($col_264.equalsIgnoreCase(name)) {
			col_264(value);
			return;
		}
		if ($col_265.equalsIgnoreCase(name)) {
			col_265(value);
			return;
		}
		if ($col_266.equalsIgnoreCase(name)) {
			col_266(value);
			return;
		}
		if ($col_267.equalsIgnoreCase(name)) {
			col_267(value);
			return;
		}
		if ($col_268.equalsIgnoreCase(name)) {
			col_268(value);
			return;
		}
		if ($col_269.equalsIgnoreCase(name)) {
			col_269(value);
			return;
		}
		if ($col_270.equalsIgnoreCase(name)) {
			col_270(value);
			return;
		}
		if ($col_271.equalsIgnoreCase(name)) {
			col_271(value);
			return;
		}
		if ($col_272.equalsIgnoreCase(name)) {
			col_272(value);
			return;
		}
		if ($col_273.equalsIgnoreCase(name)) {
			col_273(value);
			return;
		}
		if ($col_274.equalsIgnoreCase(name)) {
			col_274(value);
			return;
		}
		if ($col_275.equalsIgnoreCase(name)) {
			col_275(value);
			return;
		}
		if ($col_276.equalsIgnoreCase(name)) {
			col_276(value);
			return;
		}
		if ($col_277.equalsIgnoreCase(name)) {
			col_277(value);
			return;
		}
		if ($col_278.equalsIgnoreCase(name)) {
			col_278(value);
			return;
		}
		if ($col_279.equalsIgnoreCase(name)) {
			col_279(value);
			return;
		}
		if ($col_280.equalsIgnoreCase(name)) {
			col_280(value);
			return;
		}
		if ($col_281.equalsIgnoreCase(name)) {
			col_281(value);
			return;
		}
		if ($col_282.equalsIgnoreCase(name)) {
			col_282(value);
			return;
		}
		if ($col_283.equalsIgnoreCase(name)) {
			col_283(value);
			return;
		}
		if ($col_284.equalsIgnoreCase(name)) {
			col_284(value);
			return;
		}
		if ($col_285.equalsIgnoreCase(name)) {
			col_285(value);
			return;
		}
		if ($col_286.equalsIgnoreCase(name)) {
			col_286(value);
			return;
		}
		if ($col_287.equalsIgnoreCase(name)) {
			col_287(value);
			return;
		}
		if ($col_288.equalsIgnoreCase(name)) {
			col_288(value);
			return;
		}
		if ($col_289.equalsIgnoreCase(name)) {
			col_289(value);
			return;
		}
		if ($col_290.equalsIgnoreCase(name)) {
			col_290(value);
			return;
		}
		if ($col_291.equalsIgnoreCase(name)) {
			col_291(value);
			return;
		}
		if ($col_292.equalsIgnoreCase(name)) {
			col_292(value);
			return;
		}
		if ($col_293.equalsIgnoreCase(name)) {
			col_293(value);
			return;
		}
		if ($col_294.equalsIgnoreCase(name)) {
			col_294(value);
			return;
		}
		if ($col_295.equalsIgnoreCase(name)) {
			col_295(value);
			return;
		}
		if ($col_296.equalsIgnoreCase(name)) {
			col_296(value);
			return;
		}
		if ($col_297.equalsIgnoreCase(name)) {
			col_297(value);
			return;
		}
		if ($col_298.equalsIgnoreCase(name)) {
			col_298(value);
			return;
		}
		if ($col_299.equalsIgnoreCase(name)) {
			col_299(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($diff_ttl.equalsIgnoreCase(name)) {
			diff_ttl(value);
			return;
		}
		if ($std_ttl.equalsIgnoreCase(name)) {
			std_ttl(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($diff_var_cost.equalsIgnoreCase(name)) {
			diff_var_cost(value);
			return;
		}
		if ($std_var_cost.equalsIgnoreCase(name)) {
			std_var_cost(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($diff_fxd_cost.equalsIgnoreCase(name)) {
			diff_fxd_cost(value);
			return;
		}
		if ($std_fxd_cost.equalsIgnoreCase(name)) {
			std_fxd_cost(value);
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
		if ($col_105.equalsIgnoreCase(name)) {
			col_105(value);
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
		if ($col_112.equalsIgnoreCase(name)) {
			col_112(value);
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
		if ($col_119.equalsIgnoreCase(name)) {
			col_119(value);
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
		if ($col_126.equalsIgnoreCase(name)) {
			col_126(value);
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
		if ($col_133.equalsIgnoreCase(name)) {
			col_133(value);
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
		if ($col_140.equalsIgnoreCase(name)) {
			col_140(value);
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
		if ($col_147.equalsIgnoreCase(name)) {
			col_147(value);
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
		if ($col_154.equalsIgnoreCase(name)) {
			col_154(value);
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
		if ($col_161.equalsIgnoreCase(name)) {
			col_161(value);
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
		if ($col_168.equalsIgnoreCase(name)) {
			col_168(value);
			return;
		}
		if ($col_169.equalsIgnoreCase(name)) {
			col_169(value);
			return;
		}
		if ($col_170.equalsIgnoreCase(name)) {
			col_170(value);
			return;
		}
		if ($col_171.equalsIgnoreCase(name)) {
			col_171(value);
			return;
		}
		if ($col_172.equalsIgnoreCase(name)) {
			col_172(value);
			return;
		}
		if ($col_173.equalsIgnoreCase(name)) {
			col_173(value);
			return;
		}
		if ($col_174.equalsIgnoreCase(name)) {
			col_174(value);
			return;
		}
		if ($col_175.equalsIgnoreCase(name)) {
			col_175(value);
			return;
		}
		if ($col_176.equalsIgnoreCase(name)) {
			col_176(value);
			return;
		}
		if ($col_177.equalsIgnoreCase(name)) {
			col_177(value);
			return;
		}
		if ($col_178.equalsIgnoreCase(name)) {
			col_178(value);
			return;
		}
		if ($col_179.equalsIgnoreCase(name)) {
			col_179(value);
			return;
		}
		if ($col_180.equalsIgnoreCase(name)) {
			col_180(value);
			return;
		}
		if ($col_181.equalsIgnoreCase(name)) {
			col_181(value);
			return;
		}
		if ($col_182.equalsIgnoreCase(name)) {
			col_182(value);
			return;
		}
		if ($col_183.equalsIgnoreCase(name)) {
			col_183(value);
			return;
		}
		if ($col_184.equalsIgnoreCase(name)) {
			col_184(value);
			return;
		}
		if ($col_185.equalsIgnoreCase(name)) {
			col_185(value);
			return;
		}
		if ($col_186.equalsIgnoreCase(name)) {
			col_186(value);
			return;
		}
		if ($col_187.equalsIgnoreCase(name)) {
			col_187(value);
			return;
		}
		if ($col_188.equalsIgnoreCase(name)) {
			col_188(value);
			return;
		}
		if ($col_189.equalsIgnoreCase(name)) {
			col_189(value);
			return;
		}
		if ($col_190.equalsIgnoreCase(name)) {
			col_190(value);
			return;
		}
		if ($col_191.equalsIgnoreCase(name)) {
			col_191(value);
			return;
		}
		if ($col_192.equalsIgnoreCase(name)) {
			col_192(value);
			return;
		}
		if ($col_193.equalsIgnoreCase(name)) {
			col_193(value);
			return;
		}
		if ($col_194.equalsIgnoreCase(name)) {
			col_194(value);
			return;
		}
		if ($col_195.equalsIgnoreCase(name)) {
			col_195(value);
			return;
		}
		if ($col_196.equalsIgnoreCase(name)) {
			col_196(value);
			return;
		}
		if ($col_197.equalsIgnoreCase(name)) {
			col_197(value);
			return;
		}
		if ($col_198.equalsIgnoreCase(name)) {
			col_198(value);
			return;
		}
		if ($col_199.equalsIgnoreCase(name)) {
			col_199(value);
			return;
		}
		if ($col_200.equalsIgnoreCase(name)) {
			col_200(value);
			return;
		}
		if ($col_201.equalsIgnoreCase(name)) {
			col_201(value);
			return;
		}
		if ($col_202.equalsIgnoreCase(name)) {
			col_202(value);
			return;
		}
		if ($col_203.equalsIgnoreCase(name)) {
			col_203(value);
			return;
		}
		if ($col_204.equalsIgnoreCase(name)) {
			col_204(value);
			return;
		}
		if ($col_205.equalsIgnoreCase(name)) {
			col_205(value);
			return;
		}
		if ($col_206.equalsIgnoreCase(name)) {
			col_206(value);
			return;
		}
		if ($col_207.equalsIgnoreCase(name)) {
			col_207(value);
			return;
		}
		if ($col_208.equalsIgnoreCase(name)) {
			col_208(value);
			return;
		}
		if ($col_209.equalsIgnoreCase(name)) {
			col_209(value);
			return;
		}
		if ($col_210.equalsIgnoreCase(name)) {
			col_210(value);
			return;
		}
		if ($col_211.equalsIgnoreCase(name)) {
			col_211(value);
			return;
		}
		if ($col_212.equalsIgnoreCase(name)) {
			col_212(value);
			return;
		}
		if ($col_213.equalsIgnoreCase(name)) {
			col_213(value);
			return;
		}
		if ($col_214.equalsIgnoreCase(name)) {
			col_214(value);
			return;
		}
		if ($col_215.equalsIgnoreCase(name)) {
			col_215(value);
			return;
		}
		if ($col_216.equalsIgnoreCase(name)) {
			col_216(value);
			return;
		}
		if ($col_217.equalsIgnoreCase(name)) {
			col_217(value);
			return;
		}
		if ($col_218.equalsIgnoreCase(name)) {
			col_218(value);
			return;
		}
		if ($col_219.equalsIgnoreCase(name)) {
			col_219(value);
			return;
		}
		if ($col_220.equalsIgnoreCase(name)) {
			col_220(value);
			return;
		}
		if ($col_221.equalsIgnoreCase(name)) {
			col_221(value);
			return;
		}
		if ($col_222.equalsIgnoreCase(name)) {
			col_222(value);
			return;
		}
		if ($col_223.equalsIgnoreCase(name)) {
			col_223(value);
			return;
		}
		if ($col_224.equalsIgnoreCase(name)) {
			col_224(value);
			return;
		}
		if ($col_225.equalsIgnoreCase(name)) {
			col_225(value);
			return;
		}
		if ($col_226.equalsIgnoreCase(name)) {
			col_226(value);
			return;
		}
		if ($col_227.equalsIgnoreCase(name)) {
			col_227(value);
			return;
		}
		if ($col_228.equalsIgnoreCase(name)) {
			col_228(value);
			return;
		}
		if ($col_229.equalsIgnoreCase(name)) {
			col_229(value);
			return;
		}
		if ($col_230.equalsIgnoreCase(name)) {
			col_230(value);
			return;
		}
		if ($col_231.equalsIgnoreCase(name)) {
			col_231(value);
			return;
		}
		if ($col_232.equalsIgnoreCase(name)) {
			col_232(value);
			return;
		}
		if ($col_233.equalsIgnoreCase(name)) {
			col_233(value);
			return;
		}
		if ($col_234.equalsIgnoreCase(name)) {
			col_234(value);
			return;
		}
		if ($col_235.equalsIgnoreCase(name)) {
			col_235(value);
			return;
		}
		if ($col_236.equalsIgnoreCase(name)) {
			col_236(value);
			return;
		}
		if ($col_237.equalsIgnoreCase(name)) {
			col_237(value);
			return;
		}
		if ($col_238.equalsIgnoreCase(name)) {
			col_238(value);
			return;
		}
		if ($col_239.equalsIgnoreCase(name)) {
			col_239(value);
			return;
		}
		if ($col_240.equalsIgnoreCase(name)) {
			col_240(value);
			return;
		}
		if ($col_241.equalsIgnoreCase(name)) {
			col_241(value);
			return;
		}
		if ($col_242.equalsIgnoreCase(name)) {
			col_242(value);
			return;
		}
		if ($col_243.equalsIgnoreCase(name)) {
			col_243(value);
			return;
		}
		if ($col_244.equalsIgnoreCase(name)) {
			col_244(value);
			return;
		}
		if ($col_245.equalsIgnoreCase(name)) {
			col_245(value);
			return;
		}
		if ($col_246.equalsIgnoreCase(name)) {
			col_246(value);
			return;
		}
		if ($col_247.equalsIgnoreCase(name)) {
			col_247(value);
			return;
		}
		if ($col_248.equalsIgnoreCase(name)) {
			col_248(value);
			return;
		}
		if ($col_249.equalsIgnoreCase(name)) {
			col_249(value);
			return;
		}
		if ($col_250.equalsIgnoreCase(name)) {
			col_250(value);
			return;
		}
		if ($col_251.equalsIgnoreCase(name)) {
			col_251(value);
			return;
		}
		if ($col_252.equalsIgnoreCase(name)) {
			col_252(value);
			return;
		}
		if ($col_253.equalsIgnoreCase(name)) {
			col_253(value);
			return;
		}
		if ($col_254.equalsIgnoreCase(name)) {
			col_254(value);
			return;
		}
		if ($col_255.equalsIgnoreCase(name)) {
			col_255(value);
			return;
		}
		if ($col_256.equalsIgnoreCase(name)) {
			col_256(value);
			return;
		}
		if ($col_257.equalsIgnoreCase(name)) {
			col_257(value);
			return;
		}
		if ($col_258.equalsIgnoreCase(name)) {
			col_258(value);
			return;
		}
		if ($col_259.equalsIgnoreCase(name)) {
			col_259(value);
			return;
		}
		if ($col_260.equalsIgnoreCase(name)) {
			col_260(value);
			return;
		}
		if ($col_261.equalsIgnoreCase(name)) {
			col_261(value);
			return;
		}
		if ($col_262.equalsIgnoreCase(name)) {
			col_262(value);
			return;
		}
		if ($col_263.equalsIgnoreCase(name)) {
			col_263(value);
			return;
		}
		if ($col_264.equalsIgnoreCase(name)) {
			col_264(value);
			return;
		}
		if ($col_265.equalsIgnoreCase(name)) {
			col_265(value);
			return;
		}
		if ($col_266.equalsIgnoreCase(name)) {
			col_266(value);
			return;
		}
		if ($col_267.equalsIgnoreCase(name)) {
			col_267(value);
			return;
		}
		if ($col_268.equalsIgnoreCase(name)) {
			col_268(value);
			return;
		}
		if ($col_269.equalsIgnoreCase(name)) {
			col_269(value);
			return;
		}
		if ($col_270.equalsIgnoreCase(name)) {
			col_270(value);
			return;
		}
		if ($col_271.equalsIgnoreCase(name)) {
			col_271(value);
			return;
		}
		if ($col_272.equalsIgnoreCase(name)) {
			col_272(value);
			return;
		}
		if ($col_273.equalsIgnoreCase(name)) {
			col_273(value);
			return;
		}
		if ($col_274.equalsIgnoreCase(name)) {
			col_274(value);
			return;
		}
		if ($col_275.equalsIgnoreCase(name)) {
			col_275(value);
			return;
		}
		if ($col_276.equalsIgnoreCase(name)) {
			col_276(value);
			return;
		}
		if ($col_277.equalsIgnoreCase(name)) {
			col_277(value);
			return;
		}
		if ($col_278.equalsIgnoreCase(name)) {
			col_278(value);
			return;
		}
		if ($col_279.equalsIgnoreCase(name)) {
			col_279(value);
			return;
		}
		if ($col_280.equalsIgnoreCase(name)) {
			col_280(value);
			return;
		}
		if ($col_281.equalsIgnoreCase(name)) {
			col_281(value);
			return;
		}
		if ($col_282.equalsIgnoreCase(name)) {
			col_282(value);
			return;
		}
		if ($col_283.equalsIgnoreCase(name)) {
			col_283(value);
			return;
		}
		if ($col_284.equalsIgnoreCase(name)) {
			col_284(value);
			return;
		}
		if ($col_285.equalsIgnoreCase(name)) {
			col_285(value);
			return;
		}
		if ($col_286.equalsIgnoreCase(name)) {
			col_286(value);
			return;
		}
		if ($col_287.equalsIgnoreCase(name)) {
			col_287(value);
			return;
		}
		if ($col_288.equalsIgnoreCase(name)) {
			col_288(value);
			return;
		}
		if ($col_289.equalsIgnoreCase(name)) {
			col_289(value);
			return;
		}
		if ($col_290.equalsIgnoreCase(name)) {
			col_290(value);
			return;
		}
		if ($col_291.equalsIgnoreCase(name)) {
			col_291(value);
			return;
		}
		if ($col_292.equalsIgnoreCase(name)) {
			col_292(value);
			return;
		}
		if ($col_293.equalsIgnoreCase(name)) {
			col_293(value);
			return;
		}
		if ($col_294.equalsIgnoreCase(name)) {
			col_294(value);
			return;
		}
		if ($col_295.equalsIgnoreCase(name)) {
			col_295(value);
			return;
		}
		if ($col_296.equalsIgnoreCase(name)) {
			col_296(value);
			return;
		}
		if ($col_297.equalsIgnoreCase(name)) {
			col_297(value);
			return;
		}
		if ($col_298.equalsIgnoreCase(name)) {
			col_298(value);
			return;
		}
		if ($col_299.equalsIgnoreCase(name)) {
			col_299(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($diff_ttl.equalsIgnoreCase(name)) {
			diff_ttl(value);
			return;
		}
		if ($std_ttl.equalsIgnoreCase(name)) {
			std_ttl(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($diff_var_cost.equalsIgnoreCase(name)) {
			diff_var_cost(value);
			return;
		}
		if ($std_var_cost.equalsIgnoreCase(name)) {
			std_var_cost(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($diff_fxd_cost.equalsIgnoreCase(name)) {
			diff_fxd_cost(value);
			return;
		}
		if ($std_fxd_cost.equalsIgnoreCase(name)) {
			std_fxd_cost(value);
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
		if ($col_105.equalsIgnoreCase(name)) {
			col_105(value);
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
		if ($col_112.equalsIgnoreCase(name)) {
			col_112(value);
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
		if ($col_119.equalsIgnoreCase(name)) {
			col_119(value);
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
		if ($col_126.equalsIgnoreCase(name)) {
			col_126(value);
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
		if ($col_133.equalsIgnoreCase(name)) {
			col_133(value);
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
		if ($col_140.equalsIgnoreCase(name)) {
			col_140(value);
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
		if ($col_147.equalsIgnoreCase(name)) {
			col_147(value);
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
		if ($col_154.equalsIgnoreCase(name)) {
			col_154(value);
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
		if ($col_161.equalsIgnoreCase(name)) {
			col_161(value);
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
		if ($col_168.equalsIgnoreCase(name)) {
			col_168(value);
			return;
		}
		if ($col_169.equalsIgnoreCase(name)) {
			col_169(value);
			return;
		}
		if ($col_170.equalsIgnoreCase(name)) {
			col_170(value);
			return;
		}
		if ($col_171.equalsIgnoreCase(name)) {
			col_171(value);
			return;
		}
		if ($col_172.equalsIgnoreCase(name)) {
			col_172(value);
			return;
		}
		if ($col_173.equalsIgnoreCase(name)) {
			col_173(value);
			return;
		}
		if ($col_174.equalsIgnoreCase(name)) {
			col_174(value);
			return;
		}
		if ($col_175.equalsIgnoreCase(name)) {
			col_175(value);
			return;
		}
		if ($col_176.equalsIgnoreCase(name)) {
			col_176(value);
			return;
		}
		if ($col_177.equalsIgnoreCase(name)) {
			col_177(value);
			return;
		}
		if ($col_178.equalsIgnoreCase(name)) {
			col_178(value);
			return;
		}
		if ($col_179.equalsIgnoreCase(name)) {
			col_179(value);
			return;
		}
		if ($col_180.equalsIgnoreCase(name)) {
			col_180(value);
			return;
		}
		if ($col_181.equalsIgnoreCase(name)) {
			col_181(value);
			return;
		}
		if ($col_182.equalsIgnoreCase(name)) {
			col_182(value);
			return;
		}
		if ($col_183.equalsIgnoreCase(name)) {
			col_183(value);
			return;
		}
		if ($col_184.equalsIgnoreCase(name)) {
			col_184(value);
			return;
		}
		if ($col_185.equalsIgnoreCase(name)) {
			col_185(value);
			return;
		}
		if ($col_186.equalsIgnoreCase(name)) {
			col_186(value);
			return;
		}
		if ($col_187.equalsIgnoreCase(name)) {
			col_187(value);
			return;
		}
		if ($col_188.equalsIgnoreCase(name)) {
			col_188(value);
			return;
		}
		if ($col_189.equalsIgnoreCase(name)) {
			col_189(value);
			return;
		}
		if ($col_190.equalsIgnoreCase(name)) {
			col_190(value);
			return;
		}
		if ($col_191.equalsIgnoreCase(name)) {
			col_191(value);
			return;
		}
		if ($col_192.equalsIgnoreCase(name)) {
			col_192(value);
			return;
		}
		if ($col_193.equalsIgnoreCase(name)) {
			col_193(value);
			return;
		}
		if ($col_194.equalsIgnoreCase(name)) {
			col_194(value);
			return;
		}
		if ($col_195.equalsIgnoreCase(name)) {
			col_195(value);
			return;
		}
		if ($col_196.equalsIgnoreCase(name)) {
			col_196(value);
			return;
		}
		if ($col_197.equalsIgnoreCase(name)) {
			col_197(value);
			return;
		}
		if ($col_198.equalsIgnoreCase(name)) {
			col_198(value);
			return;
		}
		if ($col_199.equalsIgnoreCase(name)) {
			col_199(value);
			return;
		}
		if ($col_200.equalsIgnoreCase(name)) {
			col_200(value);
			return;
		}
		if ($col_201.equalsIgnoreCase(name)) {
			col_201(value);
			return;
		}
		if ($col_202.equalsIgnoreCase(name)) {
			col_202(value);
			return;
		}
		if ($col_203.equalsIgnoreCase(name)) {
			col_203(value);
			return;
		}
		if ($col_204.equalsIgnoreCase(name)) {
			col_204(value);
			return;
		}
		if ($col_205.equalsIgnoreCase(name)) {
			col_205(value);
			return;
		}
		if ($col_206.equalsIgnoreCase(name)) {
			col_206(value);
			return;
		}
		if ($col_207.equalsIgnoreCase(name)) {
			col_207(value);
			return;
		}
		if ($col_208.equalsIgnoreCase(name)) {
			col_208(value);
			return;
		}
		if ($col_209.equalsIgnoreCase(name)) {
			col_209(value);
			return;
		}
		if ($col_210.equalsIgnoreCase(name)) {
			col_210(value);
			return;
		}
		if ($col_211.equalsIgnoreCase(name)) {
			col_211(value);
			return;
		}
		if ($col_212.equalsIgnoreCase(name)) {
			col_212(value);
			return;
		}
		if ($col_213.equalsIgnoreCase(name)) {
			col_213(value);
			return;
		}
		if ($col_214.equalsIgnoreCase(name)) {
			col_214(value);
			return;
		}
		if ($col_215.equalsIgnoreCase(name)) {
			col_215(value);
			return;
		}
		if ($col_216.equalsIgnoreCase(name)) {
			col_216(value);
			return;
		}
		if ($col_217.equalsIgnoreCase(name)) {
			col_217(value);
			return;
		}
		if ($col_218.equalsIgnoreCase(name)) {
			col_218(value);
			return;
		}
		if ($col_219.equalsIgnoreCase(name)) {
			col_219(value);
			return;
		}
		if ($col_220.equalsIgnoreCase(name)) {
			col_220(value);
			return;
		}
		if ($col_221.equalsIgnoreCase(name)) {
			col_221(value);
			return;
		}
		if ($col_222.equalsIgnoreCase(name)) {
			col_222(value);
			return;
		}
		if ($col_223.equalsIgnoreCase(name)) {
			col_223(value);
			return;
		}
		if ($col_224.equalsIgnoreCase(name)) {
			col_224(value);
			return;
		}
		if ($col_225.equalsIgnoreCase(name)) {
			col_225(value);
			return;
		}
		if ($col_226.equalsIgnoreCase(name)) {
			col_226(value);
			return;
		}
		if ($col_227.equalsIgnoreCase(name)) {
			col_227(value);
			return;
		}
		if ($col_228.equalsIgnoreCase(name)) {
			col_228(value);
			return;
		}
		if ($col_229.equalsIgnoreCase(name)) {
			col_229(value);
			return;
		}
		if ($col_230.equalsIgnoreCase(name)) {
			col_230(value);
			return;
		}
		if ($col_231.equalsIgnoreCase(name)) {
			col_231(value);
			return;
		}
		if ($col_232.equalsIgnoreCase(name)) {
			col_232(value);
			return;
		}
		if ($col_233.equalsIgnoreCase(name)) {
			col_233(value);
			return;
		}
		if ($col_234.equalsIgnoreCase(name)) {
			col_234(value);
			return;
		}
		if ($col_235.equalsIgnoreCase(name)) {
			col_235(value);
			return;
		}
		if ($col_236.equalsIgnoreCase(name)) {
			col_236(value);
			return;
		}
		if ($col_237.equalsIgnoreCase(name)) {
			col_237(value);
			return;
		}
		if ($col_238.equalsIgnoreCase(name)) {
			col_238(value);
			return;
		}
		if ($col_239.equalsIgnoreCase(name)) {
			col_239(value);
			return;
		}
		if ($col_240.equalsIgnoreCase(name)) {
			col_240(value);
			return;
		}
		if ($col_241.equalsIgnoreCase(name)) {
			col_241(value);
			return;
		}
		if ($col_242.equalsIgnoreCase(name)) {
			col_242(value);
			return;
		}
		if ($col_243.equalsIgnoreCase(name)) {
			col_243(value);
			return;
		}
		if ($col_244.equalsIgnoreCase(name)) {
			col_244(value);
			return;
		}
		if ($col_245.equalsIgnoreCase(name)) {
			col_245(value);
			return;
		}
		if ($col_246.equalsIgnoreCase(name)) {
			col_246(value);
			return;
		}
		if ($col_247.equalsIgnoreCase(name)) {
			col_247(value);
			return;
		}
		if ($col_248.equalsIgnoreCase(name)) {
			col_248(value);
			return;
		}
		if ($col_249.equalsIgnoreCase(name)) {
			col_249(value);
			return;
		}
		if ($col_250.equalsIgnoreCase(name)) {
			col_250(value);
			return;
		}
		if ($col_251.equalsIgnoreCase(name)) {
			col_251(value);
			return;
		}
		if ($col_252.equalsIgnoreCase(name)) {
			col_252(value);
			return;
		}
		if ($col_253.equalsIgnoreCase(name)) {
			col_253(value);
			return;
		}
		if ($col_254.equalsIgnoreCase(name)) {
			col_254(value);
			return;
		}
		if ($col_255.equalsIgnoreCase(name)) {
			col_255(value);
			return;
		}
		if ($col_256.equalsIgnoreCase(name)) {
			col_256(value);
			return;
		}
		if ($col_257.equalsIgnoreCase(name)) {
			col_257(value);
			return;
		}
		if ($col_258.equalsIgnoreCase(name)) {
			col_258(value);
			return;
		}
		if ($col_259.equalsIgnoreCase(name)) {
			col_259(value);
			return;
		}
		if ($col_260.equalsIgnoreCase(name)) {
			col_260(value);
			return;
		}
		if ($col_261.equalsIgnoreCase(name)) {
			col_261(value);
			return;
		}
		if ($col_262.equalsIgnoreCase(name)) {
			col_262(value);
			return;
		}
		if ($col_263.equalsIgnoreCase(name)) {
			col_263(value);
			return;
		}
		if ($col_264.equalsIgnoreCase(name)) {
			col_264(value);
			return;
		}
		if ($col_265.equalsIgnoreCase(name)) {
			col_265(value);
			return;
		}
		if ($col_266.equalsIgnoreCase(name)) {
			col_266(value);
			return;
		}
		if ($col_267.equalsIgnoreCase(name)) {
			col_267(value);
			return;
		}
		if ($col_268.equalsIgnoreCase(name)) {
			col_268(value);
			return;
		}
		if ($col_269.equalsIgnoreCase(name)) {
			col_269(value);
			return;
		}
		if ($col_270.equalsIgnoreCase(name)) {
			col_270(value);
			return;
		}
		if ($col_271.equalsIgnoreCase(name)) {
			col_271(value);
			return;
		}
		if ($col_272.equalsIgnoreCase(name)) {
			col_272(value);
			return;
		}
		if ($col_273.equalsIgnoreCase(name)) {
			col_273(value);
			return;
		}
		if ($col_274.equalsIgnoreCase(name)) {
			col_274(value);
			return;
		}
		if ($col_275.equalsIgnoreCase(name)) {
			col_275(value);
			return;
		}
		if ($col_276.equalsIgnoreCase(name)) {
			col_276(value);
			return;
		}
		if ($col_277.equalsIgnoreCase(name)) {
			col_277(value);
			return;
		}
		if ($col_278.equalsIgnoreCase(name)) {
			col_278(value);
			return;
		}
		if ($col_279.equalsIgnoreCase(name)) {
			col_279(value);
			return;
		}
		if ($col_280.equalsIgnoreCase(name)) {
			col_280(value);
			return;
		}
		if ($col_281.equalsIgnoreCase(name)) {
			col_281(value);
			return;
		}
		if ($col_282.equalsIgnoreCase(name)) {
			col_282(value);
			return;
		}
		if ($col_283.equalsIgnoreCase(name)) {
			col_283(value);
			return;
		}
		if ($col_284.equalsIgnoreCase(name)) {
			col_284(value);
			return;
		}
		if ($col_285.equalsIgnoreCase(name)) {
			col_285(value);
			return;
		}
		if ($col_286.equalsIgnoreCase(name)) {
			col_286(value);
			return;
		}
		if ($col_287.equalsIgnoreCase(name)) {
			col_287(value);
			return;
		}
		if ($col_288.equalsIgnoreCase(name)) {
			col_288(value);
			return;
		}
		if ($col_289.equalsIgnoreCase(name)) {
			col_289(value);
			return;
		}
		if ($col_290.equalsIgnoreCase(name)) {
			col_290(value);
			return;
		}
		if ($col_291.equalsIgnoreCase(name)) {
			col_291(value);
			return;
		}
		if ($col_292.equalsIgnoreCase(name)) {
			col_292(value);
			return;
		}
		if ($col_293.equalsIgnoreCase(name)) {
			col_293(value);
			return;
		}
		if ($col_294.equalsIgnoreCase(name)) {
			col_294(value);
			return;
		}
		if ($col_295.equalsIgnoreCase(name)) {
			col_295(value);
			return;
		}
		if ($col_296.equalsIgnoreCase(name)) {
			col_296(value);
			return;
		}
		if ($col_297.equalsIgnoreCase(name)) {
			col_297(value);
			return;
		}
		if ($col_298.equalsIgnoreCase(name)) {
			col_298(value);
			return;
		}
		if ($col_299.equalsIgnoreCase(name)) {
			col_299(value);
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
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			wk_cost_nm(value);
			return;
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			wk_cost_unit_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($diff_ttl.equalsIgnoreCase(name)) {
			diff_ttl(value);
			return;
		}
		if ($std_ttl.equalsIgnoreCase(name)) {
			std_ttl(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($diff_var_cost.equalsIgnoreCase(name)) {
			diff_var_cost(value);
			return;
		}
		if ($std_var_cost.equalsIgnoreCase(name)) {
			std_var_cost(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($diff_fxd_cost.equalsIgnoreCase(name)) {
			diff_fxd_cost(value);
			return;
		}
		if ($std_fxd_cost.equalsIgnoreCase(name)) {
			std_fxd_cost(value);
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
		if ($col_105.equalsIgnoreCase(name)) {
			col_105(value);
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
		if ($col_112.equalsIgnoreCase(name)) {
			col_112(value);
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
		if ($col_119.equalsIgnoreCase(name)) {
			col_119(value);
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
		if ($col_126.equalsIgnoreCase(name)) {
			col_126(value);
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
		if ($col_133.equalsIgnoreCase(name)) {
			col_133(value);
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
		if ($col_140.equalsIgnoreCase(name)) {
			col_140(value);
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
		if ($col_147.equalsIgnoreCase(name)) {
			col_147(value);
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
		if ($col_154.equalsIgnoreCase(name)) {
			col_154(value);
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
		if ($col_161.equalsIgnoreCase(name)) {
			col_161(value);
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
		if ($col_168.equalsIgnoreCase(name)) {
			col_168(value);
			return;
		}
		if ($col_169.equalsIgnoreCase(name)) {
			col_169(value);
			return;
		}
		if ($col_170.equalsIgnoreCase(name)) {
			col_170(value);
			return;
		}
		if ($col_171.equalsIgnoreCase(name)) {
			col_171(value);
			return;
		}
		if ($col_172.equalsIgnoreCase(name)) {
			col_172(value);
			return;
		}
		if ($col_173.equalsIgnoreCase(name)) {
			col_173(value);
			return;
		}
		if ($col_174.equalsIgnoreCase(name)) {
			col_174(value);
			return;
		}
		if ($col_175.equalsIgnoreCase(name)) {
			col_175(value);
			return;
		}
		if ($col_176.equalsIgnoreCase(name)) {
			col_176(value);
			return;
		}
		if ($col_177.equalsIgnoreCase(name)) {
			col_177(value);
			return;
		}
		if ($col_178.equalsIgnoreCase(name)) {
			col_178(value);
			return;
		}
		if ($col_179.equalsIgnoreCase(name)) {
			col_179(value);
			return;
		}
		if ($col_180.equalsIgnoreCase(name)) {
			col_180(value);
			return;
		}
		if ($col_181.equalsIgnoreCase(name)) {
			col_181(value);
			return;
		}
		if ($col_182.equalsIgnoreCase(name)) {
			col_182(value);
			return;
		}
		if ($col_183.equalsIgnoreCase(name)) {
			col_183(value);
			return;
		}
		if ($col_184.equalsIgnoreCase(name)) {
			col_184(value);
			return;
		}
		if ($col_185.equalsIgnoreCase(name)) {
			col_185(value);
			return;
		}
		if ($col_186.equalsIgnoreCase(name)) {
			col_186(value);
			return;
		}
		if ($col_187.equalsIgnoreCase(name)) {
			col_187(value);
			return;
		}
		if ($col_188.equalsIgnoreCase(name)) {
			col_188(value);
			return;
		}
		if ($col_189.equalsIgnoreCase(name)) {
			col_189(value);
			return;
		}
		if ($col_190.equalsIgnoreCase(name)) {
			col_190(value);
			return;
		}
		if ($col_191.equalsIgnoreCase(name)) {
			col_191(value);
			return;
		}
		if ($col_192.equalsIgnoreCase(name)) {
			col_192(value);
			return;
		}
		if ($col_193.equalsIgnoreCase(name)) {
			col_193(value);
			return;
		}
		if ($col_194.equalsIgnoreCase(name)) {
			col_194(value);
			return;
		}
		if ($col_195.equalsIgnoreCase(name)) {
			col_195(value);
			return;
		}
		if ($col_196.equalsIgnoreCase(name)) {
			col_196(value);
			return;
		}
		if ($col_197.equalsIgnoreCase(name)) {
			col_197(value);
			return;
		}
		if ($col_198.equalsIgnoreCase(name)) {
			col_198(value);
			return;
		}
		if ($col_199.equalsIgnoreCase(name)) {
			col_199(value);
			return;
		}
		if ($col_200.equalsIgnoreCase(name)) {
			col_200(value);
			return;
		}
		if ($col_201.equalsIgnoreCase(name)) {
			col_201(value);
			return;
		}
		if ($col_202.equalsIgnoreCase(name)) {
			col_202(value);
			return;
		}
		if ($col_203.equalsIgnoreCase(name)) {
			col_203(value);
			return;
		}
		if ($col_204.equalsIgnoreCase(name)) {
			col_204(value);
			return;
		}
		if ($col_205.equalsIgnoreCase(name)) {
			col_205(value);
			return;
		}
		if ($col_206.equalsIgnoreCase(name)) {
			col_206(value);
			return;
		}
		if ($col_207.equalsIgnoreCase(name)) {
			col_207(value);
			return;
		}
		if ($col_208.equalsIgnoreCase(name)) {
			col_208(value);
			return;
		}
		if ($col_209.equalsIgnoreCase(name)) {
			col_209(value);
			return;
		}
		if ($col_210.equalsIgnoreCase(name)) {
			col_210(value);
			return;
		}
		if ($col_211.equalsIgnoreCase(name)) {
			col_211(value);
			return;
		}
		if ($col_212.equalsIgnoreCase(name)) {
			col_212(value);
			return;
		}
		if ($col_213.equalsIgnoreCase(name)) {
			col_213(value);
			return;
		}
		if ($col_214.equalsIgnoreCase(name)) {
			col_214(value);
			return;
		}
		if ($col_215.equalsIgnoreCase(name)) {
			col_215(value);
			return;
		}
		if ($col_216.equalsIgnoreCase(name)) {
			col_216(value);
			return;
		}
		if ($col_217.equalsIgnoreCase(name)) {
			col_217(value);
			return;
		}
		if ($col_218.equalsIgnoreCase(name)) {
			col_218(value);
			return;
		}
		if ($col_219.equalsIgnoreCase(name)) {
			col_219(value);
			return;
		}
		if ($col_220.equalsIgnoreCase(name)) {
			col_220(value);
			return;
		}
		if ($col_221.equalsIgnoreCase(name)) {
			col_221(value);
			return;
		}
		if ($col_222.equalsIgnoreCase(name)) {
			col_222(value);
			return;
		}
		if ($col_223.equalsIgnoreCase(name)) {
			col_223(value);
			return;
		}
		if ($col_224.equalsIgnoreCase(name)) {
			col_224(value);
			return;
		}
		if ($col_225.equalsIgnoreCase(name)) {
			col_225(value);
			return;
		}
		if ($col_226.equalsIgnoreCase(name)) {
			col_226(value);
			return;
		}
		if ($col_227.equalsIgnoreCase(name)) {
			col_227(value);
			return;
		}
		if ($col_228.equalsIgnoreCase(name)) {
			col_228(value);
			return;
		}
		if ($col_229.equalsIgnoreCase(name)) {
			col_229(value);
			return;
		}
		if ($col_230.equalsIgnoreCase(name)) {
			col_230(value);
			return;
		}
		if ($col_231.equalsIgnoreCase(name)) {
			col_231(value);
			return;
		}
		if ($col_232.equalsIgnoreCase(name)) {
			col_232(value);
			return;
		}
		if ($col_233.equalsIgnoreCase(name)) {
			col_233(value);
			return;
		}
		if ($col_234.equalsIgnoreCase(name)) {
			col_234(value);
			return;
		}
		if ($col_235.equalsIgnoreCase(name)) {
			col_235(value);
			return;
		}
		if ($col_236.equalsIgnoreCase(name)) {
			col_236(value);
			return;
		}
		if ($col_237.equalsIgnoreCase(name)) {
			col_237(value);
			return;
		}
		if ($col_238.equalsIgnoreCase(name)) {
			col_238(value);
			return;
		}
		if ($col_239.equalsIgnoreCase(name)) {
			col_239(value);
			return;
		}
		if ($col_240.equalsIgnoreCase(name)) {
			col_240(value);
			return;
		}
		if ($col_241.equalsIgnoreCase(name)) {
			col_241(value);
			return;
		}
		if ($col_242.equalsIgnoreCase(name)) {
			col_242(value);
			return;
		}
		if ($col_243.equalsIgnoreCase(name)) {
			col_243(value);
			return;
		}
		if ($col_244.equalsIgnoreCase(name)) {
			col_244(value);
			return;
		}
		if ($col_245.equalsIgnoreCase(name)) {
			col_245(value);
			return;
		}
		if ($col_246.equalsIgnoreCase(name)) {
			col_246(value);
			return;
		}
		if ($col_247.equalsIgnoreCase(name)) {
			col_247(value);
			return;
		}
		if ($col_248.equalsIgnoreCase(name)) {
			col_248(value);
			return;
		}
		if ($col_249.equalsIgnoreCase(name)) {
			col_249(value);
			return;
		}
		if ($col_250.equalsIgnoreCase(name)) {
			col_250(value);
			return;
		}
		if ($col_251.equalsIgnoreCase(name)) {
			col_251(value);
			return;
		}
		if ($col_252.equalsIgnoreCase(name)) {
			col_252(value);
			return;
		}
		if ($col_253.equalsIgnoreCase(name)) {
			col_253(value);
			return;
		}
		if ($col_254.equalsIgnoreCase(name)) {
			col_254(value);
			return;
		}
		if ($col_255.equalsIgnoreCase(name)) {
			col_255(value);
			return;
		}
		if ($col_256.equalsIgnoreCase(name)) {
			col_256(value);
			return;
		}
		if ($col_257.equalsIgnoreCase(name)) {
			col_257(value);
			return;
		}
		if ($col_258.equalsIgnoreCase(name)) {
			col_258(value);
			return;
		}
		if ($col_259.equalsIgnoreCase(name)) {
			col_259(value);
			return;
		}
		if ($col_260.equalsIgnoreCase(name)) {
			col_260(value);
			return;
		}
		if ($col_261.equalsIgnoreCase(name)) {
			col_261(value);
			return;
		}
		if ($col_262.equalsIgnoreCase(name)) {
			col_262(value);
			return;
		}
		if ($col_263.equalsIgnoreCase(name)) {
			col_263(value);
			return;
		}
		if ($col_264.equalsIgnoreCase(name)) {
			col_264(value);
			return;
		}
		if ($col_265.equalsIgnoreCase(name)) {
			col_265(value);
			return;
		}
		if ($col_266.equalsIgnoreCase(name)) {
			col_266(value);
			return;
		}
		if ($col_267.equalsIgnoreCase(name)) {
			col_267(value);
			return;
		}
		if ($col_268.equalsIgnoreCase(name)) {
			col_268(value);
			return;
		}
		if ($col_269.equalsIgnoreCase(name)) {
			col_269(value);
			return;
		}
		if ($col_270.equalsIgnoreCase(name)) {
			col_270(value);
			return;
		}
		if ($col_271.equalsIgnoreCase(name)) {
			col_271(value);
			return;
		}
		if ($col_272.equalsIgnoreCase(name)) {
			col_272(value);
			return;
		}
		if ($col_273.equalsIgnoreCase(name)) {
			col_273(value);
			return;
		}
		if ($col_274.equalsIgnoreCase(name)) {
			col_274(value);
			return;
		}
		if ($col_275.equalsIgnoreCase(name)) {
			col_275(value);
			return;
		}
		if ($col_276.equalsIgnoreCase(name)) {
			col_276(value);
			return;
		}
		if ($col_277.equalsIgnoreCase(name)) {
			col_277(value);
			return;
		}
		if ($col_278.equalsIgnoreCase(name)) {
			col_278(value);
			return;
		}
		if ($col_279.equalsIgnoreCase(name)) {
			col_279(value);
			return;
		}
		if ($col_280.equalsIgnoreCase(name)) {
			col_280(value);
			return;
		}
		if ($col_281.equalsIgnoreCase(name)) {
			col_281(value);
			return;
		}
		if ($col_282.equalsIgnoreCase(name)) {
			col_282(value);
			return;
		}
		if ($col_283.equalsIgnoreCase(name)) {
			col_283(value);
			return;
		}
		if ($col_284.equalsIgnoreCase(name)) {
			col_284(value);
			return;
		}
		if ($col_285.equalsIgnoreCase(name)) {
			col_285(value);
			return;
		}
		if ($col_286.equalsIgnoreCase(name)) {
			col_286(value);
			return;
		}
		if ($col_287.equalsIgnoreCase(name)) {
			col_287(value);
			return;
		}
		if ($col_288.equalsIgnoreCase(name)) {
			col_288(value);
			return;
		}
		if ($col_289.equalsIgnoreCase(name)) {
			col_289(value);
			return;
		}
		if ($col_290.equalsIgnoreCase(name)) {
			col_290(value);
			return;
		}
		if ($col_291.equalsIgnoreCase(name)) {
			col_291(value);
			return;
		}
		if ($col_292.equalsIgnoreCase(name)) {
			col_292(value);
			return;
		}
		if ($col_293.equalsIgnoreCase(name)) {
			col_293(value);
			return;
		}
		if ($col_294.equalsIgnoreCase(name)) {
			col_294(value);
			return;
		}
		if ($col_295.equalsIgnoreCase(name)) {
			col_295(value);
			return;
		}
		if ($col_296.equalsIgnoreCase(name)) {
			col_296(value);
			return;
		}
		if ($col_297.equalsIgnoreCase(name)) {
			col_297(value);
			return;
		}
		if ($col_298.equalsIgnoreCase(name)) {
			col_298(value);
			return;
		}
		if ($col_299.equalsIgnoreCase(name)) {
			col_299(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($diff_ttl.equalsIgnoreCase(name)) {
			diff_ttl(value);
			return;
		}
		if ($std_ttl.equalsIgnoreCase(name)) {
			std_ttl(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($diff_var_cost.equalsIgnoreCase(name)) {
			diff_var_cost(value);
			return;
		}
		if ($std_var_cost.equalsIgnoreCase(name)) {
			std_var_cost(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($diff_fxd_cost.equalsIgnoreCase(name)) {
			diff_fxd_cost(value);
			return;
		}
		if ($std_fxd_cost.equalsIgnoreCase(name)) {
			std_fxd_cost(value);
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
		if ($col_105.equalsIgnoreCase(name)) {
			col_105(value);
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
		if ($col_112.equalsIgnoreCase(name)) {
			col_112(value);
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
		if ($col_119.equalsIgnoreCase(name)) {
			col_119(value);
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
		if ($col_126.equalsIgnoreCase(name)) {
			col_126(value);
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
		if ($col_133.equalsIgnoreCase(name)) {
			col_133(value);
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
		if ($col_140.equalsIgnoreCase(name)) {
			col_140(value);
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
		if ($col_147.equalsIgnoreCase(name)) {
			col_147(value);
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
		if ($col_154.equalsIgnoreCase(name)) {
			col_154(value);
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
		if ($col_161.equalsIgnoreCase(name)) {
			col_161(value);
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
		if ($col_168.equalsIgnoreCase(name)) {
			col_168(value);
			return;
		}
		if ($col_169.equalsIgnoreCase(name)) {
			col_169(value);
			return;
		}
		if ($col_170.equalsIgnoreCase(name)) {
			col_170(value);
			return;
		}
		if ($col_171.equalsIgnoreCase(name)) {
			col_171(value);
			return;
		}
		if ($col_172.equalsIgnoreCase(name)) {
			col_172(value);
			return;
		}
		if ($col_173.equalsIgnoreCase(name)) {
			col_173(value);
			return;
		}
		if ($col_174.equalsIgnoreCase(name)) {
			col_174(value);
			return;
		}
		if ($col_175.equalsIgnoreCase(name)) {
			col_175(value);
			return;
		}
		if ($col_176.equalsIgnoreCase(name)) {
			col_176(value);
			return;
		}
		if ($col_177.equalsIgnoreCase(name)) {
			col_177(value);
			return;
		}
		if ($col_178.equalsIgnoreCase(name)) {
			col_178(value);
			return;
		}
		if ($col_179.equalsIgnoreCase(name)) {
			col_179(value);
			return;
		}
		if ($col_180.equalsIgnoreCase(name)) {
			col_180(value);
			return;
		}
		if ($col_181.equalsIgnoreCase(name)) {
			col_181(value);
			return;
		}
		if ($col_182.equalsIgnoreCase(name)) {
			col_182(value);
			return;
		}
		if ($col_183.equalsIgnoreCase(name)) {
			col_183(value);
			return;
		}
		if ($col_184.equalsIgnoreCase(name)) {
			col_184(value);
			return;
		}
		if ($col_185.equalsIgnoreCase(name)) {
			col_185(value);
			return;
		}
		if ($col_186.equalsIgnoreCase(name)) {
			col_186(value);
			return;
		}
		if ($col_187.equalsIgnoreCase(name)) {
			col_187(value);
			return;
		}
		if ($col_188.equalsIgnoreCase(name)) {
			col_188(value);
			return;
		}
		if ($col_189.equalsIgnoreCase(name)) {
			col_189(value);
			return;
		}
		if ($col_190.equalsIgnoreCase(name)) {
			col_190(value);
			return;
		}
		if ($col_191.equalsIgnoreCase(name)) {
			col_191(value);
			return;
		}
		if ($col_192.equalsIgnoreCase(name)) {
			col_192(value);
			return;
		}
		if ($col_193.equalsIgnoreCase(name)) {
			col_193(value);
			return;
		}
		if ($col_194.equalsIgnoreCase(name)) {
			col_194(value);
			return;
		}
		if ($col_195.equalsIgnoreCase(name)) {
			col_195(value);
			return;
		}
		if ($col_196.equalsIgnoreCase(name)) {
			col_196(value);
			return;
		}
		if ($col_197.equalsIgnoreCase(name)) {
			col_197(value);
			return;
		}
		if ($col_198.equalsIgnoreCase(name)) {
			col_198(value);
			return;
		}
		if ($col_199.equalsIgnoreCase(name)) {
			col_199(value);
			return;
		}
		if ($col_200.equalsIgnoreCase(name)) {
			col_200(value);
			return;
		}
		if ($col_201.equalsIgnoreCase(name)) {
			col_201(value);
			return;
		}
		if ($col_202.equalsIgnoreCase(name)) {
			col_202(value);
			return;
		}
		if ($col_203.equalsIgnoreCase(name)) {
			col_203(value);
			return;
		}
		if ($col_204.equalsIgnoreCase(name)) {
			col_204(value);
			return;
		}
		if ($col_205.equalsIgnoreCase(name)) {
			col_205(value);
			return;
		}
		if ($col_206.equalsIgnoreCase(name)) {
			col_206(value);
			return;
		}
		if ($col_207.equalsIgnoreCase(name)) {
			col_207(value);
			return;
		}
		if ($col_208.equalsIgnoreCase(name)) {
			col_208(value);
			return;
		}
		if ($col_209.equalsIgnoreCase(name)) {
			col_209(value);
			return;
		}
		if ($col_210.equalsIgnoreCase(name)) {
			col_210(value);
			return;
		}
		if ($col_211.equalsIgnoreCase(name)) {
			col_211(value);
			return;
		}
		if ($col_212.equalsIgnoreCase(name)) {
			col_212(value);
			return;
		}
		if ($col_213.equalsIgnoreCase(name)) {
			col_213(value);
			return;
		}
		if ($col_214.equalsIgnoreCase(name)) {
			col_214(value);
			return;
		}
		if ($col_215.equalsIgnoreCase(name)) {
			col_215(value);
			return;
		}
		if ($col_216.equalsIgnoreCase(name)) {
			col_216(value);
			return;
		}
		if ($col_217.equalsIgnoreCase(name)) {
			col_217(value);
			return;
		}
		if ($col_218.equalsIgnoreCase(name)) {
			col_218(value);
			return;
		}
		if ($col_219.equalsIgnoreCase(name)) {
			col_219(value);
			return;
		}
		if ($col_220.equalsIgnoreCase(name)) {
			col_220(value);
			return;
		}
		if ($col_221.equalsIgnoreCase(name)) {
			col_221(value);
			return;
		}
		if ($col_222.equalsIgnoreCase(name)) {
			col_222(value);
			return;
		}
		if ($col_223.equalsIgnoreCase(name)) {
			col_223(value);
			return;
		}
		if ($col_224.equalsIgnoreCase(name)) {
			col_224(value);
			return;
		}
		if ($col_225.equalsIgnoreCase(name)) {
			col_225(value);
			return;
		}
		if ($col_226.equalsIgnoreCase(name)) {
			col_226(value);
			return;
		}
		if ($col_227.equalsIgnoreCase(name)) {
			col_227(value);
			return;
		}
		if ($col_228.equalsIgnoreCase(name)) {
			col_228(value);
			return;
		}
		if ($col_229.equalsIgnoreCase(name)) {
			col_229(value);
			return;
		}
		if ($col_230.equalsIgnoreCase(name)) {
			col_230(value);
			return;
		}
		if ($col_231.equalsIgnoreCase(name)) {
			col_231(value);
			return;
		}
		if ($col_232.equalsIgnoreCase(name)) {
			col_232(value);
			return;
		}
		if ($col_233.equalsIgnoreCase(name)) {
			col_233(value);
			return;
		}
		if ($col_234.equalsIgnoreCase(name)) {
			col_234(value);
			return;
		}
		if ($col_235.equalsIgnoreCase(name)) {
			col_235(value);
			return;
		}
		if ($col_236.equalsIgnoreCase(name)) {
			col_236(value);
			return;
		}
		if ($col_237.equalsIgnoreCase(name)) {
			col_237(value);
			return;
		}
		if ($col_238.equalsIgnoreCase(name)) {
			col_238(value);
			return;
		}
		if ($col_239.equalsIgnoreCase(name)) {
			col_239(value);
			return;
		}
		if ($col_240.equalsIgnoreCase(name)) {
			col_240(value);
			return;
		}
		if ($col_241.equalsIgnoreCase(name)) {
			col_241(value);
			return;
		}
		if ($col_242.equalsIgnoreCase(name)) {
			col_242(value);
			return;
		}
		if ($col_243.equalsIgnoreCase(name)) {
			col_243(value);
			return;
		}
		if ($col_244.equalsIgnoreCase(name)) {
			col_244(value);
			return;
		}
		if ($col_245.equalsIgnoreCase(name)) {
			col_245(value);
			return;
		}
		if ($col_246.equalsIgnoreCase(name)) {
			col_246(value);
			return;
		}
		if ($col_247.equalsIgnoreCase(name)) {
			col_247(value);
			return;
		}
		if ($col_248.equalsIgnoreCase(name)) {
			col_248(value);
			return;
		}
		if ($col_249.equalsIgnoreCase(name)) {
			col_249(value);
			return;
		}
		if ($col_250.equalsIgnoreCase(name)) {
			col_250(value);
			return;
		}
		if ($col_251.equalsIgnoreCase(name)) {
			col_251(value);
			return;
		}
		if ($col_252.equalsIgnoreCase(name)) {
			col_252(value);
			return;
		}
		if ($col_253.equalsIgnoreCase(name)) {
			col_253(value);
			return;
		}
		if ($col_254.equalsIgnoreCase(name)) {
			col_254(value);
			return;
		}
		if ($col_255.equalsIgnoreCase(name)) {
			col_255(value);
			return;
		}
		if ($col_256.equalsIgnoreCase(name)) {
			col_256(value);
			return;
		}
		if ($col_257.equalsIgnoreCase(name)) {
			col_257(value);
			return;
		}
		if ($col_258.equalsIgnoreCase(name)) {
			col_258(value);
			return;
		}
		if ($col_259.equalsIgnoreCase(name)) {
			col_259(value);
			return;
		}
		if ($col_260.equalsIgnoreCase(name)) {
			col_260(value);
			return;
		}
		if ($col_261.equalsIgnoreCase(name)) {
			col_261(value);
			return;
		}
		if ($col_262.equalsIgnoreCase(name)) {
			col_262(value);
			return;
		}
		if ($col_263.equalsIgnoreCase(name)) {
			col_263(value);
			return;
		}
		if ($col_264.equalsIgnoreCase(name)) {
			col_264(value);
			return;
		}
		if ($col_265.equalsIgnoreCase(name)) {
			col_265(value);
			return;
		}
		if ($col_266.equalsIgnoreCase(name)) {
			col_266(value);
			return;
		}
		if ($col_267.equalsIgnoreCase(name)) {
			col_267(value);
			return;
		}
		if ($col_268.equalsIgnoreCase(name)) {
			col_268(value);
			return;
		}
		if ($col_269.equalsIgnoreCase(name)) {
			col_269(value);
			return;
		}
		if ($col_270.equalsIgnoreCase(name)) {
			col_270(value);
			return;
		}
		if ($col_271.equalsIgnoreCase(name)) {
			col_271(value);
			return;
		}
		if ($col_272.equalsIgnoreCase(name)) {
			col_272(value);
			return;
		}
		if ($col_273.equalsIgnoreCase(name)) {
			col_273(value);
			return;
		}
		if ($col_274.equalsIgnoreCase(name)) {
			col_274(value);
			return;
		}
		if ($col_275.equalsIgnoreCase(name)) {
			col_275(value);
			return;
		}
		if ($col_276.equalsIgnoreCase(name)) {
			col_276(value);
			return;
		}
		if ($col_277.equalsIgnoreCase(name)) {
			col_277(value);
			return;
		}
		if ($col_278.equalsIgnoreCase(name)) {
			col_278(value);
			return;
		}
		if ($col_279.equalsIgnoreCase(name)) {
			col_279(value);
			return;
		}
		if ($col_280.equalsIgnoreCase(name)) {
			col_280(value);
			return;
		}
		if ($col_281.equalsIgnoreCase(name)) {
			col_281(value);
			return;
		}
		if ($col_282.equalsIgnoreCase(name)) {
			col_282(value);
			return;
		}
		if ($col_283.equalsIgnoreCase(name)) {
			col_283(value);
			return;
		}
		if ($col_284.equalsIgnoreCase(name)) {
			col_284(value);
			return;
		}
		if ($col_285.equalsIgnoreCase(name)) {
			col_285(value);
			return;
		}
		if ($col_286.equalsIgnoreCase(name)) {
			col_286(value);
			return;
		}
		if ($col_287.equalsIgnoreCase(name)) {
			col_287(value);
			return;
		}
		if ($col_288.equalsIgnoreCase(name)) {
			col_288(value);
			return;
		}
		if ($col_289.equalsIgnoreCase(name)) {
			col_289(value);
			return;
		}
		if ($col_290.equalsIgnoreCase(name)) {
			col_290(value);
			return;
		}
		if ($col_291.equalsIgnoreCase(name)) {
			col_291(value);
			return;
		}
		if ($col_292.equalsIgnoreCase(name)) {
			col_292(value);
			return;
		}
		if ($col_293.equalsIgnoreCase(name)) {
			col_293(value);
			return;
		}
		if ($col_294.equalsIgnoreCase(name)) {
			col_294(value);
			return;
		}
		if ($col_295.equalsIgnoreCase(name)) {
			col_295(value);
			return;
		}
		if ($col_296.equalsIgnoreCase(name)) {
			col_296(value);
			return;
		}
		if ($col_297.equalsIgnoreCase(name)) {
			col_297(value);
			return;
		}
		if ($col_298.equalsIgnoreCase(name)) {
			col_298(value);
			return;
		}
		if ($col_299.equalsIgnoreCase(name)) {
			col_299(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($diff_ttl.equalsIgnoreCase(name)) {
			diff_ttl(value);
			return;
		}
		if ($std_ttl.equalsIgnoreCase(name)) {
			std_ttl(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($diff_var_cost.equalsIgnoreCase(name)) {
			diff_var_cost(value);
			return;
		}
		if ($std_var_cost.equalsIgnoreCase(name)) {
			std_var_cost(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($diff_fxd_cost.equalsIgnoreCase(name)) {
			diff_fxd_cost(value);
			return;
		}
		if ($std_fxd_cost.equalsIgnoreCase(name)) {
			std_fxd_cost(value);
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
		if ($col_105.equalsIgnoreCase(name)) {
			col_105(value);
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
		if ($col_112.equalsIgnoreCase(name)) {
			col_112(value);
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
		if ($col_119.equalsIgnoreCase(name)) {
			col_119(value);
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
		if ($col_126.equalsIgnoreCase(name)) {
			col_126(value);
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
		if ($col_133.equalsIgnoreCase(name)) {
			col_133(value);
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
		if ($col_140.equalsIgnoreCase(name)) {
			col_140(value);
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
		if ($col_147.equalsIgnoreCase(name)) {
			col_147(value);
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
		if ($col_154.equalsIgnoreCase(name)) {
			col_154(value);
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
		if ($col_161.equalsIgnoreCase(name)) {
			col_161(value);
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
		if ($col_168.equalsIgnoreCase(name)) {
			col_168(value);
			return;
		}
		if ($col_169.equalsIgnoreCase(name)) {
			col_169(value);
			return;
		}
		if ($col_170.equalsIgnoreCase(name)) {
			col_170(value);
			return;
		}
		if ($col_171.equalsIgnoreCase(name)) {
			col_171(value);
			return;
		}
		if ($col_172.equalsIgnoreCase(name)) {
			col_172(value);
			return;
		}
		if ($col_173.equalsIgnoreCase(name)) {
			col_173(value);
			return;
		}
		if ($col_174.equalsIgnoreCase(name)) {
			col_174(value);
			return;
		}
		if ($col_175.equalsIgnoreCase(name)) {
			col_175(value);
			return;
		}
		if ($col_176.equalsIgnoreCase(name)) {
			col_176(value);
			return;
		}
		if ($col_177.equalsIgnoreCase(name)) {
			col_177(value);
			return;
		}
		if ($col_178.equalsIgnoreCase(name)) {
			col_178(value);
			return;
		}
		if ($col_179.equalsIgnoreCase(name)) {
			col_179(value);
			return;
		}
		if ($col_180.equalsIgnoreCase(name)) {
			col_180(value);
			return;
		}
		if ($col_181.equalsIgnoreCase(name)) {
			col_181(value);
			return;
		}
		if ($col_182.equalsIgnoreCase(name)) {
			col_182(value);
			return;
		}
		if ($col_183.equalsIgnoreCase(name)) {
			col_183(value);
			return;
		}
		if ($col_184.equalsIgnoreCase(name)) {
			col_184(value);
			return;
		}
		if ($col_185.equalsIgnoreCase(name)) {
			col_185(value);
			return;
		}
		if ($col_186.equalsIgnoreCase(name)) {
			col_186(value);
			return;
		}
		if ($col_187.equalsIgnoreCase(name)) {
			col_187(value);
			return;
		}
		if ($col_188.equalsIgnoreCase(name)) {
			col_188(value);
			return;
		}
		if ($col_189.equalsIgnoreCase(name)) {
			col_189(value);
			return;
		}
		if ($col_190.equalsIgnoreCase(name)) {
			col_190(value);
			return;
		}
		if ($col_191.equalsIgnoreCase(name)) {
			col_191(value);
			return;
		}
		if ($col_192.equalsIgnoreCase(name)) {
			col_192(value);
			return;
		}
		if ($col_193.equalsIgnoreCase(name)) {
			col_193(value);
			return;
		}
		if ($col_194.equalsIgnoreCase(name)) {
			col_194(value);
			return;
		}
		if ($col_195.equalsIgnoreCase(name)) {
			col_195(value);
			return;
		}
		if ($col_196.equalsIgnoreCase(name)) {
			col_196(value);
			return;
		}
		if ($col_197.equalsIgnoreCase(name)) {
			col_197(value);
			return;
		}
		if ($col_198.equalsIgnoreCase(name)) {
			col_198(value);
			return;
		}
		if ($col_199.equalsIgnoreCase(name)) {
			col_199(value);
			return;
		}
		if ($col_200.equalsIgnoreCase(name)) {
			col_200(value);
			return;
		}
		if ($col_201.equalsIgnoreCase(name)) {
			col_201(value);
			return;
		}
		if ($col_202.equalsIgnoreCase(name)) {
			col_202(value);
			return;
		}
		if ($col_203.equalsIgnoreCase(name)) {
			col_203(value);
			return;
		}
		if ($col_204.equalsIgnoreCase(name)) {
			col_204(value);
			return;
		}
		if ($col_205.equalsIgnoreCase(name)) {
			col_205(value);
			return;
		}
		if ($col_206.equalsIgnoreCase(name)) {
			col_206(value);
			return;
		}
		if ($col_207.equalsIgnoreCase(name)) {
			col_207(value);
			return;
		}
		if ($col_208.equalsIgnoreCase(name)) {
			col_208(value);
			return;
		}
		if ($col_209.equalsIgnoreCase(name)) {
			col_209(value);
			return;
		}
		if ($col_210.equalsIgnoreCase(name)) {
			col_210(value);
			return;
		}
		if ($col_211.equalsIgnoreCase(name)) {
			col_211(value);
			return;
		}
		if ($col_212.equalsIgnoreCase(name)) {
			col_212(value);
			return;
		}
		if ($col_213.equalsIgnoreCase(name)) {
			col_213(value);
			return;
		}
		if ($col_214.equalsIgnoreCase(name)) {
			col_214(value);
			return;
		}
		if ($col_215.equalsIgnoreCase(name)) {
			col_215(value);
			return;
		}
		if ($col_216.equalsIgnoreCase(name)) {
			col_216(value);
			return;
		}
		if ($col_217.equalsIgnoreCase(name)) {
			col_217(value);
			return;
		}
		if ($col_218.equalsIgnoreCase(name)) {
			col_218(value);
			return;
		}
		if ($col_219.equalsIgnoreCase(name)) {
			col_219(value);
			return;
		}
		if ($col_220.equalsIgnoreCase(name)) {
			col_220(value);
			return;
		}
		if ($col_221.equalsIgnoreCase(name)) {
			col_221(value);
			return;
		}
		if ($col_222.equalsIgnoreCase(name)) {
			col_222(value);
			return;
		}
		if ($col_223.equalsIgnoreCase(name)) {
			col_223(value);
			return;
		}
		if ($col_224.equalsIgnoreCase(name)) {
			col_224(value);
			return;
		}
		if ($col_225.equalsIgnoreCase(name)) {
			col_225(value);
			return;
		}
		if ($col_226.equalsIgnoreCase(name)) {
			col_226(value);
			return;
		}
		if ($col_227.equalsIgnoreCase(name)) {
			col_227(value);
			return;
		}
		if ($col_228.equalsIgnoreCase(name)) {
			col_228(value);
			return;
		}
		if ($col_229.equalsIgnoreCase(name)) {
			col_229(value);
			return;
		}
		if ($col_230.equalsIgnoreCase(name)) {
			col_230(value);
			return;
		}
		if ($col_231.equalsIgnoreCase(name)) {
			col_231(value);
			return;
		}
		if ($col_232.equalsIgnoreCase(name)) {
			col_232(value);
			return;
		}
		if ($col_233.equalsIgnoreCase(name)) {
			col_233(value);
			return;
		}
		if ($col_234.equalsIgnoreCase(name)) {
			col_234(value);
			return;
		}
		if ($col_235.equalsIgnoreCase(name)) {
			col_235(value);
			return;
		}
		if ($col_236.equalsIgnoreCase(name)) {
			col_236(value);
			return;
		}
		if ($col_237.equalsIgnoreCase(name)) {
			col_237(value);
			return;
		}
		if ($col_238.equalsIgnoreCase(name)) {
			col_238(value);
			return;
		}
		if ($col_239.equalsIgnoreCase(name)) {
			col_239(value);
			return;
		}
		if ($col_240.equalsIgnoreCase(name)) {
			col_240(value);
			return;
		}
		if ($col_241.equalsIgnoreCase(name)) {
			col_241(value);
			return;
		}
		if ($col_242.equalsIgnoreCase(name)) {
			col_242(value);
			return;
		}
		if ($col_243.equalsIgnoreCase(name)) {
			col_243(value);
			return;
		}
		if ($col_244.equalsIgnoreCase(name)) {
			col_244(value);
			return;
		}
		if ($col_245.equalsIgnoreCase(name)) {
			col_245(value);
			return;
		}
		if ($col_246.equalsIgnoreCase(name)) {
			col_246(value);
			return;
		}
		if ($col_247.equalsIgnoreCase(name)) {
			col_247(value);
			return;
		}
		if ($col_248.equalsIgnoreCase(name)) {
			col_248(value);
			return;
		}
		if ($col_249.equalsIgnoreCase(name)) {
			col_249(value);
			return;
		}
		if ($col_250.equalsIgnoreCase(name)) {
			col_250(value);
			return;
		}
		if ($col_251.equalsIgnoreCase(name)) {
			col_251(value);
			return;
		}
		if ($col_252.equalsIgnoreCase(name)) {
			col_252(value);
			return;
		}
		if ($col_253.equalsIgnoreCase(name)) {
			col_253(value);
			return;
		}
		if ($col_254.equalsIgnoreCase(name)) {
			col_254(value);
			return;
		}
		if ($col_255.equalsIgnoreCase(name)) {
			col_255(value);
			return;
		}
		if ($col_256.equalsIgnoreCase(name)) {
			col_256(value);
			return;
		}
		if ($col_257.equalsIgnoreCase(name)) {
			col_257(value);
			return;
		}
		if ($col_258.equalsIgnoreCase(name)) {
			col_258(value);
			return;
		}
		if ($col_259.equalsIgnoreCase(name)) {
			col_259(value);
			return;
		}
		if ($col_260.equalsIgnoreCase(name)) {
			col_260(value);
			return;
		}
		if ($col_261.equalsIgnoreCase(name)) {
			col_261(value);
			return;
		}
		if ($col_262.equalsIgnoreCase(name)) {
			col_262(value);
			return;
		}
		if ($col_263.equalsIgnoreCase(name)) {
			col_263(value);
			return;
		}
		if ($col_264.equalsIgnoreCase(name)) {
			col_264(value);
			return;
		}
		if ($col_265.equalsIgnoreCase(name)) {
			col_265(value);
			return;
		}
		if ($col_266.equalsIgnoreCase(name)) {
			col_266(value);
			return;
		}
		if ($col_267.equalsIgnoreCase(name)) {
			col_267(value);
			return;
		}
		if ($col_268.equalsIgnoreCase(name)) {
			col_268(value);
			return;
		}
		if ($col_269.equalsIgnoreCase(name)) {
			col_269(value);
			return;
		}
		if ($col_270.equalsIgnoreCase(name)) {
			col_270(value);
			return;
		}
		if ($col_271.equalsIgnoreCase(name)) {
			col_271(value);
			return;
		}
		if ($col_272.equalsIgnoreCase(name)) {
			col_272(value);
			return;
		}
		if ($col_273.equalsIgnoreCase(name)) {
			col_273(value);
			return;
		}
		if ($col_274.equalsIgnoreCase(name)) {
			col_274(value);
			return;
		}
		if ($col_275.equalsIgnoreCase(name)) {
			col_275(value);
			return;
		}
		if ($col_276.equalsIgnoreCase(name)) {
			col_276(value);
			return;
		}
		if ($col_277.equalsIgnoreCase(name)) {
			col_277(value);
			return;
		}
		if ($col_278.equalsIgnoreCase(name)) {
			col_278(value);
			return;
		}
		if ($col_279.equalsIgnoreCase(name)) {
			col_279(value);
			return;
		}
		if ($col_280.equalsIgnoreCase(name)) {
			col_280(value);
			return;
		}
		if ($col_281.equalsIgnoreCase(name)) {
			col_281(value);
			return;
		}
		if ($col_282.equalsIgnoreCase(name)) {
			col_282(value);
			return;
		}
		if ($col_283.equalsIgnoreCase(name)) {
			col_283(value);
			return;
		}
		if ($col_284.equalsIgnoreCase(name)) {
			col_284(value);
			return;
		}
		if ($col_285.equalsIgnoreCase(name)) {
			col_285(value);
			return;
		}
		if ($col_286.equalsIgnoreCase(name)) {
			col_286(value);
			return;
		}
		if ($col_287.equalsIgnoreCase(name)) {
			col_287(value);
			return;
		}
		if ($col_288.equalsIgnoreCase(name)) {
			col_288(value);
			return;
		}
		if ($col_289.equalsIgnoreCase(name)) {
			col_289(value);
			return;
		}
		if ($col_290.equalsIgnoreCase(name)) {
			col_290(value);
			return;
		}
		if ($col_291.equalsIgnoreCase(name)) {
			col_291(value);
			return;
		}
		if ($col_292.equalsIgnoreCase(name)) {
			col_292(value);
			return;
		}
		if ($col_293.equalsIgnoreCase(name)) {
			col_293(value);
			return;
		}
		if ($col_294.equalsIgnoreCase(name)) {
			col_294(value);
			return;
		}
		if ($col_295.equalsIgnoreCase(name)) {
			col_295(value);
			return;
		}
		if ($col_296.equalsIgnoreCase(name)) {
			col_296(value);
			return;
		}
		if ($col_297.equalsIgnoreCase(name)) {
			col_297(value);
			return;
		}
		if ($col_298.equalsIgnoreCase(name)) {
			col_298(value);
			return;
		}
		if ($col_299.equalsIgnoreCase(name)) {
			col_299(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($diff_ttl.equalsIgnoreCase(name)) {
			diff_ttl(value);
			return;
		}
		if ($std_ttl.equalsIgnoreCase(name)) {
			std_ttl(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($diff_var_cost.equalsIgnoreCase(name)) {
			diff_var_cost(value);
			return;
		}
		if ($std_var_cost.equalsIgnoreCase(name)) {
			std_var_cost(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($diff_fxd_cost.equalsIgnoreCase(name)) {
			diff_fxd_cost(value);
			return;
		}
		if ($std_fxd_cost.equalsIgnoreCase(name)) {
			std_fxd_cost(value);
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
		if ($col_105.equalsIgnoreCase(name)) {
			col_105(value);
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
		if ($col_112.equalsIgnoreCase(name)) {
			col_112(value);
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
		if ($col_119.equalsIgnoreCase(name)) {
			col_119(value);
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
		if ($col_126.equalsIgnoreCase(name)) {
			col_126(value);
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
		if ($col_133.equalsIgnoreCase(name)) {
			col_133(value);
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
		if ($col_140.equalsIgnoreCase(name)) {
			col_140(value);
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
		if ($col_147.equalsIgnoreCase(name)) {
			col_147(value);
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
		if ($col_154.equalsIgnoreCase(name)) {
			col_154(value);
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
		if ($col_161.equalsIgnoreCase(name)) {
			col_161(value);
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
		if ($col_168.equalsIgnoreCase(name)) {
			col_168(value);
			return;
		}
		if ($col_169.equalsIgnoreCase(name)) {
			col_169(value);
			return;
		}
		if ($col_170.equalsIgnoreCase(name)) {
			col_170(value);
			return;
		}
		if ($col_171.equalsIgnoreCase(name)) {
			col_171(value);
			return;
		}
		if ($col_172.equalsIgnoreCase(name)) {
			col_172(value);
			return;
		}
		if ($col_173.equalsIgnoreCase(name)) {
			col_173(value);
			return;
		}
		if ($col_174.equalsIgnoreCase(name)) {
			col_174(value);
			return;
		}
		if ($col_175.equalsIgnoreCase(name)) {
			col_175(value);
			return;
		}
		if ($col_176.equalsIgnoreCase(name)) {
			col_176(value);
			return;
		}
		if ($col_177.equalsIgnoreCase(name)) {
			col_177(value);
			return;
		}
		if ($col_178.equalsIgnoreCase(name)) {
			col_178(value);
			return;
		}
		if ($col_179.equalsIgnoreCase(name)) {
			col_179(value);
			return;
		}
		if ($col_180.equalsIgnoreCase(name)) {
			col_180(value);
			return;
		}
		if ($col_181.equalsIgnoreCase(name)) {
			col_181(value);
			return;
		}
		if ($col_182.equalsIgnoreCase(name)) {
			col_182(value);
			return;
		}
		if ($col_183.equalsIgnoreCase(name)) {
			col_183(value);
			return;
		}
		if ($col_184.equalsIgnoreCase(name)) {
			col_184(value);
			return;
		}
		if ($col_185.equalsIgnoreCase(name)) {
			col_185(value);
			return;
		}
		if ($col_186.equalsIgnoreCase(name)) {
			col_186(value);
			return;
		}
		if ($col_187.equalsIgnoreCase(name)) {
			col_187(value);
			return;
		}
		if ($col_188.equalsIgnoreCase(name)) {
			col_188(value);
			return;
		}
		if ($col_189.equalsIgnoreCase(name)) {
			col_189(value);
			return;
		}
		if ($col_190.equalsIgnoreCase(name)) {
			col_190(value);
			return;
		}
		if ($col_191.equalsIgnoreCase(name)) {
			col_191(value);
			return;
		}
		if ($col_192.equalsIgnoreCase(name)) {
			col_192(value);
			return;
		}
		if ($col_193.equalsIgnoreCase(name)) {
			col_193(value);
			return;
		}
		if ($col_194.equalsIgnoreCase(name)) {
			col_194(value);
			return;
		}
		if ($col_195.equalsIgnoreCase(name)) {
			col_195(value);
			return;
		}
		if ($col_196.equalsIgnoreCase(name)) {
			col_196(value);
			return;
		}
		if ($col_197.equalsIgnoreCase(name)) {
			col_197(value);
			return;
		}
		if ($col_198.equalsIgnoreCase(name)) {
			col_198(value);
			return;
		}
		if ($col_199.equalsIgnoreCase(name)) {
			col_199(value);
			return;
		}
		if ($col_200.equalsIgnoreCase(name)) {
			col_200(value);
			return;
		}
		if ($col_201.equalsIgnoreCase(name)) {
			col_201(value);
			return;
		}
		if ($col_202.equalsIgnoreCase(name)) {
			col_202(value);
			return;
		}
		if ($col_203.equalsIgnoreCase(name)) {
			col_203(value);
			return;
		}
		if ($col_204.equalsIgnoreCase(name)) {
			col_204(value);
			return;
		}
		if ($col_205.equalsIgnoreCase(name)) {
			col_205(value);
			return;
		}
		if ($col_206.equalsIgnoreCase(name)) {
			col_206(value);
			return;
		}
		if ($col_207.equalsIgnoreCase(name)) {
			col_207(value);
			return;
		}
		if ($col_208.equalsIgnoreCase(name)) {
			col_208(value);
			return;
		}
		if ($col_209.equalsIgnoreCase(name)) {
			col_209(value);
			return;
		}
		if ($col_210.equalsIgnoreCase(name)) {
			col_210(value);
			return;
		}
		if ($col_211.equalsIgnoreCase(name)) {
			col_211(value);
			return;
		}
		if ($col_212.equalsIgnoreCase(name)) {
			col_212(value);
			return;
		}
		if ($col_213.equalsIgnoreCase(name)) {
			col_213(value);
			return;
		}
		if ($col_214.equalsIgnoreCase(name)) {
			col_214(value);
			return;
		}
		if ($col_215.equalsIgnoreCase(name)) {
			col_215(value);
			return;
		}
		if ($col_216.equalsIgnoreCase(name)) {
			col_216(value);
			return;
		}
		if ($col_217.equalsIgnoreCase(name)) {
			col_217(value);
			return;
		}
		if ($col_218.equalsIgnoreCase(name)) {
			col_218(value);
			return;
		}
		if ($col_219.equalsIgnoreCase(name)) {
			col_219(value);
			return;
		}
		if ($col_220.equalsIgnoreCase(name)) {
			col_220(value);
			return;
		}
		if ($col_221.equalsIgnoreCase(name)) {
			col_221(value);
			return;
		}
		if ($col_222.equalsIgnoreCase(name)) {
			col_222(value);
			return;
		}
		if ($col_223.equalsIgnoreCase(name)) {
			col_223(value);
			return;
		}
		if ($col_224.equalsIgnoreCase(name)) {
			col_224(value);
			return;
		}
		if ($col_225.equalsIgnoreCase(name)) {
			col_225(value);
			return;
		}
		if ($col_226.equalsIgnoreCase(name)) {
			col_226(value);
			return;
		}
		if ($col_227.equalsIgnoreCase(name)) {
			col_227(value);
			return;
		}
		if ($col_228.equalsIgnoreCase(name)) {
			col_228(value);
			return;
		}
		if ($col_229.equalsIgnoreCase(name)) {
			col_229(value);
			return;
		}
		if ($col_230.equalsIgnoreCase(name)) {
			col_230(value);
			return;
		}
		if ($col_231.equalsIgnoreCase(name)) {
			col_231(value);
			return;
		}
		if ($col_232.equalsIgnoreCase(name)) {
			col_232(value);
			return;
		}
		if ($col_233.equalsIgnoreCase(name)) {
			col_233(value);
			return;
		}
		if ($col_234.equalsIgnoreCase(name)) {
			col_234(value);
			return;
		}
		if ($col_235.equalsIgnoreCase(name)) {
			col_235(value);
			return;
		}
		if ($col_236.equalsIgnoreCase(name)) {
			col_236(value);
			return;
		}
		if ($col_237.equalsIgnoreCase(name)) {
			col_237(value);
			return;
		}
		if ($col_238.equalsIgnoreCase(name)) {
			col_238(value);
			return;
		}
		if ($col_239.equalsIgnoreCase(name)) {
			col_239(value);
			return;
		}
		if ($col_240.equalsIgnoreCase(name)) {
			col_240(value);
			return;
		}
		if ($col_241.equalsIgnoreCase(name)) {
			col_241(value);
			return;
		}
		if ($col_242.equalsIgnoreCase(name)) {
			col_242(value);
			return;
		}
		if ($col_243.equalsIgnoreCase(name)) {
			col_243(value);
			return;
		}
		if ($col_244.equalsIgnoreCase(name)) {
			col_244(value);
			return;
		}
		if ($col_245.equalsIgnoreCase(name)) {
			col_245(value);
			return;
		}
		if ($col_246.equalsIgnoreCase(name)) {
			col_246(value);
			return;
		}
		if ($col_247.equalsIgnoreCase(name)) {
			col_247(value);
			return;
		}
		if ($col_248.equalsIgnoreCase(name)) {
			col_248(value);
			return;
		}
		if ($col_249.equalsIgnoreCase(name)) {
			col_249(value);
			return;
		}
		if ($col_250.equalsIgnoreCase(name)) {
			col_250(value);
			return;
		}
		if ($col_251.equalsIgnoreCase(name)) {
			col_251(value);
			return;
		}
		if ($col_252.equalsIgnoreCase(name)) {
			col_252(value);
			return;
		}
		if ($col_253.equalsIgnoreCase(name)) {
			col_253(value);
			return;
		}
		if ($col_254.equalsIgnoreCase(name)) {
			col_254(value);
			return;
		}
		if ($col_255.equalsIgnoreCase(name)) {
			col_255(value);
			return;
		}
		if ($col_256.equalsIgnoreCase(name)) {
			col_256(value);
			return;
		}
		if ($col_257.equalsIgnoreCase(name)) {
			col_257(value);
			return;
		}
		if ($col_258.equalsIgnoreCase(name)) {
			col_258(value);
			return;
		}
		if ($col_259.equalsIgnoreCase(name)) {
			col_259(value);
			return;
		}
		if ($col_260.equalsIgnoreCase(name)) {
			col_260(value);
			return;
		}
		if ($col_261.equalsIgnoreCase(name)) {
			col_261(value);
			return;
		}
		if ($col_262.equalsIgnoreCase(name)) {
			col_262(value);
			return;
		}
		if ($col_263.equalsIgnoreCase(name)) {
			col_263(value);
			return;
		}
		if ($col_264.equalsIgnoreCase(name)) {
			col_264(value);
			return;
		}
		if ($col_265.equalsIgnoreCase(name)) {
			col_265(value);
			return;
		}
		if ($col_266.equalsIgnoreCase(name)) {
			col_266(value);
			return;
		}
		if ($col_267.equalsIgnoreCase(name)) {
			col_267(value);
			return;
		}
		if ($col_268.equalsIgnoreCase(name)) {
			col_268(value);
			return;
		}
		if ($col_269.equalsIgnoreCase(name)) {
			col_269(value);
			return;
		}
		if ($col_270.equalsIgnoreCase(name)) {
			col_270(value);
			return;
		}
		if ($col_271.equalsIgnoreCase(name)) {
			col_271(value);
			return;
		}
		if ($col_272.equalsIgnoreCase(name)) {
			col_272(value);
			return;
		}
		if ($col_273.equalsIgnoreCase(name)) {
			col_273(value);
			return;
		}
		if ($col_274.equalsIgnoreCase(name)) {
			col_274(value);
			return;
		}
		if ($col_275.equalsIgnoreCase(name)) {
			col_275(value);
			return;
		}
		if ($col_276.equalsIgnoreCase(name)) {
			col_276(value);
			return;
		}
		if ($col_277.equalsIgnoreCase(name)) {
			col_277(value);
			return;
		}
		if ($col_278.equalsIgnoreCase(name)) {
			col_278(value);
			return;
		}
		if ($col_279.equalsIgnoreCase(name)) {
			col_279(value);
			return;
		}
		if ($col_280.equalsIgnoreCase(name)) {
			col_280(value);
			return;
		}
		if ($col_281.equalsIgnoreCase(name)) {
			col_281(value);
			return;
		}
		if ($col_282.equalsIgnoreCase(name)) {
			col_282(value);
			return;
		}
		if ($col_283.equalsIgnoreCase(name)) {
			col_283(value);
			return;
		}
		if ($col_284.equalsIgnoreCase(name)) {
			col_284(value);
			return;
		}
		if ($col_285.equalsIgnoreCase(name)) {
			col_285(value);
			return;
		}
		if ($col_286.equalsIgnoreCase(name)) {
			col_286(value);
			return;
		}
		if ($col_287.equalsIgnoreCase(name)) {
			col_287(value);
			return;
		}
		if ($col_288.equalsIgnoreCase(name)) {
			col_288(value);
			return;
		}
		if ($col_289.equalsIgnoreCase(name)) {
			col_289(value);
			return;
		}
		if ($col_290.equalsIgnoreCase(name)) {
			col_290(value);
			return;
		}
		if ($col_291.equalsIgnoreCase(name)) {
			col_291(value);
			return;
		}
		if ($col_292.equalsIgnoreCase(name)) {
			col_292(value);
			return;
		}
		if ($col_293.equalsIgnoreCase(name)) {
			col_293(value);
			return;
		}
		if ($col_294.equalsIgnoreCase(name)) {
			col_294(value);
			return;
		}
		if ($col_295.equalsIgnoreCase(name)) {
			col_295(value);
			return;
		}
		if ($col_296.equalsIgnoreCase(name)) {
			col_296(value);
			return;
		}
		if ($col_297.equalsIgnoreCase(name)) {
			col_297(value);
			return;
		}
		if ($col_298.equalsIgnoreCase(name)) {
			col_298(value);
			return;
		}
		if ($col_299.equalsIgnoreCase(name)) {
			col_299(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($diff_ttl.equalsIgnoreCase(name)) {
			diff_ttl(value);
			return;
		}
		if ($std_ttl.equalsIgnoreCase(name)) {
			std_ttl(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($diff_var_cost.equalsIgnoreCase(name)) {
			diff_var_cost(value);
			return;
		}
		if ($std_var_cost.equalsIgnoreCase(name)) {
			std_var_cost(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($diff_fxd_cost.equalsIgnoreCase(name)) {
			diff_fxd_cost(value);
			return;
		}
		if ($std_fxd_cost.equalsIgnoreCase(name)) {
			std_fxd_cost(value);
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
		if ($col_105.equalsIgnoreCase(name)) {
			col_105(value);
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
		if ($col_112.equalsIgnoreCase(name)) {
			col_112(value);
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
		if ($col_119.equalsIgnoreCase(name)) {
			col_119(value);
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
		if ($col_126.equalsIgnoreCase(name)) {
			col_126(value);
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
		if ($col_133.equalsIgnoreCase(name)) {
			col_133(value);
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
		if ($col_140.equalsIgnoreCase(name)) {
			col_140(value);
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
		if ($col_147.equalsIgnoreCase(name)) {
			col_147(value);
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
		if ($col_154.equalsIgnoreCase(name)) {
			col_154(value);
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
		if ($col_161.equalsIgnoreCase(name)) {
			col_161(value);
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
		if ($col_168.equalsIgnoreCase(name)) {
			col_168(value);
			return;
		}
		if ($col_169.equalsIgnoreCase(name)) {
			col_169(value);
			return;
		}
		if ($col_170.equalsIgnoreCase(name)) {
			col_170(value);
			return;
		}
		if ($col_171.equalsIgnoreCase(name)) {
			col_171(value);
			return;
		}
		if ($col_172.equalsIgnoreCase(name)) {
			col_172(value);
			return;
		}
		if ($col_173.equalsIgnoreCase(name)) {
			col_173(value);
			return;
		}
		if ($col_174.equalsIgnoreCase(name)) {
			col_174(value);
			return;
		}
		if ($col_175.equalsIgnoreCase(name)) {
			col_175(value);
			return;
		}
		if ($col_176.equalsIgnoreCase(name)) {
			col_176(value);
			return;
		}
		if ($col_177.equalsIgnoreCase(name)) {
			col_177(value);
			return;
		}
		if ($col_178.equalsIgnoreCase(name)) {
			col_178(value);
			return;
		}
		if ($col_179.equalsIgnoreCase(name)) {
			col_179(value);
			return;
		}
		if ($col_180.equalsIgnoreCase(name)) {
			col_180(value);
			return;
		}
		if ($col_181.equalsIgnoreCase(name)) {
			col_181(value);
			return;
		}
		if ($col_182.equalsIgnoreCase(name)) {
			col_182(value);
			return;
		}
		if ($col_183.equalsIgnoreCase(name)) {
			col_183(value);
			return;
		}
		if ($col_184.equalsIgnoreCase(name)) {
			col_184(value);
			return;
		}
		if ($col_185.equalsIgnoreCase(name)) {
			col_185(value);
			return;
		}
		if ($col_186.equalsIgnoreCase(name)) {
			col_186(value);
			return;
		}
		if ($col_187.equalsIgnoreCase(name)) {
			col_187(value);
			return;
		}
		if ($col_188.equalsIgnoreCase(name)) {
			col_188(value);
			return;
		}
		if ($col_189.equalsIgnoreCase(name)) {
			col_189(value);
			return;
		}
		if ($col_190.equalsIgnoreCase(name)) {
			col_190(value);
			return;
		}
		if ($col_191.equalsIgnoreCase(name)) {
			col_191(value);
			return;
		}
		if ($col_192.equalsIgnoreCase(name)) {
			col_192(value);
			return;
		}
		if ($col_193.equalsIgnoreCase(name)) {
			col_193(value);
			return;
		}
		if ($col_194.equalsIgnoreCase(name)) {
			col_194(value);
			return;
		}
		if ($col_195.equalsIgnoreCase(name)) {
			col_195(value);
			return;
		}
		if ($col_196.equalsIgnoreCase(name)) {
			col_196(value);
			return;
		}
		if ($col_197.equalsIgnoreCase(name)) {
			col_197(value);
			return;
		}
		if ($col_198.equalsIgnoreCase(name)) {
			col_198(value);
			return;
		}
		if ($col_199.equalsIgnoreCase(name)) {
			col_199(value);
			return;
		}
		if ($col_200.equalsIgnoreCase(name)) {
			col_200(value);
			return;
		}
		if ($col_201.equalsIgnoreCase(name)) {
			col_201(value);
			return;
		}
		if ($col_202.equalsIgnoreCase(name)) {
			col_202(value);
			return;
		}
		if ($col_203.equalsIgnoreCase(name)) {
			col_203(value);
			return;
		}
		if ($col_204.equalsIgnoreCase(name)) {
			col_204(value);
			return;
		}
		if ($col_205.equalsIgnoreCase(name)) {
			col_205(value);
			return;
		}
		if ($col_206.equalsIgnoreCase(name)) {
			col_206(value);
			return;
		}
		if ($col_207.equalsIgnoreCase(name)) {
			col_207(value);
			return;
		}
		if ($col_208.equalsIgnoreCase(name)) {
			col_208(value);
			return;
		}
		if ($col_209.equalsIgnoreCase(name)) {
			col_209(value);
			return;
		}
		if ($col_210.equalsIgnoreCase(name)) {
			col_210(value);
			return;
		}
		if ($col_211.equalsIgnoreCase(name)) {
			col_211(value);
			return;
		}
		if ($col_212.equalsIgnoreCase(name)) {
			col_212(value);
			return;
		}
		if ($col_213.equalsIgnoreCase(name)) {
			col_213(value);
			return;
		}
		if ($col_214.equalsIgnoreCase(name)) {
			col_214(value);
			return;
		}
		if ($col_215.equalsIgnoreCase(name)) {
			col_215(value);
			return;
		}
		if ($col_216.equalsIgnoreCase(name)) {
			col_216(value);
			return;
		}
		if ($col_217.equalsIgnoreCase(name)) {
			col_217(value);
			return;
		}
		if ($col_218.equalsIgnoreCase(name)) {
			col_218(value);
			return;
		}
		if ($col_219.equalsIgnoreCase(name)) {
			col_219(value);
			return;
		}
		if ($col_220.equalsIgnoreCase(name)) {
			col_220(value);
			return;
		}
		if ($col_221.equalsIgnoreCase(name)) {
			col_221(value);
			return;
		}
		if ($col_222.equalsIgnoreCase(name)) {
			col_222(value);
			return;
		}
		if ($col_223.equalsIgnoreCase(name)) {
			col_223(value);
			return;
		}
		if ($col_224.equalsIgnoreCase(name)) {
			col_224(value);
			return;
		}
		if ($col_225.equalsIgnoreCase(name)) {
			col_225(value);
			return;
		}
		if ($col_226.equalsIgnoreCase(name)) {
			col_226(value);
			return;
		}
		if ($col_227.equalsIgnoreCase(name)) {
			col_227(value);
			return;
		}
		if ($col_228.equalsIgnoreCase(name)) {
			col_228(value);
			return;
		}
		if ($col_229.equalsIgnoreCase(name)) {
			col_229(value);
			return;
		}
		if ($col_230.equalsIgnoreCase(name)) {
			col_230(value);
			return;
		}
		if ($col_231.equalsIgnoreCase(name)) {
			col_231(value);
			return;
		}
		if ($col_232.equalsIgnoreCase(name)) {
			col_232(value);
			return;
		}
		if ($col_233.equalsIgnoreCase(name)) {
			col_233(value);
			return;
		}
		if ($col_234.equalsIgnoreCase(name)) {
			col_234(value);
			return;
		}
		if ($col_235.equalsIgnoreCase(name)) {
			col_235(value);
			return;
		}
		if ($col_236.equalsIgnoreCase(name)) {
			col_236(value);
			return;
		}
		if ($col_237.equalsIgnoreCase(name)) {
			col_237(value);
			return;
		}
		if ($col_238.equalsIgnoreCase(name)) {
			col_238(value);
			return;
		}
		if ($col_239.equalsIgnoreCase(name)) {
			col_239(value);
			return;
		}
		if ($col_240.equalsIgnoreCase(name)) {
			col_240(value);
			return;
		}
		if ($col_241.equalsIgnoreCase(name)) {
			col_241(value);
			return;
		}
		if ($col_242.equalsIgnoreCase(name)) {
			col_242(value);
			return;
		}
		if ($col_243.equalsIgnoreCase(name)) {
			col_243(value);
			return;
		}
		if ($col_244.equalsIgnoreCase(name)) {
			col_244(value);
			return;
		}
		if ($col_245.equalsIgnoreCase(name)) {
			col_245(value);
			return;
		}
		if ($col_246.equalsIgnoreCase(name)) {
			col_246(value);
			return;
		}
		if ($col_247.equalsIgnoreCase(name)) {
			col_247(value);
			return;
		}
		if ($col_248.equalsIgnoreCase(name)) {
			col_248(value);
			return;
		}
		if ($col_249.equalsIgnoreCase(name)) {
			col_249(value);
			return;
		}
		if ($col_250.equalsIgnoreCase(name)) {
			col_250(value);
			return;
		}
		if ($col_251.equalsIgnoreCase(name)) {
			col_251(value);
			return;
		}
		if ($col_252.equalsIgnoreCase(name)) {
			col_252(value);
			return;
		}
		if ($col_253.equalsIgnoreCase(name)) {
			col_253(value);
			return;
		}
		if ($col_254.equalsIgnoreCase(name)) {
			col_254(value);
			return;
		}
		if ($col_255.equalsIgnoreCase(name)) {
			col_255(value);
			return;
		}
		if ($col_256.equalsIgnoreCase(name)) {
			col_256(value);
			return;
		}
		if ($col_257.equalsIgnoreCase(name)) {
			col_257(value);
			return;
		}
		if ($col_258.equalsIgnoreCase(name)) {
			col_258(value);
			return;
		}
		if ($col_259.equalsIgnoreCase(name)) {
			col_259(value);
			return;
		}
		if ($col_260.equalsIgnoreCase(name)) {
			col_260(value);
			return;
		}
		if ($col_261.equalsIgnoreCase(name)) {
			col_261(value);
			return;
		}
		if ($col_262.equalsIgnoreCase(name)) {
			col_262(value);
			return;
		}
		if ($col_263.equalsIgnoreCase(name)) {
			col_263(value);
			return;
		}
		if ($col_264.equalsIgnoreCase(name)) {
			col_264(value);
			return;
		}
		if ($col_265.equalsIgnoreCase(name)) {
			col_265(value);
			return;
		}
		if ($col_266.equalsIgnoreCase(name)) {
			col_266(value);
			return;
		}
		if ($col_267.equalsIgnoreCase(name)) {
			col_267(value);
			return;
		}
		if ($col_268.equalsIgnoreCase(name)) {
			col_268(value);
			return;
		}
		if ($col_269.equalsIgnoreCase(name)) {
			col_269(value);
			return;
		}
		if ($col_270.equalsIgnoreCase(name)) {
			col_270(value);
			return;
		}
		if ($col_271.equalsIgnoreCase(name)) {
			col_271(value);
			return;
		}
		if ($col_272.equalsIgnoreCase(name)) {
			col_272(value);
			return;
		}
		if ($col_273.equalsIgnoreCase(name)) {
			col_273(value);
			return;
		}
		if ($col_274.equalsIgnoreCase(name)) {
			col_274(value);
			return;
		}
		if ($col_275.equalsIgnoreCase(name)) {
			col_275(value);
			return;
		}
		if ($col_276.equalsIgnoreCase(name)) {
			col_276(value);
			return;
		}
		if ($col_277.equalsIgnoreCase(name)) {
			col_277(value);
			return;
		}
		if ($col_278.equalsIgnoreCase(name)) {
			col_278(value);
			return;
		}
		if ($col_279.equalsIgnoreCase(name)) {
			col_279(value);
			return;
		}
		if ($col_280.equalsIgnoreCase(name)) {
			col_280(value);
			return;
		}
		if ($col_281.equalsIgnoreCase(name)) {
			col_281(value);
			return;
		}
		if ($col_282.equalsIgnoreCase(name)) {
			col_282(value);
			return;
		}
		if ($col_283.equalsIgnoreCase(name)) {
			col_283(value);
			return;
		}
		if ($col_284.equalsIgnoreCase(name)) {
			col_284(value);
			return;
		}
		if ($col_285.equalsIgnoreCase(name)) {
			col_285(value);
			return;
		}
		if ($col_286.equalsIgnoreCase(name)) {
			col_286(value);
			return;
		}
		if ($col_287.equalsIgnoreCase(name)) {
			col_287(value);
			return;
		}
		if ($col_288.equalsIgnoreCase(name)) {
			col_288(value);
			return;
		}
		if ($col_289.equalsIgnoreCase(name)) {
			col_289(value);
			return;
		}
		if ($col_290.equalsIgnoreCase(name)) {
			col_290(value);
			return;
		}
		if ($col_291.equalsIgnoreCase(name)) {
			col_291(value);
			return;
		}
		if ($col_292.equalsIgnoreCase(name)) {
			col_292(value);
			return;
		}
		if ($col_293.equalsIgnoreCase(name)) {
			col_293(value);
			return;
		}
		if ($col_294.equalsIgnoreCase(name)) {
			col_294(value);
			return;
		}
		if ($col_295.equalsIgnoreCase(name)) {
			col_295(value);
			return;
		}
		if ($col_296.equalsIgnoreCase(name)) {
			col_296(value);
			return;
		}
		if ($col_297.equalsIgnoreCase(name)) {
			col_297(value);
			return;
		}
		if ($col_298.equalsIgnoreCase(name)) {
			col_298(value);
			return;
		}
		if ($col_299.equalsIgnoreCase(name)) {
			col_299(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($qty_diff_p.equalsIgnoreCase(name)) {
			return qty_diff_p();
		}
		if ($std_qty_p.equalsIgnoreCase(name)) {
			return std_qty_p();
		}
		if ($act_qty_p.equalsIgnoreCase(name)) {
			return act_qty_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($qty_diff_p.equalsIgnoreCase(name)) {
			qty_diff_p(
				((MCContainerMeta) qty_diff_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($std_qty_p.equalsIgnoreCase(name)) {
			std_qty_p(
				((MCContainerMeta) std_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($act_qty_p.equalsIgnoreCase(name)) {
			act_qty_p(
				((MCContainerMeta) act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCNumber diff_wk_cost() {
		return qty_diff_p().qty();
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff_wk_cost(MCNumber value) {
		qty_diff_p().qty(value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff_wk_cost(int value) {
		qty_diff_p().qty(value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff_wk_cost(long value) {
		qty_diff_p().qty(value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff_wk_cost(float value) {
		qty_diff_p().qty(value);
	}

	/**
	 * Variance 差異.<p>
	 *
	 */
	public void diff_wk_cost(double value) {
		qty_diff_p().qty(value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber std_wk_cost() {
		return std_qty_p().qty();
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_wk_cost(MCNumber value) {
		std_qty_p().qty(value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_wk_cost(int value) {
		std_qty_p().qty(value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_wk_cost(long value) {
		std_qty_p().qty(value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_wk_cost(float value) {
		std_qty_p().qty(value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void std_wk_cost(double value) {
		std_qty_p().qty(value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public MCNumber act_wk_cost() {
		return act_qty_p().qty();
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void act_wk_cost(MCNumber value) {
		act_qty_p().qty(value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void act_wk_cost(int value) {
		act_qty_p().qty(value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void act_wk_cost(long value) {
		act_qty_p().qty(value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void act_wk_cost(float value) {
		act_qty_p().qty(value);
	}

	/**
	 * Actual 実際.<p>
	 *
	 */
	public void act_wk_cost(double value) {
		act_qty_p().qty(value);
	}

}

