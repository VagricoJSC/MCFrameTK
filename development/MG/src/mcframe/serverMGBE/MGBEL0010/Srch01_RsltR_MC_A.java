package mcframe.serverMGBE.MGBEL0010;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Factory/Distribution warehouse master (Dummy for join) 工場・物流倉庫マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_site = "dummy_site";
	/**
	 * Country master (Supplier) (Dummy for join) 国マスタ（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_cntry = "dummy_sppl_cntry";
	/**
	 * Region master (Supplier) (Dummy for join) 地域マスタ（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_area = "dummy_sppl_area";
	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp1 = "dummy_itm_grp1";
	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp2 = "dummy_itm_grp2";
	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp3 = "dummy_itm_grp3";
	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp4 = "dummy_itm_grp4";
	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp5 = "dummy_itm_grp5";
	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp6 = "dummy_itm_grp6";
	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp7 = "dummy_itm_grp7";
	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp8 = "dummy_itm_grp8";
	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp9 = "dummy_itm_grp9";
	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp10 = "dummy_itm_grp10";
	/**
	 * BP classification master 1 (Supplier) (Dummy for join) 取引先分類マスタ１（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp1 = "dummy_sppl_grp1";
	/**
	 * BP classification master 2 (Supplier) (Dummy for join) 取引先分類マスタ２（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp2 = "dummy_sppl_grp2";
	/**
	 * BP classification master 3 (Supplier) (Dummy for join) 取引先分類マスタ３（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp3 = "dummy_sppl_grp3";
	/**
	 * BP classification master 4 (Supplier) (Dummy for join) 取引先分類マスタ４（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp4 = "dummy_sppl_grp4";
	/**
	 * BP classification master 5 (Supplier) (Dummy for join) 取引先分類マスタ５（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp5 = "dummy_sppl_grp5";
	/**
	 * BP classification master 6 (Supplier) (Dummy for join) 取引先分類マスタ６（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp6 = "dummy_sppl_grp6";
	/**
	 * BP classification master 7 (Supplier) (Dummy for join) 取引先分類マスタ７（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp7 = "dummy_sppl_grp7";
	/**
	 * BP classification master 8 (Supplier) (Dummy for join) 取引先分類マスタ８（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp8 = "dummy_sppl_grp8";
	/**
	 * BP classification master 9 (Supplier) (Dummy for join) 取引先分類マスタ９（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp9 = "dummy_sppl_grp9";
	/**
	 * BP classification master 10 (Supplier) (Dummy for join) 取引先分類マスタ１０（発注先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_sppl_grp10 = "dummy_sppl_grp10";
	/**
	 * Dummy for adding search criteria in parent item specification 親品目指定時検索条件追加用ダミー.<p>
	 *
	 */
	public static final String $dummy_parent_flg = "dummy_parent_flg";
	/**
	 * Dummy for adding search criteria in child item specification 子品目指定時検索条件追加用ダミー.<p>
	 *
	 */
	public static final String $dummy_child_flg = "dummy_child_flg";
	/**
	 * Dummy for adding HAVING clause HAVING句追加用ダミー.<p>
	 *
	 */
	public static final String $dummy_having_flg1 = "dummy_having_flg1";
	/**
	 * Dummy for adding HAVING clause HAVING句追加用ダミー.<p>
	 *
	 */
	public static final String $dummy_having_flg2 = "dummy_having_flg2";
	/**
	 * Dummy for adding HAVING clause HAVING句追加用ダミー.<p>
	 *
	 */
	public static final String $dummy_having_flg3 = "dummy_having_flg3";
	/**
	 * Dummy for adding HAVING clause HAVING句追加用ダミー.<p>
	 *
	 */
	public static final String $dummy_having_flg4 = "dummy_having_flg4";
	/**
	 * Dummy for adding HAVING clause HAVING句追加用ダミー.<p>
	 *
	 */
	public static final String $dummy_having_flg5 = "dummy_having_flg5";
	/**
	 * Dummy for adding HAVING clause HAVING句追加用ダミー.<p>
	 *
	 */
	public static final String $dummy_having_flg6 = "dummy_having_flg6";
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
	 * Item cd. 品目ＣＤ.<p>
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
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
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
	 * Quantity 数量.<p>
	 *
	 */
	public static final String $qty = "qty";
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public static final String $qty_unit = "qty_unit";
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
	/**
	 * Total 合計.<p>
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
	/**
	 * Total 合計.<p>
	 *
	 */
	public static final String $ttl_unit = "ttl_unit";
	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public static final String $var_cost_unit = "var_cost_unit";
	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public static final String $fxd_cost_unit = "fxd_cost_unit";
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
	public static final String $col_100 = "col_100";
	public static final String $col_101 = "col_101";
	public static final String $col_102 = "col_102";
	public static final String $col_103 = "col_103";
	public static final String $col_104 = "col_104";
	public static final String $col_105 = "col_105";
	public static final String $col_106 = "col_106";
	public static final String $col_107 = "col_107";
	public static final String $col_108 = "col_108";
	public static final String $col_109 = "col_109";
	public static final String $col_110 = "col_110";
	public static final String $col_111 = "col_111";
	public static final String $col_112 = "col_112";
	public static final String $col_113 = "col_113";
	public static final String $col_114 = "col_114";
	public static final String $col_115 = "col_115";
	public static final String $col_116 = "col_116";
	public static final String $col_117 = "col_117";
	public static final String $col_118 = "col_118";
	public static final String $col_119 = "col_119";
	public static final String $col_120 = "col_120";
	public static final String $col_121 = "col_121";
	public static final String $col_122 = "col_122";
	public static final String $col_123 = "col_123";
	public static final String $col_124 = "col_124";
	public static final String $col_125 = "col_125";
	public static final String $col_126 = "col_126";
	public static final String $col_127 = "col_127";
	public static final String $col_128 = "col_128";
	public static final String $col_129 = "col_129";
	public static final String $col_130 = "col_130";
	public static final String $col_131 = "col_131";
	public static final String $col_132 = "col_132";
	public static final String $col_133 = "col_133";
	public static final String $col_134 = "col_134";
	public static final String $col_135 = "col_135";
	public static final String $col_136 = "col_136";
	public static final String $col_137 = "col_137";
	public static final String $col_138 = "col_138";
	public static final String $col_139 = "col_139";
	public static final String $col_140 = "col_140";
	public static final String $col_141 = "col_141";
	public static final String $col_142 = "col_142";
	public static final String $col_143 = "col_143";
	public static final String $col_144 = "col_144";
	public static final String $col_145 = "col_145";
	public static final String $col_146 = "col_146";
	public static final String $col_147 = "col_147";
	public static final String $col_148 = "col_148";
	public static final String $col_149 = "col_149";
	public static final String $col_150 = "col_150";
	public static final String $col_151 = "col_151";
	public static final String $col_152 = "col_152";
	public static final String $col_153 = "col_153";
	public static final String $col_154 = "col_154";
	public static final String $col_155 = "col_155";
	public static final String $col_156 = "col_156";
	public static final String $col_157 = "col_157";
	public static final String $col_158 = "col_158";
	public static final String $col_159 = "col_159";
	public static final String $col_160 = "col_160";
	public static final String $col_161 = "col_161";
	public static final String $col_162 = "col_162";
	public static final String $col_163 = "col_163";
	public static final String $col_164 = "col_164";
	public static final String $col_165 = "col_165";
	public static final String $col_166 = "col_166";
	public static final String $col_167 = "col_167";
	public static final String $col_168 = "col_168";
	public static final String $col_169 = "col_169";
	public static final String $col_170 = "col_170";
	public static final String $col_171 = "col_171";
	public static final String $col_172 = "col_172";
	public static final String $col_173 = "col_173";
	public static final String $col_174 = "col_174";
	public static final String $col_175 = "col_175";
	public static final String $col_176 = "col_176";
	public static final String $col_177 = "col_177";
	public static final String $col_178 = "col_178";
	public static final String $col_179 = "col_179";
	public static final String $col_180 = "col_180";
	public static final String $col_181 = "col_181";
	public static final String $col_182 = "col_182";
	public static final String $col_183 = "col_183";
	public static final String $col_184 = "col_184";
	public static final String $col_185 = "col_185";
	public static final String $col_186 = "col_186";
	public static final String $col_187 = "col_187";
	public static final String $col_188 = "col_188";
	public static final String $col_189 = "col_189";
	public static final String $col_190 = "col_190";
	public static final String $col_191 = "col_191";
	public static final String $col_192 = "col_192";
	public static final String $col_193 = "col_193";
	public static final String $col_194 = "col_194";
	public static final String $col_195 = "col_195";
	public static final String $col_196 = "col_196";
	public static final String $col_197 = "col_197";
	public static final String $col_198 = "col_198";
	public static final String $col_199 = "col_199";


	public static final MCMeta dummy_site_META = createCommonMeta($dummy_site, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta dummy_sppl_cntry_META = createCommonMeta($dummy_sppl_cntry, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta dummy_sppl_area_META = createCommonMeta($dummy_sppl_area, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta dummy_itm_grp1_META = createCommonMeta($dummy_itm_grp1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp2_META = createCommonMeta($dummy_itm_grp2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp3_META = createCommonMeta($dummy_itm_grp3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp4_META = createCommonMeta($dummy_itm_grp4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp5_META = createCommonMeta($dummy_itm_grp5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp6_META = createCommonMeta($dummy_itm_grp6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp7_META = createCommonMeta($dummy_itm_grp7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp8_META = createCommonMeta($dummy_itm_grp8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp9_META = createCommonMeta($dummy_itm_grp9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp10_META = createCommonMeta($dummy_itm_grp10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_sppl_grp1_META = createCommonMeta($dummy_sppl_grp1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_sppl_grp2_META = createCommonMeta($dummy_sppl_grp2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_sppl_grp3_META = createCommonMeta($dummy_sppl_grp3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_sppl_grp4_META = createCommonMeta($dummy_sppl_grp4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_sppl_grp5_META = createCommonMeta($dummy_sppl_grp5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_sppl_grp6_META = createCommonMeta($dummy_sppl_grp6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_sppl_grp7_META = createCommonMeta($dummy_sppl_grp7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_sppl_grp8_META = createCommonMeta($dummy_sppl_grp8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_sppl_grp9_META = createCommonMeta($dummy_sppl_grp9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_sppl_grp10_META = createCommonMeta($dummy_sppl_grp10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_parent_flg_META = createCommonMeta($dummy_parent_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dummy_child_flg_META = createCommonMeta($dummy_child_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dummy_having_flg1_META = createCommonMeta($dummy_having_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dummy_having_flg2_META = createCommonMeta($dummy_having_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dummy_having_flg3_META = createCommonMeta($dummy_having_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dummy_having_flg4_META = createCommonMeta($dummy_having_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dummy_having_flg5_META = createCommonMeta($dummy_having_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dummy_having_flg6_META = createCommonMeta($dummy_having_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty_unit_META = createCommonMeta($qty_unit, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ttl_META = createCommonMeta($ttl, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta var_cost_META = createCommonMeta($var_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta fxd_cost_META = createCommonMeta($fxd_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_unit_META = createCommonMeta($ttl_unit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta var_cost_unit_META = createCommonMeta($var_cost_unit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta fxd_cost_unit_META = createCommonMeta($fxd_cost_unit, mcframe.commonMA.meta.MA_META.MONEY);
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

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dummy_site_META,
			dummy_sppl_cntry_META,
			dummy_sppl_area_META,
			dummy_itm_grp1_META,
			dummy_itm_grp2_META,
			dummy_itm_grp3_META,
			dummy_itm_grp4_META,
			dummy_itm_grp5_META,
			dummy_itm_grp6_META,
			dummy_itm_grp7_META,
			dummy_itm_grp8_META,
			dummy_itm_grp9_META,
			dummy_itm_grp10_META,
			dummy_sppl_grp1_META,
			dummy_sppl_grp2_META,
			dummy_sppl_grp3_META,
			dummy_sppl_grp4_META,
			dummy_sppl_grp5_META,
			dummy_sppl_grp6_META,
			dummy_sppl_grp7_META,
			dummy_sppl_grp8_META,
			dummy_sppl_grp9_META,
			dummy_sppl_grp10_META,
			dummy_parent_flg_META,
			dummy_child_flg_META,
			dummy_having_flg1_META,
			dummy_having_flg2_META,
			dummy_having_flg3_META,
			dummy_having_flg4_META,
			dummy_having_flg5_META,
			dummy_having_flg6_META,
			wg_cd_META,
			wg_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			loc_cd_META,
			loc_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			qty_META,
			qty_unit_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			ttl_META,
			var_cost_META,
			fxd_cost_META,
			ttl_unit_META,
			var_cost_unit_META,
			fxd_cost_unit_META,
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
			col_199_META
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
	/** 項目属性情報のグループ[FLG_COL]のキー定数 */
	public static final String $$FLG_COL = "FLG_COL";
	/** 項目属性情報のグループ[COL_SQL]のキー定数 */
	public static final String $$COL_SQL = "COL_SQL";
	/** 項目属性情報のグループ[SUM_SQL]のキー定数 */
	public static final String $$SUM_SQL = "SUM_SQL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$itm_typ, "MAC_ITM_TYP"}	// itm_typ
			}
		)),
		new MCExtMap.Entry($$FLG_COL, new MCExtList(
			new String[][]{
				{$dummy_having_flg1, "eq_zero_flg"},	// dummy_having_flg1
				{$dummy_having_flg2, "not_zero_flg"},	// dummy_having_flg2
				{$dummy_having_flg3, "lte_zero_flg"},	// dummy_having_flg3
				{$dummy_having_flg4, "gt_zero_flg"},	// dummy_having_flg4
				{$dummy_having_flg5, "lt_zero_flg"},	// dummy_having_flg5
				{$dummy_having_flg6, "gte_zero_flg"},	// dummy_having_flg6
				{$loc_cd, "loc_flg"},	// loc_cd
				{$loc_nm, "loc_flg"},	// loc_nm
				{$sppl_cd, "sppl_flg"},	// sppl_cd
				{$sppl_nm, "sppl_flg"}	// sppl_nm
			}
		)),
		new MCExtMap.Entry($$COL_SQL, new MCExtList(
			new String[][]{
				{$wg_cd, "T.WG_CD"},	// wg_cd
				{$wg_nm, "T.WG_NM"},	// wg_nm
				{$itm_cd, "T.ITM_CD"},	// itm_cd
				{$itm_sub1, "T.ITM_SUB1"},	// itm_sub1
				{$itm_sub2, "T.ITM_SUB2"},	// itm_sub2
				{$itm_sub3, "T.ITM_SUB3"},	// itm_sub3
				{$itm_nm, "T.ITM_NM"},	// itm_nm
				{$itm_typ, "T.ITM_TYP"},	// itm_typ
				{$itm_typ_d_cd, "T.ITM_TYP_D_CD"},	// itm_typ_d_cd
				{$itm_typ_d_nm, "T.ITM_TYP_D_NM"},	// itm_typ_d_nm
				{$itm_jnl_cd, "T.ITM_JNL_CD"},	// itm_jnl_cd
				{$itm_jnl_nm, "T.ITM_JNL_NM"},	// itm_jnl_nm
				{$loc_cd, "T.LOC_CD"},	// loc_cd
				{$loc_nm, "LOC.LOC_NM"},	// loc_nm
				{$sppl_cd, "T.SPPL_CD"},	// sppl_cd
				{$sppl_nm, "SPPL.BP_NM"},	// sppl_nm
				{$unit_cd, "T.UNIT_CD"},	// unit_cd
				{$unit_nm, "T.UNIT_NM"},	// unit_nm
				{$dec_place, "T.DEC_PLACE"}	// dec_place
			}
		)),
		new MCExtMap.Entry($$SUM_SQL, new MCExtList(
			new String[][]{
				{$ttl, "NVL(SUM(T.STD_COST),0)"},	// ttl
				{$var_cost, "NVL(SUM(DECODE(T.VAR_TYP,MAC_VAR_TYP.VAR,T.STD_COST,0)),0)"},	// var_cost
				{$fxd_cost, "NVL(SUM(DECODE(T.VAR_TYP,MAC_VAR_TYP.FXD,T.STD_COST,0)),0)"},	// fxd_cost
				{$col_000, "CUSTOM_SUM_COL"},	// col_000
				{$col_001, "CUSTOM_SUM_COL"},	// col_001
				{$col_002, "CUSTOM_SUM_COL"},	// col_002
				{$col_003, "CUSTOM_SUM_COL"},	// col_003
				{$col_004, "CUSTOM_SUM_COL"},	// col_004
				{$col_005, "CUSTOM_SUM_COL"},	// col_005
				{$col_006, "CUSTOM_SUM_COL"},	// col_006
				{$col_007, "CUSTOM_SUM_COL"},	// col_007
				{$col_008, "CUSTOM_SUM_COL"},	// col_008
				{$col_009, "CUSTOM_SUM_COL"},	// col_009
				{$col_010, "CUSTOM_SUM_COL"},	// col_010
				{$col_011, "CUSTOM_SUM_COL"},	// col_011
				{$col_012, "CUSTOM_SUM_COL"},	// col_012
				{$col_013, "CUSTOM_SUM_COL"},	// col_013
				{$col_014, "CUSTOM_SUM_COL"},	// col_014
				{$col_015, "CUSTOM_SUM_COL"},	// col_015
				{$col_016, "CUSTOM_SUM_COL"},	// col_016
				{$col_017, "CUSTOM_SUM_COL"},	// col_017
				{$col_018, "CUSTOM_SUM_COL"},	// col_018
				{$col_019, "CUSTOM_SUM_COL"},	// col_019
				{$col_020, "CUSTOM_SUM_COL"},	// col_020
				{$col_021, "CUSTOM_SUM_COL"},	// col_021
				{$col_022, "CUSTOM_SUM_COL"},	// col_022
				{$col_023, "CUSTOM_SUM_COL"},	// col_023
				{$col_024, "CUSTOM_SUM_COL"},	// col_024
				{$col_025, "CUSTOM_SUM_COL"},	// col_025
				{$col_026, "CUSTOM_SUM_COL"},	// col_026
				{$col_027, "CUSTOM_SUM_COL"},	// col_027
				{$col_028, "CUSTOM_SUM_COL"},	// col_028
				{$col_029, "CUSTOM_SUM_COL"},	// col_029
				{$col_030, "CUSTOM_SUM_COL"},	// col_030
				{$col_031, "CUSTOM_SUM_COL"},	// col_031
				{$col_032, "CUSTOM_SUM_COL"},	// col_032
				{$col_033, "CUSTOM_SUM_COL"},	// col_033
				{$col_034, "CUSTOM_SUM_COL"},	// col_034
				{$col_035, "CUSTOM_SUM_COL"},	// col_035
				{$col_036, "CUSTOM_SUM_COL"},	// col_036
				{$col_037, "CUSTOM_SUM_COL"},	// col_037
				{$col_038, "CUSTOM_SUM_COL"},	// col_038
				{$col_039, "CUSTOM_SUM_COL"},	// col_039
				{$col_040, "CUSTOM_SUM_COL"},	// col_040
				{$col_041, "CUSTOM_SUM_COL"},	// col_041
				{$col_042, "CUSTOM_SUM_COL"},	// col_042
				{$col_043, "CUSTOM_SUM_COL"},	// col_043
				{$col_044, "CUSTOM_SUM_COL"},	// col_044
				{$col_045, "CUSTOM_SUM_COL"},	// col_045
				{$col_046, "CUSTOM_SUM_COL"},	// col_046
				{$col_047, "CUSTOM_SUM_COL"},	// col_047
				{$col_048, "CUSTOM_SUM_COL"},	// col_048
				{$col_049, "CUSTOM_SUM_COL"},	// col_049
				{$col_050, "CUSTOM_SUM_COL"},	// col_050
				{$col_051, "CUSTOM_SUM_COL"},	// col_051
				{$col_052, "CUSTOM_SUM_COL"},	// col_052
				{$col_053, "CUSTOM_SUM_COL"},	// col_053
				{$col_054, "CUSTOM_SUM_COL"},	// col_054
				{$col_055, "CUSTOM_SUM_COL"},	// col_055
				{$col_056, "CUSTOM_SUM_COL"},	// col_056
				{$col_057, "CUSTOM_SUM_COL"},	// col_057
				{$col_058, "CUSTOM_SUM_COL"},	// col_058
				{$col_059, "CUSTOM_SUM_COL"},	// col_059
				{$col_060, "CUSTOM_SUM_COL"},	// col_060
				{$col_061, "CUSTOM_SUM_COL"},	// col_061
				{$col_062, "CUSTOM_SUM_COL"},	// col_062
				{$col_063, "CUSTOM_SUM_COL"},	// col_063
				{$col_064, "CUSTOM_SUM_COL"},	// col_064
				{$col_065, "CUSTOM_SUM_COL"},	// col_065
				{$col_066, "CUSTOM_SUM_COL"},	// col_066
				{$col_067, "CUSTOM_SUM_COL"},	// col_067
				{$col_068, "CUSTOM_SUM_COL"},	// col_068
				{$col_069, "CUSTOM_SUM_COL"},	// col_069
				{$col_070, "CUSTOM_SUM_COL"},	// col_070
				{$col_071, "CUSTOM_SUM_COL"},	// col_071
				{$col_072, "CUSTOM_SUM_COL"},	// col_072
				{$col_073, "CUSTOM_SUM_COL"},	// col_073
				{$col_074, "CUSTOM_SUM_COL"},	// col_074
				{$col_075, "CUSTOM_SUM_COL"},	// col_075
				{$col_076, "CUSTOM_SUM_COL"},	// col_076
				{$col_077, "CUSTOM_SUM_COL"},	// col_077
				{$col_078, "CUSTOM_SUM_COL"},	// col_078
				{$col_079, "CUSTOM_SUM_COL"},	// col_079
				{$col_080, "CUSTOM_SUM_COL"},	// col_080
				{$col_081, "CUSTOM_SUM_COL"},	// col_081
				{$col_082, "CUSTOM_SUM_COL"},	// col_082
				{$col_083, "CUSTOM_SUM_COL"},	// col_083
				{$col_084, "CUSTOM_SUM_COL"},	// col_084
				{$col_085, "CUSTOM_SUM_COL"},	// col_085
				{$col_086, "CUSTOM_SUM_COL"},	// col_086
				{$col_087, "CUSTOM_SUM_COL"},	// col_087
				{$col_088, "CUSTOM_SUM_COL"},	// col_088
				{$col_089, "CUSTOM_SUM_COL"},	// col_089
				{$col_090, "CUSTOM_SUM_COL"},	// col_090
				{$col_091, "CUSTOM_SUM_COL"},	// col_091
				{$col_092, "CUSTOM_SUM_COL"},	// col_092
				{$col_093, "CUSTOM_SUM_COL"},	// col_093
				{$col_094, "CUSTOM_SUM_COL"},	// col_094
				{$col_095, "CUSTOM_SUM_COL"},	// col_095
				{$col_096, "CUSTOM_SUM_COL"},	// col_096
				{$col_097, "CUSTOM_SUM_COL"},	// col_097
				{$col_098, "CUSTOM_SUM_COL"},	// col_098
				{$col_099, "CUSTOM_SUM_COL"},	// col_099
				{$col_100, "CUSTOM_SUM_COL"},	// col_100
				{$col_101, "CUSTOM_SUM_COL"},	// col_101
				{$col_102, "CUSTOM_SUM_COL"},	// col_102
				{$col_103, "CUSTOM_SUM_COL"},	// col_103
				{$col_104, "CUSTOM_SUM_COL"},	// col_104
				{$col_105, "CUSTOM_SUM_COL"},	// col_105
				{$col_106, "CUSTOM_SUM_COL"},	// col_106
				{$col_107, "CUSTOM_SUM_COL"},	// col_107
				{$col_108, "CUSTOM_SUM_COL"},	// col_108
				{$col_109, "CUSTOM_SUM_COL"},	// col_109
				{$col_110, "CUSTOM_SUM_COL"},	// col_110
				{$col_111, "CUSTOM_SUM_COL"},	// col_111
				{$col_112, "CUSTOM_SUM_COL"},	// col_112
				{$col_113, "CUSTOM_SUM_COL"},	// col_113
				{$col_114, "CUSTOM_SUM_COL"},	// col_114
				{$col_115, "CUSTOM_SUM_COL"},	// col_115
				{$col_116, "CUSTOM_SUM_COL"},	// col_116
				{$col_117, "CUSTOM_SUM_COL"},	// col_117
				{$col_118, "CUSTOM_SUM_COL"},	// col_118
				{$col_119, "CUSTOM_SUM_COL"},	// col_119
				{$col_120, "CUSTOM_SUM_COL"},	// col_120
				{$col_121, "CUSTOM_SUM_COL"},	// col_121
				{$col_122, "CUSTOM_SUM_COL"},	// col_122
				{$col_123, "CUSTOM_SUM_COL"},	// col_123
				{$col_124, "CUSTOM_SUM_COL"},	// col_124
				{$col_125, "CUSTOM_SUM_COL"},	// col_125
				{$col_126, "CUSTOM_SUM_COL"},	// col_126
				{$col_127, "CUSTOM_SUM_COL"},	// col_127
				{$col_128, "CUSTOM_SUM_COL"},	// col_128
				{$col_129, "CUSTOM_SUM_COL"},	// col_129
				{$col_130, "CUSTOM_SUM_COL"},	// col_130
				{$col_131, "CUSTOM_SUM_COL"},	// col_131
				{$col_132, "CUSTOM_SUM_COL"},	// col_132
				{$col_133, "CUSTOM_SUM_COL"},	// col_133
				{$col_134, "CUSTOM_SUM_COL"},	// col_134
				{$col_135, "CUSTOM_SUM_COL"},	// col_135
				{$col_136, "CUSTOM_SUM_COL"},	// col_136
				{$col_137, "CUSTOM_SUM_COL"},	// col_137
				{$col_138, "CUSTOM_SUM_COL"},	// col_138
				{$col_139, "CUSTOM_SUM_COL"},	// col_139
				{$col_140, "CUSTOM_SUM_COL"},	// col_140
				{$col_141, "CUSTOM_SUM_COL"},	// col_141
				{$col_142, "CUSTOM_SUM_COL"},	// col_142
				{$col_143, "CUSTOM_SUM_COL"},	// col_143
				{$col_144, "CUSTOM_SUM_COL"},	// col_144
				{$col_145, "CUSTOM_SUM_COL"},	// col_145
				{$col_146, "CUSTOM_SUM_COL"},	// col_146
				{$col_147, "CUSTOM_SUM_COL"},	// col_147
				{$col_148, "CUSTOM_SUM_COL"},	// col_148
				{$col_149, "CUSTOM_SUM_COL"},	// col_149
				{$col_150, "CUSTOM_SUM_COL"},	// col_150
				{$col_151, "CUSTOM_SUM_COL"},	// col_151
				{$col_152, "CUSTOM_SUM_COL"},	// col_152
				{$col_153, "CUSTOM_SUM_COL"},	// col_153
				{$col_154, "CUSTOM_SUM_COL"},	// col_154
				{$col_155, "CUSTOM_SUM_COL"},	// col_155
				{$col_156, "CUSTOM_SUM_COL"},	// col_156
				{$col_157, "CUSTOM_SUM_COL"},	// col_157
				{$col_158, "CUSTOM_SUM_COL"},	// col_158
				{$col_159, "CUSTOM_SUM_COL"},	// col_159
				{$col_160, "CUSTOM_SUM_COL"},	// col_160
				{$col_161, "CUSTOM_SUM_COL"},	// col_161
				{$col_162, "CUSTOM_SUM_COL"},	// col_162
				{$col_163, "CUSTOM_SUM_COL"},	// col_163
				{$col_164, "CUSTOM_SUM_COL"},	// col_164
				{$col_165, "CUSTOM_SUM_COL"},	// col_165
				{$col_166, "CUSTOM_SUM_COL"},	// col_166
				{$col_167, "CUSTOM_SUM_COL"},	// col_167
				{$col_168, "CUSTOM_SUM_COL"},	// col_168
				{$col_169, "CUSTOM_SUM_COL"},	// col_169
				{$col_170, "CUSTOM_SUM_COL"},	// col_170
				{$col_171, "CUSTOM_SUM_COL"},	// col_171
				{$col_172, "CUSTOM_SUM_COL"},	// col_172
				{$col_173, "CUSTOM_SUM_COL"},	// col_173
				{$col_174, "CUSTOM_SUM_COL"},	// col_174
				{$col_175, "CUSTOM_SUM_COL"},	// col_175
				{$col_176, "CUSTOM_SUM_COL"},	// col_176
				{$col_177, "CUSTOM_SUM_COL"},	// col_177
				{$col_178, "CUSTOM_SUM_COL"},	// col_178
				{$col_179, "CUSTOM_SUM_COL"},	// col_179
				{$col_180, "CUSTOM_SUM_COL"},	// col_180
				{$col_181, "CUSTOM_SUM_COL"},	// col_181
				{$col_182, "CUSTOM_SUM_COL"},	// col_182
				{$col_183, "CUSTOM_SUM_COL"},	// col_183
				{$col_184, "CUSTOM_SUM_COL"},	// col_184
				{$col_185, "CUSTOM_SUM_COL"},	// col_185
				{$col_186, "CUSTOM_SUM_COL"},	// col_186
				{$col_187, "CUSTOM_SUM_COL"},	// col_187
				{$col_188, "CUSTOM_SUM_COL"},	// col_188
				{$col_189, "CUSTOM_SUM_COL"},	// col_189
				{$col_190, "CUSTOM_SUM_COL"},	// col_190
				{$col_191, "CUSTOM_SUM_COL"},	// col_191
				{$col_192, "CUSTOM_SUM_COL"},	// col_192
				{$col_193, "CUSTOM_SUM_COL"},	// col_193
				{$col_194, "CUSTOM_SUM_COL"},	// col_194
				{$col_195, "CUSTOM_SUM_COL"},	// col_195
				{$col_196, "CUSTOM_SUM_COL"},	// col_196
				{$col_197, "CUSTOM_SUM_COL"},	// col_197
				{$col_198, "CUSTOM_SUM_COL"},	// col_198
				{$col_199, "CUSTOM_SUM_COL"}	// col_199
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Factory/Distribution warehouse master (Dummy for join) 工場・物流倉庫マスタ（結合用ダミー）.<p>
	 *
	 */
	public String dummy_site() {
		return getConstString(offset + 0, $dummy_site);
	}

	/**
	 * Factory/Distribution warehouse master (Dummy for join) 工場・物流倉庫マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_site(String value) {
		setConstString(offset + 0, $dummy_site, value);
	}


	/**
	 * Country master (Supplier) (Dummy for join) 国マスタ（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_cntry() {
		return getConstString(offset + 1, $dummy_sppl_cntry);
	}

	/**
	 * Country master (Supplier) (Dummy for join) 国マスタ（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_cntry(String value) {
		setConstString(offset + 1, $dummy_sppl_cntry, value);
	}


	/**
	 * Region master (Supplier) (Dummy for join) 地域マスタ（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_area() {
		return getConstString(offset + 2, $dummy_sppl_area);
	}

	/**
	 * Region master (Supplier) (Dummy for join) 地域マスタ（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_area(String value) {
		setConstString(offset + 2, $dummy_sppl_area, value);
	}


	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp1() {
		return getConstString(offset + 3, $dummy_itm_grp1);
	}

	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp1(String value) {
		setConstString(offset + 3, $dummy_itm_grp1, value);
	}


	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp2() {
		return getConstString(offset + 4, $dummy_itm_grp2);
	}

	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp2(String value) {
		setConstString(offset + 4, $dummy_itm_grp2, value);
	}


	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp3() {
		return getConstString(offset + 5, $dummy_itm_grp3);
	}

	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp3(String value) {
		setConstString(offset + 5, $dummy_itm_grp3, value);
	}


	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp4() {
		return getConstString(offset + 6, $dummy_itm_grp4);
	}

	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp4(String value) {
		setConstString(offset + 6, $dummy_itm_grp4, value);
	}


	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp5() {
		return getConstString(offset + 7, $dummy_itm_grp5);
	}

	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp5(String value) {
		setConstString(offset + 7, $dummy_itm_grp5, value);
	}


	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp6() {
		return getConstString(offset + 8, $dummy_itm_grp6);
	}

	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp6(String value) {
		setConstString(offset + 8, $dummy_itm_grp6, value);
	}


	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp7() {
		return getConstString(offset + 9, $dummy_itm_grp7);
	}

	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp7(String value) {
		setConstString(offset + 9, $dummy_itm_grp7, value);
	}


	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp8() {
		return getConstString(offset + 10, $dummy_itm_grp8);
	}

	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp8(String value) {
		setConstString(offset + 10, $dummy_itm_grp8, value);
	}


	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp9() {
		return getConstString(offset + 11, $dummy_itm_grp9);
	}

	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp9(String value) {
		setConstString(offset + 11, $dummy_itm_grp9, value);
	}


	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp10() {
		return getConstString(offset + 12, $dummy_itm_grp10);
	}

	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp10(String value) {
		setConstString(offset + 12, $dummy_itm_grp10, value);
	}


	/**
	 * BP classification master 1 (Supplier) (Dummy for join) 取引先分類マスタ１（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp1() {
		return getConstString(offset + 13, $dummy_sppl_grp1);
	}

	/**
	 * BP classification master 1 (Supplier) (Dummy for join) 取引先分類マスタ１（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp1(String value) {
		setConstString(offset + 13, $dummy_sppl_grp1, value);
	}


	/**
	 * BP classification master 2 (Supplier) (Dummy for join) 取引先分類マスタ２（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp2() {
		return getConstString(offset + 14, $dummy_sppl_grp2);
	}

	/**
	 * BP classification master 2 (Supplier) (Dummy for join) 取引先分類マスタ２（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp2(String value) {
		setConstString(offset + 14, $dummy_sppl_grp2, value);
	}


	/**
	 * BP classification master 3 (Supplier) (Dummy for join) 取引先分類マスタ３（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp3() {
		return getConstString(offset + 15, $dummy_sppl_grp3);
	}

	/**
	 * BP classification master 3 (Supplier) (Dummy for join) 取引先分類マスタ３（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp3(String value) {
		setConstString(offset + 15, $dummy_sppl_grp3, value);
	}


	/**
	 * BP classification master 4 (Supplier) (Dummy for join) 取引先分類マスタ４（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp4() {
		return getConstString(offset + 16, $dummy_sppl_grp4);
	}

	/**
	 * BP classification master 4 (Supplier) (Dummy for join) 取引先分類マスタ４（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp4(String value) {
		setConstString(offset + 16, $dummy_sppl_grp4, value);
	}


	/**
	 * BP classification master 5 (Supplier) (Dummy for join) 取引先分類マスタ５（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp5() {
		return getConstString(offset + 17, $dummy_sppl_grp5);
	}

	/**
	 * BP classification master 5 (Supplier) (Dummy for join) 取引先分類マスタ５（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp5(String value) {
		setConstString(offset + 17, $dummy_sppl_grp5, value);
	}


	/**
	 * BP classification master 6 (Supplier) (Dummy for join) 取引先分類マスタ６（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp6() {
		return getConstString(offset + 18, $dummy_sppl_grp6);
	}

	/**
	 * BP classification master 6 (Supplier) (Dummy for join) 取引先分類マスタ６（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp6(String value) {
		setConstString(offset + 18, $dummy_sppl_grp6, value);
	}


	/**
	 * BP classification master 7 (Supplier) (Dummy for join) 取引先分類マスタ７（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp7() {
		return getConstString(offset + 19, $dummy_sppl_grp7);
	}

	/**
	 * BP classification master 7 (Supplier) (Dummy for join) 取引先分類マスタ７（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp7(String value) {
		setConstString(offset + 19, $dummy_sppl_grp7, value);
	}


	/**
	 * BP classification master 8 (Supplier) (Dummy for join) 取引先分類マスタ８（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp8() {
		return getConstString(offset + 20, $dummy_sppl_grp8);
	}

	/**
	 * BP classification master 8 (Supplier) (Dummy for join) 取引先分類マスタ８（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp8(String value) {
		setConstString(offset + 20, $dummy_sppl_grp8, value);
	}


	/**
	 * BP classification master 9 (Supplier) (Dummy for join) 取引先分類マスタ９（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp9() {
		return getConstString(offset + 21, $dummy_sppl_grp9);
	}

	/**
	 * BP classification master 9 (Supplier) (Dummy for join) 取引先分類マスタ９（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp9(String value) {
		setConstString(offset + 21, $dummy_sppl_grp9, value);
	}


	/**
	 * BP classification master 10 (Supplier) (Dummy for join) 取引先分類マスタ１０（発注先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_sppl_grp10() {
		return getConstString(offset + 22, $dummy_sppl_grp10);
	}

	/**
	 * BP classification master 10 (Supplier) (Dummy for join) 取引先分類マスタ１０（発注先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_sppl_grp10(String value) {
		setConstString(offset + 22, $dummy_sppl_grp10, value);
	}


	/**
	 * Dummy for adding search criteria in parent item specification 親品目指定時検索条件追加用ダミー.<p>
	 *
	 */
	public boolean dummy_parent_flg() {
		return getConstBoolean(offset + 23, $dummy_parent_flg);
	}

	/**
	 * Dummy for adding search criteria in parent item specification 親品目指定時検索条件追加用ダミー.<p>
	 *
	 */
	public void dummy_parent_flg(boolean value) {
		setConstBoolean(offset + 23, $dummy_parent_flg, value);
	}


	/**
	 * Dummy for adding search criteria in child item specification 子品目指定時検索条件追加用ダミー.<p>
	 *
	 */
	public boolean dummy_child_flg() {
		return getConstBoolean(offset + 24, $dummy_child_flg);
	}

	/**
	 * Dummy for adding search criteria in child item specification 子品目指定時検索条件追加用ダミー.<p>
	 *
	 */
	public void dummy_child_flg(boolean value) {
		setConstBoolean(offset + 24, $dummy_child_flg, value);
	}


	/**
	 * Dummy for adding HAVING clause HAVING句追加用ダミー.<p>
	 *
	 */
	public boolean dummy_having_flg1() {
		return getConstBoolean(offset + 25, $dummy_having_flg1);
	}

	/**
	 * Dummy for adding HAVING clause HAVING句追加用ダミー.<p>
	 *
	 */
	public void dummy_having_flg1(boolean value) {
		setConstBoolean(offset + 25, $dummy_having_flg1, value);
	}


	/**
	 * Dummy for adding HAVING clause HAVING句追加用ダミー.<p>
	 *
	 */
	public boolean dummy_having_flg2() {
		return getConstBoolean(offset + 26, $dummy_having_flg2);
	}

	/**
	 * Dummy for adding HAVING clause HAVING句追加用ダミー.<p>
	 *
	 */
	public void dummy_having_flg2(boolean value) {
		setConstBoolean(offset + 26, $dummy_having_flg2, value);
	}


	/**
	 * Dummy for adding HAVING clause HAVING句追加用ダミー.<p>
	 *
	 */
	public boolean dummy_having_flg3() {
		return getConstBoolean(offset + 27, $dummy_having_flg3);
	}

	/**
	 * Dummy for adding HAVING clause HAVING句追加用ダミー.<p>
	 *
	 */
	public void dummy_having_flg3(boolean value) {
		setConstBoolean(offset + 27, $dummy_having_flg3, value);
	}


	/**
	 * Dummy for adding HAVING clause HAVING句追加用ダミー.<p>
	 *
	 */
	public boolean dummy_having_flg4() {
		return getConstBoolean(offset + 28, $dummy_having_flg4);
	}

	/**
	 * Dummy for adding HAVING clause HAVING句追加用ダミー.<p>
	 *
	 */
	public void dummy_having_flg4(boolean value) {
		setConstBoolean(offset + 28, $dummy_having_flg4, value);
	}


	/**
	 * Dummy for adding HAVING clause HAVING句追加用ダミー.<p>
	 *
	 */
	public boolean dummy_having_flg5() {
		return getConstBoolean(offset + 29, $dummy_having_flg5);
	}

	/**
	 * Dummy for adding HAVING clause HAVING句追加用ダミー.<p>
	 *
	 */
	public void dummy_having_flg5(boolean value) {
		setConstBoolean(offset + 29, $dummy_having_flg5, value);
	}


	/**
	 * Dummy for adding HAVING clause HAVING句追加用ダミー.<p>
	 *
	 */
	public boolean dummy_having_flg6() {
		return getConstBoolean(offset + 30, $dummy_having_flg6);
	}

	/**
	 * Dummy for adding HAVING clause HAVING句追加用ダミー.<p>
	 *
	 */
	public void dummy_having_flg6(boolean value) {
		setConstBoolean(offset + 30, $dummy_having_flg6, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 31, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 31, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 32, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 32, $wg_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 33, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 33, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 34, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 34, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 35, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 35, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 36, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 36, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 37, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 37, $itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 38, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 38, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 39, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 39, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 40, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 40, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 41, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 41, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 42, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 42, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 43, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 43, $itm_jnl_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 44, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 44, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 45, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 45, $loc_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 46, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 46, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 47, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 47, $sppl_nm, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 48, $qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 48, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 48, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 48, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 48, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 48, $qty, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber qty_unit() {
		return getConstNumber(offset + 49, $qty_unit);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty_unit(MCNumber value) {
		setConstNumber(offset + 49, $qty_unit, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty_unit(int value) {
		setConstNumber(offset + 49, $qty_unit, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty_unit(long value) {
		setConstNumber(offset + 49, $qty_unit, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty_unit(float value) {
		setConstNumber(offset + 49, $qty_unit, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty_unit(double value) {
		setConstNumber(offset + 49, $qty_unit, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 50, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 50, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 51, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 51, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 52, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 52, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 52, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 52, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 52, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 52, $dec_place, value);
	}


	/**
	 * Total 合計.<p>
	 *
	 */
	public MCNumber ttl() {
		return getConstNumber(offset + 53, $ttl);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(MCNumber value) {
		setConstNumber(offset + 53, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(int value) {
		setConstNumber(offset + 53, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(long value) {
		setConstNumber(offset + 53, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(float value) {
		setConstNumber(offset + 53, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(double value) {
		setConstNumber(offset + 53, $ttl, value);
	}


	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public MCNumber var_cost() {
		return getConstNumber(offset + 54, $var_cost);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(MCNumber value) {
		setConstNumber(offset + 54, $var_cost, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(int value) {
		setConstNumber(offset + 54, $var_cost, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(long value) {
		setConstNumber(offset + 54, $var_cost, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(float value) {
		setConstNumber(offset + 54, $var_cost, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(double value) {
		setConstNumber(offset + 54, $var_cost, value);
	}


	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public MCNumber fxd_cost() {
		return getConstNumber(offset + 55, $fxd_cost);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(MCNumber value) {
		setConstNumber(offset + 55, $fxd_cost, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(int value) {
		setConstNumber(offset + 55, $fxd_cost, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(long value) {
		setConstNumber(offset + 55, $fxd_cost, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(float value) {
		setConstNumber(offset + 55, $fxd_cost, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(double value) {
		setConstNumber(offset + 55, $fxd_cost, value);
	}


	/**
	 * Total 合計.<p>
	 *
	 */
	public MCNumber ttl_unit() {
		return getConstNumber(offset + 56, $ttl_unit);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl_unit(MCNumber value) {
		setConstNumber(offset + 56, $ttl_unit, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl_unit(int value) {
		setConstNumber(offset + 56, $ttl_unit, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl_unit(long value) {
		setConstNumber(offset + 56, $ttl_unit, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl_unit(float value) {
		setConstNumber(offset + 56, $ttl_unit, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl_unit(double value) {
		setConstNumber(offset + 56, $ttl_unit, value);
	}


	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public MCNumber var_cost_unit() {
		return getConstNumber(offset + 57, $var_cost_unit);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost_unit(MCNumber value) {
		setConstNumber(offset + 57, $var_cost_unit, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost_unit(int value) {
		setConstNumber(offset + 57, $var_cost_unit, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost_unit(long value) {
		setConstNumber(offset + 57, $var_cost_unit, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost_unit(float value) {
		setConstNumber(offset + 57, $var_cost_unit, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost_unit(double value) {
		setConstNumber(offset + 57, $var_cost_unit, value);
	}


	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public MCNumber fxd_cost_unit() {
		return getConstNumber(offset + 58, $fxd_cost_unit);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost_unit(MCNumber value) {
		setConstNumber(offset + 58, $fxd_cost_unit, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost_unit(int value) {
		setConstNumber(offset + 58, $fxd_cost_unit, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost_unit(long value) {
		setConstNumber(offset + 58, $fxd_cost_unit, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost_unit(float value) {
		setConstNumber(offset + 58, $fxd_cost_unit, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost_unit(double value) {
		setConstNumber(offset + 58, $fxd_cost_unit, value);
	}


	public MCNumber col_000() {
		return getConstNumber(offset + 59, $col_000);
	}

	public void col_000(MCNumber value) {
		setConstNumber(offset + 59, $col_000, value);
	}

	public void col_000(int value) {
		setConstNumber(offset + 59, $col_000, value);
	}

	public void col_000(long value) {
		setConstNumber(offset + 59, $col_000, value);
	}

	public void col_000(float value) {
		setConstNumber(offset + 59, $col_000, value);
	}

	public void col_000(double value) {
		setConstNumber(offset + 59, $col_000, value);
	}


	public MCNumber col_001() {
		return getConstNumber(offset + 60, $col_001);
	}

	public void col_001(MCNumber value) {
		setConstNumber(offset + 60, $col_001, value);
	}

	public void col_001(int value) {
		setConstNumber(offset + 60, $col_001, value);
	}

	public void col_001(long value) {
		setConstNumber(offset + 60, $col_001, value);
	}

	public void col_001(float value) {
		setConstNumber(offset + 60, $col_001, value);
	}

	public void col_001(double value) {
		setConstNumber(offset + 60, $col_001, value);
	}


	public MCNumber col_002() {
		return getConstNumber(offset + 61, $col_002);
	}

	public void col_002(MCNumber value) {
		setConstNumber(offset + 61, $col_002, value);
	}

	public void col_002(int value) {
		setConstNumber(offset + 61, $col_002, value);
	}

	public void col_002(long value) {
		setConstNumber(offset + 61, $col_002, value);
	}

	public void col_002(float value) {
		setConstNumber(offset + 61, $col_002, value);
	}

	public void col_002(double value) {
		setConstNumber(offset + 61, $col_002, value);
	}


	public MCNumber col_003() {
		return getConstNumber(offset + 62, $col_003);
	}

	public void col_003(MCNumber value) {
		setConstNumber(offset + 62, $col_003, value);
	}

	public void col_003(int value) {
		setConstNumber(offset + 62, $col_003, value);
	}

	public void col_003(long value) {
		setConstNumber(offset + 62, $col_003, value);
	}

	public void col_003(float value) {
		setConstNumber(offset + 62, $col_003, value);
	}

	public void col_003(double value) {
		setConstNumber(offset + 62, $col_003, value);
	}


	public MCNumber col_004() {
		return getConstNumber(offset + 63, $col_004);
	}

	public void col_004(MCNumber value) {
		setConstNumber(offset + 63, $col_004, value);
	}

	public void col_004(int value) {
		setConstNumber(offset + 63, $col_004, value);
	}

	public void col_004(long value) {
		setConstNumber(offset + 63, $col_004, value);
	}

	public void col_004(float value) {
		setConstNumber(offset + 63, $col_004, value);
	}

	public void col_004(double value) {
		setConstNumber(offset + 63, $col_004, value);
	}


	public MCNumber col_005() {
		return getConstNumber(offset + 64, $col_005);
	}

	public void col_005(MCNumber value) {
		setConstNumber(offset + 64, $col_005, value);
	}

	public void col_005(int value) {
		setConstNumber(offset + 64, $col_005, value);
	}

	public void col_005(long value) {
		setConstNumber(offset + 64, $col_005, value);
	}

	public void col_005(float value) {
		setConstNumber(offset + 64, $col_005, value);
	}

	public void col_005(double value) {
		setConstNumber(offset + 64, $col_005, value);
	}


	public MCNumber col_006() {
		return getConstNumber(offset + 65, $col_006);
	}

	public void col_006(MCNumber value) {
		setConstNumber(offset + 65, $col_006, value);
	}

	public void col_006(int value) {
		setConstNumber(offset + 65, $col_006, value);
	}

	public void col_006(long value) {
		setConstNumber(offset + 65, $col_006, value);
	}

	public void col_006(float value) {
		setConstNumber(offset + 65, $col_006, value);
	}

	public void col_006(double value) {
		setConstNumber(offset + 65, $col_006, value);
	}


	public MCNumber col_007() {
		return getConstNumber(offset + 66, $col_007);
	}

	public void col_007(MCNumber value) {
		setConstNumber(offset + 66, $col_007, value);
	}

	public void col_007(int value) {
		setConstNumber(offset + 66, $col_007, value);
	}

	public void col_007(long value) {
		setConstNumber(offset + 66, $col_007, value);
	}

	public void col_007(float value) {
		setConstNumber(offset + 66, $col_007, value);
	}

	public void col_007(double value) {
		setConstNumber(offset + 66, $col_007, value);
	}


	public MCNumber col_008() {
		return getConstNumber(offset + 67, $col_008);
	}

	public void col_008(MCNumber value) {
		setConstNumber(offset + 67, $col_008, value);
	}

	public void col_008(int value) {
		setConstNumber(offset + 67, $col_008, value);
	}

	public void col_008(long value) {
		setConstNumber(offset + 67, $col_008, value);
	}

	public void col_008(float value) {
		setConstNumber(offset + 67, $col_008, value);
	}

	public void col_008(double value) {
		setConstNumber(offset + 67, $col_008, value);
	}


	public MCNumber col_009() {
		return getConstNumber(offset + 68, $col_009);
	}

	public void col_009(MCNumber value) {
		setConstNumber(offset + 68, $col_009, value);
	}

	public void col_009(int value) {
		setConstNumber(offset + 68, $col_009, value);
	}

	public void col_009(long value) {
		setConstNumber(offset + 68, $col_009, value);
	}

	public void col_009(float value) {
		setConstNumber(offset + 68, $col_009, value);
	}

	public void col_009(double value) {
		setConstNumber(offset + 68, $col_009, value);
	}


	public MCNumber col_010() {
		return getConstNumber(offset + 69, $col_010);
	}

	public void col_010(MCNumber value) {
		setConstNumber(offset + 69, $col_010, value);
	}

	public void col_010(int value) {
		setConstNumber(offset + 69, $col_010, value);
	}

	public void col_010(long value) {
		setConstNumber(offset + 69, $col_010, value);
	}

	public void col_010(float value) {
		setConstNumber(offset + 69, $col_010, value);
	}

	public void col_010(double value) {
		setConstNumber(offset + 69, $col_010, value);
	}


	public MCNumber col_011() {
		return getConstNumber(offset + 70, $col_011);
	}

	public void col_011(MCNumber value) {
		setConstNumber(offset + 70, $col_011, value);
	}

	public void col_011(int value) {
		setConstNumber(offset + 70, $col_011, value);
	}

	public void col_011(long value) {
		setConstNumber(offset + 70, $col_011, value);
	}

	public void col_011(float value) {
		setConstNumber(offset + 70, $col_011, value);
	}

	public void col_011(double value) {
		setConstNumber(offset + 70, $col_011, value);
	}


	public MCNumber col_012() {
		return getConstNumber(offset + 71, $col_012);
	}

	public void col_012(MCNumber value) {
		setConstNumber(offset + 71, $col_012, value);
	}

	public void col_012(int value) {
		setConstNumber(offset + 71, $col_012, value);
	}

	public void col_012(long value) {
		setConstNumber(offset + 71, $col_012, value);
	}

	public void col_012(float value) {
		setConstNumber(offset + 71, $col_012, value);
	}

	public void col_012(double value) {
		setConstNumber(offset + 71, $col_012, value);
	}


	public MCNumber col_013() {
		return getConstNumber(offset + 72, $col_013);
	}

	public void col_013(MCNumber value) {
		setConstNumber(offset + 72, $col_013, value);
	}

	public void col_013(int value) {
		setConstNumber(offset + 72, $col_013, value);
	}

	public void col_013(long value) {
		setConstNumber(offset + 72, $col_013, value);
	}

	public void col_013(float value) {
		setConstNumber(offset + 72, $col_013, value);
	}

	public void col_013(double value) {
		setConstNumber(offset + 72, $col_013, value);
	}


	public MCNumber col_014() {
		return getConstNumber(offset + 73, $col_014);
	}

	public void col_014(MCNumber value) {
		setConstNumber(offset + 73, $col_014, value);
	}

	public void col_014(int value) {
		setConstNumber(offset + 73, $col_014, value);
	}

	public void col_014(long value) {
		setConstNumber(offset + 73, $col_014, value);
	}

	public void col_014(float value) {
		setConstNumber(offset + 73, $col_014, value);
	}

	public void col_014(double value) {
		setConstNumber(offset + 73, $col_014, value);
	}


	public MCNumber col_015() {
		return getConstNumber(offset + 74, $col_015);
	}

	public void col_015(MCNumber value) {
		setConstNumber(offset + 74, $col_015, value);
	}

	public void col_015(int value) {
		setConstNumber(offset + 74, $col_015, value);
	}

	public void col_015(long value) {
		setConstNumber(offset + 74, $col_015, value);
	}

	public void col_015(float value) {
		setConstNumber(offset + 74, $col_015, value);
	}

	public void col_015(double value) {
		setConstNumber(offset + 74, $col_015, value);
	}


	public MCNumber col_016() {
		return getConstNumber(offset + 75, $col_016);
	}

	public void col_016(MCNumber value) {
		setConstNumber(offset + 75, $col_016, value);
	}

	public void col_016(int value) {
		setConstNumber(offset + 75, $col_016, value);
	}

	public void col_016(long value) {
		setConstNumber(offset + 75, $col_016, value);
	}

	public void col_016(float value) {
		setConstNumber(offset + 75, $col_016, value);
	}

	public void col_016(double value) {
		setConstNumber(offset + 75, $col_016, value);
	}


	public MCNumber col_017() {
		return getConstNumber(offset + 76, $col_017);
	}

	public void col_017(MCNumber value) {
		setConstNumber(offset + 76, $col_017, value);
	}

	public void col_017(int value) {
		setConstNumber(offset + 76, $col_017, value);
	}

	public void col_017(long value) {
		setConstNumber(offset + 76, $col_017, value);
	}

	public void col_017(float value) {
		setConstNumber(offset + 76, $col_017, value);
	}

	public void col_017(double value) {
		setConstNumber(offset + 76, $col_017, value);
	}


	public MCNumber col_018() {
		return getConstNumber(offset + 77, $col_018);
	}

	public void col_018(MCNumber value) {
		setConstNumber(offset + 77, $col_018, value);
	}

	public void col_018(int value) {
		setConstNumber(offset + 77, $col_018, value);
	}

	public void col_018(long value) {
		setConstNumber(offset + 77, $col_018, value);
	}

	public void col_018(float value) {
		setConstNumber(offset + 77, $col_018, value);
	}

	public void col_018(double value) {
		setConstNumber(offset + 77, $col_018, value);
	}


	public MCNumber col_019() {
		return getConstNumber(offset + 78, $col_019);
	}

	public void col_019(MCNumber value) {
		setConstNumber(offset + 78, $col_019, value);
	}

	public void col_019(int value) {
		setConstNumber(offset + 78, $col_019, value);
	}

	public void col_019(long value) {
		setConstNumber(offset + 78, $col_019, value);
	}

	public void col_019(float value) {
		setConstNumber(offset + 78, $col_019, value);
	}

	public void col_019(double value) {
		setConstNumber(offset + 78, $col_019, value);
	}


	public MCNumber col_020() {
		return getConstNumber(offset + 79, $col_020);
	}

	public void col_020(MCNumber value) {
		setConstNumber(offset + 79, $col_020, value);
	}

	public void col_020(int value) {
		setConstNumber(offset + 79, $col_020, value);
	}

	public void col_020(long value) {
		setConstNumber(offset + 79, $col_020, value);
	}

	public void col_020(float value) {
		setConstNumber(offset + 79, $col_020, value);
	}

	public void col_020(double value) {
		setConstNumber(offset + 79, $col_020, value);
	}


	public MCNumber col_021() {
		return getConstNumber(offset + 80, $col_021);
	}

	public void col_021(MCNumber value) {
		setConstNumber(offset + 80, $col_021, value);
	}

	public void col_021(int value) {
		setConstNumber(offset + 80, $col_021, value);
	}

	public void col_021(long value) {
		setConstNumber(offset + 80, $col_021, value);
	}

	public void col_021(float value) {
		setConstNumber(offset + 80, $col_021, value);
	}

	public void col_021(double value) {
		setConstNumber(offset + 80, $col_021, value);
	}


	public MCNumber col_022() {
		return getConstNumber(offset + 81, $col_022);
	}

	public void col_022(MCNumber value) {
		setConstNumber(offset + 81, $col_022, value);
	}

	public void col_022(int value) {
		setConstNumber(offset + 81, $col_022, value);
	}

	public void col_022(long value) {
		setConstNumber(offset + 81, $col_022, value);
	}

	public void col_022(float value) {
		setConstNumber(offset + 81, $col_022, value);
	}

	public void col_022(double value) {
		setConstNumber(offset + 81, $col_022, value);
	}


	public MCNumber col_023() {
		return getConstNumber(offset + 82, $col_023);
	}

	public void col_023(MCNumber value) {
		setConstNumber(offset + 82, $col_023, value);
	}

	public void col_023(int value) {
		setConstNumber(offset + 82, $col_023, value);
	}

	public void col_023(long value) {
		setConstNumber(offset + 82, $col_023, value);
	}

	public void col_023(float value) {
		setConstNumber(offset + 82, $col_023, value);
	}

	public void col_023(double value) {
		setConstNumber(offset + 82, $col_023, value);
	}


	public MCNumber col_024() {
		return getConstNumber(offset + 83, $col_024);
	}

	public void col_024(MCNumber value) {
		setConstNumber(offset + 83, $col_024, value);
	}

	public void col_024(int value) {
		setConstNumber(offset + 83, $col_024, value);
	}

	public void col_024(long value) {
		setConstNumber(offset + 83, $col_024, value);
	}

	public void col_024(float value) {
		setConstNumber(offset + 83, $col_024, value);
	}

	public void col_024(double value) {
		setConstNumber(offset + 83, $col_024, value);
	}


	public MCNumber col_025() {
		return getConstNumber(offset + 84, $col_025);
	}

	public void col_025(MCNumber value) {
		setConstNumber(offset + 84, $col_025, value);
	}

	public void col_025(int value) {
		setConstNumber(offset + 84, $col_025, value);
	}

	public void col_025(long value) {
		setConstNumber(offset + 84, $col_025, value);
	}

	public void col_025(float value) {
		setConstNumber(offset + 84, $col_025, value);
	}

	public void col_025(double value) {
		setConstNumber(offset + 84, $col_025, value);
	}


	public MCNumber col_026() {
		return getConstNumber(offset + 85, $col_026);
	}

	public void col_026(MCNumber value) {
		setConstNumber(offset + 85, $col_026, value);
	}

	public void col_026(int value) {
		setConstNumber(offset + 85, $col_026, value);
	}

	public void col_026(long value) {
		setConstNumber(offset + 85, $col_026, value);
	}

	public void col_026(float value) {
		setConstNumber(offset + 85, $col_026, value);
	}

	public void col_026(double value) {
		setConstNumber(offset + 85, $col_026, value);
	}


	public MCNumber col_027() {
		return getConstNumber(offset + 86, $col_027);
	}

	public void col_027(MCNumber value) {
		setConstNumber(offset + 86, $col_027, value);
	}

	public void col_027(int value) {
		setConstNumber(offset + 86, $col_027, value);
	}

	public void col_027(long value) {
		setConstNumber(offset + 86, $col_027, value);
	}

	public void col_027(float value) {
		setConstNumber(offset + 86, $col_027, value);
	}

	public void col_027(double value) {
		setConstNumber(offset + 86, $col_027, value);
	}


	public MCNumber col_028() {
		return getConstNumber(offset + 87, $col_028);
	}

	public void col_028(MCNumber value) {
		setConstNumber(offset + 87, $col_028, value);
	}

	public void col_028(int value) {
		setConstNumber(offset + 87, $col_028, value);
	}

	public void col_028(long value) {
		setConstNumber(offset + 87, $col_028, value);
	}

	public void col_028(float value) {
		setConstNumber(offset + 87, $col_028, value);
	}

	public void col_028(double value) {
		setConstNumber(offset + 87, $col_028, value);
	}


	public MCNumber col_029() {
		return getConstNumber(offset + 88, $col_029);
	}

	public void col_029(MCNumber value) {
		setConstNumber(offset + 88, $col_029, value);
	}

	public void col_029(int value) {
		setConstNumber(offset + 88, $col_029, value);
	}

	public void col_029(long value) {
		setConstNumber(offset + 88, $col_029, value);
	}

	public void col_029(float value) {
		setConstNumber(offset + 88, $col_029, value);
	}

	public void col_029(double value) {
		setConstNumber(offset + 88, $col_029, value);
	}


	public MCNumber col_030() {
		return getConstNumber(offset + 89, $col_030);
	}

	public void col_030(MCNumber value) {
		setConstNumber(offset + 89, $col_030, value);
	}

	public void col_030(int value) {
		setConstNumber(offset + 89, $col_030, value);
	}

	public void col_030(long value) {
		setConstNumber(offset + 89, $col_030, value);
	}

	public void col_030(float value) {
		setConstNumber(offset + 89, $col_030, value);
	}

	public void col_030(double value) {
		setConstNumber(offset + 89, $col_030, value);
	}


	public MCNumber col_031() {
		return getConstNumber(offset + 90, $col_031);
	}

	public void col_031(MCNumber value) {
		setConstNumber(offset + 90, $col_031, value);
	}

	public void col_031(int value) {
		setConstNumber(offset + 90, $col_031, value);
	}

	public void col_031(long value) {
		setConstNumber(offset + 90, $col_031, value);
	}

	public void col_031(float value) {
		setConstNumber(offset + 90, $col_031, value);
	}

	public void col_031(double value) {
		setConstNumber(offset + 90, $col_031, value);
	}


	public MCNumber col_032() {
		return getConstNumber(offset + 91, $col_032);
	}

	public void col_032(MCNumber value) {
		setConstNumber(offset + 91, $col_032, value);
	}

	public void col_032(int value) {
		setConstNumber(offset + 91, $col_032, value);
	}

	public void col_032(long value) {
		setConstNumber(offset + 91, $col_032, value);
	}

	public void col_032(float value) {
		setConstNumber(offset + 91, $col_032, value);
	}

	public void col_032(double value) {
		setConstNumber(offset + 91, $col_032, value);
	}


	public MCNumber col_033() {
		return getConstNumber(offset + 92, $col_033);
	}

	public void col_033(MCNumber value) {
		setConstNumber(offset + 92, $col_033, value);
	}

	public void col_033(int value) {
		setConstNumber(offset + 92, $col_033, value);
	}

	public void col_033(long value) {
		setConstNumber(offset + 92, $col_033, value);
	}

	public void col_033(float value) {
		setConstNumber(offset + 92, $col_033, value);
	}

	public void col_033(double value) {
		setConstNumber(offset + 92, $col_033, value);
	}


	public MCNumber col_034() {
		return getConstNumber(offset + 93, $col_034);
	}

	public void col_034(MCNumber value) {
		setConstNumber(offset + 93, $col_034, value);
	}

	public void col_034(int value) {
		setConstNumber(offset + 93, $col_034, value);
	}

	public void col_034(long value) {
		setConstNumber(offset + 93, $col_034, value);
	}

	public void col_034(float value) {
		setConstNumber(offset + 93, $col_034, value);
	}

	public void col_034(double value) {
		setConstNumber(offset + 93, $col_034, value);
	}


	public MCNumber col_035() {
		return getConstNumber(offset + 94, $col_035);
	}

	public void col_035(MCNumber value) {
		setConstNumber(offset + 94, $col_035, value);
	}

	public void col_035(int value) {
		setConstNumber(offset + 94, $col_035, value);
	}

	public void col_035(long value) {
		setConstNumber(offset + 94, $col_035, value);
	}

	public void col_035(float value) {
		setConstNumber(offset + 94, $col_035, value);
	}

	public void col_035(double value) {
		setConstNumber(offset + 94, $col_035, value);
	}


	public MCNumber col_036() {
		return getConstNumber(offset + 95, $col_036);
	}

	public void col_036(MCNumber value) {
		setConstNumber(offset + 95, $col_036, value);
	}

	public void col_036(int value) {
		setConstNumber(offset + 95, $col_036, value);
	}

	public void col_036(long value) {
		setConstNumber(offset + 95, $col_036, value);
	}

	public void col_036(float value) {
		setConstNumber(offset + 95, $col_036, value);
	}

	public void col_036(double value) {
		setConstNumber(offset + 95, $col_036, value);
	}


	public MCNumber col_037() {
		return getConstNumber(offset + 96, $col_037);
	}

	public void col_037(MCNumber value) {
		setConstNumber(offset + 96, $col_037, value);
	}

	public void col_037(int value) {
		setConstNumber(offset + 96, $col_037, value);
	}

	public void col_037(long value) {
		setConstNumber(offset + 96, $col_037, value);
	}

	public void col_037(float value) {
		setConstNumber(offset + 96, $col_037, value);
	}

	public void col_037(double value) {
		setConstNumber(offset + 96, $col_037, value);
	}


	public MCNumber col_038() {
		return getConstNumber(offset + 97, $col_038);
	}

	public void col_038(MCNumber value) {
		setConstNumber(offset + 97, $col_038, value);
	}

	public void col_038(int value) {
		setConstNumber(offset + 97, $col_038, value);
	}

	public void col_038(long value) {
		setConstNumber(offset + 97, $col_038, value);
	}

	public void col_038(float value) {
		setConstNumber(offset + 97, $col_038, value);
	}

	public void col_038(double value) {
		setConstNumber(offset + 97, $col_038, value);
	}


	public MCNumber col_039() {
		return getConstNumber(offset + 98, $col_039);
	}

	public void col_039(MCNumber value) {
		setConstNumber(offset + 98, $col_039, value);
	}

	public void col_039(int value) {
		setConstNumber(offset + 98, $col_039, value);
	}

	public void col_039(long value) {
		setConstNumber(offset + 98, $col_039, value);
	}

	public void col_039(float value) {
		setConstNumber(offset + 98, $col_039, value);
	}

	public void col_039(double value) {
		setConstNumber(offset + 98, $col_039, value);
	}


	public MCNumber col_040() {
		return getConstNumber(offset + 99, $col_040);
	}

	public void col_040(MCNumber value) {
		setConstNumber(offset + 99, $col_040, value);
	}

	public void col_040(int value) {
		setConstNumber(offset + 99, $col_040, value);
	}

	public void col_040(long value) {
		setConstNumber(offset + 99, $col_040, value);
	}

	public void col_040(float value) {
		setConstNumber(offset + 99, $col_040, value);
	}

	public void col_040(double value) {
		setConstNumber(offset + 99, $col_040, value);
	}


	public MCNumber col_041() {
		return getConstNumber(offset + 100, $col_041);
	}

	public void col_041(MCNumber value) {
		setConstNumber(offset + 100, $col_041, value);
	}

	public void col_041(int value) {
		setConstNumber(offset + 100, $col_041, value);
	}

	public void col_041(long value) {
		setConstNumber(offset + 100, $col_041, value);
	}

	public void col_041(float value) {
		setConstNumber(offset + 100, $col_041, value);
	}

	public void col_041(double value) {
		setConstNumber(offset + 100, $col_041, value);
	}


	public MCNumber col_042() {
		return getConstNumber(offset + 101, $col_042);
	}

	public void col_042(MCNumber value) {
		setConstNumber(offset + 101, $col_042, value);
	}

	public void col_042(int value) {
		setConstNumber(offset + 101, $col_042, value);
	}

	public void col_042(long value) {
		setConstNumber(offset + 101, $col_042, value);
	}

	public void col_042(float value) {
		setConstNumber(offset + 101, $col_042, value);
	}

	public void col_042(double value) {
		setConstNumber(offset + 101, $col_042, value);
	}


	public MCNumber col_043() {
		return getConstNumber(offset + 102, $col_043);
	}

	public void col_043(MCNumber value) {
		setConstNumber(offset + 102, $col_043, value);
	}

	public void col_043(int value) {
		setConstNumber(offset + 102, $col_043, value);
	}

	public void col_043(long value) {
		setConstNumber(offset + 102, $col_043, value);
	}

	public void col_043(float value) {
		setConstNumber(offset + 102, $col_043, value);
	}

	public void col_043(double value) {
		setConstNumber(offset + 102, $col_043, value);
	}


	public MCNumber col_044() {
		return getConstNumber(offset + 103, $col_044);
	}

	public void col_044(MCNumber value) {
		setConstNumber(offset + 103, $col_044, value);
	}

	public void col_044(int value) {
		setConstNumber(offset + 103, $col_044, value);
	}

	public void col_044(long value) {
		setConstNumber(offset + 103, $col_044, value);
	}

	public void col_044(float value) {
		setConstNumber(offset + 103, $col_044, value);
	}

	public void col_044(double value) {
		setConstNumber(offset + 103, $col_044, value);
	}


	public MCNumber col_045() {
		return getConstNumber(offset + 104, $col_045);
	}

	public void col_045(MCNumber value) {
		setConstNumber(offset + 104, $col_045, value);
	}

	public void col_045(int value) {
		setConstNumber(offset + 104, $col_045, value);
	}

	public void col_045(long value) {
		setConstNumber(offset + 104, $col_045, value);
	}

	public void col_045(float value) {
		setConstNumber(offset + 104, $col_045, value);
	}

	public void col_045(double value) {
		setConstNumber(offset + 104, $col_045, value);
	}


	public MCNumber col_046() {
		return getConstNumber(offset + 105, $col_046);
	}

	public void col_046(MCNumber value) {
		setConstNumber(offset + 105, $col_046, value);
	}

	public void col_046(int value) {
		setConstNumber(offset + 105, $col_046, value);
	}

	public void col_046(long value) {
		setConstNumber(offset + 105, $col_046, value);
	}

	public void col_046(float value) {
		setConstNumber(offset + 105, $col_046, value);
	}

	public void col_046(double value) {
		setConstNumber(offset + 105, $col_046, value);
	}


	public MCNumber col_047() {
		return getConstNumber(offset + 106, $col_047);
	}

	public void col_047(MCNumber value) {
		setConstNumber(offset + 106, $col_047, value);
	}

	public void col_047(int value) {
		setConstNumber(offset + 106, $col_047, value);
	}

	public void col_047(long value) {
		setConstNumber(offset + 106, $col_047, value);
	}

	public void col_047(float value) {
		setConstNumber(offset + 106, $col_047, value);
	}

	public void col_047(double value) {
		setConstNumber(offset + 106, $col_047, value);
	}


	public MCNumber col_048() {
		return getConstNumber(offset + 107, $col_048);
	}

	public void col_048(MCNumber value) {
		setConstNumber(offset + 107, $col_048, value);
	}

	public void col_048(int value) {
		setConstNumber(offset + 107, $col_048, value);
	}

	public void col_048(long value) {
		setConstNumber(offset + 107, $col_048, value);
	}

	public void col_048(float value) {
		setConstNumber(offset + 107, $col_048, value);
	}

	public void col_048(double value) {
		setConstNumber(offset + 107, $col_048, value);
	}


	public MCNumber col_049() {
		return getConstNumber(offset + 108, $col_049);
	}

	public void col_049(MCNumber value) {
		setConstNumber(offset + 108, $col_049, value);
	}

	public void col_049(int value) {
		setConstNumber(offset + 108, $col_049, value);
	}

	public void col_049(long value) {
		setConstNumber(offset + 108, $col_049, value);
	}

	public void col_049(float value) {
		setConstNumber(offset + 108, $col_049, value);
	}

	public void col_049(double value) {
		setConstNumber(offset + 108, $col_049, value);
	}


	public MCNumber col_050() {
		return getConstNumber(offset + 109, $col_050);
	}

	public void col_050(MCNumber value) {
		setConstNumber(offset + 109, $col_050, value);
	}

	public void col_050(int value) {
		setConstNumber(offset + 109, $col_050, value);
	}

	public void col_050(long value) {
		setConstNumber(offset + 109, $col_050, value);
	}

	public void col_050(float value) {
		setConstNumber(offset + 109, $col_050, value);
	}

	public void col_050(double value) {
		setConstNumber(offset + 109, $col_050, value);
	}


	public MCNumber col_051() {
		return getConstNumber(offset + 110, $col_051);
	}

	public void col_051(MCNumber value) {
		setConstNumber(offset + 110, $col_051, value);
	}

	public void col_051(int value) {
		setConstNumber(offset + 110, $col_051, value);
	}

	public void col_051(long value) {
		setConstNumber(offset + 110, $col_051, value);
	}

	public void col_051(float value) {
		setConstNumber(offset + 110, $col_051, value);
	}

	public void col_051(double value) {
		setConstNumber(offset + 110, $col_051, value);
	}


	public MCNumber col_052() {
		return getConstNumber(offset + 111, $col_052);
	}

	public void col_052(MCNumber value) {
		setConstNumber(offset + 111, $col_052, value);
	}

	public void col_052(int value) {
		setConstNumber(offset + 111, $col_052, value);
	}

	public void col_052(long value) {
		setConstNumber(offset + 111, $col_052, value);
	}

	public void col_052(float value) {
		setConstNumber(offset + 111, $col_052, value);
	}

	public void col_052(double value) {
		setConstNumber(offset + 111, $col_052, value);
	}


	public MCNumber col_053() {
		return getConstNumber(offset + 112, $col_053);
	}

	public void col_053(MCNumber value) {
		setConstNumber(offset + 112, $col_053, value);
	}

	public void col_053(int value) {
		setConstNumber(offset + 112, $col_053, value);
	}

	public void col_053(long value) {
		setConstNumber(offset + 112, $col_053, value);
	}

	public void col_053(float value) {
		setConstNumber(offset + 112, $col_053, value);
	}

	public void col_053(double value) {
		setConstNumber(offset + 112, $col_053, value);
	}


	public MCNumber col_054() {
		return getConstNumber(offset + 113, $col_054);
	}

	public void col_054(MCNumber value) {
		setConstNumber(offset + 113, $col_054, value);
	}

	public void col_054(int value) {
		setConstNumber(offset + 113, $col_054, value);
	}

	public void col_054(long value) {
		setConstNumber(offset + 113, $col_054, value);
	}

	public void col_054(float value) {
		setConstNumber(offset + 113, $col_054, value);
	}

	public void col_054(double value) {
		setConstNumber(offset + 113, $col_054, value);
	}


	public MCNumber col_055() {
		return getConstNumber(offset + 114, $col_055);
	}

	public void col_055(MCNumber value) {
		setConstNumber(offset + 114, $col_055, value);
	}

	public void col_055(int value) {
		setConstNumber(offset + 114, $col_055, value);
	}

	public void col_055(long value) {
		setConstNumber(offset + 114, $col_055, value);
	}

	public void col_055(float value) {
		setConstNumber(offset + 114, $col_055, value);
	}

	public void col_055(double value) {
		setConstNumber(offset + 114, $col_055, value);
	}


	public MCNumber col_056() {
		return getConstNumber(offset + 115, $col_056);
	}

	public void col_056(MCNumber value) {
		setConstNumber(offset + 115, $col_056, value);
	}

	public void col_056(int value) {
		setConstNumber(offset + 115, $col_056, value);
	}

	public void col_056(long value) {
		setConstNumber(offset + 115, $col_056, value);
	}

	public void col_056(float value) {
		setConstNumber(offset + 115, $col_056, value);
	}

	public void col_056(double value) {
		setConstNumber(offset + 115, $col_056, value);
	}


	public MCNumber col_057() {
		return getConstNumber(offset + 116, $col_057);
	}

	public void col_057(MCNumber value) {
		setConstNumber(offset + 116, $col_057, value);
	}

	public void col_057(int value) {
		setConstNumber(offset + 116, $col_057, value);
	}

	public void col_057(long value) {
		setConstNumber(offset + 116, $col_057, value);
	}

	public void col_057(float value) {
		setConstNumber(offset + 116, $col_057, value);
	}

	public void col_057(double value) {
		setConstNumber(offset + 116, $col_057, value);
	}


	public MCNumber col_058() {
		return getConstNumber(offset + 117, $col_058);
	}

	public void col_058(MCNumber value) {
		setConstNumber(offset + 117, $col_058, value);
	}

	public void col_058(int value) {
		setConstNumber(offset + 117, $col_058, value);
	}

	public void col_058(long value) {
		setConstNumber(offset + 117, $col_058, value);
	}

	public void col_058(float value) {
		setConstNumber(offset + 117, $col_058, value);
	}

	public void col_058(double value) {
		setConstNumber(offset + 117, $col_058, value);
	}


	public MCNumber col_059() {
		return getConstNumber(offset + 118, $col_059);
	}

	public void col_059(MCNumber value) {
		setConstNumber(offset + 118, $col_059, value);
	}

	public void col_059(int value) {
		setConstNumber(offset + 118, $col_059, value);
	}

	public void col_059(long value) {
		setConstNumber(offset + 118, $col_059, value);
	}

	public void col_059(float value) {
		setConstNumber(offset + 118, $col_059, value);
	}

	public void col_059(double value) {
		setConstNumber(offset + 118, $col_059, value);
	}


	public MCNumber col_060() {
		return getConstNumber(offset + 119, $col_060);
	}

	public void col_060(MCNumber value) {
		setConstNumber(offset + 119, $col_060, value);
	}

	public void col_060(int value) {
		setConstNumber(offset + 119, $col_060, value);
	}

	public void col_060(long value) {
		setConstNumber(offset + 119, $col_060, value);
	}

	public void col_060(float value) {
		setConstNumber(offset + 119, $col_060, value);
	}

	public void col_060(double value) {
		setConstNumber(offset + 119, $col_060, value);
	}


	public MCNumber col_061() {
		return getConstNumber(offset + 120, $col_061);
	}

	public void col_061(MCNumber value) {
		setConstNumber(offset + 120, $col_061, value);
	}

	public void col_061(int value) {
		setConstNumber(offset + 120, $col_061, value);
	}

	public void col_061(long value) {
		setConstNumber(offset + 120, $col_061, value);
	}

	public void col_061(float value) {
		setConstNumber(offset + 120, $col_061, value);
	}

	public void col_061(double value) {
		setConstNumber(offset + 120, $col_061, value);
	}


	public MCNumber col_062() {
		return getConstNumber(offset + 121, $col_062);
	}

	public void col_062(MCNumber value) {
		setConstNumber(offset + 121, $col_062, value);
	}

	public void col_062(int value) {
		setConstNumber(offset + 121, $col_062, value);
	}

	public void col_062(long value) {
		setConstNumber(offset + 121, $col_062, value);
	}

	public void col_062(float value) {
		setConstNumber(offset + 121, $col_062, value);
	}

	public void col_062(double value) {
		setConstNumber(offset + 121, $col_062, value);
	}


	public MCNumber col_063() {
		return getConstNumber(offset + 122, $col_063);
	}

	public void col_063(MCNumber value) {
		setConstNumber(offset + 122, $col_063, value);
	}

	public void col_063(int value) {
		setConstNumber(offset + 122, $col_063, value);
	}

	public void col_063(long value) {
		setConstNumber(offset + 122, $col_063, value);
	}

	public void col_063(float value) {
		setConstNumber(offset + 122, $col_063, value);
	}

	public void col_063(double value) {
		setConstNumber(offset + 122, $col_063, value);
	}


	public MCNumber col_064() {
		return getConstNumber(offset + 123, $col_064);
	}

	public void col_064(MCNumber value) {
		setConstNumber(offset + 123, $col_064, value);
	}

	public void col_064(int value) {
		setConstNumber(offset + 123, $col_064, value);
	}

	public void col_064(long value) {
		setConstNumber(offset + 123, $col_064, value);
	}

	public void col_064(float value) {
		setConstNumber(offset + 123, $col_064, value);
	}

	public void col_064(double value) {
		setConstNumber(offset + 123, $col_064, value);
	}


	public MCNumber col_065() {
		return getConstNumber(offset + 124, $col_065);
	}

	public void col_065(MCNumber value) {
		setConstNumber(offset + 124, $col_065, value);
	}

	public void col_065(int value) {
		setConstNumber(offset + 124, $col_065, value);
	}

	public void col_065(long value) {
		setConstNumber(offset + 124, $col_065, value);
	}

	public void col_065(float value) {
		setConstNumber(offset + 124, $col_065, value);
	}

	public void col_065(double value) {
		setConstNumber(offset + 124, $col_065, value);
	}


	public MCNumber col_066() {
		return getConstNumber(offset + 125, $col_066);
	}

	public void col_066(MCNumber value) {
		setConstNumber(offset + 125, $col_066, value);
	}

	public void col_066(int value) {
		setConstNumber(offset + 125, $col_066, value);
	}

	public void col_066(long value) {
		setConstNumber(offset + 125, $col_066, value);
	}

	public void col_066(float value) {
		setConstNumber(offset + 125, $col_066, value);
	}

	public void col_066(double value) {
		setConstNumber(offset + 125, $col_066, value);
	}


	public MCNumber col_067() {
		return getConstNumber(offset + 126, $col_067);
	}

	public void col_067(MCNumber value) {
		setConstNumber(offset + 126, $col_067, value);
	}

	public void col_067(int value) {
		setConstNumber(offset + 126, $col_067, value);
	}

	public void col_067(long value) {
		setConstNumber(offset + 126, $col_067, value);
	}

	public void col_067(float value) {
		setConstNumber(offset + 126, $col_067, value);
	}

	public void col_067(double value) {
		setConstNumber(offset + 126, $col_067, value);
	}


	public MCNumber col_068() {
		return getConstNumber(offset + 127, $col_068);
	}

	public void col_068(MCNumber value) {
		setConstNumber(offset + 127, $col_068, value);
	}

	public void col_068(int value) {
		setConstNumber(offset + 127, $col_068, value);
	}

	public void col_068(long value) {
		setConstNumber(offset + 127, $col_068, value);
	}

	public void col_068(float value) {
		setConstNumber(offset + 127, $col_068, value);
	}

	public void col_068(double value) {
		setConstNumber(offset + 127, $col_068, value);
	}


	public MCNumber col_069() {
		return getConstNumber(offset + 128, $col_069);
	}

	public void col_069(MCNumber value) {
		setConstNumber(offset + 128, $col_069, value);
	}

	public void col_069(int value) {
		setConstNumber(offset + 128, $col_069, value);
	}

	public void col_069(long value) {
		setConstNumber(offset + 128, $col_069, value);
	}

	public void col_069(float value) {
		setConstNumber(offset + 128, $col_069, value);
	}

	public void col_069(double value) {
		setConstNumber(offset + 128, $col_069, value);
	}


	public MCNumber col_070() {
		return getConstNumber(offset + 129, $col_070);
	}

	public void col_070(MCNumber value) {
		setConstNumber(offset + 129, $col_070, value);
	}

	public void col_070(int value) {
		setConstNumber(offset + 129, $col_070, value);
	}

	public void col_070(long value) {
		setConstNumber(offset + 129, $col_070, value);
	}

	public void col_070(float value) {
		setConstNumber(offset + 129, $col_070, value);
	}

	public void col_070(double value) {
		setConstNumber(offset + 129, $col_070, value);
	}


	public MCNumber col_071() {
		return getConstNumber(offset + 130, $col_071);
	}

	public void col_071(MCNumber value) {
		setConstNumber(offset + 130, $col_071, value);
	}

	public void col_071(int value) {
		setConstNumber(offset + 130, $col_071, value);
	}

	public void col_071(long value) {
		setConstNumber(offset + 130, $col_071, value);
	}

	public void col_071(float value) {
		setConstNumber(offset + 130, $col_071, value);
	}

	public void col_071(double value) {
		setConstNumber(offset + 130, $col_071, value);
	}


	public MCNumber col_072() {
		return getConstNumber(offset + 131, $col_072);
	}

	public void col_072(MCNumber value) {
		setConstNumber(offset + 131, $col_072, value);
	}

	public void col_072(int value) {
		setConstNumber(offset + 131, $col_072, value);
	}

	public void col_072(long value) {
		setConstNumber(offset + 131, $col_072, value);
	}

	public void col_072(float value) {
		setConstNumber(offset + 131, $col_072, value);
	}

	public void col_072(double value) {
		setConstNumber(offset + 131, $col_072, value);
	}


	public MCNumber col_073() {
		return getConstNumber(offset + 132, $col_073);
	}

	public void col_073(MCNumber value) {
		setConstNumber(offset + 132, $col_073, value);
	}

	public void col_073(int value) {
		setConstNumber(offset + 132, $col_073, value);
	}

	public void col_073(long value) {
		setConstNumber(offset + 132, $col_073, value);
	}

	public void col_073(float value) {
		setConstNumber(offset + 132, $col_073, value);
	}

	public void col_073(double value) {
		setConstNumber(offset + 132, $col_073, value);
	}


	public MCNumber col_074() {
		return getConstNumber(offset + 133, $col_074);
	}

	public void col_074(MCNumber value) {
		setConstNumber(offset + 133, $col_074, value);
	}

	public void col_074(int value) {
		setConstNumber(offset + 133, $col_074, value);
	}

	public void col_074(long value) {
		setConstNumber(offset + 133, $col_074, value);
	}

	public void col_074(float value) {
		setConstNumber(offset + 133, $col_074, value);
	}

	public void col_074(double value) {
		setConstNumber(offset + 133, $col_074, value);
	}


	public MCNumber col_075() {
		return getConstNumber(offset + 134, $col_075);
	}

	public void col_075(MCNumber value) {
		setConstNumber(offset + 134, $col_075, value);
	}

	public void col_075(int value) {
		setConstNumber(offset + 134, $col_075, value);
	}

	public void col_075(long value) {
		setConstNumber(offset + 134, $col_075, value);
	}

	public void col_075(float value) {
		setConstNumber(offset + 134, $col_075, value);
	}

	public void col_075(double value) {
		setConstNumber(offset + 134, $col_075, value);
	}


	public MCNumber col_076() {
		return getConstNumber(offset + 135, $col_076);
	}

	public void col_076(MCNumber value) {
		setConstNumber(offset + 135, $col_076, value);
	}

	public void col_076(int value) {
		setConstNumber(offset + 135, $col_076, value);
	}

	public void col_076(long value) {
		setConstNumber(offset + 135, $col_076, value);
	}

	public void col_076(float value) {
		setConstNumber(offset + 135, $col_076, value);
	}

	public void col_076(double value) {
		setConstNumber(offset + 135, $col_076, value);
	}


	public MCNumber col_077() {
		return getConstNumber(offset + 136, $col_077);
	}

	public void col_077(MCNumber value) {
		setConstNumber(offset + 136, $col_077, value);
	}

	public void col_077(int value) {
		setConstNumber(offset + 136, $col_077, value);
	}

	public void col_077(long value) {
		setConstNumber(offset + 136, $col_077, value);
	}

	public void col_077(float value) {
		setConstNumber(offset + 136, $col_077, value);
	}

	public void col_077(double value) {
		setConstNumber(offset + 136, $col_077, value);
	}


	public MCNumber col_078() {
		return getConstNumber(offset + 137, $col_078);
	}

	public void col_078(MCNumber value) {
		setConstNumber(offset + 137, $col_078, value);
	}

	public void col_078(int value) {
		setConstNumber(offset + 137, $col_078, value);
	}

	public void col_078(long value) {
		setConstNumber(offset + 137, $col_078, value);
	}

	public void col_078(float value) {
		setConstNumber(offset + 137, $col_078, value);
	}

	public void col_078(double value) {
		setConstNumber(offset + 137, $col_078, value);
	}


	public MCNumber col_079() {
		return getConstNumber(offset + 138, $col_079);
	}

	public void col_079(MCNumber value) {
		setConstNumber(offset + 138, $col_079, value);
	}

	public void col_079(int value) {
		setConstNumber(offset + 138, $col_079, value);
	}

	public void col_079(long value) {
		setConstNumber(offset + 138, $col_079, value);
	}

	public void col_079(float value) {
		setConstNumber(offset + 138, $col_079, value);
	}

	public void col_079(double value) {
		setConstNumber(offset + 138, $col_079, value);
	}


	public MCNumber col_080() {
		return getConstNumber(offset + 139, $col_080);
	}

	public void col_080(MCNumber value) {
		setConstNumber(offset + 139, $col_080, value);
	}

	public void col_080(int value) {
		setConstNumber(offset + 139, $col_080, value);
	}

	public void col_080(long value) {
		setConstNumber(offset + 139, $col_080, value);
	}

	public void col_080(float value) {
		setConstNumber(offset + 139, $col_080, value);
	}

	public void col_080(double value) {
		setConstNumber(offset + 139, $col_080, value);
	}


	public MCNumber col_081() {
		return getConstNumber(offset + 140, $col_081);
	}

	public void col_081(MCNumber value) {
		setConstNumber(offset + 140, $col_081, value);
	}

	public void col_081(int value) {
		setConstNumber(offset + 140, $col_081, value);
	}

	public void col_081(long value) {
		setConstNumber(offset + 140, $col_081, value);
	}

	public void col_081(float value) {
		setConstNumber(offset + 140, $col_081, value);
	}

	public void col_081(double value) {
		setConstNumber(offset + 140, $col_081, value);
	}


	public MCNumber col_082() {
		return getConstNumber(offset + 141, $col_082);
	}

	public void col_082(MCNumber value) {
		setConstNumber(offset + 141, $col_082, value);
	}

	public void col_082(int value) {
		setConstNumber(offset + 141, $col_082, value);
	}

	public void col_082(long value) {
		setConstNumber(offset + 141, $col_082, value);
	}

	public void col_082(float value) {
		setConstNumber(offset + 141, $col_082, value);
	}

	public void col_082(double value) {
		setConstNumber(offset + 141, $col_082, value);
	}


	public MCNumber col_083() {
		return getConstNumber(offset + 142, $col_083);
	}

	public void col_083(MCNumber value) {
		setConstNumber(offset + 142, $col_083, value);
	}

	public void col_083(int value) {
		setConstNumber(offset + 142, $col_083, value);
	}

	public void col_083(long value) {
		setConstNumber(offset + 142, $col_083, value);
	}

	public void col_083(float value) {
		setConstNumber(offset + 142, $col_083, value);
	}

	public void col_083(double value) {
		setConstNumber(offset + 142, $col_083, value);
	}


	public MCNumber col_084() {
		return getConstNumber(offset + 143, $col_084);
	}

	public void col_084(MCNumber value) {
		setConstNumber(offset + 143, $col_084, value);
	}

	public void col_084(int value) {
		setConstNumber(offset + 143, $col_084, value);
	}

	public void col_084(long value) {
		setConstNumber(offset + 143, $col_084, value);
	}

	public void col_084(float value) {
		setConstNumber(offset + 143, $col_084, value);
	}

	public void col_084(double value) {
		setConstNumber(offset + 143, $col_084, value);
	}


	public MCNumber col_085() {
		return getConstNumber(offset + 144, $col_085);
	}

	public void col_085(MCNumber value) {
		setConstNumber(offset + 144, $col_085, value);
	}

	public void col_085(int value) {
		setConstNumber(offset + 144, $col_085, value);
	}

	public void col_085(long value) {
		setConstNumber(offset + 144, $col_085, value);
	}

	public void col_085(float value) {
		setConstNumber(offset + 144, $col_085, value);
	}

	public void col_085(double value) {
		setConstNumber(offset + 144, $col_085, value);
	}


	public MCNumber col_086() {
		return getConstNumber(offset + 145, $col_086);
	}

	public void col_086(MCNumber value) {
		setConstNumber(offset + 145, $col_086, value);
	}

	public void col_086(int value) {
		setConstNumber(offset + 145, $col_086, value);
	}

	public void col_086(long value) {
		setConstNumber(offset + 145, $col_086, value);
	}

	public void col_086(float value) {
		setConstNumber(offset + 145, $col_086, value);
	}

	public void col_086(double value) {
		setConstNumber(offset + 145, $col_086, value);
	}


	public MCNumber col_087() {
		return getConstNumber(offset + 146, $col_087);
	}

	public void col_087(MCNumber value) {
		setConstNumber(offset + 146, $col_087, value);
	}

	public void col_087(int value) {
		setConstNumber(offset + 146, $col_087, value);
	}

	public void col_087(long value) {
		setConstNumber(offset + 146, $col_087, value);
	}

	public void col_087(float value) {
		setConstNumber(offset + 146, $col_087, value);
	}

	public void col_087(double value) {
		setConstNumber(offset + 146, $col_087, value);
	}


	public MCNumber col_088() {
		return getConstNumber(offset + 147, $col_088);
	}

	public void col_088(MCNumber value) {
		setConstNumber(offset + 147, $col_088, value);
	}

	public void col_088(int value) {
		setConstNumber(offset + 147, $col_088, value);
	}

	public void col_088(long value) {
		setConstNumber(offset + 147, $col_088, value);
	}

	public void col_088(float value) {
		setConstNumber(offset + 147, $col_088, value);
	}

	public void col_088(double value) {
		setConstNumber(offset + 147, $col_088, value);
	}


	public MCNumber col_089() {
		return getConstNumber(offset + 148, $col_089);
	}

	public void col_089(MCNumber value) {
		setConstNumber(offset + 148, $col_089, value);
	}

	public void col_089(int value) {
		setConstNumber(offset + 148, $col_089, value);
	}

	public void col_089(long value) {
		setConstNumber(offset + 148, $col_089, value);
	}

	public void col_089(float value) {
		setConstNumber(offset + 148, $col_089, value);
	}

	public void col_089(double value) {
		setConstNumber(offset + 148, $col_089, value);
	}


	public MCNumber col_090() {
		return getConstNumber(offset + 149, $col_090);
	}

	public void col_090(MCNumber value) {
		setConstNumber(offset + 149, $col_090, value);
	}

	public void col_090(int value) {
		setConstNumber(offset + 149, $col_090, value);
	}

	public void col_090(long value) {
		setConstNumber(offset + 149, $col_090, value);
	}

	public void col_090(float value) {
		setConstNumber(offset + 149, $col_090, value);
	}

	public void col_090(double value) {
		setConstNumber(offset + 149, $col_090, value);
	}


	public MCNumber col_091() {
		return getConstNumber(offset + 150, $col_091);
	}

	public void col_091(MCNumber value) {
		setConstNumber(offset + 150, $col_091, value);
	}

	public void col_091(int value) {
		setConstNumber(offset + 150, $col_091, value);
	}

	public void col_091(long value) {
		setConstNumber(offset + 150, $col_091, value);
	}

	public void col_091(float value) {
		setConstNumber(offset + 150, $col_091, value);
	}

	public void col_091(double value) {
		setConstNumber(offset + 150, $col_091, value);
	}


	public MCNumber col_092() {
		return getConstNumber(offset + 151, $col_092);
	}

	public void col_092(MCNumber value) {
		setConstNumber(offset + 151, $col_092, value);
	}

	public void col_092(int value) {
		setConstNumber(offset + 151, $col_092, value);
	}

	public void col_092(long value) {
		setConstNumber(offset + 151, $col_092, value);
	}

	public void col_092(float value) {
		setConstNumber(offset + 151, $col_092, value);
	}

	public void col_092(double value) {
		setConstNumber(offset + 151, $col_092, value);
	}


	public MCNumber col_093() {
		return getConstNumber(offset + 152, $col_093);
	}

	public void col_093(MCNumber value) {
		setConstNumber(offset + 152, $col_093, value);
	}

	public void col_093(int value) {
		setConstNumber(offset + 152, $col_093, value);
	}

	public void col_093(long value) {
		setConstNumber(offset + 152, $col_093, value);
	}

	public void col_093(float value) {
		setConstNumber(offset + 152, $col_093, value);
	}

	public void col_093(double value) {
		setConstNumber(offset + 152, $col_093, value);
	}


	public MCNumber col_094() {
		return getConstNumber(offset + 153, $col_094);
	}

	public void col_094(MCNumber value) {
		setConstNumber(offset + 153, $col_094, value);
	}

	public void col_094(int value) {
		setConstNumber(offset + 153, $col_094, value);
	}

	public void col_094(long value) {
		setConstNumber(offset + 153, $col_094, value);
	}

	public void col_094(float value) {
		setConstNumber(offset + 153, $col_094, value);
	}

	public void col_094(double value) {
		setConstNumber(offset + 153, $col_094, value);
	}


	public MCNumber col_095() {
		return getConstNumber(offset + 154, $col_095);
	}

	public void col_095(MCNumber value) {
		setConstNumber(offset + 154, $col_095, value);
	}

	public void col_095(int value) {
		setConstNumber(offset + 154, $col_095, value);
	}

	public void col_095(long value) {
		setConstNumber(offset + 154, $col_095, value);
	}

	public void col_095(float value) {
		setConstNumber(offset + 154, $col_095, value);
	}

	public void col_095(double value) {
		setConstNumber(offset + 154, $col_095, value);
	}


	public MCNumber col_096() {
		return getConstNumber(offset + 155, $col_096);
	}

	public void col_096(MCNumber value) {
		setConstNumber(offset + 155, $col_096, value);
	}

	public void col_096(int value) {
		setConstNumber(offset + 155, $col_096, value);
	}

	public void col_096(long value) {
		setConstNumber(offset + 155, $col_096, value);
	}

	public void col_096(float value) {
		setConstNumber(offset + 155, $col_096, value);
	}

	public void col_096(double value) {
		setConstNumber(offset + 155, $col_096, value);
	}


	public MCNumber col_097() {
		return getConstNumber(offset + 156, $col_097);
	}

	public void col_097(MCNumber value) {
		setConstNumber(offset + 156, $col_097, value);
	}

	public void col_097(int value) {
		setConstNumber(offset + 156, $col_097, value);
	}

	public void col_097(long value) {
		setConstNumber(offset + 156, $col_097, value);
	}

	public void col_097(float value) {
		setConstNumber(offset + 156, $col_097, value);
	}

	public void col_097(double value) {
		setConstNumber(offset + 156, $col_097, value);
	}


	public MCNumber col_098() {
		return getConstNumber(offset + 157, $col_098);
	}

	public void col_098(MCNumber value) {
		setConstNumber(offset + 157, $col_098, value);
	}

	public void col_098(int value) {
		setConstNumber(offset + 157, $col_098, value);
	}

	public void col_098(long value) {
		setConstNumber(offset + 157, $col_098, value);
	}

	public void col_098(float value) {
		setConstNumber(offset + 157, $col_098, value);
	}

	public void col_098(double value) {
		setConstNumber(offset + 157, $col_098, value);
	}


	public MCNumber col_099() {
		return getConstNumber(offset + 158, $col_099);
	}

	public void col_099(MCNumber value) {
		setConstNumber(offset + 158, $col_099, value);
	}

	public void col_099(int value) {
		setConstNumber(offset + 158, $col_099, value);
	}

	public void col_099(long value) {
		setConstNumber(offset + 158, $col_099, value);
	}

	public void col_099(float value) {
		setConstNumber(offset + 158, $col_099, value);
	}

	public void col_099(double value) {
		setConstNumber(offset + 158, $col_099, value);
	}


	public MCNumber col_100() {
		return getConstNumber(offset + 159, $col_100);
	}

	public void col_100(MCNumber value) {
		setConstNumber(offset + 159, $col_100, value);
	}

	public void col_100(int value) {
		setConstNumber(offset + 159, $col_100, value);
	}

	public void col_100(long value) {
		setConstNumber(offset + 159, $col_100, value);
	}

	public void col_100(float value) {
		setConstNumber(offset + 159, $col_100, value);
	}

	public void col_100(double value) {
		setConstNumber(offset + 159, $col_100, value);
	}


	public MCNumber col_101() {
		return getConstNumber(offset + 160, $col_101);
	}

	public void col_101(MCNumber value) {
		setConstNumber(offset + 160, $col_101, value);
	}

	public void col_101(int value) {
		setConstNumber(offset + 160, $col_101, value);
	}

	public void col_101(long value) {
		setConstNumber(offset + 160, $col_101, value);
	}

	public void col_101(float value) {
		setConstNumber(offset + 160, $col_101, value);
	}

	public void col_101(double value) {
		setConstNumber(offset + 160, $col_101, value);
	}


	public MCNumber col_102() {
		return getConstNumber(offset + 161, $col_102);
	}

	public void col_102(MCNumber value) {
		setConstNumber(offset + 161, $col_102, value);
	}

	public void col_102(int value) {
		setConstNumber(offset + 161, $col_102, value);
	}

	public void col_102(long value) {
		setConstNumber(offset + 161, $col_102, value);
	}

	public void col_102(float value) {
		setConstNumber(offset + 161, $col_102, value);
	}

	public void col_102(double value) {
		setConstNumber(offset + 161, $col_102, value);
	}


	public MCNumber col_103() {
		return getConstNumber(offset + 162, $col_103);
	}

	public void col_103(MCNumber value) {
		setConstNumber(offset + 162, $col_103, value);
	}

	public void col_103(int value) {
		setConstNumber(offset + 162, $col_103, value);
	}

	public void col_103(long value) {
		setConstNumber(offset + 162, $col_103, value);
	}

	public void col_103(float value) {
		setConstNumber(offset + 162, $col_103, value);
	}

	public void col_103(double value) {
		setConstNumber(offset + 162, $col_103, value);
	}


	public MCNumber col_104() {
		return getConstNumber(offset + 163, $col_104);
	}

	public void col_104(MCNumber value) {
		setConstNumber(offset + 163, $col_104, value);
	}

	public void col_104(int value) {
		setConstNumber(offset + 163, $col_104, value);
	}

	public void col_104(long value) {
		setConstNumber(offset + 163, $col_104, value);
	}

	public void col_104(float value) {
		setConstNumber(offset + 163, $col_104, value);
	}

	public void col_104(double value) {
		setConstNumber(offset + 163, $col_104, value);
	}


	public MCNumber col_105() {
		return getConstNumber(offset + 164, $col_105);
	}

	public void col_105(MCNumber value) {
		setConstNumber(offset + 164, $col_105, value);
	}

	public void col_105(int value) {
		setConstNumber(offset + 164, $col_105, value);
	}

	public void col_105(long value) {
		setConstNumber(offset + 164, $col_105, value);
	}

	public void col_105(float value) {
		setConstNumber(offset + 164, $col_105, value);
	}

	public void col_105(double value) {
		setConstNumber(offset + 164, $col_105, value);
	}


	public MCNumber col_106() {
		return getConstNumber(offset + 165, $col_106);
	}

	public void col_106(MCNumber value) {
		setConstNumber(offset + 165, $col_106, value);
	}

	public void col_106(int value) {
		setConstNumber(offset + 165, $col_106, value);
	}

	public void col_106(long value) {
		setConstNumber(offset + 165, $col_106, value);
	}

	public void col_106(float value) {
		setConstNumber(offset + 165, $col_106, value);
	}

	public void col_106(double value) {
		setConstNumber(offset + 165, $col_106, value);
	}


	public MCNumber col_107() {
		return getConstNumber(offset + 166, $col_107);
	}

	public void col_107(MCNumber value) {
		setConstNumber(offset + 166, $col_107, value);
	}

	public void col_107(int value) {
		setConstNumber(offset + 166, $col_107, value);
	}

	public void col_107(long value) {
		setConstNumber(offset + 166, $col_107, value);
	}

	public void col_107(float value) {
		setConstNumber(offset + 166, $col_107, value);
	}

	public void col_107(double value) {
		setConstNumber(offset + 166, $col_107, value);
	}


	public MCNumber col_108() {
		return getConstNumber(offset + 167, $col_108);
	}

	public void col_108(MCNumber value) {
		setConstNumber(offset + 167, $col_108, value);
	}

	public void col_108(int value) {
		setConstNumber(offset + 167, $col_108, value);
	}

	public void col_108(long value) {
		setConstNumber(offset + 167, $col_108, value);
	}

	public void col_108(float value) {
		setConstNumber(offset + 167, $col_108, value);
	}

	public void col_108(double value) {
		setConstNumber(offset + 167, $col_108, value);
	}


	public MCNumber col_109() {
		return getConstNumber(offset + 168, $col_109);
	}

	public void col_109(MCNumber value) {
		setConstNumber(offset + 168, $col_109, value);
	}

	public void col_109(int value) {
		setConstNumber(offset + 168, $col_109, value);
	}

	public void col_109(long value) {
		setConstNumber(offset + 168, $col_109, value);
	}

	public void col_109(float value) {
		setConstNumber(offset + 168, $col_109, value);
	}

	public void col_109(double value) {
		setConstNumber(offset + 168, $col_109, value);
	}


	public MCNumber col_110() {
		return getConstNumber(offset + 169, $col_110);
	}

	public void col_110(MCNumber value) {
		setConstNumber(offset + 169, $col_110, value);
	}

	public void col_110(int value) {
		setConstNumber(offset + 169, $col_110, value);
	}

	public void col_110(long value) {
		setConstNumber(offset + 169, $col_110, value);
	}

	public void col_110(float value) {
		setConstNumber(offset + 169, $col_110, value);
	}

	public void col_110(double value) {
		setConstNumber(offset + 169, $col_110, value);
	}


	public MCNumber col_111() {
		return getConstNumber(offset + 170, $col_111);
	}

	public void col_111(MCNumber value) {
		setConstNumber(offset + 170, $col_111, value);
	}

	public void col_111(int value) {
		setConstNumber(offset + 170, $col_111, value);
	}

	public void col_111(long value) {
		setConstNumber(offset + 170, $col_111, value);
	}

	public void col_111(float value) {
		setConstNumber(offset + 170, $col_111, value);
	}

	public void col_111(double value) {
		setConstNumber(offset + 170, $col_111, value);
	}


	public MCNumber col_112() {
		return getConstNumber(offset + 171, $col_112);
	}

	public void col_112(MCNumber value) {
		setConstNumber(offset + 171, $col_112, value);
	}

	public void col_112(int value) {
		setConstNumber(offset + 171, $col_112, value);
	}

	public void col_112(long value) {
		setConstNumber(offset + 171, $col_112, value);
	}

	public void col_112(float value) {
		setConstNumber(offset + 171, $col_112, value);
	}

	public void col_112(double value) {
		setConstNumber(offset + 171, $col_112, value);
	}


	public MCNumber col_113() {
		return getConstNumber(offset + 172, $col_113);
	}

	public void col_113(MCNumber value) {
		setConstNumber(offset + 172, $col_113, value);
	}

	public void col_113(int value) {
		setConstNumber(offset + 172, $col_113, value);
	}

	public void col_113(long value) {
		setConstNumber(offset + 172, $col_113, value);
	}

	public void col_113(float value) {
		setConstNumber(offset + 172, $col_113, value);
	}

	public void col_113(double value) {
		setConstNumber(offset + 172, $col_113, value);
	}


	public MCNumber col_114() {
		return getConstNumber(offset + 173, $col_114);
	}

	public void col_114(MCNumber value) {
		setConstNumber(offset + 173, $col_114, value);
	}

	public void col_114(int value) {
		setConstNumber(offset + 173, $col_114, value);
	}

	public void col_114(long value) {
		setConstNumber(offset + 173, $col_114, value);
	}

	public void col_114(float value) {
		setConstNumber(offset + 173, $col_114, value);
	}

	public void col_114(double value) {
		setConstNumber(offset + 173, $col_114, value);
	}


	public MCNumber col_115() {
		return getConstNumber(offset + 174, $col_115);
	}

	public void col_115(MCNumber value) {
		setConstNumber(offset + 174, $col_115, value);
	}

	public void col_115(int value) {
		setConstNumber(offset + 174, $col_115, value);
	}

	public void col_115(long value) {
		setConstNumber(offset + 174, $col_115, value);
	}

	public void col_115(float value) {
		setConstNumber(offset + 174, $col_115, value);
	}

	public void col_115(double value) {
		setConstNumber(offset + 174, $col_115, value);
	}


	public MCNumber col_116() {
		return getConstNumber(offset + 175, $col_116);
	}

	public void col_116(MCNumber value) {
		setConstNumber(offset + 175, $col_116, value);
	}

	public void col_116(int value) {
		setConstNumber(offset + 175, $col_116, value);
	}

	public void col_116(long value) {
		setConstNumber(offset + 175, $col_116, value);
	}

	public void col_116(float value) {
		setConstNumber(offset + 175, $col_116, value);
	}

	public void col_116(double value) {
		setConstNumber(offset + 175, $col_116, value);
	}


	public MCNumber col_117() {
		return getConstNumber(offset + 176, $col_117);
	}

	public void col_117(MCNumber value) {
		setConstNumber(offset + 176, $col_117, value);
	}

	public void col_117(int value) {
		setConstNumber(offset + 176, $col_117, value);
	}

	public void col_117(long value) {
		setConstNumber(offset + 176, $col_117, value);
	}

	public void col_117(float value) {
		setConstNumber(offset + 176, $col_117, value);
	}

	public void col_117(double value) {
		setConstNumber(offset + 176, $col_117, value);
	}


	public MCNumber col_118() {
		return getConstNumber(offset + 177, $col_118);
	}

	public void col_118(MCNumber value) {
		setConstNumber(offset + 177, $col_118, value);
	}

	public void col_118(int value) {
		setConstNumber(offset + 177, $col_118, value);
	}

	public void col_118(long value) {
		setConstNumber(offset + 177, $col_118, value);
	}

	public void col_118(float value) {
		setConstNumber(offset + 177, $col_118, value);
	}

	public void col_118(double value) {
		setConstNumber(offset + 177, $col_118, value);
	}


	public MCNumber col_119() {
		return getConstNumber(offset + 178, $col_119);
	}

	public void col_119(MCNumber value) {
		setConstNumber(offset + 178, $col_119, value);
	}

	public void col_119(int value) {
		setConstNumber(offset + 178, $col_119, value);
	}

	public void col_119(long value) {
		setConstNumber(offset + 178, $col_119, value);
	}

	public void col_119(float value) {
		setConstNumber(offset + 178, $col_119, value);
	}

	public void col_119(double value) {
		setConstNumber(offset + 178, $col_119, value);
	}


	public MCNumber col_120() {
		return getConstNumber(offset + 179, $col_120);
	}

	public void col_120(MCNumber value) {
		setConstNumber(offset + 179, $col_120, value);
	}

	public void col_120(int value) {
		setConstNumber(offset + 179, $col_120, value);
	}

	public void col_120(long value) {
		setConstNumber(offset + 179, $col_120, value);
	}

	public void col_120(float value) {
		setConstNumber(offset + 179, $col_120, value);
	}

	public void col_120(double value) {
		setConstNumber(offset + 179, $col_120, value);
	}


	public MCNumber col_121() {
		return getConstNumber(offset + 180, $col_121);
	}

	public void col_121(MCNumber value) {
		setConstNumber(offset + 180, $col_121, value);
	}

	public void col_121(int value) {
		setConstNumber(offset + 180, $col_121, value);
	}

	public void col_121(long value) {
		setConstNumber(offset + 180, $col_121, value);
	}

	public void col_121(float value) {
		setConstNumber(offset + 180, $col_121, value);
	}

	public void col_121(double value) {
		setConstNumber(offset + 180, $col_121, value);
	}


	public MCNumber col_122() {
		return getConstNumber(offset + 181, $col_122);
	}

	public void col_122(MCNumber value) {
		setConstNumber(offset + 181, $col_122, value);
	}

	public void col_122(int value) {
		setConstNumber(offset + 181, $col_122, value);
	}

	public void col_122(long value) {
		setConstNumber(offset + 181, $col_122, value);
	}

	public void col_122(float value) {
		setConstNumber(offset + 181, $col_122, value);
	}

	public void col_122(double value) {
		setConstNumber(offset + 181, $col_122, value);
	}


	public MCNumber col_123() {
		return getConstNumber(offset + 182, $col_123);
	}

	public void col_123(MCNumber value) {
		setConstNumber(offset + 182, $col_123, value);
	}

	public void col_123(int value) {
		setConstNumber(offset + 182, $col_123, value);
	}

	public void col_123(long value) {
		setConstNumber(offset + 182, $col_123, value);
	}

	public void col_123(float value) {
		setConstNumber(offset + 182, $col_123, value);
	}

	public void col_123(double value) {
		setConstNumber(offset + 182, $col_123, value);
	}


	public MCNumber col_124() {
		return getConstNumber(offset + 183, $col_124);
	}

	public void col_124(MCNumber value) {
		setConstNumber(offset + 183, $col_124, value);
	}

	public void col_124(int value) {
		setConstNumber(offset + 183, $col_124, value);
	}

	public void col_124(long value) {
		setConstNumber(offset + 183, $col_124, value);
	}

	public void col_124(float value) {
		setConstNumber(offset + 183, $col_124, value);
	}

	public void col_124(double value) {
		setConstNumber(offset + 183, $col_124, value);
	}


	public MCNumber col_125() {
		return getConstNumber(offset + 184, $col_125);
	}

	public void col_125(MCNumber value) {
		setConstNumber(offset + 184, $col_125, value);
	}

	public void col_125(int value) {
		setConstNumber(offset + 184, $col_125, value);
	}

	public void col_125(long value) {
		setConstNumber(offset + 184, $col_125, value);
	}

	public void col_125(float value) {
		setConstNumber(offset + 184, $col_125, value);
	}

	public void col_125(double value) {
		setConstNumber(offset + 184, $col_125, value);
	}


	public MCNumber col_126() {
		return getConstNumber(offset + 185, $col_126);
	}

	public void col_126(MCNumber value) {
		setConstNumber(offset + 185, $col_126, value);
	}

	public void col_126(int value) {
		setConstNumber(offset + 185, $col_126, value);
	}

	public void col_126(long value) {
		setConstNumber(offset + 185, $col_126, value);
	}

	public void col_126(float value) {
		setConstNumber(offset + 185, $col_126, value);
	}

	public void col_126(double value) {
		setConstNumber(offset + 185, $col_126, value);
	}


	public MCNumber col_127() {
		return getConstNumber(offset + 186, $col_127);
	}

	public void col_127(MCNumber value) {
		setConstNumber(offset + 186, $col_127, value);
	}

	public void col_127(int value) {
		setConstNumber(offset + 186, $col_127, value);
	}

	public void col_127(long value) {
		setConstNumber(offset + 186, $col_127, value);
	}

	public void col_127(float value) {
		setConstNumber(offset + 186, $col_127, value);
	}

	public void col_127(double value) {
		setConstNumber(offset + 186, $col_127, value);
	}


	public MCNumber col_128() {
		return getConstNumber(offset + 187, $col_128);
	}

	public void col_128(MCNumber value) {
		setConstNumber(offset + 187, $col_128, value);
	}

	public void col_128(int value) {
		setConstNumber(offset + 187, $col_128, value);
	}

	public void col_128(long value) {
		setConstNumber(offset + 187, $col_128, value);
	}

	public void col_128(float value) {
		setConstNumber(offset + 187, $col_128, value);
	}

	public void col_128(double value) {
		setConstNumber(offset + 187, $col_128, value);
	}


	public MCNumber col_129() {
		return getConstNumber(offset + 188, $col_129);
	}

	public void col_129(MCNumber value) {
		setConstNumber(offset + 188, $col_129, value);
	}

	public void col_129(int value) {
		setConstNumber(offset + 188, $col_129, value);
	}

	public void col_129(long value) {
		setConstNumber(offset + 188, $col_129, value);
	}

	public void col_129(float value) {
		setConstNumber(offset + 188, $col_129, value);
	}

	public void col_129(double value) {
		setConstNumber(offset + 188, $col_129, value);
	}


	public MCNumber col_130() {
		return getConstNumber(offset + 189, $col_130);
	}

	public void col_130(MCNumber value) {
		setConstNumber(offset + 189, $col_130, value);
	}

	public void col_130(int value) {
		setConstNumber(offset + 189, $col_130, value);
	}

	public void col_130(long value) {
		setConstNumber(offset + 189, $col_130, value);
	}

	public void col_130(float value) {
		setConstNumber(offset + 189, $col_130, value);
	}

	public void col_130(double value) {
		setConstNumber(offset + 189, $col_130, value);
	}


	public MCNumber col_131() {
		return getConstNumber(offset + 190, $col_131);
	}

	public void col_131(MCNumber value) {
		setConstNumber(offset + 190, $col_131, value);
	}

	public void col_131(int value) {
		setConstNumber(offset + 190, $col_131, value);
	}

	public void col_131(long value) {
		setConstNumber(offset + 190, $col_131, value);
	}

	public void col_131(float value) {
		setConstNumber(offset + 190, $col_131, value);
	}

	public void col_131(double value) {
		setConstNumber(offset + 190, $col_131, value);
	}


	public MCNumber col_132() {
		return getConstNumber(offset + 191, $col_132);
	}

	public void col_132(MCNumber value) {
		setConstNumber(offset + 191, $col_132, value);
	}

	public void col_132(int value) {
		setConstNumber(offset + 191, $col_132, value);
	}

	public void col_132(long value) {
		setConstNumber(offset + 191, $col_132, value);
	}

	public void col_132(float value) {
		setConstNumber(offset + 191, $col_132, value);
	}

	public void col_132(double value) {
		setConstNumber(offset + 191, $col_132, value);
	}


	public MCNumber col_133() {
		return getConstNumber(offset + 192, $col_133);
	}

	public void col_133(MCNumber value) {
		setConstNumber(offset + 192, $col_133, value);
	}

	public void col_133(int value) {
		setConstNumber(offset + 192, $col_133, value);
	}

	public void col_133(long value) {
		setConstNumber(offset + 192, $col_133, value);
	}

	public void col_133(float value) {
		setConstNumber(offset + 192, $col_133, value);
	}

	public void col_133(double value) {
		setConstNumber(offset + 192, $col_133, value);
	}


	public MCNumber col_134() {
		return getConstNumber(offset + 193, $col_134);
	}

	public void col_134(MCNumber value) {
		setConstNumber(offset + 193, $col_134, value);
	}

	public void col_134(int value) {
		setConstNumber(offset + 193, $col_134, value);
	}

	public void col_134(long value) {
		setConstNumber(offset + 193, $col_134, value);
	}

	public void col_134(float value) {
		setConstNumber(offset + 193, $col_134, value);
	}

	public void col_134(double value) {
		setConstNumber(offset + 193, $col_134, value);
	}


	public MCNumber col_135() {
		return getConstNumber(offset + 194, $col_135);
	}

	public void col_135(MCNumber value) {
		setConstNumber(offset + 194, $col_135, value);
	}

	public void col_135(int value) {
		setConstNumber(offset + 194, $col_135, value);
	}

	public void col_135(long value) {
		setConstNumber(offset + 194, $col_135, value);
	}

	public void col_135(float value) {
		setConstNumber(offset + 194, $col_135, value);
	}

	public void col_135(double value) {
		setConstNumber(offset + 194, $col_135, value);
	}


	public MCNumber col_136() {
		return getConstNumber(offset + 195, $col_136);
	}

	public void col_136(MCNumber value) {
		setConstNumber(offset + 195, $col_136, value);
	}

	public void col_136(int value) {
		setConstNumber(offset + 195, $col_136, value);
	}

	public void col_136(long value) {
		setConstNumber(offset + 195, $col_136, value);
	}

	public void col_136(float value) {
		setConstNumber(offset + 195, $col_136, value);
	}

	public void col_136(double value) {
		setConstNumber(offset + 195, $col_136, value);
	}


	public MCNumber col_137() {
		return getConstNumber(offset + 196, $col_137);
	}

	public void col_137(MCNumber value) {
		setConstNumber(offset + 196, $col_137, value);
	}

	public void col_137(int value) {
		setConstNumber(offset + 196, $col_137, value);
	}

	public void col_137(long value) {
		setConstNumber(offset + 196, $col_137, value);
	}

	public void col_137(float value) {
		setConstNumber(offset + 196, $col_137, value);
	}

	public void col_137(double value) {
		setConstNumber(offset + 196, $col_137, value);
	}


	public MCNumber col_138() {
		return getConstNumber(offset + 197, $col_138);
	}

	public void col_138(MCNumber value) {
		setConstNumber(offset + 197, $col_138, value);
	}

	public void col_138(int value) {
		setConstNumber(offset + 197, $col_138, value);
	}

	public void col_138(long value) {
		setConstNumber(offset + 197, $col_138, value);
	}

	public void col_138(float value) {
		setConstNumber(offset + 197, $col_138, value);
	}

	public void col_138(double value) {
		setConstNumber(offset + 197, $col_138, value);
	}


	public MCNumber col_139() {
		return getConstNumber(offset + 198, $col_139);
	}

	public void col_139(MCNumber value) {
		setConstNumber(offset + 198, $col_139, value);
	}

	public void col_139(int value) {
		setConstNumber(offset + 198, $col_139, value);
	}

	public void col_139(long value) {
		setConstNumber(offset + 198, $col_139, value);
	}

	public void col_139(float value) {
		setConstNumber(offset + 198, $col_139, value);
	}

	public void col_139(double value) {
		setConstNumber(offset + 198, $col_139, value);
	}


	public MCNumber col_140() {
		return getConstNumber(offset + 199, $col_140);
	}

	public void col_140(MCNumber value) {
		setConstNumber(offset + 199, $col_140, value);
	}

	public void col_140(int value) {
		setConstNumber(offset + 199, $col_140, value);
	}

	public void col_140(long value) {
		setConstNumber(offset + 199, $col_140, value);
	}

	public void col_140(float value) {
		setConstNumber(offset + 199, $col_140, value);
	}

	public void col_140(double value) {
		setConstNumber(offset + 199, $col_140, value);
	}


	public MCNumber col_141() {
		return getConstNumber(offset + 200, $col_141);
	}

	public void col_141(MCNumber value) {
		setConstNumber(offset + 200, $col_141, value);
	}

	public void col_141(int value) {
		setConstNumber(offset + 200, $col_141, value);
	}

	public void col_141(long value) {
		setConstNumber(offset + 200, $col_141, value);
	}

	public void col_141(float value) {
		setConstNumber(offset + 200, $col_141, value);
	}

	public void col_141(double value) {
		setConstNumber(offset + 200, $col_141, value);
	}


	public MCNumber col_142() {
		return getConstNumber(offset + 201, $col_142);
	}

	public void col_142(MCNumber value) {
		setConstNumber(offset + 201, $col_142, value);
	}

	public void col_142(int value) {
		setConstNumber(offset + 201, $col_142, value);
	}

	public void col_142(long value) {
		setConstNumber(offset + 201, $col_142, value);
	}

	public void col_142(float value) {
		setConstNumber(offset + 201, $col_142, value);
	}

	public void col_142(double value) {
		setConstNumber(offset + 201, $col_142, value);
	}


	public MCNumber col_143() {
		return getConstNumber(offset + 202, $col_143);
	}

	public void col_143(MCNumber value) {
		setConstNumber(offset + 202, $col_143, value);
	}

	public void col_143(int value) {
		setConstNumber(offset + 202, $col_143, value);
	}

	public void col_143(long value) {
		setConstNumber(offset + 202, $col_143, value);
	}

	public void col_143(float value) {
		setConstNumber(offset + 202, $col_143, value);
	}

	public void col_143(double value) {
		setConstNumber(offset + 202, $col_143, value);
	}


	public MCNumber col_144() {
		return getConstNumber(offset + 203, $col_144);
	}

	public void col_144(MCNumber value) {
		setConstNumber(offset + 203, $col_144, value);
	}

	public void col_144(int value) {
		setConstNumber(offset + 203, $col_144, value);
	}

	public void col_144(long value) {
		setConstNumber(offset + 203, $col_144, value);
	}

	public void col_144(float value) {
		setConstNumber(offset + 203, $col_144, value);
	}

	public void col_144(double value) {
		setConstNumber(offset + 203, $col_144, value);
	}


	public MCNumber col_145() {
		return getConstNumber(offset + 204, $col_145);
	}

	public void col_145(MCNumber value) {
		setConstNumber(offset + 204, $col_145, value);
	}

	public void col_145(int value) {
		setConstNumber(offset + 204, $col_145, value);
	}

	public void col_145(long value) {
		setConstNumber(offset + 204, $col_145, value);
	}

	public void col_145(float value) {
		setConstNumber(offset + 204, $col_145, value);
	}

	public void col_145(double value) {
		setConstNumber(offset + 204, $col_145, value);
	}


	public MCNumber col_146() {
		return getConstNumber(offset + 205, $col_146);
	}

	public void col_146(MCNumber value) {
		setConstNumber(offset + 205, $col_146, value);
	}

	public void col_146(int value) {
		setConstNumber(offset + 205, $col_146, value);
	}

	public void col_146(long value) {
		setConstNumber(offset + 205, $col_146, value);
	}

	public void col_146(float value) {
		setConstNumber(offset + 205, $col_146, value);
	}

	public void col_146(double value) {
		setConstNumber(offset + 205, $col_146, value);
	}


	public MCNumber col_147() {
		return getConstNumber(offset + 206, $col_147);
	}

	public void col_147(MCNumber value) {
		setConstNumber(offset + 206, $col_147, value);
	}

	public void col_147(int value) {
		setConstNumber(offset + 206, $col_147, value);
	}

	public void col_147(long value) {
		setConstNumber(offset + 206, $col_147, value);
	}

	public void col_147(float value) {
		setConstNumber(offset + 206, $col_147, value);
	}

	public void col_147(double value) {
		setConstNumber(offset + 206, $col_147, value);
	}


	public MCNumber col_148() {
		return getConstNumber(offset + 207, $col_148);
	}

	public void col_148(MCNumber value) {
		setConstNumber(offset + 207, $col_148, value);
	}

	public void col_148(int value) {
		setConstNumber(offset + 207, $col_148, value);
	}

	public void col_148(long value) {
		setConstNumber(offset + 207, $col_148, value);
	}

	public void col_148(float value) {
		setConstNumber(offset + 207, $col_148, value);
	}

	public void col_148(double value) {
		setConstNumber(offset + 207, $col_148, value);
	}


	public MCNumber col_149() {
		return getConstNumber(offset + 208, $col_149);
	}

	public void col_149(MCNumber value) {
		setConstNumber(offset + 208, $col_149, value);
	}

	public void col_149(int value) {
		setConstNumber(offset + 208, $col_149, value);
	}

	public void col_149(long value) {
		setConstNumber(offset + 208, $col_149, value);
	}

	public void col_149(float value) {
		setConstNumber(offset + 208, $col_149, value);
	}

	public void col_149(double value) {
		setConstNumber(offset + 208, $col_149, value);
	}


	public MCNumber col_150() {
		return getConstNumber(offset + 209, $col_150);
	}

	public void col_150(MCNumber value) {
		setConstNumber(offset + 209, $col_150, value);
	}

	public void col_150(int value) {
		setConstNumber(offset + 209, $col_150, value);
	}

	public void col_150(long value) {
		setConstNumber(offset + 209, $col_150, value);
	}

	public void col_150(float value) {
		setConstNumber(offset + 209, $col_150, value);
	}

	public void col_150(double value) {
		setConstNumber(offset + 209, $col_150, value);
	}


	public MCNumber col_151() {
		return getConstNumber(offset + 210, $col_151);
	}

	public void col_151(MCNumber value) {
		setConstNumber(offset + 210, $col_151, value);
	}

	public void col_151(int value) {
		setConstNumber(offset + 210, $col_151, value);
	}

	public void col_151(long value) {
		setConstNumber(offset + 210, $col_151, value);
	}

	public void col_151(float value) {
		setConstNumber(offset + 210, $col_151, value);
	}

	public void col_151(double value) {
		setConstNumber(offset + 210, $col_151, value);
	}


	public MCNumber col_152() {
		return getConstNumber(offset + 211, $col_152);
	}

	public void col_152(MCNumber value) {
		setConstNumber(offset + 211, $col_152, value);
	}

	public void col_152(int value) {
		setConstNumber(offset + 211, $col_152, value);
	}

	public void col_152(long value) {
		setConstNumber(offset + 211, $col_152, value);
	}

	public void col_152(float value) {
		setConstNumber(offset + 211, $col_152, value);
	}

	public void col_152(double value) {
		setConstNumber(offset + 211, $col_152, value);
	}


	public MCNumber col_153() {
		return getConstNumber(offset + 212, $col_153);
	}

	public void col_153(MCNumber value) {
		setConstNumber(offset + 212, $col_153, value);
	}

	public void col_153(int value) {
		setConstNumber(offset + 212, $col_153, value);
	}

	public void col_153(long value) {
		setConstNumber(offset + 212, $col_153, value);
	}

	public void col_153(float value) {
		setConstNumber(offset + 212, $col_153, value);
	}

	public void col_153(double value) {
		setConstNumber(offset + 212, $col_153, value);
	}


	public MCNumber col_154() {
		return getConstNumber(offset + 213, $col_154);
	}

	public void col_154(MCNumber value) {
		setConstNumber(offset + 213, $col_154, value);
	}

	public void col_154(int value) {
		setConstNumber(offset + 213, $col_154, value);
	}

	public void col_154(long value) {
		setConstNumber(offset + 213, $col_154, value);
	}

	public void col_154(float value) {
		setConstNumber(offset + 213, $col_154, value);
	}

	public void col_154(double value) {
		setConstNumber(offset + 213, $col_154, value);
	}


	public MCNumber col_155() {
		return getConstNumber(offset + 214, $col_155);
	}

	public void col_155(MCNumber value) {
		setConstNumber(offset + 214, $col_155, value);
	}

	public void col_155(int value) {
		setConstNumber(offset + 214, $col_155, value);
	}

	public void col_155(long value) {
		setConstNumber(offset + 214, $col_155, value);
	}

	public void col_155(float value) {
		setConstNumber(offset + 214, $col_155, value);
	}

	public void col_155(double value) {
		setConstNumber(offset + 214, $col_155, value);
	}


	public MCNumber col_156() {
		return getConstNumber(offset + 215, $col_156);
	}

	public void col_156(MCNumber value) {
		setConstNumber(offset + 215, $col_156, value);
	}

	public void col_156(int value) {
		setConstNumber(offset + 215, $col_156, value);
	}

	public void col_156(long value) {
		setConstNumber(offset + 215, $col_156, value);
	}

	public void col_156(float value) {
		setConstNumber(offset + 215, $col_156, value);
	}

	public void col_156(double value) {
		setConstNumber(offset + 215, $col_156, value);
	}


	public MCNumber col_157() {
		return getConstNumber(offset + 216, $col_157);
	}

	public void col_157(MCNumber value) {
		setConstNumber(offset + 216, $col_157, value);
	}

	public void col_157(int value) {
		setConstNumber(offset + 216, $col_157, value);
	}

	public void col_157(long value) {
		setConstNumber(offset + 216, $col_157, value);
	}

	public void col_157(float value) {
		setConstNumber(offset + 216, $col_157, value);
	}

	public void col_157(double value) {
		setConstNumber(offset + 216, $col_157, value);
	}


	public MCNumber col_158() {
		return getConstNumber(offset + 217, $col_158);
	}

	public void col_158(MCNumber value) {
		setConstNumber(offset + 217, $col_158, value);
	}

	public void col_158(int value) {
		setConstNumber(offset + 217, $col_158, value);
	}

	public void col_158(long value) {
		setConstNumber(offset + 217, $col_158, value);
	}

	public void col_158(float value) {
		setConstNumber(offset + 217, $col_158, value);
	}

	public void col_158(double value) {
		setConstNumber(offset + 217, $col_158, value);
	}


	public MCNumber col_159() {
		return getConstNumber(offset + 218, $col_159);
	}

	public void col_159(MCNumber value) {
		setConstNumber(offset + 218, $col_159, value);
	}

	public void col_159(int value) {
		setConstNumber(offset + 218, $col_159, value);
	}

	public void col_159(long value) {
		setConstNumber(offset + 218, $col_159, value);
	}

	public void col_159(float value) {
		setConstNumber(offset + 218, $col_159, value);
	}

	public void col_159(double value) {
		setConstNumber(offset + 218, $col_159, value);
	}


	public MCNumber col_160() {
		return getConstNumber(offset + 219, $col_160);
	}

	public void col_160(MCNumber value) {
		setConstNumber(offset + 219, $col_160, value);
	}

	public void col_160(int value) {
		setConstNumber(offset + 219, $col_160, value);
	}

	public void col_160(long value) {
		setConstNumber(offset + 219, $col_160, value);
	}

	public void col_160(float value) {
		setConstNumber(offset + 219, $col_160, value);
	}

	public void col_160(double value) {
		setConstNumber(offset + 219, $col_160, value);
	}


	public MCNumber col_161() {
		return getConstNumber(offset + 220, $col_161);
	}

	public void col_161(MCNumber value) {
		setConstNumber(offset + 220, $col_161, value);
	}

	public void col_161(int value) {
		setConstNumber(offset + 220, $col_161, value);
	}

	public void col_161(long value) {
		setConstNumber(offset + 220, $col_161, value);
	}

	public void col_161(float value) {
		setConstNumber(offset + 220, $col_161, value);
	}

	public void col_161(double value) {
		setConstNumber(offset + 220, $col_161, value);
	}


	public MCNumber col_162() {
		return getConstNumber(offset + 221, $col_162);
	}

	public void col_162(MCNumber value) {
		setConstNumber(offset + 221, $col_162, value);
	}

	public void col_162(int value) {
		setConstNumber(offset + 221, $col_162, value);
	}

	public void col_162(long value) {
		setConstNumber(offset + 221, $col_162, value);
	}

	public void col_162(float value) {
		setConstNumber(offset + 221, $col_162, value);
	}

	public void col_162(double value) {
		setConstNumber(offset + 221, $col_162, value);
	}


	public MCNumber col_163() {
		return getConstNumber(offset + 222, $col_163);
	}

	public void col_163(MCNumber value) {
		setConstNumber(offset + 222, $col_163, value);
	}

	public void col_163(int value) {
		setConstNumber(offset + 222, $col_163, value);
	}

	public void col_163(long value) {
		setConstNumber(offset + 222, $col_163, value);
	}

	public void col_163(float value) {
		setConstNumber(offset + 222, $col_163, value);
	}

	public void col_163(double value) {
		setConstNumber(offset + 222, $col_163, value);
	}


	public MCNumber col_164() {
		return getConstNumber(offset + 223, $col_164);
	}

	public void col_164(MCNumber value) {
		setConstNumber(offset + 223, $col_164, value);
	}

	public void col_164(int value) {
		setConstNumber(offset + 223, $col_164, value);
	}

	public void col_164(long value) {
		setConstNumber(offset + 223, $col_164, value);
	}

	public void col_164(float value) {
		setConstNumber(offset + 223, $col_164, value);
	}

	public void col_164(double value) {
		setConstNumber(offset + 223, $col_164, value);
	}


	public MCNumber col_165() {
		return getConstNumber(offset + 224, $col_165);
	}

	public void col_165(MCNumber value) {
		setConstNumber(offset + 224, $col_165, value);
	}

	public void col_165(int value) {
		setConstNumber(offset + 224, $col_165, value);
	}

	public void col_165(long value) {
		setConstNumber(offset + 224, $col_165, value);
	}

	public void col_165(float value) {
		setConstNumber(offset + 224, $col_165, value);
	}

	public void col_165(double value) {
		setConstNumber(offset + 224, $col_165, value);
	}


	public MCNumber col_166() {
		return getConstNumber(offset + 225, $col_166);
	}

	public void col_166(MCNumber value) {
		setConstNumber(offset + 225, $col_166, value);
	}

	public void col_166(int value) {
		setConstNumber(offset + 225, $col_166, value);
	}

	public void col_166(long value) {
		setConstNumber(offset + 225, $col_166, value);
	}

	public void col_166(float value) {
		setConstNumber(offset + 225, $col_166, value);
	}

	public void col_166(double value) {
		setConstNumber(offset + 225, $col_166, value);
	}


	public MCNumber col_167() {
		return getConstNumber(offset + 226, $col_167);
	}

	public void col_167(MCNumber value) {
		setConstNumber(offset + 226, $col_167, value);
	}

	public void col_167(int value) {
		setConstNumber(offset + 226, $col_167, value);
	}

	public void col_167(long value) {
		setConstNumber(offset + 226, $col_167, value);
	}

	public void col_167(float value) {
		setConstNumber(offset + 226, $col_167, value);
	}

	public void col_167(double value) {
		setConstNumber(offset + 226, $col_167, value);
	}


	public MCNumber col_168() {
		return getConstNumber(offset + 227, $col_168);
	}

	public void col_168(MCNumber value) {
		setConstNumber(offset + 227, $col_168, value);
	}

	public void col_168(int value) {
		setConstNumber(offset + 227, $col_168, value);
	}

	public void col_168(long value) {
		setConstNumber(offset + 227, $col_168, value);
	}

	public void col_168(float value) {
		setConstNumber(offset + 227, $col_168, value);
	}

	public void col_168(double value) {
		setConstNumber(offset + 227, $col_168, value);
	}


	public MCNumber col_169() {
		return getConstNumber(offset + 228, $col_169);
	}

	public void col_169(MCNumber value) {
		setConstNumber(offset + 228, $col_169, value);
	}

	public void col_169(int value) {
		setConstNumber(offset + 228, $col_169, value);
	}

	public void col_169(long value) {
		setConstNumber(offset + 228, $col_169, value);
	}

	public void col_169(float value) {
		setConstNumber(offset + 228, $col_169, value);
	}

	public void col_169(double value) {
		setConstNumber(offset + 228, $col_169, value);
	}


	public MCNumber col_170() {
		return getConstNumber(offset + 229, $col_170);
	}

	public void col_170(MCNumber value) {
		setConstNumber(offset + 229, $col_170, value);
	}

	public void col_170(int value) {
		setConstNumber(offset + 229, $col_170, value);
	}

	public void col_170(long value) {
		setConstNumber(offset + 229, $col_170, value);
	}

	public void col_170(float value) {
		setConstNumber(offset + 229, $col_170, value);
	}

	public void col_170(double value) {
		setConstNumber(offset + 229, $col_170, value);
	}


	public MCNumber col_171() {
		return getConstNumber(offset + 230, $col_171);
	}

	public void col_171(MCNumber value) {
		setConstNumber(offset + 230, $col_171, value);
	}

	public void col_171(int value) {
		setConstNumber(offset + 230, $col_171, value);
	}

	public void col_171(long value) {
		setConstNumber(offset + 230, $col_171, value);
	}

	public void col_171(float value) {
		setConstNumber(offset + 230, $col_171, value);
	}

	public void col_171(double value) {
		setConstNumber(offset + 230, $col_171, value);
	}


	public MCNumber col_172() {
		return getConstNumber(offset + 231, $col_172);
	}

	public void col_172(MCNumber value) {
		setConstNumber(offset + 231, $col_172, value);
	}

	public void col_172(int value) {
		setConstNumber(offset + 231, $col_172, value);
	}

	public void col_172(long value) {
		setConstNumber(offset + 231, $col_172, value);
	}

	public void col_172(float value) {
		setConstNumber(offset + 231, $col_172, value);
	}

	public void col_172(double value) {
		setConstNumber(offset + 231, $col_172, value);
	}


	public MCNumber col_173() {
		return getConstNumber(offset + 232, $col_173);
	}

	public void col_173(MCNumber value) {
		setConstNumber(offset + 232, $col_173, value);
	}

	public void col_173(int value) {
		setConstNumber(offset + 232, $col_173, value);
	}

	public void col_173(long value) {
		setConstNumber(offset + 232, $col_173, value);
	}

	public void col_173(float value) {
		setConstNumber(offset + 232, $col_173, value);
	}

	public void col_173(double value) {
		setConstNumber(offset + 232, $col_173, value);
	}


	public MCNumber col_174() {
		return getConstNumber(offset + 233, $col_174);
	}

	public void col_174(MCNumber value) {
		setConstNumber(offset + 233, $col_174, value);
	}

	public void col_174(int value) {
		setConstNumber(offset + 233, $col_174, value);
	}

	public void col_174(long value) {
		setConstNumber(offset + 233, $col_174, value);
	}

	public void col_174(float value) {
		setConstNumber(offset + 233, $col_174, value);
	}

	public void col_174(double value) {
		setConstNumber(offset + 233, $col_174, value);
	}


	public MCNumber col_175() {
		return getConstNumber(offset + 234, $col_175);
	}

	public void col_175(MCNumber value) {
		setConstNumber(offset + 234, $col_175, value);
	}

	public void col_175(int value) {
		setConstNumber(offset + 234, $col_175, value);
	}

	public void col_175(long value) {
		setConstNumber(offset + 234, $col_175, value);
	}

	public void col_175(float value) {
		setConstNumber(offset + 234, $col_175, value);
	}

	public void col_175(double value) {
		setConstNumber(offset + 234, $col_175, value);
	}


	public MCNumber col_176() {
		return getConstNumber(offset + 235, $col_176);
	}

	public void col_176(MCNumber value) {
		setConstNumber(offset + 235, $col_176, value);
	}

	public void col_176(int value) {
		setConstNumber(offset + 235, $col_176, value);
	}

	public void col_176(long value) {
		setConstNumber(offset + 235, $col_176, value);
	}

	public void col_176(float value) {
		setConstNumber(offset + 235, $col_176, value);
	}

	public void col_176(double value) {
		setConstNumber(offset + 235, $col_176, value);
	}


	public MCNumber col_177() {
		return getConstNumber(offset + 236, $col_177);
	}

	public void col_177(MCNumber value) {
		setConstNumber(offset + 236, $col_177, value);
	}

	public void col_177(int value) {
		setConstNumber(offset + 236, $col_177, value);
	}

	public void col_177(long value) {
		setConstNumber(offset + 236, $col_177, value);
	}

	public void col_177(float value) {
		setConstNumber(offset + 236, $col_177, value);
	}

	public void col_177(double value) {
		setConstNumber(offset + 236, $col_177, value);
	}


	public MCNumber col_178() {
		return getConstNumber(offset + 237, $col_178);
	}

	public void col_178(MCNumber value) {
		setConstNumber(offset + 237, $col_178, value);
	}

	public void col_178(int value) {
		setConstNumber(offset + 237, $col_178, value);
	}

	public void col_178(long value) {
		setConstNumber(offset + 237, $col_178, value);
	}

	public void col_178(float value) {
		setConstNumber(offset + 237, $col_178, value);
	}

	public void col_178(double value) {
		setConstNumber(offset + 237, $col_178, value);
	}


	public MCNumber col_179() {
		return getConstNumber(offset + 238, $col_179);
	}

	public void col_179(MCNumber value) {
		setConstNumber(offset + 238, $col_179, value);
	}

	public void col_179(int value) {
		setConstNumber(offset + 238, $col_179, value);
	}

	public void col_179(long value) {
		setConstNumber(offset + 238, $col_179, value);
	}

	public void col_179(float value) {
		setConstNumber(offset + 238, $col_179, value);
	}

	public void col_179(double value) {
		setConstNumber(offset + 238, $col_179, value);
	}


	public MCNumber col_180() {
		return getConstNumber(offset + 239, $col_180);
	}

	public void col_180(MCNumber value) {
		setConstNumber(offset + 239, $col_180, value);
	}

	public void col_180(int value) {
		setConstNumber(offset + 239, $col_180, value);
	}

	public void col_180(long value) {
		setConstNumber(offset + 239, $col_180, value);
	}

	public void col_180(float value) {
		setConstNumber(offset + 239, $col_180, value);
	}

	public void col_180(double value) {
		setConstNumber(offset + 239, $col_180, value);
	}


	public MCNumber col_181() {
		return getConstNumber(offset + 240, $col_181);
	}

	public void col_181(MCNumber value) {
		setConstNumber(offset + 240, $col_181, value);
	}

	public void col_181(int value) {
		setConstNumber(offset + 240, $col_181, value);
	}

	public void col_181(long value) {
		setConstNumber(offset + 240, $col_181, value);
	}

	public void col_181(float value) {
		setConstNumber(offset + 240, $col_181, value);
	}

	public void col_181(double value) {
		setConstNumber(offset + 240, $col_181, value);
	}


	public MCNumber col_182() {
		return getConstNumber(offset + 241, $col_182);
	}

	public void col_182(MCNumber value) {
		setConstNumber(offset + 241, $col_182, value);
	}

	public void col_182(int value) {
		setConstNumber(offset + 241, $col_182, value);
	}

	public void col_182(long value) {
		setConstNumber(offset + 241, $col_182, value);
	}

	public void col_182(float value) {
		setConstNumber(offset + 241, $col_182, value);
	}

	public void col_182(double value) {
		setConstNumber(offset + 241, $col_182, value);
	}


	public MCNumber col_183() {
		return getConstNumber(offset + 242, $col_183);
	}

	public void col_183(MCNumber value) {
		setConstNumber(offset + 242, $col_183, value);
	}

	public void col_183(int value) {
		setConstNumber(offset + 242, $col_183, value);
	}

	public void col_183(long value) {
		setConstNumber(offset + 242, $col_183, value);
	}

	public void col_183(float value) {
		setConstNumber(offset + 242, $col_183, value);
	}

	public void col_183(double value) {
		setConstNumber(offset + 242, $col_183, value);
	}


	public MCNumber col_184() {
		return getConstNumber(offset + 243, $col_184);
	}

	public void col_184(MCNumber value) {
		setConstNumber(offset + 243, $col_184, value);
	}

	public void col_184(int value) {
		setConstNumber(offset + 243, $col_184, value);
	}

	public void col_184(long value) {
		setConstNumber(offset + 243, $col_184, value);
	}

	public void col_184(float value) {
		setConstNumber(offset + 243, $col_184, value);
	}

	public void col_184(double value) {
		setConstNumber(offset + 243, $col_184, value);
	}


	public MCNumber col_185() {
		return getConstNumber(offset + 244, $col_185);
	}

	public void col_185(MCNumber value) {
		setConstNumber(offset + 244, $col_185, value);
	}

	public void col_185(int value) {
		setConstNumber(offset + 244, $col_185, value);
	}

	public void col_185(long value) {
		setConstNumber(offset + 244, $col_185, value);
	}

	public void col_185(float value) {
		setConstNumber(offset + 244, $col_185, value);
	}

	public void col_185(double value) {
		setConstNumber(offset + 244, $col_185, value);
	}


	public MCNumber col_186() {
		return getConstNumber(offset + 245, $col_186);
	}

	public void col_186(MCNumber value) {
		setConstNumber(offset + 245, $col_186, value);
	}

	public void col_186(int value) {
		setConstNumber(offset + 245, $col_186, value);
	}

	public void col_186(long value) {
		setConstNumber(offset + 245, $col_186, value);
	}

	public void col_186(float value) {
		setConstNumber(offset + 245, $col_186, value);
	}

	public void col_186(double value) {
		setConstNumber(offset + 245, $col_186, value);
	}


	public MCNumber col_187() {
		return getConstNumber(offset + 246, $col_187);
	}

	public void col_187(MCNumber value) {
		setConstNumber(offset + 246, $col_187, value);
	}

	public void col_187(int value) {
		setConstNumber(offset + 246, $col_187, value);
	}

	public void col_187(long value) {
		setConstNumber(offset + 246, $col_187, value);
	}

	public void col_187(float value) {
		setConstNumber(offset + 246, $col_187, value);
	}

	public void col_187(double value) {
		setConstNumber(offset + 246, $col_187, value);
	}


	public MCNumber col_188() {
		return getConstNumber(offset + 247, $col_188);
	}

	public void col_188(MCNumber value) {
		setConstNumber(offset + 247, $col_188, value);
	}

	public void col_188(int value) {
		setConstNumber(offset + 247, $col_188, value);
	}

	public void col_188(long value) {
		setConstNumber(offset + 247, $col_188, value);
	}

	public void col_188(float value) {
		setConstNumber(offset + 247, $col_188, value);
	}

	public void col_188(double value) {
		setConstNumber(offset + 247, $col_188, value);
	}


	public MCNumber col_189() {
		return getConstNumber(offset + 248, $col_189);
	}

	public void col_189(MCNumber value) {
		setConstNumber(offset + 248, $col_189, value);
	}

	public void col_189(int value) {
		setConstNumber(offset + 248, $col_189, value);
	}

	public void col_189(long value) {
		setConstNumber(offset + 248, $col_189, value);
	}

	public void col_189(float value) {
		setConstNumber(offset + 248, $col_189, value);
	}

	public void col_189(double value) {
		setConstNumber(offset + 248, $col_189, value);
	}


	public MCNumber col_190() {
		return getConstNumber(offset + 249, $col_190);
	}

	public void col_190(MCNumber value) {
		setConstNumber(offset + 249, $col_190, value);
	}

	public void col_190(int value) {
		setConstNumber(offset + 249, $col_190, value);
	}

	public void col_190(long value) {
		setConstNumber(offset + 249, $col_190, value);
	}

	public void col_190(float value) {
		setConstNumber(offset + 249, $col_190, value);
	}

	public void col_190(double value) {
		setConstNumber(offset + 249, $col_190, value);
	}


	public MCNumber col_191() {
		return getConstNumber(offset + 250, $col_191);
	}

	public void col_191(MCNumber value) {
		setConstNumber(offset + 250, $col_191, value);
	}

	public void col_191(int value) {
		setConstNumber(offset + 250, $col_191, value);
	}

	public void col_191(long value) {
		setConstNumber(offset + 250, $col_191, value);
	}

	public void col_191(float value) {
		setConstNumber(offset + 250, $col_191, value);
	}

	public void col_191(double value) {
		setConstNumber(offset + 250, $col_191, value);
	}


	public MCNumber col_192() {
		return getConstNumber(offset + 251, $col_192);
	}

	public void col_192(MCNumber value) {
		setConstNumber(offset + 251, $col_192, value);
	}

	public void col_192(int value) {
		setConstNumber(offset + 251, $col_192, value);
	}

	public void col_192(long value) {
		setConstNumber(offset + 251, $col_192, value);
	}

	public void col_192(float value) {
		setConstNumber(offset + 251, $col_192, value);
	}

	public void col_192(double value) {
		setConstNumber(offset + 251, $col_192, value);
	}


	public MCNumber col_193() {
		return getConstNumber(offset + 252, $col_193);
	}

	public void col_193(MCNumber value) {
		setConstNumber(offset + 252, $col_193, value);
	}

	public void col_193(int value) {
		setConstNumber(offset + 252, $col_193, value);
	}

	public void col_193(long value) {
		setConstNumber(offset + 252, $col_193, value);
	}

	public void col_193(float value) {
		setConstNumber(offset + 252, $col_193, value);
	}

	public void col_193(double value) {
		setConstNumber(offset + 252, $col_193, value);
	}


	public MCNumber col_194() {
		return getConstNumber(offset + 253, $col_194);
	}

	public void col_194(MCNumber value) {
		setConstNumber(offset + 253, $col_194, value);
	}

	public void col_194(int value) {
		setConstNumber(offset + 253, $col_194, value);
	}

	public void col_194(long value) {
		setConstNumber(offset + 253, $col_194, value);
	}

	public void col_194(float value) {
		setConstNumber(offset + 253, $col_194, value);
	}

	public void col_194(double value) {
		setConstNumber(offset + 253, $col_194, value);
	}


	public MCNumber col_195() {
		return getConstNumber(offset + 254, $col_195);
	}

	public void col_195(MCNumber value) {
		setConstNumber(offset + 254, $col_195, value);
	}

	public void col_195(int value) {
		setConstNumber(offset + 254, $col_195, value);
	}

	public void col_195(long value) {
		setConstNumber(offset + 254, $col_195, value);
	}

	public void col_195(float value) {
		setConstNumber(offset + 254, $col_195, value);
	}

	public void col_195(double value) {
		setConstNumber(offset + 254, $col_195, value);
	}


	public MCNumber col_196() {
		return getConstNumber(offset + 255, $col_196);
	}

	public void col_196(MCNumber value) {
		setConstNumber(offset + 255, $col_196, value);
	}

	public void col_196(int value) {
		setConstNumber(offset + 255, $col_196, value);
	}

	public void col_196(long value) {
		setConstNumber(offset + 255, $col_196, value);
	}

	public void col_196(float value) {
		setConstNumber(offset + 255, $col_196, value);
	}

	public void col_196(double value) {
		setConstNumber(offset + 255, $col_196, value);
	}


	public MCNumber col_197() {
		return getConstNumber(offset + 256, $col_197);
	}

	public void col_197(MCNumber value) {
		setConstNumber(offset + 256, $col_197, value);
	}

	public void col_197(int value) {
		setConstNumber(offset + 256, $col_197, value);
	}

	public void col_197(long value) {
		setConstNumber(offset + 256, $col_197, value);
	}

	public void col_197(float value) {
		setConstNumber(offset + 256, $col_197, value);
	}

	public void col_197(double value) {
		setConstNumber(offset + 256, $col_197, value);
	}


	public MCNumber col_198() {
		return getConstNumber(offset + 257, $col_198);
	}

	public void col_198(MCNumber value) {
		setConstNumber(offset + 257, $col_198, value);
	}

	public void col_198(int value) {
		setConstNumber(offset + 257, $col_198, value);
	}

	public void col_198(long value) {
		setConstNumber(offset + 257, $col_198, value);
	}

	public void col_198(float value) {
		setConstNumber(offset + 257, $col_198, value);
	}

	public void col_198(double value) {
		setConstNumber(offset + 257, $col_198, value);
	}


	public MCNumber col_199() {
		return getConstNumber(offset + 258, $col_199);
	}

	public void col_199(MCNumber value) {
		setConstNumber(offset + 258, $col_199, value);
	}

	public void col_199(int value) {
		setConstNumber(offset + 258, $col_199, value);
	}

	public void col_199(long value) {
		setConstNumber(offset + 258, $col_199, value);
	}

	public void col_199(float value) {
		setConstNumber(offset + 258, $col_199, value);
	}

	public void col_199(double value) {
		setConstNumber(offset + 258, $col_199, value);
	}


	public String getString(String name) {
		if ($dummy_site.equalsIgnoreCase(name)) {
			return dummy_site();
		}
		if ($dummy_sppl_cntry.equalsIgnoreCase(name)) {
			return dummy_sppl_cntry();
		}
		if ($dummy_sppl_area.equalsIgnoreCase(name)) {
			return dummy_sppl_area();
		}
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			return dummy_itm_grp1();
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			return dummy_itm_grp2();
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			return dummy_itm_grp3();
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			return dummy_itm_grp4();
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			return dummy_itm_grp5();
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			return dummy_itm_grp6();
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			return dummy_itm_grp7();
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			return dummy_itm_grp8();
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			return dummy_itm_grp9();
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			return dummy_itm_grp10();
		}
		if ($dummy_sppl_grp1.equalsIgnoreCase(name)) {
			return dummy_sppl_grp1();
		}
		if ($dummy_sppl_grp2.equalsIgnoreCase(name)) {
			return dummy_sppl_grp2();
		}
		if ($dummy_sppl_grp3.equalsIgnoreCase(name)) {
			return dummy_sppl_grp3();
		}
		if ($dummy_sppl_grp4.equalsIgnoreCase(name)) {
			return dummy_sppl_grp4();
		}
		if ($dummy_sppl_grp5.equalsIgnoreCase(name)) {
			return dummy_sppl_grp5();
		}
		if ($dummy_sppl_grp6.equalsIgnoreCase(name)) {
			return dummy_sppl_grp6();
		}
		if ($dummy_sppl_grp7.equalsIgnoreCase(name)) {
			return dummy_sppl_grp7();
		}
		if ($dummy_sppl_grp8.equalsIgnoreCase(name)) {
			return dummy_sppl_grp8();
		}
		if ($dummy_sppl_grp9.equalsIgnoreCase(name)) {
			return dummy_sppl_grp9();
		}
		if ($dummy_sppl_grp10.equalsIgnoreCase(name)) {
			return dummy_sppl_grp10();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
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
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($qty_unit.equalsIgnoreCase(name)) {
			return qty_unit();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
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
		if ($ttl_unit.equalsIgnoreCase(name)) {
			return ttl_unit();
		}
		if ($var_cost_unit.equalsIgnoreCase(name)) {
			return var_cost_unit();
		}
		if ($fxd_cost_unit.equalsIgnoreCase(name)) {
			return fxd_cost_unit();
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
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($dummy_parent_flg.equalsIgnoreCase(name)) {
			return dummy_parent_flg();
		}
		if ($dummy_child_flg.equalsIgnoreCase(name)) {
			return dummy_child_flg();
		}
		if ($dummy_having_flg1.equalsIgnoreCase(name)) {
			return dummy_having_flg1();
		}
		if ($dummy_having_flg2.equalsIgnoreCase(name)) {
			return dummy_having_flg2();
		}
		if ($dummy_having_flg3.equalsIgnoreCase(name)) {
			return dummy_having_flg3();
		}
		if ($dummy_having_flg4.equalsIgnoreCase(name)) {
			return dummy_having_flg4();
		}
		if ($dummy_having_flg5.equalsIgnoreCase(name)) {
			return dummy_having_flg5();
		}
		if ($dummy_having_flg6.equalsIgnoreCase(name)) {
			return dummy_having_flg6();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dummy_site.equalsIgnoreCase(name)) {
			return dummy_site();
		}
		if ($dummy_sppl_cntry.equalsIgnoreCase(name)) {
			return dummy_sppl_cntry();
		}
		if ($dummy_sppl_area.equalsIgnoreCase(name)) {
			return dummy_sppl_area();
		}
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			return dummy_itm_grp1();
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			return dummy_itm_grp2();
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			return dummy_itm_grp3();
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			return dummy_itm_grp4();
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			return dummy_itm_grp5();
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			return dummy_itm_grp6();
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			return dummy_itm_grp7();
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			return dummy_itm_grp8();
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			return dummy_itm_grp9();
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			return dummy_itm_grp10();
		}
		if ($dummy_sppl_grp1.equalsIgnoreCase(name)) {
			return dummy_sppl_grp1();
		}
		if ($dummy_sppl_grp2.equalsIgnoreCase(name)) {
			return dummy_sppl_grp2();
		}
		if ($dummy_sppl_grp3.equalsIgnoreCase(name)) {
			return dummy_sppl_grp3();
		}
		if ($dummy_sppl_grp4.equalsIgnoreCase(name)) {
			return dummy_sppl_grp4();
		}
		if ($dummy_sppl_grp5.equalsIgnoreCase(name)) {
			return dummy_sppl_grp5();
		}
		if ($dummy_sppl_grp6.equalsIgnoreCase(name)) {
			return dummy_sppl_grp6();
		}
		if ($dummy_sppl_grp7.equalsIgnoreCase(name)) {
			return dummy_sppl_grp7();
		}
		if ($dummy_sppl_grp8.equalsIgnoreCase(name)) {
			return dummy_sppl_grp8();
		}
		if ($dummy_sppl_grp9.equalsIgnoreCase(name)) {
			return dummy_sppl_grp9();
		}
		if ($dummy_sppl_grp10.equalsIgnoreCase(name)) {
			return dummy_sppl_grp10();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
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
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($qty_unit.equalsIgnoreCase(name)) {
			return qty_unit();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
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
		if ($ttl_unit.equalsIgnoreCase(name)) {
			return ttl_unit();
		}
		if ($var_cost_unit.equalsIgnoreCase(name)) {
			return var_cost_unit();
		}
		if ($fxd_cost_unit.equalsIgnoreCase(name)) {
			return fxd_cost_unit();
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
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($dummy_parent_flg.equalsIgnoreCase(name)) {
			return dummy_parent_flg();
		}
		if ($dummy_child_flg.equalsIgnoreCase(name)) {
			return dummy_child_flg();
		}
		if ($dummy_having_flg1.equalsIgnoreCase(name)) {
			return dummy_having_flg1();
		}
		if ($dummy_having_flg2.equalsIgnoreCase(name)) {
			return dummy_having_flg2();
		}
		if ($dummy_having_flg3.equalsIgnoreCase(name)) {
			return dummy_having_flg3();
		}
		if ($dummy_having_flg4.equalsIgnoreCase(name)) {
			return dummy_having_flg4();
		}
		if ($dummy_having_flg5.equalsIgnoreCase(name)) {
			return dummy_having_flg5();
		}
		if ($dummy_having_flg6.equalsIgnoreCase(name)) {
			return dummy_having_flg6();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dummy_site.equalsIgnoreCase(name)) {
			dummy_site(value);
			return;
		}
		if ($dummy_sppl_cntry.equalsIgnoreCase(name)) {
			dummy_sppl_cntry(value);
			return;
		}
		if ($dummy_sppl_area.equalsIgnoreCase(name)) {
			dummy_sppl_area(value);
			return;
		}
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			dummy_itm_grp1(value);
			return;
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			dummy_itm_grp2(value);
			return;
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			dummy_itm_grp3(value);
			return;
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			dummy_itm_grp4(value);
			return;
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			dummy_itm_grp5(value);
			return;
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			dummy_itm_grp6(value);
			return;
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			dummy_itm_grp7(value);
			return;
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			dummy_itm_grp8(value);
			return;
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			dummy_itm_grp9(value);
			return;
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			dummy_itm_grp10(value);
			return;
		}
		if ($dummy_sppl_grp1.equalsIgnoreCase(name)) {
			dummy_sppl_grp1(value);
			return;
		}
		if ($dummy_sppl_grp2.equalsIgnoreCase(name)) {
			dummy_sppl_grp2(value);
			return;
		}
		if ($dummy_sppl_grp3.equalsIgnoreCase(name)) {
			dummy_sppl_grp3(value);
			return;
		}
		if ($dummy_sppl_grp4.equalsIgnoreCase(name)) {
			dummy_sppl_grp4(value);
			return;
		}
		if ($dummy_sppl_grp5.equalsIgnoreCase(name)) {
			dummy_sppl_grp5(value);
			return;
		}
		if ($dummy_sppl_grp6.equalsIgnoreCase(name)) {
			dummy_sppl_grp6(value);
			return;
		}
		if ($dummy_sppl_grp7.equalsIgnoreCase(name)) {
			dummy_sppl_grp7(value);
			return;
		}
		if ($dummy_sppl_grp8.equalsIgnoreCase(name)) {
			dummy_sppl_grp8(value);
			return;
		}
		if ($dummy_sppl_grp9.equalsIgnoreCase(name)) {
			dummy_sppl_grp9(value);
			return;
		}
		if ($dummy_sppl_grp10.equalsIgnoreCase(name)) {
			dummy_sppl_grp10(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
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
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($qty_unit.equalsIgnoreCase(name)) {
			qty_unit(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($ttl_unit.equalsIgnoreCase(name)) {
			ttl_unit(value);
			return;
		}
		if ($var_cost_unit.equalsIgnoreCase(name)) {
			var_cost_unit(value);
			return;
		}
		if ($fxd_cost_unit.equalsIgnoreCase(name)) {
			fxd_cost_unit(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($qty_unit.equalsIgnoreCase(name)) {
			qty_unit(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($ttl_unit.equalsIgnoreCase(name)) {
			ttl_unit(value);
			return;
		}
		if ($var_cost_unit.equalsIgnoreCase(name)) {
			var_cost_unit(value);
			return;
		}
		if ($fxd_cost_unit.equalsIgnoreCase(name)) {
			fxd_cost_unit(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($qty_unit.equalsIgnoreCase(name)) {
			qty_unit(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($ttl_unit.equalsIgnoreCase(name)) {
			ttl_unit(value);
			return;
		}
		if ($var_cost_unit.equalsIgnoreCase(name)) {
			var_cost_unit(value);
			return;
		}
		if ($fxd_cost_unit.equalsIgnoreCase(name)) {
			fxd_cost_unit(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($qty_unit.equalsIgnoreCase(name)) {
			qty_unit(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($ttl_unit.equalsIgnoreCase(name)) {
			ttl_unit(value);
			return;
		}
		if ($var_cost_unit.equalsIgnoreCase(name)) {
			var_cost_unit(value);
			return;
		}
		if ($fxd_cost_unit.equalsIgnoreCase(name)) {
			fxd_cost_unit(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($qty_unit.equalsIgnoreCase(name)) {
			qty_unit(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($ttl_unit.equalsIgnoreCase(name)) {
			ttl_unit(value);
			return;
		}
		if ($var_cost_unit.equalsIgnoreCase(name)) {
			var_cost_unit(value);
			return;
		}
		if ($fxd_cost_unit.equalsIgnoreCase(name)) {
			fxd_cost_unit(value);
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
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($dummy_parent_flg.equalsIgnoreCase(name)) {
			dummy_parent_flg(value);
			return;
		}
		if ($dummy_child_flg.equalsIgnoreCase(name)) {
			dummy_child_flg(value);
			return;
		}
		if ($dummy_having_flg1.equalsIgnoreCase(name)) {
			dummy_having_flg1(value);
			return;
		}
		if ($dummy_having_flg2.equalsIgnoreCase(name)) {
			dummy_having_flg2(value);
			return;
		}
		if ($dummy_having_flg3.equalsIgnoreCase(name)) {
			dummy_having_flg3(value);
			return;
		}
		if ($dummy_having_flg4.equalsIgnoreCase(name)) {
			dummy_having_flg4(value);
			return;
		}
		if ($dummy_having_flg5.equalsIgnoreCase(name)) {
			dummy_having_flg5(value);
			return;
		}
		if ($dummy_having_flg6.equalsIgnoreCase(name)) {
			dummy_having_flg6(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dummy_site.equalsIgnoreCase(name)) {
			dummy_site(value);
			return;
		}
		if ($dummy_sppl_cntry.equalsIgnoreCase(name)) {
			dummy_sppl_cntry(value);
			return;
		}
		if ($dummy_sppl_area.equalsIgnoreCase(name)) {
			dummy_sppl_area(value);
			return;
		}
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			dummy_itm_grp1(value);
			return;
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			dummy_itm_grp2(value);
			return;
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			dummy_itm_grp3(value);
			return;
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			dummy_itm_grp4(value);
			return;
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			dummy_itm_grp5(value);
			return;
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			dummy_itm_grp6(value);
			return;
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			dummy_itm_grp7(value);
			return;
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			dummy_itm_grp8(value);
			return;
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			dummy_itm_grp9(value);
			return;
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			dummy_itm_grp10(value);
			return;
		}
		if ($dummy_sppl_grp1.equalsIgnoreCase(name)) {
			dummy_sppl_grp1(value);
			return;
		}
		if ($dummy_sppl_grp2.equalsIgnoreCase(name)) {
			dummy_sppl_grp2(value);
			return;
		}
		if ($dummy_sppl_grp3.equalsIgnoreCase(name)) {
			dummy_sppl_grp3(value);
			return;
		}
		if ($dummy_sppl_grp4.equalsIgnoreCase(name)) {
			dummy_sppl_grp4(value);
			return;
		}
		if ($dummy_sppl_grp5.equalsIgnoreCase(name)) {
			dummy_sppl_grp5(value);
			return;
		}
		if ($dummy_sppl_grp6.equalsIgnoreCase(name)) {
			dummy_sppl_grp6(value);
			return;
		}
		if ($dummy_sppl_grp7.equalsIgnoreCase(name)) {
			dummy_sppl_grp7(value);
			return;
		}
		if ($dummy_sppl_grp8.equalsIgnoreCase(name)) {
			dummy_sppl_grp8(value);
			return;
		}
		if ($dummy_sppl_grp9.equalsIgnoreCase(name)) {
			dummy_sppl_grp9(value);
			return;
		}
		if ($dummy_sppl_grp10.equalsIgnoreCase(name)) {
			dummy_sppl_grp10(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
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
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($qty_unit.equalsIgnoreCase(name)) {
			qty_unit(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($ttl_unit.equalsIgnoreCase(name)) {
			ttl_unit(value);
			return;
		}
		if ($var_cost_unit.equalsIgnoreCase(name)) {
			var_cost_unit(value);
			return;
		}
		if ($fxd_cost_unit.equalsIgnoreCase(name)) {
			fxd_cost_unit(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($qty_unit.equalsIgnoreCase(name)) {
			qty_unit(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($ttl_unit.equalsIgnoreCase(name)) {
			ttl_unit(value);
			return;
		}
		if ($var_cost_unit.equalsIgnoreCase(name)) {
			var_cost_unit(value);
			return;
		}
		if ($fxd_cost_unit.equalsIgnoreCase(name)) {
			fxd_cost_unit(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($qty_unit.equalsIgnoreCase(name)) {
			qty_unit(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($ttl_unit.equalsIgnoreCase(name)) {
			ttl_unit(value);
			return;
		}
		if ($var_cost_unit.equalsIgnoreCase(name)) {
			var_cost_unit(value);
			return;
		}
		if ($fxd_cost_unit.equalsIgnoreCase(name)) {
			fxd_cost_unit(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($qty_unit.equalsIgnoreCase(name)) {
			qty_unit(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($ttl_unit.equalsIgnoreCase(name)) {
			ttl_unit(value);
			return;
		}
		if ($var_cost_unit.equalsIgnoreCase(name)) {
			var_cost_unit(value);
			return;
		}
		if ($fxd_cost_unit.equalsIgnoreCase(name)) {
			fxd_cost_unit(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($qty_unit.equalsIgnoreCase(name)) {
			qty_unit(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
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
		if ($ttl_unit.equalsIgnoreCase(name)) {
			ttl_unit(value);
			return;
		}
		if ($var_cost_unit.equalsIgnoreCase(name)) {
			var_cost_unit(value);
			return;
		}
		if ($fxd_cost_unit.equalsIgnoreCase(name)) {
			fxd_cost_unit(value);
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
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($dummy_parent_flg.equalsIgnoreCase(name)) {
			dummy_parent_flg(value);
			return;
		}
		if ($dummy_child_flg.equalsIgnoreCase(name)) {
			dummy_child_flg(value);
			return;
		}
		if ($dummy_having_flg1.equalsIgnoreCase(name)) {
			dummy_having_flg1(value);
			return;
		}
		if ($dummy_having_flg2.equalsIgnoreCase(name)) {
			dummy_having_flg2(value);
			return;
		}
		if ($dummy_having_flg3.equalsIgnoreCase(name)) {
			dummy_having_flg3(value);
			return;
		}
		if ($dummy_having_flg4.equalsIgnoreCase(name)) {
			dummy_having_flg4(value);
			return;
		}
		if ($dummy_having_flg5.equalsIgnoreCase(name)) {
			dummy_having_flg5(value);
			return;
		}
		if ($dummy_having_flg6.equalsIgnoreCase(name)) {
			dummy_having_flg6(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

