package mcframe.clientMGBF.MGBFP0420;

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
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public static final String $mng_dpt_cd = "mng_dpt_cd";
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public static final String $mng_dpt_nm = "mng_dpt_nm";
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
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public static final String $asst_typ_nm = "asst_typ_nm";
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public static final String $repurc_obli_flg = "repurc_obli_flg";
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
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_001 = "col_001";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_002 = "col_002";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_003 = "col_003";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_004 = "col_004";
	public static final String $qty_01_p = "qty_01_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_006 = "col_006";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_007 = "col_007";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_008 = "col_008";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_009 = "col_009";
	public static final String $qty_02_p = "qty_02_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_011 = "col_011";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_012 = "col_012";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_013 = "col_013";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_014 = "col_014";
	public static final String $qty_03_p = "qty_03_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_016 = "col_016";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_017 = "col_017";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_018 = "col_018";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_019 = "col_019";
	public static final String $qty_04_p = "qty_04_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_021 = "col_021";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_022 = "col_022";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_023 = "col_023";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_024 = "col_024";
	public static final String $qty_05_p = "qty_05_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_026 = "col_026";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_027 = "col_027";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_028 = "col_028";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_029 = "col_029";
	public static final String $qty_06_p = "qty_06_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_031 = "col_031";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_032 = "col_032";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_033 = "col_033";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_034 = "col_034";
	public static final String $qty_07_p = "qty_07_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_036 = "col_036";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_037 = "col_037";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_038 = "col_038";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_039 = "col_039";
	public static final String $qty_08_p = "qty_08_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_041 = "col_041";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_042 = "col_042";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_043 = "col_043";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_044 = "col_044";
	public static final String $qty_09_p = "qty_09_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_046 = "col_046";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_047 = "col_047";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_048 = "col_048";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_049 = "col_049";
	public static final String $qty_10_p = "qty_10_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_051 = "col_051";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_052 = "col_052";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_053 = "col_053";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_054 = "col_054";
	public static final String $qty_11_p = "qty_11_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_056 = "col_056";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_057 = "col_057";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_058 = "col_058";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_059 = "col_059";
	public static final String $qty_12_p = "qty_12_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_061 = "col_061";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_062 = "col_062";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_063 = "col_063";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_064 = "col_064";
	public static final String $qty_13_p = "qty_13_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_066 = "col_066";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_067 = "col_067";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_068 = "col_068";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_069 = "col_069";
	public static final String $qty_14_p = "qty_14_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_071 = "col_071";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_072 = "col_072";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_073 = "col_073";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_074 = "col_074";
	public static final String $qty_15_p = "qty_15_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_076 = "col_076";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_077 = "col_077";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_078 = "col_078";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_079 = "col_079";
	public static final String $qty_16_p = "qty_16_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_081 = "col_081";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_082 = "col_082";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_083 = "col_083";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_084 = "col_084";
	public static final String $qty_17_p = "qty_17_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_086 = "col_086";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_087 = "col_087";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_088 = "col_088";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_089 = "col_089";
	public static final String $qty_18_p = "qty_18_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_091 = "col_091";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_092 = "col_092";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_093 = "col_093";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_094 = "col_094";
	public static final String $qty_19_p = "qty_19_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_096 = "col_096";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_097 = "col_097";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_098 = "col_098";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_099 = "col_099";
	public static final String $qty_20_p = "qty_20_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_101 = "col_101";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_102 = "col_102";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_103 = "col_103";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_104 = "col_104";
	public static final String $qty_21_p = "qty_21_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_106 = "col_106";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_107 = "col_107";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_108 = "col_108";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_109 = "col_109";
	public static final String $qty_22_p = "qty_22_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_111 = "col_111";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_112 = "col_112";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_113 = "col_113";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_114 = "col_114";
	public static final String $qty_23_p = "qty_23_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_116 = "col_116";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_117 = "col_117";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_118 = "col_118";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_119 = "col_119";
	public static final String $qty_24_p = "qty_24_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_121 = "col_121";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_122 = "col_122";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_123 = "col_123";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_124 = "col_124";
	public static final String $qty_25_p = "qty_25_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_126 = "col_126";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_127 = "col_127";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_128 = "col_128";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_129 = "col_129";
	public static final String $qty_26_p = "qty_26_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_131 = "col_131";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_132 = "col_132";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_133 = "col_133";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_134 = "col_134";
	public static final String $qty_27_p = "qty_27_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_136 = "col_136";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_137 = "col_137";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_138 = "col_138";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_139 = "col_139";
	public static final String $qty_28_p = "qty_28_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_141 = "col_141";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_142 = "col_142";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_143 = "col_143";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_144 = "col_144";
	public static final String $qty_29_p = "qty_29_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_146 = "col_146";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_147 = "col_147";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_148 = "col_148";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_149 = "col_149";
	public static final String $qty_30_p = "qty_30_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_151 = "col_151";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_152 = "col_152";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_153 = "col_153";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_154 = "col_154";
	public static final String $qty_31_p = "qty_31_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_156 = "col_156";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_157 = "col_157";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_158 = "col_158";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_159 = "col_159";
	public static final String $qty_32_p = "qty_32_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_161 = "col_161";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_162 = "col_162";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_163 = "col_163";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_164 = "col_164";
	public static final String $qty_33_p = "qty_33_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_166 = "col_166";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_167 = "col_167";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_168 = "col_168";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_169 = "col_169";
	public static final String $qty_34_p = "qty_34_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_171 = "col_171";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_172 = "col_172";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_173 = "col_173";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_174 = "col_174";
	public static final String $qty_35_p = "qty_35_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_176 = "col_176";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_177 = "col_177";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_178 = "col_178";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_179 = "col_179";
	public static final String $qty_36_p = "qty_36_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_181 = "col_181";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_182 = "col_182";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_183 = "col_183";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_184 = "col_184";
	public static final String $qty_37_p = "qty_37_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_186 = "col_186";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_187 = "col_187";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_188 = "col_188";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_189 = "col_189";
	public static final String $qty_38_p = "qty_38_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_191 = "col_191";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_192 = "col_192";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_193 = "col_193";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_194 = "col_194";
	public static final String $qty_39_p = "qty_39_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_196 = "col_196";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_197 = "col_197";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_198 = "col_198";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_199 = "col_199";
	public static final String $qty_40_p = "qty_40_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_201 = "col_201";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_202 = "col_202";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_203 = "col_203";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_204 = "col_204";
	public static final String $qty_41_p = "qty_41_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_206 = "col_206";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_207 = "col_207";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_208 = "col_208";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_209 = "col_209";
	public static final String $qty_42_p = "qty_42_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_211 = "col_211";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_212 = "col_212";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_213 = "col_213";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_214 = "col_214";
	public static final String $qty_43_p = "qty_43_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_216 = "col_216";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_217 = "col_217";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_218 = "col_218";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_219 = "col_219";
	public static final String $qty_44_p = "qty_44_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_221 = "col_221";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_222 = "col_222";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_223 = "col_223";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_224 = "col_224";
	public static final String $qty_45_p = "qty_45_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_226 = "col_226";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_227 = "col_227";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_228 = "col_228";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_229 = "col_229";
	public static final String $qty_46_p = "qty_46_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_231 = "col_231";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_232 = "col_232";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_233 = "col_233";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_234 = "col_234";
	public static final String $qty_47_p = "qty_47_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_236 = "col_236";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_237 = "col_237";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_238 = "col_238";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_239 = "col_239";
	public static final String $qty_48_p = "qty_48_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_241 = "col_241";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_242 = "col_242";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_243 = "col_243";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_244 = "col_244";
	public static final String $qty_49_p = "qty_49_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_246 = "col_246";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_247 = "col_247";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_248 = "col_248";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_249 = "col_249";
	public static final String $qty_50_p = "qty_50_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_251 = "col_251";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_252 = "col_252";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_253 = "col_253";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_254 = "col_254";
	public static final String $qty_51_p = "qty_51_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_256 = "col_256";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_257 = "col_257";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_258 = "col_258";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_259 = "col_259";
	public static final String $qty_52_p = "qty_52_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_261 = "col_261";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_262 = "col_262";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_263 = "col_263";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_264 = "col_264";
	public static final String $qty_53_p = "qty_53_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_266 = "col_266";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_267 = "col_267";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_268 = "col_268";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_269 = "col_269";
	public static final String $qty_54_p = "qty_54_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_271 = "col_271";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_272 = "col_272";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_273 = "col_273";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_274 = "col_274";
	public static final String $qty_55_p = "qty_55_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_276 = "col_276";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_277 = "col_277";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_278 = "col_278";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_279 = "col_279";
	public static final String $qty_56_p = "qty_56_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_281 = "col_281";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_282 = "col_282";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_283 = "col_283";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_284 = "col_284";
	public static final String $qty_57_p = "qty_57_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_286 = "col_286";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_287 = "col_287";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_288 = "col_288";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_289 = "col_289";
	public static final String $qty_58_p = "qty_58_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_291 = "col_291";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_292 = "col_292";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_293 = "col_293";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_294 = "col_294";
	public static final String $qty_59_p = "qty_59_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_296 = "col_296";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_297 = "col_297";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_298 = "col_298";
	/**
	 * Standard 標準.<p>
	 *
	 */
	public static final String $col_299 = "col_299";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $col_000 = $qty_00_p + ".qty";
	public static final String $col_005 = $qty_01_p + ".qty";
	public static final String $col_010 = $qty_02_p + ".qty";
	public static final String $col_015 = $qty_03_p + ".qty";
	public static final String $col_020 = $qty_04_p + ".qty";
	public static final String $col_025 = $qty_05_p + ".qty";
	public static final String $col_030 = $qty_06_p + ".qty";
	public static final String $col_035 = $qty_07_p + ".qty";
	public static final String $col_040 = $qty_08_p + ".qty";
	public static final String $col_045 = $qty_09_p + ".qty";
	public static final String $col_050 = $qty_10_p + ".qty";
	public static final String $col_055 = $qty_11_p + ".qty";
	public static final String $col_060 = $qty_12_p + ".qty";
	public static final String $col_065 = $qty_13_p + ".qty";
	public static final String $col_070 = $qty_14_p + ".qty";
	public static final String $col_075 = $qty_15_p + ".qty";
	public static final String $col_080 = $qty_16_p + ".qty";
	public static final String $col_085 = $qty_17_p + ".qty";
	public static final String $col_090 = $qty_18_p + ".qty";
	public static final String $col_095 = $qty_19_p + ".qty";
	public static final String $col_100 = $qty_20_p + ".qty";
	public static final String $col_105 = $qty_21_p + ".qty";
	public static final String $col_110 = $qty_22_p + ".qty";
	public static final String $col_115 = $qty_23_p + ".qty";
	public static final String $col_120 = $qty_24_p + ".qty";
	public static final String $col_125 = $qty_25_p + ".qty";
	public static final String $col_130 = $qty_26_p + ".qty";
	public static final String $col_135 = $qty_27_p + ".qty";
	public static final String $col_140 = $qty_28_p + ".qty";
	public static final String $col_145 = $qty_29_p + ".qty";
	public static final String $col_150 = $qty_30_p + ".qty";
	public static final String $col_155 = $qty_31_p + ".qty";
	public static final String $col_160 = $qty_32_p + ".qty";
	public static final String $col_165 = $qty_33_p + ".qty";
	public static final String $col_170 = $qty_34_p + ".qty";
	public static final String $col_175 = $qty_35_p + ".qty";
	public static final String $col_180 = $qty_36_p + ".qty";
	public static final String $col_185 = $qty_37_p + ".qty";
	public static final String $col_190 = $qty_38_p + ".qty";
	public static final String $col_195 = $qty_39_p + ".qty";
	public static final String $col_200 = $qty_40_p + ".qty";
	public static final String $col_205 = $qty_41_p + ".qty";
	public static final String $col_210 = $qty_42_p + ".qty";
	public static final String $col_215 = $qty_43_p + ".qty";
	public static final String $col_220 = $qty_44_p + ".qty";
	public static final String $col_225 = $qty_45_p + ".qty";
	public static final String $col_230 = $qty_46_p + ".qty";
	public static final String $col_235 = $qty_47_p + ".qty";
	public static final String $col_240 = $qty_48_p + ".qty";
	public static final String $col_245 = $qty_49_p + ".qty";
	public static final String $col_250 = $qty_50_p + ".qty";
	public static final String $col_255 = $qty_51_p + ".qty";
	public static final String $col_260 = $qty_52_p + ".qty";
	public static final String $col_265 = $qty_53_p + ".qty";
	public static final String $col_270 = $qty_54_p + ".qty";
	public static final String $col_275 = $qty_55_p + ".qty";
	public static final String $col_280 = $qty_56_p + ".qty";
	public static final String $col_285 = $qty_57_p + ".qty";
	public static final String $col_290 = $qty_58_p + ".qty";
	public static final String $col_295 = $qty_59_p + ".qty";

	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta qty_00_p_META = createInnerRowMeta($qty_00_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_001_META = createCommonMeta($col_001, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_002_META = createCommonMeta($col_002, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_003_META = createCommonMeta($col_003, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_004_META = createCommonMeta($col_004, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_01_p_META = createInnerRowMeta($qty_01_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_006_META = createCommonMeta($col_006, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_007_META = createCommonMeta($col_007, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_008_META = createCommonMeta($col_008, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_009_META = createCommonMeta($col_009, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_02_p_META = createInnerRowMeta($qty_02_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_011_META = createCommonMeta($col_011, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_012_META = createCommonMeta($col_012, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_013_META = createCommonMeta($col_013, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_014_META = createCommonMeta($col_014, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_03_p_META = createInnerRowMeta($qty_03_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_016_META = createCommonMeta($col_016, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_017_META = createCommonMeta($col_017, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_018_META = createCommonMeta($col_018, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_019_META = createCommonMeta($col_019, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_04_p_META = createInnerRowMeta($qty_04_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_021_META = createCommonMeta($col_021, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_022_META = createCommonMeta($col_022, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_023_META = createCommonMeta($col_023, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_024_META = createCommonMeta($col_024, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_05_p_META = createInnerRowMeta($qty_05_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_026_META = createCommonMeta($col_026, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_027_META = createCommonMeta($col_027, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_028_META = createCommonMeta($col_028, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_029_META = createCommonMeta($col_029, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_06_p_META = createInnerRowMeta($qty_06_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_031_META = createCommonMeta($col_031, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_032_META = createCommonMeta($col_032, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_033_META = createCommonMeta($col_033, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_034_META = createCommonMeta($col_034, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_07_p_META = createInnerRowMeta($qty_07_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_036_META = createCommonMeta($col_036, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_037_META = createCommonMeta($col_037, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_038_META = createCommonMeta($col_038, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_039_META = createCommonMeta($col_039, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_08_p_META = createInnerRowMeta($qty_08_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_041_META = createCommonMeta($col_041, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_042_META = createCommonMeta($col_042, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_043_META = createCommonMeta($col_043, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_044_META = createCommonMeta($col_044, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_09_p_META = createInnerRowMeta($qty_09_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_046_META = createCommonMeta($col_046, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_047_META = createCommonMeta($col_047, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_048_META = createCommonMeta($col_048, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_049_META = createCommonMeta($col_049, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_10_p_META = createInnerRowMeta($qty_10_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_051_META = createCommonMeta($col_051, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_052_META = createCommonMeta($col_052, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_053_META = createCommonMeta($col_053, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_054_META = createCommonMeta($col_054, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_11_p_META = createInnerRowMeta($qty_11_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_056_META = createCommonMeta($col_056, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_057_META = createCommonMeta($col_057, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_058_META = createCommonMeta($col_058, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_059_META = createCommonMeta($col_059, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_12_p_META = createInnerRowMeta($qty_12_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_061_META = createCommonMeta($col_061, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_062_META = createCommonMeta($col_062, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_063_META = createCommonMeta($col_063, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_064_META = createCommonMeta($col_064, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_13_p_META = createInnerRowMeta($qty_13_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_066_META = createCommonMeta($col_066, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_067_META = createCommonMeta($col_067, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_068_META = createCommonMeta($col_068, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_069_META = createCommonMeta($col_069, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_14_p_META = createInnerRowMeta($qty_14_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_071_META = createCommonMeta($col_071, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_072_META = createCommonMeta($col_072, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_073_META = createCommonMeta($col_073, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_074_META = createCommonMeta($col_074, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_15_p_META = createInnerRowMeta($qty_15_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_076_META = createCommonMeta($col_076, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_077_META = createCommonMeta($col_077, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_078_META = createCommonMeta($col_078, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_079_META = createCommonMeta($col_079, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_16_p_META = createInnerRowMeta($qty_16_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_081_META = createCommonMeta($col_081, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_082_META = createCommonMeta($col_082, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_083_META = createCommonMeta($col_083, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_084_META = createCommonMeta($col_084, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_17_p_META = createInnerRowMeta($qty_17_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_086_META = createCommonMeta($col_086, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_087_META = createCommonMeta($col_087, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_088_META = createCommonMeta($col_088, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_089_META = createCommonMeta($col_089, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_18_p_META = createInnerRowMeta($qty_18_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_091_META = createCommonMeta($col_091, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_092_META = createCommonMeta($col_092, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_093_META = createCommonMeta($col_093, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_094_META = createCommonMeta($col_094, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_19_p_META = createInnerRowMeta($qty_19_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_096_META = createCommonMeta($col_096, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_097_META = createCommonMeta($col_097, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_098_META = createCommonMeta($col_098, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_099_META = createCommonMeta($col_099, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_20_p_META = createInnerRowMeta($qty_20_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_101_META = createCommonMeta($col_101, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_102_META = createCommonMeta($col_102, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_103_META = createCommonMeta($col_103, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_104_META = createCommonMeta($col_104, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_21_p_META = createInnerRowMeta($qty_21_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_106_META = createCommonMeta($col_106, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_107_META = createCommonMeta($col_107, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_108_META = createCommonMeta($col_108, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_109_META = createCommonMeta($col_109, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_22_p_META = createInnerRowMeta($qty_22_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_111_META = createCommonMeta($col_111, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_112_META = createCommonMeta($col_112, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_113_META = createCommonMeta($col_113, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_114_META = createCommonMeta($col_114, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_23_p_META = createInnerRowMeta($qty_23_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_116_META = createCommonMeta($col_116, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_117_META = createCommonMeta($col_117, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_118_META = createCommonMeta($col_118, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_119_META = createCommonMeta($col_119, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_24_p_META = createInnerRowMeta($qty_24_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_121_META = createCommonMeta($col_121, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_122_META = createCommonMeta($col_122, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_123_META = createCommonMeta($col_123, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_124_META = createCommonMeta($col_124, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_25_p_META = createInnerRowMeta($qty_25_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_126_META = createCommonMeta($col_126, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_127_META = createCommonMeta($col_127, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_128_META = createCommonMeta($col_128, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_129_META = createCommonMeta($col_129, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_26_p_META = createInnerRowMeta($qty_26_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_131_META = createCommonMeta($col_131, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_132_META = createCommonMeta($col_132, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_133_META = createCommonMeta($col_133, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_134_META = createCommonMeta($col_134, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_27_p_META = createInnerRowMeta($qty_27_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_136_META = createCommonMeta($col_136, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_137_META = createCommonMeta($col_137, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_138_META = createCommonMeta($col_138, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_139_META = createCommonMeta($col_139, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_28_p_META = createInnerRowMeta($qty_28_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_141_META = createCommonMeta($col_141, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_142_META = createCommonMeta($col_142, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_143_META = createCommonMeta($col_143, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_144_META = createCommonMeta($col_144, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_29_p_META = createInnerRowMeta($qty_29_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_146_META = createCommonMeta($col_146, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_147_META = createCommonMeta($col_147, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_148_META = createCommonMeta($col_148, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_149_META = createCommonMeta($col_149, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_30_p_META = createInnerRowMeta($qty_30_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_151_META = createCommonMeta($col_151, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_152_META = createCommonMeta($col_152, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_153_META = createCommonMeta($col_153, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_154_META = createCommonMeta($col_154, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_31_p_META = createInnerRowMeta($qty_31_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_156_META = createCommonMeta($col_156, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_157_META = createCommonMeta($col_157, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_158_META = createCommonMeta($col_158, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_159_META = createCommonMeta($col_159, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_32_p_META = createInnerRowMeta($qty_32_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_161_META = createCommonMeta($col_161, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_162_META = createCommonMeta($col_162, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_163_META = createCommonMeta($col_163, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_164_META = createCommonMeta($col_164, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_33_p_META = createInnerRowMeta($qty_33_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_166_META = createCommonMeta($col_166, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_167_META = createCommonMeta($col_167, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_168_META = createCommonMeta($col_168, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_169_META = createCommonMeta($col_169, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_34_p_META = createInnerRowMeta($qty_34_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_171_META = createCommonMeta($col_171, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_172_META = createCommonMeta($col_172, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_173_META = createCommonMeta($col_173, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_174_META = createCommonMeta($col_174, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_35_p_META = createInnerRowMeta($qty_35_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_176_META = createCommonMeta($col_176, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_177_META = createCommonMeta($col_177, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_178_META = createCommonMeta($col_178, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_179_META = createCommonMeta($col_179, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_36_p_META = createInnerRowMeta($qty_36_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_181_META = createCommonMeta($col_181, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_182_META = createCommonMeta($col_182, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_183_META = createCommonMeta($col_183, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_184_META = createCommonMeta($col_184, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_37_p_META = createInnerRowMeta($qty_37_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_186_META = createCommonMeta($col_186, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_187_META = createCommonMeta($col_187, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_188_META = createCommonMeta($col_188, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_189_META = createCommonMeta($col_189, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_38_p_META = createInnerRowMeta($qty_38_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_191_META = createCommonMeta($col_191, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_192_META = createCommonMeta($col_192, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_193_META = createCommonMeta($col_193, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_194_META = createCommonMeta($col_194, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_39_p_META = createInnerRowMeta($qty_39_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_196_META = createCommonMeta($col_196, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_197_META = createCommonMeta($col_197, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_198_META = createCommonMeta($col_198, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_199_META = createCommonMeta($col_199, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_40_p_META = createInnerRowMeta($qty_40_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_201_META = createCommonMeta($col_201, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_202_META = createCommonMeta($col_202, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_203_META = createCommonMeta($col_203, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_204_META = createCommonMeta($col_204, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_41_p_META = createInnerRowMeta($qty_41_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_206_META = createCommonMeta($col_206, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_207_META = createCommonMeta($col_207, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_208_META = createCommonMeta($col_208, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_209_META = createCommonMeta($col_209, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_42_p_META = createInnerRowMeta($qty_42_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_211_META = createCommonMeta($col_211, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_212_META = createCommonMeta($col_212, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_213_META = createCommonMeta($col_213, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_214_META = createCommonMeta($col_214, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_43_p_META = createInnerRowMeta($qty_43_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_216_META = createCommonMeta($col_216, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_217_META = createCommonMeta($col_217, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_218_META = createCommonMeta($col_218, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_219_META = createCommonMeta($col_219, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_44_p_META = createInnerRowMeta($qty_44_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_221_META = createCommonMeta($col_221, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_222_META = createCommonMeta($col_222, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_223_META = createCommonMeta($col_223, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_224_META = createCommonMeta($col_224, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_45_p_META = createInnerRowMeta($qty_45_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_226_META = createCommonMeta($col_226, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_227_META = createCommonMeta($col_227, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_228_META = createCommonMeta($col_228, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_229_META = createCommonMeta($col_229, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_46_p_META = createInnerRowMeta($qty_46_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_231_META = createCommonMeta($col_231, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_232_META = createCommonMeta($col_232, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_233_META = createCommonMeta($col_233, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_234_META = createCommonMeta($col_234, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_47_p_META = createInnerRowMeta($qty_47_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_236_META = createCommonMeta($col_236, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_237_META = createCommonMeta($col_237, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_238_META = createCommonMeta($col_238, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_239_META = createCommonMeta($col_239, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_48_p_META = createInnerRowMeta($qty_48_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_241_META = createCommonMeta($col_241, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_242_META = createCommonMeta($col_242, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_243_META = createCommonMeta($col_243, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_244_META = createCommonMeta($col_244, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_49_p_META = createInnerRowMeta($qty_49_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_246_META = createCommonMeta($col_246, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_247_META = createCommonMeta($col_247, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_248_META = createCommonMeta($col_248, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_249_META = createCommonMeta($col_249, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_50_p_META = createInnerRowMeta($qty_50_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_251_META = createCommonMeta($col_251, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_252_META = createCommonMeta($col_252, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_253_META = createCommonMeta($col_253, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_254_META = createCommonMeta($col_254, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_51_p_META = createInnerRowMeta($qty_51_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_256_META = createCommonMeta($col_256, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_257_META = createCommonMeta($col_257, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_258_META = createCommonMeta($col_258, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_259_META = createCommonMeta($col_259, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_52_p_META = createInnerRowMeta($qty_52_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_261_META = createCommonMeta($col_261, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_262_META = createCommonMeta($col_262, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_263_META = createCommonMeta($col_263, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_264_META = createCommonMeta($col_264, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_53_p_META = createInnerRowMeta($qty_53_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_266_META = createCommonMeta($col_266, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_267_META = createCommonMeta($col_267, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_268_META = createCommonMeta($col_268, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_269_META = createCommonMeta($col_269, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_54_p_META = createInnerRowMeta($qty_54_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_271_META = createCommonMeta($col_271, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_272_META = createCommonMeta($col_272, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_273_META = createCommonMeta($col_273, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_274_META = createCommonMeta($col_274, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_55_p_META = createInnerRowMeta($qty_55_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_276_META = createCommonMeta($col_276, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_277_META = createCommonMeta($col_277, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_278_META = createCommonMeta($col_278, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_279_META = createCommonMeta($col_279, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_56_p_META = createInnerRowMeta($qty_56_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_281_META = createCommonMeta($col_281, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_282_META = createCommonMeta($col_282, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_283_META = createCommonMeta($col_283, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_284_META = createCommonMeta($col_284, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_57_p_META = createInnerRowMeta($qty_57_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_286_META = createCommonMeta($col_286, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_287_META = createCommonMeta($col_287, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_288_META = createCommonMeta($col_288, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_289_META = createCommonMeta($col_289, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_58_p_META = createInnerRowMeta($qty_58_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_291_META = createCommonMeta($col_291, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_292_META = createCommonMeta($col_292, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_293_META = createCommonMeta($col_293, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_294_META = createCommonMeta($col_294, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_59_p_META = createInnerRowMeta($qty_59_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_296_META = createCommonMeta($col_296, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_297_META = createCommonMeta($col_297, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_298_META = createCommonMeta($col_298, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_299_META = createCommonMeta($col_299, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<DispRsltR> constMetas = new ConstMetaList<DispRsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_grp_cd_META,
			calc_grp_nm_META,
			wg_cd_META,
			wg_nm_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			itm_p_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			sppl_cd_META,
			sppl_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			repurc_obli_flg_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			qty_00_p_META,
			col_001_META,
			col_002_META,
			col_003_META,
			col_004_META,
			qty_01_p_META,
			col_006_META,
			col_007_META,
			col_008_META,
			col_009_META,
			qty_02_p_META,
			col_011_META,
			col_012_META,
			col_013_META,
			col_014_META,
			qty_03_p_META,
			col_016_META,
			col_017_META,
			col_018_META,
			col_019_META,
			qty_04_p_META,
			col_021_META,
			col_022_META,
			col_023_META,
			col_024_META,
			qty_05_p_META,
			col_026_META,
			col_027_META,
			col_028_META,
			col_029_META,
			qty_06_p_META,
			col_031_META,
			col_032_META,
			col_033_META,
			col_034_META,
			qty_07_p_META,
			col_036_META,
			col_037_META,
			col_038_META,
			col_039_META,
			qty_08_p_META,
			col_041_META,
			col_042_META,
			col_043_META,
			col_044_META,
			qty_09_p_META,
			col_046_META,
			col_047_META,
			col_048_META,
			col_049_META,
			qty_10_p_META,
			col_051_META,
			col_052_META,
			col_053_META,
			col_054_META,
			qty_11_p_META,
			col_056_META,
			col_057_META,
			col_058_META,
			col_059_META,
			qty_12_p_META,
			col_061_META,
			col_062_META,
			col_063_META,
			col_064_META,
			qty_13_p_META,
			col_066_META,
			col_067_META,
			col_068_META,
			col_069_META,
			qty_14_p_META,
			col_071_META,
			col_072_META,
			col_073_META,
			col_074_META,
			qty_15_p_META,
			col_076_META,
			col_077_META,
			col_078_META,
			col_079_META,
			qty_16_p_META,
			col_081_META,
			col_082_META,
			col_083_META,
			col_084_META,
			qty_17_p_META,
			col_086_META,
			col_087_META,
			col_088_META,
			col_089_META,
			qty_18_p_META,
			col_091_META,
			col_092_META,
			col_093_META,
			col_094_META,
			qty_19_p_META,
			col_096_META,
			col_097_META,
			col_098_META,
			col_099_META,
			qty_20_p_META,
			col_101_META,
			col_102_META,
			col_103_META,
			col_104_META,
			qty_21_p_META,
			col_106_META,
			col_107_META,
			col_108_META,
			col_109_META,
			qty_22_p_META,
			col_111_META,
			col_112_META,
			col_113_META,
			col_114_META,
			qty_23_p_META,
			col_116_META,
			col_117_META,
			col_118_META,
			col_119_META,
			qty_24_p_META,
			col_121_META,
			col_122_META,
			col_123_META,
			col_124_META,
			qty_25_p_META,
			col_126_META,
			col_127_META,
			col_128_META,
			col_129_META,
			qty_26_p_META,
			col_131_META,
			col_132_META,
			col_133_META,
			col_134_META,
			qty_27_p_META,
			col_136_META,
			col_137_META,
			col_138_META,
			col_139_META,
			qty_28_p_META,
			col_141_META,
			col_142_META,
			col_143_META,
			col_144_META,
			qty_29_p_META,
			col_146_META,
			col_147_META,
			col_148_META,
			col_149_META,
			qty_30_p_META,
			col_151_META,
			col_152_META,
			col_153_META,
			col_154_META,
			qty_31_p_META,
			col_156_META,
			col_157_META,
			col_158_META,
			col_159_META,
			qty_32_p_META,
			col_161_META,
			col_162_META,
			col_163_META,
			col_164_META,
			qty_33_p_META,
			col_166_META,
			col_167_META,
			col_168_META,
			col_169_META,
			qty_34_p_META,
			col_171_META,
			col_172_META,
			col_173_META,
			col_174_META,
			qty_35_p_META,
			col_176_META,
			col_177_META,
			col_178_META,
			col_179_META,
			qty_36_p_META,
			col_181_META,
			col_182_META,
			col_183_META,
			col_184_META,
			qty_37_p_META,
			col_186_META,
			col_187_META,
			col_188_META,
			col_189_META,
			qty_38_p_META,
			col_191_META,
			col_192_META,
			col_193_META,
			col_194_META,
			qty_39_p_META,
			col_196_META,
			col_197_META,
			col_198_META,
			col_199_META,
			qty_40_p_META,
			col_201_META,
			col_202_META,
			col_203_META,
			col_204_META,
			qty_41_p_META,
			col_206_META,
			col_207_META,
			col_208_META,
			col_209_META,
			qty_42_p_META,
			col_211_META,
			col_212_META,
			col_213_META,
			col_214_META,
			qty_43_p_META,
			col_216_META,
			col_217_META,
			col_218_META,
			col_219_META,
			qty_44_p_META,
			col_221_META,
			col_222_META,
			col_223_META,
			col_224_META,
			qty_45_p_META,
			col_226_META,
			col_227_META,
			col_228_META,
			col_229_META,
			qty_46_p_META,
			col_231_META,
			col_232_META,
			col_233_META,
			col_234_META,
			qty_47_p_META,
			col_236_META,
			col_237_META,
			col_238_META,
			col_239_META,
			qty_48_p_META,
			col_241_META,
			col_242_META,
			col_243_META,
			col_244_META,
			qty_49_p_META,
			col_246_META,
			col_247_META,
			col_248_META,
			col_249_META,
			qty_50_p_META,
			col_251_META,
			col_252_META,
			col_253_META,
			col_254_META,
			qty_51_p_META,
			col_256_META,
			col_257_META,
			col_258_META,
			col_259_META,
			qty_52_p_META,
			col_261_META,
			col_262_META,
			col_263_META,
			col_264_META,
			qty_53_p_META,
			col_266_META,
			col_267_META,
			col_268_META,
			col_269_META,
			qty_54_p_META,
			col_271_META,
			col_272_META,
			col_273_META,
			col_274_META,
			qty_55_p_META,
			col_276_META,
			col_277_META,
			col_278_META,
			col_279_META,
			qty_56_p_META,
			col_281_META,
			col_282_META,
			col_283_META,
			col_284_META,
			qty_57_p_META,
			col_286_META,
			col_287_META,
			col_288_META,
			col_289_META,
			qty_58_p_META,
			col_291_META,
			col_292_META,
			col_293_META,
			col_294_META,
			qty_59_p_META,
			col_296_META,
			col_297_META,
			col_298_META,
			col_299_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"col_000",
				"col_005",
				"col_010",
				"col_015",
				"col_020",
				"col_025",
				"col_030",
				"col_035",
				"col_040",
				"col_045",
				"col_050",
				"col_055",
				"col_060",
				"col_065",
				"col_070",
				"col_075",
				"col_080",
				"col_085",
				"col_090",
				"col_095",
				"col_100",
				"col_105",
				"col_110",
				"col_115",
				"col_120",
				"col_125",
				"col_130",
				"col_135",
				"col_140",
				"col_145",
				"col_150",
				"col_155",
				"col_160",
				"col_165",
				"col_170",
				"col_175",
				"col_180",
				"col_185",
				"col_190",
				"col_195",
				"col_200",
				"col_205",
				"col_210",
				"col_215",
				"col_220",
				"col_225",
				"col_230",
				"col_235",
				"col_240",
				"col_245",
				"col_250",
				"col_255",
				"col_260",
				"col_265",
				"col_270",
				"col_275",
				"col_280",
				"col_285",
				"col_290",
				"col_295"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$col_000,
				$col_005,
				$col_010,
				$col_015,
				$col_020,
				$col_025,
				$col_030,
				$col_035,
				$col_040,
				$col_045,
				$col_050,
				$col_055,
				$col_060,
				$col_065,
				$col_070,
				$col_075,
				$col_080,
				$col_085,
				$col_090,
				$col_095,
				$col_100,
				$col_105,
				$col_110,
				$col_115,
				$col_120,
				$col_125,
				$col_130,
				$col_135,
				$col_140,
				$col_145,
				$col_150,
				$col_155,
				$col_160,
				$col_165,
				$col_170,
				$col_175,
				$col_180,
				$col_185,
				$col_190,
				$col_195,
				$col_200,
				$col_205,
				$col_210,
				$col_215,
				$col_220,
				$col_225,
				$col_230,
				$col_235,
				$col_240,
				$col_245,
				$col_250,
				$col_255,
				$col_260,
				$col_265,
				$col_270,
				$col_275,
				$col_280,
				$col_285,
				$col_290,
				$col_295
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
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";
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
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$sno1, "SNO1"},	// sno1
				{$sno2, "SNO2"},	// sno2
				{$sno3, "SNO3"},	// sno3
				{$sno4, "SNO4"}	// sno4
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
				{$col_001, "UNIT"},	// col_001
				{$col_002, "UNIT"},	// col_002
				{$col_003, "UNIT"},	// col_003
				{$col_004, "UNIT"},	// col_004
				{$col_006, "UNIT"},	// col_006
				{$col_007, "UNIT"},	// col_007
				{$col_008, "UNIT"},	// col_008
				{$col_009, "UNIT"},	// col_009
				{$col_011, "UNIT"},	// col_011
				{$col_012, "UNIT"},	// col_012
				{$col_013, "UNIT"},	// col_013
				{$col_014, "UNIT"},	// col_014
				{$col_016, "UNIT"},	// col_016
				{$col_017, "UNIT"},	// col_017
				{$col_018, "UNIT"},	// col_018
				{$col_019, "UNIT"},	// col_019
				{$col_021, "UNIT"},	// col_021
				{$col_022, "UNIT"},	// col_022
				{$col_023, "UNIT"},	// col_023
				{$col_024, "UNIT"},	// col_024
				{$col_026, "UNIT"},	// col_026
				{$col_027, "UNIT"},	// col_027
				{$col_028, "UNIT"},	// col_028
				{$col_029, "UNIT"},	// col_029
				{$col_031, "UNIT"},	// col_031
				{$col_032, "UNIT"},	// col_032
				{$col_033, "UNIT"},	// col_033
				{$col_034, "UNIT"},	// col_034
				{$col_036, "UNIT"},	// col_036
				{$col_037, "UNIT"},	// col_037
				{$col_038, "UNIT"},	// col_038
				{$col_039, "UNIT"},	// col_039
				{$col_041, "UNIT"},	// col_041
				{$col_042, "UNIT"},	// col_042
				{$col_043, "UNIT"},	// col_043
				{$col_044, "UNIT"},	// col_044
				{$col_046, "UNIT"},	// col_046
				{$col_047, "UNIT"},	// col_047
				{$col_048, "UNIT"},	// col_048
				{$col_049, "UNIT"},	// col_049
				{$col_051, "UNIT"},	// col_051
				{$col_052, "UNIT"},	// col_052
				{$col_053, "UNIT"},	// col_053
				{$col_054, "UNIT"},	// col_054
				{$col_056, "UNIT"},	// col_056
				{$col_057, "UNIT"},	// col_057
				{$col_058, "UNIT"},	// col_058
				{$col_059, "UNIT"},	// col_059
				{$col_061, "UNIT"},	// col_061
				{$col_062, "UNIT"},	// col_062
				{$col_063, "UNIT"},	// col_063
				{$col_064, "UNIT"},	// col_064
				{$col_066, "UNIT"},	// col_066
				{$col_067, "UNIT"},	// col_067
				{$col_068, "UNIT"},	// col_068
				{$col_069, "UNIT"},	// col_069
				{$col_071, "UNIT"},	// col_071
				{$col_072, "UNIT"},	// col_072
				{$col_073, "UNIT"},	// col_073
				{$col_074, "UNIT"},	// col_074
				{$col_076, "UNIT"},	// col_076
				{$col_077, "UNIT"},	// col_077
				{$col_078, "UNIT"},	// col_078
				{$col_079, "UNIT"},	// col_079
				{$col_081, "UNIT"},	// col_081
				{$col_082, "UNIT"},	// col_082
				{$col_083, "UNIT"},	// col_083
				{$col_084, "UNIT"},	// col_084
				{$col_086, "UNIT"},	// col_086
				{$col_087, "UNIT"},	// col_087
				{$col_088, "UNIT"},	// col_088
				{$col_089, "UNIT"},	// col_089
				{$col_091, "UNIT"},	// col_091
				{$col_092, "UNIT"},	// col_092
				{$col_093, "UNIT"},	// col_093
				{$col_094, "UNIT"},	// col_094
				{$col_096, "UNIT"},	// col_096
				{$col_097, "UNIT"},	// col_097
				{$col_098, "UNIT"},	// col_098
				{$col_099, "UNIT"},	// col_099
				{$col_101, "UNIT"},	// col_101
				{$col_102, "UNIT"},	// col_102
				{$col_103, "UNIT"},	// col_103
				{$col_104, "UNIT"},	// col_104
				{$col_106, "UNIT"},	// col_106
				{$col_107, "UNIT"},	// col_107
				{$col_108, "UNIT"},	// col_108
				{$col_109, "UNIT"},	// col_109
				{$col_111, "UNIT"},	// col_111
				{$col_112, "UNIT"},	// col_112
				{$col_113, "UNIT"},	// col_113
				{$col_114, "UNIT"},	// col_114
				{$col_116, "UNIT"},	// col_116
				{$col_117, "UNIT"},	// col_117
				{$col_118, "UNIT"},	// col_118
				{$col_119, "UNIT"},	// col_119
				{$col_121, "UNIT"},	// col_121
				{$col_122, "UNIT"},	// col_122
				{$col_123, "UNIT"},	// col_123
				{$col_124, "UNIT"},	// col_124
				{$col_126, "UNIT"},	// col_126
				{$col_127, "UNIT"},	// col_127
				{$col_128, "UNIT"},	// col_128
				{$col_129, "UNIT"},	// col_129
				{$col_131, "UNIT"},	// col_131
				{$col_132, "UNIT"},	// col_132
				{$col_133, "UNIT"},	// col_133
				{$col_134, "UNIT"},	// col_134
				{$col_136, "UNIT"},	// col_136
				{$col_137, "UNIT"},	// col_137
				{$col_138, "UNIT"},	// col_138
				{$col_139, "UNIT"},	// col_139
				{$col_141, "UNIT"},	// col_141
				{$col_142, "UNIT"},	// col_142
				{$col_143, "UNIT"},	// col_143
				{$col_144, "UNIT"},	// col_144
				{$col_146, "UNIT"},	// col_146
				{$col_147, "UNIT"},	// col_147
				{$col_148, "UNIT"},	// col_148
				{$col_149, "UNIT"},	// col_149
				{$col_151, "UNIT"},	// col_151
				{$col_152, "UNIT"},	// col_152
				{$col_153, "UNIT"},	// col_153
				{$col_154, "UNIT"},	// col_154
				{$col_156, "UNIT"},	// col_156
				{$col_157, "UNIT"},	// col_157
				{$col_158, "UNIT"},	// col_158
				{$col_159, "UNIT"},	// col_159
				{$col_161, "UNIT"},	// col_161
				{$col_162, "UNIT"},	// col_162
				{$col_163, "UNIT"},	// col_163
				{$col_164, "UNIT"},	// col_164
				{$col_166, "UNIT"},	// col_166
				{$col_167, "UNIT"},	// col_167
				{$col_168, "UNIT"},	// col_168
				{$col_169, "UNIT"},	// col_169
				{$col_171, "UNIT"},	// col_171
				{$col_172, "UNIT"},	// col_172
				{$col_173, "UNIT"},	// col_173
				{$col_174, "UNIT"},	// col_174
				{$col_176, "UNIT"},	// col_176
				{$col_177, "UNIT"},	// col_177
				{$col_178, "UNIT"},	// col_178
				{$col_179, "UNIT"},	// col_179
				{$col_181, "UNIT"},	// col_181
				{$col_182, "UNIT"},	// col_182
				{$col_183, "UNIT"},	// col_183
				{$col_184, "UNIT"},	// col_184
				{$col_186, "UNIT"},	// col_186
				{$col_187, "UNIT"},	// col_187
				{$col_188, "UNIT"},	// col_188
				{$col_189, "UNIT"},	// col_189
				{$col_191, "UNIT"},	// col_191
				{$col_192, "UNIT"},	// col_192
				{$col_193, "UNIT"},	// col_193
				{$col_194, "UNIT"},	// col_194
				{$col_196, "UNIT"},	// col_196
				{$col_197, "UNIT"},	// col_197
				{$col_198, "UNIT"},	// col_198
				{$col_199, "UNIT"},	// col_199
				{$col_201, "UNIT"},	// col_201
				{$col_202, "UNIT"},	// col_202
				{$col_203, "UNIT"},	// col_203
				{$col_204, "UNIT"},	// col_204
				{$col_206, "UNIT"},	// col_206
				{$col_207, "UNIT"},	// col_207
				{$col_208, "UNIT"},	// col_208
				{$col_209, "UNIT"},	// col_209
				{$col_211, "UNIT"},	// col_211
				{$col_212, "UNIT"},	// col_212
				{$col_213, "UNIT"},	// col_213
				{$col_214, "UNIT"},	// col_214
				{$col_216, "UNIT"},	// col_216
				{$col_217, "UNIT"},	// col_217
				{$col_218, "UNIT"},	// col_218
				{$col_219, "UNIT"},	// col_219
				{$col_221, "UNIT"},	// col_221
				{$col_222, "UNIT"},	// col_222
				{$col_223, "UNIT"},	// col_223
				{$col_224, "UNIT"},	// col_224
				{$col_226, "UNIT"},	// col_226
				{$col_227, "UNIT"},	// col_227
				{$col_228, "UNIT"},	// col_228
				{$col_229, "UNIT"},	// col_229
				{$col_231, "UNIT"},	// col_231
				{$col_232, "UNIT"},	// col_232
				{$col_233, "UNIT"},	// col_233
				{$col_234, "UNIT"},	// col_234
				{$col_236, "UNIT"},	// col_236
				{$col_237, "UNIT"},	// col_237
				{$col_238, "UNIT"},	// col_238
				{$col_239, "UNIT"},	// col_239
				{$col_241, "UNIT"},	// col_241
				{$col_242, "UNIT"},	// col_242
				{$col_243, "UNIT"},	// col_243
				{$col_244, "UNIT"},	// col_244
				{$col_246, "UNIT"},	// col_246
				{$col_247, "UNIT"},	// col_247
				{$col_248, "UNIT"},	// col_248
				{$col_249, "UNIT"},	// col_249
				{$col_251, "UNIT"},	// col_251
				{$col_252, "UNIT"},	// col_252
				{$col_253, "UNIT"},	// col_253
				{$col_254, "UNIT"},	// col_254
				{$col_256, "UNIT"},	// col_256
				{$col_257, "UNIT"},	// col_257
				{$col_258, "UNIT"},	// col_258
				{$col_259, "UNIT"},	// col_259
				{$col_261, "UNIT"},	// col_261
				{$col_262, "UNIT"},	// col_262
				{$col_263, "UNIT"},	// col_263
				{$col_264, "UNIT"},	// col_264
				{$col_266, "UNIT"},	// col_266
				{$col_267, "UNIT"},	// col_267
				{$col_268, "UNIT"},	// col_268
				{$col_269, "UNIT"},	// col_269
				{$col_271, "UNIT"},	// col_271
				{$col_272, "UNIT"},	// col_272
				{$col_273, "UNIT"},	// col_273
				{$col_274, "UNIT"},	// col_274
				{$col_276, "UNIT"},	// col_276
				{$col_277, "UNIT"},	// col_277
				{$col_278, "UNIT"},	// col_278
				{$col_279, "UNIT"},	// col_279
				{$col_281, "UNIT"},	// col_281
				{$col_282, "UNIT"},	// col_282
				{$col_283, "UNIT"},	// col_283
				{$col_284, "UNIT"},	// col_284
				{$col_286, "UNIT"},	// col_286
				{$col_287, "UNIT"},	// col_287
				{$col_288, "UNIT"},	// col_288
				{$col_289, "UNIT"},	// col_289
				{$col_291, "UNIT"},	// col_291
				{$col_292, "UNIT"},	// col_292
				{$col_293, "UNIT"},	// col_293
				{$col_294, "UNIT"},	// col_294
				{$col_296, "UNIT"},	// col_296
				{$col_297, "UNIT"},	// col_297
				{$col_298, "UNIT"},	// col_298
				{$col_299, "UNIT"}	// col_299
			}
		)),
		new MCExtMap.Entry($$CLEAR, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
				{$qty_00_p + ".qty", "disp_ave_upri"},	// qty_00_p.qty
				{$col_001, "disp_ave_upri"},	// col_001
				{$col_002, "disp_std_upri"},	// col_002
				{$col_003, "disp_ave_unit"},	// col_003
				{$col_004, "disp_std_unit"},	// col_004
				{$qty_01_p + ".qty", "disp_ave_upri"},	// qty_01_p.qty
				{$col_006, "disp_ave_upri"},	// col_006
				{$col_007, "disp_std_upri"},	// col_007
				{$col_008, "disp_ave_unit"},	// col_008
				{$col_009, "disp_std_unit"},	// col_009
				{$qty_02_p + ".qty", "disp_ave_upri"},	// qty_02_p.qty
				{$col_011, "disp_ave_upri"},	// col_011
				{$col_012, "disp_std_upri"},	// col_012
				{$col_013, "disp_ave_unit"},	// col_013
				{$col_014, "disp_std_unit"},	// col_014
				{$qty_03_p + ".qty", "disp_ave_upri"},	// qty_03_p.qty
				{$col_016, "disp_ave_upri"},	// col_016
				{$col_017, "disp_std_upri"},	// col_017
				{$col_018, "disp_ave_unit"},	// col_018
				{$col_019, "disp_std_unit"},	// col_019
				{$qty_04_p + ".qty", "disp_ave_upri"},	// qty_04_p.qty
				{$col_021, "disp_ave_upri"},	// col_021
				{$col_022, "disp_std_upri"},	// col_022
				{$col_023, "disp_ave_unit"},	// col_023
				{$col_024, "disp_std_unit"},	// col_024
				{$qty_05_p + ".qty", "disp_ave_upri"},	// qty_05_p.qty
				{$col_026, "disp_ave_upri"},	// col_026
				{$col_027, "disp_std_upri"},	// col_027
				{$col_028, "disp_ave_unit"},	// col_028
				{$col_029, "disp_std_unit"},	// col_029
				{$qty_06_p + ".qty", "disp_ave_upri"},	// qty_06_p.qty
				{$col_031, "disp_ave_upri"},	// col_031
				{$col_032, "disp_std_upri"},	// col_032
				{$col_033, "disp_ave_unit"},	// col_033
				{$col_034, "disp_std_unit"},	// col_034
				{$qty_07_p + ".qty", "disp_ave_upri"},	// qty_07_p.qty
				{$col_036, "disp_ave_upri"},	// col_036
				{$col_037, "disp_std_upri"},	// col_037
				{$col_038, "disp_ave_unit"},	// col_038
				{$col_039, "disp_std_unit"},	// col_039
				{$qty_08_p + ".qty", "disp_ave_upri"},	// qty_08_p.qty
				{$col_041, "disp_ave_upri"},	// col_041
				{$col_042, "disp_std_upri"},	// col_042
				{$col_043, "disp_ave_unit"},	// col_043
				{$col_044, "disp_std_unit"},	// col_044
				{$qty_09_p + ".qty", "disp_ave_upri"},	// qty_09_p.qty
				{$col_046, "disp_ave_upri"},	// col_046
				{$col_047, "disp_std_upri"},	// col_047
				{$col_048, "disp_ave_unit"},	// col_048
				{$col_049, "disp_std_unit"},	// col_049
				{$qty_10_p + ".qty", "disp_ave_upri"},	// qty_10_p.qty
				{$col_051, "disp_ave_upri"},	// col_051
				{$col_052, "disp_std_upri"},	// col_052
				{$col_053, "disp_ave_unit"},	// col_053
				{$col_054, "disp_std_unit"},	// col_054
				{$qty_11_p + ".qty", "disp_ave_upri"},	// qty_11_p.qty
				{$col_056, "disp_ave_upri"},	// col_056
				{$col_057, "disp_std_upri"},	// col_057
				{$col_058, "disp_ave_unit"},	// col_058
				{$col_059, "disp_std_unit"},	// col_059
				{$qty_12_p + ".qty", "disp_ave_upri"},	// qty_12_p.qty
				{$col_061, "disp_ave_upri"},	// col_061
				{$col_062, "disp_std_upri"},	// col_062
				{$col_063, "disp_ave_unit"},	// col_063
				{$col_064, "disp_std_unit"},	// col_064
				{$qty_13_p + ".qty", "disp_ave_upri"},	// qty_13_p.qty
				{$col_066, "disp_ave_upri"},	// col_066
				{$col_067, "disp_std_upri"},	// col_067
				{$col_068, "disp_ave_unit"},	// col_068
				{$col_069, "disp_std_unit"},	// col_069
				{$qty_14_p + ".qty", "disp_ave_upri"},	// qty_14_p.qty
				{$col_071, "disp_ave_upri"},	// col_071
				{$col_072, "disp_std_upri"},	// col_072
				{$col_073, "disp_ave_unit"},	// col_073
				{$col_074, "disp_std_unit"},	// col_074
				{$qty_15_p + ".qty", "disp_ave_upri"},	// qty_15_p.qty
				{$col_076, "disp_ave_upri"},	// col_076
				{$col_077, "disp_std_upri"},	// col_077
				{$col_078, "disp_ave_unit"},	// col_078
				{$col_079, "disp_std_unit"},	// col_079
				{$qty_16_p + ".qty", "disp_ave_upri"},	// qty_16_p.qty
				{$col_081, "disp_ave_upri"},	// col_081
				{$col_082, "disp_std_upri"},	// col_082
				{$col_083, "disp_ave_unit"},	// col_083
				{$col_084, "disp_std_unit"},	// col_084
				{$qty_17_p + ".qty", "disp_ave_upri"},	// qty_17_p.qty
				{$col_086, "disp_ave_upri"},	// col_086
				{$col_087, "disp_std_upri"},	// col_087
				{$col_088, "disp_ave_unit"},	// col_088
				{$col_089, "disp_std_unit"},	// col_089
				{$qty_18_p + ".qty", "disp_ave_upri"},	// qty_18_p.qty
				{$col_091, "disp_ave_upri"},	// col_091
				{$col_092, "disp_std_upri"},	// col_092
				{$col_093, "disp_ave_unit"},	// col_093
				{$col_094, "disp_std_unit"},	// col_094
				{$qty_19_p + ".qty", "disp_ave_upri"},	// qty_19_p.qty
				{$col_096, "disp_ave_upri"},	// col_096
				{$col_097, "disp_std_upri"},	// col_097
				{$col_098, "disp_ave_unit"},	// col_098
				{$col_099, "disp_std_unit"},	// col_099
				{$qty_20_p + ".qty", "disp_ave_upri"},	// qty_20_p.qty
				{$col_101, "disp_ave_upri"},	// col_101
				{$col_102, "disp_std_upri"},	// col_102
				{$col_103, "disp_ave_unit"},	// col_103
				{$col_104, "disp_std_unit"},	// col_104
				{$qty_21_p + ".qty", "disp_ave_upri"},	// qty_21_p.qty
				{$col_106, "disp_ave_upri"},	// col_106
				{$col_107, "disp_std_upri"},	// col_107
				{$col_108, "disp_ave_unit"},	// col_108
				{$col_109, "disp_std_unit"},	// col_109
				{$qty_22_p + ".qty", "disp_ave_upri"},	// qty_22_p.qty
				{$col_111, "disp_ave_upri"},	// col_111
				{$col_112, "disp_std_upri"},	// col_112
				{$col_113, "disp_ave_unit"},	// col_113
				{$col_114, "disp_std_unit"},	// col_114
				{$qty_23_p + ".qty", "disp_ave_upri"},	// qty_23_p.qty
				{$col_116, "disp_ave_upri"},	// col_116
				{$col_117, "disp_std_upri"},	// col_117
				{$col_118, "disp_ave_unit"},	// col_118
				{$col_119, "disp_std_unit"},	// col_119
				{$qty_24_p + ".qty", "disp_ave_upri"},	// qty_24_p.qty
				{$col_121, "disp_ave_upri"},	// col_121
				{$col_122, "disp_std_upri"},	// col_122
				{$col_123, "disp_ave_unit"},	// col_123
				{$col_124, "disp_std_unit"},	// col_124
				{$qty_25_p + ".qty", "disp_ave_upri"},	// qty_25_p.qty
				{$col_126, "disp_ave_upri"},	// col_126
				{$col_127, "disp_std_upri"},	// col_127
				{$col_128, "disp_ave_unit"},	// col_128
				{$col_129, "disp_std_unit"},	// col_129
				{$qty_26_p + ".qty", "disp_ave_upri"},	// qty_26_p.qty
				{$col_131, "disp_ave_upri"},	// col_131
				{$col_132, "disp_std_upri"},	// col_132
				{$col_133, "disp_ave_unit"},	// col_133
				{$col_134, "disp_std_unit"},	// col_134
				{$qty_27_p + ".qty", "disp_ave_upri"},	// qty_27_p.qty
				{$col_136, "disp_ave_upri"},	// col_136
				{$col_137, "disp_std_upri"},	// col_137
				{$col_138, "disp_ave_unit"},	// col_138
				{$col_139, "disp_std_unit"},	// col_139
				{$qty_28_p + ".qty", "disp_ave_upri"},	// qty_28_p.qty
				{$col_141, "disp_ave_upri"},	// col_141
				{$col_142, "disp_std_upri"},	// col_142
				{$col_143, "disp_ave_unit"},	// col_143
				{$col_144, "disp_std_unit"},	// col_144
				{$qty_29_p + ".qty", "disp_ave_upri"},	// qty_29_p.qty
				{$col_146, "disp_ave_upri"},	// col_146
				{$col_147, "disp_std_upri"},	// col_147
				{$col_148, "disp_ave_unit"},	// col_148
				{$col_149, "disp_std_unit"},	// col_149
				{$qty_30_p + ".qty", "disp_ave_upri"},	// qty_30_p.qty
				{$col_151, "disp_ave_upri"},	// col_151
				{$col_152, "disp_std_upri"},	// col_152
				{$col_153, "disp_ave_unit"},	// col_153
				{$col_154, "disp_std_unit"},	// col_154
				{$qty_31_p + ".qty", "disp_ave_upri"},	// qty_31_p.qty
				{$col_156, "disp_ave_upri"},	// col_156
				{$col_157, "disp_std_upri"},	// col_157
				{$col_158, "disp_ave_unit"},	// col_158
				{$col_159, "disp_std_unit"},	// col_159
				{$qty_32_p + ".qty", "disp_ave_upri"},	// qty_32_p.qty
				{$col_161, "disp_ave_upri"},	// col_161
				{$col_162, "disp_std_upri"},	// col_162
				{$col_163, "disp_ave_unit"},	// col_163
				{$col_164, "disp_std_unit"},	// col_164
				{$qty_33_p + ".qty", "disp_ave_upri"},	// qty_33_p.qty
				{$col_166, "disp_ave_upri"},	// col_166
				{$col_167, "disp_std_upri"},	// col_167
				{$col_168, "disp_ave_unit"},	// col_168
				{$col_169, "disp_std_unit"},	// col_169
				{$qty_34_p + ".qty", "disp_ave_upri"},	// qty_34_p.qty
				{$col_171, "disp_ave_upri"},	// col_171
				{$col_172, "disp_std_upri"},	// col_172
				{$col_173, "disp_ave_unit"},	// col_173
				{$col_174, "disp_std_unit"},	// col_174
				{$qty_35_p + ".qty", "disp_ave_upri"},	// qty_35_p.qty
				{$col_176, "disp_ave_upri"},	// col_176
				{$col_177, "disp_std_upri"},	// col_177
				{$col_178, "disp_ave_unit"},	// col_178
				{$col_179, "disp_std_unit"},	// col_179
				{$qty_36_p + ".qty", "disp_ave_upri"},	// qty_36_p.qty
				{$col_181, "disp_ave_upri"},	// col_181
				{$col_182, "disp_std_upri"},	// col_182
				{$col_183, "disp_ave_unit"},	// col_183
				{$col_184, "disp_std_unit"},	// col_184
				{$qty_37_p + ".qty", "disp_ave_upri"},	// qty_37_p.qty
				{$col_186, "disp_ave_upri"},	// col_186
				{$col_187, "disp_std_upri"},	// col_187
				{$col_188, "disp_ave_unit"},	// col_188
				{$col_189, "disp_std_unit"},	// col_189
				{$qty_38_p + ".qty", "disp_ave_upri"},	// qty_38_p.qty
				{$col_191, "disp_ave_upri"},	// col_191
				{$col_192, "disp_std_upri"},	// col_192
				{$col_193, "disp_ave_unit"},	// col_193
				{$col_194, "disp_std_unit"},	// col_194
				{$qty_39_p + ".qty", "disp_ave_upri"},	// qty_39_p.qty
				{$col_196, "disp_ave_upri"},	// col_196
				{$col_197, "disp_std_upri"},	// col_197
				{$col_198, "disp_ave_unit"},	// col_198
				{$col_199, "disp_std_unit"},	// col_199
				{$qty_40_p + ".qty", "disp_ave_upri"},	// qty_40_p.qty
				{$col_201, "disp_ave_upri"},	// col_201
				{$col_202, "disp_std_upri"},	// col_202
				{$col_203, "disp_ave_unit"},	// col_203
				{$col_204, "disp_std_unit"},	// col_204
				{$qty_41_p + ".qty", "disp_ave_upri"},	// qty_41_p.qty
				{$col_206, "disp_ave_upri"},	// col_206
				{$col_207, "disp_std_upri"},	// col_207
				{$col_208, "disp_ave_unit"},	// col_208
				{$col_209, "disp_std_unit"},	// col_209
				{$qty_42_p + ".qty", "disp_ave_upri"},	// qty_42_p.qty
				{$col_211, "disp_ave_upri"},	// col_211
				{$col_212, "disp_std_upri"},	// col_212
				{$col_213, "disp_ave_unit"},	// col_213
				{$col_214, "disp_std_unit"},	// col_214
				{$qty_43_p + ".qty", "disp_ave_upri"},	// qty_43_p.qty
				{$col_216, "disp_ave_upri"},	// col_216
				{$col_217, "disp_std_upri"},	// col_217
				{$col_218, "disp_ave_unit"},	// col_218
				{$col_219, "disp_std_unit"},	// col_219
				{$qty_44_p + ".qty", "disp_ave_upri"},	// qty_44_p.qty
				{$col_221, "disp_ave_upri"},	// col_221
				{$col_222, "disp_std_upri"},	// col_222
				{$col_223, "disp_ave_unit"},	// col_223
				{$col_224, "disp_std_unit"},	// col_224
				{$qty_45_p + ".qty", "disp_ave_upri"},	// qty_45_p.qty
				{$col_226, "disp_ave_upri"},	// col_226
				{$col_227, "disp_std_upri"},	// col_227
				{$col_228, "disp_ave_unit"},	// col_228
				{$col_229, "disp_std_unit"},	// col_229
				{$qty_46_p + ".qty", "disp_ave_upri"},	// qty_46_p.qty
				{$col_231, "disp_ave_upri"},	// col_231
				{$col_232, "disp_std_upri"},	// col_232
				{$col_233, "disp_ave_unit"},	// col_233
				{$col_234, "disp_std_unit"},	// col_234
				{$qty_47_p + ".qty", "disp_ave_upri"},	// qty_47_p.qty
				{$col_236, "disp_ave_upri"},	// col_236
				{$col_237, "disp_std_upri"},	// col_237
				{$col_238, "disp_ave_unit"},	// col_238
				{$col_239, "disp_std_unit"},	// col_239
				{$qty_48_p + ".qty", "disp_ave_upri"},	// qty_48_p.qty
				{$col_241, "disp_ave_upri"},	// col_241
				{$col_242, "disp_std_upri"},	// col_242
				{$col_243, "disp_ave_unit"},	// col_243
				{$col_244, "disp_std_unit"},	// col_244
				{$qty_49_p + ".qty", "disp_ave_upri"},	// qty_49_p.qty
				{$col_246, "disp_ave_upri"},	// col_246
				{$col_247, "disp_std_upri"},	// col_247
				{$col_248, "disp_ave_unit"},	// col_248
				{$col_249, "disp_std_unit"},	// col_249
				{$qty_50_p + ".qty", "disp_ave_upri"},	// qty_50_p.qty
				{$col_251, "disp_ave_upri"},	// col_251
				{$col_252, "disp_std_upri"},	// col_252
				{$col_253, "disp_ave_unit"},	// col_253
				{$col_254, "disp_std_unit"},	// col_254
				{$qty_51_p + ".qty", "disp_ave_upri"},	// qty_51_p.qty
				{$col_256, "disp_ave_upri"},	// col_256
				{$col_257, "disp_std_upri"},	// col_257
				{$col_258, "disp_ave_unit"},	// col_258
				{$col_259, "disp_std_unit"},	// col_259
				{$qty_52_p + ".qty", "disp_ave_upri"},	// qty_52_p.qty
				{$col_261, "disp_ave_upri"},	// col_261
				{$col_262, "disp_std_upri"},	// col_262
				{$col_263, "disp_ave_unit"},	// col_263
				{$col_264, "disp_std_unit"},	// col_264
				{$qty_53_p + ".qty", "disp_ave_upri"},	// qty_53_p.qty
				{$col_266, "disp_ave_upri"},	// col_266
				{$col_267, "disp_std_upri"},	// col_267
				{$col_268, "disp_ave_unit"},	// col_268
				{$col_269, "disp_std_unit"},	// col_269
				{$qty_54_p + ".qty", "disp_ave_upri"},	// qty_54_p.qty
				{$col_271, "disp_ave_upri"},	// col_271
				{$col_272, "disp_std_upri"},	// col_272
				{$col_273, "disp_ave_unit"},	// col_273
				{$col_274, "disp_std_unit"},	// col_274
				{$qty_55_p + ".qty", "disp_ave_upri"},	// qty_55_p.qty
				{$col_276, "disp_ave_upri"},	// col_276
				{$col_277, "disp_std_upri"},	// col_277
				{$col_278, "disp_ave_unit"},	// col_278
				{$col_279, "disp_std_unit"},	// col_279
				{$qty_56_p + ".qty", "disp_ave_upri"},	// qty_56_p.qty
				{$col_281, "disp_ave_upri"},	// col_281
				{$col_282, "disp_std_upri"},	// col_282
				{$col_283, "disp_ave_unit"},	// col_283
				{$col_284, "disp_std_unit"},	// col_284
				{$qty_57_p + ".qty", "disp_ave_upri"},	// qty_57_p.qty
				{$col_286, "disp_ave_upri"},	// col_286
				{$col_287, "disp_std_upri"},	// col_287
				{$col_288, "disp_ave_unit"},	// col_288
				{$col_289, "disp_std_unit"},	// col_289
				{$qty_58_p + ".qty", "disp_ave_upri"},	// qty_58_p.qty
				{$col_291, "disp_ave_upri"},	// col_291
				{$col_292, "disp_std_upri"},	// col_292
				{$col_293, "disp_ave_unit"},	// col_293
				{$col_294, "disp_std_unit"},	// col_294
				{$qty_59_p + ".qty", "disp_ave_upri"},	// qty_59_p.qty
				{$col_296, "disp_ave_upri"},	// col_296
				{$col_297, "disp_std_upri"},	// col_297
				{$col_298, "disp_ave_unit"},	// col_298
				{$col_299, "disp_std_unit"}	// col_299
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
				{$qty_01_p + ".qty", "Key"},	// qty_01_p.qty
				{$col_006, "Key"},	// col_006
				{$col_007, "Key"},	// col_007
				{$col_008, "Key"},	// col_008
				{$col_009, "Key"},	// col_009
				{$qty_02_p + ".qty", "Key"},	// qty_02_p.qty
				{$col_011, "Key"},	// col_011
				{$col_012, "Key"},	// col_012
				{$col_013, "Key"},	// col_013
				{$col_014, "Key"},	// col_014
				{$qty_03_p + ".qty", "Key"},	// qty_03_p.qty
				{$col_016, "Key"},	// col_016
				{$col_017, "Key"},	// col_017
				{$col_018, "Key"},	// col_018
				{$col_019, "Key"},	// col_019
				{$qty_04_p + ".qty", "Key"},	// qty_04_p.qty
				{$col_021, "Key"},	// col_021
				{$col_022, "Key"},	// col_022
				{$col_023, "Key"},	// col_023
				{$col_024, "Key"},	// col_024
				{$qty_05_p + ".qty", "Key"},	// qty_05_p.qty
				{$col_026, "Key"},	// col_026
				{$col_027, "Key"},	// col_027
				{$col_028, "Key"},	// col_028
				{$col_029, "Key"},	// col_029
				{$qty_06_p + ".qty", "Key"},	// qty_06_p.qty
				{$col_031, "Key"},	// col_031
				{$col_032, "Key"},	// col_032
				{$col_033, "Key"},	// col_033
				{$col_034, "Key"},	// col_034
				{$qty_07_p + ".qty", "Key"},	// qty_07_p.qty
				{$col_036, "Key"},	// col_036
				{$col_037, "Key"},	// col_037
				{$col_038, "Key"},	// col_038
				{$col_039, "Key"},	// col_039
				{$qty_08_p + ".qty", "Key"},	// qty_08_p.qty
				{$col_041, "Key"},	// col_041
				{$col_042, "Key"},	// col_042
				{$col_043, "Key"},	// col_043
				{$col_044, "Key"},	// col_044
				{$qty_09_p + ".qty", "Key"},	// qty_09_p.qty
				{$col_046, "Key"},	// col_046
				{$col_047, "Key"},	// col_047
				{$col_048, "Key"},	// col_048
				{$col_049, "Key"},	// col_049
				{$qty_10_p + ".qty", "Key"},	// qty_10_p.qty
				{$col_051, "Key"},	// col_051
				{$col_052, "Key"},	// col_052
				{$col_053, "Key"},	// col_053
				{$col_054, "Key"},	// col_054
				{$qty_11_p + ".qty", "Key"},	// qty_11_p.qty
				{$col_056, "Key"},	// col_056
				{$col_057, "Key"},	// col_057
				{$col_058, "Key"},	// col_058
				{$col_059, "Key"},	// col_059
				{$qty_12_p + ".qty", "Key"},	// qty_12_p.qty
				{$col_061, "Key"},	// col_061
				{$col_062, "Key"},	// col_062
				{$col_063, "Key"},	// col_063
				{$col_064, "Key"},	// col_064
				{$qty_13_p + ".qty", "Key"},	// qty_13_p.qty
				{$col_066, "Key"},	// col_066
				{$col_067, "Key"},	// col_067
				{$col_068, "Key"},	// col_068
				{$col_069, "Key"},	// col_069
				{$qty_14_p + ".qty", "Key"},	// qty_14_p.qty
				{$col_071, "Key"},	// col_071
				{$col_072, "Key"},	// col_072
				{$col_073, "Key"},	// col_073
				{$col_074, "Key"},	// col_074
				{$qty_15_p + ".qty", "Key"},	// qty_15_p.qty
				{$col_076, "Key"},	// col_076
				{$col_077, "Key"},	// col_077
				{$col_078, "Key"},	// col_078
				{$col_079, "Key"},	// col_079
				{$qty_16_p + ".qty", "Key"},	// qty_16_p.qty
				{$col_081, "Key"},	// col_081
				{$col_082, "Key"},	// col_082
				{$col_083, "Key"},	// col_083
				{$col_084, "Key"},	// col_084
				{$qty_17_p + ".qty", "Key"},	// qty_17_p.qty
				{$col_086, "Key"},	// col_086
				{$col_087, "Key"},	// col_087
				{$col_088, "Key"},	// col_088
				{$col_089, "Key"},	// col_089
				{$qty_18_p + ".qty", "Key"},	// qty_18_p.qty
				{$col_091, "Key"},	// col_091
				{$col_092, "Key"},	// col_092
				{$col_093, "Key"},	// col_093
				{$col_094, "Key"},	// col_094
				{$qty_19_p + ".qty", "Key"},	// qty_19_p.qty
				{$col_096, "Key"},	// col_096
				{$col_097, "Key"},	// col_097
				{$col_098, "Key"},	// col_098
				{$col_099, "Key"},	// col_099
				{$qty_20_p + ".qty", "Key"},	// qty_20_p.qty
				{$col_101, "Key"},	// col_101
				{$col_102, "Key"},	// col_102
				{$col_103, "Key"},	// col_103
				{$col_104, "Key"},	// col_104
				{$qty_21_p + ".qty", "Key"},	// qty_21_p.qty
				{$col_106, "Key"},	// col_106
				{$col_107, "Key"},	// col_107
				{$col_108, "Key"},	// col_108
				{$col_109, "Key"},	// col_109
				{$qty_22_p + ".qty", "Key"},	// qty_22_p.qty
				{$col_111, "Key"},	// col_111
				{$col_112, "Key"},	// col_112
				{$col_113, "Key"},	// col_113
				{$col_114, "Key"},	// col_114
				{$qty_23_p + ".qty", "Key"},	// qty_23_p.qty
				{$col_116, "Key"},	// col_116
				{$col_117, "Key"},	// col_117
				{$col_118, "Key"},	// col_118
				{$col_119, "Key"},	// col_119
				{$qty_24_p + ".qty", "Key"},	// qty_24_p.qty
				{$col_121, "Key"},	// col_121
				{$col_122, "Key"},	// col_122
				{$col_123, "Key"},	// col_123
				{$col_124, "Key"},	// col_124
				{$qty_25_p + ".qty", "Key"},	// qty_25_p.qty
				{$col_126, "Key"},	// col_126
				{$col_127, "Key"},	// col_127
				{$col_128, "Key"},	// col_128
				{$col_129, "Key"},	// col_129
				{$qty_26_p + ".qty", "Key"},	// qty_26_p.qty
				{$col_131, "Key"},	// col_131
				{$col_132, "Key"},	// col_132
				{$col_133, "Key"},	// col_133
				{$col_134, "Key"},	// col_134
				{$qty_27_p + ".qty", "Key"},	// qty_27_p.qty
				{$col_136, "Key"},	// col_136
				{$col_137, "Key"},	// col_137
				{$col_138, "Key"},	// col_138
				{$col_139, "Key"},	// col_139
				{$qty_28_p + ".qty", "Key"},	// qty_28_p.qty
				{$col_141, "Key"},	// col_141
				{$col_142, "Key"},	// col_142
				{$col_143, "Key"},	// col_143
				{$col_144, "Key"},	// col_144
				{$qty_29_p + ".qty", "Key"},	// qty_29_p.qty
				{$col_146, "Key"},	// col_146
				{$col_147, "Key"},	// col_147
				{$col_148, "Key"},	// col_148
				{$col_149, "Key"},	// col_149
				{$qty_30_p + ".qty", "Key"},	// qty_30_p.qty
				{$col_151, "Key"},	// col_151
				{$col_152, "Key"},	// col_152
				{$col_153, "Key"},	// col_153
				{$col_154, "Key"},	// col_154
				{$qty_31_p + ".qty", "Key"},	// qty_31_p.qty
				{$col_156, "Key"},	// col_156
				{$col_157, "Key"},	// col_157
				{$col_158, "Key"},	// col_158
				{$col_159, "Key"},	// col_159
				{$qty_32_p + ".qty", "Key"},	// qty_32_p.qty
				{$col_161, "Key"},	// col_161
				{$col_162, "Key"},	// col_162
				{$col_163, "Key"},	// col_163
				{$col_164, "Key"},	// col_164
				{$qty_33_p + ".qty", "Key"},	// qty_33_p.qty
				{$col_166, "Key"},	// col_166
				{$col_167, "Key"},	// col_167
				{$col_168, "Key"},	// col_168
				{$col_169, "Key"},	// col_169
				{$qty_34_p + ".qty", "Key"},	// qty_34_p.qty
				{$col_171, "Key"},	// col_171
				{$col_172, "Key"},	// col_172
				{$col_173, "Key"},	// col_173
				{$col_174, "Key"},	// col_174
				{$qty_35_p + ".qty", "Key"},	// qty_35_p.qty
				{$col_176, "Key"},	// col_176
				{$col_177, "Key"},	// col_177
				{$col_178, "Key"},	// col_178
				{$col_179, "Key"},	// col_179
				{$qty_36_p + ".qty", "Key"},	// qty_36_p.qty
				{$col_181, "Key"},	// col_181
				{$col_182, "Key"},	// col_182
				{$col_183, "Key"},	// col_183
				{$col_184, "Key"},	// col_184
				{$qty_37_p + ".qty", "Key"},	// qty_37_p.qty
				{$col_186, "Key"},	// col_186
				{$col_187, "Key"},	// col_187
				{$col_188, "Key"},	// col_188
				{$col_189, "Key"},	// col_189
				{$qty_38_p + ".qty", "Key"},	// qty_38_p.qty
				{$col_191, "Key"},	// col_191
				{$col_192, "Key"},	// col_192
				{$col_193, "Key"},	// col_193
				{$col_194, "Key"},	// col_194
				{$qty_39_p + ".qty", "Key"},	// qty_39_p.qty
				{$col_196, "Key"},	// col_196
				{$col_197, "Key"},	// col_197
				{$col_198, "Key"},	// col_198
				{$col_199, "Key"},	// col_199
				{$qty_40_p + ".qty", "Key"},	// qty_40_p.qty
				{$col_201, "Key"},	// col_201
				{$col_202, "Key"},	// col_202
				{$col_203, "Key"},	// col_203
				{$col_204, "Key"},	// col_204
				{$qty_41_p + ".qty", "Key"},	// qty_41_p.qty
				{$col_206, "Key"},	// col_206
				{$col_207, "Key"},	// col_207
				{$col_208, "Key"},	// col_208
				{$col_209, "Key"},	// col_209
				{$qty_42_p + ".qty", "Key"},	// qty_42_p.qty
				{$col_211, "Key"},	// col_211
				{$col_212, "Key"},	// col_212
				{$col_213, "Key"},	// col_213
				{$col_214, "Key"},	// col_214
				{$qty_43_p + ".qty", "Key"},	// qty_43_p.qty
				{$col_216, "Key"},	// col_216
				{$col_217, "Key"},	// col_217
				{$col_218, "Key"},	// col_218
				{$col_219, "Key"},	// col_219
				{$qty_44_p + ".qty", "Key"},	// qty_44_p.qty
				{$col_221, "Key"},	// col_221
				{$col_222, "Key"},	// col_222
				{$col_223, "Key"},	// col_223
				{$col_224, "Key"},	// col_224
				{$qty_45_p + ".qty", "Key"},	// qty_45_p.qty
				{$col_226, "Key"},	// col_226
				{$col_227, "Key"},	// col_227
				{$col_228, "Key"},	// col_228
				{$col_229, "Key"},	// col_229
				{$qty_46_p + ".qty", "Key"},	// qty_46_p.qty
				{$col_231, "Key"},	// col_231
				{$col_232, "Key"},	// col_232
				{$col_233, "Key"},	// col_233
				{$col_234, "Key"},	// col_234
				{$qty_47_p + ".qty", "Key"},	// qty_47_p.qty
				{$col_236, "Key"},	// col_236
				{$col_237, "Key"},	// col_237
				{$col_238, "Key"},	// col_238
				{$col_239, "Key"},	// col_239
				{$qty_48_p + ".qty", "Key"},	// qty_48_p.qty
				{$col_241, "Key"},	// col_241
				{$col_242, "Key"},	// col_242
				{$col_243, "Key"},	// col_243
				{$col_244, "Key"},	// col_244
				{$qty_49_p + ".qty", "Key"},	// qty_49_p.qty
				{$col_246, "Key"},	// col_246
				{$col_247, "Key"},	// col_247
				{$col_248, "Key"},	// col_248
				{$col_249, "Key"},	// col_249
				{$qty_50_p + ".qty", "Key"},	// qty_50_p.qty
				{$col_251, "Key"},	// col_251
				{$col_252, "Key"},	// col_252
				{$col_253, "Key"},	// col_253
				{$col_254, "Key"},	// col_254
				{$qty_51_p + ".qty", "Key"},	// qty_51_p.qty
				{$col_256, "Key"},	// col_256
				{$col_257, "Key"},	// col_257
				{$col_258, "Key"},	// col_258
				{$col_259, "Key"},	// col_259
				{$qty_52_p + ".qty", "Key"},	// qty_52_p.qty
				{$col_261, "Key"},	// col_261
				{$col_262, "Key"},	// col_262
				{$col_263, "Key"},	// col_263
				{$col_264, "Key"},	// col_264
				{$qty_53_p + ".qty", "Key"},	// qty_53_p.qty
				{$col_266, "Key"},	// col_266
				{$col_267, "Key"},	// col_267
				{$col_268, "Key"},	// col_268
				{$col_269, "Key"},	// col_269
				{$qty_54_p + ".qty", "Key"},	// qty_54_p.qty
				{$col_271, "Key"},	// col_271
				{$col_272, "Key"},	// col_272
				{$col_273, "Key"},	// col_273
				{$col_274, "Key"},	// col_274
				{$qty_55_p + ".qty", "Key"},	// qty_55_p.qty
				{$col_276, "Key"},	// col_276
				{$col_277, "Key"},	// col_277
				{$col_278, "Key"},	// col_278
				{$col_279, "Key"},	// col_279
				{$qty_56_p + ".qty", "Key"},	// qty_56_p.qty
				{$col_281, "Key"},	// col_281
				{$col_282, "Key"},	// col_282
				{$col_283, "Key"},	// col_283
				{$col_284, "Key"},	// col_284
				{$qty_57_p + ".qty", "Key"},	// qty_57_p.qty
				{$col_286, "Key"},	// col_286
				{$col_287, "Key"},	// col_287
				{$col_288, "Key"},	// col_288
				{$col_289, "Key"},	// col_289
				{$qty_58_p + ".qty", "Key"},	// qty_58_p.qty
				{$col_291, "Key"},	// col_291
				{$col_292, "Key"},	// col_292
				{$col_293, "Key"},	// col_293
				{$col_294, "Key"},	// col_294
				{$qty_59_p + ".qty", "Key"},	// qty_59_p.qty
				{$col_296, "Key"},	// col_296
				{$col_297, "Key"},	// col_297
				{$col_298, "Key"},	// col_298
				{$col_299, "Key"}	// col_299
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
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 4, $mng_dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 4, $mng_dpt_cd, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 5, $mng_dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 5, $mng_dpt_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 6, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 6, $itm_p, row);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 7, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 7, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 8, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 8, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 9, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 9, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 10, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 10, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 11, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 11, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 12, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 12, $itm_jnl_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 13, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 13, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 14, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 14, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 15, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 15, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 16, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 16, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 17, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 17, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 18, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 18, $sno4, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 19, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 19, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 20, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 20, $sppl_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 21, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 21, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 22, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 22, $asst_typ_nm, value);
	}


	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 23, $repurc_obli_flg);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 23, $repurc_obli_flg, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 24, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 24, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 25, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 25, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 26, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 26, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 26, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 26, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 26, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 26, $dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_00_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 27, $qty_00_p);
	}
	
	public void qty_00_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 27, $qty_00_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_001() {
		return getConstNumber(offset + 28, $col_001);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_001(MCNumber value) {
		setConstNumber(offset + 28, $col_001, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_001(int value) {
		setConstNumber(offset + 28, $col_001, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_001(long value) {
		setConstNumber(offset + 28, $col_001, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_001(float value) {
		setConstNumber(offset + 28, $col_001, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_001(double value) {
		setConstNumber(offset + 28, $col_001, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_002() {
		return getConstNumber(offset + 29, $col_002);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_002(MCNumber value) {
		setConstNumber(offset + 29, $col_002, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_002(int value) {
		setConstNumber(offset + 29, $col_002, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_002(long value) {
		setConstNumber(offset + 29, $col_002, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_002(float value) {
		setConstNumber(offset + 29, $col_002, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_002(double value) {
		setConstNumber(offset + 29, $col_002, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_003() {
		return getConstNumber(offset + 30, $col_003);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_003(MCNumber value) {
		setConstNumber(offset + 30, $col_003, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_003(int value) {
		setConstNumber(offset + 30, $col_003, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_003(long value) {
		setConstNumber(offset + 30, $col_003, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_003(float value) {
		setConstNumber(offset + 30, $col_003, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_003(double value) {
		setConstNumber(offset + 30, $col_003, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_004() {
		return getConstNumber(offset + 31, $col_004);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_004(MCNumber value) {
		setConstNumber(offset + 31, $col_004, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_004(int value) {
		setConstNumber(offset + 31, $col_004, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_004(long value) {
		setConstNumber(offset + 31, $col_004, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_004(float value) {
		setConstNumber(offset + 31, $col_004, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_004(double value) {
		setConstNumber(offset + 31, $col_004, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_01_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 32, $qty_01_p);
	}
	
	public void qty_01_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 32, $qty_01_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_006() {
		return getConstNumber(offset + 33, $col_006);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_006(MCNumber value) {
		setConstNumber(offset + 33, $col_006, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_006(int value) {
		setConstNumber(offset + 33, $col_006, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_006(long value) {
		setConstNumber(offset + 33, $col_006, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_006(float value) {
		setConstNumber(offset + 33, $col_006, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_006(double value) {
		setConstNumber(offset + 33, $col_006, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_007() {
		return getConstNumber(offset + 34, $col_007);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_007(MCNumber value) {
		setConstNumber(offset + 34, $col_007, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_007(int value) {
		setConstNumber(offset + 34, $col_007, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_007(long value) {
		setConstNumber(offset + 34, $col_007, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_007(float value) {
		setConstNumber(offset + 34, $col_007, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_007(double value) {
		setConstNumber(offset + 34, $col_007, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_008() {
		return getConstNumber(offset + 35, $col_008);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_008(MCNumber value) {
		setConstNumber(offset + 35, $col_008, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_008(int value) {
		setConstNumber(offset + 35, $col_008, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_008(long value) {
		setConstNumber(offset + 35, $col_008, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_008(float value) {
		setConstNumber(offset + 35, $col_008, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_008(double value) {
		setConstNumber(offset + 35, $col_008, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_009() {
		return getConstNumber(offset + 36, $col_009);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_009(MCNumber value) {
		setConstNumber(offset + 36, $col_009, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_009(int value) {
		setConstNumber(offset + 36, $col_009, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_009(long value) {
		setConstNumber(offset + 36, $col_009, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_009(float value) {
		setConstNumber(offset + 36, $col_009, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_009(double value) {
		setConstNumber(offset + 36, $col_009, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_02_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 37, $qty_02_p);
	}
	
	public void qty_02_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 37, $qty_02_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_011() {
		return getConstNumber(offset + 38, $col_011);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_011(MCNumber value) {
		setConstNumber(offset + 38, $col_011, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_011(int value) {
		setConstNumber(offset + 38, $col_011, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_011(long value) {
		setConstNumber(offset + 38, $col_011, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_011(float value) {
		setConstNumber(offset + 38, $col_011, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_011(double value) {
		setConstNumber(offset + 38, $col_011, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_012() {
		return getConstNumber(offset + 39, $col_012);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_012(MCNumber value) {
		setConstNumber(offset + 39, $col_012, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_012(int value) {
		setConstNumber(offset + 39, $col_012, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_012(long value) {
		setConstNumber(offset + 39, $col_012, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_012(float value) {
		setConstNumber(offset + 39, $col_012, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_012(double value) {
		setConstNumber(offset + 39, $col_012, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_013() {
		return getConstNumber(offset + 40, $col_013);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_013(MCNumber value) {
		setConstNumber(offset + 40, $col_013, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_013(int value) {
		setConstNumber(offset + 40, $col_013, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_013(long value) {
		setConstNumber(offset + 40, $col_013, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_013(float value) {
		setConstNumber(offset + 40, $col_013, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_013(double value) {
		setConstNumber(offset + 40, $col_013, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_014() {
		return getConstNumber(offset + 41, $col_014);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_014(MCNumber value) {
		setConstNumber(offset + 41, $col_014, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_014(int value) {
		setConstNumber(offset + 41, $col_014, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_014(long value) {
		setConstNumber(offset + 41, $col_014, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_014(float value) {
		setConstNumber(offset + 41, $col_014, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_014(double value) {
		setConstNumber(offset + 41, $col_014, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_03_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 42, $qty_03_p);
	}
	
	public void qty_03_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 42, $qty_03_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_016() {
		return getConstNumber(offset + 43, $col_016);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_016(MCNumber value) {
		setConstNumber(offset + 43, $col_016, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_016(int value) {
		setConstNumber(offset + 43, $col_016, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_016(long value) {
		setConstNumber(offset + 43, $col_016, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_016(float value) {
		setConstNumber(offset + 43, $col_016, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_016(double value) {
		setConstNumber(offset + 43, $col_016, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_017() {
		return getConstNumber(offset + 44, $col_017);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_017(MCNumber value) {
		setConstNumber(offset + 44, $col_017, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_017(int value) {
		setConstNumber(offset + 44, $col_017, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_017(long value) {
		setConstNumber(offset + 44, $col_017, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_017(float value) {
		setConstNumber(offset + 44, $col_017, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_017(double value) {
		setConstNumber(offset + 44, $col_017, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_018() {
		return getConstNumber(offset + 45, $col_018);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_018(MCNumber value) {
		setConstNumber(offset + 45, $col_018, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_018(int value) {
		setConstNumber(offset + 45, $col_018, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_018(long value) {
		setConstNumber(offset + 45, $col_018, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_018(float value) {
		setConstNumber(offset + 45, $col_018, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_018(double value) {
		setConstNumber(offset + 45, $col_018, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_019() {
		return getConstNumber(offset + 46, $col_019);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_019(MCNumber value) {
		setConstNumber(offset + 46, $col_019, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_019(int value) {
		setConstNumber(offset + 46, $col_019, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_019(long value) {
		setConstNumber(offset + 46, $col_019, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_019(float value) {
		setConstNumber(offset + 46, $col_019, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_019(double value) {
		setConstNumber(offset + 46, $col_019, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_04_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 47, $qty_04_p);
	}
	
	public void qty_04_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 47, $qty_04_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_021() {
		return getConstNumber(offset + 48, $col_021);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_021(MCNumber value) {
		setConstNumber(offset + 48, $col_021, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_021(int value) {
		setConstNumber(offset + 48, $col_021, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_021(long value) {
		setConstNumber(offset + 48, $col_021, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_021(float value) {
		setConstNumber(offset + 48, $col_021, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_021(double value) {
		setConstNumber(offset + 48, $col_021, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_022() {
		return getConstNumber(offset + 49, $col_022);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_022(MCNumber value) {
		setConstNumber(offset + 49, $col_022, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_022(int value) {
		setConstNumber(offset + 49, $col_022, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_022(long value) {
		setConstNumber(offset + 49, $col_022, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_022(float value) {
		setConstNumber(offset + 49, $col_022, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_022(double value) {
		setConstNumber(offset + 49, $col_022, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_023() {
		return getConstNumber(offset + 50, $col_023);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_023(MCNumber value) {
		setConstNumber(offset + 50, $col_023, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_023(int value) {
		setConstNumber(offset + 50, $col_023, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_023(long value) {
		setConstNumber(offset + 50, $col_023, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_023(float value) {
		setConstNumber(offset + 50, $col_023, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_023(double value) {
		setConstNumber(offset + 50, $col_023, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_024() {
		return getConstNumber(offset + 51, $col_024);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_024(MCNumber value) {
		setConstNumber(offset + 51, $col_024, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_024(int value) {
		setConstNumber(offset + 51, $col_024, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_024(long value) {
		setConstNumber(offset + 51, $col_024, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_024(float value) {
		setConstNumber(offset + 51, $col_024, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_024(double value) {
		setConstNumber(offset + 51, $col_024, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_05_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 52, $qty_05_p);
	}
	
	public void qty_05_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 52, $qty_05_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_026() {
		return getConstNumber(offset + 53, $col_026);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_026(MCNumber value) {
		setConstNumber(offset + 53, $col_026, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_026(int value) {
		setConstNumber(offset + 53, $col_026, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_026(long value) {
		setConstNumber(offset + 53, $col_026, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_026(float value) {
		setConstNumber(offset + 53, $col_026, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_026(double value) {
		setConstNumber(offset + 53, $col_026, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_027() {
		return getConstNumber(offset + 54, $col_027);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_027(MCNumber value) {
		setConstNumber(offset + 54, $col_027, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_027(int value) {
		setConstNumber(offset + 54, $col_027, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_027(long value) {
		setConstNumber(offset + 54, $col_027, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_027(float value) {
		setConstNumber(offset + 54, $col_027, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_027(double value) {
		setConstNumber(offset + 54, $col_027, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_028() {
		return getConstNumber(offset + 55, $col_028);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_028(MCNumber value) {
		setConstNumber(offset + 55, $col_028, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_028(int value) {
		setConstNumber(offset + 55, $col_028, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_028(long value) {
		setConstNumber(offset + 55, $col_028, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_028(float value) {
		setConstNumber(offset + 55, $col_028, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_028(double value) {
		setConstNumber(offset + 55, $col_028, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_029() {
		return getConstNumber(offset + 56, $col_029);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_029(MCNumber value) {
		setConstNumber(offset + 56, $col_029, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_029(int value) {
		setConstNumber(offset + 56, $col_029, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_029(long value) {
		setConstNumber(offset + 56, $col_029, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_029(float value) {
		setConstNumber(offset + 56, $col_029, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_029(double value) {
		setConstNumber(offset + 56, $col_029, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_06_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 57, $qty_06_p);
	}
	
	public void qty_06_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 57, $qty_06_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_031() {
		return getConstNumber(offset + 58, $col_031);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_031(MCNumber value) {
		setConstNumber(offset + 58, $col_031, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_031(int value) {
		setConstNumber(offset + 58, $col_031, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_031(long value) {
		setConstNumber(offset + 58, $col_031, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_031(float value) {
		setConstNumber(offset + 58, $col_031, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_031(double value) {
		setConstNumber(offset + 58, $col_031, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_032() {
		return getConstNumber(offset + 59, $col_032);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_032(MCNumber value) {
		setConstNumber(offset + 59, $col_032, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_032(int value) {
		setConstNumber(offset + 59, $col_032, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_032(long value) {
		setConstNumber(offset + 59, $col_032, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_032(float value) {
		setConstNumber(offset + 59, $col_032, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_032(double value) {
		setConstNumber(offset + 59, $col_032, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_033() {
		return getConstNumber(offset + 60, $col_033);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_033(MCNumber value) {
		setConstNumber(offset + 60, $col_033, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_033(int value) {
		setConstNumber(offset + 60, $col_033, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_033(long value) {
		setConstNumber(offset + 60, $col_033, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_033(float value) {
		setConstNumber(offset + 60, $col_033, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_033(double value) {
		setConstNumber(offset + 60, $col_033, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_034() {
		return getConstNumber(offset + 61, $col_034);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_034(MCNumber value) {
		setConstNumber(offset + 61, $col_034, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_034(int value) {
		setConstNumber(offset + 61, $col_034, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_034(long value) {
		setConstNumber(offset + 61, $col_034, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_034(float value) {
		setConstNumber(offset + 61, $col_034, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_034(double value) {
		setConstNumber(offset + 61, $col_034, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_07_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 62, $qty_07_p);
	}
	
	public void qty_07_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 62, $qty_07_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_036() {
		return getConstNumber(offset + 63, $col_036);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_036(MCNumber value) {
		setConstNumber(offset + 63, $col_036, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_036(int value) {
		setConstNumber(offset + 63, $col_036, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_036(long value) {
		setConstNumber(offset + 63, $col_036, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_036(float value) {
		setConstNumber(offset + 63, $col_036, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_036(double value) {
		setConstNumber(offset + 63, $col_036, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_037() {
		return getConstNumber(offset + 64, $col_037);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_037(MCNumber value) {
		setConstNumber(offset + 64, $col_037, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_037(int value) {
		setConstNumber(offset + 64, $col_037, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_037(long value) {
		setConstNumber(offset + 64, $col_037, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_037(float value) {
		setConstNumber(offset + 64, $col_037, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_037(double value) {
		setConstNumber(offset + 64, $col_037, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_038() {
		return getConstNumber(offset + 65, $col_038);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_038(MCNumber value) {
		setConstNumber(offset + 65, $col_038, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_038(int value) {
		setConstNumber(offset + 65, $col_038, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_038(long value) {
		setConstNumber(offset + 65, $col_038, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_038(float value) {
		setConstNumber(offset + 65, $col_038, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_038(double value) {
		setConstNumber(offset + 65, $col_038, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_039() {
		return getConstNumber(offset + 66, $col_039);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_039(MCNumber value) {
		setConstNumber(offset + 66, $col_039, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_039(int value) {
		setConstNumber(offset + 66, $col_039, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_039(long value) {
		setConstNumber(offset + 66, $col_039, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_039(float value) {
		setConstNumber(offset + 66, $col_039, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_039(double value) {
		setConstNumber(offset + 66, $col_039, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_08_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 67, $qty_08_p);
	}
	
	public void qty_08_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 67, $qty_08_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_041() {
		return getConstNumber(offset + 68, $col_041);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_041(MCNumber value) {
		setConstNumber(offset + 68, $col_041, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_041(int value) {
		setConstNumber(offset + 68, $col_041, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_041(long value) {
		setConstNumber(offset + 68, $col_041, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_041(float value) {
		setConstNumber(offset + 68, $col_041, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_041(double value) {
		setConstNumber(offset + 68, $col_041, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_042() {
		return getConstNumber(offset + 69, $col_042);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_042(MCNumber value) {
		setConstNumber(offset + 69, $col_042, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_042(int value) {
		setConstNumber(offset + 69, $col_042, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_042(long value) {
		setConstNumber(offset + 69, $col_042, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_042(float value) {
		setConstNumber(offset + 69, $col_042, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_042(double value) {
		setConstNumber(offset + 69, $col_042, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_043() {
		return getConstNumber(offset + 70, $col_043);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_043(MCNumber value) {
		setConstNumber(offset + 70, $col_043, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_043(int value) {
		setConstNumber(offset + 70, $col_043, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_043(long value) {
		setConstNumber(offset + 70, $col_043, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_043(float value) {
		setConstNumber(offset + 70, $col_043, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_043(double value) {
		setConstNumber(offset + 70, $col_043, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_044() {
		return getConstNumber(offset + 71, $col_044);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_044(MCNumber value) {
		setConstNumber(offset + 71, $col_044, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_044(int value) {
		setConstNumber(offset + 71, $col_044, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_044(long value) {
		setConstNumber(offset + 71, $col_044, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_044(float value) {
		setConstNumber(offset + 71, $col_044, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_044(double value) {
		setConstNumber(offset + 71, $col_044, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_09_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 72, $qty_09_p);
	}
	
	public void qty_09_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 72, $qty_09_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_046() {
		return getConstNumber(offset + 73, $col_046);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_046(MCNumber value) {
		setConstNumber(offset + 73, $col_046, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_046(int value) {
		setConstNumber(offset + 73, $col_046, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_046(long value) {
		setConstNumber(offset + 73, $col_046, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_046(float value) {
		setConstNumber(offset + 73, $col_046, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_046(double value) {
		setConstNumber(offset + 73, $col_046, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_047() {
		return getConstNumber(offset + 74, $col_047);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_047(MCNumber value) {
		setConstNumber(offset + 74, $col_047, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_047(int value) {
		setConstNumber(offset + 74, $col_047, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_047(long value) {
		setConstNumber(offset + 74, $col_047, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_047(float value) {
		setConstNumber(offset + 74, $col_047, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_047(double value) {
		setConstNumber(offset + 74, $col_047, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_048() {
		return getConstNumber(offset + 75, $col_048);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_048(MCNumber value) {
		setConstNumber(offset + 75, $col_048, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_048(int value) {
		setConstNumber(offset + 75, $col_048, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_048(long value) {
		setConstNumber(offset + 75, $col_048, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_048(float value) {
		setConstNumber(offset + 75, $col_048, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_048(double value) {
		setConstNumber(offset + 75, $col_048, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_049() {
		return getConstNumber(offset + 76, $col_049);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_049(MCNumber value) {
		setConstNumber(offset + 76, $col_049, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_049(int value) {
		setConstNumber(offset + 76, $col_049, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_049(long value) {
		setConstNumber(offset + 76, $col_049, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_049(float value) {
		setConstNumber(offset + 76, $col_049, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_049(double value) {
		setConstNumber(offset + 76, $col_049, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_10_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 77, $qty_10_p);
	}
	
	public void qty_10_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 77, $qty_10_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_051() {
		return getConstNumber(offset + 78, $col_051);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_051(MCNumber value) {
		setConstNumber(offset + 78, $col_051, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_051(int value) {
		setConstNumber(offset + 78, $col_051, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_051(long value) {
		setConstNumber(offset + 78, $col_051, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_051(float value) {
		setConstNumber(offset + 78, $col_051, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_051(double value) {
		setConstNumber(offset + 78, $col_051, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_052() {
		return getConstNumber(offset + 79, $col_052);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_052(MCNumber value) {
		setConstNumber(offset + 79, $col_052, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_052(int value) {
		setConstNumber(offset + 79, $col_052, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_052(long value) {
		setConstNumber(offset + 79, $col_052, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_052(float value) {
		setConstNumber(offset + 79, $col_052, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_052(double value) {
		setConstNumber(offset + 79, $col_052, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_053() {
		return getConstNumber(offset + 80, $col_053);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_053(MCNumber value) {
		setConstNumber(offset + 80, $col_053, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_053(int value) {
		setConstNumber(offset + 80, $col_053, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_053(long value) {
		setConstNumber(offset + 80, $col_053, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_053(float value) {
		setConstNumber(offset + 80, $col_053, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_053(double value) {
		setConstNumber(offset + 80, $col_053, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_054() {
		return getConstNumber(offset + 81, $col_054);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_054(MCNumber value) {
		setConstNumber(offset + 81, $col_054, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_054(int value) {
		setConstNumber(offset + 81, $col_054, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_054(long value) {
		setConstNumber(offset + 81, $col_054, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_054(float value) {
		setConstNumber(offset + 81, $col_054, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_054(double value) {
		setConstNumber(offset + 81, $col_054, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_11_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 82, $qty_11_p);
	}
	
	public void qty_11_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 82, $qty_11_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_056() {
		return getConstNumber(offset + 83, $col_056);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_056(MCNumber value) {
		setConstNumber(offset + 83, $col_056, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_056(int value) {
		setConstNumber(offset + 83, $col_056, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_056(long value) {
		setConstNumber(offset + 83, $col_056, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_056(float value) {
		setConstNumber(offset + 83, $col_056, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_056(double value) {
		setConstNumber(offset + 83, $col_056, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_057() {
		return getConstNumber(offset + 84, $col_057);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_057(MCNumber value) {
		setConstNumber(offset + 84, $col_057, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_057(int value) {
		setConstNumber(offset + 84, $col_057, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_057(long value) {
		setConstNumber(offset + 84, $col_057, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_057(float value) {
		setConstNumber(offset + 84, $col_057, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_057(double value) {
		setConstNumber(offset + 84, $col_057, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_058() {
		return getConstNumber(offset + 85, $col_058);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_058(MCNumber value) {
		setConstNumber(offset + 85, $col_058, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_058(int value) {
		setConstNumber(offset + 85, $col_058, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_058(long value) {
		setConstNumber(offset + 85, $col_058, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_058(float value) {
		setConstNumber(offset + 85, $col_058, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_058(double value) {
		setConstNumber(offset + 85, $col_058, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_059() {
		return getConstNumber(offset + 86, $col_059);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_059(MCNumber value) {
		setConstNumber(offset + 86, $col_059, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_059(int value) {
		setConstNumber(offset + 86, $col_059, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_059(long value) {
		setConstNumber(offset + 86, $col_059, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_059(float value) {
		setConstNumber(offset + 86, $col_059, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_059(double value) {
		setConstNumber(offset + 86, $col_059, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_12_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 87, $qty_12_p);
	}
	
	public void qty_12_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 87, $qty_12_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_061() {
		return getConstNumber(offset + 88, $col_061);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_061(MCNumber value) {
		setConstNumber(offset + 88, $col_061, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_061(int value) {
		setConstNumber(offset + 88, $col_061, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_061(long value) {
		setConstNumber(offset + 88, $col_061, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_061(float value) {
		setConstNumber(offset + 88, $col_061, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_061(double value) {
		setConstNumber(offset + 88, $col_061, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_062() {
		return getConstNumber(offset + 89, $col_062);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_062(MCNumber value) {
		setConstNumber(offset + 89, $col_062, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_062(int value) {
		setConstNumber(offset + 89, $col_062, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_062(long value) {
		setConstNumber(offset + 89, $col_062, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_062(float value) {
		setConstNumber(offset + 89, $col_062, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_062(double value) {
		setConstNumber(offset + 89, $col_062, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_063() {
		return getConstNumber(offset + 90, $col_063);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_063(MCNumber value) {
		setConstNumber(offset + 90, $col_063, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_063(int value) {
		setConstNumber(offset + 90, $col_063, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_063(long value) {
		setConstNumber(offset + 90, $col_063, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_063(float value) {
		setConstNumber(offset + 90, $col_063, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_063(double value) {
		setConstNumber(offset + 90, $col_063, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_064() {
		return getConstNumber(offset + 91, $col_064);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_064(MCNumber value) {
		setConstNumber(offset + 91, $col_064, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_064(int value) {
		setConstNumber(offset + 91, $col_064, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_064(long value) {
		setConstNumber(offset + 91, $col_064, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_064(float value) {
		setConstNumber(offset + 91, $col_064, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_064(double value) {
		setConstNumber(offset + 91, $col_064, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_13_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 92, $qty_13_p);
	}
	
	public void qty_13_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 92, $qty_13_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_066() {
		return getConstNumber(offset + 93, $col_066);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_066(MCNumber value) {
		setConstNumber(offset + 93, $col_066, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_066(int value) {
		setConstNumber(offset + 93, $col_066, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_066(long value) {
		setConstNumber(offset + 93, $col_066, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_066(float value) {
		setConstNumber(offset + 93, $col_066, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_066(double value) {
		setConstNumber(offset + 93, $col_066, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_067() {
		return getConstNumber(offset + 94, $col_067);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_067(MCNumber value) {
		setConstNumber(offset + 94, $col_067, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_067(int value) {
		setConstNumber(offset + 94, $col_067, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_067(long value) {
		setConstNumber(offset + 94, $col_067, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_067(float value) {
		setConstNumber(offset + 94, $col_067, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_067(double value) {
		setConstNumber(offset + 94, $col_067, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_068() {
		return getConstNumber(offset + 95, $col_068);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_068(MCNumber value) {
		setConstNumber(offset + 95, $col_068, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_068(int value) {
		setConstNumber(offset + 95, $col_068, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_068(long value) {
		setConstNumber(offset + 95, $col_068, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_068(float value) {
		setConstNumber(offset + 95, $col_068, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_068(double value) {
		setConstNumber(offset + 95, $col_068, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_069() {
		return getConstNumber(offset + 96, $col_069);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_069(MCNumber value) {
		setConstNumber(offset + 96, $col_069, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_069(int value) {
		setConstNumber(offset + 96, $col_069, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_069(long value) {
		setConstNumber(offset + 96, $col_069, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_069(float value) {
		setConstNumber(offset + 96, $col_069, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_069(double value) {
		setConstNumber(offset + 96, $col_069, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_14_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 97, $qty_14_p);
	}
	
	public void qty_14_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 97, $qty_14_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_071() {
		return getConstNumber(offset + 98, $col_071);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_071(MCNumber value) {
		setConstNumber(offset + 98, $col_071, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_071(int value) {
		setConstNumber(offset + 98, $col_071, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_071(long value) {
		setConstNumber(offset + 98, $col_071, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_071(float value) {
		setConstNumber(offset + 98, $col_071, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_071(double value) {
		setConstNumber(offset + 98, $col_071, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_072() {
		return getConstNumber(offset + 99, $col_072);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_072(MCNumber value) {
		setConstNumber(offset + 99, $col_072, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_072(int value) {
		setConstNumber(offset + 99, $col_072, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_072(long value) {
		setConstNumber(offset + 99, $col_072, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_072(float value) {
		setConstNumber(offset + 99, $col_072, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_072(double value) {
		setConstNumber(offset + 99, $col_072, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_073() {
		return getConstNumber(offset + 100, $col_073);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_073(MCNumber value) {
		setConstNumber(offset + 100, $col_073, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_073(int value) {
		setConstNumber(offset + 100, $col_073, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_073(long value) {
		setConstNumber(offset + 100, $col_073, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_073(float value) {
		setConstNumber(offset + 100, $col_073, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_073(double value) {
		setConstNumber(offset + 100, $col_073, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_074() {
		return getConstNumber(offset + 101, $col_074);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_074(MCNumber value) {
		setConstNumber(offset + 101, $col_074, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_074(int value) {
		setConstNumber(offset + 101, $col_074, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_074(long value) {
		setConstNumber(offset + 101, $col_074, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_074(float value) {
		setConstNumber(offset + 101, $col_074, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_074(double value) {
		setConstNumber(offset + 101, $col_074, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_15_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 102, $qty_15_p);
	}
	
	public void qty_15_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 102, $qty_15_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_076() {
		return getConstNumber(offset + 103, $col_076);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_076(MCNumber value) {
		setConstNumber(offset + 103, $col_076, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_076(int value) {
		setConstNumber(offset + 103, $col_076, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_076(long value) {
		setConstNumber(offset + 103, $col_076, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_076(float value) {
		setConstNumber(offset + 103, $col_076, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_076(double value) {
		setConstNumber(offset + 103, $col_076, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_077() {
		return getConstNumber(offset + 104, $col_077);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_077(MCNumber value) {
		setConstNumber(offset + 104, $col_077, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_077(int value) {
		setConstNumber(offset + 104, $col_077, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_077(long value) {
		setConstNumber(offset + 104, $col_077, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_077(float value) {
		setConstNumber(offset + 104, $col_077, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_077(double value) {
		setConstNumber(offset + 104, $col_077, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_078() {
		return getConstNumber(offset + 105, $col_078);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_078(MCNumber value) {
		setConstNumber(offset + 105, $col_078, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_078(int value) {
		setConstNumber(offset + 105, $col_078, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_078(long value) {
		setConstNumber(offset + 105, $col_078, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_078(float value) {
		setConstNumber(offset + 105, $col_078, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_078(double value) {
		setConstNumber(offset + 105, $col_078, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_079() {
		return getConstNumber(offset + 106, $col_079);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_079(MCNumber value) {
		setConstNumber(offset + 106, $col_079, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_079(int value) {
		setConstNumber(offset + 106, $col_079, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_079(long value) {
		setConstNumber(offset + 106, $col_079, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_079(float value) {
		setConstNumber(offset + 106, $col_079, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_079(double value) {
		setConstNumber(offset + 106, $col_079, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_16_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 107, $qty_16_p);
	}
	
	public void qty_16_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 107, $qty_16_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_081() {
		return getConstNumber(offset + 108, $col_081);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_081(MCNumber value) {
		setConstNumber(offset + 108, $col_081, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_081(int value) {
		setConstNumber(offset + 108, $col_081, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_081(long value) {
		setConstNumber(offset + 108, $col_081, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_081(float value) {
		setConstNumber(offset + 108, $col_081, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_081(double value) {
		setConstNumber(offset + 108, $col_081, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_082() {
		return getConstNumber(offset + 109, $col_082);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_082(MCNumber value) {
		setConstNumber(offset + 109, $col_082, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_082(int value) {
		setConstNumber(offset + 109, $col_082, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_082(long value) {
		setConstNumber(offset + 109, $col_082, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_082(float value) {
		setConstNumber(offset + 109, $col_082, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_082(double value) {
		setConstNumber(offset + 109, $col_082, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_083() {
		return getConstNumber(offset + 110, $col_083);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_083(MCNumber value) {
		setConstNumber(offset + 110, $col_083, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_083(int value) {
		setConstNumber(offset + 110, $col_083, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_083(long value) {
		setConstNumber(offset + 110, $col_083, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_083(float value) {
		setConstNumber(offset + 110, $col_083, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_083(double value) {
		setConstNumber(offset + 110, $col_083, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_084() {
		return getConstNumber(offset + 111, $col_084);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_084(MCNumber value) {
		setConstNumber(offset + 111, $col_084, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_084(int value) {
		setConstNumber(offset + 111, $col_084, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_084(long value) {
		setConstNumber(offset + 111, $col_084, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_084(float value) {
		setConstNumber(offset + 111, $col_084, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_084(double value) {
		setConstNumber(offset + 111, $col_084, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_17_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 112, $qty_17_p);
	}
	
	public void qty_17_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 112, $qty_17_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_086() {
		return getConstNumber(offset + 113, $col_086);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_086(MCNumber value) {
		setConstNumber(offset + 113, $col_086, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_086(int value) {
		setConstNumber(offset + 113, $col_086, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_086(long value) {
		setConstNumber(offset + 113, $col_086, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_086(float value) {
		setConstNumber(offset + 113, $col_086, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_086(double value) {
		setConstNumber(offset + 113, $col_086, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_087() {
		return getConstNumber(offset + 114, $col_087);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_087(MCNumber value) {
		setConstNumber(offset + 114, $col_087, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_087(int value) {
		setConstNumber(offset + 114, $col_087, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_087(long value) {
		setConstNumber(offset + 114, $col_087, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_087(float value) {
		setConstNumber(offset + 114, $col_087, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_087(double value) {
		setConstNumber(offset + 114, $col_087, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_088() {
		return getConstNumber(offset + 115, $col_088);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_088(MCNumber value) {
		setConstNumber(offset + 115, $col_088, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_088(int value) {
		setConstNumber(offset + 115, $col_088, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_088(long value) {
		setConstNumber(offset + 115, $col_088, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_088(float value) {
		setConstNumber(offset + 115, $col_088, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_088(double value) {
		setConstNumber(offset + 115, $col_088, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_089() {
		return getConstNumber(offset + 116, $col_089);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_089(MCNumber value) {
		setConstNumber(offset + 116, $col_089, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_089(int value) {
		setConstNumber(offset + 116, $col_089, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_089(long value) {
		setConstNumber(offset + 116, $col_089, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_089(float value) {
		setConstNumber(offset + 116, $col_089, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_089(double value) {
		setConstNumber(offset + 116, $col_089, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_18_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 117, $qty_18_p);
	}
	
	public void qty_18_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 117, $qty_18_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_091() {
		return getConstNumber(offset + 118, $col_091);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_091(MCNumber value) {
		setConstNumber(offset + 118, $col_091, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_091(int value) {
		setConstNumber(offset + 118, $col_091, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_091(long value) {
		setConstNumber(offset + 118, $col_091, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_091(float value) {
		setConstNumber(offset + 118, $col_091, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_091(double value) {
		setConstNumber(offset + 118, $col_091, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_092() {
		return getConstNumber(offset + 119, $col_092);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_092(MCNumber value) {
		setConstNumber(offset + 119, $col_092, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_092(int value) {
		setConstNumber(offset + 119, $col_092, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_092(long value) {
		setConstNumber(offset + 119, $col_092, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_092(float value) {
		setConstNumber(offset + 119, $col_092, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_092(double value) {
		setConstNumber(offset + 119, $col_092, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_093() {
		return getConstNumber(offset + 120, $col_093);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_093(MCNumber value) {
		setConstNumber(offset + 120, $col_093, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_093(int value) {
		setConstNumber(offset + 120, $col_093, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_093(long value) {
		setConstNumber(offset + 120, $col_093, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_093(float value) {
		setConstNumber(offset + 120, $col_093, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_093(double value) {
		setConstNumber(offset + 120, $col_093, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_094() {
		return getConstNumber(offset + 121, $col_094);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_094(MCNumber value) {
		setConstNumber(offset + 121, $col_094, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_094(int value) {
		setConstNumber(offset + 121, $col_094, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_094(long value) {
		setConstNumber(offset + 121, $col_094, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_094(float value) {
		setConstNumber(offset + 121, $col_094, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_094(double value) {
		setConstNumber(offset + 121, $col_094, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_19_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 122, $qty_19_p);
	}
	
	public void qty_19_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 122, $qty_19_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_096() {
		return getConstNumber(offset + 123, $col_096);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_096(MCNumber value) {
		setConstNumber(offset + 123, $col_096, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_096(int value) {
		setConstNumber(offset + 123, $col_096, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_096(long value) {
		setConstNumber(offset + 123, $col_096, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_096(float value) {
		setConstNumber(offset + 123, $col_096, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_096(double value) {
		setConstNumber(offset + 123, $col_096, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_097() {
		return getConstNumber(offset + 124, $col_097);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_097(MCNumber value) {
		setConstNumber(offset + 124, $col_097, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_097(int value) {
		setConstNumber(offset + 124, $col_097, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_097(long value) {
		setConstNumber(offset + 124, $col_097, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_097(float value) {
		setConstNumber(offset + 124, $col_097, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_097(double value) {
		setConstNumber(offset + 124, $col_097, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_098() {
		return getConstNumber(offset + 125, $col_098);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_098(MCNumber value) {
		setConstNumber(offset + 125, $col_098, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_098(int value) {
		setConstNumber(offset + 125, $col_098, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_098(long value) {
		setConstNumber(offset + 125, $col_098, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_098(float value) {
		setConstNumber(offset + 125, $col_098, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_098(double value) {
		setConstNumber(offset + 125, $col_098, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_099() {
		return getConstNumber(offset + 126, $col_099);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_099(MCNumber value) {
		setConstNumber(offset + 126, $col_099, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_099(int value) {
		setConstNumber(offset + 126, $col_099, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_099(long value) {
		setConstNumber(offset + 126, $col_099, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_099(float value) {
		setConstNumber(offset + 126, $col_099, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_099(double value) {
		setConstNumber(offset + 126, $col_099, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_20_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 127, $qty_20_p);
	}
	
	public void qty_20_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 127, $qty_20_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_101() {
		return getConstNumber(offset + 128, $col_101);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_101(MCNumber value) {
		setConstNumber(offset + 128, $col_101, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_101(int value) {
		setConstNumber(offset + 128, $col_101, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_101(long value) {
		setConstNumber(offset + 128, $col_101, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_101(float value) {
		setConstNumber(offset + 128, $col_101, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_101(double value) {
		setConstNumber(offset + 128, $col_101, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_102() {
		return getConstNumber(offset + 129, $col_102);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_102(MCNumber value) {
		setConstNumber(offset + 129, $col_102, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_102(int value) {
		setConstNumber(offset + 129, $col_102, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_102(long value) {
		setConstNumber(offset + 129, $col_102, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_102(float value) {
		setConstNumber(offset + 129, $col_102, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_102(double value) {
		setConstNumber(offset + 129, $col_102, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_103() {
		return getConstNumber(offset + 130, $col_103);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_103(MCNumber value) {
		setConstNumber(offset + 130, $col_103, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_103(int value) {
		setConstNumber(offset + 130, $col_103, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_103(long value) {
		setConstNumber(offset + 130, $col_103, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_103(float value) {
		setConstNumber(offset + 130, $col_103, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_103(double value) {
		setConstNumber(offset + 130, $col_103, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_104() {
		return getConstNumber(offset + 131, $col_104);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_104(MCNumber value) {
		setConstNumber(offset + 131, $col_104, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_104(int value) {
		setConstNumber(offset + 131, $col_104, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_104(long value) {
		setConstNumber(offset + 131, $col_104, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_104(float value) {
		setConstNumber(offset + 131, $col_104, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_104(double value) {
		setConstNumber(offset + 131, $col_104, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_21_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 132, $qty_21_p);
	}
	
	public void qty_21_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 132, $qty_21_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_106() {
		return getConstNumber(offset + 133, $col_106);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_106(MCNumber value) {
		setConstNumber(offset + 133, $col_106, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_106(int value) {
		setConstNumber(offset + 133, $col_106, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_106(long value) {
		setConstNumber(offset + 133, $col_106, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_106(float value) {
		setConstNumber(offset + 133, $col_106, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_106(double value) {
		setConstNumber(offset + 133, $col_106, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_107() {
		return getConstNumber(offset + 134, $col_107);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_107(MCNumber value) {
		setConstNumber(offset + 134, $col_107, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_107(int value) {
		setConstNumber(offset + 134, $col_107, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_107(long value) {
		setConstNumber(offset + 134, $col_107, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_107(float value) {
		setConstNumber(offset + 134, $col_107, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_107(double value) {
		setConstNumber(offset + 134, $col_107, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_108() {
		return getConstNumber(offset + 135, $col_108);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_108(MCNumber value) {
		setConstNumber(offset + 135, $col_108, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_108(int value) {
		setConstNumber(offset + 135, $col_108, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_108(long value) {
		setConstNumber(offset + 135, $col_108, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_108(float value) {
		setConstNumber(offset + 135, $col_108, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_108(double value) {
		setConstNumber(offset + 135, $col_108, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_109() {
		return getConstNumber(offset + 136, $col_109);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_109(MCNumber value) {
		setConstNumber(offset + 136, $col_109, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_109(int value) {
		setConstNumber(offset + 136, $col_109, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_109(long value) {
		setConstNumber(offset + 136, $col_109, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_109(float value) {
		setConstNumber(offset + 136, $col_109, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_109(double value) {
		setConstNumber(offset + 136, $col_109, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_22_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 137, $qty_22_p);
	}
	
	public void qty_22_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 137, $qty_22_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_111() {
		return getConstNumber(offset + 138, $col_111);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_111(MCNumber value) {
		setConstNumber(offset + 138, $col_111, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_111(int value) {
		setConstNumber(offset + 138, $col_111, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_111(long value) {
		setConstNumber(offset + 138, $col_111, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_111(float value) {
		setConstNumber(offset + 138, $col_111, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_111(double value) {
		setConstNumber(offset + 138, $col_111, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_112() {
		return getConstNumber(offset + 139, $col_112);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_112(MCNumber value) {
		setConstNumber(offset + 139, $col_112, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_112(int value) {
		setConstNumber(offset + 139, $col_112, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_112(long value) {
		setConstNumber(offset + 139, $col_112, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_112(float value) {
		setConstNumber(offset + 139, $col_112, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_112(double value) {
		setConstNumber(offset + 139, $col_112, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_113() {
		return getConstNumber(offset + 140, $col_113);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_113(MCNumber value) {
		setConstNumber(offset + 140, $col_113, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_113(int value) {
		setConstNumber(offset + 140, $col_113, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_113(long value) {
		setConstNumber(offset + 140, $col_113, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_113(float value) {
		setConstNumber(offset + 140, $col_113, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_113(double value) {
		setConstNumber(offset + 140, $col_113, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_114() {
		return getConstNumber(offset + 141, $col_114);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_114(MCNumber value) {
		setConstNumber(offset + 141, $col_114, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_114(int value) {
		setConstNumber(offset + 141, $col_114, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_114(long value) {
		setConstNumber(offset + 141, $col_114, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_114(float value) {
		setConstNumber(offset + 141, $col_114, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_114(double value) {
		setConstNumber(offset + 141, $col_114, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_23_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 142, $qty_23_p);
	}
	
	public void qty_23_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 142, $qty_23_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_116() {
		return getConstNumber(offset + 143, $col_116);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_116(MCNumber value) {
		setConstNumber(offset + 143, $col_116, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_116(int value) {
		setConstNumber(offset + 143, $col_116, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_116(long value) {
		setConstNumber(offset + 143, $col_116, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_116(float value) {
		setConstNumber(offset + 143, $col_116, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_116(double value) {
		setConstNumber(offset + 143, $col_116, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_117() {
		return getConstNumber(offset + 144, $col_117);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_117(MCNumber value) {
		setConstNumber(offset + 144, $col_117, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_117(int value) {
		setConstNumber(offset + 144, $col_117, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_117(long value) {
		setConstNumber(offset + 144, $col_117, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_117(float value) {
		setConstNumber(offset + 144, $col_117, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_117(double value) {
		setConstNumber(offset + 144, $col_117, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_118() {
		return getConstNumber(offset + 145, $col_118);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_118(MCNumber value) {
		setConstNumber(offset + 145, $col_118, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_118(int value) {
		setConstNumber(offset + 145, $col_118, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_118(long value) {
		setConstNumber(offset + 145, $col_118, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_118(float value) {
		setConstNumber(offset + 145, $col_118, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_118(double value) {
		setConstNumber(offset + 145, $col_118, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_119() {
		return getConstNumber(offset + 146, $col_119);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_119(MCNumber value) {
		setConstNumber(offset + 146, $col_119, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_119(int value) {
		setConstNumber(offset + 146, $col_119, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_119(long value) {
		setConstNumber(offset + 146, $col_119, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_119(float value) {
		setConstNumber(offset + 146, $col_119, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_119(double value) {
		setConstNumber(offset + 146, $col_119, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_24_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 147, $qty_24_p);
	}
	
	public void qty_24_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 147, $qty_24_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_121() {
		return getConstNumber(offset + 148, $col_121);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_121(MCNumber value) {
		setConstNumber(offset + 148, $col_121, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_121(int value) {
		setConstNumber(offset + 148, $col_121, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_121(long value) {
		setConstNumber(offset + 148, $col_121, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_121(float value) {
		setConstNumber(offset + 148, $col_121, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_121(double value) {
		setConstNumber(offset + 148, $col_121, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_122() {
		return getConstNumber(offset + 149, $col_122);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_122(MCNumber value) {
		setConstNumber(offset + 149, $col_122, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_122(int value) {
		setConstNumber(offset + 149, $col_122, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_122(long value) {
		setConstNumber(offset + 149, $col_122, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_122(float value) {
		setConstNumber(offset + 149, $col_122, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_122(double value) {
		setConstNumber(offset + 149, $col_122, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_123() {
		return getConstNumber(offset + 150, $col_123);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_123(MCNumber value) {
		setConstNumber(offset + 150, $col_123, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_123(int value) {
		setConstNumber(offset + 150, $col_123, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_123(long value) {
		setConstNumber(offset + 150, $col_123, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_123(float value) {
		setConstNumber(offset + 150, $col_123, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_123(double value) {
		setConstNumber(offset + 150, $col_123, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_124() {
		return getConstNumber(offset + 151, $col_124);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_124(MCNumber value) {
		setConstNumber(offset + 151, $col_124, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_124(int value) {
		setConstNumber(offset + 151, $col_124, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_124(long value) {
		setConstNumber(offset + 151, $col_124, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_124(float value) {
		setConstNumber(offset + 151, $col_124, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_124(double value) {
		setConstNumber(offset + 151, $col_124, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_25_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 152, $qty_25_p);
	}
	
	public void qty_25_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 152, $qty_25_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_126() {
		return getConstNumber(offset + 153, $col_126);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_126(MCNumber value) {
		setConstNumber(offset + 153, $col_126, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_126(int value) {
		setConstNumber(offset + 153, $col_126, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_126(long value) {
		setConstNumber(offset + 153, $col_126, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_126(float value) {
		setConstNumber(offset + 153, $col_126, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_126(double value) {
		setConstNumber(offset + 153, $col_126, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_127() {
		return getConstNumber(offset + 154, $col_127);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_127(MCNumber value) {
		setConstNumber(offset + 154, $col_127, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_127(int value) {
		setConstNumber(offset + 154, $col_127, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_127(long value) {
		setConstNumber(offset + 154, $col_127, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_127(float value) {
		setConstNumber(offset + 154, $col_127, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_127(double value) {
		setConstNumber(offset + 154, $col_127, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_128() {
		return getConstNumber(offset + 155, $col_128);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_128(MCNumber value) {
		setConstNumber(offset + 155, $col_128, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_128(int value) {
		setConstNumber(offset + 155, $col_128, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_128(long value) {
		setConstNumber(offset + 155, $col_128, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_128(float value) {
		setConstNumber(offset + 155, $col_128, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_128(double value) {
		setConstNumber(offset + 155, $col_128, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_129() {
		return getConstNumber(offset + 156, $col_129);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_129(MCNumber value) {
		setConstNumber(offset + 156, $col_129, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_129(int value) {
		setConstNumber(offset + 156, $col_129, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_129(long value) {
		setConstNumber(offset + 156, $col_129, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_129(float value) {
		setConstNumber(offset + 156, $col_129, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_129(double value) {
		setConstNumber(offset + 156, $col_129, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_26_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 157, $qty_26_p);
	}
	
	public void qty_26_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 157, $qty_26_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_131() {
		return getConstNumber(offset + 158, $col_131);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_131(MCNumber value) {
		setConstNumber(offset + 158, $col_131, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_131(int value) {
		setConstNumber(offset + 158, $col_131, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_131(long value) {
		setConstNumber(offset + 158, $col_131, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_131(float value) {
		setConstNumber(offset + 158, $col_131, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_131(double value) {
		setConstNumber(offset + 158, $col_131, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_132() {
		return getConstNumber(offset + 159, $col_132);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_132(MCNumber value) {
		setConstNumber(offset + 159, $col_132, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_132(int value) {
		setConstNumber(offset + 159, $col_132, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_132(long value) {
		setConstNumber(offset + 159, $col_132, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_132(float value) {
		setConstNumber(offset + 159, $col_132, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_132(double value) {
		setConstNumber(offset + 159, $col_132, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_133() {
		return getConstNumber(offset + 160, $col_133);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_133(MCNumber value) {
		setConstNumber(offset + 160, $col_133, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_133(int value) {
		setConstNumber(offset + 160, $col_133, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_133(long value) {
		setConstNumber(offset + 160, $col_133, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_133(float value) {
		setConstNumber(offset + 160, $col_133, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_133(double value) {
		setConstNumber(offset + 160, $col_133, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_134() {
		return getConstNumber(offset + 161, $col_134);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_134(MCNumber value) {
		setConstNumber(offset + 161, $col_134, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_134(int value) {
		setConstNumber(offset + 161, $col_134, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_134(long value) {
		setConstNumber(offset + 161, $col_134, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_134(float value) {
		setConstNumber(offset + 161, $col_134, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_134(double value) {
		setConstNumber(offset + 161, $col_134, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_27_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 162, $qty_27_p);
	}
	
	public void qty_27_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 162, $qty_27_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_136() {
		return getConstNumber(offset + 163, $col_136);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_136(MCNumber value) {
		setConstNumber(offset + 163, $col_136, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_136(int value) {
		setConstNumber(offset + 163, $col_136, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_136(long value) {
		setConstNumber(offset + 163, $col_136, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_136(float value) {
		setConstNumber(offset + 163, $col_136, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_136(double value) {
		setConstNumber(offset + 163, $col_136, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_137() {
		return getConstNumber(offset + 164, $col_137);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_137(MCNumber value) {
		setConstNumber(offset + 164, $col_137, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_137(int value) {
		setConstNumber(offset + 164, $col_137, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_137(long value) {
		setConstNumber(offset + 164, $col_137, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_137(float value) {
		setConstNumber(offset + 164, $col_137, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_137(double value) {
		setConstNumber(offset + 164, $col_137, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_138() {
		return getConstNumber(offset + 165, $col_138);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_138(MCNumber value) {
		setConstNumber(offset + 165, $col_138, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_138(int value) {
		setConstNumber(offset + 165, $col_138, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_138(long value) {
		setConstNumber(offset + 165, $col_138, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_138(float value) {
		setConstNumber(offset + 165, $col_138, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_138(double value) {
		setConstNumber(offset + 165, $col_138, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_139() {
		return getConstNumber(offset + 166, $col_139);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_139(MCNumber value) {
		setConstNumber(offset + 166, $col_139, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_139(int value) {
		setConstNumber(offset + 166, $col_139, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_139(long value) {
		setConstNumber(offset + 166, $col_139, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_139(float value) {
		setConstNumber(offset + 166, $col_139, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_139(double value) {
		setConstNumber(offset + 166, $col_139, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_28_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 167, $qty_28_p);
	}
	
	public void qty_28_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 167, $qty_28_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_141() {
		return getConstNumber(offset + 168, $col_141);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_141(MCNumber value) {
		setConstNumber(offset + 168, $col_141, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_141(int value) {
		setConstNumber(offset + 168, $col_141, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_141(long value) {
		setConstNumber(offset + 168, $col_141, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_141(float value) {
		setConstNumber(offset + 168, $col_141, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_141(double value) {
		setConstNumber(offset + 168, $col_141, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_142() {
		return getConstNumber(offset + 169, $col_142);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_142(MCNumber value) {
		setConstNumber(offset + 169, $col_142, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_142(int value) {
		setConstNumber(offset + 169, $col_142, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_142(long value) {
		setConstNumber(offset + 169, $col_142, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_142(float value) {
		setConstNumber(offset + 169, $col_142, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_142(double value) {
		setConstNumber(offset + 169, $col_142, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_143() {
		return getConstNumber(offset + 170, $col_143);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_143(MCNumber value) {
		setConstNumber(offset + 170, $col_143, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_143(int value) {
		setConstNumber(offset + 170, $col_143, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_143(long value) {
		setConstNumber(offset + 170, $col_143, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_143(float value) {
		setConstNumber(offset + 170, $col_143, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_143(double value) {
		setConstNumber(offset + 170, $col_143, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_144() {
		return getConstNumber(offset + 171, $col_144);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_144(MCNumber value) {
		setConstNumber(offset + 171, $col_144, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_144(int value) {
		setConstNumber(offset + 171, $col_144, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_144(long value) {
		setConstNumber(offset + 171, $col_144, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_144(float value) {
		setConstNumber(offset + 171, $col_144, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_144(double value) {
		setConstNumber(offset + 171, $col_144, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_29_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 172, $qty_29_p);
	}
	
	public void qty_29_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 172, $qty_29_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_146() {
		return getConstNumber(offset + 173, $col_146);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_146(MCNumber value) {
		setConstNumber(offset + 173, $col_146, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_146(int value) {
		setConstNumber(offset + 173, $col_146, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_146(long value) {
		setConstNumber(offset + 173, $col_146, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_146(float value) {
		setConstNumber(offset + 173, $col_146, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_146(double value) {
		setConstNumber(offset + 173, $col_146, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_147() {
		return getConstNumber(offset + 174, $col_147);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_147(MCNumber value) {
		setConstNumber(offset + 174, $col_147, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_147(int value) {
		setConstNumber(offset + 174, $col_147, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_147(long value) {
		setConstNumber(offset + 174, $col_147, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_147(float value) {
		setConstNumber(offset + 174, $col_147, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_147(double value) {
		setConstNumber(offset + 174, $col_147, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_148() {
		return getConstNumber(offset + 175, $col_148);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_148(MCNumber value) {
		setConstNumber(offset + 175, $col_148, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_148(int value) {
		setConstNumber(offset + 175, $col_148, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_148(long value) {
		setConstNumber(offset + 175, $col_148, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_148(float value) {
		setConstNumber(offset + 175, $col_148, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_148(double value) {
		setConstNumber(offset + 175, $col_148, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_149() {
		return getConstNumber(offset + 176, $col_149);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_149(MCNumber value) {
		setConstNumber(offset + 176, $col_149, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_149(int value) {
		setConstNumber(offset + 176, $col_149, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_149(long value) {
		setConstNumber(offset + 176, $col_149, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_149(float value) {
		setConstNumber(offset + 176, $col_149, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_149(double value) {
		setConstNumber(offset + 176, $col_149, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_30_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 177, $qty_30_p);
	}
	
	public void qty_30_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 177, $qty_30_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_151() {
		return getConstNumber(offset + 178, $col_151);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_151(MCNumber value) {
		setConstNumber(offset + 178, $col_151, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_151(int value) {
		setConstNumber(offset + 178, $col_151, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_151(long value) {
		setConstNumber(offset + 178, $col_151, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_151(float value) {
		setConstNumber(offset + 178, $col_151, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_151(double value) {
		setConstNumber(offset + 178, $col_151, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_152() {
		return getConstNumber(offset + 179, $col_152);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_152(MCNumber value) {
		setConstNumber(offset + 179, $col_152, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_152(int value) {
		setConstNumber(offset + 179, $col_152, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_152(long value) {
		setConstNumber(offset + 179, $col_152, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_152(float value) {
		setConstNumber(offset + 179, $col_152, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_152(double value) {
		setConstNumber(offset + 179, $col_152, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_153() {
		return getConstNumber(offset + 180, $col_153);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_153(MCNumber value) {
		setConstNumber(offset + 180, $col_153, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_153(int value) {
		setConstNumber(offset + 180, $col_153, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_153(long value) {
		setConstNumber(offset + 180, $col_153, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_153(float value) {
		setConstNumber(offset + 180, $col_153, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_153(double value) {
		setConstNumber(offset + 180, $col_153, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_154() {
		return getConstNumber(offset + 181, $col_154);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_154(MCNumber value) {
		setConstNumber(offset + 181, $col_154, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_154(int value) {
		setConstNumber(offset + 181, $col_154, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_154(long value) {
		setConstNumber(offset + 181, $col_154, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_154(float value) {
		setConstNumber(offset + 181, $col_154, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_154(double value) {
		setConstNumber(offset + 181, $col_154, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_31_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 182, $qty_31_p);
	}
	
	public void qty_31_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 182, $qty_31_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_156() {
		return getConstNumber(offset + 183, $col_156);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_156(MCNumber value) {
		setConstNumber(offset + 183, $col_156, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_156(int value) {
		setConstNumber(offset + 183, $col_156, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_156(long value) {
		setConstNumber(offset + 183, $col_156, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_156(float value) {
		setConstNumber(offset + 183, $col_156, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_156(double value) {
		setConstNumber(offset + 183, $col_156, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_157() {
		return getConstNumber(offset + 184, $col_157);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_157(MCNumber value) {
		setConstNumber(offset + 184, $col_157, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_157(int value) {
		setConstNumber(offset + 184, $col_157, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_157(long value) {
		setConstNumber(offset + 184, $col_157, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_157(float value) {
		setConstNumber(offset + 184, $col_157, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_157(double value) {
		setConstNumber(offset + 184, $col_157, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_158() {
		return getConstNumber(offset + 185, $col_158);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_158(MCNumber value) {
		setConstNumber(offset + 185, $col_158, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_158(int value) {
		setConstNumber(offset + 185, $col_158, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_158(long value) {
		setConstNumber(offset + 185, $col_158, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_158(float value) {
		setConstNumber(offset + 185, $col_158, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_158(double value) {
		setConstNumber(offset + 185, $col_158, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_159() {
		return getConstNumber(offset + 186, $col_159);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_159(MCNumber value) {
		setConstNumber(offset + 186, $col_159, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_159(int value) {
		setConstNumber(offset + 186, $col_159, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_159(long value) {
		setConstNumber(offset + 186, $col_159, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_159(float value) {
		setConstNumber(offset + 186, $col_159, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_159(double value) {
		setConstNumber(offset + 186, $col_159, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_32_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 187, $qty_32_p);
	}
	
	public void qty_32_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 187, $qty_32_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_161() {
		return getConstNumber(offset + 188, $col_161);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_161(MCNumber value) {
		setConstNumber(offset + 188, $col_161, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_161(int value) {
		setConstNumber(offset + 188, $col_161, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_161(long value) {
		setConstNumber(offset + 188, $col_161, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_161(float value) {
		setConstNumber(offset + 188, $col_161, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_161(double value) {
		setConstNumber(offset + 188, $col_161, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_162() {
		return getConstNumber(offset + 189, $col_162);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_162(MCNumber value) {
		setConstNumber(offset + 189, $col_162, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_162(int value) {
		setConstNumber(offset + 189, $col_162, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_162(long value) {
		setConstNumber(offset + 189, $col_162, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_162(float value) {
		setConstNumber(offset + 189, $col_162, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_162(double value) {
		setConstNumber(offset + 189, $col_162, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_163() {
		return getConstNumber(offset + 190, $col_163);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_163(MCNumber value) {
		setConstNumber(offset + 190, $col_163, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_163(int value) {
		setConstNumber(offset + 190, $col_163, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_163(long value) {
		setConstNumber(offset + 190, $col_163, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_163(float value) {
		setConstNumber(offset + 190, $col_163, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_163(double value) {
		setConstNumber(offset + 190, $col_163, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_164() {
		return getConstNumber(offset + 191, $col_164);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_164(MCNumber value) {
		setConstNumber(offset + 191, $col_164, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_164(int value) {
		setConstNumber(offset + 191, $col_164, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_164(long value) {
		setConstNumber(offset + 191, $col_164, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_164(float value) {
		setConstNumber(offset + 191, $col_164, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_164(double value) {
		setConstNumber(offset + 191, $col_164, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_33_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 192, $qty_33_p);
	}
	
	public void qty_33_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 192, $qty_33_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_166() {
		return getConstNumber(offset + 193, $col_166);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_166(MCNumber value) {
		setConstNumber(offset + 193, $col_166, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_166(int value) {
		setConstNumber(offset + 193, $col_166, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_166(long value) {
		setConstNumber(offset + 193, $col_166, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_166(float value) {
		setConstNumber(offset + 193, $col_166, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_166(double value) {
		setConstNumber(offset + 193, $col_166, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_167() {
		return getConstNumber(offset + 194, $col_167);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_167(MCNumber value) {
		setConstNumber(offset + 194, $col_167, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_167(int value) {
		setConstNumber(offset + 194, $col_167, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_167(long value) {
		setConstNumber(offset + 194, $col_167, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_167(float value) {
		setConstNumber(offset + 194, $col_167, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_167(double value) {
		setConstNumber(offset + 194, $col_167, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_168() {
		return getConstNumber(offset + 195, $col_168);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_168(MCNumber value) {
		setConstNumber(offset + 195, $col_168, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_168(int value) {
		setConstNumber(offset + 195, $col_168, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_168(long value) {
		setConstNumber(offset + 195, $col_168, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_168(float value) {
		setConstNumber(offset + 195, $col_168, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_168(double value) {
		setConstNumber(offset + 195, $col_168, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_169() {
		return getConstNumber(offset + 196, $col_169);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_169(MCNumber value) {
		setConstNumber(offset + 196, $col_169, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_169(int value) {
		setConstNumber(offset + 196, $col_169, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_169(long value) {
		setConstNumber(offset + 196, $col_169, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_169(float value) {
		setConstNumber(offset + 196, $col_169, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_169(double value) {
		setConstNumber(offset + 196, $col_169, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_34_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 197, $qty_34_p);
	}
	
	public void qty_34_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 197, $qty_34_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_171() {
		return getConstNumber(offset + 198, $col_171);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_171(MCNumber value) {
		setConstNumber(offset + 198, $col_171, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_171(int value) {
		setConstNumber(offset + 198, $col_171, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_171(long value) {
		setConstNumber(offset + 198, $col_171, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_171(float value) {
		setConstNumber(offset + 198, $col_171, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_171(double value) {
		setConstNumber(offset + 198, $col_171, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_172() {
		return getConstNumber(offset + 199, $col_172);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_172(MCNumber value) {
		setConstNumber(offset + 199, $col_172, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_172(int value) {
		setConstNumber(offset + 199, $col_172, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_172(long value) {
		setConstNumber(offset + 199, $col_172, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_172(float value) {
		setConstNumber(offset + 199, $col_172, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_172(double value) {
		setConstNumber(offset + 199, $col_172, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_173() {
		return getConstNumber(offset + 200, $col_173);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_173(MCNumber value) {
		setConstNumber(offset + 200, $col_173, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_173(int value) {
		setConstNumber(offset + 200, $col_173, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_173(long value) {
		setConstNumber(offset + 200, $col_173, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_173(float value) {
		setConstNumber(offset + 200, $col_173, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_173(double value) {
		setConstNumber(offset + 200, $col_173, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_174() {
		return getConstNumber(offset + 201, $col_174);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_174(MCNumber value) {
		setConstNumber(offset + 201, $col_174, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_174(int value) {
		setConstNumber(offset + 201, $col_174, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_174(long value) {
		setConstNumber(offset + 201, $col_174, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_174(float value) {
		setConstNumber(offset + 201, $col_174, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_174(double value) {
		setConstNumber(offset + 201, $col_174, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_35_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 202, $qty_35_p);
	}
	
	public void qty_35_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 202, $qty_35_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_176() {
		return getConstNumber(offset + 203, $col_176);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_176(MCNumber value) {
		setConstNumber(offset + 203, $col_176, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_176(int value) {
		setConstNumber(offset + 203, $col_176, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_176(long value) {
		setConstNumber(offset + 203, $col_176, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_176(float value) {
		setConstNumber(offset + 203, $col_176, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_176(double value) {
		setConstNumber(offset + 203, $col_176, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_177() {
		return getConstNumber(offset + 204, $col_177);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_177(MCNumber value) {
		setConstNumber(offset + 204, $col_177, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_177(int value) {
		setConstNumber(offset + 204, $col_177, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_177(long value) {
		setConstNumber(offset + 204, $col_177, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_177(float value) {
		setConstNumber(offset + 204, $col_177, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_177(double value) {
		setConstNumber(offset + 204, $col_177, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_178() {
		return getConstNumber(offset + 205, $col_178);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_178(MCNumber value) {
		setConstNumber(offset + 205, $col_178, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_178(int value) {
		setConstNumber(offset + 205, $col_178, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_178(long value) {
		setConstNumber(offset + 205, $col_178, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_178(float value) {
		setConstNumber(offset + 205, $col_178, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_178(double value) {
		setConstNumber(offset + 205, $col_178, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_179() {
		return getConstNumber(offset + 206, $col_179);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_179(MCNumber value) {
		setConstNumber(offset + 206, $col_179, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_179(int value) {
		setConstNumber(offset + 206, $col_179, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_179(long value) {
		setConstNumber(offset + 206, $col_179, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_179(float value) {
		setConstNumber(offset + 206, $col_179, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_179(double value) {
		setConstNumber(offset + 206, $col_179, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_36_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 207, $qty_36_p);
	}
	
	public void qty_36_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 207, $qty_36_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_181() {
		return getConstNumber(offset + 208, $col_181);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_181(MCNumber value) {
		setConstNumber(offset + 208, $col_181, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_181(int value) {
		setConstNumber(offset + 208, $col_181, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_181(long value) {
		setConstNumber(offset + 208, $col_181, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_181(float value) {
		setConstNumber(offset + 208, $col_181, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_181(double value) {
		setConstNumber(offset + 208, $col_181, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_182() {
		return getConstNumber(offset + 209, $col_182);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_182(MCNumber value) {
		setConstNumber(offset + 209, $col_182, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_182(int value) {
		setConstNumber(offset + 209, $col_182, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_182(long value) {
		setConstNumber(offset + 209, $col_182, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_182(float value) {
		setConstNumber(offset + 209, $col_182, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_182(double value) {
		setConstNumber(offset + 209, $col_182, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_183() {
		return getConstNumber(offset + 210, $col_183);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_183(MCNumber value) {
		setConstNumber(offset + 210, $col_183, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_183(int value) {
		setConstNumber(offset + 210, $col_183, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_183(long value) {
		setConstNumber(offset + 210, $col_183, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_183(float value) {
		setConstNumber(offset + 210, $col_183, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_183(double value) {
		setConstNumber(offset + 210, $col_183, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_184() {
		return getConstNumber(offset + 211, $col_184);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_184(MCNumber value) {
		setConstNumber(offset + 211, $col_184, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_184(int value) {
		setConstNumber(offset + 211, $col_184, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_184(long value) {
		setConstNumber(offset + 211, $col_184, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_184(float value) {
		setConstNumber(offset + 211, $col_184, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_184(double value) {
		setConstNumber(offset + 211, $col_184, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_37_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 212, $qty_37_p);
	}
	
	public void qty_37_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 212, $qty_37_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_186() {
		return getConstNumber(offset + 213, $col_186);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_186(MCNumber value) {
		setConstNumber(offset + 213, $col_186, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_186(int value) {
		setConstNumber(offset + 213, $col_186, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_186(long value) {
		setConstNumber(offset + 213, $col_186, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_186(float value) {
		setConstNumber(offset + 213, $col_186, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_186(double value) {
		setConstNumber(offset + 213, $col_186, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_187() {
		return getConstNumber(offset + 214, $col_187);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_187(MCNumber value) {
		setConstNumber(offset + 214, $col_187, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_187(int value) {
		setConstNumber(offset + 214, $col_187, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_187(long value) {
		setConstNumber(offset + 214, $col_187, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_187(float value) {
		setConstNumber(offset + 214, $col_187, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_187(double value) {
		setConstNumber(offset + 214, $col_187, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_188() {
		return getConstNumber(offset + 215, $col_188);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_188(MCNumber value) {
		setConstNumber(offset + 215, $col_188, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_188(int value) {
		setConstNumber(offset + 215, $col_188, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_188(long value) {
		setConstNumber(offset + 215, $col_188, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_188(float value) {
		setConstNumber(offset + 215, $col_188, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_188(double value) {
		setConstNumber(offset + 215, $col_188, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_189() {
		return getConstNumber(offset + 216, $col_189);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_189(MCNumber value) {
		setConstNumber(offset + 216, $col_189, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_189(int value) {
		setConstNumber(offset + 216, $col_189, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_189(long value) {
		setConstNumber(offset + 216, $col_189, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_189(float value) {
		setConstNumber(offset + 216, $col_189, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_189(double value) {
		setConstNumber(offset + 216, $col_189, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_38_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 217, $qty_38_p);
	}
	
	public void qty_38_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 217, $qty_38_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_191() {
		return getConstNumber(offset + 218, $col_191);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_191(MCNumber value) {
		setConstNumber(offset + 218, $col_191, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_191(int value) {
		setConstNumber(offset + 218, $col_191, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_191(long value) {
		setConstNumber(offset + 218, $col_191, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_191(float value) {
		setConstNumber(offset + 218, $col_191, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_191(double value) {
		setConstNumber(offset + 218, $col_191, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_192() {
		return getConstNumber(offset + 219, $col_192);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_192(MCNumber value) {
		setConstNumber(offset + 219, $col_192, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_192(int value) {
		setConstNumber(offset + 219, $col_192, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_192(long value) {
		setConstNumber(offset + 219, $col_192, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_192(float value) {
		setConstNumber(offset + 219, $col_192, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_192(double value) {
		setConstNumber(offset + 219, $col_192, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_193() {
		return getConstNumber(offset + 220, $col_193);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_193(MCNumber value) {
		setConstNumber(offset + 220, $col_193, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_193(int value) {
		setConstNumber(offset + 220, $col_193, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_193(long value) {
		setConstNumber(offset + 220, $col_193, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_193(float value) {
		setConstNumber(offset + 220, $col_193, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_193(double value) {
		setConstNumber(offset + 220, $col_193, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_194() {
		return getConstNumber(offset + 221, $col_194);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_194(MCNumber value) {
		setConstNumber(offset + 221, $col_194, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_194(int value) {
		setConstNumber(offset + 221, $col_194, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_194(long value) {
		setConstNumber(offset + 221, $col_194, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_194(float value) {
		setConstNumber(offset + 221, $col_194, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_194(double value) {
		setConstNumber(offset + 221, $col_194, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_39_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 222, $qty_39_p);
	}
	
	public void qty_39_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 222, $qty_39_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_196() {
		return getConstNumber(offset + 223, $col_196);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_196(MCNumber value) {
		setConstNumber(offset + 223, $col_196, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_196(int value) {
		setConstNumber(offset + 223, $col_196, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_196(long value) {
		setConstNumber(offset + 223, $col_196, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_196(float value) {
		setConstNumber(offset + 223, $col_196, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_196(double value) {
		setConstNumber(offset + 223, $col_196, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_197() {
		return getConstNumber(offset + 224, $col_197);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_197(MCNumber value) {
		setConstNumber(offset + 224, $col_197, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_197(int value) {
		setConstNumber(offset + 224, $col_197, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_197(long value) {
		setConstNumber(offset + 224, $col_197, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_197(float value) {
		setConstNumber(offset + 224, $col_197, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_197(double value) {
		setConstNumber(offset + 224, $col_197, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_198() {
		return getConstNumber(offset + 225, $col_198);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_198(MCNumber value) {
		setConstNumber(offset + 225, $col_198, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_198(int value) {
		setConstNumber(offset + 225, $col_198, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_198(long value) {
		setConstNumber(offset + 225, $col_198, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_198(float value) {
		setConstNumber(offset + 225, $col_198, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_198(double value) {
		setConstNumber(offset + 225, $col_198, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_199() {
		return getConstNumber(offset + 226, $col_199);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_199(MCNumber value) {
		setConstNumber(offset + 226, $col_199, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_199(int value) {
		setConstNumber(offset + 226, $col_199, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_199(long value) {
		setConstNumber(offset + 226, $col_199, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_199(float value) {
		setConstNumber(offset + 226, $col_199, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_199(double value) {
		setConstNumber(offset + 226, $col_199, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_40_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 227, $qty_40_p);
	}
	
	public void qty_40_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 227, $qty_40_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_201() {
		return getConstNumber(offset + 228, $col_201);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_201(MCNumber value) {
		setConstNumber(offset + 228, $col_201, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_201(int value) {
		setConstNumber(offset + 228, $col_201, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_201(long value) {
		setConstNumber(offset + 228, $col_201, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_201(float value) {
		setConstNumber(offset + 228, $col_201, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_201(double value) {
		setConstNumber(offset + 228, $col_201, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_202() {
		return getConstNumber(offset + 229, $col_202);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_202(MCNumber value) {
		setConstNumber(offset + 229, $col_202, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_202(int value) {
		setConstNumber(offset + 229, $col_202, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_202(long value) {
		setConstNumber(offset + 229, $col_202, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_202(float value) {
		setConstNumber(offset + 229, $col_202, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_202(double value) {
		setConstNumber(offset + 229, $col_202, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_203() {
		return getConstNumber(offset + 230, $col_203);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_203(MCNumber value) {
		setConstNumber(offset + 230, $col_203, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_203(int value) {
		setConstNumber(offset + 230, $col_203, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_203(long value) {
		setConstNumber(offset + 230, $col_203, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_203(float value) {
		setConstNumber(offset + 230, $col_203, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_203(double value) {
		setConstNumber(offset + 230, $col_203, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_204() {
		return getConstNumber(offset + 231, $col_204);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_204(MCNumber value) {
		setConstNumber(offset + 231, $col_204, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_204(int value) {
		setConstNumber(offset + 231, $col_204, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_204(long value) {
		setConstNumber(offset + 231, $col_204, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_204(float value) {
		setConstNumber(offset + 231, $col_204, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_204(double value) {
		setConstNumber(offset + 231, $col_204, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_41_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 232, $qty_41_p);
	}
	
	public void qty_41_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 232, $qty_41_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_206() {
		return getConstNumber(offset + 233, $col_206);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_206(MCNumber value) {
		setConstNumber(offset + 233, $col_206, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_206(int value) {
		setConstNumber(offset + 233, $col_206, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_206(long value) {
		setConstNumber(offset + 233, $col_206, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_206(float value) {
		setConstNumber(offset + 233, $col_206, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_206(double value) {
		setConstNumber(offset + 233, $col_206, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_207() {
		return getConstNumber(offset + 234, $col_207);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_207(MCNumber value) {
		setConstNumber(offset + 234, $col_207, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_207(int value) {
		setConstNumber(offset + 234, $col_207, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_207(long value) {
		setConstNumber(offset + 234, $col_207, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_207(float value) {
		setConstNumber(offset + 234, $col_207, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_207(double value) {
		setConstNumber(offset + 234, $col_207, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_208() {
		return getConstNumber(offset + 235, $col_208);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_208(MCNumber value) {
		setConstNumber(offset + 235, $col_208, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_208(int value) {
		setConstNumber(offset + 235, $col_208, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_208(long value) {
		setConstNumber(offset + 235, $col_208, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_208(float value) {
		setConstNumber(offset + 235, $col_208, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_208(double value) {
		setConstNumber(offset + 235, $col_208, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_209() {
		return getConstNumber(offset + 236, $col_209);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_209(MCNumber value) {
		setConstNumber(offset + 236, $col_209, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_209(int value) {
		setConstNumber(offset + 236, $col_209, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_209(long value) {
		setConstNumber(offset + 236, $col_209, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_209(float value) {
		setConstNumber(offset + 236, $col_209, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_209(double value) {
		setConstNumber(offset + 236, $col_209, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_42_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 237, $qty_42_p);
	}
	
	public void qty_42_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 237, $qty_42_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_211() {
		return getConstNumber(offset + 238, $col_211);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_211(MCNumber value) {
		setConstNumber(offset + 238, $col_211, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_211(int value) {
		setConstNumber(offset + 238, $col_211, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_211(long value) {
		setConstNumber(offset + 238, $col_211, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_211(float value) {
		setConstNumber(offset + 238, $col_211, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_211(double value) {
		setConstNumber(offset + 238, $col_211, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_212() {
		return getConstNumber(offset + 239, $col_212);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_212(MCNumber value) {
		setConstNumber(offset + 239, $col_212, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_212(int value) {
		setConstNumber(offset + 239, $col_212, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_212(long value) {
		setConstNumber(offset + 239, $col_212, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_212(float value) {
		setConstNumber(offset + 239, $col_212, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_212(double value) {
		setConstNumber(offset + 239, $col_212, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_213() {
		return getConstNumber(offset + 240, $col_213);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_213(MCNumber value) {
		setConstNumber(offset + 240, $col_213, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_213(int value) {
		setConstNumber(offset + 240, $col_213, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_213(long value) {
		setConstNumber(offset + 240, $col_213, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_213(float value) {
		setConstNumber(offset + 240, $col_213, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_213(double value) {
		setConstNumber(offset + 240, $col_213, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_214() {
		return getConstNumber(offset + 241, $col_214);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_214(MCNumber value) {
		setConstNumber(offset + 241, $col_214, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_214(int value) {
		setConstNumber(offset + 241, $col_214, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_214(long value) {
		setConstNumber(offset + 241, $col_214, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_214(float value) {
		setConstNumber(offset + 241, $col_214, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_214(double value) {
		setConstNumber(offset + 241, $col_214, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_43_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 242, $qty_43_p);
	}
	
	public void qty_43_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 242, $qty_43_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_216() {
		return getConstNumber(offset + 243, $col_216);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_216(MCNumber value) {
		setConstNumber(offset + 243, $col_216, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_216(int value) {
		setConstNumber(offset + 243, $col_216, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_216(long value) {
		setConstNumber(offset + 243, $col_216, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_216(float value) {
		setConstNumber(offset + 243, $col_216, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_216(double value) {
		setConstNumber(offset + 243, $col_216, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_217() {
		return getConstNumber(offset + 244, $col_217);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_217(MCNumber value) {
		setConstNumber(offset + 244, $col_217, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_217(int value) {
		setConstNumber(offset + 244, $col_217, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_217(long value) {
		setConstNumber(offset + 244, $col_217, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_217(float value) {
		setConstNumber(offset + 244, $col_217, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_217(double value) {
		setConstNumber(offset + 244, $col_217, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_218() {
		return getConstNumber(offset + 245, $col_218);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_218(MCNumber value) {
		setConstNumber(offset + 245, $col_218, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_218(int value) {
		setConstNumber(offset + 245, $col_218, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_218(long value) {
		setConstNumber(offset + 245, $col_218, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_218(float value) {
		setConstNumber(offset + 245, $col_218, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_218(double value) {
		setConstNumber(offset + 245, $col_218, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_219() {
		return getConstNumber(offset + 246, $col_219);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_219(MCNumber value) {
		setConstNumber(offset + 246, $col_219, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_219(int value) {
		setConstNumber(offset + 246, $col_219, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_219(long value) {
		setConstNumber(offset + 246, $col_219, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_219(float value) {
		setConstNumber(offset + 246, $col_219, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_219(double value) {
		setConstNumber(offset + 246, $col_219, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_44_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 247, $qty_44_p);
	}
	
	public void qty_44_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 247, $qty_44_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_221() {
		return getConstNumber(offset + 248, $col_221);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_221(MCNumber value) {
		setConstNumber(offset + 248, $col_221, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_221(int value) {
		setConstNumber(offset + 248, $col_221, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_221(long value) {
		setConstNumber(offset + 248, $col_221, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_221(float value) {
		setConstNumber(offset + 248, $col_221, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_221(double value) {
		setConstNumber(offset + 248, $col_221, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_222() {
		return getConstNumber(offset + 249, $col_222);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_222(MCNumber value) {
		setConstNumber(offset + 249, $col_222, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_222(int value) {
		setConstNumber(offset + 249, $col_222, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_222(long value) {
		setConstNumber(offset + 249, $col_222, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_222(float value) {
		setConstNumber(offset + 249, $col_222, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_222(double value) {
		setConstNumber(offset + 249, $col_222, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_223() {
		return getConstNumber(offset + 250, $col_223);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_223(MCNumber value) {
		setConstNumber(offset + 250, $col_223, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_223(int value) {
		setConstNumber(offset + 250, $col_223, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_223(long value) {
		setConstNumber(offset + 250, $col_223, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_223(float value) {
		setConstNumber(offset + 250, $col_223, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_223(double value) {
		setConstNumber(offset + 250, $col_223, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_224() {
		return getConstNumber(offset + 251, $col_224);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_224(MCNumber value) {
		setConstNumber(offset + 251, $col_224, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_224(int value) {
		setConstNumber(offset + 251, $col_224, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_224(long value) {
		setConstNumber(offset + 251, $col_224, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_224(float value) {
		setConstNumber(offset + 251, $col_224, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_224(double value) {
		setConstNumber(offset + 251, $col_224, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_45_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 252, $qty_45_p);
	}
	
	public void qty_45_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 252, $qty_45_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_226() {
		return getConstNumber(offset + 253, $col_226);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_226(MCNumber value) {
		setConstNumber(offset + 253, $col_226, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_226(int value) {
		setConstNumber(offset + 253, $col_226, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_226(long value) {
		setConstNumber(offset + 253, $col_226, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_226(float value) {
		setConstNumber(offset + 253, $col_226, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_226(double value) {
		setConstNumber(offset + 253, $col_226, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_227() {
		return getConstNumber(offset + 254, $col_227);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_227(MCNumber value) {
		setConstNumber(offset + 254, $col_227, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_227(int value) {
		setConstNumber(offset + 254, $col_227, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_227(long value) {
		setConstNumber(offset + 254, $col_227, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_227(float value) {
		setConstNumber(offset + 254, $col_227, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_227(double value) {
		setConstNumber(offset + 254, $col_227, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_228() {
		return getConstNumber(offset + 255, $col_228);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_228(MCNumber value) {
		setConstNumber(offset + 255, $col_228, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_228(int value) {
		setConstNumber(offset + 255, $col_228, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_228(long value) {
		setConstNumber(offset + 255, $col_228, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_228(float value) {
		setConstNumber(offset + 255, $col_228, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_228(double value) {
		setConstNumber(offset + 255, $col_228, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_229() {
		return getConstNumber(offset + 256, $col_229);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_229(MCNumber value) {
		setConstNumber(offset + 256, $col_229, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_229(int value) {
		setConstNumber(offset + 256, $col_229, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_229(long value) {
		setConstNumber(offset + 256, $col_229, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_229(float value) {
		setConstNumber(offset + 256, $col_229, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_229(double value) {
		setConstNumber(offset + 256, $col_229, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_46_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 257, $qty_46_p);
	}
	
	public void qty_46_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 257, $qty_46_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_231() {
		return getConstNumber(offset + 258, $col_231);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_231(MCNumber value) {
		setConstNumber(offset + 258, $col_231, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_231(int value) {
		setConstNumber(offset + 258, $col_231, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_231(long value) {
		setConstNumber(offset + 258, $col_231, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_231(float value) {
		setConstNumber(offset + 258, $col_231, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_231(double value) {
		setConstNumber(offset + 258, $col_231, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_232() {
		return getConstNumber(offset + 259, $col_232);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_232(MCNumber value) {
		setConstNumber(offset + 259, $col_232, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_232(int value) {
		setConstNumber(offset + 259, $col_232, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_232(long value) {
		setConstNumber(offset + 259, $col_232, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_232(float value) {
		setConstNumber(offset + 259, $col_232, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_232(double value) {
		setConstNumber(offset + 259, $col_232, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_233() {
		return getConstNumber(offset + 260, $col_233);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_233(MCNumber value) {
		setConstNumber(offset + 260, $col_233, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_233(int value) {
		setConstNumber(offset + 260, $col_233, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_233(long value) {
		setConstNumber(offset + 260, $col_233, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_233(float value) {
		setConstNumber(offset + 260, $col_233, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_233(double value) {
		setConstNumber(offset + 260, $col_233, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_234() {
		return getConstNumber(offset + 261, $col_234);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_234(MCNumber value) {
		setConstNumber(offset + 261, $col_234, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_234(int value) {
		setConstNumber(offset + 261, $col_234, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_234(long value) {
		setConstNumber(offset + 261, $col_234, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_234(float value) {
		setConstNumber(offset + 261, $col_234, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_234(double value) {
		setConstNumber(offset + 261, $col_234, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_47_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 262, $qty_47_p);
	}
	
	public void qty_47_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 262, $qty_47_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_236() {
		return getConstNumber(offset + 263, $col_236);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_236(MCNumber value) {
		setConstNumber(offset + 263, $col_236, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_236(int value) {
		setConstNumber(offset + 263, $col_236, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_236(long value) {
		setConstNumber(offset + 263, $col_236, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_236(float value) {
		setConstNumber(offset + 263, $col_236, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_236(double value) {
		setConstNumber(offset + 263, $col_236, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_237() {
		return getConstNumber(offset + 264, $col_237);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_237(MCNumber value) {
		setConstNumber(offset + 264, $col_237, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_237(int value) {
		setConstNumber(offset + 264, $col_237, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_237(long value) {
		setConstNumber(offset + 264, $col_237, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_237(float value) {
		setConstNumber(offset + 264, $col_237, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_237(double value) {
		setConstNumber(offset + 264, $col_237, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_238() {
		return getConstNumber(offset + 265, $col_238);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_238(MCNumber value) {
		setConstNumber(offset + 265, $col_238, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_238(int value) {
		setConstNumber(offset + 265, $col_238, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_238(long value) {
		setConstNumber(offset + 265, $col_238, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_238(float value) {
		setConstNumber(offset + 265, $col_238, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_238(double value) {
		setConstNumber(offset + 265, $col_238, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_239() {
		return getConstNumber(offset + 266, $col_239);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_239(MCNumber value) {
		setConstNumber(offset + 266, $col_239, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_239(int value) {
		setConstNumber(offset + 266, $col_239, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_239(long value) {
		setConstNumber(offset + 266, $col_239, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_239(float value) {
		setConstNumber(offset + 266, $col_239, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_239(double value) {
		setConstNumber(offset + 266, $col_239, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_48_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 267, $qty_48_p);
	}
	
	public void qty_48_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 267, $qty_48_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_241() {
		return getConstNumber(offset + 268, $col_241);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_241(MCNumber value) {
		setConstNumber(offset + 268, $col_241, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_241(int value) {
		setConstNumber(offset + 268, $col_241, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_241(long value) {
		setConstNumber(offset + 268, $col_241, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_241(float value) {
		setConstNumber(offset + 268, $col_241, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_241(double value) {
		setConstNumber(offset + 268, $col_241, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_242() {
		return getConstNumber(offset + 269, $col_242);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_242(MCNumber value) {
		setConstNumber(offset + 269, $col_242, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_242(int value) {
		setConstNumber(offset + 269, $col_242, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_242(long value) {
		setConstNumber(offset + 269, $col_242, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_242(float value) {
		setConstNumber(offset + 269, $col_242, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_242(double value) {
		setConstNumber(offset + 269, $col_242, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_243() {
		return getConstNumber(offset + 270, $col_243);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_243(MCNumber value) {
		setConstNumber(offset + 270, $col_243, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_243(int value) {
		setConstNumber(offset + 270, $col_243, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_243(long value) {
		setConstNumber(offset + 270, $col_243, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_243(float value) {
		setConstNumber(offset + 270, $col_243, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_243(double value) {
		setConstNumber(offset + 270, $col_243, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_244() {
		return getConstNumber(offset + 271, $col_244);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_244(MCNumber value) {
		setConstNumber(offset + 271, $col_244, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_244(int value) {
		setConstNumber(offset + 271, $col_244, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_244(long value) {
		setConstNumber(offset + 271, $col_244, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_244(float value) {
		setConstNumber(offset + 271, $col_244, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_244(double value) {
		setConstNumber(offset + 271, $col_244, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_49_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 272, $qty_49_p);
	}
	
	public void qty_49_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 272, $qty_49_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_246() {
		return getConstNumber(offset + 273, $col_246);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_246(MCNumber value) {
		setConstNumber(offset + 273, $col_246, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_246(int value) {
		setConstNumber(offset + 273, $col_246, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_246(long value) {
		setConstNumber(offset + 273, $col_246, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_246(float value) {
		setConstNumber(offset + 273, $col_246, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_246(double value) {
		setConstNumber(offset + 273, $col_246, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_247() {
		return getConstNumber(offset + 274, $col_247);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_247(MCNumber value) {
		setConstNumber(offset + 274, $col_247, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_247(int value) {
		setConstNumber(offset + 274, $col_247, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_247(long value) {
		setConstNumber(offset + 274, $col_247, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_247(float value) {
		setConstNumber(offset + 274, $col_247, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_247(double value) {
		setConstNumber(offset + 274, $col_247, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_248() {
		return getConstNumber(offset + 275, $col_248);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_248(MCNumber value) {
		setConstNumber(offset + 275, $col_248, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_248(int value) {
		setConstNumber(offset + 275, $col_248, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_248(long value) {
		setConstNumber(offset + 275, $col_248, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_248(float value) {
		setConstNumber(offset + 275, $col_248, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_248(double value) {
		setConstNumber(offset + 275, $col_248, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_249() {
		return getConstNumber(offset + 276, $col_249);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_249(MCNumber value) {
		setConstNumber(offset + 276, $col_249, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_249(int value) {
		setConstNumber(offset + 276, $col_249, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_249(long value) {
		setConstNumber(offset + 276, $col_249, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_249(float value) {
		setConstNumber(offset + 276, $col_249, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_249(double value) {
		setConstNumber(offset + 276, $col_249, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_50_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 277, $qty_50_p);
	}
	
	public void qty_50_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 277, $qty_50_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_251() {
		return getConstNumber(offset + 278, $col_251);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_251(MCNumber value) {
		setConstNumber(offset + 278, $col_251, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_251(int value) {
		setConstNumber(offset + 278, $col_251, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_251(long value) {
		setConstNumber(offset + 278, $col_251, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_251(float value) {
		setConstNumber(offset + 278, $col_251, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_251(double value) {
		setConstNumber(offset + 278, $col_251, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_252() {
		return getConstNumber(offset + 279, $col_252);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_252(MCNumber value) {
		setConstNumber(offset + 279, $col_252, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_252(int value) {
		setConstNumber(offset + 279, $col_252, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_252(long value) {
		setConstNumber(offset + 279, $col_252, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_252(float value) {
		setConstNumber(offset + 279, $col_252, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_252(double value) {
		setConstNumber(offset + 279, $col_252, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_253() {
		return getConstNumber(offset + 280, $col_253);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_253(MCNumber value) {
		setConstNumber(offset + 280, $col_253, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_253(int value) {
		setConstNumber(offset + 280, $col_253, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_253(long value) {
		setConstNumber(offset + 280, $col_253, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_253(float value) {
		setConstNumber(offset + 280, $col_253, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_253(double value) {
		setConstNumber(offset + 280, $col_253, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_254() {
		return getConstNumber(offset + 281, $col_254);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_254(MCNumber value) {
		setConstNumber(offset + 281, $col_254, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_254(int value) {
		setConstNumber(offset + 281, $col_254, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_254(long value) {
		setConstNumber(offset + 281, $col_254, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_254(float value) {
		setConstNumber(offset + 281, $col_254, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_254(double value) {
		setConstNumber(offset + 281, $col_254, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_51_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 282, $qty_51_p);
	}
	
	public void qty_51_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 282, $qty_51_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_256() {
		return getConstNumber(offset + 283, $col_256);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_256(MCNumber value) {
		setConstNumber(offset + 283, $col_256, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_256(int value) {
		setConstNumber(offset + 283, $col_256, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_256(long value) {
		setConstNumber(offset + 283, $col_256, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_256(float value) {
		setConstNumber(offset + 283, $col_256, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_256(double value) {
		setConstNumber(offset + 283, $col_256, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_257() {
		return getConstNumber(offset + 284, $col_257);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_257(MCNumber value) {
		setConstNumber(offset + 284, $col_257, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_257(int value) {
		setConstNumber(offset + 284, $col_257, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_257(long value) {
		setConstNumber(offset + 284, $col_257, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_257(float value) {
		setConstNumber(offset + 284, $col_257, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_257(double value) {
		setConstNumber(offset + 284, $col_257, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_258() {
		return getConstNumber(offset + 285, $col_258);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_258(MCNumber value) {
		setConstNumber(offset + 285, $col_258, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_258(int value) {
		setConstNumber(offset + 285, $col_258, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_258(long value) {
		setConstNumber(offset + 285, $col_258, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_258(float value) {
		setConstNumber(offset + 285, $col_258, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_258(double value) {
		setConstNumber(offset + 285, $col_258, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_259() {
		return getConstNumber(offset + 286, $col_259);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_259(MCNumber value) {
		setConstNumber(offset + 286, $col_259, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_259(int value) {
		setConstNumber(offset + 286, $col_259, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_259(long value) {
		setConstNumber(offset + 286, $col_259, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_259(float value) {
		setConstNumber(offset + 286, $col_259, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_259(double value) {
		setConstNumber(offset + 286, $col_259, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_52_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 287, $qty_52_p);
	}
	
	public void qty_52_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 287, $qty_52_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_261() {
		return getConstNumber(offset + 288, $col_261);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_261(MCNumber value) {
		setConstNumber(offset + 288, $col_261, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_261(int value) {
		setConstNumber(offset + 288, $col_261, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_261(long value) {
		setConstNumber(offset + 288, $col_261, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_261(float value) {
		setConstNumber(offset + 288, $col_261, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_261(double value) {
		setConstNumber(offset + 288, $col_261, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_262() {
		return getConstNumber(offset + 289, $col_262);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_262(MCNumber value) {
		setConstNumber(offset + 289, $col_262, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_262(int value) {
		setConstNumber(offset + 289, $col_262, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_262(long value) {
		setConstNumber(offset + 289, $col_262, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_262(float value) {
		setConstNumber(offset + 289, $col_262, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_262(double value) {
		setConstNumber(offset + 289, $col_262, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_263() {
		return getConstNumber(offset + 290, $col_263);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_263(MCNumber value) {
		setConstNumber(offset + 290, $col_263, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_263(int value) {
		setConstNumber(offset + 290, $col_263, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_263(long value) {
		setConstNumber(offset + 290, $col_263, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_263(float value) {
		setConstNumber(offset + 290, $col_263, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_263(double value) {
		setConstNumber(offset + 290, $col_263, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_264() {
		return getConstNumber(offset + 291, $col_264);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_264(MCNumber value) {
		setConstNumber(offset + 291, $col_264, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_264(int value) {
		setConstNumber(offset + 291, $col_264, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_264(long value) {
		setConstNumber(offset + 291, $col_264, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_264(float value) {
		setConstNumber(offset + 291, $col_264, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_264(double value) {
		setConstNumber(offset + 291, $col_264, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_53_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 292, $qty_53_p);
	}
	
	public void qty_53_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 292, $qty_53_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_266() {
		return getConstNumber(offset + 293, $col_266);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_266(MCNumber value) {
		setConstNumber(offset + 293, $col_266, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_266(int value) {
		setConstNumber(offset + 293, $col_266, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_266(long value) {
		setConstNumber(offset + 293, $col_266, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_266(float value) {
		setConstNumber(offset + 293, $col_266, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_266(double value) {
		setConstNumber(offset + 293, $col_266, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_267() {
		return getConstNumber(offset + 294, $col_267);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_267(MCNumber value) {
		setConstNumber(offset + 294, $col_267, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_267(int value) {
		setConstNumber(offset + 294, $col_267, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_267(long value) {
		setConstNumber(offset + 294, $col_267, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_267(float value) {
		setConstNumber(offset + 294, $col_267, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_267(double value) {
		setConstNumber(offset + 294, $col_267, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_268() {
		return getConstNumber(offset + 295, $col_268);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_268(MCNumber value) {
		setConstNumber(offset + 295, $col_268, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_268(int value) {
		setConstNumber(offset + 295, $col_268, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_268(long value) {
		setConstNumber(offset + 295, $col_268, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_268(float value) {
		setConstNumber(offset + 295, $col_268, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_268(double value) {
		setConstNumber(offset + 295, $col_268, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_269() {
		return getConstNumber(offset + 296, $col_269);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_269(MCNumber value) {
		setConstNumber(offset + 296, $col_269, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_269(int value) {
		setConstNumber(offset + 296, $col_269, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_269(long value) {
		setConstNumber(offset + 296, $col_269, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_269(float value) {
		setConstNumber(offset + 296, $col_269, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_269(double value) {
		setConstNumber(offset + 296, $col_269, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_54_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 297, $qty_54_p);
	}
	
	public void qty_54_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 297, $qty_54_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_271() {
		return getConstNumber(offset + 298, $col_271);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_271(MCNumber value) {
		setConstNumber(offset + 298, $col_271, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_271(int value) {
		setConstNumber(offset + 298, $col_271, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_271(long value) {
		setConstNumber(offset + 298, $col_271, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_271(float value) {
		setConstNumber(offset + 298, $col_271, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_271(double value) {
		setConstNumber(offset + 298, $col_271, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_272() {
		return getConstNumber(offset + 299, $col_272);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_272(MCNumber value) {
		setConstNumber(offset + 299, $col_272, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_272(int value) {
		setConstNumber(offset + 299, $col_272, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_272(long value) {
		setConstNumber(offset + 299, $col_272, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_272(float value) {
		setConstNumber(offset + 299, $col_272, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_272(double value) {
		setConstNumber(offset + 299, $col_272, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_273() {
		return getConstNumber(offset + 300, $col_273);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_273(MCNumber value) {
		setConstNumber(offset + 300, $col_273, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_273(int value) {
		setConstNumber(offset + 300, $col_273, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_273(long value) {
		setConstNumber(offset + 300, $col_273, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_273(float value) {
		setConstNumber(offset + 300, $col_273, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_273(double value) {
		setConstNumber(offset + 300, $col_273, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_274() {
		return getConstNumber(offset + 301, $col_274);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_274(MCNumber value) {
		setConstNumber(offset + 301, $col_274, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_274(int value) {
		setConstNumber(offset + 301, $col_274, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_274(long value) {
		setConstNumber(offset + 301, $col_274, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_274(float value) {
		setConstNumber(offset + 301, $col_274, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_274(double value) {
		setConstNumber(offset + 301, $col_274, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_55_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 302, $qty_55_p);
	}
	
	public void qty_55_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 302, $qty_55_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_276() {
		return getConstNumber(offset + 303, $col_276);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_276(MCNumber value) {
		setConstNumber(offset + 303, $col_276, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_276(int value) {
		setConstNumber(offset + 303, $col_276, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_276(long value) {
		setConstNumber(offset + 303, $col_276, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_276(float value) {
		setConstNumber(offset + 303, $col_276, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_276(double value) {
		setConstNumber(offset + 303, $col_276, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_277() {
		return getConstNumber(offset + 304, $col_277);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_277(MCNumber value) {
		setConstNumber(offset + 304, $col_277, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_277(int value) {
		setConstNumber(offset + 304, $col_277, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_277(long value) {
		setConstNumber(offset + 304, $col_277, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_277(float value) {
		setConstNumber(offset + 304, $col_277, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_277(double value) {
		setConstNumber(offset + 304, $col_277, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_278() {
		return getConstNumber(offset + 305, $col_278);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_278(MCNumber value) {
		setConstNumber(offset + 305, $col_278, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_278(int value) {
		setConstNumber(offset + 305, $col_278, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_278(long value) {
		setConstNumber(offset + 305, $col_278, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_278(float value) {
		setConstNumber(offset + 305, $col_278, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_278(double value) {
		setConstNumber(offset + 305, $col_278, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_279() {
		return getConstNumber(offset + 306, $col_279);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_279(MCNumber value) {
		setConstNumber(offset + 306, $col_279, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_279(int value) {
		setConstNumber(offset + 306, $col_279, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_279(long value) {
		setConstNumber(offset + 306, $col_279, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_279(float value) {
		setConstNumber(offset + 306, $col_279, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_279(double value) {
		setConstNumber(offset + 306, $col_279, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_56_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 307, $qty_56_p);
	}
	
	public void qty_56_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 307, $qty_56_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_281() {
		return getConstNumber(offset + 308, $col_281);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_281(MCNumber value) {
		setConstNumber(offset + 308, $col_281, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_281(int value) {
		setConstNumber(offset + 308, $col_281, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_281(long value) {
		setConstNumber(offset + 308, $col_281, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_281(float value) {
		setConstNumber(offset + 308, $col_281, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_281(double value) {
		setConstNumber(offset + 308, $col_281, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_282() {
		return getConstNumber(offset + 309, $col_282);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_282(MCNumber value) {
		setConstNumber(offset + 309, $col_282, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_282(int value) {
		setConstNumber(offset + 309, $col_282, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_282(long value) {
		setConstNumber(offset + 309, $col_282, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_282(float value) {
		setConstNumber(offset + 309, $col_282, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_282(double value) {
		setConstNumber(offset + 309, $col_282, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_283() {
		return getConstNumber(offset + 310, $col_283);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_283(MCNumber value) {
		setConstNumber(offset + 310, $col_283, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_283(int value) {
		setConstNumber(offset + 310, $col_283, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_283(long value) {
		setConstNumber(offset + 310, $col_283, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_283(float value) {
		setConstNumber(offset + 310, $col_283, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_283(double value) {
		setConstNumber(offset + 310, $col_283, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_284() {
		return getConstNumber(offset + 311, $col_284);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_284(MCNumber value) {
		setConstNumber(offset + 311, $col_284, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_284(int value) {
		setConstNumber(offset + 311, $col_284, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_284(long value) {
		setConstNumber(offset + 311, $col_284, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_284(float value) {
		setConstNumber(offset + 311, $col_284, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_284(double value) {
		setConstNumber(offset + 311, $col_284, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_57_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 312, $qty_57_p);
	}
	
	public void qty_57_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 312, $qty_57_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_286() {
		return getConstNumber(offset + 313, $col_286);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_286(MCNumber value) {
		setConstNumber(offset + 313, $col_286, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_286(int value) {
		setConstNumber(offset + 313, $col_286, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_286(long value) {
		setConstNumber(offset + 313, $col_286, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_286(float value) {
		setConstNumber(offset + 313, $col_286, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_286(double value) {
		setConstNumber(offset + 313, $col_286, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_287() {
		return getConstNumber(offset + 314, $col_287);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_287(MCNumber value) {
		setConstNumber(offset + 314, $col_287, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_287(int value) {
		setConstNumber(offset + 314, $col_287, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_287(long value) {
		setConstNumber(offset + 314, $col_287, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_287(float value) {
		setConstNumber(offset + 314, $col_287, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_287(double value) {
		setConstNumber(offset + 314, $col_287, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_288() {
		return getConstNumber(offset + 315, $col_288);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_288(MCNumber value) {
		setConstNumber(offset + 315, $col_288, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_288(int value) {
		setConstNumber(offset + 315, $col_288, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_288(long value) {
		setConstNumber(offset + 315, $col_288, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_288(float value) {
		setConstNumber(offset + 315, $col_288, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_288(double value) {
		setConstNumber(offset + 315, $col_288, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_289() {
		return getConstNumber(offset + 316, $col_289);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_289(MCNumber value) {
		setConstNumber(offset + 316, $col_289, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_289(int value) {
		setConstNumber(offset + 316, $col_289, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_289(long value) {
		setConstNumber(offset + 316, $col_289, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_289(float value) {
		setConstNumber(offset + 316, $col_289, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_289(double value) {
		setConstNumber(offset + 316, $col_289, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_58_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 317, $qty_58_p);
	}
	
	public void qty_58_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 317, $qty_58_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_291() {
		return getConstNumber(offset + 318, $col_291);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_291(MCNumber value) {
		setConstNumber(offset + 318, $col_291, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_291(int value) {
		setConstNumber(offset + 318, $col_291, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_291(long value) {
		setConstNumber(offset + 318, $col_291, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_291(float value) {
		setConstNumber(offset + 318, $col_291, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_291(double value) {
		setConstNumber(offset + 318, $col_291, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_292() {
		return getConstNumber(offset + 319, $col_292);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_292(MCNumber value) {
		setConstNumber(offset + 319, $col_292, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_292(int value) {
		setConstNumber(offset + 319, $col_292, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_292(long value) {
		setConstNumber(offset + 319, $col_292, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_292(float value) {
		setConstNumber(offset + 319, $col_292, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_292(double value) {
		setConstNumber(offset + 319, $col_292, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_293() {
		return getConstNumber(offset + 320, $col_293);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_293(MCNumber value) {
		setConstNumber(offset + 320, $col_293, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_293(int value) {
		setConstNumber(offset + 320, $col_293, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_293(long value) {
		setConstNumber(offset + 320, $col_293, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_293(float value) {
		setConstNumber(offset + 320, $col_293, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_293(double value) {
		setConstNumber(offset + 320, $col_293, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_294() {
		return getConstNumber(offset + 321, $col_294);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_294(MCNumber value) {
		setConstNumber(offset + 321, $col_294, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_294(int value) {
		setConstNumber(offset + 321, $col_294, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_294(long value) {
		setConstNumber(offset + 321, $col_294, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_294(float value) {
		setConstNumber(offset + 321, $col_294, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_294(double value) {
		setConstNumber(offset + 321, $col_294, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_59_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 322, $qty_59_p);
	}
	
	public void qty_59_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 322, $qty_59_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_296() {
		return getConstNumber(offset + 323, $col_296);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_296(MCNumber value) {
		setConstNumber(offset + 323, $col_296, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_296(int value) {
		setConstNumber(offset + 323, $col_296, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_296(long value) {
		setConstNumber(offset + 323, $col_296, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_296(float value) {
		setConstNumber(offset + 323, $col_296, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_296(double value) {
		setConstNumber(offset + 323, $col_296, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_297() {
		return getConstNumber(offset + 324, $col_297);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_297(MCNumber value) {
		setConstNumber(offset + 324, $col_297, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_297(int value) {
		setConstNumber(offset + 324, $col_297, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_297(long value) {
		setConstNumber(offset + 324, $col_297, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_297(float value) {
		setConstNumber(offset + 324, $col_297, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_297(double value) {
		setConstNumber(offset + 324, $col_297, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_298() {
		return getConstNumber(offset + 325, $col_298);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_298(MCNumber value) {
		setConstNumber(offset + 325, $col_298, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_298(int value) {
		setConstNumber(offset + 325, $col_298, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_298(long value) {
		setConstNumber(offset + 325, $col_298, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_298(float value) {
		setConstNumber(offset + 325, $col_298, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_298(double value) {
		setConstNumber(offset + 325, $col_298, value);
	}


	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCNumber col_299() {
		return getConstNumber(offset + 326, $col_299);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_299(MCNumber value) {
		setConstNumber(offset + 326, $col_299, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_299(int value) {
		setConstNumber(offset + 326, $col_299, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_299(long value) {
		setConstNumber(offset + 326, $col_299, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_299(float value) {
		setConstNumber(offset + 326, $col_299, value);
	}

	/**
	 * Standard 標準.<p>
	 *
	 */
	public void col_299(double value) {
		setConstNumber(offset + 326, $col_299, value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
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
	public boolean getBoolean(String name) {
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
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
	public boolean getBooleanNE(String name) {
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
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
	public void setBoolean(String name, boolean value) {
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
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
	public void setBooleanNE(String name, boolean value) {
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
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
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
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
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_000() {
		return qty_00_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_000(MCNumber value) {
		qty_00_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_000(int value) {
		qty_00_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_000(long value) {
		qty_00_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_000(float value) {
		qty_00_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_000(double value) {
		qty_00_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_005() {
		return qty_01_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_005(MCNumber value) {
		qty_01_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_005(int value) {
		qty_01_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_005(long value) {
		qty_01_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_005(float value) {
		qty_01_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_005(double value) {
		qty_01_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_010() {
		return qty_02_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_010(MCNumber value) {
		qty_02_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_010(int value) {
		qty_02_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_010(long value) {
		qty_02_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_010(float value) {
		qty_02_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_010(double value) {
		qty_02_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_015() {
		return qty_03_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_015(MCNumber value) {
		qty_03_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_015(int value) {
		qty_03_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_015(long value) {
		qty_03_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_015(float value) {
		qty_03_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_015(double value) {
		qty_03_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_020() {
		return qty_04_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_020(MCNumber value) {
		qty_04_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_020(int value) {
		qty_04_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_020(long value) {
		qty_04_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_020(float value) {
		qty_04_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_020(double value) {
		qty_04_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_025() {
		return qty_05_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_025(MCNumber value) {
		qty_05_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_025(int value) {
		qty_05_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_025(long value) {
		qty_05_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_025(float value) {
		qty_05_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_025(double value) {
		qty_05_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_030() {
		return qty_06_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_030(MCNumber value) {
		qty_06_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_030(int value) {
		qty_06_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_030(long value) {
		qty_06_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_030(float value) {
		qty_06_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_030(double value) {
		qty_06_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_035() {
		return qty_07_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_035(MCNumber value) {
		qty_07_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_035(int value) {
		qty_07_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_035(long value) {
		qty_07_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_035(float value) {
		qty_07_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_035(double value) {
		qty_07_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_040() {
		return qty_08_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_040(MCNumber value) {
		qty_08_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_040(int value) {
		qty_08_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_040(long value) {
		qty_08_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_040(float value) {
		qty_08_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_040(double value) {
		qty_08_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_045() {
		return qty_09_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_045(MCNumber value) {
		qty_09_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_045(int value) {
		qty_09_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_045(long value) {
		qty_09_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_045(float value) {
		qty_09_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_045(double value) {
		qty_09_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_050() {
		return qty_10_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_050(MCNumber value) {
		qty_10_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_050(int value) {
		qty_10_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_050(long value) {
		qty_10_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_050(float value) {
		qty_10_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_050(double value) {
		qty_10_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_055() {
		return qty_11_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_055(MCNumber value) {
		qty_11_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_055(int value) {
		qty_11_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_055(long value) {
		qty_11_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_055(float value) {
		qty_11_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_055(double value) {
		qty_11_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_060() {
		return qty_12_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_060(MCNumber value) {
		qty_12_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_060(int value) {
		qty_12_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_060(long value) {
		qty_12_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_060(float value) {
		qty_12_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_060(double value) {
		qty_12_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_065() {
		return qty_13_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_065(MCNumber value) {
		qty_13_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_065(int value) {
		qty_13_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_065(long value) {
		qty_13_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_065(float value) {
		qty_13_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_065(double value) {
		qty_13_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_070() {
		return qty_14_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_070(MCNumber value) {
		qty_14_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_070(int value) {
		qty_14_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_070(long value) {
		qty_14_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_070(float value) {
		qty_14_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_070(double value) {
		qty_14_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_075() {
		return qty_15_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_075(MCNumber value) {
		qty_15_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_075(int value) {
		qty_15_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_075(long value) {
		qty_15_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_075(float value) {
		qty_15_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_075(double value) {
		qty_15_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_080() {
		return qty_16_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_080(MCNumber value) {
		qty_16_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_080(int value) {
		qty_16_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_080(long value) {
		qty_16_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_080(float value) {
		qty_16_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_080(double value) {
		qty_16_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_085() {
		return qty_17_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_085(MCNumber value) {
		qty_17_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_085(int value) {
		qty_17_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_085(long value) {
		qty_17_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_085(float value) {
		qty_17_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_085(double value) {
		qty_17_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_090() {
		return qty_18_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_090(MCNumber value) {
		qty_18_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_090(int value) {
		qty_18_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_090(long value) {
		qty_18_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_090(float value) {
		qty_18_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_090(double value) {
		qty_18_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_095() {
		return qty_19_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_095(MCNumber value) {
		qty_19_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_095(int value) {
		qty_19_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_095(long value) {
		qty_19_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_095(float value) {
		qty_19_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_095(double value) {
		qty_19_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_100() {
		return qty_20_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_100(MCNumber value) {
		qty_20_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_100(int value) {
		qty_20_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_100(long value) {
		qty_20_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_100(float value) {
		qty_20_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_100(double value) {
		qty_20_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_105() {
		return qty_21_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_105(MCNumber value) {
		qty_21_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_105(int value) {
		qty_21_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_105(long value) {
		qty_21_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_105(float value) {
		qty_21_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_105(double value) {
		qty_21_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_110() {
		return qty_22_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_110(MCNumber value) {
		qty_22_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_110(int value) {
		qty_22_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_110(long value) {
		qty_22_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_110(float value) {
		qty_22_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_110(double value) {
		qty_22_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_115() {
		return qty_23_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_115(MCNumber value) {
		qty_23_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_115(int value) {
		qty_23_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_115(long value) {
		qty_23_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_115(float value) {
		qty_23_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_115(double value) {
		qty_23_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_120() {
		return qty_24_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_120(MCNumber value) {
		qty_24_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_120(int value) {
		qty_24_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_120(long value) {
		qty_24_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_120(float value) {
		qty_24_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_120(double value) {
		qty_24_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_125() {
		return qty_25_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_125(MCNumber value) {
		qty_25_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_125(int value) {
		qty_25_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_125(long value) {
		qty_25_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_125(float value) {
		qty_25_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_125(double value) {
		qty_25_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_130() {
		return qty_26_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_130(MCNumber value) {
		qty_26_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_130(int value) {
		qty_26_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_130(long value) {
		qty_26_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_130(float value) {
		qty_26_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_130(double value) {
		qty_26_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_135() {
		return qty_27_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_135(MCNumber value) {
		qty_27_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_135(int value) {
		qty_27_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_135(long value) {
		qty_27_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_135(float value) {
		qty_27_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_135(double value) {
		qty_27_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_140() {
		return qty_28_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_140(MCNumber value) {
		qty_28_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_140(int value) {
		qty_28_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_140(long value) {
		qty_28_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_140(float value) {
		qty_28_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_140(double value) {
		qty_28_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_145() {
		return qty_29_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_145(MCNumber value) {
		qty_29_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_145(int value) {
		qty_29_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_145(long value) {
		qty_29_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_145(float value) {
		qty_29_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_145(double value) {
		qty_29_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_150() {
		return qty_30_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_150(MCNumber value) {
		qty_30_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_150(int value) {
		qty_30_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_150(long value) {
		qty_30_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_150(float value) {
		qty_30_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_150(double value) {
		qty_30_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_155() {
		return qty_31_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_155(MCNumber value) {
		qty_31_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_155(int value) {
		qty_31_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_155(long value) {
		qty_31_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_155(float value) {
		qty_31_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_155(double value) {
		qty_31_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_160() {
		return qty_32_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_160(MCNumber value) {
		qty_32_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_160(int value) {
		qty_32_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_160(long value) {
		qty_32_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_160(float value) {
		qty_32_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_160(double value) {
		qty_32_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_165() {
		return qty_33_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_165(MCNumber value) {
		qty_33_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_165(int value) {
		qty_33_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_165(long value) {
		qty_33_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_165(float value) {
		qty_33_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_165(double value) {
		qty_33_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_170() {
		return qty_34_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_170(MCNumber value) {
		qty_34_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_170(int value) {
		qty_34_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_170(long value) {
		qty_34_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_170(float value) {
		qty_34_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_170(double value) {
		qty_34_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_175() {
		return qty_35_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_175(MCNumber value) {
		qty_35_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_175(int value) {
		qty_35_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_175(long value) {
		qty_35_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_175(float value) {
		qty_35_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_175(double value) {
		qty_35_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_180() {
		return qty_36_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_180(MCNumber value) {
		qty_36_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_180(int value) {
		qty_36_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_180(long value) {
		qty_36_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_180(float value) {
		qty_36_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_180(double value) {
		qty_36_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_185() {
		return qty_37_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_185(MCNumber value) {
		qty_37_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_185(int value) {
		qty_37_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_185(long value) {
		qty_37_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_185(float value) {
		qty_37_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_185(double value) {
		qty_37_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_190() {
		return qty_38_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_190(MCNumber value) {
		qty_38_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_190(int value) {
		qty_38_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_190(long value) {
		qty_38_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_190(float value) {
		qty_38_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_190(double value) {
		qty_38_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_195() {
		return qty_39_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_195(MCNumber value) {
		qty_39_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_195(int value) {
		qty_39_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_195(long value) {
		qty_39_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_195(float value) {
		qty_39_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_195(double value) {
		qty_39_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_200() {
		return qty_40_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_200(MCNumber value) {
		qty_40_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_200(int value) {
		qty_40_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_200(long value) {
		qty_40_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_200(float value) {
		qty_40_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_200(double value) {
		qty_40_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_205() {
		return qty_41_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_205(MCNumber value) {
		qty_41_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_205(int value) {
		qty_41_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_205(long value) {
		qty_41_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_205(float value) {
		qty_41_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_205(double value) {
		qty_41_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_210() {
		return qty_42_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_210(MCNumber value) {
		qty_42_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_210(int value) {
		qty_42_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_210(long value) {
		qty_42_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_210(float value) {
		qty_42_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_210(double value) {
		qty_42_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_215() {
		return qty_43_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_215(MCNumber value) {
		qty_43_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_215(int value) {
		qty_43_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_215(long value) {
		qty_43_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_215(float value) {
		qty_43_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_215(double value) {
		qty_43_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_220() {
		return qty_44_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_220(MCNumber value) {
		qty_44_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_220(int value) {
		qty_44_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_220(long value) {
		qty_44_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_220(float value) {
		qty_44_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_220(double value) {
		qty_44_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_225() {
		return qty_45_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_225(MCNumber value) {
		qty_45_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_225(int value) {
		qty_45_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_225(long value) {
		qty_45_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_225(float value) {
		qty_45_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_225(double value) {
		qty_45_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_230() {
		return qty_46_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_230(MCNumber value) {
		qty_46_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_230(int value) {
		qty_46_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_230(long value) {
		qty_46_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_230(float value) {
		qty_46_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_230(double value) {
		qty_46_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_235() {
		return qty_47_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_235(MCNumber value) {
		qty_47_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_235(int value) {
		qty_47_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_235(long value) {
		qty_47_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_235(float value) {
		qty_47_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_235(double value) {
		qty_47_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_240() {
		return qty_48_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_240(MCNumber value) {
		qty_48_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_240(int value) {
		qty_48_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_240(long value) {
		qty_48_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_240(float value) {
		qty_48_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_240(double value) {
		qty_48_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_245() {
		return qty_49_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_245(MCNumber value) {
		qty_49_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_245(int value) {
		qty_49_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_245(long value) {
		qty_49_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_245(float value) {
		qty_49_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_245(double value) {
		qty_49_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_250() {
		return qty_50_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_250(MCNumber value) {
		qty_50_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_250(int value) {
		qty_50_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_250(long value) {
		qty_50_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_250(float value) {
		qty_50_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_250(double value) {
		qty_50_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_255() {
		return qty_51_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_255(MCNumber value) {
		qty_51_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_255(int value) {
		qty_51_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_255(long value) {
		qty_51_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_255(float value) {
		qty_51_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_255(double value) {
		qty_51_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_260() {
		return qty_52_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_260(MCNumber value) {
		qty_52_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_260(int value) {
		qty_52_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_260(long value) {
		qty_52_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_260(float value) {
		qty_52_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_260(double value) {
		qty_52_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_265() {
		return qty_53_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_265(MCNumber value) {
		qty_53_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_265(int value) {
		qty_53_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_265(long value) {
		qty_53_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_265(float value) {
		qty_53_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_265(double value) {
		qty_53_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_270() {
		return qty_54_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_270(MCNumber value) {
		qty_54_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_270(int value) {
		qty_54_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_270(long value) {
		qty_54_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_270(float value) {
		qty_54_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_270(double value) {
		qty_54_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_275() {
		return qty_55_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_275(MCNumber value) {
		qty_55_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_275(int value) {
		qty_55_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_275(long value) {
		qty_55_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_275(float value) {
		qty_55_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_275(double value) {
		qty_55_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_280() {
		return qty_56_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_280(MCNumber value) {
		qty_56_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_280(int value) {
		qty_56_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_280(long value) {
		qty_56_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_280(float value) {
		qty_56_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_280(double value) {
		qty_56_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_285() {
		return qty_57_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_285(MCNumber value) {
		qty_57_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_285(int value) {
		qty_57_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_285(long value) {
		qty_57_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_285(float value) {
		qty_57_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_285(double value) {
		qty_57_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_290() {
		return qty_58_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_290(MCNumber value) {
		qty_58_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_290(int value) {
		qty_58_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_290(long value) {
		qty_58_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_290(float value) {
		qty_58_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_290(double value) {
		qty_58_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber col_295() {
		return qty_59_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_295(MCNumber value) {
		qty_59_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_295(int value) {
		qty_59_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_295(long value) {
		qty_59_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_295(float value) {
		qty_59_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void col_295(double value) {
		qty_59_p().qty(value);
	}

}

